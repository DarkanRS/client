/* Class298_Sub37_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub12 extends Class298_Sub37 {
	static Class461 aClass461_9607;
	int anInt9608;
	int anInt9609;
	int anInt9610;
	String aString9611;
	static int anInt9612 = 2;
	static int anInt9613 = 3;
	static int anInt9614 = 4;
	static int anInt9615 = 5;
	static int anInt9616 = 11;
	static int anInt9617 = 7;
	static int anInt9618 = 8;
	static int anInt9619 = 10;
	static int anInt9620 = 1;
	static HashTable aClass437_9621;
	static int anInt9622 = 12;
	static int anInt9623 = 13;
	static int anInt9624 = 14;
	static int anInt9625 = 20;
	static int anInt9626 = 16;
	static int anInt9627 = 9;
	static int anInt9628 = 18;
	static int anInt9629 = 19;
	static int anInt9630 = 15;
	static int anInt9631 = 21;
	static int anInt9632 = 22;
	static int anInt9633 = 6;
	static int anInt9634 = 17;
	static long aLong9635 = 500L;
	static long aLong9636 = 9223372036854775807L;
	static long aLong9637 = -9223372036854775808L;
	static Class461 aClass461_9638 = new Class461();

	void method3445(int i) {
		try {
			aLong7406 = ((aLong7406 * -5533549728640346679L & ~0x7fffffffffffffffL | Class122.method1319((byte) 1) + 500L) * 1476940603538232441L);
			aClass461_9607.method5982(this, (byte) -90);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ais.bf(").append(')').toString());
		}
	}

	Class298_Sub37_Sub12(int i, long l) {
		linkedKey = ((long) i << 56 | l) * 4191220306876042991L;
	}

	int method3446(int i) {
		try {
			return (int) (linkedKey * 7051297995265073167L >>> 56 & 0xffL);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ais.by(").append(')').toString());
		}
	}

	long method3447(int i) {
		try {
			return 7051297995265073167L * linkedKey & 0xffffffffffffffL;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ais.bm(").append(')').toString());
		}
	}

	static {
		aClass461_9607 = new Class461();
		aClass437_9621 = new HashTable(16);
	}

	long method3448(int i) {
		try {
			return aLong7406 * -5533549728640346679L & 0x7fffffffffffffffL;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ais.bc(").append(')').toString());
		}
	}

	void method3449(byte i) {
		try {
			aLong7406 = (aLong7406 * -5533549728640346679L | ~0x7fffffffffffffffL) * 1476940603538232441L;
			if (method3448(1430514987) == 0L)
				aClass461_9638.method5982(this, (byte) -59);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ais.be(").append(')').toString());
		}
	}
}
