public class Class530 {

	public static boolean aBool7050;

	CoordGrid aClass219_7048;

	int anInt7047;

	int anInt7049;

	int method11343() {
		return client.anIntArray7230[this.anInt7047];
	}

	public SceneObject method11344() {
		SceneObject sceneobject_2 = this.method11348();
		return sceneobject_2 == null ? null : (sceneobject_2.getId(416174941) != this.anInt7049 ? null : sceneobject_2);
	}

	public Class530(CoordGrid coordgrid_1, int i_2, int i_3, int i_4) {
		this.aClass219_7048 = coordgrid_1;
		this.anInt7047 = i_2;
		this.anInt7049 = i_4;
	}

	SceneObject method11348() {
		int i_2 = this.aClass219_7048.level;
		CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
		int i_4 = this.aClass219_7048.x - coordgrid_3.x;
		int i_5 = this.aClass219_7048.y - coordgrid_3.y;
		if (i_4 >= 0 && i_5 >= 0 && i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
			switch (this.method11343()) {
			case 0:
				return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1288178726).getWall(i_2, i_4, i_5, (byte) -33);
			case 1:
				return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-2014086808).getWallDecoration(i_2, i_4, i_5, (byte) 45);
			case 2:
				return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1571764476).getInteractableObject(i_2, i_4, i_5, client.anInterface25_7446);
			case 3:
				return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1684834400).getGroundDecoration(i_2, i_4, i_5);
			default:
				return null;
			}
		} else {
			return null;
		}
	}

	static Class106[] method11352() {
		return new Class106[] { Class106.aClass106_1072, Class106.aClass106_1073, Class106.aClass106_1070, Class106.aClass106_1074, Class106.aClass106_1075 };
	}

	static Class204[] method11353() {
		return new Class204[] { Class204.aClass204_2578, Class204.aClass204_2579 };
	}

	public static Class357 method11354(RsByteBuffer rsbytebuffer_0) {
		Class357 class357_2 = Class258.method4570(rsbytebuffer_0, 2052241851);
		int i_3 = rsbytebuffer_0.read24BitInteger(1307039132);
		return new Class357_Sub1(class357_2.anInt4124, class357_2.aClass356_4121, class357_2.aClass353_4122, class357_2.anInt4123, class357_2.anInt4120, i_3);
	}
}
