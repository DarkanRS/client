/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class280 {
	int anInt2981;
	int anInt2982;
	int anInt2983;
	int anInt2984;
	int anInt2985 = Class298_Sub23.method3070(16);
	int anInt2986;
	int[] anIntArray2987;

	Class280() {
		((Class280) this).anInt2982 = Class298_Sub23.method3070(24);
		((Class280) this).anInt2981 = Class298_Sub23.method3070(24);
		((Class280) this).anInt2984 = Class298_Sub23.method3070(24) + 1;
		((Class280) this).anInt2983 = Class298_Sub23.method3070(6) + 1;
		((Class280) this).anInt2986 = Class298_Sub23.method3070(8);
		int[] is = new int[((Class280) this).anInt2983];
		for (int i = 0; i < ((Class280) this).anInt2983; i++) {
			int i_0_ = 0;
			int i_1_ = Class298_Sub23.method3070(3);
			boolean bool = Class298_Sub23.method3063() != 0;
			if (bool)
				i_0_ = Class298_Sub23.method3070(5);
			is[i] = i_0_ << 3 | i_1_;
		}
		((Class280) this).anIntArray2987 = new int[((Class280) this).anInt2983 * 8];
		for (int i = 0; i < ((Class280) this).anInt2983 * 8; i++)
			((Class280) this).anIntArray2987[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class298_Sub23.method3070(8) : -1);
	}

	void method2609(float[] fs, int i, boolean bool) {
		for (int i_2_ = 0; i_2_ < i; i_2_++)
			fs[i_2_] = 0.0F;
		if (!bool) {
			int i_3_ = (((Class265) (Class298_Sub23.aClass265Array7328[((Class280) this).anInt2986])).anInt2840);
			int i_4_ = ((Class280) this).anInt2981 - ((Class280) this).anInt2982;
			int i_5_ = i_4_ / ((Class280) this).anInt2984;
			int[] is = new int[i_5_];
			for (int i_6_ = 0; i_6_ < 8; i_6_++) {
				int i_7_ = 0;
				while (i_7_ < i_5_) {
					if (i_6_ == 0) {
						int i_8_ = Class298_Sub23.aClass265Array7328[((Class280) this).anInt2986].method2517();
						for (int i_9_ = i_3_ - 1; i_9_ >= 0; i_9_--) {
							if (i_7_ + i_9_ < i_5_)
								is[i_7_ + i_9_] = i_8_ % ((Class280) this).anInt2983;
							i_8_ /= ((Class280) this).anInt2983;
						}
					}
					for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
						int i_11_ = is[i_7_];
						int i_12_ = (((Class280) this).anIntArray2987[i_11_ * 8 + i_6_]);
						if (i_12_ >= 0) {
							int i_13_ = (((Class280) this).anInt2982 + i_7_ * ((Class280) this).anInt2984);
							Class265 class265 = Class298_Sub23.aClass265Array7328[i_12_];
							if (((Class280) this).anInt2985 == 0) {
								int i_14_ = (((Class280) this).anInt2984 / ((Class265) class265).anInt2840);
								for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
									float[] fs_16_ = class265.method2519();
									for (int i_17_ = 0; (i_17_ < ((Class265) class265).anInt2840); i_17_++)
										fs[i_13_ + i_15_ + i_17_ * i_14_] += fs_16_[i_17_];
								}
							} else {
								int i_18_ = 0;
								while (i_18_ < ((Class280) this).anInt2984) {
									float[] fs_19_ = class265.method2519();
									for (int i_20_ = 0; (i_20_ < ((Class265) class265).anInt2840); i_20_++) {
										fs[i_13_ + i_18_] += fs_19_[i_20_];
										i_18_++;
									}
								}
							}
						}
						if (++i_7_ >= i_5_)
							break;
					}
				}
			}
		}
	}
}
