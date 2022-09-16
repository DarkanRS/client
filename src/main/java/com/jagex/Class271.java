package com.jagex;

import java.io.File;
import java.util.Hashtable;

public class Class271 {

	static File aFile3327;

	static int anInt3330;

	static boolean aBool3328;

	static Hashtable<String, File> aHashtable3329 = new Hashtable<>(16);

	public static String method4824(byte[] bytes_0, int i_1, int i_2) {
		char[] arr_4 = new char[i_2];
		int i_5 = 0;
		int i_6 = i_1;
		int i_9;
		for (int i_7 = i_2 + i_1; i_6 < i_7; arr_4[i_5++] = (char) i_9) {
			int i_8 = bytes_0[i_6++] & 0xff;
			if (i_8 < 128) {
				if (i_8 == 0)
					i_9 = 65533;
				else
					i_9 = i_8;
			} else if (i_8 < 192)
				i_9 = 65533;
			else if (i_8 < 224) {
				if (i_6 < i_7 && (bytes_0[i_6] & 0xc0) == 128) {
					i_9 = (i_8 & 0x1f) << 6 | bytes_0[i_6++] & 0x3f;
					if (i_9 < 128)
						i_9 = 65533;
				} else
					i_9 = 65533;
			} else if (i_8 < 240) {
				if (i_6 + 1 < i_7 && (bytes_0[i_6] & 0xc0) == 128 && (bytes_0[i_6 + 1] & 0xc0) == 128) {
					i_9 = (i_8 & 0xf) << 12 | (bytes_0[i_6++] & 0x3f) << 6 | bytes_0[i_6++] & 0x3f;
					if (i_9 < 2048)
						i_9 = 65533;
				} else
					i_9 = 65533;
			} else if (i_8 < 248) {
				if (i_6 + 2 < i_7 && (bytes_0[i_6] & 0xc0) == 128 && (bytes_0[i_6 + 1] & 0xc0) == 128 && (bytes_0[i_6 + 2] & 0xc0) == 128) {
					i_9 = (i_8 & 0x7) << 18 | (bytes_0[i_6++] & 0x3f) << 12 | (bytes_0[i_6++] & 0x3f) << 6 | bytes_0[i_6++] & 0x3f;
					i_9 = 65533;
				} else
					i_9 = 65533;
			} else
				i_9 = 65533;
		}
		return new String(arr_4, 0, i_5);
	}

	static void method4827(Index index_0, int i_1, int i_2, int i_3, boolean bool_4) {
		Class109.method1859(index_0, i_1, i_2, i_3, bool_4);
	}

	Class271() throws Throwable {
		throw new Error();
	}

}
