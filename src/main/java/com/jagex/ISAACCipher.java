package com.jagex;

public class ISAACCipher {

	static int anInt5157;

	private int count;
	private int c;
	private int b;
	private int a;

	private int[] memory = new int[256];
	private int[] results = new int[256];

	public ISAACCipher(int[] seeds) {
		System.arraycopy(seeds, 0, results, 0, seeds.length);
		init();
	}

	void init() {
		int i_2 = -1640531527;
		int i_3 = -1640531527;
		int i_4 = -1640531527;
		int i_5 = -1640531527;
		int i_6 = -1640531527;
		int i_7 = -1640531527;
		int i_8 = -1640531527;
		int i_9 = -1640531527;
		int i_10;
		for (i_10 = 0; i_10 < 4; i_10++) {
			i_9 ^= i_8 << 11;
			i_6 += i_9;
			i_8 += i_7;
			i_8 ^= i_7 >>> 2;
			i_5 += i_8;
			i_7 += i_6;
			i_7 ^= i_6 << 8;
			i_4 += i_7;
			i_6 += i_5;
			i_6 ^= i_5 >>> 16;
			i_3 += i_6;
			i_5 += i_4;
			i_5 ^= i_4 << 10;
			i_2 += i_5;
			i_4 += i_3;
			i_4 ^= i_3 >>> 4;
			i_9 += i_4;
			i_3 += i_2;
			i_3 ^= i_2 << 8;
			i_8 += i_3;
			i_2 += i_9;
			i_2 ^= i_9 >>> 9;
			i_7 += i_2;
			i_9 += i_8;
		}
		for (i_10 = 0; i_10 < 256; i_10 += 8) {
			i_9 += results[i_10];
			i_8 += results[i_10 + 1];
			i_7 += results[i_10 + 2];
			i_6 += results[i_10 + 3];
			i_5 += results[i_10 + 4];
			i_4 += results[i_10 + 5];
			i_3 += results[i_10 + 6];
			i_2 += results[i_10 + 7];
			i_9 ^= i_8 << 11;
			i_6 += i_9;
			i_8 += i_7;
			i_8 ^= i_7 >>> 2;
			i_5 += i_8;
			i_7 += i_6;
			i_7 ^= i_6 << 8;
			i_4 += i_7;
			i_6 += i_5;
			i_6 ^= i_5 >>> 16;
			i_3 += i_6;
			i_5 += i_4;
			i_5 ^= i_4 << 10;
			i_2 += i_5;
			i_4 += i_3;
			i_4 ^= i_3 >>> 4;
			i_9 += i_4;
			i_3 += i_2;
			i_3 ^= i_2 << 8;
			i_8 += i_3;
			i_2 += i_9;
			i_2 ^= i_9 >>> 9;
			i_7 += i_2;
			i_9 += i_8;
			memory[i_10] = i_9;
			memory[i_10 + 1] = i_8;
			memory[i_10 + 2] = i_7;
			memory[i_10 + 3] = i_6;
			memory[i_10 + 4] = i_5;
			memory[i_10 + 5] = i_4;
			memory[i_10 + 6] = i_3;
			memory[i_10 + 7] = i_2;
		}
		for (i_10 = 0; i_10 < 256; i_10 += 8) {
			i_9 += memory[i_10];
			i_8 += memory[i_10 + 1];
			i_7 += memory[i_10 + 2];
			i_6 += memory[i_10 + 3];
			i_5 += memory[i_10 + 4];
			i_4 += memory[i_10 + 5];
			i_3 += memory[i_10 + 6];
			i_2 += memory[i_10 + 7];
			i_9 ^= i_8 << 11;
			i_6 += i_9;
			i_8 += i_7;
			i_8 ^= i_7 >>> 2;
			i_5 += i_8;
			i_7 += i_6;
			i_7 ^= i_6 << 8;
			i_4 += i_7;
			i_6 += i_5;
			i_6 ^= i_5 >>> 16;
			i_3 += i_6;
			i_5 += i_4;
			i_5 ^= i_4 << 10;
			i_2 += i_5;
			i_4 += i_3;
			i_4 ^= i_3 >>> 4;
			i_9 += i_4;
			i_3 += i_2;
			i_3 ^= i_2 << 8;
			i_8 += i_3;
			i_2 += i_9;
			i_2 ^= i_9 >>> 9;
			i_7 += i_2;
			i_9 += i_8;
			memory[i_10] = i_9;
			memory[i_10 + 1] = i_8;
			memory[i_10 + 2] = i_7;
			memory[i_10 + 3] = i_6;
			memory[i_10 + 4] = i_5;
			memory[i_10 + 5] = i_4;
			memory[i_10 + 6] = i_3;
			memory[i_10 + 7] = i_2;
		}
		isaac();
		count = 256;
	}

	void isaac() {
		b += ++c;
		for (int i_2 = 0; i_2 < 256; i_2++) {
			int i_3 = memory[i_2];
			if ((i_2 & 0x2) == 0) {
				if ((i_2 & 0x1) == 0)
					a ^= a << 13;
				else
					a ^= a >>> 6;
			} else if ((i_2 & 0x1) == 0)
				a ^= a << 2;
			else
				a ^= a >>> 16;
			a += memory[128 + i_2 & 0xff];
			int i_4;
			memory[i_2] = i_4 = memory[(i_3 & 0x3fc) >> 2] + b + a;
			results[i_2] = b = memory[(i_4 >> 8 & 0x3fc) >> 2] + i_3;
		}
	}

	public int nextInt() {
		if (count == 0) {
			isaac();
			count = 256;
		}
		//return 0; //Disables ISAAC
		return (results[(count -= 1)]);
	}

	public int peek() {
		if (count == 0) {
			isaac();
			count = 256;
		}
		//return 0; //Disables ISAAC
		return (results[count - 1]);
	}
}
