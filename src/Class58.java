public class Class58 implements Interface19 {

	public static Class529 aClass529_527;
	public static Class61 aClass61_528;

	public String method135(QuickChatDynamicValue quickchatdynamicvalue_1, int[] ints_2, long long_3) {
		if (quickchatdynamicvalue_1 == QuickChatDynamicValue.LISTDIALOG) {
			EnumDefinitions enumdefinitions_6 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0], (byte) 8);
			return enumdefinitions_6.getStringValue((int) long_3, -64424168);
		} else if (quickchatdynamicvalue_1 != QuickChatDynamicValue.OBJDIALOG && quickchatdynamicvalue_1 != QuickChatDynamicValue.OBJTRADEDIALOG) {
			return quickchatdynamicvalue_1 != QuickChatDynamicValue.ENUM_STRING && quickchatdynamicvalue_1 != QuickChatDynamicValue.ENUM_STRING_CLAN && quickchatdynamicvalue_1 != QuickChatDynamicValue.ENUM_STRING_STATBASE ? null : IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0], (byte) 8).getStringValue((int) long_3, 2106456977);
		} else {
			ItemDefinitions itemdefinitions_5 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) long_3, 1575511012);
			return itemdefinitions_5.name;
		}
	}

	public String method136(QuickChatDynamicValue quickchatdynamicvalue_1, int[] ints_2, long long_3) {
		if (quickchatdynamicvalue_1 == QuickChatDynamicValue.LISTDIALOG) {
			EnumDefinitions enumdefinitions_6 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0], (byte) 8);
			return enumdefinitions_6.getStringValue((int) long_3, -451172927);
		} else if (quickchatdynamicvalue_1 != QuickChatDynamicValue.OBJDIALOG && quickchatdynamicvalue_1 != QuickChatDynamicValue.OBJTRADEDIALOG) {
			return quickchatdynamicvalue_1 != QuickChatDynamicValue.ENUM_STRING && quickchatdynamicvalue_1 != QuickChatDynamicValue.ENUM_STRING_CLAN && QuickChatDynamicValue.ENUM_STRING_STATBASE != quickchatdynamicvalue_1 ? null : IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0], (byte) 8).getStringValue((int) long_3, 579863966);
		} else {
			ItemDefinitions itemdefinitions_5 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) long_3, 1001383169);
			return itemdefinitions_5.name;
		}
	}

	public String method137(QuickChatDynamicValue quickchatdynamicvalue_1, int[] ints_2, long long_3) {
		if (quickchatdynamicvalue_1 == QuickChatDynamicValue.LISTDIALOG) {
			EnumDefinitions enumdefinitions_6 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0], (byte) 8);
			return enumdefinitions_6.getStringValue((int) long_3, 1807301402);
		} else if (quickchatdynamicvalue_1 != QuickChatDynamicValue.OBJDIALOG && quickchatdynamicvalue_1 != QuickChatDynamicValue.OBJTRADEDIALOG) {
			return quickchatdynamicvalue_1 != QuickChatDynamicValue.ENUM_STRING && quickchatdynamicvalue_1 != QuickChatDynamicValue.ENUM_STRING_CLAN && QuickChatDynamicValue.ENUM_STRING_STATBASE != quickchatdynamicvalue_1 ? null : IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0], (byte) 8).getStringValue((int) long_3, 870502499);
		} else {
			ItemDefinitions itemdefinitions_5 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) long_3, 980580063);
			return itemdefinitions_5.name;
		}
	}

	static final void method1136(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 50);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class504.method8390(icomponentdefinitions_3, interface_4, cs2executor_0, 1964593641);
	}

	static final void method1137(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aBool7316 ? 1 : 0;
	}

	static final void method1138(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		IComponentDefinitions icomponentdefinitions_5 = Index.method5694(i_2 << 16 | i_3, i_4, -1458346299);
		Class60.method1170(-609337146);
		IComponentSettings class282_sub10_6 = client.method11633(icomponentdefinitions_5);
		Class304.method5409(icomponentdefinitions_5, class282_sub10_6.getUseOptionFlags(), class282_sub10_6.interfaceId, (byte) -101);
	}

	public static void method1139(int i_0) {
		Class419.aClass160_5004 = null;
		Class187.anInt2351 = -1;
	}

	static final void method1140(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub17_8200.method12762(-283512869) == 1 ? 1 : 0;
	}

	static int method1141(int i_0) {
		if (client.aClass118_7257 == null) {
			if (!Class20.aBool161) {
				if (Class149_Sub2.DEFAULTS_LOADER_7.aBool5876) {
					if (Class20.aClass282_Sub50_Sub7_168 != null) {
						return Class20.aClass282_Sub50_Sub7_168.anInt9578;
					}
				} else if (Class96_Sub23.aClass282_Sub50_Sub7_9445 != null) {
					return Class96_Sub23.aClass282_Sub50_Sub7_9445.anInt9578;
				}
			} else {
				FontMetrics fontmetrics_1 = Class114.method1887(466263588);
				int i_2 = Class163.mouseRecorder.method3569(1973979950);
				int i_3 = Class163.mouseRecorder.method3570(756095591);
				int i_4;
				int i_5;
				Class282_Sub50_Sub7 class282_sub50_sub7_7;
				int i_8;
				if (!Class20.aBool162) {
					if (i_2 > Class301.anInt3555 && i_2 < Class301.anInt3555 + Class158_Sub2.anInt8975) {
						i_4 = -1;

						for (i_5 = 0; i_5 < Class20.anInt169; i_5++) {
							if (Class20.aBool187) {
								i_8 = (Class20.anInt169 - 1 - i_5) * Class20.anInt178 + fontmetrics_1.anInt4978 + Class184.anInt2300 + 1 + 20;
								if (i_3 > i_8 - fontmetrics_1.anInt4978 - 1 && i_3 < i_8 + fontmetrics_1.anInt4979) {
									i_4 = i_5;
								}
							} else {
								i_8 = (Class20.anInt169 - 1 - i_5) * Class20.anInt178 + Class184.anInt2300 + 31;
								if (i_3 > i_8 - fontmetrics_1.anInt4978 - 1 && i_3 < i_8 + fontmetrics_1.anInt4979) {
									i_4 = i_5;
								}
							}
						}

						if (i_4 != -1) {
							i_5 = 0;
							NodeIterator nodeiterator_6 = new NodeIterator(Class20.aClass482_171);

							for (class282_sub50_sub7_7 = (Class282_Sub50_Sub7) nodeiterator_6.method7683(1195046637); class282_sub50_sub7_7 != null; class282_sub50_sub7_7 = (Class282_Sub50_Sub7) nodeiterator_6.next()) {
								if (i_5++ == i_4) {
									return class282_sub50_sub7_7.anInt9578;
								}
							}
						}
					}
				} else {
					Class469 class469_9;
					if (i_2 > Class301.anInt3555 && i_2 < Class301.anInt3555 + Class158_Sub2.anInt8975) {
						i_4 = -1;

						for (i_5 = 0; i_5 < Class20.anInt170; i_5++) {
							if (Class20.aBool187) {
								i_8 = i_5 * Class20.anInt178 + fontmetrics_1.anInt4978 + Class184.anInt2300 + 1 + 20;
								if (i_3 > i_8 - fontmetrics_1.anInt4978 - 1 && i_3 < i_8 + fontmetrics_1.anInt4979) {
									i_4 = i_5;
								}
							} else {
								i_8 = i_5 * Class20.anInt178 + Class184.anInt2300 + 31;
								if (i_3 > i_8 - fontmetrics_1.anInt4978 - 1 && i_3 < i_8 + fontmetrics_1.anInt4979) {
									i_4 = i_5;
								}
							}
						}

						if (i_4 != -1) {
							i_5 = 0;
							class469_9 = new Class469(Class20.aClass477_182);

							for (Class282_Sub50_Sub15 class282_sub50_sub15_10 = (Class282_Sub50_Sub15) class469_9.method7790(1832486278); class282_sub50_sub15_10 != null; class282_sub50_sub15_10 = (Class282_Sub50_Sub15) class469_9.next()) {
								if (i_5++ == i_4) {
									return ((Class282_Sub50_Sub7) class282_sub50_sub15_10.aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119).anInt9578;
								}
							}
						}
					} else if (Class20.aClass282_Sub50_Sub15_163 != null && i_2 > Class341.anInt3996 && i_2 < Class96_Sub3.anInt8518 + Class341.anInt3996) {
						i_4 = -1;

						for (i_5 = 0; i_5 < Class20.aClass282_Sub50_Sub15_163.anInt9769; i_5++) {
							if (Class20.aBool187) {
								i_8 = i_5 * Class20.anInt178 + fontmetrics_1.anInt4978 + Class282_Sub50_Sub2.anInt9471 + 1 + 20;
								if (i_3 > i_8 - fontmetrics_1.anInt4978 - 1 && i_3 < i_8 + fontmetrics_1.anInt4979) {
									i_4 = i_5;
								}
							} else {
								i_8 = i_5 * Class20.anInt178 + Class282_Sub50_Sub2.anInt9471 + 31;
								if (i_3 > i_8 - fontmetrics_1.anInt4978 - 1 && i_3 < i_8 + fontmetrics_1.anInt4979) {
									i_4 = i_5;
								}
							}
						}

						if (i_4 != -1) {
							i_5 = 0;
							class469_9 = new Class469(Class20.aClass282_Sub50_Sub15_163.aClass477_9770);

							for (class282_sub50_sub7_7 = (Class282_Sub50_Sub7) class469_9.method7790(1832486278); class282_sub50_sub7_7 != null; class282_sub50_sub7_7 = (Class282_Sub50_Sub7) class469_9.next()) {
								if (i_5++ == i_4) {
									return class282_sub50_sub7_7.anInt9578;
								}
							}
						}
					}
				}
			}
		}

		return -1;
	}

	public static void method1142(Class268 class268_0, int i_1) {
		if (class268_0.aClass282_Sub15_Sub5_3304 != null) {
			Class79.aClass282_Sub15_Sub4_783.method15276(class268_0.aClass282_Sub15_Sub5_3304);
		} else {
			class268_0.anInt3297 = Integer.MIN_VALUE;
		}

	}

}
