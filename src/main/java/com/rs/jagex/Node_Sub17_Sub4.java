package com.rs.jagex;

import com.rs.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub4 extends ClanSettingDeltaUpdate {

	public static int anInt9940;
	int anInt9937;
	int anInt9938;
	int anInt9939;
	int anInt9936;
	ClanSettingsDelta this$0;

	Node_Sub17_Sub4(ClanSettingsDelta class348_1) {
		this$0 = class348_1;
	}

	@Override
	void applyUpdate(ClanSettings class61_1) {
		class61_1.setVarBit(anInt9937, anInt9938, anInt9939, anInt9936);
	}

	@Override
	void decode(ByteBuf rsbytebuffer_1) {
		anInt9937 = rsbytebuffer_1.readInt();
		anInt9938 = rsbytebuffer_1.readInt();
		anInt9939 = rsbytebuffer_1.readUnsignedByte();
		anInt9936 = rsbytebuffer_1.readUnsignedByte();
	}
}
