public class Class415 {

	public static int anInt4985;

	public int anInt4983 = 1;

	public char aChar4984;

	void method6990(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method6991(rsbytebuffer_1, i_3);
		}
	}

	void method6991(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.aChar4984 = Class11.getChar(rsbytebuffer_1.readByte());
		} else if (i_2 == 2) {
			this.anInt4983 = 0;
		}
	}

	static void method6996(GraphicalRenderer graphicalrenderer_0, IComponentDefinitions icomponentdefinitions_1) {
		boolean bool_3 = IndexLoaders.ITEM_INDEX_LOADER.softwareRender(graphicalrenderer_0, icomponentdefinitions_1.anInt1426, icomponentdefinitions_1.anInt1427, icomponentdefinitions_1.anInt1323, ~0xffffff | icomponentdefinitions_1.anInt1324, icomponentdefinitions_1.anInt1335, icomponentdefinitions_1.aBool1388 ? VertexNormal.myPlayer.playerAppearance : null) == null;
		if (bool_3) {
			Class182.ITEMS.append(new Item(icomponentdefinitions_1.anInt1426, icomponentdefinitions_1.anInt1427, icomponentdefinitions_1.anInt1323, ~0xffffff | icomponentdefinitions_1.anInt1324, icomponentdefinitions_1.anInt1335, icomponentdefinitions_1.aBool1388));
			Class109.redrawComponent(icomponentdefinitions_1, (byte) 71);
		}
	}

	static void method6997(GraphicalRenderer graphicalrenderer_0, ObjectDefinitions objectdefinitions_1, int i_2, int i_3, int i_4, int i_5) {
		Class418 class418_6 = IndexLoaders.aClass427_995.method7172(objectdefinitions_1.mapSpriteId);
		if (class418_6.anInt4995 != -1) {
			if (objectdefinitions_1.adjustMapSceneRotation) {
				i_2 += objectdefinitions_1.mapSpriteRotation;
				i_2 &= 0x3;
			} else {
				i_2 = 0;
			}
			NativeSprite nativesprite_7 = class418_6.method7010(graphicalrenderer_0, i_2, objectdefinitions_1.flipMapSprite, (byte) 75);
			if (nativesprite_7 != null) {
				int i_8 = objectdefinitions_1.sizeX;
				int i_9 = objectdefinitions_1.sizeY;
				if ((i_2 & 0x1) == 1) {
					i_8 = objectdefinitions_1.sizeY;
					i_9 = objectdefinitions_1.sizeX;
				}
				int i_10 = nativesprite_7.method228();
				int i_11 = nativesprite_7.method2748();
				if (class418_6.aBool4996) {
					i_10 = i_8 * 4;
					i_11 = i_9 * 4;
				}
				if (class418_6.anInt4997 != 0) {
					nativesprite_7.method2754(i_3, i_4 - (i_9 - 1) * 4, i_10, i_11, 0, ~0xffffff | class418_6.anInt4997, 1);
				} else {
					nativesprite_7.method2789(i_3, i_4 - (i_9 - 1) * 4, i_10, i_11);
				}
			}
		}
	}
}
