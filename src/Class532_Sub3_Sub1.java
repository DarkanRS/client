/* Class532_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class532_Sub3_Sub1 extends Class532_Sub3 {
	static void method14922(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = 0;
		int i_5_ = i_2_;
		int i_6_ = i_1_ * i_1_;
		int i_7_ = i_2_ * i_2_;
		int i_8_ = i_7_ << 1;
		int i_9_ = i_6_ << 1;
		int i_10_ = i_2_ << 1;
		int i_11_ = (1 - i_10_) * i_6_ + i_8_;
		int i_12_ = i_7_ - i_9_ * (i_10_ - 1);
		int i_13_ = i_6_ << 2;
		int i_14_ = i_7_ << 2;
		int i_15_ = i_8_ * (3 + (i_4_ << 1));
		int i_16_ = i_9_ * ((i_5_ << 1) - 3);
		int i_17_ = i_14_ * (1 + i_4_);
		int i_18_ = i_13_ * (i_5_ - 1);
		Class232.method3922(anIntArrayArray7072[i_0_], i - i_1_, i_1_ + i, i_3_, (byte) 6);
		while (i_5_ > 0) {
			if (i_11_ < 0) {
				while (i_11_ < 0) {
					i_11_ += i_15_;
					i_12_ += i_17_;
					i_15_ += i_14_;
					i_17_ += i_14_;
					i_4_++;
				}
			}
			if (i_12_ < 0) {
				i_11_ += i_15_;
				i_12_ += i_17_;
				i_15_ += i_14_;
				i_17_ += i_14_;
				i_4_++;
			}
			i_11_ += -i_18_;
			i_12_ += -i_16_;
			i_16_ -= i_13_;
			i_18_ -= i_13_;
			i_5_--;
			int i_19_ = i_0_ - i_5_;
			int i_20_ = i_0_ + i_5_;
			int i_21_ = i + i_4_;
			int i_22_ = i - i_4_;
			Class232.method3922(anIntArrayArray7072[i_19_], i_22_, i_21_, i_3_, (byte) 13);
			Class232.method3922(anIntArrayArray7072[i_20_], i_22_, i_21_, i_3_, (byte) -18);
		}
	}

	public static void method14923(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		if (i_25_ == i_24_)
			Class532_Sub1.method12838(i, i_23_, i_24_, i_26_, i_27_, i_28_, (short) 4096);
		else if (i - i_24_ >= anInt7071 * -612590951 && i + i_24_ <= anInt7069 * -1345107225 && i_23_ - i_25_ >= 324226563 * anInt7070 && i_23_ + i_25_ <= anInt7068 * -348932735)
			Class282_Sub20_Sub7.method15241(i, i_23_, i_24_, i_25_, i_26_, i_27_, i_28_, (byte) 88);
		else
			Class405.method6824(i, i_23_, i_24_, i_25_, i_26_, i_27_, i_28_, -424326901);
	}

	static void method14924(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		int i_35_ = 0;
		int i_36_ = i_31_;
		int i_37_ = 0;
		int i_38_ = i_30_ - i_34_;
		int i_39_ = i_31_ - i_34_;
		int i_40_ = i_30_ * i_30_;
		int i_41_ = i_31_ * i_31_;
		int i_42_ = i_38_ * i_38_;
		int i_43_ = i_39_ * i_39_;
		int i_44_ = i_41_ << 1;
		int i_45_ = i_40_ << 1;
		int i_46_ = i_43_ << 1;
		int i_47_ = i_42_ << 1;
		int i_48_ = i_31_ << 1;
		int i_49_ = i_39_ << 1;
		int i_50_ = (1 - i_48_) * i_40_ + i_44_;
		int i_51_ = i_41_ - i_45_ * (i_48_ - 1);
		int i_52_ = i_46_ + i_42_ * (1 - i_49_);
		int i_53_ = i_43_ - i_47_ * (i_49_ - 1);
		int i_54_ = i_40_ << 2;
		int i_55_ = i_41_ << 2;
		int i_56_ = i_42_ << 2;
		int i_57_ = i_43_ << 2;
		int i_58_ = 3 * i_44_;
		int i_59_ = i_45_ * (i_48_ - 3);
		int i_60_ = i_46_ * 3;
		int i_61_ = (i_49_ - 3) * i_47_;
		int i_62_ = i_55_;
		int i_63_ = (i_31_ - 1) * i_54_;
		int i_64_ = i_57_;
		int i_65_ = (i_39_ - 1) * i_56_;
		if (i_29_ >= 324226563 * anInt7070 && i_29_ <= -348932735 * anInt7068) {
			int[] is = anIntArrayArray7072[i_29_];
			int i_66_ = Class275.method4890(i - i_30_, anInt7071 * -612590951, -1345107225 * anInt7069, 829504877);
			int i_67_ = Class275.method4890(i + i_30_, anInt7071 * -612590951, -1345107225 * anInt7069, 2136379817);
			int i_68_ = Class275.method4890(i - i_38_, anInt7071 * -612590951, -1345107225 * anInt7069, -1817912087);
			int i_69_ = Class275.method4890(i + i_38_, -612590951 * anInt7071, anInt7069 * -1345107225, -1440736396);
			Class232.method3922(is, i_66_, i_68_, i_33_, (byte) 4);
			Class232.method3922(is, i_68_, i_69_, i_32_, (byte) 51);
			Class232.method3922(is, i_69_, i_67_, i_33_, (byte) -111);
		}
		while (i_36_ > 0) {
			boolean bool = i_36_ <= i_39_;
			if (bool) {
				if (i_52_ < 0) {
					while (i_52_ < 0) {
						i_52_ += i_60_;
						i_53_ += i_64_;
						i_60_ += i_57_;
						i_64_ += i_57_;
						i_37_++;
					}
				}
				if (i_53_ < 0) {
					i_52_ += i_60_;
					i_53_ += i_64_;
					i_60_ += i_57_;
					i_64_ += i_57_;
					i_37_++;
				}
				i_52_ += -i_65_;
				i_53_ += -i_61_;
				i_61_ -= i_56_;
				i_65_ -= i_56_;
			}
			if (i_50_ < 0) {
				while (i_50_ < 0) {
					i_50_ += i_58_;
					i_51_ += i_62_;
					i_58_ += i_55_;
					i_62_ += i_55_;
					i_35_++;
				}
			}
			if (i_51_ < 0) {
				i_50_ += i_58_;
				i_51_ += i_62_;
				i_58_ += i_55_;
				i_62_ += i_55_;
				i_35_++;
			}
			i_50_ += -i_63_;
			i_51_ += -i_59_;
			i_59_ -= i_54_;
			i_63_ -= i_54_;
			i_36_--;
			int i_70_ = i_29_ - i_36_;
			int i_71_ = i_29_ + i_36_;
			if (i_71_ >= 324226563 * anInt7070 && i_70_ <= -348932735 * anInt7068) {
				int i_72_ = Class275.method4890(i + i_35_, -612590951 * anInt7071, -1345107225 * anInt7069, -1240576898);
				int i_73_ = Class275.method4890(i - i_35_, anInt7071 * -612590951, anInt7069 * -1345107225, -1640766852);
				if (bool) {
					int i_74_ = Class275.method4890(i_37_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, 1030824654);
					int i_75_ = Class275.method4890(i - i_37_, anInt7071 * -612590951, anInt7069 * -1345107225, 574289624);
					if (i_70_ >= 324226563 * anInt7070) {
						int[] is = anIntArrayArray7072[i_70_];
						Class232.method3922(is, i_73_, i_75_, i_33_, (byte) -26);
						Class232.method3922(is, i_75_, i_74_, i_32_, (byte) 96);
						Class232.method3922(is, i_74_, i_72_, i_33_, (byte) -104);
					}
					if (i_71_ <= anInt7068 * -348932735) {
						int[] is = anIntArrayArray7072[i_71_];
						Class232.method3922(is, i_73_, i_75_, i_33_, (byte) 36);
						Class232.method3922(is, i_75_, i_74_, i_32_, (byte) -22);
						Class232.method3922(is, i_74_, i_72_, i_33_, (byte) 6);
					}
				} else {
					if (i_70_ >= anInt7070 * 324226563)
						Class232.method3922(anIntArrayArray7072[i_70_], i_73_, i_72_, i_33_, (byte) -36);
					if (i_71_ <= anInt7068 * -348932735)
						Class232.method3922(anIntArrayArray7072[i_71_], i_73_, i_72_, i_33_, (byte) -19);
				}
			}
		}
	}

	static void method14925(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
		int i_82_ = 0;
		int i_83_ = i_78_;
		int i_84_ = 0;
		int i_85_ = i_77_ - i_81_;
		int i_86_ = i_78_ - i_81_;
		int i_87_ = i_77_ * i_77_;
		int i_88_ = i_78_ * i_78_;
		int i_89_ = i_85_ * i_85_;
		int i_90_ = i_86_ * i_86_;
		int i_91_ = i_88_ << 1;
		int i_92_ = i_87_ << 1;
		int i_93_ = i_90_ << 1;
		int i_94_ = i_89_ << 1;
		int i_95_ = i_78_ << 1;
		int i_96_ = i_86_ << 1;
		int i_97_ = (1 - i_95_) * i_87_ + i_91_;
		int i_98_ = i_88_ - i_92_ * (i_95_ - 1);
		int i_99_ = i_93_ + i_89_ * (1 - i_96_);
		int i_100_ = i_90_ - i_94_ * (i_96_ - 1);
		int i_101_ = i_87_ << 2;
		int i_102_ = i_88_ << 2;
		int i_103_ = i_89_ << 2;
		int i_104_ = i_90_ << 2;
		int i_105_ = 3 * i_91_;
		int i_106_ = i_92_ * (i_95_ - 3);
		int i_107_ = i_93_ * 3;
		int i_108_ = (i_96_ - 3) * i_94_;
		int i_109_ = i_102_;
		int i_110_ = (i_78_ - 1) * i_101_;
		int i_111_ = i_104_;
		int i_112_ = (i_86_ - 1) * i_103_;
		if (i_76_ >= 324226563 * anInt7070 && i_76_ <= -348932735 * anInt7068) {
			int[] is = anIntArrayArray7072[i_76_];
			int i_113_ = Class275.method4890(i - i_77_, anInt7071 * -612590951, -1345107225 * anInt7069, -83554959);
			int i_114_ = Class275.method4890(i + i_77_, anInt7071 * -612590951, -1345107225 * anInt7069, -201774978);
			int i_115_ = Class275.method4890(i - i_85_, anInt7071 * -612590951, -1345107225 * anInt7069, -164088947);
			int i_116_ = Class275.method4890(i + i_85_, -612590951 * anInt7071, anInt7069 * -1345107225, 1389703441);
			Class232.method3922(is, i_113_, i_115_, i_80_, (byte) -19);
			Class232.method3922(is, i_115_, i_116_, i_79_, (byte) 14);
			Class232.method3922(is, i_116_, i_114_, i_80_, (byte) 29);
		}
		while (i_83_ > 0) {
			boolean bool = i_83_ <= i_86_;
			if (bool) {
				if (i_99_ < 0) {
					while (i_99_ < 0) {
						i_99_ += i_107_;
						i_100_ += i_111_;
						i_107_ += i_104_;
						i_111_ += i_104_;
						i_84_++;
					}
				}
				if (i_100_ < 0) {
					i_99_ += i_107_;
					i_100_ += i_111_;
					i_107_ += i_104_;
					i_111_ += i_104_;
					i_84_++;
				}
				i_99_ += -i_112_;
				i_100_ += -i_108_;
				i_108_ -= i_103_;
				i_112_ -= i_103_;
			}
			if (i_97_ < 0) {
				while (i_97_ < 0) {
					i_97_ += i_105_;
					i_98_ += i_109_;
					i_105_ += i_102_;
					i_109_ += i_102_;
					i_82_++;
				}
			}
			if (i_98_ < 0) {
				i_97_ += i_105_;
				i_98_ += i_109_;
				i_105_ += i_102_;
				i_109_ += i_102_;
				i_82_++;
			}
			i_97_ += -i_110_;
			i_98_ += -i_106_;
			i_106_ -= i_101_;
			i_110_ -= i_101_;
			i_83_--;
			int i_117_ = i_76_ - i_83_;
			int i_118_ = i_76_ + i_83_;
			if (i_118_ >= 324226563 * anInt7070 && i_117_ <= -348932735 * anInt7068) {
				int i_119_ = Class275.method4890(i + i_82_, -612590951 * anInt7071, -1345107225 * anInt7069, 2046653726);
				int i_120_ = Class275.method4890(i - i_82_, anInt7071 * -612590951, anInt7069 * -1345107225, -2115506891);
				if (bool) {
					int i_121_ = Class275.method4890(i_84_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, 829940597);
					int i_122_ = Class275.method4890(i - i_84_, anInt7071 * -612590951, anInt7069 * -1345107225, 1640931119);
					if (i_117_ >= 324226563 * anInt7070) {
						int[] is = anIntArrayArray7072[i_117_];
						Class232.method3922(is, i_120_, i_122_, i_80_, (byte) -54);
						Class232.method3922(is, i_122_, i_121_, i_79_, (byte) 59);
						Class232.method3922(is, i_121_, i_119_, i_80_, (byte) 59);
					}
					if (i_118_ <= anInt7068 * -348932735) {
						int[] is = anIntArrayArray7072[i_118_];
						Class232.method3922(is, i_120_, i_122_, i_80_, (byte) 25);
						Class232.method3922(is, i_122_, i_121_, i_79_, (byte) 77);
						Class232.method3922(is, i_121_, i_119_, i_80_, (byte) 27);
					}
				} else {
					if (i_117_ >= anInt7070 * 324226563)
						Class232.method3922(anIntArrayArray7072[i_117_], i_120_, i_119_, i_80_, (byte) -92);
					if (i_118_ <= anInt7068 * -348932735)
						Class232.method3922(anIntArrayArray7072[i_118_], i_120_, i_119_, i_80_, (byte) 18);
				}
			}
		}
	}

	static void method14926(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_) {
		int i_129_ = 0;
		int i_130_ = i_125_;
		int i_131_ = 0;
		int i_132_ = i_124_ - i_128_;
		int i_133_ = i_125_ - i_128_;
		int i_134_ = i_124_ * i_124_;
		int i_135_ = i_125_ * i_125_;
		int i_136_ = i_132_ * i_132_;
		int i_137_ = i_133_ * i_133_;
		int i_138_ = i_135_ << 1;
		int i_139_ = i_134_ << 1;
		int i_140_ = i_137_ << 1;
		int i_141_ = i_136_ << 1;
		int i_142_ = i_125_ << 1;
		int i_143_ = i_133_ << 1;
		int i_144_ = (1 - i_142_) * i_134_ + i_138_;
		int i_145_ = i_135_ - (i_142_ - 1) * i_139_;
		int i_146_ = i_140_ + (1 - i_143_) * i_136_;
		int i_147_ = i_137_ - (i_143_ - 1) * i_141_;
		int i_148_ = i_134_ << 2;
		int i_149_ = i_135_ << 2;
		int i_150_ = i_136_ << 2;
		int i_151_ = i_137_ << 2;
		int i_152_ = 3 * i_138_;
		int i_153_ = (i_142_ - 3) * i_139_;
		int i_154_ = i_140_ * 3;
		int i_155_ = (i_143_ - 3) * i_141_;
		int i_156_ = i_149_;
		int i_157_ = i_148_ * (i_125_ - 1);
		int i_158_ = i_151_;
		int i_159_ = i_150_ * (i_133_ - 1);
		int[] is = anIntArrayArray7072[i_123_];
		Class232.method3922(is, i - i_124_, i - i_132_, i_127_, (byte) -12);
		Class232.method3922(is, i - i_132_, i_132_ + i, i_126_, (byte) -99);
		Class232.method3922(is, i + i_132_, i_124_ + i, i_127_, (byte) -115);
		while (i_130_ > 0) {
			boolean bool = i_130_ <= i_133_;
			if (bool) {
				if (i_146_ < 0) {
					while (i_146_ < 0) {
						i_146_ += i_154_;
						i_147_ += i_158_;
						i_154_ += i_151_;
						i_158_ += i_151_;
						i_131_++;
					}
				}
				if (i_147_ < 0) {
					i_146_ += i_154_;
					i_147_ += i_158_;
					i_154_ += i_151_;
					i_158_ += i_151_;
					i_131_++;
				}
				i_146_ += -i_159_;
				i_147_ += -i_155_;
				i_155_ -= i_150_;
				i_159_ -= i_150_;
			}
			if (i_144_ < 0) {
				while (i_144_ < 0) {
					i_144_ += i_152_;
					i_145_ += i_156_;
					i_152_ += i_149_;
					i_156_ += i_149_;
					i_129_++;
				}
			}
			if (i_145_ < 0) {
				i_144_ += i_152_;
				i_145_ += i_156_;
				i_152_ += i_149_;
				i_156_ += i_149_;
				i_129_++;
			}
			i_144_ += -i_157_;
			i_145_ += -i_153_;
			i_153_ -= i_148_;
			i_157_ -= i_148_;
			i_130_--;
			int i_160_ = i_123_ - i_130_;
			int i_161_ = i_123_ + i_130_;
			int i_162_ = i_129_ + i;
			int i_163_ = i - i_129_;
			if (bool) {
				int i_164_ = i + i_131_;
				int i_165_ = i - i_131_;
				Class232.method3922(anIntArrayArray7072[i_160_], i_163_, i_165_, i_127_, (byte) -59);
				Class232.method3922(anIntArrayArray7072[i_160_], i_165_, i_164_, i_126_, (byte) 52);
				Class232.method3922(anIntArrayArray7072[i_160_], i_164_, i_162_, i_127_, (byte) 19);
				Class232.method3922(anIntArrayArray7072[i_161_], i_163_, i_165_, i_127_, (byte) 25);
				Class232.method3922(anIntArrayArray7072[i_161_], i_165_, i_164_, i_126_, (byte) 107);
				Class232.method3922(anIntArrayArray7072[i_161_], i_164_, i_162_, i_127_, (byte) -4);
			} else {
				Class232.method3922(anIntArrayArray7072[i_160_], i_163_, i_162_, i_127_, (byte) -82);
				Class232.method3922(anIntArrayArray7072[i_161_], i_163_, i_162_, i_127_, (byte) -19);
			}
		}
	}

	static void method14927(int i, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_) {
		int i_172_ = 0;
		int i_173_ = i_168_;
		int i_174_ = 0;
		int i_175_ = i_167_ - i_171_;
		int i_176_ = i_168_ - i_171_;
		int i_177_ = i_167_ * i_167_;
		int i_178_ = i_168_ * i_168_;
		int i_179_ = i_175_ * i_175_;
		int i_180_ = i_176_ * i_176_;
		int i_181_ = i_178_ << 1;
		int i_182_ = i_177_ << 1;
		int i_183_ = i_180_ << 1;
		int i_184_ = i_179_ << 1;
		int i_185_ = i_168_ << 1;
		int i_186_ = i_176_ << 1;
		int i_187_ = (1 - i_185_) * i_177_ + i_181_;
		int i_188_ = i_178_ - i_182_ * (i_185_ - 1);
		int i_189_ = i_183_ + i_179_ * (1 - i_186_);
		int i_190_ = i_180_ - i_184_ * (i_186_ - 1);
		int i_191_ = i_177_ << 2;
		int i_192_ = i_178_ << 2;
		int i_193_ = i_179_ << 2;
		int i_194_ = i_180_ << 2;
		int i_195_ = 3 * i_181_;
		int i_196_ = i_182_ * (i_185_ - 3);
		int i_197_ = i_183_ * 3;
		int i_198_ = (i_186_ - 3) * i_184_;
		int i_199_ = i_192_;
		int i_200_ = (i_168_ - 1) * i_191_;
		int i_201_ = i_194_;
		int i_202_ = (i_176_ - 1) * i_193_;
		if (i_166_ >= 324226563 * anInt7070 && i_166_ <= -348932735 * anInt7068) {
			int[] is = anIntArrayArray7072[i_166_];
			int i_203_ = Class275.method4890(i - i_167_, anInt7071 * -612590951, -1345107225 * anInt7069, 1576759831);
			int i_204_ = Class275.method4890(i + i_167_, anInt7071 * -612590951, -1345107225 * anInt7069, 1729265309);
			int i_205_ = Class275.method4890(i - i_175_, anInt7071 * -612590951, -1345107225 * anInt7069, -476806859);
			int i_206_ = Class275.method4890(i + i_175_, -612590951 * anInt7071, anInt7069 * -1345107225, -570056914);
			Class232.method3922(is, i_203_, i_205_, i_170_, (byte) 4);
			Class232.method3922(is, i_205_, i_206_, i_169_, (byte) -41);
			Class232.method3922(is, i_206_, i_204_, i_170_, (byte) 34);
		}
		while (i_173_ > 0) {
			boolean bool = i_173_ <= i_176_;
			if (bool) {
				if (i_189_ < 0) {
					while (i_189_ < 0) {
						i_189_ += i_197_;
						i_190_ += i_201_;
						i_197_ += i_194_;
						i_201_ += i_194_;
						i_174_++;
					}
				}
				if (i_190_ < 0) {
					i_189_ += i_197_;
					i_190_ += i_201_;
					i_197_ += i_194_;
					i_201_ += i_194_;
					i_174_++;
				}
				i_189_ += -i_202_;
				i_190_ += -i_198_;
				i_198_ -= i_193_;
				i_202_ -= i_193_;
			}
			if (i_187_ < 0) {
				while (i_187_ < 0) {
					i_187_ += i_195_;
					i_188_ += i_199_;
					i_195_ += i_192_;
					i_199_ += i_192_;
					i_172_++;
				}
			}
			if (i_188_ < 0) {
				i_187_ += i_195_;
				i_188_ += i_199_;
				i_195_ += i_192_;
				i_199_ += i_192_;
				i_172_++;
			}
			i_187_ += -i_200_;
			i_188_ += -i_196_;
			i_196_ -= i_191_;
			i_200_ -= i_191_;
			i_173_--;
			int i_207_ = i_166_ - i_173_;
			int i_208_ = i_166_ + i_173_;
			if (i_208_ >= 324226563 * anInt7070 && i_207_ <= -348932735 * anInt7068) {
				int i_209_ = Class275.method4890(i + i_172_, -612590951 * anInt7071, -1345107225 * anInt7069, -1448670299);
				int i_210_ = Class275.method4890(i - i_172_, anInt7071 * -612590951, anInt7069 * -1345107225, 794589486);
				if (bool) {
					int i_211_ = Class275.method4890(i_174_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, -68630042);
					int i_212_ = Class275.method4890(i - i_174_, anInt7071 * -612590951, anInt7069 * -1345107225, 1927452651);
					if (i_207_ >= 324226563 * anInt7070) {
						int[] is = anIntArrayArray7072[i_207_];
						Class232.method3922(is, i_210_, i_212_, i_170_, (byte) 106);
						Class232.method3922(is, i_212_, i_211_, i_169_, (byte) 5);
						Class232.method3922(is, i_211_, i_209_, i_170_, (byte) 0);
					}
					if (i_208_ <= anInt7068 * -348932735) {
						int[] is = anIntArrayArray7072[i_208_];
						Class232.method3922(is, i_210_, i_212_, i_170_, (byte) -80);
						Class232.method3922(is, i_212_, i_211_, i_169_, (byte) 7);
						Class232.method3922(is, i_211_, i_209_, i_170_, (byte) -13);
					}
				} else {
					if (i_207_ >= anInt7070 * 324226563)
						Class232.method3922(anIntArrayArray7072[i_207_], i_210_, i_209_, i_170_, (byte) 7);
					if (i_208_ <= anInt7068 * -348932735)
						Class232.method3922(anIntArrayArray7072[i_208_], i_210_, i_209_, i_170_, (byte) -92);
				}
			}
		}
	}

	Class532_Sub3_Sub1() throws Throwable {
		throw new Error();
	}

	static void method14928(int i, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_) {
		int i_219_ = 0;
		int i_220_ = i_215_;
		int i_221_ = 0;
		int i_222_ = i_214_ - i_218_;
		int i_223_ = i_215_ - i_218_;
		int i_224_ = i_214_ * i_214_;
		int i_225_ = i_215_ * i_215_;
		int i_226_ = i_222_ * i_222_;
		int i_227_ = i_223_ * i_223_;
		int i_228_ = i_225_ << 1;
		int i_229_ = i_224_ << 1;
		int i_230_ = i_227_ << 1;
		int i_231_ = i_226_ << 1;
		int i_232_ = i_215_ << 1;
		int i_233_ = i_223_ << 1;
		int i_234_ = (1 - i_232_) * i_224_ + i_228_;
		int i_235_ = i_225_ - i_229_ * (i_232_ - 1);
		int i_236_ = i_230_ + i_226_ * (1 - i_233_);
		int i_237_ = i_227_ - i_231_ * (i_233_ - 1);
		int i_238_ = i_224_ << 2;
		int i_239_ = i_225_ << 2;
		int i_240_ = i_226_ << 2;
		int i_241_ = i_227_ << 2;
		int i_242_ = 3 * i_228_;
		int i_243_ = i_229_ * (i_232_ - 3);
		int i_244_ = i_230_ * 3;
		int i_245_ = (i_233_ - 3) * i_231_;
		int i_246_ = i_239_;
		int i_247_ = (i_215_ - 1) * i_238_;
		int i_248_ = i_241_;
		int i_249_ = (i_223_ - 1) * i_240_;
		if (i_213_ >= 324226563 * anInt7070 && i_213_ <= -348932735 * anInt7068) {
			int[] is = anIntArrayArray7072[i_213_];
			int i_250_ = Class275.method4890(i - i_214_, anInt7071 * -612590951, -1345107225 * anInt7069, -134454753);
			int i_251_ = Class275.method4890(i + i_214_, anInt7071 * -612590951, -1345107225 * anInt7069, 1152132681);
			int i_252_ = Class275.method4890(i - i_222_, anInt7071 * -612590951, -1345107225 * anInt7069, -693146185);
			int i_253_ = Class275.method4890(i + i_222_, -612590951 * anInt7071, anInt7069 * -1345107225, -341595613);
			Class232.method3922(is, i_250_, i_252_, i_217_, (byte) 12);
			Class232.method3922(is, i_252_, i_253_, i_216_, (byte) -22);
			Class232.method3922(is, i_253_, i_251_, i_217_, (byte) -99);
		}
		while (i_220_ > 0) {
			boolean bool = i_220_ <= i_223_;
			if (bool) {
				if (i_236_ < 0) {
					while (i_236_ < 0) {
						i_236_ += i_244_;
						i_237_ += i_248_;
						i_244_ += i_241_;
						i_248_ += i_241_;
						i_221_++;
					}
				}
				if (i_237_ < 0) {
					i_236_ += i_244_;
					i_237_ += i_248_;
					i_244_ += i_241_;
					i_248_ += i_241_;
					i_221_++;
				}
				i_236_ += -i_249_;
				i_237_ += -i_245_;
				i_245_ -= i_240_;
				i_249_ -= i_240_;
			}
			if (i_234_ < 0) {
				while (i_234_ < 0) {
					i_234_ += i_242_;
					i_235_ += i_246_;
					i_242_ += i_239_;
					i_246_ += i_239_;
					i_219_++;
				}
			}
			if (i_235_ < 0) {
				i_234_ += i_242_;
				i_235_ += i_246_;
				i_242_ += i_239_;
				i_246_ += i_239_;
				i_219_++;
			}
			i_234_ += -i_247_;
			i_235_ += -i_243_;
			i_243_ -= i_238_;
			i_247_ -= i_238_;
			i_220_--;
			int i_254_ = i_213_ - i_220_;
			int i_255_ = i_213_ + i_220_;
			if (i_255_ >= 324226563 * anInt7070 && i_254_ <= -348932735 * anInt7068) {
				int i_256_ = Class275.method4890(i + i_219_, -612590951 * anInt7071, -1345107225 * anInt7069, 1149665206);
				int i_257_ = Class275.method4890(i - i_219_, anInt7071 * -612590951, anInt7069 * -1345107225, -2091865344);
				if (bool) {
					int i_258_ = Class275.method4890(i_221_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, -1037443265);
					int i_259_ = Class275.method4890(i - i_221_, anInt7071 * -612590951, anInt7069 * -1345107225, -208812261);
					if (i_254_ >= 324226563 * anInt7070) {
						int[] is = anIntArrayArray7072[i_254_];
						Class232.method3922(is, i_257_, i_259_, i_217_, (byte) -62);
						Class232.method3922(is, i_259_, i_258_, i_216_, (byte) 34);
						Class232.method3922(is, i_258_, i_256_, i_217_, (byte) 8);
					}
					if (i_255_ <= anInt7068 * -348932735) {
						int[] is = anIntArrayArray7072[i_255_];
						Class232.method3922(is, i_257_, i_259_, i_217_, (byte) 93);
						Class232.method3922(is, i_259_, i_258_, i_216_, (byte) 69);
						Class232.method3922(is, i_258_, i_256_, i_217_, (byte) -43);
					}
				} else {
					if (i_254_ >= anInt7070 * 324226563)
						Class232.method3922(anIntArrayArray7072[i_254_], i_257_, i_256_, i_217_, (byte) 38);
					if (i_255_ <= anInt7068 * -348932735)
						Class232.method3922(anIntArrayArray7072[i_255_], i_257_, i_256_, i_217_, (byte) -67);
				}
			}
		}
	}

	static void method14929(int i, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_, int i_265_) {
		int i_266_ = 0;
		int i_267_ = i_262_;
		int i_268_ = 0;
		int i_269_ = i_261_ - i_265_;
		int i_270_ = i_262_ - i_265_;
		int i_271_ = i_261_ * i_261_;
		int i_272_ = i_262_ * i_262_;
		int i_273_ = i_269_ * i_269_;
		int i_274_ = i_270_ * i_270_;
		int i_275_ = i_272_ << 1;
		int i_276_ = i_271_ << 1;
		int i_277_ = i_274_ << 1;
		int i_278_ = i_273_ << 1;
		int i_279_ = i_262_ << 1;
		int i_280_ = i_270_ << 1;
		int i_281_ = (1 - i_279_) * i_271_ + i_275_;
		int i_282_ = i_272_ - i_276_ * (i_279_ - 1);
		int i_283_ = i_277_ + i_273_ * (1 - i_280_);
		int i_284_ = i_274_ - i_278_ * (i_280_ - 1);
		int i_285_ = i_271_ << 2;
		int i_286_ = i_272_ << 2;
		int i_287_ = i_273_ << 2;
		int i_288_ = i_274_ << 2;
		int i_289_ = 3 * i_275_;
		int i_290_ = i_276_ * (i_279_ - 3);
		int i_291_ = i_277_ * 3;
		int i_292_ = (i_280_ - 3) * i_278_;
		int i_293_ = i_286_;
		int i_294_ = (i_262_ - 1) * i_285_;
		int i_295_ = i_288_;
		int i_296_ = (i_270_ - 1) * i_287_;
		if (i_260_ >= 324226563 * anInt7070 && i_260_ <= -348932735 * anInt7068) {
			int[] is = anIntArrayArray7072[i_260_];
			int i_297_ = Class275.method4890(i - i_261_, anInt7071 * -612590951, -1345107225 * anInt7069, -1808748810);
			int i_298_ = Class275.method4890(i + i_261_, anInt7071 * -612590951, -1345107225 * anInt7069, 144737521);
			int i_299_ = Class275.method4890(i - i_269_, anInt7071 * -612590951, -1345107225 * anInt7069, 2046691271);
			int i_300_ = Class275.method4890(i + i_269_, -612590951 * anInt7071, anInt7069 * -1345107225, 1693807254);
			Class232.method3922(is, i_297_, i_299_, i_264_, (byte) 1);
			Class232.method3922(is, i_299_, i_300_, i_263_, (byte) -89);
			Class232.method3922(is, i_300_, i_298_, i_264_, (byte) -50);
		}
		while (i_267_ > 0) {
			boolean bool = i_267_ <= i_270_;
			if (bool) {
				if (i_283_ < 0) {
					while (i_283_ < 0) {
						i_283_ += i_291_;
						i_284_ += i_295_;
						i_291_ += i_288_;
						i_295_ += i_288_;
						i_268_++;
					}
				}
				if (i_284_ < 0) {
					i_283_ += i_291_;
					i_284_ += i_295_;
					i_291_ += i_288_;
					i_295_ += i_288_;
					i_268_++;
				}
				i_283_ += -i_296_;
				i_284_ += -i_292_;
				i_292_ -= i_287_;
				i_296_ -= i_287_;
			}
			if (i_281_ < 0) {
				while (i_281_ < 0) {
					i_281_ += i_289_;
					i_282_ += i_293_;
					i_289_ += i_286_;
					i_293_ += i_286_;
					i_266_++;
				}
			}
			if (i_282_ < 0) {
				i_281_ += i_289_;
				i_282_ += i_293_;
				i_289_ += i_286_;
				i_293_ += i_286_;
				i_266_++;
			}
			i_281_ += -i_294_;
			i_282_ += -i_290_;
			i_290_ -= i_285_;
			i_294_ -= i_285_;
			i_267_--;
			int i_301_ = i_260_ - i_267_;
			int i_302_ = i_260_ + i_267_;
			if (i_302_ >= 324226563 * anInt7070 && i_301_ <= -348932735 * anInt7068) {
				int i_303_ = Class275.method4890(i + i_266_, -612590951 * anInt7071, -1345107225 * anInt7069, 723710144);
				int i_304_ = Class275.method4890(i - i_266_, anInt7071 * -612590951, anInt7069 * -1345107225, -268637694);
				if (bool) {
					int i_305_ = Class275.method4890(i_268_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, 1301677018);
					int i_306_ = Class275.method4890(i - i_268_, anInt7071 * -612590951, anInt7069 * -1345107225, 225299043);
					if (i_301_ >= 324226563 * anInt7070) {
						int[] is = anIntArrayArray7072[i_301_];
						Class232.method3922(is, i_304_, i_306_, i_264_, (byte) 28);
						Class232.method3922(is, i_306_, i_305_, i_263_, (byte) 6);
						Class232.method3922(is, i_305_, i_303_, i_264_, (byte) -72);
					}
					if (i_302_ <= anInt7068 * -348932735) {
						int[] is = anIntArrayArray7072[i_302_];
						Class232.method3922(is, i_304_, i_306_, i_264_, (byte) -42);
						Class232.method3922(is, i_306_, i_305_, i_263_, (byte) 35);
						Class232.method3922(is, i_305_, i_303_, i_264_, (byte) -87);
					}
				} else {
					if (i_301_ >= anInt7070 * 324226563)
						Class232.method3922(anIntArrayArray7072[i_301_], i_304_, i_303_, i_264_, (byte) -17);
					if (i_302_ <= anInt7068 * -348932735)
						Class232.method3922(anIntArrayArray7072[i_302_], i_304_, i_303_, i_264_, (byte) -65);
				}
			}
		}
	}

	static void method14930(int i, int i_307_, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_) {
		int i_313_ = 0;
		int i_314_ = i_309_;
		int i_315_ = 0;
		int i_316_ = i_308_ - i_312_;
		int i_317_ = i_309_ - i_312_;
		int i_318_ = i_308_ * i_308_;
		int i_319_ = i_309_ * i_309_;
		int i_320_ = i_316_ * i_316_;
		int i_321_ = i_317_ * i_317_;
		int i_322_ = i_319_ << 1;
		int i_323_ = i_318_ << 1;
		int i_324_ = i_321_ << 1;
		int i_325_ = i_320_ << 1;
		int i_326_ = i_309_ << 1;
		int i_327_ = i_317_ << 1;
		int i_328_ = (1 - i_326_) * i_318_ + i_322_;
		int i_329_ = i_319_ - i_323_ * (i_326_ - 1);
		int i_330_ = i_324_ + i_320_ * (1 - i_327_);
		int i_331_ = i_321_ - i_325_ * (i_327_ - 1);
		int i_332_ = i_318_ << 2;
		int i_333_ = i_319_ << 2;
		int i_334_ = i_320_ << 2;
		int i_335_ = i_321_ << 2;
		int i_336_ = 3 * i_322_;
		int i_337_ = i_323_ * (i_326_ - 3);
		int i_338_ = i_324_ * 3;
		int i_339_ = (i_327_ - 3) * i_325_;
		int i_340_ = i_333_;
		int i_341_ = (i_309_ - 1) * i_332_;
		int i_342_ = i_335_;
		int i_343_ = (i_317_ - 1) * i_334_;
		if (i_307_ >= 324226563 * anInt7070 && i_307_ <= -348932735 * anInt7068) {
			int[] is = anIntArrayArray7072[i_307_];
			int i_344_ = Class275.method4890(i - i_308_, anInt7071 * -612590951, -1345107225 * anInt7069, 2035191753);
			int i_345_ = Class275.method4890(i + i_308_, anInt7071 * -612590951, -1345107225 * anInt7069, 356021866);
			int i_346_ = Class275.method4890(i - i_316_, anInt7071 * -612590951, -1345107225 * anInt7069, -2032269615);
			int i_347_ = Class275.method4890(i + i_316_, -612590951 * anInt7071, anInt7069 * -1345107225, 1556703136);
			Class232.method3922(is, i_344_, i_346_, i_311_, (byte) 27);
			Class232.method3922(is, i_346_, i_347_, i_310_, (byte) 4);
			Class232.method3922(is, i_347_, i_345_, i_311_, (byte) 73);
		}
		while (i_314_ > 0) {
			boolean bool = i_314_ <= i_317_;
			if (bool) {
				if (i_330_ < 0) {
					while (i_330_ < 0) {
						i_330_ += i_338_;
						i_331_ += i_342_;
						i_338_ += i_335_;
						i_342_ += i_335_;
						i_315_++;
					}
				}
				if (i_331_ < 0) {
					i_330_ += i_338_;
					i_331_ += i_342_;
					i_338_ += i_335_;
					i_342_ += i_335_;
					i_315_++;
				}
				i_330_ += -i_343_;
				i_331_ += -i_339_;
				i_339_ -= i_334_;
				i_343_ -= i_334_;
			}
			if (i_328_ < 0) {
				while (i_328_ < 0) {
					i_328_ += i_336_;
					i_329_ += i_340_;
					i_336_ += i_333_;
					i_340_ += i_333_;
					i_313_++;
				}
			}
			if (i_329_ < 0) {
				i_328_ += i_336_;
				i_329_ += i_340_;
				i_336_ += i_333_;
				i_340_ += i_333_;
				i_313_++;
			}
			i_328_ += -i_341_;
			i_329_ += -i_337_;
			i_337_ -= i_332_;
			i_341_ -= i_332_;
			i_314_--;
			int i_348_ = i_307_ - i_314_;
			int i_349_ = i_307_ + i_314_;
			if (i_349_ >= 324226563 * anInt7070 && i_348_ <= -348932735 * anInt7068) {
				int i_350_ = Class275.method4890(i + i_313_, -612590951 * anInt7071, -1345107225 * anInt7069, 1937738385);
				int i_351_ = Class275.method4890(i - i_313_, anInt7071 * -612590951, anInt7069 * -1345107225, 182429360);
				if (bool) {
					int i_352_ = Class275.method4890(i_315_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, 46294232);
					int i_353_ = Class275.method4890(i - i_315_, anInt7071 * -612590951, anInt7069 * -1345107225, -1657767749);
					if (i_348_ >= 324226563 * anInt7070) {
						int[] is = anIntArrayArray7072[i_348_];
						Class232.method3922(is, i_351_, i_353_, i_311_, (byte) 36);
						Class232.method3922(is, i_353_, i_352_, i_310_, (byte) 14);
						Class232.method3922(is, i_352_, i_350_, i_311_, (byte) -28);
					}
					if (i_349_ <= anInt7068 * -348932735) {
						int[] is = anIntArrayArray7072[i_349_];
						Class232.method3922(is, i_351_, i_353_, i_311_, (byte) -41);
						Class232.method3922(is, i_353_, i_352_, i_310_, (byte) 60);
						Class232.method3922(is, i_352_, i_350_, i_311_, (byte) -66);
					}
				} else {
					if (i_348_ >= anInt7070 * 324226563)
						Class232.method3922(anIntArrayArray7072[i_348_], i_351_, i_350_, i_311_, (byte) 4);
					if (i_349_ <= anInt7068 * -348932735)
						Class232.method3922(anIntArrayArray7072[i_349_], i_351_, i_350_, i_311_, (byte) -20);
				}
			}
		}
	}

	static void method14931(int i, int i_354_, int i_355_, int i_356_, int i_357_, int i_358_, int i_359_) {
		int i_360_ = 0;
		int i_361_ = i_356_;
		int i_362_ = 0;
		int i_363_ = i_355_ - i_359_;
		int i_364_ = i_356_ - i_359_;
		int i_365_ = i_355_ * i_355_;
		int i_366_ = i_356_ * i_356_;
		int i_367_ = i_363_ * i_363_;
		int i_368_ = i_364_ * i_364_;
		int i_369_ = i_366_ << 1;
		int i_370_ = i_365_ << 1;
		int i_371_ = i_368_ << 1;
		int i_372_ = i_367_ << 1;
		int i_373_ = i_356_ << 1;
		int i_374_ = i_364_ << 1;
		int i_375_ = (1 - i_373_) * i_365_ + i_369_;
		int i_376_ = i_366_ - (i_373_ - 1) * i_370_;
		int i_377_ = i_371_ + (1 - i_374_) * i_367_;
		int i_378_ = i_368_ - (i_374_ - 1) * i_372_;
		int i_379_ = i_365_ << 2;
		int i_380_ = i_366_ << 2;
		int i_381_ = i_367_ << 2;
		int i_382_ = i_368_ << 2;
		int i_383_ = 3 * i_369_;
		int i_384_ = (i_373_ - 3) * i_370_;
		int i_385_ = i_371_ * 3;
		int i_386_ = (i_374_ - 3) * i_372_;
		int i_387_ = i_380_;
		int i_388_ = i_379_ * (i_356_ - 1);
		int i_389_ = i_382_;
		int i_390_ = i_381_ * (i_364_ - 1);
		int[] is = anIntArrayArray7072[i_354_];
		Class232.method3922(is, i - i_355_, i - i_363_, i_358_, (byte) 54);
		Class232.method3922(is, i - i_363_, i_363_ + i, i_357_, (byte) 57);
		Class232.method3922(is, i + i_363_, i_355_ + i, i_358_, (byte) -31);
		while (i_361_ > 0) {
			boolean bool = i_361_ <= i_364_;
			if (bool) {
				if (i_377_ < 0) {
					while (i_377_ < 0) {
						i_377_ += i_385_;
						i_378_ += i_389_;
						i_385_ += i_382_;
						i_389_ += i_382_;
						i_362_++;
					}
				}
				if (i_378_ < 0) {
					i_377_ += i_385_;
					i_378_ += i_389_;
					i_385_ += i_382_;
					i_389_ += i_382_;
					i_362_++;
				}
				i_377_ += -i_390_;
				i_378_ += -i_386_;
				i_386_ -= i_381_;
				i_390_ -= i_381_;
			}
			if (i_375_ < 0) {
				while (i_375_ < 0) {
					i_375_ += i_383_;
					i_376_ += i_387_;
					i_383_ += i_380_;
					i_387_ += i_380_;
					i_360_++;
				}
			}
			if (i_376_ < 0) {
				i_375_ += i_383_;
				i_376_ += i_387_;
				i_383_ += i_380_;
				i_387_ += i_380_;
				i_360_++;
			}
			i_375_ += -i_388_;
			i_376_ += -i_384_;
			i_384_ -= i_379_;
			i_388_ -= i_379_;
			i_361_--;
			int i_391_ = i_354_ - i_361_;
			int i_392_ = i_354_ + i_361_;
			int i_393_ = i_360_ + i;
			int i_394_ = i - i_360_;
			if (bool) {
				int i_395_ = i + i_362_;
				int i_396_ = i - i_362_;
				Class232.method3922(anIntArrayArray7072[i_391_], i_394_, i_396_, i_358_, (byte) -48);
				Class232.method3922(anIntArrayArray7072[i_391_], i_396_, i_395_, i_357_, (byte) 37);
				Class232.method3922(anIntArrayArray7072[i_391_], i_395_, i_393_, i_358_, (byte) -31);
				Class232.method3922(anIntArrayArray7072[i_392_], i_394_, i_396_, i_358_, (byte) 66);
				Class232.method3922(anIntArrayArray7072[i_392_], i_396_, i_395_, i_357_, (byte) 1);
				Class232.method3922(anIntArrayArray7072[i_392_], i_395_, i_393_, i_358_, (byte) 45);
			} else {
				Class232.method3922(anIntArrayArray7072[i_391_], i_394_, i_393_, i_358_, (byte) 6);
				Class232.method3922(anIntArrayArray7072[i_392_], i_394_, i_393_, i_358_, (byte) -50);
			}
		}
	}

	static void method14932(int i, int i_397_, int i_398_, int i_399_, int i_400_) {
		int i_401_ = 0;
		int i_402_ = i_399_;
		int i_403_ = i_398_ * i_398_;
		int i_404_ = i_399_ * i_399_;
		int i_405_ = i_404_ << 1;
		int i_406_ = i_403_ << 1;
		int i_407_ = i_399_ << 1;
		int i_408_ = (1 - i_407_) * i_403_ + i_405_;
		int i_409_ = i_404_ - i_406_ * (i_407_ - 1);
		int i_410_ = i_403_ << 2;
		int i_411_ = i_404_ << 2;
		int i_412_ = i_405_ * (3 + (i_401_ << 1));
		int i_413_ = i_406_ * ((i_402_ << 1) - 3);
		int i_414_ = i_411_ * (1 + i_401_);
		int i_415_ = i_410_ * (i_402_ - 1);
		Class232.method3922(anIntArrayArray7072[i_397_], i - i_398_, i_398_ + i, i_400_, (byte) -11);
		while (i_402_ > 0) {
			if (i_408_ < 0) {
				while (i_408_ < 0) {
					i_408_ += i_412_;
					i_409_ += i_414_;
					i_412_ += i_411_;
					i_414_ += i_411_;
					i_401_++;
				}
			}
			if (i_409_ < 0) {
				i_408_ += i_412_;
				i_409_ += i_414_;
				i_412_ += i_411_;
				i_414_ += i_411_;
				i_401_++;
			}
			i_408_ += -i_415_;
			i_409_ += -i_413_;
			i_413_ -= i_410_;
			i_415_ -= i_410_;
			i_402_--;
			int i_416_ = i_397_ - i_402_;
			int i_417_ = i_397_ + i_402_;
			int i_418_ = i + i_401_;
			int i_419_ = i - i_401_;
			Class232.method3922(anIntArrayArray7072[i_416_], i_419_, i_418_, i_400_, (byte) 49);
			Class232.method3922(anIntArrayArray7072[i_417_], i_419_, i_418_, i_400_, (byte) 25);
		}
	}

	public static void method14933(int i, int i_420_, int i_421_, int i_422_, int i_423_) {
		if (i_421_ == i_422_)
			TilestreamPacket.method6292(i, i_420_, i_421_, i_423_, -99851270);
		else if (i - i_421_ >= anInt7071 * -612590951 && i + i_421_ <= -1345107225 * anInt7069 && i_420_ - i_422_ >= anInt7070 * 324226563 && i_420_ + i_422_ <= anInt7068 * -348932735)
			Class221.method3751(i, i_420_, i_421_, i_422_, i_423_, (byte) 47);
		else
			Class282_Sub17_Sub3.method15405(i, i_420_, i_421_, i_422_, i_423_, (byte) 0);
	}

	static void method14934(int i, int i_424_, int i_425_, int i_426_, int i_427_) {
		int i_428_ = 0;
		int i_429_ = i_426_;
		int i_430_ = i_425_ * i_425_;
		int i_431_ = i_426_ * i_426_;
		int i_432_ = i_431_ << 1;
		int i_433_ = i_430_ << 1;
		int i_434_ = i_426_ << 1;
		int i_435_ = i_432_ + i_430_ * (1 - i_434_);
		int i_436_ = i_431_ - (i_434_ - 1) * i_433_;
		int i_437_ = i_430_ << 2;
		int i_438_ = i_431_ << 2;
		int i_439_ = i_432_ * ((i_428_ << 1) + 3);
		int i_440_ = ((i_429_ << 1) - 3) * i_433_;
		int i_441_ = (i_428_ + 1) * i_438_;
		int i_442_ = (i_429_ - 1) * i_437_;
		if (i_424_ >= 324226563 * anInt7070 && i_424_ <= anInt7068 * -348932735) {
			int i_443_ = Class275.method4890(i + i_425_, -612590951 * anInt7071, anInt7069 * -1345107225, 1141099958);
			int i_444_ = Class275.method4890(i - i_425_, -612590951 * anInt7071, -1345107225 * anInt7069, 1078006433);
			Class232.method3922(anIntArrayArray7072[i_424_], i_444_, i_443_, i_427_, (byte) -83);
		}
		while (i_429_ > 0) {
			if (i_435_ < 0) {
				while (i_435_ < 0) {
					i_435_ += i_439_;
					i_436_ += i_441_;
					i_439_ += i_438_;
					i_441_ += i_438_;
					i_428_++;
				}
			}
			if (i_436_ < 0) {
				i_435_ += i_439_;
				i_436_ += i_441_;
				i_439_ += i_438_;
				i_441_ += i_438_;
				i_428_++;
			}
			i_435_ += -i_442_;
			i_436_ += -i_440_;
			i_440_ -= i_437_;
			i_442_ -= i_437_;
			i_429_--;
			int i_445_ = i_424_ - i_429_;
			int i_446_ = i_429_ + i_424_;
			if (i_446_ >= 324226563 * anInt7070 && i_445_ <= -348932735 * anInt7068) {
				int i_447_ = Class275.method4890(i_428_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, -1476875998);
				int i_448_ = Class275.method4890(i - i_428_, anInt7071 * -612590951, -1345107225 * anInt7069, -1529670331);
				if (i_445_ >= anInt7070 * 324226563)
					Class232.method3922(anIntArrayArray7072[i_445_], i_448_, i_447_, i_427_, (byte) 37);
				if (i_446_ <= anInt7068 * -348932735)
					Class232.method3922(anIntArrayArray7072[i_446_], i_448_, i_447_, i_427_, (byte) -76);
			}
		}
	}

	static void method14935(int i, int i_449_, int i_450_, int i_451_, int i_452_) {
		int i_453_ = 0;
		int i_454_ = i_451_;
		int i_455_ = i_450_ * i_450_;
		int i_456_ = i_451_ * i_451_;
		int i_457_ = i_456_ << 1;
		int i_458_ = i_455_ << 1;
		int i_459_ = i_451_ << 1;
		int i_460_ = i_457_ + i_455_ * (1 - i_459_);
		int i_461_ = i_456_ - (i_459_ - 1) * i_458_;
		int i_462_ = i_455_ << 2;
		int i_463_ = i_456_ << 2;
		int i_464_ = i_457_ * ((i_453_ << 1) + 3);
		int i_465_ = ((i_454_ << 1) - 3) * i_458_;
		int i_466_ = (i_453_ + 1) * i_463_;
		int i_467_ = (i_454_ - 1) * i_462_;
		if (i_449_ >= 324226563 * anInt7070 && i_449_ <= anInt7068 * -348932735) {
			int i_468_ = Class275.method4890(i + i_450_, -612590951 * anInt7071, anInt7069 * -1345107225, -1110461735);
			int i_469_ = Class275.method4890(i - i_450_, -612590951 * anInt7071, -1345107225 * anInt7069, -1584929828);
			Class232.method3922(anIntArrayArray7072[i_449_], i_469_, i_468_, i_452_, (byte) -24);
		}
		while (i_454_ > 0) {
			if (i_460_ < 0) {
				while (i_460_ < 0) {
					i_460_ += i_464_;
					i_461_ += i_466_;
					i_464_ += i_463_;
					i_466_ += i_463_;
					i_453_++;
				}
			}
			if (i_461_ < 0) {
				i_460_ += i_464_;
				i_461_ += i_466_;
				i_464_ += i_463_;
				i_466_ += i_463_;
				i_453_++;
			}
			i_460_ += -i_467_;
			i_461_ += -i_465_;
			i_465_ -= i_462_;
			i_467_ -= i_462_;
			i_454_--;
			int i_470_ = i_449_ - i_454_;
			int i_471_ = i_454_ + i_449_;
			if (i_471_ >= 324226563 * anInt7070 && i_470_ <= -348932735 * anInt7068) {
				int i_472_ = Class275.method4890(i_453_ + i, -612590951 * anInt7071, -1345107225 * anInt7069, 289254224);
				int i_473_ = Class275.method4890(i - i_453_, anInt7071 * -612590951, -1345107225 * anInt7069, -518717843);
				if (i_470_ >= anInt7070 * 324226563)
					Class232.method3922(anIntArrayArray7072[i_470_], i_473_, i_472_, i_452_, (byte) 17);
				if (i_471_ <= anInt7068 * -348932735)
					Class232.method3922(anIntArrayArray7072[i_471_], i_473_, i_472_, i_452_, (byte) 1);
			}
		}
	}
}
