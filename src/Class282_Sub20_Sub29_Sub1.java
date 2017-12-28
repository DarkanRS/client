/* Class282_Sub20_Sub29_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub29_Sub1 extends Class282_Sub20_Sub29 {
	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1507088149);
		if (aClass308_7670.aBool3619 && method15398(1057936106)) {
			int[] is_0_ = is[0];
			int[] is_1_ = is[1];
			int[] is_2_ = is[2];
			int i_3_ = (i % (((Class282_Sub20_Sub29_Sub1) this).anInt9915 * 513670993) * (((Class282_Sub20_Sub29_Sub1) this).anInt9915 * 513670993));
			for (int i_4_ = 0; i_4_ < Class316.anInt3670 * -402153223; i_4_++) {
				int i_5_ = (((Class282_Sub20_Sub29_Sub1) this).anIntArray9916[i_3_ + i_4_ % (-1184894011 * (((Class282_Sub20_Sub29_Sub1) this).anInt9914))]);
				is_2_[i_4_] = (i_5_ & 0xff) << 4;
				is_1_[i_4_] = (i_5_ & 0xff00) >> 4;
				is_0_[i_4_] = (i_5_ & 0xff0000) >> 12;
			}
		}
		return is;
	}

	int[][] method12320(int i, int i_6_) {
		int[][] is = aClass308_7670.method5463(i, 2115111278);
		if (aClass308_7670.aBool3619 && method15398(1057936106)) {
			int[] is_7_ = is[0];
			int[] is_8_ = is[1];
			int[] is_9_ = is[2];
			int i_10_ = (i % (((Class282_Sub20_Sub29_Sub1) this).anInt9915 * 513670993) * (((Class282_Sub20_Sub29_Sub1) this).anInt9915 * 513670993));
			for (int i_11_ = 0; i_11_ < Class316.anInt3670 * -402153223; i_11_++) {
				int i_12_ = (((Class282_Sub20_Sub29_Sub1) this).anIntArray9916[i_10_ + i_11_ % (-1184894011 * (((Class282_Sub20_Sub29_Sub1) this).anInt9914))]);
				is_9_[i_11_] = (i_12_ & 0xff) << 4;
				is_8_[i_11_] = (i_12_ & 0xff00) >> 4;
				is_7_[i_11_] = (i_12_ & 0xff0000) >> 12;
			}
		}
		return is;
	}
}
