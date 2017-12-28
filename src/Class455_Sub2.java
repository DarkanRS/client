/* Class455_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class455_Sub2 extends Class455 {
	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_8974;

	static Class455_Sub2 method14343(Class505_Sub1 class505_sub1, int i, int i_0_, int[] is, int[] is_1_) {
		byte[] is_2_ = new byte[i * i_0_];
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			int i_4_ = i_3_ * i + is[i_3_];
			for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
				is_2_[i_4_++] = (byte) -1;
		}
		return new Class455_Sub2(class505_sub1, i, i_0_, is_2_);
	}

	Class455_Sub2(Class505_Sub1 class505_sub1, int i, int i_6_, byte[] is) {
		((Class455_Sub2) this).aClass137_Sub1_Sub1_8974 = Class137_Sub1_Sub1.method15540(class505_sub1, Class150.aClass150_1951, Class76.aClass76_751, i, i_6_, false, is, Class150.aClass150_1951);
		((Class455_Sub2) this).aClass137_Sub1_Sub1_8974.method14445(false, false);
	}
}
