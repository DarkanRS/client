public abstract class JS5FileWorker {

	abstract ReferenceTable getReferenceTable(int var1);

	abstract byte[] method5804(int var1, int var2);

	abstract void method5805(int var1, int var2);

	abstract int method5806(int var1, byte var2);

	abstract ReferenceTable method5807();

	abstract void method5808(int var1);

	abstract byte[] method5809(int var1);

	abstract int method5810(int var1);

	abstract byte[] method5811(int var1);

	abstract void method5812(int var1);

	abstract byte[] method5813(int var1);

	static final void method5814(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		UnderlayDefinition underlaydefinition_4;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_4 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_4 = cs2executor_0.aClass513_7007;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = underlaydefinition_4.method8766(cs2executor_0.animable.inter, i_2, i_3, (byte) 1) ? 1 : 0;
	}

	static Class221[] method5815(int i_0) {
		return new Class221[] { Class221.aClass221_2760, Class221.aClass221_2761, Class221.aClass221_2759 };
	}

	static final void method5816(CS2Executor cs2executor_0, int i_1) {
		Class274.method4884((byte) 13);
	}

}
