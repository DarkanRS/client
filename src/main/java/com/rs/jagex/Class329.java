package com.rs.jagex;

import java.awt.Frame;

public class Class329 {

	static int[] OVERLAY_FACE_COUNT = {2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
	static int[] UNDERLAY_FACE_COUNT = {0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
	static int[] anIntArray3826 = {4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
	static int[] anIntArray3847 = {0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
	static int[] anIntArray3778 = {4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
	static int[] anIntArray3819 = {0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
	static int[] anIntArray3811 = {0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256};
	static int[] anIntArray3800 = {0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256};
	static boolean[][] aBoolArrayArray3822 = {{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13]};
	static boolean[][] aBoolArrayArray3823 = {new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};
	static int[][] anIntArrayArray3824 = {{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
	static int[][] anIntArrayArray3860 = {{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
	static int[][] anIntArrayArray3815 = {{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};
	static boolean[][] aBoolArrayArray3816 = {new boolean[4], new boolean[4], {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
	static int[][] anIntArrayArray3828 = {{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
	static int[][] anIntArrayArray3774 = {{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
	static int[][] anIntArrayArray3830 = {{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
	static int[][] anIntArrayArray3831 = {{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
	static boolean[][] aBoolArrayArray3793 = {new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]};
	static int[][] anIntArrayArray3833 = {{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
	static int[][] anIntArrayArray3775 = {{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
	static int[][] anIntArrayArray3821 = {{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
	static int[][] anIntArrayArray3836 = {{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
	public static void method5903(Class470 class470_0, Frame frame_1) {
		class470_0.method7820();
		frame_1.setVisible(false);
		frame_1.dispose();
	}
	static long method5905(WorldObject sceneobject_0, int i_1, int i_2) {
		long long_4 = 4194304L;
		long long_6 = Long.MIN_VALUE;
		ObjectDefinition objectdefinitions_8 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(sceneobject_0.getId());
		long long_9 = i_1 | i_2 << 7 | sceneobject_0.method89() << 14 | sceneobject_0.method92() << 20 | 0x40000000;
		if (objectdefinitions_8.interactable == 0)
			long_9 |= long_6;
		if (objectdefinitions_8.supportsItems == 1)
			long_9 |= long_4;
		long_9 |= (long) sceneobject_0.getId() << 32;
		return long_9;
	}
	static void method5906() {
		MouseRecord_Sub2.anInt9630 = 100;
		MouseRecord_Sub2.aMouseRecord_Sub2Array9633 = new MouseRecord_Sub2[100];
		Class279.anInt3370 = 0;
	}
	public byte[][][] aByteArrayArrayArray3788;
	public int anInt3809;
	public boolean highDetailWater;
	public boolean aBool3780;
	public boolean aBool3820;
	public boolean aBool3782;
	public int anInt3845;
	public boolean overlayHidden;
	public int[][][] tileHeights;
	protected boolean aBool3773;
	protected SceneObjectManager sceneObjectManager;
	protected int maxX;
	protected int maxY;
	protected RenderFlagMap regionMap;
	protected byte[][][] aByteArrayArrayArray3794;
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
	int anInt3846;
	int index;
	int[] anIntArray3857;
	int[] anIntArray3858;
	int[] anIntArray3859;
	int[] anIntArray3832;
	int anInt3850;
	int anInt3849;
	int[] anIntArray3837 = new int[6];
	int[] anIntArray3838 = new int[13];
	int[] anIntArray3839 = new int[13];
	int[] anIntArray3813 = new int[13];
	int[] anIntArray3827 = new int[13];
	int[] anIntArray3842 = new int[13];
	int[] anIntArray3843 = new int[13];
	OverlayIndexLoader aClass536_3834;
	UnderlayIndexLoader aClass479_3789;
	byte[][][] underlayIds;
	byte[][][] overlayIds;

	byte[][][] overlayPathShapes;

	byte[][][] overlayRotations;

	boolean aBool3854;

	Class329(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, boolean bool_5, OverlayIndexLoader class536_6, UnderlayIndexLoader underlayindexloader_7, RenderFlagMap regionmap_8) {
		sceneObjectManager = sceneobjectmanager_1;
		anInt3845 = i_2;
		maxX = i_3;
		maxY = i_4;
		overlayHidden = bool_5;
		aClass536_3834 = class536_6;
		aClass479_3789 = underlayindexloader_7;
		regionMap = regionmap_8;
		underlayIds = new byte[anInt3845][maxX][maxY];
		overlayIds = new byte[anInt3845][maxX][maxY];
		overlayPathShapes = new byte[anInt3845][maxX][maxY];
		overlayRotations = new byte[anInt3845][maxX][maxY];
		tileHeights = new int[anInt3845][maxX + 1][maxY + 1];
		aByteArrayArrayArray3794 = new byte[anInt3845][maxX + 1][maxY + 1];
	}

	void decodeTileMasks(ByteBuf rsbytebuffer_1, int plane, int x, int y, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10) {
		int i_61 = i_6;
		int i_51 = i_5;
		if (i_9 == 1)
			i_61 = 1;
		else if (i_9 == 2) {
			i_51 = 1;
			i_61 = 1;
		} else if (i_9 == 3)
			i_51 = 1;
		int i_12;
		if (x >= 0 && x < maxX && y >= 0 && y < maxY) {
			if (!overlayHidden && !bool_10)
				regionMap.tileMasks[plane][x][y] = 0;
			while (true) {
				i_12 = rsbytebuffer_1.readUnsignedByte();
				if (i_12 == 0) {
					if (overlayHidden)
						tileHeights[0][x + i_51][y + i_61] = 0;
					else if (plane == 0)
						tileHeights[0][x + i_51][y + i_61] = -CutsceneObject.calculateTileHeights(i_7 + 932731, i_8 + 556238) * 8 << 2;
					else
						tileHeights[plane][x + i_51][y + i_61] = tileHeights[plane - 1][x + i_51][y + i_61] - 960;
					break;
				}
				if (i_12 == 1) {
					int i_13 = rsbytebuffer_1.readUnsignedByte();
					if (!overlayHidden) {
						if (i_13 == 1)
							i_13 = 0;
						if (plane == 0)
							tileHeights[0][x + i_51][y + i_61] = -i_13 * 8 << 2;
						else
							tileHeights[plane][x + i_51][y + i_61] = tileHeights[plane - 1][x + i_51][y + i_61] - (i_13 * 8 << 2);
					} else
						tileHeights[0][x + i_51][y + i_61] = i_13 * 8 << 2;
					break;
				}
				if (i_12 <= 49) {
					if (bool_10)
						rsbytebuffer_1.readUnsignedByte();
					else {
						overlayIds[plane][x][y] = rsbytebuffer_1.readByte();
						overlayPathShapes[plane][x][y] = (byte) ((i_12 - 2) / 4);
						overlayRotations[plane][x][y] = (byte) (i_12 - 2 + i_9 & 0x3);
					}
				} else if (i_12 <= 81) {
					if (!overlayHidden && !bool_10)
						regionMap.tileMasks[plane][x][y] = (byte) (i_12 - 49);
				} else if (!bool_10)
					underlayIds[plane][x][y] = (byte) (i_12 - 81);
			}
		} else
			while (true) {
				i_12 = rsbytebuffer_1.readUnsignedByte();
				if (i_12 == 0)
					break;
				if (i_12 == 1) {
					rsbytebuffer_1.readUnsignedByte();
					break;
				}
				if (i_12 <= 49)
					rsbytebuffer_1.readUnsignedByte();
			}
	}

	public void decodeTileMasksUnderlay(ByteBuf rsbytebuffer_1, int i_2, int i_3, int i_4, int i_5, ClipFlagMap[] arr_6) {
		int i_8;
		int i_10;
		int i_11;
		int i_12;
		if (!overlayHidden)
			for (i_8 = 0; i_8 < 4; i_8++) {
				ClipFlagMap clipmap_14 = arr_6[i_8];
				for (i_10 = 0; i_10 < 64; i_10++)
					for (i_11 = 0; i_11 < 64; i_11++) {
						i_12 = i_10 + i_2;
						int i_13 = i_3 + i_11;
						if (i_12 >= 0 && i_12 < maxX && i_13 >= 0 && i_13 < maxY)
							clipmap_14.removeBlockedTile(i_12, i_13);
					}
			}
		i_8 = i_2 + i_4;
		int i_9 = i_3 + i_5;
		for (i_10 = 0; i_10 < anInt3845; i_10++)
			for (i_11 = 0; i_11 < 64; i_11++)
				for (i_12 = 0; i_12 < 64; i_12++)
					decodeTileMasks(rsbytebuffer_1, i_10, i_11 + i_2, i_3 + i_12, 0, 0, i_8 + i_11, i_12 + i_9, 0, false);
	}

	public void initClipMap(AbstractRenderer graphicalrenderer_1, int[][][] ints_2, ClipFlagMap[] arr_3) {
		if (!overlayHidden)
			for (int plane = 0; plane < 4; plane++)
				for (int x = 0; x < maxX; x++)
					for (int y = 0; y < maxY; y++)
						if ((regionMap.tileMasks[plane][x][y] & 0x1) != 0) {
							int height = plane;
							if ((regionMap.tileMasks[1][x][y] & 0x2) != 0)
								height = plane - 1;
							if (height >= 0)
								//								if (height == 0)
									//									System.out.println("Blocking: " + x + ", " + y);
							arr_3[height].addBlockedTile(x, y);
						}
		for (int i_5 = 0; i_5 < anInt3845; i_5++) {
			int i_6 = 0;
			int i_7 = 0;
			if (!overlayHidden) {
				if (highDetailWater)
					i_7 |= 0x8;
				if (aBool3780)
					i_6 |= 0x2;
				if (anInt3809 != 0) {
					i_6 |= 0x1;
					i_7 |= 0x10;
				}
			}
			if (aBool3780)
				i_7 |= 0x7;
			if (!aBool3782)
				i_7 |= 0x20;
			int[][] ints_8 = ints_2 != null && i_5 < ints_2.length ? ints_2[i_5] : tileHeights[i_5];
			sceneObjectManager.method3385(i_5, graphicalrenderer_1.createGround(maxX, maxY, tileHeights[i_5], ints_8, i_6, i_7));
		}
	}

	public void method5835() {
		aBool3773 = true;
	}

	public void method5837(AbstractRenderer graphicalrenderer_1, Ground class390_2, Ground class390_3) {
		int[][] ints_5 = new int[maxX][maxY];
		if (anIntArray3795 == null || anIntArray3795.length != maxY) {
			anIntArray3795 = new int[maxY];
			anIntArray3796 = new int[maxY];
			anIntArray3797 = new int[maxY];
			anIntArray3798 = new int[maxY];
			anIntArray3799 = new int[maxY];
		}
		int i_6;
		for (i_6 = 0; i_6 < anInt3845; i_6++) {
			int i_7;
			for (i_7 = 0; i_7 < maxY; i_7++) {
				anIntArray3795[i_7] = 0;
				anIntArray3796[i_7] = 0;
				anIntArray3797[i_7] = 0;
				anIntArray3798[i_7] = 0;
				anIntArray3799[i_7] = 0;
			}
			for (i_7 = -5; i_7 < maxX; i_7++) {
				int i_8;
				int i_9;
				int i_10;
				int i_11;
				for (i_8 = 0; i_8 < maxY; i_8++) {
					i_9 = i_7 + 5;
					if (i_9 < maxX) {
						i_10 = underlayIds[i_6][i_9][i_8] & 0xff;
						if (i_10 > 0) {
							UnderlayDef underlaydef_16 = aClass479_3789.getUnderlayDef(i_10 - 1);
							anIntArray3795[i_8] += underlaydef_16.r;
							anIntArray3796[i_8] += underlaydef_16.g;
							anIntArray3797[i_8] += underlaydef_16.b;
							anIntArray3798[i_8] += underlaydef_16.a;
							++anIntArray3799[i_8];
						}
					}
					i_10 = i_7 - 5;
					if (i_10 >= 0) {
						i_11 = underlayIds[i_6][i_10][i_8] & 0xff;
						if (i_11 > 0) {
							UnderlayDef underlaydef_17 = aClass479_3789.getUnderlayDef(i_11 - 1);
							anIntArray3795[i_8] -= underlaydef_17.r;
							anIntArray3796[i_8] -= underlaydef_17.g;
							anIntArray3797[i_8] -= underlaydef_17.b;
							anIntArray3798[i_8] -= underlaydef_17.a;
							--anIntArray3799[i_8];
						}
					}
				}
				if (i_7 >= 0) {
					i_8 = 0;
					i_9 = 0;
					i_10 = 0;
					i_11 = 0;
					int i_12 = 0;
					for (int i_13 = -5; i_13 < maxY; i_13++) {
						int i_14 = i_13 + 5;
						if (i_14 < maxY) {
							i_8 += anIntArray3795[i_14];
							i_9 += anIntArray3796[i_14];
							i_10 += anIntArray3797[i_14];
							i_11 += anIntArray3798[i_14];
							i_12 += anIntArray3799[i_14];
						}
						int i_15 = i_13 - 5;
						if (i_15 >= 0) {
							i_8 -= anIntArray3795[i_15];
							i_9 -= anIntArray3796[i_15];
							i_10 -= anIntArray3797[i_15];
							i_11 -= anIntArray3798[i_15];
							i_12 -= anIntArray3799[i_15];
						}
						if (i_13 >= 0 && i_11 > 0 && i_12 > 0)
							ints_5[i_7][i_13] = Class371.method6348(i_8 * 256 / i_11, i_9 / i_12, i_10 / i_12);
					}
				}
			}
			if (aBool3820)
				method5846(graphicalrenderer_1, sceneObjectManager.aGroundArray2591[i_6], i_6, ints_5, i_6 == 0 ? class390_2 : null, i_6 == 0 ? class390_3 : null);
			else
				method5845(sceneObjectManager.aGroundArray2591[i_6], i_6, ints_5, i_6 == 0 ? class390_2 : null, i_6 == 0 ? class390_3 : null);
			underlayIds[i_6] = null;
			overlayIds[i_6] = null;
			overlayPathShapes[i_6] = null;
			overlayRotations[i_6] = null;
		}
		if (!overlayHidden) {
			if (anInt3809 != 0)
				sceneObjectManager.method3429();
			if (aBool3780)
				sceneObjectManager.method3431();
		}
		for (i_6 = 0; i_6 < anInt3845; i_6++)
			sceneObjectManager.aGroundArray2591[i_6].SA();
	}

	public void method5838(int i_1, int i_2, int i_3, int i_4, int i_5) {
		int i_7;
		for (i_7 = i_3; i_7 < i_3 + i_5; i_7++)
			for (int i_8 = i_2; i_8 < i_2 + i_4; i_8++)
				if (i_8 >= 0 && i_8 < maxX && i_7 >= 0 && i_7 < maxY)
					tileHeights[i_1][i_8][i_7] = i_1 > 0 ? tileHeights[i_1 - 1][i_8][i_7] - 960 : 0;
					if (i_2 > 0 && i_2 < maxX)
						for (i_7 = i_3 + 1; i_7 < i_3 + i_5; i_7++)
							if (i_7 >= 0 && i_7 < maxY)
								tileHeights[i_1][i_2][i_7] = tileHeights[i_1][i_2 - 1][i_7];
					if (i_3 > 0 && i_3 < maxY)
						for (i_7 = i_2 + 1; i_7 < i_2 + i_4; i_7++)
							if (i_7 >= 0 && i_7 < maxX)
								tileHeights[i_1][i_7][i_3] = tileHeights[i_1][i_7][i_3 - 1];
					if (i_2 >= 0 && i_3 >= 0 && i_2 < maxX && i_3 < maxY)
						if (i_1 == 0) {
							if (i_2 > 0 && tileHeights[0][i_2 - 1][i_3] != 0)
								tileHeights[i_1][i_2][i_3] = tileHeights[i_1][i_2 - 1][i_3];
							else if (i_3 > 0 && tileHeights[i_1][i_2][i_3 - 1] != 0)
								tileHeights[i_1][i_2][i_3] = tileHeights[i_1][i_2][i_3 - 1];
							else if (i_2 > 0 && i_3 > 0 && tileHeights[i_1][i_2 - 1][i_3 - 1] != 0)
								tileHeights[i_1][i_2][i_3] = tileHeights[i_1][i_2 - 1][i_3 - 1];
						} else if (i_2 > 0 && tileHeights[i_1 - 1][i_2 - 1][i_3] != tileHeights[i_1][i_2 - 1][i_3])
							tileHeights[i_1][i_2][i_3] = tileHeights[i_1][i_2 - 1][i_3];
						else if (i_3 > 0 && tileHeights[i_1][i_2][i_3 - 1] != tileHeights[i_1 - 1][i_2][i_3 - 1])
							tileHeights[i_1][i_2][i_3] = tileHeights[i_1][i_2][i_3 - 1];
						else if (i_2 > 0 && i_3 > 0 && tileHeights[i_1 - 1][i_2 - 1][i_3 - 1] != tileHeights[i_1][i_2 - 1][i_3 - 1])
							tileHeights[i_1][i_2][i_3] = tileHeights[i_1][i_2 - 1][i_3 - 1];
	}

	public void method5841(ByteBuf rsbytebuffer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, ClipFlagMap[] arr_9) {
		int i_11 = (i_6 & 0x7) * 8;
		int i_12 = (i_7 & 0x7) * 8;
		int i_14;
		int i_17;
		if (!overlayHidden) {
			ClipFlagMap clipmap_13 = arr_9[i_2];
			for (i_14 = 0; i_14 < 8; i_14++)
				for (int i_15 = 0; i_15 < 8; i_15++) {
					int i_16 = i_3 + Class112.method1871(i_14 & 0x7, i_15 & 0x7, i_8);
					i_17 = i_4 + Class2.method259(i_14 & 0x7, i_15 & 0x7, i_8);
					if (i_16 > 0 && i_16 < maxX - 1 && i_17 > 0 && i_17 < maxY - 1)
						clipmap_13.removeBlockedTile(i_16, i_17);
				}
		}
		int i_28 = (i_6 & -8) << 3;
		i_14 = (i_7 & -8) << 3;
		byte b_29 = 0;
		byte b_30 = 0;
		if (i_8 == 1)
			b_30 = 1;
		else if (i_8 == 2) {
			b_29 = 1;
			b_30 = 1;
		} else if (i_8 == 3)
			b_29 = 1;
		for (i_17 = 0; i_17 < anInt3845; i_17++)
			for (int i_18 = 0; i_18 < 64; i_18++)
				for (int i_19 = 0; i_19 < 64; i_19++)
					if (i_5 == i_17 && i_18 >= i_11 && i_18 <= i_11 + 8 && i_19 >= i_12 && i_19 <= i_12 + 8) {
						int i_20;
						int i_21;
						if (i_18 != i_11 + 8 && i_12 + 8 != i_19) {
							i_20 = i_3 + Class112.method1871(i_18 & 0x7, i_19 & 0x7, i_8);
							i_21 = i_4 + Class2.method259(i_18 & 0x7, i_19 & 0x7, i_8);
							decodeTileMasks(rsbytebuffer_1, i_2, i_20, i_21, b_29, b_30, i_28 + i_18, i_14 + i_19, i_8, false);
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
							decodeTileMasks(rsbytebuffer_1, i_2, i_20, i_21, 0, 0, i_28 + i_18, i_14 + i_19, 0, true);
						}
						if (i_18 == 63 || i_19 == 63) {
							byte b_22 = 1;
							if (i_18 == 63 && i_19 == 63)
								b_22 = 3;
							for (int i_23 = 0; i_23 < b_22; i_23++) {
								int i_24 = i_18;
								int i_25 = i_19;
								if (i_23 == 0) {
									i_24 = i_18 == 63 ? 64 : i_18;
									i_25 = i_19 == 63 ? 64 : i_19;
								} else if (i_23 == 1)
									i_24 = 64;
								else if (i_23 == 2)
									i_25 = 64;
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
								if (i_26 >= 0 && i_26 < maxX && i_27 >= 0 && i_27 < maxY)
									tileHeights[i_2][i_26][i_27] = tileHeights[i_2][i_20 + b_29][b_30 + i_21];
							}
						}
					} else
						decodeTileMasks(rsbytebuffer_1, 0, -1, -1, 0, 0, 0, 0, 0, false);
	}

	void method5845(Ground ground, int plane, int[][] ints_4, Ground class390_5, Ground class390_6) {
		for (int x = 0; x < maxX; x++)
			for (int y = 0; y < maxY; y++) {
				byte pathShape = overlayPathShapes[plane][x][y];
				byte pathRotation = overlayRotations[plane][x][y];
				int overlayId = overlayIds[plane][x][y] & 0xff;
				int underlayId = underlayIds[plane][x][y] & 0xff;
				OverlayDef overlay = overlayId != 0 ? aClass536_3834.getOverlayDef(overlayId - 1) : null;
				UnderlayDef underlay = underlayId != 0 ? aClass479_3789.getUnderlayDef(underlayId - 1) : null;
				if (pathShape == 0 && overlay == null)
					pathShape = 12;
				OverlayDef overlaydef_16 = overlay;
				if (overlay != null && overlay.primaryRGB == -1 && overlay.secondaryRGB == -1) {
					overlaydef_16 = overlay;
					overlay = null;
				}
				if (overlay != null || underlay != null) {
					underlayFaceCount = UNDERLAY_FACE_COUNT[pathShape];
					overlayFaceCount = OVERLAY_FACE_COUNT[pathShape];
					int i_17 = (underlay != null ? underlayFaceCount : 0) + (overlay != null ? overlayFaceCount : 0);
					int i_18 = 0;
					anInt3781 = 0;
					anInt3848 = overlay != null ? overlay.texture : -1;
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
						for (i_27 = 0; i_27 < overlayFaceCount; i_27++) {
							ints_20[i_18] = anIntArrayArray3824[pathShape][anInt3781];
							ints_21[i_18] = anIntArrayArray3860[pathShape][anInt3781];
							ints_22[i_18] = anIntArrayArray3815[pathShape][anInt3781];
							ints_24[i_18] = anInt3848;
							ints_25[i_18] = overlay.anInt7057;
							ints_23[i_18] = overlay.primaryRGB;
							if (ints_26 != null)
								ints_26[i_18] = overlay.secondaryRGB;
							++i_18;
							++anInt3781;
						}
						if (!overlayHidden && plane == 0)
							sceneObjectManager.setTileData(x, y, overlay.waterColour, overlay.waterScale, overlay.waterIntensity, overlay.anInt7065, overlay.anInt7055, overlay.anInt7067);
					} else
						anInt3781 += overlayFaceCount;
					if (underlay != null)
						for (i_27 = 0; i_27 < underlayFaceCount; i_27++) {
							ints_20[i_18] = anIntArrayArray3824[pathShape][anInt3781];
							ints_21[i_18] = anIntArrayArray3860[pathShape][anInt3781];
							ints_22[i_18] = anIntArrayArray3815[pathShape][anInt3781];
							ints_24[i_18] = i_19;
							ints_25[i_18] = underlay.scale;
							ints_23[i_18] = ints_4[x][y];
							if (ints_26 != null)
								ints_26[i_18] = ints_23[i_18];
							++i_18;
							++anInt3781;
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
							ints_30[i_32] = class390_6.averageHeight(i_35, i_36) - ground.averageHeight(i_35, i_36);
						}
						if (ints_31 != null)
							if (class390_6 != null && !aBoolArrayArray3822[pathShape][i_32]) {
								i_35 = (x << 9) + ints_28[i_32];
								i_36 = (y << 9) + ints_29[i_32];
								ints_31[i_32] = ground.averageHeight(i_35, i_36) - class390_6.averageHeight(i_35, i_36);
							} else if (class390_5 != null && !aBoolArrayArray3823[pathShape][i_32]) {
								i_35 = (x << 9) + ints_28[i_32];
								i_36 = (y << 9) + ints_29[i_32];
								ints_31[i_32] = class390_5.averageHeight(i_35, i_36) - ground.averageHeight(i_35, i_36);
							}
					}
					i_32 = ground.getHeight(x, y);
					i_33 = ground.getHeight(x + 1, y);
					i_34 = ground.getHeight(x + 1, y + 1);
					i_35 = ground.getHeight(x, y + 1);
					boolean bool_39 = regionMap.isLowerObjectsToOverrideClipping(x, y);
					if (bool_39 ? plane > 1 : plane > 0) {
						boolean bool_37 = true;
						if ((underlay != null && !underlay.aBool5722) || (underlayId == 0 && pathShape != 0))
							bool_37 = false;
						else if (overlayId > 0 && overlaydef_16 != null && !overlaydef_16.aBool7056)
							bool_37 = false;
						if (bool_37 && i_32 == i_33 && i_32 == i_34 && i_32 == i_35)
							aByteArrayArrayArray3794[plane][x][y] |= 0x4;
					}
					HDWaterTile tile = new HDWaterTile();
					if (overlayHidden) {
						tile.color = sceneObjectManager.getColor(x, y);
						tile.scale = sceneObjectManager.getScale(x, y);
						tile.intensity = sceneObjectManager.getIntensities(x, y);
						tile.hdWaterInt1 = sceneObjectManager.method3432(x, y);
						tile.hdWaterInt2 = sceneObjectManager.method3464(x, y);
						tile.hdWaterInt3 = sceneObjectManager.method3391(x, y);
					}
					ground.method6708(x, y, ints_28, ints_30, ints_29, ints_31, ints_20, ints_21, ints_22, ints_23, ints_26, ints_24, ints_25, tile);
					sceneObjectManager.method3384(plane, x, y);
				}
			}
	}

	void method5846(AbstractRenderer graphicalrenderer_1, Ground class390_2, int i_3, int[][] ints_4, Ground class390_5, Ground class390_6) {
		byte[][] bytes_8 = overlayPathShapes[i_3];
		byte[][] bytes_9 = overlayRotations[i_3];
		byte[][] bytes_10 = underlayIds[i_3];
		byte[][] bytes_11 = overlayIds[i_3];
		boolean[] bools_12 = new boolean[4];
		for (int i_13 = 0; i_13 < maxX; i_13++) {
			int i_14 = i_13 < maxX - 1 ? i_13 + 1 : i_13;
			for (int i_15 = 0; i_15 < maxY; i_15++) {
				int i_16 = i_15 < maxY - 1 ? i_15 + 1 : i_15;
				anInt3844 = bytes_8[i_13][i_15];
				anInt3781 = bytes_9[i_13][i_15];
				int overlayId = bytes_11[i_13][i_15] & 0xff;
				int underlayId = bytes_10[i_13][i_15] & 0xff;
				if (overlayId != 0 || underlayId != 0) {
					OverlayDef overlaydef_19 = overlayId != 0 ? aClass536_3834.getOverlayDef(overlayId - 1) : null;
					UnderlayDef underlaydef_20 = underlayId != 0 ? aClass479_3789.getUnderlayDef(underlayId - 1) : null;
					if (anInt3844 == 0 && overlaydef_19 == null)
						anInt3844 = 12;
					aBool3851 = false;
					aBool3810 = false;
					bools_12[3] = false;
					bools_12[2] = false;
					bools_12[1] = false;
					bools_12[0] = false;
					OverlayDef overlaydef_24 = overlaydef_19;
					if (overlaydef_19 != null)
						if (overlaydef_19.primaryRGB == -1 && overlaydef_19.secondaryRGB == -1) {
							overlaydef_24 = overlaydef_19;
							overlaydef_19 = null;
						} else if (underlaydef_20 != null && anInt3844 != 0)
							aBool3810 = overlaydef_19.aBool7061;
					anInt3781 = method5870(underlayId, i_13, i_15, i_14, i_16, class390_2, bytes_10);
					int i_25;
					for (i_25 = 0; i_25 < 13; i_25++) {
						anIntArray3842[i_25] = -1;
						anIntArray3843[i_25] = 1;
					}
					method5859(graphicalrenderer_1, overlaydef_19, i_13, i_15, bytes_8, bytes_9, bytes_11, bools_12);
					aBool3853 = !aBool3810 && !bools_12[0] && !bools_12[2] && !bools_12[1] && !bools_12[3];
					method5849(overlaydef_19, underlaydef_20);
					i_25 = underlayFaceCount + overlayFaceCount;
					if (i_25 <= 0)
						sceneObjectManager.method3384(i_3, i_13, i_15);
					else {
						if (bools_12[0])
							++i_25;
						if (bools_12[2])
							++i_25;
						if (bools_12[1])
							++i_25;
						if (bools_12[3])
							++i_25;
						anInt3846 = 0;
						index = 0;
						int i_26 = i_25 * 3;
						int[] ints_27 = aBool3854 ? new int[i_26] : null;
						int[] ints_28 = new int[i_26];
						int[] ints_29 = new int[i_26];
						int[] ints_30 = new int[i_26];
						int[] ints_31 = new int[i_26];
						int[] ints_32 = new int[i_26];
						int[] ints_33 = class390_6 != null ? new int[i_26] : null;
						int[] ints_34 = class390_6 == null && class390_5 == null ? null : new int[i_26];
						method5850(graphicalrenderer_1, i_3, i_13, i_15, overlaydef_19, bools_12, ints_27, ints_28, ints_29, ints_30, ints_31, ints_32, ints_33, ints_34, class390_2, class390_6, class390_5);
						int i_35 = bytes_10[i_13][i_16] & 0xff;
						int i_36 = bytes_10[i_14][i_16] & 0xff;
						int i_37 = bytes_10[i_14][i_15] & 0xff;
						method5851(i_13, i_15, i_14, i_16, underlaydef_20, underlayId, i_35, i_36, i_37, bools_12, ints_27, ints_28, ints_29, ints_30, ints_31, ints_32, ints_33, ints_34, ints_4, class390_2, class390_6, class390_5);
						method5852(class390_2, underlaydef_20, overlaydef_24, i_3, i_13, i_15, i_14, i_16, underlayId, overlayId);
						HDWaterTile class90_38 = new HDWaterTile();
						if (overlayHidden) {
							class90_38.color = sceneObjectManager.getColor(i_13, i_15);
							class90_38.scale = sceneObjectManager.getScale(i_13, i_15);
							class90_38.intensity = sceneObjectManager.getIntensities(i_13, i_15);
							class90_38.hdWaterInt1 = sceneObjectManager.method3432(i_13, i_15);
							class90_38.hdWaterInt2 = sceneObjectManager.method3464(i_13, i_15);
							class90_38.hdWaterInt3 = sceneObjectManager.method3391(i_13, i_15);
						}
						class390_2.method6707(i_13, i_15, ints_28, ints_33, ints_29, ints_34, ints_30, ints_27, ints_31, ints_32, class90_38, aBool3851);
						sceneObjectManager.method3384(i_3, i_13, i_15);
					}
				}
			}
		}
	}

	void method5848(AbstractRenderer graphicalrenderer_1, OverlayDef overlaydef_2, int i_4, int i_5, int i_6, int i_7, byte[][] bytes_8, byte[][] bytes_9, byte[][] bytes_10, boolean[] bools_11) {
		boolean[] bools_13 = overlaydef_2 != null && overlaydef_2.aBool7061 ? aBoolArrayArray3793[anInt3844] : aBoolArrayArray3816[anInt3844];
		int i_14;
		OverlayDef overlaydef_15;
		byte b_16;
		int i_17;
		int i_18;
		if (i_5 > 0) {
			if (i_4 > 0) {
				i_14 = bytes_8[i_4 - 1][i_5 - 1] & 0xff;
				if (i_14 > 0) {
					overlaydef_15 = aClass536_3834.getOverlayDef(i_14 - 1);
					if (overlaydef_15.primaryRGB != -1 && overlaydef_15.aBool7061) {
						b_16 = bytes_9[i_4 - 1][i_5 - 1];
						i_17 = bytes_10[i_4 - 1][i_5 - 1] * 2 + 4 & 0x7;
						i_18 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_15);
						if (aBoolArrayArray3822[b_16][i_17]) {
							anIntArray3838[0] = overlaydef_15.primaryRGB;
							anIntArray3839[0] = i_18;
							anIntArray3813[0] = overlaydef_15.texture;
							anIntArray3827[0] = overlaydef_15.anInt7057;
							anIntArray3842[0] = overlaydef_15.anInt7052;
							anIntArray3843[0] = 256;
						}
					}
				}
			}
			if (i_4 < i_6 - 1) {
				i_14 = bytes_8[i_4 + 1][i_5 - 1] & 0xff;
				if (i_14 > 0) {
					overlaydef_15 = aClass536_3834.getOverlayDef(i_14 - 1);
					if (overlaydef_15.primaryRGB != -1 && overlaydef_15.aBool7061) {
						b_16 = bytes_9[i_4 + 1][i_5 - 1];
						i_17 = bytes_10[i_4 + 1][i_5 - 1] * 2 + 6 & 0x7;
						i_18 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_15);
						if (aBoolArrayArray3822[b_16][i_17]) {
							anIntArray3838[2] = overlaydef_15.primaryRGB;
							anIntArray3839[2] = i_18;
							anIntArray3813[2] = overlaydef_15.texture;
							anIntArray3827[2] = overlaydef_15.anInt7057;
							anIntArray3842[2] = overlaydef_15.anInt7052;
							anIntArray3843[2] = 512;
						}
					}
				}
			}
		}
		if (i_5 < i_7 - 1) {
			if (i_4 > 0) {
				i_14 = bytes_8[i_4 - 1][i_5 + 1] & 0xff;
				if (i_14 > 0) {
					overlaydef_15 = aClass536_3834.getOverlayDef(i_14 - 1);
					if (overlaydef_15.primaryRGB != -1 && overlaydef_15.aBool7061) {
						b_16 = bytes_9[i_4 - 1][i_5 + 1];
						i_17 = bytes_10[i_4 - 1][i_5 + 1] * 2 + 2 & 0x7;
						i_18 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_15);
						if (aBoolArrayArray3822[b_16][i_17]) {
							anIntArray3838[6] = overlaydef_15.primaryRGB;
							anIntArray3839[6] = i_18;
							anIntArray3813[6] = overlaydef_15.texture;
							anIntArray3827[6] = overlaydef_15.anInt7057;
							anIntArray3842[6] = overlaydef_15.anInt7052;
							anIntArray3843[6] = 64;
						}
					}
				}
			}
			if (i_4 < i_6 - 1) {
				i_14 = bytes_8[i_4 + 1][i_5 + 1] & 0xff;
				if (i_14 > 0) {
					overlaydef_15 = aClass536_3834.getOverlayDef(i_14 - 1);
					if (overlaydef_15.primaryRGB != -1 && overlaydef_15.aBool7061) {
						b_16 = bytes_9[i_4 + 1][i_5 + 1];
						i_17 = bytes_10[i_4 + 1][i_5 + 1] * 2 & 0x7;
						i_18 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_15);
						if (aBoolArrayArray3822[b_16][i_17]) {
							anIntArray3838[4] = overlaydef_15.primaryRGB;
							anIntArray3839[4] = i_18;
							anIntArray3813[4] = overlaydef_15.texture;
							anIntArray3827[4] = overlaydef_15.anInt7057;
							anIntArray3842[4] = overlaydef_15.anInt7052;
							anIntArray3843[4] = 128;
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
				overlaydef_15 = aClass536_3834.getOverlayDef(i_14 - 1);
				if (overlaydef_15.primaryRGB != -1) {
					b_16 = bytes_9[i_4][i_5 - 1];
					b_23 = bytes_10[i_4][i_5 - 1];
					if (overlaydef_15.aBool7061) {
						i_18 = 2;
						i_19 = b_23 * 2 + 4;
						i_20 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_15);
						for (i_21 = 0; i_21 < 3; i_21++) {
							i_19 &= 0x7;
							i_18 &= 0x7;
							if (aBoolArrayArray3822[b_16][i_19] && anIntArray3842[i_18] <= overlaydef_15.anInt7052) {
								anIntArray3838[i_18] = overlaydef_15.primaryRGB;
								anIntArray3839[i_18] = i_20;
								anIntArray3813[i_18] = overlaydef_15.texture;
								anIntArray3827[i_18] = overlaydef_15.anInt7057;
								if (overlaydef_15.anInt7052 == anIntArray3842[i_18])
									anIntArray3843[i_18] |= 0x20;
								else
									anIntArray3843[i_18] = 32;
								anIntArray3842[i_18] = overlaydef_15.anInt7052;
							}
							++i_19;
							--i_18;
						}
						if (!bools_13[anInt3781 & 0x3])
							bools_11[0] = aBoolArrayArray3793[b_16][b_23 + 2 & 0x3];
					} else if (!bools_13[anInt3781 & 0x3])
						bools_11[0] = aBoolArrayArray3816[b_16][b_23 + 2 & 0x3];
				}
			}
		}
		if (i_5 < i_7 - 1) {
			i_14 = bytes_8[i_4][i_5 + 1] & 0xff;
			if (i_14 > 0) {
				overlaydef_15 = aClass536_3834.getOverlayDef(i_14 - 1);
				if (overlaydef_15.primaryRGB != -1) {
					b_16 = bytes_9[i_4][i_5 + 1];
					b_23 = bytes_10[i_4][i_5 + 1];
					if (overlaydef_15.aBool7061) {
						i_18 = 4;
						i_19 = b_23 * 2 + 2;
						i_20 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_15);
						for (i_21 = 0; i_21 < 3; i_21++) {
							i_19 &= 0x7;
							i_18 &= 0x7;
							if (aBoolArrayArray3822[b_16][i_19] && anIntArray3842[i_18] <= overlaydef_15.anInt7052) {
								anIntArray3838[i_18] = overlaydef_15.primaryRGB;
								anIntArray3839[i_18] = i_20;
								anIntArray3813[i_18] = overlaydef_15.texture;
								anIntArray3827[i_18] = overlaydef_15.anInt7057;
								if (overlaydef_15.anInt7052 == anIntArray3842[i_18])
									anIntArray3843[i_18] |= 0x10;
								else
									anIntArray3843[i_18] = 16;
								anIntArray3842[i_18] = overlaydef_15.anInt7052;
							}
							--i_19;
							++i_18;
						}
						if (!bools_13[anInt3781 + 2 & 0x3])
							bools_11[2] = aBoolArrayArray3793[b_16][b_23 & 0x3];
					} else if (!bools_13[anInt3781 + 2 & 0x3])
						bools_11[2] = aBoolArrayArray3816[b_16][b_23 & 0x3];
				}
			}
		}
		if (i_4 > 0) {
			i_14 = bytes_8[i_4 - 1][i_5] & 0xff;
			if (i_14 > 0) {
				overlaydef_15 = aClass536_3834.getOverlayDef(i_14 - 1);
				if (overlaydef_15.primaryRGB != -1) {
					b_16 = bytes_9[i_4 - 1][i_5];
					b_23 = bytes_10[i_4 - 1][i_5];
					if (overlaydef_15.aBool7061) {
						i_18 = 6;
						i_19 = b_23 * 2 + 4;
						i_20 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_15);
						for (i_21 = 0; i_21 < 3; i_21++) {
							i_19 &= 0x7;
							i_18 &= 0x7;
							if (aBoolArrayArray3822[b_16][i_19] && anIntArray3842[i_18] <= overlaydef_15.anInt7052) {
								anIntArray3838[i_18] = overlaydef_15.primaryRGB;
								anIntArray3839[i_18] = i_20;
								anIntArray3813[i_18] = overlaydef_15.texture;
								anIntArray3827[i_18] = overlaydef_15.anInt7057;
								if (overlaydef_15.anInt7052 == anIntArray3842[i_18])
									anIntArray3843[i_18] |= 0x8;
								else
									anIntArray3843[i_18] = 8;
								anIntArray3842[i_18] = overlaydef_15.anInt7052;
							}
							--i_19;
							++i_18;
						}
						if (!bools_13[anInt3781 + 3 & 0x3])
							bools_11[3] = aBoolArrayArray3793[b_16][b_23 + 1 & 0x3];
					} else if (!bools_13[anInt3781 + 3 & 0x3])
						bools_11[3] = aBoolArrayArray3816[b_16][b_23 + 1 & 0x3];
				}
			}
		}
		if (i_4 < i_6 - 1) {
			i_14 = bytes_8[i_4 + 1][i_5] & 0xff;
			if (i_14 > 0) {
				overlaydef_15 = aClass536_3834.getOverlayDef(i_14 - 1);
				if (overlaydef_15.primaryRGB != -1) {
					b_16 = bytes_9[i_4 + 1][i_5];
					b_23 = bytes_10[i_4 + 1][i_5];
					if (overlaydef_15.aBool7061) {
						i_18 = 4;
						i_19 = b_23 * 2 + 6;
						i_20 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_15);
						for (i_21 = 0; i_21 < 3; i_21++) {
							i_19 &= 0x7;
							i_18 &= 0x7;
							if (aBoolArrayArray3822[b_16][i_19] && anIntArray3842[i_18] <= overlaydef_15.anInt7052) {
								anIntArray3838[i_18] = overlaydef_15.primaryRGB;
								anIntArray3839[i_18] = i_20;
								anIntArray3813[i_18] = overlaydef_15.texture;
								anIntArray3827[i_18] = overlaydef_15.anInt7057;
								if (overlaydef_15.anInt7052 == anIntArray3842[i_18])
									anIntArray3843[i_18] |= 0x4;
								else
									anIntArray3843[i_18] = 4;
								anIntArray3842[i_18] = overlaydef_15.anInt7052;
							}
							++i_19;
							--i_18;
						}
						if (!bools_13[anInt3781 + 1 & 0x3])
							bools_11[1] = aBoolArrayArray3793[b_16][b_23 + 3 & 0x3];
					} else if (!bools_13[anInt3781 + 1 & 0x3])
						bools_11[1] = aBoolArrayArray3816[b_16][b_23 + 3 & 0x3];
				}
			}
		}
		if (overlaydef_2 != null && overlaydef_2.aBool7061) {
			i_14 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_2);
			for (int i_22 = 0; i_22 < 8; i_22++) {
				int i_24 = i_22 - anInt3781 * 2 & 0x7;
				if (aBoolArrayArray3822[anInt3844][i_22] && anIntArray3842[i_24] <= overlaydef_2.anInt7052) {
					anIntArray3838[i_24] = overlaydef_2.primaryRGB;
					anIntArray3839[i_24] = i_14;
					anIntArray3813[i_24] = overlaydef_2.texture;
					anIntArray3827[i_24] = overlaydef_2.anInt7057;
					if (overlaydef_2.anInt7052 == anIntArray3842[i_24])
						anIntArray3843[i_24] |= 0x2;
					else
						anIntArray3843[i_24] = 2;
					anIntArray3842[i_24] = overlaydef_2.anInt7052;
				}
			}
		}
	}

	void method5849(OverlayDef overlayDef, UnderlayDef underlayDef) {
		if (aBool3853) {
			anIntArray3857 = anIntArrayArray3824[anInt3844];
			anIntArray3858 = anIntArrayArray3860[anInt3844];
			anIntArray3859 = anIntArrayArray3815[anInt3844];
			overlayFaceCount = overlayDef != null ? OVERLAY_FACE_COUNT[anInt3844] : 0;
			underlayFaceCount = underlayDef != null ? UNDERLAY_FACE_COUNT[anInt3844] : 0;
		} else if (aBool3810) {
			anIntArray3857 = anIntArrayArray3775[anInt3844];
			anIntArray3858 = anIntArrayArray3821[anInt3844];
			anIntArray3859 = anIntArrayArray3836[anInt3844];
			overlayFaceCount = overlayDef != null ? anIntArray3778[anInt3844] : 0;
			underlayFaceCount = underlayDef != null ? anIntArray3819[anInt3844] : 0;
			anIntArray3832 = anIntArrayArray3833[anInt3844];
		} else {
			anIntArray3857 = anIntArrayArray3774[anInt3844];
			anIntArray3858 = anIntArrayArray3830[anInt3844];
			anIntArray3859 = anIntArrayArray3831[anInt3844];
			overlayFaceCount = overlayDef != null ? anIntArray3826[anInt3844] : 0;
			underlayFaceCount = underlayDef != null ? anIntArray3847[anInt3844] : 0;
			anIntArray3832 = anIntArrayArray3828[anInt3844];
		}
	}

	void method5850(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, OverlayDef overlaydef_5, boolean[] bools_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] waterTextures, int[] ints_12, int[] ints_13, int[] ints_14, Ground class390_15, Ground class390_16, Ground class390_17) {
		anInt3850 = -1;
		anInt3848 = -1;
		anInt3849 = 256;
		if (overlaydef_5 != null) {
			anInt3850 = overlaydef_5.primaryRGB;
			anInt3848 = overlaydef_5.texture;
			anInt3849 = overlaydef_5.anInt7057;
			int i_19 = VarNPCMap.method2617(graphicalrenderer_1, overlaydef_5);
			for (int i_20 = 0; i_20 < overlayFaceCount; i_20++) {
				boolean bool_21 = false;
				byte b_22;
				if (bools_6[-anInt3781 & 0x3] && anInt3846 == anIntArray3832[0]) {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = 1;
					anIntArray3837[2] = anIntArray3859[anInt3846];
					anIntArray3837[3] = 1;
					anIntArray3837[4] = anIntArray3858[anInt3846];
					anIntArray3837[5] = anIntArray3859[anInt3846];
					b_22 = 6;
				} else if (bools_6[2 - anInt3781 & 0x3] && anIntArray3832[2] == anInt3846) {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = 5;
					anIntArray3837[2] = anIntArray3859[anInt3846];
					anIntArray3837[3] = 5;
					anIntArray3837[4] = anIntArray3858[anInt3846];
					anIntArray3837[5] = anIntArray3859[anInt3846];
					b_22 = 6;
				} else if (bools_6[1 - anInt3781 & 0x3] && anIntArray3832[1] == anInt3846) {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = 3;
					anIntArray3837[2] = anIntArray3859[anInt3846];
					anIntArray3837[3] = 3;
					anIntArray3837[4] = anIntArray3858[anInt3846];
					anIntArray3837[5] = anIntArray3859[anInt3846];
					b_22 = 6;
				} else if (bools_6[3 - anInt3781 & 0x3] && anIntArray3832[3] == anInt3846) {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = 7;
					anIntArray3837[2] = anIntArray3859[anInt3846];
					anIntArray3837[3] = 7;
					anIntArray3837[4] = anIntArray3858[anInt3846];
					anIntArray3837[5] = anIntArray3859[anInt3846];
					b_22 = 6;
				} else {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = anIntArray3858[anInt3846];
					anIntArray3837[2] = anIntArray3859[anInt3846];
					b_22 = 3;
				}
				for (int i_23 = 0; i_23 < b_22; i_23++) {
					int i_24 = anIntArray3837[i_23];
					int i_25 = i_24 - anInt3781 * 2 & 0x7;
					int i_26 = anIntArray3811[i_24];
					int i_27 = anIntArray3800[i_24];
					int i_28;
					int i_29;
					if (anInt3781 == 1) {
						i_28 = i_27;
						i_29 = 512 - i_26;
					} else if (anInt3781 == 2) {
						i_28 = 512 - i_26;
						i_29 = 512 - i_27;
					} else if (anInt3781 == 3) {
						i_28 = 512 - i_27;
						i_29 = i_26;
					} else {
						i_28 = i_26;
						i_29 = i_27;
					}
					ints_8[index] = i_28;
					ints_9[index] = i_29;
					int i_30;
					int i_31;
					if (ints_13 != null && aBoolArrayArray3822[anInt3844][i_24]) {
						i_30 = (i_3 << 9) + i_28;
						i_31 = (i_4 << 9) + i_29;
						ints_13[index] = class390_16.averageHeight(i_30, i_31) - class390_15.averageHeight(i_30, i_31);
					}
					if (ints_14 != null)
						if (class390_16 != null && !aBoolArrayArray3822[anInt3844][i_24]) {
							i_30 = (i_3 << 9) + i_28;
							i_31 = (i_4 << 9) + i_29;
							ints_14[index] = class390_15.averageHeight(i_30, i_31) - class390_16.averageHeight(i_30, i_31);
						} else if (class390_17 != null && !aBoolArrayArray3823[anInt3844][i_24]) {
							i_30 = (i_3 << 9) + i_28;
							i_31 = (i_4 << 9) + i_29;
							ints_14[index] = class390_17.averageHeight(i_30, i_31) - class390_15.averageHeight(i_30, i_31);
						}
					if (i_24 < 8 && anIntArray3842[i_25] > overlaydef_5.anInt7052) {
						if (ints_7 != null)
							ints_7[index] = anIntArray3839[i_25];
						ints_12[index] = anIntArray3827[i_25];
						waterTextures[index] = anIntArray3813[i_25];
						ints_10[index] = anIntArray3838[i_25];
					} else {
						if (ints_7 != null)
							ints_7[index] = i_19;
						// set water texture
						waterTextures[index] = overlaydef_5.texture;
						ints_12[index] = overlaydef_5.anInt7057;
						ints_10[index] = anInt3850;
					}
					++index;
				}
				++anInt3846;
			}
			if (!overlayHidden && i_2 == 0)
				sceneObjectManager.setTileData(i_3, i_4, overlaydef_5.waterColour, overlaydef_5.waterScale, overlaydef_5.waterIntensity, overlaydef_5.anInt7065, overlaydef_5.anInt7055, overlaydef_5.anInt7067);
			if (anInt3844 != 12 && overlaydef_5.primaryRGB != -1 && overlaydef_5.aBool7059)
				aBool3851 = true;
		} else if (aBool3853)
			anInt3846 += OVERLAY_FACE_COUNT[anInt3844];
		else if (aBool3810)
			anInt3846 += anIntArray3778[anInt3844];
		else
			anInt3846 += anIntArray3826[anInt3844];
	}

	void method5851(int i_3, int i_4, int i_5, int i_6, UnderlayDef underlaydef_7, int i_8, int i_9, int i_10, int i_11, boolean[] bools_12, int[] ints_13, int[] ints_14, int[] ints_15, int[] ints_16, int[] waterTextures, int[] ints_18, int[] ints_19, int[] ints_20, int[][] ints_21, Ground class390_22, Ground class390_23, Ground class390_24) {
		int i_91 = i_9;
		int i_101 = i_10;
		int i_111 = i_11;
		if (underlaydef_7 != null) {
			if (i_91 == 0)
				i_91 = i_8;
			if (i_101 == 0)
				i_101 = i_8;
			if (i_111 == 0)
				i_111 = i_8;
			UnderlayDef underlaydef_26 = aClass479_3789.getUnderlayDef(i_8 - 1);
			UnderlayDef underlaydef_27 = aClass479_3789.getUnderlayDef(i_91 - 1);
			UnderlayDef underlaydef_28 = aClass479_3789.getUnderlayDef(i_101 - 1);
			UnderlayDef underlaydef_29 = aClass479_3789.getUnderlayDef(i_111 - 1);
			for (int i_30 = 0; i_30 < underlayFaceCount; i_30++) {
				boolean bool_31 = false;
				byte b_32;
				if (bools_12[-anInt3781 & 0x3] && anInt3846 == anIntArray3832[0]) {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = 1;
					anIntArray3837[2] = anIntArray3859[anInt3846];
					anIntArray3837[3] = 1;
					anIntArray3837[4] = anIntArray3858[anInt3846];
					anIntArray3837[5] = anIntArray3859[anInt3846];
					b_32 = 6;
				} else if (bools_12[2 - anInt3781 & 0x3] && anIntArray3832[2] == anInt3846) {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = 5;
					anIntArray3837[2] = anIntArray3859[anInt3846];
					anIntArray3837[3] = 5;
					anIntArray3837[4] = anIntArray3858[anInt3846];
					anIntArray3837[5] = anIntArray3859[anInt3846];
					b_32 = 6;
				} else if (bools_12[1 - anInt3781 & 0x3] && anIntArray3832[1] == anInt3846) {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = 3;
					anIntArray3837[2] = anIntArray3859[anInt3846];
					anIntArray3837[3] = 3;
					anIntArray3837[4] = anIntArray3858[anInt3846];
					anIntArray3837[5] = anIntArray3859[anInt3846];
					b_32 = 6;
				} else if (bools_12[3 - anInt3781 & 0x3] && anIntArray3832[3] == anInt3846) {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = 7;
					anIntArray3837[2] = anIntArray3859[anInt3846];
					anIntArray3837[3] = 7;
					anIntArray3837[4] = anIntArray3858[anInt3846];
					anIntArray3837[5] = anIntArray3859[anInt3846];
					b_32 = 6;
				} else {
					anIntArray3837[0] = anIntArray3857[anInt3846];
					anIntArray3837[1] = anIntArray3858[anInt3846];
					anIntArray3837[2] = anIntArray3859[anInt3846];
					b_32 = 3;
				}
				for (int i_33 = 0; i_33 < b_32; i_33++) {
					int i_34 = anIntArray3837[i_33];
					int i_35 = i_34 - anInt3781 * 2 & 0x7;
					int i_36 = anIntArray3811[i_34];
					int i_37 = anIntArray3800[i_34];
					int i_38;
					int i_39;
					if (anInt3781 == 1) {
						i_38 = i_37;
						i_39 = 512 - i_36;
					} else if (anInt3781 == 2) {
						i_38 = 512 - i_36;
						i_39 = 512 - i_37;
					} else if (anInt3781 == 3) {
						i_38 = 512 - i_37;
						i_39 = i_36;
					} else {
						i_38 = i_36;
						i_39 = i_37;
					}
					ints_14[index] = i_38;
					ints_15[index] = i_39;
					int i_40;
					int i_41;
					if (ints_19 != null && aBoolArrayArray3822[anInt3844][i_34]) {
						i_40 = (i_3 << 9) + i_38;
						i_41 = (i_4 << 9) + i_39;
						ints_19[index] = class390_23.averageHeight(i_40, i_41) - class390_22.averageHeight(i_40, i_41);
					}
					if (ints_20 != null)
						if (class390_23 != null && !aBoolArrayArray3822[anInt3844][i_34]) {
							i_40 = (i_3 << 9) + i_38;
							i_41 = (i_4 << 9) + i_39;
							ints_20[index] = class390_22.averageHeight(i_40, i_41) - class390_23.averageHeight(i_40, i_41);
						} else if (class390_24 != null && !aBoolArrayArray3823[anInt3844][i_34]) {
							i_40 = (i_3 << 9) + i_38;
							i_41 = (i_4 << 9) + i_39;
							ints_20[index] = class390_24.averageHeight(i_40, i_41) - class390_22.averageHeight(i_40, i_41);
						}
					if (i_34 < 8 && anIntArray3842[i_35] >= 0) {
						if (ints_13 != null)
							ints_13[index] = anIntArray3839[i_35];
						ints_18[index] = anIntArray3827[i_35];
						waterTextures[index] = anIntArray3813[i_35];
						ints_16[index] = anIntArray3838[i_35];
					} else {
						if (aBool3810 && aBoolArrayArray3822[anInt3844][i_34]) {
							waterTextures[index] = anInt3848;
							ints_18[index] = anInt3849;
							ints_16[index] = anInt3850;
						} else if (i_38 == 0 && i_39 == 0) {
							ints_16[index] = ints_21[i_3][i_4];
							waterTextures[index] = underlaydef_26.texture;
							ints_18[index] = underlaydef_26.scale;
						} else if (i_38 == 0 && i_39 == 512) {
							ints_16[index] = ints_21[i_3][i_6];
							waterTextures[index] = underlaydef_27.texture;
							ints_18[index] = underlaydef_27.scale;
						} else if (i_38 == 512 && i_39 == 512) {
							ints_16[index] = ints_21[i_5][i_6];
							waterTextures[index] = underlaydef_28.texture;
							ints_18[index] = underlaydef_28.scale;
						} else if (i_38 == 512 && i_39 == 0) {
							ints_16[index] = ints_21[i_5][i_4];
							waterTextures[index] = underlaydef_29.texture;
							ints_18[index] = underlaydef_29.scale;
						} else {
							if (i_38 < 256) {
								if (i_39 < 256) {
									waterTextures[index] = underlaydef_26.texture;
									ints_18[index] = underlaydef_26.scale;
								} else {
									waterTextures[index] = underlaydef_27.texture;
									ints_18[index] = underlaydef_27.scale;
								}
							} else if (i_39 < 256) {
								waterTextures[index] = underlaydef_29.texture;
								ints_18[index] = underlaydef_29.scale;
							} else {
								waterTextures[index] = underlaydef_28.texture;
								ints_18[index] = underlaydef_28.scale;
							}
							i_40 = Class371.method6347(ints_21[i_3][i_4], ints_21[i_5][i_4], i_38 << 7 >> 9);
							i_41 = Class371.method6347(ints_21[i_3][i_6], ints_21[i_5][i_6], i_38 << 7 >> 9);
							ints_16[index] = Class371.method6347(i_40, i_41, i_39 << 7 >> 9);
						}
						if (ints_13 != null)
							ints_13[index] = ints_16[index];
					}
					++index;
				}
				++anInt3846;
			}
			if (anInt3844 != 0 && underlaydef_7.blockShadow)
				aBool3851 = true;
		}
	}

	void method5852(Ground class390_1, UnderlayDef underlaydef_2, OverlayDef overlaydef_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
		int i_12 = class390_1.getHeight(i_5, i_6);
		int i_13 = class390_1.getHeight(i_7, i_6);
		int i_14 = class390_1.getHeight(i_7, i_8);
		int i_15 = class390_1.getHeight(i_5, i_8);
		boolean bool_16 = regionMap.isLowerObjectsToOverrideClipping(i_5, i_6);
		if (bool_16 ? i_4 > 1 : i_4 > 0) {
			boolean bool_17 = true;
			if ((underlaydef_2 != null && !underlaydef_2.aBool5722) || (i_9 == 0 && anInt3844 != 0))
				bool_17 = false;
			else if (i_10 > 0 && overlaydef_3 != null && !overlaydef_3.aBool7056)
				bool_17 = false;
			if (bool_17 && i_13 == i_12 && i_12 == i_14 && i_12 == i_15)
				aByteArrayArrayArray3794[i_4][i_5][i_6] |= 0x4;
		}
	}

	public void method5853(int[][] ints_2) {
		int[][] ints_4 = tileHeights[0];
		for (int i_5 = 0; i_5 < maxX + 1; i_5++)
			for (int i_6 = 0; i_6 < maxY + 1; i_6++)
				ints_4[i_5][i_6] += ints_2[i_5][i_6];
	}

	void method5859(AbstractRenderer graphicalrenderer_1, OverlayDef overlaydef_2, int i_4, int i_5, byte[][] bytes_6, byte[][] bytes_7, byte[][] bytes_8, boolean[] bools_9) {
		boolean[] bools_11 = overlaydef_2 != null && overlaydef_2.aBool7061 ? aBoolArrayArray3793[anInt3844] : aBoolArrayArray3816[anInt3844];
		method5848(graphicalrenderer_1, overlaydef_2, i_4, i_5, maxX, maxY, bytes_8, bytes_6, bytes_7, bools_9);
		aBool3854 = overlaydef_2 != null && overlaydef_2.primaryRGB != overlaydef_2.secondaryRGB;
		if (!aBool3854)
			for (int i_12 = 0; i_12 < 8; i_12++)
				if (anIntArray3842[i_12] >= 0 && anIntArray3839[i_12] != anIntArray3838[i_12]) {
					aBool3854 = true;
					break;
				}
		byte b_13;
		if (!bools_11[anInt3781 + 1 & 0x3]) {
			b_13 = 1;
			bools_9[b_13] |= (anIntArray3843[2] & anIntArray3843[4]) == 0;
		}
		if (!bools_11[anInt3781 + 3 & 0x3]) {
			b_13 = 3;
			bools_9[b_13] |= (anIntArray3843[6] & anIntArray3843[0]) == 0;
		}
		if (!bools_11[anInt3781 & 0x3]) {
			b_13 = 0;
			bools_9[b_13] |= (anIntArray3843[0] & anIntArray3843[2]) == 0;
		}
		if (!bools_11[anInt3781 + 2 & 0x3]) {
			b_13 = 2;
			bools_9[b_13] |= (anIntArray3843[4] & anIntArray3843[6]) == 0;
		}
		if (!aBool3810 && (anInt3844 == 0 || anInt3844 == 12))
			if (bools_9[0] && !bools_9[1] && !bools_9[2] && bools_9[3]) {
				bools_9[3] = false;
				bools_9[0] = false;
				anInt3844 = anInt3844 == 0 ? 13 : 14;
				anInt3781 = 0;
			} else if (bools_9[0] && bools_9[1] && !bools_9[2] && !bools_9[3]) {
				bools_9[1] = false;
				bools_9[0] = false;
				anInt3844 = anInt3844 == 0 ? 13 : 14;
				anInt3781 = 3;
			} else if (!bools_9[0] && bools_9[1] && bools_9[2] && !bools_9[3]) {
				bools_9[2] = false;
				bools_9[1] = false;
				anInt3844 = anInt3844 == 0 ? 13 : 14;
				anInt3781 = 2;
			} else if (!bools_9[0] && !bools_9[1] && bools_9[2] && bools_9[3]) {
				bools_9[3] = false;
				bools_9[2] = false;
				anInt3844 = anInt3844 == 0 ? 13 : 14;
				anInt3781 = 1;
			}
	}

	int method5870(int i_1, int i_2, int i_3, int i_4, int i_5, Ground class390_6, byte[][] bytes_7) {
		if (((anInt3844 != 0) && (anInt3844 != 12)) || (i_2 <= 0) || (i_3 <= 0) || (i_2 >= maxX) || (i_3 >= maxY))
			return anInt3781;
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
		if (i_13 < 0)
			i_13 = -i_13;
		int i_14 = i_16 - i_18;
		if (i_14 < 0)
			i_14 = -i_14;
		if (i_13 == i_14) {
			i_13 = class390_6.getHeight(i_2, i_3) - class390_6.getHeight(i_4, i_5);
			if (i_13 < 0)
				i_13 = -i_13;
			i_14 = class390_6.getHeight(i_4, i_3) - class390_6.getHeight(i_2, i_5);
			if (i_14 < 0)
				i_14 = -i_14;
		}
		return i_13 < i_14 ? 1 : 0;
	}

	public void method5890(int i_1, int i_2) {
		for (int i_6 = 0; i_6 < anInt3845; i_6++)
			method5838(i_6, i_1, i_2, 64, 64);
	}

	public void method5891() {
		anIntArray3795 = null;
		anIntArray3796 = null;
		anIntArray3797 = null;
		anIntArray3798 = null;
		anIntArray3799 = null;
		aBool3773 = false;
	}
}
