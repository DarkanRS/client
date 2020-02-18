package com.jagex;

import java.io.IOException;

public class Class277 {

    int anInt3349;

    int anInt3348;

    int anInt3351;

    int anInt3350;

    int anInt3347;

    Class277(int i_2, int i_3, int i_4, int i_5) {
        anInt3349 = i_2;
        anInt3348 = i_3;
        anInt3351 = i_4;
        anInt3350 = i_5;
        anInt3347 = anInt3350 - anInt3351;
    }

    public static int method4906(int i_0, int i_1) {
        int i_3;
        for (i_3 = 1; i_1 > 1; i_1 >>= 1) {
            if ((i_1 & 0x1) != 0) {
                i_3 = i_0 * i_3;
            }
            i_0 *= i_0;
        }
        if (i_1 == 1) {
            return i_0 * i_3;
        } else {
            return i_3;
        }
    }

    static void method4907() {
        if (TextureDefinition.aFileOutputStream9481 != null) {
            try {
                TextureDefinition.aFileOutputStream9481.close();
            } catch (IOException ignored) {
            }
        }
        TextureDefinition.aFileOutputStream9481 = null;
    }

    static void method4908(AbstractRenderer graphicalrenderer_0) {
        int i_2 = -10660793;
        VarDefinitionLoader.method6394(graphicalrenderer_0, Class301.anInt3555, BufferedConnectionContext.anInt2300, Class158_Sub2.anInt8975, Class110.anInt1104, i_2);
        Class285.aFontRenderer_3394.renderText(LocalizedText.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE), Class301.anInt3555 + 3, BufferedConnectionContext.anInt2300 + 14, i_2, -1);
        int i_3 = Class163.mouseRecorder.getMouseX();
        int i_4 = Class163.mouseRecorder.getMouseY();
        int i_5;
        CacheableNode_Sub7 class282_sub50_sub7_6;
        int i_7;
        if (!Class20.aBool162) {
            i_5 = 0;
            for (class282_sub50_sub7_6 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (CacheableNode_Sub7) Class20.aClass482_171.next()) {
                i_7 = (Class20.anInt169 - 1 - i_5) * Class20.anInt178 + BufferedConnectionContext.anInt2300 + 31;
                Node_Sub25.method12400(i_3, i_4, Class301.anInt3555, Class158_Sub2.anInt8975, i_7, class282_sub50_sub7_6, Class285.aFontRenderer_3394, SkyboxIndexLoader.aClass414_3438, -1, -256);
                ++i_5;
            }
        } else {
            i_5 = 0;
            for (CacheableNode_Sub15 class282_sub50_sub15_8 = (CacheableNode_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_8 != null; class282_sub50_sub15_8 = (CacheableNode_Sub15) Class20.aClass477_182.method7955()) {
                i_7 = i_5 * Class20.anInt178 + BufferedConnectionContext.anInt2300 + 31;
                if (class282_sub50_sub15_8.anInt9769 == 1) {
                    Node_Sub25.method12400(i_3, i_4, Class301.anInt3555, Class158_Sub2.anInt8975, i_7, (CacheableNode_Sub7) class282_sub50_sub15_8.aClass477_9770.aCacheableNode_5629.aCacheableNode_8119, Class285.aFontRenderer_3394, SkyboxIndexLoader.aClass414_3438, -1, -256);
                } else {
                    Class99.method1630(i_3, i_4, Class301.anInt3555, Class158_Sub2.anInt8975, i_7, class282_sub50_sub15_8, Class285.aFontRenderer_3394, SkyboxIndexLoader.aClass414_3438, -1, -256);
                }
                ++i_5;
            }
            if (Class20.aCacheableNode_Sub15_163 != null) {
                VarDefinitionLoader.method6394(graphicalrenderer_0, Class341.anInt3996, CacheableNode_Sub2.anInt9471, ObjectAnimationCutsceneAction.anInt8518, GraphNode_Sub1_Sub5_Sub1.anInt10526, i_2);
                Class285.aFontRenderer_3394.renderText(Class20.aCacheableNode_Sub15_163.aString9771, Class341.anInt3996 + 3, CacheableNode_Sub2.anInt9471 + 14, i_2, -1);
                i_5 = 0;
                for (class282_sub50_sub7_6 = (CacheableNode_Sub7) Class20.aCacheableNode_Sub15_163.aClass477_9770.method7941(); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (CacheableNode_Sub7) Class20.aCacheableNode_Sub15_163.aClass477_9770.method7955()) {
                    i_7 = i_5 * Class20.anInt178 + CacheableNode_Sub2.anInt9471 + 31;
                    Node_Sub25.method12400(i_3, i_4, Class341.anInt3996, ObjectAnimationCutsceneAction.anInt8518, i_7, class282_sub50_sub7_6, Class285.aFontRenderer_3394, SkyboxIndexLoader.aClass414_3438, -1, -256);
                    ++i_5;
                }
            }
        }
    }
}
