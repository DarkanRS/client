public class Class435 {

	static NodeCollection aClass482_5332 = new NodeCollection();

	Class435() throws Throwable {
		throw new Error();
	}

	public static Class268 method7300(int i_0, int i_1, int i_2, int i_3, boolean bool_4, int i_5, int i_6) {
		if ((bool_4 ? Class393.preferences.aClass468_Sub13_8227.method12714(1497954665) : Class393.preferences.aClass468_Sub13_8225.method12714(346781978)) != 0 && i_1 != 0 && Class260.anInt3219 < 50 && i_0 != -1) {
			Class268 class268_7 = new Class268((byte) (bool_4 ? 3 : 2), i_0, i_1, i_2, i_3, 0, i_5, (Class521_Sub1) null);
			Class260.aClass268Array3232[++Class260.anInt3219 - 1] = class268_7;
			return class268_7;
		} else {
			return null;
		}
	}

	static void method7301(Class293[][][] arr_0, byte b_1) {
		for (int i_2 = 0; i_2 < arr_0.length; i_2++) {
			Class293[][] arr_3 = arr_0[i_2];

			for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
				for (int i_5 = 0; i_5 < arr_3[i_4].length; i_5++) {
					Class293 class293_6 = arr_3[i_4][i_5];
					if (class293_6 != null) {
						if (class293_6.aClass521_Sub1_Sub3_3499 instanceof SceneObject) {
							((SceneObject) class293_6.aClass521_Sub1_Sub3_3499).method85((byte) 1);
						}

						if (class293_6.aClass521_Sub1_Sub4_3503 instanceof SceneObject) {
							((SceneObject) class293_6.aClass521_Sub1_Sub4_3503).method85((byte) 1);
						}

						if (class293_6.aClass521_Sub1_Sub4_3500 instanceof SceneObject) {
							((SceneObject) class293_6.aClass521_Sub1_Sub4_3500).method85((byte) 1);
						}

						if (class293_6.aClass521_Sub1_Sub5_3505 instanceof SceneObject) {
							((SceneObject) class293_6.aClass521_Sub1_Sub5_3505).method85((byte) 1);
						}

						if (class293_6.aClass521_Sub1_Sub5_3502 instanceof SceneObject) {
							((SceneObject) class293_6.aClass521_Sub1_Sub5_3502).method85((byte) 1);
						}

						for (Class208 class208_7 = class293_6.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
							Class521_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aClass521_Sub1_Sub1_2659;
							if (class521_sub1_sub1_8 instanceof SceneObject) {
								((SceneObject) class521_sub1_sub1_8).method85((byte) 1);
							}
						}
					}
				}
			}
		}

	}

	static final void method7302(GraphicalRenderer graphicalrenderer_0, Interface22 interface22_1, byte b_2) {
		if (Class291_Sub1.aClass282_Sub50_Sub6_3491 != null) {
			Class169.time();
			Class169.time();
			if (Class291_Sub1.anInt8015 < 10) {
				if (!Class291_Sub1.aClass317_3460.method5629(Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533, 71472045)) {
					Class291_Sub1.anInt8015 = IndexLoaders.WORLD_MAP_INDEX.method5631(Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533, (byte) 95) / 10;
					return;
				}

				NPCDefinitions.method6907(-1568053655);
				Class291_Sub1.anInt8015 = 10;
			}

			if (Class291_Sub1.anInt8015 == 10) {
				Class291_Sub1.anInt3472 = Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9539 >> 6 << 6;
				Class291_Sub1.anInt3473 = Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9541 >> 6 << 6;
				Class291_Sub1.xLength = (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9540 >> 6 << 6) - Class291_Sub1.anInt3472 + 64;
				Class291_Sub1.yLength = (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9535 >> 6 << 6) - Class291_Sub1.anInt3473 + 64;
				int[] ints_3 = new int[3];
				int i_4 = -1;
				int i_5 = -1;
				Vector3 vector3_6 = Class84.myPlayer.method11166().aClass385_3595;
				CoordGrid coordgrid_7 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
				if (Class291_Sub1.aClass282_Sub50_Sub6_3491.method14778(Class84.myPlayer.plane, ((int) vector3_6.x >> 9) + coordgrid_7.x, ((int) vector3_6.z >> 9) + coordgrid_7.y, ints_3, -1889386276)) {
					i_4 = ints_3[1] - Class291_Sub1.anInt3472;
					i_5 = ints_3[2] - Class291_Sub1.anInt3473;
				}

				if (!Class291_Sub1.aBool8028 && i_4 >= 0 && i_4 < Class291_Sub1.xLength && i_5 >= 0 && i_5 < Class291_Sub1.yLength) {
					i_4 += (int) (Math.random() * 10.0D) - 5;
					i_5 += (int) (Math.random() * 10.0D) - 5;
					Class427.anInt5123 = i_4;
					Class475.anInt5624 = i_5;
				} else if (Class291_Sub1.anInt8019 != -1 && Class291_Sub1.anInt8020 != -1) {
					Class291_Sub1.aClass282_Sub50_Sub6_3491.method14777(Class291_Sub1.anInt8019, Class291_Sub1.anInt8020, ints_3, -1997642770);
					if (ints_3 != null) {
						Class427.anInt5123 = ints_3[1] - Class291_Sub1.anInt3472;
						Class475.anInt5624 = ints_3[2] - Class291_Sub1.anInt3473;
					}

					Class291_Sub1.anInt8020 = -1;
					Class291_Sub1.anInt8019 = -1;
					Class291_Sub1.aBool8028 = false;
				} else {
					Class291_Sub1.aClass282_Sub50_Sub6_3491.method14777(Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9532 >> 14 & 0x3fff, Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9532 & 0x3fff, ints_3, -2052252503);
					Class427.anInt5123 = ints_3[1] - Class291_Sub1.anInt3472;
					Class475.anInt5624 = ints_3[2] - Class291_Sub1.anInt3473;
				}

				if (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542 == 37) {
					Class291_Sub1.aFloat3468 = 3.0F;
					Class291_Sub1.aFloat3462 = 3.0F;
				} else if (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542 == 50) {
					Class291_Sub1.aFloat3468 = 4.0F;
					Class291_Sub1.aFloat3462 = 4.0F;
				} else if (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542 == 75) {
					Class291_Sub1.aFloat3468 = 6.0F;
					Class291_Sub1.aFloat3462 = 6.0F;
				} else if (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542 == 100) {
					Class291_Sub1.aFloat3468 = 8.0F;
					Class291_Sub1.aFloat3462 = 8.0F;
				} else if (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542 == 200) {
					Class291_Sub1.aFloat3468 = 16.0F;
					Class291_Sub1.aFloat3462 = 16.0F;
				} else {
					Class291_Sub1.aFloat3468 = 8.0F;
					Class291_Sub1.aFloat3462 = 8.0F;
				}

				Class291_Sub1.anInt3469 = (int) Class291_Sub1.aFloat3468 >> 1;
				Class291_Sub1.aByteArrayArrayArray3464 = CircularBuffer.method8246(Class291_Sub1.anInt3469, (short) 8192);
				Class89.method1502(-931909822);
				Class291_Sub1.method5126();
				Class346.aClass482_4049 = new NodeCollection();
				Class291_Sub1.anInt3454 += (int) (Math.random() * 5.0D) - 2;
				if (Class291_Sub1.anInt3454 < -8) {
					Class291_Sub1.anInt3454 = -8;
				}

				if (Class291_Sub1.anInt3454 > 8) {
					Class291_Sub1.anInt3454 = 8;
				}

				Class291_Sub1.anInt3463 += (int) (Math.random() * 5.0D) - 2;
				if (Class291_Sub1.anInt3463 < -16) {
					Class291_Sub1.anInt3463 = -16;
				}

				if (Class291_Sub1.anInt3463 > 16) {
					Class291_Sub1.anInt3463 = 16;
				}

				Class291_Sub1.method5132(interface22_1, Class291_Sub1.anInt3454 >> 2 << 10, Class291_Sub1.anInt3463 >> 1);
				Class291_Sub1.aClass218_3456.method3697(1024, 256, 2137741394);
				Class291_Sub1.aClass427_3457.method7175(256, 256, 993879963);
				Class291_Sub1.aClass474_3455.method7899(4096, -2034610586);
				IndexLoaders.aClass230_147.method3906(256, (short) 727);
				Class291_Sub1.anInt8015 = 20;
			} else if (Class291_Sub1.anInt8015 == 20) {
				Exception_Sub3.method15619(true, -484129587);
				Class291_Sub1.method5183(graphicalrenderer_0, Class291_Sub1.anInt3454, Class291_Sub1.anInt3463);
				Class291_Sub1.anInt8015 = 60;
				Exception_Sub3.method15619(true, 771628468);
				Class282_Sub15_Sub1.method14840((byte) -59);
			} else if (Class291_Sub1.anInt8015 == 60) {
				if (Class291_Sub1.aClass317_3460.validFile(Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533 + "_staticelements")) {
					if (!Class291_Sub1.aClass317_3460.method5629(Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533 + "_staticelements", 71472045)) {
						return;
					}

					Class291_Sub1.aClass283_3470 = Class301.method5331(Class291_Sub1.aClass317_3460, Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533 + "_staticelements", client.membersWorld, 874508557);
				} else {
					Class291_Sub1.aClass283_3470 = new Class283(0);
				}

				Class291_Sub1.method5145();
				Class291_Sub1.anInt8015 = 70;
				Exception_Sub3.method15619(true, -147678453);
				Class282_Sub15_Sub1.method14840((byte) -22);
			} else if (Class291_Sub1.anInt8015 == 70) {
				Class494.aClass194_5794 = new Class194(graphicalrenderer_0, 11, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 73;
				Exception_Sub3.method15619(true, -1670495557);
				Class282_Sub15_Sub1.method14840((byte) 30);
			} else if (Class291_Sub1.anInt8015 == 73) {
				Class291_Sub1.aClass194_8017 = new Class194(graphicalrenderer_0, 12, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 76;
				Exception_Sub3.method15619(true, -1191023445);
				Class282_Sub15_Sub1.method14840((byte) -90);
			} else if (Class291_Sub1.anInt8015 == 76) {
				Class291_Sub1.aClass194_8023 = new Class194(graphicalrenderer_0, 14, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 79;
				Exception_Sub3.method15619(true, -2098673020);
				Class282_Sub15_Sub1.method14840((byte) -57);
			} else if (Class291_Sub1.anInt8015 == 79) {
				Class446.aClass194_5416 = new Class194(graphicalrenderer_0, 17, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 82;
				Exception_Sub3.method15619(true, 784313452);
				Class282_Sub15_Sub1.method14840((byte) 55);
			} else if (Class291_Sub1.anInt8015 == 82) {
				Class114.aClass194_1243 = new Class194(graphicalrenderer_0, 19, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 85;
				Exception_Sub3.method15619(true, 299968314);
				Class282_Sub15_Sub1.method14840((byte) -88);
			} else if (Class291_Sub1.anInt8015 == 85) {
				DefaultsFile.aClass194_6967 = new Class194(graphicalrenderer_0, 22, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 88;
				Exception_Sub3.method15619(true, 735044045);
				Class282_Sub15_Sub1.method14840((byte) -35);
			} else if (Class291_Sub1.anInt8015 == 88) {
				Class251.aClass194_3103 = new Class194(graphicalrenderer_0, 26, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 91;
				Exception_Sub3.method15619(true, 1741477937);
				Class282_Sub15_Sub1.method14840((byte) -64);
			} else {
				Class521_Sub1_Sub5_Sub1.aClass194_10527 = new Class194(graphicalrenderer_0, 30, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 100;
				Exception_Sub3.method15619(true, -95185892);
				Class282_Sub15_Sub1.method14840((byte) -14);
				System.gc();
			}
		}

	}

	public static String method7303(Class282_Sub50_Sub7 class282_sub50_sub7_0, byte b_1) {
		return !Class20.aBool161 && class282_sub50_sub7_0 != null ? ((class282_sub50_sub7_0.aString9588 == null || class282_sub50_sub7_0.aString9588.length() == 0) && class282_sub50_sub7_0.aString9585 != null && class282_sub50_sub7_0.aString9585.length() > 0 ? class282_sub50_sub7_0.aString9585 : class282_sub50_sub7_0.aString9588) : "";
	}

}
