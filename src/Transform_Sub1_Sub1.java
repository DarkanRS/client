public abstract class Transform_Sub1_Sub1 extends Transform_Sub1 {

	public short aShort9458;
	public short localX;
	public short aShort9456;
	public short localY;
	public boolean aBool9459;
	byte aByte9454;

	int method13024(Node_Sub24[] arr_1) {
		int i_2 = 0;

		int i_3;
		int i_4;
		int i_9;
		label115: for (i_3 = this.aShort9458; i_3 <= this.localX; i_3++) {
			label113: for (i_4 = this.aShort9456; i_4 <= this.localY; i_4++) {
				long long_14 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_3][i_4];
				long long_16 = 0L;

				while (true) {
					label108: while (true) {
						if (long_16 > 48L) {
							continue label113;
						}

						i_9 = (int) (long_14 >>> (int) long_16 & 0xffffL);
						if (i_9 <= 0) {
							continue label113;
						}

						Class287 class287_18 = this.aClass206_7970.aClass287Array2646[i_9 - 1];

						for (int i_11 = 0; i_11 < i_2; i_11++) {
							if (arr_1[i_11] == class287_18.aNode_Sub24_3425) {
								long_16 += 16L;
								continue label108;
							}
						}

						arr_1[i_2++] = class287_18.aNode_Sub24_3425;
						if (i_2 == 4) {
							break label115;
						}

						long_16 += 16L;
					}
				}
			}
		}

		for (i_3 = i_2; i_3 < 4; i_3++) {
			arr_1[i_3] = null;
		}

		if (this.aByte9454 != 0) {
			i_3 = this.aShort9458 - this.aClass206_7970.anInt2628 * 453572397 * -527863643;
			i_4 = this.aShort9456 - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037;
			short s_5;
			int i_6;
			int i_7;
			short s_8;
			if (this.aByte9454 == 1) {
				if (i_4 > i_3) {
					s_5 = this.aShort9458;
					i_6 = this.aShort9456 - 1;
					i_7 = 1 + this.aShort9458;
					s_8 = this.aShort9456;
				} else {
					s_5 = this.aShort9458;
					i_6 = 1 + this.aShort9456;
					i_7 = this.aShort9458 - 1;
					s_8 = this.aShort9456;
				}
			} else if (i_4 > -i_3) {
				s_5 = this.aShort9458;
				i_6 = this.aShort9456 - 1;
				i_7 = this.aShort9458 - 1;
				s_8 = this.aShort9456;
			} else {
				s_5 = this.aShort9458;
				i_6 = this.aShort9456 + 1;
				i_7 = 1 + this.aShort9458;
				s_8 = this.aShort9456;
			}

			label79: for (i_9 = 0; i_9 < i_2; i_9++) {
				long long_10 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][s_5][i_6];

				Class287 class287_13;
				while (long_10 != 0L) {
					class287_13 = this.aClass206_7970.aClass287Array2646[(int) ((long_10 & 0xffffL) - 1L)];
					long_10 >>>= 16;
					if (arr_1[i_9] == class287_13.aNode_Sub24_3425) {
						continue label79;
					}
				}

				long_10 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_7][s_8];

				while (long_10 != 0L) {
					class287_13 = this.aClass206_7970.aClass287Array2646[(int) ((long_10 & 0xffffL) - 1L)];
					long_10 >>>= 16;
					if (arr_1[i_9] == class287_13.aNode_Sub24_3425) {
						continue label79;
					}
				}

				for (int i_12 = i_9; i_12 < i_2 - 1; i_12++) {
					arr_1[i_12] = arr_1[1 + i_12];
				}

				--i_2;
			}
		}

		return i_2;
	}

	void method14697(byte b_1) {
	}

	int method13036(Node_Sub24[] arr_1) {
		int i_3 = 0;

		int i_4;
		int i_5;
		int i_10;
		label115: for (i_4 = this.aShort9458; i_4 <= this.localX; i_4++) {
			label113: for (i_5 = this.aShort9456; i_5 <= this.localY; i_5++) {
				long long_15 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_4][i_5];
				long long_17 = 0L;

				while (true) {
					label108: while (true) {
						if (long_17 > 48L) {
							continue label113;
						}

						i_10 = (int) (long_15 >>> (int) long_17 & 0xffffL);
						if (i_10 <= 0) {
							continue label113;
						}

						Class287 class287_19 = this.aClass206_7970.aClass287Array2646[i_10 - 1];

						for (int i_12 = 0; i_12 < i_3; i_12++) {
							if (arr_1[i_12] == class287_19.aNode_Sub24_3425) {
								long_17 += 16L;
								continue label108;
							}
						}

						arr_1[i_3++] = class287_19.aNode_Sub24_3425;
						if (i_3 == 4) {
							break label115;
						}

						long_17 += 16L;
					}
				}
			}
		}

		for (i_4 = i_3; i_4 < 4; i_4++) {
			arr_1[i_4] = null;
		}

		if (this.aByte9454 != 0) {
			i_4 = this.aShort9458 - this.aClass206_7970.anInt2628;
			i_5 = this.aShort9456 - this.aClass206_7970.anInt2629;
			short s_6;
			int i_7;
			int i_8;
			short s_9;
			if (this.aByte9454 == 1) {
				if (i_5 > i_4) {
					s_6 = this.aShort9458;
					i_7 = this.aShort9456 - 1;
					i_8 = this.aShort9458 + 1;
					s_9 = this.aShort9456;
				} else {
					s_6 = this.aShort9458;
					i_7 = this.aShort9456 + 1;
					i_8 = this.aShort9458 - 1;
					s_9 = this.aShort9456;
				}
			} else if (i_5 > -i_4) {
				s_6 = this.aShort9458;
				i_7 = this.aShort9456 - 1;
				i_8 = this.aShort9458 - 1;
				s_9 = this.aShort9456;
			} else {
				s_6 = this.aShort9458;
				i_7 = this.aShort9456 + 1;
				i_8 = this.aShort9458 + 1;
				s_9 = this.aShort9456;
			}

			label79: for (i_10 = 0; i_10 < i_3; i_10++) {
				long long_11 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][s_6][i_7];

				Class287 class287_14;
				while (long_11 != 0L) {
					class287_14 = this.aClass206_7970.aClass287Array2646[(int) ((long_11 & 0xffffL) - 1L)];
					long_11 >>>= 16;
					if (arr_1[i_10] == class287_14.aNode_Sub24_3425) {
						continue label79;
					}
				}

				long_11 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_8][s_9];

				while (long_11 != 0L) {
					class287_14 = this.aClass206_7970.aClass287Array2646[(int) ((long_11 & 0xffffL) - 1L)];
					long_11 >>>= 16;
					if (arr_1[i_10] == class287_14.aNode_Sub24_3425) {
						continue label79;
					}
				}

				for (int i_13 = i_10; i_13 < i_3 - 1; i_13++) {
					arr_1[i_13] = arr_1[i_13 + 1];
				}

				--i_3;
			}
		}

		return i_3;
	}

	boolean method13037(GraphicalRenderer graphicalrenderer_1, int i_2) {
		return this.aClass206_7970.aClass201_2600.method3274(this.collisionPlane, this.aShort9458, this.localX, this.aShort9456, this.localY, this.method12992(graphicalrenderer_1, (byte) -128));
	}

	boolean method13029(byte b_1) {
		for (int i_2 = this.aShort9458; i_2 <= this.localX; i_2++) {
			for (int i_3 = this.aShort9456; i_3 <= this.localY; i_3++) {
				int i_4 = this.aClass206_7970.anInt2652 + (i_2 - this.aClass206_7970.anInt2628);
				if (i_4 >= 0 && i_4 < this.aClass206_7970.aBoolArrayArray2651.length) {
					int i_5 = this.aClass206_7970.anInt2652 + (i_3 - this.aClass206_7970.anInt2629);
					if (i_5 >= 0 && i_5 < this.aClass206_7970.aBoolArrayArray2651.length && this.aClass206_7970.aBoolArrayArray2651[i_4][i_5]) {
						return true;
					}
				}
			}
		}

		return false;
	}

	int method13031(Node_Sub24[] arr_1) {
		int i_2 = 0;

		int i_3;
		int i_4;
		int i_9;
		label115: for (i_3 = this.aShort9458; i_3 <= this.localX; i_3++) {
			label113: for (i_4 = this.aShort9456; i_4 <= this.localY; i_4++) {
				long long_14 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_3][i_4];
				long long_16 = 0L;

				while (true) {
					label108: while (true) {
						if (long_16 > 48L) {
							continue label113;
						}

						i_9 = (int) (long_14 >>> (int) long_16 & 0xffffL);
						if (i_9 <= 0) {
							continue label113;
						}

						Class287 class287_18 = this.aClass206_7970.aClass287Array2646[i_9 - 1];

						for (int i_11 = 0; i_11 < i_2; i_11++) {
							if (arr_1[i_11] == class287_18.aNode_Sub24_3425) {
								long_16 += 16L;
								continue label108;
							}
						}

						arr_1[i_2++] = class287_18.aNode_Sub24_3425;
						if (i_2 == 4) {
							break label115;
						}

						long_16 += 16L;
					}
				}
			}
		}

		for (i_3 = i_2; i_3 < 4; i_3++) {
			arr_1[i_3] = null;
		}

		if (this.aByte9454 != 0) {
			i_3 = this.aShort9458 - this.aClass206_7970.anInt2628 * 453572397 * -527863643;
			i_4 = this.aShort9456 - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037;
			short s_5;
			int i_6;
			int i_7;
			short s_8;
			if (this.aByte9454 == 1) {
				if (i_4 > i_3) {
					s_5 = this.aShort9458;
					i_6 = this.aShort9456 - 1;
					i_7 = 1 + this.aShort9458;
					s_8 = this.aShort9456;
				} else {
					s_5 = this.aShort9458;
					i_6 = 1 + this.aShort9456;
					i_7 = this.aShort9458 - 1;
					s_8 = this.aShort9456;
				}
			} else if (i_4 > -i_3) {
				s_5 = this.aShort9458;
				i_6 = this.aShort9456 - 1;
				i_7 = this.aShort9458 - 1;
				s_8 = this.aShort9456;
			} else {
				s_5 = this.aShort9458;
				i_6 = this.aShort9456 + 1;
				i_7 = 1 + this.aShort9458;
				s_8 = this.aShort9456;
			}

			label79: for (i_9 = 0; i_9 < i_2; i_9++) {
				long long_10 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][s_5][i_6];

				Class287 class287_13;
				while (long_10 != 0L) {
					class287_13 = this.aClass206_7970.aClass287Array2646[(int) ((long_10 & 0xffffL) - 1L)];
					long_10 >>>= 16;
					if (arr_1[i_9] == class287_13.aNode_Sub24_3425) {
						continue label79;
					}
				}

				long_10 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_7][s_8];

				while (long_10 != 0L) {
					class287_13 = this.aClass206_7970.aClass287Array2646[(int) ((long_10 & 0xffffL) - 1L)];
					long_10 >>>= 16;
					if (arr_1[i_9] == class287_13.aNode_Sub24_3425) {
						continue label79;
					}
				}

				for (int i_12 = i_9; i_12 < i_2 - 1; i_12++) {
					arr_1[i_12] = arr_1[1 + i_12];
				}

				--i_2;
			}
		}

		return i_2;
	}

	boolean method13022(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass206_7970.aClass201_2600.method3274(this.collisionPlane, this.aShort9458, this.localX, this.aShort9456, this.localY, this.method12992(graphicalrenderer_1, (byte) -106));
	}

	boolean method13032() {
		for (int i_1 = this.aShort9458; i_1 <= this.localX; i_1++) {
			for (int i_2 = this.aShort9456; i_2 <= this.localY; i_2++) {
				int i_3 = i_1 - this.aClass206_7970.anInt2628 * 453572397 * -527863643 + this.aClass206_7970.anInt2652 * 1632278577 * 1459994833;
				if (i_3 >= 0 && i_3 < this.aClass206_7970.aBoolArrayArray2651.length) {
					int i_4 = this.aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (i_2 - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037);
					if (i_4 >= 0 && i_4 < this.aClass206_7970.aBoolArrayArray2651.length && this.aClass206_7970.aBoolArrayArray2651[i_3][i_4]) {
						return true;
					}
				}
			}
		}

		return false;
	}

	int method12982(Node_Sub24[] arr_1) {
		int i_2 = 0;

		int i_3;
		int i_4;
		int i_9;
		label115: for (i_3 = this.aShort9458; i_3 <= this.localX; i_3++) {
			label113: for (i_4 = this.aShort9456; i_4 <= this.localY; i_4++) {
				long long_14 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_3][i_4];
				long long_16 = 0L;

				while (true) {
					label108: while (true) {
						if (long_16 > 48L) {
							continue label113;
						}

						i_9 = (int) (long_14 >>> (int) long_16 & 0xffffL);
						if (i_9 <= 0) {
							continue label113;
						}

						Class287 class287_18 = this.aClass206_7970.aClass287Array2646[i_9 - 1];

						for (int i_11 = 0; i_11 < i_2; i_11++) {
							if (arr_1[i_11] == class287_18.aNode_Sub24_3425) {
								long_16 += 16L;
								continue label108;
							}
						}

						arr_1[i_2++] = class287_18.aNode_Sub24_3425;
						if (i_2 == 4) {
							break label115;
						}

						long_16 += 16L;
					}
				}
			}
		}

		for (i_3 = i_2; i_3 < 4; i_3++) {
			arr_1[i_3] = null;
		}

		if (this.aByte9454 != 0) {
			i_3 = this.aShort9458 - this.aClass206_7970.anInt2628 * 453572397 * -527863643;
			i_4 = this.aShort9456 - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037;
			short s_5;
			int i_6;
			int i_7;
			short s_8;
			if (this.aByte9454 == 1) {
				if (i_4 > i_3) {
					s_5 = this.aShort9458;
					i_6 = this.aShort9456 - 1;
					i_7 = 1 + this.aShort9458;
					s_8 = this.aShort9456;
				} else {
					s_5 = this.aShort9458;
					i_6 = 1 + this.aShort9456;
					i_7 = this.aShort9458 - 1;
					s_8 = this.aShort9456;
				}
			} else if (i_4 > -i_3) {
				s_5 = this.aShort9458;
				i_6 = this.aShort9456 - 1;
				i_7 = this.aShort9458 - 1;
				s_8 = this.aShort9456;
			} else {
				s_5 = this.aShort9458;
				i_6 = this.aShort9456 + 1;
				i_7 = 1 + this.aShort9458;
				s_8 = this.aShort9456;
			}

			label79: for (i_9 = 0; i_9 < i_2; i_9++) {
				long long_10 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][s_5][i_6];

				Class287 class287_13;
				while (long_10 != 0L) {
					class287_13 = this.aClass206_7970.aClass287Array2646[(int) ((long_10 & 0xffffL) - 1L)];
					long_10 >>>= 16;
					if (arr_1[i_9] == class287_13.aNode_Sub24_3425) {
						continue label79;
					}
				}

				long_10 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_7][s_8];

				while (long_10 != 0L) {
					class287_13 = this.aClass206_7970.aClass287Array2646[(int) ((long_10 & 0xffffL) - 1L)];
					long_10 >>>= 16;
					if (arr_1[i_9] == class287_13.aNode_Sub24_3425) {
						continue label79;
					}
				}

				for (int i_12 = i_9; i_12 < i_2 - 1; i_12++) {
					arr_1[i_12] = arr_1[1 + i_12];
				}

				--i_2;
			}
		}

		return i_2;
	}

	boolean method13030(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass206_7970.aClass201_2600.method3274(this.collisionPlane, this.aShort9458, this.localX, this.aShort9456, this.localY, this.method12992(graphicalrenderer_1, (byte) -58));
	}

	boolean method12988(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass206_7970.aClass201_2600.method3274(this.collisionPlane, this.aShort9458, this.localX, this.aShort9456, this.localY, this.method12992(graphicalrenderer_1, (byte) -101));
	}

	int method13025(Node_Sub24[] arr_1) {
		int i_2 = 0;

		int i_3;
		int i_4;
		int i_9;
		label115: for (i_3 = this.aShort9458; i_3 <= this.localX; i_3++) {
			label113: for (i_4 = this.aShort9456; i_4 <= this.localY; i_4++) {
				long long_14 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_3][i_4];
				long long_16 = 0L;

				while (true) {
					label108: while (true) {
						if (long_16 > 48L) {
							continue label113;
						}

						i_9 = (int) (long_14 >>> (int) long_16 & 0xffffL);
						if (i_9 <= 0) {
							continue label113;
						}

						Class287 class287_18 = this.aClass206_7970.aClass287Array2646[i_9 - 1];

						for (int i_11 = 0; i_11 < i_2; i_11++) {
							if (arr_1[i_11] == class287_18.aNode_Sub24_3425) {
								long_16 += 16L;
								continue label108;
							}
						}

						arr_1[i_2++] = class287_18.aNode_Sub24_3425;
						if (i_2 == 4) {
							break label115;
						}

						long_16 += 16L;
					}
				}
			}
		}

		for (i_3 = i_2; i_3 < 4; i_3++) {
			arr_1[i_3] = null;
		}

		if (this.aByte9454 != 0) {
			i_3 = this.aShort9458 - this.aClass206_7970.anInt2628 * 453572397 * -527863643;
			i_4 = this.aShort9456 - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037;
			short s_5;
			int i_6;
			int i_7;
			short s_8;
			if (this.aByte9454 == 1) {
				if (i_4 > i_3) {
					s_5 = this.aShort9458;
					i_6 = this.aShort9456 - 1;
					i_7 = 1 + this.aShort9458;
					s_8 = this.aShort9456;
				} else {
					s_5 = this.aShort9458;
					i_6 = 1 + this.aShort9456;
					i_7 = this.aShort9458 - 1;
					s_8 = this.aShort9456;
				}
			} else if (i_4 > -i_3) {
				s_5 = this.aShort9458;
				i_6 = this.aShort9456 - 1;
				i_7 = this.aShort9458 - 1;
				s_8 = this.aShort9456;
			} else {
				s_5 = this.aShort9458;
				i_6 = this.aShort9456 + 1;
				i_7 = 1 + this.aShort9458;
				s_8 = this.aShort9456;
			}

			label79: for (i_9 = 0; i_9 < i_2; i_9++) {
				long long_10 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][s_5][i_6];

				Class287 class287_13;
				while (long_10 != 0L) {
					class287_13 = this.aClass206_7970.aClass287Array2646[(int) ((long_10 & 0xffffL) - 1L)];
					long_10 >>>= 16;
					if (arr_1[i_9] == class287_13.aNode_Sub24_3425) {
						continue label79;
					}
				}

				long_10 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_7][s_8];

				while (long_10 != 0L) {
					class287_13 = this.aClass206_7970.aClass287Array2646[(int) ((long_10 & 0xffffL) - 1L)];
					long_10 >>>= 16;
					if (arr_1[i_9] == class287_13.aNode_Sub24_3425) {
						continue label79;
					}
				}

				for (int i_12 = i_9; i_12 < i_2 - 1; i_12++) {
					arr_1[i_12] = arr_1[1 + i_12];
				}

				--i_2;
			}
		}

		return i_2;
	}

	boolean method12998(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass206_7970.aClass201_2600.method3274(this.collisionPlane, this.aShort9458, this.localX, this.aShort9456, this.localY, this.method12992(graphicalrenderer_1, (byte) -56));
	}

	boolean method13033() {
		for (int i_1 = this.aShort9458; i_1 <= this.localX; i_1++) {
			for (int i_2 = this.aShort9456; i_2 <= this.localY; i_2++) {
				int i_3 = i_1 - this.aClass206_7970.anInt2628 * 453572397 * -527863643 + this.aClass206_7970.anInt2652 * 1632278577 * 1459994833;
				if (i_3 >= 0 && i_3 < this.aClass206_7970.aBoolArrayArray2651.length) {
					int i_4 = this.aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (i_2 - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037);
					if (i_4 >= 0 && i_4 < this.aClass206_7970.aBoolArrayArray2651.length && this.aClass206_7970.aBoolArrayArray2651[i_3][i_4]) {
						return true;
					}
				}
			}
		}

		return false;
	}

	Transform_Sub1_Sub1(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, boolean bool_11, byte b_12) {
		super(sceneobjectmanager_1);
		this.plane = (byte) i_2;
		this.collisionPlane = (byte) i_3;
		this.method11171(new Vector3((float) i_4, (float) i_5, (float) i_6));
		this.aShort9458 = (short) i_7;
		this.localX = (short) i_8;
		this.aShort9456 = (short) i_9;
		this.localY = (short) i_10;
		this.aBool9459 = bool_11;
		this.aByte9454 = b_12;
	}

	boolean method13034() {
		for (int i_1 = this.aShort9458; i_1 <= this.localX; i_1++) {
			for (int i_2 = this.aShort9456; i_2 <= this.localY; i_2++) {
				int i_3 = i_1 - this.aClass206_7970.anInt2628 * 453572397 * -527863643 + this.aClass206_7970.anInt2652 * 1632278577 * 1459994833;
				if (i_3 >= 0 && i_3 < this.aClass206_7970.aBoolArrayArray2651.length) {
					int i_4 = this.aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (i_2 - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037);
					if (i_4 >= 0 && i_4 < this.aClass206_7970.aBoolArrayArray2651.length && this.aClass206_7970.aBoolArrayArray2651[i_3][i_4]) {
						return true;
					}
				}
			}
		}

		return false;
	}

}
