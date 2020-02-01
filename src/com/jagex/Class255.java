package com.jagex;
public class Class255 {

	int anInt3147;
	int anInt3148;
	int[] anIntArray3146;
	int[] anIntArray3149;
	float[][] aFloatArrayArray3150;
	int[] anIntArray3151;

	float[] method4382() {
		return this.aFloatArrayArray3150[this.method4384()];
	}

	Class255() {
		MIDIInstrument.method12264(24);
		this.anInt3147 = MIDIInstrument.method12264(16);
		this.anInt3148 = MIDIInstrument.method12264(24);
		this.anIntArray3146 = new int[this.anInt3148];
		boolean bool_1 = MIDIInstrument.method12263() != 0;
		int i_2;
		int i_3;
		int i_5;
		if (bool_1) {
			i_2 = 0;

			for (i_3 = MIDIInstrument.method12264(5) + 1; i_2 < this.anInt3148; i_3++) {
				int i_4 = MIDIInstrument.method12264(Class159.method2739(this.anInt3148 - i_2, 2063492992));

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.anIntArray3146[i_2++] = i_3;
				}
			}
		} else {
			boolean bool_14 = MIDIInstrument.method12263() != 0;

			for (i_3 = 0; i_3 < this.anInt3148; i_3++) {
				if (bool_14 && MIDIInstrument.method12263() == 0) {
					this.anIntArray3146[i_3] = 0;
				} else {
					this.anIntArray3146[i_3] = MIDIInstrument.method12264(5) + 1;
				}
			}
		}

		this.method4383();
		i_2 = MIDIInstrument.method12264(4);
		if (i_2 > 0) {
			float f_15 = MIDIInstrument.method12300(MIDIInstrument.method12264(32));
			float f_16 = MIDIInstrument.method12300(MIDIInstrument.method12264(32));
			i_5 = MIDIInstrument.method12264(4) + 1;
			boolean bool_6 = MIDIInstrument.method12263() != 0;
			int i_7;
			if (i_2 == 1) {
				i_7 = method4397(this.anInt3148, this.anInt3147);
			} else {
				i_7 = this.anInt3148 * this.anInt3147;
			}

			this.anIntArray3149 = new int[i_7];

			int i_8;
			for (i_8 = 0; i_8 < i_7; i_8++) {
				this.anIntArray3149[i_8] = MIDIInstrument.method12264(i_5);
			}

			this.aFloatArrayArray3150 = new float[this.anInt3148][this.anInt3147];
			float f_9;
			int i_10;
			int i_11;
			if (i_2 == 1) {
				for (i_8 = 0; i_8 < this.anInt3148; i_8++) {
					f_9 = 0.0F;
					i_10 = 1;

					for (i_11 = 0; i_11 < this.anInt3147; i_11++) {
						int i_12 = i_8 / i_10 % i_7;
						float f_13 = (float) this.anIntArray3149[i_12] * f_16 + f_15 + f_9;
						this.aFloatArrayArray3150[i_8][i_11] = f_13;
						if (bool_6) {
							f_9 = f_13;
						}

						i_10 *= i_7;
					}
				}
			} else {
				for (i_8 = 0; i_8 < this.anInt3148; i_8++) {
					f_9 = 0.0F;
					i_10 = i_8 * this.anInt3147;

					for (i_11 = 0; i_11 < this.anInt3147; i_11++) {
						float f_17 = (float) this.anIntArray3149[i_10] * f_16 + f_15 + f_9;
						this.aFloatArrayArray3150[i_8][i_11] = f_17;
						if (bool_6) {
							f_9 = f_17;
						}

						++i_10;
					}
				}
			}
		}

	}

	void method4383() {
		int[] ints_1 = new int[this.anInt3148];
		int[] ints_2 = new int[33];

		int i_3;
		int i_4;
		int i_5;
		int i_6;
		int i_7;
		int i_8;
		int i_9;
		for (i_3 = 0; i_3 < this.anInt3148; i_3++) {
			i_4 = this.anIntArray3146[i_3];
			if (i_4 != 0) {
				i_5 = 1 << 32 - i_4;
				i_6 = ints_2[i_4];
				ints_1[i_3] = i_6;
				if ((i_6 & i_5) != 0) {
					i_7 = ints_2[i_4 - 1];
				} else {
					i_7 = i_6 | i_5;

					for (i_8 = i_4 - 1; i_8 >= 1; --i_8) {
						i_9 = ints_2[i_8];
						if (i_9 != i_6) {
							break;
						}

						int i_12 = 1 << 32 - i_8;
						if ((i_9 & i_12) != 0) {
							ints_2[i_8] = ints_2[i_8 - 1];
							break;
						}

						ints_2[i_8] = i_9 | i_12;
					}
				}

				ints_2[i_4] = i_7;

				for (i_8 = i_4 + 1; i_8 <= 32; i_8++) {
					i_9 = ints_2[i_8];
					if (i_9 == i_6) {
						ints_2[i_8] = i_7;
					}
				}
			}
		}

		this.anIntArray3151 = new int[8];
		i_3 = 0;

		for (i_4 = 0; i_4 < this.anInt3148; i_4++) {
			i_5 = this.anIntArray3146[i_4];
			if (i_5 != 0) {
				i_6 = ints_1[i_4];
				i_7 = 0;

				for (i_8 = 0; i_8 < i_5; i_8++) {
					i_9 = Integer.MIN_VALUE >>> i_8;
					if ((i_6 & i_9) != 0) {
						if (this.anIntArray3151[i_7] == 0) {
							this.anIntArray3151[i_7] = i_3;
						}

						i_7 = this.anIntArray3151[i_7];
					} else {
						++i_7;
					}

					if (i_7 >= this.anIntArray3151.length) {
						int[] ints_10 = new int[this.anIntArray3151.length * 2];

						for (int i_11 = 0; i_11 < this.anIntArray3151.length; i_11++) {
							ints_10[i_11] = this.anIntArray3151[i_11];
						}

						this.anIntArray3151 = ints_10;
					}

					i_9 >>>= 1;
				}

				this.anIntArray3151[i_7] = ~i_4;
				if (i_7 >= i_3) {
					i_3 = i_7 + 1;
				}
			}
		}

	}

	int method4384() {
		int i_1;
		for (i_1 = 0; this.anIntArray3151[i_1] >= 0; i_1 = MIDIInstrument.method12263() != 0 ? this.anIntArray3151[i_1] : i_1 + 1) {
			;
		}

		return ~this.anIntArray3151[i_1];
	}

	static int method4397(int i_0, int i_1) {
		int i_2;
		for (i_2 = (int) Math.pow((double) i_0, 1.0D / (double) i_1) + 1; Class277.method4906(i_2, i_1) > i_0; --i_2) {
			;
		}

		return i_2;
	}

}
