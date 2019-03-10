public class DefaultsFile {

	static Class194 aClass194_6967;
	public static DefaultsFile FILE_1 = new DefaultsFile(1);
	static DefaultsFile FILE_2 = new DefaultsFile(2);
	static DefaultsFile FILE_3 = new DefaultsFile(3);
	public static DefaultsFile FILE_4 = new DefaultsFile(4);
	static DefaultsFile FILE_5 = new DefaultsFile(5);
	static DefaultsFile FILE_6 = new DefaultsFile(6);
	static DefaultsFile FILE_7 = new DefaultsFile(7);
	static DefaultsFile FILE_8 = new DefaultsFile(8);
	public int fileId;

	DefaultsFile(int i_1) {
		this.fileId = i_1;
	}

	static final void method11221(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1482833983) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1393 = Class351.method6193(string_4, cs2executor_2, -404986216);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method11222(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		ParamDefinitions attributedefault_4 = IndexLoaders.ITEM_DEFAULTS.method7069(i_3, (byte) 0);
		if (attributedefault_4.method7319(1753438100)) {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = IndexLoaders.MAP_REGION_DECODER.method4436(-2071995524).getObjectDefinitions(i_2, 65280).method7973(i_3, attributedefault_4.typeName, (byte) 97);
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.MAP_REGION_DECODER.method4436(-1502045991).getObjectDefinitions(i_2, 65280).method7963(i_3, attributedefault_4.defaultInt, 1059658238);
		}

	}

	static final void method11223(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 382641837) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1392 = Class351.method6193(string_4, cs2executor_2, 1828799616);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method11224(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		if (Class84.myPlayer.playerAppearance != null) {
			int i_4;
			for (i_4 = 0; i_4 < IdentikitDefinition.anIntArray428.length; i_4++) {
				if (IdentikitDefinition.anIntArray428[i_4] == i_2) {
					Class84.myPlayer.playerAppearance.method3993(i_4, i_3, IndexLoaders.aClass31_204, -1891661545);
					return;
				}
			}

			for (i_4 = 0; i_4 < IdentikitDefinition.anIntArray422.length; i_4++) {
				if (IdentikitDefinition.anIntArray422[i_4] == i_2) {
					Class84.myPlayer.playerAppearance.method3993(i_4, i_3, IndexLoaders.aClass31_204, 938562628);
					break;
				}
			}
		}

	}

}
