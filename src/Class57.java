public class Class57 {

	public String aString524;
	public byte aByte525;
	public int anInt526;

	static final void method1134(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		int i_4 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		AttributeDefault attributedefault_5 = IndexLoaders.ITEM_DEFAULTS.method7069(i_4, (byte) 0);
		if (attributedefault_5.method7319(1933175608)) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = icomponentdefinitions_3.method1998(i_4, attributedefault_5.aString5335, 69406966);
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.method1997(i_4, attributedefault_5.anInt5337, 1468810127);
		}

	}

	static final void method1135(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.aClass61_7010.aByte628;
	}

}
