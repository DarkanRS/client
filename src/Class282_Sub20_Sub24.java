/* Class282_Sub20_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub24 extends Class282_Sub20 {
	int anInt9880;
	int[] anIntArray9881;
	int anInt9882 = -663619531;
	int anInt9883;
	public static IComponentDefinitions aClass118_9884;

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 786360379);
		if (aClass308_7670.aBool3619) {
			int i_0_ = (((-929726253 * Class316.anInt3671 != ((Class282_Sub20_Sub24) this).anInt9883 * -288946729) ? (-288946729 * ((Class282_Sub20_Sub24) this).anInt9883 * i / (-929726253 * Class316.anInt3671)) : i) * (669437611 * ((Class282_Sub20_Sub24) this).anInt9880));
			int[] is_1_ = is[0];
			int[] is_2_ = is[1];
			int[] is_3_ = is[2];
			if (669437611 * ((Class282_Sub20_Sub24) this).anInt9880 == -402153223 * Class316.anInt3670) {
				for (int i_4_ = 0; i_4_ < Class316.anInt3670 * -402153223; i_4_++) {
					int i_5_ = ((Class282_Sub20_Sub24) this).anIntArray9881[i_0_++];
					is_3_[i_4_] = (i_5_ & 0xff) << 4;
					is_2_[i_4_] = (i_5_ & 0xff00) >> 4;
					is_1_[i_4_] = (i_5_ & 0xff0000) >> 12;
				}
			} else {
				for (int i_6_ = 0; i_6_ < Class316.anInt3670 * -402153223; i_6_++) {
					int i_7_ = (669437611 * ((Class282_Sub20_Sub24) this).anInt9880 * i_6_ / (-402153223 * Class316.anInt3670));
					int i_8_ = (((Class282_Sub20_Sub24) this).anIntArray9881[i_0_ + i_7_]);
					is_3_[i_6_] = (i_8_ & 0xff) << 4;
					is_2_[i_6_] = (i_8_ & 0xff00) >> 4;
					is_1_[i_6_] = (i_8_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	void method12340(int i, int i_9_) {
		super.method12315(i, i_9_, (byte) 16);
		if (((Class282_Sub20_Sub24) this).anInt9882 * -1804311069 >= 0 && null != Class532_Sub1.anInterface22_7922) {
			int i_10_ = ((Class532_Sub1.anInterface22_7922.method144(((Class282_Sub20_Sub24) this).anInt9882 * -1804311069, -1757954463).aBool2065) ? 64 : 128);
			((Class282_Sub20_Sub24) this).anIntArray9881 = (Class532_Sub1.anInterface22_7922.method140(-1804311069 * ((Class282_Sub20_Sub24) this).anInt9882, 1.0F, i_10_, i_10_, false, (byte) 13));
			((Class282_Sub20_Sub24) this).anInt9883 = i_10_ * 645316071;
			((Class282_Sub20_Sub24) this).anInt9880 = -2121090045 * i_10_;
		}
	}

	int[][] method12320(int i, int i_11_) {
		int[][] is = aClass308_7670.method5463(i, 1586313259);
		if (aClass308_7670.aBool3619) {
			int i_12_ = (((-929726253 * Class316.anInt3671 != ((Class282_Sub20_Sub24) this).anInt9883 * -288946729) ? (-288946729 * ((Class282_Sub20_Sub24) this).anInt9883 * i / (-929726253 * Class316.anInt3671)) : i) * (669437611 * ((Class282_Sub20_Sub24) this).anInt9880));
			int[] is_13_ = is[0];
			int[] is_14_ = is[1];
			int[] is_15_ = is[2];
			if (669437611 * ((Class282_Sub20_Sub24) this).anInt9880 == -402153223 * Class316.anInt3670) {
				for (int i_16_ = 0; i_16_ < Class316.anInt3670 * -402153223; i_16_++) {
					int i_17_ = (((Class282_Sub20_Sub24) this).anIntArray9881[i_12_++]);
					is_15_[i_16_] = (i_17_ & 0xff) << 4;
					is_14_[i_16_] = (i_17_ & 0xff00) >> 4;
					is_13_[i_16_] = (i_17_ & 0xff0000) >> 12;
				}
			} else {
				for (int i_18_ = 0; i_18_ < Class316.anInt3670 * -402153223; i_18_++) {
					int i_19_ = (669437611 * ((Class282_Sub20_Sub24) this).anInt9880 * i_18_ / (-402153223 * Class316.anInt3670));
					int i_20_ = (((Class282_Sub20_Sub24) this).anIntArray9881[i_12_ + i_19_]);
					is_15_[i_18_] = (i_20_ & 0xff) << 4;
					is_14_[i_18_] = (i_20_ & 0xff00) >> 4;
					is_13_[i_18_] = (i_20_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	void method12315(int i, int i_21_, byte i_22_) {
		super.method12315(i, i_21_, (byte) 82);
		if (((Class282_Sub20_Sub24) this).anInt9882 * -1804311069 >= 0 && null != Class532_Sub1.anInterface22_7922) {
			int i_23_ = ((Class532_Sub1.anInterface22_7922.method144(((Class282_Sub20_Sub24) this).anInt9882 * -1804311069, -1755318475).aBool2065) ? 64 : 128);
			((Class282_Sub20_Sub24) this).anIntArray9881 = (Class532_Sub1.anInterface22_7922.method140(-1804311069 * ((Class282_Sub20_Sub24) this).anInt9882, 1.0F, i_23_, i_23_, false, (byte) 63));
			((Class282_Sub20_Sub24) this).anInt9883 = i_23_ * 645316071;
			((Class282_Sub20_Sub24) this).anInt9880 = -2121090045 * i_23_;
		}
	}

	void method12326(int i) {
		super.method12326(984017845);
		((Class282_Sub20_Sub24) this).anIntArray9881 = null;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_24_) {
		if (0 == i)
			((Class282_Sub20_Sub24) this).anInt9882 = class282_sub35.readUnsignedShort() * 663619531;
	}

	int method12324(byte i) {
		return -1804311069 * ((Class282_Sub20_Sub24) this).anInt9882;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		if (0 == i)
			((Class282_Sub20_Sub24) this).anInt9882 = class282_sub35.readUnsignedShort() * 663619531;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		if (0 == i)
			((Class282_Sub20_Sub24) this).anInt9882 = class282_sub35.readUnsignedShort() * 663619531;
	}

	public Class282_Sub20_Sub24() {
		super(0, false);
	}

	void method12316() {
		super.method12326(984017845);
		((Class282_Sub20_Sub24) this).anIntArray9881 = null;
	}

	int method12338() {
		return -1804311069 * ((Class282_Sub20_Sub24) this).anInt9882;
	}

	void method12337(int i, int i_25_) {
		super.method12315(i, i_25_, (byte) 22);
		if (((Class282_Sub20_Sub24) this).anInt9882 * -1804311069 >= 0 && null != Class532_Sub1.anInterface22_7922) {
			int i_26_ = ((Class532_Sub1.anInterface22_7922.method144(((Class282_Sub20_Sub24) this).anInt9882 * -1804311069, -2092050666).aBool2065) ? 64 : 128);
			((Class282_Sub20_Sub24) this).anIntArray9881 = (Class532_Sub1.anInterface22_7922.method140(-1804311069 * ((Class282_Sub20_Sub24) this).anInt9882, 1.0F, i_26_, i_26_, false, (byte) 18));
			((Class282_Sub20_Sub24) this).anInt9883 = i_26_ * 645316071;
			((Class282_Sub20_Sub24) this).anInt9880 = -2121090045 * i_26_;
		}
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		if (0 == i)
			((Class282_Sub20_Sub24) this).anInt9882 = class282_sub35.readUnsignedShort() * 663619531;
	}

	void method12343(int i, int i_27_) {
		super.method12315(i, i_27_, (byte) 82);
		if (((Class282_Sub20_Sub24) this).anInt9882 * -1804311069 >= 0 && null != Class532_Sub1.anInterface22_7922) {
			int i_28_ = ((Class532_Sub1.anInterface22_7922.method144(((Class282_Sub20_Sub24) this).anInt9882 * -1804311069, -2008285386).aBool2065) ? 64 : 128);
			((Class282_Sub20_Sub24) this).anIntArray9881 = (Class532_Sub1.anInterface22_7922.method140(-1804311069 * ((Class282_Sub20_Sub24) this).anInt9882, 1.0F, i_28_, i_28_, false, (byte) 101));
			((Class282_Sub20_Sub24) this).anInt9883 = i_28_ * 645316071;
			((Class282_Sub20_Sub24) this).anInt9880 = -2121090045 * i_28_;
		}
	}

	static final int method15390(int i, int i_29_, int i_30_) {
		return i_29_ < 0 ? -i : (int) ((double) i * Math.sqrt(1.220703125E-4 * (double) i_29_) + 0.5);
	}

	public static void method15391(int i) {
		if (Class320.aClass253_3723 != null)
			Class320.aClass253_3723.method4333();
		if (null != Class100.aClass253_1008)
			Class100.aClass253_1008.method4333();
	}
}
