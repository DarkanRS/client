/* Class503 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class503 {
	public static void method8351(long[] ls, int i, long[] ls_0_, int i_1_, int i_2_) {
		if (ls == ls_0_) {
			if (i == i_1_)
				return;
			if (i_1_ > i && i_1_ < i + i_2_) {
				i_2_--;
				i += i_2_;
				i_1_ += i_2_;
				i_2_ = i - i_2_;
				i_2_ += 3;
				while (i >= i_2_) {
					ls_0_[i_1_--] = ls[i--];
					ls_0_[i_1_--] = ls[i--];
					ls_0_[i_1_--] = ls[i--];
					ls_0_[i_1_--] = ls[i--];
				}
				i_2_ -= 3;
				while (i >= i_2_)
					ls_0_[i_1_--] = ls[i--];
				return;
			}
		}
		i_2_ += i;
		i_2_ -= 3;
		while (i < i_2_) {
			ls_0_[i_1_++] = ls[i++];
			ls_0_[i_1_++] = ls[i++];
			ls_0_[i_1_++] = ls[i++];
			ls_0_[i_1_++] = ls[i++];
		}
		i_2_ += 3;
		while (i < i_2_)
			ls_0_[i_1_++] = ls[i++];
	}

	public static void method8352(byte[] is, int i, byte[] is_3_, int i_4_, int i_5_) {
		if (is == is_3_) {
			if (i == i_4_)
				return;
			if (i_4_ > i && i_4_ < i + i_5_) {
				i_5_--;
				i += i_5_;
				i_4_ += i_5_;
				i_5_ = i - i_5_;
				i_5_ += 7;
				while (i >= i_5_) {
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
				}
				i_5_ -= 7;
				while (i >= i_5_)
					is_3_[i_4_--] = is[i--];
				return;
			}
		}
		i_5_ += i;
		i_5_ -= 7;
		while (i < i_5_) {
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
		}
		i_5_ += 7;
		while (i < i_5_)
			is_3_[i_4_++] = is[i++];
	}

	static void method8353(boolean[] bools, int i, boolean[] bools_6_, int i_7_, int i_8_) {
		if (bools == bools_6_) {
			if (i == i_7_)
				return;
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 7;
				while (i >= i_8_) {
					bools_6_[i_7_--] = bools[i--];
					bools_6_[i_7_--] = bools[i--];
					bools_6_[i_7_--] = bools[i--];
					bools_6_[i_7_--] = bools[i--];
					bools_6_[i_7_--] = bools[i--];
					bools_6_[i_7_--] = bools[i--];
					bools_6_[i_7_--] = bools[i--];
					bools_6_[i_7_--] = bools[i--];
				}
				i_8_ -= 7;
				while (i >= i_8_)
					bools_6_[i_7_--] = bools[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 7;
		while (i < i_8_) {
			bools_6_[i_7_++] = bools[i++];
			bools_6_[i_7_++] = bools[i++];
			bools_6_[i_7_++] = bools[i++];
			bools_6_[i_7_++] = bools[i++];
			bools_6_[i_7_++] = bools[i++];
			bools_6_[i_7_++] = bools[i++];
			bools_6_[i_7_++] = bools[i++];
			bools_6_[i_7_++] = bools[i++];
		}
		i_8_ += 7;
		while (i < i_8_)
			bools_6_[i_7_++] = bools[i++];
	}

	static void method8354(char[] cs, int i, char[] cs_9_, int i_10_, int i_11_) {
		if (cs == cs_9_) {
			if (i == i_10_)
				return;
			if (i_10_ > i && i_10_ < i + i_11_) {
				i_11_--;
				i += i_11_;
				i_10_ += i_11_;
				i_11_ = i - i_11_;
				i_11_ += 7;
				while (i >= i_11_) {
					cs_9_[i_10_--] = cs[i--];
					cs_9_[i_10_--] = cs[i--];
					cs_9_[i_10_--] = cs[i--];
					cs_9_[i_10_--] = cs[i--];
					cs_9_[i_10_--] = cs[i--];
					cs_9_[i_10_--] = cs[i--];
					cs_9_[i_10_--] = cs[i--];
					cs_9_[i_10_--] = cs[i--];
				}
				i_11_ -= 7;
				while (i >= i_11_)
					cs_9_[i_10_--] = cs[i--];
				return;
			}
		}
		i_11_ += i;
		i_11_ -= 7;
		while (i < i_11_) {
			cs_9_[i_10_++] = cs[i++];
			cs_9_[i_10_++] = cs[i++];
			cs_9_[i_10_++] = cs[i++];
			cs_9_[i_10_++] = cs[i++];
			cs_9_[i_10_++] = cs[i++];
			cs_9_[i_10_++] = cs[i++];
			cs_9_[i_10_++] = cs[i++];
			cs_9_[i_10_++] = cs[i++];
		}
		i_11_ += 7;
		while (i < i_11_)
			cs_9_[i_10_++] = cs[i++];
	}

	Class503() throws Throwable {
		throw new Error();
	}

	static void method8355(short[] is, int i, short[] is_12_, int i_13_, int i_14_) {
		if (is == is_12_) {
			if (i == i_13_)
				return;
			if (i_13_ > i && i_13_ < i + i_14_) {
				i_14_--;
				i += i_14_;
				i_13_ += i_14_;
				i_14_ = i - i_14_;
				i_14_ += 7;
				while (i >= i_14_) {
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
				}
				i_14_ -= 7;
				while (i >= i_14_)
					is_12_[i_13_--] = is[i--];
				return;
			}
		}
		i_14_ += i;
		i_14_ -= 7;
		while (i < i_14_) {
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
		}
		i_14_ += 7;
		while (i < i_14_)
			is_12_[i_13_++] = is[i++];
	}

	public static void method8356(float[] fs, int i, float[] fs_15_, int i_16_, int i_17_) {
		if (fs == fs_15_) {
			if (i == i_16_)
				return;
			if (i_16_ > i && i_16_ < i + i_17_) {
				i_17_--;
				i += i_17_;
				i_16_ += i_17_;
				i_17_ = i - i_17_;
				i_17_ += 7;
				while (i >= i_17_) {
					fs_15_[i_16_--] = fs[i--];
					fs_15_[i_16_--] = fs[i--];
					fs_15_[i_16_--] = fs[i--];
					fs_15_[i_16_--] = fs[i--];
					fs_15_[i_16_--] = fs[i--];
					fs_15_[i_16_--] = fs[i--];
					fs_15_[i_16_--] = fs[i--];
					fs_15_[i_16_--] = fs[i--];
				}
				i_17_ -= 7;
				while (i >= i_17_)
					fs_15_[i_16_--] = fs[i--];
				return;
			}
		}
		i_17_ += i;
		i_17_ -= 7;
		while (i < i_17_) {
			fs_15_[i_16_++] = fs[i++];
			fs_15_[i_16_++] = fs[i++];
			fs_15_[i_16_++] = fs[i++];
			fs_15_[i_16_++] = fs[i++];
			fs_15_[i_16_++] = fs[i++];
			fs_15_[i_16_++] = fs[i++];
			fs_15_[i_16_++] = fs[i++];
			fs_15_[i_16_++] = fs[i++];
		}
		i_17_ += 7;
		while (i < i_17_)
			fs_15_[i_16_++] = fs[i++];
	}

	public static void method8357(int[] is, int i, int i_18_, int i_19_) {
		i_18_ = i + i_18_ - 7;
		while (i < i_18_) {
			is[i++] = i_19_;
			is[i++] = i_19_;
			is[i++] = i_19_;
			is[i++] = i_19_;
			is[i++] = i_19_;
			is[i++] = i_19_;
			is[i++] = i_19_;
			is[i++] = i_19_;
		}
		i_18_ += 7;
		while (i < i_18_)
			is[i++] = i_19_;
	}

	public static void method8358(Object[] objects, int i, Object[] objects_20_, int i_21_, int i_22_) {
		if (objects == objects_20_) {
			if (i == i_21_)
				return;
			if (i_21_ > i && i_21_ < i + i_22_) {
				i_22_--;
				i += i_22_;
				i_21_ += i_22_;
				i_22_ = i - i_22_;
				i_22_ += 7;
				while (i >= i_22_) {
					objects_20_[i_21_--] = objects[i--];
					objects_20_[i_21_--] = objects[i--];
					objects_20_[i_21_--] = objects[i--];
					objects_20_[i_21_--] = objects[i--];
					objects_20_[i_21_--] = objects[i--];
					objects_20_[i_21_--] = objects[i--];
					objects_20_[i_21_--] = objects[i--];
					objects_20_[i_21_--] = objects[i--];
				}
				i_22_ -= 7;
				while (i >= i_22_)
					objects_20_[i_21_--] = objects[i--];
				return;
			}
		}
		i_22_ += i;
		i_22_ -= 7;
		while (i < i_22_) {
			objects_20_[i_21_++] = objects[i++];
			objects_20_[i_21_++] = objects[i++];
			objects_20_[i_21_++] = objects[i++];
			objects_20_[i_21_++] = objects[i++];
			objects_20_[i_21_++] = objects[i++];
			objects_20_[i_21_++] = objects[i++];
			objects_20_[i_21_++] = objects[i++];
			objects_20_[i_21_++] = objects[i++];
		}
		i_22_ += 7;
		while (i < i_22_)
			objects_20_[i_21_++] = objects[i++];
	}

	public static void method8359(Object[] objects, int i, Object[] objects_23_, int i_24_, int i_25_) {
		if (objects == objects_23_) {
			if (i == i_24_)
				return;
			if (i_24_ > i && i_24_ < i + i_25_) {
				i_25_--;
				i += i_25_;
				i_24_ += i_25_;
				i_25_ = i - i_25_;
				i_25_ += 7;
				while (i >= i_25_) {
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
				}
				i_25_ -= 7;
				while (i >= i_25_)
					objects_23_[i_24_--] = objects[i--];
				return;
			}
		}
		i_25_ += i;
		i_25_ -= 7;
		while (i < i_25_) {
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
		}
		i_25_ += 7;
		while (i < i_25_)
			objects_23_[i_24_++] = objects[i++];
	}

	static void method8360(double[] ds, int i, double[] ds_26_, int i_27_, int i_28_) {
		if (ds == ds_26_) {
			if (i == i_27_)
				return;
			if (i_27_ > i && i_27_ < i + i_28_) {
				i_28_--;
				i += i_28_;
				i_27_ += i_28_;
				i_28_ = i - i_28_;
				i_28_ += 3;
				while (i >= i_28_) {
					ds_26_[i_27_--] = ds[i--];
					ds_26_[i_27_--] = ds[i--];
					ds_26_[i_27_--] = ds[i--];
					ds_26_[i_27_--] = ds[i--];
				}
				i_28_ -= 3;
				while (i >= i_28_)
					ds_26_[i_27_--] = ds[i--];
				return;
			}
		}
		i_28_ += i;
		i_28_ -= 3;
		while (i < i_28_) {
			ds_26_[i_27_++] = ds[i++];
			ds_26_[i_27_++] = ds[i++];
			ds_26_[i_27_++] = ds[i++];
			ds_26_[i_27_++] = ds[i++];
		}
		i_28_ += 3;
		while (i < i_28_)
			ds_26_[i_27_++] = ds[i++];
	}

	static void method8361(char[] cs, int i, char[] cs_29_, int i_30_, int i_31_) {
		if (cs == cs_29_) {
			if (i == i_30_)
				return;
			if (i_30_ > i && i_30_ < i + i_31_) {
				i_31_--;
				i += i_31_;
				i_30_ += i_31_;
				i_31_ = i - i_31_;
				i_31_ += 7;
				while (i >= i_31_) {
					cs_29_[i_30_--] = cs[i--];
					cs_29_[i_30_--] = cs[i--];
					cs_29_[i_30_--] = cs[i--];
					cs_29_[i_30_--] = cs[i--];
					cs_29_[i_30_--] = cs[i--];
					cs_29_[i_30_--] = cs[i--];
					cs_29_[i_30_--] = cs[i--];
					cs_29_[i_30_--] = cs[i--];
				}
				i_31_ -= 7;
				while (i >= i_31_)
					cs_29_[i_30_--] = cs[i--];
				return;
			}
		}
		i_31_ += i;
		i_31_ -= 7;
		while (i < i_31_) {
			cs_29_[i_30_++] = cs[i++];
			cs_29_[i_30_++] = cs[i++];
			cs_29_[i_30_++] = cs[i++];
			cs_29_[i_30_++] = cs[i++];
			cs_29_[i_30_++] = cs[i++];
			cs_29_[i_30_++] = cs[i++];
			cs_29_[i_30_++] = cs[i++];
			cs_29_[i_30_++] = cs[i++];
		}
		i_31_ += 7;
		while (i < i_31_)
			cs_29_[i_30_++] = cs[i++];
	}

	public static void method8362(int[] is, int i, int[] is_32_, int i_33_, int i_34_) {
		if (is == is_32_) {
			if (i == i_33_)
				return;
			if (i_33_ > i && i_33_ < i + i_34_) {
				i_34_--;
				i += i_34_;
				i_33_ += i_34_;
				i_34_ = i - i_34_;
				i_34_ += 7;
				while (i >= i_34_) {
					is_32_[i_33_--] = is[i--];
					is_32_[i_33_--] = is[i--];
					is_32_[i_33_--] = is[i--];
					is_32_[i_33_--] = is[i--];
					is_32_[i_33_--] = is[i--];
					is_32_[i_33_--] = is[i--];
					is_32_[i_33_--] = is[i--];
					is_32_[i_33_--] = is[i--];
				}
				i_34_ -= 7;
				while (i >= i_34_)
					is_32_[i_33_--] = is[i--];
				return;
			}
		}
		i_34_ += i;
		i_34_ -= 7;
		while (i < i_34_) {
			is_32_[i_33_++] = is[i++];
			is_32_[i_33_++] = is[i++];
			is_32_[i_33_++] = is[i++];
			is_32_[i_33_++] = is[i++];
			is_32_[i_33_++] = is[i++];
			is_32_[i_33_++] = is[i++];
			is_32_[i_33_++] = is[i++];
			is_32_[i_33_++] = is[i++];
		}
		i_34_ += 7;
		while (i < i_34_)
			is_32_[i_33_++] = is[i++];
	}

	static void method8363(short[] is, int i, short[] is_35_, int i_36_, int i_37_) {
		if (is == is_35_) {
			if (i == i_36_)
				return;
			if (i_36_ > i && i_36_ < i + i_37_) {
				i_37_--;
				i += i_37_;
				i_36_ += i_37_;
				i_37_ = i - i_37_;
				i_37_ += 7;
				while (i >= i_37_) {
					is_35_[i_36_--] = is[i--];
					is_35_[i_36_--] = is[i--];
					is_35_[i_36_--] = is[i--];
					is_35_[i_36_--] = is[i--];
					is_35_[i_36_--] = is[i--];
					is_35_[i_36_--] = is[i--];
					is_35_[i_36_--] = is[i--];
					is_35_[i_36_--] = is[i--];
				}
				i_37_ -= 7;
				while (i >= i_37_)
					is_35_[i_36_--] = is[i--];
				return;
			}
		}
		i_37_ += i;
		i_37_ -= 7;
		while (i < i_37_) {
			is_35_[i_36_++] = is[i++];
			is_35_[i_36_++] = is[i++];
			is_35_[i_36_++] = is[i++];
			is_35_[i_36_++] = is[i++];
			is_35_[i_36_++] = is[i++];
			is_35_[i_36_++] = is[i++];
			is_35_[i_36_++] = is[i++];
			is_35_[i_36_++] = is[i++];
		}
		i_37_ += 7;
		while (i < i_37_)
			is_35_[i_36_++] = is[i++];
	}

	static void method8364(short[] is, int i, short[] is_38_, int i_39_, int i_40_) {
		if (is == is_38_) {
			if (i == i_39_)
				return;
			if (i_39_ > i && i_39_ < i + i_40_) {
				i_40_--;
				i += i_40_;
				i_39_ += i_40_;
				i_40_ = i - i_40_;
				i_40_ += 7;
				while (i >= i_40_) {
					is_38_[i_39_--] = is[i--];
					is_38_[i_39_--] = is[i--];
					is_38_[i_39_--] = is[i--];
					is_38_[i_39_--] = is[i--];
					is_38_[i_39_--] = is[i--];
					is_38_[i_39_--] = is[i--];
					is_38_[i_39_--] = is[i--];
					is_38_[i_39_--] = is[i--];
				}
				i_40_ -= 7;
				while (i >= i_40_)
					is_38_[i_39_--] = is[i--];
				return;
			}
		}
		i_40_ += i;
		i_40_ -= 7;
		while (i < i_40_) {
			is_38_[i_39_++] = is[i++];
			is_38_[i_39_++] = is[i++];
			is_38_[i_39_++] = is[i++];
			is_38_[i_39_++] = is[i++];
			is_38_[i_39_++] = is[i++];
			is_38_[i_39_++] = is[i++];
			is_38_[i_39_++] = is[i++];
			is_38_[i_39_++] = is[i++];
		}
		i_40_ += 7;
		while (i < i_40_)
			is_38_[i_39_++] = is[i++];
	}

	public static void method8365(int[] is, int i, int i_41_, int i_42_) {
		i_41_ = i + i_41_ - 7;
		while (i < i_41_) {
			is[i++] = i_42_;
			is[i++] = i_42_;
			is[i++] = i_42_;
			is[i++] = i_42_;
			is[i++] = i_42_;
			is[i++] = i_42_;
			is[i++] = i_42_;
			is[i++] = i_42_;
		}
		i_41_ += 7;
		while (i < i_41_)
			is[i++] = i_42_;
	}

	static void method8366(short[] is, int i, short[] is_43_, int i_44_, int i_45_) {
		if (is == is_43_) {
			if (i == i_44_)
				return;
			if (i_44_ > i && i_44_ < i + i_45_) {
				i_45_--;
				i += i_45_;
				i_44_ += i_45_;
				i_45_ = i - i_45_;
				i_45_ += 7;
				while (i >= i_45_) {
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
				}
				i_45_ -= 7;
				while (i >= i_45_)
					is_43_[i_44_--] = is[i--];
				return;
			}
		}
		i_45_ += i;
		i_45_ -= 7;
		while (i < i_45_) {
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
		}
		i_45_ += 7;
		while (i < i_45_)
			is_43_[i_44_++] = is[i++];
	}

	public static void method8367(float[] fs, int i, float[] fs_46_, int i_47_, int i_48_) {
		if (fs == fs_46_) {
			if (i == i_47_)
				return;
			if (i_47_ > i && i_47_ < i + i_48_) {
				i_48_--;
				i += i_48_;
				i_47_ += i_48_;
				i_48_ = i - i_48_;
				i_48_ += 7;
				while (i >= i_48_) {
					fs_46_[i_47_--] = fs[i--];
					fs_46_[i_47_--] = fs[i--];
					fs_46_[i_47_--] = fs[i--];
					fs_46_[i_47_--] = fs[i--];
					fs_46_[i_47_--] = fs[i--];
					fs_46_[i_47_--] = fs[i--];
					fs_46_[i_47_--] = fs[i--];
					fs_46_[i_47_--] = fs[i--];
				}
				i_48_ -= 7;
				while (i >= i_48_)
					fs_46_[i_47_--] = fs[i--];
				return;
			}
		}
		i_48_ += i;
		i_48_ -= 7;
		while (i < i_48_) {
			fs_46_[i_47_++] = fs[i++];
			fs_46_[i_47_++] = fs[i++];
			fs_46_[i_47_++] = fs[i++];
			fs_46_[i_47_++] = fs[i++];
			fs_46_[i_47_++] = fs[i++];
			fs_46_[i_47_++] = fs[i++];
			fs_46_[i_47_++] = fs[i++];
			fs_46_[i_47_++] = fs[i++];
		}
		i_48_ += 7;
		while (i < i_48_)
			fs_46_[i_47_++] = fs[i++];
	}

	public static void method8368(float[] fs, int i, float[] fs_49_, int i_50_, int i_51_) {
		if (fs == fs_49_) {
			if (i == i_50_)
				return;
			if (i_50_ > i && i_50_ < i + i_51_) {
				i_51_--;
				i += i_51_;
				i_50_ += i_51_;
				i_51_ = i - i_51_;
				i_51_ += 7;
				while (i >= i_51_) {
					fs_49_[i_50_--] = fs[i--];
					fs_49_[i_50_--] = fs[i--];
					fs_49_[i_50_--] = fs[i--];
					fs_49_[i_50_--] = fs[i--];
					fs_49_[i_50_--] = fs[i--];
					fs_49_[i_50_--] = fs[i--];
					fs_49_[i_50_--] = fs[i--];
					fs_49_[i_50_--] = fs[i--];
				}
				i_51_ -= 7;
				while (i >= i_51_)
					fs_49_[i_50_--] = fs[i--];
				return;
			}
		}
		i_51_ += i;
		i_51_ -= 7;
		while (i < i_51_) {
			fs_49_[i_50_++] = fs[i++];
			fs_49_[i_50_++] = fs[i++];
			fs_49_[i_50_++] = fs[i++];
			fs_49_[i_50_++] = fs[i++];
			fs_49_[i_50_++] = fs[i++];
			fs_49_[i_50_++] = fs[i++];
			fs_49_[i_50_++] = fs[i++];
			fs_49_[i_50_++] = fs[i++];
		}
		i_51_ += 7;
		while (i < i_51_)
			fs_49_[i_50_++] = fs[i++];
	}

	public static void method8369(float[] fs, int i, float[] fs_52_, int i_53_, int i_54_) {
		if (fs == fs_52_) {
			if (i == i_53_)
				return;
			if (i_53_ > i && i_53_ < i + i_54_) {
				i_54_--;
				i += i_54_;
				i_53_ += i_54_;
				i_54_ = i - i_54_;
				i_54_ += 7;
				while (i >= i_54_) {
					fs_52_[i_53_--] = fs[i--];
					fs_52_[i_53_--] = fs[i--];
					fs_52_[i_53_--] = fs[i--];
					fs_52_[i_53_--] = fs[i--];
					fs_52_[i_53_--] = fs[i--];
					fs_52_[i_53_--] = fs[i--];
					fs_52_[i_53_--] = fs[i--];
					fs_52_[i_53_--] = fs[i--];
				}
				i_54_ -= 7;
				while (i >= i_54_)
					fs_52_[i_53_--] = fs[i--];
				return;
			}
		}
		i_54_ += i;
		i_54_ -= 7;
		while (i < i_54_) {
			fs_52_[i_53_++] = fs[i++];
			fs_52_[i_53_++] = fs[i++];
			fs_52_[i_53_++] = fs[i++];
			fs_52_[i_53_++] = fs[i++];
			fs_52_[i_53_++] = fs[i++];
			fs_52_[i_53_++] = fs[i++];
			fs_52_[i_53_++] = fs[i++];
			fs_52_[i_53_++] = fs[i++];
		}
		i_54_ += 7;
		while (i < i_54_)
			fs_52_[i_53_++] = fs[i++];
	}

	public static void method8370(float[] fs, int i, float[] fs_55_, int i_56_, int i_57_) {
		if (fs == fs_55_) {
			if (i == i_56_)
				return;
			if (i_56_ > i && i_56_ < i + i_57_) {
				i_57_--;
				i += i_57_;
				i_56_ += i_57_;
				i_57_ = i - i_57_;
				i_57_ += 7;
				while (i >= i_57_) {
					fs_55_[i_56_--] = fs[i--];
					fs_55_[i_56_--] = fs[i--];
					fs_55_[i_56_--] = fs[i--];
					fs_55_[i_56_--] = fs[i--];
					fs_55_[i_56_--] = fs[i--];
					fs_55_[i_56_--] = fs[i--];
					fs_55_[i_56_--] = fs[i--];
					fs_55_[i_56_--] = fs[i--];
				}
				i_57_ -= 7;
				while (i >= i_57_)
					fs_55_[i_56_--] = fs[i--];
				return;
			}
		}
		i_57_ += i;
		i_57_ -= 7;
		while (i < i_57_) {
			fs_55_[i_56_++] = fs[i++];
			fs_55_[i_56_++] = fs[i++];
			fs_55_[i_56_++] = fs[i++];
			fs_55_[i_56_++] = fs[i++];
			fs_55_[i_56_++] = fs[i++];
			fs_55_[i_56_++] = fs[i++];
			fs_55_[i_56_++] = fs[i++];
			fs_55_[i_56_++] = fs[i++];
		}
		i_57_ += 7;
		while (i < i_57_)
			fs_55_[i_56_++] = fs[i++];
	}

	static void method8371(boolean[] bools, int i, boolean[] bools_58_, int i_59_, int i_60_) {
		if (bools == bools_58_) {
			if (i == i_59_)
				return;
			if (i_59_ > i && i_59_ < i + i_60_) {
				i_60_--;
				i += i_60_;
				i_59_ += i_60_;
				i_60_ = i - i_60_;
				i_60_ += 7;
				while (i >= i_60_) {
					bools_58_[i_59_--] = bools[i--];
					bools_58_[i_59_--] = bools[i--];
					bools_58_[i_59_--] = bools[i--];
					bools_58_[i_59_--] = bools[i--];
					bools_58_[i_59_--] = bools[i--];
					bools_58_[i_59_--] = bools[i--];
					bools_58_[i_59_--] = bools[i--];
					bools_58_[i_59_--] = bools[i--];
				}
				i_60_ -= 7;
				while (i >= i_60_)
					bools_58_[i_59_--] = bools[i--];
				return;
			}
		}
		i_60_ += i;
		i_60_ -= 7;
		while (i < i_60_) {
			bools_58_[i_59_++] = bools[i++];
			bools_58_[i_59_++] = bools[i++];
			bools_58_[i_59_++] = bools[i++];
			bools_58_[i_59_++] = bools[i++];
			bools_58_[i_59_++] = bools[i++];
			bools_58_[i_59_++] = bools[i++];
			bools_58_[i_59_++] = bools[i++];
			bools_58_[i_59_++] = bools[i++];
		}
		i_60_ += 7;
		while (i < i_60_)
			bools_58_[i_59_++] = bools[i++];
	}

	static void method8372(boolean[] bools, int i, boolean[] bools_61_, int i_62_, int i_63_) {
		if (bools == bools_61_) {
			if (i == i_62_)
				return;
			if (i_62_ > i && i_62_ < i + i_63_) {
				i_63_--;
				i += i_63_;
				i_62_ += i_63_;
				i_63_ = i - i_63_;
				i_63_ += 7;
				while (i >= i_63_) {
					bools_61_[i_62_--] = bools[i--];
					bools_61_[i_62_--] = bools[i--];
					bools_61_[i_62_--] = bools[i--];
					bools_61_[i_62_--] = bools[i--];
					bools_61_[i_62_--] = bools[i--];
					bools_61_[i_62_--] = bools[i--];
					bools_61_[i_62_--] = bools[i--];
					bools_61_[i_62_--] = bools[i--];
				}
				i_63_ -= 7;
				while (i >= i_63_)
					bools_61_[i_62_--] = bools[i--];
				return;
			}
		}
		i_63_ += i;
		i_63_ -= 7;
		while (i < i_63_) {
			bools_61_[i_62_++] = bools[i++];
			bools_61_[i_62_++] = bools[i++];
			bools_61_[i_62_++] = bools[i++];
			bools_61_[i_62_++] = bools[i++];
			bools_61_[i_62_++] = bools[i++];
			bools_61_[i_62_++] = bools[i++];
			bools_61_[i_62_++] = bools[i++];
			bools_61_[i_62_++] = bools[i++];
		}
		i_63_ += 7;
		while (i < i_63_)
			bools_61_[i_62_++] = bools[i++];
	}

	public static void method8373(byte[] is, int i, byte[] is_64_, int i_65_, int i_66_) {
		if (is == is_64_) {
			if (i == i_65_)
				return;
			if (i_65_ > i && i_65_ < i + i_66_) {
				i_66_--;
				i += i_66_;
				i_65_ += i_66_;
				i_66_ = i - i_66_;
				i_66_ += 7;
				while (i >= i_66_) {
					is_64_[i_65_--] = is[i--];
					is_64_[i_65_--] = is[i--];
					is_64_[i_65_--] = is[i--];
					is_64_[i_65_--] = is[i--];
					is_64_[i_65_--] = is[i--];
					is_64_[i_65_--] = is[i--];
					is_64_[i_65_--] = is[i--];
					is_64_[i_65_--] = is[i--];
				}
				i_66_ -= 7;
				while (i >= i_66_)
					is_64_[i_65_--] = is[i--];
				return;
			}
		}
		i_66_ += i;
		i_66_ -= 7;
		while (i < i_66_) {
			is_64_[i_65_++] = is[i++];
			is_64_[i_65_++] = is[i++];
			is_64_[i_65_++] = is[i++];
			is_64_[i_65_++] = is[i++];
			is_64_[i_65_++] = is[i++];
			is_64_[i_65_++] = is[i++];
			is_64_[i_65_++] = is[i++];
			is_64_[i_65_++] = is[i++];
		}
		i_66_ += 7;
		while (i < i_66_)
			is_64_[i_65_++] = is[i++];
	}

	static void method8374(boolean[] bools, int i, boolean[] bools_67_, int i_68_, int i_69_) {
		if (bools == bools_67_) {
			if (i == i_68_)
				return;
			if (i_68_ > i && i_68_ < i + i_69_) {
				i_69_--;
				i += i_69_;
				i_68_ += i_69_;
				i_69_ = i - i_69_;
				i_69_ += 7;
				while (i >= i_69_) {
					bools_67_[i_68_--] = bools[i--];
					bools_67_[i_68_--] = bools[i--];
					bools_67_[i_68_--] = bools[i--];
					bools_67_[i_68_--] = bools[i--];
					bools_67_[i_68_--] = bools[i--];
					bools_67_[i_68_--] = bools[i--];
					bools_67_[i_68_--] = bools[i--];
					bools_67_[i_68_--] = bools[i--];
				}
				i_69_ -= 7;
				while (i >= i_69_)
					bools_67_[i_68_--] = bools[i--];
				return;
			}
		}
		i_69_ += i;
		i_69_ -= 7;
		while (i < i_69_) {
			bools_67_[i_68_++] = bools[i++];
			bools_67_[i_68_++] = bools[i++];
			bools_67_[i_68_++] = bools[i++];
			bools_67_[i_68_++] = bools[i++];
			bools_67_[i_68_++] = bools[i++];
			bools_67_[i_68_++] = bools[i++];
			bools_67_[i_68_++] = bools[i++];
			bools_67_[i_68_++] = bools[i++];
		}
		i_69_ += 7;
		while (i < i_69_)
			bools_67_[i_68_++] = bools[i++];
	}

	static void method8375(boolean[] bools, int i, boolean[] bools_70_, int i_71_, int i_72_) {
		if (bools == bools_70_) {
			if (i == i_71_)
				return;
			if (i_71_ > i && i_71_ < i + i_72_) {
				i_72_--;
				i += i_72_;
				i_71_ += i_72_;
				i_72_ = i - i_72_;
				i_72_ += 7;
				while (i >= i_72_) {
					bools_70_[i_71_--] = bools[i--];
					bools_70_[i_71_--] = bools[i--];
					bools_70_[i_71_--] = bools[i--];
					bools_70_[i_71_--] = bools[i--];
					bools_70_[i_71_--] = bools[i--];
					bools_70_[i_71_--] = bools[i--];
					bools_70_[i_71_--] = bools[i--];
					bools_70_[i_71_--] = bools[i--];
				}
				i_72_ -= 7;
				while (i >= i_72_)
					bools_70_[i_71_--] = bools[i--];
				return;
			}
		}
		i_72_ += i;
		i_72_ -= 7;
		while (i < i_72_) {
			bools_70_[i_71_++] = bools[i++];
			bools_70_[i_71_++] = bools[i++];
			bools_70_[i_71_++] = bools[i++];
			bools_70_[i_71_++] = bools[i++];
			bools_70_[i_71_++] = bools[i++];
			bools_70_[i_71_++] = bools[i++];
			bools_70_[i_71_++] = bools[i++];
			bools_70_[i_71_++] = bools[i++];
		}
		i_72_ += 7;
		while (i < i_72_)
			bools_70_[i_71_++] = bools[i++];
	}

	public static void method8376(Object[] objects, int i, Object[] objects_73_, int i_74_, int i_75_) {
		if (objects == objects_73_) {
			if (i == i_74_)
				return;
			if (i_74_ > i && i_74_ < i + i_75_) {
				i_75_--;
				i += i_75_;
				i_74_ += i_75_;
				i_75_ = i - i_75_;
				i_75_ += 7;
				while (i >= i_75_) {
					objects_73_[i_74_--] = objects[i--];
					objects_73_[i_74_--] = objects[i--];
					objects_73_[i_74_--] = objects[i--];
					objects_73_[i_74_--] = objects[i--];
					objects_73_[i_74_--] = objects[i--];
					objects_73_[i_74_--] = objects[i--];
					objects_73_[i_74_--] = objects[i--];
					objects_73_[i_74_--] = objects[i--];
				}
				i_75_ -= 7;
				while (i >= i_75_)
					objects_73_[i_74_--] = objects[i--];
				return;
			}
		}
		i_75_ += i;
		i_75_ -= 7;
		while (i < i_75_) {
			objects_73_[i_74_++] = objects[i++];
			objects_73_[i_74_++] = objects[i++];
			objects_73_[i_74_++] = objects[i++];
			objects_73_[i_74_++] = objects[i++];
			objects_73_[i_74_++] = objects[i++];
			objects_73_[i_74_++] = objects[i++];
			objects_73_[i_74_++] = objects[i++];
			objects_73_[i_74_++] = objects[i++];
		}
		i_75_ += 7;
		while (i < i_75_)
			objects_73_[i_74_++] = objects[i++];
	}

	public static void method8377(Object[] objects, int i, Object[] objects_76_, int i_77_, int i_78_) {
		if (objects == objects_76_) {
			if (i == i_77_)
				return;
			if (i_77_ > i && i_77_ < i + i_78_) {
				i_78_--;
				i += i_78_;
				i_77_ += i_78_;
				i_78_ = i - i_78_;
				i_78_ += 7;
				while (i >= i_78_) {
					objects_76_[i_77_--] = objects[i--];
					objects_76_[i_77_--] = objects[i--];
					objects_76_[i_77_--] = objects[i--];
					objects_76_[i_77_--] = objects[i--];
					objects_76_[i_77_--] = objects[i--];
					objects_76_[i_77_--] = objects[i--];
					objects_76_[i_77_--] = objects[i--];
					objects_76_[i_77_--] = objects[i--];
				}
				i_78_ -= 7;
				while (i >= i_78_)
					objects_76_[i_77_--] = objects[i--];
				return;
			}
		}
		i_78_ += i;
		i_78_ -= 7;
		while (i < i_78_) {
			objects_76_[i_77_++] = objects[i++];
			objects_76_[i_77_++] = objects[i++];
			objects_76_[i_77_++] = objects[i++];
			objects_76_[i_77_++] = objects[i++];
			objects_76_[i_77_++] = objects[i++];
			objects_76_[i_77_++] = objects[i++];
			objects_76_[i_77_++] = objects[i++];
			objects_76_[i_77_++] = objects[i++];
		}
		i_78_ += 7;
		while (i < i_78_)
			objects_76_[i_77_++] = objects[i++];
	}

	public static void method8378(int[] is, int i, int i_79_, int i_80_) {
		i_79_ = i + i_79_ - 7;
		while (i < i_79_) {
			is[i++] = i_80_;
			is[i++] = i_80_;
			is[i++] = i_80_;
			is[i++] = i_80_;
			is[i++] = i_80_;
			is[i++] = i_80_;
			is[i++] = i_80_;
			is[i++] = i_80_;
		}
		i_79_ += 7;
		while (i < i_79_)
			is[i++] = i_80_;
	}

	public static void method8379(int[] is, int i, int i_81_, int i_82_) {
		i_81_ = i + i_81_ - 7;
		while (i < i_81_) {
			is[i++] = i_82_;
			is[i++] = i_82_;
			is[i++] = i_82_;
			is[i++] = i_82_;
			is[i++] = i_82_;
			is[i++] = i_82_;
			is[i++] = i_82_;
			is[i++] = i_82_;
		}
		i_81_ += 7;
		while (i < i_81_)
			is[i++] = i_82_;
	}

	public static void method8380(int[] is, int i, int[] is_83_, int i_84_, int i_85_) {
		if (is == is_83_) {
			if (i == i_84_)
				return;
			if (i_84_ > i && i_84_ < i + i_85_) {
				i_85_--;
				i += i_85_;
				i_84_ += i_85_;
				i_85_ = i - i_85_;
				i_85_ += 7;
				while (i >= i_85_) {
					is_83_[i_84_--] = is[i--];
					is_83_[i_84_--] = is[i--];
					is_83_[i_84_--] = is[i--];
					is_83_[i_84_--] = is[i--];
					is_83_[i_84_--] = is[i--];
					is_83_[i_84_--] = is[i--];
					is_83_[i_84_--] = is[i--];
					is_83_[i_84_--] = is[i--];
				}
				i_85_ -= 7;
				while (i >= i_85_)
					is_83_[i_84_--] = is[i--];
				return;
			}
		}
		i_85_ += i;
		i_85_ -= 7;
		while (i < i_85_) {
			is_83_[i_84_++] = is[i++];
			is_83_[i_84_++] = is[i++];
			is_83_[i_84_++] = is[i++];
			is_83_[i_84_++] = is[i++];
			is_83_[i_84_++] = is[i++];
			is_83_[i_84_++] = is[i++];
			is_83_[i_84_++] = is[i++];
			is_83_[i_84_++] = is[i++];
		}
		i_85_ += 7;
		while (i < i_85_)
			is_83_[i_84_++] = is[i++];
	}

	public static void method8381(int[] is, int i, int i_86_, int i_87_) {
		i_86_ = i + i_86_ - 7;
		while (i < i_86_) {
			is[i++] = i_87_;
			is[i++] = i_87_;
			is[i++] = i_87_;
			is[i++] = i_87_;
			is[i++] = i_87_;
			is[i++] = i_87_;
			is[i++] = i_87_;
			is[i++] = i_87_;
		}
		i_86_ += 7;
		while (i < i_86_)
			is[i++] = i_87_;
	}
}
