/* Class_ta_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ta_Sub3 extends Class_ta {
	Interface9_Impl2 anInterface9_Impl2_8444;

	Class_ta_Sub3(Class_ra_Sub3 class_ra_sub3, int i, int i_0_, int[] is) {
		((Class_ta_Sub3) this).anInterface9_Impl2_8444 = class_ra_sub3.method5350(i, i_0_, false, is);
		((Class_ta_Sub3) this).anInterface9_Impl2_8444.method80(false, false);
	}

	static Class_ta_Sub3 method6007(Class_ra_Sub3 class_ra_sub3, int i, int i_1_, int[] is, int[] is_2_) {
		if (class_ra_sub3.method5348(Class55.aClass55_567, Class77.aClass77_717)) {
			byte[] is_3_ = new byte[i * i_1_];
			for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
				int i_5_ = i_4_ * i + is[i_4_];
				for (int i_6_ = 0; i_6_ < is_2_[i_4_]; i_6_++)
					is_3_[i_5_++] = (byte) -1;
			}
			return new Class_ta_Sub3(class_ra_sub3, i, i_1_, is_3_);
		}
		int[] is_7_ = new int[i * i_1_];
		for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
			int i_9_ = i_8_ * i + is[i_8_];
			for (int i_10_ = 0; i_10_ < is_2_[i_8_]; i_10_++)
				is_7_[i_9_++] = -16777216;
		}
		return new Class_ta_Sub3(class_ra_sub3, i, i_1_, is_7_);
	}

	Class_ta_Sub3(Class_ra_Sub3 class_ra_sub3, int i, int i_11_, byte[] is) {
		((Class_ta_Sub3) this).anInterface9_Impl2_8444 = class_ra_sub3.method5351(Class55.aClass55_567, i, i_11_, false, is);
		((Class_ta_Sub3) this).anInterface9_Impl2_8444.method80(false, false);
	}
}
