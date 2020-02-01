package com.jagex;
public class Class492 {

	public static JS5GrabWorker[] aClass327_Sub1Array5777;

	static IterableNodeMap INDEX36_FILE_CACHE = new IterableNodeMap(4);

	static Class502 aClass502_5776 = new Class502();

	Class492() throws Throwable {
		throw new Error();
	}

	static final boolean method8264(ObjectIndexLoader objectindexloader_0, int i_1, int i_2) {
		ObjectDefinitions objectdefinitions_4 = objectindexloader_0.getObjectDefinitions(i_1);
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

	public static int[] method8266() {
		int[] ints_8 = new int[2048];
		Node_Sub20_Sub4 class282_sub20_sub4_9 = new Node_Sub20_Sub4();
		class282_sub20_sub4_9.anInt9733 = 35;
		class282_sub20_sub4_9.aBool9726 = true;
		class282_sub20_sub4_9.anInt9725 = 8;
		class282_sub20_sub4_9.anInt9735 = 8;
		class282_sub20_sub4_9.anInt9736 = 4;
		class282_sub20_sub4_9.anInt9737 = (int) (4096.0F * (float) 0.4);
		class282_sub20_sub4_9.method12321(1061037797);
		Class316.method5593(2048, 1, -383407250);
		class282_sub20_sub4_9.method15197(0, ints_8);
		return ints_8;
	}
}
