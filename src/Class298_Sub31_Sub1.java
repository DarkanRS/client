/* Class298_Sub31_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class298_Sub31_Sub1 extends Class298_Sub31 {
	Class100 aClass100_9314;
	String aString9315;
	String aString9316;
	int anInt9317;
	Class100 aClass100_9318;

	public abstract boolean method3116(int i);

	public abstract int method3117(int i);

	public String toString() {
		try {
			String string = new StringBuilder().append(((Class298_Sub31_Sub1) this).aClass100_9318.toString()).append(" ").append(((Class298_Sub31_Sub1) this).aString9315).toString();
			if (((Class298_Sub31_Sub1) this).aString9316 != null && !"".equals(((Class298_Sub31_Sub1) this).aString9316))
				string = new StringBuilder().append(string).append(" : ").append(((Class298_Sub31_Sub1) this).aString9316).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afb.toString(").append(')').toString());
		}
	}

	public Class100 method3118(int i) {
		try {
			return ((Class298_Sub31_Sub1) this).aClass100_9318;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afb.b(").append(')').toString());
		}
	}

	public abstract int method3119(int i);

	public int method3120(int i) {
		try {
			if (((Class298_Sub31_Sub1) this).aClass100_9318 != Class100.aClass100_1076)
				throw new IllegalArgumentException_Sub1(this, ((Class298_Sub31_Sub1) this).aClass100_9318.toString().toLowerCase());
			return 890433517 * ((Class298_Sub31_Sub1) this).anInt9317;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afb.i(").append(')').toString());
		}
	}

	String method3121(byte i) {
		try {
			return ((Class298_Sub31_Sub1) this).aString9315;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afb.f(").append(')').toString());
		}
	}

	Class298_Sub31_Sub1(Class114 class114) {
		((Class298_Sub31_Sub1) this).aClass100_9318 = ((Class114) class114).aClass100_1375;
		((Class298_Sub31_Sub1) this).aString9315 = ((Class114) class114).aString1377;
		((Class298_Sub31_Sub1) this).aString9316 = ((Class114) class114).aString1378;
		((Class298_Sub31_Sub1) this).anInt9317 = ((Class114) class114).anInt1374 * 1232308479;
		((Class298_Sub31_Sub1) this).aClass100_9314 = ((Class114) class114).aClass100_1376;
	}

	public Class100 method3122(int i) {
		try {
			return ((Class298_Sub31_Sub1) this).aClass100_9314;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afb.p(").append(')').toString());
		}
	}

	public abstract int method3123(int i);

	public abstract boolean method3124(int i);
}
