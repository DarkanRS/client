public final class Class439 {

	Class439() throws Throwable {
		throw new Error();
	}

	public static void method7343(int i_0, int i_1) {
		IComponentDefinitions.aClass229_1280.method3858(i_0, (byte) 2);
		IComponentDefinitions.aClass229_1341.method3858(i_0, (byte) 35);
		IComponentDefinitions.aClass229_1303.method3858(i_0, (byte) 34);
		IComponentDefinitions.aClass229_1282.method3858(i_0, (byte) -52);
	}

	static final void routeToSceneObject(int i_0, int i_1, long long_2) {
		int i_4 = (int) long_2 >> 14 & 0x1f;
		int i_5 = (int) long_2 >> 20 & 0x3;
		int i_6 = (int) (long_2 >>> 32) & 0x7fffffff;
		SceneObjectType sceneobjecttype_7 = (SceneObjectType) Class386.method6672(Class2.method262((byte) -1), i_4, -917234900);
		RouteStrategy routestrategy_8;
		if (sceneobjecttype_7 != SceneObjectType.SCENERY_INTERACT && sceneobjecttype_7 != SceneObjectType.GROUND_INTERACT && sceneobjecttype_7 != SceneObjectType.GROUND_DECORATION) {
			if (Class308.isWall(sceneobjecttype_7.type, 1861080465)) {
				routestrategy_8 = JS5CacheFile.method3354(i_0, i_1, 0, 0, sceneobjecttype_7, i_5, 1608795477);
			} else {
				routestrategy_8 = Class148.method2551(i_0, i_1, 0, 0, sceneobjecttype_7, i_5, 960380494);
			}
		} else {
			ObjectDefinitions objectdefinitions_9 = IndexLoaders.MAP_REGION_DECODER.method4436(-1792559044).getObjectDefinitions(i_6, 65280);
			int i_10;
			int i_11;
			if (i_5 != 0 && i_5 != 2) {
				i_10 = objectdefinitions_9.sizeY;
				i_11 = objectdefinitions_9.sizeX;
			} else {
				i_10 = objectdefinitions_9.sizeX;
				i_11 = objectdefinitions_9.sizeY;
			}

			routestrategy_8 = JS5CacheFile.method3354(i_0, i_1, i_10, i_11, SceneObjectType.WALL_STRAIGHT, 0, 1608795477);
		}

		MapRegion.routeTo(i_0, i_1, true, routestrategy_8, 2130368133);
	}

}
