package com.jagex;

public class Class335 {

    public static int[] anIntArray3916;

    Class256 aClass256_3915;

    ByteBuf.Bit buffer;

    public Class335(Class256 class256_1, ByteBuf.Bit rsbitsbuffer_2) {
        aClass256_3915 = class256_1;
        buffer = rsbitsbuffer_2;
    }

    static void method5961() {
        if (Class260.aClass277_3221 != null) {
            Vector3 vector3_1 = Vector3.popVectorStackTo(VertexNormal.MY_PLAYER.method11166().coords);
            CoordGrid coordgrid_2 = IndexLoaders.MAP_REGION_DECODER.getBase();
            vector3_1.x += (coordgrid_2.x << 9);
            vector3_1.z += (coordgrid_2.y << 9);
            vector3_1.subtract(Class260.aClass277_3221.anInt3349, vector3_1.y, Class260.aClass277_3221.anInt3348);
            float f_3 = vector3_1.magnitude();
            vector3_1.pushVectorStack();
            float f_4 = 0.0F;
            if (f_3 < Class260.aClass277_3221.anInt3351) {
                f_4 = 1.0F;
            } else if (f_3 > Class260.aClass277_3221.anInt3350) {
                f_4 = 0.0F;
            } else {
                f_3 -= Class260.aClass277_3221.anInt3351;
                f_4 = 1.0F - f_3 / Class260.aClass277_3221.anInt3347;
            }
            Class187.method3121((int) (f_4 * 256.0F));
        }
    }

    public static Class466[] method5963() {
        return new Class466[]{Class466.aClass466_5564, Class466.aClass466_5567, Class466.aClass466_5568, Class466.aClass466_5563, Class466.aClass466_5569, Class466.aClass466_5565};
    }
}
