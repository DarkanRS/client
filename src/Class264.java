/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class264 {
	static int anInt2826;
	GraphicsToolkit aClass_ra2827;
	static int anInt2828;
	public static int anInt2829 = 0;
	static int anInt2830 = -2103918561;
	public static int anInt2831 = 0;
	static int anInt2832;
	Class505 aClass505_2833;
	static int anInt2834;
	static int anInt2835;
	static int anInt2836;
	static int anInt2837 = 1869530301;
	static String[] aStringArray2838;

	public void method2474(String string, int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			if (null != string) {
				method2481(i_1_, i_2_, (byte) 14);
				method2484(string, i - ((Class264) this).aClass505_2833.method6264(string, -1778440333), i_0_, null, null, null, 0, 0, 1766719318);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.f(").append(')').toString());
		}
	}

	public int method2475(String string, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, Class57[] class57s, int[] is, Class_ta class_ta, int i_12_, int i_13_, int i_14_) {
		try {
			return method2476(string, i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, 0, class57s, is, class_ta, i_12_, i_13_, -1416794725);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.p(").append(')').toString());
		}
	}

	public int method2476(String string, int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, Class57[] class57s, int[] is, Class_ta class_ta, int i_24_, int i_25_, int i_26_) {
		try {
			if (null == string)
				return 0;
			method2481(i_18_, i_19_, (byte) 14);
			if (0 == i_22_)
				i_22_ = ((Class264) this).aClass505_2833.anInt6200 * -2028004825;
			int[] is_27_;
			if (i_17_ < i_22_ + ((1110385787 * ((Class264) this).aClass505_2833.anInt6202) + -1883958527 * (((Class264) this).aClass505_2833.anInt6197)) && i_17_ < i_22_ + i_22_)
				is_27_ = null;
			else
				is_27_ = new int[] { i_16_ };
			int i_28_ = ((Class264) this).aClass505_2833.method6257(string, is_27_, aStringArray2838, class57s, (byte) 12);
			if (-1 == i_23_) {
				i_23_ = i_17_ / i_22_;
				if (i_23_ <= 0)
					i_23_ = 1;
			}
			if (i_23_ > 0 && i_28_ >= i_23_) {
				aStringArray2838[i_23_ - 1] = (((Class264) this).aClass505_2833.method6256(aStringArray2838[i_23_ - 1], i_16_, class57s, (byte) -89));
				i_28_ = i_23_;
			}
			if (3 == i_21_ && 1 == i_28_)
				i_21_ = 1;
			int i_29_;
			if (0 == i_21_)
				i_29_ = i_15_ + (1110385787 * ((Class264) this).aClass505_2833.anInt6202);
			else if (1 == i_21_)
				i_29_ = ((i_17_ - (((Class264) this).aClass505_2833.anInt6202 * 1110385787) - (-1883958527 * ((Class264) this).aClass505_2833.anInt6197) - i_22_ * (i_28_ - 1)) / 2 + ((((Class264) this).aClass505_2833.anInt6202 * 1110385787) + i_15_));
			else if (i_21_ == 2)
				i_29_ = (i_17_ + i_15_ - (((Class264) this).aClass505_2833.anInt6197 * -1883958527) - i_22_ * (i_28_ - 1));
			else {
				int i_30_ = ((i_17_ - (((Class264) this).aClass505_2833.anInt6202 * 1110385787) - (-1883958527 * ((Class264) this).aClass505_2833.anInt6197) - (i_28_ - 1) * i_22_) / (i_28_ + 1));
				if (i_30_ < 0)
					i_30_ = 0;
				i_29_ = i_30_ + (i_15_ + 1110385787 * (((Class264) this).aClass505_2833.anInt6202));
				i_22_ += i_30_;
			}
			for (int i_31_ = 0; i_31_ < i_28_; i_31_++) {
				if (0 == i_20_)
					method2484(aStringArray2838[i_31_], i, i_29_, class57s, is, class_ta, i_24_, i_25_, 1522801503);
				else if (i_20_ == 1)
					method2484(aStringArray2838[i_31_], i + (i_16_ - (((Class264) this).aClass505_2833.method6264(aStringArray2838[i_31_], 1710279265))) / 2, i_29_, class57s, is, class_ta, i_24_, i_25_, 1985167681);
				else if (2 == i_20_)
					method2484(aStringArray2838[i_31_], (i + i_16_ - (((Class264) this).aClass505_2833.method6264(aStringArray2838[i_31_], -760283198))), i_29_, class57s, is, class_ta, i_24_, i_25_, 1845200281);
				else if (i_28_ - 1 == i_31_)
					method2484(aStringArray2838[i_31_], i, i_29_, class57s, is, class_ta, i_24_, i_25_, 2147018921);
				else {
					method2483(aStringArray2838[i_31_], i_16_, (byte) -88);
					method2484(aStringArray2838[i_31_], i, i_29_, class57s, is, class_ta, i_24_, i_25_, 1805619681);
					anInt2836 = 0;
				}
				i_29_ += i_22_;
			}
			return i_28_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.i(").append(')').toString());
		}
	}

	public void method2477(String string, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		try {
			if (null != string) {
				method2481(i_33_, i_34_, (byte) 14);
				int i_37_ = string.length();
				int[] is = new int[i_37_];
				for (int i_38_ = 0; i_38_ < i_37_; i_38_++)
					is[i_38_] = (int) (Math.sin((double) i_35_ / 5.0 + (double) i_38_ / 2.0) * 5.0);
				method2487(string, i - ((Class264) this).aClass505_2833.method6264(string, 840724490) / 2, i_32_, null, null, null, is, 873938952);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.k(").append(')').toString());
		}
	}

	public void method2478(String string, int i, int i_39_, int i_40_, int i_41_, int i_42_, byte i_43_) {
		try {
			if (string != null) {
				method2481(i_40_, i_41_, (byte) 14);
				int i_44_ = string.length();
				int[] is = new int[i_44_];
				int[] is_45_ = new int[i_44_];
				for (int i_46_ = 0; i_46_ < i_44_; i_46_++) {
					is[i_46_] = (int) (Math.sin((double) i_46_ / 5.0 + (double) i_42_ / 5.0) * 5.0);
					is_45_[i_46_] = (int) (Math.sin((double) i_46_ / 3.0 + (double) i_42_ / 5.0) * 5.0);
				}
				method2487(string, i - ((Class264) this).aClass505_2833.method6264(string, -748991968) / 2, i_39_, null, null, is, is_45_, 1570757467);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.d(").append(')').toString());
		}
	}

	public void method2479(String string, int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, byte i_52_) {
		try {
			if (null != string) {
				method2481(i_48_, i_49_, (byte) 14);
				double d = 7.0 - (double) i_51_ / 8.0;
				if (d < 0.0)
					d = 0.0;
				int i_53_ = string.length();
				int[] is = new int[i_53_];
				for (int i_54_ = 0; i_54_ < i_53_; i_54_++)
					is[i_54_] = (int) (Math.sin((double) i_50_ / 1.0 + (double) i_54_ / 1.5) * d);
				method2487(string, i - ((Class264) this).aClass505_2833.method6264(string, -795569792) / 2, i_47_, null, null, null, is, 1802136078);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.u(").append(')').toString());
		}
	}

	public int method2480(String string, int i, int i_55_, int i_56_, int i_57_, Random random, int i_58_, Class57[] class57s, int[] is, int i_59_) {
		try {
			if (null == string)
				return 0;
			random.setSeed((long) i_58_);
			int i_60_ = 192 + (random.nextInt() & 0x1f);
			method2481(i_60_ << 24 | i_56_ & 0xffffff, i_60_ << 24 | i_57_ & 0xffffff, (byte) 14);
			int i_61_ = string.length();
			int[] is_62_ = new int[i_61_];
			int i_63_ = 0;
			for (int i_64_ = 0; i_64_ < i_61_; i_64_++) {
				is_62_[i_64_] = i_63_;
				if ((random.nextInt() & 0x3) == 0)
					i_63_++;
			}
			method2487(string, i, i_55_, class57s, is, is_62_, null, 1335811057);
			return i_63_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.x(").append(')').toString());
		}
	}

	void method2481(int i, int i_65_, byte i_66_) {
		try {
			anInt2830 = -2103918561;
			anInt2837 = 1869530301;
			anInt2828 = (anInt2826 = -1857413169 * i) * -134884105;
			anInt2836 = 0;
			anInt2832 = 0;
			if (i_65_ == -1)
				i_65_ = 0;
			anInt2835 = (anInt2834 = i_65_ * -1568224037) * -860187975;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.q(").append(')').toString());
		}
	}

	void method2482(String string, short i) {
		try {
			try {
				if (string.startsWith("col="))
					anInt2828 = (-882366071 * anInt2828 & ~0xffffff | (Class398.method4924(string.substring(4), 16, (byte) -57) & 0xffffff)) * -1158210375;
				else if (string.equals("/col"))
					anInt2828 = -1158210375 * (-882366071 * anInt2828 & ~0xffffff | 1929545519 * anInt2826 & 0xffffff);
				if (string.startsWith("argb="))
					anInt2828 = Class398.method4924(string.substring(5), 16, (byte) 61) * -1158210375;
				else if (string.equals("/argb"))
					anInt2828 = anInt2826 * -134884105;
				else if (string.startsWith("str="))
					anInt2830 = (anInt2828 * -882366071 & ~0xffffff | Class398.method4924(string.substring(4), 16, (byte) -24)) * 2103918561;
				else if (string.equals("str"))
					anInt2830 = (anInt2828 * -882366071 & ~0xffffff | 0x800000) * 2103918561;
				else if (string.equals("/str"))
					anInt2830 = -2103918561;
				else if (string.startsWith("u="))
					anInt2837 = (anInt2828 * -882366071 & ~0xffffff | Class398.method4924(string.substring(2), 16, (byte) -57)) * -1869530301;
				else if (string.equals("u"))
					anInt2837 = -1869530301 * (anInt2828 * -882366071 & ~0xffffff);
				else if (string.equals("/u"))
					anInt2837 = 1869530301;
				else if (string.equalsIgnoreCase("shad=-1"))
					anInt2835 = 0;
				else if (string.startsWith("shad="))
					anInt2835 = (anInt2828 * -882366071 & ~0xffffff | Class398.method4924(string.substring(5), 16, (byte) 67)) * -1352863677;
				else if (string.equals("shad"))
					anInt2835 = (anInt2828 * -882366071 & ~0xffffff) * -1352863677;
				else if (string.equals("/shad"))
					anInt2835 = -860187975 * anInt2834;
				else if (string.equals("br"))
					method2481(1929545519 * anInt2826, anInt2834 * -511946925, (byte) 14);
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.s(").append(')').toString());
		}
	}

	void method2483(String string, int i, byte i_67_) {
		try {
			int i_68_ = 0;
			boolean bool = false;
			for (int i_69_ = 0; i_69_ < string.length(); i_69_++) {
				char c = string.charAt(i_69_);
				if (c == '<')
					bool = true;
				else if ('>' == c)
					bool = false;
				else if (!bool && c == ' ')
					i_68_++;
			}
			if (i_68_ > 0)
				anInt2836 = (i - ((Class264) this).aClass505_2833.method6264(string, 1926010004) << 8) / i_68_ * -1196619179;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.y(").append(')').toString());
		}
	}

	void method2484(String string, int i, int i_70_, Class57[] class57s, int[] is, Class_ta class_ta, int i_71_, int i_72_, int i_73_) {
		try {
			i_70_ -= ((Class264) this).aClass505_2833.anInt6200 * -2028004825;
			int i_74_ = -1;
			int i_75_ = -1;
			int i_76_ = string.length();
			for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
				char c = (char) (Class124.method1387(string.charAt(i_77_), 1088430238) & 0xff);
				if (60 == c)
					i_74_ = i_77_;
				else {
					if (c == 62 && -1 != i_74_) {
						String string_78_ = string.substring(1 + i_74_, i_77_);
						i_74_ = -1;
						if (string_78_.equals("lt"))
							c = '<';
						else if (string_78_.equals("gt"))
							c = '>';
						else if (string_78_.equals("nbsp"))
							c = '\u00a0';
						else if (string_78_.equals("shy"))
							c = '\u00ad';
						else if (string_78_.equals("times"))
							c = '\u00d7';
						else if (string_78_.equals("euro"))
							c = '\u20ac';
						else if (string_78_.equals("copy"))
							c = '\u00a9';
						else if (string_78_.equals("reg"))
							c = '\u00ae';
						else {
							if (string_78_.startsWith("img=")) {
								try {
									int i_79_ = (Class216.method1998(string_78_.substring(4), (short) -9602));
									Class57 class57 = class57s[i_79_];
									int i_80_ = (is != null ? is[i_79_] : class57.method626());
									if ((anInt2828 * -882366071 & ~0xffffff) == -16777216)
										class57.method631(i, (i_70_ + ((((Class264) this).aClass505_2833.anInt6200) * -2028004825) - i_80_), 1, 0, 1);
									else
										class57.method631(i, (((((Class264) this).aClass505_2833.anInt6200) * -2028004825) + i_70_ - i_80_), 0, (((-882366071 * anInt2828) & ~0xffffff) | 0xffffff), 1);
									i += class57s[i_79_].method271();
									i_75_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							} else
								method2482(string_78_, (short) 2307);
							continue;
						}
					}
					if (i_74_ == -1) {
						if (i_75_ != -1)
							i += ((Class264) this).aClass505_2833.method6253(i_75_, c, -1391207992);
						if (32 != c) {
							if (class_ta == null) {
								if (0 != (-675619733 * anInt2835 & ~0xffffff))
									UA(c, i + 1, i_70_ + 1, anInt2835 * -675619733, true);
								UA(c, i, i_70_, anInt2828 * -882366071, false);
							} else {
								if ((-675619733 * anInt2835 & ~0xffffff) != 0)
									method2486(c, 1 + i, i_70_ + 1, anInt2835 * -675619733, true, class_ta, i_71_, i_72_);
								method2486(c, i, i_70_, anInt2828 * -882366071, false, class_ta, i_71_, i_72_);
							}
						} else if (anInt2836 * 1135059709 > 0) {
							anInt2832 += anInt2836 * -1910373915;
							i += anInt2832 * 1199106873 >> 8;
							anInt2832 = (anInt2832 * 1199106873 & 0xff) * 1696502537;
						}
						int i_81_ = ((Class264) this).aClass505_2833.method6255(c, 2062861193);
						if (anInt2830 * -1546042335 != -1)
							((Class264) this).aClass_ra2827.method4990(i, i_70_ + (int) ((double) ((((Class264) this).aClass505_2833.anInt6200) * -2028004825) * 0.7), i_81_, -1546042335 * anInt2830, -1768183212);
						if (-1731221141 * anInt2837 != -1)
							((Class264) this).aClass_ra2827.method4990(i, (-2028004825 * (((Class264) this).aClass505_2833.anInt6200) + i_70_ + 1), i_81_, -1731221141 * anInt2837, -1909269175);
						i += i_81_;
						i_75_ = c;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.t(").append(')').toString());
		}
	}

	public int method2485(String string, int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, Random random, int i_89_, int[] is, Class57[] class57s, int[] is_90_, int i_91_) {
		try {
			if (null == string)
				return 0;
			random.setSeed((long) i_89_);
			int i_92_ = 192 + (random.nextInt() & 0x1f);
			method2481(i_92_ << 24 | i_85_ & 0xffffff, i_86_ == -1 ? 0 : i_92_ << 24 | i_86_ & 0xffffff, (byte) 14);
			int i_93_ = string.length();
			int[] is_94_ = new int[i_93_];
			int i_95_ = 0;
			for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
				is_94_[i_96_] = i_95_;
				if ((random.nextInt() & 0x3) == 0)
					i_95_++;
			}
			int i_97_ = i;
			int i_98_ = (((Class264) this).aClass505_2833.anInt6202 * 1110385787 + i_82_);
			int i_99_ = -1;
			if (1 == i_88_)
				i_98_ += (i_84_ - (1110385787 * ((Class264) this).aClass505_2833.anInt6202) - -1883958527 * (((Class264) this).aClass505_2833.anInt6197)) / 2;
			else if (2 == i_88_)
				i_98_ = i_84_ + i_82_ - (((Class264) this).aClass505_2833.anInt6197) * -1883958527;
			if (1 == i_87_) {
				i_99_ = (((Class264) this).aClass505_2833.method6264(string, 428489518) + i_95_);
				i_97_ += (i_83_ - i_99_) / 2;
			} else if (i_87_ == 2) {
				i_99_ = (((Class264) this).aClass505_2833.method6264(string, 366396585) + i_95_);
				i_97_ += i_83_ - i_99_;
			}
			method2487(string, i_97_, i_98_, class57s, is_90_, is_94_, null, 2007858452);
			if (is != null) {
				if (-1 == i_99_)
					i_99_ = ((Class264) this).aClass505_2833.method6264(string, -1885906966) + i_95_;
				is[0] = i_97_;
				is[1] = i_98_ - (1110385787 * ((Class264) this).aClass505_2833.anInt6202);
				is[2] = i_99_;
				is[3] = (-1883958527 * ((Class264) this).aClass505_2833.anInt6197 + (1110385787 * ((Class264) this).aClass505_2833.anInt6202));
			}
			return i_95_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.r(").append(')').toString());
		}
	}

	abstract void method2486(char c, int i, int i_100_, int i_101_, boolean bool, Class_ta class_ta, int i_102_, int i_103_);

	abstract void g(char c, int i, int i_104_, int i_105_, boolean bool);

	Class264(GraphicsToolkit class_ra, Class505 class505) {
		((Class264) this).aClass_ra2827 = class_ra;
		((Class264) this).aClass505_2833 = class505;
	}

	abstract void e(char c, int i, int i_106_, int i_107_, boolean bool);

	void method2487(String string, int i, int i_108_, Class57[] class57s, int[] is, int[] is_109_, int[] is_110_, int i_111_) {
		try {
			i_108_ -= -2028004825 * ((Class264) this).aClass505_2833.anInt6200;
			int i_112_ = -1;
			int i_113_ = -1;
			int i_114_ = 0;
			int i_115_ = string.length();
			for (int i_116_ = 0; i_116_ < i_115_; i_116_++) {
				char c = (char) (Class124.method1387(string.charAt(i_116_), 1088430238) & 0xff);
				if (c == 60)
					i_112_ = i_116_;
				else {
					if (c == 62 && -1 != i_112_) {
						String string_117_ = string.substring(1 + i_112_, i_116_);
						i_112_ = -1;
						if (string_117_.equals("lt"))
							c = '<';
						else if (string_117_.equals("gt"))
							c = '>';
						else if (string_117_.equals("nbsp"))
							c = '\u00a0';
						else if (string_117_.equals("shy"))
							c = '\u00ad';
						else if (string_117_.equals("times"))
							c = '\u00d7';
						else if (string_117_.equals("euro"))
							c = '\u20ac';
						else if (string_117_.equals("copy"))
							c = '\u00a9';
						else if (string_117_.equals("reg"))
							c = '\u00ae';
						else {
							if (string_117_.startsWith("img=")) {
								try {
									int i_118_;
									if (is_109_ != null)
										i_118_ = is_109_[i_114_];
									else
										i_118_ = 0;
									int i_119_;
									if (is_110_ != null)
										i_119_ = is_110_[i_114_];
									else
										i_119_ = 0;
									i_114_++;
									int i_120_ = (Class216.method1998(string_117_.substring(4), (short) 7054));
									Class57 class57 = class57s[i_120_];
									int i_121_ = (null != is ? is[i_120_] : class57.method626());
									class57.method631(i + i_118_, (i_108_ + ((((Class264) this).aClass505_2833.anInt6200) * -2028004825) - i_121_ + i_119_), 1, 0, 1);
									i += class57s[i_120_].method271();
									i_113_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							} else
								method2482(string_117_, (short) 14447);
							continue;
						}
					}
					if (i_112_ == -1) {
						if (-1 != i_113_)
							i += ((Class264) this).aClass505_2833.method6253(i_113_, c, -1391207992);
						int i_122_;
						if (null != is_109_)
							i_122_ = is_109_[i_114_];
						else
							i_122_ = 0;
						int i_123_;
						if (null != is_110_)
							i_123_ = is_110_[i_114_];
						else
							i_123_ = 0;
						i_114_++;
						if (c != 32) {
							if ((anInt2835 * -675619733 & ~0xffffff) != 0)
								UA(c, 1 + i + i_122_, i_123_ + (i_108_ + 1), -675619733 * anInt2835, true);
							UA(c, i_122_ + i, i_108_ + i_123_, anInt2828 * -882366071, false);
						} else if (anInt2836 * 1135059709 > 0) {
							anInt2832 += -1910373915 * anInt2836;
							i += anInt2832 * 1199106873 >> 8;
							anInt2832 = (anInt2832 * 1199106873 & 0xff) * 1696502537;
						}
						int i_124_ = ((Class264) this).aClass505_2833.method6255(c, 901349390);
						if (-1 != -1546042335 * anInt2830)
							((Class264) this).aClass_ra2827.method4990(i, (int) (0.7 * (double) ((((Class264) this).aClass505_2833.anInt6200) * -2028004825)) + i_108_, i_124_, -1546042335 * anInt2830, -1291304845);
						if (anInt2837 * -1731221141 != -1)
							((Class264) this).aClass_ra2827.method4990(i, i_108_ + -2028004825 * (((Class264) this).aClass505_2833.anInt6200), i_124_, -1731221141 * anInt2837, -1265660857);
						i += i_124_;
						i_113_ = c;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.h(").append(')').toString());
		}
	}

	static {
		anInt2826 = 0;
		anInt2828 = 0;
		anInt2834 = 0;
		anInt2835 = 0;
		anInt2836 = 0;
		anInt2832 = 0;
		aStringArray2838 = new String[100];
	}

	public void method2488(String string, int i, int i_125_, int i_126_, int i_127_, int i_128_) {
		try {
			if (null != string) {
				method2481(i_126_, i_127_, (byte) 14);
				method2484(string, i, i_125_, null, null, null, 0, 0, 2057160412);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.a(").append(')').toString());
		}
	}

	abstract void method2489(char c, int i, int i_129_, int i_130_, boolean bool, Class_ta class_ta, int i_131_, int i_132_);

	abstract void UA(char c, int i, int i_133_, int i_134_, boolean bool);

	public void method2490(String string, int i, int i_135_, int i_136_, int i_137_, int i_138_) {
		try {
			if (string != null) {
				method2481(i_136_, i_137_, (byte) 14);
				method2484(string, i - ((Class264) this).aClass505_2833.method6264(string, 1243151471) / 2, i_135_, null, null, null, 0, 0, 2121400127);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.b(").append(')').toString());
		}
	}

	public static void method2491(String string, String string_139_, int i) {
		try {
			if (string.length() <= 320 && Class400.method4931((byte) 115)) {
				client.lobbyConnection.method384((byte) 4);
				Class85.method957(2087182163);
				Class360.username = string;
				Class360.password = string_139_;
				Class439.method5851(4, 1512716323);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.r(").append(')').toString());
		}
	}

	public static void method2492(int i, String string, byte i_140_) {
		try {
			Class242_Sub1.method2282(i, 0, "", "", "", string, -781451735);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.b(").append(')').toString());
		}
	}

	static final void method2493(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_141_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_142_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class390 class390;
			if (((ClientScript2) class403).aBoolean5261)
				class390 = ((ClientScript2) class403).aClass390_5247;
			else
				class390 = ((ClientScript2) class403).aClass390_5246;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class390.method4866((((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242.aClass119_10131), i_141_, i_142_, 867608709) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.aop(").append(')').toString());
		}
	}

	static final void method2494(ClientScript2 class403, int i) {
		try {
			int i_143_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (((ClientScript2) class403).aClass298_Sub25_5237.members[i_143_].rank);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.ym(").append(')').toString());
		}
	}

	static final void method2495(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class21.method365(class105, class119, false, 2, class403, 2093890134);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.hu(").append(')').toString());
		}
	}

	static void method2496(int i, int i_144_) {
		try {
			synchronized (Class462.aClass348_5682) {
				Class462.aClass348_5682.method4186(i, -1573689525);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.p(").append(')').toString());
		}
	}

	static void method2497(int i, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, byte i_151_) {
		try {
			int i_152_ = i_146_ + i_150_;
			int i_153_ = i_147_ - i_150_;
			for (int i_154_ = i_146_; i_154_ < i_152_; i_154_++)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_154_]), i, i_145_, i_149_, 1917920916);
			for (int i_155_ = i_147_; i_155_ > i_153_; i_155_--)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_155_]), i, i_145_, i_149_, 1834727218);
			int i_156_ = i_150_ + i;
			int i_157_ = i_145_ - i_150_;
			for (int i_158_ = i_152_; i_158_ <= i_153_; i_158_++) {
				int[] is = Class372_Sub3.anIntArrayArray4047[i_158_];
				Class82_Sub22.method940(is, i, i_156_, i_149_, 1202396469);
				Class82_Sub22.method940(is, i_156_, i_157_, i_148_, -1756468313);
				Class82_Sub22.method940(is, i_157_, i_145_, i_149_, 1301704447);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.n(").append(')').toString());
		}
	}

	static final void method2498(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class22.method373(class105, class119, class403, -884844467);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("l.je(").append(')').toString());
		}
	}
}
