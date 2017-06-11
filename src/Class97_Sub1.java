/* Class97_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class97_Sub1 extends Class97 {
	void method1038() {
		Class300.aClass303_3202 = Class300.aClass303_3215;
		Class300.aClass303_3215 = null;
	}

	void method1037(int i) {
		try {
			Class300.aClass303_3202 = Class300.aClass303_3215;
			Class300.aClass303_3215 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yz.a(").append(')').toString());
		}
	}

	void method1036() {
		Class300.aClass303_3202 = Class300.aClass303_3215;
		Class300.aClass303_3215 = null;
	}

	void method1039() {
		Class300.aClass303_3202 = Class300.aClass303_3215;
		Class300.aClass303_3215 = null;
	}

	public static final void method1043(int moveLocalX, int moveLocalY, int moveZ, int speed2, int speed1, boolean bool) {
		try {
			Class376.anInt4089 = moveLocalX * 2140348215;
			Class82_Sub4.anInt6832 = -2108764285 * moveLocalY;
			Class98_Sub3.anInt6938 = moveZ * 1219077157;
			Class129.anInt6380 = -346020243 * speed2;
			Class21.anInt276 = speed1 * 1510337323;
			if (bool && Class21.anInt276 * 1534163843 >= 100) {
				Class367.anInt4000 = -1222509056 * Class376.anInt4089 + -1475884800;
				Class146.anInt1575 = 2009399552 + 1453086208 * Class82_Sub4.anInt6832;
				Class110.anInt6403 = (Class356.method4271(-1740717447 * Class367.anInt4000, Class146.anInt1575 * -299812095, 1855729883 * Class99.anInt952, -2087363822) - -1439836243 * Class98_Sub3.anInt6938) * 1078403147;
			}
			Class298_Sub1.anInt7164 = 2090692627;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yz.hu(").append(')').toString());
		}
	}

	public static void method1044(Linkable class298, Linkable class298_5_, int i) {
		try {
			if (null != class298.previous)
				class298.unlink(-1460969981);
			class298.previous = class298_5_.previous;
			class298.next = class298_5_;
			class298.previous.next = class298;
			class298.next.previous = class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yz.b(").append(')').toString());
		}
	}

	static Class298_Sub37_Sub12 method1045(byte i) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = ((Class298_Sub37_Sub12) Class298_Sub37_Sub12.aClass461_9638.method5984(1993015786));
			if (class298_sub37_sub12 == null) {
				if (i != 12) {
					/* empty */
				}
			} else {
				class298_sub37_sub12.unlink(-1460969981);
				class298_sub37_sub12.method3402(-834696673);
				return class298_sub37_sub12;
			}
			do {
				class298_sub37_sub12 = (Class298_Sub37_Sub12) Class298_Sub37_Sub12.aClass461_9607.method5984(-962629622);
				if (class298_sub37_sub12 == null)
					return null;
				if (class298_sub37_sub12.method3448(1111075384) > Class122.method1319((byte) 1))
					return null;
				class298_sub37_sub12.unlink(-1460969981);
				class298_sub37_sub12.method3402(1430055356);
			} while (0L == (class298_sub37_sub12.aLong7406 * -5533549728640346679L & ~0x7fffffffffffffffL));
			return class298_sub37_sub12;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yz.b(").append(')').toString());
		}
	}
}
