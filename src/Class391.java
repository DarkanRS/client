public class Class391 {

	static NativeSprite[] aClass160Array4778;

	Class391() throws Throwable {
		throw new Error();
	}

	static final void method6733(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2, (byte) -1);
		String str_4 = "";
		if (chatline_3 != null && chatline_3.clan != null) {
			str_4 = chatline_3.clan;
		}

		cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = str_4;
	}

	static final void method6734(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = ((NPC) cs2executor_0.animable).aClass153_10579.method2609(i_2, (byte) 106);
	}

}
