package com.jagex;

public class Node_Sub21_Sub1_Sub1 extends Node_Sub21_Sub1 {

    int[] anIntArray10306;
    int[] anIntArray10307;
    DirectXShader aClass101_Sub2_10305;

    Node_Sub21_Sub1_Sub1(DirectXShader class101_sub2_1, Class122 class122_2) {
        super(class122_2);
        aClass101_Sub2_10305 = class101_sub2_1;
        anIntArray10306 = class122_2.anIntArray1531;
        anIntArray10307 = class122_2.anIntArray1534;
    }

    @Override
    public int method15472(int i_1) {
        int i_2 = anIntArray10306[i_1];
        int i_3 = anIntArray10307[i_1];
        return i_2 != -1 ? i_2 : (i_3 != -1 ? i_3 | 0x10000 : -1);
    }

    @Override
    public boolean method15471(int i_1) {
        return true;
    }

    int method15782() {
        return anIntArray10306[aClass101_Sub2_10305.method1714()];
    }

    int method15783() {
        return anIntArray10307[aClass101_Sub2_10305.method1714()];
    }

    @Override
    public int method15460(int i_1) {
        int i_2 = anIntArray10306[i_1];
        int i_3 = anIntArray10307[i_1];
        return i_2 != -1 ? i_2 : (i_3 != -1 ? i_3 | 0x10000 : -1);
    }

    @Override
    public boolean method15463(int i_1) {
        return true;
    }

    @Override
    public boolean method15461(int i_1) {
        return true;
    }

    @Override
    public int method15455(int i_1) {
        int i_2 = anIntArray10306[i_1];
        int i_3 = anIntArray10307[i_1];
        return i_2 != -1 ? i_2 : (i_3 != -1 ? i_3 | 0x10000 : -1);
    }

    @Override
    public int method15473(int i_1) {
        int i_2 = anIntArray10306[i_1];
        int i_3 = anIntArray10307[i_1];
        return i_2 != -1 ? i_2 : (i_3 != -1 ? i_3 | 0x10000 : -1);
    }

    @Override
    public int method15453(int i_1) {
        int i_2 = anIntArray10306[i_1];
        int i_3 = anIntArray10307[i_1];
        return i_2 != -1 ? i_2 : (i_3 != -1 ? i_3 | 0x10000 : -1);
    }

    @Override
    public boolean method15470(int i_1) {
        return true;
    }

    @Override
    public boolean method15462(int i_1) {
        return true;
    }

}
