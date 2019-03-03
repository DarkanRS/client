public class Class249 implements Interface43 {

	public static Class249 aClass249_3083 = new Class249((byte) -1);
	public static Class249 aClass249_3082 = new Class249((byte) 0);
	public static Class249 aClass249_3084 = new Class249((byte) 1);
	public static Class249 aClass249_3086 = new Class249((byte) 2);
	public byte aByte3085;

	public int method243(byte b_1) {
		return this.aByte3085;
	}

	public int method4268(int i_1) {
		return this.aByte3085 + 1;
	}

	public int method76() {
		return this.aByte3085;
	}

	public int method75() {
		return this.aByte3085;
	}

	Class249(byte b_1) {
		this.aByte3085 = b_1;
	}

	static final void method4276(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 6;
		icomponentdefinitions_0.anInt1293 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1334 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1385 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		icomponentdefinitions_0.anInt1336 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		icomponentdefinitions_0.anInt1337 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 4];
		icomponentdefinitions_0.anInt1343 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 5];
		Class109.method1858(icomponentdefinitions_0, (byte) 60);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class106.method1818(icomponentdefinitions_0.idHash, -1101705065);
			Item.method12575(icomponentdefinitions_0.idHash, (byte) 9);
		}

	}

	static final void method4277(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1426;
	}

	static final void method4278(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		Class402.method6798(string_2, (short) -15782);
	}

	static final void method4279(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class293.method5206(-2045199626);
	}

	static final void method4280(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		boolean bool_5;
		if (cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1) {
			bool_5 = true;
		} else {
			bool_5 = false;
		}

		icomponentdefinitions_0.aBool1325 = bool_5;
		Class109.method1858(icomponentdefinitions_0, (byte) 40);
	}

	static final void method4281(Animable animable_0, int i_1) {
		int i_2 = animable_0.anInt10342 - client.cycles;
		int i_3 = animable_0.anInt10326 * 512 + animable_0.getSize(828768449) * 256;
		int i_4 = animable_0.anInt10328 * 512 + animable_0.getSize(828768449) * 256;
		Vector3 vector3_5 = animable_0.method11166().aClass385_3595;
		animable_0.method11172((float) ((int) vector3_5.x + (i_3 - (int) vector3_5.x) / i_2), (float) ((int) vector3_5.y), (float) ((int) vector3_5.z + (i_4 - (int) vector3_5.z) / i_2));
		animable_0.anInt10366 = 0;
		animable_0.method15863(animable_0.anInt10346, 1692779087);
	}

	public static boolean method4282(String string_0, byte b_1) {
		if (string_0 == null) {
			return false;
		} else {
			for (int i_2 = 0; i_2 < client.anInt7449; i_2++) {
				if (string_0.equalsIgnoreCase(client.aClass6Array7452[i_2].aString37)) {
					return true;
				}
			}

			return string_0.equalsIgnoreCase(Class84.myPlayer.displayName);
		}
	}

	static final void method4283(CS2Executor cs2executor_0, short s_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		DefaultsFile.method11221(icomponentdefinitions_3, interface_4, cs2executor_0, -2007218506);
	}

}
