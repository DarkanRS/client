public class Class6 {

	public String aString37;
	public boolean aBool38;
	public int anInt39;
	public String aString40;
	public int anInt41;
	public int anInt42;
	public String aString43;
	public int anInt44;
	static int anInt46;

	static final void method298(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 2;
		if (cs2executor_0.intStack[cs2executor_0.intStackPtr] >= cs2executor_0.intStack[cs2executor_0.intStackPtr + 1]) {
			cs2executor_0.instrPtr += cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		}

	}

	static final void method299(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class163.mouseRecorder.method3570(756095591);
	}

	static final void method300(CS2Executor cs2executor_0, byte b_1) {
		NPC npc_2 = (NPC) cs2executor_0.animable;
		boolean bool_3 = false;
		NPCDefinitions npcdefinitions_4 = npc_2.definitions;
		if (npcdefinitions_4.anIntArray4886 != null) {
			npcdefinitions_4 = npcdefinitions_4.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER, 265881693);
		}

		if (npcdefinitions_4 != null) {
			bool_3 = npcdefinitions_4.aBool4893;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = bool_3 ? 1 : 0;
	}

	static final void method301(CS2Executor cs2executor_0, short s_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class9.anInt106;
	}

	static boolean method302(Interface17 interface17_0, MouseRecord class282_sub53_1, int i_2) {
		return interface17_0 != null && interface17_0.method127(class282_sub53_1, client.anInterface16Array7298, client.maximumHeldKeys, Class96_Sub21.keyRecorder, (byte) 2);
	}

	static void method303(int i_0, int i_1, int i_2, int i_3) {
		if (i_0 == 1008) {
			Class210.method3614(Class397.aClass397_4801, i_1, i_2, (byte) 87);
		} else if (i_0 == 1009) {
			Class210.method3614(Class397.aClass397_4793, i_1, i_2, (byte) 9);
		} else if (i_0 == 1010) {
			Class210.method3614(Class397.aClass397_4794, i_1, i_2, (byte) 89);
		} else if (i_0 == 1011) {
			Class210.method3614(Class397.aClass397_4795, i_1, i_2, (byte) 66);
		} else if (i_0 == 1012) {
			Class210.method3614(Class397.aClass397_4796, i_1, i_2, (byte) 21);
		}

	}

	public static int method304(int i_0) {
		return (double) Class291_Sub1.aFloat3462 == 3.0D ? 37 : ((double) Class291_Sub1.aFloat3462 == 4.0D ? 50 : ((double) Class291_Sub1.aFloat3462 == 6.0D ? 75 : ((double) Class291_Sub1.aFloat3462 == 8.0D ? 100 : 200)));
	}

	static final void method305(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 121);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class349.method6186(icomponentdefinitions_3, interface_4, cs2executor_0, -94301647);
	}

}
