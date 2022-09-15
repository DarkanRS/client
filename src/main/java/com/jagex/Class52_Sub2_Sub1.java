package com.jagex;

public class Class52_Sub2_Sub1 extends Class52_Sub2 {

	static Class104[] method15631() {
		return new Class104[]{Class104.aClass104_1062, Class104.aClass104_1061, Class104.aClass104_1060};
	}

	Class52_Sub2_Sub1(Index index_1, Index index_2, Class350_Sub3_Sub1 class350_sub3_sub1_3) {
		super(index_1, index_2, class350_sub3_sub1_3);
	}

	@Override
	void method14498(int i_1, int i_2, int i_3, int i_4) {
		int i_6 = aNativeSprite_9162.scaleWidth();
		int i_7 = ((Class350_Sub3_Sub1) aClass350_489).anInt10160 * CS2ReturnValue.method8740() / 10 % i_6;
		aNativeSprite_9162.method2756(i_7 + (i_1 - i_6), i_2, i_3 + i_6 - i_7, i_4);
	}

}
