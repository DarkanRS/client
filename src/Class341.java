/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class341 {
	public int gameSceneBaseX;
	public int gameSceneBaseY;
	public int anInt3645;
	public static Class243 aClass243_3646;

	public Class341(int i, int i_0_, int i_1_) {
		anInt3645 = i * 1306643131;
		gameSceneBaseX = i_0_ * 2061281455;
		gameSceneBaseY = 1901982267 * i_1_;
	}

	public Class341(int i) {
		if (-1 == i)
			anInt3645 = -1306643131;
		else {
			anInt3645 = (i >> 28 & 0x3) * 1306643131;
			gameSceneBaseX = (i >> 14 & 0x3fff) * 2061281455;
			gameSceneBaseY = (i & 0x3fff) * 1901982267;
		}
	}

	public String toString() {
		try {
			return new StringBuilder().append(anInt3645 * 1008331379).append(",").append(-1760580017 * gameSceneBaseX >> 6).append(",").append(283514611 * gameSceneBaseY >> 6).append(",").append(-1760580017 * gameSceneBaseX & 0x3f).append(",").append(283514611 * gameSceneBaseY & 0x3f).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.toString(").append(')').toString());
		}
	}

	public Class341() {
		anInt3645 = -1306643131;
	}

	static final void method4137(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) -13);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -749038817 * class105.anInt1155;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.qq(").append(')').toString());
		}
	}

	static final void method4138(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_3_, (byte) -35);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1223 * -1993792969;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.rl(").append(')').toString());
		}
	}

	static final void method4139(ClientScript2 class403, int i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (client.anInt8942 * 1131012101 == 2 && i_4_ < client.anInt8941 * -1054937867)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = client.aBooleanArray8950[i_4_] ? 1 : 0;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.we(").append(')').toString());
		}
	}

	static final void method4140(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_5_ >> 14 & 0x3fff;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.tj(").append(')').toString());
		}
	}

	static final void method4141(Entity class365_sub1_sub1_sub2, boolean bool, int i) {
		try {
			Class350 class350 = class365_sub1_sub1_sub2.method4426(1203863612);
			if (2050671733 * class365_sub1_sub1_sub2.anInt10120 == 0) {
				class365_sub1_sub1_sub2.anInt10124 = 0;
				Class331.anInt3565 = Class282.aClass282_6543.aByte6542 * -2059464589;
				Class431.anInt6504 = 0;
			} else {
				if (class365_sub1_sub1_sub2.aClass438_10078.method5819((byte) -91) && !class365_sub1_sub1_sub2.aClass438_10078.method5826(-65534)) {
					Class391 class391 = class365_sub1_sub1_sub2.aClass438_10078.method5820(295193907);
					if (class365_sub1_sub1_sub2.anInt10125 * 1888275831 > 0 && 62820525 * class391.anInt4182 == 0) {
						class365_sub1_sub1_sub2.anInt10124 += -248378059;
						Class331.anInt3565 = Class282.aClass282_6543.aByte6542 * -2059464589;
						Class431.anInt6504 = 0;
						return;
					}
					if (1888275831 * class365_sub1_sub1_sub2.anInt10125 <= 0 && 0 == class391.anInt4189 * -882531177) {
						class365_sub1_sub1_sub2.anInt10124 += -248378059;
						Class331.anInt3565 = -2059464589 * Class282.aClass282_6543.aByte6542;
						Class431.anInt6504 = 0;
						return;
					}
				}
				for (int i_6_ = 0; i_6_ < class365_sub1_sub1_sub2.currentGraphics.length; i_6_++) {
					if ((class365_sub1_sub1_sub2.currentGraphics[i_6_].id) * -967533709 != -1 && class365_sub1_sub1_sub2.currentGraphics[i_6_].aClass438_569.method5826(-65534)) {
						Class398 class398 = (Class158_Sub1.aClass389_8568.method4857((class365_sub1_sub1_sub2.currentGraphics[i_6_].id) * -967533709, -1879864965));
						if (class398.aBoolean5215 && class398.anInt5205 * 1505778629 != -1) {
							Class391 class391 = (Class501.aClass395_6122.method4903(1505778629 * class398.anInt5205, (byte) -112));
							if ((class365_sub1_sub1_sub2.anInt10125 * 1888275831) > 0 && class391.anInt4182 * 62820525 == 0) {
								class365_sub1_sub1_sub2.anInt10124 += -248378059;
								Class331.anInt3565 = (-2059464589 * Class282.aClass282_6543.aByte6542);
								Class431.anInt6504 = 0;
								return;
							}
							if ((class365_sub1_sub1_sub2.anInt10125 * 1888275831) <= 0 && 0 == class391.anInt4189 * -882531177) {
								class365_sub1_sub1_sub2.anInt10124 += -248378059;
								Class331.anInt3565 = (Class282.aClass282_6543.aByte6542 * -2059464589);
								Class431.anInt6504 = 0;
								return;
							}
						}
					}
				}
				Class217 class217 = Class217.method2005(class365_sub1_sub1_sub2.method4337().aClass217_2599);
				int i_7_ = (int) class217.aFloat2451;
				int i_8_ = (int) class217.aFloat2454;
				int i_9_ = (((class365_sub1_sub1_sub2.scenePositionXQueue[class365_sub1_sub1_sub2.anInt10120 * 2050671733 - 1]) * 512) + class365_sub1_sub1_sub2.getSize() * 256);
				int i_10_ = (((class365_sub1_sub1_sub2.scenePositionYQueue[class365_sub1_sub1_sub2.anInt10120 * 2050671733 - 1]) * 512) + class365_sub1_sub1_sub2.getSize() * 256);
				if (i_7_ < i_9_) {
					if (i_8_ < i_10_)
						class365_sub1_sub1_sub2.method4414(10240, (byte) 1);
					else if (i_8_ > i_10_)
						class365_sub1_sub1_sub2.method4414(14336, (byte) 1);
					else
						class365_sub1_sub1_sub2.method4414(12288, (byte) 1);
				} else if (i_7_ > i_9_) {
					if (i_8_ < i_10_)
						class365_sub1_sub1_sub2.method4414(6144, (byte) 1);
					else if (i_8_ > i_10_)
						class365_sub1_sub1_sub2.method4414(2048, (byte) 1);
					else
						class365_sub1_sub1_sub2.method4414(4096, (byte) 1);
				} else if (i_8_ < i_10_)
					class365_sub1_sub1_sub2.method4414(8192, (byte) 1);
				else if (i_8_ > i_10_)
					class365_sub1_sub1_sub2.method4414(0, (byte) 1);
				int i_11_ = (class365_sub1_sub1_sub2.aByteArray10110[2050671733 * class365_sub1_sub1_sub2.anInt10120 - 1]);
				if (!bool && (i_9_ - i_7_ > 1024 || i_9_ - i_7_ < -1024 || i_10_ - i_8_ > 1024 || i_10_ - i_8_ < -1024)) {
					class365_sub1_sub1_sub2.method4341((float) i_9_, class217.aFloat2455, (float) i_10_);
					class365_sub1_sub1_sub2.method4415(class365_sub1_sub1_sub2.anInt10068 * 2145248039, false, 688514105);
					class365_sub1_sub1_sub2.anInt10120 -= -1013322787;
					if (1888275831 * class365_sub1_sub1_sub2.anInt10125 > 0)
						class365_sub1_sub1_sub2.anInt10125 -= -1479140281;
					Class331.anInt3565 = -2059464589 * Class282.aClass282_6543.aByte6542;
					Class431.anInt6504 = 0;
					class217.method2006();
				} else {
					int i_12_ = 16;
					boolean bool_13_ = true;
					if (class365_sub1_sub1_sub2 instanceof NPC)
						bool_13_ = (((NPC) class365_sub1_sub1_sub2).aClass503_10190.aBoolean6164);
					if (bool_13_) {
						int i_14_ = (2145248039 * class365_sub1_sub1_sub2.anInt10068 - (class365_sub1_sub1_sub2.aClass386_10084.anInt4144) * 259411823);
						if (0 != i_14_ && (class365_sub1_sub1_sub2.anInt10090 * 1433412323 == -1) && 0 != (class365_sub1_sub1_sub2.anInt10115 * 907865649))
							i_12_ = 8;
						if (!bool && (2050671733 * class365_sub1_sub1_sub2.anInt10120 > 2))
							i_12_ = 24;
						if (!bool && (class365_sub1_sub1_sub2.anInt10120 * 2050671733 > 3))
							i_12_ = 32;
					} else {
						if (!bool && (class365_sub1_sub1_sub2.anInt10120 * 2050671733 > 1))
							i_12_ = 24;
						if (!bool && (2050671733 * class365_sub1_sub1_sub2.anInt10120 > 2))
							i_12_ = 32;
					}
					if (-1531994851 * class365_sub1_sub1_sub2.anInt10124 > 0 && (2050671733 * class365_sub1_sub1_sub2.anInt10120 > 1)) {
						i_12_ = 32;
						class365_sub1_sub1_sub2.anInt10124 -= -248378059;
					}
					if (i_11_ == Class282.aClass282_6541.aByte6542)
						i_12_ <<= 1;
					else if (i_11_ == Class282.aClass282_6545.aByte6542)
						i_12_ >>= 1;
					if (-1 != 1830307505 * class350.anInt3752) {
						i_12_ <<= 9;
						if (class365_sub1_sub1_sub2.anInt10120 * 2050671733 == 1) {
							int i_15_ = (class365_sub1_sub1_sub2.anInt10126 * -1520103925 * (-1520103925 * class365_sub1_sub1_sub2.anInt10126));
							int i_16_ = (((int) class217.aFloat2451 > i_9_ ? (int) class217.aFloat2451 - i_9_ : i_9_ - (int) class217.aFloat2451) << 9);
							int i_17_ = (((int) class217.aFloat2454 > i_10_ ? (int) class217.aFloat2454 - i_10_ : i_10_ - (int) class217.aFloat2454) << 9);
							int i_18_ = i_16_ > i_17_ ? i_16_ : i_17_;
							int i_19_ = -634352286 * class350.anInt3752 * i_18_;
							if (i_15_ > i_19_) {
								Entity class365_sub1_sub1_sub2_20_;
								(class365_sub1_sub1_sub2_20_ = class365_sub1_sub1_sub2).anInt10126 = (-1520103925 * class365_sub1_sub1_sub2_20_.anInt10126 / 2 * 121933219);
							} else if (i_15_ / 2 > i_18_) {
								class365_sub1_sub1_sub2.anInt10126 -= class350.anInt3752 * 1936228275;
								if ((-1520103925 * class365_sub1_sub1_sub2.anInt10126) < 0)
									class365_sub1_sub1_sub2.anInt10126 = 0;
							} else if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) < i_12_) {
								class365_sub1_sub1_sub2.anInt10126 += 1936228275 * class350.anInt3752;
								if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) > i_12_)
									class365_sub1_sub1_sub2.anInt10126 = 121933219 * i_12_;
							}
						} else if ((-1520103925 * class365_sub1_sub1_sub2.anInt10126) < i_12_) {
							class365_sub1_sub1_sub2.anInt10126 += class350.anInt3752 * 1936228275;
							if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) > i_12_)
								class365_sub1_sub1_sub2.anInt10126 = i_12_ * 121933219;
						} else if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) > 0) {
							class365_sub1_sub1_sub2.anInt10126 -= 1936228275 * class350.anInt3752;
							if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) < 0)
								class365_sub1_sub1_sub2.anInt10126 = 0;
						}
						i_12_ = (-1520103925 * class365_sub1_sub1_sub2.anInt10126 >> 9);
						if (i_12_ < 1)
							i_12_ = 1;
					}
					Class431.anInt6504 = 0;
					if (i_9_ != i_7_ || i_10_ != i_8_) {
						if (i_7_ < i_9_) {
							class217.aFloat2451 += (float) i_12_;
							Class431.anInt6504 = 1633205647 * (Class431.anInt6504 * 236175727 | 0x4);
							if (class217.aFloat2451 > (float) i_9_)
								class217.aFloat2451 = (float) i_9_;
						} else if (i_7_ > i_9_) {
							class217.aFloat2451 -= (float) i_12_;
							Class431.anInt6504 = ((Class431.anInt6504 * 236175727 | 0x8) * 1633205647);
							if (class217.aFloat2451 < (float) i_9_)
								class217.aFloat2451 = (float) i_9_;
						}
						if (i_8_ < i_10_) {
							class217.aFloat2454 += (float) i_12_;
							Class431.anInt6504 = 1633205647 * (236175727 * Class431.anInt6504 | 0x1);
							if (class217.aFloat2454 > (float) i_10_)
								class217.aFloat2454 = (float) i_10_;
						} else if (i_8_ > i_10_) {
							class217.aFloat2454 -= (float) i_12_;
							Class431.anInt6504 = 1633205647 * (Class431.anInt6504 * 236175727 | 0x2);
							if (class217.aFloat2454 < (float) i_10_)
								class217.aFloat2454 = (float) i_10_;
						}
						class365_sub1_sub1_sub2.method4340(class217);
						if (i_12_ >= 32)
							Class331.anInt3565 = (Class282.aClass282_6541.aByte6542 * -2059464589);
						else
							Class331.anInt3565 = -2059464589 * i_11_;
					} else
						Class331.anInt3565 = Class282.aClass282_6543.aByte6542 * -2059464589;
					if ((int) class217.aFloat2451 == i_9_ && (int) class217.aFloat2454 == i_10_) {
						class365_sub1_sub1_sub2.anInt10120 -= -1013322787;
						if (1888275831 * class365_sub1_sub1_sub2.anInt10125 > 0)
							class365_sub1_sub1_sub2.anInt10125 -= -1479140281;
					}
					class217.method2006();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.hy(").append(')').toString());
		}
	}

	static void method4142(int i, int i_21_, IComponentDefinition class105, int i_22_) {
		try {
			int i_23_ = class105.anInt1156 * -2093041337 + i;
			int i_24_ = 15 + i_21_;
			if (client.aBoolean8667) {
				int i_25_ = -256;
				if (914379507 * client.anInt6467 < 20)
					i_25_ = -65536;
				Class343.aClass264_3673.method2474(new StringBuilder().append("Fps:").append(914379507 * client.anInt6467).toString(), i_23_, i_24_, i_25_, -1, (byte) -7);
				i_24_ += 15;
				Runtime runtime = Runtime.getRuntime();
				long l = runtime.totalMemory() / 1024L;
				long l_26_ = l - runtime.freeMemory() / 1024L;
				int i_27_ = -256;
				if (l_26_ > 262144L)
					i_27_ = -65536;
				Class343.aClass264_3673.method2474(new StringBuilder().append("Mem:").append(l_26_).append("/").append(l).append("k").toString(), i_23_, i_24_, i_27_, -1, (byte) -69);
				i_24_ += 15;
				long l_28_ = ((BufferedConnectionContext) client.gameConnection).aClass124_340.method1384(1026179047);
				String string = "N/A";
				if (-1L != l_28_) {
					string = new StringBuilder().append(l_28_).append("ms").toString();
					if (l_28_ > 500L)
						string = new StringBuilder().append(Class285.method2709(16711680, -2018696638)).append(string).append(Class285.method2709(16776960, -1609373980)).toString();
				}
				Class343.aClass264_3673.method2474(new StringBuilder().append("Game: In:").append(-1705791507 * ((BufferedConnectionContext) client.gameConnection).anInt343).append("B/s ").append("Out:").append(((BufferedConnectionContext) client.gameConnection).anInt327 * 1114720205).append("B/s ").append("Ping:").append(string).toString(), i_23_, i_24_, -256, -1, (byte) -47);
				i_24_ += 15;
				long l_29_ = ((BufferedConnectionContext) client.lobbyConnection).aClass124_340.method1384(529918549);
				String string_30_ = "N/A";
				if (l_29_ != -1L) {
					string_30_ = new StringBuilder().append(l_29_).append("ms").toString();
					if (l_29_ > 500L)
						string_30_ = new StringBuilder().append(Class285.method2709(16711680, -2004094405)).append(string_30_).append(Class285.method2709(16776960, -1875733087)).toString();
				}
				Class343.aClass264_3673.method2474(new StringBuilder().append("Lobby: In:").append(((BufferedConnectionContext) client.lobbyConnection).anInt343 * -1705791507).append("B/s ").append("Out:").append(1114720205 * ((BufferedConnectionContext) client.lobbyConnection).anInt327).append("B/s ").append("Ping:").append(string_30_).toString(), i_23_, i_24_, -256, -1, (byte) -30);
				i_24_ += 15;
				int i_31_ = Class373.aClass_ra4071.za() / 1024;
				Class343.aClass264_3673.method2474(new StringBuilder().append("Offheap:").append(i_31_).append("k").toString(), i_23_, i_24_, (i_31_ > 65536 ? -65536 : -256), -1, (byte) -50);
				i_24_ += 15;
				int i_32_ = 0;
				int i_33_ = 0;
				int i_34_ = 0;
				for (int i_35_ = 0; i_35_ < Class373.aClass242_Sub1Array4072.length; i_35_++) {
					if (Class373.aClass242_Sub1Array4072[i_35_] == null) {
						if (i_22_ == -1583970959)
							return;
					} else {
						i_32_ += Class373.aClass242_Sub1Array4072[i_35_].method2279(-2104328128);
						i_33_ += Class373.aClass242_Sub1Array4072[i_35_].method2274((byte) 1);
						i_34_ += Class373.aClass242_Sub1Array4072[i_35_].method2275(-856500842);
					}
				}
				int i_36_ = i_34_ * 100 / i_32_;
				int i_37_ = 10000 * i_33_ / i_32_;
				String string_38_ = new StringBuilder().append("Cache:").append(Class300.method3685((long) i_37_, 2, true, Class429.aClass429_6624, (short) -6940)).append("% (").append(i_36_).append("%)").toString();
				Script.aClass264_7534.method2474(string_38_, i_23_, i_24_, -256, -1, (byte) -26);
				i_24_ += 12;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.km(").append(')').toString());
		}
	}

	static void method4143(Class243 class243, int i, int i_39_, int i_40_, boolean bool, long l, int i_41_, int i_42_) {
		try {
			Class79.anInt734 = -1262101671;
			Class79.aClass243_744 = class243;
			Class79.anInt745 = i * -407545223;
			Class79.anInt746 = i_39_ * -956029523;
			Class79.aClass298_Sub19_Sub1_748 = null;
			Class79.anInt739 = -2102749749 * i_40_;
			Class8.aBoolean114 = bool;
			Class298_Sub24_Sub1.anInt9276 = 1446879088;
			Class515.aLong6233 = l * 7092526387081397629L;
			Class401.anInt6559 = -420794947 * i_41_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.i(").append(')').toString());
		}
	}

	public static void method4144(int i, int i_43_, int i_44_, int i_45_, short i_46_) {
		try {
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7421.method5939(1766612795)); class298_sub41 != null; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7421.method5944(49146)))
				Class461.method5989(class298_sub41, i, i_43_, i_44_, i_45_, -409300106);
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7455.method5939(1766612795)); null != class298_sub41; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7455.method5944(49146))) {
				int i_47_ = 1;
				Class350 class350 = ((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.method4426(-1185806146);
				int i_48_ = ((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.aClass438_10077.method5823(1961619021);
				if (-1 == i_48_ || (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.aBoolean10094))
					i_47_ = 0;
				else if (230243963 * class350.anInt3721 == i_48_ || class350.anInt3749 * 491753731 == i_48_ || -783166629 * class350.anInt3724 == i_48_ || i_48_ == class350.anInt3746 * -2054940183)
					i_47_ = 2;
				else if (328817727 * class350.anInt3755 == i_48_ || -1238642279 * class350.anInt3722 == i_48_ || class350.anInt3728 * 124010991 == i_48_ || -907666203 * class350.anInt3727 == i_48_)
					i_47_ = 3;
				if (i_47_ != (974385733 * ((Class298_Sub41) class298_sub41).anInt7439)) {
					int i_49_ = (Class125.method1398((((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433), 2092032929));
					SomethingDefinitions class503 = (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.aClass503_10190);
					if (class503.anIntArray6188 != null)
						class503 = class503.method6240(Class128.aClass148_6331, 2075279963);
					if (null == class503 || -1 == i_49_) {
						((Class298_Sub41) class298_sub41).anInt7443 = -502744039;
						((Class298_Sub41) class298_sub41).aBoolean7444 = false;
						((Class298_Sub41) class298_sub41).anInt7439 = i_47_ * 636899469;
					} else if (i_49_ != 391847895 * ((Class298_Sub41) class298_sub41).anInt7443 || (((Class298_Sub41) class298_sub41).aBoolean7444) != class503.aBoolean6180) {
						boolean bool = false;
						if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447) != null) {
							((Class298_Sub41) class298_sub41).anInt7449 -= 584623616;
							if ((43235291 * ((Class298_Sub41) class298_sub41).anInt7449) <= 0) {
								Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
								((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
								bool = true;
							}
						} else
							bool = true;
						if (bool) {
							((Class298_Sub41) class298_sub41).anInt7449 = -1283486135 * class503.anInt6179;
							((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7446 = null;
							((Class298_Sub41) class298_sub41).aClass298_Sub23_7445 = null;
							((Class298_Sub41) class298_sub41).anInt7443 = 502744039 * i_49_;
							((Class298_Sub41) class298_sub41).aBoolean7444 = class503.aBoolean6180;
							((Class298_Sub41) class298_sub41).anInt7439 = 636899469 * i_47_;
						}
					} else {
						((Class298_Sub41) class298_sub41).anInt7439 = 636899469 * i_47_;
						((Class298_Sub41) class298_sub41).anInt7449 = class503.anInt6179 * -1283486135;
					}
				}
				Class217 class217 = (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.method4337().aClass217_2599);
				((Class298_Sub41) class298_sub41).anInt7425 = -7217919 * (int) class217.aFloat2451;
				((Class298_Sub41) class298_sub41).anInt7427 = ((int) class217.aFloat2451 + (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.getSize() << 8)) * 305826635;
				((Class298_Sub41) class298_sub41).anInt7423 = 584186023 * (int) class217.aFloat2454;
				((Class298_Sub41) class298_sub41).anInt7428 = ((int) class217.aFloat2454 + (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.getSize() << 8)) * -1647445571;
				((Class298_Sub41) class298_sub41).anInt7424 = ((((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.plane) * 2135210127);
				Class461.method5989(class298_sub41, i, i_43_, i_44_, i_45_, -409300106);
			}
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass437_7440.method5816(2005558160)); class298_sub41 != null; class298_sub41 = (Class298_Sub41) Class298_Sub41.aClass437_7440.method5815((byte) -39)) {
				int i_50_ = 1;
				Class350 class350 = ((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.method4426(1149258153);
				int i_51_ = ((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.aClass438_10077.method5823(1924378402);
				if (-1 == i_51_ || (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.aBoolean10094))
					i_50_ = 0;
				else if (i_51_ == 230243963 * class350.anInt3721 || i_51_ == 491753731 * class350.anInt3749 || i_51_ == class350.anInt3724 * -783166629 || i_51_ == -2054940183 * class350.anInt3746)
					i_50_ = 2;
				else if (class350.anInt3755 * 328817727 == i_51_ || i_51_ == -1238642279 * class350.anInt3722 || 124010991 * class350.anInt3728 == i_51_ || i_51_ == class350.anInt3727 * -907666203)
					i_50_ = 3;
				if (i_50_ != (((Class298_Sub41) class298_sub41).anInt7439 * 974385733)) {
					int i_52_ = (Class375.method4652((((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434), 2117239368));
					if (i_52_ != (((Class298_Sub41) class298_sub41).anInt7443 * 391847895) || (((Class298_Sub41) class298_sub41).aBoolean7444 != (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.transformedNpc))) {
						boolean bool = false;
						if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447) != null) {
							((Class298_Sub41) class298_sub41).anInt7449 -= 584623616;
							if ((43235291 * ((Class298_Sub41) class298_sub41).anInt7449) <= 0) {
								Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
								((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
								bool = true;
							}
						} else
							bool = true;
						if (bool) {
							((Class298_Sub41) class298_sub41).anInt7449 = (-1138033583 * (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.anInt10215));
							((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7446 = null;
							((Class298_Sub41) class298_sub41).aClass298_Sub23_7445 = null;
							((Class298_Sub41) class298_sub41).anInt7443 = i_52_ * 502744039;
							((Class298_Sub41) class298_sub41).aBoolean7444 = (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.transformedNpc);
							((Class298_Sub41) class298_sub41).anInt7439 = i_50_ * 636899469;
						}
					} else {
						((Class298_Sub41) class298_sub41).anInt7449 = (-1138033583 * (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.anInt10215));
						((Class298_Sub41) class298_sub41).anInt7439 = i_50_ * 636899469;
					}
				}
				Class217 class217 = (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.method4337().aClass217_2599);
				((Class298_Sub41) class298_sub41).anInt7425 = -7217919 * (int) class217.aFloat2451;
				((Class298_Sub41) class298_sub41).anInt7427 = ((int) class217.aFloat2451 + (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.getSize() << 8)) * 305826635;
				((Class298_Sub41) class298_sub41).anInt7423 = 584186023 * (int) class217.aFloat2454;
				((Class298_Sub41) class298_sub41).anInt7428 = ((int) class217.aFloat2454 + (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.getSize() << 8)) * -1647445571;
				((Class298_Sub41) class298_sub41).anInt7424 = ((((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.plane) * 2135210127);
				Class461.method5989(class298_sub41, i, i_43_, i_44_, i_45_, -409300106);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.q(").append(')').toString());
		}
	}

	static final void method4145(ClientScript2 class403, int i) {
		try {
			int i_53_ = (((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((Player) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242).aClass70_10223.method798(i_53_, 1440952834);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("of.ak(").append(')').toString());
		}
	}
}
