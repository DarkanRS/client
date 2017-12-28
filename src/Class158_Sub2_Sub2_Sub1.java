
/* Class158_Sub2_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class158_Sub2_Sub2_Sub1 extends Class158_Sub2_Sub2 {
	int anInt10298;
	OpenGL anOpenGL10299;
	long aLong10300;
	int anInt10301;
	Canvas aCanvas10302;

	public int method14345(int i, int i_0_) {
		return 0;
	}

	Class158_Sub2_Sub2_Sub1(Class505_Sub2_Sub1 class505_sub2_sub1, Canvas canvas, long l) {
		super(class505_sub2_sub1);
		((Class158_Sub2_Sub2_Sub1) this).aCanvas10302 = canvas;
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299 = ((Class505_Sub2_Sub1) class505_sub2_sub1).anOpenGL10191;
		((Class158_Sub2_Sub2_Sub1) this).aLong10300 = l;
		method15723();
	}

	public int method14352(int i, int i_1_) {
		return 0;
	}

	public int method2716() {
		return ((Class158_Sub2_Sub2_Sub1) this).anInt10298;
	}

	void method14348(int i, int i_2_) {
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.surfaceResized(((Class158_Sub2_Sub2_Sub1) this).aLong10300);
		method15723();
		super.method14354(i, i_2_);
	}

	void method15723() {
		Dimension dimension = ((Class158_Sub2_Sub2_Sub1) this).aCanvas10302.getSize();
		((Class158_Sub2_Sub2_Sub1) this).anInt10298 = dimension.height;
		((Class158_Sub2_Sub2_Sub1) this).anInt10301 = dimension.width;
	}

	public int method14344() {
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.swapBuffers(((Class158_Sub2_Sub2_Sub1) this).aLong10300);
		return 0;
	}

	public int method14353(int i, int i_3_) {
		return 0;
	}

	boolean method213() {
		return (((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.setSurface(((Class158_Sub2_Sub2_Sub1) this).aLong10300) && super.method213());
	}

	boolean method2724() {
		return true;
	}

	public void method212() {
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.releaseSurface(((Class158_Sub2_Sub2_Sub1) this).aCanvas10302, ((Class158_Sub2_Sub2_Sub1) this).aLong10300);
	}

	public int method14349() {
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.swapBuffers(((Class158_Sub2_Sub2_Sub1) this).aLong10300);
		return 0;
	}

	public int method2720() {
		return ((Class158_Sub2_Sub2_Sub1) this).anInt10301;
	}

	public int method2719() {
		return ((Class158_Sub2_Sub2_Sub1) this).anInt10301;
	}

	boolean method2717() {
		return true;
	}

	boolean method54() {
		return (((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.setSurface(((Class158_Sub2_Sub2_Sub1) this).aLong10300) && super.method213());
	}

	boolean method2723() {
		return true;
	}

	boolean method2715() {
		return true;
	}

	void method14347(int i, int i_4_) {
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.surfaceResized(((Class158_Sub2_Sub2_Sub1) this).aLong10300);
		method15723();
		super.method14354(i, i_4_);
	}

	void method14354(int i, int i_5_) {
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.surfaceResized(((Class158_Sub2_Sub2_Sub1) this).aLong10300);
		method15723();
		super.method14354(i, i_5_);
	}

	boolean method2725() {
		return true;
	}

	boolean method2722() {
		return true;
	}

	boolean method2718() {
		return true;
	}

	Class158_Sub2_Sub2_Sub1(Class505_Sub2_Sub1 class505_sub2_sub1, Canvas canvas) {
		this(class505_sub2_sub1, canvas, ((Class505_Sub2_Sub1) class505_sub2_sub1).anOpenGL10191.prepareSurface(canvas));
	}

	public int method2726() {
		return ((Class158_Sub2_Sub2_Sub1) this).anInt10301;
	}

	public int method2727() {
		return ((Class158_Sub2_Sub2_Sub1) this).anInt10298;
	}

	public int method2721() {
		return ((Class158_Sub2_Sub2_Sub1) this).anInt10298;
	}

	public int method14350() {
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.swapBuffers(((Class158_Sub2_Sub2_Sub1) this).aLong10300);
		return 0;
	}

	public int method14346() {
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.swapBuffers(((Class158_Sub2_Sub2_Sub1) this).aLong10300);
		return 0;
	}

	public void method186() {
		((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.releaseSurface(((Class158_Sub2_Sub2_Sub1) this).aCanvas10302, ((Class158_Sub2_Sub2_Sub1) this).aLong10300);
	}

	public int method2714() {
		return ((Class158_Sub2_Sub2_Sub1) this).anInt10301;
	}

	public int method14351(int i, int i_6_) {
		return 0;
	}

	boolean method211() {
		return (((Class158_Sub2_Sub2_Sub1) this).anOpenGL10299.setSurface(((Class158_Sub2_Sub2_Sub1) this).aLong10300) && super.method213());
	}

	void method15724() {
		Dimension dimension = ((Class158_Sub2_Sub2_Sub1) this).aCanvas10302.getSize();
		((Class158_Sub2_Sub2_Sub1) this).anInt10298 = dimension.height;
		((Class158_Sub2_Sub2_Sub1) this).anInt10301 = dimension.width;
	}

	void method15725() {
		Dimension dimension = ((Class158_Sub2_Sub2_Sub1) this).aCanvas10302.getSize();
		((Class158_Sub2_Sub2_Sub1) this).anInt10298 = dimension.height;
		((Class158_Sub2_Sub2_Sub1) this).anInt10301 = dimension.width;
	}
}
