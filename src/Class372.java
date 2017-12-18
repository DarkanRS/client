/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class372 {
	static int[][] anIntArrayArray4047;
	static int anInt4048;
	static int anInt4049;
	static int anInt4050;
	static int anInt4051 = 0;
	public static Class323 aClass323_4052;

	static {
		anInt4048 = -153061732;
		anInt4049 = 0;
		anInt4050 = -2050841580;
	}

	Class372() throws Throwable {
		throw new Error();
	}

	static final void method4587(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			int i_0_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 3]);
			Class341 class341 = client.aClass283_8716.method2628(681479919);
			Class97_Sub1.method1043(((i_0_ >> 14 & 0x3fff) - class341.gameSceneBaseX * -1760580017), ((i_0_ & 0x3fff) - 283514611 * class341.gameSceneBaseY), i_1_ << 2, i_2_, i_3_, false);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pl.aga(").append(')').toString());
		}
	}

	static final void method4588(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub25_7569.method5716((byte) -30);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pl.aju(").append(')').toString());
		}
	}

	public static boolean method4589(int i, String string, int i_4_) {
		try {
			Class474.aClass471_5979 = new Class464();
			Class474.aClass471_5979.worldId = i * 348739329;
			Class474.aClass471_5979.address = string;
			if (Class242.aClass401_2708 != Class401.aClass401_6557) {
				Class474.aClass471_5979.anInt5954 = (815680320 + -1670427267 * Class474.aClass471_5979.worldId);
				Class474.aClass471_5979.anInt5955 = (-52655920 + 925746937 * Class474.aClass471_5979.worldId);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pl.f(").append(')').toString());
		}
	}

	public static Class243 method4590(JS5Index index, boolean bool, int i, boolean bool_5_, int i_6_) {
		try {
			if (null == Class373.aClass242_Sub1Array4072)
				Class373.aClass242_Sub1Array4072 = new Class242_Sub1[Class356.method4268(1608416895)];
			Class329 class329 = null;
			int indexId = index.getIndexId();
			if (null != client.aClass484_6476)
				class329 = new Class329(indexId, client.aClass484_6476, Class497.aClass484Array6106[indexId], 1500000);
			Class373.aClass242_Sub1Array4072[indexId] = Class203.aClass225_2337.method2095(indexId, class329, (Class365_Sub1_Sub3_Sub2.aClass329_9933), 311001416);
			Class373.aClass242_Sub1Array4072[indexId].method2278((byte) 2);
			return new Class243(Class373.aClass242_Sub1Array4072[indexId], bool, i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pl.fz(").append(')').toString());
		}
	}

	public static void method4591(IComponentDefinition[] class105s, int i, int i_8_, int i_9_, boolean bool, short i_10_) {
		try {
			for (int i_11_ = 0; i_11_ < class105s.length; i_11_++) {
				IComponentDefinition class105 = class105s[i_11_];
				if (null == class105) {
					if (i_10_ == 255) {
						/* empty */
					}
				} else if (1573706803 * class105.anInt1160 != i) {
					if (i_10_ == 255)
						break;
				} else {
					Class82_Sub10.method904(class105, i_8_, i_9_, bool, (byte) 59);
					Class292.method2816(class105, i_8_, i_9_, (byte) -3);
					if (684246511 * class105.anInt1166 > (1867913305 * class105.anInt1168 - -2093041337 * class105.anInt1156))
						class105.anInt1166 = (1227329079 * class105.anInt1168 - 2072992297 * class105.anInt1156);
					if (684246511 * class105.anInt1166 < 0)
						class105.anInt1166 = 0;
					if (-1424956747 * class105.anInt1167 > (2053897963 * class105.anInt1169 - class105.anInt1162 * 457937409))
						class105.anInt1167 = (2097037087 * class105.anInt1169 - class105.anInt1162 * -900266595);
					if (-1424956747 * class105.anInt1167 < 0)
						class105.anInt1167 = 0;
					if (class105.anInt1144 * -1215239439 == 0)
						Class117.method1282(class105s, class105, bool, (short) 319);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pl.ky(").append(')').toString());
		}
	}

	static void method4592(int i) {
		try {
			Class10.anInt129 = 0;
			for (int i_12_ = 0; i_12_ < 2048; i_12_++) {
				Class10.aClass298_Sub53Array133[i_12_] = null;
				Class10.playersMovementTypes[i_12_] = Class282.aClass282_6540.aByte6542;
				Class10.aClass410Array138[i_12_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pl.x(").append(')').toString());
		}
	}

	static final boolean method4593(int i, int i_13_, int i_14_, Class336 class336, Class289 class289, byte i_15_) {
		try {
			int i_16_ = i;
			int i_17_ = i_13_;
			int i_18_ = 64;
			int i_19_ = 64;
			int i_20_ = i - i_18_;
			int i_21_ = i_13_ - i_19_;
			Class285.anIntArrayArray3076[i_18_][i_19_] = 99;
			Class285.anIntArrayArray3080[i_18_][i_19_] = 0;
			int i_22_ = 0;
			int i_23_ = 0;
			Class285.routeFinderXArray[i_22_] = i_16_;
			Class285.routeFinderYArray[i_22_++] = i_17_;
			int[][] is = class289.anIntArrayArray3155;
			while_101_: while (i_23_ != i_22_) {
				i_16_ = Class285.routeFinderXArray[i_23_];
				i_17_ = Class285.routeFinderYArray[i_23_];
				i_23_ = i_23_ + 1 & 0xfff;
				i_18_ = i_16_ - i_20_;
				i_19_ = i_17_ - i_21_;
				int i_24_ = i_16_ - 1487776559 * class289.anInt3151;
				int i_25_ = i_17_ - class289.anInt3152 * 1415525851;
				if (class336.method4090(i_14_, i_16_, i_17_, class289, -16711936)) {
					Class285.anInt3078 = i_16_ * 1021042197;
					ClanMember.anInt1684 = -575994451 * i_17_;
					return true;
				}
				int i_26_ = Class285.anIntArrayArray3080[i_18_][i_19_] + 1;
				while_94_: do {
					if (i_18_ > 0) {
						if (Class285.anIntArrayArray3076[i_18_ - 1][i_19_] != 0) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else if (0 != (is[i_24_ - 1][i_25_] & 0x43a40000)) {
							if (i_15_ <= 36)
								throw new IllegalStateException();
						} else if (0 != (is[i_24_ - 1][i_14_ + i_25_ - 1] & 0x4e240000)) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else {
							for (int i_27_ = 1; i_27_ < i_14_ - 1; i_27_++) {
								if (0 != (is[i_24_ - 1][i_25_ + i_27_] & 0x4fa40000)) {
									if (i_15_ <= 36)
										throw new IllegalStateException();
									break while_94_;
								}
							}
							Class285.routeFinderXArray[i_22_] = i_16_ - 1;
							Class285.routeFinderYArray[i_22_] = i_17_;
							i_22_ = 1 + i_22_ & 0xfff;
							Class285.anIntArrayArray3076[i_18_ - 1][i_19_] = 2;
							Class285.anIntArrayArray3080[i_18_ - 1][i_19_] = i_26_;
						}
					}
				} while (false);
				while_95_: do {
					if (i_18_ < 128 - i_14_) {
						if (0 != (Class285.anIntArrayArray3076[1 + i_18_][i_19_])) {
							if (i_15_ <= 36)
								throw new IllegalStateException();
						} else if (0 != (is[i_24_ + i_14_][i_25_] & 0x60e40000)) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else if ((is[i_14_ + i_24_][i_14_ + i_25_ - 1] & 0x78240000) != 0) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else {
							for (int i_28_ = 1; i_28_ < i_14_ - 1; i_28_++) {
								if (0 != (is[i_14_ + i_24_][i_25_ + i_28_] & 0x78e40000)) {
									if (i_15_ <= 36)
										throw new IllegalStateException();
									break while_95_;
								}
							}
							Class285.routeFinderXArray[i_22_] = 1 + i_16_;
							Class285.routeFinderYArray[i_22_] = i_17_;
							i_22_ = 1 + i_22_ & 0xfff;
							Class285.anIntArrayArray3076[i_18_ + 1][i_19_] = 8;
							Class285.anIntArrayArray3080[i_18_ + 1][i_19_] = i_26_;
						}
					}
				} while (false);
				while_96_: do {
					if (i_19_ > 0) {
						if (0 != (Class285.anIntArrayArray3076[i_18_][i_19_ - 1])) {
							if (i_15_ <= 36)
								throw new IllegalStateException();
						} else if ((is[i_24_][i_25_ - 1] & 0x43a40000) != 0) {
							if (i_15_ <= 36)
								throw new IllegalStateException();
						} else if (0 != (is[i_24_ + i_14_ - 1][i_25_ - 1] & 0x60e40000)) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else {
							for (int i_29_ = 1; i_29_ < i_14_ - 1; i_29_++) {
								if (0 != (is[i_29_ + i_24_][i_25_ - 1] & 0x63e40000)) {
									if (i_15_ <= 36) {
										/* empty */
									}
									break while_96_;
								}
							}
							Class285.routeFinderXArray[i_22_] = i_16_;
							Class285.routeFinderYArray[i_22_] = i_17_ - 1;
							i_22_ = 1 + i_22_ & 0xfff;
							Class285.anIntArrayArray3076[i_18_][i_19_ - 1] = 1;
							Class285.anIntArrayArray3080[i_18_][i_19_ - 1] = i_26_;
						}
					}
				} while (false);
				while_97_: do {
					if (i_19_ < 128 - i_14_) {
						if (Class285.anIntArrayArray3076[i_18_][i_19_ + 1] != 0) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else if ((is[i_24_][i_14_ + i_25_] & 0x4e240000) != 0) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else if (0 != (is[i_24_ + i_14_ - 1][i_25_ + i_14_] & 0x78240000)) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else {
							for (int i_30_ = 1; i_30_ < i_14_ - 1; i_30_++) {
								if (0 != (is[i_30_ + i_24_][i_14_ + i_25_] & 0x7e240000)) {
									if (i_15_ <= 36)
										throw new IllegalStateException();
									break while_97_;
								}
							}
							Class285.routeFinderXArray[i_22_] = i_16_;
							Class285.routeFinderYArray[i_22_] = i_17_ + 1;
							i_22_ = i_22_ + 1 & 0xfff;
							Class285.anIntArrayArray3076[i_18_][1 + i_19_] = 4;
							Class285.anIntArrayArray3080[i_18_][i_19_ + 1] = i_26_;
						}
					}
				} while (false);
				while_98_: do {
					if (i_18_ > 0 && i_19_ > 0) {
						if (Class285.anIntArrayArray3076[i_18_ - 1][i_19_ - 1] != 0) {
							if (i_15_ <= 36)
								throw new IllegalStateException();
						} else if ((is[i_24_ - 1][i_25_ - 1] & 0x43a40000) != 0) {
							if (i_15_ <= 36)
								throw new IllegalStateException();
						} else {
							for (int i_31_ = 1; i_31_ < i_14_; i_31_++) {
								if ((is[i_24_ - 1][i_25_ - 1 + i_31_] & 0x4fa40000) != 0) {
									if (i_15_ <= 36) {
										/* empty */
									}
									break while_98_;
								}
								if ((is[i_24_ - 1 + i_31_][i_25_ - 1] & 0x63e40000) != 0) {
									if (i_15_ <= 36) {
										/* empty */
									}
									break while_98_;
								}
							}
							Class285.routeFinderXArray[i_22_] = i_16_ - 1;
							Class285.routeFinderYArray[i_22_] = i_17_ - 1;
							i_22_ = i_22_ + 1 & 0xfff;
							Class285.anIntArrayArray3076[i_18_ - 1][i_19_ - 1] = 3;
							Class285.anIntArrayArray3080[i_18_ - 1][i_19_ - 1] = i_26_;
						}
					}
				} while (false);
				while_99_: do {
					if (i_18_ < 128 - i_14_ && i_19_ > 0) {
						if (Class285.anIntArrayArray3076[1 + i_18_][i_19_ - 1] != 0) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else if ((is[i_14_ + i_24_][i_25_ - 1] & 0x60e40000) != 0) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else {
							for (int i_32_ = 1; i_32_ < i_14_; i_32_++) {
								if (0 != (is[i_24_ + i_14_][i_25_ - 1 + i_32_] & 0x78e40000)) {
									if (i_15_ <= 36)
										throw new IllegalStateException();
									break while_99_;
								}
								if ((is[i_24_ + i_32_][i_25_ - 1] & 0x63e40000) != 0) {
									if (i_15_ <= 36) {
										/* empty */
									}
									break while_99_;
								}
							}
							Class285.routeFinderXArray[i_22_] = i_16_ + 1;
							Class285.routeFinderYArray[i_22_] = i_17_ - 1;
							i_22_ = i_22_ + 1 & 0xfff;
							Class285.anIntArrayArray3076[i_18_ + 1][i_19_ - 1] = 9;
							Class285.anIntArrayArray3080[i_18_ + 1][i_19_ - 1] = i_26_;
						}
					}
				} while (false);
				while_100_: do {
					if (i_18_ > 0 && i_19_ < 128 - i_14_) {
						if (0 != (Class285.anIntArrayArray3076[i_18_ - 1][1 + i_19_])) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else if (0 != (is[i_24_ - 1][i_14_ + i_25_] & 0x4e240000)) {
							if (i_15_ <= 36) {
								/* empty */
							}
						} else {
							for (int i_33_ = 1; i_33_ < i_14_; i_33_++) {
								if ((is[i_24_ - 1][i_33_ + i_25_] & 0x4fa40000) != 0) {
									if (i_15_ <= 36)
										throw new IllegalStateException();
									break while_100_;
								}
								if (0 != (is[i_33_ + (i_24_ - 1)][i_14_ + i_25_] & 0x7e240000)) {
									if (i_15_ <= 36) {
										/* empty */
									}
									break while_100_;
								}
							}
							Class285.routeFinderXArray[i_22_] = i_16_ - 1;
							Class285.routeFinderYArray[i_22_] = 1 + i_17_;
							i_22_ = 1 + i_22_ & 0xfff;
							Class285.anIntArrayArray3076[i_18_ - 1][1 + i_19_] = 6;
							Class285.anIntArrayArray3080[i_18_ - 1][1 + i_19_] = i_26_;
						}
					}
				} while (false);
				if (i_18_ < 128 - i_14_ && i_19_ < 128 - i_14_) {
					if (0 != (Class285.anIntArrayArray3076[1 + i_18_][1 + i_19_])) {
						if (i_15_ <= 36) {
							/* empty */
						}
					} else if ((is[i_14_ + i_24_][i_25_ + i_14_] & 0x78240000) != 0) {
						if (i_15_ <= 36)
							throw new IllegalStateException();
					} else {
						for (int i_34_ = 1; i_34_ < i_14_; i_34_++) {
							if (0 != (is[i_24_ + i_34_][i_25_ + i_14_] & 0x7e240000)) {
								if (i_15_ <= 36) {
									/* empty */
								}
								continue while_101_;
							}
							if (0 != (is[i_24_ + i_14_][i_34_ + i_25_] & 0x78e40000)) {
								if (i_15_ <= 36) {
									/* empty */
								}
								continue while_101_;
							}
						}
						Class285.routeFinderXArray[i_22_] = i_16_ + 1;
						Class285.routeFinderYArray[i_22_] = 1 + i_17_;
						i_22_ = i_22_ + 1 & 0xfff;
						Class285.anIntArrayArray3076[i_18_ + 1][1 + i_19_] = 12;
						Class285.anIntArrayArray3080[i_18_ + 1][i_19_ + 1] = i_26_;
					}
				}
			}
			Class285.anInt3078 = 1021042197 * i_16_;
			ClanMember.anInt1684 = -575994451 * i_17_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pl.p(").append(')').toString());
		}
	}

	static void method4594(int i, short i_35_) {
		try {
			Class481.anInt6035 = 259213147 * i;
			Class19.aClass348_264.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pl.f(").append(')').toString());
		}
	}

	static void method4595(int i) {
		try {
			Script.aClass264_7534 = null;
			Class343.aClass264_3673 = null;
			Class101.aClass264_1084 = null;
			Class160.aClass57Array1646 = null;
			Class401.aClass57Array6561 = null;
			Class416.aClass57Array5334 = null;
			Class422.aClass57Array5351 = null;
			Class128_Sub2.aClass57Array8560 = null;
			Class74.aClass57Array699 = null;
			Class234.aClass57Array2598 = null;
			Class82_Sub11.aClass57Array6861 = null;
			SubIncommingPacket.aClass57Array2349 = null;
			Class130_Sub2.aClass57Array6959 = null;
			Class144.aClass57_1562 = null;
			Graphics.aClass57_573 = null;
			Class250.aClass57Array2766 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pl.u(").append(')').toString());
		}
	}
}
