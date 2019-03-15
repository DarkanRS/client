import jaggl.OpenGL;

public abstract class Class137 {

	static int[] anIntArray1649 = new int[1];
	boolean aBool1652 = false;
	boolean aBool1641;
	int anInt1647;
	OpenGLGraphicalRenderer aClass505_Sub1_1646;
	int anInt1648;
	Class150 aClass150_1650;
	Class76 aClass76_1651;
	int anInt1654;

	void method2351(boolean bool_1) {
		if (this.aBool1652 != bool_1) {
			this.aBool1652 = bool_1;
			this.method2352();
		}

	}

	void method2352() {
		this.aClass505_Sub1_1646.method13654(this);
		if (this.aBool1652) {
			OpenGL.glTexParameteri(this.anInt1648, 10241, this.aBool1641 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1648, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1648, 10241, this.aBool1641 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1648, 10240, 9728);
		}

	}

	boolean method2353() {
		if (this.aClass505_Sub1_1646.aBool8472) {
			int i_1 = this.method2358();
			this.aClass505_Sub1_1646.method13654(this);
			OpenGL.glGenerateMipmapEXT(this.anInt1648);
			this.aBool1641 = true;
			this.method2352();
			this.method2357(i_1);
			return true;
		} else {
			return false;
		}
	}

	void method2354(boolean bool_1) {
		if (this.aBool1641 != bool_1) {
			int i_2 = this.method2358();
			this.aBool1641 = true;
			this.method2352();
			this.method2357(i_2);
		}

	}

	void method2355() {
		if (this.anInt1647 > 0) {
			this.aClass505_Sub1_1646.anInt8370 -= this.method2358();
			int[] ints_1 = new int[] { this.anInt1647 };
			OpenGL.glDeleteTextures(1, ints_1, 0);
			this.anInt1647 = 0;
		}

	}

	void method2357(int i_1) {
		this.aClass505_Sub1_1646.anInt8370 -= i_1;
		this.aClass505_Sub1_1646.anInt8370 += this.method2358();
	}

	int method2358() {
		int i_1 = this.aClass150_1650.anInt1959 * this.aClass76_1651.anInt748 * this.anInt1654;
		return this.aBool1641 ? i_1 * 4 / 3 : i_1;
	}

	static void method2359(int i_0, int i_1, int i_2, int i_3, Class150 class150_4, byte[] bytes_5) {
		if (i_2 > 0 && !Class96_Sub9.method14585(i_2)) {
			throw new IllegalArgumentException("");
		} else if (i_3 > 0 && !Class96_Sub9.method14585(i_3)) {
			throw new IllegalArgumentException("");
		} else {
			int i_6 = class150_4.anInt1959;
			int i_7 = 0;
			int i_8 = i_2 < i_3 ? i_2 : i_3;
			int i_9 = i_2 >> 1;
			int i_10 = i_3 >> 1;
			byte[] bytes_11 = bytes_5;
			byte[] bytes_12 = new byte[i_9 * i_10 * i_6];

			while (true) {
				OpenGL.glTexImage2Dub(i_0, i_7, i_1, i_2, i_3, 0, OpenGLGraphicalRenderer.method13629(class150_4), 5121, bytes_11, 0);
				if (i_8 <= 1) {
					return;
				}

				int i_13 = i_6 * i_2;

				for (int i_14 = 0; i_14 < i_6; i_14++) {
					int i_15 = i_14;
					int i_16 = i_14;
					int i_17 = i_14 + i_13;

					for (int i_18 = 0; i_18 < i_10; i_18++) {
						for (int i_19 = 0; i_19 < i_9; i_19++) {
							byte b_20 = bytes_11[i_16];
							i_16 += i_6;
							int i_22 = bytes_11[i_16] + b_20;
							i_16 += i_6;
							i_22 += bytes_11[i_17];
							i_17 += i_6;
							i_22 += bytes_11[i_17];
							i_17 += i_6;
							bytes_12[i_15] = (byte) (i_22 >> 2);
							i_15 += i_6;
						}

						i_16 += i_13;
						i_17 += i_13;
					}
				}

				byte[] bytes_21 = bytes_12;
				bytes_12 = bytes_11;
				bytes_11 = bytes_21;
				i_2 = i_9;
				i_3 = i_10;
				i_9 >>= 1;
				i_10 >>= 1;
				i_8 >>= 1;
				++i_7;
			}
		}
	}

	static void method2361(int i_0, int i_1, int i_2, int i_3, Class150 class150_4, float[] floats_5) {
		if (i_2 > 0 && !Class96_Sub9.method14585(i_2)) {
			throw new IllegalArgumentException("");
		} else if (i_3 > 0 && !Class96_Sub9.method14585(i_3)) {
			throw new IllegalArgumentException("");
		} else {
			int i_6 = class150_4.anInt1959;
			int i_7 = 0;
			int i_8 = i_2 < i_3 ? i_2 : i_3;
			int i_9 = i_2 >> 1;
			int i_10 = i_3 >> 1;
			float[] floats_11 = floats_5;
			float[] floats_12 = new float[i_9 * i_10 * i_6];

			while (true) {
				OpenGL.glTexImage2Df(i_0, i_7, i_1, i_2, i_3, 0, OpenGLGraphicalRenderer.method13629(class150_4), 5126, floats_11, 0);
				if (i_8 <= 1) {
					return;
				}

				int i_13 = i_6 * i_2;

				for (int i_14 = 0; i_14 < i_6; i_14++) {
					int i_15 = i_14;
					int i_16 = i_14;
					int i_17 = i_14 + i_13;

					for (int i_18 = 0; i_18 < i_10; i_18++) {
						for (int i_19 = 0; i_19 < i_9; i_19++) {
							float f_20 = floats_11[i_16];
							i_16 += i_6;
							f_20 += floats_11[i_16];
							i_16 += i_6;
							f_20 += floats_11[i_17];
							i_17 += i_6;
							f_20 += floats_11[i_17];
							i_17 += i_6;
							floats_12[i_15] = f_20 * 0.25F;
							i_15 += i_6;
						}

						i_16 += i_13;
						i_17 += i_13;
					}
				}

				float[] floats_21 = floats_12;
				floats_12 = floats_11;
				floats_11 = floats_21;
				i_2 = i_9;
				i_3 = i_10;
				i_9 >>= 1;
				i_10 >>= 1;
				i_8 >>= 1;
				++i_7;
			}
		}
	}

	public void finalize() throws Throwable {
		this.method2378();
		super.finalize();
	}

	Class137(OpenGLGraphicalRenderer class505_sub1_1, int i_2, Class150 class150_3, Class76 class76_4, int i_5, boolean bool_6) {
		this.aClass505_Sub1_1646 = class505_sub1_1;
		this.anInt1648 = i_2;
		this.aClass150_1650 = class150_3;
		this.aClass76_1651 = class76_4;
		this.aBool1641 = bool_6;
		this.anInt1654 = i_5;
		OpenGL.glGenTextures(1, anIntArray1649, 0);
		this.anInt1647 = anIntArray1649[0];
		this.method2357(0);
	}

	static void method2371(int i_0, int i_1, int i_2, int i_3, int i_5, int[] ints_6) {
		if (i_2 > 0 && !Class96_Sub9.method14585(i_2)) {
			throw new IllegalArgumentException("");
		} else if (i_3 > 0 && !Class96_Sub9.method14585(i_3)) {
			throw new IllegalArgumentException("");
		} else if (32993 != 32993) {
			throw new IllegalArgumentException("");
		} else {
			int i_7 = 0;
			int i_8 = i_2 < i_3 ? i_2 : i_3;
			int i_9 = i_2 >> 1;
			int i_10 = i_3 >> 1;
			int[] ints_11 = ints_6;
			int[] ints_12 = new int[i_9 * i_10];

			while (true) {
				OpenGL.glTexImage2Di(i_0, i_7, i_1, i_2, i_3, 0, 32993, i_5, ints_11, 0);
				if (i_8 <= 1) {
					return;
				}

				int i_13 = 0;
				int i_14 = 0;
				int i_15 = i_14 + i_2;

				for (int i_16 = 0; i_16 < i_10; i_16++) {
					for (int i_17 = 0; i_17 < i_9; i_17++) {
						int i_18 = ints_11[i_14++];
						int i_19 = ints_11[i_14++];
						int i_20 = ints_11[i_15++];
						int i_21 = ints_11[i_15++];
						int i_22 = i_18 >> 24 & 0xff;
						int i_23 = i_18 >> 16 & 0xff;
						int i_24 = i_18 >> 8 & 0xff;
						int i_25 = i_18 & 0xff;
						i_22 += i_19 >> 24 & 0xff;
						i_23 += i_19 >> 16 & 0xff;
						i_24 += i_19 >> 8 & 0xff;
						i_25 += i_19 & 0xff;
						i_22 += i_20 >> 24 & 0xff;
						i_23 += i_20 >> 16 & 0xff;
						i_24 += i_20 >> 8 & 0xff;
						i_25 += i_20 & 0xff;
						i_22 += i_21 >> 24 & 0xff;
						i_23 += i_21 >> 16 & 0xff;
						i_24 += i_21 >> 8 & 0xff;
						i_25 += i_21 & 0xff;
						ints_12[i_13++] = (i_22 & 0x3fc) << 22 | (i_23 & 0x3fc) << 14 | (i_24 & 0x3fc) << 6 | (i_25 & 0x3fc) >> 2;
					}

					i_14 += i_2;
					i_15 += i_2;
				}

				int[] ints_26 = ints_12;
				ints_12 = ints_11;
				ints_11 = ints_26;
				i_2 = i_9;
				i_3 = i_10;
				i_9 >>= 1;
				i_10 >>= 1;
				i_8 >>= 1;
				++i_7;
			}
		}
	}

	void method2378() {
		if (this.anInt1647 > 0) {
			this.aClass505_Sub1_1646.method13625(this.anInt1647, this.method2358());
			this.anInt1647 = 0;
		}

	}

}
