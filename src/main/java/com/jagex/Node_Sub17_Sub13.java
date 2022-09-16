package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub13 extends ClanSettingDeltaUpdate {

	int anInt10213;
	int anInt10214;
	ClanSettingsDelta this$0;

	Node_Sub17_Sub13(ClanSettingsDelta class348_1) {
		this$0 = class348_1;
	}

	@Override
	void applyUpdate(ClanSettings class61_1) {
		class61_1.setVarInt(anInt10213, anInt10214);
	}

	@Override
	void decode(ByteBuf rsbytebuffer_1) {
		anInt10213 = rsbytebuffer_1.readInt();
		anInt10214 = rsbytebuffer_1.readInt();
	}

}
