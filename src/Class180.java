public class Class180 {

	public int anInt2235;
	public int anInt2236;
	public int anInt2237;
	public int anInt2238;
	int anInt2239;
	int anInt2240;
	int anInt2241;
	public int anInt2243;
	int anInt2244;
	static int anInt2246;
	static SoftCache aClass229_2245 = new SoftCache(4);
	public int anInt2242 = -1;

	static final void method3030(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 504897377);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = itemdefinitions_3.aBool5101 ? 1 : 0;
	}

	static final void method3031(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class82.method1454(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 111);
	}

	public static ChatLine method3032(int i_0, byte b_1) {
		return i_0 >= 0 && i_0 < 100 ? Class81.CHAT_LINES[i_0] : null;
	}

	static final void method3033(CS2Executor cs2executor_0, byte b_1) {
		if (client.anInt7319 >= 5 && client.anInt7319 <= 9) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7319;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

}
