/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class175 {
	static final short aShort2142 = 17;
	static final short aShort2143 = 3;
	static final short aShort2144 = 1002;
	static final short aShort2145 = 2;
	static final short aShort2146 = 5;
	static final short aShort2147 = 8;
	static final short aShort2148 = 9;
	static final short aShort2149 = 60;
	static final short aShort2150 = 11;
	static final short aShort2151 = 1008;
	static final short aShort2152 = 13;
	static final short aShort2153 = 15;
	static final short aShort2154 = 16;
	static final short aShort2155 = 50;
	static final short aShort2156 = 18;
	static final short aShort2157 = 22;
	static final short aShort2158 = 20;
	static final short aShort2159 = 21;
	static final short aShort2160 = 12;
	static final short aShort2161 = 44;
	static final short aShort2162 = 25;
	static final short aShort2163 = 30;
	static final short aShort2164 = 19;
	static final short aShort2165 = 1004;
	static final short aShort2166 = 45;
	static final short aShort2167 = 47;
	static final short aShort2168 = 48;
	static final short aShort2169 = 6;
	static final short aShort2170 = 10;
	static final short aShort2171 = 51;
	static final short aShort2172 = 52;
	static final short aShort2173 = 53;
	static final short aShort2174 = 57;
	static final short aShort2175 = 23;
	static final short aShort2176 = 59;
	static final short aShort2177 = 49;
	static final short aShort2178 = 58;
	static final short aShort2179 = 1001;
	static final short aShort2180 = 1003;
	static final short aShort2181 = 1006;
	static final short aShort2182 = 4;
	static final short aShort2183 = 1007;
	static final short aShort2184 = 46;
	static final short aShort2185 = 1009;
	static final short aShort2186 = 1010;
	static final short aShort2187 = 1011;
	static final short aShort2188 = 1012;

	Class175() throws Throwable {
		throw new Error();
	}

	public static Class346 method2958(RsByteBuffer class282_sub35, int i) {
		Class346 class346 = new Class346();
		class346.anInt4048 = class282_sub35.readUnsignedShort() * -1506067503;
		class346.aClass282_Sub50_Sub9_4047 = IndexLoaders.aClass429_4265.method7214(-624100047 * class346.anInt4048, -1825001188);
		return class346;
	}

	static final void method2959(CS2Executor class527, int i) {
		int i_0_ = ((class527.unknown[301123709 * class527.instrPtr]) >> 16);
		int i_1_ = ((class527.unknown[class527.instrPtr * 301123709]) & 0xffff);
		int i_2_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_2_ < 0 || i_2_ > 5000)
			throw new RuntimeException();
		class527.globalArrayLengths[i_0_] = i_2_;
		int i_3_ = -1;
		if (i_1_ == 105)
			i_3_ = 0;
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
			class527.globalArrays[i_0_][i_4_] = i_3_;
	}

	static final void method2960(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class118.aBool1363 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 9);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Class244.method4196(-1952846363 * class118.anInt1287, (byte) 0);
	}

	static final void method2961(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_5_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_6_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_5_ - i_6_;
	}

	public static boolean method2962(char c, int i) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = Class490.aCharArray5766;
			for (int i_7_ = 0; i_7_ < cs.length; i_7_++) {
				char c_8_ = cs[i_7_];
				if (c == c_8_)
					return true;
			}
		}
		return false;
	}

	static final void method2963(CS2Executor class527, int i) {
		int i_9_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (Class291_Sub1.aClass465_8029 != null) {
			Node class282 = Class291_Sub1.aClass465_8029.method7754((long) i_9_);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282 != null ? 1 : 0;
		} else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static void method2964(Class282_Sub48 class282_sub48, int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (1399704573 * ((Class282_Sub48) class282_sub48).anInt8095 != -1 || null != ((Class282_Sub48) class282_sub48).anIntArray8102) {
			int i_14_ = 0;
			int i_15_ = ((((Class282_Sub48) class282_sub48).anInt8089 * -301211853 * Class393.aClass282_Sub54_4783.aClass468_Sub13_8193.method12714(2107219176)) >> 8);
			if (i_10_ > ((Class282_Sub48) class282_sub48).anInt8079 * -9275899)
				i_14_ += i_10_ - (((Class282_Sub48) class282_sub48).anInt8079 * -9275899);
			else if (i_10_ < (((Class282_Sub48) class282_sub48).anInt8107 * -2014043967))
				i_14_ += -2014043967 * (((Class282_Sub48) class282_sub48).anInt8107) - i_10_;
			if (i_11_ > 517331721 * ((Class282_Sub48) class282_sub48).anInt8077)
				i_14_ += i_11_ - 517331721 * (((Class282_Sub48) class282_sub48).anInt8077);
			else if (i_11_ < (((Class282_Sub48) class282_sub48).anInt8078 * 1548025077))
				i_14_ += (((Class282_Sub48) class282_sub48).anInt8078 * 1548025077) - i_11_;
			if (0 == -60999179 * ((Class282_Sub48) class282_sub48).anInt8105 || (i_14_ - 256 > -60999179 * ((Class282_Sub48) class282_sub48).anInt8105) || Class393.aClass282_Sub54_4783.aClass468_Sub13_8193.method12714(1276396243) == 0 || (((Class282_Sub48) class282_sub48).anInt8076 * -23801959 != i)) {
				if (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 != null) {
					Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
					((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8082 = null;
					((Class282_Sub48) class282_sub48).aClass282_Sub18_8097 = null;
				}
				if (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096 != null) {
					Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096);
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096 = null;
					((Class282_Sub48) class282_sub48).aClass282_Sub18_8087 = null;
					((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8106 = null;
				}
			} else {
				i_14_ -= 256;
				if (i_14_ < 0)
					i_14_ = 0;
				int i_16_ = (((Class282_Sub48) class282_sub48).anInt8105 * -60999179 - (1464439541 * ((Class282_Sub48) class282_sub48).anInt8081));
				if (i_16_ < 0)
					i_16_ = (((Class282_Sub48) class282_sub48).anInt8105 * -60999179);
				int i_17_ = i_15_;
				int i_18_ = i_14_ - (((Class282_Sub48) class282_sub48).anInt8081 * 1464439541);
				if (i_18_ > 0 && i_16_ > 0)
					i_17_ = i_15_ * (i_16_ - i_18_) / i_16_;
				Class84.myPlayer.method15805(828768449);
				int i_19_ = 8192;
				int i_20_ = (((-2014043967 * ((Class282_Sub48) class282_sub48).anInt8107) + -9275899 * (((Class282_Sub48) class282_sub48).anInt8079)) / 2 - i_10_);
				int i_21_ = (1548025077 * ((Class282_Sub48) class282_sub48).anInt8078 + 517331721 * (((Class282_Sub48) class282_sub48).anInt8077)) / 2 - i_11_;
				if (i_20_ != 0 || i_21_ != 0) {
					int i_22_ = ((-(1236051449 * AnimationDefinitions.anInt5930) - (int) (Math.atan2((double) i_20_, (double) i_21_) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_22_ > 8192)
						i_22_ = 16384 - i_22_;
					int i_23_;
					if (i_14_ <= 0)
						i_23_ = 8192;
					else if (i_14_ >= 4096)
						i_23_ = 16384;
					else
						i_23_ = 8192 * i_14_ / 4096 + 8192;
					i_19_ = i_22_ * i_23_ / 8192 + (16384 - i_23_ >> 1);
				}
				if (null == (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099)) {
					if ((1399704573 * ((Class282_Sub48) class282_sub48).anInt8095) >= 0) {
						i_20_ = ((256 == (((Class282_Sub48) class282_sub48).anInt8094) * -280457961 && (-937948423 * ((Class282_Sub48) class282_sub48).anInt8093 == 256)) ? 256 : Class76.method1356((-937948423 * (((Class282_Sub48) class282_sub48).anInt8093)), (-280457961 * (((Class282_Sub48) class282_sub48).anInt8094)), -1021175029));
						if (((Class282_Sub48) class282_sub48).aBool8098) {
							if ((((Class282_Sub48) class282_sub48).aClass282_Sub18_8097) == null)
								((Class282_Sub48) class282_sub48).aClass282_Sub18_8097 = (Class282_Sub18.method12270(IndexLoaders.MIDI_INSTRUMENT_INDEX, (1399704573 * (((Class282_Sub48) class282_sub48).anInt8095))));
							if (null != (((Class282_Sub48) class282_sub48).aClass282_Sub18_8097)) {
								if (null == (((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8082))
									((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8082 = ((Class282_Sub48) class282_sub48).aClass282_Sub18_8097.method12272();
								if (null != (((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8082)) {
									Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1 = ((Class282_Sub15_Sub5_Sub1) (((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8082.method15225(i_20_, i_17_ << 6, i_19_)));
									class282_sub15_sub5_sub1.method15325(-1, (byte) 8);
									Class79.aClass282_Sub15_Sub4_783.method15275(class282_sub15_sub5_sub1);
									((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = class282_sub15_sub5_sub1;
								}
							}
						} else {
							Class343 class343 = Class343.method6094(IndexLoaders.SOUND_EFFECT_INDEX, (1399704573 * (((Class282_Sub48) class282_sub48).anInt8095)), 0);
							if (null != class343) {
								Class282_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2 = (class343.method6089().method16062(Class119.aClass344_1460));
								Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2 = ((Class282_Sub15_Sub5_Sub2) (class282_sub26_sub1_sub2.method15225(i_20_, i_17_ << 6, i_19_)));
								class282_sub15_sub5_sub2.method15325(-1, (byte) 8);
								Class79.aClass282_Sub15_Sub4_783.method15275(class282_sub15_sub5_sub2);
								((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = class282_sub15_sub5_sub2;
							}
						}
					}
				} else {
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099.method15312(i_17_, (byte) 58);
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099.method15340(i_19_, -1345145813);
				}
				if (null == (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096)) {
					if ((null != ((Class282_Sub48) class282_sub48).anIntArray8102) && (((Class282_Sub48) class282_sub48).anInt8080 -= i_12_ * 401671005) * -1690146571 <= 0) {
						i_20_ = ((-280457961 * (((Class282_Sub48) class282_sub48).anInt8094) == 256 && (((Class282_Sub48) class282_sub48).anInt8093 * -937948423) == 256) ? 256 : ((int) (Math.random() * (double) ((-280457961 * (((Class282_Sub48) class282_sub48).anInt8094)) - ((((Class282_Sub48) class282_sub48).anInt8093) * -937948423))) + -937948423 * ((Class282_Sub48) class282_sub48).anInt8093));
						if (((Class282_Sub48) class282_sub48).aBool8103) {
							if (null == (((Class282_Sub48) class282_sub48).aClass282_Sub18_8087)) {
								i_21_ = (int) (Math.random() * (double) (((Class282_Sub48) class282_sub48).anIntArray8102).length);
								((Class282_Sub48) class282_sub48).aClass282_Sub18_8087 = (Class282_Sub18.method12270(IndexLoaders.MIDI_INSTRUMENT_INDEX, (((Class282_Sub48) class282_sub48).anIntArray8102[i_21_])));
							}
							if (null != (((Class282_Sub48) class282_sub48).aClass282_Sub18_8087)) {
								if (null == (((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8106))
									((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8106 = ((Class282_Sub48) class282_sub48).aClass282_Sub18_8087.method12272();
								if (null != (((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8106)) {
									Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1 = ((Class282_Sub15_Sub5_Sub1) (((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8106.method15225(i_20_, i_17_ << 6, i_19_)));
									class282_sub15_sub5_sub1.method15325(0, (byte) 8);
									Class79.aClass282_Sub15_Sub4_783.method15275(class282_sub15_sub5_sub1);
									((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096 = class282_sub15_sub5_sub1;
									((Class282_Sub48) class282_sub48).anInt8080 = (((((Class282_Sub48) class282_sub48).anInt8072) * 1317424347 + (int) (Math.random() * (double) (((((Class282_Sub48) class282_sub48).anInt8101) * -1084771983) - (1317424347 * (((Class282_Sub48) class282_sub48).anInt8072))))) * 401671005);
								}
							}
						} else {
							i_21_ = (int) (Math.random() * (double) (((Class282_Sub48) class282_sub48).anIntArray8102).length);
							Class343 class343 = Class343.method6094(IndexLoaders.SOUND_EFFECT_INDEX, (((Class282_Sub48) class282_sub48).anIntArray8102[i_21_]), 0);
							if (null != class343) {
								Class282_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2 = (class343.method6089().method16062(Class119.aClass344_1460));
								Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2 = ((Class282_Sub15_Sub5_Sub2) (class282_sub26_sub1_sub2.method15225(i_20_, i_17_ << 6, i_19_)));
								class282_sub15_sub5_sub2.method15325(0, (byte) 8);
								Class79.aClass282_Sub15_Sub4_783.method15275(class282_sub15_sub5_sub2);
								((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096 = class282_sub15_sub5_sub2;
								((Class282_Sub48) class282_sub48).anInt8080 = ((1317424347 * ((Class282_Sub48) class282_sub48).anInt8072 + (int) (Math.random() * (double) (((((Class282_Sub48) class282_sub48).anInt8101) * -1084771983) - ((((Class282_Sub48) class282_sub48).anInt8072) * 1317424347)))) * 401671005);
							}
						}
					}
				} else {
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096.method15312(i_17_, (byte) 125);
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096.method15340(i_19_, -1828796659);
					if (!((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096.method4994(274080272)) {
						((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096 = null;
						((Class282_Sub48) class282_sub48).aClass282_Sub18_8087 = null;
						((Class282_Sub48) class282_sub48).aClass282_Sub26_Sub1_Sub1_8106 = null;
					}
				}
			}
		}
	}

	static final void method2965(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i <= 0)
				return;
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_24_ = class513;
		Class118 class118 = ((UnderlayDefinition) class513_24_).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513_24_).aClass98_5885;
		Class504.method8387(class118, class98, class527, 2021162647);
	}

	static void method2966(int i, int i_25_, short i_26_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.method4778(12, (long) i);
		class282_sub50_sub12.method14995(1634011909);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = -1773141545 * i_25_;
	}
}
