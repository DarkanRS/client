package com.jagex;
public abstract class Class273 {

	final int method4842(long long_1) {
		long long_3 = this.method4844();
		if (long_3 > 0L) {
			Class89.sleep(long_3);
		}
		return this.method4845(long_1);
	}

	abstract long method4844();

	abstract int method4845(long var1);

	abstract long method4846();

	abstract void method4847();

	abstract void method4848();

	abstract void method4849();

	abstract long method4851();

	abstract long method4852();

	abstract void method4853();

	abstract int method4854(long var1);

	abstract void method4855();

	abstract long method4856();

	abstract long method4857();

	abstract long method4861();

	abstract int method4862(long var1);

	static final void method4866(int i_0, int i_1, int i_2, int i_3) {
		int i_5 = 0;
		int i_6 = i_2;
		int i_7 = -i_2;
		int i_8 = -1;
		int i_9 = EntityNode.method4890(i_0 + i_2, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 1924648188);
		int i_10 = EntityNode.method4890(i_0 - i_2, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -788658237);
		KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_1], i_10, i_9, i_3, (byte) 93);
		while (i_6 > i_5) {
			i_8 += 2;
			i_7 += i_8;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			if (i_7 > 0) {
				--i_6;
				i_7 -= i_6 << 1;
				i_11 = i_1 - i_6;
				i_12 = i_6 + i_1;
				if (i_12 >= Class532_Sub3.anInt7070 && i_11 <= Class532_Sub3.anInt7068) {
					i_13 = EntityNode.method4890(i_0 + i_5, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 1327047739);
					i_14 = EntityNode.method4890(i_0 - i_5, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -517752975);
					if (i_12 <= Class532_Sub3.anInt7068) {
						KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_12], i_14, i_13, i_3, (byte) 2);
					}
					if (i_11 >= Class532_Sub3.anInt7070) {
						KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_11], i_14, i_13, i_3, (byte) 33);
					}
				}
			}
			++i_5;
			i_11 = i_1 - i_5;
			i_12 = i_5 + i_1;
			if (i_12 >= Class532_Sub3.anInt7070 && i_11 <= Class532_Sub3.anInt7068) {
				i_13 = EntityNode.method4890(i_0 + i_6, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 791943703);
				i_14 = EntityNode.method4890(i_0 - i_6, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -428444970);
				if (i_12 <= Class532_Sub3.anInt7068) {
					KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_12], i_14, i_13, i_3, (byte) 8);
				}
				if (i_11 >= Class532_Sub3.anInt7070) {
					KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_11], i_14, i_13, i_3, (byte) 60);
				}
			}
		}
	}
}
