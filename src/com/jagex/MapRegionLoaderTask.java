package com.jagex;

import java.util.LinkedList;

public class MapRegionLoaderTask implements Runnable {

    static int anInt3991;

    MapRegion region = new MapRegion(true);

    volatile boolean aBool3989;

    LinkedList<Class335> aLinkedList3990 = new LinkedList<Class335>();

    public void method6049(Class335 class335_1) {
        LinkedList<Class335> linkedlist_3 = aLinkedList3990;
        synchronized (aLinkedList3990) {
            aLinkedList3990.add(class335_1);
            aLinkedList3990.notify();
        }
    }

    void method6050(MapRegion mapregion_1) {
        region = mapregion_1;
    }

    public boolean method6051() {
        return aBool3989;
    }

    public MapRegion method6052() {
        return region;
    }

    void method6054() {
        Object obj_2 = null;
        LinkedList<Class335> linkedlist_4 = aLinkedList3990;
        Class335 class335_3;
        synchronized (aLinkedList3990) {
            try {
                aLinkedList3990.wait();
            } catch (InterruptedException ignored) {
            }
            class335_3 = aLinkedList3990.pollFirst();
        }
        try {
            try {
                if (class335_3 != null) {
                    aBool3989 = true;
                    method6055(class335_3);
                }
            } catch (Exception exception_8) {
                aBool3989 = false;
                return;
            }
            aBool3989 = false;
        } catch (Exception exception_9) {
            aBool3989 = false;
        }
    }

    void method6055(Class335 class335_1) {
        if (Class256.aClass256_3152 == class335_1.aClass256_3915) {
            region.method4547();
        } else {
            region.method4499(class335_1);
        }
        for (boolean bool_3 = region.method4461(); !bool_3; bool_3 = region.method4461()) {
        }
        region.method4445();
        IndexLoaders.MAP_REGION_DECODER.method4445();
    }

    public void setObjectIndexLoader(LocationIndexLoader objectindexloader_1) {
        region.setObjectIndexLoader(objectindexloader_1);
    }

    @Override
    public void run() {
        while (true) {
            method6054();
        }
    }
}
