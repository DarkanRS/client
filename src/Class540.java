
/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class540 {
	static int anInt7135;
	public static int[] anIntArray7136;
	static int anInt7137 = 0;
	
	public static void method11559(boolean bool, boolean bool_0_) {
		if (bool) {
			anInt7137 -= -1089474401;
			if (0 == -1384830113 * anInt7137)
				Class335.anIntArray3916 = null;
		}
		if (bool_0_) {
			anInt7135 -= 2019563659;
			if (0 == 89493283 * anInt7135)
				anIntArray7136 = null;
		}
	}

	static {
		anInt7135 = 0;
	}

	public static int method11560(int i, int i_1_, float f) {
		return Class8_Sub3.method14337(i, i_1_, (int) f, 1385119855);
	}

	public static int method11561(int i, int i_2_) {
		int i_3_ = i_2_ >>> 24;
		int i_4_ = 255 - i_3_;
		i_2_ = ((i_2_ & 0xff00ff) * i_3_ & ~0xff00ff | i_3_ * (i_2_ & 0xff00) & 0xff0000) >>> 8;
		return ((((i & 0xff00ff) * i_4_ & ~0xff00ff | (i & 0xff00) * i_4_ & 0xff0000) >>> 8) + i_2_);
	}

	public static int method11562(int i, int i_5_) {
		int i_6_ = i_5_ >>> 24;
		int i_7_ = 255 - i_6_;
		i_5_ = ((i_5_ & 0xff00ff) * i_6_ & ~0xff00ff | i_6_ * (i_5_ & 0xff00) & 0xff0000) >>> 8;
		return ((((i & 0xff00ff) * i_7_ & ~0xff00ff | (i & 0xff00) * i_7_ & 0xff0000) >>> 8) + i_5_);
	}

	public static void method11563(boolean bool, boolean bool_8_) {
		if (bool) {
			anInt7137 -= -1089474401;
			if (0 == -1384830113 * anInt7137)
				Class335.anIntArray3916 = null;
		}
		if (bool_8_) {
			anInt7135 -= 2019563659;
			if (0 == 89493283 * anInt7135)
				anIntArray7136 = null;
		}
	}

	public static short method11564(int i) {
		int i_9_ = i >> 10 & 0x3f;
		int i_10_ = i >> 3 & 0x70;
		int i_11_ = i & 0x7f;
		i_10_ = i_11_ <= 64 ? i_11_ * i_10_ >> 7 : (127 - i_11_) * i_10_ >> 7;
		int i_12_ = i_10_ + i_11_;
		int i_13_;
		if (0 != i_12_)
			i_13_ = (i_10_ << 8) / i_12_;
		else
			i_13_ = i_10_ << 1;
		int i_14_ = i_12_;
		return (short) (i_9_ << 10 | i_13_ >> 4 << 7 | i_14_);
	}

	public static int method11565(int i, int i_15_, int i_16_) {
		int i_17_ = 255 - i_16_;
		i_15_ = (i_16_ * (i_15_ & 0xff00ff) & ~0xff00ff | i_16_ * (i_15_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_17_ * (i & 0xff00ff) & ~0xff00ff | i_17_ * (i & 0xff00) & 0xff0000) >>> 8) + i_15_);
	}

	public static void method11566(boolean bool, boolean bool_18_) {
		if (bool) {
			anInt7137 -= -1089474401;
			if (0 == -1384830113 * anInt7137)
				Class335.anIntArray3916 = null;
		}
		if (bool_18_) {
			anInt7135 -= 2019563659;
			if (0 == 89493283 * anInt7135)
				anIntArray7136 = null;
		}
	}

	static void method11567() {
		if (null == Class335.anIntArray3916)
			Class335.anIntArray3916 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i = 0;
		for (int i_19_ = 0; i_19_ < 512; i_19_++) {
			float f = 360.0F * ((float) (i_19_ >> 3) / 64.0F + 0.0078125F);
			float f_20_ = (float) (i_19_ & 0x7) / 8.0F + 0.0625F;
			for (int i_21_ = 0; i_21_ < 128; i_21_++) {
				float f_22_ = (float) i_21_ / 128.0F;
				float f_23_ = 0.0F;
				float f_24_ = 0.0F;
				float f_25_ = 0.0F;
				float f_26_ = f / 60.0F;
				int i_27_ = (int) f_26_;
				int i_28_ = i_27_ % 6;
				float f_29_ = f_26_ - (float) i_27_;
				float f_30_ = f_22_ * (1.0F - f_20_);
				float f_31_ = f_22_ * (1.0F - f_20_ * f_29_);
				float f_32_ = (1.0F - f_20_ * (1.0F - f_29_)) * f_22_;
				if (0 == i_28_) {
					f_23_ = f_22_;
					f_24_ = f_32_;
					f_25_ = f_30_;
				} else if (i_28_ == 1) {
					f_23_ = f_31_;
					f_24_ = f_22_;
					f_25_ = f_30_;
				} else if (2 == i_28_) {
					f_23_ = f_30_;
					f_24_ = f_22_;
					f_25_ = f_32_;
				} else if (i_28_ == 3) {
					f_23_ = f_30_;
					f_24_ = f_31_;
					f_25_ = f_22_;
				} else if (i_28_ == 4) {
					f_23_ = f_32_;
					f_24_ = f_30_;
					f_25_ = f_22_;
				} else if (5 == i_28_) {
					f_23_ = f_22_;
					f_24_ = f_30_;
					f_25_ = f_31_;
				}
				f_23_ = (float) Math.pow((double) f_23_, d);
				f_24_ = (float) Math.pow((double) f_24_, d);
				f_25_ = (float) Math.pow((double) f_25_, d);
				int i_33_ = (int) (f_23_ * 256.0F);
				int i_34_ = (int) (256.0F * f_24_);
				int i_35_ = (int) (256.0F * f_25_);
				int i_36_ = -16777216 + (i_33_ << 16) + (i_34_ << 8) + i_35_;
				Class335.anIntArray3916[i++] = i_36_;
			}
		}
	}

	static void method11568() {
		if (null == Class335.anIntArray3916)
			Class335.anIntArray3916 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i = 0;
		for (int i_37_ = 0; i_37_ < 512; i_37_++) {
			float f = 360.0F * ((float) (i_37_ >> 3) / 64.0F + 0.0078125F);
			float f_38_ = (float) (i_37_ & 0x7) / 8.0F + 0.0625F;
			for (int i_39_ = 0; i_39_ < 128; i_39_++) {
				float f_40_ = (float) i_39_ / 128.0F;
				float f_41_ = 0.0F;
				float f_42_ = 0.0F;
				float f_43_ = 0.0F;
				float f_44_ = f / 60.0F;
				int i_45_ = (int) f_44_;
				int i_46_ = i_45_ % 6;
				float f_47_ = f_44_ - (float) i_45_;
				float f_48_ = f_40_ * (1.0F - f_38_);
				float f_49_ = f_40_ * (1.0F - f_38_ * f_47_);
				float f_50_ = (1.0F - f_38_ * (1.0F - f_47_)) * f_40_;
				if (0 == i_46_) {
					f_41_ = f_40_;
					f_42_ = f_50_;
					f_43_ = f_48_;
				} else if (i_46_ == 1) {
					f_41_ = f_49_;
					f_42_ = f_40_;
					f_43_ = f_48_;
				} else if (2 == i_46_) {
					f_41_ = f_48_;
					f_42_ = f_40_;
					f_43_ = f_50_;
				} else if (i_46_ == 3) {
					f_41_ = f_48_;
					f_42_ = f_49_;
					f_43_ = f_40_;
				} else if (i_46_ == 4) {
					f_41_ = f_50_;
					f_42_ = f_48_;
					f_43_ = f_40_;
				} else if (5 == i_46_) {
					f_41_ = f_40_;
					f_42_ = f_48_;
					f_43_ = f_49_;
				}
				f_41_ = (float) Math.pow((double) f_41_, d);
				f_42_ = (float) Math.pow((double) f_42_, d);
				f_43_ = (float) Math.pow((double) f_43_, d);
				int i_51_ = (int) (f_41_ * 256.0F);
				int i_52_ = (int) (256.0F * f_42_);
				int i_53_ = (int) (256.0F * f_43_);
				int i_54_ = -16777216 + (i_51_ << 16) + (i_52_ << 8) + i_53_;
				Class335.anIntArray3916[i++] = i_54_;
			}
		}
	}

	static void method11569() {
		if (anIntArray7136 == null) {
			anIntArray7136 = new int[65536];
			Class444.anIntArray5379 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_55_ = (double) (i >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_56_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
				double d_57_ = (double) (i & 0x7f) / 128.0;
				double d_58_ = d_57_;
				double d_59_ = d_57_;
				double d_60_ = d_57_;
				if (d_56_ != 0.0) {
					double d_61_;
					if (d_57_ < 0.5)
						d_61_ = d_57_ * (d_56_ + 1.0);
					else
						d_61_ = d_56_ + d_57_ - d_57_ * d_56_;
					double d_62_ = d_57_ * 2.0 - d_61_;
					double d_63_ = 0.3333333333333333 + d_55_;
					if (d_63_ > 1.0)
						d_63_--;
					double d_64_ = d_55_;
					double d_65_ = d_55_ - 0.3333333333333333;
					if (d_65_ < 0.0)
						d_65_++;
					if (d_63_ * 6.0 < 1.0)
						d_58_ = d_62_ + (d_61_ - d_62_) * 6.0 * d_63_;
					else if (2.0 * d_63_ < 1.0)
						d_58_ = d_61_;
					else if (3.0 * d_63_ < 2.0)
						d_58_ = d_62_ + 6.0 * ((0.6666666666666666 - d_63_) * (d_61_ - d_62_));
					else
						d_58_ = d_62_;
					if (6.0 * d_64_ < 1.0)
						d_59_ = d_62_ + 6.0 * (d_61_ - d_62_) * d_64_;
					else if (d_64_ * 2.0 < 1.0)
						d_59_ = d_61_;
					else if (3.0 * d_64_ < 2.0)
						d_59_ = 6.0 * ((0.6666666666666666 - d_64_) * (d_61_ - d_62_)) + d_62_;
					else
						d_59_ = d_62_;
					if (d_65_ * 6.0 < 1.0)
						d_60_ = d_65_ * (6.0 * (d_61_ - d_62_)) + d_62_;
					else if (d_65_ * 2.0 < 1.0)
						d_60_ = d_61_;
					else if (d_65_ * 3.0 < 2.0)
						d_60_ = 6.0 * ((0.6666666666666666 - d_65_) * (d_61_ - d_62_)) + d_62_;
					else
						d_60_ = d_62_;
				}
				d_58_ = Math.pow(d_58_, d);
				d_59_ = Math.pow(d_59_, d);
				d_60_ = Math.pow(d_60_, d);
				int i_66_ = (int) (d_58_ * 256.0);
				int i_67_ = (int) (d_59_ * 256.0);
				int i_68_ = (int) (256.0 * d_60_);
				int i_69_ = i_68_ + ((i_67_ << 8) + (i_66_ << 16));
				anIntArray7136[i] = i_69_ & 0xffffff;
				int i_70_ = (i_68_ << 16) + (i_67_ << 8) + i_66_;
				Class444.anIntArray5379[i] = i_70_;
			}
		}
	}

	public static void method11570(boolean bool, boolean bool_71_) {
		if (bool) {
			anInt7137 += -1089474401;
			Class371.method6351(1977411929);
		}
		if (bool_71_) {
			anInt7135 += 2019563659;
			Class77.method1365(-1785951466);
		}
	}

	static void method11571() {
		if (anIntArray7136 == null) {
			anIntArray7136 = new int[65536];
			Class444.anIntArray5379 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_72_ = (double) (i >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_73_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
				double d_74_ = (double) (i & 0x7f) / 128.0;
				double d_75_ = d_74_;
				double d_76_ = d_74_;
				double d_77_ = d_74_;
				if (d_73_ != 0.0) {
					double d_78_;
					if (d_74_ < 0.5)
						d_78_ = d_74_ * (d_73_ + 1.0);
					else
						d_78_ = d_73_ + d_74_ - d_74_ * d_73_;
					double d_79_ = d_74_ * 2.0 - d_78_;
					double d_80_ = 0.3333333333333333 + d_72_;
					if (d_80_ > 1.0)
						d_80_--;
					double d_81_ = d_72_;
					double d_82_ = d_72_ - 0.3333333333333333;
					if (d_82_ < 0.0)
						d_82_++;
					if (d_80_ * 6.0 < 1.0)
						d_75_ = d_79_ + (d_78_ - d_79_) * 6.0 * d_80_;
					else if (2.0 * d_80_ < 1.0)
						d_75_ = d_78_;
					else if (3.0 * d_80_ < 2.0)
						d_75_ = d_79_ + 6.0 * ((0.6666666666666666 - d_80_) * (d_78_ - d_79_));
					else
						d_75_ = d_79_;
					if (6.0 * d_81_ < 1.0)
						d_76_ = d_79_ + 6.0 * (d_78_ - d_79_) * d_81_;
					else if (d_81_ * 2.0 < 1.0)
						d_76_ = d_78_;
					else if (3.0 * d_81_ < 2.0)
						d_76_ = 6.0 * ((0.6666666666666666 - d_81_) * (d_78_ - d_79_)) + d_79_;
					else
						d_76_ = d_79_;
					if (d_82_ * 6.0 < 1.0)
						d_77_ = d_82_ * (6.0 * (d_78_ - d_79_)) + d_79_;
					else if (d_82_ * 2.0 < 1.0)
						d_77_ = d_78_;
					else if (d_82_ * 3.0 < 2.0)
						d_77_ = 6.0 * ((0.6666666666666666 - d_82_) * (d_78_ - d_79_)) + d_79_;
					else
						d_77_ = d_79_;
				}
				d_75_ = Math.pow(d_75_, d);
				d_76_ = Math.pow(d_76_, d);
				d_77_ = Math.pow(d_77_, d);
				int i_83_ = (int) (d_75_ * 256.0);
				int i_84_ = (int) (d_76_ * 256.0);
				int i_85_ = (int) (256.0 * d_77_);
				int i_86_ = i_85_ + ((i_84_ << 8) + (i_83_ << 16));
				anIntArray7136[i] = i_86_ & 0xffffff;
				int i_87_ = (i_85_ << 16) + (i_84_ << 8) + i_83_;
				Class444.anIntArray5379[i] = i_87_;
			}
		}
	}

	static void method11572() {
		if (anIntArray7136 == null) {
			anIntArray7136 = new int[65536];
			Class444.anIntArray5379 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_88_ = (double) (i >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_89_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
				double d_90_ = (double) (i & 0x7f) / 128.0;
				double d_91_ = d_90_;
				double d_92_ = d_90_;
				double d_93_ = d_90_;
				if (d_89_ != 0.0) {
					double d_94_;
					if (d_90_ < 0.5)
						d_94_ = d_90_ * (d_89_ + 1.0);
					else
						d_94_ = d_89_ + d_90_ - d_90_ * d_89_;
					double d_95_ = d_90_ * 2.0 - d_94_;
					double d_96_ = 0.3333333333333333 + d_88_;
					if (d_96_ > 1.0)
						d_96_--;
					double d_97_ = d_88_;
					double d_98_ = d_88_ - 0.3333333333333333;
					if (d_98_ < 0.0)
						d_98_++;
					if (d_96_ * 6.0 < 1.0)
						d_91_ = d_95_ + (d_94_ - d_95_) * 6.0 * d_96_;
					else if (2.0 * d_96_ < 1.0)
						d_91_ = d_94_;
					else if (3.0 * d_96_ < 2.0)
						d_91_ = d_95_ + 6.0 * ((0.6666666666666666 - d_96_) * (d_94_ - d_95_));
					else
						d_91_ = d_95_;
					if (6.0 * d_97_ < 1.0)
						d_92_ = d_95_ + 6.0 * (d_94_ - d_95_) * d_97_;
					else if (d_97_ * 2.0 < 1.0)
						d_92_ = d_94_;
					else if (3.0 * d_97_ < 2.0)
						d_92_ = 6.0 * ((0.6666666666666666 - d_97_) * (d_94_ - d_95_)) + d_95_;
					else
						d_92_ = d_95_;
					if (d_98_ * 6.0 < 1.0)
						d_93_ = d_98_ * (6.0 * (d_94_ - d_95_)) + d_95_;
					else if (d_98_ * 2.0 < 1.0)
						d_93_ = d_94_;
					else if (d_98_ * 3.0 < 2.0)
						d_93_ = 6.0 * ((0.6666666666666666 - d_98_) * (d_94_ - d_95_)) + d_95_;
					else
						d_93_ = d_95_;
				}
				d_91_ = Math.pow(d_91_, d);
				d_92_ = Math.pow(d_92_, d);
				d_93_ = Math.pow(d_93_, d);
				int i_99_ = (int) (d_91_ * 256.0);
				int i_100_ = (int) (d_92_ * 256.0);
				int i_101_ = (int) (256.0 * d_93_);
				int i_102_ = i_101_ + ((i_100_ << 8) + (i_99_ << 16));
				anIntArray7136[i] = i_102_ & 0xffffff;
				int i_103_ = (i_101_ << 16) + (i_100_ << 8) + i_99_;
				Class444.anIntArray5379[i] = i_103_;
			}
		}
	}

	static void method11573() {
		if (anIntArray7136 == null) {
			anIntArray7136 = new int[65536];
			Class444.anIntArray5379 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_104_ = (double) (i >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_105_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
				double d_106_ = (double) (i & 0x7f) / 128.0;
				double d_107_ = d_106_;
				double d_108_ = d_106_;
				double d_109_ = d_106_;
				if (d_105_ != 0.0) {
					double d_110_;
					if (d_106_ < 0.5)
						d_110_ = d_106_ * (d_105_ + 1.0);
					else
						d_110_ = d_105_ + d_106_ - d_106_ * d_105_;
					double d_111_ = d_106_ * 2.0 - d_110_;
					double d_112_ = 0.3333333333333333 + d_104_;
					if (d_112_ > 1.0)
						d_112_--;
					double d_113_ = d_104_;
					double d_114_ = d_104_ - 0.3333333333333333;
					if (d_114_ < 0.0)
						d_114_++;
					if (d_112_ * 6.0 < 1.0)
						d_107_ = d_111_ + (d_110_ - d_111_) * 6.0 * d_112_;
					else if (2.0 * d_112_ < 1.0)
						d_107_ = d_110_;
					else if (3.0 * d_112_ < 2.0)
						d_107_ = d_111_ + 6.0 * ((0.6666666666666666 - d_112_) * (d_110_ - d_111_));
					else
						d_107_ = d_111_;
					if (6.0 * d_113_ < 1.0)
						d_108_ = d_111_ + 6.0 * (d_110_ - d_111_) * d_113_;
					else if (d_113_ * 2.0 < 1.0)
						d_108_ = d_110_;
					else if (3.0 * d_113_ < 2.0)
						d_108_ = 6.0 * ((0.6666666666666666 - d_113_) * (d_110_ - d_111_)) + d_111_;
					else
						d_108_ = d_111_;
					if (d_114_ * 6.0 < 1.0)
						d_109_ = d_114_ * (6.0 * (d_110_ - d_111_)) + d_111_;
					else if (d_114_ * 2.0 < 1.0)
						d_109_ = d_110_;
					else if (d_114_ * 3.0 < 2.0)
						d_109_ = 6.0 * ((0.6666666666666666 - d_114_) * (d_110_ - d_111_)) + d_111_;
					else
						d_109_ = d_111_;
				}
				d_107_ = Math.pow(d_107_, d);
				d_108_ = Math.pow(d_108_, d);
				d_109_ = Math.pow(d_109_, d);
				int i_115_ = (int) (d_107_ * 256.0);
				int i_116_ = (int) (d_108_ * 256.0);
				int i_117_ = (int) (256.0 * d_109_);
				int i_118_ = i_117_ + ((i_116_ << 8) + (i_115_ << 16));
				anIntArray7136[i] = i_118_ & 0xffffff;
				int i_119_ = (i_117_ << 16) + (i_116_ << 8) + i_115_;
				Class444.anIntArray5379[i] = i_119_;
			}
		}
	}

	public static short method11574(int i) {
		int i_120_ = i >> 10 & 0x3f;
		int i_121_ = i >> 3 & 0x70;
		int i_122_ = i & 0x7f;
		i_121_ = (i_122_ <= 64 ? i_122_ * i_121_ >> 7 : (127 - i_122_) * i_121_ >> 7);
		int i_123_ = i_121_ + i_122_;
		int i_124_;
		if (0 != i_123_)
			i_124_ = (i_121_ << 8) / i_123_;
		else
			i_124_ = i_121_ << 1;
		int i_125_ = i_123_;
		return (short) (i_120_ << 10 | i_124_ >> 4 << 7 | i_125_);
	}

	public static void method11575(boolean bool, boolean bool_126_) {
		if (bool) {
			anInt7137 -= -1089474401;
			if (0 == -1384830113 * anInt7137)
				Class335.anIntArray3916 = null;
		}
		if (bool_126_) {
			anInt7135 -= 2019563659;
			if (0 == 89493283 * anInt7135)
				anIntArray7136 = null;
		}
	}

	Class540() throws Throwable {
		throw new Error();
	}

	static void method11576() {
		if (anIntArray7136 == null) {
			anIntArray7136 = new int[65536];
			Class444.anIntArray5379 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_127_ = (double) (i >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_128_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
				double d_129_ = (double) (i & 0x7f) / 128.0;
				double d_130_ = d_129_;
				double d_131_ = d_129_;
				double d_132_ = d_129_;
				if (d_128_ != 0.0) {
					double d_133_;
					if (d_129_ < 0.5)
						d_133_ = d_129_ * (d_128_ + 1.0);
					else
						d_133_ = d_128_ + d_129_ - d_129_ * d_128_;
					double d_134_ = d_129_ * 2.0 - d_133_;
					double d_135_ = 0.3333333333333333 + d_127_;
					if (d_135_ > 1.0)
						d_135_--;
					double d_136_ = d_127_;
					double d_137_ = d_127_ - 0.3333333333333333;
					if (d_137_ < 0.0)
						d_137_++;
					if (d_135_ * 6.0 < 1.0)
						d_130_ = d_134_ + (d_133_ - d_134_) * 6.0 * d_135_;
					else if (2.0 * d_135_ < 1.0)
						d_130_ = d_133_;
					else if (3.0 * d_135_ < 2.0)
						d_130_ = d_134_ + 6.0 * ((0.6666666666666666 - d_135_) * (d_133_ - d_134_));
					else
						d_130_ = d_134_;
					if (6.0 * d_136_ < 1.0)
						d_131_ = d_134_ + 6.0 * (d_133_ - d_134_) * d_136_;
					else if (d_136_ * 2.0 < 1.0)
						d_131_ = d_133_;
					else if (3.0 * d_136_ < 2.0)
						d_131_ = 6.0 * ((0.6666666666666666 - d_136_) * (d_133_ - d_134_)) + d_134_;
					else
						d_131_ = d_134_;
					if (d_137_ * 6.0 < 1.0)
						d_132_ = d_137_ * (6.0 * (d_133_ - d_134_)) + d_134_;
					else if (d_137_ * 2.0 < 1.0)
						d_132_ = d_133_;
					else if (d_137_ * 3.0 < 2.0)
						d_132_ = 6.0 * ((0.6666666666666666 - d_137_) * (d_133_ - d_134_)) + d_134_;
					else
						d_132_ = d_134_;
				}
				d_130_ = Math.pow(d_130_, d);
				d_131_ = Math.pow(d_131_, d);
				d_132_ = Math.pow(d_132_, d);
				int i_138_ = (int) (d_130_ * 256.0);
				int i_139_ = (int) (d_131_ * 256.0);
				int i_140_ = (int) (256.0 * d_132_);
				int i_141_ = i_140_ + ((i_139_ << 8) + (i_138_ << 16));
				anIntArray7136[i] = i_141_ & 0xffffff;
				int i_142_ = (i_140_ << 16) + (i_139_ << 8) + i_138_;
				Class444.anIntArray5379[i] = i_142_;
			}
		}
	}

	public static int method11577(int i, int i_143_) {
		int i_144_ = i_143_ >>> 24;
		int i_145_ = 255 - i_144_;
		i_143_ = ((i_143_ & 0xff00ff) * i_144_ & ~0xff00ff | i_144_ * (i_143_ & 0xff00) & 0xff0000) >>> 8;
		return ((((i & 0xff00ff) * i_145_ & ~0xff00ff | (i & 0xff00) * i_145_ & 0xff0000) >>> 8) + i_143_);
	}

	public static final int method11578(int i, int i_146_, int i_147_) {
		if (i_147_ > 243)
			i_146_ >>= 4;
		else if (i_147_ > 217)
			i_146_ >>= 3;
		else if (i_147_ > 192)
			i_146_ >>= 2;
		else if (i_147_ > 179)
			i_146_ >>= 1;
		return (i_147_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_146_ >> 5 << 7));
	}

	public static final int method11579(int i, int i_148_, int i_149_) {
		if (i_149_ > 243)
			i_148_ >>= 4;
		else if (i_149_ > 217)
			i_148_ >>= 3;
		else if (i_149_ > 192)
			i_148_ >>= 2;
		else if (i_149_ > 179)
			i_148_ >>= 1;
		return (i_149_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_148_ >> 5 << 7));
	}

	public static int method11580(int i, int i_150_, int i_151_) {
		int i_152_ = 255 - i_151_;
		i_150_ = (i_151_ * (i_150_ & 0xff00ff) & ~0xff00ff | i_151_ * (i_150_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_152_ * (i & 0xff00ff) & ~0xff00ff | i_152_ * (i & 0xff00) & 0xff0000) >>> 8) + i_150_);
	}

	public static int method11581(int i, int i_153_, float f) {
		return Class8_Sub3.method14337(i, i_153_, (int) f, 1385119855);
	}

	public static int method11582(int i, int i_154_, float f) {
		return Class8_Sub3.method14337(i, i_154_, (int) f, 1385119855);
	}

	public static int method11583(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_155_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_156_ = (double) (i & 0xff) / 256.0;
		double d_157_ = d;
		if (d_155_ < d_157_)
			d_157_ = d_155_;
		if (d_156_ < d_157_)
			d_157_ = d_156_;
		double d_158_ = d;
		if (d_155_ > d_158_)
			d_158_ = d_155_;
		if (d_156_ > d_158_)
			d_158_ = d_156_;
		double d_159_ = 0.0;
		double d_160_ = 0.0;
		double d_161_ = (d_158_ + d_157_) / 2.0;
		if (d_158_ != d_157_) {
			if (d_161_ < 0.5)
				d_160_ = (d_158_ - d_157_) / (d_157_ + d_158_);
			if (d_161_ >= 0.5)
				d_160_ = (d_158_ - d_157_) / (2.0 - d_158_ - d_157_);
			if (d == d_158_)
				d_159_ = (d_155_ - d_156_) / (d_158_ - d_157_);
			else if (d_155_ == d_158_)
				d_159_ = 2.0 + (d_156_ - d) / (d_158_ - d_157_);
			else if (d_158_ == d_156_)
				d_159_ = 4.0 + (d - d_155_) / (d_158_ - d_157_);
		}
		d_159_ /= 6.0;
		int i_162_ = (int) (256.0 * d_159_);
		int i_163_ = (int) (d_160_ * 256.0);
		int i_164_ = (int) (d_161_ * 256.0);
		if (i_163_ < 0)
			i_163_ = 0;
		else if (i_163_ > 255)
			i_163_ = 255;
		if (i_164_ < 0)
			i_164_ = 0;
		else if (i_164_ > 255)
			i_164_ = 255;
		if (i_164_ > 243)
			i_163_ >>= 4;
		else if (i_164_ > 217)
			i_163_ >>= 3;
		else if (i_164_ > 192)
			i_163_ >>= 2;
		else if (i_164_ > 179)
			i_163_ >>= 1;
		return (((i_162_ & 0xff) >> 2 << 10) + (i_163_ >> 5 << 7) + (i_164_ >> 1));
	}

	public static int method11584(int i, int i_165_, float f) {
		return Class8_Sub3.method14337(i, i_165_, (int) f, 1385119855);
	}

	public static int method11585(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_166_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_167_ = (double) (i & 0xff) / 256.0;
		double d_168_ = d;
		if (d_166_ < d_168_)
			d_168_ = d_166_;
		if (d_167_ < d_168_)
			d_168_ = d_167_;
		double d_169_ = d;
		if (d_166_ > d_169_)
			d_169_ = d_166_;
		if (d_167_ > d_169_)
			d_169_ = d_167_;
		double d_170_ = 0.0;
		double d_171_ = 0.0;
		double d_172_ = (d_169_ + d_168_) / 2.0;
		if (d_169_ != d_168_) {
			if (d_172_ < 0.5)
				d_171_ = (d_169_ - d_168_) / (d_168_ + d_169_);
			if (d_172_ >= 0.5)
				d_171_ = (d_169_ - d_168_) / (2.0 - d_169_ - d_168_);
			if (d == d_169_)
				d_170_ = (d_166_ - d_167_) / (d_169_ - d_168_);
			else if (d_166_ == d_169_)
				d_170_ = 2.0 + (d_167_ - d) / (d_169_ - d_168_);
			else if (d_169_ == d_167_)
				d_170_ = 4.0 + (d - d_166_) / (d_169_ - d_168_);
		}
		d_170_ /= 6.0;
		int i_173_ = (int) (256.0 * d_170_);
		int i_174_ = (int) (d_171_ * 256.0);
		int i_175_ = (int) (d_172_ * 256.0);
		if (i_174_ < 0)
			i_174_ = 0;
		else if (i_174_ > 255)
			i_174_ = 255;
		if (i_175_ < 0)
			i_175_ = 0;
		else if (i_175_ > 255)
			i_175_ = 255;
		if (i_175_ > 243)
			i_174_ >>= 4;
		else if (i_175_ > 217)
			i_174_ >>= 3;
		else if (i_175_ > 192)
			i_174_ >>= 2;
		else if (i_175_ > 179)
			i_174_ >>= 1;
		return (((i_173_ & 0xff) >> 2 << 10) + (i_174_ >> 5 << 7) + (i_175_ >> 1));
	}

	public static void method11586(boolean bool, boolean bool_176_) {
		if (bool) {
			anInt7137 += -1089474401;
			Class371.method6351(1953780433);
		}
		if (bool_176_) {
			anInt7135 += 2019563659;
			Class77.method1365(1711600961);
		}
	}

	public static void method11587(boolean bool, boolean bool_177_) {
		if (bool) {
			anInt7137 += -1089474401;
			Class371.method6351(2046315811);
		}
		if (bool_177_) {
			anInt7135 += 2019563659;
			Class77.method1365(-1556371341);
		}
	}

	public static final int method11588(int i, int i_178_) {
		if (i == -1)
			return 12345678;
		i_178_ = (i & 0x7f) * i_178_ >> 7;
		if (i_178_ < 2)
			i_178_ = 2;
		else if (i_178_ > 126)
			i_178_ = 126;
		return i_178_ + (i & 0xff80);
	}

	public static final int method11589(int i, int i_179_) {
		if (i == -2)
			return 12345678;
		if (i == -1) {
			if (i_179_ < 2)
				i_179_ = 2;
			else if (i_179_ > 126)
				i_179_ = 126;
			return i_179_;
		}
		i_179_ = (i & 0x7f) * i_179_ >> 7;
		if (i_179_ < 2)
			i_179_ = 2;
		else if (i_179_ > 126)
			i_179_ = 126;
		return i_179_ + (i & 0xff80);
	}

	public static int method11590(int i, int i_180_, int i_181_) {
		int i_182_ = 255 - i_181_;
		i_180_ = (i_181_ * (i_180_ & 0xff00ff) & ~0xff00ff | i_181_ * (i_180_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_182_ * (i & 0xff00ff) & ~0xff00ff | i_182_ * (i & 0xff00) & 0xff0000) >>> 8) + i_180_);
	}

	public static int method11591(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_183_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_184_ = (double) (i & 0xff) / 256.0;
		double d_185_ = d;
		if (d_183_ < d_185_)
			d_185_ = d_183_;
		if (d_184_ < d_185_)
			d_185_ = d_184_;
		double d_186_ = d;
		if (d_183_ > d_186_)
			d_186_ = d_183_;
		if (d_184_ > d_186_)
			d_186_ = d_184_;
		double d_187_ = 0.0;
		double d_188_ = 0.0;
		double d_189_ = (d_186_ + d_185_) / 2.0;
		if (d_186_ != d_185_) {
			if (d_189_ < 0.5)
				d_188_ = (d_186_ - d_185_) / (d_185_ + d_186_);
			if (d_189_ >= 0.5)
				d_188_ = (d_186_ - d_185_) / (2.0 - d_186_ - d_185_);
			if (d == d_186_)
				d_187_ = (d_183_ - d_184_) / (d_186_ - d_185_);
			else if (d_183_ == d_186_)
				d_187_ = 2.0 + (d_184_ - d) / (d_186_ - d_185_);
			else if (d_186_ == d_184_)
				d_187_ = 4.0 + (d - d_183_) / (d_186_ - d_185_);
		}
		d_187_ /= 6.0;
		int i_190_ = (int) (256.0 * d_187_);
		int i_191_ = (int) (d_188_ * 256.0);
		int i_192_ = (int) (d_189_ * 256.0);
		if (i_191_ < 0)
			i_191_ = 0;
		else if (i_191_ > 255)
			i_191_ = 255;
		if (i_192_ < 0)
			i_192_ = 0;
		else if (i_192_ > 255)
			i_192_ = 255;
		if (i_192_ > 243)
			i_191_ >>= 4;
		else if (i_192_ > 217)
			i_191_ >>= 3;
		else if (i_192_ > 192)
			i_191_ >>= 2;
		else if (i_192_ > 179)
			i_191_ >>= 1;
		return (((i_190_ & 0xff) >> 2 << 10) + (i_191_ >> 5 << 7) + (i_192_ >> 1));
	}

	static void method11592(CS2Executor class527, byte i) {
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = (Class409.aClass242_4922.method4156((((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 - 2]), -1396181317).aStringArray2975[(((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 - 1])]);
		((CS2Executor) class527).anInt7012 -= 283782002;
	}

	static final void method11593(CS2Executor class527, int i) {
		int i_193_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_193_, (byte) 27);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_193_ >> 16];
		Class263.method4772(class118, class98, class527, (byte) 88);
	}

	static final void method11594(CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4579, client.aClass184_7218.aClass432_2283, 1692651039);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class108.method1846(string, -1869083992));
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		client.aClass184_7218.method3049(class282_sub23, 1662884695);
	}

	public static Class282_Sub36 method11595(int i) {
		if (Class291_Sub1.aClass482_3459 == null || null == Class291_Sub1.aClass460_8030)
			return null;
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) Class291_Sub1.aClass460_8030.next(); class282_sub36 != null; class282_sub36 = (Class282_Sub36) Class291_Sub1.aClass460_8030.next()) {
			Class220 class220 = Class291_Sub1.aClass218_3456.method3700(((class282_sub36.anInt7991) * -1798678621), 461119623);
			if (null != class220 && class220.aBool2742 && class220.method3719(Class291_Sub1.anInterface42_3458, 1905436135))
				return class282_sub36;
		}
		return null;
	}

	static final void decodeNPCUpdate(boolean bool, int i) {
		client.anInt7216 = 0;
		client.npcListSize = 0;
		client.anInt7332 += 539499635;
		Exception_Sub2_Sub2.decodeAddRemove(-1738671867);
		Class459.decodeUpdate(bool, 1344849031);
		Class14.decodeMasks();
		boolean bool_194_ = false;
		for (int i_195_ = 0; i_195_ < client.anInt7216 * -423388407; i_195_++) {
			int i_196_ = client.anIntArray7421[i_195_];
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_196_));
			NPC class521_sub1_sub1_sub2_sub2 = (NPC) class282_sub47.anObject8068;
			if (class521_sub1_sub1_sub2_sub2.anInt10353 * 2123576997 != -609621829 * client.anInt7332) {
				if (Class20.aBool161 && Class444.method7426(i_196_, (byte) -86))
					Class316.method5594(-559600711);
				if (class521_sub1_sub1_sub2_sub2.aClass409_10580.method6886(-1089073917))
					Class169.method2876(class521_sub1_sub1_sub2_sub2, 1280406765);
				class521_sub1_sub1_sub2_sub2.method16166(null, -12061587);
				class282_sub47.unlink(-371378792);
				bool_194_ = true;
			}
		}
		if (bool_194_) {
			int i_197_ = 1658163325 * client.anInt7210;
			client.anInt7210 = (client.aClass465_7208.method7748((short) 15812) * -1228117803);
			int i_198_ = 0;
			Iterator iterator = client.aClass465_7208.iterator();
			while (iterator.hasNext()) {
				Class282_Sub47 class282_sub47 = (Class282_Sub47) iterator.next();
				client.aClass282_Sub47Array7209[i_198_++] = class282_sub47;
			}
			for (int i_199_ = client.anInt7210 * 1658163325; i_199_ < i_197_; i_199_++)
				client.aClass282_Sub47Array7209[i_199_] = null;
		}
		if ((((Class184) client.aClass184_7475).aClass282_Sub35_Sub2_2284.index) * -1990677291 != ((Class184) client.aClass184_7475).anInt2287 * 715663393)
			throw new RuntimeException(new StringBuilder().append((((Class184) client.aClass184_7475).aClass282_Sub35_Sub2_2284.index) * -1990677291).append(" ").append(715663393 * (((Class184) client.aClass184_7475).anInt2287)).toString());
		for (int i_200_ = 0; i_200_ < client.anInt7211 * -685729279; i_200_++) {
			if (client.aClass465_7208.method7754((long) client.anIntArray7212[i_200_]) == null)
				throw new RuntimeException(new StringBuilder().append(i_200_).append(" ").append(-685729279 * client.anInt7211).toString());
		}
		if (0 != 1658163325 * client.anInt7210 - client.anInt7211 * -685729279)
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt7210 * 1658163325 - -685729279 * client.anInt7211).toString());
		for (int i_201_ = 0; i_201_ < client.anInt7210 * 1658163325; i_201_++) {
			if (client.anInt7332 * -609621829 != (((Animable) client.aClass282_Sub47Array7209[i_201_].anObject8068).anInt10353) * 2123576997)
				throw new RuntimeException(new StringBuilder().append("").append(-1691508299 * (((Animable) (client.aClass282_Sub47Array7209[i_201_].anObject8068)).anInt10314)).toString());
		}
	}
}
