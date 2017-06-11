/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class IOException_Sub1 extends IOException {
	IOException_Sub1(String string) {
		super(string);
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
