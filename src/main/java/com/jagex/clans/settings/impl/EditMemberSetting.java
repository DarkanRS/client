package com.jagex.clans.settings.impl;

import com.jagex.ByteBuf;
import com.jagex.ClanSetting;
import com.jagex.Class16;
import com.jagex.Class285;
import com.jagex.Class395;
import com.jagex.Class487;
import com.jagex.FontRenderer;
import com.jagex.Node_Sub17_Sub2;
import com.jagex.Renderers;
import com.jagex.SkyboxIndexLoader;
import com.jagex.client;
import com.jagex.clans.ClanChannel;
import com.jagex.clans.ClanChannelMember;

public class EditMemberSetting extends ClanSetting {

	public static void method15476() {
		Renderers.FONT_RENDERER = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class16.p11FullIndex, true, true);
		Node_Sub17_Sub2.aClass414_9933 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class16.p11FullIndex);
		Class16.aFontRenderer_144 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class16.p12FullIndex, true, true);
		Class16.aClass414_139 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class16.p12FullIndex);
		Class285.aFontRenderer_3394 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class395.b12FullIndex, true, true);
		SkyboxIndexLoader.aClass414_3438 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class395.b12FullIndex);
	}

	int index;

	byte rank;

	int worldId;

	String username;

	public EditMemberSetting() {
		index = -1;
	}

	@Override
	public void apply(ClanChannel channel) {
		ClanChannelMember member = channel.players[index];
		member.rank = rank;
		member.world = worldId;
		member.name = username;
	}

	@Override
	public void readSettings(ByteBuf buffer) {
		index = buffer.readUnsignedShort();
		rank = buffer.readByte();
		worldId = buffer.readUnsignedShort();
		buffer.readLong();
		username = buffer.readString(); //displayName?
	}

}
