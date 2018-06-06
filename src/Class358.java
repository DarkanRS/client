/* Class358 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class358 {
	static Class358 aClass358_4125;
	static Class358 aClass358_4126;
	static Class358 aClass358_4127;
	static Class358 aClass358_4128;
	static Class358 aClass358_4129;
	static Class358 aClass358_4130;
	static Class358 aClass358_4131;
	static Class358 aClass358_4132;
	static Class358 aClass358_4133;
	static Class358 aClass358_4134;
	static Class358 aClass358_4135;
	static Class358 aClass358_4136 = new Class358("9", "9");
	static Class358 aClass358_4137;
	static Class358 aClass358_4138;
	static Class358 aClass358_4139;
	static Class358 aClass358_4140;
	static Class358 aClass358_4141;
	static Class358 aClass358_4142;
	static Class358 aClass358_4143;
	public static Class358 aClass358_4144;
	static Class358 aClass358_4145;
	static Class358 aClass358_4146;
	static Class358 aClass358_4147;
	static Class358 aClass358_4148;
	static Class358 aClass358_4149;
	static Class358 aClass358_4150;
	static Class358 aClass358_4151;
	static Class358 aClass358_4152;
	static Class358 aClass358_4153;
	static Class358 aClass358_4154;
	static Class358 aClass358_4155;
	static Class358 aClass358_4156;
	static Class358 aClass358_4157;
	public static Class358 aClass358_4158;
	public String aString4159;

	static {
		aClass358_4126 = new Class358("24", "24");
		aClass358_4127 = new Class358("15", "15");
		aClass358_4140 = new Class358("8", "8");
		aClass358_4129 = new Class358("18", "18");
		aClass358_4125 = new Class358("16", "16");
		aClass358_4142 = new Class358("6", "6");
		aClass358_4150 = new Class358("35", "35");
		aClass358_4133 = new Class358("14", "14");
		aClass358_4156 = new Class358("5", "5");
		aClass358_4137 = new Class358("31", "31");
		aClass358_4128 = new Class358("23", "23");
		aClass358_4151 = new Class358("10", "10");
		aClass358_4138 = new Class358("34", "34");
		aClass358_4139 = new Class358("33", "33");
		aClass358_4135 = new Class358("2", "2");
		aClass358_4141 = new Class358("25", "25");
		aClass358_4134 = new Class358("11", "11");
		aClass358_4158 = new Class358("12", "12");
		aClass358_4144 = new Class358("21", "21");
		aClass358_4145 = new Class358("29", "29");
		aClass358_4146 = new Class358("1", "1");
		aClass358_4147 = new Class358("26", "26");
		aClass358_4148 = new Class358("4", "4");
		aClass358_4143 = new Class358("28", "28");
		aClass358_4131 = new Class358("20", "20");
		aClass358_4149 = new Class358("32", "32");
		aClass358_4152 = new Class358("22", "22");
		aClass358_4153 = new Class358("27", "27");
		aClass358_4154 = new Class358("17", "17");
		aClass358_4155 = new Class358("3", "3");
		aClass358_4130 = new Class358("30", "30");
		aClass358_4157 = new Class358("13", "13");
		aClass358_4132 = new Class358("7", "7");
	}

	Class358(String string, String string_0_) {
		aString4159 = string_0_;
	}

	static void method6234(byte i) {
		Class299.aClass229_3545.method3859(-1558417289);
	}

	static void method6235(byte[] is, byte i) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (i_1_ == 0)
				break;
			if (i_1_ == 1) {
				int[] is_2_ = Class210.anIntArray2668 = new int[6];
				is_2_[0] = class282_sub35.readUnsignedShort();
				is_2_[1] = class282_sub35.readUnsignedShort();
				is_2_[2] = class282_sub35.readUnsignedShort();
				is_2_[3] = class282_sub35.readUnsignedShort();
				is_2_[4] = class282_sub35.readUnsignedShort();
				is_2_[5] = class282_sub35.readUnsignedShort();
			}
		}
	}

	static final void method6236(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 682349813 * class118.anInt1336;
	}

	static final void method6237(CS2Executor class527, int i) {
		int i_3_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		ChatLine class108 = Class180.method3032(i_3_, (byte) -1);
		String string = "";
		if (class108 != null && null != class108.crownedName)
			string = class108.crownedName;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method6238(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7465 ? 1 : 0;
	}

	static final void method6239(CS2Executor class527, int i) {
		Class282_Sub20_Sub25.method15393(true, 1862489719);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -87);
		Class190.method3148((byte) 74);
		client.aBool7175 = false;
	}

	public static void method6240(int i, int i_4_) {
		Class148.anInt1730 = 800770715;
		Class75.aClass317_746 = null;
		Class6.anInt46 = 26560111;
		Class148.anInt1738 = -275076647;
		Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
		Class158_Sub2_Sub3.anInt10243 = 0;
		Class152.aBool1962 = false;
		Class96_Sub22.anInt9440 = -465842921 * i;
		Class11.aClass109_121 = null;
	}
}
