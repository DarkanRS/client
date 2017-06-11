/* WeakReference_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class WeakReference_Sub1 extends WeakReference {
	int anInt6301;
	WeakReference_Sub1 aWeakReference_Sub1_6302;

	WeakReference_Sub1(Object object, ReferenceQueue referencequeue, int i, Object object_0_) {
		super(object, referencequeue);
		((WeakReference_Sub1) this).anInt6301 = -1512844761 * i;
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
}
