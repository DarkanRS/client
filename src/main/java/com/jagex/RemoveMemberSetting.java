package com.jagex;

import com.jagex.clans.ClanChannel;
import com.jagex.clans.settings.ChangeClanSetting;

public class Node_Sub11_Sub2 extends ClanSetting {

    static int anInt10003;
    int anInt10002;
    ChangeClanSetting this$0;

    public Node_Sub11_Sub2(ChangeClanSetting class349_1) {
        this$0 = class349_1;
        anInt10002 = -1;
    }

    @Override
    public void readSettings(ByteBuf buffer) {
        anInt10002 = buffer.readUnsignedShort();
        buffer.readUnsignedByte();
        if (buffer.readUnsignedByte() != 255) {
            --buffer.index;
            buffer.readLong();
        }

    }

    @Override
    public void apply(ClanChannel channel) {
        channel.method12096(anInt10002);
    }

}
