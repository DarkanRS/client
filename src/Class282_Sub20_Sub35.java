/* Class282_Sub20_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub35 extends Class282_Sub20 {
	int anInt9968;
	static final int anInt9969 = 4096;
	int anInt9970;
	int anInt9971 = -792719360;

	int[][] method12320(int i, int i_0_) {
		int[][] is = aClass308_7670.method5463(i, 1471629074);
		if (aClass308_7670.aBool3619) {
			int[][] is_1_ = method12333(0, i, (byte) 3);
			int[] is_2_ = is_1_[0];
			int[] is_3_ = is_1_[1];
			int[] is_4_ = is_1_[2];
			int[] is_5_ = is[0];
			int[] is_6_ = is[1];
			int[] is_7_ = is[2];
			for (int i_8_ = 0; i_8_ < Class316.anInt3670 * -402153223; i_8_++) {
				int i_9_ = is_2_[i_8_];
				int i_10_ = is_4_[i_8_];
				int i_11_ = is_3_[i_8_];
				if (i_9_ == i_10_ && i_11_ == i_10_) {
					is_5_[i_8_] = (647164929 * ((Class282_Sub20_Sub35) this).anInt9971 * i_9_) >> 12;
					is_6_[i_8_] = i_10_ * (((Class282_Sub20_Sub35) this).anInt9970 * -1273078279) >> 12;
					is_7_[i_8_] = (i_11_ * (61159855 * ((Class282_Sub20_Sub35) this).anInt9968) >> 12);
				} else {
					is_5_[i_8_] = ((Class282_Sub20_Sub35) this).anInt9971 * 647164929;
					is_6_[i_8_] = (-1273078279 * ((Class282_Sub20_Sub35) this).anInt9970);
					is_7_[i_8_] = 61159855 * ((Class282_Sub20_Sub35) this).anInt9968;
				}
			}
		}
		return is;
	}

	public Class282_Sub20_Sub35() {
		super(1, false);
		((Class282_Sub20_Sub35) this).anInt9970 = -582709248;
		((Class282_Sub20_Sub35) this).anInt9968 = 1003810816;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_12_) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub35) this).anInt9971 = class282_sub35.readUnsignedShort() * -771945471;
			break;
		case 1:
			((Class282_Sub20_Sub35) this).anInt9970 = class282_sub35.readUnsignedShort() * -286403511;
			break;
		case 2:
			((Class282_Sub20_Sub35) this).anInt9968 = class282_sub35.readUnsignedShort() * -157041329;
			break;
		}
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub35) this).anInt9971 = class282_sub35.readUnsignedShort() * -771945471;
			break;
		case 1:
			((Class282_Sub20_Sub35) this).anInt9970 = class282_sub35.readUnsignedShort() * -286403511;
			break;
		case 2:
			((Class282_Sub20_Sub35) this).anInt9968 = class282_sub35.readUnsignedShort() * -157041329;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub35) this).anInt9971 = class282_sub35.readUnsignedShort() * -771945471;
			break;
		case 1:
			((Class282_Sub20_Sub35) this).anInt9970 = class282_sub35.readUnsignedShort() * -286403511;
			break;
		case 2:
			((Class282_Sub20_Sub35) this).anInt9968 = class282_sub35.readUnsignedShort() * -157041329;
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub35) this).anInt9971 = class282_sub35.readUnsignedShort() * -771945471;
			break;
		case 1:
			((Class282_Sub20_Sub35) this).anInt9970 = class282_sub35.readUnsignedShort() * -286403511;
			break;
		case 2:
			((Class282_Sub20_Sub35) this).anInt9968 = class282_sub35.readUnsignedShort() * -157041329;
			break;
		}
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1024086108);
		if (aClass308_7670.aBool3619) {
			int[][] is_13_ = method12333(0, i, (byte) 3);
			int[] is_14_ = is_13_[0];
			int[] is_15_ = is_13_[1];
			int[] is_16_ = is_13_[2];
			int[] is_17_ = is[0];
			int[] is_18_ = is[1];
			int[] is_19_ = is[2];
			for (int i_20_ = 0; i_20_ < Class316.anInt3670 * -402153223; i_20_++) {
				int i_21_ = is_14_[i_20_];
				int i_22_ = is_16_[i_20_];
				int i_23_ = is_15_[i_20_];
				if (i_21_ == i_22_ && i_23_ == i_22_) {
					is_17_[i_20_] = (647164929 * ((Class282_Sub20_Sub35) this).anInt9971 * i_21_) >> 12;
					is_18_[i_20_] = i_22_ * (((Class282_Sub20_Sub35) this).anInt9970 * -1273078279) >> 12;
					is_19_[i_20_] = (i_23_ * (61159855 * ((Class282_Sub20_Sub35) this).anInt9968) >> 12);
				} else {
					is_17_[i_20_] = ((Class282_Sub20_Sub35) this).anInt9971 * 647164929;
					is_18_[i_20_] = (-1273078279 * ((Class282_Sub20_Sub35) this).anInt9970);
					is_19_[i_20_] = 61159855 * ((Class282_Sub20_Sub35) this).anInt9968;
				}
			}
		}
		return is;
	}
}
