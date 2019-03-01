public class Class468_Sub13 extends Class468 {

	public Class468_Sub13(int i_1, Class282_Sub54 class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12712(byte b_1) {
		if (this.anInt5578 < 0 && this.anInt5578 > 127) {
			this.anInt5578 = this.method7781(1905000313);
		}

	}

	public Class468_Sub13(Class282_Sub54 class282_sub54_1) {
		super(class282_sub54_1);
	}

	int method7785(int i_1, int i_2) {
		return 1;
	}

	void method7783(int i_1, int i_2) {
		this.anInt5578 = i_1;
	}

	public int method12714(int i_1) {
		return this.anInt5578;
	}

	int method7786() {
		return 127;
	}

	int method7784(int i_1) {
		return 1;
	}

	int method7787() {
		return 127;
	}

	int method7781(int i_1) {
		return 127;
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	static final void method12718(CS2Executor cs2executor_0, int i_1) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub13_8193, cs2executor_0.intStack[--cs2executor_0.intStackPtr], -1898562251);
		Class190.savePreferences((byte) 49);
		client.aBool7175 = false;
	}

	static final void method12719(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		Class96_Sub18.method14664(icomponentdefinitions_4, interface_5, false, 0, cs2executor_0, (byte) -113);
	}

}
