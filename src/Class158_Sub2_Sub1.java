
/* Class158_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class158_Sub2_Sub1 extends Class158_Sub2 {
	int anInt10116;
	long aLong10117;
	Class505_Sub1 aClass505_Sub1_10118;
	OpenGL anOpenGL10119;
	Canvas aCanvas10120;
	int anInt10121;
	boolean aBool10122 = false;

	boolean method2723() {
		return true;
	}

	Class158_Sub2_Sub1(Class505_Sub1 class505_sub1, Canvas canvas, long l) {
		((Class158_Sub2_Sub1) this).aClass505_Sub1_10118 = class505_sub1;
		((Class158_Sub2_Sub1) this).aCanvas10120 = canvas;
		((Class158_Sub2_Sub1) this).anOpenGL10119 = ((Class505_Sub1) class505_sub1).anOpenGL8352;
		((Class158_Sub2_Sub1) this).aLong10117 = l;
		method15526();
	}

	public int method2714() {
		return ((Class158_Sub2_Sub1) this).anInt10116;
	}

	public int method2716() {
		return ((Class158_Sub2_Sub1) this).anInt10121;
	}

	void method15525() {
		Dimension dimension = ((Class158_Sub2_Sub1) this).aCanvas10120.getSize();
		((Class158_Sub2_Sub1) this).anInt10121 = dimension.height;
		((Class158_Sub2_Sub1) this).anInt10116 = dimension.width;
	}

	void method15526() {
		Dimension dimension = ((Class158_Sub2_Sub1) this).aCanvas10120.getSize();
		((Class158_Sub2_Sub1) this).anInt10121 = dimension.height;
		((Class158_Sub2_Sub1) this).anInt10116 = dimension.width;
	}

	public int method14344() {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.swapBuffers(((Class158_Sub2_Sub1) this).aLong10117);
		return 0;
	}

	void method15527() {
		Dimension dimension = ((Class158_Sub2_Sub1) this).aCanvas10120.getSize();
		((Class158_Sub2_Sub1) this).anInt10121 = dimension.height;
		((Class158_Sub2_Sub1) this).anInt10116 = dimension.width;
	}

	boolean method213() {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.setSurface(((Class158_Sub2_Sub1) this).aLong10117);
		((Class158_Sub2_Sub1) this).aClass505_Sub1_10118.method13578();
		return true;
	}

	boolean method2718() {
		return true;
	}

	public void method212() {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.releaseSurface(((Class158_Sub2_Sub1) this).aCanvas10120, ((Class158_Sub2_Sub1) this).aLong10117);
		((Class158_Sub2_Sub1) this).aBool10122 = true;
	}

	public int method2719() {
		return ((Class158_Sub2_Sub1) this).anInt10116;
	}

	Class158_Sub2_Sub1(Class505_Sub1 class505_sub1, Canvas canvas) {
		this(class505_sub1, canvas, ((Class505_Sub1) class505_sub1).anOpenGL8352.prepareSurface(canvas));
	}

	void method14347(int i, int i_0_) {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.surfaceResized(((Class158_Sub2_Sub1) this).aLong10117);
		method15526();
		if (this == ((Class158_Sub2_Sub1) this).aClass505_Sub1_10118.method8523((byte) 120))
			((Class158_Sub2_Sub1) this).aClass505_Sub1_10118.method13639();
	}

	public int method2721() {
		return ((Class158_Sub2_Sub1) this).anInt10121;
	}

	boolean method54() {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.setSurface(((Class158_Sub2_Sub1) this).aLong10117);
		((Class158_Sub2_Sub1) this).aClass505_Sub1_10118.method13578();
		return true;
	}

	public int method2720() {
		return ((Class158_Sub2_Sub1) this).anInt10116;
	}

	boolean method2715() {
		return true;
	}

	boolean method2717() {
		return true;
	}

	boolean method2724() {
		return true;
	}

	public void method186() {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.releaseSurface(((Class158_Sub2_Sub1) this).aCanvas10120, ((Class158_Sub2_Sub1) this).aLong10117);
		((Class158_Sub2_Sub1) this).aBool10122 = true;
	}

	boolean method2722() {
		return true;
	}

	void method14354(int i, int i_1_) {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.surfaceResized(((Class158_Sub2_Sub1) this).aLong10117);
		method15526();
		if (this == ((Class158_Sub2_Sub1) this).aClass505_Sub1_10118.method8523((byte) 126))
			((Class158_Sub2_Sub1) this).aClass505_Sub1_10118.method13639();
	}

	void method14348(int i, int i_2_) {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.surfaceResized(((Class158_Sub2_Sub1) this).aLong10117);
		method15526();
		if (this == ((Class158_Sub2_Sub1) this).aClass505_Sub1_10118.method8523((byte) 110))
			((Class158_Sub2_Sub1) this).aClass505_Sub1_10118.method13639();
	}

	public int method14351(int i, int i_3_) {
		return 0;
	}

	public int method2727() {
		return ((Class158_Sub2_Sub1) this).anInt10121;
	}

	public int method14349() {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.swapBuffers(((Class158_Sub2_Sub1) this).aLong10117);
		return 0;
	}

	public int method14350() {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.swapBuffers(((Class158_Sub2_Sub1) this).aLong10117);
		return 0;
	}

	public int method14346() {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.swapBuffers(((Class158_Sub2_Sub1) this).aLong10117);
		return 0;
	}

	boolean method211() {
		if (((Class158_Sub2_Sub1) this).aBool10122)
			throw new IllegalStateException();
		((Class158_Sub2_Sub1) this).anOpenGL10119.setSurface(((Class158_Sub2_Sub1) this).aLong10117);
		((Class158_Sub2_Sub1) this).aClass505_Sub1_10118.method13578();
		return true;
	}

	void method15528() {
		Dimension dimension = ((Class158_Sub2_Sub1) this).aCanvas10120.getSize();
		((Class158_Sub2_Sub1) this).anInt10121 = dimension.height;
		((Class158_Sub2_Sub1) this).anInt10116 = dimension.width;
	}

	public int method14353(int i, int i_4_) {
		return 0;
	}

	public int method2726() {
		return ((Class158_Sub2_Sub1) this).anInt10116;
	}

	public int method14352(int i, int i_5_) {
		return 0;
	}

	boolean method2725() {
		return true;
	}

	public int method14345(int i, int i_6_) {
		return 0;
	}
}
