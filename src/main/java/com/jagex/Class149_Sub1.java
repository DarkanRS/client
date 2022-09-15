package com.jagex;

public class Class149_Sub1 extends Class149 {

	public static void method14584(int i_0, int i_1, int i_2, int i_3, int i_4) {
		if (i_3 == i_2)
			UpdateZonePacket.method6292(i_0, i_1, i_2, i_4);
		else if (i_0 - i_2 >= Class532.anInt7071 && i_0 + i_2 <= Class532.anInt7069 && i_1 - i_3 >= Class532.anInt7070 && i_3 + i_1 <= Class532.anInt7068)
			InputSubscriberType.method3751(i_0, i_1, i_2, i_3, i_4);
		else
			Node_Sub17_Sub3.method15405(i_0, i_1, i_2, i_3, i_4);

	}
	int anInt9274;
	int anInt9273;
	int anInt9276;

	int anInt9275;

	Class149_Sub1(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		super(i_5, i_6, i_7);
		anInt9274 = i_1;
		anInt9273 = i_2;
		anInt9276 = i_3;
		anInt9275 = i_4;
	}

	@Override
	void method2555(int i_1, int i_2) {
	}

	@Override
	void method2556(int i_1, int i_2) {
		int i_4 = anInt9274 * i_1 >> 12;
		int i_5 = anInt9276 * i_1 >> 12;
		int i_6 = i_2 * anInt9273 >> 12;
		int i_7 = i_2 * anInt9275 >> 12;
		method14584(i_4, i_6, i_5, i_7, anInt1743);
	}

	@Override
	void method2557(int i_1, int i_2) {
		int i_4 = anInt9274 * i_1 >> 12;
		int i_5 = anInt9276 * i_1 >> 12;
		int i_6 = i_2 * anInt9273 >> 12;
		int i_7 = i_2 * anInt9275 >> 12;
		Class299.method5316(i_4, i_6, i_5, i_7, anInt1743, anInt1741, anInt1742);
	}

	@Override
	void method2558(int i_1, int i_2) {
		int i_3 = anInt9274 * 177644823 * 1801773735 * i_1 >> 12;
		int i_4 = anInt9276 * 265384201 * 731213113 * i_1 >> 12;
		int i_5 = i_2 * -1269720619 * anInt9273 * 1360975741 >> 12;
		int i_6 = i_2 * 1736404795 * anInt9275 * -1651797517 >> 12;
		method14584(i_3, i_5, i_4, i_6, anInt1743 * 440863295 * 1340859839);
	}

	@Override
	void method2559(int i_1, int i_2) {
	}

	@Override
	void method2560(int i_1, int i_2) {
		int i_3 = anInt9274 * 177644823 * 1801773735 * i_1 >> 12;
		int i_4 = anInt9276 * 265384201 * 731213113 * i_1 >> 12;
		int i_5 = i_2 * -1269720619 * anInt9273 * 1360975741 >> 12;
		int i_6 = i_2 * 1736404795 * anInt9275 * -1651797517 >> 12;
		method14584(i_3, i_5, i_4, i_6, anInt1743 * 440863295 * 1340859839);
	}

	@Override
	void method2561(int i_1, int i_2) {
	}

	@Override
	void method2562(int i_1, int i_2) {
		int i_3 = anInt9274 * 177644823 * 1801773735 * i_1 >> 12;
		int i_4 = anInt9276 * 265384201 * 731213113 * i_1 >> 12;
		int i_5 = -1269720619 * anInt9273 * 1360975741 * i_2 >> 12;
		int i_6 = i_2 * 1736404795 * anInt9275 * -1651797517 >> 12;
		Class299.method5316(i_3, i_5, i_4, i_6, anInt1743 * 440863295 * 1340859839, -1525176857 * anInt1741 * -1378640425, -1125689331 * anInt1742 * 383825605);
	}

}
