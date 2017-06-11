/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class Canvas_Sub1 extends Canvas {
	Component aComponent10;

	public final void update(Graphics graphics) {
		try {
			((Canvas_Sub1) this).aComponent10.update(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajk.update(").append(')').toString());
		}
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

	public final void paint(Graphics graphics) {
		try {
			((Canvas_Sub1) this).aComponent10.paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajk.paint(").append(')').toString());
		}
	}

	Canvas_Sub1(Component component) {
		((Canvas_Sub1) this).aComponent10 = component;
	}
}
