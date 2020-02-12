package com.jagex;

public class Preference_Sub17 extends Preference {

    public int checkValid(int i_1) {
        if (this.manager.getGame() == Game.darkan) {
            if (i_1 == 0) {
                if (this.manager.fog.method13417(-2085338596) == 1) {
                    return 2;
                }

                if (this.manager.textures.method12873(1169663488) == 1) {
                    return 2;
                }

                if (this.manager.water.getValue() > 0) {
                    return 2;
                }
            }

            return 1;
        } else {
            return 3;
        }
    }

    public Preference_Sub17(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    int method7786() {
        return 1;
    }

    int getDefaultValue() {
        return 1;
    }

    public boolean method12761() {
        return this.manager.getGame() == Game.darkan;
    }

    public int method12762(int i_1) {
        return this.anInt5578;
    }

    void setValue(int i_1) {
        this.anInt5578 = i_1;
    }

    public Preference_Sub17(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public int method7784(int i_1) {
        if (this.manager.getGame() == Game.darkan) {
            if (i_1 == 0) {
                if (this.manager.fog.method13417(-2146317040) == 1) {
                    return 2;
                }

                if (this.manager.textures.method12873(533294977) == 1) {
                    return 2;
                }

                if (this.manager.water.getValue() > 0) {
                    return 2;
                }
            }

            return 1;
        } else {
            return 3;
        }
    }

    void method7780(int i_1) {
        this.anInt5578 = -754033619 * i_1 * -859024475;
    }

    public void method12767() {
        if (this.manager.getGame() != Game.darkan) {
            this.anInt5578 = 1;
        }

        if (this.anInt5578 != 0 && this.anInt5578 != 1) {
            this.anInt5578 = this.getDefaultValue();
        }

    }

    int method7787() {
        return 1;
    }

}
