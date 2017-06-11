/* Class264_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class264_Sub2 extends Class264 {
	Class_ra_Sub1 aClass_ra_Sub1_7122;
	byte[][] aByteArrayArray7123;
	int[] anIntArray7124;
	int[] anIntArray7125;
	int[] anIntArray7126;
	int[] anIntArray7127;

	void method2504(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, Class_ta class_ta, int i_10_, int i_11_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		int[] is_12_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
		int[] is_13_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
		int i_14_ = i_7_ - -912871679 * (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974);
		int i_15_ = i_8_;
		if (i_11_ > i_15_) {
			i_15_ = i_11_;
			i_2_ += (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7971 * 692106883 * (i_11_ - i_8_));
			i_1_ += (i_11_ - i_8_) * i_9_;
		}
		int i_16_ = (is_12_.length + i_11_ < i_8_ + i_4_ ? i_11_ + is_12_.length : i_8_ + i_4_);
		for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
			int i_18_ = is_12_[i_17_ - i_11_] + i_10_;
			int i_19_ = is_13_[i_17_ - i_11_];
			int i_20_ = i_3_;
			if (i_14_ > i_18_) {
				int i_21_ = i_14_ - i_18_;
				if (i_21_ >= i_19_) {
					i_1_ += i_6_ + i_3_;
					i_2_ += i_3_ + i_5_;
					continue;
				}
				i_19_ -= i_21_;
			} else {
				int i_22_ = i_18_ - i_14_;
				if (i_22_ >= i_3_) {
					i_1_ += i_6_ + i_3_;
					i_2_ += i_5_ + i_3_;
					continue;
				}
				i_1_ += i_22_;
				i_20_ -= i_22_;
				i_2_ += i_22_;
			}
			int i_23_ = 0;
			if (i_20_ < i_19_)
				i_19_ = i_20_;
			else
				i_23_ = i_20_ - i_19_;
			for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
				int i_25_ = is[i_1_++] & 0xff;
				if (0 != i_25_) {
					int i_26_ = ((((i & 0xff00) * i_25_ & 0xff0000) + ((i & 0xff00ff) * i_25_ & ~0xff00ff)) >> 8);
					i_25_ = 256 - i_25_;
					int i_27_ = is_0_[i_2_];
					is_0_[i_2_++] = ((((i_27_ & 0xff00ff) * i_25_ & ~0xff00ff) + (i_25_ * (i_27_ & 0xff00) & 0xff0000)) >> 8) + i_26_;
				} else
					i_2_++;
			}
			i_1_ += i_6_ + i_23_;
			i_2_ += i_5_ + i_23_;
		}
	}

	void method2505(byte[] is, int[] is_28_, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		for (int i_35_ = -i_32_; i_35_ < 0; i_35_++) {
			for (int i_36_ = -i_31_; i_36_ < 0; i_36_++) {
				int i_37_ = is[i_29_++] & 0xff;
				if (0 != i_37_) {
					int i_38_ = ((((i & 0xff00) * i_37_ & 0xff0000) + (i_37_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					i_37_ = 256 - i_37_;
					int i_39_ = is_28_[i_30_];
					is_28_[i_30_++] = (((i_37_ * (i_39_ & 0xff00ff) & ~0xff00ff) + ((i_39_ & 0xff00) * i_37_ & 0xff0000)) >> 8) + i_38_;
				} else
					i_30_++;
			}
			i_30_ += i_33_;
			i_29_ += i_34_;
		}
	}

	Class264_Sub2(Class_ra_Sub1 class_ra_sub1, Class505 class505, Class89[] class89s, int[] is, int[] is_40_) {
		super(class_ra_sub1, class505);
		((Class264_Sub2) this).aClass_ra_Sub1_7122 = class_ra_sub1;
		((Class264_Sub2) this).aClass_ra_Sub1_7122 = class_ra_sub1;
		((Class264_Sub2) this).anIntArray7124 = is;
		((Class264_Sub2) this).anIntArray7125 = is_40_;
		((Class264_Sub2) this).aByteArrayArray7123 = new byte[class89s.length][];
		((Class264_Sub2) this).anIntArray7126 = new int[class89s.length];
		((Class264_Sub2) this).anIntArray7127 = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			Class89 class89 = class89s[i];
			if (class89.aByteArray819 != null)
				((Class264_Sub2) this).aByteArrayArray7123[i] = class89.aByteArray819;
			else {
				byte[] is_41_ = class89.aByteArray818;
				byte[] is_42_ = (((Class264_Sub2) this).aByteArrayArray7123[i] = new byte[is_41_.length]);
				for (int i_43_ = 0; i_43_ < is_41_.length; i_43_++)
					is_42_[i_43_] = (byte) (is_41_[i_43_] == 0 ? 0 : -1);
			}
			((Class264_Sub2) this).anIntArray7126[i] = class89.anInt811;
			((Class264_Sub2) this).anIntArray7127[i] = class89.anInt815;
		}
	}

	void method2486(char c, int i, int i_44_, int i_45_, boolean bool, Class_ta class_ta, int i_46_, int i_47_) {
		if ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967) != null) {
			if (null == class_ta)
				UA(c, i, i_44_, i_45_, bool);
			else {
				i += ((Class264_Sub2) this).anIntArray7127[c];
				i_44_ += ((Class264_Sub2) this).anIntArray7126[c];
				int i_48_ = ((Class264_Sub2) this).anIntArray7124[c];
				int i_49_ = ((Class264_Sub2) this).anIntArray7125[c];
				int i_50_ = (692106883 * ((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7971);
				int i_51_ = i_44_ * i_50_ + i;
				int i_52_ = i_50_ - i_48_;
				int i_53_ = 0;
				int i_54_ = 0;
				if (i_44_ < -1278653805 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7976)) {
					int i_55_ = (-1278653805 * ((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7976 - i_44_);
					i_49_ -= i_55_;
					i_44_ = (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7976 * -1278653805);
					i_54_ += i_48_ * i_55_;
					i_51_ += i_55_ * i_50_;
				}
				if (i_44_ + i_49_ > (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7977) * 63686679)
					i_49_ -= (i_49_ + i_44_ - (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7977) * 63686679);
				if (i < (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974 * -912871679)) {
					int i_56_ = (-912871679 * ((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7974 - i);
					i_48_ -= i_56_;
					i = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974 * -912871679);
					i_54_ += i_56_;
					i_51_ += i_56_;
					i_53_ += i_56_;
					i_52_ += i_56_;
				}
				if (i + i_48_ > -1416794725 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7991)) {
					int i_57_ = i_48_ + i - (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7991) * -1416794725;
					i_48_ -= i_57_;
					i_53_ += i_57_;
					i_52_ += i_57_;
				}
				if (i_48_ > 0 && i_49_ > 0)
					method2504(((Class264_Sub2) this).aByteArrayArray7123[c], (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967), i_45_, i_54_, i_51_, i_48_, i_49_, i_52_, i_53_, i, i_44_, ((Class264_Sub2) this).anIntArray7124[c], class_ta, i_46_, i_47_);
			}
		}
	}

	void UA(char c, int i, int i_58_, int i_59_, boolean bool) {
		if ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967) != null) {
			i += ((Class264_Sub2) this).anIntArray7127[c];
			i_58_ += ((Class264_Sub2) this).anIntArray7126[c];
			int i_60_ = ((Class264_Sub2) this).anIntArray7124[c];
			int i_61_ = ((Class264_Sub2) this).anIntArray7125[c];
			int i_62_ = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7971) * 692106883;
			int i_63_ = i_58_ * i_62_ + i;
			int i_64_ = i_62_ - i_60_;
			int i_65_ = 0;
			int i_66_ = 0;
			if (i_58_ < -1278653805 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7976)) {
				int i_67_ = ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7976) * -1278653805 - i_58_);
				i_61_ -= i_67_;
				i_58_ = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7976 * -1278653805);
				i_66_ += i_60_ * i_67_;
				i_63_ += i_62_ * i_67_;
			}
			if (i_61_ + i_58_ > 63686679 * (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7977))
				i_61_ -= i_61_ + i_58_ - 63686679 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7977);
			if (i < (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974) * -912871679) {
				int i_68_ = ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974) * -912871679 - i);
				i_60_ -= i_68_;
				i = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974 * -912871679);
				i_66_ += i_68_;
				i_63_ += i_68_;
				i_65_ += i_68_;
				i_64_ += i_68_;
			}
			if (i_60_ + i > (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7991) * -1416794725) {
				int i_69_ = i_60_ + i - (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7991) * -1416794725;
				i_60_ -= i_69_;
				i_65_ += i_69_;
				i_64_ += i_69_;
			}
			if (i_60_ > 0 && i_61_ > 0)
				method2505(((Class264_Sub2) this).aByteArrayArray7123[c], (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967), i_59_, i_66_, i_63_, i_60_, i_61_, i_64_, i_65_);
		}
	}

	void g(char c, int i, int i_70_, int i_71_, boolean bool) {
		if ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967) != null) {
			i += ((Class264_Sub2) this).anIntArray7127[c];
			i_70_ += ((Class264_Sub2) this).anIntArray7126[c];
			int i_72_ = ((Class264_Sub2) this).anIntArray7124[c];
			int i_73_ = ((Class264_Sub2) this).anIntArray7125[c];
			int i_74_ = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7971) * 692106883;
			int i_75_ = i_70_ * i_74_ + i;
			int i_76_ = i_74_ - i_72_;
			int i_77_ = 0;
			int i_78_ = 0;
			if (i_70_ < -1278653805 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7976)) {
				int i_79_ = ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7976) * -1278653805 - i_70_);
				i_73_ -= i_79_;
				i_70_ = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7976 * -1278653805);
				i_78_ += i_72_ * i_79_;
				i_75_ += i_74_ * i_79_;
			}
			if (i_73_ + i_70_ > 63686679 * (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7977))
				i_73_ -= i_73_ + i_70_ - 63686679 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7977);
			if (i < (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974) * -912871679) {
				int i_80_ = ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974) * -912871679 - i);
				i_72_ -= i_80_;
				i = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974 * -912871679);
				i_78_ += i_80_;
				i_75_ += i_80_;
				i_77_ += i_80_;
				i_76_ += i_80_;
			}
			if (i_72_ + i > (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7991) * -1416794725) {
				int i_81_ = i_72_ + i - (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7991) * -1416794725;
				i_72_ -= i_81_;
				i_77_ += i_81_;
				i_76_ += i_81_;
			}
			if (i_72_ > 0 && i_73_ > 0)
				method2505(((Class264_Sub2) this).aByteArrayArray7123[c], (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967), i_71_, i_78_, i_75_, i_72_, i_73_, i_76_, i_77_);
		}
	}

	void e(char c, int i, int i_82_, int i_83_, boolean bool) {
		if ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967) != null) {
			i += ((Class264_Sub2) this).anIntArray7127[c];
			i_82_ += ((Class264_Sub2) this).anIntArray7126[c];
			int i_84_ = ((Class264_Sub2) this).anIntArray7124[c];
			int i_85_ = ((Class264_Sub2) this).anIntArray7125[c];
			int i_86_ = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7971) * 692106883;
			int i_87_ = i_82_ * i_86_ + i;
			int i_88_ = i_86_ - i_84_;
			int i_89_ = 0;
			int i_90_ = 0;
			if (i_82_ < -1278653805 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7976)) {
				int i_91_ = ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7976) * -1278653805 - i_82_);
				i_85_ -= i_91_;
				i_82_ = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7976 * -1278653805);
				i_90_ += i_84_ * i_91_;
				i_87_ += i_86_ * i_91_;
			}
			if (i_85_ + i_82_ > 63686679 * (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7977))
				i_85_ -= i_85_ + i_82_ - 63686679 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7977);
			if (i < (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974) * -912871679) {
				int i_92_ = ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974) * -912871679 - i);
				i_84_ -= i_92_;
				i = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974 * -912871679);
				i_90_ += i_92_;
				i_87_ += i_92_;
				i_89_ += i_92_;
				i_88_ += i_92_;
			}
			if (i_84_ + i > (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7991) * -1416794725) {
				int i_93_ = i_84_ + i - (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7991) * -1416794725;
				i_84_ -= i_93_;
				i_89_ += i_93_;
				i_88_ += i_93_;
			}
			if (i_84_ > 0 && i_85_ > 0)
				method2505(((Class264_Sub2) this).aByteArrayArray7123[c], (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967), i_83_, i_90_, i_87_, i_84_, i_85_, i_88_, i_89_);
		}
	}

	void method2489(char c, int i, int i_94_, int i_95_, boolean bool, Class_ta class_ta, int i_96_, int i_97_) {
		if ((((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967) != null) {
			if (null == class_ta)
				UA(c, i, i_94_, i_95_, bool);
			else {
				i += ((Class264_Sub2) this).anIntArray7127[c];
				i_94_ += ((Class264_Sub2) this).anIntArray7126[c];
				int i_98_ = ((Class264_Sub2) this).anIntArray7124[c];
				int i_99_ = ((Class264_Sub2) this).anIntArray7125[c];
				int i_100_ = (692106883 * ((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7971);
				int i_101_ = i_94_ * i_100_ + i;
				int i_102_ = i_100_ - i_98_;
				int i_103_ = 0;
				int i_104_ = 0;
				if (i_94_ < -1278653805 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7976)) {
					int i_105_ = (-1278653805 * ((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7976 - i_94_);
					i_99_ -= i_105_;
					i_94_ = (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7976 * -1278653805);
					i_104_ += i_98_ * i_105_;
					i_101_ += i_105_ * i_100_;
				}
				if (i_94_ + i_99_ > (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7977) * 63686679)
					i_99_ -= (i_99_ + i_94_ - (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7977) * 63686679);
				if (i < (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974 * -912871679)) {
					int i_106_ = (-912871679 * ((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7974 - i);
					i_98_ -= i_106_;
					i = (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anInt7974 * -912871679);
					i_104_ += i_106_;
					i_101_ += i_106_;
					i_103_ += i_106_;
					i_102_ += i_106_;
				}
				if (i + i_98_ > -1416794725 * (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7991)) {
					int i_107_ = i_98_ + i - (((Class_ra_Sub1) (((Class264_Sub2) this).aClass_ra_Sub1_7122)).anInt7991) * -1416794725;
					i_98_ -= i_107_;
					i_103_ += i_107_;
					i_102_ += i_107_;
				}
				if (i_98_ > 0 && i_99_ > 0)
					method2504(((Class264_Sub2) this).aByteArrayArray7123[c], (((Class_ra_Sub1) ((Class264_Sub2) this).aClass_ra_Sub1_7122).anIntArray7967), i_95_, i_104_, i_101_, i_98_, i_99_, i_102_, i_103_, i, i_94_, ((Class264_Sub2) this).anIntArray7124[c], class_ta, i_96_, i_97_);
			}
		}
	}

	static final void method2506(int i) {
		try {
			Class119.method1304(1674101672);
			client.aClass283_8716.method2666(-2068923271);
			for (int i_108_ = 0; i_108_ < client.aClass19Array8869.length; i_108_++)
				client.aClass19Array8869[i_108_] = null;
			for (int i_109_ = 0; i_109_ < client.aClass299Array8671.length; i_109_++)
				client.aClass299Array8671[i_109_] = null;
			Class372.method4592(590983339);
			for (int i_110_ = 0; i_110_ < 2048; i_110_++)
				client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_110_] = null;
			client.anInt8703 = 0;
			client.npcs.clear((byte) -66);
			client.anInt8772 = 0;
			client.groundItems.clear((byte) -127);
			Class82_Sub11.method906(-1148860846);
			client.anInt8713 = 0;
			Class128.aClass148_6331.method1603(-1863575253);
			Class508.aClass162_6216 = null;
			Class225.aClass162_2512 = null;
			Class375.visitedChannel = null;
			Class350.primaryChannel = null;
			Class_xa.aClass396_6291 = null;
			Class365_Sub1_Sub2_Sub1.aLong9911 = 0L;
			Class194.method1868(2025307040);
			Class98_Sub2.method1065((byte) 83);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xk.gs(").append(')').toString());
		}
	}

	static void method2507(Class334 class334, int i, int i_111_, int i_112_, Class387 class387, byte i_113_) {
		try {
			if (null != class387)
				class334.method4083(i, i_111_, i_112_, class387.N(), class387.RA(), class387.ya(), class387.YA(), class387.o(), class387.AA(), class387.ha());
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xk.dd(").append(')').toString());
		}
	}

	static final int method2508(int i, int i_114_, short i_115_) {
		try {
			int i_116_ = (Class129.method1447(i - 1, i_114_ - 1, 274655009) + Class129.method1447(1 + i, i_114_ - 1, 274655009) + Class129.method1447(i - 1, i_114_ + 1, 274655009) + Class129.method1447(1 + i, 1 + i_114_, 274655009));
			int i_117_ = (Class129.method1447(i - 1, i_114_, 274655009) + Class129.method1447(i + 1, i_114_, 274655009) + Class129.method1447(i, i_114_ - 1, 274655009) + Class129.method1447(i, 1 + i_114_, 274655009));
			int i_118_ = Class129.method1447(i, i_114_, 274655009);
			return i_118_ / 4 + (i_117_ / 8 + i_116_ / 16);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xk.o(").append(')').toString());
		}
	}
}
