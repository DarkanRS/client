public abstract class CutsceneAction {

	public int anInt992;

	public abstract void method1592();

	void method1593() {
	}

	CutsceneAction(RsByteBuffer rsbytebuffer_1) {
		this.anInt992 = rsbytebuffer_1.readUnsignedShort();
	}

	boolean method1599() {
		return true;
	}

	public abstract void method1601();

	public static RSInterface method1605(int i_0) {
		return CustomCursorsPreference.INTERFACES[i_0 >> 16];
	}

	public static void method1607(byte b_0) {
		ClanSettings.aNativeSprite_647 = null;
		Class60.aNativeSprite_612 = null;
		Class467.aNativeSprite_5576 = null;
		ParamDefinitions.aNativeSprite_5339 = null;
		HitbarIndexLoader.aNativeSprite_3452 = null;
		Class354.aNativeSprite_4110 = null;
		Class125.aNativeSprite_1571 = null;
		Class149_Sub2.aNativeSprite_9315 = null;
		Class186.aFontRenderer_2348 = null;
		Class176.aClass414_2200 = null;
	}

	static final String method1609(String string_0, String string_1, String string_2) {
		for (int i_4 = string_0.indexOf(string_1); i_4 != -1; i_4 = string_0.indexOf(string_1, i_4 + string_2.length())) {
			string_0 = string_0.substring(0, i_4) + string_2 + string_0.substring(i_4 + string_1.length());
		}
		return string_0;
	}
}
