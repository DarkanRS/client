package com.rs.jagex;

import com.rs.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub2 extends ClanSettingDeltaUpdate {

	public static boolean[] IS_VARC_SAVE_TO_FILE;
	public static FontMetrics aClass414_9933;
	int anInt9932;
	ClanSettingsDelta this$0;

	Node_Sub17_Sub2(ClanSettingsDelta class348_1) {
		this$0 = class348_1;
		anInt9932 = -1;
	}

	@Override
	void applyUpdate(ClanSettings class61_1) {
		class61_1.method1233(anInt9932);
	}

	@Override
	void decode(ByteBuf rsbytebuffer_1) {
		anInt9932 = rsbytebuffer_1.readUnsignedShort();
	}

}
