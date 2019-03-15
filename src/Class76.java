public class Class76 {

	static Class76 aClass76_753 = new Class76(6, 1);

	static Class76 aClass76_756 = new Class76(0, 2);

	static Class76 aClass76_750 = new Class76(7, 4);

	public static Class76 aClass76_751 = new Class76(4, 1);

	public static Class76 aClass76_752 = new Class76(5, 2);

	public static Class76 aClass76_749 = new Class76(1, 3);

	static Class76 aClass76_754 = new Class76(2, 4);

	public static Class76 aClass76_755 = new Class76(8, 2);

	public static Class76 aClass76_758 = new Class76(3, 4);

	public int anInt757;

	public int anInt748;

	Class76(int i_1, int i_2) {
		this.anInt757 = i_1;
		this.anInt748 = i_2;
	}

	static int method1356(int i_0, int i_1) {
		double d_3 = Math.log((double) i_1) / Math.log(2.0D);
		double d_5 = Math.log((double) i_0) / Math.log(2.0D);
		double d_7 = Math.random() * (d_3 - d_5) + d_5;
		return (int) (Math.pow(2.0D, d_7) + 0.5D);
	}

	public static String getCrown(int i_0) {
		return "<img=" + i_0 + ">";
	}

	public static void method1360(String string_0, boolean bool_1) {
		string_0 = string_0.toLowerCase();
		short[] shorts_3 = new short[16];
		int i_4 = 0;
		int i_5 = bool_1 ? 32768 : 0;
		int i_6 = (bool_1 ? IndexLoaders.QUICK_CHAT_INDEX_LOADER2.anInt5133 : IndexLoaders.QUICK_CHAT_INDEX_LOADER2.anInt5130) + i_5;
		for (int i_7 = i_5; i_7 < i_6; i_7++) {
			QuickchatDefinitions quickchatdefinitions_12 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_7, -1918466805);
			if (quickchatdefinitions_12.aBool9628 && quickchatdefinitions_12.method14898(409119349).toLowerCase().indexOf(string_0) != -1) {
				if (i_4 >= 50) {
					Class415.anInt4985 = -1;
					Class308.aShortArray3621 = null;
					return;
				}
				if (i_4 >= shorts_3.length) {
					short[] shorts_9 = new short[shorts_3.length * 2];
					for (int i_10 = 0; i_10 < i_4; i_10++) {
						shorts_9[i_10] = shorts_3[i_10];
					}
					shorts_3 = shorts_9;
				}
				shorts_3[i_4++] = (short) i_7;
			}
		}
		Class308.aShortArray3621 = shorts_3;
		Class283.anInt3384 = 0;
		Class415.anInt4985 = i_4;
		String[] arr_11 = new String[Class415.anInt4985];
		for (int i_8 = 0; i_8 < Class415.anInt4985; i_8++) {
			arr_11[i_8] = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(shorts_3[i_8], -1792601455).method14898(-47369611);
		}
		Class100.method1644(arr_11, Class308.aShortArray3621, (short) 30307);
	}

	public static void method1361(byte b_0) {
		Class96.method1607((byte) 74);
		Class115.aClass160Array1248 = null;
	}
}
