/* Class298_Sub37_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class298_Sub37_Sub1_Sub2 extends Class298_Sub37_Sub1 {
	SoftReference aSoftReference9999;

	boolean method3409() {
		return true;
	}

	Class298_Sub37_Sub1_Sub2(Interface18 interface18, Object object, int i) {
		super(interface18, i);
		((Class298_Sub37_Sub1_Sub2) this).aSoftReference9999 = new SoftReference(object);
	}

	boolean method3407() {
		return true;
	}

	Object method3410() {
		return ((Class298_Sub37_Sub1_Sub2) this).aSoftReference9999.get();
	}

	Object method3406() {
		return ((Class298_Sub37_Sub1_Sub2) this).aSoftReference9999.get();
	}

	Object method3408() {
		return ((Class298_Sub37_Sub1_Sub2) this).aSoftReference9999.get();
	}
}
