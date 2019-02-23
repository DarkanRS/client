public class Class13 {

	static int anInt128;
	static String[] aStringArray129;
	static int anInt130;
	static SoftCache aClass229_127 = new SoftCache(32);

	Class13() throws Throwable {
		throw new Error();
	}

	static final void method501(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.aBool1322 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.method1858(icomponentdefinitions_0, (byte) -70);
	}

	static final void method502(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		int[] ints_5 = Class96_Sub14.method14642(string_4, cs2executor_2, 2090816514);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1403 = Class351.method6193(string_4, cs2executor_2, 1107987835);
		icomponentdefinitions_0.anIntArray1315 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

	static void method503(Class282_Sub50_Sub15 class282_sub50_sub15_0, int i_1) {
		boolean bool_2 = false;
		class282_sub50_sub15_0.method13452();

		for (Class282_Sub50_Sub15 class282_sub50_sub15_3 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7941((byte) 4); class282_sub50_sub15_3 != null; class282_sub50_sub15_3 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7955(-1642244739)) {
			if (Class301.method5334(class282_sub50_sub15_0.method15244((byte) 107), class282_sub50_sub15_3.method15244((byte) 59), 993157847)) {
				Class224.method3782(class282_sub50_sub15_0, class282_sub50_sub15_3, -1979656463);
				bool_2 = true;
				break;
			}
		}

		if (!bool_2) {
			Class20.aClass477_182.method7936(class282_sub50_sub15_0, -1738910950);
		}

	}

	static final void method504(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = CS2Runner.anInt5904;
	}

	static final void method505(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		String string_5 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		AttributeDefault attributedefault_6 = IndexLoaders.ITEM_DEFAULTS.method7069(i_4, (byte) 0);
		if (!attributedefault_6.aString5335.equals(string_5)) {
			icomponentdefinitions_0.method2000(i_4, string_5, 2122573770);
		} else {
			icomponentdefinitions_0.method1995(i_4, -1265527536);
		}

	}

	static final void method506(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		icomponentdefinitions_0.anInt1376 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1314 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		Class109.method1858(icomponentdefinitions_0, (byte) -10);
		if (icomponentdefinitions_0.anInt1268 == 0) {
			Class12.method483(interface_1, icomponentdefinitions_0, false, -1735080264);
		}

	}

	public static final int method507(int i_0, int i_1, int i_2, int i_3, int i_4, byte b_5) {
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-888508075) == null) {
			return 0;
		} else if (i_4 < 3) {
			RegionMap regionmap_6 = IndexLoaders.MAP_REGION_DECODER.method4433(33386298);
			int i_7 = i_0 >> 9;
			int i_8 = i_1 >> 9;
			if (i_2 >= 0 && i_3 >= 0 && i_2 <= IndexLoaders.MAP_REGION_DECODER.getSizeX(1440924603) - 1 && i_3 <= IndexLoaders.MAP_REGION_DECODER.getSizeY(-1516017407) - 1) {
				if (i_7 >= 1 && i_8 >= 1 && i_7 <= IndexLoaders.MAP_REGION_DECODER.getSizeX(645551626) - 1 && i_8 <= IndexLoaders.MAP_REGION_DECODER.getSizeY(-608520237) - 1) {
					boolean bool_9 = (regionmap_6.tileMasks[1][i_0 >> 9][i_1 >> 9] & 0x2) != 0;
					boolean bool_10;
					boolean bool_11;
					if ((i_0 & 0x1ff) == 0) {
						bool_10 = (regionmap_6.tileMasks[1][i_7 - 1][i_1 >> 9] & 0x2) != 0;
						bool_11 = (regionmap_6.tileMasks[1][i_7][i_1 >> 9] & 0x2) != 0;
						if (bool_11 != bool_10) {
							bool_9 = (regionmap_6.tileMasks[1][i_2][i_3] & 0x2) != 0;
						}
					}

					if ((i_1 & 0x1ff) == 0) {
						bool_10 = (regionmap_6.tileMasks[1][i_0 >> 9][i_8 - 1] & 0x2) != 0;
						bool_11 = (regionmap_6.tileMasks[1][i_0 >> 9][i_8] & 0x2) != 0;
						if (bool_10 != bool_11) {
							bool_9 = (regionmap_6.tileMasks[1][i_2][i_3] & 0x2) != 0;
						}
					}

					if (bool_9) {
						++i_4;
					}

					return IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1611665057).aClass390Array2591[i_4].method6709(i_0, i_1, -1580541166);
				} else {
					return 0;
				}
			} else {
				return 0;
			}
		} else {
			return IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1611665057).aClass390Array2591[i_4].method6709(i_0, i_1, -1580541166);
		}
	}

	public static void method508(boolean bool_0, boolean bool_1, int i_2) {
		if (bool_0) {
			--Class540.anInt7137;
			if (Class540.anInt7137 == 0) {
				Class335.anIntArray3916 = null;
			}
		}

		if (bool_1) {
			--Class540.anInt7135;
			if (Class540.anInt7135 == 0) {
				Class540.anIntArray7136 = null;
			}
		}

	}

}
