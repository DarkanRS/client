package com.jagex;

import com.jagex.clans.ClanChannel;

public class RemoveMemberSetting extends ClanSetting {

    static int anInt10003;
    int index;

    public RemoveMemberSetting() {
        index = -1;
    }

    @Override
    public void readSettings(ByteBuf buffer) {
        index = buffer.readUnsignedShort();
        buffer.readUnsignedByte();
        if (buffer.readUnsignedByte() != 255) {
            --buffer.index;
            buffer.readLong();
        }

    }

    @Override
    public void apply(ClanChannel channel) {
        channel.removeMember(index);
    }

}
