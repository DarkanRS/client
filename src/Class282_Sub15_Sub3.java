public class Class282_Sub15_Sub3 extends Class282_Sub15 {

	NodeCollection aClass482_9754 = new NodeCollection();
	Class282_Sub15_Sub4 aClass282_Sub15_Sub4_9755 = new Class282_Sub15_Sub4();
	Class282_Sub15_Sub2 aClass282_Sub15_Sub2_9753;

	void method12242(int[] ints_1, int i_2, int i_3) {
		this.aClass282_Sub15_Sub4_9755.method12230(ints_1, i_2, i_3);

		for (Class282_Sub13 class282_sub13_4 = (Class282_Sub13) this.aClass482_9754.head((byte) 9); class282_sub13_4 != null; class282_sub13_4 = (Class282_Sub13) this.aClass482_9754.next(170364017)) {
			if (!this.aClass282_Sub15_Sub2_9753.method15115(class282_sub13_4, 2059938362)) {
				int i_5 = i_2;
				int i_6 = i_3;

				do {
					if (i_6 <= 1985703289 * class282_sub13_4.anInt7584 * -431461175) {
						this.method15234(class282_sub13_4, ints_1, i_5, i_6, i_6 + i_5, 286364982);
						class282_sub13_4.anInt7584 = (class282_sub13_4.anInt7584 * -431461175 - i_6 * -431461175) * 1985703289;
						break;
					}

					this.method15234(class282_sub13_4, ints_1, i_5, class282_sub13_4.anInt7584 * -431461175 * 1985703289, i_5 + i_6, 286364982);
					i_5 += class282_sub13_4.anInt7584 * -431461175 * 1985703289;
					i_6 -= 1985703289 * class282_sub13_4.anInt7584 * -431461175;
				} while (!this.aClass282_Sub15_Sub2_9753.method15128(class282_sub13_4, ints_1, i_5, i_6, -1639993540));
			}
		}

	}

	Class282_Sub15 method12226() {
		Class282_Sub13 class282_sub13_1 = (Class282_Sub13) this.aClass482_9754.head((byte) 120);
		return (Class282_Sub15) (class282_sub13_1 == null ? null : (class282_sub13_1.aClass282_Sub15_Sub5_7568 != null ? class282_sub13_1.aClass282_Sub15_Sub5_7568 : this.method12239()));
	}

	int method12224() {
		return 0;
	}

	void method12230(int[] ints_1, int i_2, int i_3) {
		this.aClass282_Sub15_Sub4_9755.method12230(ints_1, i_2, i_3);

		for (Class282_Sub13 class282_sub13_4 = (Class282_Sub13) this.aClass482_9754.head((byte) 60); class282_sub13_4 != null; class282_sub13_4 = (Class282_Sub13) this.aClass482_9754.next(-503729338)) {
			if (!this.aClass282_Sub15_Sub2_9753.method15115(class282_sub13_4, 2021322787)) {
				int i_5 = i_2;
				int i_6 = i_3;

				do {
					if (i_6 <= class282_sub13_4.anInt7584) {
						this.method15234(class282_sub13_4, ints_1, i_5, i_6, i_6 + i_5, 286364982);
						class282_sub13_4.anInt7584 -= i_6;
						break;
					}

					this.method15234(class282_sub13_4, ints_1, i_5, class282_sub13_4.anInt7584, i_5 + i_6, 286364982);
					i_5 += class282_sub13_4.anInt7584;
					i_6 -= class282_sub13_4.anInt7584;
				} while (!this.aClass282_Sub15_Sub2_9753.method15128(class282_sub13_4, ints_1, i_5, i_6, -465224323));
			}
		}

	}

	Class282_Sub15 method12233() {
		Class282_Sub13 class282_sub13_1 = (Class282_Sub13) this.aClass482_9754.head((byte) 41);
		return (Class282_Sub15) (class282_sub13_1 == null ? null : (class282_sub13_1.aClass282_Sub15_Sub5_7568 != null ? class282_sub13_1.aClass282_Sub15_Sub5_7568 : this.method12239()));
	}

	void method15233(Class282_Sub13 class282_sub13_1, int i_2, int i_3) {
		if ((this.aClass282_Sub15_Sub2_9753.anIntArray9707[class282_sub13_1.anInt7582] & 0x4) != 0 && class282_sub13_1.anInt7579 < 0) {
			int i_4 = this.aClass282_Sub15_Sub2_9753.anIntArray9712[class282_sub13_1.anInt7582] / Class253.anInt3129;
			int i_5 = (i_4 + 1048575 - class282_sub13_1.anInt7583) / i_4;
			class282_sub13_1.anInt7583 = i_4 * i_2 + class282_sub13_1.anInt7583 & 0xfffff;
			if (i_5 <= i_2) {
				Class282_Sub15_Sub5 class282_sub15_sub5_6 = class282_sub13_1.aClass282_Sub15_Sub5_7568;
				if (this.aClass282_Sub15_Sub2_9753.anIntArray9704[class282_sub13_1.anInt7582] == 0) {
					class282_sub13_1.aClass282_Sub15_Sub5_7568 = class282_sub13_1.aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5_6.method15323(-1982478339), class282_sub15_sub5_6.method15315(-821905990), class282_sub15_sub5_6.method15316(690484951));
				} else {
					class282_sub13_1.aClass282_Sub15_Sub5_7568 = class282_sub13_1.aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5_6.method15323(-2009448683), 0, class282_sub15_sub5_6.method15316(-1602994122));
					this.aClass282_Sub15_Sub2_9753.method15099(class282_sub13_1, class282_sub13_1.aClass282_Sub14_7566.aShortArray7590[class282_sub13_1.anInt7569] < 0, (byte) -35);
				}

				if (class282_sub13_1.aClass282_Sub14_7566.aShortArray7590[class282_sub13_1.anInt7569] < 0) {
					class282_sub13_1.aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				}

				i_2 = class282_sub13_1.anInt7583 / i_4;
			}
		}

		class282_sub13_1.aClass282_Sub15_Sub5_7568.method12231(i_2);
	}

	Class282_Sub15 method12232() {
		Class282_Sub13 class282_sub13_1 = (Class282_Sub13) this.aClass482_9754.head((byte) 77);
		return (Class282_Sub15) (class282_sub13_1 == null ? null : (class282_sub13_1.aClass282_Sub15_Sub5_7568 != null ? class282_sub13_1.aClass282_Sub15_Sub5_7568 : this.method12239()));
	}

	void method15234(Class282_Sub13 class282_sub13_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6) {
		if ((this.aClass282_Sub15_Sub2_9753.anIntArray9707[class282_sub13_1.anInt7582] & 0x4) != 0 && class282_sub13_1.anInt7579 < 0) {
			int i_7 = this.aClass282_Sub15_Sub2_9753.anIntArray9712[class282_sub13_1.anInt7582] / Class253.anInt3129;

			while (true) {
				int i_8 = (i_7 + 1048575 - class282_sub13_1.anInt7583) / i_7;
				if (i_8 > i_4) {
					class282_sub13_1.anInt7583 += i_4 * i_7;
					break;
				}

				class282_sub13_1.aClass282_Sub15_Sub5_7568.method12230(ints_2, i_3, i_8);
				i_3 += i_8;
				i_4 -= i_8;
				class282_sub13_1.anInt7583 += i_7 * i_8 - 1048576;
				int i_9 = Class253.anInt3129 / 100;
				int i_10 = 262144 / i_7;
				if (i_10 < i_9) {
					i_9 = i_10;
				}

				Class282_Sub15_Sub5 class282_sub15_sub5_11 = class282_sub13_1.aClass282_Sub15_Sub5_7568;
				if (this.aClass282_Sub15_Sub2_9753.anIntArray9704[class282_sub13_1.anInt7582] == 0) {
					class282_sub13_1.aClass282_Sub15_Sub5_7568 = class282_sub13_1.aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5_11.method15323(-1968132723), class282_sub15_sub5_11.method15315(-646351712), class282_sub15_sub5_11.method15316(1503134708));
				} else {
					class282_sub13_1.aClass282_Sub15_Sub5_7568 = class282_sub13_1.aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5_11.method15323(-1801069434), 0, class282_sub15_sub5_11.method15316(696166910));
					this.aClass282_Sub15_Sub2_9753.method15099(class282_sub13_1, class282_sub13_1.aClass282_Sub14_7566.aShortArray7590[class282_sub13_1.anInt7569] < 0, (byte) 17);
					class282_sub13_1.aClass282_Sub15_Sub5_7568.method15320(i_9, class282_sub15_sub5_11.method15315(-1596806100), -1351786987);
				}

				if (class282_sub13_1.aClass282_Sub14_7566.aShortArray7590[class282_sub13_1.anInt7569] < 0) {
					class282_sub13_1.aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				}

				class282_sub15_sub5_11.method15322(i_9, (byte) -5);
				class282_sub15_sub5_11.method12230(ints_2, i_3, i_5 - i_3);
				if (class282_sub15_sub5_11.method15311((byte) 33)) {
					this.aClass282_Sub15_Sub4_9755.method15275(class282_sub15_sub5_11);
				}
			}
		}

		class282_sub13_1.aClass282_Sub15_Sub5_7568.method12230(ints_2, i_3, i_4);
	}

	Class282_Sub15 method12229() {
		Class282_Sub13 class282_sub13_1;
		do {
			class282_sub13_1 = (Class282_Sub13) this.aClass482_9754.next(-340710606);
			if (class282_sub13_1 == null) {
				return null;
			}
		} while (class282_sub13_1.aClass282_Sub15_Sub5_7568 == null);

		return class282_sub13_1.aClass282_Sub15_Sub5_7568;
	}

	Class282_Sub15 method12235() {
		Class282_Sub13 class282_sub13_1;
		do {
			class282_sub13_1 = (Class282_Sub13) this.aClass482_9754.next(132765120);
			if (class282_sub13_1 == null) {
				return null;
			}
		} while (class282_sub13_1.aClass282_Sub15_Sub5_7568 == null);

		return class282_sub13_1.aClass282_Sub15_Sub5_7568;
	}

	Class282_Sub15 method12236() {
		Class282_Sub13 class282_sub13_1;
		do {
			class282_sub13_1 = (Class282_Sub13) this.aClass482_9754.next(2134723021);
			if (class282_sub13_1 == null) {
				return null;
			}
		} while (class282_sub13_1.aClass282_Sub15_Sub5_7568 == null);

		return class282_sub13_1.aClass282_Sub15_Sub5_7568;
	}

	int method12227() {
		return 0;
	}

	int method12238() {
		return 0;
	}

	int method12244() {
		return 0;
	}

	Class282_Sub15_Sub3(Class282_Sub15_Sub2 class282_sub15_sub2_1) {
		this.aClass282_Sub15_Sub2_9753 = class282_sub15_sub2_1;
	}

	void method12241(int[] ints_1, int i_2, int i_3) {
		this.aClass282_Sub15_Sub4_9755.method12230(ints_1, i_2, i_3);

		for (Class282_Sub13 class282_sub13_4 = (Class282_Sub13) this.aClass482_9754.head((byte) 61); class282_sub13_4 != null; class282_sub13_4 = (Class282_Sub13) this.aClass482_9754.next(1821407871)) {
			if (!this.aClass282_Sub15_Sub2_9753.method15115(class282_sub13_4, 1864764119)) {
				int i_5 = i_2;
				int i_6 = i_3;

				do {
					if (i_6 <= 1985703289 * class282_sub13_4.anInt7584 * -431461175) {
						this.method15234(class282_sub13_4, ints_1, i_5, i_6, i_6 + i_5, 286364982);
						class282_sub13_4.anInt7584 = (class282_sub13_4.anInt7584 * -431461175 - i_6 * -431461175) * 1985703289;
						break;
					}

					this.method15234(class282_sub13_4, ints_1, i_5, class282_sub13_4.anInt7584 * -431461175 * 1985703289, i_5 + i_6, 286364982);
					i_5 += class282_sub13_4.anInt7584 * -431461175 * 1985703289;
					i_6 -= 1985703289 * class282_sub13_4.anInt7584 * -431461175;
				} while (!this.aClass282_Sub15_Sub2_9753.method15128(class282_sub13_4, ints_1, i_5, i_6, -579260816));
			}
		}

	}

	Class282_Sub15 method12239() {
		Class282_Sub13 class282_sub13_1;
		do {
			class282_sub13_1 = (Class282_Sub13) this.aClass482_9754.next(2047491972);
			if (class282_sub13_1 == null) {
				return null;
			}
		} while (class282_sub13_1.aClass282_Sub15_Sub5_7568 == null);

		return class282_sub13_1.aClass282_Sub15_Sub5_7568;
	}

	void method12243(int i_1) {
		this.aClass282_Sub15_Sub4_9755.method12231(i_1);

		for (Class282_Sub13 class282_sub13_2 = (Class282_Sub13) this.aClass482_9754.head((byte) 48); class282_sub13_2 != null; class282_sub13_2 = (Class282_Sub13) this.aClass482_9754.next(-370103133)) {
			if (!this.aClass282_Sub15_Sub2_9753.method15115(class282_sub13_2, 2054111295)) {
				int i_3 = i_1;

				do {
					if (i_3 <= 1985703289 * class282_sub13_2.anInt7584 * -431461175) {
						this.method15233(class282_sub13_2, i_3, -1157347305);
						class282_sub13_2.anInt7584 = (class282_sub13_2.anInt7584 * -431461175 - -431461175 * i_3) * 1985703289;
						break;
					}

					this.method15233(class282_sub13_2, class282_sub13_2.anInt7584 * -431461175 * 1985703289, -2038249384);
					i_3 -= 1985703289 * class282_sub13_2.anInt7584 * -431461175;
				} while (!this.aClass282_Sub15_Sub2_9753.method15128(class282_sub13_2, (int[]) null, 0, i_3, 1061686588));
			}
		}

	}

	void method12234(int i_1) {
		this.aClass282_Sub15_Sub4_9755.method12231(i_1);

		for (Class282_Sub13 class282_sub13_2 = (Class282_Sub13) this.aClass482_9754.head((byte) 61); class282_sub13_2 != null; class282_sub13_2 = (Class282_Sub13) this.aClass482_9754.next(1963194555)) {
			if (!this.aClass282_Sub15_Sub2_9753.method15115(class282_sub13_2, 1966927188)) {
				int i_3 = i_1;

				do {
					if (i_3 <= 1985703289 * class282_sub13_2.anInt7584 * -431461175) {
						this.method15233(class282_sub13_2, i_3, -918400987);
						class282_sub13_2.anInt7584 = (class282_sub13_2.anInt7584 * -431461175 - -431461175 * i_3) * 1985703289;
						break;
					}

					this.method15233(class282_sub13_2, class282_sub13_2.anInt7584 * -431461175 * 1985703289, -1356701033);
					i_3 -= 1985703289 * class282_sub13_2.anInt7584 * -431461175;
				} while (!this.aClass282_Sub15_Sub2_9753.method15128(class282_sub13_2, (int[]) null, 0, i_3, 122684206));
			}
		}

	}

	int method12228() {
		return 0;
	}

	void method12231(int i_1) {
		this.aClass282_Sub15_Sub4_9755.method12231(i_1);

		for (Class282_Sub13 class282_sub13_2 = (Class282_Sub13) this.aClass482_9754.head((byte) 104); class282_sub13_2 != null; class282_sub13_2 = (Class282_Sub13) this.aClass482_9754.next(1065777410)) {
			if (!this.aClass282_Sub15_Sub2_9753.method15115(class282_sub13_2, 2094163441)) {
				int i_3 = i_1;

				do {
					if (i_3 <= class282_sub13_2.anInt7584) {
						this.method15233(class282_sub13_2, i_3, -1401648790);
						class282_sub13_2.anInt7584 -= i_3;
						break;
					}

					this.method15233(class282_sub13_2, class282_sub13_2.anInt7584, -1208210724);
					i_3 -= class282_sub13_2.anInt7584;
				} while (!this.aClass282_Sub15_Sub2_9753.method15128(class282_sub13_2, (int[]) null, 0, i_3, 57208903));
			}
		}

	}

	void method12240(int[] ints_1, int i_2, int i_3) {
		this.aClass282_Sub15_Sub4_9755.method12230(ints_1, i_2, i_3);

		for (Class282_Sub13 class282_sub13_4 = (Class282_Sub13) this.aClass482_9754.head((byte) 70); class282_sub13_4 != null; class282_sub13_4 = (Class282_Sub13) this.aClass482_9754.next(2023134706)) {
			if (!this.aClass282_Sub15_Sub2_9753.method15115(class282_sub13_4, 1817142568)) {
				int i_5 = i_2;
				int i_6 = i_3;

				do {
					if (i_6 <= 1985703289 * class282_sub13_4.anInt7584 * -431461175) {
						this.method15234(class282_sub13_4, ints_1, i_5, i_6, i_6 + i_5, 286364982);
						class282_sub13_4.anInt7584 = (class282_sub13_4.anInt7584 * -431461175 - i_6 * -431461175) * 1985703289;
						break;
					}

					this.method15234(class282_sub13_4, ints_1, i_5, class282_sub13_4.anInt7584 * -431461175 * 1985703289, i_5 + i_6, 286364982);
					i_5 += class282_sub13_4.anInt7584 * -431461175 * 1985703289;
					i_6 -= 1985703289 * class282_sub13_4.anInt7584 * -431461175;
				} while (!this.aClass282_Sub15_Sub2_9753.method15128(class282_sub13_4, ints_1, i_5, i_6, 76289834));
			}
		}

	}

	public static void method15239(Class356 class356_0, Class353 class353_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, byte b_11) {
		Class174.aClass356_2139 = class356_0;
		Class174.aClass353_2140 = class353_1;
		Class174.anInt2134 = i_2;
		Class174.anInt2133 = i_3;
		Class174.anInt2136 = i_4;
		Class208.anInt2662 = i_5;
		Class232.anInt2878 = i_6;
		Class477.anInt5630 = i_7;
		Class359.anInt4163 = i_8;
		Class174.aClass91_2141 = null;
		Class174.aClass91_2138 = null;
		Class242.aClass91_2981 = null;
		Class434.anInt5329 = i_9;
		Class174.anInt2137 = i_10;
		Class174.method2954(305406486);
		Class174.aBool2135 = true;
	}

}
