
/* Class532_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class532_Sub1 extends Class532 {
	public static Interface22 anInterface22_7922;

	static void method12817(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = Class275.method4890(i_1_, 324226563 * anInt7070, -348932735 * anInt7068, 839066435);
		int i_5_ = Class275.method4890(i_2_, anInt7070 * 324226563, anInt7068 * -348932735, -2073737923);
		int i_6_ = Class275.method4890(i, anInt7071 * -612590951, -1345107225 * anInt7069, -1146149458);
		int i_7_ = Class275.method4890(i_0_, anInt7071 * -612590951, anInt7069 * -1345107225, -1020903161);
		for (int i_8_ = i_4_; i_8_ <= i_5_; i_8_++)
			Class232.method3922(anIntArrayArray7072[i_8_], i_6_, i_7_, i_3_, (byte) 27);
	}

	public static final void method12818(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		if (i >= anInt7071 * -612590951 && i_9_ <= anInt7069 * -1345107225 && i_10_ >= 324226563 * anInt7070 && i_11_ <= -348932735 * anInt7068)
			HitbarDefinitions.method3230(i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, (byte) 30);
		else
			PlayerAppearance.method4034(i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, (byte) -81);
	}

	public static final void method12819(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		if (i >= anInt7071 * -612590951 && i_15_ <= anInt7069 * -1345107225 && i_16_ >= 324226563 * anInt7070 && i_17_ <= -348932735 * anInt7068)
			HitbarDefinitions.method3230(i, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, (byte) 116);
		else
			PlayerAppearance.method4034(i, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, (byte) -2);
	}

	static void method12820(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		int i_27_ = i_26_ + i_22_;
		int i_28_ = i_23_ - i_26_;
		for (int i_29_ = i_22_; i_29_ < i_27_; i_29_++)
			Class232.method3922(anIntArrayArray7072[i_29_], i, i_21_, i_25_, (byte) 11);
		for (int i_30_ = i_23_; i_30_ > i_28_; i_30_--)
			Class232.method3922(anIntArrayArray7072[i_30_], i, i_21_, i_25_, (byte) -44);
		int i_31_ = i + i_26_;
		int i_32_ = i_21_ - i_26_;
		for (int i_33_ = i_27_; i_33_ <= i_28_; i_33_++) {
			int[] is = anIntArrayArray7072[i_33_];
			Class232.method3922(is, i, i_31_, i_25_, (byte) -1);
			Class232.method3922(is, i_31_, i_32_, i_24_, (byte) -74);
			Class232.method3922(is, i_32_, i_21_, i_25_, (byte) -29);
		}
	}

	public static final void method12821(int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_) {
		if (i >= anInt7071 * -612590951 && i_34_ <= anInt7069 * -1345107225 && i_35_ >= 324226563 * anInt7070 && i_36_ <= -348932735 * anInt7068)
			HitbarDefinitions.method3230(i, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_, (byte) 52);
		else
			PlayerAppearance.method4034(i, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_, (byte) -49);
	}

	public static final void method12822(int i, int i_40_, int i_41_, int i_42_, int i_43_) {
		if (i >= anInt7071 * -612590951 && i_40_ <= -1345107225 * anInt7069 && i_41_ >= 324226563 * anInt7070 && i_42_ <= -348932735 * anInt7068)
			Class92.method1564(i, i_40_, i_41_, i_42_, i_43_, (byte) -26);
		else
			Class463.method7728(i, i_40_, i_41_, i_42_, i_43_, 1905129188);
	}

	static void method12823(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		int i_50_ = i_49_ + i_45_;
		int i_51_ = i_46_ - i_49_;
		for (int i_52_ = i_45_; i_52_ < i_50_; i_52_++)
			Class232.method3922(anIntArrayArray7072[i_52_], i, i_44_, i_48_, (byte) -29);
		for (int i_53_ = i_46_; i_53_ > i_51_; i_53_--)
			Class232.method3922(anIntArrayArray7072[i_53_], i, i_44_, i_48_, (byte) 44);
		int i_54_ = i + i_49_;
		int i_55_ = i_44_ - i_49_;
		for (int i_56_ = i_50_; i_56_ <= i_51_; i_56_++) {
			int[] is = anIntArrayArray7072[i_56_];
			Class232.method3922(is, i, i_54_, i_48_, (byte) -76);
			Class232.method3922(is, i_54_, i_55_, i_47_, (byte) 10);
			Class232.method3922(is, i_55_, i_44_, i_48_, (byte) -2);
		}
	}

	public static final void method12824(int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_) {
		if (i >= -612590951 * anInt7071 && i_57_ <= -1345107225 * anInt7069 && i_58_ >= 324226563 * anInt7070 && i_59_ <= anInt7068 * -348932735) {
			if (1 == i_61_)
				Class48_Sub2.method14572(i, i_57_, i_58_, i_59_, i_60_, (short) 16204);
			else
				MapRegion.method4561(i, i_57_, i_58_, i_59_, i_60_, i_61_, -400478927);
		} else if (i_61_ == 1)
			Class78.method1388(i, i_57_, i_58_, i_59_, i_60_, (byte) -9);
		else
			Class20.method744(i, i_57_, i_58_, i_59_, i_60_, i_61_, -1488125230);
	}

	static void method12825(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		int i_68_ = Class275.method4890(i_63_, anInt7070 * 324226563, -348932735 * anInt7068, -1739589502);
		int i_69_ = Class275.method4890(i_64_, 324226563 * anInt7070, anInt7068 * -348932735, -248857689);
		int i_70_ = Class275.method4890(i, -612590951 * anInt7071, anInt7069 * -1345107225, 503949120);
		int i_71_ = Class275.method4890(i_62_, -612590951 * anInt7071, -1345107225 * anInt7069, 244525691);
		int i_72_ = Class275.method4890(i_63_ + i_67_, 324226563 * anInt7070, -348932735 * anInt7068, 615211232);
		int i_73_ = Class275.method4890(i_64_ - i_67_, 324226563 * anInt7070, anInt7068 * -348932735, -347359189);
		for (int i_74_ = i_68_; i_74_ < i_72_; i_74_++)
			Class232.method3922(anIntArrayArray7072[i_74_], i_70_, i_71_, i_66_, (byte) 44);
		for (int i_75_ = i_69_; i_75_ > i_73_; i_75_--)
			Class232.method3922(anIntArrayArray7072[i_75_], i_70_, i_71_, i_66_, (byte) -34);
		int i_76_ = Class275.method4890(i + i_67_, anInt7071 * -612590951, -1345107225 * anInt7069, 455098738);
		int i_77_ = Class275.method4890(i_62_ - i_67_, -612590951 * anInt7071, anInt7069 * -1345107225, -1922461762);
		for (int i_78_ = i_72_; i_78_ <= i_73_; i_78_++) {
			int[] is = anIntArrayArray7072[i_78_];
			Class232.method3922(is, i_70_, i_76_, i_66_, (byte) 36);
			Class232.method3922(is, i_76_, i_77_, i_65_, (byte) -30);
			Class232.method3922(is, i_77_, i_71_, i_66_, (byte) 64);
		}
	}

	static void method12826(int i, int i_79_, int i_80_, int i_81_, int i_82_) {
		Class232.method3922(anIntArrayArray7072[i_80_++], i, i_79_, i_82_, (byte) 1);
		Class232.method3922(anIntArrayArray7072[i_81_--], i, i_79_, i_82_, (byte) 37);
		for (int i_83_ = i_80_; i_83_ <= i_81_; i_83_++) {
			int[] is = anIntArrayArray7072[i_83_];
			is[i] = is[i_79_] = i_82_;
		}
	}

	Class532_Sub1() throws Throwable {
		throw new Error();
	}

	static void method12827(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_) {
		int i_90_ = i_89_ + i_85_;
		int i_91_ = i_86_ - i_89_;
		for (int i_92_ = i_85_; i_92_ < i_90_; i_92_++)
			Class232.method3922(anIntArrayArray7072[i_92_], i, i_84_, i_88_, (byte) -34);
		for (int i_93_ = i_86_; i_93_ > i_91_; i_93_--)
			Class232.method3922(anIntArrayArray7072[i_93_], i, i_84_, i_88_, (byte) 1);
		int i_94_ = i + i_89_;
		int i_95_ = i_84_ - i_89_;
		for (int i_96_ = i_90_; i_96_ <= i_91_; i_96_++) {
			int[] is = anIntArrayArray7072[i_96_];
			Class232.method3922(is, i, i_94_, i_88_, (byte) 15);
			Class232.method3922(is, i_94_, i_95_, i_87_, (byte) -60);
			Class232.method3922(is, i_95_, i_84_, i_88_, (byte) -94);
		}
	}

	public static final void method12828(int i, int i_97_, int i_98_, int i_99_, int i_100_) {
		if (i >= anInt7071 * -612590951 && i_97_ <= -1345107225 * anInt7069 && i_98_ >= 324226563 * anInt7070 && i_99_ <= -348932735 * anInt7068)
			Class92.method1564(i, i_97_, i_98_, i_99_, i_100_, (byte) -18);
		else
			Class463.method7728(i, i_97_, i_98_, i_99_, i_100_, 1426580507);
	}

	static void method12829(int i, int i_101_, int i_102_, int i_103_, int i_104_) {
		int i_105_ = Class275.method4890(i_102_, 324226563 * anInt7070, -348932735 * anInt7068, -1960849173);
		int i_106_ = Class275.method4890(i_103_, anInt7070 * 324226563, anInt7068 * -348932735, -111701983);
		int i_107_ = Class275.method4890(i, anInt7071 * -612590951, -1345107225 * anInt7069, 1172154079);
		int i_108_ = Class275.method4890(i_101_, anInt7071 * -612590951, anInt7069 * -1345107225, -115906171);
		for (int i_109_ = i_105_; i_109_ <= i_106_; i_109_++)
			Class232.method3922(anIntArrayArray7072[i_109_], i_107_, i_108_, i_104_, (byte) -54);
	}

	static void method12830(int i, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_) {
		int i_115_ = i_111_ + i_114_;
		int i_116_ = i_112_ - i_114_;
		for (int i_117_ = i_111_; i_117_ < i_115_; i_117_++)
			Class232.method3922(anIntArrayArray7072[i_117_], i, i_110_, i_113_, (byte) -35);
		for (int i_118_ = i_112_; i_118_ > i_116_; i_118_--)
			Class232.method3922(anIntArrayArray7072[i_118_], i, i_110_, i_113_, (byte) -9);
		int i_119_ = i + i_114_;
		int i_120_ = i_110_ - i_114_;
		for (int i_121_ = i_115_; i_121_ <= i_116_; i_121_++) {
			int[] is = anIntArrayArray7072[i_121_];
			Class232.method3922(is, i, i_119_, i_113_, (byte) -10);
			Class232.method3922(is, i_120_, i_110_, i_113_, (byte) -15);
		}
	}

	static void method12831(int i, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_) {
		int i_127_ = Class275.method4890(i_123_, 324226563 * anInt7070, anInt7068 * -348932735, 842068204);
		int i_128_ = Class275.method4890(i_124_, 324226563 * anInt7070, -348932735 * anInt7068, -1277708176);
		int i_129_ = Class275.method4890(i, -612590951 * anInt7071, -1345107225 * anInt7069, -761161023);
		int i_130_ = Class275.method4890(i_122_, -612590951 * anInt7071, -1345107225 * anInt7069, 1314585525);
		int i_131_ = Class275.method4890(i_126_ + i_123_, anInt7070 * 324226563, anInt7068 * -348932735, -144184791);
		int i_132_ = Class275.method4890(i_124_ - i_126_, 324226563 * anInt7070, anInt7068 * -348932735, -585250290);
		for (int i_133_ = i_127_; i_133_ < i_131_; i_133_++)
			Class232.method3922(anIntArrayArray7072[i_133_], i_129_, i_130_, i_125_, (byte) 90);
		for (int i_134_ = i_128_; i_134_ > i_132_; i_134_--)
			Class232.method3922(anIntArrayArray7072[i_134_], i_129_, i_130_, i_125_, (byte) -86);
		int i_135_ = Class275.method4890(i_126_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, 48161757);
		int i_136_ = Class275.method4890(i_122_ - i_126_, -612590951 * anInt7071, -1345107225 * anInt7069, -47035544);
		for (int i_137_ = i_131_; i_137_ <= i_132_; i_137_++) {
			int[] is = anIntArrayArray7072[i_137_];
			Class232.method3922(is, i_129_, i_135_, i_125_, (byte) -1);
			Class232.method3922(is, i_136_, i_130_, i_125_, (byte) -45);
		}
	}

	static void method12832(int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_) {
		int i_143_ = Class275.method4890(i_139_, 324226563 * anInt7070, anInt7068 * -348932735, -330945198);
		int i_144_ = Class275.method4890(i_140_, 324226563 * anInt7070, -348932735 * anInt7068, 1989670707);
		int i_145_ = Class275.method4890(i, -612590951 * anInt7071, -1345107225 * anInt7069, -517063795);
		int i_146_ = Class275.method4890(i_138_, -612590951 * anInt7071, -1345107225 * anInt7069, 2037311418);
		int i_147_ = Class275.method4890(i_142_ + i_139_, anInt7070 * 324226563, anInt7068 * -348932735, -557408531);
		int i_148_ = Class275.method4890(i_140_ - i_142_, 324226563 * anInt7070, anInt7068 * -348932735, 1007358567);
		for (int i_149_ = i_143_; i_149_ < i_147_; i_149_++)
			Class232.method3922(anIntArrayArray7072[i_149_], i_145_, i_146_, i_141_, (byte) 66);
		for (int i_150_ = i_144_; i_150_ > i_148_; i_150_--)
			Class232.method3922(anIntArrayArray7072[i_150_], i_145_, i_146_, i_141_, (byte) 13);
		int i_151_ = Class275.method4890(i_142_ + i, anInt7071 * -612590951, anInt7069 * -1345107225, -1510786050);
		int i_152_ = Class275.method4890(i_138_ - i_142_, -612590951 * anInt7071, -1345107225 * anInt7069, 2044769563);
		for (int i_153_ = i_147_; i_153_ <= i_148_; i_153_++) {
			int[] is = anIntArrayArray7072[i_153_];
			Class232.method3922(is, i_145_, i_151_, i_141_, (byte) -70);
			Class232.method3922(is, i_152_, i_146_, i_141_, (byte) 10);
		}
	}

	static void method12833(int i, int i_154_, int i_155_, int i_156_, int i_157_) {
		if (i_155_ <= anInt7068 * -348932735 && i_156_ >= 324226563 * anInt7070) {
			boolean bool;
			if (i < -612590951 * anInt7071) {
				i = anInt7071 * -612590951;
				bool = false;
			} else if (i > -1345107225 * anInt7069) {
				i = anInt7069 * -1345107225;
				bool = false;
			} else
				bool = true;
			boolean bool_158_;
			if (i_154_ < -612590951 * anInt7071) {
				i_154_ = -612590951 * anInt7071;
				bool_158_ = false;
			} else if (i_154_ > -1345107225 * anInt7069) {
				i_154_ = anInt7069 * -1345107225;
				bool_158_ = false;
			} else
				bool_158_ = true;
			if (i_155_ >= 324226563 * anInt7070)
				Class232.method3922(anIntArrayArray7072[i_155_++], i, i_154_, i_157_, (byte) -69);
			else
				i_155_ = anInt7070 * 324226563;
			if (i_156_ <= -348932735 * anInt7068)
				Class232.method3922(anIntArrayArray7072[i_156_--], i, i_154_, i_157_, (byte) 49);
			else
				i_156_ = anInt7068 * -348932735;
			if (bool && bool_158_) {
				for (int i_159_ = i_155_; i_159_ <= i_156_; i_159_++) {
					int[] is = anIntArrayArray7072[i_159_];
					is[i] = is[i_154_] = i_157_;
				}
			} else if (bool) {
				for (int i_160_ = i_155_; i_160_ <= i_156_; i_160_++)
					anIntArrayArray7072[i_160_][i] = i_157_;
			} else if (bool_158_) {
				for (int i_161_ = i_155_; i_161_ <= i_156_; i_161_++)
					anIntArrayArray7072[i_161_][i_154_] = i_157_;
			}
		}
	}

	static void method12834(int i, int i_162_, int i_163_, int i_164_, int i_165_) {
		if (i_163_ <= anInt7068 * -348932735 && i_164_ >= 324226563 * anInt7070) {
			boolean bool;
			if (i < -612590951 * anInt7071) {
				i = anInt7071 * -612590951;
				bool = false;
			} else if (i > -1345107225 * anInt7069) {
				i = anInt7069 * -1345107225;
				bool = false;
			} else
				bool = true;
			boolean bool_166_;
			if (i_162_ < -612590951 * anInt7071) {
				i_162_ = -612590951 * anInt7071;
				bool_166_ = false;
			} else if (i_162_ > -1345107225 * anInt7069) {
				i_162_ = anInt7069 * -1345107225;
				bool_166_ = false;
			} else
				bool_166_ = true;
			if (i_163_ >= 324226563 * anInt7070)
				Class232.method3922(anIntArrayArray7072[i_163_++], i, i_162_, i_165_, (byte) -11);
			else
				i_163_ = anInt7070 * 324226563;
			if (i_164_ <= -348932735 * anInt7068)
				Class232.method3922(anIntArrayArray7072[i_164_--], i, i_162_, i_165_, (byte) 34);
			else
				i_164_ = anInt7068 * -348932735;
			if (bool && bool_166_) {
				for (int i_167_ = i_163_; i_167_ <= i_164_; i_167_++) {
					int[] is = anIntArrayArray7072[i_167_];
					is[i] = is[i_162_] = i_165_;
				}
			} else if (bool) {
				for (int i_168_ = i_163_; i_168_ <= i_164_; i_168_++)
					anIntArrayArray7072[i_168_][i] = i_165_;
			} else if (bool_166_) {
				for (int i_169_ = i_163_; i_169_ <= i_164_; i_169_++)
					anIntArrayArray7072[i_169_][i_162_] = i_165_;
			}
		}
	}

	static void method12835(int i, int i_170_, int i_171_, int i_172_, int i_173_) {
		Class232.method3922(anIntArrayArray7072[i_171_++], i, i_170_, i_173_, (byte) -16);
		Class232.method3922(anIntArrayArray7072[i_172_--], i, i_170_, i_173_, (byte) -113);
		for (int i_174_ = i_171_; i_174_ <= i_172_; i_174_++) {
			int[] is = anIntArrayArray7072[i_174_];
			is[i] = is[i_170_] = i_173_;
		}
	}

	static void method12836(int i, int i_175_, int i_176_, int i_177_, int i_178_) {
		Class232.method3922(anIntArrayArray7072[i_176_++], i, i_175_, i_178_, (byte) -78);
		Class232.method3922(anIntArrayArray7072[i_177_--], i, i_175_, i_178_, (byte) 11);
		for (int i_179_ = i_176_; i_179_ <= i_177_; i_179_++) {
			int[] is = anIntArrayArray7072[i_179_];
			is[i] = is[i_175_] = i_178_;
		}
	}

	public static final void method12837(int i, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_) {
		if (i >= -612590951 * anInt7071 && i_180_ <= -1345107225 * anInt7069 && i_181_ >= 324226563 * anInt7070 && i_182_ <= anInt7068 * -348932735) {
			if (1 == i_184_)
				Class48_Sub2.method14572(i, i_180_, i_181_, i_182_, i_183_, (short) 24120);
			else
				MapRegion.method4561(i, i_180_, i_181_, i_182_, i_183_, i_184_, 1667511856);
		} else if (i_184_ == 1)
			Class78.method1388(i, i_180_, i_181_, i_182_, i_183_, (byte) -65);
		else
			Class20.method744(i, i_180_, i_181_, i_182_, i_183_, i_184_, -1575104034);
	}

	static final void method12838(int i, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_, short i_190_) {
		if (i - i_186_ >= -612590951 * Class532_Sub3.anInt7071 && i + i_186_ <= -1345107225 * Class532_Sub3.anInt7069 && i_185_ - i_186_ >= 324226563 * Class532_Sub3.anInt7070 && i_186_ + i_185_ <= -348932735 * Class532_Sub3.anInt7068)
			Class155.method2637(i, i_185_, i_186_, i_187_, i_188_, i_189_, (byte) 6);
		else
			Class60.method1174(i, i_185_, i_186_, i_187_, i_188_, i_189_, -1253230247);
	}

	static final void method12839(CS2Executor class527, int i) {
		int i_191_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_191_, (byte) 105);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_191_ >> 16];
		Class13.method505(class118, class98, class527, (byte) 1);
	}

	public static void method12840(int i) {
		synchronized (Class308.aclient3620) {
			if (null != client.aFrame3260) {
				/* empty */
			} else {
				Container container = Class371.method6354((byte) 1);
				if (container == null) {
					/* empty */
				} else {
					Class45.anInt434 = container.getSize().width * 1031248161;
					Class107.anInt1082 = container.getSize().height * 685317511;
					if (client.aFrame3261 == container) {
						Insets insets = client.aFrame3261.getInsets();
						Class45.anInt434 -= (insets.left + insets.right) * 1031248161;
						Class107.anInt1082 -= (insets.bottom + insets.top) * 685317511;
					}
					if (-1016911135 * Class45.anInt434 <= 0)
						Class45.anInt434 = 1031248161;
					if (-499509193 * Class107.anInt1082 <= 0)
						Class107.anInt1082 = 685317511;
					if (Class158.method2730((short) -11561) != 1)
						Class46.method935((byte) 0);
					else {
						Class349.anInt4083 = client.anInt7439 * 262617915;
						client.anInt3250 = ((-1016911135 * Class45.anInt434 - client.anInt7439 * 150480619) / 2 * -1347577581);
						client.anInt3243 = 1984724499 * client.anInt7312;
						client.anInt3251 = 0;
					}
					if (Class496.aClass496_5813 != Class90.aClass496_952 && -418109423 * Class349.anInt4083 < 1024 && client.anInt3243 * -969250379 >= 768) {
						/* empty */
					}
					Class351.gameCanvas.setSize((-418109423 * Class349.anInt4083), (client.anInt3243 * -969250379));
					if (Renderers.SOFTWARE_RENDERER != null)
						Renderers.SOFTWARE_RENDERER.method8414(Class351.gameCanvas, Class349.anInt4083 * -418109423, client.anInt3243 * -969250379, -2138128111);
					if (container == client.aFrame3261) {
						Insets insets = client.aFrame3261.getInsets();
						Class351.gameCanvas.setLocation(insets.left + client.anInt3250 * -1911940837, insets.top + 698621615 * client.anInt3251);
					} else
						Class351.gameCanvas.setLocation((client.anInt3250 * -1911940837), (698621615 * client.anInt3251));
					Class400.method6795(-366853248);
					if (client.anInt7349 * -1699899559 != -1)
						Class516.method8867(true, -905479502);
					Class275.method4891((byte) -40);
				}
			}
		}
	}

	static final void method12841(CS2Executor class527, int i) {
		int i_192_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4544, client.aClass184_7475.isaac, 443775606);
		class282_sub23.buffer.writeShort(i_192_, 1417031095);
		client.aClass184_7475.method3049(class282_sub23, -1028777472);
	}
}
