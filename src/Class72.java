/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class72 {
	int anInt723;
	long aLong724;

	public final int method1295() {
		return ((Class72) this).anInt723;
	}

	Class72(Class69[] class69s) {
		for (int i = 0; i < class69s.length; i++)
			method1303(class69s[i]);
	}

	public final int method1296() {
		return ((Class72) this).anInt723;
	}

	public final Class69 method1297(int i) {
		return Class69.method1285(method1299(i));
	}

	Class72(Class69 class69) {
		((Class72) this).aLong724 = (long) ((Class69) class69).anInt703;
		((Class72) this).anInt723 = 1;
	}

	public final int method1298() {
		return ((Class72) this).anInt723;
	}

	final int method1299(int i) {
		return (int) (((Class72) this).aLong724 >> Class69.anInt702 * i) & 0xf;
	}

	public final int method1300() {
		return ((Class72) this).anInt723;
	}

	public final int method1301() {
		return ((Class72) this).anInt723;
	}

	public final Class69 method1302(int i) {
		return Class69.method1285(method1299(i));
	}

	final void method1303(Class69 class69) {
		((Class72) this).aLong724 |= (long) (((Class69) class69).anInt703 << Class69.anInt702 * ((Class72) this).anInt723++);
	}

	public final Class69 method1304(int i) {
		return Class69.method1285(method1299(i));
	}

	public final Class69 method1305(int i) {
		return Class69.method1285(method1299(i));
	}

	public final Class69 method1306(int i) {
		return Class69.method1285(method1299(i));
	}

	final int method1307(int i) {
		return (int) (((Class72) this).aLong724 >> Class69.anInt702 * i) & 0xf;
	}

	final int method1308(int i) {
		return (int) (((Class72) this).aLong724 >> Class69.anInt702 * i) & 0xf;
	}

	final void method1309(Class69 class69) {
		((Class72) this).aLong724 |= (long) (((Class69) class69).anInt703 << Class69.anInt702 * ((Class72) this).anInt723++);
	}

	final void method1310(Class69 class69) {
		((Class72) this).aLong724 |= (long) (((Class69) class69).anInt703 << Class69.anInt702 * ((Class72) this).anInt723++);
	}
}
