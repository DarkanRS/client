package com.jagex;

public class KeyHoldInputSubscriber implements InputSubscriber {

    public static int LOYALTY_BALANCE;
    static int anInt2878;
    int[] requiredKeys;

    KeyHoldInputSubscriber(int[] ints_1) {
        requiredKeys = ints_1;
    }

    public static KeyHoldInputSubscriber decode(Packet rsbytebuffer_0) {
        int count = rsbytebuffer_0.readUnsignedByte();
        int[] requiredKeys = new int[count];
        for (int i_4 = 0; i_4 < count; i_4++) {
            requiredKeys[i_4] = rsbytebuffer_0.readUnsignedByte();
        }
        return new KeyHoldInputSubscriber(requiredKeys);
    }

    static void method3920(int i_0) {
        int i_2 = client.cycles - client.anInt7429;
        if (i_2 >= 100) {
            NativeLibraryLoader.anInt3240 = 2;
            Class86.anInt833 = -1;
            PingRequester.anInt5864 = -1;
        } else {
            int i_3 = (int) client.camAngleX;
            if (client.anInt7273 >> 8 > i_3) {
                i_3 = client.anInt7273 >> 8;
            }
            if (client.CAM_SHAKING[4] && client.anIntArray7433[4] + 128 > i_3) {
                i_3 = client.anIntArray7433[4] + 128;
            }
            int i_4 = (int) client.camAngleY + client.anInt7343 & 0x3fff;
            Vector3 vector3_5 = VertexNormal.MY_PLAYER.method11166().coords;
            LoadingStage.method6683(Class11.anInt122, Class504.getTerrainHeightAtPos((int) vector3_5.x, (int) vector3_5.z, Class4.MY_PLAYER_PLANE) - 200, Class266.anInt3289, i_3, i_4, (i_3 >> 3) * 3 + 600 << 2, i_0);
            float f_6 = 1.0F - ((100 - i_2) * (100 - i_2) * (100 - i_2)) / 1000000.0F;
            IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = (int) (Class186.anInt2349 + f_6 * (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX - Class186.anInt2349));
            Class109_Sub1.CAM_MOVE_ABSOLUTEZ = (int) (GraphNode_Sub1_Sub2.anInt9461 + f_6 * (Class109_Sub1.CAM_MOVE_ABSOLUTEZ - GraphNode_Sub1_Sub2.anInt9461));
            Class246.CAM_MOVE_ABSOLUTEY = (int) ((Class246.CAM_MOVE_ABSOLUTEY - Node_Sub15_Sub1.anInt9575) * f_6 + Node_Sub15_Sub1.anInt9575);
            Class293.anInt3512 = (int) (ClipMap.anInt3968 + f_6 * (Class293.anInt3512 - ClipMap.anInt3968));
            int i_7 = AnimationDefinitions.anInt5930 - ParamIndexLoader.anInt5029;
            if (i_7 > 8192) {
                i_7 -= 16384;
            } else if (i_7 < -8192) {
                i_7 += 16384;
            }
            AnimationDefinitions.anInt5930 = (int) (ParamIndexLoader.anInt5029 + f_6 * i_7);
            AnimationDefinitions.anInt5930 &= 0x3fff;
        }
    }

    static void method3922(int[] ints_0, int i_1, int i_2, int i_3) {
        --i_1;
        --i_2;
        for (int i_5 = i_2 - 7; i_1 < i_5; ints_0[i_1] = i_3) {
            ++i_1;
            ints_0[i_1] = i_3;
            ++i_1;
            ints_0[i_1] = i_3;
            ++i_1;
            ints_0[i_1] = i_3;
            ++i_1;
            ints_0[i_1] = i_3;
            ++i_1;
            ints_0[i_1] = i_3;
            ++i_1;
            ints_0[i_1] = i_3;
            ++i_1;
            ints_0[i_1] = i_3;
            ++i_1;
        }
        while (i_1 <= i_2) {
            ++i_1;
            ints_0[i_1] = i_3;
        }
    }

    public boolean method126(KeyRecorder class199_4) {
        int[] ints_5 = requiredKeys;
        for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
            int i_7 = ints_5[i_6];
            if (!class199_4.held(i_7)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean valid(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, KeyRecorder class199_4) {
        int[] ints_6 = requiredKeys;
        for (int i_7 = 0; i_7 < ints_6.length; i_7++) {
            int i_8 = ints_6[i_7];
            if (!class199_4.held(i_8)) {
                return false;
            }
        }
        return true;
    }

    public boolean method128(KeyRecorder class199_4) {
        int[] ints_5 = requiredKeys;
        for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
            int i_7 = ints_5[i_6];
            if (!class199_4.held(i_7)) {
                return false;
            }
        }
        return true;
    }

    public boolean method129(KeyRecorder class199_4) {
        int[] ints_5 = requiredKeys;
        for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
            int i_7 = ints_5[i_6];
            if (!class199_4.held(i_7)) {
                return false;
            }
        }
        return true;
    }
}
