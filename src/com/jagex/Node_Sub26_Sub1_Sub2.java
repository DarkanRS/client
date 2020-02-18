package com.jagex;

public class Node_Sub26_Sub1_Sub2 extends Node_Sub26_Sub1 {

    byte[] aByteArray10470;

    Node_Sub26_Sub1_Sub2(byte[] bytes_2, int i_3, int i_4) {
        anInt9750 = 22050;
        aByteArray10470 = bytes_2;
        anInt9749 = i_3;
        anInt9751 = i_4;
    }

    public Node_Sub26_Sub1_Sub2 method16062(Class344 class344_1) {
        aByteArray10470 = class344_1.method6102(aByteArray10470);
        anInt9750 = class344_1.method6112(anInt9750);
        if (anInt9749 == anInt9751) {
            anInt9749 = anInt9751 = class344_1.method6114(anInt9749);
        } else {
            anInt9749 = class344_1.method6114(anInt9749);
            anInt9751 = class344_1.method6114(anInt9751);
            if (anInt9749 == anInt9751) {
                --anInt9749;
            }
        }

        return this;
    }

    @Override
    public int method15223() {
        return aByteArray10470.length;
    }

    @Override
    public Node_Sub15_Sub5 method15225(int i_1, int i_2, int i_3) {
        return aByteArray10470 != null && aByteArray10470.length != 0 ? new Node_Sub15_Sub5_Sub2(this, i_1, i_2, i_3) : null;
    }

    @Override
    public Node_Sub15_Sub5 method15230(int i_1, int i_2, int i_3) {
        return aByteArray10470 != null && aByteArray10470.length != 0 ? new Node_Sub15_Sub5_Sub2(this, i_1, i_2, i_3) : null;
    }

    @Override
    public int method15227() {
        return aByteArray10470.length;
    }

    @Override
    public int method15228() {
        return aByteArray10470.length;
    }

    @Override
    public Node_Sub15_Sub5 method15229(int i_1, int i_2, int i_3) {
        return aByteArray10470 != null && aByteArray10470.length != 0 ? new Node_Sub15_Sub5_Sub2(this, i_1, i_2, i_3) : null;
    }

    @Override
    public int method15226() {
        return aByteArray10470.length;
    }

    @Override
    public Node_Sub15_Sub5 method15224(int i_1, int i_2, int i_3) {
        return aByteArray10470 != null && aByteArray10470.length != 0 ? new Node_Sub15_Sub5_Sub2(this, i_1, i_2, i_3) : null;
    }

}
