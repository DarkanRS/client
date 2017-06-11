import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* Class512 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class512 {
	public static long aLong6227 = 94608000L;

	Class512() throws Throwable {
		throw new Error();
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
