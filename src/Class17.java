final class Class17 implements Interface25 {

	public static int anInt148;

	public boolean method182(Class521_Sub1_Sub1 class521_sub1_sub1_1) {
		return class521_sub1_sub1_1 instanceof SceneObject;
	}

	public boolean method183(Class521_Sub1_Sub1 class521_sub1_sub1_1, int i_2) {
		return class521_sub1_sub1_1 instanceof SceneObject;
	}

	static final void method569(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1362 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 60);
	}

	static final void method570(int i_0) {
		int i_1 = 0;
		SceneObjectManager sceneobjectmanager_2 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1483143416);

		for (int i_3 = 0; i_3 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1126202391); i_3++) {
			for (int i_4 = 0; i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1126245004); i_4++) {
				if (JS5Manager.method5492(sceneobjectmanager_2.aClass293ArrayArrayArray2604, i_1, i_3, i_4, true, (byte) 56)) {
					++i_1;
				}

				if (i_1 >= 512) {
					return;
				}
			}
		}

	}

}
