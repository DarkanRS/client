public class Class149_Sub1 extends Class149 {

	int anInt9274;
	int anInt9273;
	int anInt9276;
	int anInt9275;

	void method2559(int i_1, int i_2) {
	}

	void method2561(int i_1, int i_2) {
	}

	void method2556(int i_1, int i_2) {
		int i_4 = this.anInt9274 * i_1 >> 12;
		int i_5 = this.anInt9276 * i_1 >> 12;
		int i_6 = i_2 * this.anInt9273 >> 12;
		int i_7 = i_2 * this.anInt9275 >> 12;
		method14584(i_4, i_6, i_5, i_7, this.anInt1743, (short) -27335);
	}

	void method2560(int i_1, int i_2) {
		int i_3 = this.anInt9274 * 177644823 * 1801773735 * i_1 >> 12;
		int i_4 = this.anInt9276 * 265384201 * 731213113 * i_1 >> 12;
		int i_5 = i_2 * -1269720619 * this.anInt9273 * 1360975741 >> 12;
		int i_6 = i_2 * 1736404795 * this.anInt9275 * -1651797517 >> 12;
		method14584(i_3, i_5, i_4, i_6, this.anInt1743 * 440863295 * 1340859839, (short) -5794);
	}

	void method2555(int i_1, int i_2) {
	}

	void method2557(int i_1, int i_2) {
		int i_4 = this.anInt9274 * i_1 >> 12;
		int i_5 = this.anInt9276 * i_1 >> 12;
		int i_6 = i_2 * this.anInt9273 >> 12;
		int i_7 = i_2 * this.anInt9275 >> 12;
		Class299.method5316(i_4, i_6, i_5, i_7, this.anInt1743, this.anInt1741, this.anInt1742, (short) 15863);
	}

	void method2558(int i_1, int i_2) {
		int i_3 = this.anInt9274 * 177644823 * 1801773735 * i_1 >> 12;
		int i_4 = this.anInt9276 * 265384201 * 731213113 * i_1 >> 12;
		int i_5 = i_2 * -1269720619 * this.anInt9273 * 1360975741 >> 12;
		int i_6 = i_2 * 1736404795 * this.anInt9275 * -1651797517 >> 12;
		method14584(i_3, i_5, i_4, i_6, this.anInt1743 * 440863295 * 1340859839, (short) -3087);
	}

	Class149_Sub1(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		super(i_5, i_6, i_7);
		this.anInt9274 = i_1;
		this.anInt9273 = i_2;
		this.anInt9276 = i_3;
		this.anInt9275 = i_4;
	}

	void method2562(int i_1, int i_2) {
		int i_3 = this.anInt9274 * 177644823 * 1801773735 * i_1 >> 12;
		int i_4 = this.anInt9276 * 265384201 * 731213113 * i_1 >> 12;
		int i_5 = -1269720619 * this.anInt9273 * 1360975741 * i_2 >> 12;
		int i_6 = i_2 * 1736404795 * this.anInt9275 * -1651797517 >> 12;
		Class299.method5316(i_3, i_5, i_4, i_6, this.anInt1743 * 440863295 * 1340859839, -1525176857 * this.anInt1741 * -1378640425, -1125689331 * this.anInt1742 * 383825605, (short) 16743);
	}

	public static void method14582(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(5, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) -51);
	}

	public static void method14584(int i_0, int i_1, int i_2, int i_3, int i_4, short s_5) {
		if (i_3 == i_2) {
			TilestreamPacket.method6292(i_0, i_1, i_2, i_4);
		} else if (i_0 - i_2 >= Class532_Sub3_Sub1.anInt7071 && i_0 + i_2 <= Class532_Sub3_Sub1.anInt7069 && i_1 - i_3 >= Class532_Sub3_Sub1.anInt7070 && i_3 + i_1 <= Class532_Sub3_Sub1.anInt7068) {
			InputSubscriberType.method3751(i_0, i_1, i_2, i_3, i_4);
		} else {
			Class282_Sub17_Sub3.method15405(i_0, i_1, i_2, i_3, i_4);
		}

	}

}
