public class Class530 {

	public static boolean aBool7050;
	CoordGrid aClass219_7048;
	int anInt7047;
	int anInt7049;

	int method11343(int i_1) {
		return client.anIntArray7230[this.anInt7047];
	}

	public SceneObject method11344(byte b_1) {
		SceneObject sceneobject_2 = this.method11348((short) 17190);
		return sceneobject_2 == null ? null : (sceneobject_2.getId(416174941) != this.anInt7049 ? null : sceneobject_2);
	}

	public Class530(CoordGrid coordgrid_1, int i_2, int i_3, int i_4) {
		this.aClass219_7048 = coordgrid_1;
		this.anInt7047 = i_2;
		this.anInt7049 = i_4;
	}

	SceneObject method11348(short s_1) {
		int i_2 = this.aClass219_7048.level;
		CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1217612419);
		int i_4 = this.aClass219_7048.x - coordgrid_3.x;
		int i_5 = this.aClass219_7048.y - coordgrid_3.y;
		if (i_4 >= 0 && i_5 >= 0 && i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeX(-444629403) && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-343963365)) {
			switch (this.method11343(-1790322453)) {
			case 0:
				return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1288178726).getWall(i_2, i_4, i_5, (byte) -33);
			case 1:
				return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-2014086808).getWallDecoration(i_2, i_4, i_5, (byte) 45);
			case 2:
				return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1571764476).getInteractableObject(i_2, i_4, i_5, client.anInterface25_7446, -233664382);
			case 3:
				return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1684834400).getGroundDecoration(i_2, i_4, i_5, -387297653);
			default:
				return null;
			}
		} else {
			return null;
		}
	}

	static final void method11350(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1293;
	}

	static final void method11351(CS2Executor cs2executor_0) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub2_8205.method7785(i_2, -1569082845);
	}

	static Class106[] method11352(int i_0) {
		return new Class106[] { Class106.aClass106_1072, Class106.aClass106_1073, Class106.aClass106_1070, Class106.aClass106_1074, Class106.aClass106_1075 };
	}

	static Class204[] method11353(int i_0) {
		return new Class204[] { Class204.aClass204_2578, Class204.aClass204_2579 };
	}

	public static Class357 method11354(RsByteBuffer rsbytebuffer_0, int i_1) {
		Class357 class357_2 = Class258.method4570(rsbytebuffer_0, 2052241851);
		int i_3 = rsbytebuffer_0.read24BitInteger(1307039132);
		return new Class357_Sub1(class357_2.anInt4124, class357_2.aClass356_4121, class357_2.aClass353_4122, class357_2.anInt4123, class357_2.anInt4120, i_3);
	}

	static final void method11355(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (client.aString7426 != null && i_2 < Class459.anInt5534) {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = Class467.aClass173Array5575[i_2].aString2130;
		} else {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = "";
		}

	}

}
