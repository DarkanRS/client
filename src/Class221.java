/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class221 {
	int anInt2758;
	static Class221 aClass221_2759 = new Class221(0);
	static Class221 aClass221_2760;
	static Class221 aClass221_2761 = new Class221(1);
	public static int anInt2762;
	static Class118 aClass118_2763;

	static Class221 method3744(int i) {
		Class221[] class221s = JS5FileWorker.method5815(288844894);
		for (int i_0_ = 0; i_0_ < class221s.length; i_0_++) {
			Class221 class221 = class221s[i_0_];
			if (i == ((Class221) class221).anInt2758 * 692352953)
				return class221;
		}
		return null;
	}

	static {
		aClass221_2760 = new Class221(2);
	}

	Class221(int i) {
		((Class221) this).anInt2758 = i * -1600758135;
	}

	static Class221[] method3745() {
		return (new Class221[] { aClass221_2760, aClass221_2761, aClass221_2759 });
	}

	static Class221[] method3746() {
		return (new Class221[] { aClass221_2760, aClass221_2761, aClass221_2759 });
	}

	static final void method3747(CS2Executor class527, int i) {
		int i_1_ = (((CS2Executor) class527).unknown[((CS2Executor) class527).instrPtr * 301123709]);
		Long var_long = (Long) Class46.anObjectArray437[i_1_];
		if (var_long == null)
			((CS2Executor) class527).aLongArray7003[((((CS2Executor) class527).anInt7001 += -1188480575) * 1820448321 - 1)] = -1L;
		else
			((CS2Executor) class527).aLongArray7003[((((CS2Executor) class527).anInt7001 += -1188480575) * 1820448321 - 1)] = var_long.longValue();
	}

	static final void method3748(CS2Executor class527, int i) {
		if (client.aString7165 != null)
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = client.aString7165;
		else
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static final void method3749(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 141891001;
	}

	static final void method3750(CS2Executor class527, byte i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub15_8203, (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]), 1688733645);
		Class190.method3148((byte) 79);
	}

	static void method3751(int i, int i_2_, int i_3_, int i_4_, int i_5_, byte i_6_) {
		int i_7_ = 0;
		int i_8_ = i_4_;
		int i_9_ = i_3_ * i_3_;
		int i_10_ = i_4_ * i_4_;
		int i_11_ = i_10_ << 1;
		int i_12_ = i_9_ << 1;
		int i_13_ = i_4_ << 1;
		int i_14_ = (1 - i_13_) * i_9_ + i_11_;
		int i_15_ = i_10_ - i_12_ * (i_13_ - 1);
		int i_16_ = i_9_ << 2;
		int i_17_ = i_10_ << 2;
		int i_18_ = i_11_ * (3 + (i_7_ << 1));
		int i_19_ = i_12_ * ((i_8_ << 1) - 3);
		int i_20_ = i_17_ * (1 + i_7_);
		int i_21_ = i_16_ * (i_8_ - 1);
		Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_2_], i - i_3_, i_3_ + i, i_5_, (byte) 72);
		while (i_8_ > 0) {
			if (i_14_ < 0) {
				while (i_14_ < 0) {
					i_14_ += i_18_;
					i_15_ += i_20_;
					i_18_ += i_17_;
					i_20_ += i_17_;
					i_7_++;
				}
			}
			if (i_15_ < 0) {
				i_14_ += i_18_;
				i_15_ += i_20_;
				i_18_ += i_17_;
				i_20_ += i_17_;
				i_7_++;
			}
			i_14_ += -i_21_;
			i_15_ += -i_19_;
			i_19_ -= i_16_;
			i_21_ -= i_16_;
			i_8_--;
			int i_22_ = i_2_ - i_8_;
			int i_23_ = i_2_ + i_8_;
			int i_24_ = i + i_7_;
			int i_25_ = i - i_7_;
			Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_22_], i_25_, i_24_, i_5_, (byte) 0);
			Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_23_], i_25_, i_24_, i_5_, (byte) 13);
		}
	}

	static final void method3752(CS2Executor class527, byte i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = -762135173 * client.anInt7178;
	}
}
