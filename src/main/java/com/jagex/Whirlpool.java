package com.jagex;

public class Whirlpool {

	public static JS5LocalRequester JS5_LOCAL_REQUESTER;

	static long[][] aLongArrayArray5367 = new long[8][256];

	static long[] aLongArray5366 = new long[11];

	static {
		int i_0;
		for (int i = 0; i < 256; i++) {
			int i_73_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".charAt(i / 2);
			long l = ((i & 0x1) == 0 ? (i_73_ >>> 8) : (i_73_ & 0xff));
			long l_74_ = l << 1;
			if (l_74_ >= 256L)
				l_74_ ^= 0x11dL;
			long l_75_ = l_74_ << 1;
			if (l_75_ >= 256L)
				l_75_ ^= 0x11dL;
			long l_76_ = l_75_ ^ l;
			long l_77_ = l_75_ << 1;
			if (l_77_ >= 256L)
				l_77_ ^= 0x11dL;
			long l_78_ = l_77_ ^ l;
			aLongArrayArray5367[0][i] = (l << 56 | l << 48 | l_75_ << 40 | l << 32 | l_77_ << 24 | l_76_ << 16 | l_74_ << 8 | l_78_);
			for (int i_79_ = 1; i_79_ < 8; i_79_++)
				aLongArrayArray5367[i_79_][i] = (aLongArrayArray5367[i_79_ - 1][i] >>> 8 | aLongArrayArray5367[i_79_ - 1][i] << 56);
		}
		aLongArray5366[0] = 0L;
		for (i_0 = 1; i_0 <= 10; i_0++) {
			int i_15 = (i_0 - 1) * 8;
			aLongArray5366[i_0] = aLongArrayArray5367[0][i_15] & -72057594037927936L ^ aLongArrayArray5367[1][i_15 + 1] & 0xff000000000000L ^ aLongArrayArray5367[2][i_15 + 2] & 0xff0000000000L ^ aLongArrayArray5367[3][i_15 + 3] & 0xff00000000L ^ aLongArrayArray5367[4][i_15 + 4] & 0xff000000L ^ aLongArrayArray5367[5][i_15 + 5] & 0xff0000L ^ aLongArrayArray5367[6][i_15 + 6] & 0xff00L ^ aLongArrayArray5367[7][i_15 + 7] & 0xffL;
		}
	}

	static void applyDebugOpcode(int id) {
		if (id == 17)
			throw new Error();
		if (id == 25)
			throw new OutOfMemoryError();
		else
			try {
				if (id == 8)
					FriendsChatPlayer.method2944();
				else if (id == 24)
					Class209.printConsoleMessage("" + Engine.FPS);
				else if (id == 28) {
					Class201 class201_2 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aClass201_2600;
					class201_2.aBool2552 = !class201_2.aBool2552;
				} else if (id == 7)
					client.DRAW_DEBUG = true;
				else if (id == 4)
					client.DRAW_DEBUG = false;
				else if (id == 14)
					client.aClass457_7335.method7651();
				else {
					int i_3;
					int i_5;
					Runtime runtime_7;
					if (id == 21) {
						Class357_Sub1.method12565();
						for (i_5 = 0; i_5 < 10; i_5++)
							System.gc();
						runtime_7 = Runtime.getRuntime();
						i_3 = (int) ((runtime_7.totalMemory() - runtime_7.freeMemory()) / 1024L);
						Class209.printConsoleMessage("" + i_3);
					} else if (id == 9) {
						Class357_Sub1.method12565();
						for (i_5 = 0; i_5 < 10; i_5++)
							System.gc();
						runtime_7 = Runtime.getRuntime();
						i_3 = (int) ((runtime_7.totalMemory() - runtime_7.freeMemory()) / 1024L);
						Class209.printConsoleMessage("" + i_3);
						JS5CacheFile.method3359();
						Class357_Sub1.method12565();
						for (int i_4 = 0; i_4 < 10; i_4++)
							System.gc();
						i_3 = (int) ((runtime_7.totalMemory() - runtime_7.freeMemory()) / 1024L);
						Class209.printConsoleMessage("" + i_3);
					} else if (id == 19)
						Class209.printConsoleMessage(IndexLoaders.NATIVE_LIBRARY_LOADER.unload() ? "Success" : "Failure");
					else if (id == 20)
						ConnectionInfo.GAME_CONNECTION_INFO.swap();
					else if (id == 22)
						Class119.JS5_STANDARD_REQUESTER.method5525();
					else if (id == 3)
						Class119.JS5_STANDARD_REQUESTER.method5526();
					else if (id == 13)
						Class351.gameCanvas.setLocation(50, 50);
					else if (id == 1)
						Class351.gameCanvas.setLocation(Engine.GAME_CANVAS_X, Engine.GAME_CANVAS_Y);
					else if (id == 27)
						Preference.method7789();
					else if (id == 6) {
						IndexLoaders.MAP_REGION_DECODER.aLong3183 = Utils.time();
						IndexLoaders.MAP_REGION_DECODER.aBool3206 = true;
						Preference.method7789();
					} else {
						Vector3 vector3_8;
						if (id == 26) {
							vector3_8 = VertexNormal.MY_PLAYER.method11166().coords;
							Class209.printConsoleMessage(((int) vector3_8.x >> 9) + " " + ((int) vector3_8.z >> 9));
						} else if (id == 2) {
							vector3_8 = VertexNormal.MY_PLAYER.method11166().coords;
							Class209.printConsoleMessage("" + IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aGroundArray2591[VertexNormal.MY_PLAYER.plane].getHeight((int) vector3_8.x >> 9, (int) vector3_8.z >> 9));
						} else if (id == 23) {
							Class209.printConsoleMessage(IComponentDefinitions.aClass229_1280.method3861() + " " + IComponentDefinitions.aClass229_1280.method3860());
							Class209.printConsoleMessage(IComponentDefinitions.aClass229_1341.method3861() + " " + IComponentDefinitions.aClass229_1341.method3860());
							Class209.printConsoleMessage(IndexLoaders.ITEM_LOADER.nativeSpriteCache.method3640() + " " + IndexLoaders.ITEM_LOADER.nativeSpriteCache.method3632());
						} else if (id == 16)
							Class356.method6227(false);
						else if (id == 15) {
							client.aBool7177 = !client.aBool7177;
							Renderers.CURRENT_RENDERER.method8480();
							Node_Sub14.method12222();
						} else if (id == 10) {
							client.anInt7240 = 0;
							IndexLoaders.MAP_REGION_DECODER.method4547();
						} else if (id == 5) {
							client.anInt7240 = 1;
							IndexLoaders.MAP_REGION_DECODER.method4547();
						} else if (id == 29) {
							client.anInt7240 = 2;
							IndexLoaders.MAP_REGION_DECODER.method4547();
						}
					}
				}
			} catch (Exception exception_6) {
				exception_6.printStackTrace();
				Class209.printConsoleMessage(LocalizedText.ERROR_EXECUTING_COMMAND.translate(Class223.CURRENT_LANGUAGE));
			}
	}
	int anInt5370;
	int anInt5369;
	byte[] aByteArray5375 = new byte[32];
	byte[] aByteArray5368 = new byte[64];
	long[] aLongArray5361 = new long[8];
	long[] aLongArray5372 = new long[8];
	long[] aLongArray5374 = new long[8];
	long[] aLongArray5365 = new long[8];

	long[] aLongArray5373 = new long[8];

	void method7406() {
		int i_2;
		for (i_2 = 0; i_2 < 32; i_2++)
			aByteArray5375[i_2] = 0;
		anInt5370 = 0;
		anInt5369 = 0;
		aByteArray5368[0] = 0;
		for (i_2 = 0; i_2 < 8; i_2++)
			aLongArray5361[i_2] = 0L;
	}

	void method7407(byte[] bytes_1, long long_2) {
		int i_4 = 0;
		int i_5 = 8 - ((int) long_2 & 0x7) & 0x7;
		int i_6 = anInt5369 & 0x7;
		long long_7 = long_2;
		int i_9 = 31;
		for (int i_10 = 0; i_9 >= 0; --i_9) {
			i_10 += (aByteArray5375[i_9] & 0xff) + ((int) long_7 & 0xff);
			aByteArray5375[i_9] = (byte) i_10;
			i_10 >>>= 8;
			long_7 >>>= 8;
		}
		int i_11;
		while (long_2 > 8L) {
			i_11 = bytes_1[i_4] << i_5 & 0xff | (bytes_1[i_4 + 1] & 0xff) >>> 8 - i_5;
			if (i_11 < 0 || i_11 >= 256)
				throw new RuntimeException();
			aByteArray5368[anInt5370 * 1101767573 * -1706520643] |= i_11 >>> i_6;
			++anInt5370;
			anInt5369 += 8 - i_6;
			if (anInt5369 == 512) {
				method7410();
				anInt5370 = 0;
				anInt5369 = 0;
			}
			aByteArray5368[anInt5370] = (byte) (i_11 << 8 - i_6 & 0xff);
			anInt5369 += i_6;
			long_2 -= 8L;
			++i_4;
		}
		if (long_2 > 0L) {
			i_11 = bytes_1[i_4] << i_5 & 0xff;
			aByteArray5368[-1706520643 * anInt5370 * 1101767573] |= i_11 >>> i_6;
		} else
			i_11 = 0;
		if (i_6 + long_2 < 8L)
			anInt5369 = (int) ((anInt5369 * -391087605) + long_2 * -391087605L) * 1189134755;
		else {
			++anInt5370;
			anInt5369 += 8 - i_6;
			long_2 -= 8 - i_6;
			if (anInt5369 == 512) {
				method7410();
				anInt5370 = 0;
				anInt5369 = 0;
			}
			aByteArray5368[anInt5370] = (byte) (i_11 << 8 - i_6 & 0xff);
			anInt5369 += (int) long_2;
		}
	}

	void method7408(byte[] bytes_1) {
		aByteArray5368[anInt5370 * 1101767573 * -1706520643] |= 128 >>> (anInt5369 & 0x7);
			++anInt5370;
			if (anInt5370 > 32)
				while (true) {
					if (anInt5370 >= 64) {
						method7410();
						anInt5370 = 0;
						break;
					}
					aByteArray5368[++anInt5370 - 1] = 0;
				}
			while (anInt5370 < 32)
				aByteArray5368[++anInt5370 - 1] = 0;
			System.arraycopy(aByteArray5375, 0, aByteArray5368, 32, 32);
			method7410();
			int i_4 = 0;
			for (int i_5 = 0; i_4 < 8; i_5 += 8) {
				long long_6 = aLongArray5361[i_4];
				bytes_1[i_5] = (byte) ((int) (long_6 >>> 56));
				bytes_1[i_5 + 1] = (byte) ((int) (long_6 >>> 48));
				bytes_1[i_5 + 2] = (byte) ((int) (long_6 >>> 40));
				bytes_1[i_5 + 3] = (byte) ((int) (long_6 >>> 32));
				bytes_1[i_5 + 4] = (byte) ((int) (long_6 >>> 24));
				bytes_1[i_5 + 5] = (byte) ((int) (long_6 >>> 16));
				bytes_1[i_5 + 6] = (byte) ((int) (long_6 >>> 8));
				bytes_1[i_5 + 7] = (byte) ((int) long_6);
				++i_4;
			}
	}

	void method7410() {
		int i_2 = 0;
		int i_3;
		for (i_3 = 0; i_2 < 8; i_3 += 8) {
			aLongArray5365[i_2] = (long) aByteArray5368[i_3] << 56 ^ (aByteArray5368[i_3 + 1] & 0xffL) << 48 ^ (aByteArray5368[i_3 + 2] & 0xffL) << 40 ^ (aByteArray5368[i_3 + 3] & 0xffL) << 32 ^ (aByteArray5368[i_3 + 4] & 0xffL) << 24 ^ (aByteArray5368[i_3 + 5] & 0xffL) << 16 ^ (aByteArray5368[i_3 + 6] & 0xffL) << 8 ^ aByteArray5368[i_3 + 7] & 0xffL;
			++i_2;
		}
		for (i_2 = 0; i_2 < 8; i_2++)
			aLongArray5373[i_2] = aLongArray5365[i_2] ^ (aLongArray5372[i_2] = aLongArray5361[i_2]);
		for (i_2 = 1; i_2 <= 10; i_2++) {
			int i_4;
			int i_5;
			for (i_3 = 0; i_3 < 8; i_3++) {
				aLongArray5374[i_3] = 0L;
				i_4 = 0;
				for (i_5 = 56; i_4 < 8; i_5 -= 8) {
					aLongArray5374[i_3] ^= aLongArrayArray5367[i_4][(int) (aLongArray5372[i_3 - i_4 & 0x7] >>> i_5) & 0xff];
					++i_4;
				}
			}
			for (i_3 = 0; i_3 < 8; i_3++)
				aLongArray5372[i_3] = aLongArray5374[i_3];
			aLongArray5372[0] ^= aLongArray5366[i_2];
			for (i_3 = 0; i_3 < 8; i_3++) {
				aLongArray5374[i_3] = aLongArray5372[i_3];
				i_4 = 0;
				for (i_5 = 56; i_4 < 8; i_5 -= 8) {
					aLongArray5374[i_3] ^= aLongArrayArray5367[i_4][(int) (aLongArray5373[i_3 - i_4 & 0x7] >>> i_5) & 0xff];
					++i_4;
				}
			}
			for (i_3 = 0; i_3 < 8; i_3++)
				aLongArray5373[i_3] = aLongArray5374[i_3];
		}
		for (i_2 = 0; i_2 < 8; i_2++)
			aLongArray5361[i_2] ^= aLongArray5373[i_2] ^ aLongArray5365[i_2];
	}
}
