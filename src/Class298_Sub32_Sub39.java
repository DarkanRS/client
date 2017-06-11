/* Class298_Sub32_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub39 extends Class298_Sub32 {
	int anInt9566;
	static int anInt9567 = 1;
	static int anInt9568 = 2;
	static int anInt9569 = 3;
	int anInt9570 = -468497986;
	int anInt9571 = 136960000;
	static int anInt9572 = 0;
	int[] anIntArray9573;
	int[] anIntArray9574;

	void method3137(int i, RsByteBuffer class298_sub53, byte i_0_) {
		try {
			switch (i) {
			case 0:
				((Class298_Sub32_Sub39) this).anInt9570 = class298_sub53.readUnsignedByte() * 382646931;
				break;
			case 1:
				((Class298_Sub32_Sub39) this).anInt9571 = class298_sub53.readUnsignedShort() * 1354827067;
				break;
			case 2:
				((Class298_Sub32_Sub39) this).anInt9566 = class298_sub53.readUnsignedByte() * 438974141;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aio.r(").append(')').toString());
		}
	}

	void method3388(int i) {
		try {
			int i_1_ = 0;
			((Class298_Sub32_Sub39) this).anIntArray9573 = new int[1 + (-2096663653 * ((Class298_Sub32_Sub39) this).anInt9570)];
			((Class298_Sub32_Sub39) this).anIntArray9574 = new int[(-2096663653 * ((Class298_Sub32_Sub39) this).anInt9570) + 1];
			int i_2_ = 4096 / (-2096663653 * ((Class298_Sub32_Sub39) this).anInt9570);
			int i_3_ = (((Class298_Sub32_Sub39) this).anInt9571 * -1111258125 * i_2_ >> 12);
			for (int i_4_ = 0; i_4_ < -2096663653 * ((Class298_Sub32_Sub39) this).anInt9570; i_4_++) {
				((Class298_Sub32_Sub39) this).anIntArray9574[i_4_] = i_1_;
				((Class298_Sub32_Sub39) this).anIntArray9573[i_4_] = i_3_ + i_1_;
				i_1_ += i_2_;
			}
			((Class298_Sub32_Sub39) this).anIntArray9574[((Class298_Sub32_Sub39) this).anInt9570 * -2096663653] = 4096;
			((Class298_Sub32_Sub39) this).anIntArray9573[((Class298_Sub32_Sub39) this).anInt9570 * -2096663653] = ((Class298_Sub32_Sub39) this).anIntArray9573[0] + 4096;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aio.ac(").append(')').toString());
		}
	}

	void method3133(int i) {
		try {
			method3388(-1688804109);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aio.x(").append(')').toString());
		}
	}

	int[] method3389(int i) {
		int[] is = aClass257_7384.method2448(i, 1475074444);
		if (aClass257_7384.aBoolean2810) {
			int i_5_ = Class250.anIntArray2760[i];
			if (((Class298_Sub32_Sub39) this).anInt9566 * -882183019 != 0) {
				for (int i_6_ = 0; i_6_ < -1474554145 * Class250.anInt2755; i_6_++) {
					int i_7_ = 0;
					int i_8_ = 0;
					int i_9_ = Class250.anIntArray2762[i_6_];
					switch (-882183019 * ((Class298_Sub32_Sub39) this).anInt9566) {
					case 3:
						i_7_ = (i_9_ - i_5_ >> 1) + 2048;
						break;
					case 2:
						i_7_ = (i_9_ - (4096 - i_5_) >> 1) + 2048;
						break;
					case 1:
						i_7_ = i_9_;
						break;
					}
					for (int i_10_ = 0; i_10_ < (-2096663653 * ((Class298_Sub32_Sub39) this).anInt9570); i_10_++) {
						if (i_7_ >= (((Class298_Sub32_Sub39) this).anIntArray9574[i_10_]) && i_7_ < (((Class298_Sub32_Sub39) this).anIntArray9574[1 + i_10_])) {
							if (i_7_ < (((Class298_Sub32_Sub39) this).anIntArray9573[i_10_]))
								i_8_ = 4096;
							break;
						}
					}
					is[i_6_] = i_8_;
				}
			} else {
				int i_11_ = 0;
				for (int i_12_ = 0; (i_12_ < ((Class298_Sub32_Sub39) this).anInt9570 * -2096663653); i_12_++) {
					if (i_5_ >= (((Class298_Sub32_Sub39) this).anIntArray9574[i_12_]) && i_5_ < (((Class298_Sub32_Sub39) this).anIntArray9574[1 + i_12_])) {
						if (i_5_ < (((Class298_Sub32_Sub39) this).anIntArray9573[i_12_]))
							i_11_ = 4096;
						break;
					}
				}
				Class425.method5740(is, 0, Class250.anInt2755 * -1474554145, i_11_);
			}
		}
		return is;
	}

	void method3390() {
		method3388(-1688804109);
	}

	public Class298_Sub32_Sub39() {
		super(0, true);
		((Class298_Sub32_Sub39) this).anInt9566 = 0;
	}

	int[] method3391(int i) {
		int[] is = aClass257_7384.method2448(i, 2036108673);
		if (aClass257_7384.aBoolean2810) {
			int i_13_ = Class250.anIntArray2760[i];
			if (((Class298_Sub32_Sub39) this).anInt9566 * -882183019 != 0) {
				for (int i_14_ = 0; i_14_ < -1474554145 * Class250.anInt2755; i_14_++) {
					int i_15_ = 0;
					int i_16_ = 0;
					int i_17_ = Class250.anIntArray2762[i_14_];
					switch (-882183019 * ((Class298_Sub32_Sub39) this).anInt9566) {
					case 3:
						i_15_ = (i_17_ - i_13_ >> 1) + 2048;
						break;
					case 2:
						i_15_ = (i_17_ - (4096 - i_13_) >> 1) + 2048;
						break;
					case 1:
						i_15_ = i_17_;
						break;
					}
					for (int i_18_ = 0; i_18_ < (-2096663653 * ((Class298_Sub32_Sub39) this).anInt9570); i_18_++) {
						if (i_15_ >= (((Class298_Sub32_Sub39) this).anIntArray9574[i_18_]) && i_15_ < (((Class298_Sub32_Sub39) this).anIntArray9574[1 + i_18_])) {
							if (i_15_ < (((Class298_Sub32_Sub39) this).anIntArray9573[i_18_]))
								i_16_ = 4096;
							break;
						}
					}
					is[i_14_] = i_16_;
				}
			} else {
				int i_19_ = 0;
				for (int i_20_ = 0; (i_20_ < ((Class298_Sub32_Sub39) this).anInt9570 * -2096663653); i_20_++) {
					if (i_13_ >= (((Class298_Sub32_Sub39) this).anIntArray9574[i_20_]) && i_13_ < (((Class298_Sub32_Sub39) this).anIntArray9574[1 + i_20_])) {
						if (i_13_ < (((Class298_Sub32_Sub39) this).anIntArray9573[i_20_]))
							i_19_ = 4096;
						break;
					}
				}
				Class425.method5740(is, 0, Class250.anInt2755 * -1474554145, i_19_);
			}
		}
		return is;
	}

	int[] method3131(int i, int i_21_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1878219643);
			if (aClass257_7384.aBoolean2810) {
				int i_22_ = Class250.anIntArray2760[i];
				if (((Class298_Sub32_Sub39) this).anInt9566 * -882183019 != 0) {
					for (int i_23_ = 0; i_23_ < -1474554145 * Class250.anInt2755; i_23_++) {
						int i_24_ = 0;
						int i_25_ = 0;
						int i_26_ = Class250.anIntArray2762[i_23_];
						switch (-882183019 * ((Class298_Sub32_Sub39) this).anInt9566) {
						case 3:
							i_24_ = (i_26_ - i_22_ >> 1) + 2048;
							break;
						case 2:
							i_24_ = (i_26_ - (4096 - i_22_) >> 1) + 2048;
							break;
						case 1:
							i_24_ = i_26_;
							break;
						}
						for (int i_27_ = 0; (i_27_ < (-2096663653 * ((Class298_Sub32_Sub39) this).anInt9570)); i_27_++) {
							if (i_24_ >= (((Class298_Sub32_Sub39) this).anIntArray9574[i_27_]) && i_24_ < (((Class298_Sub32_Sub39) this).anIntArray9574[1 + i_27_])) {
								if (i_24_ < (((Class298_Sub32_Sub39) this).anIntArray9573[i_27_]))
									i_25_ = 4096;
								break;
							}
						}
						is[i_23_] = i_25_;
					}
				} else {
					int i_28_ = 0;
					for (int i_29_ = 0; i_29_ < (((Class298_Sub32_Sub39) this).anInt9570 * -2096663653); i_29_++) {
						if (i_22_ >= (((Class298_Sub32_Sub39) this).anIntArray9574[i_29_]) && i_22_ < (((Class298_Sub32_Sub39) this).anIntArray9574[1 + i_29_])) {
							if (i_22_ < (((Class298_Sub32_Sub39) this).anIntArray9573[i_29_]))
								i_28_ = 4096;
							break;
						}
					}
					Class425.method5740(is, 0, Class250.anInt2755 * -1474554145, i_28_);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aio.i(").append(')').toString());
		}
	}

	void method3392() {
		method3388(-1688804109);
	}

	void method3393() {
		method3388(-1688804109);
	}

	void method3394(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub39) this).anInt9570 = class298_sub53.readUnsignedByte() * 382646931;
			break;
		case 1:
			((Class298_Sub32_Sub39) this).anInt9571 = class298_sub53.readUnsignedShort() * 1354827067;
			break;
		case 2:
			((Class298_Sub32_Sub39) this).anInt9566 = class298_sub53.readUnsignedByte() * 438974141;
			break;
		}
	}

	void method3395(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub39) this).anInt9570 = class298_sub53.readUnsignedByte() * 382646931;
			break;
		case 1:
			((Class298_Sub32_Sub39) this).anInt9571 = class298_sub53.readUnsignedShort() * 1354827067;
			break;
		case 2:
			((Class298_Sub32_Sub39) this).anInt9566 = class298_sub53.readUnsignedByte() * 438974141;
			break;
		}
	}
}
