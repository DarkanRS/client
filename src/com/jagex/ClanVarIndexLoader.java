package com.jagex;

public class ClanVarIndexLoader {

    public int size;
    LRUCache aClass229_4786 = new LRUCache(64);
    Index aClass317_4784;

    public ClanVarIndexLoader(Index index_3) {
        aClass317_4784 = index_3;
        if (aClass317_4784 != null) {
            size = aClass317_4784.filesCount(SharedConfigsType.CLAN_VAR.id);
        } else {
            size = 0;
        }
    }

    static void method6763() {
        Class187.anInt2363 = 0;
        Class187.anInt2351 = -1;
        Class187.anInt2361 = -1;
        Class187.anInt2359 = -1;
    }

    public ClanVarDefinitions method6753(int i_1) {
        LRUCache softcache_4 = aClass229_4786;
        ClanVarDefinitions class405_3;
        synchronized (aClass229_4786) {
            class405_3 = (ClanVarDefinitions) aClass229_4786.get(i_1);
        }
        if (class405_3 != null) {
            return class405_3;
        } else {
            Index index_5 = aClass317_4784;
            byte[] bytes_10;
            synchronized (aClass317_4784) {
                bytes_10 = aClass317_4784.getFile(SharedConfigsType.CLAN_VAR.id, i_1);
            }
            class405_3 = new ClanVarDefinitions();
            if (bytes_10 != null) {
                class405_3.method6816(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = aClass229_4786;
            synchronized (aClass229_4786) {
                aClass229_4786.put(class405_3, i_1);
                return class405_3;
            }
        }
    }

    public void method6754() {
        LRUCache softcache_2 = aClass229_4786;
        synchronized (aClass229_4786) {
            aClass229_4786.method3859();
        }
    }

    public void method6755() {
        LRUCache softcache_3 = aClass229_4786;
        synchronized (aClass229_4786) {
            aClass229_4786.method3858(5);
        }
    }

    public void method6756() {
        LRUCache softcache_2 = aClass229_4786;
        synchronized (aClass229_4786) {
            aClass229_4786.method3863();
        }
    }
}
