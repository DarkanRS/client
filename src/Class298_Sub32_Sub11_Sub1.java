/* Class298_Sub32_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub11_Sub1 extends Class298_Sub32_Sub11 {
	int[][] method3205(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 53);
		if (aClass239_7380.aBoolean2607 && method3203(1713215539)) {
			int[] is_0_ = is[0];
			int[] is_1_ = is[1];
			int[] is_2_ = is[2];
			int i_3_ = (((Class298_Sub32_Sub11_Sub1) this).anInt9397 * -2125962517 * (i % (-2125962517 * ((Class298_Sub32_Sub11_Sub1) this).anInt9397)));
			for (int i_4_ = 0; i_4_ < Class250.anInt2755 * -1474554145; i_4_++) {
				int i_5_ = (((Class298_Sub32_Sub11_Sub1) this).anIntArray9398[i_4_ % (1274885639 * (((Class298_Sub32_Sub11_Sub1) this).anInt9396)) + i_3_]);
				is_2_[i_4_] = (i_5_ & 0xff) << 4;
				is_1_[i_4_] = (i_5_ & 0xff00) >> 4;
				is_0_[i_4_] = (i_5_ & 0xff0000) >> 12;
			}
		}
		return is;
	}

	int[][] method3132(int i, byte i_6_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 33);
			if (aClass239_7380.aBoolean2607 && method3203(372008576)) {
				int[] is_7_ = is[0];
				int[] is_8_ = is[1];
				int[] is_9_ = is[2];
				int i_10_ = (((Class298_Sub32_Sub11_Sub1) this).anInt9397 * -2125962517 * (i % (-2125962517 * ((Class298_Sub32_Sub11_Sub1) this).anInt9397)));
				for (int i_11_ = 0; i_11_ < Class250.anInt2755 * -1474554145; i_11_++) {
					int i_12_ = (((Class298_Sub32_Sub11_Sub1) this).anIntArray9398[i_11_ % (1274885639 * (((Class298_Sub32_Sub11_Sub1) this).anInt9396)) + i_10_]);
					is_9_[i_11_] = (i_12_ & 0xff) << 4;
					is_8_[i_11_] = (i_12_ & 0xff00) >> 4;
					is_7_[i_11_] = (i_12_ & 0xff0000) >> 12;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akg.k(").append(')').toString());
		}
	}

	int[][] method3206(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 74);
		if (aClass239_7380.aBoolean2607 && method3203(-1769350678)) {
			int[] is_13_ = is[0];
			int[] is_14_ = is[1];
			int[] is_15_ = is[2];
			int i_16_ = (((Class298_Sub32_Sub11_Sub1) this).anInt9397 * -2125962517 * (i % (-2125962517 * ((Class298_Sub32_Sub11_Sub1) this).anInt9397)));
			for (int i_17_ = 0; i_17_ < Class250.anInt2755 * -1474554145; i_17_++) {
				int i_18_ = (((Class298_Sub32_Sub11_Sub1) this).anIntArray9398[i_17_ % (1274885639 * (((Class298_Sub32_Sub11_Sub1) this).anInt9396)) + i_16_]);
				is_15_[i_17_] = (i_18_ & 0xff) << 4;
				is_14_[i_17_] = (i_18_ & 0xff00) >> 4;
				is_13_[i_17_] = (i_18_ & 0xff0000) >> 12;
			}
		}
		return is;
	}
}
