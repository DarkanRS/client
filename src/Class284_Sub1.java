/* Class284_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class Class284_Sub1 extends Class284 {
	byte[] aByteArray7141;
	SourceDataLine aSourceDataLine7142;
	int anInt7143;
	AudioFormat anAudioFormat7144;
	boolean aBoolean7145 = false;
	public static Class243 aClass243_7146;

	int method2698() {
		return (-975542179 * ((Class284_Sub1) this).anInt7143 - (((Class284_Sub1) this).aSourceDataLine7142.available() >> (aBoolean3047 ? 2 : 1)));
	}

	void method2683(Component component, byte i) {
		try {
			Mixer.Info[] infos = AudioSystem.getMixerInfo();
			if (null != infos) {
				Mixer.Info[] infos_0_ = infos;
				for (int i_1_ = 0; i_1_ < infos_0_.length; i_1_++) {
					Mixer.Info info = infos_0_[i_1_];
					if (info != null) {
						String string = info.getName();
						if (null != string && string.toLowerCase().indexOf("soundmax") >= 0)
							((Class284_Sub1) this).aBoolean7145 = true;
					}
				}
			}
			((Class284_Sub1) this).anAudioFormat7144 = new AudioFormat((float) (1164070869 * anInt3059), 16, aBoolean3047 ? 2 : 1, true, false);
			((Class284_Sub1) this).aByteArray7141 = new byte[256 << (aBoolean3047 ? 2 : 1)];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aas.q(").append(')').toString());
		}
	}

	void method2699() throws LineUnavailableException {
		((Class284_Sub1) this).aSourceDataLine7142.flush();
		if (((Class284_Sub1) this).aBoolean7145) {
			((Class284_Sub1) this).aSourceDataLine7142.close();
			((Class284_Sub1) this).aSourceDataLine7142 = null;
			DataLine.Info info = null;
			info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class284_Sub1) this).anAudioFormat7144, (((Class284_Sub1) this).anInt7143 * -975542179 << (aBoolean3047 ? 2 : 1))));
			((Class284_Sub1) this).aSourceDataLine7142 = (SourceDataLine) AudioSystem.getLine(info);
			((Class284_Sub1) this).aSourceDataLine7142.open();
			((Class284_Sub1) this).aSourceDataLine7142.start();
		}
	}

	int method2688(int i) {
		try {
			return (-975542179 * ((Class284_Sub1) this).anInt7143 - (((Class284_Sub1) this).aSourceDataLine7142.available() >> (aBoolean3047 ? 2 : 1)));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aas.s(").append(')').toString());
		}
	}

	void method2685() {
		int i = 256;
		if (aBoolean3047)
			i <<= 1;
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			int i_3_ = ((Class284_Sub1) this).anIntArray3052[i_2_];
			if ((8388608 + i_3_ & ~0xffffff) != 0)
				i_3_ = 0x7fffff ^ i_3_ >> 31;
			((Class284_Sub1) this).aByteArray7141[2 * i_2_] = (byte) (i_3_ >> 8);
			((Class284_Sub1) this).aByteArray7141[1 + i_2_ * 2] = (byte) (i_3_ >> 16);
		}
		((Class284_Sub1) this).aSourceDataLine7142.write(((Class284_Sub1) this).aByteArray7141, 0, i << 1);
	}

	void method2686(int i) {
		try {
			if (((Class284_Sub1) this).aSourceDataLine7142 != null) {
				((Class284_Sub1) this).aSourceDataLine7142.close();
				((Class284_Sub1) this).aSourceDataLine7142 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aas.y(").append(')').toString());
		}
	}

	void method2687(short i) throws LineUnavailableException {
		try {
			((Class284_Sub1) this).aSourceDataLine7142.flush();
			if (((Class284_Sub1) this).aBoolean7145) {
				((Class284_Sub1) this).aSourceDataLine7142.close();
				((Class284_Sub1) this).aSourceDataLine7142 = null;
				DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class284_Sub1) this).anAudioFormat7144, (((Class284_Sub1) this).anInt7143 * -975542179 << (aBoolean3047 ? 2 : 1))));
				((Class284_Sub1) this).aSourceDataLine7142 = (SourceDataLine) AudioSystem.getLine(info);
				((Class284_Sub1) this).aSourceDataLine7142.open();
				((Class284_Sub1) this).aSourceDataLine7142.start();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aas.t(").append(')').toString());
		}
	}

	void method2700(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (null != infos) {
			Mixer.Info[] infos_4_ = infos;
			for (int i = 0; i < infos_4_.length; i++) {
				Mixer.Info info = infos_4_[i];
				if (info != null) {
					String string = info.getName();
					if (null != string && string.toLowerCase().indexOf("soundmax") >= 0)
						((Class284_Sub1) this).aBoolean7145 = true;
				}
			}
		}
		((Class284_Sub1) this).anAudioFormat7144 = new AudioFormat((float) (1164070869 * anInt3059), 16, aBoolean3047 ? 2 : 1, true, false);
		((Class284_Sub1) this).aByteArray7141 = new byte[256 << (aBoolean3047 ? 2 : 1)];
	}

	void method2701(int i) throws LineUnavailableException {
		try {
			DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class284_Sub1) this).anAudioFormat7144, i << (aBoolean3047 ? 2 : 1)));
			((Class284_Sub1) this).aSourceDataLine7142 = (SourceDataLine) AudioSystem.getLine(info);
			((Class284_Sub1) this).aSourceDataLine7142.open();
			((Class284_Sub1) this).aSourceDataLine7142.start();
			((Class284_Sub1) this).anInt7143 = i * 1460972533;
		} catch (LineUnavailableException lineunavailableexception) {
			if (Class173.method1818(i, -2116869304) != 1)
				method2684(Class416.method5590(i, (byte) 16), 1699827460);
			else {
				((Class284_Sub1) this).aSourceDataLine7142 = null;
				throw lineunavailableexception;
			}
		}
	}

	void method2702(int i) throws LineUnavailableException {
		try {
			DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class284_Sub1) this).anAudioFormat7144, i << (aBoolean3047 ? 2 : 1)));
			((Class284_Sub1) this).aSourceDataLine7142 = (SourceDataLine) AudioSystem.getLine(info);
			((Class284_Sub1) this).aSourceDataLine7142.open();
			((Class284_Sub1) this).aSourceDataLine7142.start();
			((Class284_Sub1) this).anInt7143 = i * 1460972533;
		} catch (LineUnavailableException lineunavailableexception) {
			if (Class173.method1818(i, -409743758) != 1)
				method2684(Class416.method5590(i, (byte) 16), 1094341768);
			else {
				((Class284_Sub1) this).aSourceDataLine7142 = null;
				throw lineunavailableexception;
			}
		}
	}

	void method2703() throws LineUnavailableException {
		((Class284_Sub1) this).aSourceDataLine7142.flush();
		if (((Class284_Sub1) this).aBoolean7145) {
			((Class284_Sub1) this).aSourceDataLine7142.close();
			((Class284_Sub1) this).aSourceDataLine7142 = null;
			DataLine.Info info = null;
			info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class284_Sub1) this).anAudioFormat7144, (((Class284_Sub1) this).anInt7143 * -975542179 << (aBoolean3047 ? 2 : 1))));
			((Class284_Sub1) this).aSourceDataLine7142 = (SourceDataLine) AudioSystem.getLine(info);
			((Class284_Sub1) this).aSourceDataLine7142.open();
			((Class284_Sub1) this).aSourceDataLine7142.start();
		}
	}

	void method2684(int i, int i_5_) throws LineUnavailableException {
		try {
			DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((Class284_Sub1) this).anAudioFormat7144, i << (aBoolean3047 ? 2 : 1)));
			((Class284_Sub1) this).aSourceDataLine7142 = (SourceDataLine) AudioSystem.getLine(info);
			((Class284_Sub1) this).aSourceDataLine7142.open();
			((Class284_Sub1) this).aSourceDataLine7142.start();
			((Class284_Sub1) this).anInt7143 = i * 1460972533;
		} catch (LineUnavailableException lineunavailableexception) {
			if (Class173.method1818(i, 970764696) != 1)
				method2684(Class416.method5590(i, (byte) 16), 1535957198);
			else {
				((Class284_Sub1) this).aSourceDataLine7142 = null;
				throw lineunavailableexception;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aas.n(").append(')').toString());
		}
	}

	void method2704() {
		if (((Class284_Sub1) this).aSourceDataLine7142 != null) {
			((Class284_Sub1) this).aSourceDataLine7142.close();
			((Class284_Sub1) this).aSourceDataLine7142 = null;
		}
	}

	Class284_Sub1() {
		/* empty */
	}

	void method2705() {
		int i = 256;
		if (aBoolean3047)
			i <<= 1;
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			int i_7_ = ((Class284_Sub1) this).anIntArray3052[i_6_];
			if ((8388608 + i_7_ & ~0xffffff) != 0)
				i_7_ = 0x7fffff ^ i_7_ >> 31;
			((Class284_Sub1) this).aByteArray7141[2 * i_6_] = (byte) (i_7_ >> 8);
			((Class284_Sub1) this).aByteArray7141[1 + i_6_ * 2] = (byte) (i_7_ >> 16);
		}
		((Class284_Sub1) this).aSourceDataLine7142.write(((Class284_Sub1) this).aByteArray7141, 0, i << 1);
	}

	void method2706() {
		int i = 256;
		if (aBoolean3047)
			i <<= 1;
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			int i_9_ = ((Class284_Sub1) this).anIntArray3052[i_8_];
			if ((8388608 + i_9_ & ~0xffffff) != 0)
				i_9_ = 0x7fffff ^ i_9_ >> 31;
			((Class284_Sub1) this).aByteArray7141[2 * i_8_] = (byte) (i_9_ >> 8);
			((Class284_Sub1) this).aByteArray7141[1 + i_8_ * 2] = (byte) (i_9_ >> 16);
		}
		((Class284_Sub1) this).aSourceDataLine7142.write(((Class284_Sub1) this).aByteArray7141, 0, i << 1);
	}

	void method2707() {
		int i = 256;
		if (aBoolean3047)
			i <<= 1;
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			int i_11_ = ((Class284_Sub1) this).anIntArray3052[i_10_];
			if ((8388608 + i_11_ & ~0xffffff) != 0)
				i_11_ = 0x7fffff ^ i_11_ >> 31;
			((Class284_Sub1) this).aByteArray7141[2 * i_10_] = (byte) (i_11_ >> 8);
			((Class284_Sub1) this).aByteArray7141[1 + i_10_ * 2] = (byte) (i_11_ >> 16);
		}
		((Class284_Sub1) this).aSourceDataLine7142.write(((Class284_Sub1) this).aByteArray7141, 0, i << 1);
	}

	static final void method2708(ClientScript2 class403, int i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_12_, (byte) -36);
			Class119 class119 = Class389.aClass119Array4165[i_12_ >> 16];
			Class288.method2728(class105, class119, class403, -1432183738);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aas.eb(").append(')').toString());
		}
	}
}
