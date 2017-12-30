
/* Class253_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class Class253_Sub1 extends Class253 {
	SourceDataLine aSourceDataLine7822;
	int anInt7823;
	AudioFormat anAudioFormat7824;
	byte[] aByteArray7825;
	boolean aBool7826 = false;

	void method4369(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_0_ = infos;
			for (int i = 0; i < infos_0_.length; i++) {
				Mixer.Info info = infos_0_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class253_Sub1) this).aBool7826 = true;
				}
			}
		}
		((Class253_Sub1) this).anAudioFormat7824 = new AudioFormat((float) anInt3129, 16, aBool3115 ? 2 : 1, true, false);
		((Class253_Sub1) this).aByteArray7825 = new byte[256 << (aBool3115 ? 2 : 1)];
	}

	void method4370(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_1_ = infos;
			for (int i = 0; i < infos_1_.length; i++) {
				Mixer.Info info = infos_1_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class253_Sub1) this).aBool7826 = true;
				}
			}
		}
		((Class253_Sub1) this).anAudioFormat7824 = new AudioFormat((float) anInt3129, 16, aBool3115 ? 2 : 1, true, false);
		((Class253_Sub1) this).aByteArray7825 = new byte[256 << (aBool3115 ? 2 : 1)];
	}

	void method4361(int i) throws LineUnavailableException {
		try {
			DataLine.Info info = new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class253_Sub1) this).anAudioFormat7824, i << (aBool3115 ? 2 : 1));
			((Class253_Sub1) this).aSourceDataLine7822 = (SourceDataLine) AudioSystem.getLine(info);
			((Class253_Sub1) this).aSourceDataLine7822.open();
			((Class253_Sub1) this).aSourceDataLine7822.start();
			((Class253_Sub1) this).anInt7823 = i;
		} catch (LineUnavailableException lineunavailableexception) {
			if (Class179.method3019(i, (short) 20963) != 1)
				method4361(Class323.nextPowerOfTwo(i, -434850036));
			else {
				((Class253_Sub1) this).aSourceDataLine7822 = null;
				throw lineunavailableexception;
			}
		}
	}

	Class253_Sub1() {
		/* empty */
	}

	void method4342() {
		int i = 256;
		if (aBool3115)
			i <<= 1;
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			int i_3_ = ((Class253_Sub1) this).anIntArray3140[i_2_];
			if ((i_3_ + 8388608 & ~0xffffff) != 0)
				i_3_ = 0x7fffff ^ i_3_ >> 31;
			((Class253_Sub1) this).aByteArray7825[i_2_ * 2] = (byte) (i_3_ >> 8);
			((Class253_Sub1) this).aByteArray7825[i_2_ * 2 + 1] = (byte) (i_3_ >> 16);
		}
		((Class253_Sub1) this).aSourceDataLine7822.write(((Class253_Sub1) this).aByteArray7825, 0, i << 1);
	}

	void method4343() {
		if (((Class253_Sub1) this).aSourceDataLine7822 != null) {
			((Class253_Sub1) this).aSourceDataLine7822.close();
			((Class253_Sub1) this).aSourceDataLine7822 = null;
		}
	}

	void method4344() throws LineUnavailableException {
		((Class253_Sub1) this).aSourceDataLine7822.flush();
		if (((Class253_Sub1) this).aBool7826) {
			((Class253_Sub1) this).aSourceDataLine7822.close();
			((Class253_Sub1) this).aSourceDataLine7822 = null;
			DataLine.Info info = new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class253_Sub1) this).anAudioFormat7824, (((Class253_Sub1) this).anInt7823 << (aBool3115 ? 2 : 1)));
			((Class253_Sub1) this).aSourceDataLine7822 = (SourceDataLine) AudioSystem.getLine(info);
			((Class253_Sub1) this).aSourceDataLine7822.open();
			((Class253_Sub1) this).aSourceDataLine7822.start();
		}
	}

	void method4371(int i) throws LineUnavailableException {
		try {
			DataLine.Info info = new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class253_Sub1) this).anAudioFormat7824, i << (aBool3115 ? 2 : 1));
			((Class253_Sub1) this).aSourceDataLine7822 = (SourceDataLine) AudioSystem.getLine(info);
			((Class253_Sub1) this).aSourceDataLine7822.open();
			((Class253_Sub1) this).aSourceDataLine7822.start();
			((Class253_Sub1) this).anInt7823 = i;
		} catch (LineUnavailableException lineunavailableexception) {
			if (Class179.method3019(i, (short) 25372) != 1)
				method4361(Class323.nextPowerOfTwo(i, 857284767));
			else {
				((Class253_Sub1) this).aSourceDataLine7822 = null;
				throw lineunavailableexception;
			}
		}
	}

	void method4367(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_4_ = infos;
			for (int i = 0; i < infos_4_.length; i++) {
				Mixer.Info info = infos_4_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class253_Sub1) this).aBool7826 = true;
				}
			}
		}
		((Class253_Sub1) this).anAudioFormat7824 = new AudioFormat((float) anInt3129, 16, aBool3115 ? 2 : 1, true, false);
		((Class253_Sub1) this).aByteArray7825 = new byte[256 << (aBool3115 ? 2 : 1)];
	}

	void method4341(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_5_ = infos;
			for (int i = 0; i < infos_5_.length; i++) {
				Mixer.Info info = infos_5_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class253_Sub1) this).aBool7826 = true;
				}
			}
		}
		((Class253_Sub1) this).anAudioFormat7824 = new AudioFormat((float) anInt3129, 16, aBool3115 ? 2 : 1, true, false);
		((Class253_Sub1) this).aByteArray7825 = new byte[256 << (aBool3115 ? 2 : 1)];
	}

	void method4372(int i) throws LineUnavailableException {
		try {
			DataLine.Info info = new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class253_Sub1) this).anAudioFormat7824, i << (aBool3115 ? 2 : 1));
			((Class253_Sub1) this).aSourceDataLine7822 = (SourceDataLine) AudioSystem.getLine(info);
			((Class253_Sub1) this).aSourceDataLine7822.open();
			((Class253_Sub1) this).aSourceDataLine7822.start();
			((Class253_Sub1) this).anInt7823 = i;
		} catch (LineUnavailableException lineunavailableexception) {
			if (Class179.method3019(i, (short) 564) != 1)
				method4361(Class323.nextPowerOfTwo(i, 1147493644));
			else {
				((Class253_Sub1) this).aSourceDataLine7822 = null;
				throw lineunavailableexception;
			}
		}
	}

	void method4375(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_6_ = infos;
			for (int i = 0; i < infos_6_.length; i++) {
				Mixer.Info info = infos_6_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class253_Sub1) this).aBool7826 = true;
				}
			}
		}
		((Class253_Sub1) this).anAudioFormat7824 = new AudioFormat((float) anInt3129, 16, aBool3115 ? 2 : 1, true, false);
		((Class253_Sub1) this).aByteArray7825 = new byte[256 << (aBool3115 ? 2 : 1)];
	}

	void method4378() throws LineUnavailableException {
		((Class253_Sub1) this).aSourceDataLine7822.flush();
		if (((Class253_Sub1) this).aBool7826) {
			((Class253_Sub1) this).aSourceDataLine7822.close();
			((Class253_Sub1) this).aSourceDataLine7822 = null;
			DataLine.Info info = new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class253_Sub1) this).anAudioFormat7824, (((Class253_Sub1) this).anInt7823 << (aBool3115 ? 2 : 1)));
			((Class253_Sub1) this).aSourceDataLine7822 = (SourceDataLine) AudioSystem.getLine(info);
			((Class253_Sub1) this).aSourceDataLine7822.open();
			((Class253_Sub1) this).aSourceDataLine7822.start();
		}
	}

	void method4376() {
		if (((Class253_Sub1) this).aSourceDataLine7822 != null) {
			((Class253_Sub1) this).aSourceDataLine7822.close();
			((Class253_Sub1) this).aSourceDataLine7822 = null;
		}
	}

	int method4353() {
		return (((Class253_Sub1) this).anInt7823 - (((Class253_Sub1) this).aSourceDataLine7822.available() >> (aBool3115 ? 2 : 1)));
	}

	void method4358() {
		int i = 256;
		if (aBool3115)
			i <<= 1;
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			int i_8_ = ((Class253_Sub1) this).anIntArray3140[i_7_];
			if ((i_8_ + 8388608 & ~0xffffff) != 0)
				i_8_ = 0x7fffff ^ i_8_ >> 31;
			((Class253_Sub1) this).aByteArray7825[i_7_ * 2] = (byte) (i_8_ >> 8);
			((Class253_Sub1) this).aByteArray7825[i_7_ * 2 + 1] = (byte) (i_8_ >> 16);
		}
		((Class253_Sub1) this).aSourceDataLine7822.write(((Class253_Sub1) this).aByteArray7825, 0, i << 1);
	}

	void method4362() {
		int i = 256;
		if (aBool3115)
			i <<= 1;
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			int i_10_ = ((Class253_Sub1) this).anIntArray3140[i_9_];
			if ((i_10_ + 8388608 & ~0xffffff) != 0)
				i_10_ = 0x7fffff ^ i_10_ >> 31;
			((Class253_Sub1) this).aByteArray7825[i_9_ * 2] = (byte) (i_10_ >> 8);
			((Class253_Sub1) this).aByteArray7825[i_9_ * 2 + 1] = (byte) (i_10_ >> 16);
		}
		((Class253_Sub1) this).aSourceDataLine7822.write(((Class253_Sub1) this).aByteArray7825, 0, i << 1);
	}

	int method4340() {
		return (((Class253_Sub1) this).anInt7823 - (((Class253_Sub1) this).aSourceDataLine7822.available() >> (aBool3115 ? 2 : 1)));
	}

	void method4332() {
		if (((Class253_Sub1) this).aSourceDataLine7822 != null) {
			((Class253_Sub1) this).aSourceDataLine7822.close();
			((Class253_Sub1) this).aSourceDataLine7822 = null;
		}
	}

	void method4366(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			Mixer.Info[] infos_11_ = infos;
			for (int i = 0; i < infos_11_.length; i++) {
				Mixer.Info info = infos_11_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class253_Sub1) this).aBool7826 = true;
				}
			}
		}
		((Class253_Sub1) this).anAudioFormat7824 = new AudioFormat((float) anInt3129, 16, aBool3115 ? 2 : 1, true, false);
		((Class253_Sub1) this).aByteArray7825 = new byte[256 << (aBool3115 ? 2 : 1)];
	}
}
