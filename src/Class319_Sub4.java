
/* Class319_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class319_Sub4 extends Class319 implements Interface31 {
	static final int anInt9181 = 34069;

	public void method202(Class35 class35) {
		super.method205(class35);
	}

	public void method207() {
		super.method207();
	}

	public void method205(Class35 class35) {
		super.method205(class35);
	}

	public void method26() {
		super.method26();
	}

	public void method32() {
		super.method26();
	}

	public void method203() {
		super.method207();
	}

	public void method204(Class35 class35) {
		super.method205(class35);
	}

	Class319_Sub4(Class505_Sub2_Sub1 class505_sub2_sub1, int i, boolean bool, int[][] is) {
		super(class505_sub2_sub1, 34067, Class150.aClass150_1949, Class76.aClass76_751, i * i * 6, bool);
		((Class319_Sub4) this).aClass505_Sub2_Sub1_3700.method14035(this);
		if (bool) {
			for (int i_0_ = 0; i_0_ < 6; i_0_++)
				method5714(34069 + i_0_, i, i, is[i_0_]);
		} else {
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				OpenGL.glTexImage2Di(34069 + i_1_, 0, Class505_Sub2_Sub1.method15574((((Class319_Sub4) this).aClass150_3708), (((Class319_Sub4) this).aClass76_3710)), i, i, 0, Class505_Sub2_Sub1.method15575(((Class319_Sub4) this).aClass150_3708), (((Class505_Sub2_Sub1) ((Class319_Sub4) this).aClass505_Sub2_Sub1_3700).anInt10198), is[i_1_], 0);
		}
	}

	public void method201(Class35 class35) {
		super.method205(class35);
	}

	public void method206(Class35 class35) {
		super.method205(class35);
	}
}
