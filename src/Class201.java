public class Class201 {

	int[] anIntArray2560;
	int[] anIntArray2561;
	int[] anIntArray2562;
	int[] anIntArray2568;
	int[] anIntArray2569;
	int anInt2556;
	static GraphicalRenderer aGraphicalRenderer_2566;
	int anInt2564 = 0;
	int anInt2543 = -1;
	int anInt2570 = -1;
	int[] anIntArray2565;
	int anInt2567;
	public boolean aBool2552 = true;
	boolean aBool2542 = true;
	boolean aBool2548 = false;
	float[] aFloatArray2554 = new float[3];
	int[] anIntArray2550 = new int[2];
	boolean aBool2571 = true;
	int anInt2549;
	int anInt2563;
	SceneObjectManager aClass206_2546;
	Class231[] aClass231Array2553;
	Class231[] aClass231Array2555;
	int anInt2545;
	Class231[] aClass231Array2557;
	Class231[] aClass231Array2559;
	int[][][] anIntArrayArrayArray2551;
	Class205 aClass205_2547;

	public void method3262(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (i_1 != 8 && i_1 != 16) {
			Class293 class293_7 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_2][i_3][i_4];
			if (class293_7 == null) {
				this.aClass206_2546.aClass293ArrayArrayArray2604[i_2][i_3][i_4] = class293_7 = new Class293(i_2);
			}

			if (i_1 == 1) {
				class293_7.aShort3508 = (short) i_5;
				class293_7.aShort3501 = (short) i_6;
			} else if (i_1 == 2) {
				class293_7.aShort3510 = (short) i_5;
				class293_7.aShort3511 = (short) i_6;
			}

			if (this.aBool2548) {
				this.method3309();
			}
		} else {
			int i_8;
			int i_9;
			int i_10;
			int i_11;
			int i_12;
			int i_13;
			if (i_1 == 8) {
				i_13 = i_3 << this.aClass206_2546.anInt2592;
				i_8 = this.aClass206_2546.anInt2593 + i_13;
				i_9 = i_4 << this.aClass206_2546.anInt2592;
				i_10 = this.aClass206_2546.anInt2593 + i_9;
				i_11 = this.aClass206_2546.aGroundArray2607[i_2].method6722(i_3, i_4);
				i_12 = this.aClass206_2546.aGroundArray2607[i_2].method6722(i_3 + 1, i_4 + 1);
				this.aClass231Array2557[this.anInt2556++] = new Class231(this.aClass206_2546, i_1, i_2, i_13, i_8, i_8, i_13, i_11, i_12, i_12 - i_5, i_11 - i_5, i_9, i_10, i_10, i_9);
			} else {
				i_13 = this.aClass206_2546.anInt2593 + (i_3 << this.aClass206_2546.anInt2592);
				i_8 = i_13 - this.aClass206_2546.anInt2593;
				i_9 = i_4 << this.aClass206_2546.anInt2592;
				i_10 = this.aClass206_2546.anInt2593 + i_9;
				i_11 = this.aClass206_2546.aGroundArray2607[i_2].method6722(i_3 + 1, i_4);
				i_12 = this.aClass206_2546.aGroundArray2607[i_2].method6722(i_3, i_4 + 1);
				this.aClass231Array2557[this.anInt2556++] = new Class231(this.aClass206_2546, i_1, i_2, i_13, i_8, i_8, i_13, i_11, i_12, i_12 - i_5, i_11 - i_5, i_9, i_10, i_10, i_9);
			}
		}

	}

	public void method3264() {
		this.method3309();
	}

	void method3265(GraphicalRenderer graphicalrenderer_1, int i_2) {
		aGraphicalRenderer_2566 = graphicalrenderer_1;
		if (this.aBool2552 && this.aBool2542) {
			if (this.aBool2571) {
				this.aClass206_2546.aClass454_2597.method7548((byte) -54);
			}

			aGraphicalRenderer_2566.method8408(this.anIntArray2550);
			if (this.anInt2543 != (int) ((float) this.anIntArray2550[0] / 3.0F) || (int) ((float) this.anIntArray2550[1] / 3.0F) != this.anInt2570) {
				this.anInt2543 = (int) ((float) this.anIntArray2550[0] / 3.0F);
				this.anInt2570 = (int) ((float) this.anIntArray2550[1] / 3.0F);
				this.anIntArray2565 = new int[this.anInt2543 * this.anInt2570];
			}

			this.anInt2564 = 0;

			int i_3;
			for (i_3 = 0; i_3 < this.anInt2567; i_3++) {
				this.method3281(aGraphicalRenderer_2566, this.aClass231Array2553[i_3], i_2);
			}

			for (i_3 = 0; i_3 < this.anInt2545; i_3++) {
				this.method3281(aGraphicalRenderer_2566, this.aClass231Array2555[i_3], i_2);
			}

			for (i_3 = 0; i_3 < this.anInt2556; i_3++) {
				this.method3281(aGraphicalRenderer_2566, this.aClass231Array2557[i_3], i_2);
			}

			this.aClass205_2547.anInt2588 = 0;
			if (this.anInt2564 > 0) {
				i_3 = this.anIntArray2565.length;
				int i_4 = i_3 - i_3 & 0x7;

				int i_5;
				for (i_5 = 0; i_5 < i_4; this.anIntArray2565[i_5++] = Integer.MAX_VALUE) {
					this.anIntArray2565[i_5++] = Integer.MAX_VALUE;
					this.anIntArray2565[i_5++] = Integer.MAX_VALUE;
					this.anIntArray2565[i_5++] = Integer.MAX_VALUE;
					this.anIntArray2565[i_5++] = Integer.MAX_VALUE;
					this.anIntArray2565[i_5++] = Integer.MAX_VALUE;
					this.anIntArray2565[i_5++] = Integer.MAX_VALUE;
					this.anIntArray2565[i_5++] = Integer.MAX_VALUE;
				}

				while (i_5 < i_3) {
					this.anIntArray2565[i_5++] = Integer.MAX_VALUE;
				}

				this.aClass205_2547.anInt2587 = 1;

				for (int i_6 = 0; i_6 < this.anInt2564; i_6++) {
					Class231 class231_7 = this.aClass231Array2559[i_6];
					this.aClass205_2547.method3371(class231_7.aShortArray2862[0], class231_7.aShortArray2862[1], class231_7.aShortArray2862[3], class231_7.aShortArray2873[0], class231_7.aShortArray2873[1], class231_7.aShortArray2873[3], class231_7.aShortArray2875[0], class231_7.aShortArray2875[1], class231_7.aShortArray2875[3]);
					this.aClass205_2547.method3371(class231_7.aShortArray2862[1], class231_7.aShortArray2862[2], class231_7.aShortArray2862[3], class231_7.aShortArray2873[1], class231_7.aShortArray2873[2], class231_7.aShortArray2873[3], class231_7.aShortArray2875[1], class231_7.aShortArray2875[2], class231_7.aShortArray2875[3]);
				}

				this.aClass205_2547.anInt2587 = 2;
			}

			if (this.aBool2571) {
				this.aClass206_2546.aClass454_2597.method7548((byte) -68);
			}
		} else {
			this.anInt2564 = 0;
		}

	}

	public void method3266(int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		this.aClass231Array2553[this.anInt2567++] = new Class231(this.aClass206_2546, 4, i_2, i_3, i_4, i_4, i_3, i_7, i_8, i_8, i_7, i_5, i_5, i_6, i_6);
	}

	boolean method3269(Class231 class231_1, int i_2) {
		if (!this.method3270(class231_1.anIntArray2859[i_2], class231_1.anIntArray2871[i_2], class231_1.anIntArray2864[i_2])) {
			return false;
		} else {
			class231_1.aShortArray2873[i_2] = (short) ((int) this.aFloatArray2554[0]);
			class231_1.aShortArray2862[i_2] = (short) ((int) this.aFloatArray2554[1]);
			class231_1.aShortArray2875[i_2] = (short) ((int) this.aFloatArray2554[2]);
			return true;
		}
	}

	final boolean method3270(int i_1, int i_2, int i_3) {
		aGraphicalRenderer_2566.method8479((float) i_1, (float) i_2, (float) i_3, this.aFloatArray2554);
		if (this.aFloatArray2554[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray2554[0] /= 3.0F;
			this.aFloatArray2554[1] /= 3.0F;
			return true;
		}
	}

	boolean method3271(int i_1, int i_2, int i_3) {
		if (this.aBool2552 && this.aBool2542) {
			if (this.aClass205_2547.anInt2588 < 102) {
				return false;
			} else {
				int i_4 = this.anIntArrayArrayArray2551[i_1][i_2][i_3];
				if (i_4 == -this.aClass206_2546.anInt2609) {
					return false;
				} else if (this.aClass206_2546.anInt2609 == i_4) {
					return true;
				} else if (this.aClass206_2546.aGroundArray2591 == this.aClass206_2546.aGroundArray2614) {
					return false;
				} else {
					int i_5 = i_2 << this.aClass206_2546.anInt2592;
					int i_6 = i_3 << this.aClass206_2546.anInt2592;
					if (this.method3277(i_5 + 1, this.aClass206_2546.aGroundArray2591[i_1].method6722(i_2, i_3), i_6 + 1, this.aClass206_2546.anInt2593 + i_5 - 1, this.aClass206_2546.aGroundArray2591[i_1].method6722(i_2 + 1, i_3 + 1), this.aClass206_2546.anInt2593 + i_6 - 1, i_5 + 1, this.aClass206_2546.aGroundArray2591[i_1].method6722(i_2, i_3 + 1), this.aClass206_2546.anInt2593 + i_6 - 1) && this.method3277(i_5 + 1, this.aClass206_2546.aGroundArray2591[i_1].method6722(i_2, i_3), i_6 + 1, this.aClass206_2546.anInt2593 + i_5 - 1, this.aClass206_2546.aGroundArray2591[i_1].method6722(i_2 + 1, i_3), i_6 + 1, this.aClass206_2546.anInt2593 + i_5 - 1, this.aClass206_2546.aGroundArray2591[i_1].method6722(i_2 + 1, i_3 + 1), this.aClass206_2546.anInt2593 + i_6 - 1)) {
						this.anIntArrayArrayArray2551[i_1][i_2][i_3] = this.aClass206_2546.anInt2609;
						return true;
					} else {
						this.anIntArrayArrayArray2551[i_1][i_2][i_3] = -this.aClass206_2546.anInt2609;
						return false;
					}
				}
			}
		} else {
			return false;
		}
	}

	boolean method3273(int i_1, int i_2, int i_3, int i_4) {
		if (this.aBool2552 && this.aBool2542) {
			if (this.aClass205_2547.anInt2588 < 102) {
				return false;
			} else if (!this.method3271(i_1, i_2, i_3)) {
				return false;
			} else {
				int i_5 = i_2 << this.aClass206_2546.anInt2592;
				int i_6 = i_3 << this.aClass206_2546.anInt2592;
				return this.method3276(i_5, this.aClass206_2546.aGroundArray2591[i_1].method6722(i_2, i_3), i_6, this.aClass206_2546.anInt2593, i_4, this.aClass206_2546.anInt2593);
			}
		} else {
			return false;
		}
	}

	boolean method3274(int i_1, int i_2, int i_3, int i_4, int i_5, Class200 class200_6) {
		if (this.aBool2552 && this.aBool2542) {
			if (this.aClass205_2547.anInt2588 < 102) {
				return false;
			} else if (i_3 == i_2 && i_5 == i_4) {
				return !this.method3271(i_1, i_2, i_4) ? false : this.method3299(class200_6);
			} else {
				for (int i_7 = i_2; i_7 <= i_3; i_7++) {
					for (int i_8 = i_4; i_8 <= i_5; i_8++) {
						if (this.anIntArrayArrayArray2551[i_1][i_7][i_8] == -this.aClass206_2546.anInt2609) {
							return false;
						}
					}
				}

				if (!this.method3299(class200_6)) {
					return false;
				} else {
					return true;
				}
			}
		} else {
			return false;
		}
	}

	boolean method3275(Transform_Sub1_Sub5 class521_sub1_sub5_1, int i_2, int i_3, int i_4) {
		if (this.aBool2552 && this.aBool2542) {
			if (this.aClass205_2547.anInt2588 < 102) {
				return false;
			} else if (!this.method3271(i_2, i_3, i_4)) {
				return false;
			} else {
				int i_5 = i_3 << this.aClass206_2546.anInt2592;
				int i_6 = i_4 << this.aClass206_2546.anInt2592;
				int i_7 = this.aClass206_2546.aGroundArray2591[i_2].method6722(i_3, i_4) - 1;
				int i_8 = i_7 + class521_sub1_sub5_1.method12995(-1987253874);
				return class521_sub1_sub5_1.aShort9615 == 1 ? (!this.method3277(i_5, i_7, i_6, i_5, i_8, i_6, i_5, i_8, this.aClass206_2546.anInt2593 + i_6) ? false : this.method3277(i_5, i_7, i_6, i_5, i_8, this.aClass206_2546.anInt2593 + i_6, i_5, i_7, this.aClass206_2546.anInt2593 + i_6)) : (class521_sub1_sub5_1.aShort9615 == 2 ? (!this.method3277(i_5, i_7, this.aClass206_2546.anInt2593 + i_6, this.aClass206_2546.anInt2593 + i_5, i_8, this.aClass206_2546.anInt2593 + i_6, i_5, i_8, this.aClass206_2546.anInt2593 + i_6) ? false : this.method3277(i_5, i_7, this.aClass206_2546.anInt2593 + i_6, this.aClass206_2546.anInt2593 + i_5, i_7, this.aClass206_2546.anInt2593 + i_6, this.aClass206_2546.anInt2593 + i_5, i_8, this.aClass206_2546.anInt2593 + i_6)) : (class521_sub1_sub5_1.aShort9615 == 4 ? (!this.method3277(this.aClass206_2546.anInt2593 + i_5, i_7, i_6, this.aClass206_2546.anInt2593 + i_5, i_8, i_6, this.aClass206_2546.anInt2593 + i_5, i_8, this.aClass206_2546.anInt2593 + i_6) ? false : this.method3277(this.aClass206_2546.anInt2593 + i_5, i_7, i_6, this.aClass206_2546.anInt2593 + i_5, i_8, this.aClass206_2546.anInt2593 + i_6, this.aClass206_2546.anInt2593 + i_5, i_7, this.aClass206_2546.anInt2593 + i_6)) : (class521_sub1_sub5_1.aShort9615 == 8 ? (!this.method3277(i_5, i_7, i_6, this.aClass206_2546.anInt2593 + i_5, i_8, i_6, i_5, i_8, i_6) ? false : this.method3277(i_5, i_7, i_6, this.aClass206_2546.anInt2593 + i_5, i_7, i_6, this.aClass206_2546.anInt2593 + i_5, i_8, i_6)) : (class521_sub1_sub5_1.aShort9615 == 16 ? this.method3276(i_5, i_7, this.aClass206_2546.anInt2594 + i_6, this.aClass206_2546.anInt2594, i_8, this.aClass206_2546.anInt2594) : (class521_sub1_sub5_1.aShort9615 == 32 ? this.method3276(this.aClass206_2546.anInt2594 + i_5, i_7, this.aClass206_2546.anInt2594 + i_6, this.aClass206_2546.anInt2594, i_8, this.aClass206_2546.anInt2594) : (class521_sub1_sub5_1.aShort9615 == 64 ? this.method3276(this.aClass206_2546.anInt2594 + i_5, i_7, i_6, this.aClass206_2546.anInt2594, i_8, this.aClass206_2546.anInt2594) : (class521_sub1_sub5_1.aShort9615 == 128 ? this.method3276(i_5, i_7, i_6, this.aClass206_2546.anInt2594, i_8, this.aClass206_2546.anInt2594) : true)))))));
			}
		} else {
			return false;
		}
	}

	final boolean method3276(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = i_4 + i_1;
		int i_8 = i_5 + i_2;
		int i_9 = i_3 + i_6;
		if (!this.method3277(i_1, i_8, i_3, i_7, i_8, i_9, i_1, i_8, i_9)) {
			return false;
		} else if (!this.method3277(i_1, i_8, i_3, i_7, i_8, i_3, i_7, i_8, i_9)) {
			return false;
		} else {
			if (i_1 < this.aClass206_2546.anInt2630) {
				if (!this.method3277(i_1, i_2, i_9, i_1, i_8, i_3, i_1, i_8, i_9)) {
					return false;
				}

				if (!this.method3277(i_1, i_2, i_9, i_1, i_2, i_3, i_1, i_8, i_3)) {
					return false;
				}
			} else {
				if (!this.method3277(i_7, i_2, i_9, i_7, i_8, i_3, i_7, i_8, i_9)) {
					return false;
				}

				if (!this.method3277(i_7, i_2, i_9, i_7, i_2, i_3, i_7, i_8, i_3)) {
					return false;
				}
			}

			if (i_3 < this.aClass206_2546.anInt2650) {
				if (!this.method3277(i_1, i_2, i_3, i_7, i_8, i_3, i_1, i_8, i_3)) {
					return false;
				}

				if (!this.method3277(i_1, i_2, i_3, i_7, i_2, i_3, i_7, i_8, i_3)) {
					return false;
				}
			} else {
				if (!this.method3277(i_1, i_2, i_9, i_7, i_8, i_9, i_1, i_8, i_9)) {
					return false;
				}

				if (!this.method3277(i_1, i_2, i_9, i_7, i_2, i_9, i_7, i_8, i_9)) {
					return false;
				}
			}

			return true;
		}
	}

	final boolean method3277(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (!this.method3270(i_1, i_2, i_3)) {
			return false;
		} else {
			i_1 = (int) this.aFloatArray2554[0];
			i_2 = (int) this.aFloatArray2554[1];
			i_3 = (int) this.aFloatArray2554[2];
			if (!this.method3270(i_4, i_5, i_6)) {
				return false;
			} else {
				i_4 = (int) this.aFloatArray2554[0];
				i_5 = (int) this.aFloatArray2554[1];
				i_6 = (int) this.aFloatArray2554[2];
				if (!this.method3270(i_7, i_8, i_9)) {
					return false;
				} else {
					i_7 = (int) this.aFloatArray2554[0];
					i_8 = (int) this.aFloatArray2554[1];
					i_9 = (int) this.aFloatArray2554[2];
					return this.aClass205_2547.method3371(i_2, i_5, i_8, i_1, i_4, i_7, i_3, i_6, i_9);
				}
			}
		}
	}

	void method3281(GraphicalRenderer graphicalrenderer_1, Class231 class231_2, int i_3) {
		aGraphicalRenderer_2566 = graphicalrenderer_1;
		int i_4;
		if (this.anIntArray2569 != null && class231_2.aByte2865 >= i_3) {
			for (i_4 = 0; i_4 < this.anIntArray2569.length; i_4++) {
				if (this.anIntArray2569[i_4] != -1000000 && (class231_2.anIntArray2871[0] <= this.anIntArray2569[i_4] || class231_2.anIntArray2871[1] <= this.anIntArray2569[i_4] || class231_2.anIntArray2871[2] <= this.anIntArray2569[i_4] || class231_2.anIntArray2871[3] <= this.anIntArray2569[i_4]) && (class231_2.anIntArray2859[0] <= this.anIntArray2562[i_4] || class231_2.anIntArray2859[1] <= this.anIntArray2562[i_4] || class231_2.anIntArray2859[2] <= this.anIntArray2562[i_4] || class231_2.anIntArray2859[3] <= this.anIntArray2562[i_4]) && (class231_2.anIntArray2859[0] >= this.anIntArray2561[i_4] || class231_2.anIntArray2859[1] >= this.anIntArray2561[i_4] || class231_2.anIntArray2859[2] >= this.anIntArray2561[i_4] || class231_2.anIntArray2859[3] >= this.anIntArray2561[i_4]) && (class231_2.anIntArray2864[0] <= this.anIntArray2568[i_4] || class231_2.anIntArray2864[1] <= this.anIntArray2568[i_4] || class231_2.anIntArray2864[2] <= this.anIntArray2568[i_4] || class231_2.anIntArray2864[3] <= this.anIntArray2568[i_4]) && (class231_2.anIntArray2864[0] >= this.anIntArray2560[i_4] || class231_2.anIntArray2864[1] >= this.anIntArray2560[i_4] || class231_2.anIntArray2864[2] >= this.anIntArray2560[i_4] || class231_2.anIntArray2864[3] >= this.anIntArray2560[i_4])) {
					return;
				}
			}
		}

		int i_5;
		int i_6;
		boolean bool_7;
		float f_8;
		if (class231_2.aByte2863 == 1) {
			i_4 = this.aClass206_2546.anInt2652 + (class231_2.aShort2866 - this.aClass206_2546.anInt2628);
			if (i_4 >= 0 && i_4 <= this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
				i_5 = this.aClass206_2546.anInt2652 + (class231_2.aShort2868 - this.aClass206_2546.anInt2629);
				if (i_5 < 0) {
					i_5 = 0;
				} else if (i_5 > this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
					return;
				}

				i_6 = this.aClass206_2546.anInt2652 + (class231_2.aShort2869 - this.aClass206_2546.anInt2629);
				if (i_6 > this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
					i_6 = this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652;
				} else if (i_6 < 0) {
					return;
				}

				bool_7 = false;

				while (i_5 <= i_6) {
					if (this.aClass206_2546.aBoolArrayArray2651[i_4][i_5++]) {
						bool_7 = true;
						break;
					}
				}

				if (bool_7) {
					f_8 = (float) (this.aClass206_2546.anInt2630 - class231_2.anIntArray2859[0]);
					if (f_8 < 0.0F) {
						f_8 *= -1.0F;
					}

					if (f_8 >= (float) this.anInt2549 && this.method3269(class231_2, 0) && this.method3269(class231_2, 1) && this.method3269(class231_2, 2) && this.method3269(class231_2, 3)) {
						this.aClass231Array2559[this.anInt2564++] = class231_2;
					}
				}
			}
		} else if (class231_2.aByte2863 == 2) {
			i_4 = this.aClass206_2546.anInt2652 + (class231_2.aShort2868 - this.aClass206_2546.anInt2629);
			if (i_4 >= 0 && i_4 <= this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
				i_5 = this.aClass206_2546.anInt2652 + (class231_2.aShort2866 - this.aClass206_2546.anInt2628);
				if (i_5 < 0) {
					i_5 = 0;
				} else if (i_5 > this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
					return;
				}

				i_6 = this.aClass206_2546.anInt2652 + (class231_2.aShort2867 - this.aClass206_2546.anInt2628);
				if (i_6 > this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
					i_6 = this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652;
				} else if (i_6 < 0) {
					return;
				}

				bool_7 = false;

				while (i_5 <= i_6) {
					if (this.aClass206_2546.aBoolArrayArray2651[i_5++][i_4]) {
						bool_7 = true;
						break;
					}
				}

				if (bool_7) {
					f_8 = (float) (this.aClass206_2546.anInt2650 - class231_2.anIntArray2864[0]);
					if (f_8 < 0.0F) {
						f_8 *= -1.0F;
					}

					if (f_8 >= (float) this.anInt2549 && this.method3269(class231_2, 0) && this.method3269(class231_2, 1) && this.method3269(class231_2, 2) && this.method3269(class231_2, 3)) {
						this.aClass231Array2559[this.anInt2564++] = class231_2;
					}
				}
			}
		} else if (class231_2.aByte2863 != 16 && class231_2.aByte2863 != 8) {
			if (class231_2.aByte2863 == 4) {
				float f_12 = (float) (class231_2.anIntArray2871[0] - this.aClass206_2546.anInt2632);
				if (f_12 > (float) this.anInt2563) {
					i_5 = this.aClass206_2546.anInt2652 + (class231_2.aShort2868 - this.aClass206_2546.anInt2629);
					if (i_5 < 0) {
						i_5 = 0;
					} else if (i_5 > this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
						return;
					}

					i_6 = this.aClass206_2546.anInt2652 + (class231_2.aShort2869 - this.aClass206_2546.anInt2629);
					if (i_6 > this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
						i_6 = this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652;
					} else if (i_6 < 0) {
						return;
					}

					int i_15 = this.aClass206_2546.anInt2652 + (class231_2.aShort2866 - this.aClass206_2546.anInt2628);
					if (i_15 < 0) {
						i_15 = 0;
					} else if (i_15 > this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
						return;
					}

					int i_16 = this.aClass206_2546.anInt2652 + (class231_2.aShort2867 - this.aClass206_2546.anInt2628);
					if (i_16 > this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
						i_16 = this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652;
					} else if (i_16 < 0) {
						return;
					}

					boolean bool_9 = false;

					label215: for (int i_10 = i_15; i_10 <= i_16; i_10++) {
						for (int i_11 = i_5; i_11 <= i_6; i_11++) {
							if (this.aClass206_2546.aBoolArrayArray2651[i_10][i_11]) {
								bool_9 = true;
								break label215;
							}
						}
					}

					if (bool_9 && this.method3269(class231_2, 0) && this.method3269(class231_2, 1) && this.method3269(class231_2, 2) && this.method3269(class231_2, 3)) {
						this.aClass231Array2559[this.anInt2564++] = class231_2;
					}
				}
			}
		} else {
			i_4 = this.aClass206_2546.anInt2652 + (class231_2.aShort2866 - this.aClass206_2546.anInt2628);
			if (i_4 >= 0 && i_4 <= this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652) {
				i_5 = this.aClass206_2546.anInt2652 + (class231_2.aShort2868 - this.aClass206_2546.anInt2629);
				if (i_5 >= 0 && i_5 <= this.aClass206_2546.anInt2652 + this.aClass206_2546.anInt2652 && this.aClass206_2546.aBoolArrayArray2651[i_4][i_5]) {
					float f_13 = (float) (this.aClass206_2546.anInt2630 - class231_2.anIntArray2859[0]);
					if (f_13 < 0.0F) {
						f_13 *= -1.0F;
					}

					float f_14 = (float) (this.aClass206_2546.anInt2650 - class231_2.anIntArray2864[0]);
					if (f_14 < 0.0F) {
						f_14 *= -1.0F;
					}

					if ((f_13 >= (float) this.anInt2549 || f_14 >= (float) this.anInt2549) && this.method3269(class231_2, 0) && this.method3269(class231_2, 1) && this.method3269(class231_2, 2) && this.method3269(class231_2, 3)) {
						this.aClass231Array2559[this.anInt2564++] = class231_2;
					}
				}
			}
		}

	}

	public void method3297(int i_1, int i_2, int i_3, int i_4) {
		if (i_1 != 8 && i_1 != 16) {
			Class293 class293_5 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_2][i_3][i_4];
			if (class293_5 != null) {
				if (i_1 == 1) {
					class293_5.aShort3508 = 0;
				} else if (i_1 == 2) {
					class293_5.aShort3510 = 0;
				}
			}

			this.method3309();
		} else {
			for (int i_7 = 0; i_7 < this.anInt2556; i_7++) {
				Class231 class231_6 = this.aClass231Array2557[i_7];
				if (class231_6.aByte2863 == i_1 && i_2 == class231_6.aByte2865 && (i_3 == class231_6.aShort2866 && i_4 == class231_6.aShort2868 || i_3 == class231_6.aShort2867 && i_4 == class231_6.aShort2869)) {
					if (i_7 != this.anInt2556) {
						System.arraycopy(this.aClass231Array2557, i_7 + 1, this.aClass231Array2557, i_7, this.aClass231Array2557.length - (i_7 + 1));
					}

					--this.anInt2556;
					break;
				}
			}
		}

	}

	final boolean method3299(Class200 class200_1) {
		return class200_1 == null ? false : this.method3276(class200_1.anInt2535, class200_1.anInt2537, class200_1.anInt2539, class200_1.anInt2536 - class200_1.anInt2535, class200_1.anInt2538 - class200_1.anInt2537, class200_1.anInt2531 - class200_1.anInt2539);
	}

	Class201(SceneObjectManager sceneobjectmanager_1) {
		this.anInt2549 = sceneobjectmanager_1.anInt2593;
		this.anInt2563 = sceneobjectmanager_1.anInt2593;
		this.aClass206_2546 = sceneobjectmanager_1;
		this.aClass231Array2553 = new Class231[509];
		this.anInt2567 = 0;
		this.aClass231Array2555 = new Class231[2034];
		this.anInt2545 = 0;
		this.aClass231Array2557 = new Class231[1027];
		this.anInt2556 = 0;
		this.aClass231Array2559 = new Class231[1005];
		this.anInt2564 = 0;
		this.anIntArrayArrayArray2551 = new int[this.aClass206_2546.anInt2601][this.aClass206_2546.sizeX + 1][this.aClass206_2546.sizeY + 1];
		this.aBool2548 = false;
		if (this.aClass206_2546.aGraphicalRenderer_2596 instanceof ja) {
			this.aBool2552 = false;
		} else {
			this.aBool2552 = true;
		}

		if (this.aBool2552) {
			this.aClass205_2547 = new Class205(this);
		}

	}

	void method3309() {
		int i_1;
		for (i_1 = 0; i_1 < this.anInt2545; i_1++) {
			this.aClass231Array2555[i_1] = null;
		}

		this.anInt2545 = 0;

		int i_2;
		int i_3;
		Class293 class293_4;
		for (i_1 = 0; i_1 < this.aClass206_2546.anInt2601; i_1++) {
			for (i_2 = 0; i_2 < this.aClass206_2546.sizeX; i_2++) {
				for (i_3 = 0; i_3 < this.aClass206_2546.sizeY; i_3++) {
					class293_4 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_2];
					if (class293_4 != null) {
						if (class293_4.aShort3508 > 0) {
							class293_4.aShort3508 = (short) (class293_4.aShort3508 * -1);
						}

						if (class293_4.aShort3510 > 0) {
							class293_4.aShort3510 = (short) (class293_4.aShort3510 * -1);
						}
					}
				}
			}
		}

		for (i_1 = 0; i_1 < this.aClass206_2546.anInt2601; i_1++) {
			for (i_2 = 0; i_2 < this.aClass206_2546.sizeX; i_2++) {
				for (i_3 = 0; i_3 < this.aClass206_2546.sizeY; i_3++) {
					class293_4 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_2];
					if (class293_4 != null) {
						boolean bool_5 = this.aClass206_2546.aClass293ArrayArrayArray2604[0][i_3][i_2] != null && this.aClass206_2546.aClass293ArrayArrayArray2604[0][i_3][i_2].aClass293_3509 != null;
						int i_6;
						int i_7;
						int i_9;
						Class293 class293_10;
						int i_11;
						int i_12;
						int i_13;
						int i_14;
						int i_15;
						int i_16;
						int i_17;
						int i_18;
						int i_19;
						int i_20;
						int i_21;
						if (class293_4.aShort3508 < 0) {
							i_6 = i_2;
							i_7 = i_2;
							i_9 = i_1;
							class293_10 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_2 - 1];

							for (i_11 = this.aClass206_2546.aGroundArray2607[i_1].method6722(i_3, i_2); i_6 > 0 && class293_10 != null && class293_10.aShort3508 < 0 && class293_10.aShort3508 == class293_4.aShort3508 && class293_10.aShort3501 == class293_4.aShort3501 && i_11 == this.aClass206_2546.aGroundArray2607[i_1].method6722(i_3, i_6 - 1) && (i_6 - 1 <= 0 || i_11 == this.aClass206_2546.aGroundArray2607[i_1].method6722(i_3, i_6 - 2)) && i_7 - i_6 <= 10; class293_10 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_6 - 1]) {
								--i_6;
							}

							for (class293_10 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_7 + 1]; i_7 < this.aClass206_2546.sizeY && class293_10 != null && class293_10.aShort3508 < 0 && class293_10.aShort3508 == class293_4.aShort3508 && class293_10.aShort3501 == class293_4.aShort3501 && i_11 == this.aClass206_2546.aGroundArray2607[i_1].method6722(i_3, i_7 + 1) && (i_7 + 1 >= this.aClass206_2546.sizeY || i_11 == this.aClass206_2546.aGroundArray2607[i_1].method6722(i_3, i_7 + 2)) && i_7 - i_6 <= 10; class293_10 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3][i_7 + 1]) {
								++i_7;
							}

							i_12 = i_1 - i_1 + 1;
							i_13 = this.aClass206_2546.aGroundArray2607[bool_5 ? i_1 + 1 : i_1].method6722(i_3, i_6);
							i_14 = i_13 + i_12 * class293_4.aShort3508;
							i_15 = this.aClass206_2546.aGroundArray2607[bool_5 ? i_1 + 1 : i_1].method6722(i_3, i_7 + 1);
							i_16 = i_15 + i_12 * class293_4.aShort3508;
							i_17 = i_3 << this.aClass206_2546.anInt2592;
							i_18 = i_6 << this.aClass206_2546.anInt2592;
							i_19 = (i_7 << this.aClass206_2546.anInt2592) + this.aClass206_2546.anInt2593;
							this.aClass231Array2555[this.anInt2545++] = new Class231(this.aClass206_2546, 1, i_1, i_17 + class293_4.aShort3501, i_17 + class293_4.aShort3501, i_17 + class293_4.aShort3501, i_17 + class293_4.aShort3501, i_13, i_15, i_16, i_14, i_18, i_19, i_19, i_18);

							for (i_20 = i_1; i_20 <= i_9; i_20++) {
								for (i_21 = i_6; i_21 <= i_7; i_21++) {
									this.aClass206_2546.aClass293ArrayArrayArray2604[i_20][i_3][i_21].aShort3508 = (short) (this.aClass206_2546.aClass293ArrayArrayArray2604[i_20][i_3][i_21].aShort3508 * -1);
								}
							}
						}

						if (class293_4.aShort3510 < 0) {
							i_6 = i_3;
							i_7 = i_3;
							i_9 = i_1;
							class293_10 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_3 - 1][i_2];

							for (i_11 = this.aClass206_2546.aGroundArray2607[i_1].method6722(i_3, i_2); i_6 > 0 && class293_10 != null && class293_10.aShort3510 < 0 && class293_10.aShort3510 == class293_4.aShort3510 && class293_10.aShort3511 == class293_4.aShort3511 && i_11 == this.aClass206_2546.aGroundArray2607[i_1].method6722(i_6 - 1, i_2) && (i_6 - 1 <= 0 || i_11 == this.aClass206_2546.aGroundArray2607[i_1].method6722(i_6 - 2, i_2)) && i_7 - i_6 <= 10; class293_10 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_6 - 1][i_2]) {
								--i_6;
							}

							for (class293_10 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_7 + 1][i_2]; i_7 < this.aClass206_2546.sizeX && class293_10 != null && class293_10.aShort3510 < 0 && class293_10.aShort3510 == class293_4.aShort3510 && class293_10.aShort3511 == class293_4.aShort3511 && i_11 == this.aClass206_2546.aGroundArray2607[i_1].method6722(i_7 + 1, i_2) && (i_7 + 1 >= this.aClass206_2546.sizeX || i_11 == this.aClass206_2546.aGroundArray2607[i_1].method6722(i_7 + 2, i_2)) && i_7 - i_6 <= 10; class293_10 = this.aClass206_2546.aClass293ArrayArrayArray2604[i_1][i_7 + 1][i_2]) {
								++i_7;
							}

							i_12 = i_1 - i_1 + 1;
							i_13 = this.aClass206_2546.aGroundArray2607[bool_5 ? i_1 + 1 : i_1].method6722(i_6, i_2);
							i_14 = i_13 + i_12 * class293_4.aShort3510;
							i_15 = this.aClass206_2546.aGroundArray2607[bool_5 ? i_1 + 1 : i_1].method6722(i_7 + 1, i_2);
							i_16 = i_15 + i_12 * class293_4.aShort3510;
							i_17 = i_6 << this.aClass206_2546.anInt2592;
							i_18 = (i_7 << this.aClass206_2546.anInt2592) + this.aClass206_2546.anInt2593;
							i_19 = i_2 << this.aClass206_2546.anInt2592;
							this.aClass231Array2555[this.anInt2545++] = new Class231(this.aClass206_2546, 2, i_1, i_17, i_18, i_18, i_17, i_13, i_15, i_16, i_14, i_19 + class293_4.aShort3511, i_19 + class293_4.aShort3511, i_19 + class293_4.aShort3511, i_19 + class293_4.aShort3511);

							for (i_20 = i_1; i_20 <= i_9; i_20++) {
								for (i_21 = i_6; i_21 <= i_7; i_21++) {
									this.aClass206_2546.aClass293ArrayArrayArray2604[i_20][i_21][i_2].aShort3510 = (short) (this.aClass206_2546.aClass293ArrayArrayArray2604[i_20][i_21][i_2].aShort3510 * -1);
								}
							}
						}
					}
				}
			}
		}

		this.aBool2548 = true;
	}

}
