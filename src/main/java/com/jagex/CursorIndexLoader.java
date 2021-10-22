package com.jagex;

import java.io.IOException;

public class CursorIndexLoader {

    LRUCache aClass229_5344 = new LRUCache(64);
    LRUCache aClass229_5342 = new LRUCache(2);
    Index configIndex;
    Index spritesIndex;

    public CursorIndexLoader(Index index_3, Index index_4) {
        configIndex = index_3;
        spritesIndex = index_4;
        configIndex.filesCount(SharedConfigsType.CURSORS.id);
    }

    public static void method7333(boolean bool_0) {
        BufferedConnectionContext[] arr_2 = client.aClass184Array7220;
        for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
            BufferedConnectionContext class184_4 = arr_2[i_3];
            try {
                class184_4.flush();
            } catch (IOException ignored) {
            }
            class184_4.method3051();
        }
        JS5StandardRequester.method5558();
        Class356.method6227(false);
        IndexLoaders.MAP_REGION_DECODER.method4444();
        IndexLoaders.MAP_REGION_DECODER.method4485();
        Class122.method2111(false);
        Class358.method6240();
        Class260.anInt3223 = -1;
        Class260.aBool3220 = false;
        GraphicsPreference.method12658();
        ClipFlagMap.method6008(true);
        Class459.method7678();
        Class204.method3367();
        Class42_Sub1.method14562();
        if (bool_0) {
            GameState.setGameState(12);
        } else {
            GameState.setGameState(5);
//			try {
//				Class441.method7377(SubInterface.suppliedApplet, "loggedout");
//			} catch (Throwable ignored) {
//			}
        }
    }

    static void createProjectile(int spotAnimId, int source, int lockOn, int basOffIdx, int startHeight, int endHeight, int localX, int localY, int xOff, int yOff, int startTime, int endTime, int angle, int slope, boolean useFloorHeight) {
        if (source != 0 && basOffIdx != -1) {
            Object entity = null;
            if (source < 0) {
                int playerId = -source - 1;
                if (playerId == client.myPlayerIndex) {
                    entity = VertexNormal.MY_PLAYER;
                } else {
                    entity = client.players[playerId];
                }
            } else {
                int npcIndex = source - 1;
                ObjectNode class282_sub47_18 = (ObjectNode) client.NPC_MAP.get(npcIndex);
                if (class282_sub47_18 != null) {
                    entity = class282_sub47_18.anObject8068;
                }
            }
            if (entity != null) {
                BASDefinitions renderanimdefs_19 = ((PathingEntity) entity).getRenderAnimDefs();
                if (renderanimdefs_19.anIntArrayArray2802 != null && renderanimdefs_19.anIntArrayArray2802[basOffIdx] != null) {
                    startHeight -= renderanimdefs_19.anIntArrayArray2802[basOffIdx][1];
                }
                if (renderanimdefs_19.anIntArrayArray2791 != null && renderanimdefs_19.anIntArrayArray2791[basOffIdx] != null) {
                    startHeight -= renderanimdefs_19.anIntArrayArray2791[basOffIdx][1];
                }
            }
        }
        ProjectileAnimation projectile = new ProjectileAnimation(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), spotAnimId, Class272.UPDATE_ZONE_PLANE, Class272.UPDATE_ZONE_PLANE, localX, localY, startHeight, startTime + client.CYCLES_20MS, endTime + client.CYCLES_20MS, angle, slope, source, lockOn, endHeight, useFloorHeight, basOffIdx);
        projectile.start(xOff, yOff, Class504.getTerrainHeightAtPos(xOff, yOff, Class272.UPDATE_ZONE_PLANE) - endHeight, startTime + client.CYCLES_20MS);
        client.PROJECTILES.append(new ProjectileNode(projectile));
    }

    public void method7324() {
        LRUCache softcache_2 = aClass229_5344;
        synchronized (aClass229_5344) {
            aClass229_5344.method3859();
        }
        softcache_2 = aClass229_5342;
        synchronized (aClass229_5342) {
            aClass229_5342.method3859();
        }
    }

    public CursorDefintions method7325(int i_1) {
        LRUCache softcache_4 = aClass229_5344;
        CursorDefintions class419_3;
        synchronized (aClass229_5344) {
            class419_3 = (CursorDefintions) aClass229_5344.get(i_1);
        }
        if (class419_3 != null) {
            return class419_3;
        } else {
            Index index_5 = configIndex;
            byte[] bytes_10;
            synchronized (configIndex) {
                bytes_10 = configIndex.getFile(SharedConfigsType.CURSORS.id, i_1);
            }
            class419_3 = new CursorDefintions();
            class419_3.loader = this;
            if (bytes_10 != null) {
                class419_3.method7024(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = aClass229_5344;
            synchronized (aClass229_5344) {
                aClass229_5344.put(class419_3, i_1);
                return class419_3;
            }
        }
    }

    public void method7326() {
        LRUCache softcache_3 = aClass229_5344;
        synchronized (aClass229_5344) {
            aClass229_5344.method3858(5);
        }
        softcache_3 = aClass229_5342;
        synchronized (aClass229_5342) {
            aClass229_5342.method3858(5);
        }
    }

    public void method7327() {
        LRUCache softcache_2 = aClass229_5344;
        synchronized (aClass229_5344) {
            aClass229_5344.method3863();
        }
        softcache_2 = aClass229_5342;
        synchronized (aClass229_5342) {
            aClass229_5342.method3863();
        }
    }
}
