package com.jagex;

public class Node_Sub20_Sub11 extends Node_Sub20 {

    int anInt9805 = 0;
    int anInt9803 = 4096;

    int[] method12319(int i_1) {
        int[] ints_3 = this.aClass320_7667.method5721(i_1, -1057419566);
        if (this.aClass320_7667.aBool3722) {
            int[] ints_4 = this.method12317(0, i_1, 1980715677);

            for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
                int i_6 = ints_4[i_5];
                ints_3[i_5] = i_6 >= this.anInt9805 && i_6 <= this.anInt9803 ? 4096 : 0;
            }
        }

        return ints_3;
    }

    void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                this.anInt9805 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 1:
                this.anInt9803 = rsbytebuffer_2.readUnsignedShort();
        }

    }

    public Node_Sub20_Sub11() {
        super(1, true);
    }

    public static void method15264(int i_0) {
        PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(1, i_0);
        class282_sub50_sub12_2.method14965((byte) 15);
    }

}
