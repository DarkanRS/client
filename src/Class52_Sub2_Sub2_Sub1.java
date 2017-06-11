/* Class52_Sub2_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import jaggl.OpenGL;

public class Class52_Sub2_Sub2_Sub1 extends Class52_Sub2_Sub2 {
	OpenGL anOpenGL9988;
	long aLong9989;
	int anInt9990;
	Canvas aCanvas9991;
	int anInt9992;

	public void method138() {
		((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988.releaseSurface(((Class52_Sub2_Sub2_Sub1) this).aCanvas9991, ((Class52_Sub2_Sub2_Sub1) this).aLong9989);
	}

	Class52_Sub2_Sub2_Sub1(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Canvas canvas, long l) {
		super(class_ra_sub3_sub1);
		((Class52_Sub2_Sub2_Sub1) this).aCanvas9991 = canvas;
		((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988 = ((Class_ra_Sub3_Sub1) class_ra_sub3_sub1).anOpenGL9826;
		((Class52_Sub2_Sub2_Sub1) this).aLong9989 = l;
		method595();
	}

	boolean method548() {
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

	public int method552() {
		return ((Class52_Sub2_Sub2_Sub1) this).anInt9992;
	}

	public int method584(int i, int i_0_) {
		return 0;
	}

	void method595() {
		Dimension dimension = ((Class52_Sub2_Sub2_Sub1) this).aCanvas9991.getSize();
		((Class52_Sub2_Sub2_Sub1) this).anInt9992 = dimension.height;
		((Class52_Sub2_Sub2_Sub1) this).anInt9990 = dimension.width;
	}

	public int method549() {
		return ((Class52_Sub2_Sub2_Sub1) this).anInt9990;
	}

	public int method581(int i, int i_1_) {
		return 0;
	}

	boolean method136() {
		return (((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988.setSurface(((Class52_Sub2_Sub2_Sub1) this).aLong9989) && super.method136());
	}

	boolean method546() {
		return true;
	}

	public void method135() {
		((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988.releaseSurface(((Class52_Sub2_Sub2_Sub1) this).aCanvas9991, ((Class52_Sub2_Sub2_Sub1) this).aLong9989);
	}

	public int method544() {
		return ((Class52_Sub2_Sub2_Sub1) this).anInt9992;
	}

	void method582(int i, int i_2_) {
		((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988.surfaceResized(((Class52_Sub2_Sub2_Sub1) this).aLong9989);
		method595();
		super.method582(i, i_2_);
	}

	public int method587(int i, int i_3_) {
		return 0;
	}

	public void method137() {
		((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988.releaseSurface(((Class52_Sub2_Sub2_Sub1) this).aCanvas9991, ((Class52_Sub2_Sub2_Sub1) this).aLong9989);
	}

	boolean method134() {
		return (((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988.setSurface(((Class52_Sub2_Sub2_Sub1) this).aLong9989) && super.method136());
	}

	public int method580() {
		((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988.swapBuffers(((Class52_Sub2_Sub2_Sub1) this).aLong9989);
		return 0;
	}

	public int method545() {
		return ((Class52_Sub2_Sub2_Sub1) this).anInt9990;
	}

	public int method551() {
		return ((Class52_Sub2_Sub2_Sub1) this).anInt9990;
	}

	public int method547() {
		return ((Class52_Sub2_Sub2_Sub1) this).anInt9990;
	}

	public int method579() {
		((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988.swapBuffers(((Class52_Sub2_Sub2_Sub1) this).aLong9989);
		return 0;
	}

	Class52_Sub2_Sub2_Sub1(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Canvas canvas) {
		this(class_ra_sub3_sub1, canvas, ((Class_ra_Sub3_Sub1) class_ra_sub3_sub1).anOpenGL9826.prepareSurface(canvas));
	}

	public int method585(int i, int i_4_) {
		return 0;
	}

	public int method586(int i, int i_5_) {
		return 0;
	}

	public int method550() {
		return ((Class52_Sub2_Sub2_Sub1) this).anInt9990;
	}

	void method583(int i, int i_6_) {
		((Class52_Sub2_Sub2_Sub1) this).anOpenGL9988.surfaceResized(((Class52_Sub2_Sub2_Sub1) this).aLong9989);
		method595();
		super.method582(i, i_6_);
	}
}
