package com.jagex;

import com.jagex.clans.settings.ChangeClanSetting;

public class ObjectNode extends Node<Object> {

    public Object anObject8068;

    public ObjectNode(Object object_1) {
        anObject8068 = object_1;
    }

    static void method13409(AbstractRenderer graphicalrenderer_0) {
        graphicalrenderer_0.r(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH, 350);
        graphicalrenderer_0.B(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH, 350, Class179.anInt2221 << 24 | 0x332277, 1);
        int i_2 = 350 / Class179.anInt2222;
        int i_3;
        if (Class179.anInt2227 > 0) {
            i_3 = 346 - Class179.anInt2222 - 4;
            int i_4 = i_2 * i_3 / (i_2 + Class179.anInt2227 - 1);
            int i_5 = 4;
            if (Class179.anInt2227 > 1) {
                i_5 += (i_3 - i_4) * (Class179.anInt2227 - 1 - Class179.anInt2223) / (Class179.anInt2227 - 1);
            }
            graphicalrenderer_0.B(ChangeClanSetting.BASE_WINDOW_WIDTH - 16, i_5, 12, i_4, Class179.anInt2221 << 24 | 0x332277, 2);
            for (int i_6 = Class179.anInt2223; i_6 < i_2 + Class179.anInt2223 && i_6 < Class179.anInt2227; i_6++) {
                String[] arr_7 = MovingAnimation.split(Class13.aStringArray129[i_6], '\b');
                int i_8 = (ChangeClanSetting.BASE_WINDOW_WIDTH - 8 - 16) / arr_7.length;
                for (int i_9 = 0; i_9 < arr_7.length; i_9++) {
                    int i_10 = i_9 * i_8 + 8;
                    graphicalrenderer_0.r(i_10, 0, i_8 + i_10 - 8, 350);
                    Class16.aFontRenderer_144.renderText(GameTipsLoader.method6793(arr_7[i_9]), i_10, 350 - Class179.anInt2230 - 2 - Class16.aClass414_139.bottomPadding - (i_6 - Class179.anInt2223) * Class179.anInt2222, -1, -16777216);
                }
            }
        }
        Renderers.FONT_RENDERER.drawText("727 1", ChangeClanSetting.BASE_WINDOW_WIDTH - 25, 330, -1, -16777216);
        graphicalrenderer_0.r(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH, 350);
        graphicalrenderer_0.method8659(0, 350 - Class179.anInt2230, ChangeClanSetting.BASE_WINDOW_WIDTH, -1);
        Class285.aFontRenderer_3394.renderText("--> " + GameTipsLoader.method6793(Class179.aString2225), 10, 350 - SkyboxIndexLoader.aClass414_3438.bottomPadding - 1, -1, -16777216);
        if (IFSubObjectPosition.appletHasFocus) {
            i_3 = -1;
            if (client.CYCLES_20MS % 30 > 15) {
                i_3 = 16777215;
            }
            graphicalrenderer_0.method8428(10 + SkyboxIndexLoader.aClass414_3438.getWidthNoSprites("--> " + GameTipsLoader.method6793(Class179.aString2225).substring(0, Class179.anInt2220)), 350 - SkyboxIndexLoader.aClass414_3438.bottomPadding - 11, 12, i_3);
        }
        graphicalrenderer_0.L();
        Class18.method574();
    }
}
