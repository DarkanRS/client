public class Class363 {

    public static int anInt4203;

    Class363() throws Throwable {
        throw new Error();
    }

    static final void method6286(long long_0) {
        Vector3 vector3_2 = VertexNormal.MY_PLAYER.method11166().aClass385_3595;
        int i_3 = (int) vector3_2.x + client.anInt7248;
        int i_4 = (int) vector3_2.z + client.anInt7250;
        if (Class11.anInt122 - i_3 < -2000 || Class11.anInt122 - i_3 > 2000 || Class266.anInt3289 - i_4 < -2000 || Class266.anInt3289 - i_4 > 2000) {
            Class11.anInt122 = i_3;
            Class266.anInt3289 = i_4;
        }
        int i_5;
        int i_6;
        if (i_3 != Class11.anInt122) {
            i_5 = i_3 - Class11.anInt122;
            i_6 = (int) (long_0 * (long) i_5 / 320L);
            if (i_5 > 0) {
                if (i_6 == 0) {
                    i_6 = 1;
                } else if (i_6 > i_5) {
                    i_6 = i_5;
                }
            } else if (i_6 == 0) {
                i_6 = -1;
            } else if (i_6 < i_5) {
                i_6 = i_5;
            }
            Class11.anInt122 += i_6;
        }
        if (i_4 != Class266.anInt3289) {
            i_5 = i_4 - Class266.anInt3289;
            i_6 = (int) (long_0 * (long) i_5 / 320L);
            if (i_5 > 0) {
                if (i_6 == 0) {
                    i_6 = 1;
                } else if (i_6 > i_5) {
                    i_6 = i_5;
                }
            } else if (i_6 == 0) {
                i_6 = -1;
            } else if (i_6 < i_5) {
                i_6 = i_5;
            }
            Class266.anInt3289 += i_6;
        }
        client.aFloat7365 += client.aFloat7266 * (float) long_0 / 6.0F;
        client.aFloat7146 += client.aFloat7284 * (float) long_0 / 6.0F;
        IsaacCipher.method7268(1036013303);
    }

    static final void method6287(Animable animable_0, boolean bool_1, int i_2) {
        int moveType = MovementType.STATIONARY.id;
        int i_4 = 0;
        if (animable_0.anInt10342 > client.cycles) {
            MovementType.method4281(animable_0);
        } else if (animable_0.anInt10345 >= client.cycles) {
            ProcessorSpecs.method7727(animable_0);
        } else {
            SystemInfo.method13466(animable_0, bool_1);
            moveType = IdentikitDefinition.anInt430;
            i_4 = FontRenderer_Sub1.anInt8515;
        }
        Vector3 vector3_5 = animable_0.method11166().aClass385_3595;
        int i_6;
        if ((int) vector3_5.x < 512 || (int) vector3_5.z < 512 || (int) vector3_5.x >= (IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1) * 512 || (int) vector3_5.z >= (IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1) * 512) {
            animable_0.currentAnimation.update(-1);
            for (i_6 = 0; i_6 < animable_0.aClass161Array10339.length; i_6++) {
                animable_0.aClass161Array10339[i_6].spotAnimId = -1;
                animable_0.aClass161Array10339[i_6].animation.update(-1);
            }
            animable_0.currentAnimations = null;
            animable_0.anInt10342 = 0;
            animable_0.anInt10345 = 0;
            moveType = MovementType.STATIONARY.id;
            i_4 = 0;
            animable_0.method11172((float) (512 * animable_0.regionBaseX[0] + animable_0.getSize() * 256), vector3_5.y, (float) (animable_0.regionBaseY[0] * 512 + animable_0.getSize() * 256));
            animable_0.method15801();
        }
        if (VertexNormal.MY_PLAYER == animable_0 && ((int) vector3_5.x < 6144 || (int) vector3_5.z < 6144 || (int) vector3_5.x >= (IndexLoaders.MAP_REGION_DECODER.getSizeX() - 12) * 512 || (int) vector3_5.z >= (IndexLoaders.MAP_REGION_DECODER.getSizeY() - 12) * 512)) {
            animable_0.currentAnimation.update(-1);
            for (i_6 = 0; i_6 < animable_0.aClass161Array10339.length; i_6++) {
                animable_0.aClass161Array10339[i_6].spotAnimId = -1;
                animable_0.aClass161Array10339[i_6].animation.update(-1);
            }
            animable_0.currentAnimations = null;
            animable_0.anInt10342 = 0;
            animable_0.anInt10345 = 0;
            moveType = MovementType.STATIONARY.id;
            i_4 = 0;
            animable_0.method11172((float) (animable_0.regionBaseX[0] * 512 + animable_0.getSize() * 256), vector3_5.y, (float) (512 * animable_0.regionBaseY[0] + animable_0.getSize() * 256));
            animable_0.method15801();
        }
        i_6 = MapSpriteIndexLoader.method7188(animable_0);
        WallDecoration.method16087(animable_0);
        Class302.handleMovementAnimations(animable_0, moveType, i_4, i_6, 1792753982);
        Class236.method3985(animable_0, moveType, (byte) -27);
        Class150.method2581(animable_0, -1454383651);
        Quaternion quaternion_7 = Quaternion.create();
        quaternion_7.romYawPitchRoll(Class382.method6508(animable_0.aClass19_10359.method578()), Class382.method6508(animable_0.aClass19_10330.method578()), Class382.method6508(animable_0.aClass19_10360.method578()));
        animable_0.method11187(quaternion_7);
        quaternion_7.cache();
    }
}
