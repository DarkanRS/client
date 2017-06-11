/* Class448 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class448 {
	static int anInt5619;
	Class302_Sub3 aClass302_Sub3_5620;
	public Class302_Sub3 aClass302_Sub3_5621 = new Class302_Sub3();

	public void method5907(int i) {
		try {
			for (;;) {
				Class302_Sub3 class302_sub3 = aClass302_Sub3_5621.aClass302_Sub3_7650;
				if (class302_sub3 == aClass302_Sub3_5621) {
					if (i >= 1446077798) {
						/* empty */
					}
					break;
				}
				class302_sub3.method3721(-850214067);
			}
			((Class448) this).aClass302_Sub3_5620 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sm.p(").append(')').toString());
		}
	}

	public void method5908(Class302_Sub3 class302_sub3, byte i) {
		try {
			if (class302_sub3.aClass302_Sub3_7649 != null)
				class302_sub3.method3721(-850214067);
			class302_sub3.aClass302_Sub3_7649 = aClass302_Sub3_5621.aClass302_Sub3_7649;
			class302_sub3.aClass302_Sub3_7650 = aClass302_Sub3_5621;
			class302_sub3.aClass302_Sub3_7649.aClass302_Sub3_7650 = class302_sub3;
			class302_sub3.aClass302_Sub3_7650.aClass302_Sub3_7649 = class302_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sm.a(").append(')').toString());
		}
	}

	public Class302_Sub3 method5909(int i) {
		try {
			Class302_Sub3 class302_sub3 = ((Class448) this).aClass302_Sub3_5620;
			if (class302_sub3 == aClass302_Sub3_5621) {
				((Class448) this).aClass302_Sub3_5620 = null;
				return null;
			}
			((Class448) this).aClass302_Sub3_5620 = class302_sub3.aClass302_Sub3_7650;
			return class302_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sm.b(").append(')').toString());
		}
	}

	public int method5910(short i) {
		try {
			int i_0_ = 0;
			for (Class302_Sub3 class302_sub3 = aClass302_Sub3_5621.aClass302_Sub3_7650; aClass302_Sub3_5621 != class302_sub3; class302_sub3 = class302_sub3.aClass302_Sub3_7650)
				i_0_++;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sm.i(").append(')').toString());
		}
	}

	public Class302_Sub3 method5911(int i) {
		try {
			Class302_Sub3 class302_sub3 = aClass302_Sub3_5621.aClass302_Sub3_7650;
			if (aClass302_Sub3_5621 == class302_sub3) {
				((Class448) this).aClass302_Sub3_5620 = null;
				return null;
			}
			((Class448) this).aClass302_Sub3_5620 = class302_sub3.aClass302_Sub3_7650;
			return class302_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sm.f(").append(')').toString());
		}
	}

	public Class448() {
		aClass302_Sub3_5621.aClass302_Sub3_7650 = aClass302_Sub3_5621;
		aClass302_Sub3_5621.aClass302_Sub3_7649 = aClass302_Sub3_5621;
	}

	static final void method5912(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			if (!Class378.method4671(i, null, -1216775650)) {
				if (-1 != i_7_)
					client.aBooleanArray8900[i_7_] = true;
				else {
					for (int i_9_ = 0; i_9_ < 113; i_9_++)
						client.aBooleanArray8900[i_9_] = true;
				}
			} else
				Class422_Sub24.method5714(Class389.aClass119Array4165[i].method1295((byte) -87), -1, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_7_ < 0, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sm.kt(").append(')').toString());
		}
	}

	static final void method5913(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5245 -= -682569305;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sm.be(").append(')').toString());
		}
	}
}
