/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class458 {
	public Linkable aClass298_5668 = new Linkable();
	Linkable aClass298_5669;

	public Linkable method5964(int i) {
		try {
			Linkable class298 = aClass298_5668.previous;
			if (class298 == aClass298_5668) {
				((Class458) this).aClass298_5669 = null;
				return null;
			}
			((Class458) this).aClass298_5669 = class298.previous;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.d(").append(')').toString());
		}
	}

	public void method5965(Linkable class298, int i) {
		try {
			if (null != class298.previous)
				class298.unlink(-1460969981);
			class298.previous = aClass298_5668;
			class298.next = aClass298_5668.next;
			class298.previous.next = class298;
			class298.next.previous = class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.b(").append(')').toString());
		}
	}

	public Linkable method5966(byte i) {
		try {
			Linkable class298 = ((Class458) this).aClass298_5669;
			if (aClass298_5668 == class298) {
				((Class458) this).aClass298_5669 = null;
				return null;
			}
			((Class458) this).aClass298_5669 = class298.previous;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.x(").append(')').toString());
		}
	}

	public Linkable method5967(int i) {
		try {
			Linkable class298 = aClass298_5668.next;
			if (class298 == aClass298_5668) {
				((Class458) this).aClass298_5669 = null;
				return null;
			}
			((Class458) this).aClass298_5669 = class298.next;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.k(").append(')').toString());
		}
	}

	public void method5968(Linkable class298, int i) {
		try {
			if (class298.previous != null)
				class298.unlink(-1460969981);
			class298.previous = aClass298_5668.previous;
			class298.next = aClass298_5668;
			class298.previous.next = class298;
			class298.next.previous = class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.f(").append(')').toString());
		}
	}

	public Linkable method5969(byte i) {
		try {
			Linkable class298 = ((Class458) this).aClass298_5669;
			if (class298 == aClass298_5668) {
				((Class458) this).aClass298_5669 = null;
				return null;
			}
			((Class458) this).aClass298_5669 = class298.next;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.u(").append(')').toString());
		}
	}

	public boolean method5970(byte i) {
		try {
			return aClass298_5668.next == aClass298_5668;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.r(").append(')').toString());
		}
	}

	public Linkable method5971(int i) {
		try {
			Linkable class298 = aClass298_5668.next;
			if (aClass298_5668 == class298)
				return null;
			class298.unlink(-1460969981);
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.i(").append(')').toString());
		}
	}

	public void method5972(int i) {
		try {
			for (;;) {
				Linkable class298 = aClass298_5668.next;
				if (aClass298_5668 == class298) {
					if (i < -824427525)
						break;
					return;
				}
				class298.unlink(-1460969981);
			}
			((Class458) this).aClass298_5669 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.a(").append(')').toString());
		}
	}

	public Class458() {
		aClass298_5668.next = aClass298_5668;
		aClass298_5668.previous = aClass298_5668;
	}

	public static void method5973(Class298_Sub37 class298_sub37, Class298_Sub37 class298_sub37_0_, int i) {
		try {
			if (class298_sub37.aClass298_Sub37_7404 != null)
				class298_sub37.method3402(-881477192);
			class298_sub37.aClass298_Sub37_7404 = class298_sub37_0_;
			class298_sub37.aClass298_Sub37_7405 = class298_sub37_0_.aClass298_Sub37_7405;
			class298_sub37.aClass298_Sub37_7404.aClass298_Sub37_7405 = class298_sub37;
			class298_sub37.aClass298_Sub37_7405.aClass298_Sub37_7404 = class298_sub37;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.p(").append(')').toString());
		}
	}

	static final void method5974(ClientScript2 class403, byte i) {
		try {
			if (null != Class375.visitedChannel) {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
				((ClientScript2) class403).aClass298_Sub25_5237 = Class375.visitedChannel;
			} else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.xx(").append(')').toString());
		}
	}

	static final void method5975(ClientScript2 class403, byte i) {
		try {
			boolean bool = true;
			if (client.aBoolean8638) {
				try {
					Object object = Class212.aClass212_2429.method1954(-1654113322);
					if (object != null)
						bool = ((Boolean) object).booleanValue();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.ank(").append(')').toString());
		}
	}

	static final void method5976(ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2041, client.gameConnection.aClass449_330, (byte) 19);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(string.length() + 1);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2140741369);
			client.gameConnection.method390(class298_sub36, (byte) -70);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sw.sf(").append(')').toString());
		}
	}
}
