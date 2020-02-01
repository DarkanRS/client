package com.jagex;
import java.util.Locale;

public enum Language implements Identifiable {

	ENGLISH("EN", "en", "English", ServerEnvironment.LIVE, 0, "GB"),
    GERMAN("DE", "de", "German", ServerEnvironment.LIVE, 1, "DE"),
    FRENCH("FR", "fr", "French", ServerEnvironment.LIVE, 2, "FR"),
    PORTUGESE("PT", "pt", "Portuguese", ServerEnvironment.LIVE, 3, "BR"),
    DUTCH("NL", "nl", "Dutch", ServerEnvironment.WTWIP, 4, "NL"),
    SPANISH("ES", "es", "Spanish", ServerEnvironment.WTWIP, 5, "ES");
	
    static Language[] aClass495Array5796;

    String aString5806;
    String aString5803;
    int anInt5804;
    Locale aLocale5805;

    static {
        Language[] arr_0 = values();
        aClass495Array5796 = new Language[arr_0.length];
        Language[] arr_1 = arr_0;
        for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
            Language xlanguage_3 = arr_1[i_2];
            if (aClass495Array5796[xlanguage_3.anInt5804] != null) {
                throw new IllegalStateException();
            }
            aClass495Array5796[xlanguage_3.anInt5804] = xlanguage_3;
        }
    }

    Language(String string_1, String string_2, String string_3, ServerEnvironment class496_4, int i_5, String string_6) {
        this.aString5806 = string_1;
        this.aString5803 = string_2;
        this.anInt5804 = i_5;
        Locale locale_7 = null;
        if (string_6 != null) {
            locale_7 = new Locale(this.method8276(1011487553), string_6);
        }
        if (locale_7 != null) {
            this.aLocale5805 = locale_7;
        } else {
            this.aLocale5805 = new Locale(this.method8276(1390953905));
        }
    }

    public String method8276(int i_1) {
        return this.aString5803;
    }

    public int getValue() {
        return this.anInt5804;
    }

    public static Language method8278(int i_0, int i_1) {
        return i_0 >= 0 && i_0 < aClass495Array5796.length ? aClass495Array5796[i_0] : null;
    }

    public String toString() {
        return this.method8276(1589376579).toLowerCase(Locale.ENGLISH);
    }

    public Locale method8293() {
        return this.aLocale5805;
    }
}
