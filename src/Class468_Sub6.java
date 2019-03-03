public class Class468_Sub6 extends Preference {

	public void method12653(int i_1) {
		if (this.anInt5578 < 0 || this.anInt5578 > 4) {
			this.anInt5578 = this.method7781(1866918213);
		}

	}

	void method7783(int i_1, int i_2) {
		this.anInt5578 = i_1;
	}

	int method7781(int i_1) {
		return 0;
	}

	int method7785(int i_1, int i_2) {
		return 1;
	}

	int method7784(int i_1) {
		return 1;
	}

	public int method12654(int i_1) {
		return this.anInt5578;
	}

	public Class468_Sub6(Class282_Sub54 class282_sub54_1) {
		super(class282_sub54_1);
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	int method7786() {
		return 0;
	}

	int method7787() {
		return 0;
	}

	public Class468_Sub6(int i_1, Class282_Sub54 class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public static void method12658(int i_0) {
		Class150.method2580(-1, 255, (byte) 34);
	}

	static final void method12659(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		ItemDefinitions.method7142(icomponentdefinitions_4, interface_5, cs2executor_0, -1755364676);
	}

	static final void method12660(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = i_3 >> 14 & 0x3fff;
		int i_5 = i_3 & 0x3fff;
		int i_6 = Class468_Sub11.method12702(i_2, i_4, i_5, -1885188952);
		if (i_6 < 0) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_6;
		}

	}

	static boolean method12661(String string_0, int i_1, byte b_2) {
		return Class186.method3082(string_0, i_1, "openjs", 145298920);
	}

}
