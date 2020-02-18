package com.jagex;

public abstract class JS5CacheRequest extends CacheableNode {

    boolean highPriority;
    boolean aBool9638;
    volatile boolean waiting = true;

    static void method14949(Class466 class466_0) {
        Class404.aClass466_4831 = class466_0;
    }

    abstract byte[] method14941();

    abstract byte[] getData();

    abstract int getCompletion();

    abstract byte[] method14944();

    abstract byte[] method14945();

    abstract int method14946();

    abstract int method14947();

    abstract int method14948();

}
