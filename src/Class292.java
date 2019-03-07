import java.awt.Rectangle;

public class Class292 {

	Class292() throws Throwable {
		throw new Error();
	}

	static final void method5197(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class521_Sub1_Sub1_Sub6.getAmountAtSlot(i_2, i_3, false, 1986479665);
	}

	static final void method5198(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 1980153420).membersOnly ? 1 : 0;
	}

	static final void method5199(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (i_2 != -1) {
			Class123.method2152(i_2, 1279989197);
		}

	}

	static final void method5200(boolean bool_0, CS2Executor cs2executor_1, byte b_2) {
		ClassSomet underlaydefinition_3 = cs2executor_1.aBool7022 ? cs2executor_1.aClass513_6994 : cs2executor_1.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_3.aClass118_5886;
		Interface interface_5 = underlaydefinition_3.aClass98_5885;
		if (bool_0) {
			Class455.method7554(interface_5, icomponentdefinitions_4, 658695956);
		} else {
			WorldMapIndexLoader.method3710(interface_5, icomponentdefinitions_4, 983481657);
		}

	}

	static final void method5201(int i_0, int i_1, int i_2, int i_3, byte b_4) {
		for (int i_5 = 0; i_5 < client.anInt7407; i_5++) {
			Rectangle rectangle_6 = client.aRectangleArray7411[i_5];
			if (rectangle_6.x + rectangle_6.width > i_0 && rectangle_6.x < i_0 + i_2 && rectangle_6.height + rectangle_6.y > i_1 && rectangle_6.y < i_3 + i_1) {
				client.aBoolArray7443[i_5] = true;
			}
		}

	}

}
