import java.util.Arrays;
import java.util.Random;

public class Class248 {

	static int[] anIntArray3073 = new int[32768];
	static int[] anIntArray3074;
	static int[] anIntArray3072;
	static int[] anIntArray3071;
	static int[] anIntArray3077;
	static int[] anIntArray3078;
	static int[] anIntArray3058;
	static int[] anIntArray3080;
	Class342 aClass342_3066;
	Class342 aClass342_3056;
	Class342 aClass342_3070;
	Class342 aClass342_3062;
	Class342 aClass342_3059;
	Class342 aClass342_3060;
	Class342 aClass342_3061;
	Class342 aClass342_3079;
	int anInt3069 = 0;
	int anInt3067 = 100;
	int anInt3055 = 500;
	int anInt3076 = 0;
	Class270 aClass270_3068;
	Class342 aClass342_3057;
	int[] anIntArray3063 = new int[5];
	int[] anIntArray3064 = new int[5];
	int[] anIntArray3065 = new int[5];

	static {
		Random random_0 = new Random(0L);

		int i_1;
		for (i_1 = 0; i_1 < 32768; i_1++) {
			anIntArray3073[i_1] = (random_0.nextInt() & 0x2) - 1;
		}

		anIntArray3074 = new int[32768];

		for (i_1 = 0; i_1 < 32768; i_1++) {
			anIntArray3074[i_1] = (int) (Math.sin((double) i_1 / 5215.1903D) * 16384.0D);
		}

		anIntArray3072 = new int[220500];
		anIntArray3071 = new int[5];
		anIntArray3077 = new int[5];
		anIntArray3078 = new int[5];
		anIntArray3058 = new int[5];
		anIntArray3080 = new int[5];
	}

	final int[] method4253(int i_1, int i_2) {
		Arrays.fill(anIntArray3072, 0, i_1, 0);
		if (i_2 < 10) {
			return anIntArray3072;
		} else {
			double d_3 = (double) i_1 / ((double) i_2 + 0.0D);
			this.aClass342_3066.method6078();
			this.aClass342_3056.method6078();
			int i_5 = 0;
			int i_6 = 0;
			int i_7 = 0;
			if (this.aClass342_3070 != null) {
				this.aClass342_3070.method6078();
				this.aClass342_3062.method6078();
				i_5 = (int) ((double) (this.aClass342_3070.anInt3999 - this.aClass342_3070.anInt4000) * 32.768D / d_3);
				i_6 = (int) ((double) this.aClass342_3070.anInt4000 * 32.768D / d_3);
			}

			int i_8 = 0;
			int i_9 = 0;
			int i_10 = 0;
			if (this.aClass342_3059 != null) {
				this.aClass342_3059.method6078();
				this.aClass342_3060.method6078();
				i_8 = (int) ((double) (this.aClass342_3059.anInt3999 - this.aClass342_3059.anInt4000) * 32.768D / d_3);
				i_9 = (int) ((double) this.aClass342_3059.anInt4000 * 32.768D / d_3);
			}

			int i_11;
			for (i_11 = 0; i_11 < 5; i_11++) {
				if (this.anIntArray3063[i_11] != 0) {
					anIntArray3071[i_11] = 0;
					anIntArray3077[i_11] = (int) ((double) this.anIntArray3065[i_11] * d_3);
					anIntArray3078[i_11] = (this.anIntArray3063[i_11] << 14) / 100;
					anIntArray3058[i_11] = (int) ((double) (this.aClass342_3066.anInt3999 - this.aClass342_3066.anInt4000) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray3064[i_11]) / d_3);
					anIntArray3080[i_11] = (int) ((double) this.aClass342_3066.anInt4000 * 32.768D / d_3);
				}
			}

			int i_12;
			int i_13;
			int i_14;
			int i_15;
			for (i_11 = 0; i_11 < i_1; i_11++) {
				i_12 = this.aClass342_3066.method6087(i_1);
				i_13 = this.aClass342_3056.method6087(i_1);
				if (this.aClass342_3070 != null) {
					i_14 = this.aClass342_3070.method6087(i_1);
					i_15 = this.aClass342_3062.method6087(i_1);
					i_12 += this.method4254(i_7, i_15, this.aClass342_3070.anInt4002) >> 1;
					i_7 = i_7 + i_6 + (i_14 * i_5 >> 16);
				}

				if (this.aClass342_3059 != null) {
					i_14 = this.aClass342_3059.method6087(i_1);
					i_15 = this.aClass342_3060.method6087(i_1);
					i_13 = i_13 * ((this.method4254(i_10, i_15, this.aClass342_3059.anInt4002) >> 1) + 32768) >> 15;
					i_10 = i_10 + i_9 + (i_14 * i_8 >> 16);
				}

				for (i_14 = 0; i_14 < 5; i_14++) {
					if (this.anIntArray3063[i_14] != 0) {
						i_15 = anIntArray3077[i_14] + i_11;
						if (i_15 < i_1) {
							anIntArray3072[i_15] += this.method4254(anIntArray3071[i_14], i_13 * anIntArray3078[i_14] >> 15, this.aClass342_3066.anInt4002);
							anIntArray3071[i_14] += (i_12 * anIntArray3058[i_14] >> 16) + anIntArray3080[i_14];
						}
					}
				}
			}

			int i_16;
			int i_17;
			if (this.aClass342_3061 != null) {
				this.aClass342_3061.method6078();
				this.aClass342_3079.method6078();
				i_11 = 0;
				boolean bool_18 = false;
				boolean bool_19 = true;

				for (i_14 = 0; i_14 < i_1; i_14++) {
					i_15 = this.aClass342_3061.method6087(i_1);
					i_16 = this.aClass342_3079.method6087(i_1);
					if (bool_19) {
						i_17 = (i_15 * (this.aClass342_3061.anInt3999 - this.aClass342_3061.anInt4000) >> 8) + this.aClass342_3061.anInt4000;
					} else {
						i_17 = (i_16 * (this.aClass342_3061.anInt3999 - this.aClass342_3061.anInt4000) >> 8) + this.aClass342_3061.anInt4000;
					}

					i_11 += 256;
					if (i_11 >= i_17) {
						i_11 = 0;
						bool_19 = !bool_19;
					}

					if (bool_19) {
						anIntArray3072[i_14] = 0;
					}
				}
			}

			if (this.anInt3069 > 0 && this.anInt3067 > 0) {
				i_11 = (int) ((double) this.anInt3069 * d_3);

				for (i_12 = i_11; i_12 < i_1; i_12++) {
					anIntArray3072[i_12] += anIntArray3072[i_12 - i_11] * this.anInt3067 / 100;
				}
			}

			if (this.aClass270_3068.anIntArray3318[0] > 0 || this.aClass270_3068.anIntArray3318[1] > 0) {
				this.aClass342_3057.method6078();
				i_11 = this.aClass342_3057.method6087(i_1 + 1);
				i_12 = this.aClass270_3068.method4812(0, (float) i_11 / 65536.0F);
				i_13 = this.aClass270_3068.method4812(1, (float) i_11 / 65536.0F);
				if (i_1 >= i_12 + i_13) {
					i_14 = 0;
					i_15 = i_13;
					if (i_13 > i_1 - i_12) {
						i_15 = i_1 - i_12;
					}

					while (i_14 < i_15) {
						i_16 = (int) ((long) anIntArray3072[i_14 + i_12] * (long) Class270.anInt3315 >> 16);

						for (i_17 = 0; i_17 < i_12; i_17++) {
							i_16 += (int) ((long) anIntArray3072[i_14 + i_12 - 1 - i_17] * (long) Class270.anIntArrayArray3321[0][i_17] >> 16);
						}

						for (i_17 = 0; i_17 < i_14; i_17++) {
							i_16 -= (int) ((long) anIntArray3072[i_14 - 1 - i_17] * (long) Class270.anIntArrayArray3321[1][i_17] >> 16);
						}

						anIntArray3072[i_14] = i_16;
						i_11 = this.aClass342_3057.method6087(i_1 + 1);
						++i_14;
					}

					i_15 = 128;

					while (true) {
						if (i_15 > i_1 - i_12) {
							i_15 = i_1 - i_12;
						}

						while (i_14 < i_15) {
							i_16 = (int) ((long) anIntArray3072[i_14 + i_12] * (long) Class270.anInt3315 >> 16);

							for (i_17 = 0; i_17 < i_12; i_17++) {
								i_16 += (int) ((long) anIntArray3072[i_14 + i_12 - 1 - i_17] * (long) Class270.anIntArrayArray3321[0][i_17] >> 16);
							}

							for (i_17 = 0; i_17 < i_13; i_17++) {
								i_16 -= (int) ((long) anIntArray3072[i_14 - 1 - i_17] * (long) Class270.anIntArrayArray3321[1][i_17] >> 16);
							}

							anIntArray3072[i_14] = i_16;
							i_11 = this.aClass342_3057.method6087(i_1 + 1);
							++i_14;
						}

						if (i_14 >= i_1 - i_12) {
							while (i_14 < i_1) {
								i_16 = 0;

								for (i_17 = i_14 + i_12 - i_1; i_17 < i_12; i_17++) {
									i_16 += (int) ((long) anIntArray3072[i_14 + i_12 - 1 - i_17] * (long) Class270.anIntArrayArray3321[0][i_17] >> 16);
								}

								for (i_17 = 0; i_17 < i_13; i_17++) {
									i_16 -= (int) ((long) anIntArray3072[i_14 - 1 - i_17] * (long) Class270.anIntArrayArray3321[1][i_17] >> 16);
								}

								anIntArray3072[i_14] = i_16;
								this.aClass342_3057.method6087(i_1 + 1);
								++i_14;
							}
							break;
						}

						i_12 = this.aClass270_3068.method4812(0, (float) i_11 / 65536.0F);
						i_13 = this.aClass270_3068.method4812(1, (float) i_11 / 65536.0F);
						i_15 += 128;
					}
				}
			}

			for (i_11 = 0; i_11 < i_1; i_11++) {
				if (anIntArray3072[i_11] < -32768) {
					anIntArray3072[i_11] = -32768;
				}

				if (anIntArray3072[i_11] > 32767) {
					anIntArray3072[i_11] = 32767;
				}
			}

			return anIntArray3072;
		}
	}

	final int method4254(int i_1, int i_2, int i_3) {
		return i_3 == 1 ? ((i_1 & 0x7fff) < 16384 ? i_2 : -i_2) : (i_3 == 2 ? anIntArray3074[i_1 & 0x7fff] * i_2 >> 14 : (i_3 == 3 ? (i_2 * (i_1 & 0x7fff) >> 14) - i_2 : (i_3 == 4 ? i_2 * anIntArray3073[i_1 / 2607 & 0x7fff] : 0)));
	}

	final void method4255(RsByteBuffer rsbytebuffer_1) {
		this.aClass342_3066 = new Class342();
		this.aClass342_3066.method6076(rsbytebuffer_1);
		this.aClass342_3056 = new Class342();
		this.aClass342_3056.method6076(rsbytebuffer_1);
		int i_2 = rsbytebuffer_1.readUnsignedByte();
		if (i_2 != 0) {
			--rsbytebuffer_1.index;
			this.aClass342_3070 = new Class342();
			this.aClass342_3070.method6076(rsbytebuffer_1);
			this.aClass342_3062 = new Class342();
			this.aClass342_3062.method6076(rsbytebuffer_1);
		}

		i_2 = rsbytebuffer_1.readUnsignedByte();
		if (i_2 != 0) {
			--rsbytebuffer_1.index;
			this.aClass342_3059 = new Class342();
			this.aClass342_3059.method6076(rsbytebuffer_1);
			this.aClass342_3060 = new Class342();
			this.aClass342_3060.method6076(rsbytebuffer_1);
		}

		i_2 = rsbytebuffer_1.readUnsignedByte();
		if (i_2 != 0) {
			--rsbytebuffer_1.index;
			this.aClass342_3061 = new Class342();
			this.aClass342_3061.method6076(rsbytebuffer_1);
			this.aClass342_3079 = new Class342();
			this.aClass342_3079.method6076(rsbytebuffer_1);
		}

		for (int i_3 = 0; i_3 < 10; i_3++) {
			int i_4 = rsbytebuffer_1.readUnsignedSmart();
			if (i_4 == 0) {
				break;
			}

			this.anIntArray3063[i_3] = i_4;
			this.anIntArray3064[i_3] = rsbytebuffer_1.readSmart();
			this.anIntArray3065[i_3] = rsbytebuffer_1.readUnsignedSmart();
		}

		this.anInt3069 = rsbytebuffer_1.readUnsignedSmart();
		this.anInt3067 = rsbytebuffer_1.readUnsignedSmart();
		this.anInt3055 = rsbytebuffer_1.readUnsignedShort();
		this.anInt3076 = rsbytebuffer_1.readUnsignedShort();
		this.aClass270_3068 = new Class270();
		this.aClass342_3057 = new Class342();
		this.aClass270_3068.method4807(rsbytebuffer_1, this.aClass342_3057);
	}

}
