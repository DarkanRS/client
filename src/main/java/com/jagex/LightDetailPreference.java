package com.jagex;

public class LightDetailPreference extends Preference {

    public LightDetailPreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public LightDetailPreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public static void method12790(boolean mainCC, int playerIndex) {
        ClanChannel cc = mainCC ? Class113.CLAN_CHANNEL : AsyncConnection.LISTENED_CLAN_CHANNEL;
        if (cc != null && playerIndex >= 0 && playerIndex < cc.numPlayers) {
            ClanChannelPlayer ccPlayer = cc.players[playerIndex];
            if (ccPlayer.rank == -1) {
                String ccPlayerName = ccPlayer.name;
                BufferedConnectionContext connection = Preference_Sub20.getConnectionContext();
                TCPPacket packet = Class271.createPacket(ClientProt.CLANCHANNEL_KICKUSER, connection.isaac);
                packet.buffer.writeByte(3 + ChatLine.getLength(ccPlayerName));
                packet.buffer.writeByte(mainCC ? 1 : 0);
                packet.buffer.writeShort(playerIndex);
                packet.buffer.writeString(ccPlayerName);
                connection.queuePacket(packet);
            }
        }

    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
    }

    public void method12785() {
        if (anInt5578 != 1 && anInt5578 != 0) {
            anInt5578 = getDefaultValue();
        }

    }

    @Override
    int getDefaultValue() {
        return 1;
    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

    int method7786() {
        return 1;
    }

    public int method12786() {
        return anInt5578;
    }

    void method7780(int i_1) {
        anInt5578 = i_1 * -754033619 * -859024475;
    }

    int method7784() {
        return 1;
    }

    int method7787() {
        return 1;
    }

}
