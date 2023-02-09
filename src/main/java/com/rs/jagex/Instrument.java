package com.rs.jagex;

import java.util.Arrays;
import java.util.Random;

public class Instrument {

	static int[] noise = new int[32768];
	static int[] sine;
	static int[] output;
	static int[] phases;
	static int[] delays;
	static int[] volumeStep;
	static int[] pitchStep;
	static int[] pitchBaseStep;

	static {
		Random rand = new Random(0L);

		for (int i = 0; i < 32768; i++)
			noise[i] = (rand.nextInt() & 0x2) - 1;

		sine = new int[32768];

		for (int i = 0; i < 32768; i++)
			sine[i] = (int) (Math.sin(i / 5215.1903D) * 16384.0D);

		output = new int[220500];
		phases = new int[5];
		delays = new int[5];
		volumeStep = new int[5];
		pitchStep = new int[5];
		pitchBaseStep = new int[5];
	}

	Envelope pitch;
	Envelope volume;
	Envelope pitchModifier;
	Envelope pitchModifierAmplitude;
	Envelope volumeMultiplier;
	Envelope volumeAmplitude;
	Envelope release;
	Envelope attack;
	int delayTime;
	int delayDecay = 100;
	int duration = 500;
	int offset;
	Filter filter;
	Envelope filterEnvelope;
	int[] oscillatorVolume = new int[5];
	int[] oscillatorPitch = new int[5];
	int[] oscillatorDelays = new int[5];

	void decodeInstruments(ByteBuf buffer) {
		pitch = new Envelope();
		pitch.decode(buffer);
		volume = new Envelope();
		volume.decode(buffer);
		int option = buffer.readUnsignedByte();
		if (option != 0) {
			--buffer.index;
			pitchModifier = new Envelope();
			pitchModifier.decode(buffer);
			pitchModifierAmplitude = new Envelope();
			pitchModifierAmplitude.decode(buffer);
		}

		option = buffer.readUnsignedByte();
		if (option != 0) {
			--buffer.index;
			volumeMultiplier = new Envelope();
			volumeMultiplier.decode(buffer);
			volumeAmplitude = new Envelope();
			volumeAmplitude.decode(buffer);
		}

		option = buffer.readUnsignedByte();
		if (option != 0) {
			--buffer.index;
			release = new Envelope();
			release.decode(buffer);
			attack = new Envelope();
			attack.decode(buffer);
		}

		for (int i = 0; i < 10; i++) {
			int volume = buffer.readSmart();
			if (volume == 0)
				break;

			oscillatorVolume[i] = volume;
			oscillatorPitch[i] = buffer.readUnsignedSmart();
			oscillatorDelays[i] = buffer.readSmart();
		}

		delayTime = buffer.readSmart();
		delayDecay = buffer.readSmart();
		duration = buffer.readUnsignedShort();
		offset = buffer.readUnsignedShort();
		filter = new Filter();
		filterEnvelope = new Envelope();
		filter.decode(buffer, filterEnvelope);
	}

	int evaluateWave(int table, int phase, int amplitude) {
		return amplitude == 1 ? ((table & 0x7fff) < 16384 ? phase : -phase) : (amplitude == 2 ? sine[table & 0x7fff] * phase >> 14 : (amplitude == 3 ? (phase * (table & 0x7fff) >> 14) - phase : (amplitude == 4 ? phase * noise[table / 2607 & 0x7fff] : 0)));
	}

	int[] synthesize(int mixDuration, int instrDuration) {
		Arrays.fill(output, 0, mixDuration, 0);
		if (instrDuration >= 10) {
			double fs = mixDuration / (instrDuration + 0.0D);
			pitch.reset();
			volume.reset();
			int pitchModStep = 0;
			int pitchModBaseStep = 0;
			int pitchModPhase = 0;
			if (pitchModifier != null) {
				pitchModifier.reset();
				pitchModifierAmplitude.reset();
				pitchModStep = (int) ((pitchModifier.end - pitchModifier.start) * 32.768D / fs);
				pitchModBaseStep = (int) (pitchModifier.start * 32.768D / fs);
			}

			int volumeModStep = 0;
			int volumeModBaseStep = 0;
			int volumeModPhase = 0;
			if (volumeMultiplier != null) {
				volumeMultiplier.reset();
				volumeAmplitude.reset();
				volumeModStep = (int) ((volumeMultiplier.end - volumeMultiplier.start) * 32.768D / fs);
				volumeModBaseStep = (int) (volumeMultiplier.start * 32.768D / fs);
			}

			for (int i = 0; i < 5; i++)
				if (oscillatorVolume[i] != 0) {
					phases[i] = 0;
					delays[i] = (int) (oscillatorDelays[i] * fs);
					volumeStep[i] = (oscillatorVolume[i] << 14) / 100;
					pitchStep[i] = (int) ((pitch.end - pitch.start) * 32.768D * Math.pow(1.0057929410678534D, oscillatorPitch[i]) / fs);
					pitchBaseStep[i] = (int) (pitch.start * 32.768D / fs);
				}

			for (int i = 0; i < mixDuration; i++) {
				int pitchChange = pitch.step(mixDuration);
				int volumeChange = volume.step(mixDuration);
				if (pitchModifier != null) {
					int mod = pitchModifier.step(mixDuration);
					int modAmplitude = pitchModifierAmplitude.step(mixDuration);
					pitchChange += evaluateWave(pitchModPhase, modAmplitude, pitchModifier.form) >> 1;
			pitchModPhase += pitchModBaseStep + (mod * pitchModStep >> 16);
				}

				if (volumeMultiplier != null) {
					int mod = volumeMultiplier.step(mixDuration);
					int modAmplitude = volumeAmplitude.step(mixDuration);
					volumeChange = volumeChange * ((evaluateWave(volumeModPhase, modAmplitude, volumeMultiplier.form) >> 1) + 32768) >> 15;
					volumeModPhase += volumeModBaseStep + (mod * volumeModStep >> 16);
				}

				for (int j = 0; j < 5; j++)
					if (oscillatorVolume[j] != 0) {
						int i_15 = delays[j] + i;
						if (i_15 < mixDuration) {
							output[i_15] += evaluateWave(phases[j], volumeChange * volumeStep[j] >> 15, pitch.form);
							phases[j] += (pitchChange * pitchStep[j] >> 16) + pitchBaseStep[j];
						}
					}
			}

			if (release != null) {
				release.reset();
				attack.reset();
				int counter = 0;
				boolean muted = true;

				for (int i = 0; i < mixDuration; i++) {
					int onStep = release.step(mixDuration);
					int offStep = attack.step(mixDuration);
					int threshold;
					if (muted)
						threshold = (onStep * (release.end - release.start) >> 8) + release.start;
					else
						threshold = (offStep * (release.end - release.start) >> 8) + release.start;

					counter += 256;
					if (counter >= threshold) {
						counter = 0;
						muted = !muted;
					}

					if (muted)
						output[i] = 0;
				}
			}

			if (delayTime > 0 && delayDecay > 0) {
				int delay = (int) (delayTime * fs);

				for (int i = delay; i < mixDuration; i++)
					output[i] += output[i - delay] * delayDecay / 100;
			}

			if (filter.numPairs[0] > 0 || filter.numPairs[1] > 0) {
				filterEnvelope.reset();
				int t = filterEnvelope.step(mixDuration + 1);
				int M = filter.compute(0, t / 65536.0F);
				int N = filter.compute(1, t / 65536.0F);
				if (mixDuration >= M + N) {
					int n = 0;
					int delay = N;
					if (N > mixDuration - M)
						delay = mixDuration - M;

					while (n < delay) {
						int y = (int) ((long) output[n + M] * Filter.invUnity_int >> 16);

						for (int i_17 = 0; i_17 < M; i_17++)
							y += (int) ((long) output[n + M - 1 - i_17] * Filter.coefficient_int[0][i_17] >> 16);

						for (int i_17 = 0; i_17 < n; i_17++)
							y -= (int) ((long) output[n - 1 - i_17] * Filter.coefficient_int[1][i_17] >> 16);

						output[n] = y;
						t = filterEnvelope.step(mixDuration + 1);
						++n;
					}

					delay = 128;

					while (true) {
						if (delay > mixDuration - M)
							delay = mixDuration - M;

						while (n < delay) {
							int y = (int) ((long) output[n + M] * Filter.invUnity_int >> 16);

							for (int i = 0; i < M; i++)
								y += (int) ((long) output[n + M - 1 - i] * Filter.coefficient_int[0][i] >> 16);

							for (int i = 0; i < N; i++)
								y -= (int) ((long) output[n - 1 - i] * Filter.coefficient_int[1][i] >> 16);

							output[n] = y;
							t = filterEnvelope.step(mixDuration + 1);
							++n;
						}

						if (n >= mixDuration - M) {
							while (n < mixDuration) {
								int y = 0;

								for (int i = n + M - mixDuration; i < M; i++)
									y += (int) ((long) output[n + M - 1 - i] * Filter.coefficient_int[0][i] >> 16);

								for (int i = 0; i < N; i++)
									y -= (int) ((long) output[n - 1 - i] * Filter.coefficient_int[1][i] >> 16);

								output[n] = y;
								filterEnvelope.step(mixDuration + 1);
								++n;
							}
							break;
						}

						M = filter.compute(0, t / 65536.0F);
						N = filter.compute(1, t / 65536.0F);
						delay += 128;
					}
				}
			}

			for (int i = 0; i < mixDuration; i++) {
				if (output[i] < -32768)
					output[i] = -32768;

				if (output[i] > 32767)
					output[i] = 32767;
			}

		}
		return output;
	}

}
