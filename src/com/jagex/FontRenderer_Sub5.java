package com.jagex;
import jaggl.OpenGL;

public class FontRenderer_Sub5 extends FontRenderer {

	OpenGLGraphicalRenderer aGraphicalRenderer_Sub1_9323;
	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_9325;
	boolean aBool9326;
	Class138 aClass138_9324;

	void method374(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
		Class455_Sub2 class455_sub2_9 = (Class455_Sub2) class455_6;
		Class137_Sub1_Sub1 class137_sub1_sub1_10 = class455_sub2_9.aClass137_Sub1_Sub1_8974;
		this.aGraphicalRenderer_Sub1_9323.method13606();
		this.aGraphicalRenderer_Sub1_9323.method13654(this.aClass137_Sub1_Sub1_9325);
		if (!this.aBool9326 && !bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 7681);
		} else {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 8448);
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 34168, 768);
		}

		this.aGraphicalRenderer_Sub1_9323.method13610(1);
		this.aGraphicalRenderer_Sub1_9323.method13654(class137_sub1_sub1_10);
		this.aGraphicalRenderer_Sub1_9323.method13717(7681, 8448);
		this.aGraphicalRenderer_Sub1_9323.method13595(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f_11 = class137_sub1_sub1_10.aFloat10132 / (float) class137_sub1_sub1_10.anInt10136;
		float f_12 = class137_sub1_sub1_10.aFloat10134 / (float) class137_sub1_sub1_10.anInt10133;
		OpenGL.glTexGenfv(8192, 9474, new float[] { f_11, 0.0F, 0.0F, (float) (-i_7) * f_11 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_12, 0.0F, (float) (-i_8) * f_12 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glTranslatef((float) i_2, (float) i_3, 0.0F);
		this.aClass138_9324.method2379(var_1);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aGraphicalRenderer_Sub1_9323.method13595(0, 5890, 768);
		this.aGraphicalRenderer_Sub1_9323.method13717(8448, 8448);
		this.aGraphicalRenderer_Sub1_9323.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_9323.method13610(0);
		if (this.aBool9326 || bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 5890, 768);
		}

	}

	void method362(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
		Class455_Sub2 class455_sub2_9 = (Class455_Sub2) class455_6;
		Class137_Sub1_Sub1 class137_sub1_sub1_10 = class455_sub2_9.aClass137_Sub1_Sub1_8974;
		this.aGraphicalRenderer_Sub1_9323.method13606();
		this.aGraphicalRenderer_Sub1_9323.method13654(this.aClass137_Sub1_Sub1_9325);
		if (!this.aBool9326 && !bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 7681);
		} else {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 8448);
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 34168, 768);
		}

		this.aGraphicalRenderer_Sub1_9323.method13610(1);
		this.aGraphicalRenderer_Sub1_9323.method13654(class137_sub1_sub1_10);
		this.aGraphicalRenderer_Sub1_9323.method13717(7681, 8448);
		this.aGraphicalRenderer_Sub1_9323.method13595(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f_11 = class137_sub1_sub1_10.aFloat10132 / (float) class137_sub1_sub1_10.anInt10136;
		float f_12 = class137_sub1_sub1_10.aFloat10134 / (float) class137_sub1_sub1_10.anInt10133;
		OpenGL.glTexGenfv(8192, 9474, new float[] { f_11, 0.0F, 0.0F, (float) (-i_7) * f_11 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_12, 0.0F, (float) (-i_8) * f_12 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glTranslatef((float) i_2, (float) i_3, 0.0F);
		this.aClass138_9324.method2379(var_1);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aGraphicalRenderer_Sub1_9323.method13595(0, 5890, 768);
		this.aGraphicalRenderer_Sub1_9323.method13717(8448, 8448);
		this.aGraphicalRenderer_Sub1_9323.method13654((Class137) null);
		this.aGraphicalRenderer_Sub1_9323.method13610(0);
		if (this.aBool9326 || bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 5890, 768);
		}

	}

	void UA(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
		this.aGraphicalRenderer_Sub1_9323.method13606();
		this.aGraphicalRenderer_Sub1_9323.method13654(this.aClass137_Sub1_Sub1_9325);
		if (!this.aBool9326 && !bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 7681);
		} else {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 8448);
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 34168, 768);
		}

		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glTranslatef((float) i_2, (float) i_3, 0.0F);
		this.aClass138_9324.method2379(var_1);
		OpenGL.glLoadIdentity();
		if (this.aBool9326 || bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 5890, 768);
		}

	}

	void c(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
		this.aGraphicalRenderer_Sub1_9323.method13606();
		this.aGraphicalRenderer_Sub1_9323.method13654(this.aClass137_Sub1_Sub1_9325);
		if (!this.aBool9326 && !bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 7681);
		} else {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 8448);
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 34168, 768);
		}

		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glTranslatef((float) i_2, (float) i_3, 0.0F);
		this.aClass138_9324.method2379(var_1);
		OpenGL.glLoadIdentity();
		if (this.aBool9326 || bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 5890, 768);
		}

	}

	FontRenderer_Sub5(OpenGLGraphicalRenderer class505_sub1_1, FontMetrics fontmetrics_2, SpriteDefinitions[] arr_3, boolean bool_4) {
		super(class505_sub1_1, fontmetrics_2);
		this.aGraphicalRenderer_Sub1_9323 = class505_sub1_1;
		int i_5 = 0;

		int i_6;
		for (i_6 = 0; i_6 < 256; i_6++) {
			SpriteDefinitions class91_7 = arr_3[i_6];
			if (class91_7.height > i_5) {
				i_5 = class91_7.height;
			}

			if (class91_7.width > i_5) {
				i_5 = class91_7.width;
			}
		}

		i_6 = i_5 * 16;
		int i_8;
		int i_11;
		int i_12;
		int i_13;
		int i_14;
		int i_15;
		int i_17;
		int i_18;
		SpriteDefinitions class91_23;
		if (bool_4) {
			byte[] bytes_28 = new byte[i_6 * i_6];

			for (i_8 = 0; i_8 < 256; i_8++) {
				class91_23 = arr_3[i_8];
				int i_26 = class91_23.height;
				i_11 = class91_23.width;
				i_12 = i_5 * (i_8 % 16);
				i_13 = i_8 / 16 * i_5;
				i_14 = i_12 + i_13 * i_6;
				i_15 = 0;
				byte[] bytes_27;
				if (class91_23.alpha == null) {
					bytes_27 = class91_23.pixels;

					for (i_17 = 0; i_17 < i_26; i_17++) {
						for (i_18 = 0; i_18 < i_11; i_18++) {
							bytes_28[i_14++] = (byte) (bytes_27[i_15++] == 0 ? 0 : -1);
						}

						i_14 += i_6 - i_11;
					}
				} else {
					bytes_27 = class91_23.alpha;

					for (i_17 = 0; i_17 < i_26; i_17++) {
						for (i_18 = 0; i_18 < i_11; i_18++) {
							bytes_28[i_14++] = bytes_27[i_15++];
						}

						i_14 += i_6 - i_11;
					}
				}
			}

			this.aClass137_Sub1_Sub1_9325 = Class137_Sub1_Sub1.method15540(class505_sub1_1, Class150.aClass150_1951, Class76.aClass76_751, i_6, i_6, bytes_28, Class150.aClass150_1951);
			this.aBool9326 = true;
		} else {
			int[] ints_29 = new int[i_6 * i_6];

			for (i_8 = 0; i_8 < 256; i_8++) {
				class91_23 = arr_3[i_8];
				int[] ints_10 = class91_23.pallete;
				byte[] bytes_24 = class91_23.alpha;
				byte[] bytes_25 = class91_23.pixels;
				i_13 = class91_23.height;
				i_14 = class91_23.width;
				i_15 = i_5 * (i_8 % 16);
				int i_16 = i_8 / 16 * i_5;
				i_17 = i_15 + i_16 * i_6;
				i_18 = 0;
				int i_19;
				int i_20;
				if (bytes_24 != null) {
					for (i_19 = 0; i_19 < i_13; i_19++) {
						for (i_20 = 0; i_20 < i_14; i_20++) {
							ints_29[i_17++] = bytes_24[i_18] << 24 | ints_10[bytes_25[i_18] & 0xff];
							++i_18;
						}

						i_17 += i_6 - i_14;
					}
				} else {
					for (i_19 = 0; i_19 < i_13; i_19++) {
						for (i_20 = 0; i_20 < i_14; i_20++) {
							byte b_21;
							if ((b_21 = bytes_25[i_18++]) != 0) {
								ints_29[i_17++] = ~0xffffff | ints_10[b_21 & 0xff];
							} else {
								++i_17;
							}
						}

						i_17 += i_6 - i_14;
					}
				}
			}

			this.aClass137_Sub1_Sub1_9325 = Class137_Sub1_Sub1.method15537(class505_sub1_1, i_6, i_6, ints_29, 0, 0);
			this.aBool9326 = false;
		}

		this.aClass137_Sub1_Sub1_9325.method2351(false);
		this.aClass138_9324 = new Class138(class505_sub1_1, 256);
		float f_22 = this.aClass137_Sub1_Sub1_9325.aFloat10132 / (float) this.aClass137_Sub1_Sub1_9325.anInt10136;
		float f_30 = this.aClass137_Sub1_Sub1_9325.aFloat10134 / (float) this.aClass137_Sub1_Sub1_9325.anInt10133;

		for (int i_9 = 0; i_9 < 256; i_9++) {
			SpriteDefinitions class91_31 = arr_3[i_9];
			i_11 = class91_31.height;
			i_12 = class91_31.width;
			i_13 = class91_31.minY;
			i_14 = class91_31.minX;
			float f_32 = (float) (i_5 * (i_9 % 16));
			float f_33 = (float) (i_9 / 16 * i_5);
			float f_34 = f_32 * f_22;
			float f_35 = f_33 * f_30;
			float f_36 = (f_32 + (float) i_12) * f_22;
			float f_37 = (f_33 + (float) i_11) * f_30;
			this.aClass138_9324.method2380(i_9);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_34, this.aClass137_Sub1_Sub1_9325.aFloat10134 - f_35);
			OpenGL.glVertex2i(i_14, i_13);
			OpenGL.glTexCoord2f(f_34, this.aClass137_Sub1_Sub1_9325.aFloat10134 - f_37);
			OpenGL.glVertex2i(i_14, i_13 + i_11);
			OpenGL.glTexCoord2f(f_36, this.aClass137_Sub1_Sub1_9325.aFloat10134 - f_37);
			OpenGL.glVertex2i(i_14 + i_12, i_13 + i_11);
			OpenGL.glTexCoord2f(f_36, this.aClass137_Sub1_Sub1_9325.aFloat10134 - f_35);
			OpenGL.glVertex2i(i_14 + i_12, i_13);
			OpenGL.glEnd();
			this.aClass138_9324.method2381();
		}

	}

	void t(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
		this.aGraphicalRenderer_Sub1_9323.method13606();
		this.aGraphicalRenderer_Sub1_9323.method13654(this.aClass137_Sub1_Sub1_9325);
		if (!this.aBool9326 && !bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 7681);
		} else {
			this.aGraphicalRenderer_Sub1_9323.method13717(7681, 8448);
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 34168, 768);
		}

		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glTranslatef((float) i_2, (float) i_3, 0.0F);
		this.aClass138_9324.method2379(var_1);
		OpenGL.glLoadIdentity();
		if (this.aBool9326 || bool_5) {
			this.aGraphicalRenderer_Sub1_9323.method13595(0, 5890, 768);
		}

	}

}
