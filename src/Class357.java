public class Class357 implements Interface3 {

	public int anInt4124;
	public Class356 aClass356_4121;
	public Class353 aClass353_4122;
	public int anInt4123;
	public int anInt4120;

	public Class60 method24(int i_1) {
		return Class60.aClass60_606;
	}

	Class357(int i_1, Class356 class356_2, Class353 class353_3, int i_4, int i_5) {
		this.anInt4124 = i_1;
		this.aClass356_4121 = class356_2;
		this.aClass353_4122 = class353_3;
		this.anInt4123 = i_4;
		this.anInt4120 = i_5;
	}

	public Class60 method25() {
		return Class60.aClass60_606;
	}

	static final void method6229(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		String string_4 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (i_2 == 99) {
			Class209.method3598(string_4, -914132655);
		} else if (i_2 == 98) {
			QuestDefinitions.method4140(string_4, 2053399101);
		} else {
			Class191.method3167(i_2, i_3, "", "", "", string_4, 30910415);
		}

	}

	static final void method6230(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class521_Sub1_Sub1_Sub6.method16125(i_2, i_3, true, -1743480204);
	}

	static final void method6231(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aClass330Array7428[i_2].method5909(-41459410);
	}

	static final void method6232(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 107);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.aBool1306 ? 1 : 0;
	}

	static final void method6233(byte b_0) {
		int[] ints_1 = Class197.PLAYER_INDICES;

		int i_2;
		for (i_2 = 0; i_2 < Class197.NUM_PLAYER_INDICES; i_2++) {
			Player player_3 = client.players[ints_1[i_2]];
			if (player_3 != null) {
				player_3.method15812(-942538273);
			}
		}

		for (i_2 = 0; i_2 < client.anInt7211; i_2++) {
			long long_6 = (long) client.anIntArray7212[i_2];
			Class282_Sub47 class282_sub47_5 = (Class282_Sub47) client.NPCS.get(long_6);
			if (class282_sub47_5 != null) {
				((Animable) class282_sub47_5.anObject8068).method15812(655110500);
			}
		}

		if (client.anInt7341 == 4) {
			for (i_2 = 0; i_2 < Class82.aClass75Array804.length; i_2++) {
				Class75 class75_8 = Class82.aClass75Array804[i_2];
				if (class75_8.aBool742) {
					class75_8.method1342((byte) 50).method15812(298889820);
				}
			}
		}

	}

}
