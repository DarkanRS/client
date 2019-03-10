public abstract class Class158 {

	public abstract int method2714();

	abstract boolean method2715();

	public abstract int method2716();

	public abstract void method212();

	abstract boolean method2717();

	abstract boolean method2718();

	public abstract int method2719();

	public abstract int method2720();

	public abstract int method2721();

	abstract boolean method211();

	abstract boolean method2722();

	abstract boolean method2723();

	abstract boolean method213();

	abstract boolean method2724();

	abstract boolean method2725();

	public abstract int method2726();

	public abstract void method186();

	public abstract int method2727();

	abstract boolean method54();

	public static int windowedMode() {
		return Class475.supportsFullScreen && client.fullScreenFrame != null ? 3 : (client.resizeableScreen ? 2 : 1);
	}

	static void method2731(GraphicalRenderer graphicalrenderer_0, Class455 class455_1, IComponentDefinitions icomponentdefinitions_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		WorldMapAreaDefs worldmapareadefs_9 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_7, 2092552415);
		if (worldmapareadefs_9 != null && worldmapareadefs_9.aBool2729 && worldmapareadefs_9.method3719(Class158_Sub1.PLAYER_VAR_PROVIDER, -1138810540)) {
			int i_11;
			if (worldmapareadefs_9.anIntArray2717 != null) {
				int[] ints_10 = new int[worldmapareadefs_9.anIntArray2717.length];
				int i_12;
				int i_13;
				int i_14;
				for (i_11 = 0; i_11 < ints_10.length / 2; i_11++) {
					if (NativeLibraryLoader.anInt3240 == 4) {
						i_12 = (int) client.aFloat7365 & 0x3fff;
					} else {
						i_12 = (int) client.aFloat7365 + client.anInt7255 & 0x3fff;
					}
					i_13 = Class382.anIntArray4657[i_12];
					i_14 = Class382.anIntArray4661[i_12];
					if (NativeLibraryLoader.anInt3240 != 4) {
						i_13 = i_13 * 256 / (client.anInt7203 + 256);
						i_14 = i_14 * 256 / (client.anInt7203 + 256);
					}
					ints_10[i_11 * 2] = i_3 + icomponentdefinitions_2.anInt1301 / 2 + ((worldmapareadefs_9.anIntArray2717[i_11 * 2 + 1] * 4 + i_6) * i_13 + i_14 * (i_5 + worldmapareadefs_9.anIntArray2717[i_11 * 2] * 4) >> 14);
					ints_10[i_11 * 2 + 1] = icomponentdefinitions_2.anInt1429 / 2 + i_4 - ((worldmapareadefs_9.anIntArray2717[i_11 * 2 + 1] * 4 + i_6) * i_14 - i_13 * (i_5 + worldmapareadefs_9.anIntArray2717[i_11 * 2] * 4) >> 14);
				}
				Class119 class119_19 = icomponentdefinitions_2.method2046(graphicalrenderer_0, -907269302);
				if (class119_19 != null) {
					Class147.method2505(graphicalrenderer_0, ints_10, worldmapareadefs_9.anInt2715, class119_19.anIntArray1457, class119_19.anIntArray1455);
				}
				if (worldmapareadefs_9.anInt2748 > 0) {
					int i_15;
					int i_16;
					int i_17;
					for (i_12 = 0; i_12 < ints_10.length / 2 - 1; i_12++) {
						i_13 = ints_10[i_12 * 2];
						i_14 = ints_10[i_12 * 2 + 1];
						i_15 = ints_10[(i_12 + 1) * 2];
						i_16 = ints_10[(i_12 + 1) * 2 + 1];
						if (i_15 < i_13) {
							i_17 = i_13;
							int i_18 = i_14;
							i_13 = i_15;
							i_14 = i_16;
							i_15 = i_17;
							i_16 = i_18;
						} else if (i_13 == i_15 && i_16 < i_14) {
							i_17 = i_14;
							i_14 = i_16;
							i_16 = i_17;
						}
						graphicalrenderer_0.method8563(i_13, i_14, i_15, i_16, worldmapareadefs_9.anIntArray2738[worldmapareadefs_9.aByteArray2754[i_12] & 0xff], 1, class455_1, i_3, i_4, worldmapareadefs_9.anInt2748, worldmapareadefs_9.anInt2749, worldmapareadefs_9.anInt2756);
					}
					i_12 = ints_10[ints_10.length - 2];
					i_13 = ints_10[ints_10.length - 1];
					i_14 = ints_10[0];
					i_15 = ints_10[1];
					if (i_14 < i_12) {
						i_16 = i_12;
						i_17 = i_13;
						i_12 = i_14;
						i_13 = i_15;
						i_14 = i_16;
						i_15 = i_17;
					} else if (i_14 == i_12 && i_15 < i_13) {
						i_16 = i_13;
						i_13 = i_15;
						i_15 = i_16;
					}
					graphicalrenderer_0.method8563(i_12, i_13, i_14, i_15, worldmapareadefs_9.anIntArray2738[worldmapareadefs_9.aByteArray2754[worldmapareadefs_9.aByteArray2754.length - 1] & 0xff], 1, class455_1, i_3, i_4, worldmapareadefs_9.anInt2748, worldmapareadefs_9.anInt2749, worldmapareadefs_9.anInt2756);
				} else {
					for (i_12 = 0; i_12 < ints_10.length / 2 - 1; i_12++) {
						graphicalrenderer_0.method8669(ints_10[i_12 * 2], ints_10[i_12 * 2 + 1], ints_10[(i_12 + 1) * 2], ints_10[(i_12 + 1) * 2 + 1], worldmapareadefs_9.anIntArray2738[worldmapareadefs_9.aByteArray2754[i_12] & 0xff], 1, class455_1, i_3, i_4);
					}
					graphicalrenderer_0.method8669(ints_10[ints_10.length - 2], ints_10[ints_10.length - 1], ints_10[0], ints_10[1], worldmapareadefs_9.anIntArray2738[worldmapareadefs_9.aByteArray2754[worldmapareadefs_9.aByteArray2754.length - 1] & 0xff], 1, class455_1, i_3, i_4);
				}
			}
			NativeSprite nativesprite_22 = null;
			if (worldmapareadefs_9.anInt2719 != -1) {
				nativesprite_22 = worldmapareadefs_9.renderIcons(graphicalrenderer_0, false, (byte) 8);
				if (nativesprite_22 != null) {
					Class190.method3149(icomponentdefinitions_2, class455_1, i_3, i_4, i_5, i_6, nativesprite_22, -1909602202);
				}
			}
			if (worldmapareadefs_9.areaName != null) {
				i_11 = 0;
				if (nativesprite_22 != null) {
					i_11 = nativesprite_22.method2793();
				}
				FontRenderer fontrenderer_20 = Renderers.FONT_RENDERER;
				FontMetrics fontmetrics_21 = Class282_Sub17_Sub2.aClass414_9933;
				if (worldmapareadefs_9.anInt2722 == 1) {
					fontrenderer_20 = Class16.aClass8_144;
					fontmetrics_21 = Class16.aClass414_139;
				}
				if (worldmapareadefs_9.anInt2722 == 2) {
					fontrenderer_20 = Class285.aClass8_3394;
					fontmetrics_21 = Class288.aClass414_3438;
				}
				Class241.method4152(icomponentdefinitions_2, class455_1, i_3, i_4, i_5, i_6, i_11, worldmapareadefs_9.areaName, fontrenderer_20, fontmetrics_21, worldmapareadefs_9.anInt2720, -1590332940);
			}
		}
	}

	static final void method2732(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (!string_4.equals(icomponentdefinitions_0.aString1391)) {
			icomponentdefinitions_0.aString1391 = string_4;
			Class109.method1858(icomponentdefinitions_0, (byte) 79);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			RenderAnimIndexLoader.method3631(icomponentdefinitions_0.idHash, -1844455774);
		}
	}
}
