public class Class310 {

	Class310() throws Throwable {
		throw new Error();
	}

	static final void method5494(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		if (i_2 == 0) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		} else if (i_3 == 0) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Integer.MAX_VALUE;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = (int) Math.pow((double) i_2, 1.0D / (double) i_3);
		}

	}

}
