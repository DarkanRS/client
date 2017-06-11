/* Class425 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class425 {
	public static void method5736(byte[] is, int i, byte[] is_0_, int i_1_, int i_2_) {
		if (is == is_0_) {
			if (i == i_1_)
				return;
			if (i_1_ > i && i_1_ < i + i_2_) {
				i_2_--;
				i += i_2_;
				i_1_ += i_2_;
				i_2_ = i - i_2_;
				i_2_ += 7;
				while (i >= i_2_) {
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
				}
				i_2_ -= 7;
				while (i >= i_2_)
					is_0_[i_1_--] = is[i--];
				return;
			}
		}
		i_2_ += i;
		i_2_ -= 7;
		while (i < i_2_) {
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
		}
		i_2_ += 7;
		while (i < i_2_)
			is_0_[i_1_++] = is[i++];
	}

	public static void method5737(Object[] objects, int i, Object[] objects_3_, int i_4_, int i_5_) {
		if (objects == objects_3_) {
			if (i == i_4_)
				return;
			if (i_4_ > i && i_4_ < i + i_5_) {
				i_5_--;
				i += i_5_;
				i_4_ += i_5_;
				i_5_ = i - i_5_;
				i_5_ += 7;
				while (i >= i_5_) {
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
				}
				i_5_ -= 7;
				while (i >= i_5_)
					objects_3_[i_4_--] = objects[i--];
				return;
			}
		}
		i_5_ += i;
		i_5_ -= 7;
		while (i < i_5_) {
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
		}
		i_5_ += 7;
		while (i < i_5_)
			objects_3_[i_4_++] = objects[i++];
	}

	public static void method5738(long[] ls, int i, long[] ls_6_, int i_7_, int i_8_) {
		if (ls == ls_6_) {
			if (i == i_7_)
				return;
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 3;
				while (i >= i_8_) {
					ls_6_[i_7_--] = ls[i--];
					ls_6_[i_7_--] = ls[i--];
					ls_6_[i_7_--] = ls[i--];
					ls_6_[i_7_--] = ls[i--];
				}
				i_8_ -= 3;
				while (i >= i_8_)
					ls_6_[i_7_--] = ls[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 3;
		while (i < i_8_) {
			ls_6_[i_7_++] = ls[i++];
			ls_6_[i_7_++] = ls[i++];
			ls_6_[i_7_++] = ls[i++];
			ls_6_[i_7_++] = ls[i++];
		}
		i_8_ += 3;
		while (i < i_8_)
			ls_6_[i_7_++] = ls[i++];
	}

	public static void method5739(float[] fs, int i, float[] fs_9_, int i_10_, int i_11_) {
		if (fs == fs_9_) {
			if (i == i_10_)
				return;
			if (i_10_ > i && i_10_ < i + i_11_) {
				i_11_--;
				i += i_11_;
				i_10_ += i_11_;
				i_11_ = i - i_11_;
				i_11_ += 7;
				while (i >= i_11_) {
					fs_9_[i_10_--] = fs[i--];
					fs_9_[i_10_--] = fs[i--];
					fs_9_[i_10_--] = fs[i--];
					fs_9_[i_10_--] = fs[i--];
					fs_9_[i_10_--] = fs[i--];
					fs_9_[i_10_--] = fs[i--];
					fs_9_[i_10_--] = fs[i--];
					fs_9_[i_10_--] = fs[i--];
				}
				i_11_ -= 7;
				while (i >= i_11_)
					fs_9_[i_10_--] = fs[i--];
				return;
			}
		}
		i_11_ += i;
		i_11_ -= 7;
		while (i < i_11_) {
			fs_9_[i_10_++] = fs[i++];
			fs_9_[i_10_++] = fs[i++];
			fs_9_[i_10_++] = fs[i++];
			fs_9_[i_10_++] = fs[i++];
			fs_9_[i_10_++] = fs[i++];
			fs_9_[i_10_++] = fs[i++];
			fs_9_[i_10_++] = fs[i++];
			fs_9_[i_10_++] = fs[i++];
		}
		i_11_ += 7;
		while (i < i_11_)
			fs_9_[i_10_++] = fs[i++];
	}

	public static void method5740(int[] is, int i, int i_12_, int i_13_) {
		i_12_ = i + i_12_ - 7;
		while (i < i_12_) {
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
		}
		i_12_ += 7;
		while (i < i_12_)
			is[i++] = i_13_;
	}

	Class425() throws Throwable {
		throw new Error();
	}

	public static void method5741(int[] is, int i, int[] is_14_, int i_15_, int i_16_) {
		if (is == is_14_) {
			if (i == i_15_)
				return;
			if (i_15_ > i && i_15_ < i + i_16_) {
				i_16_--;
				i += i_16_;
				i_15_ += i_16_;
				i_16_ = i - i_16_;
				i_16_ += 7;
				while (i >= i_16_) {
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
				}
				i_16_ -= 7;
				while (i >= i_16_)
					is_14_[i_15_--] = is[i--];
				return;
			}
		}
		i_16_ += i;
		i_16_ -= 7;
		while (i < i_16_) {
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
		}
		i_16_ += 7;
		while (i < i_16_)
			is_14_[i_15_++] = is[i++];
	}

	public static void method5742(int[] is, int i, int i_17_) {
		i_17_ = i + i_17_ - 7;
		while (i < i_17_) {
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
		}
		i_17_ += 7;
		while (i < i_17_)
			is[i++] = 0;
	}
}
