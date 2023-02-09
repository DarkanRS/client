package com.rs.jagex;

public class Class147 {

	static int anInt1726;
	static int[] anIntArray1728;
	static int anInt1729;
	static int anInt1722;
	static int anInt1724;
	static int anInt1727;
	static int anInt1725;
	static int anInt1723;

	public static void method2471(AbstractRenderer graphicalrenderer_0, int[] ints_1, int i_2) {
		method2474(graphicalrenderer_0, ints_1, ints_1.length, i_2, null, null);
	}

	static void method2472(int i_0, int i_1) {
		if (i_1 > i_0 + 4) {
			int i_2 = i_0;
			int i_3 = anIntArray1728[i_0];
			int i_4 = anIntArray1728[i_0 + 1];
			int i_5 = anIntArray1728[i_0 + 2];
			int i_6 = anIntArray1728[i_0 + 3];

			for (int i_7 = i_0 + 4; i_7 < i_1; i_7 += 4) {
				int i_8 = anIntArray1728[i_7 + 1];
				if (i_8 < i_4) {
					anIntArray1728[i_2] = anIntArray1728[i_7];
					anIntArray1728[i_2 + 1] = i_8;
					anIntArray1728[i_2 + 2] = anIntArray1728[i_7 + 2];
					anIntArray1728[i_2 + 3] = anIntArray1728[i_7 + 3];
					i_2 += 4;
					anIntArray1728[i_7] = anIntArray1728[i_2];
					anIntArray1728[i_7 + 1] = anIntArray1728[i_2 + 1];
					anIntArray1728[i_7 + 2] = anIntArray1728[i_2 + 2];
					anIntArray1728[i_7 + 3] = anIntArray1728[i_2 + 3];
				}
			}

			anIntArray1728[i_2] = i_3;
			anIntArray1728[i_2 + 1] = i_4;
			anIntArray1728[i_2 + 2] = i_5;
			anIntArray1728[i_2 + 3] = i_6;
			method2472(i_0, i_2);
			method2472(i_2 + 4, i_1);
		}

	}

	static void method2474(AbstractRenderer graphicalrenderer_0, int[] ints_1, int i_3, int i_4, int[] ints_5, int[] ints_6) {
		int[] ints_7 = new int[4];
		graphicalrenderer_0.qa(ints_7);
		if (ints_5 != null && ints_5.length != ints_7[3] - ints_7[1])
			throw new IllegalStateException();
		method2475();
		method2476(ints_1, i_3);
		method2477(ints_7[1]);

		while (true) {
			int i_8;
			int i_9;
			int i_10;
			do {
				if (!method2478(ints_7[3]))
					return;

				i_8 = anInt1725;
				i_9 = anInt1723;
				i_10 = anInt1727;
				if (ints_5 == null)
					break;

				int i_11 = i_10 - ints_7[1];
				if (i_8 < ints_5[i_11] + ints_7[0])
					i_8 = ints_5[i_11] + ints_7[0];

				if (i_9 > ints_5[i_11] + ints_6[i_11] + ints_7[0])
					i_9 = ints_5[i_11] + ints_6[i_11] + ints_7[0];
			} while (i_9 - i_8 <= 0);

			graphicalrenderer_0.XA(i_8, i_10, i_9 - i_8, i_4, 1);
		}
	}

	static void method2475() {
		anInt1726 = 0;
	}

	static void method2476(int[] ints_0, int i_2) {
		int i_3 = (i_2 << 1) + anInt1726;
		int i_5;
		if (anIntArray1728 == null || anIntArray1728.length < i_3) {
			int[] ints_8 = new int[i_3];

			for (i_5 = 0; i_5 < anInt1726; i_5++)
				ints_8[i_5] = anIntArray1728[i_5];

			anIntArray1728 = ints_8;
		}

		i_2 += 0;
		int i_4 = i_2 - 2;

		for (i_5 = 0; i_5 < i_2; i_5 += 2) {
			int i_6 = ints_0[i_4 + 1];
			int i_7 = ints_0[i_5 + 1];
			if (i_6 < i_7) {
				anIntArray1728[anInt1726++] = ints_0[i_4];
				anIntArray1728[anInt1726++] = i_6;
				anIntArray1728[anInt1726++] = ints_0[i_5];
				anIntArray1728[anInt1726++] = i_7;
			} else if (i_7 < i_6) {
				anIntArray1728[anInt1726++] = ints_0[i_5];
				anIntArray1728[anInt1726++] = i_7;
				anIntArray1728[anInt1726++] = ints_0[i_4];
				anIntArray1728[anInt1726++] = i_6;
			}

			i_4 = i_5;
		}

	}

	static void method2477(int i_0) {
		if (anInt1726 < 0) {
			anInt1729 = 0;
			anInt1722 = 0;
			anInt1724 = 0;
			anInt1727 = 2147483646;
		} else {
			method2472(0, anInt1726);
			int i_1 = anIntArray1728[1];
			if (i_1 < i_0)
				i_1 = i_0;

			byte b_2 = 0;

			int i_3;
			for (i_3 = 0; i_3 < anInt1726; i_3 += 4) {
				int i_4 = anIntArray1728[i_3 + 1];
				if (i_1 < i_4)
					break;

				int i_5 = anIntArray1728[i_3];
				int i_6 = anIntArray1728[i_3 + 2];
				int i_7 = anIntArray1728[i_3 + 3];
				int i_8 = (i_6 - i_5 << 16) / (i_7 - i_4);
				int i_9 = (i_5 << 16) + 32768;
				anIntArray1728[i_3] = i_9 + i_8 * (i_1 - i_4);
				anIntArray1728[i_3 + 2] = i_8;
			}

			anInt1724 = b_2;
			anInt1722 = i_3;
			anInt1729 = i_3;
			anInt1727 = i_1 - 1;
		}

	}

	static boolean method2478(int i_0) {
		int i_1 = anInt1722;
		int i_2 = anInt1729;

		int i_4;
		for (int i_3 = anInt1727; i_2 >= i_1; i_2 = i_4) {
			++i_3;
			anInt1727 = i_3;
			if (i_3 >= i_0)
				return false;

			int i_5;
			int i_6;
			for (i_4 = anInt1724; i_1 < anInt1726; i_1 += 4) {
				i_5 = anIntArray1728[i_1 + 1];
				if (i_3 < i_5)
					break;

				i_6 = anIntArray1728[i_1];
				int i_7 = anIntArray1728[i_1 + 2];
				int i_8 = anIntArray1728[i_1 + 3];
				int i_9 = (i_7 - i_6 << 16) / (i_8 - i_5);
				int i_10 = (i_6 << 16) + 32768;
				anIntArray1728[i_1] = i_10;
				anIntArray1728[i_1 + 2] = i_9;
			}

			for (i_5 = i_4; i_5 < i_1; i_5 += 4) {
				i_6 = anIntArray1728[i_5 + 3];
				if (i_3 >= i_6) {
					anIntArray1728[i_5] = anIntArray1728[i_4];
					anIntArray1728[i_5 + 1] = anIntArray1728[i_4 + 1];
					anIntArray1728[i_5 + 2] = anIntArray1728[i_4 + 2];
					anIntArray1728[i_5 + 3] = anIntArray1728[i_4 + 3];
					i_4 += 4;
				}
			}

			if (i_4 == anInt1726) {
				anInt1726 = 0;
				return false;
			}

			method2480(i_4, i_1);
			anInt1724 = i_4;
			anInt1722 = i_1;
		}

		anInt1725 = anIntArray1728[i_2] >> 16;
				anInt1723 = anIntArray1728[i_2 + 4] >> 16;
				anIntArray1728[i_2] += anIntArray1728[i_2 + 2];
				anIntArray1728[i_2 + 4] += anIntArray1728[i_2 + 6];
				i_2 += 8;
				anInt1729 = i_2;
				return true;
	}

	static void method2480(int i_0, int i_1) {
		while (true) {
			if (i_1 >= i_0 + 8) {
				boolean bool_2 = true;

				for (int i_3 = i_0 + 4; i_3 < i_1; i_3 += 4) {
					int i_4 = anIntArray1728[i_3 - 4];
					int i_5 = anIntArray1728[i_3];
					if (i_4 > i_5) {
						bool_2 = false;
						anIntArray1728[i_3 - 4] = i_5;
						anIntArray1728[i_3] = i_4;
						i_4 = anIntArray1728[i_3 - 2];
						anIntArray1728[i_3 - 2] = anIntArray1728[i_3 + 2];
						anIntArray1728[i_3 + 2] = i_4;
						i_4 = anIntArray1728[i_3 - 1];
						anIntArray1728[i_3 - 1] = anIntArray1728[i_3 + 3];
						anIntArray1728[i_3 + 3] = i_4;
					}
				}

				if (!bool_2) {
					i_1 -= 4;
					continue;
				}
			}

			return;
		}
	}

	public static void method2505(AbstractRenderer graphicalrenderer_0, int[] ints_1, int i_2, int[] ints_3, int[] ints_4) {
		method2474(graphicalrenderer_0, ints_1, ints_1.length, i_2, ints_3, ints_4);
	}

	Class147() throws Throwable {
		throw new Error();
	}

}
