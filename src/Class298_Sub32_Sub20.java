/* Class298_Sub32_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub20 extends Class298_Sub32 {
	static int anInt9446 = 204;
	static int anInt9447 = 1;
	static int anInt9448 = 1;
	int anInt9449;
	int anInt9450 = 1427389417;
	int anInt9451 = 325240011;
	static int anInt9452 = 4;

	int[] method3259(int i) {
		int[] is = aClass257_7384.method2448(i, 1064327591);
		if (aClass257_7384.aBoolean2810) {
			int i_0_ = 0;
			for (/**/; i_0_ < -1474554145 * Class250.anInt2755; i_0_++) {
				int i_1_ = Class250.anIntArray2762[i_0_];
				int i_2_ = Class250.anIntArray2760[i];
				int i_3_ = ((((Class298_Sub32_Sub20) this).anInt9450 * -1845605287 * i_1_) >> 12);
				int i_4_ = ((((Class298_Sub32_Sub20) this).anInt9451 * -1403879197 * i_2_) >> 12);
				int i_5_ = (((Class298_Sub32_Sub20) this).anInt9450 * -1845605287 * (i_1_ % (4096 / (-1845605287 * ((Class298_Sub32_Sub20) this).anInt9450))));
				int i_6_ = (i_2_ % (4096 / (((Class298_Sub32_Sub20) this).anInt9451 * -1403879197)) * (((Class298_Sub32_Sub20) this).anInt9451 * -1403879197));
				if (i_6_ < ((Class298_Sub32_Sub20) this).anInt9449 * -881136511) {
					for (i_3_ -= i_4_; i_3_ < 0; i_3_ += 4) {
						/* empty */
					}
					for (/**/; i_3_ > 3; i_3_ -= 4) {
						/* empty */
					}
					if (i_3_ != 1) {
						is[i_0_] = 0;
						continue;
					}
					if (i_5_ < (((Class298_Sub32_Sub20) this).anInt9449 * -881136511)) {
						is[i_0_] = 0;
						continue;
					}
				}
				if (i_5_ < ((Class298_Sub32_Sub20) this).anInt9449 * -881136511) {
					for (i_3_ -= i_4_; i_3_ < 0; i_3_ += 4) {
						/* empty */
					}
					for (/**/; i_3_ > 3; i_3_ -= 4) {
						/* empty */
					}
					if (i_3_ > 0) {
						is[i_0_] = 0;
						continue;
					}
				}
				is[i_0_] = 4096;
			}
		}
		return is;
	}

	int[] method3131(int i, int i_7_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1561345125);
			if (aClass257_7384.aBoolean2810) {
				int i_8_ = 0;
				for (/**/; i_8_ < -1474554145 * Class250.anInt2755; i_8_++) {
					int i_9_ = Class250.anIntArray2762[i_8_];
					int i_10_ = Class250.anIntArray2760[i];
					int i_11_ = ((((Class298_Sub32_Sub20) this).anInt9450 * -1845605287 * i_9_) >> 12);
					int i_12_ = ((((Class298_Sub32_Sub20) this).anInt9451 * -1403879197 * i_10_) >> 12);
					int i_13_ = (((Class298_Sub32_Sub20) this).anInt9450 * -1845605287 * (i_9_ % (4096 / (-1845605287 * (((Class298_Sub32_Sub20) this).anInt9450)))));
					int i_14_ = (i_10_ % (4096 / (((Class298_Sub32_Sub20) this).anInt9451 * -1403879197)) * (((Class298_Sub32_Sub20) this).anInt9451 * -1403879197));
					if (i_14_ < (((Class298_Sub32_Sub20) this).anInt9449 * -881136511)) {
						for (i_11_ -= i_12_; i_11_ < 0; i_11_ += 4) {
							/* empty */
						}
						for (/**/; i_11_ > 3; i_11_ -= 4) {
							/* empty */
						}
						if (i_11_ != 1) {
							is[i_8_] = 0;
							continue;
						}
						if (i_13_ < (((Class298_Sub32_Sub20) this).anInt9449 * -881136511)) {
							is[i_8_] = 0;
							continue;
						}
					}
					if (i_13_ < (((Class298_Sub32_Sub20) this).anInt9449 * -881136511)) {
						for (i_11_ -= i_12_; i_11_ < 0; i_11_ += 4) {
							/* empty */
						}
						for (/**/; i_11_ > 3; i_11_ -= 4) {
							/* empty */
						}
						if (i_11_ > 0) {
							is[i_8_] = 0;
							continue;
						}
					}
					is[i_8_] = 4096;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahi.i(").append(')').toString());
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_15_) {
		try {
			switch (i) {
			case 1:
				((Class298_Sub32_Sub20) this).anInt9451 = class298_sub53.readUnsignedByte() * 325240011;
				break;
			case 2:
				((Class298_Sub32_Sub20) this).anInt9449 = class298_sub53.readUnsignedShort() * 1071731585;
				break;
			case 0:
				((Class298_Sub32_Sub20) this).anInt9450 = class298_sub53.readUnsignedByte() * 1427389417;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahi.r(").append(')').toString());
		}
	}

	int[] method3260(int i) {
		int[] is = aClass257_7384.method2448(i, 1408798396);
		if (aClass257_7384.aBoolean2810) {
			int i_16_ = 0;
			for (/**/; i_16_ < -1474554145 * Class250.anInt2755; i_16_++) {
				int i_17_ = Class250.anIntArray2762[i_16_];
				int i_18_ = Class250.anIntArray2760[i];
				int i_19_ = ((((Class298_Sub32_Sub20) this).anInt9450 * -1845605287 * i_17_) >> 12);
				int i_20_ = ((((Class298_Sub32_Sub20) this).anInt9451 * -1403879197 * i_18_) >> 12);
				int i_21_ = (((Class298_Sub32_Sub20) this).anInt9450 * -1845605287 * (i_17_ % (4096 / (-1845605287 * ((Class298_Sub32_Sub20) this).anInt9450))));
				int i_22_ = (i_18_ % (4096 / (((Class298_Sub32_Sub20) this).anInt9451 * -1403879197)) * (((Class298_Sub32_Sub20) this).anInt9451 * -1403879197));
				if (i_22_ < ((Class298_Sub32_Sub20) this).anInt9449 * -881136511) {
					for (i_19_ -= i_20_; i_19_ < 0; i_19_ += 4) {
						/* empty */
					}
					for (/**/; i_19_ > 3; i_19_ -= 4) {
						/* empty */
					}
					if (i_19_ != 1) {
						is[i_16_] = 0;
						continue;
					}
					if (i_21_ < (((Class298_Sub32_Sub20) this).anInt9449 * -881136511)) {
						is[i_16_] = 0;
						continue;
					}
				}
				if (i_21_ < ((Class298_Sub32_Sub20) this).anInt9449 * -881136511) {
					for (i_19_ -= i_20_; i_19_ < 0; i_19_ += 4) {
						/* empty */
					}
					for (/**/; i_19_ > 3; i_19_ -= 4) {
						/* empty */
					}
					if (i_19_ > 0) {
						is[i_16_] = 0;
						continue;
					}
				}
				is[i_16_] = 4096;
			}
		}
		return is;
	}

	void method3261(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub20) this).anInt9451 = class298_sub53.readUnsignedByte() * 325240011;
			break;
		case 2:
			((Class298_Sub32_Sub20) this).anInt9449 = class298_sub53.readUnsignedShort() * 1071731585;
			break;
		case 0:
			((Class298_Sub32_Sub20) this).anInt9450 = class298_sub53.readUnsignedByte() * 1427389417;
			break;
		}
	}

	public Class298_Sub32_Sub20() {
		super(0, true);
		((Class298_Sub32_Sub20) this).anInt9449 = -410088756;
	}

	void method3262(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub20) this).anInt9451 = class298_sub53.readUnsignedByte() * 325240011;
			break;
		case 2:
			((Class298_Sub32_Sub20) this).anInt9449 = class298_sub53.readUnsignedShort() * 1071731585;
			break;
		case 0:
			((Class298_Sub32_Sub20) this).anInt9450 = class298_sub53.readUnsignedByte() * 1427389417;
			break;
		}
	}

	public static void method3263(int i, boolean bool, int i_23_, boolean bool_24_, int i_25_) {
		try {
			Class273.method2562(0, Class474.aClass343_Sub1Array5975.length - 1, i, bool, i_23_, bool_24_, (byte) -46);
			Class474.anInt5971 = 0;
			Class474.aClass396_5978 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahi.u(").append(')').toString());
		}
	}
}
