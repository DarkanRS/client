package com.jagex;

import java.io.IOException;
import java.net.Socket;

import com.Loader;

public abstract class Class434 {

    static int anInt5329;
    String aString5330;
    int anInt5331;

    public static void method7292() {
        Class373.method6365();
        Class236.aClass534_Sub2_2911.method11417();
        Class236.aClass534_Sub1_2913.method11417();
        TCPPacket tcpmessage_1;
        int i_2;
        if (client.maximumHeldKeys > 0) {
            tcpmessage_1 = TCPPacket.createPacket(ClientProt.KEY_PRESS, client.GAME_CONNECTION_CONTEXT.outKeys);
            tcpmessage_1.buffer.writeShort(client.maximumHeldKeys * 4);

            for (i_2 = 0; i_2 < client.maximumHeldKeys; i_2++) {
                KeyRecord interface16_3 = client.keyRecords[i_2];
                long long_4 = interface16_3.method119() - Class236.aLong2910;
                if (long_4 > 16777215L) {
                    long_4 = 16777215L;
                }

                Class236.aLong2910 = interface16_3.method119();
                tcpmessage_1.buffer.writeByte(interface16_3.getCode());
                tcpmessage_1.buffer.write24BitInt((int) long_4);
            }

            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_1);
        }

        if (Class236.anInt2912 > 0) {
            --Class236.anInt2912;
        }

        if (client.aBool7371 && Class236.anInt2912 <= 0) {
            Class236.anInt2912 = 20;
            client.aBool7371 = false;
            tcpmessage_1 = TCPPacket.createPacket(ClientProt.MOVE_CAMERA, client.GAME_CONNECTION_CONTEXT.outKeys);
            tcpmessage_1.buffer.writeShortLE128((int) client.camAngleX >> 3);
            tcpmessage_1.buffer.writeShort128((int) client.camAngleY >> 3);
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_1);
        }

        if (Class236.aBool2909 != IFSubObjectPosition.appletHasFocus) {
            Class236.aBool2909 = IFSubObjectPosition.appletHasFocus;
            tcpmessage_1 = TCPPacket.createPacket(ClientProt.CLIENT_FOCUS, client.GAME_CONNECTION_CONTEXT.outKeys);
            tcpmessage_1.buffer.writeByte(IFSubObjectPosition.appletHasFocus ? 1 : 0);
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_1);
        }

        if (!client.aBool7175) {
            tcpmessage_1 = TCPPacket.createPacket(ClientProt.SEND_PREFERENCES, client.GAME_CONNECTION_CONTEXT.outKeys);
            tcpmessage_1.buffer.writeByte(0);
            i_2 = tcpmessage_1.buffer.index;
            ByteBuf rsbytebuffer_6 = Class393.preferences.encode();
            tcpmessage_1.buffer.writeBytes(rsbytebuffer_6.buffer, 0, rsbytebuffer_6.index);
            tcpmessage_1.buffer.writeIndex(tcpmessage_1.buffer.index - i_2);
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_1);
            client.aBool7175 = true;
        }

    }

    public abstract Socket method7280() throws IOException;

    public abstract Socket method7281() throws IOException;

    public abstract Socket method7282() throws IOException;

    public abstract Socket method7287() throws IOException;

    Socket method7291() throws IOException {
        return new Socket(Loader.IP_ADDRESS, Loader.LOBBY_PORT);
    }

}
