package com.jagex;

import java.net.URL;

public class Class186 {

    static FontRenderer aFontRenderer_2348;
    static int anInt2349;

    Class186() throws Throwable {
        throw new Error();
    }

    public static boolean method3082(String string_0, int i_1, String string_2) {
        boolean bool_4;
        if (i_1 == 0) {
            try {
                if (!GroundItemStrategy.aString8069.startsWith("win")) {
                    throw new Exception();
                } else if (!string_0.startsWith("http://") && !string_0.startsWith("https://")) {
                    throw new Exception();
                } else {
                    String str_13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                    for (int i_6 = 0; i_6 < string_0.length(); i_6++) {
                        if (str_13.indexOf(string_0.charAt(i_6)) == -1) {
                            throw new Exception();
                        }
                    }

                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string_0 + "\"");
                    bool_4 = true;
                    return bool_4;
                }
            } catch (Throwable throwable_12) {
                return false;
            }
        } else if (i_1 == 1) {
            try {
                Object object_5 = Class441.method7375(SubInterface.suppliedApplet, string_2, new Object[]{(new URL(SubInterface.suppliedApplet.getCodeBase(), string_0)).toString()});
                bool_4 = object_5 != null;
                return bool_4;
            } catch (Throwable throwable_8) {
                return false;
            }
        } else if (i_1 == 2) {
            try {
                SubInterface.suppliedApplet.getAppletContext().showDocument(new URL(SubInterface.suppliedApplet.getCodeBase(), string_0), "_blank");
                bool_4 = true;
                return bool_4;
            } catch (Exception exception_9) {
                return false;
            }
        } else if (i_1 == 3) {
            try {
                Class441.method7377(SubInterface.suppliedApplet, "loggedout");
            } catch (Throwable ignored) {
            }

            try {
                SubInterface.suppliedApplet.getAppletContext().showDocument(new URL(SubInterface.suppliedApplet.getCodeBase(), string_0), "_top");
                bool_4 = true;
                return bool_4;
            } catch (Exception exception_10) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    static void method3083() {
        Class9.CURRENT_CONNECTION_CONTEXT.clearAllQueuedPackets();
        Class9.CURRENT_CONNECTION_CONTEXT.recievedBuffer.index = 0;
        Class9.CURRENT_CONNECTION_CONTEXT.lastPacket = null;
        Class9.CURRENT_CONNECTION_CONTEXT.secondLastPacket = null;
        Class9.CURRENT_CONNECTION_CONTEXT.thirdLastPacket = null;
        Class9.CURRENT_CONNECTION_CONTEXT.idleReadPulses = 0;
        client.REBOOT_TIMER = 0;
        Class209_Sub1.method12916();
        client.anInt7434 = 0;
        client.FRIEND_COUNT = 0;
        client.FC_NAME = null;
        Class459.FC_PLAYER_COUNT = 0;
        Class467.FC_PLAYERS = null;
        Node_Sub13.GUEST_CLAN_SETTINGS = null;
        QuickchatFiller.CLAN_SETTINGS = null;
        Class237.method3990();

        for (int i_1 = 0; i_1 < 25; i_1++) {
            client.SKILL_LEVEL_VISIBLE[i_1] = 0;
            client.SKILL_LEVEL_ACTUAL[i_1] = 0;
            client.SKILL_XP[i_1] = 0;
        }

    }

    static void method3084() {
        Class197.NUM_PLAYER_INDICES = 0;

        for (int i_1 = 0; i_1 < 2048; i_1++) {
            Class197.aNode_Sub35Array2428[i_1] = null;
            Class197.playerMovementTypes[i_1] = MoveSpeed.WALKING.id;
            Class197.aClass4Array2430[i_1] = null;
        }

    }

}
