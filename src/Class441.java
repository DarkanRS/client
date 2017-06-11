/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class441 {
	Class298_Sub37_Sub4 aClass298_Sub37_Sub4_5583;
	int anInt5584;
	boolean aBoolean5585 = false;
	int anInt5586;
	Class298_Sub37_Sub4 aClass298_Sub37_Sub4_5587;
	int anInt5588;
	static int anInt5589;
	static boolean[] aBooleanArray5590;

	final boolean method5863(Class395 class395, Class391 class391, int i, int i_0_, int[] is, byte i_1_) {
		try {
			if (!((Class441) this).aBoolean5585) {
				if (i >= is.length)
					return false;
				((Class441) this).anInt5584 = -1850168697 * is[i];
				((Class441) this).aClass298_Sub37_Sub4_5583 = class395.method4900((((Class441) this).anInt5584 * 806878007) >> 16, -2028006412);
				((Class441) this).anInt5584 = ((((Class441) this).anInt5584 * 806878007 & 0xffff) * -1850168697);
				if (((Class441) this).aClass298_Sub37_Sub4_5583 != null) {
					if (class391.aBoolean4176 && i_0_ != -1 && i_0_ < is.length) {
						((Class441) this).anInt5586 = is[i_0_] * -1477634565;
						((Class441) this).aClass298_Sub37_Sub4_5587 = class395.method4900((((Class441) this).anInt5586 * -643912397) >> 16, -1623469578);
						((Class441) this).anInt5586 = (((Class441) this).anInt5586 * -643912397 & 0xffff) * -1477634565;
					}
					if (class391.aBoolean4185)
						((Class441) this).anInt5588 = (((Class441) this).anInt5588 * -1050600049 | 0x200) * 1673486703;
					if (((Class441) this).aClass298_Sub37_Sub4_5583.method3413(((Class441) this).anInt5584 * 806878007, (byte) -4))
						((Class441) this).anInt5588 = (1673486703 * (-1050600049 * ((Class441) this).anInt5588 | 0x80));
					if (((Class441) this).aClass298_Sub37_Sub4_5583.method3415(806878007 * ((Class441) this).anInt5584, -460356399))
						((Class441) this).anInt5588 = (1673486703 * (-1050600049 * ((Class441) this).anInt5588 | 0x100));
					if (((Class441) this).aClass298_Sub37_Sub4_5583.method3414(((Class441) this).anInt5584 * 806878007, (byte) -54))
						((Class441) this).anInt5588 = (1673486703 * (((Class441) this).anInt5588 * -1050600049 | 0x400));
					if (((Class441) this).aClass298_Sub37_Sub4_5587 != null) {
						if (((Class441) this).aClass298_Sub37_Sub4_5587.method3413(-643912397 * ((Class441) this).anInt5586, (byte) 9))
							((Class441) this).anInt5588 = (1673486703 * (-1050600049 * ((Class441) this).anInt5588 | 0x80));
						if (((Class441) this).aClass298_Sub37_Sub4_5587.method3415(((Class441) this).anInt5586 * -643912397, -460356399))
							((Class441) this).anInt5588 = (1673486703 * (((Class441) this).anInt5588 * -1050600049 | 0x100));
						if (((Class441) this).aClass298_Sub37_Sub4_5587.method3414(-643912397 * ((Class441) this).anInt5586, (byte) 7))
							((Class441) this).anInt5588 = (1673486703 * (-1050600049 * ((Class441) this).anInt5588 | 0x400));
					}
					((Class441) this).anInt5588 = ((((Class441) this).anInt5588 * -1050600049 | 0x20) * 1673486703);
					((Class441) this).aBoolean5585 = true;
					return true;
				}
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sf.a(").append(')').toString());
		}
	}

	final void method5864(int i) {
		try {
			((Class441) this).aBoolean5585 = false;
			((Class441) this).anInt5588 = 0;
			((Class441) this).aClass298_Sub37_Sub4_5587 = null;
			((Class441) this).aClass298_Sub37_Sub4_5583 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sf.f(").append(')').toString());
		}
	}

	Class441() {
		/* empty */
	}

	static final void method5865(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -1912889290) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1243 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sf.ku(").append(')').toString());
		}
	}

	static final String method5866(int i, int i_2_) {
		try {
			String string = Integer.toString(i);
			for (int i_3_ = string.length() - 3; i_3_ > 0; i_3_ -= 3)
				string = new StringBuilder().append(string.substring(0, i_3_)).append(Class26.aString353).append(string.substring(i_3_)).toString();
			if (string.length() > 9)
				return new StringBuilder().append(" ").append(Class285.method2709(65408, -2039864554)).append(string.substring(0, string.length() - 8)).append(Tradution.aClass470_5917.method6049(Class321.aClass429_3357, -875414210)).append(" (").append(string).append(")").append(Class26.aString356).toString();
			if (string.length() > 6)
				return new StringBuilder().append(" ").append(Class285.method2709(16777215, -1284566910)).append(string.substring(0, string.length() - 4)).append(Tradution.aClass470_5913.method6049(Class321.aClass429_3357, -875414210)).append(" (").append(string).append(")").append(Class26.aString356).toString();
			return new StringBuilder().append(" ").append(Class285.method2709(16776960, -1902529284)).append(string).append(Class26.aString356).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sf.kn(").append(')').toString());
		}
	}

	static final void method5867(ClientScript2 class403, byte i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class352 class352 = Class363.aClass339_3931.method4116(i_4_, -1551283008);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 715019623 * class352.anInt3785;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sf.amw(").append(')').toString());
		}
	}
}
