package com.jagex;

import jaggl.OpenGL;

public class Class141_Sub3 extends Class141 {

    static float[] aFloatArray9048 = {0.0F, 0.0F, 0.0F, 0.0F};
    Class138 aClass138_9046;
    Class136 aClass136_9044;
    Class137_Sub3 aClass137_Sub3_9047;

    Class141_Sub3(OpenGLRenderer class505_sub1_1, Class136 class136_2) {
        super(class505_sub1_1);
        aClass136_9044 = class136_2;
        method14423();
        aClass137_Sub3_9047 = new Class137_Sub3(aGraphicalRenderer_Sub1_1664, Class150.aClass150_1951, Class76.aClass76_751, new byte[]{(byte) 0, (byte) -1}, Class150.aClass150_1951);
        aClass137_Sub3_9047.method14460();
    }

    @Override
    void method2411() {
        aClass138_9046.method2379('\u0001');
        if (aGraphicalRenderer_Sub1_1664.anInt8358 > 0) {
            aGraphicalRenderer_Sub1_1664.method13610(1);
            aGraphicalRenderer_Sub1_1664.method13654(null);
            aGraphicalRenderer_Sub1_1664.method13591(1.0F, 0.0F);
            aGraphicalRenderer_Sub1_1664.method13610(0);
        }

        aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @Override
    boolean method2395() {
        return true;
    }

    @Override
    void method2396(int i_1, int i_2) {
        if ((i_1 & 0x1) == 1) {
            if (aClass136_9044.aBool1631) {
                aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub4_1633);
                aFloatArray9048[0] = 0.0F;
                aFloatArray9048[1] = 0.0F;
                aFloatArray9048[2] = 0.0F;
                aFloatArray9048[3] = (aGraphicalRenderer_Sub1_1664.anInt8368 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
            } else {
                int i_3 = aGraphicalRenderer_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
                aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub1Array1632[i_3]);
            }
        } else if (aClass136_9044.aBool1631) {
            aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub4_1633);
            aFloatArray9048[0] = 0.0F;
            aFloatArray9048[1] = 0.0F;
            aFloatArray9048[2] = 0.0F;
            aFloatArray9048[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
        } else {
            aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub1Array1632[0]);
        }

    }

    @Override
    void method2408() {
        aGraphicalRenderer_Sub1_1664.method13717(260, 8448);
    }

    @Override
    void method2398() {
        aClass138_9046.method2379('\u0001');
        if (aGraphicalRenderer_Sub1_1664.anInt8358 > 0) {
            aGraphicalRenderer_Sub1_1664.method13610(1);
            aGraphicalRenderer_Sub1_1664.method13654(null);
            aGraphicalRenderer_Sub1_1664.method13591(1.0F, 0.0F);
            aGraphicalRenderer_Sub1_1664.method13610(0);
        }

        aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @Override
    void method2397(boolean bool_1) {
        if (aGraphicalRenderer_Sub1_1664.anInt8358 > 0) {
            float f_2 = -0.5f / aGraphicalRenderer_Sub1_1664.anInt8358;
            aGraphicalRenderer_Sub1_1664.method13610(1);
            aFloatArray9048[0] = 0.0F;
            aFloatArray9048[1] = 0.0F;
            aFloatArray9048[2] = f_2;
            aFloatArray9048[3] = aGraphicalRenderer_Sub1_1664.aFloat8406 * f_2 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, aFloatArray9048, 0);
            OpenGL.glPopMatrix();
            aGraphicalRenderer_Sub1_1664.method13591(0.5F, aGraphicalRenderer_Sub1_1664.anInt8358);
            aGraphicalRenderer_Sub1_1664.method13654(aClass137_Sub3_9047);
            aGraphicalRenderer_Sub1_1664.method13610(0);
        }

        aClass138_9046.method2379('\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @Override
    void method2400(Class137 class137_1, int i_2) {
    }

    void method14423() {
        aClass138_9046 = new Class138(2);
        aClass138_9046.method2380(0);
        aGraphicalRenderer_Sub1_1664.method13610(1);
        aGraphicalRenderer_Sub1_1664.method13717(7681, 260);
        aGraphicalRenderer_Sub1_1664.method13595(0, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        aGraphicalRenderer_Sub1_1664.method13610(0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (aClass136_9044.aBool1631) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }

        aClass138_9046.method2381();
        aClass138_9046.method2380(1);
        aGraphicalRenderer_Sub1_1664.method13610(1);
        aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
        aGraphicalRenderer_Sub1_1664.method13595(0, 5890, 768);
        OpenGL.glDisable(3168);
        aGraphicalRenderer_Sub1_1664.method13610(0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (aClass136_9044.aBool1631) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }

        aClass138_9046.method2381();
    }

    @Override
    void method2407() {
        aGraphicalRenderer_Sub1_1664.method13717(260, 8448);
    }

    @Override
    boolean method2401() {
        return true;
    }

    @Override
    void method2414(Class137 class137_1, int i_2) {
    }

    @Override
    void method2404() {
        aGraphicalRenderer_Sub1_1664.method13717(260, 8448);
    }

    @Override
    void method2405() {
        aGraphicalRenderer_Sub1_1664.method13717(260, 8448);
    }

    @Override
    void method2406() {
        aGraphicalRenderer_Sub1_1664.method13717(260, 8448);
    }

    @Override
    void method2413(Class137 class137_1, int i_2) {
    }

    @Override
    void method2409(int i_1, int i_2) {
        if ((i_1 & 0x1) == 1) {
            if (aClass136_9044.aBool1631) {
                aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub4_1633);
                aFloatArray9048[0] = 0.0F;
                aFloatArray9048[1] = 0.0F;
                aFloatArray9048[2] = 0.0F;
                aFloatArray9048[3] = (aGraphicalRenderer_Sub1_1664.anInt8368 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
            } else {
                int i_3 = aGraphicalRenderer_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
                aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub1Array1632[i_3]);
            }
        } else if (aClass136_9044.aBool1631) {
            aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub4_1633);
            aFloatArray9048[0] = 0.0F;
            aFloatArray9048[1] = 0.0F;
            aFloatArray9048[2] = 0.0F;
            aFloatArray9048[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
        } else {
            aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub1Array1632[0]);
        }

    }

    @Override
    void method2410(int i_1, int i_2) {
        if ((i_1 & 0x1) == 1) {
            if (aClass136_9044.aBool1631) {
                aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub4_1633);
                aFloatArray9048[0] = 0.0F;
                aFloatArray9048[1] = 0.0F;
                aFloatArray9048[2] = 0.0F;
                aFloatArray9048[3] = (aGraphicalRenderer_Sub1_1664.anInt8368 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
            } else {
                int i_3 = aGraphicalRenderer_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
                aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub1Array1632[i_3]);
            }
        } else if (aClass136_9044.aBool1631) {
            aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub4_1633);
            aFloatArray9048[0] = 0.0F;
            aFloatArray9048[1] = 0.0F;
            aFloatArray9048[2] = 0.0F;
            aFloatArray9048[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
        } else {
            aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub1Array1632[0]);
        }

    }

    @Override
    void method2394(Class137 class137_1, int i_2) {
    }

    @Override
    void method2412(Class137 class137_1, int i_2) {
    }

    @Override
    void method2399(int i_1, int i_2) {
        if ((i_1 & 0x1) == 1) {
            if (aClass136_9044.aBool1631) {
                aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub4_1633);
                aFloatArray9048[0] = 0.0F;
                aFloatArray9048[1] = 0.0F;
                aFloatArray9048[2] = 0.0F;
                aFloatArray9048[3] = (aGraphicalRenderer_Sub1_1664.anInt8368 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
            } else {
                int i_3 = aGraphicalRenderer_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
                aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub1Array1632[i_3]);
            }
        } else if (aClass136_9044.aBool1631) {
            aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub4_1633);
            aFloatArray9048[0] = 0.0F;
            aFloatArray9048[1] = 0.0F;
            aFloatArray9048[2] = 0.0F;
            aFloatArray9048[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, aFloatArray9048, 0);
        } else {
            aGraphicalRenderer_Sub1_1664.method13654(aClass136_9044.aClass137_Sub1Array1632[0]);
        }

    }

    @Override
    void method2402(boolean bool_1) {
        if (aGraphicalRenderer_Sub1_1664.anInt8358 > 0) {
            float f_2 = -0.5f / aGraphicalRenderer_Sub1_1664.anInt8358;
            aGraphicalRenderer_Sub1_1664.method13610(1);
            aFloatArray9048[0] = 0.0F;
            aFloatArray9048[1] = 0.0F;
            aFloatArray9048[2] = f_2;
            aFloatArray9048[3] = aGraphicalRenderer_Sub1_1664.aFloat8406 * f_2 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, aFloatArray9048, 0);
            OpenGL.glPopMatrix();
            aGraphicalRenderer_Sub1_1664.method13591(0.5F, aGraphicalRenderer_Sub1_1664.anInt8358);
            aGraphicalRenderer_Sub1_1664.method13654(aClass137_Sub3_9047);
            aGraphicalRenderer_Sub1_1664.method13610(0);
        }

        aClass138_9046.method2379('\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @Override
    void method2403(boolean bool_1) {
        if (aGraphicalRenderer_Sub1_1664.anInt8358 > 0) {
            float f_2 = -0.5f / aGraphicalRenderer_Sub1_1664.anInt8358;
            aGraphicalRenderer_Sub1_1664.method13610(1);
            aFloatArray9048[0] = 0.0F;
            aFloatArray9048[1] = 0.0F;
            aFloatArray9048[2] = f_2;
            aFloatArray9048[3] = aGraphicalRenderer_Sub1_1664.aFloat8406 * f_2 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, aFloatArray9048, 0);
            OpenGL.glPopMatrix();
            aGraphicalRenderer_Sub1_1664.method13591(0.5F, aGraphicalRenderer_Sub1_1664.anInt8358);
            aGraphicalRenderer_Sub1_1664.method13654(aClass137_Sub3_9047);
            aGraphicalRenderer_Sub1_1664.method13610(0);
        }

        aClass138_9046.method2379('\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

}
