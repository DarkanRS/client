public class QuickChatDynamicValue {

	public static QuickChatDynamicValue LISTDIALOG = new QuickChatDynamicValue(0, 2, 2, 1);
	public static QuickChatDynamicValue OBJDIALOG = new QuickChatDynamicValue(1, 2, 2, 0);
	static QuickChatDynamicValue COUNTDIALOG = new QuickChatDynamicValue(2, 4, 4, 0);
	static QuickChatDynamicValue STAT_BASE = new QuickChatDynamicValue(4, 1, 1, 1);
	public static QuickChatDynamicValue ENUM_STRING = new QuickChatDynamicValue(6, 0, 4, 2);
	public static QuickChatDynamicValue ENUM_STRING_CLAN = new QuickChatDynamicValue(7, 0, 1, 1);
	static QuickChatDynamicValue TOSTRING_VARP = new QuickChatDynamicValue(8, 0, 4, 1);
	static QuickChatDynamicValue TOSTRING_VARBIT = new QuickChatDynamicValue(9, 0, 4, 1);
	public static QuickChatDynamicValue OBJTRADEDIALOG = new QuickChatDynamicValue(10, 2, 2, 0);
	public static QuickChatDynamicValue ENUM_STRING_STATBASE = new QuickChatDynamicValue(11, 0, 1, 2);
	static QuickChatDynamicValue ACC_GETCOUNT_WORLD = new QuickChatDynamicValue(12, 0, 1, 0);
	static QuickChatDynamicValue ACC_GETMEANCOMBATLEVEL = new QuickChatDynamicValue(13, 0, 1, 0);
	static QuickChatDynamicValue TOSTRING_SHARED = new QuickChatDynamicValue(14, 0, 4, 1);
	static QuickChatDynamicValue ACTIVECOMBATLEVEL = new QuickChatDynamicValue(15, 0, 1, 0);
	public int id;
	public int clientTransmitSize;
	public int serverTransmitSize;
	public int paramCount;

	QuickChatDynamicValue(int i_1, int i_2, int i_3, int i_4) {
		this.id = i_1;
		this.clientTransmitSize = i_2;
		this.serverTransmitSize = i_3;
		this.paramCount = i_4;
	}

	static final void method4173(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 117);
		Class413.method6942(icomponentdefinitions_3, cs2executor_0, -839720836);
	}

	static final void method4174(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 10);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class457.method7667(icomponentdefinitions_3, interface_4, cs2executor_0, 668340664);
	}

	static final void method4175(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 17);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class125.method2170(icomponentdefinitions_3, interface_4, cs2executor_0, 809860903);
	}

	static final void method4176(CS2Executor cs2executor_0, int i_1) {
		int i_2 = client.anIntArrayArrayArray7302[cs2executor_0.intStack[--cs2executor_0.intStackPtr]].length >> 1;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2;
	}

	static final void method4177(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 4;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		int i_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 3];
		CoordGrid coordgrid_6 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1537474699);
		RouteStrategy.method3794((i_2 >> 14 & 0x3fff) - coordgrid_6.x, (i_2 & 0x3fff) - coordgrid_6.y, i_3 << 2, i_4, i_5, false, (byte) -1);
	}

	static final void method4178(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		long long_5 = Class42.method891(0, 0, 12, i_2, i_3, i_4, 1796735712);
		int i_7 = ObjectIndexLoader.method7914(long_5);
		if (i_4 < 1970) {
			--i_7;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_7;
	}

	static final void method4179(int i_0, int i_1, int i_2, int i_3, Class476 class476_4, byte b_5) {
		if (i_2 >= 1 && i_3 >= 1 && i_2 <= IndexLoaders.MAP_REGION_DECODER.getSizeX(1811223828) - 2 && i_3 <= IndexLoaders.MAP_REGION_DECODER.getSizeY(-1564374011) - 2 && IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1940602014) != null) {
			SceneObject sceneobject_6 = IndexLoaders.MAP_REGION_DECODER.method4441(1508379413).method12467(i_0, i_1, i_2, i_3, 2009974413);
			if (sceneobject_6 != null) {
				if (sceneobject_6 instanceof InteractableObject) {
					((InteractableObject) sceneobject_6).method16096(class476_4, -59212941);
				} else if (sceneobject_6 instanceof GroundDecoration) {
					((GroundDecoration) sceneobject_6).method16091(class476_4, -737324181);
				} else if (sceneobject_6 instanceof Wall) {
					((Wall) sceneobject_6).method16108(class476_4, -2063213607);
				} else if (sceneobject_6 instanceof WallDecoration) {
					((WallDecoration) sceneobject_6).method16082(class476_4, -449891505);
				}
			}
		}

	}

	static boolean method4180(int i_0, byte b_1) {
		return i_0 == 7 || i_0 == 6;
	}

	static final void method4181(CS2Executor cs2executor_0, byte b_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		Class96_Sub19.method14665(string_2, 1220033429);
	}

	public static QuickChatDynamicValue get(int i_0, byte b_1) {
		QuickChatDynamicValue[] arr_2 = Class92.getQuickChatDynamicValueTypes((short) -10593);

		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			if (i_0 == arr_2[i_3].id) {
				return arr_2[i_3];
			}
		}

		return null;
	}

}
