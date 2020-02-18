package com.jagex;

import java.util.Stack;

public class Class285 {

    public static FontRenderer aFontRenderer_3394;
    static Stack<Class285> aStack3390 = new Stack<Class285>();
    public GraphNode_Sub1 aTransform_Sub1_3391;
    boolean aBool3392;
    Login aClass284_3393;

    public static String method5025(CharSequence charsequence_0) {
        String string_2 = Class179.method3018(Class366.method6302(charsequence_0));
        if (string_2 == null) {
            string_2 = "";
        }
        return string_2;
    }

    public static int method5026(CharSequence charsequence_0) {
        return Utils.parseInt(charsequence_0, 16);
    }

    public static int getCRC(byte[] data, int length) {
        return Class455.getCRC(data, 0, length);
    }

    public boolean method5019(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        int i_5 = aTransform_Sub1_3391.method12996();
        if (aTransform_Sub1_3391.boundingBoxPolygons != null) {
            for (int i_6 = 0; i_6 < aTransform_Sub1_3391.boundingBoxPolygons.length; i_6++) {
                aTransform_Sub1_3391.boundingBoxPolygons[i_6].anInt7851 <<= i_5;
                if (aTransform_Sub1_3391.boundingBoxPolygons[i_6].method12594(aClass284_3393.anInt3387 + i_2, i_3 + aClass284_3393.anInt3385) && aTransform_Sub1_3391.method12983(graphicalrenderer_1, i_2, i_3)) {
                    aTransform_Sub1_3391.boundingBoxPolygons[i_6].anInt7851 >>= i_5;
                    return true;
                }
                aTransform_Sub1_3391.boundingBoxPolygons[i_6].anInt7851 >>= i_5;
            }
        }
        return false;
    }
}
