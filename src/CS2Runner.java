import java.util.ArrayList;

public final class CS2Runner {

	static int anInt5904 = 0;
	static int[] anIntArray5900 = new int[3];
	public static SoftCache aClass229_5901 = new SoftCache(4);
	static boolean aBool5898 = false;
	static String aString5897 = null;
	static ArrayList CS2_EXECUTORS = new ArrayList();
	static int CURRENT_CS2_EXEC_IDX = 0;
	static int anInt5906 = 0;

	CS2Runner() throws Throwable {
		throw new Error();
	}

	static final void method11125(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1311;
	}

	static final void method11126(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 97);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class82.method1455(icomponentdefinitions_3, interface_4, cs2executor_0, -1784890209);
	}

	static ItemContainer getItemContainer(int key, boolean negativeKey) {
		long longKey = (long) (key | (negativeKey ? Integer.MIN_VALUE : 0));
		return (ItemContainer) ItemContainer.CONTAINER_MAP.get(longKey);
	}

	static final void method11128(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		Class96_Sub10.method14603(2, i_2 << 16 | i_3, i_4, "", (byte) 10);
	}

}
