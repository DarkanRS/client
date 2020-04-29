package com.jagex;

public class HitbarDefinitions {

    public static int CAMERA_ZOOM = 600;
    public int anInt2446 = 255;
    public int anInt2440 = 255;
    public int anInt2439 = -1;
    public int anInt2443 = 70;
    public int anInt2442 = 1;
    HeadbarIndexLoader aClass290_2437;
    int anInt2444 = -1;
    int anInt2445 = -1;
    int anInt2441 = -1;
    int anInt2447 = -1;

    static void method3230(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_8 = i_2 + i_6;
        int i_9 = i_3 - i_6;
        int i_10;
        for (i_10 = i_2; i_10 < i_8; i_10++) {
            KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_10], i_0, i_1, i_5);
        }
        for (i_10 = i_3; i_10 > i_9; --i_10) {
            KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_10], i_0, i_1, i_5);
        }
        i_10 = i_0 + i_6;
        int i_11 = i_1 - i_6;
        for (int i_12 = i_8; i_12 <= i_9; i_12++) {
            int[] ints_13 = Class532_Sub1.anIntArrayArray7072[i_12];
            KeyHoldInputSubscriber.method3922(ints_13, i_0, i_10, i_5);
            KeyHoldInputSubscriber.method3922(ints_13, i_10, i_11, i_4);
            KeyHoldInputSubscriber.method3922(ints_13, i_11, i_1, i_5);
        }
    }

    static void method3231(int i_0, int i_1, int i_2, int i_3, boolean bool_4) {
        int i_01 = i_0;
        int i_13 = i_1;
        int i_21 = i_2;
        int i_31 = i_3;
        if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() == null) {
            Renderers.SOFTWARE_RENDERER.method8425(i_01, i_13, i_21, i_31, -16777216);
        } else {
            Vector3 vector3_6 = VertexNormal.MY_PLAYER.method11166().coords;
            boolean bool_7 = false;
            if (client.anInt7341 != 1) {
                if (!client.aBool7321) {
                    bool_7 = true;
                }
            } else if ((int) vector3_6.x < 0 || (int) vector3_6.x >= IndexLoaders.MAP_REGION_DECODER.getSizeX() * 512 || (int) vector3_6.z < 0 || (int) vector3_6.z >= IndexLoaders.MAP_REGION_DECODER.getSizeY() * 512) {
                bool_7 = true;
            }
            if (bool_7) {
                Renderers.SOFTWARE_RENDERER.method8425(i_01, i_13, i_21, i_31, -16777216);
            } else {
                ++client.anInt7286;
                if (VertexNormal.MY_PLAYER != null && (int) vector3_6.x - (VertexNormal.MY_PLAYER.getSize() - 1) * 256 >> 9 == Class187.anInt2361 && (int) vector3_6.z - (VertexNormal.MY_PLAYER.getSize() - 1) * 256 >> 9 == Class187.anInt2359) {
                    Class187.anInt2361 = -1;
                    Class187.anInt2359 = -1;
                    MaterialProp28.method15255();
                }
                Class52_Sub3.method14519();
                if (!bool_4) {
                    Class113.method1883();
                }
                Class258.method4569();
                Class492.method8265(i_01, i_13, i_21, i_31, true);
                i_01 = client.anInt7444;
                i_13 = client.anInt7445;
                i_21 = client.anInt7188;
                i_31 = client.anInt7440;
                Class380.method6451(i_01, i_13);
                int i_8;
                int i_9;
                if (NativeLibraryLoader.anInt3240 == 2) {
                    i_8 = (int) client.camAngleX;
                    if (client.anInt7273 >> 8 > i_8) {
                        i_8 = client.anInt7273 >> 8;
                    }
                    if (client.CAM_SHAKING[4] && client.anIntArray7433[4] + 128 > i_8) {
                        i_8 = client.anIntArray7433[4] + 128;
                    }
                    i_9 = (int) client.camAngleY + client.anInt7343 & 0x3fff;
                    LoadingStage.method6683(Class11.anInt122, Class504.getTerrainHeightAtPos((int) vector3_6.x, (int) vector3_6.z, Class4.MY_PLAYER_PLANE) - 200, Class266.anInt3289, i_8, i_9, (i_8 >> 3) * 3 + CAMERA_ZOOM << 2, i_31);
                } else if (NativeLibraryLoader.anInt3240 == 4) {
                    i_8 = (int) client.camAngleX;
                    if (client.anInt7273 >> 8 > i_8) {
                        i_8 = client.anInt7273 >> 8;
                    }
                    if (client.CAM_SHAKING[4] && client.anIntArray7433[4] + 128 > i_8) {
                        i_8 = client.anIntArray7433[4] + 128;
                    }
                    i_9 = (int) client.camAngleY & 0x3fff;
                    LoadingStage.method6683(Class11.anInt122, Class504.getTerrainHeightAtPos(client.anInt7262, client.anInt7376, Class4.MY_PLAYER_PLANE) - 200, Class266.anInt3289, i_8, i_9, (i_8 >> 3) * 3 + CAMERA_ZOOM << 2, i_31);
                } else if (NativeLibraryLoader.anInt3240 == 1) {
                    KeyHoldInputSubscriber.method3920(i_31);
                }
                i_8 = IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX;
                i_9 = Class109_Sub1.CAM_MOVE_ABSOLUTEZ;
                int i_10 = Class246.CAM_MOVE_ABSOLUTEY;
                int i_11 = Class293.anInt3512;
                int i_12 = AnimationDefinitions.anInt5930;
                int i_14;
                for (int slotId = 0; slotId < 5; slotId++) {
                    if (client.CAM_SHAKING[slotId]) {
                        i_14 = (int) (Math.random() * (client.anIntArray7268[slotId] * 2 + 1) - client.anIntArray7268[slotId] + Math.sin(client.anIntArray7435[slotId] * (client.anIntArray7462[slotId] / 100.0D)) * client.anIntArray7433[slotId]);
                        if (slotId == 0) {
                            IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX += i_14 << 2;
                        }
                        if (slotId == 1) {
                            Class109_Sub1.CAM_MOVE_ABSOLUTEZ += i_14 << 2;
                        }
                        if (slotId == 2) {
                            Class246.CAM_MOVE_ABSOLUTEY += i_14 << 2;
                        }
                        if (slotId == 3) {
                            AnimationDefinitions.anInt5930 = i_14 + AnimationDefinitions.anInt5930 & 0x3fff;
                        }
                        if (slotId == 4) {
                            Class293.anInt3512 += i_14;
                            if (Class293.anInt3512 < 1024) {
                                Class293.anInt3512 = 1024;
                            } else if (Class293.anInt3512 > 3072) {
                                Class293.anInt3512 = 3072;
                            }
                        }
                    }
                }
                if (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX < 0) {
                    IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = 0;
                }
                if (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX > (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().sizeX << 9) - 1) {
                    IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().sizeX << 9) - 1;
                }
                if (Class246.CAM_MOVE_ABSOLUTEY < 0) {
                    Class246.CAM_MOVE_ABSOLUTEY = 0;
                }
                if (Class246.CAM_MOVE_ABSOLUTEY > (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().sizeY << 9) - 1) {
                    Class246.CAM_MOVE_ABSOLUTEY = (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().sizeY << 9) - 1;
                }
                QuickchatMessageLoader.method7215();
                Renderers.SOFTWARE_RENDERER.method8617(i_01, i_13, i_21, i_31);
                Renderers.SOFTWARE_RENDERER.r(i_01, i_13, i_01 + i_21, i_31 + i_13);
                Class535 class535_16 = IndexLoaders.MAP_REGION_DECODER.method4435().method4038();
                i_14 = class535_16.method11450();
                client.aClass294_7457.method5223((-IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX), (-Class109_Sub1.CAM_MOVE_ABSOLUTEZ), (-Class246.CAM_MOVE_ABSOLUTEY));
                client.aClass294_7457.rotation(0.0F, -1.0f, 0.0F, Class382.method6508(-AnimationDefinitions.anInt5930 & 0x3fff));
                client.aClass294_7457.rotation(-1.0f, 0.0F, 0.0F, Class382.method6508(-Class293.anInt3512 & 0x3fff));
                client.aClass294_7457.rotation(0.0F, 0.0F, -1.0f, Class382.method6508(-Class121.anInt1525 & 0x3fff));
                Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
                HitsplatDefinitions.method3850(client.aClass384_7167, (i_21 / 2), (i_31 / 2), (client.anInt7451 << 1), (client.anInt7451 << 1), i_21, i_31);
                Renderers.SOFTWARE_RENDERER.method8424(client.aClass384_7167);
                if (class535_16.method11451() != null) {
                    Renderers.SOFTWARE_RENDERER.IA(1.0F);
                    Renderers.SOFTWARE_RENDERER.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                    class535_16.method11451().method4215(Renderers.SOFTWARE_RENDERER, Class388.anInt4723 << 3, i_01, i_13, i_21, i_31, Class293.anInt3512, AnimationDefinitions.anInt5930, Class121.anInt1525, i_14);
                } else {
                    Renderers.SOFTWARE_RENDERER.ba(3, i_14);
                }
                Class412.method6934(client.aClass294_7457, client.aClass384_7167, i_21, i_31);
                IndexLoaders.MAP_REGION_DECODER.method4435().method4037(IndexLoaders.MAP_REGION_DECODER);
                byte b_15 = Class393.preferences.removeRoofsOptionOverride.method12952() == 2 ? (byte) client.anInt7286 : 1;
                IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3447(client.cycles, IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX, Class109_Sub1.CAM_MOVE_ABSOLUTEZ, Class246.CAM_MOVE_ABSOLUTEY, IndexLoaders.MAP_REGION_DECODER.method4532(), client.anIntArray7198, client.anIntArray7303, client.anIntArray7194, client.anIntArray7305, client.anIntArray7306, VertexNormal.MY_PLAYER.plane + 1, b_15, Class393.preferences.flickeringEffects.method12943() == 0);
                ++client.anInt7396;
                MaterialPropTexture.method15391();
                if (client.gameState == 13) {
                    Class423.method7066(i_01, i_13);
                    Class250.method4298(i_01, i_13, i_21, i_31);
                    CutsceneAction_Sub12.method14612(i_01, i_13);
                    Class163.method2844();
                }
                IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3399();
                IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = i_8;
                Class109_Sub1.CAM_MOVE_ABSOLUTEZ = i_9;
                Class246.CAM_MOVE_ABSOLUTEY = i_10;
                Class293.anInt3512 = i_11;
                AnimationDefinitions.anInt5930 = i_12;
                if (client.aBool7172 && Class119.JS5_STANDARD_REQUESTER.priorities() == 0) {
                    client.aBool7172 = false;
                }
                if (client.aBool7172) {
                    Renderers.SOFTWARE_RENDERER.method8425(i_01, i_13, i_21, i_31, -16777216);
                    Class446.method7447(LocalizedText.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE), false, Renderers.SOFTWARE_RENDERER, Class16.aFontRenderer_144, Class16.aClass414_139);
                }
                HitsplatDefinitions.method3850(client.aClass384_7167, (i_01 + i_21 / 2), (i_31 / 2 + i_13), (client.anInt7451 << 1), (client.anInt7451 << 1), i_21, i_31);
                Renderers.SOFTWARE_RENDERER.method8424(client.aClass384_7167);
                Node_Sub39.method13296(client.aClass384_7167);
            }
        }
    }

    void method3206(ByteBuf stream, int opcode) {
        if (opcode == 1) {
            stream.readUnsignedShort();
        } else if (opcode == 2) {
            anInt2446 = stream.readUnsignedByte();
        } else if (opcode == 3) {
            anInt2440 = stream.readUnsignedByte();
        } else if (opcode == 4) {
            anInt2439 = 0;
        } else if (opcode == 5) {
            anInt2443 = stream.readUnsignedShort();
        } else if (opcode == 6) {
            stream.readUnsignedByte();
        } else if (opcode == 7) {
            anInt2444 = stream.readBigSmart();
        } else if (opcode == 8) {
            anInt2445 = stream.readBigSmart();
        } else if (opcode == 9) {
            anInt2441 = stream.readBigSmart();
        } else if (opcode == 10) {
            anInt2447 = stream.readBigSmart();
        } else if (opcode == 11) {
            anInt2439 = stream.readUnsignedShort();
        }
    }

    public NativeSprite method3207(AbstractRenderer graphicalrenderer_1) {
        if (anInt2444 < 0) {
            return null;
        } else {
            NativeSprite nativesprite_3 = (NativeSprite) aClass290_2437.aClass229_3447.get(anInt2444);
            if (nativesprite_3 == null) {
                method3211(graphicalrenderer_1);
                nativesprite_3 = (NativeSprite) aClass290_2437.aClass229_3447.get(anInt2444);
            }
            return nativesprite_3;
        }
    }

    public NativeSprite method3208(AbstractRenderer graphicalrenderer_1) {
        if (anInt2445 < 0) {
            return null;
        } else {
            NativeSprite nativesprite_3 = (NativeSprite) aClass290_2437.aClass229_3447.get(anInt2445);
            if (nativesprite_3 == null) {
                method3211(graphicalrenderer_1);
                nativesprite_3 = (NativeSprite) aClass290_2437.aClass229_3447.get(anInt2445);
            }
            return nativesprite_3;
        }
    }

    void method3210(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method3206(rsbytebuffer_1, i_3);
        }
    }

    void method3211(AbstractRenderer graphicalrenderer_1) {
        Index index_3 = aClass290_2437.aClass317_3448;
        SpriteDefinitions class91_4;
        if (anInt2444 >= 0 && aClass290_2437.aClass229_3447.get(anInt2444) == null && index_3.loadFile(anInt2444)) {
            class91_4 = SpriteDefinitions.method1515(index_3, anInt2444);
            aClass290_2437.aClass229_3447.put(graphicalrenderer_1.method8444(class91_4, true), anInt2444);
        }
        if (anInt2445 >= 0 && aClass290_2437.aClass229_3447.get(anInt2445) == null && index_3.loadFile(anInt2445)) {
            class91_4 = SpriteDefinitions.method1515(index_3, anInt2445);
            aClass290_2437.aClass229_3447.put(graphicalrenderer_1.method8444(class91_4, true), anInt2445);
        }
        if (anInt2441 >= 0 && aClass290_2437.aClass229_3447.get(anInt2441) == null && index_3.loadFile(anInt2441)) {
            class91_4 = SpriteDefinitions.method1515(index_3, anInt2441);
            aClass290_2437.aClass229_3447.put(graphicalrenderer_1.method8444(class91_4, true), anInt2441);
        }
        if (anInt2447 >= 0 && aClass290_2437.aClass229_3447.get(anInt2447) == null && index_3.loadFile(anInt2447)) {
            class91_4 = SpriteDefinitions.method1515(index_3, anInt2447);
            aClass290_2437.aClass229_3447.put(graphicalrenderer_1.method8444(class91_4, true), anInt2447);
        }
    }

    public NativeSprite method3222(AbstractRenderer graphicalrenderer_1) {
        if (anInt2441 < 0) {
            return method3207(graphicalrenderer_1);
        } else {
            NativeSprite nativesprite_3 = (NativeSprite) aClass290_2437.aClass229_3447.get(anInt2441);
            if (nativesprite_3 == null) {
                method3211(graphicalrenderer_1);
                nativesprite_3 = (NativeSprite) aClass290_2437.aClass229_3447.get(anInt2441);
            }
            return nativesprite_3;
        }
    }

    public NativeSprite method3224(AbstractRenderer graphicalrenderer_1) {
        if (anInt2447 < 0) {
            return method3208(graphicalrenderer_1);
        } else {
            NativeSprite nativesprite_3 = (NativeSprite) aClass290_2437.aClass229_3447.get(anInt2447);
            if (nativesprite_3 == null) {
                method3211(graphicalrenderer_1);
                nativesprite_3 = (NativeSprite) aClass290_2437.aClass229_3447.get(anInt2447);
            }
            return nativesprite_3;
        }
    }
}
