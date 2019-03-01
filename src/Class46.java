public class Class46 implements Interface2 {

	public static Object[] anObjectArray437;
	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_438;
	Class366 aClass366_436;

	public boolean method21() {
		return true;
	}

	public void method20(boolean bool_1, int i_2) {
		if (bool_1) {
			Renderers.SOFTWARE_RENDERER.B(0, 0, Class349.anInt4083, Engine.anInt3243 * -969250379, this.aClass366_436.anInt4231, 0);
		}

	}

	public void method11(boolean bool_1) {
		if (bool_1) {
			Renderers.SOFTWARE_RENDERER.B(0, 0, Class349.anInt4083 * 1426041429 * 765 * -1943418639 * -418109423, -969250379 * Engine.anInt3243 * -969250379 * -1929118563, this.aClass366_436.anInt4231 * -776392521 * -2044941049, 0);
		}

	}

	public boolean method10(int i_1) {
		return true;
	}

	public void method12(boolean bool_1) {
		if (bool_1) {
			Renderers.SOFTWARE_RENDERER.B(0, 0, Class349.anInt4083 * 1426041429 * 765 * -1943418639 * -418109423, -969250379 * Engine.anInt3243 * -969250379 * -1929118563, this.aClass366_436.anInt4231 * -776392521 * -2044941049, 0);
		}

	}

	Class46(Class366 class366_1) {
		this.aClass366_436 = class366_1;
	}

	public void method14(boolean bool_1) {
		if (bool_1) {
			Renderers.SOFTWARE_RENDERER.B(0, 0, Class349.anInt4083 * 1426041429 * 765 * -1943418639 * -418109423, -969250379 * Engine.anInt3243 * -969250379 * -1929118563, this.aClass366_436.anInt4231 * -776392521 * -2044941049, 0);
		}

	}

	public void method15() {
	}

	public void method18() {
	}

	public void method23() {
	}

	public void method16() {
	}

	public void method22(int i_1) {
	}

	public boolean method13() {
		return true;
	}

	public boolean method9() {
		return true;
	}

	public void method19() {
	}

	public boolean method17() {
		return true;
	}

	static final boolean performCalculationS2(int i_0, int i_1, RouteStrategy routestrategy_2, ClipMap clipmap_3, int i_4) {
		int i_5 = i_0;
		int i_6 = i_1;
		byte b_7 = 64;
		byte b_8 = 64;
		int i_9 = i_0 - b_7;
		int i_10 = i_1 - b_8;
		Class251.directions[b_7][b_8] = 99;
		Class251.distances[b_7][b_8] = 0;
		byte b_11 = 0;
		int i_12 = 0;
		Class251.bufferX[b_11] = i_0;
		byte b_10001 = b_11;
		int i_19 = b_11 + 1;
		Class251.bufferY[b_10001] = i_1;
		int[][] ints_13 = clipmap_3.map;

		while (i_12 != i_19) {
			i_5 = Class251.bufferX[i_12];
			i_6 = Class251.bufferY[i_12];
			i_12 = i_12 + 1 & 0xfff;
			int i_17 = i_5 - i_9;
			int i_18 = i_6 - i_10;
			int i_14 = i_5 - clipmap_3.offsetX;
			int i_15 = i_6 - clipmap_3.offsetY;
			if (routestrategy_2.canExit(2, i_5, i_6, clipmap_3, (byte) -32)) {
				Class251.exitX = i_5;
				Class251.exitY = i_6;
				return true;
			}

			int i_16 = Class251.distances[i_17][i_18] + 1;
			if (i_17 > 0 && Class251.directions[i_17 - 1][i_18] == 0 && (ints_13[i_14 - 1][i_15] & 0x43a40000) == 0 && (ints_13[i_14 - 1][i_15 + 1] & 0x4e240000) == 0) {
				Class251.bufferX[i_19] = i_5 - 1;
				Class251.bufferY[i_19] = i_6;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 - 1][i_18] = 2;
				Class251.distances[i_17 - 1][i_18] = i_16;
			}

			if (i_17 < 126 && Class251.directions[i_17 + 1][i_18] == 0 && (ints_13[i_14 + 2][i_15] & 0x60e40000) == 0 && (ints_13[i_14 + 2][i_15 + 1] & 0x78240000) == 0) {
				Class251.bufferX[i_19] = i_5 + 1;
				Class251.bufferY[i_19] = i_6;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 + 1][i_18] = 8;
				Class251.distances[i_17 + 1][i_18] = i_16;
			}

			if (i_18 > 0 && Class251.directions[i_17][i_18 - 1] == 0 && (ints_13[i_14][i_15 - 1] & 0x43a40000) == 0 && (ints_13[i_14 + 1][i_15 - 1] & 0x60e40000) == 0) {
				Class251.bufferX[i_19] = i_5;
				Class251.bufferY[i_19] = i_6 - 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17][i_18 - 1] = 1;
				Class251.distances[i_17][i_18 - 1] = i_16;
			}

			if (i_18 < 126 && Class251.directions[i_17][i_18 + 1] == 0 && (ints_13[i_14][i_15 + 2] & 0x4e240000) == 0 && (ints_13[i_14 + 1][i_15 + 2] & 0x78240000) == 0) {
				Class251.bufferX[i_19] = i_5;
				Class251.bufferY[i_19] = i_6 + 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17][i_18 + 1] = 4;
				Class251.distances[i_17][i_18 + 1] = i_16;
			}

			if (i_17 > 0 && i_18 > 0 && Class251.directions[i_17 - 1][i_18 - 1] == 0 && (ints_13[i_14 - 1][i_15] & 0x4fa40000) == 0 && (ints_13[i_14 - 1][i_15 - 1] & 0x43a40000) == 0 && (ints_13[i_14][i_15 - 1] & 0x63e40000) == 0) {
				Class251.bufferX[i_19] = i_5 - 1;
				Class251.bufferY[i_19] = i_6 - 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 - 1][i_18 - 1] = 3;
				Class251.distances[i_17 - 1][i_18 - 1] = i_16;
			}

			if (i_17 < 126 && i_18 > 0 && Class251.directions[i_17 + 1][i_18 - 1] == 0 && (ints_13[i_14 + 1][i_15 - 1] & 0x63e40000) == 0 && (ints_13[i_14 + 2][i_15 - 1] & 0x60e40000) == 0 && (ints_13[i_14 + 2][i_15] & 0x78e40000) == 0) {
				Class251.bufferX[i_19] = i_5 + 1;
				Class251.bufferY[i_19] = i_6 - 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 + 1][i_18 - 1] = 9;
				Class251.distances[i_17 + 1][i_18 - 1] = i_16;
			}

			if (i_17 > 0 && i_18 < 126 && Class251.directions[i_17 - 1][i_18 + 1] == 0 && (ints_13[i_14 - 1][i_15 + 1] & 0x4fa40000) == 0 && (ints_13[i_14 - 1][i_15 + 2] & 0x4e240000) == 0 && (ints_13[i_14][i_15 + 2] & 0x7e240000) == 0) {
				Class251.bufferX[i_19] = i_5 - 1;
				Class251.bufferY[i_19] = i_6 + 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 - 1][i_18 + 1] = 6;
				Class251.distances[i_17 - 1][i_18 + 1] = i_16;
			}

			if (i_17 < 126 && i_18 < 126 && Class251.directions[i_17 + 1][i_18 + 1] == 0 && (ints_13[i_14 + 1][i_15 + 2] & 0x7e240000) == 0 && (ints_13[i_14 + 2][i_15 + 2] & 0x78240000) == 0 && (ints_13[i_14 + 2][i_15 + 1] & 0x78e40000) == 0) {
				Class251.bufferX[i_19] = i_5 + 1;
				Class251.bufferY[i_19] = i_6 + 1;
				i_19 = i_19 + 1 & 0xfff;
				Class251.directions[i_17 + 1][i_18 + 1] = 12;
				Class251.distances[i_17 + 1][i_18 + 1] = i_16;
			}
		}

		Class251.exitX = i_5;
		Class251.exitY = i_6;
		return false;
	}

	static final boolean performCalculationSX(int i_0, int i_1, int i_2, RouteStrategy routestrategy_3, ClipMap clipmap_4, byte b_5) {
		int i_6 = i_0;
		int i_7 = i_1;
		byte b_8 = 64;
		byte b_9 = 64;
		int i_10 = i_0 - b_8;
		int i_11 = i_1 - b_9;
		Class251.directions[b_8][b_9] = 99;
		Class251.distances[b_8][b_9] = 0;
		byte b_12 = 0;
		int i_13 = 0;
		Class251.bufferX[b_12] = i_0;
		int i_21 = b_12 + 1;
		Class251.bufferY[b_12] = i_1;
		int[][] ints_14 = clipmap_4.map;

		label208: while (i_21 != i_13) {
			i_6 = Class251.bufferX[i_13];
			i_7 = Class251.bufferY[i_13];
			i_13 = i_13 + 1 & 0xfff;
			int i_19 = i_6 - i_10;
			int i_20 = i_7 - i_11;
			int i_15 = i_6 - clipmap_4.offsetX;
			int i_16 = i_7 - clipmap_4.offsetY;
			if (routestrategy_3.canExit(i_2, i_6, i_7, clipmap_4, (byte) -14)) {
				Class251.exitX = i_6;
				Class251.exitY = i_7;
				return true;
			}

			int i_17 = Class251.distances[i_19][i_20] + 1;
			int i_18;
			if (i_19 > 0 && Class251.directions[i_19 - 1][i_20] == 0 && (ints_14[i_15 - 1][i_16] & 0x43a40000) == 0 && (ints_14[i_15 - 1][i_16 + i_2 - 1] & 0x4e240000) == 0) {
				i_18 = 1;

				while (true) {
					if (i_18 >= i_2 - 1) {
						Class251.bufferX[i_21] = i_6 - 1;
						Class251.bufferY[i_21] = i_7;
						i_21 = i_21 + 1 & 0xfff;
						Class251.directions[i_19 - 1][i_20] = 2;
						Class251.distances[i_19 - 1][i_20] = i_17;
						break;
					}

					if ((ints_14[i_15 - 1][i_18 + i_16] & 0x4fa40000) != 0) {
						break;
					}

					++i_18;
				}
			}

			if (i_19 < 128 - i_2 && Class251.directions[i_19 + 1][i_20] == 0 && (ints_14[i_15 + i_2][i_16] & 0x60e40000) == 0 && (ints_14[i_15 + i_2][i_16 + i_2 - 1] & 0x78240000) == 0) {
				i_18 = 1;

				while (true) {
					if (i_18 >= i_2 - 1) {
						Class251.bufferX[i_21] = i_6 + 1;
						Class251.bufferY[i_21] = i_7;
						i_21 = i_21 + 1 & 0xfff;
						Class251.directions[i_19 + 1][i_20] = 8;
						Class251.distances[i_19 + 1][i_20] = i_17;
						break;
					}

					if ((ints_14[i_15 + i_2][i_18 + i_16] & 0x78e40000) != 0) {
						break;
					}

					++i_18;
				}
			}

			if (i_20 > 0 && Class251.directions[i_19][i_20 - 1] == 0 && (ints_14[i_15][i_16 - 1] & 0x43a40000) == 0 && (ints_14[i_15 + i_2 - 1][i_16 - 1] & 0x60e40000) == 0) {
				i_18 = 1;

				while (true) {
					if (i_18 >= i_2 - 1) {
						Class251.bufferX[i_21] = i_6;
						Class251.bufferY[i_21] = i_7 - 1;
						i_21 = i_21 + 1 & 0xfff;
						Class251.directions[i_19][i_20 - 1] = 1;
						Class251.distances[i_19][i_20 - 1] = i_17;
						break;
					}

					if ((ints_14[i_18 + i_15][i_16 - 1] & 0x63e40000) != 0) {
						break;
					}

					++i_18;
				}
			}

			if (i_20 < 128 - i_2 && Class251.directions[i_19][i_20 + 1] == 0 && (ints_14[i_15][i_16 + i_2] & 0x4e240000) == 0 && (ints_14[i_15 + i_2 - 1][i_16 + i_2] & 0x78240000) == 0) {
				i_18 = 1;

				while (true) {
					if (i_18 >= i_2 - 1) {
						Class251.bufferX[i_21] = i_6;
						Class251.bufferY[i_21] = i_7 + 1;
						i_21 = i_21 + 1 & 0xfff;
						Class251.directions[i_19][i_20 + 1] = 4;
						Class251.distances[i_19][i_20 + 1] = i_17;
						break;
					}

					if ((ints_14[i_15 + i_18][i_16 + i_2] & 0x7e240000) != 0) {
						break;
					}

					++i_18;
				}
			}

			if (i_19 > 0 && i_20 > 0 && Class251.directions[i_19 - 1][i_20 - 1] == 0 && (ints_14[i_15 - 1][i_16 - 1] & 0x43a40000) == 0) {
				i_18 = 1;

				while (true) {
					if (i_18 >= i_2) {
						Class251.bufferX[i_21] = i_6 - 1;
						Class251.bufferY[i_21] = i_7 - 1;
						i_21 = i_21 + 1 & 0xfff;
						Class251.directions[i_19 - 1][i_20 - 1] = 3;
						Class251.distances[i_19 - 1][i_20 - 1] = i_17;
						break;
					}

					if ((ints_14[i_15 - 1][i_18 + (i_16 - 1)] & 0x4fa40000) != 0 || (ints_14[i_18 + (i_15 - 1)][i_16 - 1] & 0x63e40000) != 0) {
						break;
					}

					++i_18;
				}
			}

			if (i_19 < 128 - i_2 && i_20 > 0 && Class251.directions[i_19 + 1][i_20 - 1] == 0 && (ints_14[i_15 + i_2][i_16 - 1] & 0x60e40000) == 0) {
				i_18 = 1;

				while (true) {
					if (i_18 >= i_2) {
						Class251.bufferX[i_21] = i_6 + 1;
						Class251.bufferY[i_21] = i_7 - 1;
						i_21 = i_21 + 1 & 0xfff;
						Class251.directions[i_19 + 1][i_20 - 1] = 9;
						Class251.distances[i_19 + 1][i_20 - 1] = i_17;
						break;
					}

					if ((ints_14[i_15 + i_2][i_18 + (i_16 - 1)] & 0x78e40000) != 0 || (ints_14[i_18 + i_15][i_16 - 1] & 0x63e40000) != 0) {
						break;
					}

					++i_18;
				}
			}

			if (i_19 > 0 && i_20 < 128 - i_2 && Class251.directions[i_19 - 1][i_20 + 1] == 0 && (ints_14[i_15 - 1][i_16 + i_2] & 0x4e240000) == 0) {
				i_18 = 1;

				while (true) {
					if (i_18 >= i_2) {
						Class251.bufferX[i_21] = i_6 - 1;
						Class251.bufferY[i_21] = i_7 + 1;
						i_21 = i_21 + 1 & 0xfff;
						Class251.directions[i_19 - 1][i_20 + 1] = 6;
						Class251.distances[i_19 - 1][i_20 + 1] = i_17;
						break;
					}

					if ((ints_14[i_15 - 1][i_18 + i_16] & 0x4fa40000) != 0 || (ints_14[i_18 + (i_15 - 1)][i_16 + i_2] & 0x7e240000) != 0) {
						break;
					}

					++i_18;
				}
			}

			if (i_19 < 128 - i_2 && i_20 < 128 - i_2 && Class251.directions[i_19 + 1][i_20 + 1] == 0 && (ints_14[i_15 + i_2][i_16 + i_2] & 0x78240000) == 0) {
				for (i_18 = 1; i_18 < i_2; i_18++) {
					if ((ints_14[i_15 + i_18][i_16 + i_2] & 0x7e240000) != 0 || (ints_14[i_15 + i_2][i_18 + i_16] & 0x78e40000) != 0) {
						continue label208;
					}
				}

				Class251.bufferX[i_21] = i_6 + 1;
				Class251.bufferY[i_21] = i_7 + 1;
				i_21 = i_21 + 1 & 0xfff;
				Class251.directions[i_19 + 1][i_20 + 1] = 12;
				Class251.distances[i_19 + 1][i_20 + 1] = i_17;
			}
		}

		Class251.exitX = i_6;
		Class251.exitY = i_7;
		return false;
	}

	public static Class252[] method931(int i_0) {
		return new Class252[] { Class252.aClass252_3111, Class252.aClass252_3110, Class252.aClass252_3113, Class252.aClass252_3108, Class252.aClass252_3105, Class252.aClass252_3109, Class252.aClass252_3107, Class252.aClass252_3106 };
	}

	public static int method932(int i_0) {
		SoftCache softcache_1 = PlayerAppearance.aClass229_2920;
		synchronized (PlayerAppearance.aClass229_2920) {
			int i_2 = PlayerAppearance.aClass229_2920.method3862((byte) 2);
			return i_2;
		}
	}

	static final void method933(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.aClass61_7010.anInt635;
	}

	static final void method934(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class11.SYSTEM_INFO.anInt8167 >= 512 && !client.aBool7465 && !client.aBool7171 ? 0 : 1;
	}

	static void method935(byte b_0) {
		int i_1 = 0;
		if (Class393.preferences != null) {
			i_1 = Class393.preferences.aClass468_Sub7_8210.method12666(1300916790);
		}

		int i_2;
		int i_3;
		if (i_1 == 2) {
			i_2 = Class45.anInt434 > 800 ? 800 : Class45.anInt434;
			i_3 = Class107.anInt1082 > 600 ? 600 : Class107.anInt1082;
			Class349.anInt4083 = i_2;
			client.anInt3250 = (Class45.anInt434 - i_2) / 2;
			client.anInt3243 = i_3 * -1929118563;
			client.anInt3251 = 0;
		} else if (i_1 == 1) {
			i_2 = Class45.anInt434 > 1024 ? 1024 : Class45.anInt434;
			i_3 = Class107.anInt1082 > 768 ? 768 : Class107.anInt1082;
			Class349.anInt4083 = i_2;
			client.anInt3250 = (Class45.anInt434 - i_2) / 2;
			client.anInt3243 = i_3 * -1929118563;
			client.anInt3251 = 0;
		} else {
			Class349.anInt4083 = Class45.anInt434;
			client.anInt3250 = 0;
			client.anInt3243 = Class107.anInt1082 * -1929118563;
			client.anInt3251 = 0;
		}

	}

}
