/* Class152_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class152_Sub2_Sub1 extends Class152_Sub2 {
	Interface31 anInterface31_10161;
	int anInt10162;
	int anInt10163;
	int anInt10164;
	int anInt10165;
	int anInt10166;
	int anInt10167;
	Class505_Sub2 aClass505_Sub2_10168;
	static int[] anIntArray10169 = new int[6];
	static int[][] anIntArrayArray10170 = new int[6][];

	Interface31 method14242() {
		if (((Class152_Sub2_Sub1) this).anInterface31_10161 == null) {
			Interface22 interface22 = (((Class152_Sub2_Sub1) this).aClass505_Sub2_10168.anInterface22_5834);
			anIntArray10169[0] = ((Class152_Sub2_Sub1) this).anInt10163;
			anIntArray10169[1] = ((Class152_Sub2_Sub1) this).anInt10164;
			anIntArray10169[2] = ((Class152_Sub2_Sub1) this).anInt10165;
			anIntArray10169[3] = ((Class152_Sub2_Sub1) this).anInt10166;
			anIntArray10169[4] = ((Class152_Sub2_Sub1) this).anInt10162;
			anIntArray10169[5] = ((Class152_Sub2_Sub1) this).anInt10167;
			boolean bool = false;
			int i = 0;
			for (int i_0_ = 0; i_0_ < 6; i_0_++) {
				if (!interface22.method139(anIntArray10169[i_0_], -1109756376))
					return null;
				Class169 class169 = interface22.method144(anIntArray10169[i_0_], -2057048740);
				int i_1_ = class169.aBool2065 ? 64 : 128;
				if (i_1_ > i)
					i = i_1_;
				if (class169.aByte2088 > 0)
					bool = true;
			}
			for (int i_2_ = 0; i_2_ < 6; i_2_++)
				anIntArrayArray10170[i_2_] = interface22.method140(anIntArray10169[i_2_], 1.0F, i, i, false, (byte) 104);
			((Class152_Sub2_Sub1) this).anInterface31_10161 = ((Class152_Sub2_Sub1) this).aClass505_Sub2_10168.method14034(i, bool, anIntArrayArray10170);
		}
		return ((Class152_Sub2_Sub1) this).anInterface31_10161;
	}

	Interface31 method14241() {
		if (((Class152_Sub2_Sub1) this).anInterface31_10161 == null) {
			Interface22 interface22 = (((Class152_Sub2_Sub1) this).aClass505_Sub2_10168.anInterface22_5834);
			anIntArray10169[0] = ((Class152_Sub2_Sub1) this).anInt10163;
			anIntArray10169[1] = ((Class152_Sub2_Sub1) this).anInt10164;
			anIntArray10169[2] = ((Class152_Sub2_Sub1) this).anInt10165;
			anIntArray10169[3] = ((Class152_Sub2_Sub1) this).anInt10166;
			anIntArray10169[4] = ((Class152_Sub2_Sub1) this).anInt10162;
			anIntArray10169[5] = ((Class152_Sub2_Sub1) this).anInt10167;
			boolean bool = false;
			int i = 0;
			for (int i_3_ = 0; i_3_ < 6; i_3_++) {
				if (!interface22.method139(anIntArray10169[i_3_], -461631490))
					return null;
				Class169 class169 = interface22.method144(anIntArray10169[i_3_], -2054347841);
				int i_4_ = class169.aBool2065 ? 64 : 128;
				if (i_4_ > i)
					i = i_4_;
				if (class169.aByte2088 > 0)
					bool = true;
			}
			for (int i_5_ = 0; i_5_ < 6; i_5_++)
				anIntArrayArray10170[i_5_] = interface22.method140(anIntArray10169[i_5_], 1.0F, i, i, false, (byte) 114);
			((Class152_Sub2_Sub1) this).anInterface31_10161 = ((Class152_Sub2_Sub1) this).aClass505_Sub2_10168.method14034(i, bool, anIntArrayArray10170);
		}
		return ((Class152_Sub2_Sub1) this).anInterface31_10161;
	}

	Class152_Sub2_Sub1(Class505_Sub2 class505_sub2, int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		((Class152_Sub2_Sub1) this).aClass505_Sub2_10168 = class505_sub2;
		((Class152_Sub2_Sub1) this).anInt10165 = i_7_;
		((Class152_Sub2_Sub1) this).anInt10166 = i_8_;
		((Class152_Sub2_Sub1) this).anInt10162 = i_9_;
		((Class152_Sub2_Sub1) this).anInt10167 = i_10_;
		((Class152_Sub2_Sub1) this).anInt10163 = i;
		((Class152_Sub2_Sub1) this).anInt10164 = i_6_;
	}
}
