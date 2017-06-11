/* Class298_Sub32_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub18 extends Class298_Sub32 {
	int anInt9434 = 0;
	static int anInt9435 = 0;
	static int anInt9436 = 0;
	static int anInt9437 = 2;
	static int anInt9438 = 0;
	static int anInt9439 = 1;
	static int anInt9440 = 0;
	int anInt9441 = 0;
	int anInt9442 = -190415455;

	void method3243(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 3:
			((Class298_Sub32_Sub18) this).anInt9442 = class298_sub53.readUnsignedByte() * -190415455;
			break;
		case 0:
			((Class298_Sub32_Sub18) this).anInt9434 = class298_sub53.readUnsignedByte() * 56159889;
			break;
		case 1:
			((Class298_Sub32_Sub18) this).anInt9441 = class298_sub53.readUnsignedByte() * -518479681;
			break;
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_0_) {
		try {
			switch (i) {
			case 3:
				((Class298_Sub32_Sub18) this).anInt9442 = class298_sub53.readUnsignedByte() * -190415455;
				break;
			case 0:
				((Class298_Sub32_Sub18) this).anInt9434 = class298_sub53.readUnsignedByte() * 56159889;
				break;
			case 1:
				((Class298_Sub32_Sub18) this).anInt9441 = class298_sub53.readUnsignedByte() * -518479681;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahg.r(").append(')').toString());
		}
	}

	void method3133(int i) {
		try {
			Class250.method2396((byte) 40);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahg.x(").append(')').toString());
		}
	}

	void method3244(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 3:
			((Class298_Sub32_Sub18) this).anInt9442 = class298_sub53.readUnsignedByte() * -190415455;
			break;
		case 0:
			((Class298_Sub32_Sub18) this).anInt9434 = class298_sub53.readUnsignedByte() * 56159889;
			break;
		case 1:
			((Class298_Sub32_Sub18) this).anInt9441 = class298_sub53.readUnsignedByte() * -518479681;
			break;
		}
	}

	int[] method3245(int i) {
		int[] is = aClass257_7384.method2448(i, 1479110455);
		if (aClass257_7384.aBoolean2810) {
			int i_1_ = Class250.anIntArray2760[i];
			int i_2_ = i_1_ - 2048 >> 1;
			for (int i_3_ = 0; i_3_ < Class250.anInt2755 * -1474554145; i_3_++) {
				int i_4_ = Class250.anIntArray2762[i_3_];
				int i_5_ = i_4_ - 2048 >> 1;
				int i_6_;
				if (716214897 * ((Class298_Sub32_Sub18) this).anInt9434 == 0)
					i_6_ = ((i_4_ - i_1_) * (1525982817 * ((Class298_Sub32_Sub18) this).anInt9442));
				else {
					int i_7_ = i_2_ * i_2_ + i_5_ * i_5_ >> 12;
					i_6_ = (int) (Math.sqrt((double) ((float) i_7_ / 4096.0F)) * 4096.0);
					i_6_ = (int) ((double) (i_6_ * ((((Class298_Sub32_Sub18) this).anInt9442) * 1525982817)) * 3.141592653589793);
				}
				i_6_ -= i_6_ & ~0xfff;
				if (0 == ((Class298_Sub32_Sub18) this).anInt9441 * 1988808511)
					i_6_ = (Class250.anIntArray2761[i_6_ >> 4 & 0xff] + 4096 >> 1);
				else if (((Class298_Sub32_Sub18) this).anInt9441 * 1988808511 == 2) {
					i_6_ -= 2048;
					if (i_6_ < 0)
						i_6_ = -i_6_;
					i_6_ = 2048 - i_6_ << 1;
				}
				is[i_3_] = i_6_;
			}
		}
		return is;
	}

	void method3246() {
		Class250.method2396((byte) -8);
	}

	void method3247() {
		Class250.method2396((byte) 54);
	}

	void method3248() {
		Class250.method2396((byte) -24);
	}

	int[] method3131(int i, int i_8_) {
		try {
			int[] is = aClass257_7384.method2448(i, -59827140);
			if (aClass257_7384.aBoolean2810) {
				int i_9_ = Class250.anIntArray2760[i];
				int i_10_ = i_9_ - 2048 >> 1;
				for (int i_11_ = 0; i_11_ < Class250.anInt2755 * -1474554145; i_11_++) {
					int i_12_ = Class250.anIntArray2762[i_11_];
					int i_13_ = i_12_ - 2048 >> 1;
					int i_14_;
					if (716214897 * ((Class298_Sub32_Sub18) this).anInt9434 == 0)
						i_14_ = ((i_12_ - i_9_) * (1525982817 * ((Class298_Sub32_Sub18) this).anInt9442));
					else {
						int i_15_ = i_10_ * i_10_ + i_13_ * i_13_ >> 12;
						i_14_ = (int) (Math.sqrt((double) ((float) i_15_ / 4096.0F)) * 4096.0);
						i_14_ = (int) ((double) (i_14_ * (((Class298_Sub32_Sub18) this).anInt9442 * 1525982817)) * 3.141592653589793);
					}
					i_14_ -= i_14_ & ~0xfff;
					if (0 == (((Class298_Sub32_Sub18) this).anInt9441 * 1988808511))
						i_14_ = (Class250.anIntArray2761[i_14_ >> 4 & 0xff] + 4096) >> 1;
					else if ((((Class298_Sub32_Sub18) this).anInt9441 * 1988808511) == 2) {
						i_14_ -= 2048;
						if (i_14_ < 0)
							i_14_ = -i_14_;
						i_14_ = 2048 - i_14_ << 1;
					}
					is[i_11_] = i_14_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahg.i(").append(')').toString());
		}
	}

	public Class298_Sub32_Sub18() {
		super(0, true);
	}

	int[] method3249(int i) {
		int[] is = aClass257_7384.method2448(i, 2057352597);
		if (aClass257_7384.aBoolean2810) {
			int i_16_ = Class250.anIntArray2760[i];
			int i_17_ = i_16_ - 2048 >> 1;
			for (int i_18_ = 0; i_18_ < Class250.anInt2755 * -1474554145; i_18_++) {
				int i_19_ = Class250.anIntArray2762[i_18_];
				int i_20_ = i_19_ - 2048 >> 1;
				int i_21_;
				if (716214897 * ((Class298_Sub32_Sub18) this).anInt9434 == 0)
					i_21_ = ((i_19_ - i_16_) * (1525982817 * ((Class298_Sub32_Sub18) this).anInt9442));
				else {
					int i_22_ = i_17_ * i_17_ + i_20_ * i_20_ >> 12;
					i_21_ = (int) (Math.sqrt((double) ((float) i_22_ / 4096.0F)) * 4096.0);
					i_21_ = (int) ((double) (i_21_ * ((((Class298_Sub32_Sub18) this).anInt9442) * 1525982817)) * 3.141592653589793);
				}
				i_21_ -= i_21_ & ~0xfff;
				if (0 == ((Class298_Sub32_Sub18) this).anInt9441 * 1988808511)
					i_21_ = (Class250.anIntArray2761[i_21_ >> 4 & 0xff] + 4096 >> 1);
				else if (((Class298_Sub32_Sub18) this).anInt9441 * 1988808511 == 2) {
					i_21_ -= 2048;
					if (i_21_ < 0)
						i_21_ = -i_21_;
					i_21_ = 2048 - i_21_ << 1;
				}
				is[i_18_] = i_21_;
			}
		}
		return is;
	}
}
