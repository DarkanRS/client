public class Class359 {

	static int anInt4163;

	Class359() throws Throwable {
		throw new Error();
	}

	static void decodePlayerCounts(RsByteBuffer rsbytebuffer_0) {
		for (int i_2 = 0; i_2 < Class4.WORLD_LIST_SIZE; i_2++) {
			int worldId = rsbytebuffer_0.readUnsignedSmart();
			int playerCount = rsbytebuffer_0.readUnsignedShort();
			if (playerCount == 65535) {
				playerCount = -1;
			}
			if (Class244.WORLD_LIST_DESCRIPTORS[worldId] != null) {
				Class244.WORLD_LIST_DESCRIPTORS[worldId].playerCount = playerCount;
			}
		}
	}

	static final void method6244(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1289 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1375 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 14);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
		if (icomponentdefinitions_0.type == 0) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -1114649951);
		}
	}
}
