/* Class282_Sub20_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub28 extends Class282_Sub20 {
	int anInt9903;
	static final int anInt9904 = 4096;
	static final int anInt9905 = 4096;
	static final int anInt9906 = 4096;
	int anInt9907 = -1853837312;
	int anInt9908 = 200290304;
	int anInt9909 = 1453723648;
	static final int anInt9910 = 409;
	int[] anIntArray9911;

	int[][] method12320(int i, int i_0_) {
		int[][] is = aClass308_7670.method5463(i, 990292944);
		if (aClass308_7670.aBool3619) {
			int[][] is_1_ = method12333(0, i, (byte) 3);
			int[] is_2_ = is_1_[0];
			int[] is_3_ = is_1_[1];
			int[] is_4_ = is_1_[2];
			int[] is_5_ = is[0];
			int[] is_6_ = is[1];
			int[] is_7_ = is[2];
			for (int i_8_ = 0; i_8_ < -402153223 * Class316.anInt3670; i_8_++) {
				int i_9_ = is_2_[i_8_];
				int i_10_ = i_9_ - ((Class282_Sub20_Sub28) this).anIntArray9911[0];
				if (i_10_ < 0)
					i_10_ = -i_10_;
				if (i_10_ > 1004530707 * ((Class282_Sub20_Sub28) this).anInt9903) {
					is_5_[i_8_] = i_9_;
					is_6_[i_8_] = is_3_[i_8_];
					is_7_[i_8_] = is_4_[i_8_];
				} else {
					int i_11_ = is_3_[i_8_];
					i_10_ = i_11_ - (((Class282_Sub20_Sub28) this).anIntArray9911[1]);
					if (i_10_ < 0)
						i_10_ = -i_10_;
					if (i_10_ > (1004530707 * ((Class282_Sub20_Sub28) this).anInt9903)) {
						is_5_[i_8_] = i_9_;
						is_6_[i_8_] = i_11_;
						is_7_[i_8_] = is_4_[i_8_];
					} else {
						int i_12_ = is_4_[i_8_];
						i_10_ = i_12_ - (((Class282_Sub20_Sub28) this).anIntArray9911[2]);
						if (i_10_ < 0)
							i_10_ = -i_10_;
						if (i_10_ > 1004530707 * (((Class282_Sub20_Sub28) this).anInt9903)) {
							is_5_[i_8_] = i_9_;
							is_6_[i_8_] = i_11_;
							is_7_[i_8_] = i_12_;
						} else {
							is_5_[i_8_] = (1717090721 * ((Class282_Sub20_Sub28) this).anInt9909 * i_9_) >> 12;
							is_6_[i_8_] = (-2031017045 * ((Class282_Sub20_Sub28) this).anInt9908 * i_11_) >> 12;
							is_7_[i_8_] = i_12_ * (-1781353565 * (((Class282_Sub20_Sub28) this).anInt9907)) >> 12;
						}
					}
				}
			}
		}
		return is;
	}

	public Class282_Sub20_Sub28() {
		super(1, false);
		((Class282_Sub20_Sub28) this).anInt9903 = 221493539;
		((Class282_Sub20_Sub28) this).anIntArray9911 = new int[3];
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_13_) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub28) this).anInt9909 = class282_sub35.readUnsignedShort() * -547001759;
			break;
		case 1:
			((Class282_Sub20_Sub28) this).anInt9907 = class282_sub35.readUnsignedShort() * 1848186891;
			break;
		case 4: {
			int i_14_ = class282_sub35.read24BitUnsignedInteger();
			((Class282_Sub20_Sub28) this).anIntArray9911[0] = (i_14_ & 0xff0000) << 4;
			((Class282_Sub20_Sub28) this).anIntArray9911[1] = (i_14_ & 0xff00) >> 4;
			((Class282_Sub20_Sub28) this).anIntArray9911[2] = (i_14_ & 0xff) >> 12;
			break;
		}
		case 2:
			((Class282_Sub20_Sub28) this).anInt9908 = class282_sub35.readUnsignedShort() * -189743357;
			break;
		case 0:
			((Class282_Sub20_Sub28) this).anInt9903 = class282_sub35.readUnsignedShort() * -156975589;
			break;
		}
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub28) this).anInt9909 = class282_sub35.readUnsignedShort() * -547001759;
			break;
		case 1:
			((Class282_Sub20_Sub28) this).anInt9907 = class282_sub35.readUnsignedShort() * 1848186891;
			break;
		case 4: {
			int i_15_ = class282_sub35.read24BitUnsignedInteger();
			((Class282_Sub20_Sub28) this).anIntArray9911[0] = (i_15_ & 0xff0000) << 4;
			((Class282_Sub20_Sub28) this).anIntArray9911[1] = (i_15_ & 0xff00) >> 4;
			((Class282_Sub20_Sub28) this).anIntArray9911[2] = (i_15_ & 0xff) >> 12;
			break;
		}
		case 2:
			((Class282_Sub20_Sub28) this).anInt9908 = class282_sub35.readUnsignedShort() * -189743357;
			break;
		case 0:
			((Class282_Sub20_Sub28) this).anInt9903 = class282_sub35.readUnsignedShort() * -156975589;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub28) this).anInt9909 = class282_sub35.readUnsignedShort() * -547001759;
			break;
		case 1:
			((Class282_Sub20_Sub28) this).anInt9907 = class282_sub35.readUnsignedShort() * 1848186891;
			break;
		case 4: {
			int i_16_ = class282_sub35.read24BitUnsignedInteger();
			((Class282_Sub20_Sub28) this).anIntArray9911[0] = (i_16_ & 0xff0000) << 4;
			((Class282_Sub20_Sub28) this).anIntArray9911[1] = (i_16_ & 0xff00) >> 4;
			((Class282_Sub20_Sub28) this).anIntArray9911[2] = (i_16_ & 0xff) >> 12;
			break;
		}
		case 2:
			((Class282_Sub20_Sub28) this).anInt9908 = class282_sub35.readUnsignedShort() * -189743357;
			break;
		case 0:
			((Class282_Sub20_Sub28) this).anInt9903 = class282_sub35.readUnsignedShort() * -156975589;
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub28) this).anInt9909 = class282_sub35.readUnsignedShort() * -547001759;
			break;
		case 1:
			((Class282_Sub20_Sub28) this).anInt9907 = class282_sub35.readUnsignedShort() * 1848186891;
			break;
		case 4: {
			int i_17_ = class282_sub35.read24BitUnsignedInteger();
			((Class282_Sub20_Sub28) this).anIntArray9911[0] = (i_17_ & 0xff0000) << 4;
			((Class282_Sub20_Sub28) this).anIntArray9911[1] = (i_17_ & 0xff00) >> 4;
			((Class282_Sub20_Sub28) this).anIntArray9911[2] = (i_17_ & 0xff) >> 12;
			break;
		}
		case 2:
			((Class282_Sub20_Sub28) this).anInt9908 = class282_sub35.readUnsignedShort() * -189743357;
			break;
		case 0:
			((Class282_Sub20_Sub28) this).anInt9903 = class282_sub35.readUnsignedShort() * -156975589;
			break;
		}
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1160341410);
		if (aClass308_7670.aBool3619) {
			int[][] is_18_ = method12333(0, i, (byte) 3);
			int[] is_19_ = is_18_[0];
			int[] is_20_ = is_18_[1];
			int[] is_21_ = is_18_[2];
			int[] is_22_ = is[0];
			int[] is_23_ = is[1];
			int[] is_24_ = is[2];
			for (int i_25_ = 0; i_25_ < -402153223 * Class316.anInt3670; i_25_++) {
				int i_26_ = is_19_[i_25_];
				int i_27_ = i_26_ - ((Class282_Sub20_Sub28) this).anIntArray9911[0];
				if (i_27_ < 0)
					i_27_ = -i_27_;
				if (i_27_ > 1004530707 * ((Class282_Sub20_Sub28) this).anInt9903) {
					is_22_[i_25_] = i_26_;
					is_23_[i_25_] = is_20_[i_25_];
					is_24_[i_25_] = is_21_[i_25_];
				} else {
					int i_28_ = is_20_[i_25_];
					i_27_ = i_28_ - (((Class282_Sub20_Sub28) this).anIntArray9911[1]);
					if (i_27_ < 0)
						i_27_ = -i_27_;
					if (i_27_ > (1004530707 * ((Class282_Sub20_Sub28) this).anInt9903)) {
						is_22_[i_25_] = i_26_;
						is_23_[i_25_] = i_28_;
						is_24_[i_25_] = is_21_[i_25_];
					} else {
						int i_29_ = is_21_[i_25_];
						i_27_ = i_29_ - (((Class282_Sub20_Sub28) this).anIntArray9911[2]);
						if (i_27_ < 0)
							i_27_ = -i_27_;
						if (i_27_ > 1004530707 * (((Class282_Sub20_Sub28) this).anInt9903)) {
							is_22_[i_25_] = i_26_;
							is_23_[i_25_] = i_28_;
							is_24_[i_25_] = i_29_;
						} else {
							is_22_[i_25_] = (1717090721 * ((Class282_Sub20_Sub28) this).anInt9909 * i_26_) >> 12;
							is_23_[i_25_] = (-2031017045 * ((Class282_Sub20_Sub28) this).anInt9908 * i_28_) >> 12;
							is_24_[i_25_] = i_29_ * (-1781353565 * (((Class282_Sub20_Sub28) this).anInt9907)) >> 12;
						}
					}
				}
			}
		}
		return is;
	}

	static int method15396(byte i) {
		return (Class81.anInt801 += 970031329) * -1976319199 - 1;
	}
}
