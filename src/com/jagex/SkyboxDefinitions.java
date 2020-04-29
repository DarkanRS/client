package com.jagex;

public class SkyboxDefinitions {

    int anInt2653 = -1;
    int anInt2654 = -1;
    Class204 aClass204_2656;
    int anInt2657;
    int[] anIntArray2655;

    SkyboxDefinitions() {
        aClass204_2656 = Class204.aClass204_2579;
        anInt2657 = -1;
    }

    public static TCPPacket method3558() {
        TCPPacket tcpmessage_1 = Class158_Sub2.method14356();
        tcpmessage_1.packet = null;
        tcpmessage_1.anInt7678 = 0;
        tcpmessage_1.buffer = new ByteBuf.Bit(5000);
        return tcpmessage_1;
    }

    void method3549(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method3552(rsbytebuffer_1, i_3);
        }
    }

    void method3552(ByteBuf buffer, int opcode) {
        if (opcode == 1) {
            anInt2653 = buffer.readUnsignedShort();
        } else if (opcode == 2) {
            anIntArray2655 = new int[buffer.readUnsignedByte()];
            for (int i_4 = 0; i_4 < anIntArray2655.length; i_4++) {
                anIntArray2655[i_4] = buffer.readUnsignedShort();
            }
        } else if (opcode == 3) {
            anInt2654 = buffer.readUnsignedByte();
        } else if (opcode == 4) {
            aClass204_2656 = (Class204) Class386.identify(IFSubObjectPosition.method11353(), buffer.readUnsignedByte());
        } else if (opcode == 5) {
            anInt2657 = buffer.readBigSmart();
        }
    }
}
