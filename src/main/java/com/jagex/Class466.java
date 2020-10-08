package com.jagex;

public enum Class466 implements Identifiable {

    aClass466_5569(-2),
    aClass466_5564(-3),
    aClass466_5565(2),
    aClass466_5563(3),
    aClass466_5567(21),
    aClass466_5568(20);

    final int anInt5566;

    Class466(int i_1) {
        anInt5566 = i_1;
    }

    static void method7776() {
        TCPPacket tcpmessage_1 = TCPPacket.createPacket(ClientProt.TRANSMITVAR_VERIFYID, client.GAME_CONNECTION_CONTEXT.isaac);
        tcpmessage_1.buffer.writeInt(client.anInt7221);
        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_1);
    }

    public static void method7777() {
        if (client.GAME_STATE == 0 && !JS5CacheFile.method3360() && !Class85.method1466()) {
            GameState.setGameState(7);
        }
    }

    static char method7778(char var_0) {
        return var_0 == 198 ? 'E' : (var_0 == 230 ? 'e' : (var_0 == 223 ? 's' : (var_0 == 338 ? 'E' : (var_0 == 339 ? 'e' : '\u0000'))));
    }

    @Override
    public int getValue() {
        return anInt5566;
    }
}
