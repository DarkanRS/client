import java.io.InputStream;

public class InputStream_Sub1 extends InputStream {

	public int read() {
		Class89.method1504(30000L);
		return -1;
	}

	static final void method12723(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1423;
	}

	static final void method12724(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		ItemDefinitions itemdefinitions_3 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 527591750);
		if (itemdefinitions_3.certTemplateId >= 0 && itemdefinitions_3.certId >= 0) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = itemdefinitions_3.certId;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2;
		}

	}

}
