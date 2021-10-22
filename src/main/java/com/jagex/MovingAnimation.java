package com.jagex;

public class MovingAnimation extends Animation {

    public boolean aBool7891;
    PathingEntity aTransform_Sub1_Sub1_Sub2_7892;

    MovingAnimation(PathingEntity animable_1) {
        super(false);
        aTransform_Sub1_Sub1_Sub2_7892 = animable_1;
    }

    public static String[] method12681(String string_0, char var_1) {
        int i_3 = Class149.method2565(string_0, var_1);
        String[] arr_4 = new String[i_3 + 1];
        int i_5 = 0;
        int i_6 = 0;

        for (int i_7 = 0; i_7 < i_3; i_7++) {
            int i_8;
            for (i_8 = i_6; string_0.charAt(i_8) != var_1; i_8++) {
            }

            arr_4[i_5++] = string_0.substring(i_6, i_8);
            i_6 = i_8 + 1;
        }

        arr_4[i_3] = string_0.substring(i_6);
        return arr_4;
    }

    public static boolean isInterfaceLoaded(int interfaceId, int[] xteas) {
        if (MapAreaIndexLoader.INTERFACES_LOADED[interfaceId]) {
            return true;
        } else {
            Interface.INTERFACES[interfaceId] = SkyboxIndexLoader.getInterface(interfaceId, xteas, Interface.INTERFACES[interfaceId], false);
            if (Interface.INTERFACES[interfaceId] == null) {
                return false;
            } else {
                MapAreaIndexLoader.INTERFACES_LOADED[interfaceId] = true;
                return true;
            }
        }
    }

    @Override
    void method7586(AnimationDefinitions animationdefinitions_1, int i_2) {
        if (!aBool7891 || !aTransform_Sub1_Sub1_Sub2_7892.currentAnimation.hasDefs() || aTransform_Sub1_Sub1_Sub2_7892.currentAnimation.hasSpeed()) {
            WorldType.method3662(animationdefinitions_1, i_2, aTransform_Sub1_Sub1_Sub2_7892);
        }

    }

}
