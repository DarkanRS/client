/* Class298_Sub32_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub11 extends Class298_Sub32 {
	public static Class243 aClass243_9393;
	public static int anInt9394 = 1345470509;
	int anInt9395 = 715315885;
	int anInt9396;
	int anInt9397;
	int[] anIntArray9398;

	void method3201(int i, RsByteBuffer class298_sub53) {
		if (0 == i)
			((Class298_Sub32_Sub11) this).anInt9395 = class298_sub53.readUnsignedShort() * -715315885;
	}

	int method3135(short i) {
		try {
			return -2121898277 * ((Class298_Sub32_Sub11) this).anInt9395;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agy.q(").append(')').toString());
		}
	}

	void method3202() {
		super.method3128(1881168514);
		((Class298_Sub32_Sub11) this).anIntArray9398 = null;
	}

	void method3128(int i) {
		try {
			super.method3128(1881168514);
			((Class298_Sub32_Sub11) this).anIntArray9398 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agy.f(").append(')').toString());
		}
	}

	boolean method3203(int i) {
		try {
			if (null != ((Class298_Sub32_Sub11) this).anIntArray9398)
				return true;
			if (-2121898277 * ((Class298_Sub32_Sub11) this).anInt9395 >= 0) {
				Class89 class89 = (anInt9394 * -1132597157 >= 0 ? Class89.method987(aClass243_9393, -1132597157 * anInt9394, (-2121898277 * (((Class298_Sub32_Sub11) this).anInt9395))) : Class89.method979(aClass243_9393, (((Class298_Sub32_Sub11) this).anInt9395) * -2121898277));
				class89.method984();
				((Class298_Sub32_Sub11) this).anIntArray9398 = class89.method990();
				((Class298_Sub32_Sub11) this).anInt9396 = -506570825 * class89.anInt812;
				((Class298_Sub32_Sub11) this).anInt9397 = -274319933 * class89.anInt816;
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agy.ac(").append(')').toString());
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_0_) {
		try {
			if (0 == i)
				((Class298_Sub32_Sub11) this).anInt9395 = class298_sub53.readUnsignedShort() * -715315885;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agy.r(").append(')').toString());
		}
	}

	int[][] method3132(int i, byte i_1_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 40);
			if (aClass239_7380.aBoolean2607 && method3203(-2021836506)) {
				int[] is_2_ = is[0];
				int[] is_3_ = is[1];
				int[] is_4_ = is[2];
				int i_5_ = (1274885639 * ((Class298_Sub32_Sub11) this).anInt9396 * ((461985445 * Class250.anInt2756 != (-2125962517 * ((Class298_Sub32_Sub11) this).anInt9397)) ? (((Class298_Sub32_Sub11) this).anInt9397 * -2125962517 * i / (Class250.anInt2756 * 461985445)) : i));
				if (((Class298_Sub32_Sub11) this).anInt9396 * 1274885639 == -1474554145 * Class250.anInt2755) {
					for (int i_6_ = 0; i_6_ < Class250.anInt2755 * -1474554145; i_6_++) {
						int i_7_ = (((Class298_Sub32_Sub11) this).anIntArray9398[i_5_++]);
						is_4_[i_6_] = (i_7_ & 0xff) << 4;
						is_3_[i_6_] = (i_7_ & 0xff00) >> 4;
						is_2_[i_6_] = (i_7_ & 0xff0000) >> 12;
					}
				} else {
					for (int i_8_ = 0; i_8_ < -1474554145 * Class250.anInt2755; i_8_++) {
						int i_9_ = (i_8_ * (((Class298_Sub32_Sub11) this).anInt9396 * 1274885639) / (Class250.anInt2755 * -1474554145));
						int i_10_ = (((Class298_Sub32_Sub11) this).anIntArray9398[i_9_ + i_5_]);
						is_4_[i_8_] = (i_10_ & 0xff) << 4;
						is_3_[i_8_] = (i_10_ & 0xff00) >> 4;
						is_2_[i_8_] = (i_10_ & 0xff0000) >> 12;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agy.k(").append(')').toString());
		}
	}

	void method3204(int i, RsByteBuffer class298_sub53) {
		if (0 == i)
			((Class298_Sub32_Sub11) this).anInt9395 = class298_sub53.readUnsignedShort() * -715315885;
	}

	public Class298_Sub32_Sub11() {
		super(0, false);
	}

	int[][] method3205(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 114);
		if (aClass239_7380.aBoolean2607 && method3203(1831903701)) {
			int[] is_11_ = is[0];
			int[] is_12_ = is[1];
			int[] is_13_ = is[2];
			int i_14_ = (1274885639 * ((Class298_Sub32_Sub11) this).anInt9396 * ((461985445 * Class250.anInt2756 != (-2125962517 * ((Class298_Sub32_Sub11) this).anInt9397)) ? (((Class298_Sub32_Sub11) this).anInt9397 * -2125962517 * i / (Class250.anInt2756 * 461985445)) : i));
			if (((Class298_Sub32_Sub11) this).anInt9396 * 1274885639 == -1474554145 * Class250.anInt2755) {
				for (int i_15_ = 0; i_15_ < Class250.anInt2755 * -1474554145; i_15_++) {
					int i_16_ = (((Class298_Sub32_Sub11) this).anIntArray9398[i_14_++]);
					is_13_[i_15_] = (i_16_ & 0xff) << 4;
					is_12_[i_15_] = (i_16_ & 0xff00) >> 4;
					is_11_[i_15_] = (i_16_ & 0xff0000) >> 12;
				}
			} else {
				for (int i_17_ = 0; i_17_ < -1474554145 * Class250.anInt2755; i_17_++) {
					int i_18_ = (i_17_ * (((Class298_Sub32_Sub11) this).anInt9396 * 1274885639) / (Class250.anInt2755 * -1474554145));
					int i_19_ = (((Class298_Sub32_Sub11) this).anIntArray9398[i_18_ + i_14_]);
					is_13_[i_17_] = (i_19_ & 0xff) << 4;
					is_12_[i_17_] = (i_19_ & 0xff00) >> 4;
					is_11_[i_17_] = (i_19_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	int[][] method3206(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 9);
		if (aClass239_7380.aBoolean2607 && method3203(508632010)) {
			int[] is_20_ = is[0];
			int[] is_21_ = is[1];
			int[] is_22_ = is[2];
			int i_23_ = (1274885639 * ((Class298_Sub32_Sub11) this).anInt9396 * ((461985445 * Class250.anInt2756 != (-2125962517 * ((Class298_Sub32_Sub11) this).anInt9397)) ? (((Class298_Sub32_Sub11) this).anInt9397 * -2125962517 * i / (Class250.anInt2756 * 461985445)) : i));
			if (((Class298_Sub32_Sub11) this).anInt9396 * 1274885639 == -1474554145 * Class250.anInt2755) {
				for (int i_24_ = 0; i_24_ < Class250.anInt2755 * -1474554145; i_24_++) {
					int i_25_ = (((Class298_Sub32_Sub11) this).anIntArray9398[i_23_++]);
					is_22_[i_24_] = (i_25_ & 0xff) << 4;
					is_21_[i_24_] = (i_25_ & 0xff00) >> 4;
					is_20_[i_24_] = (i_25_ & 0xff0000) >> 12;
				}
			} else {
				for (int i_26_ = 0; i_26_ < -1474554145 * Class250.anInt2755; i_26_++) {
					int i_27_ = (i_26_ * (((Class298_Sub32_Sub11) this).anInt9396 * 1274885639) / (Class250.anInt2755 * -1474554145));
					int i_28_ = (((Class298_Sub32_Sub11) this).anIntArray9398[i_27_ + i_23_]);
					is_22_[i_26_] = (i_28_ & 0xff) << 4;
					is_21_[i_26_] = (i_28_ & 0xff00) >> 4;
					is_20_[i_26_] = (i_28_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	int method3207() {
		return -2121898277 * ((Class298_Sub32_Sub11) this).anInt9395;
	}

	static final void method3208(ClientScript2 class403, int i) {
		try {
			if (client.aString8919 != null)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = client.aString8919;
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agy.wj(").append(')').toString());
		}
	}
}
