/* Class298_Sub32_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub37 extends Class298_Sub32 {
	int anInt9558 = 1210221109;

	int[] method3374(int i) {
		int[] is = aClass257_7384.method2448(i, -122231988);
		if (aClass257_7384.aBoolean2810) {
			int i_0_ = Class250.anIntArray2760[i];
			for (int i_1_ = 0; i_1_ < Class250.anInt2755 * -1474554145; i_1_++) {
				int i_2_ = Class250.anIntArray2762[i_1_];
				if (i_2_ > -121339323 * ((Class298_Sub32_Sub37) this).anInt9558 && i_2_ < 4096 - -121339323 * ((Class298_Sub32_Sub37) this).anInt9558 && i_0_ > 2048 - (((Class298_Sub32_Sub37) this).anInt9558 * -121339323) && i_0_ < 2048 + (((Class298_Sub32_Sub37) this).anInt9558 * -121339323)) {
					int i_3_ = 2048 - i_2_;
					i_3_ = i_3_ < 0 ? -i_3_ : i_3_;
					i_3_ <<= 12;
					i_3_ /= 2048 - (-121339323 * ((Class298_Sub32_Sub37) this).anInt9558);
					is[i_1_] = 4096 - i_3_;
				} else if (i_2_ > 2048 - -121339323 * ((Class298_Sub32_Sub37) this).anInt9558 && i_2_ < 2048 + (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
					int i_4_ = i_0_ - 2048;
					i_4_ = i_4_ < 0 ? -i_4_ : i_4_;
					i_4_ -= (-121339323 * ((Class298_Sub32_Sub37) this).anInt9558);
					i_4_ <<= 12;
					is[i_1_] = i_4_ / (2048 - -121339323 * (((Class298_Sub32_Sub37) this).anInt9558));
				} else if (i_0_ < (((Class298_Sub32_Sub37) this).anInt9558 * -121339323) || i_0_ > 4096 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
					int i_5_ = i_2_ - 2048;
					i_5_ = i_5_ < 0 ? -i_5_ : i_5_;
					i_5_ -= (((Class298_Sub32_Sub37) this).anInt9558 * -121339323);
					i_5_ <<= 12;
					is[i_1_] = i_5_ / (2048 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323);
				} else if (i_2_ < (((Class298_Sub32_Sub37) this).anInt9558 * -121339323) || i_2_ > 4096 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
					int i_6_ = 2048 - i_0_;
					i_6_ = i_6_ < 0 ? -i_6_ : i_6_;
					i_6_ <<= 12;
					i_6_ /= 2048 - (((Class298_Sub32_Sub37) this).anInt9558 * -121339323);
					is[i_1_] = 4096 - i_6_;
				} else
					is[i_1_] = 0;
			}
		}
		return is;
	}

	public Class298_Sub32_Sub37() {
		super(0, true);
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_7_) {
		try {
			switch (i) {
			case 0:
				((Class298_Sub32_Sub37) this).anInt9558 = class298_sub53.readUnsignedShort() * 2065121421;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahz.r(").append(')').toString());
		}
	}

	int[] method3375(int i) {
		int[] is = aClass257_7384.method2448(i, 1278925238);
		if (aClass257_7384.aBoolean2810) {
			int i_8_ = Class250.anIntArray2760[i];
			for (int i_9_ = 0; i_9_ < Class250.anInt2755 * -1474554145; i_9_++) {
				int i_10_ = Class250.anIntArray2762[i_9_];
				if ((i_10_ > -121339323 * ((Class298_Sub32_Sub37) this).anInt9558) && i_10_ < 4096 - -121339323 * ((Class298_Sub32_Sub37) this).anInt9558 && i_8_ > 2048 - (((Class298_Sub32_Sub37) this).anInt9558 * -121339323) && i_8_ < 2048 + (((Class298_Sub32_Sub37) this).anInt9558 * -121339323)) {
					int i_11_ = 2048 - i_10_;
					i_11_ = i_11_ < 0 ? -i_11_ : i_11_;
					i_11_ <<= 12;
					i_11_ /= 2048 - -121339323 * (((Class298_Sub32_Sub37) this).anInt9558);
					is[i_9_] = 4096 - i_11_;
				} else if (i_10_ > 2048 - -121339323 * ((Class298_Sub32_Sub37) this).anInt9558 && i_10_ < 2048 + (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
					int i_12_ = i_8_ - 2048;
					i_12_ = i_12_ < 0 ? -i_12_ : i_12_;
					i_12_ -= (-121339323 * ((Class298_Sub32_Sub37) this).anInt9558);
					i_12_ <<= 12;
					is[i_9_] = i_12_ / (2048 - -121339323 * ((Class298_Sub32_Sub37) this).anInt9558);
				} else if (i_8_ < (((Class298_Sub32_Sub37) this).anInt9558 * -121339323) || i_8_ > 4096 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
					int i_13_ = i_10_ - 2048;
					i_13_ = i_13_ < 0 ? -i_13_ : i_13_;
					i_13_ -= (((Class298_Sub32_Sub37) this).anInt9558 * -121339323);
					i_13_ <<= 12;
					is[i_9_] = i_13_ / (2048 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323);
				} else if (i_10_ < (((Class298_Sub32_Sub37) this).anInt9558 * -121339323) || i_10_ > 4096 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
					int i_14_ = 2048 - i_8_;
					i_14_ = i_14_ < 0 ? -i_14_ : i_14_;
					i_14_ <<= 12;
					i_14_ /= 2048 - (((Class298_Sub32_Sub37) this).anInt9558 * -121339323);
					is[i_9_] = 4096 - i_14_;
				} else
					is[i_9_] = 0;
			}
		}
		return is;
	}

	int[] method3131(int i, int i_15_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1728216367);
			if (aClass257_7384.aBoolean2810) {
				int i_16_ = Class250.anIntArray2760[i];
				for (int i_17_ = 0; i_17_ < Class250.anInt2755 * -1474554145; i_17_++) {
					int i_18_ = Class250.anIntArray2762[i_17_];
					if (i_18_ > (-121339323 * ((Class298_Sub32_Sub37) this).anInt9558) && i_18_ < 4096 - -121339323 * ((Class298_Sub32_Sub37) this).anInt9558 && i_16_ > 2048 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323 && i_16_ < 2048 + (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
						int i_19_ = 2048 - i_18_;
						i_19_ = i_19_ < 0 ? -i_19_ : i_19_;
						i_19_ <<= 12;
						i_19_ /= 2048 - -121339323 * ((Class298_Sub32_Sub37) this).anInt9558;
						is[i_17_] = 4096 - i_19_;
					} else if (i_18_ > 2048 - (-121339323 * (((Class298_Sub32_Sub37) this).anInt9558)) && i_18_ < 2048 + (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
						int i_20_ = i_16_ - 2048;
						i_20_ = i_20_ < 0 ? -i_20_ : i_20_;
						i_20_ -= (-121339323 * ((Class298_Sub32_Sub37) this).anInt9558);
						i_20_ <<= 12;
						is[i_17_] = i_20_ / (2048 - -121339323 * ((Class298_Sub32_Sub37) this).anInt9558);
					} else if (i_16_ < (((Class298_Sub32_Sub37) this).anInt9558 * -121339323) || i_16_ > 4096 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
						int i_21_ = i_18_ - 2048;
						i_21_ = i_21_ < 0 ? -i_21_ : i_21_;
						i_21_ -= (((Class298_Sub32_Sub37) this).anInt9558 * -121339323);
						i_21_ <<= 12;
						is[i_17_] = i_21_ / (2048 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323);
					} else if (i_18_ < (((Class298_Sub32_Sub37) this).anInt9558 * -121339323) || i_18_ > 4096 - (((Class298_Sub32_Sub37) this).anInt9558) * -121339323) {
						int i_22_ = 2048 - i_16_;
						i_22_ = i_22_ < 0 ? -i_22_ : i_22_;
						i_22_ <<= 12;
						i_22_ /= 2048 - (((Class298_Sub32_Sub37) this).anInt9558 * -121339323);
						is[i_17_] = 4096 - i_22_;
					} else
						is[i_17_] = 0;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahz.i(").append(')').toString());
		}
	}

	void method3376(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub37) this).anInt9558 = class298_sub53.readUnsignedShort() * 2065121421;
		}
	}

	void method3377(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub37) this).anInt9558 = class298_sub53.readUnsignedShort() * 2065121421;
		}
	}
}
