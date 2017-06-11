/* Class298_Sub32_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub14 extends Class298_Sub32 {
	static boolean aBoolean9399 = false;
	public static Class477 aClass477_9400;

	void method3137(int i, RsByteBuffer class298_sub53, byte i_0_) {
		try {
			if (0 == i)
				aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahc.r(").append(')').toString());
		}
	}

	void method3214(int i, RsByteBuffer class298_sub53) {
		if (0 == i)
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
	}

	int[][] method3132(int i, byte i_1_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 45);
			if (aClass239_7380.aBoolean2607) {
				int[][] is_2_ = method3134(0, i, (byte) 8);
				int[] is_3_ = is_2_[0];
				int[] is_4_ = is_2_[1];
				int[] is_5_ = is_2_[2];
				int[] is_6_ = is[0];
				int[] is_7_ = is[1];
				int[] is_8_ = is[2];
				for (int i_9_ = 0; i_9_ < -1474554145 * Class250.anInt2755; i_9_++) {
					is_6_[i_9_] = 4096 - is_3_[i_9_];
					is_7_[i_9_] = 4096 - is_4_[i_9_];
					is_8_[i_9_] = 4096 - is_5_[i_9_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahc.k(").append(')').toString());
		}
	}

	int[] method3215(int i) {
		int[] is = aClass257_7384.method2448(i, 2004100981);
		if (aClass257_7384.aBoolean2810) {
			int[] is_10_ = method3129(0, i, -1887337990);
			for (int i_11_ = 0; i_11_ < Class250.anInt2755 * -1474554145; i_11_++)
				is[i_11_] = 4096 - is_10_[i_11_];
		}
		return is;
	}

	public Class298_Sub32_Sub14() {
		super(1, false);
	}

	int[] method3216(int i) {
		int[] is = aClass257_7384.method2448(i, 861368495);
		if (aClass257_7384.aBoolean2810) {
			int[] is_12_ = method3129(0, i, -1887337990);
			for (int i_13_ = 0; i_13_ < Class250.anInt2755 * -1474554145; i_13_++)
				is[i_13_] = 4096 - is_12_[i_13_];
		}
		return is;
	}

	int[] method3131(int i, int i_14_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1893218211);
			if (aClass257_7384.aBoolean2810) {
				int[] is_15_ = method3129(0, i, -1887337990);
				for (int i_16_ = 0; i_16_ < Class250.anInt2755 * -1474554145; i_16_++)
					is[i_16_] = 4096 - is_15_[i_16_];
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahc.i(").append(')').toString());
		}
	}

	void method3217(int i, RsByteBuffer class298_sub53) {
		if (0 == i)
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
	}

	int[][] method3218(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 72);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_17_ = method3134(0, i, (byte) 8);
			int[] is_18_ = is_17_[0];
			int[] is_19_ = is_17_[1];
			int[] is_20_ = is_17_[2];
			int[] is_21_ = is[0];
			int[] is_22_ = is[1];
			int[] is_23_ = is[2];
			for (int i_24_ = 0; i_24_ < -1474554145 * Class250.anInt2755; i_24_++) {
				is_21_[i_24_] = 4096 - is_18_[i_24_];
				is_22_[i_24_] = 4096 - is_19_[i_24_];
				is_23_[i_24_] = 4096 - is_20_[i_24_];
			}
		}
		return is;
	}

	int[][] method3219(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 123);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_25_ = method3134(0, i, (byte) 8);
			int[] is_26_ = is_25_[0];
			int[] is_27_ = is_25_[1];
			int[] is_28_ = is_25_[2];
			int[] is_29_ = is[0];
			int[] is_30_ = is[1];
			int[] is_31_ = is[2];
			for (int i_32_ = 0; i_32_ < -1474554145 * Class250.anInt2755; i_32_++) {
				is_29_[i_32_] = 4096 - is_26_[i_32_];
				is_30_[i_32_] = 4096 - is_27_[i_32_];
				is_31_[i_32_] = 4096 - is_28_[i_32_];
			}
		}
		return is;
	}
}
