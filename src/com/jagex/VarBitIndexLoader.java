package com.jagex;

public class VarBitIndexLoader implements IndexLoader {

    LRUCache aClass229_2856 = new LRUCache(64);

    Index aClass317_2858;

    public VarBitIndexLoader(Index index_3) {
        aClass317_2858 = index_3;
        if (aClass317_2858 != null) {
            int i_4 = aClass317_2858.containersCount() - 1;
            SharedConfigsType.VARBITS.filesPerContainer();
            aClass317_2858.filesCount(i_4);
        }
    }

    public static int method3910(String string_0) {
        if (string_0 != null) {
            for (int i_2 = 0; i_2 < client.FRIEND_COUNT; i_2++) {
                if (string_0.equalsIgnoreCase(client.FRIENDS[i_2].displayName)) {
                    return i_2;
                }
            }
        }
        return -1;
    }

    static void method3912() {
        if (Class260.aClass277_3221 != null) {
            Class260.aClass277_3221 = null;
            Class187.method3121(256);
        }
    }

    public VarBitDefinitions getVarBit(int i_1) {
        LRUCache softcache_4 = aClass229_2856;
        VarBitDefinitions class226_3;
        synchronized (aClass229_2856) {
            class226_3 = (VarBitDefinitions) aClass229_2856.get(i_1);
        }
        if (class226_3 != null) {
            return class226_3;
        } else {
            Index index_5 = aClass317_2858;
            byte[] bytes_10;
            synchronized (aClass317_2858) {
                bytes_10 = aClass317_2858.getFile(SharedConfigsType.VARBITS.containerId(i_1), SharedConfigsType.VARBITS.fileId(i_1));
            }
            class226_3 = new VarBitDefinitions();
            if (bytes_10 != null) {
                class226_3.method3795(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = aClass229_2856;
            synchronized (aClass229_2856) {
                aClass229_2856.put(class226_3, i_1);
                return class226_3;
            }
        }
    }

    public void method3898() {
        LRUCache softcache_3 = aClass229_2856;
        synchronized (aClass229_2856) {
            aClass229_2856.method3858(5);
        }
    }

    public void method3899() {
        LRUCache softcache_2 = aClass229_2856;
        synchronized (aClass229_2856) {
            aClass229_2856.method3863();
        }
    }

    public void method3903() {
        LRUCache softcache_2 = aClass229_2856;
        synchronized (aClass229_2856) {
            aClass229_2856.method3859();
        }
    }

    public void method3906(int i_1) {
        LRUCache softcache_3 = aClass229_2856;
        synchronized (aClass229_2856) {
            aClass229_2856.method3859();
            aClass229_2856 = new LRUCache(i_1);
        }
    }
}
