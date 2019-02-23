public final class Class224 {

	static Class225_Sub1 aClass225_Sub1_2776 = new Class225_Sub1();
	static Class225_Sub6 aClass225_Sub6_2774 = new Class225_Sub6();
	static Class225_Sub3 aClass225_Sub3_2773 = new Class225_Sub3();
	static Class225_Sub2 aClass225_Sub2_2778 = new Class225_Sub2();
	static Class225_Sub4 aClass225_Sub4_2777 = new Class225_Sub4();
	static Class225_Sub5 aClass225_Sub5_2775 = new Class225_Sub5();

	Class224() throws Throwable {
		throw new Error();
	}

	static final void method3779(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = cs2executor_0.aClass61_7010.aStringArray617[i_2];
	}

	static final void method3780(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		Class282_Sub50_Sub14 class282_sub50_sub14_4 = IndexLoaders.QUICK_CHAT_INDEX_LOADER.method5918(i_2, -2049190154);
		int i_5 = class282_sub50_sub14_4.anIntArray9746[i_3];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_5;
	}

	static final void method3781(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method12774((byte) -14) ? 1 : 0;
	}

	public static void method3782(CacheableNode cacheablenode_0, CacheableNode cacheablenode_1, int i_2) {
		if (cacheablenode_0.current != null) {
			cacheablenode_0.method13452();
		}

		cacheablenode_0.current = cacheablenode_1;
		cacheablenode_0.aClass282_Sub50_8119 = cacheablenode_1.aClass282_Sub50_8119;
		cacheablenode_0.current.aClass282_Sub50_8119 = cacheablenode_0;
		cacheablenode_0.aClass282_Sub50_8119.current = cacheablenode_0;
	}

	static final void method3783(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2, (byte) -1);
		int i_4 = -1;
		if (chatline_3 != null) {
			i_4 = chatline_3.anInt1091;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_4;
	}

	public static Class366 method3784(RsByteBuffer rsbytebuffer_0, int i_1) {
		int i_2 = rsbytebuffer_0.readInt();
		return new Class366(i_2);
	}

}
