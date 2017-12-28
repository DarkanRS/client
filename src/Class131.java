
/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

public class Class131 {
	Buffer aBuffer1593;
	Class505_Sub1 aClass505_Sub1_1594;

	Class131(Class505_Sub1 class505_sub1, Buffer buffer) {
		((Class131) this).aClass505_Sub1_1594 = class505_sub1;
		((Class131) this).aBuffer1593 = buffer;
	}

	void method2319(byte[] is, int i) {
		if (((Class131) this).aBuffer1593 == null || ((Class131) this).aBuffer1593.method1() < i)
			((Class131) this).aBuffer1593 = ((Class505_Sub1) ((Class131) this).aClass505_Sub1_1594).aNativeHeap8445.method759(i, false);
		((Class131) this).aBuffer1593.method116(is, 0, 0, i);
	}

	Class131(Class505_Sub1 class505_sub1, byte[] is, int i) {
		((Class131) this).aClass505_Sub1_1594 = class505_sub1;
		((Class131) this).aBuffer1593 = ((Class505_Sub1) ((Class131) this).aClass505_Sub1_1594).aNativeHeap8445.method759(i, false);
		if (is != null)
			((Class131) this).aBuffer1593.method116(is, 0, 0, i);
	}
}
