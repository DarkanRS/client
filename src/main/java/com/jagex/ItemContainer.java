package com.jagex;

public class ItemContainer extends Node {

    static IterableNodeMap CONTAINER_MAP = new IterableNodeMap(32);
    static LRUCache aClass229_7712 = new LRUCache(11);
    int[] itemIds = {-1};
    int[] amounts = new int[1];

    public static int getAmountAtSlot(int key, int slot, boolean negativeKey) {
        ItemContainer container = getContainer(key, negativeKey);
        return container == null ? 0 : (slot >= 0 && slot < container.amounts.length ? container.amounts[slot] : 0);
    }

    public static int getContainerTotal(int i_0, int i_1, boolean bool_2) {
        ItemContainer class282_sub30_4 = getContainer(i_0, bool_2);
        if (class282_sub30_4 == null) {
            return 0;
        } else if (i_1 == -1) {
            return 0;
        } else {
            int i_5 = 0;
            for (int i_6 = 0; i_6 < class282_sub30_4.amounts.length; i_6++) {
                if (class282_sub30_4.itemIds[i_6] == i_1) {
                    i_5 += class282_sub30_4.amounts[i_6];
                }
            }
            return i_5;
        }
    }

    public static int getItemIdAtSlot(int key, int slot, boolean negativeKey) {
        ItemContainer container = getContainer(key, negativeKey);
        return container == null ? -1 : (slot >= 0 && slot < container.itemIds.length ? container.itemIds[slot] : -1);
    }

    static ItemContainer getContainer(int key, boolean negativeKey) {
        long longKey = key | (negativeKey ? Integer.MIN_VALUE : 0);
        return (ItemContainer) CONTAINER_MAP.get(longKey);
    }

    MeshRasterizer method12429(AbstractRenderer graphicalrenderer_1, int i_2, Animation animation_3, int i_4, boolean female, PlayerModel playerappearance_6) {
        MeshRasterizer meshrasterizer_8 = null;
        int i_9 = i_2;
        BASDefinitions renderanimdefs_10 = null;
        if (i_4 != -1) {
            renderanimdefs_10 = IndexLoaders.RENDER_ANIM_LOADER.getBASDefs(i_4);
        }

        int[] ints_11 = itemIds;
        if (renderanimdefs_10 != null && renderanimdefs_10.anIntArray2811 != null) {
            ints_11 = new int[renderanimdefs_10.anIntArray2811.length];

            for (int i_12 = 0; i_12 < renderanimdefs_10.anIntArray2811.length; i_12++) {
                int i_13 = renderanimdefs_10.anIntArray2811[i_12];
                if (i_13 >= 0 && i_13 < itemIds.length) {
                    ints_11[i_12] = itemIds[i_13];
                } else {
                    ints_11[i_12] = -1;
                }
            }
        }

        if (animation_3 != null) {
            i_9 = i_2 | animation_3.method7640();
        }

        long long_24 = method12444(ints_11, i_4, playerappearance_6 != null ? playerappearance_6.colors : null, female);
        if (aClass229_7712 != null) {
            meshrasterizer_8 = (MeshRasterizer) aClass229_7712.get(long_24);
        }

        if (meshrasterizer_8 == null || graphicalrenderer_1.method8452(meshrasterizer_8.m(), i_9) != 0) {
            if (meshrasterizer_8 != null) {
                i_9 = graphicalrenderer_1.method8546(i_9, meshrasterizer_8.m());
            }

            int i_26 = i_9;
            boolean bool_15 = false;

            for (int i_16 = 0; i_16 < ints_11.length; i_16++) {
                if (ints_11[i_16] != -1 && !IndexLoaders.ITEM_LOADER.getItemDefinitions(ints_11[i_16]).bodyMeshesReady(female, null)) {
                    bool_15 = true;
                }
            }

            if (bool_15) {
                return null;
            }

            RSMesh[] arr_27 = new RSMesh[ints_11.length];

            int i_17;
            for (i_17 = 0; i_17 < ints_11.length; i_17++) {
                if (ints_11[i_17] != -1) {
                    arr_27[i_17] = IndexLoaders.ITEM_LOADER.getItemDefinitions(ints_11[i_17]).getBodyMesh(female, null);
                }
            }

            int i_18;
            int i_19;
            if (renderanimdefs_10 != null && renderanimdefs_10.anIntArrayArray2802 != null) {
                for (i_17 = 0; i_17 < renderanimdefs_10.anIntArrayArray2802.length; i_17++) {
                    if (renderanimdefs_10.anIntArrayArray2802[i_17] != null && arr_27[i_17] != null) {
                        i_18 = renderanimdefs_10.anIntArrayArray2802[i_17][0];
                        i_19 = renderanimdefs_10.anIntArrayArray2802[i_17][1];
                        int i_20 = renderanimdefs_10.anIntArrayArray2802[i_17][2];
                        int i_21 = renderanimdefs_10.anIntArrayArray2802[i_17][3];
                        int i_22 = renderanimdefs_10.anIntArrayArray2802[i_17][4];
                        int i_23 = renderanimdefs_10.anIntArrayArray2802[i_17][5];
                        if (i_21 != 0 || i_22 != 0 || i_23 != 0) {
                            arr_27[i_17].method2671(i_21, i_22, i_23);
                        }

                        if (i_18 != 0 || i_19 != 0 || i_20 != 0) {
                            arr_27[i_17].translate(i_18, i_19, i_20);
                        }
                    }
                }
            }

            RSMesh rsmesh_28 = new RSMesh(arr_27, arr_27.length);
            if (playerappearance_6 != null) {
                i_26 = i_9 | 0x4000;
            }

            meshrasterizer_8 = graphicalrenderer_1.createMeshRasterizer(rsmesh_28, i_26, NewsItem.anInt1069, 65, 857);
            if (playerappearance_6 != null) {
                for (i_18 = 0; i_18 < 10; i_18++) {
                    for (i_19 = 0; i_19 < AbstractQueue_Sub1.SKIN_COLORS[i_18].length; i_19++) {
                        if (playerappearance_6.colors[i_18] < Class366.SKIN_COLORS[i_18][i_19].length) {
                            meshrasterizer_8.X(AbstractQueue_Sub1.SKIN_COLORS[i_18][i_19], Class366.SKIN_COLORS[i_18][i_19][playerappearance_6.colors[i_18]]);
                        }
                    }
                }
            }

            if (aClass229_7712 != null) {
                meshrasterizer_8.KA(i_9);
                aClass229_7712.put(meshrasterizer_8, long_24);
            }
        }

        if (animation_3 == null) {
            return meshrasterizer_8;
        } else {
            MeshRasterizer meshrasterizer_14 = meshrasterizer_8.method11289((byte) 1, i_9, true);
            animation_3.rasterize(meshrasterizer_14, 0);
            return meshrasterizer_14;
        }
    }

    long method12444(int[] ints_1, int i_2, int[] ints_3, boolean bool_4) {
        long[] longs_6 = ByteBuf.aLongArray7979;
        long long_7 = -1L;
        long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (i_2 >> 8)) & 0xffL)];
        long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ i_2) & 0xffL)];

        int i_9;
        for (i_9 = 0; i_9 < ints_1.length; i_9++) {
            long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (ints_1[i_9] >> 24)) & 0xffL)];
            long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (ints_1[i_9] >> 16)) & 0xffL)];
            long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (ints_1[i_9] >> 8)) & 0xffL)];
            long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ ints_1[i_9]) & 0xffL)];
        }

        if (ints_3 != null) {
            for (i_9 = 0; i_9 < 5; i_9++) {
                long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ ints_3[i_9]) & 0xffL)];
            }
        }

        long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (bool_4 ? 1 : 0)) & 0xffL)];
        return long_7;
    }

}
