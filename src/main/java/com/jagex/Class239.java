package com.jagex;

import java.util.Arrays;

public class Class239 {

    static int anInt2935 = 16777215;
    static int anInt2932 = 13156520;
    static int anInt2942 = 5145;
    static Class247 aClass247_2940;
    long aLong2936;
    int anInt2946;
    int anInt2945 = -1;
    boolean aBool2947;
    Vector3 aClass385_2952 = new Vector3(-50.0f, -60.0f, -50.0f);
    LRUCache aClass229_2953 = new LRUCache(9);
    LRUCache aClass229_2954 = new LRUCache(9);
    AbstractRenderer aAbstractRenderer_2944;
    Class535[][] aClass535ArrayArray2943;
    Class535 aClass535_2948;
    Class535 aClass535_2951;
    Class535 aClass535_2937;
    Class535 aClass535_2931;

    public Class239(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        aAbstractRenderer_2944 = graphicalrenderer_1;
        aClass535ArrayArray2943 = new Class535[i_2][i_3];
        if (ScriptRunner.anIntArray2668 != null) {
            Class81.aClass152_802 = method4064(ScriptRunner.anIntArray2668[0], ScriptRunner.anIntArray2668[1], ScriptRunner.anIntArray2668[2], ScriptRunner.anIntArray2668[3], ScriptRunner.anIntArray2668[4], ScriptRunner.anIntArray2668[5]);
        }
        aClass247_2940 = null;
        aClass535_2948 = new Class535();
        aClass535_2951 = new Class535();
        aClass535_2937 = new Class535();
        aClass535_2931 = new Class535();
        method4048();
    }

    public static void method4090(int[] ints_0, int[] ints_1) {
        if (ints_0 != null && ints_1 != null) {
            CircularBuffer.anIntArray5773 = ints_0;
            Class412.anIntArray4962 = new int[ints_0.length];
            IcmpService_Sub1.aByteArrayArrayArray7963 = new byte[ints_0.length][][];
            for (int i_3 = 0; i_3 < CircularBuffer.anIntArray5773.length; i_3++) {
                IcmpService_Sub1.aByteArrayArrayArray7963[i_3] = new byte[ints_1[i_3]][];
            }
        } else {
            CircularBuffer.anIntArray5773 = null;
            Class412.anIntArray4962 = null;
            IcmpService_Sub1.aByteArrayArrayArray7963 = null;
        }
    }

    public void method4037(MapRegion mapregion_1) {
        if (!GameState.loggedOut(client.GAME_STATE) && !GameState.inLobby(client.GAME_STATE)) {
            int i_3 = -1;
            int i_4 = -1;
            if (VertexNormal.MY_PLAYER != null) {
                i_3 = VertexNormal.MY_PLAYER.regionBaseX[0] >> 3;
                i_4 = VertexNormal.MY_PLAYER.regionBaseY[0] >> 3;
            }
            if (i_3 >= 0 && i_3 < mapregion_1.getSizeX() >> 3 && i_4 >= 0 && i_4 < mapregion_1.getSizeY() >> 3) {
                method4072(i_3, i_4, anInt2942);
            } else {
                method4072(mapregion_1.getSizeX() >> 4, mapregion_1.getSizeY() >> 4, 0);
            }
        } else {
            method4072(IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX >> 12, Class246.CAM_MOVE_ABSOLUTEY >> 12, anInt2942);
        }
        method4065();
        method4049();
        method4051();
        method4075();
    }

    public Class535 method4038() {
        return aClass535_2951;
    }

    public void method4039(Class239 class239_1) {
        aClass535_2951.method11444(class239_1.aClass535_2951);
        aClass535_2937.method11444(class239_1.aClass535_2937);
        aClass535_2931.method11444(class239_1.aClass535_2931);
        aLong2936 = class239_1.aLong2936;
        anInt2946 = class239_1.anInt2946;
        anInt2945 = class239_1.anInt2945;
    }

    public void method4040() {
        aClass229_2953.method3859();
        aClass229_2954.method3859();
    }

    public void method4044() {
        for (int i_2 = 0; i_2 < aClass535ArrayArray2943.length; i_2++) {
            Arrays.fill(aClass535ArrayArray2943[i_2], aClass535_2948);
        }
    }

    public void method4045(int i_1, int i_2) {
        Class535 class535_4 = aClass535ArrayArray2943[i_1][i_2];
        if (class535_4 != null) {
            aClass385_2952.copy(class535_4.aClass385_7084);
        }
        method4049();
    }

    public void method4048() {
        aBool2947 = true;
    }

    void method4049() {
        aAbstractRenderer_2944.IA((0.7F + Class393.preferences.brightness.method12865() * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428()) * aClass535_2951.aFloat7081);
        aAbstractRenderer_2944.m(aClass535_2951.anInt7083, aClass535_2951.aFloat7082, aClass535_2951.aFloat7090, ((int) aClass385_2952.x << 2), ((int) aClass385_2952.y << 2), ((int) aClass385_2952.z << 2));
        aAbstractRenderer_2944.method8477(aClass535_2951.aClass152_7087);
    }

    Class247 method4050(int i_1, int i_2, int i_3, int i_4) {
        long long_6 = (i_2 & 0xffffL) << 48 | (i_3 & 0xffffL) << 32 | (i_4 & 0xffffL) << 16 | i_1 & 0xffffL;
        Class247 class247_8 = (Class247) aClass229_2954.get(long_6);
        if (class247_8 == null) {
            class247_8 = IndexLoaders.SKYBOX_LOADER.method5077(i_1, i_2, i_3, i_4, IndexLoaders.SUN_LOADER);
            aClass229_2954.put(class247_8, long_6);
        }
        return class247_8;
    }

    void method4051() {
        aAbstractRenderer_2944.method8472(aClass535_2951.aFloat7080, aClass535_2951.aFloat7088, aClass535_2951.aFloat7089);
    }

    public void method4052() {
        aAbstractRenderer_2944.IA((0.7F + Class393.preferences.brightness.method12865() * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428()) * 1.1523438F);
        aAbstractRenderer_2944.m(anInt2935, 0.69921875F, 1.2F, -200.0f, -240.0f, -200.0f);
        aAbstractRenderer_2944.c(anInt2932, -1, 0);
        aAbstractRenderer_2944.method8477(Class81.aClass152_802);
    }

    public void method4056(int i_1, int i_2, Class535 class535_3) {
        aClass535ArrayArray2943[i_1][i_2] = class535_3;
    }

    Class152 method4064(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        long long_8 = 67481L * i_1 ^ 97549L * i_2 ^ 475427L * i_3 ^ 986053L * i_4 ^ i_5 * 32147369L ^ 76724863L * i_6;
        Class152 class152_10 = (Class152) aClass229_2953.get(long_8);
        if (class152_10 == null) {
            class152_10 = aAbstractRenderer_2944.method8466(i_1, i_2, i_3, i_4, i_5, i_6);
            aClass229_2953.put(class152_10, long_8);
        }
        return class152_10;
    }

    void method4065() {
        if (anInt2945 >= 0) {
            long long_2 = Utils.time();
            anInt2945 = (int) ((anInt2945) - (long_2 - aLong2936));
            if (anInt2945 > 0) {
                aClass535_2951.method11445(aAbstractRenderer_2944, aClass535_2937, aClass535_2931, (float) (anInt2946 - anInt2945) / anInt2946);
            } else {
                aClass535_2951.method11444(aClass535_2931);
                if (aClass535_2951.aClass247_7091 != null) {
                    aClass535_2951.aClass247_7091.method4209();
                }
                anInt2945 = -1;
            }
            aLong2936 = long_2;
        }
    }

    void method4072(int i_1, int i_2, int i_3) {
        int i_31 = i_3;
        Class535 class535_5 = aClass535ArrayArray2943[i_1][i_2];
        if (class535_5 == null) {
            class535_5 = aClass535_2948;
        }
        if (aBool2947) {
            aBool2947 = false;
            i_31 = 0;
        }
        if (!aClass535_2931.method11449(class535_5)) {
            aClass535_2931.method11444(class535_5);
            aLong2936 = Utils.time();
            anInt2946 = anInt2945 = i_31;
            if (anInt2946 != 0) {
                aClass535_2937.method11444(aClass535_2951);
                if (aClass535_2951.aClass247_7091 != null) {
                    if (aClass535_2951.aClass247_7091.method4210()) {
                        aClass535_2951.aClass247_7091 = aClass535_2937.aClass247_7091 = aClass535_2951.aClass247_7091.method4211();
                    }
                    if (aClass535_2951.aClass247_7091 != null && aClass535_2951.aClass247_7091 != aClass535_2931.aClass247_7091) {
                        aClass535_2951.aClass247_7091.method4208(aClass535_2931.aClass247_7091);
                    }
                }
            }
        }
    }

    public void method4075() {
        byte b_2 = 0;
        int i_3 = (aClass535_2951.anInt7086 + 256 << 2) + b_2;
        aAbstractRenderer_2944.c(aClass535_2951.anInt7085, Class393.preferences.fog.method13417() == 1 ? i_3 : -1, 0);
    }
}
