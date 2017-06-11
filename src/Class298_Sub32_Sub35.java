/* Class298_Sub32_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub35 extends Class298_Sub32 {
	int anInt9550;
	static boolean aBoolean9551 = true;
	boolean aBoolean9552 = true;
	static int anInt9553 = 4096;

	int[][] method3132(int i, byte i_0_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 96);
			if (aClass239_7380.aBoolean2607) {
				int[] is_1_ = method3129(0, i - 1 & -289063255 * Class250.anInt2758, -1887337990);
				int[] is_2_ = method3129(0, i, -1887337990);
				int[] is_3_ = method3129(0, i + 1 & -289063255 * Class250.anInt2758, -1887337990);
				int[] is_4_ = is[0];
				int[] is_5_ = is[1];
				int[] is_6_ = is[2];
				for (int i_7_ = 0; i_7_ < -1474554145 * Class250.anInt2755; i_7_++) {
					int i_8_ = ((is_3_[i_7_] - is_1_[i_7_]) * (347966039 * ((Class298_Sub32_Sub35) this).anInt9550));
					int i_9_ = (((Class298_Sub32_Sub35) this).anInt9550 * 347966039 * (is_2_[i_7_ + 1 & -901777799 * Class250.anInt2753] - is_2_[(i_7_ - 1 & -901777799 * Class250.anInt2753)]));
					int i_10_ = i_9_ >> 12;
					int i_11_ = i_8_ >> 12;
					int i_12_ = i_10_ * i_10_ >> 12;
					int i_13_ = i_11_ * i_11_ >> 12;
					int i_14_ = (int) (Math.sqrt((double) ((float) (4096 + (i_13_ + i_12_)) / 4096.0F)) * 4096.0);
					int i_15_;
					int i_16_;
					int i_17_;
					if (i_14_ != 0) {
						i_15_ = i_9_ / i_14_;
						i_16_ = i_8_ / i_14_;
						i_17_ = 16777216 / i_14_;
					} else {
						i_15_ = 0;
						i_16_ = 0;
						i_17_ = 0;
					}
					if (((Class298_Sub32_Sub35) this).aBoolean9552) {
						i_15_ = (i_15_ >> 1) + 2048;
						i_16_ = (i_16_ >> 1) + 2048;
						i_17_ = 2048 + (i_17_ >> 1);
					}
					is_4_[i_7_] = i_15_;
					is_5_[i_7_] = i_16_;
					is_6_[i_7_] = i_17_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahx.k(").append(')').toString());
		}
	}

	public Class298_Sub32_Sub35() {
		super(1, false);
		((Class298_Sub32_Sub35) this).anInt9550 = 1343647744;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_18_) {
		try {
			switch (i) {
			case 0:
				((Class298_Sub32_Sub35) this).anInt9550 = class298_sub53.readUnsignedShort() * 1837433191;
				break;
			case 1:
				((Class298_Sub32_Sub35) this).aBoolean9552 = class298_sub53.readUnsignedByte() == 1;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahx.r(").append(')').toString());
		}
	}

	void method3365(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub35) this).anInt9550 = class298_sub53.readUnsignedShort() * 1837433191;
			break;
		case 1:
			((Class298_Sub32_Sub35) this).aBoolean9552 = class298_sub53.readUnsignedByte() == 1;
			break;
		}
	}

	void method3366(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub35) this).anInt9550 = class298_sub53.readUnsignedShort() * 1837433191;
			break;
		case 1:
			((Class298_Sub32_Sub35) this).aBoolean9552 = class298_sub53.readUnsignedByte() == 1;
			break;
		}
	}

	int[][] method3367(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 99);
		if (aClass239_7380.aBoolean2607) {
			int[] is_19_ = method3129(0, i - 1 & -289063255 * Class250.anInt2758, -1887337990);
			int[] is_20_ = method3129(0, i, -1887337990);
			int[] is_21_ = method3129(0, i + 1 & -289063255 * Class250.anInt2758, -1887337990);
			int[] is_22_ = is[0];
			int[] is_23_ = is[1];
			int[] is_24_ = is[2];
			for (int i_25_ = 0; i_25_ < -1474554145 * Class250.anInt2755; i_25_++) {
				int i_26_ = ((is_21_[i_25_] - is_19_[i_25_]) * (347966039 * ((Class298_Sub32_Sub35) this).anInt9550));
				int i_27_ = (((Class298_Sub32_Sub35) this).anInt9550 * 347966039 * (is_20_[i_25_ + 1 & -901777799 * Class250.anInt2753] - (is_20_[i_25_ - 1 & -901777799 * Class250.anInt2753])));
				int i_28_ = i_27_ >> 12;
				int i_29_ = i_26_ >> 12;
				int i_30_ = i_28_ * i_28_ >> 12;
				int i_31_ = i_29_ * i_29_ >> 12;
				int i_32_ = (int) (Math.sqrt((double) ((float) (4096 + (i_31_ + i_30_)) / 4096.0F)) * 4096.0);
				int i_33_;
				int i_34_;
				int i_35_;
				if (i_32_ != 0) {
					i_33_ = i_27_ / i_32_;
					i_34_ = i_26_ / i_32_;
					i_35_ = 16777216 / i_32_;
				} else {
					i_33_ = 0;
					i_34_ = 0;
					i_35_ = 0;
				}
				if (((Class298_Sub32_Sub35) this).aBoolean9552) {
					i_33_ = (i_33_ >> 1) + 2048;
					i_34_ = (i_34_ >> 1) + 2048;
					i_35_ = 2048 + (i_35_ >> 1);
				}
				is_22_[i_25_] = i_33_;
				is_23_[i_25_] = i_34_;
				is_24_[i_25_] = i_35_;
			}
		}
		return is;
	}

	int[][] method3368(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 97);
		if (aClass239_7380.aBoolean2607) {
			int[] is_36_ = method3129(0, i - 1 & -289063255 * Class250.anInt2758, -1887337990);
			int[] is_37_ = method3129(0, i, -1887337990);
			int[] is_38_ = method3129(0, i + 1 & -289063255 * Class250.anInt2758, -1887337990);
			int[] is_39_ = is[0];
			int[] is_40_ = is[1];
			int[] is_41_ = is[2];
			for (int i_42_ = 0; i_42_ < -1474554145 * Class250.anInt2755; i_42_++) {
				int i_43_ = ((is_38_[i_42_] - is_36_[i_42_]) * (347966039 * ((Class298_Sub32_Sub35) this).anInt9550));
				int i_44_ = (((Class298_Sub32_Sub35) this).anInt9550 * 347966039 * (is_37_[i_42_ + 1 & -901777799 * Class250.anInt2753] - (is_37_[i_42_ - 1 & -901777799 * Class250.anInt2753])));
				int i_45_ = i_44_ >> 12;
				int i_46_ = i_43_ >> 12;
				int i_47_ = i_45_ * i_45_ >> 12;
				int i_48_ = i_46_ * i_46_ >> 12;
				int i_49_ = (int) (Math.sqrt((double) ((float) (4096 + (i_48_ + i_47_)) / 4096.0F)) * 4096.0);
				int i_50_;
				int i_51_;
				int i_52_;
				if (i_49_ != 0) {
					i_50_ = i_44_ / i_49_;
					i_51_ = i_43_ / i_49_;
					i_52_ = 16777216 / i_49_;
				} else {
					i_50_ = 0;
					i_51_ = 0;
					i_52_ = 0;
				}
				if (((Class298_Sub32_Sub35) this).aBoolean9552) {
					i_50_ = (i_50_ >> 1) + 2048;
					i_51_ = (i_51_ >> 1) + 2048;
					i_52_ = 2048 + (i_52_ >> 1);
				}
				is_39_[i_42_] = i_50_;
				is_40_[i_42_] = i_51_;
				is_41_[i_42_] = i_52_;
			}
		}
		return is;
	}
}
