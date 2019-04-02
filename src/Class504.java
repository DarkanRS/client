public abstract class Class504 {

	public static int anInt5832;

	Class504() throws Throwable {
		throw new Error();
	}

	static final void method8387(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1380 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

	static boolean loadingState(int i_0, byte b_1) {
		return i_0 == 4 || i_0 == 15 || i_0 == 1;
	}

	public static final int method8389(int i_0, int i_1, int i_2, byte b_3) {
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() == null) {
			return 0;
		} else {
			int i_4 = i_0 >> 9;
			int i_5 = i_1 >> 9;
			if (i_4 >= 0 && i_5 >= 0 && i_4 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1 && i_5 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1) {
				int i_6 = i_2;
				if (i_2 < 3 && (IndexLoaders.MAP_REGION_DECODER.method4433().tileMasks[1][i_4][i_5] & 0x2) != 0) {
					i_6 = i_2 + 1;
				}

				return IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aClass390Array2591[i_6].averageHeight(i_0, i_1, 1879647652);
			} else {
				return 0;
			}
		}
	}

	static final void method8390(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 != icomponentdefinitions_0.anInt1320) {
			icomponentdefinitions_0.anInt1320 = i_4;
			Class109.redrawComponent(icomponentdefinitions_0, (byte) 22);
		}

		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class105.method1807(icomponentdefinitions_0.idHash);
		}

	}

}
