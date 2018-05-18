
/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.util.Random;

public abstract class FontRenderer {
	static int anInt57;
	Class414 aClass414_58;
	public static final int anInt59 = 0;
	GraphicalRenderer aClass505_60;
	static int anInt61 = 1633983007;
	static int anInt62 = 1566690511;
	static int anInt63 = 0;
	static int anInt64 = 0;
	static int anInt65 = 0;
	public static final int anInt66 = 0;
	static int anInt67;
	static int anInt68;
	static String[] aStringArray69;

	public void method357(String string, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (null != string) {
			method365(i_1_, i_2_, -635565668);
			int i_4_ = string.length();
			int[] is = new int[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				is[i_5_] = (int) (Math.sin((double) i_3_ / 5.0 + (double) i_5_ / 2.0) * 5.0);
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_0_, null, null, null, is, 2027431528);
		}
	}

	public void renderText(String string, int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		if (string != null) {
			method365(i_7_, i_8_, -52680990);
			method371(string, i, i_6_, null, null, null, 0, 0, (byte) 3);
		}
	}

	public void method359(String string, int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (null != string) {
			method365(i_11_, i_12_, 248909725);
			method371(string, i - ((FontRenderer) this).aClass414_58.method6946(string, -1967833701), i_10_, null, null, null, 0, 0, (byte) 3);
		}
	}

	public void method360(String string, int i, int i_14_, int i_15_, int i_16_, int i_17_) {
		if (string != null) {
			method365(i_15_, i_16_, 289850430);
			method371(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_14_, null, null, null, 0, 0, (byte) 3);
		}
	}

	public int method361(String string, int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, NativeSprite[] class160s, int[] is, Class455 class455, int i_27_, int i_28_) {
		if (string == null)
			return 0;
		method365(i_21_, i_22_, -814538615);
		if (0 == i_25_)
			i_25_ = ((FontRenderer) this).aClass414_58.anInt4975 * 1200654985;
		int[] is_29_;
		if (i_20_ < (((FontRenderer) this).aClass414_58.anInt4979 * -1518951631 + 397683159 * ((FontRenderer) this).aClass414_58.anInt4978 + i_25_) && i_20_ < i_25_ + i_25_)
			is_29_ = null;
		else
			is_29_ = new int[] { i_19_ };
		int i_30_ = ((FontRenderer) this).aClass414_58.method6987(string, is_29_, aStringArray69, class160s, (byte) 0);
		if (i_26_ == -1) {
			i_26_ = i_20_ / i_25_;
			if (i_26_ <= 0)
				i_26_ = 1;
		}
		if (i_26_ > 0 && i_30_ >= i_26_) {
			aStringArray69[i_26_ - 1] = ((FontRenderer) this).aClass414_58.method6959((aStringArray69[i_26_ - 1]), i_19_, class160s, 1056067472);
			i_30_ = i_26_;
		}
		if (3 == i_24_ && 1 == i_30_)
			i_24_ = 1;
		int i_31_;
		if (0 == i_24_)
			i_31_ = ((FontRenderer) this).aClass414_58.anInt4978 * 397683159 + i_18_;
		else if (1 == i_24_)
			i_31_ = ((i_20_ - 397683159 * ((FontRenderer) this).aClass414_58.anInt4978 - ((FontRenderer) this).aClass414_58.anInt4979 * -1518951631 - i_25_ * (i_30_ - 1)) / 2 + (i_18_ + 397683159 * ((FontRenderer) this).aClass414_58.anInt4978));
		else if (2 == i_24_)
			i_31_ = (i_20_ + i_18_ - -1518951631 * ((FontRenderer) this).aClass414_58.anInt4979 - (i_30_ - 1) * i_25_);
		else {
			int i_32_ = ((i_20_ - 397683159 * ((FontRenderer) this).aClass414_58.anInt4978 - ((FontRenderer) this).aClass414_58.anInt4979 * -1518951631 - i_25_ * (i_30_ - 1)) / (1 + i_30_));
			if (i_32_ < 0)
				i_32_ = 0;
			i_31_ = (397683159 * ((FontRenderer) this).aClass414_58.anInt4978 + i_18_ + i_32_);
			i_25_ += i_32_;
		}
		for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
			if (i_23_ == 0)
				method371(aStringArray69[i_33_], i, i_31_, class160s, is, class455, i_27_, i_28_, (byte) 3);
			else if (1 == i_23_)
				method371(aStringArray69[i_33_], i + (i_19_ - (((FontRenderer) this).aClass414_58.method6946(aStringArray69[i_33_], -1967833701))) / 2, i_31_, class160s, is, class455, i_27_, i_28_, (byte) 3);
			else if (2 == i_23_)
				method371(aStringArray69[i_33_], i + i_19_ - (((FontRenderer) this).aClass414_58.method6946(aStringArray69[i_33_], -1967833701)), i_31_, class160s, is, class455, i_27_, i_28_, (byte) 3);
			else if (i_33_ == i_30_ - 1)
				method371(aStringArray69[i_33_], i, i_31_, class160s, is, class455, i_27_, i_28_, (byte) 3);
			else {
				method370(aStringArray69[i_33_], i_19_, 859195296);
				method371(aStringArray69[i_33_], i, i_31_, class160s, is, class455, i_27_, i_28_, (byte) 3);
				anInt67 = 0;
			}
			i_31_ += i_25_;
		}
		return i_30_;
	}

	abstract void method362(char c, int i, int i_34_, int i_35_, boolean bool, Class455 class455, int i_36_, int i_37_);

	void method363(int i, int i_38_) {
		anInt61 = 1633983007;
		anInt62 = 1566690511;
		anInt64 = (anInt63 = -532119615 * i) * 1595129311;
		anInt67 = 0;
		anInt68 = 0;
		if (i_38_ == -1)
			i_38_ = 0;
		anInt57 = (anInt65 = i_38_ * -335287863) * 1432053993;
	}

	public int method364(String string, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, Random random, int i_46_, int[] is, NativeSprite[] class160s, int[] is_47_) {
		if (string == null)
			return 0;
		random.setSeed((long) i_46_);
		int i_48_ = 192 + (random.nextInt() & 0x1f);
		method365(i_48_ << 24 | i_42_ & 0xffffff, -1 == i_43_ ? 0 : i_48_ << 24 | i_43_ & 0xffffff, 2069806322);
		int i_49_ = string.length();
		int[] is_50_ = new int[i_49_];
		int i_51_ = 0;
		for (int i_52_ = 0; i_52_ < i_49_; i_52_++) {
			is_50_[i_52_] = i_51_;
			if ((random.nextInt() & 0x3) == 0)
				i_51_++;
		}
		int i_53_ = i;
		int i_54_ = ((FontRenderer) this).aClass414_58.anInt4978 * 397683159 + i_39_;
		int i_55_ = -1;
		if (i_45_ == 1)
			i_54_ += ((i_41_ - 397683159 * ((FontRenderer) this).aClass414_58.anInt4978 - ((FontRenderer) this).aClass414_58.anInt4979 * -1518951631) / 2);
		else if (2 == i_45_)
			i_54_ = (i_41_ + i_39_ - -1518951631 * ((FontRenderer) this).aClass414_58.anInt4979);
		if (i_44_ == 1) {
			i_55_ = (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) + i_51_);
			i_53_ += (i_40_ - i_55_) / 2;
		} else if (2 == i_44_) {
			i_55_ = (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) + i_51_);
			i_53_ += i_40_ - i_55_;
		}
		method372(string, i_53_, i_54_, class160s, is_47_, is_50_, null, 2031158478);
		if (is != null) {
			if (-1 == i_55_)
				i_55_ = (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) + i_51_);
			is[0] = i_53_;
			is[1] = i_54_ - ((FontRenderer) this).aClass414_58.anInt4978 * 397683159;
			is[2] = i_55_;
			is[3] = (-1518951631 * ((FontRenderer) this).aClass414_58.anInt4979 + 397683159 * ((FontRenderer) this).aClass414_58.anInt4978);
		}
		return i_51_;
	}

	void method365(int i, int i_56_, int i_57_) {
		anInt61 = 1633983007;
		anInt62 = 1566690511;
		anInt64 = (anInt63 = -532119615 * i) * 1595129311;
		anInt67 = 0;
		anInt68 = 0;
		if (i_56_ == -1)
			i_56_ = 0;
		anInt57 = (anInt65 = i_56_ * -335287863) * 1432053993;
	}

	void method366(int i, int i_58_) {
		anInt61 = 1633983007;
		anInt62 = 1566690511;
		anInt64 = (anInt63 = -532119615 * i) * 1595129311;
		anInt67 = 0;
		anInt68 = 0;
		if (i_58_ == -1)
			i_58_ = 0;
		anInt57 = (anInt65 = i_58_ * -335287863) * 1432053993;
	}

	public int method367(String string, int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, Random random, int i_66_, int[] is, NativeSprite[] class160s, int[] is_67_, int i_68_) {
		if (string == null)
			return 0;
		random.setSeed((long) i_66_);
		int i_69_ = 192 + (random.nextInt() & 0x1f);
		method365(i_69_ << 24 | i_62_ & 0xffffff, -1 == i_63_ ? 0 : i_69_ << 24 | i_63_ & 0xffffff, 1360524651);
		int i_70_ = string.length();
		int[] is_71_ = new int[i_70_];
		int i_72_ = 0;
		for (int i_73_ = 0; i_73_ < i_70_; i_73_++) {
			is_71_[i_73_] = i_72_;
			if ((random.nextInt() & 0x3) == 0)
				i_72_++;
		}
		int i_74_ = i;
		int i_75_ = ((FontRenderer) this).aClass414_58.anInt4978 * 397683159 + i_59_;
		int i_76_ = -1;
		if (i_65_ == 1)
			i_75_ += ((i_61_ - 397683159 * ((FontRenderer) this).aClass414_58.anInt4978 - ((FontRenderer) this).aClass414_58.anInt4979 * -1518951631) / 2);
		else if (2 == i_65_)
			i_75_ = (i_61_ + i_59_ - -1518951631 * ((FontRenderer) this).aClass414_58.anInt4979);
		if (i_64_ == 1) {
			i_76_ = (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) + i_72_);
			i_74_ += (i_60_ - i_76_) / 2;
		} else if (2 == i_64_) {
			i_76_ = (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) + i_72_);
			i_74_ += i_60_ - i_76_;
		}
		method372(string, i_74_, i_75_, class160s, is_67_, is_71_, null, 1660900204);
		if (is != null) {
			if (-1 == i_76_)
				i_76_ = (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) + i_72_);
			is[0] = i_74_;
			is[1] = i_75_ - ((FontRenderer) this).aClass414_58.anInt4978 * 397683159;
			is[2] = i_76_;
			is[3] = (-1518951631 * ((FontRenderer) this).aClass414_58.anInt4979 + 397683159 * ((FontRenderer) this).aClass414_58.anInt4978);
		}
		return i_72_;
	}

	public void method368(String string, int i, int i_77_, int i_78_, int i_79_, int i_80_, byte i_81_) {
		if (string != null) {
			method365(i_78_, i_79_, 1182633518);
			int i_82_ = string.length();
			int[] is = new int[i_82_];
			int[] is_83_ = new int[i_82_];
			for (int i_84_ = 0; i_84_ < i_82_; i_84_++) {
				is[i_84_] = (int) (Math.sin((double) i_80_ / 5.0 + (double) i_84_ / 5.0) * 5.0);
				is_83_[i_84_] = (int) (Math.sin((double) i_80_ / 5.0 + (double) i_84_ / 3.0) * 5.0);
			}
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_77_, null, null, is, is_83_, 1888974579);
		}
	}

	void method369(String string, byte i) {
		try {
			if (string.startsWith("col="))
				anInt64 = (anInt64 * 256259551 & ~0xffffff | Class285.method5026(string.substring(4), 16, (byte) 40) & 0xffffff) * -3422689;
			else if (string.equals("/col"))
				anInt64 = (256259551 * anInt64 & ~0xffffff | -461664191 * anInt63 & 0xffffff) * -3422689;
			if (string.startsWith("argb="))
				anInt64 = Class285.method5026(string.substring(5), 16, (byte) -59) * -3422689;
			else if (string.equals("/argb"))
				anInt64 = anInt63 * 1595129311;
			else if (string.startsWith("str="))
				anInt61 = (anInt64 * 256259551 & ~0xffffff | Class285.method5026(string.substring(4), 16, (byte) 1)) * -1633983007;
			else if (string.equals("str"))
				anInt61 = -1633983007 * (256259551 * anInt64 & ~0xffffff | 0x800000);
			else if (string.equals("/str"))
				anInt61 = 1633983007;
			else if (string.startsWith("u="))
				anInt62 = (256259551 * anInt64 & ~0xffffff | Class285.method5026(string.substring(2), 16, (byte) 7)) * -1566690511;
			else if (string.equals("u"))
				anInt62 = (anInt64 * 256259551 & ~0xffffff) * -1566690511;
			else if (string.equals("/u"))
				anInt62 = 1566690511;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt57 = 0;
			else if (string.startsWith("shad="))
				anInt57 = (anInt64 * 256259551 & ~0xffffff | Class285.method5026(string.substring(5), 16, (byte) 100)) * 1039953905;
			else if (string.equals("shad"))
				anInt57 = 1039953905 * (256259551 * anInt64 & ~0xffffff);
			else if (string.equals("/shad"))
				anInt57 = anInt65 * 1432053993;
			else if (string.equals("br"))
				method365(anInt63 * -461664191, 875724921 * anInt65, -571655303);
		} catch (Exception exception) {
			/* empty */
		}
	}

	void method370(String string, int i, int i_85_) {
		int i_86_ = 0;
		boolean bool = false;
		for (int i_87_ = 0; i_87_ < string.length(); i_87_++) {
			char c = string.charAt(i_87_);
			if (c == '<')
				bool = true;
			else if ('>' == c)
				bool = false;
			else if (!bool && c == ' ')
				i_86_++;
		}
		if (i_86_ > 0)
			anInt67 = (i - ((FontRenderer) this).aClass414_58.method6946(string, -1967833701) << 8) / i_86_ * 1038679493;
	}

	void method371(String string, int i, int i_88_, NativeSprite[] class160s, int[] is, Class455 class455, int i_89_, int i_90_, byte i_91_) {
		i_88_ -= 1200654985 * ((FontRenderer) this).aClass414_58.anInt4975;
		int i_92_ = -1;
		int i_93_ = -1;
		int i_94_ = string.length();
		for (int i_95_ = 0; i_95_ < i_94_; i_95_++) {
			char c = (char) (Class242.method4163(string.charAt(i_95_), (byte) 32) & 0xff);
			if (60 == c)
				i_92_ = i_95_;
			else {
				if (c == 62 && i_92_ != -1) {
					String string_96_ = string.substring(1 + i_92_, i_95_);
					i_92_ = -1;
					if (string_96_.equals("lt"))
						c = '<';
					else if (string_96_.equals("gt"))
						c = '>';
					else if (string_96_.equals("nbsp"))
						c = '\u00a0';
					else if (string_96_.equals("shy"))
						c = '\u00ad';
					else if (string_96_.equals("times"))
						c = '\u00d7';
					else if (string_96_.equals("euro"))
						c = '\u20ac';
					else if (string_96_.equals("copy"))
						c = '\u00a9';
					else if (string_96_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_96_.startsWith("img=")) {
							try {
								int i_97_ = Class328.method5830(string_96_.substring(4), -1416049939);
								NativeSprite class160 = class160s[i_97_];
								int i_98_ = (is != null ? is[i_97_] : class160.method2748());
								if ((256259551 * anInt64 & ~0xffffff) == -16777216)
									class160.method2742(i, (((((FontRenderer) this).aClass414_58.anInt4975) * 1200654985) + i_88_ - i_98_), 1, 0, 1);
								else
									class160.method2742(i, (i_88_ + (1200654985 * (((FontRenderer) this).aClass414_58.anInt4975)) - i_98_), 0, ((anInt64 * 256259551 & ~0xffffff) | 0xffffff), 1);
								i += class160s[i_97_].method228();
								i_93_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method369(string_96_, (byte) 85);
						continue;
					}
				}
				if (-1 == i_92_) {
					if (i_93_ != -1)
						i += ((FontRenderer) this).aClass414_58.method6944(i_93_, c, 202656295);
					if (c != 32) {
						if (null == class455) {
							if ((-1288265455 * anInt57 & ~0xffffff) != 0)
								UA(c, 1 + i, 1 + i_88_, -1288265455 * anInt57, true);
							UA(c, i, i_88_, anInt64 * 256259551, false);
						} else {
							if ((-1288265455 * anInt57 & ~0xffffff) != 0)
								method374(c, 1 + i, 1 + i_88_, -1288265455 * anInt57, true, class455, i_89_, i_90_);
							method374(c, i, i_88_, anInt64 * 256259551, false, class455, i_89_, i_90_);
						}
					} else if (1927641357 * anInt67 > 0) {
						anInt68 += anInt67 * 1035215791;
						i += anInt68 * -1223339517 >> 8;
						anInt68 = -1938069333 * (-1223339517 * anInt68 & 0xff);
					}
					int i_99_ = ((FontRenderer) this).aClass414_58.method6945(c, (byte) -117);
					if (2046271009 * anInt61 != -1)
						((FontRenderer) this).aClass505_60.method8659(i, i_88_ + (int) (0.7 * (double) ((((FontRenderer) this).aClass414_58.anInt4975) * 1200654985)), i_99_, anInt61 * 2046271009, -1221933071);
					if (-1 != anInt62 * 785139153)
						((FontRenderer) this).aClass505_60.method8659(i, 1 + (i_88_ + (((FontRenderer) this).aClass414_58.anInt4975 * 1200654985)), i_99_, 785139153 * anInt62, 435318936);
					i += i_99_;
					i_93_ = c;
				}
			}
		}
	}

	void method372(String string, int i, int i_100_, NativeSprite[] class160s, int[] is, int[] is_101_, int[] is_102_, int i_103_) {
		i_100_ -= ((FontRenderer) this).aClass414_58.anInt4975 * 1200654985;
		int i_104_ = -1;
		int i_105_ = -1;
		int i_106_ = 0;
		int i_107_ = string.length();
		for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
			char c = (char) (Class242.method4163(string.charAt(i_108_), (byte) 48) & 0xff);
			if (c == 60)
				i_104_ = i_108_;
			else {
				if (62 == c && -1 != i_104_) {
					String string_109_ = string.substring(i_104_ + 1, i_108_);
					i_104_ = -1;
					if (string_109_.equals("lt"))
						c = '<';
					else if (string_109_.equals("gt"))
						c = '>';
					else if (string_109_.equals("nbsp"))
						c = '\u00a0';
					else if (string_109_.equals("shy"))
						c = '\u00ad';
					else if (string_109_.equals("times"))
						c = '\u00d7';
					else if (string_109_.equals("euro"))
						c = '\u20ac';
					else if (string_109_.equals("copy"))
						c = '\u00a9';
					else if (string_109_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_109_.startsWith("img=")) {
							try {
								int i_110_;
								if (null != is_101_)
									i_110_ = is_101_[i_106_];
								else
									i_110_ = 0;
								int i_111_;
								if (null != is_102_)
									i_111_ = is_102_[i_106_];
								else
									i_111_ = 0;
								i_106_++;
								int i_112_ = Class328.method5830(string_109_.substring(4), 1488511496);
								NativeSprite class160 = class160s[i_112_];
								int i_113_ = (null != is ? is[i_112_] : class160.method2748());
								class160.method2742(i_110_ + i, (((((FontRenderer) this).aClass414_58.anInt4975) * 1200654985) + i_100_ - i_113_ + i_111_), 1, 0, 1);
								i += class160s[i_112_].method228();
								i_105_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method369(string_109_, (byte) 115);
						continue;
					}
				}
				if (-1 == i_104_) {
					if (i_105_ != -1)
						i += ((FontRenderer) this).aClass414_58.method6944(i_105_, c, -646964881);
					int i_114_;
					if (null != is_101_)
						i_114_ = is_101_[i_106_];
					else
						i_114_ = 0;
					int i_115_;
					if (is_102_ != null)
						i_115_ = is_102_[i_106_];
					else
						i_115_ = 0;
					i_106_++;
					if (c != 32) {
						if (0 != (-1288265455 * anInt57 & ~0xffffff))
							UA(c, i_114_ + (1 + i), i_115_ + (i_100_ + 1), -1288265455 * anInt57, true);
						UA(c, i + i_114_, i_100_ + i_115_, anInt64 * 256259551, false);
					} else if (1927641357 * anInt67 > 0) {
						anInt68 += anInt67 * 1035215791;
						i += -1223339517 * anInt68 >> 8;
						anInt68 = -1938069333 * (-1223339517 * anInt68 & 0xff);
					}
					int i_116_ = ((FontRenderer) this).aClass414_58.method6945(c, (byte) -20);
					if (2046271009 * anInt61 != -1)
						((FontRenderer) this).aClass505_60.method8659(i, (int) ((double) (1200654985 * (((FontRenderer) this).aClass414_58.anInt4975)) * 0.7) + i_100_, i_116_, anInt61 * 2046271009, -645910355);
					if (-1 != anInt62 * 785139153)
						((FontRenderer) this).aClass505_60.method8659(i, i_100_ + (((FontRenderer) this).aClass414_58.anInt4975 * 1200654985), i_116_, 785139153 * anInt62, -510924109);
					i += i_116_;
					i_105_ = c;
				}
			}
		}
	}

	abstract void UA(char c, int i, int i_117_, int i_118_, boolean bool);

	public int method373(String string, int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, NativeSprite[] class160s, int[] is, Class455 class455, int i_128_, int i_129_, byte i_130_) {
		if (string == null)
			return 0;
		method365(i_122_, i_123_, 745766148);
		if (0 == i_126_)
			i_126_ = ((FontRenderer) this).aClass414_58.anInt4975 * 1200654985;
		int[] is_131_;
		if (i_121_ < (((FontRenderer) this).aClass414_58.anInt4979 * -1518951631 + 397683159 * ((FontRenderer) this).aClass414_58.anInt4978 + i_126_) && i_121_ < i_126_ + i_126_)
			is_131_ = null;
		else
			is_131_ = new int[] { i_120_ };
		int i_132_ = ((FontRenderer) this).aClass414_58.method6987(string, is_131_, aStringArray69, class160s, (byte) 0);
		if (i_127_ == -1) {
			i_127_ = i_121_ / i_126_;
			if (i_127_ <= 0)
				i_127_ = 1;
		}
		if (i_127_ > 0 && i_132_ >= i_127_) {
			aStringArray69[i_127_ - 1] = ((FontRenderer) this).aClass414_58.method6959((aStringArray69[i_127_ - 1]), i_120_, class160s, 1987203414);
			i_132_ = i_127_;
		}
		if (3 == i_125_ && 1 == i_132_)
			i_125_ = 1;
		int i_133_;
		if (0 == i_125_)
			i_133_ = ((FontRenderer) this).aClass414_58.anInt4978 * 397683159 + i_119_;
		else if (1 == i_125_)
			i_133_ = ((i_121_ - 397683159 * ((FontRenderer) this).aClass414_58.anInt4978 - ((FontRenderer) this).aClass414_58.anInt4979 * -1518951631 - i_126_ * (i_132_ - 1)) / 2 + (i_119_ + 397683159 * ((FontRenderer) this).aClass414_58.anInt4978));
		else if (2 == i_125_)
			i_133_ = (i_121_ + i_119_ - -1518951631 * ((FontRenderer) this).aClass414_58.anInt4979 - (i_132_ - 1) * i_126_);
		else {
			int i_134_ = ((i_121_ - 397683159 * ((FontRenderer) this).aClass414_58.anInt4978 - ((FontRenderer) this).aClass414_58.anInt4979 * -1518951631 - i_126_ * (i_132_ - 1)) / (1 + i_132_));
			if (i_134_ < 0)
				i_134_ = 0;
			i_133_ = (397683159 * ((FontRenderer) this).aClass414_58.anInt4978 + i_119_ + i_134_);
			i_126_ += i_134_;
		}
		for (int i_135_ = 0; i_135_ < i_132_; i_135_++) {
			if (i_124_ == 0)
				method371(aStringArray69[i_135_], i, i_133_, class160s, is, class455, i_128_, i_129_, (byte) 3);
			else if (1 == i_124_)
				method371(aStringArray69[i_135_], i + (i_120_ - (((FontRenderer) this).aClass414_58.method6946(aStringArray69[i_135_], -1967833701))) / 2, i_133_, class160s, is, class455, i_128_, i_129_, (byte) 3);
			else if (2 == i_124_)
				method371(aStringArray69[i_135_], i + i_120_ - (((FontRenderer) this).aClass414_58.method6946(aStringArray69[i_135_], -1967833701)), i_133_, class160s, is, class455, i_128_, i_129_, (byte) 3);
			else if (i_135_ == i_132_ - 1)
				method371(aStringArray69[i_135_], i, i_133_, class160s, is, class455, i_128_, i_129_, (byte) 3);
			else {
				method370(aStringArray69[i_135_], i_120_, 946973547);
				method371(aStringArray69[i_135_], i, i_133_, class160s, is, class455, i_128_, i_129_, (byte) 3);
				anInt67 = 0;
			}
			i_133_ += i_126_;
		}
		return i_132_;
	}

	static {
		anInt57 = 0;
		anInt67 = 0;
		anInt68 = 0;
		aStringArray69 = new String[100];
	}

	abstract void method374(char c, int i, int i_136_, int i_137_, boolean bool, Class455 class455, int i_138_, int i_139_);

	abstract void c(char c, int i, int i_140_, int i_141_, boolean bool);

	abstract void t(char c, int i, int i_142_, int i_143_, boolean bool);

	public void method375(String string, int i, int i_144_, int i_145_, int i_146_) {
		if (null != string) {
			method365(i_145_, i_146_, -1201971740);
			method371(string, i - ((FontRenderer) this).aClass414_58.method6946(string, -1967833701), i_144_, null, null, null, 0, 0, (byte) 3);
		}
	}

	public void method376(String string, int i, int i_147_, int i_148_, int i_149_) {
		if (null != string) {
			method365(i_148_, i_149_, 864131960);
			method371(string, i - ((FontRenderer) this).aClass414_58.method6946(string, -1967833701), i_147_, null, null, null, 0, 0, (byte) 3);
		}
	}

	public void method377(String string, int i, int i_150_, int i_151_, int i_152_) {
		if (null != string) {
			method365(i_151_, i_152_, 1103707153);
			method371(string, i - ((FontRenderer) this).aClass414_58.method6946(string, -1967833701), i_150_, null, null, null, 0, 0, (byte) 3);
		}
	}

	public int method378(String string, int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, NativeSprite[] class160s, int[] is, Class455 class455, int i_161_, int i_162_, byte i_163_) {
		return method373(string, i, i_153_, i_154_, i_155_, i_156_, i_157_, i_158_, i_159_, i_160_, 0, class160s, is, class455, i_161_, i_162_, (byte) 0);
	}

	public int method379(String string, int i, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_, NativeSprite[] class160s, int[] is, Class455 class455, int i_172_, int i_173_) {
		return method373(string, i, i_164_, i_165_, i_166_, i_167_, i_168_, i_169_, i_170_, i_171_, 0, class160s, is, class455, i_172_, i_173_, (byte) 0);
	}

	public int method380(String string, int i, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_, int i_181_, NativeSprite[] class160s, int[] is, Class455 class455, int i_182_, int i_183_) {
		return method373(string, i, i_174_, i_175_, i_176_, i_177_, i_178_, i_179_, i_180_, i_181_, 0, class160s, is, class455, i_182_, i_183_, (byte) 0);
	}

	public void method381(String string, int i, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_) {
		if (string != null) {
			method365(i_185_, i_186_, -813864617);
			double d = 7.0 - (double) i_188_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_190_ = string.length();
			int[] is = new int[i_190_];
			for (int i_191_ = 0; i_191_ < i_190_; i_191_++)
				is[i_191_] = (int) (Math.sin((double) i_187_ / 1.0 + (double) i_191_ / 1.5) * d);
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_184_, null, null, null, is, 1742290741);
		}
	}

	public void method382(String string, int i, int i_192_, int i_193_, int i_194_, int i_195_) {
		if (null != string) {
			method365(i_193_, i_194_, 1219837383);
			int i_196_ = string.length();
			int[] is = new int[i_196_];
			for (int i_197_ = 0; i_197_ < i_196_; i_197_++)
				is[i_197_] = (int) (Math.sin((double) i_195_ / 5.0 + (double) i_197_ / 2.0) * 5.0);
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_192_, null, null, null, is, 1630322069);
		}
	}

	public void method383(String string, int i, int i_198_, int i_199_, int i_200_, int i_201_) {
		if (null != string) {
			method365(i_199_, i_200_, -420623334);
			int i_202_ = string.length();
			int[] is = new int[i_202_];
			for (int i_203_ = 0; i_203_ < i_202_; i_203_++)
				is[i_203_] = (int) (Math.sin((double) i_201_ / 5.0 + (double) i_203_ / 2.0) * 5.0);
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_198_, null, null, null, is, 1643587028);
		}
	}

	public void method384(String string, int i, int i_204_, int i_205_, int i_206_, int i_207_) {
		if (null != string) {
			method365(i_205_, i_206_, -44980227);
			int i_208_ = string.length();
			int[] is = new int[i_208_];
			for (int i_209_ = 0; i_209_ < i_208_; i_209_++)
				is[i_209_] = (int) (Math.sin((double) i_207_ / 5.0 + (double) i_209_ / 2.0) * 5.0);
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_204_, null, null, null, is, 2056699215);
		}
	}

	void method385(String string) {
		try {
			if (string.startsWith("col="))
				anInt64 = (anInt64 * 256259551 & ~0xffffff | Class285.method5026(string.substring(4), 16, (byte) -7) & 0xffffff) * -3422689;
			else if (string.equals("/col"))
				anInt64 = (256259551 * anInt64 & ~0xffffff | -461664191 * anInt63 & 0xffffff) * -3422689;
			if (string.startsWith("argb="))
				anInt64 = Class285.method5026(string.substring(5), 16, (byte) -3) * -3422689;
			else if (string.equals("/argb"))
				anInt64 = anInt63 * 1595129311;
			else if (string.startsWith("str="))
				anInt61 = (anInt64 * 256259551 & ~0xffffff | Class285.method5026(string.substring(4), 16, (byte) -87)) * -1633983007;
			else if (string.equals("str"))
				anInt61 = -1633983007 * (256259551 * anInt64 & ~0xffffff | 0x800000);
			else if (string.equals("/str"))
				anInt61 = 1633983007;
			else if (string.startsWith("u="))
				anInt62 = (256259551 * anInt64 & ~0xffffff | Class285.method5026(string.substring(2), 16, (byte) -38)) * -1566690511;
			else if (string.equals("u"))
				anInt62 = (anInt64 * 256259551 & ~0xffffff) * -1566690511;
			else if (string.equals("/u"))
				anInt62 = 1566690511;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt57 = 0;
			else if (string.startsWith("shad="))
				anInt57 = (anInt64 * 256259551 & ~0xffffff | Class285.method5026(string.substring(5), 16, (byte) -64)) * 1039953905;
			else if (string.equals("shad"))
				anInt57 = 1039953905 * (256259551 * anInt64 & ~0xffffff);
			else if (string.equals("/shad"))
				anInt57 = anInt65 * 1432053993;
			else if (string.equals("br"))
				method365(anInt63 * -461664191, 875724921 * anInt65, 496838540);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public int method386(String string, int i, int i_210_, int i_211_, int i_212_, Random random, int i_213_, NativeSprite[] class160s, int[] is, int i_214_) {
		if (string == null)
			return 0;
		random.setSeed((long) i_213_);
		int i_215_ = 192 + (random.nextInt() & 0x1f);
		method365(i_215_ << 24 | i_211_ & 0xffffff, i_215_ << 24 | i_212_ & 0xffffff, -761696495);
		int i_216_ = string.length();
		int[] is_217_ = new int[i_216_];
		int i_218_ = 0;
		for (int i_219_ = 0; i_219_ < i_216_; i_219_++) {
			is_217_[i_219_] = i_218_;
			if ((random.nextInt() & 0x3) == 0)
				i_218_++;
		}
		method372(string, i, i_210_, class160s, is, is_217_, null, 1983305186);
		return i_218_;
	}

	public void method387(String string, int i, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_) {
		if (null != string) {
			method365(i_221_, i_222_, 347132916);
			int i_225_ = string.length();
			int[] is = new int[i_225_];
			for (int i_226_ = 0; i_226_ < i_225_; i_226_++)
				is[i_226_] = (int) (Math.sin((double) i_223_ / 5.0 + (double) i_226_ / 2.0) * 5.0);
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_220_, null, null, null, is, 1737737512);
		}
	}

	public void method388(String string, int i, int i_227_, int i_228_, int i_229_, int i_230_, int i_231_) {
		if (string != null) {
			method365(i_228_, i_229_, 1576502624);
			double d = 7.0 - (double) i_231_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_232_ = string.length();
			int[] is = new int[i_232_];
			for (int i_233_ = 0; i_233_ < i_232_; i_233_++)
				is[i_233_] = (int) (Math.sin((double) i_230_ / 1.0 + (double) i_233_ / 1.5) * d);
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_227_, null, null, null, is, 1894134703);
		}
	}

	public void method389(String string, int i, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_) {
		if (string != null) {
			method365(i_235_, i_236_, 1549176272);
			double d = 7.0 - (double) i_238_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_239_ = string.length();
			int[] is = new int[i_239_];
			for (int i_240_ = 0; i_240_ < i_239_; i_240_++)
				is[i_240_] = (int) (Math.sin((double) i_237_ / 1.0 + (double) i_240_ / 1.5) * d);
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_234_, null, null, null, is, 1970106624);
		}
	}

	public void method390(String string, int i, int i_241_, int i_242_, int i_243_) {
		if (string != null) {
			method365(i_242_, i_243_, -441931346);
			method371(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_241_, null, null, null, 0, 0, (byte) 3);
		}
	}

	public int method391(String string, int i, int i_244_, int i_245_, int i_246_, Random random, int i_247_, NativeSprite[] class160s, int[] is) {
		if (string == null)
			return 0;
		random.setSeed((long) i_247_);
		int i_248_ = 192 + (random.nextInt() & 0x1f);
		method365(i_248_ << 24 | i_245_ & 0xffffff, i_248_ << 24 | i_246_ & 0xffffff, -519984514);
		int i_249_ = string.length();
		int[] is_250_ = new int[i_249_];
		int i_251_ = 0;
		for (int i_252_ = 0; i_252_ < i_249_; i_252_++) {
			is_250_[i_252_] = i_251_;
			if ((random.nextInt() & 0x3) == 0)
				i_251_++;
		}
		method372(string, i, i_244_, class160s, is, is_250_, null, 1665910492);
		return i_251_;
	}

	public int method392(String string, int i, int i_253_, int i_254_, int i_255_, Random random, int i_256_, NativeSprite[] class160s, int[] is) {
		if (string == null)
			return 0;
		random.setSeed((long) i_256_);
		int i_257_ = 192 + (random.nextInt() & 0x1f);
		method365(i_257_ << 24 | i_254_ & 0xffffff, i_257_ << 24 | i_255_ & 0xffffff, 1056034992);
		int i_258_ = string.length();
		int[] is_259_ = new int[i_258_];
		int i_260_ = 0;
		for (int i_261_ = 0; i_261_ < i_258_; i_261_++) {
			is_259_[i_261_] = i_260_;
			if ((random.nextInt() & 0x3) == 0)
				i_260_++;
		}
		method372(string, i, i_253_, class160s, is, is_259_, null, 2061227415);
		return i_260_;
	}

	public int method393(String string, int i, int i_262_, int i_263_, int i_264_, int i_265_, int i_266_, int i_267_, int i_268_, Random random, int i_269_, int[] is, NativeSprite[] class160s, int[] is_270_) {
		if (string == null)
			return 0;
		random.setSeed((long) i_269_);
		int i_271_ = 192 + (random.nextInt() & 0x1f);
		method365(i_271_ << 24 | i_265_ & 0xffffff, -1 == i_266_ ? 0 : i_271_ << 24 | i_266_ & 0xffffff, 1385496200);
		int i_272_ = string.length();
		int[] is_273_ = new int[i_272_];
		int i_274_ = 0;
		for (int i_275_ = 0; i_275_ < i_272_; i_275_++) {
			is_273_[i_275_] = i_274_;
			if ((random.nextInt() & 0x3) == 0)
				i_274_++;
		}
		int i_276_ = i;
		int i_277_ = ((FontRenderer) this).aClass414_58.anInt4978 * 397683159 + i_262_;
		int i_278_ = -1;
		if (i_268_ == 1)
			i_277_ += ((i_264_ - 397683159 * ((FontRenderer) this).aClass414_58.anInt4978 - ((FontRenderer) this).aClass414_58.anInt4979 * -1518951631) / 2);
		else if (2 == i_268_)
			i_277_ = (i_264_ + i_262_ - -1518951631 * ((FontRenderer) this).aClass414_58.anInt4979);
		if (i_267_ == 1) {
			i_278_ = (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) + i_274_);
			i_276_ += (i_263_ - i_278_) / 2;
		} else if (2 == i_267_) {
			i_278_ = (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) + i_274_);
			i_276_ += i_263_ - i_278_;
		}
		method372(string, i_276_, i_277_, class160s, is_270_, is_273_, null, 1930932786);
		if (is != null) {
			if (-1 == i_278_)
				i_278_ = (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) + i_274_);
			is[0] = i_276_;
			is[1] = i_277_ - ((FontRenderer) this).aClass414_58.anInt4978 * 397683159;
			is[2] = i_278_;
			is[3] = (-1518951631 * ((FontRenderer) this).aClass414_58.anInt4979 + 397683159 * ((FontRenderer) this).aClass414_58.anInt4978);
		}
		return i_274_;
	}

	public int method394(String string, int i, int i_279_, int i_280_, int i_281_, Random random, int i_282_, NativeSprite[] class160s, int[] is) {
		if (string == null)
			return 0;
		random.setSeed((long) i_282_);
		int i_283_ = 192 + (random.nextInt() & 0x1f);
		method365(i_283_ << 24 | i_280_ & 0xffffff, i_283_ << 24 | i_281_ & 0xffffff, 1279044696);
		int i_284_ = string.length();
		int[] is_285_ = new int[i_284_];
		int i_286_ = 0;
		for (int i_287_ = 0; i_287_ < i_284_; i_287_++) {
			is_285_[i_287_] = i_286_;
			if ((random.nextInt() & 0x3) == 0)
				i_286_++;
		}
		method372(string, i, i_279_, class160s, is, is_285_, null, 1631970360);
		return i_286_;
	}

	public void method395(String string, int i, int i_288_, int i_289_, int i_290_, int i_291_) {
		if (string != null) {
			method365(i_289_, i_290_, 1907007363);
			int i_292_ = string.length();
			int[] is = new int[i_292_];
			int[] is_293_ = new int[i_292_];
			for (int i_294_ = 0; i_294_ < i_292_; i_294_++) {
				is[i_294_] = (int) (Math.sin((double) i_291_ / 5.0 + (double) i_294_ / 5.0) * 5.0);
				is_293_[i_294_] = (int) (Math.sin((double) i_291_ / 5.0 + (double) i_294_ / 3.0) * 5.0);
			}
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_288_, null, null, is, is_293_, 1801018004);
		}
	}

	public void method396(String string, int i, int i_295_, int i_296_, int i_297_, int i_298_) {
		if (string != null) {
			method365(i_296_, i_297_, 204219045);
			int i_299_ = string.length();
			int[] is = new int[i_299_];
			int[] is_300_ = new int[i_299_];
			for (int i_301_ = 0; i_301_ < i_299_; i_301_++) {
				is[i_301_] = (int) (Math.sin((double) i_298_ / 5.0 + (double) i_301_ / 5.0) * 5.0);
				is_300_[i_301_] = (int) (Math.sin((double) i_298_ / 5.0 + (double) i_301_ / 3.0) * 5.0);
			}
			method372(string, i - (((FontRenderer) this).aClass414_58.method6946(string, -1967833701) / 2), i_295_, null, null, is, is_300_, 1765016187);
		}
	}

	FontRenderer(GraphicalRenderer class505, Class414 class414) {
		((FontRenderer) this).aClass505_60 = class505;
		((FontRenderer) this).aClass414_58 = class414;
	}

	void method397(String string, int i) {
		int i_302_ = 0;
		boolean bool = false;
		for (int i_303_ = 0; i_303_ < string.length(); i_303_++) {
			char c = string.charAt(i_303_);
			if (c == '<')
				bool = true;
			else if ('>' == c)
				bool = false;
			else if (!bool && c == ' ')
				i_302_++;
		}
		if (i_302_ > 0)
			anInt67 = (i - ((FontRenderer) this).aClass414_58.method6946(string, -1967833701) << 8) / i_302_ * 1038679493;
	}

	void method398(String string, int i, int i_304_, NativeSprite[] class160s, int[] is, Class455 class455, int i_305_, int i_306_) {
		i_304_ -= 1200654985 * ((FontRenderer) this).aClass414_58.anInt4975;
		int i_307_ = -1;
		int i_308_ = -1;
		int i_309_ = string.length();
		for (int i_310_ = 0; i_310_ < i_309_; i_310_++) {
			char c = (char) (Class242.method4163(string.charAt(i_310_), (byte) 96) & 0xff);
			if (60 == c)
				i_307_ = i_310_;
			else {
				if (c == 62 && i_307_ != -1) {
					String string_311_ = string.substring(1 + i_307_, i_310_);
					i_307_ = -1;
					if (string_311_.equals("lt"))
						c = '<';
					else if (string_311_.equals("gt"))
						c = '>';
					else if (string_311_.equals("nbsp"))
						c = '\u00a0';
					else if (string_311_.equals("shy"))
						c = '\u00ad';
					else if (string_311_.equals("times"))
						c = '\u00d7';
					else if (string_311_.equals("euro"))
						c = '\u20ac';
					else if (string_311_.equals("copy"))
						c = '\u00a9';
					else if (string_311_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_311_.startsWith("img=")) {
							try {
								int i_312_ = Class328.method5830(string_311_.substring(4), -394927585);
								NativeSprite class160 = class160s[i_312_];
								int i_313_ = (is != null ? is[i_312_] : class160.method2748());
								if ((256259551 * anInt64 & ~0xffffff) == -16777216)
									class160.method2742(i, (((((FontRenderer) this).aClass414_58.anInt4975) * 1200654985) + i_304_ - i_313_), 1, 0, 1);
								else
									class160.method2742(i, (i_304_ + (1200654985 * (((FontRenderer) this).aClass414_58.anInt4975)) - i_313_), 0, ((anInt64 * 256259551 & ~0xffffff) | 0xffffff), 1);
								i += class160s[i_312_].method228();
								i_308_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method369(string_311_, (byte) 123);
						continue;
					}
				}
				if (-1 == i_307_) {
					if (i_308_ != -1)
						i += ((FontRenderer) this).aClass414_58.method6944(i_308_, c, -430527218);
					if (c != 32) {
						if (null == class455) {
							if ((-1288265455 * anInt57 & ~0xffffff) != 0)
								UA(c, 1 + i, 1 + i_304_, -1288265455 * anInt57, true);
							UA(c, i, i_304_, anInt64 * 256259551, false);
						} else {
							if ((-1288265455 * anInt57 & ~0xffffff) != 0)
								method374(c, 1 + i, 1 + i_304_, -1288265455 * anInt57, true, class455, i_305_, i_306_);
							method374(c, i, i_304_, anInt64 * 256259551, false, class455, i_305_, i_306_);
						}
					} else if (1927641357 * anInt67 > 0) {
						anInt68 += anInt67 * 1035215791;
						i += anInt68 * -1223339517 >> 8;
						anInt68 = -1938069333 * (-1223339517 * anInt68 & 0xff);
					}
					int i_314_ = ((FontRenderer) this).aClass414_58.method6945(c, (byte) -73);
					if (2046271009 * anInt61 != -1)
						((FontRenderer) this).aClass505_60.method8659(i, i_304_ + (int) (0.7 * (double) ((((FontRenderer) this).aClass414_58.anInt4975) * 1200654985)), i_314_, anInt61 * 2046271009, -1435207763);
					if (-1 != anInt62 * 785139153)
						((FontRenderer) this).aClass505_60.method8659(i, 1 + (i_304_ + (((FontRenderer) this).aClass414_58.anInt4975 * 1200654985)), i_314_, 785139153 * anInt62, -425023661);
					i += i_314_;
					i_308_ = c;
				}
			}
		}
	}

	void method399(String string, int i, int i_315_, NativeSprite[] class160s, int[] is, int[] is_316_, int[] is_317_) {
		i_315_ -= ((FontRenderer) this).aClass414_58.anInt4975 * 1200654985;
		int i_318_ = -1;
		int i_319_ = -1;
		int i_320_ = 0;
		int i_321_ = string.length();
		for (int i_322_ = 0; i_322_ < i_321_; i_322_++) {
			char c = (char) (Class242.method4163(string.charAt(i_322_), (byte) 12) & 0xff);
			if (c == 60)
				i_318_ = i_322_;
			else {
				if (62 == c && -1 != i_318_) {
					String string_323_ = string.substring(i_318_ + 1, i_322_);
					i_318_ = -1;
					if (string_323_.equals("lt"))
						c = '<';
					else if (string_323_.equals("gt"))
						c = '>';
					else if (string_323_.equals("nbsp"))
						c = '\u00a0';
					else if (string_323_.equals("shy"))
						c = '\u00ad';
					else if (string_323_.equals("times"))
						c = '\u00d7';
					else if (string_323_.equals("euro"))
						c = '\u20ac';
					else if (string_323_.equals("copy"))
						c = '\u00a9';
					else if (string_323_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_323_.startsWith("img=")) {
							try {
								int i_324_;
								if (null != is_316_)
									i_324_ = is_316_[i_320_];
								else
									i_324_ = 0;
								int i_325_;
								if (null != is_317_)
									i_325_ = is_317_[i_320_];
								else
									i_325_ = 0;
								i_320_++;
								int i_326_ = Class328.method5830(string_323_.substring(4), 241080585);
								NativeSprite class160 = class160s[i_326_];
								int i_327_ = (null != is ? is[i_326_] : class160.method2748());
								class160.method2742(i_324_ + i, (((((FontRenderer) this).aClass414_58.anInt4975) * 1200654985) + i_315_ - i_327_ + i_325_), 1, 0, 1);
								i += class160s[i_326_].method228();
								i_319_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method369(string_323_, (byte) 76);
						continue;
					}
				}
				if (-1 == i_318_) {
					if (i_319_ != -1)
						i += ((FontRenderer) this).aClass414_58.method6944(i_319_, c, -146048364);
					int i_328_;
					if (null != is_316_)
						i_328_ = is_316_[i_320_];
					else
						i_328_ = 0;
					int i_329_;
					if (is_317_ != null)
						i_329_ = is_317_[i_320_];
					else
						i_329_ = 0;
					i_320_++;
					if (c != 32) {
						if (0 != (-1288265455 * anInt57 & ~0xffffff))
							UA(c, i_328_ + (1 + i), i_329_ + (i_315_ + 1), -1288265455 * anInt57, true);
						UA(c, i + i_328_, i_315_ + i_329_, anInt64 * 256259551, false);
					} else if (1927641357 * anInt67 > 0) {
						anInt68 += anInt67 * 1035215791;
						i += -1223339517 * anInt68 >> 8;
						anInt68 = -1938069333 * (-1223339517 * anInt68 & 0xff);
					}
					int i_330_ = ((FontRenderer) this).aClass414_58.method6945(c, (byte) -60);
					if (2046271009 * anInt61 != -1)
						((FontRenderer) this).aClass505_60.method8659(i, (int) ((double) (1200654985 * (((FontRenderer) this).aClass414_58.anInt4975)) * 0.7) + i_315_, i_330_, anInt61 * 2046271009, 159818004);
					if (-1 != anInt62 * 785139153)
						((FontRenderer) this).aClass505_60.method8659(i, i_315_ + (((FontRenderer) this).aClass414_58.anInt4975 * 1200654985), i_330_, 785139153 * anInt62, 1007066485);
					i += i_330_;
					i_319_ = c;
				}
			}
		}
	}

	public static Class209 method400(Component component, boolean bool, byte i) {
		return new Class209_Sub1(component, bool);
	}

	static final void method401(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class199.method3251(class118, class527, 1310130121);
	}

	static void method402(int i) {
		Class179.anInt2230 = -2050700174 + (Class288.aClass414_3438.anInt4978 * 1838611167 + -810427415 * Class288.aClass414_3438.anInt4979);
		Class179.anInt2222 = 681447330 + (2090076551 * Class16.aClass414_139.anInt4978 + Class16.aClass414_139.anInt4979 * 74486273);
		Class13.aStringArray129 = new String[500];
		for (int i_331_ = 0; i_331_ < Class13.aStringArray129.length; i_331_++)
			Class13.aStringArray129[i_331_] = "";
		Class209.method3598(Class433.aClass433_5232.method7273(Class223.aClass495_2772, -1940277002), -1694092142);
	}

	static final void method403(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class118.aBool1291 = ((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) == 1);
	}

	public static GraphicalRenderer method404(Canvas canvas, Interface22 interface22, int i, int i_332_, int i_333_) {
		return new ja(canvas, interface22, i, i_332_);
	}
}
