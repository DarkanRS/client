/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RSMesh {
	public int anInt1973;
	public int anInt1974;
	public byte[] aByteArray1975;
	public int[] anIntArray1976;
	public byte[] aByteArray1977;
	public int[] anIntArray1978;
	public int anInt1979;
	public short[] aShortArray1980;
	public short[] aShortArray1981;
	public short[] aShortArray1982;
	public short[] aShortArray1983;
	public short[] aShortArray1984;
	public byte[] aByteArray1985;
	public int zoom = 12;
	public short[] aShortArray1987;
	public byte[] aByteArray1988;
	public int[] anIntArray1989;
	public byte[] aByteArray1990;
	public int[] anIntArray1991;
	public int[] anIntArray1992;
	public short[] aShortArray1993;
	public byte aByte1994;
	public byte[] aByteArray1995;
	public short[] aShortArray1996;
	public int[] anIntArray1997;
	public short[] aShortArray1998;
	public int anInt1999;
	public int[] anIntArray2000;
	public int[] anIntArray2001;
	public int[] anIntArray2002;
	public int[] anIntArray2003;
	public int[] anIntArray2004;
	public byte[] aByteArray2005;
	public short[] aShortArray2006;
	public Class87[] aClass87Array2007;
	public Class172[] aClass172Array2008;
	public Class84[] aClass84Array2009;

	public void method2654(int i) {
		for (int i_0_ = 0; i_0_ < anInt1974; i_0_++) {
			anIntArray1976[i_0_] <<= i;
			anIntArray2003[i_0_] <<= i;
			anIntArray1978[i_0_] <<= i;
		}
		if (anInt1979 > 0 && anIntArray1989 != null) {
			for (int i_1_ = 0; i_1_ < anIntArray1989.length; i_1_++) {
				anIntArray1989[i_1_] <<= i;
				anIntArray2000[i_1_] <<= i;
				if (aByteArray1995[i_1_] != 1)
					anIntArray2001[i_1_] <<= i;
			}
		}
	}

	RSMesh(byte[] is) {
		anInt1974 = 0;
		anInt1999 = 0;
		anInt1973 = 0;
		aByte1994 = (byte) 0;
		anInt1979 = 0;
		if (is[is.length - 1] == -1 && is[is.length - 2] == -1)
			method2658(is);
		else
			method2674(is);
	}

	public byte method2655(short i, short i_2_, short i_3_, short i_4_, short i_5_, short i_6_, byte i_7_, byte i_8_, byte i_9_) {
		if (anInt1979 >= 255)
			throw new IllegalStateException();
		aByteArray1995[anInt1979] = (byte) 3;
		aShortArray1996[anInt1979] = i;
		aShortArray1987[anInt1979] = i_2_;
		aShortArray1998[anInt1979] = i_3_;
		anIntArray1989[anInt1979] = i_4_;
		anIntArray2000[anInt1979] = i_5_;
		anIntArray2001[anInt1979] = i_6_;
		aByteArray2005[anInt1979] = i_7_;
		aByteArray1990[anInt1979] = i_8_;
		anIntArray1992[anInt1979] = i_9_;
		return (byte) anInt1979++;
	}

	public int method2656(int i, int i_10_, int i_11_, byte i_12_, byte i_13_, short i_14_, byte i_15_, short i_16_) {
		aShortArray1982[anInt1973] = (short) i;
		aShortArray1983[anInt1973] = (short) i_10_;
		aShortArray1984[anInt1973] = (short) i_11_;
		aByteArray1985[anInt1973] = i_12_;
		aByteArray1988[anInt1973] = i_13_;
		aShortArray2006[anInt1973] = i_14_;
		aByteArray1975[anInt1973] = i_15_;
		aShortArray1993[anInt1973] = i_16_;
		return anInt1973++;
	}

	final int method2657(RSMesh class157_17_, int i, short i_18_) {
		int i_19_ = class157_17_.anIntArray1976[i];
		int i_20_ = class157_17_.anIntArray2003[i];
		int i_21_ = class157_17_.anIntArray1978[i];
		for (int i_22_ = 0; i_22_ < anInt1974; i_22_++) {
			if (i_19_ == anIntArray1976[i_22_] && i_20_ == anIntArray2003[i_22_] && i_21_ == anIntArray1978[i_22_]) {
				aShortArray1980[i_22_] |= i_18_;
				return i_22_;
			}
		}
		anIntArray1976[anInt1974] = i_19_;
		anIntArray2003[anInt1974] = i_20_;
		anIntArray1978[anInt1974] = i_21_;
		aShortArray1980[anInt1974] = i_18_;
		anIntArray2002[anInt1974] = (class157_17_.anIntArray2002 != null ? class157_17_.anIntArray2002[i] : -1);
		return anInt1974++;
	}

	void method2658(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_23_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_24_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_25_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_26_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_27_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_28_ = new RsByteBuffer(is);
		class282_sub35.index = (is.length - 23) * -1115476867;
		anInt1974 = class282_sub35.readUnsignedShort();
		anInt1973 = class282_sub35.readUnsignedShort();
		anInt1979 = class282_sub35.readUnsignedByte();
		int i = class282_sub35.readUnsignedByte();
		boolean bool = (i & 0x1) == 1;
		boolean bool_29_ = (i & 0x2) == 2;
		boolean bool_30_ = (i & 0x4) == 4;
		boolean bool_31_ = (i & 0x8) == 8;
		if (bool_31_) {
			class282_sub35.index -= 781596523;
			zoom = class282_sub35.readUnsignedByte();
			class282_sub35.index += 1897073390;
		}
		int i_32_ = class282_sub35.readUnsignedByte();
		int i_33_ = class282_sub35.readUnsignedByte();
		int i_34_ = class282_sub35.readUnsignedByte();
		int i_35_ = class282_sub35.readUnsignedByte();
		int i_36_ = class282_sub35.readUnsignedByte();
		int i_37_ = class282_sub35.readUnsignedShort();
		int i_38_ = class282_sub35.readUnsignedShort();
		int i_39_ = class282_sub35.readUnsignedShort();
		int i_40_ = class282_sub35.readUnsignedShort();
		int i_41_ = class282_sub35.readUnsignedShort();
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		if (anInt1979 > 0) {
			aByteArray1995 = new byte[anInt1979];
			class282_sub35.index = 0;
			for (int i_45_ = 0; i_45_ < anInt1979; i_45_++) {
				byte i_46_ = (aByteArray1995[i_45_] = class282_sub35.readByte((short) -19196));
				if (i_46_ == 0)
					i_42_++;
				if (i_46_ >= 1 && i_46_ <= 3)
					i_43_++;
				if (i_46_ == 2)
					i_44_++;
			}
		}
		int i_47_ = anInt1979;
		int i_48_ = i_47_;
		i_47_ += anInt1974;
		int i_49_ = i_47_;
		if (bool)
			i_47_ += anInt1973;
		int i_50_ = i_47_;
		i_47_ += anInt1973;
		int i_51_ = i_47_;
		if (i_32_ == 255)
			i_47_ += anInt1973;
		int i_52_ = i_47_;
		if (i_34_ == 1)
			i_47_ += anInt1973;
		int i_53_ = i_47_;
		if (i_36_ == 1)
			i_47_ += anInt1974;
		int i_54_ = i_47_;
		if (i_33_ == 1)
			i_47_ += anInt1973;
		int i_55_ = i_47_;
		i_47_ += i_40_;
		int i_56_ = i_47_;
		if (i_35_ == 1)
			i_47_ += anInt1973 * 2;
		int i_57_ = i_47_;
		i_47_ += i_41_;
		int i_58_ = i_47_;
		i_47_ += anInt1973 * 2;
		int i_59_ = i_47_;
		i_47_ += i_37_;
		int i_60_ = i_47_;
		i_47_ += i_38_;
		int i_61_ = i_47_;
		i_47_ += i_39_;
		int i_62_ = i_47_;
		i_47_ += i_42_ * 6;
		int i_63_ = i_47_;
		i_47_ += i_43_ * 6;
		int i_64_ = 6;
		if (zoom == 14)
			i_64_ = 7;
		else if (zoom >= 15)
			i_64_ = 9;
		int i_65_ = i_47_;
		i_47_ += i_43_ * i_64_;
		int i_66_ = i_47_;
		i_47_ += i_43_;
		int i_67_ = i_47_;
		i_47_ += i_43_;
		int i_68_ = i_47_;
		i_47_ += i_43_ + i_44_ * 2;
		int i_69_ = i_47_;
		anIntArray1976 = new int[anInt1974];
		anIntArray2003 = new int[anInt1974];
		anIntArray1978 = new int[anInt1974];
		aShortArray1982 = new short[anInt1973];
		aShortArray1983 = new short[anInt1973];
		aShortArray1984 = new short[anInt1973];
		if (i_36_ == 1)
			anIntArray2002 = new int[anInt1974];
		if (bool)
			aByteArray1985 = new byte[anInt1973];
		if (i_32_ == 255)
			aByteArray1977 = new byte[anInt1973];
		else
			aByte1994 = (byte) i_32_;
		if (i_33_ == 1)
			aByteArray1975 = new byte[anInt1973];
		if (i_34_ == 1)
			anIntArray1991 = new int[anInt1973];
		if (i_35_ == 1)
			aShortArray1993 = new short[anInt1973];
		if (i_35_ == 1 && anInt1979 > 0)
			aByteArray1988 = new byte[anInt1973];
		aShortArray2006 = new short[anInt1973];
		if (anInt1979 > 0) {
			aShortArray1996 = new short[anInt1979];
			aShortArray1987 = new short[anInt1979];
			aShortArray1998 = new short[anInt1979];
			if (i_43_ > 0) {
				anIntArray1989 = new int[i_43_];
				anIntArray2000 = new int[i_43_];
				anIntArray2001 = new int[i_43_];
				aByteArray2005 = new byte[i_43_];
				aByteArray1990 = new byte[i_43_];
				anIntArray1992 = new int[i_43_];
			}
			if (i_44_ > 0) {
				anIntArray1997 = new int[i_44_];
				anIntArray2004 = new int[i_44_];
			}
		}
		class282_sub35.index = i_48_ * -1115476867;
		class282_sub35_23_.index = i_59_ * -1115476867;
		class282_sub35_24_.index = i_60_ * -1115476867;
		class282_sub35_25_.index = i_61_ * -1115476867;
		class282_sub35_26_.index = i_53_ * -1115476867;
		int i_70_ = 0;
		int i_71_ = 0;
		int i_72_ = 0;
		for (int i_73_ = 0; i_73_ < anInt1974; i_73_++) {
			int i_74_ = class282_sub35.readUnsignedByte();
			int i_75_ = 0;
			if ((i_74_ & 0x1) != 0)
				i_75_ = class282_sub35_23_.method13094(907232293);
			int i_76_ = 0;
			if ((i_74_ & 0x2) != 0)
				i_76_ = class282_sub35_24_.method13094(1138384025);
			int i_77_ = 0;
			if ((i_74_ & 0x4) != 0)
				i_77_ = class282_sub35_25_.method13094(-1899961465);
			anIntArray1976[i_73_] = i_70_ + i_75_;
			anIntArray2003[i_73_] = i_71_ + i_76_;
			anIntArray1978[i_73_] = i_72_ + i_77_;
			i_70_ = anIntArray1976[i_73_];
			i_71_ = anIntArray2003[i_73_];
			i_72_ = anIntArray1978[i_73_];
			if (i_36_ == 1)
				anIntArray2002[i_73_] = class282_sub35_26_.readUnsignedByte();
		}
		class282_sub35.index = i_58_ * -1115476867;
		class282_sub35_23_.index = i_49_ * -1115476867;
		class282_sub35_24_.index = i_51_ * -1115476867;
		class282_sub35_25_.index = i_54_ * -1115476867;
		class282_sub35_26_.index = i_52_ * -1115476867;
		class282_sub35_27_.index = i_56_ * -1115476867;
		class282_sub35_28_.index = i_57_ * -1115476867;
		for (int i_78_ = 0; i_78_ < anInt1973; i_78_++) {
			aShortArray2006[i_78_] = (short) class282_sub35.readUnsignedShort();
			if (bool)
				aByteArray1985[i_78_] = class282_sub35_23_.readByte((short) -4073);
			if (i_32_ == 255)
				aByteArray1977[i_78_] = class282_sub35_24_.readByte((short) -5201);
			if (i_33_ == 1)
				aByteArray1975[i_78_] = class282_sub35_25_.readByte((short) -29993);
			if (i_34_ == 1)
				anIntArray1991[i_78_] = class282_sub35_26_.readUnsignedByte();
			if (i_35_ == 1)
				aShortArray1993[i_78_] = (short) (class282_sub35_27_.readUnsignedShort() - 1);
			if (aByteArray1988 != null) {
				if (aShortArray1993[i_78_] != -1)
					aByteArray1988[i_78_] = (byte) (class282_sub35_28_.readUnsignedByte() - 1);
				else
					aByteArray1988[i_78_] = (byte) -1;
			}
		}
		anInt1999 = -1;
		class282_sub35.index = i_55_ * -1115476867;
		class282_sub35_23_.index = i_50_ * -1115476867;
		method2659(class282_sub35, class282_sub35_23_);
		class282_sub35.index = i_62_ * -1115476867;
		class282_sub35_23_.index = i_63_ * -1115476867;
		class282_sub35_24_.index = i_65_ * -1115476867;
		class282_sub35_25_.index = i_66_ * -1115476867;
		class282_sub35_26_.index = i_67_ * -1115476867;
		class282_sub35_27_.index = i_68_ * -1115476867;
		method2660(class282_sub35, class282_sub35_23_, class282_sub35_24_, class282_sub35_25_, class282_sub35_26_, class282_sub35_27_);
		class282_sub35.index = i_69_ * -1115476867;
		if (bool_29_) {
			int i_79_ = class282_sub35.readUnsignedByte();
			if (i_79_ > 0) {
				aClass87Array2007 = new Class87[i_79_];
				for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
					int i_81_ = class282_sub35.readUnsignedShort();
					int i_82_ = class282_sub35.readUnsignedShort();
					byte i_83_;
					if (i_32_ == 255)
						i_83_ = aByteArray1977[i_82_];
					else
						i_83_ = (byte) i_32_;
					aClass87Array2007[i_80_] = new Class87(i_81_, aShortArray1982[i_82_], aShortArray1983[i_82_], aShortArray1984[i_82_], i_83_);
				}
			}
			int i_84_ = class282_sub35.readUnsignedByte();
			if (i_84_ > 0) {
				aClass172Array2008 = new Class172[i_84_];
				for (int i_85_ = 0; i_85_ < i_84_; i_85_++) {
					int i_86_ = class282_sub35.readUnsignedShort();
					int i_87_ = class282_sub35.readUnsignedShort();
					aClass172Array2008[i_85_] = new Class172(i_86_, i_87_);
				}
			}
		}
		if (bool_30_) {
			int i_88_ = class282_sub35.readUnsignedByte();
			if (i_88_ > 0) {
				aClass84Array2009 = new Class84[i_88_];
				for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
					int i_90_ = class282_sub35.readUnsignedShort();
					int i_91_ = class282_sub35.readUnsignedShort();
					int i_92_ = class282_sub35.readUnsignedByte();
					byte i_93_ = class282_sub35.readByte((short) -24740);
					aClass84Array2009[i_89_] = new Class84(i_90_, i_91_, i_92_, i_93_);
				}
			}
		}
	}

	void method2659(RsByteBuffer class282_sub35, RsByteBuffer class282_sub35_94_) {
		short i = 0;
		short i_95_ = 0;
		short i_96_ = 0;
		int i_97_ = 0;
		for (int i_98_ = 0; i_98_ < anInt1973; i_98_++) {
			int i_99_ = class282_sub35_94_.readUnsignedByte();
			if (i_99_ == 1) {
				i = (short) (class282_sub35.method13094(89160266) + i_97_);
				i_97_ = i;
				i_95_ = (short) (class282_sub35.method13094(756455111) + i_97_);
				i_97_ = i_95_;
				i_96_ = (short) (class282_sub35.method13094(-1523690914) + i_97_);
				i_97_ = i_96_;
				aShortArray1982[i_98_] = i;
				aShortArray1983[i_98_] = i_95_;
				aShortArray1984[i_98_] = i_96_;
				if (i > anInt1999)
					anInt1999 = i;
				if (i_95_ > anInt1999)
					anInt1999 = i_95_;
				if (i_96_ > anInt1999)
					anInt1999 = i_96_;
			}
			if (i_99_ == 2) {
				i_95_ = i_96_;
				i_96_ = (short) (class282_sub35.method13094(-175405594) + i_97_);
				i_97_ = i_96_;
				aShortArray1982[i_98_] = i;
				aShortArray1983[i_98_] = i_95_;
				aShortArray1984[i_98_] = i_96_;
				if (i_96_ > anInt1999)
					anInt1999 = i_96_;
			}
			if (i_99_ == 3) {
				i = i_96_;
				i_96_ = (short) (class282_sub35.method13094(1578191588) + i_97_);
				i_97_ = i_96_;
				aShortArray1982[i_98_] = i;
				aShortArray1983[i_98_] = i_95_;
				aShortArray1984[i_98_] = i_96_;
				if (i_96_ > anInt1999)
					anInt1999 = i_96_;
			}
			if (i_99_ == 4) {
				short i_100_ = i;
				i = i_95_;
				i_95_ = i_100_;
				i_96_ = (short) (class282_sub35.method13094(92866321) + i_97_);
				i_97_ = i_96_;
				aShortArray1982[i_98_] = i;
				aShortArray1983[i_98_] = i_95_;
				aShortArray1984[i_98_] = i_96_;
				if (i_96_ > anInt1999)
					anInt1999 = i_96_;
			}
		}
		anInt1999++;
	}

	void method2660(RsByteBuffer class282_sub35, RsByteBuffer class282_sub35_101_, RsByteBuffer class282_sub35_102_, RsByteBuffer class282_sub35_103_, RsByteBuffer class282_sub35_104_, RsByteBuffer class282_sub35_105_) {
		for (int i = 0; i < anInt1979; i++) {
			int i_106_ = aByteArray1995[i] & 0xff;
			if (i_106_ == 0) {
				aShortArray1996[i] = (short) class282_sub35.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35.readUnsignedShort();
			}
			if (i_106_ == 1) {
				aShortArray1996[i] = (short) class282_sub35_101_.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35_101_.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35_101_.readUnsignedShort();
				if (zoom < 15) {
					anIntArray1989[i] = class282_sub35_102_.readUnsignedShort();
					if (zoom < 14)
						anIntArray2000[i] = class282_sub35_102_.readUnsignedShort();
					else
						anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_102_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_102_.read24BitUnsignedInteger();
					anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_102_.read24BitUnsignedInteger();
				}
				aByteArray2005[i] = class282_sub35_103_.readByte((short) -14249);
				aByteArray1990[i] = class282_sub35_104_.readByte((short) -4875);
				anIntArray1992[i] = class282_sub35_105_.readByte((short) -25152);
			}
			if (i_106_ == 2) {
				aShortArray1996[i] = (short) class282_sub35_101_.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35_101_.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35_101_.readUnsignedShort();
				if (zoom < 15) {
					anIntArray1989[i] = class282_sub35_102_.readUnsignedShort();
					if (zoom < 14)
						anIntArray2000[i] = class282_sub35_102_.readUnsignedShort();
					else
						anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_102_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_102_.read24BitUnsignedInteger();
					anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_102_.read24BitUnsignedInteger();
				}
				aByteArray2005[i] = class282_sub35_103_.readByte((short) -5366);
				aByteArray1990[i] = class282_sub35_104_.readByte((short) -3093);
				anIntArray1992[i] = class282_sub35_105_.readByte((short) -9390);
				anIntArray1997[i] = class282_sub35_105_.readByte((short) -10740);
				anIntArray2004[i] = class282_sub35_105_.readByte((short) -31886);
			}
			if (i_106_ == 3) {
				aShortArray1996[i] = (short) class282_sub35_101_.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35_101_.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35_101_.readUnsignedShort();
				if (zoom < 15) {
					anIntArray1989[i] = class282_sub35_102_.readUnsignedShort();
					if (zoom < 14)
						anIntArray2000[i] = class282_sub35_102_.readUnsignedShort();
					else
						anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_102_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_102_.read24BitUnsignedInteger();
					anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_102_.read24BitUnsignedInteger();
				}
				aByteArray2005[i] = class282_sub35_103_.readByte((short) -7615);
				aByteArray1990[i] = class282_sub35_104_.readByte((short) -15141);
				anIntArray1992[i] = class282_sub35_105_.readByte((short) -1897);
			}
		}
	}

	void method2661(byte[] is) {
		boolean bool = false;
		boolean bool_107_ = false;
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_108_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_109_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_110_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_111_ = new RsByteBuffer(is);
		class282_sub35.index = (is.length - 18) * -1115476867;
		anInt1974 = class282_sub35.readUnsignedShort();
		anInt1973 = class282_sub35.readUnsignedShort();
		anInt1979 = class282_sub35.readUnsignedByte();
		int i = class282_sub35.readUnsignedByte();
		int i_112_ = class282_sub35.readUnsignedByte();
		int i_113_ = class282_sub35.readUnsignedByte();
		int i_114_ = class282_sub35.readUnsignedByte();
		int i_115_ = class282_sub35.readUnsignedByte();
		int i_116_ = class282_sub35.readUnsignedShort();
		int i_117_ = class282_sub35.readUnsignedShort();
		int i_118_ = class282_sub35.readUnsignedShort();
		int i_119_ = class282_sub35.readUnsignedShort();
		int i_120_ = 0;
		int i_121_ = i_120_;
		i_120_ += anInt1974;
		int i_122_ = i_120_;
		i_120_ += anInt1973;
		int i_123_ = i_120_;
		if (i_112_ == 255)
			i_120_ += anInt1973;
		int i_124_ = i_120_;
		if (i_114_ == 1)
			i_120_ += anInt1973;
		int i_125_ = i_120_;
		if (i == 1)
			i_120_ += anInt1973;
		int i_126_ = i_120_;
		if (i_115_ == 1)
			i_120_ += anInt1974;
		int i_127_ = i_120_;
		if (i_113_ == 1)
			i_120_ += anInt1973;
		int i_128_ = i_120_;
		i_120_ += i_119_;
		int i_129_ = i_120_;
		i_120_ += anInt1973 * 2;
		int i_130_ = i_120_;
		i_120_ += anInt1979 * 6;
		int i_131_ = i_120_;
		i_120_ += i_116_;
		int i_132_ = i_120_;
		i_120_ += i_117_;
		int i_133_ = i_120_;
		i_120_ += i_118_;
		anIntArray1976 = new int[anInt1974];
		anIntArray2003 = new int[anInt1974];
		anIntArray1978 = new int[anInt1974];
		aShortArray1982 = new short[anInt1973];
		aShortArray1983 = new short[anInt1973];
		aShortArray1984 = new short[anInt1973];
		if (anInt1979 > 0) {
			aByteArray1995 = new byte[anInt1979];
			aShortArray1996 = new short[anInt1979];
			aShortArray1987 = new short[anInt1979];
			aShortArray1998 = new short[anInt1979];
		}
		if (i_115_ == 1)
			anIntArray2002 = new int[anInt1974];
		if (i == 1) {
			aByteArray1985 = new byte[anInt1973];
			aByteArray1988 = new byte[anInt1973];
			aShortArray1993 = new short[anInt1973];
		}
		if (i_112_ == 255)
			aByteArray1977 = new byte[anInt1973];
		else
			aByte1994 = (byte) i_112_;
		if (i_113_ == 1)
			aByteArray1975 = new byte[anInt1973];
		if (i_114_ == 1)
			anIntArray1991 = new int[anInt1973];
		aShortArray2006 = new short[anInt1973];
		class282_sub35.index = i_121_ * -1115476867;
		class282_sub35_108_.index = i_131_ * -1115476867;
		class282_sub35_109_.index = i_132_ * -1115476867;
		class282_sub35_110_.index = i_133_ * -1115476867;
		class282_sub35_111_.index = i_126_ * -1115476867;
		int i_134_ = 0;
		int i_135_ = 0;
		int i_136_ = 0;
		for (int i_137_ = 0; i_137_ < anInt1974; i_137_++) {
			int i_138_ = class282_sub35.readUnsignedByte();
			int i_139_ = 0;
			if ((i_138_ & 0x1) != 0)
				i_139_ = class282_sub35_108_.method13094(-784449623);
			int i_140_ = 0;
			if ((i_138_ & 0x2) != 0)
				i_140_ = class282_sub35_109_.method13094(-949928074);
			int i_141_ = 0;
			if ((i_138_ & 0x4) != 0)
				i_141_ = class282_sub35_110_.method13094(3674891);
			anIntArray1976[i_137_] = i_134_ + i_139_;
			anIntArray2003[i_137_] = i_135_ + i_140_;
			anIntArray1978[i_137_] = i_136_ + i_141_;
			i_134_ = anIntArray1976[i_137_];
			i_135_ = anIntArray2003[i_137_];
			i_136_ = anIntArray1978[i_137_];
			if (i_115_ == 1)
				anIntArray2002[i_137_] = class282_sub35_111_.readUnsignedByte();
		}
		class282_sub35.index = i_129_ * -1115476867;
		class282_sub35_108_.index = i_125_ * -1115476867;
		class282_sub35_109_.index = i_123_ * -1115476867;
		class282_sub35_110_.index = i_127_ * -1115476867;
		class282_sub35_111_.index = i_124_ * -1115476867;
		for (int i_142_ = 0; i_142_ < anInt1973; i_142_++) {
			aShortArray2006[i_142_] = (short) class282_sub35.readUnsignedShort();
			if (i == 1) {
				int i_143_ = class282_sub35_108_.readUnsignedByte();
				if ((i_143_ & 0x1) == 1) {
					aByteArray1985[i_142_] = (byte) 1;
					bool = true;
				} else
					aByteArray1985[i_142_] = (byte) 0;
				if ((i_143_ & 0x2) == 2) {
					aByteArray1988[i_142_] = (byte) (i_143_ >> 2);
					aShortArray1993[i_142_] = aShortArray2006[i_142_];
					aShortArray2006[i_142_] = (short) 127;
					if (aShortArray1993[i_142_] != -1)
						bool_107_ = true;
				} else {
					aByteArray1988[i_142_] = (byte) -1;
					aShortArray1993[i_142_] = (short) -1;
				}
			}
			if (i_112_ == 255)
				aByteArray1977[i_142_] = class282_sub35_109_.readByte((short) -8215);
			if (i_113_ == 1)
				aByteArray1975[i_142_] = class282_sub35_110_.readByte((short) -26832);
			if (i_114_ == 1)
				anIntArray1991[i_142_] = class282_sub35_111_.readUnsignedByte();
		}
		anInt1999 = -1;
		class282_sub35.index = i_128_ * -1115476867;
		class282_sub35_108_.index = i_122_ * -1115476867;
		short i_144_ = 0;
		short i_145_ = 0;
		short i_146_ = 0;
		int i_147_ = 0;
		for (int i_148_ = 0; i_148_ < anInt1973; i_148_++) {
			int i_149_ = class282_sub35_108_.readUnsignedByte();
			if (i_149_ == 1) {
				i_144_ = (short) (class282_sub35.method13094(1226359802) + i_147_);
				i_147_ = i_144_;
				i_145_ = (short) (class282_sub35.method13094(-37501414) + i_147_);
				i_147_ = i_145_;
				i_146_ = (short) (class282_sub35.method13094(-796676310) + i_147_);
				i_147_ = i_146_;
				aShortArray1982[i_148_] = i_144_;
				aShortArray1983[i_148_] = i_145_;
				aShortArray1984[i_148_] = i_146_;
				if (i_144_ > anInt1999)
					anInt1999 = i_144_;
				if (i_145_ > anInt1999)
					anInt1999 = i_145_;
				if (i_146_ > anInt1999)
					anInt1999 = i_146_;
			}
			if (i_149_ == 2) {
				i_145_ = i_146_;
				i_146_ = (short) (class282_sub35.method13094(1972117485) + i_147_);
				i_147_ = i_146_;
				aShortArray1982[i_148_] = i_144_;
				aShortArray1983[i_148_] = i_145_;
				aShortArray1984[i_148_] = i_146_;
				if (i_146_ > anInt1999)
					anInt1999 = i_146_;
			}
			if (i_149_ == 3) {
				i_144_ = i_146_;
				i_146_ = (short) (class282_sub35.method13094(380796386) + i_147_);
				i_147_ = i_146_;
				aShortArray1982[i_148_] = i_144_;
				aShortArray1983[i_148_] = i_145_;
				aShortArray1984[i_148_] = i_146_;
				if (i_146_ > anInt1999)
					anInt1999 = i_146_;
			}
			if (i_149_ == 4) {
				short i_150_ = i_144_;
				i_144_ = i_145_;
				i_145_ = i_150_;
				i_146_ = (short) (class282_sub35.method13094(-1113390691) + i_147_);
				i_147_ = i_146_;
				aShortArray1982[i_148_] = i_144_;
				aShortArray1983[i_148_] = i_145_;
				aShortArray1984[i_148_] = i_146_;
				if (i_146_ > anInt1999)
					anInt1999 = i_146_;
			}
		}
		anInt1999++;
		class282_sub35.index = i_130_ * -1115476867;
		for (int i_151_ = 0; i_151_ < anInt1979; i_151_++) {
			aByteArray1995[i_151_] = (byte) 0;
			aShortArray1996[i_151_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1987[i_151_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1998[i_151_] = (short) class282_sub35.readUnsignedShort();
		}
		if (aByteArray1988 != null) {
			boolean bool_152_ = false;
			for (int i_153_ = 0; i_153_ < anInt1973; i_153_++) {
				int i_154_ = aByteArray1988[i_153_] & 0xff;
				if (i_154_ != 255) {
					if (((aShortArray1996[i_154_] & 0xffff) == aShortArray1982[i_153_]) && ((aShortArray1987[i_154_] & 0xffff) == aShortArray1983[i_153_]) && ((aShortArray1998[i_154_] & 0xffff) == aShortArray1984[i_153_]))
						aByteArray1988[i_153_] = (byte) -1;
					else
						bool_152_ = true;
				}
			}
			if (!bool_152_)
				aByteArray1988 = null;
		}
		if (!bool_107_)
			aShortArray1993 = null;
		if (!bool)
			aByteArray1985 = null;
	}

	public int method2662(int i, int i_155_, int i_156_) {
		for (int i_157_ = 0; i_157_ < anInt1974; i_157_++) {
			if (anIntArray1976[i_157_] == i && anIntArray2003[i_157_] == i_155_ && anIntArray1978[i_157_] == i_156_)
				return i_157_;
		}
		anIntArray1976[anInt1974] = i;
		anIntArray2003[anInt1974] = i_155_;
		anIntArray1978[anInt1974] = i_156_;
		anInt1999 = anInt1974 + 1;
		return anInt1974++;
	}

	public int method2663(int i, int i_158_, int i_159_, byte i_160_, byte i_161_, short i_162_, byte i_163_, short i_164_) {
		aShortArray1982[anInt1973] = (short) i;
		aShortArray1983[anInt1973] = (short) i_158_;
		aShortArray1984[anInt1973] = (short) i_159_;
		aByteArray1985[anInt1973] = i_160_;
		aByteArray1988[anInt1973] = i_161_;
		aShortArray2006[anInt1973] = i_162_;
		aByteArray1975[anInt1973] = i_163_;
		aShortArray1993[anInt1973] = i_164_;
		return anInt1973++;
	}

	public byte method2664(short i, short i_165_, short i_166_, short i_167_, short i_168_, short i_169_, byte i_170_, byte i_171_, byte i_172_) {
		if (anInt1979 >= 255)
			throw new IllegalStateException();
		aByteArray1995[anInt1979] = (byte) 3;
		aShortArray1996[anInt1979] = i;
		aShortArray1987[anInt1979] = i_165_;
		aShortArray1998[anInt1979] = i_166_;
		anIntArray1989[anInt1979] = i_167_;
		anIntArray2000[anInt1979] = i_168_;
		anIntArray2001[anInt1979] = i_169_;
		aByteArray2005[anInt1979] = i_170_;
		aByteArray1990[anInt1979] = i_171_;
		anIntArray1992[anInt1979] = i_172_;
		return (byte) anInt1979++;
	}

	public int[][] method2665(boolean bool) {
		int[] is = new int[256];
		int i = 0;
		int i_173_ = bool ? anInt1974 : anInt1999;
		for (int i_174_ = 0; i_174_ < i_173_; i_174_++) {
			int i_175_ = anIntArray2002[i_174_];
			if (i_175_ >= 0) {
				is[i_175_]++;
				if (i_175_ > i)
					i = i_175_;
			}
		}
		int[][] is_176_ = new int[i + 1][];
		for (int i_177_ = 0; i_177_ <= i; i_177_++) {
			is_176_[i_177_] = new int[is[i_177_]];
			is[i_177_] = 0;
		}
		for (int i_178_ = 0; i_178_ < i_173_; i_178_++) {
			int i_179_ = anIntArray2002[i_178_];
			if (i_179_ >= 0)
				is_176_[i_179_][is[i_179_]++] = i_178_;
		}
		return is_176_;
	}

	public int[][] method2666() {
		int[] is = new int[256];
		int i = 0;
		for (int i_180_ = 0; i_180_ < anInt1973; i_180_++) {
			int i_181_ = anIntArray1991[i_180_];
			if (i_181_ >= 0) {
				is[i_181_]++;
				if (i_181_ > i)
					i = i_181_;
			}
		}
		int[][] is_182_ = new int[i + 1][];
		for (int i_183_ = 0; i_183_ <= i; i_183_++) {
			is_182_[i_183_] = new int[is[i_183_]];
			is[i_183_] = 0;
		}
		for (int i_184_ = 0; i_184_ < anInt1973; i_184_++) {
			int i_185_ = anIntArray1991[i_184_];
			if (i_185_ >= 0)
				is_182_[i_185_][is[i_185_]++] = i_184_;
		}
		return is_182_;
	}

	public int[][] method2667() {
		int[] is = new int[256];
		int i = 0;
		for (int i_186_ = 0; i_186_ < aClass84Array2009.length; i_186_++) {
			int i_187_ = aClass84Array2009[i_186_].anInt811 * 1852505231;
			if (i_187_ >= 0) {
				is[i_187_]++;
				if (i_187_ > i)
					i = i_187_;
			}
		}
		int[][] is_188_ = new int[i + 1][];
		for (int i_189_ = 0; i_189_ <= i; i_189_++) {
			is_188_[i_189_] = new int[is[i_189_]];
			is[i_189_] = 0;
		}
		for (int i_190_ = 0; i_190_ < aClass84Array2009.length; i_190_++) {
			int i_191_ = aClass84Array2009[i_190_].anInt811 * 1852505231;
			if (i_191_ >= 0)
				is_188_[i_191_][is[i_191_]++] = i_190_;
		}
		return is_188_;
	}

	public void recolor(short i, short i_192_) {
		for (int i_193_ = 0; i_193_ < anInt1973; i_193_++) {
			if (aShortArray2006[i_193_] == i)
				aShortArray2006[i_193_] = i_192_;
		}
	}

	public void retexture(short i, short i_194_) {
		if (aShortArray1993 != null) {
			for (int i_195_ = 0; i_195_ < anInt1973; i_195_++) {
				if (aShortArray1993[i_195_] == i)
					aShortArray1993[i_195_] = i_194_;
			}
		}
	}

	public static RSMesh method2670(Index class317, int i, int i_196_) {
		byte[] is = class317.getFile(i, i_196_, -1300672958);
		if (is == null)
			return null;
		return new RSMesh(is);
	}

	public void method2671(int i, int i_197_, int i_198_) {
		if (i_198_ != 0) {
			int i_199_ = Class382.anIntArray4657[i_198_];
			int i_200_ = Class382.anIntArray4661[i_198_];
			for (int i_201_ = 0; i_201_ < anInt1974; i_201_++) {
				int i_202_ = ((anIntArray2003[i_201_] * i_199_ + anIntArray1976[i_201_] * i_200_) >> 14);
				anIntArray2003[i_201_] = (anIntArray2003[i_201_] * i_200_ - anIntArray1976[i_201_] * i_199_) >> 14;
				anIntArray1976[i_201_] = i_202_;
			}
		}
		if (i != 0) {
			int i_203_ = Class382.anIntArray4657[i];
			int i_204_ = Class382.anIntArray4661[i];
			for (int i_205_ = 0; i_205_ < anInt1974; i_205_++) {
				int i_206_ = ((anIntArray2003[i_205_] * i_204_ - anIntArray1978[i_205_] * i_203_) >> 14);
				anIntArray1978[i_205_] = (anIntArray2003[i_205_] * i_203_ + anIntArray1978[i_205_] * i_204_) >> 14;
				anIntArray2003[i_205_] = i_206_;
			}
		}
		if (i_197_ != 0) {
			int i_207_ = Class382.anIntArray4657[i_197_];
			int i_208_ = Class382.anIntArray4661[i_197_];
			for (int i_209_ = 0; i_209_ < anInt1974; i_209_++) {
				int i_210_ = ((anIntArray1978[i_209_] * i_207_ + anIntArray1976[i_209_] * i_208_) >> 14);
				anIntArray1978[i_209_] = (anIntArray1978[i_209_] * i_208_ - anIntArray1976[i_209_] * i_207_) >> 14;
				anIntArray1976[i_209_] = i_210_;
			}
		}
	}

	public int method2672(int i, int i_211_, int i_212_) {
		for (int i_213_ = 0; i_213_ < anInt1974; i_213_++) {
			if (anIntArray1976[i_213_] == i && anIntArray2003[i_213_] == i_211_ && anIntArray1978[i_213_] == i_212_)
				return i_213_;
		}
		anIntArray1976[anInt1974] = i;
		anIntArray2003[anInt1974] = i_211_;
		anIntArray1978[anInt1974] = i_212_;
		anInt1999 = anInt1974 + 1;
		return anInt1974++;
	}

	public static RSMesh method2673(Index class317, int i, int i_214_) {
		byte[] is = class317.getFile(i, i_214_, -1283529200);
		if (is == null)
			return null;
		return new RSMesh(is);
	}

	void method2674(byte[] is) {
		boolean bool = false;
		boolean bool_215_ = false;
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_216_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_217_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_218_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_219_ = new RsByteBuffer(is);
		class282_sub35.index = (is.length - 18) * -1115476867;
		anInt1974 = class282_sub35.readUnsignedShort();
		anInt1973 = class282_sub35.readUnsignedShort();
		anInt1979 = class282_sub35.readUnsignedByte();
		int i = class282_sub35.readUnsignedByte();
		int i_220_ = class282_sub35.readUnsignedByte();
		int i_221_ = class282_sub35.readUnsignedByte();
		int i_222_ = class282_sub35.readUnsignedByte();
		int i_223_ = class282_sub35.readUnsignedByte();
		int i_224_ = class282_sub35.readUnsignedShort();
		int i_225_ = class282_sub35.readUnsignedShort();
		int i_226_ = class282_sub35.readUnsignedShort();
		int i_227_ = class282_sub35.readUnsignedShort();
		int i_228_ = 0;
		int i_229_ = i_228_;
		i_228_ += anInt1974;
		int i_230_ = i_228_;
		i_228_ += anInt1973;
		int i_231_ = i_228_;
		if (i_220_ == 255)
			i_228_ += anInt1973;
		int i_232_ = i_228_;
		if (i_222_ == 1)
			i_228_ += anInt1973;
		int i_233_ = i_228_;
		if (i == 1)
			i_228_ += anInt1973;
		int i_234_ = i_228_;
		if (i_223_ == 1)
			i_228_ += anInt1974;
		int i_235_ = i_228_;
		if (i_221_ == 1)
			i_228_ += anInt1973;
		int i_236_ = i_228_;
		i_228_ += i_227_;
		int i_237_ = i_228_;
		i_228_ += anInt1973 * 2;
		int i_238_ = i_228_;
		i_228_ += anInt1979 * 6;
		int i_239_ = i_228_;
		i_228_ += i_224_;
		int i_240_ = i_228_;
		i_228_ += i_225_;
		int i_241_ = i_228_;
		i_228_ += i_226_;
		anIntArray1976 = new int[anInt1974];
		anIntArray2003 = new int[anInt1974];
		anIntArray1978 = new int[anInt1974];
		aShortArray1982 = new short[anInt1973];
		aShortArray1983 = new short[anInt1973];
		aShortArray1984 = new short[anInt1973];
		if (anInt1979 > 0) {
			aByteArray1995 = new byte[anInt1979];
			aShortArray1996 = new short[anInt1979];
			aShortArray1987 = new short[anInt1979];
			aShortArray1998 = new short[anInt1979];
		}
		if (i_223_ == 1)
			anIntArray2002 = new int[anInt1974];
		if (i == 1) {
			aByteArray1985 = new byte[anInt1973];
			aByteArray1988 = new byte[anInt1973];
			aShortArray1993 = new short[anInt1973];
		}
		if (i_220_ == 255)
			aByteArray1977 = new byte[anInt1973];
		else
			aByte1994 = (byte) i_220_;
		if (i_221_ == 1)
			aByteArray1975 = new byte[anInt1973];
		if (i_222_ == 1)
			anIntArray1991 = new int[anInt1973];
		aShortArray2006 = new short[anInt1973];
		class282_sub35.index = i_229_ * -1115476867;
		class282_sub35_216_.index = i_239_ * -1115476867;
		class282_sub35_217_.index = i_240_ * -1115476867;
		class282_sub35_218_.index = i_241_ * -1115476867;
		class282_sub35_219_.index = i_234_ * -1115476867;
		int i_242_ = 0;
		int i_243_ = 0;
		int i_244_ = 0;
		for (int i_245_ = 0; i_245_ < anInt1974; i_245_++) {
			int i_246_ = class282_sub35.readUnsignedByte();
			int i_247_ = 0;
			if ((i_246_ & 0x1) != 0)
				i_247_ = class282_sub35_216_.method13094(815365211);
			int i_248_ = 0;
			if ((i_246_ & 0x2) != 0)
				i_248_ = class282_sub35_217_.method13094(-60017552);
			int i_249_ = 0;
			if ((i_246_ & 0x4) != 0)
				i_249_ = class282_sub35_218_.method13094(1391084553);
			anIntArray1976[i_245_] = i_242_ + i_247_;
			anIntArray2003[i_245_] = i_243_ + i_248_;
			anIntArray1978[i_245_] = i_244_ + i_249_;
			i_242_ = anIntArray1976[i_245_];
			i_243_ = anIntArray2003[i_245_];
			i_244_ = anIntArray1978[i_245_];
			if (i_223_ == 1)
				anIntArray2002[i_245_] = class282_sub35_219_.readUnsignedByte();
		}
		class282_sub35.index = i_237_ * -1115476867;
		class282_sub35_216_.index = i_233_ * -1115476867;
		class282_sub35_217_.index = i_231_ * -1115476867;
		class282_sub35_218_.index = i_235_ * -1115476867;
		class282_sub35_219_.index = i_232_ * -1115476867;
		for (int i_250_ = 0; i_250_ < anInt1973; i_250_++) {
			aShortArray2006[i_250_] = (short) class282_sub35.readUnsignedShort();
			if (i == 1) {
				int i_251_ = class282_sub35_216_.readUnsignedByte();
				if ((i_251_ & 0x1) == 1) {
					aByteArray1985[i_250_] = (byte) 1;
					bool = true;
				} else
					aByteArray1985[i_250_] = (byte) 0;
				if ((i_251_ & 0x2) == 2) {
					aByteArray1988[i_250_] = (byte) (i_251_ >> 2);
					aShortArray1993[i_250_] = aShortArray2006[i_250_];
					aShortArray2006[i_250_] = (short) 127;
					if (aShortArray1993[i_250_] != -1)
						bool_215_ = true;
				} else {
					aByteArray1988[i_250_] = (byte) -1;
					aShortArray1993[i_250_] = (short) -1;
				}
			}
			if (i_220_ == 255)
				aByteArray1977[i_250_] = class282_sub35_217_.readByte((short) -15374);
			if (i_221_ == 1)
				aByteArray1975[i_250_] = class282_sub35_218_.readByte((short) -6657);
			if (i_222_ == 1)
				anIntArray1991[i_250_] = class282_sub35_219_.readUnsignedByte();
		}
		anInt1999 = -1;
		class282_sub35.index = i_236_ * -1115476867;
		class282_sub35_216_.index = i_230_ * -1115476867;
		short i_252_ = 0;
		short i_253_ = 0;
		short i_254_ = 0;
		int i_255_ = 0;
		for (int i_256_ = 0; i_256_ < anInt1973; i_256_++) {
			int i_257_ = class282_sub35_216_.readUnsignedByte();
			if (i_257_ == 1) {
				i_252_ = (short) (class282_sub35.method13094(-621211908) + i_255_);
				i_255_ = i_252_;
				i_253_ = (short) (class282_sub35.method13094(-1539331252) + i_255_);
				i_255_ = i_253_;
				i_254_ = (short) (class282_sub35.method13094(1068170824) + i_255_);
				i_255_ = i_254_;
				aShortArray1982[i_256_] = i_252_;
				aShortArray1983[i_256_] = i_253_;
				aShortArray1984[i_256_] = i_254_;
				if (i_252_ > anInt1999)
					anInt1999 = i_252_;
				if (i_253_ > anInt1999)
					anInt1999 = i_253_;
				if (i_254_ > anInt1999)
					anInt1999 = i_254_;
			}
			if (i_257_ == 2) {
				i_253_ = i_254_;
				i_254_ = (short) (class282_sub35.method13094(-1125059614) + i_255_);
				i_255_ = i_254_;
				aShortArray1982[i_256_] = i_252_;
				aShortArray1983[i_256_] = i_253_;
				aShortArray1984[i_256_] = i_254_;
				if (i_254_ > anInt1999)
					anInt1999 = i_254_;
			}
			if (i_257_ == 3) {
				i_252_ = i_254_;
				i_254_ = (short) (class282_sub35.method13094(-281313964) + i_255_);
				i_255_ = i_254_;
				aShortArray1982[i_256_] = i_252_;
				aShortArray1983[i_256_] = i_253_;
				aShortArray1984[i_256_] = i_254_;
				if (i_254_ > anInt1999)
					anInt1999 = i_254_;
			}
			if (i_257_ == 4) {
				short i_258_ = i_252_;
				i_252_ = i_253_;
				i_253_ = i_258_;
				i_254_ = (short) (class282_sub35.method13094(1047370048) + i_255_);
				i_255_ = i_254_;
				aShortArray1982[i_256_] = i_252_;
				aShortArray1983[i_256_] = i_253_;
				aShortArray1984[i_256_] = i_254_;
				if (i_254_ > anInt1999)
					anInt1999 = i_254_;
			}
		}
		anInt1999++;
		class282_sub35.index = i_238_ * -1115476867;
		for (int i_259_ = 0; i_259_ < anInt1979; i_259_++) {
			aByteArray1995[i_259_] = (byte) 0;
			aShortArray1996[i_259_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1987[i_259_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1998[i_259_] = (short) class282_sub35.readUnsignedShort();
		}
		if (aByteArray1988 != null) {
			boolean bool_260_ = false;
			for (int i_261_ = 0; i_261_ < anInt1973; i_261_++) {
				int i_262_ = aByteArray1988[i_261_] & 0xff;
				if (i_262_ != 255) {
					if (((aShortArray1996[i_262_] & 0xffff) == aShortArray1982[i_261_]) && ((aShortArray1987[i_262_] & 0xffff) == aShortArray1983[i_261_]) && ((aShortArray1998[i_262_] & 0xffff) == aShortArray1984[i_261_]))
						aByteArray1988[i_261_] = (byte) -1;
					else
						bool_260_ = true;
				}
			}
			if (!bool_260_)
				aByteArray1988 = null;
		}
		if (!bool_215_)
			aShortArray1993 = null;
		if (!bool)
			aByteArray1985 = null;
	}

	final int method2675(RSMesh class157_263_, int i, short i_264_) {
		int i_265_ = class157_263_.anIntArray1976[i];
		int i_266_ = class157_263_.anIntArray2003[i];
		int i_267_ = class157_263_.anIntArray1978[i];
		for (int i_268_ = 0; i_268_ < anInt1974; i_268_++) {
			if (i_265_ == anIntArray1976[i_268_] && i_266_ == anIntArray2003[i_268_] && i_267_ == anIntArray1978[i_268_]) {
				aShortArray1980[i_268_] |= i_264_;
				return i_268_;
			}
		}
		anIntArray1976[anInt1974] = i_265_;
		anIntArray2003[anInt1974] = i_266_;
		anIntArray1978[anInt1974] = i_267_;
		aShortArray1980[anInt1974] = i_264_;
		anIntArray2002[anInt1974] = (class157_263_.anIntArray2002 != null ? class157_263_.anIntArray2002[i] : -1);
		return anInt1974++;
	}

	final int method2676(RSMesh class157_269_, int i, short i_270_) {
		int i_271_ = class157_269_.anIntArray1976[i];
		int i_272_ = class157_269_.anIntArray2003[i];
		int i_273_ = class157_269_.anIntArray1978[i];
		for (int i_274_ = 0; i_274_ < anInt1974; i_274_++) {
			if (i_271_ == anIntArray1976[i_274_] && i_272_ == anIntArray2003[i_274_] && i_273_ == anIntArray1978[i_274_]) {
				aShortArray1980[i_274_] |= i_270_;
				return i_274_;
			}
		}
		anIntArray1976[anInt1974] = i_271_;
		anIntArray2003[anInt1974] = i_272_;
		anIntArray1978[anInt1974] = i_273_;
		aShortArray1980[anInt1974] = i_270_;
		anIntArray2002[anInt1974] = (class157_269_.anIntArray2002 != null ? class157_269_.anIntArray2002[i] : -1);
		return anInt1974++;
	}

	void method2677(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_275_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_276_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_277_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_278_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_279_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_280_ = new RsByteBuffer(is);
		class282_sub35.index = (is.length - 23) * -1115476867;
		anInt1974 = class282_sub35.readUnsignedShort();
		anInt1973 = class282_sub35.readUnsignedShort();
		anInt1979 = class282_sub35.readUnsignedByte();
		int i = class282_sub35.readUnsignedByte();
		boolean bool = (i & 0x1) == 1;
		boolean bool_281_ = (i & 0x2) == 2;
		boolean bool_282_ = (i & 0x4) == 4;
		boolean bool_283_ = (i & 0x8) == 8;
		if (bool_283_) {
			class282_sub35.index -= 781596523;
			zoom = class282_sub35.readUnsignedByte();
			class282_sub35.index += 1897073390;
		}
		int i_284_ = class282_sub35.readUnsignedByte();
		int i_285_ = class282_sub35.readUnsignedByte();
		int i_286_ = class282_sub35.readUnsignedByte();
		int i_287_ = class282_sub35.readUnsignedByte();
		int i_288_ = class282_sub35.readUnsignedByte();
		int i_289_ = class282_sub35.readUnsignedShort();
		int i_290_ = class282_sub35.readUnsignedShort();
		int i_291_ = class282_sub35.readUnsignedShort();
		int i_292_ = class282_sub35.readUnsignedShort();
		int i_293_ = class282_sub35.readUnsignedShort();
		int i_294_ = 0;
		int i_295_ = 0;
		int i_296_ = 0;
		if (anInt1979 > 0) {
			aByteArray1995 = new byte[anInt1979];
			class282_sub35.index = 0;
			for (int i_297_ = 0; i_297_ < anInt1979; i_297_++) {
				byte i_298_ = (aByteArray1995[i_297_] = class282_sub35.readByte((short) -17040));
				if (i_298_ == 0)
					i_294_++;
				if (i_298_ >= 1 && i_298_ <= 3)
					i_295_++;
				if (i_298_ == 2)
					i_296_++;
			}
		}
		int i_299_ = anInt1979;
		int i_300_ = i_299_;
		i_299_ += anInt1974;
		int i_301_ = i_299_;
		if (bool)
			i_299_ += anInt1973;
		int i_302_ = i_299_;
		i_299_ += anInt1973;
		int i_303_ = i_299_;
		if (i_284_ == 255)
			i_299_ += anInt1973;
		int i_304_ = i_299_;
		if (i_286_ == 1)
			i_299_ += anInt1973;
		int i_305_ = i_299_;
		if (i_288_ == 1)
			i_299_ += anInt1974;
		int i_306_ = i_299_;
		if (i_285_ == 1)
			i_299_ += anInt1973;
		int i_307_ = i_299_;
		i_299_ += i_292_;
		int i_308_ = i_299_;
		if (i_287_ == 1)
			i_299_ += anInt1973 * 2;
		int i_309_ = i_299_;
		i_299_ += i_293_;
		int i_310_ = i_299_;
		i_299_ += anInt1973 * 2;
		int i_311_ = i_299_;
		i_299_ += i_289_;
		int i_312_ = i_299_;
		i_299_ += i_290_;
		int i_313_ = i_299_;
		i_299_ += i_291_;
		int i_314_ = i_299_;
		i_299_ += i_294_ * 6;
		int i_315_ = i_299_;
		i_299_ += i_295_ * 6;
		int i_316_ = 6;
		if (zoom == 14)
			i_316_ = 7;
		else if (zoom >= 15)
			i_316_ = 9;
		int i_317_ = i_299_;
		i_299_ += i_295_ * i_316_;
		int i_318_ = i_299_;
		i_299_ += i_295_;
		int i_319_ = i_299_;
		i_299_ += i_295_;
		int i_320_ = i_299_;
		i_299_ += i_295_ + i_296_ * 2;
		int i_321_ = i_299_;
		anIntArray1976 = new int[anInt1974];
		anIntArray2003 = new int[anInt1974];
		anIntArray1978 = new int[anInt1974];
		aShortArray1982 = new short[anInt1973];
		aShortArray1983 = new short[anInt1973];
		aShortArray1984 = new short[anInt1973];
		if (i_288_ == 1)
			anIntArray2002 = new int[anInt1974];
		if (bool)
			aByteArray1985 = new byte[anInt1973];
		if (i_284_ == 255)
			aByteArray1977 = new byte[anInt1973];
		else
			aByte1994 = (byte) i_284_;
		if (i_285_ == 1)
			aByteArray1975 = new byte[anInt1973];
		if (i_286_ == 1)
			anIntArray1991 = new int[anInt1973];
		if (i_287_ == 1)
			aShortArray1993 = new short[anInt1973];
		if (i_287_ == 1 && anInt1979 > 0)
			aByteArray1988 = new byte[anInt1973];
		aShortArray2006 = new short[anInt1973];
		if (anInt1979 > 0) {
			aShortArray1996 = new short[anInt1979];
			aShortArray1987 = new short[anInt1979];
			aShortArray1998 = new short[anInt1979];
			if (i_295_ > 0) {
				anIntArray1989 = new int[i_295_];
				anIntArray2000 = new int[i_295_];
				anIntArray2001 = new int[i_295_];
				aByteArray2005 = new byte[i_295_];
				aByteArray1990 = new byte[i_295_];
				anIntArray1992 = new int[i_295_];
			}
			if (i_296_ > 0) {
				anIntArray1997 = new int[i_296_];
				anIntArray2004 = new int[i_296_];
			}
		}
		class282_sub35.index = i_300_ * -1115476867;
		class282_sub35_275_.index = i_311_ * -1115476867;
		class282_sub35_276_.index = i_312_ * -1115476867;
		class282_sub35_277_.index = i_313_ * -1115476867;
		class282_sub35_278_.index = i_305_ * -1115476867;
		int i_322_ = 0;
		int i_323_ = 0;
		int i_324_ = 0;
		for (int i_325_ = 0; i_325_ < anInt1974; i_325_++) {
			int i_326_ = class282_sub35.readUnsignedByte();
			int i_327_ = 0;
			if ((i_326_ & 0x1) != 0)
				i_327_ = class282_sub35_275_.method13094(1131725919);
			int i_328_ = 0;
			if ((i_326_ & 0x2) != 0)
				i_328_ = class282_sub35_276_.method13094(1883707107);
			int i_329_ = 0;
			if ((i_326_ & 0x4) != 0)
				i_329_ = class282_sub35_277_.method13094(-1812774989);
			anIntArray1976[i_325_] = i_322_ + i_327_;
			anIntArray2003[i_325_] = i_323_ + i_328_;
			anIntArray1978[i_325_] = i_324_ + i_329_;
			i_322_ = anIntArray1976[i_325_];
			i_323_ = anIntArray2003[i_325_];
			i_324_ = anIntArray1978[i_325_];
			if (i_288_ == 1)
				anIntArray2002[i_325_] = class282_sub35_278_.readUnsignedByte();
		}
		class282_sub35.index = i_310_ * -1115476867;
		class282_sub35_275_.index = i_301_ * -1115476867;
		class282_sub35_276_.index = i_303_ * -1115476867;
		class282_sub35_277_.index = i_306_ * -1115476867;
		class282_sub35_278_.index = i_304_ * -1115476867;
		class282_sub35_279_.index = i_308_ * -1115476867;
		class282_sub35_280_.index = i_309_ * -1115476867;
		for (int i_330_ = 0; i_330_ < anInt1973; i_330_++) {
			aShortArray2006[i_330_] = (short) class282_sub35.readUnsignedShort();
			if (bool)
				aByteArray1985[i_330_] = class282_sub35_275_.readByte((short) -22377);
			if (i_284_ == 255)
				aByteArray1977[i_330_] = class282_sub35_276_.readByte((short) -29270);
			if (i_285_ == 1)
				aByteArray1975[i_330_] = class282_sub35_277_.readByte((short) -4323);
			if (i_286_ == 1)
				anIntArray1991[i_330_] = class282_sub35_278_.readUnsignedByte();
			if (i_287_ == 1)
				aShortArray1993[i_330_] = (short) (class282_sub35_279_.readUnsignedShort() - 1);
			if (aByteArray1988 != null) {
				if (aShortArray1993[i_330_] != -1)
					aByteArray1988[i_330_] = (byte) (class282_sub35_280_.readUnsignedByte() - 1);
				else
					aByteArray1988[i_330_] = (byte) -1;
			}
		}
		anInt1999 = -1;
		class282_sub35.index = i_307_ * -1115476867;
		class282_sub35_275_.index = i_302_ * -1115476867;
		method2659(class282_sub35, class282_sub35_275_);
		class282_sub35.index = i_314_ * -1115476867;
		class282_sub35_275_.index = i_315_ * -1115476867;
		class282_sub35_276_.index = i_317_ * -1115476867;
		class282_sub35_277_.index = i_318_ * -1115476867;
		class282_sub35_278_.index = i_319_ * -1115476867;
		class282_sub35_279_.index = i_320_ * -1115476867;
		method2660(class282_sub35, class282_sub35_275_, class282_sub35_276_, class282_sub35_277_, class282_sub35_278_, class282_sub35_279_);
		class282_sub35.index = i_321_ * -1115476867;
		if (bool_281_) {
			int i_331_ = class282_sub35.readUnsignedByte();
			if (i_331_ > 0) {
				aClass87Array2007 = new Class87[i_331_];
				for (int i_332_ = 0; i_332_ < i_331_; i_332_++) {
					int i_333_ = class282_sub35.readUnsignedShort();
					int i_334_ = class282_sub35.readUnsignedShort();
					byte i_335_;
					if (i_284_ == 255)
						i_335_ = aByteArray1977[i_334_];
					else
						i_335_ = (byte) i_284_;
					aClass87Array2007[i_332_] = new Class87(i_333_, aShortArray1982[i_334_], aShortArray1983[i_334_], aShortArray1984[i_334_], i_335_);
				}
			}
			int i_336_ = class282_sub35.readUnsignedByte();
			if (i_336_ > 0) {
				aClass172Array2008 = new Class172[i_336_];
				for (int i_337_ = 0; i_337_ < i_336_; i_337_++) {
					int i_338_ = class282_sub35.readUnsignedShort();
					int i_339_ = class282_sub35.readUnsignedShort();
					aClass172Array2008[i_337_] = new Class172(i_338_, i_339_);
				}
			}
		}
		if (bool_282_) {
			int i_340_ = class282_sub35.readUnsignedByte();
			if (i_340_ > 0) {
				aClass84Array2009 = new Class84[i_340_];
				for (int i_341_ = 0; i_341_ < i_340_; i_341_++) {
					int i_342_ = class282_sub35.readUnsignedShort();
					int i_343_ = class282_sub35.readUnsignedShort();
					int i_344_ = class282_sub35.readUnsignedByte();
					byte i_345_ = class282_sub35.readByte((short) -17540);
					aClass84Array2009[i_341_] = new Class84(i_342_, i_343_, i_344_, i_345_);
				}
			}
		}
	}

	void method2678(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_346_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_347_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_348_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_349_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_350_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_351_ = new RsByteBuffer(is);
		class282_sub35.index = (is.length - 23) * -1115476867;
		anInt1974 = class282_sub35.readUnsignedShort();
		anInt1973 = class282_sub35.readUnsignedShort();
		anInt1979 = class282_sub35.readUnsignedByte();
		int i = class282_sub35.readUnsignedByte();
		boolean bool = (i & 0x1) == 1;
		boolean bool_352_ = (i & 0x2) == 2;
		boolean bool_353_ = (i & 0x4) == 4;
		boolean bool_354_ = (i & 0x8) == 8;
		if (bool_354_) {
			class282_sub35.index -= 781596523;
			zoom = class282_sub35.readUnsignedByte();
			class282_sub35.index += 1897073390;
		}
		int i_355_ = class282_sub35.readUnsignedByte();
		int i_356_ = class282_sub35.readUnsignedByte();
		int i_357_ = class282_sub35.readUnsignedByte();
		int i_358_ = class282_sub35.readUnsignedByte();
		int i_359_ = class282_sub35.readUnsignedByte();
		int i_360_ = class282_sub35.readUnsignedShort();
		int i_361_ = class282_sub35.readUnsignedShort();
		int i_362_ = class282_sub35.readUnsignedShort();
		int i_363_ = class282_sub35.readUnsignedShort();
		int i_364_ = class282_sub35.readUnsignedShort();
		int i_365_ = 0;
		int i_366_ = 0;
		int i_367_ = 0;
		if (anInt1979 > 0) {
			aByteArray1995 = new byte[anInt1979];
			class282_sub35.index = 0;
			for (int i_368_ = 0; i_368_ < anInt1979; i_368_++) {
				byte i_369_ = (aByteArray1995[i_368_] = class282_sub35.readByte((short) -28002));
				if (i_369_ == 0)
					i_365_++;
				if (i_369_ >= 1 && i_369_ <= 3)
					i_366_++;
				if (i_369_ == 2)
					i_367_++;
			}
		}
		int i_370_ = anInt1979;
		int i_371_ = i_370_;
		i_370_ += anInt1974;
		int i_372_ = i_370_;
		if (bool)
			i_370_ += anInt1973;
		int i_373_ = i_370_;
		i_370_ += anInt1973;
		int i_374_ = i_370_;
		if (i_355_ == 255)
			i_370_ += anInt1973;
		int i_375_ = i_370_;
		if (i_357_ == 1)
			i_370_ += anInt1973;
		int i_376_ = i_370_;
		if (i_359_ == 1)
			i_370_ += anInt1974;
		int i_377_ = i_370_;
		if (i_356_ == 1)
			i_370_ += anInt1973;
		int i_378_ = i_370_;
		i_370_ += i_363_;
		int i_379_ = i_370_;
		if (i_358_ == 1)
			i_370_ += anInt1973 * 2;
		int i_380_ = i_370_;
		i_370_ += i_364_;
		int i_381_ = i_370_;
		i_370_ += anInt1973 * 2;
		int i_382_ = i_370_;
		i_370_ += i_360_;
		int i_383_ = i_370_;
		i_370_ += i_361_;
		int i_384_ = i_370_;
		i_370_ += i_362_;
		int i_385_ = i_370_;
		i_370_ += i_365_ * 6;
		int i_386_ = i_370_;
		i_370_ += i_366_ * 6;
		int i_387_ = 6;
		if (zoom == 14)
			i_387_ = 7;
		else if (zoom >= 15)
			i_387_ = 9;
		int i_388_ = i_370_;
		i_370_ += i_366_ * i_387_;
		int i_389_ = i_370_;
		i_370_ += i_366_;
		int i_390_ = i_370_;
		i_370_ += i_366_;
		int i_391_ = i_370_;
		i_370_ += i_366_ + i_367_ * 2;
		int i_392_ = i_370_;
		anIntArray1976 = new int[anInt1974];
		anIntArray2003 = new int[anInt1974];
		anIntArray1978 = new int[anInt1974];
		aShortArray1982 = new short[anInt1973];
		aShortArray1983 = new short[anInt1973];
		aShortArray1984 = new short[anInt1973];
		if (i_359_ == 1)
			anIntArray2002 = new int[anInt1974];
		if (bool)
			aByteArray1985 = new byte[anInt1973];
		if (i_355_ == 255)
			aByteArray1977 = new byte[anInt1973];
		else
			aByte1994 = (byte) i_355_;
		if (i_356_ == 1)
			aByteArray1975 = new byte[anInt1973];
		if (i_357_ == 1)
			anIntArray1991 = new int[anInt1973];
		if (i_358_ == 1)
			aShortArray1993 = new short[anInt1973];
		if (i_358_ == 1 && anInt1979 > 0)
			aByteArray1988 = new byte[anInt1973];
		aShortArray2006 = new short[anInt1973];
		if (anInt1979 > 0) {
			aShortArray1996 = new short[anInt1979];
			aShortArray1987 = new short[anInt1979];
			aShortArray1998 = new short[anInt1979];
			if (i_366_ > 0) {
				anIntArray1989 = new int[i_366_];
				anIntArray2000 = new int[i_366_];
				anIntArray2001 = new int[i_366_];
				aByteArray2005 = new byte[i_366_];
				aByteArray1990 = new byte[i_366_];
				anIntArray1992 = new int[i_366_];
			}
			if (i_367_ > 0) {
				anIntArray1997 = new int[i_367_];
				anIntArray2004 = new int[i_367_];
			}
		}
		class282_sub35.index = i_371_ * -1115476867;
		class282_sub35_346_.index = i_382_ * -1115476867;
		class282_sub35_347_.index = i_383_ * -1115476867;
		class282_sub35_348_.index = i_384_ * -1115476867;
		class282_sub35_349_.index = i_376_ * -1115476867;
		int i_393_ = 0;
		int i_394_ = 0;
		int i_395_ = 0;
		for (int i_396_ = 0; i_396_ < anInt1974; i_396_++) {
			int i_397_ = class282_sub35.readUnsignedByte();
			int i_398_ = 0;
			if ((i_397_ & 0x1) != 0)
				i_398_ = class282_sub35_346_.method13094(-1808874600);
			int i_399_ = 0;
			if ((i_397_ & 0x2) != 0)
				i_399_ = class282_sub35_347_.method13094(299213688);
			int i_400_ = 0;
			if ((i_397_ & 0x4) != 0)
				i_400_ = class282_sub35_348_.method13094(-1879830061);
			anIntArray1976[i_396_] = i_393_ + i_398_;
			anIntArray2003[i_396_] = i_394_ + i_399_;
			anIntArray1978[i_396_] = i_395_ + i_400_;
			i_393_ = anIntArray1976[i_396_];
			i_394_ = anIntArray2003[i_396_];
			i_395_ = anIntArray1978[i_396_];
			if (i_359_ == 1)
				anIntArray2002[i_396_] = class282_sub35_349_.readUnsignedByte();
		}
		class282_sub35.index = i_381_ * -1115476867;
		class282_sub35_346_.index = i_372_ * -1115476867;
		class282_sub35_347_.index = i_374_ * -1115476867;
		class282_sub35_348_.index = i_377_ * -1115476867;
		class282_sub35_349_.index = i_375_ * -1115476867;
		class282_sub35_350_.index = i_379_ * -1115476867;
		class282_sub35_351_.index = i_380_ * -1115476867;
		for (int i_401_ = 0; i_401_ < anInt1973; i_401_++) {
			aShortArray2006[i_401_] = (short) class282_sub35.readUnsignedShort();
			if (bool)
				aByteArray1985[i_401_] = class282_sub35_346_.readByte((short) -24948);
			if (i_355_ == 255)
				aByteArray1977[i_401_] = class282_sub35_347_.readByte((short) -2291);
			if (i_356_ == 1)
				aByteArray1975[i_401_] = class282_sub35_348_.readByte((short) -7136);
			if (i_357_ == 1)
				anIntArray1991[i_401_] = class282_sub35_349_.readUnsignedByte();
			if (i_358_ == 1)
				aShortArray1993[i_401_] = (short) (class282_sub35_350_.readUnsignedShort() - 1);
			if (aByteArray1988 != null) {
				if (aShortArray1993[i_401_] != -1)
					aByteArray1988[i_401_] = (byte) (class282_sub35_351_.readUnsignedByte() - 1);
				else
					aByteArray1988[i_401_] = (byte) -1;
			}
		}
		anInt1999 = -1;
		class282_sub35.index = i_378_ * -1115476867;
		class282_sub35_346_.index = i_373_ * -1115476867;
		method2659(class282_sub35, class282_sub35_346_);
		class282_sub35.index = i_385_ * -1115476867;
		class282_sub35_346_.index = i_386_ * -1115476867;
		class282_sub35_347_.index = i_388_ * -1115476867;
		class282_sub35_348_.index = i_389_ * -1115476867;
		class282_sub35_349_.index = i_390_ * -1115476867;
		class282_sub35_350_.index = i_391_ * -1115476867;
		method2660(class282_sub35, class282_sub35_346_, class282_sub35_347_, class282_sub35_348_, class282_sub35_349_, class282_sub35_350_);
		class282_sub35.index = i_392_ * -1115476867;
		if (bool_352_) {
			int i_402_ = class282_sub35.readUnsignedByte();
			if (i_402_ > 0) {
				aClass87Array2007 = new Class87[i_402_];
				for (int i_403_ = 0; i_403_ < i_402_; i_403_++) {
					int i_404_ = class282_sub35.readUnsignedShort();
					int i_405_ = class282_sub35.readUnsignedShort();
					byte i_406_;
					if (i_355_ == 255)
						i_406_ = aByteArray1977[i_405_];
					else
						i_406_ = (byte) i_355_;
					aClass87Array2007[i_403_] = new Class87(i_404_, aShortArray1982[i_405_], aShortArray1983[i_405_], aShortArray1984[i_405_], i_406_);
				}
			}
			int i_407_ = class282_sub35.readUnsignedByte();
			if (i_407_ > 0) {
				aClass172Array2008 = new Class172[i_407_];
				for (int i_408_ = 0; i_408_ < i_407_; i_408_++) {
					int i_409_ = class282_sub35.readUnsignedShort();
					int i_410_ = class282_sub35.readUnsignedShort();
					aClass172Array2008[i_408_] = new Class172(i_409_, i_410_);
				}
			}
		}
		if (bool_353_) {
			int i_411_ = class282_sub35.readUnsignedByte();
			if (i_411_ > 0) {
				aClass84Array2009 = new Class84[i_411_];
				for (int i_412_ = 0; i_412_ < i_411_; i_412_++) {
					int i_413_ = class282_sub35.readUnsignedShort();
					int i_414_ = class282_sub35.readUnsignedShort();
					int i_415_ = class282_sub35.readUnsignedByte();
					byte i_416_ = class282_sub35.readByte((short) -27406);
					aClass84Array2009[i_412_] = new Class84(i_413_, i_414_, i_415_, i_416_);
				}
			}
		}
	}

	public void upscale(int i) {
		for (int i_417_ = 0; i_417_ < anInt1974; i_417_++) {
			anIntArray1976[i_417_] <<= i;
			anIntArray2003[i_417_] <<= i;
			anIntArray1978[i_417_] <<= i;
		}
		if (anInt1979 > 0 && anIntArray1989 != null) {
			for (int i_418_ = 0; i_418_ < anIntArray1989.length; i_418_++) {
				anIntArray1989[i_418_] <<= i;
				anIntArray2000[i_418_] <<= i;
				if (aByteArray1995[i_418_] != 1)
					anIntArray2001[i_418_] <<= i;
			}
		}
	}

	void method2680(RsByteBuffer class282_sub35, RsByteBuffer class282_sub35_419_) {
		short i = 0;
		short i_420_ = 0;
		short i_421_ = 0;
		int i_422_ = 0;
		for (int i_423_ = 0; i_423_ < anInt1973; i_423_++) {
			int i_424_ = class282_sub35_419_.readUnsignedByte();
			if (i_424_ == 1) {
				i = (short) (class282_sub35.method13094(15107788) + i_422_);
				i_422_ = i;
				i_420_ = (short) (class282_sub35.method13094(52561964) + i_422_);
				i_422_ = i_420_;
				i_421_ = (short) (class282_sub35.method13094(-723900622) + i_422_);
				i_422_ = i_421_;
				aShortArray1982[i_423_] = i;
				aShortArray1983[i_423_] = i_420_;
				aShortArray1984[i_423_] = i_421_;
				if (i > anInt1999)
					anInt1999 = i;
				if (i_420_ > anInt1999)
					anInt1999 = i_420_;
				if (i_421_ > anInt1999)
					anInt1999 = i_421_;
			}
			if (i_424_ == 2) {
				i_420_ = i_421_;
				i_421_ = (short) (class282_sub35.method13094(-1867258294) + i_422_);
				i_422_ = i_421_;
				aShortArray1982[i_423_] = i;
				aShortArray1983[i_423_] = i_420_;
				aShortArray1984[i_423_] = i_421_;
				if (i_421_ > anInt1999)
					anInt1999 = i_421_;
			}
			if (i_424_ == 3) {
				i = i_421_;
				i_421_ = (short) (class282_sub35.method13094(1958095258) + i_422_);
				i_422_ = i_421_;
				aShortArray1982[i_423_] = i;
				aShortArray1983[i_423_] = i_420_;
				aShortArray1984[i_423_] = i_421_;
				if (i_421_ > anInt1999)
					anInt1999 = i_421_;
			}
			if (i_424_ == 4) {
				short i_425_ = i;
				i = i_420_;
				i_420_ = i_425_;
				i_421_ = (short) (class282_sub35.method13094(-424877902) + i_422_);
				i_422_ = i_421_;
				aShortArray1982[i_423_] = i;
				aShortArray1983[i_423_] = i_420_;
				aShortArray1984[i_423_] = i_421_;
				if (i_421_ > anInt1999)
					anInt1999 = i_421_;
			}
		}
		anInt1999++;
	}

	void method2681(RsByteBuffer class282_sub35, RsByteBuffer class282_sub35_426_) {
		short i = 0;
		short i_427_ = 0;
		short i_428_ = 0;
		int i_429_ = 0;
		for (int i_430_ = 0; i_430_ < anInt1973; i_430_++) {
			int i_431_ = class282_sub35_426_.readUnsignedByte();
			if (i_431_ == 1) {
				i = (short) (class282_sub35.method13094(1747290103) + i_429_);
				i_429_ = i;
				i_427_ = (short) (class282_sub35.method13094(-851511270) + i_429_);
				i_429_ = i_427_;
				i_428_ = (short) (class282_sub35.method13094(-391137643) + i_429_);
				i_429_ = i_428_;
				aShortArray1982[i_430_] = i;
				aShortArray1983[i_430_] = i_427_;
				aShortArray1984[i_430_] = i_428_;
				if (i > anInt1999)
					anInt1999 = i;
				if (i_427_ > anInt1999)
					anInt1999 = i_427_;
				if (i_428_ > anInt1999)
					anInt1999 = i_428_;
			}
			if (i_431_ == 2) {
				i_427_ = i_428_;
				i_428_ = (short) (class282_sub35.method13094(-474874016) + i_429_);
				i_429_ = i_428_;
				aShortArray1982[i_430_] = i;
				aShortArray1983[i_430_] = i_427_;
				aShortArray1984[i_430_] = i_428_;
				if (i_428_ > anInt1999)
					anInt1999 = i_428_;
			}
			if (i_431_ == 3) {
				i = i_428_;
				i_428_ = (short) (class282_sub35.method13094(333761781) + i_429_);
				i_429_ = i_428_;
				aShortArray1982[i_430_] = i;
				aShortArray1983[i_430_] = i_427_;
				aShortArray1984[i_430_] = i_428_;
				if (i_428_ > anInt1999)
					anInt1999 = i_428_;
			}
			if (i_431_ == 4) {
				short i_432_ = i;
				i = i_427_;
				i_427_ = i_432_;
				i_428_ = (short) (class282_sub35.method13094(2081978581) + i_429_);
				i_429_ = i_428_;
				aShortArray1982[i_430_] = i;
				aShortArray1983[i_430_] = i_427_;
				aShortArray1984[i_430_] = i_428_;
				if (i_428_ > anInt1999)
					anInt1999 = i_428_;
			}
		}
		anInt1999++;
	}

	void method2682(byte[] is) {
		boolean bool = false;
		boolean bool_433_ = false;
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_434_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_435_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_436_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_437_ = new RsByteBuffer(is);
		class282_sub35.index = (is.length - 18) * -1115476867;
		anInt1974 = class282_sub35.readUnsignedShort();
		anInt1973 = class282_sub35.readUnsignedShort();
		anInt1979 = class282_sub35.readUnsignedByte();
		int i = class282_sub35.readUnsignedByte();
		int i_438_ = class282_sub35.readUnsignedByte();
		int i_439_ = class282_sub35.readUnsignedByte();
		int i_440_ = class282_sub35.readUnsignedByte();
		int i_441_ = class282_sub35.readUnsignedByte();
		int i_442_ = class282_sub35.readUnsignedShort();
		int i_443_ = class282_sub35.readUnsignedShort();
		int i_444_ = class282_sub35.readUnsignedShort();
		int i_445_ = class282_sub35.readUnsignedShort();
		int i_446_ = 0;
		int i_447_ = i_446_;
		i_446_ += anInt1974;
		int i_448_ = i_446_;
		i_446_ += anInt1973;
		int i_449_ = i_446_;
		if (i_438_ == 255)
			i_446_ += anInt1973;
		int i_450_ = i_446_;
		if (i_440_ == 1)
			i_446_ += anInt1973;
		int i_451_ = i_446_;
		if (i == 1)
			i_446_ += anInt1973;
		int i_452_ = i_446_;
		if (i_441_ == 1)
			i_446_ += anInt1974;
		int i_453_ = i_446_;
		if (i_439_ == 1)
			i_446_ += anInt1973;
		int i_454_ = i_446_;
		i_446_ += i_445_;
		int i_455_ = i_446_;
		i_446_ += anInt1973 * 2;
		int i_456_ = i_446_;
		i_446_ += anInt1979 * 6;
		int i_457_ = i_446_;
		i_446_ += i_442_;
		int i_458_ = i_446_;
		i_446_ += i_443_;
		int i_459_ = i_446_;
		i_446_ += i_444_;
		anIntArray1976 = new int[anInt1974];
		anIntArray2003 = new int[anInt1974];
		anIntArray1978 = new int[anInt1974];
		aShortArray1982 = new short[anInt1973];
		aShortArray1983 = new short[anInt1973];
		aShortArray1984 = new short[anInt1973];
		if (anInt1979 > 0) {
			aByteArray1995 = new byte[anInt1979];
			aShortArray1996 = new short[anInt1979];
			aShortArray1987 = new short[anInt1979];
			aShortArray1998 = new short[anInt1979];
		}
		if (i_441_ == 1)
			anIntArray2002 = new int[anInt1974];
		if (i == 1) {
			aByteArray1985 = new byte[anInt1973];
			aByteArray1988 = new byte[anInt1973];
			aShortArray1993 = new short[anInt1973];
		}
		if (i_438_ == 255)
			aByteArray1977 = new byte[anInt1973];
		else
			aByte1994 = (byte) i_438_;
		if (i_439_ == 1)
			aByteArray1975 = new byte[anInt1973];
		if (i_440_ == 1)
			anIntArray1991 = new int[anInt1973];
		aShortArray2006 = new short[anInt1973];
		class282_sub35.index = i_447_ * -1115476867;
		class282_sub35_434_.index = i_457_ * -1115476867;
		class282_sub35_435_.index = i_458_ * -1115476867;
		class282_sub35_436_.index = i_459_ * -1115476867;
		class282_sub35_437_.index = i_452_ * -1115476867;
		int i_460_ = 0;
		int i_461_ = 0;
		int i_462_ = 0;
		for (int i_463_ = 0; i_463_ < anInt1974; i_463_++) {
			int i_464_ = class282_sub35.readUnsignedByte();
			int i_465_ = 0;
			if ((i_464_ & 0x1) != 0)
				i_465_ = class282_sub35_434_.method13094(-675083908);
			int i_466_ = 0;
			if ((i_464_ & 0x2) != 0)
				i_466_ = class282_sub35_435_.method13094(-1444235444);
			int i_467_ = 0;
			if ((i_464_ & 0x4) != 0)
				i_467_ = class282_sub35_436_.method13094(2006668793);
			anIntArray1976[i_463_] = i_460_ + i_465_;
			anIntArray2003[i_463_] = i_461_ + i_466_;
			anIntArray1978[i_463_] = i_462_ + i_467_;
			i_460_ = anIntArray1976[i_463_];
			i_461_ = anIntArray2003[i_463_];
			i_462_ = anIntArray1978[i_463_];
			if (i_441_ == 1)
				anIntArray2002[i_463_] = class282_sub35_437_.readUnsignedByte();
		}
		class282_sub35.index = i_455_ * -1115476867;
		class282_sub35_434_.index = i_451_ * -1115476867;
		class282_sub35_435_.index = i_449_ * -1115476867;
		class282_sub35_436_.index = i_453_ * -1115476867;
		class282_sub35_437_.index = i_450_ * -1115476867;
		for (int i_468_ = 0; i_468_ < anInt1973; i_468_++) {
			aShortArray2006[i_468_] = (short) class282_sub35.readUnsignedShort();
			if (i == 1) {
				int i_469_ = class282_sub35_434_.readUnsignedByte();
				if ((i_469_ & 0x1) == 1) {
					aByteArray1985[i_468_] = (byte) 1;
					bool = true;
				} else
					aByteArray1985[i_468_] = (byte) 0;
				if ((i_469_ & 0x2) == 2) {
					aByteArray1988[i_468_] = (byte) (i_469_ >> 2);
					aShortArray1993[i_468_] = aShortArray2006[i_468_];
					aShortArray2006[i_468_] = (short) 127;
					if (aShortArray1993[i_468_] != -1)
						bool_433_ = true;
				} else {
					aByteArray1988[i_468_] = (byte) -1;
					aShortArray1993[i_468_] = (short) -1;
				}
			}
			if (i_438_ == 255)
				aByteArray1977[i_468_] = class282_sub35_435_.readByte((short) -16715);
			if (i_439_ == 1)
				aByteArray1975[i_468_] = class282_sub35_436_.readByte((short) -1515);
			if (i_440_ == 1)
				anIntArray1991[i_468_] = class282_sub35_437_.readUnsignedByte();
		}
		anInt1999 = -1;
		class282_sub35.index = i_454_ * -1115476867;
		class282_sub35_434_.index = i_448_ * -1115476867;
		short i_470_ = 0;
		short i_471_ = 0;
		short i_472_ = 0;
		int i_473_ = 0;
		for (int i_474_ = 0; i_474_ < anInt1973; i_474_++) {
			int i_475_ = class282_sub35_434_.readUnsignedByte();
			if (i_475_ == 1) {
				i_470_ = (short) (class282_sub35.method13094(485628061) + i_473_);
				i_473_ = i_470_;
				i_471_ = (short) (class282_sub35.method13094(-2135771722) + i_473_);
				i_473_ = i_471_;
				i_472_ = (short) (class282_sub35.method13094(921481989) + i_473_);
				i_473_ = i_472_;
				aShortArray1982[i_474_] = i_470_;
				aShortArray1983[i_474_] = i_471_;
				aShortArray1984[i_474_] = i_472_;
				if (i_470_ > anInt1999)
					anInt1999 = i_470_;
				if (i_471_ > anInt1999)
					anInt1999 = i_471_;
				if (i_472_ > anInt1999)
					anInt1999 = i_472_;
			}
			if (i_475_ == 2) {
				i_471_ = i_472_;
				i_472_ = (short) (class282_sub35.method13094(-101824087) + i_473_);
				i_473_ = i_472_;
				aShortArray1982[i_474_] = i_470_;
				aShortArray1983[i_474_] = i_471_;
				aShortArray1984[i_474_] = i_472_;
				if (i_472_ > anInt1999)
					anInt1999 = i_472_;
			}
			if (i_475_ == 3) {
				i_470_ = i_472_;
				i_472_ = (short) (class282_sub35.method13094(-1266892930) + i_473_);
				i_473_ = i_472_;
				aShortArray1982[i_474_] = i_470_;
				aShortArray1983[i_474_] = i_471_;
				aShortArray1984[i_474_] = i_472_;
				if (i_472_ > anInt1999)
					anInt1999 = i_472_;
			}
			if (i_475_ == 4) {
				short i_476_ = i_470_;
				i_470_ = i_471_;
				i_471_ = i_476_;
				i_472_ = (short) (class282_sub35.method13094(-408999936) + i_473_);
				i_473_ = i_472_;
				aShortArray1982[i_474_] = i_470_;
				aShortArray1983[i_474_] = i_471_;
				aShortArray1984[i_474_] = i_472_;
				if (i_472_ > anInt1999)
					anInt1999 = i_472_;
			}
		}
		anInt1999++;
		class282_sub35.index = i_456_ * -1115476867;
		for (int i_477_ = 0; i_477_ < anInt1979; i_477_++) {
			aByteArray1995[i_477_] = (byte) 0;
			aShortArray1996[i_477_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1987[i_477_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1998[i_477_] = (short) class282_sub35.readUnsignedShort();
		}
		if (aByteArray1988 != null) {
			boolean bool_478_ = false;
			for (int i_479_ = 0; i_479_ < anInt1973; i_479_++) {
				int i_480_ = aByteArray1988[i_479_] & 0xff;
				if (i_480_ != 255) {
					if (((aShortArray1996[i_480_] & 0xffff) == aShortArray1982[i_479_]) && ((aShortArray1987[i_480_] & 0xffff) == aShortArray1983[i_479_]) && ((aShortArray1998[i_480_] & 0xffff) == aShortArray1984[i_479_]))
						aByteArray1988[i_479_] = (byte) -1;
					else
						bool_478_ = true;
				}
			}
			if (!bool_478_)
				aByteArray1988 = null;
		}
		if (!bool_433_)
			aShortArray1993 = null;
		if (!bool)
			aByteArray1985 = null;
	}

	public byte method2683(short i, short i_481_, short i_482_, short i_483_, short i_484_, short i_485_, byte i_486_, byte i_487_, byte i_488_) {
		if (anInt1979 >= 255)
			throw new IllegalStateException();
		aByteArray1995[anInt1979] = (byte) 3;
		aShortArray1996[anInt1979] = i;
		aShortArray1987[anInt1979] = i_481_;
		aShortArray1998[anInt1979] = i_482_;
		anIntArray1989[anInt1979] = i_483_;
		anIntArray2000[anInt1979] = i_484_;
		anIntArray2001[anInt1979] = i_485_;
		aByteArray2005[anInt1979] = i_486_;
		aByteArray1990[anInt1979] = i_487_;
		anIntArray1992[anInt1979] = i_488_;
		return (byte) anInt1979++;
	}

	void method2684(RsByteBuffer class282_sub35, RsByteBuffer class282_sub35_489_, RsByteBuffer class282_sub35_490_, RsByteBuffer class282_sub35_491_, RsByteBuffer class282_sub35_492_, RsByteBuffer class282_sub35_493_) {
		for (int i = 0; i < anInt1979; i++) {
			int i_494_ = aByteArray1995[i] & 0xff;
			if (i_494_ == 0) {
				aShortArray1996[i] = (short) class282_sub35.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35.readUnsignedShort();
			}
			if (i_494_ == 1) {
				aShortArray1996[i] = (short) class282_sub35_489_.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35_489_.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35_489_.readUnsignedShort();
				if (zoom < 15) {
					anIntArray1989[i] = class282_sub35_490_.readUnsignedShort();
					if (zoom < 14)
						anIntArray2000[i] = class282_sub35_490_.readUnsignedShort();
					else
						anIntArray2000[i] = class282_sub35_490_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_490_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_490_.read24BitUnsignedInteger();
					anIntArray2000[i] = class282_sub35_490_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_490_.read24BitUnsignedInteger();
				}
				aByteArray2005[i] = class282_sub35_491_.readByte((short) -26139);
				aByteArray1990[i] = class282_sub35_492_.readByte((short) -19718);
				anIntArray1992[i] = class282_sub35_493_.readByte((short) -3821);
			}
			if (i_494_ == 2) {
				aShortArray1996[i] = (short) class282_sub35_489_.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35_489_.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35_489_.readUnsignedShort();
				if (zoom < 15) {
					anIntArray1989[i] = class282_sub35_490_.readUnsignedShort();
					if (zoom < 14)
						anIntArray2000[i] = class282_sub35_490_.readUnsignedShort();
					else
						anIntArray2000[i] = class282_sub35_490_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_490_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_490_.read24BitUnsignedInteger();
					anIntArray2000[i] = class282_sub35_490_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_490_.read24BitUnsignedInteger();
				}
				aByteArray2005[i] = class282_sub35_491_.readByte((short) -13550);
				aByteArray1990[i] = class282_sub35_492_.readByte((short) -30615);
				anIntArray1992[i] = class282_sub35_493_.readByte((short) -26200);
				anIntArray1997[i] = class282_sub35_493_.readByte((short) -30268);
				anIntArray2004[i] = class282_sub35_493_.readByte((short) -23507);
			}
			if (i_494_ == 3) {
				aShortArray1996[i] = (short) class282_sub35_489_.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35_489_.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35_489_.readUnsignedShort();
				if (zoom < 15) {
					anIntArray1989[i] = class282_sub35_490_.readUnsignedShort();
					if (zoom < 14)
						anIntArray2000[i] = class282_sub35_490_.readUnsignedShort();
					else
						anIntArray2000[i] = class282_sub35_490_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_490_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_490_.read24BitUnsignedInteger();
					anIntArray2000[i] = class282_sub35_490_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_490_.read24BitUnsignedInteger();
				}
				aByteArray2005[i] = class282_sub35_491_.readByte((short) -5083);
				aByteArray1990[i] = class282_sub35_492_.readByte((short) -22701);
				anIntArray1992[i] = class282_sub35_493_.readByte((short) -32278);
			}
		}
	}

	void method2685(byte[] is) {
		boolean bool = false;
		boolean bool_495_ = false;
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_496_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_497_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_498_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_499_ = new RsByteBuffer(is);
		class282_sub35.index = (is.length - 18) * -1115476867;
		anInt1974 = class282_sub35.readUnsignedShort();
		anInt1973 = class282_sub35.readUnsignedShort();
		anInt1979 = class282_sub35.readUnsignedByte();
		int i = class282_sub35.readUnsignedByte();
		int i_500_ = class282_sub35.readUnsignedByte();
		int i_501_ = class282_sub35.readUnsignedByte();
		int i_502_ = class282_sub35.readUnsignedByte();
		int i_503_ = class282_sub35.readUnsignedByte();
		int i_504_ = class282_sub35.readUnsignedShort();
		int i_505_ = class282_sub35.readUnsignedShort();
		int i_506_ = class282_sub35.readUnsignedShort();
		int i_507_ = class282_sub35.readUnsignedShort();
		int i_508_ = 0;
		int i_509_ = i_508_;
		i_508_ += anInt1974;
		int i_510_ = i_508_;
		i_508_ += anInt1973;
		int i_511_ = i_508_;
		if (i_500_ == 255)
			i_508_ += anInt1973;
		int i_512_ = i_508_;
		if (i_502_ == 1)
			i_508_ += anInt1973;
		int i_513_ = i_508_;
		if (i == 1)
			i_508_ += anInt1973;
		int i_514_ = i_508_;
		if (i_503_ == 1)
			i_508_ += anInt1974;
		int i_515_ = i_508_;
		if (i_501_ == 1)
			i_508_ += anInt1973;
		int i_516_ = i_508_;
		i_508_ += i_507_;
		int i_517_ = i_508_;
		i_508_ += anInt1973 * 2;
		int i_518_ = i_508_;
		i_508_ += anInt1979 * 6;
		int i_519_ = i_508_;
		i_508_ += i_504_;
		int i_520_ = i_508_;
		i_508_ += i_505_;
		int i_521_ = i_508_;
		i_508_ += i_506_;
		anIntArray1976 = new int[anInt1974];
		anIntArray2003 = new int[anInt1974];
		anIntArray1978 = new int[anInt1974];
		aShortArray1982 = new short[anInt1973];
		aShortArray1983 = new short[anInt1973];
		aShortArray1984 = new short[anInt1973];
		if (anInt1979 > 0) {
			aByteArray1995 = new byte[anInt1979];
			aShortArray1996 = new short[anInt1979];
			aShortArray1987 = new short[anInt1979];
			aShortArray1998 = new short[anInt1979];
		}
		if (i_503_ == 1)
			anIntArray2002 = new int[anInt1974];
		if (i == 1) {
			aByteArray1985 = new byte[anInt1973];
			aByteArray1988 = new byte[anInt1973];
			aShortArray1993 = new short[anInt1973];
		}
		if (i_500_ == 255)
			aByteArray1977 = new byte[anInt1973];
		else
			aByte1994 = (byte) i_500_;
		if (i_501_ == 1)
			aByteArray1975 = new byte[anInt1973];
		if (i_502_ == 1)
			anIntArray1991 = new int[anInt1973];
		aShortArray2006 = new short[anInt1973];
		class282_sub35.index = i_509_ * -1115476867;
		class282_sub35_496_.index = i_519_ * -1115476867;
		class282_sub35_497_.index = i_520_ * -1115476867;
		class282_sub35_498_.index = i_521_ * -1115476867;
		class282_sub35_499_.index = i_514_ * -1115476867;
		int i_522_ = 0;
		int i_523_ = 0;
		int i_524_ = 0;
		for (int i_525_ = 0; i_525_ < anInt1974; i_525_++) {
			int i_526_ = class282_sub35.readUnsignedByte();
			int i_527_ = 0;
			if ((i_526_ & 0x1) != 0)
				i_527_ = class282_sub35_496_.method13094(2108918368);
			int i_528_ = 0;
			if ((i_526_ & 0x2) != 0)
				i_528_ = class282_sub35_497_.method13094(2013613396);
			int i_529_ = 0;
			if ((i_526_ & 0x4) != 0)
				i_529_ = class282_sub35_498_.method13094(-671005222);
			anIntArray1976[i_525_] = i_522_ + i_527_;
			anIntArray2003[i_525_] = i_523_ + i_528_;
			anIntArray1978[i_525_] = i_524_ + i_529_;
			i_522_ = anIntArray1976[i_525_];
			i_523_ = anIntArray2003[i_525_];
			i_524_ = anIntArray1978[i_525_];
			if (i_503_ == 1)
				anIntArray2002[i_525_] = class282_sub35_499_.readUnsignedByte();
		}
		class282_sub35.index = i_517_ * -1115476867;
		class282_sub35_496_.index = i_513_ * -1115476867;
		class282_sub35_497_.index = i_511_ * -1115476867;
		class282_sub35_498_.index = i_515_ * -1115476867;
		class282_sub35_499_.index = i_512_ * -1115476867;
		for (int i_530_ = 0; i_530_ < anInt1973; i_530_++) {
			aShortArray2006[i_530_] = (short) class282_sub35.readUnsignedShort();
			if (i == 1) {
				int i_531_ = class282_sub35_496_.readUnsignedByte();
				if ((i_531_ & 0x1) == 1) {
					aByteArray1985[i_530_] = (byte) 1;
					bool = true;
				} else
					aByteArray1985[i_530_] = (byte) 0;
				if ((i_531_ & 0x2) == 2) {
					aByteArray1988[i_530_] = (byte) (i_531_ >> 2);
					aShortArray1993[i_530_] = aShortArray2006[i_530_];
					aShortArray2006[i_530_] = (short) 127;
					if (aShortArray1993[i_530_] != -1)
						bool_495_ = true;
				} else {
					aByteArray1988[i_530_] = (byte) -1;
					aShortArray1993[i_530_] = (short) -1;
				}
			}
			if (i_500_ == 255)
				aByteArray1977[i_530_] = class282_sub35_497_.readByte((short) -15910);
			if (i_501_ == 1)
				aByteArray1975[i_530_] = class282_sub35_498_.readByte((short) -6541);
			if (i_502_ == 1)
				anIntArray1991[i_530_] = class282_sub35_499_.readUnsignedByte();
		}
		anInt1999 = -1;
		class282_sub35.index = i_516_ * -1115476867;
		class282_sub35_496_.index = i_510_ * -1115476867;
		short i_532_ = 0;
		short i_533_ = 0;
		short i_534_ = 0;
		int i_535_ = 0;
		for (int i_536_ = 0; i_536_ < anInt1973; i_536_++) {
			int i_537_ = class282_sub35_496_.readUnsignedByte();
			if (i_537_ == 1) {
				i_532_ = (short) (class282_sub35.method13094(778885973) + i_535_);
				i_535_ = i_532_;
				i_533_ = (short) (class282_sub35.method13094(-516543439) + i_535_);
				i_535_ = i_533_;
				i_534_ = (short) (class282_sub35.method13094(-1429041786) + i_535_);
				i_535_ = i_534_;
				aShortArray1982[i_536_] = i_532_;
				aShortArray1983[i_536_] = i_533_;
				aShortArray1984[i_536_] = i_534_;
				if (i_532_ > anInt1999)
					anInt1999 = i_532_;
				if (i_533_ > anInt1999)
					anInt1999 = i_533_;
				if (i_534_ > anInt1999)
					anInt1999 = i_534_;
			}
			if (i_537_ == 2) {
				i_533_ = i_534_;
				i_534_ = (short) (class282_sub35.method13094(-1280465442) + i_535_);
				i_535_ = i_534_;
				aShortArray1982[i_536_] = i_532_;
				aShortArray1983[i_536_] = i_533_;
				aShortArray1984[i_536_] = i_534_;
				if (i_534_ > anInt1999)
					anInt1999 = i_534_;
			}
			if (i_537_ == 3) {
				i_532_ = i_534_;
				i_534_ = (short) (class282_sub35.method13094(-1175000278) + i_535_);
				i_535_ = i_534_;
				aShortArray1982[i_536_] = i_532_;
				aShortArray1983[i_536_] = i_533_;
				aShortArray1984[i_536_] = i_534_;
				if (i_534_ > anInt1999)
					anInt1999 = i_534_;
			}
			if (i_537_ == 4) {
				short i_538_ = i_532_;
				i_532_ = i_533_;
				i_533_ = i_538_;
				i_534_ = (short) (class282_sub35.method13094(-1853499129) + i_535_);
				i_535_ = i_534_;
				aShortArray1982[i_536_] = i_532_;
				aShortArray1983[i_536_] = i_533_;
				aShortArray1984[i_536_] = i_534_;
				if (i_534_ > anInt1999)
					anInt1999 = i_534_;
			}
		}
		anInt1999++;
		class282_sub35.index = i_518_ * -1115476867;
		for (int i_539_ = 0; i_539_ < anInt1979; i_539_++) {
			aByteArray1995[i_539_] = (byte) 0;
			aShortArray1996[i_539_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1987[i_539_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1998[i_539_] = (short) class282_sub35.readUnsignedShort();
		}
		if (aByteArray1988 != null) {
			boolean bool_540_ = false;
			for (int i_541_ = 0; i_541_ < anInt1973; i_541_++) {
				int i_542_ = aByteArray1988[i_541_] & 0xff;
				if (i_542_ != 255) {
					if (((aShortArray1996[i_542_] & 0xffff) == aShortArray1982[i_541_]) && ((aShortArray1987[i_542_] & 0xffff) == aShortArray1983[i_541_]) && ((aShortArray1998[i_542_] & 0xffff) == aShortArray1984[i_541_]))
						aByteArray1988[i_541_] = (byte) -1;
					else
						bool_540_ = true;
				}
			}
			if (!bool_540_)
				aByteArray1988 = null;
		}
		if (!bool_495_)
			aShortArray1993 = null;
		if (!bool)
			aByteArray1985 = null;
	}

	public void method2686(short i, short i_543_) {
		for (int i_544_ = 0; i_544_ < anInt1973; i_544_++) {
			if (aShortArray2006[i_544_] == i)
				aShortArray2006[i_544_] = i_543_;
		}
	}

	void method2687(byte[] is) {
		boolean bool = false;
		boolean bool_545_ = false;
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_546_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_547_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_548_ = new RsByteBuffer(is);
		RsByteBuffer class282_sub35_549_ = new RsByteBuffer(is);
		class282_sub35.index = (is.length - 18) * -1115476867;
		anInt1974 = class282_sub35.readUnsignedShort();
		anInt1973 = class282_sub35.readUnsignedShort();
		anInt1979 = class282_sub35.readUnsignedByte();
		int i = class282_sub35.readUnsignedByte();
		int i_550_ = class282_sub35.readUnsignedByte();
		int i_551_ = class282_sub35.readUnsignedByte();
		int i_552_ = class282_sub35.readUnsignedByte();
		int i_553_ = class282_sub35.readUnsignedByte();
		int i_554_ = class282_sub35.readUnsignedShort();
		int i_555_ = class282_sub35.readUnsignedShort();
		int i_556_ = class282_sub35.readUnsignedShort();
		int i_557_ = class282_sub35.readUnsignedShort();
		int i_558_ = 0;
		int i_559_ = i_558_;
		i_558_ += anInt1974;
		int i_560_ = i_558_;
		i_558_ += anInt1973;
		int i_561_ = i_558_;
		if (i_550_ == 255)
			i_558_ += anInt1973;
		int i_562_ = i_558_;
		if (i_552_ == 1)
			i_558_ += anInt1973;
		int i_563_ = i_558_;
		if (i == 1)
			i_558_ += anInt1973;
		int i_564_ = i_558_;
		if (i_553_ == 1)
			i_558_ += anInt1974;
		int i_565_ = i_558_;
		if (i_551_ == 1)
			i_558_ += anInt1973;
		int i_566_ = i_558_;
		i_558_ += i_557_;
		int i_567_ = i_558_;
		i_558_ += anInt1973 * 2;
		int i_568_ = i_558_;
		i_558_ += anInt1979 * 6;
		int i_569_ = i_558_;
		i_558_ += i_554_;
		int i_570_ = i_558_;
		i_558_ += i_555_;
		int i_571_ = i_558_;
		i_558_ += i_556_;
		anIntArray1976 = new int[anInt1974];
		anIntArray2003 = new int[anInt1974];
		anIntArray1978 = new int[anInt1974];
		aShortArray1982 = new short[anInt1973];
		aShortArray1983 = new short[anInt1973];
		aShortArray1984 = new short[anInt1973];
		if (anInt1979 > 0) {
			aByteArray1995 = new byte[anInt1979];
			aShortArray1996 = new short[anInt1979];
			aShortArray1987 = new short[anInt1979];
			aShortArray1998 = new short[anInt1979];
		}
		if (i_553_ == 1)
			anIntArray2002 = new int[anInt1974];
		if (i == 1) {
			aByteArray1985 = new byte[anInt1973];
			aByteArray1988 = new byte[anInt1973];
			aShortArray1993 = new short[anInt1973];
		}
		if (i_550_ == 255)
			aByteArray1977 = new byte[anInt1973];
		else
			aByte1994 = (byte) i_550_;
		if (i_551_ == 1)
			aByteArray1975 = new byte[anInt1973];
		if (i_552_ == 1)
			anIntArray1991 = new int[anInt1973];
		aShortArray2006 = new short[anInt1973];
		class282_sub35.index = i_559_ * -1115476867;
		class282_sub35_546_.index = i_569_ * -1115476867;
		class282_sub35_547_.index = i_570_ * -1115476867;
		class282_sub35_548_.index = i_571_ * -1115476867;
		class282_sub35_549_.index = i_564_ * -1115476867;
		int i_572_ = 0;
		int i_573_ = 0;
		int i_574_ = 0;
		for (int i_575_ = 0; i_575_ < anInt1974; i_575_++) {
			int i_576_ = class282_sub35.readUnsignedByte();
			int i_577_ = 0;
			if ((i_576_ & 0x1) != 0)
				i_577_ = class282_sub35_546_.method13094(-1291838532);
			int i_578_ = 0;
			if ((i_576_ & 0x2) != 0)
				i_578_ = class282_sub35_547_.method13094(-94610834);
			int i_579_ = 0;
			if ((i_576_ & 0x4) != 0)
				i_579_ = class282_sub35_548_.method13094(-1981236989);
			anIntArray1976[i_575_] = i_572_ + i_577_;
			anIntArray2003[i_575_] = i_573_ + i_578_;
			anIntArray1978[i_575_] = i_574_ + i_579_;
			i_572_ = anIntArray1976[i_575_];
			i_573_ = anIntArray2003[i_575_];
			i_574_ = anIntArray1978[i_575_];
			if (i_553_ == 1)
				anIntArray2002[i_575_] = class282_sub35_549_.readUnsignedByte();
		}
		class282_sub35.index = i_567_ * -1115476867;
		class282_sub35_546_.index = i_563_ * -1115476867;
		class282_sub35_547_.index = i_561_ * -1115476867;
		class282_sub35_548_.index = i_565_ * -1115476867;
		class282_sub35_549_.index = i_562_ * -1115476867;
		for (int i_580_ = 0; i_580_ < anInt1973; i_580_++) {
			aShortArray2006[i_580_] = (short) class282_sub35.readUnsignedShort();
			if (i == 1) {
				int i_581_ = class282_sub35_546_.readUnsignedByte();
				if ((i_581_ & 0x1) == 1) {
					aByteArray1985[i_580_] = (byte) 1;
					bool = true;
				} else
					aByteArray1985[i_580_] = (byte) 0;
				if ((i_581_ & 0x2) == 2) {
					aByteArray1988[i_580_] = (byte) (i_581_ >> 2);
					aShortArray1993[i_580_] = aShortArray2006[i_580_];
					aShortArray2006[i_580_] = (short) 127;
					if (aShortArray1993[i_580_] != -1)
						bool_545_ = true;
				} else {
					aByteArray1988[i_580_] = (byte) -1;
					aShortArray1993[i_580_] = (short) -1;
				}
			}
			if (i_550_ == 255)
				aByteArray1977[i_580_] = class282_sub35_547_.readByte((short) -4422);
			if (i_551_ == 1)
				aByteArray1975[i_580_] = class282_sub35_548_.readByte((short) -26447);
			if (i_552_ == 1)
				anIntArray1991[i_580_] = class282_sub35_549_.readUnsignedByte();
		}
		anInt1999 = -1;
		class282_sub35.index = i_566_ * -1115476867;
		class282_sub35_546_.index = i_560_ * -1115476867;
		short i_582_ = 0;
		short i_583_ = 0;
		short i_584_ = 0;
		int i_585_ = 0;
		for (int i_586_ = 0; i_586_ < anInt1973; i_586_++) {
			int i_587_ = class282_sub35_546_.readUnsignedByte();
			if (i_587_ == 1) {
				i_582_ = (short) (class282_sub35.method13094(-157519493) + i_585_);
				i_585_ = i_582_;
				i_583_ = (short) (class282_sub35.method13094(-965007373) + i_585_);
				i_585_ = i_583_;
				i_584_ = (short) (class282_sub35.method13094(357760210) + i_585_);
				i_585_ = i_584_;
				aShortArray1982[i_586_] = i_582_;
				aShortArray1983[i_586_] = i_583_;
				aShortArray1984[i_586_] = i_584_;
				if (i_582_ > anInt1999)
					anInt1999 = i_582_;
				if (i_583_ > anInt1999)
					anInt1999 = i_583_;
				if (i_584_ > anInt1999)
					anInt1999 = i_584_;
			}
			if (i_587_ == 2) {
				i_583_ = i_584_;
				i_584_ = (short) (class282_sub35.method13094(1360531799) + i_585_);
				i_585_ = i_584_;
				aShortArray1982[i_586_] = i_582_;
				aShortArray1983[i_586_] = i_583_;
				aShortArray1984[i_586_] = i_584_;
				if (i_584_ > anInt1999)
					anInt1999 = i_584_;
			}
			if (i_587_ == 3) {
				i_582_ = i_584_;
				i_584_ = (short) (class282_sub35.method13094(-1144309612) + i_585_);
				i_585_ = i_584_;
				aShortArray1982[i_586_] = i_582_;
				aShortArray1983[i_586_] = i_583_;
				aShortArray1984[i_586_] = i_584_;
				if (i_584_ > anInt1999)
					anInt1999 = i_584_;
			}
			if (i_587_ == 4) {
				short i_588_ = i_582_;
				i_582_ = i_583_;
				i_583_ = i_588_;
				i_584_ = (short) (class282_sub35.method13094(-1632474116) + i_585_);
				i_585_ = i_584_;
				aShortArray1982[i_586_] = i_582_;
				aShortArray1983[i_586_] = i_583_;
				aShortArray1984[i_586_] = i_584_;
				if (i_584_ > anInt1999)
					anInt1999 = i_584_;
			}
		}
		anInt1999++;
		class282_sub35.index = i_568_ * -1115476867;
		for (int i_589_ = 0; i_589_ < anInt1979; i_589_++) {
			aByteArray1995[i_589_] = (byte) 0;
			aShortArray1996[i_589_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1987[i_589_] = (short) class282_sub35.readUnsignedShort();
			aShortArray1998[i_589_] = (short) class282_sub35.readUnsignedShort();
		}
		if (aByteArray1988 != null) {
			boolean bool_590_ = false;
			for (int i_591_ = 0; i_591_ < anInt1973; i_591_++) {
				int i_592_ = aByteArray1988[i_591_] & 0xff;
				if (i_592_ != 255) {
					if (((aShortArray1996[i_592_] & 0xffff) == aShortArray1982[i_591_]) && ((aShortArray1987[i_592_] & 0xffff) == aShortArray1983[i_591_]) && ((aShortArray1998[i_592_] & 0xffff) == aShortArray1984[i_591_]))
						aByteArray1988[i_591_] = (byte) -1;
					else
						bool_590_ = true;
				}
			}
			if (!bool_590_)
				aByteArray1988 = null;
		}
		if (!bool_545_)
			aShortArray1993 = null;
		if (!bool)
			aByteArray1985 = null;
	}

	void method2688(RsByteBuffer class282_sub35, RsByteBuffer class282_sub35_593_) {
		short i = 0;
		short i_594_ = 0;
		short i_595_ = 0;
		int i_596_ = 0;
		for (int i_597_ = 0; i_597_ < anInt1973; i_597_++) {
			int i_598_ = class282_sub35_593_.readUnsignedByte();
			if (i_598_ == 1) {
				i = (short) (class282_sub35.method13094(1462856592) + i_596_);
				i_596_ = i;
				i_594_ = (short) (class282_sub35.method13094(-1976371057) + i_596_);
				i_596_ = i_594_;
				i_595_ = (short) (class282_sub35.method13094(1794715307) + i_596_);
				i_596_ = i_595_;
				aShortArray1982[i_597_] = i;
				aShortArray1983[i_597_] = i_594_;
				aShortArray1984[i_597_] = i_595_;
				if (i > anInt1999)
					anInt1999 = i;
				if (i_594_ > anInt1999)
					anInt1999 = i_594_;
				if (i_595_ > anInt1999)
					anInt1999 = i_595_;
			}
			if (i_598_ == 2) {
				i_594_ = i_595_;
				i_595_ = (short) (class282_sub35.method13094(-138060871) + i_596_);
				i_596_ = i_595_;
				aShortArray1982[i_597_] = i;
				aShortArray1983[i_597_] = i_594_;
				aShortArray1984[i_597_] = i_595_;
				if (i_595_ > anInt1999)
					anInt1999 = i_595_;
			}
			if (i_598_ == 3) {
				i = i_595_;
				i_595_ = (short) (class282_sub35.method13094(1001618986) + i_596_);
				i_596_ = i_595_;
				aShortArray1982[i_597_] = i;
				aShortArray1983[i_597_] = i_594_;
				aShortArray1984[i_597_] = i_595_;
				if (i_595_ > anInt1999)
					anInt1999 = i_595_;
			}
			if (i_598_ == 4) {
				short i_599_ = i;
				i = i_594_;
				i_594_ = i_599_;
				i_595_ = (short) (class282_sub35.method13094(-1887034140) + i_596_);
				i_596_ = i_595_;
				aShortArray1982[i_597_] = i;
				aShortArray1983[i_597_] = i_594_;
				aShortArray1984[i_597_] = i_595_;
				if (i_595_ > anInt1999)
					anInt1999 = i_595_;
			}
		}
		anInt1999++;
	}

	public static RSMesh decodeMesh(Index class317, int i, int i_600_) {
		byte[] is = class317.getFile(i, i_600_, -1774438474);
		if (is == null)
			return null;
		return new RSMesh(is);
	}

	public RSMesh(RSMesh[] class157s, int i) {
		anInt1974 = 0;
		anInt1999 = 0;
		anInt1973 = 0;
		aByte1994 = (byte) 0;
		anInt1979 = 0;
		anInt1974 = 0;
		anInt1973 = 0;
		anInt1979 = 0;
		int i_601_ = 0;
		int i_602_ = 0;
		int i_603_ = 0;
		boolean bool = false;
		boolean bool_604_ = false;
		boolean bool_605_ = false;
		boolean bool_606_ = false;
		boolean bool_607_ = false;
		boolean bool_608_ = false;
		aByte1994 = (byte) -1;
		for (int i_609_ = 0; i_609_ < i; i_609_++) {
			RSMesh class157_610_ = class157s[i_609_];
			if (class157_610_ != null) {
				anInt1974 += class157_610_.anInt1974;
				anInt1973 += class157_610_.anInt1973;
				anInt1979 += class157_610_.anInt1979;
				if (class157_610_.aClass87Array2007 != null)
					i_601_ += class157_610_.aClass87Array2007.length;
				if (class157_610_.aClass172Array2008 != null)
					i_602_ += class157_610_.aClass172Array2008.length;
				if (class157_610_.aClass84Array2009 != null)
					i_603_ += class157_610_.aClass84Array2009.length;
				bool = bool | class157_610_.aByteArray1985 != null;
				if (class157_610_.aByteArray1977 != null)
					bool_604_ = true;
				else {
					if (aByte1994 == -1)
						aByte1994 = class157_610_.aByte1994;
					if (aByte1994 != class157_610_.aByte1994)
						bool_604_ = true;
				}
				bool_605_ = bool_605_ | class157_610_.aByteArray1975 != null;
				bool_606_ = bool_606_ | class157_610_.aByteArray1988 != null;
				bool_607_ = bool_607_ | class157_610_.aShortArray1993 != null;
				bool_608_ = bool_608_ | class157_610_.anIntArray1991 != null;
			}
		}
		anIntArray1976 = new int[anInt1974];
		anIntArray2003 = new int[anInt1974];
		anIntArray1978 = new int[anInt1974];
		anIntArray2002 = new int[anInt1974];
		aShortArray1980 = new short[anInt1974];
		aShortArray1982 = new short[anInt1973];
		aShortArray1983 = new short[anInt1973];
		aShortArray1984 = new short[anInt1973];
		if (bool)
			aByteArray1985 = new byte[anInt1973];
		if (bool_604_)
			aByteArray1977 = new byte[anInt1973];
		if (bool_605_)
			aByteArray1975 = new byte[anInt1973];
		if (bool_606_)
			aByteArray1988 = new byte[anInt1973];
		aShortArray2006 = new short[anInt1973];
		if (bool_607_)
			aShortArray1993 = new short[anInt1973];
		if (bool_608_)
			anIntArray1991 = new int[anInt1973];
		aShortArray1981 = new short[anInt1973];
		if (anInt1979 > 0) {
			aByteArray1995 = new byte[anInt1979];
			aShortArray1996 = new short[anInt1979];
			aShortArray1987 = new short[anInt1979];
			aShortArray1998 = new short[anInt1979];
			anIntArray1989 = new int[anInt1979];
			anIntArray2000 = new int[anInt1979];
			anIntArray2001 = new int[anInt1979];
			aByteArray2005 = new byte[anInt1979];
			aByteArray1990 = new byte[anInt1979];
			anIntArray1992 = new int[anInt1979];
			anIntArray1997 = new int[anInt1979];
			anIntArray2004 = new int[anInt1979];
		}
		if (i_603_ > 0)
			aClass84Array2009 = new Class84[i_603_];
		if (i_601_ > 0)
			aClass87Array2007 = new Class87[i_601_];
		if (i_602_ > 0)
			aClass172Array2008 = new Class172[i_602_];
		anInt1974 = 0;
		anInt1973 = 0;
		anInt1979 = 0;
		i_601_ = 0;
		i_602_ = 0;
		i_603_ = 0;
		for (int i_611_ = 0; i_611_ < i; i_611_++) {
			short i_612_ = (short) (1 << i_611_);
			RSMesh class157_613_ = class157s[i_611_];
			if (class157_613_ != null) {
				if (class157_613_.aClass84Array2009 != null) {
					for (int i_614_ = 0; i_614_ < class157_613_.aClass84Array2009.length; i_614_++) {
						Class84 class84 = class157_613_.aClass84Array2009[i_614_];
						aClass84Array2009[i_603_++] = class84.method1459((class84.anInt809 * 2110152423 + anInt1973), 482846070);
					}
				}
				for (int i_615_ = 0; i_615_ < class157_613_.anInt1973; i_615_++) {
					if (bool && class157_613_.aByteArray1985 != null)
						aByteArray1985[anInt1973] = class157_613_.aByteArray1985[i_615_];
					if (bool_604_) {
						if (class157_613_.aByteArray1977 != null)
							aByteArray1977[anInt1973] = class157_613_.aByteArray1977[i_615_];
						else
							aByteArray1977[anInt1973] = class157_613_.aByte1994;
					}
					if (bool_605_ && class157_613_.aByteArray1975 != null)
						aByteArray1975[anInt1973] = class157_613_.aByteArray1975[i_615_];
					if (bool_607_) {
						if (class157_613_.aShortArray1993 != null)
							aShortArray1993[anInt1973] = class157_613_.aShortArray1993[i_615_];
						else
							aShortArray1993[anInt1973] = (short) -1;
					}
					if (bool_608_) {
						if (class157_613_.anIntArray1991 != null)
							anIntArray1991[anInt1973] = class157_613_.anIntArray1991[i_615_];
						else
							anIntArray1991[anInt1973] = -1;
					}
					aShortArray1982[anInt1973] = (short) method2657(class157_613_, (class157_613_.aShortArray1982[i_615_]), i_612_);
					aShortArray1983[anInt1973] = (short) method2657(class157_613_, (class157_613_.aShortArray1983[i_615_]), i_612_);
					aShortArray1984[anInt1973] = (short) method2657(class157_613_, (class157_613_.aShortArray1984[i_615_]), i_612_);
					aShortArray1981[anInt1973] = i_612_;
					aShortArray2006[anInt1973] = class157_613_.aShortArray2006[i_615_];
					anInt1973++;
				}
				if (class157_613_.aClass87Array2007 != null) {
					for (int i_616_ = 0; i_616_ < class157_613_.aClass87Array2007.length; i_616_++) {
						int i_617_ = method2657(class157_613_, (class157_613_.aClass87Array2007[i_616_].anInt836) * -1572033967, i_612_);
						int i_618_ = method2657(class157_613_, (class157_613_.aClass87Array2007[i_616_].anInt837) * -1955014451, i_612_);
						int i_619_ = method2657(class157_613_, (class157_613_.aClass87Array2007[i_616_].anInt838) * -2135413869, i_612_);
						aClass87Array2007[i_601_] = (class157_613_.aClass87Array2007[i_616_].method1488(i_617_, i_618_, i_619_, (byte) 98));
						i_601_++;
					}
				}
				if (class157_613_.aClass172Array2008 != null) {
					for (int i_620_ = 0; i_620_ < class157_613_.aClass172Array2008.length; i_620_++) {
						int i_621_ = method2657(class157_613_, (class157_613_.aClass172Array2008[i_620_].anInt2119) * -1382123871, i_612_);
						aClass172Array2008[i_602_] = class157_613_.aClass172Array2008[i_620_].method2911(i_621_, -546330898);
						i_602_++;
					}
				}
			}
		}
		int i_622_ = 0;
		anInt1999 = anInt1974;
		for (int i_623_ = 0; i_623_ < i; i_623_++) {
			short i_624_ = (short) (1 << i_623_);
			RSMesh class157_625_ = class157s[i_623_];
			if (class157_625_ != null) {
				for (int i_626_ = 0; i_626_ < class157_625_.anInt1973; i_626_++) {
					if (bool_606_)
						aByteArray1988[i_622_++] = (byte) ((class157_625_.aByteArray1988 != null && (class157_625_.aByteArray1988[i_626_] != -1)) ? (class157_625_.aByteArray1988[i_626_] + anInt1979) : -1);
				}
				for (int i_627_ = 0; i_627_ < class157_625_.anInt1979; i_627_++) {
					byte i_628_ = (aByteArray1995[anInt1979] = class157_625_.aByteArray1995[i_627_]);
					if (i_628_ == 0) {
						aShortArray1996[anInt1979] = (short) method2657(class157_625_, (class157_625_.aShortArray1996[i_627_]), i_624_);
						aShortArray1987[anInt1979] = (short) method2657(class157_625_, (class157_625_.aShortArray1987[i_627_]), i_624_);
						aShortArray1998[anInt1979] = (short) method2657(class157_625_, (class157_625_.aShortArray1998[i_627_]), i_624_);
					}
					if (i_628_ >= 1 && i_628_ <= 3) {
						aShortArray1996[anInt1979] = class157_625_.aShortArray1996[i_627_];
						aShortArray1987[anInt1979] = class157_625_.aShortArray1987[i_627_];
						aShortArray1998[anInt1979] = class157_625_.aShortArray1998[i_627_];
						anIntArray1989[anInt1979] = class157_625_.anIntArray1989[i_627_];
						anIntArray2000[anInt1979] = class157_625_.anIntArray2000[i_627_];
						anIntArray2001[anInt1979] = class157_625_.anIntArray2001[i_627_];
						aByteArray2005[anInt1979] = class157_625_.aByteArray2005[i_627_];
						aByteArray1990[anInt1979] = class157_625_.aByteArray1990[i_627_];
						anIntArray1992[anInt1979] = class157_625_.anIntArray1992[i_627_];
					}
					if (i_628_ == 2) {
						anIntArray1997[anInt1979] = class157_625_.anIntArray1997[i_627_];
						anIntArray2004[anInt1979] = class157_625_.anIntArray2004[i_627_];
					}
					anInt1979++;
				}
			}
		}
	}

	public void method2690(int i, int i_629_, int i_630_) {
		if (i_630_ != 0) {
			int i_631_ = Class382.anIntArray4657[i_630_];
			int i_632_ = Class382.anIntArray4661[i_630_];
			for (int i_633_ = 0; i_633_ < anInt1974; i_633_++) {
				int i_634_ = ((anIntArray2003[i_633_] * i_631_ + anIntArray1976[i_633_] * i_632_) >> 14);
				anIntArray2003[i_633_] = (anIntArray2003[i_633_] * i_632_ - anIntArray1976[i_633_] * i_631_) >> 14;
				anIntArray1976[i_633_] = i_634_;
			}
		}
		if (i != 0) {
			int i_635_ = Class382.anIntArray4657[i];
			int i_636_ = Class382.anIntArray4661[i];
			for (int i_637_ = 0; i_637_ < anInt1974; i_637_++) {
				int i_638_ = ((anIntArray2003[i_637_] * i_636_ - anIntArray1978[i_637_] * i_635_) >> 14);
				anIntArray1978[i_637_] = (anIntArray2003[i_637_] * i_635_ + anIntArray1978[i_637_] * i_636_) >> 14;
				anIntArray2003[i_637_] = i_638_;
			}
		}
		if (i_629_ != 0) {
			int i_639_ = Class382.anIntArray4657[i_629_];
			int i_640_ = Class382.anIntArray4661[i_629_];
			for (int i_641_ = 0; i_641_ < anInt1974; i_641_++) {
				int i_642_ = ((anIntArray1978[i_641_] * i_639_ + anIntArray1976[i_641_] * i_640_) >> 14);
				anIntArray1978[i_641_] = (anIntArray1978[i_641_] * i_640_ - anIntArray1976[i_641_] * i_639_) >> 14;
				anIntArray1976[i_641_] = i_642_;
			}
		}
	}

	public int method2691(int i, int i_643_, int i_644_) {
		for (int i_645_ = 0; i_645_ < anInt1974; i_645_++) {
			if (anIntArray1976[i_645_] == i && anIntArray2003[i_645_] == i_643_ && anIntArray1978[i_645_] == i_644_)
				return i_645_;
		}
		anIntArray1976[anInt1974] = i;
		anIntArray2003[anInt1974] = i_643_;
		anIntArray1978[anInt1974] = i_644_;
		anInt1999 = anInt1974 + 1;
		return anInt1974++;
	}

	public int method2692(int i, int i_646_, int i_647_, byte i_648_, byte i_649_, short i_650_, byte i_651_, short i_652_) {
		aShortArray1982[anInt1973] = (short) i;
		aShortArray1983[anInt1973] = (short) i_646_;
		aShortArray1984[anInt1973] = (short) i_647_;
		aByteArray1985[anInt1973] = i_648_;
		aByteArray1988[anInt1973] = i_649_;
		aShortArray2006[anInt1973] = i_650_;
		aByteArray1975[anInt1973] = i_651_;
		aShortArray1993[anInt1973] = i_652_;
		return anInt1973++;
	}

	public int method2693(int i, int i_653_, int i_654_, byte i_655_, byte i_656_, short i_657_, byte i_658_, short i_659_) {
		aShortArray1982[anInt1973] = (short) i;
		aShortArray1983[anInt1973] = (short) i_653_;
		aShortArray1984[anInt1973] = (short) i_654_;
		aByteArray1985[anInt1973] = i_655_;
		aByteArray1988[anInt1973] = i_656_;
		aShortArray2006[anInt1973] = i_657_;
		aByteArray1975[anInt1973] = i_658_;
		aShortArray1993[anInt1973] = i_659_;
		return anInt1973++;
	}

	public RSMesh(int i, int i_660_, int i_661_) {
		anInt1974 = 0;
		anInt1999 = 0;
		anInt1973 = 0;
		aByte1994 = (byte) 0;
		anInt1979 = 0;
		anIntArray1976 = new int[i];
		anIntArray2003 = new int[i];
		anIntArray1978 = new int[i];
		anIntArray2002 = new int[i];
		aShortArray1982 = new short[i_660_];
		aShortArray1983 = new short[i_660_];
		aShortArray1984 = new short[i_660_];
		aByteArray1985 = new byte[i_660_];
		aByteArray1977 = new byte[i_660_];
		aByteArray1975 = new byte[i_660_];
		aByteArray1988 = new byte[i_660_];
		aShortArray2006 = new short[i_660_];
		aShortArray1993 = new short[i_660_];
		anIntArray1991 = new int[i_660_];
		if (i_661_ > 0) {
			aByteArray1995 = new byte[i_661_];
			aShortArray1996 = new short[i_661_];
			aShortArray1987 = new short[i_661_];
			aShortArray1998 = new short[i_661_];
			anIntArray1989 = new int[i_661_];
			anIntArray2000 = new int[i_661_];
			anIntArray2001 = new int[i_661_];
			aByteArray2005 = new byte[i_661_];
			aByteArray1990 = new byte[i_661_];
			anIntArray1992 = new int[i_661_];
			anIntArray1997 = new int[i_661_];
			anIntArray2004 = new int[i_661_];
		}
	}

	public int[][] method2694(boolean bool) {
		int[] is = new int[256];
		int i = 0;
		int i_662_ = bool ? anInt1974 : anInt1999;
		for (int i_663_ = 0; i_663_ < i_662_; i_663_++) {
			int i_664_ = anIntArray2002[i_663_];
			if (i_664_ >= 0) {
				is[i_664_]++;
				if (i_664_ > i)
					i = i_664_;
			}
		}
		int[][] is_665_ = new int[i + 1][];
		for (int i_666_ = 0; i_666_ <= i; i_666_++) {
			is_665_[i_666_] = new int[is[i_666_]];
			is[i_666_] = 0;
		}
		for (int i_667_ = 0; i_667_ < i_662_; i_667_++) {
			int i_668_ = anIntArray2002[i_667_];
			if (i_668_ >= 0)
				is_665_[i_668_][is[i_668_]++] = i_667_;
		}
		return is_665_;
	}

	public byte method2695(short i, short i_669_, short i_670_, short i_671_, short i_672_, short i_673_, byte i_674_, byte i_675_, byte i_676_) {
		if (anInt1979 >= 255)
			throw new IllegalStateException();
		aByteArray1995[anInt1979] = (byte) 3;
		aShortArray1996[anInt1979] = i;
		aShortArray1987[anInt1979] = i_669_;
		aShortArray1998[anInt1979] = i_670_;
		anIntArray1989[anInt1979] = i_671_;
		anIntArray2000[anInt1979] = i_672_;
		anIntArray2001[anInt1979] = i_673_;
		aByteArray2005[anInt1979] = i_674_;
		aByteArray1990[anInt1979] = i_675_;
		anIntArray1992[anInt1979] = i_676_;
		return (byte) anInt1979++;
	}

	public byte method2696(short i, short i_677_, short i_678_, short i_679_, short i_680_, short i_681_, byte i_682_, byte i_683_, byte i_684_) {
		if (anInt1979 >= 255)
			throw new IllegalStateException();
		aByteArray1995[anInt1979] = (byte) 3;
		aShortArray1996[anInt1979] = i;
		aShortArray1987[anInt1979] = i_677_;
		aShortArray1998[anInt1979] = i_678_;
		anIntArray1989[anInt1979] = i_679_;
		anIntArray2000[anInt1979] = i_680_;
		anIntArray2001[anInt1979] = i_681_;
		aByteArray2005[anInt1979] = i_682_;
		aByteArray1990[anInt1979] = i_683_;
		anIntArray1992[anInt1979] = i_684_;
		return (byte) anInt1979++;
	}

	public byte method2697(short i, short i_685_, short i_686_, short i_687_, short i_688_, short i_689_, byte i_690_, byte i_691_, byte i_692_) {
		if (anInt1979 >= 255)
			throw new IllegalStateException();
		aByteArray1995[anInt1979] = (byte) 3;
		aShortArray1996[anInt1979] = i;
		aShortArray1987[anInt1979] = i_685_;
		aShortArray1998[anInt1979] = i_686_;
		anIntArray1989[anInt1979] = i_687_;
		anIntArray2000[anInt1979] = i_688_;
		anIntArray2001[anInt1979] = i_689_;
		aByteArray2005[anInt1979] = i_690_;
		aByteArray1990[anInt1979] = i_691_;
		anIntArray1992[anInt1979] = i_692_;
		return (byte) anInt1979++;
	}

	public int[][] method2698(boolean bool) {
		int[] is = new int[256];
		int i = 0;
		int i_693_ = bool ? anInt1974 : anInt1999;
		for (int i_694_ = 0; i_694_ < i_693_; i_694_++) {
			int i_695_ = anIntArray2002[i_694_];
			if (i_695_ >= 0) {
				is[i_695_]++;
				if (i_695_ > i)
					i = i_695_;
			}
		}
		int[][] is_696_ = new int[i + 1][];
		for (int i_697_ = 0; i_697_ <= i; i_697_++) {
			is_696_[i_697_] = new int[is[i_697_]];
			is[i_697_] = 0;
		}
		for (int i_698_ = 0; i_698_ < i_693_; i_698_++) {
			int i_699_ = anIntArray2002[i_698_];
			if (i_699_ >= 0)
				is_696_[i_699_][is[i_699_]++] = i_698_;
		}
		return is_696_;
	}

	public int method2699(int i, int i_700_, int i_701_, byte i_702_, byte i_703_, short i_704_, byte i_705_, short i_706_) {
		aShortArray1982[anInt1973] = (short) i;
		aShortArray1983[anInt1973] = (short) i_700_;
		aShortArray1984[anInt1973] = (short) i_701_;
		aByteArray1985[anInt1973] = i_702_;
		aByteArray1988[anInt1973] = i_703_;
		aShortArray2006[anInt1973] = i_704_;
		aByteArray1975[anInt1973] = i_705_;
		aShortArray1993[anInt1973] = i_706_;
		return anInt1973++;
	}

	public int[][] method2700(boolean bool) {
		int[] is = new int[256];
		int i = 0;
		int i_707_ = bool ? anInt1974 : anInt1999;
		for (int i_708_ = 0; i_708_ < i_707_; i_708_++) {
			int i_709_ = anIntArray2002[i_708_];
			if (i_709_ >= 0) {
				is[i_709_]++;
				if (i_709_ > i)
					i = i_709_;
			}
		}
		int[][] is_710_ = new int[i + 1][];
		for (int i_711_ = 0; i_711_ <= i; i_711_++) {
			is_710_[i_711_] = new int[is[i_711_]];
			is[i_711_] = 0;
		}
		for (int i_712_ = 0; i_712_ < i_707_; i_712_++) {
			int i_713_ = anIntArray2002[i_712_];
			if (i_713_ >= 0)
				is_710_[i_713_][is[i_713_]++] = i_712_;
		}
		return is_710_;
	}

	public int[][] method2701() {
		int[] is = new int[256];
		int i = 0;
		for (int i_714_ = 0; i_714_ < anInt1973; i_714_++) {
			int i_715_ = anIntArray1991[i_714_];
			if (i_715_ >= 0) {
				is[i_715_]++;
				if (i_715_ > i)
					i = i_715_;
			}
		}
		int[][] is_716_ = new int[i + 1][];
		for (int i_717_ = 0; i_717_ <= i; i_717_++) {
			is_716_[i_717_] = new int[is[i_717_]];
			is[i_717_] = 0;
		}
		for (int i_718_ = 0; i_718_ < anInt1973; i_718_++) {
			int i_719_ = anIntArray1991[i_718_];
			if (i_719_ >= 0)
				is_716_[i_719_][is[i_719_]++] = i_718_;
		}
		return is_716_;
	}

	public void method2702(short i, short i_720_) {
		for (int i_721_ = 0; i_721_ < anInt1973; i_721_++) {
			if (aShortArray2006[i_721_] == i)
				aShortArray2006[i_721_] = i_720_;
		}
	}

	void method2703(RsByteBuffer class282_sub35, RsByteBuffer class282_sub35_722_, RsByteBuffer class282_sub35_723_, RsByteBuffer class282_sub35_724_, RsByteBuffer class282_sub35_725_, RsByteBuffer class282_sub35_726_) {
		for (int i = 0; i < anInt1979; i++) {
			int i_727_ = aByteArray1995[i] & 0xff;
			if (i_727_ == 0) {
				aShortArray1996[i] = (short) class282_sub35.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35.readUnsignedShort();
			}
			if (i_727_ == 1) {
				aShortArray1996[i] = (short) class282_sub35_722_.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35_722_.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35_722_.readUnsignedShort();
				if (zoom < 15) {
					anIntArray1989[i] = class282_sub35_723_.readUnsignedShort();
					if (zoom < 14)
						anIntArray2000[i] = class282_sub35_723_.readUnsignedShort();
					else
						anIntArray2000[i] = class282_sub35_723_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_723_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_723_.read24BitUnsignedInteger();
					anIntArray2000[i] = class282_sub35_723_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_723_.read24BitUnsignedInteger();
				}
				aByteArray2005[i] = class282_sub35_724_.readByte((short) -3917);
				aByteArray1990[i] = class282_sub35_725_.readByte((short) -23467);
				anIntArray1992[i] = class282_sub35_726_.readByte((short) -20709);
			}
			if (i_727_ == 2) {
				aShortArray1996[i] = (short) class282_sub35_722_.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35_722_.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35_722_.readUnsignedShort();
				if (zoom < 15) {
					anIntArray1989[i] = class282_sub35_723_.readUnsignedShort();
					if (zoom < 14)
						anIntArray2000[i] = class282_sub35_723_.readUnsignedShort();
					else
						anIntArray2000[i] = class282_sub35_723_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_723_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_723_.read24BitUnsignedInteger();
					anIntArray2000[i] = class282_sub35_723_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_723_.read24BitUnsignedInteger();
				}
				aByteArray2005[i] = class282_sub35_724_.readByte((short) -14926);
				aByteArray1990[i] = class282_sub35_725_.readByte((short) -10804);
				anIntArray1992[i] = class282_sub35_726_.readByte((short) -7348);
				anIntArray1997[i] = class282_sub35_726_.readByte((short) -32751);
				anIntArray2004[i] = class282_sub35_726_.readByte((short) -28109);
			}
			if (i_727_ == 3) {
				aShortArray1996[i] = (short) class282_sub35_722_.readUnsignedShort();
				aShortArray1987[i] = (short) class282_sub35_722_.readUnsignedShort();
				aShortArray1998[i] = (short) class282_sub35_722_.readUnsignedShort();
				if (zoom < 15) {
					anIntArray1989[i] = class282_sub35_723_.readUnsignedShort();
					if (zoom < 14)
						anIntArray2000[i] = class282_sub35_723_.readUnsignedShort();
					else
						anIntArray2000[i] = class282_sub35_723_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_723_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_723_.read24BitUnsignedInteger();
					anIntArray2000[i] = class282_sub35_723_.read24BitUnsignedInteger();
					anIntArray2001[i] = class282_sub35_723_.read24BitUnsignedInteger();
				}
				aByteArray2005[i] = class282_sub35_724_.readByte((short) -22065);
				aByteArray1990[i] = class282_sub35_725_.readByte((short) -3685);
				anIntArray1992[i] = class282_sub35_726_.readByte((short) -20262);
			}
		}
	}

	public void method2704(short i, short i_728_) {
		if (aShortArray1993 != null) {
			for (int i_729_ = 0; i_729_ < anInt1973; i_729_++) {
				if (aShortArray1993[i_729_] == i)
					aShortArray1993[i_729_] = i_728_;
			}
		}
	}

	public void method2705(short i, short i_730_) {
		if (aShortArray1993 != null) {
			for (int i_731_ = 0; i_731_ < anInt1973; i_731_++) {
				if (aShortArray1993[i_731_] == i)
					aShortArray1993[i_731_] = i_730_;
			}
		}
	}

	public void method2706(short i, short i_732_) {
		if (aShortArray1993 != null) {
			for (int i_733_ = 0; i_733_ < anInt1973; i_733_++) {
				if (aShortArray1993[i_733_] == i)
					aShortArray1993[i_733_] = i_732_;
			}
		}
	}

	void method2707(RsByteBuffer class282_sub35, RsByteBuffer class282_sub35_734_) {
		short i = 0;
		short i_735_ = 0;
		short i_736_ = 0;
		int i_737_ = 0;
		for (int i_738_ = 0; i_738_ < anInt1973; i_738_++) {
			int i_739_ = class282_sub35_734_.readUnsignedByte();
			if (i_739_ == 1) {
				i = (short) (class282_sub35.method13094(-846697341) + i_737_);
				i_737_ = i;
				i_735_ = (short) (class282_sub35.method13094(-821787393) + i_737_);
				i_737_ = i_735_;
				i_736_ = (short) (class282_sub35.method13094(1909890599) + i_737_);
				i_737_ = i_736_;
				aShortArray1982[i_738_] = i;
				aShortArray1983[i_738_] = i_735_;
				aShortArray1984[i_738_] = i_736_;
				if (i > anInt1999)
					anInt1999 = i;
				if (i_735_ > anInt1999)
					anInt1999 = i_735_;
				if (i_736_ > anInt1999)
					anInt1999 = i_736_;
			}
			if (i_739_ == 2) {
				i_735_ = i_736_;
				i_736_ = (short) (class282_sub35.method13094(296987594) + i_737_);
				i_737_ = i_736_;
				aShortArray1982[i_738_] = i;
				aShortArray1983[i_738_] = i_735_;
				aShortArray1984[i_738_] = i_736_;
				if (i_736_ > anInt1999)
					anInt1999 = i_736_;
			}
			if (i_739_ == 3) {
				i = i_736_;
				i_736_ = (short) (class282_sub35.method13094(909544704) + i_737_);
				i_737_ = i_736_;
				aShortArray1982[i_738_] = i;
				aShortArray1983[i_738_] = i_735_;
				aShortArray1984[i_738_] = i_736_;
				if (i_736_ > anInt1999)
					anInt1999 = i_736_;
			}
			if (i_739_ == 4) {
				short i_740_ = i;
				i = i_735_;
				i_735_ = i_740_;
				i_736_ = (short) (class282_sub35.method13094(480669557) + i_737_);
				i_737_ = i_736_;
				aShortArray1982[i_738_] = i;
				aShortArray1983[i_738_] = i_735_;
				aShortArray1984[i_738_] = i_736_;
				if (i_736_ > anInt1999)
					anInt1999 = i_736_;
			}
		}
		anInt1999++;
	}

	public void method2708(int i, int i_741_, int i_742_) {
		if (i_742_ != 0) {
			int i_743_ = Class382.anIntArray4657[i_742_];
			int i_744_ = Class382.anIntArray4661[i_742_];
			for (int i_745_ = 0; i_745_ < anInt1974; i_745_++) {
				int i_746_ = ((anIntArray2003[i_745_] * i_743_ + anIntArray1976[i_745_] * i_744_) >> 14);
				anIntArray2003[i_745_] = (anIntArray2003[i_745_] * i_744_ - anIntArray1976[i_745_] * i_743_) >> 14;
				anIntArray1976[i_745_] = i_746_;
			}
		}
		if (i != 0) {
			int i_747_ = Class382.anIntArray4657[i];
			int i_748_ = Class382.anIntArray4661[i];
			for (int i_749_ = 0; i_749_ < anInt1974; i_749_++) {
				int i_750_ = ((anIntArray2003[i_749_] * i_748_ - anIntArray1978[i_749_] * i_747_) >> 14);
				anIntArray1978[i_749_] = (anIntArray2003[i_749_] * i_747_ + anIntArray1978[i_749_] * i_748_) >> 14;
				anIntArray2003[i_749_] = i_750_;
			}
		}
		if (i_741_ != 0) {
			int i_751_ = Class382.anIntArray4657[i_741_];
			int i_752_ = Class382.anIntArray4661[i_741_];
			for (int i_753_ = 0; i_753_ < anInt1974; i_753_++) {
				int i_754_ = ((anIntArray1978[i_753_] * i_751_ + anIntArray1976[i_753_] * i_752_) >> 14);
				anIntArray1978[i_753_] = (anIntArray1978[i_753_] * i_752_ - anIntArray1976[i_753_] * i_751_) >> 14;
				anIntArray1976[i_753_] = i_754_;
			}
		}
	}

	public void method2709(int i, int i_755_, int i_756_) {
		if (i_756_ != 0) {
			int i_757_ = Class382.anIntArray4657[i_756_];
			int i_758_ = Class382.anIntArray4661[i_756_];
			for (int i_759_ = 0; i_759_ < anInt1974; i_759_++) {
				int i_760_ = ((anIntArray2003[i_759_] * i_757_ + anIntArray1976[i_759_] * i_758_) >> 14);
				anIntArray2003[i_759_] = (anIntArray2003[i_759_] * i_758_ - anIntArray1976[i_759_] * i_757_) >> 14;
				anIntArray1976[i_759_] = i_760_;
			}
		}
		if (i != 0) {
			int i_761_ = Class382.anIntArray4657[i];
			int i_762_ = Class382.anIntArray4661[i];
			for (int i_763_ = 0; i_763_ < anInt1974; i_763_++) {
				int i_764_ = ((anIntArray2003[i_763_] * i_762_ - anIntArray1978[i_763_] * i_761_) >> 14);
				anIntArray1978[i_763_] = (anIntArray2003[i_763_] * i_761_ + anIntArray1978[i_763_] * i_762_) >> 14;
				anIntArray2003[i_763_] = i_764_;
			}
		}
		if (i_755_ != 0) {
			int i_765_ = Class382.anIntArray4657[i_755_];
			int i_766_ = Class382.anIntArray4661[i_755_];
			for (int i_767_ = 0; i_767_ < anInt1974; i_767_++) {
				int i_768_ = ((anIntArray1978[i_767_] * i_765_ + anIntArray1976[i_767_] * i_766_) >> 14);
				anIntArray1978[i_767_] = (anIntArray1978[i_767_] * i_766_ - anIntArray1976[i_767_] * i_765_) >> 14;
				anIntArray1976[i_767_] = i_768_;
			}
		}
	}

	public void method2710(int i, int i_769_, int i_770_) {
		if (i_770_ != 0) {
			int i_771_ = Class382.anIntArray4657[i_770_];
			int i_772_ = Class382.anIntArray4661[i_770_];
			for (int i_773_ = 0; i_773_ < anInt1974; i_773_++) {
				int i_774_ = ((anIntArray2003[i_773_] * i_771_ + anIntArray1976[i_773_] * i_772_) >> 14);
				anIntArray2003[i_773_] = (anIntArray2003[i_773_] * i_772_ - anIntArray1976[i_773_] * i_771_) >> 14;
				anIntArray1976[i_773_] = i_774_;
			}
		}
		if (i != 0) {
			int i_775_ = Class382.anIntArray4657[i];
			int i_776_ = Class382.anIntArray4661[i];
			for (int i_777_ = 0; i_777_ < anInt1974; i_777_++) {
				int i_778_ = ((anIntArray2003[i_777_] * i_776_ - anIntArray1978[i_777_] * i_775_) >> 14);
				anIntArray1978[i_777_] = (anIntArray2003[i_777_] * i_775_ + anIntArray1978[i_777_] * i_776_) >> 14;
				anIntArray2003[i_777_] = i_778_;
			}
		}
		if (i_769_ != 0) {
			int i_779_ = Class382.anIntArray4657[i_769_];
			int i_780_ = Class382.anIntArray4661[i_769_];
			for (int i_781_ = 0; i_781_ < anInt1974; i_781_++) {
				int i_782_ = ((anIntArray1978[i_781_] * i_779_ + anIntArray1976[i_781_] * i_780_) >> 14);
				anIntArray1978[i_781_] = (anIntArray1978[i_781_] * i_780_ - anIntArray1976[i_781_] * i_779_) >> 14;
				anIntArray1976[i_781_] = i_782_;
			}
		}
	}

	public void method2711(int i, int i_783_, int i_784_) {
		if (i_784_ != 0) {
			int i_785_ = Class382.anIntArray4657[i_784_];
			int i_786_ = Class382.anIntArray4661[i_784_];
			for (int i_787_ = 0; i_787_ < anInt1974; i_787_++) {
				int i_788_ = ((anIntArray2003[i_787_] * i_785_ + anIntArray1976[i_787_] * i_786_) >> 14);
				anIntArray2003[i_787_] = (anIntArray2003[i_787_] * i_786_ - anIntArray1976[i_787_] * i_785_) >> 14;
				anIntArray1976[i_787_] = i_788_;
			}
		}
		if (i != 0) {
			int i_789_ = Class382.anIntArray4657[i];
			int i_790_ = Class382.anIntArray4661[i];
			for (int i_791_ = 0; i_791_ < anInt1974; i_791_++) {
				int i_792_ = ((anIntArray2003[i_791_] * i_790_ - anIntArray1978[i_791_] * i_789_) >> 14);
				anIntArray1978[i_791_] = (anIntArray2003[i_791_] * i_789_ + anIntArray1978[i_791_] * i_790_) >> 14;
				anIntArray2003[i_791_] = i_792_;
			}
		}
		if (i_783_ != 0) {
			int i_793_ = Class382.anIntArray4657[i_783_];
			int i_794_ = Class382.anIntArray4661[i_783_];
			for (int i_795_ = 0; i_795_ < anInt1974; i_795_++) {
				int i_796_ = ((anIntArray1978[i_795_] * i_793_ + anIntArray1976[i_795_] * i_794_) >> 14);
				anIntArray1978[i_795_] = (anIntArray1978[i_795_] * i_794_ - anIntArray1976[i_795_] * i_793_) >> 14;
				anIntArray1976[i_795_] = i_796_;
			}
		}
	}

	public void method2712(int i, int i_797_, int i_798_) {
		for (int i_799_ = 0; i_799_ < anInt1974; i_799_++) {
			anIntArray1976[i_799_] += i;
			anIntArray2003[i_799_] += i_797_;
			anIntArray1978[i_799_] += i_798_;
		}
	}

	public void method2713(int i) {
		for (int i_800_ = 0; i_800_ < anInt1974; i_800_++) {
			anIntArray1976[i_800_] <<= i;
			anIntArray2003[i_800_] <<= i;
			anIntArray1978[i_800_] <<= i;
		}
		if (anInt1979 > 0 && anIntArray1989 != null) {
			for (int i_801_ = 0; i_801_ < anIntArray1989.length; i_801_++) {
				anIntArray1989[i_801_] <<= i;
				anIntArray2000[i_801_] <<= i;
				if (aByteArray1995[i_801_] != 1)
					anIntArray2001[i_801_] <<= i;
			}
		}
	}
}
