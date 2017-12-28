
/* Class414 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class414 {
	public int anInt4975;
	byte[] aByteArray4976;
	byte[][] aByteArrayArray4977;
	public int anInt4978;
	public int anInt4979;
	static String[] aStringArray4980 = new String[100];

	public Point method6943(String string, int i, int i_0_, int i_1_, Interface39[] interface39s) {
		if (i_1_ <= 0)
			return new Point(0, 397683159 * anInt4978 + i_0_);
		if (i_1_ > string.length())
			i_1_ = string.length();
		if (0 == i_0_)
			i_0_ = 1200654985 * anInt4975;
		int i_2_ = method6950(string, new int[] { i }, aStringArray4980, interface39s, false, (byte) -126);
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
			int i_5_ = aStringArray4980[i_4_].length();
			if (i_5_ + i_3_ > i_1_ || i_4_ == i_2_ - 1 && i_1_ == string.length()) {
				String string_6_ = string.substring(i_3_, i_1_);
				if (string_6_.endsWith("<br>")) {
					string_6_ = "";
					i_3_ += i_5_;
					i_4_++;
				}
				int i_7_ = method6947(string_6_, interface39s, 26446175);
				int i_8_ = 397683159 * anInt4978 + i_0_ * i_4_;
				return new Point(i_7_, i_8_);
			}
			i_3_ += i_5_;
		}
		return null;
	}

	public int method6944(int i, char c, int i_9_) {
		if (((Class414) this).aByteArrayArray4977 != null)
			return ((Class414) this).aByteArrayArray4977[i][c];
		return 0;
	}

	public int method6945(int i, byte i_10_) {
		return ((Class414) this).aByteArray4976[i] & 0xff;
	}

	public int method6946(String string, int i) {
		return method6947(string, null, 1672029525);
	}

	public int method6947(String string, Interface39[] interface39s, int i) {
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
						if (string_16_.startsWith("img=") && interface39s != null) {
							try {
								int i_17_ = Class328.method5830(string_16_.substring(4), -1917055488);
								i_13_ += interface39s[i_17_].method228();
								i_12_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i_11_ == -1) {
					i_13_ += (((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 20) & 0xff]) & 0xff;
					if (null != ((Class414) this).aByteArrayArray4977 && i_12_ != -1)
						i_13_ += ((Class414) this).aByteArrayArray4977[i_12_][c];
					i_12_ = c;
				}
			}
		}
		return i_13_;
	}

	int method6948(String string, int[] is, String[] strings, Interface39[] interface39s, boolean bool) {
		if (null == string)
			return 0;
		int i = 0;
		int i_18_ = 0;
		int i_19_ = -1;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = -1;
		int i_23_ = -1;
		int i_24_ = 0;
		int i_25_ = string.length();
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			int i_27_ = Class242.method4163(string.charAt(i_26_), (byte) 106) & 0xff;
			int i_28_ = 0;
			if (60 == i_27_)
				i_22_ = i_26_;
			else {
				int i_29_;
				if (i_22_ != -1) {
					if (62 != i_27_)
						continue;
					i_29_ = i_22_;
					String string_30_ = string.substring(1 + i_22_, i_26_);
					i_22_ = -1;
					if (string_30_.equals("br")) {
						strings[i_24_] = string.substring(i_18_, i_26_ + 1);
						if (++i_24_ >= strings.length)
							return 0;
						i_18_ = i_26_ + 1;
						i = 0;
						i_19_ = -1;
						i_23_ = -1;
						continue;
					}
					if (string_30_.equals("lt")) {
						i_28_ += method6945(60, (byte) -56);
						if (((Class414) this).aByteArrayArray4977 != null && -1 != i_23_)
							i_28_ += (((Class414) this).aByteArrayArray4977[i_23_][60]);
						i_23_ = 60;
					} else if (string_30_.equals("gt")) {
						i_28_ += method6945(62, (byte) -92);
						if (null != ((Class414) this).aByteArrayArray4977 && i_23_ != -1)
							i_28_ += (((Class414) this).aByteArrayArray4977[i_23_][62]);
						i_23_ = 62;
					} else if (string_30_.equals("nbsp")) {
						i_28_ += method6945(160, (byte) -62);
						if (((Class414) this).aByteArrayArray4977 != null && i_23_ != -1)
							i_28_ += (((Class414) this).aByteArrayArray4977[i_23_][160]);
						i_23_ = 160;
					} else if (string_30_.equals("shy")) {
						i_28_ += method6945(173, (byte) -70);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_23_)
							i_28_ += (((Class414) this).aByteArrayArray4977[i_23_][173]);
						i_23_ = 173;
					} else if (string_30_.equals("times")) {
						i_28_ += method6945(215, (byte) -127);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_23_)
							i_28_ += (((Class414) this).aByteArrayArray4977[i_23_][215]);
						i_23_ = 215;
					} else if (string_30_.equals("euro")) {
						i_28_ += method6945(8364, (byte) -84);
						if (((Class414) this).aByteArrayArray4977 != null && i_23_ != -1)
							i_28_ += (((Class414) this).aByteArrayArray4977[i_23_][8364]);
						i_23_ = 8364;
					} else if (string_30_.equals("copy")) {
						i_28_ += method6945(169, (byte) -126);
						if (null != ((Class414) this).aByteArrayArray4977 && i_23_ != -1)
							i_28_ += (((Class414) this).aByteArrayArray4977[i_23_][169]);
						i_23_ = 169;
					} else if (string_30_.equals("reg")) {
						i_28_ += method6945(174, (byte) -100);
						if (null != ((Class414) this).aByteArrayArray4977 && i_23_ != -1)
							i_28_ += (((Class414) this).aByteArrayArray4977[i_23_][174]);
						i_23_ = 174;
					} else if (string_30_.startsWith("img=") && null != interface39s) {
						try {
							int i_31_ = Class328.method5830(string_30_.substring(4), 982779004);
							i_28_ += interface39s[i_31_].method228();
							i_23_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_27_ = -1;
				} else {
					i_29_ = i_26_;
					i_28_ += method6945(i_27_, (byte) -62);
					if (null != ((Class414) this).aByteArrayArray4977 && i_23_ != -1)
						i_28_ += (((Class414) this).aByteArrayArray4977[i_23_][i_27_]);
					i_23_ = i_27_;
				}
				if (i_28_ > 0) {
					i += i_28_;
					if (null != is) {
						if (i_27_ == 32) {
							i_19_ = i_26_;
							i_20_ = i;
							i_21_ = bool ? 1 : 0;
						}
						if (i > is[i_24_ < is.length ? i_24_ : is.length - 1]) {
							if (i_19_ >= 0) {
								strings[i_24_] = string.substring(i_18_, 1 + i_19_ - i_21_);
								if (++i_24_ >= strings.length)
									return 0;
								i_18_ = i_19_ + 1;
								i_19_ = -1;
								i -= i_20_;
								i_23_ = -1;
							} else {
								strings[i_24_] = string.substring(i_18_, i_29_);
								if (++i_24_ >= strings.length)
									return 0;
								i_18_ = i_29_;
								i_19_ = -1;
								i = i_28_;
								i_23_ = -1;
							}
						}
						if (i_27_ == 45) {
							i_19_ = i_26_;
							i_20_ = i;
							i_21_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_18_) {
			strings[i_24_] = string.substring(i_18_, string.length());
			i_24_++;
		}
		return i_24_;
	}

	public int method6949(String string, int i, Interface39[] interface39s, int i_32_) {
		return method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
	}

	int method6950(String string, int[] is, String[] strings, Interface39[] interface39s, boolean bool, byte i) {
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
			int i_43_ = Class242.method4163(string.charAt(i_42_), (byte) 125) & 0xff;
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
						if (((Class414) this).aByteArrayArray4977 != null && -1 != i_39_)
							i_44_ += (((Class414) this).aByteArrayArray4977[i_39_][60]);
						i_39_ = 60;
					} else if (string_46_.equals("gt")) {
						i_44_ += method6945(62, (byte) -127);
						if (null != ((Class414) this).aByteArrayArray4977 && i_39_ != -1)
							i_44_ += (((Class414) this).aByteArrayArray4977[i_39_][62]);
						i_39_ = 62;
					} else if (string_46_.equals("nbsp")) {
						i_44_ += method6945(160, (byte) -89);
						if (((Class414) this).aByteArrayArray4977 != null && i_39_ != -1)
							i_44_ += (((Class414) this).aByteArrayArray4977[i_39_][160]);
						i_39_ = 160;
					} else if (string_46_.equals("shy")) {
						i_44_ += method6945(173, (byte) -31);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_39_)
							i_44_ += (((Class414) this).aByteArrayArray4977[i_39_][173]);
						i_39_ = 173;
					} else if (string_46_.equals("times")) {
						i_44_ += method6945(215, (byte) -119);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_39_)
							i_44_ += (((Class414) this).aByteArrayArray4977[i_39_][215]);
						i_39_ = 215;
					} else if (string_46_.equals("euro")) {
						i_44_ += method6945(8364, (byte) -47);
						if (((Class414) this).aByteArrayArray4977 != null && i_39_ != -1)
							i_44_ += (((Class414) this).aByteArrayArray4977[i_39_][8364]);
						i_39_ = 8364;
					} else if (string_46_.equals("copy")) {
						i_44_ += method6945(169, (byte) -65);
						if (null != ((Class414) this).aByteArrayArray4977 && i_39_ != -1)
							i_44_ += (((Class414) this).aByteArrayArray4977[i_39_][169]);
						i_39_ = 169;
					} else if (string_46_.equals("reg")) {
						i_44_ += method6945(174, (byte) -116);
						if (null != ((Class414) this).aByteArrayArray4977 && i_39_ != -1)
							i_44_ += (((Class414) this).aByteArrayArray4977[i_39_][174]);
						i_39_ = 174;
					} else if (string_46_.startsWith("img=") && null != interface39s) {
						try {
							int i_47_ = Class328.method5830(string_46_.substring(4), 1021279650);
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
					if (null != ((Class414) this).aByteArrayArray4977 && i_39_ != -1)
						i_44_ += (((Class414) this).aByteArrayArray4977[i_39_][i_43_]);
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

	public int method6951(String string, int i, Interface39[] interface39s, byte i_48_) {
		int i_49_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_50_ = 0;
		for (int i_51_ = 0; i_51_ < i_49_; i_51_++) {
			int i_52_ = method6947(aStringArray4980[i_51_], interface39s, 93148558);
			if (i_52_ > i_50_)
				i_50_ = i_52_;
		}
		return i_50_;
	}

	public String method6952(String string, int i, Interface39[] interface39s) {
		if (method6947(string, interface39s, 1090367045) <= i)
			return string;
		i -= method6947("...", null, 1680554252);
		int i_53_ = -1;
		int i_54_ = -1;
		int i_55_ = 0;
		int i_56_ = string.length();
		String string_57_ = "";
		for (int i_58_ = 0; i_58_ < i_56_; i_58_++) {
			char c = string.charAt(i_58_);
			if (c == 60)
				i_53_ = i_58_;
			else {
				if (62 == c && i_53_ != -1) {
					String string_59_ = string.substring(1 + i_53_, i_58_);
					i_53_ = -1;
					if (string_59_.equals("lt"))
						c = '<';
					else if (string_59_.equals("gt"))
						c = '>';
					else if (string_59_.equals("nbsp"))
						c = '\u00a0';
					else if (string_59_.equals("shy"))
						c = '\u00ad';
					else if (string_59_.equals("times"))
						c = '\u00d7';
					else if (string_59_.equals("euro"))
						c = '\u20ac';
					else if (string_59_.equals("copy"))
						c = '\u00a9';
					else if (string_59_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_59_.startsWith("img=") && null != interface39s) {
							try {
								int i_60_ = Class328.method5830(string_59_.substring(4), -407647980);
								i_55_ += interface39s[i_60_].method228();
								i_54_ = -1;
								if (i_55_ > i)
									return new StringBuilder().append(string_57_).append("...").toString();
								string_57_ = string.substring(0, i_58_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_53_) {
					i_55_ += ((((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 109) & 0xff]) & 0xff);
					if (((Class414) this).aByteArrayArray4977 != null && -1 != i_54_)
						i_55_ += ((Class414) this).aByteArrayArray4977[i_54_][c];
					i_54_ = c;
					int i_61_ = i_55_;
					if (null != ((Class414) this).aByteArrayArray4977)
						i_61_ += ((Class414) this).aByteArrayArray4977[c][46];
					if (i_61_ > i)
						return new StringBuilder().append(string_57_).append("...").toString();
					string_57_ = string.substring(0, 1 + i_58_);
				}
			}
		}
		return string;
	}

	public String method6953(String string, int i, Interface39[] interface39s) {
		if (method6947(string, interface39s, -1407591094) <= i)
			return string;
		i -= method6947("...", null, -49590871);
		int i_62_ = -1;
		int i_63_ = -1;
		int i_64_ = 0;
		int i_65_ = string.length();
		String string_66_ = "";
		for (int i_67_ = 0; i_67_ < i_65_; i_67_++) {
			char c = string.charAt(i_67_);
			if (c == 60)
				i_62_ = i_67_;
			else {
				if (62 == c && i_62_ != -1) {
					String string_68_ = string.substring(1 + i_62_, i_67_);
					i_62_ = -1;
					if (string_68_.equals("lt"))
						c = '<';
					else if (string_68_.equals("gt"))
						c = '>';
					else if (string_68_.equals("nbsp"))
						c = '\u00a0';
					else if (string_68_.equals("shy"))
						c = '\u00ad';
					else if (string_68_.equals("times"))
						c = '\u00d7';
					else if (string_68_.equals("euro"))
						c = '\u20ac';
					else if (string_68_.equals("copy"))
						c = '\u00a9';
					else if (string_68_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_68_.startsWith("img=") && null != interface39s) {
							try {
								int i_69_ = Class328.method5830(string_68_.substring(4), -1887384911);
								i_64_ += interface39s[i_69_].method228();
								i_63_ = -1;
								if (i_64_ > i)
									return new StringBuilder().append(string_66_).append("...").toString();
								string_66_ = string.substring(0, i_67_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_62_) {
					i_64_ += (((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 78) & 0xff]) & 0xff;
					if (((Class414) this).aByteArrayArray4977 != null && -1 != i_63_)
						i_64_ += ((Class414) this).aByteArrayArray4977[i_63_][c];
					i_63_ = c;
					int i_70_ = i_64_;
					if (null != ((Class414) this).aByteArrayArray4977)
						i_70_ += ((Class414) this).aByteArrayArray4977[c][46];
					if (i_70_ > i)
						return new StringBuilder().append(string_66_).append("...").toString();
					string_66_ = string.substring(0, 1 + i_67_);
				}
			}
		}
		return string;
	}

	public Point method6954(String string, int i, int i_71_, int i_72_, Interface39[] interface39s, int i_73_) {
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
				int i_79_ = method6947(string_78_, interface39s, -1196475206);
				int i_80_ = 397683159 * anInt4978 + i_71_ * i_76_;
				return new Point(i_79_, i_80_);
			}
			i_75_ += i_77_;
		}
		return null;
	}

	int method6955(String string, int[] is, String[] strings, Interface39[] interface39s, boolean bool) {
		if (null == string)
			return 0;
		int i = 0;
		int i_81_ = 0;
		int i_82_ = -1;
		int i_83_ = 0;
		int i_84_ = 0;
		int i_85_ = -1;
		int i_86_ = -1;
		int i_87_ = 0;
		int i_88_ = string.length();
		for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
			int i_90_ = Class242.method4163(string.charAt(i_89_), (byte) 1) & 0xff;
			int i_91_ = 0;
			if (60 == i_90_)
				i_85_ = i_89_;
			else {
				int i_92_;
				if (i_85_ != -1) {
					if (62 != i_90_)
						continue;
					i_92_ = i_85_;
					String string_93_ = string.substring(1 + i_85_, i_89_);
					i_85_ = -1;
					if (string_93_.equals("br")) {
						strings[i_87_] = string.substring(i_81_, i_89_ + 1);
						if (++i_87_ >= strings.length)
							return 0;
						i_81_ = i_89_ + 1;
						i = 0;
						i_82_ = -1;
						i_86_ = -1;
						continue;
					}
					if (string_93_.equals("lt")) {
						i_91_ += method6945(60, (byte) -15);
						if (((Class414) this).aByteArrayArray4977 != null && -1 != i_86_)
							i_91_ += (((Class414) this).aByteArrayArray4977[i_86_][60]);
						i_86_ = 60;
					} else if (string_93_.equals("gt")) {
						i_91_ += method6945(62, (byte) -21);
						if (null != ((Class414) this).aByteArrayArray4977 && i_86_ != -1)
							i_91_ += (((Class414) this).aByteArrayArray4977[i_86_][62]);
						i_86_ = 62;
					} else if (string_93_.equals("nbsp")) {
						i_91_ += method6945(160, (byte) -10);
						if (((Class414) this).aByteArrayArray4977 != null && i_86_ != -1)
							i_91_ += (((Class414) this).aByteArrayArray4977[i_86_][160]);
						i_86_ = 160;
					} else if (string_93_.equals("shy")) {
						i_91_ += method6945(173, (byte) -115);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_86_)
							i_91_ += (((Class414) this).aByteArrayArray4977[i_86_][173]);
						i_86_ = 173;
					} else if (string_93_.equals("times")) {
						i_91_ += method6945(215, (byte) -51);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_86_)
							i_91_ += (((Class414) this).aByteArrayArray4977[i_86_][215]);
						i_86_ = 215;
					} else if (string_93_.equals("euro")) {
						i_91_ += method6945(8364, (byte) -73);
						if (((Class414) this).aByteArrayArray4977 != null && i_86_ != -1)
							i_91_ += (((Class414) this).aByteArrayArray4977[i_86_][8364]);
						i_86_ = 8364;
					} else if (string_93_.equals("copy")) {
						i_91_ += method6945(169, (byte) -31);
						if (null != ((Class414) this).aByteArrayArray4977 && i_86_ != -1)
							i_91_ += (((Class414) this).aByteArrayArray4977[i_86_][169]);
						i_86_ = 169;
					} else if (string_93_.equals("reg")) {
						i_91_ += method6945(174, (byte) -113);
						if (null != ((Class414) this).aByteArrayArray4977 && i_86_ != -1)
							i_91_ += (((Class414) this).aByteArrayArray4977[i_86_][174]);
						i_86_ = 174;
					} else if (string_93_.startsWith("img=") && null != interface39s) {
						try {
							int i_94_ = Class328.method5830(string_93_.substring(4), -669847282);
							i_91_ += interface39s[i_94_].method228();
							i_86_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_90_ = -1;
				} else {
					i_92_ = i_89_;
					i_91_ += method6945(i_90_, (byte) -128);
					if (null != ((Class414) this).aByteArrayArray4977 && i_86_ != -1)
						i_91_ += (((Class414) this).aByteArrayArray4977[i_86_][i_90_]);
					i_86_ = i_90_;
				}
				if (i_91_ > 0) {
					i += i_91_;
					if (null != is) {
						if (i_90_ == 32) {
							i_82_ = i_89_;
							i_83_ = i;
							i_84_ = bool ? 1 : 0;
						}
						if (i > is[i_87_ < is.length ? i_87_ : is.length - 1]) {
							if (i_82_ >= 0) {
								strings[i_87_] = string.substring(i_81_, 1 + i_82_ - i_84_);
								if (++i_87_ >= strings.length)
									return 0;
								i_81_ = i_82_ + 1;
								i_82_ = -1;
								i -= i_83_;
								i_86_ = -1;
							} else {
								strings[i_87_] = string.substring(i_81_, i_92_);
								if (++i_87_ >= strings.length)
									return 0;
								i_81_ = i_92_;
								i_82_ = -1;
								i = i_91_;
								i_86_ = -1;
							}
						}
						if (i_90_ == 45) {
							i_82_ = i_89_;
							i_83_ = i;
							i_84_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_81_) {
			strings[i_87_] = string.substring(i_81_, string.length());
			i_87_++;
		}
		return i_87_;
	}

	public int method6956(String string, int i, int i_95_, int i_96_, int i_97_, Interface39[] interface39s, int i_98_) {
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
		for (i_103_ = 0; i_103_ < i_96_ && i_101_ < string_100_.length(); i_103_ = method6947(string_100_.substring(0, ++i_101_), interface39s, 1693405846))
			i_102_ = i_103_;
		if (i_101_ == string_100_.length() && string_100_.endsWith("<br>"))
			i_101_ -= 4;
		if (i_96_ - i_102_ < i_103_ - i_96_)
			i_101_--;
		for (int i_104_ = 0; i_104_ < i_97_; i_104_++)
			i_101_ += aStringArray4980[i_104_].length();
		return i_101_;
	}

	public static Class414 method6957(Class317 class317, int i) {
		byte[] is = class317.method5615(i, -1802173950);
		if (is == null)
			return null;
		return new Class414(is);
	}

	Class414(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i = class282_sub35.readUnsignedByte();
		if (0 != i)
			throw new RuntimeException("");
		boolean bool = class282_sub35.readUnsignedByte() == 1;
		((Class414) this).aByteArray4976 = new byte[256];
		class282_sub35.readBytes(((Class414) this).aByteArray4976, 0, 256, 1533977369);
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
			((Class414) this).aByteArrayArray4977 = new byte[256][256];
			for (int i_117_ = 0; i_117_ < 256; i_117_++) {
				if (i_117_ != 32 && i_117_ != 160) {
					for (int i_118_ = 0; i_118_ < 256; i_118_++) {
						if (i_118_ != 32 && 160 != i_118_)
							((Class414) this).aByteArrayArray4977[i_117_][i_118_] = (byte) Class254.method4380(is_109_, is_113_, is_106_, (((Class414) this).aByteArray4976), is_105_, i_117_, i_118_, 6313355);
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

	public int method6958(int i) {
		return ((Class414) this).aByteArray4976[i] & 0xff;
	}

	public String method6959(String string, int i, Interface39[] interface39s, int i_119_) {
		if (method6947(string, interface39s, 796603823) <= i)
			return string;
		i -= method6947("...", null, 1403593092);
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
						if (string_126_.startsWith("img=") && null != interface39s) {
							try {
								int i_127_ = Class328.method5830(string_126_.substring(4), -1907592148);
								i_122_ += interface39s[i_127_].method228();
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
					i_122_ += (((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 18) & 0xff]) & 0xff;
					if (((Class414) this).aByteArrayArray4977 != null && -1 != i_121_)
						i_122_ += (((Class414) this).aByteArrayArray4977[i_121_][c]);
					i_121_ = c;
					int i_128_ = i_122_;
					if (null != ((Class414) this).aByteArrayArray4977)
						i_128_ += ((Class414) this).aByteArrayArray4977[c][46];
					if (i_128_ > i)
						return new StringBuilder().append(string_124_).append("...").toString();
					string_124_ = string.substring(0, 1 + i_125_);
				}
			}
		}
		return string;
	}

	public int method6960(String string) {
		return method6947(string, null, -709710645);
	}

	public int method6961(String string, int i, int i_129_, Interface39[] interface39s) {
		if (i_129_ == 0)
			i_129_ = anInt4975 * 1200654985;
		int i_130_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_131_ = i_129_ * (i_130_ - 1);
		return anInt4979 * -1518951631 + (i_131_ + anInt4978 * 397683159);
	}

	public int method6962(String string, Interface39[] interface39s) {
		if (null == string)
			return 0;
		int i = -1;
		int i_132_ = -1;
		int i_133_ = 0;
		int i_134_ = string.length();
		for (int i_135_ = 0; i_135_ < i_134_; i_135_++) {
			char c = string.charAt(i_135_);
			if (c == 60)
				i = i_135_;
			else {
				if (c == 62 && -1 != i) {
					String string_136_ = string.substring(1 + i, i_135_);
					i = -1;
					if (string_136_.equals("lt"))
						c = '<';
					else if (string_136_.equals("gt"))
						c = '>';
					else if (string_136_.equals("nbsp"))
						c = '\u00a0';
					else if (string_136_.equals("shy"))
						c = '\u00ad';
					else if (string_136_.equals("times"))
						c = '\u00d7';
					else if (string_136_.equals("euro"))
						c = '\u20ac';
					else if (string_136_.equals("copy"))
						c = '\u00a9';
					else if (string_136_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_136_.startsWith("img=") && interface39s != null) {
							try {
								int i_137_ = Class328.method5830(string_136_.substring(4), 585286380);
								i_133_ += interface39s[i_137_].method228();
								i_132_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					i_133_ += (((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 24) & 0xff]) & 0xff;
					if (null != ((Class414) this).aByteArrayArray4977 && i_132_ != -1)
						i_133_ += (((Class414) this).aByteArrayArray4977[i_132_][c]);
					i_132_ = c;
				}
			}
		}
		return i_133_;
	}

	public static Class414 method6963(Class317 class317, int i, int i_138_) {
		byte[] is = class317.method5607(i, i_138_, -2022363698);
		if (is == null)
			return null;
		return new Class414(is);
	}

	public String method6964(String string, int i, Interface39[] interface39s) {
		if (method6947(string, interface39s, 2042478895) <= i)
			return string;
		i -= method6947("...", null, 1140902033);
		int i_139_ = -1;
		int i_140_ = -1;
		int i_141_ = 0;
		int i_142_ = string.length();
		String string_143_ = "";
		for (int i_144_ = 0; i_144_ < i_142_; i_144_++) {
			char c = string.charAt(i_144_);
			if (c == 60)
				i_139_ = i_144_;
			else {
				if (62 == c && i_139_ != -1) {
					String string_145_ = string.substring(1 + i_139_, i_144_);
					i_139_ = -1;
					if (string_145_.equals("lt"))
						c = '<';
					else if (string_145_.equals("gt"))
						c = '>';
					else if (string_145_.equals("nbsp"))
						c = '\u00a0';
					else if (string_145_.equals("shy"))
						c = '\u00ad';
					else if (string_145_.equals("times"))
						c = '\u00d7';
					else if (string_145_.equals("euro"))
						c = '\u20ac';
					else if (string_145_.equals("copy"))
						c = '\u00a9';
					else if (string_145_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_145_.startsWith("img=") && null != interface39s) {
							try {
								int i_146_ = Class328.method5830(string_145_.substring(4), -1093825227);
								i_141_ += interface39s[i_146_].method228();
								i_140_ = -1;
								if (i_141_ > i)
									return new StringBuilder().append(string_143_).append("...").toString();
								string_143_ = string.substring(0, i_144_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_139_) {
					i_141_ += (((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 98) & 0xff]) & 0xff;
					if (((Class414) this).aByteArrayArray4977 != null && -1 != i_140_)
						i_141_ += (((Class414) this).aByteArrayArray4977[i_140_][c]);
					i_140_ = c;
					int i_147_ = i_141_;
					if (null != ((Class414) this).aByteArrayArray4977)
						i_147_ += ((Class414) this).aByteArrayArray4977[c][46];
					if (i_147_ > i)
						return new StringBuilder().append(string_143_).append("...").toString();
					string_143_ = string.substring(0, 1 + i_144_);
				}
			}
		}
		return string;
	}

	public int method6965(int i) {
		return ((Class414) this).aByteArray4976[i] & 0xff;
	}

	public int method6966(String string) {
		return method6947(string, null, 1966014558);
	}

	public String method6967(String string, int i, Interface39[] interface39s) {
		if (method6947(string, interface39s, 574021348) <= i)
			return string;
		i -= method6947("...", null, 506851452);
		int i_148_ = -1;
		int i_149_ = -1;
		int i_150_ = 0;
		int i_151_ = string.length();
		String string_152_ = "";
		for (int i_153_ = 0; i_153_ < i_151_; i_153_++) {
			char c = string.charAt(i_153_);
			if (c == 60)
				i_148_ = i_153_;
			else {
				if (62 == c && i_148_ != -1) {
					String string_154_ = string.substring(1 + i_148_, i_153_);
					i_148_ = -1;
					if (string_154_.equals("lt"))
						c = '<';
					else if (string_154_.equals("gt"))
						c = '>';
					else if (string_154_.equals("nbsp"))
						c = '\u00a0';
					else if (string_154_.equals("shy"))
						c = '\u00ad';
					else if (string_154_.equals("times"))
						c = '\u00d7';
					else if (string_154_.equals("euro"))
						c = '\u20ac';
					else if (string_154_.equals("copy"))
						c = '\u00a9';
					else if (string_154_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_154_.startsWith("img=") && null != interface39s) {
							try {
								int i_155_ = Class328.method5830(string_154_.substring(4), 439534854);
								i_150_ += interface39s[i_155_].method228();
								i_149_ = -1;
								if (i_150_ > i)
									return new StringBuilder().append(string_152_).append("...").toString();
								string_152_ = string.substring(0, i_153_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_148_) {
					i_150_ += (((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 53) & 0xff]) & 0xff;
					if (((Class414) this).aByteArrayArray4977 != null && -1 != i_149_)
						i_150_ += (((Class414) this).aByteArrayArray4977[i_149_][c]);
					i_149_ = c;
					int i_156_ = i_150_;
					if (null != ((Class414) this).aByteArrayArray4977)
						i_156_ += ((Class414) this).aByteArrayArray4977[c][46];
					if (i_156_ > i)
						return new StringBuilder().append(string_152_).append("...").toString();
					string_152_ = string.substring(0, 1 + i_153_);
				}
			}
		}
		return string;
	}

	public String method6968(String string, int i, Interface39[] interface39s) {
		if (method6947(string, interface39s, 220324631) <= i)
			return string;
		i -= method6947("...", null, -1622545750);
		int i_157_ = -1;
		int i_158_ = -1;
		int i_159_ = 0;
		int i_160_ = string.length();
		String string_161_ = "";
		for (int i_162_ = 0; i_162_ < i_160_; i_162_++) {
			char c = string.charAt(i_162_);
			if (c == 60)
				i_157_ = i_162_;
			else {
				if (62 == c && i_157_ != -1) {
					String string_163_ = string.substring(1 + i_157_, i_162_);
					i_157_ = -1;
					if (string_163_.equals("lt"))
						c = '<';
					else if (string_163_.equals("gt"))
						c = '>';
					else if (string_163_.equals("nbsp"))
						c = '\u00a0';
					else if (string_163_.equals("shy"))
						c = '\u00ad';
					else if (string_163_.equals("times"))
						c = '\u00d7';
					else if (string_163_.equals("euro"))
						c = '\u20ac';
					else if (string_163_.equals("copy"))
						c = '\u00a9';
					else if (string_163_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_163_.startsWith("img=") && null != interface39s) {
							try {
								int i_164_ = Class328.method5830(string_163_.substring(4), -1516597195);
								i_159_ += interface39s[i_164_].method228();
								i_158_ = -1;
								if (i_159_ > i)
									return new StringBuilder().append(string_161_).append("...").toString();
								string_161_ = string.substring(0, i_162_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_157_) {
					i_159_ += (((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 30) & 0xff]) & 0xff;
					if (((Class414) this).aByteArrayArray4977 != null && -1 != i_158_)
						i_159_ += (((Class414) this).aByteArrayArray4977[i_158_][c]);
					i_158_ = c;
					int i_165_ = i_159_;
					if (null != ((Class414) this).aByteArrayArray4977)
						i_165_ += ((Class414) this).aByteArrayArray4977[c][46];
					if (i_165_ > i)
						return new StringBuilder().append(string_161_).append("...").toString();
					string_161_ = string.substring(0, 1 + i_162_);
				}
			}
		}
		return string;
	}

	public int method6969(String string, int[] is, String[] strings, Interface39[] interface39s) {
		return method6950(string, is, strings, interface39s, true, (byte) -45);
	}

	public int method6970(String string, int[] is, String[] strings, Interface39[] interface39s) {
		return method6950(string, is, strings, interface39s, true, (byte) -107);
	}

	int method6971(String string, int[] is, String[] strings, Interface39[] interface39s, boolean bool) {
		if (null == string)
			return 0;
		int i = 0;
		int i_166_ = 0;
		int i_167_ = -1;
		int i_168_ = 0;
		int i_169_ = 0;
		int i_170_ = -1;
		int i_171_ = -1;
		int i_172_ = 0;
		int i_173_ = string.length();
		for (int i_174_ = 0; i_174_ < i_173_; i_174_++) {
			int i_175_ = (Class242.method4163(string.charAt(i_174_), (byte) 122) & 0xff);
			int i_176_ = 0;
			if (60 == i_175_)
				i_170_ = i_174_;
			else {
				int i_177_;
				if (i_170_ != -1) {
					if (62 != i_175_)
						continue;
					i_177_ = i_170_;
					String string_178_ = string.substring(1 + i_170_, i_174_);
					i_170_ = -1;
					if (string_178_.equals("br")) {
						strings[i_172_] = string.substring(i_166_, i_174_ + 1);
						if (++i_172_ >= strings.length)
							return 0;
						i_166_ = i_174_ + 1;
						i = 0;
						i_167_ = -1;
						i_171_ = -1;
						continue;
					}
					if (string_178_.equals("lt")) {
						i_176_ += method6945(60, (byte) -8);
						if (((Class414) this).aByteArrayArray4977 != null && -1 != i_171_)
							i_176_ += (((Class414) this).aByteArrayArray4977[i_171_][60]);
						i_171_ = 60;
					} else if (string_178_.equals("gt")) {
						i_176_ += method6945(62, (byte) -17);
						if (null != ((Class414) this).aByteArrayArray4977 && i_171_ != -1)
							i_176_ += (((Class414) this).aByteArrayArray4977[i_171_][62]);
						i_171_ = 62;
					} else if (string_178_.equals("nbsp")) {
						i_176_ += method6945(160, (byte) -54);
						if (((Class414) this).aByteArrayArray4977 != null && i_171_ != -1)
							i_176_ += (((Class414) this).aByteArrayArray4977[i_171_][160]);
						i_171_ = 160;
					} else if (string_178_.equals("shy")) {
						i_176_ += method6945(173, (byte) -70);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_171_)
							i_176_ += (((Class414) this).aByteArrayArray4977[i_171_][173]);
						i_171_ = 173;
					} else if (string_178_.equals("times")) {
						i_176_ += method6945(215, (byte) -79);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_171_)
							i_176_ += (((Class414) this).aByteArrayArray4977[i_171_][215]);
						i_171_ = 215;
					} else if (string_178_.equals("euro")) {
						i_176_ += method6945(8364, (byte) -18);
						if (((Class414) this).aByteArrayArray4977 != null && i_171_ != -1)
							i_176_ += (((Class414) this).aByteArrayArray4977[i_171_][8364]);
						i_171_ = 8364;
					} else if (string_178_.equals("copy")) {
						i_176_ += method6945(169, (byte) -99);
						if (null != ((Class414) this).aByteArrayArray4977 && i_171_ != -1)
							i_176_ += (((Class414) this).aByteArrayArray4977[i_171_][169]);
						i_171_ = 169;
					} else if (string_178_.equals("reg")) {
						i_176_ += method6945(174, (byte) -76);
						if (null != ((Class414) this).aByteArrayArray4977 && i_171_ != -1)
							i_176_ += (((Class414) this).aByteArrayArray4977[i_171_][174]);
						i_171_ = 174;
					} else if (string_178_.startsWith("img=") && null != interface39s) {
						try {
							int i_179_ = Class328.method5830(string_178_.substring(4), -1382550266);
							i_176_ += interface39s[i_179_].method228();
							i_171_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_175_ = -1;
				} else {
					i_177_ = i_174_;
					i_176_ += method6945(i_175_, (byte) -36);
					if (null != ((Class414) this).aByteArrayArray4977 && i_171_ != -1)
						i_176_ += (((Class414) this).aByteArrayArray4977[i_171_][i_175_]);
					i_171_ = i_175_;
				}
				if (i_176_ > 0) {
					i += i_176_;
					if (null != is) {
						if (i_175_ == 32) {
							i_167_ = i_174_;
							i_168_ = i;
							i_169_ = bool ? 1 : 0;
						}
						if (i > is[(i_172_ < is.length ? i_172_ : is.length - 1)]) {
							if (i_167_ >= 0) {
								strings[i_172_] = string.substring(i_166_, 1 + i_167_ - i_169_);
								if (++i_172_ >= strings.length)
									return 0;
								i_166_ = i_167_ + 1;
								i_167_ = -1;
								i -= i_168_;
								i_171_ = -1;
							} else {
								strings[i_172_] = string.substring(i_166_, i_177_);
								if (++i_172_ >= strings.length)
									return 0;
								i_166_ = i_177_;
								i_167_ = -1;
								i = i_176_;
								i_171_ = -1;
							}
						}
						if (i_175_ == 45) {
							i_167_ = i_174_;
							i_168_ = i;
							i_169_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_166_) {
			strings[i_172_] = string.substring(i_166_, string.length());
			i_172_++;
		}
		return i_172_;
	}

	public int method6972(String string, int i, int i_180_, Interface39[] interface39s, int i_181_) {
		if (i_180_ == 0)
			i_180_ = anInt4975 * 1200654985;
		int i_182_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_183_ = i_180_ * (i_182_ - 1);
		return anInt4979 * -1518951631 + (i_183_ + anInt4978 * 397683159);
	}

	public int method6973(String string, int i, int i_184_, int i_185_, int i_186_, Interface39[] interface39s) {
		if (0 == i_184_)
			i_184_ = anInt4975 * 1200654985;
		int i_187_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		if (i_187_ == 0)
			return 0;
		if (i_186_ < 0)
			i_186_ = 0;
		i_186_ /= i_184_;
		if (i_186_ >= i_187_)
			i_186_ = i_187_ - 1;
		String string_188_ = aStringArray4980[i_186_];
		int i_189_ = 0;
		int i_190_ = 0;
		int i_191_;
		for (i_191_ = 0; i_191_ < i_185_ && i_189_ < string_188_.length(); i_191_ = method6947(string_188_.substring(0, ++i_189_), interface39s, 189957611))
			i_190_ = i_191_;
		if (i_189_ == string_188_.length() && string_188_.endsWith("<br>"))
			i_189_ -= 4;
		if (i_185_ - i_190_ < i_191_ - i_185_)
			i_189_--;
		for (int i_192_ = 0; i_192_ < i_186_; i_192_++)
			i_189_ += aStringArray4980[i_192_].length();
		return i_189_;
	}

	int method6974(String string, int[] is, String[] strings, Interface39[] interface39s, boolean bool) {
		if (null == string)
			return 0;
		int i = 0;
		int i_193_ = 0;
		int i_194_ = -1;
		int i_195_ = 0;
		int i_196_ = 0;
		int i_197_ = -1;
		int i_198_ = -1;
		int i_199_ = 0;
		int i_200_ = string.length();
		for (int i_201_ = 0; i_201_ < i_200_; i_201_++) {
			int i_202_ = (Class242.method4163(string.charAt(i_201_), (byte) 104) & 0xff);
			int i_203_ = 0;
			if (60 == i_202_)
				i_197_ = i_201_;
			else {
				int i_204_;
				if (i_197_ != -1) {
					if (62 != i_202_)
						continue;
					i_204_ = i_197_;
					String string_205_ = string.substring(1 + i_197_, i_201_);
					i_197_ = -1;
					if (string_205_.equals("br")) {
						strings[i_199_] = string.substring(i_193_, i_201_ + 1);
						if (++i_199_ >= strings.length)
							return 0;
						i_193_ = i_201_ + 1;
						i = 0;
						i_194_ = -1;
						i_198_ = -1;
						continue;
					}
					if (string_205_.equals("lt")) {
						i_203_ += method6945(60, (byte) -108);
						if (((Class414) this).aByteArrayArray4977 != null && -1 != i_198_)
							i_203_ += (((Class414) this).aByteArrayArray4977[i_198_][60]);
						i_198_ = 60;
					} else if (string_205_.equals("gt")) {
						i_203_ += method6945(62, (byte) -32);
						if (null != ((Class414) this).aByteArrayArray4977 && i_198_ != -1)
							i_203_ += (((Class414) this).aByteArrayArray4977[i_198_][62]);
						i_198_ = 62;
					} else if (string_205_.equals("nbsp")) {
						i_203_ += method6945(160, (byte) -18);
						if (((Class414) this).aByteArrayArray4977 != null && i_198_ != -1)
							i_203_ += (((Class414) this).aByteArrayArray4977[i_198_][160]);
						i_198_ = 160;
					} else if (string_205_.equals("shy")) {
						i_203_ += method6945(173, (byte) -62);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_198_)
							i_203_ += (((Class414) this).aByteArrayArray4977[i_198_][173]);
						i_198_ = 173;
					} else if (string_205_.equals("times")) {
						i_203_ += method6945(215, (byte) -10);
						if (null != ((Class414) this).aByteArrayArray4977 && -1 != i_198_)
							i_203_ += (((Class414) this).aByteArrayArray4977[i_198_][215]);
						i_198_ = 215;
					} else if (string_205_.equals("euro")) {
						i_203_ += method6945(8364, (byte) -62);
						if (((Class414) this).aByteArrayArray4977 != null && i_198_ != -1)
							i_203_ += (((Class414) this).aByteArrayArray4977[i_198_][8364]);
						i_198_ = 8364;
					} else if (string_205_.equals("copy")) {
						i_203_ += method6945(169, (byte) -54);
						if (null != ((Class414) this).aByteArrayArray4977 && i_198_ != -1)
							i_203_ += (((Class414) this).aByteArrayArray4977[i_198_][169]);
						i_198_ = 169;
					} else if (string_205_.equals("reg")) {
						i_203_ += method6945(174, (byte) -37);
						if (null != ((Class414) this).aByteArrayArray4977 && i_198_ != -1)
							i_203_ += (((Class414) this).aByteArrayArray4977[i_198_][174]);
						i_198_ = 174;
					} else if (string_205_.startsWith("img=") && null != interface39s) {
						try {
							int i_206_ = Class328.method5830(string_205_.substring(4), 671135145);
							i_203_ += interface39s[i_206_].method228();
							i_198_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_202_ = -1;
				} else {
					i_204_ = i_201_;
					i_203_ += method6945(i_202_, (byte) -101);
					if (null != ((Class414) this).aByteArrayArray4977 && i_198_ != -1)
						i_203_ += (((Class414) this).aByteArrayArray4977[i_198_][i_202_]);
					i_198_ = i_202_;
				}
				if (i_203_ > 0) {
					i += i_203_;
					if (null != is) {
						if (i_202_ == 32) {
							i_194_ = i_201_;
							i_195_ = i;
							i_196_ = bool ? 1 : 0;
						}
						if (i > is[(i_199_ < is.length ? i_199_ : is.length - 1)]) {
							if (i_194_ >= 0) {
								strings[i_199_] = string.substring(i_193_, 1 + i_194_ - i_196_);
								if (++i_199_ >= strings.length)
									return 0;
								i_193_ = i_194_ + 1;
								i_194_ = -1;
								i -= i_195_;
								i_198_ = -1;
							} else {
								strings[i_199_] = string.substring(i_193_, i_204_);
								if (++i_199_ >= strings.length)
									return 0;
								i_193_ = i_204_;
								i_194_ = -1;
								i = i_203_;
								i_198_ = -1;
							}
						}
						if (i_202_ == 45) {
							i_194_ = i_201_;
							i_195_ = i;
							i_196_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_193_) {
			strings[i_199_] = string.substring(i_193_, string.length());
			i_199_++;
		}
		return i_199_;
	}

	public int method6975(String string, int i, Interface39[] interface39s) {
		int i_207_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_208_ = 0;
		for (int i_209_ = 0; i_209_ < i_207_; i_209_++) {
			int i_210_ = method6947(aStringArray4980[i_209_], interface39s, -1373619798);
			if (i_210_ > i_208_)
				i_208_ = i_210_;
		}
		return i_208_;
	}

	public int method6976(String string, int i, Interface39[] interface39s) {
		int i_211_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_212_ = 0;
		for (int i_213_ = 0; i_213_ < i_211_; i_213_++) {
			int i_214_ = method6947(aStringArray4980[i_213_], interface39s, 1378011789);
			if (i_214_ > i_212_)
				i_212_ = i_214_;
		}
		return i_212_;
	}

	public int method6977(String string, int i, Interface39[] interface39s) {
		int i_215_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_216_ = 0;
		for (int i_217_ = 0; i_217_ < i_215_; i_217_++) {
			int i_218_ = method6947(aStringArray4980[i_217_], interface39s, -547727955);
			if (i_218_ > i_216_)
				i_216_ = i_218_;
		}
		return i_216_;
	}

	public int method6978(String string, int i, Interface39[] interface39s) {
		return method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
	}

	public int method6979(String string, int i, Interface39[] interface39s) {
		return method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
	}

	public int method6980(String string, int i, int i_219_, Interface39[] interface39s) {
		if (i_219_ == 0)
			i_219_ = anInt4975 * 1200654985;
		int i_220_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_221_ = i_219_ * (i_220_ - 1);
		return anInt4979 * -1518951631 + (i_221_ + anInt4978 * 397683159);
	}

	public String method6981(String string, int i, Interface39[] interface39s) {
		if (method6947(string, interface39s, 42565583) <= i)
			return string;
		i -= method6947("...", null, 720273682);
		int i_222_ = -1;
		int i_223_ = -1;
		int i_224_ = 0;
		int i_225_ = string.length();
		String string_226_ = "";
		for (int i_227_ = 0; i_227_ < i_225_; i_227_++) {
			char c = string.charAt(i_227_);
			if (c == 60)
				i_222_ = i_227_;
			else {
				if (62 == c && i_222_ != -1) {
					String string_228_ = string.substring(1 + i_222_, i_227_);
					i_222_ = -1;
					if (string_228_.equals("lt"))
						c = '<';
					else if (string_228_.equals("gt"))
						c = '>';
					else if (string_228_.equals("nbsp"))
						c = '\u00a0';
					else if (string_228_.equals("shy"))
						c = '\u00ad';
					else if (string_228_.equals("times"))
						c = '\u00d7';
					else if (string_228_.equals("euro"))
						c = '\u20ac';
					else if (string_228_.equals("copy"))
						c = '\u00a9';
					else if (string_228_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_228_.startsWith("img=") && null != interface39s) {
							try {
								int i_229_ = Class328.method5830(string_228_.substring(4), 1602196878);
								i_224_ += interface39s[i_229_].method228();
								i_223_ = -1;
								if (i_224_ > i)
									return new StringBuilder().append(string_226_).append("...").toString();
								string_226_ = string.substring(0, i_227_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_222_) {
					i_224_ += ((((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 119) & 0xff]) & 0xff);
					if (((Class414) this).aByteArrayArray4977 != null && -1 != i_223_)
						i_224_ += (((Class414) this).aByteArrayArray4977[i_223_][c]);
					i_223_ = c;
					int i_230_ = i_224_;
					if (null != ((Class414) this).aByteArrayArray4977)
						i_230_ += ((Class414) this).aByteArrayArray4977[c][46];
					if (i_230_ > i)
						return new StringBuilder().append(string_226_).append("...").toString();
					string_226_ = string.substring(0, 1 + i_227_);
				}
			}
		}
		return string;
	}

	public int method6982(String string, int i, int i_231_, Interface39[] interface39s) {
		if (i_231_ == 0)
			i_231_ = anInt4975 * 1200654985;
		int i_232_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_233_ = i_231_ * (i_232_ - 1);
		return anInt4979 * -1518951631 + (i_233_ + anInt4978 * 397683159);
	}

	public int method6983(String string, int i, int i_234_, Interface39[] interface39s) {
		if (i_234_ == 0)
			i_234_ = anInt4975 * 1200654985;
		int i_235_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		int i_236_ = i_234_ * (i_235_ - 1);
		return anInt4979 * -1518951631 + (i_236_ + anInt4978 * 397683159);
	}

	public Point method6984(String string, int i, int i_237_, int i_238_, Interface39[] interface39s) {
		if (i_238_ <= 0)
			return new Point(0, 397683159 * anInt4978 + i_237_);
		if (i_238_ > string.length())
			i_238_ = string.length();
		if (0 == i_237_)
			i_237_ = 1200654985 * anInt4975;
		int i_239_ = method6950(string, new int[] { i }, aStringArray4980, interface39s, false, (byte) -7);
		int i_240_ = 0;
		for (int i_241_ = 0; i_241_ < i_239_; i_241_++) {
			int i_242_ = aStringArray4980[i_241_].length();
			if (i_242_ + i_240_ > i_238_ || i_241_ == i_239_ - 1 && i_238_ == string.length()) {
				String string_243_ = string.substring(i_240_, i_238_);
				if (string_243_.endsWith("<br>")) {
					string_243_ = "";
					i_240_ += i_242_;
					i_241_++;
				}
				int i_244_ = method6947(string_243_, interface39s, 317863669);
				int i_245_ = 397683159 * anInt4978 + i_237_ * i_241_;
				return new Point(i_244_, i_245_);
			}
			i_240_ += i_242_;
		}
		return null;
	}

	public int method6985(String string, Interface39[] interface39s) {
		if (null == string)
			return 0;
		int i = -1;
		int i_246_ = -1;
		int i_247_ = 0;
		int i_248_ = string.length();
		for (int i_249_ = 0; i_249_ < i_248_; i_249_++) {
			char c = string.charAt(i_249_);
			if (c == 60)
				i = i_249_;
			else {
				if (c == 62 && -1 != i) {
					String string_250_ = string.substring(1 + i, i_249_);
					i = -1;
					if (string_250_.equals("lt"))
						c = '<';
					else if (string_250_.equals("gt"))
						c = '>';
					else if (string_250_.equals("nbsp"))
						c = '\u00a0';
					else if (string_250_.equals("shy"))
						c = '\u00ad';
					else if (string_250_.equals("times"))
						c = '\u00d7';
					else if (string_250_.equals("euro"))
						c = '\u20ac';
					else if (string_250_.equals("copy"))
						c = '\u00a9';
					else if (string_250_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_250_.startsWith("img=") && interface39s != null) {
							try {
								int i_251_ = Class328.method5830(string_250_.substring(4), -737132930);
								i_247_ += interface39s[i_251_].method228();
								i_246_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					i_247_ += (((Class414) this).aByteArray4976[Class242.method4163(c, (byte) 22) & 0xff]) & 0xff;
					if (null != ((Class414) this).aByteArrayArray4977 && i_246_ != -1)
						i_247_ += (((Class414) this).aByteArrayArray4977[i_246_][c]);
					i_246_ = c;
				}
			}
		}
		return i_247_;
	}

	public Point method6986(String string, int i, int i_252_, int i_253_, Interface39[] interface39s) {
		if (i_253_ <= 0)
			return new Point(0, 397683159 * anInt4978 + i_252_);
		if (i_253_ > string.length())
			i_253_ = string.length();
		if (0 == i_252_)
			i_252_ = 1200654985 * anInt4975;
		int i_254_ = method6950(string, new int[] { i }, aStringArray4980, interface39s, false, (byte) -101);
		int i_255_ = 0;
		for (int i_256_ = 0; i_256_ < i_254_; i_256_++) {
			int i_257_ = aStringArray4980[i_256_].length();
			if (i_257_ + i_255_ > i_253_ || i_256_ == i_254_ - 1 && i_253_ == string.length()) {
				String string_258_ = string.substring(i_255_, i_253_);
				if (string_258_.endsWith("<br>")) {
					string_258_ = "";
					i_255_ += i_257_;
					i_256_++;
				}
				int i_259_ = method6947(string_258_, interface39s, -1209480418);
				int i_260_ = 397683159 * anInt4978 + i_252_ * i_256_;
				return new Point(i_259_, i_260_);
			}
			i_255_ += i_257_;
		}
		return null;
	}

	public int method6987(String string, int[] is, String[] strings, Interface39[] interface39s, byte i) {
		return method6950(string, is, strings, interface39s, true, (byte) -40);
	}

	public int method6988(String string, int i, int i_261_, int i_262_, int i_263_, Interface39[] interface39s) {
		if (0 == i_261_)
			i_261_ = anInt4975 * 1200654985;
		int i_264_ = method6987(string, new int[] { i }, aStringArray4980, interface39s, (byte) 0);
		if (i_264_ == 0)
			return 0;
		if (i_263_ < 0)
			i_263_ = 0;
		i_263_ /= i_261_;
		if (i_263_ >= i_264_)
			i_263_ = i_264_ - 1;
		String string_265_ = aStringArray4980[i_263_];
		int i_266_ = 0;
		int i_267_ = 0;
		int i_268_;
		for (i_268_ = 0; i_268_ < i_262_ && i_266_ < string_265_.length(); i_268_ = method6947(string_265_.substring(0, ++i_266_), interface39s, -1144073042))
			i_267_ = i_268_;
		if (i_266_ == string_265_.length() && string_265_.endsWith("<br>"))
			i_266_ -= 4;
		if (i_262_ - i_267_ < i_268_ - i_262_)
			i_266_--;
		for (int i_269_ = 0; i_269_ < i_263_; i_269_++)
			i_266_ += aStringArray4980[i_269_].length();
		return i_266_;
	}

	static final void method6989(int i) {
		client.anInt7231 = 593633913;
		client.anInt7341 = -1766566601;
		Class262.anIntArrayArray3239 = null;
		Class276.aClass282_Sub35_3346 = null;
		Class79.method1390(1755874378);
	}
}
