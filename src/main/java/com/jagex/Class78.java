package com.jagex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Class78 {

    static HashMap<String, TimeZone> aHashMap768 = new HashMap<>();

    static Map<Language, ConcurrentLinkedQueue<SimpleDateFormat>> aMap766;

    static {
        Calendar.getInstance(method1375());
    }

    Class78() throws Throwable {
        throw new Error();
    }

    public static String method1372(Date date_0, String string_1) {
        return method1382(date_0, string_1, method1373(), Language.ENGLISH);
    }

    static TimeZone method1373() {
        return method1375();
    }

    static TimeZone method1375() {
        HashMap<String, TimeZone> hashmap_2 = aHashMap768;
        synchronized (aHashMap768) {
            TimeZone timezone_3 = aHashMap768.get("Europe/London");
            if (timezone_3 == null) {
                timezone_3 = TimeZone.getTimeZone("Europe/London");
                aHashMap768.put("Europe/London", timezone_3);
            }
            return timezone_3;
        }
    }

    static String method1382(Date date_0, String string_1, TimeZone timezone_2, Language xlanguage_3) {
        if (aMap766 == null) {
            aMap766 = new HashMap<>(6);
            Language[] arr_5 = Language.values();
            for (int i_6 = 0; i_6 < arr_5.length; i_6++) {
                Language xlanguage_7 = arr_5[i_6];
                aMap766.put(xlanguage_7, new ConcurrentLinkedQueue<SimpleDateFormat>());
            }
        }
        ConcurrentLinkedQueue<SimpleDateFormat> concurrentlinkedqueue_9 = aMap766.get(xlanguage_3);
        SimpleDateFormat simpledateformat_8 = concurrentlinkedqueue_9.poll();
        if (simpledateformat_8 == null) {
            simpledateformat_8 = new SimpleDateFormat(string_1, xlanguage_3.method8293());
        } else {
            simpledateformat_8.applyPattern(string_1);
        }
        simpledateformat_8.setTimeZone(timezone_2);
        String string_10 = simpledateformat_8.format(date_0);
        concurrentlinkedqueue_9.add(simpledateformat_8);
        return string_10;
    }

    static void method1384() {
        if (client.aByteArray7152 != null) {
            MapSpriteDefinitions.method7022();
        } else if (Class9.anInt76 != -1) {
            Class14.method537();
        } else {
            ParticleArchive1Def.worldLogin(Class9.aString99, Class9.aString102);
        }
    }

    static int method1386(Class413 class413_0) {
        if (class413_0 == null) {
            return 12;
        } else {
            switch (class413_0.anInt4972) {
                case 5:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    static void method1388(int i_0, int i_1, int i_2, int i_3, int i_4) {
        int i_01 = i_0;
        int i_11 = i_1;
        int i_21 = i_2;
        int i_31 = i_3;
        if (i_21 <= Class532_Sub1.anInt7068 && i_31 >= Class532_Sub1.anInt7070) {
            boolean bool_6;
            if (i_01 < Class532_Sub1.anInt7071) {
                i_01 = Class532_Sub1.anInt7071;
                bool_6 = false;
            } else if (i_01 > Class532_Sub1.anInt7069) {
                i_01 = Class532_Sub1.anInt7069;
                bool_6 = false;
            } else {
                bool_6 = true;
            }
            boolean bool_7;
            if (i_11 < Class532_Sub1.anInt7071) {
                i_11 = Class532_Sub1.anInt7071;
                bool_7 = false;
            } else if (i_11 > Class532_Sub1.anInt7069) {
                i_11 = Class532_Sub1.anInt7069;
                bool_7 = false;
            } else {
                bool_7 = true;
            }
            if (i_21 >= Class532_Sub1.anInt7070) {
                KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_21++], i_01, i_11, i_4);
            } else {
                i_21 = Class532_Sub1.anInt7070;
            }
            if (i_31 <= Class532_Sub1.anInt7068) {
                KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_31--], i_01, i_11, i_4);
            } else {
                i_31 = Class532_Sub1.anInt7068;
            }
            int i_8;
            if (bool_6 && bool_7) {
                for (i_8 = i_21; i_8 <= i_31; i_8++) {
                    int[] ints_9 = Class532_Sub1.anIntArrayArray7072[i_8];
                    ints_9[i_01] = ints_9[i_11] = i_4;
                }
            } else if (bool_6) {
                for (i_8 = i_21; i_8 <= i_31; i_8++) {
                    Class532_Sub1.anIntArrayArray7072[i_8][i_01] = i_4;
                }
            } else if (bool_7) {
                for (i_8 = i_21; i_8 <= i_31; i_8++) {
                    Class532_Sub1.anIntArrayArray7072[i_8][i_11] = i_4;
                }
            }
        }
    }
}
