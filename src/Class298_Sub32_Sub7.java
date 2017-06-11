/* Class298_Sub32_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub7 extends Class298_Sub32 {
	public Class298_Sub32_Sub7() {
		super(1, true);
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 233651340);
			if (aClass257_7384.aBoolean2810) {
				int[][] is_1_ = method3134(0, i, (byte) 8);
				int[] is_2_ = is_1_[0];
				int[] is_3_ = is_1_[1];
				int[] is_4_ = is_1_[2];
				for (int i_5_ = 0; i_5_ < -1474554145 * Class250.anInt2755; i_5_++)
					is[i_5_] = (is_4_[i_5_] + (is_3_[i_5_] + is_2_[i_5_])) / 3;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agt.i(").append(')').toString());
		}
	}

	int[] method3179(int i) {
		int[] is = aClass257_7384.method2448(i, 1878231521);
		if (aClass257_7384.aBoolean2810) {
			int[][] is_6_ = method3134(0, i, (byte) 8);
			int[] is_7_ = is_6_[0];
			int[] is_8_ = is_6_[1];
			int[] is_9_ = is_6_[2];
			for (int i_10_ = 0; i_10_ < -1474554145 * Class250.anInt2755; i_10_++)
				is[i_10_] = (is_9_[i_10_] + (is_8_[i_10_] + is_7_[i_10_])) / 3;
		}
		return is;
	}

	int[] method3180(int i) {
		int[] is = aClass257_7384.method2448(i, 1745127751);
		if (aClass257_7384.aBoolean2810) {
			int[][] is_11_ = method3134(0, i, (byte) 8);
			int[] is_12_ = is_11_[0];
			int[] is_13_ = is_11_[1];
			int[] is_14_ = is_11_[2];
			for (int i_15_ = 0; i_15_ < -1474554145 * Class250.anInt2755; i_15_++)
				is[i_15_] = (is_14_[i_15_] + (is_13_[i_15_] + is_12_[i_15_])) / 3;
		}
		return is;
	}
}
