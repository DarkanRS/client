package com.jagex;

public class CircularBuffer {

	static int[] anIntArray5773;
	static int anInt5768;
	static int anInt5769;
	static int anInt5772;
	static byte[][] aByteArrayArray5767 = new byte[1000][];
	static byte[][] aByteArrayArray5771 = new byte[250][];
	static byte[][] aByteArrayArray5770 = new byte[50][];

	public static synchronized byte[] createBuffer(int size) {
		byte[] bytes_2;
		if (size == 100 && anInt5768 > 0) {
			bytes_2 = aByteArrayArray5767[--anInt5768];
			aByteArrayArray5767[anInt5768] = null;
			return bytes_2;
		}
		if (size == 5000 && anInt5769 > 0) {
			bytes_2 = aByteArrayArray5771[--anInt5769];
			aByteArrayArray5771[anInt5769] = null;
			return bytes_2;
		} else if (size == 30000 && anInt5772 > 0) {
			bytes_2 = aByteArrayArray5770[--anInt5772];
			aByteArrayArray5770[anInt5772] = null;
			return bytes_2;
		} else {
			if (IcmpService_Sub1.aByteArrayArrayArray7963 != null)
				for (int i_4 = 0; i_4 < anIntArray5773.length; i_4++)
					if (anIntArray5773[i_4] == size && Class412.anIntArray4962[i_4] > 0) {
						byte[] bytes_3 = IcmpService_Sub1.aByteArrayArrayArray7963[i_4][--Class412.anIntArray4962[i_4]];
						IcmpService_Sub1.aByteArrayArrayArray7963[i_4][Class412.anIntArray4962[i_4]] = null;
						return bytes_3;
					}

			return new byte[size];
		}
	}

	public static byte[][][] method8246(int i_0) {
		byte[][][] bytes_2 = new byte[8][4][];
		int i_3 = i_0;
		int i_4 = i_0;
		byte[] bytes_5 = new byte[i_0 * i_0];
		int i_6 = 0;

		int i_7;
		int i_8;
		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 <= i_7)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[0][0] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = 0; i_8 < i_4; i_8++) {
				if (i_8 <= i_7)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[0][1] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 >= i_7)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[0][2] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 >= i_7)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[0][3] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 <= i_7 >> 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[1][0] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_6 >= 0 && i_6 < bytes_5.length)
					if (i_8 >= i_7 << 1)
						bytes_5[i_6] = -1;
				++i_6;
			}

		bytes_2[1][1] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 <= i_7 >> 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[1][2] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 >= i_7 << 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[1][3] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 <= i_7 >> 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[2][0] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 >= i_7 << 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[2][1] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 <= i_7 >> 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[2][2] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 >= i_7 << 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[2][3] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 >= i_7 >> 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[3][0] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 <= i_7 << 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[3][1] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 >= i_7 >> 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[3][2] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 <= i_7 << 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[3][3] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 >= i_7 >> 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[4][0] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 <= i_7 << 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[4][1] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 >= i_7 >> 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[4][2] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 <= i_7 << 1)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[4][3] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 <= i_3 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[5][0] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_7 <= i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[5][1] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 >= i_3 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[5][2] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_7 >= i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[5][3] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 <= i_7 - i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[6][0] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 <= i_7 - i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[6][1] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 <= i_7 - i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[6][2] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 <= i_7 - i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[6][3] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 >= i_7 - i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[7][0] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = 0; i_8 < i_3; i_8++) {
				if (i_8 >= i_7 - i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[7][1] = bytes_5;
		bytes_5 = new byte[i_4 * i_3];
		i_6 = 0;

		for (i_7 = i_4 - 1; i_7 >= 0; --i_7)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 >= i_7 - i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[7][2] = bytes_5;
		bytes_5 = new byte[i_3 * i_4];
		i_6 = 0;

		for (i_7 = 0; i_7 < i_4; i_7++)
			for (i_8 = i_3 - 1; i_8 >= 0; --i_8) {
				if (i_8 >= i_7 - i_4 / 2)
					bytes_5[i_6] = -1;

				++i_6;
			}

		bytes_2[7][3] = bytes_5;
		return bytes_2;
	}

	CircularBuffer() throws Throwable {
		throw new Error();
	}

}
