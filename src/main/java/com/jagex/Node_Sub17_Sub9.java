package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub9 extends ClanSettingDeltaUpdate {

	ClanSettingsDelta this$0;
	long aLong10046;
	String aString10045;
	int anInt10044;

	Node_Sub17_Sub9(ClanSettingsDelta class348_1) {
		this$0 = class348_1;
		aLong10046 = -1L;
		aString10045 = null;
		anInt10044 = 0;
	}

	@Override
	void applyUpdate(ClanSettings class61_1) {
		class61_1.method1216(aLong10046, aString10045, anInt10044);
	}

	@Override
	void decode(ByteBuf rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			--rsbytebuffer_1.index;
			aLong10046 = rsbytebuffer_1.readLong();
		}
		aString10045 = rsbytebuffer_1.readNullString();
		anInt10044 = rsbytebuffer_1.readUnsignedShort();
	}
}
