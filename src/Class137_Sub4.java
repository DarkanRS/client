
/* Class137_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class137_Sub4 extends Class137 {
	int anInt9116;
	int anInt9117;
	int anInt9118;

	Class137_Sub4(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_0_, int i_1_) {
		super(class505_sub1, 32879, class150, class76, i * i_0_ * i_1_, false);
		((Class137_Sub4) this).anInt9116 = i;
		((Class137_Sub4) this).anInt9117 = i_0_;
		((Class137_Sub4) this).anInt9118 = i_1_;
		((Class137_Sub4) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glTexImage3Dub(((Class137_Sub4) this).anInt1648, 0, Class505_Sub1.method13630(((Class137_Sub4) this).aClass150_1650, ((Class137_Sub4) this).aClass76_1651), ((Class137_Sub4) this).anInt9116, ((Class137_Sub4) this).anInt9117, ((Class137_Sub4) this).anInt9118, 0, Class505_Sub1.method13629(((Class137_Sub4) this).aClass150_1650), 5121, null, 0);
		method2351(true);
	}

	Class137_Sub4(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_2_, int i_3_, byte[] is, Class150 class150_4_) {
		super(class505_sub1, 32879, class150, class76, i * i_2_ * i_3_, false);
		((Class137_Sub4) this).anInt9116 = i;
		((Class137_Sub4) this).anInt9117 = i_2_;
		((Class137_Sub4) this).anInt9118 = i_3_;
		((Class137_Sub4) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(((Class137_Sub4) this).anInt1648, 0, Class505_Sub1.method13630((((Class137_Sub4) this).aClass150_1650), (((Class137_Sub4) this).aClass76_1651)), ((Class137_Sub4) this).anInt9116, ((Class137_Sub4) this).anInt9117, ((Class137_Sub4) this).anInt9118, 0, Class505_Sub1.method13629(class150_4_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method2351(true);
	}

	void method14465(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		((Class137_Sub4) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glCopyTexSubImage3D(((Class137_Sub4) this).anInt1648, 0, i, i_5_, i_6_, i_9_, i_10_, i_7_, i_8_);
		OpenGL.glFlush();
	}

	void method14466(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		((Class137_Sub4) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glCopyTexSubImage3D(((Class137_Sub4) this).anInt1648, 0, i, i_11_, i_12_, i_15_, i_16_, i_13_, i_14_);
		OpenGL.glFlush();
	}

	void method14467(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		((Class137_Sub4) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glCopyTexSubImage3D(((Class137_Sub4) this).anInt1648, 0, i, i_17_, i_18_, i_21_, i_22_, i_19_, i_20_);
		OpenGL.glFlush();
	}
}
