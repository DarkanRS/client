package com.jagex;

import java.awt.*;

public enum ModeWhere {

    LIVE("LIVE", 0),
    BUILD_LIVE("BUILDLIVE", 3),
    RC("RC", 1),
    WIP("WIP", 2),
    INT_BETA("INTBETA", 4);

    public final String name;
    public final int id;

    ModeWhere(String string_1, int i_2) {
        name = string_1;
        id = i_2;
    }

    public static Frame method7852(Class470 class470_0, int i_1, int i_2, int i_3) {
        int i_31 = i_3;
        if (i_31 == 0) {
            Class467[] arr_6 = Class386.method6671(class470_0);
            if (arr_6 == null) {
                return null;
            }

            boolean bool_7 = false;

            for (int i_8 = 0; i_8 < arr_6.length; i_8++) {
                if (arr_6[i_8].anInt5571 == i_1 && i_2 == arr_6[i_8].anInt5574 && (!bool_7 || arr_6[i_8].anInt5573 > 0)) {
                    i_31 = arr_6[i_8].anInt5573;
                    bool_7 = true;
                }
            }

            if (!bool_7) {
                return null;
            }
        }

        Frame frame_9 = new Frame("Jagex Full Screen");
        frame_9.setResizable(false);
        class470_0.method7808(frame_9, i_1, i_2, i_31, 0);
        return frame_9;
    }

    static byte method7853(int i_0, int i_1) {
        return (byte) (i_0 != ObjectType.WALL_INTERACT.type ? 0 : ((i_1 & 0x1) == 0 ? 1 : 2));
    }

}
