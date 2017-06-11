/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public final class Class253 {
	AbstractQueue_Sub1 anAbstractQueue_Sub1_2779;
	int anInt2780;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_2781;
	long aLong2782;
	Class254 aClass254_2783;
	Map aMap2784;
	public static Interface_ma anInterface_ma2785;

	public Object method2411(Object object, Object object_0_, byte i) {
		try {
			synchronized (this) {
				if (-7599200929196954985L * ((Class253) this).aLong2782 != -1L)
					method2415(-1215407622);
				Class261 class261 = (Class261) ((Class253) this).aMap2784.get(object);
				if (class261 != null) {
					Object object_1_ = ((Class261) class261).anObject2822;
					((Class261) class261).anObject2822 = object_0_;
					method2414(class261, false, (byte) 115);
					Object object_2_ = object_1_;
					return object_2_;
				}
				if (method2412((byte) 3) && (((Class253) this).aMap2784.size() == 582284141 * ((Class253) this).anInt2780)) {
					Class261 class261_3_ = (Class261) ((Class253) this).anAbstractQueue_Sub1_2781.remove();
					((Class253) this).aMap2784.remove(((Class261) class261_3_).anObject2824);
					((Class253) this).anAbstractQueue_Sub1_2779.remove(class261_3_);
				}
				Class261 class261_4_ = new Class261(object_0_, object);
				((Class253) this).aMap2784.put(object, class261_4_);
				method2414(class261_4_, true, (byte) 18);
				Object object_5_ = null;
				return object_5_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.b(").append(')').toString());
		}
	}

	Class253(long l, int i, Class254 class254) {
		((Class253) this).aLong2782 = -611323927505636057L * l;
		((Class253) this).anInt2780 = i * -1292104091;
		((Class253) this).aClass254_2783 = class254;
		if (((Class253) this).anInt2780 * 582284141 == -1) {
			((Class253) this).aMap2784 = new HashMap(64);
			((Class253) this).anAbstractQueue_Sub1_2779 = new AbstractQueue_Sub1(64);
			((Class253) this).anAbstractQueue_Sub1_2781 = null;
		} else {
			if (null == ((Class253) this).aClass254_2783)
				throw new IllegalArgumentException("");
			((Class253) this).aMap2784 = new HashMap(((Class253) this).anInt2780 * 582284141);
			((Class253) this).anAbstractQueue_Sub1_2779 = new AbstractQueue_Sub1(582284141 * ((Class253) this).anInt2780);
			((Class253) this).anAbstractQueue_Sub1_2781 = new AbstractQueue_Sub1(582284141 * ((Class253) this).anInt2780);
		}
	}

	boolean method2412(byte i) {
		try {
			return ((Class253) this).anInt2780 * 582284141 != -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.a(").append(')').toString());
		}
	}

	public Object method2413(Object object, byte i) {
		try {
			synchronized (this) {
				if (-7599200929196954985L * ((Class253) this).aLong2782 != -1L)
					method2415(-379360900);
				Class261 class261 = (Class261) ((Class253) this).aMap2784.get(object);
				if (class261 == null) {
					Object object_6_ = null;
					return object_6_;
				}
				method2414(class261, false, (byte) 110);
				Object object_7_ = ((Class261) class261).anObject2822;
				return object_7_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.f(").append(')').toString());
		}
	}

	public Class253(int i, Class254 class254) {
		this(-1L, i, class254);
	}

	void method2414(Class261 class261, boolean bool, byte i) {
		try {
			if (!bool) {
				((Class253) this).anAbstractQueue_Sub1_2779.remove(class261);
				if (method2412((byte) 3) && !((Class253) this).anAbstractQueue_Sub1_2781.remove(class261))
					throw new IllegalStateException("");
			}
			((Class261) class261).aLong2823 = System.currentTimeMillis() * 7489795633800790139L;
			if (method2412((byte) 3)) {
				switch (((Class254) ((Class253) this).aClass254_2783).anInt2788 * -1142442207) {
				case 0:
					((Class261) class261).aLong2821 = (((Class261) class261).aLong2823 * 9087373979742177181L);
					break;
				case 1:
					((Class261) class261).aLong2821 += 8711051982827645039L;
					break;
				}
				((Class253) this).anAbstractQueue_Sub1_2781.add(class261);
			}
			((Class253) this).anAbstractQueue_Sub1_2779.add(class261);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.i(").append(')').toString());
		}
	}

	void method2415(int i) {
		try {
			if (((Class253) this).aLong2782 * -7599200929196954985L == -1L)
				throw new IllegalStateException("");
			long l = (System.currentTimeMillis() - -7599200929196954985L * ((Class253) this).aLong2782);
			while_67_: do {
				for (;;) {
					if (((Class253) this).anAbstractQueue_Sub1_2779.isEmpty())
						break while_67_;
					Class261 class261 = ((Class261) ((Class253) this).anAbstractQueue_Sub1_2779.peek());
					if (2922630875768299187L * ((Class261) class261).aLong2823 >= l)
						break;
					((Class253) this).aMap2784.remove(((Class261) class261).anObject2824);
					((Class253) this).anAbstractQueue_Sub1_2779.remove(class261);
					if (method2412((byte) 3))
						((Class253) this).anAbstractQueue_Sub1_2781.remove(class261);
				}
				break;
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.k(").append(')').toString());
		}
	}

	public void method2416(int i) {
		try {
			synchronized (this) {
				((Class253) this).aMap2784.clear();
				((Class253) this).anAbstractQueue_Sub1_2779.clear();
				if (method2412((byte) 3))
					((Class253) this).anAbstractQueue_Sub1_2781.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.d(").append(')').toString());
		}
	}

	public Object method2417(Object object, int i) {
		try {
			synchronized (this) {
				if (-1L != -7599200929196954985L * ((Class253) this).aLong2782)
					method2415(-583861644);
				Class261 class261 = (Class261) ((Class253) this).aMap2784.remove(object);
				if (null != class261) {
					((Class253) this).anAbstractQueue_Sub1_2779.remove(class261);
					if (method2412((byte) 3))
						((Class253) this).anAbstractQueue_Sub1_2781.remove(class261);
					Object object_8_ = ((Class261) class261).anObject2822;
					return object_8_;
				}
				Object object_9_ = null;
				return object_9_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.p(").append(')').toString());
		}
	}

	static final void method2418(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -391880689;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.ab(").append(')').toString());
		}
	}

	static final void method2419(ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (string.startsWith(Class247.method2368(0, -278777595)) || string.startsWith(Class247.method2368(1, -278777595)))
				string = string.substring(7);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class478.method6098(string, -1316013258);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.wi(").append(')').toString());
		}
	}

	static final void method2420(ClientScript2 class403, byte i) {
		try {
			Class343_Sub1 class343_sub1 = Class522.method6328((byte) 29);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (class343_sub1 == null ? 0 : class343_sub1.anInt3670 * -877023375);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.alt(").append(')').toString());
		}
	}

	static final void method2421(ClientScript2 class403, byte i) {
		try {
			int i_10_ = (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((Player) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242).aClass70_10223.method799(i_10_, -1034906382);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.ae(").append(')').toString());
		}
	}

	static void method2422(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(10, (long) i);
			class298_sub37_sub12.method3449((byte) 101);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = i_11_ * 1274450087;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608 = i_12_ * 293101103;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9609 = -80288087 * i_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kp.ab(").append(')').toString());
		}
	}
}
