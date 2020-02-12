package com.jagex;

import java.awt.*;

public class Class292 {

    Class292() throws Throwable {
        throw new Error();
    }

    static final void method5201(int i_0, int i_1, int i_2, int i_3) {
        for (int i_5 = 0; i_5 < client.anInt7407; i_5++) {
            Rectangle rectangle_6 = client.aRectangleArray7411[i_5];
            if (rectangle_6.x + rectangle_6.width > i_0 && rectangle_6.x < i_0 + i_2 && rectangle_6.height + rectangle_6.y > i_1 && rectangle_6.y < i_3 + i_1) {
                client.aBoolArray7443[i_5] = true;
            }
        }
    }
}
