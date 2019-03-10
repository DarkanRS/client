public class Class221 {

	public static int anInt2762;
	static IComponentDefinitions aClass118_2763;
	static Class221 aClass221_2759 = new Class221(0);
	static Class221 aClass221_2761 = new Class221(1);
	static Class221 aClass221_2760 = new Class221(2);
	int anInt2758;

	Class221(int i_1) {
		this.anInt2758 = i_1;
	}

	static final void method3747(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		Long long_3 = (Long) Class46.CLAN_VARS[i_2];
		if (long_3 == null) {
			cs2executor_0.longStack[++cs2executor_0.longStackPtr - 1] = -1L;
		} else {
			cs2executor_0.longStack[++cs2executor_0.longStackPtr - 1] = long_3.longValue();
		}

	}

	static final void method3748(CS2Executor cs2executor_0, int i_1) {
		if (client.aString7165 != null) {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = client.aString7165;
		} else {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = "";
		}

	}

	static final void method3749(CS2Executor cs2executor_0, int i_1) {
		--cs2executor_0.intStackPtr;
	}

	static final void method3750(CS2Executor cs2executor_0, byte b_1) {
		Class393.preferences.setValue(Class393.preferences.idleAnimations, cs2executor_0.intStack[--cs2executor_0.intStackPtr], 1688733645);
		Class190.savePreferences((byte) 79);
	}

	static void method3751(int i_0, int i_1, int i_2, int i_3, int i_4, byte b_5) {
		int i_6 = 0;
		int i_7 = i_3;
		int i_8 = i_2 * i_2;
		int i_9 = i_3 * i_3;
		int i_10 = i_9 << 1;
		int i_11 = i_8 << 1;
		int i_12 = i_3 << 1;
		int i_13 = i_10 + (1 - i_12) * i_8;
		int i_14 = i_9 - i_11 * (i_12 - 1);
		int i_15 = i_8 << 2;
		int i_16 = i_9 << 2;
		int i_17 = ((i_6 << 1) + 3) * i_10;
		int i_18 = ((i_3 << 1) - 3) * i_11;
		int i_19 = i_16 * (i_6 + 1);
		int i_20 = i_15 * (i_3 - 1);
		Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_1], i_0 - i_2, i_0 + i_2, i_4, (byte) 72);

		while (i_7 > 0) {
			if (i_13 < 0) {
				while (i_13 < 0) {
					i_13 += i_17;
					i_14 += i_19;
					i_17 += i_16;
					i_19 += i_16;
					++i_6;
				}
			}

			if (i_14 < 0) {
				i_13 += i_17;
				i_14 += i_19;
				i_17 += i_16;
				i_19 += i_16;
				++i_6;
			}

			i_13 += -i_20;
			i_14 += -i_18;
			i_18 -= i_15;
			i_20 -= i_15;
			--i_7;
			int i_21 = i_1 - i_7;
			int i_22 = i_7 + i_1;
			int i_23 = i_0 + i_6;
			int i_24 = i_0 - i_6;
			Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_21], i_24, i_23, i_4, (byte) 0);
			Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_22], i_24, i_23, i_4, (byte) 13);
		}

	}

	static final void method3752(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7178;
	}

}
