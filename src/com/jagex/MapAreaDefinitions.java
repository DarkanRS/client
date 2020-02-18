package com.jagex;

public class MapAreaDefinitions {

    public int anInt2753;
    public int anInt2719 = -1;
    public int anInt2757 = -1;
    public String areaName;
    public int anInt2720;
    public int anInt2721 = -1;
    public int anInt2722;
    public boolean aBool2728 = true;
    public boolean aBool2729;
    public boolean aBool2730 = true;
    public int[] anIntArray2717;
    public boolean aBool2742 = true;
    public String aString2732;
    public int anInt2715;
    public int[] anIntArray2738;
    public int anInt2718 = -1;
    public byte[] aByteArray2754;
    public int anInt2727;
    public int anInt2726;
    public int anInt2748 = -1;
    public int anInt2749 = -1;
    public int anInt2756 = -1;
    public int anInt2750;
    public int anInt2752;
    public int anInt2747 = Integer.MAX_VALUE;
    public int anInt2731 = Integer.MIN_VALUE;
    public int anInt2744 = Integer.MAX_VALUE;
    public int anInt2746 = Integer.MIN_VALUE;
    public String[] aStringArray2740 = new String[5];
    MapAreaIndexLoader aClass218_2716;
    int anInt2736 = -1;
    int anInt2745 = -1;
    int anInt2734;
    int anInt2735;
    int anInt2733 = -1;
    int anInt2755 = -1;
    int anInt2741 = -1;
    int anInt2743;
    int anInt2739;
    IterableNodeMap aClass465_2737;

    static void iComponentOnNPC(NPCEntity npc_0, boolean bool_1) {
        if (Class20.anInt169 < 412) {
            NPCType npcdefinitions_3 = npc_0.definitions;
            String string_4 = npc_0.modifiedName;
            if (npcdefinitions_3.transformTo != null) {
                npcdefinitions_3 = npcdefinitions_3.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
                if (npcdefinitions_3 == null) {
                    return;
                }
                string_4 = npcdefinitions_3.name;
            }
            if (npcdefinitions_3.visible) {
                if (npc_0.anInt10582 != 0) {
                    String string_5 = client.CURRENT_GAME == Game.stellarDawn ? LocalizedText.RATING_.translate(Class223.CURRENT_LANGUAGE) : LocalizedText.LEVEL_.translate(Class223.CURRENT_LANGUAGE);
                    string_4 = string_4 + ObjectIndexLoader.method7169(npc_0.anInt10582, VertexNormal.MY_PLAYER.combatLevel) + " (" + string_5 + npc_0.anInt10582 + ")";
                }
                if (client.aBool7344 && !bool_1) {
                    ParamDefinitions attributedefault_10 = CutsceneAction_Sub12.USE_INTERFACE_ID != -1 ? IndexLoaders.PARAM_LOADER.getParam(CutsceneAction_Sub12.USE_INTERFACE_ID) : null;
                    if ((Class506.USE_OPTIONS_FLAGS & 0x2) != 0 && (attributedefault_10 == null || npcdefinitions_3.method6876(CutsceneAction_Sub12.USE_INTERFACE_ID, attributedefault_10.defaultInt) != attributedefault_10.defaultInt)) {
                        PlayerModel.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + Utils.rgbToColHexShortcut(16776960) + string_4, Defaults8Loader.anInt5932, 8, -1, npc_0.index, 0, 0, true, false, npc_0.index, false);
                    }
                }
                if (!bool_1) {
                    String[] arr_11 = npcdefinitions_3.options;
                    if (client.aBool7264) {
                        arr_11 = Class362.method6277(arr_11);
                    }
                    if (arr_11 != null) {
                        int i_6;
                        short s_7;
                        for (i_6 = arr_11.length - 1; i_6 >= 0; --i_6) {
                            if (arr_11[i_6] != null && (npcdefinitions_3.aByte4916 == 0 || !arr_11[i_6].equalsIgnoreCase(LocalizedText.ATTACK.translate(Class223.CURRENT_LANGUAGE)) && !arr_11[i_6].equalsIgnoreCase(LocalizedText.EXAMINE.translate(Class223.CURRENT_LANGUAGE)))) {
                                s_7 = 0;
                                int i_8 = client.anInt7342;
                                if (i_6 == 0) {
                                    s_7 = 9;
                                }
                                if (i_6 == 1) {
                                    s_7 = 10;
                                }
                                if (i_6 == 2) {
                                    s_7 = 11;
                                }
                                if (i_6 == 3) {
                                    s_7 = 12;
                                }
                                if (i_6 == 4) {
                                    s_7 = 13;
                                }
                                if (i_6 == 5) {
                                    s_7 = 1003;
                                }
                                if (i_6 == npcdefinitions_3.anInt4875) {
                                    i_8 = npcdefinitions_3.anInt4873;
                                }
                                if (i_6 == npcdefinitions_3.anInt4854) {
                                    i_8 = npcdefinitions_3.anInt4861;
                                }
                                PlayerModel.method4032(arr_11[i_6], Utils.rgbToColHexShortcut(16776960) + string_4, arr_11[i_6].equalsIgnoreCase(LocalizedText.ATTACK.translate(Class223.CURRENT_LANGUAGE)) ? npcdefinitions_3.anInt4877 : i_8, s_7, -1, npc_0.index, 0, 0, true, false, npc_0.index, false);
                            }
                        }
                        if (npcdefinitions_3.aByte4916 == 1) {
                            for (i_6 = 0; i_6 < arr_11.length; i_6++) {
                                if (arr_11[i_6] != null && (arr_11[i_6].equalsIgnoreCase(LocalizedText.ATTACK.translate(Class223.CURRENT_LANGUAGE)) || arr_11[i_6].equalsIgnoreCase(LocalizedText.EXAMINE.translate(Class223.CURRENT_LANGUAGE)))) {
                                    s_7 = 0;
                                    if (npc_0.anInt10582 > VertexNormal.MY_PLAYER.combatLevel) {
                                        s_7 = 2000;
                                    }
                                    short s_12 = 0;
                                    int i_9 = client.anInt7342;
                                    if (i_6 == 0) {
                                        s_12 = 9;
                                    }
                                    if (i_6 == 1) {
                                        s_12 = 10;
                                    }
                                    if (i_6 == 2) {
                                        s_12 = 11;
                                    }
                                    if (i_6 == 3) {
                                        s_12 = 12;
                                    }
                                    if (i_6 == 4) {
                                        s_12 = 13;
                                    }
                                    if (i_6 == 5) {
                                        s_12 = 1003;
                                    }
                                    if (s_12 != 0) {
                                        s_12 += s_7;
                                    }
                                    if (i_6 == npcdefinitions_3.anInt4875) {
                                        i_9 = npcdefinitions_3.anInt4873;
                                    }
                                    if (i_6 == npcdefinitions_3.anInt4854) {
                                        i_9 = npcdefinitions_3.anInt4861;
                                    }
                                    PlayerModel.method4032(arr_11[i_6], Utils.rgbToColHexShortcut(16776960) + string_4, arr_11[i_6].equalsIgnoreCase(LocalizedText.ATTACK.translate(Class223.CURRENT_LANGUAGE)) ? npcdefinitions_3.anInt4877 : i_9, s_12, -1, npc_0.index, 0, 0, true, false, npc_0.index, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static String method3741() {
        String str_1 = "www";
        if (HDWaterTile.SERVER_ENVIRONMENT == ServerEnvironment.WTRC) {
            str_1 = "www-wtrc";
        } else if (HDWaterTile.SERVER_ENVIRONMENT == ServerEnvironment.WTQA) {
            str_1 = "www-wtqa";
        } else if (HDWaterTile.SERVER_ENVIRONMENT == ServerEnvironment.WTWIP) {
            str_1 = "www-wtwip";
        } else if (HDWaterTile.SERVER_ENVIRONMENT == ServerEnvironment.WTI) {
            str_1 = "www-wti";
        }
        String str_2 = "";
        if (client.aString7281 != null) {
            str_2 = "/p=" + client.aString7281;
        }
        String string_3 = client.CURRENT_GAME.name + ".com";
        return "http://" + str_1 + "." + string_3 + "/l=" + Class223.CURRENT_LANGUAGE + "/a=" + client.AFFILIATE + str_2 + "/";
    }

    static boolean renderIconsAndNames(AbstractRenderer graphicalrenderer_0, Node_Sub36 class282_sub36_1, MapAreaDefinitions worldmapareadefs_2) {
        int i_6 = Integer.MAX_VALUE;
        int i_7 = Integer.MIN_VALUE;
        int i_8 = Integer.MAX_VALUE;
        int i_9 = Integer.MIN_VALUE;
        if (worldmapareadefs_2.anIntArray2717 != null) {
            i_6 = (Class291_Sub1.anInt3476 - Class291_Sub1.anInt3489) * (worldmapareadefs_2.anInt2747 + class282_sub36_1.anInt7987 - Class291_Sub1.anInt3485) / (Class291_Sub1.anInt3480 - Class291_Sub1.anInt3485) + Class291_Sub1.anInt3489;
            i_7 = Class291_Sub1.anInt3489 + (Class291_Sub1.anInt3476 - Class291_Sub1.anInt3489) * (worldmapareadefs_2.anInt2731 + class282_sub36_1.anInt7987 - Class291_Sub1.anInt3485) / (Class291_Sub1.anInt3480 - Class291_Sub1.anInt3485);
            i_9 = Class291_Sub1.anInt3492 - (Class291_Sub1.anInt3492 - Class291_Sub1.anInt3490) * (worldmapareadefs_2.anInt2744 + class282_sub36_1.anInt7993 - Class291_Sub1.anInt3465) / (Class291_Sub1.anInt3486 - Class291_Sub1.anInt3465);
            i_8 = Class291_Sub1.anInt3492 - (Class291_Sub1.anInt3492 - Class291_Sub1.anInt3490) * (worldmapareadefs_2.anInt2746 + class282_sub36_1.anInt7993 - Class291_Sub1.anInt3465) / (Class291_Sub1.anInt3486 - Class291_Sub1.anInt3465);
        }
        NativeSprite nativesprite_10 = null;
        int i_11 = 0;
        int i_12 = 0;
        int i_13 = 0;
        int i_14 = 0;
        if (worldmapareadefs_2.anInt2719 != -1) {
            if (class282_sub36_1.aBool7989 && worldmapareadefs_2.anInt2757 != -1) {
                nativesprite_10 = worldmapareadefs_2.renderIcons(graphicalrenderer_0, true);
            } else {
                nativesprite_10 = worldmapareadefs_2.renderIcons(graphicalrenderer_0, false);
            }
            if (nativesprite_10 != null) {
                i_11 = class282_sub36_1.anInt7990 - (nativesprite_10.scaleWidth() + 1 >> 1);
                if (i_11 < i_6) {
                    i_6 = i_11;
                }
                i_12 = class282_sub36_1.anInt7990 + (nativesprite_10.scaleWidth() + 1 >> 1);
                if (i_12 > i_7) {
                    i_7 = i_12;
                }
                i_13 = class282_sub36_1.anInt7992 - (nativesprite_10.method2748() + 1 >> 1);
                if (i_13 < i_8) {
                    i_8 = i_13;
                }
                i_14 = class282_sub36_1.anInt7992 + (nativesprite_10.method2748() + 1 >> 1);
                if (i_14 > i_9) {
                    i_9 = i_14;
                }
            }
        }
        Class194 class194_15 = null;
        int i_16 = 0;
        int i_17 = 0;
        int i_18 = 0;
        int i_19 = 0;
        int i_20 = 0;
        int i_21 = 0;
        int i_22 = 0;
        int i_23 = 0;
        int i_24;
        if (worldmapareadefs_2.areaName != null) {
            class194_15 = AsyncInputStream.method5048(worldmapareadefs_2.anInt2722);
            if (class194_15 != null) {
                i_16 = Node_Sub17_Sub2.aClass414_9933.method6987(worldmapareadefs_2.areaName, null, Class291_Sub1.aStringArray8024, null);
                i_17 = (Class291_Sub1.anInt3476 - Class291_Sub1.anInt3489) * worldmapareadefs_2.anInt2750 / (Class291_Sub1.anInt3480 - Class291_Sub1.anInt3485) + class282_sub36_1.anInt7990;
                i_18 = class282_sub36_1.anInt7992 - (Class291_Sub1.anInt3492 - Class291_Sub1.anInt3490) * worldmapareadefs_2.anInt2752 / (Class291_Sub1.anInt3486 - Class291_Sub1.anInt3465);
                if (nativesprite_10 == null) {
                    i_18 -= class194_15.method3186() * i_16 / 2;
                } else {
                    i_18 -= (nativesprite_10.method2748() >> 1) + class194_15.method3173() * i_16;
                }
                for (i_24 = 0; i_24 < i_16; i_24++) {
                    String string_25 = Class291_Sub1.aStringArray8024[i_24];
                    if (i_24 < i_16 - 1) {
                        string_25 = string_25.substring(0, string_25.length() - 4);
                    }
                    int i_26 = class194_15.method3177(string_25);
                    if (i_26 > i_19) {
                        i_19 = i_26;
                    }
                }
                i_20 = (i_17 - i_19 / 2);
                if (i_20 < i_6) {
                    i_6 = i_20;
                }
                i_21 = i_19 / 2 + i_17;
                if (i_21 > i_7) {
                    i_7 = i_21;
                }
                i_22 = i_18;
                if (i_22 < i_8) {
                    i_8 = i_22;
                }
                i_23 = i_18 + i_16 * class194_15.method3173();
                if (i_23 > i_9) {
                    i_9 = i_23;
                }
            }
        }
        if (i_7 >= Class291_Sub1.anInt3489 && i_6 <= Class291_Sub1.anInt3476 && i_9 >= Class291_Sub1.anInt3490 && i_8 <= Class291_Sub1.anInt3492) {
            Class291_Sub1.method5147(graphicalrenderer_0, class282_sub36_1, worldmapareadefs_2);
            if (nativesprite_10 != null) {
                if (Class361.anInt4185 > 0 && (Class291_Sub1.anInt8018 != -1 && Class291_Sub1.anInt8018 == class282_sub36_1.anInt7991 || Class291_Sub1.anInt8026 != -1 && worldmapareadefs_2.anInt2718 == Class291_Sub1.anInt8026)) {
                    if (CutsceneAction_Sub9.anInt9282 > 50) {
                        i_24 = 200 - CutsceneAction_Sub9.anInt9282 * 2;
                    } else {
                        i_24 = CutsceneAction_Sub9.anInt9282 * 2;
                    }
                    int i_27 = i_24 << 24 | 0xffff00;
                    graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2 + 7, i_27);
                    graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2 + 5, i_27);
                    graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2 + 3, i_27);
                    graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2 + 1, i_27);
                    graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2, i_27);
                }
                nativesprite_10.method2752(class282_sub36_1.anInt7990 - (nativesprite_10.scaleWidth() >> 1), class282_sub36_1.anInt7992 - (nativesprite_10.method2748() >> 1));
            }
            if (worldmapareadefs_2.areaName != null && class194_15 != null) {
                InventoriesIndexLoader.renderAreaText(graphicalrenderer_0, class282_sub36_1, worldmapareadefs_2, i_16, i_17, i_18, i_19, class194_15);
            }
            if (worldmapareadefs_2.anInt2719 != -1 || worldmapareadefs_2.areaName != null) {
                Node_Sub33 class282_sub33_28 = new Node_Sub33(class282_sub36_1);
                class282_sub33_28.anInt7830 = i_11;
                class282_sub33_28.anInt7828 = i_12;
                class282_sub33_28.anInt7834 = i_13;
                class282_sub33_28.anInt7833 = i_14;
                class282_sub33_28.anInt7829 = i_20;
                class282_sub33_28.anInt7832 = i_21;
                class282_sub33_28.anInt7831 = i_22;
                class282_sub33_28.anInt7827 = i_23;
                QuickChatMessage.aClass482_4049.append(class282_sub33_28);
            }
            return false;
        } else {
            return true;
        }
    }

    void method3716(Packet rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method3717(rsbytebuffer_1, i_3);
        }
    }

    void method3717(Packet rsbytebuffer_1, int i_2) {
        if (i_2 == 1) {
            anInt2719 = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 2) {
            anInt2757 = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 3) {
            areaName = rsbytebuffer_1.readString();
        } else if (i_2 == 4) {
            anInt2720 = rsbytebuffer_1.read24BitUnsignedInteger();
        } else if (i_2 == 5) {
            anInt2721 = rsbytebuffer_1.read24BitUnsignedInteger();
        } else if (i_2 == 6) {
            anInt2722 = rsbytebuffer_1.readUnsignedByte();
        } else {
            int i_4;
            if (i_2 == 7) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                if ((i_4 & 0x1) == 0) {
                    aBool2728 = false;
                }
                if ((i_4 & 0x2) == 2) {
                    aBool2729 = true;
                }
            } else if (i_2 == 8) {
                aBool2730 = rsbytebuffer_1.readUnsignedByte() == 1;
            } else if (i_2 == 9) {
                anInt2736 = rsbytebuffer_1.readUnsignedShort();
                if (anInt2736 == 65535) {
                    anInt2736 = -1;
                }
                anInt2745 = rsbytebuffer_1.readUnsignedShort();
                if (anInt2745 == 65535) {
                    anInt2745 = -1;
                }
                anInt2734 = rsbytebuffer_1.readInt();
                anInt2735 = rsbytebuffer_1.readInt();
            } else if (i_2 >= 10 && i_2 <= 14) {
                aStringArray2740[i_2 - 10] = rsbytebuffer_1.readString();
            } else {
                int i_5;
                if (i_2 == 15) {
                    i_4 = rsbytebuffer_1.readUnsignedByte();
                    anIntArray2717 = new int[i_4 * 2];
                    for (i_5 = 0; i_5 < i_4 * 2; i_5++) {
                        anIntArray2717[i_5] = rsbytebuffer_1.readShort();
                    }
                    anInt2715 = rsbytebuffer_1.readInt();
                    i_5 = rsbytebuffer_1.readUnsignedByte();
                    anIntArray2738 = new int[i_5];
                    int i_6;
                    for (i_6 = 0; i_6 < anIntArray2738.length; i_6++) {
                        anIntArray2738[i_6] = rsbytebuffer_1.readInt();
                    }
                    aByteArray2754 = new byte[i_4];
                    for (i_6 = 0; i_6 < i_4; i_6++) {
                        aByteArray2754[i_6] = rsbytebuffer_1.readByte();
                    }
                } else if (i_2 == 16) {
                    aBool2742 = false;
                } else if (i_2 == 17) {
                    aString2732 = rsbytebuffer_1.readString();
                } else if (i_2 == 18) {
                    anInt2733 = rsbytebuffer_1.readBigSmart();
                } else if (i_2 == 19) {
                    anInt2718 = rsbytebuffer_1.readUnsignedShort();
                } else if (i_2 == 20) {
                    anInt2755 = rsbytebuffer_1.readUnsignedShort();
                    if (anInt2755 == 65535) {
                        anInt2755 = -1;
                    }
                    anInt2741 = rsbytebuffer_1.readUnsignedShort();
                    if (anInt2741 == 65535) {
                        anInt2741 = -1;
                    }
                    anInt2743 = rsbytebuffer_1.readInt();
                    anInt2739 = rsbytebuffer_1.readInt();
                } else if (i_2 == 21) {
                    anInt2727 = rsbytebuffer_1.readInt();
                } else if (i_2 == 22) {
                    anInt2726 = rsbytebuffer_1.readInt();
                } else if (i_2 == 23) {
                    anInt2748 = rsbytebuffer_1.readUnsignedByte();
                    anInt2749 = rsbytebuffer_1.readUnsignedByte();
                    anInt2756 = rsbytebuffer_1.readUnsignedByte();
                } else if (i_2 == 24) {
                    anInt2750 = rsbytebuffer_1.readShort();
                    anInt2752 = rsbytebuffer_1.readShort();
                } else if (i_2 == 249) {
                    i_4 = rsbytebuffer_1.readUnsignedByte();
                    if (aClass465_2737 == null) {
                        i_5 = Utils.nextPowerOfTwo(i_4);
                        aClass465_2737 = new IterableNodeMap(i_5);
                    }
                    for (i_5 = 0; i_5 < i_4; i_5++) {
                        boolean bool_9 = rsbytebuffer_1.readUnsignedByte() == 1;
                        int i_7 = rsbytebuffer_1.read24BitUnsignedInteger();
                        Node obj_8;
                        if (bool_9) {
                            obj_8 = new ObjectNode(rsbytebuffer_1.readString());
                        } else {
                            obj_8 = new IntNode(rsbytebuffer_1.readInt());
                        }
                        aClass465_2737.put(obj_8, i_7);
                    }
                }
            }
        }
    }

    void method3718() {
        if (anIntArray2717 != null) {
            for (int i_2 = 0; i_2 < anIntArray2717.length; i_2 += 2) {
                if (anIntArray2717[i_2] < anInt2747) {
                    anInt2747 = anIntArray2717[i_2];
                } else if (anIntArray2717[i_2] > anInt2731) {
                    anInt2731 = anIntArray2717[i_2];
                }
                if (anIntArray2717[i_2 + 1] < anInt2744) {
                    anInt2744 = anIntArray2717[i_2 + 1];
                } else if (anIntArray2717[i_2 + 1] > anInt2746) {
                    anInt2746 = anIntArray2717[i_2 + 1];
                }
            }
        }
    }

    public boolean method3719(VarProvider interface42_1) {
        int i_3;
        if (anInt2745 != -1) {
            i_3 = interface42_1.getVar(anInt2745);
        } else {
            if (anInt2736 == -1) {
                return true;
            }
            i_3 = interface42_1.getVarBit(anInt2736);
        }
        if (i_3 >= anInt2734 && i_3 <= anInt2735) {
            boolean bool_4 = false;
            int i_5;
            if (anInt2741 != -1) {
                i_5 = interface42_1.getVar(anInt2741);
            } else {
                if (anInt2755 == -1) {
                    return true;
                }
                i_5 = interface42_1.getVarBit(anInt2755);
            }
            return i_5 >= anInt2743 && i_5 <= anInt2739;
        } else {
            return false;
        }
    }

    public String method3722(int i_1, String string_2) {
        if (aClass465_2737 == null) {
            return string_2;
        } else {
            ObjectNode class282_sub47_4 = (ObjectNode) aClass465_2737.get(i_1);
            return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
        }
    }

    public int method3723(int i_1, int i_2) {
        if (aClass465_2737 == null) {
            return i_2;
        } else {
            IntNode class282_sub38_4 = (IntNode) aClass465_2737.get(i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
        }
    }

    public NativeSprite method3729(AbstractRenderer graphicalrenderer_1) {
        NativeSprite nativesprite_3 = (NativeSprite) aClass218_2716.aClass229_2708.get(anInt2733 | 0x20000 | graphicalrenderer_1.rendererId << 29);
        if (nativesprite_3 == null) {
            aClass218_2716.aClass317_2703.loadFile(anInt2733);
            SpriteDefinitions class91_4 = SpriteDefinitions.getSprite(aClass218_2716.aClass317_2703, anInt2733, 0);
            if (class91_4 != null) {
                nativesprite_3 = graphicalrenderer_1.method8444(class91_4, true);
                aClass218_2716.aClass229_2708.put(nativesprite_3, anInt2733 | 0x20000 | graphicalrenderer_1.rendererId << 29);
            }
        }
        return nativesprite_3;
    }

    public NativeSprite renderIcons(AbstractRenderer graphicalrenderer_1, boolean bool_2) {
        int i_4 = bool_2 ? anInt2757 : anInt2719;
        int i_5 = i_4 | graphicalrenderer_1.rendererId << 29;
        NativeSprite nativesprite_6 = (NativeSprite) aClass218_2716.aClass229_2708.get(i_5);
        if (nativesprite_6 != null) {
            return nativesprite_6;
        } else if (!aClass218_2716.aClass317_2703.loadFile(i_4)) {
            return null;
        } else {
            SpriteDefinitions class91_7 = SpriteDefinitions.getSprite(aClass218_2716.aClass317_2703, i_4, 0);
            if (class91_7 != null) {
                nativesprite_6 = graphicalrenderer_1.method8444(class91_7, true);
                aClass218_2716.aClass229_2708.put(nativesprite_6, i_5);
            }
            return nativesprite_6;
        }
    }
}
