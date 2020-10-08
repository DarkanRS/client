package com.jagex;

import java.util.Locale;

public enum Language implements Identifiable {
    ENGLISH("EN", "en", 0, "GB"),
    GERMAN("DE", "de", 1, "DE"),
    FRENCH("FR", "fr", 2, "FR"),
    PORTUGESE("PT", "pt", 3, "BR"),
    DUTCH("NL", "nl", 4, "NL"),
    SPANISH("ES", "es", 5, "ES");

    static final Language[] aClass495Array5796;

    static {
        Language[] arr_0 = values();
        aClass495Array5796 = new Language[arr_0.length];
        for (Language xlanguage_3 : arr_0) {
            if (aClass495Array5796[xlanguage_3.anInt5804] != null) {
                throw new IllegalStateException();
            }
            aClass495Array5796[xlanguage_3.anInt5804] = xlanguage_3;
        }
    }

    final String aString5806;
    final String aString5803;
    final int anInt5804;
    final Locale aLocale5805;

    Language(String string_1, String string_2, int i_5, String string_6) {
        aString5806 = string_1;
        aString5803 = string_2;
        anInt5804 = i_5;
        Locale locale_7 = null;
        if (string_6 != null) {
            locale_7 = new Locale(method8276(), string_6);
        }
        if (locale_7 != null) {
            aLocale5805 = locale_7;
        } else {
            aLocale5805 = new Locale(method8276());
        }
    }

    public static Language method8278(int i_0) {
        return i_0 >= 0 && i_0 < aClass495Array5796.length ? aClass495Array5796[i_0] : null;
    }

    public String method8276() {
        return aString5803;
    }

    @Override
    public int getValue() {
        return anInt5804;
    }

    public String toString() {
        return method8276().toLowerCase(Locale.ENGLISH);
    }

    public Locale method8293() {
        return aLocale5805;
    }
}
