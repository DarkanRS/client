package com.rs.jagex;

public enum Class76 {
	aClass76_756(2),
	aClass76_749(3),
	aClass76_754(4),
	aClass76_758(4),
	aClass76_751(1),
	aClass76_752(2),
	aClass76_753(1),
	aClass76_750(4),
	aClass76_755(2);
	
	public static String getCrown(int i_0) {
		return "<img=" + i_0 + ">";
	}

	static int method1356(int i_0, int i_1) {
		double d_3 = Math.log(i_1) / Math.log(2.0D);
		double d_5 = Math.log(i_0) / Math.log(2.0D);
		double d_7 = Math.random() * (d_3 - d_5) + d_5;
		return (int) (Math.pow(2.0D, d_7) + 0.5D);
	}

	public static void method1360(String string_0, boolean bool_1) {
		string_0 = string_0.toLowerCase();
		short[] shorts_3 = new short[16];
		int i_4 = 0;
		int i_5 = bool_1 ? 32768 : 0;
		int i_6 = (bool_1 ? IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.anInt5133 : IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.anInt5130) + i_5;
		for (int i_7 = i_5; i_7 < i_6; i_7++) {
			QuickchatMessageDefinitions quickchatdefinitions_12 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_7);
			if (quickchatdefinitions_12.searchable && quickchatdefinitions_12.method14898().toLowerCase().indexOf(string_0) != -1) {
				if (i_4 >= 50) {
					VarcDefinitions.CS2_QUERY_RESULTS_LEN = -1;
					Class308.CS2_QUERY_RESULTS = null;
					return;
				}
				if (i_4 >= shorts_3.length) {
					short[] shorts_9 = new short[shorts_3.length * 2];
					System.arraycopy(shorts_3, 0, shorts_9, 0, i_4);
					shorts_3 = shorts_9;
				}
				shorts_3[i_4++] = (short) i_7;
			}
		}
		Class308.CS2_QUERY_RESULTS = shorts_3;
		StaticElements.CS2_QUERY_RESULT_IDX = 0;
		VarcDefinitions.CS2_QUERY_RESULTS_LEN = i_4;
		String[] arr_11 = new String[VarcDefinitions.CS2_QUERY_RESULTS_LEN];
		for (int i_8 = 0; i_8 < VarcDefinitions.CS2_QUERY_RESULTS_LEN; i_8++)
			arr_11[i_8] = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(shorts_3[i_8]).method14898();
		ShaderDecoder.sortAlphabetically(arr_11, Class308.CS2_QUERY_RESULTS);
	}

	public static void method1361() {
		CutsceneAction.method1607();
		Class115.aNativeSpriteArray1248 = null;
	}

	public int anInt748;

	Class76(int i_2) {
		anInt748 = i_2;
	}
}
