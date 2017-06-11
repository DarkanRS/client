/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class40 {
	int anInt432;
	int anInt433;
	static int anInt434 = 34963;
	static int anInt435 = 34962;
	int anInt436;
	Class_ra_Sub2 aClass_ra_Sub2_437;
	boolean aBoolean438;
	boolean aBoolean439 = false;
	static int[] anIntArray440 = new int[1];

	Class40(Class_ra_Sub2 class_ra_sub2, int i, Buffer buffer, int i_0_, boolean bool) {
		((Class40) this).aClass_ra_Sub2_437 = class_ra_sub2;
		((Class40) this).anInt433 = i;
		((Class40) this).anInt432 = i_0_;
		((Class40) this).aBoolean438 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray440, 0);
		((Class40) this).anInt436 = anIntArray440[0];
		method478();
		OpenGL.glBufferDataARBa(i, ((Class40) this).anInt432, buffer.f(), ((Class40) this).aBoolean438 ? 35040 : 35044);
		((Class_ra_Sub2) ((Class40) this).aClass_ra_Sub2_437).anInt8112 += ((Class40) this).anInt432;
	}

	abstract void method478();

	void method479(byte[] is, int i) {
		method478();
		if (i > ((Class40) this).anInt432) {
			OpenGL.glBufferDataARBub(((Class40) this).anInt433, i, is, 0, (((Class40) this).aBoolean438 ? 35040 : 35044));
			((Class_ra_Sub2) ((Class40) this).aClass_ra_Sub2_437).anInt8112 += i - ((Class40) this).anInt432;
			((Class40) this).anInt432 = i;
		} else
			OpenGL.glBufferSubDataARBub(((Class40) this).anInt433, 0, i, is, 0);
	}

	Class40(Class_ra_Sub2 class_ra_sub2, int i, byte[] is, int i_1_, boolean bool) {
		((Class40) this).aClass_ra_Sub2_437 = class_ra_sub2;
		((Class40) this).anInt433 = i;
		((Class40) this).anInt432 = i_1_;
		((Class40) this).aBoolean438 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray440, 0);
		((Class40) this).anInt436 = anIntArray440[0];
		method478();
		OpenGL.glBufferDataARBub(i, ((Class40) this).anInt432, is, 0, ((Class40) this).aBoolean438 ? 35040 : 35044);
		((Class_ra_Sub2) ((Class40) this).aClass_ra_Sub2_437).anInt8112 += ((Class40) this).anInt432;
	}

	abstract void method480();
}
