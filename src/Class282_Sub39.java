/* Class282_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub39 extends Node {
	short[][] aShortArrayArray8003;
	double aDouble8004;
	
	Class282_Sub39(short[][] is, double d) {
		((Class282_Sub39) this).aShortArrayArray8003 = is;
		((Class282_Sub39) this).aDouble8004 = d;
	}

	long method13294(int i) {
		return (long) ((((Class282_Sub39) this).aShortArrayArray8003.length << 32) | (((Class282_Sub39) this).aShortArrayArray8003[0]).length);
	}

	long method13295() {
		return (long) ((((Class282_Sub39) this).aShortArrayArray8003.length << 32) | (((Class282_Sub39) this).aShortArrayArray8003[0]).length);
	}

	static void method13296(Matrix44Arr class384, int i) {
		Class20.aClass384_185.method6562(class384);
	}

	static void method13297(GraphicalRenderer class505, Class282_Sub36 class282_sub36, WorldMapAreaDefs class220, int i) {
		NativeSprite class160 = class220.method3729(class505, 216702129);
		if (class160 != null) {
			int i_0_ = class160.method2747();
			if (class160.method2793() > i_0_)
				i_0_ = class160.method2793();
			int i_1_ = 10;
			int i_2_ = class282_sub36.anInt7990 * 443215287;
			int i_3_ = -904538465 * class282_sub36.anInt7992;
			int i_4_ = 0;
			int i_5_ = 0;
			int i_6_ = 0;
			if (null != class220.areaName) {
				i_4_ = (Class282_Sub17_Sub2.aClass414_9933.method6987(class220.areaName, null, Class291_Sub1.aStringArray8024, null, (byte) 0));
				for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
					String string = Class291_Sub1.aStringArray8024[i_7_];
					if (i_7_ < i_4_ - 1)
						string = string.substring(0, string.length() - 4);
					int i_8_ = Class291_Sub1.aClass194_8023.method3177(string);
					if (i_8_ > i_5_)
						i_5_ = i_8_;
				}
				i_6_ = (Class291_Sub1.aClass194_8023.method3173() * i_4_ + Class291_Sub1.aClass194_8023.method3186() / 2);
			}
			int i_9_ = i_0_ / 2 + class282_sub36.anInt7990 * 443215287;
			int i_10_ = -904538465 * class282_sub36.anInt7992;
			if (i_2_ < i_0_ + Class291_Sub1.anInt3489) {
				i_2_ = Class291_Sub1.anInt3489;
				i_9_ = i_0_ / 2 + Class291_Sub1.anInt3489 + i_1_ + i_5_ / 2 + 5;
			} else if (i_2_ > Class291_Sub1.anInt3476 - i_0_) {
				i_2_ = Class291_Sub1.anInt3476 - i_0_;
				i_9_ = Class291_Sub1.anInt3476 - i_0_ / 2 - i_1_ - i_5_ / 2 - 5;
			}
			if (i_3_ < i_0_ + Class291_Sub1.anInt3490) {
				i_3_ = Class291_Sub1.anInt3490;
				i_10_ = i_0_ / 2 + (Class291_Sub1.anInt3490 + i_1_);
			} else if (i_3_ > Class291_Sub1.anInt3492 - i_0_) {
				i_3_ = Class291_Sub1.anInt3492 - i_0_;
				i_10_ = Class291_Sub1.anInt3492 - i_0_ / 2 - i_1_ - i_6_;
			}
			int i_11_ = ((int) (Math.atan2((double) (i_2_ - (class282_sub36.anInt7990 * 443215287)), (double) (i_3_ - (class282_sub36.anInt7992 * -904538465))) / 3.141592653589793 * 32767.0) & 0xffff);
			class160.method2758((float) i_2_ + (float) i_0_ / 2.0F, (float) i_0_ / 2.0F + (float) i_3_, 4096, i_11_);
			int i_12_ = -2;
			int i_13_ = -2;
			int i_14_ = -2;
			int i_15_ = -2;
			if (class220.areaName != null) {
				i_12_ = i_9_ - i_5_ / 2 - 5;
				i_13_ = i_10_;
				i_14_ = i_12_ + i_5_ + 10;
				i_15_ = (i_13_ + Class291_Sub1.aClass194_8023.method3173() * i_4_ + 3);
				if (class220.anInt2726 * 1903100449 != 0)
					class505.method8425(i_12_, i_13_, i_14_ - i_12_, i_15_ - i_13_, class220.anInt2726 * 1903100449, (byte) -24);
				if (class220.anInt2727 * 1542243419 != 0)
					class505.method8562(i_12_, i_13_, i_14_ - i_12_, i_15_ - i_13_, class220.anInt2727 * 1542243419, (byte) 4);
				for (int i_16_ = 0; i_16_ < i_4_; i_16_++) {
					String string = Class291_Sub1.aStringArray8024[i_16_];
					if (i_16_ < i_4_ - 1)
						string = string.substring(0, string.length() - 4);
					Class291_Sub1.aClass194_8023.method3178(class505, string, i_9_, i_10_, (class220.anInt2720 * -2116785903), true);
					i_10_ += Class291_Sub1.aClass194_8023.method3173();
				}
			}
			if (-1 != -1248709255 * class220.anInt2719 || class220.areaName != null) {
				Class282_Sub33 class282_sub33 = new Class282_Sub33(class282_sub36);
				i_0_ >>= 1;
				((Class282_Sub33) class282_sub33).anInt7830 = -925812333 * (i_2_ - i_0_);
				((Class282_Sub33) class282_sub33).anInt7828 = (i_2_ + i_0_) * 1303174651;
				((Class282_Sub33) class282_sub33).anInt7834 = (i_3_ - i_0_) * -1854557465;
				((Class282_Sub33) class282_sub33).anInt7833 = -724182681 * (i_0_ + i_3_);
				((Class282_Sub33) class282_sub33).anInt7829 = -1447464913 * i_12_;
				((Class282_Sub33) class282_sub33).anInt7832 = -705732785 * i_14_;
				((Class282_Sub33) class282_sub33).anInt7831 = i_13_ * -2064740419;
				((Class282_Sub33) class282_sub33).anInt7827 = -719287379 * i_15_;
				Class346.aClass482_4049.append(class282_sub33, 1613511874);
			}
		}
	}
}
