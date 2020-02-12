package com.jagex;

public class Class435 {

    static NodeCollection PENDING_REFLECTION_CHECKS = new NodeCollection();

    Class435() throws Throwable {
        throw new Error();
    }

    public static AreadSound playSoundVorbis(int soundId, int type, int delay, int i_3, boolean voiceEffect, int i_5) {
        if ((voiceEffect ? Class393.preferences.voiceOverVolume.method12714() : Class393.preferences.soundEffectVolume.method12714()) != 0 && type != 0 && Class260.SOUNDS_SIZE < 50 && soundId != -1) {
            AreadSound class268_7 = new AreadSound((byte) (voiceEffect ? 3 : 2), soundId, type, delay, i_3, 0, i_5, null);
            Class260.SOUNDS[++Class260.SOUNDS_SIZE - 1] = class268_7;
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
                        if (class293_6.aTransform_Sub1_Sub3_3499 instanceof SceneObject) {
                            ((SceneObject) class293_6.aTransform_Sub1_Sub3_3499).method85();
                        }

                        if (class293_6.aTransform_Sub1_Sub4_3503 instanceof SceneObject) {
                            ((SceneObject) class293_6.aTransform_Sub1_Sub4_3503).method85();
                        }

                        if (class293_6.aTransform_Sub1_Sub4_3500 instanceof SceneObject) {
                            ((SceneObject) class293_6.aTransform_Sub1_Sub4_3500).method85();
                        }

                        if (class293_6.aTransform_Sub1_Sub5_3505 instanceof SceneObject) {
                            ((SceneObject) class293_6.aTransform_Sub1_Sub5_3505).method85();
                        }

                        if (class293_6.aTransform_Sub1_Sub5_3502 instanceof SceneObject) {
                            ((SceneObject) class293_6.aTransform_Sub1_Sub5_3502).method85();
                        }

                        for (Class208 class208_7 = class293_6.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
                            Transform_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aTransform_Sub1_Sub1_2659;
                            if (class521_sub1_sub1_8 instanceof SceneObject) {
                                ((SceneObject) class521_sub1_sub1_8).method85();
                            }
                        }
                    }
                }
            }
        }

    }

    static final void method7302(GraphicalRenderer graphicalrenderer_0, Interface22 interface22_1) {
        if (Class291_Sub1.aCacheableNode_Sub6_3491 != null) {
            Utils.time();
            Utils.time();
            if (Class291_Sub1.anInt8015 < 10) {
                if (!Class291_Sub1.MAP_AREA_INDEX.method5629(Class291_Sub1.aCacheableNode_Sub6_3491.aString9533)) {
                    Class291_Sub1.anInt8015 = IndexLoaders.WORLD_MAP_INDEX.method5631(Class291_Sub1.aCacheableNode_Sub6_3491.aString9533, (byte) 95) / 10;
                    return;
                }

                NPCDefinitions.method6907();
                Class291_Sub1.anInt8015 = 10;
            }

            if (Class291_Sub1.anInt8015 == 10) {
                Class291_Sub1.anInt3472 = Class291_Sub1.aCacheableNode_Sub6_3491.anInt9539 >> 6 << 6;
                Class291_Sub1.anInt3473 = Class291_Sub1.aCacheableNode_Sub6_3491.anInt9541 >> 6 << 6;
                Class291_Sub1.xLength = (Class291_Sub1.aCacheableNode_Sub6_3491.anInt9540 >> 6 << 6) - Class291_Sub1.anInt3472 + 64;
                Class291_Sub1.yLength = (Class291_Sub1.aCacheableNode_Sub6_3491.anInt9535 >> 6 << 6) - Class291_Sub1.anInt3473 + 64;
                int[] ints_3 = new int[3];
                int i_4 = -1;
                int i_5 = -1;
                Vector3 vector3_6 = VertexNormal.MY_PLAYER.method11166().coords;
                WorldTile coordgrid_7 = IndexLoaders.MAP_REGION_DECODER.getBase();
                if (Class291_Sub1.aCacheableNode_Sub6_3491.method14778(VertexNormal.MY_PLAYER.plane, ((int) vector3_6.x >> 9) + coordgrid_7.x, ((int) vector3_6.z >> 9) + coordgrid_7.y, ints_3, -1889386276)) {
                    i_4 = ints_3[1] - Class291_Sub1.anInt3472;
                    i_5 = ints_3[2] - Class291_Sub1.anInt3473;
                }

                if (!Class291_Sub1.aBool8028 && i_4 >= 0 && i_4 < Class291_Sub1.xLength && i_5 >= 0 && i_5 < Class291_Sub1.yLength) {
                    i_4 += (int) (Math.random() * 10.0D) - 5;
                    i_5 += (int) (Math.random() * 10.0D) - 5;
                    MapSpriteIndexLoader.anInt5123 = i_4;
                    Class475.anInt5624 = i_5;
                } else if (Class291_Sub1.anInt8019 != -1 && Class291_Sub1.anInt8020 != -1) {
                    Class291_Sub1.aCacheableNode_Sub6_3491.method14777(Class291_Sub1.anInt8019, Class291_Sub1.anInt8020, ints_3, -1997642770);
                    if (ints_3 != null) {
                        MapSpriteIndexLoader.anInt5123 = ints_3[1] - Class291_Sub1.anInt3472;
                        Class475.anInt5624 = ints_3[2] - Class291_Sub1.anInt3473;
                    }

                    Class291_Sub1.anInt8020 = -1;
                    Class291_Sub1.anInt8019 = -1;
                    Class291_Sub1.aBool8028 = false;
                } else {
                    Class291_Sub1.aCacheableNode_Sub6_3491.method14777(Class291_Sub1.aCacheableNode_Sub6_3491.anInt9532 >> 14 & 0x3fff, Class291_Sub1.aCacheableNode_Sub6_3491.anInt9532 & 0x3fff, ints_3, -2052252503);
                    MapSpriteIndexLoader.anInt5123 = ints_3[1] - Class291_Sub1.anInt3472;
                    Class475.anInt5624 = ints_3[2] - Class291_Sub1.anInt3473;
                }

                if (Class291_Sub1.aCacheableNode_Sub6_3491.anInt9542 == 37) {
                    Class291_Sub1.aFloat3468 = 3.0F;
                    Class291_Sub1.aFloat3462 = 3.0F;
                } else if (Class291_Sub1.aCacheableNode_Sub6_3491.anInt9542 == 50) {
                    Class291_Sub1.aFloat3468 = 4.0F;
                    Class291_Sub1.aFloat3462 = 4.0F;
                } else if (Class291_Sub1.aCacheableNode_Sub6_3491.anInt9542 == 75) {
                    Class291_Sub1.aFloat3468 = 6.0F;
                    Class291_Sub1.aFloat3462 = 6.0F;
                } else if (Class291_Sub1.aCacheableNode_Sub6_3491.anInt9542 == 100) {
                    Class291_Sub1.aFloat3468 = 8.0F;
                    Class291_Sub1.aFloat3462 = 8.0F;
                } else if (Class291_Sub1.aCacheableNode_Sub6_3491.anInt9542 == 200) {
                    Class291_Sub1.aFloat3468 = 16.0F;
                    Class291_Sub1.aFloat3462 = 16.0F;
                } else {
                    Class291_Sub1.aFloat3468 = 8.0F;
                    Class291_Sub1.aFloat3462 = 8.0F;
                }

                Class291_Sub1.anInt3469 = (int) Class291_Sub1.aFloat3468 >> 1;
                Class291_Sub1.aByteArrayArrayArray3464 = CircularBuffer.method8246(Class291_Sub1.anInt3469);
                Class89.method1502(-931909822);
                Class291_Sub1.method5126();
                QuickChatMessage.aClass482_4049 = new NodeCollection();
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
                Class291_Sub1.MAP_AREA_LOADER.method3697(1024, 256, 2137741394);
                Class291_Sub1.MAP_SPRITE_LOADER.method7175(256, 256, 993879963);
                Class291_Sub1.OBJECT_LOADER.method7899(4096);
                IndexLoaders.VARBIT_LOADER.method3906(256);
                Class291_Sub1.anInt8015 = 20;
            } else if (Class291_Sub1.anInt8015 == 20) {
                Exception_Sub3.method15619(true, -484129587);
                Class291_Sub1.method5183(graphicalrenderer_0, Class291_Sub1.anInt3454, Class291_Sub1.anInt3463);
                Class291_Sub1.anInt8015 = 60;
                Exception_Sub3.method15619(true, 771628468);
                Node_Sub15_Sub1.method14840((byte) -59);
            } else if (Class291_Sub1.anInt8015 == 60) {
                if (Class291_Sub1.MAP_AREA_INDEX.validFile(Class291_Sub1.aCacheableNode_Sub6_3491.aString9533 + "_staticelements")) {
                    if (!Class291_Sub1.MAP_AREA_INDEX.method5629(Class291_Sub1.aCacheableNode_Sub6_3491.aString9533 + "_staticelements")) {
                        return;
                    }

                    Class291_Sub1.aClass283_3470 = Class301.method5331(Class291_Sub1.MAP_AREA_INDEX, Class291_Sub1.aCacheableNode_Sub6_3491.aString9533 + "_staticelements", client.membersWorld);
                } else {
                    Class291_Sub1.aClass283_3470 = new Class283(0);
                }

                Class291_Sub1.method5145();
                Class291_Sub1.anInt8015 = 70;
                Exception_Sub3.method15619(true, -147678453);
                Node_Sub15_Sub1.method14840((byte) -22);
            } else if (Class291_Sub1.anInt8015 == 70) {
                Static.aClass194_5794 = new Class194(graphicalrenderer_0, 11, Class351.gameCanvas);
                Class291_Sub1.anInt8015 = 73;
                Exception_Sub3.method15619(true, -1670495557);
                Node_Sub15_Sub1.method14840((byte) 30);
            } else if (Class291_Sub1.anInt8015 == 73) {
                Class291_Sub1.aClass194_8017 = new Class194(graphicalrenderer_0, 12, Class351.gameCanvas);
                Class291_Sub1.anInt8015 = 76;
                Exception_Sub3.method15619(true, -1191023445);
                Node_Sub15_Sub1.method14840((byte) -90);
            } else if (Class291_Sub1.anInt8015 == 76) {
                Class291_Sub1.aClass194_8023 = new Class194(graphicalrenderer_0, 14, Class351.gameCanvas);
                Class291_Sub1.anInt8015 = 79;
                Exception_Sub3.method15619(true, -2098673020);
                Node_Sub15_Sub1.method14840((byte) -57);
            } else if (Class291_Sub1.anInt8015 == 79) {
                Class446.aClass194_5416 = new Class194(graphicalrenderer_0, 17, Class351.gameCanvas);
                Class291_Sub1.anInt8015 = 82;
                Exception_Sub3.method15619(true, 784313452);
                Node_Sub15_Sub1.method14840((byte) 55);
            } else if (Class291_Sub1.anInt8015 == 82) {
                ShaderLoader.aClass194_1243 = new Class194(graphicalrenderer_0, 19, Class351.gameCanvas);
                Class291_Sub1.anInt8015 = 85;
                Exception_Sub3.method15619(true, 299968314);
                Node_Sub15_Sub1.method14840((byte) -88);
            } else if (Class291_Sub1.anInt8015 == 85) {
                DefaultsFile.aClass194_6967 = new Class194(graphicalrenderer_0, 22, Class351.gameCanvas);
                Class291_Sub1.anInt8015 = 88;
                Exception_Sub3.method15619(true, 735044045);
                Node_Sub15_Sub1.method14840((byte) -35);
            } else if (Class291_Sub1.anInt8015 == 88) {
                RouteFinder.aClass194_3103 = new Class194(graphicalrenderer_0, 26, Class351.gameCanvas);
                Class291_Sub1.anInt8015 = 91;
                Exception_Sub3.method15619(true, 1741477937);
                Node_Sub15_Sub1.method14840((byte) -64);
            } else {
                Transform_Sub1_Sub5_Sub1.aClass194_10527 = new Class194(graphicalrenderer_0, 30, Class351.gameCanvas);
                Class291_Sub1.anInt8015 = 100;
                Exception_Sub3.method15619(true, -95185892);
                Node_Sub15_Sub1.method14840((byte) -14);
                System.gc();
            }
        }

    }

    public static String method7303(CacheableNode_Sub7 class282_sub50_sub7_0) {
        return !Class20.aBool161 && class282_sub50_sub7_0 != null ? ((class282_sub50_sub7_0.aString9588 == null || class282_sub50_sub7_0.aString9588.length() == 0) && class282_sub50_sub7_0.aString9585 != null && class282_sub50_sub7_0.aString9585.length() > 0 ? class282_sub50_sub7_0.aString9585 : class282_sub50_sub7_0.aString9588) : "";
    }

}
