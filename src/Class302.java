public class Class302 {

	static LoadingStage[] aClass387Array3557;

	static Interface27[] anInterface27Array3559;

	static int anInt3561;

	static long aLong3562;

	static int anInt3563;

	static int[] anIntArray3558 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	static int anInt3560 = -1;

	static int anInt3564 = -1;

	Class302() throws Throwable {
		throw new Error();
	}

	static int method5360(int i_0, int i_1) {
		int i_3 = i_0 >> 31 & i_1 - 1;
		return (i_0 + (i_0 >>> 31)) % i_1 + i_3;
	}

	static void method5361(Animable animable_0, int i_1, int i_2, int i_3, int i_4) {
		RenderAnimDefs renderanimdefs_5 = animable_0.getRenderAnimDefs();
		Class456_Sub3 class456_sub3_6 = animable_0.aClass456_Sub3_10337;
		int i_7 = animable_0.anInt10361 - animable_0.aClass19_10359.anInt153 & 0x3fff;
		if (i_1 == Class249.aClass249_3083.aByte3085) {
			if (i_7 == 0 && animable_0.anInt10357 <= 25) {
				if (!class456_sub3_6.aBool7891 || !renderanimdefs_5.method3810(class456_sub3_6.method7597(-457692749))) {
					class456_sub3_6.method7570(renderanimdefs_5.method3809(346097495), -1633423132);
					class456_sub3_6.aBool7891 = class456_sub3_6.hasDefs();
				}
			} else if (i_3 < 0 && renderanimdefs_5.walkDir1 != -1) {
				class456_sub3_6.method7570(renderanimdefs_5.walkDir1, -1480402548);
				class456_sub3_6.aBool7891 = false;
			} else if (i_3 > 0 && renderanimdefs_5.walkDir2 != -1) {
				class456_sub3_6.method7570(renderanimdefs_5.walkDir2, -529478475);
				class456_sub3_6.aBool7891 = false;
			} else if (!class456_sub3_6.aBool7891 || !renderanimdefs_5.method3810(class456_sub3_6.method7597(-1676563676))) {
				class456_sub3_6.method7570(renderanimdefs_5.method3809(711048554), -1671257670);
				class456_sub3_6.aBool7891 = animable_0.aClass456_Sub3_10337.hasDefs();
			}
		} else if (animable_0.faceEntity == -1 || i_7 < 10240 && i_7 > 2048) {
			if (i_7 == 0 && animable_0.anInt10357 <= 25) {
				if (i_1 == Class249.aClass249_3086.aByte3085 && renderanimdefs_5.anInt2797 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2797, -1921383310);
				} else if (i_1 == Class249.aClass249_3082.aByte3085 && renderanimdefs_5.anInt2801 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2801, -352623375);
				} else {
					class456_sub3_6.method7570(renderanimdefs_5.walkAnimation, -765983563);
				}
				class456_sub3_6.aBool7891 = false;
			} else {
				if (i_1 == Class249.aClass249_3086.aByte3085 && renderanimdefs_5.anInt2797 != -1) {
					if (i_3 < 0 && renderanimdefs_5.anInt2807 != -1) {
						class456_sub3_6.method7570(renderanimdefs_5.anInt2807, -484680989);
					} else if (i_3 > 0 && renderanimdefs_5.anInt2808 != -1) {
						class456_sub3_6.method7570(renderanimdefs_5.anInt2808, -274851042);
					} else {
						class456_sub3_6.method7570(renderanimdefs_5.anInt2797, -85228314);
					}
				} else if (i_1 == Class249.aClass249_3082.aByte3085 && renderanimdefs_5.anInt2801 != -1) {
					if (i_3 < 0 && renderanimdefs_5.anInt2830 != -1) {
						class456_sub3_6.method7570(renderanimdefs_5.anInt2830, -1720670633);
					} else if (i_3 > 0 && renderanimdefs_5.anInt2806 != -1) {
						class456_sub3_6.method7570(renderanimdefs_5.anInt2806, -568161732);
					} else {
						class456_sub3_6.method7570(renderanimdefs_5.anInt2801, -1131572762);
					}
				} else if (i_3 < 0 && renderanimdefs_5.anInt2809 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2809, -443057729);
				} else if (i_3 > 0 && renderanimdefs_5.anInt2810 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2810, -1335690885);
				} else {
					class456_sub3_6.method7570(renderanimdefs_5.walkAnimation, -1249670627);
				}
				class456_sub3_6.aBool7891 = false;
			}
		} else {
			int i_8 = client.anIntArray7380[i_2] - animable_0.aClass19_10359.anInt153 & 0x3fff;
			if (i_1 == Class249.aClass249_3086.aByte3085 && renderanimdefs_5.anInt2797 != -1) {
				if (i_8 > 2048 && i_8 <= 6144 && renderanimdefs_5.anInt2800 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2800, -744132293);
				} else if (i_8 >= 10240 && i_8 < 14336 && renderanimdefs_5.anInt2799 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2799, -930326431);
				} else if (i_8 > 6144 && i_8 < 10240 && renderanimdefs_5.walkDir6 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.walkDir6, -1031888720);
				} else {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2797, -1257308259);
				}
			} else if (i_1 == Class249.aClass249_3082.aByte3085 && renderanimdefs_5.anInt2801 != -1) {
				if (i_8 > 2048 && i_8 <= 6144 && renderanimdefs_5.anInt2812 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2812, -173534330);
				} else if (i_8 >= 10240 && i_8 < 14336 && renderanimdefs_5.anInt2803 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2803, -1986637657);
				} else if (i_8 > 6144 && i_8 < 10240 && renderanimdefs_5.anInt2828 != -1) {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2828, -1528009558);
				} else {
					class456_sub3_6.method7570(renderanimdefs_5.anInt2801, -1259452142);
				}
			} else if (i_8 > 2048 && i_8 <= 6144 && renderanimdefs_5.walkDir5 != -1) {
				class456_sub3_6.method7570(renderanimdefs_5.walkDir5, -989017367);
			} else if (i_8 >= 10240 && i_8 < 14336 && renderanimdefs_5.walkDir4 != -1) {
				class456_sub3_6.method7570(renderanimdefs_5.walkDir4, -1349434432);
			} else if (i_8 > 6144 && i_8 < 10240 && renderanimdefs_5.walkDir3 != -1) {
				class456_sub3_6.method7570(renderanimdefs_5.walkDir3, -994621922);
			} else {
				class456_sub3_6.method7570(renderanimdefs_5.walkAnimation, -883440567);
			}
			class456_sub3_6.aBool7891 = false;
		}
	}

	public static long method5363(int i_0, int i_1) {
		return (long) (i_0 + 11745) * 86400000L;
	}

	public static int method5364(int i_0, int i_1, float f_2) {
		return Class8_Sub3.method14337(i_0, i_1, (int) f_2);
	}
}
