
/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class MapRegion {
	byte[][][] aByteArrayArrayArray3162;
	Class256 aClass256_3163;
	Class256 aClass256_3164;
	Class106 aClass106_3165;
	Class329_Sub1 aClass329_Sub1_3166;
	Class329_Sub1 aClass329_Sub1_3167;
	CoordGrid coordGrid = new CoordGrid();
	CoordGrid aClass219_3169 = new CoordGrid();
	int anInt3170;
	boolean aBool3171;
	int sizeX;
	float aFloat3173;
	byte[][] landscapeDataBuffer;
	Class239 aClass239_3175;
	Class282_Sub50_Sub6 aClass282_Sub50_Sub6_3176;
	int anInt3177;
	byte[][] mapDataUnderlayBuffer;
	int zFar;
	Class283 aClass283_3180;
	Class341 aClass341_3181 = new Class341(0, 0, 0, 0);
	ClipMap[] clipMaps = new ClipMap[4];
	public long aLong3183;
	byte[][] npcSpawnBuffer;
	int[][] anIntArrayArray3185;
	int[][] anIntArrayArray3186;
	int[] landscapeDataArchiveIds;
	Class339 aClass339_3188;
	int missingMapCount = 0;
	int anInt3190 = -114061103;
	int anInt3191 = 0;
	int anInt3192 = 380702315;
	byte[][] landscapeDataUnderlayBuffer;
	int sizeY;
	int[] regionIds;
	int[] npcSpawnArchiveIds;
	int[] mapDataUnderlayArchiveIds;
	int[] landscapeDataUnderlayArchiveIds;
	int[][] xteas;
	byte[][] mapDataBuffer;
	ObjectIndexLoader objectDefsLoader;
	RegionMap aClass311_3202;
	SceneObjectManager sceneObjectManager;
	int[] mapDataArchiveIds;
	int[][][] anIntArrayArrayArray3205;
	public boolean aBool3206 = false;
	int anInt3207;

	void method4418(MapRegion class257_0_, int i) {
		boolean bool = class257_0_.aBool3171;
		class257_0_.aBool3171 = this.aBool3171;
		this.aBool3171 = bool;
		Class256 class256 = class257_0_.aClass256_3164;
		class257_0_.aClass256_3164 = this.aClass256_3164;
		this.aClass256_3164 = class256;
		class257_0_.aClass219_3169 = this.coordGrid;
		this.aClass219_3169 = class257_0_.coordGrid;
		this.aClass239_3175.method4039(class257_0_.method4435((byte) 1), (byte) 60);
	}

	public Class256 method4419(int i) {
		return this.aClass256_3163;
	}

	public Class339 method4420(byte i) {
		return this.aClass339_3188;
	}

	public int method4421(byte i) {
		return 100 - (this.missingMapCount * 1023846956 / (866043953 * this.anInt3190));
	}

	void method4422(byte i) {
		method4456(Class480.method8046(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12615(-765902295), (byte) 100), 375022217);
		int i_1_ = this.coordGrid.x * 1948093437;
		int i_2_ = this.coordGrid.y * -1002240017;
		int i_3_ = (-360258135 * Class31.anInt361 >> 12) + (i_1_ >> 3);
		int i_4_ = (i_2_ >> 3) + (Class246.anInt3029 * 413271601 >> 12);
		Class84.myPlayer.plane = (byte) 0;
		Class4.anInt35 = 0;
		Class84.myPlayer.method16130(8, 8, 210697228);
		int regionsLoaded = 18;
		this.xteas = new int[regionsLoaded][4];
		this.regionIds = new int[regionsLoaded];
		this.mapDataArchiveIds = new int[regionsLoaded];
		this.landscapeDataArchiveIds = new int[regionsLoaded];
		this.npcSpawnArchiveIds = new int[regionsLoaded];
		this.mapDataBuffer = new byte[regionsLoaded][];
		this.landscapeDataBuffer = new byte[regionsLoaded][];
		this.npcSpawnBuffer = new byte[regionsLoaded][];
		this.mapDataUnderlayArchiveIds = new int[regionsLoaded];
		this.landscapeDataUnderlayArchiveIds = new int[regionsLoaded];
		this.mapDataUnderlayBuffer = new byte[regionsLoaded][];
		this.landscapeDataUnderlayBuffer = new byte[regionsLoaded][];
		regionsLoaded = 0;
		for (int regionX = (i_3_ - (-2082656295 * this.sizeX >> 4)) / 8; regionX <= ((i_3_ + (-2082656295 * this.sizeX >> 4)) / 8); regionX++) {
			for (int regionY = (i_4_ - (this.sizeY * 315871463 >> 4)) / 8; regionY <= ((315871463 * this.sizeY >> 4) + i_4_) / 8; regionY++) {
				int regionId = (regionX << 8) + regionY;
				this.regionIds[regionsLoaded] = regionId;
				this.mapDataArchiveIds[regionsLoaded] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, false, regionX, regionY, -286852871), -1088666299));
				this.landscapeDataArchiveIds[regionsLoaded] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, false, regionX, regionY, 1453665209), -524022891));
				this.npcSpawnArchiveIds[regionsLoaded] = IndexLoaders.MAP_INDEX.getArchiveId(new StringBuilder().append("n").append(regionX).append('_').append(regionY).toString(), 247066516);
				this.mapDataUnderlayArchiveIds[regionsLoaded] = IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, true, regionX, regionY, 300279978), 319811182);
				this.landscapeDataUnderlayArchiveIds[regionsLoaded] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, true, regionX, regionY, -101880645), 599535507));
				if (this.npcSpawnArchiveIds[regionsLoaded] == -1) {
					this.mapDataArchiveIds[regionsLoaded] = -1;
					this.landscapeDataArchiveIds[regionsLoaded] = -1;
					this.mapDataUnderlayArchiveIds[regionsLoaded] = -1;
					this.landscapeDataUnderlayArchiveIds[regionsLoaded] = -1;
				}
				regionsLoaded++;
			}
		}
		for (int i_9_ = regionsLoaded; i_9_ < this.npcSpawnArchiveIds.length; i_9_++) {
			this.npcSpawnArchiveIds[i_9_] = -1;
			this.mapDataArchiveIds[i_9_] = -1;
			this.landscapeDataArchiveIds[i_9_] = -1;
			this.mapDataUnderlayArchiveIds[i_9_] = -1;
			this.landscapeDataUnderlayArchiveIds[i_9_] = -1;
		}
		int i_10_;
		if (client.anInt7166 * -1741204137 == 5) {
			i_10_ = 11;
		} else if (7 == -1741204137 * client.anInt7166) {
			i_10_ = 6;
		} else if (0 == -1741204137 * client.anInt7166) {
			i_10_ = 2;
		} else if (-1741204137 * client.anInt7166 == 3) {
			i_10_ = 9;
		} else {
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt7166 * -1741204137).toString());
		}
		method4458(i_3_, i_4_, i_10_, false, 1473478915);
	}

	public int getSizeX(int i) {
		return this.sizeX * -2082656295;
	}


	public Class341 method4426(int i) {
		return this.aClass341_3181;
	}

	public float method4428(int i) {
		return this.aFloat3173;
	}

	public SceneObjectManager getSceneObjectManager(int i) {
		return this.sceneObjectManager;
	}

	void method4432(Class329_Sub1 class329_sub1, byte[][] is, int i) {
		for (int i_39_ = 0; i_39_ < 1599084401 * class329_sub1.anInt3845; i_39_++) {
			if (!this.aBool3171) {
				Class282_Sub20_Sub24.method15391(132958805);
			}
			for (int i_40_ = 0; i_40_ < this.sizeX * -2082656295 >> 3; i_40_++) {
				for (int i_41_ = 0; i_41_ < this.sizeY * 315871463 >> 3; i_41_++) {
					int i_42_ = (this.anIntArrayArrayArray3205[i_39_][i_40_][i_41_]);
					if (-1 != i_42_) {
						int i_43_ = i_42_ >> 24 & 0x3;
						if (!class329_sub1.aBool3786 || 0 == i_43_) {
							int i_44_ = i_42_ >> 1 & 0x3;
							int i_45_ = i_42_ >> 14 & 0x3ff;
							int i_46_ = i_42_ >> 3 & 0x7ff;
							int i_47_ = (i_45_ / 8 << 8) + i_46_ / 8;
							for (int i_48_ = 0; (i_48_ < this.regionIds.length); i_48_++) {
								if ((this.regionIds[i_48_] == i_47_) && null != is[i_48_]) {
									class329_sub1.method12462(Renderers.SOFTWARE_RENDERER, is[i_48_], i_39_, 8 * i_40_, 8 * i_41_, i_43_, (i_45_ & 0x7) * 8, (i_46_ & 0x7) * 8, i_44_, this.clipMaps, 108280215);
									break;
								}
							}
						}
					}
					if (this.aBool3171) {
						method4462(5, (byte) -21);
					}
				}
			}
		}
	}

	public RegionMap method4433(int i) {
		return this.aClass311_3202;
	}

	public Class239 method4435(byte i) {
		return this.aClass239_3175;
	}

	public ObjectIndexLoader method4436(int i) {
		return this.objectDefsLoader;
	}

	public int[][] method4437(byte i) {
		return this.anIntArrayArray3185;
	}

	public int[][] method4438(int i) {
		return this.anIntArrayArray3186;
	}

	void method4439(RsBitsBuffer class282_sub35_sub2, int i) {
		int i_49_ = class282_sub35_sub2.readUnsignedByteC(19053846);
		boolean bool = (i_49_ & 0x1) != 0;
		int i_50_ = class282_sub35_sub2.readUnsigned128Byte();
		if (1 == i_50_) {
			this.aClass256_3163 = Class256.aClass256_3155;
		} else if (2 == i_50_) {
			this.aClass256_3163 = Class256.aClass256_3156;
		} else if (3 == i_50_) {
			this.aClass256_3163 = Class256.aClass256_3157;
		} else if (i_50_ == 4) {
			this.aClass256_3163 = Class256.aClass256_3161;
		}
		int i_51_ = class282_sub35_sub2.readUnsignedByte128(-1236952914);
		int i_52_ = class282_sub35_sub2.readUnsignedShort128();
		int i_53_ = class282_sub35_sub2.readUnsignedShort();
		if (!this.aBool3171) {
			method4457(-1079730027);
		}
		method4456(Class480.method8046(i_51_, (byte) 66), -1665469325);
		class282_sub35_sub2.initBitAccess((byte) 76);
		for (int i_54_ = 0; i_54_ < 4; i_54_++) {
			for (int i_55_ = 0; i_55_ < this.sizeX * -2082656295 >> 3; i_55_++) {
				for (int i_56_ = 0; i_56_ < 315871463 * this.sizeY >> 3; i_56_++) {
					int i_57_ = class282_sub35_sub2.readBits(1, (byte) 74);
					if (i_57_ == 1) {
						this.anIntArrayArrayArray3205[i_54_][i_55_][i_56_] = class282_sub35_sub2.readBits(26, (byte) 1);
					} else {
						this.anIntArrayArrayArray3205[i_54_][i_55_][i_56_] = -1;
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 26);
		int i_58_ = ((class282_sub35_sub2.buffer.length - class282_sub35_sub2.index * -1990677291) / 16);
		this.xteas = new int[i_58_][4];
		for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
			for (int i_60_ = 0; i_60_ < 4; i_60_++) {
				this.xteas[i_59_][i_60_] = class282_sub35_sub2.readInt();
			}
		}
		this.regionIds = new int[i_58_];
		this.mapDataArchiveIds = new int[i_58_];
		this.landscapeDataArchiveIds = new int[i_58_];
		this.npcSpawnArchiveIds = null;
		this.mapDataBuffer = new byte[i_58_][];
		this.landscapeDataBuffer = new byte[i_58_][];
		this.npcSpawnBuffer = null;
		this.mapDataUnderlayArchiveIds = new int[i_58_];
		this.landscapeDataUnderlayArchiveIds = new int[i_58_];
		this.mapDataUnderlayBuffer = new byte[i_58_][];
		this.landscapeDataUnderlayBuffer = new byte[i_58_][];
		i_58_ = 0;
		for (int i_61_ = 0; i_61_ < 4; i_61_++) {
			for (int i_62_ = 0; i_62_ < this.sizeX * -2082656295 >> 3; i_62_++) {
				for (int i_63_ = 0; i_63_ < 315871463 * this.sizeY >> 3; i_63_++) {
					int i_64_ = (this.anIntArrayArrayArray3205[i_61_][i_62_][i_63_]);
					if (i_64_ != -1) {
						int i_65_ = i_64_ >> 14 & 0x3ff;
						int i_66_ = i_64_ >> 3 & 0x7ff;
						int i_67_ = (i_65_ / 8 << 8) + i_66_ / 8;
						for (int i_68_ = 0; i_68_ < i_58_; i_68_++) {
							if (i_67_ == this.regionIds[i_68_]) {
								i_67_ = -1;
								break;
							}
						}
						if (-1 != i_67_) {
							this.regionIds[i_58_] = i_67_;
							int i_69_ = i_67_ >> 8 & 0xff;
							int i_70_ = i_67_ & 0xff;
							this.mapDataArchiveIds[i_58_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, false, i_69_, i_70_, 1790890938), 1374310784));
							this.landscapeDataArchiveIds[i_58_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, false, i_69_, i_70_, 1151902743), 1638287218));
							this.mapDataUnderlayArchiveIds[i_58_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, true, i_69_, i_70_, -111942668), -1393791426));
							this.landscapeDataUnderlayArchiveIds[i_58_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, true, i_69_, i_70_, -1970990697), 1691526385));
							i_58_++;
						}
					}
				}
			}
		}
		method4458(i_53_, i_52_, 18, bool, 1473478915);
	}

	public void method4440(byte[][][] is, byte i) {
		this.aByteArrayArrayArray3162 = is;
	}

	public Class329_Sub1 method4441(int i) {
		return this.aClass329_Sub1_3167;
	}

	public void setObjectIndexLoader(ObjectIndexLoader loader, int i) {
		this.objectDefsLoader = loader;
	}

	public void method4444(int i) {
		if (this.sceneObjectManager != null) {
			Defaults8Loader.method11156(895822959);
			this.sceneObjectManager.aClass284_2648.method5012(-1037153971);
			this.sceneObjectManager = null;
		}
	}

	public void method4445(byte i) {
		this.aClass339_3188 = Class339.aClass339_3984;
		this.missingMapCount = 0;
		this.anInt3190 = -114061103;
		this.anInt3191 = 0;
		this.anInt3192 = 380702315;
	}

	public void method4446(byte i) {
		this.aClass239_3175 = new Class239(Renderers.SOFTWARE_RENDERER, this.sizeX * -2082656295 >> 3, this.sizeY * 315871463 >> 3);
	}

	public void method4447(int i) {
		this.anInt3177 = 840435000;
		this.zFar = (int) (34.46 * (this.sizeX * -2082656295)) * -1709679659;
		this.zFar = -1709679659 * (-552598147 * this.zFar << 2);
		if (Renderers.SOFTWARE_RENDERER.method8454()) {
			this.zFar += 817342976;
		}
		this.zFar += (817342976 * 6);
	}

	public int getSizeY(int i) {
		return this.sizeY * 315871463;
	}

	void method4452(RsBitsBuffer stream) {
		int i_81_ = stream.readUnsignedByte();
		int chunkX = stream.readUnsignedShort();
		int chunkY = stream.readUnsignedShort();// method13118((byte) -75);
		boolean bool = stream.readUnsignedByte() == 1;
		if (!this.aBool3171) {
			method4457(1460285779);
		}
		method4456(Class480.method8046(i_81_, (byte) 107), 1375320268);
		int i_84_ = ((stream.buffer.length - stream.index * -1990677291) / 16);
		this.xteas = new int[i_84_][4];
		for (int i_85_ = 0; i_85_ < i_84_; i_85_++) {
			for (int i_86_ = 0; i_86_ < 4; i_86_++) {
				this.xteas[i_85_][i_86_] = stream.readInt();
			}
		}
		this.regionIds = new int[i_84_];
		this.mapDataArchiveIds = new int[i_84_];
		this.landscapeDataArchiveIds = new int[i_84_];
		this.npcSpawnArchiveIds = null;
		this.mapDataBuffer = new byte[i_84_][];
		this.landscapeDataBuffer = new byte[i_84_][];
		this.npcSpawnBuffer = null;
		this.mapDataUnderlayArchiveIds = new int[i_84_];
		this.landscapeDataUnderlayArchiveIds = new int[i_84_];
		this.mapDataUnderlayBuffer = new byte[i_84_][];
		this.landscapeDataUnderlayBuffer = new byte[i_84_][];
		i_84_ = 0;
		for (int i_87_ = (chunkX - (-2082656295 * this.sizeX >> 4)) / 8; i_87_ <= ((-2082656295 * this.sizeX >> 4) + chunkX) / 8; i_87_++) {
			for (int i_88_ = (chunkY - (this.sizeY * 315871463 >> 4)) / 8; i_88_ <= (chunkY + (this.sizeY * 315871463 >> 4)) / 8; i_88_++) {
				this.regionIds[i_84_] = i_88_ + (i_87_ << 8);
				this.mapDataArchiveIds[i_84_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, false, i_87_, i_88_, -615462383), -254692349));
				this.landscapeDataArchiveIds[i_84_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, false, i_87_, i_88_, -1193360263), -153507048));
				this.mapDataUnderlayArchiveIds[i_84_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, true, i_87_, i_88_, 1995328827), -2019708282));
				this.landscapeDataUnderlayArchiveIds[i_84_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, true, i_87_, i_88_, -1407849075), -1217650768));
				i_84_++;
			}
		}
		method4458(chunkX, chunkY, 18, bool, 1473478915);
	}

	String getArchiveName(boolean settingsData, boolean underLay, int regionX, int regionY, int i_99_) {
		String string = "";
		if (settingsData) {
			string = new StringBuilder().append(string).append("m").append(regionX).append('_').append(regionY).toString();
		} else {
			string = new StringBuilder().append(string).append("l").append(regionX).append('_').append(regionY).toString();
		}
		if (underLay) {
			string = new StringBuilder().append('u').append(string).toString();
		}
		return string;
	}

	void method4456(Class106 class106, int i) {
		if (this.aClass106_3165 != class106) {
			this.sizeX = (this.sizeY = -740200865 * class106.anInt1076) * -1553903937;
			this.anIntArrayArrayArray3205 = (new int[4][-2082656295 * this.sizeX >> 3][this.sizeY * 315871463 >> 3]);
			this.anIntArrayArray3185 = (new int[-2082656295 * this.sizeX][315871463 * this.sizeY]);
			this.anIntArrayArray3186 = (new int[-2082656295 * this.sizeX][this.sizeY * 315871463]);
			for (int i_100_ = 0; i_100_ < 4; i_100_++) {
				this.clipMaps[i_100_] = Class403.createClipMap((this.sizeX * -2082656295), (this.sizeY * 315871463), (byte) 120);
			}
			this.aByteArrayArrayArray3162 = (new byte[4][this.sizeX * -2082656295][this.sizeY * 315871463]);
			this.aClass311_3202 = new RegionMap(4, -2082656295 * this.sizeX, this.sizeY * 315871463);
			method4446((byte) -52);
			this.aClass106_3165 = class106;
		}
	}

	void method4457(int i) {
		if (this.aClass256_3163 != Class256.aClass256_3153 && this.aClass256_3164 != Class256.aClass256_3153) {
			if (Class256.aClass256_3155 == this.aClass256_3163 || Class256.aClass256_3157 == this.aClass256_3163 || ((this.aClass256_3164 != this.aClass256_3163) && ((Class256.aClass256_3158 == this.aClass256_3163) || (this.aClass256_3164 == Class256.aClass256_3158)))) {
				client.anInt7211 = 0;
				client.anInt7210 = 0;
				client.aClass465_7208.method7749(-1318045853);
			}
			this.aClass256_3164 = this.aClass256_3163;
		}
	}

	void method4458(int i, int i_101_, int i_102_, boolean bool, int i_103_) {
		if (2 == client.anInt7341 * -891719545) {
			if (this.aBool3171) {
				throw new IllegalStateException();
			}
			client.anInt7341 = -1766566601;
			client.anInt7231 = 593633913;
		}
		if (bool || i != -1892499075 * this.anInt3170 || this.anInt3207 * -975658881 != i_101_) {
			this.anInt3170 = -93814827 * i;
			this.anInt3207 = 1969692543 * i_101_;
			if (!this.aBool3171) {
				Class365.setGameState(i_102_, 1265357038);
				Class446.method7447(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -532223437), true, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -29);
			}
			if (this.coordGrid != null) {
				this.aClass219_3169 = this.coordGrid;
			} else {
				this.aClass219_3169 = new CoordGrid(0, 0, 0);
			}
			this.coordGrid = new CoordGrid(0, (-1892499075 * this.anInt3170 - (-2082656295 * this.sizeX >> 4)) * 8, (this.anInt3207 * -975658881 - (315871463 * this.sizeY >> 4)) * 8);
			this.aClass282_Sub50_Sub6_3176 = Class291.method5175(1948093437 * (this.coordGrid.x), (this.coordGrid.y) * -1002240017);
			this.aClass283_3180 = null;
			if (!this.aBool3171) {
				method4459(i_102_, (byte) 119);
			}
		}
	}

	void method4459(int i, byte i_104_) {
		int i_105_ = (this.coordGrid.x * 1948093437 - 1948093437 * this.aClass219_3169.x);
		int i_106_ = (this.coordGrid.y * -1002240017 - this.aClass219_3169.y * -1002240017);
		if (18 == i) {
			for (int i_107_ = 0; i_107_ < 1658163325 * client.anInt7210; i_107_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_107_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					for (int i_108_ = 0; i_108_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_108_++) {
						class521_sub1_sub1_sub2_sub2.regionBaseX[i_108_] -= i_105_;
						class521_sub1_sub1_sub2_sub2.regionBaseY[i_108_] -= i_106_;
					}
					Vector3 class385 = Vector3.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.x -= i_105_ * 512;
					class385.z -= 512 * i_106_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					class385.method6624();
				}
			}
		} else {
			boolean bool = false;
			client.anInt7211 = 0;
			int i_109_ = -1168133632 * this.sizeX - 512;
			int i_110_ = this.sizeY * -1482568192 - 512;
			for (int i_111_ = 0; i_111_ < client.anInt7210 * 1658163325; i_111_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_111_];
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					Vector3 class385 = Vector3.method6623(class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
					class385.x -= i_105_ * 512;
					class385.z -= 512 * i_106_;
					class521_sub1_sub1_sub2_sub2.method11171(class385);
					if ((int) class385.x < 0 || (int) class385.x > i_109_ || (int) class385.z < 0 || (int) class385.z > i_110_) {
						class521_sub1_sub1_sub2_sub2.method16166(null, -1796042830);
						class282_sub47.unlink(-371378792);
						bool = true;
					} else {
						boolean bool_112_ = true;
						for (int i_113_ = 0; i_113_ < (class521_sub1_sub1_sub2_sub2.regionBaseX).length; i_113_++) {
							class521_sub1_sub1_sub2_sub2.regionBaseX[i_113_] -= i_105_;
							class521_sub1_sub1_sub2_sub2.regionBaseY[i_113_] -= i_106_;
							if ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_113_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseX[i_113_]) >= (this.sizeX * -2082656295)) || (class521_sub1_sub1_sub2_sub2.regionBaseY[i_113_]) < 0 || ((class521_sub1_sub1_sub2_sub2.regionBaseY[i_113_]) >= (this.sizeY * 315871463))) {
								bool_112_ = false;
							}
						}
						if (bool_112_) {
							client.anIntArray7212[((client.anInt7211 += 1568892417) * -685729279 - 1)] = (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299);
						} else {
							class521_sub1_sub1_sub2_sub2.method16166(null, -163238630);
							class282_sub47.unlink(-371378792);
							bool = true;
						}
					}
					class385.method6624();
				}
			}
			if (bool) {
				client.anInt7210 = (client.aClass465_7208.method7748((short) 292) * -1228117803);
				int i_114_ = 0;
				Iterator iterator = client.aClass465_7208.iterator();
				while (iterator.hasNext()) {
					Class282_Sub47 class282_sub47 = (Class282_Sub47) iterator.next();
					client.aClass282_Sub47Array7209[i_114_++] = class282_sub47;
				}
			}
		}
		for (int i_115_ = 0; i_115_ < 2048; i_115_++) {
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_115_];
			if (null != class521_sub1_sub1_sub2_sub1) {
				for (int i_116_ = 0; (i_116_ < class521_sub1_sub1_sub2_sub1.regionBaseX.length); i_116_++) {
					class521_sub1_sub1_sub2_sub1.regionBaseX[i_116_] -= i_105_;
					class521_sub1_sub1_sub2_sub1.regionBaseY[i_116_] -= i_106_;
				}
				Vector3 class385 = Vector3.method6623(class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
				class385.x -= i_105_ * 512;
				class385.z -= i_106_ * 512;
				class521_sub1_sub1_sub2_sub1.method11171(class385);
				class385.method6624();
			}
		}
		Class180[] class180s = client.aClass180Array7348;
		for (int i_117_ = 0; i_117_ < class180s.length; i_117_++) {
			Class180 class180 = class180s[i_117_];
			if (null != class180) {
				class180.anInt2243 -= i_105_ * 1588917760;
				class180.anInt2235 -= -333017600 * i_106_;
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7775.head((byte) 77)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7775.next(-298997053)) {
			class282_sub31.anInt7762 -= 1690395815 * i_105_;
			class282_sub31.anInt7763 -= 765748375 * i_106_;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= this.sizeX * -2082656295) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.sizeY))) {
				class282_sub31.unlink(-371378792);
			}
		}
		for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7776.head((byte) 67)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7776.next(270479135)) {
			class282_sub31.anInt7762 -= i_105_ * 1690395815;
			class282_sub31.anInt7763 -= i_106_ * 765748375;
			if (Class256.aClass256_3161 != this.aClass256_3163 && (class282_sub31.anInt7762 * 37618455 < 0 || -322610393 * class282_sub31.anInt7763 < 0 || (class282_sub31.anInt7762 * 37618455 >= -2082656295 * this.sizeX) || (-322610393 * class282_sub31.anInt7763 >= 315871463 * this.sizeY))) {
				class282_sub31.unlink(-371378792);
			}
		}
		for (Class282_Sub29 class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7750(-1570433820)); null != class282_sub29; class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7751((byte) 4))) {
			int i_118_ = (int) (class282_sub29.data * -3442165056282524525L >> 28 & 0x3L);
			int i_119_ = (int) (class282_sub29.data * -3442165056282524525L & 0x3fffL);
			int i_120_ = (i_119_ - this.coordGrid.x * 1948093437);
			int i_121_ = (int) (-3442165056282524525L * class282_sub29.data >> 14 & 0x3fffL);
			int i_122_ = (i_121_ - this.coordGrid.y * -1002240017);
			if (null != this.sceneObjectManager) {
				if (i_120_ < 0 || i_122_ < 0 || i_120_ >= -2082656295 * this.sizeX || i_122_ >= this.sizeY * 315871463 || i_120_ >= (this.sceneObjectManager.anInt2617 * -1912960305) || i_122_ >= -18177099 * (this.sceneObjectManager.anInt2603)) {
					if (this.aClass256_3163 != Class256.aClass256_3161) {
						class282_sub29.unlink(-371378792);
					}
				} else if ((this.sceneObjectManager.aClass293ArrayArrayArray2604) != null) {
					this.sceneObjectManager.method3405(i_118_, i_120_, i_122_, -1311217260);
				}
			}
		}
		if (Class187.anInt2361 * 895508675 != 0) {
			Class187.anInt2361 -= -134656021 * i_105_;
			Class187.anInt2359 -= -818291313 * i_106_;
		}
		Class16.method566(1954373372);
		ClipMap.method6008(false, (byte) 8);
		if (i == 18) {
			client.anInt7262 -= -631700992 * i_105_;
			client.anInt7376 -= i_106_ * 1139486208;
			Class11.anInt122 -= -1024929280 * i_105_;
			Class266.anInt3289 -= 1261918720 * i_106_;
			if (-672443707 * NativeLibraryLoader.anInt3240 != 4) {
				NativeLibraryLoader.anInt3240 = 770488346;
				Class86.anInt833 = -1509271845;
				Class508.anInt5864 = 987778595;
			}
		} else {
			Class296.anInt3534 -= 39297289 * i_105_;
			Class282_Sub44.anInt8064 -= i_106_ * -1587752955;
			Class96_Sub13.anInt9368 -= -2005398665 * i_105_;
			OutgoingLoginPacket.anInt4280 -= i_106_ * -772343735;
			Class31.anInt361 -= 1797075456 * i_105_;
			Class246.anInt3029 -= i_106_ * 52797952;
			if (Math.abs(i_105_) > -2082656295 * this.sizeX || Math.abs(i_106_) > this.sizeY * 315871463) {
				this.aClass239_3175.method4048(1347425088);
			}
		}
		Class350.method6189((byte) 120);
		Class58.method1139(-1725445379);
		client.aClass465_7334.method7749(189639583);
		client.aClass482_7333.method8118(-886454007);
		client.aClass457_7335.method7651((byte) 5);
		Class30.method795((byte) -81);
	}

	void method4460(int i) {
		this.aClass329_Sub1_3166 = null;
		this.aClass329_Sub1_3167 = null;
		for (int i_123_ = 0; i_123_ < 4; i_123_++) {
			if (null != this.clipMaps[i_123_]) {
				this.clipMaps[i_123_].method5965((byte) 5);
			}
		}
		if (this.aClass311_3202 != null) {
			this.aClass311_3202.reset(-1587163480);
		}
		if (this.aClass239_3175 != null) {
			this.aClass239_3175.method4044(-1299057732);
		}
		if (this.sceneObjectManager != null) {
			this.sceneObjectManager.aClass284_2648.method5012(-1037153971);
			this.sceneObjectManager = null;
		}
	}

	public boolean method4461(byte i) {
		if (!this.aBool3171) {
			Exception_Sub3.method15619(false, 2049702399);
		}
		this.missingMapCount = 0;
		for (int i_124_ = 0; i_124_ < this.mapDataBuffer.length; i_124_++) {
			if (-1 != this.mapDataArchiveIds[i_124_] && null == this.mapDataBuffer[i_124_]) {
				this.mapDataBuffer[i_124_] = IndexLoaders.MAP_INDEX.getFile((this.mapDataArchiveIds[i_124_]), 0, -1737111035);
				if (null == this.mapDataBuffer[i_124_]) {
					this.missingMapCount += -1145558933;
				}
			}
			if (-1 != this.landscapeDataArchiveIds[i_124_] && null == this.landscapeDataBuffer[i_124_]) {
				this.landscapeDataBuffer[i_124_] = (IndexLoaders.MAP_INDEX.getFile(this.landscapeDataArchiveIds[i_124_], 0, this.xteas[i_124_], -1821547334));
				if (null == this.landscapeDataBuffer[i_124_]) {
					this.missingMapCount += -1145558933;
				}
			}
			if (this.mapDataUnderlayArchiveIds[i_124_] != -1 && this.mapDataUnderlayBuffer[i_124_] == null) {
				this.mapDataUnderlayBuffer[i_124_] = IndexLoaders.MAP_INDEX.getFile((this.mapDataUnderlayArchiveIds[i_124_]), 0, -1629073645);
				if (null == this.mapDataUnderlayBuffer[i_124_]) {
					this.missingMapCount += -1145558933;
				}
			}
			if (-1 != this.landscapeDataUnderlayArchiveIds[i_124_] && this.landscapeDataUnderlayBuffer[i_124_] == null) {
				this.landscapeDataUnderlayBuffer[i_124_] = IndexLoaders.MAP_INDEX.getFile((this.landscapeDataUnderlayArchiveIds[i_124_]), 0, -1660643984);
				if (null == this.landscapeDataUnderlayBuffer[i_124_]) {
					this.missingMapCount += -1145558933;
				}
			}
			if (this.npcSpawnArchiveIds != null && this.npcSpawnBuffer[i_124_] == null && -1 != this.npcSpawnArchiveIds[i_124_]) {
				this.npcSpawnBuffer[i_124_] = (IndexLoaders.MAP_INDEX.getFile(this.npcSpawnArchiveIds[i_124_], 0, this.xteas[i_124_], -1355054839));
				if (this.npcSpawnBuffer[i_124_] == null) {
					this.missingMapCount += -1145558933;
				}
			}
		}
		if (this.aClass283_3180 == null) {
			if (null != this.aClass282_Sub50_Sub6_3176 && (IndexLoaders.WORLD_MAP_INDEX.validFile(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 1280235556))) {
				if (!IndexLoaders.WORLD_MAP_INDEX.method5629(new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), 71472045)) {
					this.missingMapCount += -1145558933;
				} else {
					this.aClass283_3180 = Class301.method5331(IndexLoaders.WORLD_MAP_INDEX, new StringBuilder().append(this.aClass282_Sub50_Sub6_3176.aString9533).append("_staticelements").toString(), client.membersWorld, 874508557);
				}
			} else {
				this.aClass283_3180 = new Class283(0);
			}
		}
		if (1685275715 * this.missingMapCount > 0) {
			if (this.anInt3190 * 866043953 < this.missingMapCount * 1685275715) {
				this.anInt3190 = this.missingMapCount * -1663472973;
			}
			this.aClass339_3188 = Class339.aClass339_3985;
			return false;
		}
		this.anInt3191 = 0;
		for (int i_125_ = 0; i_125_ < this.mapDataBuffer.length; i_125_++) {
			byte[] is = this.landscapeDataBuffer[i_125_];
			if (null != is) {
				int regionX = (64 * (this.regionIds[i_125_] >> 8) - (this.coordGrid.x * 1948093437));
				int regionY = ((this.regionIds[i_125_] & 0xff) * 64 - (this.coordGrid.y * -1002240017));
				if (this.aClass256_3163.method4410((byte) 64)) {
					regionX = 10;
					regionY = 10;
				}
				int i_128_ = Class251.decodeLandscapeData(this.objectDefsLoader, is, regionX, regionY, (this.sizeX * -2082656295), (315871463 * this.sizeY), (short) 8448);
				if (i_128_ > 0) {
					this.anInt3191 += i_128_ * -591712385;
				}
			}
			is = this.landscapeDataUnderlayBuffer[i_125_];
			if (is != null) {
				int i_129_ = (64 * (this.regionIds[i_125_] >> 8) - (1948093437 * this.coordGrid.x));
				int i_130_ = ((this.regionIds[i_125_] & 0xff) * 64 - (-1002240017 * this.coordGrid.y));
				if (this.aClass256_3163.method4410((byte) 9)) {
					i_129_ = 10;
					i_130_ = 10;
				}
				int i_131_ = Class251.decodeLandscapeData(this.objectDefsLoader, is, i_129_, i_130_, (this.sizeX * -2082656295), (this.sizeY * 315871463), (short) 8448);
				if (i_131_ > 0) {
					this.anInt3191 += -591712385 * i_131_;
				}
			}
		}
		if (-1047228289 * this.anInt3191 > 0) {
			if (-1112134077 * this.anInt3192 < this.anInt3191 * -1047228289) {
				this.anInt3192 = -624011499 * this.anInt3191;
			}
			this.aClass339_3188 = Class339.aClass339_3983;
			return false;
		}
		if (!this.aBool3171 && Class339.aClass339_3984 != this.aClass339_3188) {
			Class446.method7447(new StringBuilder().append(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -414285039)).append(Class2.aString16).append("(100%)").toString(), true, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -26);
		}
		this.aClass339_3188 = Class339.aClass339_3982;
		if (!this.aBool3171) {
			Class282_Sub20_Sub24.method15391(67917795);
		}
		if (!this.aBool3171) {
			for (int i_132_ = 0; i_132_ < 2048; i_132_++) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i_132_];
				if (null != class521_sub1_sub1_sub2_sub1) {
					class521_sub1_sub1_sub2_sub1.aClass206_7970 = null;
				}
			}
			for (int i_133_ = 0; i_133_ < client.aClass282_Sub47Array7209.length; i_133_++) {
				Class282_Sub47 class282_sub47 = client.aClass282_Sub47Array7209[i_133_];
				if (class282_sub47 != null) {
					((Class521_Sub1) class282_sub47.anObject8068).aClass206_7970 = null;
				}
			}
		}
		if (!this.aBool3171) {
			Class356.method6227(true, (byte) -87);
		}
		if (!this.aBool3171) {
			Class247.method4250((byte) -72);
		}
		boolean bool = false;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-2143596575) == 2) {
			for (int i_134_ = 0; i_134_ < this.mapDataBuffer.length; i_134_++) {
				if (this.landscapeDataUnderlayBuffer[i_134_] != null || this.mapDataUnderlayBuffer[i_134_] != null) {
					bool = true;
					break;
				}
			}
		}
		int i_135_ = (Class5.method295(Class393.aClass282_Sub54_4783.aClass468_Sub16_8198.method12750((byte) 32), 44628475).chunkSize * 793844040);
		if (Renderers.SOFTWARE_RENDERER.method8454()) {
			i_135_++;
		}
		method4447(1045268791);
		method4460(1219957593);
		this.sceneObjectManager = new SceneObjectManager(Renderers.SOFTWARE_RENDERER, 9, 4, -2082656295 * this.sizeX, 315871463 * this.sizeY, i_135_, bool, Renderers.SOFTWARE_RENDERER.method8463() > 0);
		this.sceneObjectManager.method3380(false, -914334995);
		this.sceneObjectManager.method3378(647281963 * client.anInt7240, -1193950137);
		if (647281963 * client.anInt7240 != 0) {
			this.sceneObjectManager.method3379(Renderers.FONT_RENDERER, (byte) -68);
		} else {
			this.sceneObjectManager.method3379(null, (byte) -47);
		}
		this.aClass341_3181 = new Class341();
		this.aFloat3173 = -0.05F + (float) (Math.random() / 10.0);
		this.aClass329_Sub1_3167 = new Class329_Sub1(this.sceneObjectManager, this.objectDefsLoader, 4, this.sizeX * -2082656295, 315871463 * this.sizeY, false, this.aClass311_3202, this.aClass239_3175);
		this.aClass329_Sub1_3167.method5835(1920682092);
		this.aClass329_Sub1_3167.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -19) * 2141862047;
		this.aClass329_Sub1_3167.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-1025705953) == 2;
		this.aClass329_Sub1_3167.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
		this.aClass329_Sub1_3167.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(-267054469) == 1;
		this.aClass329_Sub1_3167.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1377050121) == 1;
		if (!this.aClass256_3163.method4410((byte) -32)) {
			method4463(this.aClass329_Sub1_3167, this.mapDataBuffer, 1315892185);
		} else {
			method4464(this.aClass329_Sub1_3167, this.mapDataBuffer, 1987015126);
		}
		if (this.aBool3171) {
			method4462(50, (byte) -7);
		}
		this.aClass239_3175.method4045(this.sizeX * -2082656295 >> 4, this.sizeY * 315871463 >> 4, -1230013231);
		this.aClass239_3175.method4037(this, (byte) 122);
		if (bool) {
			this.sceneObjectManager.method3380(true, -914334995);
			this.aClass329_Sub1_3166 = new Class329_Sub1(this.sceneObjectManager, this.objectDefsLoader, 1, -2082656295 * this.sizeX, 315871463 * this.sizeY, true, this.aClass311_3202, this.aClass239_3175);
			this.aClass329_Sub1_3166.method5835(1973869970);
			this.aClass329_Sub1_3166.anInt3809 = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -93) * 2141862047;
			this.aClass329_Sub1_3166.aBool3835 = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-962367192) == 2;
			this.aClass329_Sub1_3166.aBool3780 = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1;
			this.aClass329_Sub1_3166.aBool3820 = Class393.aClass282_Sub54_4783.aClass468_Sub17_8200.method12762(1666715266) == 1;
			this.aClass329_Sub1_3166.aBool3782 = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-332126301) == 1;
			if (!this.aClass256_3163.method4410((byte) 46)) {
				method4463(this.aClass329_Sub1_3166, this.mapDataUnderlayBuffer, 500096938);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, -1068785077);
				}
			} else {
				method4464(this.aClass329_Sub1_3166, this.mapDataUnderlayBuffer, 1544003060);
				if (!this.aBool3171) {
					Exception_Sub3.method15619(true, -466489103);
				}
			}
			this.aClass329_Sub1_3166.method5853(0, (this.aClass329_Sub1_3167.anIntArrayArrayArray3818[0]), -1156911590);
			this.aClass329_Sub1_3166.initClipMap(Renderers.SOFTWARE_RENDERER, null, null, (byte) 11);
			this.sceneObjectManager.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -1);
			}
		}
		this.aClass329_Sub1_3167.initClipMap(Renderers.SOFTWARE_RENDERER, (bool ? this.aClass329_Sub1_3166.anIntArrayArrayArray3818 : null), this.clipMaps, (byte) 44);
		if (!this.aClass256_3163.method4410((byte) -39)) {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -1924347583);
			}
			method4465(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -1228514951);
			if (null != this.npcSpawnBuffer) {
				decodeNPCSpawns(-128453160);
			}
		} else {
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -152609388);
			}
			method4432(this.aClass329_Sub1_3167, this.landscapeDataBuffer, -389537380);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, -665945100);
		}
		this.aClass329_Sub1_3167.method5837(Renderers.SOFTWARE_RENDERER, (bool ? this.sceneObjectManager.aClass390Array2614[0] : null), null, 111695504);
		if (this.aBool3171) {
			method4462(75, (byte) -2);
		}
		this.aClass329_Sub1_3167.method12463(Renderers.SOFTWARE_RENDERER, false, -770561854);
		if (this.aBool3171) {
			method4462(75, (byte) -37);
		}
		if (!this.aBool3171) {
			Exception_Sub3.method15619(true, 2049102512);
		}
		if (bool) {
			this.sceneObjectManager.method3380(true, -914334995);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 1689569657);
			}
			if (!this.aClass256_3163.method4410((byte) -69)) {
				method4465(this.aClass329_Sub1_3166, this.landscapeDataUnderlayBuffer, -1228514951);
			} else {
				method4432(this.aClass329_Sub1_3166, this.landscapeDataUnderlayBuffer, 346534701);
			}
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, -1264882543);
			}
			this.aClass329_Sub1_3166.method5837(Renderers.SOFTWARE_RENDERER, null, this.sceneObjectManager.aClass390Array2607[0], -1009930272);
			this.aClass329_Sub1_3166.method12463(Renderers.SOFTWARE_RENDERER, true, 454950063);
			if (!this.aBool3171) {
				Exception_Sub3.method15619(true, 163262675);
			}
			this.sceneObjectManager.method3380(false, -914334995);
			if (this.aBool3171) {
				method4462(50, (byte) -74);
			}
		}
		this.aClass329_Sub1_3167.method5891((short) -9701);
		if (this.aClass329_Sub1_3166 != null) {
			this.aClass329_Sub1_3166.method5891((short) -22349);
		}
		this.sceneObjectManager.method3428(1203434505);
		if (this.aBool3171) {
			Class169.method2869(1612700146);
			while (!Renderers.SOFTWARE_RENDERER.method8455(-203069693)) {
				method4462(1, (byte) -98);
			}
		}
		boolean bool_136_ = false;
		if (this.aBool3171) {
			MapRegion class257_137_ = IndexLoaders.MAP_REGION_DECODER;
			method4418(class257_137_, 16711935);
			IndexLoaders.MAP_REGION_LOADER_THREAD.method6050(class257_137_, (byte) -54);
			bool_136_ = true;
			Class169.method2869(1958706553);
			synchronized (client.anObject7227) {
				client.aBool7225 = true;
				try {
					client.anObject7227.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			IndexLoaders.MAP_REGION_DECODER = this;
			class257_137_.method4460(1219957593);
			method4459(18, (byte) 106);
			method4457(-974464846);
		} else {
			Class282_Sub20_Sub24.method15391(1595654016);
			this.aClass239_3175.method4075(-1340857896);
			Class282_Sub15_Sub1.method14840((byte) -73);
		}
		for (int i_138_ = 0; i_138_ < 4; i_138_++) {
			for (int i_139_ = 0; i_139_ < this.sizeX * -2082656295; i_139_++) {
				for (int i_140_ = 0; i_140_ < 315871463 * this.sizeY; i_140_++) {
					Class434_Sub1.method12760(i_138_, i_139_, i_140_, -1380263584);
				}
			}
		}
		for (int i_141_ = 0; i_141_ < client.aClass281Array7180.length; i_141_++) {
			if (client.aClass281Array7180[i_141_] != null) {
				client.aClass281Array7180[i_141_].method4978(this.sceneObjectManager, (byte) -1);
			}
		}
		Class405.method6823(-734889653);
		Class48_Sub2.method14571((byte) 0);
		if (NamedFileReference.method867(-1009865629) == Class279.aClass279_3368 && client.aClass184_7475.method3053((byte) -27) != null && -1741204137 * client.anInt7166 == 18) {
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4609, client.aClass184_7475.isaac, 582872651);
			class282_sub23.buffer.writeInt(1057001181);
			client.aClass184_7475.method3049(class282_sub23, 278728590);
		}
		if (!this.aClass256_3163.method4410((byte) 29)) {
			int i_142_ = ((-1892499075 * this.anInt3170 - (-2082656295 * this.sizeX >> 4)) / 8);
			int i_143_ = (((this.sizeX * -2082656295 >> 4) + -1892499075 * this.anInt3170) / 8);
			int i_144_ = ((-975658881 * this.anInt3207 - (315871463 * this.sizeY >> 4)) / 8);
			int i_145_ = ((this.anInt3207 * -975658881 + (this.sizeY * 315871463 >> 4)) / 8);
			for (int i_146_ = i_142_ - 1; i_146_ <= 1 + i_143_; i_146_++) {
				for (int i_147_ = i_144_ - 1; i_147_ <= i_145_ + 1; i_147_++) {
					if (i_146_ < i_142_ || i_146_ > i_143_ || i_147_ < i_144_ || i_147_ > i_145_) {
						IndexLoaders.MAP_INDEX.method5630(getArchiveName(true, false, i_146_, i_147_, 407877919), -1674080210);
						IndexLoaders.MAP_INDEX.method5630(getArchiveName(false, false, i_146_, i_147_, 205123425), 1691833527);
						IndexLoaders.MAP_INDEX.method5630(getArchiveName(true, true, i_146_, i_147_, -174543641), 761921723);
						IndexLoaders.MAP_INDEX.method5630(getArchiveName(false, true, i_146_, i_147_, -346179473), -994629113);
					}
				}
			}
		}
		if (-1741204137 * client.anInt7166 == 11) {
			Class365.setGameState(5, 897954436);
		} else if (2 == client.anInt7166 * -1741204137) {
			Class365.setGameState(0, 1905920660);
		} else if (-1741204137 * client.anInt7166 == 6) {
			Class365.setGameState(7, 1471410444);
		} else if (9 == -1741204137 * client.anInt7166) {
			Class365.setGameState(3, 1843758807);
		} else {
			Class365.setGameState(13, 850026987);
			if (client.aClass184_7475.method3053((byte) -84) != null) {
				TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4603, client.aClass184_7475.isaac, 1466063096);
				client.aClass184_7475.method3049(class282_sub23, 1512043524);
			}
		}
		Class59.method1160(-1437458578);
		if (aBool3206) {
			Class209.method3598(Long.toString(Class169.method2869(1592227857) - (-404972914729282941L * aLong3183)), -1857188149);
			aBool3206 = false;
		}
		if (bool_136_) {
			synchronized (client.anObject7226) {
				client.anObject7226.notify();
			}
		}
		return true;
	}

	void method4462(int i, byte i_148_) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method4463(Class329_Sub1 class329_sub1, byte[][] is, int i) {
		int i_149_ = is.length;
		for (int i_150_ = 0; i_150_ < i_149_; i_150_++) {
			byte[] is_151_ = is[i_150_];
			if (null != is_151_) {
				RsByteBuffer class282_sub35 = new RsByteBuffer(is_151_);
				int regionX = this.regionIds[i_150_] >> 8;
				int regionY = this.regionIds[i_150_] & 0xff;
				int x = regionX * 64 - 1948093437 * (this.coordGrid.x);
				int y = regionY * 64 - (this.coordGrid.y * -1002240017);
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(-1503224937);
				}
				class329_sub1.decodeTileMasks(class282_sub35, x, y, 1948093437 * this.coordGrid.x, -1002240017 * this.coordGrid.y, this.clipMaps, (byte) -77);
				class329_sub1.method12471(Renderers.SOFTWARE_RENDERER, class282_sub35, x, y, -885428044);
			}
		}
		for (int i_156_ = 0; i_156_ < i_149_; i_156_++) {
			int i_157_ = (64 * (this.regionIds[i_156_] >> 8) - this.coordGrid.x * 1948093437);
			int i_158_ = ((this.regionIds[i_156_] & 0xff) * 64 - this.coordGrid.y * -1002240017);
			byte[] is_159_ = is[i_156_];
			if (null == is_159_ && this.anInt3207 * -975658881 < 800) {
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(556095910);
				}
				class329_sub1.method5890(i_157_, i_158_, 64, 64, (byte) 45);
			}
		}
	}

	void method4464(Class329_Sub1 class329_sub1, byte[][] is, int i) {
		for (int i_160_ = 0; i_160_ < class329_sub1.anInt3845 * 1599084401; i_160_++) {
			if (!this.aBool3171) {
				Class282_Sub20_Sub24.method15391(-84440023);
			}
			for (int i_161_ = 0; i_161_ < this.sizeX * -2082656295 >> 3; i_161_++) {
				for (int i_162_ = 0; i_162_ < this.sizeY * 315871463 >> 3; i_162_++) {
					int i_163_ = (this.anIntArrayArrayArray3205[i_160_][i_161_][i_162_]);
					if (-1 != i_163_) {
						int i_164_ = i_163_ >> 24 & 0x3;
						if (!class329_sub1.aBool3786 || i_164_ == 0) {
							int i_165_ = i_163_ >> 1 & 0x3;
							int i_166_ = i_163_ >> 14 & 0x3ff;
							int i_167_ = i_163_ >> 3 & 0x7ff;
							int i_168_ = (i_166_ / 8 << 8) + i_167_ / 8;
							for (int i_169_ = 0; (i_169_ < this.regionIds.length); i_169_++) {
								if ((this.regionIds[i_169_] == i_168_) && null != is[i_169_]) {
									RsByteBuffer class282_sub35 = new RsByteBuffer(is[i_169_]);
									class329_sub1.method5841(class282_sub35, i_160_, i_161_ * 8, 8 * i_162_, i_164_, i_166_, i_167_, i_165_, this.clipMaps, 67301674);
									class329_sub1.method12460(Renderers.SOFTWARE_RENDERER, class282_sub35, i_160_, 8 * i_161_, i_162_ * 8, i_164_, i_166_, i_167_, i_165_, 46695829);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i_170_ = 0; i_170_ < class329_sub1.anInt3845 * 1599084401; i_170_++) {
			if (!this.aBool3171) {
				Class282_Sub20_Sub24.method15391(-1748836752);
			}
			for (int i_171_ = 0; i_171_ < this.sizeX * -2082656295 >> 3; i_171_++) {
				for (int i_172_ = 0; i_172_ < this.sizeY * 315871463 >> 3; i_172_++) {
					int i_173_ = (this.anIntArrayArrayArray3205[i_170_][i_171_][i_172_]);
					if (i_173_ == -1) {
						class329_sub1.method5838(i_170_, 8 * i_171_, i_172_ * 8, 8, 8, -1337783095);
					}
				}
			}
		}
	}

	void method4465(Class329_Sub1 class329_sub1, byte[][] is, int i) {
		int i_174_ = this.mapDataBuffer.length;
		for (int i_175_ = 0; i_175_ < i_174_; i_175_++) {
			byte[] is_176_ = is[i_175_];
			if (is_176_ != null) {
				int i_177_ = ((this.regionIds[i_175_] >> 8) * 64 - (this.coordGrid.x * 1948093437));
				int i_178_ = ((this.regionIds[i_175_] & 0xff) * 64 - (-1002240017 * this.coordGrid.y));
				if (!this.aBool3171) {
					Class282_Sub20_Sub24.method15391(-233080678);
				}
				class329_sub1.method12461(Renderers.SOFTWARE_RENDERER, is_176_, i_177_, i_178_, this.clipMaps, 1901261567);
				if (this.aBool3171) {
					method4462(10, (byte) -37);
				}
			}
		}
	}

	void decodeNPCSpawns(int i) {
		int regionCount = this.npcSpawnBuffer.length;
		for (int regionIdx = 0; regionIdx < regionCount; regionIdx++) {
			if (null != this.npcSpawnBuffer[regionIdx]) {
				int i_181_ = -1;
				for (int i_182_ = 0; i_182_ < -1021495055 * client.anInt7234; i_182_++) {
					if (this.regionIds[regionIdx] == client.anIntArray7228[i_182_]) {
						i_181_ = i_182_;
						break;
					}
				}
				if (-1 == i_181_) {
					client.anIntArray7228[client.anInt7234 * -1021495055] = this.regionIds[regionIdx];
					i_181_ = (client.anInt7234 += 474134545) * -1021495055 - 1;
				}
				RsByteBuffer stream = new RsByteBuffer(this.npcSpawnBuffer[regionIdx]);
				int i_183_ = 0;
				while ((stream.index * -1990677291 < this.npcSpawnBuffer[regionIdx].length) && i_183_ < 511 && client.anInt7211 * -685729279 < 1023) {
					int i_184_ = i_181_ | i_183_++ << 6;
					int i_185_ = stream.readUnsignedShort();
					int i_186_ = i_185_ >> 14;
					int i_187_ = i_185_ >> 7 & 0x3f;
					int i_188_ = i_185_ & 0x3f;
					int x = ((this.regionIds[regionIdx] >> 8) * 64 - (1948093437 * this.coordGrid.x) + i_187_);
					int y = (64 * (this.regionIds[regionIdx] & 0xff) - (this.coordGrid.y * -1002240017) + i_188_);
					NPCDefinitions npcDefs = (IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(stream.readUnsignedShort(), (byte) -4));
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754(i_184_));
					if (null == class282_sub47 && (npcDefs.aByte4900 & 0x1) > 0 && x >= 0 && (x + npcDefs.anInt4858 * 1203434505 < -2082656295 * this.sizeX) && y >= 0 && (npcDefs.anInt4858 * 1203434505 + y < this.sizeY * 315871463)) {
						NPC npc = (new NPC(this.sceneObjectManager));
						npc.anInt10314 = -1498872675 * i_184_;
						Class282_Sub47 class282_sub47_191_ = new Class282_Sub47(npc);
						client.aClass465_7208.method7765(class282_sub47_191_, i_184_);
						client.aClass282_Sub47Array7209[((client.anInt7210 += -1228117803) * 1658163325) - 1] = class282_sub47_191_;
						client.anIntArray7212[(client.anInt7211 += 1568892417) * -685729279 - 1] = i_184_;
						npc.anInt10353 = client.cycles * -537541873;
						npc.method16166(npcDefs, 2038282269);
						npc.method15836(1203434505 * (npc.aClass409_10580.anInt4858), (byte) -20);
						npc.anInt10340 = (-222526911 * (1913503455 * (npc.aClass409_10580.anInt4889) << 3));
						npc.method15791((npc.aClass409_10580.aClass252_4910.method4317((short) 18632).method243((byte) 1) << 11 & 0x3fff), true, (byte) -122);
						npc.method16159(i_186_, x, y, true, npc.getSize(828768449), -1215667141);
					}
				}
			}
		}
	}

	public void method4485(int i) {
		this.coordGrid = new CoordGrid();
		this.anInt3207 = 0;
		this.anInt3170 = 0;
	}

	void method4498(int i) {
		this.aClass256_3164 = this.aClass256_3163;
		method4456(Class106.aClass106_1075, -1398023418);
		for (int i_238_ = 0; i_238_ < 4; i_238_++) {
			for (int i_239_ = 0; i_239_ < -2082656295 * this.sizeX >> 3; i_239_++) {
				for (int i_240_ = 0; i_240_ < 315871463 * this.sizeY >> 3; i_240_++) {
					this.anIntArrayArrayArray3205[i_238_][i_239_][i_240_] = -1;
				}
			}
		}
		for (Class282_Sub2 class282_sub2 = (Class282_Sub2) Class86.aClass482_827.head((byte) 76); class282_sub2 != null; class282_sub2 = ((Class282_Sub2) Class86.aClass482_827.next(832197045))) {
			int i_241_ = -2049294537 * class282_sub2.anInt7486;
			boolean bool = 1 == (i_241_ & 0x1);
			int i_242_ = class282_sub2.anInt7479 * 1966632557 >> 3;
			int i_243_ = -1331660813 * class282_sub2.anInt7482 >> 3;
			int i_244_ = class282_sub2.anInt7480 * -141709603;
			int i_245_ = class282_sub2.anInt7483 * -1848312469;
			int i_246_ = class282_sub2.anInt7478 * 1325453341;
			int i_247_ = class282_sub2.anInt7481 * -1852461269;
			int i_248_ = 2090121559 * class282_sub2.anInt7484;
			int i_249_ = class282_sub2.anInt7485 * -1320761179;
			int i_250_ = 0;
			int i_251_ = 0;
			int i_252_ = 1;
			int i_253_ = 1;
			if (1 == i_241_) {
				i_251_ = i_248_ - 1;
				i_252_ = -1;
			} else if (i_241_ == 2) {
				i_251_ = i_248_ - 1;
				i_250_ = i_249_ - 1;
				i_252_ = -1;
				i_253_ = -1;
			} else if (i_241_ == 3) {
				i_250_ = i_249_ - 1;
				i_252_ = 1;
				i_253_ = -1;
			}
			int i_254_ = i_243_;
			while (i_254_ < i_249_ + i_243_) {
				int i_255_ = i_251_;
				int i_256_ = i_242_;
				while (i_256_ < i_248_ + i_242_) {
					if (bool) {
						this.anIntArrayArrayArray3205[i_247_][i_244_ + i_250_][i_255_ + i_245_] = ((i_256_ << 14) + (i_246_ << 24) + (i_254_ << 3) + (i_241_ << 1));
					} else {
						this.anIntArrayArrayArray3205[i_247_][i_255_ + i_244_][i_245_ + i_250_] = (i_241_ << 1) + ((i_254_ << 3) + ((i_256_ << 14) + (i_246_ << 24)));
					}
					i_256_++;
					i_255_ += i_252_;
				}
				i_254_++;
				i_250_ += i_253_;
			}
		}
		int i_257_ = NativeLibraryLoader.anIntArrayArray3239.length;
		this.regionIds = new int[i_257_];
		this.mapDataArchiveIds = new int[i_257_];
		this.landscapeDataArchiveIds = new int[i_257_];
		this.npcSpawnArchiveIds = null;
		this.mapDataBuffer = new byte[i_257_][];
		this.landscapeDataBuffer = new byte[i_257_][];
		this.npcSpawnBuffer = null;
		this.mapDataUnderlayArchiveIds = new int[i_257_];
		this.landscapeDataUnderlayArchiveIds = new int[i_257_];
		this.mapDataUnderlayBuffer = new byte[i_257_][];
		this.landscapeDataUnderlayBuffer = new byte[i_257_][];
		i_257_ = 0;
		for (Class282_Sub2 class282_sub2 = (Class282_Sub2) Class86.aClass482_827.head((byte) 29); class282_sub2 != null; class282_sub2 = ((Class282_Sub2) Class86.aClass482_827.next(2076366148))) {
			int i_258_ = 1966632557 * class282_sub2.anInt7479 >>> 3;
			int i_259_ = -1331660813 * class282_sub2.anInt7482 >>> 3;
			int i_260_ = 2090121559 * class282_sub2.anInt7484 + i_258_;
			if (0 == (i_260_ & 0x7)) {
				i_260_--;
			}
			i_260_ >>>= 3;
			int i_261_ = i_259_ + class282_sub2.anInt7485 * -1320761179;
			if ((i_261_ & 0x7) == 0) {
				i_261_--;
			}
			i_261_ >>>= 3;
			for (int i_262_ = i_258_ >>> 3; i_262_ <= i_260_; i_262_++) {
				while_78_: for (int i_263_ = i_259_ >>> 3; i_263_ <= i_261_; i_263_++) {
					int i_264_ = i_262_ << 8 | i_263_;
					for (int i_265_ = 0; i_265_ < i_257_; i_265_++) {
						if (this.regionIds[i_265_] == i_264_) {
							continue while_78_;
						}
					}
					this.regionIds[i_257_] = i_264_;
					this.mapDataArchiveIds[i_257_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, false, i_262_, i_263_, 522813814), 1557648612));
					this.landscapeDataArchiveIds[i_257_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, false, i_262_, i_263_, -511040069), -1519841497));
					this.mapDataUnderlayArchiveIds[i_257_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(true, true, i_262_, i_263_, -350569917), -115943179));
					this.landscapeDataUnderlayArchiveIds[i_257_] = (IndexLoaders.MAP_INDEX.getArchiveId(getArchiveName(false, true, i_262_, i_263_, 484092973), -402307347));
					i_257_++;
				}
			}
		}
		this.xteas = NativeLibraryLoader.anIntArrayArray3239;
		NativeLibraryLoader.anIntArrayArray3239 = null;
		method4458(-2082656295 * this.sizeX >> 4, this.sizeY * 315871463 >> 4, 18, false, 1473478915);
	}

	public void method4499(Class335 class335, int i) {
		this.aClass256_3163 = class335.aClass256_3915;
		if (Class256.aClass256_3154 == this.aClass256_3163) {
			method4422((byte) -92);
		} else if (this.aClass256_3163 == Class256.aClass256_3158) {
			method4452(class335.buffer);
		} else if (this.aClass256_3163 == Class256.aClass256_3153) {
			method4498(1176717163);
		} else if (this.aClass256_3163.method4410((byte) -13)) {
			method4439(class335.buffer, -220620310);
		}
	}

	public byte[][] method4507(int i, byte i_284_) {
		if (this.aClass329_Sub1_3167 != null && (this.aClass329_Sub1_3167.aByteArrayArrayArray3788 != null) && null != (this.aClass329_Sub1_3167.aByteArrayArrayArray3788[i])) {
			return (this.aClass329_Sub1_3167.aByteArrayArrayArray3788[i]);
		}
		return null;
	}

	public CoordGrid getCoordGrid(int i) {
		return this.coordGrid;
	}

	public int method4522(int i) {
		return -552598147 * this.zFar;
	}

	public MapRegion(boolean bool) {
		this.aBool3171 = bool;
	}

	public Class283 method4528(byte i) {
		return this.aClass283_3180;
	}

	public byte[][][] method4532(int i) {
		return this.aByteArrayArrayArray3162;
	}
	
	public int method4538(byte i) {
		return 100 - (this.anInt3191 * -1643613796 / (this.anInt3192 * -1112134077));
	}

	public int method4544(int i) {
		return -687713985 * this.anInt3177;
	}

	public void method4547(byte i) {
		if (this.aBool3171) {
			method4445((byte) -48);
			Class122.method2111(true, 662490589);
			MapRegion class257_406_ = IndexLoaders.MAP_REGION_DECODER;
			this.regionIds = class257_406_.regionIds;
			this.mapDataArchiveIds = class257_406_.mapDataArchiveIds;
			this.landscapeDataArchiveIds = class257_406_.landscapeDataArchiveIds;
			this.npcSpawnArchiveIds = class257_406_.npcSpawnArchiveIds;
			this.mapDataUnderlayArchiveIds = class257_406_.mapDataUnderlayArchiveIds;
			this.landscapeDataUnderlayArchiveIds = class257_406_.landscapeDataUnderlayArchiveIds;
			this.xteas = class257_406_.xteas;
			this.mapDataBuffer = class257_406_.mapDataBuffer;
			this.landscapeDataBuffer = class257_406_.landscapeDataBuffer;
			this.npcSpawnBuffer = class257_406_.npcSpawnBuffer;
			this.mapDataUnderlayBuffer = class257_406_.mapDataUnderlayBuffer;
			this.landscapeDataUnderlayBuffer = class257_406_.landscapeDataUnderlayBuffer;
			this.clipMaps = class257_406_.clipMaps;
			this.aClass311_3202 = class257_406_.aClass311_3202;
			this.aClass239_3175 = class257_406_.aClass239_3175;
			this.anIntArrayArrayArray3205 = class257_406_.anIntArrayArrayArray3205;
			this.anInt3177 = 1 * class257_406_.anInt3177;
			this.zFar = class257_406_.zFar * 1;
			this.aClass282_Sub50_Sub6_3176 = class257_406_.aClass282_Sub50_Sub6_3176;
			this.aClass283_3180 = class257_406_.aClass283_3180;
			this.anIntArrayArray3185 = class257_406_.anIntArrayArray3185;
			this.anIntArrayArray3186 = class257_406_.anIntArrayArray3186;
			this.aByteArrayArrayArray3162 = class257_406_.aByteArrayArrayArray3162;
			this.aClass256_3163 = class257_406_.aClass256_3163;
			this.aClass106_3165 = class257_406_.aClass106_3165;
			this.coordGrid = class257_406_.coordGrid;
			this.aClass219_3169 = class257_406_.aClass219_3169;
			this.anInt3170 = class257_406_.anInt3170 * 1;
			this.anInt3207 = 1 * class257_406_.anInt3207;
			this.sizeX = 1 * class257_406_.sizeX;
			this.sizeY = 1 * class257_406_.sizeY;
		} else if (5 == -1741204137 * client.anInt7166) {
			Class365.setGameState(11, 1377312199);
		} else if (-1741204137 * client.anInt7166 == 0) {
			Class365.setGameState(2, 1244371600);
		} else if (-1741204137 * client.anInt7166 == 7) {
			Class365.setGameState(6, 1707832511);
		} else if (13 == -1741204137 * client.anInt7166) {
			Class365.setGameState(18, 706362895);
		} else if (-1741204137 * client.anInt7166 == 3) {
			Class365.setGameState(9, 1330863416);
		}
	}

	public ClipMap getClipMap(int i, int i_429_) {
		return this.clipMaps[i];
	}

	static void method4556(CS2Executor class527, byte i) {
		class527.intStack[class527.intStackPtr * 1942118537 - 1] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[1942118537 * class527.intStackPtr - 1]), -1396181317).method4093(Class158_Sub1.aClass3_8507, client.anIntArray7337, 1568436027)) ? 1 : 0;
	}

	static final void method4557(CS2Executor class527, byte i) {
		class527.intStackPtr -= 425673003;
		Class42.method890((class527.intStack[1942118537 * class527.intStackPtr]), (class527.intStack[1 + class527.intStackPtr * 1942118537]), (class527.intStack[class527.intStackPtr * 1942118537 + 2]), (byte) -2);
	}

	static final void method4558(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = class513.aClass118_5886;
		Interface class98 = class513.aClass98_5885;
		Class13.method505(class118, class98, class527, (byte) 1);
	}

	static final boolean routeTo(int destX, int destY, boolean findAlternative, RouteStrategy strategy, int i_447_) {
		int srcX = Class84.myPlayer.regionBaseX[0];
		int srcY = Class84.myPlayer.regionBaseY[0];
		if (srcX < 0 || srcX >= IndexLoaders.MAP_REGION_DECODER.getSizeX(-988054561) || srcY < 0 || srcY >= IndexLoaders.MAP_REGION_DECODER.getSizeY(-525068831)) {
			return false;
		}
		if (destX < 0 || destX >= IndexLoaders.MAP_REGION_DECODER.getSizeX(-914892622) || destY < 0 || destY >= IndexLoaders.MAP_REGION_DECODER.getSizeY(-1924417648)) {
			return false;
		}
		int steps = Class112.findRoute(srcX, srcY, Class84.myPlayer.getSize(828768449), strategy, (IndexLoaders.MAP_REGION_DECODER.getClipMap((Class84.myPlayer.plane), 1801793645)), findAlternative, client.walkStepsX, client.walkStepsY, -1311698246);
		if (steps < 1) {
			return false;
		}
		Class187.anInt2361 = -134656021 * client.walkStepsX[steps - 1];
		Class187.anInt2359 = client.walkStepsY[steps - 1] * -818291313;
		Class187.aBool2360 = false;
		Class282_Sub20_Sub9.method15255((short) -9235);
		return true;
	}

	static final void method4560(CS2Executor class527, byte i) {
		class527.anInt7000 -= -1341717846;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (Class455.method7557((String) (class527.objectStack[class527.anInt7000 * 1806726141]), (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]), Class223.CURRENT_LANGUAGE, 1341608337));
	}

	static void method4561(int i, int i_451_, int i_452_, int i_453_, int i_454_, int i_455_, int i_456_) {
		int i_457_ = i_452_ + i_455_;
		int i_458_ = i_453_ - i_455_;
		for (int i_459_ = i_452_; i_459_ < i_457_; i_459_++) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_459_], i, i_451_, i_454_, (byte) -10);
		}
		for (int i_460_ = i_453_; i_460_ > i_458_; i_460_--) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_460_], i, i_451_, i_454_, (byte) -46);
		}
		int i_461_ = i + i_455_;
		int i_462_ = i_451_ - i_455_;
		for (int i_463_ = i_457_; i_463_ <= i_458_; i_463_++) {
			int[] is = Class532_Sub1.anIntArrayArray7072[i_463_];
			Class232.method3922(is, i, i_461_, i_454_, (byte) 79);
			Class232.method3922(is, i_462_, i_451_, i_454_, (byte) 31);
		}
	}

	static void method4562(int i, String string, int i_464_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(2, i);
		class282_sub50_sub12.method14995(860950307);
		class282_sub50_sub12.aString9640 = string;
	}

	static final void method4563(CS2Executor class527, short i) {
		int i_465_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Integer.toString(i_465_);
	}

	public static Class350 method4564(RsByteBuffer class282_sub35, int i) {
		Class350 class350 = Class383.method6512(class282_sub35, 88062096);
		int i_466_ = class282_sub35.readInt();
		int i_467_ = class282_sub35.readInt();
		int i_468_ = class282_sub35.readBigSmart();
		return new Class350_Sub1(class350.aClass356_4094, class350.aClass353_4087, class350.anInt4090 * -1967081549, class350.anInt4089 * -1196256967, 329542577 * class350.anInt4093, class350.anInt4088 * 323608093, -1921815535 * class350.anInt4092, 985690519 * class350.anInt4086, -771513131 * class350.anInt4091, i_466_, i_467_, i_468_);
	}
}
