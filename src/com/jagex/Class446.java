package com.jagex;

public class Class446 {

    public static int anInt5396;

    static Class194 aClass194_5416;

    public static Class446 aClass446_5386;

    public static Class446 aClass446_5412;

    public static Class446 aClass446_5387;

    public static Class446 aClass446_5388;

    public static Class446 aClass446_5389;

    public static Class446 aClass446_5415;

    public static Class446 aClass446_5385;

    public static Class446 aClass446_5392;

    public static Class446 aClass446_5390;

    public static Class446 aClass446_5394;

    public static Class446 aClass446_5395;

    public static Class446 aClass446_5397;

    public static Class446 aClass446_5393;

    public static Class446 aClass446_5413;

    public static Class446 aClass446_5399;

    public static Class446 aClass446_5400;

    public static Class446 aClass446_5401;

    public static Class446 aClass446_5402;

    public static Class446 aClass446_5403;

    public static Class446 TEXTURE_INDEX_LOADER;

    public static Class446 aClass446_5405;

    public static Class446 aClass446_5410;

    public static Class446 aClass446_5407;

    public static Class446 aClass446_5391;

    public static Class446 aClass446_5409;

    public static Class446 aClass446_5398;

    public static Class446 aClass446_5411;

    Interface41 anInterface41_5414;

    int anInt5408;

    Class445 aClass445_5406;

    static {
        aClass446_5386 = new Class446(Class445.aClass445_5381);
        aClass446_5412 = new Class446(Class445.aClass445_5383);
        aClass446_5387 = new Class446(Class445.aClass445_5383);
        aClass446_5388 = new Class446(Class445.aClass445_5383);
        aClass446_5389 = new Class446(Class445.aClass445_5383);
        aClass446_5415 = new Class446(Class445.aClass445_5383);
        aClass446_5385 = new Class446(Class445.aClass445_5383);
        aClass446_5392 = new Class446(Class445.aClass445_5381);
        aClass446_5390 = new Class446(Class445.aClass445_5381);
        aClass446_5394 = new Class446(Class445.aClass445_5381);
        aClass446_5395 = new Class446(Class445.aClass445_5381);
        aClass446_5397 = new Class446(Class445.aClass445_5381);
        aClass446_5393 = new Class446(Class445.aClass445_5381);
        aClass446_5413 = new Class446(Class445.aClass445_5381);
        aClass446_5399 = new Class446(Class445.aClass445_5381);
        aClass446_5400 = new Class446(Class445.aClass445_5381);
        aClass446_5401 = new Class446(Class445.aClass445_5381);
        aClass446_5402 = new Class446(Class445.aClass445_5381);
        aClass446_5403 = new Class446(Class445.aClass445_5381);
        TEXTURE_INDEX_LOADER = new Class446(Class445.aClass445_5381);
        aClass446_5405 = new Class446(Class445.aClass445_5381);
        aClass446_5410 = new Class446(Class445.aClass445_5381);
        aClass446_5407 = new Class446(Class445.aClass445_5380);
        aClass446_5391 = new Class446(Class445.aClass445_5381);
        aClass446_5409 = new Class446(Class445.aClass445_5381);
        aClass446_5398 = new Class446(Class445.aClass445_5381);
        aClass446_5411 = new Class446(Class445.aClass445_5382);
    }

    public static void method7430(Node node_0, Node node_1, int i_2) {
        if (node_0.prev != null) {
            node_0.remove();
        }
        node_0.prev = node_1.prev;
        node_0.next = node_1;
        node_0.prev.next = node_0;
        node_0.next.prev = node_0;
    }

    public int method7432() {
        return this.anInt5408;
    }

    public void initializeIndexLoader(Interface41 interface41_1, byte b_2) {
        if (interface41_1.method232() != this.aClass445_5406) {
            throw new IllegalArgumentException();
        } else {
            this.anInterface41_5414 = interface41_1;
        }
    }

    public static Class446[] method7436() {
        return new Class446[]{aClass446_5386, aClass446_5412, aClass446_5387, aClass446_5388, aClass446_5389, aClass446_5415, aClass446_5385, aClass446_5392, aClass446_5390, aClass446_5394, aClass446_5395, aClass446_5397, aClass446_5393, aClass446_5413, aClass446_5399, aClass446_5400, aClass446_5401, aClass446_5402, aClass446_5403, TEXTURE_INDEX_LOADER, aClass446_5405, aClass446_5410, aClass446_5407, aClass446_5391, aClass446_5409, aClass446_5398, aClass446_5411};
    }

    public void method7439(int i_1) {
        this.anInt5408 = i_1;
    }

    Class446(Class445 class445_1) {
        this.aClass445_5406 = class445_1;
        this.anInt5408 = 1;
    }

    public Interface41 method7443(int i_1) {
        return this.anInterface41_5414;
    }

    public static void method7447(String string_0, boolean bool_1, GraphicalRenderer graphicalrenderer_2, FontRenderer fontrenderer_3, FontMetrics fontmetrics_4, byte b_5) {
        boolean bool_6 = !Class174.aBool2135 || Class174.method2954(1454743484);
        if (bool_6) {
            int i_7;
            int i_8;
            int i_10;
            int i_11;
            if (Class174.aBool2135 && bool_6) {
                fontmetrics_4 = Class197.aClass414_2436;
                fontrenderer_3 = graphicalrenderer_2.createFont(fontmetrics_4, Class174.aClass91Array2132, true);
                i_7 = fontmetrics_4.method6951(string_0, 250, null, (byte) 127);
                i_8 = fontmetrics_4.method6972(string_0, 250, fontmetrics_4.verticalSpacing, null, 369575167);
                int i_15 = Class174.aClass91_2138.width;
                i_10 = i_15 + 4;
                i_7 += i_10 * 2;
                i_8 += i_10 * 2;
                if (i_7 < Class174.anInt2136) {
                    i_7 = Class174.anInt2136;
                }
                if (i_8 < Class208.anInt2662) {
                    i_8 = Class208.anInt2662;
                }
                i_11 = Class174.aClass356_2139.method6221(i_7, client.GAME_WIDTH, 1961089623) + Class174.anInt2134;
                int i_12 = Class174.aClass353_2140.method6198(i_8, client.GAME_HEIGHT, 1070310069) + Class174.anInt2133;
                graphicalrenderer_2.method8444(QuestIndexLoader.aClass91_2981, false).method2772(i_11 + Class174.aClass91_2141.width, i_12 + Class174.aClass91_2141.height, i_7 - Class174.aClass91_2141.width * 2, i_8 - Class174.aClass91_2141.height * 2, 1, 0, 0);
                graphicalrenderer_2.method8444(Class174.aClass91_2141, true).method2752(i_11, i_12);
                Class174.aClass91_2141.method1525();
                graphicalrenderer_2.method8444(Class174.aClass91_2141, true).method2752(i_7 + i_11 - i_15, i_12);
                Class174.aClass91_2141.method1526();
                graphicalrenderer_2.method8444(Class174.aClass91_2141, true).method2752(i_7 + i_11 - i_15, i_8 + i_12 - i_15);
                Class174.aClass91_2141.method1525();
                graphicalrenderer_2.method8444(Class174.aClass91_2141, true).method2752(i_11, i_8 + i_12 - i_15);
                Class174.aClass91_2141.method1526();
                graphicalrenderer_2.method8444(Class174.aClass91_2138, true).method2756(i_11, i_12 + Class174.aClass91_2141.height, i_15, i_8 - Class174.aClass91_2141.height * 2);
                Class174.aClass91_2138.method1527();
                graphicalrenderer_2.method8444(Class174.aClass91_2138, true).method2756(i_11 + Class174.aClass91_2141.width, i_12, i_7 - Class174.aClass91_2141.width * 2, i_15);
                Class174.aClass91_2138.method1527();
                graphicalrenderer_2.method8444(Class174.aClass91_2138, true).method2756(i_11 + i_7 - i_15, i_12 + Class174.aClass91_2141.height, i_15, i_8 - Class174.aClass91_2141.height * 2);
                Class174.aClass91_2138.method1527();
                graphicalrenderer_2.method8444(Class174.aClass91_2138, true).method2756(i_11 + Class174.aClass91_2141.width, i_8 + i_12 - i_15, i_7 - Class174.aClass91_2141.width * 2, i_15);
                Class174.aClass91_2138.method1527();
                fontrenderer_3.method378(string_0, i_11 + i_10, i_12 + i_10, i_7 - i_10 * 2, i_8 - i_10 * 2, Class434.anInt5329 | ~0xffffff, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 36);
                Class292.method5201(i_11, i_12, i_7, i_8);
            } else {
                i_7 = fontmetrics_4.method6951(string_0, 250, null, (byte) 107);
                i_8 = fontmetrics_4.method6949(string_0, 250, null) * 13;
                byte b_9 = 4;
                i_10 = b_9 + 6;
                i_11 = b_9 + 6;
                graphicalrenderer_2.B(i_10 - b_9, i_11 - b_9, b_9 + i_7 + b_9, i_8 + b_9 + b_9, -16777216, 0);
                graphicalrenderer_2.method8430(i_10 - b_9, i_11 - b_9, b_9 + i_7 + b_9, b_9 + i_8 + b_9, -1, 0);
                fontrenderer_3.method378(string_0, i_10, i_11, i_7, i_8, -1, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 14);
                Class292.method5201(i_10 - b_9, i_11 - b_9, b_9 + i_7 + b_9, b_9 + i_8 + b_9);
            }
            if (bool_1) {
                try {
                    graphicalrenderer_2.method8393((short) 2182);
                } catch (Exception_Sub3 exception_sub3_14) {
                }
            }
        }
    }
}
