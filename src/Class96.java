public abstract class Class96 {

	public int anInt992;

	public abstract void method1592(int var1);

	void method1593(byte b_1) {
	}

	Class96(RsByteBuffer rsbytebuffer_1) {
		this.anInt992 = rsbytebuffer_1.readUnsignedShort();
	}

	boolean method1599(int i_1) {
		return true;
	}

	public abstract void method1601();

	static final void method1603(CS2Executor cs2executor_0, int i_1) {
		Class184 class184_2 = Class468_Sub20.method12807(-846822027);
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4591, class184_2.isaac, -312926267);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(3);
		tcpmessage_3.buffer.writeShort(cs2executor_0.aClass346_7009.anInt4048, 1417031095);
		cs2executor_0.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_3.buffer, cs2executor_0.aClass346_7009.anIntArray4046, -1204920325);
		tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, -2062129936);
		class184_2.method3049(tcpmessage_3, 2118885707);
	}

	static final void method1604(CS2Executor cs2executor_0, byte b_1) {
		System.out.println(cs2executor_0.stringStack[--cs2executor_0.stringStackPtr]);
	}

	public static Interface method1605(int i_0, byte b_1) {
		return Class468_Sub8.aClass98Array7889[i_0 >> 16];
	}

	static final void method1606(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class282_Sub17_Sub4.method15409(icomponentdefinitions_3, interface_4, cs2executor_0, -674550702);
	}

	public static void method1607(byte b_0) {
		Class61.aClass160_647 = null;
		Class60.aClass160_612 = null;
		Class467.aClass160_5576 = null;
		ParamDefinitions.aClass160_5339 = null;
		Class290.aClass160_3452 = null;
		Class354.aClass160_4110 = null;
		Class125.aClass160_1571 = null;
		Class149_Sub2.aClass160_9315 = null;
		Class186.aClass8_2348 = null;
		Class176.aClass414_2200 = null;
	}

	static final void method1608(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (Class467.aClass173Array5575 != null && i_2 < Class459.anInt5534 && Class467.aClass173Array5575[i_2].aString2127.equalsIgnoreCase(Class84.myPlayer.displayName)) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static final String method1609(String string_0, String string_1, String string_2, int i_3) {
		for (int i_4 = string_0.indexOf(string_1); i_4 != -1; i_4 = string_0.indexOf(string_1, i_4 + string_2.length())) {
			string_0 = string_0.substring(0, i_4) + string_2 + string_0.substring(i_4 + string_1.length());
		}

		return string_0;
	}

}
