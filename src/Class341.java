public class Class341 {

	static int anInt3996;
	public int anInt3992;
	public int anInt3993;
	public int anInt3994;
	public int anInt3995;

	Class341(int i_1, int i_2, int i_3, int i_4) {
		this.anInt3992 = i_1;
		this.anInt3993 = i_2;
		this.anInt3994 = i_3;
		this.anInt3995 = i_4;
	}

	Class341() {
		this.anInt3992 = 32 + (int) (Math.random() * 4.0D);
		this.anInt3993 = 3 + (int) (Math.random() * 2.0D);
		this.anInt3994 = 16 + (int) (Math.random() * 3.0D);
		if (Class393.preferences.textures.method12873(1888881077) == 1) {
			this.anInt3995 = (int) (Math.random() * 6.0D);
		} else {
			this.anInt3995 = (int) (Math.random() * 12.0D);
		}

	}

	static final void method6073(CS2Executor cs2executor_0, byte b_1) {
		Class282_Sub50_Sub6 class282_sub50_sub6_2 = Class291.method5130(cs2executor_0.intStack[--cs2executor_0.intStackPtr]);
		if (class282_sub50_sub6_2 != null) {
			if (b_1 == -1) {
				throw new IllegalStateException();
			}

			if (class282_sub50_sub6_2.aString9534 != null) {
				cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = class282_sub50_sub6_2.aString9534;
				return;
			}

			if (b_1 != -1) {
				;
			}
		}

		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
	}

	static void method6074(String[] arr_0, int i_1) {
		if (arr_0.length > 1) {
			for (int i_2 = 0; i_2 < arr_0.length; i_2++) {
				if (arr_0[i_2].startsWith("pause")) {
					int i_3 = 5;

					try {
						i_3 = Integer.parseInt(arr_0[i_2].substring(6));
					} catch (Exception exception_5) {
						;
					}

					Class209.method3598("Pausing for " + i_3 + " seconds...", -1904731219);
					Class276.aStringArray3345 = arr_0;
					Class179.anInt2231 = i_2 + 1;
					Class179.aLong2232 = Class169.time() + (long) (i_3 * 1000);
					break;
				}

				Class179.aString2225 = arr_0[i_2];
				Class165.method2853(false, -76104076);
			}
		} else {
			Class179.aString2225 = Class179.aString2225 + arr_0[0];
			Class179.anInt2220 += arr_0[0].length();
		}

	}

}
