package com.jagex;

import java.util.Queue;

public class RenderAnimIndexLoader {

    public static BASDefinitions aClass227_2669 = new BASDefinitions();

    LRUCache renderAnimCache = new LRUCache(64);

    Index aClass317_2671;

    EquipmentDefaults aClass526_2672;

    public RenderAnimIndexLoader(Index index_3, EquipmentDefaults defaults6loader_4) {
        aClass317_2671 = index_3;
        aClass317_2671.filesCount(SharedConfigsType.RENDER_ANIMS.id);
        aClass526_2672 = defaults6loader_4;
    }

    static void method3629(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        if (!MovingAnimation.isInterfaceLoaded(i_0, null)) {
            if (i_7 != -1) {
                client.aBoolArray7443[i_7] = true;
            } else {
                for (int i_9 = 0; i_9 < 107; i_9++) {
                    client.aBoolArray7443[i_9] = true;
                }
            }
        } else {
            GroundDecoration.method16094(CustomCursorsPreference.INTERFACES[i_0].method1616(), -1, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_7 < 0);
        }
    }

    public static void method3630() {
        Queue<MouseRecord_Sub1> queue_1 = Class236.aQueue2914;
        synchronized (Class236.aQueue2914) {
            while (true) {
                MouseRecord_Sub1 class282_sub53_sub1_2 = Class236.aQueue2914.poll();
                if (class282_sub53_sub1_2 == null) {
                    return;
                }
                class282_sub53_sub1_2.cache();
            }
        }
    }

    public static void method3631(int i_0) {
        PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(3, i_0);
        class282_sub50_sub12_2.method14965();
    }

    public void method3615() {
        LRUCache softcache_3 = renderAnimCache;
        synchronized (renderAnimCache) {
            renderAnimCache.method3858(5);
        }
    }

    public BASDefinitions getBASDefs(int i_1) {
        LRUCache softcache_4 = renderAnimCache;
        BASDefinitions renderanimdefs_3;
        synchronized (renderAnimCache) {
            renderanimdefs_3 = (BASDefinitions) renderAnimCache.get(i_1);
        }
        if (renderanimdefs_3 != null) {
            renderanimdefs_3.renderAnimId = i_1;
            return renderanimdefs_3;
        } else {
            Index index_5 = aClass317_2671;
            byte[] bytes_10;
            synchronized (aClass317_2671) {
                bytes_10 = aClass317_2671.getFile(SharedConfigsType.RENDER_ANIMS.id, i_1);
            }
            renderanimdefs_3 = new BASDefinitions();
            renderanimdefs_3.renderAnimId = i_1;
            renderanimdefs_3.aClass211_2788 = this;
            if (bytes_10 != null) {
                renderanimdefs_3.method3821(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = renderAnimCache;
            synchronized (renderAnimCache) {
                renderAnimCache.put(renderanimdefs_3, i_1);
                return renderanimdefs_3;
            }
        }
    }

    public void method3617() {
        LRUCache softcache_2 = renderAnimCache;
        synchronized (renderAnimCache) {
            renderAnimCache.method3859();
        }
    }

    public void method3618() {
        LRUCache softcache_2 = renderAnimCache;
        synchronized (renderAnimCache) {
            renderAnimCache.method3863();
        }
    }
}
