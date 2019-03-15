public class Class52_Sub2 extends Class52 {

	NativeSprite aClass160_9162;
	NativeSprite aClass160_9161;
	NativeSprite aClass160_9160;
	NativeSprite aClass160_9163;
	NativeSprite aClass160_9164;
	NativeSprite aClass160_9165;

	public boolean method21() {
		if (!super.method10(1448956464)) {
			return false;
		} else {
			Class350_Sub3 class350_sub3_1 = (Class350_Sub3) this.aClass350_489;
			return !this.aClass317_493.loadCutscene(-1642545265 * class350_sub3_1.anInt7844 * 1903394671) ? false : (!this.aClass317_493.loadCutscene(-733628077 * class350_sub3_1.anInt7840 * 2096034523) ? false : (!this.aClass317_493.loadCutscene(class350_sub3_1.anInt7842 * -1010155381 * -821287133) ? false : (!this.aClass317_493.loadCutscene(-2050274227 * class350_sub3_1.anInt7843 * -1461400443) ? false : (!this.aClass317_493.loadCutscene(-485291629 * class350_sub3_1.anInt7841 * -141394789) ? false : this.aClass317_493.loadCutscene(class350_sub3_1.anInt7845 * 1560773125 * 657783501)))));
		}
	}

	public void method22() {
		super.method22();
		Class350_Sub3 class350_sub3_2 = (Class350_Sub3) this.aClass350_489;
		this.aClass160_9162 = Class152.method2600(this.aClass317_493, class350_sub3_2.anInt7844, 599471730);
		this.aClass160_9161 = Class152.method2600(this.aClass317_493, class350_sub3_2.anInt7840, -1085155495);
		this.aClass160_9160 = Class152.method2600(this.aClass317_493, class350_sub3_2.anInt7842, -123630825);
		this.aClass160_9163 = Class152.method2600(this.aClass317_493, class350_sub3_2.anInt7843, 973937213);
		this.aClass160_9164 = Class152.method2600(this.aClass317_493, class350_sub3_2.anInt7841, 895037207);
		this.aClass160_9165 = Class152.method2600(this.aClass317_493, class350_sub3_2.anInt7845, -987798190);
	}

	void method1081(boolean bool_1, int i_2, int i_3, int i_4) {
		if (bool_1) {
			int[] ints_5 = new int[4];
			Renderers.SOFTWARE_RENDERER.qa(ints_5);
			Renderers.SOFTWARE_RENDERER.r(i_2, i_3, this.aClass350_489.anInt4093 + i_2, i_3 + this.aClass350_489.anInt4088);
			int i_6 = this.aClass160_9160.method228();
			int i_7 = this.aClass160_9160.method2748();
			int i_8 = this.aClass160_9163.method228();
			int i_9 = this.aClass160_9163.method2748();
			this.aClass160_9160.method2752(i_2, i_3 + (this.aClass350_489.anInt4088 - i_7) / 2);
			this.aClass160_9163.method2752(this.aClass350_489.anInt4093 + i_2 - i_8, i_3 + (this.aClass350_489.anInt4088 - i_9) / 2);
			Renderers.SOFTWARE_RENDERER.r(i_2, i_3, this.aClass350_489.anInt4093 + i_2, i_3 + this.aClass160_9164.method2748());
			this.aClass160_9164.method2756(i_6 + i_2, i_3, this.aClass350_489.anInt4093 - i_6 - i_8, this.aClass350_489.anInt4088);
			int i_10 = this.aClass160_9165.method2748();
			Renderers.SOFTWARE_RENDERER.r(i_2, i_3 + this.aClass350_489.anInt4088 - i_10, this.aClass350_489.anInt4093 + i_2, i_3 + this.aClass350_489.anInt4088);
			this.aClass160_9165.method2756(i_6 + i_2, i_3 + this.aClass350_489.anInt4088 - i_10, this.aClass350_489.anInt4093 - i_6 - i_8, this.aClass350_489.anInt4088);
			Renderers.SOFTWARE_RENDERER.r(ints_5[0], ints_5[1], ints_5[2], ints_5[3]);
		}

	}

	void method1077(boolean bool_1, int i_2, int i_3, int i_4) {
		int i_5 = i_2 + this.aClass160_9160.method228();
		int i_6 = this.aClass350_489.anInt4093 + i_2 - this.aClass160_9163.method228();
		int i_7 = i_3 + this.aClass160_9164.method2748();
		int i_8 = i_3 + this.aClass350_489.anInt4088 - this.aClass160_9165.method2748();
		int i_9 = i_6 - i_5;
		int i_10 = i_8 - i_7;
		int i_11 = this.method1078(-2146755353) * i_9 / 10000;
		int[] ints_12 = new int[4];
		Renderers.SOFTWARE_RENDERER.qa(ints_12);
		Renderers.SOFTWARE_RENDERER.r(i_5, i_7, i_5 + i_11, i_8);
		this.method14498(i_5, i_7, i_9, i_10, -1731136820);
		Renderers.SOFTWARE_RENDERER.r(i_5 + i_11, i_7, i_6, i_8);
		this.aClass160_9161.method2756(i_5, i_7, i_9, i_10);
		Renderers.SOFTWARE_RENDERER.r(ints_12[0], ints_12[1], ints_12[2], ints_12[3]);
	}

	void method14498(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.aClass160_9162.method2756(i_1, i_2, i_3, i_4);
	}

	Class52_Sub2(Index index_1, Index index_2, Class350_Sub3 class350_sub3_3) {
		super(index_1, index_2, class350_sub3_3);
	}

	public void method15() {
		super.method22();
		Class350_Sub3 class350_sub3_1 = (Class350_Sub3) this.aClass350_489;
		this.aClass160_9162 = Class152.method2600(this.aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671, -1714686011);
		this.aClass160_9161 = Class152.method2600(this.aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523, -1339795032);
		this.aClass160_9160 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133, 430415140);
		this.aClass160_9163 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227, 1959437966);
		this.aClass160_9164 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629, -472313791);
		this.aClass160_9165 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501, 935956574);
	}

	public void method23() {
		super.method22();
		Class350_Sub3 class350_sub3_1 = (Class350_Sub3) this.aClass350_489;
		this.aClass160_9162 = Class152.method2600(this.aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671, -477197305);
		this.aClass160_9161 = Class152.method2600(this.aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523, -1609543131);
		this.aClass160_9160 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133, 835460859);
		this.aClass160_9163 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227, 1212027266);
		this.aClass160_9164 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629, -264541487);
		this.aClass160_9165 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501, -1858378373);
	}

	public void method16() {
		super.method22();
		Class350_Sub3 class350_sub3_1 = (Class350_Sub3) this.aClass350_489;
		this.aClass160_9162 = Class152.method2600(this.aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671, -1400576392);
		this.aClass160_9161 = Class152.method2600(this.aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523, 1375081552);
		this.aClass160_9160 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133, 1746479567);
		this.aClass160_9163 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227, 448035146);
		this.aClass160_9164 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629, 1367989823);
		this.aClass160_9165 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501, 301997484);
	}

	void method1076(boolean bool_1, int i_2, int i_3) {
		if (bool_1) {
			int[] ints_4 = new int[4];
			Renderers.SOFTWARE_RENDERER.qa(ints_4);
			Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_2 + this.aClass350_489.anInt4093 * -229835439 * 329542577, this.aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3);
			int i_5 = this.aClass160_9160.method228();
			int i_6 = this.aClass160_9160.method2748();
			int i_7 = this.aClass160_9163.method228();
			int i_8 = this.aClass160_9163.method2748();
			this.aClass160_9160.method2752(i_2, (this.aClass350_489.anInt4088 * 1707725877 * 323608093 - i_6) / 2 + i_3);
			this.aClass160_9163.method2752(this.aClass350_489.anInt4093 * -229835439 * 329542577 + i_2 - i_7, (this.aClass350_489.anInt4088 * 1707725877 * 323608093 - i_8) / 2 + i_3);
			Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_2 + this.aClass350_489.anInt4093 * -229835439 * 329542577, i_3 + this.aClass160_9164.method2748());
			this.aClass160_9164.method2756(i_2 + i_5, i_3, this.aClass350_489.anInt4093 * -229835439 * 329542577 - i_5 - i_7, 323608093 * this.aClass350_489.anInt4088 * 1707725877);
			int i_9 = this.aClass160_9165.method2748();
			Renderers.SOFTWARE_RENDERER.r(i_2, i_3 + 323608093 * this.aClass350_489.anInt4088 * 1707725877 - i_9, i_2 + 329542577 * this.aClass350_489.anInt4093 * -229835439, i_3 + 323608093 * this.aClass350_489.anInt4088 * 1707725877);
			this.aClass160_9165.method2756(i_2 + i_5, i_3 + 323608093 * this.aClass350_489.anInt4088 * 1707725877 - i_9, 329542577 * this.aClass350_489.anInt4093 * -229835439 - i_5 - i_7, this.aClass350_489.anInt4088 * 1707725877 * 323608093);
			Renderers.SOFTWARE_RENDERER.r(ints_4[0], ints_4[1], ints_4[2], ints_4[3]);
		}

	}

	public void method19() {
		super.method22();
		Class350_Sub3 class350_sub3_1 = (Class350_Sub3) this.aClass350_489;
		this.aClass160_9162 = Class152.method2600(this.aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671, 2007279420);
		this.aClass160_9161 = Class152.method2600(this.aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523, 1043309008);
		this.aClass160_9160 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133, 1438560126);
		this.aClass160_9163 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227, 2108411889);
		this.aClass160_9164 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629, 2027705405);
		this.aClass160_9165 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501, 444987892);
	}

	public boolean method13() {
		if (!super.method10(1930813381)) {
			return false;
		} else {
			Class350_Sub3 class350_sub3_1 = (Class350_Sub3) this.aClass350_489;
			return !this.aClass317_493.loadCutscene(-1642545265 * class350_sub3_1.anInt7844 * 1903394671) ? false : (!this.aClass317_493.loadCutscene(-733628077 * class350_sub3_1.anInt7840 * 2096034523) ? false : (!this.aClass317_493.loadCutscene(class350_sub3_1.anInt7842 * -1010155381 * -821287133) ? false : (!this.aClass317_493.loadCutscene(-2050274227 * class350_sub3_1.anInt7843 * -1461400443) ? false : (!this.aClass317_493.loadCutscene(-485291629 * class350_sub3_1.anInt7841 * -141394789) ? false : this.aClass317_493.loadCutscene(class350_sub3_1.anInt7845 * 1560773125 * 657783501)))));
		}
	}

	public boolean method9() {
		if (!super.method10(1478796819)) {
			return false;
		} else {
			Class350_Sub3 class350_sub3_1 = (Class350_Sub3) this.aClass350_489;
			return !this.aClass317_493.loadCutscene(-1642545265 * class350_sub3_1.anInt7844 * 1903394671) ? false : (!this.aClass317_493.loadCutscene(-733628077 * class350_sub3_1.anInt7840 * 2096034523) ? false : (!this.aClass317_493.loadCutscene(class350_sub3_1.anInt7842 * -1010155381 * -821287133) ? false : (!this.aClass317_493.loadCutscene(-2050274227 * class350_sub3_1.anInt7843 * -1461400443) ? false : (!this.aClass317_493.loadCutscene(-485291629 * class350_sub3_1.anInt7841 * -141394789) ? false : this.aClass317_493.loadCutscene(class350_sub3_1.anInt7845 * 1560773125 * 657783501)))));
		}
	}

	public boolean method10(int i_1) {
		if (!super.method10(1403976419)) {
			return false;
		} else {
			Class350_Sub3 class350_sub3_2 = (Class350_Sub3) this.aClass350_489;
			return !this.aClass317_493.loadCutscene(class350_sub3_2.anInt7844) ? false : (!this.aClass317_493.loadCutscene(class350_sub3_2.anInt7840) ? false : (!this.aClass317_493.loadCutscene(class350_sub3_2.anInt7842) ? false : (!this.aClass317_493.loadCutscene(class350_sub3_2.anInt7843) ? false : (!this.aClass317_493.loadCutscene(class350_sub3_2.anInt7841) ? false : this.aClass317_493.loadCutscene(class350_sub3_2.anInt7845)))));
		}
	}

	public void method18() {
		super.method22();
		Class350_Sub3 class350_sub3_1 = (Class350_Sub3) this.aClass350_489;
		this.aClass160_9162 = Class152.method2600(this.aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671, -372136841);
		this.aClass160_9161 = Class152.method2600(this.aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523, 48908422);
		this.aClass160_9160 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133, 1886724191);
		this.aClass160_9163 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227, 1059968166);
		this.aClass160_9164 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629, -2070043181);
		this.aClass160_9165 = Class152.method2600(this.aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501, 65900346);
	}

	void method1080(boolean bool_1, int i_2, int i_3) {
		int i_4 = i_2 + this.aClass160_9160.method228();
		int i_5 = i_2 + this.aClass350_489.anInt4093 * -229835439 * 329542577 - this.aClass160_9163.method228();
		int i_6 = i_3 + this.aClass160_9164.method2748();
		int i_7 = this.aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3 - this.aClass160_9165.method2748();
		int i_8 = i_5 - i_4;
		int i_9 = i_7 - i_6;
		int i_10 = this.method1078(-2059160857) * i_8 / 10000;
		int[] ints_11 = new int[4];
		Renderers.SOFTWARE_RENDERER.qa(ints_11);
		Renderers.SOFTWARE_RENDERER.r(i_4, i_6, i_4 + i_10, i_7);
		this.method14498(i_4, i_6, i_8, i_9, -1488513081);
		Renderers.SOFTWARE_RENDERER.r(i_4 + i_10, i_6, i_5, i_7);
		this.aClass160_9161.method2756(i_4, i_6, i_8, i_9);
		Renderers.SOFTWARE_RENDERER.r(ints_11[0], ints_11[1], ints_11[2], ints_11[3]);
	}

	void method1075(boolean bool_1, int i_2, int i_3) {
		int i_4 = i_2 + this.aClass160_9160.method228();
		int i_5 = i_2 + this.aClass350_489.anInt4093 * -229835439 * 329542577 - this.aClass160_9163.method228();
		int i_6 = i_3 + this.aClass160_9164.method2748();
		int i_7 = this.aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3 - this.aClass160_9165.method2748();
		int i_8 = i_5 - i_4;
		int i_9 = i_7 - i_6;
		int i_10 = this.method1078(-1948623655) * i_8 / 10000;
		int[] ints_11 = new int[4];
		Renderers.SOFTWARE_RENDERER.qa(ints_11);
		Renderers.SOFTWARE_RENDERER.r(i_4, i_6, i_4 + i_10, i_7);
		this.method14498(i_4, i_6, i_8, i_9, -661504276);
		Renderers.SOFTWARE_RENDERER.r(i_4 + i_10, i_6, i_5, i_7);
		this.aClass160_9161.method2756(i_4, i_6, i_8, i_9);
		Renderers.SOFTWARE_RENDERER.r(ints_11[0], ints_11[1], ints_11[2], ints_11[3]);
	}

	void method1079(boolean bool_1, int i_2, int i_3) {
		int i_4 = i_2 + this.aClass160_9160.method228();
		int i_5 = i_2 + this.aClass350_489.anInt4093 * -229835439 * 329542577 - this.aClass160_9163.method228();
		int i_6 = i_3 + this.aClass160_9164.method2748();
		int i_7 = this.aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3 - this.aClass160_9165.method2748();
		int i_8 = i_5 - i_4;
		int i_9 = i_7 - i_6;
		int i_10 = this.method1078(-2107780880) * i_8 / 10000;
		int[] ints_11 = new int[4];
		Renderers.SOFTWARE_RENDERER.qa(ints_11);
		Renderers.SOFTWARE_RENDERER.r(i_4, i_6, i_4 + i_10, i_7);
		this.method14498(i_4, i_6, i_8, i_9, -525462947);
		Renderers.SOFTWARE_RENDERER.r(i_4 + i_10, i_6, i_5, i_7);
		this.aClass160_9161.method2756(i_4, i_6, i_8, i_9);
		Renderers.SOFTWARE_RENDERER.r(ints_11[0], ints_11[1], ints_11[2], ints_11[3]);
	}

	public boolean method17() {
		if (!super.method10(1759362382)) {
			return false;
		} else {
			Class350_Sub3 class350_sub3_1 = (Class350_Sub3) this.aClass350_489;
			return !this.aClass317_493.loadCutscene(-1642545265 * class350_sub3_1.anInt7844 * 1903394671) ? false : (!this.aClass317_493.loadCutscene(-733628077 * class350_sub3_1.anInt7840 * 2096034523) ? false : (!this.aClass317_493.loadCutscene(class350_sub3_1.anInt7842 * -1010155381 * -821287133) ? false : (!this.aClass317_493.loadCutscene(-2050274227 * class350_sub3_1.anInt7843 * -1461400443) ? false : (!this.aClass317_493.loadCutscene(-485291629 * class350_sub3_1.anInt7841 * -141394789) ? false : this.aClass317_493.loadCutscene(class350_sub3_1.anInt7845 * 1560773125 * 657783501)))));
		}
	}

	public static void method14501(int i_0, int i_1) {
		Class150.method2580(i_0, i_1, (byte) -40);
	}

}
