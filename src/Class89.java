/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class89 {
	public int anInt811;
	public int anInt812;
	public int anInt813;
	public int anInt814;
	public int anInt815;
	public int anInt816;
	public int[] anIntArray817;
	public byte[] aByteArray818;
	public byte[] aByteArray819;

	public static Class89 method979(Class243 class243, int i) {
		byte[] is = class243.method2294(i, (byte) 17);
		if (is == null)
			return null;
		return method982(is)[0];
	}

	public void method980() {
		byte[] is = aByteArray818;
		if (aByteArray819 == null) {
			for (int i = (anInt816 >> 1) - 1; i >= 0; i--) {
				int i_0_ = i * anInt812;
				int i_1_ = (anInt816 - i - 1) * anInt812;
				for (int i_2_ = -anInt812; i_2_ < 0; i_2_++) {
					byte i_3_ = is[i_0_];
					is[i_0_] = is[i_1_];
					is[i_1_] = i_3_;
					i_0_++;
					i_1_++;
				}
			}
		} else {
			byte[] is_4_ = aByteArray819;
			for (int i = (anInt816 >> 1) - 1; i >= 0; i--) {
				int i_5_ = i * anInt812;
				int i_6_ = (anInt816 - i - 1) * anInt812;
				for (int i_7_ = -anInt812; i_7_ < 0; i_7_++) {
					byte i_8_ = is[i_5_];
					is[i_5_] = is[i_6_];
					is[i_6_] = i_8_;
					i_8_ = is_4_[i_5_];
					is_4_[i_5_] = is_4_[i_6_];
					is_4_[i_6_] = i_8_;
					i_5_++;
					i_6_++;
				}
			}
		}
		int i = anInt811;
		anInt811 = anInt813;
		anInt813 = i;
	}

	public static Class89[] method981(Class243 class243, int i) {
		byte[] is = class243.method2294(i, (byte) 80);
		if (is == null)
			return null;
		return method982(is);
	}

	public static Class89[] method982(byte[] is) {
		RsByteBuffer class298_sub53 = new RsByteBuffer(is);
		class298_sub53.index = (is.length - 2) * 116413311;
		int i = class298_sub53.readUnsignedShort();
		Class89[] class89s = new Class89[i];
		for (int i_9_ = 0; i_9_ < i; i_9_++)
			class89s[i_9_] = new Class89();
		class298_sub53.index = (is.length - 7 - i * 8) * 116413311;
		int i_10_ = class298_sub53.readUnsignedShort();
		int i_11_ = class298_sub53.readUnsignedShort();
		int i_12_ = (class298_sub53.readUnsignedByte() & 0xff) + 1;
		for (int i_13_ = 0; i_13_ < i; i_13_++)
			class89s[i_13_].anInt815 = class298_sub53.readUnsignedShort();
		for (int i_14_ = 0; i_14_ < i; i_14_++)
			class89s[i_14_].anInt811 = class298_sub53.readUnsignedShort();
		for (int i_15_ = 0; i_15_ < i; i_15_++)
			class89s[i_15_].anInt812 = class298_sub53.readUnsignedShort();
		for (int i_16_ = 0; i_16_ < i; i_16_++)
			class89s[i_16_].anInt816 = class298_sub53.readUnsignedShort();
		for (int i_17_ = 0; i_17_ < i; i_17_++) {
			Class89 class89 = class89s[i_17_];
			class89.anInt814 = i_10_ - class89.anInt812 - class89.anInt815;
			class89.anInt813 = i_11_ - class89.anInt816 - class89.anInt811;
		}
		class298_sub53.index = (is.length - 7 - i * 8 - (i_12_ - 1) * 3) * 116413311;
		int[] is_18_ = new int[i_12_];
		for (int i_19_ = 1; i_19_ < i_12_; i_19_++) {
			is_18_[i_19_] = class298_sub53.read24BitUnsignedInteger((byte) -47);
			if (is_18_[i_19_] == 0)
				is_18_[i_19_] = 1;
		}
		for (int i_20_ = 0; i_20_ < i; i_20_++)
			class89s[i_20_].anIntArray817 = is_18_;
		class298_sub53.index = 0;
		for (int i_21_ = 0; i_21_ < i; i_21_++) {
			Class89 class89 = class89s[i_21_];
			int i_22_ = class89.anInt812 * class89.anInt816;
			class89.aByteArray818 = new byte[i_22_];
			int i_23_ = class298_sub53.readUnsignedByte();
			if ((i_23_ & 0x2) == 0) {
				if ((i_23_ & 0x1) == 0) {
					for (int i_24_ = 0; i_24_ < i_22_; i_24_++)
						class89.aByteArray818[i_24_] = class298_sub53.readByte(-12558881);
				} else {
					for (int i_25_ = 0; i_25_ < class89.anInt812; i_25_++) {
						for (int i_26_ = 0; i_26_ < class89.anInt816; i_26_++)
							class89.aByteArray818[(i_25_ + i_26_ * class89.anInt812)] = class298_sub53.readByte(-12558881);
					}
				}
			} else {
				boolean bool = false;
				class89.aByteArray819 = new byte[i_22_];
				if ((i_23_ & 0x1) == 0) {
					for (int i_27_ = 0; i_27_ < i_22_; i_27_++)
						class89.aByteArray818[i_27_] = class298_sub53.readByte(-12558881);
					for (int i_28_ = 0; i_28_ < i_22_; i_28_++) {
						byte i_29_ = (class89.aByteArray819[i_28_] = class298_sub53.readByte(-12558881));
						bool = bool | i_29_ != -1;
					}
				} else {
					for (int i_30_ = 0; i_30_ < class89.anInt812; i_30_++) {
						for (int i_31_ = 0; i_31_ < class89.anInt816; i_31_++)
							class89.aByteArray818[(i_30_ + i_31_ * class89.anInt812)] = class298_sub53.readByte(-12558881);
					}
					for (int i_32_ = 0; i_32_ < class89.anInt812; i_32_++) {
						for (int i_33_ = 0; i_33_ < class89.anInt816; i_33_++) {
							byte i_34_ = (class89.aByteArray819[i_32_ + i_33_ * class89.anInt812] = class298_sub53.readByte(-12558881));
							bool = bool | i_34_ != -1;
						}
					}
				}
				if (!bool)
					class89.aByteArray819 = null;
			}
		}
		return class89s;
	}

	public int method983() {
		return anInt812 + anInt815 + anInt814;
	}

	public void method984() {
		int i = method983();
		int i_35_ = method994();
		if (anInt812 != i || anInt816 != i_35_) {
			byte[] is = new byte[i * i_35_];
			if (aByteArray819 != null) {
				byte[] is_36_ = new byte[i * i_35_];
				for (int i_37_ = 0; i_37_ < anInt816; i_37_++) {
					int i_38_ = i_37_ * anInt812;
					int i_39_ = (i_37_ + anInt811) * i + anInt815;
					for (int i_40_ = 0; i_40_ < anInt812; i_40_++) {
						is[i_39_] = aByteArray818[i_38_];
						is_36_[i_39_++] = aByteArray819[i_38_++];
					}
				}
				aByteArray819 = is_36_;
			} else {
				for (int i_41_ = 0; i_41_ < anInt816; i_41_++) {
					int i_42_ = i_41_ * anInt812;
					int i_43_ = (i_41_ + anInt811) * i + anInt815;
					for (int i_44_ = 0; i_44_ < anInt812; i_44_++)
						is[i_43_++] = aByteArray818[i_42_++];
				}
			}
			anInt813 = 0;
			anInt811 = 0;
			anInt814 = 0;
			anInt815 = 0;
			anInt812 = i;
			anInt816 = i_35_;
			aByteArray818 = is;
		}
	}

	public void method985(int i) {
		int i_45_ = method983();
		int i_46_ = method994();
		if (anInt812 != i_45_ || anInt816 != i_46_) {
			int i_47_ = i;
			if (i_47_ > anInt815)
				i_47_ = anInt815;
			int i_48_ = i;
			if (i_48_ + anInt815 + anInt812 > i_45_)
				i_48_ = i_45_ - anInt815 - anInt812;
			int i_49_ = i;
			if (i_49_ > anInt811)
				i_49_ = anInt811;
			int i_50_ = i;
			if (i_50_ + anInt811 + anInt816 > i_46_)
				i_50_ = i_46_ - anInt811 - anInt816;
			int i_51_ = anInt812 + i_47_ + i_48_;
			int i_52_ = anInt816 + i_49_ + i_50_;
			byte[] is = new byte[i_51_ * i_52_];
			if (aByteArray819 == null) {
				for (int i_53_ = 0; i_53_ < anInt816; i_53_++) {
					int i_54_ = i_53_ * anInt812;
					int i_55_ = (i_53_ + i_49_) * i_51_ + i_47_;
					for (int i_56_ = 0; i_56_ < anInt812; i_56_++)
						is[i_55_++] = aByteArray818[i_54_++];
				}
			} else {
				byte[] is_57_ = new byte[i_51_ * i_52_];
				for (int i_58_ = 0; i_58_ < anInt816; i_58_++) {
					int i_59_ = i_58_ * anInt812;
					int i_60_ = (i_58_ + i_49_) * i_51_ + i_47_;
					for (int i_61_ = 0; i_61_ < anInt812; i_61_++) {
						is_57_[i_60_] = aByteArray819[i_59_];
						is[i_60_++] = aByteArray818[i_59_++];
					}
				}
				aByteArray819 = is_57_;
			}
			anInt815 -= i_47_;
			anInt811 -= i_49_;
			anInt814 -= i_48_;
			anInt813 -= i_50_;
			anInt812 = i_51_;
			anInt816 = i_52_;
			aByteArray818 = is;
		}
	}

	public void method986(int i) {
		int i_62_ = -1;
		if (anIntArray817.length < 255) {
			for (int i_63_ = 0; i_63_ < anIntArray817.length; i_63_++) {
				if (anIntArray817[i_63_] == i) {
					i_62_ = i_63_;
					break;
				}
			}
			if (i_62_ == -1) {
				i_62_ = anIntArray817.length;
				int[] is = new int[anIntArray817.length + 1];
				Class425.method5741(anIntArray817, 0, is, 0, anIntArray817.length);
				anIntArray817 = is;
				is[i_62_] = i;
			}
		} else {
			int i_64_ = 2147483647;
			int i_65_ = i >> 16 & 0xff;
			int i_66_ = i >> 8 & 0xff;
			int i_67_ = i & 0xff;
			for (int i_68_ = 0; i_68_ < anIntArray817.length; i_68_++) {
				int i_69_ = anIntArray817[i_68_];
				int i_70_ = i_69_ >> 16 & 0xff;
				int i_71_ = i_69_ >> 8 & 0xff;
				int i_72_ = i_69_ & 0xff;
				int i_73_ = i_65_ - i_70_;
				if (i_73_ < 0)
					i_73_ = -i_73_;
				int i_74_ = i_66_ - i_71_;
				if (i_74_ < 0)
					i_74_ = -i_74_;
				int i_75_ = i_67_ - i_72_;
				if (i_75_ < 0)
					i_75_ = -i_75_;
				int i_76_ = i_73_ + i_74_ + i_75_;
				if (i_76_ < i_64_) {
					i_64_ = i_76_;
					i_62_ = i_68_;
				}
			}
		}
		int i_77_ = 0;
		byte[] is = new byte[anInt812 * anInt816];
		for (int i_78_ = 0; i_78_ < anInt816; i_78_++) {
			for (int i_79_ = 0; i_79_ < anInt812; i_79_++) {
				int i_80_ = aByteArray818[i_77_] & 0xff;
				if (anIntArray817[i_80_] == 0) {
					if (i_79_ > 0 && anIntArray817[aByteArray818[i_77_ - 1] & 0xff] != 0)
						i_80_ = i_62_;
					else if (i_78_ > 0 && anIntArray817[(aByteArray818[i_77_ - anInt812] & 0xff)] != 0)
						i_80_ = i_62_;
					else if (i_79_ < anInt812 - 1 && (anIntArray817[aByteArray818[i_77_ + 1] & 0xff] != 0))
						i_80_ = i_62_;
					else if (i_78_ < anInt816 - 1 && anIntArray817[(aByteArray818[i_77_ + anInt812] & 0xff)] != 0)
						i_80_ = i_62_;
				}
				is[i_77_++] = (byte) i_80_;
			}
		}
		aByteArray818 = is;
	}

	public static Class89 method987(Class243 class243, int i, int i_81_) {
		byte[] is = class243.method2315(i, i_81_, (byte) -43);
		if (is == null)
			return null;
		return method982(is)[0];
	}

	public void method988(int i) {
		int i_82_ = -1;
		if (anIntArray817.length < 255) {
			for (int i_83_ = 0; i_83_ < anIntArray817.length; i_83_++) {
				if (anIntArray817[i_83_] == i) {
					i_82_ = i_83_;
					break;
				}
			}
			if (i_82_ == -1) {
				i_82_ = anIntArray817.length;
				int[] is = new int[anIntArray817.length + 1];
				Class425.method5741(anIntArray817, 0, is, 0, anIntArray817.length);
				anIntArray817 = is;
				is[i_82_] = i;
			}
		} else {
			int i_84_ = 2147483647;
			int i_85_ = i >> 16 & 0xff;
			int i_86_ = i >> 8 & 0xff;
			int i_87_ = i & 0xff;
			for (int i_88_ = 0; i_88_ < anIntArray817.length; i_88_++) {
				int i_89_ = anIntArray817[i_88_];
				int i_90_ = i_89_ >> 16 & 0xff;
				int i_91_ = i_89_ >> 8 & 0xff;
				int i_92_ = i_89_ & 0xff;
				int i_93_ = i_85_ - i_90_;
				if (i_93_ < 0)
					i_93_ = -i_93_;
				int i_94_ = i_86_ - i_91_;
				if (i_94_ < 0)
					i_94_ = -i_94_;
				int i_95_ = i_87_ - i_92_;
				if (i_95_ < 0)
					i_95_ = -i_95_;
				int i_96_ = i_93_ + i_94_ + i_95_;
				if (i_96_ < i_84_) {
					i_84_ = i_96_;
					i_82_ = i_88_;
				}
			}
		}
		for (int i_97_ = anInt816 - 1; i_97_ > 0; i_97_--) {
			int i_98_ = i_97_ * anInt812;
			for (int i_99_ = anInt812 - 1; i_99_ > 0; i_99_--) {
				if (anIntArray817[aByteArray818[i_99_ + i_98_] & 0xff] == 0 && ((anIntArray817[aByteArray818[i_99_ + i_98_ - 1 - anInt812] & 0xff]) != 0))
					aByteArray818[i_99_ + i_98_] = (byte) i_82_;
			}
		}
	}

	public void method989() {
		byte[] is = new byte[anInt812 * anInt816];
		int i = 0;
		if (aByteArray819 == null) {
			for (int i_100_ = 0; i_100_ < anInt812; i_100_++) {
				for (int i_101_ = anInt816 - 1; i_101_ >= 0; i_101_--)
					is[i++] = aByteArray818[i_100_ + i_101_ * anInt812];
			}
			aByteArray818 = is;
		} else {
			byte[] is_102_ = new byte[anInt812 * anInt816];
			for (int i_103_ = 0; i_103_ < anInt812; i_103_++) {
				for (int i_104_ = anInt816 - 1; i_104_ >= 0; i_104_--) {
					is[i] = aByteArray818[i_103_ + i_104_ * anInt812];
					is_102_[i++] = aByteArray819[i_103_ + i_104_ * anInt812];
				}
			}
			aByteArray818 = is;
			aByteArray819 = is_102_;
		}
		int i_105_ = anInt811;
		anInt811 = anInt815;
		anInt815 = anInt813;
		anInt813 = anInt814;
		anInt814 = anInt811;
		i_105_ = anInt816;
		anInt816 = anInt812;
		anInt812 = i_105_;
	}

	public int[] method990() {
		int i = method983();
		int[] is = new int[i * method994()];
		if (aByteArray819 != null) {
			for (int i_106_ = 0; i_106_ < anInt816; i_106_++) {
				int i_107_ = i_106_ * anInt812;
				int i_108_ = anInt815 + (i_106_ + anInt811) * i;
				for (int i_109_ = 0; i_109_ < anInt812; i_109_++) {
					is[i_108_++] = (aByteArray819[i_107_] << 24 | anIntArray817[aByteArray818[i_107_] & 0xff]);
					i_107_++;
				}
			}
		} else {
			for (int i_110_ = 0; i_110_ < anInt816; i_110_++) {
				int i_111_ = i_110_ * anInt812;
				int i_112_ = anInt815 + (i_110_ + anInt811) * i;
				for (int i_113_ = 0; i_113_ < anInt812; i_113_++) {
					int i_114_ = anIntArray817[aByteArray818[i_111_++] & 0xff];
					if (i_114_ != 0)
						is[i_112_++] = ~0xffffff | i_114_;
					else
						is[i_112_++] = 0;
				}
			}
		}
		return is;
	}

	public void method991(int i, int i_115_, int i_116_) {
		for (int i_117_ = 1; i_117_ < anIntArray817.length; i_117_++) {
			if (anIntArray817[i_117_] != 1 && anIntArray817[i_117_] != 16711935) {
				int i_118_ = anIntArray817[i_117_] >> 16 & 0xff;
				i_118_ += i;
				if (i_118_ < 0)
					i_118_ = 0;
				else if (i_118_ > 255)
					i_118_ = 255;
				int i_119_ = anIntArray817[i_117_] >> 8 & 0xff;
				i_119_ += i_115_;
				if (i_119_ < 0)
					i_119_ = 0;
				else if (i_119_ > 255)
					i_119_ = 255;
				int i_120_ = anIntArray817[i_117_] >> 0 & 0xff;
				i_120_ += i_116_;
				if (i_120_ < 0)
					i_120_ = 0;
				else if (i_120_ > 255)
					i_120_ = 255;
				anIntArray817[i_117_] = i_118_ << 16 | i_119_ << 8 | i_120_;
			}
		}
	}

	public void method992() {
		byte[] is = aByteArray818;
		if (aByteArray819 == null) {
			for (int i = anInt816 - 1; i >= 0; i--) {
				int i_121_ = i * anInt812;
				for (int i_122_ = (i + 1) * anInt812; i_121_ < i_122_; i_121_++) {
					i_122_--;
					byte i_123_ = is[i_121_];
					is[i_121_] = is[i_122_];
					is[i_122_] = i_123_;
				}
			}
		} else {
			byte[] is_124_ = aByteArray819;
			for (int i = anInt816 - 1; i >= 0; i--) {
				int i_125_ = i * anInt812;
				for (int i_126_ = (i + 1) * anInt812; i_125_ < i_126_; i_125_++) {
					i_126_--;
					byte i_127_ = is[i_125_];
					is[i_125_] = is[i_126_];
					is[i_126_] = i_127_;
					i_127_ = is_124_[i_125_];
					is_124_[i_125_] = is_124_[i_126_];
					is_124_[i_126_] = i_127_;
				}
			}
		}
		int i = anInt815;
		anInt815 = anInt814;
		anInt814 = i;
	}

	Class89() {
		/* empty */
	}

	public static Class89[] method993(Class243 class243, int i, int i_128_) {
		byte[] is = class243.method2315(i, i_128_, (byte) 4);
		if (is == null)
			return null;
		return method982(is);
	}

	public int method994() {
		return anInt816 + anInt811 + anInt813;
	}
}
