public class Class92 {

	int anInt964;
	SceneObjectType aClass458_963;
	int anInt965;
	int anInt962;
	int anInt966;
	int anInt967;

	boolean method1557(int i_1) {
		if (this.anInt964 < 0) {
			return true;
		} else {
			ObjectDefinitions objectdefinitions_2 = IndexLoaders.OBJECT_INDEX_LOADER.getObjectDefinitions(this.anInt964, 65280);
			boolean bool_3 = objectdefinitions_2.method7987(this.aClass458_963.type, 792891536);
			int[] ints_4 = objectdefinitions_2.method8008(-2118355158);
			if (ints_4 != null) {
				int[] ints_5 = ints_4;

				for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
					int i_7 = ints_5[i_6];
					bool_3 &= IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(i_7, (byte) 92).ready();
				}
			}

			return bool_3;
		}
	}

	Class92(RsByteBuffer rsbytebuffer_1) {
		this.anInt964 = rsbytebuffer_1.readBigSmart();
		this.aClass458_963 = (SceneObjectType) Class386.method6672(Class2.method262((byte) -1), rsbytebuffer_1.readUnsignedByte(), -859737548);
	}

	void method1558(byte b_1) {
		Class299.method5313(this.anInt965, this.anInt962, this.anInt966, this.aClass458_963.anInt5494, -1, this.aClass458_963.type, this.anInt967, 1736684675);
	}

	void method1559(int i_1, int i_2, int i_3, int i_4, byte b_5) {
		Class299.method5313(i_1, i_2, i_3, this.aClass458_963.anInt5494, this.anInt964, this.aClass458_963.type, i_4, 1736684675);
		this.anInt965 = i_1;
		this.anInt962 = i_2;
		this.anInt966 = i_3;
		this.anInt967 = i_4;
	}

	static final int method1560(int i_0, int i_1, int i_2) {
		int i_3 = Class159.method2735(45365 + i_0, i_1 + 91923, 4, -726719813) - 128 + (Class159.method2735(i_0 + 10294, 37821 + i_1, 2, -726719813) - 128 >> 1) + (Class159.method2735(i_0, i_1, 1, -726719813) - 128 >> 2);
		i_3 = (int) ((double) i_3 * 0.3D) + 35;
		if (i_3 < 10) {
			i_3 = 10;
		} else if (i_3 > 60) {
			i_3 = 60;
		}

		return i_3;
	}

	static QuickChatDynamicValue[] getQuickChatDynamicValueTypes(short s_0) {
		return new QuickChatDynamicValue[] { QuickChatDynamicValue.ENUM_STRING, QuickChatDynamicValue.ACC_GETCOUNT_WORLD, QuickChatDynamicValue.STAT_BASE, QuickChatDynamicValue.ACTIVECOMBATLEVEL, QuickChatDynamicValue.OBJTRADEDIALOG, QuickChatDynamicValue.ENUM_STRING_CLAN, QuickChatDynamicValue.COUNTDIALOG, QuickChatDynamicValue.TOSTRING_VARBIT, QuickChatDynamicValue.TOSTRING_VARP, QuickChatDynamicValue.LISTDIALOG, QuickChatDynamicValue.ACC_GETMEANCOMBATLEVEL, QuickChatDynamicValue.TOSTRING_SHARED, QuickChatDynamicValue.OBJDIALOG, QuickChatDynamicValue.ENUM_STRING_STATBASE };
	}

	static final void method1562(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.method11633(icomponentdefinitions_3).getUseOptionFlags();
	}

	public static void method1563(int i_0, int i_1) {
		Class282_Sub37 class282_sub37_2 = (Class282_Sub37) Class492.aClass465_5774.method7754((long) i_0);
		if (class282_sub37_2 != null) {
			class282_sub37_2.aClass278_Sub1_8001.method4947((byte) 44);
			Class62.method1260(class282_sub37_2.anInt7999, class282_sub37_2.aBool7998, 1656056599);
			class282_sub37_2.remove();
		}

	}

	static void method1564(int i_0, int i_1, int i_2, int i_3, int i_4, byte b_5) {
		for (int i_6 = i_2; i_6 <= i_3; i_6++) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_6], i_0, i_1, i_4, (byte) -105);
		}

	}

	public static void method1565(int i_0, int i_1) {
		Class282_Sub50_Sub12 class282_sub50_sub12_2 = Engine.getIComponentVar(4, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) -28);
	}

}
