package com.rs.jagex;

public class Class358 {

	public static Class358 aClass358_4158 = new Class358("12");
	public static Class358 aClass358_4144 = new Class358("21");
	static Class358 aClass358_4136 = new Class358("9");
	static Class358 aClass358_4126 = new Class358("24");
	static Class358 aClass358_4127 = new Class358("15");
	static Class358 aClass358_4140 = new Class358("8");
	static Class358 aClass358_4129 = new Class358("18");
	static Class358 aClass358_4125 = new Class358("16");
	static Class358 aClass358_4142 = new Class358("6");
	static Class358 aClass358_4150 = new Class358("35");
	static Class358 aClass358_4133 = new Class358("14");
	static Class358 aClass358_4156 = new Class358("5");
	static Class358 aClass358_4137 = new Class358("31");
	static Class358 aClass358_4128 = new Class358("23");
	static Class358 aClass358_4151 = new Class358("10");
	static Class358 aClass358_4138 = new Class358("34");
	static Class358 aClass358_4139 = new Class358("33");
	static Class358 aClass358_4135 = new Class358("2");
	static Class358 aClass358_4141 = new Class358("25");
	static Class358 aClass358_4134 = new Class358("11");
	static Class358 aClass358_4145 = new Class358("29");
	static Class358 aClass358_4146 = new Class358("1");
	static Class358 aClass358_4147 = new Class358("26");
	static Class358 aClass358_4148 = new Class358("4");
	static Class358 aClass358_4143 = new Class358("28");
	static Class358 aClass358_4131 = new Class358("20");
	static Class358 aClass358_4149 = new Class358("32");
	static Class358 aClass358_4152 = new Class358("22");
	static Class358 aClass358_4153 = new Class358("27");
	static Class358 aClass358_4154 = new Class358("17");
	static Class358 aClass358_4155 = new Class358("3");
	static Class358 aClass358_4130 = new Class358("30");
	static Class358 aClass358_4157 = new Class358("13");
	static Class358 aClass358_4132 = new Class358("7");

	static void method6234() {
		Class299.aClass229_3545.method3859();
	}

	static void method6235(byte[] bytes_0) {
		ByteBuf rsbytebuffer_2 = new ByteBuf(bytes_0);
		while (true) {
			int i_3 = rsbytebuffer_2.readUnsignedByte();
			if (i_3 == 0)
				return;
			if (i_3 == 1) {
				int[] ints_4 = ScriptRunner.anIntArray2668 = new int[6];
				ints_4[0] = rsbytebuffer_2.readUnsignedShort();
				ints_4[1] = rsbytebuffer_2.readUnsignedShort();
				ints_4[2] = rsbytebuffer_2.readUnsignedShort();
				ints_4[3] = rsbytebuffer_2.readUnsignedShort();
				ints_4[4] = rsbytebuffer_2.readUnsignedShort();
				ints_4[5] = rsbytebuffer_2.readUnsignedShort();
			}
		}
	}

	public static void method6240() {
		Class148.anInt1730 = 1;
		CutsceneEntity.aClass317_746 = null;
		Friend.anInt46 = -1;
		Class148.anInt1738 = -1;
		Node_Sub33.aNode_Sub15_Sub2_7836 = null;
		Class158_Sub2_Sub3.anInt10243 = 0;
		Class152.aBool1962 = false;
		CutsceneAction_Sub22.anInt9440 = 2;
		Class11.aClass109_121 = null;
	}

	public String aString4159;

	Class358(String string_2) {
		aString4159 = string_2;
	}
}
