package com.jagex;

public class Class349 {

    public static int anInt4083;

    long aLong4081;

    long aLong4077 = -1L;

    NodeCollection aClass482_4076 = new NodeCollection();

    public Class349(Packet rsbytebuffer_1) {
        method6178(rsbytebuffer_1);
    }

    void method6178(Packet rsbytebuffer_1) {
        aLong4081 = rsbytebuffer_1.readLong();
        aLong4077 = rsbytebuffer_1.readLong();
        for (int i_3 = rsbytebuffer_1.readUnsignedByte(); i_3 != 0; i_3 = rsbytebuffer_1.readUnsignedByte()) {
            Object obj_4;
            if (i_3 == 1) {
                obj_4 = new Node_Sub11_Sub4(this);
            } else if (i_3 == 4) {
                obj_4 = new Node_Sub11_Sub1(this);
            } else if (i_3 == 3) {
                obj_4 = new Node_Sub11_Sub2(this);
            } else {
                if (i_3 != 2) {
                    throw new RuntimeException("");
                }
                obj_4 = new Node_Sub11_Sub3(this);
            }
            ((Node_Sub11) obj_4).method12203(rsbytebuffer_1);
            aClass482_4076.append((Node) obj_4);
        }
    }

    public void method6179(ClanChannel class282_sub4_1) {
        if (class282_sub4_1.pointer == aLong4081 && class282_sub4_1.nextUpdateNumber == aLong4077) {
            for (Node_Sub11 class282_sub11_3 = (Node_Sub11) aClass482_4076.head(); class282_sub11_3 != null; class282_sub11_3 = (Node_Sub11) aClass482_4076.next()) {
                class282_sub11_3.method12204(class282_sub4_1);
            }
            ++class282_sub4_1.nextUpdateNumber;
        } else {
            throw new RuntimeException("");
        }
    }
}
