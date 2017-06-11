/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class284 {
	int anInt3046;
	public static boolean aBoolean3047;
	static int anInt3048;
	static int anInt3049 = 8;
	public static int anInt3050 = 256;
	long aLong3051;
	int[] anIntArray3052;
	boolean aBoolean3053 = false;
	Class298_Sub19 aClass298_Sub19_3054;
	int anInt3055 = -2056222048;
	int anInt3056;
	static Class288 aClass288_3057;
	Class298_Sub19[] aClass298_Sub19Array3058;
	public static int anInt3059;
	long aLong3060;
	int anInt3061;
	int anInt3062;
	int anInt3063;
	long aLong3064;
	boolean aBoolean3065;
	static int anInt3066 = 3;
	static int anInt3067 = 16384;
	static int anInt3068 = 2;
	static int anInt3069 = 4;
	static int anInt3070 = 286331153;
	int anInt3071;
	int anInt3072;
	Class298_Sub19[] aClass298_Sub19Array3073;

	public final synchronized void method2679(Class298_Sub19 class298_sub19, int i) {
		try {
			((Class284) this).aClass298_Sub19_3054 = class298_sub19;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.b(").append(')').toString());
		}
	}

	public final synchronized void method2680(int i) {
		try {
			if (!((Class284) this).aBoolean3053) {
				long l = Class122.method1319((byte) 1);
				try {
					if (l > (6353619706144323107L * ((Class284) this).aLong3051 + 6000L))
						((Class284) this).aLong3051 = -2662467539374708341L * (l - 6000L);
					for (/**/; (l > (6353619706144323107L * ((Class284) this).aLong3051 + 5000L)); l = Class122.method1319((byte) 1)) {
						method2681(256, -518493991);
						((Class284) this).aLong3051 += (-2662467539374708341L * (long) (256000 / (anInt3059 * 1164070869)));
					}
				} catch (Exception exception) {
					((Class284) this).aLong3051 = -2662467539374708341L * l;
				}
				if (null != ((Class284) this).anIntArray3052) {
					try {
						if (0L != (-2629227736231104439L * ((Class284) this).aLong3060)) {
							if (l < (((Class284) this).aLong3060 * -2629227736231104439L))
								return;
							method2684((((Class284) this).anInt3046 * -1894797445), 816646714);
							((Class284) this).aLong3060 = 0L;
							((Class284) this).aBoolean3065 = true;
						}
						int i_0_ = method2688(-2047791436);
						if (((Class284) this).anInt3063 * -25238017 - i_0_ > 1581283719 * ((Class284) this).anInt3061)
							((Class284) this).anInt3061 = (-2137785289 * (-25238017 * ((Class284) this).anInt3063 - i_0_));
						int i_1_ = (((Class284) this).anInt3056 * 444653019 + ((Class284) this).anInt3071 * 1513728603);
						if (i_1_ + 256 > 16384)
							i_1_ = 16128;
						if (i_1_ + 256 > -1894797445 * ((Class284) this).anInt3046) {
							((Class284) this).anInt3046 += -480326656;
							if (-1894797445 * ((Class284) this).anInt3046 > 16384)
								((Class284) this).anInt3046 = 904708096;
							method2686(331463442);
							method2684((((Class284) this).anInt3046 * -1894797445), 1013749816);
							i_0_ = 0;
							((Class284) this).aBoolean3065 = true;
							if (i_1_ + 256 > ((Class284) this).anInt3046 * -1894797445) {
								i_1_ = (-1894797445 * ((Class284) this).anInt3046) - 256;
								((Class284) this).anInt3056 = (-1422272941 * (i_1_ - (((Class284) this).anInt3071 * 1513728603)));
							}
						}
						for (/**/; i_0_ < i_1_; i_0_ += 256) {
							method2682(((Class284) this).anIntArray3052, 256);
							method2685();
						}
						if (l > (((Class284) this).aLong3064 * -9016197443635909135L)) {
							if (!((Class284) this).aBoolean3065) {
								if ((((Class284) this).anInt3061 * 1581283719 == 0) && 0 == (-1912576967 * ((Class284) this).anInt3062)) {
									method2686(331463442);
									((Class284) this).aLong3060 = (2000L + l) * -3392636722701155847L;
									return;
								}
								((Class284) this).anInt3056 = (Math.min((((Class284) this).anInt3062 * -1912576967), 1581283719 * (((Class284) this).anInt3061)) * -1422272941);
								((Class284) this).anInt3062 = ((Class284) this).anInt3061 * -43955265;
							} else
								((Class284) this).aBoolean3065 = false;
							((Class284) this).anInt3061 = 0;
							((Class284) this).aLong3064 = 6449118444469183249L * (l + 2000L);
						}
						((Class284) this).anInt3063 = i_0_ * 1927092735;
					} catch (Exception exception) {
						method2686(331463442);
						((Class284) this).aLong3060 = (l + 2000L) * -3392636722701155847L;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.p(").append(')').toString());
		}
	}

	final void method2681(int i, int i_2_) {
		try {
			((Class284) this).anInt3072 -= i * -1831995011;
			if (-577697835 * ((Class284) this).anInt3072 < 0)
				((Class284) this).anInt3072 = 0;
			if (((Class284) this).aClass298_Sub19_3054 != null)
				((Class284) this).aClass298_Sub19_3054.method2935(i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.d(").append(')').toString());
		}
	}

	final void method2682(int[] is, int i) {
		int i_3_ = i;
		if (aBoolean3047)
			i_3_ <<= 1;
		Class425.method5742(is, 0, i_3_);
		((Class284) this).anInt3072 -= i * -1831995011;
		if (null != ((Class284) this).aClass298_Sub19_3054 && ((Class284) this).anInt3072 * -577697835 <= 0) {
			((Class284) this).anInt3072 += -1831995011 * (anInt3059 * 1164070869 >> 4);
			Class62.method731(((Class284) this).aClass298_Sub19_3054, -1934060670);
			method2691(((Class284) this).aClass298_Sub19_3054, ((Class284) this).aClass298_Sub19_3054.method2950(), (byte) -73);
			int i_4_ = 0;
			int i_5_ = 255;
			int i_6_ = 7;
			while_72_: while (0 != i_5_) {
				int i_7_;
				int i_8_;
				if (i_6_ < 0) {
					i_7_ = i_6_ & 0x3;
					i_8_ = -(i_6_ >> 2);
				} else {
					i_7_ = i_6_;
					i_8_ = 0;
				}
				for (int i_9_ = i_5_ >>> i_7_ & 0x11111111; 0 != i_9_; i_9_ >>>= 4) {
					if (0 != (i_9_ & 0x1)) {
						i_5_ &= 1 << i_7_ ^ 0xffffffff;
						Class298_Sub19 class298_sub19 = null;
						Class298_Sub19 class298_sub19_10_ = ((Class284) this).aClass298_Sub19Array3058[i_7_];
						while (class298_sub19_10_ != null) {
							Class298_Sub26 class298_sub26 = (((Class298_Sub19) class298_sub19_10_).aClass298_Sub26_7312);
							if (null != class298_sub26 && (((Class298_Sub26) class298_sub26).anInt7362 > i_8_)) {
								i_5_ |= 1 << i_7_;
								class298_sub19 = class298_sub19_10_;
								class298_sub19_10_ = (((Class298_Sub19) class298_sub19_10_).aClass298_Sub19_7313);
							} else {
								((Class298_Sub19) class298_sub19_10_).aBoolean7310 = true;
								int i_11_ = class298_sub19_10_.method2929();
								i_4_ += i_11_;
								if (class298_sub26 != null)
									((Class298_Sub26) class298_sub26).anInt7362 += i_11_;
								if (i_4_ >= (1853708541 * ((Class284) this).anInt3055))
									break while_72_;
								Class298_Sub19 class298_sub19_12_ = class298_sub19_10_.method2930();
								if (null != class298_sub19_12_) {
									int i_13_ = (((Class298_Sub19) class298_sub19_10_).anInt7311);
									for (/**/; class298_sub19_12_ != null; class298_sub19_12_ = class298_sub19_10_.method2931())
										method2691(class298_sub19_12_, (i_13_ * class298_sub19_12_.method2950() >> 8), (byte) -50);
								}
								Class298_Sub19 class298_sub19_14_ = (((Class298_Sub19) class298_sub19_10_).aClass298_Sub19_7313);
								((Class298_Sub19) class298_sub19_10_).aClass298_Sub19_7313 = null;
								if (null == class298_sub19)
									((Class284) this).aClass298_Sub19Array3058[i_7_] = class298_sub19_14_;
								else
									((Class298_Sub19) class298_sub19).aClass298_Sub19_7313 = class298_sub19_14_;
								if (class298_sub19_14_ == null)
									((Class284) this).aClass298_Sub19Array3073[i_7_] = class298_sub19;
								class298_sub19_10_ = class298_sub19_14_;
							}
						}
					}
					i_7_ += 4;
					i_8_++;
				}
				i_6_--;
			}
			for (i_6_ = 0; i_6_ < 8; i_6_++) {
				Class298_Sub19 class298_sub19 = ((Class284) this).aClass298_Sub19Array3058[i_6_];
				Class298_Sub19[] class298_sub19s = ((Class284) this).aClass298_Sub19Array3058;
				int i_15_ = i_6_;
				((Class284) this).aClass298_Sub19Array3073[i_6_] = null;
				class298_sub19s[i_15_] = null;
				Class298_Sub19 class298_sub19_16_;
				for (/**/; null != class298_sub19; class298_sub19 = class298_sub19_16_) {
					class298_sub19_16_ = (((Class298_Sub19) class298_sub19).aClass298_Sub19_7313);
					((Class298_Sub19) class298_sub19).aClass298_Sub19_7313 = null;
				}
			}
		}
		if (-577697835 * ((Class284) this).anInt3072 < 0)
			((Class284) this).anInt3072 = 0;
		if (((Class284) this).aClass298_Sub19_3054 != null)
			((Class284) this).aClass298_Sub19_3054.method2934(is, 0, i);
		((Class284) this).aLong3051 = Class122.method1319((byte) 1) * -2662467539374708341L;
	}

	void method2683(Component component, byte i) throws Exception {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.q(").append(')').toString());
		}
	}

	void method2684(int i, int i_17_) throws Exception {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.n(").append(')').toString());
		}
	}

	void method2685() throws Exception {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.z(").append(')').toString());
		}
	}

	void method2686(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.y(").append(')').toString());
		}
	}

	void method2687(short i) throws Exception {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.t(").append(')').toString());
		}
	}

	int method2688(int i) throws Exception {
		try {
			return -1894797445 * ((Class284) this).anInt3046;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.s(").append(')').toString());
		}
	}

	Class284() {
		((Class284) this).aLong3051 = Class122.method1319((byte) 1) * -2662467539374708341L;
		((Class284) this).aLong3060 = 0L;
		((Class284) this).anInt3061 = 0;
		((Class284) this).anInt3062 = 0;
		((Class284) this).anInt3063 = 0;
		((Class284) this).aLong3064 = 0L;
		((Class284) this).aBoolean3065 = true;
		((Class284) this).anInt3072 = 0;
		((Class284) this).aClass298_Sub19Array3058 = new Class298_Sub19[8];
		((Class284) this).aClass298_Sub19Array3073 = new Class298_Sub19[8];
	}

	public final synchronized void method2689(int i) {
		try {
			((Class284) this).aBoolean3065 = true;
			try {
				method2687((short) -24697);
			} catch (Exception exception) {
				method2686(331463442);
				((Class284) this).aLong3060 = ((Class122.method1319((byte) 1) + 2000L) * -3392636722701155847L);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.i(").append(')').toString());
		}
	}

	public final synchronized void method2690(byte i) {
		try {
			if (aClass288_3057 != null) {
				boolean bool = true;
				for (int i_18_ = 0; i_18_ < 2; i_18_++) {
					if (this == (((Class288) aClass288_3057).aClass284Array3104[i_18_]))
						((Class288) aClass288_3057).aClass284Array3104[i_18_] = null;
					if (((Class288) aClass288_3057).aClass284Array3104[i_18_] != null)
						bool = false;
				}
				if (bool) {
					((Class288) aClass288_3057).aBoolean3103 = true;
					while (((Class288) aClass288_3057).aBoolean3102)
						Class464.method6060(50L);
					aClass288_3057 = null;
				}
			}
			method2686(331463442);
			((Class284) this).anIntArray3052 = null;
			((Class284) this).aBoolean3053 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.k(").append(')').toString());
		}
	}

	final void method2691(Class298_Sub19 class298_sub19, int i, byte i_19_) {
		try {
			int i_20_ = i >> 5;
			Class298_Sub19 class298_sub19_21_ = ((Class284) this).aClass298_Sub19Array3073[i_20_];
			if (null == class298_sub19_21_)
				((Class284) this).aClass298_Sub19Array3058[i_20_] = class298_sub19;
			else
				((Class298_Sub19) class298_sub19_21_).aClass298_Sub19_7313 = class298_sub19;
			((Class284) this).aClass298_Sub19Array3073[i_20_] = class298_sub19;
			((Class298_Sub19) class298_sub19).anInt7311 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.r(").append(')').toString());
		}
	}

	public static void method2692(int i, int i_22_) {
		try {
			synchronized (Class366.aClass348_3979) {
				Class366.aClass348_3979.method4186(i, -1178838695);
			}
			synchronized (Class366.aClass348_3980) {
				Class366.aClass348_3980.method4186(i, 391081227);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.s(").append(')').toString());
		}
	}

	static final void method2693(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1156 * -2093041337;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.oc(").append(')').toString());
		}
	}

	static final void method2694(IComponentDefinition class105, ClientScript2 class403, int i) {
		try {
			int i_23_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_24_ = ((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) - 1);
			if (class105.anInt1184 * 1548853569 != 6 && 2 != class105.anInt1184 * 1548853569)
				throw new RuntimeException("");
			SomethingDefinitions class503 = Class15.aClass507_224.method6269(class105.anInt1151 * 572201537, 2035169508);
			if (class105.aClass498_1307 == null)
				class105.aClass498_1307 = new Class498(class503, 1548853569 * class105.anInt1184 == 6);
			class105.aClass498_1307.aLong6110 = Class382.method4686(954429430) * 3177550440302969639L;
			if (null == class503.aShortArray6134 || i_24_ < 0 || i_24_ >= class503.aShortArray6134.length)
				throw new RuntimeException("");
			class105.aClass498_1307.aShortArray6109[i_24_] = (short) i_23_;
			Tradution.method6054(class105, -579030149);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.qi(").append(')').toString());
		}
	}

	static final void method2695(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub6_7551.method5647(207850013) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.ajo(").append(')').toString());
		}
	}

	static final void method2696(IComponentDefinition class105, Class119 class119, ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_25_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_26_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			Class497 class497 = Class92.aClass504_905.method6251(i_25_, 493338480);
			if (class497.anInt6100 * -388931549 != i_26_)
				class105.method1125(i_25_, i_26_, 1223650775);
			else
				class105.method1123(i_25_, 1279288503);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.gp(").append(')').toString());
		}
	}

	static final void method2697(ClientScript2 class403, int i) {
		try {
			int i_27_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ObjectDefinitions.method5788((char) i_27_, (short) 160) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lu.zq(").append(')').toString());
		}
	}
}
