public class Node_Sub40 extends Node {

	static float[] aFloatArray8013 = new float[3];
	int anInt8010;
	int anInt8006;
	int anInt8008;
	float aFloat8011;
	float aFloat8012;
	SurfaceSkin aClass172_8009;
	ParticleArchive1Def aClass345_8007;

	void method13298(byte b_1) {
		this.anInt8010 = this.aClass172_8009.anInt2113;
		this.anInt8006 = this.aClass172_8009.anInt2117;
		this.anInt8008 = this.aClass172_8009.anInt2118;
		if (this.aClass172_8009.aClass384_2116 != null) {
			this.aClass172_8009.aClass384_2116.method6614((float) this.aClass345_8007.anInt4027, (float) this.aClass345_8007.anInt4036, (float) this.aClass345_8007.anInt4037, aFloatArray8013);
		}
		this.aFloat8011 = aFloatArray8013[0];
		this.aFloat8012 = aFloatArray8013[2];
	}

	Node_Sub40(SurfaceSkin class172_1, ParticleSystem class539_2) {
		this.aClass172_8009 = class172_1;
		this.aClass345_8007 = this.aClass172_8009.method2913(-1334854713);
		this.method13298((byte) -35);
	}

	public static void method13300(int i_0) {
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub27_8208, 2);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub27_8209, 2);
		Class393.preferences.setValue(Class393.preferences.groundDecoration, 1);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub17_8200, 1);
		Class393.preferences.setValue(Class393.preferences.idleAnimations, 1);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub26_8224, 1);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub28_8212, 1);
		Class393.preferences.setValue(Class393.preferences.textures, 1);
		Class393.preferences.setValue(Class393.preferences.sceneryShadows, 1);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub19_8204, 1);
		Class393.preferences.setValue(Class393.preferences.water, 0);
		Class393.preferences.setValue(Class393.preferences.fog, 1);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub4_8187, 0);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub4_8223, 0);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub20_8207, 1);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub1_8197, MapSize.aClass106_1075.anInt1071);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub12_8195, 0);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub14_8211, 1);
		ImageIndexLoader.method5777(1459972295);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub7_8210, 1);
		Class393.preferences.setValue(Class393.preferences.graphics, 3);
		Class94.method1589();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048(2045600476);
		client.aBool7185 = true;
	}
}
