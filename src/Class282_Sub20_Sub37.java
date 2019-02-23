import java.util.Random;

public class Class282_Sub20_Sub37 extends Class282_Sub20 {

	int anInt9982 = 4;
	int anInt9994 = 8;
	int anInt9986 = 0;
	int anInt9987 = 1024;
	int anInt9984 = 1024;
	int anInt9989 = 409;
	int anInt9990 = 204;
	int anInt9991 = 81;
	int anInt9993;
	int anInt9988;
	int anInt9995;
	int[] anIntArray9996;
	int[][] anIntArrayArray9979;
	int[][] anIntArrayArray9992;

	int[] method12319(int i_1, int i_2) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -318596352);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = 0;

			int i_5;
			for (i_5 = Class316.anIntArray3668[i_1] + this.anInt9986; i_5 < 0; i_5 += 4096) {
				;
			}

			while (i_5 > 4096) {
				i_5 -= 4096;
			}

			while (i_4 < this.anInt9994 && i_5 >= this.anIntArray9996[i_4]) {
				++i_4;
			}

			int i_6 = i_4 - 1;
			boolean bool_7 = (i_4 & 0x1) == 0;
			int i_8 = this.anIntArray9996[i_4];
			int i_9 = this.anIntArray9996[i_4 - 1];
			if (i_5 > i_9 + this.anInt9993 && i_5 < i_8 - this.anInt9993) {
				for (int i_10 = 0; i_10 < Class316.anInt3670; i_10++) {
					int i_11 = 0;
					int i_12 = bool_7 ? this.anInt9987 : -this.anInt9987;

					int i_13;
					for (i_13 = Class316.anIntArray3672[i_10] + (i_12 * this.anInt9988 >> 12); i_13 < 0; i_13 += 4096) {
						;
					}

					while (i_13 > 4096) {
						i_13 -= 4096;
					}

					while (i_11 < this.anInt9982 && i_13 >= this.anIntArrayArray9979[i_6][i_11]) {
						++i_11;
					}

					int i_14 = i_11 - 1;
					int i_15 = this.anIntArrayArray9979[i_6][i_14];
					int i_16 = this.anIntArrayArray9979[i_6][i_11];
					if (i_13 > i_15 + this.anInt9993 && i_13 < i_16 - this.anInt9993) {
						ints_3[i_10] = this.anIntArrayArray9992[i_6][i_14];
					} else {
						ints_3[i_10] = 0;
					}
				}
			} else {
				Class503.method8365(ints_3, 0, Class316.anInt3670, 0);
			}
		}

		return ints_3;
	}

	public Class282_Sub20_Sub37() {
		super(0, true);
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		switch (i_1) {
		case 0:
			this.anInt9982 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			this.anInt9994 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 2:
			this.anInt9989 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 3:
			this.anInt9990 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 4:
			this.anInt9987 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 5:
			this.anInt9986 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 6:
			this.anInt9991 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 7:
			this.anInt9984 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	void method15422(int i_1) {
		Random random_2 = new Random((long) this.anInt9994);
		this.anInt9993 = this.anInt9991 / 2;
		this.anInt9988 = 4096 / this.anInt9982;
		this.anInt9995 = 4096 / this.anInt9994;
		int i_3 = this.anInt9988 / 2;
		int i_4 = this.anInt9995 / 2;
		this.anIntArray9996 = new int[this.anInt9994 + 1];
		this.anIntArrayArray9979 = new int[this.anInt9994][this.anInt9982 + 1];
		this.anIntArrayArray9992 = new int[this.anInt9994][this.anInt9982];
		this.anIntArray9996[0] = 0;

		for (int i_5 = 0; i_5 < this.anInt9994; i_5++) {
			int i_6;
			int i_7;
			if (i_5 > 0) {
				i_6 = this.anInt9995;
				i_7 = (Class476.method7931(random_2, 4096, -2075817064) - 2048) * this.anInt9990 >> 12;
				i_6 += i_7 * i_4 >> 12;
				this.anIntArray9996[i_5] = i_6 + this.anIntArray9996[i_5 - 1];
			}

			this.anIntArrayArray9979[i_5][0] = 0;

			for (i_6 = 0; i_6 < this.anInt9982; i_6++) {
				if (i_6 > 0) {
					i_7 = this.anInt9988;
					int i_8 = (Class476.method7931(random_2, 4096, -750360310) - 2048) * this.anInt9989 >> 12;
					i_7 += i_8 * i_3 >> 12;
					this.anIntArrayArray9979[i_5][i_6] = this.anIntArrayArray9979[i_5][i_6 - 1] + i_7;
				}

				this.anIntArrayArray9992[i_5][i_6] = this.anInt9984 > 0 ? 4096 - Class476.method7931(random_2, this.anInt9984, 1473657007) : 4096;
			}

			this.anIntArrayArray9979[i_5][this.anInt9982] = 4096;
		}

		this.anIntArray9996[this.anInt9994] = 4096;
	}

	void method12321(int i_1) {
		this.method15422(-333836282);
	}

}
