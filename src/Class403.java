public class Class403 {

	Class403() throws Throwable {
		throw new Error();
	}

	public static ClipMap createClipMap(int i_0, int i_1, byte b_2) {
		ClipMap clipmap_3 = new ClipMap();
		clipmap_3.offsetX = -1;
		clipmap_3.offsetY = -1;
		clipmap_3.sizeX = i_0 + 1 + 5;
		clipmap_3.sizeY = i_1 + 1 + 5;
		clipmap_3.map = new int[clipmap_3.sizeX][clipmap_3.sizeY];
		clipmap_3.method5965((byte) 5);
		return clipmap_3;
	}

	static final void method6802(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class237.method3987(icomponentdefinitions_3, interface_4, cs2executor_0, -669419549);
	}

	public static void method6803(Index index_0, Index index_1, Index index_2, Index index_3, int i_4) {
		Class388.INTERFACE_INDEX = index_0;
		Class488.MESH_INDEX = index_1;
		Class463.SPRITES_INDEX = index_2;
		Class468_Sub8.aClass98Array7889 = new Interface[Class388.INTERFACE_INDEX.containersCount()];
		WorldMapIndexLoader.aBoolArray2709 = new boolean[Class388.INTERFACE_INDEX.containersCount()];
	}

}
