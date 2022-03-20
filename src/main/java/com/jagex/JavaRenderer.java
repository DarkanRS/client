package com.jagex;

import java.awt.Canvas;

public class JavaRenderer extends AbstractRenderer {

    int anInt8977;
    int anInt8998;
    int anInt8999;
    int anInt9000;
    int anInt9001;
    boolean aBool9012;
    boolean aBool9014;
    float aFloat8976;
    float aFloat9004;
    float aFloat9003;
    float aFloat8982;
    int anInt8983;
    int anInt9009;
    int anInt9002;
    int anInt8986;
    float aFloat8978;
    float aFloat8985;
    int anInt8990;
    int anInt8991;
    int anInt9011;
    int anInt8988;
    int anInt9007;
    int anInt9008;
    Class185[] aClass185Array8984;
    int anInt9015;
    NativeSprite aNativeSprite_8987;
    Matrix44Var aClass294_8993;
    int anInt8992;
    float[][] aFloatArrayArray8989;
    int size;
    boolean lowResolution;
    LRUCache aClass229_9013;
    LRUCache aClass229_9006;
    Matrix44 aClass384_8994;
    Matrix44 aClass384_8995;
    Matrix44 aClass384_8996;
    int anInt8980;
    int anInt8981;
    int[] anIntArray8979;
    float[] aFloatArray9010;

    JavaRenderer(ImageLoader interface22_1) {
        super(interface22_1);
        aBool9014 = false;
        aBool9012 = false;
        anInt8983 = 0;
        anInt9002 = 0;
        anInt9009 = 0;
        anInt8986 = 0;
        anInt8990 = 45823;
        anInt8991 = 78642;
        anInt8992 = 75518;
        aFloatArrayArray8989 = new float[6][4];
        aFloat8978 = 1.0F;
        aFloat8985 = 0.0F;
        size = 128;
        lowResolution = false;
        aClass229_9013 = new LRUCache(16);
        anInt9015 = -1;

        try {
            aClass229_9006 = new LRUCache(256);
            aClass294_8993 = new Matrix44Var();
            aClass384_8994 = new Matrix44();
            aClass384_8995 = new Matrix44();
            aClass384_8996 = new Matrix44();
            method14369(1);
            method14409();
            SunDefinitions.method854(true, true);
            aBool9012 = true;
            anInt8977 = (int) Utils.time();
        } catch (Throwable throwable_3) {
            throwable_3.printStackTrace();
            method8396();
            throw new RuntimeException("");
        }
    }

    JavaRenderer(Canvas canvas, ImageLoader imageLoader, int width, int height) {
        this(imageLoader);

        try {
            method8524(canvas, width, height);
            method8412(canvas);
        } catch (Throwable throwable_6) {
            throwable_6.printStackTrace();
            method8396();
            throw new RuntimeException("");
        }
    }

    @Override
    public boolean method8399() {
        return false;
    }

    @Override
    public RendererInfo method8392() {
        return new RendererInfo(0, "Pure Java", 1, "CPU", 0L);
    }

    @Override
    public void method8507() {
    }

    @Override
    public void method8395() {
    }

    @Override
    public void method8398(int i_1) {
        int i_2 = i_1 - anInt8977;

        for (Node_Sub27 class282_sub27_3 = (Node_Sub27) aClass229_9006.method3866(); class282_sub27_3 != null; class282_sub27_3 = (Node_Sub27) aClass229_9006.method3867()) {
            if (class282_sub27_3.aBool7693) {
                class282_sub27_3.anInt7692 += i_2;
                int i_4 = class282_sub27_3.anInt7692 / 50;
                if (i_4 > 0) {
                    TextureDetails class169_5 = textureCache.getTextureDetails(class282_sub27_3.anInt7695);
                    float f_6 = class169_5.isHalfSize ? 64.0F : 128.0F;
                    class282_sub27_3.method12403((int) (f_6 * (class169_5.textureSpeedU * (i_2 / 1000.0F) / 64.0F)), (int) (class169_5.textureSpeedV * (i_2 / 1000.0F) / 64.0F * f_6));
                    class282_sub27_3.anInt7692 -= i_4 * 50;
                }

                class282_sub27_3.aBool7693 = false;
            }
        }

        anInt8977 = i_1;
        aClass229_9013.method3858(5);
        aClass229_9006.method3858(5);
    }

    @Override
    public int method8443(int i_1, int i_2) {
        i_1 |= 0x20800;
        return i_1 & i_2 ^ i_2;
    }

    @Override
    void method8592(float f_1, float f_2, float f_3) {
    }

    int[] method14359(int textureId) {
        Node_Sub27 class282_sub27;
        synchronized (aClass229_9006) {
            class282_sub27 = ((Node_Sub27) aClass229_9006.get(textureId | -9223372036854775808L));
            if (class282_sub27 == null) {
                if (!textureCache.loadTexture(textureId))
                    return null;
                TextureDetails texDeets = textureCache.getTextureDetails(textureId);
                int res = (texDeets.isHalfSize || lowResolution ? 64 : size);
                class282_sub27 = (new Node_Sub27(textureId, res, textureCache.renderMaterialPixelsI(textureId, res, res), texDeets.blendType != 1));
                aClass229_9006.put(class282_sub27, textureId | -9223372036854775808L);
            }
        }
        class282_sub27.aBool7693 = true;
        return class282_sub27.method12406();
    }

    boolean method14360(int i_1) {
        return textureCache.loadTexture(i_1);
    }

    @Override
    public boolean method8498() {
        return false;
    }

    int method14361(int i_1) {
        return textureCache.getTextureDetails(i_1).blendType;
    }

    int method14362(int i_1) {
        return textureCache.getTextureDetails(i_1).color & 0xffff;
    }

    @Override
    public void method8598(Class152 class152_1) {
    }

    void method14363(boolean bool_1, boolean bool_2, Class151 class151_4) {
        Class185 class185_5 = method14370(Thread.currentThread());
        EntityNode_Sub1 class275_sub1_6 = class151_4.aClass464_1961.aEntityNode_Sub1_5554;

        for (EntityNode_Sub1 class275_sub1_7 = class275_sub1_6.aEntityNode_Sub1_7706; class275_sub1_7 != class275_sub1_6; class275_sub1_7 = class275_sub1_7.aEntityNode_Sub1_7706) {
            PointEntity class275_sub1_sub1_8 = (PointEntity) class275_sub1_7;
            int i_9 = class275_sub1_sub1_8.x >> 12;
            int i_10 = class275_sub1_sub1_8.z >> 12;
            int i_11 = class275_sub1_sub1_8.y >> 12;
            float f_12 = aClass384_8996.buf[14] + aClass384_8996.buf[10] * i_11 + i_9 * aClass384_8996.buf[2] + i_10 * aClass384_8996.buf[6];
            float f_13 = aClass384_8996.buf[15] + aClass384_8996.buf[7] * i_10 + aClass384_8996.buf[3] * i_9 + aClass384_8996.buf[11] * i_11;
            if (f_12 >= -f_13) {
                float f_14 = aFloat8985 + f_12 * aFloat8978 / f_13;
                if (f_12 <= class185_5.aFloat2305) {
                    float f_15 = aClass384_8996.buf[0] * i_9 + aClass384_8996.buf[4] * i_10 + i_11 * aClass384_8996.buf[8] + aClass384_8996.buf[12];
                    float f_16 = i_11 * aClass384_8996.buf[9] + aClass384_8996.buf[1] * i_9 + aClass384_8996.buf[5] * i_10 + aClass384_8996.buf[13];
                    if (f_15 >= -f_13 && f_15 <= f_13 && f_16 >= -f_13 && f_16 <= f_13) {
                        float f_17 = class275_sub1_sub1_8.size / 4096.0F;
                        float f_18 = f_17 * aClass384_8995.buf[0] + f_15;
                        float f_19 = f_13 + aClass384_8995.buf[3] * f_17;
                        float f_20 = aFloat9003 + f_15 * aFloat8976 / f_13;
                        float f_21 = aFloat9004 * f_16 / f_13 + aFloat8982;
                        float f_22 = aFloat9003 + f_18 * aFloat8976 / f_19;
                        method14371(bool_1, bool_2, class275_sub1_sub1_8, (int) f_20, (int) f_21, f_14, (int) (f_22 < f_20 ? f_20 - f_22 : f_22 - f_20));
                    }
                }
            }
        }

    }

    @Override
    public boolean method8465() {
        return false;
    }

    @Override
    public boolean method8664() {
        return true;
    }

    @Override
    public boolean method8403() {
        return false;
    }

    @Override
    public boolean method8404() {
        return false;
    }

    @Override
    public boolean method8402() {
        return false;
    }

    @Override
    public boolean method8405() {
        return false;
    }

    @Override
    public boolean method8406() {
        return false;
    }

    @Override
    public boolean method8454() {
        return false;
    }

    @Override
    public boolean method8407() {
        return true;
    }

    @Override
    public int method8539(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = i_3 * aClass384_8996.buf[10] + i_2 * aClass384_8996.buf[6] + aClass384_8996.buf[14] + i_1 * aClass384_8996.buf[2];
        float f_9 = aClass384_8996.buf[6] * i_5 + aClass384_8996.buf[14] + aClass384_8996.buf[2] * i_4 + aClass384_8996.buf[10] * i_6;
        float f_10 = aClass384_8996.buf[15] + i_1 * aClass384_8996.buf[3] + i_2 * aClass384_8996.buf[7] + i_3 * aClass384_8996.buf[11];
        float f_11 = i_5 * aClass384_8996.buf[7] + aClass384_8996.buf[15] + aClass384_8996.buf[3] * i_4 + i_6 * aClass384_8996.buf[11];
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8996.buf[4] * i_2 + aClass384_8996.buf[12] + i_1 * aClass384_8996.buf[0] + i_3 * aClass384_8996.buf[8];
        float f_13 = i_6 * aClass384_8996.buf[8] + i_4 * aClass384_8996.buf[0] + aClass384_8996.buf[12] + aClass384_8996.buf[4] * i_5;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8996.buf[5] * i_2 + i_1 * aClass384_8996.buf[1] + aClass384_8996.buf[13] + aClass384_8996.buf[9] * i_3;
        float f_15 = aClass384_8996.buf[13] + aClass384_8996.buf[1] * i_4 + aClass384_8996.buf[5] * i_5 + i_6 * aClass384_8996.buf[9];
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
        return Class52_Sub1.method14493(this, canvas_1, i_2, i_3);
    }

    @Override
    public void RA(boolean bool_1) {
        Class185 class185_2 = method14370(Thread.currentThread());
        class185_2.aBool2334 = bool_1;
    }

    @Override
    public int[] ab(int i_1, int i_2, int i_3, int i_4) {
        if (anIntArray8979 == null) {
            throw new IllegalStateException("");
        } else {
            int[] ints_5 = new int[i_3 * i_4];
            int i_6 = 0;

            for (int i_7 = 0; i_7 < i_4; i_7++) {
                int i_8 = (i_7 + i_2) * anInt8980 + i_1;

                for (int i_9 = 0; i_9 < i_3; i_9++) {
                    ints_5[i_6++] = anIntArray8979[i_8 + i_9];
                }
            }

            return ints_5;
        }
    }

    @Override
    public void method8420() {
    }

    @Override
    public void method8408(int[] ints_1) {
        ints_1[0] = anInt8980;
        ints_1[1] = anInt8981;
    }

    @Override
    public boolean method8600() {
        return false;
    }

    @Override
    public void method8618(Node_Sub1 class282_sub1_1) {
    }

    @Override
    public void method8421() {
        anInt8998 = 0;
        anInt8999 = 0;
        anInt9000 = anInt8980;
        anInt9001 = anInt8981;
        method14364();
    }

    @Override
    public void method8617(int i_1, int i_2, int i_3, int i_4) {
        anInt8998 = i_1;
        anInt8999 = i_2;
        anInt9000 = i_3;
        anInt9001 = i_4;
        method14364();
    }

    @Override
    void method8397() {
        if (aBool9012) {
            Class13.method508(true, false);
            aBool9012 = false;
        }

        aBool9014 = true;
    }

    void method14364() {
        int i_1 = anInt9002 - anInt8983;
        int i_2 = anInt8986 - anInt9009;
        float f_3 = aFloat8976 = anInt9000 / 2.0F;
        float f_4 = aFloat9004 = anInt9001 / 2.0F;
        aFloat9003 = anInt8998 + f_3;
        aFloat8982 = anInt8999 + f_4;

        int i_5;
        for (i_5 = 0; i_5 < anInt9008; i_5++) {
            Class185 class185_8 = aClass185Array8984[i_5];
            ChoppyItemFixClass choppyitemfixclass_7 = class185_8.aClass144_2310;
            choppyitemfixclass_7.aFloat1679 = f_3;
            choppyitemfixclass_7.aFloat1702 = f_4;
            choppyitemfixclass_7.aFloat1678 = aFloat9003 - anInt8983;
            choppyitemfixclass_7.aFloat1680 = aFloat8982 - anInt9009;
            choppyitemfixclass_7.anInt1684 = i_1;
            choppyitemfixclass_7.anInt1700 = i_2;
        }

        i_5 = anInt8980 * anInt9009 + anInt8983;

        for (int i_6 = anInt9009; i_6 < anInt8986; i_6++) {
            for (int i_9 = 0; i_9 < anInt9008; i_9++) {
                aClass185Array8984[i_9].aClass144_2310.anIntArray1685[i_6 - anInt9009] = i_5;
            }

            i_5 += anInt8980;
        }

    }

    @Override
    public NativeSprite method8442(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        boolean bool_7 = false;
        int i_8 = i_2;

        for (int i_9 = 0; i_9 < i_5; i_9++) {
            for (int i_10 = 0; i_10 < i_4; i_10++) {
                int i_11 = ints_1[i_8++] >>> 24;
                if (i_11 != 0 && i_11 != 255) {
                    bool_7 = true;
                    return bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6);
                }
            }
        }

        return bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6);
    }

    @Override
    public FontRenderer createFont(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
        int[] ints_4 = new int[arr_2.length];
        int[] ints_5 = new int[arr_2.length];
        boolean bool_6 = false;

        for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
            ints_4[i_7] = arr_2[i_7].width;
            ints_5[i_7] = arr_2[i_7].height;
            if (arr_2[i_7].alpha != null) {
                bool_6 = true;
            }
        }

        if (bool_3) {
            if (bool_6) {
                return new FontRenderer_Sub2(this, fontmetrics_1, arr_2, ints_4, ints_5);
            } else {
                return new FontRenderer_Sub1(this, fontmetrics_1, arr_2, ints_4, ints_5);
            }
        } else if (bool_6) {
            throw new IllegalArgumentException("");
        } else {
            return new FontRenderer_Sub3(this, fontmetrics_1, arr_2, ints_4, ints_5);
        }
    }

    @Override
    public void o(int i_1, int i_2, int i_3, int i_4) {
        if (anInt8983 < i_1) {
            anInt8983 = i_1;
        }

        if (anInt9009 < i_2) {
            anInt9009 = i_2;
        }

        if (anInt9002 > i_3) {
            anInt9002 = i_3;
        }

        if (anInt8986 > i_4) {
            anInt8986 = i_4;
        }

        method14364();
    }

    @Override
    void method8531() {
        if (aBool9012) {
            Class13.method508(true, false);
            aBool9012 = false;
        }

        aBool9014 = true;
    }

    @Override
    public NativeSprite method8548(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        boolean bool_7 = false;
        int i_8 = i_2;

        for (int i_9 = 0; i_9 < i_5; i_9++) {
            for (int i_10 = 0; i_10 < i_4; i_10++) {
                int i_11 = ints_1[i_8++] >>> 24;
                if (i_11 != 0 && i_11 != 255) {
                    bool_7 = true;
                    return bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6);
                }
            }
        }

        return bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6);
    }

    @Override
    public void B(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_21 = i_2;
        int i_41 = i_4;
        int i_31 = i_3;
        int i_15 = i_1;
        if (anIntArray8979 != null) {
            if (i_15 < anInt8983) {
                i_31 -= anInt8983 - i_15;
                i_15 = anInt8983;
            }

            if (i_21 < anInt9009) {
                i_41 -= anInt9009 - i_21;
                i_21 = anInt9009;
            }

            if (i_31 + i_15 > anInt9002) {
                i_31 = anInt9002 - i_15;
            }

            if (i_21 + i_41 > anInt8986) {
                i_41 = anInt8986 - i_21;
            }

            if (i_31 > 0 && i_41 > 0 && i_15 <= anInt9002 && i_21 <= anInt8986) {
                int i_7 = anInt8980 - i_31;
                int i_8 = i_21 * anInt8980 + i_15;
                int i_9 = i_5 >>> 24;
                int i_10;
                int i_11;
                int i_12;
                if (i_6 != 0 && (i_6 != 1 || i_9 != 255)) {
                    int i_13;
                    if (i_6 == 1) {
                        i_5 = (i_9 * ((i_5 & -16711936) >>> 8) & -16711936) + (i_9 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);
                        i_10 = 256 - i_9;

                        for (i_11 = 0; i_11 < i_41; i_11++) {
                            for (i_12 = -i_31; i_12 < 0; i_12++) {
                                i_13 = anIntArray8979[i_8];
                                i_13 = (((i_13 & -16711936) >>> 8) * i_10 & -16711936) + ((i_13 & 0xff00ff) * i_10 >> 8 & 0xff00ff);
                                anIntArray8979[i_8++] = i_5 + i_13;
                            }

                            i_8 += i_7;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        for (i_10 = 0; i_10 < i_41; i_10++) {
                            for (i_11 = -i_31; i_11 < 0; i_11++) {
                                i_12 = anIntArray8979[i_8];
                                i_13 = i_5 + i_12;
                                int i_14 = (i_12 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_12 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
                                anIntArray8979[i_8++] = i_13 - i_12 | i_12 - (i_12 >>> 8);
                            }

                            i_8 += i_7;
                        }
                    }
                } else {
                    i_10 = i_31 >> 3;
                    i_11 = i_31 & 0x7;
                    i_31 = i_8 - 1;

                    for (i_12 = -i_41; i_12 < 0; i_12++) {
                        if (i_10 > 0) {
                            i_15 = i_10;

                            do {
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                --i_15;
                            } while (i_15 > 0);
                        }

                        if (i_11 > 0) {
                            i_15 = i_11;

                            do {
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                --i_15;
                            } while (i_15 > 0);
                        }

                        i_31 += i_7;
                    }
                }
            }
        }

    }

    @Override
    public void N(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
        if (anIntArray8979 != null && i_3 > 0 && i_4 > 0) {
            int i_10 = 0;
            int i_11 = 0;
            int i_12 = (i_8 << 16) / i_3;
            int i_13 = (bytes_7.length / i_8 << 16) / i_4;
            int i_14 = i_2 * anInt8980 + i_1;
            int i_15 = anInt8980 - i_3;
            if (i_2 + i_4 > anInt8986) {
                i_4 -= i_2 + i_4 - anInt8986;
            }

            int i_16;
            if (i_2 < anInt9009) {
                i_16 = anInt9009 - i_2;
                i_4 -= i_16;
                i_14 += i_16 * anInt8980;
                i_11 += i_16 * i_13;
            }

            if (i_3 + i_1 > anInt9002) {
                i_16 = i_3 + i_1 - anInt9002;
                i_3 -= i_16;
                i_15 += i_16;
            }

            if (i_1 < anInt8983) {
                i_16 = anInt8983 - i_1;
                i_3 -= i_16;
                i_14 += i_16;
                i_10 += i_16 * i_12;
                i_15 += i_16;
            }

            i_16 = i_5 >>> 24;
            int i_17 = i_6 >>> 24;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            if (i_9 == 0 || i_9 == 1 && i_16 == 255 && i_17 == 255) {
                i_18 = i_10;

                for (i_19 = -i_4; i_19 < 0; i_19++) {
                    i_20 = i_8 * (i_11 >> 16);

                    for (i_21 = -i_3; i_21 < 0; i_21++) {
                        if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
                            anIntArray8979[i_14++] = i_6;
                        } else {
                            anIntArray8979[i_14++] = i_5;
                        }

                        i_10 += i_12;
                    }

                    i_11 += i_13;
                    i_10 = i_18;
                    i_14 += i_15;
                }
            } else {
                int i_22;
                int i_23;
                int i_24;
                int i_25;
                if (i_9 == 1) {
                    i_18 = i_10;

                    for (i_19 = -i_4; i_19 < 0; i_19++) {
                        i_20 = i_8 * (i_11 >> 16);

                        for (i_21 = -i_3; i_21 < 0; i_21++) {
                            i_22 = i_5;
                            if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
                                i_22 = i_6;
                            }

                            i_23 = i_22 >>> 24;
                            i_24 = 255 - i_23;
                            i_25 = anIntArray8979[i_14];
                            anIntArray8979[i_14++] = (i_24 * (i_25 & 0xff00) + i_23 * (i_22 & 0xff00) & 0xff0000) + ((i_25 & 0xff00ff) * i_24 + (i_22 & 0xff00ff) * i_23 & -16711936) >> 8;
                            i_10 += i_12;
                        }

                        i_11 += i_13;
                        i_10 = i_18;
                        i_14 += i_15;
                    }
                } else {
                    if (i_9 != 2) {
                        throw new IllegalArgumentException();
                    }

                    i_18 = i_10;

                    for (i_19 = -i_4; i_19 < 0; i_19++) {
                        i_20 = i_8 * (i_11 >> 16);

                        for (i_21 = -i_3; i_21 < 0; i_21++) {
                            i_22 = i_5;
                            if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
                                i_22 = i_6;
                            }

                            if (i_22 != 0) {
                                i_23 = anIntArray8979[i_14];
                                i_24 = i_22 + i_23;
                                i_25 = (i_23 & 0xff00ff) + (i_22 & 0xff00ff);
                                i_23 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
                                anIntArray8979[i_14++] = i_24 - i_23 | i_23 - (i_23 >>> 8);
                            } else {
                                ++i_14;
                            }

                            i_10 += i_12;
                        }

                        i_11 += i_13;
                        i_10 = i_18;
                        i_14 += i_15;
                    }
                }
            }
        }

    }

    @Override
    void CA(int i_1, int i_2, int i_3, int i_4) {
        int i_22 = i_2;
        if (anIntArray8979 != null) {
            if (i_3 < 0) {
                i_3 = -i_3;
            }

            int i_6 = i_22 - i_3;
            if (i_6 < anInt9009) {
                i_6 = anInt9009;
            }

            int i_7 = i_3 + i_22 + 1;
            if (i_7 > anInt8986) {
                i_7 = anInt8986;
            }

            int i_8 = i_6;
            int i_9 = i_3 * i_3;
            int i_10 = 0;
            int i_11 = i_22 - i_6;
            int i_12 = i_11 * i_11;
            int i_13 = i_12 - i_11;
            if (i_22 > i_7) {
                i_22 = i_7;
            }

            int i_14 = i_4 >>> 24;
            int i_15;
            int i_16;
            int i_17;
            int i_18;
            if ((false || i_14 != 255)) {
                int i_19;
                int i_20;
                if (true) {
                    i_4 = (i_14 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_14 << 24);

                    for (i_15 = 256 - i_14; i_8 < i_22; i_13 -= i_11 + i_11) {
                        while (i_13 <= i_9 || i_12 <= i_9) {
                            i_12 += i_10 + i_10;
                            i_13 += i_10++ + i_10;
                        }

                        i_16 = i_1 - i_10 + 1;
                        if (i_16 < anInt8983) {
                            i_16 = anInt8983;
                        }

                        i_17 = i_10 + i_1;
                        if (i_17 > anInt9002) {
                            i_17 = anInt9002;
                        }

                        i_18 = i_16 + i_8 * anInt8980;

                        for (i_19 = i_16; i_19 < i_17; i_19++) {
                            i_20 = anIntArray8979[i_18];
                            i_20 = ((i_20 & 0xff00ff) * i_15 >> 8 & 0xff00ff) + (i_15 * (i_20 & 0xff00) >> 8 & 0xff00);
                            anIntArray8979[i_18++] = i_20 + i_4;
                        }

                        ++i_8;
                        i_12 -= i_11-- + i_11;
                    }

                    i_10 = i_3;
                    i_11 = -i_11;
                    i_13 = i_9 + i_11 * i_11;
                    i_12 = i_13 - i_3;

                    for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
                        while (i_13 > i_9 && i_12 > i_9) {
                            i_13 -= i_10-- + i_10;
                            i_12 -= i_10 + i_10;
                        }

                        i_16 = i_1 - i_10;
                        if (i_16 < anInt8983) {
                            i_16 = anInt8983;
                        }

                        i_17 = i_10 + i_1;
                        if (i_17 > anInt9002 - 1) {
                            i_17 = anInt9002 - 1;
                        }

                        i_18 = i_16 + i_8 * anInt8980;

                        for (i_19 = i_16; i_19 <= i_17; i_19++) {
                            i_20 = anIntArray8979[i_18];
                            i_20 = (i_15 * (i_20 & 0xff00) >> 8 & 0xff00) + ((i_20 & 0xff00ff) * i_15 >> 8 & 0xff00ff);
                            anIntArray8979[i_18++] = i_20 + i_4;
                        }

                        ++i_8;
                        i_13 += i_11 + i_11;
                    }
                } else {
                    if (true) {
                        throw new IllegalArgumentException();
                    }

                    int i_21;
                    while (i_8 < i_22) {
                        while (i_13 <= i_9 || i_12 <= i_9) {
                            i_12 += i_10 + i_10;
                            i_13 += i_10++ + i_10;
                        }

                        i_15 = i_1 - i_10 + 1;
                        if (i_15 < anInt8983) {
                            i_15 = anInt8983;
                        }

                        i_16 = i_10 + i_1;
                        if (i_16 > anInt9002) {
                            i_16 = anInt9002;
                        }

                        i_17 = i_15 + i_8 * anInt8980;

                        for (i_18 = i_15; i_18 < i_16; i_18++) {
                            i_19 = anIntArray8979[i_17];
                            i_20 = i_19 + i_4;
                            i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
                            i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
                            anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
                        }

                        ++i_8;
                        i_12 -= i_11-- + i_11;
                        i_13 -= i_11 + i_11;
                    }

                    i_10 = i_3;
                    i_11 = -i_11;
                    i_13 = i_9 + i_11 * i_11;
                    i_12 = i_13 - i_3;

                    for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
                        while (i_13 > i_9 && i_12 > i_9) {
                            i_13 -= i_10-- + i_10;
                            i_12 -= i_10 + i_10;
                        }

                        i_15 = i_1 - i_10;
                        if (i_15 < anInt8983) {
                            i_15 = anInt8983;
                        }

                        i_16 = i_10 + i_1;
                        if (i_16 > anInt9002 - 1) {
                            i_16 = anInt9002 - 1;
                        }

                        i_17 = i_15 + i_8 * anInt8980;

                        for (i_18 = i_15; i_18 <= i_16; i_18++) {
                            i_19 = anIntArray8979[i_17];
                            i_20 = i_19 + i_4;
                            i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
                            i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
                            anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
                        }

                        ++i_8;
                        i_13 += i_11 + i_11;
                    }
                }
            } else {
                while (i_8 < i_22) {
                    while (i_13 <= i_9 || i_12 <= i_9) {
                        i_12 += i_10 + i_10;
                        i_13 += i_10++ + i_10;
                    }

                    i_15 = i_1 - i_10 + 1;
                    if (i_15 < anInt8983) {
                        i_15 = anInt8983;
                    }

                    i_16 = i_10 + i_1;
                    if (i_16 > anInt9002) {
                        i_16 = anInt9002;
                    }

                    i_17 = i_15 + i_8 * anInt8980;

                    for (i_18 = i_15; i_18 < i_16; i_18++) {
                        anIntArray8979[i_17++] = i_4;
                    }

                    ++i_8;
                    i_12 -= i_11-- + i_11;
                    i_13 -= i_11 + i_11;
                }

                i_10 = i_3;
                i_11 = i_8 - i_22;
                i_13 = i_9 + i_11 * i_11;
                i_12 = i_13 - i_3;

                for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
                    while (i_13 > i_9 && i_12 > i_9) {
                        i_13 -= i_10-- + i_10;
                        i_12 -= i_10 + i_10;
                    }

                    i_15 = i_1 - i_10;
                    if (i_15 < anInt8983) {
                        i_15 = anInt8983;
                    }

                    i_16 = i_10 + i_1;
                    if (i_16 > anInt9002 - 1) {
                        i_16 = anInt9002 - 1;
                    }

                    i_17 = i_15 + i_8 * anInt8980;

                    for (i_18 = i_15; i_18 <= i_16; i_18++) {
                        anIntArray8979[i_17++] = i_4;
                    }

                    ++i_8;
                    i_13 += i_11 + i_11;
                }

                return;
            }
        }

    }

    @Override
    public void XA(int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_12 = i_1;
        int i_31 = i_3;
        if (anIntArray8979 != null && i_2 >= anInt9009 && i_2 < anInt8986) {
            if (i_12 < anInt8983) {
                i_31 -= anInt8983 - i_12;
                i_12 = anInt8983;
            }

            if (i_31 + i_12 > anInt9002) {
                i_31 = anInt9002 - i_12;
            }

            int i_6 = i_2 * anInt8980 + i_12;
            int i_7 = i_4 >>> 24;
            int i_8;
            if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
                for (i_8 = 0; i_8 < i_31; i_8++) {
                    anIntArray8979[i_6 + i_8] = i_4;
                }
            } else {
                int i_9;
                int i_10;
                if (i_5 == 1) {
                    i_4 = (i_7 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_7 << 24) + (i_7 * (i_4 & 0xff00) >> 8 & 0xff00);
                    i_8 = 256 - i_7;

                    for (i_9 = 0; i_9 < i_31; i_9++) {
                        i_10 = anIntArray8979[i_9 + i_6];
                        i_10 = ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + (i_8 * (i_10 & 0xff00) >> 8 & 0xff00);
                        anIntArray8979[i_9 + i_6] = i_10 + i_4;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (i_8 = 0; i_8 < i_31; i_8++) {
                        i_9 = anIntArray8979[i_6 + i_8];
                        i_10 = i_9 + i_4;
                        int i_11 = (i_9 & 0xff00ff) + (i_4 & 0xff00ff);
                        i_9 = (i_11 & 0x1000100) + (i_10 - i_11 & 0x10000);
                        anIntArray8979[i_8 + i_6] = i_10 - i_9 | i_9 - (i_9 >>> 8);
                    }
                }
            }
        }

    }

    void method14366(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (anIntArray8979 != null && i_2 >= anInt9009 && i_2 < anInt8986) {
            int i_9 = i_2 * anInt8980 + i_1;
            int i_10 = i_4 >>> 24;
            int i_11 = i_7 + i_6;
            int i_12 = i_8 % i_11;
            int i_13;
            if (i_5 == 0 || i_5 == 1 && i_10 == 255) {
                for (i_13 = 0; i_13 < i_3; i_12 %= i_11) {
                    if (i_13 + i_1 >= anInt8983 && i_13 + i_1 < anInt9002 && i_12 < i_6) {
                        anIntArray8979[i_13 + i_9] = i_4;
                    }

                    ++i_13;
                    ++i_12;
                }
            } else {
                int i_14;
                int i_15;
                if (i_5 == 1) {
                    i_4 = (i_10 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_10 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_10 << 24);
                    i_13 = 256 - i_10;

                    for (i_14 = 0; i_14 < i_3; i_12 %= i_11) {
                        if (i_14 + i_1 >= anInt8983 && i_14 + i_1 < anInt9002 && i_12 < i_6) {
                            i_15 = anIntArray8979[i_14 + i_9];
                            i_15 = ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                            anIntArray8979[i_14 + i_9] = i_15 + i_4;
                        }

                        ++i_14;
                        ++i_12;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (i_13 = 0; i_13 < i_3; i_12 %= i_11) {
                        if (i_13 + i_1 >= anInt8983 && i_13 + i_1 < anInt9002 && i_12 < i_6) {
                            i_14 = anIntArray8979[i_13 + i_9];
                            i_15 = i_14 + i_4;
                            int i_16 = (i_14 & 0xff00ff) + (i_4 & 0xff00ff);
                            i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
                            anIntArray8979[i_9 + i_13] = i_15 - i_14 | i_14 - (i_14 >>> 8);
                        }

                        ++i_13;
                        ++i_12;
                    }
                }
            }
        }

    }

    @Override
    public void qa(int[] ints_1) {
        ints_1[0] = anInt8983;
        ints_1[1] = anInt9009;
        ints_1[2] = anInt9002;
        ints_1[3] = anInt8986;
    }

    @Override
    public void method8519(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        XA(i_1, i_2, i_3, i_5, i_6);
        XA(i_1, i_4 + i_2 - 1, i_3, i_5, i_6);
        G(i_1, i_2 + 1, i_4 - 2, i_5, i_6);
        G(i_1 + i_3 - 1, 1 + i_2, i_4 - 2, i_5, i_6);
    }

    @Override
    public void method8433(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_14 = i_1;
        int i_31 = i_3;
        int i_21 = i_2;
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            i_31 -= i_14;
            i_41 -= i_21;
            if (i_41 == 0) {
                if (i_31 >= 0) {
                    XA(i_14, i_21, i_31 + 1, i_5, i_6);
                } else {
                    XA(i_31 + i_14, i_21, -i_31 + 1, i_5, i_6);
                }
            } else if (i_31 == 0) {
                if (i_41 >= 0) {
                    G(i_14, i_21, i_41 + 1, i_5, i_6);
                } else {
                    G(i_14, i_21 + i_41, -i_41 + 1, i_5, i_6);
                }
            } else {
                if (i_31 + i_41 < 0) {
                    i_14 += i_31;
                    i_31 = -i_31;
                    i_21 += i_41;
                    i_41 = -i_41;
                }

                int i_7;
                int i_8;
                int i_9;
                int i_10;
                int i_11;
                int i_12;
                int i_13;
                if (i_31 > i_41) {
                    i_21 <<= 16;
                    i_21 += 32768;
                    i_41 <<= 16;
                    i_7 = (int) Math.floor(0.5D + (double) i_41 / i_31);
                    i_31 += i_14;
                    if (i_14 < anInt8983) {
                        i_21 += i_7 * (anInt8983 - i_14);
                        i_14 = anInt8983;
                    }

                    if (i_31 >= anInt9002) {
                        i_31 = anInt9002 - 1;
                    }

                    i_8 = i_5 >>> 24;
                    if (i_6 != 0 && (i_6 != 1 || i_8 != 255)) {
                        if (i_6 == 1) {
                            i_5 = (i_8 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_8 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_8 << 24);

                            for (i_9 = 256 - i_8; i_14 <= i_31; i_14++) {
                                i_10 = i_21 >> 16;
                                if (i_10 >= anInt9009 && i_10 < anInt8986) {
                                    i_11 = i_10 * anInt8980 + i_14;
                                    i_12 = anIntArray8979[i_11];
                                    i_12 = (i_9 * (i_12 & 0xff00) >> 8 & 0xff00) + ((i_12 & 0xff00ff) * i_9 >> 8 & 0xff00ff);
                                    anIntArray8979[i_11] = i_5 + i_12;
                                }

                                i_21 += i_7;
                            }
                        } else {
                            if (i_6 != 2) {
                                throw new IllegalArgumentException();
                            }

                            while (i_14 <= i_31) {
                                i_9 = i_21 >> 16;
                                if (i_9 >= anInt9009 && i_9 < anInt8986) {
                                    i_10 = i_9 * anInt8980 + i_14;
                                    i_11 = anIntArray8979[i_10];
                                    i_12 = i_5 + i_11;
                                    i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
                                    i_11 = (i_13 & 0x1000100) + (i_12 - i_13 & 0x10000);
                                    anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
                                }

                                i_21 += i_7;
                                ++i_14;
                            }
                        }
                    } else {
                        while (i_14 <= i_31) {
                            i_9 = i_21 >> 16;
                            if (i_9 >= anInt9009 && i_9 < anInt8986) {
                                anIntArray8979[i_9 * anInt8980 + i_14] = i_5;
                            }

                            i_21 += i_7;
                            ++i_14;
                        }
                    }
                } else {
                    i_14 <<= 16;
                    i_14 += 32768;
                    i_31 <<= 16;
                    i_7 = (int) Math.floor((double) i_31 / i_41 + 0.5D);
                    i_41 += i_21;
                    if (i_21 < anInt9009) {
                        i_14 += i_7 * (anInt9009 - i_21);
                        i_21 = anInt9009;
                    }

                    if (i_41 >= anInt8986) {
                        i_41 = anInt8986 - 1;
                    }

                    i_8 = i_5 >>> 24;
                    if (i_6 == 0 || i_6 == 1 && i_8 == 255) {
                        while (i_21 <= i_41) {
                            i_9 = i_14 >> 16;
                            if (i_9 >= anInt8983 && i_9 < anInt9002) {
                                anIntArray8979[i_21 * anInt8980 + i_9] = i_5;
                            }

                            i_14 += i_7;
                            ++i_21;
                        }
                    } else if (i_6 == 1) {
                        i_5 = (i_8 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_8 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_8 << 24);

                        for (i_9 = 256 - i_8; i_21 <= i_41; i_21++) {
                            i_10 = i_14 >> 16;
                            if (i_10 >= anInt8983 && i_10 < anInt9002) {
                                i_11 = i_21 * anInt8980 + i_10;
                                i_12 = anIntArray8979[i_11];
                                i_12 = ((i_12 & 0xff00ff) * i_9 >> 8 & 0xff00ff) + (i_9 * (i_12 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_21 * anInt8980 + i_10] = i_5 + i_12;
                            }

                            i_14 += i_7;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_21 <= i_41) {
                            i_9 = i_14 >> 16;
                            if (i_9 >= anInt8983 && i_9 < anInt9002) {
                                i_10 = i_21 * anInt8980 + i_9;
                                i_11 = anIntArray8979[i_10];
                                i_12 = i_5 + i_11;
                                i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_11 = (i_13 & 0x1000100) + (i_12 - i_13 & 0x10000);
                                anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
                            }

                            i_14 += i_7;
                            ++i_21;
                        }
                    }
                }
            }
        }

    }

    @Override
    public Matrix44 method8449() {
        Class185 class185_1 = method14370(Thread.currentThread());
        return class185_1.aClass384_2346;
    }

    @Override
    public void method8669(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9) {
        int i_11 = i_1;
        int i_31 = i_3;
        int i_24 = i_2;
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
            int[] ints_11 = packetsdecoder_10.anIntArray9077;
            int[] ints_12 = packetsdecoder_10.anIntArray9078;
            int i_13 = Math.max(anInt9009, i_9);
            int i_14 = Math.min(anInt8986, ints_11.length + i_9);
            i_31 -= i_11;
            i_41 -= i_24;
            if (i_31 + i_41 < 0) {
                i_11 += i_31;
                i_31 = -i_31;
                i_24 += i_41;
                i_41 = -i_41;
            }

            int i_15;
            int i_16;
            int i_17;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            int i_23;
            if (i_31 > i_41) {
                i_24 <<= 16;
                i_24 += 32768;
                i_41 <<= 16;
                i_15 = (int) Math.floor((double) i_41 / i_31 + 0.5D);
                i_31 += i_11;
                if (i_11 < anInt8983) {
                    i_24 += i_15 * (anInt8983 - i_11);
                    i_11 = anInt8983;
                }

                if (i_31 >= anInt9002) {
                    i_31 = anInt9002 - 1;
                }

                i_16 = i_5 >>> 24;
                if (i_16 == 255) {
                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = i_8 + ints_11[i_18];
                            if (i_11 >= i_19 && i_11 < i_19 + ints_12[i_18]) {
                                anIntArray8979[i_17 * anInt8980 + i_11] = i_5;
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                } else if (true) {
                    i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_16 << 24);

                    for (i_17 = 256 - i_16; i_11 <= i_31; i_11++) {
                        i_18 = i_24 >> 16;
                        i_19 = i_18 - i_9;
                        if (i_18 >= i_13 && i_18 < i_14) {
                            i_20 = i_8 + ints_11[i_19];
                            if (i_11 >= i_20 && i_11 < i_20 + ints_12[i_19]) {
                                i_21 = i_18 * anInt8980 + i_11;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + ((i_22 & 0xff00ff) * i_17 >> 8 & 0xff00ff);
                                anIntArray8979[i_21] = i_5 + i_22;
                            }
                        }

                        i_24 += i_15;
                    }
                } else {
                    if (true) {
                        throw new IllegalArgumentException();
                    }

                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = i_8 + ints_11[i_18];
                            if (i_11 >= i_19 && i_11 < i_19 + ints_12[i_18]) {
                                i_20 = i_17 * anInt8980 + i_11;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_5 + i_21;
                                i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                }
            } else {
                i_11 <<= 16;
                i_11 += 32768;
                i_31 <<= 16;
                i_15 = (int) Math.floor(0.5D + (double) i_31 / i_41);
                i_41 += i_24;
                if (i_24 < i_13) {
                    i_11 += (i_13 - i_24) * i_15;
                    i_24 = i_13;
                }

                if (i_41 >= i_14) {
                    i_41 = i_14 - 1;
                }

                i_16 = i_5 >>> 24;
                if ((false || i_16 != 255)) {
                    if (true) {
                        i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_16 << 24);

                        for (i_17 = 256 - i_16; i_24 <= i_41; i_24++) {
                            i_18 = i_11 >> 16;
                            i_19 = i_24 - i_9;
                            i_20 = i_8 + ints_11[i_19];
                            if (i_18 >= anInt8983 && i_18 < anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
                                i_21 = i_24 * anInt8980 + i_18;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + ((i_22 & 0xff00ff) * i_17 >> 8 & 0xff00ff);
                                anIntArray8979[i_24 * anInt8980 + i_18] = i_5 + i_22;
                            }

                            i_11 += i_15;
                        }
                    } else {
                        if (true) {
                            throw new IllegalArgumentException();
                        }

                        while (i_24 <= i_41) {
                            i_17 = i_11 >> 16;
                            i_18 = i_24 - i_9;
                            i_19 = i_8 + ints_11[i_18];
                            if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
                                i_20 = i_24 * anInt8980 + i_17;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_5 + i_21;
                                i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }

                            i_11 += i_15;
                            ++i_24;
                        }
                    }
                } else {
                    while (i_24 <= i_41) {
                        i_17 = i_11 >> 16;
                        i_18 = i_24 - i_9;
                        i_19 = i_8 + ints_11[i_18];
                        if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
                            anIntArray8979[i_24 * anInt8980 + i_17] = i_5;
                        }

                        i_11 += i_15;
                        ++i_24;
                    }
                }
            }
        }

    }

    @Override
    public void method8563(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_13 = (Class455_Sub3) class455_7;
            int[] ints_14 = packetsdecoder_13.anIntArray9077;
            int[] ints_15 = packetsdecoder_13.anIntArray9078;
            int i_16 = Math.max(anInt9009, i_9);
            int i_17 = Math.min(anInt8986, ints_14.length + i_9);
            i_12 <<= 8;
            i_10 <<= 8;
            i_11 <<= 8;
            int i_18 = i_11 + i_10;
            i_12 %= i_18;
            i_3 -= i_1;
            i_4 -= i_2;
            int i_19;
            int i_20;
            if (i_3 + i_4 < 0) {
                i_19 = (int) (Math.sqrt(i_3 * i_3 + i_4 * i_4) * 256.0D);
                i_20 = i_19 % i_18;
                i_12 = i_10 + i_18 - i_12 - i_20;
                i_12 %= i_18;
                if (i_12 < 0) {
                    i_12 += i_18;
                }

                i_1 += i_3;
                i_3 = -i_3;
                i_2 += i_4;
                i_4 = -i_4;
            }

            int i_21;
            int i_22;
            int i_23;
            int i_24;
            int i_25;
            int i_26;
            int i_27;
            if (i_3 > i_4) {
                i_2 <<= 16;
                i_2 += 32768;
                i_4 <<= 16;
                i_19 = (int) Math.floor((double) i_4 / i_3 + 0.5D);
                i_3 += i_1;
                i_20 = i_5 >>> 24;
                i_21 = (int) Math.sqrt((i_19 >> 8) * (i_19 >> 8) + 65536);
                if (i_20 == 255) {
                    while (i_1 <= i_3) {
                        i_22 = i_2 >> 16;
                        i_23 = i_22 - i_9;
                        if (i_1 >= anInt8983 && i_1 < anInt9002 && i_22 >= i_16 && i_22 < i_17 && i_12 < i_10) {
                            i_24 = i_8 + ints_14[i_23];
                            if (i_1 >= i_24 && i_1 < i_24 + ints_15[i_23]) {
                                anIntArray8979[i_22 * anInt8980 + i_1] = i_5;
                            }
                        }

                        i_2 += i_19;
                        ++i_1;
                        i_12 += i_21;
                        i_12 %= i_18;
                    }
                } else if (true) {
                    i_5 = (i_20 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_20 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_20 << 24);

                    for (i_22 = 256 - i_20; i_1 <= i_3; i_12 %= i_18) {
                        i_23 = i_2 >> 16;
                        i_24 = i_23 - i_9;
                        if (i_1 >= anInt8983 && i_1 < anInt9002 && i_23 >= i_16 && i_23 < i_17 && i_12 < i_10) {
                            i_25 = i_8 + ints_14[i_24];
                            if (i_1 >= i_25 && i_1 < i_25 + ints_15[i_24]) {
                                i_26 = i_23 * anInt8980 + i_1;
                                i_27 = anIntArray8979[i_26];
                                i_27 = (i_22 * (i_27 & 0xff00) >> 8 & 0xff00) + ((i_27 & 0xff00ff) * i_22 >> 8 & 0xff00ff);
                                anIntArray8979[i_26] = i_5 + i_27;
                            }
                        }

                        i_2 += i_19;
                        ++i_1;
                        i_12 += i_21;
                    }
                } else {
                    if (true) {
                        throw new IllegalArgumentException();
                    }

                    while (i_1 <= i_3) {
                        i_22 = i_2 >> 16;
                        i_23 = i_22 - i_9;
                        if (i_1 >= anInt8983 && i_1 < anInt9002 && i_22 >= i_16 && i_22 < i_17 && i_12 < i_10) {
                            i_24 = i_8 + ints_14[i_23];
                            if (i_1 >= i_24 && i_1 < i_24 + ints_15[i_23]) {
                                i_25 = i_22 * anInt8980 + i_1;
                                i_26 = anIntArray8979[i_25];
                                i_27 = i_5 + i_26;
                                int i_28 = (i_26 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_26 = (i_28 & 0x1000100) + (i_27 - i_28 & 0x10000);
                                anIntArray8979[i_25] = i_27 - i_26 | i_26 - (i_26 >>> 8);
                            }
                        }

                        i_2 += i_19;
                        ++i_1;
                        i_12 += i_21;
                        i_12 %= i_18;
                    }
                }
            } else {
                i_1 <<= 16;
                i_1 += 32768;
                i_3 <<= 16;
                i_19 = (int) Math.floor(0.5D + (double) i_3 / i_4);
                i_20 = (int) Math.sqrt((i_19 >> 8) * (i_19 >> 8) + 65536);
                i_4 += i_2;
                i_21 = i_5 >>> 24;
                if (i_21 == 255) {
                    while (i_2 <= i_4) {
                        i_22 = i_1 >> 16;
                        i_23 = i_2 - i_9;
                        if (i_2 >= i_16 && i_2 < i_17 && i_22 >= anInt8983 && i_22 < anInt9002 && i_12 < i_10 && i_22 >= i_8 + ints_14[i_23] && i_22 < i_8 + ints_14[i_23] + ints_15[i_23]) {
                            anIntArray8979[i_2 * anInt8980 + i_22] = i_5;
                        }

                        i_1 += i_19;
                        ++i_2;
                        i_12 += i_20;
                        i_12 %= i_18;
                    }
                } else if (true) {
                    i_5 = (i_21 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_21 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_21 << 24);

                    for (i_22 = 256 - i_21; i_2 <= i_4; i_12 %= i_18) {
                        i_23 = i_1 >> 16;
                        i_24 = i_2 - i_9;
                        if (i_2 >= i_16 && i_2 < i_17 && i_23 >= anInt8983 && i_23 < anInt9002 && i_12 < i_10 && i_23 >= i_8 + ints_14[i_24] && i_23 < i_8 + ints_14[i_24] + ints_15[i_24]) {
                            i_25 = i_2 * anInt8980 + i_23;
                            i_26 = anIntArray8979[i_25];
                            i_26 = (i_22 * (i_26 & 0xff00) >> 8 & 0xff00) + ((i_26 & 0xff00ff) * i_22 >> 8 & 0xff00ff);
                            anIntArray8979[i_2 * anInt8980 + i_23] = i_5 + i_26;
                        }

                        i_1 += i_19;
                        ++i_2;
                        i_12 += i_20;
                    }
                } else {
                    if (true) {
                        throw new IllegalArgumentException();
                    }

                    while (i_2 <= i_4) {
                        i_22 = i_1 >> 16;
                        i_23 = i_2 - i_9;
                        if (i_2 >= i_16 && i_2 < i_17 && i_22 >= anInt8983 && i_22 < anInt9002 && i_12 < i_10 && i_22 >= i_8 + ints_14[i_23] && i_22 < i_8 + ints_15[i_23] + ints_14[i_23]) {
                            i_24 = i_2 * anInt8980 + i_22;
                            i_25 = anIntArray8979[i_24];
                            i_26 = i_5 + i_25;
                            i_27 = (i_25 & 0xff00ff) + (i_5 & 0xff00ff);
                            i_25 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
                            anIntArray8979[i_24] = i_26 - i_25 | i_25 - (i_25 >>> 8);
                        }

                        i_1 += i_19;
                        ++i_2;
                        i_12 += i_20;
                        i_12 %= i_18;
                    }
                }
            }
        }

    }

    @Override
    public void method8516(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
        boolean bool_14 = anIntArray8979 != null;
        boolean bool_15 = aFloatArray9010 != null;
        if (bool_14 || bool_15) {
            Class185 class185_16 = method14370(Thread.currentThread());
            ChoppyItemFixClass choppyitemfixclass_17 = class185_16.aClass144_2310;
            choppyitemfixclass_17.aBool1675 = false;
            i_1 -= anInt8983;
            i_4 -= anInt8983;
            i_7 -= anInt8983;
            i_2 -= anInt9009;
            i_5 -= anInt9009;
            i_8 -= anInt9009;
            choppyitemfixclass_17.aBool1708 = i_1 < 0 || i_1 > choppyitemfixclass_17.anInt1684 || i_4 < 0 || i_4 > choppyitemfixclass_17.anInt1684 || i_7 < 0 || i_7 > choppyitemfixclass_17.anInt1684;
            int i_18 = i_10 >>> 24;
            if (i_13 == 0 || i_13 == 1 && i_18 == 255) {
                choppyitemfixclass_17.anInt1674 = 0;
                choppyitemfixclass_17.aBool1672 = false;
                choppyitemfixclass_17.method2425(bool_14, bool_15, false, i_2, i_5, i_8, i_1, i_4, i_7, f_3, f_6, f_9, i_10, i_11, i_12);
            } else if (i_13 == 1) {
                choppyitemfixclass_17.anInt1674 = 255 - i_18;
                choppyitemfixclass_17.aBool1672 = false;
                choppyitemfixclass_17.method2425(bool_14, bool_15, false, i_2, i_5, i_8, i_1, i_4, i_7, f_3, f_6, f_9, i_10, i_11, i_12);
            } else {
                if (i_13 != 2) {
                    throw new IllegalArgumentException();
                }

                choppyitemfixclass_17.anInt1674 = 128;
                choppyitemfixclass_17.aBool1672 = true;
                choppyitemfixclass_17.method2425(bool_14, bool_15, false, i_2, i_5, i_8, i_1, i_4, i_7, f_3, f_6, f_9, i_10, i_11, i_12);
            }

            choppyitemfixclass_17.aBool1675 = true;
        }

    }

    @Override
    public int method8437(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = i_3 * aClass384_8996.buf[10] + i_2 * aClass384_8996.buf[6] + aClass384_8996.buf[14] + i_1 * aClass384_8996.buf[2];
        float f_9 = aClass384_8996.buf[6] * i_5 + aClass384_8996.buf[14] + aClass384_8996.buf[2] * i_4 + aClass384_8996.buf[10] * i_6;
        float f_10 = aClass384_8996.buf[15] + i_1 * aClass384_8996.buf[3] + i_2 * aClass384_8996.buf[7] + i_3 * aClass384_8996.buf[11];
        float f_11 = i_5 * aClass384_8996.buf[7] + aClass384_8996.buf[15] + aClass384_8996.buf[3] * i_4 + i_6 * aClass384_8996.buf[11];
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8996.buf[4] * i_2 + aClass384_8996.buf[12] + i_1 * aClass384_8996.buf[0] + i_3 * aClass384_8996.buf[8];
        float f_13 = i_6 * aClass384_8996.buf[8] + i_4 * aClass384_8996.buf[0] + aClass384_8996.buf[12] + aClass384_8996.buf[4] * i_5;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8996.buf[5] * i_2 + i_1 * aClass384_8996.buf[1] + aClass384_8996.buf[13] + aClass384_8996.buf[9] * i_3;
        float f_15 = aClass384_8996.buf[13] + aClass384_8996.buf[1] * i_4 + aClass384_8996.buf[5] * i_5 + i_6 * aClass384_8996.buf[9];
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public void method8532(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
        int i_11 = i_1;
        int i_31 = i_3;
        int i_24 = i_2;
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
            int[] ints_11 = packetsdecoder_10.anIntArray9077;
            int[] ints_12 = packetsdecoder_10.anIntArray9078;
            int i_13 = Math.max(anInt9009, i_9);
            int i_14 = Math.min(anInt8986, i_9 + ints_11.length);
            i_31 -= i_11;
            i_41 -= i_24;
            if (i_41 + i_31 < 0) {
                i_11 += i_31;
                i_31 = -i_31;
                i_24 += i_41;
                i_41 = -i_41;
            }

            int i_15;
            int i_16;
            int i_17;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            int i_23;
            if (i_31 > i_41) {
                i_24 <<= 16;
                i_24 += 32768;
                i_41 <<= 16;
                i_15 = (int) Math.floor((double) i_41 / i_31 + 0.5D);
                i_31 += i_11;
                if (i_11 < anInt8983) {
                    i_24 += (anInt8983 - i_11) * i_15;
                    i_11 = anInt8983;
                }

                if (i_31 >= anInt9002) {
                    i_31 = anInt9002 - 1;
                }

                i_16 = i_5 >>> 24;
                if (i_6 == 0 || i_6 == 1 && i_16 == 255) {
                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = ints_11[i_18] + i_8;
                            if (i_11 >= i_19 && i_11 < ints_12[i_18] + i_19) {
                                anIntArray8979[i_17 * anInt8980 + i_11] = i_5;
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                } else if (i_6 == 1) {
                    i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_16 >> 8 & 0xff00) + (i_16 << 24);

                    for (i_17 = 256 - i_16; i_11 <= i_31; i_11++) {
                        i_18 = i_24 >> 16;
                        i_19 = i_18 - i_9;
                        if (i_18 >= i_13 && i_18 < i_14) {
                            i_20 = ints_11[i_19] + i_8;
                            if (i_11 >= i_20 && i_11 < i_20 + ints_12[i_19]) {
                                i_21 = i_11 + anInt8980 * i_18;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff);
                                anIntArray8979[i_21] = i_5 + i_22;
                            }
                        }

                        i_24 += i_15;
                    }
                } else {
                    if (i_6 != 2) {
                        throw new IllegalArgumentException();
                    }

                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = i_8 + ints_11[i_18];
                            if (i_11 >= i_19 && i_11 < ints_12[i_18] + i_19) {
                                i_20 = i_17 * anInt8980 + i_11;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_21 + i_5;
                                i_23 = (i_5 & 0xff00ff) + (i_21 & 0xff00ff);
                                i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                }
            } else {
                i_11 <<= 16;
                i_11 += 32768;
                i_31 <<= 16;
                i_15 = (int) Math.floor(0.5D + (double) i_31 / i_41);
                i_41 += i_24;
                if (i_24 < i_13) {
                    i_11 += (i_13 - i_24) * i_15;
                    i_24 = i_13;
                }

                if (i_41 >= i_14) {
                    i_41 = i_14 - 1;
                }

                i_16 = i_5 >>> 24;
                if (i_6 != 0 && (i_6 != 1 || i_16 != 255)) {
                    if (i_6 == 1) {
                        i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24);

                        for (i_17 = 256 - i_16; i_24 <= i_41; i_24++) {
                            i_18 = i_11 >> 16;
                            i_19 = i_24 - i_9;
                            i_20 = i_8 + ints_11[i_19];
                            if (i_18 >= anInt8983 && i_18 < anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
                                i_21 = i_18 + i_24 * anInt8980;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_18 + i_24 * anInt8980] = i_22 + i_5;
                            }

                            i_11 += i_15;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_24 <= i_41) {
                            i_17 = i_11 >> 16;
                            i_18 = i_24 - i_9;
                            i_19 = ints_11[i_18] + i_8;
                            if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
                                i_20 = anInt8980 * i_24 + i_17;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_5 + i_21;
                                i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_21 = (i_22 - i_23 & 0x10000) + (i_23 & 0x1000100);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }

                            i_11 += i_15;
                            ++i_24;
                        }
                    }
                } else {
                    while (i_24 <= i_41) {
                        i_17 = i_11 >> 16;
                        i_18 = i_24 - i_9;
                        i_19 = ints_11[i_18] + i_8;
                        if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < ints_12[i_18] + i_19) {
                            anIntArray8979[i_17 + anInt8980 * i_24] = i_5;
                        }

                        i_11 += i_15;
                        ++i_24;
                    }
                }
            }
        }

    }

    @Override
    public void method8439(Node_Sub1 class282_sub1_1) {
    }

    @Override
    public NativeSprite method8654(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        return bool_3 ? new NativeSprite_Sub1_Sub3(this, i_1, i_2) : new NativeSprite_Sub1_Sub1(this, i_1, i_2);
    }

    @Override
    public void method8479(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = f_3 * aClass384_8996.buf[11] + aClass384_8996.buf[7] * f_2 + f_1 * aClass384_8996.buf[3] + aClass384_8996.buf[15];
        float f_6 = f_2 * aClass384_8996.buf[4] + f_1 * aClass384_8996.buf[0] + aClass384_8996.buf[12] + aClass384_8996.buf[8] * f_3;
        float f_7 = f_2 * aClass384_8996.buf[5] + f_1 * aClass384_8996.buf[1] + aClass384_8996.buf[13] + f_3 * aClass384_8996.buf[9];
        float f_8 = f_3 * aClass384_8994.buf[10] + aClass384_8994.buf[6] * f_2 + f_1 * aClass384_8994.buf[2] + aClass384_8994.buf[14];
        floats_4[0] = aFloat9003 + f_6 * aFloat8976 / f_5;
        floats_4[1] = aFloat8982 + f_7 * aFloat9004 / f_5;
        floats_4[2] = f_8;
    }

    @Override
    public NativeSprite method8668(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        if (anIntArray8979 == null) {
            throw new IllegalStateException("");
        } else {
            int[] ints_6 = new int[i_3 * i_4];
            int i_7 = i_2 * anInt8980 + i_1;
            int i_8 = anInt8980 - i_3;

            for (int i_9 = 0; i_9 < i_4; i_9++) {
                int i_10 = i_3 * i_9;

                for (int i_11 = 0; i_11 < i_3; i_11++) {
                    ints_6[i_10 + i_11] = anIntArray8979[i_7++];
                }

                i_7 += i_8;
            }

            if (bool_5) {
                return new NativeSprite_Sub1_Sub3(this, ints_6, i_3, i_4);
            } else {
                return new NativeSprite_Sub1_Sub1(this, ints_6, i_3, i_4);
            }
        }
    }

    @Override
    public Class455 method8624(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new Class455_Sub3(ints_3, ints_4);
    }

    @Override
    public void en(float f_1, float f_2) {
        aFloat8978 = f_2 - f_1;
        aFloat8985 = f_2 + f_1 - 1.0F;

        for (int i_3 = 0; i_3 < anInt9008; i_3++) {
            Class185 class185_4 = aClass185Array8984[i_3];
            ChoppyItemFixClass choppyitemfixclass_5 = class185_4.aClass144_2310;
            choppyitemfixclass_5.aFloat1683 = aFloat8978;
            choppyitemfixclass_5.aFloat1682 = aFloat8985;
        }

    }

    @Override
    public void method8446(Matrix44 matrix44_1) {
        aClass384_8995.method6562(matrix44_1);
        method14374();
    }

    @Override
    public void GA() {
        aFloat8978 = 1.0f;
        aFloat8985 = 0.0f;

        for (int i_3 = 0; i_3 < anInt9008; i_3++) {
            Class185 class185_4 = aClass185Array8984[i_3];
            ChoppyItemFixClass choppyitemfixclass_5 = class185_4.aClass144_2310;
            choppyitemfixclass_5.aFloat1683 = aFloat8978;
            choppyitemfixclass_5.aFloat1682 = aFloat8985;
        }

    }

    @Override
    public MeshRasterizer createMeshRasterizer(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    public int method8546(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public Ground createGround(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_6, int i_7) {
        return new Ground_Sub3(this, i_7, i_1, i_2, ints_3, ints_4, 512);
    }

    @Override
    public void method8634() {
        anInt8998 = 0;
        anInt8999 = 0;
        anInt9000 = anInt8980;
        anInt9001 = anInt8981;
        method14364();
    }

    @Override
    public Matrix44Var method8450() {
        Class185 class185_1 = method14370(Thread.currentThread());
        return class185_1.aClass294_2314;
    }

    @Override
    public boolean method8471() {
        return false;
    }

    @Override
    public void iw(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
        anInt8990 = (int) (65535.0F * f_2);
        anInt8991 = (int) (65535.0F * f_3);
        float f_7 = (float) Math.sqrt(f_6 * f_6 + f_5 * f_5 + f_4 * f_4);
        anInt9011 = (int) (f_4 * 65535.0F / f_7);
        anInt8988 = (int) (65535.0F * f_5 / f_7);
        anInt9007 = (int) (f_6 * 65535.0F / f_7);
    }

    @Override
    public void method8547(int i_1, GLLight[] arr_2) {
    }

    @Override
    public void method8535(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_13 = (Class455_Sub3) class455_7;
            int[] ints_14 = packetsdecoder_13.anIntArray9077;
            int[] ints_15 = packetsdecoder_13.anIntArray9078;
            int i_16 = Math.max(anInt9009, i_9);
            int i_17 = Math.min(anInt8986, i_9 + ints_14.length);
            i_12 <<= 8;
            i_10 <<= 8;
            i_11 <<= 8;
            int i_18 = i_11 + i_10;
            i_12 %= i_18;
            i_3 -= i_1;
            i_4 -= i_2;
            int i_19;
            int i_20;
            if (i_3 + i_4 < 0) {
                i_19 = (int) (Math.sqrt(i_4 * i_4 + i_3 * i_3) * 256.0D);
                i_20 = i_19 % i_18;
                i_12 = i_10 + i_18 - i_12 - i_20;
                i_12 %= i_18;
                if (i_12 < 0) {
                    i_12 += i_18;
                }

                i_1 += i_3;
                i_3 = -i_3;
                i_2 += i_4;
                i_4 = -i_4;
            }

            int i_21;
            int i_22;
            int i_23;
            int i_24;
            int i_25;
            int i_26;
            int i_27;
            if (i_3 > i_4) {
                i_2 <<= 16;
                i_2 += 32768;
                i_4 <<= 16;
                i_19 = (int) Math.floor((double) i_4 / i_3 + 0.5D);
                i_3 += i_1;
                i_20 = i_5 >>> 24;
                i_21 = (int) Math.sqrt((i_19 >> 8) * (i_19 >> 8) + 65536);
                if (i_6 == 0 || i_6 == 1 && i_20 == 255) {
                    while (i_1 <= i_3) {
                        i_22 = i_2 >> 16;
                        i_23 = i_22 - i_9;
                        if (i_1 >= anInt8983 && i_1 < anInt9002 && i_22 >= i_16 && i_22 < i_17 && i_12 < i_10) {
                            i_24 = i_8 + ints_14[i_23];
                            if (i_1 >= i_24 && i_1 < ints_15[i_23] + i_24) {
                                anIntArray8979[i_22 * anInt8980 + i_1] = i_5;
                            }
                        }

                        i_2 += i_19;
                        ++i_1;
                        i_12 += i_21;
                        i_12 %= i_18;
                    }
                } else if (i_6 == 1) {
                    i_5 = ((i_5 & 0xff00ff) * i_20 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_20 >> 8 & 0xff00) + (i_20 << 24);

                    for (i_22 = 256 - i_20; i_1 <= i_3; i_12 %= i_18) {
                        i_23 = i_2 >> 16;
                        i_24 = i_23 - i_9;
                        if (i_1 >= anInt8983 && i_1 < anInt9002 && i_23 >= i_16 && i_23 < i_17 && i_12 < i_10) {
                            i_25 = i_8 + ints_14[i_24];
                            if (i_1 >= i_25 && i_1 < i_25 + ints_15[i_24]) {
                                i_26 = anInt8980 * i_23 + i_1;
                                i_27 = anIntArray8979[i_26];
                                i_27 = (i_22 * (i_27 & 0xff00ff) >> 8 & 0xff00ff) + (i_22 * (i_27 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_26] = i_27 + i_5;
                            }
                        }

                        i_2 += i_19;
                        ++i_1;
                        i_12 += i_21;
                    }
                } else {
                    if (i_6 != 2) {
                        throw new IllegalArgumentException();
                    }

                    while (i_1 <= i_3) {
                        i_22 = i_2 >> 16;
                        i_23 = i_22 - i_9;
                        if (i_1 >= anInt8983 && i_1 < anInt9002 && i_22 >= i_16 && i_22 < i_17 && i_12 < i_10) {
                            i_24 = i_8 + ints_14[i_23];
                            if (i_1 >= i_24 && i_1 < i_24 + ints_15[i_23]) {
                                i_25 = i_1 + i_22 * anInt8980;
                                i_26 = anIntArray8979[i_25];
                                i_27 = i_26 + i_5;
                                int i_28 = (i_26 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_26 = (i_28 & 0x1000100) + (i_27 - i_28 & 0x10000);
                                anIntArray8979[i_25] = i_27 - i_26 | i_26 - (i_26 >>> 8);
                            }
                        }

                        i_2 += i_19;
                        ++i_1;
                        i_12 += i_21;
                        i_12 %= i_18;
                    }
                }
            } else {
                i_1 <<= 16;
                i_1 += 32768;
                i_3 <<= 16;
                i_19 = (int) Math.floor(0.5D + (double) i_3 / i_4);
                i_20 = (int) Math.sqrt(65536 + (i_19 >> 8) * (i_19 >> 8));
                i_4 += i_2;
                i_21 = i_5 >>> 24;
                if (i_6 == 0 || i_6 == 1 && i_21 == 255) {
                    while (i_2 <= i_4) {
                        i_22 = i_1 >> 16;
                        i_23 = i_2 - i_9;
                        if (i_2 >= i_16 && i_2 < i_17 && i_22 >= anInt8983 && i_22 < anInt9002 && i_12 < i_10 && i_22 >= i_8 + ints_14[i_23] && i_22 < ints_14[i_23] + i_8 + ints_15[i_23]) {
                            anIntArray8979[i_2 * anInt8980 + i_22] = i_5;
                        }

                        i_1 += i_19;
                        ++i_2;
                        i_12 += i_20;
                        i_12 %= i_18;
                    }
                } else if (i_6 == 1) {
                    i_5 = (i_21 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_21 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_21 << 24);

                    for (i_22 = 256 - i_21; i_2 <= i_4; i_12 %= i_18) {
                        i_23 = i_1 >> 16;
                        i_24 = i_2 - i_9;
                        if (i_2 >= i_16 && i_2 < i_17 && i_23 >= anInt8983 && i_23 < anInt9002 && i_12 < i_10 && i_23 >= i_8 + ints_14[i_24] && i_23 < i_8 + ints_14[i_24] + ints_15[i_24]) {
                            i_25 = i_2 * anInt8980 + i_23;
                            i_26 = anIntArray8979[i_25];
                            i_26 = (i_22 * (i_26 & 0xff00) >> 8 & 0xff00) + (i_22 * (i_26 & 0xff00ff) >> 8 & 0xff00ff);
                            anIntArray8979[anInt8980 * i_2 + i_23] = i_26 + i_5;
                        }

                        i_1 += i_19;
                        ++i_2;
                        i_12 += i_20;
                    }
                } else {
                    if (i_6 != 2) {
                        throw new IllegalArgumentException();
                    }

                    while (i_2 <= i_4) {
                        i_22 = i_1 >> 16;
                        i_23 = i_2 - i_9;
                        if (i_2 >= i_16 && i_2 < i_17 && i_22 >= anInt8983 && i_22 < anInt9002 && i_12 < i_10 && i_22 >= i_8 + ints_14[i_23] && i_22 < ints_15[i_23] + ints_14[i_23] + i_8) {
                            i_24 = i_22 + i_2 * anInt8980;
                            i_25 = anIntArray8979[i_24];
                            i_26 = i_5 + i_25;
                            i_27 = (i_25 & 0xff00ff) + (i_5 & 0xff00ff);
                            i_25 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
                            anIntArray8979[i_24] = i_26 - i_25 | i_25 - (i_25 >>> 8);
                        }

                        i_1 += i_19;
                        ++i_2;
                        i_12 += i_20;
                        i_12 %= i_18;
                    }
                }
            }
        }

    }

    void method14369(int i_1) {
        anInt9008 = i_1;
        aClass185Array8984 = new Class185[anInt9008];

        for (int i_2 = 0; i_2 < anInt9008; i_2++) {
            aClass185Array8984[i_2] = new Class185(this);
        }

    }

    Class185 method14370(Runnable runnable_1) {
        for (int i_2 = 0; i_2 < anInt9008; i_2++) {
            if (runnable_1 == aClass185Array8984[i_2].aRunnable2343) {
                return aClass185Array8984[i_2];
            }
        }

        return null;
    }

    @Override
    public void method8456(Class151 class151_1) {
        method14363(anIntArray8979 != null, aFloatArray9010 != null, class151_1);
    }

    @Override
    public void method8611() {
    }

    void method14371(boolean bool_1, boolean bool_2, PointEntity class275_sub1_sub1_4, int i_5, int i_6, float f_7, int i_8) {
        int texture = class275_sub1_sub1_4.textureId;
        int i_10 = i_8;
        i_8 <<= 1;
        if (texture == -1) {
            method14373(bool_2, i_5, i_6, f_7, i_10, class275_sub1_sub1_4.color, 1);
        } else {
            if (texture != anInt9015) {
                NativeSprite nativesprite_11 = (NativeSprite) aClass229_9013.get(texture);
                if (nativesprite_11 == null) {
                    int[] ints_12 = method14359(texture);
                    if (ints_12 == null) {
                        return;
                    }

                    int i_13 = isHalfSize(texture) ? 64 : size;
                    nativesprite_11 = createNativeSprite(ints_12, i_13, i_13, i_13);
                    aClass229_9013.put(nativesprite_11, texture);
                }

                anInt9015 = texture;
                aNativeSprite_8987 = nativesprite_11;
            }

            ++i_8;
            ((NativeSprite_Sub1) aNativeSprite_8987).method14247(bool_1, bool_2, false, i_5 - i_10, i_6 - i_10, f_7, i_8, i_8, 0, class275_sub1_sub1_4.color, 1, false);
        }

    }

    void method14372(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, int i_5, float f_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
        if (i_7 != 0 && i_8 != 0) {
            if (i_9 != 65535) {
                TextureDetails class169_13 = textureCache.getTextureDetails(i_9);
                if (!class169_13.isGroundMesh) {
                    if (i_9 != anInt9015) {
                        NativeSprite nativesprite_14 = (NativeSprite) aClass229_9013.get(i_9);
                        if (nativesprite_14 == null) {
                            int[] ints_15 = method14359(i_9);
                            if (ints_15 == null) {
                                return;
                            }

                            int i_16 = isHalfSize(i_9) ? 64 : size;
                            nativesprite_14 = createNativeSprite(ints_15, i_16, i_16, i_16);
                            aClass229_9013.put(nativesprite_14, i_9);
                        }

                        anInt9015 = i_9;
                        aNativeSprite_8987 = nativesprite_14;
                    }

                    ((NativeSprite_Sub1) aNativeSprite_8987).method14247(bool_1, bool_2, bool_3, i_4 - i_7, i_5 - i_8, f_6, i_7 << 1, i_8 << 1, i_11, i_10, i_12, class169_13.blendType != 2);
                    return;
                }
            }

            method14373(bool_2, i_4, i_5, f_6, i_7, i_10, i_12);
        }

    }

    void method14373(boolean bool_1, int i_2, int i_3, float f_4, int i_5, int i_6, int i_7) {
        int i_31 = i_3;
        if (anIntArray8979 != null) {
            if (i_5 < 0) {
                i_5 = -i_5;
            }

            int i_8 = i_31 - i_5;
            if (i_8 < anInt9009) {
                i_8 = anInt9009;
            }

            int i_9 = i_31 + i_5 + 1;
            if (i_9 > anInt8986) {
                i_9 = anInt8986;
            }

            int i_10 = i_8;
            int i_11 = i_5 * i_5;
            int i_12 = 0;
            int i_13 = i_31 - i_8;
            int i_14 = i_13 * i_13;
            int i_15 = i_14 - i_13;
            if (i_31 > i_9) {
                i_31 = i_9;
            }

            int i_16 = i_6 >>> 24;
            int i_17;
            int i_18;
            int i_19;
            int i_20;
            if (i_7 != 0 && (i_7 != 1 || i_16 != 255)) {
                int i_21;
                int i_22;
                if (i_7 == 1) {
                    i_6 = ((i_6 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24) + (i_16 * (i_6 & 0xff00) >> 8 & 0xff00);

                    for (i_17 = 256 - i_16; i_10 < i_31; i_15 -= i_13 + i_13) {
                        while (i_15 <= i_11 || i_14 <= i_11) {
                            i_14 += i_12 + i_12;
                            i_15 += i_12++ + i_12;
                        }

                        i_18 = i_2 - i_12 + 1;
                        if (i_18 < anInt8983) {
                            i_18 = anInt8983;
                        }

                        i_19 = i_12 + i_2;
                        if (i_19 > anInt9002) {
                            i_19 = anInt9002;
                        }

                        i_20 = i_18 + i_10 * anInt8980;

                        for (i_21 = i_18; i_21 < i_19; i_21++) {
                            if (!bool_1 || f_4 < aFloatArray9010[i_20]) {
                                i_22 = anIntArray8979[i_20];
                                i_22 = ((i_22 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_20] = i_22 + i_6;
                            }

                            ++i_20;
                        }

                        ++i_10;
                        i_14 -= i_13-- + i_13;
                    }

                    i_12 = i_5;
                    i_13 = -i_13;
                    i_15 = i_11 + i_13 * i_13;
                    i_14 = i_15 - i_5;

                    for (i_15 -= i_13; i_10 < i_9; i_14 += i_13++ + i_13) {
                        while (i_15 > i_11 && i_14 > i_11) {
                            i_15 -= i_12-- + i_12;
                            i_14 -= i_12 + i_12;
                        }

                        i_18 = i_2 - i_12;
                        if (i_18 < anInt8983) {
                            i_18 = anInt8983;
                        }

                        i_19 = i_12 + i_2;
                        if (i_19 > anInt9002 - 1) {
                            i_19 = anInt9002 - 1;
                        }

                        i_20 = i_18 + i_10 * anInt8980;

                        for (i_21 = i_18; i_21 <= i_19; i_21++) {
                            if (!bool_1 || f_4 < aFloatArray9010[i_20]) {
                                i_22 = anIntArray8979[i_20];
                                i_22 = ((i_22 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_20] = i_22 + i_6;
                            }

                            ++i_20;
                        }

                        ++i_10;
                        i_15 += i_13 + i_13;
                    }
                } else {
                    if (i_7 != 2) {
                        throw new IllegalArgumentException();
                    }

                    int i_23;
                    while (i_10 < i_31) {
                        while (i_15 <= i_11 || i_14 <= i_11) {
                            i_14 += i_12 + i_12;
                            i_15 += i_12++ + i_12;
                        }

                        i_17 = i_2 - i_12 + 1;
                        if (i_17 < anInt8983) {
                            i_17 = anInt8983;
                        }

                        i_18 = i_12 + i_2;
                        if (i_18 > anInt9002) {
                            i_18 = anInt9002;
                        }

                        i_19 = i_17 + i_10 * anInt8980;

                        for (i_20 = i_17; i_20 < i_18; i_20++) {
                            if (!bool_1 || f_4 < aFloatArray9010[i_19]) {
                                i_21 = anIntArray8979[i_19];
                                i_22 = i_21 + i_6;
                                i_23 = (i_21 & 0xff00ff) + (i_6 & 0xff00ff);
                                i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
                                anIntArray8979[i_19] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }

                            ++i_19;
                        }

                        ++i_10;
                        i_14 -= i_13-- + i_13;
                        i_15 -= i_13 + i_13;
                    }

                    i_12 = i_5;
                    i_13 = -i_13;
                    i_15 = i_11 + i_13 * i_13;
                    i_14 = i_15 - i_5;

                    for (i_15 -= i_13; i_10 < i_9; i_14 += i_13++ + i_13) {
                        while (i_15 > i_11 && i_14 > i_11) {
                            i_15 -= i_12-- + i_12;
                            i_14 -= i_12 + i_12;
                        }

                        i_17 = i_2 - i_12;
                        if (i_17 < anInt8983) {
                            i_17 = anInt8983;
                        }

                        i_18 = i_12 + i_2;
                        if (i_18 > anInt9002 - 1) {
                            i_18 = anInt9002 - 1;
                        }

                        i_19 = i_17 + i_10 * anInt8980;

                        for (i_20 = i_17; i_20 <= i_18; i_20++) {
                            if (!bool_1 || f_4 < aFloatArray9010[i_19]) {
                                i_21 = anIntArray8979[i_19];
                                i_22 = i_21 + i_6;
                                i_23 = (i_21 & 0xff00ff) + (i_6 & 0xff00ff);
                                i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
                                anIntArray8979[i_19] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }

                            ++i_19;
                        }

                        ++i_10;
                        i_15 += i_13 + i_13;
                    }
                }
            } else {
                while (i_10 < i_31) {
                    while (i_15 <= i_11 || i_14 <= i_11) {
                        i_14 += i_12 + i_12;
                        i_15 += i_12++ + i_12;
                    }

                    i_17 = i_2 - i_12 + 1;
                    if (i_17 < anInt8983) {
                        i_17 = anInt8983;
                    }

                    i_18 = i_12 + i_2;
                    if (i_18 > anInt9002) {
                        i_18 = anInt9002;
                    }

                    i_19 = i_17 + i_10 * anInt8980;

                    for (i_20 = i_17; i_20 < i_18; i_20++) {
                        if (!bool_1 || f_4 < aFloatArray9010[i_19]) {
                            anIntArray8979[i_19] = i_6;
                        }

                        ++i_19;
                    }

                    ++i_10;
                    i_14 -= i_13-- + i_13;
                    i_15 -= i_13 + i_13;
                }

                i_12 = i_5;
                i_13 = i_10 - i_31;
                i_15 = i_11 + i_13 * i_13;
                i_14 = i_15 - i_5;

                for (i_15 -= i_13; i_10 < i_9; i_14 += i_13++ + i_13) {
                    while (i_15 > i_11 && i_14 > i_11) {
                        i_15 -= i_12-- + i_12;
                        i_14 -= i_12 + i_12;
                    }

                    i_17 = i_2 - i_12;
                    if (i_17 < anInt8983) {
                        i_17 = anInt8983;
                    }

                    i_18 = i_12 + i_2;
                    if (i_18 > anInt9002 - 1) {
                        i_18 = anInt9002 - 1;
                    }

                    i_19 = i_17 + i_10 * anInt8980;

                    for (i_20 = i_17; i_20 <= i_18; i_20++) {
                        if (!bool_1 || f_4 < aFloatArray9010[i_19]) {
                            anIntArray8979[i_19] = i_6;
                        }

                        ++i_19;
                    }

                    ++i_10;
                    i_15 += i_13 + i_13;
                }

                return;
            }
        }

    }

    @Override
    public void method8457(Matrix44Var matrix44var_1) {
        aClass294_8993 = matrix44var_1;
        method14374();
    }

    @Override
    public Matrix44Var method8458() {
        return new Matrix44Var(aClass294_8993);
    }

    @Override
    public void method8521() {
    }

    @Override
    public Matrix44 method8453() {
        return new Matrix44(aClass384_8995);
    }

    @Override
    public void m(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
        anInt8990 = (int) (65535.0F * f_2);
        anInt8991 = (int) (65535.0F * f_3);
        float f_7 = (float) Math.sqrt(f_6 * f_6 + f_5 * f_5 + f_4 * f_4);
        anInt9011 = (int) (f_4 * 65535.0F / f_7);
        anInt8988 = (int) (65535.0F * f_5 / f_7);
        anInt9007 = (int) (f_6 * 65535.0F / f_7);
    }

    @Override
    public void J() {
    }

    @Override
    public void c(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < aClass185Array8984.length; i_4++) {
            Class185 class185_5 = aClass185Array8984[i_4];
            class185_5.anInt2307 = i_1 & 0xffffff;
            int i_6 = class185_5.anInt2307 >>> 16 & 0xff;
            if (i_6 < 2) {
                i_6 = 2;
            }

            int i_7 = class185_5.anInt2307 >> 8 & 0xff;
            if (i_7 < 2) {
                i_7 = 2;
            }

            int i_8 = class185_5.anInt2307 & 0xff;
            if (i_8 < 2) {
                i_8 = 2;
            }

            class185_5.anInt2307 = i_6 << 16 | i_7 << 8 | i_8;
            class185_5.aBool2304 = i_2 >= 0;
        }

    }

    @Override
    public void method8568() {
        lowResolution = false;
        aClass229_9006.method3859();
    }

    void method14374() {
        aClass384_8994.fromVarMatrix44(aClass294_8993);
        aClass384_8996.method6562(aClass384_8994);
        aClass384_8996.method6523(aClass384_8995);
        aClass384_8996.method6539(aFloatArrayArray8989[0]);
        aClass384_8996.method6540(aFloatArrayArray8989[1]);
        aClass384_8996.method6535(aFloatArrayArray8989[2]);
        aClass384_8996.method6536(aFloatArrayArray8989[3]);
        aClass384_8996.method6613(aFloatArrayArray8989[4]);
        aClass384_8996.method6538(aFloatArrayArray8989[5]);
        float f_1 = aClass384_8995.method6587();
        float f_2 = aClass384_8995.buf[10] * (f_1 - 255.0F) + aClass384_8995.buf[14];
        float f_3 = aClass384_8995.buf[10] * f_1 + aClass384_8995.buf[14];
        float f_4 = f_3 - f_2;

        for (int i_5 = 0; i_5 < anInt9008; i_5++) {
            Class185 class185_6 = aClass185Array8984[i_5];
            class185_6.aFloat2305 = f_2;
            class185_6.aFloat2303 = f_4;
        }

    }

    @Override
    public Class152 method8466(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        return null;
    }

    @Override
    public void ik(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < aClass185Array8984.length; i_4++) {
            Class185 class185_5 = aClass185Array8984[i_4];
            class185_5.anInt2307 = (i_1 & 0xffffff);
            int i_6 = class185_5.anInt2307 >>> 16 & 0xff;
            if (i_6 < 2) {
                i_6 = 2;
            }

            int i_7 = class185_5.anInt2307 >> 8 & 0xff;
            if (i_7 < 2) {
                i_7 = 2;
            }

            int i_8 = class185_5.anInt2307 & 0xff;
            if (i_8 < 2) {
                i_8 = 2;
            }

            class185_5.anInt2307 = (i_6 << 16 | i_7 << 8 | i_8);
            class185_5.aBool2304 = i_2 >= 0;
        }

    }

    @Override
    public Matrix44 method8590() {
        return new Matrix44(aClass384_8995);
    }

    @Override
    public int method8537(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = i_3 * aClass384_8996.buf[10] + i_2 * aClass384_8996.buf[6] + aClass384_8996.buf[14] + i_1 * aClass384_8996.buf[2];
        float f_9 = aClass384_8996.buf[6] * i_5 + aClass384_8996.buf[14] + aClass384_8996.buf[2] * i_4 + aClass384_8996.buf[10] * i_6;
        float f_10 = aClass384_8996.buf[15] + i_1 * aClass384_8996.buf[3] + i_2 * aClass384_8996.buf[7] + i_3 * aClass384_8996.buf[11];
        float f_11 = i_5 * aClass384_8996.buf[7] + aClass384_8996.buf[15] + aClass384_8996.buf[3] * i_4 + i_6 * aClass384_8996.buf[11];
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8996.buf[4] * i_2 + aClass384_8996.buf[12] + i_1 * aClass384_8996.buf[0] + i_3 * aClass384_8996.buf[8];
        float f_13 = i_6 * aClass384_8996.buf[8] + i_4 * aClass384_8996.buf[0] + aClass384_8996.buf[12] + aClass384_8996.buf[4] * i_5;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8996.buf[5] * i_2 + i_1 * aClass384_8996.buf[1] + aClass384_8996.buf[13] + aClass384_8996.buf[9] * i_3;
        float f_15 = aClass384_8996.buf[13] + aClass384_8996.buf[1] * i_4 + aClass384_8996.buf[5] * i_5 + i_6 * aClass384_8996.buf[9];
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public void method8490() {
    }

    @Override
    public void fu(int i_1, int i_2) {
        if ((i_1 & 0x1) != 0) {
            B(0, 0, anInt8980, anInt8981, i_2, 0);
        }

        if ((i_1 & 0x2) != 0) {
            method14410();
        }

    }

    @Override
    public void method8525(int i_3, int i_4) {
    }

    @Override
    public boolean method8528() {
        return false;
    }

    void method14376(int i_1, int i_2, int[] ints_3, float[] floats_4) {
        anInt8980 = i_1;
        anInt8981 = i_2;
        anIntArray8979 = ints_3;
        aFloatArray9010 = floats_4;

        for (int i_5 = 0; i_5 < anInt9008; i_5++) {
            aClass185Array8984[i_5].method3071();
        }

        L();
        method8421();
    }

    @Override
    public void method8476(int i_1, HDWaterTile class90_2) {
        Class185 class185_3 = method14370(Thread.currentThread());
        class185_3.anInt2306 = i_1;
        class185_3.anInt2307 = class90_2.color;
        class185_3.anInt2313 = class90_2.scale;
    }

    @Override
    public void O() {
        for (int i_1 = 0; i_1 < aClass185Array8984.length; i_1++) {
            aClass185Array8984[i_1].anInt2307 = aClass185Array8984[i_1].anInt2336;
            aClass185Array8984[i_1].aBool2309 = false;
        }

    }

    @Override
    public void method8658() {
        boolean bool_14 = anIntArray8979 != null;
        boolean bool_15 = aFloatArray9010 != null;
        if (bool_14 || bool_15) {
            Class185 class185_16 = method14370(Thread.currentThread());
            ChoppyItemFixClass choppyitemfixclass_17 = class185_16.aClass144_2310;
            choppyitemfixclass_17.aBool1675 = false;
            choppyitemfixclass_17.aBool1708 = choppyitemfixclass_17.anInt1684 < 5 || choppyitemfixclass_17.anInt1684 < 75 || choppyitemfixclass_17.anInt1684 < 15;
            int i_18 = 255;
            if (i_18 == 255) {
                choppyitemfixclass_17.anInt1674 = 0;
            } else {
                choppyitemfixclass_17.anInt1674 = 255 - i_18;
            }
            choppyitemfixclass_17.aBool1672 = false;
            choppyitemfixclass_17.method2425(bool_14, bool_15, false, 10, 50, 90, 5, 75, 15, (float) 100.0, (float) 100.0, (float) 100.0, -65536, -65536, -65536);

            choppyitemfixclass_17.aBool1675 = true;
        }

    }

    @Override
    public Matrix44 method8587() {
        return new Matrix44(aClass384_8995);
    }

    @Override
    public void method8536(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        if (anIntArray8979 != null) {
            Class185 class185_8 = method14370(Thread.currentThread());
            ChoppyItemFixClass choppyitemfixclass_9 = class185_8.aClass144_2310;
            int i_10 = i_3 - i_1;
            int i_11 = i_4 - i_2;
            int i_12 = i_10 >= 0 ? i_10 : -i_10;
            int i_13 = i_11 >= 0 ? i_11 : -i_11;
            int i_14 = i_12;
            if (i_12 < i_13) {
                i_14 = i_13;
            }

            if (i_14 != 0) {
                int i_15 = (i_10 << 16) / i_14;
                int i_16 = (i_11 << 16) / i_14;
                i_10 += i_15 >> 16;
                i_11 += i_16 >> 16;
                if (i_16 <= i_15) {
                    i_15 = -i_15;
                } else {
                    i_16 = -i_16;
                }

                int i_17 = i_16 * i_6 >> 17;
                int i_18 = 1 + i_16 * i_6 >> 17;
                int i_19 = i_15 * i_6 >> 17;
                int i_20 = 1 + i_6 * i_15 >> 17;
                i_1 -= choppyitemfixclass_9.method2416();
                i_2 -= choppyitemfixclass_9.method2417();
                int i_21 = i_1 + i_17;
                int i_22 = i_1 - i_18;
                int i_23 = i_10 + i_1 - i_18;
                int i_24 = i_10 + i_1 + i_17;
                int i_25 = i_19 + i_2;
                int i_26 = i_2 - i_20;
                int i_27 = i_2 + i_11 - i_20;
                int i_28 = i_11 + i_2 + i_19;
                if (i_7 == 0) {
                    choppyitemfixclass_9.anInt1674 = 0;
                } else {
                    if (i_7 != 1) {
                        throw new IllegalArgumentException();
                    }

                    choppyitemfixclass_9.anInt1674 = 255 - (i_5 >>> 24);
                }

                RA(false);
                choppyitemfixclass_9.aBool1708 = i_21 < 0 || i_21 > choppyitemfixclass_9.anInt1684 || i_22 < 0 || i_22 > choppyitemfixclass_9.anInt1684 || i_23 < 0 || i_23 > choppyitemfixclass_9.anInt1684;
                choppyitemfixclass_9.method2428(true, false, false, i_25, i_26, i_27, i_21, i_22, i_23, 100.0F, 100.0F, 100.0F, i_5);
                choppyitemfixclass_9.aBool1708 = i_21 < 0 || i_21 > choppyitemfixclass_9.anInt1684 || i_23 < 0 || i_23 > choppyitemfixclass_9.anInt1684 || i_24 < 0 || i_24 > choppyitemfixclass_9.anInt1684;
                choppyitemfixclass_9.method2428(true, false, false, i_25, i_27, i_28, i_21, i_23, i_24, 100.0F, 100.0F, 100.0F, i_5);
                RA(true);
            }
        }

    }

    @Override
    public void method8459() {
        MeshRasterizer_Sub2.anInt8644 = 10000;
        MeshRasterizer_Sub2.anInt8562 = 10000;
        if (anInt9008 > 1) {
            throw new IllegalStateException();
        } else {
            method14369(anInt9008);
            method14409();
        }
    }

    @Override
    public Interface8 method8419(int i_1, int i_2) {
        return new Class125(i_1, i_2);
    }

    @Override
    public RendererInfo method8481() {
        return new RendererInfo(0, "Pure Java", 1, "CPU", 0L);
    }

    @Override
    void method8486() {
        if (aBool9012) {
            Class13.method508(true, false);
            aBool9012 = false;
        }

        aBool9014 = true;
    }

    @Override
    public void method8483() {
    }

    @Override
    public void method8484() {
    }

    @Override
    public void method8515(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aClass384_8996.buf[10] * f_3 + f_1 * aClass384_8996.buf[2] + aClass384_8996.buf[14] + f_2 * aClass384_8996.buf[6];
        float f_6 = aClass384_8996.buf[3] * f_1 + aClass384_8996.buf[15] + aClass384_8996.buf[7] * f_2 + f_3 * aClass384_8996.buf[11];
        if (f_5 >= -f_6 && f_5 <= f_6) {
            float f_7 = f_2 * aClass384_8996.buf[4] + aClass384_8996.buf[12] + f_1 * aClass384_8996.buf[0] + aClass384_8996.buf[8] * f_3;
            if (f_7 >= -f_6 && f_7 <= f_6) {
                float f_8 = f_3 * aClass384_8996.buf[9] + aClass384_8996.buf[13] + aClass384_8996.buf[1] * f_1 + aClass384_8996.buf[5] * f_2;
                if (f_8 >= -f_6 && f_8 <= f_6) {
                    float f_9 = aClass384_8994.buf[14] + aClass384_8994.buf[2] * f_1 + aClass384_8994.buf[6] * f_2 + aClass384_8994.buf[10] * f_3;
                    floats_4[0] = aFloat9003 + f_7 * aFloat8976 / f_6;
                    floats_4[1] = f_8 * aFloat9004 / f_6 + aFloat8982;
                    floats_4[2] = f_9;
                } else {
                    floats_4[2] = Float.NaN;
                    floats_4[1] = Float.NaN;
                    floats_4[0] = Float.NaN;
                }
            } else {
                floats_4[2] = Float.NaN;
                floats_4[1] = Float.NaN;
                floats_4[0] = Float.NaN;
            }
        } else {
            floats_4[2] = Float.NaN;
            floats_4[1] = Float.NaN;
            floats_4[0] = Float.NaN;
        }

    }

    @Override
    public void DA(Class455 class455_2, int i_3, int i_4) {
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_5 = (Class455_Sub3) class455_2;
            int[] ints_6 = packetsdecoder_5.anIntArray9077;
            int[] ints_7 = packetsdecoder_5.anIntArray9078;
            int i_8;
            if (anInt8986 < ints_6.length + i_41) {
                i_8 = anInt8986 - i_41;
            } else {
                i_8 = ints_6.length;
            }

            int i_9;
            if (anInt9009 > i_41) {
                i_9 = anInt9009 - i_41;
                i_41 = anInt9009;
            } else {
                i_9 = 0;
            }

            if (i_8 - i_9 > 0) {
                int i_10 = i_41 * anInt8980;

                for (int i_11 = i_9; i_11 < i_8; i_11++) {
                    int i_12 = i_3 + ints_6[i_11];
                    int i_13 = ints_7[i_11];
                    if (anInt8983 > i_12) {
                        i_13 -= anInt8983 - i_12;
                        i_12 = anInt8983;
                    }

                    if (anInt9002 < i_13 + i_12) {
                        i_13 = anInt9002 - i_12;
                    }

                    i_12 += i_10;

                    for (int i_14 = -i_13; i_14 < 0; i_14++) {
                        anIntArray8979[i_12++] = -16777216;
                    }

                    i_10 += anInt8980;
                }
            }
        }

    }

    boolean isHalfSize(int textureId) {
        return lowResolution || textureCache.getTextureDetails(textureId).isHalfSize;
    }

    @Override
    public void method8487(int i_1) {
        int i_2 = i_1 - 1426154545 * anInt8977;

        for (Node_Sub27 class282_sub27_3 = (Node_Sub27) aClass229_9006.method3866(); class282_sub27_3 != null; class282_sub27_3 = (Node_Sub27) aClass229_9006.method3867()) {
            if (class282_sub27_3.aBool7693) {
                class282_sub27_3.anInt7692 += i_2;
                int i_4 = class282_sub27_3.anInt7692 / 50;
                if (i_4 > 0) {
                    TextureDetails class169_5 = textureCache.getTextureDetails(class282_sub27_3.anInt7695);
                    float f_6 = class169_5.isHalfSize ? 64.0F : 128.0F;
                    class282_sub27_3.method12403((int) (f_6 * (class169_5.textureSpeedU * (i_2 / 1000.0F) / 64.0F)), (int) (class169_5.textureSpeedV * (i_2 / 1000.0F) / 64.0F * f_6));
                    class282_sub27_3.anInt7692 -= 50 * i_4;
                }

                class282_sub27_3.aBool7693 = false;
            }
        }

        anInt8977 = i_1;
        aClass229_9013.method3858(5);
        aClass229_9006.method3858(5);
    }

    @Override
    public void fq(int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_12 = i_1;
        int i_31 = i_3;
        if (anIntArray8979 != null && i_2 >= anInt9009 && i_2 < anInt8986) {
            if (i_12 < anInt8983) {
                i_31 -= anInt8983 - i_12;
                i_12 = anInt8983;
            }

            if (i_31 + i_12 > anInt9002) {
                i_31 = anInt9002 - i_12;
            }

            int i_6 = i_2 * anInt8980 + i_12;
            int i_7 = i_4 >>> 24;
            int i_8;
            if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
                for (i_8 = 0; i_8 < i_31; i_8++) {
                    anIntArray8979[i_6 + i_8] = i_4;
                }
            } else {
                int i_9;
                int i_10;
                if (i_5 == 1) {
                    i_4 = ((i_4 & 0xff00) * i_7 >> 8 & 0xff00) + ((i_4 & 0xff00ff) * i_7 >> 8 & 0xff00ff) + (i_7 << 24);
                    i_8 = 256 - i_7;

                    for (i_9 = 0; i_9 < i_31; i_9++) {
                        i_10 = anIntArray8979[i_9 + i_6];
                        i_10 = (i_8 * (i_10 & 0xff00) >> 8 & 0xff00) + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff);
                        anIntArray8979[i_9 + i_6] = i_4 + i_10;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (i_8 = 0; i_8 < i_31; i_8++) {
                        i_9 = anIntArray8979[i_6 + i_8];
                        i_10 = i_9 + i_4;
                        int i_11 = (i_4 & 0xff00ff) + (i_9 & 0xff00ff);
                        i_9 = (i_10 - i_11 & 0x10000) + (i_11 & 0x1000100);
                        anIntArray8979[i_8 + i_6] = i_10 - i_9 | i_9 - (i_9 >>> 8);
                    }
                }
            }
        }

    }

    @Override
    public int dd() {
        return 0;
    }

    @Override
    public int df() {
        return 0;
    }

    @Override
    public int dv() {
        return 0;
    }

    @Override
    public FontRenderer method8660(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
        int[] ints_4 = new int[arr_2.length];
        int[] ints_5 = new int[arr_2.length];
        boolean bool_6 = false;

        for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
            ints_4[i_7] = arr_2[i_7].width;
            ints_5[i_7] = arr_2[i_7].height;
            if (arr_2[i_7].alpha != null) {
                bool_6 = true;
            }
        }

        if (bool_3) {
            if (bool_6) {
                return new FontRenderer_Sub2(this, fontmetrics_1, arr_2, ints_4, ints_5);
            } else {
                return new FontRenderer_Sub1(this, fontmetrics_1, arr_2, ints_4, ints_5);
            }
        } else if (bool_6) {
            throw new IllegalArgumentException("");
        } else {
            return new FontRenderer_Sub3(this, fontmetrics_1, arr_2, ints_4, ints_5);
        }
    }

    @Override
    public boolean method8495() {
        return false;
    }

    @Override
    public void method8477(Class152 class152_1) {
    }

    @Override
    void fw(int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_22 = i_2;
        if (anIntArray8979 != null) {
            if (i_3 < 0) {
                i_3 = -i_3;
            }

            int i_6 = i_22 - i_3;
            if (i_6 < anInt9009) {
                i_6 = anInt9009;
            }

            int i_7 = 1 + i_22 + i_3;
            if (i_7 > anInt8986) {
                i_7 = anInt8986;
            }

            int i_8 = i_6;
            int i_9 = i_3 * i_3;
            int i_10 = 0;
            int i_11 = i_22 - i_6;
            int i_12 = i_11 * i_11;
            int i_13 = i_12 - i_11;
            if (i_22 > i_7) {
                i_22 = i_7;
            }

            int i_14 = i_4 >>> 24;
            int i_15;
            int i_16;
            int i_17;
            int i_18;
            if (i_5 != 0 && (i_5 != 1 || i_14 != 255)) {
                int i_19;
                int i_20;
                if (i_5 == 1) {
                    i_4 = (i_14 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_14 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 << 24);

                    for (i_15 = 256 - i_14; i_8 < i_22; i_13 -= i_11 + i_11) {
                        while (i_13 <= i_9 || i_12 <= i_9) {
                            i_12 += i_10 + i_10;
                            i_13 += i_10++ + i_10;
                        }

                        i_16 = i_1 - i_10 + 1;
                        if (i_16 < anInt8983) {
                            i_16 = anInt8983;
                        }

                        i_17 = i_1 + i_10;
                        if (i_17 > anInt9002) {
                            i_17 = anInt9002;
                        }

                        i_18 = i_16 + i_8 * anInt8980;

                        for (i_19 = i_16; i_19 < i_17; i_19++) {
                            i_20 = anIntArray8979[i_18];
                            i_20 = ((i_20 & 0xff00) * i_15 >> 8 & 0xff00) + ((i_20 & 0xff00ff) * i_15 >> 8 & 0xff00ff);
                            anIntArray8979[i_18++] = i_4 + i_20;
                        }

                        ++i_8;
                        i_12 -= i_11-- + i_11;
                    }

                    i_10 = i_3;
                    i_11 = -i_11;
                    i_13 = i_9 + i_11 * i_11;
                    i_12 = i_13 - i_3;

                    for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
                        while (i_13 > i_9 && i_12 > i_9) {
                            i_13 -= i_10-- + i_10;
                            i_12 -= i_10 + i_10;
                        }

                        i_16 = i_1 - i_10;
                        if (i_16 < anInt8983) {
                            i_16 = anInt8983;
                        }

                        i_17 = i_10 + i_1;
                        if (i_17 > anInt9002 - 1) {
                            i_17 = anInt9002 - 1;
                        }

                        i_18 = i_16 + anInt8980 * i_8;

                        for (i_19 = i_16; i_19 <= i_17; i_19++) {
                            i_20 = anIntArray8979[i_18];
                            i_20 = (i_15 * (i_20 & 0xff00) >> 8 & 0xff00) + (i_15 * (i_20 & 0xff00ff) >> 8 & 0xff00ff);
                            anIntArray8979[i_18++] = i_4 + i_20;
                        }

                        ++i_8;
                        i_13 += i_11 + i_11;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    int i_21;
                    while (i_8 < i_22) {
                        while (i_13 <= i_9 || i_12 <= i_9) {
                            i_12 += i_10 + i_10;
                            i_13 += i_10++ + i_10;
                        }

                        i_15 = i_1 - i_10 + 1;
                        if (i_15 < anInt8983) {
                            i_15 = anInt8983;
                        }

                        i_16 = i_10 + i_1;
                        if (i_16 > anInt9002) {
                            i_16 = anInt9002;
                        }

                        i_17 = i_15 + anInt8980 * i_8;

                        for (i_18 = i_15; i_18 < i_16; i_18++) {
                            i_19 = anIntArray8979[i_17];
                            i_20 = i_4 + i_19;
                            i_21 = (i_4 & 0xff00ff) + (i_19 & 0xff00ff);
                            i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
                            anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
                        }

                        ++i_8;
                        i_12 -= i_11-- + i_11;
                        i_13 -= i_11 + i_11;
                    }

                    i_10 = i_3;
                    i_11 = -i_11;
                    i_13 = i_11 * i_11 + i_9;
                    i_12 = i_13 - i_3;

                    for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
                        while (i_13 > i_9 && i_12 > i_9) {
                            i_13 -= i_10-- + i_10;
                            i_12 -= i_10 + i_10;
                        }

                        i_15 = i_1 - i_10;
                        if (i_15 < anInt8983) {
                            i_15 = anInt8983;
                        }

                        i_16 = i_10 + i_1;
                        if (i_16 > anInt9002 - 1) {
                            i_16 = anInt9002 - 1;
                        }

                        i_17 = i_15 + anInt8980 * i_8;

                        for (i_18 = i_15; i_18 <= i_16; i_18++) {
                            i_19 = anIntArray8979[i_17];
                            i_20 = i_4 + i_19;
                            i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
                            i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
                            anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
                        }

                        ++i_8;
                        i_13 += i_11 + i_11;
                    }
                }
            } else {
                while (i_8 < i_22) {
                    while (i_13 <= i_9 || i_12 <= i_9) {
                        i_12 += i_10 + i_10;
                        i_13 += i_10++ + i_10;
                    }

                    i_15 = 1 + (i_1 - i_10);
                    if (i_15 < anInt8983) {
                        i_15 = anInt8983;
                    }

                    i_16 = i_10 + i_1;
                    if (i_16 > anInt9002) {
                        i_16 = anInt9002;
                    }

                    i_17 = i_15 + i_8 * anInt8980;

                    for (i_18 = i_15; i_18 < i_16; i_18++) {
                        anIntArray8979[i_17++] = i_4;
                    }

                    ++i_8;
                    i_12 -= i_11-- + i_11;
                    i_13 -= i_11 + i_11;
                }

                i_10 = i_3;
                i_11 = i_8 - i_22;
                i_13 = i_11 * i_11 + i_9;
                i_12 = i_13 - i_3;

                for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
                    while (i_13 > i_9 && i_12 > i_9) {
                        i_13 -= i_10-- + i_10;
                        i_12 -= i_10 + i_10;
                    }

                    i_15 = i_1 - i_10;
                    if (i_15 < anInt8983) {
                        i_15 = anInt8983;
                    }

                    i_16 = i_1 + i_10;
                    if (i_16 > anInt9002 - 1) {
                        i_16 = anInt9002 - 1;
                    }

                    i_17 = i_15 + i_8 * anInt8980;

                    for (i_18 = i_15; i_18 <= i_16; i_18++) {
                        anIntArray8979[i_17++] = i_4;
                    }

                    ++i_8;
                    i_13 += i_11 + i_11;
                }

                return;
            }
        }

    }

    @Override
    void method8485() {
        if (aBool9012) {
            Class13.method508(true, false);
            aBool9012 = false;
        }

        aBool9014 = true;
    }

    @Override
    public boolean method8489() {
        return false;
    }

    @Override
    public boolean method8674() {
        return false;
    }

    @Override
    public Class158_Sub1 method8418() {
        return new Class158_Sub1_Sub2(this);
    }

    @Override
    public boolean method8492() {
        return true;
    }

    @Override
    public boolean method8599() {
        return false;
    }

    @Override
    public void method8520(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        XA(i_1, i_2, i_3, i_5, i_6);
        XA(i_1, i_4 + i_2 - 1, i_3, i_5, i_6);
        G(i_1, i_2 + 1, i_4 - 2, i_5, i_6);
        G(i_1 + i_3 - 1, 1 + i_2, i_4 - 2, i_5, i_6);
    }

    @Override
    public Class152 method8636(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        return null;
    }

    @Override
    void method8555() throws Exception_Sub3 {
        aClass158_Sub2_5841.method14353(0, 0);
        if (textureCache != null) {
            textureCache.method161();
        }

    }

    @Override
    public boolean method8431() {
        return false;
    }

    @Override
    public boolean method8644() {
        return false;
    }

    @Override
    public void method8475(HDWaterTile class90_2) {
        for (int i_3 = 0; i_3 < aClass185Array8984.length; i_3++) {
            aClass185Array8984[i_3].anInt2336 = aClass185Array8984[i_3].anInt2307;
            aClass185Array8984[i_3].anInt2306 = -1;
            aClass185Array8984[i_3].anInt2307 = class90_2.color;
            aClass185Array8984[i_3].anInt2313 = class90_2.scale;
            aClass185Array8984[i_3].aBool2309 = true;
        }

    }

    @Override
    public boolean method8578() {
        return false;
    }

    @Override
    public boolean method8462() {
        return false;
    }

    @Override
    public boolean method8501() {
        return false;
    }

    @Override
    public void method8560(int i_1) {
        MeshRasterizer_Sub2.anInt8644 = i_1;
        MeshRasterizer_Sub2.anInt8562 = i_1;
        if (656550451 * anInt9008 * 1696391419 > 1) {
            throw new IllegalStateException();
        } else {
            method14369(anInt9008);
            method14409();
        }
    }

    @Override
    public boolean method8503() {
        return false;
    }

    @Override
    public boolean method8614() {
        return false;
    }

    @Override
    public boolean method8504() {
        return false;
    }

    @Override
    public void method8491() {
    }

    @Override
    Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
        return Class52_Sub1.method14493(this, canvas_1, i_2, i_3);
    }

    @Override
    public void fd(int i_1, int i_2) {
        if ((i_1 & 0x1) != 0) {
            B(0, 0, anInt8980, anInt8981, i_2, 0);
        }

        if ((i_1 & 0x2) != 0) {
            method14410();
        }

    }

    @Override
    public void method8445() {
    }

    @Override
    public void method8497() {
    }

    @Override
    public void method8424(Matrix44 matrix44_1) {
        aClass384_8995.method6562(matrix44_1);
        method14374();
    }

    @Override
    public void method8559(int i_1) {
        MeshRasterizer_Sub2.anInt8644 = i_1;
        MeshRasterizer_Sub2.anInt8562 = i_1;
        if (656550451 * anInt9008 * 1696391419 > 1) {
            throw new IllegalStateException();
        } else {
            method14369(anInt9008);
            method14409();
        }
    }

    @Override
    public void eq(boolean bool_1) {
        Class185 class185_2 = method14370(Thread.currentThread());
        class185_2.aBool2334 = bool_1;
    }

    @Override
    public void method8513(int i_1, int i_2, int i_3, int i_4) {
        anInt8998 = i_1;
        anInt8999 = i_2;
        anInt9000 = i_3;
        anInt9001 = i_4;
        method14364();
    }

    @Override
    public void method8691() {
    }

    @Override
    public boolean method8502() {
        return false;
    }

    @Override
    public NativeSprite method8518(SpriteDefinitions class91_1, boolean bool_2) {
        int[] ints_3 = class91_1.pallete;
        byte[] bytes_4 = class91_1.pixels;
        int i_5 = class91_1.width;
        int i_6 = class91_1.height;
        NativeSprite_Sub1 obj_7;
        int[] ints_8;
        byte[] bytes_9;
        int i_10;
        int i_11;
        int i_12;
        if (bool_2 && class91_1.alpha == null) {
            ints_8 = new int[ints_3.length];
            bytes_9 = new byte[i_5 * i_6];

            for (i_10 = 0; i_10 < i_6; i_10++) {
                i_11 = i_10 * i_5;

                for (i_12 = 0; i_12 < i_5; i_12++) {
                    bytes_9[i_12 + i_11] = bytes_4[i_12 + i_11];
                }
            }

            for (i_10 = 0; i_10 < ints_3.length; i_10++) {
                ints_8[i_10] = ints_3[i_10];
            }

            obj_7 = new NativeSprite_Sub1_Sub2(this, bytes_9, ints_8, i_5, i_6);
        } else {
            ints_8 = new int[i_6 * i_5];
            bytes_9 = class91_1.alpha;
            if (bytes_9 != null) {
                for (i_10 = 0; i_10 < i_6; i_10++) {
                    i_11 = i_5 * i_10;

                    for (i_12 = 0; i_12 < i_5; i_12++) {
                        ints_8[i_12 + i_11] = ints_3[bytes_4[i_12 + i_11] & 0xff] | bytes_9[i_12 + i_11] << 24;
                    }
                }

                obj_7 = new NativeSprite_Sub1_Sub3(this, ints_8, i_5, i_6);
            } else {
                for (i_10 = 0; i_10 < i_6; i_10++) {
                    i_11 = i_10 * i_5;

                    for (i_12 = 0; i_12 < i_5; i_12++) {
                        int i_13 = ints_3[bytes_4[i_12 + i_11] & 0xff];
                        ints_8[i_11 + i_12] = i_13 != 0 ? -16777216 | i_13 : 0;
                    }
                }

                obj_7 = new NativeSprite_Sub1_Sub1(this, ints_8, i_5, i_6);
            }
        }

        (obj_7).method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
        return obj_7;
    }

    @Override
    public void ez() {
        anInt8983 = 0;
        anInt9009 = 0;
        anInt9002 = 1480196385 * anInt8980;
        anInt8986 = anInt8981 * 1628550159;
        method14364();
    }

    @Override
    public void eh() {
        anInt8983 = 0;
        anInt9009 = 0;
        anInt9002 = 1480196385 * anInt8980;
        anInt8986 = anInt8981 * 1628550159;
        method14364();
    }

    @Override
    public NativeSprite method8444(SpriteDefinitions class91_1, boolean bool_2) {
        int[] ints_3 = class91_1.pallete;
        byte[] bytes_4 = class91_1.pixels;
        int i_5 = class91_1.width;
        int i_6 = class91_1.height;
        NativeSprite_Sub1 obj_7;
        int[] ints_8;
        byte[] bytes_9;
        int i_10;
        int i_11;
        int i_12;
        if (bool_2 && class91_1.alpha == null) {
            ints_8 = new int[ints_3.length];
            bytes_9 = new byte[i_5 * i_6];

            for (i_10 = 0; i_10 < i_6; i_10++) {
                i_11 = i_10 * i_5;

                for (i_12 = 0; i_12 < i_5; i_12++) {
                    bytes_9[i_12 + i_11] = bytes_4[i_12 + i_11];
                }
            }

            for (i_10 = 0; i_10 < ints_3.length; i_10++) {
                ints_8[i_10] = ints_3[i_10];
            }

            obj_7 = new NativeSprite_Sub1_Sub2(this, bytes_9, ints_8, i_5, i_6);
        } else {
            ints_8 = new int[i_6 * i_5];
            bytes_9 = class91_1.alpha;
            if (bytes_9 != null) {
                for (i_10 = 0; i_10 < i_6; i_10++) {
                    i_11 = i_5 * i_10;

                    for (i_12 = 0; i_12 < i_5; i_12++) {
                        ints_8[i_12 + i_11] = ints_3[bytes_4[i_12 + i_11] & 0xff] | bytes_9[i_12 + i_11] << 24;
                    }
                }

                obj_7 = new NativeSprite_Sub1_Sub3(this, ints_8, i_5, i_6);
            } else {
                for (i_10 = 0; i_10 < i_6; i_10++) {
                    i_11 = i_10 * i_5;

                    for (i_12 = 0; i_12 < i_5; i_12++) {
                        int i_13 = ints_3[bytes_4[i_12 + i_11] & 0xff];
                        ints_8[i_11 + i_12] = i_13 != 0 ? -16777216 | i_13 : 0;
                    }
                }

                obj_7 = new NativeSprite_Sub1_Sub1(this, ints_8, i_5, i_6);
            }
        }

        (obj_7).method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
        return obj_7;
    }

    @Override
    public void fc(int i_1, int i_2, int i_3, int i_4) {
        int i_11 = i_1;
        int i_21 = i_2;
        int i_31 = i_3;
        int i_41 = i_4;
        if (i_11 < 0) {
            i_11 = 0;
        }

        if (i_21 < 0) {
            i_21 = 0;
        }

        if (i_31 > anInt8980) {
            i_31 = anInt8980;
        }

        if (i_41 > anInt8981) {
            i_41 = anInt8981;
        }

        anInt8983 = i_11;
        anInt9002 = i_31;
        anInt9009 = i_21;
        anInt8986 = i_41;
        method14364();
    }

    @Override
    public void fe(int i_1, int i_2, int i_3, int i_4) {
        if (anInt8983 < i_1) {
            anInt8983 = i_1;
        }

        if (anInt9009 < i_2) {
            anInt9009 = i_2;
        }

        if (anInt9002 > i_3) {
            anInt9002 = 1714763515 * i_3;
        }

        if (anInt8986 > i_4) {
            anInt8986 = i_4;
        }

        method14364();
    }

    @Override
    public MeshRasterizer method8564(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    void method8596(int i_1, int i_2) throws Exception_Sub3 {
        aClass158_Sub2_5841.method14353(i_1, i_2);
        if (textureCache != null) {
            textureCache.method161();
        }

    }

    @Override
    public Matrix44Var method8685() {
        return new Matrix44Var(aClass294_8993);
    }

    @Override
    public void method8496(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        if (anIntArray8979 != null) {
            Class185 class185_8 = method14370(Thread.currentThread());
            ChoppyItemFixClass choppyitemfixclass_9 = class185_8.aClass144_2310;
            int i_10 = i_3 - i_1;
            int i_11 = i_4 - i_2;
            int i_12 = i_10 >= 0 ? i_10 : -i_10;
            int i_13 = i_11 >= 0 ? i_11 : -i_11;
            int i_14 = i_12;
            if (i_12 < i_13) {
                i_14 = i_13;
            }

            if (i_14 != 0) {
                int i_15 = (i_10 << 16) / i_14;
                int i_16 = (i_11 << 16) / i_14;
                i_10 += i_15 >> 16;
                i_11 += i_16 >> 16;
                if (i_16 <= i_15) {
                    i_15 = -i_15;
                } else {
                    i_16 = -i_16;
                }

                int i_17 = i_16 * i_6 >> 17;
                int i_18 = i_16 * i_6 + 1 >> 17;
                int i_19 = i_15 * i_6 >> 17;
                int i_20 = i_15 * i_6 + 1 >> 17;
                i_1 -= choppyitemfixclass_9.method2416();
                i_2 -= choppyitemfixclass_9.method2417();
                int i_21 = i_17 + i_1;
                int i_22 = i_1 - i_18;
                int i_23 = i_10 + i_1 - i_18;
                int i_24 = i_10 + i_17 + i_1;
                int i_25 = i_19 + i_2;
                int i_26 = i_2 - i_20;
                int i_27 = i_11 + i_2 - i_20;
                int i_28 = i_11 + i_19 + i_2;
                if (i_7 == 0) {
                    choppyitemfixclass_9.anInt1674 = 0;
                } else {
                    if (i_7 != 1) {
                        throw new IllegalArgumentException();
                    }

                    choppyitemfixclass_9.anInt1674 = 255 - (i_5 >>> 24);
                }

                RA(false);
                choppyitemfixclass_9.aBool1708 = i_21 < 0 || i_21 > choppyitemfixclass_9.anInt1684 || i_22 < 0 || i_22 > choppyitemfixclass_9.anInt1684 || i_23 < 0 || i_23 > choppyitemfixclass_9.anInt1684;
                choppyitemfixclass_9.method2428(true, false, false, i_25, i_26, i_27, i_21, i_22, i_23, 100.0F, 100.0F, 100.0F, i_5);
                choppyitemfixclass_9.aBool1708 = i_21 < 0 || i_21 > choppyitemfixclass_9.anInt1684 || i_23 < 0 || i_23 > choppyitemfixclass_9.anInt1684 || i_24 < 0 || i_24 > choppyitemfixclass_9.anInt1684;
                choppyitemfixclass_9.method2428(true, false, false, i_25, i_27, i_28, i_21, i_23, i_24, 100.0F, 100.0F, 100.0F, i_5);
                RA(true);
            }
        }

    }

    @Override
    public MeshRasterizer method8561(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    public void fi(int i_1, int i_2) {
        if ((i_1 & 0x1) != 0) {
            B(0, 0, anInt8980, anInt8981, i_2, 0);
        }

        if ((i_1 & 0x2) != 0) {
            method14410();
        }

    }

    @Override
    public void fk(int i_1, int i_2, int i_3, int i_4) {
        if (anInt8983 < i_1) {
            anInt8983 = i_1;
        }

        if (anInt9009 < i_2) {
            anInt9009 = i_2;
        }

        if (anInt9002 > i_3) {
            anInt9002 = 1714763515 * i_3;
        }

        if (anInt8986 > i_4) {
            anInt8986 = i_4;
        }

        method14364();
    }

    @Override
    public void method8511(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        XA(i_1, i_2, i_3, i_5, i_6);
        XA(i_1, i_4 + i_2 - 1, i_3, i_5, i_6);
        G(i_1, i_2 + 1, i_4 - 2, i_5, i_6);
        G(i_1 + i_3 - 1, 1 + i_2, i_4 - 2, i_5, i_6);
    }

    @Override
    public void fp(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_21 = i_2;
        int i_41 = i_4;
        int i_31 = i_3;
        int i_15 = i_1;
        if (anIntArray8979 != null) {
            if (i_15 < anInt8983) {
                i_31 -= anInt8983 - i_15;
                i_15 = anInt8983;
            }

            if (i_21 < anInt9009) {
                i_41 -= anInt9009 - i_21;
                i_21 = anInt9009;
            }

            if (i_15 + i_31 > anInt9002) {
                i_31 = anInt9002 - i_15;
            }

            if (i_21 + i_41 > anInt8986) {
                i_41 = anInt8986 - i_21;
            }

            if (i_31 > 0 && i_41 > 0 && i_15 <= anInt9002 && i_21 <= anInt8986) {
                int i_7 = anInt8980 - i_31;
                int i_8 = i_15 + i_21 * anInt8980;
                int i_9 = i_5 >>> 24;
                int i_10;
                int i_11;
                int i_12;
                if (i_6 != 0 && (i_6 != 1 || i_9 != 255)) {
                    int i_13;
                    if (i_6 == 1) {
                        i_5 = (((i_5 & -16711936) >>> 8) * i_9 & -16711936) + ((i_5 & 0xff00ff) * i_9 >> 8 & 0xff00ff);
                        i_10 = 256 - i_9;

                        for (i_11 = 0; i_11 < i_41; i_11++) {
                            for (i_12 = -i_31; i_12 < 0; i_12++) {
                                i_13 = anIntArray8979[i_8];
                                i_13 = (i_10 * ((i_13 & -16711936) >>> 8) & -16711936) + (i_10 * (i_13 & 0xff00ff) >> 8 & 0xff00ff);
                                anIntArray8979[i_8++] = i_5 + i_13;
                            }

                            i_8 += i_7;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        for (i_10 = 0; i_10 < i_41; i_10++) {
                            for (i_11 = -i_31; i_11 < 0; i_11++) {
                                i_12 = anIntArray8979[i_8];
                                i_13 = i_12 + i_5;
                                int i_14 = (i_5 & 0xff00ff) + (i_12 & 0xff00ff);
                                i_12 = (i_13 - i_14 & 0x10000) + (i_14 & 0x1000100);
                                anIntArray8979[i_8++] = i_13 - i_12 | i_12 - (i_12 >>> 8);
                            }

                            i_8 += i_7;
                        }
                    }
                } else {
                    i_10 = i_31 >> 3;
                    i_11 = i_31 & 0x7;
                    i_31 = i_8 - 1;

                    for (i_12 = -i_41; i_12 < 0; i_12++) {
                        if (i_10 > 0) {
                            i_15 = i_10;

                            do {
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                --i_15;
                            } while (i_15 > 0);
                        }

                        if (i_11 > 0) {
                            i_15 = i_11;

                            do {
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                --i_15;
                            } while (i_15 > 0);
                        }

                        i_31 += i_7;
                    }
                }
            }
        }

    }

    @Override
    public void fb(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_21 = i_2;
        int i_41 = i_4;
        int i_31 = i_3;
        int i_15 = i_1;
        if (anIntArray8979 != null) {
            if (i_15 < anInt8983) {
                i_31 -= anInt8983 - i_15;
                i_15 = anInt8983;
            }

            if (i_21 < anInt9009) {
                i_41 -= anInt9009 - i_21;
                i_21 = anInt9009;
            }

            if (i_15 + i_31 > anInt9002) {
                i_31 = anInt9002 - i_15;
            }

            if (i_21 + i_41 > anInt8986) {
                i_41 = anInt8986 - i_21;
            }

            if (i_31 > 0 && i_41 > 0 && i_15 <= anInt9002 && i_21 <= anInt8986) {
                int i_7 = anInt8980 - i_31;
                int i_8 = i_15 + i_21 * anInt8980;
                int i_9 = i_5 >>> 24;
                int i_10;
                int i_11;
                int i_12;
                if (i_6 != 0 && (i_6 != 1 || i_9 != 255)) {
                    int i_13;
                    if (i_6 == 1) {
                        i_5 = (((i_5 & -16711936) >>> 8) * i_9 & -16711936) + ((i_5 & 0xff00ff) * i_9 >> 8 & 0xff00ff);
                        i_10 = 256 - i_9;

                        for (i_11 = 0; i_11 < i_41; i_11++) {
                            for (i_12 = -i_31; i_12 < 0; i_12++) {
                                i_13 = anIntArray8979[i_8];
                                i_13 = (i_10 * ((i_13 & -16711936) >>> 8) & -16711936) + (i_10 * (i_13 & 0xff00ff) >> 8 & 0xff00ff);
                                anIntArray8979[i_8++] = i_5 + i_13;
                            }

                            i_8 += i_7;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        for (i_10 = 0; i_10 < i_41; i_10++) {
                            for (i_11 = -i_31; i_11 < 0; i_11++) {
                                i_12 = anIntArray8979[i_8];
                                i_13 = i_12 + i_5;
                                int i_14 = (i_5 & 0xff00ff) + (i_12 & 0xff00ff);
                                i_12 = (i_13 - i_14 & 0x10000) + (i_14 & 0x1000100);
                                anIntArray8979[i_8++] = i_13 - i_12 | i_12 - (i_12 >>> 8);
                            }

                            i_8 += i_7;
                        }
                    }
                } else {
                    i_10 = i_31 >> 3;
                    i_11 = i_31 & 0x7;
                    i_31 = i_8 - 1;

                    for (i_12 = -i_41; i_12 < 0; i_12++) {
                        if (i_10 > 0) {
                            i_15 = i_10;

                            do {
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                --i_15;
                            } while (i_15 > 0);
                        }

                        if (i_11 > 0) {
                            i_15 = i_11;

                            do {
                                ++i_31;
                                anIntArray8979[i_31] = i_5;
                                --i_15;
                            } while (i_15 > 0);
                        }

                        i_31 += i_7;
                    }
                }
            }
        }

    }

    @Override
    public void fv(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
        if (anIntArray8979 != null && i_3 > 0 && i_4 > 0) {
            int i_10 = 0;
            int i_11 = 0;
            int i_12 = (i_8 << 16) / i_3;
            int i_13 = (bytes_7.length / i_8 << 16) / i_4;
            int i_14 = i_1 + anInt8980 * i_2;
            int i_15 = anInt8980 - i_3;
            if (i_2 + i_4 > anInt8986) {
                i_4 -= i_4 + i_2 - anInt8986;
            }

            int i_16;
            if (i_2 < anInt9009) {
                i_16 = anInt9009 - i_2;
                i_4 -= i_16;
                i_14 += anInt8980 * i_16;
                i_11 += i_16 * i_13;
            }

            if (i_1 + i_3 > anInt9002) {
                i_16 = i_3 + i_1 - anInt9002;
                i_3 -= i_16;
                i_15 += i_16;
            }

            if (i_1 < anInt8983) {
                i_16 = anInt8983 - i_1;
                i_3 -= i_16;
                i_14 += i_16;
                i_10 += i_16 * i_12;
                i_15 += i_16;
            }

            i_16 = i_5 >>> 24;
            int i_17 = i_6 >>> 24;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            if (i_9 == 0 || i_9 == 1 && i_16 == 255 && i_17 == 255) {
                i_18 = i_10;

                for (i_19 = -i_4; i_19 < 0; i_19++) {
                    i_20 = i_8 * (i_11 >> 16);

                    for (i_21 = -i_3; i_21 < 0; i_21++) {
                        if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
                            anIntArray8979[i_14++] = i_6;
                        } else {
                            anIntArray8979[i_14++] = i_5;
                        }

                        i_10 += i_12;
                    }

                    i_11 += i_13;
                    i_10 = i_18;
                    i_14 += i_15;
                }
            } else {
                int i_22;
                int i_23;
                int i_24;
                int i_25;
                if (i_9 == 1) {
                    i_18 = i_10;

                    for (i_19 = -i_4; i_19 < 0; i_19++) {
                        i_20 = (i_11 >> 16) * i_8;

                        for (i_21 = -i_3; i_21 < 0; i_21++) {
                            i_22 = i_5;
                            if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
                                i_22 = i_6;
                            }

                            i_23 = i_22 >>> 24;
                            i_24 = 255 - i_23;
                            i_25 = anIntArray8979[i_14];
                            anIntArray8979[i_14++] = (i_24 * (i_25 & 0xff00) + i_23 * (i_22 & 0xff00) & 0xff0000) + (i_23 * (i_22 & 0xff00ff) + (i_25 & 0xff00ff) * i_24 & -16711936) >> 8;
                            i_10 += i_12;
                        }

                        i_11 += i_13;
                        i_10 = i_18;
                        i_14 += i_15;
                    }
                } else {
                    if (i_9 != 2) {
                        throw new IllegalArgumentException();
                    }

                    i_18 = i_10;

                    for (i_19 = -i_4; i_19 < 0; i_19++) {
                        i_20 = i_8 * (i_11 >> 16);

                        for (i_21 = -i_3; i_21 < 0; i_21++) {
                            i_22 = i_5;
                            if (bytes_7[(i_10 >> 16) + i_20] != 0) {
                                i_22 = i_6;
                            }

                            if (i_22 != 0) {
                                i_23 = anIntArray8979[i_14];
                                i_24 = i_22 + i_23;
                                i_25 = (i_23 & 0xff00ff) + (i_22 & 0xff00ff);
                                i_23 = (i_24 - i_25 & 0x10000) + (i_25 & 0x1000100);
                                anIntArray8979[i_14++] = i_24 - i_23 | i_23 - (i_23 >>> 8);
                            } else {
                                ++i_14;
                            }

                            i_10 += i_12;
                        }

                        i_11 += i_13;
                        i_10 = i_18;
                        i_14 += i_15;
                    }
                }
            }
        }

    }

    @Override
    public void ff(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
        if (anIntArray8979 != null && i_3 > 0 && i_4 > 0) {
            int i_10 = 0;
            int i_11 = 0;
            int i_12 = (i_8 << 16) / i_3;
            int i_13 = (bytes_7.length / i_8 << 16) / i_4;
            int i_14 = i_1 + anInt8980 * i_2;
            int i_15 = anInt8980 - i_3;
            if (i_2 + i_4 > anInt8986) {
                i_4 -= i_4 + i_2 - anInt8986;
            }

            int i_16;
            if (i_2 < anInt9009) {
                i_16 = anInt9009 - i_2;
                i_4 -= i_16;
                i_14 += anInt8980 * i_16;
                i_11 += i_16 * i_13;
            }

            if (i_1 + i_3 > anInt9002) {
                i_16 = i_3 + i_1 - anInt9002;
                i_3 -= i_16;
                i_15 += i_16;
            }

            if (i_1 < anInt8983) {
                i_16 = anInt8983 - i_1;
                i_3 -= i_16;
                i_14 += i_16;
                i_10 += i_16 * i_12;
                i_15 += i_16;
            }

            i_16 = i_5 >>> 24;
            int i_17 = i_6 >>> 24;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            if (i_9 == 0 || i_9 == 1 && i_16 == 255 && i_17 == 255) {
                i_18 = i_10;

                for (i_19 = -i_4; i_19 < 0; i_19++) {
                    i_20 = i_8 * (i_11 >> 16);

                    for (i_21 = -i_3; i_21 < 0; i_21++) {
                        if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
                            anIntArray8979[i_14++] = i_6;
                        } else {
                            anIntArray8979[i_14++] = i_5;
                        }

                        i_10 += i_12;
                    }

                    i_11 += i_13;
                    i_10 = i_18;
                    i_14 += i_15;
                }
            } else {
                int i_22;
                int i_23;
                int i_24;
                int i_25;
                if (i_9 == 1) {
                    i_18 = i_10;

                    for (i_19 = -i_4; i_19 < 0; i_19++) {
                        i_20 = (i_11 >> 16) * i_8;

                        for (i_21 = -i_3; i_21 < 0; i_21++) {
                            i_22 = i_5;
                            if (bytes_7[i_20 + (i_10 >> 16)] != 0) {
                                i_22 = i_6;
                            }

                            i_23 = i_22 >>> 24;
                            i_24 = 255 - i_23;
                            i_25 = anIntArray8979[i_14];
                            anIntArray8979[i_14++] = (i_24 * (i_25 & 0xff00) + i_23 * (i_22 & 0xff00) & 0xff0000) + (i_23 * (i_22 & 0xff00ff) + (i_25 & 0xff00ff) * i_24 & -16711936) >> 8;
                            i_10 += i_12;
                        }

                        i_11 += i_13;
                        i_10 = i_18;
                        i_14 += i_15;
                    }
                } else {
                    if (i_9 != 2) {
                        throw new IllegalArgumentException();
                    }

                    i_18 = i_10;

                    for (i_19 = -i_4; i_19 < 0; i_19++) {
                        i_20 = i_8 * (i_11 >> 16);

                        for (i_21 = -i_3; i_21 < 0; i_21++) {
                            i_22 = i_5;
                            if (bytes_7[(i_10 >> 16) + i_20] != 0) {
                                i_22 = i_6;
                            }

                            if (i_22 != 0) {
                                i_23 = anIntArray8979[i_14];
                                i_24 = i_22 + i_23;
                                i_25 = (i_23 & 0xff00ff) + (i_22 & 0xff00ff);
                                i_23 = (i_24 - i_25 & 0x10000) + (i_25 & 0x1000100);
                                anIntArray8979[i_14++] = i_24 - i_23 | i_23 - (i_23 >>> 8);
                            } else {
                                ++i_14;
                            }

                            i_10 += i_12;
                        }

                        i_11 += i_13;
                        i_10 = i_18;
                        i_14 += i_15;
                    }
                }
            }
        }

    }

    @Override
    void fr(int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_22 = i_2;
        if (anIntArray8979 != null) {
            if (i_3 < 0) {
                i_3 = -i_3;
            }

            int i_6 = i_22 - i_3;
            if (i_6 < anInt9009) {
                i_6 = anInt9009;
            }

            int i_7 = 1 + i_22 + i_3;
            if (i_7 > anInt8986) {
                i_7 = anInt8986;
            }

            int i_8 = i_6;
            int i_9 = i_3 * i_3;
            int i_10 = 0;
            int i_11 = i_22 - i_6;
            int i_12 = i_11 * i_11;
            int i_13 = i_12 - i_11;
            if (i_22 > i_7) {
                i_22 = i_7;
            }

            int i_14 = i_4 >>> 24;
            int i_15;
            int i_16;
            int i_17;
            int i_18;
            if (i_5 != 0 && (i_5 != 1 || i_14 != 255)) {
                int i_19;
                int i_20;
                if (i_5 == 1) {
                    i_4 = (i_14 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_14 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 << 24);

                    for (i_15 = 256 - i_14; i_8 < i_22; i_13 -= i_11 + i_11) {
                        while (i_13 <= i_9 || i_12 <= i_9) {
                            i_12 += i_10 + i_10;
                            i_13 += i_10++ + i_10;
                        }

                        i_16 = i_1 - i_10 + 1;
                        if (i_16 < anInt8983) {
                            i_16 = anInt8983;
                        }

                        i_17 = i_1 + i_10;
                        if (i_17 > anInt9002) {
                            i_17 = anInt9002;
                        }

                        i_18 = i_16 + i_8 * anInt8980;

                        for (i_19 = i_16; i_19 < i_17; i_19++) {
                            i_20 = anIntArray8979[i_18];
                            i_20 = ((i_20 & 0xff00) * i_15 >> 8 & 0xff00) + ((i_20 & 0xff00ff) * i_15 >> 8 & 0xff00ff);
                            anIntArray8979[i_18++] = i_4 + i_20;
                        }

                        ++i_8;
                        i_12 -= i_11-- + i_11;
                    }

                    i_10 = i_3;
                    i_11 = -i_11;
                    i_13 = i_9 + i_11 * i_11;
                    i_12 = i_13 - i_3;

                    for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
                        while (i_13 > i_9 && i_12 > i_9) {
                            i_13 -= i_10-- + i_10;
                            i_12 -= i_10 + i_10;
                        }

                        i_16 = i_1 - i_10;
                        if (i_16 < anInt8983) {
                            i_16 = anInt8983;
                        }

                        i_17 = i_10 + i_1;
                        if (i_17 > anInt9002 - 1) {
                            i_17 = anInt9002 - 1;
                        }

                        i_18 = i_16 + anInt8980 * i_8;

                        for (i_19 = i_16; i_19 <= i_17; i_19++) {
                            i_20 = anIntArray8979[i_18];
                            i_20 = (i_15 * (i_20 & 0xff00) >> 8 & 0xff00) + (i_15 * (i_20 & 0xff00ff) >> 8 & 0xff00ff);
                            anIntArray8979[i_18++] = i_4 + i_20;
                        }

                        ++i_8;
                        i_13 += i_11 + i_11;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    int i_21;
                    while (i_8 < i_22) {
                        while (i_13 <= i_9 || i_12 <= i_9) {
                            i_12 += i_10 + i_10;
                            i_13 += i_10++ + i_10;
                        }

                        i_15 = i_1 - i_10 + 1;
                        if (i_15 < anInt8983) {
                            i_15 = anInt8983;
                        }

                        i_16 = i_10 + i_1;
                        if (i_16 > anInt9002) {
                            i_16 = anInt9002;
                        }

                        i_17 = i_15 + anInt8980 * i_8;

                        for (i_18 = i_15; i_18 < i_16; i_18++) {
                            i_19 = anIntArray8979[i_17];
                            i_20 = i_4 + i_19;
                            i_21 = (i_4 & 0xff00ff) + (i_19 & 0xff00ff);
                            i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
                            anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
                        }

                        ++i_8;
                        i_12 -= i_11-- + i_11;
                        i_13 -= i_11 + i_11;
                    }

                    i_10 = i_3;
                    i_11 = -i_11;
                    i_13 = i_11 * i_11 + i_9;
                    i_12 = i_13 - i_3;

                    for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
                        while (i_13 > i_9 && i_12 > i_9) {
                            i_13 -= i_10-- + i_10;
                            i_12 -= i_10 + i_10;
                        }

                        i_15 = i_1 - i_10;
                        if (i_15 < anInt8983) {
                            i_15 = anInt8983;
                        }

                        i_16 = i_10 + i_1;
                        if (i_16 > anInt9002 - 1) {
                            i_16 = anInt9002 - 1;
                        }

                        i_17 = i_15 + anInt8980 * i_8;

                        for (i_18 = i_15; i_18 <= i_16; i_18++) {
                            i_19 = anIntArray8979[i_17];
                            i_20 = i_4 + i_19;
                            i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
                            i_19 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
                            anIntArray8979[i_17++] = i_20 - i_19 | i_19 - (i_19 >>> 8);
                        }

                        ++i_8;
                        i_13 += i_11 + i_11;
                    }
                }
            } else {
                while (i_8 < i_22) {
                    while (i_13 <= i_9 || i_12 <= i_9) {
                        i_12 += i_10 + i_10;
                        i_13 += i_10++ + i_10;
                    }

                    i_15 = 1 + (i_1 - i_10);
                    if (i_15 < anInt8983) {
                        i_15 = anInt8983;
                    }

                    i_16 = i_10 + i_1;
                    if (i_16 > anInt9002) {
                        i_16 = anInt9002;
                    }

                    i_17 = i_15 + i_8 * anInt8980;

                    for (i_18 = i_15; i_18 < i_16; i_18++) {
                        anIntArray8979[i_17++] = i_4;
                    }

                    ++i_8;
                    i_12 -= i_11-- + i_11;
                    i_13 -= i_11 + i_11;
                }

                i_10 = i_3;
                i_11 = i_8 - i_22;
                i_13 = i_11 * i_11 + i_9;
                i_12 = i_13 - i_3;

                for (i_13 -= i_11; i_8 < i_7; i_12 += i_11++ + i_11) {
                    while (i_13 > i_9 && i_12 > i_9) {
                        i_13 -= i_10-- + i_10;
                        i_12 -= i_10 + i_10;
                    }

                    i_15 = i_1 - i_10;
                    if (i_15 < anInt8983) {
                        i_15 = anInt8983;
                    }

                    i_16 = i_1 + i_10;
                    if (i_16 > anInt9002 - 1) {
                        i_16 = anInt9002 - 1;
                    }

                    i_17 = i_15 + i_8 * anInt8980;

                    for (i_18 = i_15; i_18 <= i_16; i_18++) {
                        anIntArray8979[i_17++] = i_4;
                    }

                    ++i_8;
                    i_13 += i_11 + i_11;
                }

                return;
            }
        }

    }

    @Override
    public void method8514(int i_1, int i_2, int i_3, int i_4) {
        anInt8998 = i_1;
        anInt8999 = i_2;
        anInt9000 = i_3;
        anInt9001 = i_4;
        method14364();
    }

    @Override
    public void fs(int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_12 = i_1;
        int i_31 = i_3;
        if (anIntArray8979 != null && i_2 >= anInt9009 && i_2 < anInt8986) {
            if (i_12 < anInt8983) {
                i_31 -= anInt8983 - i_12;
                i_12 = anInt8983;
            }

            if (i_31 + i_12 > anInt9002) {
                i_31 = anInt9002 - i_12;
            }

            int i_6 = i_2 * anInt8980 + i_12;
            int i_7 = i_4 >>> 24;
            int i_8;
            if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
                for (i_8 = 0; i_8 < i_31; i_8++) {
                    anIntArray8979[i_6 + i_8] = i_4;
                }
            } else {
                int i_9;
                int i_10;
                if (i_5 == 1) {
                    i_4 = ((i_4 & 0xff00) * i_7 >> 8 & 0xff00) + ((i_4 & 0xff00ff) * i_7 >> 8 & 0xff00ff) + (i_7 << 24);
                    i_8 = 256 - i_7;

                    for (i_9 = 0; i_9 < i_31; i_9++) {
                        i_10 = anIntArray8979[i_9 + i_6];
                        i_10 = (i_8 * (i_10 & 0xff00) >> 8 & 0xff00) + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff);
                        anIntArray8979[i_9 + i_6] = i_4 + i_10;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (i_8 = 0; i_8 < i_31; i_8++) {
                        i_9 = anIntArray8979[i_6 + i_8];
                        i_10 = i_9 + i_4;
                        int i_11 = (i_4 & 0xff00ff) + (i_9 & 0xff00ff);
                        i_9 = (i_10 - i_11 & 0x10000) + (i_11 & 0x1000100);
                        anIntArray8979[i_8 + i_6] = i_10 - i_9 | i_9 - (i_9 >>> 8);
                    }
                }
            }
        }

    }

    @Override
    public boolean method8605() {
        return false;
    }

    @Override
    public void ej(float f_1, float f_2) {
        aFloat8978 = f_2 - f_1;
        aFloat8985 = f_2 + f_1 - 1.0F;

        for (int i_3 = 0; i_3 < anInt9008; i_3++) {
            Class185 class185_4 = aClass185Array8984[i_3];
            ChoppyItemFixClass choppyitemfixclass_5 = class185_4.aClass144_2310;
            choppyitemfixclass_5.aFloat1683 = aFloat8978;
            choppyitemfixclass_5.aFloat1682 = aFloat8985;
        }

    }

    @Override
    public void fo(int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_21 = i_2;
        int i_31 = i_3;
        if (anIntArray8979 != null && i_1 >= anInt8983 && i_1 < anInt9002) {
            if (i_21 < anInt9009) {
                i_31 -= anInt9009 - i_21;
                i_21 = anInt9009;
            }

            if (i_21 + i_31 > anInt8986) {
                i_31 = anInt8986 - i_21;
            }

            int i_6 = i_21 * anInt8980 + i_1;
            int i_7 = i_4 >>> 24;
            int i_8;
            if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
                for (i_8 = 0; i_8 < i_31; i_8++) {
                    anIntArray8979[i_6 + anInt8980 * i_8] = i_4;
                }
            } else {
                int i_9;
                int i_10;
                int i_11;
                if (i_5 == 1) {
                    i_4 = ((i_4 & 0xff00ff) * i_7 >> 8 & 0xff00ff) + ((i_4 & 0xff00) * i_7 >> 8 & 0xff00) + (i_7 << 24);
                    i_8 = 256 - i_7;

                    for (i_9 = 0; i_9 < i_31; i_9++) {
                        i_10 = i_6 + i_9 * anInt8980;
                        i_11 = anIntArray8979[i_10];
                        i_11 = ((i_11 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_11 & 0xff00) * i_8 >> 8 & 0xff00);
                        anIntArray8979[i_10] = i_4 + i_11;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (i_8 = 0; i_8 < i_31; i_8++) {
                        i_9 = anInt8980 * i_8 + i_6;
                        i_10 = anIntArray8979[i_9];
                        i_11 = i_10 + i_4;
                        int i_12 = (i_4 & 0xff00ff) + (i_10 & 0xff00ff);
                        i_10 = (i_12 & 0x1000100) + (i_11 - i_12 & 0x10000);
                        anIntArray8979[i_9] = i_11 - i_10 | i_10 - (i_10 >>> 8);
                    }
                }
            }
        }

    }

    @Override
    public void fl(int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_21 = i_2;
        int i_31 = i_3;
        if (anIntArray8979 != null && i_1 >= anInt8983 && i_1 < anInt9002) {
            if (i_21 < anInt9009) {
                i_31 -= anInt9009 - i_21;
                i_21 = anInt9009;
            }

            if (i_21 + i_31 > anInt8986) {
                i_31 = anInt8986 - i_21;
            }

            int i_6 = i_21 * anInt8980 + i_1;
            int i_7 = i_4 >>> 24;
            int i_8;
            if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
                for (i_8 = 0; i_8 < i_31; i_8++) {
                    anIntArray8979[i_6 + anInt8980 * i_8] = i_4;
                }
            } else {
                int i_9;
                int i_10;
                int i_11;
                if (i_5 == 1) {
                    i_4 = ((i_4 & 0xff00ff) * i_7 >> 8 & 0xff00ff) + ((i_4 & 0xff00) * i_7 >> 8 & 0xff00) + (i_7 << 24);
                    i_8 = 256 - i_7;

                    for (i_9 = 0; i_9 < i_31; i_9++) {
                        i_10 = i_6 + i_9 * anInt8980;
                        i_11 = anIntArray8979[i_10];
                        i_11 = ((i_11 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_11 & 0xff00) * i_8 >> 8 & 0xff00);
                        anIntArray8979[i_10] = i_4 + i_11;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (i_8 = 0; i_8 < i_31; i_8++) {
                        i_9 = anInt8980 * i_8 + i_6;
                        i_10 = anIntArray8979[i_9];
                        i_11 = i_10 + i_4;
                        int i_12 = (i_4 & 0xff00ff) + (i_10 & 0xff00ff);
                        i_10 = (i_12 & 0x1000100) + (i_11 - i_12 & 0x10000);
                        anIntArray8979[i_9] = i_11 - i_10 | i_10 - (i_10 >>> 8);
                    }
                }
            }
        }

    }

    @Override
    public Class455 method8553(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new Class455_Sub3(ints_3, ints_4);
    }

    @Override
    public void method8415(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_14 = i_1;
        int i_31 = i_3;
        int i_21 = i_2;
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            i_31 -= i_14;
            i_41 -= i_21;
            if (i_41 == 0) {
                if (i_31 >= 0) {
                    XA(i_14, i_21, 1 + i_31, i_5, i_6);
                } else {
                    XA(i_14 + i_31, i_21, -i_31 + 1, i_5, i_6);
                }
            } else if (i_31 == 0) {
                if (i_41 >= 0) {
                    G(i_14, i_21, 1 + i_41, i_5, i_6);
                } else {
                    G(i_14, i_21 + i_41, -i_41 + 1, i_5, i_6);
                }
            } else {
                if (i_31 + i_41 < 0) {
                    i_14 += i_31;
                    i_31 = -i_31;
                    i_21 += i_41;
                    i_41 = -i_41;
                }

                int i_7;
                int i_8;
                int i_9;
                int i_10;
                int i_11;
                int i_12;
                int i_13;
                if (i_31 > i_41) {
                    i_21 <<= 16;
                    i_21 += 32768;
                    i_41 <<= 16;
                    i_7 = (int) Math.floor(0.5D + (double) i_41 / i_31);
                    i_31 += i_14;
                    if (i_14 < anInt8983) {
                        i_21 += (anInt8983 - i_14) * i_7;
                        i_14 = anInt8983;
                    }

                    if (i_31 >= anInt9002) {
                        i_31 = anInt9002 - 1;
                    }

                    i_8 = i_5 >>> 24;
                    if (i_6 != 0 && (i_6 != 1 || i_8 != 255)) {
                        if (i_6 == 1) {
                            i_5 = (i_8 << 24) + ((i_5 & 0xff00) * i_8 >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_8 >> 8 & 0xff00ff);

                            for (i_9 = 256 - i_8; i_14 <= i_31; i_14++) {
                                i_10 = i_21 >> 16;
                                if (i_10 >= anInt9009 && i_10 < anInt8986) {
                                    i_11 = i_14 + anInt8980 * i_10;
                                    i_12 = anIntArray8979[i_11];
                                    i_12 = (i_9 * (i_12 & 0xff00ff) >> 8 & 0xff00ff) + (i_9 * (i_12 & 0xff00) >> 8 & 0xff00);
                                    anIntArray8979[i_11] = i_5 + i_12;
                                }

                                i_21 += i_7;
                            }
                        } else {
                            if (i_6 != 2) {
                                throw new IllegalArgumentException();
                            }

                            while (i_14 <= i_31) {
                                i_9 = i_21 >> 16;
                                if (i_9 >= anInt9009 && i_9 < anInt8986) {
                                    i_10 = i_14 + i_9 * anInt8980;
                                    i_11 = anIntArray8979[i_10];
                                    i_12 = i_5 + i_11;
                                    i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
                                    i_11 = (i_13 & 0x1000100) + (i_12 - i_13 & 0x10000);
                                    anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
                                }

                                i_21 += i_7;
                                ++i_14;
                            }
                        }
                    } else {
                        while (i_14 <= i_31) {
                            i_9 = i_21 >> 16;
                            if (i_9 >= anInt9009 && i_9 < anInt8986) {
                                anIntArray8979[i_14 + i_9 * anInt8980] = i_5;
                            }

                            i_21 += i_7;
                            ++i_14;
                        }
                    }
                } else {
                    i_14 <<= 16;
                    i_14 += 32768;
                    i_31 <<= 16;
                    i_7 = (int) Math.floor((double) i_31 / i_41 + 0.5D);
                    i_41 += i_21;
                    if (i_21 < anInt9009) {
                        i_14 += (anInt9009 - i_21) * i_7;
                        i_21 = anInt9009;
                    }

                    if (i_41 >= anInt8986) {
                        i_41 = anInt8986 - 1;
                    }

                    i_8 = i_5 >>> 24;
                    if (i_6 == 0 || i_6 == 1 && i_8 == 255) {
                        while (i_21 <= i_41) {
                            i_9 = i_14 >> 16;
                            if (i_9 >= anInt8983 && i_9 < anInt9002) {
                                anIntArray8979[i_9 + anInt8980 * i_21] = i_5;
                            }

                            i_14 += i_7;
                            ++i_21;
                        }
                    } else if (i_6 == 1) {
                        i_5 = (i_8 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_8 >> 8 & 0xff00) + (i_8 << 24);

                        for (i_9 = 256 - i_8; i_21 <= i_41; i_21++) {
                            i_10 = i_14 >> 16;
                            if (i_10 >= anInt8983 && i_10 < anInt9002) {
                                i_11 = anInt8980 * i_21 + i_10;
                                i_12 = anIntArray8979[i_11];
                                i_12 = ((i_12 & 0xff00ff) * i_9 >> 8 & 0xff00ff) + ((i_12 & 0xff00) * i_9 >> 8 & 0xff00);
                                anIntArray8979[anInt8980 * i_21 + i_10] = i_5 + i_12;
                            }

                            i_14 += i_7;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_21 <= i_41) {
                            i_9 = i_14 >> 16;
                            if (i_9 >= anInt8983 && i_9 < anInt9002) {
                                i_10 = i_9 + i_21 * anInt8980;
                                i_11 = anIntArray8979[i_10];
                                i_12 = i_11 + i_5;
                                i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_11 = (i_12 - i_13 & 0x10000) + (i_13 & 0x1000100);
                                anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
                            }

                            i_14 += i_7;
                            ++i_21;
                        }
                    }
                }
            }
        }

    }

    @Override
    public void method8526(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_14 = i_1;
        int i_31 = i_3;
        int i_21 = i_2;
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            i_31 -= i_14;
            i_41 -= i_21;
            if (i_41 == 0) {
                if (i_31 >= 0) {
                    XA(i_14, i_21, 1 + i_31, i_5, i_6);
                } else {
                    XA(i_14 + i_31, i_21, -i_31 + 1, i_5, i_6);
                }
            } else if (i_31 == 0) {
                if (i_41 >= 0) {
                    G(i_14, i_21, 1 + i_41, i_5, i_6);
                } else {
                    G(i_14, i_21 + i_41, -i_41 + 1, i_5, i_6);
                }
            } else {
                if (i_31 + i_41 < 0) {
                    i_14 += i_31;
                    i_31 = -i_31;
                    i_21 += i_41;
                    i_41 = -i_41;
                }

                int i_7;
                int i_8;
                int i_9;
                int i_10;
                int i_11;
                int i_12;
                int i_13;
                if (i_31 > i_41) {
                    i_21 <<= 16;
                    i_21 += 32768;
                    i_41 <<= 16;
                    i_7 = (int) Math.floor(0.5D + (double) i_41 / i_31);
                    i_31 += i_14;
                    if (i_14 < anInt8983) {
                        i_21 += (anInt8983 - i_14) * i_7;
                        i_14 = anInt8983;
                    }

                    if (i_31 >= anInt9002) {
                        i_31 = anInt9002 - 1;
                    }

                    i_8 = i_5 >>> 24;
                    if (i_6 != 0 && (i_6 != 1 || i_8 != 255)) {
                        if (i_6 == 1) {
                            i_5 = (i_8 << 24) + ((i_5 & 0xff00) * i_8 >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_8 >> 8 & 0xff00ff);

                            for (i_9 = 256 - i_8; i_14 <= i_31; i_14++) {
                                i_10 = i_21 >> 16;
                                if (i_10 >= anInt9009 && i_10 < anInt8986) {
                                    i_11 = i_14 + anInt8980 * i_10;
                                    i_12 = anIntArray8979[i_11];
                                    i_12 = (i_9 * (i_12 & 0xff00ff) >> 8 & 0xff00ff) + (i_9 * (i_12 & 0xff00) >> 8 & 0xff00);
                                    anIntArray8979[i_11] = i_5 + i_12;
                                }

                                i_21 += i_7;
                            }
                        } else {
                            if (i_6 != 2) {
                                throw new IllegalArgumentException();
                            }

                            while (i_14 <= i_31) {
                                i_9 = i_21 >> 16;
                                if (i_9 >= anInt9009 && i_9 < anInt8986) {
                                    i_10 = i_14 + i_9 * anInt8980;
                                    i_11 = anIntArray8979[i_10];
                                    i_12 = i_5 + i_11;
                                    i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
                                    i_11 = (i_13 & 0x1000100) + (i_12 - i_13 & 0x10000);
                                    anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
                                }

                                i_21 += i_7;
                                ++i_14;
                            }
                        }
                    } else {
                        while (i_14 <= i_31) {
                            i_9 = i_21 >> 16;
                            if (i_9 >= anInt9009 && i_9 < anInt8986) {
                                anIntArray8979[i_14 + i_9 * anInt8980] = i_5;
                            }

                            i_21 += i_7;
                            ++i_14;
                        }
                    }
                } else {
                    i_14 <<= 16;
                    i_14 += 32768;
                    i_31 <<= 16;
                    i_7 = (int) Math.floor((double) i_31 / i_41 + 0.5D);
                    i_41 += i_21;
                    if (i_21 < anInt9009) {
                        i_14 += (anInt9009 - i_21) * i_7;
                        i_21 = anInt9009;
                    }

                    if (i_41 >= anInt8986) {
                        i_41 = anInt8986 - 1;
                    }

                    i_8 = i_5 >>> 24;
                    if (i_6 == 0 || i_6 == 1 && i_8 == 255) {
                        while (i_21 <= i_41) {
                            i_9 = i_14 >> 16;
                            if (i_9 >= anInt8983 && i_9 < anInt9002) {
                                anIntArray8979[i_9 + anInt8980 * i_21] = i_5;
                            }

                            i_14 += i_7;
                            ++i_21;
                        }
                    } else if (i_6 == 1) {
                        i_5 = (i_8 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_8 >> 8 & 0xff00) + (i_8 << 24);

                        for (i_9 = 256 - i_8; i_21 <= i_41; i_21++) {
                            i_10 = i_14 >> 16;
                            if (i_10 >= anInt8983 && i_10 < anInt9002) {
                                i_11 = anInt8980 * i_21 + i_10;
                                i_12 = anIntArray8979[i_11];
                                i_12 = ((i_12 & 0xff00ff) * i_9 >> 8 & 0xff00ff) + ((i_12 & 0xff00) * i_9 >> 8 & 0xff00);
                                anIntArray8979[anInt8980 * i_21 + i_10] = i_5 + i_12;
                            }

                            i_14 += i_7;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_21 <= i_41) {
                            i_9 = i_14 >> 16;
                            if (i_9 >= anInt8983 && i_9 < anInt9002) {
                                i_10 = i_9 + i_21 * anInt8980;
                                i_11 = anIntArray8979[i_10];
                                i_12 = i_11 + i_5;
                                i_13 = (i_11 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_11 = (i_12 - i_13 & 0x10000) + (i_13 & 0x1000100);
                                anIntArray8979[i_10] = i_12 - i_11 | i_11 - (i_11 >>> 8);
                            }

                            i_14 += i_7;
                            ++i_21;
                        }
                    }
                }
            }
        }

    }

    @Override
    public Matrix44 method8588() {
        return new Matrix44(aClass384_8995);
    }

    @Override
    public void method8494(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        if (anIntArray8979 != null) {
            i_3 -= i_1;
            i_4 -= i_2;
            int i_10;
            if (i_4 == 0) {
                if (i_3 >= 0) {
                    method14366(i_1, i_2, 1 + i_3, i_5, i_6, i_7, i_8, i_9);
                } else {
                    i_10 = i_7 + i_8;
                    i_9 %= i_10;
                    i_9 = i_10 + i_7 - i_9 - (1 + -i_3) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14366(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6, i_7, i_8, i_9);
                }
            } else if (i_3 == 0) {
                if (i_4 >= 0) {
                    method14399(i_1, i_2, 1 + i_4, i_5, i_6, i_7, i_8, i_9);
                } else {
                    i_10 = i_8 + i_7;
                    i_9 %= i_10;
                    i_9 = i_7 + i_10 - i_9 - (-i_4 + 1) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14399(i_1, i_2 + i_4, 1 + -i_4, i_5, i_6, i_7, i_8, i_9);
                }
            } else {
                i_9 <<= 8;
                i_7 <<= 8;
                i_8 <<= 8;
                i_10 = i_8 + i_7;
                i_9 %= i_10;
                int i_11;
                int i_12;
                if (i_3 + i_4 < 0) {
                    i_11 = (int) (Math.sqrt(i_3 * i_3 + i_4 * i_4) * 256.0D);
                    i_12 = i_11 % i_10;
                    i_9 = i_7 + i_10 - i_9 - i_12;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    i_1 += i_3;
                    i_3 = -i_3;
                    i_2 += i_4;
                    i_4 = -i_4;
                }

                int i_13;
                int i_14;
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                if (i_3 > i_4) {
                    i_2 <<= 16;
                    i_2 += 32768;
                    i_4 <<= 16;
                    i_11 = (int) Math.floor((double) i_4 / i_3 + 0.5D);
                    i_3 += i_1;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if (i_6 == 0 || i_6 == 1 && i_12 == 255) {
                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                anIntArray8979[i_1 + anInt8980 * i_14] = i_5;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    } else if (i_6 == 1) {
                        i_5 = (i_12 << 24) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00) + (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);

                        for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
                            i_15 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_15 >= anInt9009 && i_15 < anInt8986 && i_9 < i_7) {
                                i_16 = i_15 * anInt8980 + i_1;
                                i_17 = anIntArray8979[i_16];
                                i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_16] = i_17 + i_5;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                i_15 = i_1 + i_14 * anInt8980;
                                i_16 = anIntArray8979[i_15];
                                i_17 = i_16 + i_5;
                                i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                } else {
                    i_1 <<= 16;
                    i_1 += 32768;
                    i_3 <<= 16;
                    i_11 = (int) Math.floor((double) i_3 / i_4 + 0.5D);
                    i_4 += i_2;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if (i_6 != 0 && (i_6 != 1 || i_12 != 255)) {
                        if (i_6 == 1) {
                            i_5 = (i_12 << 24) + ((i_5 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00);

                            for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
                                i_15 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_15 >= anInt8983 && i_15 < anInt9002 && i_9 < i_7) {
                                    i_16 = i_2 * anInt8980 + i_15;
                                    i_17 = anIntArray8979[i_16];
                                    i_17 = (i_14 * (i_17 & 0xff00ff) >> 8 & 0xff00ff) + ((i_17 & 0xff00) * i_14 >> 8 & 0xff00);
                                    anIntArray8979[i_15 + anInt8980 * i_2] = i_17 + i_5;
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                            }
                        } else {
                            if (i_6 != 2) {
                                throw new IllegalArgumentException();
                            }

                            while (i_2 <= i_4) {
                                i_14 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                    i_15 = i_2 * anInt8980 + i_14;
                                    i_16 = anIntArray8979[i_15];
                                    i_17 = i_16 + i_5;
                                    i_18 = (i_5 & 0xff00ff) + (i_16 & 0xff00ff);
                                    i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                    anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                                i_9 %= i_10;
                            }
                        }
                    } else {
                        while (i_2 <= i_4) {
                            i_14 = i_1 >> 16;
                            if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                anIntArray8979[i_14 + i_2 * anInt8980] = i_5;
                            }

                            i_1 += i_11;
                            ++i_2;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                }
            }
        }

    }

    @Override
    public void method8529(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        if (anIntArray8979 != null) {
            i_3 -= i_1;
            i_4 -= i_2;
            int i_10;
            if (i_4 == 0) {
                if (i_3 >= 0) {
                    method14366(i_1, i_2, 1 + i_3, i_5, i_6, i_7, i_8, i_9);
                } else {
                    i_10 = i_7 + i_8;
                    i_9 %= i_10;
                    i_9 = i_10 + i_7 - i_9 - (1 + -i_3) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14366(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6, i_7, i_8, i_9);
                }
            } else if (i_3 == 0) {
                if (i_4 >= 0) {
                    method14399(i_1, i_2, 1 + i_4, i_5, i_6, i_7, i_8, i_9);
                } else {
                    i_10 = i_8 + i_7;
                    i_9 %= i_10;
                    i_9 = i_7 + i_10 - i_9 - (-i_4 + 1) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14399(i_1, i_2 + i_4, 1 + -i_4, i_5, i_6, i_7, i_8, i_9);
                }
            } else {
                i_9 <<= 8;
                i_7 <<= 8;
                i_8 <<= 8;
                i_10 = i_8 + i_7;
                i_9 %= i_10;
                int i_11;
                int i_12;
                if (i_3 + i_4 < 0) {
                    i_11 = (int) (Math.sqrt(i_3 * i_3 + i_4 * i_4) * 256.0D);
                    i_12 = i_11 % i_10;
                    i_9 = i_7 + i_10 - i_9 - i_12;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    i_1 += i_3;
                    i_3 = -i_3;
                    i_2 += i_4;
                    i_4 = -i_4;
                }

                int i_13;
                int i_14;
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                if (i_3 > i_4) {
                    i_2 <<= 16;
                    i_2 += 32768;
                    i_4 <<= 16;
                    i_11 = (int) Math.floor((double) i_4 / i_3 + 0.5D);
                    i_3 += i_1;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if (i_6 == 0 || i_6 == 1 && i_12 == 255) {
                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                anIntArray8979[i_1 + anInt8980 * i_14] = i_5;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    } else if (i_6 == 1) {
                        i_5 = (i_12 << 24) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00) + (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);

                        for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
                            i_15 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_15 >= anInt9009 && i_15 < anInt8986 && i_9 < i_7) {
                                i_16 = i_15 * anInt8980 + i_1;
                                i_17 = anIntArray8979[i_16];
                                i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_16] = i_17 + i_5;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                i_15 = i_1 + i_14 * anInt8980;
                                i_16 = anIntArray8979[i_15];
                                i_17 = i_16 + i_5;
                                i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                } else {
                    i_1 <<= 16;
                    i_1 += 32768;
                    i_3 <<= 16;
                    i_11 = (int) Math.floor((double) i_3 / i_4 + 0.5D);
                    i_4 += i_2;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if (i_6 != 0 && (i_6 != 1 || i_12 != 255)) {
                        if (i_6 == 1) {
                            i_5 = (i_12 << 24) + ((i_5 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00);

                            for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
                                i_15 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_15 >= anInt8983 && i_15 < anInt9002 && i_9 < i_7) {
                                    i_16 = i_2 * anInt8980 + i_15;
                                    i_17 = anIntArray8979[i_16];
                                    i_17 = (i_14 * (i_17 & 0xff00ff) >> 8 & 0xff00ff) + ((i_17 & 0xff00) * i_14 >> 8 & 0xff00);
                                    anIntArray8979[i_15 + anInt8980 * i_2] = i_17 + i_5;
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                            }
                        } else {
                            if (i_6 != 2) {
                                throw new IllegalArgumentException();
                            }

                            while (i_2 <= i_4) {
                                i_14 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                    i_15 = i_2 * anInt8980 + i_14;
                                    i_16 = anIntArray8979[i_15];
                                    i_17 = i_16 + i_5;
                                    i_18 = (i_5 & 0xff00ff) + (i_16 & 0xff00ff);
                                    i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                    anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                                i_9 %= i_10;
                            }
                        }
                    } else {
                        while (i_2 <= i_4) {
                            i_14 = i_1 >> 16;
                            if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                anIntArray8979[i_14 + i_2 * anInt8980] = i_5;
                            }

                            i_1 += i_11;
                            ++i_2;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                }
            }
        }

    }

    @Override
    public void method8530(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        if (anIntArray8979 != null) {
            i_3 -= i_1;
            i_4 -= i_2;
            int i_10;
            if (i_4 == 0) {
                if (i_3 >= 0) {
                    method14366(i_1, i_2, 1 + i_3, i_5, i_6, i_7, i_8, i_9);
                } else {
                    i_10 = i_7 + i_8;
                    i_9 %= i_10;
                    i_9 = i_10 + i_7 - i_9 - (1 + -i_3) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14366(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6, i_7, i_8, i_9);
                }
            } else if (i_3 == 0) {
                if (i_4 >= 0) {
                    method14399(i_1, i_2, 1 + i_4, i_5, i_6, i_7, i_8, i_9);
                } else {
                    i_10 = i_8 + i_7;
                    i_9 %= i_10;
                    i_9 = i_7 + i_10 - i_9 - (-i_4 + 1) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14399(i_1, i_2 + i_4, 1 + -i_4, i_5, i_6, i_7, i_8, i_9);
                }
            } else {
                i_9 <<= 8;
                i_7 <<= 8;
                i_8 <<= 8;
                i_10 = i_8 + i_7;
                i_9 %= i_10;
                int i_11;
                int i_12;
                if (i_3 + i_4 < 0) {
                    i_11 = (int) (Math.sqrt(i_3 * i_3 + i_4 * i_4) * 256.0D);
                    i_12 = i_11 % i_10;
                    i_9 = i_7 + i_10 - i_9 - i_12;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    i_1 += i_3;
                    i_3 = -i_3;
                    i_2 += i_4;
                    i_4 = -i_4;
                }

                int i_13;
                int i_14;
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                if (i_3 > i_4) {
                    i_2 <<= 16;
                    i_2 += 32768;
                    i_4 <<= 16;
                    i_11 = (int) Math.floor((double) i_4 / i_3 + 0.5D);
                    i_3 += i_1;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if (i_6 == 0 || i_6 == 1 && i_12 == 255) {
                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                anIntArray8979[i_1 + anInt8980 * i_14] = i_5;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    } else if (i_6 == 1) {
                        i_5 = (i_12 << 24) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00) + (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);

                        for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
                            i_15 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_15 >= anInt9009 && i_15 < anInt8986 && i_9 < i_7) {
                                i_16 = i_15 * anInt8980 + i_1;
                                i_17 = anIntArray8979[i_16];
                                i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_16] = i_17 + i_5;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                i_15 = i_1 + i_14 * anInt8980;
                                i_16 = anIntArray8979[i_15];
                                i_17 = i_16 + i_5;
                                i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                } else {
                    i_1 <<= 16;
                    i_1 += 32768;
                    i_3 <<= 16;
                    i_11 = (int) Math.floor((double) i_3 / i_4 + 0.5D);
                    i_4 += i_2;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if (i_6 != 0 && (i_6 != 1 || i_12 != 255)) {
                        if (i_6 == 1) {
                            i_5 = (i_12 << 24) + ((i_5 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00);

                            for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
                                i_15 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_15 >= anInt8983 && i_15 < anInt9002 && i_9 < i_7) {
                                    i_16 = i_2 * anInt8980 + i_15;
                                    i_17 = anIntArray8979[i_16];
                                    i_17 = (i_14 * (i_17 & 0xff00ff) >> 8 & 0xff00ff) + ((i_17 & 0xff00) * i_14 >> 8 & 0xff00);
                                    anIntArray8979[i_15 + anInt8980 * i_2] = i_17 + i_5;
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                            }
                        } else {
                            if (i_6 != 2) {
                                throw new IllegalArgumentException();
                            }

                            while (i_2 <= i_4) {
                                i_14 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                    i_15 = i_2 * anInt8980 + i_14;
                                    i_16 = anIntArray8979[i_15];
                                    i_17 = i_16 + i_5;
                                    i_18 = (i_5 & 0xff00ff) + (i_16 & 0xff00ff);
                                    i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                    anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                                i_9 %= i_10;
                            }
                        }
                    } else {
                        while (i_2 <= i_4) {
                            i_14 = i_1 >> 16;
                            if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                anIntArray8979[i_14 + i_2 * anInt8980] = i_5;
                            }

                            i_1 += i_11;
                            ++i_2;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                }
            }
        }

    }

    @Override
    public void method8576(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
        int i_11 = i_1;
        int i_31 = i_3;
        int i_24 = i_2;
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
            int[] ints_11 = packetsdecoder_10.anIntArray9077;
            int[] ints_12 = packetsdecoder_10.anIntArray9078;
            int i_13 = Math.max(anInt9009, i_9);
            int i_14 = Math.min(anInt8986, i_9 + ints_11.length);
            i_31 -= i_11;
            i_41 -= i_24;
            if (i_41 + i_31 < 0) {
                i_11 += i_31;
                i_31 = -i_31;
                i_24 += i_41;
                i_41 = -i_41;
            }

            int i_15;
            int i_16;
            int i_17;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            int i_23;
            if (i_31 > i_41) {
                i_24 <<= 16;
                i_24 += 32768;
                i_41 <<= 16;
                i_15 = (int) Math.floor((double) i_41 / i_31 + 0.5D);
                i_31 += i_11;
                if (i_11 < anInt8983) {
                    i_24 += (anInt8983 - i_11) * i_15;
                    i_11 = anInt8983;
                }

                if (i_31 >= anInt9002) {
                    i_31 = anInt9002 - 1;
                }

                i_16 = i_5 >>> 24;
                if (i_6 == 0 || i_6 == 1 && i_16 == 255) {
                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = ints_11[i_18] + i_8;
                            if (i_11 >= i_19 && i_11 < ints_12[i_18] + i_19) {
                                anIntArray8979[i_17 * anInt8980 + i_11] = i_5;
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                } else if (i_6 == 1) {
                    i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_16 >> 8 & 0xff00) + (i_16 << 24);

                    for (i_17 = 256 - i_16; i_11 <= i_31; i_11++) {
                        i_18 = i_24 >> 16;
                        i_19 = i_18 - i_9;
                        if (i_18 >= i_13 && i_18 < i_14) {
                            i_20 = ints_11[i_19] + i_8;
                            if (i_11 >= i_20 && i_11 < i_20 + ints_12[i_19]) {
                                i_21 = i_11 + anInt8980 * i_18;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff);
                                anIntArray8979[i_21] = i_5 + i_22;
                            }
                        }

                        i_24 += i_15;
                    }
                } else {
                    if (i_6 != 2) {
                        throw new IllegalArgumentException();
                    }

                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = i_8 + ints_11[i_18];
                            if (i_11 >= i_19 && i_11 < ints_12[i_18] + i_19) {
                                i_20 = i_17 * anInt8980 + i_11;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_21 + i_5;
                                i_23 = (i_5 & 0xff00ff) + (i_21 & 0xff00ff);
                                i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                }
            } else {
                i_11 <<= 16;
                i_11 += 32768;
                i_31 <<= 16;
                i_15 = (int) Math.floor(0.5D + (double) i_31 / i_41);
                i_41 += i_24;
                if (i_24 < i_13) {
                    i_11 += (i_13 - i_24) * i_15;
                    i_24 = i_13;
                }

                if (i_41 >= i_14) {
                    i_41 = i_14 - 1;
                }

                i_16 = i_5 >>> 24;
                if (i_6 != 0 && (i_6 != 1 || i_16 != 255)) {
                    if (i_6 == 1) {
                        i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24);

                        for (i_17 = 256 - i_16; i_24 <= i_41; i_24++) {
                            i_18 = i_11 >> 16;
                            i_19 = i_24 - i_9;
                            i_20 = i_8 + ints_11[i_19];
                            if (i_18 >= anInt8983 && i_18 < anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
                                i_21 = i_18 + i_24 * anInt8980;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_18 + i_24 * anInt8980] = i_22 + i_5;
                            }

                            i_11 += i_15;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_24 <= i_41) {
                            i_17 = i_11 >> 16;
                            i_18 = i_24 - i_9;
                            i_19 = ints_11[i_18] + i_8;
                            if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
                                i_20 = anInt8980 * i_24 + i_17;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_5 + i_21;
                                i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_21 = (i_22 - i_23 & 0x10000) + (i_23 & 0x1000100);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }

                            i_11 += i_15;
                            ++i_24;
                        }
                    }
                } else {
                    while (i_24 <= i_41) {
                        i_17 = i_11 >> 16;
                        i_18 = i_24 - i_9;
                        i_19 = ints_11[i_18] + i_8;
                        if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < ints_12[i_18] + i_19) {
                            anIntArray8979[i_17 + anInt8980 * i_24] = i_5;
                        }

                        i_11 += i_15;
                        ++i_24;
                    }
                }
            }
        }

    }

    @Override
    public void jf() {
        for (int i_1 = 0; i_1 < aClass185Array8984.length; i_1++) {
            aClass185Array8984[i_1].anInt2307 = aClass185Array8984[i_1].anInt2336;
            aClass185Array8984[i_1].aBool2309 = false;
        }

    }

    @Override
    public void method8533(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
        int i_11 = i_1;
        int i_31 = i_3;
        int i_24 = i_2;
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
            int[] ints_11 = packetsdecoder_10.anIntArray9077;
            int[] ints_12 = packetsdecoder_10.anIntArray9078;
            int i_13 = Math.max(anInt9009, i_9);
            int i_14 = Math.min(anInt8986, i_9 + ints_11.length);
            i_31 -= i_11;
            i_41 -= i_24;
            if (i_41 + i_31 < 0) {
                i_11 += i_31;
                i_31 = -i_31;
                i_24 += i_41;
                i_41 = -i_41;
            }

            int i_15;
            int i_16;
            int i_17;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            int i_23;
            if (i_31 > i_41) {
                i_24 <<= 16;
                i_24 += 32768;
                i_41 <<= 16;
                i_15 = (int) Math.floor((double) i_41 / i_31 + 0.5D);
                i_31 += i_11;
                if (i_11 < anInt8983) {
                    i_24 += (anInt8983 - i_11) * i_15;
                    i_11 = anInt8983;
                }

                if (i_31 >= anInt9002) {
                    i_31 = anInt9002 - 1;
                }

                i_16 = i_5 >>> 24;
                if (i_6 == 0 || i_6 == 1 && i_16 == 255) {
                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = ints_11[i_18] + i_8;
                            if (i_11 >= i_19 && i_11 < ints_12[i_18] + i_19) {
                                anIntArray8979[i_17 * anInt8980 + i_11] = i_5;
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                } else if (i_6 == 1) {
                    i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_16 >> 8 & 0xff00) + (i_16 << 24);

                    for (i_17 = 256 - i_16; i_11 <= i_31; i_11++) {
                        i_18 = i_24 >> 16;
                        i_19 = i_18 - i_9;
                        if (i_18 >= i_13 && i_18 < i_14) {
                            i_20 = ints_11[i_19] + i_8;
                            if (i_11 >= i_20 && i_11 < i_20 + ints_12[i_19]) {
                                i_21 = i_11 + anInt8980 * i_18;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff);
                                anIntArray8979[i_21] = i_5 + i_22;
                            }
                        }

                        i_24 += i_15;
                    }
                } else {
                    if (i_6 != 2) {
                        throw new IllegalArgumentException();
                    }

                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = i_8 + ints_11[i_18];
                            if (i_11 >= i_19 && i_11 < ints_12[i_18] + i_19) {
                                i_20 = i_17 * anInt8980 + i_11;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_21 + i_5;
                                i_23 = (i_5 & 0xff00ff) + (i_21 & 0xff00ff);
                                i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                }
            } else {
                i_11 <<= 16;
                i_11 += 32768;
                i_31 <<= 16;
                i_15 = (int) Math.floor(0.5D + (double) i_31 / i_41);
                i_41 += i_24;
                if (i_24 < i_13) {
                    i_11 += (i_13 - i_24) * i_15;
                    i_24 = i_13;
                }

                if (i_41 >= i_14) {
                    i_41 = i_14 - 1;
                }

                i_16 = i_5 >>> 24;
                if (i_6 != 0 && (i_6 != 1 || i_16 != 255)) {
                    if (i_6 == 1) {
                        i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24);

                        for (i_17 = 256 - i_16; i_24 <= i_41; i_24++) {
                            i_18 = i_11 >> 16;
                            i_19 = i_24 - i_9;
                            i_20 = i_8 + ints_11[i_19];
                            if (i_18 >= anInt8983 && i_18 < anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
                                i_21 = i_18 + i_24 * anInt8980;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_18 + i_24 * anInt8980] = i_22 + i_5;
                            }

                            i_11 += i_15;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_24 <= i_41) {
                            i_17 = i_11 >> 16;
                            i_18 = i_24 - i_9;
                            i_19 = ints_11[i_18] + i_8;
                            if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
                                i_20 = anInt8980 * i_24 + i_17;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_5 + i_21;
                                i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_21 = (i_22 - i_23 & 0x10000) + (i_23 & 0x1000100);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }

                            i_11 += i_15;
                            ++i_24;
                        }
                    }
                } else {
                    while (i_24 <= i_41) {
                        i_17 = i_11 >> 16;
                        i_18 = i_24 - i_9;
                        i_19 = ints_11[i_18] + i_8;
                        if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < ints_12[i_18] + i_19) {
                            anIntArray8979[i_17 + anInt8980 * i_24] = i_5;
                        }

                        i_11 += i_15;
                        ++i_24;
                    }
                }
            }
        }

    }

    @Override
    public void method8575(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
        int i_11 = i_1;
        int i_31 = i_3;
        int i_24 = i_2;
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_10 = (Class455_Sub3) class455_7;
            int[] ints_11 = packetsdecoder_10.anIntArray9077;
            int[] ints_12 = packetsdecoder_10.anIntArray9078;
            int i_13 = Math.max(anInt9009, i_9);
            int i_14 = Math.min(anInt8986, i_9 + ints_11.length);
            i_31 -= i_11;
            i_41 -= i_24;
            if (i_41 + i_31 < 0) {
                i_11 += i_31;
                i_31 = -i_31;
                i_24 += i_41;
                i_41 = -i_41;
            }

            int i_15;
            int i_16;
            int i_17;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            int i_23;
            if (i_31 > i_41) {
                i_24 <<= 16;
                i_24 += 32768;
                i_41 <<= 16;
                i_15 = (int) Math.floor((double) i_41 / i_31 + 0.5D);
                i_31 += i_11;
                if (i_11 < anInt8983) {
                    i_24 += (anInt8983 - i_11) * i_15;
                    i_11 = anInt8983;
                }

                if (i_31 >= anInt9002) {
                    i_31 = anInt9002 - 1;
                }

                i_16 = i_5 >>> 24;
                if (i_6 == 0 || i_6 == 1 && i_16 == 255) {
                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = ints_11[i_18] + i_8;
                            if (i_11 >= i_19 && i_11 < ints_12[i_18] + i_19) {
                                anIntArray8979[i_17 * anInt8980 + i_11] = i_5;
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                } else if (i_6 == 1) {
                    i_5 = (i_16 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_16 >> 8 & 0xff00) + (i_16 << 24);

                    for (i_17 = 256 - i_16; i_11 <= i_31; i_11++) {
                        i_18 = i_24 >> 16;
                        i_19 = i_18 - i_9;
                        if (i_18 >= i_13 && i_18 < i_14) {
                            i_20 = ints_11[i_19] + i_8;
                            if (i_11 >= i_20 && i_11 < i_20 + ints_12[i_19]) {
                                i_21 = i_11 + anInt8980 * i_18;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00) >> 8 & 0xff00) + (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff);
                                anIntArray8979[i_21] = i_5 + i_22;
                            }
                        }

                        i_24 += i_15;
                    }
                } else {
                    if (i_6 != 2) {
                        throw new IllegalArgumentException();
                    }

                    while (i_11 <= i_31) {
                        i_17 = i_24 >> 16;
                        i_18 = i_17 - i_9;
                        if (i_17 >= i_13 && i_17 < i_14) {
                            i_19 = i_8 + ints_11[i_18];
                            if (i_11 >= i_19 && i_11 < ints_12[i_18] + i_19) {
                                i_20 = i_17 * anInt8980 + i_11;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_21 + i_5;
                                i_23 = (i_5 & 0xff00ff) + (i_21 & 0xff00ff);
                                i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }
                        }

                        i_24 += i_15;
                        ++i_11;
                    }
                }
            } else {
                i_11 <<= 16;
                i_11 += 32768;
                i_31 <<= 16;
                i_15 = (int) Math.floor(0.5D + (double) i_31 / i_41);
                i_41 += i_24;
                if (i_24 < i_13) {
                    i_11 += (i_13 - i_24) * i_15;
                    i_24 = i_13;
                }

                if (i_41 >= i_14) {
                    i_41 = i_14 - 1;
                }

                i_16 = i_5 >>> 24;
                if (i_6 != 0 && (i_6 != 1 || i_16 != 255)) {
                    if (i_6 == 1) {
                        i_5 = (i_16 * (i_5 & 0xff00) >> 8 & 0xff00) + ((i_5 & 0xff00ff) * i_16 >> 8 & 0xff00ff) + (i_16 << 24);

                        for (i_17 = 256 - i_16; i_24 <= i_41; i_24++) {
                            i_18 = i_11 >> 16;
                            i_19 = i_24 - i_9;
                            i_20 = i_8 + ints_11[i_19];
                            if (i_18 >= anInt8983 && i_18 < anInt9002 && i_18 >= i_20 && i_18 < i_20 + ints_12[i_19]) {
                                i_21 = i_18 + i_24 * anInt8980;
                                i_22 = anIntArray8979[i_21];
                                i_22 = (i_17 * (i_22 & 0xff00ff) >> 8 & 0xff00ff) + (i_17 * (i_22 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_18 + i_24 * anInt8980] = i_22 + i_5;
                            }

                            i_11 += i_15;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_24 <= i_41) {
                            i_17 = i_11 >> 16;
                            i_18 = i_24 - i_9;
                            i_19 = ints_11[i_18] + i_8;
                            if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < i_19 + ints_12[i_18]) {
                                i_20 = anInt8980 * i_24 + i_17;
                                i_21 = anIntArray8979[i_20];
                                i_22 = i_5 + i_21;
                                i_23 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_21 = (i_22 - i_23 & 0x10000) + (i_23 & 0x1000100);
                                anIntArray8979[i_20] = i_22 - i_21 | i_21 - (i_21 >>> 8);
                            }

                            i_11 += i_15;
                            ++i_24;
                        }
                    }
                } else {
                    while (i_24 <= i_41) {
                        i_17 = i_11 >> 16;
                        i_18 = i_24 - i_9;
                        i_19 = ints_11[i_18] + i_8;
                        if (i_17 >= anInt8983 && i_17 < anInt9002 && i_17 >= i_19 && i_17 < ints_12[i_18] + i_19) {
                            anIntArray8979[i_17 + anInt8980 * i_24] = i_5;
                        }

                        i_11 += i_15;
                        ++i_24;
                    }
                }
            }
        }

    }

    @Override
    public int[] kh(int i_1, int i_2, int i_3, int i_4) {
        if (anIntArray8979 == null) {
            throw new IllegalStateException("");
        } else {
            int[] ints_5 = new int[i_4 * i_3];
            int i_6 = 0;

            for (int i_7 = 0; i_7 < i_4; i_7++) {
                int i_8 = i_1 + (i_2 + i_7) * anInt8980;

                for (int i_9 = 0; i_9 < i_3; i_9++) {
                    ints_5[i_6++] = anIntArray8979[i_8 + i_9];
                }
            }

            return ints_5;
        }
    }

    @Override
    public void method8480() {
    }

    @Override
    public Node_Sub1 method8438(int i_1) {
        return null;
    }

    @Override
    public int method8538(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = i_3 * aClass384_8996.buf[10] + i_2 * aClass384_8996.buf[6] + aClass384_8996.buf[14] + i_1 * aClass384_8996.buf[2];
        float f_9 = aClass384_8996.buf[6] * i_5 + aClass384_8996.buf[14] + aClass384_8996.buf[2] * i_4 + aClass384_8996.buf[10] * i_6;
        float f_10 = aClass384_8996.buf[15] + i_1 * aClass384_8996.buf[3] + i_2 * aClass384_8996.buf[7] + i_3 * aClass384_8996.buf[11];
        float f_11 = i_5 * aClass384_8996.buf[7] + aClass384_8996.buf[15] + aClass384_8996.buf[3] * i_4 + i_6 * aClass384_8996.buf[11];
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8996.buf[4] * i_2 + aClass384_8996.buf[12] + i_1 * aClass384_8996.buf[0] + i_3 * aClass384_8996.buf[8];
        float f_13 = i_6 * aClass384_8996.buf[8] + i_4 * aClass384_8996.buf[0] + aClass384_8996.buf[12] + aClass384_8996.buf[4] * i_5;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8996.buf[5] * i_2 + i_1 * aClass384_8996.buf[1] + aClass384_8996.buf[13] + aClass384_8996.buf[9] * i_3;
        float f_15 = aClass384_8996.buf[13] + aClass384_8996.buf[1] * i_4 + aClass384_8996.buf[5] * i_5 + i_6 * aClass384_8996.buf[9];
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public void method8629(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
        boolean bool_14 = anIntArray8979 != null;
        boolean bool_15 = aFloatArray9010 != null;
        if (bool_14 || bool_15) {
            Class185 class185_16 = method14370(Thread.currentThread());
            ChoppyItemFixClass choppyitemfixclass_17 = class185_16.aClass144_2310;
            choppyitemfixclass_17.aBool1675 = false;
            i_1 -= anInt8983;
            i_4 -= anInt8983;
            i_7 -= anInt8983;
            i_2 -= anInt9009;
            i_5 -= anInt9009;
            i_8 -= anInt9009;
            choppyitemfixclass_17.aBool1708 = i_1 < 0 || i_1 > choppyitemfixclass_17.anInt1684 || i_4 < 0 || i_4 > choppyitemfixclass_17.anInt1684 || i_7 < 0 || i_7 > choppyitemfixclass_17.anInt1684;
            int i_18 = i_10 >>> 24;
            if (i_13 == 0 || i_13 == 1 && i_18 == 255) {
                choppyitemfixclass_17.anInt1674 = 0;
                choppyitemfixclass_17.aBool1672 = false;
                choppyitemfixclass_17.method2425(bool_14, bool_15, false, i_2, i_5, i_8, i_1, i_4, i_7, f_3, f_6, f_9, i_10, i_11, i_12);
            } else if (i_13 == 1) {
                choppyitemfixclass_17.anInt1674 = 255 - i_18;
                choppyitemfixclass_17.aBool1672 = false;
                choppyitemfixclass_17.method2425(bool_14, bool_15, false, i_2, i_5, i_8, i_1, i_4, i_7, f_3, f_6, f_9, i_10, i_11, i_12);
            } else {
                if (i_13 != 2) {
                    throw new IllegalArgumentException();
                }

                choppyitemfixclass_17.anInt1674 = 128;
                choppyitemfixclass_17.aBool1672 = true;
                choppyitemfixclass_17.method2425(bool_14, bool_15, false, i_2, i_5, i_8, i_1, i_4, i_7, f_3, f_6, f_9, i_10, i_11, i_12);
            }

            choppyitemfixclass_17.aBool1675 = true;
        }

    }

    @Override
    public int method8540(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = i_3 * aClass384_8996.buf[10] + i_2 * aClass384_8996.buf[6] + aClass384_8996.buf[14] + i_1 * aClass384_8996.buf[2];
        float f_9 = aClass384_8996.buf[6] * i_5 + aClass384_8996.buf[14] + aClass384_8996.buf[2] * i_4 + aClass384_8996.buf[10] * i_6;
        float f_10 = aClass384_8996.buf[15] + i_1 * aClass384_8996.buf[3] + i_2 * aClass384_8996.buf[7] + i_3 * aClass384_8996.buf[11];
        float f_11 = i_5 * aClass384_8996.buf[7] + aClass384_8996.buf[15] + aClass384_8996.buf[3] * i_4 + i_6 * aClass384_8996.buf[11];
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8996.buf[4] * i_2 + aClass384_8996.buf[12] + i_1 * aClass384_8996.buf[0] + i_3 * aClass384_8996.buf[8];
        float f_13 = i_6 * aClass384_8996.buf[8] + i_4 * aClass384_8996.buf[0] + aClass384_8996.buf[12] + aClass384_8996.buf[4] * i_5;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8996.buf[5] * i_2 + i_1 * aClass384_8996.buf[1] + aClass384_8996.buf[13] + aClass384_8996.buf[9] * i_3;
        float f_15 = aClass384_8996.buf[13] + aClass384_8996.buf[1] * i_4 + aClass384_8996.buf[5] * i_5 + i_6 * aClass384_8996.buf[9];
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public Node_Sub1 method8570(int i_1) {
        return null;
    }

    @Override
    public Node_Sub1 method8541(int i_1) {
        return null;
    }

    @Override
    public void method8544(Node_Sub1 class282_sub1_1) {
    }

    @Override
    public NativeSprite method8461(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        return bool_3 ? new NativeSprite_Sub1_Sub3(this, i_1, i_2) : new NativeSprite_Sub1_Sub1(this, i_1, i_2);
    }

    @Override
    public NativeSprite method8577(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        return bool_3 ? new NativeSprite_Sub1_Sub3(this, i_1, i_2) : new NativeSprite_Sub1_Sub1(this, i_1, i_2);
    }

    @Override
    public NativeSprite method8543(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        boolean bool_7 = false;
        int i_8 = i_2;

        for (int i_9 = 0; i_9 < i_5; i_9++) {
            for (int i_10 = 0; i_10 < i_4; i_10++) {
                int i_11 = ints_1[i_8++] >>> 24;
                if (i_11 != 0 && i_11 != 255) {
                    bool_7 = true;
                    return bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6);
                }
            }
        }

        return bool_7 ? new NativeSprite_Sub1_Sub3(this, ints_1, i_2, i_3, i_4, i_5, bool_6) : new NativeSprite_Sub1_Sub1(this, ints_1, i_2, i_3, i_4, i_5, bool_6);
    }

    @Override
    public void method8673(int i_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public NativeSprite method8612(SpriteDefinitions class91_1, boolean bool_2) {
        int[] ints_3 = class91_1.pallete;
        byte[] bytes_4 = class91_1.pixels;
        int i_5 = class91_1.width;
        int i_6 = class91_1.height;
        NativeSprite_Sub1 obj_7;
        int[] ints_8;
        byte[] bytes_9;
        int i_10;
        int i_11;
        int i_12;
        if (bool_2 && class91_1.alpha == null) {
            ints_8 = new int[ints_3.length];
            bytes_9 = new byte[i_5 * i_6];

            for (i_10 = 0; i_10 < i_6; i_10++) {
                i_11 = i_10 * i_5;

                for (i_12 = 0; i_12 < i_5; i_12++) {
                    bytes_9[i_12 + i_11] = bytes_4[i_12 + i_11];
                }
            }

            for (i_10 = 0; i_10 < ints_3.length; i_10++) {
                ints_8[i_10] = ints_3[i_10];
            }

            obj_7 = new NativeSprite_Sub1_Sub2(this, bytes_9, ints_8, i_5, i_6);
        } else {
            ints_8 = new int[i_6 * i_5];
            bytes_9 = class91_1.alpha;
            if (bytes_9 != null) {
                for (i_10 = 0; i_10 < i_6; i_10++) {
                    i_11 = i_5 * i_10;

                    for (i_12 = 0; i_12 < i_5; i_12++) {
                        ints_8[i_12 + i_11] = ints_3[bytes_4[i_12 + i_11] & 0xff] | bytes_9[i_12 + i_11] << 24;
                    }
                }

                obj_7 = new NativeSprite_Sub1_Sub3(this, ints_8, i_5, i_6);
            } else {
                for (i_10 = 0; i_10 < i_6; i_10++) {
                    i_11 = i_10 * i_5;

                    for (i_12 = 0; i_12 < i_5; i_12++) {
                        int i_13 = ints_3[bytes_4[i_12 + i_11] & 0xff];
                        ints_8[i_11 + i_12] = i_13 != 0 ? -16777216 | i_13 : 0;
                    }
                }

                obj_7 = new NativeSprite_Sub1_Sub1(this, ints_8, i_5, i_6);
            }
        }

        (obj_7).method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
        return obj_7;
    }

    @Override
    public int method8463() {
        return 0;
    }

    @Override
    public boolean method8464() {
        return false;
    }

    @Override
    public NativeSprite method8552(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        if (anIntArray8979 == null) {
            throw new IllegalStateException("");
        } else {
            int[] ints_6 = new int[i_3 * i_4];
            int i_7 = i_2 * anInt8980 + i_1;
            int i_8 = anInt8980 - i_3;

            for (int i_9 = 0; i_9 < i_4; i_9++) {
                int i_10 = i_9 * i_3;

                for (int i_11 = 0; i_11 < i_3; i_11++) {
                    ints_6[i_10 + i_11] = anIntArray8979[i_7++];
                }

                i_7 += i_8;
            }

            if (bool_5) {
                return new NativeSprite_Sub1_Sub3(this, ints_6, i_3, i_4);
            } else {
                return new NativeSprite_Sub1_Sub1(this, ints_6, i_3, i_4);
            }
        }
    }

    @Override
    public void method8542(Node_Sub1 class282_sub1_1) {
    }

    @Override
    public Class455 method8554(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new Class455_Sub3(ints_3, ints_4);
    }

    @Override
    public Class455 method8427(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new Class455_Sub3(ints_3, ints_4);
    }

    void method14399(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (anIntArray8979 != null && i_1 >= anInt8983 && i_1 < anInt9002) {
            int i_9 = i_2 * anInt8980 + i_1;
            int i_10 = i_4 >>> 24;
            int i_11 = i_7 + i_6;
            int i_12 = i_8 % i_11;
            int i_13;
            if (i_5 == 0 || i_5 == 1 && i_10 == 255) {
                for (i_13 = 0; i_13 < i_3; i_12 %= i_11) {
                    if (i_13 + i_2 >= anInt9009 && i_13 + i_2 < anInt8986 && i_12 < i_6) {
                        anIntArray8979[i_9 + i_13 * anInt8980] = i_4;
                    }

                    ++i_13;
                    ++i_12;
                }
            } else {
                int i_14;
                int i_15;
                int i_16;
                if (i_5 == 1) {
                    i_4 = (i_10 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_10 * (i_4 & 0xff00) >> 8 & 0xff00) + (i_10 << 24);
                    i_13 = 256 - i_10;

                    for (i_14 = 0; i_14 < i_3; i_12 %= i_11) {
                        if (i_14 + i_2 >= anInt9009 && i_14 + i_2 < anInt8986 && i_12 < i_6) {
                            i_15 = i_9 + i_14 * anInt8980;
                            i_16 = anIntArray8979[i_15];
                            i_16 = (i_13 * (i_16 & 0xff00) >> 8 & 0xff00) + ((i_16 & 0xff00ff) * i_13 >> 8 & 0xff00ff);
                            anIntArray8979[i_15] = i_16 + i_4;
                        }

                        ++i_14;
                        ++i_12;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (i_13 = 0; i_13 < i_3; i_12 %= i_11) {
                        if (i_13 + i_2 >= anInt9009 && i_13 + i_2 < anInt8986 && i_12 < i_6) {
                            i_14 = i_9 + i_13 * anInt8980;
                            i_15 = anIntArray8979[i_14];
                            i_16 = i_15 + i_4;
                            int i_17 = (i_15 & 0xff00ff) + (i_4 & 0xff00ff);
                            i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
                            anIntArray8979[i_14] = i_16 - i_15 | i_15 - (i_15 >>> 8);
                        }

                        ++i_13;
                        ++i_12;
                    }
                }
            }
        }

    }

    @Override
    public void hr(int i_1, Class455 class455_2, int i_3, int i_4) {
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_5 = (Class455_Sub3) class455_2;
            int[] ints_6 = packetsdecoder_5.anIntArray9077;
            int[] ints_7 = packetsdecoder_5.anIntArray9078;
            int i_8;
            if (anInt8986 < i_41 + ints_6.length) {
                i_8 = anInt8986 - i_41;
            } else {
                i_8 = ints_6.length;
            }

            int i_9;
            if (anInt9009 > i_41) {
                i_9 = anInt9009 - i_41;
                i_41 = anInt9009;
            } else {
                i_9 = 0;
            }

            if (i_8 - i_9 > 0) {
                int i_10 = anInt8980 * i_41;

                for (int i_11 = i_9; i_11 < i_8; i_11++) {
                    int i_12 = ints_6[i_11] + i_3;
                    int i_13 = ints_7[i_11];
                    if (anInt8983 > i_12) {
                        i_13 -= anInt8983 - i_12;
                        i_12 = anInt8983;
                    }

                    if (anInt9002 < i_13 + i_12) {
                        i_13 = anInt9002 - i_12;
                    }

                    i_12 += i_10;

                    for (int i_14 = -i_13; i_14 < 0; i_14++) {
                        anIntArray8979[i_12++] = i_1;
                    }

                    i_10 += anInt8980;
                }
            }
        }

    }

    @Override
    public void hi(int i_1, Class455 class455_2, int i_3, int i_4) {
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_5 = (Class455_Sub3) class455_2;
            int[] ints_6 = packetsdecoder_5.anIntArray9077;
            int[] ints_7 = packetsdecoder_5.anIntArray9078;
            int i_8;
            if (anInt8986 < i_41 + ints_6.length) {
                i_8 = anInt8986 - i_41;
            } else {
                i_8 = ints_6.length;
            }

            int i_9;
            if (anInt9009 > i_41) {
                i_9 = anInt9009 - i_41;
                i_41 = anInt9009;
            } else {
                i_9 = 0;
            }

            if (i_8 - i_9 > 0) {
                int i_10 = anInt8980 * i_41;

                for (int i_11 = i_9; i_11 < i_8; i_11++) {
                    int i_12 = ints_6[i_11] + i_3;
                    int i_13 = ints_7[i_11];
                    if (anInt8983 > i_12) {
                        i_13 -= anInt8983 - i_12;
                        i_12 = anInt8983;
                    }

                    if (anInt9002 < i_13 + i_12) {
                        i_13 = anInt9002 - i_12;
                    }

                    i_12 += i_10;

                    for (int i_14 = -i_13; i_14 < 0; i_14++) {
                        anIntArray8979[i_12++] = i_1;
                    }

                    i_10 += anInt8980;
                }
            }
        }

    }

    @Override
    public void method8601() {
    }

    @Override
    public FontRenderer method8625(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
        int[] ints_4 = new int[arr_2.length];
        int[] ints_5 = new int[arr_2.length];
        boolean bool_6 = false;

        for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
            ints_4[i_7] = arr_2[i_7].width;
            ints_5[i_7] = arr_2[i_7].height;
            if (arr_2[i_7].alpha != null) {
                bool_6 = true;
            }
        }

        if (bool_3) {
            if (bool_6) {
                return new FontRenderer_Sub2(this, fontmetrics_1, arr_2, ints_4, ints_5);
            } else {
                return new FontRenderer_Sub1(this, fontmetrics_1, arr_2, ints_4, ints_5);
            }
        } else if (bool_6) {
            throw new IllegalArgumentException("");
        } else {
            return new FontRenderer_Sub3(this, fontmetrics_1, arr_2, ints_4, ints_5);
        }
    }

    @Override
    public void method8586(Matrix44 matrix44_1) {
        aClass384_8995.method6562(matrix44_1);
        method14374();
    }

    @Override
    public void ba(int i_1, int i_2) {
        if ((i_1 & 0x1) != 0) {
            B(0, 0, anInt8980, anInt8981, i_2, 0);
        }

        if ((i_1 & 0x2) != 0) {
            method14410();
        }

    }

    @Override
    public void fh(int[] ints_1) {
        ints_1[0] = anInt8983;
        ints_1[1] = anInt9009;
        ints_1[2] = anInt9002;
        ints_1[3] = anInt8986;
    }

    @Override
    public MeshRasterizer method8623(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    public MeshRasterizer method8505(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub2(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    public void L() {
        anInt8983 = 0;
        anInt9009 = 0;
        anInt9002 = anInt8980;
        anInt8986 = anInt8981;
        method14364();
    }

    @Override
    public int method8565(int i_1, int i_2) {
        i_1 |= 0x20800;
        return i_1 & i_2 ^ i_2;
    }

    @Override
    public void method8581(Class151 class151_1) {
        method14363(anIntArray8979 != null, aFloatArray9010 != null, class151_1);
    }

    @Override
    public Ground method8569(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_5, int i_6, int i_7) {
        return new Ground_Sub3(this, i_7, i_1, i_2, ints_3, ints_4, i_5);
    }

    @Override
    public Matrix44 method8517() {
        Class185 class185_1 = method14370(Thread.currentThread());
        return class185_1.aClass384_2346;
    }

    @Override
    public Matrix44 method8571() {
        Class185 class185_1 = method14370(Thread.currentThread());
        return class185_1.aClass384_2346;
    }

    @Override
    public void method8580(Class151 class151_1) {
        method14363(anIntArray8979 != null, aFloatArray9010 != null, class151_1);
    }

    @Override
    public Matrix44Var method8626() {
        Class185 class185_1 = method14370(Thread.currentThread());
        return class185_1.aClass294_2314;
    }

    @Override
    public int method8574() {
        return 0;
    }

    @Override
    public void fm(int i_1, int i_2, int i_3, int i_4) {
        int i_11 = i_1;
        int i_21 = i_2;
        int i_31 = i_3;
        int i_41 = i_4;
        if (i_11 < 0) {
            i_11 = 0;
        }

        if (i_21 < 0) {
            i_21 = 0;
        }

        if (i_31 > anInt8980) {
            i_31 = anInt8980;
        }

        if (i_41 > anInt8981) {
            i_41 = anInt8981;
        }

        anInt8983 = i_11;
        anInt9002 = i_31;
        anInt9009 = i_21;
        anInt8986 = i_41;
        method14364();
    }

    @Override
    public void method8426(int i_1, GLLight[] arr_2) {
    }

    @Override
    public void method8579(int i_1, GLLight[] arr_2) {
    }

    @Override
    public int[] ke(int i_1, int i_2, int i_3, int i_4) {
        if (anIntArray8979 == null) {
            throw new IllegalStateException("");
        } else {
            int[] ints_5 = new int[i_4 * i_3];
            int i_6 = 0;

            for (int i_7 = 0; i_7 < i_4; i_7++) {
                int i_8 = i_1 + (i_2 + i_7) * anInt8980;

                for (int i_9 = 0; i_9 < i_3; i_9++) {
                    ints_5[i_6++] = anIntArray8979[i_8 + i_9];
                }
            }

            return ints_5;
        }
    }

    @Override
    public void G(int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_21 = i_2;
        int i_31 = i_3;
        if (anIntArray8979 != null && i_1 >= anInt8983 && i_1 < anInt9002) {
            if (i_21 < anInt9009) {
                i_31 -= anInt9009 - i_21;
                i_21 = anInt9009;
            }

            if (i_31 + i_21 > anInt8986) {
                i_31 = anInt8986 - i_21;
            }

            int i_6 = i_21 * anInt8980 + i_1;
            int i_7 = i_4 >>> 24;
            int i_8;
            if (i_5 == 0 || i_5 == 1 && i_7 == 255) {
                for (i_8 = 0; i_8 < i_31; i_8++) {
                    anIntArray8979[i_6 + i_8 * anInt8980] = i_4;
                }
            } else {
                int i_9;
                int i_10;
                int i_11;
                if (i_5 == 1) {
                    i_4 = (i_7 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_7 << 24) + (i_7 * (i_4 & 0xff00) >> 8 & 0xff00);
                    i_8 = 256 - i_7;

                    for (i_9 = 0; i_9 < i_31; i_9++) {
                        i_10 = i_6 + i_9 * anInt8980;
                        i_11 = anIntArray8979[i_10];
                        i_11 = ((i_11 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + (i_8 * (i_11 & 0xff00) >> 8 & 0xff00);
                        anIntArray8979[i_10] = i_11 + i_4;
                    }
                } else {
                    if (i_5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (i_8 = 0; i_8 < i_31; i_8++) {
                        i_9 = i_6 + i_8 * anInt8980;
                        i_10 = anIntArray8979[i_9];
                        i_11 = i_10 + i_4;
                        int i_12 = (i_10 & 0xff00ff) + (i_4 & 0xff00ff);
                        i_10 = (i_12 & 0x1000100) + (i_11 - i_12 & 0x10000);
                        anIntArray8979[i_9] = i_11 - i_10 | i_10 - (i_10 >>> 8);
                    }
                }
            }
        }

    }

    boolean method14403(int i_1) {
        return textureCache.getTextureDetails(i_1).repeatS || textureCache.getTextureDetails(i_1).repeatT;
    }

    @Override
    public void method8430(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        XA(i_1, i_2, i_3, i_5, i_6);
        XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
        G(i_1, i_2 + 1, i_4 - 2, i_5, i_6);
        G(i_3 + i_1 - 1, i_2 + 1, i_4 - 2, i_5, i_6);
    }

    @Override
    public void method8474() {
    }

    @Override
    public void IA(float f_1) {
        anInt8992 = (int) (f_1 * 65535.0F);
    }

    @Override
    public void method8423(Matrix44Var matrix44var_1) {
        aClass294_8993 = matrix44var_1;
        method14374();
    }

    @Override
    public Matrix44Var method8583() {
        return new Matrix44Var(aClass294_8993);
    }

    @Override
    public int method8566(int i_1, int i_2) {
        i_1 |= 0x20800;
        return i_1 & i_2 ^ i_2;
    }

    @Override
    public void method8394(int i_1, GLLight[] arr_2) {
    }

    @Override
    public int method8567(int i_1, int i_2) {
        i_1 |= 0x20800;
        return i_1 & i_2 ^ i_2;
    }

    @Override
    public void method8527(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        if (anIntArray8979 != null) {
            i_3 -= i_1;
            i_4 -= i_2;
            int i_10;
            if (i_4 == 0) {
                if (i_3 >= 0) {
                    method14366(i_1, i_2, 1 + i_3, i_5, i_6, i_7, i_8, i_9);
                } else {
                    i_10 = i_7 + i_8;
                    i_9 %= i_10;
                    i_9 = i_10 + i_7 - i_9 - (1 + -i_3) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14366(i_1 + i_3, i_2, -i_3 + 1, i_5, i_6, i_7, i_8, i_9);
                }
            } else if (i_3 == 0) {
                if (i_4 >= 0) {
                    method14399(i_1, i_2, 1 + i_4, i_5, i_6, i_7, i_8, i_9);
                } else {
                    i_10 = i_8 + i_7;
                    i_9 %= i_10;
                    i_9 = i_7 + i_10 - i_9 - (-i_4 + 1) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14399(i_1, i_2 + i_4, 1 + -i_4, i_5, i_6, i_7, i_8, i_9);
                }
            } else {
                i_9 <<= 8;
                i_7 <<= 8;
                i_8 <<= 8;
                i_10 = i_8 + i_7;
                i_9 %= i_10;
                int i_11;
                int i_12;
                if (i_3 + i_4 < 0) {
                    i_11 = (int) (Math.sqrt(i_3 * i_3 + i_4 * i_4) * 256.0D);
                    i_12 = i_11 % i_10;
                    i_9 = i_7 + i_10 - i_9 - i_12;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    i_1 += i_3;
                    i_3 = -i_3;
                    i_2 += i_4;
                    i_4 = -i_4;
                }

                int i_13;
                int i_14;
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                if (i_3 > i_4) {
                    i_2 <<= 16;
                    i_2 += 32768;
                    i_4 <<= 16;
                    i_11 = (int) Math.floor((double) i_4 / i_3 + 0.5D);
                    i_3 += i_1;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if (i_6 == 0 || i_6 == 1 && i_12 == 255) {
                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                anIntArray8979[i_1 + anInt8980 * i_14] = i_5;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    } else if (i_6 == 1) {
                        i_5 = (i_12 << 24) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00) + (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff);

                        for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
                            i_15 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_15 >= anInt9009 && i_15 < anInt8986 && i_9 < i_7) {
                                i_16 = i_15 * anInt8980 + i_1;
                                i_17 = anIntArray8979[i_16];
                                i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_16] = i_17 + i_5;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                        }
                    } else {
                        if (i_6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                i_15 = i_1 + i_14 * anInt8980;
                                i_16 = anIntArray8979[i_15];
                                i_17 = i_16 + i_5;
                                i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                } else {
                    i_1 <<= 16;
                    i_1 += 32768;
                    i_3 <<= 16;
                    i_11 = (int) Math.floor((double) i_3 / i_4 + 0.5D);
                    i_4 += i_2;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if (i_6 != 0 && (i_6 != 1 || i_12 != 255)) {
                        if (i_6 == 1) {
                            i_5 = (i_12 << 24) + ((i_5 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + ((i_5 & 0xff00) * i_12 >> 8 & 0xff00);

                            for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
                                i_15 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_15 >= anInt8983 && i_15 < anInt9002 && i_9 < i_7) {
                                    i_16 = i_2 * anInt8980 + i_15;
                                    i_17 = anIntArray8979[i_16];
                                    i_17 = (i_14 * (i_17 & 0xff00ff) >> 8 & 0xff00ff) + ((i_17 & 0xff00) * i_14 >> 8 & 0xff00);
                                    anIntArray8979[i_15 + anInt8980 * i_2] = i_17 + i_5;
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                            }
                        } else {
                            if (i_6 != 2) {
                                throw new IllegalArgumentException();
                            }

                            while (i_2 <= i_4) {
                                i_14 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                    i_15 = i_2 * anInt8980 + i_14;
                                    i_16 = anIntArray8979[i_15];
                                    i_17 = i_16 + i_5;
                                    i_18 = (i_5 & 0xff00ff) + (i_16 & 0xff00ff);
                                    i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                    anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                                i_9 %= i_10;
                            }
                        }
                    } else {
                        while (i_2 <= i_4) {
                            i_14 = i_1 >> 16;
                            if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                anIntArray8979[i_14 + i_2 * anInt8980] = i_5;
                            }

                            i_1 += i_11;
                            ++i_2;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                }
            }
        }

    }

    @Override
    public void r(int i_1, int i_2, int i_3, int i_4) {
        int i_11 = i_1;
        int i_21 = i_2;
        int i_31 = i_3;
        int i_41 = i_4;
        if (i_11 < 0) {
            i_11 = 0;
        }

        if (i_21 < 0) {
            i_21 = 0;
        }

        if (i_31 > anInt8980) {
            i_31 = anInt8980;
        }

        if (i_41 > anInt8981) {
            i_41 = anInt8981;
        }

        anInt8983 = i_11;
        anInt9002 = i_31;
        anInt9009 = i_21;
        anInt8986 = i_41;
        method14364();
    }

    @Override
    public Matrix44 method8589() {
        return new Matrix44(aClass384_8995);
    }

    @Override
    public Class152 method8467(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
        return null;
    }

    @Override
    public void iz(float f_1) {
        anInt8992 = (int) (f_1 * 65535.0F);
    }

    @Override
    public void in(float f_1) {
        anInt8992 = (int) (f_1 * 65535.0F);
    }

    boolean method14408() {
        return aBool9014;
    }

    @Override
    public void im(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
        anInt8990 = (int) (65535.0F * f_2);
        anInt8991 = (int) (65535.0F * f_3);
        float f_7 = (float) Math.sqrt(f_6 * f_6 + f_5 * f_5 + f_4 * f_4);
        anInt9011 = (int) (f_4 * 65535.0F / f_7);
        anInt8988 = (int) (65535.0F * f_5 / f_7);
        anInt9007 = (int) (f_6 * 65535.0F / f_7);
    }

    @Override
    public void iq(int i_1) {
    }

    @Override
    public void il(int i_1) {
    }

    @Override
    public void ii(int i_1) {
    }

    @Override
    public void is(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < aClass185Array8984.length; i_4++) {
            Class185 class185_5 = aClass185Array8984[i_4];
            class185_5.anInt2307 = (i_1 & 0xffffff);
            int i_6 = class185_5.anInt2307 >>> 16 & 0xff;
            if (i_6 < 2) {
                i_6 = 2;
            }

            int i_7 = class185_5.anInt2307 >> 8 & 0xff;
            if (i_7 < 2) {
                i_7 = 2;
            }

            int i_8 = class185_5.anInt2307 & 0xff;
            if (i_8 < 2) {
                i_8 = 2;
            }

            class185_5.anInt2307 = (i_6 << 16 | i_7 << 8 | i_8);
            class185_5.aBool2304 = i_2 >= 0;
        }

    }

    @Override
    public void method8435(int i_1, int i_2, int i_3, int i_4, int i_5, int i_7, int i_8, int i_9) {
        if (anIntArray8979 != null) {
            i_3 -= i_1;
            i_4 -= i_2;
            int i_10;
            if (i_4 == 0) {
                if (i_3 >= 0) {
                    method14366(i_1, i_2, i_3 + 1, i_5, 1, i_7, i_8, i_9);
                } else {
                    i_10 = i_8 + i_7;
                    i_9 %= i_10;
                    i_9 = i_10 + i_7 - i_9 - (-i_3 + 1) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14366(i_3 + i_1, i_2, -i_3 + 1, i_5, 1, i_7, i_8, i_9);
                }
            } else if (i_3 == 0) {
                if (i_4 >= 0) {
                    method14399(i_1, i_2, i_4 + 1, i_5, 1, i_7, i_8, i_9);
                } else {
                    i_10 = i_8 + i_7;
                    i_9 %= i_10;
                    i_9 = i_10 + i_7 - i_9 - (-i_4 + 1) % i_10;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    method14399(i_1, i_2 + i_4, -i_4 + 1, i_5, 1, i_7, i_8, i_9);
                }
            } else {
                i_9 <<= 8;
                i_7 <<= 8;
                i_8 <<= 8;
                i_10 = i_8 + i_7;
                i_9 %= i_10;
                int i_11;
                int i_12;
                if (i_3 + i_4 < 0) {
                    i_11 = (int) (Math.sqrt(i_3 * i_3 + i_4 * i_4) * 256.0D);
                    i_12 = i_11 % i_10;
                    i_9 = i_10 + i_7 - i_9 - i_12;
                    i_9 %= i_10;
                    if (i_9 < 0) {
                        i_9 += i_10;
                    }

                    i_1 += i_3;
                    i_3 = -i_3;
                    i_2 += i_4;
                    i_4 = -i_4;
                }

                int i_13;
                int i_14;
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                if (i_3 > i_4) {
                    i_2 <<= 16;
                    i_2 += 32768;
                    i_4 <<= 16;
                    i_11 = (int) Math.floor((double) i_4 / i_3 + 0.5D);
                    i_3 += i_1;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if (i_12 == 255) {
                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                anIntArray8979[i_14 * anInt8980 + i_1] = i_5;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    } else if (true) {
                        i_5 = (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_12 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_12 << 24);

                        for (i_14 = 256 - i_12; i_1 <= i_3; i_9 %= i_10) {
                            i_15 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_15 >= anInt9009 && i_15 < anInt8986 && i_9 < i_7) {
                                i_16 = i_15 * anInt8980 + i_1;
                                i_17 = anIntArray8979[i_16];
                                i_17 = ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff) + (i_14 * (i_17 & 0xff00) >> 8 & 0xff00);
                                anIntArray8979[i_16] = i_5 + i_17;
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                        }
                    } else {
                        if (true) {
                            throw new IllegalArgumentException();
                        }

                        while (i_1 <= i_3) {
                            i_14 = i_2 >> 16;
                            if (i_1 >= anInt8983 && i_1 < anInt9002 && i_14 >= anInt9009 && i_14 < anInt8986 && i_9 < i_7) {
                                i_15 = i_14 * anInt8980 + i_1;
                                i_16 = anIntArray8979[i_15];
                                i_17 = i_5 + i_16;
                                i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
                                i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                            }

                            i_2 += i_11;
                            ++i_1;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                } else {
                    i_1 <<= 16;
                    i_1 += 32768;
                    i_3 <<= 16;
                    i_11 = (int) Math.floor((double) i_3 / i_4 + 0.5D);
                    i_4 += i_2;
                    i_12 = i_5 >>> 24;
                    i_13 = (int) Math.sqrt((i_11 >> 8) * (i_11 >> 8) + 65536);
                    if ((false || i_12 != 255)) {
                        if (true) {
                            i_5 = (i_12 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_12 * (i_5 & 0xff00) >> 8 & 0xff00) + (i_12 << 24);

                            for (i_14 = 256 - i_12; i_2 <= i_4; i_9 %= i_10) {
                                i_15 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_15 >= anInt8983 && i_15 < anInt9002 && i_9 < i_7) {
                                    i_16 = i_2 * anInt8980 + i_15;
                                    i_17 = anIntArray8979[i_16];
                                    i_17 = (i_14 * (i_17 & 0xff00) >> 8 & 0xff00) + ((i_17 & 0xff00ff) * i_14 >> 8 & 0xff00ff);
                                    anIntArray8979[i_2 * anInt8980 + i_15] = i_5 + i_17;
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                            }
                        } else {
                            if (true) {
                                throw new IllegalArgumentException();
                            }

                            while (i_2 <= i_4) {
                                i_14 = i_1 >> 16;
                                if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                    i_15 = i_2 * anInt8980 + i_14;
                                    i_16 = anIntArray8979[i_15];
                                    i_17 = i_5 + i_16;
                                    i_18 = (i_16 & 0xff00ff) + (i_5 & 0xff00ff);
                                    i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
                                    anIntArray8979[i_15] = i_17 - i_16 | i_16 - (i_16 >>> 8);
                                }

                                i_1 += i_11;
                                ++i_2;
                                i_9 += i_13;
                                i_9 %= i_10;
                            }
                        }
                    } else {
                        while (i_2 <= i_4) {
                            i_14 = i_1 >> 16;
                            if (i_2 >= anInt9009 && i_2 < anInt8986 && i_14 >= anInt8983 && i_14 < anInt9002 && i_9 < i_7) {
                                anIntArray8979[i_2 * anInt8980 + i_14] = i_5;
                            }

                            i_1 += i_11;
                            ++i_2;
                            i_9 += i_13;
                            i_9 %= i_10;
                        }
                    }
                }
            }
        }

    }

    @Override
    public void ib(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < aClass185Array8984.length; i_4++) {
            Class185 class185_5 = aClass185Array8984[i_4];
            class185_5.anInt2307 = (i_1 & 0xffffff);
            int i_6 = class185_5.anInt2307 >>> 16 & 0xff;
            if (i_6 < 2) {
                i_6 = 2;
            }

            int i_7 = class185_5.anInt2307 >> 8 & 0xff;
            if (i_7 < 2) {
                i_7 = 2;
            }

            int i_8 = class185_5.anInt2307 & 0xff;
            if (i_8 < 2) {
                i_8 = 2;
            }

            class185_5.anInt2307 = (i_6 << 16 | i_7 << 8 | i_8);
            class185_5.aBool2304 = i_2 >= 0;
        }

    }

    @Override
    public GLLight method8593(int i_1, int i_2, int i_3, int i_4, int i_5) {
        return null;
    }

    @Override
    public void method8595(boolean bool_1) {
        lowResolution = bool_1;
        aClass229_9006.method3859();
    }

    @Override
    public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
        return null;
    }

    @Override
    public void method8584(Class152 class152_1) {
    }

    @Override
    public boolean method8469() {
        return false;
    }

    @Override
    public boolean method8628() {
        return false;
    }

    @Override
    public void method8602() {
    }

    @Override
    public Matrix44Var method8572() {
        Class185 class185_1 = method14370(Thread.currentThread());
        return class185_1.aClass294_2314;
    }

    @Override
    public Class455 method8556(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new Class455_Sub3(ints_3, ints_4);
    }

    @Override
    public NativeSprite method8604(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        if (anIntArray8979 == null) {
            throw new IllegalStateException("");
        } else {
            int[] ints_6 = new int[i_3 * i_4];
            int i_7 = i_2 * anInt8980 + i_1;
            int i_8 = anInt8980 - i_3;

            for (int i_9 = 0; i_9 < i_4; i_9++) {
                int i_10 = i_9 * i_3;

                for (int i_11 = 0; i_11 < i_3; i_11++) {
                    ints_6[i_10 + i_11] = anIntArray8979[i_7++];
                }

                i_7 += i_8;
            }

            if (bool_5) {
                return new NativeSprite_Sub1_Sub3(this, ints_6, i_3, i_4);
            } else {
                return new NativeSprite_Sub1_Sub1(this, ints_6, i_3, i_4);
            }
        }
    }

    @Override
    public boolean method8679() {
        return false;
    }

    @Override
    public boolean method8649() {
        return false;
    }

    @Override
    public boolean method8606() {
        return false;
    }

    @Override
    public boolean method8607() {
        return false;
    }

    @Override
    void method8608(float f_1, float f_2, float f_3, float f_6) {
    }

    @Override
    public int method8452(int i_1, int i_2) {
        i_1 |= 0x20800;
        return i_1 & i_2 ^ i_2;
    }

    @Override
    public void method8603(int i_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public int za() {
        return 0;
    }

    @Override
    public void method8594(boolean bool_1) {
        lowResolution = bool_1;
        aClass229_9006.method3859();
    }

    @Override
    public void method8613() {
    }

    @Override
    public void method8585(int i_1, HDWaterTile class90_2) {
        for (int i_3 = 0; i_3 < aClass185Array8984.length; i_3++) {
            aClass185Array8984[i_3].anInt2336 = aClass185Array8984[i_3].anInt2307;
            aClass185Array8984[i_3].anInt2306 = i_1;
            aClass185Array8984[i_3].anInt2307 = class90_2.color;
            aClass185Array8984[i_3].anInt2313 = class90_2.scale;
            aClass185Array8984[i_3].aBool2309 = true;
        }

    }

    @Override
    public void method8615(int i_1, HDWaterTile class90_2) {
        Class185 class185_3 = method14370(Thread.currentThread());
        class185_3.anInt2306 = i_1;
        class185_3.anInt2307 = class90_2.color;
        class185_3.anInt2313 = class90_2.scale;
    }

    @Override
    public void method8616(int i_1, HDWaterTile class90_2) {
        Class185 class185_3 = method14370(Thread.currentThread());
        class185_3.anInt2306 = i_1;
        class185_3.anInt2307 = class90_2.color;
        class185_3.anInt2313 = class90_2.scale;
    }

    @Override
    public void method8488(int i_1) {
        int i_2 = i_1 - 1426154545 * anInt8977;

        for (Node_Sub27 class282_sub27_3 = (Node_Sub27) aClass229_9006.method3866(); class282_sub27_3 != null; class282_sub27_3 = (Node_Sub27) aClass229_9006.method3867()) {
            if (class282_sub27_3.aBool7693) {
                class282_sub27_3.anInt7692 += i_2;
                int i_4 = class282_sub27_3.anInt7692 / 50;
                if (i_4 > 0) {
                    TextureDetails class169_5 = textureCache.getTextureDetails(class282_sub27_3.anInt7695);
                    float f_6 = class169_5.isHalfSize ? 64.0F : 128.0F;
                    class282_sub27_3.method12403((int) (f_6 * (class169_5.textureSpeedU * (i_2 / 1000.0F) / 64.0F)), (int) (class169_5.textureSpeedV * (i_2 / 1000.0F) / 64.0F * f_6));
                    class282_sub27_3.anInt7692 -= 50 * i_4;
                }

                class282_sub27_3.aBool7693 = false;
            }
        }

        anInt8977 = i_1;
        aClass229_9013.method3858(5);
        aClass229_9006.method3858(5);
    }

    @Override
    public void method8573(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = f_3 * aClass384_8996.buf[11] + aClass384_8996.buf[7] * f_2 + f_1 * aClass384_8996.buf[3] + aClass384_8996.buf[15];
        float f_6 = f_2 * aClass384_8996.buf[4] + f_1 * aClass384_8996.buf[0] + aClass384_8996.buf[12] + aClass384_8996.buf[8] * f_3;
        float f_7 = f_2 * aClass384_8996.buf[5] + f_1 * aClass384_8996.buf[1] + aClass384_8996.buf[13] + f_3 * aClass384_8996.buf[9];
        float f_8 = f_3 * aClass384_8994.buf[10] + aClass384_8994.buf[6] * f_2 + f_1 * aClass384_8994.buf[2] + aClass384_8994.buf[14];
        floats_4[0] = aFloat9003 + f_6 * aFloat8976 / f_5;
        floats_4[1] = aFloat8982 + f_7 * aFloat9004 / f_5;
        floats_4[2] = f_8;
    }

    @Override
    public void method8650(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = f_3 * aClass384_8996.buf[11] + aClass384_8996.buf[7] * f_2 + f_1 * aClass384_8996.buf[3] + aClass384_8996.buf[15];
        float f_6 = f_2 * aClass384_8996.buf[4] + f_1 * aClass384_8996.buf[0] + aClass384_8996.buf[12] + aClass384_8996.buf[8] * f_3;
        float f_7 = f_2 * aClass384_8996.buf[5] + f_1 * aClass384_8996.buf[1] + aClass384_8996.buf[13] + f_3 * aClass384_8996.buf[9];
        float f_8 = f_3 * aClass384_8994.buf[10] + aClass384_8994.buf[6] * f_2 + f_1 * aClass384_8994.buf[2] + aClass384_8994.buf[14];
        floats_4[0] = aFloat9003 + f_6 * aFloat8976 / f_5;
        floats_4[1] = aFloat8982 + f_7 * aFloat9004 / f_5;
        floats_4[2] = f_8;
    }

    @Override
    public void method8619(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aClass384_8996.buf[10] * f_3 + f_1 * aClass384_8996.buf[2] + aClass384_8996.buf[14] + f_2 * aClass384_8996.buf[6];
        float f_6 = aClass384_8996.buf[3] * f_1 + aClass384_8996.buf[15] + aClass384_8996.buf[7] * f_2 + f_3 * aClass384_8996.buf[11];
        if (f_5 >= -f_6 && f_5 <= f_6) {
            float f_7 = f_2 * aClass384_8996.buf[4] + aClass384_8996.buf[12] + f_1 * aClass384_8996.buf[0] + aClass384_8996.buf[8] * f_3;
            if (f_7 >= -f_6 && f_7 <= f_6) {
                float f_8 = f_3 * aClass384_8996.buf[9] + aClass384_8996.buf[13] + aClass384_8996.buf[1] * f_1 + aClass384_8996.buf[5] * f_2;
                if (f_8 >= -f_6 && f_8 <= f_6) {
                    float f_9 = aClass384_8994.buf[14] + aClass384_8994.buf[2] * f_1 + aClass384_8994.buf[6] * f_2 + aClass384_8994.buf[10] * f_3;
                    floats_4[0] = aFloat9003 + f_7 * aFloat8976 / f_6;
                    floats_4[1] = f_8 * aFloat9004 / f_6 + aFloat8982;
                    floats_4[2] = f_9;
                } else {
                    floats_4[2] = Float.NaN;
                    floats_4[1] = Float.NaN;
                    floats_4[0] = Float.NaN;
                }
            } else {
                floats_4[2] = Float.NaN;
                floats_4[1] = Float.NaN;
                floats_4[0] = Float.NaN;
            }
        } else {
            floats_4[2] = Float.NaN;
            floats_4[1] = Float.NaN;
            floats_4[0] = Float.NaN;
        }

    }

    @Override
    public Class158_Sub1 method8620() {
        return new Class158_Sub1_Sub2(this);
    }

    @Override
    public Interface8 method8621(int i_1, int i_2) {
        return new Class125(i_1, i_2);
    }

    @Override
    public boolean method8609() {
        return true;
    }

    @Override
    public void ft(int[] ints_1) {
        ints_1[0] = anInt8983;
        ints_1[1] = anInt9009;
        ints_1[2] = anInt9002;
        ints_1[3] = anInt8986;
    }

    void method14409() {
        aClass185Array8984[0].method3070(Thread.currentThread());
    }

    @Override
    public int[] kf(int i_1, int i_2, int i_3, int i_4) {
        if (anIntArray8979 == null) {
            throw new IllegalStateException("");
        } else {
            int[] ints_5 = new int[i_4 * i_3];
            int i_6 = 0;

            for (int i_7 = 0; i_7 < i_4; i_7++) {
                int i_8 = i_1 + (i_2 + i_7) * anInt8980;

                for (int i_9 = 0; i_9 < i_3; i_9++) {
                    ints_5[i_6++] = anIntArray8979[i_8 + i_9];
                }
            }

            return ints_5;
        }
    }

    @Override
    public void method8627(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
        boolean bool_14 = anIntArray8979 != null;
        boolean bool_15 = aFloatArray9010 != null;
        if (bool_14 || bool_15) {
            Class185 class185_16 = method14370(Thread.currentThread());
            ChoppyItemFixClass choppyitemfixclass_17 = class185_16.aClass144_2310;
            choppyitemfixclass_17.aBool1675 = false;
            i_1 -= anInt8983;
            i_4 -= anInt8983;
            i_7 -= anInt8983;
            i_2 -= anInt9009;
            i_5 -= anInt9009;
            i_8 -= anInt9009;
            choppyitemfixclass_17.aBool1708 = i_1 < 0 || i_1 > choppyitemfixclass_17.anInt1684 || i_4 < 0 || i_4 > choppyitemfixclass_17.anInt1684 || i_7 < 0 || i_7 > choppyitemfixclass_17.anInt1684;
            int i_18 = i_10 >>> 24;
            if (i_13 == 0 || i_13 == 1 && i_18 == 255) {
                choppyitemfixclass_17.anInt1674 = 0;
                choppyitemfixclass_17.aBool1672 = false;
                choppyitemfixclass_17.method2425(bool_14, bool_15, false, i_2, i_5, i_8, i_1, i_4, i_7, f_3, f_6, f_9, i_10, i_11, i_12);
            } else if (i_13 == 1) {
                choppyitemfixclass_17.anInt1674 = 255 - i_18;
                choppyitemfixclass_17.aBool1672 = false;
                choppyitemfixclass_17.method2425(bool_14, bool_15, false, i_2, i_5, i_8, i_1, i_4, i_7, f_3, f_6, f_9, i_10, i_11, i_12);
            } else {
                if (i_13 != 2) {
                    throw new IllegalArgumentException();
                }

                choppyitemfixclass_17.anInt1674 = 128;
                choppyitemfixclass_17.aBool1672 = true;
                choppyitemfixclass_17.method2425(bool_14, bool_15, false, i_2, i_5, i_8, i_1, i_4, i_7, f_3, f_6, f_9, i_10, i_11, i_12);
            }

            choppyitemfixclass_17.aBool1675 = true;
        }

    }

    @Override
    public void hz(int i_1, Class455 class455_2, int i_3, int i_4) {
        int i_41 = i_4;
        if (anIntArray8979 != null) {
            Class455_Sub3 packetsdecoder_5 = (Class455_Sub3) class455_2;
            int[] ints_6 = packetsdecoder_5.anIntArray9077;
            int[] ints_7 = packetsdecoder_5.anIntArray9078;
            int i_8;
            if (anInt8986 < i_41 + ints_6.length) {
                i_8 = anInt8986 - i_41;
            } else {
                i_8 = ints_6.length;
            }

            int i_9;
            if (anInt9009 > i_41) {
                i_9 = anInt9009 - i_41;
                i_41 = anInt9009;
            } else {
                i_9 = 0;
            }

            if (i_8 - i_9 > 0) {
                int i_10 = anInt8980 * i_41;

                for (int i_11 = i_9; i_11 < i_8; i_11++) {
                    int i_12 = ints_6[i_11] + i_3;
                    int i_13 = ints_7[i_11];
                    if (anInt8983 > i_12) {
                        i_13 -= anInt8983 - i_12;
                        i_12 = anInt8983;
                    }

                    if (anInt9002 < i_13 + i_12) {
                        i_13 = anInt9002 - i_12;
                    }

                    i_12 += i_10;

                    for (int i_14 = -i_13; i_14 < 0; i_14++) {
                        anIntArray8979[i_12++] = i_1;
                    }

                    i_10 += anInt8980;
                }
            }
        }

    }

    void method14410() {
        if (aFloatArray9010 != null) {
            int i_1;
            int i_2;
            int i_3;
            if (anInt8983 == 0 && anInt9002 == anInt8980 && anInt9009 == 0 && anInt8986 == anInt8981) {
                i_1 = aFloatArray9010.length;
                i_2 = i_1 - (i_1 & 0x7);

                for (i_3 = 0; i_3 < i_2; aFloatArray9010[i_3++] = 2.14748365E9F) {
                    aFloatArray9010[i_3++] = 2.14748365E9F;
                    aFloatArray9010[i_3++] = 2.14748365E9F;
                    aFloatArray9010[i_3++] = 2.14748365E9F;
                    aFloatArray9010[i_3++] = 2.14748365E9F;
                    aFloatArray9010[i_3++] = 2.14748365E9F;
                    aFloatArray9010[i_3++] = 2.14748365E9F;
                    aFloatArray9010[i_3++] = 2.14748365E9F;
                }

                while (i_3 < i_1) {
                    aFloatArray9010[i_3++] = 2.14748365E9F;
                }
            } else {
                i_1 = anInt9002 - anInt8983;
                i_2 = anInt8986 - anInt9009;
                i_3 = anInt8980 - i_1;
                int i_4 = anInt8980 * anInt9009 + anInt8983;
                int i_5 = i_1 >> 3;
                int i_6 = i_1 & 0x7;
                i_1 = i_4 - 1;

                for (int i_7 = -i_2; i_7 < 0; i_7++) {
                    int i_8;
                    if (i_5 > 0) {
                        i_8 = i_5;

                        do {
                            ++i_1;
                            aFloatArray9010[i_1] = 2.14748365E9F;
                            ++i_1;
                            aFloatArray9010[i_1] = 2.14748365E9F;
                            ++i_1;
                            aFloatArray9010[i_1] = 2.14748365E9F;
                            ++i_1;
                            aFloatArray9010[i_1] = 2.14748365E9F;
                            ++i_1;
                            aFloatArray9010[i_1] = 2.14748365E9F;
                            ++i_1;
                            aFloatArray9010[i_1] = 2.14748365E9F;
                            ++i_1;
                            aFloatArray9010[i_1] = 2.14748365E9F;
                            ++i_1;
                            aFloatArray9010[i_1] = 2.14748365E9F;
                            --i_8;
                        } while (i_8 > 0);
                    }

                    if (i_6 > 0) {
                        i_8 = i_6;

                        do {
                            ++i_1;
                            aFloatArray9010[i_1] = 2.14748365E9F;
                            --i_8;
                        } while (i_8 > 0);
                    }

                    i_1 += i_3;
                }
            }
        }

    }

    @Override
    public int method8630(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public int method8434(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public int method8632(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public void method8633() {
        anInt8998 = 0;
        anInt8999 = 0;
        anInt9000 = anInt8980;
        anInt9001 = anInt8981;
        method14364();
    }

    @Override
    public void method8635() {
        anInt8998 = 0;
        anInt8999 = 0;
        anInt9000 = anInt8980;
        anInt9001 = anInt8981;
        method14364();
    }

    @Override
    public int di() {
        return 0;
    }

    @Override
    public Class152 method8400(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        return null;
    }

	public static AbstractRenderer create(Canvas canvas, ImageLoader imageLoader, int width, int height) {
	    return new JavaRenderer(canvas, imageLoader, width, height);
	}

}
