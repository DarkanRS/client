package com.jagex;

import java.awt.*;

public class Class320 {

    public static Class253 aClass253_3723;
    public static int[] VARC_INT;
    static Node_Sub25 aNode_Sub25_3719 = new Node_Sub25(0, 0);
    public boolean aBool3722;
    Node_Sub25[] aNode_Sub25Array3720;
    int[][] anIntArrayArray3717;
    LinkedNodeList aClass473_3721 = new LinkedNodeList();
    int anInt3714;
    int anInt3718 = -1;
    int anInt3715;
    int anInt3716;

    Class320(int i_1, int i_2, int i_3) {
        anInt3715 = i_2;
        anInt3716 = i_1;
        anIntArrayArray3717 = new int[anInt3716][i_3];
        aNode_Sub25Array3720 = new Node_Sub25[anInt3715];
    }

    public static void method5731(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        Class42.playSoundSong(i_5, i_6, 100);
        Class260.aClass277_3234 = new Class277(i_1 << 9, i_2 << 9, i_3 << 8, i_4 * 8);
    }

    void clear() {
        for (int i_2 = 0; i_2 < anInt3716; i_2++) {
            anIntArrayArray3717[i_2] = null;
        }
        aNode_Sub25Array3720 = null;
        anIntArrayArray3717 = null;
        aClass473_3721.clear();
        aClass473_3721 = null;
    }

    public int[] method5721(int i_1) {
        if (anInt3715 != anInt3716) {
            if (anInt3716 != 1) {
                Node_Sub25 class282_sub25_3 = aNode_Sub25Array3720[i_1];
                if (class282_sub25_3 == null) {
                    aBool3722 = true;
                    if (anInt3714 >= anInt3716) {
                        Node_Sub25 class282_sub25_4 = (Node_Sub25) aClass473_3721.getNext();
                        class282_sub25_3 = new Node_Sub25(i_1, class282_sub25_4.anInt7689);
                        aNode_Sub25Array3720[class282_sub25_4.anInt7688] = null;
                        class282_sub25_4.unlink();
                    } else {
                        class282_sub25_3 = new Node_Sub25(i_1, anInt3714);
                        ++anInt3714;
                    }
                    aNode_Sub25Array3720[i_1] = class282_sub25_3;
                } else {
                    aBool3722 = false;
                }
                aClass473_3721.insertFront(class282_sub25_3);
                return anIntArrayArray3717[class282_sub25_3.anInt7689];
            } else {
                aBool3722 = anInt3718 != i_1;
                anInt3718 = i_1;
                return anIntArrayArray3717[0];
            }
        } else {
            aBool3722 = aNode_Sub25Array3720[i_1] == null;
            aNode_Sub25Array3720[i_1] = aNode_Sub25_3719;
            return anIntArrayArray3717[i_1];
        }
    }

    public int[][] method5722() {
        if (anInt3716 != anInt3715) {
            throw new RuntimeException();
        } else {
            for (int i_2 = 0; i_2 < anInt3716; i_2++) {
                aNode_Sub25Array3720[i_2] = aNode_Sub25_3719;
            }
            return anIntArrayArray3717;
        }
    }
}
