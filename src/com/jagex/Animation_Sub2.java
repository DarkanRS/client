package com.jagex;

public class Animation_Sub2 extends Animation {

    Transform_Sub1 aTransform_Sub1_7890;

    void method7586(AnimationDefinitions animationdefinitions_1, int i_2, int i_3) {
        World.method3662(animationdefinitions_1, i_2, this.aTransform_Sub1_7890);
    }

    Animation_Sub2(Transform_Sub1 class521_sub1_1) {
        super(false);
        this.aTransform_Sub1_7890 = class521_sub1_1;
    }

    static void method12680(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5, FontRenderer fontrenderer_6, FontMetrics fontmetrics_7, String string_8) {
        int i_10 = 255 - Class301.anInt3556 - Class20.anInt156;
        if (i_10 < 0) {
            i_10 = 0;
        }

        if (Class467.aNativeSprite_5576 == null || ClanSettings.aNativeSprite_647 == null) {
            if (IndexLoaders.SPRITES_INDEX.loadFile(ConnectionInfo.anInt5438) && IndexLoaders.SPRITES_INDEX.loadFile(Class373.anInt4350)) {
                Class467.aNativeSprite_5576 = graphicalrenderer_0.method8444(SpriteDefinitions.getSprite(IndexLoaders.SPRITES_INDEX, ConnectionInfo.anInt5438, 0), true);
                SpriteDefinitions class91_13 = SpriteDefinitions.getSprite(IndexLoaders.SPRITES_INDEX, Class373.anInt4350, 0);
                ClanSettings.aNativeSprite_647 = graphicalrenderer_0.method8444(class91_13, true);
                class91_13.method1525();
                Class60.aNativeSprite_612 = graphicalrenderer_0.method8444(class91_13, true);
            } else {
                graphicalrenderer_0.B(i_1, i_2, i_3, i_5, i_10 << 24 | Node_Sub20_Sub9.anInt9792, 1);
            }
        }

        if (Class467.aNativeSprite_5576 != null && ClanSettings.aNativeSprite_647 != null) {
            int i_11 = (i_3 - ClanSettings.aNativeSprite_647.method2747() * 2) / Class467.aNativeSprite_5576.method2747();

            for (int i_12 = 0; i_12 < i_11; i_12++) {
                Class467.aNativeSprite_5576.method2752(i_1 + ClanSettings.aNativeSprite_647.method2747() + i_12 * Class467.aNativeSprite_5576.method2747(), i_2);
            }

            ClanSettings.aNativeSprite_647.method2752(i_1, i_2);
            Class60.aNativeSprite_612.method2752(i_3 + i_1 - Class60.aNativeSprite_612.method2747(), i_2);
        }

        fontrenderer_6.renderText(string_8, i_1 + 3, (20 - fontmetrics_7.topPadding) / 2 + i_2 + fontmetrics_7.topPadding, Class388.anInt4722 | ~0xffffff, -1);
        graphicalrenderer_0.B(i_1, i_5 + i_2, i_3, i_4 - i_5, i_10 << 24 | Node_Sub20_Sub9.anInt9792, 1);
    }

}
