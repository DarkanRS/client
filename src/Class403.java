public class Class403 {

	Class403() throws Throwable {
		throw new Error();
	}

	public static ClipMap createClipMap(int i_0, int i_1) {
		ClipMap clipmap_3 = new ClipMap();
		clipmap_3.offsetX = -1;
		clipmap_3.offsetY = -1;
		clipmap_3.sizeX = i_0 + 1 + 5;
		clipmap_3.sizeY = i_1 + 1 + 5;
		clipmap_3.map = new int[clipmap_3.sizeX][clipmap_3.sizeY];
		clipmap_3.method5965();
		return clipmap_3;
	}

	public static void method6803(Index index_0, Index index_1, Index index_2, Index index_3) {
		Class388.INTERFACE_INDEX = index_0;
		Class488.MESH_INDEX = index_1;
		Class463.SPRITES_INDEX = index_2;
		Class468_Sub8.INTERFACES = new RSInterface[Class388.INTERFACE_INDEX.containersCount()];
		MapAreaIndexLoader.INTERFACES_LOADED = new boolean[Class388.INTERFACE_INDEX.containersCount()];
	}
}
