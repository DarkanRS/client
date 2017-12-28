
/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class376 implements Interface26, Interface34 {
	long aLong4514;
	Class360_Sub2_Sub1 aClass360_Sub2_Sub1_4515;
	int anInt4516;

	void method6382() {
		method184();
	}

	public int method1() {
		return ((Class376) this).aClass360_Sub2_Sub1_4515.method1();
	}

	void method6383() {
		method184();
	}

	public long method2() {
		if (((Class376) this).aLong4514 == 0L)
			((Class376) this).aLong4514 = (IDirect3DTexture.GetSurfaceLevel(((Class360_Sub2_Sub1) ((Class376) this).aClass360_Sub2_Sub1_4515).aLong4168, ((Class376) this).anInt4516));
		return ((Class376) this).aLong4514;
	}

	public int method74() {
		return ((Class376) this).aClass360_Sub2_Sub1_4515.method59();
	}

	public void method184() {
		if (((Class376) this).aLong4514 != 0L) {
			((Class360_Sub2_Sub1) ((Class376) this).aClass360_Sub2_Sub1_4515).aClass505_Sub2_Sub2_4165.method15650(((Class376) this).aLong4514);
			((Class376) this).aLong4514 = 0L;
		}
	}

	public void finalize() {
		method184();
	}

	public int method75() {
		return ((Class376) this).aClass360_Sub2_Sub1_4515.method1();
	}

	public void method26() {
		if (((Class376) this).aLong4514 != 0L) {
			IUnknown.Release(((Class376) this).aLong4514);
			((Class376) this).aLong4514 = 0L;
		}
		((Class360_Sub2_Sub1) ((Class376) this).aClass360_Sub2_Sub1_4515).aClass505_Sub2_Sub2_4165.method13885(this);
	}

	public int method39() {
		return ((Class376) this).aClass360_Sub2_Sub1_4515.method59();
	}

	public int method73() {
		return ((Class376) this).aClass360_Sub2_Sub1_4515.method59();
	}

	public int method77() {
		return ((Class376) this).aClass360_Sub2_Sub1_4515.method59();
	}

	public void method32() {
		if (((Class376) this).aLong4514 != 0L) {
			IUnknown.Release(((Class376) this).aLong4514);
			((Class376) this).aLong4514 = 0L;
		}
		((Class360_Sub2_Sub1) ((Class376) this).aClass360_Sub2_Sub1_4515).aClass505_Sub2_Sub2_4165.method13885(this);
	}

	public long method123() {
		if (((Class376) this).aLong4514 == 0L)
			((Class376) this).aLong4514 = (IDirect3DTexture.GetSurfaceLevel(((Class360_Sub2_Sub1) ((Class376) this).aClass360_Sub2_Sub1_4515).aLong4168, ((Class376) this).anInt4516));
		return ((Class376) this).aLong4514;
	}

	Class376(Class360_Sub2_Sub1 class360_sub2_sub1, int i) {
		((Class376) this).anInt4516 = i;
		((Class376) this).aClass360_Sub2_Sub1_4515 = class360_sub2_sub1;
		((Class360_Sub2_Sub1) ((Class376) this).aClass360_Sub2_Sub1_4515).aClass505_Sub2_Sub2_4165.method13901(this);
	}

	public void method185() {
		if (((Class376) this).aLong4514 != 0L) {
			((Class360_Sub2_Sub1) ((Class376) this).aClass360_Sub2_Sub1_4515).aClass505_Sub2_Sub2_4165.method15650(((Class376) this).aLong4514);
			((Class376) this).aLong4514 = 0L;
		}
	}

	public int method76() {
		return ((Class376) this).aClass360_Sub2_Sub1_4515.method1();
	}
}
