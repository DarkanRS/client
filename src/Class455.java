public abstract class Class455 {

	public static short[] aShortArray5452;

	static void method7553(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, int i_3) {
		if (client.aBool7344) {
			ParamDefinitions attributedefault_4 = Class96_Sub12.anInt9319 != -1 ? IndexLoaders.ITEM_DEFAULTS.method7069(Class96_Sub12.anInt9319, (byte) 0) : null;
			if (client.method11633(icomponentdefinitions_0).bit22Enabled() && (Class506.anInt5858 & 0x20) != 0 && (attributedefault_4 == null || icomponentdefinitions_0.method1997(Class96_Sub12.anInt9319, attributedefault_4.defaultInt, 1315662275) != attributedefault_4.defaultInt)) {
				PlayerAppearance.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + icomponentdefinitions_0.aString1369, Defaults8Loader.anInt5932, 58, icomponentdefinitions_0.anInt1426, 0L, icomponentdefinitions_0.anInt1288, icomponentdefinitions_0.idHash, true, false, (long) (icomponentdefinitions_0.anInt1288 << 32 | icomponentdefinitions_0.idHash), false, -1704442537);
			}
		}
		for (int i_7 = 9; i_7 >= 5; --i_7) {
			String string_8 = ItemIndexLoader.method7171(icomponentdefinitions_0, i_7, (byte) -85);
			if (string_8 != null) {
				PlayerAppearance.method4032(string_8, icomponentdefinitions_0.aString1369, Class520.method11163(icomponentdefinitions_0, i_7, 556653013), 1007, icomponentdefinitions_0.anInt1426, (long) (i_7 + 1), icomponentdefinitions_0.anInt1288, icomponentdefinitions_0.idHash, true, false, (long) (icomponentdefinitions_0.anInt1288 << 32 | icomponentdefinitions_0.idHash), false, -976206052);
			}
		}
		String string_9 = Class346.method6157(icomponentdefinitions_0, -948753255);
		if (string_9 != null) {
			PlayerAppearance.method4032(string_9, icomponentdefinitions_0.aString1369, icomponentdefinitions_0.anInt1378, 25, icomponentdefinitions_0.anInt1426, 0L, icomponentdefinitions_0.anInt1288, icomponentdefinitions_0.idHash, true, false, (long) (icomponentdefinitions_0.anInt1288 << 32 | icomponentdefinitions_0.idHash), false, -1589662667);
		}
		for (int i_5 = 4; i_5 >= 0; --i_5) {
			String string_6 = ItemIndexLoader.method7171(icomponentdefinitions_0, i_5, (byte) 19);
			if (string_6 != null) {
				PlayerAppearance.method4032(string_6, icomponentdefinitions_0.aString1369, Class520.method11163(icomponentdefinitions_0, i_5, 1809769976), 57, icomponentdefinitions_0.anInt1426, (long) (i_5 + 1), icomponentdefinitions_0.anInt1288, icomponentdefinitions_0.idHash, true, false, (long) (icomponentdefinitions_0.anInt1288 << 32 | icomponentdefinitions_0.idHash), false, -1644118104);
			}
		}
		if (client.method11633(icomponentdefinitions_0).continueOptionEnabled()) {
			if (icomponentdefinitions_0.aString1348 != null) {
				PlayerAppearance.method4032(icomponentdefinitions_0.aString1348, "", -1, 30, icomponentdefinitions_0.anInt1426, 0L, icomponentdefinitions_0.anInt1288, icomponentdefinitions_0.idHash, true, false, (long) (icomponentdefinitions_0.anInt1288 << 32 | icomponentdefinitions_0.idHash), false, -1336342241);
			} else {
				PlayerAppearance.method4032(Message.CONTINUE.translate(Class223.CURRENT_LANGUAGE, -1421679788), "", -1, 30, icomponentdefinitions_0.anInt1426, 0L, icomponentdefinitions_0.anInt1288, icomponentdefinitions_0.idHash, true, false, (long) (icomponentdefinitions_0.anInt1288 << 32 | icomponentdefinitions_0.idHash), false, -1542959326);
			}
		}
	}

	static void method7554(Interface interface_0, IComponentDefinitions icomponentdefinitions_1, int i_2) {
		if (icomponentdefinitions_1 != null) {
			int i_4;
			if (icomponentdefinitions_1.anInt1288 != -1) {
				IComponentDefinitions icomponentdefinitions_3 = interface_0.getComponent(icomponentdefinitions_1.parent);
				if (icomponentdefinitions_3 != null) {
					if (icomponentdefinitions_3.aClass118Array1439 == icomponentdefinitions_3.aClass118Array1438) {
						icomponentdefinitions_3.aClass118Array1439 = new IComponentDefinitions[icomponentdefinitions_3.aClass118Array1438.length];
						icomponentdefinitions_3.aClass118Array1439[icomponentdefinitions_3.aClass118Array1439.length - 1] = icomponentdefinitions_1;
						Class503.method8359(icomponentdefinitions_3.aClass118Array1438, 0, icomponentdefinitions_3.aClass118Array1439, 0, icomponentdefinitions_1.anInt1288);
						Class503.method8359(icomponentdefinitions_3.aClass118Array1438, icomponentdefinitions_1.anInt1288 + 1, icomponentdefinitions_3.aClass118Array1439, icomponentdefinitions_1.anInt1288, icomponentdefinitions_3.aClass118Array1438.length - icomponentdefinitions_1.anInt1288 - 1);
					} else {
						i_4 = 0;
						IComponentDefinitions[] arr_5;
						for (arr_5 = icomponentdefinitions_3.aClass118Array1439; i_4 < arr_5.length && arr_5[i_4] != icomponentdefinitions_1; i_4++) {
							;
						}
						if (i_4 < arr_5.length) {
							Class503.method8359(arr_5, i_4 + 1, arr_5, i_4, arr_5.length - i_4 - 1);
							arr_5[icomponentdefinitions_3.aClass118Array1439.length - 1] = icomponentdefinitions_1;
						}
					}
				}
			} else {
				IComponentDefinitions[] arr_6 = interface_0.method1617(-894902521);
				for (i_4 = 0; i_4 < arr_6.length && arr_6[i_4] != icomponentdefinitions_1; i_4++) {
					;
				}
				if (i_4 < arr_6.length) {
					Class503.method8359(arr_6, i_4 + 1, arr_6, i_4, arr_6.length - i_4 - 1);
					arr_6[arr_6.length - 1] = icomponentdefinitions_1;
				}
			}
		}
	}

	static final void method7555(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.anInt1329 = 1;
		icomponentdefinitions_0.anInt1330 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -15);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, -624586705);
		}
	}

	public static int method7557(CharSequence charsequence_0, CharSequence charsequence_1, Language xlanguage_2, int i_3) {
		int i_4 = charsequence_0.length();
		int i_5 = charsequence_1.length();
		int i_6 = 0;
		int i_7 = 0;
		char var_8 = 0;
		char var_9 = 0;
		while (i_6 - var_8 < i_4 || i_7 - var_9 < i_5) {
			if (i_6 - var_8 >= i_4) {
				return -1;
			}
			if (i_7 - var_9 >= i_5) {
				return 1;
			}
			char var_10;
			if (var_8 != 0) {
				var_10 = var_8;
				boolean bool_11 = false;
			} else {
				var_10 = charsequence_0.charAt(i_6++);
			}
			char var_15;
			if (var_9 != 0) {
				var_15 = var_9;
				boolean bool_12 = false;
			} else {
				var_15 = charsequence_1.charAt(i_7++);
			}
			var_8 = Class466.method7778(var_10, -1430101456);
			var_9 = Class466.method7778(var_15, 1240929738);
			var_10 = Class152.method2599(var_10, xlanguage_2, 32768);
			var_15 = Class152.method2599(var_15, xlanguage_2, 32768);
			if (var_10 != var_15 && Character.toUpperCase(var_10) != Character.toUpperCase(var_15)) {
				var_10 = Character.toLowerCase(var_10);
				var_15 = Character.toLowerCase(var_15);
				if (var_15 != var_10) {
					return Class468_Sub30.method13422(var_10, xlanguage_2, -556732263) - Class468_Sub30.method13422(var_15, xlanguage_2, -556732263);
				}
			}
		}
		int i_16 = Math.min(i_4, i_5);
		char var_13;
		int i_18;
		for (i_18 = 0; i_18 < i_16; i_18++) {
			if (xlanguage_2 == Language.aClass495_5801) {
				i_6 = i_4 - 1 - i_18;
				i_7 = i_5 - 1 - i_18;
			} else {
				i_7 = i_18;
				i_6 = i_18;
			}
			char var_17 = charsequence_0.charAt(i_6);
			var_13 = charsequence_1.charAt(i_7);
			if (var_13 != var_17 && Character.toUpperCase(var_17) != Character.toUpperCase(var_13)) {
				var_17 = Character.toLowerCase(var_17);
				var_13 = Character.toLowerCase(var_13);
				if (var_17 != var_13) {
					return Class468_Sub30.method13422(var_17, xlanguage_2, -556732263) - Class468_Sub30.method13422(var_13, xlanguage_2, -556732263);
				}
			}
		}
		i_18 = i_4 - i_5;
		if (i_18 != 0) {
			return i_18;
		} else {
			for (int i_19 = 0; i_19 < i_16; i_19++) {
				var_13 = charsequence_0.charAt(i_19);
				char var_14 = charsequence_1.charAt(i_19);
				if (var_13 != var_14) {
					return Class468_Sub30.method13422(var_13, xlanguage_2, -556732263) - Class468_Sub30.method13422(var_14, xlanguage_2, -556732263);
				}
			}
			return 0;
		}
	}

	static void method7558(boolean bool_0, boolean bool_1, String string_2, String string_3, long long_4) {
		Class9.socialNetworkLogin = bool_0;
		if (!bool_1) {
			Class9.anInt76 = -1;
		}
		Class9.aBool74 = bool_1;
		Class9.aString99 = string_2;
		Class9.aString102 = string_3;
		Class9.aLong77 = long_4;
		if (Class9.aBool74 || !Class9.aString99.equals("") && !Class9.aString102.equals("")) {
			if (Class9.lobbyStage != 140) {
				Class9.anInt103 = 0;
				Class9.anInt112 = -1;
				Class9.anInt94 = -1;
			}
			Class9.aClass184_73.aBool2298 = false;
			Class8_Sub1.method13784(-3, -416283097);
			Class9.loginStage = 18;
			Class9.anInt90 = 0;
			Class9.anInt104 = 0;
		} else {
			Class8_Sub1.method13784(3, 737925306);
		}
	}

	static int getCRC(byte[] data, int start, int end) {
		int i_3 = -1;
		for (int i_4 = start; i_4 < end; i_4++) {
			i_3 = i_3 >>> 8 ^ RsByteBuffer.anIntArray7986[(i_3 ^ data[i_4]) & 0xff];
		}
		i_3 = ~i_3;
		return i_3;
	}
}
