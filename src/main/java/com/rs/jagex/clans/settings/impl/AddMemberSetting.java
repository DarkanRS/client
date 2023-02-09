package com.rs.jagex.clans.settings.impl;

import com.rs.jagex.ByteBuf;
import com.rs.jagex.ClanSetting;
import com.rs.jagex.clans.ClanChannel;
import com.rs.jagex.clans.ClanChannelMember;

public class AddMemberSetting extends ClanSetting {

	String username;
	int worldId;
	byte rank;

	public AddMemberSetting() {
		username = null;
	}

	@Override
	public void apply(ClanChannel channel) {
		ClanChannelMember member = new ClanChannelMember();
		member.name = username;
		member.world = worldId;
		member.rank = rank;
		channel.addMember(member);
	}

	@Override
	public void readSettings(ByteBuf buffer) {
		if (buffer.readUnsignedByte() != 255) {
			--buffer.index;
			buffer.readLong();
		}
		username = buffer.readNullString();
		worldId = buffer.readUnsignedShort();
		rank = buffer.readByte();
		buffer.readLong();
	}

}
