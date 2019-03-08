public class Class334 {

	static int[] anIntArray3884 = new int[4];
	int anInt3897;
	int anInt3899;
	NativeSprite aClass160_3910;
	int anInt3902;
	int anInt3911;
	int anInt3896;
	static MeshRasterizer aClass528_3905;
	static NativeSprite aClass160_3912;
	static NativeSprite aClass160_3895;
	int anInt3889;
	int anInt3890;
	int anInt3891;
	boolean aBool3900;
	int anInt3893;
	int anInt3894;
	int anInt3888;
	int anInt3887;
	int anInt3901;
	int anInt3883;
	int anInt3903;

	boolean method5937(GraphicalRenderer graphicalrenderer_1, Class334 class334_2) {
		return this.aClass160_3910 != null || this.method5942(graphicalrenderer_1, class334_2);
	}

	boolean method5938(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		int i_7;
		if (!this.aBool3900) {
			i_5 = this.anInt3889 - i_1;
			i_6 = this.anInt3890 - i_2;
			i_7 = this.anInt3891 - i_3;
			this.anInt3897 = (int) Math.sqrt((double) (i_5 * i_5 + i_6 * i_6 + i_7 * i_7));
			if (this.anInt3897 == 0) {
				this.anInt3897 = 1;
			}

			i_5 = (i_5 << 8) / this.anInt3897;
			i_6 = (i_6 << 8) / this.anInt3897;
			i_7 = (i_7 << 8) / this.anInt3897;
		} else {
			this.anInt3897 = 1073741823;
			i_5 = this.anInt3889;
			i_6 = this.anInt3890;
			i_7 = this.anInt3891;
		}

		int i_8 = (int) (Math.sqrt((double) (i_5 * i_5 + i_6 * i_6 + i_7 * i_7)) * 256.0D);
		if (i_8 > 128) {
			i_5 = (i_5 << 16) / i_8;
			i_6 = (i_6 << 16) / i_8;
			i_7 = (i_7 << 16) / i_8;
			this.anInt3899 = i_4 * this.anInt3888 / (this.aBool3900 ? 1024 : this.anInt3897);
		} else {
			this.anInt3899 = 0;
		}

		if (this.anInt3899 < 8) {
			this.aClass160_3910 = null;
			return false;
		} else {
			int i_9 = Class323.nextPowerOfTwo(this.anInt3899, -191000314);
			if (i_9 > i_4) {
				i_9 = Class51.method1072(i_4, 1488609644);
			}

			if (i_9 > 512) {
				i_9 = 512;
			}

			if (i_9 != this.anInt3902) {
				this.anInt3902 = i_9;
			}

			this.anInt3911 = (int) (Math.asin((double) ((float) i_6 / 256.0F)) * 2607.5945876176133D) & 0x3fff;
			this.anInt3896 = (int) (Math.atan2((double) i_5, (double) (-i_7)) * 2607.5945876176133D) & 0x3fff;
			this.aClass160_3910 = null;
			return true;
		}
	}

	void method5939(GraphicalRenderer graphicalrenderer_1, Class334 class334_2) {
		RSMesh rsmesh_3 = RSMesh.decodeMesh(PaddedJS5Request.aClass317_10379, this.anInt3893, 0);
		if (rsmesh_3 != null) {
			graphicalrenderer_1.qa(anIntArray3884);
			graphicalrenderer_1.r(0, 0, this.anInt3902, this.anInt3902);
			graphicalrenderer_1.ba(2, 0);
			graphicalrenderer_1.B(0, 0, this.anInt3902, this.anInt3902, 0, 0);
			int i_4 = 0;
			int i_5 = 0;
			int i_6 = 256;
			if (class334_2 != null) {
				if (class334_2.aBool3900) {
					i_4 = -class334_2.anInt3889;
					i_5 = -class334_2.anInt3890;
					i_6 = -class334_2.anInt3891;
				} else {
					i_4 = this.anInt3889 - class334_2.anInt3889;
					i_5 = this.anInt3890 - class334_2.anInt3890;
					i_6 = this.anInt3891 - class334_2.anInt3891;
				}
			}

			int i_7;
			int i_8;
			int i_9;
			int i_10;
			if (this.anInt3911 != 0) {
				i_7 = -this.anInt3911 & 0x3fff;
				i_8 = Class382.anIntArray4657[i_7];
				i_9 = Class382.anIntArray4661[i_7];
				i_10 = i_5 * i_9 - i_6 * i_8 >> 14;
				i_6 = i_5 * i_8 + i_6 * i_9 >> 14;
				i_5 = i_10;
			}

			if (this.anInt3896 != 0) {
				i_7 = -this.anInt3896 & 0x3fff;
				i_8 = Class382.anIntArray4657[i_7];
				i_9 = Class382.anIntArray4661[i_7];
				i_10 = i_6 * i_8 + i_4 * i_9 >> 14;
				i_6 = i_6 * i_9 - i_4 * i_8 >> 14;
				i_4 = i_10;
			}

			graphicalrenderer_1.IA(1.0F);
			graphicalrenderer_1.m(this.anInt3894, 1.0F, 1.0F, (float) i_4, (float) i_5, (float) i_6);
			rsmesh_3.method2671(this.anInt3901 & 0x3fff, this.anInt3883 & 0x3fff, this.anInt3903 & 0x3fff);
			MeshRasterizer meshrasterizer_16 = graphicalrenderer_1.createMeshRasterizer(rsmesh_3, 2048, 0, 64, 768);
			i_8 = meshrasterizer_16.ya() - meshrasterizer_16.RA();
			i_9 = meshrasterizer_16.o() - meshrasterizer_16.YA();
			i_10 = i_8 > i_9 ? i_8 : i_9;
			int i_11 = this.anInt3902 * 1024 / i_10;
			Matrix44Arr matrix44arr_12 = graphicalrenderer_1.method8453();
			Matrix44Arr matrix44arr_13 = graphicalrenderer_1.method8449();
			matrix44arr_13.method6532((float) (this.anInt3902 / 2), (float) (this.anInt3902 / 2), (float) i_11, (float) i_11, 50.0F, 50000.0F, (float) graphicalrenderer_1.method8523((byte) 122).method2714(), (float) graphicalrenderer_1.method8523((byte) 112).method2716(), 1024.0F);
			graphicalrenderer_1.method8424(matrix44arr_13);
			Matrix44Var matrix44var_14 = new Matrix44Var();
			graphicalrenderer_1.method8457(matrix44var_14);
			Matrix44Var matrix44var_15 = graphicalrenderer_1.method8450();
			matrix44var_15.method5223(0.0F, 0.0F, (float) (50 - meshrasterizer_16.AA()));
			meshrasterizer_16.method11282(matrix44var_15, (Class275_Sub5) null, 1);
			this.aClass160_3910 = graphicalrenderer_1.method8668(0, 0, this.anInt3902, this.anInt3902, true);
			this.aClass160_3910.method2751(0, 0, 3);
			graphicalrenderer_1.method8424(matrix44arr_12);
			graphicalrenderer_1.r(anIntArray3884[0], anIntArray3884[1], anIntArray3884[2], anIntArray3884[3]);
		}

	}

	static void method5940() {
		aClass528_3905 = null;
		aClass160_3912 = null;
	}

	boolean method5942(GraphicalRenderer graphicalrenderer_1, Class334 class334_2) {
		if (this.aClass160_3910 == null) {
			if (this.anInt3887 == 0) {
				if (Class247.anInterface22_3046.method139(this.anInt3893, -725088114)) {
					int[] ints_3 = Class247.anInterface22_3046.method141(this.anInt3893, 0.7F, this.anInt3902, this.anInt3902, false, 1606527906);
					this.aClass160_3910 = graphicalrenderer_1.createNativeSprite(ints_3, 0, this.anInt3902, this.anInt3902, this.anInt3902, -1804968029);
				}
			} else if (this.anInt3887 == 2) {
				this.method5939(graphicalrenderer_1, class334_2);
			} else if (this.anInt3887 == 1) {
				this.method5944(graphicalrenderer_1, class334_2);
			}
		}

		return this.aClass160_3910 != null;
	}

	static void method5943(GraphicalRenderer graphicalrenderer_0) {
		if (aClass528_3905 == null) {
			RSMesh rsmesh_1 = new RSMesh(580, 1104, 1);
			rsmesh_1.method2664((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			rsmesh_1.method2662(0, 128, 0);
			rsmesh_1.method2662(0, -128, 0);

			for (int i_2 = 0; i_2 <= 24; i_2++) {
				int i_3 = i_2 * 8192 / 24;
				int i_4 = Class382.anIntArray4657[i_3];
				int i_5 = Class382.anIntArray4661[i_3];

				int i_6;
				int i_7;
				int i_8;
				int i_9;
				int i_10;
				for (i_6 = 1; i_6 < 24; i_6++) {
					i_7 = i_6 * 8192 / 24;
					i_8 = Class382.anIntArray4661[i_7] >> 7;
					i_9 = Class382.anIntArray4657[i_7] * i_4 >> 21;
					i_10 = Class382.anIntArray4657[i_7] * i_5 >> 21;
					rsmesh_1.method2662(i_10, i_8, -i_9);
				}

				if (i_2 > 0) {
					i_6 = i_2 * 23 + 2;
					i_7 = i_6 - 23;
					rsmesh_1.method2663(0, i_7, i_6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);

					for (i_8 = 1; i_8 < 23; i_8++) {
						i_9 = i_7 + 1;
						i_10 = i_6 + 1;
						rsmesh_1.method2663(i_7, i_9, i_6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						rsmesh_1.method2663(i_9, i_10, i_6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_7 = i_9;
						i_6 = i_10;
					}

					rsmesh_1.method2663(i_6, i_7, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}

			rsmesh_1.anInt1999 = rsmesh_1.vertexCount;
			rsmesh_1.skinValues = null;
			rsmesh_1.vertexSkins = null;
			rsmesh_1.facePriorities = null;
			aClass528_3905 = graphicalrenderer_0.createMeshRasterizer(rsmesh_1, 51200, 33, 64, 768);
		}

	}

	void method5944(GraphicalRenderer graphicalrenderer_1, Class334 class334_2) {
		method5943(graphicalrenderer_1);
		method5946(graphicalrenderer_1);
		graphicalrenderer_1.qa(anIntArray3884);
		graphicalrenderer_1.r(0, 0, this.anInt3902, this.anInt3902);
		graphicalrenderer_1.ba(2, 0);
		graphicalrenderer_1.B(0, 0, this.anInt3902, this.anInt3902, ~0xffffff | this.anInt3894, 0);
		int i_3 = 0;
		int i_4 = 0;
		int i_5 = 256;
		if (class334_2 != null) {
			if (class334_2.aBool3900) {
				i_3 = -class334_2.anInt3889;
				i_4 = -class334_2.anInt3890;
				i_5 = -class334_2.anInt3891;
			} else {
				i_3 = class334_2.anInt3889 - this.anInt3889;
				i_4 = class334_2.anInt3890 - this.anInt3890;
				i_5 = class334_2.anInt3891 - this.anInt3891;
			}
		}

		int i_6;
		int i_7;
		int i_8;
		if (this.anInt3911 != 0) {
			i_6 = Class382.anIntArray4657[this.anInt3911];
			i_7 = Class382.anIntArray4661[this.anInt3911];
			i_8 = i_4 * i_7 - i_5 * i_6 >> 14;
			i_5 = i_4 * i_6 + i_5 * i_7 >> 14;
			i_4 = i_8;
		}

		if (this.anInt3896 != 0) {
			i_6 = Class382.anIntArray4657[this.anInt3896];
			i_7 = Class382.anIntArray4661[this.anInt3896];
			i_8 = i_5 * i_6 + i_3 * i_7 >> 14;
			i_5 = i_5 * i_7 - i_3 * i_6 >> 14;
			i_3 = i_8;
		}

		MeshRasterizer meshrasterizer_13 = aClass528_3905.method11289((byte) 0, 51200, true);
		meshrasterizer_13.W((short) 0, (short) this.anInt3893);
		graphicalrenderer_1.IA(1.0F);
		graphicalrenderer_1.m(16777215, 1.0F, 1.0F, (float) i_3, (float) i_4, (float) i_5);
		i_7 = this.anInt3902 * 1024 / (meshrasterizer_13.ya() - meshrasterizer_13.RA());
		if (this.anInt3894 != 0) {
			i_7 = i_7 * 13 / 16;
		}

		Matrix44Arr matrix44arr_14 = graphicalrenderer_1.method8453();
		Matrix44Arr matrix44arr_9 = graphicalrenderer_1.method8449();
		matrix44arr_9.method6532((float) (this.anInt3902 / 2), (float) (this.anInt3902 / 2), (float) i_7, (float) i_7, 50.0F, 50000.0F, (float) graphicalrenderer_1.method8523((byte) 109).method2714(), (float) graphicalrenderer_1.method8523((byte) 103).method2716(), 1024.0F);
		graphicalrenderer_1.method8424(matrix44arr_9);
		graphicalrenderer_1.method8457(new Matrix44Var());
		Matrix44Var matrix44var_10 = new Matrix44Var();
		matrix44var_10.method5223(0.0F, 0.0F, (float) (50 - meshrasterizer_13.AA()));
		meshrasterizer_13.method11282(matrix44var_10, (Class275_Sub5) null, 1);
		int i_11 = this.anInt3902 * 13 / 16;
		int i_12 = (this.anInt3902 - i_11) / 2;
		aClass160_3895.method2754(i_12, i_12, i_11, i_11, 0, ~0xffffff | this.anInt3894, 1);
		this.aClass160_3910 = graphicalrenderer_1.method8668(0, 0, this.anInt3902, this.anInt3902, true);
		graphicalrenderer_1.ba(2, 0);
		graphicalrenderer_1.B(0, 0, this.anInt3902, this.anInt3902, 0, 0);
		aClass160_3912.method2754(0, 0, this.anInt3902, this.anInt3902, 1, 0, 0);
		this.aClass160_3910.method2751(0, 0, 3);
		graphicalrenderer_1.method8424(matrix44arr_14);
		graphicalrenderer_1.r(anIntArray3884[0], anIntArray3884[1], anIntArray3884[2], anIntArray3884[3]);
	}

	static void method5946(GraphicalRenderer graphicalrenderer_0) {
		if (aClass160_3912 == null) {
			int[] ints_1 = new int[16384];
			int[] ints_2 = new int[16384];

			for (int i_3 = 0; i_3 < 64; i_3++) {
				int i_4 = 64 - i_3;
				i_4 *= i_4;
				int i_5 = 128 - i_3 - 1;
				int i_6 = i_3 * 128;
				int i_7 = i_5 * 128;

				for (int i_8 = 0; i_8 < 64; i_8++) {
					int i_9 = 64 - i_8;
					i_9 *= i_9;
					int i_10 = 128 - i_8 - 1;
					int i_11 = 256 - (i_9 + i_4 << 8) / 4096;
					i_11 = i_11 * 3072 / 1536;
					if (i_11 < 0) {
						i_11 = 0;
					} else if (i_11 > 255) {
						i_11 = 255;
					}

					int i_12 = i_11 / 2;
					ints_2[i_6 + i_8] = ints_2[i_6 + i_10] = ints_2[i_7 + i_8] = ints_2[i_7 + i_10] = ~0xffffff | i_11 << 16;
					ints_1[i_6 + i_8] = ints_1[i_6 + i_10] = ints_1[i_7 + i_8] = ints_1[i_7 + i_10] = 127 - i_12 << 24 | 0xffffff;
				}
			}

			aClass160_3912 = graphicalrenderer_0.createNativeSprite(ints_2, 0, 128, 128, 128, -1206625053);
			aClass160_3895 = graphicalrenderer_0.createNativeSprite(ints_1, 0, 128, 128, 128, 501003044);
		}

	}

	void method5955(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
		if (this.aClass160_3910 != null) {
			float[] floats_12 = new float[3];
			float f_13 = (float) (-(this.anInt3889 - i_8 << 16));
			float f_14 = (float) (this.anInt3890 - i_9 << 15);
			float f_15 = (float) (-(this.anInt3891 - i_10 << 16));
			float[] floats_16 = new float[3];
			graphicalrenderer_1.method8458().method5231(floats_16);
			f_13 += floats_16[0];
			f_14 += floats_16[1];
			f_15 += floats_16[2];
			graphicalrenderer_1.method8479(f_13, f_14, f_15, floats_12);
			if (floats_12[2] >= 0.0F) {
				int i_17 = (int) (floats_12[0] - (float) (this.anInt3899 / 2));
				int i_18 = (int) (floats_12[1] - (float) (this.anInt3899 / 2));
				if (i_18 < i_5 && i_18 + this.anInt3899 > 0 && i_17 < i_4 && i_17 + this.anInt3899 > 0) {
					this.aClass160_3910.method2754(i_17, i_18, this.anInt3899, this.anInt3899, 0, i_11 << 24 | 0xffffff, 1);
				}
			}
		}

	}

	public Class334(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8, int i_9, int i_10, int i_11) {
		this.anInt3889 = i_3;
		this.anInt3890 = i_4;
		this.anInt3891 = i_5;
		this.aBool3900 = bool_8;
		this.anInt3893 = i_2;
		this.anInt3894 = i_7;
		this.anInt3888 = i_6;
		this.anInt3887 = i_1;
		this.anInt3901 = i_9;
		this.anInt3883 = i_10;
		this.anInt3903 = i_11;
	}

}
