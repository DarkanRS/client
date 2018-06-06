/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class240 {
	int[] anIntArray2955;
	public String aString2956;
	public String aString2957;
	public int anInt2958 = 0;
	int[][] anIntArrayArray2959;
	public int anInt2960 = 0;
	public int[] anIntArray2961;
	public boolean aBool2962 = false;
	public int anInt2963;
	public int[] anIntArray2964;
	int[][] anIntArrayArray2965;
	public int[][] anIntArrayArray2966;
	int[] anIntArray2967;
	public int[] anIntArray2968;
	int[] anIntArray2969;
	int[] anIntArray2970;
	public String[] aStringArray2971;
	IterableNodeMap aClass465_2972;
	public int anInt2973;
	int[] anIntArray2974;
	public String[] aStringArray2975;
	Class242 aClass242_2976;
	public int anInt2977 = 467515775;

	public boolean method4092(Interface42 interface42, int i) {
		if (anIntArray2964 == null || i < 0 || i >= anIntArray2964.length)
			return false;
		int i_0_ = interface42.method241(anIntArray2964[i], 1153507304);
		if (i_0_ < ((Class240) this).anIntArray2967[i] || i_0_ > ((Class240) this).anIntArray2974[i])
			return false;
		return true;
	}

	public boolean method4093(Interface42 interface42, int[] is, int i) {
		if (((Class240) this).aClass242_2976.method4154(interface42, 1765999661) < anInt2973 * -985547275)
			return false;
		if (null != anIntArrayArray2966) {
			for (int i_1_ = 0; i_1_ < anIntArrayArray2966.length; i_1_++) {
				if (is[anIntArrayArray2966[i_1_][0]] < anIntArrayArray2966[i_1_][1])
					return false;
			}
		}
		if (null != anIntArray2968) {
			for (int i_2_ = 0; i_2_ < anIntArray2968.length; i_2_++) {
				if (!((Class240) this).aClass242_2976.method4156(anIntArray2968[i_2_], -1396181317).method4099(interface42, -2060810176))
					return false;
			}
		}
		if (anIntArray2961 != null) {
			for (int i_3_ = 0; i_3_ < anIntArray2961.length; i_3_++) {
				int i_4_ = interface42.method240(anIntArray2961[i_3_], -853289836);
				if (i_4_ < ((Class240) this).anIntArray2969[i_3_] || i_4_ > ((Class240) this).anIntArray2970[i_3_])
					return false;
			}
		}
		if (anIntArray2964 != null) {
			for (int i_5_ = 0; i_5_ < anIntArray2964.length; i_5_++) {
				int i_6_ = interface42.method241(anIntArray2964[i_5_], -520349475);
				if (i_6_ < ((Class240) this).anIntArray2967[i_5_] || i_6_ > ((Class240) this).anIntArray2974[i_5_])
					return false;
			}
		}
		return true;
	}

	void method4094(RsByteBuffer class282_sub35, int i, int i_7_) {
		if (i == 1)
			aString2956 = class282_sub35.readGJString(-1054894786);
		else if (i == 2)
			aString2957 = class282_sub35.readGJString(-1501893281);
		else if (3 == i) {
			int i_8_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArrayArray2965 = new int[i_8_][3];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				((Class240) this).anIntArrayArray2965[i_9_][0] = class282_sub35.readUnsignedShort();
				((Class240) this).anIntArrayArray2965[i_9_][1] = class282_sub35.readInt();
				((Class240) this).anIntArrayArray2965[i_9_][2] = class282_sub35.readInt();
			}
		} else if (i == 4) {
			int i_10_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArrayArray2959 = new int[i_10_][3];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				((Class240) this).anIntArrayArray2959[i_11_][0] = class282_sub35.readUnsignedShort();
				((Class240) this).anIntArrayArray2959[i_11_][1] = class282_sub35.readInt();
				((Class240) this).anIntArrayArray2959[i_11_][2] = class282_sub35.readInt();
			}
		} else if (i == 5)
			class282_sub35.readUnsignedShort();
		else if (6 == i)
			anInt2958 = class282_sub35.readUnsignedByte() * -1467263871;
		else if (7 == i)
			anInt2960 = class282_sub35.readUnsignedByte() * 1992977297;
		else if (i == 8)
			aBool2962 = true;
		else if (9 == i)
			anInt2963 = class282_sub35.readUnsignedByte() * 452253117;
		else if (i == 10) {
			int i_12_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArray2955 = new int[i_12_];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
				((Class240) this).anIntArray2955[i_13_] = class282_sub35.readInt();
		} else if (i == 12)
			class282_sub35.readInt();
		else if (13 == i) {
			int i_14_ = class282_sub35.readUnsignedByte();
			anIntArray2968 = new int[i_14_];
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
				anIntArray2968[i_15_] = class282_sub35.readUnsignedShort();
		} else if (i == 14) {
			int i_16_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2966 = new int[i_16_][2];
			for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
				anIntArrayArray2966[i_17_][0] = class282_sub35.readUnsignedByte();
				anIntArrayArray2966[i_17_][1] = class282_sub35.readUnsignedByte();
			}
		} else if (i == 15)
			anInt2973 = class282_sub35.readUnsignedShort() * 660162141;
		else if (i == 17)
			anInt2977 = class282_sub35.readBigSmart() * -467515775;
		else if (i == 18) {
			int i_18_ = class282_sub35.readUnsignedByte();
			anIntArray2961 = new int[i_18_];
			((Class240) this).anIntArray2969 = new int[i_18_];
			((Class240) this).anIntArray2970 = new int[i_18_];
			aStringArray2971 = new String[i_18_];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
				anIntArray2961[i_19_] = class282_sub35.readInt();
				((Class240) this).anIntArray2969[i_19_] = class282_sub35.readInt();
				((Class240) this).anIntArray2970[i_19_] = class282_sub35.readInt();
				aStringArray2971[i_19_] = class282_sub35.readString();
			}
		} else if (i == 19) {
			int i_20_ = class282_sub35.readUnsignedByte();
			anIntArray2964 = new int[i_20_];
			((Class240) this).anIntArray2967 = new int[i_20_];
			((Class240) this).anIntArray2974 = new int[i_20_];
			aStringArray2975 = new String[i_20_];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
				anIntArray2964[i_21_] = class282_sub35.readInt();
				((Class240) this).anIntArray2967[i_21_] = class282_sub35.readInt();
				((Class240) this).anIntArray2974[i_21_] = class282_sub35.readInt();
				aStringArray2975[i_21_] = class282_sub35.readString();
			}
		} else if (i == 249) {
			int i_22_ = class282_sub35.readUnsignedByte();
			if (((Class240) this).aClass465_2972 == null) {
				int i_23_ = Class323.nextPowerOfTwo(i_22_, -265127005);
				((Class240) this).aClass465_2972 = new IterableNodeMap(i_23_);
			}
			for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_25_ = class282_sub35.read24BitUnsignedInteger();
				Node class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString());
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class240) this).aClass465_2972.method7765(class282, (long) i_25_);
			}
		}
	}

	void method4095(byte i) {
		if (aString2957 == null)
			aString2957 = aString2956;
	}

	public boolean method4096(Interface42 interface42, int[] is) {
		if (((Class240) this).aClass242_2976.method4154(interface42, 1813108300) < anInt2973 * -985547275)
			return false;
		if (null != anIntArrayArray2966) {
			for (int i = 0; i < anIntArrayArray2966.length; i++) {
				if (is[anIntArrayArray2966[i][0]] < anIntArrayArray2966[i][1])
					return false;
			}
		}
		if (null != anIntArray2968) {
			for (int i = 0; i < anIntArray2968.length; i++) {
				if (!((Class240) this).aClass242_2976.method4156(anIntArray2968[i], -1396181317).method4099(interface42, -498779175))
					return false;
			}
		}
		if (anIntArray2961 != null) {
			for (int i = 0; i < anIntArray2961.length; i++) {
				int i_26_ = interface42.method240(anIntArray2961[i], 460191698);
				if (i_26_ < ((Class240) this).anIntArray2969[i] || i_26_ > ((Class240) this).anIntArray2970[i])
					return false;
			}
		}
		if (anIntArray2964 != null) {
			for (int i = 0; i < anIntArray2964.length; i++) {
				int i_27_ = interface42.method241(anIntArray2964[i], 354831553);
				if (i_27_ < ((Class240) this).anIntArray2967[i] || i_27_ > ((Class240) this).anIntArray2974[i])
					return false;
			}
		}
		return true;
	}

	void method4097(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method4094(class282_sub35, i, -379084068);
		}
	}

	public boolean method4098(Interface42 interface42, byte i) {
		if (((Class240) this).anIntArrayArray2965 != null) {
			for (int i_28_ = 0; i_28_ < ((Class240) this).anIntArrayArray2965.length; i_28_++) {
				if (interface42.method240((((Class240) this).anIntArrayArray2965[i_28_][0]), -409569082) >= ((Class240) this).anIntArrayArray2965[i_28_][1])
					return true;
			}
		}
		if (((Class240) this).anIntArrayArray2959 != null) {
			for (int i_29_ = 0; i_29_ < ((Class240) this).anIntArrayArray2959.length; i_29_++) {
				if (interface42.method241((((Class240) this).anIntArrayArray2959[i_29_][0]), -1489106913) >= ((Class240) this).anIntArrayArray2959[i_29_][1])
					return true;
			}
		}
		return false;
	}

	public boolean method4099(Interface42 interface42, int i) {
		if (((Class240) this).anIntArrayArray2965 != null) {
			for (int i_30_ = 0; i_30_ < ((Class240) this).anIntArrayArray2965.length; i_30_++) {
				if (interface42.method240((((Class240) this).anIntArrayArray2965[i_30_][0]), -585739390) >= ((Class240) this).anIntArrayArray2965[i_30_][2])
					return true;
			}
		}
		if (((Class240) this).anIntArrayArray2959 != null) {
			for (int i_31_ = 0; i_31_ < ((Class240) this).anIntArrayArray2959.length; i_31_++) {
				if (interface42.method241((((Class240) this).anIntArrayArray2959[i_31_][0]), -598279654) >= ((Class240) this).anIntArrayArray2959[i_31_][2])
					return true;
			}
		}
		return false;
	}

	void method4100(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aString2956 = class282_sub35.readGJString(-1060006689);
		else if (i == 2)
			aString2957 = class282_sub35.readGJString(427229757);
		else if (3 == i) {
			int i_32_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArrayArray2965 = new int[i_32_][3];
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
				((Class240) this).anIntArrayArray2965[i_33_][0] = class282_sub35.readUnsignedShort();
				((Class240) this).anIntArrayArray2965[i_33_][1] = class282_sub35.readInt();
				((Class240) this).anIntArrayArray2965[i_33_][2] = class282_sub35.readInt();
			}
		} else if (i == 4) {
			int i_34_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArrayArray2959 = new int[i_34_][3];
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
				((Class240) this).anIntArrayArray2959[i_35_][0] = class282_sub35.readUnsignedShort();
				((Class240) this).anIntArrayArray2959[i_35_][1] = class282_sub35.readInt();
				((Class240) this).anIntArrayArray2959[i_35_][2] = class282_sub35.readInt();
			}
		} else if (i == 5)
			class282_sub35.readUnsignedShort();
		else if (6 == i)
			anInt2958 = class282_sub35.readUnsignedByte() * -1467263871;
		else if (7 == i)
			anInt2960 = class282_sub35.readUnsignedByte() * 1992977297;
		else if (i == 8)
			aBool2962 = true;
		else if (9 == i)
			anInt2963 = class282_sub35.readUnsignedByte() * 452253117;
		else if (i == 10) {
			int i_36_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArray2955 = new int[i_36_];
			for (int i_37_ = 0; i_37_ < i_36_; i_37_++)
				((Class240) this).anIntArray2955[i_37_] = class282_sub35.readInt();
		} else if (i == 12)
			class282_sub35.readInt();
		else if (13 == i) {
			int i_38_ = class282_sub35.readUnsignedByte();
			anIntArray2968 = new int[i_38_];
			for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
				anIntArray2968[i_39_] = class282_sub35.readUnsignedShort();
		} else if (i == 14) {
			int i_40_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2966 = new int[i_40_][2];
			for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
				anIntArrayArray2966[i_41_][0] = class282_sub35.readUnsignedByte();
				anIntArrayArray2966[i_41_][1] = class282_sub35.readUnsignedByte();
			}
		} else if (i == 15)
			anInt2973 = class282_sub35.readUnsignedShort() * 660162141;
		else if (i == 17)
			anInt2977 = class282_sub35.readBigSmart() * -467515775;
		else if (i == 18) {
			int i_42_ = class282_sub35.readUnsignedByte();
			anIntArray2961 = new int[i_42_];
			((Class240) this).anIntArray2969 = new int[i_42_];
			((Class240) this).anIntArray2970 = new int[i_42_];
			aStringArray2971 = new String[i_42_];
			for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
				anIntArray2961[i_43_] = class282_sub35.readInt();
				((Class240) this).anIntArray2969[i_43_] = class282_sub35.readInt();
				((Class240) this).anIntArray2970[i_43_] = class282_sub35.readInt();
				aStringArray2971[i_43_] = class282_sub35.readString();
			}
		} else if (i == 19) {
			int i_44_ = class282_sub35.readUnsignedByte();
			anIntArray2964 = new int[i_44_];
			((Class240) this).anIntArray2967 = new int[i_44_];
			((Class240) this).anIntArray2974 = new int[i_44_];
			aStringArray2975 = new String[i_44_];
			for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
				anIntArray2964[i_45_] = class282_sub35.readInt();
				((Class240) this).anIntArray2967[i_45_] = class282_sub35.readInt();
				((Class240) this).anIntArray2974[i_45_] = class282_sub35.readInt();
				aStringArray2975[i_45_] = class282_sub35.readString();
			}
		} else if (i == 249) {
			int i_46_ = class282_sub35.readUnsignedByte();
			if (((Class240) this).aClass465_2972 == null) {
				int i_47_ = Class323.nextPowerOfTwo(i_46_, -1340245685);
				((Class240) this).aClass465_2972 = new IterableNodeMap(i_47_);
			}
			for (int i_48_ = 0; i_48_ < i_46_; i_48_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_49_ = class282_sub35.read24BitUnsignedInteger();
				Node class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString());
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class240) this).aClass465_2972.method7765(class282, (long) i_49_);
			}
		}
	}

	public boolean method4101(Interface42 interface42, byte i) {
		if (((Class240) this).aClass242_2976.method4154(interface42, 2095145584) < anInt2973 * -985547275)
			return false;
		return true;
	}

	void method4102() {
		if (aString2957 == null)
			aString2957 = aString2956;
	}

	public boolean method4103(Interface42 interface42, int i, int i_50_) {
		if (null == anIntArray2968 || i < 0 || i >= anIntArray2968.length)
			return false;
		if (!((Class240) this).aClass242_2976.method4156(anIntArray2968[i], -1396181317).method4099(interface42, 1001789983))
			return false;
		return true;
	}

	public boolean method4104(Interface42 interface42, int i, short i_51_) {
		if (null == anIntArray2961 || i < 0 || i >= anIntArray2961.length)
			return false;
		int i_52_ = interface42.method240(anIntArray2961[i], 1497520500);
		if (i_52_ < ((Class240) this).anIntArray2969[i] || i_52_ > ((Class240) this).anIntArray2970[i])
			return false;
		return true;
	}

	public boolean method4105(Interface42 interface42, int i, int i_53_) {
		if (anIntArray2964 == null || i < 0 || i >= anIntArray2964.length)
			return false;
		int i_54_ = interface42.method241(anIntArray2964[i], 1488898797);
		if (i_54_ < ((Class240) this).anIntArray2967[i] || i_54_ > ((Class240) this).anIntArray2974[i])
			return false;
		return true;
	}

	void method4106(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method4094(class282_sub35, i, -379084068);
		}
	}

	void method4107(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method4094(class282_sub35, i, -379084068);
		}
	}

	void method4108(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aString2956 = class282_sub35.readGJString(141909773);
		else if (i == 2)
			aString2957 = class282_sub35.readGJString(-269414875);
		else if (3 == i) {
			int i_55_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArrayArray2965 = new int[i_55_][3];
			for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
				((Class240) this).anIntArrayArray2965[i_56_][0] = class282_sub35.readUnsignedShort();
				((Class240) this).anIntArrayArray2965[i_56_][1] = class282_sub35.readInt();
				((Class240) this).anIntArrayArray2965[i_56_][2] = class282_sub35.readInt();
			}
		} else if (i == 4) {
			int i_57_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArrayArray2959 = new int[i_57_][3];
			for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
				((Class240) this).anIntArrayArray2959[i_58_][0] = class282_sub35.readUnsignedShort();
				((Class240) this).anIntArrayArray2959[i_58_][1] = class282_sub35.readInt();
				((Class240) this).anIntArrayArray2959[i_58_][2] = class282_sub35.readInt();
			}
		} else if (i == 5)
			class282_sub35.readUnsignedShort();
		else if (6 == i)
			anInt2958 = class282_sub35.readUnsignedByte() * -1467263871;
		else if (7 == i)
			anInt2960 = class282_sub35.readUnsignedByte() * 1992977297;
		else if (i == 8)
			aBool2962 = true;
		else if (9 == i)
			anInt2963 = class282_sub35.readUnsignedByte() * 452253117;
		else if (i == 10) {
			int i_59_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArray2955 = new int[i_59_];
			for (int i_60_ = 0; i_60_ < i_59_; i_60_++)
				((Class240) this).anIntArray2955[i_60_] = class282_sub35.readInt();
		} else if (i == 12)
			class282_sub35.readInt();
		else if (13 == i) {
			int i_61_ = class282_sub35.readUnsignedByte();
			anIntArray2968 = new int[i_61_];
			for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
				anIntArray2968[i_62_] = class282_sub35.readUnsignedShort();
		} else if (i == 14) {
			int i_63_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2966 = new int[i_63_][2];
			for (int i_64_ = 0; i_64_ < i_63_; i_64_++) {
				anIntArrayArray2966[i_64_][0] = class282_sub35.readUnsignedByte();
				anIntArrayArray2966[i_64_][1] = class282_sub35.readUnsignedByte();
			}
		} else if (i == 15)
			anInt2973 = class282_sub35.readUnsignedShort() * 660162141;
		else if (i == 17)
			anInt2977 = class282_sub35.readBigSmart() * -467515775;
		else if (i == 18) {
			int i_65_ = class282_sub35.readUnsignedByte();
			anIntArray2961 = new int[i_65_];
			((Class240) this).anIntArray2969 = new int[i_65_];
			((Class240) this).anIntArray2970 = new int[i_65_];
			aStringArray2971 = new String[i_65_];
			for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
				anIntArray2961[i_66_] = class282_sub35.readInt();
				((Class240) this).anIntArray2969[i_66_] = class282_sub35.readInt();
				((Class240) this).anIntArray2970[i_66_] = class282_sub35.readInt();
				aStringArray2971[i_66_] = class282_sub35.readString();
			}
		} else if (i == 19) {
			int i_67_ = class282_sub35.readUnsignedByte();
			anIntArray2964 = new int[i_67_];
			((Class240) this).anIntArray2967 = new int[i_67_];
			((Class240) this).anIntArray2974 = new int[i_67_];
			aStringArray2975 = new String[i_67_];
			for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
				anIntArray2964[i_68_] = class282_sub35.readInt();
				((Class240) this).anIntArray2967[i_68_] = class282_sub35.readInt();
				((Class240) this).anIntArray2974[i_68_] = class282_sub35.readInt();
				aStringArray2975[i_68_] = class282_sub35.readString();
			}
		} else if (i == 249) {
			int i_69_ = class282_sub35.readUnsignedByte();
			if (((Class240) this).aClass465_2972 == null) {
				int i_70_ = Class323.nextPowerOfTwo(i_69_, 1436487749);
				((Class240) this).aClass465_2972 = new IterableNodeMap(i_70_);
			}
			for (int i_71_ = 0; i_71_ < i_69_; i_71_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_72_ = class282_sub35.read24BitUnsignedInteger();
				Node class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString());
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class240) this).aClass465_2972.method7765(class282, (long) i_72_);
			}
		}
	}

	public int method4109(int i, int i_73_) {
		if (((Class240) this).aClass465_2972 == null)
			return i_73_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class240) this).aClass465_2972.method7754((long) i));
		if (class282_sub38 == null)
			return i_73_;
		return class282_sub38.anInt8002 * -570797415;
	}

	public String method4110(int i, String string, byte i_74_) {
		if (null == ((Class240) this).aClass465_2972)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class240) this).aClass465_2972.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public boolean method4111(int[] is, int i, int i_75_) {
		if (null == anIntArrayArray2966 || i < 0 || i >= anIntArrayArray2966.length)
			return false;
		if (is[anIntArrayArray2966[i][0]] < anIntArrayArray2966[i][1])
			return false;
		return true;
	}

	void method4112(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aString2956 = class282_sub35.readGJString(500315526);
		else if (i == 2)
			aString2957 = class282_sub35.readGJString(639915433);
		else if (3 == i) {
			int i_76_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArrayArray2965 = new int[i_76_][3];
			for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
				((Class240) this).anIntArrayArray2965[i_77_][0] = class282_sub35.readUnsignedShort();
				((Class240) this).anIntArrayArray2965[i_77_][1] = class282_sub35.readInt();
				((Class240) this).anIntArrayArray2965[i_77_][2] = class282_sub35.readInt();
			}
		} else if (i == 4) {
			int i_78_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArrayArray2959 = new int[i_78_][3];
			for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
				((Class240) this).anIntArrayArray2959[i_79_][0] = class282_sub35.readUnsignedShort();
				((Class240) this).anIntArrayArray2959[i_79_][1] = class282_sub35.readInt();
				((Class240) this).anIntArrayArray2959[i_79_][2] = class282_sub35.readInt();
			}
		} else if (i == 5)
			class282_sub35.readUnsignedShort();
		else if (6 == i)
			anInt2958 = class282_sub35.readUnsignedByte() * -1467263871;
		else if (7 == i)
			anInt2960 = class282_sub35.readUnsignedByte() * 1992977297;
		else if (i == 8)
			aBool2962 = true;
		else if (9 == i)
			anInt2963 = class282_sub35.readUnsignedByte() * 452253117;
		else if (i == 10) {
			int i_80_ = class282_sub35.readUnsignedByte();
			((Class240) this).anIntArray2955 = new int[i_80_];
			for (int i_81_ = 0; i_81_ < i_80_; i_81_++)
				((Class240) this).anIntArray2955[i_81_] = class282_sub35.readInt();
		} else if (i == 12)
			class282_sub35.readInt();
		else if (13 == i) {
			int i_82_ = class282_sub35.readUnsignedByte();
			anIntArray2968 = new int[i_82_];
			for (int i_83_ = 0; i_83_ < i_82_; i_83_++)
				anIntArray2968[i_83_] = class282_sub35.readUnsignedShort();
		} else if (i == 14) {
			int i_84_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2966 = new int[i_84_][2];
			for (int i_85_ = 0; i_85_ < i_84_; i_85_++) {
				anIntArrayArray2966[i_85_][0] = class282_sub35.readUnsignedByte();
				anIntArrayArray2966[i_85_][1] = class282_sub35.readUnsignedByte();
			}
		} else if (i == 15)
			anInt2973 = class282_sub35.readUnsignedShort() * 660162141;
		else if (i == 17)
			anInt2977 = class282_sub35.readBigSmart() * -467515775;
		else if (i == 18) {
			int i_86_ = class282_sub35.readUnsignedByte();
			anIntArray2961 = new int[i_86_];
			((Class240) this).anIntArray2969 = new int[i_86_];
			((Class240) this).anIntArray2970 = new int[i_86_];
			aStringArray2971 = new String[i_86_];
			for (int i_87_ = 0; i_87_ < i_86_; i_87_++) {
				anIntArray2961[i_87_] = class282_sub35.readInt();
				((Class240) this).anIntArray2969[i_87_] = class282_sub35.readInt();
				((Class240) this).anIntArray2970[i_87_] = class282_sub35.readInt();
				aStringArray2971[i_87_] = class282_sub35.readString();
			}
		} else if (i == 19) {
			int i_88_ = class282_sub35.readUnsignedByte();
			anIntArray2964 = new int[i_88_];
			((Class240) this).anIntArray2967 = new int[i_88_];
			((Class240) this).anIntArray2974 = new int[i_88_];
			aStringArray2975 = new String[i_88_];
			for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
				anIntArray2964[i_89_] = class282_sub35.readInt();
				((Class240) this).anIntArray2967[i_89_] = class282_sub35.readInt();
				((Class240) this).anIntArray2974[i_89_] = class282_sub35.readInt();
				aStringArray2975[i_89_] = class282_sub35.readString();
			}
		} else if (i == 249) {
			int i_90_ = class282_sub35.readUnsignedByte();
			if (((Class240) this).aClass465_2972 == null) {
				int i_91_ = Class323.nextPowerOfTwo(i_90_, 1161727098);
				((Class240) this).aClass465_2972 = new IterableNodeMap(i_91_);
			}
			for (int i_92_ = 0; i_92_ < i_90_; i_92_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_93_ = class282_sub35.read24BitUnsignedInteger();
				Node class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString());
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class240) this).aClass465_2972.method7765(class282, (long) i_93_);
			}
		}
	}

	public boolean method4113(Interface42 interface42, int i) {
		if (null == anIntArray2961 || i < 0 || i >= anIntArray2961.length)
			return false;
		int i_94_ = interface42.method240(anIntArray2961[i], 654475961);
		if (i_94_ < ((Class240) this).anIntArray2969[i] || i_94_ > ((Class240) this).anIntArray2970[i])
			return false;
		return true;
	}

	public boolean method4114(Interface42 interface42) {
		if (((Class240) this).anIntArrayArray2965 != null) {
			for (int i = 0; i < ((Class240) this).anIntArrayArray2965.length; i++) {
				if (interface42.method240((((Class240) this).anIntArrayArray2965[i][0]), 17976624) >= ((Class240) this).anIntArrayArray2965[i][1])
					return true;
			}
		}
		if (((Class240) this).anIntArrayArray2959 != null) {
			for (int i = 0; i < ((Class240) this).anIntArrayArray2959.length; i++) {
				if (interface42.method241((((Class240) this).anIntArrayArray2959[i][0]), -202715450) >= ((Class240) this).anIntArrayArray2959[i][1])
					return true;
			}
		}
		return false;
	}

	public int method4115(int i, int i_95_) {
		if (((Class240) this).aClass465_2972 == null)
			return i_95_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class240) this).aClass465_2972.method7754((long) i));
		if (class282_sub38 == null)
			return i_95_;
		return class282_sub38.anInt8002 * -570797415;
	}

	public String method4116(int i, String string) {
		if (null == ((Class240) this).aClass465_2972)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class240) this).aClass465_2972.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public String method4117(int i, String string) {
		if (null == ((Class240) this).aClass465_2972)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class240) this).aClass465_2972.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public boolean method4118(Interface42 interface42) {
		if (((Class240) this).anIntArrayArray2965 != null) {
			for (int i = 0; i < ((Class240) this).anIntArrayArray2965.length; i++) {
				if (interface42.method240((((Class240) this).anIntArrayArray2965[i][0]), -845246906) >= ((Class240) this).anIntArrayArray2965[i][1])
					return true;
			}
		}
		if (((Class240) this).anIntArrayArray2959 != null) {
			for (int i = 0; i < ((Class240) this).anIntArrayArray2959.length; i++) {
				if (interface42.method241((((Class240) this).anIntArrayArray2959[i][0]), -596706707) >= ((Class240) this).anIntArrayArray2959[i][1])
					return true;
			}
		}
		return false;
	}

	void method4119(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_96_ = class282_sub35.readUnsignedByte();
			if (0 == i_96_)
				break;
			method4094(class282_sub35, i_96_, -379084068);
		}
	}

	public boolean method4120(Interface42 interface42) {
		if (((Class240) this).anIntArrayArray2965 != null) {
			for (int i = 0; i < ((Class240) this).anIntArrayArray2965.length; i++) {
				if (interface42.method240((((Class240) this).anIntArrayArray2965[i][0]), 1797657163) >= ((Class240) this).anIntArrayArray2965[i][2])
					return true;
			}
		}
		if (((Class240) this).anIntArrayArray2959 != null) {
			for (int i = 0; i < ((Class240) this).anIntArrayArray2959.length; i++) {
				if (interface42.method241((((Class240) this).anIntArrayArray2959[i][0]), 1510101746) >= ((Class240) this).anIntArrayArray2959[i][2])
					return true;
			}
		}
		return false;
	}

	public boolean method4121(Interface42 interface42) {
		if (((Class240) this).anIntArrayArray2965 != null) {
			for (int i = 0; i < ((Class240) this).anIntArrayArray2965.length; i++) {
				if (interface42.method240((((Class240) this).anIntArrayArray2965[i][0]), 1923016682) >= ((Class240) this).anIntArrayArray2965[i][2])
					return true;
			}
		}
		if (((Class240) this).anIntArrayArray2959 != null) {
			for (int i = 0; i < ((Class240) this).anIntArrayArray2959.length; i++) {
				if (interface42.method241((((Class240) this).anIntArrayArray2959[i][0]), 2001048332) >= ((Class240) this).anIntArrayArray2959[i][2])
					return true;
			}
		}
		return false;
	}

	public boolean method4122(Interface42 interface42, int i) {
		if (anIntArray2964 == null || i < 0 || i >= anIntArray2964.length)
			return false;
		int i_97_ = interface42.method241(anIntArray2964[i], -1592653711);
		if (i_97_ < ((Class240) this).anIntArray2967[i] || i_97_ > ((Class240) this).anIntArray2974[i])
			return false;
		return true;
	}

	public boolean method4123(Interface42 interface42, int[] is) {
		if (((Class240) this).aClass242_2976.method4154(interface42, 1755117245) < anInt2973 * -985547275)
			return false;
		if (null != anIntArrayArray2966) {
			for (int i = 0; i < anIntArrayArray2966.length; i++) {
				if (is[anIntArrayArray2966[i][0]] < anIntArrayArray2966[i][1])
					return false;
			}
		}
		if (null != anIntArray2968) {
			for (int i = 0; i < anIntArray2968.length; i++) {
				if (!((Class240) this).aClass242_2976.method4156(anIntArray2968[i], -1396181317).method4099(interface42, 1801507561))
					return false;
			}
		}
		if (anIntArray2961 != null) {
			for (int i = 0; i < anIntArray2961.length; i++) {
				int i_98_ = interface42.method240(anIntArray2961[i], 1359835460);
				if (i_98_ < ((Class240) this).anIntArray2969[i] || i_98_ > ((Class240) this).anIntArray2970[i])
					return false;
			}
		}
		if (anIntArray2964 != null) {
			for (int i = 0; i < anIntArray2964.length; i++) {
				int i_99_ = interface42.method241(anIntArray2964[i], -727857339);
				if (i_99_ < ((Class240) this).anIntArray2967[i] || i_99_ > ((Class240) this).anIntArray2974[i])
					return false;
			}
		}
		return true;
	}

	public boolean method4124(Interface42 interface42) {
		if (((Class240) this).aClass242_2976.method4154(interface42, 2064661286) < anInt2973 * -985547275)
			return false;
		return true;
	}

	public boolean method4125(Interface42 interface42) {
		if (((Class240) this).aClass242_2976.method4154(interface42, 1918785128) < anInt2973 * -985547275)
			return false;
		return true;
	}

	public boolean method4126(Interface42 interface42) {
		if (((Class240) this).aClass242_2976.method4154(interface42, 1717319127) < anInt2973 * -985547275)
			return false;
		return true;
	}

	public boolean method4127(Interface42 interface42) {
		if (((Class240) this).aClass242_2976.method4154(interface42, 1699790049) < anInt2973 * -985547275)
			return false;
		return true;
	}

	public boolean method4128(int[] is, int i) {
		if (null == anIntArrayArray2966 || i < 0 || i >= anIntArrayArray2966.length)
			return false;
		if (is[anIntArrayArray2966[i][0]] < anIntArrayArray2966[i][1])
			return false;
		return true;
	}

	public boolean method4129(int[] is, int i) {
		if (null == anIntArrayArray2966 || i < 0 || i >= anIntArrayArray2966.length)
			return false;
		if (is[anIntArrayArray2966[i][0]] < anIntArrayArray2966[i][1])
			return false;
		return true;
	}

	public boolean method4130(Interface42 interface42, int i) {
		if (null == anIntArray2968 || i < 0 || i >= anIntArray2968.length)
			return false;
		if (!((Class240) this).aClass242_2976.method4156(anIntArray2968[i], -1396181317).method4099(interface42, 348903606))
			return false;
		return true;
	}

	public boolean method4131(Interface42 interface42, int i) {
		if (null == anIntArray2968 || i < 0 || i >= anIntArray2968.length)
			return false;
		if (!((Class240) this).aClass242_2976.method4156(anIntArray2968[i], -1396181317).method4099(interface42, 990286782))
			return false;
		return true;
	}

	public boolean method4132(Interface42 interface42, int i) {
		if (null == anIntArray2961 || i < 0 || i >= anIntArray2961.length)
			return false;
		int i_100_ = interface42.method240(anIntArray2961[i], 2094447029);
		if (i_100_ < ((Class240) this).anIntArray2969[i] || i_100_ > ((Class240) this).anIntArray2970[i])
			return false;
		return true;
	}

	public int method4133(int i, int i_101_) {
		if (((Class240) this).aClass465_2972 == null)
			return i_101_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class240) this).aClass465_2972.method7754((long) i));
		if (class282_sub38 == null)
			return i_101_;
		return class282_sub38.anInt8002 * -570797415;
	}

	Class240() {
		/* empty */
	}

	public boolean method4134(Interface42 interface42, int i) {
		if (anIntArray2964 == null || i < 0 || i >= anIntArray2964.length)
			return false;
		int i_102_ = interface42.method241(anIntArray2964[i], 1348183454);
		if (i_102_ < ((Class240) this).anIntArray2967[i] || i_102_ > ((Class240) this).anIntArray2974[i])
			return false;
		return true;
	}

	public int method4135(int i, int i_103_, byte i_104_) {
		if (((Class240) this).aClass465_2972 == null)
			return i_103_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class240) this).aClass465_2972.method7754((long) i));
		if (class282_sub38 == null)
			return i_103_;
		return class282_sub38.anInt8002 * -570797415;
	}

	static final void method4136(IComponentDefinitions class118, Interface class98, CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 718441711) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1409 = Class351.method6193(string, class527, 1509347670);
		class118.aBool1384 = true;
	}

	static final void method4137(CS2Executor class527, byte i) {
		AnimationDefinitions.method11148((class527.aClass521_Sub1_Sub2_Sub1_7014), (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), -1315599355);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	public static boolean method4138(int i, int i_105_) {
		return (i >= Class458.aClass458_5486.anInt5481 * 1109376893 && i <= Class458.aClass458_5485.anInt5481 * 1109376893);
	}

	static void writeCRCs(RsBitsBuffer stream, int i) {
		stream.writeInt(IndexLoaders.ANIMATION_SKELETON_INDEX.getCrc());
		stream.writeInt(IndexLoaders.ANIMATION_SKIN_INDEX.getCrc());
		stream.writeInt(IndexLoaders.CONFIG_INDEX.getCrc());
		stream.writeInt(IndexLoaders.INTERFACE_INDEX.getCrc());
		stream.writeInt(IndexLoaders.SOUND_EFFECT_INDEX.getCrc());
		stream.writeInt(IndexLoaders.MAP_INDEX.getCrc());
		stream.writeInt(IndexLoaders.MUSIC_INDEX.getCrc());
		stream.writeInt(IndexLoaders.MESH_INDEX.getCrc());
		stream.writeInt(IndexLoaders.SPRITES_INDEX.getCrc());
		stream.writeInt(IndexLoaders.TEXTURE_INDEX.getCrc());
		stream.writeInt(IndexLoaders.HUFFMAN_INDEX.getCrc());
		stream.writeInt(IndexLoaders.INDEX_11.getCrc());
		stream.writeInt(IndexLoaders.CS2_SCRIPTS_INDEX.getCrc());
		stream.writeInt(IndexLoaders.FONT_METRICS_INDEX.getCrc());
		stream.writeInt(IndexLoaders.MIDI_INSTRUMENT_INDEX.getCrc());
		stream.writeInt(IndexLoaders.INDEX_15.getCrc());
		stream.writeInt(IndexLoaders.OBJECT_INDEX.getCrc());
		stream.writeInt(IndexLoaders.ENUM_INDEX.getCrc());
		stream.writeInt(IndexLoaders.NPC_INDEX.getCrc());
		stream.writeInt(IndexLoaders.ITEM_INDEX.getCrc());
		stream.writeInt(IndexLoaders.SEQUENCES_INDEX.getCrc());
		stream.writeInt(IndexLoaders.SPOTANIM_INDEX.getCrc());
		stream.writeInt(IndexLoaders.VARBIT_INDEX.getCrc());
		stream.writeInt(IndexLoaders.WORLD_MAP_INDEX.getCrc());
		stream.writeInt(IndexLoaders.QC_MESSAGES_INDEX.getCrc());
		stream.writeInt(IndexLoaders.QC_MENU_INDEX.getCrc());
		stream.writeInt(IndexLoaders.TEXTURE_DEFINITION_INDEX.getCrc());
		stream.writeInt(IndexLoaders.PARTICLE_INDEX.getCrc());
		stream.writeInt(IndexLoaders.DEFAULTS_INDEX.getCrc());
		stream.writeInt(IndexLoaders.BILLBOARD_INDEX.getCrc());
		stream.writeInt(IndexLoaders.NATIVE_LIBRARY_INDEX.getCrc());
		stream.writeInt(IndexLoaders.SHADER_INDEX.getCrc());
		stream.writeInt(Class378.method6435(-1443123937));
		stream.writeInt(Class468_Sub7.method12672((byte) 0));
		stream.writeInt(IndexLoaders.CUTSCENE_INDEX.getCrc());
		stream.writeInt(IndexLoaders.aClass317_2663.getCrc());
	}

	public static void method4140(String string, int i) {
		Class179.aString2225 = string;
		Class179.anInt2220 = Class179.aString2225.length() * -1996461669;
	}
}
