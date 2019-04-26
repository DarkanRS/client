import jaggl.OpenGL;

public class NativeSprite_Sub2 extends NativeSprite {

	int anInt9030 = 0;
	int anInt9034 = 0;
	int anInt9036 = 0;
	int anInt9035 = 0;
	boolean aBool9028 = false;
	int anInt9031 = 0;
	OpenGLGraphicalRenderer aGraphicalRenderer_Sub1_9032;
	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_9033;
	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_9029;

	public void method2783(int i_1, int i_2, int i_3, int i_4) {
		this.anInt9030 = i_1;
		this.anInt9034 = i_2;
		this.anInt9036 = i_3;
		this.anInt9035 = i_4;
		this.aBool9028 = this.anInt9030 != 0 || this.anInt9034 != 0 || this.anInt9036 != 0 || this.anInt9035 != 0;
	}

	void method2791(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		float f_11;
		float f_12;
		if (this.aBool9028) {
			f_11 = (float) this.method228();
			f_12 = (float) this.method2748();
			float f_13 = (f_3 - f_1) / f_11;
			float f_14 = (f_4 - f_2) / f_11;
			float f_15 = (f_5 - f_1) / f_12;
			float f_16 = (f_6 - f_2) / f_12;
			float f_17 = f_15 * (float) this.anInt9034;
			float f_18 = f_16 * (float) this.anInt9034;
			float f_19 = f_13 * (float) this.anInt9030;
			float f_20 = f_14 * (float) this.anInt9030;
			float f_21 = -f_13 * (float) this.anInt9036;
			float f_22 = -f_14 * (float) this.anInt9036;
			float f_23 = -f_15 * (float) this.anInt9035;
			float f_24 = -f_16 * (float) this.anInt9035;
			f_1 = f_1 + f_19 + f_17;
			f_2 = f_2 + f_20 + f_18;
			f_3 = f_3 + f_21 + f_17;
			f_4 = f_4 + f_22 + f_18;
			f_5 = f_5 + f_19 + f_23;
			f_6 = f_6 + f_20 + f_24;
		}

		f_11 = f_5 + (f_3 - f_1);
		f_12 = f_4 + (f_6 - f_2);
		this.aClass137_Sub1_Sub1_9033.method2351((i_10 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13624(i_9);
		this.aGraphicalRenderer_Sub1_9032.method13612(i_7);
		OpenGL.glColor4ub((byte) (i_8 >> 16), (byte) (i_8 >> 8), (byte) i_8, (byte) (i_8 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glVertex2f(f_1, f_2);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_5, f_6);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glVertex2f(f_11, f_12);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glVertex2f(f_3, f_4);
		OpenGL.glEnd();
	}

	NativeSprite_Sub2(OpenGLGraphicalRenderer class505_sub1_1, int i_2, int i_3, int[] ints_4, int i_5, int i_6) {
		this.aGraphicalRenderer_Sub1_9032 = class505_sub1_1;
		this.aClass137_Sub1_Sub1_9033 = Class137_Sub1_Sub1.method15537(class505_sub1_1, i_2, i_3, ints_4, i_6, i_5);
	}

	public void method2743(int i_1, int i_2, int i_3, int i_4) {
		this.anInt9030 = i_1;
		this.anInt9034 = i_2;
		this.anInt9036 = i_3;
		this.anInt9035 = i_4;
		this.aBool9028 = this.anInt9030 != 0 || this.anInt9034 != 0 || this.anInt9036 != 0 || this.anInt9035 != 0;
	}

	public void method2767(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.aGraphicalRenderer_Sub1_9032.aBool8456) {
			int[] ints_7 = this.aGraphicalRenderer_Sub1_9032.ab(i_5, i_6, i_3, i_4);
			if (ints_7 != null) {
				for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
					ints_7[i_8] |= ~0xffffff;
				}

				this.method14414(i_1, i_2, i_3, i_4, ints_7, i_3);
			}
		} else {
			this.aClass137_Sub1_Sub1_9033.method14439(i_1, i_2, i_3, i_4, i_5, i_6);
		}

	}

	public int method2747() {
		return this.aClass137_Sub1_Sub1_9033.anInt10136;
	}

	public void method2781(int i_1, int i_2, int i_3, int i_4) {
		this.anInt9030 = i_1;
		this.anInt9034 = i_2;
		this.anInt9036 = i_3;
		this.anInt9035 = i_4;
		this.aBool9028 = this.anInt9030 != 0 || this.anInt9034 != 0 || this.anInt9036 != 0 || this.anInt9035 != 0;
	}

	public int method2793() {
		return this.aClass137_Sub1_Sub1_9033.anInt10133;
	}

	public int method2748() {
		return this.aClass137_Sub1_Sub1_9033.anInt10133 + this.anInt9034 + this.anInt9035;
	}

	public int method2786() {
		return this.aClass137_Sub1_Sub1_9033.anInt10136;
	}

	public void method2750(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.aGraphicalRenderer_Sub1_9032.aBool8456) {
			int[] ints_7 = this.aGraphicalRenderer_Sub1_9032.ab(i_5, i_6, i_3, i_4);
			if (ints_7 != null) {
				for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
					ints_7[i_8] |= ~0xffffff;
				}

				this.method14414(i_1, i_2, i_3, i_4, ints_7, i_3);
			}
		} else {
			this.aClass137_Sub1_Sub1_9033.method14439(i_1, i_2, i_3, i_4, i_5, i_6);
		}

	}

	public void method2751() {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass137_Sub1_Sub1_9029 = Class137_Sub1_Sub1.method15538(this.aGraphicalRenderer_Sub1_9032, 0, 0, this.aClass137_Sub1_Sub1_9033.anInt10136, this.aClass137_Sub1_Sub1_9033.anInt10133);
		this.anInt9031 = 3;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	void method14414(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_7) {
		this.aClass137_Sub1_Sub1_9033.method14452(i_1, i_2, i_3, i_4, ints_5, i_7);
	}

	public void method2772(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		int i_8 = i_3 + i_1;
		int i_9 = i_2 + i_4;
		this.aClass137_Sub1_Sub1_9033.method2351(false);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13624(i_7);
		this.aGraphicalRenderer_Sub1_9032.method13612(i_5);
		OpenGL.glColor4ub((byte) (i_6 >> 16), (byte) (i_6 >> 8), (byte) i_6, (byte) (i_6 >> 24));
		if (this.aClass137_Sub1_Sub1_9033.aBool10135 && !this.aBool9028) {
			float f_18 = this.aClass137_Sub1_Sub1_9033.aFloat10134 * (float) i_4 / (float) this.aClass137_Sub1_Sub1_9033.anInt10133;
			float f_19 = this.aClass137_Sub1_Sub1_9033.aFloat10132 * (float) i_3 / (float) this.aClass137_Sub1_Sub1_9033.anInt10136;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f_18);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_9);
			OpenGL.glTexCoord2f(f_19, 0.0F);
			OpenGL.glVertex2i(i_8, i_9);
			OpenGL.glTexCoord2f(f_19, f_18);
			OpenGL.glVertex2i(i_8, i_2);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) this.anInt9030, (float) this.anInt9034, 0.0F);
			int i_10 = this.method228();
			int i_11 = this.method2748();
			int i_12 = this.aClass137_Sub1_Sub1_9033.anInt10133 + i_2;
			OpenGL.glBegin(7);

			int i_13;
			int i_15;
			for (i_13 = i_2; i_12 <= i_9; i_12 += i_11) {
				int i_14 = this.aClass137_Sub1_Sub1_9033.anInt10136 + i_1;

				for (i_15 = i_1; i_14 <= i_8; i_15 += i_10) {
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_15, i_13);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_15, i_12);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
					OpenGL.glVertex2i(i_14, i_12);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_14, i_13);
					i_14 += i_10;
				}

				if (i_15 < i_8) {
					float f_16 = this.aClass137_Sub1_Sub1_9033.aFloat10132 * (float) (i_8 - i_15) / (float) this.aClass137_Sub1_Sub1_9033.anInt10136;
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_15, i_13);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_15, i_12);
					OpenGL.glTexCoord2f(f_16, 0.0F);
					OpenGL.glVertex2i(i_8, i_12);
					OpenGL.glTexCoord2f(f_16, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_8, i_13);
				}

				i_13 += i_11;
			}

			if (i_13 < i_9) {
				float f_20 = this.aClass137_Sub1_Sub1_9033.aFloat10134 * (float) (this.aClass137_Sub1_Sub1_9033.anInt10133 - (i_9 - i_13)) / (float) this.aClass137_Sub1_Sub1_9033.anInt10133;
				i_15 = this.aClass137_Sub1_Sub1_9033.anInt10136 + i_1;

				int i_21;
				for (i_21 = i_1; i_15 <= i_8; i_21 += i_10) {
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_21, i_13);
					OpenGL.glTexCoord2f(0.0F, f_20);
					OpenGL.glVertex2i(i_21, i_9);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, f_20);
					OpenGL.glVertex2i(i_15, i_9);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_15, i_13);
					i_15 += i_10;
				}

				if (i_21 < i_8) {
					float f_17 = this.aClass137_Sub1_Sub1_9033.aFloat10132 * (float) (i_8 - i_21) / (float) this.aClass137_Sub1_Sub1_9033.anInt10136;
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_21, i_13);
					OpenGL.glTexCoord2f(0.0F, f_20);
					OpenGL.glVertex2i(i_21, i_9);
					OpenGL.glTexCoord2f(f_17, f_20);
					OpenGL.glVertex2i(i_8, i_9);
					OpenGL.glTexCoord2f(f_17, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_8, i_13);
				}
			}

			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}

	}

	void method14415() {
		this.aGraphicalRenderer_Sub1_9032.method13610(1);
		this.aGraphicalRenderer_Sub1_9032.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_9032.method13717(8448, 8448);
		this.aGraphicalRenderer_Sub1_9032.method13595(1, 34168, 768);
		this.aGraphicalRenderer_Sub1_9032.method13616(0, 5890);
		this.aGraphicalRenderer_Sub1_9032.method13610(0);
		this.aGraphicalRenderer_Sub1_9032.method13595(1, 34168, 768);
	}

	public void method2742(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.aClass137_Sub1_Sub1_9033.method2351(false);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13624(i_5);
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		i_1 += this.anInt9030;
		i_2 += this.anInt9034;
		if (this.aClass137_Sub1_Sub1_9029 == null) {
			this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
			this.aGraphicalRenderer_Sub1_9032.method13612(i_3);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, this.aClass137_Sub1_Sub1_9033.anInt10133 + i_2);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(this.aClass137_Sub1_Sub1_9033.anInt10136 + i_1, this.aClass137_Sub1_Sub1_9033.anInt10133 + i_2);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(this.aClass137_Sub1_Sub1_9033.anInt10136 + i_1, i_2);
			OpenGL.glEnd();
		} else {
			this.method14419(i_3);
			this.aClass137_Sub1_Sub1_9029.method2351(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, this.aClass137_Sub1_Sub1_9033.anInt10133 + i_2);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(this.aClass137_Sub1_Sub1_9033.anInt10136 + i_1, this.aClass137_Sub1_Sub1_9033.anInt10133 + i_2);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(this.aClass137_Sub1_Sub1_9033.anInt10136 + i_1, i_2);
			OpenGL.glEnd();
			this.method14415();
		}

	}

	public void method2773(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		Class455_Sub2 class455_sub2_6 = (Class455_Sub2) class455_3;
		Class137_Sub1_Sub1 class137_sub1_sub1_7 = class455_sub2_6.aClass137_Sub1_Sub1_8974;
		this.aClass137_Sub1_Sub1_9033.method2351(false);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13612(1);
		this.aGraphicalRenderer_Sub1_9032.method13610(1);
		this.aGraphicalRenderer_Sub1_9032.method13654(class137_sub1_sub1_7);
		this.aGraphicalRenderer_Sub1_9032.method13717(7681, 8448);
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 34168, 768);
		this.aGraphicalRenderer_Sub1_9032.method13624(1);
		i_1 += this.anInt9030;
		i_2 += this.anInt9034;
		int i_8 = this.aClass137_Sub1_Sub1_9033.anInt10136 + i_1;
		int i_9 = this.aClass137_Sub1_Sub1_9033.anInt10133 + i_2;
		float f_10 = class137_sub1_sub1_7.aFloat10132 / (float) class137_sub1_sub1_7.anInt10136;
		float f_11 = class137_sub1_sub1_7.aFloat10134 / (float) class137_sub1_sub1_7.anInt10133;
		float f_12 = (float) (i_1 - i_4) * f_10;
		float f_13 = (float) (i_8 - i_4) * f_10;
		float f_14 = class137_sub1_sub1_7.aFloat10134 - (float) (i_2 - i_5) * f_11;
		float f_15 = class137_sub1_sub1_7.aFloat10134 - (float) (i_9 - i_5) * f_11;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_12, f_14);
		OpenGL.glVertex2i(i_1, i_2);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_12, f_15);
		OpenGL.glVertex2i(i_1, this.aClass137_Sub1_Sub1_9033.anInt10133 + i_2);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_13, f_15);
		OpenGL.glVertex2i(this.aClass137_Sub1_Sub1_9033.anInt10136 + i_1, this.aClass137_Sub1_Sub1_9033.anInt10133 + i_2);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_13, f_14);
		OpenGL.glVertex2i(this.aClass137_Sub1_Sub1_9033.anInt10136 + i_1, i_2);
		OpenGL.glEnd();
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 5890, 768);
		this.aGraphicalRenderer_Sub1_9032.method13612(0);
		this.aGraphicalRenderer_Sub1_9032.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_9032.method13610(0);
	}

	void method2755(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.aClass137_Sub1_Sub1_9033.method2351((1 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13624(i_7);
		OpenGL.glColor4ub((byte) (i_6 >> 16), (byte) (i_6 >> 8), (byte) i_6, (byte) (i_6 >> 24));
		if (this.aBool9028) {
			float f_9 = (float) i_3 / (float) this.method228();
			float f_10 = (float) i_4 / (float) this.method2748();
			float f_11 = (float) i_1 + (float) this.anInt9030 * f_9;
			float f_12 = (float) i_2 + (float) this.anInt9034 * f_10;
			float f_13 = f_11 + (float) this.aClass137_Sub1_Sub1_9033.anInt10136 * f_9;
			float f_14 = f_12 + (float) this.aClass137_Sub1_Sub1_9033.anInt10133 * f_10;
			if (this.aClass137_Sub1_Sub1_9029 == null) {
				this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
				this.aGraphicalRenderer_Sub1_9032.method13612(i_5);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_11, f_12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_11, f_14);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_13, f_14);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_13, f_12);
				OpenGL.glEnd();
			} else {
				this.method14419(i_5);
				this.aClass137_Sub1_Sub1_9029.method2351(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_11, f_12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_11, f_14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_13, f_14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_13, f_12);
				OpenGL.glEnd();
				this.method14415();
			}
		} else if (this.aClass137_Sub1_Sub1_9029 == null) {
			this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
			this.aGraphicalRenderer_Sub1_9032.method13612(i_5);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + i_4);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_3 + i_1, i_2 + i_4);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_3 + i_1, i_2);
			OpenGL.glEnd();
		} else {
			this.method14419(i_5);
			this.aClass137_Sub1_Sub1_9029.method2351(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + i_4);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_3 + i_1, i_2 + i_4);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_3 + i_1, i_2);
			OpenGL.glEnd();
			this.method14415();
		}

	}

	void method2764(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9) {
		float f_11;
		float f_12;
		if (this.aBool9028) {
			f_11 = (float) this.method228();
			f_12 = (float) this.method2748();
			float f_13 = (f_3 - f_1) / f_11;
			float f_14 = (f_4 - f_2) / f_11;
			float f_15 = (f_5 - f_1) / f_12;
			float f_16 = (f_6 - f_2) / f_12;
			float f_17 = f_15 * (float) this.anInt9034;
			float f_18 = f_16 * (float) this.anInt9034;
			float f_19 = f_13 * (float) this.anInt9030;
			float f_20 = f_14 * (float) this.anInt9030;
			float f_21 = -f_13 * (float) this.anInt9036;
			float f_22 = -f_14 * (float) this.anInt9036;
			float f_23 = -f_15 * (float) this.anInt9035;
			float f_24 = -f_16 * (float) this.anInt9035;
			f_1 = f_1 + f_19 + f_17;
			f_2 = f_2 + f_20 + f_18;
			f_3 = f_3 + f_21 + f_17;
			f_4 = f_4 + f_22 + f_18;
			f_5 = f_5 + f_19 + f_23;
			f_6 = f_6 + f_20 + f_24;
		}

		f_11 = f_5 + (f_3 - f_1);
		f_12 = f_4 + (f_6 - f_2);
		this.aClass137_Sub1_Sub1_9033.method2351((1 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13624(i_9);
		this.aGraphicalRenderer_Sub1_9032.method13612(i_7);
		OpenGL.glColor4ub((byte) (i_8 >> 16), (byte) (i_8 >> 8), (byte) i_8, (byte) (i_8 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glVertex2f(f_1, f_2);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_5, f_6);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glVertex2f(f_11, f_12);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glVertex2f(f_3, f_4);
		OpenGL.glEnd();
	}

	public int method228() {
		return this.aClass137_Sub1_Sub1_9033.anInt10136 + this.anInt9030 + this.anInt9036;
	}

	public void method2796(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		int i_8 = i_1 + i_3;
		int i_9 = i_2 + i_4;
		this.aClass137_Sub1_Sub1_9033.method2351(false);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13624(i_7);
		this.aGraphicalRenderer_Sub1_9032.method13612(i_5);
		OpenGL.glColor4ub((byte) (i_6 >> 16), (byte) (i_6 >> 8), (byte) i_6, (byte) (i_6 >> 24));
		if (this.aClass137_Sub1_Sub1_9033.aBool10135 && !this.aBool9028) {
			float f_18 = this.aClass137_Sub1_Sub1_9033.aFloat10134 * (float) i_4 / (float) this.aClass137_Sub1_Sub1_9033.anInt10133;
			float f_19 = this.aClass137_Sub1_Sub1_9033.aFloat10132 * (float) i_3 / (float) this.aClass137_Sub1_Sub1_9033.anInt10136;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f_18);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_9);
			OpenGL.glTexCoord2f(f_19, 0.0F);
			OpenGL.glVertex2i(i_8, i_9);
			OpenGL.glTexCoord2f(f_19, f_18);
			OpenGL.glVertex2i(i_8, i_2);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) this.anInt9030, (float) this.anInt9034, 0.0F);
			int i_10 = this.method228();
			int i_11 = this.method2748();
			int i_12 = i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133;
			OpenGL.glBegin(7);

			int i_13;
			int i_15;
			for (i_13 = i_2; i_12 <= i_9; i_12 += i_11) {
				int i_14 = i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136;

				for (i_15 = i_1; i_14 <= i_8; i_15 += i_10) {
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_15, i_13);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_15, i_12);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
					OpenGL.glVertex2i(i_14, i_12);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_14, i_13);
					i_14 += i_10;
				}

				if (i_15 < i_8) {
					float f_16 = this.aClass137_Sub1_Sub1_9033.aFloat10132 * (float) (i_8 - i_15) / (float) this.aClass137_Sub1_Sub1_9033.anInt10136;
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_15, i_13);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_15, i_12);
					OpenGL.glTexCoord2f(f_16, 0.0F);
					OpenGL.glVertex2i(i_8, i_12);
					OpenGL.glTexCoord2f(f_16, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_8, i_13);
				}

				i_13 += i_11;
			}

			if (i_13 < i_9) {
				float f_20 = this.aClass137_Sub1_Sub1_9033.aFloat10134 * (float) (this.aClass137_Sub1_Sub1_9033.anInt10133 - (i_9 - i_13)) / (float) this.aClass137_Sub1_Sub1_9033.anInt10133;
				i_15 = i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136;

				int i_21;
				for (i_21 = i_1; i_15 <= i_8; i_21 += i_10) {
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_21, i_13);
					OpenGL.glTexCoord2f(0.0F, f_20);
					OpenGL.glVertex2i(i_21, i_9);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, f_20);
					OpenGL.glVertex2i(i_15, i_9);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_15, i_13);
					i_15 += i_10;
				}

				if (i_21 < i_8) {
					float f_17 = this.aClass137_Sub1_Sub1_9033.aFloat10132 * (float) (i_8 - i_21) / (float) this.aClass137_Sub1_Sub1_9033.anInt10136;
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_21, i_13);
					OpenGL.glTexCoord2f(0.0F, f_20);
					OpenGL.glVertex2i(i_21, i_9);
					OpenGL.glTexCoord2f(f_17, f_20);
					OpenGL.glVertex2i(i_8, i_9);
					OpenGL.glTexCoord2f(f_17, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_8, i_13);
				}
			}

			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}

	}

	NativeSprite_Sub2(OpenGLGraphicalRenderer class505_sub1_1, int i_2, int i_3, int i_4, int i_5) {
		this.aGraphicalRenderer_Sub1_9032 = class505_sub1_1;
		this.aClass137_Sub1_Sub1_9033 = Class137_Sub1_Sub1.method15538(class505_sub1_1, i_2, i_3, i_4, i_5);
	}

	public void method2769(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.aGraphicalRenderer_Sub1_9032.aBool8456) {
			int[] ints_7 = this.aGraphicalRenderer_Sub1_9032.ab(i_5, i_6, i_3, i_4);
			if (ints_7 != null) {
				for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
					ints_7[i_8] |= ~0xffffff;
				}

				this.method14414(i_1, i_2, i_3, i_4, ints_7, i_3);
			}
		} else {
			this.aClass137_Sub1_Sub1_9033.method14439(i_1, i_2, i_3, i_4, i_5, i_6);
		}

	}

	void method2800(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = ((Class455_Sub2) class455_8).aClass137_Sub1_Sub1_8974;
		float f_12;
		float f_13;
		float f_14;
		float f_15;
		if (this.aBool9028) {
			f_12 = (float) this.method228();
			f_13 = (float) this.method2748();
			f_14 = (f_3 - f_1) / f_12;
			f_15 = (f_4 - f_2) / f_12;
			float f_16 = (f_5 - f_1) / f_13;
			float f_17 = (f_6 - f_2) / f_13;
			float f_18 = f_16 * (float) this.anInt9034;
			float f_19 = f_17 * (float) this.anInt9034;
			float f_20 = f_14 * (float) this.anInt9030;
			float f_21 = f_15 * (float) this.anInt9030;
			float f_22 = -f_14 * (float) this.anInt9036;
			float f_23 = -f_15 * (float) this.anInt9036;
			float f_24 = -f_16 * (float) this.anInt9035;
			float f_25 = -f_17 * (float) this.anInt9035;
			f_1 = f_1 + f_20 + f_18;
			f_2 = f_2 + f_21 + f_19;
			f_3 = f_3 + f_22 + f_18;
			f_4 = f_4 + f_23 + f_19;
			f_5 = f_5 + f_20 + f_24;
			f_6 = f_6 + f_21 + f_25;
		}

		f_12 = f_5 + (f_3 - f_1);
		f_13 = f_4 + (f_6 - f_2);
		this.aClass137_Sub1_Sub1_9033.method2351((i_7 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13612(1);
		this.aGraphicalRenderer_Sub1_9032.method13610(1);
		this.aGraphicalRenderer_Sub1_9032.method13654(class137_sub1_sub1_11);
		this.aGraphicalRenderer_Sub1_9032.method13717(7681, 8448);
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 34168, 768);
		this.aGraphicalRenderer_Sub1_9032.method13624(1);
		f_14 = class137_sub1_sub1_11.aFloat10132 / (float) class137_sub1_sub1_11.anInt10136;
		f_15 = class137_sub1_sub1_11.aFloat10134 / (float) class137_sub1_sub1_11.anInt10133;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_1 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_2 - (float) i_10));
		OpenGL.glVertex2f(f_1, f_2);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_5 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_6 - (float) i_10));
		OpenGL.glVertex2f(f_5, f_6);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_12 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_13 - (float) i_10));
		OpenGL.glVertex2f(f_12, f_13);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_3 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_4 - (float) i_10));
		OpenGL.glVertex2f(f_3, f_4);
		OpenGL.glEnd();
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 5890, 768);
		this.aGraphicalRenderer_Sub1_9032.method13612(0);
		this.aGraphicalRenderer_Sub1_9032.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_9032.method13610(0);
	}

	public void method2771(int i_1, int i_2, int i_3) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass137_Sub1_Sub1_9029 = Class137_Sub1_Sub1.method15538(this.aGraphicalRenderer_Sub1_9032, i_1, i_2, this.aClass137_Sub1_Sub1_9033.anInt10136, this.aClass137_Sub1_Sub1_9033.anInt10133);
		this.anInt9031 = i_3;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public Interface9 method2801() {
		return this.aClass137_Sub1_Sub1_9033.method14441();
	}

	public void method2784(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		Class455_Sub2 class455_sub2_6 = (Class455_Sub2) class455_3;
		Class137_Sub1_Sub1 class137_sub1_sub1_7 = class455_sub2_6.aClass137_Sub1_Sub1_8974;
		this.aClass137_Sub1_Sub1_9033.method2351(false);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13612(1);
		this.aGraphicalRenderer_Sub1_9032.method13610(1);
		this.aGraphicalRenderer_Sub1_9032.method13654(class137_sub1_sub1_7);
		this.aGraphicalRenderer_Sub1_9032.method13717(7681, 8448);
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 34168, 768);
		this.aGraphicalRenderer_Sub1_9032.method13624(1);
		i_1 += this.anInt9030;
		i_2 += this.anInt9034;
		int i_8 = i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136;
		int i_9 = i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133;
		float f_10 = class137_sub1_sub1_7.aFloat10132 / (float) class137_sub1_sub1_7.anInt10136;
		float f_11 = class137_sub1_sub1_7.aFloat10134 / (float) class137_sub1_sub1_7.anInt10133;
		float f_12 = (float) (i_1 - i_4) * f_10;
		float f_13 = (float) (i_8 - i_4) * f_10;
		float f_14 = class137_sub1_sub1_7.aFloat10134 - (float) (i_2 - i_5) * f_11;
		float f_15 = class137_sub1_sub1_7.aFloat10134 - (float) (i_9 - i_5) * f_11;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_12, f_14);
		OpenGL.glVertex2i(i_1, i_2);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_12, f_15);
		OpenGL.glVertex2i(i_1, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_13, f_15);
		OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_13, f_14);
		OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2);
		OpenGL.glEnd();
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 5890, 768);
		this.aGraphicalRenderer_Sub1_9032.method13612(0);
		this.aGraphicalRenderer_Sub1_9032.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_9032.method13610(0);
	}

	public void method2774(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		Class455_Sub2 class455_sub2_6 = (Class455_Sub2) class455_3;
		Class137_Sub1_Sub1 class137_sub1_sub1_7 = class455_sub2_6.aClass137_Sub1_Sub1_8974;
		this.aClass137_Sub1_Sub1_9033.method2351(false);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13612(1);
		this.aGraphicalRenderer_Sub1_9032.method13610(1);
		this.aGraphicalRenderer_Sub1_9032.method13654(class137_sub1_sub1_7);
		this.aGraphicalRenderer_Sub1_9032.method13717(7681, 8448);
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 34168, 768);
		this.aGraphicalRenderer_Sub1_9032.method13624(1);
		i_1 += this.anInt9030;
		i_2 += this.anInt9034;
		int i_8 = i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136;
		int i_9 = i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133;
		float f_10 = class137_sub1_sub1_7.aFloat10132 / (float) class137_sub1_sub1_7.anInt10136;
		float f_11 = class137_sub1_sub1_7.aFloat10134 / (float) class137_sub1_sub1_7.anInt10133;
		float f_12 = (float) (i_1 - i_4) * f_10;
		float f_13 = (float) (i_8 - i_4) * f_10;
		float f_14 = class137_sub1_sub1_7.aFloat10134 - (float) (i_2 - i_5) * f_11;
		float f_15 = class137_sub1_sub1_7.aFloat10134 - (float) (i_9 - i_5) * f_11;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_12, f_14);
		OpenGL.glVertex2i(i_1, i_2);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_12, f_15);
		OpenGL.glVertex2i(i_1, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_13, f_15);
		OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_13, f_14);
		OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2);
		OpenGL.glEnd();
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 5890, 768);
		this.aGraphicalRenderer_Sub1_9032.method13612(0);
		this.aGraphicalRenderer_Sub1_9032.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_9032.method13610(0);
	}

	void method2775(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		this.aClass137_Sub1_Sub1_9033.method2351((i_8 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13624(i_7);
		OpenGL.glColor4ub((byte) (i_6 >> 16), (byte) (i_6 >> 8), (byte) i_6, (byte) (i_6 >> 24));
		if (this.aBool9028) {
			float f_9 = (float) i_3 / (float) this.method228();
			float f_10 = (float) i_4 / (float) this.method2748();
			float f_11 = (float) i_1 + (float) this.anInt9030 * f_9;
			float f_12 = (float) i_2 + (float) this.anInt9034 * f_10;
			float f_13 = f_11 + (float) this.aClass137_Sub1_Sub1_9033.anInt10136 * f_9;
			float f_14 = f_12 + (float) this.aClass137_Sub1_Sub1_9033.anInt10133 * f_10;
			if (this.aClass137_Sub1_Sub1_9029 == null) {
				this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
				this.aGraphicalRenderer_Sub1_9032.method13612(i_5);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_11, f_12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_11, f_14);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_13, f_14);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_13, f_12);
				OpenGL.glEnd();
			} else {
				this.method14419(i_5);
				this.aClass137_Sub1_Sub1_9029.method2351(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_11, f_12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_11, f_14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_13, f_14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_13, f_12);
				OpenGL.glEnd();
				this.method14415();
			}
		} else if (this.aClass137_Sub1_Sub1_9029 == null) {
			this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
			this.aGraphicalRenderer_Sub1_9032.method13612(i_5);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + i_4);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_1 + i_3, i_2 + i_4);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1 + i_3, i_2);
			OpenGL.glEnd();
		} else {
			this.method14419(i_5);
			this.aClass137_Sub1_Sub1_9029.method2351(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + i_4);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_1 + i_3, i_2 + i_4);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1 + i_3, i_2);
			OpenGL.glEnd();
			this.method14415();
		}

	}

	void method2766(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = ((Class455_Sub2) class455_8).aClass137_Sub1_Sub1_8974;
		float f_12;
		float f_13;
		float f_14;
		float f_15;
		if (this.aBool9028) {
			f_12 = (float) this.method228();
			f_13 = (float) this.method2748();
			f_14 = (f_3 - f_1) / f_12;
			f_15 = (f_4 - f_2) / f_12;
			float f_16 = (f_5 - f_1) / f_13;
			float f_17 = (f_6 - f_2) / f_13;
			float f_18 = f_16 * (float) this.anInt9034;
			float f_19 = f_17 * (float) this.anInt9034;
			float f_20 = f_14 * (float) this.anInt9030;
			float f_21 = f_15 * (float) this.anInt9030;
			float f_22 = -f_14 * (float) this.anInt9036;
			float f_23 = -f_15 * (float) this.anInt9036;
			float f_24 = -f_16 * (float) this.anInt9035;
			float f_25 = -f_17 * (float) this.anInt9035;
			f_1 = f_1 + f_20 + f_18;
			f_2 = f_2 + f_21 + f_19;
			f_3 = f_3 + f_22 + f_18;
			f_4 = f_4 + f_23 + f_19;
			f_5 = f_5 + f_20 + f_24;
			f_6 = f_6 + f_21 + f_25;
		}

		f_12 = f_5 + (f_3 - f_1);
		f_13 = f_4 + (f_6 - f_2);
		this.aClass137_Sub1_Sub1_9033.method2351((i_7 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13612(1);
		this.aGraphicalRenderer_Sub1_9032.method13610(1);
		this.aGraphicalRenderer_Sub1_9032.method13654(class137_sub1_sub1_11);
		this.aGraphicalRenderer_Sub1_9032.method13717(7681, 8448);
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 34168, 768);
		this.aGraphicalRenderer_Sub1_9032.method13624(1);
		f_14 = class137_sub1_sub1_11.aFloat10132 / (float) class137_sub1_sub1_11.anInt10136;
		f_15 = class137_sub1_sub1_11.aFloat10134 / (float) class137_sub1_sub1_11.anInt10133;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_1 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_2 - (float) i_10));
		OpenGL.glVertex2f(f_1, f_2);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_5 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_6 - (float) i_10));
		OpenGL.glVertex2f(f_5, f_6);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_12 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_13 - (float) i_10));
		OpenGL.glVertex2f(f_12, f_13);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_3 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_4 - (float) i_10));
		OpenGL.glVertex2f(f_3, f_4);
		OpenGL.glEnd();
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 5890, 768);
		this.aGraphicalRenderer_Sub1_9032.method13612(0);
		this.aGraphicalRenderer_Sub1_9032.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_9032.method13610(0);
	}

	public void method2749(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.aClass137_Sub1_Sub1_9033.method2351(false);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13624(i_5);
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		i_1 += this.anInt9030;
		i_2 += this.anInt9034;
		if (this.aClass137_Sub1_Sub1_9029 == null) {
			this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
			this.aGraphicalRenderer_Sub1_9032.method13612(i_3);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2);
			OpenGL.glEnd();
		} else {
			this.method14419(i_3);
			this.aClass137_Sub1_Sub1_9029.method2351(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2);
			OpenGL.glEnd();
			this.method14415();
		}

	}

	public void method2778(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.aClass137_Sub1_Sub1_9033.method2351(false);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13624(i_5);
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		i_1 += this.anInt9030;
		i_2 += this.anInt9034;
		if (this.aClass137_Sub1_Sub1_9029 == null) {
			this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
			this.aGraphicalRenderer_Sub1_9032.method13612(i_3);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2);
			OpenGL.glEnd();
		} else {
			this.method14419(i_3);
			this.aClass137_Sub1_Sub1_9029.method2351(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136, i_2);
			OpenGL.glEnd();
			this.method14415();
		}

	}

	public int method2792() {
		return this.aClass137_Sub1_Sub1_9033.anInt10133 + this.anInt9034 + this.anInt9035;
	}

	public void method2780(int i_1, int i_2, int i_3, int i_4) {
		this.anInt9030 = i_1;
		this.anInt9034 = i_2;
		this.anInt9036 = i_3;
		this.anInt9035 = i_4;
		this.aBool9028 = this.anInt9030 != 0 || this.anInt9034 != 0 || this.anInt9036 != 0 || this.anInt9035 != 0;
	}

	public void method2744(int[] ints_1) {
		ints_1[0] = this.anInt9030;
		ints_1[1] = this.anInt9034;
		ints_1[2] = this.anInt9036;
		ints_1[3] = this.anInt9035;
	}

	public void method2782(int[] ints_1) {
		ints_1[0] = this.anInt9030;
		ints_1[1] = this.anInt9034;
		ints_1[2] = this.anInt9036;
		ints_1[3] = this.anInt9035;
	}

	public Interface9 method2808() {
		return this.aClass137_Sub1_Sub1_9033.method14441();
	}

	public void method2777(int[] ints_1) {
		ints_1[0] = this.anInt9030;
		ints_1[1] = this.anInt9034;
		ints_1[2] = this.anInt9036;
		ints_1[3] = this.anInt9035;
	}

	public void method2770(int i_1, int i_2, int i_3) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass137_Sub1_Sub1_9029 = Class137_Sub1_Sub1.method15538(this.aGraphicalRenderer_Sub1_9032, i_1, i_2, this.aClass137_Sub1_Sub1_9033.anInt10136, this.aClass137_Sub1_Sub1_9033.anInt10133);
		this.anInt9031 = i_3;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public void method2785(int[] ints_1) {
		ints_1[0] = this.anInt9030;
		ints_1[1] = this.anInt9034;
		ints_1[2] = this.anInt9036;
		ints_1[3] = this.anInt9035;
	}

	public int method2794() {
		return this.aClass137_Sub1_Sub1_9033.anInt10136;
	}

	public int method2788() {
		return this.aClass137_Sub1_Sub1_9033.anInt10133;
	}

	public int method2765() {
		return this.aClass137_Sub1_Sub1_9033.anInt10133;
	}

	public int method225() {
		return this.aClass137_Sub1_Sub1_9033.anInt10136 + this.anInt9030 + this.anInt9036;
	}

	public int method227() {
		return this.aClass137_Sub1_Sub1_9033.anInt10136 + this.anInt9030 + this.anInt9036;
	}

	public int method226() {
		return this.aClass137_Sub1_Sub1_9033.anInt10136 + this.anInt9030 + this.anInt9036;
	}

	public int method229() {
		return this.aClass137_Sub1_Sub1_9033.anInt10136 + this.anInt9030 + this.anInt9036;
	}

	public int method2757() {
		return this.aClass137_Sub1_Sub1_9033.anInt10133 + this.anInt9034 + this.anInt9035;
	}

	public int method2753() {
		return this.aClass137_Sub1_Sub1_9033.anInt10133 + this.anInt9034 + this.anInt9035;
	}

	public void method2799(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		int i_8 = i_1 + i_3;
		int i_9 = i_2 + i_4;
		this.aClass137_Sub1_Sub1_9033.method2351(false);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13624(i_7);
		this.aGraphicalRenderer_Sub1_9032.method13612(i_5);
		OpenGL.glColor4ub((byte) (i_6 >> 16), (byte) (i_6 >> 8), (byte) i_6, (byte) (i_6 >> 24));
		if (this.aClass137_Sub1_Sub1_9033.aBool10135 && !this.aBool9028) {
			float f_18 = this.aClass137_Sub1_Sub1_9033.aFloat10134 * (float) i_4 / (float) this.aClass137_Sub1_Sub1_9033.anInt10133;
			float f_19 = this.aClass137_Sub1_Sub1_9033.aFloat10132 * (float) i_3 / (float) this.aClass137_Sub1_Sub1_9033.anInt10136;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f_18);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_9);
			OpenGL.glTexCoord2f(f_19, 0.0F);
			OpenGL.glVertex2i(i_8, i_9);
			OpenGL.glTexCoord2f(f_19, f_18);
			OpenGL.glVertex2i(i_8, i_2);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) this.anInt9030, (float) this.anInt9034, 0.0F);
			int i_10 = this.method228();
			int i_11 = this.method2748();
			int i_12 = i_2 + this.aClass137_Sub1_Sub1_9033.anInt10133;
			OpenGL.glBegin(7);

			int i_13;
			int i_15;
			for (i_13 = i_2; i_12 <= i_9; i_12 += i_11) {
				int i_14 = i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136;

				for (i_15 = i_1; i_14 <= i_8; i_15 += i_10) {
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_15, i_13);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_15, i_12);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
					OpenGL.glVertex2i(i_14, i_12);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_14, i_13);
					i_14 += i_10;
				}

				if (i_15 < i_8) {
					float f_16 = this.aClass137_Sub1_Sub1_9033.aFloat10132 * (float) (i_8 - i_15) / (float) this.aClass137_Sub1_Sub1_9033.anInt10136;
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_15, i_13);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_15, i_12);
					OpenGL.glTexCoord2f(f_16, 0.0F);
					OpenGL.glVertex2i(i_8, i_12);
					OpenGL.glTexCoord2f(f_16, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_8, i_13);
				}

				i_13 += i_11;
			}

			if (i_13 < i_9) {
				float f_20 = this.aClass137_Sub1_Sub1_9033.aFloat10134 * (float) (this.aClass137_Sub1_Sub1_9033.anInt10133 - (i_9 - i_13)) / (float) this.aClass137_Sub1_Sub1_9033.anInt10133;
				i_15 = i_1 + this.aClass137_Sub1_Sub1_9033.anInt10136;

				int i_21;
				for (i_21 = i_1; i_15 <= i_8; i_21 += i_10) {
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_21, i_13);
					OpenGL.glTexCoord2f(0.0F, f_20);
					OpenGL.glVertex2i(i_21, i_9);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, f_20);
					OpenGL.glVertex2i(i_15, i_9);
					OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_15, i_13);
					i_15 += i_10;
				}

				if (i_21 < i_8) {
					float f_17 = this.aClass137_Sub1_Sub1_9033.aFloat10132 * (float) (i_8 - i_21) / (float) this.aClass137_Sub1_Sub1_9033.anInt10136;
					OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_21, i_13);
					OpenGL.glTexCoord2f(0.0F, f_20);
					OpenGL.glVertex2i(i_21, i_9);
					OpenGL.glTexCoord2f(f_17, f_20);
					OpenGL.glVertex2i(i_8, i_9);
					OpenGL.glTexCoord2f(f_17, this.aClass137_Sub1_Sub1_9033.aFloat10134);
					OpenGL.glVertex2i(i_8, i_13);
				}
			}

			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}

	}

	NativeSprite_Sub2(OpenGLGraphicalRenderer class505_sub1_1, int i_2, int i_3, boolean bool_4) {
		this.aGraphicalRenderer_Sub1_9032 = class505_sub1_1;
		this.aClass137_Sub1_Sub1_9033 = Class137_Sub1_Sub1.method15547(class505_sub1_1, bool_4 ? Class150.aClass150_1949 : Class150.aClass150_1950, Class76.aClass76_751, i_2, i_3);
	}

	void method2798(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		float f_11;
		float f_12;
		if (this.aBool9028) {
			f_11 = (float) this.method228();
			f_12 = (float) this.method2748();
			float f_13 = (f_3 - f_1) / f_11;
			float f_14 = (f_4 - f_2) / f_11;
			float f_15 = (f_5 - f_1) / f_12;
			float f_16 = (f_6 - f_2) / f_12;
			float f_17 = f_15 * (float) this.anInt9034;
			float f_18 = f_16 * (float) this.anInt9034;
			float f_19 = f_13 * (float) this.anInt9030;
			float f_20 = f_14 * (float) this.anInt9030;
			float f_21 = -f_13 * (float) this.anInt9036;
			float f_22 = -f_14 * (float) this.anInt9036;
			float f_23 = -f_15 * (float) this.anInt9035;
			float f_24 = -f_16 * (float) this.anInt9035;
			f_1 = f_1 + f_19 + f_17;
			f_2 = f_2 + f_20 + f_18;
			f_3 = f_3 + f_21 + f_17;
			f_4 = f_4 + f_22 + f_18;
			f_5 = f_5 + f_19 + f_23;
			f_6 = f_6 + f_20 + f_24;
		}

		f_11 = f_5 + (f_3 - f_1);
		f_12 = f_4 + (f_6 - f_2);
		this.aClass137_Sub1_Sub1_9033.method2351((i_10 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13624(i_9);
		this.aGraphicalRenderer_Sub1_9032.method13612(i_7);
		OpenGL.glColor4ub((byte) (i_8 >> 16), (byte) (i_8 >> 8), (byte) i_8, (byte) (i_8 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glVertex2f(f_1, f_2);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_5, f_6);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glVertex2f(f_11, f_12);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glVertex2f(f_3, f_4);
		OpenGL.glEnd();
	}

	void method2812(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		float f_11;
		float f_12;
		if (this.aBool9028) {
			f_11 = (float) this.method228();
			f_12 = (float) this.method2748();
			float f_13 = (f_3 - f_1) / f_11;
			float f_14 = (f_4 - f_2) / f_11;
			float f_15 = (f_5 - f_1) / f_12;
			float f_16 = (f_6 - f_2) / f_12;
			float f_17 = f_15 * (float) this.anInt9034;
			float f_18 = f_16 * (float) this.anInt9034;
			float f_19 = f_13 * (float) this.anInt9030;
			float f_20 = f_14 * (float) this.anInt9030;
			float f_21 = -f_13 * (float) this.anInt9036;
			float f_22 = -f_14 * (float) this.anInt9036;
			float f_23 = -f_15 * (float) this.anInt9035;
			float f_24 = -f_16 * (float) this.anInt9035;
			f_1 = f_1 + f_19 + f_17;
			f_2 = f_2 + f_20 + f_18;
			f_3 = f_3 + f_21 + f_17;
			f_4 = f_4 + f_22 + f_18;
			f_5 = f_5 + f_19 + f_23;
			f_6 = f_6 + f_20 + f_24;
		}

		f_11 = f_5 + (f_3 - f_1);
		f_12 = f_4 + (f_6 - f_2);
		this.aClass137_Sub1_Sub1_9033.method2351((i_10 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13624(i_9);
		this.aGraphicalRenderer_Sub1_9032.method13612(i_7);
		OpenGL.glColor4ub((byte) (i_8 >> 16), (byte) (i_8 >> 8), (byte) i_8, (byte) (i_8 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glVertex2f(f_1, f_2);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_5, f_6);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glVertex2f(f_11, f_12);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glVertex2f(f_3, f_4);
		OpenGL.glEnd();
	}

	public void method2768(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (this.aGraphicalRenderer_Sub1_9032.aBool8456) {
			int[] ints_7 = this.aGraphicalRenderer_Sub1_9032.ab(i_5, i_6, i_3, i_4);
			if (ints_7 != null) {
				for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
					ints_7[i_8] |= ~0xffffff;
				}

				this.method14414(i_1, i_2, i_3, i_4, ints_7, i_3);
			}
		} else {
			this.aClass137_Sub1_Sub1_9033.method14439(i_1, i_2, i_3, i_4, i_5, i_6);
		}

	}

	void method2811(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = ((Class455_Sub2) class455_8).aClass137_Sub1_Sub1_8974;
		float f_12;
		float f_13;
		float f_14;
		float f_15;
		if (this.aBool9028) {
			f_12 = (float) this.method228();
			f_13 = (float) this.method2748();
			f_14 = (f_3 - f_1) / f_12;
			f_15 = (f_4 - f_2) / f_12;
			float f_16 = (f_5 - f_1) / f_13;
			float f_17 = (f_6 - f_2) / f_13;
			float f_18 = f_16 * (float) this.anInt9034;
			float f_19 = f_17 * (float) this.anInt9034;
			float f_20 = f_14 * (float) this.anInt9030;
			float f_21 = f_15 * (float) this.anInt9030;
			float f_22 = -f_14 * (float) this.anInt9036;
			float f_23 = -f_15 * (float) this.anInt9036;
			float f_24 = -f_16 * (float) this.anInt9035;
			float f_25 = -f_17 * (float) this.anInt9035;
			f_1 = f_1 + f_20 + f_18;
			f_2 = f_2 + f_21 + f_19;
			f_3 = f_3 + f_22 + f_18;
			f_4 = f_4 + f_23 + f_19;
			f_5 = f_5 + f_20 + f_24;
			f_6 = f_6 + f_21 + f_25;
		}

		f_12 = f_5 + (f_3 - f_1);
		f_13 = f_4 + (f_6 - f_2);
		this.aClass137_Sub1_Sub1_9033.method2351((i_7 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13612(1);
		this.aGraphicalRenderer_Sub1_9032.method13610(1);
		this.aGraphicalRenderer_Sub1_9032.method13654(class137_sub1_sub1_11);
		this.aGraphicalRenderer_Sub1_9032.method13717(7681, 8448);
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 34168, 768);
		this.aGraphicalRenderer_Sub1_9032.method13624(1);
		f_14 = class137_sub1_sub1_11.aFloat10132 / (float) class137_sub1_sub1_11.anInt10136;
		f_15 = class137_sub1_sub1_11.aFloat10134 / (float) class137_sub1_sub1_11.anInt10133;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_1 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_2 - (float) i_10));
		OpenGL.glVertex2f(f_1, f_2);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_5 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_6 - (float) i_10));
		OpenGL.glVertex2f(f_5, f_6);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_12 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_13 - (float) i_10));
		OpenGL.glVertex2f(f_12, f_13);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_14 * (f_3 - (float) i_9), class137_sub1_sub1_11.aFloat10134 - f_15 * (f_4 - (float) i_10));
		OpenGL.glVertex2f(f_3, f_4);
		OpenGL.glEnd();
		this.aGraphicalRenderer_Sub1_9032.method13595(0, 5890, 768);
		this.aGraphicalRenderer_Sub1_9032.method13612(0);
		this.aGraphicalRenderer_Sub1_9032.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_9032.method13610(0);
	}

	void method14419(int i_1) {
		this.aGraphicalRenderer_Sub1_9032.method13610(1);
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
		this.aGraphicalRenderer_Sub1_9032.method13717(this.aGraphicalRenderer_Sub1_9032.method13613(i_1), 7681);
		this.aGraphicalRenderer_Sub1_9032.method13595(1, 34167, 768);
		this.aGraphicalRenderer_Sub1_9032.method13616(0, 34168);
		this.aGraphicalRenderer_Sub1_9032.method13610(0);
		this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9029);
		this.aGraphicalRenderer_Sub1_9032.method13717(34479, 7681);
		this.aGraphicalRenderer_Sub1_9032.method13595(1, 34166, 768);
		if (this.anInt9031 == 0) {
			this.aGraphicalRenderer_Sub1_9032.method13635(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt9031 == 1) {
			this.aGraphicalRenderer_Sub1_9032.method13635(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt9031 == 2) {
			this.aGraphicalRenderer_Sub1_9032.method13635(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt9031 == 3) {
			this.aGraphicalRenderer_Sub1_9032.method13635(128.5F, 128.5F, 128.5F, 0.0F);
		}

	}

	public void method2804(int[] ints_1) {
		ints_1[0] = this.anInt9030;
		ints_1[1] = this.anInt9034;
		ints_1[2] = this.anInt9036;
		ints_1[3] = this.anInt9035;
	}

	void method2787(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		this.aClass137_Sub1_Sub1_9033.method2351((i_8 & 0x1) != 0);
		this.aGraphicalRenderer_Sub1_9032.method13637();
		this.aGraphicalRenderer_Sub1_9032.method13624(i_7);
		OpenGL.glColor4ub((byte) (i_6 >> 16), (byte) (i_6 >> 8), (byte) i_6, (byte) (i_6 >> 24));
		if (this.aBool9028) {
			float f_9 = (float) i_3 / (float) this.method228();
			float f_10 = (float) i_4 / (float) this.method2748();
			float f_11 = (float) i_1 + (float) this.anInt9030 * f_9;
			float f_12 = (float) i_2 + (float) this.anInt9034 * f_10;
			float f_13 = f_11 + (float) this.aClass137_Sub1_Sub1_9033.anInt10136 * f_9;
			float f_14 = f_12 + (float) this.aClass137_Sub1_Sub1_9033.anInt10133 * f_10;
			if (this.aClass137_Sub1_Sub1_9029 == null) {
				this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
				this.aGraphicalRenderer_Sub1_9032.method13612(i_5);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_11, f_12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_11, f_14);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_13, f_14);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_13, f_12);
				OpenGL.glEnd();
			} else {
				this.method14419(i_5);
				this.aClass137_Sub1_Sub1_9029.method2351(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_11, f_12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_11, f_14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_13, f_14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
				OpenGL.glVertex2f(f_13, f_12);
				OpenGL.glEnd();
				this.method14415();
			}
		} else if (this.aClass137_Sub1_Sub1_9029 == null) {
			this.aGraphicalRenderer_Sub1_9032.method13654(this.aClass137_Sub1_Sub1_9033);
			this.aGraphicalRenderer_Sub1_9032.method13612(i_5);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + i_4);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_1 + i_3, i_2 + i_4);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1 + i_3, i_2);
			OpenGL.glEnd();
		} else {
			this.method14419(i_5);
			this.aClass137_Sub1_Sub1_9029.method2351(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1, i_2);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i_1, i_2 + i_4);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, 0.0F);
			OpenGL.glVertex2i(i_1 + i_3, i_2 + i_4);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_9033.aFloat10132, this.aClass137_Sub1_Sub1_9033.aFloat10134);
			OpenGL.glVertex2i(i_1 + i_3, i_2);
			OpenGL.glEnd();
			this.method14415();
		}

	}

}
