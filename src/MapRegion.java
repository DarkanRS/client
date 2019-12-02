import java.util.Iterator;

public class MapRegion {

	public long aLong3183;
	boolean aBool3171;
	Class256 aClass256_3164;
	WorldTile aClass219_3169 = new WorldTile();
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
	ObjectIndexLoader objectDefsLoader;
	SceneObjectManager sceneObjectManager;
	Class339 aClass339_3188;
	int missingMapCount = 0;
	int anInt3190 = 1;
	int anInt3191 = 0;
	int anInt3192 = 1;
	Class239 aClass239_3175;
	int anInt3177;
	int zFar;
	int sizeY;
	int sizeX;
	int[][][] chunkFlags;
	int[][] anIntArrayArray3185;
	int[][] anIntArrayArray3186;
	RegionMap aClass311_3202;
	MapSize aClass106_3165;
	int anInt3170;
	int anInt3207;
	WorldTile coordGrid = new WorldTile();
	CacheableNode_Sub6 aCacheableNode_Sub6_3176;
	Class283 aClass283_3180;
	Class329_Sub1 highDetailWaterPlane;
	Class329_Sub1 aClass329_Sub1_3167;
	Class341 aClass341_3181 = new Class341();
	float aFloat3173;
	public boolean aBool3206 = false;
	ClipMap[] clipMaps = new ClipMap[4];

	void method4418(MapRegion mapregion_1) {
		boolean bool_3 = mapregion_1.aBool3171;
		mapregion_1.aBool3171 = this.aBool3171;
		this.aBool3171 = bool_3;
		Class256 class256_4 = mapregion_1.aClass256_3164;
		mapregion_1.aClass256_3164 = this.aClass256_3164;
		this.aClass256_3164 = class256_4;
		mapregion_1.aClass219_3169 = this.coordGrid;
		this.aClass219_3169 = mapregion_1.coordGrid;
		this.aClass239_3175.method4039(mapregion_1.method4435());
	}

	public Class256 method4419() {
		return this.mapType;
	}

	public Class339 method4420() {
		return this.aClass339_3188;
	}

	public int method4421() {
		return 100 - this.missingMapCount * 100 / this.anInt3190;
	}

	void method4422() {
		this.setMapSizes(Class480.getMapSize(Class393.preferences.aPreference_Sub1_8197.method12615(-765902295), (byte) 100), 375022217);
		int i_2 = this.coordGrid.x;
		int i_3 = this.coordGrid.y;
		int mapBaseX = (IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX >> 12) + (i_2 >> 3);
		int mapBaseY = (Class246.CAM_MOVE_ABSOLUTEY >> 12) + (i_3 >> 3);
		VertexNormal.MY_PLAYER.plane = 0;
		Class4.MY_PLAYER_PLANE = 0;
		VertexNormal.MY_PLAYER.move(8, 8);
		byte regionSize = 18;
		this.xteas = new int[regionSize][4];
		this.regionIds = new int[regionSize];
		this.mapDataArchiveIds = new int[regionSize];
		this.landscapeDataArchiveIds = new int[regionSize];
		this.npcSpawnArchiveIds = new int[regionSize];
		this.mapDataBuffer = new byte[regionSize][];
		this.landscapeDataBuffer = new byte[regionSize][];
		this.npcSpawnBuffer = new byte[regionSize][];
		this.hdWaterMapDataArchiveIds = new int[regionSize];
		this.hdWaterLandscapeDataArchiveIds = new int[regionSize];
		this.hdWaterMapDataBuffer = new byte[regionSize][];
		this.hdWaterLandscapeDataBuffer = new byte[regionSize][];
		int i = 0;
		for (int regionX = (mapBaseX - (this.sizeX >> 4)) / 8; regionX <= (mapBaseX + (this.sizeX >> 4)) / 8; regionX++) {
			for (int regionY = (mapBaseY - (this.sizeY >> 4)) / 8; regionY <= (mapBaseY + (this.sizeY >> 4)) / 8; regionY++) {
				int regionId = regionY + (regionX << 8);
				this.regionIds[i] = regionId;
				this.mapDataArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(true, false, regionX, regionY));
				this.landscapeDataArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(false, false, regionX, regionY));
				this.npcSpawnArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId("n" + regionX + '_' + regionY);
				this.hdWaterMapDataArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(true, true, regionX, regionY));
				this.hdWaterLandscapeDataArchiveIds[i] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(false, true, regionX, regionY));
				if (this.npcSpawnArchiveIds[i] == -1) {
					this.mapDataArchiveIds[i] = -1;
					this.landscapeDataArchiveIds[i] = -1;
					this.hdWaterMapDataArchiveIds[i] = -1;
					this.hdWaterLandscapeDataArchiveIds[i] = -1;
				}
				++i;
			}
		}
		for (int regionId = i; regionId < this.npcSpawnArchiveIds.length; regionId++) {
			this.npcSpawnArchiveIds[regionId] = -1;
			this.mapDataArchiveIds[regionId] = -1;
			this.landscapeDataArchiveIds[regionId] = -1;
			this.hdWaterMapDataArchiveIds[regionId] = -1;
			this.hdWaterLandscapeDataArchiveIds[regionId] = -1;
		}
		byte b_11;
		if (client.gameState == 5) {
			b_11 = 11;
		} else if (client.gameState == 7) {
			b_11 = 6;
		} else if (client.gameState == 0) {
			b_11 = 2;
		} else {
			if (client.gameState != 3) {
				throw new RuntimeException("" + client.gameState);
			}
			b_11 = 9;
		}
		this.method4458(mapBaseX, mapBaseY, b_11, false);
	}

	public int getSizeX() {
		return this.sizeX;
	}

	public Class341 method4426(int i_1) {
		return this.aClass341_3181;
	}

	public float method4428(int i_1) {
		return this.aFloat3173;
	}

	public SceneObjectManager getSceneObjectManager() {
		return this.sceneObjectManager;
	}

	void method4432(Class329_Sub1 class329_sub1_1, byte[][] bytes_2, int i_3) {
		for (int i_4 = 0; i_4 < class329_sub1_1.anInt3845; i_4++) {
			if (!this.aBool3171) {
				Node_Sub20_Sub24.method15391(132958805);
			}
			for (int i_5 = 0; i_5 < this.sizeX >> 3; i_5++) {
				for (int i_6 = 0; i_6 < this.sizeY >> 3; i_6++) {
					int i_7 = this.chunkFlags[i_4][i_5][i_6];
					if (i_7 != -1) {
						int i_8 = i_7 >> 24 & 0x3;
						if (!class329_sub1_1.overlayHidden || i_8 == 0) {
							int i_9 = i_7 >> 1 & 0x3;
							int i_10 = i_7 >> 14 & 0x3ff;
							int i_11 = i_7 >> 3 & 0x7ff;
							int i_12 = (i_10 / 8 << 8) + i_11 / 8;
							for (int i_13 = 0; i_13 < this.regionIds.length; i_13++) {
								if (i_12 == this.regionIds[i_13] && bytes_2[i_13] != null) {
									class329_sub1_1.method12462(Renderers.SOFTWARE_RENDERER, bytes_2[i_13], i_4, i_5 * 8, i_6 * 8, i_8, (i_10 & 0x7) * 8, (i_11 & 0x7) * 8, i_9, this.clipMaps);
									break;
								}
							}
						}
					}
					if (this.aBool3171) {
						this.method4462(5, (byte) -21);
					}
				}
			}
		}
	}

	public RegionMap method4433() {
		return this.aClass311_3202;
	}

	public Class239 method4435() {
		return this.aClass239_3175;
	}

	public ObjectIndexLoader method4436() {
		return this.objectDefsLoader;
	}

	public int[][] method4437(byte b_1) {
		return this.anIntArrayArray3185;
	}

	public int[][] method4438(int i_1) {
		return this.anIntArrayArray3186;
	}

	void method4439(RsBitsBuffer rsbitsbuffer_1) {
		int forceRefresh = rsbitsbuffer_1.readUnsignedByteC();
		boolean bool_4 = (forceRefresh & 0x1) != 0;
		int type = rsbitsbuffer_1.readUnsigned128Byte();
		if (type == 1) {
			this.mapType = Class256.aClass256_3155;
		} else if (type == 2) {
			this.mapType = Class256.aClass256_3156;
		} else if (type == 3) {
			this.mapType = Class256.aClass256_3157;
		} else if (type == 4) {
			this.mapType = Class256.aClass256_3161;
		}
		int mapSize = rsbitsbuffer_1.readUnsignedByte128();
		int regionY = rsbitsbuffer_1.readUnsignedShort128();
		int regionX = rsbitsbuffer_1.readUnsignedShort();
		if (!this.aBool3171) {
			this.method4457(-1079730027);
		}
		this.setMapSizes(Class480.getMapSize(mapSize, (byte) 66), -1665469325);
		rsbitsbuffer_1.initBitAccess((byte) 76);
		for (int regionIdx = 0; regionIdx < 4; regionIdx++) {
			for (int rx = 0; rx < this.sizeX >> 3; rx++) {
				for (int ry = 0; ry < this.sizeY >> 3; ry++) {
					int hasChunkFlags = rsbitsbuffer_1.readBits(1);
					if (hasChunkFlags == 1) {
						this.chunkFlags[regionIdx][rx][ry] = rsbitsbuffer_1.readBits(26);
					} else {
						this.chunkFlags[regionIdx][rx][ry] = -1;
					}
				}
			}
		}
		rsbitsbuffer_1.finishBitAccess((byte) 26);
		int i_9 = (rsbitsbuffer_1.buffer.length - rsbitsbuffer_1.index) / 16;
		this.xteas = new int[i_9][4];
		for (int i_10 = 0; i_10 < i_9; i_10++) {
			for (int i_11 = 0; i_11 < 4; i_11++) {
				this.xteas[i_10][i_11] = rsbitsbuffer_1.readInt();
			}
		}
		this.regionIds = new int[i_9];
		this.mapDataArchiveIds = new int[i_9];
		this.landscapeDataArchiveIds = new int[i_9];
		this.npcSpawnArchiveIds = null;
		this.mapDataBuffer = new byte[i_9][];
		this.landscapeDataBuffer = new byte[i_9][];
		this.npcSpawnBuffer = null;
		this.hdWaterMapDataArchiveIds = new int[i_9];
		this.hdWaterLandscapeDataArchiveIds = new int[i_9];
		this.hdWaterMapDataBuffer = new byte[i_9][];
		this.hdWaterLandscapeDataBuffer = new byte[i_9][];
		i_9 = 0;
		for (int i_10 = 0; i_10 < 4; i_10++) {
			for (int i_11 = 0; i_11 < this.sizeX >> 3; i_11++) {
				for (int i_12 = 0; i_12 < this.sizeY >> 3; i_12++) {
					int i_13 = this.chunkFlags[i_10][i_11][i_12];
					if (i_13 != -1) {
						int i_14 = i_13 >> 14 & 0x3ff;
						int i_15 = i_13 >> 3 & 0x7ff;
						int i_16 = (i_14 / 8 << 8) + i_15 / 8;
						int i_17;
						for (i_17 = 0; i_17 < i_9; i_17++) {
							if (i_16 == this.regionIds[i_17]) {
								i_16 = -1;
								break;
							}
						}
						if (i_16 != -1) {
							this.regionIds[i_9] = i_16;
							i_17 = i_16 >> 8 & 0xff;
							int i_18 = i_16 & 0xff;
							this.mapDataArchiveIds[i_9] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(true, false, i_17, i_18));
							this.landscapeDataArchiveIds[i_9] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(false, false, i_17, i_18));
							this.hdWaterMapDataArchiveIds[i_9] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(true, true, i_17, i_18));
							this.hdWaterLandscapeDataArchiveIds[i_9] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(false, true, i_17, i_18));
							++i_9;
						}
					}
				}
			}
		}
		this.method4458(regionX, regionY, 18, bool_4);
	}

	public void method4440(byte[][][] bytes_1) {
		this.aByteArrayArrayArray3162 = bytes_1;
	}

	public Class329_Sub1 method4441() {
		return this.aClass329_Sub1_3167;
	}

	public void setObjectIndexLoader(ObjectIndexLoader objectindexloader_1) {
		this.objectDefsLoader = objectindexloader_1;
	}

	public void method4444(int i_1) {
		if (this.sceneObjectManager != null) {
			Defaults8Loader.method11156(895822959);
			this.sceneObjectManager.aClass284_2648.method5012();
			this.sceneObjectManager = null;
		}
	}

	public void method4445(byte b_1) {
		this.aClass339_3188 = Class339.aClass339_3984;
		this.missingMapCount = 0;
		this.anInt3190 = 1;
		this.anInt3191 = 0;
		this.anInt3192 = 1;
	}

	public void method4446(byte b_1) {
		this.aClass239_3175 = new Class239(Renderers.SOFTWARE_RENDERER, this.sizeX >> 3, this.sizeY >> 3);
	}

	public void method4447(int i_1) {
		this.anInt3177 = 200;
		this.zFar = (int) (34.46D * (double) this.sizeX);
		this.zFar <<= 2;
		if (Renderers.SOFTWARE_RENDERER.method8454()) {
			this.zFar += 512;
		}
		this.zFar += 3072;
	}

	public int getSizeY() {
		return this.sizeY;
	}

	void method4452(RsBitsBuffer rsbitsbuffer_1) {
		int i_2 = rsbitsbuffer_1.readUnsignedByte();
		int i_3 = rsbitsbuffer_1.readUnsignedShort();
		int i_4 = rsbitsbuffer_1.readUnsignedShort();
		boolean bool_5 = rsbitsbuffer_1.readUnsignedByte() == 1;
		if (!this.aBool3171) {
			this.method4457(1460285779);
		}
		this.setMapSizes(Class480.getMapSize(i_2, (byte) 107), 1375320268);
		int i_6 = (rsbitsbuffer_1.buffer.length - rsbitsbuffer_1.index) / 16;
		this.xteas = new int[i_6][4];
		int i_7;
		int i_8;
		for (i_7 = 0; i_7 < i_6; i_7++) {
			for (i_8 = 0; i_8 < 4; i_8++) {
				this.xteas[i_7][i_8] = rsbitsbuffer_1.readInt();
			}
		}
		this.regionIds = new int[i_6];
		this.mapDataArchiveIds = new int[i_6];
		this.landscapeDataArchiveIds = new int[i_6];
		this.npcSpawnArchiveIds = null;
		this.mapDataBuffer = new byte[i_6][];
		this.landscapeDataBuffer = new byte[i_6][];
		this.npcSpawnBuffer = null;
		this.hdWaterMapDataArchiveIds = new int[i_6];
		this.hdWaterLandscapeDataArchiveIds = new int[i_6];
		this.hdWaterMapDataBuffer = new byte[i_6][];
		this.hdWaterLandscapeDataBuffer = new byte[i_6][];
		i_6 = 0;
		for (i_7 = (i_3 - (this.sizeX >> 4)) / 8; i_7 <= (i_3 + (this.sizeX >> 4)) / 8; i_7++) {
			for (i_8 = (i_4 - (this.sizeY >> 4)) / 8; i_8 <= (i_4 + (this.sizeY >> 4)) / 8; i_8++) {
				this.regionIds[i_6] = i_8 + (i_7 << 8);
				this.mapDataArchiveIds[i_6] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(true, false, i_7, i_8));
				this.landscapeDataArchiveIds[i_6] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(false, false, i_7, i_8));
				this.hdWaterMapDataArchiveIds[i_6] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(true, true, i_7, i_8));
				this.hdWaterLandscapeDataArchiveIds[i_6] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(false, true, i_7, i_8));
				++i_6;
			}
		}
		this.method4458(i_3, i_4, 18, bool_5);
	}

	String getArchiveName(boolean mapData, boolean hdWater, int regionX, int regionY) {
		String name = "";
		if (mapData) {
			name = name + "m" + regionX + '_' + regionY;
		} else {
			name = name + "l" + regionX + '_' + regionY;
		}
		if (hdWater) {
			name = name + 'u';
		}
		return name;
	}

	void setMapSizes(MapSize mapSize, int i_2) {
		if (mapSize != this.aClass106_3165) {
			this.sizeX = this.sizeY = mapSize.size;
			this.chunkFlags = new int[4][this.sizeX >> 3][this.sizeY >> 3];
			this.anIntArrayArray3185 = new int[this.sizeX][this.sizeY];
			this.anIntArrayArray3186 = new int[this.sizeX][this.sizeY];
			for (int i_3 = 0; i_3 < 4; i_3++) {
				this.clipMaps[i_3] = Class403.createClipMap(this.sizeX, this.sizeY);
			}
			this.aByteArrayArrayArray3162 = new byte[4][this.sizeX][this.sizeY];
			this.aClass311_3202 = new RegionMap(this.sizeX, this.sizeY);
			this.method4446((byte) -52);
			this.aClass106_3165 = mapSize;
		}
	}

	void method4457(int i_1) {
		if (this.mapType != Class256.aClass256_3153 && this.aClass256_3164 != Class256.aClass256_3153) {
			if (this.mapType == Class256.aClass256_3155 || this.mapType == Class256.aClass256_3157 || this.aClass256_3164 != this.mapType && (this.mapType == Class256.aClass256_3158 || this.aClass256_3164 == Class256.aClass256_3158)) {
				client.NPC_UPDATE_INDEX = 0;
				client.anInt7210 = 0;
				client.NPCS.method7749(-1318045853);
			}
			this.aClass256_3164 = this.mapType;
		}
	}

	void method4458(int i_1, int i_2, int i_3, boolean bool_4) {
		if (client.anInt7341 == 2) {
			if (this.aBool3171) {
				throw new IllegalStateException();
			}
			client.anInt7341 = 1;
			client.CURRENT_CUTSCENE = -1;
		}
		if (bool_4 || this.anInt3170 != i_1 || i_2 != this.anInt3207) {
			this.anInt3170 = i_1;
			this.anInt3207 = i_2;
			if (!this.aBool3171) {
				Class365.setGameState(i_3);
				Class446.method7447(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE), true, Renderers.SOFTWARE_RENDERER, Class16.aFontRenderer_144, Class16.aClass414_139, (byte) -29);
			}
			if (this.coordGrid != null) {
				this.aClass219_3169 = this.coordGrid;
			} else {
				this.aClass219_3169 = new WorldTile(0, 0, 0);
			}
			this.coordGrid = new WorldTile(0, (this.anInt3170 - (this.sizeX >> 4)) * 8, (this.anInt3207 - (this.sizeY >> 4)) * 8);
			this.aCacheableNode_Sub6_3176 = Class291.method5175(this.coordGrid.x, this.coordGrid.y);
			this.aClass283_3180 = null;
			if (!this.aBool3171) {
				this.method4459(i_3, (byte) 119);
			}
		}
	}

	void method4459(int i_1, byte b_2) {
		int i_3 = this.coordGrid.x - this.aClass219_3169.x;
		int i_4 = this.coordGrid.y - this.aClass219_3169.y;
		int i_5;
		int i_6;
		int i_8;
		int i_16;
		if (i_1 == 18) {
			for (i_5 = 0; i_5 < client.anInt7210; i_5++) {
				StringNode class282_sub47_15 = client.aNode_Sub47Array7209[i_5];
				if (class282_sub47_15 != null) {
					NPC npc_7 = (NPC) class282_sub47_15.anObject8068;
					for (i_8 = 0; i_8 < npc_7.regionBaseX.length; i_8++) {
						npc_7.regionBaseX[i_8] -= i_3;
						npc_7.regionBaseY[i_8] -= i_4;
					}
					Vector3 vector3_20 = Vector3.popVectorStackTo(npc_7.method11166().coords);
					vector3_20.x -= (float) (i_3 * 512);
					vector3_20.z -= (float) (i_4 * 512);
					npc_7.method11171(vector3_20);
					vector3_20.pushVectorStack();
				}
			}
		} else {
			boolean bool_21 = false;
			client.NPC_UPDATE_INDEX = 0;
			i_6 = this.sizeX * 512 - 512;
			i_16 = this.sizeY * 512 - 512;
			for (i_8 = 0; i_8 < client.anInt7210; i_8++) {
				StringNode class282_sub47_9 = client.aNode_Sub47Array7209[i_8];
				if (class282_sub47_9 != null) {
					NPC npc_18 = (NPC) class282_sub47_9.anObject8068;
					Vector3 vector3_19 = Vector3.popVectorStackTo(npc_18.method11166().coords);
					vector3_19.x -= (float) (i_3 * 512);
					vector3_19.z -= (float) (i_4 * 512);
					npc_18.method11171(vector3_19);
					if ((int) vector3_19.x >= 0 && (int) vector3_19.x <= i_6 && (int) vector3_19.z >= 0 && (int) vector3_19.z <= i_16) {
						boolean bool_12 = true;
						for (int i_13 = 0; i_13 < npc_18.regionBaseX.length; i_13++) {
							npc_18.regionBaseX[i_13] -= i_3;
							npc_18.regionBaseY[i_13] -= i_4;
							if (npc_18.regionBaseX[i_13] < 0 || npc_18.regionBaseX[i_13] >= this.sizeX || npc_18.regionBaseY[i_13] < 0 || npc_18.regionBaseY[i_13] >= this.sizeY) {
								bool_12 = false;
							}
						}
						if (bool_12) {
							client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = npc_18.index;
						} else {
							npc_18.setDefinition((NPCDefinitions) null);
							class282_sub47_9.remove();
							bool_21 = true;
						}
					} else {
						npc_18.setDefinition((NPCDefinitions) null);
						class282_sub47_9.remove();
						bool_21 = true;
					}
					vector3_19.pushVectorStack();
				}
			}
			if (bool_21) {
				client.anInt7210 = client.NPCS.size();
				i_8 = 0;
				StringNode class282_sub47_28;
				for (Iterator iterator_24 = client.NPCS.iterator(); iterator_24.hasNext(); client.aNode_Sub47Array7209[i_8++] = class282_sub47_28) {
					class282_sub47_28 = (StringNode) iterator_24.next();
				}
			}
		}
		for (i_5 = 0; i_5 < 2048; i_5++) {
			Player player_25 = client.players[i_5];
			if (player_25 != null) {
				for (i_16 = 0; i_16 < player_25.regionBaseX.length; i_16++) {
					player_25.regionBaseX[i_16] -= i_3;
					player_25.regionBaseY[i_16] -= i_4;
				}
				Vector3 vector3_22 = Vector3.popVectorStackTo(player_25.method11166().coords);
				vector3_22.x -= (float) (i_3 * 512);
				vector3_22.z -= (float) (i_4 * 512);
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
		for (class282_sub31_26 = (Node_Sub31) Node_Sub31.aClass482_7775.head(); class282_sub31_26 != null; class282_sub31_26 = (Node_Sub31) Node_Sub31.aClass482_7775.next(-298997053)) {
			class282_sub31_26.anInt7762 -= i_3;
			class282_sub31_26.anInt7763 -= i_4;
			if (this.mapType != Class256.aClass256_3161 && (class282_sub31_26.anInt7762 < 0 || class282_sub31_26.anInt7763 < 0 || class282_sub31_26.anInt7762 >= this.sizeX || class282_sub31_26.anInt7763 >= this.sizeY)) {
				class282_sub31_26.remove();
			}
		}
		for (class282_sub31_26 = (Node_Sub31) Node_Sub31.aClass482_7776.head(); class282_sub31_26 != null; class282_sub31_26 = (Node_Sub31) Node_Sub31.aClass482_7776.next(270479135)) {
			class282_sub31_26.anInt7762 -= i_3;
			class282_sub31_26.anInt7763 -= i_4;
			if (this.mapType != Class256.aClass256_3161 && (class282_sub31_26.anInt7762 < 0 || class282_sub31_26.anInt7763 < 0 || class282_sub31_26.anInt7762 >= this.sizeX || class282_sub31_26.anInt7763 >= this.sizeY)) {
				class282_sub31_26.remove();
			}
		}
		for (Node_Sub29 class282_sub29_27 = (Node_Sub29) client.aClass465_7414.method7750(-1570433820); class282_sub29_27 != null; class282_sub29_27 = (Node_Sub29) client.aClass465_7414.method7751((byte) 4)) {
			i_16 = (int) (class282_sub29_27.data >> 28 & 0x3L);
			i_8 = (int) (class282_sub29_27.data & 0x3fffL);
			int i_17 = i_8 - this.coordGrid.x;
			int i_10 = (int) (class282_sub29_27.data >> 14 & 0x3fffL);
			int i_11 = i_10 - this.coordGrid.y;
			if (this.sceneObjectManager != null) {
				if (i_17 >= 0 && i_11 >= 0 && i_17 < this.sizeX && i_11 < this.sizeY && i_17 < this.sceneObjectManager.sizeX && i_11 < this.sceneObjectManager.sizeY) {
					if (this.sceneObjectManager.aClass293ArrayArrayArray2604 != null) {
						this.sceneObjectManager.method3405(i_16, i_17, i_11, -1311217260);
					}
				} else if (this.mapType != Class256.aClass256_3161) {
					class282_sub29_27.remove();
				}
			}
		}
		if (Class187.anInt2361 != 0) {
			Class187.anInt2361 -= i_3;
			Class187.anInt2359 -= i_4;
		}
		Class16.method566(1954373372);
		ClipMap.method6008(false);
		if (i_1 == 18) {
			client.anInt7262 -= i_3 * 512;
			client.anInt7376 -= i_4 * 512;
			Class11.anInt122 -= i_3 * 512;
			Class266.anInt3289 -= i_4 * 512;
			if (NativeLibraryLoader.anInt3240 != 4) {
				NativeLibraryLoader.anInt3240 = 2;
				Class86.anInt833 = -1;
				PingRequester.anInt5864 = -1;
			}
		} else {
			Class296.CAM_MOVE_LOCALX -= i_3;
			IFSubNode.CAM_MOVE_LOCALY -= i_4;
			PlaySynthCutsceneAction.anInt9368 -= i_3;
			OutgoingLoginPacket.anInt4280 -= i_4;
			IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX -= i_3 * 512;
			Class246.CAM_MOVE_ABSOLUTEY -= i_4 * 512;
			if (Math.abs(i_3) > this.sizeX || Math.abs(i_4) > this.sizeY) {
				this.aClass239_3175.method4048();
			}
		}
		Class350.method6189((byte) 120);
		QuickchatFiller.method1139(-1725445379);
		client.aClass465_7334.method7749(189639583);
		client.PROJECTILES.removeAll();
		client.aClass457_7335.method7651();
		NewsItemFetcher.method795();
	}

	void method4460() {
		this.highDetailWaterPlane = null;
		this.aClass329_Sub1_3167 = null;
		for (int i_2 = 0; i_2 < 4; i_2++) {
			if (this.clipMaps[i_2] != null) {
				this.clipMaps[i_2].initEmpty();
			}
		}
		if (this.aClass311_3202 != null) {
			this.aClass311_3202.reset();
		}
		if (this.aClass239_3175 != null) {
			this.aClass239_3175.method4044();
		}
		if (this.sceneObjectManager != null) {
			this.sceneObjectManager.aClass284_2648.method5012();
			this.sceneObjectManager = null;
		}
	}

	public boolean method4461(byte b_1) {
		if (!this.aBool3171) {
			Exception_Sub3.method15619(false, 2049702399);
		}
		this.missingMapCount = 0;
		int i_2;
		for (i_2 = 0; i_2 < this.mapDataBuffer.length; i_2++) {
			if (this.mapDataArchiveIds[i_2] != -1 && this.mapDataBuffer[i_2] == null) {
				this.mapDataBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(this.mapDataArchiveIds[i_2], 0);
				if (this.mapDataBuffer[i_2] == null) {
					++this.missingMapCount;
				}
			}
			if (this.landscapeDataArchiveIds[i_2] != -1 && this.landscapeDataBuffer[i_2] == null) {
				this.landscapeDataBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(this.landscapeDataArchiveIds[i_2], 0, this.xteas[i_2]);
				if (this.landscapeDataBuffer[i_2] == null) {
					++this.missingMapCount;
				}
			}
			if (this.hdWaterMapDataArchiveIds[i_2] != -1 && this.hdWaterMapDataBuffer[i_2] == null) {
				this.hdWaterMapDataBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(this.hdWaterMapDataArchiveIds[i_2], 0);
				if (this.hdWaterMapDataBuffer[i_2] == null) {
					++this.missingMapCount;
				}
			}
			if (this.hdWaterLandscapeDataArchiveIds[i_2] != -1 && this.hdWaterLandscapeDataBuffer[i_2] == null) {
				this.hdWaterLandscapeDataBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(this.hdWaterLandscapeDataArchiveIds[i_2], 0);
				if (this.hdWaterLandscapeDataBuffer[i_2] == null) {
					++this.missingMapCount;
				}
			}
			if (this.npcSpawnArchiveIds != null && this.npcSpawnBuffer[i_2] == null && this.npcSpawnArchiveIds[i_2] != -1) {
				this.npcSpawnBuffer[i_2] = IndexLoaders.MAP_INDEX.getFile(this.npcSpawnArchiveIds[i_2], 0, this.xteas[i_2]);
				if (this.npcSpawnBuffer[i_2] == null) {
					++this.missingMapCount;
				}
			}
		}
		if (this.aClass283_3180 == null) {
			if (this.aCacheableNode_Sub6_3176 != null && IndexLoaders.WORLD_MAP_INDEX.validFile(this.aCacheableNode_Sub6_3176.aString9533 + "_staticelements")) {
				if (!IndexLoaders.WORLD_MAP_INDEX.method5629(this.aCacheableNode_Sub6_3176.aString9533 + "_staticelements")) {
					++this.missingMapCount;
				} else {
					this.aClass283_3180 = Class301.method5331(IndexLoaders.WORLD_MAP_INDEX, this.aCacheableNode_Sub6_3176.aString9533 + "_staticelements", client.membersWorld);
				}
			} else {
				this.aClass283_3180 = new Class283(0);
			}
		}
		if (this.missingMapCount > 0) {
			if (this.anInt3190 < this.missingMapCount) {
				this.anInt3190 = this.missingMapCount;
			}
			this.aClass339_3188 = Class339.aClass339_3985;
			return false;
		} else {
			this.anInt3191 = 0;
			int i_5;
			int i_6;
			for (i_2 = 0; i_2 < this.mapDataBuffer.length; i_2++) {
				byte[] bytes_3 = this.landscapeDataBuffer[i_2];
				int i_4;
				if (bytes_3 != null) {
					i_4 = (this.regionIds[i_2] >> 8) * 64 - this.coordGrid.x;
					i_5 = (this.regionIds[i_2] & 0xff) * 64 - this.coordGrid.y;
					if (this.mapType.method4410((byte) 64)) {
						i_4 = 10;
						i_5 = 10;
					}
					i_6 = RegionMap.decodeLandscapeData(this.objectDefsLoader, bytes_3, i_4, i_5, this.sizeX, this.sizeY);
					if (i_6 > 0) {
						this.anInt3191 += i_6;
					}
				}
				bytes_3 = this.hdWaterLandscapeDataBuffer[i_2];
				if (bytes_3 != null) {
					i_4 = (this.regionIds[i_2] >> 8) * 64 - this.coordGrid.x;
					i_5 = (this.regionIds[i_2] & 0xff) * 64 - this.coordGrid.y;
					if (this.mapType.method4410((byte) 9)) {
						i_4 = 10;
						i_5 = 10;
					}
					i_6 = RegionMap.decodeLandscapeData(this.objectDefsLoader, bytes_3, i_4, i_5, this.sizeX, this.sizeY);
					if (i_6 > 0) {
						this.anInt3191 += i_6;
					}
				}
			}
			if (this.anInt3191 > 0) {
				if (this.anInt3192 < this.anInt3191) {
					this.anInt3192 = this.anInt3191;
				}
				this.aClass339_3188 = Class339.aClass339_3983;
				return false;
			} else {
				if (!this.aBool3171 && this.aClass339_3188 != Class339.aClass339_3984) {
					Class446.method7447(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE) + "<br>" + "(100%)", true, Renderers.SOFTWARE_RENDERER, Class16.aFontRenderer_144, Class16.aClass414_139, (byte) -26);
				}
				this.aClass339_3188 = Class339.aClass339_3982;
				if (!this.aBool3171) {
					Node_Sub20_Sub24.method15391(67917795);
				}
				if (!this.aBool3171) {
					for (i_2 = 0; i_2 < 2048; i_2++) {
						Player player_18 = client.players[i_2];
						if (player_18 != null) {
							player_18.aClass206_7970 = null;
						}
					}
					for (i_2 = 0; i_2 < client.aNode_Sub47Array7209.length; i_2++) {
						StringNode class282_sub47_19 = client.aNode_Sub47Array7209[i_2];
						if (class282_sub47_19 != null) {
							((Transform_Sub1) class282_sub47_19.anObject8068).aClass206_7970 = null;
						}
					}
				}
				if (!this.aBool3171) {
					Class356.method6227(true, (byte) -87);
				}
				if (!this.aBool3171) {
					Class247.method4250((byte) -72);
				}
				boolean highDetailWater = false;
				int chunkSize;
				if (Class393.preferences.water.getValue() == 2) {
					for (chunkSize = 0; chunkSize < this.mapDataBuffer.length; chunkSize++) {
						if (this.hdWaterLandscapeDataBuffer[chunkSize] != null || this.hdWaterMapDataBuffer[chunkSize] != null) {
							highDetailWater = true;
							break;
						}
					}
				}
				chunkSize = Class5.method295(Class393.preferences.aPreference_Sub16_8198.method12750()).chunkSize * 8;
				if (Renderers.SOFTWARE_RENDERER.method8454()) {
					++chunkSize;
				}
				this.method4447(1045268791);
				this.method4460();
				this.sceneObjectManager = new SceneObjectManager(Renderers.SOFTWARE_RENDERER, this.sizeX, this.sizeY, chunkSize, highDetailWater, Renderers.SOFTWARE_RENDERER.method8463() > 0);
				this.sceneObjectManager.method3380(false);
				this.sceneObjectManager.method3378(client.anInt7240);
				if (client.anInt7240 != 0) {
					this.sceneObjectManager.method3379(Renderers.FONT_RENDERER, (byte) -68);
				} else {
					this.sceneObjectManager.method3379((FontRenderer) null, (byte) -47);
				}
				this.aClass341_3181 = new Class341();
				this.aFloat3173 = -0.05F + (float) (Math.random() / 10.0D);
				this.aClass329_Sub1_3167 = new Class329_Sub1(this.sceneObjectManager, this.objectDefsLoader, 4, this.sizeX, this.sizeY, false, this.aClass311_3202, this.aClass239_3175);
				this.aClass329_Sub1_3167.method5835(1920682092);
				this.aClass329_Sub1_3167.anInt3809 = Class393.preferences.sceneryShadows.method12624((byte) -19);
				this.aClass329_Sub1_3167.highDetailWater = Class393.preferences.water.getValue() == 2;
				this.aClass329_Sub1_3167.aBool3780 = Class393.preferences.lightDetail.method12786() == 1;
				this.aClass329_Sub1_3167.aBool3820 = Class393.preferences.aPreference_Sub17_8200.method12762(-267054469) == 1;
				this.aClass329_Sub1_3167.aBool3782 = Class393.preferences.textures.method12873(1377050121) == 1;
				if (!this.mapType.method4410((byte) -32)) {
					this.decodeUnderlayMasks(this.aClass329_Sub1_3167, this.mapDataBuffer, 1315892185);
				} else {
					this.method4464(this.aClass329_Sub1_3167, this.mapDataBuffer, 1987015126);
				}
				if (this.aBool3171) {
					this.method4462(50, (byte) -7);
				}
				this.aClass239_3175.method4045(this.sizeX >> 4, this.sizeY >> 4);
				this.aClass239_3175.method4037(this, (byte) 122);
				if (highDetailWater) {
					this.sceneObjectManager.method3380(true);
					this.highDetailWaterPlane = new Class329_Sub1(this.sceneObjectManager, this.objectDefsLoader, 1, this.sizeX, this.sizeY, true, this.aClass311_3202, this.aClass239_3175);
					this.highDetailWaterPlane.method5835(1973869970);
					this.highDetailWaterPlane.anInt3809 = Class393.preferences.sceneryShadows.method12624((byte) -93);
					this.highDetailWaterPlane.highDetailWater = Class393.preferences.water.getValue() == 2;
					this.highDetailWaterPlane.aBool3780 = Class393.preferences.lightDetail.method12786() == 1;
					this.highDetailWaterPlane.aBool3820 = Class393.preferences.aPreference_Sub17_8200.method12762(1666715266) == 1;
					this.highDetailWaterPlane.aBool3782 = Class393.preferences.textures.method12873(-332126301) == 1;
					if (!this.mapType.method4410((byte) 46)) {
						this.decodeUnderlayMasks(this.highDetailWaterPlane, this.hdWaterMapDataBuffer, 500096938);
						if (!this.aBool3171) {
							Exception_Sub3.method15619(true, -1068785077);
						}
					} else {
						this.method4464(this.highDetailWaterPlane, this.hdWaterMapDataBuffer, 1544003060);
						if (!this.aBool3171) {
							Exception_Sub3.method15619(true, -466489103);
						}
					}
					this.highDetailWaterPlane.method5853(this.aClass329_Sub1_3167.tileHeights[0]);
					this.highDetailWaterPlane.initClipMap(Renderers.SOFTWARE_RENDERER, (int[][][]) null, (ClipMap[]) null, (byte) 11);
					this.sceneObjectManager.method3380(false);
					if (this.aBool3171) {
						this.method4462(50, (byte) -1);
					}
				}
				this.aClass329_Sub1_3167.initClipMap(Renderers.SOFTWARE_RENDERER, highDetailWater ? this.highDetailWaterPlane.tileHeights : null, this.clipMaps, (byte) 44);
				if (!this.mapType.method4410((byte) -39)) {
					if (!this.aBool3171) {
						Exception_Sub3.method15619(true, -1924347583);
					}
					this.method4465(this.aClass329_Sub1_3167, this.landscapeDataBuffer);
					if (this.npcSpawnBuffer != null) {
						this.decodeNPCSpawns();
					}
				} else {
					if (!this.aBool3171) {
						Exception_Sub3.method15619(true, -152609388);
					}
					this.method4432(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -389537380);
				}
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, -665945100);
				}
				this.aClass329_Sub1_3167.method5837(Renderers.SOFTWARE_RENDERER, highDetailWater ? this.sceneObjectManager.aGroundArray2614[0] : null, (Ground) null, 111695504);
				if (this.aBool3171) {
					this.method4462(75, (byte) -2);
				}
				this.aClass329_Sub1_3167.method12463(Renderers.SOFTWARE_RENDERER, false, -770561854);
				if (this.aBool3171) {
					this.method4462(75, (byte) -37);
				}
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, 2049102512);
				}
				if (highDetailWater) {
					this.sceneObjectManager.method3380(true);
					if (!this.aBool3171) {
						Exception_Sub3.method15619(true, 1689569657);
					}
					if (!this.mapType.method4410((byte) -69)) {
						this.method4465(this.highDetailWaterPlane, this.hdWaterLandscapeDataBuffer);
					} else {
						this.method4432(this.highDetailWaterPlane, this.hdWaterLandscapeDataBuffer, 346534701);
					}
					if (!this.aBool3171) {
						Exception_Sub3.method15619(true, -1264882543);
					}
					this.highDetailWaterPlane.method5837(Renderers.SOFTWARE_RENDERER, (Ground) null, this.sceneObjectManager.aGroundArray2607[0], -1009930272);
					this.highDetailWaterPlane.method12463(Renderers.SOFTWARE_RENDERER, true, 454950063);
					if (!this.aBool3171) {
						Exception_Sub3.method15619(true, 163262675);
					}
					this.sceneObjectManager.method3380(false);
					if (this.aBool3171) {
						this.method4462(50, (byte) -74);
					}
				}
				this.aClass329_Sub1_3167.method5891((short) -9701);
				if (this.highDetailWaterPlane != null) {
					this.highDetailWaterPlane.method5891((short) -22349);
				}
				this.sceneObjectManager.method3428();
				if (this.aBool3171) {
					Utils.time();
					while (!Renderers.SOFTWARE_RENDERER.method8455(-203069693)) {
						this.method4462(1, (byte) -98);
					}
				}
				boolean bool_21 = false;
				if (this.aBool3171) {
					MapRegion mapregion_12 = IndexLoaders.MAP_REGION_DECODER;
					this.method4418(mapregion_12);
					IndexLoaders.MAP_REGION_LOADER_THREAD.method6050(mapregion_12);
					bool_21 = true;
					Utils.time();
					Object object_13 = client.anObject7227;
					synchronized (client.anObject7227) {
						client.aBool7225 = true;
						try {
							client.anObject7227.wait();
						} catch (InterruptedException interruptedexception_16) {
							;
						}
					}
					IndexLoaders.MAP_REGION_DECODER = this;
					mapregion_12.method4460();
					this.method4459(18, (byte) 106);
					this.method4457(-974464846);
				} else {
					Node_Sub20_Sub24.method15391(1595654016);
					this.aClass239_3175.method4075(-1340857896);
					Node_Sub15_Sub1.method14840((byte) -73);
				}
				int i_14;
				for (i_5 = 0; i_5 < 4; i_5++) {
					for (i_6 = 0; i_6 < this.sizeX; i_6++) {
						for (i_14 = 0; i_14 < this.sizeY; i_14++) {
							Class434_Sub1.method12760(i_5, i_6, i_14);
						}
					}
				}
				for (i_5 = 0; i_5 < client.HINT_TRAILS.length; i_5++) {
					if (client.HINT_TRAILS[i_5] != null) {
						client.HINT_TRAILS[i_5].method4978(this.sceneObjectManager);
					}
				}
				ClanVarDefinitions.method6823();
				Class48_Sub2.method14571();
				TCPPacket tcpmessage_22;
				if (NamedFileReference.method867(-1009865629) == Class279.aClass279_3368 && client.GAME_CONNECTION_CONTEXT.getConnection() != null && client.gameState == 18) {
					tcpmessage_22 = Class271.createPacket(ClientPacket.UNK_82, client.GAME_CONNECTION_CONTEXT.isaac);
					tcpmessage_22.buffer.writeInt(1057001181);
					client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_22);
				}
				if (!this.mapType.method4410((byte) 29)) {
					i_5 = (this.anInt3170 - (this.sizeX >> 4)) / 8;
					i_6 = (this.anInt3170 + (this.sizeX >> 4)) / 8;
					i_14 = (this.anInt3207 - (this.sizeY >> 4)) / 8;
					int i_8 = (this.anInt3207 + (this.sizeY >> 4)) / 8;
					for (int i_9 = i_5 - 1; i_9 <= i_6 + 1; i_9++) {
						for (int i_10 = i_14 - 1; i_10 <= i_8 + 1; i_10++) {
							if (i_9 < i_5 || i_9 > i_6 || i_10 < i_14 || i_10 > i_8) {
								IndexLoaders.MAP_INDEX.method5630(this.getArchiveName(true, false, i_9, i_10), -1674080210);
								IndexLoaders.MAP_INDEX.method5630(this.getArchiveName(false, false, i_9, i_10), 1691833527);
								IndexLoaders.MAP_INDEX.method5630(this.getArchiveName(true, true, i_9, i_10), 761921723);
								IndexLoaders.MAP_INDEX.method5630(this.getArchiveName(false, true, i_9, i_10), -994629113);
							}
						}
					}
				}
				if (client.gameState == 11) {
					Class365.setGameState(5);
				} else if (client.gameState == 2) {
					Class365.setGameState(0);
				} else if (client.gameState == 6) {
					Class365.setGameState(7);
				} else if (client.gameState == 9) {
					Class365.setGameState(3);
				} else {
					Class365.setGameState(13);
					if (client.GAME_CONNECTION_CONTEXT.getConnection() != null) {
						tcpmessage_22 = Class271.createPacket(ClientPacket.REGION_LOADED_CONFIRM, client.GAME_CONNECTION_CONTEXT.isaac);
						client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_22);
					}
				}
				ParticleProducerDefinition.method1160(-1437458578);
				if (this.aBool3206) {
					Class209.printConsoleMessage(Long.toString(Utils.time() - this.aLong3183));
					this.aBool3206 = false;
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

	void method4462(int i_1, byte b_2) {
		try {
			Thread.sleep((long) i_1);
		} catch (InterruptedException interruptedexception_4) {
			;
		}
	}

	void decodeUnderlayMasks(Class329_Sub1 class329_sub1_1, byte[][] bytes_2, int i_3) {
		int i_4 = bytes_2.length;
		int i_5;
		for (i_5 = 0; i_5 < i_4; i_5++) {
			byte[] bytes_6 = bytes_2[i_5];
			if (bytes_6 != null) {
				RsByteBuffer rsbytebuffer_7 = new RsByteBuffer(bytes_6);
				int i_8 = this.regionIds[i_5] >> 8;
				int i_9 = this.regionIds[i_5] & 0xff;
				int i_10 = i_8 * 64 - this.coordGrid.x;
				int i_11 = i_9 * 64 - this.coordGrid.y;
				if (!this.aBool3171) {
					Node_Sub20_Sub24.method15391(-1503224937);
				}
				class329_sub1_1.decodeTileMasksUnderlay(rsbytebuffer_7, i_10, i_11, this.coordGrid.x, this.coordGrid.y, this.clipMaps);
				class329_sub1_1.method12471(Renderers.SOFTWARE_RENDERER, rsbytebuffer_7, i_10, i_11);
			}
		}
		for (i_5 = 0; i_5 < i_4; i_5++) {
			int i_12 = (this.regionIds[i_5] >> 8) * 64 - this.coordGrid.x;
			int i_13 = (this.regionIds[i_5] & 0xff) * 64 - this.coordGrid.y;
			byte[] bytes_14 = bytes_2[i_5];
			if (bytes_14 == null && this.anInt3207 < 800) {
				if (!this.aBool3171) {
					Node_Sub20_Sub24.method15391(556095910);
				}
				class329_sub1_1.method5890(i_12, i_13);
			}
		}
	}

	void method4464(Class329_Sub1 class329_sub1_1, byte[][] bytes_2, int i_3) {
		for (int i_4 = 0; i_4 < class329_sub1_1.anInt3845; i_4++) {
			if (!this.aBool3171) {
				Node_Sub20_Sub24.method15391(-84440023);
			}
			for (int x = 0; x < this.sizeX >> 3; x++) {
				for (int y = 0; y < this.sizeY >> 3; y++) {
					int chunkFlag = this.chunkFlags[i_4][x][y];
					if (chunkFlag != -1) {
						int plane = chunkFlag >> 24 & 0x3;
						if (!class329_sub1_1.overlayHidden || plane == 0) {
							int rotation = chunkFlag >> 1 & 0x3;
							int realX = chunkFlag >> 14 & 0x3ff;
							int realY = chunkFlag >> 3 & 0x7ff;
							int i_12 = (realX / 8 << 8) + realY / 8;
							for (int i_13 = 0; i_13 < this.regionIds.length; i_13++) {
								if (i_12 == this.regionIds[i_13] && bytes_2[i_13] != null) {
									RsByteBuffer rsbytebuffer_14 = new RsByteBuffer(bytes_2[i_13]);
									class329_sub1_1.method5841(rsbytebuffer_14, i_4, x * 8, y * 8, plane, realX, realY, rotation, this.clipMaps);
									class329_sub1_1.method12460(Renderers.SOFTWARE_RENDERER, rsbytebuffer_14, i_4, x * 8, y * 8, plane, realX, realY, rotation);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i_4 = 0; i_4 < class329_sub1_1.anInt3845; i_4++) {
			if (!this.aBool3171) {
				Node_Sub20_Sub24.method15391(-1748836752);
			}
			for (int i_5 = 0; i_5 < this.sizeX >> 3; i_5++) {
				for (int i_6 = 0; i_6 < this.sizeY >> 3; i_6++) {
					int i_7 = this.chunkFlags[i_4][i_5][i_6];
					if (i_7 == -1) {
						class329_sub1_1.method5838(i_4, i_5 * 8, i_6 * 8, 8, 8);
					}
				}
			}
		}
	}

	void method4465(Class329_Sub1 class329_sub1_1, byte[][] bytes_2) {
		int i_4 = this.mapDataBuffer.length;
		for (int i_5 = 0; i_5 < i_4; i_5++) {
			byte[] bytes_6 = bytes_2[i_5];
			if (bytes_6 != null) {
				int i_7 = (this.regionIds[i_5] >> 8) * 64 - this.coordGrid.x;
				int i_8 = (this.regionIds[i_5] & 0xff) * 64 - this.coordGrid.y;
				if (!this.aBool3171) {
					Node_Sub20_Sub24.method15391(-233080678);
				}
				class329_sub1_1.method12461(Renderers.SOFTWARE_RENDERER, bytes_6, i_7, i_8, this.clipMaps);
				if (this.aBool3171) {
					this.method4462(10, (byte) -37);
				}
			}
		}
	}

	void decodeNPCSpawns() {
		int i_2 = this.npcSpawnBuffer.length;
		for (int i_3 = 0; i_3 < i_2; i_3++) {
			if (this.npcSpawnBuffer[i_3] != null) {
				int i_4 = -1;
				for (int i_5 = 0; i_5 < client.anInt7234; i_5++) {
					if (client.anIntArray7228[i_5] == this.regionIds[i_3]) {
						i_4 = i_5;
						break;
					}
				}
				if (i_4 == -1) {
					client.anIntArray7228[client.anInt7234] = this.regionIds[i_3];
					i_4 = ++client.anInt7234 - 1;
				}
				RsByteBuffer rsbytebuffer_18 = new RsByteBuffer(this.npcSpawnBuffer[i_3]);
				int i_6 = 0;
				while (rsbytebuffer_18.index < this.npcSpawnBuffer[i_3].length && i_6 < 511 && client.NPC_UPDATE_INDEX < 1023) {
					int i_7 = i_4 | i_6++ << 6;
					int i_8 = rsbytebuffer_18.readUnsignedShort();
					int i_9 = i_8 >> 14;
					int i_10 = i_8 >> 7 & 0x3f;
					int i_11 = i_8 & 0x3f;
					int i_12 = (this.regionIds[i_3] >> 8) * 64 - this.coordGrid.x + i_10;
					int i_13 = (this.regionIds[i_3] & 0xff) * 64 - this.coordGrid.y + i_11;
					NPCDefinitions npcdefinitions_14 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(rsbytebuffer_18.readUnsignedShort());
					StringNode class282_sub47_15 = (StringNode) client.NPCS.get((long) i_7);
					if (class282_sub47_15 == null && (npcdefinitions_14.walkMask & 0x1) > 0 && i_12 >= 0 && i_12 + npcdefinitions_14.size < this.sizeX && i_13 >= 0 && i_13 + npcdefinitions_14.size < this.sizeY) {
						NPC npc_16 = new NPC(this.sceneObjectManager);
						npc_16.index = i_7;
						StringNode class282_sub47_17 = new StringNode(npc_16);
						client.NPCS.put(class282_sub47_17, (long) i_7);
						client.aNode_Sub47Array7209[++client.anInt7210 - 1] = class282_sub47_17;
						client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = i_7;
						npc_16.lastUpdate = client.cycles;
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

	public void method4485(int i_1) {
		this.coordGrid = new WorldTile();
		this.anInt3207 = 0;
		this.anInt3170 = 0;
	}

	void method4498() {
		this.aClass256_3164 = this.mapType;
		this.setMapSizes(MapSize.aClass106_1075, -1398023418);
		int i_2;
		int i_4;
		int i_21;
		for (i_2 = 0; i_2 < 4; i_2++) {
			for (i_21 = 0; i_21 < this.sizeX >> 3; i_21++) {
				for (i_4 = 0; i_4 < this.sizeY >> 3; i_4++) {
					this.chunkFlags[i_2][i_21][i_4] = -1;
				}
			}
		}
		int i_5;
		int i_6;
		int i_7;
		int i_8;
		int i_9;
		int i_10;
		int i_11;
		for (CutsceneArea class282_sub2_20 = (CutsceneArea) Class86.CUTSCENE_AREAS.head(); class282_sub2_20 != null; class282_sub2_20 = (CutsceneArea) Class86.CUTSCENE_AREAS.next(832197045)) {
			i_21 = class282_sub2_20.anInt7486;
			boolean bool_22 = (i_21 & 0x1) == 1;
			i_5 = class282_sub2_20.regionX >> 3;
			i_6 = class282_sub2_20.regionY >> 3;
			i_7 = class282_sub2_20.anInt7480;
			i_8 = class282_sub2_20.anInt7483;
			i_9 = class282_sub2_20.plane;
			i_10 = class282_sub2_20.anInt7481;
			i_11 = class282_sub2_20.width;
			int i_12 = class282_sub2_20.length;
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
						this.chunkFlags[i_10][i_7 + i_13][i_18 + i_8] = (i_19 << 14) + (i_17 << 3) + (i_9 << 24) + (i_21 << 1);
					} else {
						this.chunkFlags[i_10][i_18 + i_7][i_8 + i_13] = (i_19 << 14) + (i_17 << 3) + (i_9 << 24) + (i_21 << 1);
					}
					++i_19;
				}
				++i_17;
			}
		}
		i_2 = NativeLibraryLoader.anIntArrayArray3239.length;
		this.regionIds = new int[i_2];
		this.mapDataArchiveIds = new int[i_2];
		this.landscapeDataArchiveIds = new int[i_2];
		this.npcSpawnArchiveIds = null;
		this.mapDataBuffer = new byte[i_2][];
		this.landscapeDataBuffer = new byte[i_2][];
		this.npcSpawnBuffer = null;
		this.hdWaterMapDataArchiveIds = new int[i_2];
		this.hdWaterLandscapeDataArchiveIds = new int[i_2];
		this.hdWaterMapDataBuffer = new byte[i_2][];
		this.hdWaterLandscapeDataBuffer = new byte[i_2][];
		i_2 = 0;
		for (CutsceneArea class282_sub2_3 = (CutsceneArea) Class86.CUTSCENE_AREAS.head(); class282_sub2_3 != null; class282_sub2_3 = (CutsceneArea) Class86.CUTSCENE_AREAS.next(2076366148)) {
			i_4 = class282_sub2_3.regionX >>> 3;
			i_5 = class282_sub2_3.regionY >>> 3;
			i_6 = i_4 + class282_sub2_3.width;
			if ((i_6 & 0x7) == 0) {
				--i_6;
			}
			i_6 >>>= 3;
			i_7 = i_5 + class282_sub2_3.length;
			if ((i_7 & 0x7) == 0) {
				--i_7;
			}
			i_7 >>>= 3;
			for (i_8 = i_4 >>> 3; i_8 <= i_6; i_8++) {
				label82: for (i_9 = i_5 >>> 3; i_9 <= i_7; i_9++) {
					i_10 = i_8 << 8 | i_9;
					for (i_11 = 0; i_11 < i_2; i_11++) {
						if (i_10 == this.regionIds[i_11]) {
							continue label82;
						}
					}
					this.regionIds[i_2] = i_10;
					this.mapDataArchiveIds[i_2] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(true, false, i_8, i_9));
					this.landscapeDataArchiveIds[i_2] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(false, false, i_8, i_9));
					this.hdWaterMapDataArchiveIds[i_2] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(true, true, i_8, i_9));
					this.hdWaterLandscapeDataArchiveIds[i_2] = IndexLoaders.MAP_INDEX.getArchiveId(this.getArchiveName(false, true, i_8, i_9));
					++i_2;
				}
			}
		}
		this.xteas = NativeLibraryLoader.anIntArrayArray3239;
		NativeLibraryLoader.anIntArrayArray3239 = null;
		this.method4458(this.sizeX >> 4, this.sizeY >> 4, 18, false);
	}

	public void method4499(Class335 class335_1, int i_2) {
		this.mapType = class335_1.aClass256_3915;
		if (this.mapType == Class256.aClass256_3154) {
			this.method4422();
		} else if (this.mapType == Class256.aClass256_3158) {
			this.method4452(class335_1.buffer);
		} else if (this.mapType == Class256.aClass256_3153) {
			this.method4498();
		} else if (this.mapType.method4410((byte) -13)) {
			this.method4439(class335_1.buffer);
		}
	}

	public byte[][] method4507(int i_1) {
		return this.aClass329_Sub1_3167 != null && this.aClass329_Sub1_3167.aByteArrayArrayArray3788 != null && this.aClass329_Sub1_3167.aByteArrayArrayArray3788[i_1] != null ? this.aClass329_Sub1_3167.aByteArrayArrayArray3788[i_1] : null;
	}

	public WorldTile getBase() {
		return this.coordGrid;
	}

	public int method4522(int i_1) {
		return this.zFar;
	}

	public MapRegion(boolean bool_1) {
		this.aBool3171 = bool_1;
	}

	public Class283 method4528(byte b_1) {
		return this.aClass283_3180;
	}

	public byte[][][] method4532() {
		return this.aByteArrayArrayArray3162;
	}

	public int method4538() {
		return 100 - this.anInt3191 * 100 / this.anInt3192;
	}

	public int method4544(int i_1) {
		return this.anInt3177;
	}

	public void method4547(byte b_1) {
		if (this.aBool3171) {
			this.method4445((byte) -48);
			Class122.method2111(true);
			MapRegion mapregion_2 = IndexLoaders.MAP_REGION_DECODER;
			this.regionIds = mapregion_2.regionIds;
			this.mapDataArchiveIds = mapregion_2.mapDataArchiveIds;
			this.landscapeDataArchiveIds = mapregion_2.landscapeDataArchiveIds;
			this.npcSpawnArchiveIds = mapregion_2.npcSpawnArchiveIds;
			this.hdWaterMapDataArchiveIds = mapregion_2.hdWaterMapDataArchiveIds;
			this.hdWaterLandscapeDataArchiveIds = mapregion_2.hdWaterLandscapeDataArchiveIds;
			this.xteas = mapregion_2.xteas;
			this.mapDataBuffer = mapregion_2.mapDataBuffer;
			this.landscapeDataBuffer = mapregion_2.landscapeDataBuffer;
			this.npcSpawnBuffer = mapregion_2.npcSpawnBuffer;
			this.hdWaterMapDataBuffer = mapregion_2.hdWaterMapDataBuffer;
			this.hdWaterLandscapeDataBuffer = mapregion_2.hdWaterLandscapeDataBuffer;
			this.clipMaps = mapregion_2.clipMaps;
			this.aClass311_3202 = mapregion_2.aClass311_3202;
			this.aClass239_3175 = mapregion_2.aClass239_3175;
			this.chunkFlags = mapregion_2.chunkFlags;
			this.anInt3177 = mapregion_2.anInt3177;
			this.zFar = mapregion_2.zFar;
			this.aCacheableNode_Sub6_3176 = mapregion_2.aCacheableNode_Sub6_3176;
			this.aClass283_3180 = mapregion_2.aClass283_3180;
			this.anIntArrayArray3185 = mapregion_2.anIntArrayArray3185;
			this.anIntArrayArray3186 = mapregion_2.anIntArrayArray3186;
			this.aByteArrayArrayArray3162 = mapregion_2.aByteArrayArrayArray3162;
			this.mapType = mapregion_2.mapType;
			this.aClass106_3165 = mapregion_2.aClass106_3165;
			this.coordGrid = mapregion_2.coordGrid;
			this.aClass219_3169 = mapregion_2.aClass219_3169;
			this.anInt3170 = mapregion_2.anInt3170;
			this.anInt3207 = mapregion_2.anInt3207;
			this.sizeX = mapregion_2.sizeX;
			this.sizeY = mapregion_2.sizeY;
		} else if (client.gameState == 5) {
			Class365.setGameState(11);
		} else if (client.gameState == 0) {
			Class365.setGameState(2);
		} else if (client.gameState == 7) {
			Class365.setGameState(6);
		} else if (client.gameState == 13) {
			Class365.setGameState(18);
		} else if (client.gameState == 3) {
			Class365.setGameState(9);
		}
	}

	public ClipMap getClipMap(int i_1) {
		return this.clipMaps[i_1];
	}

	static final boolean routeTo(int i_0, int i_1, boolean bool_2, RouteStrategy routestrategy_3) {
		int i_5 = VertexNormal.MY_PLAYER.regionBaseX[0];
		int i_6 = VertexNormal.MY_PLAYER.regionBaseY[0];
		if (i_5 >= 0 && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_6 >= 0 && i_6 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
			if (i_0 >= 0 && i_0 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_1 >= 0 && i_1 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
				int i_7 = Class112.findRoute(i_5, i_6, VertexNormal.MY_PLAYER.getSize(), routestrategy_3, IndexLoaders.MAP_REGION_DECODER.getClipMap(VertexNormal.MY_PLAYER.plane), bool_2, client.walkStepsX, client.walkStepsY, -1311698246);
				if (i_7 < 1) {
					return false;
				} else {
					Class187.anInt2361 = client.walkStepsX[i_7 - 1];
					Class187.anInt2359 = client.walkStepsY[i_7 - 1];
					Class187.aBool2360 = false;
					Node_Sub20_Sub9.method15255((short) -9235);
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
			KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_9], i_0, i_1, i_4, (byte) -10);
		}
		for (i_9 = i_3; i_9 > i_8; --i_9) {
			KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_9], i_0, i_1, i_4, (byte) -46);
		}
		i_9 = i_5 + i_0;
		int i_10 = i_1 - i_5;
		for (int i_11 = i_7; i_11 <= i_8; i_11++) {
			int[] ints_12 = Class532_Sub1.anIntArrayArray7072[i_11];
			KeyHoldInputSubscriber.method3922(ints_12, i_0, i_9, i_4, (byte) 79);
			KeyHoldInputSubscriber.method3922(ints_12, i_10, i_1, i_4, (byte) 31);
		}
	}

	static void method4562(int i_0, String string_1, int i_2) {
		PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(2, (long) i_0);
		class282_sub50_sub12_3.immediate();
		class282_sub50_sub12_3.string = string_1;
	}

	public static Class350 method4564(RsByteBuffer rsbytebuffer_0) {
		Class350 class350_2 = Class383.method6512(rsbytebuffer_0);
		int i_3 = rsbytebuffer_0.readInt();
		int i_4 = rsbytebuffer_0.readInt();
		int i_5 = rsbytebuffer_0.readBigSmart();
		return new Class350_Sub1(class350_2.aClass356_4094, class350_2.aClass353_4087, class350_2.anInt4090, class350_2.anInt4089, class350_2.anInt4093, class350_2.anInt4088, class350_2.anInt4092, class350_2.anInt4086, class350_2.anInt4091, i_3, i_4, i_5);
	}
}
