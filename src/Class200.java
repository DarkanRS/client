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

	void method3253(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
		this.anInt2534 = i_1;
		this.anInt2532 = i_2;
		this.anInt2533 = i_3;
		this.anInt2540 = i_4 * i_4;
		this.anInt2535 = i_5 + this.anInt2534;
		this.anInt2536 = this.anInt2534 + i_6;
		this.anInt2537 = i_7 + this.anInt2532;
		this.anInt2538 = i_8 + this.anInt2532;
		this.anInt2539 = i_9 + this.anInt2533;
		this.anInt2531 = i_10 + this.anInt2533;
	}

	public boolean method3255(int i_1, int i_2, int i_3) {
		if (i_1 >= this.anInt2535 && i_1 <= this.anInt2536) {
			if (i_2 >= this.anInt2537 && i_2 <= this.anInt2538) {
				if (i_3 >= this.anInt2539 && i_3 <= this.anInt2531) {
					int i_4 = i_1 - this.anInt2534;
					int i_5 = i_3 - this.anInt2533;
					return i_4 * i_4 + i_5 * i_5 < this.anInt2540;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	Class200(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
		this.anInt2534 = i_1;
		this.anInt2532 = i_2;
		this.anInt2533 = i_3;
		this.anInt2540 = i_4 * i_4;
		this.anInt2535 = i_5 + this.anInt2534;
		this.anInt2536 = this.anInt2534 + i_6;
		this.anInt2537 = i_7 + this.anInt2532;
		this.anInt2538 = i_8 + this.anInt2532;
		this.anInt2539 = i_9 + this.anInt2533;
		this.anInt2531 = i_10 + this.anInt2533;
	}

}
