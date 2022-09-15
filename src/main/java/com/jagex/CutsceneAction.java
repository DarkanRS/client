package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public abstract class CutsceneAction {

	static String formatStringToError(String errorString, String errorPrevious, String errorNext) {
		String exceptionStr = "";
		if(errorString.contains("|")) {
			exceptionStr = errorString.substring(errorString.indexOf("|")+1, errorString.indexOf("|", errorString.indexOf("|") + 1));
			errorString = errorString.replaceFirst(exceptionStr, "");
			exceptionStr = exceptionStr.replaceAll(" ", "");
			errorString = exceptionStr + " " + errorString;
		}
		for (int i = errorString.indexOf(errorPrevious); i != -1; i = errorString.indexOf(errorPrevious, i + errorNext.length()))
			errorString = errorString.substring(0, i) + errorNext + errorString.substring(i + errorPrevious.length());
		return errorString.split("\\|\\|")[0];
	}

	public static Interface getInterfaceByIdFromHash(int i_0) {
		return Interface.INTERFACES[i_0 >> 16];
	}

	public static void method1607() {
		ClanSettings.aNativeSprite_647 = null;
		Class60.aNativeSprite_612 = null;
		Class467.aNativeSprite_5576 = null;
		ParamDefinitions.aNativeSprite_5339 = null;
		HeadbarIndexLoader.aNativeSprite_3452 = null;
		Class354.aNativeSprite_4110 = null;
		Class125.aNativeSprite_1571 = null;
		Class149_Sub2.aNativeSprite_9315 = null;
		Class186.aFontRenderer_2348 = null;
		Class176.aClass414_2200 = null;
	}

	public int anInt992;

	CutsceneAction(ByteBuf rsbytebuffer_1) {
		anInt992 = rsbytebuffer_1.readUnsignedShort();
	}

	public abstract void method1592();

	void method1593() {
	}

	boolean method1599() {
		return true;
	}
}
