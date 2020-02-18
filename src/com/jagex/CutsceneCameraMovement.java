package com.jagex;

public class CutsceneCameraMovement {

    int[] anIntArray763;

    int[] anIntArray760;

    int[] anIntArray762;

    int[] anIntArray759;

    int[] anIntArray761;

    int[] anIntArray764;

    int[] anIntArray765;

    CutsceneCameraMovement(Packet rsbytebuffer_1) {
        int i_2 = rsbytebuffer_1.readUnsignedSmart();
        anIntArray763 = new int[i_2];
        anIntArray760 = new int[i_2];
        anIntArray762 = new int[i_2];
        anIntArray759 = new int[i_2];
        anIntArray761 = new int[i_2];
        anIntArray764 = new int[i_2];
        anIntArray765 = new int[i_2];
        for (int i_3 = 0; i_3 < i_2; i_3++) {
            anIntArray763[i_3] = rsbytebuffer_1.readUnsignedShort() - 5120;
            anIntArray762[i_3] = rsbytebuffer_1.readUnsignedShort() - 5120;
            anIntArray760[i_3] = rsbytebuffer_1.readShort();
            anIntArray761[i_3] = rsbytebuffer_1.readUnsignedShort() - 5120;
            anIntArray765[i_3] = rsbytebuffer_1.readUnsignedShort() - 5120;
            anIntArray764[i_3] = rsbytebuffer_1.readShort();
            anIntArray759[i_3] = rsbytebuffer_1.readShort();
        }
    }

    static void method1365() {
        if (Class540.anIntArray7136 == null) {
            Class540.anIntArray7136 = new int[65536];
            EnumIndexLoader.anIntArray5379 = new int[65536];
            double d_1 = 0.7D + (Math.random() * 0.03D - 0.015D);
            for (int i_3 = 0; i_3 < 65536; i_3++) {
                double d_4 = (i_3 >> 10 & 0x3f) / 64.0D + 0.0078125D;
                double d_6 = 0.0625D + (i_3 >> 7 & 0x7) / 8.0D;
                double d_8 = (i_3 & 0x7f) / 128.0D;
                double d_10 = d_8;
                double d_12 = d_8;
                double d_14 = d_8;
                if (d_6 != 0.0D) {
                    double d_16;
                    if (d_8 < 0.5D) {
                        d_16 = d_8 * (d_6 + 1.0D);
                    } else {
                        d_16 = d_6 + d_8 - d_8 * d_6;
                    }
                    double d_18 = d_8 * 2.0D - d_16;
                    double d_20 = 0.3333333333333333D + d_4;
                    if (d_20 > 1.0D) {
                        --d_20;
                    }
                    double d_24 = d_4 - 0.3333333333333333D;
                    if (d_24 < 0.0D) {
                        ++d_24;
                    }
                    if (d_20 * 6.0D < 1.0D) {
                        d_10 = d_18 + (d_16 - d_18) * 6.0D * d_20;
                    } else if (2.0D * d_20 < 1.0D) {
                        d_10 = d_16;
                    } else if (3.0D * d_20 < 2.0D) {
                        d_10 = d_18 + 6.0D * (0.6666666666666666D - d_20) * (d_16 - d_18);
                    } else {
                        d_10 = d_18;
                    }
                    if (6.0D * d_4 < 1.0D) {
                        d_12 = d_18 + 6.0D * (d_16 - d_18) * d_4;
                    } else if (d_4 * 2.0D < 1.0D) {
                        d_12 = d_16;
                    } else if (3.0D * d_4 < 2.0D) {
                        d_12 = 6.0D * (0.6666666666666666D - d_4) * (d_16 - d_18) + d_18;
                    } else {
                        d_12 = d_18;
                    }
                    if (d_24 * 6.0D < 1.0D) {
                        d_14 = d_24 * 6.0D * (d_16 - d_18) + d_18;
                    } else if (d_24 * 2.0D < 1.0D) {
                        d_14 = d_16;
                    } else if (d_24 * 3.0D < 2.0D) {
                        d_14 = 6.0D * (0.6666666666666666D - d_24) * (d_16 - d_18) + d_18;
                    } else {
                        d_14 = d_18;
                    }
                }
                d_10 = Math.pow(d_10, d_1);
                d_12 = Math.pow(d_12, d_1);
                d_14 = Math.pow(d_14, d_1);
                int i_26 = (int) (d_10 * 256.0D);
                int i_17 = (int) (d_12 * 256.0D);
                int i_27 = (int) (256.0D * d_14);
                int i_19 = i_27 + (i_17 << 8) + (i_26 << 16);
                Class540.anIntArray7136[i_3] = i_19 & 0xffffff;
                int i_28 = i_26 + (i_17 << 8) + (i_27 << 16);
                EnumIndexLoader.anIntArray5379[i_3] = i_28;
            }
        }
    }

    public static WorldDescriptor getCurrentWorldDescriptor() {
        return Class448.CURRENT_WORLD < Class448.WORLD_DESCRIPTORS_BYID.length ? Class448.WORLD_DESCRIPTORS_BYID[++Class448.CURRENT_WORLD - 1] : null;
    }

    public static void method1369(AnimationIndexLoader animationindexloader_0) {
        NamedFileReference.ANIMATION_INDEX_LOADER = animationindexloader_0;
    }

    void method1363(int i_1) {
        int[][] ints_3 = new int[anIntArray763.length << 1][4];
        for (int i_4 = 0; i_4 < anIntArray763.length; i_4++) {
            ints_3[i_4 * 2][0] = anIntArray763[i_4];
            ints_3[i_4 * 2][1] = anIntArray760[i_4];
            ints_3[i_4 * 2][2] = anIntArray762[i_4];
            ints_3[i_4 * 2][3] = anIntArray759[i_4];
            ints_3[i_4 * 2 + 1][0] = anIntArray761[i_4];
            ints_3[i_4 * 2 + 1][1] = anIntArray764[i_4];
            ints_3[i_4 * 2 + 1][2] = anIntArray765[i_4];
            ints_3[i_4 * 2 + 1][3] = anIntArray759[i_4];
        }
        client.anIntArrayArrayArray7302[i_1] = ints_3;
    }
}
