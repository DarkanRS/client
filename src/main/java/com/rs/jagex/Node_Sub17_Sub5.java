package com.rs.jagex;

import com.rs.jagex.clans.settings.ClanSettings;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Node_Sub17_Sub5 extends ClanSettingDeltaUpdate {

	public static byte[] method15410(Object object_0, int i_1) {
		if (object_0 == null)
			return null;
		if (object_0 instanceof byte[] bytes_6) {
			return Arrays.copyOfRange(bytes_6, i_1, 32768 + i_1);
		} else if (object_0 instanceof ByteBuffer bytebuffer_4) {
			byte[] bytes_5 = new byte[32768];
			bytebuffer_4.position(i_1);
			bytebuffer_4.get(bytes_5, 0, 32768);
			return bytes_5;
		} else
			throw new IllegalArgumentException();
	}
	int anInt9941;
	String aString9942;

	ClanSettingsDelta this$0;

	Node_Sub17_Sub5(ClanSettingsDelta class348_1) {
		this$0 = class348_1;
	}

	@Override
	void applyUpdate(ClanSettings class61_1) {
		class61_1.setVarString(anInt9941, aString9942);
	}

	@Override
	void decode(ByteBuf rsbytebuffer_1) {
		anInt9941 = rsbytebuffer_1.readInt();
		aString9942 = rsbytebuffer_1.readString();
	}

}
