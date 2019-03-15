public abstract class Class282_Sub17 extends Node {

	abstract void method12249(RsByteBuffer var1);

	abstract void method12250(RsByteBuffer var1);

	abstract void method12251(Class61 var1);

	abstract void method12252(Class61 var1);

	abstract void method12253(RsByteBuffer var1);

	abstract void method12254(Class61 var1);

	abstract void method12255(Class61 var1);

	abstract void method12256(Class61 var1);

	abstract void method12257(RsByteBuffer var1);

	abstract void method12258(Class61 var1);

	public static boolean lobbyState(int i_0, int i_1) {
		return i_0 == 0 || i_0 == 2 || i_0 == 7 || i_0 == 6;
	}

	static final void method12260(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.baseWidth = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.baseHeight = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1417 = 0;
		icomponentdefinitions_0.anInt1326 = 0;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		if (i_4 < 0) {
			i_4 = 0;
		} else if (i_4 > 4) {
			i_4 = 4;
		}

		int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		if (i_5 < 0) {
			i_5 = 0;
		} else if (i_5 > 4) {
			i_5 = 4;
		}

		icomponentdefinitions_0.aByte1368 = (byte) i_4;
		icomponentdefinitions_0.aByte1294 = (byte) i_5;
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -29);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
		if (icomponentdefinitions_0.type == 0) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -610252618);
		}

	}

}
