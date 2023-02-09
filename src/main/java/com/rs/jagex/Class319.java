package com.rs.jagex;

import jaggl.OpenGL;

public abstract class Class319 implements Interface30 {

	static int[] anIntArray3713 = new int[1];
	int anInt3706;
	boolean aBool3712;
	Class35 aClass35_3705;
	JAGGLRenderer aGraphicalRenderer_Sub2_Sub1_3700;
	int anInt3707;
	Class150 aClass150_3708;
	Class76 aClass76_3710;
	int anInt3711;

	Class319(JAGGLRenderer class505_sub2_sub1_1, int i_2, Class150 class150_3, Class76 class76_4, int i_5, boolean bool_6) {
		aClass35_3705 = Class35.aClass35_382;
		aGraphicalRenderer_Sub2_Sub1_3700 = class505_sub2_sub1_1;
		anInt3707 = i_2;
		aClass150_3708 = class150_3;
		aClass76_3710 = class76_4;
		aBool3712 = bool_6;
		anInt3711 = i_5;
		OpenGL.glGenTextures(1, anIntArray3713, 0);
		anInt3706 = anIntArray3713[0];
		method5700();
		method5699(0);
	}

	@Override
	protected void finalize() throws Throwable {
		method26();
		super.finalize();
	}

	@Override
	public void method201(Class35 class35_1) {
		if (aClass35_3705 != class35_1) {
			aClass35_3705 = class35_1;
			method5700();
		}

	}

	@Override
	public void method202(Class35 class35_1) {
		if (aClass35_3705 != class35_1) {
			aClass35_3705 = class35_1;
			method5700();
		}

	}

	@Override
	public void method203() {
		int i_1 = aGraphicalRenderer_Sub2_Sub1_3700.method13963();
		int i_2 = aGraphicalRenderer_Sub2_Sub1_3700.anIntArray10188[i_1];
		if (i_2 != anInt3707) {
			if (i_2 != 0) {
				OpenGL.glBindTexture(i_2, 0);
				OpenGL.glDisable(i_2);
			}

			OpenGL.glEnable(anInt3707);
			aGraphicalRenderer_Sub2_Sub1_3700.anIntArray10188[i_1] = anInt3707;
		}

		OpenGL.glBindTexture(anInt3707, anInt3706);
	}

	@Override
	public void method204(Class35 class35_1) {
		if (aClass35_3705 != class35_1) {
			aClass35_3705 = class35_1;
			method5700();
		}

	}

	@Override
	public void method205(Class35 class35_1) {
		if (aClass35_3705 != class35_1) {
			aClass35_3705 = class35_1;
			method5700();
		}

	}

	@Override
	public void method206(Class35 class35_1) {
		if (aClass35_3705 != class35_1) {
			aClass35_3705 = class35_1;
			method5700();
		}

	}

	@Override
	public void method207() {
		int i_1 = aGraphicalRenderer_Sub2_Sub1_3700.method13963();
		int i_2 = aGraphicalRenderer_Sub2_Sub1_3700.anIntArray10188[i_1];
		if (i_2 != anInt3707) {
			if (i_2 != 0) {
				OpenGL.glBindTexture(i_2, 0);
				OpenGL.glDisable(i_2);
			}

			OpenGL.glEnable(anInt3707);
			aGraphicalRenderer_Sub2_Sub1_3700.anIntArray10188[i_1] = anInt3707;
		}

		OpenGL.glBindTexture(anInt3707, anInt3706);
	}

	@Override
	public void method26() {
		if (anInt3706 > 0) {
			aGraphicalRenderer_Sub2_Sub1_3700.method15570(anInt3706, method5698());
			anInt3706 = 0;
		}

	}

	@Override
	public void method32() {
		if (anInt3706 > 0) {
			aGraphicalRenderer_Sub2_Sub1_3700.method15570(anInt3706, method5698());
			anInt3706 = 0;
		}

	}

	boolean method54() {
		int i_1 = method5698();
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGenerateMipmapEXT(anInt3707);
		aBool3712 = true;
		method5700();
		method5699(i_1);
		return true;
	}

	int method5698() {
		int i_1 = aClass150_3708.anInt1959 * aClass76_3710.anInt748 * anInt3711;
		return aBool3712 ? i_1 * 4 / 3 : i_1;
	}

	void method5699(int i_1) {
		aGraphicalRenderer_Sub2_Sub1_3700.anInt8701 -= i_1;
		aGraphicalRenderer_Sub2_Sub1_3700.anInt8701 += method5698();
	}

	void method5700() {
		aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
		if (aClass35_3705 == Class35.aClass35_382) {
			OpenGL.glTexParameteri(anInt3707, 10241, aBool3712 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt3707, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt3707, 10241, aBool3712 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt3707, 10240, 9728);
		}

	}

	void method5702(int i_1, int i_2, int i_3, float[] floats_4) {
		int i_21 = i_2;
		int i_31 = i_3;
		if (i_21 > 0 && !CutsceneAction_Sub9.method14585(i_21))
			throw new IllegalArgumentException("");
		if (i_31 > 0 && !CutsceneAction_Sub9.method14585(i_31))
			throw new IllegalArgumentException("");
		else {
			int i_5 = aClass150_3708.anInt1959;
			int i_6 = 0;
			int i_7 = Math.min(i_21, i_31);
			int i_8 = i_21 >> 1;
			int i_9 = i_31 >> 1;
			float[] floats_10 = floats_4;
			float[] floats_11 = new float[i_8 * i_9 * i_5];

			while (true) {
				OpenGL.glTexImage2Df(i_1, i_6, JAGGLRenderer.method15574(aClass150_3708, aClass76_3710), i_21, i_31, 0, JAGGLRenderer.method15575(aClass150_3708), 5126, floats_10, 0);
				if (i_7 <= 1)
					return;

				int i_12 = i_5 * i_21;

				for (int i_13 = 0; i_13 < i_5; i_13++) {
					int i_14 = i_13;
					int i_15 = i_13;
					int i_16 = i_13 + i_12;

					for (int i_17 = 0; i_17 < i_9; i_17++) {
						for (int i_18 = 0; i_18 < i_8; i_18++) {
							float f_19 = floats_10[i_15];
							i_15 += i_5;
							f_19 += floats_10[i_15];
							i_15 += i_5;
							f_19 += floats_10[i_16];
							i_16 += i_5;
							f_19 += floats_10[i_16];
							i_16 += i_5;
							floats_11[i_14] = f_19 * 0.25F;
							i_14 += i_5;
						}

						i_15 += i_12;
						i_16 += i_12;
					}
				}

				float[] floats_20 = floats_11;
				floats_11 = floats_10;
				floats_10 = floats_20;
				i_21 = i_8;
				i_31 = i_9;
				i_8 >>= 1;
						i_9 >>= 1;
				i_7 >>= 1;
				++i_6;
			}
		}
	}

	void method5707(int i_1, int i_2, int i_3, byte[] bytes_4) {
		int i_22 = i_2;
		int i_31 = i_3;
		if (i_22 > 0 && !CutsceneAction_Sub9.method14585(i_22))
			throw new IllegalArgumentException("");
		if (i_31 > 0 && !CutsceneAction_Sub9.method14585(i_31))
			throw new IllegalArgumentException("");
		else {
			int i_5 = aClass150_3708.anInt1959;
			int i_6 = 0;
			int i_7 = Math.min(i_22, i_31);
			int i_8 = i_22 >> 1;
			int i_9 = i_31 >> 1;
			byte[] bytes_10 = bytes_4;
			byte[] bytes_11 = new byte[i_8 * i_9 * i_5];

			while (true) {
				OpenGL.glTexImage2Dub(i_1, i_6, JAGGLRenderer.method15574(aClass150_3708, aClass76_3710), i_22, i_31, 0, JAGGLRenderer.method15575(aClass150_3708), 5121, bytes_10, 0);
				if (i_7 <= 1)
					return;

				int i_12 = i_5 * i_22;

				for (int i_13 = 0; i_13 < i_5; i_13++) {
					int i_14 = i_13;
					int i_15 = i_13;
					int i_16 = i_13 + i_12;

					for (int i_17 = 0; i_17 < i_9; i_17++) {
						for (int i_18 = 0; i_18 < i_8; i_18++) {
							byte b_19 = bytes_10[i_15];
							i_15 += i_5;
							int i_21 = bytes_10[i_15] + b_19;
							i_15 += i_5;
							i_21 += bytes_10[i_16];
							i_16 += i_5;
							i_21 += bytes_10[i_16];
							i_16 += i_5;
							bytes_11[i_14] = (byte) (i_21 >> 2);
							i_14 += i_5;
						}

						i_15 += i_12;
						i_16 += i_12;
					}
				}

				byte[] bytes_20 = bytes_11;
				bytes_11 = bytes_10;
				bytes_10 = bytes_20;
				i_22 = i_8;
				i_31 = i_9;
				i_8 >>= 1;
				i_9 >>= 1;
				i_7 >>= 1;
				++i_6;
			}
		}
	}

	void method5714(int i_1, int i_2, int i_3, int[] ints_4) {
		int i_24 = i_2;
		int i_31 = i_3;
		if (i_24 > 0 && !CutsceneAction_Sub9.method14585(i_24))
			throw new IllegalArgumentException("");
		if ((i_31 > 0 && !CutsceneAction_Sub9.method14585(i_31)) || (aClass150_3708 != Class150.aClass150_1949))
			throw new IllegalArgumentException("");
		else {
			int i_5 = 0;
			int i_6 = Math.min(i_24, i_31);
			int i_7 = i_24 >> 1;
			int i_8 = i_31 >> 1;
			int[] ints_9 = ints_4;
			int[] ints_10 = new int[i_7 * i_8];

			while (true) {
				OpenGL.glTexImage2Di(i_1, i_5, JAGGLRenderer.method15574(aClass150_3708, aClass76_3710), i_24, i_31, 0, 32993, aGraphicalRenderer_Sub2_Sub1_3700.anInt10198, ints_9, 0);
				if (i_6 <= 1)
					return;

				int i_11 = 0;
				int i_12 = 0;
				int i_13 = i_12 + i_24;

				for (int i_14 = 0; i_14 < i_8; i_14++) {
					for (int i_15 = 0; i_15 < i_7; i_15++) {
						int i_16 = ints_9[i_12++];
						int i_17 = ints_9[i_12++];
						int i_18 = ints_9[i_13++];
						int i_19 = ints_9[i_13++];
						int i_20 = i_16 >> 24 & 0xff;
					int i_21 = i_16 >> 16 & 0xff;
				int i_22 = i_16 >> 8 & 0xff;
				int i_23 = i_16 & 0xff;
				i_20 += i_17 >> 24 & 0xff;
				i_21 += i_17 >> 16 & 0xff;
				i_22 += i_17 >> 8 & 0xff;
				i_23 += i_17 & 0xff;
				i_20 += i_18 >> 24 & 0xff;
				i_21 += i_18 >> 16 & 0xff;
				i_22 += i_18 >> 8 & 0xff;
				i_23 += i_18 & 0xff;
				i_20 += i_19 >> 24 & 0xff;
				i_21 += i_19 >> 16 & 0xff;
				i_22 += i_19 >> 8 & 0xff;
				i_23 += i_19 & 0xff;
				ints_10[i_11++] = (i_20 & 0x3fc) << 22 | (i_21 & 0x3fc) << 14 | (i_22 & 0x3fc) << 6 | (i_23 & 0x3fc) >> 2;
					}

					i_12 += i_24;
					i_13 += i_24;
				}

				int[] ints_24 = ints_10;
				ints_10 = ints_9;
				ints_9 = ints_24;
				i_24 = i_7;
				i_31 = i_8;
				i_7 >>= 1;
				i_8 >>= 1;
				i_6 >>= 1;
				++i_5;
			}
		}
	}

}
