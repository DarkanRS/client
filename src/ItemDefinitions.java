/* Class425 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemDefinitions implements Interface46 {
	public int anInt5030;
	public int anInt5031;
	int anInt5032;
	public static final int anInt5033 = 0;
	Class426 aClass426_5034;
	int anInt5035;
	int anInt5036;
	byte[] aByteArray5037;
	short[] aShortArray5038;
	short[] aShortArray5039;
	SwitchMap aClass465_5040;
	short[] aShortArray5041;
	public int anInt5042;
	public String aString5043 = "null";
	public int anInt5044;
	public int anInt5045;
	public int anInt5046;
	public int anInt5047;
	int anInt5048;
	public int anInt5049;
	public int anInt5050;
	public int anInt5051;
	public boolean aBool5052;
	public String[] aStringArray5053;
	public String[] aStringArray5054;
	public int anInt5055;
	public int anInt5056;
	public static final int anInt5057 = 1;
	public int anInt5058;
	public int anInt5059;
	public int anInt5060;
	public int anInt5061;
	public int anInt5062;
	public int anInt5063;
	public int anInt5064;
	public int anInt5065;
	int anInt5066;
	int anInt5067;
	public int anInt5068;
	int anInt5069;
	int anInt5070;
	int anInt5071;
	int[] anIntArray5072;
	int anInt5073;
	public int anInt5074;
	int anInt5075;
	int anInt5076;
	int anInt5077;
	public int anInt5078;
	int anInt5079;
	int anInt5080;
	int anInt5081;
	int[] anIntArray5082;
	short[] aShortArray5083;
	public int anInt5084;
	public boolean aBool5085;
	public static short[] aShortArray5086 = new short[256];
	public static final int anInt5087 = 2;
	int anInt5088;
	int anInt5089;
	int anInt5090;
	int anInt5091;
	int anInt5092;
	public int anInt5093;
	int anInt5094;
	public int anInt5095;
	int anInt5096;
	public int[] anIntArray5097;
	public int anInt5098;
	int anInt5099;
	int anInt5100;
	public boolean aBool5101;
	public int anInt5102;

	public final Class528 method7084(Class505 class505, int i, int i_0_, Class238 class238, Class456 class456, int i_1_, int i_2_, int i_3_, int i_4_, byte i_5_) {
		if (((ItemDefinitions) this).anIntArray5082 != null && i_0_ > 1) {
			int i_6_ = -1;
			for (int i_7_ = 0; i_7_ < 10; i_7_++) {
				if (i_0_ >= ((ItemDefinitions) this).anIntArray5072[i_7_] && 0 != ((ItemDefinitions) this).anIntArray5072[i_7_])
					i_6_ = ((ItemDefinitions) this).anIntArray5082[i_7_];
			}
			if (i_6_ != -1)
				return (((ItemDefinitions) this).aClass426_5034.getItemDefinitions(i_6_, 1094056584).method7084(class505, i, 1, class238, class456, i_1_, i_2_, i_3_, i_4_, (byte) 0));
		}
		int i_8_ = i;
		if (class456 != null)
			i_8_ |= class456.method7640(-1206237088);
		Class528 class528;
		synchronized (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115) {
			class528 = ((Class528) (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115.method3865((long) (1116898509 * ((ItemDefinitions) this).anInt5035 | class505.anInt5840 * -413843045 << 29))));
		}
		if (null == class528 || class505.method8452(class528.m(), i_8_) != 0) {
			if (null != class528)
				i_8_ = class505.method8546(i_8_, class528.m());
			int i_9_ = i_8_;
			if (((ItemDefinitions) this).aShortArray5041 != null)
				i_9_ |= 0x8000;
			if (((ItemDefinitions) this).aShortArray5038 != null || class238 != null)
				i_9_ |= 0x4000;
			if (128 != ((ItemDefinitions) this).anInt5088 * -1149583549)
				i_9_ |= 0x1;
			if (-1149583549 * ((ItemDefinitions) this).anInt5088 != 128)
				i_9_ |= 0x2;
			if (((ItemDefinitions) this).anInt5088 * -1149583549 != 128)
				i_9_ |= 0x4;
			Class157 class157 = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), (-1002877901 * ((ItemDefinitions) this).anInt5036), 0);
			if (class157 == null)
				return null;
			if (class157.anInt1986 < 13)
				class157.method2679(2);
			class528 = (class505.method8451(class157, i_9_, 924631903 * (((Class426) ((ItemDefinitions) this).aClass426_5034).anInt5116), 64 + ((ItemDefinitions) this).anInt5067 * -235550995, 850 + 1381934903 * ((ItemDefinitions) this).anInt5092));
			if (128 != -1149583549 * ((ItemDefinitions) this).anInt5088 || 128 != ((ItemDefinitions) this).anInt5032 * -1507136321 || 128 != ((ItemDefinitions) this).anInt5090 * 256268633)
				class528.oa(((ItemDefinitions) this).anInt5088 * -1149583549, ((ItemDefinitions) this).anInt5032 * -1507136321, ((ItemDefinitions) this).anInt5090 * 256268633);
			if (null != ((ItemDefinitions) this).aShortArray5038) {
				for (int i_10_ = 0; i_10_ < ((ItemDefinitions) this).aShortArray5038.length; i_10_++) {
					if (((ItemDefinitions) this).aByteArray5037 != null && i_10_ < ((ItemDefinitions) this).aByteArray5037.length)
						class528.X(((ItemDefinitions) this).aShortArray5038[i_10_], (aShortArray5086[(((ItemDefinitions) this).aByteArray5037[i_10_] & 0xff)]));
					else
						class528.X(((ItemDefinitions) this).aShortArray5038[i_10_], ((ItemDefinitions) this).aShortArray5039[i_10_]);
				}
			}
			if (((ItemDefinitions) this).aShortArray5041 != null) {
				for (int i_11_ = 0; i_11_ < ((ItemDefinitions) this).aShortArray5041.length; i_11_++)
					class528.W(((ItemDefinitions) this).aShortArray5041[i_11_], ((ItemDefinitions) this).aShortArray5083[i_11_]);
			}
			if (null != class238) {
				for (int i_12_ = 0; i_12_ < 10; i_12_++) {
					for (int i_13_ = 0; i_13_ < (AbstractQueue_Sub1.aShortArrayArray10068[i_12_]).length; i_13_++) {
						if (class238.anIntArray2923[i_12_] < (Class366.aShortArrayArrayArray4232[i_12_][i_13_]).length)
							class528.X((AbstractQueue_Sub1.aShortArrayArray10068[i_12_][i_13_]), (Class366.aShortArrayArrayArray4232[i_12_][i_13_][class238.anIntArray2923[i_12_]]));
					}
				}
			}
			class528.KA(i_8_);
			synchronized (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115) {
				((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115.method3856(class528, (long) (((ItemDefinitions) this).anInt5035 * 1116898509 | class505.anInt5840 * -413843045 << 29));
			}
		}
		if (null != class456 || 0 != i_4_) {
			class528 = class528.method11289((byte) 1, i_8_, true);
			if (class456 != null)
				class456.method7577(class528, 0, 16711935);
			if (i_4_ != 0)
				class528.PA(i_1_, i_2_, i_3_, i_4_);
		}
		class528.KA(i);
		return class528;
	}

	void method7085(int i) {
		/* empty */
	}

	void method7086(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_14_ = class282_sub35.readUnsignedByte();
			if (0 == i_14_)
				break;
			method7089(class282_sub35, i_14_, 1695857075);
		}
	}

	void method7087(ItemDefinitions class425_15_, ItemDefinitions class425_16_, int i) {
		anInt5051 = 0;
		((ItemDefinitions) this).anInt5036 = ((ItemDefinitions) class425_15_).anInt5036 * 1;
		anInt5042 = 1 * class425_15_.anInt5042;
		anInt5058 = 1 * class425_15_.anInt5058;
		anInt5045 = class425_15_.anInt5045 * 1;
		anInt5074 = 1 * class425_15_.anInt5074;
		anInt5063 = class425_15_.anInt5063 * 1;
		anInt5044 = 1 * class425_15_.anInt5044;
		((ItemDefinitions) this).aShortArray5038 = ((ItemDefinitions) class425_16_).aShortArray5038;
		((ItemDefinitions) this).aShortArray5039 = ((ItemDefinitions) class425_16_).aShortArray5039;
		((ItemDefinitions) this).aByteArray5037 = ((ItemDefinitions) class425_16_).aByteArray5037;
		((ItemDefinitions) this).aShortArray5041 = ((ItemDefinitions) class425_16_).aShortArray5041;
		((ItemDefinitions) this).aShortArray5083 = ((ItemDefinitions) class425_16_).aShortArray5083;
		aString5043 = class425_16_.aString5043;
		aBool5052 = class425_16_.aBool5052;
		anInt5047 = 1 * class425_16_.anInt5047;
		anInt5064 = 1 * class425_16_.anInt5064;
		anInt5065 = class425_16_.anInt5065 * 1;
		((ItemDefinitions) this).anInt5066 = 1 * ((ItemDefinitions) class425_16_).anInt5066;
		((ItemDefinitions) this).anInt5100 = 1 * ((ItemDefinitions) class425_16_).anInt5100;
		((ItemDefinitions) this).anInt5070 = ((ItemDefinitions) class425_16_).anInt5070 * 1;
		((ItemDefinitions) this).anInt5075 = ((ItemDefinitions) class425_16_).anInt5075 * 1;
		((ItemDefinitions) this).anInt5069 = ((ItemDefinitions) class425_16_).anInt5069 * 1;
		((ItemDefinitions) this).anInt5071 = ((ItemDefinitions) class425_16_).anInt5071 * 1;
		((ItemDefinitions) this).anInt5089 = 1 * ((ItemDefinitions) class425_16_).anInt5089;
		((ItemDefinitions) this).anInt5073 = ((ItemDefinitions) class425_16_).anInt5073 * 1;
		((ItemDefinitions) this).anInt5094 = ((ItemDefinitions) class425_16_).anInt5094 * 1;
		((ItemDefinitions) this).anInt5091 = 1 * ((ItemDefinitions) class425_16_).anInt5091;
		((ItemDefinitions) this).anInt5076 = 1 * ((ItemDefinitions) class425_16_).anInt5076;
		((ItemDefinitions) this).anInt5077 = ((ItemDefinitions) class425_16_).anInt5077 * 1;
		((ItemDefinitions) this).anInt5096 = ((ItemDefinitions) class425_16_).anInt5096 * 1;
		((ItemDefinitions) this).anInt5079 = ((ItemDefinitions) class425_16_).anInt5079 * 1;
		((ItemDefinitions) this).anInt5080 = ((ItemDefinitions) class425_16_).anInt5080 * 1;
		((ItemDefinitions) this).anInt5081 = ((ItemDefinitions) class425_16_).anInt5081 * 1;
		anInt5093 = class425_16_.anInt5093 * 1;
		aStringArray5053 = class425_16_.aStringArray5053;
		((ItemDefinitions) this).aClass465_5040 = ((ItemDefinitions) class425_16_).aClass465_5040;
		anInt5049 = 1 * class425_16_.anInt5049;
		aStringArray5054 = new String[5];
		if (null != class425_16_.aStringArray5054) {
			for (int i_17_ = 0; i_17_ < 4; i_17_++)
				aStringArray5054[i_17_] = class425_16_.aStringArray5054[i_17_];
		}
		aStringArray5054[4] = Class433.aClass433_5166.method7273((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass495_5104), -2102685104);
	}

	void method7088(ItemDefinitions class425_18_, ItemDefinitions class425_19_, int i) {
		((ItemDefinitions) this).anInt5036 = 1 * ((ItemDefinitions) class425_18_).anInt5036;
		anInt5042 = 1 * class425_18_.anInt5042;
		anInt5058 = 1 * class425_18_.anInt5058;
		anInt5045 = class425_18_.anInt5045 * 1;
		anInt5074 = class425_18_.anInt5074 * 1;
		anInt5063 = 1 * class425_18_.anInt5063;
		anInt5044 = class425_18_.anInt5044 * 1;
		((ItemDefinitions) this).aShortArray5038 = ((ItemDefinitions) class425_18_).aShortArray5038;
		((ItemDefinitions) this).aShortArray5039 = ((ItemDefinitions) class425_18_).aShortArray5039;
		((ItemDefinitions) this).aByteArray5037 = ((ItemDefinitions) class425_18_).aByteArray5037;
		((ItemDefinitions) this).aShortArray5041 = ((ItemDefinitions) class425_18_).aShortArray5041;
		((ItemDefinitions) this).aShortArray5083 = ((ItemDefinitions) class425_18_).aShortArray5083;
		aString5043 = class425_19_.aString5043;
		aBool5052 = class425_19_.aBool5052;
		anInt5051 = 1 * class425_19_.anInt5051;
		anInt5049 = -1948887511;
	}

	void method7089(RsByteBuffer class282_sub35, int i, int i_20_) {
		if (1 == i)
			((ItemDefinitions) this).anInt5036 = class282_sub35.readBigSmart(2064304422) * 809144059;
		else if (i == 2)
			aString5043 = class282_sub35.readString(1760674316);
		else if (i == 4)
			anInt5042 = class282_sub35.readUnsignedShort() * 292917833;
		else if (i == 5)
			anInt5058 = class282_sub35.readUnsignedShort() * 492453963;
		else if (6 == i)
			anInt5045 = class282_sub35.readUnsignedShort() * 619430641;
		else if (i == 7) {
			anInt5063 = class282_sub35.readUnsignedShort() * 834650329;
			if (406372201 * anInt5063 > 32767)
				anInt5063 -= -1059520512;
		} else if (8 == i) {
			anInt5044 = class282_sub35.readUnsignedShort() * 870855977;
			if (-1316014311 * anInt5044 > 32767)
				anInt5044 -= 891879424;
		} else if (11 == i)
			anInt5049 = -1948887511;
		else if (i == 12)
			anInt5051 = class282_sub35.readInt() * 222766991;
		else if (i == 13)
			anInt5047 = class282_sub35.readUnsignedByte() * -1946123025;
		else if (14 == i)
			anInt5064 = class282_sub35.readUnsignedByte() * -247957423;
		else if (i == 16)
			aBool5052 = true;
		else if (i == 18)
			anInt5050 = class282_sub35.readUnsignedShort() * -173634739;
		else if (23 == i)
			((ItemDefinitions) this).anInt5066 = class282_sub35.readBigSmart(2019249082) * -342249107;
		else if (24 == i)
			((ItemDefinitions) this).anInt5100 = class282_sub35.readBigSmart(2036288175) * 178028511;
		else if (i == 25)
			((ItemDefinitions) this).anInt5075 = class282_sub35.readBigSmart(2091471186) * -1963342619;
		else if (26 == i)
			((ItemDefinitions) this).anInt5069 = class282_sub35.readBigSmart(2001810199) * -691157025;
		else if (i == 27)
			anInt5065 = class282_sub35.readUnsignedByte() * -1540246871;
		else if (i >= 30 && i < 35)
			aStringArray5053[i - 30] = class282_sub35.readString(-383945926);
		else if (i >= 35 && i < 40)
			aStringArray5054[i - 35] = class282_sub35.readString(1233494937);
		else if (i == 40) {
			int i_21_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aShortArray5038 = new short[i_21_];
			((ItemDefinitions) this).aShortArray5039 = new short[i_21_];
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
				((ItemDefinitions) this).aShortArray5038[i_22_] = (short) class282_sub35.readUnsignedShort();
				((ItemDefinitions) this).aShortArray5039[i_22_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_23_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aShortArray5041 = new short[i_23_];
			((ItemDefinitions) this).aShortArray5083 = new short[i_23_];
			for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
				((ItemDefinitions) this).aShortArray5041[i_24_] = (short) class282_sub35.readUnsignedShort();
				((ItemDefinitions) this).aShortArray5083[i_24_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_25_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aByteArray5037 = new byte[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
				((ItemDefinitions) this).aByteArray5037[i_26_] = class282_sub35.readByte((short) -8308);
		} else if (i == 43) {
			anInt5102 = class282_sub35.readInt() * -796858641;
			aBool5101 = true;
		} else if (i == 65)
			aBool5085 = true;
		else if (78 == i)
			((ItemDefinitions) this).anInt5070 = class282_sub35.readBigSmart(2006648786) * -2110709183;
		else if (79 == i)
			((ItemDefinitions) this).anInt5071 = class282_sub35.readBigSmart(1954056541) * 1292119991;
		else if (90 == i)
			((ItemDefinitions) this).anInt5096 = class282_sub35.readBigSmart(2016946160) * -582979729;
		else if (91 == i)
			((ItemDefinitions) this).anInt5080 = class282_sub35.readBigSmart(2097200271) * -1176241203;
		else if (i == 92)
			((ItemDefinitions) this).anInt5079 = class282_sub35.readBigSmart(2142001802) * -18677607;
		else if (i == 93)
			((ItemDefinitions) this).anInt5081 = class282_sub35.readBigSmart(2139963180) * 1320781975;
		else if (i == 95)
			anInt5074 = class282_sub35.readUnsignedShort() * -1869642735;
		else if (96 == i)
			anInt5095 = class282_sub35.readUnsignedByte() * -676128457;
		else if (i == 97)
			anInt5084 = class282_sub35.readUnsignedShort() * 2048174935;
		else if (i == 98)
			anInt5078 = class282_sub35.readUnsignedShort() * 185661005;
		else if (i >= 100 && i < 110) {
			if (null == ((ItemDefinitions) this).anIntArray5082) {
				((ItemDefinitions) this).anIntArray5082 = new int[10];
				((ItemDefinitions) this).anIntArray5072 = new int[10];
			}
			((ItemDefinitions) this).anIntArray5082[i - 100] = class282_sub35.readUnsignedShort();
			((ItemDefinitions) this).anIntArray5072[i - 100] = class282_sub35.readUnsignedShort();
		} else if (i == 110)
			((ItemDefinitions) this).anInt5088 = class282_sub35.readUnsignedShort() * 1651983723;
		else if (i == 111)
			((ItemDefinitions) this).anInt5032 = class282_sub35.readUnsignedShort() * -868842689;
		else if (i == 112)
			((ItemDefinitions) this).anInt5090 = class282_sub35.readUnsignedShort() * 1983536873;
		else if (i == 113)
			((ItemDefinitions) this).anInt5067 = class282_sub35.readByte((short) -25769) * 259622629;
		else if (i == 114)
			((ItemDefinitions) this).anInt5092 = class282_sub35.readByte((short) -9734) * 1423227043;
		else if (i == 115)
			anInt5093 = class282_sub35.readUnsignedByte() * 1901746537;
		else if (121 == i)
			((ItemDefinitions) this).anInt5048 = class282_sub35.readUnsignedShort() * -68529475;
		else if (122 == i)
			anInt5068 = class282_sub35.readUnsignedShort() * -1862010471;
		else if (125 == i) {
			((ItemDefinitions) this).anInt5089 = ((class282_sub35.readByte((short) -30156) << 2) * 1904059659);
			((ItemDefinitions) this).anInt5094 = ((class282_sub35.readByte((short) -23127) << 2) * -547377553);
			((ItemDefinitions) this).anInt5076 = ((class282_sub35.readByte((short) -22740) << 2) * 1878832413);
		} else if (i == 126) {
			((ItemDefinitions) this).anInt5073 = ((class282_sub35.readByte((short) -11885) << 2) * 1252496961);
			((ItemDefinitions) this).anInt5091 = ((class282_sub35.readByte((short) -8708) << 2) * -377946013);
			((ItemDefinitions) this).anInt5077 = ((class282_sub35.readByte((short) -26470) << 2) * 1444840851);
		} else if (127 == i) {
			anInt5059 = class282_sub35.readUnsignedByte() * 1898017081;
			anInt5055 = class282_sub35.readUnsignedShort() * -1370939175;
		} else if (i == 128) {
			anInt5060 = class282_sub35.readUnsignedByte() * 930264291;
			anInt5056 = class282_sub35.readUnsignedShort() * 2036382095;
		} else if (i == 129) {
			anInt5061 = class282_sub35.readUnsignedByte() * -1908691611;
			anInt5062 = class282_sub35.readUnsignedShort() * 988221655;
		} else if (i == 130) {
			anInt5030 = class282_sub35.readUnsignedByte() * -1151562079;
			anInt5031 = class282_sub35.readUnsignedShort() * -149100495;
		} else if (132 == i) {
			int i_27_ = class282_sub35.readUnsignedByte();
			anIntArray5097 = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
				anIntArray5097[i_28_] = class282_sub35.readUnsignedShort();
		} else if (i == 134)
			anInt5098 = class282_sub35.readUnsignedByte() * -179097779;
		else if (i == 139)
			((ItemDefinitions) this).anInt5099 = class282_sub35.readUnsignedShort() * 1174980021;
		else if (i == 140)
			anInt5046 = class282_sub35.readUnsignedShort() * 1638301585;
		else if (249 == i) {
			int i_29_ = class282_sub35.readUnsignedByte();
			if (null == ((ItemDefinitions) this).aClass465_5040) {
				int i_30_ = Class323.nextPowerOfTwo(i_29_, -1837166011);
				((ItemDefinitions) this).aClass465_5040 = new SwitchMap(i_30_);
			}
			for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_32_ = class282_sub35.read24BitUnsignedInteger((short) 19822);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(1641742655));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((ItemDefinitions) this).aClass465_5040.method7765(class282, (long) i_32_);
			}
		}
	}

	public ItemDefinitions method7090(int i, byte i_33_) {
		if (((ItemDefinitions) this).anIntArray5082 != null && i > 1) {
			int i_34_ = -1;
			for (int i_35_ = 0; i_35_ < 10; i_35_++) {
				if (i >= ((ItemDefinitions) this).anIntArray5072[i_35_] && ((ItemDefinitions) this).anIntArray5072[i_35_] != 0)
					i_34_ = ((ItemDefinitions) this).anIntArray5082[i_35_];
			}
			if (-1 != i_34_)
				return ((ItemDefinitions) this).aClass426_5034.getItemDefinitions(i_34_, 1397135456);
		}
		return this;
	}

	public final boolean method7091(boolean bool, ItemEffects class422) {
		int i;
		int i_36_;
		if (bool) {
			if (class422 != null && null != class422.anIntArray5023) {
				i = class422.anIntArray5023[0];
				i_36_ = class422.anIntArray5023[1];
			} else {
				i = -1705416443 * ((ItemDefinitions) this).anInt5080;
				i_36_ = ((ItemDefinitions) this).anInt5081 * -1871546585;
			}
		} else if (null != class422 && null != class422.anIntArray5022) {
			i = class422.anIntArray5022[0];
			i_36_ = class422.anIntArray5022[1];
		} else {
			i = ((ItemDefinitions) this).anInt5096 * -603336817;
			i_36_ = ((ItemDefinitions) this).anInt5079 * -613723223;
		}
		if (i == -1)
			return true;
		boolean bool_37_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i, 0, 16711935))
			bool_37_ = false;
		if (-1 != i_36_ && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_36_, 0, 16711935))
			bool_37_ = false;
		return bool_37_;
	}

	public final Class157 method7092(boolean bool, ItemEffects class422) {
		int i;
		int i_38_;
		int i_39_;
		if (bool) {
			if (class422 != null && class422.anIntArray5021 != null) {
				i = class422.anIntArray5021[0];
				i_38_ = class422.anIntArray5021[1];
				i_39_ = class422.anIntArray5021[2];
			} else {
				i = ((ItemDefinitions) this).anInt5075 * -2090968851;
				i_38_ = ((ItemDefinitions) this).anInt5069 * -1259031521;
				i_39_ = ((ItemDefinitions) this).anInt5071 * -1802576377;
			}
		} else if (class422 != null && null != class422.anIntArray5025) {
			i = class422.anIntArray5025[0];
			i_38_ = class422.anIntArray5025[1];
			i_39_ = class422.anIntArray5025[2];
		} else {
			i = -525270939 * ((ItemDefinitions) this).anInt5066;
			i_38_ = -931922913 * ((ItemDefinitions) this).anInt5100;
			i_39_ = -562041407 * ((ItemDefinitions) this).anInt5070;
		}
		if (-1 == i)
			return null;
		Class157 class157 = Class157.method2689((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass317_5111), i, 0);
		if (class157 == null)
			return null;
		if (class157.anInt1986 < 13)
			class157.method2679(2);
		if (i_38_ != -1) {
			Class157 class157_40_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_38_, 0);
			if (class157_40_.anInt1986 < 13)
				class157_40_.method2679(2);
			if (i_39_ != -1) {
				Class157 class157_41_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_39_, 0);
				if (class157_41_.anInt1986 < 13)
					class157_41_.method2679(2);
				Class157[] class157s = { class157, class157_40_, class157_41_ };
				class157 = new Class157(class157s, 3);
			} else {
				Class157[] class157s = { class157, class157_40_ };
				class157 = new Class157(class157s, 2);
			}
		}
		if (!bool && (0 != -1021444445 * ((ItemDefinitions) this).anInt5089 || -988581745 * ((ItemDefinitions) this).anInt5094 != 0 || ((ItemDefinitions) this).anInt5076 * 1784001845 != 0))
			class157.method2712(((ItemDefinitions) this).anInt5089 * -1021444445, -988581745 * ((ItemDefinitions) this).anInt5094, ((ItemDefinitions) this).anInt5076 * 1784001845);
		if (bool && (0 != -958170687 * ((ItemDefinitions) this).anInt5073 || ((ItemDefinitions) this).anInt5091 * -710311605 != 0 || 362438811 * ((ItemDefinitions) this).anInt5077 != 0))
			class157.method2712(((ItemDefinitions) this).anInt5073 * -958170687, -710311605 * ((ItemDefinitions) this).anInt5091, ((ItemDefinitions) this).anInt5077 * 362438811);
		if (((ItemDefinitions) this).aShortArray5038 != null) {
			short[] is;
			if (null != class422 && class422.aShortArray5020 != null)
				is = class422.aShortArray5020;
			else
				is = ((ItemDefinitions) this).aShortArray5039;
			for (int i_42_ = 0; i_42_ < ((ItemDefinitions) this).aShortArray5038.length; i_42_++)
				class157.method2668(((ItemDefinitions) this).aShortArray5038[i_42_], is[i_42_]);
		}
		if (((ItemDefinitions) this).aShortArray5041 != null) {
			short[] is;
			if (null != class422 && null != class422.aShortArray5019)
				is = class422.aShortArray5019;
			else
				is = ((ItemDefinitions) this).aShortArray5083;
			for (int i_43_ = 0; i_43_ < ((ItemDefinitions) this).aShortArray5041.length; i_43_++)
				class157.method2669(((ItemDefinitions) this).aShortArray5041[i_43_], is[i_43_]);
		}
		return class157;
	}

	int[] method7093(Class505 class505, Class505 class505_44_, int i, int i_45_, int i_46_, boolean bool, int i_47_, Class8 class8, Class238 class238, short i_48_) {
		Class157 class157 = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), -1002877901 * ((ItemDefinitions) this).anInt5036, 0);
		if (class157 == null)
			return null;
		if (class157.anInt1986 < 13)
			class157.method2679(2);
		if (null != ((ItemDefinitions) this).aShortArray5038) {
			for (int i_49_ = 0; i_49_ < ((ItemDefinitions) this).aShortArray5038.length; i_49_++) {
				if (null != ((ItemDefinitions) this).aByteArray5037 && i_49_ < ((ItemDefinitions) this).aByteArray5037.length)
					class157.method2668((((ItemDefinitions) this).aShortArray5038[i_49_]), aShortArray5086[(((ItemDefinitions) this).aByteArray5037[i_49_]) & 0xff]);
				else
					class157.method2668((((ItemDefinitions) this).aShortArray5038[i_49_]), (((ItemDefinitions) this).aShortArray5039[i_49_]));
			}
		}
		if (null != ((ItemDefinitions) this).aShortArray5041) {
			for (int i_50_ = 0; i_50_ < ((ItemDefinitions) this).aShortArray5041.length; i_50_++)
				class157.method2669(((ItemDefinitions) this).aShortArray5041[i_50_], ((ItemDefinitions) this).aShortArray5083[i_50_]);
		}
		if (null != class238) {
			for (int i_51_ = 0; i_51_ < 10; i_51_++) {
				for (int i_52_ = 0; i_52_ < (AbstractQueue_Sub1.aShortArrayArray10068[i_51_]).length; i_52_++) {
					if (class238.anIntArray2923[i_51_] < (Class366.aShortArrayArrayArray4232[i_51_][i_52_]).length)
						class157.method2668((AbstractQueue_Sub1.aShortArrayArray10068[i_51_][i_52_]), (Class366.aShortArrayArrayArray4232[i_51_][i_52_][(class238.anIntArray2923[i_51_])]));
				}
			}
		}
		int i_53_ = 2048;
		boolean bool_54_ = false;
		if (128 != ((ItemDefinitions) this).anInt5088 * -1149583549 || ((ItemDefinitions) this).anInt5032 * -1507136321 != 128 || 128 != 256268633 * ((ItemDefinitions) this).anInt5090) {
			bool_54_ = true;
			i_53_ |= 0x7;
		}
		Class528 class528 = class505.method8451(class157, i_53_, 64, (((ItemDefinitions) this).anInt5067 * -235550995 + 64), (((ItemDefinitions) this).anInt5092 * 1381934903 + 768));
		if (!class528.method11272())
			return null;
		if (bool_54_)
			class528.oa(-1149583549 * ((ItemDefinitions) this).anInt5088, ((ItemDefinitions) this).anInt5032 * -1507136321, 256268633 * ((ItemDefinitions) this).anInt5090);
		Class160 class160 = null;
		if (-1 != anInt5078 * -722914683) {
			class160 = (((ItemDefinitions) this).aClass426_5034.method7147(class505, class505_44_, anInt5084 * 1416589415, 10, 1, 0, true, true, 0, class8, class238, (byte) -12));
			if (class160 == null)
				return null;
		} else if (-1203090775 * anInt5068 != -1) {
			class160 = (((ItemDefinitions) this).aClass426_5034.method7147(class505, class505_44_, -14763883 * ((ItemDefinitions) this).anInt5048, i, i_45_, i_46_, false, true, 0, class8, class238, (byte) 63));
			if (class160 == null)
				return null;
		} else if (-1 != 370155889 * anInt5046) {
			class160 = (((ItemDefinitions) this).aClass426_5034.method7147(class505, class505_44_, 224116893 * ((ItemDefinitions) this).anInt5099, i, i_45_, i_46_, false, true, 0, class8, class238, (byte) 12));
			if (null == class160)
				return null;
		}
		int i_55_;
		if (bool)
			i_55_ = (int) (1.5 * (double) (anInt5042 * -1468071943)) << 2;
		else if (i_45_ == 2)
			i_55_ = (int) ((double) (anInt5042 * -1468071943) * 1.04) << 2;
		else
			i_55_ = anInt5042 * -1468071943 << 2;
		Class384 class384 = class505.method8453();
		Class384 class384_56_ = class505.method8449();
		class384_56_.method6531(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class505.method8523((byte) 121).method2714(), (float) class505.method8523((byte) 111).method2716());
		class505.method8424(class384_56_);
		class505.method8617(0, 0, class505.method8523((byte) 122).method2714(), class505.method8523((byte) 122).method2716());
		Class294 class294 = new Class294();
		class505.method8457(class294);
		class505.IA(0.95F + (float) (Math.random() / 10.0));
		class505.m(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class294 class294_57_ = class505.method8450();
		class294_57_.method5217(0.0F, 0.0F, 1.0F, Class382.method6508(-(anInt5074 * 701885681) << 3));
		class294_57_.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(920448529 * anInt5045 << 3));
		class294_57_.method5219((float) (406372201 * anInt5063 << 2), (float) (((i_55_ * (Class382.anIntArray4657[1752402275 * anInt5058 << 3])) >> 14) - class528.YA() / 2 + (-1316014311 * anInt5044 << 2)), (float) ((((Class382.anIntArray4661[anInt5058 * 1752402275 << 3]) * i_55_) >> 14) + (-1316014311 * anInt5044 << 2)));
		class294_57_.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(1752402275 * anInt5058 << 3));
		class505.r(0, 0, 36, 32);
		class505.ba(2, 0);
		class505.B(0, 0, 36, 32, 0, 0);
		class505.c(0, -1, 0);
		class528.method11282(class294_57_, null, 1);
		class505.method8424(class384);
		int[] is = class505.ab(0, 0, 36, 32);
		if (i_45_ >= 1) {
			is = method7120(is, -16777214, (byte) -98);
			if (i_45_ >= 2)
				is = method7120(is, -1, (byte) -71);
		}
		if (i_46_ != 0)
			method7095(is, i_46_, (byte) -34);
		if (-1 != anInt5068 * -1203090775)
			class160.method2752(0, 0);
		else if (anInt5046 * 370155889 != -1)
			class160.method2752(0, 0);
		class505.method8549(is, 0, 36, 36, 32, 1982525260).method2752(0, 0);
		if (anInt5078 * -722914683 != -1)
			class160.method2752(0, 0);
		if (1 == i_47_ || 2 == i_47_ && (1 == anInt5049 * 318481945 || 1 != i) && i != -1)
			class8.method358(Class304.method5407(i, (((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass495_5104), (byte) 47), 0, 9, -256, -16777215, -418109423);
		is = class505.ab(0, 0, 36, 32);
		for (int i_58_ = 0; i_58_ < is.length; i_58_++) {
			if ((is[i_58_] & 0xffffff) == 0)
				is[i_58_] = 0;
			else
				is[i_58_] |= ~0xffffff;
		}
		return is;
	}

	public final Class157 method7094(boolean bool, ItemEffects class422) {
		int i;
		int i_59_;
		if (bool) {
			if (null != class422 && class422.anIntArray5023 != null) {
				i = class422.anIntArray5023[0];
				i_59_ = class422.anIntArray5023[1];
			} else {
				i = ((ItemDefinitions) this).anInt5080 * -1705416443;
				i_59_ = ((ItemDefinitions) this).anInt5081 * -1871546585;
			}
		} else if (class422 != null && null != class422.anIntArray5022) {
			i = class422.anIntArray5022[0];
			i_59_ = class422.anIntArray5022[1];
		} else {
			i = -603336817 * ((ItemDefinitions) this).anInt5096;
			i_59_ = ((ItemDefinitions) this).anInt5079 * -613723223;
		}
		if (i == -1)
			return null;
		Class157 class157 = Class157.method2689((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass317_5111), i, 0);
		if (class157.anInt1986 < 13)
			class157.method2679(2);
		if (-1 != i_59_) {
			Class157 class157_60_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_59_, 0);
			if (class157_60_.anInt1986 < 13)
				class157_60_.method2679(2);
			Class157[] class157s = { class157, class157_60_ };
			class157 = new Class157(class157s, 2);
		}
		if (null != ((ItemDefinitions) this).aShortArray5038) {
			short[] is;
			if (null != class422 && class422.aShortArray5020 != null)
				is = class422.aShortArray5020;
			else
				is = ((ItemDefinitions) this).aShortArray5039;
			for (int i_61_ = 0; i_61_ < ((ItemDefinitions) this).aShortArray5038.length; i_61_++)
				class157.method2668(((ItemDefinitions) this).aShortArray5038[i_61_], is[i_61_]);
		}
		if (((ItemDefinitions) this).aShortArray5041 != null) {
			short[] is;
			if (class422 != null && null != class422.aShortArray5019)
				is = class422.aShortArray5019;
			else
				is = ((ItemDefinitions) this).aShortArray5083;
			for (int i_62_ = 0; i_62_ < ((ItemDefinitions) this).aShortArray5041.length; i_62_++)
				class157.method2669(((ItemDefinitions) this).aShortArray5041[i_62_], is[i_62_]);
		}
		return class157;
	}

	void method7095(int[] is, int i, byte i_63_) {
		for (int i_64_ = 31; i_64_ > 0; i_64_--) {
			int i_65_ = i_64_ * 36;
			for (int i_66_ = 35; i_66_ > 0; i_66_--) {
				if (0 == is[i_66_ + i_65_] && is[i_66_ + i_65_ - 1 - 36] != 0)
					is[i_65_ + i_66_] = i;
			}
		}
	}

	public final boolean method7096(boolean bool, ItemEffects class422, int i) {
		int i_67_;
		int i_68_;
		int i_69_;
		if (bool) {
			if (null != class422 && null != class422.anIntArray5021) {
				i_67_ = class422.anIntArray5021[0];
				i_68_ = class422.anIntArray5021[1];
				i_69_ = class422.anIntArray5021[2];
			} else {
				i_67_ = ((ItemDefinitions) this).anInt5075 * -2090968851;
				i_68_ = -1259031521 * ((ItemDefinitions) this).anInt5069;
				i_69_ = -1802576377 * ((ItemDefinitions) this).anInt5071;
			}
		} else if (class422 != null && null != class422.anIntArray5025) {
			i_67_ = class422.anIntArray5025[0];
			i_68_ = class422.anIntArray5025[1];
			i_69_ = class422.anIntArray5025[2];
		} else {
			i_67_ = -525270939 * ((ItemDefinitions) this).anInt5066;
			i_68_ = -931922913 * ((ItemDefinitions) this).anInt5100;
			i_69_ = ((ItemDefinitions) this).anInt5070 * -562041407;
		}
		if (i_67_ == -1)
			return true;
		boolean bool_70_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_67_, 0, 16711935))
			bool_70_ = false;
		if (i_68_ != -1 && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_68_, 0, 16711935))
			bool_70_ = false;
		if (i_69_ != -1 && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_69_, 0, 16711935))
			bool_70_ = false;
		return bool_70_;
	}

	public final Class157 method7097(boolean bool, ItemEffects class422, int i) {
		int i_71_;
		int i_72_;
		int i_73_;
		if (bool) {
			if (class422 != null && class422.anIntArray5021 != null) {
				i_71_ = class422.anIntArray5021[0];
				i_72_ = class422.anIntArray5021[1];
				i_73_ = class422.anIntArray5021[2];
			} else {
				i_71_ = ((ItemDefinitions) this).anInt5075 * -2090968851;
				i_72_ = ((ItemDefinitions) this).anInt5069 * -1259031521;
				i_73_ = ((ItemDefinitions) this).anInt5071 * -1802576377;
			}
		} else if (class422 != null && null != class422.anIntArray5025) {
			i_71_ = class422.anIntArray5025[0];
			i_72_ = class422.anIntArray5025[1];
			i_73_ = class422.anIntArray5025[2];
		} else {
			i_71_ = -525270939 * ((ItemDefinitions) this).anInt5066;
			i_72_ = -931922913 * ((ItemDefinitions) this).anInt5100;
			i_73_ = -562041407 * ((ItemDefinitions) this).anInt5070;
		}
		if (-1 == i_71_)
			return null;
		Class157 class157 = Class157.method2689((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass317_5111), i_71_, 0);
		if (class157 == null)
			return null;
		if (class157.anInt1986 < 13)
			class157.method2679(2);
		if (i_72_ != -1) {
			Class157 class157_74_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_72_, 0);
			if (class157_74_.anInt1986 < 13)
				class157_74_.method2679(2);
			if (i_73_ != -1) {
				Class157 class157_75_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_73_, 0);
				if (class157_75_.anInt1986 < 13)
					class157_75_.method2679(2);
				Class157[] class157s = { class157, class157_74_, class157_75_ };
				class157 = new Class157(class157s, 3);
			} else {
				Class157[] class157s = { class157, class157_74_ };
				class157 = new Class157(class157s, 2);
			}
		}
		if (!bool && (0 != -1021444445 * ((ItemDefinitions) this).anInt5089 || -988581745 * ((ItemDefinitions) this).anInt5094 != 0 || ((ItemDefinitions) this).anInt5076 * 1784001845 != 0))
			class157.method2712(((ItemDefinitions) this).anInt5089 * -1021444445, -988581745 * ((ItemDefinitions) this).anInt5094, ((ItemDefinitions) this).anInt5076 * 1784001845);
		if (bool && (0 != -958170687 * ((ItemDefinitions) this).anInt5073 || ((ItemDefinitions) this).anInt5091 * -710311605 != 0 || 362438811 * ((ItemDefinitions) this).anInt5077 != 0))
			class157.method2712(((ItemDefinitions) this).anInt5073 * -958170687, -710311605 * ((ItemDefinitions) this).anInt5091, ((ItemDefinitions) this).anInt5077 * 362438811);
		if (((ItemDefinitions) this).aShortArray5038 != null) {
			short[] is;
			if (null != class422 && class422.aShortArray5020 != null)
				is = class422.aShortArray5020;
			else
				is = ((ItemDefinitions) this).aShortArray5039;
			for (int i_76_ = 0; i_76_ < ((ItemDefinitions) this).aShortArray5038.length; i_76_++)
				class157.method2668(((ItemDefinitions) this).aShortArray5038[i_76_], is[i_76_]);
		}
		if (((ItemDefinitions) this).aShortArray5041 != null) {
			short[] is;
			if (null != class422 && null != class422.aShortArray5019)
				is = class422.aShortArray5019;
			else
				is = ((ItemDefinitions) this).aShortArray5083;
			for (int i_77_ = 0; i_77_ < ((ItemDefinitions) this).aShortArray5041.length; i_77_++)
				class157.method2669(((ItemDefinitions) this).aShortArray5041[i_77_], is[i_77_]);
		}
		return class157;
	}

	public final boolean method7098(boolean bool, ItemEffects class422, int i) {
		int i_78_;
		int i_79_;
		if (bool) {
			if (class422 != null && null != class422.anIntArray5023) {
				i_78_ = class422.anIntArray5023[0];
				i_79_ = class422.anIntArray5023[1];
			} else {
				i_78_ = -1705416443 * ((ItemDefinitions) this).anInt5080;
				i_79_ = ((ItemDefinitions) this).anInt5081 * -1871546585;
			}
		} else if (null != class422 && null != class422.anIntArray5022) {
			i_78_ = class422.anIntArray5022[0];
			i_79_ = class422.anIntArray5022[1];
		} else {
			i_78_ = ((ItemDefinitions) this).anInt5096 * -603336817;
			i_79_ = ((ItemDefinitions) this).anInt5079 * -613723223;
		}
		if (i_78_ == -1)
			return true;
		boolean bool_80_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_78_, 0, 16711935))
			bool_80_ = false;
		if (-1 != i_79_ && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_79_, 0, 16711935))
			bool_80_ = false;
		return bool_80_;
	}

	public int method7099(int i, int i_81_, int i_82_) {
		if (((ItemDefinitions) this).aClass465_5040 == null)
			return i_81_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((ItemDefinitions) this).aClass465_5040.method7754((long) i));
		if (null == class282_sub38)
			return i_81_;
		return -570797415 * class282_sub38.anInt8002;
	}

	static String method7100(int i, Class495 class495) {
		if (i < 100000)
			return new StringBuilder().append("<col=ffff00>").append(i).append("</col>").toString();
		if (i < 10000000)
			return new StringBuilder().append("<col=ffffff>").append(i / 1000).append(Class433.aClass433_5297.method7273(class495, -1450029844)).append("</col>").toString();
		return new StringBuilder().append("<col=00ff80>").append(i / 1000000).append(Class433.aClass433_5304.method7273(class495, -460579826)).append("</col>").toString();
	}

	public String method7101(int i, String string, int i_83_) {
		if (null == ((ItemDefinitions) this).aClass465_5040)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((ItemDefinitions) this).aClass465_5040.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	void method7102() {
		/* empty */
	}

	void method7103(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7089(class282_sub35, i, 1094314954);
		}
	}

	void method7104(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7089(class282_sub35, i, 840238977);
		}
	}

	void method7105(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7089(class282_sub35, i, 279033740);
		}
	}

	void method7106(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7089(class282_sub35, i, 407024022);
		}
	}

	void method7107(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7089(class282_sub35, i, 44760278);
		}
	}

	void method7108(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			((ItemDefinitions) this).anInt5036 = class282_sub35.readBigSmart(2069992418) * 809144059;
		else if (i == 2)
			aString5043 = class282_sub35.readString(903780710);
		else if (i == 4)
			anInt5042 = class282_sub35.readUnsignedShort() * 292917833;
		else if (i == 5)
			anInt5058 = class282_sub35.readUnsignedShort() * 492453963;
		else if (6 == i)
			anInt5045 = class282_sub35.readUnsignedShort() * 619430641;
		else if (i == 7) {
			anInt5063 = class282_sub35.readUnsignedShort() * 834650329;
			if (406372201 * anInt5063 > 32767)
				anInt5063 -= -1059520512;
		} else if (8 == i) {
			anInt5044 = class282_sub35.readUnsignedShort() * 870855977;
			if (-1316014311 * anInt5044 > 32767)
				anInt5044 -= 891879424;
		} else if (11 == i)
			anInt5049 = -1948887511;
		else if (i == 12)
			anInt5051 = class282_sub35.readInt() * 222766991;
		else if (i == 13)
			anInt5047 = class282_sub35.readUnsignedByte() * -1946123025;
		else if (14 == i)
			anInt5064 = class282_sub35.readUnsignedByte() * -247957423;
		else if (i == 16)
			aBool5052 = true;
		else if (i == 18)
			anInt5050 = class282_sub35.readUnsignedShort() * -173634739;
		else if (23 == i)
			((ItemDefinitions) this).anInt5066 = class282_sub35.readBigSmart(1999916302) * -342249107;
		else if (24 == i)
			((ItemDefinitions) this).anInt5100 = class282_sub35.readBigSmart(2027606530) * 178028511;
		else if (i == 25)
			((ItemDefinitions) this).anInt5075 = class282_sub35.readBigSmart(2076386735) * -1963342619;
		else if (26 == i)
			((ItemDefinitions) this).anInt5069 = class282_sub35.readBigSmart(2021745924) * -691157025;
		else if (i == 27)
			anInt5065 = class282_sub35.readUnsignedByte() * -1540246871;
		else if (i >= 30 && i < 35)
			aStringArray5053[i - 30] = class282_sub35.readString(592768644);
		else if (i >= 35 && i < 40)
			aStringArray5054[i - 35] = class282_sub35.readString(431400027);
		else if (i == 40) {
			int i_84_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aShortArray5038 = new short[i_84_];
			((ItemDefinitions) this).aShortArray5039 = new short[i_84_];
			for (int i_85_ = 0; i_85_ < i_84_; i_85_++) {
				((ItemDefinitions) this).aShortArray5038[i_85_] = (short) class282_sub35.readUnsignedShort();
				((ItemDefinitions) this).aShortArray5039[i_85_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_86_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aShortArray5041 = new short[i_86_];
			((ItemDefinitions) this).aShortArray5083 = new short[i_86_];
			for (int i_87_ = 0; i_87_ < i_86_; i_87_++) {
				((ItemDefinitions) this).aShortArray5041[i_87_] = (short) class282_sub35.readUnsignedShort();
				((ItemDefinitions) this).aShortArray5083[i_87_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_88_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aByteArray5037 = new byte[i_88_];
			for (int i_89_ = 0; i_89_ < i_88_; i_89_++)
				((ItemDefinitions) this).aByteArray5037[i_89_] = class282_sub35.readByte((short) -8338);
		} else if (i == 43) {
			anInt5102 = class282_sub35.readInt() * -796858641;
			aBool5101 = true;
		} else if (i == 65)
			aBool5085 = true;
		else if (78 == i)
			((ItemDefinitions) this).anInt5070 = class282_sub35.readBigSmart(2098997650) * -2110709183;
		else if (79 == i)
			((ItemDefinitions) this).anInt5071 = class282_sub35.readBigSmart(2081331629) * 1292119991;
		else if (90 == i)
			((ItemDefinitions) this).anInt5096 = class282_sub35.readBigSmart(1970793831) * -582979729;
		else if (91 == i)
			((ItemDefinitions) this).anInt5080 = class282_sub35.readBigSmart(2033366103) * -1176241203;
		else if (i == 92)
			((ItemDefinitions) this).anInt5079 = class282_sub35.readBigSmart(2008497368) * -18677607;
		else if (i == 93)
			((ItemDefinitions) this).anInt5081 = class282_sub35.readBigSmart(1965712262) * 1320781975;
		else if (i == 95)
			anInt5074 = class282_sub35.readUnsignedShort() * -1869642735;
		else if (96 == i)
			anInt5095 = class282_sub35.readUnsignedByte() * -676128457;
		else if (i == 97)
			anInt5084 = class282_sub35.readUnsignedShort() * 2048174935;
		else if (i == 98)
			anInt5078 = class282_sub35.readUnsignedShort() * 185661005;
		else if (i >= 100 && i < 110) {
			if (null == ((ItemDefinitions) this).anIntArray5082) {
				((ItemDefinitions) this).anIntArray5082 = new int[10];
				((ItemDefinitions) this).anIntArray5072 = new int[10];
			}
			((ItemDefinitions) this).anIntArray5082[i - 100] = class282_sub35.readUnsignedShort();
			((ItemDefinitions) this).anIntArray5072[i - 100] = class282_sub35.readUnsignedShort();
		} else if (i == 110)
			((ItemDefinitions) this).anInt5088 = class282_sub35.readUnsignedShort() * 1651983723;
		else if (i == 111)
			((ItemDefinitions) this).anInt5032 = class282_sub35.readUnsignedShort() * -868842689;
		else if (i == 112)
			((ItemDefinitions) this).anInt5090 = class282_sub35.readUnsignedShort() * 1983536873;
		else if (i == 113)
			((ItemDefinitions) this).anInt5067 = class282_sub35.readByte((short) -13318) * 259622629;
		else if (i == 114)
			((ItemDefinitions) this).anInt5092 = class282_sub35.readByte((short) -27082) * 1423227043;
		else if (i == 115)
			anInt5093 = class282_sub35.readUnsignedByte() * 1901746537;
		else if (121 == i)
			((ItemDefinitions) this).anInt5048 = class282_sub35.readUnsignedShort() * -68529475;
		else if (122 == i)
			anInt5068 = class282_sub35.readUnsignedShort() * -1862010471;
		else if (125 == i) {
			((ItemDefinitions) this).anInt5089 = ((class282_sub35.readByte((short) -19152) << 2) * 1904059659);
			((ItemDefinitions) this).anInt5094 = ((class282_sub35.readByte((short) -18127) << 2) * -547377553);
			((ItemDefinitions) this).anInt5076 = ((class282_sub35.readByte((short) -31122) << 2) * 1878832413);
		} else if (i == 126) {
			((ItemDefinitions) this).anInt5073 = ((class282_sub35.readByte((short) -22851) << 2) * 1252496961);
			((ItemDefinitions) this).anInt5091 = ((class282_sub35.readByte((short) -21777) << 2) * -377946013);
			((ItemDefinitions) this).anInt5077 = ((class282_sub35.readByte((short) -21178) << 2) * 1444840851);
		} else if (127 == i) {
			anInt5059 = class282_sub35.readUnsignedByte() * 1898017081;
			anInt5055 = class282_sub35.readUnsignedShort() * -1370939175;
		} else if (i == 128) {
			anInt5060 = class282_sub35.readUnsignedByte() * 930264291;
			anInt5056 = class282_sub35.readUnsignedShort() * 2036382095;
		} else if (i == 129) {
			anInt5061 = class282_sub35.readUnsignedByte() * -1908691611;
			anInt5062 = class282_sub35.readUnsignedShort() * 988221655;
		} else if (i == 130) {
			anInt5030 = class282_sub35.readUnsignedByte() * -1151562079;
			anInt5031 = class282_sub35.readUnsignedShort() * -149100495;
		} else if (132 == i) {
			int i_90_ = class282_sub35.readUnsignedByte();
			anIntArray5097 = new int[i_90_];
			for (int i_91_ = 0; i_91_ < i_90_; i_91_++)
				anIntArray5097[i_91_] = class282_sub35.readUnsignedShort();
		} else if (i == 134)
			anInt5098 = class282_sub35.readUnsignedByte() * -179097779;
		else if (i == 139)
			((ItemDefinitions) this).anInt5099 = class282_sub35.readUnsignedShort() * 1174980021;
		else if (i == 140)
			anInt5046 = class282_sub35.readUnsignedShort() * 1638301585;
		else if (249 == i) {
			int i_92_ = class282_sub35.readUnsignedByte();
			if (null == ((ItemDefinitions) this).aClass465_5040) {
				int i_93_ = Class323.nextPowerOfTwo(i_92_, 514687479);
				((ItemDefinitions) this).aClass465_5040 = new SwitchMap(i_93_);
			}
			for (int i_94_ = 0; i_94_ < i_92_; i_94_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_95_ = class282_sub35.read24BitUnsignedInteger((short) 29728);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(674137210));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((ItemDefinitions) this).aClass465_5040.method7765(class282, (long) i_95_);
			}
		}
	}

	void method7109(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			((ItemDefinitions) this).anInt5036 = class282_sub35.readBigSmart(2138681561) * 809144059;
		else if (i == 2)
			aString5043 = class282_sub35.readString(1535319803);
		else if (i == 4)
			anInt5042 = class282_sub35.readUnsignedShort() * 292917833;
		else if (i == 5)
			anInt5058 = class282_sub35.readUnsignedShort() * 492453963;
		else if (6 == i)
			anInt5045 = class282_sub35.readUnsignedShort() * 619430641;
		else if (i == 7) {
			anInt5063 = class282_sub35.readUnsignedShort() * 834650329;
			if (406372201 * anInt5063 > 32767)
				anInt5063 -= -1059520512;
		} else if (8 == i) {
			anInt5044 = class282_sub35.readUnsignedShort() * 870855977;
			if (-1316014311 * anInt5044 > 32767)
				anInt5044 -= 891879424;
		} else if (11 == i)
			anInt5049 = -1948887511;
		else if (i == 12)
			anInt5051 = class282_sub35.readInt() * 222766991;
		else if (i == 13)
			anInt5047 = class282_sub35.readUnsignedByte() * -1946123025;
		else if (14 == i)
			anInt5064 = class282_sub35.readUnsignedByte() * -247957423;
		else if (i == 16)
			aBool5052 = true;
		else if (i == 18)
			anInt5050 = class282_sub35.readUnsignedShort() * -173634739;
		else if (23 == i)
			((ItemDefinitions) this).anInt5066 = class282_sub35.readBigSmart(2132621994) * -342249107;
		else if (24 == i)
			((ItemDefinitions) this).anInt5100 = class282_sub35.readBigSmart(2036805398) * 178028511;
		else if (i == 25)
			((ItemDefinitions) this).anInt5075 = class282_sub35.readBigSmart(2062436740) * -1963342619;
		else if (26 == i)
			((ItemDefinitions) this).anInt5069 = class282_sub35.readBigSmart(2117566805) * -691157025;
		else if (i == 27)
			anInt5065 = class282_sub35.readUnsignedByte() * -1540246871;
		else if (i >= 30 && i < 35)
			aStringArray5053[i - 30] = class282_sub35.readString(1780430937);
		else if (i >= 35 && i < 40)
			aStringArray5054[i - 35] = class282_sub35.readString(751002761);
		else if (i == 40) {
			int i_96_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aShortArray5038 = new short[i_96_];
			((ItemDefinitions) this).aShortArray5039 = new short[i_96_];
			for (int i_97_ = 0; i_97_ < i_96_; i_97_++) {
				((ItemDefinitions) this).aShortArray5038[i_97_] = (short) class282_sub35.readUnsignedShort();
				((ItemDefinitions) this).aShortArray5039[i_97_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_98_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aShortArray5041 = new short[i_98_];
			((ItemDefinitions) this).aShortArray5083 = new short[i_98_];
			for (int i_99_ = 0; i_99_ < i_98_; i_99_++) {
				((ItemDefinitions) this).aShortArray5041[i_99_] = (short) class282_sub35.readUnsignedShort();
				((ItemDefinitions) this).aShortArray5083[i_99_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_100_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aByteArray5037 = new byte[i_100_];
			for (int i_101_ = 0; i_101_ < i_100_; i_101_++)
				((ItemDefinitions) this).aByteArray5037[i_101_] = class282_sub35.readByte((short) -5416);
		} else if (i == 43) {
			anInt5102 = class282_sub35.readInt() * -796858641;
			aBool5101 = true;
		} else if (i == 65)
			aBool5085 = true;
		else if (78 == i)
			((ItemDefinitions) this).anInt5070 = class282_sub35.readBigSmart(2065235621) * -2110709183;
		else if (79 == i)
			((ItemDefinitions) this).anInt5071 = class282_sub35.readBigSmart(2023655868) * 1292119991;
		else if (90 == i)
			((ItemDefinitions) this).anInt5096 = class282_sub35.readBigSmart(2016661770) * -582979729;
		else if (91 == i)
			((ItemDefinitions) this).anInt5080 = class282_sub35.readBigSmart(2141388915) * -1176241203;
		else if (i == 92)
			((ItemDefinitions) this).anInt5079 = class282_sub35.readBigSmart(2136056303) * -18677607;
		else if (i == 93)
			((ItemDefinitions) this).anInt5081 = class282_sub35.readBigSmart(2010137128) * 1320781975;
		else if (i == 95)
			anInt5074 = class282_sub35.readUnsignedShort() * -1869642735;
		else if (96 == i)
			anInt5095 = class282_sub35.readUnsignedByte() * -676128457;
		else if (i == 97)
			anInt5084 = class282_sub35.readUnsignedShort() * 2048174935;
		else if (i == 98)
			anInt5078 = class282_sub35.readUnsignedShort() * 185661005;
		else if (i >= 100 && i < 110) {
			if (null == ((ItemDefinitions) this).anIntArray5082) {
				((ItemDefinitions) this).anIntArray5082 = new int[10];
				((ItemDefinitions) this).anIntArray5072 = new int[10];
			}
			((ItemDefinitions) this).anIntArray5082[i - 100] = class282_sub35.readUnsignedShort();
			((ItemDefinitions) this).anIntArray5072[i - 100] = class282_sub35.readUnsignedShort();
		} else if (i == 110)
			((ItemDefinitions) this).anInt5088 = class282_sub35.readUnsignedShort() * 1651983723;
		else if (i == 111)
			((ItemDefinitions) this).anInt5032 = class282_sub35.readUnsignedShort() * -868842689;
		else if (i == 112)
			((ItemDefinitions) this).anInt5090 = class282_sub35.readUnsignedShort() * 1983536873;
		else if (i == 113)
			((ItemDefinitions) this).anInt5067 = class282_sub35.readByte((short) -21948) * 259622629;
		else if (i == 114)
			((ItemDefinitions) this).anInt5092 = class282_sub35.readByte((short) -20765) * 1423227043;
		else if (i == 115)
			anInt5093 = class282_sub35.readUnsignedByte() * 1901746537;
		else if (121 == i)
			((ItemDefinitions) this).anInt5048 = class282_sub35.readUnsignedShort() * -68529475;
		else if (122 == i)
			anInt5068 = class282_sub35.readUnsignedShort() * -1862010471;
		else if (125 == i) {
			((ItemDefinitions) this).anInt5089 = ((class282_sub35.readByte((short) -25961) << 2) * 1904059659);
			((ItemDefinitions) this).anInt5094 = ((class282_sub35.readByte((short) -6817) << 2) * -547377553);
			((ItemDefinitions) this).anInt5076 = ((class282_sub35.readByte((short) -9918) << 2) * 1878832413);
		} else if (i == 126) {
			((ItemDefinitions) this).anInt5073 = ((class282_sub35.readByte((short) -26333) << 2) * 1252496961);
			((ItemDefinitions) this).anInt5091 = ((class282_sub35.readByte((short) -12150) << 2) * -377946013);
			((ItemDefinitions) this).anInt5077 = ((class282_sub35.readByte((short) -23454) << 2) * 1444840851);
		} else if (127 == i) {
			anInt5059 = class282_sub35.readUnsignedByte() * 1898017081;
			anInt5055 = class282_sub35.readUnsignedShort() * -1370939175;
		} else if (i == 128) {
			anInt5060 = class282_sub35.readUnsignedByte() * 930264291;
			anInt5056 = class282_sub35.readUnsignedShort() * 2036382095;
		} else if (i == 129) {
			anInt5061 = class282_sub35.readUnsignedByte() * -1908691611;
			anInt5062 = class282_sub35.readUnsignedShort() * 988221655;
		} else if (i == 130) {
			anInt5030 = class282_sub35.readUnsignedByte() * -1151562079;
			anInt5031 = class282_sub35.readUnsignedShort() * -149100495;
		} else if (132 == i) {
			int i_102_ = class282_sub35.readUnsignedByte();
			anIntArray5097 = new int[i_102_];
			for (int i_103_ = 0; i_103_ < i_102_; i_103_++)
				anIntArray5097[i_103_] = class282_sub35.readUnsignedShort();
		} else if (i == 134)
			anInt5098 = class282_sub35.readUnsignedByte() * -179097779;
		else if (i == 139)
			((ItemDefinitions) this).anInt5099 = class282_sub35.readUnsignedShort() * 1174980021;
		else if (i == 140)
			anInt5046 = class282_sub35.readUnsignedShort() * 1638301585;
		else if (249 == i) {
			int i_104_ = class282_sub35.readUnsignedByte();
			if (null == ((ItemDefinitions) this).aClass465_5040) {
				int i_105_ = Class323.nextPowerOfTwo(i_104_, -726832861);
				((ItemDefinitions) this).aClass465_5040 = new SwitchMap(i_105_);
			}
			for (int i_106_ = 0; i_106_ < i_104_; i_106_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_107_ = class282_sub35.read24BitUnsignedInteger((short) 13322);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(741077931));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((ItemDefinitions) this).aClass465_5040.method7765(class282, (long) i_107_);
			}
		}
	}

	void method7110(int[] is, int i) {
		for (int i_108_ = 31; i_108_ > 0; i_108_--) {
			int i_109_ = i_108_ * 36;
			for (int i_110_ = 35; i_110_ > 0; i_110_--) {
				if (0 == is[i_110_ + i_109_] && is[i_110_ + i_109_ - 1 - 36] != 0)
					is[i_109_ + i_110_] = i;
			}
		}
	}

	void method7111(ItemDefinitions class425_111_, ItemDefinitions class425_112_) {
		((ItemDefinitions) this).anInt5036 = 1 * ((ItemDefinitions) class425_111_).anInt5036;
		anInt5042 = 1 * class425_111_.anInt5042;
		anInt5058 = 1 * class425_111_.anInt5058;
		anInt5045 = class425_111_.anInt5045 * 1;
		anInt5074 = class425_111_.anInt5074 * 1;
		anInt5063 = 1 * class425_111_.anInt5063;
		anInt5044 = class425_111_.anInt5044 * 1;
		((ItemDefinitions) this).aShortArray5038 = ((ItemDefinitions) class425_111_).aShortArray5038;
		((ItemDefinitions) this).aShortArray5039 = ((ItemDefinitions) class425_111_).aShortArray5039;
		((ItemDefinitions) this).aByteArray5037 = ((ItemDefinitions) class425_111_).aByteArray5037;
		((ItemDefinitions) this).aShortArray5041 = ((ItemDefinitions) class425_111_).aShortArray5041;
		((ItemDefinitions) this).aShortArray5083 = ((ItemDefinitions) class425_111_).aShortArray5083;
		aString5043 = class425_112_.aString5043;
		aBool5052 = class425_112_.aBool5052;
		anInt5051 = 1 * class425_112_.anInt5051;
		anInt5049 = -1948887511;
	}

	public ItemDefinitions method7112(int i) {
		if (((ItemDefinitions) this).anIntArray5082 != null && i > 1) {
			int i_113_ = -1;
			for (int i_114_ = 0; i_114_ < 10; i_114_++) {
				if (i >= ((ItemDefinitions) this).anIntArray5072[i_114_] && ((ItemDefinitions) this).anIntArray5072[i_114_] != 0)
					i_113_ = ((ItemDefinitions) this).anIntArray5082[i_114_];
			}
			if (-1 != i_113_)
				return ((ItemDefinitions) this).aClass426_5034.getItemDefinitions(i_113_, 1691966568);
		}
		return this;
	}

	void method7113(ItemDefinitions class425_115_, ItemDefinitions class425_116_) {
		((ItemDefinitions) this).anInt5036 = 1 * ((ItemDefinitions) class425_115_).anInt5036;
		anInt5042 = 1 * class425_115_.anInt5042;
		anInt5058 = 1 * class425_115_.anInt5058;
		anInt5045 = class425_115_.anInt5045 * 1;
		anInt5074 = class425_115_.anInt5074 * 1;
		anInt5063 = 1 * class425_115_.anInt5063;
		anInt5044 = class425_115_.anInt5044 * 1;
		((ItemDefinitions) this).aShortArray5038 = ((ItemDefinitions) class425_115_).aShortArray5038;
		((ItemDefinitions) this).aShortArray5039 = ((ItemDefinitions) class425_115_).aShortArray5039;
		((ItemDefinitions) this).aByteArray5037 = ((ItemDefinitions) class425_115_).aByteArray5037;
		((ItemDefinitions) this).aShortArray5041 = ((ItemDefinitions) class425_115_).aShortArray5041;
		((ItemDefinitions) this).aShortArray5083 = ((ItemDefinitions) class425_115_).aShortArray5083;
		aString5043 = class425_116_.aString5043;
		aBool5052 = class425_116_.aBool5052;
		anInt5051 = 1 * class425_116_.anInt5051;
		anInt5049 = -1948887511;
	}

	void method7114(ItemDefinitions class425_117_, ItemDefinitions class425_118_) {
		anInt5051 = 0;
		((ItemDefinitions) this).anInt5036 = 1 * ((ItemDefinitions) class425_117_).anInt5036;
		anInt5042 = class425_117_.anInt5042 * 1;
		anInt5058 = 1 * class425_117_.anInt5058;
		anInt5045 = 1 * class425_117_.anInt5045;
		anInt5074 = 1 * class425_117_.anInt5074;
		anInt5063 = class425_117_.anInt5063 * 1;
		anInt5044 = 1 * class425_117_.anInt5044;
		((ItemDefinitions) this).aShortArray5038 = ((ItemDefinitions) class425_118_).aShortArray5038;
		((ItemDefinitions) this).aShortArray5039 = ((ItemDefinitions) class425_118_).aShortArray5039;
		((ItemDefinitions) this).aByteArray5037 = ((ItemDefinitions) class425_118_).aByteArray5037;
		((ItemDefinitions) this).aShortArray5041 = ((ItemDefinitions) class425_118_).aShortArray5041;
		((ItemDefinitions) this).aShortArray5083 = ((ItemDefinitions) class425_118_).aShortArray5083;
		aString5043 = class425_118_.aString5043;
		aBool5052 = class425_118_.aBool5052;
		anInt5047 = 1 * class425_118_.anInt5047;
		anInt5064 = 1 * class425_118_.anInt5064;
		anInt5065 = class425_118_.anInt5065 * 1;
		((ItemDefinitions) this).anInt5066 = 1 * ((ItemDefinitions) class425_118_).anInt5066;
		((ItemDefinitions) this).anInt5100 = 1 * ((ItemDefinitions) class425_118_).anInt5100;
		((ItemDefinitions) this).anInt5070 = ((ItemDefinitions) class425_118_).anInt5070 * 1;
		((ItemDefinitions) this).anInt5075 = 1 * ((ItemDefinitions) class425_118_).anInt5075;
		((ItemDefinitions) this).anInt5069 = 1 * ((ItemDefinitions) class425_118_).anInt5069;
		((ItemDefinitions) this).anInt5071 = 1 * ((ItemDefinitions) class425_118_).anInt5071;
		((ItemDefinitions) this).anInt5089 = 1 * ((ItemDefinitions) class425_118_).anInt5089;
		((ItemDefinitions) this).anInt5073 = ((ItemDefinitions) class425_118_).anInt5073 * 1;
		((ItemDefinitions) this).anInt5094 = 1 * ((ItemDefinitions) class425_118_).anInt5094;
		((ItemDefinitions) this).anInt5091 = ((ItemDefinitions) class425_118_).anInt5091 * 1;
		((ItemDefinitions) this).anInt5076 = ((ItemDefinitions) class425_118_).anInt5076 * 1;
		((ItemDefinitions) this).anInt5077 = 1 * ((ItemDefinitions) class425_118_).anInt5077;
		((ItemDefinitions) this).anInt5096 = ((ItemDefinitions) class425_118_).anInt5096 * 1;
		((ItemDefinitions) this).anInt5079 = ((ItemDefinitions) class425_118_).anInt5079 * 1;
		((ItemDefinitions) this).anInt5080 = ((ItemDefinitions) class425_118_).anInt5080 * 1;
		((ItemDefinitions) this).anInt5081 = 1 * ((ItemDefinitions) class425_118_).anInt5081;
		anInt5093 = class425_118_.anInt5093 * 1;
		aStringArray5053 = class425_118_.aStringArray5053;
		((ItemDefinitions) this).aClass465_5040 = ((ItemDefinitions) class425_118_).aClass465_5040;
		aStringArray5054 = new String[5];
		if (null != class425_118_.aStringArray5054) {
			for (int i = 0; i < 4; i++)
				aStringArray5054[i] = class425_118_.aStringArray5054[i];
		}
		aStringArray5054[4] = Class433.aClass433_5165.method7273((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass495_5104), -570724601);
	}

	void method7115(ItemDefinitions class425_119_, ItemDefinitions class425_120_) {
		anInt5051 = 0;
		((ItemDefinitions) this).anInt5036 = ((ItemDefinitions) class425_119_).anInt5036 * 1;
		anInt5042 = 1 * class425_119_.anInt5042;
		anInt5058 = 1 * class425_119_.anInt5058;
		anInt5045 = class425_119_.anInt5045 * 1;
		anInt5074 = 1 * class425_119_.anInt5074;
		anInt5063 = class425_119_.anInt5063 * 1;
		anInt5044 = 1 * class425_119_.anInt5044;
		((ItemDefinitions) this).aShortArray5038 = ((ItemDefinitions) class425_120_).aShortArray5038;
		((ItemDefinitions) this).aShortArray5039 = ((ItemDefinitions) class425_120_).aShortArray5039;
		((ItemDefinitions) this).aByteArray5037 = ((ItemDefinitions) class425_120_).aByteArray5037;
		((ItemDefinitions) this).aShortArray5041 = ((ItemDefinitions) class425_120_).aShortArray5041;
		((ItemDefinitions) this).aShortArray5083 = ((ItemDefinitions) class425_120_).aShortArray5083;
		aString5043 = class425_120_.aString5043;
		aBool5052 = class425_120_.aBool5052;
		anInt5047 = 1 * class425_120_.anInt5047;
		anInt5064 = 1 * class425_120_.anInt5064;
		anInt5065 = class425_120_.anInt5065 * 1;
		((ItemDefinitions) this).anInt5066 = 1 * ((ItemDefinitions) class425_120_).anInt5066;
		((ItemDefinitions) this).anInt5100 = 1 * ((ItemDefinitions) class425_120_).anInt5100;
		((ItemDefinitions) this).anInt5070 = ((ItemDefinitions) class425_120_).anInt5070 * 1;
		((ItemDefinitions) this).anInt5075 = ((ItemDefinitions) class425_120_).anInt5075 * 1;
		((ItemDefinitions) this).anInt5069 = ((ItemDefinitions) class425_120_).anInt5069 * 1;
		((ItemDefinitions) this).anInt5071 = ((ItemDefinitions) class425_120_).anInt5071 * 1;
		((ItemDefinitions) this).anInt5089 = 1 * ((ItemDefinitions) class425_120_).anInt5089;
		((ItemDefinitions) this).anInt5073 = ((ItemDefinitions) class425_120_).anInt5073 * 1;
		((ItemDefinitions) this).anInt5094 = ((ItemDefinitions) class425_120_).anInt5094 * 1;
		((ItemDefinitions) this).anInt5091 = 1 * ((ItemDefinitions) class425_120_).anInt5091;
		((ItemDefinitions) this).anInt5076 = 1 * ((ItemDefinitions) class425_120_).anInt5076;
		((ItemDefinitions) this).anInt5077 = ((ItemDefinitions) class425_120_).anInt5077 * 1;
		((ItemDefinitions) this).anInt5096 = ((ItemDefinitions) class425_120_).anInt5096 * 1;
		((ItemDefinitions) this).anInt5079 = ((ItemDefinitions) class425_120_).anInt5079 * 1;
		((ItemDefinitions) this).anInt5080 = ((ItemDefinitions) class425_120_).anInt5080 * 1;
		((ItemDefinitions) this).anInt5081 = ((ItemDefinitions) class425_120_).anInt5081 * 1;
		anInt5093 = class425_120_.anInt5093 * 1;
		aStringArray5053 = class425_120_.aStringArray5053;
		((ItemDefinitions) this).aClass465_5040 = ((ItemDefinitions) class425_120_).aClass465_5040;
		anInt5049 = 1 * class425_120_.anInt5049;
		aStringArray5054 = new String[5];
		if (null != class425_120_.aStringArray5054) {
			for (int i = 0; i < 4; i++)
				aStringArray5054[i] = class425_120_.aStringArray5054[i];
		}
		aStringArray5054[4] = Class433.aClass433_5166.method7273((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass495_5104), -1489332883);
	}

	public final Class528 method7116(Class505 class505, int i, int i_121_, Class238 class238, Class456 class456, int i_122_, int i_123_, int i_124_, int i_125_) {
		if (((ItemDefinitions) this).anIntArray5082 != null && i_121_ > 1) {
			int i_126_ = -1;
			for (int i_127_ = 0; i_127_ < 10; i_127_++) {
				if (i_121_ >= ((ItemDefinitions) this).anIntArray5072[i_127_] && 0 != ((ItemDefinitions) this).anIntArray5072[i_127_])
					i_126_ = ((ItemDefinitions) this).anIntArray5082[i_127_];
			}
			if (i_126_ != -1)
				return (((ItemDefinitions) this).aClass426_5034.getItemDefinitions(i_126_, 1606238731).method7084(class505, i, 1, class238, class456, i_122_, i_123_, i_124_, i_125_, (byte) 0));
		}
		int i_128_ = i;
		if (class456 != null)
			i_128_ |= class456.method7640(-1709277062);
		Class528 class528;
		synchronized (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115) {
			class528 = ((Class528) (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115.method3865((long) (1116898509 * ((ItemDefinitions) this).anInt5035 | class505.anInt5840 * -413843045 << 29))));
		}
		if (null == class528 || class505.method8452(class528.m(), i_128_) != 0) {
			if (null != class528)
				i_128_ = class505.method8546(i_128_, class528.m());
			int i_129_ = i_128_;
			if (((ItemDefinitions) this).aShortArray5041 != null)
				i_129_ |= 0x8000;
			if (((ItemDefinitions) this).aShortArray5038 != null || class238 != null)
				i_129_ |= 0x4000;
			if (128 != ((ItemDefinitions) this).anInt5088 * -1149583549)
				i_129_ |= 0x1;
			if (-1149583549 * ((ItemDefinitions) this).anInt5088 != 128)
				i_129_ |= 0x2;
			if (((ItemDefinitions) this).anInt5088 * -1149583549 != 128)
				i_129_ |= 0x4;
			Class157 class157 = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), (-1002877901 * ((ItemDefinitions) this).anInt5036), 0);
			if (class157 == null)
				return null;
			if (class157.anInt1986 < 13)
				class157.method2679(2);
			class528 = (class505.method8451(class157, i_129_, 924631903 * (((Class426) ((ItemDefinitions) this).aClass426_5034).anInt5116), 64 + ((ItemDefinitions) this).anInt5067 * -235550995, 850 + 1381934903 * ((ItemDefinitions) this).anInt5092));
			if (128 != -1149583549 * ((ItemDefinitions) this).anInt5088 || 128 != ((ItemDefinitions) this).anInt5032 * -1507136321 || 128 != ((ItemDefinitions) this).anInt5090 * 256268633)
				class528.oa(((ItemDefinitions) this).anInt5088 * -1149583549, ((ItemDefinitions) this).anInt5032 * -1507136321, ((ItemDefinitions) this).anInt5090 * 256268633);
			if (null != ((ItemDefinitions) this).aShortArray5038) {
				for (int i_130_ = 0; i_130_ < ((ItemDefinitions) this).aShortArray5038.length; i_130_++) {
					if (((ItemDefinitions) this).aByteArray5037 != null && i_130_ < ((ItemDefinitions) this).aByteArray5037.length)
						class528.X(((ItemDefinitions) this).aShortArray5038[i_130_], (aShortArray5086[(((ItemDefinitions) this).aByteArray5037[i_130_] & 0xff)]));
					else
						class528.X(((ItemDefinitions) this).aShortArray5038[i_130_], ((ItemDefinitions) this).aShortArray5039[i_130_]);
				}
			}
			if (((ItemDefinitions) this).aShortArray5041 != null) {
				for (int i_131_ = 0; i_131_ < ((ItemDefinitions) this).aShortArray5041.length; i_131_++)
					class528.W(((ItemDefinitions) this).aShortArray5041[i_131_], ((ItemDefinitions) this).aShortArray5083[i_131_]);
			}
			if (null != class238) {
				for (int i_132_ = 0; i_132_ < 10; i_132_++) {
					for (int i_133_ = 0; i_133_ < (AbstractQueue_Sub1.aShortArrayArray10068[i_132_]).length; i_133_++) {
						if (class238.anIntArray2923[i_132_] < (Class366.aShortArrayArrayArray4232[i_132_][i_133_]).length)
							class528.X((AbstractQueue_Sub1.aShortArrayArray10068[i_132_][i_133_]), (Class366.aShortArrayArrayArray4232[i_132_][i_133_][class238.anIntArray2923[i_132_]]));
					}
				}
			}
			class528.KA(i_128_);
			synchronized (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115) {
				((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115.method3856(class528, (long) (((ItemDefinitions) this).anInt5035 * 1116898509 | class505.anInt5840 * -413843045 << 29));
			}
		}
		if (null != class456 || 0 != i_125_) {
			class528 = class528.method11289((byte) 1, i_128_, true);
			if (class456 != null)
				class456.method7577(class528, 0, 16711935);
			if (i_125_ != 0)
				class528.PA(i_122_, i_123_, i_124_, i_125_);
		}
		class528.KA(i);
		return class528;
	}

	public final Class528 method7117(Class505 class505, int i, int i_134_, Class238 class238, Class456 class456, int i_135_, int i_136_, int i_137_, int i_138_) {
		if (((ItemDefinitions) this).anIntArray5082 != null && i_134_ > 1) {
			int i_139_ = -1;
			for (int i_140_ = 0; i_140_ < 10; i_140_++) {
				if (i_134_ >= ((ItemDefinitions) this).anIntArray5072[i_140_] && 0 != ((ItemDefinitions) this).anIntArray5072[i_140_])
					i_139_ = ((ItemDefinitions) this).anIntArray5082[i_140_];
			}
			if (i_139_ != -1)
				return (((ItemDefinitions) this).aClass426_5034.getItemDefinitions(i_139_, 103166089).method7084(class505, i, 1, class238, class456, i_135_, i_136_, i_137_, i_138_, (byte) 0));
		}
		int i_141_ = i;
		if (class456 != null)
			i_141_ |= class456.method7640(-1014418059);
		Class528 class528;
		synchronized (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115) {
			class528 = ((Class528) (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115.method3865((long) (1116898509 * ((ItemDefinitions) this).anInt5035 | class505.anInt5840 * -413843045 << 29))));
		}
		if (null == class528 || class505.method8452(class528.m(), i_141_) != 0) {
			if (null != class528)
				i_141_ = class505.method8546(i_141_, class528.m());
			int i_142_ = i_141_;
			if (((ItemDefinitions) this).aShortArray5041 != null)
				i_142_ |= 0x8000;
			if (((ItemDefinitions) this).aShortArray5038 != null || class238 != null)
				i_142_ |= 0x4000;
			if (128 != ((ItemDefinitions) this).anInt5088 * -1149583549)
				i_142_ |= 0x1;
			if (-1149583549 * ((ItemDefinitions) this).anInt5088 != 128)
				i_142_ |= 0x2;
			if (((ItemDefinitions) this).anInt5088 * -1149583549 != 128)
				i_142_ |= 0x4;
			Class157 class157 = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), (-1002877901 * ((ItemDefinitions) this).anInt5036), 0);
			if (class157 == null)
				return null;
			if (class157.anInt1986 < 13)
				class157.method2679(2);
			class528 = (class505.method8451(class157, i_142_, 924631903 * (((Class426) ((ItemDefinitions) this).aClass426_5034).anInt5116), 64 + ((ItemDefinitions) this).anInt5067 * -235550995, 850 + 1381934903 * ((ItemDefinitions) this).anInt5092));
			if (128 != -1149583549 * ((ItemDefinitions) this).anInt5088 || 128 != ((ItemDefinitions) this).anInt5032 * -1507136321 || 128 != ((ItemDefinitions) this).anInt5090 * 256268633)
				class528.oa(((ItemDefinitions) this).anInt5088 * -1149583549, ((ItemDefinitions) this).anInt5032 * -1507136321, ((ItemDefinitions) this).anInt5090 * 256268633);
			if (null != ((ItemDefinitions) this).aShortArray5038) {
				for (int i_143_ = 0; i_143_ < ((ItemDefinitions) this).aShortArray5038.length; i_143_++) {
					if (((ItemDefinitions) this).aByteArray5037 != null && i_143_ < ((ItemDefinitions) this).aByteArray5037.length)
						class528.X(((ItemDefinitions) this).aShortArray5038[i_143_], (aShortArray5086[(((ItemDefinitions) this).aByteArray5037[i_143_] & 0xff)]));
					else
						class528.X(((ItemDefinitions) this).aShortArray5038[i_143_], ((ItemDefinitions) this).aShortArray5039[i_143_]);
				}
			}
			if (((ItemDefinitions) this).aShortArray5041 != null) {
				for (int i_144_ = 0; i_144_ < ((ItemDefinitions) this).aShortArray5041.length; i_144_++)
					class528.W(((ItemDefinitions) this).aShortArray5041[i_144_], ((ItemDefinitions) this).aShortArray5083[i_144_]);
			}
			if (null != class238) {
				for (int i_145_ = 0; i_145_ < 10; i_145_++) {
					for (int i_146_ = 0; i_146_ < (AbstractQueue_Sub1.aShortArrayArray10068[i_145_]).length; i_146_++) {
						if (class238.anIntArray2923[i_145_] < (Class366.aShortArrayArrayArray4232[i_145_][i_146_]).length)
							class528.X((AbstractQueue_Sub1.aShortArrayArray10068[i_145_][i_146_]), (Class366.aShortArrayArrayArray4232[i_145_][i_146_][class238.anIntArray2923[i_145_]]));
					}
				}
			}
			class528.KA(i_141_);
			synchronized (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115) {
				((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115.method3856(class528, (long) (((ItemDefinitions) this).anInt5035 * 1116898509 | class505.anInt5840 * -413843045 << 29));
			}
		}
		if (null != class456 || 0 != i_138_) {
			class528 = class528.method11289((byte) 1, i_141_, true);
			if (class456 != null)
				class456.method7577(class528, 0, 16711935);
			if (i_138_ != 0)
				class528.PA(i_135_, i_136_, i_137_, i_138_);
		}
		class528.KA(i);
		return class528;
	}

	public final Class528 method7118(Class505 class505, int i, int i_147_, Class238 class238, Class456 class456, int i_148_, int i_149_, int i_150_, int i_151_) {
		if (((ItemDefinitions) this).anIntArray5082 != null && i_147_ > 1) {
			int i_152_ = -1;
			for (int i_153_ = 0; i_153_ < 10; i_153_++) {
				if (i_147_ >= ((ItemDefinitions) this).anIntArray5072[i_153_] && 0 != ((ItemDefinitions) this).anIntArray5072[i_153_])
					i_152_ = ((ItemDefinitions) this).anIntArray5082[i_153_];
			}
			if (i_152_ != -1)
				return (((ItemDefinitions) this).aClass426_5034.getItemDefinitions(i_152_, 656081341).method7084(class505, i, 1, class238, class456, i_148_, i_149_, i_150_, i_151_, (byte) 0));
		}
		int i_154_ = i;
		if (class456 != null)
			i_154_ |= class456.method7640(-1822843129);
		Class528 class528;
		synchronized (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115) {
			class528 = ((Class528) (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115.method3865((long) (1116898509 * ((ItemDefinitions) this).anInt5035 | class505.anInt5840 * -413843045 << 29))));
		}
		if (null == class528 || class505.method8452(class528.m(), i_154_) != 0) {
			if (null != class528)
				i_154_ = class505.method8546(i_154_, class528.m());
			int i_155_ = i_154_;
			if (((ItemDefinitions) this).aShortArray5041 != null)
				i_155_ |= 0x8000;
			if (((ItemDefinitions) this).aShortArray5038 != null || class238 != null)
				i_155_ |= 0x4000;
			if (128 != ((ItemDefinitions) this).anInt5088 * -1149583549)
				i_155_ |= 0x1;
			if (-1149583549 * ((ItemDefinitions) this).anInt5088 != 128)
				i_155_ |= 0x2;
			if (((ItemDefinitions) this).anInt5088 * -1149583549 != 128)
				i_155_ |= 0x4;
			Class157 class157 = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), (-1002877901 * ((ItemDefinitions) this).anInt5036), 0);
			if (class157 == null)
				return null;
			if (class157.anInt1986 < 13)
				class157.method2679(2);
			class528 = (class505.method8451(class157, i_155_, 924631903 * (((Class426) ((ItemDefinitions) this).aClass426_5034).anInt5116), 64 + ((ItemDefinitions) this).anInt5067 * -235550995, 850 + 1381934903 * ((ItemDefinitions) this).anInt5092));
			if (128 != -1149583549 * ((ItemDefinitions) this).anInt5088 || 128 != ((ItemDefinitions) this).anInt5032 * -1507136321 || 128 != ((ItemDefinitions) this).anInt5090 * 256268633)
				class528.oa(((ItemDefinitions) this).anInt5088 * -1149583549, ((ItemDefinitions) this).anInt5032 * -1507136321, ((ItemDefinitions) this).anInt5090 * 256268633);
			if (null != ((ItemDefinitions) this).aShortArray5038) {
				for (int i_156_ = 0; i_156_ < ((ItemDefinitions) this).aShortArray5038.length; i_156_++) {
					if (((ItemDefinitions) this).aByteArray5037 != null && i_156_ < ((ItemDefinitions) this).aByteArray5037.length)
						class528.X(((ItemDefinitions) this).aShortArray5038[i_156_], (aShortArray5086[(((ItemDefinitions) this).aByteArray5037[i_156_] & 0xff)]));
					else
						class528.X(((ItemDefinitions) this).aShortArray5038[i_156_], ((ItemDefinitions) this).aShortArray5039[i_156_]);
				}
			}
			if (((ItemDefinitions) this).aShortArray5041 != null) {
				for (int i_157_ = 0; i_157_ < ((ItemDefinitions) this).aShortArray5041.length; i_157_++)
					class528.W(((ItemDefinitions) this).aShortArray5041[i_157_], ((ItemDefinitions) this).aShortArray5083[i_157_]);
			}
			if (null != class238) {
				for (int i_158_ = 0; i_158_ < 10; i_158_++) {
					for (int i_159_ = 0; i_159_ < (AbstractQueue_Sub1.aShortArrayArray10068[i_158_]).length; i_159_++) {
						if (class238.anIntArray2923[i_158_] < (Class366.aShortArrayArrayArray4232[i_158_][i_159_]).length)
							class528.X((AbstractQueue_Sub1.aShortArrayArray10068[i_158_][i_159_]), (Class366.aShortArrayArrayArray4232[i_158_][i_159_][class238.anIntArray2923[i_158_]]));
					}
				}
			}
			class528.KA(i_154_);
			synchronized (((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115) {
				((Class426) ((ItemDefinitions) this).aClass426_5034).aClass229_5115.method3856(class528, (long) (((ItemDefinitions) this).anInt5035 * 1116898509 | class505.anInt5840 * -413843045 << 29));
			}
		}
		if (null != class456 || 0 != i_151_) {
			class528 = class528.method11289((byte) 1, i_154_, true);
			if (class456 != null)
				class456.method7577(class528, 0, 16711935);
			if (i_151_ != 0)
				class528.PA(i_148_, i_149_, i_150_, i_151_);
		}
		class528.KA(i);
		return class528;
	}

	public final boolean method7119(boolean bool, ItemEffects class422) {
		int i;
		int i_160_;
		int i_161_;
		if (bool) {
			if (null != class422 && null != class422.anIntArray5021) {
				i = class422.anIntArray5021[0];
				i_160_ = class422.anIntArray5021[1];
				i_161_ = class422.anIntArray5021[2];
			} else {
				i = ((ItemDefinitions) this).anInt5075 * -2090968851;
				i_160_ = -1259031521 * ((ItemDefinitions) this).anInt5069;
				i_161_ = -1802576377 * ((ItemDefinitions) this).anInt5071;
			}
		} else if (class422 != null && null != class422.anIntArray5025) {
			i = class422.anIntArray5025[0];
			i_160_ = class422.anIntArray5025[1];
			i_161_ = class422.anIntArray5025[2];
		} else {
			i = -525270939 * ((ItemDefinitions) this).anInt5066;
			i_160_ = -931922913 * ((ItemDefinitions) this).anInt5100;
			i_161_ = ((ItemDefinitions) this).anInt5070 * -562041407;
		}
		if (i == -1)
			return true;
		boolean bool_162_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i, 0, 16711935))
			bool_162_ = false;
		if (i_160_ != -1 && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_160_, 0, 16711935))
			bool_162_ = false;
		if (i_161_ != -1 && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_161_, 0, 16711935))
			bool_162_ = false;
		return bool_162_;
	}

	int[] method7120(int[] is, int i, byte i_163_) {
		int[] is_164_ = new int[1152];
		int i_165_ = 0;
		for (int i_166_ = 0; i_166_ < 32; i_166_++) {
			for (int i_167_ = 0; i_167_ < 36; i_167_++) {
				int i_168_ = is[i_165_];
				if (0 == i_168_) {
					if (i_167_ > 0 && is[i_165_ - 1] != 0)
						i_168_ = i;
					else if (i_166_ > 0 && 0 != is[i_165_ - 36])
						i_168_ = i;
					else if (i_167_ < 35 && is[i_165_ + 1] != 0)
						i_168_ = i;
					else if (i_166_ < 31 && is[i_165_ + 36] != 0)
						i_168_ = i;
				}
				is_164_[i_165_++] = i_168_;
			}
		}
		return is_164_;
	}

	public final boolean method7121(boolean bool, ItemEffects class422) {
		int i;
		int i_169_;
		if (bool) {
			if (class422 != null && null != class422.anIntArray5023) {
				i = class422.anIntArray5023[0];
				i_169_ = class422.anIntArray5023[1];
			} else {
				i = -1705416443 * ((ItemDefinitions) this).anInt5080;
				i_169_ = ((ItemDefinitions) this).anInt5081 * -1871546585;
			}
		} else if (null != class422 && null != class422.anIntArray5022) {
			i = class422.anIntArray5022[0];
			i_169_ = class422.anIntArray5022[1];
		} else {
			i = ((ItemDefinitions) this).anInt5096 * -603336817;
			i_169_ = ((ItemDefinitions) this).anInt5079 * -613723223;
		}
		if (i == -1)
			return true;
		boolean bool_170_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i, 0, 16711935))
			bool_170_ = false;
		if (-1 != i_169_ && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_169_, 0, 16711935))
			bool_170_ = false;
		return bool_170_;
	}

	void method7122(int[] is, int i) {
		for (int i_171_ = 31; i_171_ > 0; i_171_--) {
			int i_172_ = i_171_ * 36;
			for (int i_173_ = 35; i_173_ > 0; i_173_--) {
				if (0 == is[i_173_ + i_172_] && is[i_173_ + i_172_ - 1 - 36] != 0)
					is[i_172_ + i_173_] = i;
			}
		}
	}

	void method7123(int[] is, int i) {
		for (int i_174_ = 31; i_174_ > 0; i_174_--) {
			int i_175_ = i_174_ * 36;
			for (int i_176_ = 35; i_176_ > 0; i_176_--) {
				if (0 == is[i_176_ + i_175_] && is[i_176_ + i_175_ - 1 - 36] != 0)
					is[i_175_ + i_176_] = i;
			}
		}
	}

	void method7124(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			((ItemDefinitions) this).anInt5036 = class282_sub35.readBigSmart(2088825995) * 809144059;
		else if (i == 2)
			aString5043 = class282_sub35.readString(590796485);
		else if (i == 4)
			anInt5042 = class282_sub35.readUnsignedShort() * 292917833;
		else if (i == 5)
			anInt5058 = class282_sub35.readUnsignedShort() * 492453963;
		else if (6 == i)
			anInt5045 = class282_sub35.readUnsignedShort() * 619430641;
		else if (i == 7) {
			anInt5063 = class282_sub35.readUnsignedShort() * 834650329;
			if (406372201 * anInt5063 > 32767)
				anInt5063 -= -1059520512;
		} else if (8 == i) {
			anInt5044 = class282_sub35.readUnsignedShort() * 870855977;
			if (-1316014311 * anInt5044 > 32767)
				anInt5044 -= 891879424;
		} else if (11 == i)
			anInt5049 = -1948887511;
		else if (i == 12)
			anInt5051 = class282_sub35.readInt() * 222766991;
		else if (i == 13)
			anInt5047 = class282_sub35.readUnsignedByte() * -1946123025;
		else if (14 == i)
			anInt5064 = class282_sub35.readUnsignedByte() * -247957423;
		else if (i == 16)
			aBool5052 = true;
		else if (i == 18)
			anInt5050 = class282_sub35.readUnsignedShort() * -173634739;
		else if (23 == i)
			((ItemDefinitions) this).anInt5066 = class282_sub35.readBigSmart(2066549433) * -342249107;
		else if (24 == i)
			((ItemDefinitions) this).anInt5100 = class282_sub35.readBigSmart(2033373630) * 178028511;
		else if (i == 25)
			((ItemDefinitions) this).anInt5075 = class282_sub35.readBigSmart(1967301335) * -1963342619;
		else if (26 == i)
			((ItemDefinitions) this).anInt5069 = class282_sub35.readBigSmart(1950083203) * -691157025;
		else if (i == 27)
			anInt5065 = class282_sub35.readUnsignedByte() * -1540246871;
		else if (i >= 30 && i < 35)
			aStringArray5053[i - 30] = class282_sub35.readString(1380430963);
		else if (i >= 35 && i < 40)
			aStringArray5054[i - 35] = class282_sub35.readString(1332596998);
		else if (i == 40) {
			int i_177_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aShortArray5038 = new short[i_177_];
			((ItemDefinitions) this).aShortArray5039 = new short[i_177_];
			for (int i_178_ = 0; i_178_ < i_177_; i_178_++) {
				((ItemDefinitions) this).aShortArray5038[i_178_] = (short) class282_sub35.readUnsignedShort();
				((ItemDefinitions) this).aShortArray5039[i_178_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_179_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aShortArray5041 = new short[i_179_];
			((ItemDefinitions) this).aShortArray5083 = new short[i_179_];
			for (int i_180_ = 0; i_180_ < i_179_; i_180_++) {
				((ItemDefinitions) this).aShortArray5041[i_180_] = (short) class282_sub35.readUnsignedShort();
				((ItemDefinitions) this).aShortArray5083[i_180_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_181_ = class282_sub35.readUnsignedByte();
			((ItemDefinitions) this).aByteArray5037 = new byte[i_181_];
			for (int i_182_ = 0; i_182_ < i_181_; i_182_++)
				((ItemDefinitions) this).aByteArray5037[i_182_] = class282_sub35.readByte((short) -3588);
		} else if (i == 43) {
			anInt5102 = class282_sub35.readInt() * -796858641;
			aBool5101 = true;
		} else if (i == 65)
			aBool5085 = true;
		else if (78 == i)
			((ItemDefinitions) this).anInt5070 = class282_sub35.readBigSmart(1969331632) * -2110709183;
		else if (79 == i)
			((ItemDefinitions) this).anInt5071 = class282_sub35.readBigSmart(1975690928) * 1292119991;
		else if (90 == i)
			((ItemDefinitions) this).anInt5096 = class282_sub35.readBigSmart(1999100525) * -582979729;
		else if (91 == i)
			((ItemDefinitions) this).anInt5080 = class282_sub35.readBigSmart(2000011489) * -1176241203;
		else if (i == 92)
			((ItemDefinitions) this).anInt5079 = class282_sub35.readBigSmart(1981936875) * -18677607;
		else if (i == 93)
			((ItemDefinitions) this).anInt5081 = class282_sub35.readBigSmart(2136611510) * 1320781975;
		else if (i == 95)
			anInt5074 = class282_sub35.readUnsignedShort() * -1869642735;
		else if (96 == i)
			anInt5095 = class282_sub35.readUnsignedByte() * -676128457;
		else if (i == 97)
			anInt5084 = class282_sub35.readUnsignedShort() * 2048174935;
		else if (i == 98)
			anInt5078 = class282_sub35.readUnsignedShort() * 185661005;
		else if (i >= 100 && i < 110) {
			if (null == ((ItemDefinitions) this).anIntArray5082) {
				((ItemDefinitions) this).anIntArray5082 = new int[10];
				((ItemDefinitions) this).anIntArray5072 = new int[10];
			}
			((ItemDefinitions) this).anIntArray5082[i - 100] = class282_sub35.readUnsignedShort();
			((ItemDefinitions) this).anIntArray5072[i - 100] = class282_sub35.readUnsignedShort();
		} else if (i == 110)
			((ItemDefinitions) this).anInt5088 = class282_sub35.readUnsignedShort() * 1651983723;
		else if (i == 111)
			((ItemDefinitions) this).anInt5032 = class282_sub35.readUnsignedShort() * -868842689;
		else if (i == 112)
			((ItemDefinitions) this).anInt5090 = class282_sub35.readUnsignedShort() * 1983536873;
		else if (i == 113)
			((ItemDefinitions) this).anInt5067 = class282_sub35.readByte((short) -4606) * 259622629;
		else if (i == 114)
			((ItemDefinitions) this).anInt5092 = class282_sub35.readByte((short) -3469) * 1423227043;
		else if (i == 115)
			anInt5093 = class282_sub35.readUnsignedByte() * 1901746537;
		else if (121 == i)
			((ItemDefinitions) this).anInt5048 = class282_sub35.readUnsignedShort() * -68529475;
		else if (122 == i)
			anInt5068 = class282_sub35.readUnsignedShort() * -1862010471;
		else if (125 == i) {
			((ItemDefinitions) this).anInt5089 = ((class282_sub35.readByte((short) -8764) << 2) * 1904059659);
			((ItemDefinitions) this).anInt5094 = ((class282_sub35.readByte((short) -12897) << 2) * -547377553);
			((ItemDefinitions) this).anInt5076 = ((class282_sub35.readByte((short) -10451) << 2) * 1878832413);
		} else if (i == 126) {
			((ItemDefinitions) this).anInt5073 = ((class282_sub35.readByte((short) -10245) << 2) * 1252496961);
			((ItemDefinitions) this).anInt5091 = ((class282_sub35.readByte((short) -7018) << 2) * -377946013);
			((ItemDefinitions) this).anInt5077 = ((class282_sub35.readByte((short) -23474) << 2) * 1444840851);
		} else if (127 == i) {
			anInt5059 = class282_sub35.readUnsignedByte() * 1898017081;
			anInt5055 = class282_sub35.readUnsignedShort() * -1370939175;
		} else if (i == 128) {
			anInt5060 = class282_sub35.readUnsignedByte() * 930264291;
			anInt5056 = class282_sub35.readUnsignedShort() * 2036382095;
		} else if (i == 129) {
			anInt5061 = class282_sub35.readUnsignedByte() * -1908691611;
			anInt5062 = class282_sub35.readUnsignedShort() * 988221655;
		} else if (i == 130) {
			anInt5030 = class282_sub35.readUnsignedByte() * -1151562079;
			anInt5031 = class282_sub35.readUnsignedShort() * -149100495;
		} else if (132 == i) {
			int i_183_ = class282_sub35.readUnsignedByte();
			anIntArray5097 = new int[i_183_];
			for (int i_184_ = 0; i_184_ < i_183_; i_184_++)
				anIntArray5097[i_184_] = class282_sub35.readUnsignedShort();
		} else if (i == 134)
			anInt5098 = class282_sub35.readUnsignedByte() * -179097779;
		else if (i == 139)
			((ItemDefinitions) this).anInt5099 = class282_sub35.readUnsignedShort() * 1174980021;
		else if (i == 140)
			anInt5046 = class282_sub35.readUnsignedShort() * 1638301585;
		else if (249 == i) {
			int i_185_ = class282_sub35.readUnsignedByte();
			if (null == ((ItemDefinitions) this).aClass465_5040) {
				int i_186_ = Class323.nextPowerOfTwo(i_185_, -1794749228);
				((ItemDefinitions) this).aClass465_5040 = new SwitchMap(i_186_);
			}
			for (int i_187_ = 0; i_187_ < i_185_; i_187_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_188_ = class282_sub35.read24BitUnsignedInteger((short) 8916);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(887239802));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((ItemDefinitions) this).aClass465_5040.method7765(class282, (long) i_188_);
			}
		}
	}

	int[] method7125(int[] is, int i) {
		int[] is_189_ = new int[1152];
		int i_190_ = 0;
		for (int i_191_ = 0; i_191_ < 32; i_191_++) {
			for (int i_192_ = 0; i_192_ < 36; i_192_++) {
				int i_193_ = is[i_190_];
				if (0 == i_193_) {
					if (i_192_ > 0 && is[i_190_ - 1] != 0)
						i_193_ = i;
					else if (i_191_ > 0 && 0 != is[i_190_ - 36])
						i_193_ = i;
					else if (i_192_ < 35 && is[i_190_ + 1] != 0)
						i_193_ = i;
					else if (i_191_ < 31 && is[i_190_ + 36] != 0)
						i_193_ = i;
				}
				is_189_[i_190_++] = i_193_;
			}
		}
		return is_189_;
	}

	static String method7126(int i, Class495 class495) {
		if (i < 100000)
			return new StringBuilder().append("<col=ffff00>").append(i).append("</col>").toString();
		if (i < 10000000)
			return new StringBuilder().append("<col=ffffff>").append(i / 1000).append(Class433.aClass433_5297.method7273(class495, -915912931)).append("</col>").toString();
		return new StringBuilder().append("<col=00ff80>").append(i / 1000000).append(Class433.aClass433_5304.method7273(class495, -1565915342)).append("</col>").toString();
	}

	public final boolean method7127(boolean bool, ItemEffects class422) {
		int i;
		int i_194_;
		int i_195_;
		if (bool) {
			if (null != class422 && null != class422.anIntArray5021) {
				i = class422.anIntArray5021[0];
				i_194_ = class422.anIntArray5021[1];
				i_195_ = class422.anIntArray5021[2];
			} else {
				i = ((ItemDefinitions) this).anInt5075 * -2090968851;
				i_194_ = -1259031521 * ((ItemDefinitions) this).anInt5069;
				i_195_ = -1802576377 * ((ItemDefinitions) this).anInt5071;
			}
		} else if (class422 != null && null != class422.anIntArray5025) {
			i = class422.anIntArray5025[0];
			i_194_ = class422.anIntArray5025[1];
			i_195_ = class422.anIntArray5025[2];
		} else {
			i = -525270939 * ((ItemDefinitions) this).anInt5066;
			i_194_ = -931922913 * ((ItemDefinitions) this).anInt5100;
			i_195_ = ((ItemDefinitions) this).anInt5070 * -562041407;
		}
		if (i == -1)
			return true;
		boolean bool_196_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i, 0, 16711935))
			bool_196_ = false;
		if (i_194_ != -1 && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_194_, 0, 16711935))
			bool_196_ = false;
		if (i_195_ != -1 && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_195_, 0, 16711935))
			bool_196_ = false;
		return bool_196_;
	}

	ItemDefinitions() {
		anInt5042 = 1720113744;
		anInt5058 = 0;
		anInt5045 = 0;
		anInt5074 = 0;
		anInt5063 = 0;
		anInt5044 = 0;
		anInt5049 = 0;
		anInt5050 = 173634739;
		anInt5051 = 222766991;
		aBool5052 = false;
		anInt5055 = 1370939175;
		anInt5056 = -2036382095;
		anInt5062 = -988221655;
		anInt5031 = 149100495;
		anInt5059 = -1898017081;
		anInt5060 = -930264291;
		anInt5061 = 1908691611;
		anInt5030 = 1151562079;
		anInt5047 = 1946123025;
		anInt5064 = 247957423;
		anInt5065 = 1540246871;
		((ItemDefinitions) this).anInt5066 = 342249107;
		((ItemDefinitions) this).anInt5100 = -178028511;
		((ItemDefinitions) this).anInt5075 = 1963342619;
		((ItemDefinitions) this).anInt5069 = 691157025;
		((ItemDefinitions) this).anInt5070 = 2110709183;
		((ItemDefinitions) this).anInt5071 = -1292119991;
		((ItemDefinitions) this).anInt5089 = 0;
		((ItemDefinitions) this).anInt5073 = 0;
		((ItemDefinitions) this).anInt5094 = 0;
		((ItemDefinitions) this).anInt5091 = 0;
		((ItemDefinitions) this).anInt5076 = 0;
		((ItemDefinitions) this).anInt5077 = 0;
		((ItemDefinitions) this).anInt5096 = 582979729;
		((ItemDefinitions) this).anInt5079 = 18677607;
		((ItemDefinitions) this).anInt5080 = 1176241203;
		((ItemDefinitions) this).anInt5081 = -1320781975;
		anInt5084 = -2048174935;
		anInt5078 = -185661005;
		((ItemDefinitions) this).anInt5048 = 68529475;
		anInt5068 = 1862010471;
		((ItemDefinitions) this).anInt5088 = 1000519040;
		((ItemDefinitions) this).anInt5032 = 457285504;
		((ItemDefinitions) this).anInt5090 = 489649280;
		((ItemDefinitions) this).anInt5067 = 0;
		((ItemDefinitions) this).anInt5092 = 0;
		anInt5093 = 0;
		aBool5085 = false;
		anInt5095 = 0;
		anInt5098 = 0;
		((ItemDefinitions) this).anInt5099 = -1174980021;
		anInt5046 = -1638301585;
		aBool5101 = false;
	}

	public final boolean method7128(boolean bool, ItemEffects class422) {
		int i;
		int i_197_;
		int i_198_;
		if (bool) {
			if (null != class422 && null != class422.anIntArray5021) {
				i = class422.anIntArray5021[0];
				i_197_ = class422.anIntArray5021[1];
				i_198_ = class422.anIntArray5021[2];
			} else {
				i = ((ItemDefinitions) this).anInt5075 * -2090968851;
				i_197_ = -1259031521 * ((ItemDefinitions) this).anInt5069;
				i_198_ = -1802576377 * ((ItemDefinitions) this).anInt5071;
			}
		} else if (class422 != null && null != class422.anIntArray5025) {
			i = class422.anIntArray5025[0];
			i_197_ = class422.anIntArray5025[1];
			i_198_ = class422.anIntArray5025[2];
		} else {
			i = -525270939 * ((ItemDefinitions) this).anInt5066;
			i_197_ = -931922913 * ((ItemDefinitions) this).anInt5100;
			i_198_ = ((ItemDefinitions) this).anInt5070 * -562041407;
		}
		if (i == -1)
			return true;
		boolean bool_199_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i, 0, 16711935))
			bool_199_ = false;
		if (i_197_ != -1 && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_197_, 0, 16711935))
			bool_199_ = false;
		if (i_198_ != -1 && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_198_, 0, 16711935))
			bool_199_ = false;
		return bool_199_;
	}

	public final Class157 method7129(boolean bool, ItemEffects class422) {
		int i;
		int i_200_;
		int i_201_;
		if (bool) {
			if (class422 != null && class422.anIntArray5021 != null) {
				i = class422.anIntArray5021[0];
				i_200_ = class422.anIntArray5021[1];
				i_201_ = class422.anIntArray5021[2];
			} else {
				i = ((ItemDefinitions) this).anInt5075 * -2090968851;
				i_200_ = ((ItemDefinitions) this).anInt5069 * -1259031521;
				i_201_ = ((ItemDefinitions) this).anInt5071 * -1802576377;
			}
		} else if (class422 != null && null != class422.anIntArray5025) {
			i = class422.anIntArray5025[0];
			i_200_ = class422.anIntArray5025[1];
			i_201_ = class422.anIntArray5025[2];
		} else {
			i = -525270939 * ((ItemDefinitions) this).anInt5066;
			i_200_ = -931922913 * ((ItemDefinitions) this).anInt5100;
			i_201_ = -562041407 * ((ItemDefinitions) this).anInt5070;
		}
		if (-1 == i)
			return null;
		Class157 class157 = Class157.method2689((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass317_5111), i, 0);
		if (class157 == null)
			return null;
		if (class157.anInt1986 < 13)
			class157.method2679(2);
		if (i_200_ != -1) {
			Class157 class157_202_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_200_, 0);
			if (class157_202_.anInt1986 < 13)
				class157_202_.method2679(2);
			if (i_201_ != -1) {
				Class157 class157_203_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_201_, 0);
				if (class157_203_.anInt1986 < 13)
					class157_203_.method2679(2);
				Class157[] class157s = { class157, class157_202_, class157_203_ };
				class157 = new Class157(class157s, 3);
			} else {
				Class157[] class157s = { class157, class157_202_ };
				class157 = new Class157(class157s, 2);
			}
		}
		if (!bool && (0 != -1021444445 * ((ItemDefinitions) this).anInt5089 || -988581745 * ((ItemDefinitions) this).anInt5094 != 0 || ((ItemDefinitions) this).anInt5076 * 1784001845 != 0))
			class157.method2712(((ItemDefinitions) this).anInt5089 * -1021444445, -988581745 * ((ItemDefinitions) this).anInt5094, ((ItemDefinitions) this).anInt5076 * 1784001845);
		if (bool && (0 != -958170687 * ((ItemDefinitions) this).anInt5073 || ((ItemDefinitions) this).anInt5091 * -710311605 != 0 || 362438811 * ((ItemDefinitions) this).anInt5077 != 0))
			class157.method2712(((ItemDefinitions) this).anInt5073 * -958170687, -710311605 * ((ItemDefinitions) this).anInt5091, ((ItemDefinitions) this).anInt5077 * 362438811);
		if (((ItemDefinitions) this).aShortArray5038 != null) {
			short[] is;
			if (null != class422 && class422.aShortArray5020 != null)
				is = class422.aShortArray5020;
			else
				is = ((ItemDefinitions) this).aShortArray5039;
			for (int i_204_ = 0; i_204_ < ((ItemDefinitions) this).aShortArray5038.length; i_204_++)
				class157.method2668(((ItemDefinitions) this).aShortArray5038[i_204_], is[i_204_]);
		}
		if (((ItemDefinitions) this).aShortArray5041 != null) {
			short[] is;
			if (null != class422 && null != class422.aShortArray5019)
				is = class422.aShortArray5019;
			else
				is = ((ItemDefinitions) this).aShortArray5083;
			for (int i_205_ = 0; i_205_ < ((ItemDefinitions) this).aShortArray5041.length; i_205_++)
				class157.method2669(((ItemDefinitions) this).aShortArray5041[i_205_], is[i_205_]);
		}
		return class157;
	}

	public final Class157 method7130(boolean bool, ItemEffects class422, int i) {
		int i_206_;
		int i_207_;
		if (bool) {
			if (null != class422 && class422.anIntArray5023 != null) {
				i_206_ = class422.anIntArray5023[0];
				i_207_ = class422.anIntArray5023[1];
			} else {
				i_206_ = ((ItemDefinitions) this).anInt5080 * -1705416443;
				i_207_ = ((ItemDefinitions) this).anInt5081 * -1871546585;
			}
		} else if (class422 != null && null != class422.anIntArray5022) {
			i_206_ = class422.anIntArray5022[0];
			i_207_ = class422.anIntArray5022[1];
		} else {
			i_206_ = -603336817 * ((ItemDefinitions) this).anInt5096;
			i_207_ = ((ItemDefinitions) this).anInt5079 * -613723223;
		}
		if (i_206_ == -1)
			return null;
		Class157 class157 = Class157.method2689((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass317_5111), i_206_, 0);
		if (class157.anInt1986 < 13)
			class157.method2679(2);
		if (-1 != i_207_) {
			Class157 class157_208_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_207_, 0);
			if (class157_208_.anInt1986 < 13)
				class157_208_.method2679(2);
			Class157[] class157s = { class157, class157_208_ };
			class157 = new Class157(class157s, 2);
		}
		if (null != ((ItemDefinitions) this).aShortArray5038) {
			short[] is;
			if (null != class422 && class422.aShortArray5020 != null)
				is = class422.aShortArray5020;
			else
				is = ((ItemDefinitions) this).aShortArray5039;
			for (int i_209_ = 0; i_209_ < ((ItemDefinitions) this).aShortArray5038.length; i_209_++)
				class157.method2668(((ItemDefinitions) this).aShortArray5038[i_209_], is[i_209_]);
		}
		if (((ItemDefinitions) this).aShortArray5041 != null) {
			short[] is;
			if (class422 != null && null != class422.aShortArray5019)
				is = class422.aShortArray5019;
			else
				is = ((ItemDefinitions) this).aShortArray5083;
			for (int i_210_ = 0; i_210_ < ((ItemDefinitions) this).aShortArray5041.length; i_210_++)
				class157.method2669(((ItemDefinitions) this).aShortArray5041[i_210_], is[i_210_]);
		}
		return class157;
	}

	void method7131(ItemDefinitions class425_211_, ItemDefinitions class425_212_) {
		((ItemDefinitions) this).anInt5036 = 1 * ((ItemDefinitions) class425_211_).anInt5036;
		anInt5042 = 1 * class425_211_.anInt5042;
		anInt5058 = 1 * class425_211_.anInt5058;
		anInt5045 = class425_211_.anInt5045 * 1;
		anInt5074 = class425_211_.anInt5074 * 1;
		anInt5063 = 1 * class425_211_.anInt5063;
		anInt5044 = class425_211_.anInt5044 * 1;
		((ItemDefinitions) this).aShortArray5038 = ((ItemDefinitions) class425_211_).aShortArray5038;
		((ItemDefinitions) this).aShortArray5039 = ((ItemDefinitions) class425_211_).aShortArray5039;
		((ItemDefinitions) this).aByteArray5037 = ((ItemDefinitions) class425_211_).aByteArray5037;
		((ItemDefinitions) this).aShortArray5041 = ((ItemDefinitions) class425_211_).aShortArray5041;
		((ItemDefinitions) this).aShortArray5083 = ((ItemDefinitions) class425_211_).aShortArray5083;
		aString5043 = class425_212_.aString5043;
		aBool5052 = class425_212_.aBool5052;
		anInt5051 = 1 * class425_212_.anInt5051;
		anInt5049 = -1948887511;
	}

	public final boolean method7132(boolean bool, ItemEffects class422) {
		int i;
		int i_213_;
		if (bool) {
			if (class422 != null && null != class422.anIntArray5023) {
				i = class422.anIntArray5023[0];
				i_213_ = class422.anIntArray5023[1];
			} else {
				i = -1705416443 * ((ItemDefinitions) this).anInt5080;
				i_213_ = ((ItemDefinitions) this).anInt5081 * -1871546585;
			}
		} else if (null != class422 && null != class422.anIntArray5022) {
			i = class422.anIntArray5022[0];
			i_213_ = class422.anIntArray5022[1];
		} else {
			i = ((ItemDefinitions) this).anInt5096 * -603336817;
			i_213_ = ((ItemDefinitions) this).anInt5079 * -613723223;
		}
		if (i == -1)
			return true;
		boolean bool_214_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i, 0, 16711935))
			bool_214_ = false;
		if (-1 != i_213_ && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_213_, 0, 16711935))
			bool_214_ = false;
		return bool_214_;
	}

	public final boolean method7133(boolean bool, ItemEffects class422) {
		int i;
		int i_215_;
		if (bool) {
			if (class422 != null && null != class422.anIntArray5023) {
				i = class422.anIntArray5023[0];
				i_215_ = class422.anIntArray5023[1];
			} else {
				i = -1705416443 * ((ItemDefinitions) this).anInt5080;
				i_215_ = ((ItemDefinitions) this).anInt5081 * -1871546585;
			}
		} else if (null != class422 && null != class422.anIntArray5022) {
			i = class422.anIntArray5022[0];
			i_215_ = class422.anIntArray5022[1];
		} else {
			i = ((ItemDefinitions) this).anInt5096 * -603336817;
			i_215_ = ((ItemDefinitions) this).anInt5079 * -613723223;
		}
		if (i == -1)
			return true;
		boolean bool_216_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i, 0, 16711935))
			bool_216_ = false;
		if (-1 != i_215_ && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_215_, 0, 16711935))
			bool_216_ = false;
		return bool_216_;
	}

	void method7134(ItemDefinitions class425_217_, ItemDefinitions class425_218_, int i) {
		anInt5051 = 0;
		((ItemDefinitions) this).anInt5036 = 1 * ((ItemDefinitions) class425_217_).anInt5036;
		anInt5042 = class425_217_.anInt5042 * 1;
		anInt5058 = 1 * class425_217_.anInt5058;
		anInt5045 = 1 * class425_217_.anInt5045;
		anInt5074 = 1 * class425_217_.anInt5074;
		anInt5063 = class425_217_.anInt5063 * 1;
		anInt5044 = 1 * class425_217_.anInt5044;
		((ItemDefinitions) this).aShortArray5038 = ((ItemDefinitions) class425_218_).aShortArray5038;
		((ItemDefinitions) this).aShortArray5039 = ((ItemDefinitions) class425_218_).aShortArray5039;
		((ItemDefinitions) this).aByteArray5037 = ((ItemDefinitions) class425_218_).aByteArray5037;
		((ItemDefinitions) this).aShortArray5041 = ((ItemDefinitions) class425_218_).aShortArray5041;
		((ItemDefinitions) this).aShortArray5083 = ((ItemDefinitions) class425_218_).aShortArray5083;
		aString5043 = class425_218_.aString5043;
		aBool5052 = class425_218_.aBool5052;
		anInt5047 = 1 * class425_218_.anInt5047;
		anInt5064 = 1 * class425_218_.anInt5064;
		anInt5065 = class425_218_.anInt5065 * 1;
		((ItemDefinitions) this).anInt5066 = 1 * ((ItemDefinitions) class425_218_).anInt5066;
		((ItemDefinitions) this).anInt5100 = 1 * ((ItemDefinitions) class425_218_).anInt5100;
		((ItemDefinitions) this).anInt5070 = ((ItemDefinitions) class425_218_).anInt5070 * 1;
		((ItemDefinitions) this).anInt5075 = 1 * ((ItemDefinitions) class425_218_).anInt5075;
		((ItemDefinitions) this).anInt5069 = 1 * ((ItemDefinitions) class425_218_).anInt5069;
		((ItemDefinitions) this).anInt5071 = 1 * ((ItemDefinitions) class425_218_).anInt5071;
		((ItemDefinitions) this).anInt5089 = 1 * ((ItemDefinitions) class425_218_).anInt5089;
		((ItemDefinitions) this).anInt5073 = ((ItemDefinitions) class425_218_).anInt5073 * 1;
		((ItemDefinitions) this).anInt5094 = 1 * ((ItemDefinitions) class425_218_).anInt5094;
		((ItemDefinitions) this).anInt5091 = ((ItemDefinitions) class425_218_).anInt5091 * 1;
		((ItemDefinitions) this).anInt5076 = ((ItemDefinitions) class425_218_).anInt5076 * 1;
		((ItemDefinitions) this).anInt5077 = 1 * ((ItemDefinitions) class425_218_).anInt5077;
		((ItemDefinitions) this).anInt5096 = ((ItemDefinitions) class425_218_).anInt5096 * 1;
		((ItemDefinitions) this).anInt5079 = ((ItemDefinitions) class425_218_).anInt5079 * 1;
		((ItemDefinitions) this).anInt5080 = ((ItemDefinitions) class425_218_).anInt5080 * 1;
		((ItemDefinitions) this).anInt5081 = 1 * ((ItemDefinitions) class425_218_).anInt5081;
		anInt5093 = class425_218_.anInt5093 * 1;
		aStringArray5053 = class425_218_.aStringArray5053;
		((ItemDefinitions) this).aClass465_5040 = ((ItemDefinitions) class425_218_).aClass465_5040;
		aStringArray5054 = new String[5];
		if (null != class425_218_.aStringArray5054) {
			for (int i_219_ = 0; i_219_ < 4; i_219_++)
				aStringArray5054[i_219_] = class425_218_.aStringArray5054[i_219_];
		}
		aStringArray5054[4] = Class433.aClass433_5165.method7273((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass495_5104), -898798531);
	}

	public final boolean method7135(boolean bool, ItemEffects class422) {
		int i;
		int i_220_;
		if (bool) {
			if (class422 != null && null != class422.anIntArray5023) {
				i = class422.anIntArray5023[0];
				i_220_ = class422.anIntArray5023[1];
			} else {
				i = -1705416443 * ((ItemDefinitions) this).anInt5080;
				i_220_ = ((ItemDefinitions) this).anInt5081 * -1871546585;
			}
		} else if (null != class422 && null != class422.anIntArray5022) {
			i = class422.anIntArray5022[0];
			i_220_ = class422.anIntArray5022[1];
		} else {
			i = ((ItemDefinitions) this).anInt5096 * -603336817;
			i_220_ = ((ItemDefinitions) this).anInt5079 * -613723223;
		}
		if (i == -1)
			return true;
		boolean bool_221_ = true;
		if (!((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i, 0, 16711935))
			bool_221_ = false;
		if (-1 != i_220_ && !((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111.method5688(i_220_, 0, 16711935))
			bool_221_ = false;
		return bool_221_;
	}

	public final Class157 method7136(boolean bool, ItemEffects class422) {
		int i;
		int i_222_;
		int i_223_;
		if (bool) {
			if (class422 != null && class422.anIntArray5021 != null) {
				i = class422.anIntArray5021[0];
				i_222_ = class422.anIntArray5021[1];
				i_223_ = class422.anIntArray5021[2];
			} else {
				i = ((ItemDefinitions) this).anInt5075 * -2090968851;
				i_222_ = ((ItemDefinitions) this).anInt5069 * -1259031521;
				i_223_ = ((ItemDefinitions) this).anInt5071 * -1802576377;
			}
		} else if (class422 != null && null != class422.anIntArray5025) {
			i = class422.anIntArray5025[0];
			i_222_ = class422.anIntArray5025[1];
			i_223_ = class422.anIntArray5025[2];
		} else {
			i = -525270939 * ((ItemDefinitions) this).anInt5066;
			i_222_ = -931922913 * ((ItemDefinitions) this).anInt5100;
			i_223_ = -562041407 * ((ItemDefinitions) this).anInt5070;
		}
		if (-1 == i)
			return null;
		Class157 class157 = Class157.method2689((((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass317_5111), i, 0);
		if (class157 == null)
			return null;
		if (class157.anInt1986 < 13)
			class157.method2679(2);
		if (i_222_ != -1) {
			Class157 class157_224_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_222_, 0);
			if (class157_224_.anInt1986 < 13)
				class157_224_.method2679(2);
			if (i_223_ != -1) {
				Class157 class157_225_ = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), i_223_, 0);
				if (class157_225_.anInt1986 < 13)
					class157_225_.method2679(2);
				Class157[] class157s = { class157, class157_224_, class157_225_ };
				class157 = new Class157(class157s, 3);
			} else {
				Class157[] class157s = { class157, class157_224_ };
				class157 = new Class157(class157s, 2);
			}
		}
		if (!bool && (0 != -1021444445 * ((ItemDefinitions) this).anInt5089 || -988581745 * ((ItemDefinitions) this).anInt5094 != 0 || ((ItemDefinitions) this).anInt5076 * 1784001845 != 0))
			class157.method2712(((ItemDefinitions) this).anInt5089 * -1021444445, -988581745 * ((ItemDefinitions) this).anInt5094, ((ItemDefinitions) this).anInt5076 * 1784001845);
		if (bool && (0 != -958170687 * ((ItemDefinitions) this).anInt5073 || ((ItemDefinitions) this).anInt5091 * -710311605 != 0 || 362438811 * ((ItemDefinitions) this).anInt5077 != 0))
			class157.method2712(((ItemDefinitions) this).anInt5073 * -958170687, -710311605 * ((ItemDefinitions) this).anInt5091, ((ItemDefinitions) this).anInt5077 * 362438811);
		if (((ItemDefinitions) this).aShortArray5038 != null) {
			short[] is;
			if (null != class422 && class422.aShortArray5020 != null)
				is = class422.aShortArray5020;
			else
				is = ((ItemDefinitions) this).aShortArray5039;
			for (int i_226_ = 0; i_226_ < ((ItemDefinitions) this).aShortArray5038.length; i_226_++)
				class157.method2668(((ItemDefinitions) this).aShortArray5038[i_226_], is[i_226_]);
		}
		if (((ItemDefinitions) this).aShortArray5041 != null) {
			short[] is;
			if (null != class422 && null != class422.aShortArray5019)
				is = class422.aShortArray5019;
			else
				is = ((ItemDefinitions) this).aShortArray5083;
			for (int i_227_ = 0; i_227_ < ((ItemDefinitions) this).aShortArray5041.length; i_227_++)
				class157.method2669(((ItemDefinitions) this).aShortArray5041[i_227_], is[i_227_]);
		}
		return class157;
	}

	int[] method7137(Class505 class505, Class505 class505_228_, int i, int i_229_, int i_230_, boolean bool, int i_231_, Class8 class8, Class238 class238) {
		Class157 class157 = Class157.method2689((((Class426) ((ItemDefinitions) this).aClass426_5034).aClass317_5111), -1002877901 * ((ItemDefinitions) this).anInt5036, 0);
		if (class157 == null)
			return null;
		if (class157.anInt1986 < 13)
			class157.method2679(2);
		if (null != ((ItemDefinitions) this).aShortArray5038) {
			for (int i_232_ = 0; i_232_ < ((ItemDefinitions) this).aShortArray5038.length; i_232_++) {
				if (null != ((ItemDefinitions) this).aByteArray5037 && i_232_ < ((ItemDefinitions) this).aByteArray5037.length)
					class157.method2668((((ItemDefinitions) this).aShortArray5038[i_232_]), aShortArray5086[(((ItemDefinitions) this).aByteArray5037[i_232_]) & 0xff]);
				else
					class157.method2668((((ItemDefinitions) this).aShortArray5038[i_232_]), (((ItemDefinitions) this).aShortArray5039[i_232_]));
			}
		}
		if (null != ((ItemDefinitions) this).aShortArray5041) {
			for (int i_233_ = 0; i_233_ < ((ItemDefinitions) this).aShortArray5041.length; i_233_++)
				class157.method2669(((ItemDefinitions) this).aShortArray5041[i_233_], ((ItemDefinitions) this).aShortArray5083[i_233_]);
		}
		if (null != class238) {
			for (int i_234_ = 0; i_234_ < 10; i_234_++) {
				for (int i_235_ = 0; i_235_ < (AbstractQueue_Sub1.aShortArrayArray10068[i_234_]).length; i_235_++) {
					if (class238.anIntArray2923[i_234_] < (Class366.aShortArrayArrayArray4232[i_234_][i_235_]).length)
						class157.method2668((AbstractQueue_Sub1.aShortArrayArray10068[i_234_][i_235_]), (Class366.aShortArrayArrayArray4232[i_234_][i_235_][(class238.anIntArray2923[i_234_])]));
				}
			}
		}
		int i_236_ = 2048;
		boolean bool_237_ = false;
		if (128 != ((ItemDefinitions) this).anInt5088 * -1149583549 || ((ItemDefinitions) this).anInt5032 * -1507136321 != 128 || 128 != 256268633 * ((ItemDefinitions) this).anInt5090) {
			bool_237_ = true;
			i_236_ |= 0x7;
		}
		Class528 class528 = class505.method8451(class157, i_236_, 64, (((ItemDefinitions) this).anInt5067 * -235550995 + 64), (((ItemDefinitions) this).anInt5092 * 1381934903 + 768));
		if (!class528.method11272())
			return null;
		if (bool_237_)
			class528.oa(-1149583549 * ((ItemDefinitions) this).anInt5088, ((ItemDefinitions) this).anInt5032 * -1507136321, 256268633 * ((ItemDefinitions) this).anInt5090);
		Class160 class160 = null;
		if (-1 != anInt5078 * -722914683) {
			class160 = (((ItemDefinitions) this).aClass426_5034.method7147(class505, class505_228_, anInt5084 * 1416589415, 10, 1, 0, true, true, 0, class8, class238, (byte) 82));
			if (class160 == null)
				return null;
		} else if (-1203090775 * anInt5068 != -1) {
			class160 = (((ItemDefinitions) this).aClass426_5034.method7147(class505, class505_228_, -14763883 * ((ItemDefinitions) this).anInt5048, i, i_229_, i_230_, false, true, 0, class8, class238, (byte) 68));
			if (class160 == null)
				return null;
		} else if (-1 != 370155889 * anInt5046) {
			class160 = (((ItemDefinitions) this).aClass426_5034.method7147(class505, class505_228_, 224116893 * ((ItemDefinitions) this).anInt5099, i, i_229_, i_230_, false, true, 0, class8, class238, (byte) -36));
			if (null == class160)
				return null;
		}
		int i_238_;
		if (bool)
			i_238_ = (int) (1.5 * (double) (anInt5042 * -1468071943)) << 2;
		else if (i_229_ == 2)
			i_238_ = (int) ((double) (anInt5042 * -1468071943) * 1.04) << 2;
		else
			i_238_ = anInt5042 * -1468071943 << 2;
		Class384 class384 = class505.method8453();
		Class384 class384_239_ = class505.method8449();
		class384_239_.method6531(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class505.method8523((byte) 105).method2714(), (float) class505.method8523((byte) 121).method2716());
		class505.method8424(class384_239_);
		class505.method8617(0, 0, class505.method8523((byte) 124).method2714(), class505.method8523((byte) 122).method2716());
		Class294 class294 = new Class294();
		class505.method8457(class294);
		class505.IA(0.95F + (float) (Math.random() / 10.0));
		class505.m(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class294 class294_240_ = class505.method8450();
		class294_240_.method5217(0.0F, 0.0F, 1.0F, Class382.method6508(-(anInt5074 * 701885681) << 3));
		class294_240_.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(920448529 * anInt5045 << 3));
		class294_240_.method5219((float) (406372201 * anInt5063 << 2), (float) (((i_238_ * (Class382.anIntArray4657[1752402275 * anInt5058 << 3])) >> 14) - class528.YA() / 2 + (-1316014311 * anInt5044 << 2)), (float) ((((Class382.anIntArray4661[anInt5058 * 1752402275 << 3]) * i_238_) >> 14) + (-1316014311 * anInt5044 << 2)));
		class294_240_.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(1752402275 * anInt5058 << 3));
		class505.r(0, 0, 36, 32);
		class505.ba(2, 0);
		class505.B(0, 0, 36, 32, 0, 0);
		class505.c(0, -1, 0);
		class528.method11282(class294_240_, null, 1);
		class505.method8424(class384);
		int[] is = class505.ab(0, 0, 36, 32);
		if (i_229_ >= 1) {
			is = method7120(is, -16777214, (byte) 44);
			if (i_229_ >= 2)
				is = method7120(is, -1, (byte) 45);
		}
		if (i_230_ != 0)
			method7095(is, i_230_, (byte) 36);
		if (-1 != anInt5068 * -1203090775)
			class160.method2752(0, 0);
		else if (anInt5046 * 370155889 != -1)
			class160.method2752(0, 0);
		class505.method8549(is, 0, 36, 36, 32, 171708819).method2752(0, 0);
		if (anInt5078 * -722914683 != -1)
			class160.method2752(0, 0);
		if (1 == i_231_ || 2 == i_231_ && (1 == anInt5049 * 318481945 || 1 != i) && i != -1)
			class8.method358(Class304.method5407(i, (((Class426) (((ItemDefinitions) this).aClass426_5034)).aClass495_5104), (byte) 44), 0, 9, -256, -16777215, -418109423);
		is = class505.ab(0, 0, 36, 32);
		for (int i_241_ = 0; i_241_ < is.length; i_241_++) {
			if ((is[i_241_] & 0xffffff) == 0)
				is[i_241_] = 0;
			else
				is[i_241_] |= ~0xffffff;
		}
		return is;
	}

	public int method7138(int i, int i_242_) {
		if (((ItemDefinitions) this).aClass465_5040 == null)
			return i_242_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((ItemDefinitions) this).aClass465_5040.method7754((long) i));
		if (null == class282_sub38)
			return i_242_;
		return -570797415 * class282_sub38.anInt8002;
	}

	public String method7139(int i, String string) {
		if (null == ((ItemDefinitions) this).aClass465_5040)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((ItemDefinitions) this).aClass465_5040.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	static final void method7140(Animable class521_sub1_sub1_sub2, Animable class521_sub1_sub1_sub2_243_, int i, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_, byte i_250_) {
		int i_251_ = class521_sub1_sub1_sub2_243_.method15899(-525246876);
		if (-1 != i_251_) {
			Object object = null;
			Class160 class160 = (Class160) client.aClass229_7204.method3865((long) i_251_);
			if (class160 == null) {
				Class91[] class91s = Class91.method1514(Class211.aClass317_2673, i_251_, 0);
				if (null == class91s)
					return;
				class160 = Class316.aClass505_3680.method8444(class91s[0], true);
				client.aClass229_7204.method3856(class160, (long) i_251_);
			}
			Class385 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
			Class210.method3612(class521_sub1_sub1_sub2.aByte7967, (int) class385.aFloat4671, (int) class385.aFloat4673, (class521_sub1_sub1_sub2.method15805(828768449) * 256), 0, false, (byte) 2);
			int i_252_ = (int) ((float) i_244_ + client.aFloatArray7292[0] - 18.0F);
			int i_253_ = (int) ((float) i_245_ + client.aFloatArray7292[1] - 16.0F - 54.0F);
			i_252_ += 18 * (i / 4);
			i_253_ += i % 4 * 18;
			class160.method2752(i_252_, i_253_);
			if (class521_sub1_sub1_sub2 == class521_sub1_sub1_sub2_243_)
				Class316.aClass505_3680.method8562(i_252_ - 1, i_253_ - 1, 18, 18, -256, (byte) 4);
			Class275_Sub2 class275_sub2 = Class3.method286(2086923872);
			((Class275_Sub2) class275_sub2).aClass521_Sub1_Sub1_Sub2_7739 = class521_sub1_sub1_sub2_243_;
			((Class275_Sub2) class275_sub2).anInt7742 = -945313559 * i_252_;
			((Class275_Sub2) class275_sub2).anInt7743 = -1731479375 * i_253_;
			((Class275_Sub2) class275_sub2).anInt7744 = (16 + i_252_) * 164907185;
			((Class275_Sub2) class275_sub2).anInt7740 = 1753364739 * (16 + i_253_);
			client.aClass457_7290.method7649(class275_sub2, 1174204485);
		}
	}

	public static void method7141(int i, byte i_254_) {
		Class329.method5906(i, -464275916);
	}

	static final void method7142(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class118.aBool1420 = ((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 53);
	}

	static final void method7143(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(-988664751);
	}
}
