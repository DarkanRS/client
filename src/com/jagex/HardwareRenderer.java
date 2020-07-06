package com.jagex;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public abstract class HardwareRenderer extends AbstractRenderer {

    static Object anObject8711 = new Object();
    static Matrix44 aClass384_8712 = new Matrix44();
    public int anInt8701;
    public int anInt8702;
    public boolean aBool8718;
    public int anInt8825;
    public Matrix44 aClass384_8740;
    public Matrix44 aClass384_8727;
    public Matrix44 aClass384_8729;
    public float[] aFloatArray8747;
    public float aFloat8766;
    public float aFloat8767;
    public float aFloat8768;
    public float aFloat8770;
    public int anInt8709;
    public Unsafe anUnsafe8830;
    public ByteBuffer aByteBuffer8838;
    public long aLong8695;
    public int anInt8820;
    public Interface6 anInterface6_8788;
    protected int anInt8761;
    protected int anInt8799;
    protected float aFloat8813;
    protected float aFloat8819;
    protected boolean aBool8827;
    protected boolean aBool8828;
    protected Matrix44 aClass384_8683;
    protected float aFloat8735;
    protected float aFloat8736;
    protected float aFloat8726;
    protected float aFloat8697;
    protected int anInt8822;
    protected int anInt8742;
    protected int anInt8743;
    protected int anInt8744;
    protected int anInt8749;
    protected int anInt8776;
    protected int anInt8751;
    protected int anInt8752;
    protected int anInt8823;
    protected int anInt8754;
    protected boolean aBool8755;
    protected boolean aBool8756;
    protected boolean aBool8757;
    protected boolean aBool8684;
    protected boolean aBool8759;
    protected boolean aBool8760;
    protected float[] aFloatArray8762;
    protected float aFloat8769;
    protected float aFloat8826;
    protected int anInt8780;
    protected boolean aBool8809;
    protected int anInt8810;
    protected int anInt8811;
    protected int anInt8680;
    protected Class73 aClass73_8733;
    protected boolean aBool8817;
    protected boolean aBool8818;
    protected int anInt8844;
    protected boolean aBool8692;
    protected boolean aBool8843;
    protected int anInt8831;
    protected int anInt8773;
    protected int anInt8758;
    protected boolean aBool8808;
    protected Matrix44[] aClass384Array8782;
    protected Class37[] aClass37Array8783;
    protected Class68[] aClass68Array8784;
    protected Class68[] aClass68Array8785;
    protected Node_Sub24[] aNode_Sub24Array8716;
    int anInt8696 = 4194304;
    Class428 aClass428_8772 = new Class428();
    LinkedNodeList aClass473_8700;
    Matrix44Var aClass294_8704;
    Matrix44 aClass384_8705;
    Matrix44Var aClass294_8706;
    Matrix44Var aClass294_8804;
    Matrix44 aClass384_8814;
    Matrix44Var aClass294_8710;
    Matrix44 aClass384_8685;
    Matrix44Var aClass294_8713;
    Matrix44 aClass384_8715;
    Vector3 aClass385_8707;
    float[] aFloatArray8717;
    boolean aBool8829;
    Class33 aClass33_8719;
    boolean aBool8720;
    Matrix44 aClass384_8774;
    Matrix44 aClass384_8812;
    boolean aBool8723;
    Matrix44 aClass384_8724;
    Matrix44 aClass384_8725;
    Matrix44 aClass384_8708;
    Matrix44 aClass384_8728;
    float[][] aFloatArrayArray8730;
    float aFloat8737;
    float aFloat8738;
    int anInt8745;
    int anInt8835;
    int anInt8722;
    int anInt8748;
    float[] aFloatArray8763;
    float[] aFloatArray8764;
    int anInt8765;
    int anInt8775;
    int anInt8806;
    int anInt8821;
    Class41[] aClass41Array8793;
    Class55[] aClass55Array8802;
    boolean aBool8805;
    int anInt8815;
    boolean aBool8681;
    MeshRasterizer_Sub3[] aMeshRasterizer_Sub3Array8839;
    MeshRasterizer_Sub3[] aMeshRasterizer_Sub3Array8840;
    Matrix44 aClass384_8841;
    Matrix44Var aClass294_8842;
    Index shaderIndex;
    int anInt8824;
    Class66 aClass66_8787;
    int[] anIntArray8803;
    Class49 aClass49_8694;
    Class48 aClass48_8794;
    Class47 aClass47_8698;
    Class103 aClass103_8796;
    Class41_Sub1_Sub1 aClass41_Sub1_Sub1_8691;
    Class41_Sub1_Sub2 aClass41_Sub1_Sub2_8798;
    Class32 aClass32_8714;
    Class41 aClass41_8753;
    Class54 aClass54_8837;
    int anInt8703;
    int anInt8777;
    int anInt8778;
    NativeHeap aNativeHeap8699;
    Class152_Sub2 aClass152_Sub2_8731;
    float aFloat8732;
    float aFloat8734;
    float aFloat8797;
    float aFloat8741;
    Interface4 anInterface4_8746;
    Class70 aClass70_8786;
    int anInt8739;
    HDWaterTile aClass90_8807;
    boolean aBool8779;
    Interface4 anInterface4_8682;
    Class70 aClass70_8833;
    Interface30[] anInterface30Array8781;
    Interface6 anInterface6_8795;
    Class70 aClass70_8832;
    Class70 aClass70_8836;
    Class70 aClass70_8721;
    Interface32 anInterface32_8834;
    NativeSprite_Sub3 aNativeSprite_Sub3_8790;
    NativeSprite_Sub3 aNativeSprite_Sub3_8791;
    Interface4 anInterface4_8693;

    HardwareRenderer(ImageLoader interface22_1, Index index_2, int i_3, int i_4) {
        super(interface22_1);
        anInt8696 = 4194304;
        aClass473_8700 = new LinkedNodeList();
        aClass294_8704 = new Matrix44Var();
        aClass384_8705 = new Matrix44();
        aClass294_8706 = new Matrix44Var();
        aClass294_8804 = new Matrix44Var();
        aClass384_8740 = new Matrix44();
        aClass384_8814 = new Matrix44();
        aClass294_8710 = new Matrix44Var();
        aClass384_8685 = new Matrix44();
        aClass294_8713 = new Matrix44Var();
        aClass384_8683 = new Matrix44();
        aClass384_8715 = new Matrix44();
        aClass385_8707 = new Vector3();
        aFloatArray8717 = new float[4];
        aBool8829 = false;
        aClass33_8719 = Class33.aClass33_380;
        aBool8720 = false;
        aClass384_8774 = new Matrix44();
        aClass384_8812 = new Matrix44();
        aBool8723 = false;
        aClass384_8724 = new Matrix44();
        aClass384_8725 = new Matrix44();
        aClass384_8708 = aClass384_8725;
        aClass384_8727 = new Matrix44();
        aClass384_8728 = new Matrix44();
        aClass384_8729 = new Matrix44();
        aFloatArrayArray8730 = new float[6][4];
        aFloat8735 = 0.0F;
        aFloat8736 = 1.0F;
        aFloat8737 = 0.0F;
        aFloat8738 = 1.0F;
        aFloat8726 = 50.0F;
        aFloat8697 = 3584.0F;
        anInt8822 = 0;
        anInt8742 = 0;
        anInt8743 = 0;
        anInt8744 = 0;
        anInt8745 = 0;
        anInt8835 = 0;
        anInt8722 = 0;
        anInt8748 = 0;
        anInt8749 = 0;
        anInt8776 = 0;
        anInt8751 = 0;
        anInt8752 = 0;
        anInt8823 = 0;
        anInt8754 = 0;
        aBool8755 = true;
        aBool8756 = false;
        aBool8757 = false;
        aBool8684 = false;
        aBool8759 = true;
        aBool8760 = false;
        aFloatArray8747 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
        aFloatArray8762 = new float[]{0.0F, 0.0F, -1.0f, 0.0F};
        aFloatArray8763 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
        aFloatArray8764 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
        anInt8765 = 16777215;
        aFloat8766 = 1.0F;
        aFloat8767 = 1.0F;
        aFloat8768 = 1.0F;
        aFloat8769 = 1.0F;
        aFloat8770 = -1.0f;
        aFloat8826 = -1.0f;
        anInt8775 = 8;
        anInt8806 = 3;
        anInt8821 = 128;
        anInt8780 = 0;
        aClass41Array8793 = new Class41[16];
        aClass55Array8802 = new Class55[2];
        aBool8805 = false;
        aBool8809 = true;
        anInt8810 = -1;
        anInt8811 = -1;
        anInt8680 = 0;
        anInt8815 = 1;
        aClass73_8733 = Class73.aClass73_727;
        aBool8817 = true;
        aBool8818 = true;
        aBool8681 = false;
        new Stream();
        aMeshRasterizer_Sub3Array8839 = new MeshRasterizer_Sub3[7];
        aMeshRasterizer_Sub3Array8840 = new MeshRasterizer_Sub3[7];
        aClass384_8841 = new Matrix44();
        aClass294_8842 = new Matrix44Var();
        anInt8844 = -1;

        try {
            shaderIndex = index_2;
            anInt8709 = i_3;
            anInt8824 = i_4;
            SunDefinitions.method854(false, true);
            if (textureCache != null) {
                aClass66_8787 = new Class66(this, textureCache);
            } else {
                aClass66_8787 = null;
            }

            if (anInt8824 == 0) {
                anIntArray8803 = Class540.anIntArray7136;
            } else {
                anIntArray8803 = EnumIndexLoader.anIntArray5379;
            }

            try {
                Field field_5 = Unsafe.class.getDeclaredField("theUnsafe");
                field_5.setAccessible(true);
                anUnsafe8830 = (Unsafe) field_5.get(null);
            } catch (Exception ignored) {
            }

            aByteBuffer8838 = ByteBuffer.allocateDirect(4194304);
            aByteBuffer8838.order(ByteOrder.nativeOrder());
            aLong8695 = DirectBufferHelper.getDirectBufferAddress(aByteBuffer8838);
        } catch (Throwable throwable_7) {
            throwable_7.printStackTrace();
            method8396();
            if (throwable_7 instanceof OutOfMemoryError) {
                throw (OutOfMemoryError) throwable_7;
            }

            throw new RuntimeException("");
        }

        method8439(method8438(131072));
    }

    public static boolean method13893() {
        return Class362.getNativeLibraryLoader().loadLibrary("jaclib");
    }

    Matrix44 method13884() {
        return aClass384Array8782[anInt8780];
    }

    public void method13885(Interface7 interface7_1) {
        aClass428_8772.method7191(interface7_1);
    }

    void method13886() {
        ArrayList arraylist_1 = aClass428_8772.method7193();

        for (Object o : arraylist_1) {
            Interface7 interface7_3 = (Interface7) o;
            interface7_3.method26();
        }

    }

    public abstract boolean method13887();

    public abstract boolean method13888();

    boolean method13889() {
        return aBool8692;
    }

    public abstract Shader loadShader(String var1);

    @Override
    public void method8586(Matrix44 matrix44_1) {
        aClass384_8724.method6562(matrix44_1);
        method13926();
        if (aClass33_8719 == Class33.aClass33_381) {
            method14030();
        }

    }

    ShaderLoader method13891(byte[] bytes_1) {
        if (bytes_1 == null) {
            return null;
        } else {
            try {
                ShaderLoader class114_2 = new ShaderLoader(bytes_1);
                return class114_2;
            } catch (Exception exception_4) {
                return null;
            }
        }
    }

    public abstract void method13892(Matrix44 var1, Matrix44 var2, Matrix44 var3);

    abstract void method13894();

    void method13895() {
        aClass49_8694 = new Class49(this);
        aBool8692 = false;

        try {
            aClass48_8794 = new Class48_Sub2(this);
            aClass47_8698 = new Class47_Sub1(this);
            aClass103_8796 = new Class103_Sub1(this);
            aClass41_Sub1_Sub1_8691 = new Class41_Sub1_Sub1(this, aClass49_8694);
            aClass41_Sub1_Sub2_8798 = new Class41_Sub1_Sub2(this, aClass49_8694);
        } catch (Exception exception_4) {
            exception_4.printStackTrace();
            aClass48_8794 = new Class48_Sub1(this);
            aClass47_8698 = new Class47_Sub2(this);
            aClass103_8796 = new Class103_Sub2(this);
            aClass41_Sub1_Sub1_8691 = null;
            aClass41_Sub1_Sub2_8798 = null;
            aBool8692 = true;
        }

        int i_2;
        int i_3;
        if (aClass158_5853 != null) {
            i_2 = aClass158_5853.method2714();
            i_3 = aClass158_5853.method2716();
        } else {
            i_3 = 0;
            i_2 = 0;
        }

        aClass32_8714 = new Class32(this, i_2, i_3);
        if (!aBool8692) {
            aClass55Array8802[1] = new Class55_Sub1(this);
            aClass32_8714.method816(aClass55Array8802[1]);
        }

        if (aClass41_8753 != null) {
            aClass41_8753.method885();
            aClass41_8753 = null;
        }

        method13899();
    }

    Class41 method13896(int i_1) {
        return aClass41Array8793[i_1];
    }

    void method13897() {
        method13986(7);
        method13976();
    }

    @Override
    public void method8573(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * f_1 + aClass384_8728.buf[7] * f_2 + aClass384_8728.buf[11] * f_3;
        float f_6 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * f_1 + aClass384_8728.buf[4] * f_2 + aClass384_8728.buf[8] * f_3;
        float f_7 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * f_1 + aClass384_8728.buf[5] * f_2 + aClass384_8728.buf[9] * f_3;
        float f_8 = aClass384_8740.buf[14] + aClass384_8740.buf[2] * f_1 + aClass384_8740.buf[6] * f_2 + aClass384_8740.buf[10] * f_3;
        floats_4[0] = aFloat8797 + aFloat8732 * f_6 / f_5;
        floats_4[1] = aFloat8741 + aFloat8734 * f_7 / f_5;
        floats_4[2] = f_8;
    }

    HDWaterTile method13898() {
        return aClass90_8807;
    }

    void method13899() {
        aClass32_8714.method819();

        for (int i_1 = 0; i_1 < aClass55Array8802.length; i_1++) {
            if (aClass55Array8802[i_1] != null && aClass55Array8802[i_1].method1107()) {
                aClass55Array8802[i_1].method1099();
            }
        }

        aClass54_8837 = new Class54(this);
        method13944();
        method14009();
        method14177();
        aClass54_8837.method1089();
    }

    void method13900() {
        aClass32_8714.method818();
        anInterface4_8746.method26();
        anInterface4_8682.method26();
        anInterface4_8693.method26();

        for (int i_1 = 0; i_1 < 7; i_1++) {
            aMeshRasterizer_Sub3Array8840[i_1].method14280();
        }

        aClass54_8837.method1090();
        anInterface32_8834.method26();
    }

    @Override
    public NativeSprite method8668(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        NativeSprite_Sub3 class160_sub3_6 = new NativeSprite_Sub3(this, i_3, i_4, bool_5, false);
        class160_sub3_6.method2750(0, 0, i_3, i_4, i_1, i_2);
        return class160_sub3_6;
    }

    @Override
    public boolean method8399() {
        return true;
    }

    @Override
    public void fm(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        if (aClass158_5853 != null) {
            i_6 = aClass158_5853.method2714();
            i_5 = aClass158_5853.method2716();
        } else {
            i_5 = 0;
            i_6 = 0;
        }

        if (i_1 <= 0 && i_3 >= i_6 - 1 && i_2 <= 0 && i_4 >= i_5 - 1) {
            L();
        } else {
            anInt8743 = Math.max(0, i_1);
            anInt8744 = Math.min(i_3, i_6);
            anInt8822 = Math.max(0, i_2);
            anInt8742 = Math.min(i_4, i_5);
            if (!aBool8843) {
                aBool8843 = true;
                method13922();
            }

            method13921();
        }

    }

    @Override
    void method8397() {
        if (!aBool8681) {
            method13900();
            aClass66_8787.method1279();

            for (Node node_1 = aClass473_8700.getBack(); node_1 != null; node_1 = aClass473_8700.getPrevious()) {
                ((Node_Sub1_Sub2) node_1).method15609();
            }

            Class13.method508(false, true);

            int i_2;
            for (i_2 = 0; i_2 < aClass41Array8793.length; i_2++) {
                if (aClass41Array8793[i_2] != null) {
                    aClass41Array8793[i_2].method878();
                    aClass41Array8793[i_2] = null;
                }
            }

            for (i_2 = 0; i_2 < aClass55Array8802.length; i_2++) {
                if (aClass55Array8802[i_2] != null) {
                    aClass55Array8802[i_2].method1105();
                    aClass55Array8802[i_2] = null;
                }
            }

            method13886();
            method8398(0);
            aBool8681 = true;
        }

    }

    public void method13901(Interface7 interface7_1) {
        aClass428_8772.method7201(interface7_1);
    }

    @Override
    public boolean method8664() {
        return true;
    }

    @Override
    public boolean method8403() {
        return aClass55Array8802[1] != null;
    }

    void method13903() {
        if (method13889()) {
            method13953();
        }

        anInt8831 = anInt8773;
        anInt8773 = 0;
    }

    void method13904(int i_1) {
        if (anInt8815 != i_1) {
            Class73 class73_2;
            boolean bool_3;
            boolean bool_4;
            if (i_1 == 1) {
                class73_2 = Class73.aClass73_727;
                bool_3 = true;
                bool_4 = true;
            } else if (i_1 == 2) {
                class73_2 = Class73.aClass73_725;
                bool_3 = false;
                bool_4 = true;
            } else if (i_1 == 128) {
                class73_2 = Class73.aClass73_726;
                bool_3 = true;
                bool_4 = true;
            } else {
                class73_2 = Class73.aClass73_728;
                bool_3 = false;
                bool_4 = false;
            }

            if (bool_3 != aBool8818) {
                aBool8818 = bool_3;
                method14238();
            }

            if (bool_4 != aBool8817) {
                aBool8817 = bool_4;
                method13914();
            }

            if (class73_2 != aClass73_8733) {
                aClass73_8733 = class73_2;
                method13894();
            }

            anInt8815 = i_1;
            anInt8703 &= -13;
        }

    }

    @Override
    public void iw(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
        boolean bool_7 = anInt8765 != i_1;
        if (bool_7 || aFloat8770 != f_2 || aFloat8826 != f_3) {
            anInt8765 = i_1;
            aFloat8770 = f_2;
            aFloat8826 = f_3;
            if (bool_7) {
                aFloat8766 = (anInt8765 & 0xff0000) / 1.671168E7F;
                aFloat8767 = (anInt8765 & 0xff00) / 65280.0F;
                aFloat8768 = (anInt8765 & 0xff) / 255.0F;
                method13948();
            }

            method13949();
        }

        if (aFloatArray8763[0] != f_4 || aFloatArray8763[1] != f_5 || aFloatArray8763[2] != f_6) {
            aFloatArray8763[0] = f_4;
            aFloatArray8763[1] = f_5;
            aFloatArray8763[2] = f_6;
            aFloatArray8764[0] = -f_4;
            aFloatArray8764[1] = -f_5;
            aFloatArray8764[2] = -f_6;
            float f_8 = (float) (1.0D / Math.sqrt(f_4 * f_4 + f_5 * f_5 + f_6 * f_6));
            aFloatArray8747[0] = f_4 * f_8;
            aFloatArray8747[1] = f_5 * f_8;
            aFloatArray8747[2] = f_6 * f_8;
            aFloatArray8762[0] = -aFloatArray8747[0];
            aFloatArray8762[1] = -aFloatArray8747[1];
            aFloatArray8762[2] = -aFloatArray8747[2];
            method13950();
            anInt8777 = (int) (f_4 * 256.0F / f_5);
            anInt8778 = (int) (f_6 * 256.0F / f_5);
        }

        method13951();
    }

    @Override
    public boolean method8454() {
        return true;
    }

    @Override
    public boolean method8407() {
        return false;
    }

    @Override
    public boolean method8405() {
        return aBool8828;
    }

    public abstract float method13905();

    @Override
    public void method8398(int i_1) {
        if (aClass66_8787 != null) {
            aClass66_8787.method1278();
        }

        anInt8820 = i_1 & 0x7fffffff;
    }

    void method13906() {
        method13907();
    }

    void method13907() {
        method13936();
        method13938();
        method13934();
        method8421();
        L();
    }

    @Override
    public boolean method8469() {
        if (aClass55Array8802[1] != null && !aClass55Array8802[1].method1107()) {
            boolean bool_1 = aClass32_8714.method816(aClass55Array8802[1]);
            if (bool_1) {
                aClass66_8787.method1279();
            }

            return bool_1;
        } else {
            return false;
        }
    }

    @Override
    public void method8490() {
        if (aClass55Array8802[1] != null && aClass55Array8802[1].method1107()) {
            aClass32_8714.method822(aClass55Array8802[1]);
            aClass66_8787.method1279();
        }

    }

    @Override
    public boolean method8471() {
        return aClass55Array8802[1] != null && aClass55Array8802[1].method1107();
    }

    @Override
    void method8592(float f_1, float f_2, float f_3) {
        Class55_Sub1.aFloat9188 = f_1;
        Class55_Sub1.aFloat9184 = f_2;
        Class55_Sub1.aFloat9189 = f_3;
        Class55_Sub1.aFloat9186 = (float) 1.0;
    }

    boolean method13908(float f_1, float f_2, float f_4, float f_5) {
        aByteBuffer8838.clear();
        aByteBuffer8838.putFloat(f_1);
        aByteBuffer8838.putFloat(f_2);
        aByteBuffer8838.putFloat((float) 0.0);
        aByteBuffer8838.putFloat(f_4);
        aByteBuffer8838.putFloat(f_5);
        aByteBuffer8838.putFloat((float) 0.0);
        return anInterface4_8682.method42(0, aByteBuffer8838.position(), aLong8695);
    }

    abstract void method13909();

    @Override
    public Node_Sub1 method8438(int i_1) {
        Node_Sub1_Sub2 class282_sub1_sub2_2 = new Node_Sub1_Sub2(i_1);
        aClass473_8700.insertBack(class282_sub1_sub2_2);
        return class282_sub1_sub2_2;
    }

    @Override
    public void method8439(Node_Sub1 class282_sub1_1) {
        aNativeHeap8699 = ((Node_Sub1_Sub2) class282_sub1_1).aNativeHeap10212;
    }

    public NativeHeapBuffer method13910(int i_1, boolean bool_2) {
        return aNativeHeap8699.method759(i_1, bool_2);
    }

    Interface32 method13911(int i_1) {
        if (anInterface32_8834.method39() < i_1 * 2) {
            anInterface32_8834.method208(i_1);
        }

        return anInterface32_8834;
    }

    @Override
    public int za() {
        return anInt8702 + anInt8701 + anInt8761;
    }

    @Override
    public FontRenderer method8660(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
        return new FontRenderer_Sub4(this, fontmetrics_1, arr_2, bool_3);
    }

    @Override
    public NativeSprite method8444(SpriteDefinitions class91_1, boolean bool_2) {
        NativeSprite nativesprite_3;
        if (class91_1.width != 0 && class91_1.height != 0) {
            int[] ints_4 = new int[class91_1.width * class91_1.height];
            int i_5 = 0;
            int i_6 = 0;
            int i_7;
            int i_8;
            if (class91_1.alpha != null) {
                for (i_7 = 0; i_7 < class91_1.height; i_7++) {
                    for (i_8 = 0; i_8 < class91_1.width; i_8++) {
                        ints_4[i_6++] = class91_1.alpha[i_5] << 24 | class91_1.pallete[class91_1.pixels[i_5] & 0xff];
                        ++i_5;
                    }
                }
            } else {
                for (i_7 = 0; i_7 < class91_1.height; i_7++) {
                    for (i_8 = 0; i_8 < class91_1.width; i_8++) {
                        int i_9 = class91_1.pallete[class91_1.pixels[i_5++] & 0xff];
                        ints_4[i_6++] = i_9 != 0 ? -16777216 | i_9 : 0;
                    }
                }
            }

            nativesprite_3 = createNativeSprite(ints_4, class91_1.width, class91_1.width, class91_1.height);
        } else {
            nativesprite_3 = createNativeSprite(new int[1], 1, 1, 1);
        }

        nativesprite_3.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
        return nativesprite_3;
    }

    @Override
    public NativeSprite method8442(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        return new NativeSprite_Sub3(this, i_4, i_5, ints_1, i_2, i_3);
    }

    Matrix44 method13912() {
        return aClass384_8727;
    }

    abstract void method13913();

    @Override
    public Class455 method8624(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
    }

    abstract void method13914();

    @Override
    public MeshRasterizer createMeshRasterizer(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    public void method8542(Node_Sub1 class282_sub1_1) {
        aNativeHeap8699 = ((Node_Sub1_Sub2) class282_sub1_1).aNativeHeap10212;
    }

    @Override
    public int method8546(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public Ground createGround(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_6, int i_7) {
        return new HardwareGround(this, i_6, i_7, i_1, i_2, ints_3, ints_4, 512);
    }

    abstract void method13915();

    @Override
    public Matrix44Var method8450() {
        return aClass294_8842;
    }

    abstract void method13916();

    @Override
    public void method8477(Class152 class152_1) {
        aClass152_Sub2_8731 = (Class152_Sub2) class152_1;
    }

    abstract Interface1 method13917(Class150 var1, int var2, int var3, int var4, boolean var5, byte[] var6);

    @Override
    public void method8421() {
        anInt8745 = 0;
        anInt8835 = 0;
        anInt8722 = aClass158_5853.method2714();
        anInt8748 = aClass158_5853.method2716();
        method13918();
    }

    @Override
    public void method8617(int i_1, int i_2, int i_3, int i_4) {
        anInt8745 = i_1;
        anInt8835 = i_2;
        anInt8722 = i_3;
        anInt8748 = i_4;
        method13918();
    }

    void method13918() {
        if (aClass33_8719 == Class33.aClass33_381) {
            anInt8749 = anInt8745;
            anInt8776 = anInt8835;
            anInt8751 = anInt8722;
            anInt8752 = anInt8748;
            aFloat8735 = aFloat8737;
            aFloat8736 = aFloat8738;
        } else {
            anInt8749 = 0;
            anInt8776 = 0;
            anInt8751 = aClass158_5853.method2714();
            anInt8752 = aClass158_5853.method2716();
            aFloat8735 = 0.0F;
            aFloat8736 = 1.0F;
        }

        method13920();
        aFloat8732 = anInt8722 / 2.0F;
        aFloat8734 = anInt8748 / 2.0F;
        aFloat8797 = anInt8745 + aFloat8732;
        aFloat8741 = anInt8835 + aFloat8734;
    }

    @Override
    public boolean method8674() {
        return true;
    }

    @Override
    public void qa(int[] ints_1) {
        ints_1[0] = anInt8743;
        ints_1[1] = anInt8822;
        ints_1[2] = anInt8744;
        ints_1[3] = anInt8742;
    }

    @Override
    public void en(float f_1, float f_2) {
        aFloat8737 = f_1;
        aFloat8738 = f_2;
        method13918();
    }

    @Override
    public void fq(int i_1, int i_2, int i_3, int i_4, int i_5) {
        method8433(i_1, i_2, i_1 + i_3, i_2, i_4, i_5);
    }

    @Override
    public void o(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        if (aClass158_5853 != null) {
            i_6 = aClass158_5853.method2714();
            i_5 = aClass158_5853.method2716();
        } else {
            i_5 = 0;
            i_6 = 0;
        }

        i_1 = Math.max(0, i_1);
        i_3 = Math.min(i_3, i_6);
        i_2 = Math.max(0, i_2);
        i_4 = Math.min(i_4, i_5);
        boolean bool_7 = false;
        if (anInt8743 < i_1) {
            anInt8743 = i_1;
            bool_7 = true;
        }

        if (anInt8744 > i_3) {
            anInt8744 = i_3;
            bool_7 = true;
        }

        if (anInt8822 < i_2) {
            anInt8822 = i_2;
            bool_7 = true;
        }

        if (anInt8742 > i_4) {
            anInt8742 = i_4;
            bool_7 = true;
        }

        if (bool_7) {
            if (!aBool8843) {
                aBool8843 = true;
                method13922();
            }

            method13921();
        }

    }

    void method13919() {
        anInt8823 = 0;
        anInt8754 = 0;
        method13920();
        method13921();
    }

    abstract void method13920();

    abstract void method13921();

    abstract void method13922();

    public abstract void method13923(Class352 var1, int var2, int var3);

    @Override
    void method8485() {
        if (!aBool8681) {
            method13900();
            aClass66_8787.method1279();

            for (Node node_1 = aClass473_8700.getBack(); node_1 != null; node_1 = aClass473_8700.getPrevious()) {
                ((Node_Sub1_Sub2) node_1).method15609();
            }

            Class13.method508(false, true);

            int i_2;
            for (i_2 = 0; i_2 < aClass41Array8793.length; i_2++) {
                if (aClass41Array8793[i_2] != null) {
                    aClass41Array8793[i_2].method878();
                    aClass41Array8793[i_2] = null;
                }
            }

            for (i_2 = 0; i_2 < aClass55Array8802.length; i_2++) {
                if (aClass55Array8802[i_2] != null) {
                    aClass55Array8802[i_2].method1105();
                    aClass55Array8802[i_2] = null;
                }
            }

            method13886();
            method8398(0);
            aBool8681 = true;
        }

    }

    abstract void method13924();

    abstract Interface4 method13925(boolean var1);

    @Override
    public void method8650(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * f_1 + aClass384_8728.buf[7] * f_2 + aClass384_8728.buf[11] * f_3;
        float f_6 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * f_1 + aClass384_8728.buf[4] * f_2 + aClass384_8728.buf[8] * f_3;
        float f_7 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * f_1 + aClass384_8728.buf[5] * f_2 + aClass384_8728.buf[9] * f_3;
        float f_8 = aClass384_8740.buf[14] + aClass384_8740.buf[2] * f_1 + aClass384_8740.buf[6] * f_2 + aClass384_8740.buf[10] * f_3;
        floats_4[0] = aFloat8797 + aFloat8732 * f_6 / f_5;
        floats_4[1] = aFloat8741 + aFloat8734 * f_7 / f_5;
        floats_4[2] = f_8;
    }

    void method13926() {
        aClass384_8728.method6562(aClass384_8740);
        aClass384_8728.method6523(aClass384_8724);
        aClass384_8728.method6539(aFloatArrayArray8730[0]);
        aClass384_8728.method6540(aFloatArrayArray8730[1]);
        aClass384_8728.method6535(aFloatArrayArray8730[2]);
        aClass384_8728.method6536(aFloatArrayArray8730[3]);
        aClass384_8728.method6613(aFloatArrayArray8730[4]);
        aClass384_8728.method6538(aFloatArrayArray8730[5]);
        aClass384_8729.method6562(aClass384_8728);
        method13933(aClass384_8729);
    }

    @Override
    public Matrix44 method8453() {
        return aClass384_8724;
    }

    void method13927() {
        aBool8829 = false;
    }

    Matrix44 method13930() {
        if (aClass33_8719 == Class33.aClass33_381) {
            if (!aBool8829) {
                method14130();
            }

            return aClass384_8685;
        } else {
            return aClass384_8705;
        }
    }

    Matrix44 method13931() {
        return aClass384_8729;
    }

    void method13932() {
        if (!aBool8720) {
            int i_1;
            int i_2;
            if (aClass158_5853 != null) {
                i_2 = aClass158_5853.method2714();
                i_1 = aClass158_5853.method2716();
            } else {
                i_1 = 0;
                i_2 = 0;
            }

            Matrix44 matrix44_3 = aClass384_8774;
            if (i_2 != 0 && i_1 != 0) {
                matrix44_3.method6530(0.0F, i_2, 0.0F, i_1, -1.0f, 1.0F);
            } else {
                matrix44_3.identity();
            }

            aClass384_8812.method6562(matrix44_3);
            method13933(aClass384_8812);
            aBool8720 = true;
        }

    }

    public abstract void method13933(Matrix44 var1);

    void method13934() {
        if (aClass33_8719 != Class33.aClass33_380) {
            Class33 class33_1 = aClass33_8719;
            aClass33_8719 = Class33.aClass33_380;
            if (class33_1 == Class33.aClass33_381) {
                method13927();
            }

            aClass384_8708 = aClass384_8725;
            method14030();
            method13918();
            anInt8703 &= -16;
        }

    }

    void method13935() {
        if (aClass33_8719 != Class33.aClass33_379) {
            Class33 class33_1 = aClass33_8719;
            aClass33_8719 = Class33.aClass33_379;
            if (class33_1 == Class33.aClass33_381) {
                method13927();
            }

            method13932();
            aClass384_8708 = aClass384_8774;
            method14030();
            method13918();
            anInt8703 &= -9;
        }

    }

    void method13936() {
        aBool8720 = false;
        if (aClass33_8719 == Class33.aClass33_379) {
            method13932();
            method14030();
        }

    }

    void method13937() {
        if (aClass33_8719 != Class33.aClass33_381) {
            aClass33_8719 = Class33.aClass33_381;
            method13927();
            method13940();
            aClass384_8708 = aClass384_8724;
            method14030();
            method13918();
            anInt8703 &= -8;
        }

    }

    void method13938() {
        aBool8723 = false;
        method13940();
        if (aClass33_8719 == Class33.aClass33_381) {
            method14030();
        }

    }

    void method13940() {
        if (!aBool8723) {
            aBool8723 = true;
        }

    }

    @Override
    public boolean method8644() {
        return true;
    }

    @Override
    public void RA(boolean bool_1) {
        aBool8755 = bool_1;
        method14054();
    }

    void method13941(boolean bool_1) {
        if (aBool8757 != bool_1) {
            aBool8757 = bool_1;
            method13956();
            anInt8703 &= -16;
        }

    }

    void method13942(boolean bool_1) {
        if (aBool8756 != bool_1) {
            aBool8756 = bool_1;
            method14054();
            anInt8703 &= -16;
        }

    }

    void method13944() {
        anInterface4_8746 = method13994(false);
        short s_1 = 160;
        anInterface4_8746.method31(s_1, 32);
        aByteBuffer8838.clear();
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putInt(-1);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putInt(-1);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putInt(-1);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putInt(-1);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(1.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putInt(-1);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        anInterface4_8746.method42(0, aByteBuffer8838.position(), aLong8695);
        aClass70_8786 = method13995(new Class72[]{new Class72(new Class69[]{Class69.aClass69_695, Class69.aClass69_690, Class69.aClass69_692, Class69.aClass69_692})});
    }

    @Override
    public void method8479(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * f_1 + aClass384_8728.buf[7] * f_2 + aClass384_8728.buf[11] * f_3;
        float f_6 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * f_1 + aClass384_8728.buf[4] * f_2 + aClass384_8728.buf[8] * f_3;
        float f_7 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * f_1 + aClass384_8728.buf[5] * f_2 + aClass384_8728.buf[9] * f_3;
        float f_8 = aClass384_8740.buf[14] + aClass384_8740.buf[2] * f_1 + aClass384_8740.buf[6] * f_2 + aClass384_8740.buf[10] * f_3;
        floats_4[0] = aFloat8797 + aFloat8732 * f_6 / f_5;
        floats_4[1] = aFloat8741 + aFloat8734 * f_7 / f_5;
        floats_4[2] = f_8;
    }

    @Override
    public void method8515(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * f_1 + aClass384_8728.buf[6] * f_2 + aClass384_8728.buf[10] * f_3;
        float f_6 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * f_1 + aClass384_8728.buf[7] * f_2 + aClass384_8728.buf[11] * f_3;
        if (f_5 >= -f_6 && f_5 <= f_6) {
            float f_7 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * f_1 + aClass384_8728.buf[4] * f_2 + aClass384_8728.buf[8] * f_3;
            if (f_7 >= -f_6 && f_7 <= f_6) {
                float f_8 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * f_1 + aClass384_8728.buf[5] * f_2 + aClass384_8728.buf[9] * f_3;
                if (f_8 >= -f_6 && f_8 <= f_6) {
                    float f_9 = aClass384_8740.buf[14] + aClass384_8740.buf[2] * f_1 + aClass384_8740.buf[6] * f_2 + aClass384_8740.buf[10] * f_3;
                    floats_4[0] = aFloat8797 + aFloat8732 * f_7 / f_6;
                    floats_4[1] = aFloat8741 + aFloat8734 * f_8 / f_6;
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

    abstract void method13945();

    @Override
    public void method8516(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
    }

    void method13946(boolean bool_1) {
        if (aBool8684 != bool_1) {
            aBool8684 = bool_1;
            method14204();
            anInt8703 &= -8;
        }

    }

    @Override
    public void method8547(int nodeCount, Node_Sub24[] node) {
    	for(int index = 0; index < nodeCount; index++)
    		aNode_Sub24Array8716[index] = node[index];

        anInt8773 = nodeCount;
        if (aClass33_8719 == Class33.aClass33_381) {
            method13903();
        }

    }

    @Override
    public void IA(float f_1) {
        if (aFloat8769 != f_1) {
            aFloat8769 = f_1;
            method13948();
            method13951();
        }

    }

    @Override
    public void m(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
        boolean bool_7 = anInt8765 != i_1;
        if (bool_7 || aFloat8770 != f_2 || aFloat8826 != f_3) {
            anInt8765 = i_1;
            aFloat8770 = f_2;
            aFloat8826 = f_3;
            if (bool_7) {
                aFloat8766 = (anInt8765 & 0xff0000) / 1.671168E7F;
                aFloat8767 = (anInt8765 & 0xff00) / 65280.0F;
                aFloat8768 = (anInt8765 & 0xff) / 255.0F;
                method13948();
            }

            method13949();
        }

        if (aFloatArray8763[0] != f_4 || aFloatArray8763[1] != f_5 || aFloatArray8763[2] != f_6) {
            aFloatArray8763[0] = f_4;
            aFloatArray8763[1] = f_5;
            aFloatArray8763[2] = f_6;
            aFloatArray8764[0] = -f_4;
            aFloatArray8764[1] = -f_5;
            aFloatArray8764[2] = -f_6;
            float f_8 = (float) (1.0D / Math.sqrt(f_4 * f_4 + f_5 * f_5 + f_6 * f_6));
            aFloatArray8747[0] = f_4 * f_8;
            aFloatArray8747[1] = f_5 * f_8;
            aFloatArray8747[2] = f_6 * f_8;
            aFloatArray8762[0] = -aFloatArray8747[0];
            aFloatArray8762[1] = -aFloatArray8747[1];
            aFloatArray8762[2] = -aFloatArray8747[2];
            method13950();
            anInt8777 = (int) (f_4 * 256.0F / f_5);
            anInt8778 = (int) (f_6 * 256.0F / f_5);
        }

        method13951();
    }

    @Override
    public int method8452(int i_1, int i_2) {
        return i_1 & i_2 ^ i_2;
    }

    public void method13947(int i_1) {
        switch (i_1) {
            case 0:
                method13966(Class68.aClass68_683, Class68.aClass68_683);
                break;
            case 1:
                method13966(Class68.aClass68_687, Class68.aClass68_687);
                break;
            case 2:
                method13966(Class68.aClass68_682, Class68.aClass68_687);
                break;
            case 3:
                method13966(Class68.aClass68_684, Class68.aClass68_683);
                break;
            case 4:
                method13966(Class68.aClass68_685, Class68.aClass68_685);
        }

    }

    abstract void method13948();

    abstract void method13949();

    abstract void method13950();

    abstract void method13951();

    @Override
    public int method8463() {
        return anInt8799 - 2;
    }

    abstract void method13952();

    abstract void method13953();

    abstract boolean method13954(Class150 var1, Class76 var2);

    abstract boolean method13955(Class150 var1, Class76 var2);

    abstract void method13956();

    Interface6 method13957(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5) {
        return method14143(class150_1, i_2, i_3, bool_4, bytes_5);
    }

    Interface6 method13958(Class150 class150_1, int i_2, int i_3, float[] floats_5) {
        return method13961(class150_1, i_2, i_3, floats_5);
    }

    public abstract void method13959(Class352 var1, int var2, int var3);

    void method13960() {
        if (aClass37Array8783[anInt8780] != Class37.aClass37_393) {
            aClass37Array8783[anInt8780] = Class37.aClass37_393;
            aClass384Array8782[anInt8780].identity();
            method14133();
        }

    }

    abstract Interface6 method13961(Class150 var1, int var2, int var3, float[] var5);

    @Override
    public Matrix44Var method8458() {
        return aClass294_8706;
    }

    @Override
    public void il(int i_1) {
        for (anInt8806 = 0; i_1 > 1; i_1 >>= 1) {
            anInt8806 += 1;
        }

        anInt8775 = 1 << anInt8806;
    }

    abstract Interface1 method13962(Class150 var1, byte[] var6);

    @Override // dead code
    public void method8426(int i_1, Node_Sub24[] arr_2) {
        if (i_1 >= 0) System.arraycopy(arr_2, 0, aNode_Sub24Array8716, 0, i_1);

        anInt8773 = i_1;
        if (aClass33_8719 == Class33.aClass33_381) {
            method13903();
        }

    }

    @Override
    public void method8568() {
    }

    public int method13963() {
        return anInt8780;
    }

    @Override
    public void XA(int i_1, int i_2, int i_3, int i_4, int i_5) {
        method8433(i_1, i_2, i_3 + i_1, i_2, i_4, i_5);
    }

    @Override
    void fr(int i_1, int i_2, int i_3, int i_4, int i_5) {
    }

    public abstract void method13964();

    public Interface31 method13965() {
        return aClass152_Sub2_8731 != null ? aClass152_Sub2_8731.method14241() : null;
    }

    public void method13966(Class68 class68_1, Class68 class68_2) {
        boolean bool_3 = false;
        if (class68_1 != aClass68Array8784[anInt8780]) {
            aClass68Array8784[anInt8780] = class68_1;
            method13979();
            bool_3 = true;
        }

        if (class68_2 != aClass68Array8785[anInt8780]) {
            aClass68Array8785[anInt8780] = class68_2;
            method13980();
            bool_3 = true;
        }

        if (bool_3) {
            anInt8703 &= -14;
        }

    }

    public void method13967(int i_1, Class67 class67_2) {
        method13968(i_1, class67_2);
    }

    abstract void method13968(int var1, Class67 var2);

    public void method13969(int i_1, Class67 class67_2) {
        method13970(i_1, class67_2);
    }

    abstract void method13970(int var1, Class67 var2);

    public void method13971(int i_1) {
        if (anInt8758 != i_1) {
            anInt8758 = i_1;
            method13987();
        }

    }

    public Matrix44 method13973() {
        return aClass384Array8782[anInt8780];
    }

    public void method13974(Class37 class37_1) {
        aClass37Array8783[anInt8780] = class37_1;
        method14133();
    }

    abstract boolean method13975(Class150 var1, Class76 var2);

    @Override
    public void method8585(int i_1, HDWaterTile class90_2) {
        anInt8739 = i_1;
        aClass90_8807 = class90_2;
        aBool8779 = true;
    }

    void method13976() {
        method13948();
        method13949();
        method14204();
        method13903();
        method13950();
        method13951();
        method13952();
        method13956();
        method14054();
        method13991();
        method14013();
        method13914();
        method13894();
        method14238();

        for (int i_1 = anInt8825 - 1; i_1 >= 0; --i_1) {
            method14163(i_1);
            method13979();
            method13980();
            method13960();
        }

        method13987();
        method13920();
    }

    abstract void method13978();

    abstract void method13979();

    abstract void method13980();

    @Override
    public void method8475(HDWaterTile class90_2) {
        anInt8739 = -1;
        aClass90_8807 = class90_2;
        aBool8779 = true;
    }

    abstract void method13982();

    public abstract void method13983(Class352 var1, int var2, int var3, int var4, int var5);

    void method13985() {
        if (anInt8844 != 0) {
            anInt8844 = 0;
            method13894();
        }

    }

    abstract void method13986(int var1);

    @Override
    public void L() {
        if (aClass158_5853 != null) {
            anInt8822 = 0;
            anInt8743 = 0;
            anInt8744 = aClass158_5853.method2714();
            anInt8742 = aClass158_5853.method2716();
        } else {
            anInt8742 = 0;
            anInt8744 = 0;
            anInt8822 = 0;
            anInt8743 = 0;
        }

        if (aBool8843) {
            aBool8843 = false;
            method13922();
        }

    }

    abstract void method13987();

    void method13989(boolean bool_1) {
        if (aBool8808 != bool_1) {
            aBool8808 = bool_1;
            method13991();
            anInt8703 &= -16;
        }

    }

    @Override
    public void c(int i_1, int i_2, int i_3) {
        if (anInt8810 != i_1 || i_2 != anInt8811 || i_3 != anInt8680) {
            anInt8810 = i_1;
            anInt8811 = i_2;
            anInt8680 = i_3;
            method14062();
            method13991();
        }

    }

    @Override
    public void method8457(Matrix44Var matrix44var_1) {
        aClass294_8706 = matrix44var_1;
        aClass384_8740.fromVarMatrix44(aClass294_8706);
        aClass294_8804.method5209(matrix44var_1);
        aClass294_8804.method5207();
        aClass384_8814.fromVarMatrix44(aClass294_8804);
        method13926();
        if (aClass33_8719 == Class33.aClass33_381) {
            method13927();
        }

    }

    abstract void method13991();

    abstract void method13992(boolean var1);

    abstract Interface32 method13993(boolean var1);

    abstract Interface4 method13994(boolean var1);

    abstract Class70 method13995(Class72[] var1);

    public abstract void method13996(Class70 var1);

    @Override
    public void DA(Class455 class455_2, int i_3, int i_4) {
        RA(false);
        aNativeSprite_Sub3_8791.method2766(0.0F, 0.0F, method8523().method2714(), 0.0F, 0.0F, method8523().method2716(), 0, class455_2, i_3, i_4);
        RA(true);
    }

    abstract void method13997(Interface32 var1);

    Matrix44 method13998() {
        return aClass33_8719 == Class33.aClass33_381 ? aClass384_8814 : aClass384_8712;
    }

    @Override
    public void method8595(boolean bool_1) {
    }

    @Override
    public void method8430(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        method8433(i_1, i_2, i_3 + i_1, i_2, i_5, i_6);
        method8433(i_1, i_2 + i_4, i_3 + i_1, i_2 + i_4, i_5, i_6);
        method8433(i_1, i_2, i_1, i_2 + i_4, i_5, i_6);
        method8433(i_3 + i_1, i_2, i_3 + i_1, i_2 + i_4, i_5, i_6);
    }

    @Override
    public void N(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
    }

    @Override
    public void method8658() {
    }

    @Override
    void CA(int i_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public void fo(int i_1, int i_2, int i_3, int i_4, int i_5) {
        method8433(i_1, i_2, i_1, i_2 + i_3, i_4, i_5);
    }

    @Override
    public void ez() {
        if (aClass158_5853 != null) {
            anInt8822 = 0;
            anInt8743 = 0;
            anInt8744 = aClass158_5853.method2714();
            anInt8742 = aClass158_5853.method2716();
        } else {
            anInt8742 = 0;
            anInt8744 = 0;
            anInt8822 = 0;
            anInt8743 = 0;
        }

        if (aBool8843) {
            aBool8843 = false;
            method13922();
        }

    }

    @Override
    public void method8433(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        method8496(i_1, i_2, i_3, i_4, i_5, 1, i_6);
    }

    @Override
    public void method8435(int i_1, int i_2, int i_3, int i_4, int i_5, int i_7, int i_8, int i_9) {
        float f_10 = (float) i_3 - i_1;
        float f_11 = (float) i_4 - i_2;
        if (f_10 == 0.0F && f_11 == 0.0F) {
            f_10 = 1.0F;
        } else {
            float f_23 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
            f_10 *= f_23;
            f_11 *= f_23;
        }

        method13935();
        Class41 class41_12 = aClass41Array8793[13];
        class41_12.method873();
        class41_12.method875();
        method13904(1);
        class41_12.method879();
        method13992(false);
        i_9 %= i_8 + i_7;
        float f_13 = f_10 * i_7;
        float f_14 = f_11 * i_7;
        float f_15 = 0.0F;
        float f_16 = 0.0F;
        float f_17 = f_13;
        float f_18 = f_14;
        if (i_9 > i_7) {
            f_15 = f_10 * (i_8 + i_7 - i_9);
            f_16 = f_11 * (i_8 + i_7 - i_9);
        } else {
            f_17 = f_10 * (i_7 - i_9);
            f_18 = f_11 * (i_7 - i_9);
        }

        float f_19 = i_1 + f_15;
        float f_20 = i_2 + f_16;
        float f_21 = f_10 * i_8;
        float f_22 = f_11 * i_8;

        while (true) {
            if (i_3 > i_1) {
                if (f_19 > i_3) {
                    break;
                }

                if (f_19 + f_17 > i_3) {
                    f_17 = i_3 - f_19;
                }
            } else {
                if (f_19 < i_3) {
                    break;
                }

                if (f_19 + f_17 < i_3) {
                    f_17 = i_3 - f_19;
                }
            }

            if (i_4 > i_2) {
                if (f_20 > i_4) {
                    break;
                }

                if (f_20 + f_18 > i_4) {
                    f_18 = i_4 - f_20;
                }
            } else {
                if (f_20 < i_4) {
                    break;
                }

                if (f_20 + f_18 < i_4) {
                    f_18 = i_4 - f_20;
                }
            }

            if (!method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
                return;
            }

            method14000();
            f_19 += f_21 + f_17;
            f_20 += f_22 + f_18;
            f_17 = f_13;
            f_18 = f_14;
        }

        method13992(true);
        class41_12.method885();
    }

    @Override
    public void method8563(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
    }

    abstract void method13999();

    @Override
    public void method8496(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        i_1 = (int) (i_1 + 1.0F);
        i_2 = (int) (i_2 + 1.0F);
        i_3 = (int) (i_3 + 1.0F);
        i_4 = (int) (i_4 + 1.0F);
        float f_8 = (i_3 - i_1);
        float f_9 = (i_4 - i_2);
        float f_10 = 1.0F / (float) Math.sqrt(f_8 * f_8 + f_9 * f_9);
        f_8 *= f_10;
        f_9 *= f_10;
        i_1 = (int) (i_1 - f_8);
        i_2 = (int) (i_2 - f_9);
        float f_11 = -f_9;
        f_11 *= 0.5F * i_6;
        float f_12 = f_8 * 0.5F * i_6;
        aNativeSprite_Sub3_8790.method2763(i_1 - f_11, i_2 - f_12, i_3 - f_11, i_4 - f_12, i_1 + f_11, i_2 + f_12, 0, i_5, i_7);
    }

    @Override
    public void method8456(Class151 class151_1) {
        aClass54_8837.method1091(this, class151_1);
    }

    void method14000() {
        method14161(0, anInterface4_8682);
        method13996(aClass70_8833);
        method13923(Class352.aClass352_4099, 0, 1);
    }

    @Override
    public void hi(int i_1, Class455 class455_2, int i_3, int i_4) {
        RA(false);
        aNativeSprite_Sub3_8791.method2766(0.0F, 0.0F, method8523().method2714(), 0.0F, 0.0F, method8523().method2716(), 0, class455_2, i_3, i_4);
        RA(true);
    }

    void method14001(Class352 class352_1) {
        method14161(0, anInterface4_8746);
        method13996(aClass70_8786);
        method13923(class352_1, 0, 2);
    }

    @Override
    public void method8619(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * f_1 + aClass384_8728.buf[6] * f_2 + aClass384_8728.buf[10] * f_3;
        float f_6 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * f_1 + aClass384_8728.buf[7] * f_2 + aClass384_8728.buf[11] * f_3;
        if (f_5 >= -f_6 && f_5 <= f_6) {
            float f_7 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * f_1 + aClass384_8728.buf[4] * f_2 + aClass384_8728.buf[8] * f_3;
            if (f_7 >= -f_6 && f_7 <= f_6) {
                float f_8 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * f_1 + aClass384_8728.buf[5] * f_2 + aClass384_8728.buf[9] * f_3;
                if (f_8 >= -f_6 && f_8 <= f_6) {
                    float f_9 = aClass384_8740.buf[14] + aClass384_8740.buf[2] * f_1 + aClass384_8740.buf[6] * f_2 + aClass384_8740.buf[10] * f_3;
                    floats_4[0] = aFloat8797 + aFloat8732 * f_7 / f_6;
                    floats_4[1] = aFloat8741 + aFloat8734 * f_8 / f_6;
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

    public abstract void method14002(Class352 var1, int var2, int var3, int var4, int var5);

    public void method14003() {
        if (anInt8703 != 2) {
            method13935();
            method13989(false);
            method13946(false);
            method13941(false);
            method13942(false);
            anInt8703 = 2;
        }

    }

    void method14004() {
        if (anInt8703 != 8) {
            method13937();
            method13989(true);
            method13941(true);
            method13942(true);
            method13904(1);
            anInt8703 = 8;
        }

    }

    @Override
    void method8531() {
        if (!aBool8681) {
            method13900();
            aClass66_8787.method1279();

            for (Node node_1 = aClass473_8700.getBack(); node_1 != null; node_1 = aClass473_8700.getPrevious()) {
                ((Node_Sub1_Sub2) node_1).method15609();
            }

            Class13.method508(false, true);

            int i_2;
            for (i_2 = 0; i_2 < aClass41Array8793.length; i_2++) {
                if (aClass41Array8793[i_2] != null) {
                    aClass41Array8793[i_2].method878();
                    aClass41Array8793[i_2] = null;
                }
            }

            for (i_2 = 0; i_2 < aClass55Array8802.length; i_2++) {
                if (aClass55Array8802[i_2] != null) {
                    aClass55Array8802[i_2].method1105();
                    aClass55Array8802[i_2] = null;
                }
            }

            method13886();
            method8398(0);
            aBool8681 = true;
        }

    }

    @Override
    void method8486() {
        if (!aBool8681) {
            method13900();
            aClass66_8787.method1279();

            for (Node node_1 = aClass473_8700.getBack(); node_1 != null; node_1 = aClass473_8700.getPrevious()) {
                ((Node_Sub1_Sub2) node_1).method15609();
            }

            Class13.method508(false, true);

            int i_2;
            for (i_2 = 0; i_2 < aClass41Array8793.length; i_2++) {
                if (aClass41Array8793[i_2] != null) {
                    aClass41Array8793[i_2].method878();
                    aClass41Array8793[i_2] = null;
                }
            }

            for (i_2 = 0; i_2 < aClass55Array8802.length; i_2++) {
                if (aClass55Array8802[i_2] != null) {
                    aClass55Array8802[i_2].method1105();
                    aClass55Array8802[i_2] = null;
                }
            }

            method13886();
            method8398(0);
            aBool8681 = true;
        }

    }

    @Override
    public void method8487(int i_1) {
        if (aClass66_8787 != null) {
            aClass66_8787.method1278();
        }

        anInt8820 = i_1 & 0x7fffffff;
    }

    @Override
    public Class455 method8553(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
    }

    @Override
    public int dd() {
        return anInt8702 + anInt8701 + anInt8761;
    }

    @Override
    public void method8424(Matrix44 matrix44_1) {
        aClass384_8724.method6562(matrix44_1);
        method13926();
        if (aClass33_8719 == Class33.aClass33_381) {
            method14030();
        }

    }

    @Override
    public Matrix44 method8571() {
        return aClass384_8841;
    }

    @Override
    public int dv() {
        return anInt8702 + anInt8701 + anInt8761;
    }

    @Override
    public boolean method8489() {
        return true;
    }

    @Override
    public boolean method8528() {
        return true;
    }

    @Override
    public void method8581(Class151 class151_1) {
        aClass54_8837.method1091(this, class151_1);
    }

    @Override
    public boolean method8599() {
        return aClass55Array8802[1] != null;
    }

    @Override
    public boolean method8464() {
        return aClass55Array8802[1] != null;
    }

    @Override
    public boolean method8649() {
        return aClass55Array8802[1] != null;
    }

    abstract Interface6 method14008(int var1, int var2, boolean var3, int[] var4, int var5, int var6);

    @Override
    public boolean method8431() {
        return true;
    }

    void method14009() {
        anInterface4_8682 = method13994(true);
        anInterface4_8682.method31(24, 12);
        aClass70_8833 = method13995(new Class72[]{new Class72(Class69.aClass69_695)});
    }

    @Override
    public boolean method8498() {
        return true;
    }

    abstract Interface31 method14011(int var1, boolean var2, int[][] var3);

    abstract void method14013();

    @Override
    public boolean method8503() {
        return true;
    }

    @Override
    public void fh(int[] ints_1) {
        ints_1[0] = anInt8743;
        ints_1[1] = anInt8822;
        ints_1[2] = anInt8744;
        ints_1[3] = anInt8742;
    }

    @Override
    public void eq(boolean bool_1) {
        aBool8755 = bool_1;
        method14054();
    }

    @Override
    public void method8513(int i_1, int i_2, int i_3, int i_4) {
        anInt8745 = i_1;
        anInt8835 = i_2;
        anInt8722 = i_3;
        anInt8748 = i_4;
        method13918();
    }

    abstract void method14015();

    @Override
    public void ft(int[] ints_1) {
        ints_1[0] = anInt8743;
        ints_1[1] = anInt8822;
        ints_1[2] = anInt8744;
        ints_1[3] = anInt8742;
    }

    @Override
    public void ej(float f_1, float f_2) {
        aFloat8737 = f_1;
        aFloat8738 = f_2;
        method13918();
    }

    @Override
    public void eh() {
        if (aClass158_5853 != null) {
            anInt8822 = 0;
            anInt8743 = 0;
            anInt8744 = aClass158_5853.method2714();
            anInt8742 = aClass158_5853.method2716();
        } else {
            anInt8742 = 0;
            anInt8744 = 0;
            anInt8822 = 0;
            anInt8743 = 0;
        }

        if (aBool8843) {
            aBool8843 = false;
            method13922();
        }

    }

    abstract Class70 method14017(Class72[] var1);

    @Override
    public boolean method8404() {
        return true;
    }

    @Override
    public void fe(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        if (aClass158_5853 != null) {
            i_6 = aClass158_5853.method2714();
            i_5 = aClass158_5853.method2716();
        } else {
            i_5 = 0;
            i_6 = 0;
        }

        i_1 = Math.max(0, i_1);
        i_3 = Math.min(i_3, i_6);
        i_2 = Math.max(0, i_2);
        i_4 = Math.min(i_4, i_5);
        boolean bool_7 = false;
        if (anInt8743 < i_1) {
            anInt8743 = i_1;
            bool_7 = true;
        }

        if (anInt8744 > i_3) {
            anInt8744 = i_3;
            bool_7 = true;
        }

        if (anInt8822 < i_2) {
            anInt8822 = i_2;
            bool_7 = true;
        }

        if (anInt8742 > i_4) {
            anInt8742 = i_4;
            bool_7 = true;
        }

        if (bool_7) {
            if (!aBool8843) {
                aBool8843 = true;
                method13922();
            }

            method13921();
        }

    }

    @Override
    public void fk(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        if (aClass158_5853 != null) {
            i_6 = aClass158_5853.method2714();
            i_5 = aClass158_5853.method2716();
        } else {
            i_5 = 0;
            i_6 = 0;
        }

        i_1 = Math.max(0, i_1);
        i_3 = Math.min(i_3, i_6);
        i_2 = Math.max(0, i_2);
        i_4 = Math.min(i_4, i_5);
        boolean bool_7 = false;
        if (anInt8743 < i_1) {
            anInt8743 = i_1;
            bool_7 = true;
        }

        if (anInt8744 > i_3) {
            anInt8744 = i_3;
            bool_7 = true;
        }

        if (anInt8822 < i_2) {
            anInt8822 = i_2;
            bool_7 = true;
        }

        if (anInt8742 > i_4) {
            anInt8742 = i_4;
            bool_7 = true;
        }

        if (bool_7) {
            if (!aBool8843) {
                aBool8843 = true;
                method13922();
            }

            method13921();
        }

    }

    abstract void method14019();

    @Override
    public Class152 method8466(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        return new Class152_Sub2_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6);
    }

    @Override
    public void method8511(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        method8433(i_1, i_2, i_1 + i_3, i_2, i_5, i_6);
        method8433(i_1, i_2 + i_4, i_1 + i_3, i_2 + i_4, i_5, i_6);
        method8433(i_1, i_2, i_1, i_2 + i_4, i_5, i_6);
        method8433(i_1 + i_3, i_2, i_1 + i_3, i_2 + i_4, i_5, i_6);
    }

    @Override
    public void method8520(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        method8433(i_1, i_2, i_1 + i_3, i_2, i_5, i_6);
        method8433(i_1, i_2 + i_4, i_1 + i_3, i_2 + i_4, i_5, i_6);
        method8433(i_1, i_2, i_1, i_2 + i_4, i_5, i_6);
        method8433(i_1 + i_3, i_2, i_1 + i_3, i_2 + i_4, i_5, i_6);
    }

    @Override
    public void fp(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (aBool8755) {
            RA(false);
            aNativeSprite_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
            RA(true);
        } else {
            aNativeSprite_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
        }

    }

    @Override
    public void fb(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (aBool8755) {
            RA(false);
            aNativeSprite_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
            RA(true);
        } else {
            aNativeSprite_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
        }

    }

    @Override
    public void fv(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
    }

    @Override
    public void ff(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
    }

    @Override
    public void method8611() {
        aClass32_8714.method833();
    }

    @Override
    void fw(int i_1, int i_2, int i_3, int i_4, int i_5) {
    }

    abstract void method14020();

    abstract Interface29 method14022(Class150 var1, Class76 var2, int var3, int var4);

    @Override
    public void fl(int i_1, int i_2, int i_3, int i_4, int i_5) {
        method8433(i_1, i_2, i_1, i_2 + i_3, i_4, i_5);
    }

    @Override
    public void method8415(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        method8496(i_1, i_2, i_3, i_4, i_5, 1, i_6);
    }

    @Override
    public void method8526(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        method8496(i_1, i_2, i_3, i_4, i_5, 1, i_6);
    }

    @Override
    public void method8527(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        float f_10 = (float) i_3 - i_1;
        float f_11 = (float) i_4 - i_2;
        if (f_10 == 0.0F && f_11 == 0.0F) {
            f_10 = 1.0F;
        } else {
            float f_23 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
            f_10 *= f_23;
            f_11 *= f_23;
        }

        method13935();
        Class41 class41_12 = aClass41Array8793[13];
        class41_12.method873();
        class41_12.method875();
        method13904(i_6);
        class41_12.method879();
        method13992(false);
        i_9 %= i_8 + i_7;
        float f_13 = f_10 * i_7;
        float f_14 = f_11 * i_7;
        float f_15 = 0.0F;
        float f_16 = 0.0F;
        float f_17 = f_13;
        float f_18 = f_14;
        if (i_9 > i_7) {
            f_15 = f_10 * (i_7 + i_8 - i_9);
            f_16 = f_11 * (i_7 + i_8 - i_9);
        } else {
            f_17 = f_10 * (i_7 - i_9);
            f_18 = f_11 * (i_7 - i_9);
        }

        float f_19 = i_1 + f_15;
        float f_20 = i_2 + f_16;
        float f_21 = f_10 * i_8;
        float f_22 = f_11 * i_8;

        while (true) {
            if (i_3 > i_1) {
                if (f_19 > i_3) {
                    break;
                }

                if (f_19 + f_17 > i_3) {
                    f_17 = i_3 - f_19;
                }
            } else {
                if (f_19 < i_3) {
                    break;
                }

                if (f_19 + f_17 < i_3) {
                    f_17 = i_3 - f_19;
                }
            }

            if (i_4 > i_2) {
                if (f_20 > i_4) {
                    break;
                }

                if (f_20 + f_18 > i_4) {
                    f_18 = i_4 - f_20;
                }
            } else {
                if (f_20 < i_4) {
                    break;
                }

                if (f_20 + f_18 < i_4) {
                    f_18 = i_4 - f_20;
                }
            }

            if (!method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
                return;
            }

            method14000();
            f_19 += f_21 + f_17;
            f_20 += f_22 + f_18;
            f_17 = f_13;
            f_18 = f_14;
        }

        method13992(true);
        class41_12.method885();
    }

    @Override
    public NativeSprite method8548(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        return new NativeSprite_Sub3(this, i_4, i_5, ints_1, i_2, i_3);
    }

    @Override
    public void method8529(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        float f_10 = (float) i_3 - i_1;
        float f_11 = (float) i_4 - i_2;
        if (f_10 == 0.0F && f_11 == 0.0F) {
            f_10 = 1.0F;
        } else {
            float f_23 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
            f_10 *= f_23;
            f_11 *= f_23;
        }

        method13935();
        Class41 class41_12 = aClass41Array8793[13];
        class41_12.method873();
        class41_12.method875();
        method13904(i_6);
        class41_12.method879();
        method13992(false);
        i_9 %= i_8 + i_7;
        float f_13 = f_10 * i_7;
        float f_14 = f_11 * i_7;
        float f_15 = 0.0F;
        float f_16 = 0.0F;
        float f_17 = f_13;
        float f_18 = f_14;
        if (i_9 > i_7) {
            f_15 = f_10 * (i_7 + i_8 - i_9);
            f_16 = f_11 * (i_7 + i_8 - i_9);
        } else {
            f_17 = f_10 * (i_7 - i_9);
            f_18 = f_11 * (i_7 - i_9);
        }

        float f_19 = i_1 + f_15;
        float f_20 = i_2 + f_16;
        float f_21 = f_10 * i_8;
        float f_22 = f_11 * i_8;

        while (true) {
            if (i_3 > i_1) {
                if (f_19 > i_3) {
                    break;
                }

                if (f_19 + f_17 > i_3) {
                    f_17 = i_3 - f_19;
                }
            } else {
                if (f_19 < i_3) {
                    break;
                }

                if (f_19 + f_17 < i_3) {
                    f_17 = i_3 - f_19;
                }
            }

            if (i_4 > i_2) {
                if (f_20 > i_4) {
                    break;
                }

                if (f_20 + f_18 > i_4) {
                    f_18 = i_4 - f_20;
                }
            } else {
                if (f_20 < i_4) {
                    break;
                }

                if (f_20 + f_18 < i_4) {
                    f_18 = i_4 - f_20;
                }
            }

            if (!method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
                return;
            }

            method14000();
            f_19 += f_21 + f_17;
            f_20 += f_22 + f_18;
            f_17 = f_13;
            f_18 = f_14;
        }

        method13992(true);
        class41_12.method885();
    }

    @Override
    public void method8530(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        float f_10 = (float) i_3 - i_1;
        float f_11 = (float) i_4 - i_2;
        if (f_10 == 0.0F && f_11 == 0.0F) {
            f_10 = 1.0F;
        } else {
            float f_23 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
            f_10 *= f_23;
            f_11 *= f_23;
        }

        method13935();
        Class41 class41_12 = aClass41Array8793[13];
        class41_12.method873();
        class41_12.method875();
        method13904(i_6);
        class41_12.method879();
        method13992(false);
        i_9 %= i_8 + i_7;
        float f_13 = f_10 * i_7;
        float f_14 = f_11 * i_7;
        float f_15 = 0.0F;
        float f_16 = 0.0F;
        float f_17 = f_13;
        float f_18 = f_14;
        if (i_9 > i_7) {
            f_15 = f_10 * (i_7 + i_8 - i_9);
            f_16 = f_11 * (i_7 + i_8 - i_9);
        } else {
            f_17 = f_10 * (i_7 - i_9);
            f_18 = f_11 * (i_7 - i_9);
        }

        float f_19 = i_1 + f_15;
        float f_20 = i_2 + f_16;
        float f_21 = f_10 * i_8;
        float f_22 = f_11 * i_8;

        while (true) {
            if (i_3 > i_1) {
                if (f_19 > i_3) {
                    break;
                }

                if (f_19 + f_17 > i_3) {
                    f_17 = i_3 - f_19;
                }
            } else {
                if (f_19 < i_3) {
                    break;
                }

                if (f_19 + f_17 < i_3) {
                    f_17 = i_3 - f_19;
                }
            }

            if (i_4 > i_2) {
                if (f_20 > i_4) {
                    break;
                }

                if (f_20 + f_18 > i_4) {
                    f_18 = i_4 - f_20;
                }
            } else {
                if (f_20 < i_4) {
                    break;
                }

                if (f_20 + f_18 < i_4) {
                    f_18 = i_4 - f_20;
                }
            }

            if (!method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
                return;
            }

            method14000();
            f_19 += f_21 + f_17;
            f_20 += f_22 + f_18;
            f_17 = f_13;
            f_18 = f_14;
        }

        method13992(true);
        class41_12.method885();
    }

    @Override
    public void method8576(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
    }

    @Override
    public void method8532(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
    }

    @Override
    public void method8533(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
    }

    @Override
    public void method8575(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
    }

    @Override
    public void method8535(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
    }

    Interface6 method14024(int i_1, int i_2, boolean bool_3, int[] ints_4) {
        return method14094(i_1, i_2, bool_3, ints_4, 0, 0);
    }

    @Override
    public int method8538(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_1 + aClass384_8728.buf[6] * i_2 + aClass384_8728.buf[10] * i_3;
        float f_9 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_4 + aClass384_8728.buf[6] * i_5 + aClass384_8728.buf[10] * i_6;
        float f_10 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_1 + aClass384_8728.buf[7] * i_2 + aClass384_8728.buf[11] * i_3;
        float f_11 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_4 + aClass384_8728.buf[7] * i_5 + aClass384_8728.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_1 + aClass384_8728.buf[4] * i_2 + aClass384_8728.buf[8] * i_3;
        float f_13 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_4 + aClass384_8728.buf[4] * i_5 + aClass384_8728.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_1 + aClass384_8728.buf[5] * i_2 + aClass384_8728.buf[9] * i_3;
        float f_15 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_4 + aClass384_8728.buf[5] * i_5 + aClass384_8728.buf[9] * i_6;
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public int method8539(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_1 + aClass384_8728.buf[6] * i_2 + aClass384_8728.buf[10] * i_3;
        float f_9 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_4 + aClass384_8728.buf[6] * i_5 + aClass384_8728.buf[10] * i_6;
        float f_10 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_1 + aClass384_8728.buf[7] * i_2 + aClass384_8728.buf[11] * i_3;
        float f_11 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_4 + aClass384_8728.buf[7] * i_5 + aClass384_8728.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_1 + aClass384_8728.buf[4] * i_2 + aClass384_8728.buf[8] * i_3;
        float f_13 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_4 + aClass384_8728.buf[4] * i_5 + aClass384_8728.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_1 + aClass384_8728.buf[5] * i_2 + aClass384_8728.buf[9] * i_3;
        float f_15 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_4 + aClass384_8728.buf[5] * i_5 + aClass384_8728.buf[9] * i_6;
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public int method8540(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_1 + aClass384_8728.buf[6] * i_2 + aClass384_8728.buf[10] * i_3;
        float f_9 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_4 + aClass384_8728.buf[6] * i_5 + aClass384_8728.buf[10] * i_6;
        float f_10 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_1 + aClass384_8728.buf[7] * i_2 + aClass384_8728.buf[11] * i_3;
        float f_11 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_4 + aClass384_8728.buf[7] * i_5 + aClass384_8728.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_1 + aClass384_8728.buf[4] * i_2 + aClass384_8728.buf[8] * i_3;
        float f_13 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_4 + aClass384_8728.buf[4] * i_5 + aClass384_8728.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_1 + aClass384_8728.buf[5] * i_2 + aClass384_8728.buf[9] * i_3;
        float f_15 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_4 + aClass384_8728.buf[5] * i_5 + aClass384_8728.buf[9] * i_6;
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
        Node_Sub1_Sub2 class282_sub1_sub2_2 = new Node_Sub1_Sub2(i_1);
        aClass473_8700.insertBack(class282_sub1_sub2_2);
        return class282_sub1_sub2_2;
    }

    @Override
    public Node_Sub1 method8541(int i_1) {
        Node_Sub1_Sub2 class282_sub1_sub2_2 = new Node_Sub1_Sub2(i_1);
        aClass473_8700.insertBack(class282_sub1_sub2_2);
        return class282_sub1_sub2_2;
    }

    abstract void method14025();

    @Override
    public void method8618(Node_Sub1 class282_sub1_1) {
        aNativeHeap8699 = ((Node_Sub1_Sub2) class282_sub1_1).aNativeHeap10212;
    }

    @Override
    public void method8544(Node_Sub1 class282_sub1_1) {
        aNativeHeap8699 = ((Node_Sub1_Sub2) class282_sub1_1).aNativeHeap10212;
    }

    @Override
    public boolean method8578() {
        return aBool8828;
    }

    @Override
    public void fc(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        if (aClass158_5853 != null) {
            i_6 = aClass158_5853.method2714();
            i_5 = aClass158_5853.method2716();
        } else {
            i_5 = 0;
            i_6 = 0;
        }

        if (i_1 <= 0 && i_3 >= i_6 - 1 && i_2 <= 0 && i_4 >= i_5 - 1) {
            L();
        } else {
            anInt8743 = Math.max(0, i_1);
            anInt8744 = Math.min(i_3, i_6);
            anInt8822 = Math.max(0, i_2);
            anInt8742 = Math.min(i_4, i_5);
            if (!aBool8843) {
                aBool8843 = true;
                method13922();
            }

            method13921();
        }

    }

    @Override
    public NativeSprite method8543(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        return new NativeSprite_Sub3(this, i_4, i_5, ints_1, i_2, i_3);
    }

    abstract void method14026();

    @Override
    public NativeSprite method8612(SpriteDefinitions class91_1, boolean bool_2) {
        NativeSprite nativesprite_3;
        if (class91_1.width != 0 && class91_1.height != 0) {
            int[] ints_4 = new int[class91_1.width * class91_1.height];
            int i_5 = 0;
            int i_6 = 0;
            int i_7;
            int i_8;
            if (class91_1.alpha != null) {
                for (i_7 = 0; i_7 < class91_1.height; i_7++) {
                    for (i_8 = 0; i_8 < class91_1.width; i_8++) {
                        ints_4[i_6++] = class91_1.alpha[i_5] << 24 | class91_1.pallete[class91_1.pixels[i_5] & 0xff];
                        ++i_5;
                    }
                }
            } else {
                for (i_7 = 0; i_7 < class91_1.height; i_7++) {
                    for (i_8 = 0; i_8 < class91_1.width; i_8++) {
                        int i_9 = class91_1.pallete[class91_1.pixels[i_5++] & 0xff];
                        ints_4[i_6++] = i_9 != 0 ? -16777216 | i_9 : 0;
                    }
                }
            }

            nativesprite_3 = createNativeSprite(ints_4, class91_1.width, class91_1.width, class91_1.height);
        } else {
            nativesprite_3 = createNativeSprite(new int[1], 1, 1, 1);
        }

        nativesprite_3.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
        return nativesprite_3;
    }

    @Override
    public NativeSprite method8518(SpriteDefinitions class91_1, boolean bool_2) {
        NativeSprite nativesprite_3;
        if (class91_1.width != 0 && class91_1.height != 0) {
            int[] ints_4 = new int[class91_1.width * class91_1.height];
            int i_5 = 0;
            int i_6 = 0;
            int i_7;
            int i_8;
            if (class91_1.alpha != null) {
                for (i_7 = 0; i_7 < class91_1.height; i_7++) {
                    for (i_8 = 0; i_8 < class91_1.width; i_8++) {
                        ints_4[i_6++] = class91_1.alpha[i_5] << 24 | class91_1.pallete[class91_1.pixels[i_5] & 0xff];
                        ++i_5;
                    }
                }
            } else {
                for (i_7 = 0; i_7 < class91_1.height; i_7++) {
                    for (i_8 = 0; i_8 < class91_1.width; i_8++) {
                        int i_9 = class91_1.pallete[class91_1.pixels[i_5++] & 0xff];
                        ints_4[i_6++] = i_9 != 0 ? -16777216 | i_9 : 0;
                    }
                }
            }

            nativesprite_3 = createNativeSprite(ints_4, class91_1.width, class91_1.width, class91_1.height);
        } else {
            nativesprite_3 = createNativeSprite(new int[1], 1, 1, 1);
        }

        nativesprite_3.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
        return nativesprite_3;
    }

    @Override
    public NativeSprite method8604(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        NativeSprite_Sub3 class160_sub3_6 = new NativeSprite_Sub3(this, i_3, i_4, bool_5, false);
        class160_sub3_6.method2750(0, 0, i_3, i_4, i_1, i_2);
        return class160_sub3_6;
    }

    @Override
    public NativeSprite method8552(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        NativeSprite_Sub3 class160_sub3_6 = new NativeSprite_Sub3(this, i_3, i_4, bool_5, false);
        class160_sub3_6.method2750(0, 0, i_3, i_4, i_1, i_2);
        return class160_sub3_6;
    }

    @Override
    public void iz(float f_1) {
        if (aFloat8769 != f_1) {
            aFloat8769 = f_1;
            method13948();
            method13951();
        }

    }

    @Override
    public Class455 method8554(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
    }

    @Override
    public Class455 method8427(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
    }

    @Override
    public Class455 method8556(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return Class455_Sub1.method13769(this, i_1, i_2, ints_3, ints_4);
    }

    @Override
    public void hr(int i_1, Class455 class455_2, int i_3, int i_4) {
        RA(false);
        aNativeSprite_Sub3_8791.method2766(0.0F, 0.0F, method8523().method2714(), 0.0F, 0.0F, method8523().method2716(), 0, class455_2, i_3, i_4);
        RA(true);
    }

    @Override
    public void hz(int i_1, Class455 class455_2, int i_3, int i_4) {
        RA(false);
        aNativeSprite_Sub3_8791.method2766(0.0F, 0.0F, method8523().method2714(), 0.0F, 0.0F, method8523().method2716(), 0, class455_2, i_3, i_4);
        RA(true);
    }

    @Override
    public Matrix44 method8588() {
        return aClass384_8724;
    }

    @Override
    public Matrix44Var method8626() {
        return aClass294_8842;
    }

    @Override
    public void method8559(int i_1) {
    }

    @Override
    public MeshRasterizer method8561(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    public boolean method8614() {
        return true;
    }

    @Override
    public void GA() {
        aFloat8737 = (float) 0.0;
        aFloat8738 = (float) 1.0;
        method13918();
    }

    @Override
    public MeshRasterizer method8505(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    public MeshRasterizer method8564(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    public int method8565(int i_1, int i_2) {
        return i_1 & i_2 ^ i_2;
    }

    @Override
    public int method8566(int i_1, int i_2) {
        return i_1 & i_2 ^ i_2;
    }

    @Override
    public int method8567(int i_1, int i_2) {
        return i_1 & i_2 ^ i_2;
    }

    @Override
    public Ground method8569(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_5, int i_6, int i_7) {
        return new HardwareGround(this, i_6, i_7, i_1, i_2, ints_3, ints_4, i_5);
    }

    @Override
    public Matrix44 method8517() {
        return aClass384_8841;
    }

    @Override
    public void method8629(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
    }

    @Override
    public Matrix44Var method8572() {
        return aClass294_8842;
    }

    @Override
    public void J() {
        int meme = 32;
        for (anInt8806 = 0; meme > 1; meme >>= 1) {
            ++anInt8806;
        }

        anInt8775 = 1 << anInt8806;
    }

    @Override
    public int method8574() {
        return anInt8799 - 2;
    }

    @Override // dead code
    public void method8394(int i_1, Node_Sub24[] arr_2) { 
        if (i_1 >= 0) System.arraycopy(arr_2, 0, aNode_Sub24Array8716, 0, i_1);

        anInt8773 = i_1;
        if (aClass33_8719 == Class33.aClass33_381) {
            method13903();
        }

    }

    @Override
    public NativeSprite method8461(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        return new NativeSprite_Sub3(this, i_1, i_2, bool_3, bool_4);
    }

    @Override
    public void method8579(int i_1, Node_Sub24[] arr_2) {
        if (i_1 >= 0) System.arraycopy(arr_2, 0, aNode_Sub24Array8716, 0, i_1);

        anInt8773 = i_1;
        if (aClass33_8719 == Class33.aClass33_381) {
            method13903();
        }

    }

    @Override
    public void method8580(Class151 class151_1) {
        aClass54_8837.method1091(this, class151_1);
    }

    @Override
    public Matrix44Var method8685() {
        return aClass294_8706;
    }

    @Override
    public void method8423(Matrix44Var matrix44var_1) {
        aClass294_8706 = matrix44var_1;
        aClass384_8740.fromVarMatrix44(aClass294_8706);
        aClass294_8804.method5209(matrix44var_1);
        aClass294_8804.method5207();
        aClass384_8814.fromVarMatrix44(aClass294_8804);
        method13926();
        if (aClass33_8719 == Class33.aClass33_381) {
            method13927();
        }

    }

    @Override
    public Matrix44Var method8583() {
        return aClass294_8706;
    }

    @Override
    public boolean method8462() {
        return aBool8828;
    }

    @Override
    public void method8446(Matrix44 matrix44_1) {
        aClass384_8724.method6562(matrix44_1);
        method13926();
        if (aClass33_8719 == Class33.aClass33_381) {
            method14030();
        }

    }

    @Override
    public boolean method8502() {
        return true;
    }

    @Override
    public Matrix44 method8449() {
        return aClass384_8841;
    }

    void method14030() {
        aClass384_8727.method6562(aClass384_8708);
        method13933(aClass384_8727);
        aFloat8697 = (aClass384_8727.buf[14] - aClass384_8727.buf[15]) / (aClass384_8727.buf[11] - aClass384_8727.buf[10]);
        aFloat8726 = -aClass384_8727.buf[14] / aClass384_8727.buf[10];
        method14062();
    }

    @Override
    public Matrix44 method8590() {
        return aClass384_8724;
    }

    @Override
    public boolean method8504() {
        return true;
    }

    @Override
    public void in(float f_1) {
        if (aFloat8769 != f_1) {
            aFloat8769 = f_1;
            method13948();
            method13951();
        }

    }

    @Override
    public Class152 method8400(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        return new Class152_Sub2_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6);
    }

    @Override
    public void im(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
        boolean bool_7 = anInt8765 != i_1;
        if (bool_7 || aFloat8770 != f_2 || aFloat8826 != f_3) {
            anInt8765 = i_1;
            aFloat8770 = f_2;
            aFloat8826 = f_3;
            if (bool_7) {
                aFloat8766 = (anInt8765 & 0xff0000) / 1.671168E7F;
                aFloat8767 = (anInt8765 & 0xff00) / 65280.0F;
                aFloat8768 = (anInt8765 & 0xff) / 255.0F;
                method13948();
            }

            method13949();
        }

        if (aFloatArray8763[0] != f_4 || aFloatArray8763[1] != f_5 || aFloatArray8763[2] != f_6) {
            aFloatArray8763[0] = f_4;
            aFloatArray8763[1] = f_5;
            aFloatArray8763[2] = f_6;
            aFloatArray8764[0] = -f_4;
            aFloatArray8764[1] = -f_5;
            aFloatArray8764[2] = -f_6;
            float f_8 = (float) (1.0D / Math.sqrt(f_4 * f_4 + f_5 * f_5 + f_6 * f_6));
            aFloatArray8747[0] = f_4 * f_8;
            aFloatArray8747[1] = f_5 * f_8;
            aFloatArray8747[2] = f_6 * f_8;
            aFloatArray8762[0] = -aFloatArray8747[0];
            aFloatArray8762[1] = -aFloatArray8747[1];
            aFloatArray8762[2] = -aFloatArray8747[2];
            method13950();
            anInt8777 = (int) (f_4 * 256.0F / f_5);
            anInt8778 = (int) (f_6 * 256.0F / f_5);
        }

        method13951();
    }

    @Override
    public void iq(int i_1) {
        for (anInt8806 = 0; i_1 > 1; i_1 >>= 1) {
            anInt8806 += 1;
        }

        anInt8775 = 1 << anInt8806;
    }

    @Override
    public void ii(int i_1) {
        for (anInt8806 = 0; i_1 > 1; i_1 >>= 1) {
            anInt8806 += 1;
        }

        anInt8775 = 1 << anInt8806;
    }

    @Override
    public FontRenderer createFont(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
        return new FontRenderer_Sub4(this, fontmetrics_1, arr_2, bool_3);
    }

    @Override
    public void ik(int i_1, int i_2, int i_3) {
        if (anInt8810 != i_1 || anInt8811 != i_2 || anInt8680 != i_3) {
            anInt8810 = i_1;
            anInt8811 = i_2;
            anInt8680 = i_3;
            method14062();
            method13991();
        }

    }

    @Override
    public MeshRasterizer method8623(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new MeshRasterizer_Sub3(this, rsmesh_1, i_2, i_4, i_5, i_3);
    }

    @Override
    public void method8594(boolean bool_1) {
    }

    @Override
    public boolean method8501() {
        return aBool8828;
    }

    @Override
    public void method8584(Class152 class152_1) {
        aClass152_Sub2_8731 = (Class152_Sub2) class152_1;
    }

    @Override
    public void method8598(Class152 class152_1) {
        aClass152_Sub2_8731 = (Class152_Sub2) class152_1;
    }

    @Override
    public boolean method8628() {
        if (aClass55Array8802[1] != null && !aClass55Array8802[1].method1107()) {
            boolean bool_1 = aClass32_8714.method816(aClass55Array8802[1]);
            if (bool_1) {
                aClass66_8787.method1279();
            }

            return bool_1;
        } else {
            return false;
        }
    }

    @Override
    public boolean method8600() {
        if (aClass55Array8802[1] != null && !aClass55Array8802[1].method1107()) {
            boolean bool_1 = aClass32_8714.method816(aClass55Array8802[1]);
            if (bool_1) {
                aClass66_8787.method1279();
            }

            return bool_1;
        } else {
            return false;
        }
    }

    @Override
    public void method8601() {
        if (aClass55Array8802[1] != null && aClass55Array8802[1].method1107()) {
            aClass32_8714.method822(aClass55Array8802[1]);
            aClass66_8787.method1279();
        }

    }

    @Override
    public void method8602() {
        if (aClass55Array8802[1] != null && aClass55Array8802[1].method1107()) {
            aClass32_8714.method822(aClass55Array8802[1]);
            aClass66_8787.method1279();
        }

    }

    @Override
    public void method8521() {
        if (aClass55Array8802[1] != null && aClass55Array8802[1].method1107()) {
            aClass32_8714.method822(aClass55Array8802[1]);
            aClass66_8787.method1279();
        }

    }

    @Override
    public boolean method8679() {
        return aClass55Array8802[1] != null && aClass55Array8802[1].method1107();
    }

    @Override
    public boolean method8605() {
        return aClass55Array8802[1] != null && aClass55Array8802[1].method1107();
    }

    @Override
    public boolean method8606() {
        return aClass55Array8802[1] != null && aClass55Array8802[1].method1107();
    }

    @Override
    public boolean method8607() {
        return aClass55Array8802[1] != null && aClass55Array8802[1].method1107();
    }

    @Override
    void method8608(float f_1, float f_2, float f_3, float f_6) {
        Class55_Sub1.aFloat9188 = f_1;
        Class55_Sub1.aFloat9184 = f_2;
        Class55_Sub1.aFloat9189 = f_3;
        Class55_Sub1.aFloat9186 = f_6;
    }

    @Override
    public void method8673(int i_1, int i_2, int i_3, int i_4) {
        aClass32_8714.method830(i_3, i_4);
    }

    @Override
    public void method8603(int i_1, int i_2, int i_3, int i_4) {
        aClass32_8714.method830(i_3, i_4);
    }

    @Override
    public void method8691() {
        aClass32_8714.method833();
    }

    @Override
    public void method8613() {
        aClass32_8714.method833();
    }

    @Override
    public int df() {
        return anInt8702 + anInt8701 + anInt8761;
    }

    @Override
    public void method8615(int i_1, HDWaterTile class90_2) {
        if (!aBool8779) {
            throw new RuntimeException("");
        } else {
            anInt8739 = i_1;
            aClass90_8807 = class90_2;
            if (aBool8805) {
                aClass41Array8793[3].method876();
                aClass41Array8793[3].method877();
            }

        }
    }

    @Override
    public void method8616(int i_1, HDWaterTile class90_2) {
        if (!aBool8779) {
            throw new RuntimeException("");
        } else {
            anInt8739 = i_1;
            aClass90_8807 = class90_2;
            if (aBool8805) {
                aClass41Array8793[3].method876();
                aClass41Array8793[3].method877();
            }

        }
    }

    abstract Interface31 method14034(int var1, boolean var2, int[][] var3);

    public void method14035(Interface30 interface30_1) {
        if (interface30_1 != anInterface30Array8781[anInt8780]) {
            anInterface30Array8781[anInt8780] = interface30_1;
            if (interface30_1 != null) {
                interface30_1.method207();
            } else {
                anInterface6_8788.method207();
            }

            anInt8703 &= -2;
        }

    }

    Matrix44 method14036() {
        return aClass384_8705;
    }

    @Override
    public void method8627(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
    }

    @Override
    public void method8488(int i_1) {
        if (aClass66_8787 != null) {
            aClass66_8787.method1278();
        }

        anInt8820 = i_1 & 0x7fffffff;
    }

    @Override
    public void r(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        if (aClass158_5853 != null) {
            i_6 = aClass158_5853.method2714();
            i_5 = aClass158_5853.method2716();
        } else {
            i_5 = 0;
            i_6 = 0;
        }

        if (i_1 <= 0 && i_3 >= i_6 - 1 && i_2 <= 0 && i_4 >= i_5 - 1) {
            L();
        } else {
            anInt8743 = Math.max(0, i_1);
            anInt8744 = Math.min(i_3, i_6);
            anInt8822 = Math.max(0, i_2);
            anInt8742 = Math.min(i_4, i_5);
            if (!aBool8843) {
                aBool8843 = true;
                method13922();
            }

            method13921();
        }

    }

    @Override
    public int method8434(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public void method8633() {
        anInt8745 = 0;
        anInt8835 = 0;
        anInt8722 = aClass158_5853.method2714();
        anInt8748 = aClass158_5853.method2716();
        method13918();
    }

    @Override
    public Matrix44 method8589() {
        return aClass384_8724;
    }

    @Override
    public boolean method8402() {
        return true;
    }

    @Override
    public FontRenderer method8625(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
        return new FontRenderer_Sub4(this, fontmetrics_1, arr_2, bool_3);
    }

    public abstract boolean method14045();

    abstract void method14047();

    abstract Interface6 method14048(int var1, int var2, boolean var3, int[] var4, int var5, int var6);

    public abstract Shader method14049(String var1);

    @Override
    public int method8537(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_1 + aClass384_8728.buf[6] * i_2 + aClass384_8728.buf[10] * i_3;
        float f_9 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_4 + aClass384_8728.buf[6] * i_5 + aClass384_8728.buf[10] * i_6;
        float f_10 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_1 + aClass384_8728.buf[7] * i_2 + aClass384_8728.buf[11] * i_3;
        float f_11 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_4 + aClass384_8728.buf[7] * i_5 + aClass384_8728.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_1 + aClass384_8728.buf[4] * i_2 + aClass384_8728.buf[8] * i_3;
        float f_13 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_4 + aClass384_8728.buf[4] * i_5 + aClass384_8728.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_1 + aClass384_8728.buf[5] * i_2 + aClass384_8728.buf[9] * i_3;
        float f_15 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_4 + aClass384_8728.buf[5] * i_5 + aClass384_8728.buf[9] * i_6;
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    abstract void method14054();

    public abstract void method14056(Matrix44 var1, Matrix44 var2, Matrix44 var3);

    public abstract void method14057(Matrix44 var1, Matrix44 var2, Matrix44 var3);

    public abstract void method14058(Matrix44 var1, Matrix44 var2, Matrix44 var3);

    @Override
    public Matrix44 method8587() {
        return aClass384_8724;
    }

    @Override
    public int method8443(int i_1, int i_2) {
        return i_1 & i_2 ^ i_2;
    }

    @Override
    public void method8525(int i_3, int i_4) {
        aClass32_8714.method830(i_3, i_4);
    }

    @Override
    public void method8494(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        float f_10 = (float) i_3 - i_1;
        float f_11 = (float) i_4 - i_2;
        if (f_10 == 0.0F && f_11 == 0.0F) {
            f_10 = 1.0F;
        } else {
            float f_23 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
            f_10 *= f_23;
            f_11 *= f_23;
        }

        method13935();
        Class41 class41_12 = aClass41Array8793[13];
        class41_12.method873();
        class41_12.method875();
        method13904(i_6);
        class41_12.method879();
        method13992(false);
        i_9 %= i_8 + i_7;
        float f_13 = f_10 * i_7;
        float f_14 = f_11 * i_7;
        float f_15 = 0.0F;
        float f_16 = 0.0F;
        float f_17 = f_13;
        float f_18 = f_14;
        if (i_9 > i_7) {
            f_15 = f_10 * (i_7 + i_8 - i_9);
            f_16 = f_11 * (i_7 + i_8 - i_9);
        } else {
            f_17 = f_10 * (i_7 - i_9);
            f_18 = f_11 * (i_7 - i_9);
        }

        float f_19 = i_1 + f_15;
        float f_20 = i_2 + f_16;
        float f_21 = f_10 * i_8;
        float f_22 = f_11 * i_8;

        while (true) {
            if (i_3 > i_1) {
                if (f_19 > i_3) {
                    break;
                }

                if (f_19 + f_17 > i_3) {
                    f_17 = i_3 - f_19;
                }
            } else {
                if (f_19 < i_3) {
                    break;
                }

                if (f_19 + f_17 < i_3) {
                    f_17 = i_3 - f_19;
                }
            }

            if (i_4 > i_2) {
                if (f_20 > i_4) {
                    break;
                }

                if (f_20 + f_18 > i_4) {
                    f_18 = i_4 - f_20;
                }
            } else {
                if (f_20 < i_4) {
                    break;
                }

                if (f_20 + f_18 < i_4) {
                    f_18 = i_4 - f_20;
                }
            }

            if (!method13908(f_19, f_20, f_19 + f_17, f_20 + f_18)) {
                return;
            }

            method14000();
            f_19 += f_21 + f_17;
            f_20 += f_22 + f_18;
            f_17 = f_13;
            f_18 = f_14;
        }

        method13992(true);
        class41_12.method885();
    }

    @Override
    public int method8632(int i_1, int i_2) {
        return i_1 | i_2;
    }

    void method14062() {
        if (aClass41_8753 != null) {
            aClass41_8753.method877();
        }

        method14013();
    }

    abstract void method14063();

    abstract Interface29 method14064(Class150 var1, Class76 var2, int var3, int var4);

    abstract Interface6 method14072(Class150 var1, Class76 var2, int var3, int var4);

    byte[] getCacheShaderData(String string_1, String string_2) {
        return shaderIndex.getFileByName(string_1, string_2);
    }

    abstract Interface1 method14077(Class150 var1, int var2, int var3, int var4, boolean var5, byte[] var6);

    @Override
    public void fs(int i_1, int i_2, int i_3, int i_4, int i_5) {
        method8433(i_1, i_2, i_1 + i_3, i_2, i_4, i_5);
    }

    @Override
    public void method8476(int i_1, HDWaterTile class90_2) {
        if (!aBool8779) {
            throw new RuntimeException("");
        } else {
            anInt8739 = i_1;
            aClass90_8807 = class90_2;
            if (aBool8805) {
                aClass41Array8793[3].method876();
                aClass41Array8793[3].method877();
            }

        }
    }

    @Override
    public void method8634() {
        anInt8745 = 0;
        anInt8835 = 0;
        anInt8722 = aClass158_5853.method2714();
        anInt8748 = aClass158_5853.method2716();
        method13918();
    }

    abstract void method14087();

    @Override
    public int method8630(int i_1, int i_2) {
        return i_1 | i_2;
    }

    abstract void method14088();

    @Override
    public void method8536(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        i_1 = (int) (i_1 + 1.0F);
        i_2 = (int) (i_2 + 1.0F);
        i_3 = (int) (i_3 + 1.0F);
        i_4 = (int) (i_4 + 1.0F);
        float f_8 = (i_3 - i_1);
        float f_9 = (i_4 - i_2);
        float f_10 = 1.0F / (float) Math.sqrt(f_8 * f_8 + f_9 * f_9);
        f_8 *= f_10;
        f_9 *= f_10;
        i_1 = (int) (i_1 - f_8);
        i_2 = (int) (i_2 - f_9);
        float f_11 = -f_9;
        f_11 *= 0.5F * i_6;
        float f_12 = f_8 * 0.5F * i_6;
        aNativeSprite_Sub3_8790.method2763(i_1 - f_11, i_2 - f_12, i_3 - f_11, i_4 - f_12, i_1 + f_11, i_2 + f_12, 0, i_5, i_7);
    }

    abstract Interface6 method14090(Class150 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7);

    public abstract float method14091();

    abstract void method14092(boolean var1);

    abstract Interface6 method14094(int var1, int var2, boolean var3, int[] var4, int var5, int var6);

    abstract void method14098(int var1);

    public abstract void method14101(Class352 var1, int var2, int var3, int var4, int var5);

    @Override
    public void method8669(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9) {
    }

    public abstract void method14107(Matrix44 var1);

    @Override
    public void O() {
        aBool8779 = false;
    }

    abstract void method14117();

    @Override
    public void ib(int i_1, int i_2, int i_3) {
        if (anInt8810 != i_1 || anInt8811 != i_2 || anInt8680 != i_3) {
            anInt8810 = i_1;
            anInt8811 = i_2;
            anInt8680 = i_3;
            method14062();
            method13991();
        }

    }

    @Override
    public void method8635() {
        anInt8745 = 0;
        anInt8835 = 0;
        anInt8722 = aClass158_5853.method2714();
        anInt8748 = aClass158_5853.method2716();
        method13918();
    }

    @Override
    public boolean method8495() {
        return true;
    }

    @Override
    public int di() {
        return anInt8702 + anInt8701 + anInt8761;
    }

    abstract void method14119();

    abstract void method14120();

    @Override
    public int method8437(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_1 + aClass384_8728.buf[6] * i_2 + aClass384_8728.buf[10] * i_3;
        float f_9 = aClass384_8728.buf[14] + aClass384_8728.buf[2] * i_4 + aClass384_8728.buf[6] * i_5 + aClass384_8728.buf[10] * i_6;
        float f_10 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_1 + aClass384_8728.buf[7] * i_2 + aClass384_8728.buf[11] * i_3;
        float f_11 = aClass384_8728.buf[15] + aClass384_8728.buf[3] * i_4 + aClass384_8728.buf[7] * i_5 + aClass384_8728.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_1 + aClass384_8728.buf[4] * i_2 + aClass384_8728.buf[8] * i_3;
        float f_13 = aClass384_8728.buf[12] + aClass384_8728.buf[0] * i_4 + aClass384_8728.buf[4] * i_5 + aClass384_8728.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_1 + aClass384_8728.buf[5] * i_2 + aClass384_8728.buf[9] * i_3;
        float f_15 = aClass384_8728.buf[13] + aClass384_8728.buf[1] * i_4 + aClass384_8728.buf[5] * i_5 + aClass384_8728.buf[9] * i_6;
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public void is(int i_1, int i_2, int i_3) {
        if (anInt8810 != i_1 || anInt8811 != i_2 || anInt8680 != i_3) {
            anInt8810 = i_1;
            anInt8811 = i_2;
            anInt8680 = i_3;
            method14062();
            method13991();
        }

    }

    abstract void method14121();

    abstract void method14122();

    @Override
    public boolean method8492() {
        return true;
    }

    abstract void method14124();

    abstract void method14125();

    Matrix44 method14126() {
        return aClass33_8719 == Class33.aClass33_381 ? aClass384_8740 : aClass384_8712;
    }

    abstract void method14127();

    @Override
    public boolean method8406() {
        return true;
    }

    @Override
    public void method8459() {
    }

    Matrix44Var method14130() {
        if (aClass33_8719 == Class33.aClass33_381) {
            if (!aBool8829) {
                aClass294_8710.method5209(aClass294_8704);
                aClass294_8710.method5208(aClass294_8706);
                aClass384_8685.fromVarMatrix44(aClass294_8710);
                aBool8829 = true;
            }

            return aClass294_8710;
        } else {
            return aClass294_8704;
        }
    }

    @Override
    public void method8514(int i_1, int i_2, int i_3, int i_4) {
        anInt8745 = i_1;
        anInt8835 = i_2;
        anInt8722 = i_3;
        anInt8748 = i_4;
        method13918();
    }

    abstract void method14132();

    void method14133() {
        method14226();
    }

    abstract boolean method14134(Class150 var1, Class76 var2);

    abstract boolean method14135(Class150 var1, Class76 var2);

    abstract boolean method14136(Class150 var1, Class76 var2);

    abstract boolean method14137(Class150 var1, Class76 var2);

    @Override
    public void jf() {
        aBool8779 = false;
    }

    abstract Interface6 method14141(Class150 var1, Class76 var2, int var3, int var4);

    abstract Interface6 method14142(Class150 var1, Class76 var2, int var3, int var4);

    abstract Interface6 method14143(Class150 var1, int var2, int var3, boolean var4, byte[] var5);

    abstract Interface6 method14144(Class150 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7);

    @Override
    public boolean method8465() {
        return true;
    }

    abstract Interface6 method14145(Class150 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7);

    @Override
    public NativeSprite method8654(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        return new NativeSprite_Sub3(this, i_1, i_2, bool_3, bool_4);
    }

    public abstract boolean method14146();

    @Override
    public NativeSprite method8577(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        return new NativeSprite_Sub3(this, i_1, i_2, bool_3, bool_4);
    }

    @Override
    public void method8519(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        method8433(i_1, i_2, i_1 + i_3, i_2, i_5, i_6);
        method8433(i_1, i_2 + i_4, i_1 + i_3, i_2 + i_4, i_5, i_6);
        method8433(i_1, i_2, i_1, i_2 + i_4, i_5, i_6);
        method8433(i_1 + i_3, i_2, i_1 + i_3, i_2 + i_4, i_5, i_6);
    }

    public void method14147() {
        anInterface30Array8781 = new Interface30[anInt8825];
        aClass384Array8782 = new Matrix44[anInt8825];
        aClass37Array8783 = new Class37[anInt8825];
        aClass68Array8784 = new Class68[anInt8825];
        aClass68Array8785 = new Class68[anInt8825];

        for (int i_1 = 0; i_1 < anInt8825; i_1++) {
            aClass68Array8785[i_1] = Class68.aClass68_683;
            aClass68Array8784[i_1] = Class68.aClass68_683;
            aClass37Array8783[i_1] = Class37.aClass37_393;
            aClass384Array8782[i_1] = new Matrix44();
        }

        aNode_Sub24Array8716 = new Node_Sub24[anInt8799 - 2];
        int[] ints_3 = {-1};
        anInterface6_8788 = method14094(1, 1, false, ints_3, 0, 0);
        ints_3[0] = -16777216;
        anInterface6_8795 = method14094(1, 1, false, ints_3, 0, 0);
        method8439(new Node_Sub1_Sub2(262144));
        aClass70_8832 = method13995(new Class72[]{new Class72(new Class69[]{Class69.aClass69_695, Class69.aClass69_692})});
        method13995(new Class72[]{new Class72(new Class69[]{Class69.aClass69_695, Class69.aClass69_690})});
        aClass70_8836 = method13995(new Class72[]{new Class72(Class69.aClass69_695), new Class72(Class69.aClass69_690), new Class72(Class69.aClass69_692), new Class72(Class69.aClass69_689)});
        aClass70_8721 = method13995(new Class72[]{new Class72(Class69.aClass69_695), new Class72(Class69.aClass69_690), new Class72(Class69.aClass69_692)});

        for (int i_2 = 0; i_2 < 7; i_2++) {
            aMeshRasterizer_Sub3Array8839[i_2] = new MeshRasterizer_Sub3(this, 0, 0, false, false);
            aMeshRasterizer_Sub3Array8840[i_2] = new MeshRasterizer_Sub3(this, 0, 0, true, true);
        }

        method13895();
        anInterface32_8834 = method13993(true);
        method13897();
        method8418();
        L();
        method8420();
        aNativeSprite_Sub3_8790 = new NativeSprite_Sub3(this, anInterface6_8788);
        aNativeSprite_Sub3_8791 = new NativeSprite_Sub3(this, anInterface6_8795);
        ba(3, 0);
    }

    abstract Interface29 method14148(Class150 var1, Class76 var2, int var3, int var4);

    abstract Interface29 method14149(Class150 var1, Class76 var2, int var3, int var4);

    public void method14150() {
        method14001(Class352.aClass352_4104);
    }

    public abstract void method14153();

    public abstract void method14154();

    public abstract void method14161(int var1, Interface4 var2);

    abstract void method14162(int var1, Class67 var2, boolean var3, boolean var4);

    public void method14163(int i_1) {
        if (anInt8780 != i_1) {
            anInt8780 = i_1;
            method13978();
        }

    }

    abstract void method14166(int var1, Class67 var2, boolean var3);

    abstract void method14169();

    @Override
    public void method8560(int i_1) {
    }

    abstract void method14172();

    abstract void method14173(Interface32 var1);

    void method14177() {
        anInterface4_8693 = method13994(false);
        anInterface4_8693.method31(3096, 12);
        aByteBuffer8838.clear();
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);
        aByteBuffer8838.putFloat(0.0F);

        for (int i_1 = 0; i_1 <= 256; i_1++) {
            double d_2 = (i_1 * 2) * 3.141592653589793D / 256.0D;
            float f_4 = (float) Math.cos(d_2);
            float f_5 = (float) Math.sin(d_2);
            aByteBuffer8838.putFloat(f_5);
            aByteBuffer8838.putFloat(f_4);
            aByteBuffer8838.putFloat(0.0F);
        }

        anInterface4_8693.method42(0, aByteBuffer8838.position(), aLong8695);
    }

    abstract void method14179();

    abstract void method14180();

    @Override
    public Class152 method8636(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        return new Class152_Sub2_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6);
    }

    abstract void method14181();

    abstract void method14182();

    abstract void method14183();

    abstract void method14184();

    abstract void method14185();

    abstract void method14186();

    abstract void method14187();

    abstract void method14188();

    abstract void method14190();

    @Override
    public void B(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (aBool8755) {
            RA(false);
            aNativeSprite_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
            RA(true);
        } else {
            aNativeSprite_Sub3_8790.method2754(i_1, i_2, i_3, i_4, 0, i_5, i_6);
        }

    }

    abstract void method14197();

    @Override
    public void G(int i_1, int i_2, int i_3, int i_4, int i_5) {
        method8433(i_1, i_2, i_1, i_3 + i_2, i_4, i_5);
    }

    abstract void method14199();

    abstract void method14200();

    @Override
    public void method8474() {
        aClass32_8714.method833();
    }

    abstract void method14203();

    abstract void method14204();

    abstract void method14205();

    abstract Interface32 method14206(boolean var1);

    abstract Interface32 method14207(boolean var1);

    abstract Class70 method14209(Class72[] var1);

    abstract Class70 method14210(Class72[] var1);

    public abstract void method14212(Class70 var1);

    public abstract void method14213(int var1, Interface4 var2);

    public abstract void method14214(int var1, Interface4 var2);

    abstract void method14215(Interface32 var1);

    abstract Interface6 method14216(Class150 var1, Class76 var2, int var3, int var4);

    abstract void method14217(Interface32 var1);

    abstract void method14224(int var1, Class67 var2, boolean var3, boolean var4);

    abstract void method14226();

    @Override
    public boolean method8609() {
        return false;
    }

    public abstract void method14228(Class352 var1, int var2, int var3, int var4, int var5);

    public abstract void method14229(Class352 var1, int var2, int var3, int var4, int var5);

    public abstract void method14230(Class352 var1, int var2, int var3, int var4, int var5);

    abstract void method14235(int var1);

    abstract void method14236(int var1);

    abstract Interface31 method14237(int var1, boolean var2, int[][] var3);

    abstract void method14238();

    abstract Interface31 method14239(int var1, boolean var2, int[][] var3);

    abstract void method14240(int var1);

}
