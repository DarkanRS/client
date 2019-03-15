public class Class29 {

	Class30 aClass30_354;

	Index aClass317_352;

	Index aClass317_353;

	public Interface2 method781(Interface3 interface3_1) {
		if (interface3_1 == null) {
			return null;
		} else {
			Class60 class60_3 = interface3_1.method24();
			return (Interface2) (class60_3 == Class60.aClass60_609 ? new Class46((Class366) interface3_1) : (class60_3 == Class60.aClass60_605 ? new Class28(this.method782(), (Class365) interface3_1) : (class60_3 == Class60.aClass60_606 ? new Class42(this.aClass317_352, (Class357) interface3_1) : (class60_3 == Class60.aClass60_607 ? new Class42_Sub1(this.aClass317_352, (Class357_Sub1) interface3_1) : (class60_3 == Class60.aClass60_602 ? new Class52_Sub3(this.aClass317_352, this.aClass317_353, (Class350_Sub2) interface3_1) : (class60_3 == Class60.aClass60_603 ? new Class52_Sub1(this.aClass317_352, this.aClass317_353, (Class350_Sub1) interface3_1) : (class60_3 == Class60.aClass60_608 ? new Class52_Sub2(this.aClass317_352, this.aClass317_353, (Class350_Sub3) interface3_1) : (class60_3 == Class60.aClass60_604 ? new Class51(this.aClass317_352, this.aClass317_353, (Class62) interface3_1) : (class60_3 == Class60.aClass60_601 ? new Class43(this.aClass317_352, (Class351) interface3_1) : (class60_3 == Class60.aClass60_610 ? new Class52_Sub2_Sub1(this.aClass317_352, this.aClass317_353, (Class350_Sub3_Sub1) interface3_1) : null))))))))));
		}
	}

	Class30 method782() {
		if (this.aClass30_354 == null) {
			this.aClass30_354 = new Class30();
		}
		return this.aClass30_354;
	}

	public Class29(Index index_1, Index index_2) {
		this.aClass317_352 = index_1;
		this.aClass317_353 = index_2;
	}

	static final void method786(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		boolean bool_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		if (bool_4 != icomponentdefinitions_0.hidden) {
			icomponentdefinitions_0.hidden = bool_4;
			Class109.redrawComponent(icomponentdefinitions_0, (byte) -3);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class78.method1389(icomponentdefinitions_0.idHash);
		}
	}

	static void deleteItemContainer(int key, boolean negativeKey) {
		ItemContainer container = CS2Runner.getItemContainer(key, negativeKey);
		if (container != null) {
			container.remove();
		}
	}

	static final void method789(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		if (icomponentdefinitions_0.type == 5) {
			Class306.method5459(icomponentdefinitions_0, interface_1, cs2executor_2, -1486072931);
		}
	}
}
