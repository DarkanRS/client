public class Class146 {

	int anInt1716 = 0;
	int anInt1717 = 0;
	int anInt1718 = 0;
	OpenGLGraphicalRenderer aClass505_Sub1_1719;
	Class136 aClass136_1720;
	Class141[] aClass141Array1721;
	Class141_Sub4 aClass141_Sub4_1715;

	void method2462(int i_1, int i_2, int i_3, boolean bool_4, boolean bool_5) {
		bool_5 &= this.aClass505_Sub1_1719.method13704();
		if (!bool_5 && (i_1 == 4 || i_1 == 8 || i_1 == 9)) {
			if (i_1 == 4) {
				i_3 = i_2;
			}

			i_1 = 2;
		}

		if (i_1 != 0 && bool_4) {
			i_1 |= ~0x7fffffff;
		}

		if (this.anInt1718 != i_1) {
			if (this.anInt1718 != 0) {
				this.aClass141Array1721[this.anInt1718 & 0x7fffffff].method2398();
			}

			if (i_1 != 0) {
				this.aClass141Array1721[i_1 & 0x7fffffff].method2397(bool_4);
				this.aClass141Array1721[i_1 & 0x7fffffff].method2408(bool_4);
				this.aClass141Array1721[i_1 & 0x7fffffff].method2399(i_2, i_3);
			}

			this.anInt1718 = i_1;
			this.anInt1716 = i_2;
			this.anInt1717 = i_3;
		} else if (this.anInt1718 != 0) {
			this.aClass141Array1721[this.anInt1718 & 0x7fffffff].method2408(bool_4);
			if (i_2 != this.anInt1716 || i_3 != this.anInt1717) {
				this.aClass141Array1721[this.anInt1718 & 0x7fffffff].method2399(i_2, i_3);
				this.anInt1716 = i_2;
				this.anInt1717 = i_3;
			}
		}

	}

	boolean method2463(Class137 class137_1, int i_2) {
		if (this.anInt1718 == 0) {
			return false;
		} else {
			this.aClass141Array1721[this.anInt1718 & 0x7fffffff].method2400(class137_1, i_2);
			return true;
		}
	}

	boolean method2465(int i_1) {
		return this.aClass141Array1721[i_1].method2395();
	}

	Class146(OpenGLGraphicalRenderer class505_sub1_1) {
		this.aClass505_Sub1_1719 = class505_sub1_1;
		this.aClass136_1720 = new Class136(class505_sub1_1);
		this.aClass141Array1721 = new Class141[16];
		this.aClass141Array1721[1] = new Class141_Sub1(class505_sub1_1);
		this.aClass141Array1721[2] = new Class141_Sub9(class505_sub1_1, this.aClass136_1720);
		this.aClass141Array1721[4] = new Class141_Sub3(class505_sub1_1, this.aClass136_1720);
		this.aClass141Array1721[5] = new Class141_Sub5(class505_sub1_1, this.aClass136_1720);
		this.aClass141Array1721[6] = new Class141_Sub6(class505_sub1_1);
		this.aClass141Array1721[7] = new Class141_Sub7(class505_sub1_1);
		this.aClass141Array1721[3] = this.aClass141_Sub4_1715 = new Class141_Sub4(class505_sub1_1);
		this.aClass141Array1721[8] = new Class141_Sub2(class505_sub1_1, this.aClass136_1720);
		this.aClass141Array1721[9] = new Class141_Sub8(class505_sub1_1, this.aClass136_1720);
		if (!this.aClass141Array1721[8].method2395()) {
			this.aClass141Array1721[8] = this.aClass141Array1721[4];
		}

		if (!this.aClass141Array1721[9].method2395()) {
			this.aClass141Array1721[9] = this.aClass141Array1721[8];
		}

	}

}
