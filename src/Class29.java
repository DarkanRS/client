public class Class29 {

	Class30 aClass30_354;
	Index aClass317_352;
	Index aClass317_353;

	public Interface2 method781(Interface3 interface3_1, int i_2) {
		if (interface3_1 == null) {
			return null;
		} else {
			Class60 class60_3 = interface3_1.method24(-2039586573);
			return (Interface2) (class60_3 == Class60.aClass60_609 ? new Class46((Class366) interface3_1) : (class60_3 == Class60.aClass60_605 ? new Class28(this.method782(-472205430), (Class365) interface3_1) : (class60_3 == Class60.aClass60_606 ? new Class42(this.aClass317_352, (Class357) interface3_1) : (class60_3 == Class60.aClass60_607 ? new Class42_Sub1(this.aClass317_352, (Class357_Sub1) interface3_1) : (class60_3 == Class60.aClass60_602 ? new Class52_Sub3(this.aClass317_352, this.aClass317_353, (Class350_Sub2) interface3_1) : (class60_3 == Class60.aClass60_603 ? new Class52_Sub1(this.aClass317_352, this.aClass317_353, (Class350_Sub1) interface3_1) : (class60_3 == Class60.aClass60_608 ? new Class52_Sub2(this.aClass317_352, this.aClass317_353, (Class350_Sub3) interface3_1) : (class60_3 == Class60.aClass60_604 ? new Class51(this.aClass317_352, this.aClass317_353, (Class62) interface3_1) : (class60_3 == Class60.aClass60_601 ? new Class43(this.aClass317_352, (Class351) interface3_1) : (class60_3 == Class60.aClass60_610 ? new Class52_Sub2_Sub1(this.aClass317_352, this.aClass317_353, (Class350_Sub3_Sub1) interface3_1) : null))))))))));
		}
	}

	Class30 method782(int i_1) {
		if (this.aClass30_354 == null) {
			this.aClass30_354 = new Class30();
		}

		return this.aClass30_354;
	}

	public Class29(Index index_1, Index index_2) {
		this.aClass317_352 = index_1;
		this.aClass317_353 = index_2;
	}

	static final void method786(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		boolean bool_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		if (bool_4 != icomponentdefinitions_0.aBool1306) {
			icomponentdefinitions_0.aBool1306 = bool_4;
			Class109.method1858(icomponentdefinitions_0, (byte) -3);
		}

		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class78.method1389(icomponentdefinitions_0.idHash, -626903266);
		}

	}

	static final void method787(CS2Executor cs2executor_0, byte b_1) {
		Class282_Sub36 class282_sub36_2 = Class540.method11595(-1576243923);
		if (class282_sub36_2 == null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class282_sub36_2.anInt7991;
			int i_3 = class282_sub36_2.anInt7988 << 28 | class282_sub36_2.anInt7987 + Class291.anInt3472 << 14 | class282_sub36_2.anInt7993 + Class291.anInt3473;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_3;
		}

	}

	static void deleteItemContainer(int key, boolean negativeKey, int i_2) {
		ItemContainer container = CS2Runner.getItemContainer(key, negativeKey);
		if (container != null) {
			container.remove();
		}

	}

	static final void method789(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		if (icomponentdefinitions_0.anInt1268 == 5) {
			Class306.method5459(icomponentdefinitions_0, interface_1, cs2executor_2, -1486072931);
		}

	}

}
