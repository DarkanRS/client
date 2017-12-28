
/* Class137_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class137_Sub2 extends Class137 {
	static final int anInt9098 = 34073;
	static final int anInt9099 = 34070;
	static final int anInt9100 = 34071;
	static final int anInt9101 = 34072;
	static final int anInt9102 = 34069;
	static final int anInt9103 = 34074;
	int anInt9104;

	Class137_Sub2(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i) {
		super(class505_sub1, 34067, class150, class76, i * i * 6, false);
		((Class137_Sub2) this).anInt9104 = i;
		((Class137_Sub2) this).aClass505_Sub1_1646.method13654(this);
		for (int i_0_ = 0; i_0_ < 6; i_0_++)
			OpenGL.glTexImage2Dub(34069 + i_0_, 0, (Class505_Sub1.method13630(((Class137_Sub2) this).aClass150_1650, ((Class137_Sub2) this).aClass76_1651)), i, i, 0, Class505_Sub1.method13629(((Class137_Sub2) this).aClass150_1650), 5121, null, 0);
		method2351(true);
	}

	Class137_Sub2(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, boolean bool, int[][] is) {
		super(class505_sub1, 34067, class150, class76, i * i * 6, bool);
		((Class137_Sub2) this).anInt9104 = i;
		((Class137_Sub2) this).aClass505_Sub1_1646.method13654(this);
		if (bool) {
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				method2371(34069 + i_1_, Class505_Sub1.method13630((((Class137_Sub2) this).aClass150_1650), (((Class137_Sub2) this).aClass76_1651)), i, i, 32993, ((Class505_Sub1) (((Class137_Sub2) this).aClass505_Sub1_1646)).anInt8410, is[i_1_]);
		} else {
			for (int i_2_ = 0; i_2_ < 6; i_2_++)
				OpenGL.glTexImage2Di(34069 + i_2_, 0, (Class505_Sub1.method13630(((Class137_Sub2) this).aClass150_1650, ((Class137_Sub2) this).aClass76_1651)), i, i, 0, 32993, (((Class505_Sub1) (((Class137_Sub2) this).aClass505_Sub1_1646)).anInt8410), is[i_2_], 0);
		}
		method2351(true);
	}

	Interface9 method14458(int i, int i_3_) {
		return new Class139(this, i, i_3_);
	}

	Class137_Sub2(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, boolean bool, byte[][] is, Class150 class150_4_) {
		super(class505_sub1, 34067, class150, class76, i * i * 6, bool);
		((Class137_Sub2) this).anInt9104 = i;
		((Class137_Sub2) this).aClass505_Sub1_1646.method13654(this);
		for (int i_5_ = 0; i_5_ < 6; i_5_++)
			OpenGL.glTexImage2Dub(34069 + i_5_, 0, (Class505_Sub1.method13630(((Class137_Sub2) this).aClass150_1650, ((Class137_Sub2) this).aClass76_1651)), i, i, 0, Class505_Sub1.method13629(class150_4_), 5121, is[i_5_], 0);
		method2351(true);
	}
}
