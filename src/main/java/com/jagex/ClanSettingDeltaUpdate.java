package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public abstract class ClanSettingDeltaUpdate extends Node {
    abstract void decode(ByteBuf var1);
    abstract void applyUpdate(ClanSettings setting);
}
