package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub11 extends ClanSettingDeltaUpdate {

    int anInt10050;
    long aLong10049;
    ClanSettingsDelta this$0;

    Node_Sub17_Sub11(ClanSettingsDelta class348_1) {
        this$0 = class348_1;
    }

    @Override
    void applyUpdate(ClanSettings class61_1) {
        class61_1.setVarLong(anInt10050, aLong10049);
    }

    @Override
    void decode(ByteBuf rsbytebuffer_1) {
        anInt10050 = rsbytebuffer_1.readInt();
        aLong10049 = rsbytebuffer_1.readLong();
    }
}
