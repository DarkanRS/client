package com.jagex;
public class Node_Sub27 extends Node {

	int anInt7692;
	boolean aBool7693;
	static int[] anIntArray7696;
	int[] anIntArray7694;
	int anInt7695;
	int anInt7691;

	void method12403(int i_1, int i_2) {
		if (i_1 != 0 || i_2 != 0) {
			if (anIntArray7696 == null || anIntArray7696.length != this.anIntArray7694.length) {
				anIntArray7696 = new int[this.anIntArray7694.length];
			}

			int i_3 = this.anIntArray7694.length;
			int i_4 = i_1;
			int i_5 = this.anInt7691 - 1;
			int i_6 = i_2 * this.anInt7691;
			int i_7 = i_3 - 1;

			for (int i_8 = 0; i_8 < i_3; i_8 += this.anInt7691) {
				int i_9 = i_8 + i_6 & i_7;

				for (int i_10 = 0; i_10 < this.anInt7691; i_10++) {
					int i_11 = i_8 + i_10;
					int i_12 = i_9 + (i_10 + i_4 & i_5);
					anIntArray7696[i_11] = this.anIntArray7694[i_12];
				}
			}

			int[] ints_13 = this.anIntArray7694;
			this.anIntArray7694 = anIntArray7696;
			anIntArray7696 = ints_13;
		}

	}

	Node_Sub27(int i_1, int i_2, int[] ints_3, boolean bool_4) {
		this.anInt7695 = i_1;
		this.anInt7691 = i_2;
		this.anIntArray7694 = ints_3;
		if (bool_4) {
			int[] ints_5 = new int[this.anInt7691];
			int[] ints_6 = new int[this.anInt7691];
			int[] ints_7 = new int[this.anInt7691];
			int[] ints_8 = new int[this.anInt7691];
			if (anIntArray7696 == null || anIntArray7696.length != this.anIntArray7694.length) {
				anIntArray7696 = new int[this.anIntArray7694.length];
			}

			int i_9 = this.anInt7691;
			int i_10 = this.anInt7691;
			int i_11 = i_9 - 1;
			int i_12 = i_10 - 1;
			int i_13 = i_9 * i_10;
			int i_14 = i_9;
			int i_15 = i_9;

			int i_16;
			int i_17;
			int i_18;
			for (i_16 = 2; i_16 >= 0; --i_16) {
				for (i_17 = i_11; i_17 >= 0; --i_17) {
					--i_14;
					i_18 = this.anIntArray7694[i_14];
					ints_5[i_17] += i_18 >> 24 & 0xff;
					ints_6[i_17] += i_18 >> 16 & 0xff;
					ints_7[i_17] += i_18 >> 8 & 0xff;
					ints_8[i_17] += i_18 & 0xff;
				}

				if (i_14 == 0) {
					i_14 = i_13;
				}
			}

			i_16 = i_13;

			for (i_17 = i_12; i_17 >= 0; --i_17) {
				i_18 = 1;
				int i_19 = 1;
				int i_20 = 0;
				int i_21 = 0;
				int i_22 = 0;
				int i_23 = 0;

				int i_24;
				for (i_24 = 2; i_24 >= 0; --i_24) {
					--i_19;
					i_23 += ints_5[i_19];
					i_22 += ints_6[i_19];
					i_20 += ints_7[i_19];
					i_21 += ints_8[i_19];
					if (i_19 == 0) {
						i_19 = i_9;
					}
				}

				int i_25;
				int i_26;
				for (i_24 = i_11; i_24 >= 0; --i_24) {
					--i_19;
					--i_18;
					i_25 = i_23 / 9;
					i_26 = i_22 / 9;
					int i_27 = i_20 / 9;
					int i_28 = i_21 / 9;
					--i_16;
					anIntArray7696[i_16] = i_25 << 24 | i_26 << 16 | i_27 << 8 | i_28;
					i_23 += ints_5[i_19] - ints_5[i_18];
					i_22 += ints_6[i_19] - ints_6[i_18];
					i_21 += ints_8[i_19] - ints_8[i_18];
					i_20 += ints_7[i_19] - ints_7[i_18];
					if (i_19 == 0) {
						i_19 = i_9;
					}

					if (i_18 == 0) {
						i_18 = i_9;
					}
				}

				for (i_24 = i_11; i_24 >= 0; --i_24) {
					--i_14;
					i_25 = this.anIntArray7694[i_14];
					--i_15;
					i_26 = this.anIntArray7694[i_15];
					ints_5[i_24] += (i_25 >> 24 & 0xff) - (i_26 >> 24 & 0xff);
					ints_6[i_24] += (i_25 >> 16 & 0xff) - (i_26 >> 16 & 0xff);
					ints_7[i_24] += (i_25 >> 8 & 0xff) - (i_26 >> 8 & 0xff);
					ints_8[i_24] += (i_25 & 0xff) - (i_26 & 0xff);
				}

				if (i_14 == 0) {
					i_14 = i_13;
				}

				if (i_15 == 0) {
					i_15 = i_13;
				}
			}

			int[] ints_29 = this.anIntArray7694;
			this.anIntArray7694 = anIntArray7696;
			anIntArray7696 = ints_29;
		}

	}

	int[] method12406() {
		return this.anIntArray7694;
	}

}
