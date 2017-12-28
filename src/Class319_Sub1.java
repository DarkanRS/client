
/* Class319_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class319_Sub1 extends Class319 implements Interface1 {
	int anInt9151;
	int anInt9152;
	int anInt9153;

	public void method205(Class35 class35) {
		super.method205(class35);
	}

	public void method207() {
		super.method207();
	}

	public void method203() {
		super.method207();
	}

	public void method26() {
		super.method26();
	}

	public void method32() {
		super.method26();
	}

	public void method201(Class35 class35) {
		super.method205(class35);
	}

	Class319_Sub1(Class505_Sub2_Sub1 class505_sub2_sub1, Class150 class150, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class505_sub2_sub1, 32879, class150, Class76.aClass76_751, i * i_0_ * i_1_, bool);
		((Class319_Sub1) this).anInt9151 = i;
		((Class319_Sub1) this).anInt9152 = i_0_;
		((Class319_Sub1) this).anInt9153 = i_1_;
		((Class319_Sub1) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(((Class319_Sub1) this).anInt3707, 0, (Class505_Sub2_Sub1.method15574(((Class319_Sub1) this).aClass150_3708, ((Class319_Sub1) this).aClass76_3710)), ((Class319_Sub1) this).anInt9151, ((Class319_Sub1) this).anInt9152, ((Class319_Sub1) this).anInt9153, 0, Class505_Sub2_Sub1.method15575(((Class319_Sub1) this).aClass150_3708), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (bool)
			method54();
	}

	public void method206(Class35 class35) {
		super.method205(class35);
	}

	public void method204(Class35 class35) {
		super.method205(class35);
	}

	public void method202(Class35 class35) {
		super.method205(class35);
	}
}
