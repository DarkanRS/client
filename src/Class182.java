import java.awt.datatransfer.Clipboard;

public class Class182 {

	static GraphicalRenderer HARDWARE_RENDERER;
	static FontRenderer aClass8_2259;
	public static NativeSprite[] aClass160Array2261;
	public static int anInt2262;
	public static Clipboard aClipboard2263;
	static NodeCollection ITEMS = new NodeCollection();

	Class182() throws Throwable {
		throw new Error();
	}

	static final void method3038(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (i_2 == -1) {
			int i_3 = i_2 >> 14 & 0x3fff;
			int i_4 = i_2 & 0x3fff;
			CoordGrid coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(660934001);
			i_3 -= coordgrid_5.x;
			if (i_3 < 0) {
				i_3 = 0;
			} else if (i_3 >= IndexLoaders.MAP_REGION_DECODER.getSizeX(-1010474219)) {
				i_3 = IndexLoaders.MAP_REGION_DECODER.getSizeX(-751193521);
			}

			i_4 -= coordgrid_5.y;
			if (i_4 < 0) {
				i_4 = 0;
			} else if (i_4 >= IndexLoaders.MAP_REGION_DECODER.getSizeY(-281530054)) {
				i_4 = IndexLoaders.MAP_REGION_DECODER.getSizeY(-206286214);
			}

			Class508.anInt5864 = (i_3 << 9) + 256;
			Class86.anInt833 = (i_4 << 9) + 256;
		} else {
			Class508.anInt5864 = -1;
			Class86.anInt833 = -1;
		}

	}

	static final void method3039(CS2Executor cs2executor_0, byte b_1) {
		Class217_Sub1 class217_sub1_2 = IsaacCipher.method7266(2114553677);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class217_sub1_2 == null ? 0 : class217_sub1_2.anInt2700;
	}

	public static Class472 method3040(int i_0, byte b_1) {
		Class472[] arr_2 = Class275_Sub6.method12598(-1242125969);

		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			Class472 class472_4 = arr_2[i_3];
			if (i_0 == class472_4.anInt5602) {
				return class472_4;
			}
		}

		return null;
	}

	static final void method3041(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		ChatLine.method1845(icomponentdefinitions_3, interface_4, cs2executor_0, -1951994229);
	}

	static final void method3042(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		ItemDefinitions itemdefinitions_4 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 1029070809);
		if (i_3 >= 1 && i_3 <= 5 && itemdefinitions_4.groundOptions[i_3 - 1] != null) {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = itemdefinitions_4.groundOptions[i_3 - 1];
		} else {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = "";
		}

	}

	static final void method3043(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.aClass282_Sub4_7011.method12098((String) cs2executor_0.stringStack[--cs2executor_0.stringStackPtr], 1952889687);
	}

	public static String method3044(String string_0, int i_1) {
		int i_2 = string_0.length();
		int i_3 = 0;

		for (int i_4 = 0; i_4 < i_2; i_4++) {
			char var_5 = string_0.charAt(i_4);
			if (var_5 == 60 || var_5 == 62) {
				i_3 += 3;
			}
		}

		StringBuilder stringbuilder_7 = new StringBuilder(i_3 + i_2);

		for (int i_8 = 0; i_8 < i_2; i_8++) {
			char var_6 = string_0.charAt(i_8);
			if (var_6 == 60) {
				stringbuilder_7.append("<lt>");
			} else if (var_6 == 62) {
				stringbuilder_7.append("<gt>");
			} else {
				stringbuilder_7.append(var_6);
			}
		}

		return stringbuilder_7.toString();
	}

}
