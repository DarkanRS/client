public class Class282_Sub20_Sub30 extends Class282_Sub20 {

	int[] method12319(int i_1, int i_2) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -1856155747);
		if (this.aClass320_7667.aBool3722) {
			int[][] ints_4 = this.method12333(0, i_1, (byte) 3);
			int[] ints_5 = ints_4[0];
			int[] ints_6 = ints_4[1];
			int[] ints_7 = ints_4[2];
			for (int i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
				ints_3[i_8] = (ints_7[i_8] + ints_6[i_8] + ints_5[i_8]) / 3;
			}
		}
		return ints_3;
	}

	public Class282_Sub20_Sub30() {
		super(1, true);
	}
}
