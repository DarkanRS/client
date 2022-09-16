package com.jagex;

public class Class19 {

	public int turnDirection;

	int anInt154;

	public boolean method576(int i_1, int i_2, int i_3) {
		int i_5 = anInt154;
		if (turnDirection == i_1 && anInt154 == 0)
			return false;
		boolean bool_6;
		int i_7;
		if (anInt154 != 0) {
			int i_8;
			if (anInt154 > 0 && i_1 > turnDirection) {
				i_7 = anInt154 * anInt154 / (i_2 * 2);
				i_8 = i_7 + turnDirection;
				bool_6 = i_8 < i_1 && i_8 >= turnDirection;
			} else if (anInt154 < 0 && i_1 < turnDirection) {
				i_7 = anInt154 * anInt154 / (i_2 * 2);
				i_8 = turnDirection - i_7;
				bool_6 = i_8 > i_1 && i_8 <= turnDirection;
			} else
				bool_6 = false;
		} else {
			if (i_1 > turnDirection && i_1 <= i_2 + turnDirection || i_1 < turnDirection && i_1 >= turnDirection - i_2) {
				turnDirection = i_1;
				return false;
			}
			bool_6 = true;
		}
		if (bool_6) {
			if (i_1 > turnDirection) {
				anInt154 += i_2;
				if (i_3 != 0 && anInt154 > i_3)
					anInt154 = i_3;
			} else {
				anInt154 -= i_2;
				if (i_3 != 0 && anInt154 < -i_3)
					anInt154 = -i_3;
			}
			if (i_5 != anInt154) {
				i_7 = anInt154 * anInt154 / (i_2 * 2);
				if (i_1 > turnDirection) {
					if (i_7 + turnDirection > i_1)
						anInt154 = i_5;
				} else if (i_1 < turnDirection && turnDirection - i_7 < i_1)
					anInt154 = i_5;
			}
		} else if (anInt154 > 0) {
			anInt154 -= i_2;
			if (anInt154 < 0)
				anInt154 = 0;
		} else {
			anInt154 += i_2;
			if (anInt154 > 0)
				anInt154 = 0;
		}
		turnDirection += i_5 + anInt154 >> 1;
				return bool_6;
	}

	public void method577(int i_1) {
		turnDirection = i_1;
		anInt154 = 0;
	}

	public int method578() {
		return turnDirection & 0x3fff;
	}

	public void method579() {
		turnDirection &= 0x3fff;
	}
}
