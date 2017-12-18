/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class271 {
	static int anInt2895 = 3;
	static int anInt2896 = 0;
	static int anInt2897 = 2;
	public static int anInt2898 = 1;

	Class271() throws Throwable {
		throw new Error();
	}

	static final void method2542(ClientScript2 class403, byte i) {
		try {
			if (Class372.aClass323_4052.method3936(81, -841277867))
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lg.ade(").append(')').toString());
		}
	}

	static boolean method2543(int i, int i_0_, int i_1_, int i_2_) {
		try {
			Class331 class331 = client.aClass283_8716.method2675(-1611682495);
			boolean bool = true;
			Interface3 interface3 = (Interface3) class331.method4031(i, i_0_, i_1_, 693483522);
			if (null != interface3)
				bool &= Class438_Sub2.method5849(interface3, (byte) -60);
			interface3 = (Interface3) class331.method4035(i, i_0_, i_1_, client.anInterface17_8960, 664102063);
			if (interface3 != null)
				bool &= Class438_Sub2.method5849(interface3, (byte) -4);
			interface3 = (Interface3) class331.method4058(i, i_0_, i_1_, (byte) 95);
			if (interface3 != null)
				bool &= Class438_Sub2.method5849(interface3, (byte) -3);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lg.k(").append(')').toString());
		}
	}

	static final void method2544(ClientScript2 class403, int i) {
		try {
			Class436.anInt5499 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) * 985311877;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lg.afn(").append(')').toString());
		}
	}

	public static Class456[] method2545(byte i) {
		try {
			if (null == Class100.aClass456Array1080) {
				Class456[] class456s = JS5Index.method1238(Class389.aClass457_4164, (short) 486);
				Class456[] class456s_3_ = new Class456[class456s.length];
				int i_4_ = 0;
				int i_5_ = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub8_7566.method5654(-1747444886);
				while_69_: for (int i_6_ = 0; i_6_ < class456s.length; i_6_++) {
					Class456 class456 = class456s[i_6_];
					if (class456.anInt5664 * -1087459453 > 0 && -1087459453 * class456.anInt5664 < 24) {
						if (i == 0)
							throw new IllegalStateException();
					} else if (class456.anInt5663 * 28445523 >= 800) {
						if (class456.anInt5665 * 262154323 < 600) {
							if (i == 0) {
								/* empty */
							}
						} else {
							if (i_5_ == 2) {
								if (class456.anInt5663 * 28445523 > 800)
									continue;
								if (class456.anInt5665 * 262154323 > 600) {
									if (i == 0)
										throw new IllegalStateException();
									continue;
								}
							}
							if (1 == i_5_) {
								if (class456.anInt5663 * 28445523 > 1024)
									continue;
								if (class456.anInt5665 * 262154323 > 768) {
									if (i == 0) {
										/* empty */
									}
									continue;
								}
							}
							for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
								Class456 class456_8_ = class456s_3_[i_7_];
								if ((class456.anInt5663 * 28445523 == 28445523 * class456_8_.anInt5663) && (262154323 * class456_8_.anInt5665 == 262154323 * class456.anInt5665)) {
									if (-1087459453 * class456.anInt5664 > -1087459453 * class456_8_.anInt5664)
										class456s_3_[i_7_] = class456;
									continue while_69_;
								}
							}
							class456s_3_[i_4_] = class456;
							i_4_++;
						}
					}
				}
				Class100.aClass456Array1080 = new Class456[i_4_];
				System.arraycopy(class456s_3_, 0, Class100.aClass456Array1080, 0, i_4_);
				int[] is = new int[Class100.aClass456Array1080.length];
				for (int i_9_ = 0; i_9_ < Class100.aClass456Array1080.length; i_9_++) {
					Class456 class456 = Class100.aClass456Array1080[i_9_];
					is[i_9_] = (28445523 * class456.anInt5663 * (262154323 * class456.anInt5665));
				}
				IComponentDefinition.method1129(is, Class100.aClass456Array1080, (byte) 98);
			}
			return Class100.aClass456Array1080;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lg.hm(").append(')').toString());
		}
	}

	static final void method2546(int i) {
		try {
			for (Class298_Sub1 class298_sub1 = ((Class298_Sub1) Class298_Sub1.aClass453_7152.method5939(1766612795)); null != class298_sub1; class298_sub1 = (Class298_Sub1) Class298_Sub1.aClass453_7152.method5944(49146))
				Class225.method2099(class298_sub1, false, (byte) 8);
			for (Class298_Sub1 class298_sub1 = ((Class298_Sub1) Class298_Sub1.aClass453_7162.method5939(1766612795)); class298_sub1 != null; class298_sub1 = (Class298_Sub1) Class298_Sub1.aClass453_7162.method5944(49146))
				Class225.method2099(class298_sub1, true, (byte) 8);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lg.i(").append(')').toString());
		}
	}

	static void method2547(int i) {
		try {
			Class3.anInt56 = 0;
			Class3.anInt62 = 1129029761;
			Class3.anInt54 = 1835291189;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lg.f(").append(')').toString());
		}
	}

	public static int method2548(byte[] is, int i, int i_10_) {
		try {
			return Class11.method328(is, 0, i, -1922082533);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lg.f(").append(')').toString());
		}
	}
}
