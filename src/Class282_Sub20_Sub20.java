/* Class282_Sub20_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub20 extends Class282_Sub20 {
	int anInt9864 = 0;
	static final int anInt9865 = 4096;
	static final boolean aBool9866 = false;
	static final int anInt9867 = 0;
	int anInt9868 = -241266688;

	int[][] method12320(int i, int i_0_) {
		int[][] is = aClass308_7670.method5463(i, 1039004960);
		if (aClass308_7670.aBool3619) {
			int[][] is_1_ = method12333(0, i, (byte) 3);
			int[] is_2_ = is_1_[0];
			int[] is_3_ = is_1_[1];
			int[] is_4_ = is_1_[2];
			int[] is_5_ = is[0];
			int[] is_6_ = is[1];
			int[] is_7_ = is[2];
			for (int i_8_ = 0; i_8_ < -402153223 * Class316.anInt3670; i_8_++) {
				int i_9_ = is_2_[i_8_];
				int i_10_ = is_3_[i_8_];
				int i_11_ = is_4_[i_8_];
				if (i_9_ < 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864)
					is_5_[i_8_] = 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864;
				else if (i_9_ > (((Class282_Sub20_Sub20) this).anInt9868 * -1481421223))
					is_5_[i_8_] = (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868);
				else
					is_5_[i_8_] = i_9_;
				if (i_10_ < 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864)
					is_6_[i_8_] = ((Class282_Sub20_Sub20) this).anInt9864 * 1677213025;
				else if (i_10_ > (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868))
					is_6_[i_8_] = (((Class282_Sub20_Sub20) this).anInt9868 * -1481421223);
				else
					is_6_[i_8_] = i_10_;
				if (i_11_ < ((Class282_Sub20_Sub20) this).anInt9864 * 1677213025)
					is_7_[i_8_] = ((Class282_Sub20_Sub20) this).anInt9864 * 1677213025;
				else if (i_11_ > (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868))
					is_7_[i_8_] = (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868);
				else
					is_7_[i_8_] = i_11_;
			}
		}
		return is;
	}

	int[] method12319(int i, int i_12_) {
		int[] is = aClass320_7667.method5721(i, -335262287);
		if (aClass320_7667.aBool3722) {
			int[] is_13_ = method12317(0, i, 1946051522);
			for (int i_14_ = 0; i_14_ < Class316.anInt3670 * -402153223; i_14_++) {
				int i_15_ = is_13_[i_14_];
				if (i_15_ < 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864)
					is[i_14_] = 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864;
				else if (i_15_ > (((Class282_Sub20_Sub20) this).anInt9868 * -1481421223))
					is[i_14_] = (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868);
				else
					is[i_14_] = i_15_;
			}
		}
		return is;
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1934406913);
		if (aClass320_7667.aBool3722) {
			int[] is_16_ = method12317(0, i, 2128554309);
			for (int i_17_ = 0; i_17_ < Class316.anInt3670 * -402153223; i_17_++) {
				int i_18_ = is_16_[i_17_];
				if (i_18_ < 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864)
					is[i_17_] = 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864;
				else if (i_18_ > (((Class282_Sub20_Sub20) this).anInt9868 * -1481421223))
					is[i_17_] = (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868);
				else
					is[i_17_] = i_18_;
			}
		}
		return is;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_19_) {
		switch (i) {
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub20) this).anInt9868 = class282_sub35.readUnsignedShort() * 1165957609;
			break;
		case 0:
			((Class282_Sub20_Sub20) this).anInt9864 = class282_sub35.readUnsignedShort() * 1625630369;
			break;
		}
	}

	public Class282_Sub20_Sub20() {
		super(1, false);
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, 78258949);
		if (aClass320_7667.aBool3722) {
			int[] is_20_ = method12317(0, i, 1936510253);
			for (int i_21_ = 0; i_21_ < Class316.anInt3670 * -402153223; i_21_++) {
				int i_22_ = is_20_[i_21_];
				if (i_22_ < 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864)
					is[i_21_] = 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864;
				else if (i_22_ > (((Class282_Sub20_Sub20) this).anInt9868 * -1481421223))
					is[i_21_] = (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868);
				else
					is[i_21_] = i_22_;
			}
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -391861092);
		if (aClass320_7667.aBool3722) {
			int[] is_23_ = method12317(0, i, 2057915202);
			for (int i_24_ = 0; i_24_ < Class316.anInt3670 * -402153223; i_24_++) {
				int i_25_ = is_23_[i_24_];
				if (i_25_ < 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864)
					is[i_24_] = 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864;
				else if (i_25_ > (((Class282_Sub20_Sub20) this).anInt9868 * -1481421223))
					is[i_24_] = (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868);
				else
					is[i_24_] = i_25_;
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub20) this).anInt9868 = class282_sub35.readUnsignedShort() * 1165957609;
			break;
		case 0:
			((Class282_Sub20_Sub20) this).anInt9864 = class282_sub35.readUnsignedShort() * 1625630369;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub20) this).anInt9868 = class282_sub35.readUnsignedShort() * 1165957609;
			break;
		case 0:
			((Class282_Sub20_Sub20) this).anInt9864 = class282_sub35.readUnsignedShort() * 1625630369;
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub20) this).anInt9868 = class282_sub35.readUnsignedShort() * 1165957609;
			break;
		case 0:
			((Class282_Sub20_Sub20) this).anInt9864 = class282_sub35.readUnsignedShort() * 1625630369;
			break;
		}
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1101164573);
		if (aClass308_7670.aBool3619) {
			int[][] is_26_ = method12333(0, i, (byte) 3);
			int[] is_27_ = is_26_[0];
			int[] is_28_ = is_26_[1];
			int[] is_29_ = is_26_[2];
			int[] is_30_ = is[0];
			int[] is_31_ = is[1];
			int[] is_32_ = is[2];
			for (int i_33_ = 0; i_33_ < -402153223 * Class316.anInt3670; i_33_++) {
				int i_34_ = is_27_[i_33_];
				int i_35_ = is_28_[i_33_];
				int i_36_ = is_29_[i_33_];
				if (i_34_ < 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864)
					is_30_[i_33_] = 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864;
				else if (i_34_ > (((Class282_Sub20_Sub20) this).anInt9868 * -1481421223))
					is_30_[i_33_] = (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868);
				else
					is_30_[i_33_] = i_34_;
				if (i_35_ < 1677213025 * ((Class282_Sub20_Sub20) this).anInt9864)
					is_31_[i_33_] = ((Class282_Sub20_Sub20) this).anInt9864 * 1677213025;
				else if (i_35_ > (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868))
					is_31_[i_33_] = (((Class282_Sub20_Sub20) this).anInt9868 * -1481421223);
				else
					is_31_[i_33_] = i_35_;
				if (i_36_ < ((Class282_Sub20_Sub20) this).anInt9864 * 1677213025)
					is_32_[i_33_] = ((Class282_Sub20_Sub20) this).anInt9864 * 1677213025;
				else if (i_36_ > (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868))
					is_32_[i_33_] = (-1481421223 * ((Class282_Sub20_Sub20) this).anInt9868);
				else
					is_32_[i_33_] = i_36_;
			}
		}
		return is;
	}
}
