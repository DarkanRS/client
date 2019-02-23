public class Class163 {

	int anInt2026;
	int anInt2027;
	String aString2028;
	int anInt2029;
	int anInt2030;
	public static Class209 aClass209_2031;

	public String method2829(int i_1) {
		return this.aString2028;
	}

	public int method2830(short s_1) {
		return this.anInt2027;
	}

	public int method2831(short s_1) {
		return this.anInt2029;
	}

	public int method2832(int i_1) {
		return this.anInt2026;
	}

	public int method2833(int i_1) {
		return this.anInt2030;
	}

	static int method2840(Class282_Sub50_Sub15 class282_sub50_sub15_0, FontMetrics fontmetrics_1, int i_2) {
		String string_3 = Class75.method1354(class282_sub50_sub15_0, -938758900);
		return fontmetrics_1.getWidth(string_3, Class115.aClass160Array1248);
	}

	static void method2841(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[cs2executor_0.intStackPtr - 2] = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[cs2executor_0.intStackPtr - 2], -1396181317).anIntArrayArray2966[cs2executor_0.intStack[cs2executor_0.intStackPtr - 1]][1];
		--cs2executor_0.intStackPtr;
	}

	public static TilestreamPacket[] method2842(int i_0) {
		return new TilestreamPacket[] { TilestreamPacket.aClass364_4209, TilestreamPacket.aClass364_4207, TilestreamPacket.aClass364_4206, TilestreamPacket.aClass364_4213, TilestreamPacket.aClass364_4208, TilestreamPacket.PROJECTILE, TilestreamPacket.aClass364_4210, TilestreamPacket.aClass364_4211, TilestreamPacket.aClass364_4205, TilestreamPacket.aClass364_4204, TilestreamPacket.aClass364_4214, TilestreamPacket.aClass364_4215, TilestreamPacket.aClass364_4216, TilestreamPacket.aClass364_4217, TilestreamPacket.aClass364_4218 };
	}

	public static Class350 method2843(RsByteBuffer rsbytebuffer_0, int i_1) {
		Class350 class350_2 = Class383.method6512(rsbytebuffer_0, 88062096);
		int i_3 = rsbytebuffer_0.readBigSmart();
		int i_4 = rsbytebuffer_0.readBigSmart();
		int i_5 = rsbytebuffer_0.readBigSmart();
		int i_6 = rsbytebuffer_0.readBigSmart();
		int i_7 = rsbytebuffer_0.readBigSmart();
		int i_8 = rsbytebuffer_0.readBigSmart();
		return new Class350_Sub3(class350_2.aClass356_4094, class350_2.aClass353_4087, class350_2.anInt4090, class350_2.anInt4089, class350_2.anInt4093, class350_2.anInt4088, class350_2.anInt4092, class350_2.anInt4086, class350_2.anInt4091, i_3, i_4, i_5, i_6, i_7, i_8);
	}

	static final void method2844(int i_0, int i_1, int i_2, int i_3, int i_4) {
		int i_5 = client.anInt7293;
		int i_6 = client.anInt7294;
		NativeSprite nativesprite_7;
		if (client.anInt7296 == 1) {
			nativesprite_7 = Class282_Sub36.aClass160Array7994[client.anInt7295 / 100];
			nativesprite_7.method2752(i_5 - 8, i_6 - 8);
		}

		if (client.anInt7296 == 2) {
			nativesprite_7 = Class282_Sub36.aClass160Array7994[client.anInt7295 / 100 + 4];
			nativesprite_7.method2752(i_5 - 8, i_6 - 8);
		}

	}

	public static FontMetrics method2845(Index index_0, int i_1, byte b_2) {
		byte[] bytes_3 = index_0.getFile(i_1);
		return bytes_3 == null ? null : new FontMetrics(bytes_3);
	}

}
