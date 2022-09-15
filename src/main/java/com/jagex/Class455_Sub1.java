package com.jagex;

public class Class455_Sub1 extends Class455 {

	static Class455_Sub1 method13769(HardwareRenderer class505_sub2_0, int i_1, int i_2, int[] ints_3, int[] ints_4) {
		int i_6;
		int i_7;
		int i_8;
		if (class505_sub2_0.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
			byte[] bytes_9 = new byte[i_2 * i_1];

			for (i_6 = 0; i_6 < i_2; i_6++) {
				i_7 = ints_3[i_6] + i_6 * i_1;

				for (i_8 = 0; i_8 < ints_4[i_6]; i_8++)
					bytes_9[i_7++] = -1;
			}

			return new Class455_Sub1(class505_sub2_0, i_1, i_2, bytes_9);
		}
		int[] ints_5 = new int[i_2 * i_1];

		for (i_6 = 0; i_6 < i_2; i_6++) {
			i_7 = ints_3[i_6] + i_6 * i_1;

			for (i_8 = 0; i_8 < ints_4[i_6]; i_8++)
				ints_5[i_7++] = -16777216;
		}

		return new Class455_Sub1(class505_sub2_0, i_1, i_2, ints_5);
	}

	Interface6 anInterface6_8508;

	Class455_Sub1(HardwareRenderer class505_sub2_1, int i_2, int i_3, byte[] bytes_4) {
		anInterface6_8508 = class505_sub2_1.method13957(Class150.aClass150_1951, i_2, i_3, false, bytes_4);
		anInterface6_8508.method50(false, false);
	}

	Class455_Sub1(HardwareRenderer class505_sub2_1, int i_2, int i_3, int[] ints_4) {
		anInterface6_8508 = class505_sub2_1.method14024(i_2, i_3, false, ints_4);
		anInterface6_8508.method50(false, false);
	}

}
