/* Class298_Sub32_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub3 extends Class298_Sub32 {
	static int anInt9323 = 1;
	int[] anIntArray9324;
	static int anInt9325 = 2;
	static int anInt9326 = 0;
	static int anInt9327 = 0;
	int[] anIntArray9328;
	int anInt9329 = 0;
	int[][] anIntArrayArray9330;
	short[] aShortArray9331 = new short[257];

	void method3151() {
		if (null == ((Class298_Sub32_Sub3) this).anIntArrayArray9330)
			((Class298_Sub32_Sub3) this).anIntArrayArray9330 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		if (((Class298_Sub32_Sub3) this).anIntArrayArray9330.length < 2)
			throw new RuntimeException();
		if (2 == ((Class298_Sub32_Sub3) this).anInt9329 * -1105883703)
			method3155((byte) -127);
		Class250.method2396((byte) -64);
		method3154(-1265044202);
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 887884013);
			if (aClass257_7384.aBoolean2810) {
				int[] is_1_ = method3129(0, i, -1887337990);
				for (int i_2_ = 0; i_2_ < -1474554145 * Class250.anInt2755; i_2_++) {
					int i_3_ = is_1_[i_2_] >> 4;
					if (i_3_ < 0)
						i_3_ = 0;
					if (i_3_ > 256)
						i_3_ = 256;
					is[i_2_] = ((Class298_Sub32_Sub3) this).aShortArray9331[i_3_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("age.i(").append(')').toString());
		}
	}

	final int[] method3152(int i, byte i_4_) {
		try {
			if (i < 0)
				return ((Class298_Sub32_Sub3) this).anIntArray9328;
			if (i >= ((Class298_Sub32_Sub3) this).anIntArrayArray9330.length)
				return ((Class298_Sub32_Sub3) this).anIntArray9324;
			return ((Class298_Sub32_Sub3) this).anIntArrayArray9330[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("age.ac(").append(')').toString());
		}
	}

	void method3153(int i, RsByteBuffer class298_sub53) {
		if (0 == i) {
			((Class298_Sub32_Sub3) this).anInt9329 = class298_sub53.readUnsignedByte() * 417209465;
			((Class298_Sub32_Sub3) this).anIntArrayArray9330 = new int[class298_sub53.readUnsignedByte()][2];
			for (int i_5_ = 0; (i_5_ < ((Class298_Sub32_Sub3) this).anIntArrayArray9330.length); i_5_++) {
				((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_5_][0] = class298_sub53.readUnsignedShort();
				((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_5_][1] = class298_sub53.readUnsignedShort();
			}
		}
	}

	void method3154(int i) {
		try {
			switch (((Class298_Sub32_Sub3) this).anInt9329 * -1105883703) {
			default:
				for (int i_6_ = 0; i_6_ < 257; i_6_++) {
					int i_7_ = i_6_ << 4;
					int i_8_;
					for (i_8_ = 1; i_8_ < (((Class298_Sub32_Sub3) this).anIntArrayArray9330).length - 1; i_8_++) {
						if ((((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_8_][0]) > i_7_) {
							if (i != -1265044202) {
								/* empty */
							}
							break;
						}
					}
					int[] is = (((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_8_ - 1]);
					int[] is_9_ = (((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_8_]);
					int i_10_ = (i_7_ - is[0] << 12) / (is_9_[0] - is[0]);
					int i_11_ = 4096 - i_10_;
					int i_12_ = i_11_ * is[1] + i_10_ * is_9_[1] >> 12;
					if (i_12_ <= -32768)
						i_12_ = -32767;
					if (i_12_ >= 32768)
						i_12_ = 32767;
					((Class298_Sub32_Sub3) this).aShortArray9331[i_6_] = (short) i_12_;
				}
				break;
			case 1:
				for (int i_13_ = 0; i_13_ < 257; i_13_++) {
					int i_14_ = i_13_ << 4;
					int i_15_;
					for (i_15_ = 1; i_15_ < (((Class298_Sub32_Sub3) this).anIntArrayArray9330).length - 1; i_15_++) {
						if ((((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_15_][0]) > i_14_) {
							if (i != -1265044202)
								throw new IllegalStateException();
							break;
						}
					}
					int[] is = (((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_15_ - 1]);
					int[] is_16_ = (((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_15_]);
					int i_17_ = (i_14_ - is[0] << 12) / (is_16_[0] - is[0]);
					int i_18_ = (4096 - Class250.anIntArray2763[i_17_ >> 5 & 0xff] >> 1);
					int i_19_ = 4096 - i_18_;
					int i_20_ = is[1] * i_19_ + is_16_[1] * i_18_ >> 12;
					if (i_20_ <= -32768)
						i_20_ = -32767;
					if (i_20_ >= 32768)
						i_20_ = 32767;
					((Class298_Sub32_Sub3) this).aShortArray9331[i_13_] = (short) i_20_;
				}
				break;
			case 2:
				for (int i_21_ = 0; i_21_ < 257; i_21_++) {
					int i_22_ = i_21_ << 4;
					int i_23_;
					for (i_23_ = 1; i_23_ < (((Class298_Sub32_Sub3) this).anIntArrayArray9330).length - 1; i_23_++) {
						if ((((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_23_][0]) > i_22_) {
							if (i != -1265044202) {
								/* empty */
							}
							break;
						}
					}
					int[] is = (((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_23_ - 1]);
					int[] is_24_ = (((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_23_]);
					int i_25_ = method3152(i_23_ - 2, (byte) 20)[1];
					int i_26_ = is[1];
					int i_27_ = is_24_[1];
					int i_28_ = method3152(1 + i_23_, (byte) 30)[1];
					int i_29_ = (i_22_ - is[0] << 12) / (is_24_[0] - is[0]);
					int i_30_ = i_29_ * i_29_ >> 12;
					int i_31_ = i_26_ + (i_28_ - i_27_ - i_25_);
					int i_32_ = i_25_ - i_26_ - i_31_;
					int i_33_ = i_27_ - i_25_;
					int i_34_ = i_26_;
					int i_35_ = i_30_ * (i_31_ * i_29_ >> 12) >> 12;
					int i_36_ = i_30_ * i_32_ >> 12;
					int i_37_ = i_29_ * i_33_ >> 12;
					int i_38_ = i_34_ + (i_37_ + (i_35_ + i_36_));
					if (i_38_ <= -32768)
						i_38_ = -32767;
					if (i_38_ >= 32768)
						i_38_ = 32767;
					((Class298_Sub32_Sub3) this).aShortArray9331[i_21_] = (short) i_38_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("age.am(").append(')').toString());
		}
	}

	void method3133(int i) {
		try {
			if (null == ((Class298_Sub32_Sub3) this).anIntArrayArray9330)
				((Class298_Sub32_Sub3) this).anIntArrayArray9330 = new int[][] { { 0, 0 }, { 4096, 4096 } };
			if (((Class298_Sub32_Sub3) this).anIntArrayArray9330.length < 2)
				throw new RuntimeException();
			if (2 == ((Class298_Sub32_Sub3) this).anInt9329 * -1105883703)
				method3155((byte) -127);
			Class250.method2396((byte) -67);
			method3154(-1265044202);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("age.x(").append(')').toString());
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_39_) {
		try {
			if (0 == i) {
				((Class298_Sub32_Sub3) this).anInt9329 = class298_sub53.readUnsignedByte() * 417209465;
				((Class298_Sub32_Sub3) this).anIntArrayArray9330 = new int[class298_sub53.readUnsignedByte()][2];
				for (int i_40_ = 0; i_40_ < (((Class298_Sub32_Sub3) this).anIntArrayArray9330).length; i_40_++) {
					((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_40_][0] = class298_sub53.readUnsignedShort();
					((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_40_][1] = class298_sub53.readUnsignedShort();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("age.r(").append(')').toString());
		}
	}

	final void method3155(byte i) {
		try {
			int[] is = ((Class298_Sub32_Sub3) this).anIntArrayArray9330[0];
			int[] is_41_ = ((Class298_Sub32_Sub3) this).anIntArrayArray9330[1];
			int[] is_42_ = (((Class298_Sub32_Sub3) this).anIntArrayArray9330[(((Class298_Sub32_Sub3) this).anIntArrayArray9330.length - 2)]);
			int[] is_43_ = (((Class298_Sub32_Sub3) this).anIntArrayArray9330[(((Class298_Sub32_Sub3) this).anIntArrayArray9330.length - 1)]);
			((Class298_Sub32_Sub3) this).anIntArray9328 = new int[] { is[0] + (is[0] - is_41_[0]), is[1] - is_41_[1] + is[1] };
			((Class298_Sub32_Sub3) this).anIntArray9324 = new int[] { is_42_[0] - is_43_[0] + is_42_[0], is_42_[1] + (is_42_[1] - is_43_[1]) };
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("age.bd(").append(')').toString());
		}
	}

	int[] method3156(int i) {
		int[] is = aClass257_7384.method2448(i, 131024286);
		if (aClass257_7384.aBoolean2810) {
			int[] is_44_ = method3129(0, i, -1887337990);
			for (int i_45_ = 0; i_45_ < -1474554145 * Class250.anInt2755; i_45_++) {
				int i_46_ = is_44_[i_45_] >> 4;
				if (i_46_ < 0)
					i_46_ = 0;
				if (i_46_ > 256)
					i_46_ = 256;
				is[i_45_] = ((Class298_Sub32_Sub3) this).aShortArray9331[i_46_];
			}
		}
		return is;
	}

	void method3157() {
		if (null == ((Class298_Sub32_Sub3) this).anIntArrayArray9330)
			((Class298_Sub32_Sub3) this).anIntArrayArray9330 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		if (((Class298_Sub32_Sub3) this).anIntArrayArray9330.length < 2)
			throw new RuntimeException();
		if (2 == ((Class298_Sub32_Sub3) this).anInt9329 * -1105883703)
			method3155((byte) -121);
		Class250.method2396((byte) 52);
		method3154(-1265044202);
	}

	void method3158() {
		if (null == ((Class298_Sub32_Sub3) this).anIntArrayArray9330)
			((Class298_Sub32_Sub3) this).anIntArrayArray9330 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		if (((Class298_Sub32_Sub3) this).anIntArrayArray9330.length < 2)
			throw new RuntimeException();
		if (2 == ((Class298_Sub32_Sub3) this).anInt9329 * -1105883703)
			method3155((byte) -99);
		Class250.method2396((byte) 58);
		method3154(-1265044202);
	}

	void method3159(int i, RsByteBuffer class298_sub53) {
		if (0 == i) {
			((Class298_Sub32_Sub3) this).anInt9329 = class298_sub53.readUnsignedByte() * 417209465;
			((Class298_Sub32_Sub3) this).anIntArrayArray9330 = new int[class298_sub53.readUnsignedByte()][2];
			for (int i_47_ = 0; (i_47_ < ((Class298_Sub32_Sub3) this).anIntArrayArray9330.length); i_47_++) {
				((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_47_][0] = class298_sub53.readUnsignedShort();
				((Class298_Sub32_Sub3) this).anIntArrayArray9330[i_47_][1] = class298_sub53.readUnsignedShort();
			}
		}
	}

	int[] method3160(int i) {
		int[] is = aClass257_7384.method2448(i, 997676462);
		if (aClass257_7384.aBoolean2810) {
			int[] is_48_ = method3129(0, i, -1887337990);
			for (int i_49_ = 0; i_49_ < -1474554145 * Class250.anInt2755; i_49_++) {
				int i_50_ = is_48_[i_49_] >> 4;
				if (i_50_ < 0)
					i_50_ = 0;
				if (i_50_ > 256)
					i_50_ = 256;
				is[i_49_] = ((Class298_Sub32_Sub3) this).aShortArray9331[i_50_];
			}
		}
		return is;
	}

	public Class298_Sub32_Sub3() {
		super(1, true);
	}
}
