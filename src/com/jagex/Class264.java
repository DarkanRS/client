package com.jagex;
public class Class264 {

	static void method4781(int i_0, Class261 class261_5, float f_6, float f_7, float f_8, float f_9, byte[] bytes_11, int i_12) {
		int i_13 = 128 * 128;
		float[] floats_14 = new float[i_13];

		int i_15;
		int i_16;
		for (i_15 = 0; i_15 < 8; i_15++) {
			i_16 = i_12;
			class261_5.method4634(i_0, 128, 128, 16, f_6 / (float) 128, f_7 / (float) 128, f_8 / (float) 16, f_9 * 127.0F, floats_14);

			for (int i_17 = 0; i_17 < i_13; i_17++) {
				bytes_11[i_16] = (byte) ((int) ((float) bytes_11[i_16] + floats_14[i_17]));
				++i_16;
			}

			f_6 *= 2.0F;
			f_7 *= 2.0F;
			f_8 *= 2.0F;
			f_9 *= (float) 0.6;
		}

		i_15 = i_12;

		for (i_16 = 0; i_16 < i_13; i_16++) {
			bytes_11[i_15] = (byte) (bytes_11[i_15] + 127);
			++i_15;
		}

	}

	public static byte[] method4782(Class261 class261_4) {
		byte[] bytes_10 = new byte[128 * 16 * 128];
		method4783(class261_4, bytes_10, 0);
		return bytes_10;
	}

	static void method4783(Class261 class261_4, byte[] bytes_10, int i_11) {
		for (int i_12 = 0; i_12 < 16; i_12++) {
			method4781(i_12, class261_4, (float) 4.0, (float) 4.0, (float) 16.0, (float) 0.5, bytes_10, i_11);
			i_11 += 128 * 128;
		}

	}

	Class264() throws Throwable {
		throw new Error();
	}

}
