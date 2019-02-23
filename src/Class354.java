public final class Class354 {

	public static NativeSprite aClass160_4110;
	static Class213[] aClass213Array4111;
	public static int anInt4112;
	Object anObject4109;
	int anInt4108;

	Class354(Object object_1, int i_2) {
		this.anObject4109 = object_1;
		this.anInt4108 = i_2;
	}

	static final void method6212(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 87);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1320;
	}

	static final void method6213(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = (i_2 & 1 << i_3) != 0 ? 1 : 0;
	}

	public static int method6214(int i_0, int i_1, int i_2, int i_3) {
		i_2 &= 0x3;
		return i_2 == 0 ? i_1 : (i_2 == 1 ? 4095 - i_0 : (i_2 == 2 ? 4095 - i_1 : i_0));
	}

	static void method6215(byte b_0) {
		SoftCache softcache_1 = Class13.aClass229_127;
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3863(1545219371);
		}
	}

	static void method6216(GraphicalRenderer graphicalrenderer_0, int i_1) {
		if (!Class20.aBool187) {
			Class277.method4908(graphicalrenderer_0, 1349821918);
		} else {
			Class38.method857(graphicalrenderer_0, -1937681851);
		}

	}

}
