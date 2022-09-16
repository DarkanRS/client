package com.jagex;

class Class17 implements Interface25 {

	public static int anInt148;

	static void method570() {
		int i_1 = 0;
		SceneObjectManager sceneobjectmanager_2 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
		for (int i_3 = 0; i_3 < IndexLoaders.MAP_REGION_DECODER.getSizeX(); i_3++)
			for (int i_4 = 0; i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeY(); i_4++) {
				if (JS5Manager.method5492(sceneobjectmanager_2.aClass293ArrayArrayArray2604, i_1, i_3, i_4, true))
					++i_1;
				if (i_1 >= 512)
					return;
			}
	}

	@Override
	public boolean method182(GraphNode_Sub1_Sub1 class521_sub1_sub1_1) {
		return class521_sub1_sub1_1 instanceof WorldObject;
	}

	@Override
	public boolean method183(GraphNode_Sub1_Sub1 class521_sub1_sub1_1) {
		return class521_sub1_sub1_1 instanceof WorldObject;
	}
}
