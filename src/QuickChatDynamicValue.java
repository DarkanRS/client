/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class QuickChatDynamicValue {
	static QuickChatDynamicValue ACC_GETMEANCOMBATLEVEL;
	public static QuickChatDynamicValue ENUM_STRING;
	static QuickChatDynamicValue COUNTDIALOG;
	static QuickChatDynamicValue STAT_BASE;
	static QuickChatDynamicValue ACC_GETCOUNT_WORLD;
	static QuickChatDynamicValue TOSTRING_SHARED;
	static QuickChatDynamicValue TOSTRING_VARP;
	static QuickChatDynamicValue TOSTRING_VARBIT;
	public static QuickChatDynamicValue OBJTRADEDIALOG;
	public static QuickChatDynamicValue ENUM_STRING_STATBASE;
	public static QuickChatDynamicValue LISTDIALOG = new QuickChatDynamicValue(0, 2, 2, 1);
	static QuickChatDynamicValue ACTIVECOMBATLEVEL;
	public static QuickChatDynamicValue OBJDIALOG = new QuickChatDynamicValue(1, 2, 2, 0);
	public static QuickChatDynamicValue ENUM_STRING_CLAN;
	public int id;
	public int clientTransmitSize;
	public int serverTransmitSize;
	public int paramCount;

	static {
		COUNTDIALOG = new QuickChatDynamicValue(2, 4, 4, 0);
		STAT_BASE = new QuickChatDynamicValue(4, 1, 1, 1);
		ENUM_STRING = new QuickChatDynamicValue(6, 0, 4, 2);
		ENUM_STRING_CLAN = new QuickChatDynamicValue(7, 0, 1, 1);
		TOSTRING_VARP = new QuickChatDynamicValue(8, 0, 4, 1);
		TOSTRING_VARBIT = new QuickChatDynamicValue(9, 0, 4, 1);
		OBJTRADEDIALOG = new QuickChatDynamicValue(10, 2, 2, 0);
		ENUM_STRING_STATBASE = new QuickChatDynamicValue(11, 0, 1, 2);
		ACC_GETCOUNT_WORLD = new QuickChatDynamicValue(12, 0, 1, 0);
		ACC_GETMEANCOMBATLEVEL = new QuickChatDynamicValue(13, 0, 1, 0);
		TOSTRING_SHARED = new QuickChatDynamicValue(14, 0, 4, 1);
		ACTIVECOMBATLEVEL = new QuickChatDynamicValue(15, 0, 1, 0);
	}

	QuickChatDynamicValue(int i, int i_1_, int i_2_, int i_3_) {
		id = i * -1336554375;
		clientTransmitSize = -1079524855 * i_1_;
		serverTransmitSize = i_2_ * 538118299;
		paramCount = 968865815 * i_3_;
	}

	static final void method4173(CS2Executor class527, int i) {
		int i_5_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_5_, (byte) 117);
		Class413.method6942(class118, class527, -839720836);
	}

	static final void method4174(CS2Executor class527, int i) {
		int i_6_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_6_, (byte) 10);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_6_ >> 16];
		Class457.method7667(class118, class98, class527, 668340664);
	}

	static final void method4175(CS2Executor class527, short i) {
		int i_7_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_7_, (byte) 17);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_7_ >> 16];
		Class125.method2170(class118, class98, class527, 809860903);
	}

	static final void method4176(CS2Executor class527, int i) {
		int i_8_ = ((client.anIntArrayArrayArray7302[(class527.intStack[((class527.intStackPtr -= 141891001) * 1942118537)])]).length >> 1);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_8_;
	}

	static final void method4177(CS2Executor class527, byte i) {
		class527.intStackPtr -= 567564004;
		int i_9_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_10_ = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
		int i_11_ = (class527.intStack[2 + class527.intStackPtr * 1942118537]);
		int i_12_ = (class527.intStack[class527.intStackPtr * 1942118537 + 3]);
		CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1537474699);
		RouteStrategy.method3794(((i_9_ >> 14 & 0x3fff) - class219.x * 1948093437), (i_9_ & 0x3fff) - -1002240017 * class219.y, i_10_ << 2, i_11_, i_12_, false, (byte) -1);
	}

	static final void method4178(CS2Executor class527, byte i) {
		class527.intStackPtr -= 425673003;
		int i_13_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_14_ = (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		int i_15_ = (class527.intStack[2 + 1942118537 * class527.intStackPtr]);
		long l = Class42.method891(0, 0, 12, i_13_, i_14_, i_15_, 1796735712);
		int i_16_ = ObjectIndexLoader.method7914(l);
		if (i_15_ < 1970) {
			if (i <= 0)
				return;
			i_16_--;
		}
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_16_;
	}

	static final void method4179(int i, int i_17_, int i_18_, int i_19_, Class476 class476, byte i_20_) {
		if (i_18_ >= 1 && i_19_ >= 1 && i_18_ <= IndexLoaders.MAP_REGION_DECODER.getSizeX(1811223828) - 2 && i_19_ <= IndexLoaders.MAP_REGION_DECODER.getSizeY(-1564374011) - 2) {
			if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1940602014) != null) {
				SceneObject interface12 = IndexLoaders.MAP_REGION_DECODER.method4441(1508379413).method12467(i, i_17_, i_18_, i_19_, 2009974413);
				if (interface12 != null) {
					if (interface12 instanceof InteractableObject)
						((InteractableObject) interface12).method16096(class476, -59212941);
					else if (interface12 instanceof GroundDecoration)
						((GroundDecoration) interface12).method16091(class476, -737324181);
					else if (interface12 instanceof Wall)
						((Wall) interface12).method16108(class476, -2063213607);
					else if (interface12 instanceof WallDecoration)
						((WallDecoration) interface12).method16082(class476, -449891505);
				}
			}
		}
	}

	static boolean method4180(int i, byte i_21_) {
		return i == 7 || i == 6;
	}

	static final void method4181(CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class96_Sub19.method14665(string, 1220033429);
	}

	public static QuickChatDynamicValue get(int i, byte i_0_) {
		QuickChatDynamicValue[] class243s = Class92.getQuickChatDynamicValueTypes((short) -10593);
		for (int i_1_ = 0; i_1_ < class243s.length; i_1_++) {
			if (i == class243s[i_1_].id * -1869685303)
				return class243s[i_1_];
		}
		return null;
	}
}
