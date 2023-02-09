package com.rs.jagex;

import com.rs.jagex.clans.settings.ClanSettings;

public abstract class ClanSettingDeltaUpdate extends Node {
	abstract void applyUpdate(ClanSettings setting);
	abstract void decode(ByteBuf var1);
}
