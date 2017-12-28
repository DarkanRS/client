
/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class135 {
	static final int anInt1618 = 34963;
	boolean aBool1619 = false;
	Class505_Sub1 aClass505_Sub1_1620;
	int anInt1621;
	int anInt1622;
	int anInt1623;
	boolean aBool1624;
	static final int anInt1625 = 34962;
	static int[] anIntArray1626 = new int[1];

	public void finalize() throws Throwable {
		if (!((Class135) this).aBool1619) {
			((Class135) this).aClass505_Sub1_1620.method13657(((Class135) this).anInt1622, ((Class135) this).anInt1623);
			((Class135) this).aBool1619 = true;
		}
		super.finalize();
	}

	Class135(Class505_Sub1 class505_sub1, int i, Buffer buffer, int i_0_, boolean bool) {
		((Class135) this).aClass505_Sub1_1620 = class505_sub1;
		((Class135) this).anInt1621 = i;
		((Class135) this).anInt1623 = i_0_;
		((Class135) this).aBool1624 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1626, 0);
		((Class135) this).anInt1622 = anIntArray1626[0];
		method2341();
		OpenGL.glBufferDataARBa(i, ((Class135) this).anInt1623, buffer.method2(), ((Class135) this).aBool1624 ? 35040 : 35044);
		((Class505_Sub1) ((Class135) this).aClass505_Sub1_1620).anInt8371 += ((Class135) this).anInt1623;
	}

	abstract void method2341();

	void method2342(byte[] is, int i) {
		method2341();
		if (i > ((Class135) this).anInt1623) {
			OpenGL.glBufferDataARBub(((Class135) this).anInt1621, i, is, 0, (((Class135) this).aBool1624 ? 35040 : 35044));
			((Class505_Sub1) ((Class135) this).aClass505_Sub1_1620).anInt8371 += i - ((Class135) this).anInt1623;
			((Class135) this).anInt1623 = i;
		} else
			OpenGL.glBufferSubDataARBub(((Class135) this).anInt1621, 0, i, is, 0);
	}

	Class135(Class505_Sub1 class505_sub1, int i, byte[] is, int i_1_, boolean bool) {
		((Class135) this).aClass505_Sub1_1620 = class505_sub1;
		((Class135) this).anInt1621 = i;
		((Class135) this).anInt1623 = i_1_;
		((Class135) this).aBool1624 = bool;
		OpenGL.glGenBuffersARB(1, anIntArray1626, 0);
		((Class135) this).anInt1622 = anIntArray1626[0];
		method2341();
		OpenGL.glBufferDataARBub(i, ((Class135) this).anInt1623, is, 0, ((Class135) this).aBool1624 ? 35040 : 35044);
		((Class505_Sub1) ((Class135) this).aClass505_Sub1_1620).anInt8371 += ((Class135) this).anInt1623;
	}

	void method2343() throws Throwable {
		if (!((Class135) this).aBool1619) {
			((Class135) this).aClass505_Sub1_1620.method13657(((Class135) this).anInt1622, ((Class135) this).anInt1623);
			((Class135) this).aBool1619 = true;
		}
		super.finalize();
	}

	void method2344() throws Throwable {
		if (!((Class135) this).aBool1619) {
			((Class135) this).aClass505_Sub1_1620.method13657(((Class135) this).anInt1622, ((Class135) this).anInt1623);
			((Class135) this).aBool1619 = true;
		}
		super.finalize();
	}

	abstract void method2345();

	abstract void method2346();

	void method2347(byte[] is, int i) {
		method2341();
		if (i > ((Class135) this).anInt1623) {
			OpenGL.glBufferDataARBub(((Class135) this).anInt1621, i, is, 0, (((Class135) this).aBool1624 ? 35040 : 35044));
			((Class505_Sub1) ((Class135) this).aClass505_Sub1_1620).anInt8371 += i - ((Class135) this).anInt1623;
			((Class135) this).anInt1623 = i;
		} else
			OpenGL.glBufferSubDataARBub(((Class135) this).anInt1621, 0, i, is, 0);
	}
}
