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
	Envelope pitch;
	Envelope volume;
	Envelope pitchModifier;
	Envelope pitchModifierAmplitude;
	Envelope volumeMultiplier;
	Envelope volumeAmplitude;
	Envelope release;
	Envelope attack;
	int delayTime = 0;
	int delayDecay = 100;
	int duration = 500;
	int offset = 0;
	Filter filter;
	Envelope filterEnvelope;
	int[] oscillatorVolume = new int[5];
	int[] oscillatorPitch = new int[5];
	int[] oscillatorDelays = new int[5];

	static {
		Random rand = new Random(0L);

		for (int i = 0; i < 32768; i++) {
			noise[i] = (rand.nextInt() & 0x2) - 1;
		}

		sine = new int[32768];

		for (int i = 0; i < 32768; i++) {
			sine[i] = (int) (Math.sin((double) i / 5215.1903D) * 16384.0D);
		}

		output = new int[220500];
		phases = new int[5];
		delays = new int[5];
		volumeStep = new int[5];
		pitchStep = new int[5];
		pitchBaseStep = new int[5];
	}

	final int[] synthesize(int mixDuration, int instrDuration) {
		Arrays.fill(output, 0, mixDuration, 0);
		if (instrDuration < 10) {
			return output;
		} else {
			double fs = (double) mixDuration / ((double) instrDuration + 0.0D);
			this.pitch.reset();
			this.volume.reset();
			int pitchModStep = 0;
			int pitchModBaseStep = 0;
			int pitchModPhase = 0;
			if (this.pitchModifier != null) {
				this.pitchModifier.reset();
				this.pitchModifierAmplitude.reset();
				pitchModStep = (int) ((double) (this.pitchModifier.end - this.pitchModifier.start) * 32.768D / fs);
				pitchModBaseStep = (int) ((double) this.pitchModifier.start * 32.768D / fs);
			}

			int volumeModStep = 0;
			int volumeModBaseStep = 0;
			int volumeModPhase = 0;
			if (this.volumeMultiplier != null) {
				this.volumeMultiplier.reset();
				this.volumeAmplitude.reset();
				volumeModStep = (int) ((double) (this.volumeMultiplier.end - this.volumeMultiplier.start) * 32.768D / fs);
				volumeModBaseStep = (int) ((double) this.volumeMultiplier.start * 32.768D / fs);
			}

			for (int i = 0; i < 5; i++) {
				if (this.oscillatorVolume[i] != 0) {
					phases[i] = 0;
					delays[i] = (int) ((double) this.oscillatorDelays[i] * fs);
					volumeStep[i] = (this.oscillatorVolume[i] << 14) / 100;
					pitchStep[i] = (int) ((double) (this.pitch.end - this.pitch.start) * 32.768D * Math.pow(1.0057929410678534D, (double) this.oscillatorPitch[i]) / fs);
					pitchBaseStep[i] = (int) ((double) this.pitch.start * 32.768D / fs);
				}
			}

			for (int i = 0; i < mixDuration; i++) {
				int pitchChange = this.pitch.step(mixDuration);
				int volumeChange = this.volume.step(mixDuration);
				if (this.pitchModifier != null) {
					int mod = this.pitchModifier.step(mixDuration);
					int modAmplitude = this.pitchModifierAmplitude.step(mixDuration);
					pitchChange += this.evaluateWave(pitchModPhase, modAmplitude, this.pitchModifier.form) >> 1;
					pitchModPhase = pitchModPhase + pitchModBaseStep + (mod * pitchModStep >> 16);
				}

				if (this.volumeMultiplier != null) {
					int mod = this.volumeMultiplier.step(mixDuration);
					int modAmplitude = this.volumeAmplitude.step(mixDuration);
					volumeChange = volumeChange * ((this.evaluateWave(volumeModPhase, modAmplitude, this.volumeMultiplier.form) >> 1) + 32768) >> 15;
					volumeModPhase = volumeModPhase + volumeModBaseStep + (mod * volumeModStep >> 16);
				}

				for (int j = 0; j < 5; j++) {
					if (this.oscillatorVolume[j] != 0) {
						int i_15 = delays[j] + i;
						if (i_15 < mixDuration) {
							output[i_15] += this.evaluateWave(phases[j], volumeChange * volumeStep[j] >> 15, this.pitch.form);
							phases[j] += (pitchChange * pitchStep[j] >> 16) + pitchBaseStep[j];
						}
					}
				}
			}

			if (this.release != null) {
				this.release.reset();
				this.attack.reset();
				int counter = 0;
				boolean muted = true;

				for (int i = 0; i < mixDuration; i++) {
					int onStep = this.release.step(mixDuration);
					int offStep = this.attack.step(mixDuration);
					int threshold;
					if (muted) {
						threshold = (onStep * (this.release.end - this.release.start) >> 8) + this.release.start;
					} else {
						threshold = (offStep * (this.release.end - this.release.start) >> 8) + this.release.start;
					}

					counter += 256;
					if (counter >= threshold) {
						counter = 0;
						muted = !muted;
					}

					if (muted) {
						output[i] = 0;
					}
				}
			}

			if (this.delayTime > 0 && this.delayDecay > 0) {
				int delay = (int) ((double) this.delayTime * fs);

				for (int i = delay; i < mixDuration; i++) {
					output[i] += output[i - delay] * this.delayDecay / 100;
				}
			}

			if (this.filter.numPairs[0] > 0 || this.filter.numPairs[1] > 0) {
				this.filterEnvelope.reset();
				int t = this.filterEnvelope.step(mixDuration + 1);
				int M = this.filter.compute(0, (float) t / 65536.0F);
				int N = this.filter.compute(1, (float) t / 65536.0F);
				if (mixDuration >= M + N) {
					int n = 0;
					int delay = N;
					if (N > mixDuration - M) {
						delay = mixDuration - M;
					}

					while (n < delay) {
						int y = (int) ((long) output[n + M] * (long) Filter.invUnity_int >> 16);

						for (int i_17 = 0; i_17 < M; i_17++) {
							y += (int) ((long) output[n + M - 1 - i_17] * (long) Filter.coefficient_int[0][i_17] >> 16);
						}

						for (int i_17 = 0; i_17 < n; i_17++) {
							y -= (int) ((long) output[n - 1 - i_17] * (long) Filter.coefficient_int[1][i_17] >> 16);
						}

						output[n] = y;
						t = this.filterEnvelope.step(mixDuration + 1);
						++n;
					}

					delay = 128;

					while (true) {
						if (delay > mixDuration - M) {
							delay = mixDuration - M;
						}

						while (n < delay) {
							int y = (int) ((long) output[n + M] * (long) Filter.invUnity_int >> 16);

							for (int i = 0; i < M; i++) {
								y += (int) ((long) output[n + M - 1 - i] * (long) Filter.coefficient_int[0][i] >> 16);
							}

							for (int i = 0; i < N; i++) {
								y -= (int) ((long) output[n - 1 - i] * (long) Filter.coefficient_int[1][i] >> 16);
							}

							output[n] = y;
							t = this.filterEnvelope.step(mixDuration + 1);
							++n;
						}

						if (n >= mixDuration - M) {
							while (n < mixDuration) {
								int y = 0;

								for (int i = n + M - mixDuration; i < M; i++) {
									y += (int) ((long) output[n + M - 1 - i] * (long) Filter.coefficient_int[0][i] >> 16);
								}

								for (int i = 0; i < N; i++) {
									y -= (int) ((long) output[n - 1 - i] * (long) Filter.coefficient_int[1][i] >> 16);
								}

								output[n] = y;
								this.filterEnvelope.step(mixDuration + 1);
								++n;
							}
							break;
						}

						M = this.filter.compute(0, (float) t / 65536.0F);
						N = this.filter.compute(1, (float) t / 65536.0F);
						delay += 128;
					}
				}
			}

			for (int i = 0; i < mixDuration; i++) {
				if (output[i] < -32768) {
					output[i] = -32768;
				}

				if (output[i] > 32767) {
					output[i] = 32767;
				}
			}

			return output;
		}
	}

	final int evaluateWave(int table, int phase, int amplitude) {
		return amplitude == 1 ? ((table & 0x7fff) < 16384 ? phase : -phase) : (amplitude == 2 ? sine[table & 0x7fff] * phase >> 14 : (amplitude == 3 ? (phase * (table & 0x7fff) >> 14) - phase : (amplitude == 4 ? phase * noise[table / 2607 & 0x7fff] : 0)));
	}

	final void decodeInstruments(RsByteBuffer buffer) {
		this.pitch = new Envelope();
		this.pitch.decode(buffer);
		this.volume = new Envelope();
		this.volume.decode(buffer);
		int option = buffer.readUnsignedByte();
		if (option != 0) {
			--buffer.index;
			this.pitchModifier = new Envelope();
			this.pitchModifier.decode(buffer);
			this.pitchModifierAmplitude = new Envelope();
			this.pitchModifierAmplitude.decode(buffer);
		}

		option = buffer.readUnsignedByte();
		if (option != 0) {
			--buffer.index;
			this.volumeMultiplier = new Envelope();
			this.volumeMultiplier.decode(buffer);
			this.volumeAmplitude = new Envelope();
			this.volumeAmplitude.decode(buffer);
		}

		option = buffer.readUnsignedByte();
		if (option != 0) {
			--buffer.index;
			this.release = new Envelope();
			this.release.decode(buffer);
			this.attack = new Envelope();
			this.attack.decode(buffer);
		}

		for (int i = 0; i < 10; i++) {
			int volume = buffer.readUnsignedSmart();
			if (volume == 0) {
				break;
			}

			this.oscillatorVolume[i] = volume;
			this.oscillatorPitch[i] = buffer.readSignedSmart();
			this.oscillatorDelays[i] = buffer.readUnsignedSmart();
		}

		this.delayTime = buffer.readUnsignedSmart();
		this.delayDecay = buffer.readUnsignedSmart();
		this.duration = buffer.readUnsignedShort();
		this.offset = buffer.readUnsignedShort();
		this.filter = new Filter();
		this.filterEnvelope = new Envelope();
		this.filter.decode(buffer, this.filterEnvelope);
	}

}
