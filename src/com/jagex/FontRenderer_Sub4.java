package com.jagex;

import java.nio.ByteBuffer;

public class FontRenderer_Sub4 extends FontRenderer {

    GraphicalRenderer_Sub2 aGraphicalRenderer_Sub2_9321;
    Interface6 anInterface6_9322;
    Interface4 anInterface4_9320;

    void c(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
        this.aGraphicalRenderer_Sub2_9321.method13935();
        this.aGraphicalRenderer_Sub2_9321.method13904(1);
        Class47 class47_6 = this.aGraphicalRenderer_Sub2_9321.aClass47_8698;
        class47_6.anInterface6_443 = this.anInterface6_9322;
        class47_6.method937(3, i_4);
        float f_7 = (float) this.aGraphicalRenderer_Sub2_9321.method8523((byte) 120).method2714();
        float f_8 = (float) this.aGraphicalRenderer_Sub2_9321.method8523((byte) 114).method2716();
        class47_6.aClass384_442.method6525(2.0F / f_7, 2.0F / f_8, 1.0F, 1.0F);
        class47_6.aClass384_442.buf[12] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9321.method13905()) * 2.0F / f_7 - 1.0F;
        class47_6.aClass384_442.buf[13] = ((float) i_3 + this.aGraphicalRenderer_Sub2_9321.method13905()) * 2.0F / f_8 - 1.0F;
        class47_6.aClass384_442.buf[14] = -1.0F;
        class47_6.aClass384_440.identity();
        class47_6.anInterface4_445 = this.anInterface4_9320;
        class47_6.anInt446 = var_1 * 4;
        class47_6.aClass70_447 = this.aGraphicalRenderer_Sub2_9321.aClass70_8832;
        class47_6.method936();
    }

    FontRenderer_Sub4(GraphicalRenderer_Sub2 class505_sub2_1, FontMetrics fontmetrics_2, SpriteDefinitions[] arr_3, boolean bool_4) {
        super(class505_sub2_1, fontmetrics_2);
        this.aGraphicalRenderer_Sub2_9321 = class505_sub2_1;
        int i_5 = 0;

        int i_6;
        for (i_6 = 0; i_6 < 256; i_6++) {
            SpriteDefinitions class91_7 = arr_3[i_6];
            if (class91_7.height > i_5) {
                i_5 = class91_7.height;
            }

            if (class91_7.width > i_5) {
                i_5 = class91_7.width;
            }
        }

        i_6 = i_5 * 16;
        int i_8;
        int i_10;
        int i_12;
        int i_13;
        int i_14;
        int i_15;
        int i_17;
        int i_18;
        SpriteDefinitions class91_23;
        if (bool_4) {
            byte[] bytes_28 = new byte[i_6 * i_6];

            for (i_8 = 0; i_8 < 256; i_8++) {
                class91_23 = arr_3[i_8];
                i_10 = class91_23.height;
                int i_11 = class91_23.width;
                i_12 = i_5 * (i_8 % 16);
                i_13 = i_8 / 16 * i_5;
                i_14 = i_12 + i_13 * i_6;
                i_15 = 0;
                byte[] bytes_16;
                if (class91_23.alpha == null) {
                    bytes_16 = class91_23.pixels;

                    for (i_17 = 0; i_17 < i_10; i_17++) {
                        for (i_18 = 0; i_18 < i_11; i_18++) {
                            bytes_28[i_14++] = (byte) (bytes_16[i_15++] == 0 ? 0 : -1);
                        }

                        i_14 += i_6 - i_11;
                    }
                } else {
                    bytes_16 = class91_23.alpha;

                    for (i_17 = 0; i_17 < i_10; i_17++) {
                        for (i_18 = 0; i_18 < i_11; i_18++) {
                            bytes_28[i_14++] = bytes_16[i_15++];
                        }

                        i_14 += i_6 - i_11;
                    }
                }
            }

            if (!class505_sub2_1.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
                int[] ints_22 = new int[bytes_28.length];

                for (int i_9 = 0; i_9 < bytes_28.length; i_9++) {
                    ints_22[i_9] = bytes_28[i_9] << 24;
                }

                this.anInterface6_9322 = class505_sub2_1.method14024(i_6, i_6, false, ints_22);
            } else {
                this.anInterface6_9322 = class505_sub2_1.method13957(Class150.aClass150_1951, i_6, i_6, false, bytes_28);
            }
        } else {
            int[] ints_29 = new int[i_6 * i_6];

            for (i_8 = 0; i_8 < 256; i_8++) {
                class91_23 = arr_3[i_8];
                int[] ints_24 = class91_23.pallete;
                byte[] bytes_25 = class91_23.alpha;
                byte[] bytes_26 = class91_23.pixels;
                i_13 = class91_23.height;
                i_14 = class91_23.width;
                i_15 = i_5 * (i_8 % 16);
                int i_27 = i_8 / 16 * i_5;
                i_17 = i_15 + i_27 * i_6;
                i_18 = 0;
                int i_19;
                int i_20;
                if (bytes_25 != null) {
                    for (i_19 = 0; i_19 < i_13; i_19++) {
                        for (i_20 = 0; i_20 < i_14; i_20++) {
                            ints_29[i_17++] = bytes_25[i_18] << 24 | ints_24[bytes_26[i_18] & 0xff];
                            ++i_18;
                        }

                        i_17 += i_6 - i_14;
                    }
                } else {
                    for (i_19 = 0; i_19 < i_13; i_19++) {
                        for (i_20 = 0; i_20 < i_14; i_20++) {
                            byte b_21;
                            if ((b_21 = bytes_26[i_18++]) != 0) {
                                ints_29[i_17++] = ~0xffffff | ints_24[b_21 & 0xff];
                            } else {
                                ++i_17;
                            }
                        }

                        i_17 += i_6 - i_14;
                    }
                }
            }

            this.anInterface6_9322 = class505_sub2_1.method14024(i_6, i_6, false, ints_29);
        }

        this.anInterface6_9322.method205(Class35.aClass35_383);
        this.anInterface4_9320 = class505_sub2_1.method13994(false);
        this.anInterface4_9320.method31(20480, 20);
        ByteBuffer bytebuffer_30 = this.aGraphicalRenderer_Sub2_9321.aByteBuffer8838;
        bytebuffer_30.clear();
        float f_31 = this.anInterface6_9322.method47((float) i_6) / (float) i_6;
        float f_32 = this.anInterface6_9322.method62((float) i_6) / (float) i_6;

        for (i_10 = 0; i_10 < 256; i_10++) {
            SpriteDefinitions class91_38 = arr_3[i_10];
            i_12 = class91_38.height;
            i_13 = class91_38.width;
            i_14 = class91_38.minY;
            i_15 = class91_38.minX;
            float f_39 = (float) (i_5 * (i_10 % 16));
            float f_33 = (float) (i_10 / 16 * i_5);
            float f_34 = f_39 * f_31;
            float f_35 = f_33 * f_32;
            float f_36 = (f_39 + (float) i_13) * f_31;
            float f_37 = (f_33 + (float) i_12) * f_32;
            bytebuffer_30.putFloat((float) i_15);
            bytebuffer_30.putFloat((float) i_14);
            bytebuffer_30.putFloat(0.0F);
            bytebuffer_30.putFloat(f_34);
            bytebuffer_30.putFloat(f_35);
            bytebuffer_30.putFloat((float) i_15);
            bytebuffer_30.putFloat((float) (i_14 + i_12));
            bytebuffer_30.putFloat(0.0F);
            bytebuffer_30.putFloat(f_34);
            bytebuffer_30.putFloat(f_37);
            bytebuffer_30.putFloat((float) (i_15 + i_13));
            bytebuffer_30.putFloat((float) (i_14 + i_12));
            bytebuffer_30.putFloat(0.0F);
            bytebuffer_30.putFloat(f_36);
            bytebuffer_30.putFloat(f_37);
            bytebuffer_30.putFloat((float) (i_15 + i_13));
            bytebuffer_30.putFloat((float) i_14);
            bytebuffer_30.putFloat(0.0F);
            bytebuffer_30.putFloat(f_36);
            bytebuffer_30.putFloat(f_35);
        }

        this.anInterface4_9320.method42(0, bytebuffer_30.position(), this.aGraphicalRenderer_Sub2_9321.aLong8695);
        class505_sub2_1.method13896(12);
    }

    void method362(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
    }

    void UA(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
        this.aGraphicalRenderer_Sub2_9321.method13935();
        this.aGraphicalRenderer_Sub2_9321.method13904(1);
        Class47 class47_6 = this.aGraphicalRenderer_Sub2_9321.aClass47_8698;
        class47_6.anInterface6_443 = this.anInterface6_9322;
        class47_6.method937(3, i_4);
        float f_7 = (float) this.aGraphicalRenderer_Sub2_9321.method8523((byte) 111).method2714();
        float f_8 = (float) this.aGraphicalRenderer_Sub2_9321.method8523((byte) 111).method2716();
        class47_6.aClass384_442.method6525(2.0F / f_7, 2.0F / f_8, 1.0F, 1.0F);
        class47_6.aClass384_442.buf[12] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9321.method13905()) * 2.0F / f_7 - 1.0F;
        class47_6.aClass384_442.buf[13] = ((float) i_3 + this.aGraphicalRenderer_Sub2_9321.method13905()) * 2.0F / f_8 - 1.0F;
        class47_6.aClass384_442.buf[14] = -1.0F;
        class47_6.aClass384_440.identity();
        class47_6.anInterface4_445 = this.anInterface4_9320;
        class47_6.anInt446 = var_1 * 4;
        class47_6.aClass70_447 = this.aGraphicalRenderer_Sub2_9321.aClass70_8832;
        class47_6.method936();
    }

    void method374(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
    }

    void t(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
        this.aGraphicalRenderer_Sub2_9321.method13935();
        this.aGraphicalRenderer_Sub2_9321.method13904(1);
        Class47 class47_6 = this.aGraphicalRenderer_Sub2_9321.aClass47_8698;
        class47_6.anInterface6_443 = this.anInterface6_9322;
        class47_6.method937(3, i_4);
        float f_7 = (float) this.aGraphicalRenderer_Sub2_9321.method8523((byte) 124).method2714();
        float f_8 = (float) this.aGraphicalRenderer_Sub2_9321.method8523((byte) 115).method2716();
        class47_6.aClass384_442.method6525(2.0F / f_7, 2.0F / f_8, 1.0F, 1.0F);
        class47_6.aClass384_442.buf[12] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9321.method13905()) * 2.0F / f_7 - 1.0F;
        class47_6.aClass384_442.buf[13] = ((float) i_3 + this.aGraphicalRenderer_Sub2_9321.method13905()) * 2.0F / f_8 - 1.0F;
        class47_6.aClass384_442.buf[14] = -1.0F;
        class47_6.aClass384_440.identity();
        class47_6.anInterface4_445 = this.anInterface4_9320;
        class47_6.anInt446 = var_1 * 4;
        class47_6.aClass70_447 = this.aGraphicalRenderer_Sub2_9321.aClass70_8832;
        class47_6.method936();
    }

}
