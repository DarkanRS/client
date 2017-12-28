/* Class455_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class455_Sub1 extends Class455 {
	Interface6 anInterface6_8508;

	Class455_Sub1(Class505_Sub2 class505_sub2, int i, int i_0_, byte[] is) {
		((Class455_Sub1) this).anInterface6_8508 = class505_sub2.method13957(Class150.aClass150_1951, i, i_0_, false, is);
		((Class455_Sub1) this).anInterface6_8508.method50(false, false);
	}

	Class455_Sub1(Class505_Sub2 class505_sub2, int i, int i_1_, int[] is) {
		((Class455_Sub1) this).anInterface6_8508 = class505_sub2.method14024(i, i_1_, false, is);
		((Class455_Sub1) this).anInterface6_8508.method50(false, false);
	}

	static Class455_Sub1 method13769(Class505_Sub2 class505_sub2, int i, int i_2_, int[] is, int[] is_3_) {
		if (class505_sub2.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
			byte[] is_4_ = new byte[i * i_2_];
			for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
				int i_6_ = i_5_ * i + is[i_5_];
				for (int i_7_ = 0; i_7_ < is_3_[i_5_]; i_7_++)
					is_4_[i_6_++] = (byte) -1;
			}
			return new Class455_Sub1(class505_sub2, i, i_2_, is_4_);
		}
		int[] is_8_ = new int[i * i_2_];
		for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
			int i_10_ = i_9_ * i + is[i_9_];
			for (int i_11_ = 0; i_11_ < is_3_[i_9_]; i_11_++)
				is_8_[i_10_++] = -16777216;
		}
		return new Class455_Sub1(class505_sub2, i, i_2_, is_8_);
	}

	static Class455_Sub1 method13770(Class505_Sub2 class505_sub2, int i, int i_12_, int[] is, int[] is_13_) {
		if (class505_sub2.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
			byte[] is_14_ = new byte[i * i_12_];
			for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
				int i_16_ = i_15_ * i + is[i_15_];
				for (int i_17_ = 0; i_17_ < is_13_[i_15_]; i_17_++)
					is_14_[i_16_++] = (byte) -1;
			}
			return new Class455_Sub1(class505_sub2, i, i_12_, is_14_);
		}
		int[] is_18_ = new int[i * i_12_];
		for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
			int i_20_ = i_19_ * i + is[i_19_];
			for (int i_21_ = 0; i_21_ < is_13_[i_19_]; i_21_++)
				is_18_[i_20_++] = -16777216;
		}
		return new Class455_Sub1(class505_sub2, i, i_12_, is_18_);
	}
}
