import java.awt.Container;

public class Class371 {

    Class371() throws Throwable {
        throw new Error();
    }

    static final int method6347(int i_0, int i_1, int i_2, int i_3) {
        if (i_0 == i_1) {
            return i_0;
        } else {
            int i_4 = 128 - i_2;
            int i_5 = i_4 * (i_0 & 0x7f) + (i_1 & 0x7f) * i_2 >> 7;
            int i_6 = i_4 * (i_0 & 0x380) + i_2 * (i_1 & 0x380) >> 7;
            int i_7 = (i_1 & 0xfc00) * i_2 + i_4 * (i_0 & 0xfc00) >> 7;
            return i_7 & 0xfc00 | i_6 & 0x380 | i_5 & 0x7f;
        }
    }

    public static final int method6348(int i_0, int i_1, int i_2, int i_3) {
        if (i_2 > 243) {
            i_1 >>= 4;
        } else if (i_2 > 217) {
            i_1 >>= 3;
        } else if (i_2 > 192) {
            i_1 >>= 2;
        } else if (i_2 > 179) {
            i_1 >>= 1;
        }
        return ((i_0 & 0xff) >> 2 << 10) + (i_2 >> 1) + (i_1 >> 5 << 7);
    }

    public static int method6349(int i_0, int i_1, int i_2) {
        int i_3 = i_0 >>> 31;
        return (i_0 + i_3) / i_1 - i_3;
    }

    static void method6351(int i_0) {
        if (Class335.anIntArray3916 == null) {
            Class335.anIntArray3916 = new int[65536];
            double d_1 = 0.7D + (Math.random() * 0.03D - 0.015D);
            int i_3 = 0;
            for (int i_4 = 0; i_4 < 512; i_4++) {
                float f_5 = 360.0F * ((float) (i_4 >> 3) / 64.0F + 0.0078125F);
                float f_6 = (float) (i_4 & 0x7) / 8.0F + 0.0625F;
                for (int i_7 = 0; i_7 < 128; i_7++) {
                    float f_8 = (float) i_7 / 128.0F;
                    float f_9 = 0.0F;
                    float f_10 = 0.0F;
                    float f_11 = 0.0F;
                    float f_12 = f_5 / 60.0F;
                    int i_13 = (int) f_12;
                    int i_14 = i_13 % 6;
                    float f_15 = f_12 - (float) i_13;
                    float f_16 = f_8 * (1.0F - f_6);
                    float f_17 = f_8 * (1.0F - f_6 * f_15);
                    float f_18 = (1.0F - f_6 * (1.0F - f_15)) * f_8;
                    if (i_14 == 0) {
                        f_9 = f_8;
                        f_10 = f_18;
                        f_11 = f_16;
                    } else if (i_14 == 1) {
                        f_9 = f_17;
                        f_10 = f_8;
                        f_11 = f_16;
                    } else if (i_14 == 2) {
                        f_9 = f_16;
                        f_10 = f_8;
                        f_11 = f_18;
                    } else if (i_14 == 3) {
                        f_9 = f_16;
                        f_10 = f_17;
                        f_11 = f_8;
                    } else if (i_14 == 4) {
                        f_9 = f_18;
                        f_10 = f_16;
                        f_11 = f_8;
                    } else if (i_14 == 5) {
                        f_9 = f_8;
                        f_10 = f_16;
                        f_11 = f_17;
                    }
                    f_9 = (float) Math.pow((double) f_9, d_1);
                    f_10 = (float) Math.pow((double) f_10, d_1);
                    f_11 = (float) Math.pow((double) f_11, d_1);
                    int i_19 = (int) (f_9 * 256.0F);
                    int i_20 = (int) (256.0F * f_10);
                    int i_21 = (int) (256.0F * f_11);
                    int i_22 = i_21 + (i_20 << 8) + (i_19 << 16) + -16777216;
                    Class335.anIntArray3916[i_3++] = i_22;
                }
            }
        }
    }

    public static RouteStrategy method6352(int i_0, int i_1, int i_2, int i_3, int i_4) {
        Class224.aClass225_Sub6_2774.approxDestinationX = i_0;
        Class224.aClass225_Sub6_2774.approxDestinationY = i_1;
        Class224.aClass225_Sub6_2774.approxDestinationSizeX = i_2;
        Class224.aClass225_Sub6_2774.approxDestinationSizeY = i_3;
        return Class224.aClass225_Sub6_2774;
    }

    public static final void method6353(short s_0) {
        Class184 class184_1 = Class468_Sub20.method12807(2071524191);
        TCPMessage tcpmessage_2 = Class271.method4828(OutgoingPacket.aClass379_4598, class184_1.isaac, -585449353);
        tcpmessage_2.buffer.writeByte(0);
        class184_1.method3049(tcpmessage_2, 963665082);
    }

    public static Container getActiveContainer(byte b_0) {
        return (Container) (Engine.fullScreenFrame != null ? Engine.fullScreenFrame : (Engine.engineFrame != null ? Engine.engineFrame : Class282_Sub44.anApplet8065));
    }
}
