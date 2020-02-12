package com.jagex;

import jaclib.ping.Ping;

public class FriendStatus {

    public static FriendStatus ONLINE = new FriendStatus(0);
    public static FriendStatus FRIENDS_ONLY = new FriendStatus(1);
    public static FriendStatus OFFLINE = new FriendStatus(2);

    public int id;

    FriendStatus(int i_1) {
        this.id = i_1;
    }

    public static int method7702() {
        if (Class296.anInt3532 == 0) {
            Class446.aClass446_5412.initializeIndexLoader(new Class301("jaclib"), (byte) -15);
            if (Class446.aClass446_5412.method7443(1803519499).getCompletion() != 100) {
                return 1;
            }
            if (!((Class301) Class446.aClass446_5412.method7443(954726291)).method5328((byte) -93)) {
                Class308.aclient3620.method4681();
                Class223.method3770();
                try {
                    Ping.init();
                } catch (Throwable throwable_12) {
                }
            }
            Class296.anInt3532 = 1;
        }
        int i_5;
        int i_9;
        if (Class296.anInt3532 == 1) {
            Class296.aClass446Array3531 = Class446.method7436();
            Class446.aClass446_5386.initializeIndexLoader(new Class298(IndexLoaders.DEFAULTS_INDEX), (byte) -56);
            Class446.aClass446_5387.initializeIndexLoader(new Class301("jaggl"), (byte) 11);
            Class446.aClass446_5388.initializeIndexLoader(new Class301("jagdx"), (byte) -60);
            Class446.aClass446_5389.initializeIndexLoader(new Class301("sw3d"), (byte) 6);
            Class446.aClass446_5415.initializeIndexLoader(new Class301("hw3d"), (byte) 11);
            Class446.aClass446_5385.initializeIndexLoader(new Class301("jagtheora"), (byte) -30);
            Class446.aClass446_5392.initializeIndexLoader(new Class298(IndexLoaders.SHADER_INDEX), (byte) 101);
            Class446.aClass446_5390.initializeIndexLoader(new Class298(IndexLoaders.TEXTURE_DEFINITION_INDEX), (byte) 65);
            Class446.aClass446_5394.initializeIndexLoader(new Class298(IndexLoaders.CONFIG_INDEX), (byte) -20);
            Class446.aClass446_5395.initializeIndexLoader(new Class298(IndexLoaders.OBJECT_INDEX), (byte) 17);
            Class446.aClass446_5397.initializeIndexLoader(new Class298(IndexLoaders.ENUM_INDEX), (byte) -64);
            Class446.aClass446_5393.initializeIndexLoader(new Class298(IndexLoaders.NPC_INDEX), (byte) 7);
            Class446.aClass446_5413.initializeIndexLoader(new Class298(IndexLoaders.ITEM_INDEX), (byte) 16);
            Class446.aClass446_5399.initializeIndexLoader(new Class298(IndexLoaders.ANIMATION_INDEX), (byte) 16);
            Class446.aClass446_5400.initializeIndexLoader(new Class298(IndexLoaders.SPOTANIM_INDEX), (byte) 4);
            Class446.aClass446_5401.initializeIndexLoader(new Class298(IndexLoaders.VARBIT_INDEX), (byte) -28);
            Class446.aClass446_5402.initializeIndexLoader(new Class298(IndexLoaders.QC_MESSAGES_INDEX), (byte) 9);
            Class446.aClass446_5403.initializeIndexLoader(new Class298(IndexLoaders.QC_MENU_INDEX), (byte) -25);
            Class446.TEXTURE_INDEX_LOADER.initializeIndexLoader(new Class298(IndexLoaders.TEXTURE_INDEX), (byte) 75);
            Class446.aClass446_5405.initializeIndexLoader(new Class298(IndexLoaders.PARTICLE_INDEX), (byte) 60);
            Class446.aClass446_5410.initializeIndexLoader(new Class298(IndexLoaders.BILLBOARD_INDEX), (byte) -44);
            Class446.aClass446_5407.initializeIndexLoader(new Class383(IndexLoaders.HUFFMAN_INDEX), (byte) -27);
            Class446.aClass446_5391.initializeIndexLoader(new Class298(IndexLoaders.INTERFACE_INDEX), (byte) -5);
            Class446.aClass446_5409.initializeIndexLoader(new Class298(IndexLoaders.CS2_SCRIPTS_INDEX), (byte) -83);
            Class446.aClass446_5398.initializeIndexLoader(new Class298(IndexLoaders.FONT_METRICS_INDEX), (byte) -104);
            Class446.aClass446_5411.initializeIndexLoader(new Class388(IndexLoaders.WORLD_MAP_INDEX), (byte) -79);
            for (i_9 = 0; i_9 < Class296.aClass446Array3531.length; i_9++) {
                if (Class296.aClass446Array3531[i_9].method7443(-1578202194) == null) {
                    throw new RuntimeException();
                }
            }
            i_9 = 0;
            Class446[] arr_2 = Class296.aClass446Array3531;
            for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
                Class446 class446_4 = arr_2[i_3];
                i_5 = class446_4.method7432();
                int i_6 = class446_4.method7443(1059684891).getCompletion();
                i_9 += i_6 * i_5 / 100;
            }
            Class296.anInt3533 = i_9;
            Class296.anInt3532 = 2;
        }
        if (Class296.aClass446Array3531 == null) {
            return 100;
        } else {
            i_9 = 0;
            int i_10 = 0;
            boolean bool_13 = true;
            Class446[] arr_14 = Class296.aClass446Array3531;
            for (i_5 = 0; i_5 < arr_14.length; i_5++) {
                Class446 class446_11 = arr_14[i_5];
                int i_7 = class446_11.method7432();
                int i_8 = class446_11.method7443(-673812975).getCompletion();
                if (i_8 < 100) {
                    bool_13 = false;
                }
                i_9 += i_7;
                i_10 += i_7 * i_8 / 100;
            }
            if (bool_13) {
                if (!((Class301) Class446.aClass446_5385.method7443(98634719)).method5328((byte) -96)) {
                    client.aBool7393 = Class308.aclient3620.method4662();
                }
                Class296.aClass446Array3531 = null;
            }
            i_10 -= Class296.anInt3533;
            i_9 -= Class296.anInt3533;
            i_5 = i_9 > 0 ? i_10 * 100 / i_9 : 100;
            if (!bool_13 && i_5 > 99) {
                i_5 = 99;
            }
            return i_5;
        }
    }

    static void method7703() {
        if (client.CURRENT_CUTSCENE < 0) {
            FontMetrics fontmetrics_1 = ShaderLoader.method1887(-785695641);
            if (!Class20.aBool161) {
                Class20.aBool162 = Class20.anInt198 != -1 && Class20.anInt169 >= Class20.anInt198 || (Class20.aBool187 ? 26 : 22) + Class20.anInt178 * Class20.anInt169 > Engine.anInt3243 * -969250379;
            }
            Class20.aClass482_174.removeAll();
            Class20.aClass482_175.removeAll();
            int i_3;
            for (CacheableNode_Sub7 class282_sub50_sub7_2 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_2 != null; class282_sub50_sub7_2 = (CacheableNode_Sub7) Class20.aClass482_171.next(1807139429)) {
                i_3 = class282_sub50_sub7_2.clickType;
                if (i_3 < 1000) {
                    class282_sub50_sub7_2.remove();
                    if (i_3 != 59 && i_3 != 2 && i_3 != 8 && i_3 != 17 && i_3 != 15 && i_3 != 16 && i_3 != 58) {
                        Class20.aClass482_174.append(class282_sub50_sub7_2);
                    } else {
                        Class20.aClass482_175.append(class282_sub50_sub7_2);
                    }
                }
            }
            Class20.aClass482_174.method8063(Class20.aClass482_171);
            Class20.aClass482_175.method8063(Class20.aClass482_171);
            if (Class20.anInt169 <= 1) {
                CutsceneAction_Sub23.aCacheableNode_Sub7_9445 = null;
                AccountCreationStage.aCacheableNode_Sub7_12 = null;
                Class20.aCacheableNode_Sub7_168 = null;
            } else {
                if (Preference_Sub1.method12619(694674525) && Class20.anInt169 > 2) {
                    CutsceneAction_Sub23.aCacheableNode_Sub7_9445 = (CacheableNode_Sub7) Class20.aClass482_171.tail.prev.prev;
                } else {
                    CutsceneAction_Sub23.aCacheableNode_Sub7_9445 = (CacheableNode_Sub7) Class20.aClass482_171.tail.prev;
                }
                AccountCreationStage.aCacheableNode_Sub7_12 = (CacheableNode_Sub7) Class20.aClass482_171.tail.prev;
                if (Class20.anInt169 > 2) {
                    Class20.aCacheableNode_Sub7_168 = (CacheableNode_Sub7) AccountCreationStage.aCacheableNode_Sub7_12.prev;
                } else {
                    Class20.aCacheableNode_Sub7_168 = null;
                }
            }
            MouseRecord class282_sub53_14 = (MouseRecord) client.mouseRecords.head();
            int i_4;
            if (class282_sub53_14 != null) {
                i_3 = class282_sub53_14.getX();
                i_4 = class282_sub53_14.getY();
            } else {
                i_3 = Class163.mouseRecorder.getMouseX();
                i_4 = Class163.mouseRecorder.getMouseY();
            }
            boolean bool_16;
            if (Class20.aBool161) {
                int i_6;
                int i_11;
                if (Friend.method302(Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5882, class282_sub53_14)) {
                    int i_5;
                    CacheableNode_Sub7 class282_sub50_sub7_8;
                    Class469 class469_15;
                    if (Class20.aCacheableNode_Sub15_163 != null && i_3 >= Class341.anInt3996 && i_3 <= Class341.anInt3996 + ObjectAnimationCutsceneAction.anInt8518 && i_4 >= CacheableNode_Sub2.anInt9471 && i_4 <= Transform_Sub1_Sub5_Sub1.anInt10526 + CacheableNode_Sub2.anInt9471) {
                        i_5 = -1;
                        for (i_6 = 0; i_6 < Class20.aCacheableNode_Sub15_163.anInt9769; i_6++) {
                            if (Class20.aBool187) {
                                i_11 = i_6 * Class20.anInt178 + fontmetrics_1.topPadding + CacheableNode_Sub2.anInt9471 + 1 + 20;
                                if (i_4 > i_11 - fontmetrics_1.topPadding - 1 && i_4 < i_11 + fontmetrics_1.bottomPadding) {
                                    i_5 = i_6;
                                }
                            } else {
                                i_11 = i_6 * Class20.anInt178 + CacheableNode_Sub2.anInt9471 + 31;
                                if (i_4 > i_11 - 13 && i_4 < i_11 + 3) {
                                    i_5 = i_6;
                                }
                            }
                        }
                        if (i_5 != -1) {
                            i_6 = 0;
                            class469_15 = new Class469(Class20.aCacheableNode_Sub15_163.aClass477_9770);
                            for (class282_sub50_sub7_8 = (CacheableNode_Sub7) class469_15.method7790(); class282_sub50_sub7_8 != null; class282_sub50_sub7_8 = (CacheableNode_Sub7) class469_15.next()) {
                                if (i_5 == i_6) {
                                    CutsceneAction_Sub4.method13789(class282_sub50_sub7_8, i_3, i_4, 951380502);
                                    break;
                                }
                                ++i_6;
                            }
                        }
                        Class316.method5594();
                    } else if (i_3 >= Class301.anInt3555 && i_3 <= Class158_Sub2.anInt8975 + Class301.anInt3555 && i_4 >= BufferedConnectionContext.anInt2300 && i_4 <= BufferedConnectionContext.anInt2300 + Class110.anInt1104) {
                        if (!Class20.aBool162) {
                            i_5 = -1;
                            for (i_6 = 0; i_6 < Class20.anInt169; i_6++) {
                                if (Class20.aBool187) {
                                    i_11 = (Class20.anInt169 - 1 - i_6) * Class20.anInt178 + fontmetrics_1.topPadding + BufferedConnectionContext.anInt2300 + 1 + 20;
                                    if (i_4 > i_11 - fontmetrics_1.topPadding - 1 && i_4 < i_11 + fontmetrics_1.bottomPadding) {
                                        i_5 = i_6;
                                    }
                                } else {
                                    i_11 = (Class20.anInt169 - 1 - i_6) * Class20.anInt178 + BufferedConnectionContext.anInt2300 + 31;
                                    if (i_4 > i_11 - 13 && i_4 < i_11 + 3) {
                                        i_5 = i_6;
                                    }
                                }
                            }
                            if (i_5 != -1) {
                                i_6 = 0;
                                NodeIterator nodeiterator_7 = new NodeIterator(Class20.aClass482_171);
                                for (class282_sub50_sub7_8 = (CacheableNode_Sub7) nodeiterator_7.method7683(-1181797643); class282_sub50_sub7_8 != null; class282_sub50_sub7_8 = (CacheableNode_Sub7) nodeiterator_7.next()) {
                                    if (i_6 == i_5) {
                                        CutsceneAction_Sub4.method13789(class282_sub50_sub7_8, i_3, i_4, 1995969005);
                                        break;
                                    }
                                    ++i_6;
                                }
                            }
                            Class316.method5594();
                        } else {
                            i_5 = -1;
                            for (i_6 = 0; i_6 < Class20.anInt170; i_6++) {
                                if (Class20.aBool187) {
                                    i_11 = i_6 * Class20.anInt178 + fontmetrics_1.topPadding + BufferedConnectionContext.anInt2300 + 1 + 20;
                                    if (i_4 > i_11 - fontmetrics_1.topPadding - 1 && i_4 < i_11 + fontmetrics_1.bottomPadding) {
                                        i_5 = i_6;
                                        break;
                                    }
                                } else {
                                    i_11 = i_6 * Class20.anInt178 + BufferedConnectionContext.anInt2300 + 31;
                                    if (i_4 > i_11 - 13 && i_4 < i_11 + 3) {
                                        i_5 = i_6;
                                        break;
                                    }
                                }
                            }
                            if (i_5 != -1) {
                                i_6 = 0;
                                class469_15 = new Class469(Class20.aClass477_182);
                                for (CacheableNode_Sub15 class282_sub50_sub15_17 = (CacheableNode_Sub15) class469_15.method7790(); class282_sub50_sub15_17 != null; class282_sub50_sub15_17 = (CacheableNode_Sub15) class469_15.next()) {
                                    if (i_5 == i_6) {
                                        CutsceneAction_Sub4.method13789((CacheableNode_Sub7) class282_sub50_sub15_17.aClass477_9770.aCacheableNode_5629.aCacheableNode_8119, i_3, i_4, 1026140504);
                                        Class316.method5594();
                                        break;
                                    }
                                    ++i_6;
                                }
                            }
                        }
                    }
                } else {
                    bool_16 = false;
                    if (Class20.aCacheableNode_Sub15_163 != null) {
                        if (i_3 >= Class341.anInt3996 - 10 && i_3 <= ObjectAnimationCutsceneAction.anInt8518 + Class341.anInt3996 + 10 && i_4 >= CacheableNode_Sub2.anInt9471 - 10 && i_4 <= Transform_Sub1_Sub5_Sub1.anInt10526 + CacheableNode_Sub2.anInt9471 + 10) {
                            bool_16 = true;
                        } else {
                            Class404.method6810(988728251);
                        }
                    }
                    if (!bool_16) {
                        if (i_3 >= Class301.anInt3555 - 10 && i_3 <= Class158_Sub2.anInt8975 + Class301.anInt3555 + 10 && i_4 >= BufferedConnectionContext.anInt2300 - 10 && i_4 <= Class110.anInt1104 + BufferedConnectionContext.anInt2300 + 10) {
                            if (Class20.aBool162) {
                                i_6 = -1;
                                i_11 = -1;
                                int i_12;
                                for (i_12 = 0; i_12 < Class20.anInt170; i_12++) {
                                    int i_13;
                                    if (Class20.aBool187) {
                                        i_13 = i_12 * Class20.anInt178 + fontmetrics_1.topPadding + BufferedConnectionContext.anInt2300 + 1 + 20;
                                        if (i_4 > i_13 - fontmetrics_1.topPadding - 1 && i_4 < i_13 + fontmetrics_1.bottomPadding) {
                                            i_6 = i_12;
                                            i_11 = i_13 - fontmetrics_1.topPadding - 1;
                                            break;
                                        }
                                    } else {
                                        i_13 = i_12 * Class20.anInt178 + BufferedConnectionContext.anInt2300 + 31;
                                        if (i_4 > i_13 - 13 && i_4 < i_13 + 3) {
                                            i_6 = i_12;
                                            i_11 = i_13 - 13;
                                            break;
                                        }
                                    }
                                }
                                if (i_6 != -1) {
                                    i_12 = 0;
                                    Class469 class469_9 = new Class469(Class20.aClass477_182);
                                    for (CacheableNode_Sub15 class282_sub50_sub15_10 = (CacheableNode_Sub15) class469_9.method7790(); class282_sub50_sub15_10 != null; class282_sub50_sub15_10 = (CacheableNode_Sub15) class469_9.next()) {
                                        if (i_6 == i_12) {
                                            if (class282_sub50_sub15_10.anInt9769 > 1) {
                                                AnimationFrameBase.method12212(class282_sub50_sub15_10, i_11);
                                            }
                                            break;
                                        }
                                        ++i_12;
                                    }
                                }
                            }
                        } else {
                            Class316.method5594();
                        }
                    }
                }
            } else {
                bool_16 = Friend.method302(Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5878, class282_sub53_14);
                boolean bool_18 = Friend.method302(Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5874, class282_sub53_14);
                boolean bool_20 = Friend.method302(Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5875, class282_sub53_14);
                if ((bool_16 || bool_18) && (client.anInt7339 == 1 && Class20.anInt169 > 2 || JS5GrabWorker.method12562(-269769835))) {
                    bool_20 = true;
                }
                if (bool_20 && Class20.anInt169 > 0) {
                    if (client.aClass118_7257 == null && client.anInt7184 == 0) {
                        NativeLibraryLoader.method4653(i_3, i_4, 272985628);
                    } else {
                        Class20.anInt167 = 2;
                    }
                } else if (bool_18) {
                    if (Class20.aCacheableNode_Sub7_168 != null) {
                        CutsceneAction_Sub4.method13789(Class20.aCacheableNode_Sub7_168, i_3, i_4, -619125547);
                    }
                } else if (bool_16) {
                    if (CutsceneAction_Sub23.aCacheableNode_Sub7_9445 == null) {
                        if (client.aBool7344) {
                            Class60.method1170();
                        }
                    } else {
                        boolean bool_19 = client.aClass118_7257 != null || client.anInt7184 > 0;
                        if (bool_19) {
                            Class20.anInt167 = 1;
                            Class46.aCacheableNode_Sub7_438 = CutsceneAction_Sub23.aCacheableNode_Sub7_9445;
                        } else {
                            CutsceneAction_Sub4.method13789(CutsceneAction_Sub23.aCacheableNode_Sub7_9445, i_3, i_4, 1860097874);
                        }
                    }
                }
                if (client.aClass118_7257 == null && client.anInt7184 == 0) {
                    Class20.anInt167 = 0;
                    Class46.aCacheableNode_Sub7_438 = null;
                }
            }
        }
    }

    static byte method7705(int i_0, int i_1) {
        return (byte) (i_0 != SceneObjectType.WALL_INTERACT.type ? 0 : ((i_1 & 0x1) == 0 ? 1 : 2));
    }
}
