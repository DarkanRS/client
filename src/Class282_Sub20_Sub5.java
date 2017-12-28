/* Class282_Sub20_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub5 extends Class282_Sub20 {
	int anInt9740;
	int anInt9741 = 0;
	int anInt9742;
	int anInt9743;

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, 549460997);
		if (aClass320_7667.aBool3722) {
			for (int i_0_ = 0; i_0_ < Class316.anInt3670 * -402153223; i_0_++) {
				int i_1_ = (-498721987 * ((Class282_Sub20_Sub5) this).anInt9741 + ((Class316.anIntArray3672[i_0_] << 12) / (437013959 * ((Class282_Sub20_Sub5) this).anInt9742)));
				int i_2_ = (((Class282_Sub20_Sub5) this).anInt9740 * 265223087 + ((Class316.anIntArray3668[i] << 12) / (((Class282_Sub20_Sub5) this).anInt9742 * 437013959)));
				int i_3_ = i_1_;
				int i_4_ = i_2_;
				int i_5_ = i_1_;
				int i_6_ = i_2_;
				int i_7_ = i_1_ * i_1_ >> 12;
				int i_8_ = i_2_ * i_2_ >> 12;
				int i_9_;
				for (i_9_ = 0; (i_7_ + i_8_ < 16384 && i_9_ < (-1528129053 * ((Class282_Sub20_Sub5) this).anInt9743)); i_9_++) {
					i_6_ = i_4_ + (i_5_ * i_6_ >> 12) * 2;
					i_5_ = i_3_ + (i_7_ - i_8_);
					i_7_ = i_5_ * i_5_ >> 12;
					i_8_ = i_6_ * i_6_ >> 12;
				}
				is[i_0_] = (i_9_ < (-1528129053 * ((Class282_Sub20_Sub5) this).anInt9743) - 1 ? (i_9_ << 12) / (((Class282_Sub20_Sub5) this).anInt9743 * -1528129053) : 0);
			}
		}
		return is;
	}

	int[] method12319(int i, int i_10_) {
		int[] is = aClass320_7667.method5721(i, -804238884);
		if (aClass320_7667.aBool3722) {
			for (int i_11_ = 0; i_11_ < Class316.anInt3670 * -402153223; i_11_++) {
				int i_12_ = (-498721987 * ((Class282_Sub20_Sub5) this).anInt9741 + ((Class316.anIntArray3672[i_11_] << 12) / (437013959 * ((Class282_Sub20_Sub5) this).anInt9742)));
				int i_13_ = (((Class282_Sub20_Sub5) this).anInt9740 * 265223087 + ((Class316.anIntArray3668[i] << 12) / (((Class282_Sub20_Sub5) this).anInt9742 * 437013959)));
				int i_14_ = i_12_;
				int i_15_ = i_13_;
				int i_16_ = i_12_;
				int i_17_ = i_13_;
				int i_18_ = i_12_ * i_12_ >> 12;
				int i_19_ = i_13_ * i_13_ >> 12;
				int i_20_;
				for (i_20_ = 0; (i_18_ + i_19_ < 16384 && i_20_ < (-1528129053 * ((Class282_Sub20_Sub5) this).anInt9743)); i_20_++) {
					i_17_ = i_15_ + (i_16_ * i_17_ >> 12) * 2;
					i_16_ = i_14_ + (i_18_ - i_19_);
					i_18_ = i_16_ * i_16_ >> 12;
					i_19_ = i_17_ * i_17_ >> 12;
				}
				is[i_11_] = (i_20_ < (-1528129053 * ((Class282_Sub20_Sub5) this).anInt9743) - 1 ? ((i_20_ << 12) / (((Class282_Sub20_Sub5) this).anInt9743 * -1528129053)) : 0);
			}
		}
		return is;
	}

	public Class282_Sub20_Sub5() {
		super(0, true);
		((Class282_Sub20_Sub5) this).anInt9740 = 0;
		((Class282_Sub20_Sub5) this).anInt9742 = -1975778301;
		((Class282_Sub20_Sub5) this).anInt9743 = -573764644;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub5) this).anInt9742 = class282_sub35.readUnsignedShort() * 395011063;
			break;
		case 1:
			((Class282_Sub20_Sub5) this).anInt9743 = class282_sub35.readUnsignedShort() * -243436597;
			break;
		case 2:
			((Class282_Sub20_Sub5) this).anInt9741 = class282_sub35.readUnsignedShort() * -1668606955;
			break;
		case 3:
			((Class282_Sub20_Sub5) this).anInt9740 = class282_sub35.readUnsignedShort() * 865155919;
			break;
		}
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_21_) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub5) this).anInt9742 = class282_sub35.readUnsignedShort() * 395011063;
			break;
		case 1:
			((Class282_Sub20_Sub5) this).anInt9743 = class282_sub35.readUnsignedShort() * -243436597;
			break;
		case 2:
			((Class282_Sub20_Sub5) this).anInt9741 = class282_sub35.readUnsignedShort() * -1668606955;
			break;
		case 3:
			((Class282_Sub20_Sub5) this).anInt9740 = class282_sub35.readUnsignedShort() * 865155919;
			break;
		}
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -903987438);
		if (aClass320_7667.aBool3722) {
			for (int i_22_ = 0; i_22_ < Class316.anInt3670 * -402153223; i_22_++) {
				int i_23_ = (-498721987 * ((Class282_Sub20_Sub5) this).anInt9741 + ((Class316.anIntArray3672[i_22_] << 12) / (437013959 * ((Class282_Sub20_Sub5) this).anInt9742)));
				int i_24_ = (((Class282_Sub20_Sub5) this).anInt9740 * 265223087 + ((Class316.anIntArray3668[i] << 12) / (((Class282_Sub20_Sub5) this).anInt9742 * 437013959)));
				int i_25_ = i_23_;
				int i_26_ = i_24_;
				int i_27_ = i_23_;
				int i_28_ = i_24_;
				int i_29_ = i_23_ * i_23_ >> 12;
				int i_30_ = i_24_ * i_24_ >> 12;
				int i_31_;
				for (i_31_ = 0; (i_29_ + i_30_ < 16384 && i_31_ < (-1528129053 * ((Class282_Sub20_Sub5) this).anInt9743)); i_31_++) {
					i_28_ = i_26_ + (i_27_ * i_28_ >> 12) * 2;
					i_27_ = i_25_ + (i_29_ - i_30_);
					i_29_ = i_27_ * i_27_ >> 12;
					i_30_ = i_28_ * i_28_ >> 12;
				}
				is[i_22_] = (i_31_ < (-1528129053 * ((Class282_Sub20_Sub5) this).anInt9743) - 1 ? ((i_31_ << 12) / (((Class282_Sub20_Sub5) this).anInt9743 * -1528129053)) : 0);
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub5) this).anInt9742 = class282_sub35.readUnsignedShort() * 395011063;
			break;
		case 1:
			((Class282_Sub20_Sub5) this).anInt9743 = class282_sub35.readUnsignedShort() * -243436597;
			break;
		case 2:
			((Class282_Sub20_Sub5) this).anInt9741 = class282_sub35.readUnsignedShort() * -1668606955;
			break;
		case 3:
			((Class282_Sub20_Sub5) this).anInt9740 = class282_sub35.readUnsignedShort() * 865155919;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub5) this).anInt9742 = class282_sub35.readUnsignedShort() * 395011063;
			break;
		case 1:
			((Class282_Sub20_Sub5) this).anInt9743 = class282_sub35.readUnsignedShort() * -243436597;
			break;
		case 2:
			((Class282_Sub20_Sub5) this).anInt9741 = class282_sub35.readUnsignedShort() * -1668606955;
			break;
		case 3:
			((Class282_Sub20_Sub5) this).anInt9740 = class282_sub35.readUnsignedShort() * 865155919;
			break;
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, 438060756);
		if (aClass320_7667.aBool3722) {
			for (int i_32_ = 0; i_32_ < Class316.anInt3670 * -402153223; i_32_++) {
				int i_33_ = (-498721987 * ((Class282_Sub20_Sub5) this).anInt9741 + ((Class316.anIntArray3672[i_32_] << 12) / (437013959 * ((Class282_Sub20_Sub5) this).anInt9742)));
				int i_34_ = (((Class282_Sub20_Sub5) this).anInt9740 * 265223087 + ((Class316.anIntArray3668[i] << 12) / (((Class282_Sub20_Sub5) this).anInt9742 * 437013959)));
				int i_35_ = i_33_;
				int i_36_ = i_34_;
				int i_37_ = i_33_;
				int i_38_ = i_34_;
				int i_39_ = i_33_ * i_33_ >> 12;
				int i_40_ = i_34_ * i_34_ >> 12;
				int i_41_;
				for (i_41_ = 0; (i_39_ + i_40_ < 16384 && i_41_ < (-1528129053 * ((Class282_Sub20_Sub5) this).anInt9743)); i_41_++) {
					i_38_ = i_36_ + (i_37_ * i_38_ >> 12) * 2;
					i_37_ = i_35_ + (i_39_ - i_40_);
					i_39_ = i_37_ * i_37_ >> 12;
					i_40_ = i_38_ * i_38_ >> 12;
				}
				is[i_32_] = (i_41_ < (-1528129053 * ((Class282_Sub20_Sub5) this).anInt9743) - 1 ? ((i_41_ << 12) / (((Class282_Sub20_Sub5) this).anInt9743 * -1528129053)) : 0);
			}
		}
		return is;
	}
}
