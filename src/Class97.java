public final class Class97 {

	static long aLong993;
	static long aLong994;
	protected static Class440[] aClass440Array996;

	Class97() throws Throwable {
		throw new Error();
	}

	public static boolean loggedOutState(int i_0, int i_1) {
		return i_0 == 5 || i_0 == 11 || i_0 == 14 || i_0 == 19 || i_0 == 3 || i_0 == 8 || i_0 == 9;
	}

	static final void method1613(CS2Executor cs2executor_0) {
		cs2executor_0.intStackPtr -= 4;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		int i_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 3];
		i_2 += i_3 << 14;
		i_2 += i_4 << 28;
		i_2 += i_5;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2;
	}

	static Class222 method1614(RsByteBuffer rsbytebuffer_0, int i_1) {
		int i_2 = rsbytebuffer_0.readUnsignedByte();
		int i_3 = rsbytebuffer_0.readUnsignedByte();
		return new Class222(i_2, i_3);
	}

}
