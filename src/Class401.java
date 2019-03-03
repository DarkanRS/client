public class Class401 {

	static IComponentDefinitions aClass118_4825;
	Index aClass317_4824;
	public int anInt4823;

	public Class401(Game game_1, Language xlanguage_2, Index index_3) {
		new SoftCache(64);
		this.aClass317_4824 = index_3;
		this.anInt4823 = this.aClass317_4824.filesCount(SharedConfigsType.aClass120_1478.id);
	}

	static final void method6796(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1428;
	}

	static final void method6797(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		int i_3 = client.aClass330Array7428[i_2].method5908(-1939537694);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_3 == 0 ? 1 : 0;
	}

}
