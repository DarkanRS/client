/* Class282_Sub21_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class282_Sub21_Sub1 extends Class282_Sub21 {
	String aString10056;
	String aString10057;
	Class111 aClass111_10058;
	int anInt10059;
	Class111 aClass111_10060;

	public abstract int method15453(int i);

	String method15454(int i) {
		return ((Class282_Sub21_Sub1) this).aString10057;
	}

	public abstract int method15455(int i);

	public String method15456() {
		String string = new StringBuilder().append(((Class282_Sub21_Sub1) this).aClass111_10058.toString()).append(" ").append(((Class282_Sub21_Sub1) this).aString10057).toString();
		if (((Class282_Sub21_Sub1) this).aString10056 != null && !"".equals(((Class282_Sub21_Sub1) this).aString10056))
			string = new StringBuilder().append(string).append(" : ").append(((Class282_Sub21_Sub1) this).aString10056).toString();
		return string;
	}

	public Class111 method15457(byte i) {
		return ((Class282_Sub21_Sub1) this).aClass111_10058;
	}

	public Class111 method15458(byte i) {
		return ((Class282_Sub21_Sub1) this).aClass111_10060;
	}

	public int method15459(short i) {
		if (((Class282_Sub21_Sub1) this).aClass111_10058 != Class111.aClass111_1109)
			throw new IllegalArgumentException_Sub1(this, ((Class282_Sub21_Sub1) this).aClass111_10058.toString().toLowerCase());
		return ((Class282_Sub21_Sub1) this).anInt10059 * -78285537;
	}

	public String toString() {
		String string = new StringBuilder().append(((Class282_Sub21_Sub1) this).aClass111_10058.toString()).append(" ").append(((Class282_Sub21_Sub1) this).aString10057).toString();
		if (((Class282_Sub21_Sub1) this).aString10056 != null && !"".equals(((Class282_Sub21_Sub1) this).aString10056))
			string = new StringBuilder().append(string).append(" : ").append(((Class282_Sub21_Sub1) this).aString10056).toString();
		return string;
	}

	public abstract int method15460(int i);

	public abstract boolean method15461(int i);

	public abstract boolean method15462(int i);

	public abstract boolean method15463(int i);

	public String method15464() {
		String string = new StringBuilder().append(((Class282_Sub21_Sub1) this).aClass111_10058.toString()).append(" ").append(((Class282_Sub21_Sub1) this).aString10057).toString();
		if (((Class282_Sub21_Sub1) this).aString10056 != null && !"".equals(((Class282_Sub21_Sub1) this).aString10056))
			string = new StringBuilder().append(string).append(" : ").append(((Class282_Sub21_Sub1) this).aString10056).toString();
		return string;
	}

	public Class111 method15465() {
		return ((Class282_Sub21_Sub1) this).aClass111_10058;
	}

	String method15466() {
		return ((Class282_Sub21_Sub1) this).aString10057;
	}

	String method15467() {
		return ((Class282_Sub21_Sub1) this).aString10057;
	}

	String method15468() {
		return ((Class282_Sub21_Sub1) this).aString10057;
	}

	String method15469() {
		return ((Class282_Sub21_Sub1) this).aString10057;
	}

	public abstract boolean method15470(int i);

	public abstract boolean method15471(int i);

	Class282_Sub21_Sub1(Class122 class122) {
		((Class282_Sub21_Sub1) this).aClass111_10058 = ((Class122) class122).aClass111_1529;
		((Class282_Sub21_Sub1) this).aString10057 = ((Class122) class122).aString1530;
		((Class282_Sub21_Sub1) this).aString10056 = ((Class122) class122).aString1532;
		((Class282_Sub21_Sub1) this).anInt10059 = 1737048383 * ((Class122) class122).anInt1528;
		((Class282_Sub21_Sub1) this).aClass111_10060 = ((Class122) class122).aClass111_1533;
	}

	public abstract int method15472(int i);

	public abstract int method15473(int i);

	static final void method15474(Class118 class118, Class98 class98, Class527 class527, byte i) {
		class118.aStringArray1352 = null;
	}
}
