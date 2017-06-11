/* Class298_Sub32_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub23 extends Class298_Sub32 {
	int anInt9469;
	static byte[] aByteArray9470;
	static int anInt9471 = 4096;
	int anInt9472 = 1522053120;
	static int anInt9473 = 3216;
	int anInt9474;
	int[] anIntArray9475;
	static int anInt9476 = 3216;
	static int anInt9477;

	static {
		int i = 0;
		aByteArray9470 = new byte[32896];
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			for (int i_1_ = 0; i_1_ <= i_0_; i_1_++)
				aByteArray9470[i++] = (byte) (int) (255.0 / (Math.sqrt((double) ((float) (65535 + (i_0_ * i_0_ + i_1_ * i_1_)) / 65535.0F))));
		}
	}

	int[] method3131(int i, int i_2_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1709165906);
			if (aClass257_7384.aBoolean2810) {
				int i_3_ = ((1238246435 * ((Class298_Sub32_Sub23) this).anInt9472 * (Class250.anInt2757 * 1282258747)) >> 12);
				int[] is_4_ = method3129(0, i - 1 & -289063255 * Class250.anInt2758, -1887337990);
				int[] is_5_ = method3129(0, i, -1887337990);
				int[] is_6_ = method3129(0, i + 1 & -289063255 * Class250.anInt2758, -1887337990);
				for (int i_7_ = 0; i_7_ < -1474554145 * Class250.anInt2755; i_7_++) {
					int i_8_ = i_3_ * (is_6_[i_7_] - is_4_[i_7_]) >> 12;
					int i_9_ = (i_3_ * (is_5_[(i_7_ - 1 & -901777799 * Class250.anInt2753)] - is_5_[1 + i_7_ & (Class250.anInt2753 * -901777799)]) >> 12);
					int i_10_ = i_9_ >> 4;
					int i_11_ = i_8_ >> 4;
					if (i_10_ < 0)
						i_10_ = -i_10_;
					if (i_10_ > 255)
						i_10_ = 255;
					if (i_11_ < 0)
						i_11_ = -i_11_;
					if (i_11_ > 255)
						i_11_ = 255;
					int i_12_ = (aByteArray9470[i_10_ + (i_11_ * (i_11_ + 1) >> 1)] & 0xff);
					int i_13_ = i_12_ * i_9_ >> 8;
					int i_14_ = i_12_ * i_8_ >> 8;
					int i_15_ = i_12_ * 4096 >> 8;
					i_13_ = (((Class298_Sub32_Sub23) this).anIntArray9475[0] * i_13_) >> 12;
					i_14_ = (((Class298_Sub32_Sub23) this).anIntArray9475[1] * i_14_) >> 12;
					i_15_ = (((Class298_Sub32_Sub23) this).anIntArray9475[2] * i_15_) >> 12;
					is[i_7_] = i_13_ + i_14_ + i_15_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahl.i(").append(')').toString());
		}
	}

	public Class298_Sub32_Sub23() {
		super(1, true);
		((Class298_Sub32_Sub23) this).anInt9469 = 1473478640;
		((Class298_Sub32_Sub23) this).anInt9474 = 825586896;
		((Class298_Sub32_Sub23) this).anIntArray9475 = new int[3];
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_16_) {
		try {
			switch (i) {
			case 0:
				((Class298_Sub32_Sub23) this).anInt9472 = class298_sub53.readUnsignedShort() * -1530549365;
				break;
			case 2:
				((Class298_Sub32_Sub23) this).anInt9474 = class298_sub53.readUnsignedShort() * -272185243;
				break;
			case 1:
				((Class298_Sub32_Sub23) this).anInt9469 = class298_sub53.readUnsignedShort() * -803512697;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahl.r(").append(')').toString());
		}
	}

	void method3280(int i) {
		try {
			double d = Math.cos((double) ((float) ((((Class298_Sub32_Sub23) this).anInt9474) * -5592723) / 4096.0F));
			((Class298_Sub32_Sub23) this).anIntArray9475[0] = (int) (Math.sin((double) ((float) (((Class298_Sub32_Sub23) this).anInt9469 * -2106652873) / 4096.0F)) * d * 4096.0);
			((Class298_Sub32_Sub23) this).anIntArray9475[1] = (int) (Math.cos((double) ((float) (-2106652873 * ((Class298_Sub32_Sub23) this).anInt9469) / 4096.0F)) * d * 4096.0);
			((Class298_Sub32_Sub23) this).anIntArray9475[2] = (int) (Math.sin((double) ((float) (((Class298_Sub32_Sub23) this).anInt9474 * -5592723) / 4096.0F)) * 4096.0);
			int i_17_ = ((((Class298_Sub32_Sub23) this).anIntArray9475[0] * ((Class298_Sub32_Sub23) this).anIntArray9475[0]) >> 12);
			int i_18_ = ((((Class298_Sub32_Sub23) this).anIntArray9475[1] * ((Class298_Sub32_Sub23) this).anIntArray9475[1]) >> 12);
			int i_19_ = ((((Class298_Sub32_Sub23) this).anIntArray9475[2] * ((Class298_Sub32_Sub23) this).anIntArray9475[2]) >> 12);
			int i_20_ = (int) (Math.sqrt((double) (i_19_ + (i_18_ + i_17_) >> 12)) * 4096.0);
			if (i_20_ != 0) {
				((Class298_Sub32_Sub23) this).anIntArray9475[0] = ((((Class298_Sub32_Sub23) this).anIntArray9475[0] << 12) / i_20_);
				((Class298_Sub32_Sub23) this).anIntArray9475[1] = ((((Class298_Sub32_Sub23) this).anIntArray9475[1] << 12) / i_20_);
				((Class298_Sub32_Sub23) this).anIntArray9475[2] = ((((Class298_Sub32_Sub23) this).anIntArray9475[2] << 12) / i_20_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahl.ac(").append(')').toString());
		}
	}

	void method3133(int i) {
		try {
			method3280(491041970);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahl.x(").append(')').toString());
		}
	}

	int[] method3281(int i) {
		int[] is = aClass257_7384.method2448(i, 573090872);
		if (aClass257_7384.aBoolean2810) {
			int i_21_ = ((1238246435 * ((Class298_Sub32_Sub23) this).anInt9472 * (Class250.anInt2757 * 1282258747)) >> 12);
			int[] is_22_ = method3129(0, i - 1 & -289063255 * Class250.anInt2758, -1887337990);
			int[] is_23_ = method3129(0, i, -1887337990);
			int[] is_24_ = method3129(0, i + 1 & -289063255 * Class250.anInt2758, -1887337990);
			for (int i_25_ = 0; i_25_ < -1474554145 * Class250.anInt2755; i_25_++) {
				int i_26_ = i_21_ * (is_24_[i_25_] - is_22_[i_25_]) >> 12;
				int i_27_ = ((i_21_ * (is_23_[i_25_ - 1 & -901777799 * Class250.anInt2753] - (is_23_[1 + i_25_ & Class250.anInt2753 * -901777799]))) >> 12);
				int i_28_ = i_27_ >> 4;
				int i_29_ = i_26_ >> 4;
				if (i_28_ < 0)
					i_28_ = -i_28_;
				if (i_28_ > 255)
					i_28_ = 255;
				if (i_29_ < 0)
					i_29_ = -i_29_;
				if (i_29_ > 255)
					i_29_ = 255;
				int i_30_ = (aByteArray9470[i_28_ + (i_29_ * (i_29_ + 1) >> 1)] & 0xff);
				int i_31_ = i_30_ * i_27_ >> 8;
				int i_32_ = i_30_ * i_26_ >> 8;
				int i_33_ = i_30_ * 4096 >> 8;
				i_31_ = (((Class298_Sub32_Sub23) this).anIntArray9475[0] * i_31_ >> 12);
				i_32_ = (((Class298_Sub32_Sub23) this).anIntArray9475[1] * i_32_ >> 12);
				i_33_ = (((Class298_Sub32_Sub23) this).anIntArray9475[2] * i_33_ >> 12);
				is[i_25_] = i_31_ + i_32_ + i_33_;
			}
		}
		return is;
	}

	int[] method3282(int i) {
		int[] is = aClass257_7384.method2448(i, 363755719);
		if (aClass257_7384.aBoolean2810) {
			int i_34_ = ((1238246435 * ((Class298_Sub32_Sub23) this).anInt9472 * (Class250.anInt2757 * 1282258747)) >> 12);
			int[] is_35_ = method3129(0, i - 1 & -289063255 * Class250.anInt2758, -1887337990);
			int[] is_36_ = method3129(0, i, -1887337990);
			int[] is_37_ = method3129(0, i + 1 & -289063255 * Class250.anInt2758, -1887337990);
			for (int i_38_ = 0; i_38_ < -1474554145 * Class250.anInt2755; i_38_++) {
				int i_39_ = i_34_ * (is_37_[i_38_] - is_35_[i_38_]) >> 12;
				int i_40_ = ((i_34_ * (is_36_[i_38_ - 1 & -901777799 * Class250.anInt2753] - (is_36_[1 + i_38_ & Class250.anInt2753 * -901777799]))) >> 12);
				int i_41_ = i_40_ >> 4;
				int i_42_ = i_39_ >> 4;
				if (i_41_ < 0)
					i_41_ = -i_41_;
				if (i_41_ > 255)
					i_41_ = 255;
				if (i_42_ < 0)
					i_42_ = -i_42_;
				if (i_42_ > 255)
					i_42_ = 255;
				int i_43_ = (aByteArray9470[i_41_ + (i_42_ * (i_42_ + 1) >> 1)] & 0xff);
				int i_44_ = i_43_ * i_40_ >> 8;
				int i_45_ = i_43_ * i_39_ >> 8;
				int i_46_ = i_43_ * 4096 >> 8;
				i_44_ = (((Class298_Sub32_Sub23) this).anIntArray9475[0] * i_44_ >> 12);
				i_45_ = (((Class298_Sub32_Sub23) this).anIntArray9475[1] * i_45_ >> 12);
				i_46_ = (((Class298_Sub32_Sub23) this).anIntArray9475[2] * i_46_ >> 12);
				is[i_38_] = i_44_ + i_45_ + i_46_;
			}
		}
		return is;
	}

	void method3283(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub23) this).anInt9472 = class298_sub53.readUnsignedShort() * -1530549365;
			break;
		case 2:
			((Class298_Sub32_Sub23) this).anInt9474 = class298_sub53.readUnsignedShort() * -272185243;
			break;
		case 1:
			((Class298_Sub32_Sub23) this).anInt9469 = class298_sub53.readUnsignedShort() * -803512697;
			break;
		}
	}

	void method3284() {
		method3280(175432962);
	}

	void method3285() {
		method3280(1304382718);
	}

	void method3286() {
		method3280(1816411328);
	}

	void method3287(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub23) this).anInt9472 = class298_sub53.readUnsignedShort() * -1530549365;
			break;
		case 2:
			((Class298_Sub32_Sub23) this).anInt9474 = class298_sub53.readUnsignedShort() * -272185243;
			break;
		case 1:
			((Class298_Sub32_Sub23) this).anInt9469 = class298_sub53.readUnsignedShort() * -803512697;
			break;
		}
	}
}
