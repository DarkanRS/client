package com.rs.jagex;

public class Class200 {

	int anInt2534;
	int anInt2532;
	int anInt2533;
	int anInt2540;
	int anInt2535;
	int anInt2536;
	int anInt2537;
	int anInt2538;
	int anInt2539;
	int anInt2531;

	Class200(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
		anInt2534 = i_1;
		anInt2532 = i_2;
		anInt2533 = i_3;
		anInt2540 = i_4 * i_4;
		anInt2535 = i_5 + anInt2534;
		anInt2536 = anInt2534 + i_6;
		anInt2537 = i_7 + anInt2532;
		anInt2538 = i_8 + anInt2532;
		anInt2539 = i_9 + anInt2533;
		anInt2531 = i_10 + anInt2533;
	}

	void method3253(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
		anInt2534 = i_1;
		anInt2532 = i_2;
		anInt2533 = i_3;
		anInt2540 = i_4 * i_4;
		anInt2535 = i_5 + anInt2534;
		anInt2536 = anInt2534 + i_6;
		anInt2537 = i_7 + anInt2532;
		anInt2538 = i_8 + anInt2532;
		anInt2539 = i_9 + anInt2533;
		anInt2531 = i_10 + anInt2533;
	}

	public boolean method3255(int i_1, int i_2, int i_3) {
		if ((i_1 < anInt2535) || (i_1 > anInt2536))
			return false;
		if ((i_2 >= anInt2537 && i_2 <= anInt2538) && (i_3 >= anInt2539 && i_3 <= anInt2531)) {
			int i_4 = i_1 - anInt2534;
			int i_5 = i_3 - anInt2533;
			return i_4 * i_4 + i_5 * i_5 < anInt2540;
		} else
			return false;
	}

}
