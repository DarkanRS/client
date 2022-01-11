package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.jagex.clans.settings.ChangeClanSetting;

public class Class158_Sub1_Sub2 extends Class158_Sub1 {

    static int UPDATE_ZONE_Y;
    Class192 aClass192_10126;
    int anInt10129;
    int anInt10128;
    Class125 aClass125_10127;
    JavaRenderer aGraphicalRenderer_Sub3_10130;

    Class158_Sub1_Sub2(JavaRenderer hardwarerenderer_1) {
        aGraphicalRenderer_Sub3_10130 = hardwarerenderer_1;
    }

    public static void method15535(int i_0, String string_1, Color color_2, Color color_3, Color color_4) {
        Color color_21 = color_2;
        Color color_31 = color_3;
        Color color_41 = color_4;
        try {
            Graphics graphics_6 = Class351.gameCanvas.getGraphics();
            if (SpotAnimIndexLoader.aFont5893 == null) {
                SpotAnimIndexLoader.aFont5893 = new Font("Helvetica", Font.BOLD, 13);
            }

            if (color_21 == null) {
                color_21 = new Color(140, 17, 17);
            }

            if (color_31 == null) {
                color_31 = new Color(140, 17, 17);
            }

            if (color_41 == null) {
                color_41 = new Color(255, 255, 255);
            }

            int i_8;
            int i_9;
            try {
                if (OutputStream_Sub1.anImage7953 == null) {
                    OutputStream_Sub1.anImage7953 = Class351.gameCanvas.createImage(ChangeClanSetting.BASE_WINDOW_WIDTH, Engine.BASE_WINDOW_HEIGHT * -969250379);
                }

                Graphics graphics_7 = OutputStream_Sub1.anImage7953.getGraphics();
                graphics_7.setColor(Color.black);
                graphics_7.fillRect(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH, Engine.BASE_WINDOW_HEIGHT * -969250379);
                i_8 = ChangeClanSetting.BASE_WINDOW_WIDTH / 2 - 152;
                i_9 = Engine.BASE_WINDOW_HEIGHT * -969250379 / 2 - 18;
                graphics_7.setColor(color_31);
                graphics_7.drawRect(i_8, i_9, 303, 33);
                graphics_7.setColor(color_21);
                graphics_7.fillRect(i_8 + 2, i_9 + 2, i_0 * 3, 30);
                graphics_7.setColor(Color.black);
                graphics_7.drawRect(i_8 + 1, i_9 + 1, 301, 31);
                graphics_7.fillRect(i_8 + i_0 * 3 + 2, i_9 + 2, 300 - i_0 * 3, 30);
                graphics_7.setFont(SpotAnimIndexLoader.aFont5893);
                graphics_7.setColor(color_41);
                graphics_7.drawString(string_1, i_8 + (304 - string_1.length() * 6) / 2, i_9 + 22);
                if (Engine.aString3252 != null) {
                    graphics_7.setFont(SpotAnimIndexLoader.aFont5893);
                    graphics_7.setColor(color_41);
                    graphics_7.drawString(Engine.aString3252, ChangeClanSetting.BASE_WINDOW_WIDTH / 2 - Engine.aString3252.length() * 6 / 2, Engine.BASE_WINDOW_HEIGHT * -969250379 / 2 - 26);
                }

                graphics_6.drawImage(OutputStream_Sub1.anImage7953, 0, 0, null);
            } catch (Exception exception_10) {
                graphics_6.setColor(Color.black);
                graphics_6.fillRect(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH, Engine.BASE_WINDOW_HEIGHT * -969250379);
                i_8 = ChangeClanSetting.BASE_WINDOW_WIDTH / 2 - 152;
                i_9 = Engine.BASE_WINDOW_HEIGHT * -969250379 / 2 - 18;
                graphics_6.setColor(color_31);
                graphics_6.drawRect(i_8, i_9, 303, 33);
                graphics_6.setColor(color_21);
                graphics_6.fillRect(i_8 + 2, i_9 + 2, i_0 * 3, 30);
                graphics_6.setColor(Color.black);
                graphics_6.drawRect(i_8 + 1, i_9 + 1, 301, 31);
                graphics_6.fillRect(i_8 + i_0 * 3 + 2, i_9 + 2, 300 - i_0 * 3, 30);
                graphics_6.setFont(SpotAnimIndexLoader.aFont5893);
                graphics_6.setColor(color_41);
                if (Engine.aString3252 != null) {
                    graphics_6.setFont(SpotAnimIndexLoader.aFont5893);
                    graphics_6.setColor(color_41);
                    graphics_6.drawString(Engine.aString3252, ChangeClanSetting.BASE_WINDOW_WIDTH / 2 - Engine.aString3252.length() * 6 / 2, Engine.BASE_WINDOW_HEIGHT * -969250379 / 2 - 26);
                }

                graphics_6.drawString(string_1, i_8 + (304 - string_1.length() * 6) / 2, i_9 + 22);
            }
        } catch (Exception exception_11) {
            Class351.gameCanvas.repaint();
        }

    }

    public static void method15536() {
        for (VorbisNode class282_sub37_1 = (VorbisNode) Class492.INDEX36_FILE_CACHE.method7750(); class282_sub37_1 != null; class282_sub37_1 = (VorbisNode) Class492.INDEX36_FILE_CACHE.method7751()) {
            if (class282_sub37_1.vfReference.method4921()) {
                CutsceneObject.method1563(class282_sub37_1.fileId);
            } else {
                class282_sub37_1.vfReference.method13447();

                try {
                    class282_sub37_1.vfReference.method4932();
                } catch (Exception exception_4) {
                    Class151.method2594("" + class282_sub37_1.fileId, exception_4);
                    CutsceneObject.method1563(class282_sub37_1.fileId);
                }

                if (!class282_sub37_1.aBool8000 && !class282_sub37_1.aBool7995) {
                    Node_Sub41_Sub4 class282_sub41_sub4_2 = class282_sub37_1.vfReference.method4914();
                    if (class282_sub41_sub4_2 != null) {
                        Node_Sub15_Sub1 class282_sub15_sub1_3 = class282_sub41_sub4_2.method14845();
                        if (class282_sub15_sub1_3 != null) {
                            class282_sub15_sub1_3.method14820(class282_sub37_1.anInt7997);
                            Class79.aNode_Sub15_Sub4_783.method15275(class282_sub15_sub1_3);
                            class282_sub37_1.aBool8000 = true;
                        }
                    }
                }
            }
        }

    }

    @Override
    public int method2719() {
        return 1324847185 * anInt10129 * -1045710671;
    }

    @Override
    public int method2714() {
        return anInt10129;
    }

    @Override
    public int method2720() {
        return 1324847185 * anInt10129 * -1045710671;
    }

    @Override
    public void method13759(int i_1, Interface9 interface9_2) {
        if (i_1 != 0) {
            throw new RuntimeException();
        } else {
            Class192 class192_3 = (Class192) interface9_2;
            if (aClass125_10127 != null && class192_3 != null && (aClass125_10127.anInt1568 != class192_3.anInt2388 || aClass125_10127.anInt1569 != class192_3.anInt2389)) {
                throw new RuntimeException();
            } else {
                aClass192_10126 = class192_3;
                if (class192_3 != null) {
                    anInt10129 = class192_3.anInt2388;
                    anInt10128 = class192_3.anInt2389;
                } else if (aClass125_10127 == null) {
                    anInt10129 = 0;
                    anInt10128 = 0;
                }

                if (this == aGraphicalRenderer_Sub3_10130.method8523()) {
                    method213();
                }

            }
        }
    }

    @Override
    public void method13765(Interface8 interface8_1) {
        Class125 class125_2 = (Class125) interface8_1;
        if (aClass192_10126 != null && class125_2 != null && (aClass192_10126.anInt2388 != class125_2.anInt1568 || aClass192_10126.anInt2389 != class125_2.anInt1569)) {
            throw new RuntimeException();
        } else {
            aClass125_10127 = class125_2;
            if (class125_2 != null) {
                anInt10129 = class125_2.anInt1568;
                anInt10128 = class125_2.anInt1569;
            } else if (aClass192_10126 == null) {
                anInt10129 = 0;
                anInt10128 = 0;
            }

            if (this == aGraphicalRenderer_Sub3_10130.method8523()) {
                method213();
            }

        }
    }

    @Override
    public boolean method13764() {
        return true;
    }

    @Override
    public int method2716() {
        return anInt10128;
    }

    @Override
    boolean method2717() {
        return true;
    }

    @Override
    boolean method2718() {
        return true;
    }

    @Override
    public int method2726() {
        return 1324847185 * anInt10129 * -1045710671;
    }

    @Override
    boolean method213() {
        aGraphicalRenderer_Sub3_10130.method14376(anInt10129, anInt10128, aClass192_10126 == null ? null : aClass192_10126.anIntArray2390, aClass125_10127 == null ? null : aClass125_10127.aFloatArray1570);
        return true;
    }

    @Override
    public void method212() {
    }

    @Override
    public void method186() {
    }

    @Override
    boolean method2725() {
        return true;
    }

    @Override
    boolean method211() {
        aGraphicalRenderer_Sub3_10130.method14376(1324847185 * anInt10129 * -1045710671, 1050215059 * anInt10128 * -1432851557, aClass192_10126 == null ? null : aClass192_10126.anIntArray2390, aClass125_10127 == null ? null : aClass125_10127.aFloatArray1570);
        return true;
    }

    @Override
    boolean method54() {
        aGraphicalRenderer_Sub3_10130.method14376(1324847185 * anInt10129 * -1045710671, 1050215059 * anInt10128 * -1432851557, aClass192_10126 == null ? null : aClass192_10126.anIntArray2390, aClass125_10127 == null ? null : aClass125_10127.aFloatArray1570);
        return true;
    }

    @Override
    boolean method2723() {
        return true;
    }

    @Override
    boolean method2715() {
        return true;
    }

    @Override
    boolean method2724() {
        return true;
    }

    @Override
    boolean method2722() {
        return true;
    }

    @Override
    public int method2721() {
        return 1050215059 * anInt10128 * -1432851557;
    }

    @Override
    public int method2727() {
        return 1050215059 * anInt10128 * -1432851557;
    }

}
