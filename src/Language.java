import java.util.Locale;

public class Language implements Identifiable {

    public static Language aClass495_5795;

    public static Language aClass495_5802;

    public static Language aClass495_5801;

    public static Language aClass495_5797;

    static Language aClass495_5799;

    public static Language aClass495_5800;

    static Language[] aClass495Array5796;

    String aString5806;

    String aString5803;

    int anInt5804;

    Locale aLocale5805;

    static {
        aClass495_5795 = new Language("EN", "en", "English", ServerEnvironment.aClass496_5813, 0, "GB");
        aClass495_5802 = new Language("DE", "de", "German", ServerEnvironment.aClass496_5813, 1, "DE");
        aClass495_5801 = new Language("FR", "fr", "French", ServerEnvironment.aClass496_5813, 2, "FR");
        aClass495_5797 = new Language("PT", "pt", "Portuguese", ServerEnvironment.aClass496_5813, 3, "BR");
        aClass495_5799 = new Language("NL", "nl", "Dutch", ServerEnvironment.aClass496_5807, 4, "NL");
        aClass495_5800 = new Language("ES", "es", "Spanish", ServerEnvironment.aClass496_5807, 5, "ES");
        Language[] arr_0 = method8294(135762264);
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

    public int method75() {
        return -1324357023 * this.anInt5804 * 411974049;
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

    public int method76() {
        return -1324357023 * this.anInt5804 * 411974049;
    }

    public Locale method8293() {
        return this.aLocale5805;
    }

    public static Language[] method8294(int i_0) {
        return new Language[] { aClass495_5795, aClass495_5801, aClass495_5800, aClass495_5797, aClass495_5802, aClass495_5799 };
    }
}
