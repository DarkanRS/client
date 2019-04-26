public class NativeSprite_Sub3 extends NativeSprite {

	boolean aBool9051;
	int anInt9057;
	int anInt9055;
	int anInt9049;
	int anInt9058;
	GraphicalRenderer_Sub2 aGraphicalRenderer_Sub2_9052;
	int anInt9060;
	int anInt9053;
	Interface6 anInterface6_9050;
	Interface9 anInterface9_9054;
	boolean aBool9059;
	boolean aBool9056;
	boolean aBool9061;
	boolean aBool9062;

	public void method2767(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int[] ints_7 = this.aGraphicalRenderer_Sub2_9052.ab(i_5, i_6, i_3, i_4);
		if (ints_7 != null) {
			for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
				ints_7[i_8] |= ~0xffffff;
			}

			this.method14425(i_1, i_2, i_3, i_4, ints_7, i_3);
		}

	}

	public int method2765() {
		return this.anInt9053;
	}

	NativeSprite_Sub3(GraphicalRenderer_Sub2 class505_sub2_1, Interface6 interface6_2) {
		this(class505_sub2_1, interface6_2, interface6_2.method1(), interface6_2.method59());
	}

	NativeSprite_Sub3(GraphicalRenderer_Sub2 class505_sub2_1, Interface6 interface6_2, int i_3, int i_4) {
		this.aBool9051 = false;
		this.anInt9057 = 0;
		this.anInt9055 = 0;
		this.anInt9049 = 0;
		this.anInt9058 = 0;
		this.aGraphicalRenderer_Sub2_9052 = class505_sub2_1;
		this.anInt9060 = i_3;
		this.anInt9053 = i_4;
		this.anInterface6_9050 = interface6_2;
		this.anInterface9_9054 = null;
		this.aBool9059 = this.anInterface6_9050.method1() != i_3;
		this.aBool9056 = this.anInterface6_9050.method59() != i_4;
		this.aBool9061 = !this.aBool9059 && this.anInterface6_9050.method46();
		this.aBool9062 = !this.aBool9056 && this.anInterface6_9050.method46();
		this.aGraphicalRenderer_Sub2_9052.method13896(12);
	}

	void method2755(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_7);
		Class47 class47_9 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_9.anInterface6_443 = this.anInterface6_9050;
		class47_9.method937(i_5, i_6);
		if (this.aBool9051) {
			i_3 = i_3 * this.anInt9060 / this.method228();
			i_4 = i_4 * this.anInt9053 / this.method2748();
			i_1 += i_3 * this.anInt9055 / this.anInt9060;
			i_2 += i_4 * this.anInt9057 / this.anInt9053;
		}

		float f_10 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 126).method2714();
		float f_11 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 104).method2716();
		class47_9.aClass384_442.method6525((float) i_3 * 2.0F / f_10, (float) i_4 * 2.0F / f_11, 1.0F, 1.0F);
		class47_9.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
		class47_9.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_11 - 1.0F;
		class47_9.aClass384_442.buf[14] = -1.0F;
		class47_9.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_9.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_9.anInt446 = 0;
		class47_9.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_9.method936();
	}

	public void method2751() {
		int[] ints_4 = this.aGraphicalRenderer_Sub2_9052.ab(0, 0, this.anInt9060, this.anInt9053);
		int[] ints_5 = new int[this.anInt9060 * this.anInt9053];
		this.anInterface6_9050.method53(this.anInt9060, this.anInt9053, ints_5);
		int i_6;
		int i_7;
		int i_8;
		if (3 == 0) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 8 & ~0xffffff;
				}
			}
		} else if (3 == 1) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 16 & ~0xffffff;
				}
			}
		} else if (3 == 2) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 24 & ~0xffffff;
				}
			}
		} else if (3 == 3) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | (ints_4[i_7 + i_8] != 0 ? -16777216 : 0);
				}
			}
		}

		this.method14425(0, 0, this.anInt9060, this.anInt9053, ints_5, this.anInt9060);
	}

	void method2798(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_9);
		float f_12;
		float f_13;
		if (this.aBool9051) {
			float f_11 = (float) this.method228();
			f_12 = (float) this.method2748();
			f_13 = (f_3 - f_1) / f_11;
			float f_14 = (f_4 - f_2) / f_11;
			float f_15 = (f_5 - f_1) / f_12;
			float f_16 = (f_6 - f_2) / f_12;
			float f_17 = f_15 * (float) this.anInt9057;
			float f_18 = f_16 * (float) this.anInt9057;
			float f_19 = f_13 * (float) this.anInt9055;
			float f_20 = f_14 * (float) this.anInt9055;
			float f_21 = -f_13 * (float) this.anInt9058;
			float f_22 = -f_14 * (float) this.anInt9058;
			float f_23 = -f_15 * (float) this.anInt9049;
			float f_24 = -f_16 * (float) this.anInt9049;
			f_1 = f_1 + f_19 + f_17;
			f_2 = f_2 + f_20 + f_18;
			f_3 = f_3 + f_21 + f_17;
			f_4 = f_4 + f_22 + f_18;
			f_5 = f_5 + f_19 + f_23;
			f_6 = f_6 + f_20 + f_24;
		}

		Class47 class47_25 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_25.anInterface6_443 = this.anInterface6_9050;
		class47_25.method937(i_7, i_8);
		f_12 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 112).method2714();
		f_13 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 122).method2716();
		class47_25.aClass384_442.identity();
		class47_25.aClass384_442.buf[0] = (f_3 - f_1) * 2.0F / f_12;
		class47_25.aClass384_442.buf[1] = (f_4 - f_2) * 2.0F / f_13;
		class47_25.aClass384_442.buf[4] = (f_5 - f_1) * 2.0F / f_12;
		class47_25.aClass384_442.buf[5] = (f_6 - f_2) * 2.0F / f_13;
		class47_25.aClass384_442.buf[12] = (f_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_12 - 1.0F;
		class47_25.aClass384_442.buf[13] = (f_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_13 - 1.0F;
		class47_25.aClass384_442.buf[14] = -1.0F;
		class47_25.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_25.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_25.anInt446 = 0;
		class47_25.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_25.method936();
	}

	public void method2750(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int[] ints_7 = this.aGraphicalRenderer_Sub2_9052.ab(i_5, i_6, i_3, i_4);
		if (ints_7 != null) {
			for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
				ints_7[i_8] |= ~0xffffff;
			}

			this.method14425(i_1, i_2, i_3, i_4, ints_7, i_3);
		}

	}

	public int method2747() {
		return this.anInt9060;
	}

	public int method2786() {
		return this.anInt9060;
	}

	public int method2793() {
		return this.anInt9053;
	}

	void method2764(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_9);
		float f_12;
		float f_13;
		if (this.aBool9051) {
			float f_11 = (float) this.method228();
			f_12 = (float) this.method2748();
			f_13 = (f_3 - f_1) / f_11;
			float f_14 = (f_4 - f_2) / f_11;
			float f_15 = (f_5 - f_1) / f_12;
			float f_16 = (f_6 - f_2) / f_12;
			float f_17 = f_15 * (float) this.anInt9057;
			float f_18 = f_16 * (float) this.anInt9057;
			float f_19 = f_13 * (float) this.anInt9055;
			float f_20 = f_14 * (float) this.anInt9055;
			float f_21 = -f_13 * (float) this.anInt9058;
			float f_22 = -f_14 * (float) this.anInt9058;
			float f_23 = -f_15 * (float) this.anInt9049;
			float f_24 = -f_16 * (float) this.anInt9049;
			f_1 = f_1 + f_19 + f_17;
			f_2 = f_2 + f_20 + f_18;
			f_3 = f_3 + f_21 + f_17;
			f_4 = f_4 + f_22 + f_18;
			f_5 = f_5 + f_19 + f_23;
			f_6 = f_6 + f_20 + f_24;
		}

		Class47 class47_25 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_25.anInterface6_443 = this.anInterface6_9050;
		class47_25.method937(i_7, i_8);
		f_12 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 126).method2714();
		f_13 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 123).method2716();
		class47_25.aClass384_442.identity();
		class47_25.aClass384_442.buf[0] = (f_3 - f_1) * 2.0F / f_12;
		class47_25.aClass384_442.buf[1] = (f_4 - f_2) * 2.0F / f_13;
		class47_25.aClass384_442.buf[4] = (f_5 - f_1) * 2.0F / f_12;
		class47_25.aClass384_442.buf[5] = (f_6 - f_2) * 2.0F / f_13;
		class47_25.aClass384_442.buf[12] = (f_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_12 - 1.0F;
		class47_25.aClass384_442.buf[13] = (f_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_13 - 1.0F;
		class47_25.aClass384_442.buf[14] = -1.0F;
		class47_25.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_25.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_25.anInt446 = 0;
		class47_25.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_25.method936();
	}

	public Interface9 method2808() {
		return this.anInterface9_9054;
	}

	public void method2768(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int[] ints_7 = this.aGraphicalRenderer_Sub2_9052.ab(i_5, i_6, i_3, i_4);
		if (ints_7 != null) {
			for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
				ints_7[i_8] |= ~0xffffff;
			}

			this.method14425(i_1, i_2, i_3, i_4, ints_7, i_3);
		}

	}

	public void method2774(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		Class47 class47_6 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_6.anInterface6_443 = this.anInterface6_9050;
		class47_6.method937(1, -1);
		i_1 += this.anInt9055;
		i_2 += this.anInt9057;
		float f_7 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 115).method2714();
		float f_8 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 104).method2716();
		class47_6.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_7, (float) this.anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
		class47_6.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
		class47_6.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
		class47_6.aClass384_442.buf[14] = -1.0F;
		class47_6.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_6.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_6.anInt446 = 0;
		class47_6.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		Interface6 interface6_9 = ((Class455_Sub1) class455_3).anInterface6_8508;
		class47_6.anInterface6_441 = interface6_9;
		class47_6.aClass384_444.method6525(interface6_9.method47((float) this.anInt9060), interface6_9.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_6.aClass384_444.buf[12] = interface6_9.method47((float) (i_1 - i_4));
		class47_6.aClass384_444.buf[13] = interface6_9.method62((float) (i_2 - i_5));
		class47_6.method938();
	}

	public void method2773(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		Class47 class47_6 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_6.anInterface6_443 = this.anInterface6_9050;
		class47_6.method937(1, -1);
		i_1 += this.anInt9055;
		i_2 += this.anInt9057;
		float f_7 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 121).method2714();
		float f_8 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 125).method2716();
		class47_6.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_7, (float) this.anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
		class47_6.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
		class47_6.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
		class47_6.aClass384_442.buf[14] = -1.0F;
		class47_6.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_6.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_6.anInt446 = 0;
		class47_6.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		Interface6 interface6_9 = ((Class455_Sub1) class455_3).anInterface6_8508;
		class47_6.anInterface6_441 = interface6_9;
		class47_6.aClass384_444.method6525(interface6_9.method47((float) this.anInt9060), interface6_9.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_6.aClass384_444.buf[12] = interface6_9.method47((float) (i_1 - i_4));
		class47_6.aClass384_444.buf[13] = interface6_9.method62((float) (i_2 - i_5));
		class47_6.method938();
	}

	public Interface9 method2801() {
		return this.anInterface9_9054;
	}

	public void method2772(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_7);
		Class47 class47_8 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_8.anInterface6_443 = this.anInterface6_9050;
		class47_8.method937(i_5, i_6);
		float f_9 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 116).method2714();
		float f_10 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 122).method2716();
		class47_8.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_8.anInt446 = 0;
		class47_8.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		boolean bool_11 = this.aBool9062 && this.anInt9057 == 0 && this.anInt9049 == 0;
		boolean bool_12 = this.aBool9061 && this.anInt9055 == 0 && this.anInt9058 == 0;
		if (bool_12 & bool_11) {
			class47_8.aClass384_442.method6525((float) i_3 * 2.0F / f_9, (float) i_4 * 2.0F / f_10, 1.0F, 1.0F);
			class47_8.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
			class47_8.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
			class47_8.aClass384_442.buf[14] = -1.0F;
			class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_3), this.anInterface6_9050.method62((float) i_4), 1.0F, 1.0F);
			class47_8.method936();
		} else {
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			if (bool_12) {
				i_13 = i_2 + i_4;
				i_14 = this.method2748();
				class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_3), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
				i_15 = i_2 + this.anInt9057;

				for (i_16 = i_15 + this.anInt9053; i_16 <= i_13; i_16 += i_14) {
					class47_8.aClass384_442.method6525((float) i_3 * 2.0F / f_9, (float) this.anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
					i_15 += i_14;
				}

				if (i_15 < i_13) {
					i_16 = i_13 - i_15;
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_3), this.anInterface6_9050.method62((float) i_16), 1.0F, 1.0F);
					class47_8.aClass384_442.method6525((float) i_3 * 2.0F / f_9, (float) i_16 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
				}
			} else if (bool_11) {
				i_13 = i_3 + i_1;
				i_14 = this.method228();
				class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) i_4), 1.0F, 1.0F);
				i_15 = this.anInt9055 + i_1;

				for (i_16 = i_15 + this.anInt9060; i_16 <= i_13; i_16 += i_14) {
					class47_8.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_9, (float) i_4 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
					i_15 += i_14;
				}

				if (i_15 < i_13) {
					i_16 = i_13 - i_15;
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_16), this.anInterface6_9050.method62((float) i_4), 1.0F, 1.0F);
					class47_8.aClass384_442.method6525((float) i_16 * 2.0F / f_9, (float) i_4 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
				}
			} else {
				i_13 = i_2 + i_4;
				i_14 = i_3 + i_1;
				i_15 = this.method228();
				i_16 = this.method2748();
				int i_17 = i_2 + this.anInt9057;

				int i_18;
				int i_19;
				int i_20;
				for (i_18 = i_17 + this.anInt9053; i_18 <= i_13; i_18 += i_16) {
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
					i_19 = this.anInt9055 + i_1;

					for (i_20 = i_19 + this.anInt9060; i_20 <= i_14; i_20 += i_15) {
						class47_8.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_9, (float) this.anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
						i_19 += i_15;
					}

					if (i_19 < i_14) {
						i_20 = i_14 - i_19;
						class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_20), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
						class47_8.aClass384_442.method6525((float) i_20 * 2.0F / f_9, (float) this.anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
					}

					i_17 += i_16;
				}

				if (i_17 < i_13) {
					i_18 = i_13 - i_17;
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) i_18), 1.0F, 1.0F);
					i_19 = this.anInt9055 + i_1;

					for (i_20 = i_19 + this.anInt9060; i_20 <= i_14; i_20 += i_15) {
						class47_8.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_9, (float) i_18 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
						i_19 += i_15;
					}

					if (i_19 < i_14) {
						i_20 = i_14 - i_19;
						class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_20), this.anInterface6_9050.method62((float) i_18), 1.0F, 1.0F);
						class47_8.aClass384_442.method6525((float) i_20 * 2.0F / f_9, (float) i_18 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
					}
				}
			}
		}

	}

	public int method2792() {
		return this.anInt9053 + this.anInt9057 + this.anInt9049;
	}

	void method2766(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		Class47 class47_11 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_11.anInterface6_443 = this.anInterface6_9050;
		class47_11.method937(1, -1);
		float f_12 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 105).method2714();
		float f_13 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 110).method2716();
		class47_11.aClass384_442.identity();
		if (this.aBool9051) {
			float f_14 = (float) this.anInt9060 / (float) this.method228();
			float f_15 = (float) this.anInt9053 / (float) this.method2748();
			class47_11.aClass384_442.buf[0] = (f_3 - f_1) * f_14;
			class47_11.aClass384_442.buf[1] = (f_4 - f_2) * f_14;
			class47_11.aClass384_442.buf[4] = (f_5 - f_1) * f_15;
			class47_11.aClass384_442.buf[5] = (f_6 - f_2) * f_15;
			class47_11.aClass384_442.buf[12] = (f_1 + (float) this.anInt9055) * f_14 + this.aGraphicalRenderer_Sub2_9052.method13905();
			class47_11.aClass384_442.buf[13] = (f_2 + (float) this.anInt9057) * f_15 + this.aGraphicalRenderer_Sub2_9052.method13905();
		} else {
			class47_11.aClass384_442.buf[0] = f_3 - f_1;
			class47_11.aClass384_442.buf[1] = f_4 - f_2;
			class47_11.aClass384_442.buf[4] = f_5 - f_1;
			class47_11.aClass384_442.buf[5] = f_6 - f_2;
			class47_11.aClass384_442.buf[12] = f_1 + this.aGraphicalRenderer_Sub2_9052.method13905();
			class47_11.aClass384_442.buf[13] = f_2 + this.aGraphicalRenderer_Sub2_9052.method13905();
		}

		Matrix44Arr matrix44arr_16 = this.aGraphicalRenderer_Sub2_9052.aClass384_8683;
		matrix44arr_16.identity();
		matrix44arr_16.buf[0] = 2.0F / f_12;
		matrix44arr_16.buf[5] = 2.0F / f_13;
		matrix44arr_16.buf[12] = -1.0F;
		matrix44arr_16.buf[13] = -1.0F;
		matrix44arr_16.buf[14] = -1.0F;
		class47_11.aClass384_442.method6523(matrix44arr_16);
		class47_11.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_11.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_11.anInt446 = 0;
		class47_11.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		Interface6 interface6_17 = ((Class455_Sub1) class455_8).anInterface6_8508;
		class47_11.anInterface6_441 = interface6_17;
		class47_11.aClass384_444.identity();
		class47_11.aClass384_444.buf[0] = (f_3 - f_1) * interface6_17.method47(1.0F);
		class47_11.aClass384_444.buf[1] = (f_4 - f_2) * interface6_17.method47(1.0F);
		class47_11.aClass384_444.buf[4] = (f_5 - f_1) * interface6_17.method62(1.0F);
		class47_11.aClass384_444.buf[5] = (f_6 - f_2) * interface6_17.method62(1.0F);
		class47_11.aClass384_444.buf[12] = (f_1 - (float) i_9) * interface6_17.method47(1.0F);
		class47_11.aClass384_444.buf[13] = (f_2 - (float) i_10) * interface6_17.method62(1.0F);
		class47_11.method938();
	}

	public void method2796(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_7);
		Class47 class47_8 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_8.anInterface6_443 = this.anInterface6_9050;
		class47_8.method937(i_5, i_6);
		float f_9 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 109).method2714();
		float f_10 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 120).method2716();
		class47_8.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_8.anInt446 = 0;
		class47_8.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		boolean bool_11 = this.aBool9062 && this.anInt9057 == 0 && this.anInt9049 == 0;
		boolean bool_12 = this.aBool9061 && this.anInt9055 == 0 && this.anInt9058 == 0;
		if (bool_12 & bool_11) {
			class47_8.aClass384_442.method6525((float) i_3 * 2.0F / f_9, (float) i_4 * 2.0F / f_10, 1.0F, 1.0F);
			class47_8.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
			class47_8.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
			class47_8.aClass384_442.buf[14] = -1.0F;
			class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_3), this.anInterface6_9050.method62((float) i_4), 1.0F, 1.0F);
			class47_8.method936();
		} else {
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			if (bool_12) {
				i_13 = i_2 + i_4;
				i_14 = this.method2748();
				class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_3), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
				i_15 = i_2 + this.anInt9057;

				for (i_16 = i_15 + this.anInt9053; i_16 <= i_13; i_16 += i_14) {
					class47_8.aClass384_442.method6525((float) i_3 * 2.0F / f_9, (float) this.anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
					i_15 += i_14;
				}

				if (i_15 < i_13) {
					i_16 = i_13 - i_15;
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_3), this.anInterface6_9050.method62((float) i_16), 1.0F, 1.0F);
					class47_8.aClass384_442.method6525((float) i_3 * 2.0F / f_9, (float) i_16 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
				}
			} else if (bool_11) {
				i_13 = i_1 + i_3;
				i_14 = this.method228();
				class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) i_4), 1.0F, 1.0F);
				i_15 = i_1 + this.anInt9055;

				for (i_16 = i_15 + this.anInt9060; i_16 <= i_13; i_16 += i_14) {
					class47_8.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_9, (float) i_4 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
					i_15 += i_14;
				}

				if (i_15 < i_13) {
					i_16 = i_13 - i_15;
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_16), this.anInterface6_9050.method62((float) i_4), 1.0F, 1.0F);
					class47_8.aClass384_442.method6525((float) i_16 * 2.0F / f_9, (float) i_4 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
				}
			} else {
				i_13 = i_2 + i_4;
				i_14 = i_1 + i_3;
				i_15 = this.method228();
				i_16 = this.method2748();
				int i_17 = i_2 + this.anInt9057;

				int i_18;
				int i_19;
				int i_20;
				for (i_18 = i_17 + this.anInt9053; i_18 <= i_13; i_18 += i_16) {
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
					i_19 = i_1 + this.anInt9055;

					for (i_20 = i_19 + this.anInt9060; i_20 <= i_14; i_20 += i_15) {
						class47_8.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_9, (float) this.anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
						i_19 += i_15;
					}

					if (i_19 < i_14) {
						i_20 = i_14 - i_19;
						class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_20), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
						class47_8.aClass384_442.method6525((float) i_20 * 2.0F / f_9, (float) this.anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
					}

					i_17 += i_16;
				}

				if (i_17 < i_13) {
					i_18 = i_13 - i_17;
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) i_18), 1.0F, 1.0F);
					i_19 = i_1 + this.anInt9055;

					for (i_20 = i_19 + this.anInt9060; i_20 <= i_14; i_20 += i_15) {
						class47_8.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_9, (float) i_18 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
						i_19 += i_15;
					}

					if (i_19 < i_14) {
						i_20 = i_14 - i_19;
						class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_20), this.anInterface6_9050.method62((float) i_18), 1.0F, 1.0F);
						class47_8.aClass384_442.method6525((float) i_20 * 2.0F / f_9, (float) i_18 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
					}
				}
			}
		}

	}

	public void method2742(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_5);
		Class47 class47_6 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_6.anInterface6_443 = this.anInterface6_9050;
		class47_6.method937(i_3, i_4);
		i_1 += this.anInt9055;
		i_2 += this.anInt9057;
		float f_7 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 114).method2714();
		float f_8 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 112).method2716();
		class47_6.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_7, (float) this.anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
		class47_6.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
		class47_6.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
		class47_6.aClass384_442.buf[14] = -1.0F;
		class47_6.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_6.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_6.anInt446 = 0;
		class47_6.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_6.method936();
	}

	public void method2769(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int[] ints_7 = this.aGraphicalRenderer_Sub2_9052.ab(i_5, i_6, i_3, i_4);
		if (ints_7 != null) {
			for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
				ints_7[i_8] |= ~0xffffff;
			}

			this.method14425(i_1, i_2, i_3, i_4, ints_7, i_3);
		}

	}

	public void method2770(int i_1, int i_2, int i_3) {
		int[] ints_4 = this.aGraphicalRenderer_Sub2_9052.ab(i_1, i_2, this.anInt9060, this.anInt9053);
		int[] ints_5 = new int[this.anInt9060 * this.anInt9053];
		this.anInterface6_9050.method53(this.anInt9060, this.anInt9053, ints_5);
		int i_6;
		int i_7;
		int i_8;
		if (i_3 == 0) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 8 & ~0xffffff;
				}
			}
		} else if (i_3 == 1) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 16 & ~0xffffff;
				}
			}
		} else if (i_3 == 2) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 24 & ~0xffffff;
				}
			}
		} else if (i_3 == 3) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | (ints_4[i_7 + i_8] != 0 ? -16777216 : 0);
				}
			}
		}

		this.method14425(0, 0, this.anInt9060, this.anInt9053, ints_5, this.anInt9060);
	}

	public void method2783(int i_1, int i_2, int i_3, int i_4) {
		this.anInt9055 = i_1;
		this.anInt9057 = i_2;
		this.anInt9058 = i_3;
		this.anInt9049 = i_4;
		this.aBool9051 = this.anInt9055 != 0 || this.anInt9057 != 0 || this.anInt9058 != 0 || this.anInt9049 != 0;
	}

	void method14425(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_7) {
		this.anInterface6_9050.method48(i_1, i_2, i_3, i_4, ints_5, 0, i_7);
	}

	public void method2784(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		Class47 class47_6 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_6.anInterface6_443 = this.anInterface6_9050;
		class47_6.method937(1, -1);
		i_1 += this.anInt9055;
		i_2 += this.anInt9057;
		float f_7 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 113).method2714();
		float f_8 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 122).method2716();
		class47_6.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_7, (float) this.anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
		class47_6.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
		class47_6.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
		class47_6.aClass384_442.buf[14] = -1.0F;
		class47_6.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_6.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_6.anInt446 = 0;
		class47_6.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		Interface6 interface6_9 = ((Class455_Sub1) class455_3).anInterface6_8508;
		class47_6.anInterface6_441 = interface6_9;
		class47_6.aClass384_444.method6525(interface6_9.method47((float) this.anInt9060), interface6_9.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_6.aClass384_444.buf[12] = interface6_9.method47((float) (i_1 - i_4));
		class47_6.aClass384_444.buf[13] = interface6_9.method62((float) (i_2 - i_5));
		class47_6.method938();
	}

	public int method2757() {
		return this.anInt9053 + this.anInt9057 + this.anInt9049;
	}

	public void method2743(int i_1, int i_2, int i_3, int i_4) {
		this.anInt9055 = i_1;
		this.anInt9057 = i_2;
		this.anInt9058 = i_3;
		this.anInt9049 = i_4;
		this.aBool9051 = this.anInt9055 != 0 || this.anInt9057 != 0 || this.anInt9058 != 0 || this.anInt9049 != 0;
	}

	void method2787(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_7);
		Class47 class47_9 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_9.anInterface6_443 = this.anInterface6_9050;
		class47_9.method937(i_5, i_6);
		if (this.aBool9051) {
			i_3 = i_3 * this.anInt9060 / this.method228();
			i_4 = i_4 * this.anInt9053 / this.method2748();
			i_1 += this.anInt9055 * i_3 / this.anInt9060;
			i_2 += this.anInt9057 * i_4 / this.anInt9053;
		}

		float f_10 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 115).method2714();
		float f_11 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 123).method2716();
		class47_9.aClass384_442.method6525((float) i_3 * 2.0F / f_10, (float) i_4 * 2.0F / f_11, 1.0F, 1.0F);
		class47_9.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
		class47_9.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_11 - 1.0F;
		class47_9.aClass384_442.buf[14] = -1.0F;
		class47_9.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_9.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_9.anInt446 = 0;
		class47_9.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_9.method936();
	}

	public void method2749(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_5);
		Class47 class47_6 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_6.anInterface6_443 = this.anInterface6_9050;
		class47_6.method937(i_3, i_4);
		i_1 += this.anInt9055;
		i_2 += this.anInt9057;
		float f_7 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 106).method2714();
		float f_8 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 106).method2716();
		class47_6.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_7, (float) this.anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
		class47_6.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
		class47_6.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
		class47_6.aClass384_442.buf[14] = -1.0F;
		class47_6.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_6.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_6.anInt446 = 0;
		class47_6.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_6.method936();
	}

	public void method2778(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_5);
		Class47 class47_6 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_6.anInterface6_443 = this.anInterface6_9050;
		class47_6.method937(i_3, i_4);
		i_1 += this.anInt9055;
		i_2 += this.anInt9057;
		float f_7 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 113).method2714();
		float f_8 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 110).method2716();
		class47_6.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_7, (float) this.anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
		class47_6.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
		class47_6.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
		class47_6.aClass384_442.buf[14] = -1.0F;
		class47_6.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_6.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_6.anInt446 = 0;
		class47_6.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_6.method936();
	}

	void method2775(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_7);
		Class47 class47_9 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_9.anInterface6_443 = this.anInterface6_9050;
		class47_9.method937(i_5, i_6);
		if (this.aBool9051) {
			i_3 = i_3 * this.anInt9060 / this.method228();
			i_4 = i_4 * this.anInt9053 / this.method2748();
			i_1 += this.anInt9055 * i_3 / this.anInt9060;
			i_2 += this.anInt9057 * i_4 / this.anInt9053;
		}

		float f_10 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 115).method2714();
		float f_11 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 120).method2716();
		class47_9.aClass384_442.method6525((float) i_3 * 2.0F / f_10, (float) i_4 * 2.0F / f_11, 1.0F, 1.0F);
		class47_9.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
		class47_9.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_11 - 1.0F;
		class47_9.aClass384_442.buf[14] = -1.0F;
		class47_9.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_9.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_9.anInt446 = 0;
		class47_9.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_9.method936();
	}

	public int method2794() {
		return this.anInt9060;
	}

	public void method2781(int i_1, int i_2, int i_3, int i_4) {
		this.anInt9055 = i_1;
		this.anInt9057 = i_2;
		this.anInt9058 = i_3;
		this.anInt9049 = i_4;
		this.aBool9051 = this.anInt9055 != 0 || this.anInt9057 != 0 || this.anInt9058 != 0 || this.anInt9049 != 0;
	}

	public void method2782(int[] ints_1) {
		ints_1[0] = this.anInt9055;
		ints_1[1] = this.anInt9057;
		ints_1[2] = this.anInt9058;
		ints_1[3] = this.anInt9049;
	}

	public void method2804(int[] ints_1) {
		ints_1[0] = this.anInt9055;
		ints_1[1] = this.anInt9057;
		ints_1[2] = this.anInt9058;
		ints_1[3] = this.anInt9049;
	}

	public void method2777(int[] ints_1) {
		ints_1[0] = this.anInt9055;
		ints_1[1] = this.anInt9057;
		ints_1[2] = this.anInt9058;
		ints_1[3] = this.anInt9049;
	}

	public void method2785(int[] ints_1) {
		ints_1[0] = this.anInt9055;
		ints_1[1] = this.anInt9057;
		ints_1[2] = this.anInt9058;
		ints_1[3] = this.anInt9049;
	}

	public int method225() {
		return this.anInt9060 + this.anInt9055 + this.anInt9058;
	}

	NativeSprite_Sub3(GraphicalRenderer_Sub2 class505_sub2_1, int i_2, int i_3, int[] ints_4, int i_5, int i_6) {
		this.aBool9051 = false;
		this.anInt9057 = 0;
		this.anInt9055 = 0;
		this.anInt9049 = 0;
		this.anInt9058 = 0;
		this.aGraphicalRenderer_Sub2_9052 = class505_sub2_1;
		this.anInt9060 = i_2;
		this.anInt9053 = i_3;
		this.anInterface9_9054 = null;
		this.anInterface6_9050 = class505_sub2_1.method14094(i_2, i_3, false, ints_4, i_5, i_6);
		this.anInterface6_9050.method50(true, true);
		this.aBool9059 = this.anInterface6_9050.method1() != i_2;
		this.aBool9056 = this.anInterface6_9050.method59() != i_3;
		this.aBool9061 = !this.aBool9059 && this.anInterface6_9050.method46();
		this.aBool9062 = !this.aBool9056 && this.anInterface6_9050.method46();
		this.aGraphicalRenderer_Sub2_9052.method13896(12);
	}

	public int method2788() {
		return this.anInt9053;
	}

	public int method2748() {
		return this.anInt9053 + this.anInt9057 + this.anInt9049;
	}

	public int method227() {
		return this.anInt9060 + this.anInt9055 + this.anInt9058;
	}

	public void method2771(int i_1, int i_2, int i_3) {
		int[] ints_4 = this.aGraphicalRenderer_Sub2_9052.ab(i_1, i_2, this.anInt9060, this.anInt9053);
		int[] ints_5 = new int[this.anInt9060 * this.anInt9053];
		this.anInterface6_9050.method53(this.anInt9060, this.anInt9053, ints_5);
		int i_6;
		int i_7;
		int i_8;
		if (i_3 == 0) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 8 & ~0xffffff;
				}
			}
		} else if (i_3 == 1) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 16 & ~0xffffff;
				}
			}
		} else if (i_3 == 2) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 24 & ~0xffffff;
				}
			}
		} else if (i_3 == 3) {
			for (i_6 = 0; i_6 < this.anInt9053; i_6++) {
				i_7 = i_6 * this.anInt9060;

				for (i_8 = 0; i_8 < this.anInt9060; i_8++) {
					ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | (ints_4[i_7 + i_8] != 0 ? -16777216 : 0);
				}
			}
		}

		this.method14425(0, 0, this.anInt9060, this.anInt9053, ints_5, this.anInt9060);
	}

	public int method226() {
		return this.anInt9060 + this.anInt9055 + this.anInt9058;
	}

	public int method229() {
		return this.anInt9060 + this.anInt9055 + this.anInt9058;
	}

	public void method2744(int[] ints_1) {
		ints_1[0] = this.anInt9055;
		ints_1[1] = this.anInt9057;
		ints_1[2] = this.anInt9058;
		ints_1[3] = this.anInt9049;
	}

	public void method2780(int i_1, int i_2, int i_3, int i_4) {
		this.anInt9055 = i_1;
		this.anInt9057 = i_2;
		this.anInt9058 = i_3;
		this.anInt9049 = i_4;
		this.aBool9051 = this.anInt9055 != 0 || this.anInt9057 != 0 || this.anInt9058 != 0 || this.anInt9049 != 0;
	}

	public int method2753() {
		return this.anInt9053 + this.anInt9057 + this.anInt9049;
	}

	public void method2799(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_7);
		Class47 class47_8 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_8.anInterface6_443 = this.anInterface6_9050;
		class47_8.method937(i_5, i_6);
		float f_9 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 118).method2714();
		float f_10 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 112).method2716();
		class47_8.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_8.anInt446 = 0;
		class47_8.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		boolean bool_11 = this.aBool9062 && this.anInt9057 == 0 && this.anInt9049 == 0;
		boolean bool_12 = this.aBool9061 && this.anInt9055 == 0 && this.anInt9058 == 0;
		if (bool_12 & bool_11) {
			class47_8.aClass384_442.method6525((float) i_3 * 2.0F / f_9, (float) i_4 * 2.0F / f_10, 1.0F, 1.0F);
			class47_8.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
			class47_8.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
			class47_8.aClass384_442.buf[14] = -1.0F;
			class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_3), this.anInterface6_9050.method62((float) i_4), 1.0F, 1.0F);
			class47_8.method936();
		} else {
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			if (bool_12) {
				i_13 = i_2 + i_4;
				i_14 = this.method2748();
				class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_3), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
				i_15 = i_2 + this.anInt9057;

				for (i_16 = i_15 + this.anInt9053; i_16 <= i_13; i_16 += i_14) {
					class47_8.aClass384_442.method6525((float) i_3 * 2.0F / f_9, (float) this.anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
					i_15 += i_14;
				}

				if (i_15 < i_13) {
					i_16 = i_13 - i_15;
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_3), this.anInterface6_9050.method62((float) i_16), 1.0F, 1.0F);
					class47_8.aClass384_442.method6525((float) i_3 * 2.0F / f_9, (float) i_16 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
				}
			} else if (bool_11) {
				i_13 = i_1 + i_3;
				i_14 = this.method228();
				class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) i_4), 1.0F, 1.0F);
				i_15 = i_1 + this.anInt9055;

				for (i_16 = i_15 + this.anInt9060; i_16 <= i_13; i_16 += i_14) {
					class47_8.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_9, (float) i_4 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
					i_15 += i_14;
				}

				if (i_15 < i_13) {
					i_16 = i_13 - i_15;
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_16), this.anInterface6_9050.method62((float) i_4), 1.0F, 1.0F);
					class47_8.aClass384_442.method6525((float) i_16 * 2.0F / f_9, (float) i_4 * 2.0F / f_10, 1.0F, 1.0F);
					class47_8.aClass384_442.buf[12] = ((float) i_15 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
					class47_8.aClass384_442.buf[13] = ((float) i_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
					class47_8.aClass384_442.buf[14] = -1.0F;
					class47_8.method936();
				}
			} else {
				i_13 = i_2 + i_4;
				i_14 = i_1 + i_3;
				i_15 = this.method228();
				i_16 = this.method2748();
				int i_17 = i_2 + this.anInt9057;

				int i_18;
				int i_19;
				int i_20;
				for (i_18 = i_17 + this.anInt9053; i_18 <= i_13; i_18 += i_16) {
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
					i_19 = i_1 + this.anInt9055;

					for (i_20 = i_19 + this.anInt9060; i_20 <= i_14; i_20 += i_15) {
						class47_8.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_9, (float) this.anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
						i_19 += i_15;
					}

					if (i_19 < i_14) {
						i_20 = i_14 - i_19;
						class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_20), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
						class47_8.aClass384_442.method6525((float) i_20 * 2.0F / f_9, (float) this.anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
					}

					i_17 += i_16;
				}

				if (i_17 < i_13) {
					i_18 = i_13 - i_17;
					class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) i_18), 1.0F, 1.0F);
					i_19 = i_1 + this.anInt9055;

					for (i_20 = i_19 + this.anInt9060; i_20 <= i_14; i_20 += i_15) {
						class47_8.aClass384_442.method6525((float) this.anInt9060 * 2.0F / f_9, (float) i_18 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
						i_19 += i_15;
					}

					if (i_19 < i_14) {
						i_20 = i_14 - i_19;
						class47_8.aClass384_440.method6525(this.anInterface6_9050.method47((float) i_20), this.anInterface6_9050.method62((float) i_18), 1.0F, 1.0F);
						class47_8.aClass384_442.method6525((float) i_20 * 2.0F / f_9, (float) i_18 * 2.0F / f_10, 1.0F, 1.0F);
						class47_8.aClass384_442.buf[12] = ((float) i_19 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
						class47_8.aClass384_442.buf[13] = ((float) i_17 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
						class47_8.aClass384_442.buf[14] = -1.0F;
						class47_8.method936();
					}
				}
			}
		}

	}

	public int method228() {
		return this.anInt9060 + this.anInt9055 + this.anInt9058;
	}

	void method2791(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_9);
		float f_12;
		float f_13;
		if (this.aBool9051) {
			float f_11 = (float) this.method228();
			f_12 = (float) this.method2748();
			f_13 = (f_3 - f_1) / f_11;
			float f_14 = (f_4 - f_2) / f_11;
			float f_15 = (f_5 - f_1) / f_12;
			float f_16 = (f_6 - f_2) / f_12;
			float f_17 = f_15 * (float) this.anInt9057;
			float f_18 = f_16 * (float) this.anInt9057;
			float f_19 = f_13 * (float) this.anInt9055;
			float f_20 = f_14 * (float) this.anInt9055;
			float f_21 = -f_13 * (float) this.anInt9058;
			float f_22 = -f_14 * (float) this.anInt9058;
			float f_23 = -f_15 * (float) this.anInt9049;
			float f_24 = -f_16 * (float) this.anInt9049;
			f_1 = f_1 + f_19 + f_17;
			f_2 = f_2 + f_20 + f_18;
			f_3 = f_3 + f_21 + f_17;
			f_4 = f_4 + f_22 + f_18;
			f_5 = f_5 + f_19 + f_23;
			f_6 = f_6 + f_20 + f_24;
		}

		Class47 class47_25 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_25.anInterface6_443 = this.anInterface6_9050;
		class47_25.method937(i_7, i_8);
		f_12 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 106).method2714();
		f_13 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 105).method2716();
		class47_25.aClass384_442.identity();
		class47_25.aClass384_442.buf[0] = (f_3 - f_1) * 2.0F / f_12;
		class47_25.aClass384_442.buf[1] = (f_4 - f_2) * 2.0F / f_13;
		class47_25.aClass384_442.buf[4] = (f_5 - f_1) * 2.0F / f_12;
		class47_25.aClass384_442.buf[5] = (f_6 - f_2) * 2.0F / f_13;
		class47_25.aClass384_442.buf[12] = (f_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_12 - 1.0F;
		class47_25.aClass384_442.buf[13] = (f_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_13 - 1.0F;
		class47_25.aClass384_442.buf[14] = -1.0F;
		class47_25.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_25.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_25.anInt446 = 0;
		class47_25.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_25.method936();
	}

	NativeSprite_Sub3(GraphicalRenderer_Sub2 class505_sub2_1, int i_2, int i_3, boolean bool_4, boolean bool_5) {
		this.aBool9051 = false;
		this.anInt9057 = 0;
		this.anInt9055 = 0;
		this.anInt9049 = 0;
		this.anInt9058 = 0;
		this.aGraphicalRenderer_Sub2_9052 = class505_sub2_1;
		this.anInt9060 = i_2;
		this.anInt9053 = i_3;
		if (bool_5) {
			Interface29 interface29_6 = class505_sub2_1.method14064(bool_4 ? Class150.aClass150_1949 : Class150.aClass150_1950, Class76.aClass76_751, i_2, i_3);
			this.anInterface9_9054 = interface29_6.method200();
			this.anInterface6_9050 = interface29_6;
		} else {
			this.anInterface6_9050 = class505_sub2_1.method14072(bool_4 ? Class150.aClass150_1949 : Class150.aClass150_1950, Class76.aClass76_751, i_2, i_3);
			this.anInterface9_9054 = null;
		}

		this.anInterface6_9050.method50(true, true);
		this.aBool9059 = this.anInterface6_9050.method1() != i_2;
		this.aBool9056 = this.anInterface6_9050.method59() != i_3;
		this.aBool9061 = !this.aBool9059 && this.anInterface6_9050.method46();
		this.aBool9062 = !this.aBool9056 && this.anInterface6_9050.method46();
		this.aGraphicalRenderer_Sub2_9052.method13896(12);
	}

	void method2812(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		this.aGraphicalRenderer_Sub2_9052.method13904(i_9);
		float f_12;
		float f_13;
		if (this.aBool9051) {
			float f_11 = (float) this.method228();
			f_12 = (float) this.method2748();
			f_13 = (f_3 - f_1) / f_11;
			float f_14 = (f_4 - f_2) / f_11;
			float f_15 = (f_5 - f_1) / f_12;
			float f_16 = (f_6 - f_2) / f_12;
			float f_17 = f_15 * (float) this.anInt9057;
			float f_18 = f_16 * (float) this.anInt9057;
			float f_19 = f_13 * (float) this.anInt9055;
			float f_20 = f_14 * (float) this.anInt9055;
			float f_21 = -f_13 * (float) this.anInt9058;
			float f_22 = -f_14 * (float) this.anInt9058;
			float f_23 = -f_15 * (float) this.anInt9049;
			float f_24 = -f_16 * (float) this.anInt9049;
			f_1 = f_1 + f_19 + f_17;
			f_2 = f_2 + f_20 + f_18;
			f_3 = f_3 + f_21 + f_17;
			f_4 = f_4 + f_22 + f_18;
			f_5 = f_5 + f_19 + f_23;
			f_6 = f_6 + f_20 + f_24;
		}

		Class47 class47_25 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_25.anInterface6_443 = this.anInterface6_9050;
		class47_25.method937(i_7, i_8);
		f_12 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 122).method2714();
		f_13 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 117).method2716();
		class47_25.aClass384_442.identity();
		class47_25.aClass384_442.buf[0] = (f_3 - f_1) * 2.0F / f_12;
		class47_25.aClass384_442.buf[1] = (f_4 - f_2) * 2.0F / f_13;
		class47_25.aClass384_442.buf[4] = (f_5 - f_1) * 2.0F / f_12;
		class47_25.aClass384_442.buf[5] = (f_6 - f_2) * 2.0F / f_13;
		class47_25.aClass384_442.buf[12] = (f_1 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_12 - 1.0F;
		class47_25.aClass384_442.buf[13] = (f_2 + this.aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_13 - 1.0F;
		class47_25.aClass384_442.buf[14] = -1.0F;
		class47_25.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_25.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_25.anInt446 = 0;
		class47_25.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		class47_25.method936();
	}

	void method2800(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		Class47 class47_11 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_11.anInterface6_443 = this.anInterface6_9050;
		class47_11.method937(1, -1);
		float f_12 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 103).method2714();
		float f_13 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 112).method2716();
		class47_11.aClass384_442.identity();
		if (this.aBool9051) {
			float f_14 = (float) this.anInt9060 / (float) this.method228();
			float f_15 = (float) this.anInt9053 / (float) this.method2748();
			class47_11.aClass384_442.buf[0] = (f_3 - f_1) * f_14;
			class47_11.aClass384_442.buf[1] = (f_4 - f_2) * f_14;
			class47_11.aClass384_442.buf[4] = (f_5 - f_1) * f_15;
			class47_11.aClass384_442.buf[5] = (f_6 - f_2) * f_15;
			class47_11.aClass384_442.buf[12] = (f_1 + (float) this.anInt9055) * f_14 + this.aGraphicalRenderer_Sub2_9052.method13905();
			class47_11.aClass384_442.buf[13] = (f_2 + (float) this.anInt9057) * f_15 + this.aGraphicalRenderer_Sub2_9052.method13905();
		} else {
			class47_11.aClass384_442.buf[0] = f_3 - f_1;
			class47_11.aClass384_442.buf[1] = f_4 - f_2;
			class47_11.aClass384_442.buf[4] = f_5 - f_1;
			class47_11.aClass384_442.buf[5] = f_6 - f_2;
			class47_11.aClass384_442.buf[12] = f_1 + this.aGraphicalRenderer_Sub2_9052.method13905();
			class47_11.aClass384_442.buf[13] = f_2 + this.aGraphicalRenderer_Sub2_9052.method13905();
		}

		Matrix44Arr matrix44arr_16 = this.aGraphicalRenderer_Sub2_9052.aClass384_8683;
		matrix44arr_16.identity();
		matrix44arr_16.buf[0] = 2.0F / f_12;
		matrix44arr_16.buf[5] = 2.0F / f_13;
		matrix44arr_16.buf[12] = -1.0F;
		matrix44arr_16.buf[13] = -1.0F;
		matrix44arr_16.buf[14] = -1.0F;
		class47_11.aClass384_442.method6523(matrix44arr_16);
		class47_11.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_11.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_11.anInt446 = 0;
		class47_11.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		Interface6 interface6_17 = ((Class455_Sub1) class455_8).anInterface6_8508;
		class47_11.anInterface6_441 = interface6_17;
		class47_11.aClass384_444.identity();
		class47_11.aClass384_444.buf[0] = (f_3 - f_1) * interface6_17.method47(1.0F);
		class47_11.aClass384_444.buf[1] = (f_4 - f_2) * interface6_17.method47(1.0F);
		class47_11.aClass384_444.buf[4] = (f_5 - f_1) * interface6_17.method62(1.0F);
		class47_11.aClass384_444.buf[5] = (f_6 - f_2) * interface6_17.method62(1.0F);
		class47_11.aClass384_444.buf[12] = (f_1 - (float) i_9) * interface6_17.method47(1.0F);
		class47_11.aClass384_444.buf[13] = (f_2 - (float) i_10) * interface6_17.method62(1.0F);
		class47_11.method938();
	}

	void method2811(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		this.aGraphicalRenderer_Sub2_9052.method13935();
		Class47 class47_11 = this.aGraphicalRenderer_Sub2_9052.aClass47_8698;
		class47_11.anInterface6_443 = this.anInterface6_9050;
		class47_11.method937(1, -1);
		float f_12 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 119).method2714();
		float f_13 = (float) this.aGraphicalRenderer_Sub2_9052.method8523((byte) 127).method2716();
		class47_11.aClass384_442.identity();
		if (this.aBool9051) {
			float f_14 = (float) this.anInt9060 / (float) this.method228();
			float f_15 = (float) this.anInt9053 / (float) this.method2748();
			class47_11.aClass384_442.buf[0] = (f_3 - f_1) * f_14;
			class47_11.aClass384_442.buf[1] = (f_4 - f_2) * f_14;
			class47_11.aClass384_442.buf[4] = (f_5 - f_1) * f_15;
			class47_11.aClass384_442.buf[5] = (f_6 - f_2) * f_15;
			class47_11.aClass384_442.buf[12] = (f_1 + (float) this.anInt9055) * f_14 + this.aGraphicalRenderer_Sub2_9052.method13905();
			class47_11.aClass384_442.buf[13] = (f_2 + (float) this.anInt9057) * f_15 + this.aGraphicalRenderer_Sub2_9052.method13905();
		} else {
			class47_11.aClass384_442.buf[0] = f_3 - f_1;
			class47_11.aClass384_442.buf[1] = f_4 - f_2;
			class47_11.aClass384_442.buf[4] = f_5 - f_1;
			class47_11.aClass384_442.buf[5] = f_6 - f_2;
			class47_11.aClass384_442.buf[12] = f_1 + this.aGraphicalRenderer_Sub2_9052.method13905();
			class47_11.aClass384_442.buf[13] = f_2 + this.aGraphicalRenderer_Sub2_9052.method13905();
		}

		Matrix44Arr matrix44arr_16 = this.aGraphicalRenderer_Sub2_9052.aClass384_8683;
		matrix44arr_16.identity();
		matrix44arr_16.buf[0] = 2.0F / f_12;
		matrix44arr_16.buf[5] = 2.0F / f_13;
		matrix44arr_16.buf[12] = -1.0F;
		matrix44arr_16.buf[13] = -1.0F;
		matrix44arr_16.buf[14] = -1.0F;
		class47_11.aClass384_442.method6523(matrix44arr_16);
		class47_11.aClass384_440.method6525(this.anInterface6_9050.method47((float) this.anInt9060), this.anInterface6_9050.method62((float) this.anInt9053), 1.0F, 1.0F);
		class47_11.anInterface4_445 = this.aGraphicalRenderer_Sub2_9052.anInterface4_8746;
		class47_11.anInt446 = 0;
		class47_11.aClass70_447 = this.aGraphicalRenderer_Sub2_9052.aClass70_8786;
		Interface6 interface6_17 = ((Class455_Sub1) class455_8).anInterface6_8508;
		class47_11.anInterface6_441 = interface6_17;
		class47_11.aClass384_444.identity();
		class47_11.aClass384_444.buf[0] = (f_3 - f_1) * interface6_17.method47(1.0F);
		class47_11.aClass384_444.buf[1] = (f_4 - f_2) * interface6_17.method47(1.0F);
		class47_11.aClass384_444.buf[4] = (f_5 - f_1) * interface6_17.method62(1.0F);
		class47_11.aClass384_444.buf[5] = (f_6 - f_2) * interface6_17.method62(1.0F);
		class47_11.aClass384_444.buf[12] = (f_1 - (float) i_9) * interface6_17.method47(1.0F);
		class47_11.aClass384_444.buf[13] = (f_2 - (float) i_10) * interface6_17.method62(1.0F);
		class47_11.method938();
	}

}
