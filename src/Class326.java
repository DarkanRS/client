
/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class326 implements Interface5 {
	Class505_Sub2_Sub1 aClass505_Sub2_Sub1_3757;
	int anInt3758 = -1;
	static final int anInt3759 = 34963;
	static final int anInt3760 = 34962;
	boolean aBool3761;
	int anInt3762;
	int anInt3763;
	int anInt3764;
	NativeHeapBuffer aNativeHeapBuffer3765;
	static int[] anIntArray3766 = new int[1];

	public int method39() {
		return ((Class326) this).anInt3763;
	}

	public long method41(int i, int i_0_) {
		OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
		return (OpenGL.glMapBufferARB(((Class326) this).anInt3762, 35001) + (long) i);
	}

	boolean method5791(int i, Source source) {
		if (i > ((Class326) this).anInt3764) {
			method5793();
			if (((Class326) this).anInt3758 > 0) {
				OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
				OpenGL.glBufferDataARBa(((Class326) this).anInt3762, i, source.method2(), (((Class326) this).aBool3761 ? 35040 : 35044));
				((Class326) this).aClass505_Sub2_Sub1_3757.anInt8702 += i - ((Class326) this).anInt3763;
			} else {
				((Class326) this).aNativeHeapBuffer3765 = ((Class326) this).aClass505_Sub2_Sub1_3757.method13910(i, false);
				((Class326) this).aNativeHeapBuffer3765.method1176(source);
			}
			((Class326) this).anInt3764 = i;
		} else if (((Class326) this).anInt3758 > 0) {
			OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
			OpenGL.glBufferSubDataARBa(((Class326) this).anInt3762, 0, ((Class326) this).anInt3763, source.method2());
			((Class326) this).aClass505_Sub2_Sub1_3757.anInt8702 += i - ((Class326) this).anInt3763;
		} else {
			((Class326) this).aNativeHeapBuffer3765 = ((Class326) this).aClass505_Sub2_Sub1_3757.method13910(i, false);
			((Class326) this).aNativeHeapBuffer3765.method1176(source);
		}
		((Class326) this).anInt3763 = i;
		return true;
	}

	Class326(Class505_Sub2_Sub1 class505_sub2_sub1, int i, boolean bool) {
		((Class326) this).aClass505_Sub2_Sub1_3757 = class505_sub2_sub1;
		((Class326) this).anInt3762 = i;
		((Class326) this).aBool3761 = bool;
	}

	void method5792() {
		if (((Class505_Sub2_Sub1) ((Class326) this).aClass505_Sub2_Sub1_3757).aBool10193)
			OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
	}

	public void method44() {
		OpenGL.glUnmapBufferARB(((Class326) this).anInt3762);
	}

	void method5793() {
		if (((Class326) this).anInt3758 < 0) {
			if (((Class505_Sub2_Sub1) ((Class326) this).aClass505_Sub2_Sub1_3757).aBool10193) {
				OpenGL.glGenBuffersARB(1, anIntArray3766, 0);
				((Class326) this).anInt3758 = anIntArray3766[0];
				OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
			} else
				((Class326) this).anInt3758 = 0;
		}
	}

	public long method40(int i, int i_1_) {
		OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
		return (OpenGL.glMapBufferARB(((Class326) this).anInt3762, 35001) + (long) i);
	}

	long method5794() {
		return (((Class326) this).anInt3758 == 0 ? ((Class326) this).aNativeHeapBuffer3765.method2() : 0L);
	}

	public boolean method42(int i, int i_2_, long l) {
		method5793();
		if (((Class326) this).anInt3758 > 0) {
			OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
			OpenGL.glBufferSubDataARBa(((Class326) this).anInt3762, i, i_2_, l);
		} else
			((Class326) this).aNativeHeapBuffer3765.aNativeHeap614.copy(((Class326) this).aNativeHeapBuffer3765.method2() + (long) i, l, i_2_);
		return true;
	}

	void method26() {
		if (((Class326) this).anInt3758 > 0) {
			((Class326) this).aClass505_Sub2_Sub1_3757.method15569(((Class326) this).anInt3758, ((Class326) this).anInt3763);
			((Class326) this).anInt3758 = -1;
		}
	}

	public void finalize() throws Throwable {
		method26();
		super.finalize();
	}

	void method32() {
		if (((Class326) this).anInt3758 > 0) {
			((Class326) this).aClass505_Sub2_Sub1_3757.method15569(((Class326) this).anInt3758, ((Class326) this).anInt3763);
			((Class326) this).anInt3758 = -1;
		}
	}

	void method5795() throws Throwable {
		method26();
		super.finalize();
	}

	void method5796() throws Throwable {
		method26();
		super.finalize();
	}

	void method5797() {
		if (((Class326) this).anInt3758 < 0) {
			if (((Class505_Sub2_Sub1) ((Class326) this).aClass505_Sub2_Sub1_3757).aBool10193) {
				OpenGL.glGenBuffersARB(1, anIntArray3766, 0);
				((Class326) this).anInt3758 = anIntArray3766[0];
				OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
			} else
				((Class326) this).anInt3758 = 0;
		}
	}

	public boolean method35(int i, int i_3_, long l) {
		method5793();
		if (((Class326) this).anInt3758 > 0) {
			OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
			OpenGL.glBufferSubDataARBa(((Class326) this).anInt3762, i, i_3_, l);
		} else
			((Class326) this).aNativeHeapBuffer3765.aNativeHeap614.copy(((Class326) this).aNativeHeapBuffer3765.method2() + (long) i, l, i_3_);
		return true;
	}

	public void method38() {
		OpenGL.glUnmapBufferARB(((Class326) this).anInt3762);
	}

	public long method37(int i, int i_4_) {
		OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
		return (OpenGL.glMapBufferARB(((Class326) this).anInt3762, 35001) + (long) i);
	}

	public void method43() {
		OpenGL.glUnmapBufferARB(((Class326) this).anInt3762);
	}

	boolean method5798(int i, Source source) {
		if (i > ((Class326) this).anInt3764) {
			method5793();
			if (((Class326) this).anInt3758 > 0) {
				OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
				OpenGL.glBufferDataARBa(((Class326) this).anInt3762, i, source.method2(), (((Class326) this).aBool3761 ? 35040 : 35044));
				((Class326) this).aClass505_Sub2_Sub1_3757.anInt8702 += i - ((Class326) this).anInt3763;
			} else {
				((Class326) this).aNativeHeapBuffer3765 = ((Class326) this).aClass505_Sub2_Sub1_3757.method13910(i, false);
				((Class326) this).aNativeHeapBuffer3765.method1176(source);
			}
			((Class326) this).anInt3764 = i;
		} else if (((Class326) this).anInt3758 > 0) {
			OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
			OpenGL.glBufferSubDataARBa(((Class326) this).anInt3762, 0, ((Class326) this).anInt3763, source.method2());
			((Class326) this).aClass505_Sub2_Sub1_3757.anInt8702 += i - ((Class326) this).anInt3763;
		} else {
			((Class326) this).aNativeHeapBuffer3765 = ((Class326) this).aClass505_Sub2_Sub1_3757.method13910(i, false);
			((Class326) this).aNativeHeapBuffer3765.method1176(source);
		}
		((Class326) this).anInt3763 = i;
		return true;
	}

	void method209(int i) {
		if (i > ((Class326) this).anInt3764) {
			method5793();
			if (((Class326) this).anInt3758 > 0) {
				OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
				OpenGL.glBufferDataARBub(((Class326) this).anInt3762, i, null, 0, (((Class326) this).aBool3761 ? 35040 : 35044));
				((Class326) this).aClass505_Sub2_Sub1_3757.anInt8702 += i - ((Class326) this).anInt3764;
			} else
				((Class326) this).aNativeHeapBuffer3765 = ((Class326) this).aClass505_Sub2_Sub1_3757.method13910(i, false);
			((Class326) this).anInt3764 = i;
		}
		((Class326) this).anInt3763 = i;
	}

	void method208(int i) {
		if (i > ((Class326) this).anInt3764) {
			method5793();
			if (((Class326) this).anInt3758 > 0) {
				OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
				OpenGL.glBufferDataARBub(((Class326) this).anInt3762, i, null, 0, (((Class326) this).aBool3761 ? 35040 : 35044));
				((Class326) this).aClass505_Sub2_Sub1_3757.anInt8702 += i - ((Class326) this).anInt3764;
			} else
				((Class326) this).aNativeHeapBuffer3765 = ((Class326) this).aClass505_Sub2_Sub1_3757.method13910(i, false);
			((Class326) this).anInt3764 = i;
		}
		((Class326) this).anInt3763 = i;
	}

	long method5799() {
		return (((Class326) this).anInt3758 == 0 ? ((Class326) this).aNativeHeapBuffer3765.method2() : 0L);
	}

	void method5800() {
		if (((Class505_Sub2_Sub1) ((Class326) this).aClass505_Sub2_Sub1_3757).aBool10193)
			OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
	}

	void method5801() {
		if (((Class505_Sub2_Sub1) ((Class326) this).aClass505_Sub2_Sub1_3757).aBool10193)
			OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
	}

	void method5802() {
		if (((Class505_Sub2_Sub1) ((Class326) this).aClass505_Sub2_Sub1_3757).aBool10193)
			OpenGL.glBindBufferARB(((Class326) this).anInt3762, ((Class326) this).anInt3758);
	}

	public int method36() {
		return ((Class326) this).anInt3763;
	}
}
