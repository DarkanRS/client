public class Class370_Sub2 extends Class370 {

	byte[] aByteArray7759;
	int anInt7758;
	int anInt7760;
	int[] anIntArray7761;

	void method12517(int i_1, byte b_2) {
		this.aByteArray7759[this.anInt7758++] = (byte) (((b_2 & 0xff) >> 1) + 127);
	}

	void method6337(int i_1, int i_2) {
		this.anInt7760 += i_2 * this.anIntArray7761[i_1] >> 12;
	}

	void method6332() {
		this.anInt7758 = 0;
		this.anInt7760 = 0;
	}

	Class370_Sub2() {
		super(12, 16, 2);
		this.anIntArray7761 = new int[this.anInt4290];

		for (int i_7 = 0; i_7 < this.anInt4290; i_7++) {
			this.anIntArray7761[i_7] = (short) ((int) (Math.pow((double) (float) 0.45, (double) i_7) * 4096.0D));
		}

	}

	void method6327(int i_1, int i_2) {
		this.anInt7760 += i_2 * this.anIntArray7761[i_1] >> 12;
	}

	void method6330() {
		this.anInt7758 = 0;
		this.anInt7760 = 0;
	}

	void method6344() {
		this.anInt7760 = Math.abs(this.anInt7760);
		if (this.anInt7760 >= 4096) {
			this.anInt7760 = 4095;
		}

		this.method12517(this.anInt7758++, (byte) (this.anInt7760 >> 4));
		this.anInt7760 = 0;
	}

	void method6331() {
		this.anInt7758 = 0;
		this.anInt7760 = 0;
	}

	void method6333(int i_1, int i_2) {
		this.anInt7760 += i_2 * this.anIntArray7761[i_1] >> 12;
	}

	void method6334(int i_1, int i_2) {
		this.anInt7760 += i_2 * this.anIntArray7761[i_1] >> 12;
	}

	void method6321() {
		this.anInt7760 = Math.abs(this.anInt7760);
		if (this.anInt7760 >= 4096) {
			this.anInt7760 = 4095;
		}

		this.method12517(this.anInt7758++, (byte) (this.anInt7760 >> 4));
		this.anInt7760 = 0;
	}

	void method6345() {
		this.anInt7760 = Math.abs(this.anInt7760);
		if (this.anInt7760 >= 4096) {
			this.anInt7760 = 4095;
		}

		this.method12517(this.anInt7758++, (byte) (this.anInt7760 >> 4));
		this.anInt7760 = 0;
	}

	void method6340() {
		this.anInt7760 = Math.abs(this.anInt7760);
		if (this.anInt7760 >= 4096) {
			this.anInt7760 = 4095;
		}

		this.method12517(this.anInt7758++, (byte) (this.anInt7760 >> 4));
		this.anInt7760 = 0;
	}

}
