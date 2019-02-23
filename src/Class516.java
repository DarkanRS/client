public class Class516 {

	public static int[] anIntArray5895 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
	public static int[] anIntArray5896 = new int[120];

	static {
		int i_0 = 0;

		for (int i_1 = 0; i_1 < 120; i_1++) {
			int i_2 = i_1 + 1;
			int i_3 = (int) ((double) i_2 + 300.0D * Math.pow(2.0D, (double) i_2 / 7.0D));
			i_0 += i_3;
			anIntArray5896[i_1] = i_0 / 4;
		}

	}

	Class516() throws Throwable {
		throw new Error();
	}

	static final void method8864(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		String string_3 = cs2executor_0.aClass61_7010.method1202(client.CURRENT_GAME.anInt5746 << 16 | i_2, -735824266);
		String string_4;
		if (string_3 == null) {
			string_4 = "";
		} else {
			string_4 = string_3;
		}

		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_4;
	}

	static final void method8865(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		QuickchatDefinitions quickchatdefinitions_3 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_2, -1707891446);
		if (quickchatdefinitions_3.anIntArray9624 == null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = quickchatdefinitions_3.anIntArray9624.length;
		}

	}

	public static void method8866(Class275 class275_0, Class275 class275_1, int i_2) {
		if (class275_0.aClass275_3340 != null) {
			class275_0.method4887((byte) -120);
		}

		class275_0.aClass275_3340 = class275_1;
		class275_0.aClass275_3339 = class275_1.aClass275_3339;
		class275_0.aClass275_3340.aClass275_3339 = class275_0;
		class275_0.aClass275_3339.aClass275_3340 = class275_0;
	}

	static final void method8867(boolean bool_0, int i_1) {
		Class442.method7403(client.anInt7349, Class349.anInt4083, client.anInt3243 * -969250379, bool_0, 2111552471);
	}

	static void method8868(String string_0, byte b_1) {
		client.aString7281 = string_0;
		if (NamedFileReference.method867(-1769935536) != Class279.aClass279_3368) {
			try {
				String string_2 = Class282_Sub44.anApplet8065.getParameter(Class358.aClass358_4158.aString4159);
				String string_3 = Class282_Sub44.anApplet8065.getParameter(Class358.aClass358_4144.aString4159);
				String string_4 = string_2 + "settings=" + string_0 + "; version=1; path=/; domain=" + string_3;
				if (string_0.length() == 0) {
					string_4 = string_4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
				} else {
					string_4 = string_4 + "; Expires=" + Class316.method5596(Class169.method2869(1577477583) + 94608000000L) + "; Max-Age=" + 94608000L;
				}

				Class441.method7376(Class282_Sub44.anApplet8065, "document.cookie=\"" + string_4 + "\"", (byte) 78);
			} catch (Throwable throwable_5) {
				;
			}
		}

	}

	static final void method8869(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class121.anInt1526;
	}

	static final void method8870(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (client.aString7426 != null && i_2 < Class459.anInt5534) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = Class467.aClass173Array5575[i_2].aString2129;
		} else {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
		}

	}

}
