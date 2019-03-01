public class Class275_Sub4 extends Class275 {

	int anInt7838 = (int) (Class169.time() / 1000L);
	String aString7837;
	short aShort7839;

	Class275_Sub4(String string_1, int i_2) {
		this.aString7837 = string_1;
		this.aShort7839 = (short) i_2;
	}

	static final void method12585(Class282_Sub31 class282_sub31_0, int i_1) {
		SceneObjectManager sceneobjectmanager_2 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1869632062);
		if (sceneobjectmanager_2 != null) {
			SceneObject sceneobject_3 = null;
			if (class282_sub31_0.anInt7766 == 0) {
				sceneobject_3 = (SceneObject) sceneobjectmanager_2.getWall(class282_sub31_0.anInt7764, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, (byte) 0);
			}

			if (class282_sub31_0.anInt7766 == 1) {
				sceneobject_3 = (SceneObject) sceneobjectmanager_2.getWallDecoration(class282_sub31_0.anInt7764, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, (byte) -42);
			}

			if (class282_sub31_0.anInt7766 == 2) {
				sceneobject_3 = (SceneObject) sceneobjectmanager_2.getInteractableObject(class282_sub31_0.anInt7764, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, client.anInterface25_7446, -233664382);
			}

			if (class282_sub31_0.anInt7766 == 3) {
				sceneobject_3 = (SceneObject) sceneobjectmanager_2.getGroundDecoration(class282_sub31_0.anInt7764, class282_sub31_0.anInt7762, class282_sub31_0.anInt7763, -387297653);
			}

			if (sceneobject_3 != null) {
				class282_sub31_0.anInt7765 = sceneobject_3.getId(109923272);
				class282_sub31_0.anInt7770 = sceneobject_3.method89(696925802);
				class282_sub31_0.anInt7767 = sceneobject_3.method92(-1676463957);
			} else {
				class282_sub31_0.anInt7765 = -1;
				class282_sub31_0.anInt7770 = 0;
				class282_sub31_0.anInt7767 = 0;
			}
		}

	}

	static final void method12586(CS2Executor cs2executor_0, short s_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		Class159.method2738(cs2executor_0.animable.inter, i_2 & 0xffff, i_3, i_4, cs2executor_0.aBool7022, cs2executor_0, -1306169472);
	}

	static void method12587(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[cs2executor_0.intStackPtr - 2] = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[cs2executor_0.intStackPtr - 2], -1396181317).method4105(Class158_Sub1.PLAYER_VAR_PROVIDER, cs2executor_0.intStack[cs2executor_0.intStackPtr - 1], 93625804) ? 1 : 0;
		--cs2executor_0.intStackPtr;
	}

}
