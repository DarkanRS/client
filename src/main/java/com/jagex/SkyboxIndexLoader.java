package com.jagex;

import java.util.Date;

public class SkyboxIndexLoader {

    public static FontMetrics aClass414_3438;
    LRUCache aClass229_3437 = new LRUCache(16);
    Index aClass317_3436;

    public SkyboxIndexLoader(Index index_3) {
        aClass317_3436 = index_3;
        aClass317_3436.filesCount(SharedConfigsType.SKYBOX.id);
    }

    static void method5083(long long_0) {
        Class407.aCalendar4846.setTime(new Date(long_0));
    }

    public static Interface getInterface(int interfaceId, int[] ints_1, Interface inter, boolean bool_3) {
        Interface interface_21 = inter;
        if (!Class388.INTERFACE_INDEX.loadArchive(interfaceId)) {
            return null;
        } else {
            int componentSize = Class388.INTERFACE_INDEX.filesCount(interfaceId);
            IComponentDefinitions[] arr_6;
            if (componentSize == 0) {
                arr_6 = new IComponentDefinitions[0];
            } else if (interface_21 == null) {
                arr_6 = new IComponentDefinitions[componentSize];
            } else {
                arr_6 = interface_21.components;
            }
            if (interface_21 == null) {
                interface_21 = new Interface(bool_3, arr_6);
            } else {
                interface_21.components = arr_6;
                interface_21.aBool999 = bool_3;
            }
            for (int i = 0; i < componentSize; i++) {
                if (interface_21.components[i] == null) {
                    byte[] bytes_8 = Class388.INTERFACE_INDEX.getFile(interfaceId, i, ints_1);
                    if (bytes_8 != null) {
                        IComponentDefinitions component = interface_21.components[i] = new IComponentDefinitions();
                        component.idHash = i + (interfaceId << 16);
                        component.readValues(new ByteBuf(bytes_8));
                    }
                }
            }
            return interface_21;
        }
    }

    public void method5068() {
        LRUCache softcache_3 = aClass229_3437;
        synchronized (aClass229_3437) {
            aClass229_3437.method3858(5);
        }
    }

    public void method5070() {
        LRUCache softcache_2 = aClass229_3437;
        synchronized (aClass229_3437) {
            aClass229_3437.method3859();
        }
    }

    public void method5071() {
        LRUCache softcache_2 = aClass229_3437;
        synchronized (aClass229_3437) {
            aClass229_3437.method3863();
        }
    }

    SkyboxDefinitions method5072(int i_1) {
        LRUCache softcache_4 = aClass229_3437;
        SkyboxDefinitions class207_3;
        synchronized (aClass229_3437) {
            class207_3 = (SkyboxDefinitions) aClass229_3437.get(i_1);
        }
        if (class207_3 != null) {
            return class207_3;
        } else {
            Index index_5 = aClass317_3436;
            byte[] bytes_10;
            synchronized (aClass317_3436) {
                bytes_10 = aClass317_3436.getFile(SharedConfigsType.SKYBOX.id, i_1);
            }
            class207_3 = new SkyboxDefinitions();
            if (bytes_10 != null) {
                class207_3.method3549(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = aClass229_3437;
            synchronized (aClass229_3437) {
                aClass229_3437.put(class207_3, i_1);
                return class207_3;
            }
        }
    }

    public Class247 method5077(int i_1, int i_2, int i_3, int i_4, SunIndexLoader class45_5) {
        Class334[] arr_7 = null;
        SkyboxDefinitions class207_8 = method5072(i_1);
        if (class207_8.anIntArray2655 != null) {
            arr_7 = new Class334[class207_8.anIntArray2655.length];
            for (int i_9 = 0; i_9 < arr_7.length; i_9++) {
                SunDefinitions class38_10 = class45_5.method914(class207_8.anIntArray2655[i_9]);
                arr_7[i_9] = new Class334(class38_10.anInt395, class38_10.anInt402, class38_10.anInt401, class38_10.anInt397, class38_10.anInt399, class38_10.anInt396, class38_10.anInt404, class38_10.aBool400, class38_10.anInt403, class38_10.anInt398, class38_10.anInt405);
            }
        }
        return new Class247(class207_8.anInt2653, arr_7, class207_8.anInt2654, i_2, i_3, i_4, class207_8.aClass204_2656, class207_8.anInt2657);
    }
}
