package com.jagex;

public class AnimationFrameBase extends Node {

    int id;
    int count;
    int[] transformationTypes;
    int[][] labels;
    boolean[] aBoolArray7563;
    int[] anIntArray7561;

    AnimationFrameBase(int id, byte[] bytes_2) {
        this.id = id;
        ByteBuf rsbytebuffer_3 = new ByteBuf(bytes_2);
        count = rsbytebuffer_3.readUnsignedByte();
        transformationTypes = new int[count];
        labels = new int[count][];
        aBoolArray7563 = new boolean[count];
        anIntArray7561 = new int[count];

        int i_4;
        for (i_4 = 0; i_4 < count; i_4++) {
            transformationTypes[i_4] = rsbytebuffer_3.readUnsignedByte();
            if (transformationTypes[i_4] == 6) {
                transformationTypes[i_4] = 2;
            }
        }

        for (i_4 = 0; i_4 < count; i_4++) {
            aBoolArray7563[i_4] = rsbytebuffer_3.readUnsignedByte() == 1;
        }

        for (i_4 = 0; i_4 < count; i_4++) {
            anIntArray7561[i_4] = rsbytebuffer_3.readUnsignedShort();
        }

        for (i_4 = 0; i_4 < count; i_4++) {
            labels[i_4] = new int[rsbytebuffer_3.readUnsignedByte()];
        }

        for (i_4 = 0; i_4 < count; i_4++) {
            for (int i_5 = 0; i_5 < labels[i_4].length; i_5++) {
                labels[i_4][i_5] = rsbytebuffer_3.readUnsignedByte();
            }
        }

    }

    static void method12212(CacheableNode_Sub15 class282_sub50_sub15_0, int i_1) {
        if (Class20.aBool161) {
            FontMetrics fontmetrics_3 = ShaderLoader.method1887();
            int i_4 = 0;

            int i_6;
            for (CacheableNode_Sub7 class282_sub50_sub7_5 = (CacheableNode_Sub7) class282_sub50_sub15_0.aClass477_9770.method7941(); class282_sub50_sub7_5 != null; class282_sub50_sub7_5 = (CacheableNode_Sub7) class282_sub50_sub15_0.aClass477_9770.method7955()) {
                i_6 = Shadow.method15507(class282_sub50_sub7_5, fontmetrics_3);
                if (i_6 > i_4) {
                    i_4 = i_6;
                }
            }

            i_4 += 8;
            int i_9 = class282_sub50_sub15_0.anInt9769 * Class20.anInt178 + 21;
            WallObjectGraphNode.anInt10526 = (Class20.aBool187 ? 26 : 22) + Class20.anInt178 * class282_sub50_sub15_0.anInt9769;
            i_6 = Class301.anInt3555 + Class158_Sub2.anInt8975;
            if (i_4 + i_6 > Class349.BASE_WINDOW_WIDTH) {
                i_6 = Class301.anInt3555 - i_4;
            }

            if (i_6 < 0) {
                i_6 = 0;
            }

            int i_7 = Class20.aBool187 ? fontmetrics_3.topPadding + 1 + 20 : 31;
            int i_8 = i_1 - i_7 + fontmetrics_3.topPadding + 1;
            if (i_9 + i_8 > Engine.BASE_WINDOW_HEIGHT * -969250379) {
                i_8 = Engine.BASE_WINDOW_HEIGHT * -969250379 - i_9;
            }

            if (i_8 < 0) {
                i_8 = 0;
            }

            Class341.anInt3996 = i_6;
            CacheableNode_Sub2.anInt9471 = i_8;
            ObjectAnimationCutsceneAction.anInt8518 = i_4;
            Class20.aCacheableNode_Sub15_163 = class282_sub50_sub15_0;
        }

    }

}
