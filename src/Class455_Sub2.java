public class Class455_Sub2 extends Class455 {

	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_8974;

	static Class455_Sub2 method14343(Class505_Sub1 class505_sub1_0, int i_1, int i_2, int[] ints_3, int[] ints_4) {
		byte[] bytes_5 = new byte[i_2 * i_1];

		for (int i_6 = 0; i_6 < i_2; i_6++) {
			int i_7 = ints_3[i_6] + i_6 * i_1;

			for (int i_8 = 0; i_8 < ints_4[i_6]; i_8++) {
				bytes_5[i_7++] = -1;
			}
		}

		return new Class455_Sub2(class505_sub1_0, i_1, i_2, bytes_5);
	}

	Class455_Sub2(Class505_Sub1 class505_sub1_1, int i_2, int i_3, byte[] bytes_4) {
		this.aClass137_Sub1_Sub1_8974 = Class137_Sub1_Sub1.method15540(class505_sub1_1, Class150.aClass150_1951, Class76.aClass76_751, i_2, i_3, false, bytes_4, Class150.aClass150_1951);
		this.aClass137_Sub1_Sub1_8974.method14445(false, false);
	}

}
