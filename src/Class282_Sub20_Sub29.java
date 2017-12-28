/* Class282_Sub20_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub29 extends Class282_Sub20 {
	int anInt9912 = 1829497595;
	public static int anInt9913 = 144434553;
	int anInt9914;
	int anInt9915;
	int[] anIntArray9916;

	int method12314() {
		return 588672973 * ((Class282_Sub20_Sub29) this).anInt9912;
	}

	boolean method15397() {
		if (null != ((Class282_Sub20_Sub29) this).anIntArray9916)
			return true;
		if (((Class282_Sub20_Sub29) this).anInt9912 * 588672973 >= 0) {
			Class91 class91 = (-890139849 * anInt9913 >= 0 ? Class91.method1522(Class532_Sub2.aClass317_7925, -890139849 * anInt9913, 588672973 * ((Class282_Sub20_Sub29) this).anInt9912) : Class91.method1515(Class532_Sub2.aClass317_7925, 588672973 * ((Class282_Sub20_Sub29) this).anInt9912));
			class91.method1523();
			((Class282_Sub20_Sub29) this).anIntArray9916 = class91.method1528();
			((Class282_Sub20_Sub29) this).anInt9914 = class91.anInt957 * -1233841395;
			((Class282_Sub20_Sub29) this).anInt9915 = class91.anInt954 * 576104881;
			return true;
		}
		return false;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		if (0 == i)
			((Class282_Sub20_Sub29) this).anInt9912 = class282_sub35.readUnsignedShort() * -1829497595;
	}

	void method12326(int i) {
		super.method12326(984017845);
		((Class282_Sub20_Sub29) this).anIntArray9916 = null;
	}

	boolean method15398(int i) {
		if (null != ((Class282_Sub20_Sub29) this).anIntArray9916)
			return true;
		if (((Class282_Sub20_Sub29) this).anInt9912 * 588672973 >= 0) {
			Class91 class91 = (-890139849 * anInt9913 >= 0 ? Class91.method1522(Class532_Sub2.aClass317_7925, -890139849 * anInt9913, 588672973 * ((Class282_Sub20_Sub29) this).anInt9912) : Class91.method1515(Class532_Sub2.aClass317_7925, 588672973 * ((Class282_Sub20_Sub29) this).anInt9912));
			class91.method1523();
			((Class282_Sub20_Sub29) this).anIntArray9916 = class91.method1528();
			((Class282_Sub20_Sub29) this).anInt9914 = class91.anInt957 * -1233841395;
			((Class282_Sub20_Sub29) this).anInt9915 = class91.anInt954 * 576104881;
			return true;
		}
		return false;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_0_) {
		if (0 == i)
			((Class282_Sub20_Sub29) this).anInt9912 = class282_sub35.readUnsignedShort() * -1829497595;
	}

	public Class282_Sub20_Sub29() {
		super(0, false);
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		if (0 == i)
			((Class282_Sub20_Sub29) this).anInt9912 = class282_sub35.readUnsignedShort() * -1829497595;
	}

	int method12323(int i) {
		return 588672973 * ((Class282_Sub20_Sub29) this).anInt9912;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		if (0 == i)
			((Class282_Sub20_Sub29) this).anInt9912 = class282_sub35.readUnsignedShort() * -1829497595;
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 843157051);
		if (aClass308_7670.aBool3619 && method15398(1057936106)) {
			int[] is_1_ = is[0];
			int[] is_2_ = is[1];
			int[] is_3_ = is[2];
			int i_4_ = (((((Class282_Sub20_Sub29) this).anInt9915 * 513670993 != -929726253 * Class316.anInt3671) ? (((Class282_Sub20_Sub29) this).anInt9915 * 513670993 * i / (Class316.anInt3671 * -929726253)) : i) * (((Class282_Sub20_Sub29) this).anInt9914 * -1184894011));
			if (-402153223 * Class316.anInt3670 == ((Class282_Sub20_Sub29) this).anInt9914 * -1184894011) {
				for (int i_5_ = 0; i_5_ < -402153223 * Class316.anInt3670; i_5_++) {
					int i_6_ = ((Class282_Sub20_Sub29) this).anIntArray9916[i_4_++];
					is_3_[i_5_] = (i_6_ & 0xff) << 4;
					is_2_[i_5_] = (i_6_ & 0xff00) >> 4;
					is_1_[i_5_] = (i_6_ & 0xff0000) >> 12;
				}
			} else {
				for (int i_7_ = 0; i_7_ < Class316.anInt3670 * -402153223; i_7_++) {
					int i_8_ = (-1184894011 * ((Class282_Sub20_Sub29) this).anInt9914 * i_7_ / (Class316.anInt3670 * -402153223));
					int i_9_ = (((Class282_Sub20_Sub29) this).anIntArray9916[i_4_ + i_8_]);
					is_3_[i_7_] = (i_9_ & 0xff) << 4;
					is_2_[i_7_] = (i_9_ & 0xff00) >> 4;
					is_1_[i_7_] = (i_9_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	void method12316() {
		super.method12326(984017845);
		((Class282_Sub20_Sub29) this).anIntArray9916 = null;
	}

	int[][] method12320(int i, int i_10_) {
		int[][] is = aClass308_7670.method5463(i, 1580670333);
		if (aClass308_7670.aBool3619 && method15398(1057936106)) {
			int[] is_11_ = is[0];
			int[] is_12_ = is[1];
			int[] is_13_ = is[2];
			int i_14_ = (((((Class282_Sub20_Sub29) this).anInt9915 * 513670993 != -929726253 * Class316.anInt3671) ? (((Class282_Sub20_Sub29) this).anInt9915 * 513670993 * i / (Class316.anInt3671 * -929726253)) : i) * (((Class282_Sub20_Sub29) this).anInt9914 * -1184894011));
			if (-402153223 * Class316.anInt3670 == ((Class282_Sub20_Sub29) this).anInt9914 * -1184894011) {
				for (int i_15_ = 0; i_15_ < -402153223 * Class316.anInt3670; i_15_++) {
					int i_16_ = (((Class282_Sub20_Sub29) this).anIntArray9916[i_14_++]);
					is_13_[i_15_] = (i_16_ & 0xff) << 4;
					is_12_[i_15_] = (i_16_ & 0xff00) >> 4;
					is_11_[i_15_] = (i_16_ & 0xff0000) >> 12;
				}
			} else {
				for (int i_17_ = 0; i_17_ < Class316.anInt3670 * -402153223; i_17_++) {
					int i_18_ = (-1184894011 * ((Class282_Sub20_Sub29) this).anInt9914 * i_17_ / (Class316.anInt3670 * -402153223));
					int i_19_ = (((Class282_Sub20_Sub29) this).anIntArray9916[i_14_ + i_18_]);
					is_13_[i_17_] = (i_19_ & 0xff) << 4;
					is_12_[i_17_] = (i_19_ & 0xff00) >> 4;
					is_11_[i_17_] = (i_19_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}
}
