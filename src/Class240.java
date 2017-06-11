/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class240 {
	static int anInt2616 = 16;
	Class451 aClass451_2617;
	int[] anIntArray2618;
	protected Class331 aClass331_2619;
	static int anInt2620 = 1;
	public int anInt2621 = 0;
	public boolean aBoolean2622 = false;
	int[] anIntArray2623;
	public boolean aBoolean2624;
	public boolean aBoolean2625;
	public int anInt2626;
	protected int anInt2627;
	protected int anInt2628;
	public boolean aBoolean2629;
	static int anInt2630 = 512;
	public byte[][][] aByteArrayArrayArray2631;
	protected boolean aBoolean2632;
	static int anInt2633 = 64;
	static int[][] anIntArrayArray2634;
	protected Class244 aClass244_2635;
	byte[][][] aByteArrayArrayArray2636;
	protected byte[][][] aByteArrayArrayArray2637;
	static int[][] anIntArrayArray2638;
	int[] anIntArray2639;
	int[] anIntArray2640;
	int[] anIntArray2641;
	int[] anIntArray2642;
	static int anInt2643 = 0;
	static int anInt2644 = 1;
	static int anInt2645 = 2;
	static int anInt2646 = 3;
	int[] anIntArray2647;
	static int anInt2648 = 2;
	static int[][] anIntArrayArray2649;
	static int anInt2650 = 8;
	Class375 aClass375_2651;
	static int anInt2652 = 32;
	public int[][][] anIntArrayArrayArray2653;
	static int anInt2654 = 128;
	static int anInt2655 = 256;
	static int[] anIntArray2656;
	static int anInt2657 = 4;
	static int[] anIntArray2658;
	static int[] anIntArray2659;
	static int[] anIntArray2660;
	static int[] anIntArray2661;
	static int[][] anIntArrayArray2662;
	static int[] anIntArray2663;
	static int[] anIntArray2664;
	static boolean[][] aBooleanArrayArray2665;
	static boolean[][] aBooleanArrayArray2666;
	static int anInt2667 = 0;
	byte[][][] aByteArrayArrayArray2668;
	int[] anIntArray2669;
	byte[][][] aByteArrayArrayArray2670;
	static int[][] anIntArrayArray2671;
	static int[][] anIntArrayArray2672;
	static int[][] anIntArrayArray2673;
	static int[][] anIntArrayArray2674;
	static boolean[][] aBooleanArrayArray2675;
	boolean aBoolean2676;
	boolean aBoolean2677;
	static int[][] anIntArrayArray2678;
	static int[][] anIntArrayArray2679;
	int[] anIntArray2680;
	int[] anIntArray2681;
	int[] anIntArray2682;
	int[] anIntArray2683;
	int[] anIntArray2684;
	int anInt2685;
	int[] anIntArray2686;
	int anInt2687;
	int anInt2688;
	int anInt2689;
	static int[][] anIntArrayArray2690;
	static int[] anIntArray2691 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	int anInt2692;
	int anInt2693;
	boolean aBoolean2694;
	static boolean[][] aBooleanArrayArray2695;
	boolean aBoolean2696;
	public boolean aBoolean2697 = false;
	byte[][][] aByteArrayArrayArray2698;
	int anInt2699;
	int[] anIntArray2700;
	int anInt2701;
	int[] anIntArray2702;
	int anInt2703;
	static int anInt2704;

	public final void method2211(int i, int[][] is, int i_0_) {
		try {
			int[][] is_1_ = anIntArrayArrayArray2653[i];
			for (int i_2_ = 0; i_2_ < anInt2627 * -954368823 + 1; i_2_++) {
				for (int i_3_ = 0; i_3_ < 1 + anInt2628 * 181474463; i_3_++)
					is_1_[i_2_][i_3_] += is[i_2_][i_3_];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.u(").append(')').toString());
		}
	}

	public void method2212(int i) {
		try {
			aBoolean2632 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.a(").append(')').toString());
		}
	}

	public final void method2213(int i, int i_4_, int i_5_, int i_6_, byte i_7_) {
		try {
			for (int i_8_ = 0; i_8_ < anInt2626 * 1551623871; i_8_++)
				method2214(i_8_, i, i_4_, i_5_, i_6_, -994484260);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.b(").append(')').toString());
		}
	}

	public final void method2214(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		try {
			for (int i_14_ = i_10_; i_14_ < i_12_ + i_10_; i_14_++) {
				for (int i_15_ = i_9_; i_15_ < i_11_ + i_9_; i_15_++) {
					if (i_15_ >= 0 && i_15_ < anInt2627 * -954368823 && i_14_ >= 0 && i_14_ < anInt2628 * 181474463)
						anIntArrayArrayArray2653[i][i_15_][i_14_] = i > 0 ? (anIntArrayArrayArray2653[i - 1][i_15_][i_14_]) - 960 : 0;
				}
			}
			if (i_9_ > 0 && i_9_ < anInt2627 * -954368823) {
				for (int i_16_ = 1 + i_10_; i_16_ < i_10_ + i_12_; i_16_++) {
					if (i_16_ >= 0 && i_16_ < 181474463 * anInt2628)
						anIntArrayArrayArray2653[i][i_9_][i_16_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_16_];
				}
			}
			if (i_10_ > 0 && i_10_ < 181474463 * anInt2628) {
				for (int i_17_ = 1 + i_9_; i_17_ < i_11_ + i_9_; i_17_++) {
					if (i_17_ >= 0 && i_17_ < -954368823 * anInt2627)
						anIntArrayArrayArray2653[i][i_17_][i_10_] = anIntArrayArrayArray2653[i][i_17_][i_10_ - 1];
				}
			}
			if (i_9_ >= 0 && i_10_ >= 0 && i_9_ < anInt2627 * -954368823 && i_10_ < anInt2628 * 181474463) {
				if (i == 0) {
					if (i_9_ > 0 && anIntArrayArrayArray2653[i][i_9_ - 1][i_10_] != 0)
						anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_10_];
					else if (i_10_ > 0 && 0 != (anIntArrayArrayArray2653[i][i_9_][i_10_ - 1]))
						anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_][i_10_ - 1];
					else if (i_9_ > 0 && i_10_ > 0 && 0 != (anIntArrayArrayArray2653[i][i_9_ - 1][i_10_ - 1]))
						anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_10_ - 1];
				} else if (i_9_ > 0 && (anIntArrayArrayArray2653[i][i_9_ - 1][i_10_] != (anIntArrayArrayArray2653[i - 1][i_9_ - 1][i_10_])))
					anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_10_];
				else if (i_10_ > 0 && (anIntArrayArrayArray2653[i][i_9_][i_10_ - 1] != (anIntArrayArrayArray2653[i - 1][i_9_][i_10_ - 1])))
					anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_][i_10_ - 1];
				else if (i_9_ > 0 && i_10_ > 0 && (anIntArrayArrayArray2653[i][i_9_ - 1][i_10_ - 1] != (anIntArrayArrayArray2653[i - 1][i_9_ - 1][i_10_ - 1])))
					anIntArrayArrayArray2653[i][i_9_][i_10_] = anIntArrayArrayArray2653[i][i_9_ - 1][i_10_ - 1];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.p(").append(')').toString());
		}
	}

	public final void method2215(RsByteBuffer class298_sub53, int i, int i_18_, int i_19_, int i_20_, Class289[] class289s, int i_21_) {
		try {
			if (!aBoolean2629) {
				for (int i_22_ = 0; i_22_ < 4; i_22_++) {
					Class289 class289 = class289s[i_22_];
					for (int i_23_ = 0; i_23_ < 64; i_23_++) {
						for (int i_24_ = 0; i_24_ < 64; i_24_++) {
							int i_25_ = i + i_23_;
							int i_26_ = i_24_ + i_18_;
							if (i_25_ >= 0 && i_25_ < -954368823 * anInt2627 && i_26_ >= 0 && i_26_ < anInt2628 * 181474463)
								class289.method2744(i_25_, i_26_, -1001372278);
						}
					}
				}
			}
			int i_27_ = i + i_19_;
			int i_28_ = i_20_ + i_18_;
			for (int i_29_ = 0; i_29_ < anInt2626 * 1551623871; i_29_++) {
				for (int i_30_ = 0; i_30_ < 64; i_30_++) {
					for (int i_31_ = 0; i_31_ < 64; i_31_++)
						method2228(class298_sub53, i_29_, i_30_ + i, i_18_ + i_31_, 0, 0, i_30_ + i_27_, i_28_ + i_31_, 0, false, -2042161970);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.i(").append(')').toString());
		}
	}

	public final void method2216(RsByteBuffer class298_sub53, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, Class289[] class289s, int i_38_) {
		try {
			int i_39_ = (i_35_ & 0x7) * 8;
			int i_40_ = 8 * (i_36_ & 0x7);
			if (!aBoolean2629) {
				Class289 class289 = class289s[i];
				for (int i_41_ = 0; i_41_ < 8; i_41_++) {
					for (int i_42_ = 0; i_42_ < 8; i_42_++) {
						int i_43_ = (i_32_ + Class402.method4941(i_41_ & 0x7, i_42_ & 0x7, i_37_, -1280307862));
						int i_44_ = (i_33_ + Class472.method6064(i_41_ & 0x7, i_42_ & 0x7, i_37_, (byte) -111));
						if (i_43_ > 0 && i_43_ < anInt2627 * -954368823 - 1 && i_44_ > 0 && i_44_ < 181474463 * anInt2628 - 1)
							class289.method2744(i_43_, i_44_, -1032370407);
					}
				}
			}
			int i_45_ = (i_35_ & ~0x7) << 3;
			int i_46_ = (i_36_ & ~0x7) << 3;
			int i_47_ = 0;
			int i_48_ = 0;
			if (1 == i_37_)
				i_48_ = 1;
			else if (2 == i_37_) {
				i_47_ = 1;
				i_48_ = 1;
			} else if (i_37_ == 3)
				i_47_ = 1;
			for (int i_49_ = 0; i_49_ < 1551623871 * anInt2626; i_49_++) {
				for (int i_50_ = 0; i_50_ < 64; i_50_++) {
					for (int i_51_ = 0; i_51_ < 64; i_51_++) {
						if (i_49_ == i_34_ && i_50_ >= i_39_ && i_50_ <= i_39_ + 8 && i_51_ >= i_40_ && i_51_ <= i_40_ + 8) {
							int i_52_;
							int i_53_;
							if (i_50_ == 8 + i_39_ || 8 + i_40_ == i_51_) {
								if (0 == i_37_) {
									i_52_ = i_32_ + (i_50_ - i_39_);
									i_53_ = i_33_ + (i_51_ - i_40_);
								} else if (1 == i_37_) {
									i_52_ = i_32_ + (i_51_ - i_40_);
									i_53_ = i_33_ + 8 - (i_50_ - i_39_);
								} else if (2 == i_37_) {
									i_52_ = i_32_ + 8 - (i_50_ - i_39_);
									i_53_ = 8 + i_33_ - (i_51_ - i_40_);
								} else {
									i_52_ = 8 + i_32_ - (i_51_ - i_40_);
									i_53_ = i_33_ + (i_50_ - i_39_);
								}
								method2228(class298_sub53, i, i_52_, i_53_, 0, 0, i_45_ + i_50_, i_51_ + i_46_, 0, true, -2042161970);
							} else {
								i_52_ = i_32_ + Class402.method4941(i_50_ & 0x7, i_51_ & 0x7, i_37_, -1280307862);
								i_53_ = i_33_ + Class472.method6064(i_50_ & 0x7, i_51_ & 0x7, i_37_, (byte) -33);
								method2228(class298_sub53, i, i_52_, i_53_, i_47_, i_48_, i_50_ + i_45_, i_51_ + i_46_, i_37_, false, -2042161970);
							}
							if (63 == i_50_ || 63 == i_51_) {
								int i_54_ = 1;
								if (i_50_ == 63 && i_51_ == 63)
									i_54_ = 3;
								for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
									int i_56_ = i_50_;
									int i_57_ = i_51_;
									if (0 == i_55_) {
										i_56_ = i_50_ == 63 ? 64 : i_50_;
										i_57_ = 63 == i_51_ ? 64 : i_51_;
									} else if (1 == i_55_)
										i_56_ = 64;
									else if (2 == i_55_)
										i_57_ = 64;
									int i_58_;
									int i_59_;
									if (i_37_ == 0) {
										i_58_ = i_32_ + (i_56_ - i_39_);
										i_59_ = i_33_ + (i_57_ - i_40_);
									} else if (i_37_ == 1) {
										i_58_ = i_57_ - i_40_ + i_32_;
										i_59_ = 8 + i_33_ - (i_56_ - i_39_);
									} else if (2 == i_37_) {
										i_58_ = i_32_ + 8 - (i_56_ - i_39_);
										i_59_ = i_33_ + 8 - (i_57_ - i_40_);
									} else {
										i_58_ = i_32_ + 8 - (i_57_ - i_40_);
										i_59_ = i_33_ + (i_56_ - i_39_);
									}
									if (i_58_ >= 0 && i_58_ < anInt2627 * -954368823 && i_59_ >= 0 && i_59_ < 181474463 * anInt2628)
										anIntArrayArrayArray2653[i][i_58_][i_59_] = (anIntArrayArrayArray2653[i][i_52_ + i_47_][i_53_ + i_48_]);
								}
							}
						} else
							method2228(class298_sub53, 0, -1, -1, 0, 0, 0, 0, 0, false, -2042161970);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.k(").append(')').toString());
		}
	}

	public void method2217(int i) {
		try {
			((Class240) this).anIntArray2669 = null;
			((Class240) this).anIntArray2639 = null;
			((Class240) this).anIntArray2640 = null;
			((Class240) this).anIntArray2641 = null;
			((Class240) this).anIntArray2642 = null;
			aBoolean2632 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.f(").append(')').toString());
		}
	}

	public void method2218(GraphicsToolkit class_ra, int[][][] is, Class289[] class289s, byte i) {
		try {
			if (!aBoolean2629) {
				for (int i_60_ = 0; i_60_ < 4; i_60_++) {
					for (int i_61_ = 0; i_61_ < anInt2627 * -954368823; i_61_++) {
						for (int i_62_ = 0; i_62_ < anInt2628 * 181474463; i_62_++) {
							if (0 != ((aClass244_2635.aByteArrayArrayArray2731[i_60_][i_61_][i_62_]) & 0x1)) {
								int i_63_ = i_60_;
								if (0 != ((aClass244_2635.aByteArrayArrayArray2731[1][i_61_][i_62_]) & 0x2))
									i_63_--;
								if (i_63_ >= 0)
									class289s[i_63_].method2733(i_61_, i_62_, (byte) 4);
							}
						}
					}
				}
			}
			for (int i_64_ = 0; i_64_ < 1551623871 * anInt2626; i_64_++) {
				int i_65_ = 0;
				int i_66_ = 0;
				if (!aBoolean2629) {
					if (aBoolean2622)
						i_66_ |= 0x8;
					if (aBoolean2697)
						i_65_ |= 0x2;
					if (917702315 * anInt2621 != 0) {
						i_65_ |= 0x1;
						i_66_ |= 0x10;
					}
				}
				if (aBoolean2697)
					i_66_ |= 0x7;
				if (!aBoolean2625)
					i_66_ |= 0x20;
				int[][] is_67_ = (null != is && i_64_ < is.length ? is[i_64_] : anIntArrayArrayArray2653[i_64_]);
				aClass331_2619.method4056(i_64_, class_ra.method5040(anInt2627 * -954368823, 181474463 * anInt2628, anIntArrayArrayArray2653[i_64_], is_67_, 512, i_65_, i_66_), (byte) 32);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.x(").append(')').toString());
		}
	}

	public final void method2219(GraphicsToolkit class_ra, Class_xa class_xa, Class_xa class_xa_68_, byte i) {
		try {
			int[][] is = new int[anInt2627 * -954368823][181474463 * anInt2628];
			if (null == ((Class240) this).anIntArray2669 || (((Class240) this).anIntArray2669.length != 181474463 * anInt2628)) {
				((Class240) this).anIntArray2669 = new int[181474463 * anInt2628];
				((Class240) this).anIntArray2639 = new int[anInt2628 * 181474463];
				((Class240) this).anIntArray2640 = new int[181474463 * anInt2628];
				((Class240) this).anIntArray2641 = new int[anInt2628 * 181474463];
				((Class240) this).anIntArray2642 = new int[181474463 * anInt2628];
			}
			for (int i_69_ = 0; i_69_ < 1551623871 * anInt2626; i_69_++) {
				for (int i_70_ = 0; i_70_ < anInt2628 * 181474463; i_70_++) {
					((Class240) this).anIntArray2669[i_70_] = 0;
					((Class240) this).anIntArray2639[i_70_] = 0;
					((Class240) this).anIntArray2640[i_70_] = 0;
					((Class240) this).anIntArray2641[i_70_] = 0;
					((Class240) this).anIntArray2642[i_70_] = 0;
				}
				for (int i_71_ = -5; i_71_ < anInt2627 * -954368823; i_71_++) {
					for (int i_72_ = 0; i_72_ < anInt2628 * 181474463; i_72_++) {
						int i_73_ = 5 + i_71_;
						if (i_73_ < anInt2627 * -954368823) {
							int i_74_ = ((((Class240) this).aByteArrayArrayArray2670[i_69_][i_73_][i_72_]) & 0xff);
							if (i_74_ > 0) {
								Class443 class443 = ((Class240) this).aClass451_2617.method5932(i_74_ - 1, (byte) -1);
								((Class240) this).anIntArray2669[i_72_] += class443.anInt5598 * 838046775;
								((Class240) this).anIntArray2639[i_72_] += -620399085 * class443.anInt5595;
								((Class240) this).anIntArray2640[i_72_] += 656695887 * class443.anInt5600;
								((Class240) this).anIntArray2641[i_72_] += class443.anInt5601 * -813159285;
								((Class240) this).anIntArray2642[i_72_]++;
							}
						}
						int i_75_ = i_71_ - 5;
						if (i_75_ >= 0) {
							int i_76_ = ((((Class240) this).aByteArrayArrayArray2670[i_69_][i_75_][i_72_]) & 0xff);
							if (i_76_ > 0) {
								Class443 class443 = ((Class240) this).aClass451_2617.method5932(i_76_ - 1, (byte) -1);
								((Class240) this).anIntArray2669[i_72_] -= class443.anInt5598 * 838046775;
								((Class240) this).anIntArray2639[i_72_] -= -620399085 * class443.anInt5595;
								((Class240) this).anIntArray2640[i_72_] -= class443.anInt5600 * 656695887;
								((Class240) this).anIntArray2641[i_72_] -= class443.anInt5601 * -813159285;
								((Class240) this).anIntArray2642[i_72_]--;
							}
						}
					}
					if (i_71_ >= 0) {
						int i_77_ = 0;
						int i_78_ = 0;
						int i_79_ = 0;
						int i_80_ = 0;
						int i_81_ = 0;
						for (int i_82_ = -5; i_82_ < 181474463 * anInt2628; i_82_++) {
							int i_83_ = 5 + i_82_;
							if (i_83_ < 181474463 * anInt2628) {
								i_77_ += ((Class240) this).anIntArray2669[i_83_];
								i_78_ += ((Class240) this).anIntArray2639[i_83_];
								i_79_ += ((Class240) this).anIntArray2640[i_83_];
								i_80_ += ((Class240) this).anIntArray2641[i_83_];
								i_81_ += ((Class240) this).anIntArray2642[i_83_];
							}
							int i_84_ = i_82_ - 5;
							if (i_84_ >= 0) {
								i_77_ -= ((Class240) this).anIntArray2669[i_84_];
								i_78_ -= ((Class240) this).anIntArray2639[i_84_];
								i_79_ -= ((Class240) this).anIntArray2640[i_84_];
								i_80_ -= ((Class240) this).anIntArray2641[i_84_];
								i_81_ -= ((Class240) this).anIntArray2642[i_84_];
							}
							if (i_82_ >= 0 && i_80_ > 0 && i_81_ > 0)
								is[i_71_][i_82_] = Class401.method4933(256 * i_77_ / i_80_, i_78_ / i_81_, i_79_ / i_81_, -1708993857);
						}
					}
				}
				if (aBoolean2624)
					method2221(class_ra, aClass331_2619.aClass_xaArray3517[i_69_], i_69_, is, 0 == i_69_ ? class_xa : null, i_69_ == 0 ? class_xa_68_ : null, (byte) 114);
				else
					method2220(class_ra, aClass331_2619.aClass_xaArray3517[i_69_], i_69_, is, 0 == i_69_ ? class_xa : null, 0 == i_69_ ? class_xa_68_ : null, (byte) -8);
				((Class240) this).aByteArrayArrayArray2670[i_69_] = null;
				((Class240) this).aByteArrayArrayArray2636[i_69_] = null;
				((Class240) this).aByteArrayArrayArray2698[i_69_] = null;
				((Class240) this).aByteArrayArrayArray2668[i_69_] = null;
			}
			if (!aBoolean2629) {
				if (917702315 * anInt2621 != 0)
					aClass331_2619.method4024((byte) -114);
				if (aBoolean2697)
					aClass331_2619.method4049((byte) -116);
			}
			for (int i_85_ = 0; i_85_ < 1551623871 * anInt2626; i_85_++)
				aClass331_2619.aClass_xaArray3517[i_85_].SA();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.r(").append(')').toString());
		}
	}

	void method2220(GraphicsToolkit class_ra, Class_xa class_xa, int i, int[][] is, Class_xa class_xa_86_, Class_xa class_xa_87_, byte i_88_) {
		try {
			for (int i_89_ = 0; i_89_ < -954368823 * anInt2627; i_89_++) {
				for (int i_90_ = 0; i_90_ < anInt2628 * 181474463; i_90_++) {
					byte i_91_ = (((Class240) this).aByteArrayArrayArray2698[i][i_89_][i_90_]);
					byte i_92_ = (((Class240) this).aByteArrayArrayArray2668[i][i_89_][i_90_]);
					int i_93_ = ((((Class240) this).aByteArrayArrayArray2636[i][i_89_][i_90_]) & 0xff);
					int i_94_ = ((((Class240) this).aByteArrayArrayArray2670[i][i_89_][i_90_]) & 0xff);
					Class373 class373 = (i_93_ != 0 ? ((Class240) this).aClass375_2651.method4645(i_93_ - 1, -165601895) : null);
					Class443 class443 = (i_94_ != 0 ? ((Class240) this).aClass451_2617.method5932(i_94_ - 1, (byte) -1) : null);
					if (i_91_ == 0 && null == class373)
						i_91_ = (byte) 12;
					Class373 class373_95_ = class373;
					if (class373 != null && class373.anInt4056 * -45966925 == -1 && -1 == class373.anInt4059 * 1728947183) {
						class373_95_ = class373;
						class373 = null;
					}
					if (class373 == null && class443 == null) {
						if (i_88_ == 0)
							throw new IllegalStateException();
					} else {
						((Class240) this).anInt2701 = 989325699 * anIntArray2658[i_91_];
						((Class240) this).anInt2699 = anIntArray2691[i_91_] * -786924081;
						int i_96_ = ((class373 != null ? 1500080431 * ((Class240) this).anInt2699 : 0) + (class443 != null ? -299537109 * ((Class240) this).anInt2701 : 0));
						int i_97_ = 0;
						((Class240) this).anInt2688 = 0;
						((Class240) this).anInt2703 = ((class373 != null ? 324071475 * class373.anInt4057 : -1) * -365069805);
						int i_98_ = (null != class443 ? class443.anInt5594 * 2012295231 : -1);
						int[] is_99_ = new int[i_96_];
						int[] is_100_ = new int[i_96_];
						int[] is_101_ = new int[i_96_];
						int[] is_102_ = new int[i_96_];
						int[] is_103_ = new int[i_96_];
						int[] is_104_ = new int[i_96_];
						int[] is_105_ = ((null != class373 && 1728947183 * class373.anInt4059 != -1) ? new int[i_96_] : null);
						if (class373 != null) {
							for (int i_106_ = 0; (i_106_ < 1500080431 * ((Class240) this).anInt2699); i_106_++) {
								is_99_[i_97_] = (anIntArrayArray2638[i_91_][(((Class240) this).anInt2688 * -875169383)]);
								is_100_[i_97_] = (anIntArrayArray2690[i_91_][(((Class240) this).anInt2688 * -875169383)]);
								is_101_[i_97_] = (anIntArrayArray2634[i_91_][(((Class240) this).anInt2688 * -875169383)]);
								is_103_[i_97_] = ((Class240) this).anInt2703 * 1659854875;
								is_104_[i_97_] = -1551409901 * class373.anInt4060;
								is_102_[i_97_] = -45966925 * class373.anInt4056;
								if (is_105_ != null)
									is_105_[i_97_] = class373.anInt4059 * 1728947183;
								i_97_++;
								((Class240) this).anInt2688 += -1319613783;
							}
							if (!aBoolean2629 && 0 == i)
								aClass331_2619.method4019(i_89_, i_90_, 1987637503 * class373.anInt4064, 1104862312 * class373.anInt4066, 2077360047 * class373.anInt4054, class373.anInt4067 * -986621081, class373.anInt4068 * 171987805, -589660893 * class373.anInt4069, (byte) 26);
						} else
							((Class240) this).anInt2688 += 640026119 * ((Class240) this).anInt2699;
						if (class443 != null) {
							for (int i_107_ = 0; (i_107_ < ((Class240) this).anInt2701 * -299537109); i_107_++) {
								is_99_[i_97_] = (anIntArrayArray2638[i_91_][(((Class240) this).anInt2688 * -875169383)]);
								is_100_[i_97_] = (anIntArrayArray2690[i_91_][(((Class240) this).anInt2688 * -875169383)]);
								is_101_[i_97_] = (anIntArrayArray2634[i_91_][(((Class240) this).anInt2688 * -875169383)]);
								is_103_[i_97_] = i_98_;
								is_104_[i_97_] = -1106852061 * class443.anInt5597;
								is_102_[i_97_] = is[i_89_][i_90_];
								if (null != is_105_)
									is_105_[i_97_] = is_102_[i_97_];
								i_97_++;
								((Class240) this).anInt2688 += -1319613783;
							}
						}
						int i_108_ = anIntArray2663.length;
						int[] is_109_ = new int[i_108_];
						int[] is_110_ = new int[i_108_];
						int[] is_111_ = null != class_xa_87_ ? new int[i_108_] : null;
						int[] is_112_ = (class_xa_87_ != null || null != class_xa_86_ ? new int[i_108_] : null);
						for (int i_113_ = 0; i_113_ < i_108_; i_113_++) {
							int i_114_ = anIntArray2663[i_113_];
							int i_115_ = anIntArray2664[i_113_];
							if (0 == i_92_) {
								is_109_[i_113_] = i_114_;
								is_110_[i_113_] = i_115_;
							} else if (i_92_ == 1) {
								int i_116_ = i_114_;
								is_109_[i_113_] = i_115_;
								is_110_[i_113_] = 512 - i_116_;
							} else if (i_92_ == 2) {
								is_109_[i_113_] = 512 - i_114_;
								is_110_[i_113_] = 512 - i_115_;
							} else if (3 == i_92_) {
								int i_117_ = i_114_;
								is_109_[i_113_] = 512 - i_115_;
								is_110_[i_113_] = i_117_;
							}
							if (is_111_ != null && aBooleanArrayArray2665[i_91_][i_113_]) {
								int i_118_ = (i_89_ << 9) + is_109_[i_113_];
								int i_119_ = (i_90_ << 9) + is_110_[i_113_];
								is_111_[i_113_] = (class_xa_87_.method6340(i_118_, i_119_, -1630287818) - class_xa.method6340(i_118_, i_119_, -1985119630));
							}
							if (is_112_ != null) {
								if (null != class_xa_87_ && !(aBooleanArrayArray2665[i_91_][i_113_])) {
									int i_120_ = is_109_[i_113_] + (i_89_ << 9);
									int i_121_ = (i_90_ << 9) + is_110_[i_113_];
									is_112_[i_113_] = (class_xa.method6340(i_120_, i_121_, -2021974678) - (class_xa_87_.method6340(i_120_, i_121_, -1548103444)));
								} else if (null != class_xa_86_ && !(aBooleanArrayArray2666[i_91_][i_113_])) {
									int i_122_ = is_109_[i_113_] + (i_89_ << 9);
									int i_123_ = is_110_[i_113_] + (i_90_ << 9);
									is_112_[i_113_] = (class_xa_86_.method6340(i_122_, i_123_, -1771548697) - class_xa.method6340(i_122_, i_123_, -1288158581));
								}
							}
						}
						int i_124_ = class_xa.method6341(i_89_, i_90_, (byte) -95);
						int i_125_ = class_xa.method6341(1 + i_89_, i_90_, (byte) -111);
						int i_126_ = class_xa.method6341(1 + i_89_, i_90_ + 1, (byte) -31);
						int i_127_ = class_xa.method6341(i_89_, 1 + i_90_, (byte) -5);
						boolean bool = aClass244_2635.method2320(i_89_, i_90_, 471001785);
						if (bool && i > 1 || !bool && i > 0) {
							boolean bool_128_ = true;
							if (class443 != null && !class443.aBoolean5596)
								bool_128_ = false;
							else if (0 == i_94_ && 0 != i_91_)
								bool_128_ = false;
							else if (i_93_ > 0 && class373_95_ != null && !class373_95_.aBoolean4062)
								bool_128_ = false;
							if (bool_128_ && i_125_ == i_124_ && i_124_ == i_126_ && i_127_ == i_124_)
								aByteArrayArrayArray2637[i][i_89_][i_90_] |= 0x4;
						}
						Class78 class78 = new Class78();
						if (aBoolean2629) {
							class78.anInt726 = (aClass331_2619.method4015(i_89_, i_90_, (byte) 76) * 614121861);
							class78.anInt725 = (aClass331_2619.method4014(i_89_, i_90_, (byte) 47) * -885436027);
							class78.anInt727 = (aClass331_2619.method4016(i_89_, i_90_, (byte) -105) * 399458545);
							class78.anInt729 = (aClass331_2619.method4017(i_89_, i_90_, (byte) 90) * 1507836083);
							class78.anInt730 = (aClass331_2619.method4060(i_89_, i_90_, -374977085) * -1927451111);
							class78.anInt732 = (aClass331_2619.method4018(i_89_, i_90_, -1965414520) * -875460563);
						}
						class_xa.method6336(i_89_, i_90_, is_109_, is_111_, is_110_, is_112_, is_99_, is_100_, is_101_, is_102_, is_105_, is_103_, is_104_, class78, false);
						aClass331_2619.method4013(i, i_89_, i_90_, -239048224);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.q(").append(')').toString());
		}
	}

	void method2221(GraphicsToolkit class_ra, Class_xa class_xa, int i, int[][] is, Class_xa class_xa_129_, Class_xa class_xa_130_, byte i_131_) {
		try {
			byte[][] is_132_ = ((Class240) this).aByteArrayArrayArray2698[i];
			byte[][] is_133_ = ((Class240) this).aByteArrayArrayArray2668[i];
			byte[][] is_134_ = ((Class240) this).aByteArrayArrayArray2670[i];
			byte[][] is_135_ = ((Class240) this).aByteArrayArrayArray2636[i];
			boolean[] bools = new boolean[4];
			for (int i_136_ = 0; i_136_ < -954368823 * anInt2627; i_136_++) {
				int i_137_ = (i_136_ < anInt2627 * -954368823 - 1 ? 1 + i_136_ : i_136_);
				for (int i_138_ = 0; i_138_ < anInt2628 * 181474463; i_138_++) {
					int i_139_ = (i_138_ < 181474463 * anInt2628 - 1 ? i_138_ + 1 : i_138_);
					((Class240) this).anInt2687 = is_132_[i_136_][i_138_] * 1375153633;
					((Class240) this).anInt2688 = -1319613783 * is_133_[i_136_][i_138_];
					int i_140_ = is_135_[i_136_][i_138_] & 0xff;
					int i_141_ = is_134_[i_136_][i_138_] & 0xff;
					if (i_140_ == 0 && 0 == i_141_) {
						if (i_131_ <= -1)
							return;
					} else {
						Class373 class373 = (0 != i_140_ ? ((Class240) this).aClass375_2651.method4645(i_140_ - 1, -165601895) : null);
						Class443 class443 = (i_141_ != 0 ? ((Class240) this).aClass451_2617.method5932(i_141_ - 1, (byte) -1) : null);
						if (-1377184223 * ((Class240) this).anInt2687 == 0 && class373 == null)
							((Class240) this).anInt2687 = -678025588;
						((Class240) this).aBoolean2694 = false;
						((Class240) this).aBoolean2676 = false;
						boolean[] bools_142_ = bools;
						boolean[] bools_143_ = bools;
						boolean[] bools_144_ = bools;
						bools[3] = false;
						bools_144_[2] = false;
						bools_143_[1] = false;
						bools_142_[0] = false;
						Class373 class373_145_ = class373;
						if (null != class373) {
							if (class373.anInt4056 * -45966925 == -1 && class373.anInt4059 * 1728947183 == -1) {
								class373_145_ = class373;
								class373 = null;
							} else if (null != class443 && (-1377184223 * ((Class240) this).anInt2687) != 0)
								((Class240) this).aBoolean2676 = class373.aBoolean4063;
						}
						((Class240) this).anInt2688 = method2222(i_141_, i_136_, i_138_, i_137_, i_139_, class_xa, is_134_, -1666801922) * -1319613783;
						for (int i_146_ = 0; i_146_ < 13; i_146_++) {
							((Class240) this).anIntArray2647[i_146_] = -1;
							((Class240) this).anIntArray2686[i_146_] = 1;
						}
						method2223(class_ra, class373, class443, i_136_, i_138_, is_132_, is_133_, is_135_, bools, (short) 803);
						((Class240) this).aBoolean2696 = (!((Class240) this).aBoolean2676 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
						method2224(class373, class443, (byte) 4);
						int i_147_ = (-299537109 * ((Class240) this).anInt2701 + 1500080431 * ((Class240) this).anInt2699);
						if (i_147_ <= 0)
							aClass331_2619.method4013(i, i_136_, i_138_, 1960447518);
						else {
							if (bools[0])
								i_147_++;
							if (bools[2])
								i_147_++;
							if (bools[1])
								i_147_++;
							if (bools[3])
								i_147_++;
							((Class240) this).anInt2689 = 0;
							((Class240) this).anInt2685 = 0;
							int i_148_ = 3 * i_147_;
							int[] is_149_ = (((Class240) this).aBoolean2677 ? new int[i_148_] : null);
							int[] is_150_ = new int[i_148_];
							int[] is_151_ = new int[i_148_];
							int[] is_152_ = new int[i_148_];
							int[] is_153_ = new int[i_148_];
							int[] is_154_ = new int[i_148_];
							int[] is_155_ = (class_xa_130_ != null ? new int[i_148_] : null);
							int[] is_156_ = ((null != class_xa_130_ || class_xa_129_ != null) ? new int[i_148_] : null);
							method2225(class_ra, i, i_136_, i_138_, class373, bools, is_149_, is_150_, is_151_, is_152_, is_153_, is_154_, is_155_, is_156_, class_xa, class_xa_130_, class_xa_129_, (byte) -84);
							int i_157_ = is_134_[i_136_][i_139_] & 0xff;
							int i_158_ = is_134_[i_137_][i_139_] & 0xff;
							int i_159_ = is_134_[i_137_][i_138_] & 0xff;
							method2226(class_ra, i, i_136_, i_138_, i_137_, i_139_, class443, i_141_, i_157_, i_158_, i_159_, bools, is_149_, is_150_, is_151_, is_152_, is_153_, is_154_, is_155_, is_156_, is, class_xa, class_xa_130_, class_xa_129_, (short) 9391);
							method2229(class_xa, class443, class373_145_, i, i_136_, i_138_, i_137_, i_139_, i_141_, i_140_, 1222931725);
							Class78 class78 = new Class78();
							if (aBoolean2629) {
								class78.anInt726 = (aClass331_2619.method4015(i_136_, i_138_, (byte) 60) * 614121861);
								class78.anInt725 = (aClass331_2619.method4014(i_136_, i_138_, (byte) 89) * -885436027);
								class78.anInt727 = (aClass331_2619.method4016(i_136_, i_138_, (byte) -43) * 399458545);
								class78.anInt729 = (aClass331_2619.method4017(i_136_, i_138_, (byte) 2) * 1507836083);
								class78.anInt730 = (aClass331_2619.method4060(i_136_, i_138_, -37055227) * -1927451111);
								class78.anInt732 = (aClass331_2619.method4018(i_136_, i_138_, -1965414520) * -875460563);
							}
							class_xa.method6335(i_136_, i_138_, is_150_, is_155_, is_151_, is_156_, is_152_, is_149_, is_153_, is_154_, class78, (((Class240) this).aBoolean2694));
							aClass331_2619.method4013(i, i_136_, i_138_, 200248008);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.n(").append(')').toString());
		}
	}

	int method2222(int i, int i_160_, int i_161_, int i_162_, int i_163_, Class_xa class_xa, byte[][] is, int i_164_) {
		try {
			if ((0 == ((Class240) this).anInt2687 * -1377184223 || 12 == ((Class240) this).anInt2687 * -1377184223) && i_160_ > 0 && i_161_ > 0 && i_160_ < anInt2627 * -954368823 && i_161_ < anInt2628 * 181474463) {
				int i_165_ = 0;
				int i_166_ = 0;
				int i_167_ = 0;
				int i_168_ = 0;
				i_165_ = i_165_ + (i == is[i_160_ - 1][i_161_ - 1] ? 1 : -1);
				i_166_ = i_166_ + (is[i_162_][i_161_ - 1] == i ? 1 : -1);
				i_167_ = i_167_ + (i == is[i_162_][i_163_] ? 1 : -1);
				i_168_ = i_168_ + (i == is[i_160_ - 1][i_163_] ? 1 : -1);
				if (is[i_160_][i_161_ - 1] == i) {
					i_165_++;
					i_166_++;
				} else {
					i_165_--;
					i_166_--;
				}
				if (i == is[i_162_][i_161_]) {
					i_166_++;
					i_167_++;
				} else {
					i_166_--;
					i_167_--;
				}
				if (i == is[i_160_][i_163_]) {
					i_167_++;
					i_168_++;
				} else {
					i_167_--;
					i_168_--;
				}
				if (is[i_160_ - 1][i_161_] == i) {
					i_168_++;
					i_165_++;
				} else {
					i_168_--;
					i_165_--;
				}
				int i_169_ = i_165_ - i_167_;
				if (i_169_ < 0)
					i_169_ = -i_169_;
				int i_170_ = i_166_ - i_168_;
				if (i_170_ < 0)
					i_170_ = -i_170_;
				if (i_169_ == i_170_) {
					i_169_ = (class_xa.method6341(i_160_, i_161_, (byte) -74) - class_xa.method6341(i_162_, i_163_, (byte) -114));
					if (i_169_ < 0)
						i_169_ = -i_169_;
					i_170_ = (class_xa.method6341(i_162_, i_161_, (byte) -76) - class_xa.method6341(i_160_, i_163_, (byte) -82));
					if (i_170_ < 0)
						i_170_ = -i_170_;
				}
				return i_169_ < i_170_ ? 1 : 0;
			}
			return -875169383 * ((Class240) this).anInt2688;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.s(").append(')').toString());
		}
	}

	void method2223(GraphicsToolkit class_ra, Class373 class373, Class443 class443, int i, int i_171_, byte[][] is, byte[][] is_172_, byte[][] is_173_, boolean[] bools, short i_174_) {
		try {
			boolean[] bools_175_ = (class373 != null && class373.aBoolean4063 ? (aBooleanArrayArray2675[-1377184223 * ((Class240) this).anInt2687]) : (aBooleanArrayArray2695[((Class240) this).anInt2687 * -1377184223]));
			method2227(class_ra, class373, class443, i, i_171_, -954368823 * anInt2627, 181474463 * anInt2628, is_173_, is, is_172_, bools, -2064335777);
			((Class240) this).aBoolean2677 = null != class373 && (-45966925 * class373.anInt4056 != 1728947183 * class373.anInt4059);
			if (!((Class240) this).aBoolean2677) {
				for (int i_176_ = 0; i_176_ < 8; i_176_++) {
					if (((Class240) this).anIntArray2647[i_176_] >= 0 && (((Class240) this).anIntArray2682[i_176_] != ((Class240) this).anIntArray2681[i_176_])) {
						((Class240) this).aBoolean2677 = true;
						break;
					}
				}
			}
			if (!bools_175_[1 + ((Class240) this).anInt2688 * -875169383 & 0x3]) {
				boolean[] bools_177_ = bools;
				int i_178_ = 1;
				bools_177_[i_178_] = (bools_177_[i_178_] | (((Class240) this).anIntArray2686[2] & ((Class240) this).anIntArray2686[4]) == 0);
			}
			if (!bools_175_[3 + ((Class240) this).anInt2688 * -875169383 & 0x3]) {
				boolean[] bools_179_ = bools;
				int i_180_ = 3;
				bools_179_[i_180_] = (bools_179_[i_180_] | (((Class240) this).anIntArray2686[6] & ((Class240) this).anIntArray2686[0]) == 0);
			}
			if (!bools_175_[0 + -875169383 * ((Class240) this).anInt2688 & 0x3]) {
				boolean[] bools_181_ = bools;
				int i_182_ = 0;
				bools_181_[i_182_] = (bools_181_[i_182_] | 0 == (((Class240) this).anIntArray2686[0] & ((Class240) this).anIntArray2686[2]));
			}
			if (!bools_175_[((Class240) this).anInt2688 * -875169383 + 2 & 0x3]) {
				boolean[] bools_183_ = bools;
				int i_184_ = 2;
				bools_183_[i_184_] = (bools_183_[i_184_] | (((Class240) this).anIntArray2686[4] & ((Class240) this).anIntArray2686[6]) == 0);
			}
			if (!((Class240) this).aBoolean2676 && (((Class240) this).anInt2687 * -1377184223 == 0 || -1377184223 * ((Class240) this).anInt2687 == 12)) {
				if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
					boolean[] bools_185_ = bools;
					bools[3] = false;
					bools_185_[0] = false;
					((Class240) this).anInt2687 = (1375153633 * (0 == ((Class240) this).anInt2687 * -1377184223 ? 13 : 14));
					((Class240) this).anInt2688 = 0;
				} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
					boolean[] bools_186_ = bools;
					bools[1] = false;
					bools_186_[0] = false;
					((Class240) this).anInt2687 = (1375153633 * (0 == -1377184223 * ((Class240) this).anInt2687 ? 13 : 14));
					((Class240) this).anInt2688 = 336125947;
				} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
					boolean[] bools_187_ = bools;
					bools[2] = false;
					bools_187_[1] = false;
					((Class240) this).anInt2687 = (0 == ((Class240) this).anInt2687 * -1377184223 ? 13 : 14) * 1375153633;
					((Class240) this).anInt2688 = 1655739730;
				} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
					boolean[] bools_188_ = bools;
					bools[3] = false;
					bools_188_[2] = false;
					((Class240) this).anInt2687 = (-1377184223 * ((Class240) this).anInt2687 == 0 ? 13 : 14) * 1375153633;
					((Class240) this).anInt2688 = -1319613783;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.z(").append(')').toString());
		}
	}

	void method2224(Class373 class373, Class443 class443, byte i) {
		try {
			if (((Class240) this).aBoolean2696) {
				((Class240) this).anIntArray2700 = (anIntArrayArray2638[-1377184223 * ((Class240) this).anInt2687]);
				((Class240) this).anIntArray2623 = (anIntArrayArray2690[-1377184223 * ((Class240) this).anInt2687]);
				((Class240) this).anIntArray2702 = (anIntArrayArray2634[((Class240) this).anInt2687 * -1377184223]);
				((Class240) this).anInt2699 = (class373 != null ? (anIntArray2691[((Class240) this).anInt2687 * -1377184223]) : 0) * -786924081;
				((Class240) this).anInt2701 = 989325699 * (class443 != null ? anIntArray2658[(((Class240) this).anInt2687) * -1377184223] : 0);
			} else if (((Class240) this).aBoolean2676) {
				((Class240) this).anIntArray2700 = (anIntArrayArray2649[((Class240) this).anInt2687 * -1377184223]);
				((Class240) this).anIntArray2623 = (anIntArrayArray2678[-1377184223 * ((Class240) this).anInt2687]);
				((Class240) this).anIntArray2702 = (anIntArrayArray2679[((Class240) this).anInt2687 * -1377184223]);
				((Class240) this).anInt2699 = (-786924081 * (class373 != null ? (anIntArray2661[((Class240) this).anInt2687 * -1377184223]) : 0));
				((Class240) this).anInt2701 = (null != class443 ? (anIntArray2656[-1377184223 * ((Class240) this).anInt2687]) : 0) * 989325699;
				((Class240) this).anIntArray2618 = (anIntArrayArray2662[((Class240) this).anInt2687 * -1377184223]);
			} else {
				((Class240) this).anIntArray2700 = (anIntArrayArray2672[((Class240) this).anInt2687 * -1377184223]);
				((Class240) this).anIntArray2623 = (anIntArrayArray2673[((Class240) this).anInt2687 * -1377184223]);
				((Class240) this).anIntArray2702 = (anIntArrayArray2674[-1377184223 * ((Class240) this).anInt2687]);
				((Class240) this).anInt2699 = (-786924081 * (class373 != null ? (anIntArray2659[-1377184223 * ((Class240) this).anInt2687]) : 0));
				((Class240) this).anInt2701 = 989325699 * (class443 != null ? anIntArray2660[(((Class240) this).anInt2687) * -1377184223] : 0);
				((Class240) this).anIntArray2618 = (anIntArrayArray2671[-1377184223 * ((Class240) this).anInt2687]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.y(").append(')').toString());
		}
	}

	void method2225(GraphicsToolkit class_ra, int i, int i_189_, int i_190_, Class373 class373, boolean[] bools, int[] is, int[] is_191_, int[] is_192_, int[] is_193_, int[] is_194_, int[] is_195_, int[] is_196_, int[] is_197_, Class_xa class_xa, Class_xa class_xa_198_, Class_xa class_xa_199_, byte i_200_) {
		try {
			((Class240) this).anInt2693 = -1010428415;
			((Class240) this).anInt2703 = 365069805;
			((Class240) this).anInt2692 = 1240828160;
			if (class373 != null) {
				((Class240) this).anInt2693 = class373.anInt4056 * 269878349;
				((Class240) this).anInt2703 = -610197047 * class373.anInt4057;
				((Class240) this).anInt2692 = class373.anInt4060 * -1360069077;
				int i_201_ = Class82_Sub9.method901(class_ra, class373, (byte) 16);
				for (int i_202_ = 0; i_202_ < ((Class240) this).anInt2699 * 1500080431; i_202_++) {
					boolean bool = false;
					int i_203_;
					if ((bools[0 - ((Class240) this).anInt2688 * -875169383 & 0x3]) && (((Class240) this).anIntArray2618[0] == -740850409 * ((Class240) this).anInt2689)) {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[1] = 1;
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[3] = 1;
						((Class240) this).anIntArray2680[4] = (((Class240) this).anIntArray2623[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[5] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						i_203_ = 6;
					} else if (bools[2 - (-875169383 * ((Class240) this).anInt2688) & 0x3] && (-740850409 * ((Class240) this).anInt2689 == ((Class240) this).anIntArray2618[2])) {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[1] = 5;
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[3] = 5;
						((Class240) this).anIntArray2680[4] = (((Class240) this).anIntArray2623[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[5] = (((Class240) this).anIntArray2702[((Class240) this).anInt2689 * -740850409]);
						i_203_ = 6;
					} else if (bools[1 - (-875169383 * ((Class240) this).anInt2688) & 0x3] && (((Class240) this).anIntArray2618[1] == (((Class240) this).anInt2689 * -740850409))) {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[1] = 3;
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[3] = 3;
						((Class240) this).anIntArray2680[4] = (((Class240) this).anIntArray2623[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[5] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						i_203_ = 6;
					} else if (bools[3 - (((Class240) this).anInt2688 * -875169383) & 0x3] && (-740850409 * ((Class240) this).anInt2689 == ((Class240) this).anIntArray2618[3])) {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[1] = 7;
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[3] = 7;
						((Class240) this).anIntArray2680[4] = (((Class240) this).anIntArray2623[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[5] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						i_203_ = 6;
					} else {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[1] = (((Class240) this).anIntArray2623[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						i_203_ = 3;
					}
					for (int i_204_ = 0; i_204_ < i_203_; i_204_++) {
						int i_205_ = ((Class240) this).anIntArray2680[i_204_];
						int i_206_ = (i_205_ - (-1750338766 * ((Class240) this).anInt2688) & 0x7);
						int i_207_ = anIntArray2663[i_205_];
						int i_208_ = anIntArray2664[i_205_];
						int i_209_;
						int i_210_;
						if (1 == ((Class240) this).anInt2688 * -875169383) {
							i_209_ = i_208_;
							i_210_ = 512 - i_207_;
						} else if (((Class240) this).anInt2688 * -875169383 == 2) {
							i_209_ = 512 - i_207_;
							i_210_ = 512 - i_208_;
						} else if (3 == (((Class240) this).anInt2688 * -875169383)) {
							i_209_ = 512 - i_208_;
							i_210_ = i_207_;
						} else {
							i_209_ = i_207_;
							i_210_ = i_208_;
						}
						is_191_[-1679056507 * ((Class240) this).anInt2685] = i_209_;
						is_192_[-1679056507 * ((Class240) this).anInt2685] = i_210_;
						if (is_196_ != null && (aBooleanArrayArray2665[((Class240) this).anInt2687 * -1377184223][i_205_])) {
							int i_211_ = (i_189_ << 9) + i_209_;
							int i_212_ = (i_190_ << 9) + i_210_;
							is_196_[((Class240) this).anInt2685 * -1679056507] = (class_xa_198_.method6340(i_211_, i_212_, -2146471706) - class_xa.method6340(i_211_, i_212_, -1684141409));
						}
						if (null != is_197_) {
							if (class_xa_198_ != null && !(aBooleanArrayArray2665[(((Class240) this).anInt2687 * -1377184223)][i_205_])) {
								int i_213_ = (i_189_ << 9) + i_209_;
								int i_214_ = (i_190_ << 9) + i_210_;
								is_197_[(-1679056507 * ((Class240) this).anInt2685)] = (class_xa.method6340(i_213_, i_214_, -1369260401) - (class_xa_198_.method6340(i_213_, i_214_, -1894367139)));
							} else if (class_xa_199_ != null && !(aBooleanArrayArray2666[(-1377184223 * ((Class240) this).anInt2687)][i_205_])) {
								int i_215_ = (i_189_ << 9) + i_209_;
								int i_216_ = i_210_ + (i_190_ << 9);
								is_197_[(-1679056507 * ((Class240) this).anInt2685)] = (class_xa_199_.method6340(i_215_, i_216_, -1817561670) - class_xa.method6340(i_215_, i_216_, -1384792854));
							}
						}
						if (i_205_ < 8 && (((Class240) this).anIntArray2647[i_206_] > 2109091647 * class373.anInt4055)) {
							if (is != null)
								is[((Class240) this).anInt2685 * -1679056507] = ((Class240) this).anIntArray2682[i_206_];
							is_195_[-1679056507 * ((Class240) this).anInt2685] = ((Class240) this).anIntArray2684[i_206_];
							is_194_[-1679056507 * ((Class240) this).anInt2685] = ((Class240) this).anIntArray2683[i_206_];
							is_193_[((Class240) this).anInt2685 * -1679056507] = ((Class240) this).anIntArray2681[i_206_];
						} else {
							if (null != is)
								is[((Class240) this).anInt2685 * -1679056507] = i_201_;
							is_194_[((Class240) this).anInt2685 * -1679056507] = 324071475 * class373.anInt4057;
							is_195_[-1679056507 * ((Class240) this).anInt2685] = -1551409901 * class373.anInt4060;
							is_193_[((Class240) this).anInt2685 * -1679056507] = 1373771263 * ((Class240) this).anInt2693;
						}
						((Class240) this).anInt2685 += 107294541;
					}
					((Class240) this).anInt2689 += 844235431;
				}
				if (!aBoolean2629 && 0 == i)
					aClass331_2619.method4019(i_189_, i_190_, 1987637503 * class373.anInt4064, 1104862312 * class373.anInt4066, class373.anInt4054 * 2077360047, -986621081 * class373.anInt4067, 171987805 * class373.anInt4068, -589660893 * class373.anInt4069, (byte) -43);
				if (((Class240) this).anInt2687 * -1377184223 != 12 && -45966925 * class373.anInt4056 != -1 && class373.aBoolean4061)
					((Class240) this).aBoolean2694 = true;
			} else if (((Class240) this).aBoolean2696)
				((Class240) this).anInt2689 += 844235431 * anIntArray2691[(((Class240) this).anInt2687 * -1377184223)];
			else if (((Class240) this).aBoolean2676)
				((Class240) this).anInt2689 += 844235431 * anIntArray2661[(((Class240) this).anInt2687 * -1377184223)];
			else
				((Class240) this).anInt2689 += 844235431 * anIntArray2659[(((Class240) this).anInt2687 * -1377184223)];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.t(").append(')').toString());
		}
	}

	void method2226(GraphicsToolkit class_ra, int i, int i_217_, int i_218_, int i_219_, int i_220_, Class443 class443, int i_221_, int i_222_, int i_223_, int i_224_, boolean[] bools, int[] is, int[] is_225_, int[] is_226_, int[] is_227_, int[] is_228_, int[] is_229_, int[] is_230_, int[] is_231_, int[][] is_232_, Class_xa class_xa, Class_xa class_xa_233_, Class_xa class_xa_234_, short i_235_) {
		try {
			if (null != class443) {
				if (0 == i_222_)
					i_222_ = i_221_;
				if (i_223_ == 0)
					i_223_ = i_221_;
				if (i_224_ == 0)
					i_224_ = i_221_;
				Class443 class443_236_ = ((Class240) this).aClass451_2617.method5932(i_221_ - 1, (byte) -1);
				Class443 class443_237_ = ((Class240) this).aClass451_2617.method5932(i_222_ - 1, (byte) -1);
				Class443 class443_238_ = ((Class240) this).aClass451_2617.method5932(i_223_ - 1, (byte) -1);
				Class443 class443_239_ = ((Class240) this).aClass451_2617.method5932(i_224_ - 1, (byte) -1);
				for (int i_240_ = 0; i_240_ < ((Class240) this).anInt2701 * -299537109; i_240_++) {
					boolean bool = false;
					int i_241_;
					if ((bools[0 - -875169383 * ((Class240) this).anInt2688 & 0x3]) && (-740850409 * ((Class240) this).anInt2689 == ((Class240) this).anIntArray2618[0])) {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[1] = 1;
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[3] = 1;
						((Class240) this).anIntArray2680[4] = (((Class240) this).anIntArray2623[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[5] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						i_241_ = 6;
					} else if (bools[2 - (((Class240) this).anInt2688 * -875169383) & 0x3] && (-740850409 * ((Class240) this).anInt2689 == ((Class240) this).anIntArray2618[2])) {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[1] = 5;
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[3] = 5;
						((Class240) this).anIntArray2680[4] = (((Class240) this).anIntArray2623[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[5] = (((Class240) this).anIntArray2702[((Class240) this).anInt2689 * -740850409]);
						i_241_ = 6;
					} else if (bools[1 - (-875169383 * ((Class240) this).anInt2688) & 0x3] && (-740850409 * ((Class240) this).anInt2689 == ((Class240) this).anIntArray2618[1])) {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[1] = 3;
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[3] = 3;
						((Class240) this).anIntArray2680[4] = (((Class240) this).anIntArray2623[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[5] = (((Class240) this).anIntArray2702[((Class240) this).anInt2689 * -740850409]);
						i_241_ = 6;
					} else if (bools[3 - (((Class240) this).anInt2688 * -875169383) & 0x3] && (((Class240) this).anIntArray2618[3] == (((Class240) this).anInt2689 * -740850409))) {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[1] = 7;
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[3] = 7;
						((Class240) this).anIntArray2680[4] = (((Class240) this).anIntArray2623[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[5] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						i_241_ = 6;
					} else {
						((Class240) this).anIntArray2680[0] = (((Class240) this).anIntArray2700[-740850409 * ((Class240) this).anInt2689]);
						((Class240) this).anIntArray2680[1] = (((Class240) this).anIntArray2623[((Class240) this).anInt2689 * -740850409]);
						((Class240) this).anIntArray2680[2] = (((Class240) this).anIntArray2702[-740850409 * ((Class240) this).anInt2689]);
						i_241_ = 3;
					}
					for (int i_242_ = 0; i_242_ < i_241_; i_242_++) {
						int i_243_ = ((Class240) this).anIntArray2680[i_242_];
						int i_244_ = (i_243_ - (((Class240) this).anInt2688 * -1750338766) & 0x7);
						int i_245_ = anIntArray2663[i_243_];
						int i_246_ = anIntArray2664[i_243_];
						int i_247_;
						int i_248_;
						if (-875169383 * ((Class240) this).anInt2688 == 1) {
							i_247_ = i_246_;
							i_248_ = 512 - i_245_;
						} else if (2 == (((Class240) this).anInt2688 * -875169383)) {
							i_247_ = 512 - i_245_;
							i_248_ = 512 - i_246_;
						} else if (3 == (((Class240) this).anInt2688 * -875169383)) {
							i_247_ = 512 - i_246_;
							i_248_ = i_245_;
						} else {
							i_247_ = i_245_;
							i_248_ = i_246_;
						}
						is_225_[((Class240) this).anInt2685 * -1679056507] = i_247_;
						is_226_[-1679056507 * ((Class240) this).anInt2685] = i_248_;
						if (null != is_230_ && (aBooleanArrayArray2665[((Class240) this).anInt2687 * -1377184223][i_243_])) {
							int i_249_ = (i_217_ << 9) + i_247_;
							int i_250_ = (i_218_ << 9) + i_248_;
							is_230_[((Class240) this).anInt2685 * -1679056507] = (class_xa_233_.method6340(i_249_, i_250_, -1800590512) - class_xa.method6340(i_249_, i_250_, -1832971430));
						}
						if (is_231_ != null) {
							if (null != class_xa_233_ && !(aBooleanArrayArray2665[(((Class240) this).anInt2687 * -1377184223)][i_243_])) {
								int i_251_ = (i_217_ << 9) + i_247_;
								int i_252_ = (i_218_ << 9) + i_248_;
								is_231_[(-1679056507 * ((Class240) this).anInt2685)] = (class_xa.method6340(i_251_, i_252_, -1905933409) - (class_xa_233_.method6340(i_251_, i_252_, -2129052823)));
							} else if (null != class_xa_234_ && !(aBooleanArrayArray2666[(-1377184223 * ((Class240) this).anInt2687)][i_243_])) {
								int i_253_ = i_247_ + (i_217_ << 9);
								int i_254_ = i_248_ + (i_218_ << 9);
								is_231_[(((Class240) this).anInt2685 * -1679056507)] = (class_xa_234_.method6340(i_253_, i_254_, -1961049561) - class_xa.method6340(i_253_, i_254_, -1669884522));
							}
						}
						if (i_243_ < 8 && ((Class240) this).anIntArray2647[i_244_] >= 0) {
							if (null != is)
								is[-1679056507 * ((Class240) this).anInt2685] = ((Class240) this).anIntArray2682[i_244_];
							is_229_[((Class240) this).anInt2685 * -1679056507] = ((Class240) this).anIntArray2684[i_244_];
							is_228_[-1679056507 * ((Class240) this).anInt2685] = ((Class240) this).anIntArray2683[i_244_];
							is_227_[((Class240) this).anInt2685 * -1679056507] = ((Class240) this).anIntArray2681[i_244_];
						} else {
							if (((Class240) this).aBoolean2676 && (aBooleanArrayArray2665[((Class240) this).anInt2687 * -1377184223][i_243_])) {
								is_228_[(-1679056507 * ((Class240) this).anInt2685)] = 1659854875 * ((Class240) this).anInt2703;
								is_229_[(((Class240) this).anInt2685 * -1679056507)] = (-2108878663 * ((Class240) this).anInt2692);
								is_227_[(((Class240) this).anInt2685 * -1679056507)] = ((Class240) this).anInt2693 * 1373771263;
							} else if (0 == i_247_ && i_248_ == 0) {
								is_227_[(((Class240) this).anInt2685 * -1679056507)] = is_232_[i_217_][i_218_];
								is_228_[(-1679056507 * ((Class240) this).anInt2685)] = class443_236_.anInt5594 * 2012295231;
								is_229_[(-1679056507 * ((Class240) this).anInt2685)] = class443_236_.anInt5597 * -1106852061;
							} else if (0 == i_247_ && i_248_ == 512) {
								is_227_[(((Class240) this).anInt2685 * -1679056507)] = is_232_[i_217_][i_220_];
								is_228_[(((Class240) this).anInt2685 * -1679056507)] = 2012295231 * class443_237_.anInt5594;
								is_229_[(((Class240) this).anInt2685 * -1679056507)] = -1106852061 * class443_237_.anInt5597;
							} else if (i_247_ == 512 && 512 == i_248_) {
								is_227_[(((Class240) this).anInt2685 * -1679056507)] = is_232_[i_219_][i_220_];
								is_228_[(((Class240) this).anInt2685 * -1679056507)] = class443_238_.anInt5594 * 2012295231;
								is_229_[(-1679056507 * ((Class240) this).anInt2685)] = class443_238_.anInt5597 * -1106852061;
							} else if (512 == i_247_ && 0 == i_248_) {
								is_227_[(-1679056507 * ((Class240) this).anInt2685)] = is_232_[i_219_][i_218_];
								is_228_[(-1679056507 * ((Class240) this).anInt2685)] = 2012295231 * class443_239_.anInt5594;
								is_229_[(((Class240) this).anInt2685 * -1679056507)] = class443_239_.anInt5597 * -1106852061;
							} else {
								if (i_247_ < 256) {
									if (i_248_ < 256) {
										is_228_[-1679056507 * ((Class240) this).anInt2685] = (class443_236_.anInt5594 * 2012295231);
										is_229_[-1679056507 * ((Class240) this).anInt2685] = (class443_236_.anInt5597 * -1106852061);
									} else {
										is_228_[(((Class240) this).anInt2685 * -1679056507)] = (2012295231 * class443_237_.anInt5594);
										is_229_[(((Class240) this).anInt2685 * -1679056507)] = (class443_237_.anInt5597 * -1106852061);
									}
								} else if (i_248_ < 256) {
									is_228_[(((Class240) this).anInt2685 * -1679056507)] = class443_239_.anInt5594 * 2012295231;
									is_229_[(-1679056507 * ((Class240) this).anInt2685)] = (class443_239_.anInt5597 * -1106852061);
								} else {
									is_228_[(((Class240) this).anInt2685 * -1679056507)] = class443_238_.anInt5594 * 2012295231;
									is_229_[(-1679056507 * ((Class240) this).anInt2685)] = (class443_238_.anInt5597 * -1106852061);
								}
								int i_255_ = Class98_Sub4.method1069((is_232_[i_217_][i_218_]), (is_232_[i_219_][i_218_]), i_247_ << 7 >> 9, -1452826652);
								int i_256_ = Class98_Sub4.method1069((is_232_[i_217_][i_220_]), (is_232_[i_219_][i_220_]), i_247_ << 7 >> 9, -1452826652);
								is_227_[(-1679056507 * ((Class240) this).anInt2685)] = Class98_Sub4.method1069(i_255_, i_256_, i_248_ << 7 >> 9, -1452826652);
							}
							if (is != null)
								is[-1679056507 * ((Class240) this).anInt2685] = is_227_[(-1679056507 * ((Class240) this).anInt2685)];
						}
						((Class240) this).anInt2685 += 107294541;
					}
					((Class240) this).anInt2689 += 844235431;
				}
				if (-1377184223 * ((Class240) this).anInt2687 != 0 && class443.aBoolean5599)
					((Class240) this).aBoolean2694 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.h(").append(')').toString());
		}
	}

	final void method2227(GraphicsToolkit class_ra, Class373 class373, Class443 class443, int i, int i_257_, int i_258_, int i_259_, byte[][] is, byte[][] is_260_, byte[][] is_261_, boolean[] bools, int i_262_) {
		try {
			boolean[] bools_263_ = (null != class373 && class373.aBoolean4063 ? (aBooleanArrayArray2675[-1377184223 * ((Class240) this).anInt2687]) : (aBooleanArrayArray2695[-1377184223 * ((Class240) this).anInt2687]));
			if (i_257_ > 0) {
				if (i > 0) {
					int i_264_ = is[i - 1][i_257_ - 1] & 0xff;
					if (i_264_ > 0) {
						Class373 class373_265_ = ((Class240) this).aClass375_2651.method4645(i_264_ - 1, -165601895);
						if (-1 != -45966925 * class373_265_.anInt4056 && class373_265_.aBoolean4063) {
							byte i_266_ = is_260_[i - 1][i_257_ - 1];
							int i_267_ = 2 * is_261_[i - 1][i_257_ - 1] + 4 & 0x7;
							int i_268_ = Class82_Sub9.method901(class_ra, class373_265_, (byte) 16);
							if (aBooleanArrayArray2665[i_266_][i_267_]) {
								((Class240) this).anIntArray2681[0] = class373_265_.anInt4056 * -45966925;
								((Class240) this).anIntArray2682[0] = i_268_;
								((Class240) this).anIntArray2683[0] = class373_265_.anInt4057 * 324071475;
								((Class240) this).anIntArray2684[0] = -1551409901 * class373_265_.anInt4060;
								((Class240) this).anIntArray2647[0] = 2109091647 * class373_265_.anInt4055;
								((Class240) this).anIntArray2686[0] = 256;
							}
						}
					}
				}
				if (i < i_258_ - 1) {
					int i_269_ = is[1 + i][i_257_ - 1] & 0xff;
					if (i_269_ > 0) {
						Class373 class373_270_ = ((Class240) this).aClass375_2651.method4645(i_269_ - 1, -165601895);
						if (-1 != class373_270_.anInt4056 * -45966925 && class373_270_.aBoolean4063) {
							byte i_271_ = is_260_[1 + i][i_257_ - 1];
							int i_272_ = 6 + is_261_[i + 1][i_257_ - 1] * 2 & 0x7;
							int i_273_ = Class82_Sub9.method901(class_ra, class373_270_, (byte) 16);
							if (aBooleanArrayArray2665[i_271_][i_272_]) {
								((Class240) this).anIntArray2681[2] = class373_270_.anInt4056 * -45966925;
								((Class240) this).anIntArray2682[2] = i_273_;
								((Class240) this).anIntArray2683[2] = class373_270_.anInt4057 * 324071475;
								((Class240) this).anIntArray2684[2] = class373_270_.anInt4060 * -1551409901;
								((Class240) this).anIntArray2647[2] = class373_270_.anInt4055 * 2109091647;
								((Class240) this).anIntArray2686[2] = 512;
							}
						}
					}
				}
			}
			if (i_257_ < i_259_ - 1) {
				if (i > 0) {
					int i_274_ = is[i - 1][i_257_ + 1] & 0xff;
					if (i_274_ > 0) {
						Class373 class373_275_ = ((Class240) this).aClass375_2651.method4645(i_274_ - 1, -165601895);
						if (class373_275_.anInt4056 * -45966925 != -1 && class373_275_.aBoolean4063) {
							byte i_276_ = is_260_[i - 1][i_257_ + 1];
							int i_277_ = 2 + is_261_[i - 1][1 + i_257_] * 2 & 0x7;
							int i_278_ = Class82_Sub9.method901(class_ra, class373_275_, (byte) 16);
							if (aBooleanArrayArray2665[i_276_][i_277_]) {
								((Class240) this).anIntArray2681[6] = -45966925 * class373_275_.anInt4056;
								((Class240) this).anIntArray2682[6] = i_278_;
								((Class240) this).anIntArray2683[6] = class373_275_.anInt4057 * 324071475;
								((Class240) this).anIntArray2684[6] = -1551409901 * class373_275_.anInt4060;
								((Class240) this).anIntArray2647[6] = 2109091647 * class373_275_.anInt4055;
								((Class240) this).anIntArray2686[6] = 64;
							}
						}
					}
				}
				if (i < i_258_ - 1) {
					int i_279_ = is[i + 1][i_257_ + 1] & 0xff;
					if (i_279_ > 0) {
						Class373 class373_280_ = ((Class240) this).aClass375_2651.method4645(i_279_ - 1, -165601895);
						if (class373_280_.anInt4056 * -45966925 != -1 && class373_280_.aBoolean4063) {
							byte i_281_ = is_260_[1 + i][i_257_ + 1];
							int i_282_ = 0 + is_261_[1 + i][i_257_ + 1] * 2 & 0x7;
							int i_283_ = Class82_Sub9.method901(class_ra, class373_280_, (byte) 16);
							if (aBooleanArrayArray2665[i_281_][i_282_]) {
								((Class240) this).anIntArray2681[4] = -45966925 * class373_280_.anInt4056;
								((Class240) this).anIntArray2682[4] = i_283_;
								((Class240) this).anIntArray2683[4] = 324071475 * class373_280_.anInt4057;
								((Class240) this).anIntArray2684[4] = class373_280_.anInt4060 * -1551409901;
								((Class240) this).anIntArray2647[4] = 2109091647 * class373_280_.anInt4055;
								((Class240) this).anIntArray2686[4] = 128;
							}
						}
					}
				}
			}
			if (i_257_ > 0) {
				int i_284_ = is[i][i_257_ - 1] & 0xff;
				if (i_284_ > 0) {
					Class373 class373_285_ = ((Class240) this).aClass375_2651.method4645(i_284_ - 1, -165601895);
					if (-1 != class373_285_.anInt4056 * -45966925) {
						byte i_286_ = is_260_[i][i_257_ - 1];
						int i_287_ = is_261_[i][i_257_ - 1];
						if (class373_285_.aBoolean4063) {
							int i_288_ = 2;
							int i_289_ = 4 + i_287_ * 2;
							int i_290_ = Class82_Sub9.method901(class_ra, class373_285_, (byte) 16);
							for (int i_291_ = 0; i_291_ < 3; i_291_++) {
								i_289_ &= 0x7;
								i_288_ &= 0x7;
								if (aBooleanArrayArray2665[i_286_][i_289_] && ((((Class240) this).anIntArray2647[i_288_]) <= (2109091647 * class373_285_.anInt4055))) {
									((Class240) this).anIntArray2681[i_288_] = -45966925 * class373_285_.anInt4056;
									((Class240) this).anIntArray2682[i_288_] = i_290_;
									((Class240) this).anIntArray2683[i_288_] = class373_285_.anInt4057 * 324071475;
									((Class240) this).anIntArray2684[i_288_] = (-1551409901 * class373_285_.anInt4060);
									if ((((Class240) this).anIntArray2647[i_288_]) == (class373_285_.anInt4055 * 2109091647))
										((Class240) this).anIntArray2686[i_288_] |= 0x20;
									else
										((Class240) this).anIntArray2686[i_288_] = 32;
									((Class240) this).anIntArray2647[i_288_] = 2109091647 * class373_285_.anInt4055;
								}
								i_289_++;
								i_288_--;
							}
							if (!bools_263_[(((Class240) this).anInt2688 * -875169383 + 0 & 0x3)])
								bools[0] = (aBooleanArrayArray2675[i_286_][i_287_ + 2 & 0x3]);
						} else if (!bools_263_[(((Class240) this).anInt2688 * -875169383) + 0 & 0x3])
							bools[0] = (aBooleanArrayArray2695[i_286_][2 + i_287_ & 0x3]);
					}
				}
			}
			if (i_257_ < i_259_ - 1) {
				int i_292_ = is[i][i_257_ + 1] & 0xff;
				if (i_292_ > 0) {
					Class373 class373_293_ = ((Class240) this).aClass375_2651.method4645(i_292_ - 1, -165601895);
					if (class373_293_.anInt4056 * -45966925 != -1) {
						byte i_294_ = is_260_[i][1 + i_257_];
						int i_295_ = is_261_[i][1 + i_257_];
						if (class373_293_.aBoolean4063) {
							int i_296_ = 4;
							int i_297_ = 2 * i_295_ + 2;
							int i_298_ = Class82_Sub9.method901(class_ra, class373_293_, (byte) 16);
							for (int i_299_ = 0; i_299_ < 3; i_299_++) {
								i_297_ &= 0x7;
								i_296_ &= 0x7;
								if (aBooleanArrayArray2665[i_294_][i_297_] && ((((Class240) this).anIntArray2647[i_296_]) <= (2109091647 * class373_293_.anInt4055))) {
									((Class240) this).anIntArray2681[i_296_] = class373_293_.anInt4056 * -45966925;
									((Class240) this).anIntArray2682[i_296_] = i_298_;
									((Class240) this).anIntArray2683[i_296_] = class373_293_.anInt4057 * 324071475;
									((Class240) this).anIntArray2684[i_296_] = (class373_293_.anInt4060 * -1551409901);
									if (2109091647 * class373_293_.anInt4055 == (((Class240) this).anIntArray2647[i_296_]))
										((Class240) this).anIntArray2686[i_296_] |= 0x10;
									else
										((Class240) this).anIntArray2686[i_296_] = 16;
									((Class240) this).anIntArray2647[i_296_] = class373_293_.anInt4055 * 2109091647;
								}
								i_297_--;
								i_296_++;
							}
							if (!bools_263_[(-875169383 * ((Class240) this).anInt2688 + 2 & 0x3)])
								bools[2] = (aBooleanArrayArray2675[i_294_][0 + i_295_ & 0x3]);
						} else if (!bools_263_[2 + (((Class240) this).anInt2688 * -875169383) & 0x3])
							bools[2] = (aBooleanArrayArray2695[i_294_][0 + i_295_ & 0x3]);
					}
				}
			}
			if (i > 0) {
				int i_300_ = is[i - 1][i_257_] & 0xff;
				if (i_300_ > 0) {
					Class373 class373_301_ = ((Class240) this).aClass375_2651.method4645(i_300_ - 1, -165601895);
					if (-1 != -45966925 * class373_301_.anInt4056) {
						byte i_302_ = is_260_[i - 1][i_257_];
						int i_303_ = is_261_[i - 1][i_257_];
						if (class373_301_.aBoolean4063) {
							int i_304_ = 6;
							int i_305_ = 2 * i_303_ + 4;
							int i_306_ = Class82_Sub9.method901(class_ra, class373_301_, (byte) 16);
							for (int i_307_ = 0; i_307_ < 3; i_307_++) {
								i_305_ &= 0x7;
								i_304_ &= 0x7;
								if (aBooleanArrayArray2665[i_302_][i_305_] && ((((Class240) this).anIntArray2647[i_304_]) <= (2109091647 * class373_301_.anInt4055))) {
									((Class240) this).anIntArray2681[i_304_] = class373_301_.anInt4056 * -45966925;
									((Class240) this).anIntArray2682[i_304_] = i_306_;
									((Class240) this).anIntArray2683[i_304_] = 324071475 * class373_301_.anInt4057;
									((Class240) this).anIntArray2684[i_304_] = (class373_301_.anInt4060 * -1551409901);
									if ((((Class240) this).anIntArray2647[i_304_]) == (class373_301_.anInt4055 * 2109091647))
										((Class240) this).anIntArray2686[i_304_] |= 0x8;
									else
										((Class240) this).anIntArray2686[i_304_] = 8;
									((Class240) this).anIntArray2647[i_304_] = class373_301_.anInt4055 * 2109091647;
								}
								i_305_--;
								i_304_++;
							}
							if (!bools_263_[(-875169383 * ((Class240) this).anInt2688 + 3 & 0x3)])
								bools[3] = (aBooleanArrayArray2675[i_302_][i_303_ + 1 & 0x3]);
						} else if (!bools_263_[(((Class240) this).anInt2688 * -875169383) + 3 & 0x3])
							bools[3] = (aBooleanArrayArray2695[i_302_][1 + i_303_ & 0x3]);
					}
				}
			}
			if (i < i_258_ - 1) {
				int i_308_ = is[1 + i][i_257_] & 0xff;
				if (i_308_ > 0) {
					Class373 class373_309_ = ((Class240) this).aClass375_2651.method4645(i_308_ - 1, -165601895);
					if (-1 != class373_309_.anInt4056 * -45966925) {
						byte i_310_ = is_260_[i + 1][i_257_];
						int i_311_ = is_261_[i + 1][i_257_];
						if (class373_309_.aBoolean4063) {
							int i_312_ = 4;
							int i_313_ = 6 + 2 * i_311_;
							int i_314_ = Class82_Sub9.method901(class_ra, class373_309_, (byte) 16);
							for (int i_315_ = 0; i_315_ < 3; i_315_++) {
								i_313_ &= 0x7;
								i_312_ &= 0x7;
								if (aBooleanArrayArray2665[i_310_][i_313_] && ((((Class240) this).anIntArray2647[i_312_]) <= (class373_309_.anInt4055 * 2109091647))) {
									((Class240) this).anIntArray2681[i_312_] = -45966925 * class373_309_.anInt4056;
									((Class240) this).anIntArray2682[i_312_] = i_314_;
									((Class240) this).anIntArray2683[i_312_] = 324071475 * class373_309_.anInt4057;
									((Class240) this).anIntArray2684[i_312_] = (class373_309_.anInt4060 * -1551409901);
									if ((((Class240) this).anIntArray2647[i_312_]) == (class373_309_.anInt4055 * 2109091647))
										((Class240) this).anIntArray2686[i_312_] |= 0x4;
									else
										((Class240) this).anIntArray2686[i_312_] = 4;
									((Class240) this).anIntArray2647[i_312_] = 2109091647 * class373_309_.anInt4055;
								}
								i_313_++;
								i_312_--;
							}
							if (!bools_263_[(-875169383 * ((Class240) this).anInt2688 + 1 & 0x3)])
								bools[1] = (aBooleanArrayArray2675[i_310_][i_311_ + 3 & 0x3]);
						} else if (!bools_263_[1 + (((Class240) this).anInt2688 * -875169383) & 0x3])
							bools[1] = (aBooleanArrayArray2695[i_310_][3 + i_311_ & 0x3]);
					}
				}
			}
			if (null != class373 && class373.aBoolean4063) {
				int i_316_ = Class82_Sub9.method901(class_ra, class373, (byte) 16);
				for (int i_317_ = 0; i_317_ < 8; i_317_++) {
					int i_318_ = (i_317_ - -1750338766 * ((Class240) this).anInt2688 & 0x7);
					if ((aBooleanArrayArray2665[-1377184223 * ((Class240) this).anInt2687][i_317_]) && (((Class240) this).anIntArray2647[i_318_] <= class373.anInt4055 * 2109091647)) {
						((Class240) this).anIntArray2681[i_318_] = -45966925 * class373.anInt4056;
						((Class240) this).anIntArray2682[i_318_] = i_316_;
						((Class240) this).anIntArray2683[i_318_] = 324071475 * class373.anInt4057;
						((Class240) this).anIntArray2684[i_318_] = class373.anInt4060 * -1551409901;
						if (2109091647 * class373.anInt4055 == ((Class240) this).anIntArray2647[i_318_])
							((Class240) this).anIntArray2686[i_318_] |= 0x2;
						else
							((Class240) this).anIntArray2686[i_318_] = 2;
						((Class240) this).anIntArray2647[i_318_] = class373.anInt4055 * 2109091647;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.g(").append(')').toString());
		}
	}

	static {
		anIntArray2658 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
		anIntArray2659 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray2660 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray2661 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray2656 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray2663 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray2664 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBooleanArrayArray2665 = (new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false },
				{ true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } });
		aBooleanArrayArray2666 = (new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false },
				{ true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false },
				{ true, true, true, true, true, true, true, true, true, true, true, true, true } });
		anIntArrayArray2638 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray2690 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray2634 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBooleanArrayArray2695 = (new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } });
		anIntArrayArray2671 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray2672 = (new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
		anIntArrayArray2673 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray2674 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBooleanArrayArray2675 = (new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } });
		anIntArrayArray2662 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray2649 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray2678 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray2679 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}

	final void method2228(RsByteBuffer class298_sub53, int i, int i_319_, int i_320_, int i_321_, int i_322_, int i_323_, int i_324_, int i_325_, boolean bool, int i_326_) {
		try {
			if (i_325_ == 1)
				i_322_ = 1;
			else if (2 == i_325_) {
				i_321_ = 1;
				i_322_ = 1;
			} else if (3 == i_325_)
				i_321_ = 1;
			if (i_319_ >= 0 && i_319_ < -954368823 * anInt2627 && i_320_ >= 0 && i_320_ < 181474463 * anInt2628) {
				if (!aBoolean2629 && !bool)
					aClass244_2635.aByteArrayArrayArray2731[i][i_319_][i_320_] = (byte) 0;
				for (;;) {
					int i_327_ = class298_sub53.readUnsignedByte();
					if (0 == i_327_) {
						if (aBoolean2629)
							anIntArrayArrayArray2653[0][i_319_ + i_321_][i_320_ + i_322_] = 0;
						else if (0 == i)
							anIntArrayArrayArray2653[0][i_321_ + i_319_][i_322_ + i_320_] = -Class412.method5581(i_323_ + 932731, i_324_ + 556238, (byte) -40) * 8 << 2;
						else
							anIntArrayArrayArray2653[i][i_321_ + i_319_][i_320_ + i_322_] = (anIntArrayArrayArray2653[i - 1][i_321_ + i_319_][i_320_ + i_322_]) - 960;
						break;
					}
					if (1 == i_327_) {
						int i_328_ = class298_sub53.readUnsignedByte();
						if (!aBoolean2629) {
							if (i_328_ == 1)
								i_328_ = 0;
							if (0 == i)
								anIntArrayArrayArray2653[0][i_321_ + i_319_][i_322_ + i_320_] = -i_328_ * 8 << 2;
							else
								anIntArrayArrayArray2653[i][i_321_ + i_319_][i_322_ + i_320_] = ((anIntArrayArrayArray2653[i - 1][i_321_ + i_319_][i_322_ + i_320_]) - (i_328_ * 8 << 2));
						} else
							anIntArrayArrayArray2653[0][i_321_ + i_319_][i_320_ + i_322_] = 8 * i_328_ << 2;
						break;
					}
					if (i_327_ <= 49) {
						if (bool)
							class298_sub53.readUnsignedByte();
						else {
							((Class240) this).aByteArrayArrayArray2636[i][i_319_][i_320_] = class298_sub53.readByte(-12558881);
							((Class240) this).aByteArrayArrayArray2698[i][i_319_][i_320_] = (byte) ((i_327_ - 2) / 4);
							((Class240) this).aByteArrayArrayArray2668[i][i_319_][i_320_] = (byte) (i_327_ - 2 + i_325_ & 0x3);
						}
					} else if (i_327_ <= 81) {
						if (!aBoolean2629 && !bool)
							aClass244_2635.aByteArrayArrayArray2731[i][i_319_][i_320_] = (byte) (i_327_ - 49);
					} else if (bool) {
						if (i_326_ != -2042161970) {
							/* empty */
						}
					} else
						((Class240) this).aByteArrayArrayArray2670[i][i_319_][i_320_] = (byte) (i_327_ - 81);
				}
			} else {
				for (;;) {
					int i_329_ = class298_sub53.readUnsignedByte();
					if (i_329_ == 0) {
						if (i_326_ != -2042161970) {
							/* empty */
						}
						break;
					}
					if (i_329_ == 1) {
						class298_sub53.readUnsignedByte();
						break;
					}
					if (i_329_ <= 49)
						class298_sub53.readUnsignedByte();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.d(").append(')').toString());
		}
	}

	void method2229(Class_xa class_xa, Class443 class443, Class373 class373, int i, int i_330_, int i_331_, int i_332_, int i_333_, int i_334_, int i_335_, int i_336_) {
		try {
			int i_337_ = class_xa.method6341(i_330_, i_331_, (byte) -41);
			int i_338_ = class_xa.method6341(i_332_, i_331_, (byte) -89);
			int i_339_ = class_xa.method6341(i_332_, i_333_, (byte) -120);
			int i_340_ = class_xa.method6341(i_330_, i_333_, (byte) -113);
			boolean bool = aClass244_2635.method2320(i_330_, i_331_, 1693212331);
			if (bool && i > 1 || !bool && i > 0) {
				boolean bool_341_ = true;
				if (class443 != null && !class443.aBoolean5596)
					bool_341_ = false;
				else if (0 == i_334_ && 0 != -1377184223 * ((Class240) this).anInt2687)
					bool_341_ = false;
				else if (i_335_ > 0 && null != class373 && !class373.aBoolean4062)
					bool_341_ = false;
				if (bool_341_ && i_338_ == i_337_ && i_337_ == i_339_ && i_337_ == i_340_)
					aByteArrayArrayArray2637[i][i_330_][i_331_] |= 0x4;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.v(").append(')').toString());
		}
	}

	Class240(Class331 class331, int i, int i_342_, int i_343_, boolean bool, Class375 class375, Class451 class451, Class244 class244) {
		aBoolean2624 = false;
		aBoolean2625 = false;
		((Class240) this).anIntArray2680 = new int[6];
		((Class240) this).anIntArray2681 = new int[13];
		((Class240) this).anIntArray2682 = new int[13];
		((Class240) this).anIntArray2683 = new int[13];
		((Class240) this).anIntArray2684 = new int[13];
		((Class240) this).anIntArray2647 = new int[13];
		((Class240) this).anIntArray2686 = new int[13];
		((Class240) this).anInt2689 = 0;
		((Class240) this).anInt2685 = 0;
		((Class240) this).anIntArray2618 = null;
		aClass331_2619 = class331;
		anInt2626 = 142248255 * i;
		anInt2627 = i_342_ * 325279097;
		anInt2628 = i_343_ * 2072446815;
		aBoolean2629 = bool;
		((Class240) this).aClass375_2651 = class375;
		((Class240) this).aClass451_2617 = class451;
		aClass244_2635 = class244;
		((Class240) this).aByteArrayArrayArray2670 = (new byte[anInt2626 * 1551623871][anInt2627 * -954368823][181474463 * anInt2628]);
		((Class240) this).aByteArrayArrayArray2636 = (new byte[1551623871 * anInt2626][-954368823 * anInt2627][181474463 * anInt2628]);
		((Class240) this).aByteArrayArrayArray2698 = (new byte[1551623871 * anInt2626][-954368823 * anInt2627][anInt2628 * 181474463]);
		((Class240) this).aByteArrayArrayArray2668 = (new byte[anInt2626 * 1551623871][-954368823 * anInt2627][181474463 * anInt2628]);
		anIntArrayArrayArray2653 = (new int[anInt2626 * 1551623871][anInt2627 * -954368823 + 1][181474463 * anInt2628 + 1]);
		aByteArrayArrayArray2637 = (new byte[1551623871 * anInt2626][1 + -954368823 * anInt2627][181474463 * anInt2628 + 1]);
	}

	static final void method2230(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.aString1230 = (String) (((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 -= 969361751) * -203050393)]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.jh(").append(')').toString());
		}
	}

	public static void method2231(Class395 class395, int i) {
		try {
			Class298_Sub2.aClass395_7165 = class395;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.a(").append(')').toString());
		}
	}

	static final void method2232(int i, int i_344_, int i_345_, int i_346_, int i_347_, int i_348_, byte i_349_) {
		try {
			int i_350_ = 1168366243 * Class10.anInt129;
			int[] is = Class10.anIntArray135;
			client.anInt8905 = 0;
			int i_351_;
			if (client.anInt8724 * 1596783995 == 0)
				i_351_ = Class87.aClass94Array794.length;
			else
				i_351_ = i_350_ + client.anInt8703 * -1230451913;
			for (int i_352_ = 0; i_352_ < i_351_; i_352_++) {
				SomethingDefinitions class503 = null;
				Entity class365_sub1_sub1_sub2;
				if (0 == 1596783995 * client.anInt8724) {
					Class94 class94 = Class87.aClass94Array794[i_352_];
					if (!class94.aBoolean912) {
						if (i_349_ == 0) {
							/* empty */
						}
						continue;
					}
					class365_sub1_sub1_sub2 = class94.method1015(-198688273);
					if (class365_sub1_sub1_sub2.anInt10066 * -1706825291 != -1953789277 * client.anInt8777) {
						if (i_349_ != 0)
							continue;
						return;
					}
					if (class94.anInt909 * 1762367763 >= 0) {
						class503 = ((NPC) class365_sub1_sub1_sub2).aClass503_10190;
						if (class503.anIntArray6188 != null) {
							class503 = class503.method6240(Class128.aClass148_6331, 1805717140);
							if (class503 == null) {
								if (i_349_ != 0)
									continue;
								return;
							}
						}
					}
				} else {
					if (i_352_ < i_350_)
						class365_sub1_sub1_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_352_]]);
					else {
						class365_sub1_sub1_sub2 = ((Entity) ((Class298_Sub29) (client.npcs.get((long) client.anIntArray8699[i_352_ - i_350_]))).anObject7366);
						class503 = ((NPC) class365_sub1_sub1_sub2).aClass503_10190;
						if (null != class503.anIntArray6188) {
							class503 = class503.method6240(Class128.aClass148_6331, 1690174676);
							if (null == class503) {
								if (i_349_ == 0)
									throw new IllegalStateException();
								continue;
							}
						}
					}
					if (class365_sub1_sub1_sub2.anInt10071 * 648883167 < 0) {
						if (i_349_ == 0) {
							/* empty */
						}
						continue;
					}
					if ((-1706825291 * class365_sub1_sub1_sub2.anInt10066 != -1953789277 * client.anInt8777) && (class365_sub1_sub1_sub2.plane != (Class287.myPlayer.plane))) {
						if (i_349_ == 0) {
							/* empty */
						}
						continue;
					}
				}
				Class255.method2440(class365_sub1_sub1_sub2, class365_sub1_sub1_sub2.method4363((byte) -83), -1841539170);
				if (client.aFloatArray8891[0] < 0.0F) {
					if (i_349_ == 0) {
						/* empty */
					}
				} else {
					if (class365_sub1_sub1_sub2.method4429((byte) -114)) {
						Class62 class62 = class365_sub1_sub1_sub2.method4437(-593782084);
						if (class62 != null && (-559111197 * client.anInt8905 < 547709851 * client.anInt8644)) {
							client.anIntArray8909[(client.anInt8905 * -559111197)] = (Class82_Sub19_Sub1.aClass505_9111.method6264(class62.method721((byte) 1), -1350600471)) / 2;
							client.anIntArray8907[(-559111197 * client.anInt8905)] = (int) client.aFloatArray8891[0];
							client.anIntArray8908[(client.anInt8905 * -559111197)] = (int) client.aFloatArray8891[1];
							client.aClass62Array8657[(-559111197 * client.anInt8905)] = class62;
							client.anInt8905 += -392578613;
						}
					}
					int i_353_ = (int) (client.aFloatArray8891[1] + (float) i_344_);
					if (!class365_sub1_sub1_sub2.aBoolean10123 && (-1472450313 * class365_sub1_sub1_sub2.anInt10116 > 443738891 * client.anInt8884)) {
						int i_354_ = -1;
						int i_355_ = 1;
						if (null == class503) {
							Player class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_352_]]);
							i_354_ = (class365_sub1_sub1_sub2.method4426(379142264).anInt3738) * 2108452425;
							if (class365_sub1_sub1_sub2_sub2.aBoolean10203)
								i_355_ = 2;
						} else {
							i_354_ = -1362808149 * class503.anInt6167;
							if (-1 == i_354_)
								i_354_ = (class365_sub1_sub1_sub2.method4426(-1076416255).anInt3738) * 2108452425;
						}
						Class57[] class57s = Class160.aClass57Array1646;
						if (i_354_ != -1) {
							Class57[] class57s_356_ = (Class57[]) client.aClass348_8780.method4184((long) i_354_);
							if (null == class57s_356_) {
								Class89[] class89s = Class89.method993((Class158.aClass243_6364), i_354_, 0);
								if (class89s != null) {
									class57s_356_ = new Class57[class89s.length];
									for (int i_357_ = 0; i_357_ < class89s.length; i_357_++)
										class57s_356_[i_357_] = (Class373.aClass_ra4071.method5125(class89s[i_357_], true));
									client.aClass348_8780.method4194(class57s_356_, (long) i_354_);
								}
							}
							if (null != class57s_356_ && class57s_356_.length >= 2)
								class57s = class57s_356_;
						}
						if (i_355_ >= class57s.length)
							i_355_ = 1;
						Class57 class57 = class57s[0];
						Class57 class57_358_ = class57s[i_355_];
						i_353_ -= Math.max((Class82_Sub19_Sub1.aClass505_9111.anInt6202) * 1110385787, class57.method625());
						int i_359_ = (int) (client.aFloatArray8891[0] + (float) i - (float) (class57.method623() >> 1));
						int i_360_ = (class57.method623() * (class365_sub1_sub1_sub2.anInt10063 * -766383861) / 255);
						int i_361_ = class57.method625();
						if (-766383861 * class365_sub1_sub1_sub2.anInt10063 > 0 && i_360_ < 2)
							i_360_ = 2;
						class57.method645(i_359_, i_353_);
						Class373.aClass_ra4071.o(i_359_, i_353_, i_359_ + i_360_, i_353_ + i_361_);
						class57_358_.method645(i_359_, i_353_);
						Class373.aClass_ra4071.r(i, i_344_, i_345_ + i, i_346_ + i_344_);
					} else
						i_353_ -= Math.max(1110385787 * (Class82_Sub19_Sub1.aClass505_9111.anInt6202), Class160.aClass57Array1646[0].method625());
					i_353_ -= 2;
					if (!class365_sub1_sub1_sub2.aBoolean10123) {
						if (-424347101 * class365_sub1_sub1_sub2.anInt10086 > 443738891 * client.anInt8884) {
							Class57 class57 = (Class401.aClass57Array6561[(class365_sub1_sub1_sub2.aBoolean10119 ? 2 : 0)]);
							Class57 class57_362_ = (Class401.aClass57Array6561[(class365_sub1_sub1_sub2.aBoolean10119 ? 3 : 1)]);
							int i_363_ = -1;
							if (class365_sub1_sub1_sub2 instanceof NPC) {
								i_363_ = class503.anInt6184 * -1088584623;
								if (-1 == i_363_)
									i_363_ = ((class365_sub1_sub1_sub2.method4426(1682687181).anInt3754) * -2139195165);
							} else
								i_363_ = (class365_sub1_sub1_sub2.method4426(-387842167).anInt3754) * -2139195165;
							if (-1 != i_363_) {
								Class57[] class57s = ((Class57[]) client.aClass348_8898.method4184((long) i_363_));
								if (class57s == null) {
									Class89[] class89s = Class89.method993((Class158.aClass243_6364), i_363_, 0);
									if (class89s != null) {
										class57s = new Class57[class89s.length];
										for (int i_364_ = 0; i_364_ < class89s.length; i_364_++)
											class57s[i_364_] = (Class373.aClass_ra4071.method5125(class89s[i_364_], true));
										client.aClass348_8898.method4194(class57s, (long) i_363_);
									}
								}
								if (class57s != null && class57s.length == 4) {
									class57 = class57s[(class365_sub1_sub1_sub2.aBoolean10119) ? 2 : 0];
									class57_362_ = class57s[(class365_sub1_sub1_sub2.aBoolean10119) ? 3 : 1];
								}
							}
							int i_365_ = ((class365_sub1_sub1_sub2.anInt10086 * -424347101) - client.anInt8884 * 443738891);
							int i_366_;
							if (i_365_ <= (-1547810795 * class365_sub1_sub1_sub2.anInt10088))
								i_366_ = class57.method623();
							else {
								i_365_ -= (-1547810795 * class365_sub1_sub1_sub2.anInt10088);
								int i_367_ = ((class365_sub1_sub1_sub2.anInt10096 * 293281353) == 0 ? 0 : (((class365_sub1_sub1_sub2.anInt10087 * 878490761) - i_365_) / (class365_sub1_sub1_sub2.anInt10096 * 293281353) * (293281353 * (class365_sub1_sub1_sub2.anInt10096))));
								i_366_ = (class57.method623() * i_367_ / (class365_sub1_sub1_sub2.anInt10087 * 878490761));
							}
							int i_368_ = class57.method625();
							i_353_ -= i_368_;
							int i_369_ = (int) (client.aFloatArray8891[0] + (float) i - (float) (class57.method623() >> 1));
							class57.method645(i_369_, i_353_);
							Class373.aClass_ra4071.o(i_369_, i_353_, i_366_ + i_369_, i_368_ + i_353_);
							class57_362_.method645(i_369_, i_353_);
							Class373.aClass_ra4071.r(i, i_344_, i_345_ + i, i_346_ + i_344_);
							i_353_ -= 2;
						}
						if (class503 == null) {
							Player class365_sub1_sub1_sub2_sub2 = ((Player) class365_sub1_sub1_sub2);
							if (-1 != (class365_sub1_sub1_sub2_sub2.skullId * -1126079563)) {
								Class57 class57 = (Class416.aClass57Array5334[(class365_sub1_sub1_sub2_sub2.skullId) * -1126079563]);
								i_353_ -= class57.method625();
								class57.method645((int) ((float) i + (client.aFloatArray8891[0]) - 12.0F), i_353_);
								i_353_ -= 2;
							}
							if (-1 != (class365_sub1_sub1_sub2_sub2.prayerIcon * -2031128911)) {
								Class57 class57 = (Class422.aClass57Array5351[(-2031128911 * (class365_sub1_sub1_sub2_sub2.prayerIcon))]);
								i_353_ -= class57.method625();
								class57.method645((int) ((client.aFloatArray8891[0]) + (float) i - 12.0F), i_353_);
								i_353_ -= 2;
							}
						} else if (-986687803 * class503.anInt6185 >= 0 && (-986687803 * class503.anInt6185 < Class422.aClass57Array5351.length)) {
							Class57 class57 = (Class422.aClass57Array5351[class503.anInt6185 * -986687803]);
							i_353_ -= class57.method625();
							class57.method645((int) ((float) i + client.aFloatArray8891[0] - (float) (class57.method623() >> 1)), i_353_);
							i_353_ -= 2;
						}
					}
					if (class365_sub1_sub1_sub2 instanceof Player) {
						if (i_352_ >= 0) {
							int i_370_ = 0;
							Class19[] class19s = client.aClass19Array8869;
							for (int i_371_ = 0; i_371_ < class19s.length; i_371_++) {
								Class19 class19 = class19s[i_371_];
								if (class19 != null && 10 == class19.anInt266 * 958933333 && (is[i_352_] == -841622081 * class19.anInt256)) {
									Class57 class57 = (Class128_Sub2.aClass57Array8560[(((Class19) class19).anInt258 * -92466201)]);
									if (class57.method625() > i_370_)
										i_370_ = class57.method625();
									class57.method645((int) (client.aFloatArray8891[0] + (float) i - 12.0F), i_353_ - class57.method625());
								}
							}
							if (i_370_ > 0)
								i_353_ -= 2 + i_370_;
						}
					} else {
						int i_372_ = 0;
						Class19[] class19s = client.aClass19Array8869;
						for (int i_373_ = 0; i_373_ < class19s.length; i_373_++) {
							Class19 class19 = class19s[i_373_];
							if (null != class19 && class19.anInt266 * 958933333 == 1 && (class19.anInt256 * -841622081 == (client.anIntArray8699[i_352_ - i_350_]))) {
								Class57 class57 = (Class128_Sub2.aClass57Array8560[(-92466201 * ((Class19) class19).anInt258)]);
								if (class57.method625() > i_372_)
									i_372_ = class57.method625();
								boolean bool;
								if (((Class19) class19).anInt265 * -519856529 == 0)
									bool = true;
								else {
									int i_374_ = (Class82_Sub5.method883((byte) 6) * 1000 / (-519856529 * ((Class19) class19).anInt265) / 2);
									bool = (443738891 * client.anInt8884 % (2 * i_374_)) < i_374_;
								}
								if (bool)
									class57.method645((int) ((float) i + client.aFloatArray8891[0] - 12.0F), i_353_ - class57.method625());
							}
						}
						if (i_372_ > 0)
							i_353_ -= i_372_ + 2;
					}
					int i_375_ = 0;
					for (/**/; (i_375_ < HashTable.aClass371_5520.anInt4032 * -942466371); i_375_++) {
						int i_376_ = class365_sub1_sub1_sub2.anIntArray10080[i_375_];
						int i_377_ = class365_sub1_sub1_sub2.anIntArray10102[i_375_];
						Class358 class358 = null;
						int i_378_ = 0;
						if (i_377_ >= 0) {
							if (i_376_ <= client.anInt8884 * 443738891) {
								if (i_349_ == 0)
									throw new IllegalStateException();
								continue;
							}
							class358 = (Class500.aClass347_6117.method4176((class365_sub1_sub1_sub2.anIntArray10102[i_375_]), -1682094753));
							i_378_ = -169339039 * class358.anInt3854;
						} else if (i_376_ < 0) {
							if (i_349_ != 0)
								continue;
							return;
						}
						int i_379_ = class365_sub1_sub1_sub2.anIntArray10127[i_375_];
						Class358 class358_380_ = null;
						if (i_379_ >= 0)
							class358_380_ = Class500.aClass347_6117.method4176(i_379_, -1682094753);
						if (i_376_ - i_378_ > 443738891 * client.anInt8884) {
							if (i_349_ == 0)
								throw new IllegalStateException();
						} else {
							int i_381_ = (class365_sub1_sub1_sub2.anIntArray10081[i_375_]);
							if (i_381_ >= 0) {
								class365_sub1_sub1_sub2.anInt10063 = 1207474851 * i_381_;
								class365_sub1_sub1_sub2.anInt10116 = (client.anInt8884 * -1044781683 + -362436300);
								class365_sub1_sub1_sub2.anIntArray10081[i_375_] = -1;
							}
							if (null == class358)
								class365_sub1_sub1_sub2.anIntArray10080[i_375_] = -1;
							else {
								int i_382_ = (class365_sub1_sub1_sub2.method4363((byte) 64) / 2);
								Class255.method2440(class365_sub1_sub1_sub2, i_382_, -1043067647);
								if (client.aFloatArray8891[0] > -1.0F) {
									client.aFloatArray8891[0] += (float) (HashTable.aClass371_5520.anIntArray4033[i_375_]);
									client.aFloatArray8891[1] += (float) (HashTable.aClass371_5520.anIntArray4034[i_375_]);
									Object object = null;
									Object object_383_ = null;
									Object object_384_ = null;
									Object object_385_ = null;
									int i_386_ = 0;
									int i_387_ = 0;
									int i_388_ = 0;
									int i_389_ = 0;
									int i_390_ = 0;
									int i_391_ = 0;
									int i_392_ = 0;
									int i_393_ = 0;
									Class57 class57 = null;
									Class57 class57_394_ = null;
									Class57 class57_395_ = null;
									Class57 class57_396_ = null;
									int i_397_ = 0;
									int i_398_ = 0;
									int i_399_ = 0;
									int i_400_ = 0;
									int i_401_ = 0;
									int i_402_ = 0;
									int i_403_ = 0;
									int i_404_ = 0;
									int i_405_ = 0;
									Class57 class57_406_ = class358.method4280((Class373.aClass_ra4071), (short) -23793);
									if (class57_406_ != null) {
										i_386_ = class57_406_.method623();
										int i_407_ = class57_406_.method625();
										if (i_407_ > i_405_)
											i_405_ = i_407_;
										class57_406_.method622(client.anIntArray8977);
										i_390_ = client.anIntArray8977[0];
									}
									Class57 class57_408_ = class358.method4284((Class373.aClass_ra4071), 406396727);
									if (class57_408_ != null) {
										i_387_ = class57_408_.method623();
										int i_409_ = class57_408_.method625();
										if (i_409_ > i_405_)
											i_405_ = i_409_;
										class57_408_.method622(client.anIntArray8977);
										i_391_ = client.anIntArray8977[0];
									}
									Class57 class57_410_ = class358.method4281((Class373.aClass_ra4071), (byte) 26);
									if (null != class57_410_) {
										i_388_ = class57_410_.method623();
										int i_411_ = class57_410_.method625();
										if (i_411_ > i_405_)
											i_405_ = i_411_;
										class57_410_.method622(client.anIntArray8977);
										i_392_ = client.anIntArray8977[0];
									}
									Class57 class57_412_ = class358.method4282((Class373.aClass_ra4071), (byte) 0);
									if (class57_412_ != null) {
										i_389_ = class57_412_.method623();
										int i_413_ = class57_412_.method625();
										if (i_413_ > i_405_)
											i_405_ = i_413_;
										class57_412_.method622(client.anIntArray8977);
										i_393_ = client.anIntArray8977[0];
									}
									if (class358_380_ != null) {
										class57 = (class358_380_.method4280(Class373.aClass_ra4071, (short) 4674));
										if (null != class57) {
											i_397_ = class57.method623();
											int i_414_ = class57.method625();
											if (i_414_ > i_405_)
												i_405_ = i_414_;
											class57.method622(client.anIntArray8977);
											i_401_ = client.anIntArray8977[0];
										}
										class57_394_ = (class358_380_.method4284(Class373.aClass_ra4071, 1200116626));
										if (null != class57_394_) {
											i_398_ = class57_394_.method623();
											int i_415_ = class57_394_.method625();
											if (i_415_ > i_405_)
												i_405_ = i_415_;
											class57_394_.method622(client.anIntArray8977);
											i_402_ = client.anIntArray8977[0];
										}
										class57_395_ = (class358_380_.method4281(Class373.aClass_ra4071, (byte) 83));
										if (null != class57_395_) {
											i_399_ = class57_395_.method623();
											int i_416_ = class57_395_.method625();
											if (i_416_ > i_405_)
												i_405_ = i_416_;
											class57_395_.method622(client.anIntArray8977);
											i_403_ = client.anIntArray8977[0];
										}
										class57_396_ = (class358_380_.method4282(Class373.aClass_ra4071, (byte) 0));
										if (class57_396_ != null) {
											i_400_ = class57_396_.method623();
											int i_417_ = class57_396_.method625();
											if (i_417_ > i_405_)
												i_405_ = i_417_;
											class57_396_.method622(client.anIntArray8977);
											i_404_ = client.anIntArray8977[0];
										}
									}
									Class264 class264 = Script.aClass264_7534;
									Class264 class264_418_ = Script.aClass264_7534;
									Class505 class505 = Class74.aClass505_695;
									Class505 class505_419_ = Class74.aClass505_695;
									int i_420_ = -160359777 * class358.anInt3864;
									if (i_420_ >= 0) {
										Class264 class264_421_ = ((Class264) (Class497.aClass197_6105.method1883(client.anInterface10_8700, i_420_, true, true, -2063324548)));
										Class505 class505_422_ = (Class497.aClass197_6105.method1879(client.anInterface10_8700, i_420_, -665127508));
										if (class264_421_ != null && class505_422_ != null) {
											class264 = class264_421_;
											class505 = class505_422_;
										}
									}
									if (class358_380_ != null) {
										i_420_ = (class358_380_.anInt3864 * -160359777);
										if (i_420_ >= 0) {
											Class264 class264_423_ = ((Class264) (Class497.aClass197_6105.method1883(client.anInterface10_8700, i_420_, true, true, -2063324548)));
											Class505 class505_424_ = (Class497.aClass197_6105.method1879(client.anInterface10_8700, i_420_, -1834913337));
											if (class264_423_ != null && null != class505_424_) {
												class264_418_ = class264_423_;
												class505_419_ = class505_424_;
											}
										}
									}
									Object object_425_ = null;
									String string = null;
									boolean bool = false;
									int i_426_ = 0;
									String string_427_ = (class358.method4279((class365_sub1_sub1_sub2.anIntArray10079[i_375_]), -794452403));
									int i_428_ = class505.method6264(string_427_, 1512962528);
									if (class358_380_ != null) {
										string = (class358_380_.method4279((class365_sub1_sub1_sub2.anIntArray10083[i_375_]), -794452403));
										i_426_ = (class505_419_.method6264(string, -1394241866));
									}
									int i_429_ = 0;
									int i_430_ = 0;
									if (i_387_ > 0)
										i_429_ = 1 + i_428_ / i_387_;
									if (class358_380_ != null && i_398_ > 0)
										i_430_ = i_426_ / i_398_ + 1;
									int i_431_ = 0;
									int i_432_ = i_431_;
									if (i_386_ > 0)
										i_431_ += i_386_;
									i_431_ += 2;
									int i_433_ = i_431_;
									if (i_388_ > 0)
										i_431_ += i_388_;
									int i_434_ = i_431_;
									int i_435_ = i_431_;
									if (i_387_ > 0) {
										int i_436_ = i_387_ * i_429_;
										i_431_ += i_436_;
										i_435_ += (i_436_ - i_428_) / 2;
									} else
										i_431_ += i_428_;
									int i_437_ = i_431_;
									if (i_389_ > 0)
										i_431_ += i_389_;
									int i_438_ = 0;
									int i_439_ = 0;
									int i_440_ = 0;
									int i_441_ = 0;
									int i_442_ = 0;
									if (null != class358_380_) {
										i_431_ += 2;
										i_438_ = i_431_;
										if (i_397_ > 0)
											i_431_ += i_397_;
										i_431_ += 2;
										i_439_ = i_431_;
										if (i_399_ > 0)
											i_431_ += i_399_;
										i_440_ = i_431_;
										i_442_ = i_431_;
										if (i_398_ > 0) {
											int i_443_ = i_398_ * i_430_;
											i_431_ += i_443_;
											i_442_ += (i_443_ - i_426_) / 2;
										} else
											i_431_ += i_426_;
										i_441_ = i_431_;
										if (i_400_ > 0)
											i_431_ += i_400_;
									}
									int i_444_ = ((class365_sub1_sub1_sub2.anIntArray10080[i_375_]) - client.anInt8884 * 443738891);
									int i_445_ = (class358.anInt3859 * 584392085 - (class358.anInt3859 * 584392085 * i_444_ / (-169339039 * class358.anInt3854)));
									int i_446_ = (-(class358.anInt3852 * 639965299) + (i_444_ * (639965299 * class358.anInt3852) / (class358.anInt3854 * -169339039)));
									int i_447_ = (int) ((float) i_445_ + (client.aFloatArray8891[0] + (float) i - (float) (i_431_ >> 1)));
									int i_448_ = (int) ((float) i_344_ + client.aFloatArray8891[1] - 12.0F + (float) i_446_);
									int i_449_ = i_448_;
									int i_450_ = i_448_ + i_405_;
									int i_451_ = (-176522889 * class358.anInt3862 + (i_448_ + 15));
									int i_452_ = (i_451_ - class505.anInt6202 * 1110385787);
									int i_453_ = (i_451_ + class505.anInt6197 * -1883958527);
									if (i_452_ < i_449_)
										i_449_ = i_452_;
									if (i_453_ > i_450_)
										i_450_ = i_453_;
									int i_454_ = 0;
									if (class358_380_ != null) {
										i_454_ = (class358_380_.anInt3862 * -176522889) + (i_448_ + 15);
										int i_455_ = i_454_ - (class505_419_.anInt6202 * 1110385787);
										int i_456_ = (i_454_ + (-1883958527 * class505_419_.anInt6197));
										if (i_455_ < i_449_)
											i_449_ = i_455_;
										if (i_456_ > i_450_)
											i_450_ = i_456_;
									}
									int i_457_ = 255;
									if (class358.anInt3861 * 1445195441 >= 0)
										i_457_ = ((i_444_ << 8) / ((-169339039 * class358.anInt3854) - (1445195441 * class358.anInt3861)));
									if (i_457_ >= 0 && i_457_ < 255) {
										int i_458_ = i_457_ << 24;
										int i_459_ = i_458_ | 0xffffff;
										if (class57_406_ != null)
											class57_406_.method631((i_432_ + i_447_ - i_390_), i_448_, 0, i_459_, 1);
										if (class57_410_ != null)
											class57_410_.method631((i_433_ + i_447_ - i_392_), i_448_, 0, i_459_, 1);
										if (class57_408_ != null) {
											for (int i_460_ = 0; i_460_ < i_429_; i_460_++)
												class57_408_.method631((i_434_ + i_447_ - i_391_ + i_387_ * i_460_), i_448_, 0, i_459_, 1);
										}
										if (null != class57_412_)
											class57_412_.method631((i_437_ + i_447_ - i_393_), i_448_, 0, i_459_, 1);
										class264.method2488(string_427_, i_435_ + i_447_, i_451_, ((1473512559 * (class358.anInt3853)) | i_458_), 0, -60400188);
										if (class358_380_ != null) {
											if (class57 != null)
												class57.method631((i_447_ + i_438_ - i_401_), i_448_, 0, i_459_, 1);
											if (null != class57_395_)
												class57_395_.method631(i_447_ + i_439_ - i_403_, i_448_, 0, i_459_, 1);
											if (class57_394_ != null) {
												for (int i_461_ = 0; i_461_ < i_430_; i_461_++)
													class57_394_.method631((i_461_ * i_398_ + (i_440_ + i_447_ - i_402_)), i_448_, 0, i_459_, 1);
											}
											if (null != class57_396_)
												class57_396_.method631(i_447_ + i_441_ - i_404_, i_448_, 0, i_459_, 1);
											class264_418_.method2488(string, i_447_ + i_442_, i_454_, (class358_380_.anInt3853 * 1473512559) | i_458_, 0, -540018673);
										}
									} else {
										if (class57_406_ != null)
											class57_406_.method645((i_447_ + i_432_ - i_390_), i_448_);
										if (class57_410_ != null)
											class57_410_.method645((i_433_ + i_447_ - i_392_), i_448_);
										if (class57_408_ != null) {
											for (int i_462_ = 0; i_462_ < i_429_; i_462_++)
												class57_408_.method645((i_387_ * i_462_ + (i_447_ + i_434_ - i_391_)), i_448_);
										}
										if (class57_412_ != null)
											class57_412_.method645((i_437_ + i_447_ - i_393_), i_448_);
										class264.method2488(string_427_, i_435_ + i_447_, i_451_, (((class358.anInt3853) * 1473512559) | ~0xffffff), 0, -45982797);
										if (class358_380_ != null) {
											if (class57 != null)
												class57.method645((i_438_ + i_447_ - i_401_), i_448_);
											if (class57_395_ != null)
												class57_395_.method645(i_447_ + i_439_ - i_403_, i_448_);
											if (null != class57_394_) {
												for (int i_463_ = 0; i_463_ < i_430_; i_463_++)
													class57_394_.method645((i_440_ + i_447_ - i_402_ + i_463_ * i_398_), i_448_);
											}
											if (null != class57_396_)
												class57_396_.method645(i_441_ + i_447_ - i_404_, i_448_);
											class264_418_.method2488(string, i_442_ + i_447_, i_454_, (class358_380_.anInt3853 * 1473512559) | ~0xffffff, 0, -751332562);
										}
									}
								}
							}
						}
					}
				}
			}
			for (int i_464_ = 0; i_464_ < 1306491689 * client.anInt8659; i_464_++) {
				int i_465_ = client.anIntArray8851[i_464_];
				Entity class365_sub1_sub1_sub2;
				if (i_465_ < 2048)
					class365_sub1_sub1_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_465_]);
				else
					class365_sub1_sub1_sub2 = ((Entity) (((Class298_Sub29) client.npcs.get((long) (i_465_ - 2048))).anObject7366));
				int i_466_ = client.anIntArray8779[i_464_];
				Entity class365_sub1_sub1_sub2_467_;
				if (i_466_ < 2048)
					class365_sub1_sub1_sub2_467_ = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_466_]);
				else
					class365_sub1_sub1_sub2_467_ = ((Entity) (((Class298_Sub29) client.npcs.get((long) (i_466_ - 2048))).anObject7366));
				Class122.method1320(class365_sub1_sub1_sub2, class365_sub1_sub1_sub2_467_, (class365_sub1_sub1_sub2.anInt10069 -= 512067143) * -152681609, i, i_344_, i_345_, i_346_, i_347_, i_348_, 1553464017);
			}
			int i_468_ = (1110385787 * Class82_Sub19_Sub1.aClass505_9111.anInt6202 + -1883958527 * Class82_Sub19_Sub1.aClass505_9111.anInt6197 + 2);
			for (int i_469_ = 0; i_469_ < client.anInt8905 * -559111197; i_469_++) {
				int i_470_ = client.anIntArray8907[i_469_];
				int i_471_ = client.anIntArray8908[i_469_];
				int i_472_ = client.anIntArray8909[i_469_];
				boolean bool = true;
				while (bool) {
					bool = false;
					for (int i_473_ = 0; i_473_ < i_469_; i_473_++) {
						if (2 + i_471_ > client.anIntArray8908[i_473_] - i_468_ && (i_471_ - i_468_ < client.anIntArray8908[i_473_] + 2) && (i_470_ - i_472_ < (client.anIntArray8909[i_473_] + client.anIntArray8907[i_473_])) && (i_470_ + i_472_ > (client.anIntArray8907[i_473_] - client.anIntArray8909[i_473_])) && (client.anIntArray8908[i_473_] - i_468_ < i_471_)) {
							i_471_ = client.anIntArray8908[i_473_] - i_468_;
							bool = true;
						}
					}
				}
				client.anIntArray8908[i_469_] = i_471_;
				String string = client.aClass62Array8657[i_469_].method721((byte) 1);
				if (0 == client.anInt8842 * 1805045055) {
					int i_474_ = 16776960;
					int i_475_ = client.aClass62Array8657[i_469_].method720(642226389);
					if (i_475_ < 6)
						i_474_ = client.anIntArray8911[i_475_];
					if (i_475_ == 6)
						i_474_ = (client.anInt8777 * -1953789277 % 20 < 10 ? 16711680 : 16776960);
					if (i_475_ == 7)
						i_474_ = (-1953789277 * client.anInt8777 % 20 < 10 ? 255 : 65535);
					if (8 == i_475_)
						i_474_ = (-1953789277 * client.anInt8777 % 20 < 10 ? 45056 : 8454016);
					if (i_475_ == 9) {
						int i_476_ = 150 - (client.aClass62Array8657[i_469_].method722(-1720960633) * 150 / client.aClass62Array8657[i_469_].method723((short) -1217));
						if (i_476_ < 50)
							i_474_ = i_476_ * 1280 + 16711680;
						else if (i_476_ < 100)
							i_474_ = 16776960 - 327680 * (i_476_ - 50);
						else if (i_476_ < 150)
							i_474_ = (i_476_ - 100) * 5 + 65280;
					}
					if (10 == i_475_) {
						int i_477_ = 150 - (client.aClass62Array8657[i_469_].method722(-1972553140) * 150 / client.aClass62Array8657[i_469_].method723((short) -25631));
						if (i_477_ < 50)
							i_474_ = 5 * i_477_ + 16711680;
						else if (i_477_ < 100)
							i_474_ = 16711935 - (i_477_ - 50) * 327680;
						else if (i_477_ < 150)
							i_474_ = (255 + 327680 * (i_477_ - 100) - (i_477_ - 100) * 5);
					}
					if (i_475_ == 11) {
						int i_478_ = 150 - (client.aClass62Array8657[i_469_].method722(-1730083195) * 150 / client.aClass62Array8657[i_469_].method723((short) -3693));
						if (i_478_ < 50)
							i_474_ = 16777215 - 327685 * i_478_;
						else if (i_478_ < 100)
							i_474_ = 327685 * (i_478_ - 50) + 65280;
						else if (i_478_ < 150)
							i_474_ = 16777215 - 327680 * (i_478_ - 100);
					}
					int i_479_ = i_474_ | ~0xffffff;
					int i_480_ = client.aClass62Array8657[i_469_].method719(833746281);
					if (0 == i_480_)
						Class101.aClass264_1084.method2490(string, i + i_470_, i_471_ + i_344_, i_479_, -16777216, 1321352583);
					if (1 == i_480_)
						Class101.aClass264_1084.method2477(string, i + i_470_, i_471_ + i_344_, i_479_, -16777216, -1953789277 * client.anInt8777, -239335762);
					if (2 == i_480_)
						Class101.aClass264_1084.method2478(string, i_470_ + i, i_471_ + i_344_, i_479_, -16777216, (client.anInt8777 * -1953789277), (byte) -50);
					if (i_480_ == 3) {
						int i_481_ = 150 - (client.aClass62Array8657[i_469_].method722(-2037980380) * 150 / client.aClass62Array8657[i_469_].method723((short) 107));
						Class101.aClass264_1084.method2479(string, i_470_ + i, i_471_ + i_344_, i_479_, -16777216, (client.anInt8777 * -1953789277), i_481_, (byte) 120);
					}
					if (i_480_ == 4) {
						int i_482_ = 150 - (client.aClass62Array8657[i_469_].method722(-1700086542) * 150 / client.aClass62Array8657[i_469_].method723((short) -15372));
						int i_483_ = i_482_ * (Class82_Sub19_Sub1.aClass505_9111.method6264(string, 2139584778) + 100) / 150;
						Class373.aClass_ra4071.o(i_470_ + i - 50, i_344_, i + i_470_ + 50, i_344_ + i_346_);
						Class101.aClass264_1084.method2488(string, (50 + (i_470_ + i) - i_483_), i_344_ + i_471_, i_479_, -16777216, 766607406);
						Class373.aClass_ra4071.r(i, i_344_, i + i_345_, i_346_ + i_344_);
					}
					if (i_480_ == 5) {
						int i_484_ = 150 - (client.aClass62Array8657[i_469_].method722(-2069698200) * 150 / client.aClass62Array8657[i_469_].method723((short) -28873));
						int i_485_ = 0;
						if (i_484_ < 25)
							i_485_ = i_484_ - 25;
						else if (i_484_ > 125)
							i_485_ = i_484_ - 125;
						int i_486_ = ((Class82_Sub19_Sub1.aClass505_9111.anInt6202 * 1110385787) + -1883958527 * (Class82_Sub19_Sub1.aClass505_9111.anInt6197));
						Class373.aClass_ra4071.o(i, i_344_ + i_471_ - i_486_ - 1, i_345_ + i, i_471_ + i_344_ + 5);
						Class101.aClass264_1084.method2490(string, i + i_470_, i_485_ + (i_344_ + i_471_), i_479_, -16777216, -773482636);
						Class373.aClass_ra4071.r(i, i_344_, i_345_ + i, i_344_ + i_346_);
					}
				} else
					Class101.aClass264_1084.method2490(string, i_470_ + i, i_344_ + i_471_, -256, -16777216, 1698336532);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.jm(").append(')').toString());
		}
	}

	public static int method2233(int i, int i_487_, int i_488_, short i_489_) {
		try {
			i_488_ &= 0x3;
			if (0 == i_488_)
				return i_487_;
			if (i_488_ == 1)
				return 4095 - i;
			if (i_488_ == 2)
				return 4095 - i_487_;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kb.p(").append(')').toString());
		}
	}
}
