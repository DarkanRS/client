import java.io.IOException;

public abstract class Class202 {

	public abstract void method3310();

	public abstract void write(byte[] var1, int var2, int var3, int var4) throws IOException;

	public abstract int method3312(int var1) throws IOException;

	public abstract void method3314();

	public abstract boolean available(int var1, byte var2) throws IOException;

	public abstract void method3316();

	public abstract boolean method3317(int var1) throws IOException;

	public abstract void method3318(int var1);

	public abstract boolean method3319(int var1) throws IOException;

	public abstract void method3320(byte var1);

	public abstract boolean method3321(int var1) throws IOException;

	public abstract int method3322() throws IOException;

	public abstract int method3323() throws IOException;

	public abstract int method3324(byte[] var1, int var2, int var3) throws IOException;

	public abstract void method3325(byte[] var1, int var2, int var3) throws IOException;

	public abstract void method3326(byte[] var1, int var2, int var3) throws IOException;

	public abstract int read(byte[] var1, int var2, int var3, int var4) throws IOException;

	public abstract boolean method3328(int var1) throws IOException;

	public abstract boolean method3329(int var1) throws IOException;

	public abstract void method3330();

	public abstract void method3331();

	public abstract void method3332();

	public abstract void method3333();

	public static void runIComponentScripts(IComponentDefinitions[] arr_0, int i_1) {
		for (int i_2 = 0; i_2 < arr_0.length; i_2++) {
			IComponentDefinitions icomponentdefinitions_3 = arr_0[i_2];
			if (icomponentdefinitions_3.scriptParams != null) {
				HookRequest hookrequest_4 = new HookRequest();
				hookrequest_4.iComponentDefs = icomponentdefinitions_3;
				hookrequest_4.params = icomponentdefinitions_3.scriptParams;
				Class400.executeHookInner(hookrequest_4, 2000000, (byte) 84);
			}
		}

	}

	static final void method3338(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		int[] ints_5 = Class96_Sub14.method14642(string_4, cs2executor_2, 510066471);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1387 = Class351.method6193(string_4, cs2executor_2, 1621483934);
		icomponentdefinitions_0.anIntArray1402 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method3339(CS2Executor cs2executor_0, byte b_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		Class2.method258(string_2, 779827732);
	}

	static final void method3340(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class84.myPlayer.aClass19_10359.method578((byte) 2) >> 3;
	}

	static final void method3341(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		if (Class468_Sub8.aClass98Array7889[i_2] == null) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
		} else {
			String string_4 = Class468_Sub8.aClass98Array7889[i_2].components[i_3].aString1285;
			if (string_4 == null) {
				cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
			} else {
				cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_4;
			}
		}

	}

	public static String method3342(long long_0, int i_2, boolean bool_3, Language xlanguage_4, byte b_5) {
		char var_6 = 44;
		char var_7 = 46;
		if (xlanguage_4 == Language.aClass495_5795) {
			var_6 = 46;
			var_7 = 44;
		}

		if (xlanguage_4 == Language.aClass495_5801) {
			var_7 = 160;
		}

		boolean bool_8 = false;
		if (long_0 < 0L) {
			bool_8 = true;
			long_0 = -long_0;
		}

		StringBuilder stringbuilder_9 = new StringBuilder(26);
		int i_10;
		int i_11;
		if (i_2 > 0) {
			for (i_10 = 0; i_10 < i_2; i_10++) {
				i_11 = (int) long_0;
				long_0 /= 10L;
				stringbuilder_9.append((char) (i_11 + 48 - (int) long_0 * 10));
			}

			stringbuilder_9.append(var_6);
		}

		i_10 = 0;

		while (true) {
			i_11 = (int) long_0;
			long_0 /= 10L;
			stringbuilder_9.append((char) (i_11 + 48 - (int) long_0 * 10));
			if (long_0 == 0L) {
				if (bool_8) {
					stringbuilder_9.append('-');
				}

				return stringbuilder_9.reverse().toString();
			}

			if (bool_3) {
				++i_10;
				if (i_10 % 3 == 0) {
					stringbuilder_9.append(var_7);
				}
			}
		}
	}

	static Class461[] method3343(int i_0) {
		return new Class461[] { Class461.aClass461_5539, Class461.aClass461_5538, Class461.aClass461_5540 };
	}

	static final void method3344(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7162 == cs2executor_0.animable.method15794(-592862572) ? 1 : 0;
	}

	public static final void method3345(String string_0, int i_1) {
		if (!string_0.equals("")) {
			Class184 class184_2 = Class468_Sub20.method12807(-1721172592);
			TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4598, class184_2.isaac, 595380659);
			tcpmessage_3.buffer.writeByte(ChatLine.getLength(string_0));
			tcpmessage_3.buffer.writeString(string_0);
			class184_2.method3049(tcpmessage_3, 1755458135);
		}

	}

	static final void method3346(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		cs2executor_0.intStackPtr -= 2;
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		FontMetrics fontmetrics_5 = Class94.createFontSpecification(IndexLoaders.FONT_METRICS_INDEX, i_4, 0, 1119085558);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = fontmetrics_5.method6949(string_2, i_3, Class182.aClass160Array2261, 437013959);
	}

}
