package com.jagex;

public class Node_Sub40 extends Node {

	static float[] aFloatArray8013 = new float[3];
	public static void method13300() {
		Class393.preferences.setValue(Class393.preferences.removeRoofs, 2);
		Class393.preferences.setValue(Class393.preferences.removeRoofsOptionOverride, 2);
		Class393.preferences.setValue(Class393.preferences.groundDecor, 1);
		Class393.preferences.setValue(Class393.preferences.groundBlending, 1);
		Class393.preferences.setValue(Class393.preferences.idleAnimations, 1);
		Class393.preferences.setValue(Class393.preferences.flickeringEffects, 1);
		Class393.preferences.setValue(Class393.preferences.characterShadows, 1);
		Class393.preferences.setValue(Class393.preferences.textures, 1);
		Class393.preferences.setValue(Class393.preferences.sceneryShadows, 1);
		Class393.preferences.setValue(Class393.preferences.lightDetail, 1);
		Class393.preferences.setValue(Class393.preferences.water, 0);
		Class393.preferences.setValue(Class393.preferences.fog, 1);
		Class393.preferences.setValue(Class393.preferences.antiAliasingDefault, 0);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub4_8223, 0);
		Class393.preferences.setValue(Class393.preferences.particles, 1);
		Class393.preferences.setValue(Class393.preferences.buildArea, MapSize.SIZE_104.index);
		Class393.preferences.setValue(Class393.preferences.bloom, 0);
		Class393.preferences.setValue(Class393.preferences.skyBoxes, 1);
		ImageIndexLoader.method5777();
		Class393.preferences.setValue(Class393.preferences.maxScreenSize, 1);
		Class393.preferences.setValue(Class393.preferences.graphics, 3);
		Class94.method1589();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
		client.aBool7185 = true;
	}
	int anInt8010;
	int anInt8006;
	int anInt8008;
	float aFloat8011;
	float aFloat8012;
	SurfaceSkin aClass172_8009;

	ParticleArchive1Def aClass345_8007;

	Node_Sub40(SurfaceSkin class172_1) {
		aClass172_8009 = class172_1;
		aClass345_8007 = aClass172_8009.method2913();
		method13298();
	}

	void method13298() {
		anInt8010 = aClass172_8009.anInt2113;
		anInt8006 = aClass172_8009.anInt2117;
		anInt8008 = aClass172_8009.anInt2118;
		if (aClass172_8009.aClass384_2116 != null)
			aClass172_8009.aClass384_2116.method6614(aClass345_8007.anInt4027, aClass345_8007.anInt4036, aClass345_8007.anInt4037, aFloatArray8013);
		aFloat8011 = aFloatArray8013[0];
		aFloat8012 = aFloatArray8013[2];
	}
}
