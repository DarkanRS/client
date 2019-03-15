public class Class81 {

	static int NUM_CHAT_LINES;

	static Class152 aClass152_802;

	static int anInt803;

	static ChatLine[] CHAT_LINES = new ChatLine[100];

	static int anInt801 = 0;

	Class81() throws Throwable {
		throw new Error();
	}

	static final boolean method1453(int[][] ints_0, int[][] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		for (int i_8 = i_3; i_8 <= i_5; i_8++) {
			for (int i_9 = i_4; i_9 <= i_6; i_9++) {
				if (i_2 == ints_0[i_8][i_9] && ints_1[i_8][i_9] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
