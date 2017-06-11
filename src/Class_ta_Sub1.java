/* Class_ta_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ta_Sub1 extends Class_ta {
	Class30_Sub2_Sub1 aClass30_Sub2_Sub1_8441;

	static Class_ta_Sub1 method5999(Class_ra_Sub2 class_ra_sub2, int i, int i_0_, int[] is, int[] is_1_) {
		byte[] is_2_ = new byte[i * i_0_];
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			int i_4_ = i_3_ * i + is[i_3_];
			for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
				is_2_[i_4_++] = (byte) -1;
		}
		return new Class_ta_Sub1(class_ra_sub2, i, i_0_, is_2_);
	}

	Class_ta_Sub1(Class_ra_Sub2 class_ra_sub2, int i, int i_6_, byte[] is) {
		((Class_ta_Sub1) this).aClass30_Sub2_Sub1_8441 = Class30_Sub2_Sub1.method428(class_ra_sub2, Class55.aClass55_567, Class77.aClass77_717, i, i_6_, false, is, Class55.aClass55_567);
		((Class_ta_Sub1) this).aClass30_Sub2_Sub1_8441.method420(false, false);
	}
}
