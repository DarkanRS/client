/* Class282_Sub20_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub4 extends Class282_Sub20 {
	int anInt9725;
	boolean aBool9726;
	static final int anInt9727 = 8;
	static final int anInt9728 = 0;
	static final boolean aBool9729 = true;
	short[] aShortArray9730;
	short[] aShortArray9731;
	byte[] aByteArray9732 = new byte[512];
	int anInt9733 = 0;
	static final int anInt9734 = 4;
	int anInt9735;
	int anInt9736;
	int anInt9737;
	static final int anInt9738 = 1638;
	static final int anInt9739 = 4;

	void method15196() {
		if (((Class282_Sub20_Sub4) this).anInt9737 * -1636582777 > 0) {
			((Class282_Sub20_Sub4) this).aShortArray9730 = (new short[((Class282_Sub20_Sub4) this).anInt9736 * 2066538959]);
			((Class282_Sub20_Sub4) this).aShortArray9731 = (new short[2066538959 * ((Class282_Sub20_Sub4) this).anInt9736]);
			for (int i = 0; i < ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959; i++) {
				((Class282_Sub20_Sub4) this).aShortArray9730[i] = (short) (int) ((Math.pow((double) ((float) (((Class282_Sub20_Sub4) this).anInt9737 * -1636582777) / 4096.0F), (double) i)) * 4096.0);
				((Class282_Sub20_Sub4) this).aShortArray9731[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else if (null != ((Class282_Sub20_Sub4) this).aShortArray9730 && (((Class282_Sub20_Sub4) this).aShortArray9730.length == (((Class282_Sub20_Sub4) this).anInt9736 * 2066538959))) {
			((Class282_Sub20_Sub4) this).aShortArray9731 = (new short[((Class282_Sub20_Sub4) this).anInt9736 * 2066538959]);
			for (int i = 0; i < 2066538959 * ((Class282_Sub20_Sub4) this).anInt9736; i++)
				((Class282_Sub20_Sub4) this).aShortArray9731[i] = (short) (int) Math.pow(2.0, (double) i);
		}
	}

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, -818239034);
		if (aClass320_7667.aBool3722)
			method15197(i, is, 915556346);
		return is;
	}

	void method15197(int i, int[] is, int i_1_) {
		int i_2_ = (((Class282_Sub20_Sub4) this).anInt9735 * 2078254329 * Class316.anIntArray3668[i]);
		if (1 == ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959) {
			int i_3_ = ((Class282_Sub20_Sub4) this).aShortArray9730[0];
			int i_4_ = ((Class282_Sub20_Sub4) this).aShortArray9731[0] << 12;
			int i_5_ = (2078254329 * ((Class282_Sub20_Sub4) this).anInt9735 * i_4_ >> 12);
			int i_6_ = (((Class282_Sub20_Sub4) this).anInt9725 * -1325221513 * i_4_ >> 12);
			int i_7_ = i_4_ * i_2_ >> 12;
			int i_8_ = i_7_ >> 12;
			int i_9_ = i_8_ + 1;
			if (i_9_ >= i_5_)
				i_9_ = 0;
			i_7_ &= 0xfff;
			int i_10_ = Class370.anIntArray4291[i_7_];
			int i_11_ = (((Class282_Sub20_Sub4) this).aByteArray9732[i_8_ & 0xff] & 0xff);
			int i_12_ = (((Class282_Sub20_Sub4) this).aByteArray9732[i_9_ & 0xff] & 0xff);
			if (((Class282_Sub20_Sub4) this).aBool9726) {
				for (int i_13_ = 0; i_13_ < -402153223 * Class316.anInt3670; i_13_++) {
					int i_14_ = (Class316.anIntArray3672[i_13_] * (((Class282_Sub20_Sub4) this).anInt9725 * -1325221513));
					int i_15_ = method15198(i_4_ * i_14_ >> 12, i_7_, i_11_, i_12_, i_10_, i_6_, 935457366);
					i_15_ = i_3_ * i_15_ >> 12;
					is[i_13_] = (i_15_ >> 1) + 2048;
				}
			} else {
				for (int i_16_ = 0; i_16_ < -402153223 * Class316.anInt3670; i_16_++) {
					int i_17_ = (Class316.anIntArray3672[i_16_] * (((Class282_Sub20_Sub4) this).anInt9725 * -1325221513));
					int i_18_ = method15198(i_4_ * i_17_ >> 12, i_7_, i_11_, i_12_, i_10_, i_6_, 212886894);
					is[i_16_] = i_3_ * i_18_ >> 12;
				}
			}
		} else {
			int i_19_ = ((Class282_Sub20_Sub4) this).aShortArray9730[0];
			if (i_19_ > 8 || i_19_ < -8) {
				int i_20_ = ((Class282_Sub20_Sub4) this).aShortArray9731[0] << 12;
				int i_21_ = ((((Class282_Sub20_Sub4) this).anInt9735 * 2078254329 * i_20_) >> 12);
				int i_22_ = (i_20_ * (-1325221513 * ((Class282_Sub20_Sub4) this).anInt9725) >> 12);
				int i_23_ = i_2_ * i_20_ >> 12;
				int i_24_ = i_23_ >> 12;
				int i_25_ = 1 + i_24_;
				if (i_25_ >= i_21_)
					i_25_ = 0;
				i_23_ &= 0xfff;
				int i_26_ = Class370.anIntArray4291[i_23_];
				int i_27_ = ((((Class282_Sub20_Sub4) this).aByteArray9732[i_24_ & 0xff]) & 0xff);
				int i_28_ = ((((Class282_Sub20_Sub4) this).aByteArray9732[i_25_ & 0xff]) & 0xff);
				for (int i_29_ = 0; i_29_ < -402153223 * Class316.anInt3670; i_29_++) {
					int i_30_ = (-1325221513 * ((Class282_Sub20_Sub4) this).anInt9725 * Class316.anIntArray3672[i_29_]);
					int i_31_ = method15198(i_20_ * i_30_ >> 12, i_23_, i_27_, i_28_, i_26_, i_22_, -1130626072);
					is[i_29_] = i_31_ * i_19_ >> 12;
				}
			}
			for (int i_32_ = 1; i_32_ < 2066538959 * ((Class282_Sub20_Sub4) this).anInt9736; i_32_++) {
				i_19_ = ((Class282_Sub20_Sub4) this).aShortArray9730[i_32_];
				if (i_19_ > 8 || i_19_ < -8) {
					int i_33_ = (((Class282_Sub20_Sub4) this).aShortArray9731[i_32_] << 12);
					int i_34_ = ((2078254329 * ((Class282_Sub20_Sub4) this).anInt9735 * i_33_) >> 12);
					int i_35_ = i_33_ * (((Class282_Sub20_Sub4) this).anInt9725 * -1325221513) >> 12;
					int i_36_ = i_2_ * i_33_ >> 12;
					int i_37_ = i_36_ >> 12;
					int i_38_ = 1 + i_37_;
					if (i_38_ >= i_34_)
						i_38_ = 0;
					i_36_ &= 0xfff;
					int i_39_ = Class370.anIntArray4291[i_36_];
					int i_40_ = ((((Class282_Sub20_Sub4) this).aByteArray9732[i_37_ & 0xff]) & 0xff);
					int i_41_ = ((((Class282_Sub20_Sub4) this).aByteArray9732[i_38_ & 0xff]) & 0xff);
					if (((Class282_Sub20_Sub4) this).aBool9726 && (2066538959 * ((Class282_Sub20_Sub4) this).anInt9736 - 1) == i_32_) {
						for (int i_42_ = 0; i_42_ < -402153223 * Class316.anInt3670; i_42_++) {
							int i_43_ = (-1325221513 * ((Class282_Sub20_Sub4) this).anInt9725 * Class316.anIntArray3672[i_42_]);
							int i_44_ = method15198(i_43_ * i_33_ >> 12, i_36_, i_40_, i_41_, i_39_, i_35_, -1043556864);
							i_44_ = is[i_42_] + (i_19_ * i_44_ >> 12);
							is[i_42_] = 2048 + (i_44_ >> 1);
						}
					} else {
						for (int i_45_ = 0; i_45_ < Class316.anInt3670 * -402153223; i_45_++) {
							int i_46_ = (-1325221513 * ((Class282_Sub20_Sub4) this).anInt9725 * Class316.anIntArray3672[i_45_]);
							int i_47_ = method15198(i_33_ * i_46_ >> 12, i_36_, i_40_, i_41_, i_39_, i_35_, 2020473626);
							is[i_45_] += i_47_ * i_19_ >> 12;
						}
					}
				}
			}
		}
	}

	int method15198(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_) {
		int i_54_ = i >> 12;
		int i_55_ = 1 + i_54_;
		if (i_55_ >= i_52_)
			i_55_ = 0;
		i &= 0xfff;
		i_54_ &= 0xff;
		i_55_ &= 0xff;
		int i_56_ = i - 4096;
		int i_57_ = i_48_ - 4096;
		int i_58_ = Class370.anIntArray4291[i];
		int i_59_ = ((Class282_Sub20_Sub4) this).aByteArray9732[i_54_ + i_49_] & 0x3;
		int i_60_;
		if (i_59_ <= 1)
			i_60_ = 0 == i_59_ ? i + i_48_ : i_48_ - i;
		else
			i_60_ = i_59_ == 2 ? i - i_48_ : -i - i_48_;
		i_59_ = ((Class282_Sub20_Sub4) this).aByteArray9732[i_55_ + i_49_] & 0x3;
		int i_61_;
		if (i_59_ <= 1)
			i_61_ = 0 == i_59_ ? i_56_ + i_48_ : i_48_ - i_56_;
		else
			i_61_ = i_59_ == 2 ? i_56_ - i_48_ : -i_56_ - i_48_;
		int i_62_ = ((i_61_ - i_60_) * i_58_ >> 12) + i_60_;
		i_59_ = ((Class282_Sub20_Sub4) this).aByteArray9732[i_54_ + i_50_] & 0x3;
		if (i_59_ <= 1)
			i_60_ = 0 == i_59_ ? i_57_ + i : i_57_ - i;
		else
			i_60_ = 2 == i_59_ ? i - i_57_ : -i - i_57_;
		i_59_ = ((Class282_Sub20_Sub4) this).aByteArray9732[i_55_ + i_50_] & 0x3;
		if (i_59_ <= 1)
			i_61_ = 0 == i_59_ ? i_56_ + i_57_ : i_57_ - i_56_;
		else
			i_61_ = i_59_ == 2 ? i_56_ - i_57_ : -i_56_ - i_57_;
		int i_63_ = (i_58_ * (i_61_ - i_60_) >> 12) + i_60_;
		return i_62_ + ((i_63_ - i_62_) * i_51_ >> 12);
	}

	void method12321(int i) {
		((Class282_Sub20_Sub4) this).aByteArray9732 = Class316.method5588((-1764419929 * ((Class282_Sub20_Sub4) this).anInt9733), -1401827913);
		method15199(-884893671);
		for (int i_64_ = ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959 - 1; i_64_ >= 1; i_64_--) {
			short i_65_ = ((Class282_Sub20_Sub4) this).aShortArray9730[i_64_];
			if (i_65_ > 8 || i_65_ < -8)
				break;
			((Class282_Sub20_Sub4) this).anInt9736 -= 1844348207;
		}
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_66_) {
		switch (i) {
		case 6:
			((Class282_Sub20_Sub4) this).anInt9735 = class282_sub35.readUnsignedByte() * 554163529;
			break;
		case 4:
			((Class282_Sub20_Sub4) this).anInt9733 = class282_sub35.readUnsignedByte() * -1343016681;
			break;
		case 2:
			((Class282_Sub20_Sub4) this).anInt9737 = class282_sub35.readShort(1710562574) * -1659901129;
			if (-1636582777 * ((Class282_Sub20_Sub4) this).anInt9737 < 0) {
				((Class282_Sub20_Sub4) this).aShortArray9730 = (new short[2066538959 * ((Class282_Sub20_Sub4) this).anInt9736]);
				for (int i_67_ = 0; (i_67_ < 2066538959 * ((Class282_Sub20_Sub4) this).anInt9736); i_67_++)
					((Class282_Sub20_Sub4) this).aShortArray9730[i_67_] = (short) class282_sub35.readShort(2030279685);
			}
			break;
		case 5:
			((Class282_Sub20_Sub4) this).anInt9725 = class282_sub35.readUnsignedByte() * 542765127;
			break;
		case 0:
			((Class282_Sub20_Sub4) this).aBool9726 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub4) this).anInt9736 = class282_sub35.readUnsignedByte() * 1844348207;
			break;
		case 3:
			((Class282_Sub20_Sub4) this).anInt9725 = ((((Class282_Sub20_Sub4) this).anInt9735 = class282_sub35.readUnsignedByte() * 554163529) * -2143211249);
			break;
		}
	}

	void method15199(int i) {
		if (((Class282_Sub20_Sub4) this).anInt9737 * -1636582777 > 0) {
			((Class282_Sub20_Sub4) this).aShortArray9730 = (new short[((Class282_Sub20_Sub4) this).anInt9736 * 2066538959]);
			((Class282_Sub20_Sub4) this).aShortArray9731 = (new short[2066538959 * ((Class282_Sub20_Sub4) this).anInt9736]);
			for (int i_68_ = 0; i_68_ < ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959; i_68_++) {
				((Class282_Sub20_Sub4) this).aShortArray9730[i_68_] = (short) (int) ((Math.pow((double) ((float) (((Class282_Sub20_Sub4) this).anInt9737 * -1636582777) / 4096.0F), (double) i_68_)) * 4096.0);
				((Class282_Sub20_Sub4) this).aShortArray9731[i_68_] = (short) (int) Math.pow(2.0, (double) i_68_);
			}
		} else if (null != ((Class282_Sub20_Sub4) this).aShortArray9730 && (((Class282_Sub20_Sub4) this).aShortArray9730.length == (((Class282_Sub20_Sub4) this).anInt9736 * 2066538959))) {
			((Class282_Sub20_Sub4) this).aShortArray9731 = (new short[((Class282_Sub20_Sub4) this).anInt9736 * 2066538959]);
			for (int i_69_ = 0; i_69_ < 2066538959 * ((Class282_Sub20_Sub4) this).anInt9736; i_69_++)
				((Class282_Sub20_Sub4) this).aShortArray9731[i_69_] = (short) (int) Math.pow(2.0, (double) i_69_);
		}
	}

	public Class282_Sub20_Sub4() {
		super(0, true);
		((Class282_Sub20_Sub4) this).anInt9725 = -2123906788;
		((Class282_Sub20_Sub4) this).anInt9735 = -2078313180;
		((Class282_Sub20_Sub4) this).anInt9736 = -1212541764;
		((Class282_Sub20_Sub4) this).anInt9737 = -203750934;
		((Class282_Sub20_Sub4) this).aBool9726 = true;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -733681365);
		if (aClass320_7667.aBool3722)
			method15197(i, is, 915556346);
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -1377228798);
		if (aClass320_7667.aBool3722)
			method15197(i, is, 915556346);
		return is;
	}

	void method12328() {
		((Class282_Sub20_Sub4) this).aByteArray9732 = Class316.method5588((-1764419929 * ((Class282_Sub20_Sub4) this).anInt9733), 402178469);
		method15199(-1441753074);
		for (int i = ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959 - 1; i >= 1; i--) {
			short i_70_ = ((Class282_Sub20_Sub4) this).aShortArray9730[i];
			if (i_70_ > 8 || i_70_ < -8)
				break;
			((Class282_Sub20_Sub4) this).anInt9736 -= 1844348207;
		}
	}

	public static int[] method15200(int i, int i_71_, int i_72_, int i_73_, int i_74_, float f, boolean bool) {
		int[] is = new int[i];
		Class282_Sub20_Sub4 class282_sub20_sub4 = new Class282_Sub20_Sub4();
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9733 = i_71_ * -1343016681;
		((Class282_Sub20_Sub4) class282_sub20_sub4).aBool9726 = bool;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9725 = i_72_ * 542765127;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9735 = i_73_ * 554163529;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9736 = 1844348207 * i_74_;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9737 = -1659901129 * (int) (4096.0F * f);
		class282_sub20_sub4.method12321(-1306434138);
		Class316.method5593(i, 1, -51664733);
		class282_sub20_sub4.method15197(0, is, 915556346);
		return is;
	}

	void method12350() {
		((Class282_Sub20_Sub4) this).aByteArray9732 = Class316.method5588((-1764419929 * ((Class282_Sub20_Sub4) this).anInt9733), -316770017);
		method15199(-2016781765);
		for (int i = ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959 - 1; i >= 1; i--) {
			short i_75_ = ((Class282_Sub20_Sub4) this).aShortArray9730[i];
			if (i_75_ > 8 || i_75_ < -8)
				break;
			((Class282_Sub20_Sub4) this).anInt9736 -= 1844348207;
		}
	}

	void method12318() {
		((Class282_Sub20_Sub4) this).aByteArray9732 = Class316.method5588((-1764419929 * ((Class282_Sub20_Sub4) this).anInt9733), -207196376);
		method15199(-1906911685);
		for (int i = ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959 - 1; i >= 1; i--) {
			short i_76_ = ((Class282_Sub20_Sub4) this).aShortArray9730[i];
			if (i_76_ > 8 || i_76_ < -8)
				break;
			((Class282_Sub20_Sub4) this).anInt9736 -= 1844348207;
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, 656508925);
		if (aClass320_7667.aBool3722)
			method15197(i, is, 915556346);
		return is;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 6:
			((Class282_Sub20_Sub4) this).anInt9735 = class282_sub35.readUnsignedByte() * 554163529;
			break;
		case 4:
			((Class282_Sub20_Sub4) this).anInt9733 = class282_sub35.readUnsignedByte() * -1343016681;
			break;
		case 2:
			((Class282_Sub20_Sub4) this).anInt9737 = class282_sub35.readShort(2005360661) * -1659901129;
			if (-1636582777 * ((Class282_Sub20_Sub4) this).anInt9737 < 0) {
				((Class282_Sub20_Sub4) this).aShortArray9730 = (new short[2066538959 * ((Class282_Sub20_Sub4) this).anInt9736]);
				for (int i_77_ = 0; (i_77_ < 2066538959 * ((Class282_Sub20_Sub4) this).anInt9736); i_77_++)
					((Class282_Sub20_Sub4) this).aShortArray9730[i_77_] = (short) class282_sub35.readShort(1720794601);
			}
			break;
		case 5:
			((Class282_Sub20_Sub4) this).anInt9725 = class282_sub35.readUnsignedByte() * 542765127;
			break;
		case 0:
			((Class282_Sub20_Sub4) this).aBool9726 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub4) this).anInt9736 = class282_sub35.readUnsignedByte() * 1844348207;
			break;
		case 3:
			((Class282_Sub20_Sub4) this).anInt9725 = ((((Class282_Sub20_Sub4) this).anInt9735 = class282_sub35.readUnsignedByte() * 554163529) * -2143211249);
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 6:
			((Class282_Sub20_Sub4) this).anInt9735 = class282_sub35.readUnsignedByte() * 554163529;
			break;
		case 4:
			((Class282_Sub20_Sub4) this).anInt9733 = class282_sub35.readUnsignedByte() * -1343016681;
			break;
		case 2:
			((Class282_Sub20_Sub4) this).anInt9737 = class282_sub35.readShort(2075795931) * -1659901129;
			if (-1636582777 * ((Class282_Sub20_Sub4) this).anInt9737 < 0) {
				((Class282_Sub20_Sub4) this).aShortArray9730 = (new short[2066538959 * ((Class282_Sub20_Sub4) this).anInt9736]);
				for (int i_78_ = 0; (i_78_ < 2066538959 * ((Class282_Sub20_Sub4) this).anInt9736); i_78_++)
					((Class282_Sub20_Sub4) this).aShortArray9730[i_78_] = (short) class282_sub35.readShort(1745971342);
			}
			break;
		case 5:
			((Class282_Sub20_Sub4) this).anInt9725 = class282_sub35.readUnsignedByte() * 542765127;
			break;
		case 0:
			((Class282_Sub20_Sub4) this).aBool9726 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub4) this).anInt9736 = class282_sub35.readUnsignedByte() * 1844348207;
			break;
		case 3:
			((Class282_Sub20_Sub4) this).anInt9725 = ((((Class282_Sub20_Sub4) this).anInt9735 = class282_sub35.readUnsignedByte() * 554163529) * -2143211249);
			break;
		}
	}

	void method15201(int i, int[] is) {
		int i_79_ = (((Class282_Sub20_Sub4) this).anInt9735 * 2078254329 * Class316.anIntArray3668[i]);
		if (1 == ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959) {
			int i_80_ = ((Class282_Sub20_Sub4) this).aShortArray9730[0];
			int i_81_ = ((Class282_Sub20_Sub4) this).aShortArray9731[0] << 12;
			int i_82_ = (2078254329 * ((Class282_Sub20_Sub4) this).anInt9735 * i_81_ >> 12);
			int i_83_ = (((Class282_Sub20_Sub4) this).anInt9725 * -1325221513 * i_81_ >> 12);
			int i_84_ = i_81_ * i_79_ >> 12;
			int i_85_ = i_84_ >> 12;
			int i_86_ = i_85_ + 1;
			if (i_86_ >= i_82_)
				i_86_ = 0;
			i_84_ &= 0xfff;
			int i_87_ = Class370.anIntArray4291[i_84_];
			int i_88_ = (((Class282_Sub20_Sub4) this).aByteArray9732[i_85_ & 0xff] & 0xff);
			int i_89_ = (((Class282_Sub20_Sub4) this).aByteArray9732[i_86_ & 0xff] & 0xff);
			if (((Class282_Sub20_Sub4) this).aBool9726) {
				for (int i_90_ = 0; i_90_ < -402153223 * Class316.anInt3670; i_90_++) {
					int i_91_ = (Class316.anIntArray3672[i_90_] * (((Class282_Sub20_Sub4) this).anInt9725 * -1325221513));
					int i_92_ = method15198(i_81_ * i_91_ >> 12, i_84_, i_88_, i_89_, i_87_, i_83_, -2071577896);
					i_92_ = i_80_ * i_92_ >> 12;
					is[i_90_] = (i_92_ >> 1) + 2048;
				}
			} else {
				for (int i_93_ = 0; i_93_ < -402153223 * Class316.anInt3670; i_93_++) {
					int i_94_ = (Class316.anIntArray3672[i_93_] * (((Class282_Sub20_Sub4) this).anInt9725 * -1325221513));
					int i_95_ = method15198(i_81_ * i_94_ >> 12, i_84_, i_88_, i_89_, i_87_, i_83_, -1320388994);
					is[i_93_] = i_80_ * i_95_ >> 12;
				}
			}
		} else {
			int i_96_ = ((Class282_Sub20_Sub4) this).aShortArray9730[0];
			if (i_96_ > 8 || i_96_ < -8) {
				int i_97_ = ((Class282_Sub20_Sub4) this).aShortArray9731[0] << 12;
				int i_98_ = ((((Class282_Sub20_Sub4) this).anInt9735 * 2078254329 * i_97_) >> 12);
				int i_99_ = (i_97_ * (-1325221513 * ((Class282_Sub20_Sub4) this).anInt9725) >> 12);
				int i_100_ = i_79_ * i_97_ >> 12;
				int i_101_ = i_100_ >> 12;
				int i_102_ = 1 + i_101_;
				if (i_102_ >= i_98_)
					i_102_ = 0;
				i_100_ &= 0xfff;
				int i_103_ = Class370.anIntArray4291[i_100_];
				int i_104_ = ((((Class282_Sub20_Sub4) this).aByteArray9732[i_101_ & 0xff]) & 0xff);
				int i_105_ = ((((Class282_Sub20_Sub4) this).aByteArray9732[i_102_ & 0xff]) & 0xff);
				for (int i_106_ = 0; i_106_ < -402153223 * Class316.anInt3670; i_106_++) {
					int i_107_ = (-1325221513 * ((Class282_Sub20_Sub4) this).anInt9725 * Class316.anIntArray3672[i_106_]);
					int i_108_ = method15198(i_97_ * i_107_ >> 12, i_100_, i_104_, i_105_, i_103_, i_99_, -1959056141);
					is[i_106_] = i_108_ * i_96_ >> 12;
				}
			}
			for (int i_109_ = 1; i_109_ < 2066538959 * ((Class282_Sub20_Sub4) this).anInt9736; i_109_++) {
				i_96_ = ((Class282_Sub20_Sub4) this).aShortArray9730[i_109_];
				if (i_96_ > 8 || i_96_ < -8) {
					int i_110_ = (((Class282_Sub20_Sub4) this).aShortArray9731[i_109_] << 12);
					int i_111_ = ((2078254329 * ((Class282_Sub20_Sub4) this).anInt9735 * i_110_) >> 12);
					int i_112_ = (i_110_ * (((Class282_Sub20_Sub4) this).anInt9725 * -1325221513) >> 12);
					int i_113_ = i_79_ * i_110_ >> 12;
					int i_114_ = i_113_ >> 12;
					int i_115_ = 1 + i_114_;
					if (i_115_ >= i_111_)
						i_115_ = 0;
					i_113_ &= 0xfff;
					int i_116_ = Class370.anIntArray4291[i_113_];
					int i_117_ = ((((Class282_Sub20_Sub4) this).aByteArray9732[i_114_ & 0xff]) & 0xff);
					int i_118_ = ((((Class282_Sub20_Sub4) this).aByteArray9732[i_115_ & 0xff]) & 0xff);
					if (((Class282_Sub20_Sub4) this).aBool9726 && (2066538959 * ((Class282_Sub20_Sub4) this).anInt9736 - 1) == i_109_) {
						for (int i_119_ = 0; i_119_ < -402153223 * Class316.anInt3670; i_119_++) {
							int i_120_ = (-1325221513 * ((Class282_Sub20_Sub4) this).anInt9725 * Class316.anIntArray3672[i_119_]);
							int i_121_ = method15198(i_120_ * i_110_ >> 12, i_113_, i_117_, i_118_, i_116_, i_112_, -1952885260);
							i_121_ = is[i_119_] + (i_96_ * i_121_ >> 12);
							is[i_119_] = 2048 + (i_121_ >> 1);
						}
					} else {
						for (int i_122_ = 0; i_122_ < Class316.anInt3670 * -402153223; i_122_++) {
							int i_123_ = (-1325221513 * ((Class282_Sub20_Sub4) this).anInt9725 * Class316.anIntArray3672[i_122_]);
							int i_124_ = method15198(i_110_ * i_123_ >> 12, i_113_, i_117_, i_118_, i_116_, i_112_, -527424656);
							is[i_122_] += i_124_ * i_96_ >> 12;
						}
					}
				}
			}
		}
	}

	int method15202(int i, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_) {
		int i_130_ = i >> 12;
		int i_131_ = 1 + i_130_;
		if (i_131_ >= i_129_)
			i_131_ = 0;
		i &= 0xfff;
		i_130_ &= 0xff;
		i_131_ &= 0xff;
		int i_132_ = i - 4096;
		int i_133_ = i_125_ - 4096;
		int i_134_ = Class370.anIntArray4291[i];
		int i_135_ = (((Class282_Sub20_Sub4) this).aByteArray9732[i_130_ + i_126_] & 0x3);
		int i_136_;
		if (i_135_ <= 1)
			i_136_ = 0 == i_135_ ? i + i_125_ : i_125_ - i;
		else
			i_136_ = i_135_ == 2 ? i - i_125_ : -i - i_125_;
		i_135_ = (((Class282_Sub20_Sub4) this).aByteArray9732[i_131_ + i_126_] & 0x3);
		int i_137_;
		if (i_135_ <= 1)
			i_137_ = 0 == i_135_ ? i_132_ + i_125_ : i_125_ - i_132_;
		else
			i_137_ = i_135_ == 2 ? i_132_ - i_125_ : -i_132_ - i_125_;
		int i_138_ = ((i_137_ - i_136_) * i_134_ >> 12) + i_136_;
		i_135_ = (((Class282_Sub20_Sub4) this).aByteArray9732[i_130_ + i_127_] & 0x3);
		if (i_135_ <= 1)
			i_136_ = 0 == i_135_ ? i_133_ + i : i_133_ - i;
		else
			i_136_ = 2 == i_135_ ? i - i_133_ : -i - i_133_;
		i_135_ = (((Class282_Sub20_Sub4) this).aByteArray9732[i_131_ + i_127_] & 0x3);
		if (i_135_ <= 1)
			i_137_ = 0 == i_135_ ? i_132_ + i_133_ : i_133_ - i_132_;
		else
			i_137_ = i_135_ == 2 ? i_132_ - i_133_ : -i_132_ - i_133_;
		int i_139_ = (i_134_ * (i_137_ - i_136_) >> 12) + i_136_;
		return i_138_ + ((i_139_ - i_138_) * i_128_ >> 12);
	}

	void method15203() {
		if (((Class282_Sub20_Sub4) this).anInt9737 * -1636582777 > 0) {
			((Class282_Sub20_Sub4) this).aShortArray9730 = (new short[((Class282_Sub20_Sub4) this).anInt9736 * 2066538959]);
			((Class282_Sub20_Sub4) this).aShortArray9731 = (new short[2066538959 * ((Class282_Sub20_Sub4) this).anInt9736]);
			for (int i = 0; i < ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959; i++) {
				((Class282_Sub20_Sub4) this).aShortArray9730[i] = (short) (int) ((Math.pow((double) ((float) (((Class282_Sub20_Sub4) this).anInt9737 * -1636582777) / 4096.0F), (double) i)) * 4096.0);
				((Class282_Sub20_Sub4) this).aShortArray9731[i] = (short) (int) Math.pow(2.0, (double) i);
			}
		} else if (null != ((Class282_Sub20_Sub4) this).aShortArray9730 && (((Class282_Sub20_Sub4) this).aShortArray9730.length == (((Class282_Sub20_Sub4) this).anInt9736 * 2066538959))) {
			((Class282_Sub20_Sub4) this).aShortArray9731 = (new short[((Class282_Sub20_Sub4) this).anInt9736 * 2066538959]);
			for (int i = 0; i < 2066538959 * ((Class282_Sub20_Sub4) this).anInt9736; i++)
				((Class282_Sub20_Sub4) this).aShortArray9731[i] = (short) (int) Math.pow(2.0, (double) i);
		}
	}

	void method12329() {
		((Class282_Sub20_Sub4) this).aByteArray9732 = Class316.method5588((-1764419929 * ((Class282_Sub20_Sub4) this).anInt9733), 1423622193);
		method15199(-1109668126);
		for (int i = ((Class282_Sub20_Sub4) this).anInt9736 * 2066538959 - 1; i >= 1; i--) {
			short i_140_ = ((Class282_Sub20_Sub4) this).aShortArray9730[i];
			if (i_140_ > 8 || i_140_ < -8)
				break;
			((Class282_Sub20_Sub4) this).anInt9736 -= 1844348207;
		}
	}

	public static int[] method15204(int i, int i_141_, int i_142_, int i_143_, int i_144_, float f, boolean bool) {
		int[] is = new int[i];
		Class282_Sub20_Sub4 class282_sub20_sub4 = new Class282_Sub20_Sub4();
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9733 = i_141_ * -1343016681;
		((Class282_Sub20_Sub4) class282_sub20_sub4).aBool9726 = bool;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9725 = i_142_ * 542765127;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9735 = i_143_ * 554163529;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9736 = 1844348207 * i_144_;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9737 = -1659901129 * (int) (4096.0F * f);
		class282_sub20_sub4.method12321(1846655234);
		Class316.method5593(i, 1, 194021401);
		class282_sub20_sub4.method15197(0, is, 915556346);
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 6:
			((Class282_Sub20_Sub4) this).anInt9735 = class282_sub35.readUnsignedByte() * 554163529;
			break;
		case 4:
			((Class282_Sub20_Sub4) this).anInt9733 = class282_sub35.readUnsignedByte() * -1343016681;
			break;
		case 2:
			((Class282_Sub20_Sub4) this).anInt9737 = class282_sub35.readShort(1814107657) * -1659901129;
			if (-1636582777 * ((Class282_Sub20_Sub4) this).anInt9737 < 0) {
				((Class282_Sub20_Sub4) this).aShortArray9730 = (new short[2066538959 * ((Class282_Sub20_Sub4) this).anInt9736]);
				for (int i_145_ = 0; (i_145_ < 2066538959 * ((Class282_Sub20_Sub4) this).anInt9736); i_145_++)
					((Class282_Sub20_Sub4) this).aShortArray9730[i_145_] = (short) class282_sub35.readShort(1657360041);
			}
			break;
		case 5:
			((Class282_Sub20_Sub4) this).anInt9725 = class282_sub35.readUnsignedByte() * 542765127;
			break;
		case 0:
			((Class282_Sub20_Sub4) this).aBool9726 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub4) this).anInt9736 = class282_sub35.readUnsignedByte() * 1844348207;
			break;
		case 3:
			((Class282_Sub20_Sub4) this).anInt9725 = ((((Class282_Sub20_Sub4) this).anInt9735 = class282_sub35.readUnsignedByte() * 554163529) * -2143211249);
			break;
		}
	}

	public static int[][] method15205(int i, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, float f, boolean bool) {
		int[][] is = new int[i_146_][i];
		Class282_Sub20_Sub4 class282_sub20_sub4 = new Class282_Sub20_Sub4();
		((Class282_Sub20_Sub4) class282_sub20_sub4).aBool9726 = bool;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9725 = i_148_ * 542765127;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9735 = i_149_ * 554163529;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9736 = 1844348207 * i_150_;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9737 = -1659901129 * (int) (4096.0F * f);
		class282_sub20_sub4.method12321(1727845467);
		Class316.method5593(i, i_146_, 283562170);
		for (int i_151_ = 0; i_151_ < i_146_; i_151_++)
			class282_sub20_sub4.method15197(i_151_, is[i_151_], 915556346);
		return is;
	}

	public static int[][] method15206(int i, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, float f, boolean bool) {
		int[][] is = new int[i_152_][i];
		Class282_Sub20_Sub4 class282_sub20_sub4 = new Class282_Sub20_Sub4();
		((Class282_Sub20_Sub4) class282_sub20_sub4).aBool9726 = bool;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9725 = i_154_ * 542765127;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9735 = i_155_ * 554163529;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9736 = 1844348207 * i_156_;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9737 = -1659901129 * (int) (4096.0F * f);
		class282_sub20_sub4.method12321(440894633);
		Class316.method5593(i, i_152_, 962984624);
		for (int i_157_ = 0; i_157_ < i_152_; i_157_++)
			class282_sub20_sub4.method15197(i_157_, is[i_157_], 915556346);
		return is;
	}

	static final void method15207(IComponentDefinitions class118, CS2Executor class527, int i) {
		int i_158_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		int i_159_ = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) - 1);
		if (class118.anInt1329 * 2131324949 != 6 && 2 != class118.anInt1329 * 2131324949)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(-402732635 * class118.anInt1330, (byte) 86);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, 2131324949 * class118.anInt1329 == 6);
		class118.aClass417_1308.aLong4993 = Class86.method1480(976304204) * 7197667099348947907L;
		if (null == class409.aShortArray4892 || i_159_ < 0 || i_159_ >= class409.aShortArray4892.length)
			throw new RuntimeException("");
		class118.aClass417_1308.aShortArray4990[i_159_] = (short) i_158_;
		Class109.method1858(class118, (byte) 49);
	}
}
