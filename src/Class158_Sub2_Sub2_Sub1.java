import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class158_Sub2_Sub2_Sub1 extends Class158_Sub2_Sub2 {

	Canvas aCanvas10302;
	OpenGL anOpenGL10299;
	long aLong10300;
	int anInt10298;
	int anInt10301;

	public int method14345(int i_1, int i_2) {
		return 0;
	}

	Class158_Sub2_Sub2_Sub1(Class505_Sub2_Sub1 class505_sub2_sub1_1, Canvas canvas_2, long long_3) {
		super(class505_sub2_sub1_1);
		this.aCanvas10302 = canvas_2;
		this.anOpenGL10299 = class505_sub2_sub1_1.anOpenGL10191;
		this.aLong10300 = long_3;
		this.method15723();
	}

	public int method14352(int i_1, int i_2) {
		return 0;
	}

	public int method2716() {
		return this.anInt10298;
	}

	void method14348(int i_1, int i_2) {
		this.anOpenGL10299.surfaceResized(this.aLong10300);
		this.method15723();
		super.method14354(i_1, i_2);
	}

	void method15723() {
		Dimension dimension_1 = this.aCanvas10302.getSize();
		this.anInt10298 = dimension_1.height;
		this.anInt10301 = dimension_1.width;
	}

	public int method14344() {
		this.anOpenGL10299.swapBuffers(this.aLong10300);
		return 0;
	}

	public int method14353(int i_1, int i_2) {
		return 0;
	}

	boolean method213() {
		return this.anOpenGL10299.setSurface(this.aLong10300) && super.method213();
	}

	boolean method2724() {
		return true;
	}

	public void method212() {
		this.anOpenGL10299.releaseSurface(this.aCanvas10302, this.aLong10300);
	}

	public int method14349() {
		this.anOpenGL10299.swapBuffers(this.aLong10300);
		return 0;
	}

	public int method2720() {
		return this.anInt10301;
	}

	public int method2719() {
		return this.anInt10301;
	}

	boolean method2717() {
		return true;
	}

	boolean method54() {
		return this.anOpenGL10299.setSurface(this.aLong10300) && super.method213();
	}

	boolean method2723() {
		return true;
	}

	boolean method2715() {
		return true;
	}

	void method14347(int i_1, int i_2) {
		this.anOpenGL10299.surfaceResized(this.aLong10300);
		this.method15723();
		super.method14354(i_1, i_2);
	}

	void method14354(int i_1, int i_2) {
		this.anOpenGL10299.surfaceResized(this.aLong10300);
		this.method15723();
		super.method14354(i_1, i_2);
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

	Class158_Sub2_Sub2_Sub1(Class505_Sub2_Sub1 class505_sub2_sub1_1, Canvas canvas_2) {
		this(class505_sub2_sub1_1, canvas_2, class505_sub2_sub1_1.anOpenGL10191.prepareSurface(canvas_2));
	}

	public int method2726() {
		return this.anInt10301;
	}

	public int method2727() {
		return this.anInt10298;
	}

	public int method2721() {
		return this.anInt10298;
	}

	public int method14350() {
		this.anOpenGL10299.swapBuffers(this.aLong10300);
		return 0;
	}

	public int method14346() {
		this.anOpenGL10299.swapBuffers(this.aLong10300);
		return 0;
	}

	public void method186() {
		this.anOpenGL10299.releaseSurface(this.aCanvas10302, this.aLong10300);
	}

	public int method2714() {
		return this.anInt10301;
	}

	public int method14351(int i_1, int i_2) {
		return 0;
	}

	boolean method211() {
		return this.anOpenGL10299.setSurface(this.aLong10300) && super.method213();
	}

}
