import jaggl.OpenGL;

public class Class319_Sub2 extends Class319 implements Interface29 {

	int anInt9159;
	int anInt9158;

	public void method68(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_8);
		OpenGL.glTexSubImage2Dub(this.anInt3707, 0, i_1, i_2, i_3, i_4, Class505_Sub2_Sub1.method15575(class150_6), 5121, bytes_5, i_7);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class319_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1_1, int i_2, int i_3, boolean bool_4, int[] ints_5, int i_6, int i_7) {
		super(class505_sub2_sub1_1, 3553, Class150.aClass150_1949, Class76.aClass76_751, i_3 * i_2, bool_4);
		this.anInt9159 = i_2;
		this.anInt9158 = i_3;
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		if (bool_4 && i_7 == 0 && i_6 == 0) {
			this.method5714(this.anInt3707, i_2, i_3, ints_5);
		} else {
			OpenGL.glPixelStorei(3314, i_7);
			OpenGL.glTexImage2Di(this.anInt3707, 0, 6408, this.anInt9159, this.anInt9158, 0, 32993, this.aClass505_Sub2_Sub1_3700.anInt10198, ints_5, i_6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}

	}

	Class319_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1_1, Class150 class150_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6, int i_7, int i_8) {
		super(class505_sub2_sub1_1, 3553, class150_2, Class76.aClass76_751, i_3 * i_4, bool_5);
		this.anInt9159 = i_3;
		this.anInt9158 = i_4;
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool_5 && i_8 == 0 && i_7 == 0) {
			this.method5707(this.anInt3707, i_3, i_4, bytes_6);
		} else {
			OpenGL.glPixelStorei(3314, i_8);
			Class150 class150_9 = this.aClass150_3708;
			Class150 class150_10000 = this.aClass150_3708;
			if (class150_9 == Class150.aClass150_1956) {
				OpenGL.glCompressedTexImage2Dub(this.anInt3707, 0, 33777, i_3, i_4, 0, i_3 * i_4 / 2, bytes_6, i_7);
			} else {
				Class150 class150_10 = this.aClass150_3708;
				class150_10000 = this.aClass150_3708;
				if (class150_10 == Class150.aClass150_1957) {
					OpenGL.glCompressedTexImage2Dub(this.anInt3707, 0, 33779, i_3, i_4, 0, i_3 * i_4, bytes_6, i_7);
				} else {
					OpenGL.glTexImage2Dub(this.anInt3707, 0, Class505_Sub2_Sub1.method15574(this.aClass150_3708, this.aClass76_3710), i_3, i_4, 0, Class505_Sub2_Sub1.method15575(this.aClass150_3708), 5121, bytes_6, i_7);
				}
			}

			OpenGL.glPixelStorei(3314, 0);
		}

		OpenGL.glPixelStorei(3317, 4);
	}

	public void method207() {
		super.method207();
	}

	public int method1() {
		return this.anInt9159;
	}

	public int method59() {
		return this.anInt9158;
	}

	void method14494(int i_1, int i_2, int i_3, int i_4, float[] floats_5, Class150 class150_6, int i_7, int i_8) {
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_8);
		OpenGL.glTexSubImage2Df(this.anInt3707, 0, i_1, i_2, i_3, i_4, Class505_Sub2_Sub1.method15575(class150_6), 5121, floats_5, i_7);
		OpenGL.glPixelStorei(3314, 0);
	}

	public boolean method63() {
		return true;
	}

	public boolean method46() {
		return true;
	}

	public void method50(boolean bool_1, boolean bool_2) {
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexParameteri(this.anInt3707, 10242, bool_1 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt3707, 10243, bool_2 ? 10497 : 33071);
	}

	public float method65(float f_1) {
		return f_1 / (float) this.anInt9159;
	}

	public void method52(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_8);
		OpenGL.glTexSubImage2Dub(this.anInt3707, 0, i_1, i_2, i_3, i_4, Class505_Sub2_Sub1.method15575(class150_6), 5121, bytes_5, i_7);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method61(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_7);
		OpenGL.glTexSubImage2Di(this.anInt3707, 0, i_1, i_2, i_3, i_4, 32993, this.aClass505_Sub2_Sub1_3700.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_6);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method47(float f_1) {
		return f_1 / (float) this.anInt9159;
	}

	public Interface9 method200(int i_1) {
		return new Class324(this, i_1);
	}

	public int method55() {
		return this.anInt9159;
	}

	public int method71() {
		return this.anInt9158;
	}

	public void method205(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method26() {
		super.method26();
	}

	public void method48(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_7);
		OpenGL.glTexSubImage2Di(this.anInt3707, 0, i_1, i_2, i_3, i_4, 32993, this.aClass505_Sub2_Sub1_3700.anInt10198, ints_5, i_6);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method62(float f_1) {
		return f_1 / (float) this.anInt9158;
	}

	public void method32() {
		super.method26();
	}

	public int method57() {
		return this.anInt9159;
	}

	public int method70() {
		return this.anInt9159;
	}

	public int method36() {
		return this.anInt9159;
	}

	public float method56(float f_1) {
		return f_1 / (float) this.anInt9159;
	}

	public float method45(float f_1) {
		return f_1 / (float) this.anInt9159;
	}

	public float method60(float f_1) {
		return f_1 / (float) this.anInt9158;
	}

	public float method58(float f_1) {
		return f_1 / (float) this.anInt9158;
	}

	public float method51(float f_1) {
		return f_1 / (float) this.anInt9158;
	}

	public void method53(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6) {
		int[] ints_7 = new int[this.anInt9159 * this.anInt9158];
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGetTexImagei(this.anInt3707, 0, 32993, 5121, ints_7, 0);

		for (int i_8 = 0; i_8 < i_4; i_8++) {
			System.arraycopy(ints_7, this.anInt9159 * (i_2 + (i_4 - 1) - i_8), ints_5, i_3 * i_8 + i_6, i_3);
		}

	}

	public boolean method54() {
		return super.method54();
	}

	public int method72() {
		return this.anInt9158;
	}

	public void method66(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_7);
		OpenGL.glTexSubImage2Di(this.anInt3707, 0, i_1, i_2, i_3, i_4, 32993, this.aClass505_Sub2_Sub1_3700.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_6);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method67(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_7);
		OpenGL.glTexSubImage2Di(this.anInt3707, 0, i_1, i_2, i_3, i_4, 32993, this.aClass505_Sub2_Sub1_3700.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_6);
		OpenGL.glPixelStorei(3314, 0);
	}

	Class319_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1_1, Class150 class150_2, int i_3, int i_4, boolean bool_5, float[] floats_6, int i_7, int i_8) {
		super(class505_sub2_sub1_1, 3553, class150_2, Class76.aClass76_758, i_3 * i_4, bool_5);
		this.anInt9159 = i_3;
		this.anInt9158 = i_4;
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		if (bool_5 && i_8 == 0 && i_7 == 0) {
			this.method5702(this.anInt3707, i_3, i_4, floats_6);
		} else {
			OpenGL.glPixelStorei(3314, i_8);
			OpenGL.glTexImage2Df(this.anInt3707, 0, Class505_Sub2_Sub1.method15574(this.aClass150_3708, this.aClass76_3710), i_3, i_4, 0, Class505_Sub2_Sub1.method15575(this.aClass150_3708), 5126, floats_6, i_7 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}

	}

	public void method69(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6) {
		int[] ints_7 = new int[this.anInt9159 * this.anInt9158];
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGetTexImagei(this.anInt3707, 0, 32993, 5121, ints_7, 0);

		for (int i_8 = 0; i_8 < i_4; i_8++) {
			System.arraycopy(ints_7, (i_2 + (i_4 - 1) - i_8) * this.anInt9159, ints_5, i_6 + i_8 * i_3, i_3);
		}

	}

	public boolean method49() {
		return super.method54();
	}

	public void method203() {
		super.method207();
	}

	public void method204(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method206(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method201(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method202(Class35 class35_1) {
		super.method205(class35_1);
	}

	public Interface9 method199(int i_1) {
		return new Class324(this, i_1);
	}

	Class319_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
		super(class505_sub2_sub1_1, 3553, class150_2, class76_3, i_5 * i_4, false);
		this.anInt9159 = i_4;
		this.anInt9158 = i_5;
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexImage2Dub(this.anInt3707, 0, Class505_Sub2_Sub1.method15574(this.aClass150_3708, this.aClass76_3710), i_4, i_5, 0, Class505_Sub2_Sub1.method15575(this.aClass150_3708), Class505_Sub2_Sub1.method15566(this.aClass76_3710), (byte[]) null, 0);
	}

	public void method64(boolean bool_1, boolean bool_2) {
		this.aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexParameteri(this.anInt3707, 10242, bool_1 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt3707, 10243, bool_2 ? 10497 : 33071);
	}

}
