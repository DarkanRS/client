package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class360_Sub2 extends Class360 implements Interface6 {

    int anInt9154;
    int anInt9157;
    boolean aBool9156;
    boolean aBool9155;

    Class360_Sub2(DirectXRenderer class505_sub2_sub2_1, Class150 class150_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6, int i_7, int i_8) {
        super(class505_sub2_sub2_1, class150_2, Class76.aClass76_751, bool_5 && class505_sub2_sub2_1.aBool10263);
        int i_81 = i_8;
        if (!aGraphicalRenderer_Sub2_Sub2_4165.aBool10265) {
            anInt9154 = Utils.nextPowerOfTwo(i_3);
            anInt9157 = Utils.nextPowerOfTwo(i_4);
        } else {
            anInt9154 = i_3;
            anInt9157 = i_4;
        }

        if (bool_5) {
            aLong4168 = IDirect3DDevice.CreateTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, anInt9154, anInt9157, 0, 1024, DirectXRenderer.method15652(aClass150_4167, Class76.aClass76_751), 1);
        } else {
            aLong4168 = IDirect3DDevice.CreateTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, anInt9154, anInt9157, 1, 0, DirectXRenderer.method15652(aClass150_4167, Class76.aClass76_751), 1);
        }

        if (i_81 == 0) {
            i_81 = i_3;
        }

        ByteBuffer bytebuffer_9 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
        bytebuffer_9.clear();
        Class150 class150_10 = aClass150_4167;
        Class150 class150_10000 = aClass150_4167;
        if (class150_10 == Class150.aClass150_1956) {
            bytebuffer_9.put(bytes_6, i_7, i_3 * i_4 / 2);
            IDirect3DTexture.Upload(aLong4168, 0, 0, 0, i_3, i_4 / 4, i_3 / 4 * 8, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
        } else {
            Class150 class150_11 = aClass150_4167;
            class150_10000 = aClass150_4167;
            if (class150_11 == Class150.aClass150_1957) {
                bytebuffer_9.put(bytes_6, i_7, i_3 * i_4);
                IDirect3DTexture.Upload(aLong4168, 0, 0, 0, i_3, i_4 / 4, i_3 / 4 * 16, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
            } else {
                bytebuffer_9.put(bytes_6, i_7, i_81 * i_4);
                IDirect3DTexture.Upload(aLong4168, 0, 0, 0, i_3, i_4, aClass150_4167.anInt1959 * i_81, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
            }
        }

    }

    Class360_Sub2(DirectXRenderer class505_sub2_sub2_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5, int i_6, int i_7) {
        super(class505_sub2_sub2_1, class150_2, class76_3, false);
        if (!aGraphicalRenderer_Sub2_Sub2_4165.aBool10265) {
            anInt9154 = Utils.nextPowerOfTwo(i_4);
            anInt9157 = Utils.nextPowerOfTwo(i_5);
        } else {
            anInt9154 = i_4;
            anInt9157 = i_5;
        }

        aLong4168 = IDirect3DDevice.CreateTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, i_4, i_5, 0, i_6, DirectXRenderer.method15652(aClass150_4167, aClass76_4164), i_7);
    }

    Class360_Sub2(DirectXRenderer class505_sub2_sub2_1, Class150 class150_2, int i_3, int i_4, boolean bool_5, float[] floats_6, int i_7, int i_8) {
        super(class505_sub2_sub2_1, class150_2, Class76.aClass76_751, bool_5 && class505_sub2_sub2_1.aBool10263);
        int i_81 = i_8;
        if (!aGraphicalRenderer_Sub2_Sub2_4165.aBool10265) {
            anInt9154 = Utils.nextPowerOfTwo(i_3);
            anInt9157 = Utils.nextPowerOfTwo(i_4);
        } else {
            anInt9154 = i_3;
            anInt9157 = i_4;
        }

        if (bool_5) {
            aLong4168 = IDirect3DDevice.CreateTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, anInt9154, anInt9157, 0, 1024, DirectXRenderer.method15652(aClass150_4167, Class76.aClass76_758), 1);
        } else {
            aLong4168 = IDirect3DDevice.CreateTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, anInt9154, anInt9157, 1, 0, DirectXRenderer.method15652(aClass150_4167, Class76.aClass76_758), 1);
        }

        if (i_81 == 0) {
            i_81 = i_3;
        }

        ByteBuffer bytebuffer_9 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
        bytebuffer_9.clear();
        bytebuffer_9.asFloatBuffer().put(floats_6, i_7, aClass150_4167.anInt1959 * i_81 * i_4);
        IDirect3DTexture.Upload(aLong4168, 0, 0, 0, i_3, i_4, aClass150_4167.anInt1959 * i_81 * 4, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
    }

    Class360_Sub2(DirectXRenderer class505_sub2_sub2_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
        this(class505_sub2_sub2_1, class150_2, class76_3, i_4, i_5, 0, 1);
    }

    Class360_Sub2(DirectXRenderer class505_sub2_sub2_1, int i_2, int i_3, boolean bool_4, int[] ints_5, int i_6, int i_7) {
        super(class505_sub2_sub2_1, Class150.aClass150_1949, Class76.aClass76_751, bool_4 && class505_sub2_sub2_1.aBool10263);
        int i_71 = i_7;
        if (!aGraphicalRenderer_Sub2_Sub2_4165.aBool10265) {
            anInt9154 = Utils.nextPowerOfTwo(i_2);
            anInt9157 = Utils.nextPowerOfTwo(i_3);
        } else {
            anInt9154 = i_2;
            anInt9157 = i_3;
        }

        if (bool_4) {
            aLong4168 = IDirect3DDevice.CreateTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, anInt9154, anInt9157, 0, 1024, 21, 1);
        } else {
            aLong4168 = IDirect3DDevice.CreateTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, anInt9154, anInt9157, 1, 0, 21, 1);
        }

        if (i_71 == 0) {
            i_71 = i_2;
        }

        ByteBuffer bytebuffer_8 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
        bytebuffer_8.clear();
        bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_3 * i_71);
        IDirect3DTexture.Upload(aLong4168, 0, 0, 0, i_2, i_3, aClass150_4167.anInt1959 * i_71, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
    }

    @Override
    public boolean method46() {
        return true;
    }

    @Override
    public void method48(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
        int i_71 = i_7;
        if (aClass150_4167 == Class150.aClass150_1949 && aClass76_4164 == Class76.aClass76_751) {
            if (i_71 == 0) {
                i_71 = i_3;
            }

            ByteBuffer bytebuffer_8 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
            bytebuffer_8.clear();
            bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_4 * i_71);
            IDirect3DTexture.Upload(aLong4168, 0, i_1, i_2, i_3, i_4, aClass150_4167.anInt1959 * i_71, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void method66(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
        int i_71 = i_7;
        if (aClass150_4167 == Class150.aClass150_1949 && aClass76_4164 == Class76.aClass76_751) {
            if (i_71 == 0) {
                i_71 = i_3;
            }

            ByteBuffer bytebuffer_8 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
            bytebuffer_8.clear();
            bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_71 * i_4);
            IDirect3DTexture.Upload(aLong4168, 0, i_1, i_2, i_3, i_4, i_71 * aClass150_4167.anInt1959 * -615555291 * 351642797, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public boolean method63() {
        return true;
    }

    @Override
    long method6245() {
        return aLong4168;
    }

    @Override
    public int method36() {
        return anInt9154;
    }

    @Override
    public float method62(float f_1) {
        return f_1 / anInt9157;
    }

    @Override
    public void method52(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
        int i_81 = i_8;
        if (class150_6 == aClass150_4167 && aClass76_4164 == Class76.aClass76_751) {
            if (i_81 == 0) {
                i_81 = i_3;
            }

            ByteBuffer bytebuffer_9 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
            bytebuffer_9.clear();
            bytebuffer_9.put(bytes_5, i_7, i_81 * i_4);
            IDirect3DTexture.Upload(aLong4168, 0, i_1, i_2, i_3, i_4, aClass150_4167.anInt1959 * i_81, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void method204(Class35 class35_1) {
        super.method205(class35_1);
    }

    @Override
    public void method50(boolean bool_1, boolean bool_2) {
        aBool9156 = bool_1;
        aBool9155 = bool_2;
    }

    @Override
    public void method201(Class35 class35_1) {
        super.method205(class35_1);
    }

    @Override
    public void method53(int i_3, int i_4, int[] ints_5) {
        if (aClass150_4167 == Class150.aClass150_1949 && aClass76_4164 == Class76.aClass76_751) {
            ByteBuffer bytebuffer_7 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
            bytebuffer_7.clear();
            IDirect3DTexture.Download(aLong4168, 0, 0, 0, i_3, i_4, i_3 * 4, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
            bytebuffer_7.asIntBuffer().get(ints_5, 0, i_3 * i_4);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void method207() {
        aGraphicalRenderer_Sub2_Sub2_4165.method15647(this);
    }

    @Override
    public float method47(float f_1) {
        return f_1 / anInt9154;
    }

    @Override
    public void method26() {
        super.method26();
    }

    @Override
    public int method55() {
        return anInt9154;
    }

    @Override
    public int method59() {
        return anInt9157;
    }

    @Override
    public int method57() {
        return anInt9154;
    }

    @Override
    public int method70() {
        return anInt9154;
    }

    @Override
    public float method65(float f_1) {
        return f_1 / anInt9154;
    }

    @Override
    public float method56(float f_1) {
        return f_1 / anInt9154;
    }

    @Override
    public float method45(float f_1) {
        return f_1 / anInt9154;
    }

    @Override
    public float method60(float f_1) {
        return f_1 / anInt9157;
    }

    @Override
    public boolean method54() {
        return false;
    }

    @Override
    public float method51(float f_1) {
        return f_1 / anInt9157;
    }

    @Override
    public int method1() {
        return anInt9154;
    }

    @Override
    public void method64(boolean bool_1, boolean bool_2) {
        aBool9156 = bool_1;
        aBool9155 = bool_2;
    }

    @Override
    public void method61(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
        int i_71 = i_7;
        if (aClass150_4167 == Class150.aClass150_1949 && aClass76_4164 == Class76.aClass76_751) {
            if (i_71 == 0) {
                i_71 = i_3;
            }

            ByteBuffer bytebuffer_8 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
            bytebuffer_8.clear();
            bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_71 * i_4);
            IDirect3DTexture.Upload(aLong4168, 0, i_1, i_2, i_3, i_4, i_71 * aClass150_4167.anInt1959 * -615555291 * 351642797, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void method205(Class35 class35_1) {
        super.method205(class35_1);
    }

    @Override
    public void method67(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
        int i_71 = i_7;
        if (aClass150_4167 == Class150.aClass150_1949 && aClass76_4164 == Class76.aClass76_751) {
            if (i_71 == 0) {
                i_71 = i_3;
            }

            ByteBuffer bytebuffer_8 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
            bytebuffer_8.clear();
            bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_71 * i_4);
            IDirect3DTexture.Upload(aLong4168, 0, i_1, i_2, i_3, i_4, i_71 * aClass150_4167.anInt1959 * -615555291 * 351642797, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void method68(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
        int i_81 = i_8;
        if (aClass150_4167 == class150_6 && aClass76_4164 == Class76.aClass76_751) {
            if (i_81 == 0) {
                i_81 = i_3;
            }

            ByteBuffer bytebuffer_9 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
            bytebuffer_9.clear();
            bytebuffer_9.put(bytes_5, i_7, i_81 * i_4);
            IDirect3DTexture.Upload(aLong4168, 0, i_1, i_2, i_3, i_4, i_81 * aClass150_4167.anInt1959 * -615555291 * 351642797, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void method69(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6) {
        if (aClass150_4167 == Class150.aClass150_1949 && aClass76_4164 == Class76.aClass76_751) {
            ByteBuffer bytebuffer_7 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
            bytebuffer_7.clear();
            IDirect3DTexture.Download(aLong4168, 0, i_1, i_2, i_3, i_4, i_3 * 4, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
            bytebuffer_7.asIntBuffer().get(ints_5, i_6, i_3 * i_4);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public boolean method49() {
        return false;
    }

    @Override
    public void method203() {
        aGraphicalRenderer_Sub2_Sub2_4165.method15647(this);
    }

    @Override
    public void method32() {
        super.method26();
    }

    @Override
    public void method206(Class35 class35_1) {
        super.method205(class35_1);
    }

    @Override
    public float method58(float f_1) {
        return f_1 / anInt9157;
    }

    @Override
    public void method202(Class35 class35_1) {
        super.method205(class35_1);
    }

    @Override
    public int method71() {
        return anInt9157;
    }

    @Override
    public int method72() {
        return anInt9157;
    }

}
