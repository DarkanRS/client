package com.jagex;

import java.util.Iterator;

public class MapRegion {

    public long aLong3183;
    public boolean aBool3206;
    boolean aBool3171;
    Class256 aClass256_3164;
    CoordGrid aClass219_3169 = new CoordGrid();
    int[][] xteas;
    int[] regionIds;
    int[] mapDataArchiveIds;
    int[] landscapeDataArchiveIds;
    int[] npcSpawnArchiveIds;
    byte[][] mapDataBuffer;
    byte[][] landscapeDataBuffer;
    byte[][] npcSpawnBuffer;
    int[] hdWaterMapDataArchiveIds;
    int[] hdWaterLandscapeDataArchiveIds;
    byte[][] hdWaterMapDataBuffer;
    byte[][] hdWaterLandscapeDataBuffer;
    Class256 mapType;
    byte[][][] aByteArrayArrayArray3162;
    LocationIndexLoader objectDefsLoader;
    SceneObjectManager sceneObjectManager;
    Class339 aClass339_3188;
    int missingMapCount;
    int anInt3190 = 1;
    int anInt3191;
    int anInt3192 = 1;
    Class239 aClass239_3175;
    int anInt3177;
    int zFar;
    int sizeY;
    int sizeX;
    int[][][] chunkFlags;
    int[][] anIntArrayArray3185;
    int[][] anIntArrayArray3186;
    RenderFlagMap renderFlagMap;
    MapSize aClass106_3165;
    int anInt3170;
    int anInt3207;
    CoordGrid coordGrid = new CoordGrid();
    WorldMapDef aCacheableNode_Sub6_3176;
    StaticElements mapStaticElements;
    Class329_Sub1 highDetailWaterPlane;
    Class329_Sub1 aClass329_Sub1_3167;
    Class341 aClass341_3181 = new Class341();
    float aFloat3173;
    ClipFlagMap[] clipMaps = new ClipFlagMap[4];

    public MapRegion(boolean bool_1) {
        aBool3171 = bool_1;
    }

    static boolean routeTo(int i_0, int i_1, boolean bool_2, RouteStrategy routestrategy_3) {
        int i_5 = VertexNormal.MY_PLAYER.regionBaseX[0];
        int i_6 = VertexNormal.MY_PLAYER.regionBaseY[0];
        if (i_5 >= 0 && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_6 >= 0 && i_6 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
            if (i_0 >= 0 && i_0 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_1 >= 0 && i_1 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
                int i_7 = RouteFinder.findRoute(i_5, i_6, VertexNormal.MY_PLAYER.getSize(), routestrategy_3, IndexLoaders.MAP_REGION_DECODER.getClipMap(VertexNormal.MY_PLAYER.plane), bool_2, client.walkStepsX, client.walkStepsY);
                if (i_7 < 1) {
                    return false;
                } else {
                    Class187.anInt2361 = client.walkStepsX[i_7 - 1];
                    Class187.anInt2359 = client.walkStepsY[i_7 - 1];
                    Class187.aBool2360 = false;
                    MaterialProp28.method15255();
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static void method4561(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_7 = i_5 + i_2;
        int i_8 = i_3 - i_5;
        int i_9;
        for (i_9 = i_2; i_9 < i_7; i_9++) {
            KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_9], i_0, i_1, i_4);
        }
        for (i_9 = i_3; i_9 > i_8; --i_9) {
            KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_9], i_0, i_1, i_4);
        }
        i_9 = i_5 + i_0;
        int i_10 = i_1 - i_5;
        for (int i_11 = i_7; i_11 <= i_8; i_11++) {
            int[] ints_12 = Class532_Sub1.anIntArrayArray7072[i_11];
            KeyHoldInputSubscriber.method3922(ints_12, i_0, i_9, i_4);
            KeyHoldInputSubscriber.method3922(ints_12, i_10, i_1, i_4);
        }
    }

    static void method4562(int i_0, String string_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(2, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.string = string_1;
    }

    public static Class350 method4564(ByteBuf rsbytebuffer_0) {
        Class350 class350_2 = Class383.method6512(rsbytebuffer_0);
        int i_3 = rsbytebuffer_0.readInt();
        int i_4 = rsbytebuffer_0.readInt();
        int i_5 = rsbytebuffer_0.readBigSmart();
        return new Class350_Sub1(class350_2.aClass356_4094, class350_2.aClass353_4087, class350_2.anInt4090, class350_2.anInt4089, class350_2.anInt4093, class350_2.anInt4088, class350_2.anInt4092, class350_2.anInt4086, class350_2.anInt4091, i_4, i_5);
    }

    void method4418(MapRegion mapregion_1) {
        boolean bool_3 = mapregion_1.aBool3171;
        mapregion_1.aBool3171 = aBool3171;
        aBool3171 = bool_3;
        Class256 class256_4 = mapregion_1.aClass256_3164;
        mapregion_1.aClass256_3164 = aClass256_3164;
        aClass256_3164 = class256_4;
        mapregion_1.aClass219_3169 = coordGrid;
        aClass219_3169 = mapregion_1.coordGrid;
        aClass239_3175.method4039(mapregion_1.method4435());
    }

    public Class256 method4419() {
        return mapType;
    }

    public Class339 method4420() {
        return aClass339_3188;
    }

    public int method4421() {
        return 100 - missingMapCount * 100 / anInt3190;
    }

    void loadMapSceneBackground() {
        setMapSizes(Class480.getMapSize(Class393.preferences.buildArea.method12615()));
        int i_2 = coordGrid.x;
        int i_3 = coordGrid.y;
        int mapBaseX = (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX >> 12) + (i_2 >> 3);
        int mapBaseY = (Class246.CAM_MOVE_ABSOLUTEY >> 12) + (i_3 >> 3);
        VertexNormal.MY_PLAYER.plane = 0;
        Class4.MY_PLAYER_PLANE = 0;
        VertexNormal.MY_PLAYER.move(8, 8);
        byte regionSize = 18;
        xteas = new int[regionSize][4];
        regionIds = new int[regionSize];
        mapDataArchiveIds = new int[regionSize];
        landscapeDataArchiveIds = new int[regionSize];
        npcSpawnArchiveIds = new int[regionSize];
        mapDataBuffer = new byte[regionSize][];
        landscapeDataBuffer = new byte[regionSize][];
        npcSpawnBuffer = new byte[regionSize][];
        hdWaterMapDataArchiveIds = new int[regionSize];
        hdWaterLandscapeDataArchiveIds = new int[regionSize];
        hdWaterMapDataBuffer = new byte[regionSize][];
        hdWaterLandscapeDataBuffer = new byte[regionSize][];
        int i = 0;
        for (int regionX = (mapBaseX - (sizeX >> 4)) / 8; regionX <= (mapBaseX + (sizeX >> 4)) / 8; regionX++) {
            for (int regionY = (mapBaseY - (sizeY >> 4)) / 8; regionY <= (mapBaseY + (sizeY >> 4)) / 8; regionY++) {
                int regionId = regionY + (regionX << 8);
                regionIds[i] = regionId;
                mapDataArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, false, regionX, regionY));
                landscapeDataArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, false, regionX, regionY));
                npcSpawnArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId("n" + regionX + '_' + regionY);
                hdWaterMapDataArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, true, regionX, regionY));
                hdWaterLandscapeDataArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, true, regionX, regionY));
                if (npcSpawnArchiveIds[i] == -1) {
                    mapDataArchiveIds[i] = -1;
                    landscapeDataArchiveIds[i] = -1;
                    hdWaterMapDataArchiveIds[i] = -1;
                    hdWaterLandscapeDataArchiveIds[i] = -1;
                }
                ++i;
            }
        }
        for (int regionId = i; regionId < npcSpawnArchiveIds.length; regionId++) {
            npcSpawnArchiveIds[regionId] = -1;
            mapDataArchiveIds[regionId] = -1;
            landscapeDataArchiveIds[regionId] = -1;
            hdWaterMapDataArchiveIds[regionId] = -1;
            hdWaterLandscapeDataArchiveIds[regionId] = -1;
        }
        byte b_11;
        if (client.GAME_STATE == 5) {
            b_11 = 11;
        } else if (client.GAME_STATE == 7) {
            b_11 = 6;
        } else if (client.GAME_STATE == 0) {
            b_11 = 2;
        } else {
            if (client.GAME_STATE != 3) {
                throw new RuntimeException("" + client.GAME_STATE);
            }
            b_11 = 9;
        }
        method4458(mapBaseX, mapBaseY, b_11, false);
    }

    public int getSizeX() {
        return sizeX;
    }

    public Class341 method4426() {
        return aClass341_3181;
    }

    public float method4428() {
        return aFloat3173;
    }

    public SceneObjectManager getSceneObjectManager() {
        return sceneObjectManager;
    }

    void method4432(Class329_Sub1 class329_sub1_1, byte[][] bytes_2) {
        for (int i_4 = 0; i_4 < class329_sub1_1.anInt3845; i_4++) {
            if (!aBool3171) {
                MaterialPropTexture.method15391();
            }
            for (int i_5 = 0; i_5 < sizeX >> 3; i_5++) {
                for (int i_6 = 0; i_6 < sizeY >> 3; i_6++) {
                    int i_7 = chunkFlags[i_4][i_5][i_6];
                    if (i_7 != -1) {
                        int i_8 = i_7 >> 24 & 0x3;
                        if (!class329_sub1_1.overlayHidden || i_8 == 0) {
                            int i_9 = i_7 >> 1 & 0x3;
                            int i_10 = i_7 >> 14 & 0x3ff;
                            int i_11 = i_7 >> 3 & 0x7ff;
                            int i_12 = (i_10 / 8 << 8) + i_11 / 8;
                            for (int i_13 = 0; i_13 < regionIds.length; i_13++) {
                                if (i_12 == regionIds[i_13] && bytes_2[i_13] != null) {
                                    class329_sub1_1.method12462(Renderers.CURRENT_RENDERER, bytes_2[i_13], i_4, i_5 * 8, i_6 * 8, i_8, (i_10 & 0x7) * 8, (i_11 & 0x7) * 8, i_9, clipMaps);
                                    break;
                                }
                            }
                        }
                    }
                    if (aBool3171) {
                        method4462(5);
                    }
                }
            }
        }
    }

    public RenderFlagMap getRenderFlags() {
        return renderFlagMap;
    }

    public Class239 method4435() {
        return aClass239_3175;
    }

    public LocationIndexLoader method4436() {
        return objectDefsLoader;
    }

    public int[][] method4437() {
        return anIntArrayArray3185;
    }

    public int[][] method4438() {
        return anIntArrayArray3186;
    }

    void loadMapSceneDynamic(ByteBuf.Bit buffer) {
        int forceRefreshFlags = buffer.readUnsignedByteC();
        boolean forceRefresh = (forceRefreshFlags & 0x1) != 0;
        int type = buffer.readUnsigned128Byte();
        if (type == 1) {
            mapType = Class256.aClass256_3155;
        } else if (type == 2) {
            mapType = Class256.aClass256_3156;
        } else if (type == 3) {
            mapType = Class256.aClass256_3157;
        } else if (type == 4) {
            mapType = Class256.aClass256_3161;
        }
        int mapSize = buffer.readUnsignedByte128();
        int regionY = buffer.readUnsignedShort128();
        int regionX = buffer.readUnsignedShort();
        if (!aBool3171) {
            method4457();
        }
        setMapSizes(Class480.getMapSize(mapSize));
        buffer.initBitAccess();
        for (int regionIdx = 0; regionIdx < 4; regionIdx++) {
            for (int rx = 0; rx < sizeX >> 3; rx++) {
                for (int ry = 0; ry < sizeY >> 3; ry++) {
                    int hasChunkFlags = buffer.readBits(1);
                    if (hasChunkFlags == 1) {
                        chunkFlags[regionIdx][rx][ry] = buffer.readBits(26);
                    } else {
                        chunkFlags[regionIdx][rx][ry] = -1;
                    }
                }
            }
        }
        buffer.finishBitAccess();
        int i_9 = (buffer.buffer.length - buffer.index) / 16;
        xteas = new int[i_9][4];
        for (int i_10 = 0; i_10 < i_9; i_10++) {
            for (int i_11 = 0; i_11 < 4; i_11++) {
                xteas[i_10][i_11] = buffer.readInt();
            }
        }
        regionIds = new int[i_9];
        mapDataArchiveIds = new int[i_9];
        landscapeDataArchiveIds = new int[i_9];
        npcSpawnArchiveIds = null;
        mapDataBuffer = new byte[i_9][];
        landscapeDataBuffer = new byte[i_9][];
        npcSpawnBuffer = null;
        hdWaterMapDataArchiveIds = new int[i_9];
        hdWaterLandscapeDataArchiveIds = new int[i_9];
        hdWaterMapDataBuffer = new byte[i_9][];
        hdWaterLandscapeDataBuffer = new byte[i_9][];
        i_9 = 0;
        for (int i_10 = 0; i_10 < 4; i_10++) {
            for (int i_11 = 0; i_11 < sizeX >> 3; i_11++) {
                for (int i_12 = 0; i_12 < sizeY >> 3; i_12++) {
                    int i_13 = chunkFlags[i_10][i_11][i_12];
                    if (i_13 != -1) {
                        int i_14 = i_13 >> 14 & 0x3ff;
                        int i_15 = i_13 >> 3 & 0x7ff;
                        int i_16 = (i_14 / 8 << 8) + i_15 / 8;
                        int i_17;
                        for (i_17 = 0; i_17 < i_9; i_17++) {
                            if (i_16 == regionIds[i_17]) {
                                i_16 = -1;
                                break;
                            }
                        }
                        if (i_16 != -1) {
                            regionIds[i_9] = i_16;
                            i_17 = i_16 >> 8 & 0xff;
                            int i_18 = i_16 & 0xff;
                            mapDataArchiveIds[i_9] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, false, i_17, i_18));
                            landscapeDataArchiveIds[i_9] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, false, i_17, i_18));
                            hdWaterMapDataArchiveIds[i_9] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, true, i_17, i_18));
                            hdWaterLandscapeDataArchiveIds[i_9] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, true, i_17, i_18));
                            ++i_9;
                        }
                    }
                }
            }
        }
        method4458(regionX, regionY, 18, forceRefresh);
    }

    public void method4440(byte[][][] bytes_1) {
        aByteArrayArrayArray3162 = bytes_1;
    }

    public Class329_Sub1 method4441() {
        return aClass329_Sub1_3167;
    }

    public void setObjectIndexLoader(LocationIndexLoader objectindexloader_1) {
        objectDefsLoader = objectindexloader_1;
    }

    public void method4444() {
        if (sceneObjectManager != null) {
            Defaults8Loader.method11156();
            sceneObjectManager.aClass284_2648.method5012();
            sceneObjectManager = null;
        }
    }

    public void method4445() {
        aClass339_3188 = Class339.aClass339_3984;
        missingMapCount = 0;
        anInt3190 = 1;
        anInt3191 = 0;
        anInt3192 = 1;
    }

    public void method4446() {
        aClass239_3175 = new Class239(Renderers.CURRENT_RENDERER, sizeX >> 3, sizeY >> 3);
    }

    public void method4447() {
        anInt3177 = 200;
        zFar = (int) (34.46D * sizeX);
        zFar <<= 2;
        if (Renderers.CURRENT_RENDERER.method8454()) {
            zFar += 512;
        }
        zFar += 3072;
    }

    public int getSizeY() {
        return sizeY;
    }

    void loadMapSceneNormal(ByteBuf.Bit rsbitsbuffer_1) {
        int i_2 = rsbitsbuffer_1.readUnsignedByte();
        int i_3 = rsbitsbuffer_1.readUnsignedShort();
        int i_4 = rsbitsbuffer_1.readUnsignedShort();
        boolean bool_5 = rsbitsbuffer_1.readUnsignedByte() == 1;
        if (!aBool3171) {
            method4457();
        }
        setMapSizes(Class480.getMapSize(i_2));
        int i_6 = (rsbitsbuffer_1.buffer.length - rsbitsbuffer_1.index) / 16;
        xteas = new int[i_6][4];
        int i_7;
        int i_8;
        for (i_7 = 0; i_7 < i_6; i_7++) {
            for (i_8 = 0; i_8 < 4; i_8++) {
                xteas[i_7][i_8] = rsbitsbuffer_1.readInt();
            }
        }
        regionIds = new int[i_6];
        mapDataArchiveIds = new int[i_6];
        landscapeDataArchiveIds = new int[i_6];
        npcSpawnArchiveIds = null;
        mapDataBuffer = new byte[i_6][];
        landscapeDataBuffer = new byte[i_6][];
        npcSpawnBuffer = null;
        hdWaterMapDataArchiveIds = new int[i_6];
        hdWaterLandscapeDataArchiveIds = new int[i_6];
        hdWaterMapDataBuffer = new byte[i_6][];
        hdWaterLandscapeDataBuffer = new byte[i_6][];
        i_6 = 0;
        for (i_7 = (i_3 - (sizeX >> 4)) / 8; i_7 <= (i_3 + (sizeX >> 4)) / 8; i_7++) {
            for (i_8 = (i_4 - (sizeY >> 4)) / 8; i_8 <= (i_4 + (sizeY >> 4)) / 8; i_8++) {
                regionIds[i_6] = i_8 + (i_7 << 8);
                mapDataArchiveIds[i_6] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, false, i_7, i_8));
                landscapeDataArchiveIds[i_6] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, false, i_7, i_8));
                hdWaterMapDataArchiveIds[i_6] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, true, i_7, i_8));
                hdWaterLandscapeDataArchiveIds[i_6] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, true, i_7, i_8));
                ++i_6;
            }
        }
        method4458(i_3, i_4, 18, bool_5);
    }

	String getArchiveName(boolean settingsData, boolean underwaterMap, int regionX, int regionY) {
		String string = "";
		if (settingsData) {
			string = new StringBuilder().append(string).append("m").append(regionX).append('_').append(regionY).toString();
		} else {
			string = new StringBuilder().append(string).append("l").append(regionX).append('_').append(regionY).toString();
		}
		if (underwaterMap) {
			string = new StringBuilder().append('u').append(string).toString();
		}
		return string;
	}

    void setMapSizes(MapSize mapSize) {
        if (mapSize != aClass106_3165) {
            sizeX = sizeY = mapSize.size;
            chunkFlags = new int[4][sizeX >> 3][sizeY >> 3];
            anIntArrayArray3185 = new int[sizeX][sizeY];
            anIntArrayArray3186 = new int[sizeX][sizeY];
            for (int i_3 = 0; i_3 < 4; i_3++) {
                clipMaps[i_3] = Class403.createClipMap(sizeX, sizeY);
            }
            aByteArrayArrayArray3162 = new byte[4][sizeX][sizeY];
            renderFlagMap = new RenderFlagMap(sizeX, sizeY);
            method4446();
            aClass106_3165 = mapSize;
        }
    }

    void method4457() {
        if (mapType != Class256.aClass256_3153 && aClass256_3164 != Class256.aClass256_3153) {
            if (mapType == Class256.aClass256_3155 || mapType == Class256.aClass256_3157 || aClass256_3164 != mapType && (mapType == Class256.LOAD_MAP_SCENE_NORMAL || aClass256_3164 == Class256.LOAD_MAP_SCENE_NORMAL)) {
                client.NPC_UPDATE_INDEX = 0;
                client.anInt7210 = 0;
                client.NPC_MAP.method7749();
            }
            aClass256_3164 = mapType;
        }
    }

    void method4458(int i_1, int i_2, int i_3, boolean bool_4) {
        if (client.anInt7341 == 2) {
            if (aBool3171) {
                throw new IllegalStateException();
            }
            client.anInt7341 = 1;
            client.CURRENT_CUTSCENE = -1;
        }
        if (bool_4 || anInt3170 != i_1 || i_2 != anInt3207) {
            anInt3170 = i_1;
            anInt3207 = i_2;
            if (!aBool3171) {
                GameState.setGameState(i_3);
                Class446.method7447(LocalizedText.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE), true, Renderers.CURRENT_RENDERER, Class16.aFontRenderer_144, Class16.aClass414_139);
            }
            if (coordGrid != null) {
                aClass219_3169 = coordGrid;
            } else {
                aClass219_3169 = new CoordGrid(0, 0, 0);
            }
            coordGrid = new CoordGrid(0, (anInt3170 - (sizeX >> 4)) * 8, (anInt3207 - (sizeY >> 4)) * 8);
            aCacheableNode_Sub6_3176 = Class291.method5175(coordGrid.x, coordGrid.y);
            mapStaticElements = null;
            if (!aBool3171) {
                method4459(i_3);
            }
        }
    }

    void method4459(int i_1) {
        int i_3 = coordGrid.x - aClass219_3169.x;
        int i_4 = coordGrid.y - aClass219_3169.y;
        int i_5;
        int i_6;
        int i_8;
        int i_16;
        if (i_1 == 18) {
            for (i_5 = 0; i_5 < client.anInt7210; i_5++) {
                ObjectNode class282_sub47_15 = client.NPC_ARRAY[i_5];
                if (class282_sub47_15 != null) {
                    NPCEntity npc_7 = (NPCEntity) class282_sub47_15.anObject8068;
                    for (i_8 = 0; i_8 < npc_7.regionBaseX.length; i_8++) {
                        npc_7.regionBaseX[i_8] -= i_3;
                        npc_7.regionBaseY[i_8] -= i_4;
                    }
                    Vector3 vector3_20 = Vector3.popVectorStackTo(npc_7.method11166().coords);
                    vector3_20.x -= (i_3 * 512);
                    vector3_20.z -= (i_4 * 512);
                    npc_7.method11171(vector3_20);
                    vector3_20.pushVectorStack();
                }
            }
        } else {
            boolean bool_21 = false;
            client.NPC_UPDATE_INDEX = 0;
            i_6 = sizeX * 512 - 512;
            i_16 = sizeY * 512 - 512;
            for (i_8 = 0; i_8 < client.anInt7210; i_8++) {
                ObjectNode class282_sub47_9 = client.NPC_ARRAY[i_8];
                if (class282_sub47_9 != null) {
                    NPCEntity npc_18 = (NPCEntity) class282_sub47_9.anObject8068;
                    Vector3 vector3_19 = Vector3.popVectorStackTo(npc_18.method11166().coords);
                    vector3_19.x -= (i_3 * 512);
                    vector3_19.z -= (i_4 * 512);
                    npc_18.method11171(vector3_19);
                    if ((int) vector3_19.x >= 0 && (int) vector3_19.x <= i_6 && (int) vector3_19.z >= 0 && (int) vector3_19.z <= i_16) {
                        boolean bool_12 = true;
                        for (int i_13 = 0; i_13 < npc_18.regionBaseX.length; i_13++) {
                            npc_18.regionBaseX[i_13] -= i_3;
                            npc_18.regionBaseY[i_13] -= i_4;
                            if (npc_18.regionBaseX[i_13] < 0 || npc_18.regionBaseX[i_13] >= sizeX || npc_18.regionBaseY[i_13] < 0 || npc_18.regionBaseY[i_13] >= sizeY) {
                                bool_12 = false;
                            }
                        }
                        if (bool_12) {
                            client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = npc_18.index;
                        } else {
                            npc_18.setDefinition(null);
                            class282_sub47_9.unlink();
                            bool_21 = true;
                        }
                    } else {
                        npc_18.setDefinition(null);
                        class282_sub47_9.unlink();
                        bool_21 = true;
                    }
                    vector3_19.pushVectorStack();
                }
            }
            if (bool_21) {
                client.anInt7210 = client.NPC_MAP.size();
                i_8 = 0;
                ObjectNode class282_sub47_28;
                for (Iterator iterator_24 = client.NPC_MAP.iterator(); iterator_24.hasNext(); client.NPC_ARRAY[i_8++] = class282_sub47_28) {
                    class282_sub47_28 = (ObjectNode) iterator_24.next();
                }
            }
        }
        for (i_5 = 0; i_5 < 2048; i_5++) {
            PlayerEntity player_25 = client.players[i_5];
            if (player_25 != null) {
                for (i_16 = 0; i_16 < player_25.regionBaseX.length; i_16++) {
                    player_25.regionBaseX[i_16] -= i_3;
                    player_25.regionBaseY[i_16] -= i_4;
                }
                Vector3 vector3_22 = Vector3.popVectorStackTo(player_25.method11166().coords);
                vector3_22.x -= (i_3 * 512);
                vector3_22.z -= (i_4 * 512);
                player_25.method11171(vector3_22);
                vector3_22.pushVectorStack();
            }
        }
        HintArrow[] arr_14 = client.HINT_ARROWS;
        for (i_6 = 0; i_6 < arr_14.length; i_6++) {
            HintArrow class180_23 = arr_14[i_6];
            if (class180_23 != null) {
                class180_23.x -= i_3 * 512;
                class180_23.y -= i_4 * 512;
            }
        }
        Node_Sub31 class282_sub31_26;
        for (class282_sub31_26 = (Node_Sub31) Node_Sub31.aClass482_7775.head(); class282_sub31_26 != null; class282_sub31_26 = (Node_Sub31) Node_Sub31.aClass482_7775.next()) {
            class282_sub31_26.anInt7762 -= i_3;
            class282_sub31_26.anInt7763 -= i_4;
            if (mapType != Class256.aClass256_3161 && (class282_sub31_26.anInt7762 < 0 || class282_sub31_26.anInt7763 < 0 || class282_sub31_26.anInt7762 >= sizeX || class282_sub31_26.anInt7763 >= sizeY)) {
                class282_sub31_26.unlink();
            }
        }
        for (class282_sub31_26 = (Node_Sub31) Node_Sub31.aClass482_7776.head(); class282_sub31_26 != null; class282_sub31_26 = (Node_Sub31) Node_Sub31.aClass482_7776.next()) {
            class282_sub31_26.anInt7762 -= i_3;
            class282_sub31_26.anInt7763 -= i_4;
            if (mapType != Class256.aClass256_3161 && (class282_sub31_26.anInt7762 < 0 || class282_sub31_26.anInt7763 < 0 || class282_sub31_26.anInt7762 >= sizeX || class282_sub31_26.anInt7763 >= sizeY)) {
                class282_sub31_26.unlink();
            }
        }
        for (Node_Sub29 class282_sub29_27 = (Node_Sub29) client.aClass465_7414.method7750(); class282_sub29_27 != null; class282_sub29_27 = (Node_Sub29) client.aClass465_7414.method7751()) {
            i_16 = (int) (class282_sub29_27.pointer >> 28 & 0x3L);
            i_8 = (int) (class282_sub29_27.pointer & 0x3fffL);
            int i_17 = i_8 - coordGrid.x;
            int i_10 = (int) (class282_sub29_27.pointer >> 14 & 0x3fffL);
            int i_11 = i_10 - coordGrid.y;
            if (sceneObjectManager != null) {
                if (i_17 >= 0 && i_11 >= 0 && i_17 < sizeX && i_11 < sizeY && i_17 < sceneObjectManager.sizeX && i_11 < sceneObjectManager.sizeY) {
                    if (sceneObjectManager.aClass293ArrayArrayArray2604 != null) {
                        sceneObjectManager.method3405(i_16, i_17, i_11);
                    }
                } else if (mapType != Class256.aClass256_3161) {
                    class282_sub29_27.unlink();
                }
            }
        }
        if (Class187.anInt2361 != 0) {
            Class187.anInt2361 -= i_3;
            Class187.anInt2359 -= i_4;
        }
        Class16.method566();
        ClipFlagMap.method6008(false);
        if (i_1 == 18) {
            client.anInt7262 -= i_3 * 512;
            client.anInt7376 -= i_4 * 512;
            Class11.anInt122 -= i_3 * 512;
            LibraryBase.anInt3289 -= i_4 * 512;
            if (NativeLibraryLoader.anInt3240 != 4) {
                NativeLibraryLoader.anInt3240 = 2;
                Class86.anInt833 = -1;
                PingRequester.anInt5864 = -1;
            }
        } else {
            Class296.CAM_MOVE_LOCALX -= i_3;
            SubInterface.CAM_MOVE_LOCALY -= i_4;
            PlaySynthCutsceneAction.anInt9368 -= i_3;
            IdentiKitIndexLoader.anInt4280 -= i_4;
            IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX -= i_3 * 512;
            Class246.CAM_MOVE_ABSOLUTEY -= i_4 * 512;
            if (Math.abs(i_3) > sizeX || Math.abs(i_4) > sizeY) {
                aClass239_3175.method4048();
            }
        }
        Class350.method6189();
        QuickchatFiller.method1139();
        client.aClass465_7334.method7749();
        client.PROJECTILES.removeAll();
        client.aClass457_7335.method7651();
        NewsItemFetcher.method795();
    }

    void method4460() {
        highDetailWaterPlane = null;
        aClass329_Sub1_3167 = null;
        for (int i_2 = 0; i_2 < 4; i_2++) {
            if (clipMaps[i_2] != null) {
                clipMaps[i_2].initEmpty();
            }
        }
        if (renderFlagMap != null) {
            renderFlagMap.reset();
        }
        if (aClass239_3175 != null) {
            aClass239_3175.method4044();
        }
        if (sceneObjectManager != null) {
            sceneObjectManager.aClass284_2648.method5012();
            sceneObjectManager = null;
        }
    }

    public boolean method4461() {
        if (!aBool3171) {
            Exception_Sub3.method15619(false);
        }
        missingMapCount = 0;
        int i_2;
        for (i_2 = 0; i_2 < mapDataBuffer.length; i_2++) {
            if (mapDataArchiveIds[i_2] != -1 && mapDataBuffer[i_2] == null) {
                mapDataBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(mapDataArchiveIds[i_2], 0);
                if (mapDataBuffer[i_2] == null) {
                    ++missingMapCount;
                }
            }
            if (landscapeDataArchiveIds[i_2] != -1 && landscapeDataBuffer[i_2] == null) {
                landscapeDataBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(landscapeDataArchiveIds[i_2], 0, xteas[i_2]);
                if (landscapeDataBuffer[i_2] == null) {
                    ++missingMapCount;
                }
            }
            if (hdWaterMapDataArchiveIds[i_2] != -1 && hdWaterMapDataBuffer[i_2] == null) {
                hdWaterMapDataBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(hdWaterMapDataArchiveIds[i_2], 0);
                if (hdWaterMapDataBuffer[i_2] == null) {
                    ++missingMapCount;
                }
            }
            if (hdWaterLandscapeDataArchiveIds[i_2] != -1 && hdWaterLandscapeDataBuffer[i_2] == null) {
                hdWaterLandscapeDataBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(hdWaterLandscapeDataArchiveIds[i_2], 0);
                if (hdWaterLandscapeDataBuffer[i_2] == null) {
                    ++missingMapCount;
                }
            }
            if (npcSpawnArchiveIds != null && npcSpawnBuffer[i_2] == null && npcSpawnArchiveIds[i_2] != -1) {
                npcSpawnBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(npcSpawnArchiveIds[i_2], 0, xteas[i_2]);
                if (npcSpawnBuffer[i_2] == null) {
                    ++missingMapCount;
                }
            }
        }
        if (mapStaticElements == null) {
            if (aCacheableNode_Sub6_3176 != null && IndexLoaders.WORLD_MAP_INDEX.validFile(aCacheableNode_Sub6_3176.staticElementsName + "_staticelements")) {
                if (!IndexLoaders.WORLD_MAP_INDEX.method5629(aCacheableNode_Sub6_3176.staticElementsName + "_staticelements")) {
                    ++missingMapCount;
                } else {
                    mapStaticElements = Class301.getStaticElements(IndexLoaders.WORLD_MAP_INDEX, aCacheableNode_Sub6_3176.staticElementsName + "_staticelements", client.membersWorld);
                }
            } else {
                mapStaticElements = new StaticElements(0);
            }
        }
        if (missingMapCount > 0) {
            if (anInt3190 < missingMapCount) {
                anInt3190 = missingMapCount;
            }
            aClass339_3188 = Class339.aClass339_3985;
            return false;
        } else {
            anInt3191 = 0;
            int i_5;
            int i_6;
            for (i_2 = 0; i_2 < mapDataBuffer.length; i_2++) {
                byte[] bytes_3 = landscapeDataBuffer[i_2];
                int i_4;
                if (bytes_3 != null) {
                    i_4 = (regionIds[i_2] >> 8) * 64 - coordGrid.x;
                    i_5 = (regionIds[i_2] & 0xff) * 64 - coordGrid.y;
                    if (mapType.allowDynamicMapScene()) {
                        i_4 = 10;
                        i_5 = 10;
                    }
                    i_6 = RenderFlagMap.decodeLandscapeData(objectDefsLoader, bytes_3, i_4, i_5, sizeX, sizeY);
                    if (i_6 > 0) {
                        anInt3191 += i_6;
                    }
                }
                bytes_3 = hdWaterLandscapeDataBuffer[i_2];
                if (bytes_3 != null) {
                    i_4 = (regionIds[i_2] >> 8) * 64 - coordGrid.x;
                    i_5 = (regionIds[i_2] & 0xff) * 64 - coordGrid.y;
                    if (mapType.allowDynamicMapScene()) {
                        i_4 = 10;
                        i_5 = 10;
                    }
                    i_6 = RenderFlagMap.decodeLandscapeData(objectDefsLoader, bytes_3, i_4, i_5, sizeX, sizeY);
                    if (i_6 > 0) {
                        anInt3191 += i_6;
                    }
                }
            }
            if (anInt3191 > 0) {
                if (anInt3192 < anInt3191) {
                    anInt3192 = anInt3191;
                }
                aClass339_3188 = Class339.aClass339_3983;
                return false;
            } else {
                if (!aBool3171 && aClass339_3188 != Class339.aClass339_3984) {
                    Class446.method7447(LocalizedText.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE) + "<br>" + "(100%)", true, Renderers.CURRENT_RENDERER, Class16.aFontRenderer_144, Class16.aClass414_139);
                }
                aClass339_3188 = Class339.aClass339_3982;
                if (!aBool3171) {
                    MaterialPropTexture.method15391();
                }
                if (!aBool3171) {
                    for (i_2 = 0; i_2 < 2048; i_2++) {
                        PlayerEntity player_18 = client.players[i_2];
                        if (player_18 != null) {
                            player_18.aClass206_7970 = null;
                        }
                    }
                    for (i_2 = 0; i_2 < client.NPC_ARRAY.length; i_2++) {
                        ObjectNode class282_sub47_19 = client.NPC_ARRAY[i_2];
                        if (class282_sub47_19 != null) {
                            ((GraphNode_Sub1) class282_sub47_19.anObject8068).aClass206_7970 = null;
                        }
                    }
                }
                if (!aBool3171) {
                    Class356.method6227(true);
                }
                if (!aBool3171) {
                    Class247.method4250();
                }
                boolean highDetailWater = false;
                int chunkSize;
                if (Class393.preferences.water.getValue() == 2) {
                    for (chunkSize = 0; chunkSize < mapDataBuffer.length; chunkSize++) {
                        if (hdWaterLandscapeDataBuffer[chunkSize] != null || hdWaterMapDataBuffer[chunkSize] != null) {
                            highDetailWater = true;
                            break;
                        }
                    }
                }
                chunkSize = Class5.method295(Class393.preferences.aPreference_Sub16_8198.method12750()).chunkSize * 8;
                if (Renderers.CURRENT_RENDERER.method8454()) {
                    ++chunkSize;
                }
                method4447();
                method4460();
                sceneObjectManager = new SceneObjectManager(Renderers.CURRENT_RENDERER, sizeX, sizeY, chunkSize, highDetailWater, Renderers.CURRENT_RENDERER.method8463() > 0);
                sceneObjectManager.method3380(false);
                sceneObjectManager.method3378();
                if (client.anInt7240 != 0) {
                    sceneObjectManager.method3379();
                } else {
                    sceneObjectManager.method3379();
                }
                aClass341_3181 = new Class341();
                aFloat3173 = -0.05f + (float) (Math.random() / 10.0D);
                aClass329_Sub1_3167 = new Class329_Sub1(sceneObjectManager, objectDefsLoader, 4, sizeX, sizeY, false, renderFlagMap, aClass239_3175);
                aClass329_Sub1_3167.method5835();
                aClass329_Sub1_3167.anInt3809 = Class393.preferences.sceneryShadows.method12624();
                aClass329_Sub1_3167.highDetailWater = Class393.preferences.water.getValue() == 2;
                aClass329_Sub1_3167.aBool3780 = Class393.preferences.lightDetail.method12786() == 1;
                aClass329_Sub1_3167.aBool3820 = Class393.preferences.groundBlending.method12762() == 1;
                aClass329_Sub1_3167.aBool3782 = Class393.preferences.textures.method12873() == 1;
                if (!mapType.allowDynamicMapScene()) {
                    decodeUnderlayMasks(aClass329_Sub1_3167, mapDataBuffer);
                } else {
                    method4464(aClass329_Sub1_3167, mapDataBuffer);
                }
                if (aBool3171) {
                    method4462(50);
                }
                aClass239_3175.method4045(sizeX >> 4, sizeY >> 4);
                aClass239_3175.method4037(this);
                if (highDetailWater) {
                    sceneObjectManager.method3380(true);
                    highDetailWaterPlane = new Class329_Sub1(sceneObjectManager, objectDefsLoader, 1, sizeX, sizeY, true, renderFlagMap, aClass239_3175);
                    highDetailWaterPlane.method5835();
                    highDetailWaterPlane.anInt3809 = Class393.preferences.sceneryShadows.method12624();
                    highDetailWaterPlane.highDetailWater = Class393.preferences.water.getValue() == 2;
                    highDetailWaterPlane.aBool3780 = Class393.preferences.lightDetail.method12786() == 1;
                    highDetailWaterPlane.aBool3820 = Class393.preferences.groundBlending.method12762() == 1;
                    highDetailWaterPlane.aBool3782 = Class393.preferences.textures.method12873() == 1;
                    if (!mapType.allowDynamicMapScene()) {
                        decodeUnderlayMasks(highDetailWaterPlane, hdWaterMapDataBuffer);
                        if (!aBool3171) {
                            Exception_Sub3.method15619(true);
                        }
                    } else {
                        method4464(highDetailWaterPlane, hdWaterMapDataBuffer);
                        if (!aBool3171) {
                            Exception_Sub3.method15619(true);
                        }
                    }
                    highDetailWaterPlane.method5853(aClass329_Sub1_3167.tileHeights[0]);
                    highDetailWaterPlane.initClipMap(Renderers.CURRENT_RENDERER, null, null);
                    sceneObjectManager.method3380(false);
                    if (aBool3171) {
                        method4462(50);
                    }
                }
                aClass329_Sub1_3167.initClipMap(Renderers.CURRENT_RENDERER, highDetailWater ? highDetailWaterPlane.tileHeights : null, clipMaps);
                if (!mapType.allowDynamicMapScene()) {
                    if (!aBool3171) {
                        Exception_Sub3.method15619(true);
                    }
                    method4465(aClass329_Sub1_3167, landscapeDataBuffer);
                    if (npcSpawnBuffer != null) {
                        decodeNPCSpawns();
                    }
                } else {
                    if (!aBool3171) {
                        Exception_Sub3.method15619(true);
                    }
                    method4432(aClass329_Sub1_3167, landscapeDataBuffer);
                }
                if (!aBool3171) {
                    Exception_Sub3.method15619(true);
                }
                aClass329_Sub1_3167.method5837(Renderers.CURRENT_RENDERER, highDetailWater ? sceneObjectManager.aGroundArray2614[0] : null, null);
                if (aBool3171) {
                    method4462(75);
                }
                aClass329_Sub1_3167.method12463(false);
                if (aBool3171) {
                    method4462(75);
                }
                if (!aBool3171) {
                    Exception_Sub3.method15619(true);
                }
                if (highDetailWater) {
                    sceneObjectManager.method3380(true);
                    if (!aBool3171) {
                        Exception_Sub3.method15619(true);
                    }
                    if (!mapType.allowDynamicMapScene()) {
                        method4465(highDetailWaterPlane, hdWaterLandscapeDataBuffer);
                    } else {
                        method4432(highDetailWaterPlane, hdWaterLandscapeDataBuffer);
                    }
                    if (!aBool3171) {
                        Exception_Sub3.method15619(true);
                    }
                    highDetailWaterPlane.method5837(Renderers.CURRENT_RENDERER, null, sceneObjectManager.aGroundArray2607[0]);
                    highDetailWaterPlane.method12463(true);
                    if (!aBool3171) {
                        Exception_Sub3.method15619(true);
                    }
                    sceneObjectManager.method3380(false);
                    if (aBool3171) {
                        method4462(50);
                    }
                }
                aClass329_Sub1_3167.method5891();
                if (highDetailWaterPlane != null) {
                    highDetailWaterPlane.method5891();
                }
                sceneObjectManager.method3428();
                if (aBool3171) {
                    Utils.time();
                    while (!Renderers.CURRENT_RENDERER.method8455()) {
                        method4462(1);
                    }
                }
                boolean bool_21 = false;
                if (aBool3171) {
                    MapRegion mapregion_12 = IndexLoaders.MAP_REGION_DECODER;
                    method4418(mapregion_12);
                    IndexLoaders.MAP_REGION_LOADER_THREAD.method6050(mapregion_12);
                    bool_21 = true;
                    Utils.time();
                    Object object_13 = client.anObject7227;
                    synchronized (client.anObject7227) {
                        client.aBool7225 = true;
                        try {
                            client.anObject7227.wait();
                        } catch (InterruptedException ignored) {
                        }
                    }
                    IndexLoaders.MAP_REGION_DECODER = this;
                    mapregion_12.method4460();
                    method4459(18);
                    method4457();
                } else {
                    MaterialPropTexture.method15391();
                    aClass239_3175.method4075();
                    Node_Sub15_Sub1.method14840();
                }
                int i_14;
                for (i_5 = 0; i_5 < 4; i_5++) {
                    for (i_6 = 0; i_6 < sizeX; i_6++) {
                        for (i_14 = 0; i_14 < sizeY; i_14++) {
                            Class434_Sub1.method12760(i_5, i_6, i_14);
                        }
                    }
                }
                for (i_5 = 0; i_5 < client.HINT_TRAILS.length; i_5++) {
                    if (client.HINT_TRAILS[i_5] != null) {
                        client.HINT_TRAILS[i_5].method4978(sceneObjectManager);
                    }
                }
                ClanVarDefinitions.method6823();
                Class48_Sub2.method14571();
                TCPPacket tcpmessage_22;
                if (NamedFileReference.method867() == Class279.aClass279_3368 && client.GAME_CONNECTION_CONTEXT.getConnection() != null && client.GAME_STATE == 18) {
                    tcpmessage_22 = TCPPacket.createPacket(ClientProt.UNK_82, client.GAME_CONNECTION_CONTEXT.isaac);
                    tcpmessage_22.buffer.writeInt(1057001181);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_22);
                }
                if (!mapType.allowDynamicMapScene()) {
                    i_5 = (anInt3170 - (sizeX >> 4)) / 8;
                    i_6 = (anInt3170 + (sizeX >> 4)) / 8;
                    i_14 = (anInt3207 - (sizeY >> 4)) / 8;
                    int i_8 = (anInt3207 + (sizeY >> 4)) / 8;
                    for (int i_9 = i_5 - 1; i_9 <= i_6 + 1; i_9++) {
                        for (int i_10 = i_14 - 1; i_10 <= i_8 + 1; i_10++) {
                            if (i_9 < i_5 || i_9 > i_6 || i_10 < i_14 || i_10 > i_8) {
                                IndexLoaders.MAP_INDEX.method5630(getArchiveName(true, false, i_9, i_10));
                                IndexLoaders.MAP_INDEX.method5630(getArchiveName(false, false, i_9, i_10));
                                IndexLoaders.MAP_INDEX.method5630(getArchiveName(true, true, i_9, i_10));
                                IndexLoaders.MAP_INDEX.method5630(getArchiveName(false, true, i_9, i_10));
                            }
                        }
                    }
                }
                if (client.GAME_STATE == 11) {
                    GameState.setGameState(5);
                } else if (client.GAME_STATE == 2) {
                    GameState.setGameState(0);
                } else if (client.GAME_STATE == 6) {
                    GameState.setGameState(7);
                } else if (client.GAME_STATE == 9) {
                    GameState.setGameState(3);
                } else {
                    GameState.setGameState(13);
                    if (client.GAME_CONNECTION_CONTEXT.getConnection() != null) {
                        tcpmessage_22 = TCPPacket.createPacket(ClientProt.REGION_LOADED_CONFIRM, client.GAME_CONNECTION_CONTEXT.isaac);
                        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_22);
                    }
                }
                ParticleProducerDefinition.method1160();
                if (aBool3206) {
                    Class209.printConsoleMessage(Long.toString(Utils.time() - aLong3183));
                    aBool3206 = false;
                }
                if (bool_21) {
                    Object object_23 = client.anObject7226;
                    synchronized (client.anObject7226) {
                        client.anObject7226.notify();
                    }
                }
                return true;
            }
        }
    }

    void method4462(int i_1) {
        try {
            Thread.sleep(i_1);
        } catch (InterruptedException ignored) {
        }
    }

    void decodeUnderlayMasks(Class329_Sub1 class329_sub1_1, byte[][] bytes_2) {
        int i_4 = bytes_2.length;
        int i_5;
        for (i_5 = 0; i_5 < i_4; i_5++) {
            byte[] bytes_6 = bytes_2[i_5];
            if (bytes_6 != null) {
                ByteBuf rsbytebuffer_7 = new ByteBuf(bytes_6);
                int i_8 = regionIds[i_5] >> 8;
                int i_9 = regionIds[i_5] & 0xff;
                int i_10 = i_8 * 64 - coordGrid.x;
                int i_11 = i_9 * 64 - coordGrid.y;
                if (!aBool3171) {
                    MaterialPropTexture.method15391();
                }
                class329_sub1_1.decodeTileMasksUnderlay(rsbytebuffer_7, i_10, i_11, coordGrid.x, coordGrid.y, clipMaps);
                class329_sub1_1.method12471(Renderers.CURRENT_RENDERER, rsbytebuffer_7, i_10, i_11);
            }
        }
        for (i_5 = 0; i_5 < i_4; i_5++) {
            int i_12 = (regionIds[i_5] >> 8) * 64 - coordGrid.x;
            int i_13 = (regionIds[i_5] & 0xff) * 64 - coordGrid.y;
            byte[] bytes_14 = bytes_2[i_5];
            if (bytes_14 == null && anInt3207 < 800) {
                if (!aBool3171) {
                    MaterialPropTexture.method15391();
                }
                class329_sub1_1.method5890(i_12, i_13);
            }
        }
    }

    void method4464(Class329_Sub1 class329_sub1_1, byte[][] bytes_2) {
        for (int i_4 = 0; i_4 < class329_sub1_1.anInt3845; i_4++) {
            if (!aBool3171) {
                MaterialPropTexture.method15391();
            }
            for (int x = 0; x < sizeX >> 3; x++) {
                for (int y = 0; y < sizeY >> 3; y++) {
                    int chunkFlag = chunkFlags[i_4][x][y];
                    if (chunkFlag != -1) {
                        int plane = chunkFlag >> 24 & 0x3;
                        if (!class329_sub1_1.overlayHidden || plane == 0) {
                            int rotation = chunkFlag >> 1 & 0x3;
                            int realX = chunkFlag >> 14 & 0x3ff;
                            int realY = chunkFlag >> 3 & 0x7ff;
                            int i_12 = (realX / 8 << 8) + realY / 8;
                            for (int i_13 = 0; i_13 < regionIds.length; i_13++) {
                                if (i_12 == regionIds[i_13] && bytes_2[i_13] != null) {
                                    ByteBuf rsbytebuffer_14 = new ByteBuf(bytes_2[i_13]);
                                    class329_sub1_1.method5841(rsbytebuffer_14, i_4, x * 8, y * 8, plane, realX, realY, rotation, clipMaps);
                                    class329_sub1_1.decodeDynamicMap(Renderers.CURRENT_RENDERER, rsbytebuffer_14, i_4, x * 8, y * 8, plane, realX, realY, rotation);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i_4 = 0; i_4 < class329_sub1_1.anInt3845; i_4++) {
            if (!aBool3171) {
                MaterialPropTexture.method15391();
            }
            for (int i_5 = 0; i_5 < sizeX >> 3; i_5++) {
                for (int i_6 = 0; i_6 < sizeY >> 3; i_6++) {
                    int i_7 = chunkFlags[i_4][i_5][i_6];
                    if (i_7 == -1) {
                        class329_sub1_1.method5838(i_4, i_5 * 8, i_6 * 8, 8, 8);
                    }
                }
            }
        }
    }

    void method4465(Class329_Sub1 class329_sub1_1, byte[][] bytes_2) {
        int i_4 = mapDataBuffer.length;
        for (int i_5 = 0; i_5 < i_4; i_5++) {
            byte[] bytes_6 = bytes_2[i_5];
            if (bytes_6 != null) {
                int i_7 = (regionIds[i_5] >> 8) * 64 - coordGrid.x;
                int i_8 = (regionIds[i_5] & 0xff) * 64 - coordGrid.y;
                if (!aBool3171) {
                    MaterialPropTexture.method15391();
                }
                class329_sub1_1.method12461(Renderers.CURRENT_RENDERER, bytes_6, i_7, i_8, clipMaps);
                if (aBool3171) {
                    method4462(10);
                }
            }
        }
    }

    void decodeNPCSpawns() {
        int i_2 = npcSpawnBuffer.length;
        for (int i_3 = 0; i_3 < i_2; i_3++) {
            if (npcSpawnBuffer[i_3] != null) {
                int i_4 = -1;
                for (int i_5 = 0; i_5 < client.anInt7234; i_5++) {
                    if (client.anIntArray7228[i_5] == regionIds[i_3]) {
                        i_4 = i_5;
                        break;
                    }
                }
                if (i_4 == -1) {
                    client.anIntArray7228[client.anInt7234] = regionIds[i_3];
                    i_4 = ++client.anInt7234 - 1;
                }
                ByteBuf rsbytebuffer_18 = new ByteBuf(npcSpawnBuffer[i_3]);
                int i_6 = 0;
                while (rsbytebuffer_18.index < npcSpawnBuffer[i_3].length && i_6 < 511 && client.NPC_UPDATE_INDEX < 1023) {
                    int i_7 = i_4 | i_6++ << 6;
                    int i_8 = rsbytebuffer_18.readUnsignedShort();
                    int i_9 = i_8 >> 14;
                    int i_10 = i_8 >> 7 & 0x3f;
                    int i_11 = i_8 & 0x3f;
                    int i_12 = (regionIds[i_3] >> 8) * 64 - coordGrid.x + i_10;
                    int i_13 = (regionIds[i_3] & 0xff) * 64 - coordGrid.y + i_11;
                    NPCDefinitions npcdefinitions_14 = IndexLoaders.NPC_INDEX_LOADER.getNPCType(rsbytebuffer_18.readUnsignedShort());
                    ObjectNode class282_sub47_15 = (ObjectNode) client.NPC_MAP.get(i_7);
                    if (class282_sub47_15 == null && (npcdefinitions_14.walkMask & 0x1) > 0 && i_12 >= 0 && i_12 + npcdefinitions_14.size < sizeX && i_13 >= 0 && i_13 + npcdefinitions_14.size < sizeY) {
                        NPCEntity npc_16 = new NPCEntity(sceneObjectManager);
                        npc_16.index = i_7;
                        ObjectNode class282_sub47_17 = new ObjectNode(npc_16);
                        client.NPC_MAP.put(class282_sub47_17, i_7);
                        client.NPC_ARRAY[++client.anInt7210 - 1] = class282_sub47_17;
                        client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = i_7;
                        npc_16.lastUpdate = client.CYCLES_20MS;
                        npc_16.setDefinition(npcdefinitions_14);
                        npc_16.setBoundSize(npc_16.definitions.size);
                        npc_16.anInt10340 = npc_16.definitions.contrast << 3;
                        npc_16.turn(npc_16.definitions.respawnDirection.method4317().getValue() << 11 & 0x3fff, true);
                        npc_16.move(i_9, i_12, i_13, true, npc_16.getSize());
                    }
                }
            }
        }
    }

    public void method4485() {
        coordGrid = new CoordGrid();
        anInt3207 = 0;
        anInt3170 = 0;
    }

    void method4498() {
        aClass256_3164 = mapType;
        setMapSizes(MapSize.SIZE_104);
        int i_2;
        int i_4;
        int i_21;
        for (i_2 = 0; i_2 < 4; i_2++) {
            for (i_21 = 0; i_21 < sizeX >> 3; i_21++) {
                for (i_4 = 0; i_4 < sizeY >> 3; i_4++) {
                    chunkFlags[i_2][i_21][i_4] = -1;
                }
            }
        }
        for (CutsceneArea cutsceneArea = (CutsceneArea) Class86.CUTSCENE_AREAS.head(); cutsceneArea != null; cutsceneArea = (CutsceneArea) Class86.CUTSCENE_AREAS.next()) {
            i_21 = cutsceneArea.anInt7486;
            boolean bool_22 = (i_21 & 0x1) == 1;
            int i_5 = cutsceneArea.regionX >> 3;
            int i_6 = cutsceneArea.regionY >> 3;
            int i_7 = cutsceneArea.anInt7480;
            int i_8 = cutsceneArea.anInt7483;
            int i_9 = cutsceneArea.plane;
            int i_10 = cutsceneArea.anInt7481;
            int i_11 = cutsceneArea.width;
            int i_12 = cutsceneArea.length;
            int i_13 = 0;
            int i_14 = 0;
            byte b_15 = 1;
            byte b_16 = 1;
            if (i_21 == 1) {
                i_14 = i_11 - 1;
                b_15 = -1;
            } else if (i_21 == 2) {
                i_14 = i_11 - 1;
                i_13 = i_12 - 1;
                b_15 = -1;
                b_16 = -1;
            } else if (i_21 == 3) {
                i_13 = i_12 - 1;
                b_15 = 1;
                b_16 = -1;
            }
            for (int i_17 = i_6; i_17 < i_12 + i_6; i_13 += b_16) {
                int i_18 = i_14;
                for (int i_19 = i_5; i_19 < i_11 + i_5; i_18 += b_15) {
                    if (bool_22) {
                        chunkFlags[i_10][i_7 + i_13][i_18 + i_8] = (i_19 << 14) + (i_17 << 3) + (i_9 << 24) + (i_21 << 1);
                    } else {
                        chunkFlags[i_10][i_18 + i_7][i_8 + i_13] = (i_19 << 14) + (i_17 << 3) + (i_9 << 24) + (i_21 << 1);
                    }
                    ++i_19;
                }
                ++i_17;
            }
        }
        i_2 = NativeLibraryLoader.CUTSCENE_MAP_XTEAS.length;
        regionIds = new int[i_2];
        mapDataArchiveIds = new int[i_2];
        landscapeDataArchiveIds = new int[i_2];
        npcSpawnArchiveIds = null;
        mapDataBuffer = new byte[i_2][];
        landscapeDataBuffer = new byte[i_2][];
        npcSpawnBuffer = null;
        hdWaterMapDataArchiveIds = new int[i_2];
        hdWaterLandscapeDataArchiveIds = new int[i_2];
        hdWaterMapDataBuffer = new byte[i_2][];
        hdWaterLandscapeDataBuffer = new byte[i_2][];
        i_2 = 0;
        for (CutsceneArea class282_sub2_3 = (CutsceneArea) Class86.CUTSCENE_AREAS.head(); class282_sub2_3 != null; class282_sub2_3 = (CutsceneArea) Class86.CUTSCENE_AREAS.next()) {
            i_4 = class282_sub2_3.regionX >>> 3;
            int i_5 = class282_sub2_3.regionY >>> 3;
            int i_6 = i_4 + class282_sub2_3.width;
            if ((i_6 & 0x7) == 0) {
                --i_6;
            }
            i_6 >>>= 3;
            int i_7 = i_5 + class282_sub2_3.length;
            if ((i_7 & 0x7) == 0) {
                --i_7;
            }
            i_7 >>>= 3;
            for (int i_8 = i_4 >>> 3; i_8 <= i_6; i_8++) {
                label82:
                for (int i_9 = i_5 >>> 3; i_9 <= i_7; i_9++) {
                    int i_10 = i_8 << 8 | i_9;
                    for (int i_11 = 0; i_11 < i_2; i_11++) {
                        if (i_10 == regionIds[i_11]) {
                            continue label82;
                        }
                    }
                    regionIds[i_2] = i_10;
                    mapDataArchiveIds[i_2] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, false, i_8, i_9));
                    landscapeDataArchiveIds[i_2] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, false, i_8, i_9));
                    hdWaterMapDataArchiveIds[i_2] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, true, i_8, i_9));
                    hdWaterLandscapeDataArchiveIds[i_2] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, true, i_8, i_9));
                    ++i_2;
                }
            }
        }
        xteas = NativeLibraryLoader.CUTSCENE_MAP_XTEAS;
        NativeLibraryLoader.CUTSCENE_MAP_XTEAS = null;
        method4458(sizeX >> 4, sizeY >> 4, 18, false);
    }

    public void loadMapScene(Class335 class335_1) {
        mapType = class335_1.aClass256_3915;
        if (mapType == Class256.LOAD_MAP_SCENE_BACKGROUND) {
            loadMapSceneBackground();
        } else if (mapType == Class256.LOAD_MAP_SCENE_NORMAL) {
            loadMapSceneNormal(class335_1.buffer);
        } else if (mapType == Class256.aClass256_3153) {
            method4498();
        } else if (mapType.allowDynamicMapScene()) {
            loadMapSceneDynamic(class335_1.buffer);
        }
    }

    public byte[][] method4507(int i_1) {
        return aClass329_Sub1_3167 != null && aClass329_Sub1_3167.aByteArrayArrayArray3788 != null && aClass329_Sub1_3167.aByteArrayArrayArray3788[i_1] != null ? aClass329_Sub1_3167.aByteArrayArrayArray3788[i_1] : null;
    }

    public CoordGrid getBase() {
        return coordGrid;
    }

    public int method4522() {
        return zFar;
    }

    public StaticElements method4528() {
        return mapStaticElements;
    }

    public byte[][][] method4532() {
        return aByteArrayArrayArray3162;
    }

    public int method4538() {
        return 100 - anInt3191 * 100 / anInt3192;
    }

    public int method4544() {
        return anInt3177;
    }

    public void method4547() {
        if (aBool3171) {
            method4445();
            Class122.method2111(true);
            MapRegion mapregion_2 = IndexLoaders.MAP_REGION_DECODER;
            regionIds = mapregion_2.regionIds;
            mapDataArchiveIds = mapregion_2.mapDataArchiveIds;
            landscapeDataArchiveIds = mapregion_2.landscapeDataArchiveIds;
            npcSpawnArchiveIds = mapregion_2.npcSpawnArchiveIds;
            hdWaterMapDataArchiveIds = mapregion_2.hdWaterMapDataArchiveIds;
            hdWaterLandscapeDataArchiveIds = mapregion_2.hdWaterLandscapeDataArchiveIds;
            xteas = mapregion_2.xteas;
            mapDataBuffer = mapregion_2.mapDataBuffer;
            landscapeDataBuffer = mapregion_2.landscapeDataBuffer;
            npcSpawnBuffer = mapregion_2.npcSpawnBuffer;
            hdWaterMapDataBuffer = mapregion_2.hdWaterMapDataBuffer;
            hdWaterLandscapeDataBuffer = mapregion_2.hdWaterLandscapeDataBuffer;
            clipMaps = mapregion_2.clipMaps;
            renderFlagMap = mapregion_2.renderFlagMap;
            aClass239_3175 = mapregion_2.aClass239_3175;
            chunkFlags = mapregion_2.chunkFlags;
            anInt3177 = mapregion_2.anInt3177;
            zFar = mapregion_2.zFar;
            aCacheableNode_Sub6_3176 = mapregion_2.aCacheableNode_Sub6_3176;
            mapStaticElements = mapregion_2.mapStaticElements;
            anIntArrayArray3185 = mapregion_2.anIntArrayArray3185;
            anIntArrayArray3186 = mapregion_2.anIntArrayArray3186;
            aByteArrayArrayArray3162 = mapregion_2.aByteArrayArrayArray3162;
            mapType = mapregion_2.mapType;
            aClass106_3165 = mapregion_2.aClass106_3165;
            coordGrid = mapregion_2.coordGrid;
            aClass219_3169 = mapregion_2.aClass219_3169;
            anInt3170 = mapregion_2.anInt3170;
            anInt3207 = mapregion_2.anInt3207;
            sizeX = mapregion_2.sizeX;
            sizeY = mapregion_2.sizeY;
        } else if (client.GAME_STATE == 5) {
            GameState.setGameState(11);
        } else if (client.GAME_STATE == 0) {
            GameState.setGameState(2);
        } else if (client.GAME_STATE == 7) {
            GameState.setGameState(6);
        } else if (client.GAME_STATE == 13) {
            GameState.setGameState(18);
        } else if (client.GAME_STATE == 3) {
            GameState.setGameState(9);
        }
    }

    public ClipFlagMap getClipMap(int i_1) {
        return clipMaps[i_1];
    }
}
