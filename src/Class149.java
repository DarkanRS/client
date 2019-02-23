public abstract class Class149 {

	static int anInt1744;
	int anInt1743;
	int anInt1741;
	int anInt1742;

	abstract void method2555(int var1, int var2);

	Class149(int i_1, int i_2, int i_3) {
		this.anInt1743 = i_1;
		this.anInt1741 = i_2;
		this.anInt1742 = i_3;
	}

	abstract void method2556(int var1, int var2, int var3);

	abstract void method2557(int var1, int var2, byte var3);

	abstract void method2558(int var1, int var2);

	abstract void method2559(int var1, int var2);

	abstract void method2560(int var1, int var2);

	abstract void method2561(int var1, int var2, int var3);

	abstract void method2562(int var1, int var2);

	static final void method2563(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class96_Sub18.method14664(icomponentdefinitions_3, interface_4, true, 0, cs2executor_0, (byte) -16);
	}

	static final void method2564(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 82);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class44.method910(icomponentdefinitions_3, interface_4, cs2executor_0, 1996171820);
	}

	static int method2565(CharSequence charsequence_0, char var_1, int i_2) {
		int i_3 = 0;
		int i_4 = charsequence_0.length();

		for (int i_5 = 0; i_5 < i_4; i_5++) {
			if (charsequence_0.charAt(i_5) == var_1) {
				++i_3;
			}
		}

		return i_3;
	}

	static final void method2566(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (client.anInt7166 == 0 && !JS5CacheFile.method3360((byte) 72)) {
			if (string_2.length() > 20) {
				client.aByte7458 = -4;
			} else {
				client.aByte7458 = -1;
				TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4624, client.aClass184_7218.isaac, 1473933655);
				tcpmessage_3.buffer.writeByte(0);
				int i_4 = tcpmessage_3.buffer.index;
				tcpmessage_3.buffer.writeString(string_2);
				tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, -1911140874);
				client.aClass184_7218.method3049(tcpmessage_3, -861728727);
			}
		} else {
			client.aByte7458 = -5;
		}

	}

	static final void method2567(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class463.method7729(icomponentdefinitions_3, interface_4, cs2executor_0, 1735506761);
	}

	static final void method2568(CS2Executor cs2executor_0, byte b_1) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub26_8224, cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1 ? 1 : 0, -2145743553);
		Class190.method3148((byte) 49);
		client.aBool7175 = false;
	}

}
