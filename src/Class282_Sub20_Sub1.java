public class Class282_Sub20_Sub1 extends Class282_Sub20 {

	int anInt9593 = 10;
	int anInt9594 = 2048;
	int anInt9595 = 0;
	int[] anIntArray9596;
	int[] anIntArray9592;

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -644245331);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = Class316.anIntArray3668[i_1];
			int i_6;
			if (this.anInt9595 != 0) {
				for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
					i_6 = 0;
					short s_7 = 0;
					int i_8 = Class316.anIntArray3672[i_5];
					switch (this.anInt9595) {
					case 1:
						i_6 = i_8;
						break;
					case 2:
						i_6 = (i_8 - (4096 - i_4) >> 1) + 2048;
						break;
					case 3:
						i_6 = (i_8 - i_4 >> 1) + 2048;
					}

					for (int i_9 = 0; i_9 < this.anInt9593; i_9++) {
						if (i_6 >= this.anIntArray9592[i_9] && i_6 < this.anIntArray9592[i_9 + 1]) {
							if (i_6 < this.anIntArray9596[i_9]) {
								s_7 = 4096;
							}
							break;
						}
					}

					ints_3[i_5] = s_7;
				}
			} else {
				short s_10 = 0;

				for (i_6 = 0; i_6 < this.anInt9593; i_6++) {
					if (i_4 >= this.anIntArray9592[i_6] && i_4 < this.anIntArray9592[i_6 + 1]) {
						if (i_4 < this.anIntArray9596[i_6]) {
							s_10 = 4096;
						}
						break;
					}
				}

				Class503.method8365(ints_3, 0, Class316.anInt3670, s_10);
			}
		}

		return ints_3;
	}

	public Class282_Sub20_Sub1() {
		super(0, true);
	}

	void method12321(int i_1) {
		this.method14842();
	}

	void method14842() {
		int i_2 = 0;
		this.anIntArray9596 = new int[this.anInt9593 + 1];
		this.anIntArray9592 = new int[this.anInt9593 + 1];
		int i_3 = 4096 / this.anInt9593;
		int i_4 = i_3 * this.anInt9594 >> 12;

		for (int i_5 = 0; i_5 < this.anInt9593; i_5++) {
			this.anIntArray9592[i_5] = i_2;
			this.anIntArray9596[i_5] = i_4 + i_2;
			i_2 += i_3;
		}

		this.anIntArray9592[this.anInt9593] = 4096;
		this.anIntArray9596[this.anInt9593] = this.anIntArray9596[0] + 4096;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			this.anInt9593 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			this.anInt9594 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			this.anInt9595 = rsbytebuffer_2.readUnsignedByte();
		}

	}

}
