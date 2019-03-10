public class Class216 {

	static {
		Math.sqrt(131072.0D);
	}

	Class216() throws Throwable {
		throw new Error();
	}

	static final void method3674(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.ITEM_DEFAULTS.method7069(i_3, (byte) 0);
		if (attributedefault_4.method7319(1764887280)) {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(i_2, (byte) -22).method11129(i_3, attributedefault_4.typeName, 803635154);
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(i_2, (byte) -46).method11133(i_3, attributedefault_4.defaultInt, 1720724957);
		}

	}

	static void method3675(int i_0) {
		if (Class260.aClass116_3229 != null && !Class260.aClass116_3229.method1956(1097733979) && Class260.aClass116_3229.method1963(1418683997)) {
			TCPMessage tcpmessage_1 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, 920221723);
			tcpmessage_1.buffer.writeInt(Class260.aClass116_3229.anInt1254);
			client.aClass184_7475.method3049(tcpmessage_1, 17076661);
		}

	}

	static final void method3676(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		LinkedNodeList.method7889(icomponentdefinitions_3, interface_4, cs2executor_0, 1072784051);
	}

	static boolean method3677(int i_0) {
		return Class20.anInt169 > 0;
	}

	static final void method3678(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.longStackPtr -= 2;
		if (cs2executor_0.longStack[cs2executor_0.longStackPtr] > cs2executor_0.longStack[cs2executor_0.longStackPtr + 1]) {
			cs2executor_0.instrPtr += cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		}

	}

}
