/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class156 {
	static boolean aBool1970;
	static NodeCollection aClass482_1971;
	static int anInt1972 = 0;

	static synchronized void method2641() {
		anInt1972 -= 1904857133;
		if (0 == anInt1972 * 1292959653)
			method2652((byte) 30);
	}

	static synchronized void method2642(Interface40 interface40, byte i) {
		if (aBool1970) {
			if (i <= 1) {
				/* empty */
			}
		} else if (anInt1972 * 1292959653 > 0) {
			if (i > 1) {
				Class282_Sub47 class282_sub47 = new Class282_Sub47(interface40);
				aClass482_1971.append(class282_sub47, 1981054368);
			}
		} else
			interface40.ma(false);
	}

	static {
		aBool1970 = false;
		aClass482_1971 = new NodeCollection();
	}

	static synchronized void method2643(byte i) {
		anInt1972 += 1904857133;
	}

	static synchronized void method2644(int i) {
		anInt1972 -= 1904857133;
		if (0 == anInt1972 * 1292959653)
			method2652((byte) -6);
	}

	public static synchronized void method2645(boolean bool, int i) {
		aBool1970 = bool;
	}

	static synchronized void method2646() {
		anInt1972 -= 1904857133;
		if (0 == anInt1972 * 1292959653)
			method2652((byte) -29);
	}

	static synchronized void method2647(Interface40 interface40) {
		if (!aBool1970) {
			if (anInt1972 * 1292959653 > 0) {
				Class282_Sub47 class282_sub47 = new Class282_Sub47(interface40);
				aClass482_1971.append(class282_sub47, -1656324048);
			} else
				interface40.ma(false);
		}
	}

	static synchronized void method2648(Interface40 interface40) {
		if (!aBool1970) {
			if (anInt1972 * 1292959653 > 0) {
				Class282_Sub47 class282_sub47 = new Class282_Sub47(interface40);
				aClass482_1971.append(class282_sub47, -674594756);
			} else
				interface40.ma(false);
		}
	}

	static synchronized void method2649() {
		for (;;) {
			Class282_Sub47 class282_sub47 = (Class282_Sub47) aClass482_1971.method8061((byte) -15);
			if (null == class282_sub47)
				break;
			((Interface40) class282_sub47.anObject8068).ma(true);
			class282_sub47.remove();
		}
	}

	static synchronized void method2650() {
		anInt1972 += 1904857133;
	}

	static synchronized void method2651() {
		anInt1972 -= 1904857133;
		if (0 == anInt1972 * 1292959653)
			method2652((byte) 112);
	}

	static synchronized void method2652(byte i) {
		for (;;) {
			Class282_Sub47 class282_sub47 = (Class282_Sub47) aClass482_1971.method8061((byte) -94);
			if (null == class282_sub47)
				break;
			((Interface40) class282_sub47.anObject8068).ma(true);
			class282_sub47.remove();
		}
	}

	Class156() throws Throwable {
		throw new Error();
	}

	public static synchronized void method2653(boolean bool) {
		aBool1970 = bool;
	}
}
