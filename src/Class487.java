public class Class487 {

	public static Class378 aClass378_5752;

	Class487() throws Throwable {
		throw new Error();
	}

	static final void method8208(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 70);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class504.method8387(icomponentdefinitions_3, interface_4, cs2executor_0, 1918613827);
	}

	static void method8209(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5, byte b_6) {
		if ((Class354.aClass160_4110 == null || AttributeDefault.aClass160_5339 == null || Class125.aClass160_1571 == null) && IndexLoaders.SPRITES_INDEX.method5661(Class254.anInt3145, -635610932) && IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396, -688613423) && IndexLoaders.SPRITES_INDEX.method5661(Class17.anInt148, 1307952066)) {
			Class91 class91_10 = Class91.method1522(IndexLoaders.SPRITES_INDEX, Class446.anInt5396, 0);
			AttributeDefault.aClass160_5339 = graphicalrenderer_0.method8444(class91_10, true);
			class91_10.method1525();
			Class290.aClass160_3452 = graphicalrenderer_0.method8444(class91_10, true);
			Class354.aClass160_4110 = graphicalrenderer_0.method8444(Class91.method1522(IndexLoaders.SPRITES_INDEX, Class254.anInt3145, 0), true);
			Class91 class91_11 = Class91.method1522(IndexLoaders.SPRITES_INDEX, Class17.anInt148, 0);
			Class125.aClass160_1571 = graphicalrenderer_0.method8444(class91_11, true);
			class91_11.method1525();
			Class149_Sub2.aClass160_9315 = graphicalrenderer_0.method8444(class91_11, true);
		}

		if (Class354.aClass160_4110 != null && AttributeDefault.aClass160_5339 != null && Class125.aClass160_1571 != null) {
			int i_7 = (i_3 - Class125.aClass160_1571.method2747() * 2) / Class354.aClass160_4110.method2747();

			int i_8;
			for (i_8 = 0; i_8 < i_7; i_8++) {
				Class354.aClass160_4110.method2752(i_1 + Class125.aClass160_1571.method2747() + i_8 * Class354.aClass160_4110.method2747(), i_2 + i_4 - Class354.aClass160_4110.method2793());
			}

			i_8 = (i_4 - i_5 - Class125.aClass160_1571.method2793()) / AttributeDefault.aClass160_5339.method2793();

			for (int i_9 = 0; i_9 < i_8; i_9++) {
				AttributeDefault.aClass160_5339.method2752(i_1, i_5 + i_2 + i_9 * AttributeDefault.aClass160_5339.method2793());
				Class290.aClass160_3452.method2752(i_3 + i_1 - Class290.aClass160_3452.method2747(), i_5 + i_2 + i_9 * AttributeDefault.aClass160_5339.method2793());
			}

			Class125.aClass160_1571.method2752(i_1, i_2 + i_4 - Class125.aClass160_1571.method2793());
			Class149_Sub2.aClass160_9315.method2752(i_3 + i_1 - Class125.aClass160_1571.method2747(), i_2 + i_4 - Class125.aClass160_1571.method2793());
		}

	}

}
