public class Node_Sub20_Sub38 extends Node_Sub20 {

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -1471197134);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = Class316.anIntArray3668[i_1];

			for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
				ints_3[i_5] = this.method15428(Class316.anIntArray3672[i_5], i_4) % 4096;
			}
		}

		return ints_3;
	}

	int method15428(int i_1, int i_2) {
		int i_4 = i_2 * 57 + i_1;
		i_4 ^= i_4 << 1;
		return 4096 - ((i_4 * i_4 * 15731 + 789221) * i_4 + 1376312589 & 0x7fffffff) / 262144;
	}

	public Node_Sub20_Sub38() {
		super(0, true);
	}

	public static void method15430(int i_0) {
		if (Class388.method6693(1937106134)) {
			if (i_0 != Class9.anInt76) {
				Class9.aLong77 = -1L;
			}

			Class9.anInt76 = i_0;
			client.connectionContext.method3051((byte) -50);
			Class365.setGameState(14);
		}

	}

}
