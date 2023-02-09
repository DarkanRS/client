package com.rs.jagex;

import com.rs.jagex.clans.ClanChannel;
import com.rs.jagex.clans.ClanChannelMember;

public class LightDetailPreference extends Preference {

	public static void method12790(boolean mainCC, int playerIndex) {
		ClanChannel cc = mainCC ? Class113.CLAN_CHANNEL : AsyncConnection.LISTENED_CLAN_CHANNEL;
		if (cc != null && playerIndex >= 0 && playerIndex < cc.numPlayers) {
			ClanChannelMember ccPlayer = cc.players[playerIndex];
			if (ccPlayer.rank == -1) {
				String ccPlayerName = ccPlayer.name;
				BufferedConnectionContext connection = BufferedConnectionContext.getConnectionContext();
				TCPPacket packet = TCPPacket.createPacket(ClientProt.CLANCHANNEL_KICKUSER, connection.outKeys);
				packet.buffer.writeByte(3 + ChatLine.getLength(ccPlayerName));
				packet.buffer.writeByte(mainCC ? 1 : 0);
				packet.buffer.writeShort(playerIndex);
				packet.buffer.writeString(ccPlayerName);
				connection.queuePacket(packet);
			}
		}

	}

	public LightDetailPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public LightDetailPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	int checkValid(int i_1) {
		return 1;
	}

	@Override
	int getDefaultValue() {
		return 1;
	}

	public void method12785() {
		if (value != 1 && value != 0)
			value = getDefaultValue();

	}

	public int method12786() {
		return value;
	}

	void method7780(int i_1) {
		value = i_1 * -754033619 * -859024475;
	}

	int method7784() {
		return 1;
	}

	int method7786() {
		return 1;
	}

	int method7787() {
		return 1;
	}

	@Override
	void setValue(int i_1) {
		value = i_1;
	}

}
