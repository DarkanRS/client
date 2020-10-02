package com.jagex.clans.settings;

import com.jagex.*;
import com.jagex.clans.ClanChannel;

public class ClanSetting {

    public static int BASE_WINDOW_WIDTH;

    long clanHash;

    long updateNumber = -1L;

    NodeCollection aClass482_4076 = new NodeCollection();

    public ClanSetting(ByteBuf buffer) {
        decodeSettings(buffer);
    }

    void decodeSettings(ByteBuf buffer) {
        clanHash = buffer.readLong();
        updateNumber = buffer.readLong();
        for (int i = buffer.readUnsignedByte(); i != 0; i = buffer.readUnsignedByte()) {
            ChangeClanSetting setting = null;
            if (i == 1)
                setting = new AddMemberSetting(this);
            else if(i == 2)
                setting = new Node_Sub11_Sub3(this);
            else if (i == 3)
                setting = new Node_Sub11_Sub2(this);
            else if (i == 4)
                setting = new Node_Sub11_Sub1(this);
            setting.readSettings(buffer);
            aClass482_4076.append(setting);
        }
    }

    public void applySettings(ClanChannel class282_sub4_1) {
        if (class282_sub4_1.pointer == clanHash && class282_sub4_1.nextUpdateNumber == updateNumber) {
            for (ChangeClanSetting class282_sub11_3 = (ChangeClanSetting) aClass482_4076.head(); class282_sub11_3 != null; class282_sub11_3 = (ChangeClanSetting) aClass482_4076.next()) {
                class282_sub11_3.applySettings(class282_sub4_1);
            }
            ++class282_sub4_1.nextUpdateNumber;
        } else {
            throw new RuntimeException("");
        }
    }
}
