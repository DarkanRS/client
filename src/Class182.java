import java.awt.datatransfer.Clipboard;

public class Class182 {

	static GraphicalRenderer HARDWARE_RENDERER;

	static FontRenderer aFontRenderer_2259;

	public static NativeSprite[] aNativeSpriteArray2261;

	public static int anInt2262;

	public static Clipboard aClipboard2263;

	static NodeCollection ITEMS = new NodeCollection();

	Class182() throws Throwable {
		throw new Error();
	}

	public static BuildEnvironment method3040(int i_0, byte b_1) {
		BuildEnvironment[] arr_2 = EntityNode_Sub6.method12598();
		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			BuildEnvironment class472_4 = arr_2[i_3];
			if (i_0 == class472_4.id) {
				return class472_4;
			}
		}
		return null;
	}

	public static String method3044(String string_0) {
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
