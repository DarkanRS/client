/* Class52_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class52_Sub2_Sub3 extends Class52_Sub2 {
	Class_ra_Sub2 aClass_ra_Sub2_9081;
	Canvas aCanvas9082;
	OpenGL anOpenGL9083;
	long aLong9084;
	int anInt9085;
	int anInt9086;
	boolean aBoolean9087 = false;

	public int method545() {
		return ((Class52_Sub2_Sub3) this).anInt9085;
	}

	boolean method136() {
		if (((Class52_Sub2_Sub3) this).aBoolean9087)
			throw new IllegalStateException();
		((Class52_Sub2_Sub3) this).anOpenGL9083.setSurface(((Class52_Sub2_Sub3) this).aLong9084);
		((Class52_Sub2_Sub3) this).aClass_ra_Sub2_9081.method5225();
		return true;
	}

	public int method552() {
		return ((Class52_Sub2_Sub3) this).anInt9086;
	}

	void method582(int i, int i_0_) {
		if (((Class52_Sub2_Sub3) this).aBoolean9087)
			throw new IllegalStateException();
		((Class52_Sub2_Sub3) this).anOpenGL9083.surfaceResized(((Class52_Sub2_Sub3) this).aLong9084);
		method597();
		if (this == ((Class52_Sub2_Sub3) this).aClass_ra_Sub2_9081.method4992((short) 2050))
			((Class52_Sub2_Sub3) this).aClass_ra_Sub2_9081.method5257();
	}

	void method597() {
		Dimension dimension = ((Class52_Sub2_Sub3) this).aCanvas9082.getSize();
		((Class52_Sub2_Sub3) this).anInt9086 = dimension.height;
		((Class52_Sub2_Sub3) this).anInt9085 = dimension.width;
	}

	public int method580() {
		if (((Class52_Sub2_Sub3) this).aBoolean9087)
			throw new IllegalStateException();
		((Class52_Sub2_Sub3) this).anOpenGL9083.swapBuffers(((Class52_Sub2_Sub3) this).aLong9084);
		return 0;
	}

	Class52_Sub2_Sub3(Class_ra_Sub2 class_ra_sub2, Canvas canvas) {
		this(class_ra_sub2, canvas, ((Class_ra_Sub2) class_ra_sub2).anOpenGL8116.prepareSurface(canvas));
	}

	public void method138() {
		if (((Class52_Sub2_Sub3) this).aBoolean9087)
			throw new IllegalStateException();
		((Class52_Sub2_Sub3) this).anOpenGL9083.releaseSurface(((Class52_Sub2_Sub3) this).aCanvas9082, ((Class52_Sub2_Sub3) this).aLong9084);
		((Class52_Sub2_Sub3) this).aBoolean9087 = true;
	}

	public int method581(int i, int i_1_) {
		return 0;
	}

	public void method135() {
		if (((Class52_Sub2_Sub3) this).aBoolean9087)
			throw new IllegalStateException();
		((Class52_Sub2_Sub3) this).anOpenGL9083.releaseSurface(((Class52_Sub2_Sub3) this).aCanvas9082, ((Class52_Sub2_Sub3) this).aLong9084);
		((Class52_Sub2_Sub3) this).aBoolean9087 = true;
	}

	public int method544() {
		return ((Class52_Sub2_Sub3) this).anInt9086;
	}

	boolean method134() {
		if (((Class52_Sub2_Sub3) this).aBoolean9087)
			throw new IllegalStateException();
		((Class52_Sub2_Sub3) this).anOpenGL9083.setSurface(((Class52_Sub2_Sub3) this).aLong9084);
		((Class52_Sub2_Sub3) this).aClass_ra_Sub2_9081.method5225();
		return true;
	}

	boolean method548() {
		return true;
	}

	public int method549() {
		return ((Class52_Sub2_Sub3) this).anInt9085;
	}

	public int method550() {
		return ((Class52_Sub2_Sub3) this).anInt9085;
	}

	void method583(int i, int i_2_) {
		if (((Class52_Sub2_Sub3) this).aBoolean9087)
			throw new IllegalStateException();
		((Class52_Sub2_Sub3) this).anOpenGL9083.surfaceResized(((Class52_Sub2_Sub3) this).aLong9084);
		method597();
		if (this == ((Class52_Sub2_Sub3) this).aClass_ra_Sub2_9081.method4992((short) -3580))
			((Class52_Sub2_Sub3) this).aClass_ra_Sub2_9081.method5257();
	}

	boolean method546() {
		return true;
	}

	Class52_Sub2_Sub3(Class_ra_Sub2 class_ra_sub2, Canvas canvas, long l) {
		((Class52_Sub2_Sub3) this).aClass_ra_Sub2_9081 = class_ra_sub2;
		((Class52_Sub2_Sub3) this).aCanvas9082 = canvas;
		((Class52_Sub2_Sub3) this).anOpenGL9083 = ((Class_ra_Sub2) class_ra_sub2).anOpenGL8116;
		((Class52_Sub2_Sub3) this).aLong9084 = l;
		method597();
	}

	public int method551() {
		return ((Class52_Sub2_Sub3) this).anInt9085;
	}

	public int method547() {
		return ((Class52_Sub2_Sub3) this).anInt9085;
	}

	public int method579() {
		if (((Class52_Sub2_Sub3) this).aBoolean9087)
			throw new IllegalStateException();
		((Class52_Sub2_Sub3) this).anOpenGL9083.swapBuffers(((Class52_Sub2_Sub3) this).aLong9084);
		return 0;
	}

	public int method584(int i, int i_3_) {
		return 0;
	}

	public int method585(int i, int i_4_) {
		return 0;
	}

	public int method586(int i, int i_5_) {
		return 0;
	}

	public int method587(int i, int i_6_) {
		return 0;
	}

	public void method137() {
		if (((Class52_Sub2_Sub3) this).aBoolean9087)
			throw new IllegalStateException();
		((Class52_Sub2_Sub3) this).anOpenGL9083.releaseSurface(((Class52_Sub2_Sub3) this).aCanvas9082, ((Class52_Sub2_Sub3) this).aLong9084);
		((Class52_Sub2_Sub3) this).aBoolean9087 = true;
	}
}
