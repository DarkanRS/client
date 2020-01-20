public class Class176 {
	
	float aFloat2193;
	int anInt2195;
	int anInt2196;
	int anInt2197;
	int anInt2198;
	static FontMetrics aClass414_2200;
	static BuildEnvironment BUILD_ENVIRONMENT;
	float aFloat2190 = 1.0F;
	float aFloat2191 = 1.0F;
	int anInt2192;
	int anInt2189;
	int anInt2199;
	int anInt2194;

	void method2968(Class176 class176_1) {
		this.aFloat2190 = class176_1.aFloat2190;
		this.aFloat2191 = class176_1.aFloat2191;
		this.anInt2192 = class176_1.anInt2192;
		this.anInt2189 = class176_1.anInt2189;
		this.anInt2199 = class176_1.anInt2199;
		this.anInt2194 = class176_1.anInt2194;
	}

	Class176(int i_1, float f_2, float f_3, int i_4, int i_5, int i_6) {
		this.anInt2199 = i_1;
		this.aFloat2190 = f_2;
		this.aFloat2191 = f_3;
		this.anInt2192 = i_4;
		this.anInt2189 = i_5;
		this.anInt2194 = i_6;
	}

	Class176(int i_1) {
		this.anInt2199 = i_1;
	}

	Class176 method2972() {
		return new Class176(this.anInt2199, this.aFloat2190, this.aFloat2191, this.anInt2192, this.anInt2189, this.anInt2194);
	}

	public static void method2977(int i_0) {
		CutsceneAction_Sub5.method14243();
	}

	static long method2979(int i_0) {
		return Engine.aClass273_3244.method4852();
	}

	static boolean method2980(int i_0, int i_1) {
		return i_0 == 5 || i_0 == 0 || i_0 == 7 || i_0 == 13;
	}
}
