package com.jagex;

import java.util.BitSet;

public class ClanChannel extends Node {

    boolean namesAsString = true;
    public int numPlayers = 0;
    public String clanName = null;
    int[] sortedNameIndices;
    public ClanChannelPlayer[] players;
    boolean namesAsLong;
    long nextUpdateNumber;
    public byte minRankToKick;
    public byte guestsTalk;

    static {
        new BitSet(65536);
    }

    public ClanChannel(RsByteBuffer buffer) {
        this.decode(buffer);
    }

    public int[] getSortedPlayersByName() {
        if (this.sortedNameIndices == null) {
            String[] playerNames = new String[this.numPlayers];
            this.sortedNameIndices = new int[this.numPlayers];
            for (int i_3 = 0; i_3 < this.numPlayers; this.sortedNameIndices[i_3] = i_3++) {
                playerNames[i_3] = this.players[i_3].name;
            }
            Class111.toSortedIndicesArr(playerNames, this.sortedNameIndices);
        }
        return this.sortedNameIndices;
    }

    void method12096(int i_1) {
        --this.numPlayers;
        if (this.numPlayers == 0) {
            this.players = null;
        } else {
            Class503.method8359(this.players, i_1 + 1, this.players, i_1, this.numPlayers - i_1);
        }
        this.sortedNameIndices = null;
    }

    public int getUserSlot(String string_1) {
        for (int i_3 = 0; i_3 < this.numPlayers; i_3++) {
            if (this.players[i_3].name.equalsIgnoreCase(string_1)) {
                return i_3;
            }
        }
        return -1;
    }

    void decode(RsByteBuffer buffer) {
        int nameTypeFlag = buffer.readUnsignedByte();
        if ((nameTypeFlag & 0x1) != 0) {
            this.namesAsLong = true;
        }
        if ((nameTypeFlag & 0x2) != 0) {
            this.namesAsString = true;
        }
        this.data = buffer.readLong();
        this.nextUpdateNumber = buffer.readLong();
        this.clanName = buffer.readString();
        buffer.readUnsignedByte();
        this.minRankToKick = buffer.readByte();
        this.guestsTalk = buffer.readByte();
        this.numPlayers = buffer.readUnsignedShort();
        if (this.numPlayers > 0) {
            this.players = new ClanChannelPlayer[this.numPlayers];
            for (int i_4 = 0; i_4 < this.numPlayers; i_4++) {
                ClanChannelPlayer player = new ClanChannelPlayer();
                if (this.namesAsLong) {
                    buffer.readLong();
                }
                if (this.namesAsString) {
                    player.name = buffer.readString();
                }
                player.rank = buffer.readByte();
                player.world = buffer.readUnsignedShort();
                this.players[i_4] = player;
            }
        }
    }

    void method12105(ClanChannelPlayer class57_1) {
        if (this.players == null || this.numPlayers >= this.players.length) {
            this.method12112(this.numPlayers + 5);
        }
        this.players[++this.numPlayers - 1] = class57_1;
        this.sortedNameIndices = null;
    }

    void method12112(int i_1) {
        if (this.players != null) {
            Class503.method8359(this.players, 0, this.players = new ClanChannelPlayer[i_1], 0, this.numPlayers);
        } else {
            this.players = new ClanChannelPlayer[i_1];
        }
    }

    public static void method12114(int i_0) {
        if (i_0 == 37) {
            Class291_Sub1.aFloat3462 = 3.0F;
        } else if (i_0 == 50) {
            Class291_Sub1.aFloat3462 = 4.0F;
        } else if (i_0 == 75) {
            Class291_Sub1.aFloat3462 = 6.0F;
        } else if (i_0 == 100) {
            Class291_Sub1.aFloat3462 = 8.0F;
        } else if (i_0 == 200) {
            Class291_Sub1.aFloat3462 = 16.0F;
        }
        Class291_Sub1.anInt8016 = -1;
        Class291_Sub1.anInt8016 = -1;
    }

    static void method12117(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (i_0 == i_2 && i_3 == i_1 && i_4 == i_6 && i_5 == i_7) {
            AnimationIndexLoader.method11220(i_0, i_1, i_6, i_7, i_8, (byte) 47);
        } else {
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
                AnimationIndexLoader.method11220(i_10, i_11, i_33, i_34, i_8, (byte) 85);
                i_10 = i_33;
                i_11 = i_34;
            }
        }
    }
}
