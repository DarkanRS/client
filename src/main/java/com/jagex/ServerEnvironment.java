package com.jagex;

import com.jagex.clans.settings.ChangeClanSetting;

public enum ServerEnvironment implements Identifiable {

    LOCAL("LOCAL", 4),
    WTWIP("WTWIP", 3),
    WTI("WTI", 5),
    WTQA("WTQA", 2),
    WTRC("WTRC", 1),
    INTBETA("INTBETA", 6),
    LIVE("LIVE", 0);

    final String aString5815;

    final int anInt5814;

    ServerEnvironment(String string_1, int i_3) {
        aString5815 = string_1;
        anInt5814 = i_3;
    }

    public static boolean method8308(ServerEnvironment class496_0) {
        return class496_0 == WTRC || class496_0 == WTQA || class496_0 == WTWIP || class496_0 == WTI || class496_0 == INTBETA;
    }

    static void updateRandomDatUID192(ByteBuf data, int i_1) {
        if (Engine.PLAYER_UID192 != null) {
            try {
                Engine.PLAYER_UID192.method7347(0L);
                Engine.PLAYER_UID192.write(data.buffer, i_1, 24);
            } catch (Exception ignored) {
            }
        }
    }

    static int method8313() {
        byte b_1;
        if (Engine.MAX_MEMORY >= 96) {
            int i_2 = Class241.getCPUProfile();
            if (i_2 <= 104) {
                EquipmentDefaults.method11248();
                b_1 = 4;
            } else if (i_2 <= 504) {
                Node_Sub40.method13300();
                b_1 = 3;
            } else if (i_2 <= 1002) {
                Class119.method2077();
                b_1 = 2;
            } else {
                MaterialProp14.method15393();
                b_1 = 1;
            }
        } else {
            MaterialProp14.method15393();
            b_1 = 1;
        }
        if (Class393.preferences.currentToolkit.getValue() != 0) {
            Class393.preferences.setValue(Class393.preferences.toolKit, 0);
            ParticleProducer.switchRenderType(0, false);
        } else {
            Class393.preferences.method13505(Class393.preferences.currentToolkit, true);
        }
        Class190.savePreferences();
        return b_1;
    }

    public static void method8314(String string_0, int port) {
        if (ConnectionInfo.LOBBY_CONNECTION_INFO == null) {
            ConnectionInfo.LOBBY_CONNECTION_INFO = new ConnectionInfo();
        }
        ConnectionInfo.LOBBY_CONNECTION_INFO.host = string_0;
        ConnectionInfo.LOBBY_CONNECTION_INFO.worldId = port + 1099;
        ConnectionInfo.LOBBY_CONNECTION_INFO.anInt5434 = ConnectionInfo.LOBBY_CONNECTION_INFO.worldId;
        ConnectionInfo.LOBBY_CONNECTION_INFO.anInt5437 = ConnectionInfo.LOBBY_CONNECTION_INFO.worldId;
    }

    static void pulseSubInterfaces() {
        if (client.BASE_WINDOW_ID != -1) {
            int mouseX = Class163.mouseRecorder.getMouseX();
            int mouseY = Class163.mouseRecorder.getMouseY();
            MouseRecord class282_sub53_3 = (MouseRecord) client.mouseRecords.head();
            if (class282_sub53_3 != null) {
                mouseX = class282_sub53_3.getX();
                mouseY = class282_sub53_3.getY();
            }
            if (client.aClass118_7257 != null && InputSubscriberType.aClass118_2763 == client.aClass118_7247) {
                client.aBool7403 = true;
                client.anInt7432 = 0;
                client.anInt7265 = 0;
                client.anInt7367 = ChangeClanSetting.BASE_WINDOW_WIDTH;
                client.anInt7476 = client.BASE_WINDOW_HEIGHT * -969250379;
            }
            LightIntensityIndexLoader.method7313(null, client.BASE_WINDOW_ID, 0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH, client.BASE_WINDOW_HEIGHT * -969250379, 0, 0, mouseX, mouseY);
            if (MaterialPropTexture.aClass118_9884 != null) {
                BillboardDefinitions.method6170(mouseX, mouseY);
            }
        }
    }

    @Override
    public int getValue() {
        return anInt5814;
    }
}
