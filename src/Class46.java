/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

public class Class46 {
	Buffer aBuffer489;
	Class_ra_Sub2 aClass_ra_Sub2_490;

	void method499(byte[] is, int i) {
		if (((Class46) this).aBuffer489 == null || ((Class46) this).aBuffer489.a() < i)
			((Class46) this).aBuffer489 = ((Class_ra_Sub2) ((Class46) this).aClass_ra_Sub2_490).aNativeHeap8181.f(i, false);
		((Class46) this).aBuffer489.b(is, 0, 0, i);
	}

	Class46(Class_ra_Sub2 class_ra_sub2, Buffer buffer) {
		((Class46) this).aClass_ra_Sub2_490 = class_ra_sub2;
		((Class46) this).aBuffer489 = buffer;
	}

	Class46(Class_ra_Sub2 class_ra_sub2, byte[] is, int i) {
		((Class46) this).aClass_ra_Sub2_490 = class_ra_sub2;
		((Class46) this).aBuffer489 = ((Class_ra_Sub2) ((Class46) this).aClass_ra_Sub2_490).aNativeHeap8181.f(i, false);
		if (is != null)
			((Class46) this).aBuffer489.b(is, 0, 0, i);
	}
}
