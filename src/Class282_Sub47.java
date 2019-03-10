public class Class282_Sub47 extends Node {

	public Object anObject8068;

	public Class282_Sub47(Object object_1) {
		this.anObject8068 = object_1;
	}

	static void method13409(GraphicalRenderer graphicalrenderer_0, int i_1) {
		graphicalrenderer_0.r(0, 0, Class349.anInt4083, 350);
		graphicalrenderer_0.B(0, 0, Class349.anInt4083, 350, Class179.anInt2221 << 24 | 0x332277, 1);
		int i_2 = 350 / Class179.anInt2222;
		int i_3;
		if (Class179.anInt2227 > 0) {
			i_3 = 346 - Class179.anInt2222 - 4;
			int i_4 = i_2 * i_3 / (i_2 + Class179.anInt2227 - 1);
			int i_5 = 4;
			if (Class179.anInt2227 > 1) {
				i_5 += (i_3 - i_4) * (Class179.anInt2227 - 1 - Class179.anInt2223) / (Class179.anInt2227 - 1);
			}
			graphicalrenderer_0.B(Class349.anInt4083 - 16, i_5, 12, i_4, Class179.anInt2221 << 24 | 0x332277, 2);
			for (int i_6 = Class179.anInt2223; i_6 < i_2 + Class179.anInt2223 && i_6 < Class179.anInt2227; i_6++) {
				String[] arr_7 = Class456_Sub3.method12681(Class13.aStringArray129[i_6], '\b', 229848533);
				int i_8 = (Class349.anInt4083 - 8 - 16) / arr_7.length;
				for (int i_9 = 0; i_9 < arr_7.length; i_9++) {
					int i_10 = i_9 * i_8 + 8;
					graphicalrenderer_0.r(i_10, 0, i_8 + i_10 - 8, 350);
					Class16.aClass8_144.renderText(Class400.method6793(arr_7[i_9], (byte) 1), i_10, 350 - Class179.anInt2230 - 2 - Class16.aClass414_139.anInt4979 - (i_6 - Class179.anInt2223) * Class179.anInt2222, -1, -16777216, -418109423);
				}
			}
		}
		Renderers.FONT_RENDERER.method359("727 1", Class349.anInt4083 - 25, 330, -1, -16777216, 1878721557);
		graphicalrenderer_0.r(0, 0, Class349.anInt4083, 350);
		graphicalrenderer_0.method8659(0, 350 - Class179.anInt2230, Class349.anInt4083, -1, -51892104);
		Class285.aClass8_3394.renderText("--> " + Class400.method6793(Class179.aString2225, (byte) 1), 10, 350 - Class288.aClass414_3438.anInt4979 - 1, -1, -16777216, -418109423);
		if (Class530.aBool7050) {
			i_3 = -1;
			if (client.cycles % 30 > 15) {
				i_3 = 16777215;
			}
			graphicalrenderer_0.method8428(10 + Class288.aClass414_3438.getWidthNoSprites("--> " + Class400.method6793(Class179.aString2225, (byte) 1).substring(0, Class179.anInt2220), -1967833701), 350 - Class288.aClass414_3438.anInt4979 - 11, 12, i_3, -1796764807);
		}
		graphicalrenderer_0.L();
		Class18.method574((short) 324);
	}
}
