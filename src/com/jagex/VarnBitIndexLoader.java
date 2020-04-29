package com.jagex;

public class VarnBitIndexLoader {

    LRUCache aClass229_5824 = new LRUCache(64);

    Index aClass317_5823;

    public VarnBitIndexLoader(Index index_3) {
        aClass317_5823 = index_3;
        if (aClass317_5823 != null) {
            aClass317_5823.filesCount(SharedConfigsType.VARNBIT.id);
        }
    }

    public void method8319() {
        LRUCache softcache_2 = aClass229_5824;
        synchronized (aClass229_5824) {
            aClass229_5824.method3859();
        }
    }

    public void method8320() {
        LRUCache softcache_3 = aClass229_5824;
        synchronized (aClass229_5824) {
            aClass229_5824.method3858(5);
        }
    }

    public void method8321() {
        LRUCache softcache_2 = aClass229_5824;
        synchronized (aClass229_5824) {
            aClass229_5824.method3863();
        }
    }

    public VarnBitDefinitions method8322(int i_1) {
        LRUCache softcache_4 = aClass229_5824;
        VarnBitDefinitions class489_3;
        synchronized (aClass229_5824) {
            class489_3 = (VarnBitDefinitions) aClass229_5824.get(i_1);
        }
        if (class489_3 != null) {
            return class489_3;
        } else {
            byte[] bytes_8 = aClass317_5823.getFile(SharedConfigsType.VARNBIT.id, i_1);
            class489_3 = new VarnBitDefinitions();
            if (bytes_8 != null) {
                class489_3.method8213(new ByteBuf(bytes_8));
            }
            LRUCache softcache_5 = aClass229_5824;
            synchronized (aClass229_5824) {
                aClass229_5824.put(class489_3, i_1);
                return class489_3;
            }
        }
    }
}
