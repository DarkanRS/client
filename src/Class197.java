/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class197 {
	static byte[] aByteArray2424 = new byte[2048];
	static final int anInt2425 = 1;
	static int[] anIntArray2426;
	static byte[] playerMovementTypes = new byte[2048];
	static RsByteBuffer[] aClass282_Sub35Array2428 = new RsByteBuffer[2048];
	static int NUM_PLAYER_INDICES = 0;
	static Class4[] aClass4Array2430;
	static int anInt2431;
	static final int anInt2432 = 2;
	static int[] PLAYER_INDICES = new int[2048];
	static int anInt2434;
	static int[] anIntArray2435;
	static FontMetrics aClass414_2436;

	static final void method3188(RsBitsBuffer class282_sub35_sub2, int i) {
		anInt2434 = 0;
		LoadingStage.decodeUpdate(class282_sub35_sub2, 2052929414);
		Class508.decodeMasks(class282_sub35_sub2, 344959860);
		if (i != class282_sub35_sub2.index * -1990677291) {
			throw new RuntimeException(new StringBuilder().append(-1990677291 * class282_sub35_sub2.index).append(" ").append(i).toString());
		}
	}

	static {
		anInt2431 = 0;
		anIntArray2426 = new int[2048];
		aClass4Array2430 = new Class4[2048];
		anInt2434 = 0;
		anIntArray2435 = new int[2048];
	}

	Class197() throws Throwable {
		throw new Error();
	}

	static final void method3189(RsBitsBuffer class282_sub35_sub2) {
		class282_sub35_sub2.initBitAccess((byte) -49);
		int i = client.anInt7315 * 1595512269;
		Player class521_sub1_sub1_sub2_sub1 = (Class84.myPlayer = client.players[i] = (new Player(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1794916156))));
		class521_sub1_sub1_sub2_sub1.anInt10314 = i * -1498872675;
		int i_0_ = class282_sub35_sub2.readBits(30, (byte) -47);
		byte i_1_ = (byte) (i_0_ >> 28);
		int i_2_ = i_0_ >> 14 & 0x3fff;
		int i_3_ = i_0_ & 0x3fff;
		CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1171197217);
		class521_sub1_sub1_sub2_sub1.regionBaseX[0] = i_2_ - class219.x * 1948093437;
		class521_sub1_sub1_sub2_sub1.regionBaseY[0] = i_3_ - -1002240017 * class219.y;
		class521_sub1_sub1_sub2_sub1.method11172((class521_sub1_sub1_sub2_sub1.regionBaseX[0] << 9) + (class521_sub1_sub1_sub2_sub1.method15805(828768449) << 8), (class521_sub1_sub1_sub2_sub1.method11165().aClass385_3595.y), (class521_sub1_sub1_sub2_sub1.regionBaseY[0] << 9) + (class521_sub1_sub1_sub2_sub1.method15805(828768449) << 8));
		Class4.anInt35 = (class521_sub1_sub1_sub2_sub1.aByte7967 = class521_sub1_sub1_sub2_sub1.aByte7968 = i_1_) * -647602067;
		if (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).method5497(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], 1641852873)) {
			class521_sub1_sub1_sub2_sub1.aByte7968++;
		}
		if (aClass282_Sub35Array2428[i] != null) {
			class521_sub1_sub1_sub2_sub1.decodeAppearance(aClass282_Sub35Array2428[i], 1925099603);
		}
		NUM_PLAYER_INDICES = 0;
		PLAYER_INDICES[(NUM_PLAYER_INDICES += 1595438921) * -963499271 - 1] = i;
		aByteArray2424[i] = (byte) 0;
		anInt2431 = 0;
		for (int i_4_ = 1; i_4_ < 2048; i_4_++) {
			if (i != i_4_) {
				int i_5_ = class282_sub35_sub2.readBits(18, (byte) -5);
				int i_6_ = i_5_ >> 16;
				int i_7_ = i_5_ >> 8 & 0xff;
				int i_8_ = i_5_ & 0xff;
				Class4 class4 = aClass4Array2430[i_4_] = new Class4();
				class4.anInt31 = -1096995395 * (i_8_ + ((i_6_ << 28) + (i_7_ << 14)));
				class4.anInt30 = 0;
				class4.anInt32 = 1927204909;
				class4.aBool29 = false;
				class4.aBool33 = false;
				anIntArray2426[(anInt2431 += -773593709) * 1265369243 - 1] = i_4_;
				aByteArray2424[i_4_] = (byte) 0;
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 83);
	}

	static final void method3190(RsBitsBuffer class282_sub35_sub2) {
		int i = 0;
		class282_sub35_sub2.initBitAccess((byte) 28);
		for (int i_9_ = 0; i_9_ < NUM_PLAYER_INDICES * -963499271; i_9_++) {
			int i_10_ = PLAYER_INDICES[i_9_];
			if ((aByteArray2424[i_10_] & 0x1) == 0) {
				if (i > 0) {
					i--;
					aByteArray2424[i_10_] |= 0x2;
				} else {
					int i_11_ = class282_sub35_sub2.readBits(1, (byte) -43);
					if (0 == i_11_) {
						i = Class399.decodeSkip(class282_sub35_sub2, -1089696060);
						aByteArray2424[i_10_] |= 0x2;
					} else {
						Class105.method1806(class282_sub35_sub2, i_10_, -1439531857);
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 44);
		if (i != 0) {
			throw new RuntimeException();
		}
		class282_sub35_sub2.initBitAccess((byte) 45);
		for (int i_12_ = 0; i_12_ < NUM_PLAYER_INDICES * -963499271; i_12_++) {
			int i_13_ = PLAYER_INDICES[i_12_];
			if ((aByteArray2424[i_13_] & 0x1) != 0) {
				if (i > 0) {
					i--;
					aByteArray2424[i_13_] |= 0x2;
				} else {
					int i_14_ = class282_sub35_sub2.readBits(1, (byte) -7);
					if (0 == i_14_) {
						i = Class399.decodeSkip(class282_sub35_sub2, -1089696060);
						aByteArray2424[i_13_] |= 0x2;
					} else {
						Class105.method1806(class282_sub35_sub2, i_13_, -427116331);
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 114);
		if (i != 0) {
			throw new RuntimeException();
		}
		class282_sub35_sub2.initBitAccess((byte) -98);
		for (int i_15_ = 0; i_15_ < 1265369243 * anInt2431; i_15_++) {
			int i_16_ = anIntArray2426[i_15_];
			if (0 != (aByteArray2424[i_16_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray2424[i_16_] |= 0x2;
				} else {
					int i_17_ = class282_sub35_sub2.readBits(1, (byte) -30);
					if (0 == i_17_) {
						i = Class399.decodeSkip(class282_sub35_sub2, -1089696060);
						aByteArray2424[i_16_] |= 0x2;
					} else if (Class346.method6155(class282_sub35_sub2, i_16_, (short) 371)) {
						aByteArray2424[i_16_] |= 0x2;
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 99);
		if (i != 0) {
			throw new RuntimeException();
		}
		class282_sub35_sub2.initBitAccess((byte) 94);
		for (int i_18_ = 0; i_18_ < anInt2431 * 1265369243; i_18_++) {
			int i_19_ = anIntArray2426[i_18_];
			if ((aByteArray2424[i_19_] & 0x1) == 0) {
				if (i > 0) {
					i--;
					aByteArray2424[i_19_] |= 0x2;
				} else {
					int i_20_ = class282_sub35_sub2.readBits(1, (byte) 37);
					if (i_20_ == 0) {
						i = Class399.decodeSkip(class282_sub35_sub2, -1089696060);
						aByteArray2424[i_19_] |= 0x2;
					} else if (Class346.method6155(class282_sub35_sub2, i_19_, (short) 371)) {
						aByteArray2424[i_19_] |= 0x2;
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 64);
		if (i != 0) {
			throw new RuntimeException();
		}
		NUM_PLAYER_INDICES = 0;
		anInt2431 = 0;
		for (int i_21_ = 1; i_21_ < 2048; i_21_++) {
			aByteArray2424[i_21_] >>= 1;
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_21_];
			if (class521_sub1_sub1_sub2_sub1 != null) {
				PLAYER_INDICES[(NUM_PLAYER_INDICES += 1595438921) * -963499271 - 1] = i_21_;
			} else {
				anIntArray2426[(anInt2431 += -773593709) * 1265369243 - 1] = i_21_;
			}
		}
	}

	static final void method3191(RsBitsBuffer class282_sub35_sub2) {
		int i = 0;
		class282_sub35_sub2.initBitAccess((byte) -67);
		for (int i_22_ = 0; i_22_ < NUM_PLAYER_INDICES * -963499271; i_22_++) {
			int i_23_ = PLAYER_INDICES[i_22_];
			if ((aByteArray2424[i_23_] & 0x1) == 0) {
				if (i > 0) {
					i--;
					aByteArray2424[i_23_] |= 0x2;
				} else {
					int i_24_ = class282_sub35_sub2.readBits(1, (byte) -54);
					if (0 == i_24_) {
						i = Class399.decodeSkip(class282_sub35_sub2, -1089696060);
						aByteArray2424[i_23_] |= 0x2;
					} else {
						Class105.method1806(class282_sub35_sub2, i_23_, 2048402848);
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 122);
		if (i != 0) {
			throw new RuntimeException();
		}
		class282_sub35_sub2.initBitAccess((byte) -75);
		for (int i_25_ = 0; i_25_ < NUM_PLAYER_INDICES * -963499271; i_25_++) {
			int i_26_ = PLAYER_INDICES[i_25_];
			if ((aByteArray2424[i_26_] & 0x1) != 0) {
				if (i > 0) {
					i--;
					aByteArray2424[i_26_] |= 0x2;
				} else {
					int i_27_ = class282_sub35_sub2.readBits(1, (byte) 13);
					if (0 == i_27_) {
						i = Class399.decodeSkip(class282_sub35_sub2, -1089696060);
						aByteArray2424[i_26_] |= 0x2;
					} else {
						Class105.method1806(class282_sub35_sub2, i_26_, -1440268546);
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 62);
		if (i != 0) {
			throw new RuntimeException();
		}
		class282_sub35_sub2.initBitAccess((byte) 14);
		for (int i_28_ = 0; i_28_ < 1265369243 * anInt2431; i_28_++) {
			int i_29_ = anIntArray2426[i_28_];
			if (0 != (aByteArray2424[i_29_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray2424[i_29_] |= 0x2;
				} else {
					int i_30_ = class282_sub35_sub2.readBits(1, (byte) -16);
					if (0 == i_30_) {
						i = Class399.decodeSkip(class282_sub35_sub2, -1089696060);
						aByteArray2424[i_29_] |= 0x2;
					} else if (Class346.method6155(class282_sub35_sub2, i_29_, (short) 371)) {
						aByteArray2424[i_29_] |= 0x2;
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 96);
		if (i != 0) {
			throw new RuntimeException();
		}
		class282_sub35_sub2.initBitAccess((byte) -3);
		for (int i_31_ = 0; i_31_ < anInt2431 * 1265369243; i_31_++) {
			int i_32_ = anIntArray2426[i_31_];
			if ((aByteArray2424[i_32_] & 0x1) == 0) {
				if (i > 0) {
					i--;
					aByteArray2424[i_32_] |= 0x2;
				} else {
					int i_33_ = class282_sub35_sub2.readBits(1, (byte) 48);
					if (i_33_ == 0) {
						i = Class399.decodeSkip(class282_sub35_sub2, -1089696060);
						aByteArray2424[i_32_] |= 0x2;
					} else if (Class346.method6155(class282_sub35_sub2, i_32_, (short) 371)) {
						aByteArray2424[i_32_] |= 0x2;
					}
				}
			}
		}
		class282_sub35_sub2.finishBitAccess((byte) 112);
		if (i != 0) {
			throw new RuntimeException();
		}
		NUM_PLAYER_INDICES = 0;
		anInt2431 = 0;
		for (int i_34_ = 1; i_34_ < 2048; i_34_++) {
			aByteArray2424[i_34_] >>= 1;
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_34_];
			if (class521_sub1_sub1_sub2_sub1 != null) {
				PLAYER_INDICES[(NUM_PLAYER_INDICES += 1595438921) * -963499271 - 1] = i_34_;
			} else {
				anIntArray2426[(anInt2431 += -773593709) * 1265369243 - 1] = i_34_;
			}
		}
	}

	static int method3192(RsBitsBuffer class282_sub35_sub2) {
		int i = class282_sub35_sub2.readBits(2, (byte) 35);
		int i_35_;
		if (i == 0) {
			i_35_ = 0;
		} else if (1 == i) {
			i_35_ = class282_sub35_sub2.readBits(5, (byte) -55);
		} else if (i == 2) {
			i_35_ = class282_sub35_sub2.readBits(8, (byte) 16);
		} else {
			i_35_ = class282_sub35_sub2.readBits(11, (byte) -9);
		}
		return i_35_;
	}

	static int method3193(RsBitsBuffer class282_sub35_sub2) {
		int i = class282_sub35_sub2.readBits(2, (byte) -60);
		int i_36_;
		if (i == 0) {
			i_36_ = 0;
		} else if (1 == i) {
			i_36_ = class282_sub35_sub2.readBits(5, (byte) 17);
		} else if (i == 2) {
			i_36_ = class282_sub35_sub2.readBits(8, (byte) -71);
		} else {
			i_36_ = class282_sub35_sub2.readBits(11, (byte) 35);
		}
		return i_36_;
	}

	static void method3194(RsBitsBuffer class282_sub35_sub2, int i) {
		CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1594135891);
		boolean bool = class282_sub35_sub2.readBits(1, (byte) -71) == 1;
		if (bool) {
			anIntArray2435[(anInt2434 += 1879181821) * -706143403 - 1] = i;
		}
		int i_37_ = class282_sub35_sub2.readBits(2, (byte) -60);
		Player class521_sub1_sub1_sub2_sub1 = client.players[i];
		if (i_37_ == 0) {
			if (bool) {
				class521_sub1_sub1_sub2_sub1.aBool10568 = false;
			} else {
				if (i == 1595512269 * client.anInt7315) {
					throw new RuntimeException();
				}
				Class4 class4 = aClass4Array2430[i] = new Class4();
				class4.anInt31 = (-1096995395 * (((class219.y * -1002240017 + class521_sub1_sub1_sub2_sub1.regionBaseY[0]) >> 6) + ((class521_sub1_sub1_sub2_sub1.aByte7967 << 28) + ((1948093437 * class219.x + (class521_sub1_sub1_sub2_sub1.regionBaseX[0])) >> 6 << 14))));
				if (-1 != 327043279 * class521_sub1_sub1_sub2_sub1.faceDirection) {
					class4.anInt30 = class521_sub1_sub1_sub2_sub1.faceDirection * 20062537;
				} else {
					class4.anInt30 = class521_sub1_sub1_sub2_sub1.aClass19_10359.method578((byte) 2) * 2046380647;
				}
				class4.anInt32 = class521_sub1_sub1_sub2_sub1.faceEntity * -384342479;
				class4.aBool29 = class521_sub1_sub1_sub2_sub1.aBool10571;
				class4.aBool33 = class521_sub1_sub1_sub2_sub1.aBool10550;
				if (class521_sub1_sub1_sub2_sub1.isNpc * 1304574447 > 0) {
					Class149_Sub2.method14609(class521_sub1_sub1_sub2_sub1, -1660310904);
				}
				client.players[i] = null;
				if (class282_sub35_sub2.readBits(1, (byte) 23) != 0) {
					Class346.method6155(class282_sub35_sub2, i, (short) 371);
				}
			}
		} else if (i_37_ == 1) {
			int i_38_ = class282_sub35_sub2.readBits(3, (byte) 8);
			int i_39_ = class521_sub1_sub1_sub2_sub1.regionBaseX[0];
			int i_40_ = class521_sub1_sub1_sub2_sub1.regionBaseY[0];
			if (0 == i_38_) {
				i_39_--;
				i_40_--;
			} else if (i_38_ == 1) {
				i_40_--;
			} else if (2 == i_38_) {
				i_39_++;
				i_40_--;
			} else if (i_38_ == 3) {
				i_39_--;
			} else if (i_38_ == 4) {
				i_39_++;
			} else if (5 == i_38_) {
				i_39_--;
				i_40_++;
			} else if (6 == i_38_) {
				i_40_++;
			} else if (i_38_ == 7) {
				i_39_++;
				i_40_++;
			}
			if (bool) {
				class521_sub1_sub1_sub2_sub1.anInt10569 = i_39_ * -618896179;
				class521_sub1_sub1_sub2_sub1.anInt10570 = i_40_ * -108698839;
				class521_sub1_sub1_sub2_sub1.aBool10568 = true;
			} else {
				class521_sub1_sub1_sub2_sub1.method16129(i_39_, i_40_, playerMovementTypes[i], 627312378);
			}
		} else if (i_37_ == 2) {
			int i_41_ = class282_sub35_sub2.readBits(4, (byte) -79);
			int i_42_ = class521_sub1_sub1_sub2_sub1.regionBaseX[0];
			int i_43_ = class521_sub1_sub1_sub2_sub1.regionBaseY[0];
			if (0 == i_41_) {
				i_42_ -= 2;
				i_43_ -= 2;
			} else if (1 == i_41_) {
				i_42_--;
				i_43_ -= 2;
			} else if (i_41_ == 2) {
				i_43_ -= 2;
			} else if (3 == i_41_) {
				i_42_++;
				i_43_ -= 2;
			} else if (i_41_ == 4) {
				i_42_ += 2;
				i_43_ -= 2;
			} else if (i_41_ == 5) {
				i_42_ -= 2;
				i_43_--;
			} else if (i_41_ == 6) {
				i_42_ += 2;
				i_43_--;
			} else if (i_41_ == 7) {
				i_42_ -= 2;
			} else if (8 == i_41_) {
				i_42_ += 2;
			} else if (i_41_ == 9) {
				i_42_ -= 2;
				i_43_++;
			} else if (i_41_ == 10) {
				i_42_ += 2;
				i_43_++;
			} else if (i_41_ == 11) {
				i_42_ -= 2;
				i_43_ += 2;
			} else if (12 == i_41_) {
				i_42_--;
				i_43_ += 2;
			} else if (i_41_ == 13) {
				i_43_ += 2;
			} else if (i_41_ == 14) {
				i_42_++;
				i_43_ += 2;
			} else if (15 == i_41_) {
				i_42_ += 2;
				i_43_ += 2;
			}
			if (bool) {
				class521_sub1_sub1_sub2_sub1.anInt10569 = i_42_ * -618896179;
				class521_sub1_sub1_sub2_sub1.anInt10570 = -108698839 * i_43_;
				class521_sub1_sub1_sub2_sub1.aBool10568 = true;
			} else {
				class521_sub1_sub1_sub2_sub1.method16129(i_42_, i_43_, playerMovementTypes[i], 1545017017);
			}
		} else {
			int i_44_ = class282_sub35_sub2.readBits(1, (byte) -64);
			if (0 == i_44_) {
				int i_45_ = class282_sub35_sub2.readBits(12, (byte) -70);
				int i_46_ = i_45_ >> 10;
				int i_47_ = i_45_ >> 5 & 0x1f;
				if (i_47_ > 15) {
					i_47_ -= 32;
				}
				int i_48_ = i_45_ & 0x1f;
				if (i_48_ > 15) {
					i_48_ -= 32;
				}
				int i_49_ = i_47_ + class521_sub1_sub1_sub2_sub1.regionBaseX[0];
				int i_50_ = class521_sub1_sub1_sub2_sub1.regionBaseY[0] + i_48_;
				if (bool) {
					class521_sub1_sub1_sub2_sub1.anInt10569 = i_49_ * -618896179;
					class521_sub1_sub1_sub2_sub1.anInt10570 = -108698839 * i_50_;
					class521_sub1_sub1_sub2_sub1.aBool10568 = true;
				} else {
					class521_sub1_sub1_sub2_sub1.method16129(i_49_, i_50_, playerMovementTypes[i], 1625388888);
				}
				class521_sub1_sub1_sub2_sub1.aByte7967 = class521_sub1_sub1_sub2_sub1.aByte7968 = (byte) (i_46_ + class521_sub1_sub1_sub2_sub1.aByte7967 & 0x3);
				if (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).method5497(i_49_, i_50_, 1715483217)) {
					class521_sub1_sub1_sub2_sub1.aByte7968++;
				}
				if (i == 1595512269 * client.anInt7315 && (class521_sub1_sub1_sub2_sub1.aByte7967 != Class4.anInt35 * 675588453)) {
					Class4.anInt35 = class521_sub1_sub1_sub2_sub1.aByte7967 * -647602067;
				}
			} else {
				int i_51_ = class282_sub35_sub2.readBits(30, (byte) -1);
				int i_52_ = i_51_ >> 28;
				int i_53_ = i_51_ >> 14 & 0x3fff;
				int i_54_ = i_51_ & 0x3fff;
				int i_55_ = ((i_53_ + (class219.x * 1948093437 + (class521_sub1_sub1_sub2_sub1.regionBaseX[0])) & 0x3fff) - 1948093437 * class219.x);
				int i_56_ = (i_54_ + (class521_sub1_sub1_sub2_sub1.regionBaseY[0] + class219.y * -1002240017) & 0x3fff) - class219.y * -1002240017;
				if (bool) {
					class521_sub1_sub1_sub2_sub1.anInt10569 = i_55_ * -618896179;
					class521_sub1_sub1_sub2_sub1.anInt10570 = i_56_ * -108698839;
					class521_sub1_sub1_sub2_sub1.aBool10568 = true;
				} else {
					class521_sub1_sub1_sub2_sub1.method16129(i_55_, i_56_, playerMovementTypes[i], -2068435898);
				}
				class521_sub1_sub1_sub2_sub1.aByte7967 = class521_sub1_sub1_sub2_sub1.aByte7968 = (byte) (i_52_ + class521_sub1_sub1_sub2_sub1.aByte7967 & 0x3);
				if (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).method5497(i_55_, i_56_, 2133037824)) {
					class521_sub1_sub1_sub2_sub1.aByte7968++;
				}
				if (i == client.anInt7315 * 1595512269) {
					Class4.anInt35 = class521_sub1_sub1_sub2_sub1.aByte7967 * -647602067;
				}
			}
		}
	}

	static boolean method3195(RsBitsBuffer class282_sub35_sub2, int i) {
		int i_57_ = class282_sub35_sub2.readBits(2, (byte) -51);
		if (i_57_ == 0) {
			if (class282_sub35_sub2.readBits(1, (byte) 115) != 0) {
				Class346.method6155(class282_sub35_sub2, i, (short) 371);
			}
			int i_58_ = class282_sub35_sub2.readBits(6, (byte) 11);
			int i_59_ = class282_sub35_sub2.readBits(6, (byte) 47);
			boolean bool = class282_sub35_sub2.readBits(1, (byte) 29) == 1;
			if (bool) {
				anIntArray2435[(anInt2434 += 1879181821) * -706143403 - 1] = i;
			}
			if (null != client.players[i]) {
				throw new RuntimeException();
			}
			Class4 class4 = aClass4Array2430[i];
			Player class521_sub1_sub1_sub2_sub1 = (client.players[i] = (new Player(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1686016454))));
			class521_sub1_sub1_sub2_sub1.anInt10314 = -1498872675 * i;
			if (aClass282_Sub35Array2428[i] != null) {
				class521_sub1_sub1_sub2_sub1.decodeAppearance(aClass282_Sub35Array2428[i], 1925099603);
			}
			class521_sub1_sub1_sub2_sub1.method15791((class4.anInt30 * 1348874583), true, (byte) 11);
			class521_sub1_sub1_sub2_sub1.faceEntity = -1796197679 * class4.anInt32;
			int i_60_ = -1268681323 * class4.anInt31;
			int i_61_ = i_60_ >> 28;
			int i_62_ = i_60_ >> 14 & 0xff;
			int i_63_ = i_60_ & 0xff;
			CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(274408413);
			int i_64_ = (i_62_ << 6) + i_58_ - class219.x * 1948093437;
			int i_65_ = i_59_ + (i_63_ << 6) - class219.y * -1002240017;
			class521_sub1_sub1_sub2_sub1.aBool10571 = class4.aBool29;
			class521_sub1_sub1_sub2_sub1.aBool10550 = class4.aBool33;
			class521_sub1_sub1_sub2_sub1.aByteArray10365[0] = playerMovementTypes[i];
			class521_sub1_sub1_sub2_sub1.aByte7967 = class521_sub1_sub1_sub2_sub1.aByte7968 = (byte) i_61_;
			if (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).method5497(i_64_, i_65_, 1814280802)) {
				class521_sub1_sub1_sub2_sub1.aByte7968++;
			}
			class521_sub1_sub1_sub2_sub1.method16130(i_64_, i_65_, -499751905);
			class521_sub1_sub1_sub2_sub1.aBool10568 = false;
			aClass4Array2430[i] = null;
			return true;
		}
		if (1 == i_57_) {
			int i_66_ = class282_sub35_sub2.readBits(2, (byte) -20);
			int i_67_ = -1268681323 * aClass4Array2430[i].anInt31;
			aClass4Array2430[i].anInt31 = -1096995395 * (((i_66_ + (i_67_ >> 28) & 0x3) << 28) + (i_67_ & 0xfffffff));
			return false;
		}
		if (i_57_ == 2) {
			int i_68_ = class282_sub35_sub2.readBits(5, (byte) -57);
			int i_69_ = i_68_ >> 3;
			int i_70_ = i_68_ & 0x7;
			int i_71_ = -1268681323 * aClass4Array2430[i].anInt31;
			int i_72_ = (i_71_ >> 28) + i_69_ & 0x3;
			int i_73_ = i_71_ >> 14 & 0xff;
			int i_74_ = i_71_ & 0xff;
			if (i_70_ == 0) {
				i_73_--;
				i_74_--;
			}
			if (1 == i_70_) {
				i_74_--;
			}
			if (i_70_ == 2) {
				i_73_++;
				i_74_--;
			}
			if (i_70_ == 3) {
				i_73_--;
			}
			if (i_70_ == 4) {
				i_73_++;
			}
			if (5 == i_70_) {
				i_73_--;
				i_74_++;
			}
			if (i_70_ == 6) {
				i_74_++;
			}
			if (7 == i_70_) {
				i_73_++;
				i_74_++;
			}
			aClass4Array2430[i].anInt31 = -1096995395 * ((i_72_ << 28) + (i_73_ << 14) + i_74_);
			return false;
		}
		int i_75_ = class282_sub35_sub2.readBits(18, (byte) 14);
		int i_76_ = i_75_ >> 16;
		int i_77_ = i_75_ >> 8 & 0xff;
		int i_78_ = i_75_ & 0xff;
		int i_79_ = -1268681323 * aClass4Array2430[i].anInt31;
		int i_80_ = i_76_ + (i_79_ >> 28) & 0x3;
		int i_81_ = i_77_ + (i_79_ >> 14) & 0xff;
		int i_82_ = i_78_ + i_79_ & 0xff;
		aClass4Array2430[i].anInt31 = ((i_81_ << 14) + (i_80_ << 28) + i_82_) * -1096995395;
		return false;
	}

	static final void method3196(RsBitsBuffer class282_sub35_sub2) {
		for (int i = 0; i < anInt2434 * -706143403; i++) {
			int i_83_ = anIntArray2435[i];
			Player class521_sub1_sub1_sub2_sub1 = client.players[i_83_];
			int i_84_ = class282_sub35_sub2.readUnsignedByte();
			if ((i_84_ & 0x8) != 0) {
				i_84_ += class282_sub35_sub2.readUnsignedByte() << 8;
			}
			if ((i_84_ & 0x100) != 0) {
				i_84_ += class282_sub35_sub2.readUnsignedByte() << 16;
			}
			Class282_Sub15_Sub5.decodeMasks(class282_sub35_sub2, i_83_, class521_sub1_sub1_sub2_sub1, i_84_, -303630036);
		}
	}

	static final void method3197(RsBitsBuffer class282_sub35_sub2, int i, Player class521_sub1_sub1_sub2_sub1, int i_85_) {
		byte i_86_ = Class249.aClass249_3083.aByte3085;
		if ((i_85_ & 0x20000) != 0) {
			class521_sub1_sub1_sub2_sub1.aByte10371 = class282_sub35_sub2.readByte((short) -9035);
			class521_sub1_sub1_sub2_sub1.aByte10327 = class282_sub35_sub2.readByteC(1915533742);
			class521_sub1_sub1_sub2_sub1.aByte10364 = class282_sub35_sub2.read128Byte((short) 23222);
			class521_sub1_sub1_sub2_sub1.aByte10352 = (byte) class282_sub35_sub2.readUnsigned128Byte();
			class521_sub1_sub1_sub2_sub1.anInt10347 = ((-1809259861 * client.cycles + class282_sub35_sub2.readUnsignedShort128()) * -245378127);
			class521_sub1_sub1_sub2_sub1.anInt10348 = (client.cycles * -1809259861 + class282_sub35_sub2.readUnsignedShort()) * 485671023;
		}
		if ((i_85_ & 0x400000) != 0) {
			int i_87_ = ((class282_sub35_sub2.buffer[((class282_sub35_sub2.index += -1115476867) * -1990677291) - 1]) & 0xff);
			for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
				int i_89_ = class282_sub35_sub2.readShortLE((byte) -57);
				int i_90_ = class282_sub35_sub2.readInt();
				class521_sub1_sub1_sub2_sub1.aClass155_10561.method2625(i_89_, i_90_, (byte) 28);
			}
		}
		if ((i_85_ & 0x200) != 0) {
			int i_91_ = class282_sub35_sub2.readUnsignedShort();
			int i_92_ = class282_sub35_sub2.readIntV2(-25964997);
			if (i_91_ == 65535) {
				i_91_ = -1;
			}
			int i_93_ = class282_sub35_sub2.readUnsigned128Byte();
			int i_94_ = i_93_ & 0x7;
			int i_95_ = i_93_ >> 3 & 0xf;
			if (i_95_ == 15) {
				i_95_ = -1;
			}
			boolean bool = (i_93_ >> 7 & 0x1) == 1;
			class521_sub1_sub1_sub2_sub1.sendGraphics(i_91_, i_92_, i_94_, i_95_, bool, 1, 1515305540);
		}
		if ((i_85_ & 0x20) != 0) {
			class521_sub1_sub1_sub2_sub1.faceDirection = class282_sub35_sub2.readUnsignedShort128() * 1435090479;
			if (1871221471 * class521_sub1_sub1_sub2_sub1.anInt10355 == 0) {
				class521_sub1_sub1_sub2_sub1.method15863(327043279 * class521_sub1_sub1_sub2_sub1.faceDirection, 1937376256);
				class521_sub1_sub1_sub2_sub1.faceDirection = -1435090479;
			}
		}
		if (0 != (i_85_ & 0x800000)) {
			class521_sub1_sub1_sub2_sub1.aClass155_10561.method2624(-658434154);
			int i_96_ = ((class282_sub35_sub2.buffer[((class282_sub35_sub2.index += -1115476867) * -1990677291) - 1]) & 0xff);
			for (int i_97_ = 0; i_97_ < i_96_; i_97_++) {
				int i_98_ = class282_sub35_sub2.readShortLE((byte) -108);
				int i_99_ = class282_sub35_sub2.readInt();
				class521_sub1_sub1_sub2_sub1.aClass155_10561.method2625(i_98_, i_99_, (byte) 28);
			}
		}
		if ((i_85_ & 0x10000) != 0) {
			class521_sub1_sub1_sub2_sub1.aBool10550 = class282_sub35_sub2.readUnsigned128Byte() == 1;
		}
		if (0 != (i_85_ & 0x100000)) {
			int i_100_ = class282_sub35_sub2.readUnsigned128Byte();
			int[] is = new int[i_100_];
			int[] is_101_ = new int[i_100_];
			for (int i_102_ = 0; i_102_ < i_100_; i_102_++) {
				int i_103_ = class282_sub35_sub2.readUnsignedShort128();
				if ((i_103_ & 0xc000) == 49152) {
					int i_104_ = class282_sub35_sub2.readUnsignedShort128();
					is[i_102_] = i_103_ << 16 | i_104_;
				} else {
					is[i_102_] = i_103_;
				}
				is_101_[i_102_] = class282_sub35_sub2.readUnsignedShort();
			}
			class521_sub1_sub1_sub2_sub1.method15797(is, is_101_, -1858199952);
		}
		if (0 != (i_85_ & 0x4000)) {
			String string = class282_sub35_sub2.readString();
			if (class521_sub1_sub1_sub2_sub1 == Class84.myPlayer) {
				Class191.method3167(2, 0, class521_sub1_sub1_sub2_sub1.method16127(true, 1977063343), class521_sub1_sub1_sub2_sub1.method16128(false, 1912893547), class521_sub1_sub1_sub2_sub1.username, string, 687302716);
			}
			class521_sub1_sub1_sub2_sub1.sendChat(string, 0, 0, (byte) 25);
		}
		if ((i_85_ & 0x80000) != 0) {
			String string = class282_sub35_sub2.readString();
			int i_105_ = class282_sub35_sub2.readUnsignedByte128(-1331612853);
			if (0 != (i_105_ & 0x1)) {
				Class191.method3167(2, i_105_, class521_sub1_sub1_sub2_sub1.method16127(true, 2122028638), class521_sub1_sub1_sub2_sub1.method16128(false, 1912893547), class521_sub1_sub1_sub2_sub1.username, string, 631262557);
			}
			class521_sub1_sub1_sub2_sub1.sendChat(string, 0, 0, (byte) -47);
		}
		if ((i_85_ & 0x40000) != 0) {
			int i_106_ = class282_sub35_sub2.readShortLE128();
			int i_107_ = class282_sub35_sub2.readIntV2(-1896041573);
			if (i_106_ == 65535) {
				i_106_ = -1;
			}
			int i_108_ = class282_sub35_sub2.readUnsignedByte128(-1199981990);
			int i_109_ = i_108_ & 0x7;
			int i_110_ = i_108_ >> 3 & 0xf;
			if (15 == i_110_) {
				i_110_ = -1;
			}
			boolean bool = (i_108_ >> 7 & 0x1) == 1;
			class521_sub1_sub1_sub2_sub1.sendGraphics(i_106_, i_107_, i_109_, i_110_, bool, 2, 185008599);
		}
		if ((i_85_ & 0x8000) != 0) {
			class521_sub1_sub1_sub2_sub1.aBool10571 = class282_sub35_sub2.readUnsigned128Byte() == 1;
		}
		if ((i_85_ & 0x40) != 0) {
			int i_111_ = class282_sub35_sub2.readUnsigned128Byte();
			if (i_111_ > 0) {
				for (int i_112_ = 0; i_112_ < i_111_; i_112_++) {
					int i_113_ = -1;
					int i_114_ = -1;
					int i_115_ = -1;
					int i_116_ = class282_sub35_sub2.readUnsignedSmart(1844730971);
					if (i_116_ == 32767) {
						i_116_ = class282_sub35_sub2.readUnsignedSmart(1707515196);
						i_114_ = class282_sub35_sub2.readUnsignedSmart(1623096549);
						i_113_ = class282_sub35_sub2.readUnsignedSmart(1678908570);
						i_115_ = class282_sub35_sub2.readUnsignedSmart(1521225347);
					} else if (i_116_ != 32766) {
						i_114_ = class282_sub35_sub2.readUnsignedSmart(2034561158);
					} else {
						i_116_ = -1;
						i_114_ = class282_sub35_sub2.readUnsignedByteC(501623833);
					}
					int i_117_ = class282_sub35_sub2.readUnsignedSmart(2040042683);
					class521_sub1_sub1_sub2_sub1.applyHit(i_116_, i_114_, i_113_, i_115_, (client.cycles * -1809259861), i_117_, -1432048011);
				}
			}
			int i_118_ = class282_sub35_sub2.readUnsignedByte();
			if (i_118_ > 0) {
				for (int i_119_ = 0; i_119_ < i_118_; i_119_++) {
					int i_120_ = class282_sub35_sub2.readUnsignedSmart(1615035560);
					int i_121_ = class282_sub35_sub2.readUnsignedSmart(2067023273);
					if (32767 != i_121_) {
						int i_122_ = class282_sub35_sub2.readUnsignedSmart(1701419819);
						int i_123_ = class282_sub35_sub2.readUnsigned128Byte();
						int i_124_ = (i_121_ > 0 ? class282_sub35_sub2.readUnsignedByte128(-988806076) : i_123_);
						class521_sub1_sub1_sub2_sub1.displayHitbar(i_120_, -1809259861 * client.cycles, i_121_, i_122_, i_123_, i_124_, (byte) 0);
					} else {
						class521_sub1_sub1_sub2_sub1.method15857(i_120_, 1885735347);
					}
				}
			}
		}
		if ((i_85_ & 0x1) != 0) {
			int i_125_ = class282_sub35_sub2.readUnsignedByteC(1028462105);
			byte[] is = new byte[i_125_];
			RsByteBuffer class282_sub35 = new RsByteBuffer(is);
			class282_sub35_sub2.readBytes(is, 0, i_125_, 259756907);
			aClass282_Sub35Array2428[i] = class282_sub35;
			class521_sub1_sub1_sub2_sub1.decodeAppearance(class282_sub35, 1925099603);
		}
		if ((i_85_ & 0x10) != 0) {
			int[] is = new int[Class8_Sub3.method14339(973698480).length];
			for (int i_126_ = 0; i_126_ < Class8_Sub3.method14339(408503418).length; i_126_++) {
				is[i_126_] = class282_sub35_sub2.readBigSmart();
			}
			int i_127_ = class282_sub35_sub2.readUnsignedByte();
			Class20.animate(class521_sub1_sub1_sub2_sub1, is, i_127_, false, (byte) 117);
		}
		if (0 != (i_85_ & 0x2)) {
			int i_128_ = class282_sub35_sub2.readUnsignedShort128();
			if (i_128_ == 65535) {
				i_128_ = -1;
			}
			class521_sub1_sub1_sub2_sub1.faceEntity = i_128_ * -2059452093;
		}
		if (0 != (i_85_ & 0x1000)) {
			i_86_ = class282_sub35_sub2.readByteC(1074670857);
		}
		if (0 != (i_85_ & 0x2000)) {
			int i_129_ = class282_sub35_sub2.readUnsigned128Byte();
			int[] is = new int[i_129_];
			int[] is_130_ = new int[i_129_];
			int[] is_131_ = new int[i_129_];
			for (int i_132_ = 0; i_132_ < i_129_; i_132_++) {
				is[i_132_] = class282_sub35_sub2.readBigSmart();
				is_130_[i_132_] = class282_sub35_sub2.readUnsignedByteC(563098191);
				is_131_[i_132_] = class282_sub35_sub2.readShortLE128();
			}
			Class331.method5923(class521_sub1_sub1_sub2_sub1, is, is_130_, is_131_, 128588848);
		}
		if (0 != (i_85_ & 0x4)) {
			playerMovementTypes[i] = class282_sub35_sub2.read128Byte((short) 8202);
		}
		if (0 != (i_85_ & 0x200000)) {
			int i_133_ = class282_sub35_sub2.readShortLE((byte) -128);
			int i_134_ = class282_sub35_sub2.readIntLE();
			if (65535 == i_133_) {
				i_133_ = -1;
			}
			int i_135_ = class282_sub35_sub2.readUnsigned128Byte();
			int i_136_ = i_135_ & 0x7;
			int i_137_ = i_135_ >> 3 & 0xf;
			if (i_137_ == 15) {
				i_137_ = -1;
			}
			boolean bool = (i_135_ >> 7 & 0x1) == 1;
			class521_sub1_sub1_sub2_sub1.sendGraphics(i_133_, i_134_, i_136_, i_137_, bool, 3, 1934522338);
		}
		if (0 != (i_85_ & 0x800)) {
			class521_sub1_sub1_sub2_sub1.anInt10326 = class282_sub35_sub2.readByteC(658414351) * 830034083;
			class521_sub1_sub1_sub2_sub1.anInt10328 = class282_sub35_sub2.read128Byte((short) -4462) * -2091025609;
			class521_sub1_sub1_sub2_sub1.anInt10341 = class282_sub35_sub2.readByte128(1666792848) * 1110107435;
			class521_sub1_sub1_sub2_sub1.anInt10343 = class282_sub35_sub2.readByteC(895392345) * -1352948627;
			class521_sub1_sub1_sub2_sub1.anInt10342 = (class282_sub35_sub2.readShortLE128() + -1809259861 * client.cycles) * -506987231;
			class521_sub1_sub1_sub2_sub1.anInt10345 = (class282_sub35_sub2.readShortLE((byte) -126) + -1809259861 * client.cycles) * -38144783;
			class521_sub1_sub1_sub2_sub1.anInt10346 = class282_sub35_sub2.readUnsignedShort128() * -19018465;
			if (class521_sub1_sub1_sub2_sub1.aBool10568) {
				class521_sub1_sub1_sub2_sub1.anInt10326 += -358216913 * class521_sub1_sub1_sub2_sub1.anInt10569;
				class521_sub1_sub1_sub2_sub1.anInt10328 += class521_sub1_sub1_sub2_sub1.anInt10570 * 1391269727;
				class521_sub1_sub1_sub2_sub1.anInt10341 += 505622999 * class521_sub1_sub1_sub2_sub1.anInt10569;
				class521_sub1_sub1_sub2_sub1.anInt10343 += -858307675 * class521_sub1_sub1_sub2_sub1.anInt10570;
				class521_sub1_sub1_sub2_sub1.anInt10355 = 0;
			} else {
				class521_sub1_sub1_sub2_sub1.anInt10326 += (830034083 * class521_sub1_sub1_sub2_sub1.regionBaseX[0]);
				class521_sub1_sub1_sub2_sub1.anInt10328 += (class521_sub1_sub1_sub2_sub1.regionBaseY[0] * -2091025609);
				class521_sub1_sub1_sub2_sub1.anInt10341 += (1110107435 * class521_sub1_sub1_sub2_sub1.regionBaseX[0]);
				class521_sub1_sub1_sub2_sub1.anInt10343 += (-1352948627 * class521_sub1_sub1_sub2_sub1.regionBaseY[0]);
				class521_sub1_sub1_sub2_sub1.anInt10355 = -2086688481;
			}
			class521_sub1_sub1_sub2_sub1.anInt10367 = 0;
		}
		if (0 != (i_85_ & 0x80)) {
			int i_138_ = class282_sub35_sub2.readShortLE((byte) -26);
			int i_139_ = class282_sub35_sub2.readInt();
			if (i_138_ == 65535) {
				i_138_ = -1;
			}
			int i_140_ = class282_sub35_sub2.readUnsignedByte128(-1461379949);
			int i_141_ = i_140_ & 0x7;
			int i_142_ = i_140_ >> 3 & 0xf;
			if (15 == i_142_) {
				i_142_ = -1;
			}
			boolean bool = (i_140_ >> 7 & 0x1) == 1;
			class521_sub1_sub1_sub2_sub1.sendGraphics(i_138_, i_139_, i_141_, i_142_, bool, 0, -6273545);
		}
		if (class521_sub1_sub1_sub2_sub1.aBool10568) {
			if (i_86_ == 127) {
				class521_sub1_sub1_sub2_sub1.method16130(997861381 * class521_sub1_sub1_sub2_sub1.anInt10569, 487713049 * class521_sub1_sub1_sub2_sub1.anInt10570, -1399989018);
			} else {
				byte i_143_;
				if (Class249.aClass249_3083.aByte3085 != i_86_) {
					i_143_ = i_86_;
				} else {
					i_143_ = playerMovementTypes[i];
				}
				Class236.method3985(class521_sub1_sub1_sub2_sub1, i_143_, (byte) -100);
				class521_sub1_sub1_sub2_sub1.method16129(class521_sub1_sub1_sub2_sub1.anInt10569 * 997861381, 487713049 * class521_sub1_sub1_sub2_sub1.anInt10570, i_143_, 2032978161);
			}
		}
	}

	static final void method3198(RsBitsBuffer class282_sub35_sub2, int i, Player class521_sub1_sub1_sub2_sub1, int i_144_) {
		byte i_145_ = Class249.aClass249_3083.aByte3085;
		if ((i_144_ & 0x20000) != 0) {
			class521_sub1_sub1_sub2_sub1.aByte10371 = class282_sub35_sub2.readByte((short) -14091);
			class521_sub1_sub1_sub2_sub1.aByte10327 = class282_sub35_sub2.readByteC(774353542);
			class521_sub1_sub1_sub2_sub1.aByte10364 = class282_sub35_sub2.read128Byte((short) 17193);
			class521_sub1_sub1_sub2_sub1.aByte10352 = (byte) class282_sub35_sub2.readUnsigned128Byte();
			class521_sub1_sub1_sub2_sub1.anInt10347 = (-1809259861 * client.cycles + class282_sub35_sub2.readUnsignedShort128()) * -245378127;
			class521_sub1_sub1_sub2_sub1.anInt10348 = (client.cycles * -1809259861 + class282_sub35_sub2.readUnsignedShort()) * 485671023;
		}
		if ((i_144_ & 0x400000) != 0) {
			int i_146_ = ((class282_sub35_sub2.buffer[((class282_sub35_sub2.index += -1115476867) * -1990677291) - 1]) & 0xff);
			for (int i_147_ = 0; i_147_ < i_146_; i_147_++) {
				int i_148_ = class282_sub35_sub2.readShortLE((byte) -73);
				int i_149_ = class282_sub35_sub2.readInt();
				class521_sub1_sub1_sub2_sub1.aClass155_10561.method2625(i_148_, i_149_, (byte) 28);
			}
		}
		if ((i_144_ & 0x200) != 0) {
			int i_150_ = class282_sub35_sub2.readUnsignedShort();
			int i_151_ = class282_sub35_sub2.readIntV2(-2126285370);
			if (i_150_ == 65535) {
				i_150_ = -1;
			}
			int i_152_ = class282_sub35_sub2.readUnsigned128Byte();
			int i_153_ = i_152_ & 0x7;
			int i_154_ = i_152_ >> 3 & 0xf;
			if (i_154_ == 15) {
				i_154_ = -1;
			}
			boolean bool = (i_152_ >> 7 & 0x1) == 1;
			class521_sub1_sub1_sub2_sub1.sendGraphics(i_150_, i_151_, i_153_, i_154_, bool, 1, -525142902);
		}
		if ((i_144_ & 0x20) != 0) {
			class521_sub1_sub1_sub2_sub1.faceDirection = class282_sub35_sub2.readUnsignedShort128() * 1435090479;
			if (1871221471 * class521_sub1_sub1_sub2_sub1.anInt10355 == 0) {
				class521_sub1_sub1_sub2_sub1.method15863(327043279 * class521_sub1_sub1_sub2_sub1.faceDirection, 1927457279);
				class521_sub1_sub1_sub2_sub1.faceDirection = -1435090479;
			}
		}
		if (0 != (i_144_ & 0x800000)) {
			class521_sub1_sub1_sub2_sub1.aClass155_10561.method2624(773060425);
			int i_155_ = ((class282_sub35_sub2.buffer[((class282_sub35_sub2.index += -1115476867) * -1990677291) - 1]) & 0xff);
			for (int i_156_ = 0; i_156_ < i_155_; i_156_++) {
				int i_157_ = class282_sub35_sub2.readShortLE((byte) -13);
				int i_158_ = class282_sub35_sub2.readInt();
				class521_sub1_sub1_sub2_sub1.aClass155_10561.method2625(i_157_, i_158_, (byte) 28);
			}
		}
		if ((i_144_ & 0x10000) != 0) {
			class521_sub1_sub1_sub2_sub1.aBool10550 = class282_sub35_sub2.readUnsigned128Byte() == 1;
		}
		if (0 != (i_144_ & 0x100000)) {
			int i_159_ = class282_sub35_sub2.readUnsigned128Byte();
			int[] is = new int[i_159_];
			int[] is_160_ = new int[i_159_];
			for (int i_161_ = 0; i_161_ < i_159_; i_161_++) {
				int i_162_ = class282_sub35_sub2.readUnsignedShort128();
				if ((i_162_ & 0xc000) == 49152) {
					int i_163_ = class282_sub35_sub2.readUnsignedShort128();
					is[i_161_] = i_162_ << 16 | i_163_;
				} else {
					is[i_161_] = i_162_;
				}
				is_160_[i_161_] = class282_sub35_sub2.readUnsignedShort();
			}
			class521_sub1_sub1_sub2_sub1.method15797(is, is_160_, -1858199952);
		}
		if (0 != (i_144_ & 0x4000)) {
			String string = class282_sub35_sub2.readString();
			if (class521_sub1_sub1_sub2_sub1 == Class84.myPlayer) {
				Class191.method3167(2, 0, class521_sub1_sub1_sub2_sub1.method16127(true, 2017893615), class521_sub1_sub1_sub2_sub1.method16128(false, 1912893547), class521_sub1_sub1_sub2_sub1.username, string, 2015691220);
			}
			class521_sub1_sub1_sub2_sub1.sendChat(string, 0, 0, (byte) 55);
		}
		if ((i_144_ & 0x80000) != 0) {
			String string = class282_sub35_sub2.readString();
			int i_164_ = class282_sub35_sub2.readUnsignedByte128(-1588435490);
			if (0 != (i_164_ & 0x1)) {
				Class191.method3167(2, i_164_, class521_sub1_sub1_sub2_sub1.method16127(true, 2143594267), class521_sub1_sub1_sub2_sub1.method16128(false, 1912893547), class521_sub1_sub1_sub2_sub1.username, string, 1966845672);
			}
			class521_sub1_sub1_sub2_sub1.sendChat(string, 0, 0, (byte) 105);
		}
		if ((i_144_ & 0x40000) != 0) {
			int i_165_ = class282_sub35_sub2.readShortLE128();
			int i_166_ = class282_sub35_sub2.readIntV2(-216431103);
			if (i_165_ == 65535) {
				i_165_ = -1;
			}
			int i_167_ = class282_sub35_sub2.readUnsignedByte128(-1034352976);
			int i_168_ = i_167_ & 0x7;
			int i_169_ = i_167_ >> 3 & 0xf;
			if (15 == i_169_) {
				i_169_ = -1;
			}
			boolean bool = (i_167_ >> 7 & 0x1) == 1;
			class521_sub1_sub1_sub2_sub1.sendGraphics(i_165_, i_166_, i_168_, i_169_, bool, 2, -107171490);
		}
		if ((i_144_ & 0x8000) != 0) {
			class521_sub1_sub1_sub2_sub1.aBool10571 = class282_sub35_sub2.readUnsigned128Byte() == 1;
		}
		if ((i_144_ & 0x40) != 0) {
			int i_170_ = class282_sub35_sub2.readUnsigned128Byte();
			if (i_170_ > 0) {
				for (int i_171_ = 0; i_171_ < i_170_; i_171_++) {
					int i_172_ = -1;
					int i_173_ = -1;
					int i_174_ = -1;
					int i_175_ = class282_sub35_sub2.readUnsignedSmart(2081654975);
					if (i_175_ == 32767) {
						i_175_ = class282_sub35_sub2.readUnsignedSmart(1601547176);
						i_173_ = class282_sub35_sub2.readUnsignedSmart(2058418892);
						i_172_ = class282_sub35_sub2.readUnsignedSmart(2119060561);
						i_174_ = class282_sub35_sub2.readUnsignedSmart(1698501365);
					} else if (i_175_ != 32766) {
						i_173_ = class282_sub35_sub2.readUnsignedSmart(1912165375);
					} else {
						i_175_ = -1;
						i_173_ = class282_sub35_sub2.readUnsignedByteC(-1076171132);
					}
					int i_176_ = class282_sub35_sub2.readUnsignedSmart(1579570459);
					class521_sub1_sub1_sub2_sub1.applyHit(i_175_, i_173_, i_172_, i_174_, (client.cycles * -1809259861), i_176_, -1804684827);
				}
			}
			int i_177_ = class282_sub35_sub2.readUnsignedByte();
			if (i_177_ > 0) {
				for (int i_178_ = 0; i_178_ < i_177_; i_178_++) {
					int i_179_ = class282_sub35_sub2.readUnsignedSmart(1900870336);
					int i_180_ = class282_sub35_sub2.readUnsignedSmart(1952868041);
					if (32767 != i_180_) {
						int i_181_ = class282_sub35_sub2.readUnsignedSmart(1882331652);
						int i_182_ = class282_sub35_sub2.readUnsigned128Byte();
						int i_183_ = (i_180_ > 0 ? class282_sub35_sub2.readUnsignedByte128(-1533432726) : i_182_);
						class521_sub1_sub1_sub2_sub1.displayHitbar(i_179_, -1809259861 * client.cycles, i_180_, i_181_, i_182_, i_183_, (byte) 0);
					} else {
						class521_sub1_sub1_sub2_sub1.method15857(i_179_, 1885735347);
					}
				}
			}
		}
		if ((i_144_ & 0x1) != 0) {
			int i_184_ = class282_sub35_sub2.readUnsignedByteC(-1722023329);
			byte[] is = new byte[i_184_];
			RsByteBuffer class282_sub35 = new RsByteBuffer(is);
			class282_sub35_sub2.readBytes(is, 0, i_184_, 1837106672);
			aClass282_Sub35Array2428[i] = class282_sub35;
			class521_sub1_sub1_sub2_sub1.decodeAppearance(class282_sub35, 1925099603);
		}
		if ((i_144_ & 0x10) != 0) {
			int[] is = new int[Class8_Sub3.method14339(722202366).length];
			for (int i_185_ = 0; i_185_ < Class8_Sub3.method14339(976638333).length; i_185_++) {
				is[i_185_] = class282_sub35_sub2.readBigSmart();
			}
			int i_186_ = class282_sub35_sub2.readUnsignedByte();
			Class20.animate(class521_sub1_sub1_sub2_sub1, is, i_186_, false, (byte) 16);
		}
		if (0 != (i_144_ & 0x2)) {
			int i_187_ = class282_sub35_sub2.readUnsignedShort128();
			if (i_187_ == 65535) {
				i_187_ = -1;
			}
			class521_sub1_sub1_sub2_sub1.faceEntity = i_187_ * -2059452093;
		}
		if (0 != (i_144_ & 0x1000)) {
			i_145_ = class282_sub35_sub2.readByteC(367948723);
		}
		if (0 != (i_144_ & 0x2000)) {
			int i_188_ = class282_sub35_sub2.readUnsigned128Byte();
			int[] is = new int[i_188_];
			int[] is_189_ = new int[i_188_];
			int[] is_190_ = new int[i_188_];
			for (int i_191_ = 0; i_191_ < i_188_; i_191_++) {
				is[i_191_] = class282_sub35_sub2.readBigSmart();
				is_189_[i_191_] = class282_sub35_sub2.readUnsignedByteC(-1788087815);
				is_190_[i_191_] = class282_sub35_sub2.readShortLE128();
			}
			Class331.method5923(class521_sub1_sub1_sub2_sub1, is, is_189_, is_190_, 814853076);
		}
		if (0 != (i_144_ & 0x4)) {
			playerMovementTypes[i] = class282_sub35_sub2.read128Byte((short) 3667);
		}
		if (0 != (i_144_ & 0x200000)) {
			int i_192_ = class282_sub35_sub2.readShortLE((byte) -75);
			int i_193_ = class282_sub35_sub2.readIntLE();
			if (65535 == i_192_) {
				i_192_ = -1;
			}
			int i_194_ = class282_sub35_sub2.readUnsigned128Byte();
			int i_195_ = i_194_ & 0x7;
			int i_196_ = i_194_ >> 3 & 0xf;
			if (i_196_ == 15) {
				i_196_ = -1;
			}
			boolean bool = (i_194_ >> 7 & 0x1) == 1;
			class521_sub1_sub1_sub2_sub1.sendGraphics(i_192_, i_193_, i_195_, i_196_, bool, 3, -987124351);
		}
		if (0 != (i_144_ & 0x800)) {
			class521_sub1_sub1_sub2_sub1.anInt10326 = class282_sub35_sub2.readByteC(98099387) * 830034083;
			class521_sub1_sub1_sub2_sub1.anInt10328 = class282_sub35_sub2.read128Byte((short) 11446) * -2091025609;
			class521_sub1_sub1_sub2_sub1.anInt10341 = class282_sub35_sub2.readByte128(1845987023) * 1110107435;
			class521_sub1_sub1_sub2_sub1.anInt10343 = class282_sub35_sub2.readByteC(533099482) * -1352948627;
			class521_sub1_sub1_sub2_sub1.anInt10342 = (class282_sub35_sub2.readShortLE128() + -1809259861 * client.cycles) * -506987231;
			class521_sub1_sub1_sub2_sub1.anInt10345 = (class282_sub35_sub2.readShortLE((byte) -59) + -1809259861 * client.cycles) * -38144783;
			class521_sub1_sub1_sub2_sub1.anInt10346 = class282_sub35_sub2.readUnsignedShort128() * -19018465;
			if (class521_sub1_sub1_sub2_sub1.aBool10568) {
				class521_sub1_sub1_sub2_sub1.anInt10326 += -358216913 * class521_sub1_sub1_sub2_sub1.anInt10569;
				class521_sub1_sub1_sub2_sub1.anInt10328 += class521_sub1_sub1_sub2_sub1.anInt10570 * 1391269727;
				class521_sub1_sub1_sub2_sub1.anInt10341 += 505622999 * class521_sub1_sub1_sub2_sub1.anInt10569;
				class521_sub1_sub1_sub2_sub1.anInt10343 += -858307675 * class521_sub1_sub1_sub2_sub1.anInt10570;
				class521_sub1_sub1_sub2_sub1.anInt10355 = 0;
			} else {
				class521_sub1_sub1_sub2_sub1.anInt10326 += (830034083 * class521_sub1_sub1_sub2_sub1.regionBaseX[0]);
				class521_sub1_sub1_sub2_sub1.anInt10328 += (class521_sub1_sub1_sub2_sub1.regionBaseY[0] * -2091025609);
				class521_sub1_sub1_sub2_sub1.anInt10341 += (1110107435 * class521_sub1_sub1_sub2_sub1.regionBaseX[0]);
				class521_sub1_sub1_sub2_sub1.anInt10343 += (-1352948627 * class521_sub1_sub1_sub2_sub1.regionBaseY[0]);
				class521_sub1_sub1_sub2_sub1.anInt10355 = -2086688481;
			}
			class521_sub1_sub1_sub2_sub1.anInt10367 = 0;
		}
		if (0 != (i_144_ & 0x80)) {
			int i_197_ = class282_sub35_sub2.readShortLE((byte) -76);
			int i_198_ = class282_sub35_sub2.readInt();
			if (i_197_ == 65535) {
				i_197_ = -1;
			}
			int i_199_ = class282_sub35_sub2.readUnsignedByte128(-1659543530);
			int i_200_ = i_199_ & 0x7;
			int i_201_ = i_199_ >> 3 & 0xf;
			if (15 == i_201_) {
				i_201_ = -1;
			}
			boolean bool = (i_199_ >> 7 & 0x1) == 1;
			class521_sub1_sub1_sub2_sub1.sendGraphics(i_197_, i_198_, i_200_, i_201_, bool, 0, 1415858274);
		}
		if (class521_sub1_sub1_sub2_sub1.aBool10568) {
			if (i_145_ == 127) {
				class521_sub1_sub1_sub2_sub1.method16130(997861381 * class521_sub1_sub1_sub2_sub1.anInt10569, 487713049 * class521_sub1_sub1_sub2_sub1.anInt10570, -697937547);
			} else {
				byte i_202_;
				if (Class249.aClass249_3083.aByte3085 != i_145_) {
					i_202_ = i_145_;
				} else {
					i_202_ = playerMovementTypes[i];
				}
				Class236.method3985(class521_sub1_sub1_sub2_sub1, i_202_, (byte) -65);
				class521_sub1_sub1_sub2_sub1.method16129(class521_sub1_sub1_sub2_sub1.anInt10569 * 997861381, 487713049 * class521_sub1_sub1_sub2_sub1.anInt10570, i_202_, -1039544423);
			}
		}
	}

	static void method3199() {
		NUM_PLAYER_INDICES = 0;
		for (int i = 0; i < 2048; i++) {
			aClass282_Sub35Array2428[i] = null;
			playerMovementTypes[i] = Class249.aClass249_3084.aByte3085;
			aClass4Array2430[i] = null;
		}
	}

	static final void method3200(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub13_8227, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), 62408516);
		Class190.method3148((byte) 24);
		client.aBool7175 = false;
	}

	static final void method3201(CS2Executor class527, int i) {
		int i_203_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_203_, (byte) 71);
		Class282_Sub20_Sub4.method15207(class118, class527, 1765364986);
	}

	public static Interface17 method3202(RsByteBuffer class282_sub35, int i) {
		Class221 class221 = Class100.method1640(class282_sub35.readUnsignedByte(), (byte) -96);
		if (class221 == Class221.aClass221_2759) {
			return SceneObjectManager.method3545(class282_sub35, -532578452);
		}
		if (Class221.aClass221_2761 == class221) {
			return Class97.method1614(class282_sub35, 1268954246);
		}
		if (class221 == Class221.aClass221_2760) {
			return Class336.method6009(class282_sub35, -1710988237);
		}
		return null;
	}

	static final void method3203(RsBitsBuffer stream, byte i) {
		stream.initBitAccess((byte) -47);
		int i_204_ = client.anInt7315 * 1595512269;
		Player class521_sub1_sub1_sub2_sub1 = (Class84.myPlayer = client.players[i_204_] = (new Player(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-2015513411))));
		class521_sub1_sub1_sub2_sub1.anInt10314 = i_204_ * -1498872675;
		int i_205_ = stream.readBits(30, (byte) -49);
		byte i_206_ = (byte) (i_205_ >> 28);
		int i_207_ = i_205_ >> 14 & 0x3fff;
		int i_208_ = i_205_ & 0x3fff;
		CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(331387961);
		class521_sub1_sub1_sub2_sub1.regionBaseX[0] = i_207_ - class219.x * 1948093437;
		class521_sub1_sub1_sub2_sub1.regionBaseY[0] = i_208_ - -1002240017 * class219.y;
		class521_sub1_sub1_sub2_sub1.method11172((class521_sub1_sub1_sub2_sub1.regionBaseX[0] << 9) + (class521_sub1_sub1_sub2_sub1.method15805(828768449) << 8), (class521_sub1_sub1_sub2_sub1.method11165().aClass385_3595.y), (class521_sub1_sub1_sub2_sub1.regionBaseY[0] << 9) + (class521_sub1_sub1_sub2_sub1.method15805(828768449) << 8));
		Class4.anInt35 = (class521_sub1_sub1_sub2_sub1.aByte7967 = class521_sub1_sub1_sub2_sub1.aByte7968 = i_206_) * -647602067;
		if (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).method5497(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], 1664929780)) {
			class521_sub1_sub1_sub2_sub1.aByte7968++;
		}
		if (aClass282_Sub35Array2428[i_204_] != null) {
			class521_sub1_sub1_sub2_sub1.decodeAppearance(aClass282_Sub35Array2428[i_204_], 1925099603);
		}
		NUM_PLAYER_INDICES = 0;
		PLAYER_INDICES[(NUM_PLAYER_INDICES += 1595438921) * -963499271 - 1] = i_204_;
		aByteArray2424[i_204_] = (byte) 0;
		anInt2431 = 0;
		for (int i_209_ = 1; i_209_ < 2048; i_209_++) {
			if (i_204_ != i_209_) {
				int i_210_ = stream.readBits(18, (byte) -45);
				int i_211_ = i_210_ >> 16;
				int i_212_ = i_210_ >> 8 & 0xff;
				int i_213_ = i_210_ & 0xff;
				Class4 class4 = aClass4Array2430[i_209_] = new Class4();
				class4.anInt31 = -1096995395 * (i_213_ + ((i_211_ << 28) + (i_212_ << 14)));
				class4.anInt30 = 0;
				class4.anInt32 = 1927204909;
				class4.aBool29 = false;
				class4.aBool33 = false;
				anIntArray2426[(anInt2431 += -773593709) * 1265369243 - 1] = i_209_;
				aByteArray2424[i_209_] = (byte) 0;
			}
		}
		stream.finishBitAccess((byte) 95);
	}
}
