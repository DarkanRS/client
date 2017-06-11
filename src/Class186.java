/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class186 {
	boolean aBoolean1900;
	boolean aBoolean1901;
	Interface7_Impl1 anInterface7_Impl1_1902;
	Interface7_Impl1 anInterface7_Impl1_1903;

	boolean method1848() {
		return (((Class186) this).aBoolean1900 && !((Class186) this).aBoolean1901);
	}

	Class186(boolean bool) {
		((Class186) this).aBoolean1901 = bool;
	}

	void method1849() {
		if (((Class186) this).anInterface7_Impl1_1903 != null)
			((Class186) this).anInterface7_Impl1_1903.b();
		((Class186) this).aBoolean1900 = false;
	}
}
