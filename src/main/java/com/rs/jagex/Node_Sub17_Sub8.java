package com.rs.jagex;

import com.rs.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub8 extends ClanSettingDeltaUpdate {

	int anInt10021;
	ClanSettingsDelta this$0;

	Node_Sub17_Sub8(ClanSettingsDelta class348_1) {
		this$0 = class348_1;
		anInt10021 = -1;
	}

	@Override
	void applyUpdate(ClanSettings class61_1) {
		class61_1.method1208(anInt10021);
	}

	@Override
	void decode(ByteBuf rsbytebuffer_1) {
		anInt10021 = rsbytebuffer_1.readUnsignedShort();
	}

}
