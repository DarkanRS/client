package com.jagex;

public class BrightnessPreference extends Preference {

    public BrightnessPreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public BrightnessPreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public static void method12869(boolean bool_0) {
        if (client.anInt7341 != 2 && client.anInt7341 != 1) {
            if (!bool_0) {
                CutsceneAction[] arr_2 = Class86.aCutsceneActionArray822;

                for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
                    CutsceneAction class96_4 = arr_2[i_3];
                    class96_4.method1593();
                }
            }

            client.anInt7341 = 2;
            NativeLibraryLoader.CUTSCENE_MAP_XTEAS = null;
            Class276.aNode_Sub35_3346 = null;
            client.aBool7321 = false;
            Class79.method1390();
            TCPPacket tcpmessage_5 = Class271.createPacket(ClientProt.CUTSCENE_FINISHED, client.GAME_CONNECTION_CONTEXT.isaac);
            tcpmessage_5.buffer.writeByte(bool_0 ? 1 : 0);
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_5);
        }

    }

    public void method12861() {
        if (anInt5578 < 0 || anInt5578 > 4) {
            anInt5578 = getDefaultValue();
        }

    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

    int method7784() {
        return 1;
    }

    void method7780(int i_1) {
        anInt5578 = -754033619 * i_1 * -859024475;
    }

    public int method12865() {
        return anInt5578;
    }

    @Override
    int getDefaultValue() {
        return 3;
    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
    }

    int method7786() {
        return 3;
    }

    int method7787() {
        return 3;
    }

}
