public class Class492 {

	public static JS5GrabWorker[] aClass327_Sub1Array5777;
	static IterableNodeMap aClass465_5774 = new IterableNodeMap(4);
	static Class502 aClass502_5776 = new Class502();

	Class492() throws Throwable {
		throw new Error();
	}

	static final void method8263(CS2Executor cs2executor_0, int i_1) {
		if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
			Class440.method7373(Class393.preferences.screenSize.method12687(577867050), -1, -1, false, (byte) 35);
		}

		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		boolean bool_3 = cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1;
		String string_4 = WorldMapAreaDefs.method3741((byte) -1) + string_2;
		Class282_Sub50_Sub6.method14788(string_4, bool_3, Class393.preferences.currentToolkit.getValue(-1739196165) == 5, client.aBool7158, client.aBool7159, (byte) -52);
	}

	static final boolean method8264(ObjectIndexLoader objectindexloader_0, int i_1, int i_2, int i_3) {
		ObjectDefinitions objectdefinitions_4 = objectindexloader_0.getObjectDefinitions(i_1, 65280);
		if (i_2 == 11) {
			i_2 = 10;
		}

		if (i_2 >= 5 && i_2 <= 8) {
			i_2 = 4;
		}

		return objectdefinitions_4.method7987(i_2, 312725191);
	}

	public static final void method8265(int i_0, int i_1, int i_2, int i_3, boolean bool_4, byte b_5) {
		if (i_2 < 1) {
			i_2 = 1;
		}

		if (i_3 < 1) {
			i_3 = 1;
		}

		int i_6 = i_3 - 334;
		if (i_6 < 0) {
			i_6 = 0;
		} else if (i_6 > 100) {
			i_6 = 100;
		}

		int i_7 = (client.aShort7437 - client.aShort7436) * i_6 / 100 + client.aShort7436;
		int i_8 = i_3 * i_7 * 512 / (i_2 * 334);
		int i_9;
		int i_10;
		short s_11;
		if (i_8 < client.aShort7214) {
			s_11 = client.aShort7214;
			i_7 = s_11 * i_2 * 334 / (i_3 * 512);
			if (i_7 > client.aShort7441) {
				i_7 = client.aShort7441;
				i_9 = i_3 * i_7 * 512 / (s_11 * 334);
				i_10 = (i_2 - i_9) / 2;
				if (bool_4) {
					Renderers.SOFTWARE_RENDERER.L();
					Renderers.SOFTWARE_RENDERER.method8425(i_0, i_1, i_10, i_3, -16777216, (byte) -9);
					Renderers.SOFTWARE_RENDERER.method8425(i_0 + i_2 - i_10, i_1, i_10, i_3, -16777216, (byte) -9);
				}

				i_0 += i_10;
				i_2 -= i_10 * 2;
			}
		} else if (i_8 > client.aShort7474) {
			s_11 = client.aShort7474;
			i_7 = s_11 * i_2 * 334 / (i_3 * 512);
			if (i_7 < client.aShort7276) {
				i_7 = client.aShort7276;
				i_9 = s_11 * i_2 * 334 / (i_7 * 512);
				i_10 = (i_3 - i_9) / 2;
				if (bool_4) {
					Renderers.SOFTWARE_RENDERER.L();
					Renderers.SOFTWARE_RENDERER.method8425(i_0, i_1, i_2, i_10, -16777216, (byte) -109);
					Renderers.SOFTWARE_RENDERER.method8425(i_0, i_3 + i_1 - i_10, i_2, i_10, -16777216, (byte) -47);
				}

				i_1 += i_10;
				i_3 -= i_10 * 2;
			}
		}

		client.anInt7451 = i_3 * i_7 / 334;
		client.anInt7444 = i_0;
		client.anInt7445 = i_1;
		client.anInt7188 = (short) i_2;
		client.anInt7440 = (short) i_3;
	}

	public static int[] method8266(int i_0, int i_1, int i_2, int i_3, int i_4, float f_5, boolean bool_6, byte b_7) {
		int[] ints_8 = new int[i_0];
		Class282_Sub20_Sub4 class282_sub20_sub4_9 = new Class282_Sub20_Sub4();
		class282_sub20_sub4_9.anInt9733 = i_1;
		class282_sub20_sub4_9.aBool9726 = bool_6;
		class282_sub20_sub4_9.anInt9725 = i_2;
		class282_sub20_sub4_9.anInt9735 = i_3;
		class282_sub20_sub4_9.anInt9736 = i_4;
		class282_sub20_sub4_9.anInt9737 = (int) (4096.0F * f_5);
		class282_sub20_sub4_9.method12321(1061037797);
		Class316.method5593(i_0, 1, -383407250);
		class282_sub20_sub4_9.method15197(0, ints_8, 915556346);
		return ints_8;
	}

}
