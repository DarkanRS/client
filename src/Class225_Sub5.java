public class Class225_Sub5 extends RouteStrategy {

	int anInt7971;

	SceneObjectType aClass458_7972;

	public boolean method3789(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return clipmap_4.method5986(i_2, i_3, i_1, -1440558477 * this.approxDestinationX * -726719813, 1732585867 * this.approxDestinationY * 1767388707, this.aClass458_7972.method243((byte) 1), this.anInt7971 * -845112339 * 1056438757, (short) -12218);
	}

	public boolean canExit(int i_1, int i_2, int i_3, ClipMap clipmap_4, byte b_5) {
		return clipmap_4.method5986(i_2, i_3, i_1, this.approxDestinationX, this.approxDestinationY, this.aClass458_7972.method243((byte) 1), this.anInt7971, (short) -26880);
	}

	public boolean method3786(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return clipmap_4.method5986(i_2, i_3, i_1, -1440558477 * this.approxDestinationX * -726719813, 1732585867 * this.approxDestinationY * 1767388707, this.aClass458_7972.method243((byte) 1), this.anInt7971 * -845112339 * 1056438757, (short) -30854);
	}

	public boolean method3788(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return clipmap_4.method5986(i_2, i_3, i_1, -1440558477 * this.approxDestinationX * -726719813, 1732585867 * this.approxDestinationY * 1767388707, this.aClass458_7972.method243((byte) 1), this.anInt7971 * -845112339 * 1056438757, (short) -23786);
	}

	public boolean method3785(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return clipmap_4.method5986(i_2, i_3, i_1, -1440558477 * this.approxDestinationX * -726719813, 1732585867 * this.approxDestinationY * 1767388707, this.aClass458_7972.method243((byte) 1), this.anInt7971 * -845112339 * 1056438757, (short) -29453);
	}

	static void method13042(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		SceneObjectManager sceneobjectmanager_9 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1053106228);
		SceneObject sceneobject_10 = (SceneObject) sceneobjectmanager_9.getWall(i_1, i_2, i_3, (byte) -80);
		ObjectDefinitions objectdefinitions_11;
		int i_12;
		int i_13;
		int i_14;
		if (sceneobject_10 != null) {
			objectdefinitions_11 = IndexLoaders.MAP_REGION_DECODER.method4436(-1708238959).getObjectDefinitions(sceneobject_10.getId(1992951281), 65280);
			i_12 = sceneobject_10.method92(-401484615) & 0x3;
			i_13 = sceneobject_10.method89(2041579125);
			if (objectdefinitions_11.mapSpriteId != -1) {
				Class415.method6997(graphicalrenderer_0, objectdefinitions_11, i_12, i_4, i_5, -1222879504);
			} else {
				i_14 = i_6;
				if (objectdefinitions_11.interactable > 0) {
					i_14 = i_7;
				}
				if (i_13 == SceneObjectType.WALL_STRAIGHT.type || i_13 == SceneObjectType.WALL_WHOLE_CORNER.type) {
					if (i_12 == 0) {
						graphicalrenderer_0.method8428(i_4, i_5, 4, i_14, -1796764807);
					} else if (i_12 == 1) {
						graphicalrenderer_0.method8659(i_4, i_5, 4, i_14, 2123988868);
					} else if (i_12 == 2) {
						graphicalrenderer_0.method8428(i_4 + 3, i_5, 4, i_14, -1796764807);
					} else if (i_12 == 3) {
						graphicalrenderer_0.method8659(i_4, i_5 + 3, 4, i_14, -1272168357);
					}
				}
				if (i_13 == SceneObjectType.WALL_STRAIGHT_CORNER.type) {
					if (i_12 == 0) {
						graphicalrenderer_0.method8425(i_4, i_5, 1, 1, i_14, (byte) -113);
					} else if (i_12 == 1) {
						graphicalrenderer_0.method8425(i_4 + 3, i_5, 1, 1, i_14, (byte) -40);
					} else if (i_12 == 2) {
						graphicalrenderer_0.method8425(i_4 + 3, i_5 + 3, 1, 1, i_14, (byte) -91);
					} else if (i_12 == 3) {
						graphicalrenderer_0.method8425(i_4, i_5 + 3, 1, 1, i_14, (byte) -29);
					}
				}
				if (i_13 == SceneObjectType.WALL_WHOLE_CORNER.type) {
					if (i_12 == 0) {
						graphicalrenderer_0.method8659(i_4, i_5, 4, i_14, 1526236522);
					} else if (i_12 == 1) {
						graphicalrenderer_0.method8428(i_4 + 3, i_5, 4, i_14, -1796764807);
					} else if (i_12 == 2) {
						graphicalrenderer_0.method8659(i_4, i_5 + 3, 4, i_14, 1687799163);
					} else if (i_12 == 3) {
						graphicalrenderer_0.method8428(i_4, i_5, 4, i_14, -1796764807);
					}
				}
			}
		}
		sceneobject_10 = (SceneObject) sceneobjectmanager_9.getInteractableObject(i_1, i_2, i_3, client.anInterface25_7446, -233664382);
		if (sceneobject_10 != null) {
			objectdefinitions_11 = IndexLoaders.MAP_REGION_DECODER.method4436(-1933772768).getObjectDefinitions(sceneobject_10.getId(281132177), 65280);
			i_12 = sceneobject_10.method92(-763690677) & 0x3;
			i_13 = sceneobject_10.method89(1162036783);
			if (objectdefinitions_11.mapSpriteId != -1) {
				Class415.method6997(graphicalrenderer_0, objectdefinitions_11, i_12, i_4, i_5, 1089913418);
			} else if (i_13 == SceneObjectType.WALL_INTERACT.type) {
				i_14 = -1118482;
				if (objectdefinitions_11.interactable > 0) {
					i_14 = -1179648;
				}
				if (i_12 != 0 && i_12 != 2) {
					graphicalrenderer_0.method8429(i_4, i_5, i_4 + 3, i_5 + 3, i_14, (byte) -70);
				} else {
					graphicalrenderer_0.method8429(i_4, i_5 + 3, i_4 + 3, i_5, i_14, (byte) 75);
				}
			}
		}
		sceneobject_10 = (SceneObject) sceneobjectmanager_9.getGroundDecoration(i_1, i_2, i_3, -387297653);
		if (sceneobject_10 != null) {
			objectdefinitions_11 = IndexLoaders.MAP_REGION_DECODER.method4436(-1659848045).getObjectDefinitions(sceneobject_10.getId(-1741343457), 65280);
			i_12 = sceneobject_10.method92(-1014923705) & 0x3;
			if (objectdefinitions_11.mapSpriteId != -1) {
				Class415.method6997(graphicalrenderer_0, objectdefinitions_11, i_12, i_4, i_5, 1254236729);
			}
		}
	}

	static void resetContainer(int key, boolean negativeKey) {
		ItemContainer container = CS2Runner.getItemContainer(key, negativeKey);
		if (container != null) {
			for (int i_4 = 0; i_4 < container.itemIds.length; i_4++) {
				container.itemIds[i_4] = -1;
				container.amounts[i_4] = 0;
			}
		}
	}

	public static String method13045(long long_0, int i_2, int i_3) {
		Class155.method2634(long_0);
		int i_4 = Class407.aCalendar4848.get(5);
		int i_5 = Class407.aCalendar4848.get(2);
		int i_6 = Class407.aCalendar4848.get(1);
		return i_2 == 3 ? Class93.method1578(long_0, i_2, (byte) 8) : Integer.toString(i_4 / 10) + i_4 % 10 + "-" + Class407.aStringArrayArray4849[i_2][i_5] + "-" + i_6;
	}

	public static void method13047(int[] ints_0, int[] ints_1, int i_2, int i_3, byte b_4) {
		if (i_2 < i_3) {
			int i_5 = (i_3 + i_2) / 2;
			int i_6 = i_2;
			int i_7 = ints_0[i_5];
			ints_0[i_5] = ints_0[i_3];
			ints_0[i_3] = i_7;
			int i_8 = ints_1[i_5];
			ints_1[i_5] = ints_1[i_3];
			ints_1[i_3] = i_8;
			int i_9 = i_7 == Integer.MAX_VALUE ? 0 : 1;
			for (int i_10 = i_2; i_10 < i_3; i_10++) {
				if (ints_0[i_10] < (i_10 & i_9) + i_7) {
					int i_11 = ints_0[i_10];
					ints_0[i_10] = ints_0[i_6];
					ints_0[i_6] = i_11;
					int i_12 = ints_1[i_10];
					ints_1[i_10] = ints_1[i_6];
					ints_1[i_6++] = i_12;
				}
			}
			ints_0[i_3] = ints_0[i_6];
			ints_0[i_6] = i_7;
			ints_1[i_3] = ints_1[i_6];
			ints_1[i_6] = i_8;
			method13047(ints_0, ints_1, i_2, i_6 - 1, (byte) 34);
			method13047(ints_0, ints_1, i_6 + 1, i_3, (byte) 95);
		}
	}
}
