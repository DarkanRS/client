package com.jagex;

public class ClanVarSettingsDefinitions {

    public char aChar7096;
    public int baseVar;
    public int startBit;
    public int endBit;

    void method11487(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method11488(rsbytebuffer_1, i_3);
        }
    }

    void method11488(ByteBuf rsbytebuffer_1, int i_2) {
        if (i_2 == 1) {
            aChar7096 = Utils.cp1252ToChar(rsbytebuffer_1.readByte());
        } else if (i_2 == 2) {
            baseVar = rsbytebuffer_1.readUnsignedShort();
            startBit = rsbytebuffer_1.readUnsignedByte();
            endBit = rsbytebuffer_1.readUnsignedByte();
        }
    }
}
