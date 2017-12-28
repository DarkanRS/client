
/* Class282_Sub50_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class282_Sub50_Sub1_Sub2 extends Class282_Sub50_Sub1 {
	SoftReference aSoftReference10403;

	boolean method14694() {
		return true;
	}

	Object method14692(int i) {
		return ((Class282_Sub50_Sub1_Sub2) this).aSoftReference10403.get();
	}

	boolean method14691(int i) {
		return true;
	}

	Object method14693() {
		return ((Class282_Sub50_Sub1_Sub2) this).aSoftReference10403.get();
	}

	Class282_Sub50_Sub1_Sub2(Object object, int i) {
		super(i);
		((Class282_Sub50_Sub1_Sub2) this).aSoftReference10403 = new SoftReference(object);
	}
}
