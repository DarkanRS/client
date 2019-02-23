public class Class265 {

	int anInt3285 = Class282_Sub18.method12264(16);
	int anInt3283 = Class282_Sub18.method12264(24);
	int anInt3281 = Class282_Sub18.method12264(24);
	int anInt3282 = Class282_Sub18.method12264(24) + 1;
	int anInt3284 = Class282_Sub18.method12264(6) + 1;
	int anInt3286 = Class282_Sub18.method12264(8);
	int[] anIntArray3287;

	void method4790(float[] floats_1, int i_2, boolean bool_3) {
		int i_4;
		for (i_4 = 0; i_4 < i_2; i_4++) {
			floats_1[i_4] = 0.0F;
		}

		if (!bool_3) {
			i_4 = Class282_Sub18.aClass255Array7615[this.anInt3286].anInt3147;
			int i_5 = this.anInt3281 - this.anInt3283;
			int i_6 = i_5 / this.anInt3282;
			int[] ints_7 = new int[i_6];

			for (int i_8 = 0; i_8 < 8; i_8++) {
				int i_9 = 0;

				while (i_9 < i_6) {
					int i_10;
					int i_11;
					if (i_8 == 0) {
						i_10 = Class282_Sub18.aClass255Array7615[this.anInt3286].method4384();

						for (i_11 = i_4 - 1; i_11 >= 0; --i_11) {
							if (i_9 + i_11 < i_6) {
								ints_7[i_9 + i_11] = i_10 % this.anInt3284;
							}

							i_10 /= this.anInt3284;
						}
					}

					for (i_10 = 0; i_10 < i_4; i_10++) {
						i_11 = ints_7[i_9];
						int i_12 = this.anIntArray3287[i_8 + i_11 * 8];
						if (i_12 >= 0) {
							int i_13 = i_9 * this.anInt3282 + this.anInt3283;
							Class255 class255_14 = Class282_Sub18.aClass255Array7615[i_12];
							int i_15;
							if (this.anInt3285 == 0) {
								i_15 = this.anInt3282 / class255_14.anInt3147;

								for (int i_16 = 0; i_16 < i_15; i_16++) {
									float[] floats_20 = class255_14.method4382();

									for (int i_18 = 0; i_18 < class255_14.anInt3147; i_18++) {
										floats_1[i_13 + i_16 + i_18 * i_15] += floats_20[i_18];
									}
								}
							} else {
								i_15 = 0;

								while (i_15 < this.anInt3282) {
									float[] floats_19 = class255_14.method4382();

									for (int i_17 = 0; i_17 < class255_14.anInt3147; i_17++) {
										floats_1[i_13 + i_15] += floats_19[i_17];
										++i_15;
									}
								}
							}
						}

						++i_9;
						if (i_9 >= i_6) {
							break;
						}
					}
				}
			}
		}

	}

	Class265() {
		int[] ints_1 = new int[this.anInt3284];

		int i_2;
		for (i_2 = 0; i_2 < this.anInt3284; i_2++) {
			int i_3 = 0;
			int i_4 = Class282_Sub18.method12264(3);
			boolean bool_5 = Class282_Sub18.method12263() != 0;
			if (bool_5) {
				i_3 = Class282_Sub18.method12264(5);
			}

			ints_1[i_2] = i_3 << 3 | i_4;
		}

		this.anIntArray3287 = new int[this.anInt3284 * 8];

		for (i_2 = 0; i_2 < this.anInt3284 * 8; i_2++) {
			this.anIntArray3287[i_2] = (ints_1[i_2 >> 3] & 1 << (i_2 & 0x7)) != 0 ? Class282_Sub18.method12264(8) : -1;
		}

	}

}
