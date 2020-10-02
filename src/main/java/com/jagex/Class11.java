package com.jagex;

public class Class11 {

    public static int anInt122;
    public static SystemInfo SYSTEM_INFO;
    static Class109 aClass109_121;
    static int anInt123;

    Class11() throws Throwable {
        throw new Error();
    }

    public static void method469(int i_0, int i_1, int i_2, int i_3, int i_4) {
        PlaySynthCutsceneAction.anInt9368 = i_0;
        IdentiKitIndexLoader.anInt4280 = i_1;
        Class121.anInt1527 = i_2;
        LinkedNodeList.anInt5606 = i_3;
        Class501.anInt5828 = i_4;
        if (Class501.anInt5828 >= 100) {
            int i_6 = PlaySynthCutsceneAction.anInt9368 * 512 + 256;
            int i_7 = IdentiKitIndexLoader.anInt4280 * 512 + 256;
            int i_8 = Class504.getTerrainHeightAtPos(i_6, i_7, Class4.MY_PLAYER_PLANE) - Class121.anInt1527;
            int i_9 = i_6 - IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX;
            int i_10 = i_8 - Class109_Sub1.CAM_MOVE_ABSOLUTEZ;
            int i_11 = i_7 - Class246.CAM_MOVE_ABSOLUTEY;
            int i_12 = (int) Math.sqrt(i_9 * i_9 + i_11 * i_11);
            Class293.anInt3512 = (int) (Math.atan2(i_10, i_12) * 2607.5945876176133D) & 0x3fff;
            AnimationDefinitions.anInt5930 = (int) (Math.atan2(i_9, i_11) * -2607.5945876176133) & 0x3fff;
            Class121.anInt1525 = 0;
            if (Class293.anInt3512 < 1024) {
                Class293.anInt3512 = 1024;
            }
            if (Class293.anInt3512 > 3072) {
                Class293.anInt3512 = 3072;
            }
        }
        NativeLibraryLoader.anInt3240 = 5;
        Class86.anInt833 = -1;
        PingRequester.anInt5864 = -1;
    }

    public static void method13400(Index index_0, int i_1, int i_3) {
        Class271.method4827(index_0, i_1, 0, i_3, false);
    }
}
