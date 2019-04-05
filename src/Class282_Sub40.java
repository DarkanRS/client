public class Class282_Sub40 extends Node {

	static float[] aFloatArray8013 = new float[3];

	int anInt8010;

	int anInt8006;

	int anInt8008;

	float aFloat8011;

	float aFloat8012;

	SurfaceSkin aClass172_8009;

	Class345 aClass345_8007;

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

	Class282_Sub40(SurfaceSkin class172_1, ParticleSystem class539_2) {
		this.aClass172_8009 = class172_1;
		this.aClass345_8007 = this.aClass172_8009.method2913(-1334854713);
		this.method13298((byte) -35);
	}

	public static void method13300(int i_0) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8208, 2, 1787860729);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8209, 2, -262111418);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub23_8202, 1, 805134423);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub17_8200, 1, 901728448);
		Class393.preferences.setValue(Class393.preferences.idleAnimations, 1, 1356970908);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub26_8224, 1, -2135009160);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub28_8212, 1, -1797604906);
		Class393.preferences.setValue(Class393.preferences.textures, 1, -1288035070);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub2_8205, 1, -1070811454);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub19_8204, 1, 1324855689);
		Class393.preferences.setValue(Class393.preferences.water, 0, -1873038629);
		Class393.preferences.setValue(Class393.preferences.fog, 1, 161881697);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8187, 0, -160088461);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8223, 0, -27348328);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub20_8207, 1, 989070776);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub1_8197, Class106.aClass106_1075.anInt1071, 259124869);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub12_8195, 0, 1402342862);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub14_8211, 1, -1616300201);
		ImageIndexLoader.method5777(1459972295);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub7_8210, 1, 100643539);
		Class393.preferences.setValue(Class393.preferences.graphics, 3, -1425167451);
		Class94.method1589();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048(2045600476);
		client.aBool7185 = true;
	}
}
