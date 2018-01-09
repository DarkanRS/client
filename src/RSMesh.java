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
						anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 31283);
					anIntArray2001[i] = class282_sub35_102_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 24935);
					anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 6393);
					anIntArray2001[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 22265);
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
						anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 6138);
					anIntArray2001[i] = class282_sub35_102_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 30936);
					anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 3040);
					anIntArray2001[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 13221);
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
						anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 30844);
					anIntArray2001[i] = class282_sub35_102_.readUnsignedShort();
				} else {
					anIntArray1989[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 2051);
					anIntArray2000[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 17455);
					anIntArray2001[i] = class282_sub35_102_.read24BitUnsignedInteger((short) 6495);
				}
				aByteArray2005[i] = class282_sub35_103_.readByte((short) -7615);
				aByteArray1990[i] = class282_sub35_104_.readByte((short) -15141);
				anIntArray1992[i] = class282_sub35_105_.readByte((short) -1897);
			}
		}
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

	public static RSMesh decodeMesh(Index class317, int i, int i_600_) {
		byte[] is = class317.getFile(i, i_600_, -1774438474);
		if (is == null)
			return null;
		return new RSMesh(is);
	}

	public RSMesh(RSMesh[] meshes, int i) {
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
			RSMesh class157_610_ = meshes[i_609_];
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
			RSMesh class157_613_ = meshes[i_611_];
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
			RSMesh class157_625_ = meshes[i_623_];
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

	public void method2712(int i, int i_797_, int i_798_) {
		for (int i_799_ = 0; i_799_ < anInt1974; i_799_++) {
			anIntArray1976[i_799_] += i;
			anIntArray2003[i_799_] += i_797_;
			anIntArray1978[i_799_] += i_798_;
		}
	}
}
