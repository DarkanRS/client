package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub6 extends Node_Sub17 {

    boolean aBool10016;
    byte aByte10015;
    byte aByte10014;
    byte aByte10017;
    byte aByte10018;
    Class348 this$0;

    Node_Sub17_Sub6(Class348 class348_1) {
        this$0 = class348_1;
    }

    static byte[] method15438(byte[] data) {
        try {
            ByteBuf buffer = new ByteBuf(data);
            int i_3 = buffer.readUnsignedByte();
            int i_4 = buffer.readInt();
            if (i_4 >= 0 && (Index.anInt3689 == 0 || i_4 <= Index.anInt3689)) {
                if (i_3 == 0) {
                    byte[] bytes_5 = new byte[i_4];
                    buffer.readBytes(bytes_5, 0, i_4);
                    return bytes_5;
                } else {
                    int i_8 = buffer.readInt();
                    if (i_8 < 0 || Index.anInt3689 != 0 && i_8 > Index.anInt3689) {
                        throw new RuntimeException();
                    } else {
                        byte[] bytes_6 = new byte[i_8];
                        if (i_3 == 1) {
                            Class471.method7828(bytes_6, i_8, data);
                        } else {
                            Class395 class395_7 = Index.aClass395_3684;
                            synchronized (Index.aClass395_3684) {
                                Index.aClass395_3684.method6767(buffer, bytes_6);
                            }
                        }
                        return bytes_6;
                    }
                }
            } else {
                throw new RuntimeException();
            }
        } catch (Throwable throwable_10) {
        	return new byte[100];
        	//throw new RuntimeException(); //Disables XTEA Crash
        }
    }

    @Override
    void method12253(ByteBuf rsbytebuffer_1) {
        aBool10016 = rsbytebuffer_1.readUnsignedByte() == 1;
        aByte10015 = rsbytebuffer_1.readByte();
        aByte10014 = rsbytebuffer_1.readByte();
        aByte10017 = rsbytebuffer_1.readByte();
        aByte10018 = rsbytebuffer_1.readByte();
    }

    @Override
    void method12252(ClanSettings class61_1) {
        class61_1.allowGuests = aBool10016;
        class61_1.talkRank = aByte10015;
        class61_1.kickRank = aByte10014;
        class61_1.lootshareRank = aByte10017;
        class61_1.coinShare = aByte10018;
    }

    @Override
    void method12251(ClanSettings class61_1) {
        class61_1.allowGuests = aBool10016;
        class61_1.talkRank = aByte10015;
        class61_1.kickRank = aByte10014;
        class61_1.lootshareRank = aByte10017;
        class61_1.coinShare = aByte10018;
    }

    @Override
    void method12249(ByteBuf rsbytebuffer_1) {
        aBool10016 = rsbytebuffer_1.readUnsignedByte() == 1;
        aByte10015 = rsbytebuffer_1.readByte();
        aByte10014 = rsbytebuffer_1.readByte();
        aByte10017 = rsbytebuffer_1.readByte();
        aByte10018 = rsbytebuffer_1.readByte();
    }

    @Override
    void method12257(ByteBuf rsbytebuffer_1) {
        aBool10016 = rsbytebuffer_1.readUnsignedByte() == 1;
        aByte10015 = rsbytebuffer_1.readByte();
        aByte10014 = rsbytebuffer_1.readByte();
        aByte10017 = rsbytebuffer_1.readByte();
        aByte10018 = rsbytebuffer_1.readByte();
    }

    @Override
    void method12250(ByteBuf rsbytebuffer_1) {
        aBool10016 = rsbytebuffer_1.readUnsignedByte() == 1;
        aByte10015 = rsbytebuffer_1.readByte();
        aByte10014 = rsbytebuffer_1.readByte();
        aByte10017 = rsbytebuffer_1.readByte();
        aByte10018 = rsbytebuffer_1.readByte();
    }

    @Override
    void method12256(ClanSettings class61_1) {
        class61_1.allowGuests = aBool10016;
        class61_1.talkRank = aByte10015;
        class61_1.kickRank = aByte10014;
        class61_1.lootshareRank = aByte10017;
        class61_1.coinShare = aByte10018;
    }

    @Override
    void method12258(ClanSettings class61_1) {
        class61_1.allowGuests = aBool10016;
        class61_1.talkRank = aByte10015;
        class61_1.kickRank = aByte10014;
        class61_1.lootshareRank = aByte10017;
        class61_1.coinShare = aByte10018;
    }

    @Override
    void method12254(ClanSettings class61_1) {
        class61_1.allowGuests = aBool10016;
        class61_1.talkRank = aByte10015;
        class61_1.kickRank = aByte10014;
        class61_1.lootshareRank = aByte10017;
        class61_1.coinShare = aByte10018;
    }

    @Override
    void method12255(ClanSettings class61_1) {
        class61_1.allowGuests = aBool10016;
        class61_1.talkRank = aByte10015;
        class61_1.kickRank = aByte10014;
        class61_1.lootshareRank = aByte10017;
        class61_1.coinShare = aByte10018;
    }
}
