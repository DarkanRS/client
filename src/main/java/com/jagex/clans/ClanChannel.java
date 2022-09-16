package com.jagex.clans;

import java.util.BitSet;

import com.jagex.AnimationIndexLoader;
import com.jagex.ByteBuf;
import com.jagex.Class111;
import com.jagex.Class291;
import com.jagex.Class291_Sub1;
import com.jagex.Class503;
import com.jagex.Node;

public class ClanChannel extends Node {

	static {
		new BitSet(65536);
	}

	public static void method12114(int i_0) {
		if (i_0 == 37)
			Class291.aFloat3462 = 3.0F;
		else if (i_0 == 50)
			Class291.aFloat3462 = 4.0F;
		else if (i_0 == 75)
			Class291.aFloat3462 = 6.0F;
		else if (i_0 == 100)
			Class291.aFloat3462 = 8.0F;
		else if (i_0 == 200)
			Class291.aFloat3462 = 16.0F;
		Class291_Sub1.anInt8016 = -1;
	}
	public static void method12117(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		if (i_0 == i_2 && i_3 == i_1 && i_4 == i_6 && i_5 == i_7)
			AnimationIndexLoader.method11220(i_0, i_1, i_6, i_7, i_8);
		else {
			int i_10 = i_0;
			int i_11 = i_1;
			int i_12 = i_0 * 3;
			int i_13 = i_1 * 3;
			int i_14 = i_2 * 3;
			int i_15 = i_3 * 3;
			int i_16 = i_4 * 3;
			int i_17 = i_5 * 3;
			int i_18 = i_6 - i_16 + i_14 - i_0;
			int i_19 = i_15 + (i_7 - i_17) - i_1;
			int i_20 = i_12 + (i_16 - i_14 - i_14);
			int i_21 = i_13 + (i_17 - i_15 - i_15);
			int i_22 = i_14 - i_12;
			int i_23 = i_15 - i_13;
			for (int i_24 = 128; i_24 <= 4096; i_24 += 128) {
				int i_25 = i_24 * i_24 >> 12;
			int i_26 = i_25 * i_24 >> 12;
			int i_27 = i_18 * i_26;
			int i_28 = i_26 * i_19;
			int i_29 = i_20 * i_25;
			int i_30 = i_25 * i_21;
			int i_31 = i_24 * i_22;
			int i_32 = i_24 * i_23;
			int i_33 = i_0 + (i_29 + i_27 + i_31 >> 12);
			int i_34 = (i_28 + i_30 + i_32 >> 12) + i_1;
			AnimationIndexLoader.method11220(i_10, i_11, i_33, i_34, i_8);
			i_10 = i_33;
			i_11 = i_34;
			}
		}
	}
	public int numPlayers;
	public String clanName;
	public ClanChannelMember[] players;
	public byte minRankToKick;
	public byte guestsTalk;
	boolean namesAsString = true;
	int[] sortedNameIndices;

	boolean namesAsLong;

	public long nextUpdateNumber;

	public ClanChannel(ByteBuf buffer) {
		decode(buffer);
	}

	//addMemberNoCheck??
			public void addMember(ClanChannelMember member) {
		if (players == null || numPlayers >= players.length)
			setSize(numPlayers + 5);
		players[++numPlayers - 1] = member;
		sortedNameIndices = null;
	}

	void decode(ByteBuf buffer) {
		int nameTypeFlag = buffer.readUnsignedByte();
		if ((nameTypeFlag & 0x1) != 0)
			namesAsLong = true;
		if ((nameTypeFlag & 0x2) != 0)
			namesAsString = true;
		pointer = buffer.readLong();
		nextUpdateNumber = buffer.readLong();
		clanName = buffer.readString();
		buffer.readUnsignedByte();
		minRankToKick = buffer.readByte();
		guestsTalk = buffer.readByte();
		numPlayers = buffer.readUnsignedShort();
		if (numPlayers > 0) {
			players = new ClanChannelMember[numPlayers];
			for (int i_4 = 0; i_4 < numPlayers; i_4++) {
				ClanChannelMember player = new ClanChannelMember();
				if (namesAsLong)
					buffer.readLong();
				if (namesAsString)
					player.name = buffer.readString();
				player.rank = buffer.readByte();
				player.world = buffer.readUnsignedShort();
				players[i_4] = player;
			}
		}
	}

	public int[] getSortedPlayersByName() {
		if (sortedNameIndices == null) {
			String[] playerNames = new String[numPlayers];
			sortedNameIndices = new int[numPlayers];
			for (int i_3 = 0; i_3 < numPlayers; sortedNameIndices[i_3] = i_3++)
				playerNames[i_3] = players[i_3].name;
			Class111.toSortedIndicesArr(playerNames, sortedNameIndices);
		}
		return sortedNameIndices;
	}

	public int getUserSlot(String string_1) {
		for (int i_3 = 0; i_3 < numPlayers; i_3++)
			if (players[i_3].name.equalsIgnoreCase(string_1))
				return i_3;
		return -1;
	}

	public void removeMember(int index) {
		--numPlayers;
		if (numPlayers == 0)
			players = null;
		else
			Class503.setSize(players, index + 1, players, index, numPlayers - index);
		sortedNameIndices = null;
	}

	void setSize(int size) {
		if (players != null)
			Class503.setSize(players, 0, players = new ClanChannelMember[size], 0, numPlayers);
		else
			players = new ClanChannelMember[size];
	}
}
