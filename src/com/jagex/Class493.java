package com.jagex;


public class Class493 {

    Class493() throws Throwable {
        throw new Error();
    }

    public static void sendCheckEmailPacket(String string_0) {
        if (client.gameState == 3) {
            TCPPacket message = Class271.createPacket(ClientProt.CHECK_EMAIL_VALIDITY, client.LOBBY_CONNECTION_CONTEXT.isaac);
            message.buffer.writeShort(0);
            int start = message.buffer.index;
            message.buffer.writeString(string_0);
            message.buffer.index += 7;
            message.buffer.encryptWithXtea(Class14.LOGIN_XTEAS, start, message.buffer.index);
            message.buffer.method13281(message.buffer.index - start);
            client.LOBBY_CONNECTION_CONTEXT.queuePacket(message);
            Class404.aClass466_4831 = Class466.aClass466_5564;
        }

    }

}
