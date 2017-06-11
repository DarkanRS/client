/* Class348 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class348 {
	HashTable aClass437_3702;
	Class461 aClass461_3703 = new Class461();
	int anInt3704;
	int anInt3705;

	void method4182(Class298_Sub37_Sub9 class298_sub37_sub9, int i) {
		try {
			if (null != class298_sub37_sub9) {
				class298_sub37_sub9.unlink(-1460969981);
				class298_sub37_sub9.method3402(-2141988967);
				((Class348) this).anInt3704 += -1044171843 * ((Class298_Sub37_Sub9) class298_sub37_sub9).anInt9600;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.b(").append(')').toString());
		}
	}

	public int method4183(byte i) {
		try {
			int i_0_ = 0;
			for (Class298_Sub37_Sub9 class298_sub37_sub9 = (Class298_Sub37_Sub9) ((Class348) this).aClass461_3703.method5984(1659179977); class298_sub37_sub9 != null; class298_sub37_sub9 = (Class298_Sub37_Sub9) ((Class348) this).aClass461_3703.method5985(1776119940)) {
				if (!class298_sub37_sub9.method3438(1593047308))
					i_0_++;
			}
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.r(").append(')').toString());
		}
	}

	public Object method4184(long l) {
		try {
			Class298_Sub37_Sub9 class298_sub37_sub9 = ((Class298_Sub37_Sub9) ((Class348) this).aClass437_3702.get(l));
			if (null == class298_sub37_sub9)
				return null;
			Object object = class298_sub37_sub9.method3437(-1395408926);
			if (null == object) {
				class298_sub37_sub9.unlink(-1460969981);
				class298_sub37_sub9.method3402(-300474257);
				((Class348) this).anInt3704 += (((Class298_Sub37_Sub9) class298_sub37_sub9).anInt9600 * -1044171843);
				return null;
			}
			if (class298_sub37_sub9.method3438(-1388215910)) {
				Class298_Sub37_Sub9_Sub1 class298_sub37_sub9_sub1 = new Class298_Sub37_Sub9_Sub1(object, (1980662847 * (((Class298_Sub37_Sub9) class298_sub37_sub9).anInt9600)));
				((Class348) this).aClass437_3702.method5817(class298_sub37_sub9_sub1, class298_sub37_sub9.linkedKey * 7051297995265073167L);
				((Class348) this).aClass461_3703.method5982(class298_sub37_sub9_sub1, (byte) -4);
				class298_sub37_sub9_sub1.aLong7406 = 0L;
				class298_sub37_sub9.unlink(-1460969981);
				class298_sub37_sub9.method3402(1072331765);
			} else {
				((Class348) this).aClass461_3703.method5982(class298_sub37_sub9, (byte) -40);
				class298_sub37_sub9.aLong7406 = 0L;
			}
			return object;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.a(").append(')').toString());
		}
	}

	public void method4185(Object object, long l, int i, byte i_1_) {
		try {
			if (i > ((Class348) this).anInt3705 * 2087531591)
				throw new IllegalStateException();
			method4193(l);
			((Class348) this).anInt3704 -= -1846372093 * i;
			while (1177262507 * ((Class348) this).anInt3704 < 0) {
				Class298_Sub37_Sub9 class298_sub37_sub9 = (Class298_Sub37_Sub9) ((Class348) this).aClass461_3703.method5983(-2130209329);
				method4182(class298_sub37_sub9, -1092506029);
			}
			Class298_Sub37_Sub9_Sub1 class298_sub37_sub9_sub1 = new Class298_Sub37_Sub9_Sub1(object, i);
			((Class348) this).aClass437_3702.method5817(class298_sub37_sub9_sub1, l);
			((Class348) this).aClass461_3703.method5982(class298_sub37_sub9_sub1, (byte) -108);
			class298_sub37_sub9_sub1.aLong7406 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.i(").append(')').toString());
		}
	}

	public void method4186(int i, int i_2_) {
		try {
			for (Class298_Sub37_Sub9 class298_sub37_sub9 = (Class298_Sub37_Sub9) ((Class348) this).aClass461_3703.method5984(-1737359401); class298_sub37_sub9 != null; class298_sub37_sub9 = (Class298_Sub37_Sub9) ((Class348) this).aClass461_3703.method5985(1372068776)) {
				if (class298_sub37_sub9.method3438(504566053)) {
					if (class298_sub37_sub9.method3437(1618549592) == null) {
						class298_sub37_sub9.unlink(-1460969981);
						class298_sub37_sub9.method3402(932803925);
						((Class348) this).anInt3704 += -1044171843 * ((Class298_Sub37_Sub9) class298_sub37_sub9).anInt9600;
					}
				} else if ((class298_sub37_sub9.aLong7406 += 1476940603538232441L) * -5533549728640346679L > (long) i) {
					Class298_Sub37_Sub9_Sub2 class298_sub37_sub9_sub2 = (new Class298_Sub37_Sub9_Sub2(class298_sub37_sub9.method3437(1802409899), (((Class298_Sub37_Sub9) class298_sub37_sub9).anInt9600) * 1980662847));
					((Class348) this).aClass437_3702.method5817(class298_sub37_sub9_sub2, 7051297995265073167L * class298_sub37_sub9.linkedKey);
					Class458.method5973(class298_sub37_sub9_sub2, class298_sub37_sub9, -2008394772);
					class298_sub37_sub9.unlink(-1460969981);
					class298_sub37_sub9.method3402(357875821);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.k(").append(')').toString());
		}
	}

	public void method4187() {
		try {
			((Class348) this).aClass461_3703.method5988(1649887220);
			((Class348) this).aClass437_3702.clear((byte) -88);
			((Class348) this).anInt3704 = 1537477589 * ((Class348) this).anInt3705;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.d(").append(')').toString());
		}
	}

	public int method4188(int i) {
		try {
			return ((Class348) this).anInt3705 * 2087531591;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.u(").append(')').toString());
		}
	}

	public Class348(int i) {
		this(i, i);
	}

	public void method4189() {
		try {
			for (Class298_Sub37_Sub9 class298_sub37_sub9 = (Class298_Sub37_Sub9) ((Class348) this).aClass461_3703.method5984(-1664121892); null != class298_sub37_sub9; class298_sub37_sub9 = (Class298_Sub37_Sub9) ((Class348) this).aClass461_3703.method5985(-1665993458)) {
				if (class298_sub37_sub9.method3438(2031877244)) {
					class298_sub37_sub9.unlink(-1460969981);
					class298_sub37_sub9.method3402(784746714);
					((Class348) this).anInt3704 += -1044171843 * ((Class298_Sub37_Sub9) class298_sub37_sub9).anInt9600;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.q(").append(')').toString());
		}
	}

	public Object method4190(int i) {
		try {
			Class298_Sub37_Sub9 class298_sub37_sub9 = ((Class298_Sub37_Sub9) ((Class348) this).aClass437_3702.method5816(2018189704));
			while_82_: do {
				Object object;
				for (;;) {
					if (null == class298_sub37_sub9)
						break while_82_;
					object = class298_sub37_sub9.method3437(-709026193);
					if (object != null)
						break;
					Class298_Sub37_Sub9 class298_sub37_sub9_3_ = class298_sub37_sub9;
					class298_sub37_sub9 = (Class298_Sub37_Sub9) ((Class348) this).aClass437_3702.method5815((byte) 18);
					class298_sub37_sub9_3_.unlink(-1460969981);
					class298_sub37_sub9_3_.method3402(600406320);
					((Class348) this).anInt3704 += -1044171843 * ((Class298_Sub37_Sub9) class298_sub37_sub9_3_).anInt9600;
				}
				return object;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.n(").append(')').toString());
		}
	}

	public Object method4191(int i) {
		try {
			Class298_Sub37_Sub9 class298_sub37_sub9 = ((Class298_Sub37_Sub9) ((Class348) this).aClass437_3702.method5815((byte) 37));
			while_83_: do {
				Object object;
				for (;;) {
					if (null == class298_sub37_sub9)
						break while_83_;
					object = class298_sub37_sub9.method3437(110174403);
					if (object != null)
						break;
					Class298_Sub37_Sub9 class298_sub37_sub9_4_ = class298_sub37_sub9;
					class298_sub37_sub9 = (Class298_Sub37_Sub9) ((Class348) this).aClass437_3702.method5815((byte) 35);
					class298_sub37_sub9_4_.unlink(-1460969981);
					class298_sub37_sub9_4_.method3402(538286919);
					((Class348) this).anInt3704 += -1044171843 * ((Class298_Sub37_Sub9) class298_sub37_sub9_4_).anInt9600;
				}
				return object;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.s(").append(')').toString());
		}
	}

	public int method4192(int i) {
		try {
			return ((Class348) this).anInt3704 * 1177262507;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.x(").append(')').toString());
		}
	}

	public void method4193(long l) {
		try {
			Class298_Sub37_Sub9 class298_sub37_sub9 = ((Class298_Sub37_Sub9) ((Class348) this).aClass437_3702.get(l));
			method4182(class298_sub37_sub9, -1811015164);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.f(").append(')').toString());
		}
	}

	public void method4194(Object object, long l) {
		try {
			method4185(object, l, 1, (byte) -117);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.p(").append(')').toString());
		}
	}

	public Class348(int i, int i_5_) {
		((Class348) this).anInt3705 = i * -1371130505;
		((Class348) this).anInt3704 = -1846372093 * i;
		int i_6_;
		for (i_6_ = 1; i_6_ + i_6_ < i && i_6_ < i_5_; i_6_ += i_6_) {
			/* empty */
		}
		((Class348) this).aClass437_3702 = new HashTable(i_6_);
	}

	static final void method4195(ClientScript2 class403, int i) {
		try {
			int i_7_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub1_7552, i_7_, 1144244334);
			client.aClass283_8716.method2667(458039847);
			Class3.method300(656179282);
			client.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.ahd(").append(')').toString());
		}
	}

	public static Class413[] method4196(int i) {
		try {
			return (new Class413[] { Class413.aClass413_6580, Class413.aClass413_6583, Class413.aClass413_6579, Class413.aClass413_6586, Class413.aClass413_6587, Class413.aClass413_6576, Class413.aClass413_6585, Class413.aClass413_6581, Class413.aClass413_6577, Class413.aClass413_6575, Class413.aClass413_6584, Class413.aClass413_6588, Class413.aClass413_6582, Class413.aClass413_6578 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.a(").append(')').toString());
		}
	}

	public static int method4197(int i, int i_8_, boolean bool, byte i_9_) {
		try {
			Class298_Sub9 class298_sub9 = Class255.method2437(i, bool, 1780285943);
			if (null == class298_sub9)
				return 0;
			if (i_8_ == -1)
				return 0;
			int i_10_ = 0;
			for (int i_11_ = 0; i_11_ < ((Class298_Sub9) class298_sub9).anIntArray7227.length; i_11_++) {
				if (i_8_ == ((Class298_Sub9) class298_sub9).anIntArray7226[i_11_])
					i_10_ += (((Class298_Sub9) class298_sub9).anIntArray7227[i_11_]);
			}
			return i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.b(").append(')').toString());
		}
	}

	static final void method4198(ClientScript2 class403, int i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((NPC) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242).aClass73_10187.method817(i_12_, -966489489);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("on.ao(").append(')').toString());
		}
	}
}
