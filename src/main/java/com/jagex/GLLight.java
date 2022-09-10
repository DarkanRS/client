package com.jagex;

import com.jagex.clans.ClanChannel;

public class GLLight extends Node {

    public Vector3 position = new Vector3();
    int anInt7684;
    int anInt7685;
    float aFloat7686;

    GLLight(int i_1, int i_2, int i_3, int i_4, int i_5) {
        position.set(i_1, i_2, i_3);
        anInt7684 = i_4;
        anInt7685 = i_5;
        aFloat7686 = (float) 1.0;
    }

    public static void method12399(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (i_0 >= Class532_Sub2_Sub1.anInt7071 && i_0 <= Class532_Sub2_Sub1.anInt7069 && i_2 >= Class532_Sub2_Sub1.anInt7071 && i_2 <= Class532_Sub2_Sub1.anInt7069 && i_4 >= Class532_Sub2_Sub1.anInt7071 && i_4 <= Class532_Sub2_Sub1.anInt7069 && i_6 >= Class532_Sub2_Sub1.anInt7071 && i_6 <= Class532_Sub2_Sub1.anInt7069 && i_1 >= Class532_Sub2_Sub1.anInt7070 && i_1 <= Class532_Sub2_Sub1.anInt7068 && i_3 >= Class532_Sub2_Sub1.anInt7070 && i_3 <= Class532_Sub2_Sub1.anInt7068 && i_5 >= Class532_Sub2_Sub1.anInt7070 && i_5 <= Class532_Sub2_Sub1.anInt7068 && i_7 >= Class532_Sub2_Sub1.anInt7070 && i_7 <= Class532_Sub2_Sub1.anInt7068) {
            ClanChannel.method12117(i_0, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
        } else {
            Engine.method4779(i_0, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
        }

    }

    public int getX() {
        return (int) position.x;
    }

    public int getY() {
        return (int) position.y;
    }

    public int method12370() {
        return anInt7684;
    }

    public int getColor() {
        return anInt7685;
    }

    public void method12373(float f_1) {
        aFloat7686 = f_1;
    }

    public void method12374(int i_1, int i_2, int i_3) {
        position.set(i_1, i_2, i_3);
    }

    public int getZ() {
        return (int) position.z;
    }

    public float getIntensity() {
        return aFloat7686;
    }

}
