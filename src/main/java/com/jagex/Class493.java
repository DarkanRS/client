package com.jagex;


public class Class493 {

    Class493() throws Throwable {
        throw new Error();
    }

    public static void sendCheckEmailPacket(String string_0) {
        if (client.GAME_STATE == GameState.IN_ACCOUNT_CREATION) {
            TCPPacket message = TCPPacket.createPacket(ClientProt.CHECK_EMAIL_VALIDITY, client.LOBBY_CONNECTION_CONTEXT.outKeys);
            message.buffer.writeShort(0);
            int start = message.buffer.index;
            message.buffer.writeString(string_0);
            message.buffer.index += 7;
            message.buffer.encryptWithXtea(Class14.ACCOUNT_CREATION_ISAAC_KEYS, start, message.buffer.index);
            message.buffer.writeLength(message.buffer.index - start);
            client.LOBBY_CONNECTION_CONTEXT.queuePacket(message);
            Class404.aClass466_4831 = Class466.aClass466_5564;
        }

    }

}
