package com.jagex;

public class MapSpriteIndexLoader {

    public static int anInt5123;
    LRUCache aClass229_5117 = new LRUCache(64);
    LRUCache aClass229_5122 = new LRUCache(64);
    Index aClass317_5120;
    Index aClass317_5118;

    public MapSpriteIndexLoader(Index index_3, Index index_4) {
        aClass317_5120 = index_3;
        aClass317_5118 = index_4;
        aClass317_5120.filesCount(SharedConfigsType.MAP_SPRITES.id);
        Math.random();
        Math.random();
        Math.random();
        Math.random();
    }

    static int method7188(PathingEntity animable_0) {
        if (animable_0.anInt10340 == 0) {
            return 0;
        } else {
            int i_5;
            Vector3 vector3_9;
            if (animable_0.faceEntity != -1) {
                Object obj_2 = null;
                if (animable_0.faceEntity < 32768) {
                    ObjectNode class282_sub47_3 = (ObjectNode) client.NPC_MAP.get(animable_0.faceEntity);
                    if (class282_sub47_3 != null) {
                        obj_2 = class282_sub47_3.anObject8068;
                    }
                } else if (animable_0.faceEntity >= 32768) {
                    obj_2 = client.players[animable_0.faceEntity - 32768];
                }
                if (obj_2 != null) {
                    vector3_9 = Vector3.method6632(animable_0.method11166().coords, ((PathingEntity) obj_2).method11166().coords);
                    int i_4 = (int) vector3_9.x;
                    i_5 = (int) vector3_9.z;
                    if (i_4 != 0 || i_5 != 0) {
                        animable_0.method15863((int) (Math.atan2(i_4, i_5) * 2607.5945876176133D) & 0x3fff);
                    }
                }
            }
            if (animable_0 instanceof PlayerEntity) {
                PlayerEntity player_8 = (PlayerEntity) animable_0;
                if (player_8.faceDirection != -1 && (player_8.anInt10355 == 0 || player_8.anInt10366 > 0)) {
                    player_8.method15863(player_8.faceDirection);
                    player_8.faceDirection = -1;
                }
            } else if (animable_0 instanceof NPCEntity) {
                NPCEntity npc_10 = (NPCEntity) animable_0;
                if (npc_10.faceX != -1 && (npc_10.anInt10355 == 0 || npc_10.anInt10366 > 0)) {
                    vector3_9 = npc_10.method11166().coords;
                    CoordGrid coordgrid_7 = IndexLoaders.MAP_REGION_DECODER.getBase();
                    i_5 = (int) vector3_9.x - (npc_10.faceX * 256 - coordgrid_7.x * 256 - coordgrid_7.x * 256);
                    int i_6 = (int) vector3_9.z - (npc_10.faceY * 256 - coordgrid_7.y * 256 - coordgrid_7.y * 256);
                    if (i_5 != 0 || i_6 != 0) {
                        npc_10.method15863((int) (Math.atan2(i_5, i_6) * 2607.5945876176133D) & 0x3fff);
                    }
                    npc_10.faceX = -1;
                }
            }
            return animable_0.method15796();
        }
    }

    public MapSpriteDefinitions method7172(int i_1) {
        LRUCache softcache_4 = aClass229_5117;
        MapSpriteDefinitions class418_3;
        synchronized (aClass229_5117) {
            class418_3 = (MapSpriteDefinitions) aClass229_5117.get(i_1);
        }
        if (class418_3 != null) {
            return class418_3;
        } else {
            Index index_5 = aClass317_5120;
            byte[] bytes_10;
            synchronized (aClass317_5120) {
                bytes_10 = aClass317_5120.getFile(SharedConfigsType.MAP_SPRITES.id, i_1);
            }
            class418_3 = new MapSpriteDefinitions();
            class418_3.aClass427_4998 = this;
            if (bytes_10 != null) {
                class418_3.method7008(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = aClass229_5117;
            synchronized (aClass229_5117) {
                aClass229_5117.put(class418_3, i_1);
                return class418_3;
            }
        }
    }

    public void method7173() {
        LRUCache softcache_3 = aClass229_5117;
        synchronized (aClass229_5117) {
            aClass229_5117.method3858(5);
        }
        softcache_3 = aClass229_5122;
        synchronized (aClass229_5122) {
            aClass229_5122.method3858(5);
        }
    }

    public void method7174() {
        LRUCache softcache_2 = aClass229_5117;
        synchronized (aClass229_5117) {
            aClass229_5117.method3859();
        }
        softcache_2 = aClass229_5122;
        synchronized (aClass229_5122) {
            aClass229_5122.method3859();
        }
    }

    public void method7175(int i_1, int i_2) {
        aClass229_5117 = new LRUCache(i_1);
        aClass229_5122 = new LRUCache(i_2);
    }

    public void method7177() {
        LRUCache softcache_2 = aClass229_5117;
        synchronized (aClass229_5117) {
            aClass229_5117.method3863();
        }
        softcache_2 = aClass229_5122;
        synchronized (aClass229_5122) {
            aClass229_5122.method3863();
        }
    }
}
