package com.jagex;

public class Class122 {

	public static void method2109(NativeSprite[] arr_0) {
		Class20.anInt186 = arr_0.length;
		Class115.aNativeSpriteArray1248 = new NativeSprite[Class20.anInt186 + 10];
		Class20.anIntArray177 = new int[Class20.anInt186 + 10];
		System.arraycopy(arr_0, 0, Class115.aNativeSpriteArray1248, 0, Class20.anInt186);
		int i_2;
		for (i_2 = 0; i_2 < Class20.anInt186; i_2++)
			Class20.anIntArray177[i_2] = Class115.aNativeSpriteArray1248[i_2].method2748();
		for (i_2 = Class20.anInt186; i_2 < Class115.aNativeSpriteArray1248.length; i_2++)
			Class20.anIntArray177[i_2] = 12;
	}
	public static String method2110(String string_0, char var_1, String string_2) {
		int i_4 = string_0.length();
		int i_5 = string_2.length();
		int i_6 = i_4;
		int i_7 = i_5 - 1;
		if (i_7 != 0) {
			int i_8 = 0;
			while (true) {
				i_8 = string_0.indexOf(var_1, i_8);
				if (i_8 < 0)
					break;
				++i_8;
				i_6 += i_7;
			}
		}
		StringBuilder stringbuilder_11 = new StringBuilder(i_6);
		int i_9 = 0;
		while (true) {
			int i_10 = string_0.indexOf(var_1, i_9);
			if (i_10 < 0) {
				stringbuilder_11.append(string_0.substring(i_9));
				return stringbuilder_11.toString();
			}
			stringbuilder_11.append(string_0, i_9, i_10);
			stringbuilder_11.append(string_2);
			i_9 = i_10 + 1;
		}
	}
	public static void method2111(boolean bool_0) {
		if (bool_0 && Class291.aCacheableNode_Sub6_3491 != null)
			Class51.anInt488 = Class291.aCacheableNode_Sub6_3491.id;
		else
			Class51.anInt488 = -1;
		Class291.aCacheableNode_Sub6_3491 = null;
		QuickChatMessage.aClass482_4049 = null;
		Class291_Sub1.anInt8015 = 0;
		MaterialPropTexture.aClass118_9884 = null;
		Class291.method5137();
		Class291.aClass482_3459.removeAll();
		Class291.aClass283_3470 = null;
		Defaults7Loader.aNativeSprite_5883 = null;
		Class291_Sub1.anInt8014 = -1;
		Class291_Sub1.anInt8016 = -1;
		Static.aClass194_5794 = null;
		Class291_Sub1.aClass194_8017 = null;
		Class291_Sub1.aClass194_8023 = null;
		Class446.aClass194_5416 = null;
		ShaderLoader.aClass194_1243 = null;
		DefaultsFile.aClass194_6967 = null;
		RouteFinder.aClass194_3103 = null;
		WallObjectGraphNode.aClass194_10527 = null;
		if (Class291.MAP_AREA_LOADER != null) {
			Class291.MAP_AREA_LOADER.method3699();
			Class291.MAP_AREA_LOADER.method3697(128, 64);
		}
		if (Class291.MAP_SPRITE_LOADER != null)
			Class291.MAP_SPRITE_LOADER.method7175(64, 64);
		if (Class291.OBJECT_LOADER != null)
			Class291.OBJECT_LOADER.method7899(256);
		IndexLoaders.VARBIT_LOADER.method3906(64);
	}
	public int[] anIntArray1531;
	public int[] anIntArray1534;
	Class111 aClass111_1529;
	Class111 aClass111_1533;

	int anInt1528 = -1;

	String aString1530;

	String aString1532;

	void method2105(ShaderDecoder class100_1) {
		int i_3 = class100_1.getNextStringLength();
		aClass111_1529 = NPCIndexLoader.method6852()[i_3];
		int i_4;
		if (aClass111_1529 == Class111.aClass111_1109) {
			i_4 = class100_1.getNextStringLength();
			aClass111_1533 = NPCIndexLoader.method6852()[i_4];
			anInt1528 = class100_1.getNextStringLength();
		}
		aString1530 = class100_1.readString();
		aString1532 = class100_1.readString();
		i_4 = class100_1.getNextStringLength();
		anIntArray1531 = new int[i_4];
		anIntArray1534 = new int[i_4];
		for (int i_5 = 0; i_5 < i_4; i_5++) {
			anIntArray1531[i_5] = class100_1.getNextStringLength();
			anIntArray1534[i_5] = class100_1.getNextStringLength();
		}
	}
}
