package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public abstract class ClanSettingDeltaUpdate extends Node {
	abstract void applyUpdate(ClanSettings setting);
	abstract void decode(ByteBuf var1);
}
