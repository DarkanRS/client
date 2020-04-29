package com.jagex;

public class InventoriesIndexLoader implements IndexLoader {

    public static int anInt4781;

    LRUCache cached = new LRUCache(64);

    Index configIndex;

    public InventoriesIndexLoader(Index index_3) {
        configIndex = index_3;
        configIndex.filesCount(SharedConfigsType.INVENTORIES.id);
    }

    static void renderAreaText(AbstractRenderer graphicalrenderer_0, Node_Sub36 class282_sub36_1, MapAreaDefinitions worldmapareadefs_2, int i_3, int i_4, int i_5, int i_6, Class194 class194_7) {
        int i_9 = i_4 - i_6 / 2 - 5;
        int i_10 = i_5 + 2;
        if (worldmapareadefs_2.anInt2726 != 0) {
            graphicalrenderer_0.method8425(i_9, i_10, i_6 + 10, i_5 + i_3 * class194_7.method3173() - i_10 + 1, worldmapareadefs_2.anInt2726);
        }
        if (worldmapareadefs_2.anInt2727 != 0) {
            graphicalrenderer_0.method8562(i_9, i_10, i_6 + 10, i_5 + i_3 * class194_7.method3173() - i_10 + 1, worldmapareadefs_2.anInt2727);
        }
        int i_11 = worldmapareadefs_2.anInt2720;
        if (class282_sub36_1.aBool7989 && worldmapareadefs_2.anInt2721 != -1) {
            i_11 = worldmapareadefs_2.anInt2721;
        }
        for (int i_12 = 0; i_12 < i_3; i_12++) {
            String string_13 = Class291_Sub1.aStringArray8024[i_12];
            if (i_12 < i_3 - 1) {
                string_13 = string_13.substring(0, string_13.length() - 4);
            }
            class194_7.method3178(graphicalrenderer_0, string_13, i_4, i_5, i_11);
            i_5 += class194_7.method3173();
        }
    }

    public static void setHuffman(Huffman class117_0) {
        Class113.HUFFMAN = class117_0;
    }

    public ItemContainerDefinitions getInventoryDef(int i_1) {
        LRUCache softcache_4 = cached;
        ItemContainerDefinitions inventorydef_3;
        synchronized (cached) {
            inventorydef_3 = (ItemContainerDefinitions) cached.get(i_1);
        }
        if (inventorydef_3 != null) {
            return inventorydef_3;
        } else {
            Index index_5 = configIndex;
            byte[] bytes_10;
            synchronized (configIndex) {
                bytes_10 = configIndex.getFile(SharedConfigsType.INVENTORIES.id, i_1);
            }
            inventorydef_3 = new ItemContainerDefinitions();
            if (bytes_10 != null) {
                inventorydef_3.method15690(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = cached;
            synchronized (cached) {
                cached.put(inventorydef_3, i_1);
                return inventorydef_3;
            }
        }
    }
}
