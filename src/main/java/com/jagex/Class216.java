package com.jagex;

public class Class216 {

    static {
        Math.sqrt(131072.0D);
    }

    Class216() throws Throwable {
        throw new Error();
    }

    static void method3675() {
        if (Class260.aClass116_3229 != null && !Class260.aClass116_3229.isLoaded() && Class260.aClass116_3229.method1963()) {
            TCPPacket tcpmessage_1 = TCPPacket.createPacket(ClientProt.SONG_LOADED, client.GAME_CONNECTION_CONTEXT.isaac);
            tcpmessage_1.buffer.writeInt(Class260.aClass116_3229.musicId);
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_1);
        }
    }

    static boolean method3677() {
        return Class20.anInt169 > 0;
    }
}
