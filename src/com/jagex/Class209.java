package com.jagex;

import java.io.IOException;
import java.util.Date;

public abstract class Class209 {

    public abstract int method3564();

    public abstract boolean leftButtonDown();

    public abstract boolean rightButtonDown();

    public abstract boolean middleButtonDown();

    public boolean method3568() {
        return this.leftButtonDown() || this.rightButtonDown() || this.middleButtonDown();
    }

    public abstract int getMouseX();

    public abstract int getMouseY();

    public abstract MouseRecord nextSubmission(byte var1);

    public abstract int method3573();

    public abstract void method3578();

    public abstract boolean method3579();

    public abstract boolean method3580();

    public abstract void method3581();

    public abstract boolean method3582();

    public abstract boolean method3583();

    public abstract void method3584();

    public abstract int method3585();

    public abstract MouseRecord method3588();

    public abstract void method3589();

    public abstract MouseRecord method3590();

    public abstract MouseRecord method3591();

    public abstract MouseRecord method3592();

    public abstract boolean method3593();

    public abstract void method3594();

    public abstract void method3595();

    public static void printConsoleMessage(String string_0) {
        if (Class13.aStringArray129 == null) {
            FontRenderer.method402(1696819544);
        }
        client.aCalendar7278.setTime(new Date(Utils.time()));
        int i_2 = client.aCalendar7278.get(11);
        int i_3 = client.aCalendar7278.get(12);
        int i_4 = client.aCalendar7278.get(13);
        String string_5 = Integer.toString(i_2 / 10) + i_2 % 10 + ":" + i_3 / 10 + i_3 % 10 + ":" + i_4 / 10 + i_4 % 10;
        String[] arr_6 = MovingAnimation.method12681(string_0, '\n');
        for (int i_7 = 0; i_7 < arr_6.length; i_7++) {
            for (int i_8 = Class179.anInt2227; i_8 > 0; --i_8) {
                Class13.aStringArray129[i_8] = Class13.aStringArray129[i_8 - 1];
            }
            Class13.aStringArray129[0] = string_5 + ": " + arr_6[i_7];
            if (TextureDefinition.aFileOutputStream9481 != null) {
                try {
                    TextureDefinition.aFileOutputStream9481.write(LinkedNodeList.method7885(Class13.aStringArray129[0] + "\n", (byte) -108));
                } catch (IOException ioexception_10) {
                }
            }
            if (Class179.anInt2227 < Class13.aStringArray129.length - 1) {
                ++Class179.anInt2227;
                if (Class179.anInt2223 > 0) {
                    ++Class179.anInt2223;
                }
            }
        }
    }

    public static boolean method3600(byte b_0) {
        int i_2 = b_0 & 0xff;
        return i_2 != 0 && (i_2 < 128 || i_2 >= 160 || Class490.aCharArray5766[i_2 - 128] != 0);
    }
}
