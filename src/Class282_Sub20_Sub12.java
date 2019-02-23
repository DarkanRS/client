public class Class282_Sub20_Sub12 extends Class282_Sub20 {

	static byte[] aByteArray9814;
	int anInt9810 = 4096;
	int anInt9813 = 3216;
	int anInt9807 = 3216;
	int[] anIntArray9808 = new int[3];

	static {
		int i_0 = 0;
		aByteArray9814 = new byte[32896];

		for (int i_1 = 0; i_1 < 256; i_1++) {
			for (int i_2 = 0; i_2 <= i_1; i_2++) {
				aByteArray9814[i_0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (i_2 * i_2 + i_1 * i_1 + 65535) / 65535.0F))));
			}
		}

	}

	int[] method12319(int i_1, int i_2) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -1267538320);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = this.anInt9810 * Class316.anInt3678 >> 12;
			int[] ints_5 = this.method12317(0, i_1 - 1 & Class316.anInt3673, 2074480693);
			int[] ints_6 = this.method12317(0, i_1, 1959940073);
			int[] ints_7 = this.method12317(0, i_1 + 1 & Class316.anInt3673, 2107834570);

			for (int i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
				int i_9 = (ints_7[i_8] - ints_5[i_8]) * i_4 >> 12;
				int i_10 = i_4 * (ints_6[i_8 - 1 & Class316.anInt3669] - ints_6[i_8 + 1 & Class316.anInt3669]) >> 12;
				int i_11 = i_10 >> 4;
				int i_12 = i_9 >> 4;
				if (i_11 < 0) {
					i_11 = -i_11;
				}

				if (i_11 > 255) {
					i_11 = 255;
				}

				if (i_12 < 0) {
					i_12 = -i_12;
				}

				if (i_12 > 255) {
					i_12 = 255;
				}

				int i_13 = aByteArray9814[i_11 + (i_12 * (i_12 + 1) >> 1)] & 0xff;
				int i_14 = i_10 * i_13 >> 8;
				int i_15 = i_9 * i_13 >> 8;
				int i_16 = i_13 * 4096 >> 8;
				i_14 = i_14 * this.anIntArray9808[0] >> 12;
				i_15 = this.anIntArray9808[1] * i_15 >> 12;
				i_16 = i_16 * this.anIntArray9808[2] >> 12;
				ints_3[i_8] = i_16 + i_15 + i_14;
			}
		}

		return ints_3;
	}

	void method12321(int i_1) {
		this.method15266((byte) 0);
	}

	void method15266(byte b_1) {
		double d_2 = Math.cos((double) ((float) this.anInt9807 / 4096.0F));
		this.anIntArray9808[0] = (int) (Math.sin((double) ((float) this.anInt9813 / 4096.0F)) * d_2 * 4096.0D);
		this.anIntArray9808[1] = (int) (Math.cos((double) ((float) this.anInt9813 / 4096.0F)) * d_2 * 4096.0D);
		this.anIntArray9808[2] = (int) (Math.sin((double) ((float) this.anInt9807 / 4096.0F)) * 4096.0D);
		int i_4 = this.anIntArray9808[0] * this.anIntArray9808[0] >> 12;
		int i_5 = this.anIntArray9808[1] * this.anIntArray9808[1] >> 12;
		int i_6 = this.anIntArray9808[2] * this.anIntArray9808[2] >> 12;
		int i_7 = (int) (Math.sqrt((double) (i_4 + i_5 + i_6 >> 12)) * 4096.0D);
		if (i_7 != 0) {
			this.anIntArray9808[0] = (this.anIntArray9808[0] << 12) / i_7;
			this.anIntArray9808[1] = (this.anIntArray9808[1] << 12) / i_7;
			this.anIntArray9808[2] = (this.anIntArray9808[2] << 12) / i_7;
		}

	}

	public Class282_Sub20_Sub12() {
		super(1, true);
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		switch (i_1) {
		case 0:
			this.anInt9810 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 1:
			this.anInt9813 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			this.anInt9807 = rsbytebuffer_2.readUnsignedShort();
		}

	}

}
