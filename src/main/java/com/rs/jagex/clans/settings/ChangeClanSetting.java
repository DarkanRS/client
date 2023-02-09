package com.rs.jagex.clans.settings;

import com.rs.jagex.RemoveMemberSetting;
import com.rs.jagex.clans.ClanChannel;
import com.rs.jagex.clans.settings.impl.EditMemberSetting;
import com.rs.jagex.ByteBuf;
import com.rs.jagex.ClanSetting;
import com.rs.jagex.NodeCollection;
import com.rs.jagex.RankSetting;
import com.rs.jagex.clans.settings.impl.AddMemberSetting;

public class ChangeClanSetting {

	public static int BASE_WINDOW_WIDTH;

	long pointer;

	long updateNumber = -1L;

	NodeCollection settings = new NodeCollection();

	public ChangeClanSetting(ByteBuf buffer) {
		decodeSettings(buffer);
	}

	public void applySettings(ClanChannel channel) {
		if ((channel.pointer != pointer) || (channel.nextUpdateNumber != updateNumber))
			throw new RuntimeException("");
		for (ClanSetting setting = (ClanSetting) settings.head(); setting != null; setting = (ClanSetting) settings.next())
			setting.apply(channel);
		++channel.nextUpdateNumber;
	}

	void decodeSettings(ByteBuf buffer) {
		pointer = buffer.readLong();
		updateNumber = buffer.readLong();
		for (int i = buffer.readUnsignedByte(); i != 0; i = buffer.readUnsignedByte()) {
			ClanSetting setting = null;
			if (i == 1)
				setting = new AddMemberSetting();
			else if(i == 2)
				setting = new EditMemberSetting();
			else if (i == 3)
				setting = new RemoveMemberSetting();
			else if (i == 4)
				setting = new RankSetting();
			setting.readSettings(buffer);
			settings.append(setting);
		}
	}
}
