public final class Class112 {

	Class112() throws Throwable {
		throw new Error();
	}

	public static Class60[] method1870() {
		return new Class60[] { Class60.aClass60_609, Class60.aClass60_602, Class60.aClass60_603, Class60.aClass60_608, Class60.aClass60_605, Class60.aClass60_606, Class60.aClass60_607, Class60.aClass60_604, Class60.aClass60_601, Class60.aClass60_610 };
	}

	public static int method1871(int i_0, int i_1, int i_2) {
		i_2 &= 0x3;
		return i_2 == 0 ? i_0 : (i_2 == 1 ? i_1 : (i_2 == 2 ? 7 - i_0 : 7 - i_1));
	}

	public static int findRoute(int i_0, int i_1, int i_2, RouteStrategy routestrategy_3, ClipMap clipmap_4, boolean bool_5, int[] ints_6, int[] ints_7, int i_8) {
		int i_10;
		for (int i_9 = 0; i_9 < 128; i_9++) {
			for (i_10 = 0; i_10 < 128; i_10++) {
				RouteFinder.directions[i_9][i_10] = 0;
				RouteFinder.distances[i_9][i_10] = 99999999;
			}
		}
		boolean bool_28;
		if (i_2 == 1) {
			bool_28 = RouteFinder.performCalculationS1(i_0, i_1, routestrategy_3, clipmap_4);
		} else if (i_2 == 2) {
			bool_28 = RouteFinder.performCalculationS2(i_0, i_1, routestrategy_3, clipmap_4);
		} else {
			bool_28 = RouteFinder.performCalculationSX(i_0, i_1, i_2, routestrategy_3, clipmap_4);
		}
		i_10 = i_0 - 64;
		int i_11 = i_1 - 64;
		int i_12 = RouteFinder.exitX;
		int i_13 = RouteFinder.exitY;
		int i_14;
		int i_15;
		int i_17;
		if (!bool_28) {
			if (!bool_5) {
				return -1;
			}
			i_14 = Integer.MAX_VALUE;
			i_15 = Integer.MAX_VALUE;
			byte b_16 = 10;
			i_17 = routestrategy_3.approxDestinationX;
			int i_18 = routestrategy_3.approxDestinationY;
			int i_19 = routestrategy_3.approxDestinationSizeX;
			int i_20 = routestrategy_3.approxDestinationSizeY;
			for (int i_21 = i_17 - b_16; i_21 <= i_17 + b_16; i_21++) {
				for (int i_22 = i_18 - b_16; i_22 <= i_18 + b_16; i_22++) {
					int i_23 = i_21 - i_10;
					int i_24 = i_22 - i_11;
					if (i_23 >= 0 && i_24 >= 0 && i_23 < 128 && i_24 < 128 && RouteFinder.distances[i_23][i_24] < 100) {
						int i_25 = 0;
						if (i_21 < i_17) {
							i_25 = i_17 - i_21;
						} else if (i_21 > i_19 + i_17 - 1) {
							i_25 = i_21 - (i_17 + i_19 - 1);
						}
						int i_26 = 0;
						if (i_22 < i_18) {
							i_26 = i_18 - i_22;
						} else if (i_22 > i_20 + i_18 - 1) {
							i_26 = i_22 - (i_18 + i_20 - 1);
						}
						int i_27 = i_25 * i_25 + i_26 * i_26;
						if (i_27 < i_14 || i_27 == i_14 && RouteFinder.distances[i_23][i_24] < i_15) {
							i_14 = i_27;
							i_15 = RouteFinder.distances[i_23][i_24];
							i_12 = i_21;
							i_13 = i_22;
						}
					}
				}
			}
			if (i_14 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (i_0 == i_12 && i_13 == i_1) {
			return 0;
		} else {
			byte b_29 = 0;
			RouteFinder.bufferX[b_29] = i_12;
			i_14 = b_29 + 1;
			RouteFinder.bufferY[b_29] = i_13;
			for (int i_30 = i_15 = RouteFinder.directions[i_12 - i_10][i_13 - i_11]; i_0 != i_12 || i_13 != i_1; i_30 = RouteFinder.directions[i_12 - i_10][i_13 - i_11]) {
				if (i_15 != i_30) {
					i_15 = i_30;
					RouteFinder.bufferX[i_14] = i_12;
					RouteFinder.bufferY[i_14++] = i_13;
				}
				if ((i_30 & 0x2) != 0) {
					++i_12;
				} else if ((i_30 & 0x8) != 0) {
					--i_12;
				}
				if ((i_30 & 0x1) != 0) {
					++i_13;
				} else if ((i_30 & 0x4) != 0) {
					--i_13;
				}
			}
			i_17 = 0;
			while (i_14-- > 0) {
				ints_6[i_17] = RouteFinder.bufferX[i_14];
				ints_7[i_17++] = RouteFinder.bufferY[i_14];
				if (i_17 >= ints_6.length) {
					break;
				}
			}
			return i_17;
		}
	}
}
