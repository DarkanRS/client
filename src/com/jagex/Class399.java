package com.jagex;

public class Class399 {

    public int anInt4814;
    public int anInt4815;
    public int anInt4816;

    Class399(int i_1, int i_2, int i_3) {
        this.anInt4814 = i_1;
        this.anInt4815 = i_2;
        this.anInt4816 = i_3;
    }

    static int decodeSkip(RsBitsBuffer rsbitsbuffer_0) {
        int i_2 = rsbitsbuffer_0.readBits(2);
        int i_3;
        if (i_2 == 0) {
            i_3 = 0;
        } else if (i_2 == 1) {
            i_3 = rsbitsbuffer_0.readBits(5);
        } else if (i_2 == 2) {
            i_3 = rsbitsbuffer_0.readBits(8);
        } else {
            i_3 = rsbitsbuffer_0.readBits(11);
        }

        return i_3;
    }

}
