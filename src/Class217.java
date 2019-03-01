public abstract class Class217 {

	int anInt2696;
	public int anInt2700;
	public int anInt2701;

	public boolean method3680(byte b_1) {
		return (this.anInt2700 & 0x1) != 0;
	}

	public boolean method3681(int i_1) {
		return (this.anInt2700 & 0x2) != 0;
	}

	public boolean method3682(short s_1) {
		return (this.anInt2700 & 0x4) != 0;
	}

	public boolean method3683(int i_1) {
		return (this.anInt2700 & 0x8) != 0;
	}

	public static void method3690(Index index_0, int i_1, int i_2, int i_3, boolean bool_4, Class282_Sub15_Sub2 class282_sub15_sub2_5, int i_6) {
		Class11.method13400(index_0, i_1, i_2, i_3, bool_4, (byte) -86);
		Class282_Sub33.aClass282_Sub15_Sub2_7836 = class282_sub15_sub2_5;
	}

	static final void method3691(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2 | i_3;
	}

	static final void method3692(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub13_8228.method12714(-1998684386);
	}

	static final void method3693(CS2Executor cs2executor_0, short s_1) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub24_8216, cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1 ? 2 : 0, 447619076);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -59);
		Class190.savePreferences((byte) 121);
		client.aBool7175 = false;
	}

	public static Class282_Sub53_Sub1 method3694(int i_0, int i_1, int i_2, int i_3, int i_4) {
		Class282_Sub53_Sub1[] arr_5 = Class282_Sub53_Sub1.aClass282_Sub53_Sub1Array9497;
		synchronized (Class282_Sub53_Sub1.aClass282_Sub53_Sub1Array9497) {
			Class282_Sub53_Sub1 class282_sub53_sub1_6;
			if (Class81.anInt803 == 0) {
				class282_sub53_sub1_6 = new Class282_Sub53_Sub1();
			} else {
				class282_sub53_sub1_6 = Class282_Sub53_Sub1.aClass282_Sub53_Sub1Array9497[--Class81.anInt803];
			}

			class282_sub53_sub1_6.anInt9516 = i_0;
			class282_sub53_sub1_6.anInt9517 = i_1;
			class282_sub53_sub1_6.anInt9513 = i_2;
			class282_sub53_sub1_6.anInt9514 = i_3;
			class282_sub53_sub1_6.aLong9515 = Class169.time();
			return class282_sub53_sub1_6;
		}
	}

}
