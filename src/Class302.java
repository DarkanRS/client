/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class302 {
	public Class302 aClass302_3258;
	public Class302 aClass302_3259;

	public void method3714(int i) {
		try {
			if (null != aClass302_3259) {
				aClass302_3259.aClass302_3258 = aClass302_3258;
				aClass302_3258.aClass302_3259 = aClass302_3259;
				aClass302_3258 = null;
				aClass302_3259 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mo.a(").append(')').toString());
		}
	}

	static final void method3715(ClientScript2 class403, byte i) {
		try {
			Class92.method1007(-207102051);
			Class436.aBoolean5496 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mo.afj(").append(')').toString());
		}
	}

	static boolean method3716(int i, int i_0_) {
		try {
			if (9 == i || i == 10 || i == 11 || i == 12 || i == 13 || 1003 == i)
				return true;
			if (i == 8)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mo.bb(").append(')').toString());
		}
	}

	static final void method3717(long l) {
		try {
			try {
				Thread.sleep(l);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mo.f(").append(')').toString());
		}
	}

	static void method3718(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			if (i != i_2_ || i_3_ != i_1_ || i_6_ != i_4_ || i_5_ != i_7_) {
				int i_10_ = i;
				int i_11_ = i_1_;
				int i_12_ = 3 * i;
				int i_13_ = 3 * i_1_;
				int i_14_ = 3 * i_2_;
				int i_15_ = i_3_ * 3;
				int i_16_ = 3 * i_4_;
				int i_17_ = i_5_ * 3;
				int i_18_ = i_14_ + (i_6_ - i_16_) - i;
				int i_19_ = i_15_ + (i_7_ - i_17_) - i_1_;
				int i_20_ = i_16_ - i_14_ - i_14_ + i_12_;
				int i_21_ = i_17_ - i_15_ - i_15_ + i_13_;
				int i_22_ = i_14_ - i_12_;
				int i_23_ = i_15_ - i_13_;
				for (int i_24_ = 128; i_24_ <= 4096; i_24_ += 128) {
					int i_25_ = i_24_ * i_24_ >> 12;
					int i_26_ = i_25_ * i_24_ >> 12;
					int i_27_ = i_26_ * i_18_;
					int i_28_ = i_19_ * i_26_;
					int i_29_ = i_25_ * i_20_;
					int i_30_ = i_25_ * i_21_;
					int i_31_ = i_24_ * i_22_;
					int i_32_ = i_23_ * i_24_;
					int i_33_ = (i_31_ + (i_29_ + i_27_) >> 12) + i;
					int i_34_ = (i_32_ + (i_28_ + i_30_) >> 12) + i_1_;
					Class264_Sub1.method2503(i_10_, i_11_, i_33_, i_34_, i_8_, -1643060817);
					i_10_ = i_33_;
					i_11_ = i_34_;
				}
			} else
				Class264_Sub1.method2503(i, i_1_, i_6_, i_7_, i_8_, -984237460);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mo.ax(").append(')').toString());
		}
	}
}
