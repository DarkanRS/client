/* Class298_Sub32_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub6 extends Class298_Sub32 {
	static int anInt9354 = 409;
	static int anInt9355 = 4096;
	int anInt9356;
	int anInt9357;
	int anInt9358 = -1106251776;
	static int anInt9359 = 4096;
	int anInt9360;
	static int anInt9361 = 4096;
	int[] anIntArray9362;

	void method3137(int i, RsByteBuffer class298_sub53, byte i_0_) {
		try {
			switch (i) {
			case 1:
				((Class298_Sub32_Sub6) this).anInt9358 = class298_sub53.readUnsignedShort() * 1987830015;
				break;
			case 0:
				((Class298_Sub32_Sub6) this).anInt9356 = class298_sub53.readUnsignedShort() * -2038436167;
				break;
			case 4: {
				int i_1_ = class298_sub53.read24BitUnsignedInteger((byte) 109);
				((Class298_Sub32_Sub6) this).anIntArray9362[0] = (i_1_ & 0xff0000) << 4;
				((Class298_Sub32_Sub6) this).anIntArray9362[1] = (i_1_ & 0xff00) >> 4;
				((Class298_Sub32_Sub6) this).anIntArray9362[2] = (i_1_ & 0xff) >> 12;
				break;
			}
			case 3:
				((Class298_Sub32_Sub6) this).anInt9360 = class298_sub53.readUnsignedShort() * 2122574147;
				break;
			case 2:
				((Class298_Sub32_Sub6) this).anInt9357 = class298_sub53.readUnsignedShort() * -1725816691;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agq.r(").append(')').toString());
		}
	}

	int[][] method3132(int i, byte i_2_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 97);
			if (aClass239_7380.aBoolean2607) {
				int[][] is_3_ = method3134(0, i, (byte) 8);
				int[] is_4_ = is_3_[0];
				int[] is_5_ = is_3_[1];
				int[] is_6_ = is_3_[2];
				int[] is_7_ = is[0];
				int[] is_8_ = is[1];
				int[] is_9_ = is[2];
				for (int i_10_ = 0; i_10_ < -1474554145 * Class250.anInt2755; i_10_++) {
					int i_11_ = is_4_[i_10_];
					int i_12_ = (i_11_ - ((Class298_Sub32_Sub6) this).anIntArray9362[0]);
					if (i_12_ < 0)
						i_12_ = -i_12_;
					if (i_12_ > (((Class298_Sub32_Sub6) this).anInt9356 * 1467725705)) {
						is_7_[i_10_] = i_11_;
						is_8_[i_10_] = is_5_[i_10_];
						is_9_[i_10_] = is_6_[i_10_];
					} else {
						int i_13_ = is_5_[i_10_];
						i_12_ = i_13_ - (((Class298_Sub32_Sub6) this).anIntArray9362[1]);
						if (i_12_ < 0)
							i_12_ = -i_12_;
						if (i_12_ > (((Class298_Sub32_Sub6) this).anInt9356 * 1467725705)) {
							is_7_[i_10_] = i_11_;
							is_8_[i_10_] = i_13_;
							is_9_[i_10_] = is_6_[i_10_];
						} else {
							int i_14_ = is_6_[i_10_];
							i_12_ = i_14_ - (((Class298_Sub32_Sub6) this).anIntArray9362[2]);
							if (i_12_ < 0)
								i_12_ = -i_12_;
							if (i_12_ > (1467725705 * ((Class298_Sub32_Sub6) this).anInt9356)) {
								is_7_[i_10_] = i_11_;
								is_8_[i_10_] = i_13_;
								is_9_[i_10_] = i_14_;
							} else {
								is_7_[i_10_] = i_11_ * ((((Class298_Sub32_Sub6) this).anInt9360) * -1157633173) >> 12;
								is_8_[i_10_] = i_13_ * ((((Class298_Sub32_Sub6) this).anInt9357) * -620453307) >> 12;
								is_9_[i_10_] = i_14_ * (-322756865 * (((Class298_Sub32_Sub6) this).anInt9358)) >> 12;
							}
						}
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agq.k(").append(')').toString());
		}
	}

	void method3175(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub6) this).anInt9358 = class298_sub53.readUnsignedShort() * 1987830015;
			break;
		case 0:
			((Class298_Sub32_Sub6) this).anInt9356 = class298_sub53.readUnsignedShort() * -2038436167;
			break;
		case 4: {
			int i_15_ = class298_sub53.read24BitUnsignedInteger((byte) -48);
			((Class298_Sub32_Sub6) this).anIntArray9362[0] = (i_15_ & 0xff0000) << 4;
			((Class298_Sub32_Sub6) this).anIntArray9362[1] = (i_15_ & 0xff00) >> 4;
			((Class298_Sub32_Sub6) this).anIntArray9362[2] = (i_15_ & 0xff) >> 12;
			break;
		}
		case 3:
			((Class298_Sub32_Sub6) this).anInt9360 = class298_sub53.readUnsignedShort() * 2122574147;
			break;
		case 2:
			((Class298_Sub32_Sub6) this).anInt9357 = class298_sub53.readUnsignedShort() * -1725816691;
			break;
		}
	}

	public Class298_Sub32_Sub6() {
		super(1, false);
		((Class298_Sub32_Sub6) this).anInt9357 = 571002880;
		((Class298_Sub32_Sub6) this).anInt9360 = 1049899008;
		((Class298_Sub32_Sub6) this).anInt9356 = -496736879;
		((Class298_Sub32_Sub6) this).anIntArray9362 = new int[3];
	}

	void method3176(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub6) this).anInt9358 = class298_sub53.readUnsignedShort() * 1987830015;
			break;
		case 0:
			((Class298_Sub32_Sub6) this).anInt9356 = class298_sub53.readUnsignedShort() * -2038436167;
			break;
		case 4: {
			int i_16_ = class298_sub53.read24BitUnsignedInteger((byte) 108);
			((Class298_Sub32_Sub6) this).anIntArray9362[0] = (i_16_ & 0xff0000) << 4;
			((Class298_Sub32_Sub6) this).anIntArray9362[1] = (i_16_ & 0xff00) >> 4;
			((Class298_Sub32_Sub6) this).anIntArray9362[2] = (i_16_ & 0xff) >> 12;
			break;
		}
		case 3:
			((Class298_Sub32_Sub6) this).anInt9360 = class298_sub53.readUnsignedShort() * 2122574147;
			break;
		case 2:
			((Class298_Sub32_Sub6) this).anInt9357 = class298_sub53.readUnsignedShort() * -1725816691;
			break;
		}
	}

	int[][] method3177(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 81);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_17_ = method3134(0, i, (byte) 8);
			int[] is_18_ = is_17_[0];
			int[] is_19_ = is_17_[1];
			int[] is_20_ = is_17_[2];
			int[] is_21_ = is[0];
			int[] is_22_ = is[1];
			int[] is_23_ = is[2];
			for (int i_24_ = 0; i_24_ < -1474554145 * Class250.anInt2755; i_24_++) {
				int i_25_ = is_18_[i_24_];
				int i_26_ = i_25_ - ((Class298_Sub32_Sub6) this).anIntArray9362[0];
				if (i_26_ < 0)
					i_26_ = -i_26_;
				if (i_26_ > ((Class298_Sub32_Sub6) this).anInt9356 * 1467725705) {
					is_21_[i_24_] = i_25_;
					is_22_[i_24_] = is_19_[i_24_];
					is_23_[i_24_] = is_20_[i_24_];
				} else {
					int i_27_ = is_19_[i_24_];
					i_26_ = (i_27_ - ((Class298_Sub32_Sub6) this).anIntArray9362[1]);
					if (i_26_ < 0)
						i_26_ = -i_26_;
					if (i_26_ > (((Class298_Sub32_Sub6) this).anInt9356 * 1467725705)) {
						is_21_[i_24_] = i_25_;
						is_22_[i_24_] = i_27_;
						is_23_[i_24_] = is_20_[i_24_];
					} else {
						int i_28_ = is_20_[i_24_];
						i_26_ = i_28_ - (((Class298_Sub32_Sub6) this).anIntArray9362[2]);
						if (i_26_ < 0)
							i_26_ = -i_26_;
						if (i_26_ > 1467725705 * (((Class298_Sub32_Sub6) this).anInt9356)) {
							is_21_[i_24_] = i_25_;
							is_22_[i_24_] = i_27_;
							is_23_[i_24_] = i_28_;
						} else {
							is_21_[i_24_] = (i_25_ * (((Class298_Sub32_Sub6) this).anInt9360 * -1157633173)) >> 12;
							is_22_[i_24_] = (i_27_ * (((Class298_Sub32_Sub6) this).anInt9357 * -620453307)) >> 12;
							is_23_[i_24_] = i_28_ * (-322756865 * (((Class298_Sub32_Sub6) this).anInt9358)) >> 12;
						}
					}
				}
			}
		}
		return is;
	}

	int[][] method3178(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 19);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_29_ = method3134(0, i, (byte) 8);
			int[] is_30_ = is_29_[0];
			int[] is_31_ = is_29_[1];
			int[] is_32_ = is_29_[2];
			int[] is_33_ = is[0];
			int[] is_34_ = is[1];
			int[] is_35_ = is[2];
			for (int i_36_ = 0; i_36_ < -1474554145 * Class250.anInt2755; i_36_++) {
				int i_37_ = is_30_[i_36_];
				int i_38_ = i_37_ - ((Class298_Sub32_Sub6) this).anIntArray9362[0];
				if (i_38_ < 0)
					i_38_ = -i_38_;
				if (i_38_ > ((Class298_Sub32_Sub6) this).anInt9356 * 1467725705) {
					is_33_[i_36_] = i_37_;
					is_34_[i_36_] = is_31_[i_36_];
					is_35_[i_36_] = is_32_[i_36_];
				} else {
					int i_39_ = is_31_[i_36_];
					i_38_ = (i_39_ - ((Class298_Sub32_Sub6) this).anIntArray9362[1]);
					if (i_38_ < 0)
						i_38_ = -i_38_;
					if (i_38_ > (((Class298_Sub32_Sub6) this).anInt9356 * 1467725705)) {
						is_33_[i_36_] = i_37_;
						is_34_[i_36_] = i_39_;
						is_35_[i_36_] = is_32_[i_36_];
					} else {
						int i_40_ = is_32_[i_36_];
						i_38_ = i_40_ - (((Class298_Sub32_Sub6) this).anIntArray9362[2]);
						if (i_38_ < 0)
							i_38_ = -i_38_;
						if (i_38_ > 1467725705 * (((Class298_Sub32_Sub6) this).anInt9356)) {
							is_33_[i_36_] = i_37_;
							is_34_[i_36_] = i_39_;
							is_35_[i_36_] = i_40_;
						} else {
							is_33_[i_36_] = (i_37_ * (((Class298_Sub32_Sub6) this).anInt9360 * -1157633173)) >> 12;
							is_34_[i_36_] = (i_39_ * (((Class298_Sub32_Sub6) this).anInt9357 * -620453307)) >> 12;
							is_35_[i_36_] = i_40_ * (-322756865 * (((Class298_Sub32_Sub6) this).anInt9358)) >> 12;
						}
					}
				}
			}
		}
		return is;
	}
}
