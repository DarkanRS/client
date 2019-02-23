public class Class264 {

	static void method4781(int i_0, int i_1, int i_2, int i_3, int i_4, Class261 class261_5, float f_6, float f_7, float f_8, float f_9, float f_10, byte[] bytes_11, int i_12) {
		int i_13 = i_2 * i_1;
		float[] floats_14 = new float[i_13];

		int i_15;
		int i_16;
		for (i_15 = 0; i_15 < i_4; i_15++) {
			i_16 = i_12;
			class261_5.method4634(i_0, i_1, i_2, i_3, f_6 / (float) i_1, f_7 / (float) i_2, f_8 / (float) i_3, f_9 * 127.0F, floats_14, 0);

			for (int i_17 = 0; i_17 < i_13; i_17++) {
				bytes_11[i_16] = (byte) ((int) ((float) bytes_11[i_16] + floats_14[i_17]));
				++i_16;
			}

			f_6 *= 2.0F;
			f_7 *= 2.0F;
			f_8 *= 2.0F;
			f_9 *= f_10;
		}

		i_15 = i_12;

		for (i_16 = 0; i_16 < i_13; i_16++) {
			bytes_11[i_15] = (byte) (bytes_11[i_15] + 127);
			++i_15;
		}

	}

	public static byte[] method4782(int i_0, int i_1, int i_2, int i_3, Class261 class261_4, float f_5, float f_6, float f_7, float f_8, float f_9) {
		byte[] bytes_10 = new byte[i_0 * i_2 * i_1];
		method4783(i_0, i_1, i_2, i_3, class261_4, f_5, f_6, f_7, f_8, f_9, bytes_10, 0);
		return bytes_10;
	}

	static void method4783(int i_0, int i_1, int i_2, int i_3, Class261 class261_4, float f_5, float f_6, float f_7, float f_8, float f_9, byte[] bytes_10, int i_11) {
		for (int i_12 = 0; i_12 < i_2; i_12++) {
			method4781(i_12, i_0, i_1, i_2, i_3, class261_4, f_5, f_6, f_7, f_8, f_9, bytes_10, i_11);
			i_11 += i_0 * i_1;
		}

	}

	Class264() throws Throwable {
		throw new Error();
	}

}
