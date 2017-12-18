/* Graphics - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Graphics {
	public int anInt568;
	public Class438 aClass438_569;
	public int id = -1313669563;
	public int anInt571;
	public int height;
	static Class57 aClass57_573;

	Graphics(Entity class365_sub1_sub1_sub2) {
		aClass438_569 = new Class438_Sub2(class365_sub1_sub1_sub2, false);
	}

	static Class128 method608(RsByteBuffer class298_sub53, int i) {
		try {
			Class139 class139 = (Class491.method6176((byte) -18)[class298_sub53.readUnsignedByte()]);
			Class133 class133 = (Class113.method1255(2131483758)[class298_sub53.readUnsignedByte()]);
			int i_0_ = class298_sub53.readShort(1574617841);
			int i_1_ = class298_sub53.readShort(1869006107);
			int i_2_ = class298_sub53.readUnsignedShort();
			int i_3_ = class298_sub53.readUnsignedShort();
			int i_4_ = class298_sub53.readShort(1992026897);
			int i_5_ = class298_sub53.readBigSmart(1235052657);
			int i_6_ = class298_sub53.readInt((byte) 14);
			return new Class128(class139, class133, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.a(").append(')').toString());
		}
	}

	public static final void method609(short i) {
		try {
			Class208.method1936(1548853569);
			for (int i_7_ = 0; i_7_ < Class300.anInt3213 * -991384187; i_7_++) {
				Class297 class297 = Class300.aClass297Array3214[i_7_];
				boolean bool = false;
				if (null == ((Class297) class297).aClass298_Sub19_Sub2_3184) {
					((Class297) class297).anInt3177 -= -1463623301;
					if (-99363405 * ((Class297) class297).anInt3177 >= (class297.method2835((byte) -38) ? -1500 : -10)) {
						if (((Class297) class297).aByte3176 == 1 && ((Class297) class297).aClass278_3181 == null) {
							((Class297) class297).aClass278_3181 = Class278.method2604(Class52.aClass243_507, (-320389285 * (((Class297) class297).anInt3175)), 0);
							if (null == ((Class297) class297).aClass278_3181) {
								if (i >= 16385)
									throw new IllegalStateException();
								continue;
							}
							((Class297) class297).anInt3177 += ((Class297) class297).aClass278_3181.method2602() * -1463623301;
						} else if (class297.method2835((byte) -25) && ((((Class297) class297).aClass298_Sub23_3186) == null || (null == (((Class297) class297).aClass298_Sub26_Sub1_3183)))) {
							if (((Class297) class297).aClass298_Sub23_3186 == null)
								((Class297) class297).aClass298_Sub23_3186 = (Class298_Sub23.method3066(Class439.aClass243_5575, (((Class297) class297).anInt3175 * -320389285)));
							if (((Class297) class297).aClass298_Sub23_3186 == null) {
								if (i >= 16385)
									throw new IllegalStateException();
								continue;
							}
							if (((Class297) class297).aClass298_Sub26_Sub1_3183 == null) {
								((Class297) class297).aClass298_Sub26_Sub1_3183 = ((Class297) class297).aClass298_Sub23_3186.method3067(new int[] { 22050 });
								if ((((Class297) class297).aClass298_Sub26_Sub1_3183) == null) {
									if (i >= 16385) {
										/* empty */
									}
									continue;
								}
							}
						}
						if (-99363405 * ((Class297) class297).anInt3177 < 0) {
							int i_8_ = 8192;
							int i_9_;
							if (0 != (((Class297) class297).anInt3178 * 758600991)) {
								int i_10_ = ((((Class297) class297).anInt3178 * 758600991) >> 24 & 0x3);
								if (i_10_ == (Class287.myPlayer.plane)) {
									int i_11_ = (((((Class297) class297).anInt3178 * 758600991) & 0xff) << 9);
									int i_12_ = Class287.myPlayer.getSize() << 8;
									Class217 class217 = Class287.myPlayer.method4337().aClass217_2599;
									int i_13_ = ((((Class297) class297).anInt3178 * 758600991) >> 16 & 0xff);
									int i_14_ = (i_12_ + (256 + (i_13_ << 9) - (int) class217.aFloat2451));
									int i_15_ = (758600991 * (((Class297) class297).anInt3178) >> 8 & 0xff);
									int i_16_ = ((i_15_ << 9) + 256 - (int) class217.aFloat2454 + i_12_);
									int i_17_ = (Math.abs(i_14_) + Math.abs(i_16_) - 512);
									if (i_17_ > i_11_) {
										((Class297) class297).anInt3177 = 1265930907;
										continue;
									}
									if (i_17_ < 0)
										i_17_ = 0;
									i_9_ = ((i_11_ - i_17_) * Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7582.method5726(-2145949986) * (((Class297) class297).anInt3182 * -1716484165) / i_11_) >> 2;
									if (-1 != (((Class297) class297).anInt3185 * -1271617995)) {
										i_13_ = (((Class297) class297).anInt3185 * -1271617995);
										i_15_ = (((Class297) class297).anInt3173 * -1577764425);
									}
									if (i_14_ != 0 || i_16_ != 0) {
										int i_18_ = ((-(-1847894591 * Class135.anInt6384) - (int) ((Math.atan2((double) i_14_, (double) i_16_)) * 2607.5945876176133) - 4096) & 0x3fff);
										if (i_18_ > 8192)
											i_18_ = 16384 - i_18_;
										int i_19_;
										if (i_17_ <= 0)
											i_19_ = 8192;
										else if (i_17_ >= 4096)
											i_19_ = 16384;
										else
											i_19_ = 8192 + (8192 - i_17_) / 4096;
										i_8_ = (i_18_ * i_19_ / 8192 + (16384 - i_19_ >> 1));
									}
								} else
									i_9_ = 0;
							} else
								i_9_ = ((((Class297) class297).anInt3182 * -1716484165 * (3 == ((Class297) class297).aByte3176 ? Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7583.method5726(-2143768151) : Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7553.method5726(-2142178675))) >> 2);
							if (i_9_ > 0) {
								Class298_Sub26_Sub1 class298_sub26_sub1 = null;
								if (1 == ((Class297) class297).aByte3176)
									class298_sub26_sub1 = (((Class297) class297).aClass278_3181.method2601().method3104(Class282.aClass270_6546));
								else if (class297.method2835((byte) -17))
									class298_sub26_sub1 = (((Class297) class297).aClass298_Sub26_Sub1_3183);
								Class298_Sub19_Sub2 class298_sub19_sub2 = (((Class297) class297).aClass298_Sub19_Sub2_3184 = (Class298_Sub19_Sub2.method3027(class298_sub26_sub1, (((Class297) class297).anInt3180 * -447448059), i_9_, i_8_)));
								class298_sub19_sub2.method2991(((((Class297) class297).anInt3171) * -581110023) - 1);
								Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
							}
						}
					} else
						bool = true;
				} else if (!((Class297) class297).aClass298_Sub19_Sub2_3184.method2840(-629325116))
					bool = true;
				if (bool) {
					Class300.anInt3213 -= -598588595;
					for (int i_20_ = i_7_; i_20_ < -991384187 * Class300.anInt3213; i_20_++)
						Class300.aClass297Array3214[i_20_] = Class300.aClass297Array3214[i_20_ + 1];
					i_7_--;
				}
			}
			if (Class300.aBoolean3208 && !Class68.method781(1966738730)) {
				if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7584.method5726(-2143085623) != 0 && Class300.anInt3207 * -1256171511 != -1) {
					if (null != Class298_Sub2.aClass298_Sub19_Sub1_7167)
						Class21.method364(Class374_Sub1.aClass243_7731, -1256171511 * Class300.anInt3207, 0, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7584.method5726(-2142931520), false, (Class298_Sub2.aClass298_Sub19_Sub1_7167), 1987085103);
					else
						Class477.method6096(Class374_Sub1.aClass243_7731, Class300.anInt3207 * -1256171511, 0, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7584.method5726(-2147082244), false, -2064254563);
				}
				Class300.aBoolean3208 = false;
				Class298_Sub2.aClass298_Sub19_Sub1_7167 = null;
			} else if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7584.method5726(-2142436770) != 0 && -1 != -1256171511 * Class300.anInt3207 && !Class68.method781(1908541019)) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.CHANGE_GRAPHIC_OPTIONS_PACKET, client.gameConnection.aClass449_330, (byte) 26);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(-1256171511 * Class300.anInt3207, -1115837876);
				client.gameConnection.method390(class298_sub36, (byte) -48);
				Class300.anInt3207 = 184109511;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.x(").append(')').toString());
		}
	}

	static void method610(int i) {
		try {
			if (client.anInt8870 * 577335585 < 0) {
				Class505 class505 = Class142.method1571(-2096843583);
				if (!Class436.aBoolean5478)
					Class436.aBoolean5471 = ((Class436.anInt5499 * -1914913203 != -1 && (Class436.anInt5506 * -278777595 >= -1914913203 * Class436.anInt5499)) || (((Class436.aBoolean5496 ? 26 : 22) + (-278777595 * Class436.anInt5506 * (Class436.anInt5467 * -411680299))) > -1111710645 * Class298_Sub40_Sub9.anInt9716));
				Class436.aClass453_5511.method5943((byte) 1);
				Class436.aClass453_5505.method5943((byte) 1);
				for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5939(1766612795)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5944(49146))) {
					int i_21_ = 946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662;
					if (i_21_ < 1000) {
						class298_sub37_sub15.unlink(-1460969981);
						if (59 == i_21_ || i_21_ == 2 || 8 == i_21_ || i_21_ == 17 || i_21_ == 15 || 16 == i_21_ || i_21_ == 58)
							Class436.aClass453_5505.method5935(class298_sub37_sub15, 892677220);
						else
							Class436.aClass453_5511.method5935(class298_sub37_sub15, 281584970);
					}
				}
				Class436.aClass453_5511.method5938(Class436.aClass453_5480, -72544370);
				Class436.aClass453_5505.method5938(Class436.aClass453_5480, -72544370);
				if (Class436.anInt5506 * -278777595 > 1) {
					if (Class117.method1275((byte) 41) && -278777595 * Class436.anInt5506 > 2)
						Class298_Sub45.aClass298_Sub37_Sub15_7522 = ((Class298_Sub37_Sub15) (Class436.aClass453_5480.aClass298_5643.previous.previous));
					else
						Class298_Sub45.aClass298_Sub37_Sub15_7522 = (Class298_Sub37_Sub15) (Class436.aClass453_5480.aClass298_5643.previous);
					Class436.aClass298_Sub37_Sub15_5477 = (Class298_Sub37_Sub15) (Class436.aClass453_5480.aClass298_5643.previous);
					if (-278777595 * Class436.anInt5506 > 2)
						Class318.aClass298_Sub37_Sub15_3322 = ((Class298_Sub37_Sub15) (Class436.aClass298_Sub37_Sub15_5477.previous));
					else
						Class318.aClass298_Sub37_Sub15_3322 = null;
				} else {
					Class298_Sub45.aClass298_Sub37_Sub15_7522 = null;
					Class436.aClass298_Sub37_Sub15_5477 = null;
					Class318.aClass298_Sub37_Sub15_3322 = null;
				}
				Class298_Sub50 class298_sub50 = ((Class298_Sub50) client.aClass453_8827.method5939(1766612795));
				int i_22_;
				int i_23_;
				if (null != class298_sub50) {
					i_22_ = class298_sub50.method3547((byte) 7);
					i_23_ = class298_sub50.method3560(-2068489909);
				} else {
					i_22_ = Class165.recorder.getMouseX((byte) -80);
					i_23_ = Class165.recorder.getMouseY((byte) -10);
				}
				if (Class436.aBoolean5478) {
					if (Class170.method1814((Class144.aClass381_1563.anInterface19_4112), class298_sub50, (byte) -119)) {
						if (null != Class436.aClass298_Sub37_Sub5_5472 && i_22_ >= Class461.anInt5681 * 805710735 && i_22_ <= (805710735 * Class461.anInt5681 + 2054409059 * Class420.anInt5345) && i_23_ >= Class501.anInt6119 * -1370784315 && i_23_ <= (Class501.anInt6119 * -1370784315 + Class389.anInt4166 * -1855216229)) {
							int i_24_ = -1;
							for (int i_25_ = 0; (i_25_ < (-628325139 * (((Class298_Sub37_Sub5) Class436.aClass298_Sub37_Sub5_5472).anInt9583))); i_25_++) {
								if (Class436.aBoolean5496) {
									int i_26_ = (class505.anInt6202 * 1110385787 + (-1370784315 * Class501.anInt6119 + 20) + 1 + i_25_ * (Class436.anInt5467 * -411680299));
									if (i_23_ > i_26_ - (class505.anInt6202 * 1110385787) - 1 && (i_23_ < (-1883958527 * class505.anInt6197 + i_26_)))
										i_24_ = i_25_;
								} else {
									int i_27_ = (-1370784315 * Class501.anInt6119 + 31 + (-411680299 * Class436.anInt5467 * i_25_));
									if (i_23_ > i_27_ - 13 && i_23_ < i_27_ + 3)
										i_24_ = i_25_;
								}
							}
							if (-1 != i_24_) {
								int i_28_ = 0;
								Class447 class447 = (new Class447(((Class298_Sub37_Sub5) Class436.aClass298_Sub37_Sub5_5472).aClass461_9584));
								for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) class447.method5904((short) 15399)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) class447.next())) {
									if (i_24_ == i_28_) {
										Class401.method4939(class298_sub37_sub15, i_22_, i_23_, (short) 916);
										break;
									}
									i_28_++;
								}
							}
							Class194.method1868(2025307040);
						} else if (i_22_ >= Class88.anInt806 * -1347746885 && (i_22_ <= (608683427 * Class134.anInt6343 + Class88.anInt806 * -1347746885)) && (i_23_ >= Class302_Sub4.anInt7658 * 1089948687) && i_23_ <= (Class448.anInt5619 * 1396607435 + (Class302_Sub4.anInt7658 * 1089948687))) {
							if (!Class436.aBoolean5471) {
								int i_29_ = -1;
								for (int i_30_ = 0; i_30_ < -278777595 * Class436.anInt5506; i_30_++) {
									if (Class436.aBoolean5496) {
										int i_31_ = ((Class436.anInt5467 * -411680299 * ((-278777595 * Class436.anInt5506) - 1 - i_30_)) + (1 + ((class505.anInt6202 * 1110385787) + (20 + ((Class302_Sub4.anInt7658) * 1089948687)))));
										if (i_23_ > i_31_ - (class505.anInt6202 * 1110385787) - 1 && i_23_ < ((-1883958527 * class505.anInt6197) + i_31_))
											i_29_ = i_30_;
									} else {
										int i_32_ = ((-411680299 * Class436.anInt5467 * ((Class436.anInt5506 * -278777595) - 1 - i_30_)) + ((Class302_Sub4.anInt7658 * 1089948687) + 31));
										if (i_23_ > i_32_ - 13 && i_23_ < i_32_ + 3)
											i_29_ = i_30_;
									}
								}
								if (-1 != i_29_) {
									int i_33_ = 0;
									Class446 class446 = new Class446(Class436.aClass453_5480);
									for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) class446.method5900(1073452729)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) class446.next())) {
										if (i_33_ == i_29_) {
											Class401.method4939(class298_sub37_sub15, i_22_, i_23_, (short) 916);
											break;
										}
										i_33_++;
									}
								}
								Class194.method1868(2025307040);
							} else {
								int i_34_ = -1;
								for (int i_35_ = 0; i_35_ < 1592446965 * Class436.anInt5479; i_35_++) {
									if (Class436.aBoolean5496) {
										int i_36_ = ((Class436.anInt5467 * -411680299 * i_35_) + (1 + (20 + (Class302_Sub4.anInt7658 * 1089948687) + (class505.anInt6202 * 1110385787))));
										if (i_23_ > (i_36_ - (1110385787 * class505.anInt6202) - 1) && i_23_ < ((class505.anInt6197 * -1883958527) + i_36_)) {
											i_34_ = i_35_;
											break;
										}
									} else {
										int i_37_ = ((Class436.anInt5467 * -411680299 * i_35_) + ((1089948687 * Class302_Sub4.anInt7658) + 31));
										if (i_23_ > i_37_ - 13 && i_23_ < i_37_ + 3) {
											i_34_ = i_35_;
											break;
										}
									}
								}
								if (-1 != i_34_) {
									int i_38_ = 0;
									Class447 class447 = new Class447(Class436.aClass461_5482);
									for (Class298_Sub37_Sub5 class298_sub37_sub5 = ((Class298_Sub37_Sub5) class447.method5904((short) 6300)); null != class298_sub37_sub5; class298_sub37_sub5 = ((Class298_Sub37_Sub5) class447.next())) {
										if (i_38_ == i_34_) {
											Class401.method4939(((Class298_Sub37_Sub15) (((Class298_Sub37_Sub5) class298_sub37_sub5).aClass461_9584.aClass298_Sub37_5679.aClass298_Sub37_7405)), i_22_, i_23_, (short) 916);
											Class194.method1868(2025307040);
											break;
										}
										i_38_++;
									}
								}
							}
						}
					} else {
						boolean bool = false;
						if (null != Class436.aClass298_Sub37_Sub5_5472) {
							if (i_22_ < Class461.anInt5681 * 805710735 - 10 || (i_22_ > 10 + (Class420.anInt5345 * 2054409059 + Class461.anInt5681 * 805710735)) || (i_23_ < -1370784315 * Class501.anInt6119 - 10) || (i_23_ > 10 + (Class389.anInt4166 * -1855216229 + (Class501.anInt6119 * -1370784315))))
								Class170.method1808(1952497590);
							else
								bool = true;
						}
						if (!bool) {
							if (i_22_ < -1347746885 * Class88.anInt806 - 10 || (i_22_ > 10 + (Class88.anInt806 * -1347746885 + Class134.anInt6343 * 608683427)) || i_23_ < (Class302_Sub4.anInt7658 * 1089948687) - 10 || (i_23_ > (1396607435 * Class448.anInt5619 + 1089948687 * Class302_Sub4.anInt7658 + 10)))
								Class194.method1868(2025307040);
							else if (Class436.aBoolean5471) {
								int i_39_ = -1;
								int i_40_ = -1;
								for (int i_41_ = 0; i_41_ < 1592446965 * Class436.anInt5479; i_41_++) {
									if (Class436.aBoolean5496) {
										int i_42_ = (20 + (Class302_Sub4.anInt7658 * 1089948687) + (1110385787 * class505.anInt6202) + 1 + (i_41_ * (-411680299 * Class436.anInt5467)));
										if (i_23_ > (i_42_ - (1110385787 * class505.anInt6202) - 1) && i_23_ < ((class505.anInt6197 * -1883958527) + i_42_)) {
											i_39_ = i_41_;
											i_40_ = i_42_ - (class505.anInt6202 * 1110385787) - 1;
											break;
										}
									} else {
										int i_43_ = (31 + (Class302_Sub4.anInt7658 * 1089948687) + (Class436.anInt5467 * -411680299 * i_41_));
										if (i_23_ > i_43_ - 13 && i_23_ < i_43_ + 3) {
											i_39_ = i_41_;
											i_40_ = i_43_ - 13;
											break;
										}
									}
								}
								if (i_39_ != -1) {
									int i_44_ = 0;
									Class447 class447 = new Class447(Class436.aClass461_5482);
									for (Class298_Sub37_Sub5 class298_sub37_sub5 = ((Class298_Sub37_Sub5) (class447.method5904((short) 26353))); null != class298_sub37_sub5; class298_sub37_sub5 = ((Class298_Sub37_Sub5) class447.next())) {
										if (i_39_ == i_44_) {
											if ((((Class298_Sub37_Sub5) class298_sub37_sub5).anInt9583) * -628325139 > 1)
												Class298_Sub39.method3504(class298_sub37_sub5, i_40_, 967296483);
											break;
										}
										i_44_++;
									}
								}
							}
						}
					}
				} else {
					boolean bool = Class170.method1814((Class144.aClass381_1563.anInterface19_4113), class298_sub50, (byte) -110);
					boolean bool_45_ = Class170.method1814((Class144.aClass381_1563.anInterface19_4109), class298_sub50, (byte) -117);
					boolean bool_46_ = Class170.method1814((Class144.aClass381_1563.anInterface19_4111), class298_sub50, (byte) -48);
					if ((bool || bool_45_) && ((1 == 2089115297 * client.anInt8830 && -278777595 * Class436.anInt5506 > 2) || Class58.method694(-1173724343)))
						bool_46_ = true;
					if (bool_46_ && -278777595 * Class436.anInt5506 > 0) {
						if (null == client.aClass105_8850 && client.anInt8864 * -651858367 == 0)
							Class110.method1226(i_22_, i_23_, (byte) 28);
						else
							Class436.anInt5476 = -1808822290;
					} else if (bool_45_) {
						if (null != Class318.aClass298_Sub37_Sub15_3322)
							Class401.method4939((Class318.aClass298_Sub37_Sub15_3322), i_22_, i_23_, (short) 916);
					} else if (bool) {
						if (null != Class298_Sub45.aClass298_Sub37_Sub15_7522) {
							boolean bool_47_ = (client.aClass105_8850 != null || client.anInt8864 * -651858367 > 0);
							if (bool_47_) {
								Class436.anInt5476 = 1243072503;
								Class411.aClass298_Sub37_Sub15_5324 = (Class298_Sub45.aClass298_Sub37_Sub15_7522);
							} else
								Class401.method4939(Class298_Sub45.aClass298_Sub37_Sub15_7522, i_22_, i_23_, (short) 916);
						} else if (client.aBoolean8835)
							Class144.method1587((byte) 4);
					}
					if (client.aClass105_8850 == null && client.anInt8864 * -651858367 == 0) {
						Class436.anInt5476 = 0;
						Class411.aClass298_Sub37_Sub15_5324 = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.d(").append(')').toString());
		}
	}

	public static void method611(IComponentDefinition[] class105s, int i) {
		try {
			for (int i_48_ = 0; i_48_ < class105s.length; i_48_++) {
				IComponentDefinition class105 = class105s[i_48_];
				if (class105 == null)
					continue;
				if (class105.anObjectArray1257 != null && class105 != null) {
					Script class298_sub46 = new Script();
					class298_sub46.aClass105_7525 = class105;
					class298_sub46.params = class105.anObjectArray1257;
					Class203.method1908(class298_sub46, 2000000, (short) 3156);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.i(").append(')').toString());
		}
	}

	static final void method612(ClientScript2 class403, byte i) {
		try {
			int i_49_ = (((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259]);
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_50_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			if (i_50_ < 0 || i_50_ >= ((ClientScript2) class403).anIntArray5236[i_49_])
				throw new RuntimeException();
			((ClientScript2) class403).anIntArrayArray5238[i_49_][i_50_] = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.ar(").append(')').toString());
		}
	}

	static final void method613(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			int i_51_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_52_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_52_ >= 1 && i_52_ <= 10)
				class105.method1127(i_52_ - 1, i_51_, (byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.jl(").append(')').toString());
		}
	}

	static final void method614(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 457937409 * class105.anInt1162;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.ow(").append(')').toString());
		}
	}

	static final void method615(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1160 * 1573706803;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.oi(").append(')').toString());
		}
	}

	public static boolean method616(int i, int i_53_) {
		try {
			return i == 0 || 2 == i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.p(").append(')').toString());
		}
	}

	static final void method617(ClientScript2 class403, int i) {
		try {
			int i_54_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_54_);
			int i_55_;
			if (class468.aBoolean5771)
				i_55_ = class468.anInt5763 * 292187293;
			else if (class468.aBoolean5731)
				i_55_ = Class144.aClass381_1563.anInt4110 * 1295181471;
			else
				i_55_ = 363537303 * Class144.aClass381_1563.anInt4117;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_55_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.abc(").append(')').toString());
		}
	}

	static final void method618(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class465.method6018(class105, class119, class403, -735997058);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.lp(").append(')').toString());
		}
	}

	static final void method619(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class97.method1042(string, -1578243547);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cg.agu(").append(')').toString());
		}
	}
}
