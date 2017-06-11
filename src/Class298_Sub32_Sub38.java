/* Class298_Sub32_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub38 extends Class298_Sub32 {
	int anInt9559;
	int anInt9560;
	int anInt9561;
	int anInt9562 = 2092275712;
	int anInt9563;
	int anInt9564;
	int anInt9565;

	void method3378() {
		Class250.method2396((byte) 41);
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1326097186);
			if (aClass257_7384.aBoolean2810) {
				int i_1_ = Class250.anIntArray2760[i] - 2048;
				for (int i_2_ = 0; i_2_ < Class250.anInt2755 * -1474554145; i_2_++) {
					int i_3_ = Class250.anIntArray2762[i_2_] - 2048;
					int i_4_ = ((((Class298_Sub32_Sub38) this).anInt9562 * -1801516933) + i_3_);
					i_4_ = i_4_ < -2048 ? i_4_ + 4096 : i_4_;
					i_4_ = i_4_ > 2048 ? i_4_ - 4096 : i_4_;
					int i_5_ = i_1_ + (351466605 * ((Class298_Sub32_Sub38) this).anInt9559);
					i_5_ = i_5_ < -2048 ? 4096 + i_5_ : i_5_;
					i_5_ = i_5_ > 2048 ? i_5_ - 4096 : i_5_;
					int i_6_ = (-670406741 * ((Class298_Sub32_Sub38) this).anInt9561 + i_3_);
					i_6_ = i_6_ < -2048 ? 4096 + i_6_ : i_6_;
					i_6_ = i_6_ > 2048 ? i_6_ - 4096 : i_6_;
					int i_7_ = i_1_ + (((Class298_Sub32_Sub38) this).anInt9565 * 939068299);
					i_7_ = i_7_ < -2048 ? 4096 + i_7_ : i_7_;
					i_7_ = i_7_ > 2048 ? i_7_ - 4096 : i_7_;
					is[i_2_] = (method3380(i_4_, i_5_, 1631373907) || method3379(i_6_, i_7_, 689077390)) ? 4096 : 0;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aie.i(").append(')').toString());
		}
	}

	void method3133(int i) {
		try {
			Class250.method2396((byte) -3);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aie.x(").append(')').toString());
		}
	}

	boolean method3379(int i, int i_8_, int i_9_) {
		try {
			int i_10_ = ((-1052090709 * ((Class298_Sub32_Sub38) this).anInt9563 * (i + i_8_)) >> 12);
			int i_11_ = Class250.anIntArray2763[255 * i_10_ >> 12 & 0xff];
			i_11_ = (i_11_ << 12) / (((Class298_Sub32_Sub38) this).anInt9563 * -1052090709);
			i_11_ = (i_11_ << 12) / (454265253 * ((Class298_Sub32_Sub38) this).anInt9564);
			i_11_ = i_11_ * (679642301 * ((Class298_Sub32_Sub38) this).anInt9560) >> 12;
			return i_8_ - i < i_11_ && i_8_ - i > -i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aie.am(").append(')').toString());
		}
	}

	boolean method3380(int i, int i_12_, int i_13_) {
		try {
			int i_14_ = ((i_12_ - i) * (-1052090709 * ((Class298_Sub32_Sub38) this).anInt9563) >> 12);
			int i_15_ = Class250.anIntArray2763[255 * i_14_ >> 12 & 0xff];
			i_15_ = (i_15_ << 12) / (-1052090709 * ((Class298_Sub32_Sub38) this).anInt9563);
			i_15_ = (i_15_ << 12) / (454265253 * ((Class298_Sub32_Sub38) this).anInt9564);
			i_15_ = i_15_ * (((Class298_Sub32_Sub38) this).anInt9560 * 679642301) >> 12;
			return i + i_12_ < i_15_ && i + i_12_ > -i_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aie.ac(").append(')').toString());
		}
	}

	int[] method3381(int i) {
		int[] is = aClass257_7384.method2448(i, 682412629);
		if (aClass257_7384.aBoolean2810) {
			int i_16_ = Class250.anIntArray2760[i] - 2048;
			for (int i_17_ = 0; i_17_ < Class250.anInt2755 * -1474554145; i_17_++) {
				int i_18_ = Class250.anIntArray2762[i_17_] - 2048;
				int i_19_ = (((Class298_Sub32_Sub38) this).anInt9562 * -1801516933 + i_18_);
				i_19_ = i_19_ < -2048 ? i_19_ + 4096 : i_19_;
				i_19_ = i_19_ > 2048 ? i_19_ - 4096 : i_19_;
				int i_20_ = (i_16_ + 351466605 * ((Class298_Sub32_Sub38) this).anInt9559);
				i_20_ = i_20_ < -2048 ? 4096 + i_20_ : i_20_;
				i_20_ = i_20_ > 2048 ? i_20_ - 4096 : i_20_;
				int i_21_ = (-670406741 * ((Class298_Sub32_Sub38) this).anInt9561 + i_18_);
				i_21_ = i_21_ < -2048 ? 4096 + i_21_ : i_21_;
				i_21_ = i_21_ > 2048 ? i_21_ - 4096 : i_21_;
				int i_22_ = (i_16_ + ((Class298_Sub32_Sub38) this).anInt9565 * 939068299);
				i_22_ = i_22_ < -2048 ? 4096 + i_22_ : i_22_;
				i_22_ = i_22_ > 2048 ? i_22_ - 4096 : i_22_;
				is[i_17_] = (method3380(i_19_, i_20_, 838244364) || method3379(i_21_, i_22_, 424769104)) ? 4096 : 0;
			}
		}
		return is;
	}

	void method3382() {
		Class250.method2396((byte) -73);
	}

	void method3383() {
		Class250.method2396((byte) -116);
	}

	void method3384(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 5:
			((Class298_Sub32_Sub38) this).anInt9560 = class298_sub53.readUnsignedShort() * -1402300779;
			break;
		case 0:
			((Class298_Sub32_Sub38) this).anInt9562 = class298_sub53.readUnsignedShort() * -2115004749;
			break;
		case 3:
			((Class298_Sub32_Sub38) this).anInt9565 = class298_sub53.readUnsignedShort() * -1141390301;
			break;
		case 2:
			((Class298_Sub32_Sub38) this).anInt9561 = class298_sub53.readUnsignedShort() * -871015677;
			break;
		case 6:
			((Class298_Sub32_Sub38) this).anInt9564 = class298_sub53.readUnsignedShort() * 233322029;
			break;
		case 4:
			((Class298_Sub32_Sub38) this).anInt9563 = class298_sub53.readUnsignedShort() * 1435675651;
			break;
		case 1:
			((Class298_Sub32_Sub38) this).anInt9559 = class298_sub53.readUnsignedShort() * -925420187;
			break;
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_23_) {
		try {
			switch (i) {
			case 5:
				((Class298_Sub32_Sub38) this).anInt9560 = class298_sub53.readUnsignedShort() * -1402300779;
				break;
			case 0:
				((Class298_Sub32_Sub38) this).anInt9562 = class298_sub53.readUnsignedShort() * -2115004749;
				break;
			case 3:
				((Class298_Sub32_Sub38) this).anInt9565 = class298_sub53.readUnsignedShort() * -1141390301;
				break;
			case 2:
				((Class298_Sub32_Sub38) this).anInt9561 = class298_sub53.readUnsignedShort() * -871015677;
				break;
			case 6:
				((Class298_Sub32_Sub38) this).anInt9564 = class298_sub53.readUnsignedShort() * 233322029;
				break;
			case 4:
				((Class298_Sub32_Sub38) this).anInt9563 = class298_sub53.readUnsignedShort() * 1435675651;
				break;
			case 1:
				((Class298_Sub32_Sub38) this).anInt9559 = class298_sub53.readUnsignedShort() * -925420187;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aie.r(").append(')').toString());
		}
	}

	void method3385(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 5:
			((Class298_Sub32_Sub38) this).anInt9560 = class298_sub53.readUnsignedShort() * -1402300779;
			break;
		case 0:
			((Class298_Sub32_Sub38) this).anInt9562 = class298_sub53.readUnsignedShort() * -2115004749;
			break;
		case 3:
			((Class298_Sub32_Sub38) this).anInt9565 = class298_sub53.readUnsignedShort() * -1141390301;
			break;
		case 2:
			((Class298_Sub32_Sub38) this).anInt9561 = class298_sub53.readUnsignedShort() * -871015677;
			break;
		case 6:
			((Class298_Sub32_Sub38) this).anInt9564 = class298_sub53.readUnsignedShort() * 233322029;
			break;
		case 4:
			((Class298_Sub32_Sub38) this).anInt9563 = class298_sub53.readUnsignedShort() * 1435675651;
			break;
		case 1:
			((Class298_Sub32_Sub38) this).anInt9559 = class298_sub53.readUnsignedShort() * -925420187;
			break;
		}
	}

	int[] method3386(int i) {
		int[] is = aClass257_7384.method2448(i, 1324106333);
		if (aClass257_7384.aBoolean2810) {
			int i_24_ = Class250.anIntArray2760[i] - 2048;
			for (int i_25_ = 0; i_25_ < Class250.anInt2755 * -1474554145; i_25_++) {
				int i_26_ = Class250.anIntArray2762[i_25_] - 2048;
				int i_27_ = (((Class298_Sub32_Sub38) this).anInt9562 * -1801516933 + i_26_);
				i_27_ = i_27_ < -2048 ? i_27_ + 4096 : i_27_;
				i_27_ = i_27_ > 2048 ? i_27_ - 4096 : i_27_;
				int i_28_ = (i_24_ + 351466605 * ((Class298_Sub32_Sub38) this).anInt9559);
				i_28_ = i_28_ < -2048 ? 4096 + i_28_ : i_28_;
				i_28_ = i_28_ > 2048 ? i_28_ - 4096 : i_28_;
				int i_29_ = (-670406741 * ((Class298_Sub32_Sub38) this).anInt9561 + i_26_);
				i_29_ = i_29_ < -2048 ? 4096 + i_29_ : i_29_;
				i_29_ = i_29_ > 2048 ? i_29_ - 4096 : i_29_;
				int i_30_ = (i_24_ + ((Class298_Sub32_Sub38) this).anInt9565 * 939068299);
				i_30_ = i_30_ < -2048 ? 4096 + i_30_ : i_30_;
				i_30_ = i_30_ > 2048 ? i_30_ - 4096 : i_30_;
				is[i_25_] = (method3380(i_27_, i_28_, -630514594) || method3379(i_29_, i_30_, -716173681)) ? 4096 : 0;
			}
		}
		return is;
	}

	public Class298_Sub32_Sub38() {
		super(0, true);
		((Class298_Sub32_Sub38) this).anInt9559 = 0;
		((Class298_Sub32_Sub38) this).anInt9561 = 0;
		((Class298_Sub32_Sub38) this).anInt9565 = -1105127424;
		((Class298_Sub32_Sub38) this).anInt9563 = -2143252480;
		((Class298_Sub32_Sub38) this).anInt9560 = -1452716032;
		((Class298_Sub32_Sub38) this).anInt9564 = 113614848;
	}

	public static int method3387(int i, int i_31_, int i_32_, int i_33_) {
		try {
			int i_34_ = 255 - i_32_;
			i_31_ = (i_32_ * (i_31_ & 0xff00ff) & ~0xff00ff | i_32_ * (i_31_ & 0xff00) & 0xff0000) >>> 8;
			return i_31_ + (((i & 0xff00ff) * i_34_ & ~0xff00ff | (i & 0xff00) * i_34_ & 0xff0000) >>> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aie.u(").append(')').toString());
		}
	}
}
