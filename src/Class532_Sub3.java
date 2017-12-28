/* Class532_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class532_Sub3 extends Class532 {
	static void method12883(int i) {
		if (Class5.anIntArray36 == null || Class5.anIntArray36.length < i)
			Class5.anIntArray36 = new int[i];
	}

	static final void method12884(int i, int i_0_, int i_1_, int i_2_) {
		if (i - i_1_ >= anInt7071 * -612590951 && i + i_1_ <= anInt7069 * -1345107225 && i_0_ - i_1_ >= 324226563 * anInt7070 && i_1_ + i_0_ <= -348932735 * anInt7068)
			Class31.method813(i, i_0_, i_1_, i_2_, 246493553);
		else
			Class273.method4866(i, i_0_, i_1_, i_2_, -210113862);
	}

	static final void method12885(int i, int i_3_, int i_4_, int i_5_) {
		if (i - i_4_ >= anInt7071 * -612590951 && i + i_4_ <= anInt7069 * -1345107225 && i_3_ - i_4_ >= 324226563 * anInt7070 && i_4_ + i_3_ <= -348932735 * anInt7068)
			Class31.method813(i, i_3_, i_4_, i_5_, -760364154);
		else
			Class273.method4866(i, i_3_, i_4_, i_5_, 376188250);
	}

	static final void method12886(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		Class426.method7170(i_7_, 377314002);
		int i_11_ = 0;
		int i_12_ = i_7_ - i_10_;
		if (i_12_ < 0)
			i_12_ = 0;
		int i_13_ = i_7_;
		int i_14_ = -i_7_;
		int i_15_ = i_12_;
		int i_16_ = -i_12_;
		int i_17_ = -1;
		int i_18_ = -1;
		int[] is = anIntArrayArray7072[i_6_];
		int i_19_ = i - i_12_;
		int i_20_ = i + i_12_;
		Class232.method3922(is, i - i_7_, i_19_, i_9_, (byte) 23);
		Class232.method3922(is, i_19_, i_20_, i_8_, (byte) 33);
		Class232.method3922(is, i_20_, i + i_7_, i_9_, (byte) -24);
		while (i_13_ > i_11_) {
			i_17_ += 2;
			i_18_ += 2;
			i_14_ += i_17_;
			i_16_ += i_18_;
			if (i_16_ >= 0 && i_15_ >= 1) {
				Class5.anIntArray36[i_15_] = i_11_;
				i_15_--;
				i_16_ -= i_15_ << 1;
			}
			i_11_++;
			if (i_14_ >= 0) {
				i_13_--;
				i_14_ -= i_13_ << 1;
				if (i_13_ >= i_12_) {
					int[] is_21_ = anIntArrayArray7072[i_13_ + i_6_];
					int[] is_22_ = anIntArrayArray7072[i_6_ - i_13_];
					int i_23_ = i + i_11_;
					int i_24_ = i - i_11_;
					Class232.method3922(is_21_, i_24_, i_23_, i_9_, (byte) -30);
					Class232.method3922(is_22_, i_24_, i_23_, i_9_, (byte) 30);
				} else {
					int[] is_25_ = anIntArrayArray7072[i_6_ + i_13_];
					int[] is_26_ = anIntArrayArray7072[i_6_ - i_13_];
					int i_27_ = Class5.anIntArray36[i_13_];
					int i_28_ = i + i_11_;
					int i_29_ = i - i_11_;
					int i_30_ = i + i_27_;
					int i_31_ = i - i_27_;
					Class232.method3922(is_25_, i_29_, i_31_, i_9_, (byte) 51);
					Class232.method3922(is_25_, i_31_, i_30_, i_8_, (byte) 35);
					Class232.method3922(is_25_, i_30_, i_28_, i_9_, (byte) 59);
					Class232.method3922(is_26_, i_29_, i_31_, i_9_, (byte) -16);
					Class232.method3922(is_26_, i_31_, i_30_, i_8_, (byte) -83);
					Class232.method3922(is_26_, i_30_, i_28_, i_9_, (byte) 13);
				}
			}
			int[] is_32_ = anIntArrayArray7072[i_6_ + i_11_];
			int[] is_33_ = anIntArrayArray7072[i_6_ - i_11_];
			int i_34_ = i_13_ + i;
			int i_35_ = i - i_13_;
			if (i_11_ < i_12_) {
				int i_36_ = i_15_ < i_11_ ? Class5.anIntArray36[i_11_] : i_15_;
				int i_37_ = i_36_ + i;
				int i_38_ = i - i_36_;
				Class232.method3922(is_32_, i_35_, i_38_, i_9_, (byte) -52);
				Class232.method3922(is_32_, i_38_, i_37_, i_8_, (byte) -91);
				Class232.method3922(is_32_, i_37_, i_34_, i_9_, (byte) 13);
				Class232.method3922(is_33_, i_35_, i_38_, i_9_, (byte) -11);
				Class232.method3922(is_33_, i_38_, i_37_, i_8_, (byte) 15);
				Class232.method3922(is_33_, i_37_, i_34_, i_9_, (byte) 50);
			} else {
				Class232.method3922(is_32_, i_35_, i_34_, i_9_, (byte) 7);
				Class232.method3922(is_33_, i_35_, i_34_, i_9_, (byte) -76);
			}
		}
	}

	static final void method12887(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		Class426.method7170(i_40_, 377314002);
		int i_44_ = 0;
		int i_45_ = i_40_ - i_43_;
		if (i_45_ < 0)
			i_45_ = 0;
		int i_46_ = i_40_;
		int i_47_ = -i_40_;
		int i_48_ = i_45_;
		int i_49_ = -i_45_;
		int i_50_ = -1;
		int i_51_ = -1;
		int[] is = anIntArrayArray7072[i_39_];
		int i_52_ = i - i_45_;
		int i_53_ = i + i_45_;
		Class232.method3922(is, i - i_40_, i_52_, i_42_, (byte) 35);
		Class232.method3922(is, i_52_, i_53_, i_41_, (byte) 11);
		Class232.method3922(is, i_53_, i + i_40_, i_42_, (byte) 16);
		while (i_46_ > i_44_) {
			i_50_ += 2;
			i_51_ += 2;
			i_47_ += i_50_;
			i_49_ += i_51_;
			if (i_49_ >= 0 && i_48_ >= 1) {
				Class5.anIntArray36[i_48_] = i_44_;
				i_48_--;
				i_49_ -= i_48_ << 1;
			}
			i_44_++;
			if (i_47_ >= 0) {
				i_46_--;
				i_47_ -= i_46_ << 1;
				if (i_46_ >= i_45_) {
					int[] is_54_ = anIntArrayArray7072[i_46_ + i_39_];
					int[] is_55_ = anIntArrayArray7072[i_39_ - i_46_];
					int i_56_ = i + i_44_;
					int i_57_ = i - i_44_;
					Class232.method3922(is_54_, i_57_, i_56_, i_42_, (byte) -30);
					Class232.method3922(is_55_, i_57_, i_56_, i_42_, (byte) -22);
				} else {
					int[] is_58_ = anIntArrayArray7072[i_39_ + i_46_];
					int[] is_59_ = anIntArrayArray7072[i_39_ - i_46_];
					int i_60_ = Class5.anIntArray36[i_46_];
					int i_61_ = i + i_44_;
					int i_62_ = i - i_44_;
					int i_63_ = i + i_60_;
					int i_64_ = i - i_60_;
					Class232.method3922(is_58_, i_62_, i_64_, i_42_, (byte) -9);
					Class232.method3922(is_58_, i_64_, i_63_, i_41_, (byte) -37);
					Class232.method3922(is_58_, i_63_, i_61_, i_42_, (byte) -102);
					Class232.method3922(is_59_, i_62_, i_64_, i_42_, (byte) 61);
					Class232.method3922(is_59_, i_64_, i_63_, i_41_, (byte) 69);
					Class232.method3922(is_59_, i_63_, i_61_, i_42_, (byte) -53);
				}
			}
			int[] is_65_ = anIntArrayArray7072[i_39_ + i_44_];
			int[] is_66_ = anIntArrayArray7072[i_39_ - i_44_];
			int i_67_ = i_46_ + i;
			int i_68_ = i - i_46_;
			if (i_44_ < i_45_) {
				int i_69_ = i_48_ < i_44_ ? Class5.anIntArray36[i_44_] : i_48_;
				int i_70_ = i_69_ + i;
				int i_71_ = i - i_69_;
				Class232.method3922(is_65_, i_68_, i_71_, i_42_, (byte) 7);
				Class232.method3922(is_65_, i_71_, i_70_, i_41_, (byte) -13);
				Class232.method3922(is_65_, i_70_, i_67_, i_42_, (byte) -10);
				Class232.method3922(is_66_, i_68_, i_71_, i_42_, (byte) -46);
				Class232.method3922(is_66_, i_71_, i_70_, i_41_, (byte) -75);
				Class232.method3922(is_66_, i_70_, i_67_, i_42_, (byte) -2);
			} else {
				Class232.method3922(is_65_, i_68_, i_67_, i_42_, (byte) -97);
				Class232.method3922(is_66_, i_68_, i_67_, i_42_, (byte) 12);
			}
		}
	}

	static final void method12888(int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_) {
		Class426.method7170(i_73_, 377314002);
		int i_77_ = 0;
		int i_78_ = i_73_ - i_76_;
		if (i_78_ < 0)
			i_78_ = 0;
		int i_79_ = i_73_;
		int i_80_ = -i_73_;
		int i_81_ = i_78_;
		int i_82_ = -i_78_;
		int i_83_ = -1;
		int i_84_ = -1;
		if (i_72_ >= anInt7070 * 324226563 && i_72_ <= anInt7068 * -348932735) {
			int[] is = anIntArrayArray7072[i_72_];
			int i_85_ = Class275.method4890(i - i_73_, anInt7071 * -612590951, -1345107225 * anInt7069, -1477317461);
			int i_86_ = Class275.method4890(i_73_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, -373569156);
			int i_87_ = Class275.method4890(i - i_78_, -612590951 * anInt7071, -1345107225 * anInt7069, -1252798975);
			int i_88_ = Class275.method4890(i_78_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, 1223923999);
			Class232.method3922(is, i_85_, i_87_, i_75_, (byte) 46);
			Class232.method3922(is, i_87_, i_88_, i_74_, (byte) 78);
			Class232.method3922(is, i_88_, i_86_, i_75_, (byte) -59);
		}
		while (i_79_ > i_77_) {
			i_83_ += 2;
			i_84_ += 2;
			i_80_ += i_83_;
			i_82_ += i_84_;
			if (i_82_ >= 0 && i_81_ >= 1) {
				i_81_--;
				i_82_ -= i_81_ << 1;
				Class5.anIntArray36[i_81_] = i_77_;
			}
			i_77_++;
			if (i_80_ >= 0) {
				i_79_--;
				i_80_ -= i_79_ << 1;
				int i_89_ = i_72_ - i_79_;
				int i_90_ = i_79_ + i_72_;
				if (i_90_ >= 324226563 * anInt7070 && i_89_ <= -348932735 * anInt7068) {
					if (i_79_ >= i_78_) {
						int i_91_ = Class275.method4890(i_77_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, 657659357);
						int i_92_ = Class275.method4890(i - i_77_, anInt7071 * -612590951, anInt7069 * -1345107225, -1038181374);
						if (i_90_ <= -348932735 * anInt7068)
							Class232.method3922(anIntArrayArray7072[i_90_], i_92_, i_91_, i_75_, (byte) 83);
						if (i_89_ >= anInt7070 * 324226563)
							Class232.method3922(anIntArrayArray7072[i_89_], i_92_, i_91_, i_75_, (byte) 36);
					} else {
						int i_93_ = Class5.anIntArray36[i_79_];
						int i_94_ = Class275.method4890(i + i_77_, anInt7071 * -612590951, -1345107225 * anInt7069, 1816182931);
						int i_95_ = Class275.method4890(i - i_77_, anInt7071 * -612590951, -1345107225 * anInt7069, 2130545724);
						int i_96_ = Class275.method4890(i + i_93_, anInt7071 * -612590951, anInt7069 * -1345107225, 1489767123);
						int i_97_ = Class275.method4890(i - i_93_, anInt7071 * -612590951, -1345107225 * anInt7069, 211627017);
						if (i_90_ <= -348932735 * anInt7068) {
							int[] is = anIntArrayArray7072[i_90_];
							Class232.method3922(is, i_95_, i_97_, i_75_, (byte) 40);
							Class232.method3922(is, i_97_, i_96_, i_74_, (byte) 34);
							Class232.method3922(is, i_96_, i_94_, i_75_, (byte) -79);
						}
						if (i_89_ >= anInt7070 * 324226563) {
							int[] is = anIntArrayArray7072[i_89_];
							Class232.method3922(is, i_95_, i_97_, i_75_, (byte) 84);
							Class232.method3922(is, i_97_, i_96_, i_74_, (byte) -16);
							Class232.method3922(is, i_96_, i_94_, i_75_, (byte) -25);
						}
					}
				}
			}
			int i_98_ = i_72_ - i_77_;
			int i_99_ = i_72_ + i_77_;
			if (i_99_ >= anInt7070 * 324226563 && i_98_ <= -348932735 * anInt7068) {
				int i_100_ = i + i_79_;
				int i_101_ = i - i_79_;
				if (i_100_ >= -612590951 * anInt7071 && i_101_ <= anInt7069 * -1345107225) {
					i_100_ = Class275.method4890(i_100_, anInt7071 * -612590951, -1345107225 * anInt7069, -2054882695);
					i_101_ = Class275.method4890(i_101_, -612590951 * anInt7071, anInt7069 * -1345107225, 1618510619);
					if (i_77_ < i_78_) {
						int i_102_ = (i_81_ < i_77_ ? Class5.anIntArray36[i_77_] : i_81_);
						int i_103_ = Class275.method4890(i + i_102_, -612590951 * anInt7071, anInt7069 * -1345107225, -18045856);
						int i_104_ = Class275.method4890(i - i_102_, -612590951 * anInt7071, -1345107225 * anInt7069, -1639997207);
						if (i_99_ <= anInt7068 * -348932735) {
							int[] is = anIntArrayArray7072[i_99_];
							Class232.method3922(is, i_101_, i_104_, i_75_, (byte) 86);
							Class232.method3922(is, i_104_, i_103_, i_74_, (byte) -87);
							Class232.method3922(is, i_103_, i_100_, i_75_, (byte) 51);
						}
						if (i_98_ >= 324226563 * anInt7070) {
							int[] is = anIntArrayArray7072[i_98_];
							Class232.method3922(is, i_101_, i_104_, i_75_, (byte) 24);
							Class232.method3922(is, i_104_, i_103_, i_74_, (byte) 25);
							Class232.method3922(is, i_103_, i_100_, i_75_, (byte) -13);
						}
					} else {
						if (i_99_ <= -348932735 * anInt7068)
							Class232.method3922(anIntArrayArray7072[i_99_], i_101_, i_100_, i_75_, (byte) -37);
						if (i_98_ >= 324226563 * anInt7070)
							Class232.method3922(anIntArrayArray7072[i_98_], i_101_, i_100_, i_75_, (byte) -73);
					}
				}
			}
		}
	}

	Class532_Sub3() throws Throwable {
		throw new Error();
	}

	static final void method12889(int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_) {
		Class426.method7170(i_106_, 377314002);
		int i_110_ = 0;
		int i_111_ = i_106_ - i_109_;
		if (i_111_ < 0)
			i_111_ = 0;
		int i_112_ = i_106_;
		int i_113_ = -i_106_;
		int i_114_ = i_111_;
		int i_115_ = -i_111_;
		int i_116_ = -1;
		int i_117_ = -1;
		if (i_105_ >= anInt7070 * 324226563 && i_105_ <= anInt7068 * -348932735) {
			int[] is = anIntArrayArray7072[i_105_];
			int i_118_ = Class275.method4890(i - i_106_, anInt7071 * -612590951, -1345107225 * anInt7069, -879911849);
			int i_119_ = Class275.method4890(i_106_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, -1433931641);
			int i_120_ = Class275.method4890(i - i_111_, -612590951 * anInt7071, -1345107225 * anInt7069, 266026506);
			int i_121_ = Class275.method4890(i_111_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, -1739091876);
			Class232.method3922(is, i_118_, i_120_, i_108_, (byte) -33);
			Class232.method3922(is, i_120_, i_121_, i_107_, (byte) 55);
			Class232.method3922(is, i_121_, i_119_, i_108_, (byte) 3);
		}
		while (i_112_ > i_110_) {
			i_116_ += 2;
			i_117_ += 2;
			i_113_ += i_116_;
			i_115_ += i_117_;
			if (i_115_ >= 0 && i_114_ >= 1) {
				i_114_--;
				i_115_ -= i_114_ << 1;
				Class5.anIntArray36[i_114_] = i_110_;
			}
			i_110_++;
			if (i_113_ >= 0) {
				i_112_--;
				i_113_ -= i_112_ << 1;
				int i_122_ = i_105_ - i_112_;
				int i_123_ = i_112_ + i_105_;
				if (i_123_ >= 324226563 * anInt7070 && i_122_ <= -348932735 * anInt7068) {
					if (i_112_ >= i_111_) {
						int i_124_ = Class275.method4890(i_110_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, 216866971);
						int i_125_ = Class275.method4890(i - i_110_, anInt7071 * -612590951, anInt7069 * -1345107225, -1852485473);
						if (i_123_ <= -348932735 * anInt7068)
							Class232.method3922(anIntArrayArray7072[i_123_], i_125_, i_124_, i_108_, (byte) 75);
						if (i_122_ >= anInt7070 * 324226563)
							Class232.method3922(anIntArrayArray7072[i_122_], i_125_, i_124_, i_108_, (byte) -97);
					} else {
						int i_126_ = Class5.anIntArray36[i_112_];
						int i_127_ = Class275.method4890(i + i_110_, anInt7071 * -612590951, -1345107225 * anInt7069, -1906281631);
						int i_128_ = Class275.method4890(i - i_110_, anInt7071 * -612590951, -1345107225 * anInt7069, 1897993435);
						int i_129_ = Class275.method4890(i + i_126_, anInt7071 * -612590951, anInt7069 * -1345107225, -903147404);
						int i_130_ = Class275.method4890(i - i_126_, anInt7071 * -612590951, -1345107225 * anInt7069, 298068517);
						if (i_123_ <= -348932735 * anInt7068) {
							int[] is = anIntArrayArray7072[i_123_];
							Class232.method3922(is, i_128_, i_130_, i_108_, (byte) 24);
							Class232.method3922(is, i_130_, i_129_, i_107_, (byte) 0);
							Class232.method3922(is, i_129_, i_127_, i_108_, (byte) 48);
						}
						if (i_122_ >= anInt7070 * 324226563) {
							int[] is = anIntArrayArray7072[i_122_];
							Class232.method3922(is, i_128_, i_130_, i_108_, (byte) -61);
							Class232.method3922(is, i_130_, i_129_, i_107_, (byte) -38);
							Class232.method3922(is, i_129_, i_127_, i_108_, (byte) -90);
						}
					}
				}
			}
			int i_131_ = i_105_ - i_110_;
			int i_132_ = i_105_ + i_110_;
			if (i_132_ >= anInt7070 * 324226563 && i_131_ <= -348932735 * anInt7068) {
				int i_133_ = i + i_112_;
				int i_134_ = i - i_112_;
				if (i_133_ >= -612590951 * anInt7071 && i_134_ <= anInt7069 * -1345107225) {
					i_133_ = Class275.method4890(i_133_, anInt7071 * -612590951, -1345107225 * anInt7069, 553536373);
					i_134_ = Class275.method4890(i_134_, -612590951 * anInt7071, anInt7069 * -1345107225, -523486622);
					if (i_110_ < i_111_) {
						int i_135_ = (i_114_ < i_110_ ? Class5.anIntArray36[i_110_] : i_114_);
						int i_136_ = Class275.method4890(i + i_135_, -612590951 * anInt7071, anInt7069 * -1345107225, -883565210);
						int i_137_ = Class275.method4890(i - i_135_, -612590951 * anInt7071, -1345107225 * anInt7069, 476062881);
						if (i_132_ <= anInt7068 * -348932735) {
							int[] is = anIntArrayArray7072[i_132_];
							Class232.method3922(is, i_134_, i_137_, i_108_, (byte) 37);
							Class232.method3922(is, i_137_, i_136_, i_107_, (byte) 14);
							Class232.method3922(is, i_136_, i_133_, i_108_, (byte) 25);
						}
						if (i_131_ >= 324226563 * anInt7070) {
							int[] is = anIntArrayArray7072[i_131_];
							Class232.method3922(is, i_134_, i_137_, i_108_, (byte) 86);
							Class232.method3922(is, i_137_, i_136_, i_107_, (byte) 35);
							Class232.method3922(is, i_136_, i_133_, i_108_, (byte) -34);
						}
					} else {
						if (i_132_ <= -348932735 * anInt7068)
							Class232.method3922(anIntArrayArray7072[i_132_], i_134_, i_133_, i_108_, (byte) 20);
						if (i_131_ >= 324226563 * anInt7070)
							Class232.method3922(anIntArrayArray7072[i_131_], i_134_, i_133_, i_108_, (byte) -22);
					}
				}
			}
		}
	}

	static final void method12890(int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_) {
		Class426.method7170(i_139_, 377314002);
		int i_143_ = 0;
		int i_144_ = i_139_ - i_142_;
		if (i_144_ < 0)
			i_144_ = 0;
		int i_145_ = i_139_;
		int i_146_ = -i_139_;
		int i_147_ = i_144_;
		int i_148_ = -i_144_;
		int i_149_ = -1;
		int i_150_ = -1;
		if (i_138_ >= anInt7070 * 324226563 && i_138_ <= anInt7068 * -348932735) {
			int[] is = anIntArrayArray7072[i_138_];
			int i_151_ = Class275.method4890(i - i_139_, anInt7071 * -612590951, -1345107225 * anInt7069, 414694769);
			int i_152_ = Class275.method4890(i_139_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, -785905054);
			int i_153_ = Class275.method4890(i - i_144_, -612590951 * anInt7071, -1345107225 * anInt7069, 1210496705);
			int i_154_ = Class275.method4890(i_144_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, -1993940503);
			Class232.method3922(is, i_151_, i_153_, i_141_, (byte) -15);
			Class232.method3922(is, i_153_, i_154_, i_140_, (byte) -63);
			Class232.method3922(is, i_154_, i_152_, i_141_, (byte) 61);
		}
		while (i_145_ > i_143_) {
			i_149_ += 2;
			i_150_ += 2;
			i_146_ += i_149_;
			i_148_ += i_150_;
			if (i_148_ >= 0 && i_147_ >= 1) {
				i_147_--;
				i_148_ -= i_147_ << 1;
				Class5.anIntArray36[i_147_] = i_143_;
			}
			i_143_++;
			if (i_146_ >= 0) {
				i_145_--;
				i_146_ -= i_145_ << 1;
				int i_155_ = i_138_ - i_145_;
				int i_156_ = i_145_ + i_138_;
				if (i_156_ >= 324226563 * anInt7070 && i_155_ <= -348932735 * anInt7068) {
					if (i_145_ >= i_144_) {
						int i_157_ = Class275.method4890(i_143_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, -585725106);
						int i_158_ = Class275.method4890(i - i_143_, anInt7071 * -612590951, anInt7069 * -1345107225, -80159340);
						if (i_156_ <= -348932735 * anInt7068)
							Class232.method3922(anIntArrayArray7072[i_156_], i_158_, i_157_, i_141_, (byte) 12);
						if (i_155_ >= anInt7070 * 324226563)
							Class232.method3922(anIntArrayArray7072[i_155_], i_158_, i_157_, i_141_, (byte) -9);
					} else {
						int i_159_ = Class5.anIntArray36[i_145_];
						int i_160_ = Class275.method4890(i + i_143_, anInt7071 * -612590951, -1345107225 * anInt7069, -2008190037);
						int i_161_ = Class275.method4890(i - i_143_, anInt7071 * -612590951, -1345107225 * anInt7069, -1936787421);
						int i_162_ = Class275.method4890(i + i_159_, anInt7071 * -612590951, anInt7069 * -1345107225, -183776295);
						int i_163_ = Class275.method4890(i - i_159_, anInt7071 * -612590951, -1345107225 * anInt7069, 280294923);
						if (i_156_ <= -348932735 * anInt7068) {
							int[] is = anIntArrayArray7072[i_156_];
							Class232.method3922(is, i_161_, i_163_, i_141_, (byte) 119);
							Class232.method3922(is, i_163_, i_162_, i_140_, (byte) -23);
							Class232.method3922(is, i_162_, i_160_, i_141_, (byte) 96);
						}
						if (i_155_ >= anInt7070 * 324226563) {
							int[] is = anIntArrayArray7072[i_155_];
							Class232.method3922(is, i_161_, i_163_, i_141_, (byte) 12);
							Class232.method3922(is, i_163_, i_162_, i_140_, (byte) 81);
							Class232.method3922(is, i_162_, i_160_, i_141_, (byte) -34);
						}
					}
				}
			}
			int i_164_ = i_138_ - i_143_;
			int i_165_ = i_138_ + i_143_;
			if (i_165_ >= anInt7070 * 324226563 && i_164_ <= -348932735 * anInt7068) {
				int i_166_ = i + i_145_;
				int i_167_ = i - i_145_;
				if (i_166_ >= -612590951 * anInt7071 && i_167_ <= anInt7069 * -1345107225) {
					i_166_ = Class275.method4890(i_166_, anInt7071 * -612590951, -1345107225 * anInt7069, -2054177516);
					i_167_ = Class275.method4890(i_167_, -612590951 * anInt7071, anInt7069 * -1345107225, 775171014);
					if (i_143_ < i_144_) {
						int i_168_ = (i_147_ < i_143_ ? Class5.anIntArray36[i_143_] : i_147_);
						int i_169_ = Class275.method4890(i + i_168_, -612590951 * anInt7071, anInt7069 * -1345107225, -1818774359);
						int i_170_ = Class275.method4890(i - i_168_, -612590951 * anInt7071, -1345107225 * anInt7069, -1162192604);
						if (i_165_ <= anInt7068 * -348932735) {
							int[] is = anIntArrayArray7072[i_165_];
							Class232.method3922(is, i_167_, i_170_, i_141_, (byte) 61);
							Class232.method3922(is, i_170_, i_169_, i_140_, (byte) 78);
							Class232.method3922(is, i_169_, i_166_, i_141_, (byte) 12);
						}
						if (i_164_ >= 324226563 * anInt7070) {
							int[] is = anIntArrayArray7072[i_164_];
							Class232.method3922(is, i_167_, i_170_, i_141_, (byte) 54);
							Class232.method3922(is, i_170_, i_169_, i_140_, (byte) 8);
							Class232.method3922(is, i_169_, i_166_, i_141_, (byte) 119);
						}
					} else {
						if (i_165_ <= -348932735 * anInt7068)
							Class232.method3922(anIntArrayArray7072[i_165_], i_167_, i_166_, i_141_, (byte) -45);
						if (i_164_ >= 324226563 * anInt7070)
							Class232.method3922(anIntArrayArray7072[i_164_], i_167_, i_166_, i_141_, (byte) 24);
					}
				}
			}
		}
	}

	static final void method12891(int i, int i_171_, int i_172_, int i_173_) {
		int i_174_ = 0;
		int i_175_ = i_172_;
		int i_176_ = -i_172_;
		int i_177_ = -1;
		Class232.method3922(anIntArrayArray7072[i_171_], i - i_172_, i_172_ + i, i_173_, (byte) -15);
		while (i_175_ > i_174_) {
			i_177_ += 2;
			i_176_ += i_177_;
			i_174_++;
			if (i_176_ >= 0) {
				i_175_--;
				i_176_ -= i_175_ << 1;
				int[] is = anIntArrayArray7072[i_175_ + i_171_];
				int[] is_178_ = anIntArrayArray7072[i_171_ - i_175_];
				int i_179_ = i_174_ + i;
				int i_180_ = i - i_174_;
				Class232.method3922(is, i_180_, i_179_, i_173_, (byte) -2);
				Class232.method3922(is_178_, i_180_, i_179_, i_173_, (byte) -74);
			}
			int i_181_ = i_175_ + i;
			int i_182_ = i - i_175_;
			int[] is = anIntArrayArray7072[i_174_ + i_171_];
			int[] is_183_ = anIntArrayArray7072[i_171_ - i_174_];
			Class232.method3922(is, i_182_, i_181_, i_173_, (byte) 92);
			Class232.method3922(is_183_, i_182_, i_181_, i_173_, (byte) -15);
		}
	}

	static final void method12892(int i, int i_184_, int i_185_, int i_186_) {
		int i_187_ = 0;
		int i_188_ = i_185_;
		int i_189_ = -i_185_;
		int i_190_ = -1;
		Class232.method3922(anIntArrayArray7072[i_184_], i - i_185_, i_185_ + i, i_186_, (byte) 87);
		while (i_188_ > i_187_) {
			i_190_ += 2;
			i_189_ += i_190_;
			i_187_++;
			if (i_189_ >= 0) {
				i_188_--;
				i_189_ -= i_188_ << 1;
				int[] is = anIntArrayArray7072[i_188_ + i_184_];
				int[] is_191_ = anIntArrayArray7072[i_184_ - i_188_];
				int i_192_ = i_187_ + i;
				int i_193_ = i - i_187_;
				Class232.method3922(is, i_193_, i_192_, i_186_, (byte) 46);
				Class232.method3922(is_191_, i_193_, i_192_, i_186_, (byte) 44);
			}
			int i_194_ = i_188_ + i;
			int i_195_ = i - i_188_;
			int[] is = anIntArrayArray7072[i_187_ + i_184_];
			int[] is_196_ = anIntArrayArray7072[i_184_ - i_187_];
			Class232.method3922(is, i_195_, i_194_, i_186_, (byte) -91);
			Class232.method3922(is_196_, i_195_, i_194_, i_186_, (byte) 40);
		}
	}

	static void method12893(int i) {
		if (Class5.anIntArray36 == null || Class5.anIntArray36.length < i)
			Class5.anIntArray36 = new int[i];
	}

	static final void method12894(int i, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_) {
		Class426.method7170(i_198_, 377314002);
		int i_202_ = 0;
		int i_203_ = i_198_ - i_201_;
		if (i_203_ < 0)
			i_203_ = 0;
		int i_204_ = i_198_;
		int i_205_ = -i_198_;
		int i_206_ = i_203_;
		int i_207_ = -i_203_;
		int i_208_ = -1;
		int i_209_ = -1;
		if (i_197_ >= anInt7070 * 324226563 && i_197_ <= anInt7068 * -348932735) {
			int[] is = anIntArrayArray7072[i_197_];
			int i_210_ = Class275.method4890(i - i_198_, anInt7071 * -612590951, -1345107225 * anInt7069, 1165098796);
			int i_211_ = Class275.method4890(i_198_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, -1847184388);
			int i_212_ = Class275.method4890(i - i_203_, -612590951 * anInt7071, -1345107225 * anInt7069, -313060571);
			int i_213_ = Class275.method4890(i_203_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, 1719813702);
			Class232.method3922(is, i_210_, i_212_, i_200_, (byte) 59);
			Class232.method3922(is, i_212_, i_213_, i_199_, (byte) 18);
			Class232.method3922(is, i_213_, i_211_, i_200_, (byte) -36);
		}
		while (i_204_ > i_202_) {
			i_208_ += 2;
			i_209_ += 2;
			i_205_ += i_208_;
			i_207_ += i_209_;
			if (i_207_ >= 0 && i_206_ >= 1) {
				i_206_--;
				i_207_ -= i_206_ << 1;
				Class5.anIntArray36[i_206_] = i_202_;
			}
			i_202_++;
			if (i_205_ >= 0) {
				i_204_--;
				i_205_ -= i_204_ << 1;
				int i_214_ = i_197_ - i_204_;
				int i_215_ = i_204_ + i_197_;
				if (i_215_ >= 324226563 * anInt7070 && i_214_ <= -348932735 * anInt7068) {
					if (i_204_ >= i_203_) {
						int i_216_ = Class275.method4890(i_202_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, 828856057);
						int i_217_ = Class275.method4890(i - i_202_, anInt7071 * -612590951, anInt7069 * -1345107225, 12086893);
						if (i_215_ <= -348932735 * anInt7068)
							Class232.method3922(anIntArrayArray7072[i_215_], i_217_, i_216_, i_200_, (byte) -7);
						if (i_214_ >= anInt7070 * 324226563)
							Class232.method3922(anIntArrayArray7072[i_214_], i_217_, i_216_, i_200_, (byte) 44);
					} else {
						int i_218_ = Class5.anIntArray36[i_204_];
						int i_219_ = Class275.method4890(i + i_202_, anInt7071 * -612590951, -1345107225 * anInt7069, 21301654);
						int i_220_ = Class275.method4890(i - i_202_, anInt7071 * -612590951, -1345107225 * anInt7069, -805845479);
						int i_221_ = Class275.method4890(i + i_218_, anInt7071 * -612590951, anInt7069 * -1345107225, -929015560);
						int i_222_ = Class275.method4890(i - i_218_, anInt7071 * -612590951, -1345107225 * anInt7069, 2040329547);
						if (i_215_ <= -348932735 * anInt7068) {
							int[] is = anIntArrayArray7072[i_215_];
							Class232.method3922(is, i_220_, i_222_, i_200_, (byte) -9);
							Class232.method3922(is, i_222_, i_221_, i_199_, (byte) 53);
							Class232.method3922(is, i_221_, i_219_, i_200_, (byte) 55);
						}
						if (i_214_ >= anInt7070 * 324226563) {
							int[] is = anIntArrayArray7072[i_214_];
							Class232.method3922(is, i_220_, i_222_, i_200_, (byte) 18);
							Class232.method3922(is, i_222_, i_221_, i_199_, (byte) 2);
							Class232.method3922(is, i_221_, i_219_, i_200_, (byte) 50);
						}
					}
				}
			}
			int i_223_ = i_197_ - i_202_;
			int i_224_ = i_197_ + i_202_;
			if (i_224_ >= anInt7070 * 324226563 && i_223_ <= -348932735 * anInt7068) {
				int i_225_ = i + i_204_;
				int i_226_ = i - i_204_;
				if (i_225_ >= -612590951 * anInt7071 && i_226_ <= anInt7069 * -1345107225) {
					i_225_ = Class275.method4890(i_225_, anInt7071 * -612590951, -1345107225 * anInt7069, 2097686007);
					i_226_ = Class275.method4890(i_226_, -612590951 * anInt7071, anInt7069 * -1345107225, 1496883878);
					if (i_202_ < i_203_) {
						int i_227_ = (i_206_ < i_202_ ? Class5.anIntArray36[i_202_] : i_206_);
						int i_228_ = Class275.method4890(i + i_227_, -612590951 * anInt7071, anInt7069 * -1345107225, 1496397077);
						int i_229_ = Class275.method4890(i - i_227_, -612590951 * anInt7071, -1345107225 * anInt7069, -1498769210);
						if (i_224_ <= anInt7068 * -348932735) {
							int[] is = anIntArrayArray7072[i_224_];
							Class232.method3922(is, i_226_, i_229_, i_200_, (byte) 34);
							Class232.method3922(is, i_229_, i_228_, i_199_, (byte) -80);
							Class232.method3922(is, i_228_, i_225_, i_200_, (byte) -55);
						}
						if (i_223_ >= 324226563 * anInt7070) {
							int[] is = anIntArrayArray7072[i_223_];
							Class232.method3922(is, i_226_, i_229_, i_200_, (byte) -91);
							Class232.method3922(is, i_229_, i_228_, i_199_, (byte) 23);
							Class232.method3922(is, i_228_, i_225_, i_200_, (byte) 69);
						}
					} else {
						if (i_224_ <= -348932735 * anInt7068)
							Class232.method3922(anIntArrayArray7072[i_224_], i_226_, i_225_, i_200_, (byte) -14);
						if (i_223_ >= 324226563 * anInt7070)
							Class232.method3922(anIntArrayArray7072[i_223_], i_226_, i_225_, i_200_, (byte) 24);
					}
				}
			}
		}
	}

	static void method12895(int i) {
		if (Class5.anIntArray36 == null || Class5.anIntArray36.length < i)
			Class5.anIntArray36 = new int[i];
	}
}
