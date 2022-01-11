package com.jagex;

import java.awt.Point;
import java.util.Queue;

import com.jagex.clans.settings.ChangeClanSetting;

public class Class373 {

    public static int anInt4350;

    Class373() throws Throwable {
        throw new Error();
    }

    static void method6365() {
        Queue<MouseRecord_Sub1> queue_1 = Class236.aQueue2914;
        synchronized (Class236.aQueue2914) {
            Point point_2;
            if (Class351.gameCanvas.isShowing()) {
                point_2 = Class351.gameCanvas.getLocationOnScreen();
            } else {
                point_2 = null;
            }
            while (true) {
                while (true) {
                    MouseRecord_Sub1 class282_sub53_sub1_3 = Class236.aQueue2914.poll();
                    if (class282_sub53_sub1_3 == null) {
                        return;
                    }
                    if (point_2 != null && Class351.gameCanvas.isShowing() && IFSubObjectPosition.appletHasFocus) {
                        class282_sub53_sub1_3.method14732(point_2);
                        if (!class282_sub53_sub1_3.method14731() && class282_sub53_sub1_3.getX() < ChangeClanSetting.BASE_WINDOW_WIDTH && class282_sub53_sub1_3.getY() < Engine.BASE_WINDOW_HEIGHT * -969250379 && class282_sub53_sub1_3.getX() >= 0 && class282_sub53_sub1_3.getY() >= 0) {
                            int i_4 = class282_sub53_sub1_3.getClickType();
                            if (class282_sub53_sub1_3.getClickType() == -1) {
                                Class236.aClass534_Sub1_2913.method11410(class282_sub53_sub1_3);
                            } else if (Class298.method5304(i_4)) {
                                Class236.aClass534_Sub1_2913.method12809(class282_sub53_sub1_3);
                            }
                        }
                    } else {
                        class282_sub53_sub1_3.cache();
                    }
                }
            }
        }
    }
}
