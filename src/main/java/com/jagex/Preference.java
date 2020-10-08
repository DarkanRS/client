package com.jagex;

import java.util.Calendar;

public abstract class Preference {

    protected int anInt5578;
    protected GamePreferences manager;

    Preference(int i_1, GamePreferences class282_sub54_2) {
        anInt5578 = i_1;
        manager = class282_sub54_2;
    }

    Preference(GamePreferences class282_sub54_1) {
        manager = class282_sub54_1;
        anInt5578 = getDefaultValue();
    }

    public static String method7788(long long_0, int i_2) {
        Calendar calendar_5;
        if (true) {
            SkyboxIndexLoader.method5083(long_0);
            calendar_5 = Class407.aCalendar4846;
        } else {
            Class155.method2634(long_0);
            calendar_5 = Class407.aCalendar4848;
        }

        int i_6 = calendar_5.get(Calendar.DATE);
        int i_7 = calendar_5.get(Calendar.MONTH);
        int i_8 = calendar_5.get(Calendar.YEAR);
        int i_9 = calendar_5.get(Calendar.HOUR_OF_DAY);
        int i_10 = calendar_5.get(Calendar.MINUTE);
        return i_2 == 3 ? ConnectionInfo.method7499(long_0) : Integer.toString(i_6 / 10) + i_6 % 10 + "-" + Class407.aStringArrayArray4849[i_2][i_7] + "-" + i_8 + " " + i_9 / 10 + i_9 % 10 + ":" + i_10 / 10 + i_10 % 10;
    }

    static void method7789() {
        if (Class393.preferences.aPreference_Sub3_8199.method12632() == 1) {
            IndexLoaders.MAP_REGION_LOADER_THREAD.method6049(new Class335(Class256.aClass256_3152, null));
        } else {
            IndexLoaders.MAP_REGION_DECODER.method4547();
            QuickchatFiller.method1139();
        }

    }

    abstract int getDefaultValue();

    void setPref(int i_1) {
        if (checkValid(i_1) != 3) {
            setValue(i_1);
        }

    }

    abstract void setValue(int var1);

    abstract int checkValid(int var1);

}
