import java.awt.Frame;

public class Class329 {

	public byte[][][] aByteArrayArrayArray3788;
	static int[] OVERLAY_FACE_COUNT = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	static int[] UNDERLAY_FACE_COUNT = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
	static int[] anIntArray3826 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	static int[] anIntArray3847 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
	static int[] anIntArray3778 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	static int[] anIntArray3819 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
	static int[] anIntArray3811 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
	static int[] anIntArray3800 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
	static boolean[][] aBoolArrayArray3822 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };
	static boolean[][] aBoolArrayArray3823 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };
	static int[][] anIntArrayArray3824 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
	static int[][] anIntArrayArray3860 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
	static int[][] anIntArrayArray3815 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
	static boolean[][] aBoolArrayArray3816 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
	static int[][] anIntArrayArray3828 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
	static int[][] anIntArrayArray3774 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
	static int[][] anIntArrayArray3830 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
	static int[][] anIntArrayArray3831 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
	static boolean[][] aBoolArrayArray3793 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };
	static int[][] anIntArrayArray3833 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
	static int[][] anIntArrayArray3775 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
	static int[][] anIntArrayArray3821 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
	static int[][] anIntArrayArray3836 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	protected boolean aBool3773;
	int[] anIntArray3795;
	int[] anIntArray3796;
	int[] anIntArray3797;
	int[] anIntArray3798;
	int[] anIntArray3799;
	int underlayFaceCount;
	int overlayFaceCount;
	int anInt3781;
	int anInt3848;
	int anInt3844;
	boolean aBool3851;
	boolean aBool3810;
	boolean aBool3853;
	int anInt3846 = 0;
	int anInt3852 = 0;
	int[] anIntArray3857;
	int[] anIntArray3858;
	int[] anIntArray3859;
	int[] anIntArray3832 = null;
	int anInt3850;
	int anInt3849;
	public int anInt3809 = 0;
	public boolean highDetailWater = false;
	public boolean aBool3780 = false;
	public boolean aBool3820 = false;
	public boolean aBool3782 = false;
	int[] anIntArray3837 = new int[6];
	int[] anIntArray3838 = new int[13];
	int[] anIntArray3839 = new int[13];
	int[] anIntArray3813 = new int[13];
	int[] anIntArray3827 = new int[13];
	int[] anIntArray3842 = new int[13];
	int[] anIntArray3843 = new int[13];
	protected SceneObjectManager aClass206_3776;
	public int anInt3845;
	protected int maxX;
	protected int maxY;
	public boolean overlayHidden;
	Class536 aClass536_3834;
	UnderlayIndexLoader aClass479_3789;
	protected RegionMap regionMap;
	byte[][][] underlayIds;
	byte[][][] overlayIds;
	byte[][][] overlayPathShapes;
	byte[][][] overlayRotations;
	public int[][][] tileHeights;
	protected byte[][][] aByteArrayArrayArray3794;
	boolean aBool3854;

	public void method5835(int i_1) {
		this.aBool3773 = true;
	}

	public final void method5837(GraphicalRenderer graphicalrenderer_1, Ground class390_2, Ground class390_3, int i_4) {
		int[][] ints_5 = new int[this.maxX][this.maxY];
		if (this.anIntArray3795 == null || this.anIntArray3795.length != this.maxY) {
			this.anIntArray3795 = new int[this.maxY];
			this.anIntArray3796 = new int[this.maxY];
			this.anIntArray3797 = new int[this.maxY];
			this.anIntArray3798 = new int[this.maxY];
			this.anIntArray3799 = new int[this.maxY];
		}

		int i_6;
		for (i_6 = 0; i_6 < this.anInt3845; i_6++) {
			int i_7;
			for (i_7 = 0; i_7 < this.maxY; i_7++) {
				this.anIntArray3795[i_7] = 0;
				this.anIntArray3796[i_7] = 0;
				this.anIntArray3797[i_7] = 0;
				this.anIntArray3798[i_7] = 0;
				this.anIntArray3799[i_7] = 0;
			}

			for (i_7 = -5; i_7 < this.maxX; i_7++) {
				int i_8;
				int i_9;
				int i_10;
				int i_11;
				for (i_8 = 0; i_8 < this.maxY; i_8++) {
					i_9 = i_7 + 5;
					if (i_9 < this.maxX) {
						i_10 = this.underlayIds[i_6][i_9][i_8] & 0xff;
						if (i_10 > 0) {
							UnderlayDef underlaydef_16 = this.aClass479_3789.getUnderlayDef(i_10 - 1, (byte) -26);
							this.anIntArray3795[i_8] += underlaydef_16.r;
							this.anIntArray3796[i_8] += underlaydef_16.g;
							this.anIntArray3797[i_8] += underlaydef_16.b;
							this.anIntArray3798[i_8] += underlaydef_16.a;
							++this.anIntArray3799[i_8];
						}
					}

					i_10 = i_7 - 5;
					if (i_10 >= 0) {
						i_11 = this.underlayIds[i_6][i_10][i_8] & 0xff;
						if (i_11 > 0) {
							UnderlayDef underlaydef_17 = this.aClass479_3789.getUnderlayDef(i_11 - 1, (byte) -111);
							this.anIntArray3795[i_8] -= underlaydef_17.r;
							this.anIntArray3796[i_8] -= underlaydef_17.g;
							this.anIntArray3797[i_8] -= underlaydef_17.b;
							this.anIntArray3798[i_8] -= underlaydef_17.a;
							--this.anIntArray3799[i_8];
						}
					}
				}

				if (i_7 >= 0) {
					i_8 = 0;
					i_9 = 0;
					i_10 = 0;
					i_11 = 0;
					int i_12 = 0;

					for (int i_13 = -5; i_13 < this.maxY; i_13++) {
						int i_14 = i_13 + 5;
						if (i_14 < this.maxY) {
							i_8 += this.anIntArray3795[i_14];
							i_9 += this.anIntArray3796[i_14];
							i_10 += this.anIntArray3797[i_14];
							i_11 += this.anIntArray3798[i_14];
							i_12 += this.anIntArray3799[i_14];
						}

						int i_15 = i_13 - 5;
						if (i_15 >= 0) {
							i_8 -= this.anIntArray3795[i_15];
							i_9 -= this.anIntArray3796[i_15];
							i_10 -= this.anIntArray3797[i_15];
							i_11 -= this.anIntArray3798[i_15];
							i_12 -= this.anIntArray3799[i_15];
						}

						if (i_13 >= 0 && i_11 > 0 && i_12 > 0) {
							ints_5[i_7][i_13] = Class371.method6348(i_8 * 256 / i_11, i_9 / i_12, i_10 / i_12, -432025079);
						}
					}
				}
			}

			if (this.aBool3820) {
				this.method5846(graphicalrenderer_1, this.aClass206_3776.aClass390Array2591[i_6], i_6, ints_5, i_6 == 0 ? class390_2 : null, i_6 == 0 ? class390_3 : null, (byte) 4);
			} else {
				this.method5845(graphicalrenderer_1, this.aClass206_3776.aClass390Array2591[i_6], i_6, ints_5, i_6 == 0 ? class390_2 : null, i_6 == 0 ? class390_3 : null, (byte) 1);
			}

			this.underlayIds[i_6] = null;
			this.overlayIds[i_6] = null;
			this.overlayPathShapes[i_6] = null;
			this.overlayRotations[i_6] = null;
		}

		if (!this.overlayHidden) {
			if (this.anInt3809 != 0) {
				this.aClass206_3776.method3429(1532483847);
			}

			if (this.aBool3780) {
				this.aClass206_3776.method3431(1204197709);
			}
		}

		for (i_6 = 0; i_6 < this.anInt3845; i_6++) {
			this.aClass206_3776.aClass390Array2591[i_6].SA();
		}

	}

	public final void method5838(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7;
		for (i_7 = i_3; i_7 < i_3 + i_5; i_7++) {
			for (int i_8 = i_2; i_8 < i_2 + i_4; i_8++) {
				if (i_8 >= 0 && i_8 < this.maxX && i_7 >= 0 && i_7 < this.maxY) {
					this.tileHeights[i_1][i_8][i_7] = i_1 > 0 ? this.tileHeights[i_1 - 1][i_8][i_7] - 960 : 0;
				}
			}
		}

		if (i_2 > 0 && i_2 < this.maxX) {
			for (i_7 = i_3 + 1; i_7 < i_3 + i_5; i_7++) {
				if (i_7 >= 0 && i_7 < this.maxY) {
					this.tileHeights[i_1][i_2][i_7] = this.tileHeights[i_1][i_2 - 1][i_7];
				}
			}
		}

		if (i_3 > 0 && i_3 < this.maxY) {
			for (i_7 = i_2 + 1; i_7 < i_2 + i_4; i_7++) {
				if (i_7 >= 0 && i_7 < this.maxX) {
					this.tileHeights[i_1][i_7][i_3] = this.tileHeights[i_1][i_7][i_3 - 1];
				}
			}
		}

		if (i_2 >= 0 && i_3 >= 0 && i_2 < this.maxX && i_3 < this.maxY) {
			if (i_1 == 0) {
				if (i_2 > 0 && this.tileHeights[i_1][i_2 - 1][i_3] != 0) {
					this.tileHeights[i_1][i_2][i_3] = this.tileHeights[i_1][i_2 - 1][i_3];
				} else if (i_3 > 0 && this.tileHeights[i_1][i_2][i_3 - 1] != 0) {
					this.tileHeights[i_1][i_2][i_3] = this.tileHeights[i_1][i_2][i_3 - 1];
				} else if (i_2 > 0 && i_3 > 0 && this.tileHeights[i_1][i_2 - 1][i_3 - 1] != 0) {
					this.tileHeights[i_1][i_2][i_3] = this.tileHeights[i_1][i_2 - 1][i_3 - 1];
				}
			} else if (i_2 > 0 && this.tileHeights[i_1 - 1][i_2 - 1][i_3] != this.tileHeights[i_1][i_2 - 1][i_3]) {
				this.tileHeights[i_1][i_2][i_3] = this.tileHeights[i_1][i_2 - 1][i_3];
			} else if (i_3 > 0 && this.tileHeights[i_1][i_2][i_3 - 1] != this.tileHeights[i_1 - 1][i_2][i_3 - 1]) {
				this.tileHeights[i_1][i_2][i_3] = this.tileHeights[i_1][i_2][i_3 - 1];
			} else if (i_2 > 0 && i_3 > 0 && this.tileHeights[i_1 - 1][i_2 - 1][i_3 - 1] != this.tileHeights[i_1][i_2 - 1][i_3 - 1]) {
				this.tileHeights[i_1][i_2][i_3] = this.tileHeights[i_1][i_2 - 1][i_3 - 1];
			}
		}

	}

	public final void decodeTileMasksUnderlay(RsByteBuffer rsbytebuffer_1, int i_2, int i_3, int i_4, int i_5, ClipMap[] arr_6, byte b_7) {
		int i_8;
		int i_10;
		int i_11;
		int i_12;
		if (!this.overlayHidden) {
			for (i_8 = 0; i_8 < 4; i_8++) {
				ClipMap clipmap_14 = arr_6[i_8];

				for (i_10 = 0; i_10 < 64; i_10++) {
					for (i_11 = 0; i_11 < 64; i_11++) {
						i_12 = i_10 + i_2;
						int i_13 = i_3 + i_11;
						if (i_12 >= 0 && i_12 < this.maxX && i_13 >= 0 && i_13 < this.maxY) {
							clipmap_14.method5974(i_12, i_13, 1933302120);
						}
					}
				}
			}
		}

		i_8 = i_2 + i_4;
		int i_9 = i_3 + i_5;

		for (i_10 = 0; i_10 < this.anInt3845; i_10++) {
			for (i_11 = 0; i_11 < 64; i_11++) {
				for (i_12 = 0; i_12 < 64; i_12++) {
					this.decodeTileMasks(rsbytebuffer_1, i_10, i_11 + i_2, i_3 + i_12, 0, 0, i_8 + i_11, i_12 + i_9, 0, false, 116410177);
				}
			}
		}

	}

	public final void method5841(RsByteBuffer rsbytebuffer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, ClipMap[] arr_9, int i_10) {
		int i_11 = (i_6 & 0x7) * 8;
		int i_12 = (i_7 & 0x7) * 8;
		int i_14;
		int i_17;
		if (!this.overlayHidden) {
			ClipMap clipmap_13 = arr_9[i_2];

			for (i_14 = 0; i_14 < 8; i_14++) {
				for (int i_15 = 0; i_15 < 8; i_15++) {
					int i_16 = i_3 + Class112.method1871(i_14 & 0x7, i_15 & 0x7, i_8, 1449989045);
					i_17 = i_4 + Class2.method259(i_14 & 0x7, i_15 & 0x7, i_8, 97423682);
					if (i_16 > 0 && i_16 < this.maxX - 1 && i_17 > 0 && i_17 < this.maxY - 1) {
						clipmap_13.method5974(i_16, i_17, 1933302120);
					}
				}
			}
		}

		int i_28 = (i_6 & ~0x7) << 3;
		i_14 = (i_7 & ~0x7) << 3;
		byte b_29 = 0;
		byte b_30 = 0;
		if (i_8 == 1) {
			b_30 = 1;
		} else if (i_8 == 2) {
			b_29 = 1;
			b_30 = 1;
		} else if (i_8 == 3) {
			b_29 = 1;
		}

		for (i_17 = 0; i_17 < this.anInt3845; i_17++) {
			for (int i_18 = 0; i_18 < 64; i_18++) {
				for (int i_19 = 0; i_19 < 64; i_19++) {
					if (i_5 == i_17 && i_18 >= i_11 && i_18 <= i_11 + 8 && i_19 >= i_12 && i_19 <= i_12 + 8) {
						int i_20;
						int i_21;
						if (i_18 != i_11 + 8 && i_12 + 8 != i_19) {
							i_20 = i_3 + Class112.method1871(i_18 & 0x7, i_19 & 0x7, i_8, 1449989045);
							i_21 = i_4 + Class2.method259(i_18 & 0x7, i_19 & 0x7, i_8, 656585016);
							this.decodeTileMasks(rsbytebuffer_1, i_2, i_20, i_21, b_29, b_30, i_28 + i_18, i_14 + i_19, i_8, false, -310142187);
						} else {
							if (i_8 == 0) {
								i_20 = i_3 + (i_18 - i_11);
								i_21 = i_19 - i_12 + i_4;
							} else if (i_8 == 1) {
								i_20 = i_3 + (i_19 - i_12);
								i_21 = i_4 + 8 - (i_18 - i_11);
							} else if (i_8 == 2) {
								i_20 = i_3 + 8 - (i_18 - i_11);
								i_21 = i_4 + 8 - (i_19 - i_12);
							} else {
								i_20 = i_3 + 8 - (i_19 - i_12);
								i_21 = i_18 - i_11 + i_4;
							}

							this.decodeTileMasks(rsbytebuffer_1, i_2, i_20, i_21, 0, 0, i_28 + i_18, i_14 + i_19, 0, true, 1122422835);
						}

						if (i_18 == 63 || i_19 == 63) {
							byte b_22 = 1;
							if (i_18 == 63 && i_19 == 63) {
								b_22 = 3;
							}

							for (int i_23 = 0; i_23 < b_22; i_23++) {
								int i_24 = i_18;
								int i_25 = i_19;
								if (i_23 == 0) {
									i_24 = i_18 == 63 ? 64 : i_18;
									i_25 = i_19 == 63 ? 64 : i_19;
								} else if (i_23 == 1) {
									i_24 = 64;
								} else if (i_23 == 2) {
									i_25 = 64;
								}

								int i_26;
								int i_27;
								if (i_8 == 0) {
									i_26 = i_3 + (i_24 - i_11);
									i_27 = i_25 - i_12 + i_4;
								} else if (i_8 == 1) {
									i_26 = i_3 + (i_25 - i_12);
									i_27 = i_4 + 8 - (i_24 - i_11);
								} else if (i_8 == 2) {
									i_26 = i_3 + 8 - (i_24 - i_11);
									i_27 = i_4 + 8 - (i_25 - i_12);
								} else {
									i_26 = i_3 + 8 - (i_25 - i_12);
									i_27 = i_24 - i_11 + i_4;
								}

								if (i_26 >= 0 && i_26 < this.maxX && i_27 >= 0 && i_27 < this.maxY) {
									this.tileHeights[i_2][i_26][i_27] = this.tileHeights[i_2][i_20 + b_29][b_30 + i_21];
								}
							}
						}
					} else {
						this.decodeTileMasks(rsbytebuffer_1, 0, -1, -1, 0, 0, 0, 0, 0, false, 56162627);
					}
				}
			}
		}

	}

	public void initClipMap(GraphicalRenderer graphicalrenderer_1, int[][][] ints_2, ClipMap[] arr_3, byte b_4) {
		int i_5;
		int i_6;
		int i_7;
		if (!this.overlayHidden) {
			for (i_5 = 0; i_5 < 4; i_5++) {
				for (i_6 = 0; i_6 < this.maxX; i_6++) {
					for (i_7 = 0; i_7 < this.maxY; i_7++) {
						if ((this.regionMap.tileMasks[i_5][i_6][i_7] & 0x1) != 0) {
							int i_9 = i_5;
							if ((this.regionMap.tileMasks[1][i_6][i_7] & 0x2) != 0) {
								i_9 = i_5 - 1;
							}

							if (i_9 >= 0) {
								arr_3[i_9].addUnwalkable(i_6, i_7, 16711935);
							}
						}
					}
				}
			}
		}

		for (i_5 = 0; i_5 < this.anInt3845; i_5++) {
			i_6 = 0;
			i_7 = 0;
			if (!this.overlayHidden) {
				if (this.highDetailWater) {
					i_7 |= 0x8;
				}

				if (this.aBool3780) {
					i_6 |= 0x2;
				}

				if (this.anInt3809 != 0) {
					i_6 |= 0x1;
					i_7 |= 0x10;
				}
			}

			if (this.aBool3780) {
				i_7 |= 0x7;
			}

			if (!this.aBool3782) {
				i_7 |= 0x20;
			}

			int[][] ints_8 = ints_2 != null && i_5 < ints_2.length ? ints_2[i_5] : this.tileHeights[i_5];
			this.aClass206_3776.method3385(i_5, graphicalrenderer_1.createGround(this.maxX, this.maxY, this.tileHeights[i_5], ints_8, 512, i_6, i_7), 322492568);
		}

	}

	void method5845(GraphicalRenderer renderer, Ground ground, int plane, int[][] ints_4, Ground class390_5, Ground class390_6, byte b_7) {
		for (int x = 0; x < this.maxX; x++) {
			for (int y = 0; y < this.maxY; y++) {
				byte pathShape = this.overlayPathShapes[plane][x][y];
				byte pathRotation = this.overlayRotations[plane][x][y];
				int overlayId = this.overlayIds[plane][x][y] & 0xff;
				int underlayId = this.underlayIds[plane][x][y] & 0xff;
				OverlayDef overlay = overlayId != 0 ? this.aClass536_3834.getOverlayDef(overlayId - 1, (byte) 0) : null;
				UnderlayDef underlay = underlayId != 0 ? this.aClass479_3789.getUnderlayDef(underlayId - 1, (byte) -14) : null;
				if (pathShape == 0 && overlay == null) {
					pathShape = 12;
				}

				OverlayDef overlaydef_16 = overlay;
				if (overlay != null && overlay.primaryRGB == -1 && overlay.secondaryRGB == -1) {
					overlaydef_16 = overlay;
					overlay = null;
				}

				if (overlay != null || underlay != null) {
					this.underlayFaceCount = UNDERLAY_FACE_COUNT[pathShape];
					this.overlayFaceCount = OVERLAY_FACE_COUNT[pathShape];
					int i_17 = (underlay != null ? this.underlayFaceCount : 0) + (overlay != null ? this.overlayFaceCount : 0);
					int i_18 = 0;
					this.anInt3781 = 0;
					this.anInt3848 = overlay != null ? overlay.texture : -1;
					int i_19 = underlay != null ? underlay.texture : -1;
					int[] ints_20 = new int[i_17];
					int[] ints_21 = new int[i_17];
					int[] ints_22 = new int[i_17];
					int[] ints_23 = new int[i_17];
					int[] ints_24 = new int[i_17];
					int[] ints_25 = new int[i_17];
					int[] ints_26 = overlay != null && overlay.secondaryRGB != -1 ? new int[i_17] : null;
					int i_27;
					if (overlay != null) {
						for (i_27 = 0; i_27 < this.overlayFaceCount; i_27++) {
							ints_20[i_18] = anIntArrayArray3824[pathShape][this.anInt3781];
							ints_21[i_18] = anIntArrayArray3860[pathShape][this.anInt3781];
							ints_22[i_18] = anIntArrayArray3815[pathShape][this.anInt3781];
							ints_24[i_18] = this.anInt3848;
							ints_25[i_18] = overlay.anInt7057;
							ints_23[i_18] = overlay.primaryRGB;
							if (ints_26 != null) {
								ints_26[i_18] = overlay.secondaryRGB;
							}

							++i_18;
							++this.anInt3781;
						}

						if (!this.overlayHidden && plane == 0) {
							this.aClass206_3776.method3392(x, y, overlay.waterColour, overlay.waterScale, overlay.waterIntensity, overlay.anInt7065, overlay.anInt7055, overlay.anInt7067, (short) -10476);
						}
					} else {
						this.anInt3781 += this.overlayFaceCount;
					}

					if (underlay != null) {
						for (i_27 = 0; i_27 < this.underlayFaceCount; i_27++) {
							ints_20[i_18] = anIntArrayArray3824[pathShape][this.anInt3781];
							ints_21[i_18] = anIntArrayArray3860[pathShape][this.anInt3781];
							ints_22[i_18] = anIntArrayArray3815[pathShape][this.anInt3781];
							ints_24[i_18] = i_19;
							ints_25[i_18] = underlay.scale;
							ints_23[i_18] = ints_4[x][y];
							if (ints_26 != null) {
								ints_26[i_18] = ints_23[i_18];
							}

							++i_18;
							++this.anInt3781;
						}
					}

					i_27 = anIntArray3811.length;
					int[] ints_28 = new int[i_27];
					int[] ints_29 = new int[i_27];
					int[] ints_30 = class390_6 != null ? new int[i_27] : null;
					int[] ints_31 = class390_6 == null && class390_5 == null ? null : new int[i_27];

					int i_32;
					int i_33;
					int i_34;
					int i_35;
					for (i_32 = 0; i_32 < i_27; i_32++) {
						i_33 = anIntArray3811[i_32];
						i_34 = anIntArray3800[i_32];
						if (pathRotation == 0) {
							ints_28[i_32] = i_33;
							ints_29[i_32] = i_34;
						} else if (pathRotation == 1) {
							ints_28[i_32] = i_34;
							ints_29[i_32] = 512 - i_33;
						} else if (pathRotation == 2) {
							ints_28[i_32] = 512 - i_33;
							ints_29[i_32] = 512 - i_34;
						} else if (pathRotation == 3) {
							ints_28[i_32] = 512 - i_34;
							ints_29[i_32] = i_33;
						}

						int i_36;
						if (ints_30 != null && aBoolArrayArray3822[pathShape][i_32]) {
							i_35 = (x << 9) + ints_28[i_32];
							i_36 = (y << 9) + ints_29[i_32];
							ints_30[i_32] = class390_6.averageHeight(i_35, i_36, 1611134572) - ground.averageHeight(i_35, i_36, -1090922483);
						}

						if (ints_31 != null) {
							if (class390_6 != null && !aBoolArrayArray3822[pathShape][i_32]) {
								i_35 = (x << 9) + ints_28[i_32];
								i_36 = (y << 9) + ints_29[i_32];
								ints_31[i_32] = ground.averageHeight(i_35, i_36, 1460513028) - class390_6.averageHeight(i_35, i_36, -2104579941);
							} else if (class390_5 != null && !aBoolArrayArray3823[pathShape][i_32]) {
								i_35 = (x << 9) + ints_28[i_32];
								i_36 = (y << 9) + ints_29[i_32];
								ints_31[i_32] = class390_5.averageHeight(i_35, i_36, -896694521) - ground.averageHeight(i_35, i_36, 1289574118);
							}
						}
					}

					i_32 = ground.method6722(x, y, 65280);
					i_33 = ground.method6722(x + 1, y, 65280);
					i_34 = ground.method6722(x + 1, y + 1, 65280);
					i_35 = ground.method6722(x, y + 1, 65280);
					boolean bool_39 = this.regionMap.is0x2(x, y, 1772345202);
					if (bool_39 && plane > 1 || !bool_39 && plane > 0) {
						boolean bool_37 = true;
						if (underlay != null && !underlay.aBool5722) {
							bool_37 = false;
						} else if (underlayId == 0 && pathShape != 0) {
							bool_37 = false;
						} else if (overlayId > 0 && overlaydef_16 != null && !overlaydef_16.aBool7056) {
							bool_37 = false;
						}

						if (bool_37 && i_32 == i_33 && i_32 == i_34 && i_32 == i_35) {
							this.aByteArrayArrayArray3794[plane][x][y] = (byte) (this.aByteArrayArrayArray3794[plane][x][y] | 0x4);
						}
					}

					Class90 class90_38 = new Class90();
					if (this.overlayHidden) {
						class90_38.color = this.aClass206_3776.getColor(x, y, (byte) 110);
						class90_38.scale = this.aClass206_3776.getScale(x, y, 2091764285);
						class90_38.intensity = this.aClass206_3776.getIntensities(x, y, -575094789);
						class90_38.anInt949 = this.aClass206_3776.method3432(x, y, (byte) 1);
						class90_38.anInt950 = this.aClass206_3776.method3464(x, y, -989916176);
						class90_38.anInt951 = this.aClass206_3776.method3391(x, y, 2086149647);
					}

					ground.method6708(x, y, ints_28, ints_30, ints_29, ints_31, ints_20, ints_21, ints_22, ints_23, ints_26, ints_24, ints_25, class90_38, false);
					this.aClass206_3776.method3384(plane, x, y, (byte) 44);
				}
			}
		}

	}

	void method5846(GraphicalRenderer graphicalrenderer_1, Ground class390_2, int i_3, int[][] ints_4, Ground class390_5, Ground class390_6, byte b_7) {
		byte[][] bytes_8 = this.overlayPathShapes[i_3];
		byte[][] bytes_9 = this.overlayRotations[i_3];
		byte[][] bytes_10 = this.underlayIds[i_3];
		byte[][] bytes_11 = this.overlayIds[i_3];
		boolean[] bools_12 = new boolean[4];

		for (int i_13 = 0; i_13 < this.maxX; i_13++) {
			int i_14 = i_13 < this.maxX - 1 ? i_13 + 1 : i_13;

			for (int i_15 = 0; i_15 < this.maxY; i_15++) {
				int i_16 = i_15 < this.maxY - 1 ? i_15 + 1 : i_15;
				this.anInt3844 = bytes_8[i_13][i_15];
				this.anInt3781 = bytes_9[i_13][i_15];
				int overlayId = bytes_11[i_13][i_15] & 0xff;
				int underlayId = bytes_10[i_13][i_15] & 0xff;
				if (overlayId != 0 || underlayId != 0) {
					OverlayDef overlaydef_19 = overlayId != 0 ? this.aClass536_3834.getOverlayDef(overlayId - 1, (byte) 0) : null;
					UnderlayDef underlaydef_20 = underlayId != 0 ? this.aClass479_3789.getUnderlayDef(underlayId - 1, (byte) -6) : null;
					if (this.anInt3844 == 0 && overlaydef_19 == null) {
						this.anInt3844 = 12;
					}

					this.aBool3851 = false;
					this.aBool3810 = false;
					bools_12[3] = false;
					bools_12[2] = false;
					bools_12[1] = false;
					bools_12[0] = false;
					OverlayDef overlaydef_24 = overlaydef_19;
					if (overlaydef_19 != null) {
						if (overlaydef_19.primaryRGB == -1 && overlaydef_19.secondaryRGB == -1) {
							overlaydef_24 = overlaydef_19;
							overlaydef_19 = null;
						} else if (underlaydef_20 != null && this.anInt3844 != 0) {
							this.aBool3810 = overlaydef_19.aBool7061;
						}
					}

					this.anInt3781 = this.method5870(underlayId, i_13, i_15, i_14, i_16, class390_2, bytes_10, -770588954);

					int i_25;
					for (i_25 = 0; i_25 < 13; i_25++) {
						this.anIntArray3842[i_25] = -1;
						this.anIntArray3843[i_25] = 1;
					}

					this.method5859(graphicalrenderer_1, overlaydef_19, underlaydef_20, i_13, i_15, bytes_8, bytes_9, bytes_11, bools_12, (short) 14961);
					this.aBool3853 = !this.aBool3810 && !bools_12[0] && !bools_12[2] && !bools_12[1] && !bools_12[3];
					this.method5849(overlaydef_19, underlaydef_20, -961871857);
					i_25 = this.underlayFaceCount + this.overlayFaceCount;
					if (i_25 <= 0) {
						this.aClass206_3776.method3384(i_3, i_13, i_15, (byte) 7);
					} else {
						if (bools_12[0]) {
							++i_25;
						}

						if (bools_12[2]) {
							++i_25;
						}

						if (bools_12[1]) {
							++i_25;
						}

						if (bools_12[3]) {
							++i_25;
						}

						this.anInt3846 = 0;
						this.anInt3852 = 0;
						int i_26 = i_25 * 3;
						int[] ints_27 = this.aBool3854 ? new int[i_26] : null;
						int[] ints_28 = new int[i_26];
						int[] ints_29 = new int[i_26];
						int[] ints_30 = new int[i_26];
						int[] ints_31 = new int[i_26];
						int[] ints_32 = new int[i_26];
						int[] ints_33 = class390_6 != null ? new int[i_26] : null;
						int[] ints_34 = class390_6 == null && class390_5 == null ? null : new int[i_26];
						this.method5850(graphicalrenderer_1, i_3, i_13, i_15, overlaydef_19, bools_12, ints_27, ints_28, ints_29, ints_30, ints_31, ints_32, ints_33, ints_34, class390_2, class390_6, class390_5, 702605153);
						int i_35 = bytes_10[i_13][i_16] & 0xff;
						int i_36 = bytes_10[i_14][i_16] & 0xff;
						int i_37 = bytes_10[i_14][i_15] & 0xff;
						this.method5851(graphicalrenderer_1, i_3, i_13, i_15, i_14, i_16, underlaydef_20, underlayId, i_35, i_36, i_37, bools_12, ints_27, ints_28, ints_29, ints_30, ints_31, ints_32, ints_33, ints_34, ints_4, class390_2, class390_6, class390_5, (byte) 2);
						this.method5852(class390_2, underlaydef_20, overlaydef_24, i_3, i_13, i_15, i_14, i_16, underlayId, overlayId, (short) 13205);
						Class90 class90_38 = new Class90();
						if (this.overlayHidden) {
							class90_38.color = this.aClass206_3776.getColor(i_13, i_15, (byte) 114);
							class90_38.scale = this.aClass206_3776.getScale(i_13, i_15, 1952003657);
							class90_38.intensity = this.aClass206_3776.getIntensities(i_13, i_15, -575094789);
							class90_38.anInt949 = this.aClass206_3776.method3432(i_13, i_15, (byte) 1);
							class90_38.anInt950 = this.aClass206_3776.method3464(i_13, i_15, -1127280692);
							class90_38.anInt951 = this.aClass206_3776.method3391(i_13, i_15, 2048484597);
						}

						class390_2.method6707(i_13, i_15, ints_28, ints_33, ints_29, ints_34, ints_30, ints_27, ints_31, ints_32, class90_38, this.aBool3851);
						this.aClass206_3776.method3384(i_3, i_13, i_15, (byte) -7);
					}
				}
			}
		}

	}

	final void method5848(GraphicalRenderer graphicalrenderer_1, OverlayDef overlaydef_2, UnderlayDef underlaydef_3, int i_4, int i_5, int i_6, int i_7, byte[][] bytes_8, byte[][] bytes_9, byte[][] bytes_10, boolean[] bools_11, int i_12) {
		boolean[] bools_13 = overlaydef_2 != null && overlaydef_2.aBool7061 ? aBoolArrayArray3793[this.anInt3844] : aBoolArrayArray3816[this.anInt3844];
		int i_14;
		OverlayDef overlaydef_15;
		byte b_16;
		int i_17;
		int i_18;
		if (i_5 > 0) {
			if (i_4 > 0) {
				i_14 = bytes_8[i_4 - 1][i_5 - 1] & 0xff;
				if (i_14 > 0) {
					overlaydef_15 = this.aClass536_3834.getOverlayDef(i_14 - 1, (byte) 0);
					if (overlaydef_15.primaryRGB != -1 && overlaydef_15.aBool7061) {
						b_16 = bytes_9[i_4 - 1][i_5 - 1];
						i_17 = bytes_10[i_4 - 1][i_5 - 1] * 2 + 4 & 0x7;
						i_18 = Class153.method2617(graphicalrenderer_1, overlaydef_15, (byte) -21);
						if (aBoolArrayArray3822[b_16][i_17]) {
							this.anIntArray3838[0] = overlaydef_15.primaryRGB;
							this.anIntArray3839[0] = i_18;
							this.anIntArray3813[0] = overlaydef_15.texture;
							this.anIntArray3827[0] = overlaydef_15.anInt7057;
							this.anIntArray3842[0] = overlaydef_15.anInt7052;
							this.anIntArray3843[0] = 256;
						}
					}
				}
			}

			if (i_4 < i_6 - 1) {
				i_14 = bytes_8[i_4 + 1][i_5 - 1] & 0xff;
				if (i_14 > 0) {
					overlaydef_15 = this.aClass536_3834.getOverlayDef(i_14 - 1, (byte) 0);
					if (overlaydef_15.primaryRGB != -1 && overlaydef_15.aBool7061) {
						b_16 = bytes_9[i_4 + 1][i_5 - 1];
						i_17 = bytes_10[i_4 + 1][i_5 - 1] * 2 + 6 & 0x7;
						i_18 = Class153.method2617(graphicalrenderer_1, overlaydef_15, (byte) -18);
						if (aBoolArrayArray3822[b_16][i_17]) {
							this.anIntArray3838[2] = overlaydef_15.primaryRGB;
							this.anIntArray3839[2] = i_18;
							this.anIntArray3813[2] = overlaydef_15.texture;
							this.anIntArray3827[2] = overlaydef_15.anInt7057;
							this.anIntArray3842[2] = overlaydef_15.anInt7052;
							this.anIntArray3843[2] = 512;
						}
					}
				}
			}
		}

		if (i_5 < i_7 - 1) {
			if (i_4 > 0) {
				i_14 = bytes_8[i_4 - 1][i_5 + 1] & 0xff;
				if (i_14 > 0) {
					overlaydef_15 = this.aClass536_3834.getOverlayDef(i_14 - 1, (byte) 0);
					if (overlaydef_15.primaryRGB != -1 && overlaydef_15.aBool7061) {
						b_16 = bytes_9[i_4 - 1][i_5 + 1];
						i_17 = bytes_10[i_4 - 1][i_5 + 1] * 2 + 2 & 0x7;
						i_18 = Class153.method2617(graphicalrenderer_1, overlaydef_15, (byte) 12);
						if (aBoolArrayArray3822[b_16][i_17]) {
							this.anIntArray3838[6] = overlaydef_15.primaryRGB;
							this.anIntArray3839[6] = i_18;
							this.anIntArray3813[6] = overlaydef_15.texture;
							this.anIntArray3827[6] = overlaydef_15.anInt7057;
							this.anIntArray3842[6] = overlaydef_15.anInt7052;
							this.anIntArray3843[6] = 64;
						}
					}
				}
			}

			if (i_4 < i_6 - 1) {
				i_14 = bytes_8[i_4 + 1][i_5 + 1] & 0xff;
				if (i_14 > 0) {
					overlaydef_15 = this.aClass536_3834.getOverlayDef(i_14 - 1, (byte) 0);
					if (overlaydef_15.primaryRGB != -1 && overlaydef_15.aBool7061) {
						b_16 = bytes_9[i_4 + 1][i_5 + 1];
						i_17 = bytes_10[i_4 + 1][i_5 + 1] * 2 + 0 & 0x7;
						i_18 = Class153.method2617(graphicalrenderer_1, overlaydef_15, (byte) -16);
						if (aBoolArrayArray3822[b_16][i_17]) {
							this.anIntArray3838[4] = overlaydef_15.primaryRGB;
							this.anIntArray3839[4] = i_18;
							this.anIntArray3813[4] = overlaydef_15.texture;
							this.anIntArray3827[4] = overlaydef_15.anInt7057;
							this.anIntArray3842[4] = overlaydef_15.anInt7052;
							this.anIntArray3843[4] = 128;
						}
					}
				}
			}
		}

		int i_19;
		int i_20;
		int i_21;
		byte b_23;
		if (i_5 > 0) {
			i_14 = bytes_8[i_4][i_5 - 1] & 0xff;
			if (i_14 > 0) {
				overlaydef_15 = this.aClass536_3834.getOverlayDef(i_14 - 1, (byte) 0);
				if (overlaydef_15.primaryRGB != -1) {
					b_16 = bytes_9[i_4][i_5 - 1];
					b_23 = bytes_10[i_4][i_5 - 1];
					if (overlaydef_15.aBool7061) {
						i_18 = 2;
						i_19 = b_23 * 2 + 4;
						i_20 = Class153.method2617(graphicalrenderer_1, overlaydef_15, (byte) 56);

						for (i_21 = 0; i_21 < 3; i_21++) {
							i_19 &= 0x7;
							i_18 &= 0x7;
							if (aBoolArrayArray3822[b_16][i_19] && this.anIntArray3842[i_18] <= overlaydef_15.anInt7052) {
								this.anIntArray3838[i_18] = overlaydef_15.primaryRGB;
								this.anIntArray3839[i_18] = i_20;
								this.anIntArray3813[i_18] = overlaydef_15.texture;
								this.anIntArray3827[i_18] = overlaydef_15.anInt7057;
								if (overlaydef_15.anInt7052 == this.anIntArray3842[i_18]) {
									this.anIntArray3843[i_18] |= 0x20;
								} else {
									this.anIntArray3843[i_18] = 32;
								}

								this.anIntArray3842[i_18] = overlaydef_15.anInt7052;
							}

							++i_19;
							--i_18;
						}

						if (!bools_13[this.anInt3781 + 0 & 0x3]) {
							bools_11[0] = aBoolArrayArray3793[b_16][b_23 + 2 & 0x3];
						}
					} else if (!bools_13[this.anInt3781 + 0 & 0x3]) {
						bools_11[0] = aBoolArrayArray3816[b_16][b_23 + 2 & 0x3];
					}
				}
			}
		}

		if (i_5 < i_7 - 1) {
			i_14 = bytes_8[i_4][i_5 + 1] & 0xff;
			if (i_14 > 0) {
				overlaydef_15 = this.aClass536_3834.getOverlayDef(i_14 - 1, (byte) 0);
				if (overlaydef_15.primaryRGB != -1) {
					b_16 = bytes_9[i_4][i_5 + 1];
					b_23 = bytes_10[i_4][i_5 + 1];
					if (overlaydef_15.aBool7061) {
						i_18 = 4;
						i_19 = b_23 * 2 + 2;
						i_20 = Class153.method2617(graphicalrenderer_1, overlaydef_15, (byte) 43);

						for (i_21 = 0; i_21 < 3; i_21++) {
							i_19 &= 0x7;
							i_18 &= 0x7;
							if (aBoolArrayArray3822[b_16][i_19] && this.anIntArray3842[i_18] <= overlaydef_15.anInt7052) {
								this.anIntArray3838[i_18] = overlaydef_15.primaryRGB;
								this.anIntArray3839[i_18] = i_20;
								this.anIntArray3813[i_18] = overlaydef_15.texture;
								this.anIntArray3827[i_18] = overlaydef_15.anInt7057;
								if (overlaydef_15.anInt7052 == this.anIntArray3842[i_18]) {
									this.anIntArray3843[i_18] |= 0x10;
								} else {
									this.anIntArray3843[i_18] = 16;
								}

								this.anIntArray3842[i_18] = overlaydef_15.anInt7052;
							}

							--i_19;
							++i_18;
						}

						if (!bools_13[this.anInt3781 + 2 & 0x3]) {
							bools_11[2] = aBoolArrayArray3793[b_16][b_23 + 0 & 0x3];
						}
					} else if (!bools_13[this.anInt3781 + 2 & 0x3]) {
						bools_11[2] = aBoolArrayArray3816[b_16][b_23 + 0 & 0x3];
					}
				}
			}
		}

		if (i_4 > 0) {
			i_14 = bytes_8[i_4 - 1][i_5] & 0xff;
			if (i_14 > 0) {
				overlaydef_15 = this.aClass536_3834.getOverlayDef(i_14 - 1, (byte) 0);
				if (overlaydef_15.primaryRGB != -1) {
					b_16 = bytes_9[i_4 - 1][i_5];
					b_23 = bytes_10[i_4 - 1][i_5];
					if (overlaydef_15.aBool7061) {
						i_18 = 6;
						i_19 = b_23 * 2 + 4;
						i_20 = Class153.method2617(graphicalrenderer_1, overlaydef_15, (byte) -53);

						for (i_21 = 0; i_21 < 3; i_21++) {
							i_19 &= 0x7;
							i_18 &= 0x7;
							if (aBoolArrayArray3822[b_16][i_19] && this.anIntArray3842[i_18] <= overlaydef_15.anInt7052) {
								this.anIntArray3838[i_18] = overlaydef_15.primaryRGB;
								this.anIntArray3839[i_18] = i_20;
								this.anIntArray3813[i_18] = overlaydef_15.texture;
								this.anIntArray3827[i_18] = overlaydef_15.anInt7057;
								if (overlaydef_15.anInt7052 == this.anIntArray3842[i_18]) {
									this.anIntArray3843[i_18] |= 0x8;
								} else {
									this.anIntArray3843[i_18] = 8;
								}

								this.anIntArray3842[i_18] = overlaydef_15.anInt7052;
							}

							--i_19;
							++i_18;
						}

						if (!bools_13[this.anInt3781 + 3 & 0x3]) {
							bools_11[3] = aBoolArrayArray3793[b_16][b_23 + 1 & 0x3];
						}
					} else if (!bools_13[this.anInt3781 + 3 & 0x3]) {
						bools_11[3] = aBoolArrayArray3816[b_16][b_23 + 1 & 0x3];
					}
				}
			}
		}

		if (i_4 < i_6 - 1) {
			i_14 = bytes_8[i_4 + 1][i_5] & 0xff;
			if (i_14 > 0) {
				overlaydef_15 = this.aClass536_3834.getOverlayDef(i_14 - 1, (byte) 0);
				if (overlaydef_15.primaryRGB != -1) {
					b_16 = bytes_9[i_4 + 1][i_5];
					b_23 = bytes_10[i_4 + 1][i_5];
					if (overlaydef_15.aBool7061) {
						i_18 = 4;
						i_19 = b_23 * 2 + 6;
						i_20 = Class153.method2617(graphicalrenderer_1, overlaydef_15, (byte) 10);

						for (i_21 = 0; i_21 < 3; i_21++) {
							i_19 &= 0x7;
							i_18 &= 0x7;
							if (aBoolArrayArray3822[b_16][i_19] && this.anIntArray3842[i_18] <= overlaydef_15.anInt7052) {
								this.anIntArray3838[i_18] = overlaydef_15.primaryRGB;
								this.anIntArray3839[i_18] = i_20;
								this.anIntArray3813[i_18] = overlaydef_15.texture;
								this.anIntArray3827[i_18] = overlaydef_15.anInt7057;
								if (overlaydef_15.anInt7052 == this.anIntArray3842[i_18]) {
									this.anIntArray3843[i_18] |= 0x4;
								} else {
									this.anIntArray3843[i_18] = 4;
								}

								this.anIntArray3842[i_18] = overlaydef_15.anInt7052;
							}

							++i_19;
							--i_18;
						}

						if (!bools_13[this.anInt3781 + 1 & 0x3]) {
							bools_11[1] = aBoolArrayArray3793[b_16][b_23 + 3 & 0x3];
						}
					} else if (!bools_13[this.anInt3781 + 1 & 0x3]) {
						bools_11[1] = aBoolArrayArray3816[b_16][b_23 + 3 & 0x3];
					}
				}
			}
		}

		if (overlaydef_2 != null && overlaydef_2.aBool7061) {
			i_14 = Class153.method2617(graphicalrenderer_1, overlaydef_2, (byte) -30);

			for (int i_22 = 0; i_22 < 8; i_22++) {
				int i_24 = i_22 - this.anInt3781 * 2 & 0x7;
				if (aBoolArrayArray3822[this.anInt3844][i_22] && this.anIntArray3842[i_24] <= overlaydef_2.anInt7052) {
					this.anIntArray3838[i_24] = overlaydef_2.primaryRGB;
					this.anIntArray3839[i_24] = i_14;
					this.anIntArray3813[i_24] = overlaydef_2.texture;
					this.anIntArray3827[i_24] = overlaydef_2.anInt7057;
					if (overlaydef_2.anInt7052 == this.anIntArray3842[i_24]) {
						this.anIntArray3843[i_24] |= 0x2;
					} else {
						this.anIntArray3843[i_24] = 2;
					}

					this.anIntArray3842[i_24] = overlaydef_2.anInt7052;
				}
			}
		}

	}

	void method5849(OverlayDef overlaydef_1, UnderlayDef underlaydef_2, int i_3) {
		if (this.aBool3853) {
			this.anIntArray3857 = anIntArrayArray3824[this.anInt3844];
			this.anIntArray3858 = anIntArrayArray3860[this.anInt3844];
			this.anIntArray3859 = anIntArrayArray3815[this.anInt3844];
			this.overlayFaceCount = overlaydef_1 != null ? OVERLAY_FACE_COUNT[this.anInt3844] : 0;
			this.underlayFaceCount = underlaydef_2 != null ? UNDERLAY_FACE_COUNT[this.anInt3844] : 0;
		} else if (this.aBool3810) {
			this.anIntArray3857 = anIntArrayArray3775[this.anInt3844];
			this.anIntArray3858 = anIntArrayArray3821[this.anInt3844];
			this.anIntArray3859 = anIntArrayArray3836[this.anInt3844];
			this.overlayFaceCount = overlaydef_1 != null ? anIntArray3778[this.anInt3844] : 0;
			this.underlayFaceCount = underlaydef_2 != null ? anIntArray3819[this.anInt3844] : 0;
			this.anIntArray3832 = anIntArrayArray3833[this.anInt3844];
		} else {
			this.anIntArray3857 = anIntArrayArray3774[this.anInt3844];
			this.anIntArray3858 = anIntArrayArray3830[this.anInt3844];
			this.anIntArray3859 = anIntArrayArray3831[this.anInt3844];
			this.overlayFaceCount = overlaydef_1 != null ? anIntArray3826[this.anInt3844] : 0;
			this.underlayFaceCount = underlaydef_2 != null ? anIntArray3847[this.anInt3844] : 0;
			this.anIntArray3832 = anIntArrayArray3828[this.anInt3844];
		}

	}

	void method5850(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, OverlayDef overlaydef_5, boolean[] bools_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] ints_11, int[] ints_12, int[] ints_13, int[] ints_14, Ground class390_15, Ground class390_16, Ground class390_17, int i_18) {
		this.anInt3850 = -1;
		this.anInt3848 = -1;
		this.anInt3849 = 256;
		if (overlaydef_5 != null) {
			this.anInt3850 = overlaydef_5.primaryRGB;
			this.anInt3848 = overlaydef_5.texture;
			this.anInt3849 = overlaydef_5.anInt7057;
			int i_19 = Class153.method2617(graphicalrenderer_1, overlaydef_5, (byte) 29);

			for (int i_20 = 0; i_20 < this.overlayFaceCount; i_20++) {
				boolean bool_21 = false;
				byte b_22;
				if (bools_6[0 - this.anInt3781 & 0x3] && this.anInt3846 == this.anIntArray3832[0]) {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = 1;
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					this.anIntArray3837[3] = 1;
					this.anIntArray3837[4] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[5] = this.anIntArray3859[this.anInt3846];
					b_22 = 6;
				} else if (bools_6[2 - this.anInt3781 & 0x3] && this.anIntArray3832[2] == this.anInt3846) {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = 5;
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					this.anIntArray3837[3] = 5;
					this.anIntArray3837[4] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[5] = this.anIntArray3859[this.anInt3846];
					b_22 = 6;
				} else if (bools_6[1 - this.anInt3781 & 0x3] && this.anIntArray3832[1] == this.anInt3846) {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = 3;
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					this.anIntArray3837[3] = 3;
					this.anIntArray3837[4] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[5] = this.anIntArray3859[this.anInt3846];
					b_22 = 6;
				} else if (bools_6[3 - this.anInt3781 & 0x3] && this.anIntArray3832[3] == this.anInt3846) {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = 7;
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					this.anIntArray3837[3] = 7;
					this.anIntArray3837[4] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[5] = this.anIntArray3859[this.anInt3846];
					b_22 = 6;
				} else {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					b_22 = 3;
				}

				for (int i_23 = 0; i_23 < b_22; i_23++) {
					int i_24 = this.anIntArray3837[i_23];
					int i_25 = i_24 - this.anInt3781 * 2 & 0x7;
					int i_26 = anIntArray3811[i_24];
					int i_27 = anIntArray3800[i_24];
					int i_28;
					int i_29;
					if (this.anInt3781 == 1) {
						i_28 = i_27;
						i_29 = 512 - i_26;
					} else if (this.anInt3781 == 2) {
						i_28 = 512 - i_26;
						i_29 = 512 - i_27;
					} else if (this.anInt3781 == 3) {
						i_28 = 512 - i_27;
						i_29 = i_26;
					} else {
						i_28 = i_26;
						i_29 = i_27;
					}

					ints_8[this.anInt3852] = i_28;
					ints_9[this.anInt3852] = i_29;
					int i_30;
					int i_31;
					if (ints_13 != null && aBoolArrayArray3822[this.anInt3844][i_24]) {
						i_30 = (i_3 << 9) + i_28;
						i_31 = (i_4 << 9) + i_29;
						ints_13[this.anInt3852] = class390_16.averageHeight(i_30, i_31, 1550950385) - class390_15.averageHeight(i_30, i_31, -497084405);
					}

					if (ints_14 != null) {
						if (class390_16 != null && !aBoolArrayArray3822[this.anInt3844][i_24]) {
							i_30 = (i_3 << 9) + i_28;
							i_31 = (i_4 << 9) + i_29;
							ints_14[this.anInt3852] = class390_15.averageHeight(i_30, i_31, -1953375051) - class390_16.averageHeight(i_30, i_31, -1082530779);
						} else if (class390_17 != null && !aBoolArrayArray3823[this.anInt3844][i_24]) {
							i_30 = (i_3 << 9) + i_28;
							i_31 = (i_4 << 9) + i_29;
							ints_14[this.anInt3852] = class390_17.averageHeight(i_30, i_31, -1990196729) - class390_15.averageHeight(i_30, i_31, -1843099367);
						}
					}

					if (i_24 < 8 && this.anIntArray3842[i_25] > overlaydef_5.anInt7052) {
						if (ints_7 != null) {
							ints_7[this.anInt3852] = this.anIntArray3839[i_25];
						}

						ints_12[this.anInt3852] = this.anIntArray3827[i_25];
						ints_11[this.anInt3852] = this.anIntArray3813[i_25];
						ints_10[this.anInt3852] = this.anIntArray3838[i_25];
					} else {
						if (ints_7 != null) {
							ints_7[this.anInt3852] = i_19;
						}

						ints_11[this.anInt3852] = overlaydef_5.texture;
						ints_12[this.anInt3852] = overlaydef_5.anInt7057;
						ints_10[this.anInt3852] = this.anInt3850;
					}

					++this.anInt3852;
				}

				++this.anInt3846;
			}

			if (!this.overlayHidden && i_2 == 0) {
				this.aClass206_3776.method3392(i_3, i_4, overlaydef_5.waterColour, overlaydef_5.waterScale, overlaydef_5.waterIntensity, overlaydef_5.anInt7065, overlaydef_5.anInt7055, overlaydef_5.anInt7067, (short) -30684);
			}

			if (this.anInt3844 != 12 && overlaydef_5.primaryRGB != -1 && overlaydef_5.aBool7059) {
				this.aBool3851 = true;
			}
		} else if (this.aBool3853) {
			this.anInt3846 += OVERLAY_FACE_COUNT[this.anInt3844];
		} else if (this.aBool3810) {
			this.anInt3846 += anIntArray3778[this.anInt3844];
		} else {
			this.anInt3846 += anIntArray3826[this.anInt3844];
		}

	}

	void method5851(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, UnderlayDef underlaydef_7, int i_8, int i_9, int i_10, int i_11, boolean[] bools_12, int[] ints_13, int[] ints_14, int[] ints_15, int[] ints_16, int[] ints_17, int[] ints_18, int[] ints_19, int[] ints_20, int[][] ints_21, Ground class390_22, Ground class390_23, Ground class390_24, byte b_25) {
		if (underlaydef_7 != null) {
			if (i_9 == 0) {
				i_9 = i_8;
			}

			if (i_10 == 0) {
				i_10 = i_8;
			}

			if (i_11 == 0) {
				i_11 = i_8;
			}

			UnderlayDef underlaydef_26 = this.aClass479_3789.getUnderlayDef(i_8 - 1, (byte) -96);
			UnderlayDef underlaydef_27 = this.aClass479_3789.getUnderlayDef(i_9 - 1, (byte) -18);
			UnderlayDef underlaydef_28 = this.aClass479_3789.getUnderlayDef(i_10 - 1, (byte) -95);
			UnderlayDef underlaydef_29 = this.aClass479_3789.getUnderlayDef(i_11 - 1, (byte) -80);

			for (int i_30 = 0; i_30 < this.underlayFaceCount; i_30++) {
				boolean bool_31 = false;
				byte b_32;
				if (bools_12[0 - this.anInt3781 & 0x3] && this.anInt3846 == this.anIntArray3832[0]) {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = 1;
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					this.anIntArray3837[3] = 1;
					this.anIntArray3837[4] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[5] = this.anIntArray3859[this.anInt3846];
					b_32 = 6;
				} else if (bools_12[2 - this.anInt3781 & 0x3] && this.anIntArray3832[2] == this.anInt3846) {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = 5;
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					this.anIntArray3837[3] = 5;
					this.anIntArray3837[4] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[5] = this.anIntArray3859[this.anInt3846];
					b_32 = 6;
				} else if (bools_12[1 - this.anInt3781 & 0x3] && this.anIntArray3832[1] == this.anInt3846) {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = 3;
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					this.anIntArray3837[3] = 3;
					this.anIntArray3837[4] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[5] = this.anIntArray3859[this.anInt3846];
					b_32 = 6;
				} else if (bools_12[3 - this.anInt3781 & 0x3] && this.anIntArray3832[3] == this.anInt3846) {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = 7;
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					this.anIntArray3837[3] = 7;
					this.anIntArray3837[4] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[5] = this.anIntArray3859[this.anInt3846];
					b_32 = 6;
				} else {
					this.anIntArray3837[0] = this.anIntArray3857[this.anInt3846];
					this.anIntArray3837[1] = this.anIntArray3858[this.anInt3846];
					this.anIntArray3837[2] = this.anIntArray3859[this.anInt3846];
					b_32 = 3;
				}

				for (int i_33 = 0; i_33 < b_32; i_33++) {
					int i_34 = this.anIntArray3837[i_33];
					int i_35 = i_34 - this.anInt3781 * 2 & 0x7;
					int i_36 = anIntArray3811[i_34];
					int i_37 = anIntArray3800[i_34];
					int i_38;
					int i_39;
					if (this.anInt3781 == 1) {
						i_38 = i_37;
						i_39 = 512 - i_36;
					} else if (this.anInt3781 == 2) {
						i_38 = 512 - i_36;
						i_39 = 512 - i_37;
					} else if (this.anInt3781 == 3) {
						i_38 = 512 - i_37;
						i_39 = i_36;
					} else {
						i_38 = i_36;
						i_39 = i_37;
					}

					ints_14[this.anInt3852] = i_38;
					ints_15[this.anInt3852] = i_39;
					int i_40;
					int i_41;
					if (ints_19 != null && aBoolArrayArray3822[this.anInt3844][i_34]) {
						i_40 = (i_3 << 9) + i_38;
						i_41 = (i_4 << 9) + i_39;
						ints_19[this.anInt3852] = class390_23.averageHeight(i_40, i_41, -722499660) - class390_22.averageHeight(i_40, i_41, 478616173);
					}

					if (ints_20 != null) {
						if (class390_23 != null && !aBoolArrayArray3822[this.anInt3844][i_34]) {
							i_40 = (i_3 << 9) + i_38;
							i_41 = (i_4 << 9) + i_39;
							ints_20[this.anInt3852] = class390_22.averageHeight(i_40, i_41, -1591634709) - class390_23.averageHeight(i_40, i_41, -1293906415);
						} else if (class390_24 != null && !aBoolArrayArray3823[this.anInt3844][i_34]) {
							i_40 = (i_3 << 9) + i_38;
							i_41 = (i_4 << 9) + i_39;
							ints_20[this.anInt3852] = class390_24.averageHeight(i_40, i_41, 2113040787) - class390_22.averageHeight(i_40, i_41, 1891063345);
						}
					}

					if (i_34 < 8 && this.anIntArray3842[i_35] >= 0) {
						if (ints_13 != null) {
							ints_13[this.anInt3852] = this.anIntArray3839[i_35];
						}

						ints_18[this.anInt3852] = this.anIntArray3827[i_35];
						ints_17[this.anInt3852] = this.anIntArray3813[i_35];
						ints_16[this.anInt3852] = this.anIntArray3838[i_35];
					} else {
						if (this.aBool3810 && aBoolArrayArray3822[this.anInt3844][i_34]) {
							ints_17[this.anInt3852] = this.anInt3848;
							ints_18[this.anInt3852] = this.anInt3849;
							ints_16[this.anInt3852] = this.anInt3850;
						} else if (i_38 == 0 && i_39 == 0) {
							ints_16[this.anInt3852] = ints_21[i_3][i_4];
							ints_17[this.anInt3852] = underlaydef_26.texture;
							ints_18[this.anInt3852] = underlaydef_26.scale;
						} else if (i_38 == 0 && i_39 == 512) {
							ints_16[this.anInt3852] = ints_21[i_3][i_6];
							ints_17[this.anInt3852] = underlaydef_27.texture;
							ints_18[this.anInt3852] = underlaydef_27.scale;
						} else if (i_38 == 512 && i_39 == 512) {
							ints_16[this.anInt3852] = ints_21[i_5][i_6];
							ints_17[this.anInt3852] = underlaydef_28.texture;
							ints_18[this.anInt3852] = underlaydef_28.scale;
						} else if (i_38 == 512 && i_39 == 0) {
							ints_16[this.anInt3852] = ints_21[i_5][i_4];
							ints_17[this.anInt3852] = underlaydef_29.texture;
							ints_18[this.anInt3852] = underlaydef_29.scale;
						} else {
							if (i_38 < 256) {
								if (i_39 < 256) {
									ints_17[this.anInt3852] = underlaydef_26.texture;
									ints_18[this.anInt3852] = underlaydef_26.scale;
								} else {
									ints_17[this.anInt3852] = underlaydef_27.texture;
									ints_18[this.anInt3852] = underlaydef_27.scale;
								}
							} else if (i_39 < 256) {
								ints_17[this.anInt3852] = underlaydef_29.texture;
								ints_18[this.anInt3852] = underlaydef_29.scale;
							} else {
								ints_17[this.anInt3852] = underlaydef_28.texture;
								ints_18[this.anInt3852] = underlaydef_28.scale;
							}

							i_40 = Class371.method6347(ints_21[i_3][i_4], ints_21[i_5][i_4], i_38 << 7 >> 9, -1964912847);
							i_41 = Class371.method6347(ints_21[i_3][i_6], ints_21[i_5][i_6], i_38 << 7 >> 9, -2132910365);
							ints_16[this.anInt3852] = Class371.method6347(i_40, i_41, i_39 << 7 >> 9, -2113555849);
						}

						if (ints_13 != null) {
							ints_13[this.anInt3852] = ints_16[this.anInt3852];
						}
					}

					++this.anInt3852;
				}

				++this.anInt3846;
			}

			if (this.anInt3844 != 0 && underlaydef_7.blockShadow) {
				this.aBool3851 = true;
			}
		}

	}

	void method5852(Ground class390_1, UnderlayDef underlaydef_2, OverlayDef overlaydef_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, short s_11) {
		int i_12 = class390_1.method6722(i_5, i_6, 65280);
		int i_13 = class390_1.method6722(i_7, i_6, 65280);
		int i_14 = class390_1.method6722(i_7, i_8, 65280);
		int i_15 = class390_1.method6722(i_5, i_8, 65280);
		boolean bool_16 = this.regionMap.is0x2(i_5, i_6, 1534116751);
		if (bool_16 && i_4 > 1 || !bool_16 && i_4 > 0) {
			boolean bool_17 = true;
			if (underlaydef_2 != null && !underlaydef_2.aBool5722) {
				bool_17 = false;
			} else if (i_9 == 0 && this.anInt3844 != 0) {
				bool_17 = false;
			} else if (i_10 > 0 && overlaydef_3 != null && !overlaydef_3.aBool7056) {
				bool_17 = false;
			}

			if (bool_17 && i_13 == i_12 && i_12 == i_14 && i_12 == i_15) {
				this.aByteArrayArrayArray3794[i_4][i_5][i_6] = (byte) (this.aByteArrayArrayArray3794[i_4][i_5][i_6] | 0x4);
			}
		}

	}

	public final void method5853(int i_1, int[][] ints_2, int i_3) {
		int[][] ints_4 = this.tileHeights[i_1];

		for (int i_5 = 0; i_5 < this.maxX + 1; i_5++) {
			for (int i_6 = 0; i_6 < this.maxY + 1; i_6++) {
				ints_4[i_5][i_6] += ints_2[i_5][i_6];
			}
		}

	}

	Class329(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, boolean bool_5, Class536 class536_6, UnderlayIndexLoader underlayindexloader_7, RegionMap regionmap_8) {
		this.aClass206_3776 = sceneobjectmanager_1;
		this.anInt3845 = i_2;
		this.maxX = i_3;
		this.maxY = i_4;
		this.overlayHidden = bool_5;
		this.aClass536_3834 = class536_6;
		this.aClass479_3789 = underlayindexloader_7;
		this.regionMap = regionmap_8;
		this.underlayIds = new byte[this.anInt3845][this.maxX][this.maxY];
		this.overlayIds = new byte[this.anInt3845][this.maxX][this.maxY];
		this.overlayPathShapes = new byte[this.anInt3845][this.maxX][this.maxY];
		this.overlayRotations = new byte[this.anInt3845][this.maxX][this.maxY];
		this.tileHeights = new int[this.anInt3845][this.maxX + 1][this.maxY + 1];
		this.aByteArrayArrayArray3794 = new byte[this.anInt3845][this.maxX + 1][this.maxY + 1];
	}

	void method5859(GraphicalRenderer graphicalrenderer_1, OverlayDef overlaydef_2, UnderlayDef underlaydef_3, int i_4, int i_5, byte[][] bytes_6, byte[][] bytes_7, byte[][] bytes_8, boolean[] bools_9, short s_10) {
		boolean[] bools_11 = overlaydef_2 != null && overlaydef_2.aBool7061 ? aBoolArrayArray3793[this.anInt3844] : aBoolArrayArray3816[this.anInt3844];
		this.method5848(graphicalrenderer_1, overlaydef_2, underlaydef_3, i_4, i_5, this.maxX, this.maxY, bytes_8, bytes_6, bytes_7, bools_9, -1828708428);
		this.aBool3854 = overlaydef_2 != null && overlaydef_2.primaryRGB != overlaydef_2.secondaryRGB;
		if (!this.aBool3854) {
			for (int i_12 = 0; i_12 < 8; i_12++) {
				if (this.anIntArray3842[i_12] >= 0 && this.anIntArray3839[i_12] != this.anIntArray3838[i_12]) {
					this.aBool3854 = true;
					break;
				}
			}
		}

		byte b_13;
		if (!bools_11[this.anInt3781 + 1 & 0x3]) {
			b_13 = 1;
			bools_9[b_13] |= (this.anIntArray3843[2] & this.anIntArray3843[4]) == 0;
		}

		if (!bools_11[this.anInt3781 + 3 & 0x3]) {
			b_13 = 3;
			bools_9[b_13] |= (this.anIntArray3843[6] & this.anIntArray3843[0]) == 0;
		}

		if (!bools_11[this.anInt3781 + 0 & 0x3]) {
			b_13 = 0;
			bools_9[b_13] |= (this.anIntArray3843[0] & this.anIntArray3843[2]) == 0;
		}

		if (!bools_11[this.anInt3781 + 2 & 0x3]) {
			b_13 = 2;
			bools_9[b_13] |= (this.anIntArray3843[4] & this.anIntArray3843[6]) == 0;
		}

		if (!this.aBool3810 && (this.anInt3844 == 0 || this.anInt3844 == 12)) {
			if (bools_9[0] && !bools_9[1] && !bools_9[2] && bools_9[3]) {
				bools_9[3] = false;
				bools_9[0] = false;
				this.anInt3844 = this.anInt3844 == 0 ? 13 : 14;
				this.anInt3781 = 0;
			} else if (bools_9[0] && bools_9[1] && !bools_9[2] && !bools_9[3]) {
				bools_9[1] = false;
				bools_9[0] = false;
				this.anInt3844 = this.anInt3844 == 0 ? 13 : 14;
				this.anInt3781 = 3;
			} else if (!bools_9[0] && bools_9[1] && bools_9[2] && !bools_9[3]) {
				bools_9[2] = false;
				bools_9[1] = false;
				this.anInt3844 = this.anInt3844 == 0 ? 13 : 14;
				this.anInt3781 = 2;
			} else if (!bools_9[0] && !bools_9[1] && bools_9[2] && bools_9[3]) {
				bools_9[3] = false;
				bools_9[2] = false;
				this.anInt3844 = this.anInt3844 == 0 ? 13 : 14;
				this.anInt3781 = 1;
			}
		}

	}

	int method5870(int i_1, int i_2, int i_3, int i_4, int i_5, Ground class390_6, byte[][] bytes_7, int i_8) {
		if ((this.anInt3844 == 0 || this.anInt3844 == 12) && i_2 > 0 && i_3 > 0 && i_2 < this.maxX && i_3 < this.maxY) {
			byte b_9 = 0;
			byte b_10 = 0;
			byte b_11 = 0;
			byte b_12 = 0;
			int i_15 = b_9 + (bytes_7[i_2 - 1][i_3 - 1] == i_1 ? 1 : -1);
			int i_16 = b_10 + (bytes_7[i_4][i_3 - 1] == i_1 ? 1 : -1);
			int i_17 = b_11 + (bytes_7[i_4][i_5] == i_1 ? 1 : -1);
			int i_18 = b_12 + (bytes_7[i_2 - 1][i_5] == i_1 ? 1 : -1);
			if (bytes_7[i_2][i_3 - 1] == i_1) {
				++i_15;
				++i_16;
			} else {
				--i_15;
				--i_16;
			}

			if (bytes_7[i_4][i_3] == i_1) {
				++i_16;
				++i_17;
			} else {
				--i_16;
				--i_17;
			}

			if (bytes_7[i_2][i_5] == i_1) {
				++i_17;
				++i_18;
			} else {
				--i_17;
				--i_18;
			}

			if (bytes_7[i_2 - 1][i_3] == i_1) {
				++i_18;
				++i_15;
			} else {
				--i_18;
				--i_15;
			}

			int i_13 = i_15 - i_17;
			if (i_13 < 0) {
				i_13 = -i_13;
			}

			int i_14 = i_16 - i_18;
			if (i_14 < 0) {
				i_14 = -i_14;
			}

			if (i_13 == i_14) {
				i_13 = class390_6.method6722(i_2, i_3, 65280) - class390_6.method6722(i_4, i_5, 65280);
				if (i_13 < 0) {
					i_13 = -i_13;
				}

				i_14 = class390_6.method6722(i_4, i_3, 65280) - class390_6.method6722(i_2, i_5, 65280);
				if (i_14 < 0) {
					i_14 = -i_14;
				}
			}

			return i_13 < i_14 ? 1 : 0;
		} else {
			return this.anInt3781;
		}
	}

	final void decodeTileMasks(RsByteBuffer rsbytebuffer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11) {
		if (i_9 == 1) {
			i_6 = 1;
		} else if (i_9 == 2) {
			i_5 = 1;
			i_6 = 1;
		} else if (i_9 == 3) {
			i_5 = 1;
		}

		int i_12;
		if (i_3 >= 0 && i_3 < this.maxX && i_4 >= 0 && i_4 < this.maxY) {
			if (!this.overlayHidden && !bool_10) {
				this.regionMap.tileMasks[i_2][i_3][i_4] = 0;
			}

			while (true) {
				i_12 = rsbytebuffer_1.readUnsignedByte();
				if (i_12 == 0) {
					if (this.overlayHidden) {
						this.tileHeights[0][i_3 + i_5][i_4 + i_6] = 0;
					} else if (i_2 == 0) {
						this.tileHeights[0][i_3 + i_5][i_4 + i_6] = -Class92.calculateTileHeights(i_7 + 932731, i_8 + 556238, 1995871883) * 8 << 2;
					} else {
						this.tileHeights[i_2][i_3 + i_5][i_4 + i_6] = this.tileHeights[i_2 - 1][i_3 + i_5][i_4 + i_6] - 960;
					}
					break;
				}

				if (i_12 == 1) {
					int i_13 = rsbytebuffer_1.readUnsignedByte();
					if (!this.overlayHidden) {
						if (i_13 == 1) {
							i_13 = 0;
						}

						if (i_2 == 0) {
							this.tileHeights[0][i_3 + i_5][i_4 + i_6] = -i_13 * 8 << 2;
						} else {
							this.tileHeights[i_2][i_3 + i_5][i_4 + i_6] = this.tileHeights[i_2 - 1][i_3 + i_5][i_4 + i_6] - (i_13 * 8 << 2);
						}
					} else {
						this.tileHeights[0][i_3 + i_5][i_4 + i_6] = i_13 * 8 << 2;
					}
					break;
				}

				if (i_12 <= 49) {
					if (bool_10) {
						rsbytebuffer_1.readUnsignedByte();
					} else {
						this.overlayIds[i_2][i_3][i_4] = rsbytebuffer_1.readByte();
						this.overlayPathShapes[i_2][i_3][i_4] = (byte) ((i_12 - 2) / 4);
						this.overlayRotations[i_2][i_3][i_4] = (byte) (i_12 - 2 + i_9 & 0x3);
					}
				} else if (i_12 <= 81) {
					if (!this.overlayHidden && !bool_10) {
						this.regionMap.tileMasks[i_2][i_3][i_4] = (byte) (i_12 - 49);
					}
				} else if (!bool_10) {
					this.underlayIds[i_2][i_3][i_4] = (byte) (i_12 - 81);
				}
			}
		} else {
			while (true) {
				i_12 = rsbytebuffer_1.readUnsignedByte();
				if (i_12 == 0) {
					break;
				}

				if (i_12 == 1) {
					rsbytebuffer_1.readUnsignedByte();
					break;
				}

				if (i_12 <= 49) {
					rsbytebuffer_1.readUnsignedByte();
				}
			}
		}

	}

	public final void method5890(int i_1, int i_2, int i_3, int i_4, byte b_5) {
		for (int i_6 = 0; i_6 < this.anInt3845; i_6++) {
			this.method5838(i_6, i_1, i_2, i_3, i_4, -1337783095);
		}

	}

	public void method5891(short s_1) {
		this.anIntArray3795 = null;
		this.anIntArray3796 = null;
		this.anIntArray3797 = null;
		this.anIntArray3798 = null;
		this.anIntArray3799 = null;
		this.aBool3773 = false;
	}

	static final void method5901(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 4;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		int i_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 3];
		EnumDefinitions enumDefinitions = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_4, (byte) 8);
		if (i_2 == enumDefinitions.aChar5146 && i_3 == enumDefinitions.aChar5140) {
			if (i_3 == 115) {
				cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = enumDefinitions.getStringValue(i_5, 870483820);
			} else {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = enumDefinitions.getIntValue(i_5, -1848389937);
			}

		} else {
			throw new RuntimeException(i_4 + " " + i_5);
		}
	}

	static final void method5902(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.aClass61_7010.aByte619;
	}

	public static void method5903(Class470 class470_0, Frame frame_1, int i_2) {
		class470_0.method7820((byte) 1);
		frame_1.setVisible(false);
		frame_1.dispose();
	}

	static final void method5904(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (Class468_Sub8.aClass98Array7889[i_2] == null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class468_Sub8.aClass98Array7889[i_2].components.length;
		}

	}

	static long method5905(SceneObject sceneobject_0, int i_1, int i_2, byte b_3) {
		long long_4 = 4194304L;
		long long_6 = Long.MIN_VALUE;
		ObjectDefinitions objectdefinitions_8 = IndexLoaders.MAP_REGION_DECODER.method4436(-1495690632).getObjectDefinitions(sceneobject_0.getId(1049688189), 65280);
		long long_9 = (long) (i_1 | i_2 << 7 | sceneobject_0.method89(1466657768) << 14 | sceneobject_0.method92(-524760179) << 20 | 0x40000000);
		if (objectdefinitions_8.interactable == 0) {
			long_9 |= long_6;
		}

		if (objectdefinitions_8.supportsItems == 1) {
			long_9 |= long_4;
		}

		long_9 |= (long) sceneobject_0.getId(-1337355622) << 32;
		return long_9;
	}

	static void method5906(int i_0, int i_1) {
		Class282_Sub53_Sub2.anInt9630 = i_0;
		Class282_Sub53_Sub2.aClass282_Sub53_Sub2Array9633 = new Class282_Sub53_Sub2[i_0];
		Class279.anInt3370 = 0;
	}

}
