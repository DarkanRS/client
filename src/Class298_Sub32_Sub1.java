/* Class298_Sub32_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub1 extends Class298_Sub32 {
	int anInt9319 = -1384673280;
	static int anInt9320 = 4096;

	void method3137(int i, RsByteBuffer class298_sub53, byte i_0_) {
		try {
			if (i == 0)
				((Class298_Sub32_Sub1) this).anInt9319 = class298_sub53.readUnsignedShort() * 1334499193;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agb.r(").append(')').toString());
		}
	}

	int[] method3139(int i) {
		int[] is = aClass257_7384.method2448(i, 750969634);
		if (aClass257_7384.aBoolean2810) {
			int[] is_1_ = method3129(0, i - 1 & -289063255 * Class250.anInt2758, -1887337990);
			int[] is_2_ = method3129(0, i, -1887337990);
			int[] is_3_ = method3129(0, i + 1 & Class250.anInt2758 * -289063255, -1887337990);
			for (int i_4_ = 0; i_4_ < -1474554145 * Class250.anInt2755; i_4_++) {
				int i_5_ = (585425609 * ((Class298_Sub32_Sub1) this).anInt9319 * (is_3_[i_4_] - is_1_[i_4_]));
				int i_6_ = (585425609 * ((Class298_Sub32_Sub1) this).anInt9319 * (is_2_[i_4_ + 1 & Class250.anInt2753 * -901777799] - (is_2_[i_4_ - 1 & -901777799 * Class250.anInt2753])));
				int i_7_ = i_6_ >> 12;
				int i_8_ = i_5_ >> 12;
				int i_9_ = i_7_ * i_7_ >> 12;
				int i_10_ = i_8_ * i_8_ >> 12;
				int i_11_ = (int) (Math.sqrt((double) ((float) (i_9_ + i_10_ + 4096) / 4096.0F)) * 4096.0);
				int i_12_ = i_11_ != 0 ? 16777216 / i_11_ : 0;
				is[i_4_] = 4096 - i_12_;
			}
		}
		return is;
	}

	public Class298_Sub32_Sub1() {
		super(1, true);
	}

	int[] method3140(int i) {
		int[] is = aClass257_7384.method2448(i, 287257269);
		if (aClass257_7384.aBoolean2810) {
			int[] is_13_ = method3129(0, i - 1 & -289063255 * Class250.anInt2758, -1887337990);
			int[] is_14_ = method3129(0, i, -1887337990);
			int[] is_15_ = method3129(0, i + 1 & Class250.anInt2758 * -289063255, -1887337990);
			for (int i_16_ = 0; i_16_ < -1474554145 * Class250.anInt2755; i_16_++) {
				int i_17_ = (585425609 * ((Class298_Sub32_Sub1) this).anInt9319 * (is_15_[i_16_] - is_13_[i_16_]));
				int i_18_ = (585425609 * ((Class298_Sub32_Sub1) this).anInt9319 * (is_14_[i_16_ + 1 & Class250.anInt2753 * -901777799] - (is_14_[i_16_ - 1 & -901777799 * Class250.anInt2753])));
				int i_19_ = i_18_ >> 12;
				int i_20_ = i_17_ >> 12;
				int i_21_ = i_19_ * i_19_ >> 12;
				int i_22_ = i_20_ * i_20_ >> 12;
				int i_23_ = (int) (Math.sqrt((double) ((float) (i_21_ + i_22_ + 4096) / 4096.0F)) * 4096.0);
				int i_24_ = i_23_ != 0 ? 16777216 / i_23_ : 0;
				is[i_16_] = 4096 - i_24_;
			}
		}
		return is;
	}

	int[] method3131(int i, int i_25_) {
		try {
			int[] is = aClass257_7384.method2448(i, 377633232);
			if (aClass257_7384.aBoolean2810) {
				int[] is_26_ = method3129(0, i - 1 & -289063255 * Class250.anInt2758, -1887337990);
				int[] is_27_ = method3129(0, i, -1887337990);
				int[] is_28_ = method3129(0, i + 1 & Class250.anInt2758 * -289063255, -1887337990);
				for (int i_29_ = 0; i_29_ < -1474554145 * Class250.anInt2755; i_29_++) {
					int i_30_ = (585425609 * ((Class298_Sub32_Sub1) this).anInt9319 * (is_28_[i_29_] - is_26_[i_29_]));
					int i_31_ = (585425609 * ((Class298_Sub32_Sub1) this).anInt9319 * ((is_27_[i_29_ + 1 & Class250.anInt2753 * -901777799]) - is_27_[(i_29_ - 1 & -901777799 * Class250.anInt2753)]));
					int i_32_ = i_31_ >> 12;
					int i_33_ = i_30_ >> 12;
					int i_34_ = i_32_ * i_32_ >> 12;
					int i_35_ = i_33_ * i_33_ >> 12;
					int i_36_ = (int) (Math.sqrt((double) ((float) (i_34_ + i_35_ + 4096) / 4096.0F)) * 4096.0);
					int i_37_ = i_36_ != 0 ? 16777216 / i_36_ : 0;
					is[i_29_] = 4096 - i_37_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agb.i(").append(')').toString());
		}
	}

	void method3141(int i, RsByteBuffer class298_sub53) {
		if (i == 0)
			((Class298_Sub32_Sub1) this).anInt9319 = class298_sub53.readUnsignedShort() * 1334499193;
	}

	void method3142(int i, RsByteBuffer class298_sub53) {
		if (i == 0)
			((Class298_Sub32_Sub1) this).anInt9319 = class298_sub53.readUnsignedShort() * 1334499193;
	}
}
