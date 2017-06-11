/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class265 {
	int[] anIntArray2839;
	int anInt2840;
	int[] anIntArray2841;
	int[] anIntArray2842;
	float[][] aFloatArrayArray2843;
	int anInt2844;

	int method2517() {
		int i;
		for (i = 0; ((Class265) this).anIntArray2839[i] >= 0; i = (Class298_Sub23.method3063() != 0 ? ((Class265) this).anIntArray2839[i] : i + 1)) {
			/* empty */
		}
		return ((Class265) this).anIntArray2839[i] ^ 0xffffffff;
	}

	Class265() {
		Class298_Sub23.method3070(24);
		((Class265) this).anInt2840 = Class298_Sub23.method3070(16);
		((Class265) this).anInt2844 = Class298_Sub23.method3070(24);
		((Class265) this).anIntArray2841 = new int[((Class265) this).anInt2844];
		boolean bool = Class298_Sub23.method3063() != 0;
		if (bool) {
			int i = 0;
			int i_0_ = Class298_Sub23.method3070(5) + 1;
			while (i < ((Class265) this).anInt2844) {
				int i_1_ = (Class298_Sub23.method3070(Class87.method970(((Class265) this).anInt2844 - i, -187995264)));
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
					((Class265) this).anIntArray2841[i++] = i_0_;
				i_0_++;
			}
		} else {
			boolean bool_3_ = Class298_Sub23.method3063() != 0;
			for (int i = 0; i < ((Class265) this).anInt2844; i++) {
				if (bool_3_ && Class298_Sub23.method3063() == 0)
					((Class265) this).anIntArray2841[i] = 0;
				else
					((Class265) this).anIntArray2841[i] = Class298_Sub23.method3070(5) + 1;
			}
		}
		method2518();
		int i = Class298_Sub23.method3070(4);
		if (i > 0) {
			float f = Class298_Sub23.method3068(Class298_Sub23.method3070(32));
			float f_4_ = Class298_Sub23.method3068(Class298_Sub23.method3070(32));
			int i_5_ = Class298_Sub23.method3070(4) + 1;
			boolean bool_6_ = Class298_Sub23.method3063() != 0;
			int i_7_;
			if (i == 1)
				i_7_ = method2520(((Class265) this).anInt2844, ((Class265) this).anInt2840);
			else
				i_7_ = (((Class265) this).anInt2844 * ((Class265) this).anInt2840);
			((Class265) this).anIntArray2842 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				((Class265) this).anIntArray2842[i_8_] = Class298_Sub23.method3070(i_5_);
			((Class265) this).aFloatArrayArray2843 = (new float[((Class265) this).anInt2844][((Class265) this).anInt2840]);
			if (i == 1) {
				for (int i_9_ = 0; i_9_ < ((Class265) this).anInt2844; i_9_++) {
					float f_10_ = 0.0F;
					int i_11_ = 1;
					for (int i_12_ = 0; i_12_ < ((Class265) this).anInt2840; i_12_++) {
						int i_13_ = i_9_ / i_11_ % i_7_;
						float f_14_ = (((float) ((Class265) this).anIntArray2842[i_13_] * f_4_) + f + f_10_);
						((Class265) this).aFloatArrayArray2843[i_9_][i_12_] = f_14_;
						if (bool_6_)
							f_10_ = f_14_;
						i_11_ *= i_7_;
					}
				}
			} else {
				for (int i_15_ = 0; i_15_ < ((Class265) this).anInt2844; i_15_++) {
					float f_16_ = 0.0F;
					int i_17_ = i_15_ * ((Class265) this).anInt2840;
					for (int i_18_ = 0; i_18_ < ((Class265) this).anInt2840; i_18_++) {
						float f_19_ = (((float) ((Class265) this).anIntArray2842[i_17_] * f_4_) + f + f_16_);
						((Class265) this).aFloatArrayArray2843[i_15_][i_18_] = f_19_;
						if (bool_6_)
							f_16_ = f_19_;
						i_17_++;
					}
				}
			}
		}
	}

	void method2518() {
		int[] is = new int[((Class265) this).anInt2844];
		int[] is_20_ = new int[33];
		for (int i = 0; i < ((Class265) this).anInt2844; i++) {
			int i_21_ = ((Class265) this).anIntArray2841[i];
			if (i_21_ != 0) {
				int i_22_ = 1 << 32 - i_21_;
				int i_23_ = is_20_[i_21_];
				is[i] = i_23_;
				int i_24_;
				if ((i_23_ & i_22_) != 0)
					i_24_ = is_20_[i_21_ - 1];
				else {
					i_24_ = i_23_ | i_22_;
					for (int i_25_ = i_21_ - 1; i_25_ >= 1; i_25_--) {
						int i_26_ = is_20_[i_25_];
						if (i_26_ != i_23_)
							break;
						int i_27_ = 1 << 32 - i_25_;
						if ((i_26_ & i_27_) != 0) {
							is_20_[i_25_] = is_20_[i_25_ - 1];
							break;
						}
						is_20_[i_25_] = i_26_ | i_27_;
					}
				}
				is_20_[i_21_] = i_24_;
				for (int i_28_ = i_21_ + 1; i_28_ <= 32; i_28_++) {
					int i_29_ = is_20_[i_28_];
					if (i_29_ == i_23_)
						is_20_[i_28_] = i_24_;
				}
			}
		}
		((Class265) this).anIntArray2839 = new int[8];
		int i = 0;
		for (int i_30_ = 0; i_30_ < ((Class265) this).anInt2844; i_30_++) {
			int i_31_ = ((Class265) this).anIntArray2841[i_30_];
			if (i_31_ != 0) {
				int i_32_ = is[i_30_];
				int i_33_ = 0;
				for (int i_34_ = 0; i_34_ < i_31_; i_34_++) {
					int i_35_ = -2147483648 >>> i_34_;
					if ((i_32_ & i_35_) != 0) {
						if (((Class265) this).anIntArray2839[i_33_] == 0)
							((Class265) this).anIntArray2839[i_33_] = i;
						i_33_ = ((Class265) this).anIntArray2839[i_33_];
					} else
						i_33_++;
					if (i_33_ >= ((Class265) this).anIntArray2839.length) {
						int[] is_36_ = (new int[((Class265) this).anIntArray2839.length * 2]);
						for (int i_37_ = 0; i_37_ < ((Class265) this).anIntArray2839.length; i_37_++)
							is_36_[i_37_] = ((Class265) this).anIntArray2839[i_37_];
						((Class265) this).anIntArray2839 = is_36_;
					}
					i_35_ >>>= 1;
				}
				((Class265) this).anIntArray2839[i_33_] = i_30_ ^ 0xffffffff;
				if (i_33_ >= i)
					i = i_33_ + 1;
			}
		}
	}

	float[] method2519() {
		return ((Class265) this).aFloatArrayArray2843[method2517()];
	}

	static int method2520(int i, int i_38_) {
		int i_39_;
		for (i_39_ = (int) Math.pow((double) i, 1.0 / (double) i_38_) + 1; Class70.method804(i_39_, i_38_, (short) 27381) > i; i_39_--) {
			/* empty */
		}
		return i_39_;
	}
}
