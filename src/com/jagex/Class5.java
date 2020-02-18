package com.jagex;

public class Class5 {

    static int[] anIntArray36;

    Class5() throws Throwable {
        throw new Error();
    }

    public static int method294(int i_0) {
        double d_2 = (i_0 >> 16 & 0xff) / 256.0D;
        double d_4 = (i_0 >> 8 & 0xff) / 256.0D;
        double d_6 = (i_0 & 0xff) / 256.0D;
        double d_8 = d_2;
        if (d_4 < d_2) {
            d_8 = d_4;
        }
        if (d_6 < d_8) {
            d_8 = d_6;
        }
        double d_10 = d_2;
        if (d_4 > d_2) {
            d_10 = d_4;
        }
        if (d_6 > d_10) {
            d_10 = d_6;
        }
        double d_12 = 0.0D;
        double d_14 = 0.0D;
        double d_16 = (d_10 + d_8) / 2.0D;
        if (d_10 != d_8) {
            if (d_16 < 0.5D) {
                d_14 = (d_10 - d_8) / (d_8 + d_10);
            }
            if (d_16 >= 0.5D) {
                d_14 = (d_10 - d_8) / (2.0D - d_10 - d_8);
            }
            if (d_2 == d_10) {
                d_12 = (d_4 - d_6) / (d_10 - d_8);
            } else if (d_4 == d_10) {
                d_12 = 2.0D + (d_6 - d_2) / (d_10 - d_8);
            } else if (d_10 == d_6) {
                d_12 = 4.0D + (d_2 - d_4) / (d_10 - d_8);
            }
        }
        d_12 /= 6.0D;
        int i_18 = (int) (256.0D * d_12);
        int i_19 = (int) (d_14 * 256.0D);
        int i_20 = (int) (d_16 * 256.0D);
        if (i_19 < 0) {
            i_19 = 0;
        } else if (i_19 > 255) {
            i_19 = 255;
        }
        if (i_20 < 0) {
            i_20 = 0;
        } else if (i_20 > 255) {
            i_20 = 255;
        }
        if (i_20 > 243) {
            i_19 >>= 4;
        } else if (i_20 > 217) {
            i_19 >>= 3;
        } else if (i_20 > 192) {
            i_19 >>= 2;
        } else if (i_20 > 179) {
            i_19 >>= 1;
        }
        return ((i_18 & 0xff) >> 2 << 10) + (i_20 >> 1) + (i_19 >> 5 << 7);
    }

    public static Class104 method295(int i_0) {
        Class104[] arr_2 = Class52_Sub2_Sub1.method15631();
        for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
            Class104 class104_4 = arr_2[i_3];
            if (i_0 == class104_4.id) {
                return class104_4;
            }
        }
        return null;
    }

    static void method297() {
        client.LOBBY_CONNECTION_CONTEXT.method3051();
        if (Class14.anInt134 < 2) {
            Class448.LOBBY_CONNECTION_INFO.swap();
            Class14.anInt133 = 0;
            ++Class14.anInt134;
            Class192.ACCOUNT_CREATION_STAGE = AccountCreationStage.REQUEST;
        } else {
            Class192.ACCOUNT_CREATION_STAGE = null;
            CutsceneAction_Sub9.RECIEVED_RESPONSE = AccountCreationResponseOpcodes.aClass483_5731;
            Class365.setGameState(5);
        }
    }
}
