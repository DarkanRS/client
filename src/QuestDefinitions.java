/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class QuestDefinitions {
	int[] anIntArray2955;
	public String name;
	public String altName;
	public int anInt2958 = 0;
	int[][] varbitValues;
	public int anInt2960 = 0;
	public int[] anIntArray2961;
	public boolean aBool2962 = false;
	public int anInt2963;
	public int[] anIntArray2964;
	int[][] varValues;
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

	public boolean method4093(Interface42 interface42, int[] is, int i) {
		if (((QuestDefinitions) this).aClass242_2976.method4154(interface42, 1765999661) < anInt2973 * -985547275)
			return false;
		if (null != anIntArrayArray2966) {
			for (int i_1_ = 0; i_1_ < anIntArrayArray2966.length; i_1_++) {
				if (is[anIntArrayArray2966[i_1_][0]] < anIntArrayArray2966[i_1_][1])
					return false;
			}
		}
		if (null != anIntArray2968) {
			for (int i_2_ = 0; i_2_ < anIntArray2968.length; i_2_++) {
				if (!((QuestDefinitions) this).aClass242_2976.method4156(anIntArray2968[i_2_], -1396181317).method4099(interface42, -2060810176))
					return false;
			}
		}
		if (anIntArray2961 != null) {
			for (int i_3_ = 0; i_3_ < anIntArray2961.length; i_3_++) {
				int i_4_ = interface42.method240(anIntArray2961[i_3_], -853289836);
				if (i_4_ < ((QuestDefinitions) this).anIntArray2969[i_3_] || i_4_ > ((QuestDefinitions) this).anIntArray2970[i_3_])
					return false;
			}
		}
		if (anIntArray2964 != null) {
			for (int i_5_ = 0; i_5_ < anIntArray2964.length; i_5_++) {
				int i_6_ = interface42.method241(anIntArray2964[i_5_], -520349475);
				if (i_6_ < ((QuestDefinitions) this).anIntArray2967[i_5_] || i_6_ > ((QuestDefinitions) this).anIntArray2974[i_5_])
					return false;
			}
		}
		return true;
	}

	void method4094(RsByteBuffer class282_sub35, int i, int i_7_) {
		if (i == 1)
			name = class282_sub35.readGJString(-1054894786);
		else if (i == 2)
			altName = class282_sub35.readGJString(-1501893281);
		else if (3 == i) {
			int i_8_ = class282_sub35.readUnsignedByte();
			((QuestDefinitions) this).varValues = new int[i_8_][3];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				((QuestDefinitions) this).varValues[i_9_][0] = class282_sub35.readUnsignedShort();
				((QuestDefinitions) this).varValues[i_9_][1] = class282_sub35.readInt();
				((QuestDefinitions) this).varValues[i_9_][2] = class282_sub35.readInt();
			}
		} else if (i == 4) {
			int i_10_ = class282_sub35.readUnsignedByte();
			((QuestDefinitions) this).varbitValues = new int[i_10_][3];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				((QuestDefinitions) this).varbitValues[i_11_][0] = class282_sub35.readUnsignedShort();
				((QuestDefinitions) this).varbitValues[i_11_][1] = class282_sub35.readInt();
				((QuestDefinitions) this).varbitValues[i_11_][2] = class282_sub35.readInt();
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
			((QuestDefinitions) this).anIntArray2955 = new int[i_12_];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
				((QuestDefinitions) this).anIntArray2955[i_13_] = class282_sub35.readInt();
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
			((QuestDefinitions) this).anIntArray2969 = new int[i_18_];
			((QuestDefinitions) this).anIntArray2970 = new int[i_18_];
			aStringArray2971 = new String[i_18_];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
				anIntArray2961[i_19_] = class282_sub35.readInt();
				((QuestDefinitions) this).anIntArray2969[i_19_] = class282_sub35.readInt();
				((QuestDefinitions) this).anIntArray2970[i_19_] = class282_sub35.readInt();
				aStringArray2971[i_19_] = class282_sub35.readString();
			}
		} else if (i == 19) {
			int i_20_ = class282_sub35.readUnsignedByte();
			anIntArray2964 = new int[i_20_];
			((QuestDefinitions) this).anIntArray2967 = new int[i_20_];
			((QuestDefinitions) this).anIntArray2974 = new int[i_20_];
			aStringArray2975 = new String[i_20_];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
				anIntArray2964[i_21_] = class282_sub35.readInt();
				((QuestDefinitions) this).anIntArray2967[i_21_] = class282_sub35.readInt();
				((QuestDefinitions) this).anIntArray2974[i_21_] = class282_sub35.readInt();
				aStringArray2975[i_21_] = class282_sub35.readString();
			}
		} else if (i == 249) {
			int i_22_ = class282_sub35.readUnsignedByte();
			if (((QuestDefinitions) this).aClass465_2972 == null) {
				int i_23_ = Class323.nextPowerOfTwo(i_22_, -265127005);
				((QuestDefinitions) this).aClass465_2972 = new IterableNodeMap(i_23_);
			}
			for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_25_ = class282_sub35.read24BitUnsignedInteger();
				Node class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString());
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((QuestDefinitions) this).aClass465_2972.method7765(class282, (long) i_25_);
			}
		}
	}

	void method4095(byte i) {
		if (altName == null)
			altName = name;
	}

	public boolean method4098(Interface42 interface42, byte i) {
		if (((QuestDefinitions) this).varValues != null) {
			for (int i_28_ = 0; i_28_ < ((QuestDefinitions) this).varValues.length; i_28_++) {
				if (interface42.method240((((QuestDefinitions) this).varValues[i_28_][0]), -409569082) >= ((QuestDefinitions) this).varValues[i_28_][1])
					return true;
			}
		}
		if (((QuestDefinitions) this).varbitValues != null) {
			for (int i_29_ = 0; i_29_ < ((QuestDefinitions) this).varbitValues.length; i_29_++) {
				if (interface42.method241((((QuestDefinitions) this).varbitValues[i_29_][0]), -1489106913) >= ((QuestDefinitions) this).varbitValues[i_29_][1])
					return true;
			}
		}
		return false;
	}

	public boolean method4099(Interface42 interface42, int i) {
		if (((QuestDefinitions) this).varValues != null) {
			for (int i_30_ = 0; i_30_ < ((QuestDefinitions) this).varValues.length; i_30_++) {
				if (interface42.method240((((QuestDefinitions) this).varValues[i_30_][0]), -585739390) >= ((QuestDefinitions) this).varValues[i_30_][2])
					return true;
			}
		}
		if (((QuestDefinitions) this).varbitValues != null) {
			for (int i_31_ = 0; i_31_ < ((QuestDefinitions) this).varbitValues.length; i_31_++) {
				if (interface42.method241((((QuestDefinitions) this).varbitValues[i_31_][0]), -598279654) >= ((QuestDefinitions) this).varbitValues[i_31_][2])
					return true;
			}
		}
		return false;
	}

	public boolean method4101(Interface42 interface42, byte i) {
		if (((QuestDefinitions) this).aClass242_2976.method4154(interface42, 2095145584) < anInt2973 * -985547275)
			return false;
		return true;
	}

	public boolean method4103(Interface42 interface42, int i, int i_50_) {
		if (null == anIntArray2968 || i < 0 || i >= anIntArray2968.length)
			return false;
		if (!((QuestDefinitions) this).aClass242_2976.method4156(anIntArray2968[i], -1396181317).method4099(interface42, 1001789983))
			return false;
		return true;
	}

	public boolean method4104(Interface42 interface42, int i, short i_51_) {
		if (null == anIntArray2961 || i < 0 || i >= anIntArray2961.length)
			return false;
		int i_52_ = interface42.method240(anIntArray2961[i], 1497520500);
		if (i_52_ < ((QuestDefinitions) this).anIntArray2969[i] || i_52_ > ((QuestDefinitions) this).anIntArray2970[i])
			return false;
		return true;
	}

	public boolean method4105(Interface42 interface42, int i, int i_53_) {
		if (anIntArray2964 == null || i < 0 || i >= anIntArray2964.length)
			return false;
		int i_54_ = interface42.method241(anIntArray2964[i], 1488898797);
		if (i_54_ < ((QuestDefinitions) this).anIntArray2967[i] || i_54_ > ((QuestDefinitions) this).anIntArray2974[i])
			return false;
		return true;
	}

	public String method4110(int i, String string, byte i_74_) {
		if (null == ((QuestDefinitions) this).aClass465_2972)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((QuestDefinitions) this).aClass465_2972.method7754((long) i));
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

	void method4119(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_96_ = class282_sub35.readUnsignedByte();
			if (0 == i_96_)
				break;
			method4094(class282_sub35, i_96_, -379084068);
		}
	}

	QuestDefinitions() {
		/* empty */
	}

	public int method4135(int i, int i_103_, byte i_104_) {
		if (((QuestDefinitions) this).aClass465_2972 == null)
			return i_103_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((QuestDefinitions) this).aClass465_2972.method7754((long) i));
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
		AnimationDefinitions.method11148((class527.aClass521_Sub1_Sub2_Sub1_7014), (class527.intStack[((class527.intStackPtr -= 141891001) * 1942118537)]), -1315599355);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	public static boolean isRoof(int i, int i_105_) {
		return (i >= SceneObjectType.STRAIGHT_SLOPE_ROOF.type * 1109376893 && i <= SceneObjectType.STRAIGHT_FLAT_ROOF.type * 1109376893);
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
