
/* Class141_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141_Sub7 extends Class141 {
	Class138 aClass138_9088;
	static final char aChar9089 = '\001';
	boolean aBool9090 = false;
	static final char aChar9091 = '\0';

	void method2403(boolean bool) {
		Class137_Sub2 class137_sub2 = ((Class141_Sub7) this).aClass505_Sub1_1664.method13596();
		if (((Class141_Sub7) this).aClass138_9088 != null && class137_sub2 != null && bool) {
			((Class141_Sub7) this).aClass138_9088.method2379('\0');
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13654(class137_sub2);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class505_Sub1) ((Class141_Sub7) this).aClass505_Sub1_1664).aClass384_8391.method6534(((Class505_Sub1) ((Class141_Sub7) this).aClass505_Sub1_1664).aFloatArray8477)), 0);
			OpenGL.glMatrixMode(5888);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub7) this).aBool9090 = true;
		} else
			((Class141_Sub7) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
	}

	void method2402(boolean bool) {
		Class137_Sub2 class137_sub2 = ((Class141_Sub7) this).aClass505_Sub1_1664.method13596();
		if (((Class141_Sub7) this).aClass138_9088 != null && class137_sub2 != null && bool) {
			((Class141_Sub7) this).aClass138_9088.method2379('\0');
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13654(class137_sub2);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class505_Sub1) ((Class141_Sub7) this).aClass505_Sub1_1664).aClass384_8391.method6534(((Class505_Sub1) ((Class141_Sub7) this).aClass505_Sub1_1664).aFloatArray8477)), 0);
			OpenGL.glMatrixMode(5888);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub7) this).aBool9090 = true;
		} else
			((Class141_Sub7) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
	}

	Class141_Sub7(Class505_Sub1 class505_sub1) {
		super(class505_sub1);
		if (((Class505_Sub1) class505_sub1).aBool8480) {
			((Class141_Sub7) this).aClass138_9088 = new Class138(class505_sub1, 2);
			((Class141_Sub7) this).aClass138_9088.method2380(0);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13717(34165, 7681);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13595(2, 34168, 770);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13616(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub7) this).aClass138_9088.method2381();
			((Class141_Sub7) this).aClass138_9088.method2380(1);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13595(2, 34166, 770);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub7) this).aClass138_9088.method2381();
		}
	}

	void method2394(Class137 class137, int i) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub7) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2398() {
		if (((Class141_Sub7) this).aBool9090) {
			((Class141_Sub7) this).aClass138_9088.method2379('\001');
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(0);
		} else
			((Class141_Sub7) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		((Class141_Sub7) this).aClass505_Sub1_1664.method13717(8448, 8448);
		((Class141_Sub7) this).aBool9090 = false;
	}

	void method2399(int i, int i_0_) {
		/* empty */
	}

	void method2400(Class137 class137, int i) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub7) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2411() {
		if (((Class141_Sub7) this).aBool9090) {
			((Class141_Sub7) this).aClass138_9088.method2379('\001');
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(0);
		} else
			((Class141_Sub7) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		((Class141_Sub7) this).aClass505_Sub1_1664.method13717(8448, 8448);
		((Class141_Sub7) this).aBool9090 = false;
	}

	boolean method2395() {
		return true;
	}

	void method2408(boolean bool) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	void method2404(boolean bool) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	void method2405(boolean bool) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	void method2406(boolean bool) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	void method2407(boolean bool) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	boolean method2401() {
		return true;
	}

	void method2409(int i, int i_1_) {
		/* empty */
	}

	void method2396(int i, int i_2_) {
		/* empty */
	}

	void method2410(int i, int i_3_) {
		/* empty */
	}

	void method2397(boolean bool) {
		Class137_Sub2 class137_sub2 = ((Class141_Sub7) this).aClass505_Sub1_1664.method13596();
		if (((Class141_Sub7) this).aClass138_9088 != null && class137_sub2 != null && bool) {
			((Class141_Sub7) this).aClass138_9088.method2379('\0');
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13654(class137_sub2);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class505_Sub1) ((Class141_Sub7) this).aClass505_Sub1_1664).aClass384_8391.method6534(((Class505_Sub1) ((Class141_Sub7) this).aClass505_Sub1_1664).aFloatArray8477)), 0);
			OpenGL.glMatrixMode(5888);
			((Class141_Sub7) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub7) this).aBool9090 = true;
		} else
			((Class141_Sub7) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
	}

	void method2412(Class137 class137, int i) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub7) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2413(Class137 class137, int i) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub7) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2414(Class137 class137, int i) {
		((Class141_Sub7) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub7) this).aClass505_Sub1_1664.method13612(i);
	}
}
