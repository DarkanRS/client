/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class228 {
	public static int anInt2555 = 4;
	public static int anInt2556 = 3;
	public static int anInt2557 = 2;
	public static int anInt2558 = 1;
	public static int anInt2559 = 5;

	Class228() throws Throwable {
		throw new Error();
	}

	static final void method2115(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class145.method1595(class105, class119, class403, -762908635);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jq.ma(").append(')').toString());
		}
	}

	static final void method2116(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			StringBuilder stringbuilder = new StringBuilder(string.length());
			boolean bool = false;
			for (int i_0_ = 0; i_0_ < string.length(); i_0_++) {
				char c = string.charAt(i_0_);
				if (c == '<')
					bool = true;
				else if (c == '>')
					bool = false;
				else if (!bool)
					stringbuilder.append(c);
			}
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jq.aaf(").append(')').toString());
		}
	}

	public static void method2117(int i) {
		try {
			Class87.aClass437_793.clear((byte) -54);
			Class87.aClass453_799.method5943((byte) 1);
			Class87.aClass75Array805 = null;
			Class87.aClass94Array794 = null;
			Class87.aClass86Array798 = null;
			Class87.aClass80Array795 = null;
			Class87.aClass82Array797 = null;
			Class87.anInt803 = 2029434363;
			Class87.anInt800 = 0;
			Class87.anInt801 = 0;
			Class118.aClass88_1402 = null;
			Class87.anInt804 = 1692564793;
			if (Class87.aBoolean802) {
				client.aShort8934 = Class87.aShort792;
				client.aShort8935 = Class315.aShort3306;
				client.aShort8839 = Class51.aShort504;
				client.aShort8743 = Class396.aShort5193;
				Class87.aBoolean802 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jq.b(").append(')').toString());
		}
	}

	static final void method2118(ClientScript2 class403, byte i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) 116);
			Class119 class119 = Class389.aClass119Array4165[i_1_ >> 16];
			Class323.method3947(class105, class119, class403, 845844637);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jq.gk(").append(')').toString());
		}
	}

	public static void method2119(Class391 class391, int i, int i_2_) {
		try {
			if (Class300.anInt3213 * -991384187 < 50 && (null != class391 && class391.anIntArrayArray4187 != null && i < class391.anIntArrayArray4187.length && null != class391.anIntArrayArray4187[i])) {
				int i_3_ = class391.anIntArrayArray4187[i][0];
				int i_4_ = i_3_ >> 8;
				int i_5_ = i_3_ >> 5 & 0x7;
				if (class391.anIntArrayArray4187[i].length > 1) {
					int i_6_ = (int) (Math.random() * (double) (class391.anIntArrayArray4187[i]).length);
					if (i_6_ > 0)
						i_4_ = class391.anIntArrayArray4187[i][i_6_];
				}
				int i_7_ = 256;
				if (null != class391.anIntArray4183 && class391.anIntArray4190 != null)
					i_7_ = Class391.method4888(class391.anIntArray4183[i], class391.anIntArray4190[i], 1444813491);
				if (class391.aBoolean4173)
					Class320.method3913(i_4_, i_5_, 0, 255, false, i_7_, 1704835145);
				else
					Class239.method2210(i_4_, i_5_, 0, 255, i_7_, 1695425572);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jq.q(").append(')').toString());
		}
	}

	static final boolean method2120(int i, int i_8_, Class336 class336, Class289 class289, int i_9_) {
		try {
			int i_10_ = i;
			int i_11_ = i_8_;
			int i_12_ = 64;
			int i_13_ = 64;
			int i_14_ = i - i_12_;
			int i_15_ = i_8_ - i_13_;
			Class285.anIntArrayArray3076[i_12_][i_13_] = 99;
			Class285.anIntArrayArray3080[i_12_][i_13_] = 0;
			int i_16_ = 0;
			int i_17_ = 0;
			Class285.routeFinderXArray[i_16_] = i_10_;
			Class285.routeFinderYArray[i_16_++] = i_11_;
			int[][] is = class289.anIntArrayArray3155;
			while (i_17_ != i_16_) {
				i_10_ = Class285.routeFinderXArray[i_17_];
				i_11_ = Class285.routeFinderYArray[i_17_];
				i_17_ = i_17_ + 1 & 0xfff;
				i_12_ = i_10_ - i_14_;
				i_13_ = i_11_ - i_15_;
				int i_18_ = i_10_ - class289.anInt3151 * 1487776559;
				int i_19_ = i_11_ - 1415525851 * class289.anInt3152;
				if (class336.method4090(2, i_10_, i_11_, class289, -16711936)) {
					Class285.anInt3078 = 1021042197 * i_10_;
					ClanMember.anInt1684 = -575994451 * i_11_;
					return true;
				}
				int i_20_ = Class285.anIntArrayArray3080[i_12_][i_13_] + 1;
				if (i_12_ > 0) {
					if (0 != Class285.anIntArrayArray3076[i_12_ - 1][i_13_]) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else if (0 != (is[i_18_ - 1][i_19_] & 0x43a40000)) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[i_18_ - 1][1 + i_19_] & 0x4e240000) != 0) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else {
						Class285.routeFinderXArray[i_16_] = i_10_ - 1;
						Class285.routeFinderYArray[i_16_] = i_11_;
						i_16_ = i_16_ + 1 & 0xfff;
						Class285.anIntArrayArray3076[i_12_ - 1][i_13_] = 2;
						Class285.anIntArrayArray3080[i_12_ - 1][i_13_] = i_20_;
					}
				}
				if (i_12_ < 126) {
					if (0 != Class285.anIntArrayArray3076[1 + i_12_][i_13_]) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[i_18_ + 2][i_19_] & 0x60e40000) != 0) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else if (0 != (is[2 + i_18_][1 + i_19_] & 0x78240000)) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else {
						Class285.routeFinderXArray[i_16_] = i_10_ + 1;
						Class285.routeFinderYArray[i_16_] = i_11_;
						i_16_ = i_16_ + 1 & 0xfff;
						Class285.anIntArrayArray3076[1 + i_12_][i_13_] = 8;
						Class285.anIntArrayArray3080[i_12_ + 1][i_13_] = i_20_;
					}
				}
				if (i_13_ > 0) {
					if (0 != Class285.anIntArrayArray3076[i_12_][i_13_ - 1]) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if (0 != (is[i_18_][i_19_ - 1] & 0x43a40000)) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[i_18_ + 1][i_19_ - 1] & 0x60e40000) != 0) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else {
						Class285.routeFinderXArray[i_16_] = i_10_;
						Class285.routeFinderYArray[i_16_] = i_11_ - 1;
						i_16_ = i_16_ + 1 & 0xfff;
						Class285.anIntArrayArray3076[i_12_][i_13_ - 1] = 1;
						Class285.anIntArrayArray3080[i_12_][i_13_ - 1] = i_20_;
					}
				}
				if (i_13_ < 126) {
					if (Class285.anIntArrayArray3076[i_12_][1 + i_13_] != 0) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if (0 != (is[i_18_][2 + i_19_] & 0x4e240000)) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if (0 != (is[i_18_ + 1][i_19_ + 2] & 0x78240000)) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else {
						Class285.routeFinderXArray[i_16_] = i_10_;
						Class285.routeFinderYArray[i_16_] = 1 + i_11_;
						i_16_ = i_16_ + 1 & 0xfff;
						Class285.anIntArrayArray3076[i_12_][i_13_ + 1] = 4;
						Class285.anIntArrayArray3080[i_12_][1 + i_13_] = i_20_;
					}
				}
				if (i_12_ > 0 && i_13_ > 0) {
					if (Class285.anIntArrayArray3076[i_12_ - 1][i_13_ - 1] != 0) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[i_18_ - 1][i_19_] & 0x4fa40000) != 0) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[i_18_ - 1][i_19_ - 1] & 0x43a40000) != 0) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else if (0 != (is[i_18_][i_19_ - 1] & 0x63e40000)) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else {
						Class285.routeFinderXArray[i_16_] = i_10_ - 1;
						Class285.routeFinderYArray[i_16_] = i_11_ - 1;
						i_16_ = i_16_ + 1 & 0xfff;
						Class285.anIntArrayArray3076[i_12_ - 1][i_13_ - 1] = 3;
						Class285.anIntArrayArray3080[i_12_ - 1][i_13_ - 1] = i_20_;
					}
				}
				if (i_12_ < 126 && i_13_ > 0) {
					if (0 != (Class285.anIntArrayArray3076[1 + i_12_][i_13_ - 1])) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[i_18_ + 1][i_19_ - 1] & 0x63e40000) != 0) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[i_18_ + 2][i_19_ - 1] & 0x60e40000) != 0) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[2 + i_18_][i_19_] & 0x78e40000) != 0) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else {
						Class285.routeFinderXArray[i_16_] = i_10_ + 1;
						Class285.routeFinderYArray[i_16_] = i_11_ - 1;
						i_16_ = i_16_ + 1 & 0xfff;
						Class285.anIntArrayArray3076[i_12_ + 1][i_13_ - 1] = 9;
						Class285.anIntArrayArray3080[1 + i_12_][i_13_ - 1] = i_20_;
					}
				}
				if (i_12_ > 0 && i_13_ < 126) {
					if (0 != (Class285.anIntArrayArray3076[i_12_ - 1][1 + i_13_])) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[i_18_ - 1][1 + i_19_] & 0x4fa40000) != 0) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else if (0 != (is[i_18_ - 1][2 + i_19_] & 0x4e240000)) {
						if (i_9_ != -1327541421)
							throw new IllegalStateException();
					} else if ((is[i_18_][2 + i_19_] & 0x7e240000) != 0) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else {
						Class285.routeFinderXArray[i_16_] = i_10_ - 1;
						Class285.routeFinderYArray[i_16_] = i_11_ + 1;
						i_16_ = i_16_ + 1 & 0xfff;
						Class285.anIntArrayArray3076[i_12_ - 1][i_13_ + 1] = 6;
						Class285.anIntArrayArray3080[i_12_ - 1][1 + i_13_] = i_20_;
					}
				}
				if (i_12_ < 126 && i_13_ < 126) {
					if (0 != (Class285.anIntArrayArray3076[i_12_ + 1][1 + i_13_])) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else if ((is[1 + i_18_][2 + i_19_] & 0x7e240000) != 0) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else if ((is[2 + i_18_][2 + i_19_] & 0x78240000) != 0) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else if ((is[i_18_ + 2][1 + i_19_] & 0x78e40000) != 0) {
						if (i_9_ != -1327541421) {
							/* empty */
						}
					} else {
						Class285.routeFinderXArray[i_16_] = i_10_ + 1;
						Class285.routeFinderYArray[i_16_] = 1 + i_11_;
						i_16_ = i_16_ + 1 & 0xfff;
						Class285.anIntArrayArray3076[i_12_ + 1][1 + i_13_] = 12;
						Class285.anIntArrayArray3080[1 + i_12_][1 + i_13_] = i_20_;
					}
				}
			}
			Class285.anInt3078 = 1021042197 * i_10_;
			ClanMember.anInt1684 = -575994451 * i_11_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jq.b(").append(')').toString());
		}
	}

	static int method2121(String string, byte[] is, int i, byte i_21_) {
		try {
			int i_22_ = i;
			int i_23_ = string.length();
			for (int i_24_ = 0; i_24_ < i_23_; i_24_ += 4) {
				int i_25_ = ClanMember.method1773(string.charAt(i_24_), -40024446);
				int i_26_ = (i_24_ + 1 < i_23_ ? ClanMember.method1773(string.charAt(1 + i_24_), 1761771208) : -1);
				int i_27_ = (2 + i_24_ < i_23_ ? ClanMember.method1773(string.charAt(2 + i_24_), 623747518) : -1);
				int i_28_ = (i_24_ + 3 < i_23_ ? ClanMember.method1773(string.charAt(i_24_ + 3), 1229588136) : -1);
				is[i++] = (byte) (i_25_ << 2 | i_26_ >>> 4);
				if (i_27_ == -1)
					break;
				is[i++] = (byte) ((i_26_ & 0xf) << 4 | i_27_ >>> 2);
				if (-1 == i_28_)
					break;
				is[i++] = (byte) ((i_27_ & 0x3) << 6 | i_28_);
			}
			return i - i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jq.f(").append(')').toString());
		}
	}
}
