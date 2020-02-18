package com.jagex;

/**
 * A cache that evicts that least recently used element when at capacity.
 */
public class LRUCache {
    Queue aClass477_2855;
    int anInt2853;
    int anInt2852;
    IterableNodeMap aClass465_2854;

    public LRUCache(int i_1, int i_2) {
        aClass477_2855 = new Queue<>();
        anInt2853 = i_1;
        anInt2852 = i_1;
        int i_3;
        for (i_3 = 1; i_3 + i_3 < i_1 && i_3 < i_2; i_3 += i_3) {
        }
        aClass465_2854 = new IterableNodeMap<>(i_3);
    }

    public LRUCache(int i_1) {
        this(i_1, i_1);
    }

    static void method3895(double d_0) {
        if (d_0 != TextureDefinition.aDouble9479) {
            for (int i_2 = 0; i_2 < 256; i_2++) {
                int i_3 = (int) (Math.pow(i_2 / 255.0D, d_0) * 255.0D);
                TextureDefinition.anIntArray9474[i_2] = Math.min(255, i_3);
            }
            TextureDefinition.aDouble9479 = d_0;
        }
    }

    public void put(Object object_1, long long_2) {
        method3857(object_1, long_2, 1);
    }

    public void method3857(Object object_1, long long_2, int i_4) {
        if (i_4 > anInt2853) {
            throw new IllegalStateException();
        } else {
            method3873(long_2);
            anInt2852 -= i_4;
            while (anInt2852 < 0) {
                CacheableNode_Sub1 class282_sub50_sub1_6 = (CacheableNode_Sub1) aClass477_2855.method7937();
                method3864(class282_sub50_sub1_6);
            }
            CacheableNode_Sub1_Sub1 class282_sub50_sub1_sub1_7 = new CacheableNode_Sub1_Sub1(object_1, i_4);
            aClass465_2854.put(class282_sub50_sub1_sub1_7, long_2);
            aClass477_2855.method7936(class282_sub50_sub1_sub1_7);
            class282_sub50_sub1_sub1_7.key = 0L;
        }
    }

    public void method3858(int i_1) {
        for (CacheableNode_Sub1 class282_sub50_sub1_3 = (CacheableNode_Sub1) aClass477_2855.method7941(); class282_sub50_sub1_3 != null; class282_sub50_sub1_3 = (CacheableNode_Sub1) aClass477_2855.method7955()) {
            if (class282_sub50_sub1_3.method14691()) {
                if (class282_sub50_sub1_3.method14692() == null) {
                    class282_sub50_sub1_3.unlink();
                    class282_sub50_sub1_3.method13452();
                    anInt2852 += class282_sub50_sub1_3.anInt9451;
                }
            } else if (++class282_sub50_sub1_3.key > i_1) {
                CacheableNode_Sub1_Sub2 class282_sub50_sub1_sub2_4 = new CacheableNode_Sub1_Sub2(class282_sub50_sub1_3.method14692(), class282_sub50_sub1_3.anInt9451);
                aClass465_2854.put(class282_sub50_sub1_sub2_4, class282_sub50_sub1_3.pointer);
                RouteStrategies.method3782(class282_sub50_sub1_sub2_4, class282_sub50_sub1_3);
                class282_sub50_sub1_3.unlink();
                class282_sub50_sub1_3.method13452();
            }
        }
    }

    public void method3859() {
        aClass477_2855.method7935();
        aClass465_2854.method7749();
        anInt2852 = anInt2853;
    }

    public int method3860() {
        return anInt2853;
    }

    public int method3861() {
        return anInt2852;
    }

    public int method3862() {
        int i_2 = 0;
        for (CacheableNode_Sub1 class282_sub50_sub1_3 = (CacheableNode_Sub1) aClass477_2855.method7941(); class282_sub50_sub1_3 != null; class282_sub50_sub1_3 = (CacheableNode_Sub1) aClass477_2855.method7955()) {
            if (!class282_sub50_sub1_3.method14691()) {
                ++i_2;
            }
        }
        return i_2;
    }

    public void method3863() {
        for (CacheableNode_Sub1 class282_sub50_sub1_2 = (CacheableNode_Sub1) aClass477_2855.method7941(); class282_sub50_sub1_2 != null; class282_sub50_sub1_2 = (CacheableNode_Sub1) aClass477_2855.method7955()) {
            if (class282_sub50_sub1_2.method14691()) {
                class282_sub50_sub1_2.unlink();
                class282_sub50_sub1_2.method13452();
                anInt2852 += class282_sub50_sub1_2.anInt9451;
            }
        }
    }

    void method3864(CacheableNode_Sub1 class282_sub50_sub1_1) {
        if (class282_sub50_sub1_1 != null) {
            class282_sub50_sub1_1.unlink();
            class282_sub50_sub1_1.method13452();
            anInt2852 += class282_sub50_sub1_1.anInt9451;
        }
    }

    public Object get(long long_1) {
        CacheableNode_Sub1 class282_sub50_sub1_3 = (CacheableNode_Sub1) aClass465_2854.get(long_1);
        if (class282_sub50_sub1_3 == null) {
            return null;
        } else {
            Object object_4 = class282_sub50_sub1_3.method14692();
            if (object_4 == null) {
                class282_sub50_sub1_3.unlink();
                class282_sub50_sub1_3.method13452();
                anInt2852 += class282_sub50_sub1_3.anInt9451;
                return null;
            } else {
                if (class282_sub50_sub1_3.method14691()) {
                    CacheableNode_Sub1_Sub1 class282_sub50_sub1_sub1_5 = new CacheableNode_Sub1_Sub1(object_4, class282_sub50_sub1_3.anInt9451);
                    aClass465_2854.put(class282_sub50_sub1_sub1_5, class282_sub50_sub1_3.pointer);
                    aClass477_2855.method7936(class282_sub50_sub1_sub1_5);
                    class282_sub50_sub1_sub1_5.key = 0L;
                    class282_sub50_sub1_3.unlink();
                    class282_sub50_sub1_3.method13452();
                } else {
                    aClass477_2855.method7936(class282_sub50_sub1_3);
                    class282_sub50_sub1_3.key = 0L;
                }
                return object_4;
            }
        }
    }

    public Object method3866() {
        CacheableNode_Sub1 class282_sub50_sub1_4;
        for (CacheableNode_Sub1 class282_sub50_sub1_2 = (CacheableNode_Sub1) aClass465_2854.method7750(); class282_sub50_sub1_2 != null; anInt2852 += class282_sub50_sub1_4.anInt9451) {
            Object object_3 = class282_sub50_sub1_2.method14692();
            if (object_3 != null) {
                return object_3;
            }
            class282_sub50_sub1_4 = class282_sub50_sub1_2;
            class282_sub50_sub1_2 = (CacheableNode_Sub1) aClass465_2854.method7751();
            class282_sub50_sub1_4.unlink();
            class282_sub50_sub1_4.method13452();
        }
        return null;
    }

    public Object method3867() {
        CacheableNode_Sub1 class282_sub50_sub1_4;
        for (CacheableNode_Sub1 class282_sub50_sub1_2 = (CacheableNode_Sub1) aClass465_2854.method7751(); class282_sub50_sub1_2 != null; anInt2852 += class282_sub50_sub1_4.anInt9451) {
            Object object_3 = class282_sub50_sub1_2.method14692();
            if (object_3 != null) {
                return object_3;
            }
            class282_sub50_sub1_4 = class282_sub50_sub1_2;
            class282_sub50_sub1_2 = (CacheableNode_Sub1) aClass465_2854.method7751();
            class282_sub50_sub1_4.unlink();
            class282_sub50_sub1_4.method13452();
        }
        return null;
    }

    public void method3873(long long_1) {
        CacheableNode_Sub1 class282_sub50_sub1_3 = (CacheableNode_Sub1) aClass465_2854.get(long_1);
        method3864(class282_sub50_sub1_3);
    }
}
