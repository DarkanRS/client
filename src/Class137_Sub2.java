import jaggl.OpenGL;

public class Class137_Sub2 extends Class137 {

	int anInt9104;

	Class137_Sub2(Class505_Sub1 class505_sub1_1, Class150 class150_2, Class76 class76_3, int i_4) {
		super(class505_sub1_1, 34067, class150_2, class76_3, i_4 * i_4 * 6, false);
		this.anInt9104 = i_4;
		this.aClass505_Sub1_1646.method13654(this);

		for (int i_5 = 0; i_5 < 6; i_5++) {
			OpenGL.glTexImage2Dub(i_5 + 34069, 0, Class505_Sub1.method13630(this.aClass150_1650, this.aClass76_1651), i_4, i_4, 0, Class505_Sub1.method13629(this.aClass150_1650), 5121, (byte[]) null, 0);
		}

		this.method2351(true);
	}

	Class137_Sub2(Class505_Sub1 class505_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, boolean bool_5, int[][] ints_6) {
		super(class505_sub1_1, 34067, class150_2, class76_3, i_4 * i_4 * 6, bool_5);
		this.anInt9104 = i_4;
		this.aClass505_Sub1_1646.method13654(this);
		int i_7;
		if (bool_5) {
			for (i_7 = 0; i_7 < 6; i_7++) {
				method2371(i_7 + 34069, Class505_Sub1.method13630(this.aClass150_1650, this.aClass76_1651), i_4, i_4, 32993, this.aClass505_Sub1_1646.anInt8410, ints_6[i_7]);
			}
		} else {
			for (i_7 = 0; i_7 < 6; i_7++) {
				OpenGL.glTexImage2Di(i_7 + 34069, 0, Class505_Sub1.method13630(this.aClass150_1650, this.aClass76_1651), i_4, i_4, 0, 32993, this.aClass505_Sub1_1646.anInt8410, ints_6[i_7], 0);
			}
		}

		this.method2351(true);
	}

	Interface9 method14458(int i_1, int i_2) {
		return new Class139(this, i_1, i_2);
	}

	Class137_Sub2(Class505_Sub1 class505_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, boolean bool_5, byte[][] bytes_6, Class150 class150_7) {
		super(class505_sub1_1, 34067, class150_2, class76_3, i_4 * i_4 * 6, bool_5);
		this.anInt9104 = i_4;
		this.aClass505_Sub1_1646.method13654(this);

		for (int i_8 = 0; i_8 < 6; i_8++) {
			OpenGL.glTexImage2Dub(i_8 + 34069, 0, Class505_Sub1.method13630(this.aClass150_1650, this.aClass76_1651), i_4, i_4, 0, Class505_Sub1.method13629(class150_7), 5121, bytes_6[i_8], 0);
		}

		this.method2351(true);
	}

}
