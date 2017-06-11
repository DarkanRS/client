/* Class298_Sub32_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub31 extends Class298_Sub32 {
	int anInt9507;
	int anInt9508;
	int anInt9509 = 0;
	int anInt9510;

	void method3335(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub31) this).anInt9507 = class298_sub53.readUnsignedShort() * -1944832501;
			break;
		case 2:
			((Class298_Sub32_Sub31) this).anInt9509 = class298_sub53.readUnsignedShort() * 1715409727;
			break;
		case 1:
			((Class298_Sub32_Sub31) this).anInt9510 = class298_sub53.readUnsignedShort() * -1347820645;
			break;
		case 3:
			((Class298_Sub32_Sub31) this).anInt9508 = class298_sub53.readUnsignedShort() * 580600575;
			break;
		}
	}

	int[] method3336(int i) {
		int[] is = aClass257_7384.method2448(i, 1699675039);
		if (aClass257_7384.aBoolean2810) {
			for (int i_0_ = 0; i_0_ < Class250.anInt2755 * -1474554145; i_0_++) {
				int i_1_ = (544890047 * ((Class298_Sub32_Sub31) this).anInt9509 + ((Class250.anIntArray2762[i_0_] << 12) / (((Class298_Sub32_Sub31) this).anInt9507 * -1758059101)));
				int i_2_ = (((Class250.anIntArray2760[i] << 12) / (-1758059101 * ((Class298_Sub32_Sub31) this).anInt9507)) + ((Class298_Sub32_Sub31) this).anInt9508 * -824460033);
				int i_3_ = i_1_;
				int i_4_ = i_2_;
				int i_5_ = i_1_;
				int i_6_ = i_2_;
				int i_7_ = i_1_ * i_1_ >> 12;
				int i_8_ = i_2_ * i_2_ >> 12;
				int i_9_;
				for (i_9_ = 0; (i_8_ + i_7_ < 16384 && i_9_ < (((Class298_Sub32_Sub31) this).anInt9510 * 1781451411)); i_9_++) {
					i_6_ = (i_5_ * i_6_ >> 12) * 2 + i_4_;
					i_5_ = i_7_ - i_8_ + i_3_;
					i_7_ = i_5_ * i_5_ >> 12;
					i_8_ = i_6_ * i_6_ >> 12;
				}
				is[i_0_] = (i_9_ < (((Class298_Sub32_Sub31) this).anInt9510 * 1781451411) - 1 ? ((i_9_ << 12) / (((Class298_Sub32_Sub31) this).anInt9510 * 1781451411)) : 0);
			}
		}
		return is;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_10_) {
		try {
			switch (i) {
			case 0:
				((Class298_Sub32_Sub31) this).anInt9507 = class298_sub53.readUnsignedShort() * -1944832501;
				break;
			case 2:
				((Class298_Sub32_Sub31) this).anInt9509 = class298_sub53.readUnsignedShort() * 1715409727;
				break;
			case 1:
				((Class298_Sub32_Sub31) this).anInt9510 = class298_sub53.readUnsignedShort() * -1347820645;
				break;
			case 3:
				((Class298_Sub32_Sub31) this).anInt9508 = class298_sub53.readUnsignedShort() * 580600575;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aht.r(").append(')').toString());
		}
	}

	public Class298_Sub32_Sub31() {
		super(0, true);
		((Class298_Sub32_Sub31) this).anInt9508 = 0;
		((Class298_Sub32_Sub31) this).anInt9507 = -406574937;
		((Class298_Sub32_Sub31) this).anInt9510 = -1186609124;
	}

	int[] method3337(int i) {
		int[] is = aClass257_7384.method2448(i, 1437756438);
		if (aClass257_7384.aBoolean2810) {
			for (int i_11_ = 0; i_11_ < Class250.anInt2755 * -1474554145; i_11_++) {
				int i_12_ = (544890047 * ((Class298_Sub32_Sub31) this).anInt9509 + ((Class250.anIntArray2762[i_11_] << 12) / (((Class298_Sub32_Sub31) this).anInt9507 * -1758059101)));
				int i_13_ = (((Class250.anIntArray2760[i] << 12) / (-1758059101 * ((Class298_Sub32_Sub31) this).anInt9507)) + ((Class298_Sub32_Sub31) this).anInt9508 * -824460033);
				int i_14_ = i_12_;
				int i_15_ = i_13_;
				int i_16_ = i_12_;
				int i_17_ = i_13_;
				int i_18_ = i_12_ * i_12_ >> 12;
				int i_19_ = i_13_ * i_13_ >> 12;
				int i_20_;
				for (i_20_ = 0; (i_19_ + i_18_ < 16384 && i_20_ < (((Class298_Sub32_Sub31) this).anInt9510 * 1781451411)); i_20_++) {
					i_17_ = (i_16_ * i_17_ >> 12) * 2 + i_15_;
					i_16_ = i_18_ - i_19_ + i_14_;
					i_18_ = i_16_ * i_16_ >> 12;
					i_19_ = i_17_ * i_17_ >> 12;
				}
				is[i_11_] = (i_20_ < (((Class298_Sub32_Sub31) this).anInt9510 * 1781451411) - 1 ? ((i_20_ << 12) / (((Class298_Sub32_Sub31) this).anInt9510 * 1781451411)) : 0);
			}
		}
		return is;
	}

	int[] method3131(int i, int i_21_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1793310792);
			if (aClass257_7384.aBoolean2810) {
				for (int i_22_ = 0; i_22_ < Class250.anInt2755 * -1474554145; i_22_++) {
					int i_23_ = (544890047 * ((Class298_Sub32_Sub31) this).anInt9509 + ((Class250.anIntArray2762[i_22_] << 12) / (((Class298_Sub32_Sub31) this).anInt9507 * -1758059101)));
					int i_24_ = (((Class250.anIntArray2760[i] << 12) / (-1758059101 * ((Class298_Sub32_Sub31) this).anInt9507)) + (((Class298_Sub32_Sub31) this).anInt9508 * -824460033));
					int i_25_ = i_23_;
					int i_26_ = i_24_;
					int i_27_ = i_23_;
					int i_28_ = i_24_;
					int i_29_ = i_23_ * i_23_ >> 12;
					int i_30_ = i_24_ * i_24_ >> 12;
					int i_31_;
					for (i_31_ = 0; (i_30_ + i_29_ < 16384 && i_31_ < (((Class298_Sub32_Sub31) this).anInt9510 * 1781451411)); i_31_++) {
						i_28_ = (i_27_ * i_28_ >> 12) * 2 + i_26_;
						i_27_ = i_29_ - i_30_ + i_25_;
						i_29_ = i_27_ * i_27_ >> 12;
						i_30_ = i_28_ * i_28_ >> 12;
					}
					is[i_22_] = (i_31_ < (((Class298_Sub32_Sub31) this).anInt9510 * 1781451411) - 1 ? ((i_31_ << 12) / (((Class298_Sub32_Sub31) this).anInt9510 * 1781451411)) : 0);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aht.i(").append(')').toString());
		}
	}

	void method3338(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub31) this).anInt9507 = class298_sub53.readUnsignedShort() * -1944832501;
			break;
		case 2:
			((Class298_Sub32_Sub31) this).anInt9509 = class298_sub53.readUnsignedShort() * 1715409727;
			break;
		case 1:
			((Class298_Sub32_Sub31) this).anInt9510 = class298_sub53.readUnsignedShort() * -1347820645;
			break;
		case 3:
			((Class298_Sub32_Sub31) this).anInt9508 = class298_sub53.readUnsignedShort() * 580600575;
			break;
		}
	}

	public static boolean method3339(int i, int i_32_) {
		try {
			return i != 1 && 7 != i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aht.a(").append(')').toString());
		}
	}
}
