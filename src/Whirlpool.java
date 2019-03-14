public class Whirlpool {

	public static JS5LocalRequester JS5_LOCAL_REQUESTER;

	static long[][] aLongArrayArray5367 = new long[8][256];

	static long[] aLongArray5366 = new long[11];

	int anInt5370 = 0;

	int anInt5369 = 0;

	byte[] aByteArray5375 = new byte[32];

	byte[] aByteArray5368 = new byte[64];

	long[] aLongArray5361 = new long[8];

	long[] aLongArray5372 = new long[8];

	long[] aLongArray5374 = new long[8];

	long[] aLongArray5365 = new long[8];

	long[] aLongArray5373 = new long[8];

	static {
		int i_0;
		for (int i = 0; i < 256; i++) {
			int i_73_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".charAt(i / 2);
			long l = (0 == (i & 0x1) ? (long) (i_73_ >>> 8) : (long) (i_73_ & 0xff));
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
			aLongArray5366[i_0] = aLongArrayArray5367[0][i_15] & ~0xffffffffffffffL ^ aLongArrayArray5367[1][i_15 + 1] & 0xff000000000000L ^ aLongArrayArray5367[2][i_15 + 2] & 0xff0000000000L ^ aLongArrayArray5367[3][i_15 + 3] & 0xff00000000L ^ aLongArrayArray5367[4][i_15 + 4] & 0xff000000L ^ aLongArrayArray5367[5][i_15 + 5] & 0xff0000L ^ aLongArrayArray5367[6][i_15 + 6] & 0xff00L ^ aLongArrayArray5367[7][i_15 + 7] & 0xffL;
		}
	}

	void method7406(int i_1) {
		int i_2;
		for (i_2 = 0; i_2 < 32; i_2++) {
			this.aByteArray5375[i_2] = 0;
		}
		this.anInt5370 = 0;
		this.anInt5369 = 0;
		this.aByteArray5368[0] = 0;
		for (i_2 = 0; i_2 < 8; i_2++) {
			this.aLongArray5361[i_2] = 0L;
		}
	}

	void method7407(byte[] bytes_1, long long_2) {
		int i_4 = 0;
		int i_5 = 8 - ((int) long_2 & 0x7) & 0x7;
		int i_6 = this.anInt5369 & 0x7;
		long long_7 = long_2;
		int i_9 = 31;
		for (int i_10 = 0; i_9 >= 0; --i_9) {
			i_10 = i_10 + (this.aByteArray5375[i_9] & 0xff) + ((int) long_7 & 0xff);
			this.aByteArray5375[i_9] = (byte) i_10;
			i_10 >>>= 8;
			long_7 >>>= 8;
		}
		int i_11;
		while (long_2 > 8L) {
			i_11 = bytes_1[i_4] << i_5 & 0xff | (bytes_1[i_4 + 1] & 0xff) >>> 8 - i_5;
			if (i_11 < 0 || i_11 >= 256) {
				throw new RuntimeException();
			}
			this.aByteArray5368[this.anInt5370 * 1101767573 * -1706520643] = (byte) (this.aByteArray5368[this.anInt5370 * 1101767573 * -1706520643] | i_11 >>> i_6);
			++this.anInt5370;
			this.anInt5369 += 8 - i_6;
			if (this.anInt5369 == 512) {
				this.method7410((byte) -75);
				this.anInt5370 = 0;
				this.anInt5369 = 0;
			}
			this.aByteArray5368[this.anInt5370] = (byte) (i_11 << 8 - i_6 & 0xff);
			this.anInt5369 += i_6;
			long_2 -= 8L;
			++i_4;
		}
		if (long_2 > 0L) {
			i_11 = bytes_1[i_4] << i_5 & 0xff;
			this.aByteArray5368[-1706520643 * this.anInt5370 * 1101767573] = (byte) (this.aByteArray5368[-1706520643 * this.anInt5370 * 1101767573] | i_11 >>> i_6);
		} else {
			i_11 = 0;
		}
		if ((long) i_6 + long_2 < 8L) {
			this.anInt5369 = (int) ((long) (this.anInt5369 * -391087605) + long_2 * -391087605L) * 1189134755;
		} else {
			++this.anInt5370;
			this.anInt5369 += 8 - i_6;
			long_2 -= (long) (8 - i_6);
			if (this.anInt5369 == 512) {
				this.method7410((byte) -85);
				this.anInt5370 = 0;
				this.anInt5369 = 0;
			}
			this.aByteArray5368[this.anInt5370] = (byte) (i_11 << 8 - i_6 & 0xff);
			this.anInt5369 += (int) long_2;
		}
	}

	void method7408(byte[] bytes_1, int i_2, int i_3) {
		this.aByteArray5368[this.anInt5370 * 1101767573 * -1706520643] = (byte) (this.aByteArray5368[this.anInt5370 * 1101767573 * -1706520643] | 128 >>> (this.anInt5369 & 0x7));
		++this.anInt5370;
		if (this.anInt5370 > 32) {
			while (true) {
				if (this.anInt5370 >= 64) {
					this.method7410((byte) -28);
					this.anInt5370 = 0;
					break;
				}
				this.aByteArray5368[++this.anInt5370 - 1] = 0;
			}
		}
		while (this.anInt5370 < 32) {
			this.aByteArray5368[++this.anInt5370 - 1] = 0;
		}
		System.arraycopy(this.aByteArray5375, 0, this.aByteArray5368, 32, 32);
		this.method7410((byte) -57);
		int i_4 = 0;
		for (int i_5 = i_2; i_4 < 8; i_5 += 8) {
			long long_6 = this.aLongArray5361[i_4];
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

	void method7410(byte b_1) {
		int i_2 = 0;
		int i_3;
		for (i_3 = 0; i_2 < 8; i_3 += 8) {
			this.aLongArray5365[i_2] = (long) this.aByteArray5368[i_3] << 56 ^ ((long) this.aByteArray5368[i_3 + 1] & 0xffL) << 48 ^ ((long) this.aByteArray5368[i_3 + 2] & 0xffL) << 40 ^ ((long) this.aByteArray5368[i_3 + 3] & 0xffL) << 32 ^ ((long) this.aByteArray5368[i_3 + 4] & 0xffL) << 24 ^ ((long) this.aByteArray5368[i_3 + 5] & 0xffL) << 16 ^ ((long) this.aByteArray5368[i_3 + 6] & 0xffL) << 8 ^ (long) this.aByteArray5368[i_3 + 7] & 0xffL;
			++i_2;
		}
		for (i_2 = 0; i_2 < 8; i_2++) {
			this.aLongArray5373[i_2] = this.aLongArray5365[i_2] ^ (this.aLongArray5372[i_2] = this.aLongArray5361[i_2]);
		}
		for (i_2 = 1; i_2 <= 10; i_2++) {
			int i_4;
			int i_5;
			for (i_3 = 0; i_3 < 8; i_3++) {
				this.aLongArray5374[i_3] = 0L;
				i_4 = 0;
				for (i_5 = 56; i_4 < 8; i_5 -= 8) {
					this.aLongArray5374[i_3] ^= aLongArrayArray5367[i_4][(int) (this.aLongArray5372[i_3 - i_4 & 0x7] >>> i_5) & 0xff];
					++i_4;
				}
			}
			for (i_3 = 0; i_3 < 8; i_3++) {
				this.aLongArray5372[i_3] = this.aLongArray5374[i_3];
			}
			this.aLongArray5372[0] ^= aLongArray5366[i_2];
			for (i_3 = 0; i_3 < 8; i_3++) {
				this.aLongArray5374[i_3] = this.aLongArray5372[i_3];
				i_4 = 0;
				for (i_5 = 56; i_4 < 8; i_5 -= 8) {
					this.aLongArray5374[i_3] ^= aLongArrayArray5367[i_4][(int) (this.aLongArray5373[i_3 - i_4 & 0x7] >>> i_5) & 0xff];
					++i_4;
				}
			}
			for (i_3 = 0; i_3 < 8; i_3++) {
				this.aLongArray5373[i_3] = this.aLongArray5374[i_3];
			}
		}
		for (i_2 = 0; i_2 < 8; i_2++) {
			this.aLongArray5361[i_2] ^= this.aLongArray5373[i_2] ^ this.aLongArray5365[i_2];
		}
	}

	static void method7421(int i_0, int i_1) {
		if (i_0 == 17) {
			throw new Error();
		} else if (i_0 == 25) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (i_0 == 8) {
					Class173.method2944(-1950066116);
				} else if (i_0 == 24) {
					Class209.printConsoleMessage("" + Engine.FPS, -1823674146);
				} else if (i_0 == 28) {
					Class201 class201_2 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1512240603).aClass201_2600;
					class201_2.aBool2552 = !class201_2.aBool2552;
				} else if (i_0 == 7) {
					client.aBool7176 = true;
				} else if (i_0 == 4) {
					client.aBool7176 = false;
				} else if (i_0 == 14) {
					client.aClass457_7335.method7651((byte) 5);
				} else {
					int i_3;
					int i_5;
					Runtime runtime_7;
					if (i_0 == 21) {
						Class357_Sub1.method12565(-1890847709);
						for (i_5 = 0; i_5 < 10; i_5++) {
							System.gc();
						}
						runtime_7 = Runtime.getRuntime();
						i_3 = (int) ((runtime_7.totalMemory() - runtime_7.freeMemory()) / 1024L);
						Class209.printConsoleMessage("" + i_3, -1844000265);
					} else if (i_0 == 9) {
						Class357_Sub1.method12565(-1890847709);
						for (i_5 = 0; i_5 < 10; i_5++) {
							System.gc();
						}
						runtime_7 = Runtime.getRuntime();
						i_3 = (int) ((runtime_7.totalMemory() - runtime_7.freeMemory()) / 1024L);
						Class209.printConsoleMessage("" + i_3, -1847953573);
						JS5CacheFile.method3359(-1275511493);
						Class357_Sub1.method12565(-1890847709);
						for (int i_4 = 0; i_4 < 10; i_4++) {
							System.gc();
						}
						i_3 = (int) ((runtime_7.totalMemory() - runtime_7.freeMemory()) / 1024L);
						Class209.printConsoleMessage("" + i_3, -1441723190);
					} else if (i_0 == 19) {
						Class209.printConsoleMessage(IndexLoaders.NATIVE_LIBRARY_LOADER.method219(-1916862873) ? "Success" : "Failure", -1724537176);
					} else if (i_0 == 20) {
						Class159.GAME_CONNECTION_INFO.swap(-799490388);
					} else if (i_0 == 22) {
						Class119.JS5_STANDARD_REQUESTER.method5525(-115621470);
					} else if (i_0 == 3) {
						Class119.JS5_STANDARD_REQUESTER.method5526(-1851671444);
					} else if (i_0 == 13) {
						Class351.gameCanvas.setLocation(50, 50);
					} else if (i_0 == 1) {
						Class351.gameCanvas.setLocation(Engine.anInt3250, Engine.anInt3251);
					} else if (i_0 == 27) {
						Preference.method7789(-838440375);
					} else if (i_0 == 6) {
						IndexLoaders.MAP_REGION_DECODER.aLong3183 = Class169.time();
						IndexLoaders.MAP_REGION_DECODER.aBool3206 = true;
						Preference.method7789(620089057);
					} else {
						Vector3 vector3_8;
						if (i_0 == 26) {
							vector3_8 = Class84.myPlayer.method11166().aClass385_3595;
							Class209.printConsoleMessage(((int) vector3_8.x >> 9) + " " + ((int) vector3_8.z >> 9), -1980423440);
						} else if (i_0 == 2) {
							vector3_8 = Class84.myPlayer.method11166().aClass385_3595;
							Class209.printConsoleMessage("" + IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1116166565).aClass390Array2591[Class84.myPlayer.plane].method6722((int) vector3_8.x >> 9, (int) vector3_8.z >> 9, 65280), -1193762995);
						} else if (i_0 == 23) {
							Class209.printConsoleMessage(IComponentDefinitions.aClass229_1280.method3861((byte) 1) + " " + IComponentDefinitions.aClass229_1280.method3860((byte) 53), -622119201);
							Class209.printConsoleMessage(IComponentDefinitions.aClass229_1341.method3861((byte) 1) + " " + IComponentDefinitions.aClass229_1341.method3860((byte) 119), -632491603);
							Class209.printConsoleMessage(IndexLoaders.ITEM_INDEX_LOADER.aClass212_5114.method3640() + " " + IndexLoaders.ITEM_INDEX_LOADER.aClass212_5114.method3632(), -1389047879);
						} else if (i_0 == 16) {
							Class356.method6227(false, (byte) 37);
						} else if (i_0 == 15) {
							client.aBool7177 = !client.aBool7177;
							Renderers.SOFTWARE_RENDERER.method8480(client.aBool7177);
							Class282_Sub14.method12222(-1129309560);
						} else if (i_0 == 10) {
							client.anInt7240 = 0;
							IndexLoaders.MAP_REGION_DECODER.method4547((byte) -123);
						} else if (i_0 == 5) {
							client.anInt7240 = 1;
							IndexLoaders.MAP_REGION_DECODER.method4547((byte) -69);
						} else if (i_0 == 29) {
							client.anInt7240 = 2;
							IndexLoaders.MAP_REGION_DECODER.method4547((byte) -47);
						}
					}
				}
			} catch (Exception exception_6) {
				Class209.printConsoleMessage(Message.ERROR_EXECUTING_COMMAND.translate(Class223.CURRENT_LANGUAGE, -1843715069), -915823010);
			}
		}
	}
}
