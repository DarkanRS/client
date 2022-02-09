package com.jagex;

public class Class149_Sub4 extends Class149 {

    int anInt9391;

    int anInt9393;

    int anInt9392;

    int anInt9394;

    Class149_Sub4(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        super(i_5, i_6, i_7);
        anInt9391 = i_1;
        anInt9393 = i_2;
        anInt9392 = i_3;
        anInt9394 = i_4;
    }

    static void method14661() {
        for (Object o : client.aClass465_7334) {
            CacheableNode_Sub10 class282_sub50_sub10_2 = (CacheableNode_Sub10) o;
            SpotAnimation class521_sub1_sub1_sub4_3 = class282_sub50_sub10_2.aTransform_Sub1_Sub1_Sub4_9636;
            class521_sub1_sub1_sub4_3.method15926();
            if (class521_sub1_sub1_sub4_3.method15928()) {
                class282_sub50_sub10_2.unlink();
                class521_sub1_sub1_sub4_3.method15931();
            }
        }
    }

    static String method14662(int i_0, boolean bool_2) {
        if (true) {
            if (bool_2 && i_0 >= 0) {
                int i_4 = 2;
                for (int i_5 = i_0 / 10; i_5 != 0; i_4++) {
                    i_5 /= 10;
                }
                char[] arr_6 = new char[i_4];
                arr_6[0] = 43;
                for (int i_7 = i_4 - 1; i_7 > 0; --i_7) {
                    int i_8 = i_0;
                    i_0 /= 10;
                    int i_9 = i_8 - i_0 * 10;
                    if (i_9 >= 10) {
                        arr_6[i_7] = (char) (i_9 + 87);
                    } else {
                        arr_6[i_7] = (char) (i_9 + 48);
                    }
                }
                return new String(arr_6);
            } else {
                return Integer.toString(i_0, 10);
            }
        } else {
            throw new IllegalArgumentException("10");
        }
    }

    @Override
    void method2558(int i_1, int i_2) {
        int i_3 = 252323111 * anInt9391 * 249887383 * i_1 >> 12;
        int i_4 = i_1 * 232719965 * anInt9392 * 50986485 >> 12;
        int i_5 = anInt9393 * -724925473 * -1685653473 * i_2 >> 12;
        int i_6 = i_2 * anInt9394 * 954206695 * -1856308777 >> 12;
        Class395.method6772(i_3, i_4, i_5, i_6, 1340859839 * anInt1743 * 440863295);
    }

    @Override
    void method2561(int i_1, int i_2) {
        int i_4 = anInt9391 * i_1 >> 12;
        int i_5 = anInt9392 * i_1 >> 12;
        int i_6 = i_2 * anInt9393 >> 12;
        int i_7 = i_2 * anInt9394 >> 12;
        NewsItem.method1805(i_4, i_5, i_6, i_7, anInt1741, anInt1742);
    }

    @Override
    void method2556(int i_1, int i_2) {
        int i_4 = anInt9391 * i_1 >> 12;
        int i_5 = anInt9392 * i_1 >> 12;
        int i_6 = i_2 * anInt9393 >> 12;
        int i_7 = i_2 * anInt9394 >> 12;
        Class395.method6772(i_4, i_5, i_6, i_7, anInt1743);
    }

    @Override
    void method2557(int i_1, int i_2) {
        int i_4 = anInt9391 * i_1 >> 12;
        int i_5 = anInt9392 * i_1 >> 12;
        int i_6 = i_2 * anInt9393 >> 12;
        int i_7 = i_2 * anInt9394 >> 12;
        Ground.method6731(i_4, i_5, i_6, i_7, anInt1743, anInt1741, anInt1742);
    }

    @Override
    void method2555(int i_1, int i_2) {
        int i_3 = 252323111 * anInt9391 * 249887383 * i_1 >> 12;
        int i_4 = anInt9392 * 50986485 * 232719965 * i_1 >> 12;
        int i_5 = i_2 * -1685653473 * anInt9393 * -724925473 >> 12;
        int i_6 = anInt9394 * 954206695 * -1856308777 * i_2 >> 12;
        NewsItem.method1805(i_3, i_4, i_5, i_6, -1525176857 * anInt1741 * -1378640425, anInt1742 * 383825605 * -1125689331);
    }

    @Override
    void method2559(int i_1, int i_2) {
        int i_3 = 252323111 * anInt9391 * 249887383 * i_1 >> 12;
        int i_4 = anInt9392 * 50986485 * 232719965 * i_1 >> 12;
        int i_5 = i_2 * -1685653473 * anInt9393 * -724925473 >> 12;
        int i_6 = anInt9394 * 954206695 * -1856308777 * i_2 >> 12;
        NewsItem.method1805(i_3, i_4, i_5, i_6, -1525176857 * anInt1741 * -1378640425, anInt1742 * 383825605 * -1125689331);
    }

    @Override
    void method2562(int i_1, int i_2) {
        int i_3 = 252323111 * anInt9391 * 249887383 * i_1 >> 12;
        int i_4 = i_1 * 232719965 * anInt9392 * 50986485 >> 12;
        int i_5 = i_2 * -1685653473 * anInt9393 * -724925473 >> 12;
        int i_6 = i_2 * anInt9394 * 954206695 * -1856308777 >> 12;
        Ground.method6731(i_3, i_4, i_5, i_6, 1340859839 * anInt1743 * 440863295, -1525176857 * anInt1741 * -1378640425, anInt1742 * 383825605 * -1125689331);
    }

    @Override
    void method2560(int i_1, int i_2) {
        int i_3 = 252323111 * anInt9391 * 249887383 * i_1 >> 12;
        int i_4 = i_1 * 232719965 * anInt9392 * 50986485 >> 12;
        int i_5 = anInt9393 * -724925473 * -1685653473 * i_2 >> 12;
        int i_6 = i_2 * anInt9394 * 954206695 * -1856308777 >> 12;
        Class395.method6772(i_3, i_4, i_5, i_6, 1340859839 * anInt1743 * 440863295);
    }
}
