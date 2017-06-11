/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class505 {
	public int anInt6197;
	byte[][] aByteArrayArray6198;
	byte[] aByteArray6199;
	public int anInt6200;
	static String[] aStringArray6201 = new String[100];
	public int anInt6202;

	public int method6253(int i, char c, int i_0_) {
		try {
			if (((Class505) this).aByteArrayArray6198 != null)
				return ((Class505) this).aByteArrayArray6198[i][c];
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.p(").append(')').toString());
		}
	}

	public int method6254(String string, Interface28[] interface28s, int i) {
		try {
			if (null == string)
				return 0;
			int i_1_ = -1;
			int i_2_ = -1;
			int i_3_ = 0;
			int i_4_ = string.length();
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				char c = string.charAt(i_5_);
				if (c == 60)
					i_1_ = i_5_;
				else {
					if (c == 62 && i_1_ != -1) {
						String string_6_ = string.substring(i_1_ + 1, i_5_);
						i_1_ = -1;
						if (string_6_.equals("lt"))
							c = '<';
						else if (string_6_.equals("gt"))
							c = '>';
						else if (string_6_.equals("nbsp"))
							c = '\u00a0';
						else if (string_6_.equals("shy"))
							c = '\u00ad';
						else if (string_6_.equals("times"))
							c = '\u00d7';
						else if (string_6_.equals("euro"))
							c = '\u20ac';
						else if (string_6_.equals("copy"))
							c = '\u00a9';
						else if (string_6_.equals("reg"))
							c = '\u00ae';
						else {
							if (string_6_.startsWith("img=") && null != interface28s) {
								try {
									int i_7_ = (Class216.method1998(string_6_.substring(4), (short) -2448));
									i_3_ += interface28s[i_7_].method271();
									i_2_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
							continue;
						}
					}
					if (-1 == i_1_) {
						i_3_ += ((((Class505) this).aByteArray6199[Class124.method1387(c, 1088430238) & 0xff]) & 0xff);
						if (((Class505) this).aByteArrayArray6198 != null && i_2_ != -1)
							i_3_ += (((Class505) this).aByteArrayArray6198[i_2_][c]);
						i_2_ = c;
					}
				}
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.d(").append(')').toString());
		}
	}

	public int method6255(int i, int i_8_) {
		try {
			return ((Class505) this).aByteArray6199[i] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.i(").append(')').toString());
		}
	}

	public String method6256(String string, int i, Interface28[] interface28s, byte i_9_) {
		try {
			if (method6254(string, interface28s, 1319235613) <= i)
				return string;
			i -= method6254("...", null, 1319235613);
			int i_10_ = -1;
			int i_11_ = -1;
			int i_12_ = 0;
			int i_13_ = string.length();
			String string_14_ = "";
			for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
				char c = string.charAt(i_15_);
				if (c == 60)
					i_10_ = i_15_;
				else {
					if (62 == c && i_10_ != -1) {
						String string_16_ = string.substring(1 + i_10_, i_15_);
						i_10_ = -1;
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
							if (string_16_.startsWith("img=") && interface28s != null) {
								try {
									int i_17_ = (Class216.method1998(string_16_.substring(4), (short) 4410));
									i_12_ += interface28s[i_17_].method271();
									i_11_ = -1;
									if (i_12_ > i)
										return new StringBuilder().append(string_14_).append("...").toString();
									string_14_ = string.substring(0, i_15_ + 1);
								} catch (Exception exception) {
									/* empty */
								}
							}
							continue;
						}
					}
					if (i_10_ == -1) {
						i_12_ += ((((Class505) this).aByteArray6199[Class124.method1387(c, 1088430238) & 0xff]) & 0xff);
						if (((Class505) this).aByteArrayArray6198 != null && i_11_ != -1)
							i_12_ += (((Class505) this).aByteArrayArray6198[i_11_][c]);
						i_11_ = c;
						int i_18_ = i_12_;
						if (((Class505) this).aByteArrayArray6198 != null)
							i_18_ += (((Class505) this).aByteArrayArray6198[c][46]);
						if (i_18_ > i)
							return new StringBuilder().append(string_14_).append("...").toString();
						string_14_ = string.substring(0, 1 + i_15_);
					}
				}
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.u(").append(')').toString());
		}
	}

	public int method6257(String string, int[] is, String[] strings, Interface28[] interface28s, byte i) {
		try {
			return method6258(string, is, strings, interface28s, true, 116413311);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.x(").append(')').toString());
		}
	}

	int method6258(String string, int[] is, String[] strings, Interface28[] interface28s, boolean bool, int i) {
		try {
			if (string == null)
				return 0;
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = -1;
			int i_22_ = 0;
			int i_23_ = 0;
			int i_24_ = -1;
			int i_25_ = -1;
			int i_26_ = 0;
			int i_27_ = string.length();
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
				int i_29_ = (Class124.method1387(string.charAt(i_28_), 1088430238) & 0xff);
				int i_30_ = 0;
				if (60 == i_29_)
					i_24_ = i_28_;
				else {
					int i_31_;
					if (-1 != i_24_) {
						if (i_29_ != 62) {
							if (i != 116413311) {
								/* empty */
							}
							continue;
						}
						i_31_ = i_24_;
						String string_32_ = string.substring(i_24_ + 1, i_28_);
						i_24_ = -1;
						if (string_32_.equals("br")) {
							strings[i_26_] = string.substring(i_20_, 1 + i_28_);
							if (++i_26_ >= strings.length)
								return 0;
							i_20_ = 1 + i_28_;
							i_19_ = 0;
							i_21_ = -1;
							i_25_ = -1;
							continue;
						}
						if (string_32_.equals("lt")) {
							i_30_ += method6255(60, 1793318064);
							if (null != ((Class505) this).aByteArrayArray6198 && i_25_ != -1)
								i_30_ += (((Class505) this).aByteArrayArray6198[i_25_][60]);
							i_25_ = 60;
						} else if (string_32_.equals("gt")) {
							i_30_ += method6255(62, 2036265548);
							if (null != ((Class505) this).aByteArrayArray6198 && i_25_ != -1)
								i_30_ += (((Class505) this).aByteArrayArray6198[i_25_][62]);
							i_25_ = 62;
						} else if (string_32_.equals("nbsp")) {
							i_30_ += method6255(160, 1914153156);
							if (null != ((Class505) this).aByteArrayArray6198 && -1 != i_25_)
								i_30_ += (((Class505) this).aByteArrayArray6198[i_25_][160]);
							i_25_ = 160;
						} else if (string_32_.equals("shy")) {
							i_30_ += method6255(173, 1038686003);
							if (((Class505) this).aByteArrayArray6198 != null && i_25_ != -1)
								i_30_ += (((Class505) this).aByteArrayArray6198[i_25_][173]);
							i_25_ = 173;
						} else if (string_32_.equals("times")) {
							i_30_ += method6255(215, 1326596861);
							if (null != ((Class505) this).aByteArrayArray6198 && -1 != i_25_)
								i_30_ += (((Class505) this).aByteArrayArray6198[i_25_][215]);
							i_25_ = 215;
						} else if (string_32_.equals("euro")) {
							i_30_ += method6255(8364, 1505492652);
							if (((Class505) this).aByteArrayArray6198 != null && -1 != i_25_)
								i_30_ += (((Class505) this).aByteArrayArray6198[i_25_][8364]);
							i_25_ = 8364;
						} else if (string_32_.equals("copy")) {
							i_30_ += method6255(169, 1424701879);
							if (null != ((Class505) this).aByteArrayArray6198 && i_25_ != -1)
								i_30_ += (((Class505) this).aByteArrayArray6198[i_25_][169]);
							i_25_ = 169;
						} else if (string_32_.equals("reg")) {
							i_30_ += method6255(174, 1748502620);
							if (null != ((Class505) this).aByteArrayArray6198 && -1 != i_25_)
								i_30_ += (((Class505) this).aByteArrayArray6198[i_25_][174]);
							i_25_ = 174;
						} else if (string_32_.startsWith("img=") && null != interface28s) {
							try {
								int i_33_ = Class216.method1998(string_32_.substring(4), (short) 14575);
								i_30_ += interface28s[i_33_].method271();
								i_25_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						i_29_ = -1;
					} else {
						i_31_ = i_28_;
						i_30_ += method6255(i_29_, 1755594476);
						if (((Class505) this).aByteArrayArray6198 != null && i_25_ != -1)
							i_30_ += (((Class505) this).aByteArrayArray6198[i_25_][i_29_]);
						i_25_ = i_29_;
					}
					if (i_30_ > 0) {
						i_19_ += i_30_;
						if (is != null) {
							if (i_29_ == 32) {
								i_21_ = i_28_;
								i_22_ = i_19_;
								i_23_ = bool ? 1 : 0;
							}
							if (i_19_ > is[(i_26_ < is.length ? i_26_ : is.length - 1)]) {
								if (i_21_ >= 0) {
									strings[i_26_] = string.substring(i_20_, i_21_ + 1 - i_23_);
									if (++i_26_ >= strings.length)
										return 0;
									i_20_ = i_21_ + 1;
									i_21_ = -1;
									i_19_ -= i_22_;
									i_25_ = -1;
								} else {
									strings[i_26_] = string.substring(i_20_, i_31_);
									if (++i_26_ >= strings.length)
										return 0;
									i_20_ = i_31_;
									i_21_ = -1;
									i_19_ = i_30_;
									i_25_ = -1;
								}
							}
							if (45 == i_29_) {
								i_21_ = i_28_;
								i_22_ = i_19_;
								i_23_ = 0;
							}
						}
					}
				}
			}
			if (string.length() > i_20_) {
				strings[i_26_] = string.substring(i_20_, string.length());
				i_26_++;
			}
			return i_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.r(").append(')').toString());
		}
	}

	public int method6259(String string, int i, Interface28[] interface28s, int i_34_) {
		try {
			int i_35_ = method6257(string, new int[] { i }, aStringArray6201, interface28s, (byte) 91);
			int i_36_ = 0;
			for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
				int i_38_ = method6254(aStringArray6201[i_37_], interface28s, 1319235613);
				if (i_38_ > i_36_)
					i_36_ = i_38_;
			}
			return i_36_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.q(").append(')').toString());
		}
	}

	public int method6260(String string, int i, int i_39_, Interface28[] interface28s, int i_40_) {
		try {
			if (0 == i_39_)
				i_39_ = -2028004825 * anInt6200;
			int i_41_ = method6257(string, new int[] { i }, aStringArray6201, interface28s, (byte) 11);
			int i_42_ = (i_41_ - 1) * i_39_;
			return i_42_ + anInt6202 * 1110385787 + -1883958527 * anInt6197;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.s(").append(')').toString());
		}
	}

	Class505(byte[] is) {
		RsByteBuffer class298_sub53 = new RsByteBuffer(is);
		int i = class298_sub53.readUnsignedByte();
		if (0 != i)
			throw new RuntimeException("");
		boolean bool = class298_sub53.readUnsignedByte() == 1;
		((Class505) this).aByteArray6199 = new byte[256];
		class298_sub53.readBytes(((Class505) this).aByteArray6199, 0, 256, -953523806);
		if (bool) {
			int[] is_43_ = new int[256];
			int[] is_44_ = new int[256];
			for (int i_45_ = 0; i_45_ < 256; i_45_++)
				is_43_[i_45_] = class298_sub53.readUnsignedByte();
			for (int i_46_ = 0; i_46_ < 256; i_46_++)
				is_44_[i_46_] = class298_sub53.readUnsignedByte();
			byte[][] is_47_ = new byte[256][];
			for (int i_48_ = 0; i_48_ < 256; i_48_++) {
				is_47_[i_48_] = new byte[is_43_[i_48_]];
				byte i_49_ = 0;
				for (int i_50_ = 0; i_50_ < is_47_[i_48_].length; i_50_++) {
					i_49_ += class298_sub53.readByte(-12558881);
					is_47_[i_48_][i_50_] = i_49_;
				}
			}
			byte[][] is_51_ = new byte[256][];
			for (int i_52_ = 0; i_52_ < 256; i_52_++) {
				is_51_[i_52_] = new byte[is_43_[i_52_]];
				byte i_53_ = 0;
				for (int i_54_ = 0; i_54_ < is_51_[i_52_].length; i_54_++) {
					i_53_ += class298_sub53.readByte(-12558881);
					is_51_[i_52_][i_54_] = i_53_;
				}
			}
			((Class505) this).aByteArrayArray6198 = new byte[256][256];
			for (int i_55_ = 0; i_55_ < 256; i_55_++) {
				if (i_55_ != 32) {
					for (int i_56_ = 0; i_56_ < 256; i_56_++) {
						if (i_56_ != 32)
							((Class505) this).aByteArrayArray6198[i_55_][i_56_] = (byte) BufferedConnectionContext.method392(is_47_, is_51_, is_44_, (((Class505) this).aByteArray6199), is_43_, i_55_, i_56_, -2019008168);
					}
				}
			}
			anInt6200 = 1673966999 * (is_44_[32] + is_43_[32]);
		} else
			anInt6200 = class298_sub53.readUnsignedByte() * 1673966999;
		class298_sub53.readUnsignedByte();
		class298_sub53.readUnsignedByte();
		anInt6202 = class298_sub53.readUnsignedByte() * -93381965;
		anInt6197 = class298_sub53.readUnsignedByte() * -2068583167;
	}

	public int method6261(String string, int i, int i_57_, int i_58_, int i_59_, Interface28[] interface28s, byte i_60_) {
		try {
			if (0 == i_57_)
				i_57_ = -2028004825 * anInt6200;
			int i_61_ = method6257(string, new int[] { i }, aStringArray6201, interface28s, (byte) -28);
			if (0 == i_61_)
				return 0;
			if (i_59_ < 0)
				i_59_ = 0;
			i_59_ /= i_57_;
			if (i_59_ >= i_61_)
				i_59_ = i_61_ - 1;
			String string_62_ = aStringArray6201[i_59_];
			int i_63_ = 0;
			int i_64_ = 0;
			int i_65_;
			for (i_65_ = 0; i_65_ < i_58_ && i_63_ < string_62_.length(); i_65_ = method6254(string_62_.substring(0, ++i_63_), interface28s, 1319235613))
				i_64_ = i_65_;
			if (i_63_ == string_62_.length() && string_62_.endsWith("<br>"))
				i_63_ -= 4;
			if (i_58_ - i_64_ < i_65_ - i_58_)
				i_63_--;
			for (int i_66_ = 0; i_66_ < i_59_; i_66_++)
				i_63_ += aStringArray6201[i_66_].length();
			return i_63_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.y(").append(')').toString());
		}
	}

	public int method6262(String string, int i, Interface28[] interface28s, int i_67_) {
		try {
			return method6257(string, new int[] { i }, aStringArray6201, interface28s, (byte) -64);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.n(").append(')').toString());
		}
	}

	public Point method6263(String string, int i, int i_68_, int i_69_, Interface28[] interface28s, int i_70_) {
		try {
			if (i_69_ <= 0)
				return new Point(0, i_68_ + 1110385787 * anInt6202);
			if (i_69_ > string.length())
				i_69_ = string.length();
			if (0 == i_68_)
				i_68_ = -2028004825 * anInt6200;
			int i_71_ = method6258(string, new int[] { i }, aStringArray6201, interface28s, false, 116413311);
			int i_72_ = 0;
			for (int i_73_ = 0; i_73_ < i_71_; i_73_++) {
				int i_74_ = aStringArray6201[i_73_].length();
				if (i_74_ + i_72_ > i_69_ || i_71_ - 1 == i_73_ && i_69_ == string.length()) {
					String string_75_ = string.substring(i_72_, i_69_);
					if (string_75_.endsWith("<br>")) {
						string_75_ = "";
						i_72_ += i_74_;
						i_73_++;
					}
					int i_76_ = method6254(string_75_, interface28s, 1319235613);
					int i_77_ = i_73_ * i_68_ + 1110385787 * anInt6202;
					return new Point(i_76_, i_77_);
				}
				i_72_ += i_74_;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.z(").append(')').toString());
		}
	}

	public int method6264(String string, int i) {
		try {
			return method6254(string, null, 1319235613);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.k(").append(')').toString());
		}
	}

	public static int method6265(int i) {
		try {
			boolean bool = true;
			boolean bool_78_ = false;
			boolean bool_79_ = false;
			if (Class12.aClass298_Sub44_9946.cpuClockSpeed * 399637415 < 512 && 399637415 * Class12.aClass298_Sub44_9946.cpuClockSpeed != 0)
				bool = false;
			if (Class82_Sub8.aString6856.startsWith("win")) {
				bool_79_ = true;
				bool_78_ = true;
			} else
				bool_78_ = true;
			if (Class11.aBoolean153)
				bool = false;
			if (Class11.aBoolean154)
				bool_78_ = false;
			if (Class11.aBoolean155)
				bool_79_ = false;
			if (!bool && !bool_78_ && !bool_79_)
				return Class407.method4964(571472892);
			int i_80_ = -1;
			int i_81_ = -1;
			int i_82_ = -1;
			if (bool) {
				try {
					i_80_ = ItemDefinitions.method6043(2, 1000, 280501708);
				} catch (Exception exception) {
					/* empty */
				}
			}
			if (bool_79_) {
				try {
					i_82_ = ItemDefinitions.method6043(3, 1000, -2071277019);
					if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-491668376) == 3) {
						Class58 class58 = Class373.aClass_ra4071.method4987();
						long l = (class58.aLong583 * 703334160035735425L & 0xffffffffffffL);
						switch (class58.anInt574 * 267107087) {
						case 4318:
							bool_78_ = bool_78_ & l >= 64425238954L;
							break;
						case 4098:
							bool_78_ = bool_78_ & l >= 60129613779L;
							break;
						}
					}
				} catch (Exception exception) {
					/* empty */
				}
			}
			if (bool_78_) {
				try {
					i_81_ = ItemDefinitions.method6043(1, 1000, -1485617713);
				} catch (Exception exception) {
					/* empty */
				}
			}
			if (i_80_ == -1 && -1 == i_81_ && -1 == i_82_)
				return Class407.method4964(571472892);
			i_82_ *= 1.1F;
			i_81_ *= 1.1F;
			if (i_80_ > i_82_ && i_80_ > i_81_)
				return Class353.method4252(i_80_, -2143732206);
			if (i_82_ > i_81_)
				return Class128_Sub1.method1439(3, i_82_, -683313294);
			return Class128_Sub1.method1439(1, i_81_, -1159261404);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.b(").append(')').toString());
		}
	}

	static final void method6266(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_83_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_84_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class497 class497 = Class92.aClass504_905.method6251(i_83_, 381661715);
			if (i_84_ != class497.anInt6100 * -388931549)
				class105.method1125(i_83_, i_84_, 1713038115);
			else
				class105.method1123(i_83_, 1279288503);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.hm(").append(')').toString());
		}
	}

	public static void method6267(Linkable class298, Linkable class298_85_, byte i) {
		try {
			if (class298.previous != null)
				class298.unlink(-1460969981);
			class298.previous = class298_85_.previous;
			class298.next = class298_85_;
			class298.previous.next = class298;
			class298.next.previous = class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.p(").append(')').toString());
		}
	}

	static final void method6268(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5241 -= 1938723502;
			Class23.method377((String) (((ClientScript2) class403).anObjectArray5240[-203050393 * ((ClientScript2) class403).anInt5241]), (String) (((ClientScript2) class403).anObjectArray5240[1 + -203050393 * ((ClientScript2) class403).anInt5241]), "", (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) == 1, false, (byte) -37);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uw.aft(").append(')').toString());
		}
	}
}
