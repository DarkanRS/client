/* Class298_Sub32_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub34 extends Class298_Sub32 {
	static int anInt9535 = 4;
	static int anInt9536 = 4;
	static int anInt9537 = 1638;
	static int anInt9538 = 0;
	static boolean aBoolean9539 = true;
	short[] aShortArray9540;
	short[] aShortArray9541;
	byte[] aByteArray9542 = new byte[512];
	int anInt9543 = 0;
	int anInt9544;
	int anInt9545;
	int anInt9546 = 277731988;
	int anInt9547;
	boolean aBoolean9548;
	static int anInt9549 = 8;

	void method3354(short i) {
		try {
			if (993272049 * ((Class298_Sub32_Sub34) this).anInt9544 > 0) {
				((Class298_Sub32_Sub34) this).aShortArray9540 = (new short[832987241 * ((Class298_Sub32_Sub34) this).anInt9547]);
				((Class298_Sub32_Sub34) this).aShortArray9541 = (new short[((Class298_Sub32_Sub34) this).anInt9547 * 832987241]);
				for (int i_0_ = 0; (i_0_ < 832987241 * ((Class298_Sub32_Sub34) this).anInt9547); i_0_++) {
					((Class298_Sub32_Sub34) this).aShortArray9540[i_0_] = (short) (int) ((Math.pow((double) ((float) (993272049 * (((Class298_Sub32_Sub34) this).anInt9544)) / 4096.0F), (double) i_0_)) * 4096.0);
					((Class298_Sub32_Sub34) this).aShortArray9541[i_0_] = (short) (int) Math.pow(2.0, (double) i_0_);
				}
			} else if (((Class298_Sub32_Sub34) this).aShortArray9540 != null && (((Class298_Sub32_Sub34) this).anInt9547 * 832987241 == (((Class298_Sub32_Sub34) this).aShortArray9540).length)) {
				((Class298_Sub32_Sub34) this).aShortArray9541 = (new short[((Class298_Sub32_Sub34) this).anInt9547 * 832987241]);
				for (int i_1_ = 0; (i_1_ < ((Class298_Sub32_Sub34) this).anInt9547 * 832987241); i_1_++)
					((Class298_Sub32_Sub34) this).aShortArray9541[i_1_] = (short) (int) Math.pow(2.0, (double) i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahw.bd(").append(')').toString());
		}
	}

	int method3355(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			int i_8_ = i >> 12;
			int i_9_ = 1 + i_8_;
			if (i_9_ >= i_6_)
				i_9_ = 0;
			i &= 0xfff;
			i_8_ &= 0xff;
			i_9_ &= 0xff;
			int i_10_ = i - 4096;
			int i_11_ = i_2_ - 4096;
			int i_12_ = Class213.anIntArray2444[i];
			int i_13_ = (((Class298_Sub32_Sub34) this).aByteArray9542[i_8_ + i_3_] & 0x3);
			int i_14_;
			if (i_13_ <= 1)
				i_14_ = 0 == i_13_ ? i + i_2_ : i_2_ - i;
			else
				i_14_ = 2 == i_13_ ? i - i_2_ : -i - i_2_;
			i_13_ = (((Class298_Sub32_Sub34) this).aByteArray9542[i_9_ + i_3_] & 0x3);
			int i_15_;
			if (i_13_ <= 1)
				i_15_ = i_13_ == 0 ? i_2_ + i_10_ : i_2_ - i_10_;
			else
				i_15_ = 2 == i_13_ ? i_10_ - i_2_ : -i_10_ - i_2_;
			int i_16_ = i_14_ + ((i_15_ - i_14_) * i_12_ >> 12);
			i_13_ = (((Class298_Sub32_Sub34) this).aByteArray9542[i_8_ + i_4_] & 0x3);
			if (i_13_ <= 1)
				i_14_ = i_13_ == 0 ? i + i_11_ : i_11_ - i;
			else
				i_14_ = i_13_ == 2 ? i - i_11_ : -i - i_11_;
			i_13_ = (((Class298_Sub32_Sub34) this).aByteArray9542[i_4_ + i_9_] & 0x3);
			if (i_13_ <= 1)
				i_15_ = i_13_ == 0 ? i_10_ + i_11_ : i_11_ - i_10_;
			else
				i_15_ = 2 == i_13_ ? i_10_ - i_11_ : -i_10_ - i_11_;
			int i_17_ = i_14_ + (i_12_ * (i_15_ - i_14_) >> 12);
			return ((i_17_ - i_16_) * i_5_ >> 12) + i_16_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahw.am(").append(')').toString());
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_18_) {
		try {
			switch (i) {
			case 2:
				((Class298_Sub32_Sub34) this).anInt9544 = class298_sub53.readShort(1683252364) * 52875281;
				if (993272049 * ((Class298_Sub32_Sub34) this).anInt9544 < 0) {
					((Class298_Sub32_Sub34) this).aShortArray9540 = new short[832987241 * (((Class298_Sub32_Sub34) this).anInt9547)];
					for (int i_19_ = 0; i_19_ < (832987241 * ((Class298_Sub32_Sub34) this).anInt9547); i_19_++)
						((Class298_Sub32_Sub34) this).aShortArray9540[i_19_] = (short) class298_sub53.readShort(2045257879);
				}
				break;
			case 1:
				((Class298_Sub32_Sub34) this).anInt9547 = class298_sub53.readUnsignedByte() * -1820512295;
				break;
			case 0:
				((Class298_Sub32_Sub34) this).aBoolean9548 = class298_sub53.readUnsignedByte() == 1;
				break;
			case 5:
				((Class298_Sub32_Sub34) this).anInt9546 = class298_sub53.readUnsignedByte() * 1143174821;
				break;
			case 4:
				((Class298_Sub32_Sub34) this).anInt9543 = class298_sub53.readUnsignedByte() * -1333197873;
				break;
			case 6:
				((Class298_Sub32_Sub34) this).anInt9545 = class298_sub53.readUnsignedByte() * 2124139087;
				break;
			case 3:
				((Class298_Sub32_Sub34) this).anInt9546 = ((((Class298_Sub32_Sub34) this).anInt9545 = class298_sub53.readUnsignedByte() * 2124139087) * -1849370933);
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahw.r(").append(')').toString());
		}
	}

	void method3356(int i, int[] is, int i_20_) {
		try {
			int i_21_ = (((Class298_Sub32_Sub34) this).anInt9545 * 963316911 * Class250.anIntArray2760[i]);
			if (((Class298_Sub32_Sub34) this).anInt9547 * 832987241 == 1) {
				int i_22_ = ((Class298_Sub32_Sub34) this).aShortArray9540[0];
				int i_23_ = ((Class298_Sub32_Sub34) this).aShortArray9541[0] << 12;
				int i_24_ = (i_23_ * (((Class298_Sub32_Sub34) this).anInt9545 * 963316911) >> 12);
				int i_25_ = (i_23_ * (((Class298_Sub32_Sub34) this).anInt9546 * 1428128045) >> 12);
				int i_26_ = i_21_ * i_23_ >> 12;
				int i_27_ = i_26_ >> 12;
				int i_28_ = 1 + i_27_;
				if (i_28_ >= i_24_)
					i_28_ = 0;
				i_26_ &= 0xfff;
				int i_29_ = Class213.anIntArray2444[i_26_];
				int i_30_ = ((((Class298_Sub32_Sub34) this).aByteArray9542[i_27_ & 0xff]) & 0xff);
				int i_31_ = ((((Class298_Sub32_Sub34) this).aByteArray9542[i_28_ & 0xff]) & 0xff);
				if (((Class298_Sub32_Sub34) this).aBoolean9548) {
					for (int i_32_ = 0; i_32_ < -1474554145 * Class250.anInt2755; i_32_++) {
						int i_33_ = (1428128045 * ((Class298_Sub32_Sub34) this).anInt9546 * Class250.anIntArray2762[i_32_]);
						int i_34_ = method3355(i_23_ * i_33_ >> 12, i_26_, i_30_, i_31_, i_29_, i_25_, 1556942442);
						i_34_ = i_34_ * i_22_ >> 12;
						is[i_32_] = (i_34_ >> 1) + 2048;
					}
				} else {
					for (int i_35_ = 0; i_35_ < Class250.anInt2755 * -1474554145; i_35_++) {
						int i_36_ = (((Class298_Sub32_Sub34) this).anInt9546 * 1428128045 * Class250.anIntArray2762[i_35_]);
						int i_37_ = method3355(i_36_ * i_23_ >> 12, i_26_, i_30_, i_31_, i_29_, i_25_, 1069393603);
						is[i_35_] = i_22_ * i_37_ >> 12;
					}
				}
			} else {
				int i_38_ = ((Class298_Sub32_Sub34) this).aShortArray9540[0];
				if (i_38_ > 8 || i_38_ < -8) {
					int i_39_ = (((Class298_Sub32_Sub34) this).aShortArray9541[0] << 12);
					int i_40_ = (i_39_ * (((Class298_Sub32_Sub34) this).anInt9545 * 963316911) >> 12);
					int i_41_ = ((1428128045 * ((Class298_Sub32_Sub34) this).anInt9546 * i_39_) >> 12);
					int i_42_ = i_39_ * i_21_ >> 12;
					int i_43_ = i_42_ >> 12;
					int i_44_ = i_43_ + 1;
					if (i_44_ >= i_40_)
						i_44_ = 0;
					i_42_ &= 0xfff;
					int i_45_ = Class213.anIntArray2444[i_42_];
					int i_46_ = ((((Class298_Sub32_Sub34) this).aByteArray9542[i_43_ & 0xff]) & 0xff);
					int i_47_ = ((((Class298_Sub32_Sub34) this).aByteArray9542[i_44_ & 0xff]) & 0xff);
					for (int i_48_ = 0; i_48_ < -1474554145 * Class250.anInt2755; i_48_++) {
						int i_49_ = (1428128045 * ((Class298_Sub32_Sub34) this).anInt9546 * Class250.anIntArray2762[i_48_]);
						int i_50_ = method3355(i_49_ * i_39_ >> 12, i_42_, i_46_, i_47_, i_45_, i_41_, 818948604);
						is[i_48_] = i_38_ * i_50_ >> 12;
					}
				}
				for (int i_51_ = 1; (i_51_ < 832987241 * ((Class298_Sub32_Sub34) this).anInt9547); i_51_++) {
					i_38_ = ((Class298_Sub32_Sub34) this).aShortArray9540[i_51_];
					if (i_38_ > 8 || i_38_ < -8) {
						int i_52_ = ((((Class298_Sub32_Sub34) this).aShortArray9541[i_51_]) << 12);
						int i_53_ = (i_52_ * (((Class298_Sub32_Sub34) this).anInt9545 * 963316911) >> 12);
						int i_54_ = (i_52_ * (((Class298_Sub32_Sub34) this).anInt9546 * 1428128045) >> 12);
						int i_55_ = i_52_ * i_21_ >> 12;
						int i_56_ = i_55_ >> 12;
						int i_57_ = 1 + i_56_;
						if (i_57_ >= i_53_)
							i_57_ = 0;
						i_55_ &= 0xfff;
						int i_58_ = Class213.anIntArray2444[i_55_];
						int i_59_ = ((((Class298_Sub32_Sub34) this).aByteArray9542[i_56_ & 0xff]) & 0xff);
						int i_60_ = ((((Class298_Sub32_Sub34) this).aByteArray9542[i_57_ & 0xff]) & 0xff);
						if (((Class298_Sub32_Sub34) this).aBoolean9548 && i_51_ == (((Class298_Sub32_Sub34) this).anInt9547) * 832987241 - 1) {
							for (int i_61_ = 0; i_61_ < -1474554145 * Class250.anInt2755; i_61_++) {
								int i_62_ = (Class250.anIntArray2762[i_61_] * (1428128045 * (((Class298_Sub32_Sub34) this).anInt9546)));
								int i_63_ = method3355(i_62_ * i_52_ >> 12, i_55_, i_59_, i_60_, i_58_, i_54_, 2029664133);
								i_63_ = is[i_61_] + (i_63_ * i_38_ >> 12);
								is[i_61_] = (i_63_ >> 1) + 2048;
							}
						} else {
							for (int i_64_ = 0; i_64_ < Class250.anInt2755 * -1474554145; i_64_++) {
								int i_65_ = (Class250.anIntArray2762[i_64_] * (1428128045 * (((Class298_Sub32_Sub34) this).anInt9546)));
								int i_66_ = method3355(i_52_ * i_65_ >> 12, i_55_, i_59_, i_60_, i_58_, i_54_, 1960253122);
								is[i_64_] += i_38_ * i_66_ >> 12;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahw.ac(").append(')').toString());
		}
	}

	void method3357(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 2:
			((Class298_Sub32_Sub34) this).anInt9544 = class298_sub53.readShort(2118380070) * 52875281;
			if (993272049 * ((Class298_Sub32_Sub34) this).anInt9544 < 0) {
				((Class298_Sub32_Sub34) this).aShortArray9540 = (new short[832987241 * ((Class298_Sub32_Sub34) this).anInt9547]);
				for (int i_67_ = 0; (i_67_ < 832987241 * ((Class298_Sub32_Sub34) this).anInt9547); i_67_++)
					((Class298_Sub32_Sub34) this).aShortArray9540[i_67_] = (short) class298_sub53.readShort(1991735410);
			}
			break;
		case 1:
			((Class298_Sub32_Sub34) this).anInt9547 = class298_sub53.readUnsignedByte() * -1820512295;
			break;
		case 0:
			((Class298_Sub32_Sub34) this).aBoolean9548 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 5:
			((Class298_Sub32_Sub34) this).anInt9546 = class298_sub53.readUnsignedByte() * 1143174821;
			break;
		case 4:
			((Class298_Sub32_Sub34) this).anInt9543 = class298_sub53.readUnsignedByte() * -1333197873;
			break;
		case 6:
			((Class298_Sub32_Sub34) this).anInt9545 = class298_sub53.readUnsignedByte() * 2124139087;
			break;
		case 3:
			((Class298_Sub32_Sub34) this).anInt9546 = ((((Class298_Sub32_Sub34) this).anInt9545 = class298_sub53.readUnsignedByte() * 2124139087) * -1849370933);
			break;
		}
	}

	int[] method3131(int i, int i_68_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1918477853);
			if (aClass257_7384.aBoolean2810)
				method3356(i, is, -1917282940);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahw.i(").append(')').toString());
		}
	}

	void method3358() {
		((Class298_Sub32_Sub34) this).aByteArray9542 = Class250.method2395((((Class298_Sub32_Sub34) this).anInt9543 * -1656937681), (byte) 20);
		method3354((short) 1115);
		for (int i = 832987241 * ((Class298_Sub32_Sub34) this).anInt9547 - 1; i >= 1; i--) {
			short i_69_ = ((Class298_Sub32_Sub34) this).aShortArray9540[i];
			if (i_69_ > 8 || i_69_ < -8)
				break;
			((Class298_Sub32_Sub34) this).anInt9547 -= -1820512295;
		}
	}

	void method3359() {
		((Class298_Sub32_Sub34) this).aByteArray9542 = Class250.method2395((((Class298_Sub32_Sub34) this).anInt9543 * -1656937681), (byte) 106);
		method3354((short) -8674);
		for (int i = 832987241 * ((Class298_Sub32_Sub34) this).anInt9547 - 1; i >= 1; i--) {
			short i_70_ = ((Class298_Sub32_Sub34) this).aShortArray9540[i];
			if (i_70_ > 8 || i_70_ < -8)
				break;
			((Class298_Sub32_Sub34) this).anInt9547 -= -1820512295;
		}
	}

	void method3360() {
		((Class298_Sub32_Sub34) this).aByteArray9542 = Class250.method2395((((Class298_Sub32_Sub34) this).anInt9543 * -1656937681), (byte) 6);
		method3354((short) -21404);
		for (int i = 832987241 * ((Class298_Sub32_Sub34) this).anInt9547 - 1; i >= 1; i--) {
			short i_71_ = ((Class298_Sub32_Sub34) this).aShortArray9540[i];
			if (i_71_ > 8 || i_71_ < -8)
				break;
			((Class298_Sub32_Sub34) this).anInt9547 -= -1820512295;
		}
	}

	void method3361(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 2:
			((Class298_Sub32_Sub34) this).anInt9544 = class298_sub53.readShort(2106445483) * 52875281;
			if (993272049 * ((Class298_Sub32_Sub34) this).anInt9544 < 0) {
				((Class298_Sub32_Sub34) this).aShortArray9540 = (new short[832987241 * ((Class298_Sub32_Sub34) this).anInt9547]);
				for (int i_72_ = 0; (i_72_ < 832987241 * ((Class298_Sub32_Sub34) this).anInt9547); i_72_++)
					((Class298_Sub32_Sub34) this).aShortArray9540[i_72_] = (short) class298_sub53.readShort(1806711607);
			}
			break;
		case 1:
			((Class298_Sub32_Sub34) this).anInt9547 = class298_sub53.readUnsignedByte() * -1820512295;
			break;
		case 0:
			((Class298_Sub32_Sub34) this).aBoolean9548 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 5:
			((Class298_Sub32_Sub34) this).anInt9546 = class298_sub53.readUnsignedByte() * 1143174821;
			break;
		case 4:
			((Class298_Sub32_Sub34) this).anInt9543 = class298_sub53.readUnsignedByte() * -1333197873;
			break;
		case 6:
			((Class298_Sub32_Sub34) this).anInt9545 = class298_sub53.readUnsignedByte() * 2124139087;
			break;
		case 3:
			((Class298_Sub32_Sub34) this).anInt9546 = ((((Class298_Sub32_Sub34) this).anInt9545 = class298_sub53.readUnsignedByte() * 2124139087) * -1849370933);
			break;
		}
	}

	int[] method3362(int i) {
		int[] is = aClass257_7384.method2448(i, 1993749029);
		if (aClass257_7384.aBoolean2810)
			method3356(i, is, -1997133557);
		return is;
	}

	public Class298_Sub32_Sub34() {
		super(0, true);
		((Class298_Sub32_Sub34) this).anInt9545 = -93378244;
		((Class298_Sub32_Sub34) this).anInt9547 = 1307885412;
		((Class298_Sub32_Sub34) this).anInt9544 = 710364358;
		((Class298_Sub32_Sub34) this).aBoolean9548 = true;
	}

	void method3133(int i) {
		try {
			((Class298_Sub32_Sub34) this).aByteArray9542 = Class250.method2395((((Class298_Sub32_Sub34) this).anInt9543 * -1656937681), (byte) -21);
			method3354((short) -24216);
			for (int i_73_ = 832987241 * ((Class298_Sub32_Sub34) this).anInt9547 - 1; i_73_ >= 1; i_73_--) {
				short i_74_ = ((Class298_Sub32_Sub34) this).aShortArray9540[i_73_];
				if (i_74_ > 8 || i_74_ < -8)
					break;
				((Class298_Sub32_Sub34) this).anInt9547 -= -1820512295;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahw.x(").append(')').toString());
		}
	}

	int[] method3363(int i) {
		int[] is = aClass257_7384.method2448(i, 1441765254);
		if (aClass257_7384.aBoolean2810)
			method3356(i, is, -2123444089);
		return is;
	}

	static final void method3364(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -897734805) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1285 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahw.ng(").append(')').toString());
		}
	}
}
