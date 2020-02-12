package com.jagex;

import java.awt.*;

public class Class320 {

    public static Class253 aClass253_3723;
    public static int[] VARC_INT;
    static Node_Sub25 aNode_Sub25_3719 = new Node_Sub25(0, 0);
    Node_Sub25[] aNode_Sub25Array3720;
    int[][] anIntArrayArray3717;
    LinkedNodeList aClass473_3721 = new LinkedNodeList();
    public boolean aBool3722 = false;
    int anInt3714 = 0;
    int anInt3718 = -1;
    int anInt3715;
    int anInt3716;

    final void method5720() {
        for (int i_2 = 0; i_2 < this.anInt3716; i_2++) {
            this.anIntArrayArray3717[i_2] = null;
        }
        this.aNode_Sub25Array3720 = null;
        this.anIntArrayArray3717 = null;
        this.aClass473_3721.clear();
        this.aClass473_3721 = null;
    }

    public final int[] method5721(int i_1, int i_2) {
        if (this.anInt3715 != this.anInt3716) {
            if (this.anInt3716 != 1) {
                Node_Sub25 class282_sub25_3 = this.aNode_Sub25Array3720[i_1];
                if (class282_sub25_3 == null) {
                    this.aBool3722 = true;
                    if (this.anInt3714 >= this.anInt3716) {
                        Node_Sub25 class282_sub25_4 = (Node_Sub25) this.aClass473_3721.getNext();
                        class282_sub25_3 = new Node_Sub25(i_1, class282_sub25_4.anInt7689);
                        this.aNode_Sub25Array3720[class282_sub25_4.anInt7688] = null;
                        class282_sub25_4.remove();
                    } else {
                        class282_sub25_3 = new Node_Sub25(i_1, this.anInt3714);
                        ++this.anInt3714;
                    }
                    this.aNode_Sub25Array3720[i_1] = class282_sub25_3;
                } else {
                    this.aBool3722 = false;
                }
                this.aClass473_3721.insertFront(class282_sub25_3);
                return this.anIntArrayArray3717[class282_sub25_3.anInt7689];
            } else {
                this.aBool3722 = this.anInt3718 != i_1;
                this.anInt3718 = i_1;
                return this.anIntArrayArray3717[0];
            }
        } else {
            this.aBool3722 = this.aNode_Sub25Array3720[i_1] == null;
            this.aNode_Sub25Array3720[i_1] = aNode_Sub25_3719;
            return this.anIntArrayArray3717[i_1];
        }
    }

    public final int[][] method5722() {
        if (this.anInt3716 != this.anInt3715) {
            throw new RuntimeException();
        } else {
            for (int i_2 = 0; i_2 < this.anInt3716; i_2++) {
                this.aNode_Sub25Array3720[i_2] = aNode_Sub25_3719;
            }
            return this.anIntArrayArray3717;
        }
    }

    Class320(int i_1, int i_2, int i_3) {
        this.anInt3715 = i_2;
        this.anInt3716 = i_1;
        this.anIntArrayArray3717 = new int[this.anInt3716][i_3];
        this.aNode_Sub25Array3720 = new Node_Sub25[this.anInt3715];
    }

    public static void method5731(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        Class42.playSoundSong(i_5, i_6, 100, (byte) -118);
        Class260.aClass277_3234 = new Class277(i_0, i_1 << 9, i_2 << 9, i_3 << 8, i_4 * 8);
    }

    public static GraphicalRenderer createRenderer(int i_0, Canvas canvas_1, Interface22 interface22_2, Index index_3, int i_4, int i_5) {
        int i_6 = 0;
        int i_7 = 0;
        if (canvas_1 != null) {
            Dimension dimension_8 = canvas_1.getSize();
            i_6 = dimension_8.width;
            i_7 = dimension_8.height;
        }
        return Class88.method1493(i_0, canvas_1, interface22_2, index_3, i_4, i_6, i_7);
    }
}
