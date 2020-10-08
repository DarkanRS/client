package com.jagex;

import java.io.IOException;

public class IdentiKitIndexLoader implements IndexLoader {

    public static int CAM_MOVE_ABSOLUTEX;
    public static int anInt4280;
    LRUCache aClass229_360 = new LRUCache(64);
    Index aClass317_358;
    Index aClass317_359;

    public IdentiKitIndexLoader(Index index_3, Index index_4) {
        aClass317_358 = index_3;
        aClass317_359 = index_4;
        aClass317_358.filesCount(SharedConfigsType.IdentiKit.id);
    }

    public static void method809(ByteBuf rsbytebuffer_0) {
        byte[] bytes_2 = new byte[24];
        try {
            Engine.PLAYER_UID192.method7347(0L);
            Engine.PLAYER_UID192.method7351(bytes_2);
            int i_3;
            for (i_3 = 0; i_3 < 24 && bytes_2[i_3] == 0; i_3++) {
            }
            if (i_3 >= 24) {
                throw new IOException();
            }
        } catch (Exception exception_6) {
            for (int i_4 = 0; i_4 < 24; i_4++) {
                bytes_2[i_4] = -1;
            }
        }
        rsbytebuffer_0.writeBytes(bytes_2, 0, 24);
    }

    public static SubInterface openSub(int parentId, SubInterface sub, int[] ints_2, boolean bool_3) {
        SubInterface currOpen = (SubInterface) client.OPEN_INTERFACES.get(parentId);
        if (currOpen != null) {
            Class351.closeChildren(currOpen, currOpen.interfaceId != sub.interfaceId, bool_3);
        }
        client.OPEN_INTERFACES.put(sub, (long) parentId);
        ClipFlagMap.method6007(sub.interfaceId, ints_2);
        IComponentDefinitions parentDef = IComponentDefinitions.getDefs(parentId);
        if (parentDef != null) {
            Class109.redrawComponent(parentDef);
        }
        if (client.aClass118_7352 != null) {
            Class109.redrawComponent(client.aClass118_7352);
            client.aClass118_7352 = null;
        }
        OutputStream_Sub1.method12938();
        if (parentDef != null) {
            HostNameIdentifier.method483(CustomCursorsPreference.INTERFACES[parentDef.idHash >>> 16], parentDef, !bool_3);
        }
        if (!bool_3) {
            Class150.method2582(sub.interfaceId, ints_2);
        }
        if (!bool_3 && client.BASE_WINDOW_ID != -1) {
            Class383.method6514(client.BASE_WINDOW_ID, 1);
        }
        return sub;
    }

    static void method813(int i_0, int i_1, int i_2, int i_3) {
        int i_5 = 0;
        int i_6 = i_2;
        int i_7 = -i_2;
        int i_8 = -1;
        KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_1], i_0 - i_2, i_0 + i_2, i_3);
        while (i_6 > i_5) {
            i_8 += 2;
            i_7 += i_8;
            ++i_5;
            if (i_7 >= 0) {
                --i_6;
                i_7 -= i_6 << 1;
                int[] ints_9 = Class532_Sub3.anIntArrayArray7072[i_6 + i_1];
                int[] ints_10 = Class532_Sub3.anIntArrayArray7072[i_1 - i_6];
                int i_11 = i_0 + i_5;
                int i_12 = i_0 - i_5;
                KeyHoldInputSubscriber.method3922(ints_9, i_12, i_11, i_3);
                KeyHoldInputSubscriber.method3922(ints_10, i_12, i_11, i_3);
            }
            int i_13 = i_0 + i_6;
            int i_14 = i_0 - i_6;
            int[] ints_15 = Class532_Sub3.anIntArrayArray7072[i_5 + i_1];
            int[] ints_16 = Class532_Sub3.anIntArrayArray7072[i_1 - i_5];
            KeyHoldInputSubscriber.method3922(ints_15, i_14, i_13, i_3);
            KeyHoldInputSubscriber.method3922(ints_16, i_14, i_13, i_3);
        }
    }

    public IdentikitDefinition getIdentiKit(int i_1) {
        LRUCache softcache_4 = aClass229_360;
        IdentikitDefinition class44_3;
        synchronized (aClass229_360) {
            class44_3 = (IdentikitDefinition) aClass229_360.get(i_1);
        }
        if (class44_3 != null) {
            return class44_3;
        } else {
            Index index_5 = aClass317_358;
            byte[] bytes_10;
            synchronized (aClass317_358) {
                bytes_10 = aClass317_358.getFile(SharedConfigsType.IdentiKit.id, i_1);
            }
            class44_3 = new IdentikitDefinition();
            class44_3.aClass31_429 = this;
            if (bytes_10 != null) {
                class44_3.method909(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = aClass229_360;
            synchronized (aClass229_360) {
                aClass229_360.put(class44_3, i_1);
                return class44_3;
            }
        }
    }

    public void method801() {
        LRUCache softcache_2 = aClass229_360;
        synchronized (aClass229_360) {
            aClass229_360.method3859();
        }
    }

    public void method802() {
        LRUCache softcache_3 = aClass229_360;
        synchronized (aClass229_360) {
            aClass229_360.method3858(5);
        }
    }

    public void method803() {
        LRUCache softcache_2 = aClass229_360;
        synchronized (aClass229_360) {
            aClass229_360.method3863();
        }
    }
}
