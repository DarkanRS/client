/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class246 implements Interface7 {
	NativeHeapBuffer aNativeHeapBuffer6390;
	static int anInt6391 = 34963;
	Class_ra_Sub3_Sub1 aClass_ra_Sub3_Sub1_6392;
	int anInt6393;
	int anInt6394;
	int anInt6395 = -1;
	boolean aBoolean6396;
	int anInt6397;
	static int anInt6398 = 34962;
	static int[] anIntArray6399 = new int[1];

	public boolean method67(int i, int i_0_, long l) {
		method2331();
		if (((Class246) this).anInt6395 > 0) {
			OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
			OpenGL.glBufferSubDataARBa(((Class246) this).anInt6393, i, i_0_, l);
		} else
			((Class246) this).aNativeHeapBuffer6390.f.copy(((Class246) this).aNativeHeapBuffer6390.f() + (long) i, l, i_0_);
		return true;
	}

	void method2331() {
		if (((Class246) this).anInt6395 < 0) {
			if (((Class_ra_Sub3_Sub1) ((Class246) this).aClass_ra_Sub3_Sub1_6392).aBoolean9825) {
				OpenGL.glGenBuffersARB(1, anIntArray6399, 0);
				((Class246) this).anInt6395 = anIntArray6399[0];
				OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
			} else
				((Class246) this).anInt6395 = 0;
		}
	}

	long method2332() {
		return (((Class246) this).anInt6395 == 0 ? ((Class246) this).aNativeHeapBuffer6390.f() : 0L);
	}

	void method113(int i) {
		if (i > ((Class246) this).anInt6397) {
			method2331();
			if (((Class246) this).anInt6395 > 0) {
				OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
				OpenGL.glBufferDataARBub(((Class246) this).anInt6393, i, null, 0, (((Class246) this).aBoolean6396 ? 35040 : 35044));
				((Class246) this).aClass_ra_Sub3_Sub1_6392.anInt8224 += i - ((Class246) this).anInt6397;
			} else
				((Class246) this).aNativeHeapBuffer6390 = ((Class246) this).aClass_ra_Sub3_Sub1_6392.method5517(i, false);
			((Class246) this).anInt6397 = i;
		}
		((Class246) this).anInt6394 = i;
	}

	public int method60() {
		return ((Class246) this).anInt6394;
	}

	public long method62(int i, int i_1_) {
		OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
		return (OpenGL.glMapBufferARB(((Class246) this).anInt6393, 35001) + (long) i);
	}

	public void method69() {
		OpenGL.glUnmapBufferARB(((Class246) this).anInt6393);
	}

	Class246(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, int i, boolean bool) {
		((Class246) this).aClass_ra_Sub3_Sub1_6392 = class_ra_sub3_sub1;
		((Class246) this).anInt6393 = i;
		((Class246) this).aBoolean6396 = bool;
	}

	public boolean method63(int i, int i_2_, long l) {
		method2331();
		if (((Class246) this).anInt6395 > 0) {
			OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
			OpenGL.glBufferSubDataARBa(((Class246) this).anInt6393, i, i_2_, l);
		} else
			((Class246) this).aNativeHeapBuffer6390.f.copy(((Class246) this).aNativeHeapBuffer6390.f() + (long) i, l, i_2_);
		return true;
	}

	void method2333() {
		if (((Class_ra_Sub3_Sub1) ((Class246) this).aClass_ra_Sub3_Sub1_6392).aBoolean9825)
			OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
	}

	boolean method2334(int i, Source source) {
		if (i > ((Class246) this).anInt6397) {
			method2331();
			if (((Class246) this).anInt6395 > 0) {
				OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
				OpenGL.glBufferDataARBa(((Class246) this).anInt6393, i, source.f(), (((Class246) this).aBoolean6396 ? 35040 : 35044));
				((Class246) this).aClass_ra_Sub3_Sub1_6392.anInt8224 += i - ((Class246) this).anInt6394;
			} else {
				((Class246) this).aNativeHeapBuffer6390 = ((Class246) this).aClass_ra_Sub3_Sub1_6392.method5517(i, false);
				((Class246) this).aNativeHeapBuffer6390.z(source);
			}
			((Class246) this).anInt6397 = i;
		} else if (((Class246) this).anInt6395 > 0) {
			OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
			OpenGL.glBufferSubDataARBa(((Class246) this).anInt6393, 0, ((Class246) this).anInt6394, source.f());
			((Class246) this).aClass_ra_Sub3_Sub1_6392.anInt8224 += i - ((Class246) this).anInt6394;
		} else {
			((Class246) this).aNativeHeapBuffer6390 = ((Class246) this).aClass_ra_Sub3_Sub1_6392.method5517(i, false);
			((Class246) this).aNativeHeapBuffer6390.z(source);
		}
		((Class246) this).anInt6394 = i;
		return true;
	}

	public int method64() {
		return ((Class246) this).anInt6394;
	}

	public boolean method61(int i, int i_3_, long l) {
		method2331();
		if (((Class246) this).anInt6395 > 0) {
			OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
			OpenGL.glBufferSubDataARBa(((Class246) this).anInt6393, i, i_3_, l);
		} else
			((Class246) this).aNativeHeapBuffer6390.f.copy(((Class246) this).aNativeHeapBuffer6390.f() + (long) i, l, i_3_);
		return true;
	}

	public int method65() {
		return ((Class246) this).anInt6394;
	}

	public long method68(int i, int i_4_) {
		OpenGL.glBindBufferARB(((Class246) this).anInt6393, ((Class246) this).anInt6395);
		return (OpenGL.glMapBufferARB(((Class246) this).anInt6393, 35001) + (long) i);
	}

	public void method66() {
		OpenGL.glUnmapBufferARB(((Class246) this).anInt6393);
	}

	void b() {
		if (((Class246) this).anInt6395 > 0) {
			((Class246) this).aClass_ra_Sub3_Sub1_6392.method5536(((Class246) this).anInt6395, ((Class246) this).anInt6394);
			((Class246) this).anInt6395 = -1;
		}
	}
}
