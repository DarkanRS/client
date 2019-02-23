public class Item extends Node {

	int id;
	int amount;
	int outlineSize;
	int shadowColor;
	int anInt7819;
	boolean hasPlayerAppearance;

	Item(int i_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		this.id = i_1;
		this.amount = i_2;
		this.outlineSize = i_3;
		this.shadowColor = i_4;
		this.anInt7819 = i_5;
		this.hasPlayerAppearance = bool_6;
	}

	static void method12574(GraphicalRenderer graphicalrenderer_0, IComponentDefinitions icomponentdefinitions_1, int i_2, int i_3, int i_4) {
		Class119 class119_5 = icomponentdefinitions_1.method2046(graphicalrenderer_0, 1273435241);
		if (class119_5 != null) {
			Class455 class455_6 = class119_5.aClass455_1456;
			graphicalrenderer_0.r(i_2, i_3, i_2 + icomponentdefinitions_1.anInt1301, i_3 + icomponentdefinitions_1.anInt1429);
			if (class119_5.anInt1458 != icomponentdefinitions_1.anInt1301 || class119_5.anInt1454 != icomponentdefinitions_1.anInt1429) {
				throw new IllegalStateException("");
			}

			if (Class187.anInt2363 != 2 && Class187.anInt2363 != 5 && Class419.aClass160_5004 != null) {
				CoordGrid coordgrid_7 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1681892219);
				int i_8;
				int i_9;
				int i_10;
				int i_11;
				if (NativeLibraryLoader.anInt3240 == 4) {
					i_8 = client.anInt7262;
					i_9 = client.anInt7376;
					i_10 = (int) (-client.aFloat7365) & 0x3fff;
					i_11 = 4096;
				} else {
					Vector3 vector3_22 = Class84.myPlayer.method11166().aClass385_3595;
					i_8 = (int) vector3_22.x;
					i_9 = (int) vector3_22.z;
					i_10 = (int) (-client.aFloat7365) + client.anInt7255 & 0x3fff;
					i_11 = 4096 - client.anInt7203 * 16;
				}

				int i_12 = i_8 / 128 + 48;
				int i_13 = 48 + IndexLoaders.MAP_REGION_DECODER.getSizeY(-1005893088) * 4 - i_9 / 128;
				Class419.aClass160_5004.method2762((float) i_2 + (float) icomponentdefinitions_1.anInt1301 / 2.0F, (float) i_3 + (float) icomponentdefinitions_1.anInt1429 / 2.0F, (float) i_12, (float) i_13, i_11, i_10 << 2, class455_6, i_2, i_3);
				Class283 class283_14 = IndexLoaders.MAP_REGION_DECODER.method4528((byte) 38);

				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				for (Class282_Sub38 class282_sub38_15 = (Class282_Sub38) Class187.aClass482_2350.head((byte) 120); class282_sub38_15 != null; class282_sub38_15 = (Class282_Sub38) Class187.aClass482_2350.next(1158642483)) {
					i_16 = class282_sub38_15.anInt8002;
					i_17 = (class283_14.anIntArray3381[i_16] >> 14 & 0x3fff) - coordgrid_7.x;
					i_18 = (class283_14.anIntArray3381[i_16] & 0x3fff) - coordgrid_7.y;
					i_19 = i_17 * 4 + 2 - i_8 / 128;
					i_20 = i_18 * 4 + 2 - i_9 / 128;
					Class158.method2731(graphicalrenderer_0, class455_6, icomponentdefinitions_1, i_2, i_3, i_19, i_20, class283_14.anIntArray3383[i_16], 1376881925);
				}

				int i_21;
				for (i_21 = 0; i_21 < Class187.anInt2353; i_21++) {
					i_16 = Class187.anIntArray2354[i_21] * 4 + 2 - i_8 / 128;
					i_17 = Class187.anIntArray2355[i_21] * 4 + 2 - i_9 / 128;
					ObjectDefinitions objectdefinitions_23 = IndexLoaders.MAP_REGION_DECODER.method4436(-1953311803).getObjectDefinitions(Class187.anIntArray2357[i_21], 65280);
					if (objectdefinitions_23.anIntArray5650 != null) {
						objectdefinitions_23 = objectdefinitions_23.method8013(Class158_Sub1.aClass3_8507, (byte) -58);
						if (objectdefinitions_23 == null || objectdefinitions_23.anInt5669 == -1) {
							continue;
						}
					}

					Class158.method2731(graphicalrenderer_0, class455_6, icomponentdefinitions_1, i_2, i_3, i_16, i_17, objectdefinitions_23.anInt5669, 2923328);
				}

				for (Class282_Sub29 class282_sub29_24 = (Class282_Sub29) client.aClass465_7414.method7750(-456921914); class282_sub29_24 != null; class282_sub29_24 = (Class282_Sub29) client.aClass465_7414.method7751((byte) 97)) {
					i_16 = (int) (class282_sub29_24.data >> 28 & 0x3L);
					if (i_16 == Class187.anInt2351) {
						i_17 = (int) (class282_sub29_24.data & 0x3fffL) - coordgrid_7.x;
						i_18 = (int) (class282_sub29_24.data >> 14 & 0x3fffL) - coordgrid_7.y;
						i_19 = i_17 * 4 + 2 - i_8 / 128;
						i_20 = i_18 * 4 + 2 - i_9 / 128;
						Class190.method3149(icomponentdefinitions_1, class455_6, i_2, i_3, i_19, i_20, Class250.aClass160Array3092[0], 1358567832);
					}
				}

				Class469.method7805(graphicalrenderer_0, i_8, i_9, icomponentdefinitions_1, class455_6, i_2, i_3, 2063184307);
				Class82.method1457(i_8, i_9, icomponentdefinitions_1, class455_6, i_2, i_3, 1942118537);
				Class190.method3151(i_8, i_9, icomponentdefinitions_1, class119_5, i_2, i_3, 848202629);
				if (NativeLibraryLoader.anInt3240 != 4) {
					if (Class187.anInt2361 != 0) {
						i_21 = Class187.anInt2361 * 4 + 2 - i_8 / 128 + (Class84.myPlayer.getSize(828768449) - 1) * 2;
						i_16 = 2 + Class187.anInt2359 * 4 - i_9 / 128 + (Class84.myPlayer.getSize(828768449) - 1) * 2;
						Class190.method3149(icomponentdefinitions_1, class455_6, i_2, i_3, i_21, i_16, Class16.aClass160Array145[Class187.aBool2360 ? 1 : 0], 1471010271);
					}

					if (!Class84.myPlayer.hidden) {
						graphicalrenderer_0.method8425(i_2 + icomponentdefinitions_1.anInt1301 / 2 - 1, i_3 + icomponentdefinitions_1.anInt1429 / 2 - 1, 3, 3, -1, (byte) -117);
					}
				}
			} else {
				graphicalrenderer_0.DA(-16777216, class455_6, i_2, i_3);
			}
		}

	}

	public static void method12575(int i_0, byte b_1) {
		Class282_Sub50_Sub12 class282_sub50_sub12_2 = Engine.getIComponentVar(10, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) 34);
	}

}
