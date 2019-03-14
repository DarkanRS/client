public class Class359 {

	static int anInt4163;

	Class359() throws Throwable {
		throw new Error();
	}

	static void method6241(RsByteBuffer rsbytebuffer_0, int i_1) {
		for (int i_2 = 0; i_2 < Class4.anInt34; i_2++) {
			int i_3 = rsbytebuffer_0.readUnsignedSmart(1888630053);
			int i_4 = rsbytebuffer_0.readUnsignedShort();
			if (i_4 == 65535) {
				i_4 = -1;
			}
			if (Class244.aClass217_Sub1Array3006[i_3] != null) {
				Class244.aClass217_Sub1Array3006[i_3].anInt2701 = i_4;
			}
		}
	}

	static final void method6244(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1289 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1375 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 14);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0, (byte) 1);
		if (icomponentdefinitions_0.type == 0) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -1114649951);
		}
	}
}
