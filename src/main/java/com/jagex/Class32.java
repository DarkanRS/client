package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;

public class Class32 {

    Interface4 anInterface4_376;
    Class70 aClass70_377;
    Class76 aClass76_373;
    Class158_Sub1 aClass158_Sub1_374;
    Interface29 anInterface29_363;
    Interface9 anInterface9_364;
    Interface29 anInterface29_372;
    Interface9 anInterface9_368;
    Interface29 anInterface29_366;
    Interface9 anInterface9_369;
    Interface8 anInterface8_362;
    int anInt378;
    Vector<Class55> aVector375 = new Vector<Class55>();
    HardwareRenderer aGraphicalRenderer_Sub2_371;
    int anInt367;
    int anInt365;
    boolean aBool370;

    Class32(HardwareRenderer class505_sub2_1, int i_2, int i_3) {
        aGraphicalRenderer_Sub2_371 = class505_sub2_1;
        aClass76_373 = Class76.aClass76_751;
        anInt367 = i_2;
        anInt365 = i_3;
    }

    boolean method816(Class55 class55_1) {
        return method821(aVector375.size(), class55_1);
    }

    void method817() {
        if (anInterface4_376 == null) {
            anInterface4_376 = aGraphicalRenderer_Sub2_371.method13994(false);
            anInterface4_376.method31(12, 4);
            ByteBuffer bytebuffer_1 = aGraphicalRenderer_Sub2_371.aByteBuffer8838;
            bytebuffer_1.clear();
            bytebuffer_1.putFloat(0.0F);
            bytebuffer_1.putFloat(1.0F);
            bytebuffer_1.putFloat(2.0F);
            anInterface4_376.method42(0, bytebuffer_1.position(), aGraphicalRenderer_Sub2_371.aLong8695);
            aClass70_377 = aGraphicalRenderer_Sub2_371.method13995(new Class72[]{new Class72(Class69.aClass69_691)});
        }

    }

    void method818() {
        aClass158_Sub1_374.method212();
        anInterface9_364.method26();
        anInterface9_368.method26();
        anInterface9_369.method26();
        anInterface29_363.method26();
        anInterface29_372.method26();
        anInterface29_366.method26();
        anInterface8_362.method26();
        int i_1 = aVector375.size();

        for (int i_2 = 0; i_2 < i_1; i_2++) {
            Class55 class55_3 = aVector375.elementAt(i_2);
            class55_3.method1110();
        }

    }

    void method819() {
        method817();
        switch (anInt378) {
            case 0:
                aClass76_373 = Class76.aClass76_751;
                break;
            case 1:
                aClass76_373 = Class76.aClass76_755;
                break;
            case 2:
                aClass76_373 = Class76.aClass76_758;
                break;
            default:
                throw new RuntimeException();
        }

        aClass158_Sub1_374 = aGraphicalRenderer_Sub2_371.method8418();
        anInterface29_363 = aGraphicalRenderer_Sub2_371.method14064(Class150.aClass150_1949, aClass76_373, anInt367, anInt365);
        anInterface9_364 = anInterface29_363.method200();
        anInterface29_372 = aGraphicalRenderer_Sub2_371.method14064(Class150.aClass150_1949, aClass76_373, anInt367, anInt365);
        anInterface9_368 = anInterface29_372.method200();
        anInterface29_366 = aGraphicalRenderer_Sub2_371.method14064(Class150.aClass150_1949, aClass76_373, anInt367, anInt365);
        anInterface9_369 = anInterface29_366.method200();
        anInterface8_362 = aGraphicalRenderer_Sub2_371.method8419(anInt367, anInt365);
        int i_1 = aVector375.size();

        for (int i_2 = 0; i_2 < i_1; i_2++) {
            Class55 class55_3 = aVector375.elementAt(i_2);
            class55_3.method1102();
        }

    }

    void method820() {
        aGraphicalRenderer_Sub2_371.method14161(0, anInterface4_376);
        aGraphicalRenderer_Sub2_371.method13996(aClass70_377);
        aGraphicalRenderer_Sub2_371.method13923(Class352.aClass352_4098, 0, 1);
    }

    boolean method821(int i_1, Class55 class55_2) {
        if (!class55_2.method1098() && !class55_2.method1097()) {
            method822(class55_2);
            return true;
        } else {
            aVector375.insertElementAt(class55_2, i_1);
            class55_2.method1102();
            int i_3 = class55_2.method1106();
            if (i_3 > anInt378) {
                anInt378 = i_3;
            }

            class55_2.aBool513 = true;
            return true;
        }
    }

    void method822(Class55 class55_1) {
        class55_1.method1110();
        class55_1.aBool513 = false;
        aVector375.removeElement(class55_1);
    }

    void method824() {
        aGraphicalRenderer_Sub2_371.method14003();
        aGraphicalRenderer_Sub2_371.method13904(0);
        aGraphicalRenderer_Sub2_371.method13947(1);
        aGraphicalRenderer_Sub2_371.L();
        aClass158_Sub1_374.method13765(null);
        aGraphicalRenderer_Sub2_371.method13919();
        int i_1 = aVector375.size();
        anInterface29_366.method54();

        for (int i_2 = 0; i_2 < i_1; i_2++) {
            Class55 class55_3 = aVector375.elementAt(i_2);
            int i_4 = class55_3.method1100();
            boolean bool_5 = i_2 == i_1 - 1;

            for (int i_6 = 0; i_6 < i_4; i_6++) {
                if (bool_5 && i_6 == i_4 - 1) {
                    aGraphicalRenderer_Sub2_371.method8416(aClass158_Sub1_374);
                } else {
                    aClass158_Sub1_374.method13759(0, anInterface9_368);
                }

                Interface29 interface29_7 = anInterface29_363;
                if (i_6 == 0) {
                    interface29_7 = anInterface29_366;
                }

                class55_3.method1103(i_6, aClass158_Sub1_374, interface29_7, anInterface29_366);
                method820();
                class55_3.method1104();
                Interface29 interface29_8 = anInterface29_363;
                anInterface29_363 = anInterface29_372;
                anInterface29_372 = interface29_8;
                Interface9 interface9_9 = anInterface9_364;
                anInterface9_364 = anInterface9_368;
                anInterface9_368 = interface9_9;
            }
        }

        aGraphicalRenderer_Sub2_371.method13904(1);
        aGraphicalRenderer_Sub2_371.method13947(0);
    }

    boolean method830(int i_3, int i_4) {
        if (aVector375.isEmpty()) {
            return false;
        } else {
            if (i_3 != anInt367 || i_4 != anInt365) {
                anInt367 = i_3;
                anInt365 = i_4;
                method818();
                method819();
            }

            aClass158_Sub1_374.method13759(0, anInterface9_369);
            if (anInterface8_362 != null) {
                aClass158_Sub1_374.method13765(anInterface8_362);
            }

            aGraphicalRenderer_Sub2_371.method8637(aClass158_Sub1_374);
            aGraphicalRenderer_Sub2_371.ba(3, -16777216);
            aGraphicalRenderer_Sub2_371.method13986(15);
            aGraphicalRenderer_Sub2_371.method13985();
            if (!aClass158_Sub1_374.method13764()) {
                throw new RuntimeException("");
            } else {
                aBool370 = true;
                return true;
            }
        }
    }

    void method833() {
        if (aBool370) {
            method824();
            aBool370 = false;
        }

    }

}
