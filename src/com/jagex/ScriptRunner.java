package com.jagex;

public class ScriptRunner {

    public static int[] anIntArray2668;
    LRUCache aClass229_2664 = new LRUCache(20);
    LRUCache aClass229_2667 = new LRUCache(64);
    Index aClass317_2666;
    Index aClass317_2665;

    public ScriptRunner(Index index_3, Index index_4) {
        aClass317_2666 = index_4;
        aClass317_2665 = index_3;
        aClass317_2665.filesCount(SharedConfigsType.HITSPLATS.id);
    }

    static void method3612(int i_0, int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        if (!bool_5 && (i_1 < 512 || i_2 < 512 || i_1 > (IndexLoaders.MAP_REGION_DECODER.getSizeX() - 2) * 512 || i_2 > (IndexLoaders.MAP_REGION_DECODER.getSizeY() - 2) * 512)) {
            float[] floats_7 = client.aFloatArray7292;
            client.aFloatArray7292[1] = -1.0f;
            floats_7[0] = -1.0f;
        } else {
            int i_8 = Class504.getTerrainHeightAtPos(i_1, i_2, i_0) - i_4;
            client.aClass294_7457.method5209(Renderers.SOFTWARE_RENDERER.method8458());
            client.aClass294_7457.method5219(i_3, 0.0F, 0.0F);
            Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
            if (bool_5) {
                Renderers.SOFTWARE_RENDERER.method8479(i_1, i_8, i_2, client.aFloatArray7292);
            } else {
                Renderers.SOFTWARE_RENDERER.method8515(i_1, i_8, i_2, client.aFloatArray7292);
            }
            client.aClass294_7457.method5219((-i_3), 0.0F, 0.0F);
            Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
            client.aFloatArray7292[0] -= client.anInt7444;
            client.aFloatArray7292[1] -= client.anInt7445;
        }
    }

    public static void executeTrigger(ClientTriggerType class397_0, int i_1, int i_2) {
        CS2Executor cs2executor_4 = CS2Executor.getNextScriptExecutor();
        CS2Executor.method1834(class397_0, i_1, i_2, cs2executor_4);
    }

    public void method3602() {
        LRUCache softcache_3 = aClass229_2667;
        synchronized (aClass229_2667) {
            aClass229_2667.method3858(5);
        }
        softcache_3 = aClass229_2664;
        synchronized (aClass229_2664) {
            aClass229_2664.method3858(5);
        }
    }

    public HitsplatDefinitions getDefinitions(int i_1) {
        LRUCache softcache_4 = aClass229_2667;
        HitsplatDefinitions hitsplatdefinitions_3;
        synchronized (aClass229_2667) {
            hitsplatdefinitions_3 = (HitsplatDefinitions) aClass229_2667.get(i_1);
        }
        if (hitsplatdefinitions_3 != null) {
            return hitsplatdefinitions_3;
        } else {
            Index index_5 = aClass317_2665;
            byte[] bytes_10;
            synchronized (aClass317_2665) {
                bytes_10 = aClass317_2665.getFile(SharedConfigsType.HITSPLATS.id, i_1);
            }
            hitsplatdefinitions_3 = new HitsplatDefinitions();
            hitsplatdefinitions_3.aClass210_2850 = this;
            if (bytes_10 != null) {
                hitsplatdefinitions_3.method3837(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = aClass229_2667;
            synchronized (aClass229_2667) {
                aClass229_2667.put(hitsplatdefinitions_3, i_1);
                return hitsplatdefinitions_3;
            }
        }
    }

    public void method3604() {
        LRUCache softcache_2 = aClass229_2667;
        synchronized (aClass229_2667) {
            aClass229_2667.method3859();
        }
        softcache_2 = aClass229_2664;
        synchronized (aClass229_2664) {
            aClass229_2664.method3859();
        }
    }

    public void method3608() {
        LRUCache softcache_2 = aClass229_2667;
        synchronized (aClass229_2667) {
            aClass229_2667.method3863();
        }
        softcache_2 = aClass229_2664;
        synchronized (aClass229_2664) {
            aClass229_2664.method3863();
        }
    }
}
