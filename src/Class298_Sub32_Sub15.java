/* Class298_Sub32_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub15 extends Class298_Sub32 {
	static int anInt9401 = 3072;
	static boolean aBoolean9402 = false;
	int anInt9403 = 393499648;
	static int anInt9404 = 1024;
	int anInt9405 = -1843463168;
	int anInt9406 = 2131159040;

	void method3220() {
		((Class298_Sub32_Sub15) this).anInt9406 = (1512790825 * ((Class298_Sub32_Sub15) this).anInt9405 - 594851497 * ((Class298_Sub32_Sub15) this).anInt9403);
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 2037025007);
			if (aClass257_7384.aBoolean2810) {
				int[] is_1_ = method3129(0, i, -1887337990);
				for (int i_2_ = 0; i_2_ < Class250.anInt2755 * -1474554145; i_2_++)
					is[i_2_] = (((Class298_Sub32_Sub15) this).anInt9403 * -646346179 + ((is_1_[i_2_] * (((Class298_Sub32_Sub15) this).anInt9406 * 836630389)) >> 12));
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahd.i(").append(')').toString());
		}
	}

	int[][] method3132(int i, byte i_3_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 22);
			if (aClass239_7380.aBoolean2607) {
				int[][] is_4_ = method3134(0, i, (byte) 8);
				int[] is_5_ = is_4_[0];
				int[] is_6_ = is_4_[1];
				int[] is_7_ = is_4_[2];
				int[] is_8_ = is[0];
				int[] is_9_ = is[1];
				int[] is_10_ = is[2];
				for (int i_11_ = 0; i_11_ < Class250.anInt2755 * -1474554145; i_11_++) {
					is_8_[i_11_] = (((is_5_[i_11_] * (836630389 * ((Class298_Sub32_Sub15) this).anInt9406)) >> 12) + (((Class298_Sub32_Sub15) this).anInt9403 * -646346179));
					is_9_[i_11_] = (((Class298_Sub32_Sub15) this).anInt9403 * -646346179 + ((836630389 * ((Class298_Sub32_Sub15) this).anInt9406 * is_6_[i_11_]) >> 12));
					is_10_[i_11_] = (-646346179 * ((Class298_Sub32_Sub15) this).anInt9403 + ((is_7_[i_11_] * (836630389 * ((Class298_Sub32_Sub15) this).anInt9406)) >> 12));
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahd.k(").append(')').toString());
		}
	}

	void method3133(int i) {
		try {
			((Class298_Sub32_Sub15) this).anInt9406 = (1512790825 * ((Class298_Sub32_Sub15) this).anInt9405 - 594851497 * ((Class298_Sub32_Sub15) this).anInt9403);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahd.x(").append(')').toString());
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_12_) {
		try {
			switch (i) {
			case 1:
				((Class298_Sub32_Sub15) this).anInt9405 = class298_sub53.readUnsignedShort() * 1566671509;
				break;
			case 2:
				aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
				break;
			case 0:
				((Class298_Sub32_Sub15) this).anInt9403 = class298_sub53.readUnsignedShort() * -947528427;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahd.r(").append(')').toString());
		}
	}

	int[][] method3221(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 3);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_13_ = method3134(0, i, (byte) 8);
			int[] is_14_ = is_13_[0];
			int[] is_15_ = is_13_[1];
			int[] is_16_ = is_13_[2];
			int[] is_17_ = is[0];
			int[] is_18_ = is[1];
			int[] is_19_ = is[2];
			for (int i_20_ = 0; i_20_ < Class250.anInt2755 * -1474554145; i_20_++) {
				is_17_[i_20_] = (((is_14_[i_20_] * (836630389 * ((Class298_Sub32_Sub15) this).anInt9406)) >> 12) + ((Class298_Sub32_Sub15) this).anInt9403 * -646346179);
				is_18_[i_20_] = (((Class298_Sub32_Sub15) this).anInt9403 * -646346179 + ((836630389 * ((Class298_Sub32_Sub15) this).anInt9406 * is_15_[i_20_]) >> 12));
				is_19_[i_20_] = (-646346179 * ((Class298_Sub32_Sub15) this).anInt9403 + ((is_16_[i_20_] * (836630389 * ((Class298_Sub32_Sub15) this).anInt9406)) >> 12));
			}
		}
		return is;
	}

	int[] method3222(int i) {
		int[] is = aClass257_7384.method2448(i, -40972653);
		if (aClass257_7384.aBoolean2810) {
			int[] is_21_ = method3129(0, i, -1887337990);
			for (int i_22_ = 0; i_22_ < Class250.anInt2755 * -1474554145; i_22_++)
				is[i_22_] = (((Class298_Sub32_Sub15) this).anInt9403 * -646346179 + ((is_21_[i_22_] * (((Class298_Sub32_Sub15) this).anInt9406 * 836630389)) >> 12));
		}
		return is;
	}

	void method3223() {
		((Class298_Sub32_Sub15) this).anInt9406 = (1512790825 * ((Class298_Sub32_Sub15) this).anInt9405 - 594851497 * ((Class298_Sub32_Sub15) this).anInt9403);
	}

	void method3224() {
		((Class298_Sub32_Sub15) this).anInt9406 = (1512790825 * ((Class298_Sub32_Sub15) this).anInt9405 - 594851497 * ((Class298_Sub32_Sub15) this).anInt9403);
	}

	public Class298_Sub32_Sub15() {
		super(1, false);
	}

	void method3225(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub15) this).anInt9405 = class298_sub53.readUnsignedShort() * 1566671509;
			break;
		case 2:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 0:
			((Class298_Sub32_Sub15) this).anInt9403 = class298_sub53.readUnsignedShort() * -947528427;
			break;
		}
	}

	void method3226(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub15) this).anInt9405 = class298_sub53.readUnsignedShort() * 1566671509;
			break;
		case 2:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 0:
			((Class298_Sub32_Sub15) this).anInt9403 = class298_sub53.readUnsignedShort() * -947528427;
			break;
		}
	}

	int[][] method3227(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 12);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_23_ = method3134(0, i, (byte) 8);
			int[] is_24_ = is_23_[0];
			int[] is_25_ = is_23_[1];
			int[] is_26_ = is_23_[2];
			int[] is_27_ = is[0];
			int[] is_28_ = is[1];
			int[] is_29_ = is[2];
			for (int i_30_ = 0; i_30_ < Class250.anInt2755 * -1474554145; i_30_++) {
				is_27_[i_30_] = (((is_24_[i_30_] * (836630389 * ((Class298_Sub32_Sub15) this).anInt9406)) >> 12) + ((Class298_Sub32_Sub15) this).anInt9403 * -646346179);
				is_28_[i_30_] = (((Class298_Sub32_Sub15) this).anInt9403 * -646346179 + ((836630389 * ((Class298_Sub32_Sub15) this).anInt9406 * is_25_[i_30_]) >> 12));
				is_29_[i_30_] = (-646346179 * ((Class298_Sub32_Sub15) this).anInt9403 + ((is_26_[i_30_] * (836630389 * ((Class298_Sub32_Sub15) this).anInt9406)) >> 12));
			}
		}
		return is;
	}

	int[] method3228(int i) {
		int[] is = aClass257_7384.method2448(i, 1579385848);
		if (aClass257_7384.aBoolean2810) {
			int[] is_31_ = method3129(0, i, -1887337990);
			for (int i_32_ = 0; i_32_ < Class250.anInt2755 * -1474554145; i_32_++)
				is[i_32_] = (((Class298_Sub32_Sub15) this).anInt9403 * -646346179 + ((is_31_[i_32_] * (((Class298_Sub32_Sub15) this).anInt9406 * 836630389)) >> 12));
		}
		return is;
	}
}
