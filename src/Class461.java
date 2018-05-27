
/* Class461 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.Ping;

public class Class461 {
	static Class461 aClass461_5538 = new Class461(0);
	public static Class461 aClass461_5539 = new Class461(1);
	static Class461 aClass461_5540 = new Class461(2);
	public int anInt5541;

	Class461(int i) {
		anInt5541 = i * 1237323557;
	}

	public static Class461 method7701(int i) {
		Class461[] class461s = Class202.method3343(-1459795641);
		for (int i_0_ = 0; i_0_ < class461s.length; i_0_++) {
			Class461 class461 = class461s[i_0_];
			if (-1977256787 * class461.anInt5541 == i)
				return class461;
		}
		return null;
	}

	public static int method7702(int i) {
		if (0 == Class296.anInt3532 * 1164388509) {
			Class446.aClass446_5412.method7435(new Class301("jaclib"), (byte) -15);
			if (Class446.aClass446_5412.method7443(1803519499).method84(-477828346) != 100)
				return 1;
			if (!((Class301) Class446.aClass446_5412.method7443(954726291)).method5328((byte) -93)) {
				Class308.aclient3620.method4681((byte) 1);
				Class223.method3770((byte) 1);
				try {
					Ping.init();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			Class296.anInt3532 = -699884107;
		}
		if (1 == Class296.anInt3532 * 1164388509) {
			Class296.aClass446Array3531 = Class446.method7436((byte) 24);
			Class446.aClass446_5386.method7435(new Class298(IndexLoaders.DEFAULTS_INDEX), (byte) -56);
			Class446.aClass446_5387.method7435(new Class301("jaggl"), (byte) 11);
			Class446.aClass446_5388.method7435(new Class301("jagdx"), (byte) -60);
			Class446.aClass446_5389.method7435(new Class301("sw3d"), (byte) 6);
			Class446.aClass446_5415.method7435(new Class301("hw3d"), (byte) 11);
			Class446.aClass446_5385.method7435(new Class301("jagtheora"), (byte) -30);
			Class446.aClass446_5392.method7435(new Class298(IndexLoaders.SHADER_INDEX), (byte) 101);
			Class446.aClass446_5390.method7435(new Class298(IndexLoaders.TEXTURE_DEFINITION_INDEX), (byte) 65);
			Class446.aClass446_5394.method7435(new Class298(IndexLoaders.CONFIG_INDEX), (byte) -20);
			Class446.aClass446_5395.method7435(new Class298(IndexLoaders.OBJECT_INDEX), (byte) 17);
			Class446.aClass446_5397.method7435(new Class298(IndexLoaders.ENUM_INDEX), (byte) -64);
			Class446.aClass446_5393.method7435(new Class298(IndexLoaders.NPC_INDEX), (byte) 7);
			Class446.aClass446_5413.method7435(new Class298(IndexLoaders.ITEM_INDEX), (byte) 16);
			Class446.aClass446_5399.method7435(new Class298(IndexLoaders.SEQUENCES_INDEX), (byte) 16);
			Class446.aClass446_5400.method7435(new Class298(IndexLoaders.SPOTANIM_INDEX), (byte) 4);
			Class446.aClass446_5401.method7435(new Class298(IndexLoaders.VARBIT_INDEX), (byte) -28);
			Class446.aClass446_5402.method7435(new Class298(IndexLoaders.QC_MESSAGES_INDEX), (byte) 9);
			Class446.aClass446_5403.method7435(new Class298(IndexLoaders.QC_MENU_INDEX), (byte) -25);
			Class446.aClass446_5404.method7435(new Class298(IndexLoaders.TEXTURE_INDEX), (byte) 75);
			Class446.aClass446_5405.method7435(new Class298(IndexLoaders.PARTICLE_INDEX), (byte) 60);
			Class446.aClass446_5410.method7435(new Class298(IndexLoaders.BILLBOARD_INDEX), (byte) -44);
			Class446.aClass446_5407.method7435(new Class383((IndexLoaders.HUFFMAN_INDEX), "huffman"), (byte) -27);
			Class446.aClass446_5391.method7435(new Class298(IndexLoaders.INTERFACE_INDEX), (byte) -5);
			Class446.aClass446_5409.method7435(new Class298(IndexLoaders.CS2_SCRIPTS_INDEX), (byte) -83);
			Class446.aClass446_5398.method7435(new Class298(IndexLoaders.FONT_METRICS_INDEX), (byte) -104);
			Class446.aClass446_5411.method7435(new Class388((IndexLoaders.WORLD_MAP_INDEX), "details"), (byte) -79);
			for (int i_1_ = 0; i_1_ < Class296.aClass446Array3531.length; i_1_++) {
				if (Class296.aClass446Array3531[i_1_].method7443(-1578202194) == null)
					throw new RuntimeException();
			}
			int i_2_ = 0;
			Class446[] class446s = Class296.aClass446Array3531;
			for (int i_3_ = 0; i_3_ < class446s.length; i_3_++) {
				Class446 class446 = class446s[i_3_];
				int i_4_ = class446.method7432((byte) 66);
				int i_5_ = class446.method7443(1059684891).method84(-477828346);
				i_2_ += i_5_ * i_4_ / 100;
			}
			Class296.anInt3533 = i_2_ * -621298115;
			Class296.anInt3532 = -1399768214;
		}
		if (null == Class296.aClass446Array3531)
			return 100;
		int i_6_ = 0;
		int i_7_ = 0;
		boolean bool = true;
		Class446[] class446s = Class296.aClass446Array3531;
		for (int i_8_ = 0; i_8_ < class446s.length; i_8_++) {
			Class446 class446 = class446s[i_8_];
			int i_9_ = class446.method7432((byte) 66);
			int i_10_ = class446.method7443(-673812975).method84(-477828346);
			if (i_10_ < 100)
				bool = false;
			i_6_ += i_9_;
			i_7_ += i_9_ * i_10_ / 100;
		}
		if (bool) {
			if (!((Class301) Class446.aClass446_5385.method7443(98634719)).method5328((byte) -96))
				client.aBool7393 = Class308.aclient3620.method4662((byte) 44);
			Class296.aClass446Array3531 = null;
		}
		i_7_ -= Class296.anInt3533 * -1694086891;
		i_6_ -= Class296.anInt3533 * -1694086891;
		int i_11_ = i_6_ > 0 ? i_7_ * 100 / i_6_ : 100;
		if (!bool && i_11_ > 99)
			i_11_ = 99;
		return i_11_;
	}

	static void method7703(int i) {
		if (client.anInt7231 * -1638311881 < 0) {
			Class414 class414 = Class114.method1887(-785695641);
			if (!Class20.aBool161)
				Class20.aBool162 = ((Class20.anInt198 * 215004571 != -1 && (Class20.anInt169 * 2144330291 >= Class20.anInt198 * 215004571)) || (((Class20.aBool187 ? 26 : 22) + (997766473 * Class20.anInt178 * (2144330291 * Class20.anInt169))) > -969250379 * Class263.anInt3243));
			Class20.aClass482_174.method8118(1351673894);
			Class20.aClass482_175.method8118(-1093691233);
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 53)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.next(1807139429))) {
				int i_12_ = (-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587));
				if (i_12_ < 1000) {
					class282_sub50_sub7.unlink(-371378792);
					if (59 == i_12_ || 2 == i_12_ || 8 == i_12_ || 17 == i_12_ || 15 == i_12_ || i_12_ == 16 || i_12_ == 58)
						Class20.aClass482_175.append(class282_sub50_sub7, 1626236688);
					else
						Class20.aClass482_174.append(class282_sub50_sub7, -1768300501);
				}
			}
			Class20.aClass482_174.method8063(Class20.aClass482_171, -1553248551);
			Class20.aClass482_175.method8063(Class20.aClass482_171, -1553248551);
			if (Class20.anInt169 * 2144330291 > 1) {
				if (Class468_Sub1.method12619(694674525) && 2144330291 * Class20.anInt169 > 2)
					Class96_Sub23.aClass282_Sub50_Sub7_9445 = (Class282_Sub50_Sub7) (Class20.aClass482_171.head.prev.prev);
				else
					Class96_Sub23.aClass282_Sub50_Sub7_9445 = (Class282_Sub50_Sub7) (Class20.aClass482_171.head.prev);
				Class1.aClass282_Sub50_Sub7_12 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head.prev);
				if (Class20.anInt169 * 2144330291 > 2)
					Class20.aClass282_Sub50_Sub7_168 = ((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12.prev);
				else
					Class20.aClass282_Sub50_Sub7_168 = null;
			} else {
				Class96_Sub23.aClass282_Sub50_Sub7_9445 = null;
				Class1.aClass282_Sub50_Sub7_12 = null;
				Class20.aClass282_Sub50_Sub7_168 = null;
			}
			Class282_Sub53 class282_sub53 = (Class282_Sub53) client.aClass482_7267.head((byte) 32);
			int i_13_;
			int i_14_;
			if (null != class282_sub53) {
				i_13_ = class282_sub53.method13481(1796432776);
				i_14_ = class282_sub53.method13469(-1321812289);
			} else {
				i_13_ = Class163.aClass209_2031.method3569(1994441818);
				i_14_ = Class163.aClass209_2031.method3570(756095591);
			}
			if (Class20.aBool161) {
				if (Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5882), class282_sub53, 1812867232)) {
					if (null != Class20.aClass282_Sub50_Sub15_163 && i_13_ >= Class341.anInt3996 * 143093737 && i_13_ <= (Class341.anInt3996 * 143093737 + Class96_Sub3.anInt8518 * 572079435) && i_14_ >= Class282_Sub50_Sub2.anInt9471 * 2107083711 && i_14_ <= ((-1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526) + (2107083711 * Class282_Sub50_Sub2.anInt9471))) {
						int i_15_ = -1;
						for (int i_16_ = 0; i_16_ < (2026887253 * (((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).anInt9769)); i_16_++) {
							if (Class20.aBool187) {
								int i_17_ = (Class20.anInt178 * 997766473 * i_16_ + (1 + (class414.anInt4978 * 397683159 + ((2107083711 * (Class282_Sub50_Sub2.anInt9471)) + 20))));
								if (i_14_ > (i_17_ - class414.anInt4978 * 397683159 - 1) && i_14_ < i_17_ + (-1518951631 * class414.anInt4979))
									i_15_ = i_16_;
							} else {
								int i_18_ = (997766473 * Class20.anInt178 * i_16_ + ((2107083711 * Class282_Sub50_Sub2.anInt9471) + 31));
								if (i_14_ > i_18_ - 13 && i_14_ < 3 + i_18_)
									i_15_ = i_16_;
							}
						}
						if (i_15_ != -1) {
							int i_19_ = 0;
							Class469 class469 = new Class469(((Class282_Sub50_Sub15) (Class20.aClass282_Sub50_Sub15_163)).aClass477_9770);
							for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class469.method7790(1832486278)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class469.next()) {
								if (i_15_ == i_19_) {
									Class96_Sub4.method13789(class282_sub50_sub7, i_13_, i_14_, 951380502);
									break;
								}
								i_19_++;
							}
						}
						Class316.method5594(-559600711);
					} else if (i_13_ >= Class301.anInt3555 * 1742345613 && i_13_ <= (-13788709 * Class158_Sub2.anInt8975 + Class301.anInt3555 * 1742345613) && i_14_ >= 815250613 * Class184.anInt2300 && (i_14_ <= (Class184.anInt2300 * 815250613 + -1488439617 * Class110.anInt1104))) {
						if (!Class20.aBool162) {
							int i_20_ = -1;
							for (int i_21_ = 0; i_21_ < 2144330291 * Class20.anInt169; i_21_++) {
								if (Class20.aBool187) {
									int i_22_ = ((997766473 * Class20.anInt178 * (2144330291 * Class20.anInt169 - 1 - i_21_)) + (20 + Class184.anInt2300 * 815250613 + class414.anInt4978 * 397683159 + 1));
									if ((i_14_ > (i_22_ - 397683159 * class414.anInt4978 - 1)) && i_14_ < (class414.anInt4979 * -1518951631) + i_22_)
										i_20_ = i_21_;
								} else {
									int i_23_ = (((2144330291 * Class20.anInt169 - 1 - i_21_) * (Class20.anInt178 * 997766473)) + (815250613 * Class184.anInt2300 + 31));
									if (i_14_ > i_23_ - 13 && i_14_ < 3 + i_23_)
										i_20_ = i_21_;
								}
							}
							if (i_20_ != -1) {
								int i_24_ = 0;
								NodeIterator class460 = new NodeIterator(Class20.aClass482_171);
								for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.method7683(-1181797643)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.next())) {
									if (i_24_ == i_20_) {
										Class96_Sub4.method13789(class282_sub50_sub7, i_13_, i_14_, 1995969005);
										break;
									}
									i_24_++;
								}
							}
							Class316.method5594(-559600711);
						} else {
							int i_25_ = -1;
							for (int i_26_ = 0; i_26_ < Class20.anInt170 * 292682521; i_26_++) {
								if (Class20.aBool187) {
									int i_27_ = (Class20.anInt178 * 997766473 * i_26_ + (1 + (class414.anInt4978 * 397683159 + (20 + (815250613 * (Class184.anInt2300))))));
									if (i_14_ > i_27_ - (class414.anInt4978 * 397683159) - 1 && (i_14_ < (-1518951631 * class414.anInt4979 + i_27_))) {
										i_25_ = i_26_;
										break;
									}
								} else {
									int i_28_ = (31 + Class184.anInt2300 * 815250613 + i_26_ * (Class20.anInt178 * 997766473));
									if (i_14_ > i_28_ - 13 && i_14_ < 3 + i_28_) {
										i_25_ = i_26_;
										break;
									}
								}
							}
							if (-1 != i_25_) {
								int i_29_ = 0;
								Class469 class469 = new Class469(Class20.aClass477_182);
								for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.next())) {
									if (i_25_ == i_29_) {
										Class96_Sub4.method13789(((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), i_13_, i_14_, 1026140504);
										Class316.method5594(-559600711);
										break;
									}
									i_29_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != Class20.aClass282_Sub50_Sub15_163) {
						if (i_13_ < Class341.anInt3996 * 143093737 - 10 || i_13_ > 10 + (Class96_Sub3.anInt8518 * 572079435 + 143093737 * Class341.anInt3996) || i_14_ < (Class282_Sub50_Sub2.anInt9471 * 2107083711) - 10 || (i_14_ > ((-1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526) + 2107083711 * Class282_Sub50_Sub2.anInt9471 + 10)))
							Class404.method6810(988728251);
						else
							bool = true;
					}
					if (!bool) {
						if (i_13_ < Class301.anInt3555 * 1742345613 - 10 || i_13_ > (Class158_Sub2.anInt8975 * -13788709 + 1742345613 * Class301.anInt3555 + 10) || i_14_ < Class184.anInt2300 * 815250613 - 10 || i_14_ > (-1488439617 * Class110.anInt1104 + 815250613 * Class184.anInt2300 + 10))
							Class316.method5594(-559600711);
						else if (Class20.aBool162) {
							int i_30_ = -1;
							int i_31_ = -1;
							for (int i_32_ = 0; i_32_ < 292682521 * Class20.anInt170; i_32_++) {
								if (Class20.aBool187) {
									int i_33_ = (class414.anInt4978 * 397683159 + (815250613 * Class184.anInt2300 + 20) + 1 + (997766473 * Class20.anInt178 * i_32_));
									if ((i_14_ > (i_33_ - 397683159 * class414.anInt4978 - 1)) && (i_14_ < (-1518951631 * class414.anInt4979 + i_33_))) {
										i_30_ = i_32_;
										i_31_ = (i_33_ - 397683159 * class414.anInt4978 - 1);
										break;
									}
								} else {
									int i_34_ = (Class184.anInt2300 * 815250613 + 31 + i_32_ * (997766473 * Class20.anInt178));
									if (i_14_ > i_34_ - 13 && i_14_ < 3 + i_34_) {
										i_30_ = i_32_;
										i_31_ = i_34_ - 13;
										break;
									}
								}
							}
							if (i_30_ != -1) {
								int i_35_ = 0;
								Class469 class469 = new Class469(Class20.aClass477_182);
								for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.next())) {
									if (i_30_ == i_35_) {
										if ((2026887253 * (((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)) > 1)
											Class282_Sub12.method12212(class282_sub50_sub15, i_31_, -67980547);
										break;
									}
									i_35_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5878), class282_sub53, 2080768595);
				boolean bool_36_ = Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5874), class282_sub53, 369566995);
				boolean bool_37_ = Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5875), class282_sub53, 1851162471);
				if ((bool || bool_36_) && ((-1718417173 * client.anInt7339 == 1 && 2144330291 * Class20.anInt169 > 2) || JS5GrabWorker.method12562(-269769835)))
					bool_37_ = true;
				if (bool_37_ && Class20.anInt169 * 2144330291 > 0) {
					if (null == client.aClass118_7257 && 0 == client.anInt7184 * 676534483)
						Class262.method4653(i_13_, i_14_, 272985628);
					else
						Class20.anInt167 = -256186394;
				} else if (bool_36_) {
					if (Class20.aClass282_Sub50_Sub7_168 != null)
						Class96_Sub4.method13789((Class20.aClass282_Sub50_Sub7_168), i_13_, i_14_, -619125547);
				} else if (bool) {
					if (null != Class96_Sub23.aClass282_Sub50_Sub7_9445) {
						boolean bool_38_ = (null != client.aClass118_7257 || 676534483 * client.anInt7184 > 0);
						if (bool_38_) {
							Class20.anInt167 = 2019390451;
							Class46.aClass282_Sub50_Sub7_438 = Class96_Sub23.aClass282_Sub50_Sub7_9445;
						} else
							Class96_Sub4.method13789(Class96_Sub23.aClass282_Sub50_Sub7_9445, i_13_, i_14_, 1860097874);
					} else if (client.aBool7344)
						Class60.method1170(-609337146);
				}
				if (client.aClass118_7257 == null && 0 == 676534483 * client.anInt7184) {
					Class20.anInt167 = 0;
					Class46.aClass282_Sub50_Sub7_438 = null;
				}
			}
		}
	}

	static final void method7704(CS2Executor class527, int i) {
		Class521_Sub1_Sub4_Sub2.method16088((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 1);
	}

	static byte method7705(int i, int i_39_, byte i_40_) {
		if (i != Class458.aClass458_5474.anInt5481 * 1109376893)
			return (byte) 0;
		if ((i_39_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}
}
