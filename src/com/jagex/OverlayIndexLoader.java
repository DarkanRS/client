package com.jagex;

public class OverlayIndexLoader {

    public int anInt7093;
    public int anInt7094;
    LRUCache aClass229_7092 = new LRUCache(64);
    Index aClass317_7095;

    public OverlayIndexLoader(Index index_3) {
        aClass317_7095 = index_3;
        anInt7094 = aClass317_7095.filesCount(SharedConfigsType.OVERLAYS.id);
    }

    public OverlayDef getOverlayDef(int i_1) {
        LRUCache softcache_4 = aClass229_7092;
        OverlayDef overlaydef_3;
        synchronized (aClass229_7092) {
            overlaydef_3 = (OverlayDef) aClass229_7092.get(i_1);
        }
        if (overlaydef_3 != null) {
            return overlaydef_3;
        } else {
            Index index_5 = aClass317_7095;
            byte[] bytes_10;
            synchronized (aClass317_7095) {
                bytes_10 = aClass317_7095.getFile(SharedConfigsType.OVERLAYS.id, i_1);
            }
            overlaydef_3 = new OverlayDef();
            overlaydef_3.aClass536_7062 = this;
            overlaydef_3.anInt7053 = i_1;
            if (bytes_10 != null) {
                overlaydef_3.method11357(new Packet(bytes_10));
            }
            overlaydef_3.method11356();
            LRUCache softcache_9 = aClass229_7092;
            synchronized (aClass229_7092) {
                aClass229_7092.put(overlaydef_3, i_1);
                return overlaydef_3;
            }
        }
    }

    public void method11476() {
        LRUCache softcache_2 = aClass229_7092;
        synchronized (aClass229_7092) {
            aClass229_7092.method3859();
        }
    }

    public void method11477() {
        LRUCache softcache_3 = aClass229_7092;
        synchronized (aClass229_7092) {
            aClass229_7092.method3858(5);
        }
    }

    public void method11478() {
        LRUCache softcache_2 = aClass229_7092;
        synchronized (aClass229_7092) {
            aClass229_7092.method3863();
        }
    }
}
