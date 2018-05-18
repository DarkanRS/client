/* Class52_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52_Sub2 extends Class52 {
	NativeSprite aClass160_9160;
	NativeSprite aClass160_9161;
	NativeSprite aClass160_9162;
	NativeSprite aClass160_9163;
	NativeSprite aClass160_9164;
	NativeSprite aClass160_9165;

	public boolean method21() {
		if (!super.method10(1448956464))
			return false;
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-1642545265 * class350_sub3.anInt7844, 461666626))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-733628077 * class350_sub3.anInt7840, 443394418))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(class350_sub3.anInt7842 * -821287133, 235003215))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661((-2050274227 * (class350_sub3.anInt7843)), -954135021))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-485291629 * class350_sub3.anInt7841, 625440758))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(class350_sub3.anInt7845 * 657783501, 272941216))
			return false;
		return true;
	}

	public void method22(int i) {
		super.method22(1273546148);
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		((Class52_Sub2) this).aClass160_9162 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -1642545265 * class350_sub3.anInt7844, 599471730);
		((Class52_Sub2) this).aClass160_9161 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -733628077 * class350_sub3.anInt7840, -1085155495);
		((Class52_Sub2) this).aClass160_9160 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7842 * -821287133, -123630825);
		((Class52_Sub2) this).aClass160_9163 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7843 * -2050274227, 973937213);
		((Class52_Sub2) this).aClass160_9164 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7841 * -485291629, 895037207);
		((Class52_Sub2) this).aClass160_9165 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7845 * 657783501, -987798190);
	}

	void method1081(boolean bool, int i, int i_0_, int i_1_) {
		if (bool) {
			int[] is = new int[4];
			Class316.aClass505_3680.qa(is);
			Class316.aClass505_3680.r(i, i_0_, i + (((Class52_Sub2) this).aClass350_489.anInt4093) * 329542577, (((Class52_Sub2) this).aClass350_489.anInt4088) * 323608093 + i_0_);
			int i_2_ = ((Class52_Sub2) this).aClass160_9160.method228();
			int i_3_ = ((Class52_Sub2) this).aClass160_9160.method2748();
			int i_4_ = ((Class52_Sub2) this).aClass160_9163.method228();
			int i_5_ = ((Class52_Sub2) this).aClass160_9163.method2748();
			((Class52_Sub2) this).aClass160_9160.method2752(i, (((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093 - i_3_) / 2 + i_0_);
			((Class52_Sub2) this).aClass160_9163.method2752((((Class52_Sub2) this).aClass350_489.anInt4093 * 329542577 + i - i_4_), (((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093 - i_5_) / 2 + i_0_);
			Class316.aClass505_3680.r(i, i_0_, i + (((Class52_Sub2) this).aClass350_489.anInt4093) * 329542577, i_0_ + ((Class52_Sub2) this).aClass160_9164.method2748());
			((Class52_Sub2) this).aClass160_9164.method2756(i + i_2_, i_0_, (((Class52_Sub2) this).aClass350_489.anInt4093 * 329542577 - i_2_ - i_4_), 323608093 * ((Class52_Sub2) this).aClass350_489.anInt4088);
			int i_6_ = ((Class52_Sub2) this).aClass160_9165.method2748();
			Class316.aClass505_3680.r(i, i_0_ + 323608093 * (((Class52_Sub2) this).aClass350_489.anInt4088) - i_6_, i + 329542577 * (((Class52_Sub2) this).aClass350_489.anInt4093), i_0_ + 323608093 * (((Class52_Sub2) this).aClass350_489.anInt4088));
			((Class52_Sub2) this).aClass160_9165.method2756(i + i_2_, (i_0_ + 323608093 * ((Class52_Sub2) this).aClass350_489.anInt4088 - i_6_), (329542577 * ((Class52_Sub2) this).aClass350_489.anInt4093 - i_2_ - i_4_), ((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093);
			Class316.aClass505_3680.r(is[0], is[1], is[2], is[3]);
		}
	}

	void method1077(boolean bool, int i, int i_7_, int i_8_) {
		int i_9_ = i + ((Class52_Sub2) this).aClass160_9160.method228();
		int i_10_ = (i + ((Class52_Sub2) this).aClass350_489.anInt4093 * 329542577 - ((Class52_Sub2) this).aClass160_9163.method228());
		int i_11_ = i_7_ + ((Class52_Sub2) this).aClass160_9164.method2748();
		int i_12_ = (((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093 + i_7_ - ((Class52_Sub2) this).aClass160_9165.method2748());
		int i_13_ = i_10_ - i_9_;
		int i_14_ = i_12_ - i_11_;
		int i_15_ = method1078(-2146755353) * i_13_ / 10000;
		int[] is = new int[4];
		Class316.aClass505_3680.qa(is);
		Class316.aClass505_3680.r(i_9_, i_11_, i_9_ + i_15_, i_12_);
		method14498(i_9_, i_11_, i_13_, i_14_, -1731136820);
		Class316.aClass505_3680.r(i_9_ + i_15_, i_11_, i_10_, i_12_);
		((Class52_Sub2) this).aClass160_9161.method2756(i_9_, i_11_, i_13_, i_14_);
		Class316.aClass505_3680.r(is[0], is[1], is[2], is[3]);
	}

	void method14498(int i, int i_16_, int i_17_, int i_18_, int i_19_) {
		((Class52_Sub2) this).aClass160_9162.method2756(i, i_16_, i_17_, i_18_);
	}

	Class52_Sub2(Index class317, Index class317_20_, Class350_Sub3 class350_sub3) {
		super(class317, class317_20_, (Class350) class350_sub3);
	}

	public void method15() {
		super.method22(1273546148);
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		((Class52_Sub2) this).aClass160_9162 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -1642545265 * class350_sub3.anInt7844, -1714686011);
		((Class52_Sub2) this).aClass160_9161 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -733628077 * class350_sub3.anInt7840, -1339795032);
		((Class52_Sub2) this).aClass160_9160 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7842 * -821287133, 430415140);
		((Class52_Sub2) this).aClass160_9163 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7843 * -2050274227, 1959437966);
		((Class52_Sub2) this).aClass160_9164 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7841 * -485291629, -472313791);
		((Class52_Sub2) this).aClass160_9165 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7845 * 657783501, 935956574);
	}

	public void method23() {
		super.method22(1273546148);
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		((Class52_Sub2) this).aClass160_9162 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -1642545265 * class350_sub3.anInt7844, -477197305);
		((Class52_Sub2) this).aClass160_9161 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -733628077 * class350_sub3.anInt7840, -1609543131);
		((Class52_Sub2) this).aClass160_9160 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7842 * -821287133, 835460859);
		((Class52_Sub2) this).aClass160_9163 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7843 * -2050274227, 1212027266);
		((Class52_Sub2) this).aClass160_9164 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7841 * -485291629, -264541487);
		((Class52_Sub2) this).aClass160_9165 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7845 * 657783501, -1858378373);
	}

	public void method16() {
		super.method22(1273546148);
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		((Class52_Sub2) this).aClass160_9162 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -1642545265 * class350_sub3.anInt7844, -1400576392);
		((Class52_Sub2) this).aClass160_9161 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -733628077 * class350_sub3.anInt7840, 1375081552);
		((Class52_Sub2) this).aClass160_9160 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7842 * -821287133, 1746479567);
		((Class52_Sub2) this).aClass160_9163 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7843 * -2050274227, 448035146);
		((Class52_Sub2) this).aClass160_9164 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7841 * -485291629, 1367989823);
		((Class52_Sub2) this).aClass160_9165 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7845 * 657783501, 301997484);
	}

	void method1076(boolean bool, int i, int i_21_) {
		if (bool) {
			int[] is = new int[4];
			Class316.aClass505_3680.qa(is);
			Class316.aClass505_3680.r(i, i_21_, i + (((Class52_Sub2) this).aClass350_489.anInt4093) * 329542577, (((Class52_Sub2) this).aClass350_489.anInt4088) * 323608093 + i_21_);
			int i_22_ = ((Class52_Sub2) this).aClass160_9160.method228();
			int i_23_ = ((Class52_Sub2) this).aClass160_9160.method2748();
			int i_24_ = ((Class52_Sub2) this).aClass160_9163.method228();
			int i_25_ = ((Class52_Sub2) this).aClass160_9163.method2748();
			((Class52_Sub2) this).aClass160_9160.method2752(i, (((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093 - i_23_) / 2 + i_21_);
			((Class52_Sub2) this).aClass160_9163.method2752((((Class52_Sub2) this).aClass350_489.anInt4093 * 329542577 + i - i_24_), (((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093 - i_25_) / 2 + i_21_);
			Class316.aClass505_3680.r(i, i_21_, i + ((Class52_Sub2) this).aClass350_489.anInt4093 * 329542577, i_21_ + ((Class52_Sub2) this).aClass160_9164.method2748());
			((Class52_Sub2) this).aClass160_9164.method2756(i + i_22_, i_21_, (((Class52_Sub2) this).aClass350_489.anInt4093 * 329542577 - i_22_ - i_24_), 323608093 * ((Class52_Sub2) this).aClass350_489.anInt4088);
			int i_26_ = ((Class52_Sub2) this).aClass160_9165.method2748();
			Class316.aClass505_3680.r(i, (i_21_ + 323608093 * ((Class52_Sub2) this).aClass350_489.anInt4088 - i_26_), i + 329542577 * ((Class52_Sub2) this).aClass350_489.anInt4093, i_21_ + (323608093 * ((Class52_Sub2) this).aClass350_489.anInt4088));
			((Class52_Sub2) this).aClass160_9165.method2756(i + i_22_, (i_21_ + 323608093 * ((Class52_Sub2) this).aClass350_489.anInt4088 - i_26_), (329542577 * ((Class52_Sub2) this).aClass350_489.anInt4093 - i_22_ - i_24_), ((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093);
			Class316.aClass505_3680.r(is[0], is[1], is[2], is[3]);
		}
	}

	public void method19() {
		super.method22(1273546148);
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		((Class52_Sub2) this).aClass160_9162 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -1642545265 * class350_sub3.anInt7844, 2007279420);
		((Class52_Sub2) this).aClass160_9161 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -733628077 * class350_sub3.anInt7840, 1043309008);
		((Class52_Sub2) this).aClass160_9160 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7842 * -821287133, 1438560126);
		((Class52_Sub2) this).aClass160_9163 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7843 * -2050274227, 2108411889);
		((Class52_Sub2) this).aClass160_9164 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7841 * -485291629, 2027705405);
		((Class52_Sub2) this).aClass160_9165 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7845 * 657783501, 444987892);
	}

	public boolean method13() {
		if (!super.method10(1930813381))
			return false;
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		if (!((Class52_Sub2) this).aClass317_493.method5661((-1642545265 * (class350_sub3.anInt7844)), 1005205431))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-733628077 * class350_sub3.anInt7840, 789152626))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(class350_sub3.anInt7842 * -821287133, 1630295405))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661((-2050274227 * (class350_sub3.anInt7843)), -1526435602))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-485291629 * class350_sub3.anInt7841, 2016829769))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(class350_sub3.anInt7845 * 657783501, 1881760678))
			return false;
		return true;
	}

	public boolean method9() {
		if (!super.method10(1478796819))
			return false;
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-1642545265 * class350_sub3.anInt7844, -56636433))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-733628077 * class350_sub3.anInt7840, -237372898))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(((class350_sub3.anInt7842) * -821287133), -2085500424))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661((-2050274227 * (class350_sub3.anInt7843)), -957823909))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-485291629 * class350_sub3.anInt7841, -531136957))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(class350_sub3.anInt7845 * 657783501, 79806119))
			return false;
		return true;
	}

	public boolean method10(int i) {
		if (!super.method10(1403976419))
			return false;
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		if (!((Class52_Sub2) this).aClass317_493.method5661((-1642545265 * (class350_sub3.anInt7844)), -412673067))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-733628077 * class350_sub3.anInt7840, 1252829307))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(class350_sub3.anInt7842 * -821287133, 321826067))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-2050274227 * class350_sub3.anInt7843, 432512941))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-485291629 * class350_sub3.anInt7841, 361051687))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(class350_sub3.anInt7845 * 657783501, -71925669))
			return false;
		return true;
	}

	public void method18() {
		super.method22(1273546148);
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		((Class52_Sub2) this).aClass160_9162 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -1642545265 * class350_sub3.anInt7844, -372136841);
		((Class52_Sub2) this).aClass160_9161 = Class152.method2600(((Class52_Sub2) this).aClass317_493, -733628077 * class350_sub3.anInt7840, 48908422);
		((Class52_Sub2) this).aClass160_9160 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7842 * -821287133, 1886724191);
		((Class52_Sub2) this).aClass160_9163 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7843 * -2050274227, 1059968166);
		((Class52_Sub2) this).aClass160_9164 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7841 * -485291629, -2070043181);
		((Class52_Sub2) this).aClass160_9165 = Class152.method2600(((Class52_Sub2) this).aClass317_493, class350_sub3.anInt7845 * 657783501, 65900346);
	}

	void method1080(boolean bool, int i, int i_27_) {
		int i_28_ = i + ((Class52_Sub2) this).aClass160_9160.method228();
		int i_29_ = (i + ((Class52_Sub2) this).aClass350_489.anInt4093 * 329542577 - ((Class52_Sub2) this).aClass160_9163.method228());
		int i_30_ = i_27_ + ((Class52_Sub2) this).aClass160_9164.method2748();
		int i_31_ = (((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093 + i_27_ - ((Class52_Sub2) this).aClass160_9165.method2748());
		int i_32_ = i_29_ - i_28_;
		int i_33_ = i_31_ - i_30_;
		int i_34_ = method1078(-2059160857) * i_32_ / 10000;
		int[] is = new int[4];
		Class316.aClass505_3680.qa(is);
		Class316.aClass505_3680.r(i_28_, i_30_, i_28_ + i_34_, i_31_);
		method14498(i_28_, i_30_, i_32_, i_33_, -1488513081);
		Class316.aClass505_3680.r(i_28_ + i_34_, i_30_, i_29_, i_31_);
		((Class52_Sub2) this).aClass160_9161.method2756(i_28_, i_30_, i_32_, i_33_);
		Class316.aClass505_3680.r(is[0], is[1], is[2], is[3]);
	}

	void method1075(boolean bool, int i, int i_35_) {
		int i_36_ = i + ((Class52_Sub2) this).aClass160_9160.method228();
		int i_37_ = (i + ((Class52_Sub2) this).aClass350_489.anInt4093 * 329542577 - ((Class52_Sub2) this).aClass160_9163.method228());
		int i_38_ = i_35_ + ((Class52_Sub2) this).aClass160_9164.method2748();
		int i_39_ = (((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093 + i_35_ - ((Class52_Sub2) this).aClass160_9165.method2748());
		int i_40_ = i_37_ - i_36_;
		int i_41_ = i_39_ - i_38_;
		int i_42_ = method1078(-1948623655) * i_40_ / 10000;
		int[] is = new int[4];
		Class316.aClass505_3680.qa(is);
		Class316.aClass505_3680.r(i_36_, i_38_, i_36_ + i_42_, i_39_);
		method14498(i_36_, i_38_, i_40_, i_41_, -661504276);
		Class316.aClass505_3680.r(i_36_ + i_42_, i_38_, i_37_, i_39_);
		((Class52_Sub2) this).aClass160_9161.method2756(i_36_, i_38_, i_40_, i_41_);
		Class316.aClass505_3680.r(is[0], is[1], is[2], is[3]);
	}

	void method1079(boolean bool, int i, int i_43_) {
		int i_44_ = i + ((Class52_Sub2) this).aClass160_9160.method228();
		int i_45_ = (i + ((Class52_Sub2) this).aClass350_489.anInt4093 * 329542577 - ((Class52_Sub2) this).aClass160_9163.method228());
		int i_46_ = i_43_ + ((Class52_Sub2) this).aClass160_9164.method2748();
		int i_47_ = (((Class52_Sub2) this).aClass350_489.anInt4088 * 323608093 + i_43_ - ((Class52_Sub2) this).aClass160_9165.method2748());
		int i_48_ = i_45_ - i_44_;
		int i_49_ = i_47_ - i_46_;
		int i_50_ = method1078(-2107780880) * i_48_ / 10000;
		int[] is = new int[4];
		Class316.aClass505_3680.qa(is);
		Class316.aClass505_3680.r(i_44_, i_46_, i_44_ + i_50_, i_47_);
		method14498(i_44_, i_46_, i_48_, i_49_, -525462947);
		Class316.aClass505_3680.r(i_44_ + i_50_, i_46_, i_45_, i_47_);
		((Class52_Sub2) this).aClass160_9161.method2756(i_44_, i_46_, i_48_, i_49_);
		Class316.aClass505_3680.r(is[0], is[1], is[2], is[3]);
	}

	public boolean method17() {
		if (!super.method10(1759362382))
			return false;
		Class350_Sub3 class350_sub3 = (Class350_Sub3) ((Class52_Sub2) this).aClass350_489;
		if (!((Class52_Sub2) this).aClass317_493.method5661((-1642545265 * (class350_sub3.anInt7844)), -1878319030))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661((-733628077 * (class350_sub3.anInt7840)), -1074614597))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(class350_sub3.anInt7842 * -821287133, -846878158))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661((-2050274227 * (class350_sub3.anInt7843)), 1472121701))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(-485291629 * class350_sub3.anInt7841, -921583943))
			return false;
		if (!((Class52_Sub2) this).aClass317_493.method5661(class350_sub3.anInt7845 * 657783501, -145692726))
			return false;
		return true;
	}

	void method14499(int i, int i_51_, int i_52_, int i_53_) {
		((Class52_Sub2) this).aClass160_9162.method2756(i, i_51_, i_52_, i_53_);
	}

	void method14500(int i, int i_54_, int i_55_, int i_56_) {
		((Class52_Sub2) this).aClass160_9162.method2756(i, i_54_, i_55_, i_56_);
	}

	public static void method14501(int i, int i_57_, int i_58_) {
		Class150.method2580(i, i_57_, (byte) -40);
	}
}
