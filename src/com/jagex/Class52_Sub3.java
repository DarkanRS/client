package com.jagex;

public class Class52_Sub3 extends Class52 {

    Class52_Sub3(Index index_1, Index index_2, Class350_Sub2 class350_sub2_3) {
        super(index_1, index_2, class350_sub2_3);
    }

    static void method14519() {
        for (EntityNode_Sub2 class275_sub2_1 = (EntityNode_Sub2) client.aClass457_7290.method7648(); class275_sub2_1 != null; class275_sub2_1 = (EntityNode_Sub2) client.aClass457_7290.method7648()) {
            AbstractRenderer.method8695(class275_sub2_1);
        }
        byte b_4 = 0;
        byte b_2 = 3;
        int i_3;
        if (client.anInt7341 == 4) {
            for (i_3 = b_4; i_3 <= b_2; i_3++) {
                client.method11629(i_3);
            }
        } else {
            client.method11626();
            for (i_3 = b_4; i_3 <= b_2; i_3++) {
                client.method11627();
                client.method11628(i_3);
                client.method11629(i_3);
            }
            client.method11750();
        }
        client.method11619();
    }

    public static int[] getFontSpecifications() {
        return new int[]{Class16.p11FullIndex, Class16.p12FullIndex, Class395.b12FullIndex};
    }

    @Override
    void method1080(int i_2, int i_3) {
        int i_4 = method1078() * aClass350_489.anInt4093 * -229835439 * 329542577 / 10000;
        Renderers.SOFTWARE_RENDERER.B(i_2, 2 + i_3, i_4, aClass350_489.anInt4088 * 1707725877 * 323608093 - 2, -2070636517 * ((Class350_Sub2) aClass350_489).anInt7813 * 1289847315, 0);
        Renderers.SOFTWARE_RENDERER.B(i_2 + i_4, i_3 + 2, aClass350_489.anInt4093 * -229835439 * 329542577 - i_4, aClass350_489.anInt4088 * 1707725877 * 323608093 - 2, 0, 0);
    }

    @Override
    void method1077(int i_2, int i_3) {
        int i_5 = method1078() * aClass350_489.anInt4093 / 10000;
        Renderers.SOFTWARE_RENDERER.B(i_2, i_3 + 2, i_5, aClass350_489.anInt4088 - 2, ((Class350_Sub2) aClass350_489).anInt7813, 0);
        Renderers.SOFTWARE_RENDERER.B(i_5 + i_2, i_3 + 2, aClass350_489.anInt4093 - i_5, aClass350_489.anInt4088 - 2, 0, 0);
    }

    @Override
    void method1081(boolean bool_1, int i_2, int i_3) {
        Renderers.SOFTWARE_RENDERER.method8430(i_2 - 2, i_3, aClass350_489.anInt4093 + 4, aClass350_489.anInt4088 + 2, ((Class350_Sub2) aClass350_489).anInt7814, 0);
        Renderers.SOFTWARE_RENDERER.method8430(i_2 - 1, i_3 + 1, aClass350_489.anInt4093 + 2, aClass350_489.anInt4088, 0, 0);
    }

    @Override
    void method1075(int i_2, int i_3) {
        int i_4 = method1078() * aClass350_489.anInt4093 * -229835439 * 329542577 / 10000;
        Renderers.SOFTWARE_RENDERER.B(i_2, 2 + i_3, i_4, aClass350_489.anInt4088 * 1707725877 * 323608093 - 2, -2070636517 * ((Class350_Sub2) aClass350_489).anInt7813 * 1289847315, 0);
        Renderers.SOFTWARE_RENDERER.B(i_2 + i_4, i_3 + 2, aClass350_489.anInt4093 * -229835439 * 329542577 - i_4, aClass350_489.anInt4088 * 1707725877 * 323608093 - 2, 0, 0);
    }

    @Override
    void method1079(int i_2, int i_3) {
        int i_4 = method1078() * aClass350_489.anInt4093 * -229835439 * 329542577 / 10000;
        Renderers.SOFTWARE_RENDERER.B(i_2, 2 + i_3, i_4, aClass350_489.anInt4088 * 1707725877 * 323608093 - 2, -2070636517 * ((Class350_Sub2) aClass350_489).anInt7813 * 1289847315, 0);
        Renderers.SOFTWARE_RENDERER.B(i_2 + i_4, i_3 + 2, aClass350_489.anInt4093 * -229835439 * 329542577 - i_4, aClass350_489.anInt4088 * 1707725877 * 323608093 - 2, 0, 0);
    }

    @Override
    void method1076(boolean bool_1, int i_2, int i_3) {
        Renderers.SOFTWARE_RENDERER.method8430(i_2 - 2, i_3, 4 + aClass350_489.anInt4093 * -229835439 * 329542577, aClass350_489.anInt4088 * 1707725877 * 323608093 + 2, 1516875301 * ((Class350_Sub2) aClass350_489).anInt7814 * 62176685, 0);
        Renderers.SOFTWARE_RENDERER.method8430(i_2 - 1, 1 + i_3, 2 + 329542577 * aClass350_489.anInt4093 * -229835439, 323608093 * aClass350_489.anInt4088 * 1707725877, 0, 0);
    }
}
