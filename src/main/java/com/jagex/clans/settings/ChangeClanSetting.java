package com.jagex.clans.settings;

import com.jagex.ByteBuf;
import com.jagex.ClanSetting;
import com.jagex.NodeCollection;
import com.jagex.RankSetting;
import com.jagex.RemoveMemberSetting;
import com.jagex.clans.ClanChannel;
import com.jagex.clans.settings.impl.AddMemberSetting;
import com.jagex.clans.settings.impl.EditMemberSetting;

public class ChangeClanSetting {

    public static int BASE_WINDOW_WIDTH;

    long pointer;

    long updateNumber = -1L;

    NodeCollection settings = new NodeCollection();

    public ChangeClanSetting(ByteBuf buffer) {
        decodeSettings(buffer);
    }

    void decodeSettings(ByteBuf buffer) {
        pointer = buffer.readLong();
        updateNumber = buffer.readLong();
        for (int i = buffer.readUnsignedByte(); i != 0; i = buffer.readUnsignedByte()) {
            ClanSetting setting = null;
            if (i == 1)
                setting = new AddMemberSetting();
            else if(i == 2)
                setting = new EditMemberSetting();
            else if (i == 3)
                setting = new RemoveMemberSetting();
            else if (i == 4)
                setting = new RankSetting();
            setting.readSettings(buffer);
            settings.append(setting);
        }
    }

    public void applySettings(ClanChannel channel) {
        if (channel.pointer == pointer && channel.nextUpdateNumber == updateNumber) {
            for (ClanSetting setting = (ClanSetting) settings.head(); setting != null; setting = (ClanSetting) settings.next()) {
                setting.apply(channel);
            }
            ++channel.nextUpdateNumber;
        } else {
            throw new RuntimeException("");
        }
    }
}
