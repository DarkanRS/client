package com.rs.jagex;

public class Class146 {

	int anInt1716;
	int anInt1717;
	int anInt1718;
	OpenGLRenderer aGraphicalRenderer_Sub1_1719;
	Class136 aClass136_1720;
	Class141[] aClass141Array1721;
	Class141_Sub4 aClass141_Sub4_1715;

	Class146(OpenGLRenderer class505_sub1_1) {
		aGraphicalRenderer_Sub1_1719 = class505_sub1_1;
		aClass136_1720 = new Class136(class505_sub1_1);
		aClass141Array1721 = new Class141[16];
		aClass141Array1721[1] = new Class141_Sub1(class505_sub1_1);
		aClass141Array1721[2] = new Class141_Sub9(class505_sub1_1, aClass136_1720);
		aClass141Array1721[4] = new Class141_Sub3(class505_sub1_1, aClass136_1720);
		aClass141Array1721[5] = new Class141_Sub5(class505_sub1_1, aClass136_1720);
		aClass141Array1721[6] = new Class141_Sub6(class505_sub1_1);
		aClass141Array1721[7] = new Class141_Sub7(class505_sub1_1);
		aClass141Array1721[3] = aClass141_Sub4_1715 = new Class141_Sub4(class505_sub1_1);
		aClass141Array1721[8] = new Class141_Sub2(class505_sub1_1, aClass136_1720);
		aClass141Array1721[9] = new Class141_Sub8(class505_sub1_1, aClass136_1720);
		if (!aClass141Array1721[8].method2395())
			aClass141Array1721[8] = aClass141Array1721[4];

		if (!aClass141Array1721[9].method2395())
			aClass141Array1721[9] = aClass141Array1721[8];

	}

	void method2462(int i_1, int i_2, int i_3, boolean bool_4, boolean bool_5) {
		int i_31 = i_3;
		int i_11 = i_1;
		bool_5 &= aGraphicalRenderer_Sub1_1719.method13704();
		if (!bool_5 && (i_11 == 4 || i_11 == 8 || i_11 == 9)) {
			if (i_11 == 4)
				i_31 = i_2;

			i_11 = 2;
		}

		if (i_11 != 0 && bool_4)
			i_11 |= -2147483648;

		if (anInt1718 != i_11) {
			if (anInt1718 != 0)
				aClass141Array1721[anInt1718 & 0x7fffffff].method2398();

			if (i_11 != 0) {
				aClass141Array1721[i_11 & 0x7fffffff].method2397(bool_4);
				aClass141Array1721[i_11 & 0x7fffffff].method2408();
				aClass141Array1721[i_11 & 0x7fffffff].method2399(i_2, i_31);
			}

			anInt1718 = i_11;
			anInt1716 = i_2;
			anInt1717 = i_31;
		} else if (anInt1718 != 0) {
			aClass141Array1721[anInt1718 & 0x7fffffff].method2408();
			if (i_2 != anInt1716 || i_31 != anInt1717) {
				aClass141Array1721[anInt1718 & 0x7fffffff].method2399(i_2, i_31);
				anInt1716 = i_2;
				anInt1717 = i_31;
			}
		}

	}

	boolean method2463(GLTexture class137_1, int i_2) {
		if (anInt1718 == 0)
			return false;
		aClass141Array1721[anInt1718 & 0x7fffffff].method2400(class137_1, i_2);
		return true;
	}

	boolean method2465() {
		return aClass141Array1721[3].method2395();
	}

}
