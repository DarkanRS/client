package com.rs.jagex;

public class Class435 {

	static NodeCollection PENDING_REFLECTION_CHECKS = new NodeCollection();

	static void method7301(Class293[][][] arr_0) {
		for (Class293[][] arr_3 : arr_0)
			for (Class293[] element : arr_3)
				for (int i_5 = 0; i_5 < element.length; i_5++) {
					Class293 class293_6 = element[i_5];
					if (class293_6 != null) {
						if (class293_6.aTransform_Sub1_Sub3_3499 instanceof WorldObject)
							((WorldObject) class293_6.aTransform_Sub1_Sub3_3499).method85();

						if (class293_6.aTransform_Sub1_Sub4_3503 instanceof WorldObject)
							((WorldObject) class293_6.aTransform_Sub1_Sub4_3503).method85();

						if (class293_6.aTransform_Sub1_Sub4_3500 instanceof WorldObject)
							((WorldObject) class293_6.aTransform_Sub1_Sub4_3500).method85();

						if (class293_6.aTransform_Sub1_Sub5_3505 instanceof WorldObject)
							((WorldObject) class293_6.aTransform_Sub1_Sub5_3505).method85();

						if (class293_6.aTransform_Sub1_Sub5_3502 instanceof WorldObject)
							((WorldObject) class293_6.aTransform_Sub1_Sub5_3502).method85();

						for (Class208 class208_7 = class293_6.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
							GraphNode_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aTransform_Sub1_Sub1_2659;
							if (class521_sub1_sub1_8 instanceof WorldObject)
								((WorldObject) class521_sub1_sub1_8).method85();
						}
					}
				}

	}

	static void method7302(AbstractRenderer graphicalrenderer_0, ImageLoader interface22_1) {
		if (Class291.aCacheableNode_Sub6_3491 != null) {
			Utils.time();
			Utils.time();
			if (Class291_Sub1.anInt8015 < 10) {
				if (!Class291.MAP_AREA_INDEX.method5629(Class291.aCacheableNode_Sub6_3491.staticElementsName)) {
					Class291_Sub1.anInt8015 = IndexLoaders.WORLD_MAP_INDEX.method5631(Class291.aCacheableNode_Sub6_3491.staticElementsName) / 10;
					return;
				}

				NPCDefinitions.method6907();
				Class291_Sub1.anInt8015 = 10;
			}

			if (Class291_Sub1.anInt8015 == 10) {
				Class291.anInt3472 = Class291.aCacheableNode_Sub6_3491.anInt9539 >> 6 << 6;
			Class291.anInt3473 = Class291.aCacheableNode_Sub6_3491.anInt9541 >> 6 << 6;
			Class291.xLength = (Class291.aCacheableNode_Sub6_3491.anInt9540 >> 6 << 6) - Class291.anInt3472 + 64;
			Class291.yLength = (Class291.aCacheableNode_Sub6_3491.anInt9535 >> 6 << 6) - Class291.anInt3473 + 64;
			int[] ints_3 = new int[3];
			int i_4 = -1;
			int i_5 = -1;
			Vector3 vector3_6 = VertexNormal.MY_PLAYER.method11166().coords;
			CoordGrid coordgrid_7 = IndexLoaders.MAP_REGION_DECODER.getBase();
			if (Class291.aCacheableNode_Sub6_3491.method14778(VertexNormal.MY_PLAYER.plane, ((int) vector3_6.x >> 9) + coordgrid_7.x, ((int) vector3_6.z >> 9) + coordgrid_7.y, ints_3)) {
				i_4 = ints_3[1] - Class291.anInt3472;
				i_5 = ints_3[2] - Class291.anInt3473;
			}

			if (!Class291_Sub1.aBool8028 && i_4 >= 0 && i_4 < Class291.xLength && i_5 >= 0 && i_5 < Class291.yLength) {
				i_4 += (int) (Math.random() * 10.0D) - 5;
				i_5 += (int) (Math.random() * 10.0D) - 5;
				MapSpriteIndexLoader.anInt5123 = i_4;
				Class475.anInt5624 = i_5;
			} else if (Class291_Sub1.anInt8019 != -1 && Class291_Sub1.anInt8020 != -1) {
				Class291.aCacheableNode_Sub6_3491.method14777(Class291_Sub1.anInt8019, Class291_Sub1.anInt8020, ints_3);
				if (ints_3 != null) {
					MapSpriteIndexLoader.anInt5123 = ints_3[1] - Class291.anInt3472;
					Class475.anInt5624 = ints_3[2] - Class291.anInt3473;
				}

				Class291_Sub1.anInt8020 = -1;
				Class291_Sub1.anInt8019 = -1;
				Class291_Sub1.aBool8028 = false;
			} else {
				Class291.aCacheableNode_Sub6_3491.method14777(Class291.aCacheableNode_Sub6_3491.regionHash >> 14 & 0x3fff, Class291.aCacheableNode_Sub6_3491.regionHash & 0x3fff, ints_3);
				MapSpriteIndexLoader.anInt5123 = ints_3[1] - Class291.anInt3472;
				Class475.anInt5624 = ints_3[2] - Class291.anInt3473;
			}

			if (Class291.aCacheableNode_Sub6_3491.anInt9542 == 37) {
				Class291.aFloat3468 = 3.0F;
				Class291.aFloat3462 = 3.0F;
			} else if (Class291.aCacheableNode_Sub6_3491.anInt9542 == 50) {
				Class291.aFloat3468 = 4.0F;
				Class291.aFloat3462 = 4.0F;
			} else if (Class291.aCacheableNode_Sub6_3491.anInt9542 == 75) {
				Class291.aFloat3468 = 6.0F;
				Class291.aFloat3462 = 6.0F;
			} else if ((Class291.aCacheableNode_Sub6_3491.anInt9542 == 100) || (Class291.aCacheableNode_Sub6_3491.anInt9542 != 200)) {
				Class291.aFloat3468 = 8.0F;
				Class291.aFloat3462 = 8.0F;
			} else {
				Class291.aFloat3468 = 16.0F;
				Class291.aFloat3462 = 16.0F;
			}

			Class291.anInt3469 = (int) Class291.aFloat3468 >> 1;
			Class291.aByteArrayArrayArray3464 = CircularBuffer.method8246(Class291.anInt3469);
			Class89.method1502();
			Class291.method5126();
			QuickChatMessage.aClass482_4049 = new NodeCollection();
			Class291.anInt3454 += (int) (Math.random() * 5.0D) - 2;
			if (Class291.anInt3454 < -8)
				Class291.anInt3454 = -8;

			if (Class291.anInt3454 > 8)
				Class291.anInt3454 = 8;

			Class291.anInt3463 += (int) (Math.random() * 5.0D) - 2;
			if (Class291.anInt3463 < -16)
				Class291.anInt3463 = -16;

			if (Class291.anInt3463 > 16)
				Class291.anInt3463 = 16;

			Class291.method5132(interface22_1, Class291.anInt3454 >> 2 << 10, Class291.anInt3463 >> 1);
			Class291.MAP_AREA_LOADER.method3697(1024, 256);
			Class291.MAP_SPRITE_LOADER.method7175(256, 256);
			Class291.OBJECT_LOADER.method7899(4096);
			IndexLoaders.VARBIT_LOADER.method3906(256);
			Class291_Sub1.anInt8015 = 20;
			} else if (Class291_Sub1.anInt8015 == 20) {
				Exception_Sub3.method15619(true);
				Class291.decodeArea(Class291.anInt3454, Class291.anInt3463);
				Class291_Sub1.anInt8015 = 60;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
			} else if (Class291_Sub1.anInt8015 == 60) {
				if (Class291.MAP_AREA_INDEX.validFile(Class291.aCacheableNode_Sub6_3491.staticElementsName + "_staticelements")) {
					if (!Class291.MAP_AREA_INDEX.method5629(Class291.aCacheableNode_Sub6_3491.staticElementsName + "_staticelements"))
						return;

					Class291.aClass283_3470 = Class301.getStaticElements(Class291.MAP_AREA_INDEX, Class291.aCacheableNode_Sub6_3491.staticElementsName + "_staticelements", client.membersWorld);
				} else
					Class291.aClass283_3470 = new StaticElements(0);

				Class291.method5145();
				Class291_Sub1.anInt8015 = 70;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
			} else if (Class291_Sub1.anInt8015 == 70) {
				Static.aClass194_5794 = new Class194(graphicalrenderer_0, 11, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 73;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
			} else if (Class291_Sub1.anInt8015 == 73) {
				Class291_Sub1.aClass194_8017 = new Class194(graphicalrenderer_0, 12, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 76;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
			} else if (Class291_Sub1.anInt8015 == 76) {
				Class291_Sub1.aClass194_8023 = new Class194(graphicalrenderer_0, 14, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 79;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
			} else if (Class291_Sub1.anInt8015 == 79) {
				Class446.aClass194_5416 = new Class194(graphicalrenderer_0, 17, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 82;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
			} else if (Class291_Sub1.anInt8015 == 82) {
				ShaderLoader.aClass194_1243 = new Class194(graphicalrenderer_0, 19, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 85;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
			} else if (Class291_Sub1.anInt8015 == 85) {
				DefaultsFile.aClass194_6967 = new Class194(graphicalrenderer_0, 22, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 88;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
			} else if (Class291_Sub1.anInt8015 == 88) {
				RouteFinder.aClass194_3103 = new Class194(graphicalrenderer_0, 26, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 91;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
			} else {
				WallObjectGraphNode.aClass194_10527 = new Class194(graphicalrenderer_0, 30, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 100;
				Exception_Sub3.method15619(true);
				Node_Sub15_Sub1.method14840();
				System.gc();
			}
		}

	}

	public static String method7303(MenuActionEvent class282_sub50_sub7_0) {
		return !Class20.aBool161 && class282_sub50_sub7_0 != null ? ((class282_sub50_sub7_0.aString9588 == null || class282_sub50_sub7_0.aString9588.isEmpty()) && class282_sub50_sub7_0.aString9585 != null && !class282_sub50_sub7_0.aString9585.isEmpty() ? class282_sub50_sub7_0.aString9585 : class282_sub50_sub7_0.aString9588) : "";
	}

	public static AreadSound playSoundVorbis(int soundId, int unk, int delay, int volume, boolean voiceEffect, int sampleRate) {
		if ((voiceEffect ? Class393.preferences.voiceOverVolume.method12714() : Class393.preferences.soundEffectVolume.method12714()) != 0 && unk != 0 && Class260.SOUNDS_SIZE < 50 && soundId != -1) {
			AreadSound class268_7 = new AreadSound((byte) (voiceEffect ? 3 : 2), soundId, unk, delay, volume, 0, sampleRate, null);
			Class260.SOUNDS[++Class260.SOUNDS_SIZE - 1] = class268_7;
			return class268_7;
		}
		return null;
	}

	Class435() throws Throwable {
		throw new Error();
	}

}
