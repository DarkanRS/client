package com.jagex;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class158_Sub2_Sub1 extends Class158_Sub2 {

	boolean aBool10122;
	OpenGLGraphicalRenderer aGraphicalRenderer_Sub1_10118;
	Canvas aCanvas10120;
	OpenGL anOpenGL10119;
	long aLong10117;
	int anInt10121;
	int anInt10116;

	boolean method2723() {
		return true;
	}

	Class158_Sub2_Sub1(OpenGLGraphicalRenderer class505_sub1_1, Canvas canvas_2, long long_3) {
		this.aBool10122 = false;
		this.aGraphicalRenderer_Sub1_10118 = class505_sub1_1;
		this.aCanvas10120 = canvas_2;
		this.anOpenGL10119 = class505_sub1_1.anOpenGL8352;
		this.aLong10117 = long_3;
		this.method15526();
	}

	public int method2714() {
		return this.anInt10116;
	}

	public int method2716() {
		return this.anInt10121;
	}

	void method15526() {
		Dimension dimension_1 = this.aCanvas10120.getSize();
		this.anInt10121 = dimension_1.height;
		this.anInt10116 = dimension_1.width;
	}

	public int method14344() {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.swapBuffers(this.aLong10117);
			return 0;
		}
	}

	boolean method213() {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.setSurface(this.aLong10117);
			this.aGraphicalRenderer_Sub1_10118.method13578();
			return true;
		}
	}

	boolean method2718() {
		return true;
	}

	public void method212() {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.releaseSurface(this.aCanvas10120, this.aLong10117);
			this.aBool10122 = true;
		}
	}

	public int method2719() {
		return this.anInt10116;
	}

	Class158_Sub2_Sub1(OpenGLGraphicalRenderer class505_sub1_1, Canvas canvas_2) {
		this(class505_sub1_1, canvas_2, class505_sub1_1.anOpenGL8352.prepareSurface(canvas_2));
	}

	void method14347(int i_1, int i_2) {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.surfaceResized(this.aLong10117);
			this.method15526();
			if (this == this.aGraphicalRenderer_Sub1_10118.method8523((byte) 120)) {
				this.aGraphicalRenderer_Sub1_10118.method13639();
			}

		}
	}

	public int method2721() {
		return this.anInt10121;
	}

	boolean method54() {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.setSurface(this.aLong10117);
			this.aGraphicalRenderer_Sub1_10118.method13578();
			return true;
		}
	}

	public int method2720() {
		return this.anInt10116;
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
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.releaseSurface(this.aCanvas10120, this.aLong10117);
			this.aBool10122 = true;
		}
	}

	boolean method2722() {
		return true;
	}

	void method14354(int i_1, int i_2) {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.surfaceResized(this.aLong10117);
			this.method15526();
			if (this == this.aGraphicalRenderer_Sub1_10118.method8523((byte) 126)) {
				this.aGraphicalRenderer_Sub1_10118.method13639();
			}

		}
	}

	void method14348(int i_1, int i_2) {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.surfaceResized(this.aLong10117);
			this.method15526();
			if (this == this.aGraphicalRenderer_Sub1_10118.method8523((byte) 110)) {
				this.aGraphicalRenderer_Sub1_10118.method13639();
			}

		}
	}

	public int method14351(int i_1, int i_2) {
		return 0;
	}

	public int method2727() {
		return this.anInt10121;
	}

	public int method14349() {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.swapBuffers(this.aLong10117);
			return 0;
		}
	}

	public int method14350() {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.swapBuffers(this.aLong10117);
			return 0;
		}
	}

	public int method14346() {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.swapBuffers(this.aLong10117);
			return 0;
		}
	}

	boolean method211() {
		if (this.aBool10122) {
			throw new IllegalStateException();
		} else {
			this.anOpenGL10119.setSurface(this.aLong10117);
			this.aGraphicalRenderer_Sub1_10118.method13578();
			return true;
		}
	}

	public int method14353(int i_1, int i_2) {
		return 0;
	}

	public int method2726() {
		return this.anInt10116;
	}

	public int method14352(int i_1, int i_2) {
		return 0;
	}

	boolean method2725() {
		return true;
	}

	public int method14345(int i_1, int i_2) {
		return 0;
	}

}
