/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class219 implements Runnable {
	volatile boolean aBoolean2464;
	Class227 aClass227_2465;
	Interface12 anInterface12_2466 = new Class224();
	Interface12 anInterface12_2467 = null;
	long aLong2468;
	int anInt2469;
	long aLong2470;
	String aString2471;
	int anInt2472;
	boolean aBoolean2473;

	int method2033(int i) {
		try {
			return -514341095 * ((Class219) this).anInt2469;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.a(").append(')').toString());
		}
	}

	public Class227 method2034(int i) {
		try {
			return ((Class219) this).aClass227_2465;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.r(").append(')').toString());
		}
	}

	synchronized boolean method2035(int i) {
		try {
			return (((Class219) this).anInterface12_2466.method153(((Class219) this).aLong2468 * 6015775630087136145L));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.b(").append(')').toString());
		}
	}

	synchronized void method2036(Interface12 interface12, int i) {
		try {
			((Class219) this).anInterface12_2467 = ((Class219) this).anInterface12_2466;
			((Class219) this).anInterface12_2466 = interface12;
			((Class219) this).aLong2468 = Class122.method1319((byte) 1) * -5051392830202741391L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.p(").append(')').toString());
		}
	}

	Class219() {
		/* empty */
	}

	synchronized void method2037(byte i) {
		try {
			((Class219) this).aBoolean2473 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.f(").append(')').toString());
		}
	}

	public int method2038(int i) {
		try {
			return -1457416349 * ((Class219) this).anInt2472;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.d(").append(')').toString());
		}
	}

	public String method2039(short i) {
		try {
			return ((Class219) this).aString2471;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.u(").append(')').toString());
		}
	}

	public long method2040(int i) {
		try {
			return 3605481893406255809L * ((Class219) this).aLong2470;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.x(").append(')').toString());
		}
	}

	public int method2041(byte i) {
		try {
			if (null == ((Class219) this).aClass227_2465)
				return 0;
			int i_0_ = -861845079 * ((Class219) this).aClass227_2465.anInt2548;
			if (((Class227) ((Class219) this).aClass227_2465).aBoolean2550 && (-1457416349 * ((Class219) this).anInt2472 < -1620354451 * ((Class227) (((Class219) this).aClass227_2465)).anInt2552))
				return 1 + ((Class219) this).anInt2472 * -1457416349;
			if (i_0_ < 0 || i_0_ >= Class230.aClass227Array2561.length - 1)
				return 100;
			if (((Class219) this).anInt2472 * -1457416349 == (360399239 * ((Class227) ((Class219) this).aClass227_2465).anInt2551))
				return (-1620354451 * (((Class227) ((Class219) this).aClass227_2465).anInt2552));
			return (360399239 * ((Class227) ((Class219) this).aClass227_2465).anInt2551);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.k(").append(')').toString());
		}
	}

	void method2042(byte i) {
		try {
			((Class219) this).aBoolean2464 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.s(").append(')').toString());
		}
	}

	public void run() {
		try {
			while (!((Class219) this).aBoolean2464) {
				long l = Class122.method1319((byte) 1);
				synchronized (this) {
					try {
						((Class219) this).anInt2469 += -1941002967;
						if (((Class219) this).anInterface12_2466 instanceof Class224)
							((Class219) this).anInterface12_2466.method160(((Class219) this).aBoolean2473, 2139338781);
						else {
							long l_1_ = Class122.method1319((byte) 1);
							if (Class373.aClass_ra4071 != null && null != ((Class219) this).anInterface12_2467 && ((Class219) this).anInterface12_2467.method151(73548607) != 0 && ((6015775630087136145L * ((Class219) this).aLong2468) >= l_1_ - (long) (((Class219) this).anInterface12_2467.method151(-462627527)))) {
								int i = (int) ((l_1_ - (6015775630087136145L * (((Class219) this).aLong2468))) * 255L / (long) (((Class219) this).anInterface12_2467.method151(-362403732)));
								int i_2_ = 255 - i;
								i = i << 24 | 0xffffff;
								i_2_ = i_2_ << 24 | 0xffffff;
								Class148.method1614((byte) -69);
								Class373.aClass_ra4071.ba(1, 0);
								Class57 class57 = (Class373.aClass_ra4071.method5046(-2110394505 * Class462.anInt5683, (-1111710645 * Class298_Sub40_Sub9.anInt9716), true, -34894995));
								Class52_Sub1 class52_sub1 = Class373.aClass_ra4071.method5094();
								class52_sub1.method563(0, class57.method627());
								Class373.aClass_ra4071.method5143(class52_sub1, (byte) 28);
								((Class219) this).anInterface12_2467.method160(true, 2128455067);
								Class373.aClass_ra4071.method5005(class52_sub1, (byte) 8);
								class57.method631(0, 0, 0, i_2_, 1);
								Class373.aClass_ra4071.method5143(class52_sub1, (byte) -59);
								Class373.aClass_ra4071.ba(1, 0);
								((Class219) this).anInterface12_2466.method160(true, 2141475636);
								Class373.aClass_ra4071.method5005(class52_sub1, (byte) -56);
								class57.method631(0, 0, 0, i, 1);
							} else {
								if (((Class219) this).anInterface12_2467 != null) {
									((Class219) this).aBoolean2473 = true;
									((Class219) this).anInterface12_2467.method149((short) 371);
									((Class219) this).anInterface12_2467 = null;
								}
								if (((Class219) this).aBoolean2473) {
									Class148.method1614((byte) -56);
									if (Class373.aClass_ra4071 != null)
										Class373.aClass_ra4071.ba(1, 0);
								}
								((Class219) this).anInterface12_2466.method160((((Class219) this).aBoolean2473 || (Class373.aClass_ra4071 != null && Class373.aClass_ra4071.method5074())), 2145176958);
							}
							try {
								if (null != Class373.aClass_ra4071 && !(((Class219) this).anInterface12_2466 instanceof Class224))
									Class373.aClass_ra4071.method4988((byte) 101);
							} catch (Exception_Sub1 exception_sub1) {
								Class464.method6062(new StringBuilder().append(exception_sub1.getMessage()).append(Class385.aClient4141.method2761((byte) 1)).toString(), exception_sub1, (short) 3171);
								Class370.method4578(0, true, 622850291);
							}
						}
						((Class219) this).aBoolean2473 = false;
						if (null != Class373.aClass_ra4071 && !(((Class219) this).anInterface12_2466 instanceof Class224) && ((((Class219) this).aClass227_2465.anInt2548 * -861845079) < (-861845079 * Class227.aClass227_2545.anInt2548)))
							Class229.method2124((byte) -100);
					} catch (Exception exception) {
						continue;
					}
				}
				long l_3_ = Class122.method1319((byte) 1);
				int i = (int) (20L - (l_3_ - l));
				if (i > 0)
					Class464.method6060((long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.run(").append(')').toString());
		}
	}

	synchronized void method2043(long l, String string, int i, Class227 class227, int i_4_) {
		try {
			((Class219) this).aLong2470 = 1707169404099388737L * l;
			((Class219) this).aString2471 = string;
			((Class219) this).anInt2472 = i * -1376476597;
			((Class219) this).aClass227_2465 = class227;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.i(").append(')').toString());
		}
	}

	public static Class387 method2044(GraphicsToolkit class_ra, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			long l = (long) i_8_;
			Class387 class387 = (Class387) Class19.aClass348_264.method4184(l);
			int i_10_ = 2055;
			if (null == class387) {
				Model model = Model.method751(Class341.aClass243_3646, i_8_, 0);
				if (model == null)
					return null;
				if (model.size < 13)
					model.method755(2);
				class387 = class_ra.method5037(model, i_10_, -203714349 * Class481.anInt6035, 64, 768);
				Class19.aClass348_264.method4194(class387, l);
			}
			class387 = class387.method4755((byte) 6, i_10_, true);
			if (i != 0)
				class387.f(i);
			if (0 != i_5_)
				class387.t(i_5_);
			if (0 != i_6_)
				class387.EA(i_6_);
			if (0 != i_7_)
				class387.ia(0, i_7_, 0);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.a(").append(')').toString());
		}
	}

	public static int method2045(int i, int i_11_, int i_12_, byte i_13_) {
		try {
			i_12_ &= 0x3;
			if (0 == i_12_)
				return i;
			if (1 == i_12_)
				return i_11_;
			if (2 == i_12_)
				return 4095 - i;
			return 4095 - i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.b(").append(')').toString());
		}
	}

	static final void method2046(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1508815983 * class105.anInt1210;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.pe(").append(')').toString());
		}
	}

	public static final void method2047(int i) {
		try {
			Class298_Sub32_Sub22.anImage9468 = null;
			Class285.aFont3082 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.at(").append(')').toString());
		}
	}

	static final void method2048(ClientScript2 class403, byte i) {
		try {
			int i_14_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_14_, (byte) -71);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = class105.aString1212;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jf.rk(").append(')').toString());
		}
	}
}
