import java.util.Stack;

public class Class285 {

	public Transform_Sub1 aTransform_Sub1_3391;

	boolean aBool3392;

	Login aClass284_3393;

	public static FontRenderer aFontRenderer_3394;

	static Stack aStack3390 = new Stack();

	public boolean method5019(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		int i_5 = this.aTransform_Sub1_3391.method12996();
		if (this.aTransform_Sub1_3391.aEntityNode_Sub5Array7965 != null) {
			for (int i_6 = 0; i_6 < this.aTransform_Sub1_3391.aEntityNode_Sub5Array7965.length; i_6++) {
				this.aTransform_Sub1_3391.aEntityNode_Sub5Array7965[i_6].anInt7851 <<= i_5;
				if (this.aTransform_Sub1_3391.aEntityNode_Sub5Array7965[i_6].method12594(this.aClass284_3393.anInt3387 + i_2, i_3 + this.aClass284_3393.anInt3385) && this.aTransform_Sub1_3391.method12983(graphicalrenderer_1, i_2, i_3)) {
					this.aTransform_Sub1_3391.aEntityNode_Sub5Array7965[i_6].anInt7851 >>= i_5;
					return true;
				}
				this.aTransform_Sub1_3391.aEntityNode_Sub5Array7965[i_6].anInt7851 >>= i_5;
			}
		}
		return false;
	}

	public static String method5025(CharSequence charsequence_0) {
		String string_2 = Class179.method3018(Class366.method6302(charsequence_0));
		if (string_2 == null) {
			string_2 = "";
		}
		return string_2;
	}

	public static int method5026(CharSequence charsequence_0, byte b_2) {
		return Utils.parseInt(charsequence_0, 16);
	}

	public static int getCRC(byte[] data, int length) {
		return Class455.getCRC(data, 0, length);
	}
}
