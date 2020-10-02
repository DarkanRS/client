package com.jagex;

import java.io.IOException;

public class Exception_Sub3 extends Exception {

    public static void method15619(boolean bool_0) {
        MaterialPropTexture.method15391();
        if (GameState.loggedIn(client.GAME_STATE)) {
            BufferedConnectionContext[] arr_2 = client.aClass184Array7220;

            for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
                BufferedConnectionContext class184_4 = arr_2[i_3];
                ++class184_4.anInt2290;
                if (class184_4.anInt2290 < 50 && !bool_0) {
                    return;
                }

                class184_4.anInt2290 = 0;
                if (!class184_4.aBool2298 && class184_4.getConnection() != null) {
                    TCPPacket tcpmessage_5 = TCPPacket.createPacket(ClientProt.PING, class184_4.isaac);
                    class184_4.queuePacket(tcpmessage_5);

                    try {
                        class184_4.flush();
                    } catch (IOException ioexception_7) {
                        class184_4.aBool2298 = true;
                    }
                }
            }

            MaterialPropTexture.method15391();
        }

    }

}
