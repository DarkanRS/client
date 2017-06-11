/* Class298_Sub32_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub13 extends Class298_Sub32 {
	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1728864266);
			if (aClass257_7384.aBoolean2810) {
				int i_1_ = Class250.anIntArray2760[i];
				for (int i_2_ = 0; i_2_ < Class250.anInt2755 * -1474554145; i_2_++)
					is[i_2_] = method3212(Class250.anIntArray2762[i_2_], i_1_, (byte) -64) % 4096;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahb.i(").append(')').toString());
		}
	}

	int[] method3211(int i) {
		int[] is = aClass257_7384.method2448(i, 521968543);
		if (aClass257_7384.aBoolean2810) {
			int i_3_ = Class250.anIntArray2760[i];
			for (int i_4_ = 0; i_4_ < Class250.anInt2755 * -1474554145; i_4_++)
				is[i_4_] = method3212(Class250.anIntArray2762[i_4_], i_3_, (byte) 4) % 4096;
		}
		return is;
	}

	int method3212(int i, int i_5_, byte i_6_) {
		try {
			int i_7_ = i + 57 * i_5_;
			i_7_ = i_7_ << 1 ^ i_7_;
			return 4096 - (1376312589 + (789221 + i_7_ * i_7_ * 15731) * i_7_ & 0x7fffffff) / 262144;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahb.ac(").append(')').toString());
		}
	}

	int[] method3213(int i) {
		int[] is = aClass257_7384.method2448(i, 881374072);
		if (aClass257_7384.aBoolean2810) {
			int i_8_ = Class250.anIntArray2760[i];
			for (int i_9_ = 0; i_9_ < Class250.anInt2755 * -1474554145; i_9_++)
				is[i_9_] = method3212(Class250.anIntArray2762[i_9_], i_8_, (byte) -53) % 4096;
		}
		return is;
	}

	public Class298_Sub32_Sub13() {
		super(0, true);
	}
}
