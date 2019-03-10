import java.awt.Color;

public class Class250 {

    static NativeSprite[] aClass160Array3092;

    IterableNodeMap aClass465_3087 = new IterableNodeMap(256);

    IterableNodeMap aClass465_3090 = new IterableNodeMap(256);

    IterableNodeMap aClass465_3089 = new IterableNodeMap(256);

    Index aClass317_3091;

    Index aClass317_3088;

    Class282_Sub26_Sub1_Sub2 method4285(int i_1, int i_2, int[] ints_3, int i_4) {
        int i_5 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
        i_5 |= i_1 << 16;
        long long_6 = (long) i_5;
        Class282_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2_8 = (Class282_Sub26_Sub1_Sub2) this.aClass465_3089.get(long_6);
        if (class282_sub26_sub1_sub2_8 != null) {
            return class282_sub26_sub1_sub2_8;
        } else if (ints_3 != null && ints_3[0] <= 0) {
            return null;
        } else {
            Class343 class343_9 = Class343.method6094(this.aClass317_3091, i_1, i_2);
            if (class343_9 == null) {
                return null;
            } else {
                class282_sub26_sub1_sub2_8 = class343_9.method6089();
                this.aClass465_3089.put(class282_sub26_sub1_sub2_8, long_6);
                if (ints_3 != null) {
                    ints_3[0] -= class282_sub26_sub1_sub2_8.aByteArray10470.length;
                }
                return class282_sub26_sub1_sub2_8;
            }
        }
    }

    Class282_Sub26_Sub1_Sub1 method4286(int i_1, int i_2, int[] ints_3, byte b_4) {
        int i_5 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
        i_5 |= i_1 << 16;
        long long_6 = (long) i_5 ^ 0x100000000L;
        Class282_Sub26_Sub1_Sub1 class282_sub26_sub1_sub1_8 = (Class282_Sub26_Sub1_Sub1) this.aClass465_3090.get(long_6);
        if (class282_sub26_sub1_sub1_8 != null) {
            return class282_sub26_sub1_sub1_8;
        } else if (ints_3 != null && ints_3[0] <= 0) {
            return null;
        } else {
            Class282_Sub18 class282_sub18_9 = (Class282_Sub18) this.aClass465_3087.get(long_6);
            if (class282_sub18_9 == null) {
                class282_sub18_9 = Class282_Sub18.method12271(this.aClass317_3088, i_1, i_2);
                if (class282_sub18_9 == null) {
                    return null;
                }
                this.aClass465_3087.put(class282_sub18_9, long_6);
            }
            class282_sub26_sub1_sub1_8 = class282_sub18_9.method12272();
            if (class282_sub26_sub1_sub1_8 == null) {
                return null;
            } else {
                class282_sub18_9.remove();
                this.aClass465_3090.put(class282_sub26_sub1_sub1_8, long_6);
                return class282_sub26_sub1_sub1_8;
            }
        }
    }

    public Class250(Index index_1, Index index_2) {
        this.aClass317_3091 = index_1;
        this.aClass317_3088 = index_2;
    }

    public Class282_Sub26_Sub1_Sub1 method4287(int i_1, int[] ints_2, int i_3) {
        if (this.aClass317_3088.containersCount() == 1) {
            return this.method4286(0, i_1, ints_2, (byte) 114);
        } else if (this.aClass317_3088.filesCount(i_1) == 1) {
            return this.method4286(i_1, 0, ints_2, (byte) 119);
        } else {
            throw new RuntimeException();
        }
    }

    public Class282_Sub26_Sub1_Sub2 method4290(int i_1, int[] ints_2, byte b_3) {
        if (this.aClass317_3091.containersCount() == 1) {
            return this.method4285(0, i_1, ints_2, 980716221);
        } else if (this.aClass317_3091.filesCount(i_1) == 1) {
            return this.method4285(i_1, 0, ints_2, -350826880);
        } else {
            throw new RuntimeException();
        }
    }

    public static void method4296(int i_0) {
        Class435.aClass482_5332 = new NodeCollection();
    }

    static void method4297(int i_0) {
        Class96_Sub21.keyRecorder.method3238(-1428980483);
        Class163.mouseRecorder.method3584(-2146990157);
        Class308.aclient3620.method4704(2044329067);
        Class351.gameCanvas.setBackground(Color.black);
        client.anInt7190 = -1;
        Class96_Sub21.keyRecorder = Class325.method5787(Class351.gameCanvas, 539499635);
        Class163.mouseRecorder = FontRenderer.method400(Class351.gameCanvas, true, (byte) -106);
    }

    static final void method4298(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, byte b_6) {
        int i_7 = Class197.NUM_PLAYER_INDICES;
        int[] ints_8 = Class197.PLAYER_INDICES;
        client.anInt7415 = 0;
        int i_9;
        if (client.anInt7341 == 4) {
            i_9 = Class82.aClass75Array804.length;
        } else {
            i_9 = i_7 + client.anInt7211;
        }
        int i_10;
        Object obj_12;
        int i_17;
        int i_19;
        int i_21;
        int i_23;
        int i_92;
        int i_100;
        int i_115;
        int i_116;
        for (i_10 = 0; i_10 < i_9; i_10++) {
            NPCDefinitions npcdefinitions_91 = null;
            if (client.anInt7341 == 4) {
                Class75 class75_13 = Class82.aClass75Array804[i_10];
                if (!class75_13.aBool742) {
                    continue;
                }
                obj_12 = class75_13.method1342((byte) 112);
                if (((Animable) obj_12).anInt10349 != client.anInt7286) {
                    continue;
                }
                if (class75_13.anInt739 >= 0) {
                    npcdefinitions_91 = ((NPC) obj_12).definitions;
                    if (npcdefinitions_91.anIntArray4886 != null) {
                        npcdefinitions_91 = npcdefinitions_91.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER, 265881693);
                        if (npcdefinitions_91 == null) {
                            continue;
                        }
                    }
                }
            } else {
                if (i_10 < i_7) {
                    obj_12 = client.players[ints_8[i_10]];
                } else {
                    obj_12 = (Animable) ((Class282_Sub47) client.NPCS.get((long) client.anIntArray7212[i_10 - i_7])).anObject8068;
                    npcdefinitions_91 = ((NPC) obj_12).definitions;
                    if (npcdefinitions_91.anIntArray4886 != null) {
                        npcdefinitions_91 = npcdefinitions_91.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER, 265881693);
                        if (npcdefinitions_91 == null) {
                            continue;
                        }
                    }
                }
                if (((Animable) obj_12).drawPriority < 0 || ((Animable) obj_12).anInt10349 != client.anInt7286 && ((Animable) obj_12).plane != Class84.myPlayer.plane) {
                    continue;
                }
            }
            Class361.method6274((Class521_Sub1) obj_12, ((Animable) obj_12).method12997(-218366287), -1607053853);
            if (client.aFloatArray7292[0] >= 0.0F) {
                if (((Animable) obj_12).method15887(141891001)) {
                    Class163 class163_110 = ((Animable) obj_12).method15811(-709125350);
                    if (class163_110 != null && client.anInt7415 < client.anInt7366) {
                        client.anIntArray7263[client.anInt7415] = Class288.aClass414_3438.getWidthNoSprites(class163_110.method2829(-766550436), -1967833701) / 2;
                        client.anIntArray7420[client.anInt7415] = (int) client.aFloatArray7292[0];
                        client.anIntArray7417[client.anInt7415] = (int) client.aFloatArray7292[1];
                        client.aClass163Array7419[client.anInt7415] = class163_110;
                        ++client.anInt7415;
                    }
                }
                i_92 = (int) ((float) i_1 + client.aFloatArray7292[1]);
                i_92 -= Class288.aClass414_3438.anInt4978;
                boolean bool_94 = false;
                int i_27;
                int i_28;
                NativeSprite nativesprite_98;
                if (!((Animable) obj_12).aBool10318 && !((Animable) obj_12).aClass457_10333.method7666(833555541)) {
                    for (Class275_Sub7 class275_sub7_95 = (Class275_Sub7) ((Animable) obj_12).aClass457_10333.method7659(301908602); class275_sub7_95 != null; class275_sub7_95 = (Class275_Sub7) ((Animable) obj_12).aClass457_10333.method7650((byte) 17)) {
                        Class275_Sub3 class275_sub3_16 = class275_sub7_95.method12600(client.cycles, (short) 12514);
                        if (class275_sub3_16 == null) {
                            if (class275_sub7_95.method12602(1668926296)) {
                                class275_sub7_95.method4887((byte) -66);
                            }
                        } else {
                            HitbarDefinitions hitbardefinitions_96 = class275_sub7_95.aClass198_7863;
                            Player player_97 = client.players[ints_8[i_10]];
                            NativeSprite nativesprite_99;
                            if (player_97 != null && player_97.aBool10571) {
                                nativesprite_98 = hitbardefinitions_96.method3224(Renderers.SOFTWARE_RENDERER, 1826512281);
                                nativesprite_99 = hitbardefinitions_96.method3222(Renderers.SOFTWARE_RENDERER, -1448626109);
                            } else {
                                nativesprite_98 = hitbardefinitions_96.method3208(Renderers.SOFTWARE_RENDERER, 549654584);
                                nativesprite_99 = hitbardefinitions_96.method3207(Renderers.SOFTWARE_RENDERER, -2032776037);
                            }
                            if (nativesprite_98 != null && nativesprite_99 != null) {
                                i_21 = 255;
                                boolean bool_22 = true;
                                i_23 = client.cycles - class275_sub3_16.anInt7811;
                                int i_24 = nativesprite_99.method2747() * class275_sub3_16.anInt7809 / 255;
                                int i_25;
                                int i_26;
                                if (class275_sub3_16.anInt7812 > i_23) {
                                    i_25 = hitbardefinitions_96.anInt2442 == 0 ? 0 : hitbardefinitions_96.anInt2442 * (i_23 / hitbardefinitions_96.anInt2442);
                                    i_26 = nativesprite_99.method2747() * class275_sub3_16.anInt7810 / 255;
                                    i_116 = i_25 * (i_24 - i_26) / class275_sub3_16.anInt7812 + i_26;
                                } else {
                                    i_116 = i_24;
                                    i_25 = class275_sub3_16.anInt7812 + hitbardefinitions_96.anInt2443 - i_23;
                                    if (hitbardefinitions_96.anInt2439 >= 0) {
                                        i_21 = (i_25 << 8) / (hitbardefinitions_96.anInt2443 - hitbardefinitions_96.anInt2439);
                                    }
                                }
                                if (class275_sub3_16.anInt7809 > 0 && i_116 < 2) {
                                    i_116 = 2;
                                }
                                i_25 = nativesprite_98.method2793();
                                i_26 = (int) (client.aFloatArray7292[0] + (float) i_0 - (float) (nativesprite_98.method2747() >> 1));
                                i_92 -= i_25;
                                if (i_21 >= 0 && i_21 < 255) {
                                    i_27 = i_21 << 24;
                                    i_28 = i_27 | 0xffffff;
                                    nativesprite_98.method2742(i_26, i_92, 0, i_28, 1);
                                    Renderers.SOFTWARE_RENDERER.o(i_26, i_92, i_26 + i_116, i_92 + i_25);
                                    nativesprite_99.method2742(i_26, i_92, 0, i_28, 1);
                                } else {
                                    nativesprite_98.method2752(i_26, i_92);
                                    Renderers.SOFTWARE_RENDERER.o(i_26, i_92, i_116 + i_26, i_92 + i_25);
                                    nativesprite_99.method2752(i_26, i_92);
                                }
                                Renderers.SOFTWARE_RENDERER.r(i_0, i_1, i_0 + i_2, i_3 + i_1);
                                i_92 -= 2;
                                bool_94 = true;
                            }
                        }
                    }
                }
                if (!bool_94) {
                    i_92 -= Class58.aClass529_527.anInt7028 + 2;
                }
                if (!((Animable) obj_12).aBool10318) {
                    if (npcdefinitions_91 == null) {
                        Player player_119 = (Player) obj_12;
                        NativeSprite nativesprite_111;
                        if (player_119.skullId != -1) {
                            nativesprite_111 = Class282_Sub21.aClass160Array7673[player_119.skullId];
                            i_92 -= nativesprite_111.method2793();
                            nativesprite_111.method2752((int) (client.aFloatArray7292[0] + (float) i_0 - 12.0F), i_92);
                            i_92 -= 2;
                        }
                        if (player_119.headIconId != -1) {
                            nativesprite_111 = Class16.aClass160Array138[player_119.headIconId];
                            i_92 -= nativesprite_111.method2793();
                            nativesprite_111.method2752((int) (client.aFloatArray7292[0] + (float) i_0 - 12.0F), i_92);
                            i_92 -= 2;
                        }
                    } else if (npcdefinitions_91.anInt4887 >= 0 && npcdefinitions_91.anInt4887 < Class16.aClass160Array138.length) {
                        NativeSprite nativesprite_120 = Class16.aClass160Array138[npcdefinitions_91.anInt4887];
                        i_92 -= nativesprite_120.method2793();
                        nativesprite_120.method2752((int) ((float) i_0 + client.aFloatArray7292[0] - (float) (nativesprite_120.method2747() >> 1)), i_92);
                        i_92 -= 2;
                    }
                }
                int i_15;
                int i_10000;
                Class180[] arr_113;
                Class180 class180_121;
                if (obj_12 instanceof Player) {
                    if (i_10 >= 0) {
                        i_15 = 0;
                        arr_113 = client.aClass180Array7348;
                        for (i_17 = 0; i_17 < arr_113.length; i_17++) {
                            class180_121 = arr_113[i_17];
                            if (class180_121 != null && class180_121.anInt2236 == 10 && class180_121.anInt2238 == ints_8[i_10]) {
                                nativesprite_98 = Class391.aClass160Array4778[class180_121.anInt2240];
                                if (nativesprite_98.method2793() > i_15) {
                                    i_15 = nativesprite_98.method2793();
                                }
                                nativesprite_98.method2752((int) ((float) i_0 + client.aFloatArray7292[0] - 12.0F), i_92 - nativesprite_98.method2793());
                            }
                        }
                        if (i_15 > 0) {
                            i_10000 = i_92 - (i_15 + 2);
                        }
                    }
                } else {
                    i_15 = 0;
                    arr_113 = client.aClass180Array7348;
                    for (i_17 = 0; i_17 < arr_113.length; i_17++) {
                        class180_121 = arr_113[i_17];
                        if (class180_121 != null && class180_121.anInt2236 == 1 && client.anIntArray7212[i_10 - i_7] == class180_121.anInt2238) {
                            nativesprite_98 = Class391.aClass160Array4778[class180_121.anInt2240];
                            if (nativesprite_98.method2793() > i_15) {
                                i_15 = nativesprite_98.method2793();
                            }
                            boolean bool_20;
                            if (class180_121.anInt2244 == 0) {
                                bool_20 = true;
                            } else {
                                i_21 = Class204.method3363(1264825249) * 1000 / class180_121.anInt2244 / 2;
                                bool_20 = client.cycles % (i_21 * 2) < i_21;
                            }
                            if (bool_20) {
                                nativesprite_98.method2752((int) ((float) i_0 + client.aFloatArray7292[0] - 12.0F), i_92 - nativesprite_98.method2793());
                            }
                        }
                    }
                    if (i_15 > 0) {
                        i_10000 = i_92 - (i_15 + 2);
                    }
                }
                for (i_15 = 0; i_15 < Class58.aClass529_527.anInt7026; i_15++) {
                    i_100 = ((Animable) obj_12).anIntArray10351[i_15];
                    i_17 = ((Animable) obj_12).anIntArray10316[i_15];
                    HitsplatDefinitions hitsplatdefinitions_122 = null;
                    i_19 = 0;
                    if (i_17 >= 0) {
                        if (i_100 <= client.cycles) {
                            continue;
                        }
                        hitsplatdefinitions_122 = IndexLoaders.HITSPLAT_INDEX_LOADER.getDefinitions(((Animable) obj_12).anIntArray10316[i_15], 1856651955);
                        i_19 = hitsplatdefinitions_122.anInt2841;
                    } else if (i_100 < 0) {
                        continue;
                    }
                    i_115 = ((Animable) obj_12).anIntArray10331[i_15];
                    HitsplatDefinitions hitsplatdefinitions_101 = null;
                    if (i_115 >= 0) {
                        hitsplatdefinitions_101 = IndexLoaders.HITSPLAT_INDEX_LOADER.getDefinitions(i_115, 1856651955);
                    }
                    if (i_100 - i_19 <= client.cycles) {
                        if (hitsplatdefinitions_122 == null) {
                            ((Animable) obj_12).anIntArray10351[i_15] = -1;
                        } else {
                            i_116 = ((Animable) obj_12).method12997(-218366287) / 2;
                            Class361.method6274((Class521_Sub1) obj_12, i_116, -1352747334);
                            if (client.aFloatArray7292[0] > -1.0F) {
                                client.aFloatArray7292[0] += (float) Class58.aClass529_527.anIntArray7042[i_15];
                                client.aFloatArray7292[1] += (float) Class58.aClass529_527.anIntArray7029[i_15];
                                Object obj_102 = null;
                                Object obj_103 = null;
                                Object obj_104 = null;
                                Object obj_105 = null;
                                i_27 = 0;
                                i_28 = 0;
                                int i_29 = 0;
                                int i_30 = 0;
                                int i_31 = 0;
                                int i_32 = 0;
                                int i_33 = 0;
                                int i_34 = 0;
                                NativeSprite nativesprite_35 = null;
                                NativeSprite nativesprite_36 = null;
                                NativeSprite nativesprite_37 = null;
                                NativeSprite nativesprite_38 = null;
                                int i_39 = 0;
                                int i_40 = 0;
                                int i_41 = 0;
                                int i_42 = 0;
                                int i_43 = 0;
                                int i_44 = 0;
                                int i_45 = 0;
                                int i_46 = 0;
                                int i_47 = 0;
                                NativeSprite nativesprite_48 = hitsplatdefinitions_122.method3835(Renderers.SOFTWARE_RENDERER, 1623036719);
                                if (nativesprite_48 != null) {
                                    i_27 = nativesprite_48.method2747();
                                    int i_49 = nativesprite_48.method2793();
                                    if (i_49 > i_47) {
                                        i_47 = i_49;
                                    }
                                    nativesprite_48.method2744(client.anIntArray7461);
                                    i_31 = client.anIntArray7461[0];
                                }
                                NativeSprite nativesprite_106 = hitsplatdefinitions_122.method3836(Renderers.SOFTWARE_RENDERER, -47251071);
                                if (nativesprite_106 != null) {
                                    i_28 = nativesprite_106.method2747();
                                    int i_50 = nativesprite_106.method2793();
                                    if (i_50 > i_47) {
                                        i_47 = i_50;
                                    }
                                    nativesprite_106.method2744(client.anIntArray7461);
                                    i_32 = client.anIntArray7461[0];
                                }
                                NativeSprite nativesprite_107 = hitsplatdefinitions_122.method3832(Renderers.SOFTWARE_RENDERER, 1942118537);
                                if (nativesprite_107 != null) {
                                    i_29 = nativesprite_107.method2747();
                                    int i_51 = nativesprite_107.method2793();
                                    if (i_51 > i_47) {
                                        i_47 = i_51;
                                    }
                                    nativesprite_107.method2744(client.anIntArray7461);
                                    i_33 = client.anIntArray7461[0];
                                }
                                NativeSprite nativesprite_108 = hitsplatdefinitions_122.method3838(Renderers.SOFTWARE_RENDERER, (byte) 13);
                                int i_52;
                                if (nativesprite_108 != null) {
                                    i_30 = nativesprite_108.method2747();
                                    i_52 = nativesprite_108.method2793();
                                    if (i_52 > i_47) {
                                        i_47 = i_52;
                                    }
                                    nativesprite_108.method2744(client.anIntArray7461);
                                    i_34 = client.anIntArray7461[0];
                                }
                                if (hitsplatdefinitions_101 != null) {
                                    nativesprite_35 = hitsplatdefinitions_101.method3835(Renderers.SOFTWARE_RENDERER, 1623036719);
                                    if (nativesprite_35 != null) {
                                        i_39 = nativesprite_35.method2747();
                                        i_52 = nativesprite_35.method2793();
                                        if (i_52 > i_47) {
                                            i_47 = i_52;
                                        }
                                        nativesprite_35.method2744(client.anIntArray7461);
                                        i_43 = client.anIntArray7461[0];
                                    }
                                    nativesprite_36 = hitsplatdefinitions_101.method3836(Renderers.SOFTWARE_RENDERER, -47251071);
                                    if (nativesprite_36 != null) {
                                        i_40 = nativesprite_36.method2747();
                                        i_52 = nativesprite_36.method2793();
                                        if (i_52 > i_47) {
                                            i_47 = i_52;
                                        }
                                        nativesprite_36.method2744(client.anIntArray7461);
                                        i_44 = client.anIntArray7461[0];
                                    }
                                    nativesprite_37 = hitsplatdefinitions_101.method3832(Renderers.SOFTWARE_RENDERER, 1942118537);
                                    if (nativesprite_37 != null) {
                                        i_41 = nativesprite_37.method2747();
                                        i_52 = nativesprite_37.method2793();
                                        if (i_52 > i_47) {
                                            i_47 = i_52;
                                        }
                                        nativesprite_37.method2744(client.anIntArray7461);
                                        i_45 = client.anIntArray7461[0];
                                    }
                                    nativesprite_38 = hitsplatdefinitions_101.method3838(Renderers.SOFTWARE_RENDERER, (byte) -1);
                                    if (nativesprite_38 != null) {
                                        i_42 = nativesprite_38.method2747();
                                        i_52 = nativesprite_38.method2793();
                                        if (i_52 > i_47) {
                                            i_47 = i_52;
                                        }
                                        nativesprite_38.method2744(client.anIntArray7461);
                                        i_46 = client.anIntArray7461[0];
                                    }
                                }
                                FontRenderer fontrenderer_109 = Renderers.FONT_RENDERER;
                                FontRenderer fontrenderer_53 = Renderers.FONT_RENDERER;
                                FontMetrics fontmetrics_54 = Class282_Sub17_Sub2.aClass414_9933;
                                FontMetrics fontmetrics_55 = Class282_Sub17_Sub2.aClass414_9933;
                                int i_56 = hitsplatdefinitions_122.anInt2849;
                                FontRenderer fontrenderer_57;
                                FontMetrics fontmetrics_58;
                                if (i_56 >= 0) {
                                    fontrenderer_57 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, i_56, true, hitsplatdefinitions_122.aBool2838, -2104806064);
                                    fontmetrics_58 = Class487.aClass378_5752.method6415(client.anInterface35_7206, i_56, 849439454);
                                    if (fontrenderer_57 != null && fontmetrics_58 != null) {
                                        fontrenderer_109 = fontrenderer_57;
                                        fontmetrics_54 = fontmetrics_58;
                                    }
                                }
                                if (hitsplatdefinitions_101 != null) {
                                    i_56 = hitsplatdefinitions_101.anInt2849;
                                    if (i_56 >= 0) {
                                        fontrenderer_57 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, i_56, true, hitsplatdefinitions_101.aBool2838, -2122773037);
                                        fontmetrics_58 = Class487.aClass378_5752.method6415(client.anInterface35_7206, i_56, -1865476378);
                                        if (fontrenderer_57 != null && fontmetrics_58 != null) {
                                            fontrenderer_53 = fontrenderer_57;
                                            fontmetrics_55 = fontmetrics_58;
                                        }
                                    }
                                }
                                fontrenderer_57 = null;
                                String string_117 = null;
                                boolean bool_59 = false;
                                int i_60 = 0;
                                String string_61 = hitsplatdefinitions_122.method3844(((Animable) obj_12).anIntArray10329[i_15], (byte) -109);
                                int i_62 = fontmetrics_54.getWidthNoSprites(string_61, -1967833701);
                                if (hitsplatdefinitions_101 != null) {
                                    string_117 = hitsplatdefinitions_101.method3844(((Animable) obj_12).anIntArray10332[i_15], (byte) -122);
                                    i_60 = fontmetrics_55.getWidthNoSprites(string_117, -1967833701);
                                }
                                int i_63 = 0;
                                int i_64 = 0;
                                if (i_28 > 0) {
                                    i_63 = i_62 / i_28 + 1;
                                }
                                if (hitsplatdefinitions_101 != null && i_40 > 0) {
                                    i_64 = i_60 / i_40 + 1;
                                }
                                int i_65 = 0;
                                int i_66 = i_65;
                                if (i_27 > 0) {
                                    i_65 += i_27;
                                }
                                i_65 += 2;
                                int i_67 = i_65;
                                if (i_29 > 0) {
                                    i_65 += i_29;
                                }
                                int i_68 = i_65;
                                int i_69 = i_65;
                                int i_70;
                                if (i_28 > 0) {
                                    i_70 = i_28 * i_63;
                                    i_65 += i_70;
                                    i_69 += (i_70 - i_62) / 2;
                                } else {
                                    i_65 += i_62;
                                }
                                i_70 = i_65;
                                if (i_30 > 0) {
                                    i_65 += i_30;
                                }
                                int i_71 = 0;
                                int i_72 = 0;
                                int i_73 = 0;
                                int i_74 = 0;
                                int i_75 = 0;
                                int i_76;
                                if (hitsplatdefinitions_101 != null) {
                                    i_65 += 2;
                                    i_71 = i_65;
                                    if (i_39 > 0) {
                                        i_65 += i_39;
                                    }
                                    i_65 += 2;
                                    i_72 = i_65;
                                    if (i_41 > 0) {
                                        i_65 += i_41;
                                    }
                                    i_73 = i_65;
                                    i_75 = i_65;
                                    if (i_40 > 0) {
                                        i_76 = i_64 * i_40;
                                        i_65 += i_76;
                                        i_75 += (i_76 - i_60) / 2;
                                    } else {
                                        i_65 += i_60;
                                    }
                                    i_74 = i_65;
                                    if (i_42 > 0) {
                                        i_65 += i_42;
                                    }
                                }
                                i_76 = ((Animable) obj_12).anIntArray10351[i_15] - client.cycles;
                                int i_77 = hitsplatdefinitions_122.anInt2846 - i_76 * hitsplatdefinitions_122.anInt2846 / hitsplatdefinitions_122.anInt2841;
                                int i_78 = i_76 * hitsplatdefinitions_122.anInt2833 / hitsplatdefinitions_122.anInt2841 + -hitsplatdefinitions_122.anInt2833;
                                int i_79 = (int) ((float) i_0 + client.aFloatArray7292[0] - (float) (i_65 >> 1) + (float) i_77);
                                int i_80 = (int) ((float) i_78 + (client.aFloatArray7292[1] + (float) i_1 - 12.0F));
                                int i_81 = i_80;
                                int i_82 = i_80 + i_47;
                                int i_83 = i_80 + hitsplatdefinitions_122.anInt2832 + 15;
                                int i_84 = i_83 - fontmetrics_54.anInt4978;
                                int i_85 = i_83 + fontmetrics_54.anInt4979;
                                if (i_84 < i_80) {
                                    i_81 = i_84;
                                }
                                if (i_85 > i_82) {
                                    i_82 = i_85;
                                }
                                int i_86 = 0;
                                int i_87;
                                int i_88;
                                if (hitsplatdefinitions_101 != null) {
                                    i_86 = i_80 + hitsplatdefinitions_101.anInt2832 + 15;
                                    i_87 = i_86 - fontmetrics_55.anInt4978;
                                    i_88 = i_86 + fontmetrics_55.anInt4979;
                                    if (i_87 < i_81) {
                                        ;
                                    }
                                    if (i_88 > i_82) {
                                        ;
                                    }
                                }
                                i_87 = 255;
                                if (hitsplatdefinitions_122.anInt2847 >= 0) {
                                    i_87 = (i_76 << 8) / (hitsplatdefinitions_122.anInt2841 - hitsplatdefinitions_122.anInt2847);
                                }
                                if (i_87 >= 0 && i_87 < 255) {
                                    i_88 = i_87 << 24;
                                    int i_89 = i_88 | 0xffffff;
                                    if (nativesprite_48 != null) {
                                        nativesprite_48.method2742(i_66 + i_79 - i_31, i_80, 0, i_89, 1);
                                    }
                                    if (nativesprite_107 != null) {
                                        nativesprite_107.method2742(i_67 + i_79 - i_33, i_80, 0, i_89, 1);
                                    }
                                    int i_90;
                                    if (nativesprite_106 != null) {
                                        for (i_90 = 0; i_90 < i_63; i_90++) {
                                            nativesprite_106.method2742(i_90 * i_28 + (i_68 + i_79 - i_32), i_80, 0, i_89, 1);
                                        }
                                    }
                                    if (nativesprite_108 != null) {
                                        nativesprite_108.method2742(i_70 + i_79 - i_34, i_80, 0, i_89, 1);
                                    }
                                    fontrenderer_109.renderText(string_61, i_79 + i_69, i_83, hitsplatdefinitions_122.anInt2844 | i_88, 0, -418109423);
                                    if (hitsplatdefinitions_101 != null) {
                                        if (nativesprite_35 != null) {
                                            nativesprite_35.method2742(i_79 + i_71 - i_43, i_80, 0, i_89, 1);
                                        }
                                        if (nativesprite_37 != null) {
                                            nativesprite_37.method2742(i_79 + i_72 - i_45, i_80, 0, i_89, 1);
                                        }
                                        if (nativesprite_36 != null) {
                                            for (i_90 = 0; i_90 < i_64; i_90++) {
                                                nativesprite_36.method2742(i_90 * i_40 + (i_73 + i_79 - i_44), i_80, 0, i_89, 1);
                                            }
                                        }
                                        if (nativesprite_38 != null) {
                                            nativesprite_38.method2742(i_79 + i_74 - i_46, i_80, 0, i_89, 1);
                                        }
                                        fontrenderer_53.renderText(string_117, i_75 + i_79, i_86, hitsplatdefinitions_101.anInt2844 | i_88, 0, -418109423);
                                    }
                                } else {
                                    if (nativesprite_48 != null) {
                                        nativesprite_48.method2752(i_79 + i_66 - i_31, i_80);
                                    }
                                    if (nativesprite_107 != null) {
                                        nativesprite_107.method2752(i_67 + i_79 - i_33, i_80);
                                    }
                                    if (nativesprite_106 != null) {
                                        for (i_88 = 0; i_88 < i_63; i_88++) {
                                            nativesprite_106.method2752(i_88 * i_28 + (i_68 + i_79 - i_32), i_80);
                                        }
                                    }
                                    if (nativesprite_108 != null) {
                                        nativesprite_108.method2752(i_70 + i_79 - i_34, i_80);
                                    }
                                    fontrenderer_109.renderText(string_61, i_79 + i_69, i_83, hitsplatdefinitions_122.anInt2844 | ~0xffffff, 0, -418109423);
                                    if (hitsplatdefinitions_101 != null) {
                                        if (nativesprite_35 != null) {
                                            nativesprite_35.method2752(i_79 + i_71 - i_43, i_80);
                                        }
                                        if (nativesprite_37 != null) {
                                            nativesprite_37.method2752(i_79 + i_72 - i_45, i_80);
                                        }
                                        if (nativesprite_36 != null) {
                                            for (i_88 = 0; i_88 < i_64; i_88++) {
                                                nativesprite_36.method2752(i_40 * i_88 + (i_79 + i_73 - i_44), i_80);
                                            }
                                        }
                                        if (nativesprite_38 != null) {
                                            nativesprite_38.method2752(i_74 + i_79 - i_46, i_80);
                                        }
                                        fontrenderer_53.renderText(string_117, i_79 + i_75, i_86, hitsplatdefinitions_101.anInt2844 | ~0xffffff, 0, -418109423);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i_11;
        for (i_10 = 0; i_10 < client.anInt7304; i_10++) {
            i_11 = client.anIntArray7287[i_10];
            if (i_11 < 2048) {
                obj_12 = client.players[i_11];
            } else {
                obj_12 = (Animable) ((Class282_Sub47) client.NPCS.get((long) (i_11 - 2048))).anObject8068;
            }
            i_92 = client.anIntArray7288[i_10];
            Object obj_14;
            if (i_92 < 2048) {
                obj_14 = client.players[i_92];
            } else {
                obj_14 = (Animable) ((Class282_Sub47) client.NPCS.get((long) (i_92 - 2048))).anObject8068;
            }
            ItemDefinitions.method7140((Animable) obj_12, (Animable) obj_14, --((Animable) obj_12).anInt10319, i_0, i_1, i_2, i_3, i_4, i_5, (byte) 41);
        }
        i_10 = Class288.aClass414_3438.anInt4979 + Class288.aClass414_3438.anInt4978 + 2;
        for (i_11 = 0; i_11 < client.anInt7415; i_11++) {
            int i_93 = client.anIntArray7420[i_11];
            i_92 = client.anIntArray7417[i_11];
            int i_118 = client.anIntArray7263[i_11];
            boolean bool_112 = true;
            while (bool_112) {
                bool_112 = false;
                for (i_100 = 0; i_100 < i_11; i_100++) {
                    if (i_92 + 2 > client.anIntArray7417[i_100] - i_10 && i_92 - i_10 < client.anIntArray7417[i_100] + 2 && i_93 - i_118 < client.anIntArray7263[i_100] + client.anIntArray7420[i_100] && i_93 + i_118 > client.anIntArray7420[i_100] - client.anIntArray7263[i_100] && client.anIntArray7417[i_100] - i_10 < i_92) {
                        i_92 = client.anIntArray7417[i_100] - i_10;
                        bool_112 = true;
                    }
                }
            }
            client.anIntArray7417[i_11] = i_92;
            String string_114 = client.aClass163Array7419[i_11].method2829(-766550436);
            if (client.anInt7351 == 0) {
                i_17 = 16776960;
                int i_18 = client.aClass163Array7419[i_11].method2830((short) 2671);
                if (i_18 < 6) {
                    i_17 = client.anIntArray7148[i_18];
                }
                if (i_18 == 6) {
                    i_17 = client.anInt7286 % 20 < 10 ? 16711680 : 16776960;
                }
                if (i_18 == 7) {
                    i_17 = client.anInt7286 % 20 < 10 ? 255 : 65535;
                }
                if (i_18 == 8) {
                    i_17 = client.anInt7286 % 20 < 10 ? 45056 : 8454016;
                }
                if (i_18 == 9) {
                    i_19 = 150 - client.aClass163Array7419[i_11].method2833(-315932327) * 150 / client.aClass163Array7419[i_11].method2832(2065771528);
                    if (i_19 < 50) {
                        i_17 = i_19 * 1280 + 16711680;
                    } else if (i_19 < 100) {
                        i_17 = 16776960 - (i_19 - 50) * 327680;
                    } else if (i_19 < 150) {
                        i_17 = (i_19 - 100) * 5 + 65280;
                    }
                }
                if (i_18 == 10) {
                    i_19 = 150 - client.aClass163Array7419[i_11].method2833(-315932327) * 150 / client.aClass163Array7419[i_11].method2832(-1271614996);
                    if (i_19 < 50) {
                        i_17 = i_19 * 5 + 16711680;
                    } else if (i_19 < 100) {
                        i_17 = 16711935 - (i_19 - 50) * 327680;
                    } else if (i_19 < 150) {
                        i_17 = (i_19 - 100) * 327680 + 255 - (i_19 - 100) * 5;
                    }
                }
                if (i_18 == 11) {
                    i_19 = 150 - client.aClass163Array7419[i_11].method2833(-315932327) * 150 / client.aClass163Array7419[i_11].method2832(-1800362752);
                    if (i_19 < 50) {
                        i_17 = 16777215 - i_19 * 327685;
                    } else if (i_19 < 100) {
                        i_17 = (i_19 - 50) * 327685 + 65280;
                    } else if (i_19 < 150) {
                        i_17 = 16777215 - (i_19 - 100) * 327680;
                    }
                }
                i_19 = i_17 | ~0xffffff;
                i_115 = client.aClass163Array7419[i_11].method2831((short) -9164);
                if (i_115 == 0) {
                    Class285.aClass8_3394.method360(string_114, i_0 + i_93, i_92 + i_1, i_19, -16777216, 768492991);
                }
                if (i_115 == 1) {
                    Class285.aClass8_3394.method387(string_114, i_0 + i_93, i_92 + i_1, i_19, -16777216, client.anInt7286, -1574262773);
                }
                if (i_115 == 2) {
                    Class285.aClass8_3394.method368(string_114, i_0 + i_93, i_92 + i_1, i_19, -16777216, client.anInt7286, (byte) -65);
                }
                if (i_115 == 3) {
                    i_21 = 150 - client.aClass163Array7419[i_11].method2833(-315932327) * 150 / client.aClass163Array7419[i_11].method2832(71923775);
                    Class285.aClass8_3394.method381(string_114, i_0 + i_93, i_92 + i_1, i_19, -16777216, client.anInt7286, i_21, -142309733);
                }
                if (i_115 == 4) {
                    i_21 = 150 - client.aClass163Array7419[i_11].method2833(-315932327) * 150 / client.aClass163Array7419[i_11].method2832(744941042);
                    i_116 = i_21 * (Class288.aClass414_3438.getWidthNoSprites(string_114, -1967833701) + 100) / 150;
                    Renderers.SOFTWARE_RENDERER.o(i_0 + i_93 - 50, i_1, i_0 + i_93 + 50, i_3 + i_1);
                    Class285.aClass8_3394.renderText(string_114, i_0 + i_93 + 50 - i_116, i_92 + i_1, i_19, -16777216, -418109423);
                    Renderers.SOFTWARE_RENDERER.r(i_0, i_1, i_0 + i_2, i_3 + i_1);
                }
                if (i_115 == 5) {
                    i_21 = 150 - client.aClass163Array7419[i_11].method2833(-315932327) * 150 / client.aClass163Array7419[i_11].method2832(1124068407);
                    i_116 = 0;
                    if (i_21 < 25) {
                        i_116 = i_21 - 25;
                    } else if (i_21 > 125) {
                        i_116 = i_21 - 125;
                    }
                    i_23 = Class288.aClass414_3438.anInt4978 + Class288.aClass414_3438.anInt4979;
                    Renderers.SOFTWARE_RENDERER.o(i_0, i_92 + i_1 - i_23 - 1, i_0 + i_2, i_92 + i_1 + 5);
                    Class285.aClass8_3394.method360(string_114, i_0 + i_93, i_116 + i_92 + i_1, i_19, -16777216, 768492991);
                    Renderers.SOFTWARE_RENDERER.r(i_0, i_1, i_0 + i_2, i_3 + i_1);
                }
            } else {
                Class285.aClass8_3394.method360(string_114, i_0 + i_93, i_92 + i_1, -256, -16777216, 768492991);
            }
        }
    }
}
