package com.jagex;

import java.awt.*;

public final class Class241 {

    Class241() throws Throwable {
        throw new Error();
    }

    public static int getCPUProfile() {
        Canvas canvas_1 = new Canvas();
        canvas_1.setSize(100, 100);
        GraphicalRenderer graphicalrenderer_2 = Class320.createRenderer(0, canvas_1, null, null, 0, -2017555063);
        long long_3 = Utils.time();
        int i_5;
        for (i_5 = 0; i_5 < 10000; i_5++) {
            graphicalrenderer_2.method8658();
        }
        i_5 = (int) (Utils.time() - long_3);
        graphicalrenderer_2.method8425(0, 0, 100, 100, -16777216, (byte) -29);
        graphicalrenderer_2.method8396();
        return i_5;
    }

    static final int method4151(int i_0, int i_1) {
        int i_3 = Class260.method4632(i_0 - 1, i_1 - 1, -560937725) + Class260.method4632(1 + i_0, i_1 - 1, -402539305) + Class260.method4632(i_0 - 1, 1 + i_1, -1473619628) + Class260.method4632(i_0 + 1, 1 + i_1, -1104539338);
        int i_4 = Class260.method4632(i_0 - 1, i_1, -1635186787) + Class260.method4632(1 + i_0, i_1, -482415462) + Class260.method4632(i_0, i_1 - 1, -455733899) + Class260.method4632(i_0, i_1 + 1, -1506173110);
        int i_5 = Class260.method4632(i_0, i_1, -145642612);
        return i_3 / 16 + i_4 / 8 + i_5 / 4;
    }

    static void method4152(IComponentDefinitions icomponentdefinitions_0, Class455 class455_1, int i_2, int i_3, int i_4, int i_5, int i_6, String string_7, FontRenderer fontrenderer_8, FontMetrics fontmetrics_9, int i_10) {
        int i_12;
        if (NativeLibraryLoader.anInt3240 == 4) {
            i_12 = (int) client.camAngleY & 0x3fff;
        } else {
            i_12 = (int) client.camAngleY + client.anInt7255 & 0x3fff;
        }
        int i_13 = Math.max(icomponentdefinitions_0.width / 2, icomponentdefinitions_0.height / 2) + 10;
        int i_14 = i_5 * i_5 + i_4 * i_4;
        if (i_14 <= i_13 * i_13) {
            int i_15 = Class382.SINE[i_12];
            int i_16 = Class382.COSINE[i_12];
            if (NativeLibraryLoader.anInt3240 != 4) {
                i_15 = i_15 * 256 / (client.anInt7203 + 256);
                i_16 = i_16 * 256 / (client.anInt7203 + 256);
            }
            int i_17 = i_16 * i_4 + i_5 * i_15 >> 14;
            int i_18 = i_5 * i_16 - i_15 * i_4 >> 14;
            int i_19 = fontmetrics_9.method6951(string_7, 100, null, (byte) 100);
            int i_20 = fontmetrics_9.method6972(string_7, 100, 0, null, 2039884820);
            i_17 -= i_19 / 2;
            if (i_17 >= -icomponentdefinitions_0.width && i_17 <= icomponentdefinitions_0.width && i_18 >= -icomponentdefinitions_0.height && i_18 <= icomponentdefinitions_0.height) {
                fontrenderer_8.method378(string_7, i_17 + icomponentdefinitions_0.width / 2 + i_2, i_3 + icomponentdefinitions_0.height / 2 - i_18 - i_6 - i_20, i_19, 50, i_10, 0, 1, 0, 0, null, null, class455_1, i_2, i_3, (byte) 123);
            }
        }
    }
}
