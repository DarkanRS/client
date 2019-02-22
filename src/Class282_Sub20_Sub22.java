
/* Class282_Sub20_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class282_Sub20_Sub22 extends Class282_Sub20 {
	static int anInt9872;
	static int anInt9873 = 0;
	static final boolean aBool9874 = false;

	void method12322(int i, RsByteBuffer class282_sub35, int i_0_) {
		if (i == 0)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	int[][] method12320(int i, int i_1_) {
		int[][] is = aClass308_7670.method5463(i, 1326272512);
		if (aClass308_7670.aBool3619) {
			int[] is_2_ = is[0];
			int[] is_3_ = is[1];
			int[] is_4_ = is[2];
			for (int i_5_ = 0; i_5_ < Class316.anInt3670 * -402153223; i_5_++) {
				method15383(i_5_, i, 2069251162);
				int[][] is_6_ = method12333(0, anInt9872 * 837193977, (byte) 3);
				is_2_[i_5_] = is_6_[0][anInt9873 * -1192669029];
				is_3_[i_5_] = is_6_[1][-1192669029 * anInt9873];
				is_4_[i_5_] = is_6_[2][anInt9873 * -1192669029];
			}
		}
		return is;
	}

	final void method15382(int i, int i_7_) {
		int i_8_ = Class316.anIntArray3672[i];
		int i_9_ = Class316.anIntArray3668[i_7_];
		float f = (float) Math.atan2((double) (i_8_ - 2048), (double) (i_9_ - 2048));
		if ((double) f >= -3.141592653589793 && (double) f <= -2.356194490192345) {
			anInt9873 = i * -656534125;
			anInt9872 = i_7_ * 1355362633;
		} else if ((double) f <= -1.5707963267948966 && (double) f >= -2.356194490192345) {
			anInt9873 = i_7_ * -656534125;
			anInt9872 = 1355362633 * i;
		} else if ((double) f <= -0.7853981633974483 && (double) f >= -1.5707963267948966) {
			anInt9873 = (-402153223 * Class316.anInt3670 - i_7_) * -656534125;
			anInt9872 = i * 1355362633;
		} else if (f <= 0.0F && (double) f >= -0.7853981633974483) {
			anInt9873 = i * -656534125;
			anInt9872 = 1355362633 * (-929726253 * Class316.anInt3671 - i_7_);
		} else if (f >= 0.0F && (double) f <= 0.7853981633974483) {
			anInt9873 = (Class316.anInt3670 * -402153223 - i) * -656534125;
			anInt9872 = (-929726253 * Class316.anInt3671 - i_7_) * 1355362633;
		} else if ((double) f >= 0.7853981633974483 && (double) f <= 1.5707963267948966) {
			anInt9873 = -656534125 * (Class316.anInt3670 * -402153223 - i_7_);
			anInt9872 = (-929726253 * Class316.anInt3671 - i) * 1355362633;
		} else if ((double) f >= 1.5707963267948966 && (double) f <= 2.356194490192345) {
			anInt9873 = i_7_ * -656534125;
			anInt9872 = (Class316.anInt3671 * -929726253 - i) * 1355362633;
		} else if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793) {
			anInt9873 = -656534125 * (-402153223 * Class316.anInt3670 - i);
			anInt9872 = 1355362633 * i_7_;
		}
		anInt9873 = (anInt9873 * -1192669029 & 1201532175 * Class316.anInt3669) * -656534125;
		anInt9872 = ((anInt9872 * 837193977 & Class316.anInt3673 * 543225399) * 1355362633);
	}

	final void method15383(int i, int i_10_, int i_11_) {
		int i_12_ = Class316.anIntArray3672[i];
		int i_13_ = Class316.anIntArray3668[i_10_];
		float f = (float) Math.atan2((double) (i_12_ - 2048), (double) (i_13_ - 2048));
		if ((double) f >= -3.141592653589793 && (double) f <= -2.356194490192345) {
			anInt9873 = i * -656534125;
			anInt9872 = i_10_ * 1355362633;
		} else if ((double) f <= -1.5707963267948966 && (double) f >= -2.356194490192345) {
			anInt9873 = i_10_ * -656534125;
			anInt9872 = 1355362633 * i;
		} else if ((double) f <= -0.7853981633974483 && (double) f >= -1.5707963267948966) {
			anInt9873 = (-402153223 * Class316.anInt3670 - i_10_) * -656534125;
			anInt9872 = i * 1355362633;
		} else if (f <= 0.0F && (double) f >= -0.7853981633974483) {
			anInt9873 = i * -656534125;
			anInt9872 = 1355362633 * (-929726253 * Class316.anInt3671 - i_10_);
		} else if (f >= 0.0F && (double) f <= 0.7853981633974483) {
			anInt9873 = (Class316.anInt3670 * -402153223 - i) * -656534125;
			anInt9872 = (-929726253 * Class316.anInt3671 - i_10_) * 1355362633;
		} else if ((double) f >= 0.7853981633974483 && (double) f <= 1.5707963267948966) {
			anInt9873 = -656534125 * (Class316.anInt3670 * -402153223 - i_10_);
			anInt9872 = (-929726253 * Class316.anInt3671 - i) * 1355362633;
		} else if ((double) f >= 1.5707963267948966 && (double) f <= 2.356194490192345) {
			anInt9873 = i_10_ * -656534125;
			anInt9872 = (Class316.anInt3671 * -929726253 - i) * 1355362633;
		} else if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793) {
			anInt9873 = -656534125 * (-402153223 * Class316.anInt3670 - i);
			anInt9872 = 1355362633 * i_10_;
		}
		anInt9873 = (anInt9873 * -1192669029 & 1201532175 * Class316.anInt3669) * -656534125;
		anInt9872 = ((anInt9872 * 837193977 & Class316.anInt3673 * 543225399) * 1355362633);
	}

	int[] method12319(int i, int i_14_) {
		int[] is = aClass320_7667.method5721(i, 726111748);
		if (aClass320_7667.aBool3722) {
			for (int i_15_ = 0; i_15_ < -402153223 * Class316.anInt3670; i_15_++) {
				method15383(i_15_, i, 1810846536);
				int[] is_16_ = method12317(0, 837193977 * anInt9872, 2096747711);
				is[i_15_] = is_16_[anInt9873 * -1192669029];
			}
		}
		return is;
	}

	static {
		anInt9872 = 0;
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -887932761);
		if (aClass320_7667.aBool3722) {
			for (int i_17_ = 0; i_17_ < -402153223 * Class316.anInt3670; i_17_++) {
				method15383(i_17_, i, 1255399493);
				int[] is_18_ = method12317(0, 837193977 * anInt9872, 2120112947);
				is[i_17_] = is_18_[anInt9873 * -1192669029];
			}
		}
		return is;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -770516867);
		if (aClass320_7667.aBool3722) {
			for (int i_19_ = 0; i_19_ < -402153223 * Class316.anInt3670; i_19_++) {
				method15383(i_19_, i, 2054894791);
				int[] is_20_ = method12317(0, 837193977 * anInt9872, 1924798117);
				is[i_19_] = is_20_[anInt9873 * -1192669029];
			}
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -685552088);
		if (aClass320_7667.aBool3722) {
			for (int i_21_ = 0; i_21_ < -402153223 * Class316.anInt3670; i_21_++) {
				method15383(i_21_, i, 1983509251);
				int[] is_22_ = method12317(0, 837193977 * anInt9872, 2022326658);
				is[i_21_] = is_22_[anInt9873 * -1192669029];
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		if (i == 0)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		if (i == 0)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		if (i == 0)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 866013846);
		if (aClass308_7670.aBool3619) {
			int[] is_23_ = is[0];
			int[] is_24_ = is[1];
			int[] is_25_ = is[2];
			for (int i_26_ = 0; i_26_ < Class316.anInt3670 * -402153223; i_26_++) {
				method15383(i_26_, i, 1404533486);
				int[][] is_27_ = method12333(0, anInt9872 * 837193977, (byte) 3);
				is_23_[i_26_] = is_27_[0][anInt9873 * -1192669029];
				is_24_[i_26_] = is_27_[1][-1192669029 * anInt9873];
				is_25_[i_26_] = is_27_[2][anInt9873 * -1192669029];
			}
		}
		return is;
	}

	final void method15384(int i, int i_28_) {
		int i_29_ = Class316.anIntArray3672[i];
		int i_30_ = Class316.anIntArray3668[i_28_];
		float f = (float) Math.atan2((double) (i_29_ - 2048), (double) (i_30_ - 2048));
		if ((double) f >= -3.141592653589793 && (double) f <= -2.356194490192345) {
			anInt9873 = i * -656534125;
			anInt9872 = i_28_ * 1355362633;
		} else if ((double) f <= -1.5707963267948966 && (double) f >= -2.356194490192345) {
			anInt9873 = i_28_ * -656534125;
			anInt9872 = 1355362633 * i;
		} else if ((double) f <= -0.7853981633974483 && (double) f >= -1.5707963267948966) {
			anInt9873 = (-402153223 * Class316.anInt3670 - i_28_) * -656534125;
			anInt9872 = i * 1355362633;
		} else if (f <= 0.0F && (double) f >= -0.7853981633974483) {
			anInt9873 = i * -656534125;
			anInt9872 = 1355362633 * (-929726253 * Class316.anInt3671 - i_28_);
		} else if (f >= 0.0F && (double) f <= 0.7853981633974483) {
			anInt9873 = (Class316.anInt3670 * -402153223 - i) * -656534125;
			anInt9872 = (-929726253 * Class316.anInt3671 - i_28_) * 1355362633;
		} else if ((double) f >= 0.7853981633974483 && (double) f <= 1.5707963267948966) {
			anInt9873 = -656534125 * (Class316.anInt3670 * -402153223 - i_28_);
			anInt9872 = (-929726253 * Class316.anInt3671 - i) * 1355362633;
		} else if ((double) f >= 1.5707963267948966 && (double) f <= 2.356194490192345) {
			anInt9873 = i_28_ * -656534125;
			anInt9872 = (Class316.anInt3671 * -929726253 - i) * 1355362633;
		} else if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793) {
			anInt9873 = -656534125 * (-402153223 * Class316.anInt3670 - i);
			anInt9872 = 1355362633 * i_28_;
		}
		anInt9873 = (anInt9873 * -1192669029 & 1201532175 * Class316.anInt3669) * -656534125;
		anInt9872 = ((anInt9872 * 837193977 & Class316.anInt3673 * 543225399) * 1355362633);
	}

	public Class282_Sub20_Sub22() {
		super(1, false);
	}

	static final void method15385(CS2Executor class527, short i) {
		class527.intStackPtr -= 283782002;
		int i_31_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_32_ = (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_32_ * i_31_;
	}

	static final void method15386(int i) {
		if (-762135173 * client.anInt7178 > 1) {
			client.anInt7178 -= -1706714701;
			client.anInt7397 = client.anInt7347 * 1520234947;
		}
		if (client.aClass184_7475.aBool2298) {
			client.aClass184_7475.aBool2298 = false;
			Class151.method2592((byte) 21);
		} else {
			if (!Class20.aBool161)
				HitsplatDefinitions.method3851(-402153223);
			for (int i_33_ = 0; (i_33_ < 100 && Class8_Sub3.method14338(client.aClass184_7475, (byte) 2)); i_33_++) {
				/* empty */
			}
			if (13 == client.anInt7166 * -1741204137) {
				while (Class451.method7517((byte) 8)) {
					TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4563, (client.aClass184_7475.isaac), 780391787);
					class282_sub23.buffer.writeByte(0);
					int i_34_ = (class282_sub23.buffer.index * -1990677291);
					Class8_Sub2.method14264((class282_sub23.buffer), 1655549985);
					class282_sub23.buffer.method13061((class282_sub23.buffer.index * -1990677291) - i_34_, 788141162);
					client.aClass184_7475.method3049(class282_sub23, -467156881);
				}
				if (Class496.aClass510_5816 != null) {
					if (Class496.aClass510_5816.anInt5872 * -117494151 != -1) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4615, (client.aClass184_7475.isaac), 312457209);
						class282_sub23.buffer.writeShort(Class496.aClass510_5816.anInt5872 * -117494151, 1417031095);
						client.aClass184_7475.method3049(class282_sub23, 496271189);
						Class496.aClass510_5816 = null;
						Class28.aLong351 = (Class169.method2869(1633582571) + 30000L) * 8256174513244947971L;
					}
				} else if (Class169.method2869(1898123142) >= 3740457902241092779L * Class28.aLong351)
					Class496.aClass510_5816 = client.aClass508_7223.method8729((Class159.aClass450_2010.aString5433), (short) 5418);
				Class434.method7292((byte) -22);
				Class282_Sub53 class282_sub53 = ((Class282_Sub53) client.aClass482_7267.head((byte) 106));
				if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1135712280) != null) {
					if (5 == NativeLibraryLoader.anInt3240 * -672443707)
						Wall.method16113(70521151);
					else if (-672443707 * NativeLibraryLoader.anInt3240 == 3)
						SpotAnimIndexLoader.method8860((byte) -76);
				}
				if (client.aBool7331)
					client.aBool7331 = false;
				else
					client.aFloat7284 /= 2.0F;
				if (client.aBool7269)
					client.aBool7269 = false;
				else
					client.aFloat7266 /= 2.0F;
				Class282_Sub20_Sub7.method15240((byte) 1);
				if (-1741204137 * client.anInt7166 == 13) {
					IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4037(IndexLoaders.MAP_REGION_DECODER, (byte) 81);
					Class350_Sub1.method12516(16232323);
					Interface.method1623(759137270);
					if (1663946735 * client.anInt7396 > 10)
						((Class184) client.aClass184_7475).anInt2289 += 1896636235;
					if ((-1614826909 * ((Class184) client.aClass184_7475).anInt2289) > 2250)
						Class151.method2592((byte) 35);
					else {
						if (client.anInt7341 * -891719545 == 1) {
							Class155.method2636((byte) 20);
							Class330.method5916(1211695569);
						} else if (Class282_Sub13.DEFAULTS_LOADER_8.anInterface17_5931.method127(class282_sub53, client.anInterface16Array7298, -809233249 * client.anInt7196, Class96_Sub21.aClass199_9438, (byte) 81))
							Class468_Sub21.method12869(false, -200546110);
						else {
							if (3 == client.anInt7341 * -891719545 && XLoadingStage.method6684((client.anInt7231 * -1638311881), (byte) 27)) {
								IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3153, null), 218907808);
								client.anInt7341 = 0;
							}
							if (0 == -891719545 * client.anInt7341 && -1741204137 * client.anInt7166 != 18) {
								Class86.aClass465_823.method7749(1239526521);
								client.anInt7341 = 1523668188;
								client.anInt7357 = -844801235 * client.cycles;
								client.anInt7235 = 0;
								Class234.method3953((byte) 1);
							}
							if (4 == client.anInt7341 * -891719545) {
								int i_35_ = (client.cycles * -1809259861 - -458556361 * client.anInt7357);
								if (1853605419 * client.anInt7235 < Class86.aClass96Array822.length) {
									do {
										Class96 class96 = (Class86.aClass96Array822[(1853605419 * client.anInt7235)]);
										if (-394441549 * class96.anInt992 > i_35_)
											break;
										class96.method1592(2123508323);
									} while (-891719545 * client.anInt7341 == 4 && ((client.anInt7235 += -142030717) * 1853605419 < (Class86.aClass96Array822).length));
								}
								if (client.anInt7341 * -891719545 == 4) {
									for (int i_36_ = 0; (i_36_ < Class82.aClass75Array804.length); i_36_++) {
										Class75 class75 = Class82.aClass75Array804[i_36_];
										if (class75.aBool742) {
											Animable class521_sub1_sub1_sub2 = class75.method1342((byte) 112);
											Class363.method6287(class521_sub1_sub1_sub2, true, -101184635);
										}
									}
								}
							}
						}
						Class357.method6233((byte) 36);
						Class149_Sub4.method14661((byte) -86);
						Class84.method1464(1237119486);
						client.anInt7261 += 684988109;
						if (client.anInt7296 * 346714605 != 0) {
							client.anInt7295 += -811168164;
							if (83311811 * client.anInt7295 >= 400)
								client.anInt7296 = 0;
						}
						if (null != Class401.aClass118_4825) {
							client.anInt7297 += 1853701163;
							if (client.anInt7297 * -1694129533 >= 15) {
								Class109.method1858(Class401.aClass118_4825, (byte) 51);
								Class401.aClass118_4825 = null;
							}
						}
						client.aClass118_7370 = null;
						client.aBool7369 = false;
						client.aBool7403 = false;
						Class282_Sub20_Sub24.aClass118_9884 = null;
						Class15.method544(null, -1, -1, 809786138);
						if (!client.aBool7344)
							client.anInt7427 = 434551523;
						Class496.method8315(-472472191);
						client.anInt7347 += 1196922783;
						if (client.aBool7375) {
							TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4549, (client.aClass184_7475.isaac), 771698207);
							class282_sub23.buffer.writeLEInt(((Class282_Sub15_Sub5.anInt9859 * 2032760273 << 28) | Class44.anInt431 * 238441297 << 14 | Class421.anInt5015 * -321481591), (byte) -22);
							client.aClass184_7475.method3049(class282_sub23, -1247398056);
							client.aBool7375 = false;
						}
						for (;;) {
							HookRequest class282_sub43 = (HookRequest) client.aClass482_7233.method8061((byte) -22);
							if (null == class282_sub43)
								break;
							IComponentDefinitions class118 = class282_sub43.iComponentDefs;
							if (class118.anInt1288 * 1924549737 >= 0) {
								IComponentDefinitions class118_37_ = Class117.method1981((class118.anInt1305 * 2110532063), (byte) 48);
								if (class118_37_ == null || null == class118_37_.aClass118Array1438 || (1924549737 * class118.anInt1288 >= (class118_37_.aClass118Array1438).length) || ((class118_37_.aClass118Array1438[1924549737 * class118.anInt1288]) != class118))
									continue;
							}
							Class96_Sub4.executeHookInner200k(class282_sub43, 859874447);
						}
						for (;;) {
							HookRequest class282_sub43 = (HookRequest) client.aClass482_7404.method8061((byte) -73);
							if (class282_sub43 == null)
								break;
							IComponentDefinitions class118 = class282_sub43.iComponentDefs;
							if (class118.anInt1288 * 1924549737 >= 0) {
								IComponentDefinitions class118_38_ = Class117.method1981((class118.anInt1305 * 2110532063), (byte) 7);
								if (class118_38_ == null || class118_38_.aClass118Array1438 == null || (1924549737 * class118.anInt1288 >= (class118_38_.aClass118Array1438).length) || class118 != (class118_38_.aClass118Array1438[(class118.anInt1288 * 1924549737)]))
									continue;
							}
							Class96_Sub4.executeHookInner200k(class282_sub43, 690549551);
						}
						for (;;) {
							HookRequest class282_sub43 = ((HookRequest) client.aClass482_7402.method8061((byte) -101));
							if (null == class282_sub43)
								break;
							IComponentDefinitions class118 = class282_sub43.iComponentDefs;
							if (class118.anInt1288 * 1924549737 >= 0) {
								IComponentDefinitions class118_39_ = Class117.method1981((2110532063 * (class118.anInt1305)), (byte) 33);
								if (class118_39_ == null || class118_39_.aClass118Array1438 == null || (1924549737 * class118.anInt1288 >= (class118_39_.aClass118Array1438).length) || class118 != (class118_39_.aClass118Array1438[(class118.anInt1288 * 1924549737)]))
									continue;
							}
							Class96_Sub4.executeHookInner200k(class282_sub43, 2146300541);
						}
						if (Class282_Sub20_Sub24.aClass118_9884 == null)
							client.anInt7184 = 0;
						if (client.aClass118_7257 != null)
							Class161.method2827(1342280577);
						Class461.method7703(-1982488660);
						if (client.rights * -644057819 > 0 && Class96_Sub21.aClass199_9438.method3236(82, -1802639112) && Class96_Sub21.aClass199_9438.method3236(81, -1439970687) && 0 != 1789395551 * client.anInt7191) {
							int i_40_ = ((Class84.myPlayer.plane) - 1789395551 * client.anInt7191);
							if (i_40_ < 0)
								i_40_ = 0;
							else if (i_40_ > 3)
								i_40_ = 3;
							CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1589459272);
							Class447.method7460(i_40_, ((Class84.myPlayer.regionBaseX[0]) + class219.x * 1948093437), (class219.y * -1002240017 + (Class84.myPlayer.regionBaseY[0])), -1104014965);
						}
						for (int i_41_ = 0; i_41_ < 5; i_41_++)
							client.anIntArray7435[i_41_]++;
						if (client.aBool7400 && (client.aLong7401 * -7566578057014918599L < Class169.method2869(1549197266) - 60000L))
							Class282_Sub11.method12211(375713564);
						for (Class275_Sub4 class275_sub4 = (Class275_Sub4) client.aClass457_7350.method7659(301908602); null != class275_sub4; class275_sub4 = ((Class275_Sub4) client.aClass457_7350.method7650((byte) 20))) {
							if ((long) (478251145 * (((Class275_Sub4) class275_sub4).anInt7838)) < (Class169.method2869(2097825958) / 1000L - 5L)) {
								if (((Class275_Sub4) class275_sub4).aShort7839 > 0)
									Class191.method3167(5, 0, "", "", "", new StringBuilder().append(((Class275_Sub4) class275_sub4).aString7837).append(Message.HAS_LOGGED_IN.translate(Class223.CURRENT_LANGUAGE, -1783066271)).toString(), 442373563);
								if (((Class275_Sub4) class275_sub4).aShort7839 == 0)
									Class191.method3167(5, 0, "", "", "", new StringBuilder().append(((Class275_Sub4) class275_sub4).aString7837).append(Message.HAS_LOGGED_OUT.translate(Class223.CURRENT_LANGUAGE, -805981058)).toString(), 1499607134);
								class275_sub4.method4887((byte) -28);
							}
						}
						client.anInt7418 += -1639489605;
						if (client.anInt7418 * 943885683 > 508) {
							client.anInt7418 = 0;
							int i_42_ = (int) (Math.random() * 8.0);
							if ((i_42_ & 0x1) == 1)
								client.anInt7248 += -2036720157 * client.anInt7249;
							if ((i_42_ & 0x2) == 2)
								client.anInt7250 += 1845674047 * client.anInt7251;
							if (4 == (i_42_ & 0x4))
								client.anInt7343 += -203196597 * client.anInt7253;
						}
						if (1798620263 * client.anInt7248 < -51)
							client.anInt7249 = -1977797126;
						if (client.anInt7248 * 1798620263 > 56)
							client.anInt7249 = 1977797126;
						if (-537269317 * client.anInt7250 < -63)
							client.anInt7251 = 618668954;
						if (-537269317 * client.anInt7250 > 56)
							client.anInt7251 = -618668954;
						if (client.anInt7343 * -297983899 < -44)
							client.anInt7253 = -1879830745;
						if (client.anInt7343 * -297983899 > 40)
							client.anInt7253 = 1879830745;
						client.anInt7259 += -1531272327;
						if (client.anInt7259 * 1159943881 > 508) {
							client.anInt7259 = 0;
							int i_43_ = (int) (Math.random() * 8.0);
							if ((i_43_ & 0x1) == 1)
								client.anInt7255 += client.anInt7187 * 12144799;
							if (2 == (i_43_ & 0x2))
								client.anInt7203 += client.anInt7258 * 514727567;
						}
						if (-1790074477 * client.anInt7255 < -60)
							client.anInt7187 = 728497418;
						if (client.anInt7255 * -1790074477 > 65)
							client.anInt7187 = -728497418;
						if (client.anInt7203 * -1864403271 < -20)
							client.anInt7258 = -2025825177;
						if (client.anInt7203 * -1864403271 > 11)
							client.anInt7258 = 2025825177;
						client.aClass184_7475.anInt2290 += 352048501;
						if (804033245 * client.aClass184_7475.anInt2290 > 50) {
							TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.KEEP_ALIVE, (client.aClass184_7475.isaac), -169588500);
							client.aClass184_7475.method3049(class282_sub23, -57681873);
						}
						if (client.aBool7459) {
							Class466.method7776(-389902536);
							client.aBool7459 = false;
						}
						try {
							client.aClass184_7475.method3047(613912304);
						} catch (IOException ioexception) {
							Class151.method2592((byte) 40);
						}
					}
				}
			}
		}
	}

	static final void method15387(CS2Executor class527, int i) {
		class527.intStackPtr -= 425673003;
		int i_44_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_45_ = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
		int i_46_ = (class527.intStack[2 + class527.intStackPtr * 1942118537]);
		Class96_Sub10.method14603(4, i_44_ << 16 | i_45_, i_46_, "", (byte) 73);
	}

	public static void method15388(Index class317, byte i) {
		CoordGrid.aClass317_2710 = class317;
	}
}
