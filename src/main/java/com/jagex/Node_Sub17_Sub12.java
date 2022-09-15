package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub12 extends ClanSettingDeltaUpdate {

	int anInt10054;
	int anInt10053;
	int anInt10052;
	int anInt10055;
	ClanSettingsDelta this$0;

	Node_Sub17_Sub12(ClanSettingsDelta class348_1) {
		this$0 = class348_1;
		anInt10054 = -1;
	}

	@Override
	void applyUpdate(ClanSettings class61_1) {
		class61_1.method1210(anInt10054, anInt10053, anInt10052, anInt10055);
	}

	@Override
	void decode(ByteBuf rsbytebuffer_1) {
		anInt10054 = rsbytebuffer_1.readUnsignedShort();
		anInt10053 = rsbytebuffer_1.readInt();
		anInt10052 = rsbytebuffer_1.readUnsignedByte();
		anInt10055 = rsbytebuffer_1.readUnsignedByte();
	}

}
