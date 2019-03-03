import java.util.Random;

public class Class476 {

	long aLong5627;
	int[] anIntArray5626;
	short[] aShortArray5628;
	short[] aShortArray5625;

	public Class476(long long_1, int[] ints_3, short[] shorts_4, short[] shorts_5) {
		this.aLong5627 = long_1;
		this.anIntArray5626 = ints_3;
		this.aShortArray5628 = shorts_4;
		this.aShortArray5625 = shorts_5;
	}

	static final void method7929(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class13.method506(icomponentdefinitions_3, interface_4, cs2executor_0, -1252434200);
	}

	static final void method7930(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 18);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1301;
	}

	public static int method7931(Random random_0, int i_1, int i_2) {
		if (i_1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Class96_Sub9.method14585(i_1, 1942118537)) {
			return (int) (((long) random_0.nextInt() & 0xffffffffL) * (long) i_1 >> 32);
		} else {
			int i_3 = Integer.MIN_VALUE - (int) (4294967296L % (long) i_1);

			int i_4;
			do {
				i_4 = random_0.nextInt();
			} while (i_4 >= i_3);

			return Class302.method5360(i_4, i_1, -120645567);
		}
	}

	static final void method7932(CS2Executor cs2executor_0, byte b_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (string_2.startsWith(Class76.getCrown(0)) || string_2.startsWith(Class76.getCrown(1))) {
			string_2 = string_2.substring(7);
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class249.method4282(string_2, (byte) 0) ? 1 : 0;
	}

	static final void method7933(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class159.method2741(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 5);
	}

}
