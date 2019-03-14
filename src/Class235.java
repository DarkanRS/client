import java.util.List;

public class Class235 {

	static List aList2896;

	static Particle[] aClass275_Sub1_Sub1_Sub1Array2897;

	static int anInt2902 = 0;

	static int anInt2905 = 0;

	static int anInt2899 = 0;

	static int anInt2901 = 0;

	static int anInt2900 = 0;

	static int anInt2903 = 0;

	static IterableNodeMap aClass465_2904 = new IterableNodeMap(8);

	static int anInt2898 = 0;

	static int anInt2906 = 2;

	Class235() throws Throwable {
		throw new Error();
	}

	static final void method3965(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		FontMetrics fontmetrics_3 = icomponentdefinitions_0.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_5 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_6 = fontmetrics_3.method6956(icomponentdefinitions_0.text, icomponentdefinitions_0.anInt1301, icomponentdefinitions_0.anInt1358, i_5, i_4, Class182.aClass160Array2261, 1449374266);
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = i_6;
	}

	static int method3967(int i_0, int i_1, int i_2) {
		return i_0 != SceneObjectType.WALL_DIAGONAL_CORNER.type && i_0 != SceneObjectType.WALL_STRAIGHT_CORNER.type ? Class521_Sub1_Sub5_Sub1.anIntArray10522[i_1 & 0x3] : Class521_Sub1_Sub5_Sub1.anIntArray10518[i_1 & 0x3];
	}
}
