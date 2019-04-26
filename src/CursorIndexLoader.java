import java.io.IOException;

public class CursorIndexLoader {

	SoftCache aClass229_5344 = new SoftCache(64);
	SoftCache aClass229_5342 = new SoftCache(2);
	Index configIndex;
	Index spritesIndex;

	public void method7324() {
		SoftCache softcache_2 = this.aClass229_5344;
		synchronized (this.aClass229_5344) {
			this.aClass229_5344.method3859(1982287383);
		}
		softcache_2 = this.aClass229_5342;
		synchronized (this.aClass229_5342) {
			this.aClass229_5342.method3859(378665676);
		}
	}

	public CursorDefintions method7325(int i_1) {
		SoftCache softcache_4 = this.aClass229_5344;
		CursorDefintions class419_3;
		synchronized (this.aClass229_5344) {
			class419_3 = (CursorDefintions) this.aClass229_5344.get((long) i_1);
		}
		if (class419_3 != null) {
			return class419_3;
		} else {
			Index index_5 = this.configIndex;
			byte[] bytes_10;
			synchronized (this.configIndex) {
				bytes_10 = this.configIndex.getFile(SharedConfigsType.CURSORS.id, i_1);
			}
			class419_3 = new CursorDefintions();
			class419_3.loader = this;
			if (bytes_10 != null) {
				class419_3.method7024(new RsByteBuffer(bytes_10));
			}
			SoftCache softcache_9 = this.aClass229_5344;
			synchronized (this.aClass229_5344) {
				this.aClass229_5344.put(class419_3, (long) i_1);
				return class419_3;
			}
		}
	}

	public void method7326() {
		SoftCache softcache_3 = this.aClass229_5344;
		synchronized (this.aClass229_5344) {
			this.aClass229_5344.method3858(5, (byte) -55);
		}
		softcache_3 = this.aClass229_5342;
		synchronized (this.aClass229_5342) {
			this.aClass229_5342.method3858(5, (byte) 18);
		}
	}

	public void method7327() {
		SoftCache softcache_2 = this.aClass229_5344;
		synchronized (this.aClass229_5344) {
			this.aClass229_5344.method3863(1594658345);
		}
		softcache_2 = this.aClass229_5342;
		synchronized (this.aClass229_5342) {
			this.aClass229_5342.method3863(725307198);
		}
	}

	public CursorIndexLoader(Game game_1, Language xlanguage_2, Index index_3, Index index_4) {
		this.configIndex = index_3;
		this.spritesIndex = index_4;
		this.configIndex.filesCount(SharedConfigsType.CURSORS.id);
	}

	public static final void method7333(boolean bool_0, int i_1) {
		BufferedConnectionContext[] arr_2 = client.aClass184Array7220;
		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			BufferedConnectionContext class184_4 = arr_2[i_3];
			try {
				class184_4.method3047(1513639473);
			} catch (IOException ioexception_8) {
				;
			}
			class184_4.method3051((byte) -59);
		}
		JS5StandardRequester.method5558();
		Class356.method6227(false, (byte) -48);
		IndexLoaders.MAP_REGION_DECODER.method4444(1869336559);
		IndexLoaders.MAP_REGION_DECODER.method4485(-756888037);
		Class122.method2111(false);
		Class358.method6240(1510969650);
		Class260.anInt3223 = -1;
		Class260.aBool3220 = false;
		Preference_Sub6.method12658(-111108219);
		ClipMap.method6008(true);
		Class459.method7678(-1273832193);
		Class204.method3367();
		Class42_Sub1.method14562(1915286568);
		if (bool_0) {
			Class365.setGameState(12);
		} else {
			Class365.setGameState(5);
			try {
				Class441.method7377(Node_Sub44.anApplet8065, "loggedout", 1769975690);
			} catch (Throwable throwable_7) {
				;
			}
		}
	}

	static void method7335(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, boolean bool_14) {
		if (i_1 != 0 && i_3 != -1) {
			Object obj_16 = null;
			int i_17;
			if (i_1 < 0) {
				i_17 = -i_1 - 1;
				if (i_17 == client.anInt7315) {
					obj_16 = VertexNormal.myPlayer;
				} else {
					obj_16 = client.players[i_17];
				}
			} else {
				i_17 = i_1 - 1;
				StringNode class282_sub47_18 = (StringNode) client.NPCS.get((long) i_17);
				if (class282_sub47_18 != null) {
					obj_16 = (Animable) class282_sub47_18.anObject8068;
				}
			}
			if (obj_16 != null) {
				RenderAnimDefs renderanimdefs_19 = ((Animable) obj_16).getRenderAnimDefs();
				if (renderanimdefs_19.anIntArrayArray2802 != null && renderanimdefs_19.anIntArrayArray2802[i_3] != null) {
					i_4 -= renderanimdefs_19.anIntArrayArray2802[i_3][1];
				}
				if (renderanimdefs_19.anIntArrayArray2791 != null && renderanimdefs_19.anIntArrayArray2791[i_3] != null) {
					i_4 -= renderanimdefs_19.anIntArrayArray2791[i_3][1];
				}
			}
		}
		Transform_Sub1_Sub1_Sub3 class521_sub1_sub1_sub3_20 = new Transform_Sub1_Sub1_Sub3(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), i_0, Class272.anInt3331, Class272.anInt3331, i_6, i_7, i_4, i_10 + client.cycles, i_11 + client.cycles, i_12, i_13, i_1, i_2, i_5, bool_14, i_3);
		class521_sub1_sub1_sub3_20.method15904(i_8, i_9, Class504.method8389(i_8, i_9, Class272.anInt3331, (byte) 65) - i_5, i_10 + client.cycles);
		client.aClass482_7333.append(new CacheableNode_Sub16(class521_sub1_sub1_sub3_20));
	}
}
