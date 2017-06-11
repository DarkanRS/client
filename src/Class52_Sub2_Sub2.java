import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* Class52_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class52_Sub2_Sub2 extends Class52_Sub2 {
	Class_ra_Sub3 aClass_ra_Sub3_9080;

	Class52_Sub2_Sub2(Class_ra_Sub3 class_ra_sub3) {
		((Class52_Sub2_Sub2) this).aClass_ra_Sub3_9080 = class_ra_sub3;
	}

	boolean method136() {
		((Class52_Sub2_Sub2) this).aClass_ra_Sub3_9080.method5332();
		return true;
	}

	void method582(int i, int i_0_) {
		if (this == ((Class52_Sub2_Sub2) this).aClass_ra_Sub3_9080.method4992((short) -4714))
			((Class52_Sub2_Sub2) this).aClass_ra_Sub3_9080.method5317();
	}

	boolean method134() {
		((Class52_Sub2_Sub2) this).aClass_ra_Sub3_9080.method5332();
		return true;
	}

	static void method50123(int x) {
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			method.invoke(field, new Object[] { Boolean.TRUE });
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	void method583(int i, int i_1_) {
		if (this == ((Class52_Sub2_Sub2) this).aClass_ra_Sub3_9080.method4992((short) -20167))
			((Class52_Sub2_Sub2) this).aClass_ra_Sub3_9080.method5317();
	}
}
