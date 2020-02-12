package com.jagex;

public class SceneryShadowPreference extends Preference {

    public static int anInt7868;

    public SceneryShadowPreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public boolean method12622() {
        return this.manager.textures.method12873(-767175327) != 0;
    }

    int method7786() {
        return 2;
    }

    public int checkValid(int i_1) {
        return this.manager.textures.method12873(547920845) == 0 ? 3 : 1;
    }

    void setValue(int i_1) {
        this.anInt5578 = i_1;
    }

    public int method12624(byte b_1) {
        return this.anInt5578;
    }

    public int method7784(int i_1) {
        return this.manager.textures.method12873(1209563326) == 0 ? 3 : 1;
    }

    void method7780(int i_1) {
        this.anInt5578 = i_1 * -754033619 * -859024475;
    }

    int method7787() {
        return 2;
    }

    int getDefaultValue() {
        return 2;
    }

    public SceneryShadowPreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public void method12627() {
        if (this.manager.textures.method12873(-503019853) == 0) {
            this.anInt5578 = 0;
        }
        if (this.anInt5578 < 0 || this.anInt5578 > 2) {
            this.anInt5578 = this.getDefaultValue();
        }
    }

    public static WorldDescriptor method12629() {
        Class448.CURRENT_WORLD = 0;
        return CutsceneCameraMovement.getCurrentWorldDescriptor();
    }
}
