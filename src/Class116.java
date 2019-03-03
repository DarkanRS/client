public class Class116 {

	public static long aLong1259;
	Class250 aClass250_1257 = null;
	int anInt1252 = 0;
	Index aClass317_1253;
	public int anInt1254;
	Class282_Sub15_Sub2 aClass282_Sub15_Sub2_1256;
	Class282_Sub7 aClass282_Sub7_1255;

	Class282_Sub15_Sub2 method1954(int i_1) {
		return this.aClass282_Sub15_Sub2_1256;
	}

	Class282_Sub7 method1955(int i_1) {
		return this.aClass282_Sub7_1255;
	}

	public Class116(Index index_1, int i_2) {
		this.aClass317_1253 = index_1;
		this.anInt1254 = i_2;
		this.aClass282_Sub15_Sub2_1256 = new Class282_Sub15_Sub2();
		this.aClass282_Sub15_Sub2_1256.method15137(9, 128, -1186547906);
	}

	public boolean method1956(int i_1) {
		return this.anInt1252 == 2;
	}

	public boolean method1963(int i_1) {
		Class332.method5929(263587449);
		if (this.anInt1252 == 0) {
			this.aClass282_Sub7_1255 = Class282_Sub7.method12164(this.aClass317_1253, this.anInt1254, 0);
			if (this.aClass282_Sub7_1255 == null) {
				return false;
			}

			this.aClass250_1257 = new Class250(Class148.aClass317_1732, Class148.aClass317_1731);
			this.anInt1252 = 1;
		}

		if (this.anInt1252 == 1) {
			if (!this.aClass282_Sub15_Sub2_1256.method15182(this.aClass282_Sub7_1255, Class148.aClass317_1737, this.aClass250_1257, 22050, 1813033404)) {
				return false;
			}

			this.anInt1252 = 2;
		}

		return true;
	}

	public static boolean method1966(int i_0) {
		return Class148.anInt1730 != 0 ? true : Class148.aClass282_Sub15_Sub2_1735.method15103(1586124800);
	}

	static final void method1967(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Class96_Sub22.method14680(icomponentdefinitions_3, cs2executor_0, -493402778);
	}

	static final void method1968(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub29_8201.method7785(i_2, -225955104);
	}

	public static MeshRasterizer method1969(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5, MeshRasterizer meshrasterizer_6, int i_7, int i_8, int i_9, int i_10, Animation animation_11, int i_12) {
		if (meshrasterizer_6 == null) {
			return null;
		} else {
			int i_13 = 2055;
			if (animation_11 != null) {
				i_13 |= animation_11.method7640(-2080241294);
				i_13 &= ~0x200;
			}

			long long_14 = ((long) i_8 << 48) + ((long) i_7 << 32) + (long) (i_5 + (i_9 << 16) + (i_10 << 24));
			SoftCache softcache_17 = Class13.aClass229_127;
			MeshRasterizer meshrasterizer_16;
			synchronized (Class13.aClass229_127) {
				meshrasterizer_16 = (MeshRasterizer) Class13.aClass229_127.get(long_14);
			}

			if (meshrasterizer_16 == null || graphicalrenderer_0.method8452(meshrasterizer_16.m(), i_13) != 0) {
				if (meshrasterizer_16 != null) {
					i_13 = graphicalrenderer_0.method8546(i_13, meshrasterizer_16.m());
				}

				byte b_30;
				if (i_5 == 1) {
					b_30 = 9;
				} else if (i_5 == 2) {
					b_30 = 12;
				} else if (i_5 == 3) {
					b_30 = 15;
				} else if (i_5 == 4) {
					b_30 = 18;
				} else {
					b_30 = 21;
				}

				byte b_18 = 3;
				int[] ints_19 = new int[] { 64, 96, 128 };
				RSMesh rsmesh_20 = new RSMesh(b_18 * b_30 + 1, b_30 * b_18 * 2 - b_30, 0);
				int i_21 = rsmesh_20.method2662(0, 0, 0);
				int[][] ints_22 = new int[b_18][b_30];

				int i_23;
				int i_24;
				int i_25;
				int i_28;
				for (i_23 = 0; i_23 < b_18; i_23++) {
					i_24 = ints_19[i_23];
					i_25 = ints_19[i_23];

					for (int i_26 = 0; i_26 < b_30; i_26++) {
						int i_27 = (i_26 << 14) / b_30;
						i_28 = Class382.anIntArray4657[i_27] * i_24 >> 14;
						int i_29 = Class382.anIntArray4661[i_27] * i_25 >> 14;
						ints_22[i_23][i_26] = rsmesh_20.method2662(i_28, 0, i_29);
					}
				}

				for (i_23 = 0; i_23 < b_18; i_23++) {
					i_24 = (i_23 * 256 + 128) / b_18;
					i_25 = 256 - i_24;
					byte b_37 = (byte) (i_25 * i_9 + i_10 * i_24 >> 8);
					short s_38 = (short) (((i_8 & 0xfc00) * i_24 + i_25 * (i_7 & 0xfc00) & 0xfc0000) + (i_25 * (i_7 & 0x7f) + i_24 * (i_8 & 0x7f) & 0x7f00) + ((i_7 & 0x380) * i_25 + i_24 * (i_8 & 0x380) & 0x38000) >> 8);

					for (i_28 = 0; i_28 < b_30; i_28++) {
						if (i_23 == 0) {
							rsmesh_20.method2663(i_21, ints_22[0][(i_28 + 1) % b_30], ints_22[0][i_28], (byte) 1, (byte) -1, s_38, b_37, (short) -1);
						} else {
							rsmesh_20.method2663(ints_22[i_23 - 1][i_28], ints_22[i_23 - 1][(i_28 + 1) % b_30], ints_22[i_23][(i_28 + 1) % b_30], (byte) 1, (byte) -1, s_38, b_37, (short) -1);
							rsmesh_20.method2663(ints_22[i_23 - 1][i_28], ints_22[i_23][(i_28 + 1) % b_30], ints_22[i_23][i_28], (byte) 1, (byte) -1, s_38, b_37, (short) -1);
						}
					}
				}

				meshrasterizer_16 = graphicalrenderer_0.createMeshRasterizer(rsmesh_20, i_13, Class13.anInt128, 64, 768);
				SoftCache softcache_31 = Class13.aClass229_127;
				synchronized (Class13.aClass229_127) {
					Class13.aClass229_127.put(meshrasterizer_16, long_14);
				}
			}

			int i_39 = meshrasterizer_6.RA();
			int i_36 = meshrasterizer_6.ya();
			int i_32 = meshrasterizer_6.AA();
			int i_33 = meshrasterizer_6.ha();
			if (animation_11 != null) {
				meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_13, true);
				meshrasterizer_16.oa(i_36 - i_39 >> 1, 128, i_33 - i_32 >> 1);
				meshrasterizer_16.ia(i_36 + i_39 >> 1, 0, i_32 + i_33 >> 1);
				animation_11.method7579(meshrasterizer_16, 1270030336);
			} else {
				meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_13, true);
				meshrasterizer_16.oa(i_36 - i_39 >> 1, 128, i_33 - i_32 >> 1);
				meshrasterizer_16.ia(i_39 + i_36 >> 1, 0, i_32 + i_33 >> 1);
			}

			if (i_2 != 0) {
				meshrasterizer_16.t(i_2);
			}

			if (i_3 != 0) {
				meshrasterizer_16.EA(i_3);
			}

			if (i_4 != 0) {
				meshrasterizer_16.ia(0, i_4, 0);
			}

			return meshrasterizer_16;
		}
	}

}
