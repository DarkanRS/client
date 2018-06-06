
/* Class414 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class FontMetrics {
	public int anInt4975;
	byte[] characters;
	byte[][] kerning;
	public int anInt4978;
	public int anInt4979;
	static String[] aStringArray4980 = new String[100];

	public int getKerning(int i, char c, int i_9_) {
		if (((FontMetrics) this).kerning != null)
			return ((FontMetrics) this).kerning[i][c];
		return 0;
	}

	public int method6945(int i, byte i_10_) {
		return ((FontMetrics) this).characters[i] & 0xff;
	}

	public int getWidthNoSprites(String string, int i) {
		return getWidth(string, null);
	}

	public int getWidth(String string, Sprite[] spriteReference) {
		if (null == string)
			return 0;
		int i_11_ = -1;
		int i_12_ = -1;
		int i_13_ = 0;
		int i_14_ = string.length();
		for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
			char c = string.charAt(i_15_);
			if (c == 60)
				i_11_ = i_15_;
			else {
				if (c == 62 && -1 != i_11_) {
					String string_16_ = string.substring(1 + i_11_, i_15_);
					i_11_ = -1;
					if (string_16_.equals("lt"))
						c = '<';
					else if (string_16_.equals("gt"))
						c = '>';
					else if (string_16_.equals("nbsp"))
						c = '\u00a0';
					else if (string_16_.equals("shy"))
						c = '\u00ad';
					else if (string_16_.equals("times"))
						c = '\u00d7';
					else if (string_16_.equals("euro"))
						c = '\u20ac';
					else if (string_16_.equals("copy"))
						c = '\u00a9';
					else if (string_16_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_16_.startsWith("img=") && spriteReference != null) {
							try {
								int i_17_ = Class328.parseInt(string_16_.substring(4), -1917055488);
								i_13_ += spriteReference[i_17_].method228();
								i_12_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i_11_ == -1) {
					i_13_ += (((FontMetrics) this).characters[Class242.getByteForChar(c) & 0xff]) & 0xff;
					if (null != ((FontMetrics) this).kerning && i_12_ != -1)
						i_13_ += ((FontMetrics) this).kerning[i_12_][c];
					i_12_ = c;
				}
			}
		}
		return i_13_;
	}

	public int method6949(String string, int i, Sprite[] interface39s, int i_32_) {
		return method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
	}

	int method6950(String string, int[] is, String[] strings, Sprite[] interface39s, boolean bool, byte i) {
		if (null == string)
			return 0;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = -1;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = -1;
		int i_39_ = -1;
		int i_40_ = 0;
		int i_41_ = string.length();
		for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
			int i_43_ = Class242.getByteForChar(string.charAt(i_42_)) & 0xff;
			int i_44_ = 0;
			if (60 == i_43_)
				i_38_ = i_42_;
			else {
				int i_45_;
				if (i_38_ != -1) {
					if (62 != i_43_)
						continue;
					i_45_ = i_38_;
					String string_46_ = string.substring(1 + i_38_, i_42_);
					i_38_ = -1;
					if (string_46_.equals("br")) {
						strings[i_40_] = string.substring(i_34_, i_42_ + 1);
						if (++i_40_ >= strings.length)
							return 0;
						i_34_ = i_42_ + 1;
						i_33_ = 0;
						i_35_ = -1;
						i_39_ = -1;
						continue;
					}
					if (string_46_.equals("lt")) {
						i_44_ += method6945(60, (byte) -64);
						if (((FontMetrics) this).kerning != null && -1 != i_39_)
							i_44_ += (((FontMetrics) this).kerning[i_39_][60]);
						i_39_ = 60;
					} else if (string_46_.equals("gt")) {
						i_44_ += method6945(62, (byte) -127);
						if (null != ((FontMetrics) this).kerning && i_39_ != -1)
							i_44_ += (((FontMetrics) this).kerning[i_39_][62]);
						i_39_ = 62;
					} else if (string_46_.equals("nbsp")) {
						i_44_ += method6945(160, (byte) -89);
						if (((FontMetrics) this).kerning != null && i_39_ != -1)
							i_44_ += (((FontMetrics) this).kerning[i_39_][160]);
						i_39_ = 160;
					} else if (string_46_.equals("shy")) {
						i_44_ += method6945(173, (byte) -31);
						if (null != ((FontMetrics) this).kerning && -1 != i_39_)
							i_44_ += (((FontMetrics) this).kerning[i_39_][173]);
						i_39_ = 173;
					} else if (string_46_.equals("times")) {
						i_44_ += method6945(215, (byte) -119);
						if (null != ((FontMetrics) this).kerning && -1 != i_39_)
							i_44_ += (((FontMetrics) this).kerning[i_39_][215]);
						i_39_ = 215;
					} else if (string_46_.equals("euro")) {
						i_44_ += method6945(8364, (byte) -47);
						if (((FontMetrics) this).kerning != null && i_39_ != -1)
							i_44_ += (((FontMetrics) this).kerning[i_39_][8364]);
						i_39_ = 8364;
					} else if (string_46_.equals("copy")) {
						i_44_ += method6945(169, (byte) -65);
						if (null != ((FontMetrics) this).kerning && i_39_ != -1)
							i_44_ += (((FontMetrics) this).kerning[i_39_][169]);
						i_39_ = 169;
					} else if (string_46_.equals("reg")) {
						i_44_ += method6945(174, (byte) -116);
						if (null != ((FontMetrics) this).kerning && i_39_ != -1)
							i_44_ += (((FontMetrics) this).kerning[i_39_][174]);
						i_39_ = 174;
					} else if (string_46_.startsWith("img=") && null != interface39s) {
						try {
							int i_47_ = Class328.parseInt(string_46_.substring(4), 1021279650);
							i_44_ += interface39s[i_47_].method228();
							i_39_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_43_ = -1;
				} else {
					i_45_ = i_42_;
					i_44_ += method6945(i_43_, (byte) -58);
					if (null != ((FontMetrics) this).kerning && i_39_ != -1)
						i_44_ += (((FontMetrics) this).kerning[i_39_][i_43_]);
					i_39_ = i_43_;
				}
				if (i_44_ > 0) {
					i_33_ += i_44_;
					if (null != is) {
						if (i_43_ == 32) {
							i_35_ = i_42_;
							i_36_ = i_33_;
							i_37_ = bool ? 1 : 0;
						}
						if (i_33_ > is[i_40_ < is.length ? i_40_ : is.length - 1]) {
							if (i_35_ >= 0) {
								strings[i_40_] = string.substring(i_34_, 1 + i_35_ - i_37_);
								if (++i_40_ >= strings.length)
									return 0;
								i_34_ = i_35_ + 1;
								i_35_ = -1;
								i_33_ -= i_36_;
								i_39_ = -1;
							} else {
								strings[i_40_] = string.substring(i_34_, i_45_);
								if (++i_40_ >= strings.length)
									return 0;
								i_34_ = i_45_;
								i_35_ = -1;
								i_33_ = i_44_;
								i_39_ = -1;
							}
						}
						if (i_43_ == 45) {
							i_35_ = i_42_;
							i_36_ = i_33_;
							i_37_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_34_) {
			strings[i_40_] = string.substring(i_34_, string.length());
			i_40_++;
		}
		return i_40_;
	}

	public int method6951(String string, int i, Sprite[] interface39s, byte i_48_) {
		int i_49_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_50_ = 0;
		for (int i_51_ = 0; i_51_ < i_49_; i_51_++) {
			int i_52_ = getWidth(aStringArray4980[i_51_], interface39s);
			if (i_52_ > i_50_)
				i_50_ = i_52_;
		}
		return i_50_;
	}

	public Point method6954(String string, int i, int i_71_, int i_72_, Sprite[] interface39s, int i_73_) {
		if (i_72_ <= 0)
			return new Point(0, 397683159 * anInt4978 + i_71_);
		if (i_72_ > string.length())
			i_72_ = string.length();
		if (0 == i_71_)
			i_71_ = 1200654985 * anInt4975;
		int i_74_ = method6950(string, new int[] { i }, aStringArray4980, interface39s, false, (byte) -85);
		int i_75_ = 0;
		for (int i_76_ = 0; i_76_ < i_74_; i_76_++) {
			int i_77_ = aStringArray4980[i_76_].length();
			if (i_77_ + i_75_ > i_72_ || i_76_ == i_74_ - 1 && i_72_ == string.length()) {
				String string_78_ = string.substring(i_75_, i_72_);
				if (string_78_.endsWith("<br>")) {
					string_78_ = "";
					i_75_ += i_77_;
					i_76_++;
				}
				int i_79_ = getWidth(string_78_, interface39s);
				int i_80_ = 397683159 * anInt4978 + i_71_ * i_76_;
				return new Point(i_79_, i_80_);
			}
			i_75_ += i_77_;
		}
		return null;
	}

	public int method6956(String string, int i, int i_95_, int i_96_, int i_97_, Sprite[] interface39s, int i_98_) {
		if (0 == i_95_)
			i_95_ = anInt4975 * 1200654985;
		int i_99_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		if (i_99_ == 0)
			return 0;
		if (i_97_ < 0)
			i_97_ = 0;
		i_97_ /= i_95_;
		if (i_97_ >= i_99_)
			i_97_ = i_99_ - 1;
		String string_100_ = aStringArray4980[i_97_];
		int i_101_ = 0;
		int i_102_ = 0;
		int i_103_;
		for (i_103_ = 0; i_103_ < i_96_ && i_101_ < string_100_.length(); i_103_ = getWidth(string_100_.substring(0, ++i_101_), interface39s))
			i_102_ = i_103_;
		if (i_101_ == string_100_.length() && string_100_.endsWith("<br>"))
			i_101_ -= 4;
		if (i_96_ - i_102_ < i_103_ - i_96_)
			i_101_--;
		for (int i_104_ = 0; i_104_ < i_97_; i_104_++)
			i_101_ += aStringArray4980[i_104_].length();
		return i_101_;
	}

	FontMetrics(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i = class282_sub35.readUnsignedByte();
		if (0 != i)
			throw new RuntimeException("");
		boolean bool = class282_sub35.readUnsignedByte() == 1;
		((FontMetrics) this).characters = new byte[256];
		class282_sub35.readBytes(((FontMetrics) this).characters, 0, 256, 1533977369);
		if (bool) {
			int[] is_105_ = new int[256];
			int[] is_106_ = new int[256];
			for (int i_107_ = 0; i_107_ < 256; i_107_++)
				is_105_[i_107_] = class282_sub35.readUnsignedByte();
			for (int i_108_ = 0; i_108_ < 256; i_108_++)
				is_106_[i_108_] = class282_sub35.readUnsignedByte();
			byte[][] is_109_ = new byte[256][];
			for (int i_110_ = 0; i_110_ < 256; i_110_++) {
				is_109_[i_110_] = new byte[is_105_[i_110_]];
				byte i_111_ = 0;
				for (int i_112_ = 0; i_112_ < is_109_[i_110_].length; i_112_++) {
					i_111_ += class282_sub35.readByte((short) -6571);
					is_109_[i_110_][i_112_] = i_111_;
				}
			}
			byte[][] is_113_ = new byte[256][];
			for (int i_114_ = 0; i_114_ < 256; i_114_++) {
				is_113_[i_114_] = new byte[is_105_[i_114_]];
				byte i_115_ = 0;
				for (int i_116_ = 0; i_116_ < is_113_[i_114_].length; i_116_++) {
					i_115_ += class282_sub35.readByte((short) -26376);
					is_113_[i_114_][i_116_] = i_115_;
				}
			}
			((FontMetrics) this).kerning = new byte[256][256];
			for (int i_117_ = 0; i_117_ < 256; i_117_++) {
				if (i_117_ != 32 && i_117_ != 160) {
					for (int i_118_ = 0; i_118_ < 256; i_118_++) {
						if (i_118_ != 32 && 160 != i_118_)
							((FontMetrics) this).kerning[i_117_][i_118_] = (byte) Class254.method4380(is_109_, is_113_, is_106_, (((FontMetrics) this).characters), is_105_, i_117_, i_118_, 6313355);
					}
				}
			}
			anInt4975 = (is_106_[32] + is_105_[32]) * -136836167;
		} else
			anInt4975 = class282_sub35.readUnsignedByte() * -136836167;
		class282_sub35.readUnsignedByte();
		class282_sub35.readUnsignedByte();
		anInt4978 = class282_sub35.readUnsignedByte() * -102639129;
		anInt4979 = class282_sub35.readUnsignedByte() * 552457681;
	}

	public String method6959(String string, int i, Sprite[] chatIcons, int i_119_) {
		if (getWidth(string, chatIcons) <= i)
			return string;
		i -= getWidth("...", null);
		int i_120_ = -1;
		int i_121_ = -1;
		int i_122_ = 0;
		int i_123_ = string.length();
		String string_124_ = "";
		for (int i_125_ = 0; i_125_ < i_123_; i_125_++) {
			char c = string.charAt(i_125_);
			if (c == 60)
				i_120_ = i_125_;
			else {
				if (62 == c && i_120_ != -1) {
					String string_126_ = string.substring(1 + i_120_, i_125_);
					i_120_ = -1;
					if (string_126_.equals("lt"))
						c = '<';
					else if (string_126_.equals("gt"))
						c = '>';
					else if (string_126_.equals("nbsp"))
						c = '\u00a0';
					else if (string_126_.equals("shy"))
						c = '\u00ad';
					else if (string_126_.equals("times"))
						c = '\u00d7';
					else if (string_126_.equals("euro"))
						c = '\u20ac';
					else if (string_126_.equals("copy"))
						c = '\u00a9';
					else if (string_126_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_126_.startsWith("img=") && null != chatIcons) {
							try {
								int i_127_ = Class328.parseInt(string_126_.substring(4), -1907592148);
								i_122_ += chatIcons[i_127_].method228();
								i_121_ = -1;
								if (i_122_ > i)
									return new StringBuilder().append(string_124_).append("...").toString();
								string_124_ = string.substring(0, i_125_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_120_) {
					i_122_ += (((FontMetrics) this).characters[Class242.getByteForChar(c) & 0xff]) & 0xff;
					if (((FontMetrics) this).kerning != null && -1 != i_121_)
						i_122_ += (((FontMetrics) this).kerning[i_121_][c]);
					i_121_ = c;
					int i_128_ = i_122_;
					if (null != ((FontMetrics) this).kerning)
						i_128_ += ((FontMetrics) this).kerning[c][46];
					if (i_128_ > i)
						return new StringBuilder().append(string_124_).append("...").toString();
					string_124_ = string.substring(0, 1 + i_125_);
				}
			}
		}
		return string;
	}

	public int method6972(String string, int i, int i_180_, Sprite[] interface39s, int i_181_) {
		if (i_180_ == 0)
			i_180_ = anInt4975 * 1200654985;
		int i_182_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_183_ = i_180_ * (i_182_ - 1);
		return anInt4979 * -1518951631 + (i_183_ + anInt4978 * 397683159);
	}

	public int method6987(String string, int[] is, String[] strings, Sprite[] interface39s, byte i) {
		return method6950(string, is, strings, interface39s, true, (byte) -40);
	}

	static final void method6989(int i) {
		client.anInt7231 = 593633913;
		client.anInt7341 = -1766566601;
		NativeLibraryLoader.anIntArrayArray3239 = null;
		Class276.aClass282_Sub35_3346 = null;
		Class79.method1390(1755874378);
	}
}
