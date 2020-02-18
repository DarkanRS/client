package com.jagex;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

import java.nio.ByteBuffer;

public class Class360_Sub3 extends Class360 implements Interface31 {

    int anInt9200;

    Class360_Sub3(AbstractRenderer_Sub2_Sub2 class505_sub2_sub2_1, int i_2, boolean bool_3, int[][] ints_4) {
        super(class505_sub2_sub2_1, Class150.aClass150_1949, Class76.aClass76_751, bool_3 && class505_sub2_sub2_1.aBool10247);
        anInt9200 = i_2;
        if (aBool4166) {
            aLong4168 = IDirect3DDevice.CreateCubeTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, anInt9200, 0, 1024, 21, 1);
        } else {
            aLong4168 = IDirect3DDevice.CreateCubeTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, anInt9200, 1, 0, 21, 1);
        }

        ByteBuffer bytebuffer_5 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;

        for (int i_6 = 0; i_6 < 6; i_6++) {
            bytebuffer_5.clear();
            bytebuffer_5.asIntBuffer().put(ints_4[i_6]);
            IDirect3DCubeTexture.Upload(aLong4168, i_6, 0, 0, 0, anInt9200, anInt9200, anInt9200 * 4, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
        }

    }

    @Override
    public void method203() {
        aGraphicalRenderer_Sub2_Sub2_4165.method15662(this);
    }

    @Override
    public void method26() {
        super.method26();
    }

    @Override
    public void method205(Class35 class35_1) {
        super.method205(class35_1);
    }

    @Override
    public void method32() {
        super.method26();
    }

    @Override
    public void method202(Class35 class35_1) {
        super.method205(class35_1);
    }

    @Override
    public void method204(Class35 class35_1) {
        super.method205(class35_1);
    }

    @Override
    public void method207() {
        aGraphicalRenderer_Sub2_Sub2_4165.method15662(this);
    }

    @Override
    public void method201(Class35 class35_1) {
        super.method205(class35_1);
    }

    @Override
    public void method206(Class35 class35_1) {
        super.method205(class35_1);
    }

}
