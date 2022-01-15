package com.jagex;

import java.util.HashMap;

public class Class501 {

    static int anInt5828;

    static {
        new HashMap();
    }

    Class501() throws Throwable {
        throw new Error();
    }

    static void method8350() {
        Class9.CURRENT_CONNECTION_CONTEXT.clearAllQueuedPackets();
        Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
        Class9.CURRENT_CONNECTION_CONTEXT.currentPacket = null;
        Class9.CURRENT_CONNECTION_CONTEXT.lastPacket = null;
        Class9.CURRENT_CONNECTION_CONTEXT.secondLastPacket = null;
        Class9.CURRENT_CONNECTION_CONTEXT.thirdLastPacket = null;
        Class9.CURRENT_CONNECTION_CONTEXT.currentPacketSize = 0;
        Class9.CURRENT_CONNECTION_CONTEXT.idleReadPulses = 0;
        client.REBOOT_TIMER = 0;
        Class350.method6189();
        Class256.method4416();

        int i_1;
        for (i_1 = 0; i_1 < 2048; i_1++) {
            client.players[i_1] = null;
        }

        VertexNormal.MY_PLAYER = null;

        for (i_1 = 0; i_1 < client.anInt7210; i_1++) {
            PathingEntity animable_2 = (PathingEntity) client.NPC_ARRAY[i_1].anObject8068;
            if (animable_2 != null) {
                animable_2.faceEntity = -1;
            }
        }

        FontRenderer_Sub2.method14262();
        NativeLibraryLoader.anInt3240 = 2;
        Class86.anInt833 = -1;
        PingRequester.anInt5864 = -1;
        GameState.setGameState(GameState.UNK_13);

        for (i_1 = 0; i_1 < 107; i_1++) {
            client.aBoolArray7443[i_1] = true;
        }

        Class388.method6692();
        PingRequest.CURRENT_REQUEST = null;
        Class28.aLong351 = 0L;
        FontMetrics.method6989();
    }

}
