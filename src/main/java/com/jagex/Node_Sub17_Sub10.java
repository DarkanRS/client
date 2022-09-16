package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub10 extends ClanSettingDeltaUpdate {

	long aLong10047;
	String aString10048;
	ClanSettingsDelta this$0;

	Node_Sub17_Sub10(ClanSettingsDelta class348_1) {
		this$0 = class348_1;
		aLong10047 = -1L;
		aString10048 = null;
	}

	@Override
	void applyUpdate(ClanSettings class61_1) {
		class61_1.method1207(aLong10047, aString10048);
	}

	@Override
	void decode(ByteBuf rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			--rsbytebuffer_1.index;
			aLong10047 = rsbytebuffer_1.readLong();
		}

		aString10048 = rsbytebuffer_1.readNullString();
	}

}
