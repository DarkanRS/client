public class Class358 {

	static Class358 aClass358_4136 = new Class358("9", "9");
	static Class358 aClass358_4126 = new Class358("24", "24");
	static Class358 aClass358_4127 = new Class358("15", "15");
	static Class358 aClass358_4140 = new Class358("8", "8");
	static Class358 aClass358_4129 = new Class358("18", "18");
	static Class358 aClass358_4125 = new Class358("16", "16");
	static Class358 aClass358_4142 = new Class358("6", "6");
	static Class358 aClass358_4150 = new Class358("35", "35");
	static Class358 aClass358_4133 = new Class358("14", "14");
	static Class358 aClass358_4156 = new Class358("5", "5");
	static Class358 aClass358_4137 = new Class358("31", "31");
	static Class358 aClass358_4128 = new Class358("23", "23");
	static Class358 aClass358_4151 = new Class358("10", "10");
	static Class358 aClass358_4138 = new Class358("34", "34");
	static Class358 aClass358_4139 = new Class358("33", "33");
	static Class358 aClass358_4135 = new Class358("2", "2");
	static Class358 aClass358_4141 = new Class358("25", "25");
	static Class358 aClass358_4134 = new Class358("11", "11");
	public static Class358 aClass358_4158 = new Class358("12", "12");
	public static Class358 aClass358_4144 = new Class358("21", "21");
	static Class358 aClass358_4145 = new Class358("29", "29");
	static Class358 aClass358_4146 = new Class358("1", "1");
	static Class358 aClass358_4147 = new Class358("26", "26");
	static Class358 aClass358_4148 = new Class358("4", "4");
	static Class358 aClass358_4143 = new Class358("28", "28");
	static Class358 aClass358_4131 = new Class358("20", "20");
	static Class358 aClass358_4149 = new Class358("32", "32");
	static Class358 aClass358_4152 = new Class358("22", "22");
	static Class358 aClass358_4153 = new Class358("27", "27");
	static Class358 aClass358_4154 = new Class358("17", "17");
	static Class358 aClass358_4155 = new Class358("3", "3");
	static Class358 aClass358_4130 = new Class358("30", "30");
	static Class358 aClass358_4157 = new Class358("13", "13");
	static Class358 aClass358_4132 = new Class358("7", "7");
	public String aString4159;

	Class358(String string_1, String string_2) {
		this.aString4159 = string_2;
	}

	static void method6234(byte b_0) {
		Class299.aClass229_3545.method3859(-1558417289);
	}

	static void method6235(byte[] bytes_0, byte b_1) {
		RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(bytes_0);

		while (true) {
			int i_3 = rsbytebuffer_2.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			if (i_3 == 1) {
				int[] ints_4 = Class210.anIntArray2668 = new int[6];
				ints_4[0] = rsbytebuffer_2.readUnsignedShort();
				ints_4[1] = rsbytebuffer_2.readUnsignedShort();
				ints_4[2] = rsbytebuffer_2.readUnsignedShort();
				ints_4[3] = rsbytebuffer_2.readUnsignedShort();
				ints_4[4] = rsbytebuffer_2.readUnsignedShort();
				ints_4[5] = rsbytebuffer_2.readUnsignedShort();
			}
		}
	}

	static final void method6236(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1336;
	}

	static final void method6237(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2, (byte) -1);
		String str_4 = "";
		if (chatline_3 != null && chatline_3.crownedName != null) {
			str_4 = chatline_3.crownedName;
		}

		cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = str_4;
	}

	static final void method6238(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aBool7465 ? 1 : 0;
	}

	static final void method6239(CS2Executor cs2executor_0, int i_1) {
		Class282_Sub20_Sub25.method15393(true, 1862489719);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -87);
		Class190.savePreferences((byte) 74);
		client.aBool7175 = false;
	}

	public static void method6240(int i_0, int i_1) {
		Class148.anInt1730 = 1;
		Class75.aClass317_746 = null;
		Class6.anInt46 = -1;
		Class148.anInt1738 = -1;
		Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
		Class158_Sub2_Sub3.anInt10243 = 0;
		Class152.aBool1962 = false;
		Class96_Sub22.anInt9440 = i_0;
		Class11.aClass109_121 = null;
	}

}
