public class Class516 {

	public static int[] SKILL_MAX_LEVEL = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
	public static int[] SKILL_XP_FOR_LEVEL = new int[120];

	static {
		int i_0 = 0;
		for (int i_1 = 0; i_1 < 120; i_1++) {
			int i_2 = i_1 + 1;
			int i_3 = (int) ((double) i_2 + 300.0D * Math.pow(2.0D, (double) i_2 / 7.0D));
			i_0 += i_3;
			SKILL_XP_FOR_LEVEL[i_1] = i_0 / 4;
		}
	}

	Class516() throws Throwable {
		throw new Error();
	}

	public static void method8866(EntityNode class275_0, EntityNode class275_1, int i_2) {
		if (class275_0.aEntityNode_3340 != null) {
			class275_0.method4887();
		}
		class275_0.aEntityNode_3340 = class275_1;
		class275_0.aEntityNode_3339 = class275_1.aEntityNode_3339;
		class275_0.aEntityNode_3340.aEntityNode_3339 = class275_0;
		class275_0.aEntityNode_3339.aEntityNode_3340 = class275_0;
	}

	static final void method8867(boolean bool_0) {
		Class442.method7403(client.BASE_WINDOW_ID, Class349.anInt4083, client.anInt3243 * -969250379, bool_0, 2111552471);
	}

	static void method8868(String string_0) {
		client.aString7281 = string_0;
		if (NamedFileReference.method867(-1769935536) != Class279.aClass279_3368) {
			try {
				String string_2 = IFSubNode.anApplet8065.getParameter(Class358.aClass358_4158.aString4159);
				String string_3 = IFSubNode.anApplet8065.getParameter(Class358.aClass358_4144.aString4159);
				String string_4 = string_2 + "settings=" + string_0 + "; version=1; path=/; domain=" + string_3;
				if (string_0.length() == 0) {
					string_4 = string_4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
				} else {
					string_4 = string_4 + "; Expires=" + Class316.method5596(Utils.time() + 94608000000L) + "; Max-Age=" + 94608000L;
				}
				Class441.method7376(IFSubNode.anApplet8065, "document.cookie=\"" + string_4 + "\"", (byte) 78);
			} catch (Throwable throwable_5) {
				;
			}
		}
	}
}
