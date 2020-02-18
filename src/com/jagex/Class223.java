package com.jagex;

public class Class223 {

    public static Language CURRENT_LANGUAGE;

    int anInt2769;

    CacheableNode aCacheableNode_2770 = new CacheableNode();

    Queue aClass477_2767 = new Queue();

    int anInt2768;

    IterableNodeMap aClass465_2771;

    public Class223(int i_1) {
        anInt2768 = i_1;
        anInt2769 = i_1;
        int i_2;
        for (i_2 = 1; i_2 + i_2 < i_1; i_2 += i_2) {
        }
        aClass465_2771 = new IterableNodeMap(i_2);
    }

    public static void method3770() {
        if (CutsceneEntityMovement.method1576()) {
            TextureDetails.method2877(new Class237());
        }
    }

    public CacheableNode get(long long_1) {
        CacheableNode cacheablenode_3 = (CacheableNode) aClass465_2771.get(long_1);
        if (cacheablenode_3 != null) {
            aClass477_2767.method7936(cacheablenode_3);
        }
        return cacheablenode_3;
    }

    public void put(CacheableNode cacheablenode_1, long long_2) {
        if (anInt2769 == 0) {
            CacheableNode cacheablenode_4 = aClass477_2767.method7937();
            cacheablenode_4.unlink();
            cacheablenode_4.method13452();
            if (cacheablenode_4 == aCacheableNode_2770) {
                cacheablenode_4 = aClass477_2767.method7937();
                cacheablenode_4.unlink();
                cacheablenode_4.method13452();
            }
        } else {
            --anInt2769;
        }
        aClass465_2771.put(cacheablenode_1, long_2);
        aClass477_2767.method7936(cacheablenode_1);
    }

    public void method3760() {
        aClass477_2767.method7935();
        aClass465_2771.method7749();
        aCacheableNode_2770 = new CacheableNode();
        anInt2769 = anInt2768;
    }
}
