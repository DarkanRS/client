package com.jagex;

public abstract class Node_Sub20 extends Node {

    protected Class308 aClass308_7670;
    protected Class320 aClass320_7667;
    protected boolean aBool7669;
    int anInt7668;
    Node_Sub20[] aNode_Sub20Array7671;

    Node_Sub20(int i_1, boolean bool_2) {
        aBool7669 = bool_2;
        aNode_Sub20Array7671 = new Node_Sub20[i_1];
    }

    void method12315(int i_1, int i_2) {
        int i_4 = anInt7668 == 255 ? i_2 : anInt7668;
        if (aBool7669) {
            aClass320_7667 = new Class320(i_4, i_2, i_1);
        } else {
            aClass308_7670 = new Class308(i_4, i_2, i_1);
        }
    }

    int[] method12317(int i_1, int i_2) {
        return !aNode_Sub20Array7671[i_1].aBool7669 ? aNode_Sub20Array7671[i_1].method12320(i_2)[0] : aNode_Sub20Array7671[i_1].method12319(i_2);
    }

    int[] method12319(int i_1) {
        throw new IllegalStateException();
    }

    int[][] method12320(int i_1) {
        throw new IllegalStateException();
    }

    void method12321() {
    }

    void method12322(int i_1, Packet rsbytebuffer_2) {
    }

    int method12323() {
        return -1;
    }

    int method12324() {
        return -1;
    }

    void method12326() {
        if (aBool7669) {
            aClass320_7667.method5720();
            aClass320_7667 = null;
        } else {
            aClass308_7670.method5462();
            aClass308_7670 = null;
        }
    }

    int[][] method12333(int i_1, int i_2) {
        if (aNode_Sub20Array7671[i_1].aBool7669) {
            int[] ints_4 = aNode_Sub20Array7671[i_1].method12319(i_2);
            int[][] ints_5 = {ints_4, ints_4, ints_4};
            return ints_5;
        } else {
            return aNode_Sub20Array7671[i_1].method12320(i_2);
        }
    }
}
