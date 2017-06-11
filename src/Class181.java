/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181 {
	int anInt1813;
	long aLong1814;

	Class181(Class155[] class155s) {
		for (int i = 0; i < class155s.length; i++)
			method1840(class155s[i]);
	}

	Class181(Class155 class155) {
		((Class181) this).aLong1814 = (long) ((Class155) class155).anInt1607;
		((Class181) this).anInt1813 = 1;
	}

	public final Class155 method1839(int i) {
		return Class155.method1693(method1841(i));
	}

	final void method1840(Class155 class155) {
		((Class181) this).aLong1814 |= (long) (((Class155) class155).anInt1607 << Class155.anInt1609 * ((Class181) this).anInt1813++);
	}

	final int method1841(int i) {
		return ((int) (((Class181) this).aLong1814 >> Class155.anInt1609 * i) & 0xf);
	}

	public final int method1842() {
		return ((Class181) this).anInt1813;
	}
}
