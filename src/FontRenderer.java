
/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.util.Random;

public abstract class FontRenderer {
	static int anInt57;
	FontMetrics fontMetrics;
	GraphicalRenderer renderer;
	static int anInt61 = 1633983007;
	static int anInt62 = 1566690511;
	static int anInt63 = 0;
	static int anInt64 = 0;
	static int anInt65 = 0;
	static int anInt67;
	static int anInt68;
	static String[] aStringArray69;

	public void renderText(String string, int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		if (string != null) {
			method365(i_7_, i_8_, -52680990);
			method371(string, i, i_6_, null, null, null, 0, 0, (byte) 3);
		}
	}

	public void method359(String string, int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (null != string) {
			method365(i_11_, i_12_, 248909725);
			method371(string, i - ((FontRenderer) this).fontMetrics.getWidthNoSprites(string, -1967833701), i_10_, null, null, null, 0, 0, (byte) 3);
		}
	}

	public void method360(String string, int i, int i_14_, int i_15_, int i_16_, int i_17_) {
		if (string != null) {
			method365(i_15_, i_16_, 289850430);
			method371(string, i - (((FontRenderer) this).fontMetrics.getWidthNoSprites(string, -1967833701) / 2), i_14_, null, null, null, 0, 0, (byte) 3);
		}
	}

	abstract void method362(char c, int i, int i_34_, int i_35_, boolean bool, Class455 class455, int i_36_, int i_37_);
	
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
		int i_75_ = ((FontRenderer) this).fontMetrics.anInt4978 * 397683159 + i_59_;
		int i_76_ = -1;
		if (i_65_ == 1)
			i_75_ += ((i_61_ - 397683159 * ((FontRenderer) this).fontMetrics.anInt4978 - ((FontRenderer) this).fontMetrics.anInt4979 * -1518951631) / 2);
		else if (2 == i_65_)
			i_75_ = (i_61_ + i_59_ - -1518951631 * ((FontRenderer) this).fontMetrics.anInt4979);
		if (i_64_ == 1) {
			i_76_ = (((FontRenderer) this).fontMetrics.getWidthNoSprites(string, -1967833701) + i_72_);
			i_74_ += (i_60_ - i_76_) / 2;
		} else if (2 == i_64_) {
			i_76_ = (((FontRenderer) this).fontMetrics.getWidthNoSprites(string, -1967833701) + i_72_);
			i_74_ += i_60_ - i_76_;
		}
		method372(string, i_74_, i_75_, class160s, is_67_, is_71_, null, 1660900204);
		if (is != null) {
			if (-1 == i_76_)
				i_76_ = (((FontRenderer) this).fontMetrics.getWidthNoSprites(string, -1967833701) + i_72_);
			is[0] = i_74_;
			is[1] = i_75_ - ((FontRenderer) this).fontMetrics.anInt4978 * 397683159;
			is[2] = i_76_;
			is[3] = (-1518951631 * ((FontRenderer) this).fontMetrics.anInt4979 + 397683159 * ((FontRenderer) this).fontMetrics.anInt4978);
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
			method372(string, i - (((FontRenderer) this).fontMetrics.getWidthNoSprites(string, -1967833701) / 2), i_77_, null, null, is, is_83_, 1888974579);
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
			anInt67 = (i - ((FontRenderer) this).fontMetrics.getWidthNoSprites(string, -1967833701) << 8) / i_86_ * 1038679493;
	}

	void method371(String string, int i, int i_88_, NativeSprite[] class160s, int[] is, Class455 class455, int i_89_, int i_90_, byte i_91_) {
		i_88_ -= 1200654985 * ((FontRenderer) this).fontMetrics.anInt4975;
		int i_92_ = -1;
		int i_93_ = -1;
		int i_94_ = string.length();
		for (int i_95_ = 0; i_95_ < i_94_; i_95_++) {
			char c = (char) (Class242.getByteForChar(string.charAt(i_95_)) & 0xff);
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
								int i_97_ = Class328.parseInt(string_96_.substring(4), -1416049939);
								NativeSprite class160 = class160s[i_97_];
								int i_98_ = (is != null ? is[i_97_] : class160.method2748());
								if ((256259551 * anInt64 & ~0xffffff) == -16777216)
									class160.method2742(i, (((((FontRenderer) this).fontMetrics.anInt4975) * 1200654985) + i_88_ - i_98_), 1, 0, 1);
								else
									class160.method2742(i, (i_88_ + (1200654985 * (((FontRenderer) this).fontMetrics.anInt4975)) - i_98_), 0, ((anInt64 * 256259551 & ~0xffffff) | 0xffffff), 1);
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
						i += ((FontRenderer) this).fontMetrics.getKerning(i_93_, c, 202656295);
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
					int i_99_ = ((FontRenderer) this).fontMetrics.method6945(c, (byte) -117);
					if (2046271009 * anInt61 != -1)
						((FontRenderer) this).renderer.method8659(i, i_88_ + (int) (0.7 * (double) ((((FontRenderer) this).fontMetrics.anInt4975) * 1200654985)), i_99_, anInt61 * 2046271009, -1221933071);
					if (-1 != anInt62 * 785139153)
						((FontRenderer) this).renderer.method8659(i, 1 + (i_88_ + (((FontRenderer) this).fontMetrics.anInt4975 * 1200654985)), i_99_, 785139153 * anInt62, 435318936);
					i += i_99_;
					i_93_ = c;
				}
			}
		}
	}

	void method372(String string, int i, int i_100_, NativeSprite[] class160s, int[] is, int[] is_101_, int[] is_102_, int i_103_) {
		i_100_ -= ((FontRenderer) this).fontMetrics.anInt4975 * 1200654985;
		int i_104_ = -1;
		int i_105_ = -1;
		int i_106_ = 0;
		int i_107_ = string.length();
		for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
			char c = (char) (Class242.getByteForChar(string.charAt(i_108_)) & 0xff);
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
								int i_112_ = Class328.parseInt(string_109_.substring(4), 1488511496);
								NativeSprite class160 = class160s[i_112_];
								int i_113_ = (null != is ? is[i_112_] : class160.method2748());
								class160.method2742(i_110_ + i, (((((FontRenderer) this).fontMetrics.anInt4975) * 1200654985) + i_100_ - i_113_ + i_111_), 1, 0, 1);
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
						i += ((FontRenderer) this).fontMetrics.getKerning(i_105_, c, -646964881);
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
					int i_116_ = ((FontRenderer) this).fontMetrics.method6945(c, (byte) -20);
					if (2046271009 * anInt61 != -1)
						((FontRenderer) this).renderer.method8659(i, (int) ((double) (1200654985 * (((FontRenderer) this).fontMetrics.anInt4975)) * 0.7) + i_100_, i_116_, anInt61 * 2046271009, -645910355);
					if (-1 != anInt62 * 785139153)
						((FontRenderer) this).renderer.method8659(i, i_100_ + (((FontRenderer) this).fontMetrics.anInt4975 * 1200654985), i_116_, 785139153 * anInt62, -510924109);
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
			i_126_ = ((FontRenderer) this).fontMetrics.anInt4975 * 1200654985;
		int[] is_131_;
		if (i_121_ < (((FontRenderer) this).fontMetrics.anInt4979 * -1518951631 + 397683159 * ((FontRenderer) this).fontMetrics.anInt4978 + i_126_) && i_121_ < i_126_ + i_126_)
			is_131_ = null;
		else
			is_131_ = new int[] { i_120_ };
		int i_132_ = ((FontRenderer) this).fontMetrics.method6987(string, is_131_, aStringArray69, class160s, (byte) 0);
		if (i_127_ == -1) {
			i_127_ = i_121_ / i_126_;
			if (i_127_ <= 0)
				i_127_ = 1;
		}
		if (i_127_ > 0 && i_132_ >= i_127_) {
			aStringArray69[i_127_ - 1] = ((FontRenderer) this).fontMetrics.method6959((aStringArray69[i_127_ - 1]), i_120_, class160s, 1987203414);
			i_132_ = i_127_;
		}
		if (3 == i_125_ && 1 == i_132_)
			i_125_ = 1;
		int i_133_;
		if (0 == i_125_)
			i_133_ = ((FontRenderer) this).fontMetrics.anInt4978 * 397683159 + i_119_;
		else if (1 == i_125_)
			i_133_ = ((i_121_ - 397683159 * ((FontRenderer) this).fontMetrics.anInt4978 - ((FontRenderer) this).fontMetrics.anInt4979 * -1518951631 - i_126_ * (i_132_ - 1)) / 2 + (i_119_ + 397683159 * ((FontRenderer) this).fontMetrics.anInt4978));
		else if (2 == i_125_)
			i_133_ = (i_121_ + i_119_ - -1518951631 * ((FontRenderer) this).fontMetrics.anInt4979 - (i_132_ - 1) * i_126_);
		else {
			int i_134_ = ((i_121_ - 397683159 * ((FontRenderer) this).fontMetrics.anInt4978 - ((FontRenderer) this).fontMetrics.anInt4979 * -1518951631 - i_126_ * (i_132_ - 1)) / (1 + i_132_));
			if (i_134_ < 0)
				i_134_ = 0;
			i_133_ = (397683159 * ((FontRenderer) this).fontMetrics.anInt4978 + i_119_ + i_134_);
			i_126_ += i_134_;
		}
		for (int i_135_ = 0; i_135_ < i_132_; i_135_++) {
			if (i_124_ == 0)
				method371(aStringArray69[i_135_], i, i_133_, class160s, is, class455, i_128_, i_129_, (byte) 3);
			else if (1 == i_124_)
				method371(aStringArray69[i_135_], i + (i_120_ - (((FontRenderer) this).fontMetrics.getWidthNoSprites(aStringArray69[i_135_], -1967833701))) / 2, i_133_, class160s, is, class455, i_128_, i_129_, (byte) 3);
			else if (2 == i_124_)
				method371(aStringArray69[i_135_], i + i_120_ - (((FontRenderer) this).fontMetrics.getWidthNoSprites(aStringArray69[i_135_], -1967833701)), i_133_, class160s, is, class455, i_128_, i_129_, (byte) 3);
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

	public int method378(String string, int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, NativeSprite[] class160s, int[] is, Class455 class455, int i_161_, int i_162_, byte i_163_) {
		return method373(string, i, i_153_, i_154_, i_155_, i_156_, i_157_, i_158_, i_159_, i_160_, 0, class160s, is, class455, i_161_, i_162_, (byte) 0);
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
			method372(string, i - (((FontRenderer) this).fontMetrics.getWidthNoSprites(string, -1967833701) / 2), i_184_, null, null, null, is, 1742290741);
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
			method372(string, i - (((FontRenderer) this).fontMetrics.getWidthNoSprites(string, -1967833701) / 2), i_220_, null, null, null, is, 1737737512);
		}
	}

	FontRenderer(GraphicalRenderer class505, FontMetrics class414) {
		((FontRenderer) this).renderer = class505;
		((FontRenderer) this).fontMetrics = class414;
	}

	public static Class209 method400(Component component, boolean bool, byte i) {
		return new Class209_Sub1(component, bool);
	}

	static final void method401(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class199.method3251(class118, class527, 1310130121);
	}

	static void method402(int i) {
		Class179.anInt2230 = -2050700174 + (Class288.aClass414_3438.anInt4978 * 1838611167 + -810427415 * Class288.aClass414_3438.anInt4979);
		Class179.anInt2222 = 681447330 + (2090076551 * Class16.aClass414_139.anInt4978 + Class16.aClass414_139.anInt4979 * 74486273);
		Class13.aStringArray129 = new String[500];
		for (int i_331_ = 0; i_331_ < Class13.aStringArray129.length; i_331_++)
			Class13.aStringArray129[i_331_] = "";
		Class209.method3598(Message.DEVELOPER_CONSOLE_INTRO.translate(Class223.CURRENT_LANGUAGE, -1940277002), -1694092142);
	}

	static final void method403(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		class118.aBool1291 = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) == 1);
	}

	public static GraphicalRenderer method404(Canvas canvas, Interface22 interface22, int i, int i_332_, int i_333_) {
		return new ja(canvas, interface22, i, i_332_);
	}
}
