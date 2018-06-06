/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91 {
	public int anInt953;
	public int anInt954;
	public int[] anIntArray955;
	public int anInt956;
	public int anInt957;
	public int anInt958;
	public int anInt959;
	public byte[] aByteArray960;
	public byte[] aByteArray961;

	public static Class91[] method1514(Index class317, int i, int i_0_) {
		byte[] is = class317.getFile(i, i_0_, -1211833322);
		if (is == null)
			return null;
		return method1517(is);
	}

	public static Class91 method1515(Index class317, int i) {
		byte[] is = class317.getFile(i, -560964409);
		if (is == null)
			return null;
		return method1517(is)[0];
	}

	public static Class91[] method1517(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		class282_sub35.index = (is.length - 2) * -1115476867;
		int i = class282_sub35.readUnsignedShort();
		Class91[] class91s = new Class91[i];
		for (int i_19_ = 0; i_19_ < i; i_19_++)
			class91s[i_19_] = new Class91();
		class282_sub35.index = (is.length - 7 - i * 8) * -1115476867;
		int i_20_ = class282_sub35.readUnsignedShort();
		int i_21_ = class282_sub35.readUnsignedShort();
		int i_22_ = (class282_sub35.readUnsignedByte() & 0xff) + 1;
		for (int i_23_ = 0; i_23_ < i; i_23_++)
			class91s[i_23_].anInt956 = class282_sub35.readUnsignedShort();
		for (int i_24_ = 0; i_24_ < i; i_24_++)
			class91s[i_24_].anInt959 = class282_sub35.readUnsignedShort();
		for (int i_25_ = 0; i_25_ < i; i_25_++)
			class91s[i_25_].anInt957 = class282_sub35.readUnsignedShort();
		for (int i_26_ = 0; i_26_ < i; i_26_++)
			class91s[i_26_].anInt954 = class282_sub35.readUnsignedShort();
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			Class91 class91 = class91s[i_27_];
			class91.anInt958 = i_20_ - class91.anInt957 - class91.anInt956;
			class91.anInt953 = i_21_ - class91.anInt954 - class91.anInt959;
		}
		class282_sub35.index = (is.length - 7 - i * 8 - (i_22_ - 1) * 3) * -1115476867;
		int[] is_28_ = new int[i_22_];
		for (int i_29_ = 1; i_29_ < i_22_; i_29_++) {
			is_28_[i_29_] = class282_sub35.read24BitUnsignedInteger();
			if (is_28_[i_29_] == 0)
				is_28_[i_29_] = 1;
		}
		for (int i_30_ = 0; i_30_ < i; i_30_++)
			class91s[i_30_].anIntArray955 = is_28_;
		class282_sub35.index = 0;
		for (int i_31_ = 0; i_31_ < i; i_31_++) {
			Class91 class91 = class91s[i_31_];
			int i_32_ = class91.anInt957 * class91.anInt954;
			class91.aByteArray960 = new byte[i_32_];
			int i_33_ = class282_sub35.readUnsignedByte();
			if ((i_33_ & 0x2) == 0) {
				if ((i_33_ & 0x1) == 0) {
					for (int i_34_ = 0; i_34_ < i_32_; i_34_++)
						class91.aByteArray960[i_34_] = class282_sub35.readByte((short) -19464);
				} else {
					for (int i_35_ = 0; i_35_ < class91.anInt957; i_35_++) {
						for (int i_36_ = 0; i_36_ < class91.anInt954; i_36_++)
							class91.aByteArray960[(i_35_ + i_36_ * class91.anInt957)] = class282_sub35.readByte((short) -9979);
					}
				}
			} else {
				boolean bool = false;
				class91.aByteArray961 = new byte[i_32_];
				if ((i_33_ & 0x1) == 0) {
					for (int i_37_ = 0; i_37_ < i_32_; i_37_++)
						class91.aByteArray960[i_37_] = class282_sub35.readByte((short) -11258);
					for (int i_38_ = 0; i_38_ < i_32_; i_38_++) {
						byte i_39_ = (class91.aByteArray961[i_38_] = class282_sub35.readByte((short) -29337));
						bool = bool | i_39_ != -1;
					}
				} else {
					for (int i_40_ = 0; i_40_ < class91.anInt957; i_40_++) {
						for (int i_41_ = 0; i_41_ < class91.anInt954; i_41_++)
							class91.aByteArray960[(i_40_ + i_41_ * class91.anInt957)] = class282_sub35.readByte((short) -5480);
					}
					for (int i_42_ = 0; i_42_ < class91.anInt957; i_42_++) {
						for (int i_43_ = 0; i_43_ < class91.anInt954; i_43_++) {
							byte i_44_ = (class91.aByteArray961[i_42_ + i_43_ * class91.anInt957] = class282_sub35.readByte((short) -2518));
							bool = bool | i_44_ != -1;
						}
					}
				}
				if (!bool)
					class91.aByteArray961 = null;
			}
		}
		return class91s;
	}

	public int method1519() {
		return anInt957 + anInt956 + anInt958;
	}

	public int method1520() {
		return anInt954 + anInt959 + anInt953;
	}

	public static Class91 method1522(Index class317, int i, int i_60_) {
		byte[] is = class317.getFile(i, i_60_, -2041689556);
		if (is == null)
			return null;
		return method1517(is)[0];
	}

	public void method1523() {
		int i = method1519();
		int i_61_ = method1520();
		if (anInt957 != i || anInt954 != i_61_) {
			byte[] is = new byte[i * i_61_];
			if (aByteArray961 != null) {
				byte[] is_62_ = new byte[i * i_61_];
				for (int i_63_ = 0; i_63_ < anInt954; i_63_++) {
					int i_64_ = i_63_ * anInt957;
					int i_65_ = (i_63_ + anInt959) * i + anInt956;
					for (int i_66_ = 0; i_66_ < anInt957; i_66_++) {
						is[i_65_] = aByteArray960[i_64_];
						is_62_[i_65_++] = aByteArray961[i_64_++];
					}
				}
				aByteArray961 = is_62_;
			} else {
				for (int i_67_ = 0; i_67_ < anInt954; i_67_++) {
					int i_68_ = i_67_ * anInt957;
					int i_69_ = (i_67_ + anInt959) * i + anInt956;
					for (int i_70_ = 0; i_70_ < anInt957; i_70_++)
						is[i_69_++] = aByteArray960[i_68_++];
				}
			}
			anInt953 = 0;
			anInt959 = 0;
			anInt958 = 0;
			anInt956 = 0;
			anInt957 = i;
			anInt954 = i_61_;
			aByteArray960 = is;
		}
	}

	public void method1524(int i) {
		int i_71_ = -1;
		if (anIntArray955.length < 255) {
			for (int i_72_ = 0; i_72_ < anIntArray955.length; i_72_++) {
				if (anIntArray955[i_72_] == i) {
					i_71_ = i_72_;
					break;
				}
			}
			if (i_71_ == -1) {
				i_71_ = anIntArray955.length;
				int[] is = new int[anIntArray955.length + 1];
				Class503.method8362(anIntArray955, 0, is, 0, anIntArray955.length);
				anIntArray955 = is;
				is[i_71_] = i;
			}
		} else {
			int i_73_ = 2147483647;
			int i_74_ = i >> 16 & 0xff;
			int i_75_ = i >> 8 & 0xff;
			int i_76_ = i & 0xff;
			for (int i_77_ = 0; i_77_ < anIntArray955.length; i_77_++) {
				int i_78_ = anIntArray955[i_77_];
				int i_79_ = i_78_ >> 16 & 0xff;
				int i_80_ = i_78_ >> 8 & 0xff;
				int i_81_ = i_78_ & 0xff;
				int i_82_ = i_74_ - i_79_;
				if (i_82_ < 0)
					i_82_ = -i_82_;
				int i_83_ = i_75_ - i_80_;
				if (i_83_ < 0)
					i_83_ = -i_83_;
				int i_84_ = i_76_ - i_81_;
				if (i_84_ < 0)
					i_84_ = -i_84_;
				int i_85_ = i_82_ + i_83_ + i_84_;
				if (i_85_ < i_73_) {
					i_73_ = i_85_;
					i_71_ = i_77_;
				}
			}
		}
		for (int i_86_ = anInt954 - 1; i_86_ > 0; i_86_--) {
			int i_87_ = i_86_ * anInt957;
			for (int i_88_ = anInt957 - 1; i_88_ > 0; i_88_--) {
				if (anIntArray955[aByteArray960[i_88_ + i_87_] & 0xff] == 0 && ((anIntArray955[aByteArray960[i_88_ + i_87_ - 1 - anInt957] & 0xff]) != 0))
					aByteArray960[i_88_ + i_87_] = (byte) i_71_;
			}
		}
	}

	public void method1525() {
		byte[] is = aByteArray960;
		if (aByteArray961 == null) {
			for (int i = anInt954 - 1; i >= 0; i--) {
				int i_89_ = i * anInt957;
				for (int i_90_ = (i + 1) * anInt957; i_89_ < i_90_; i_89_++) {
					i_90_--;
					byte i_91_ = is[i_89_];
					is[i_89_] = is[i_90_];
					is[i_90_] = i_91_;
				}
			}
		} else {
			byte[] is_92_ = aByteArray961;
			for (int i = anInt954 - 1; i >= 0; i--) {
				int i_93_ = i * anInt957;
				for (int i_94_ = (i + 1) * anInt957; i_93_ < i_94_; i_93_++) {
					i_94_--;
					byte i_95_ = is[i_93_];
					is[i_93_] = is[i_94_];
					is[i_94_] = i_95_;
					i_95_ = is_92_[i_93_];
					is_92_[i_93_] = is_92_[i_94_];
					is_92_[i_94_] = i_95_;
				}
			}
		}
		int i = anInt956;
		anInt956 = anInt958;
		anInt958 = i;
	}

	public void method1526() {
		byte[] is = aByteArray960;
		if (aByteArray961 == null) {
			for (int i = (anInt954 >> 1) - 1; i >= 0; i--) {
				int i_96_ = i * anInt957;
				int i_97_ = (anInt954 - i - 1) * anInt957;
				for (int i_98_ = -anInt957; i_98_ < 0; i_98_++) {
					byte i_99_ = is[i_96_];
					is[i_96_] = is[i_97_];
					is[i_97_] = i_99_;
					i_96_++;
					i_97_++;
				}
			}
		} else {
			byte[] is_100_ = aByteArray961;
			for (int i = (anInt954 >> 1) - 1; i >= 0; i--) {
				int i_101_ = i * anInt957;
				int i_102_ = (anInt954 - i - 1) * anInt957;
				for (int i_103_ = -anInt957; i_103_ < 0; i_103_++) {
					byte i_104_ = is[i_101_];
					is[i_101_] = is[i_102_];
					is[i_102_] = i_104_;
					i_104_ = is_100_[i_101_];
					is_100_[i_101_] = is_100_[i_102_];
					is_100_[i_102_] = i_104_;
					i_101_++;
					i_102_++;
				}
			}
		}
		int i = anInt959;
		anInt959 = anInt953;
		anInt953 = i;
	}

	public void method1527() {
		byte[] is = new byte[anInt957 * anInt954];
		int i = 0;
		if (aByteArray961 == null) {
			for (int i_105_ = 0; i_105_ < anInt957; i_105_++) {
				for (int i_106_ = anInt954 - 1; i_106_ >= 0; i_106_--)
					is[i++] = aByteArray960[i_105_ + i_106_ * anInt957];
			}
			aByteArray960 = is;
		} else {
			byte[] is_107_ = new byte[anInt957 * anInt954];
			for (int i_108_ = 0; i_108_ < anInt957; i_108_++) {
				for (int i_109_ = anInt954 - 1; i_109_ >= 0; i_109_--) {
					is[i] = aByteArray960[i_108_ + i_109_ * anInt957];
					is_107_[i++] = aByteArray961[i_108_ + i_109_ * anInt957];
				}
			}
			aByteArray960 = is;
			aByteArray961 = is_107_;
		}
		int i_110_ = anInt959;
		anInt959 = anInt956;
		anInt956 = anInt953;
		anInt953 = anInt958;
		anInt958 = anInt959;
		i_110_ = anInt954;
		anInt954 = anInt957;
		anInt957 = i_110_;
	}

	public int[] method1528() {
		int i = method1519();
		int[] is = new int[i * method1520()];
		if (aByteArray961 != null) {
			for (int i_111_ = 0; i_111_ < anInt954; i_111_++) {
				int i_112_ = i_111_ * anInt957;
				int i_113_ = anInt956 + (i_111_ + anInt959) * i;
				for (int i_114_ = 0; i_114_ < anInt957; i_114_++) {
					is[i_113_++] = (aByteArray961[i_112_] << 24 | anIntArray955[aByteArray960[i_112_] & 0xff]);
					i_112_++;
				}
			}
		} else {
			for (int i_115_ = 0; i_115_ < anInt954; i_115_++) {
				int i_116_ = i_115_ * anInt957;
				int i_117_ = anInt956 + (i_115_ + anInt959) * i;
				for (int i_118_ = 0; i_118_ < anInt957; i_118_++) {
					int i_119_ = anIntArray955[aByteArray960[i_116_++] & 0xff];
					if (i_119_ != 0)
						is[i_117_++] = ~0xffffff | i_119_;
					else
						is[i_117_++] = 0;
				}
			}
		}
		return is;
	}

	public void method1529(int i, int i_120_, int i_121_) {
		for (int i_122_ = 1; i_122_ < anIntArray955.length; i_122_++) {
			if (anIntArray955[i_122_] != 1 && anIntArray955[i_122_] != 16711935) {
				int i_123_ = anIntArray955[i_122_] >> 16 & 0xff;
				i_123_ += i;
				if (i_123_ < 0)
					i_123_ = 0;
				else if (i_123_ > 255)
					i_123_ = 255;
				int i_124_ = anIntArray955[i_122_] >> 8 & 0xff;
				i_124_ += i_120_;
				if (i_124_ < 0)
					i_124_ = 0;
				else if (i_124_ > 255)
					i_124_ = 255;
				int i_125_ = anIntArray955[i_122_] >> 0 & 0xff;
				i_125_ += i_121_;
				if (i_125_ < 0)
					i_125_ = 0;
				else if (i_125_ > 255)
					i_125_ = 255;
				anIntArray955[i_122_] = i_123_ << 16 | i_124_ << 8 | i_125_;
			}
		}
	}

	public static Class91[] method1534(Index class317, int i) {
		byte[] is = class317.getFile(i, -415130062);
		if (is == null)
			return null;
		return method1517(is);
	}

	public void method1536(int i) {
		int i_163_ = -1;
		if (anIntArray955.length < 255) {
			for (int i_164_ = 0; i_164_ < anIntArray955.length; i_164_++) {
				if (anIntArray955[i_164_] == i) {
					i_163_ = i_164_;
					break;
				}
			}
			if (i_163_ == -1) {
				i_163_ = anIntArray955.length;
				int[] is = new int[anIntArray955.length + 1];
				Class503.method8362(anIntArray955, 0, is, 0, anIntArray955.length);
				anIntArray955 = is;
				is[i_163_] = i;
			}
		} else {
			int i_165_ = 2147483647;
			int i_166_ = i >> 16 & 0xff;
			int i_167_ = i >> 8 & 0xff;
			int i_168_ = i & 0xff;
			for (int i_169_ = 0; i_169_ < anIntArray955.length; i_169_++) {
				int i_170_ = anIntArray955[i_169_];
				int i_171_ = i_170_ >> 16 & 0xff;
				int i_172_ = i_170_ >> 8 & 0xff;
				int i_173_ = i_170_ & 0xff;
				int i_174_ = i_166_ - i_171_;
				if (i_174_ < 0)
					i_174_ = -i_174_;
				int i_175_ = i_167_ - i_172_;
				if (i_175_ < 0)
					i_175_ = -i_175_;
				int i_176_ = i_168_ - i_173_;
				if (i_176_ < 0)
					i_176_ = -i_176_;
				int i_177_ = i_174_ + i_175_ + i_176_;
				if (i_177_ < i_165_) {
					i_165_ = i_177_;
					i_163_ = i_169_;
				}
			}
		}
		int i_178_ = 0;
		byte[] is = new byte[anInt957 * anInt954];
		for (int i_179_ = 0; i_179_ < anInt954; i_179_++) {
			for (int i_180_ = 0; i_180_ < anInt957; i_180_++) {
				int i_181_ = aByteArray960[i_178_] & 0xff;
				if (anIntArray955[i_181_] == 0) {
					if (i_180_ > 0 && (anIntArray955[aByteArray960[i_178_ - 1] & 0xff] != 0))
						i_181_ = i_163_;
					else if (i_179_ > 0 && anIntArray955[(aByteArray960[i_178_ - anInt957] & 0xff)] != 0)
						i_181_ = i_163_;
					else if (i_180_ < anInt957 - 1 && (anIntArray955[aByteArray960[i_178_ + 1] & 0xff]) != 0)
						i_181_ = i_163_;
					else if (i_179_ < anInt954 - 1 && anIntArray955[(aByteArray960[i_178_ + anInt957] & 0xff)] != 0)
						i_181_ = i_163_;
				}
				is[i_178_++] = (byte) i_181_;
			}
		}
		aByteArray960 = is;
	}
	
	Class91() {
		/* empty */
	}

	public void method1554(int i) {
		int i_304_ = method1519();
		int i_305_ = method1520();
		if (anInt957 != i_304_ || anInt954 != i_305_) {
			int i_306_ = i;
			if (i_306_ > anInt956)
				i_306_ = anInt956;
			int i_307_ = i;
			if (i_307_ + anInt956 + anInt957 > i_304_)
				i_307_ = i_304_ - anInt956 - anInt957;
			int i_308_ = i;
			if (i_308_ > anInt959)
				i_308_ = anInt959;
			int i_309_ = i;
			if (i_309_ + anInt959 + anInt954 > i_305_)
				i_309_ = i_305_ - anInt959 - anInt954;
			int i_310_ = anInt957 + i_306_ + i_307_;
			int i_311_ = anInt954 + i_308_ + i_309_;
			byte[] is = new byte[i_310_ * i_311_];
			if (aByteArray961 == null) {
				for (int i_312_ = 0; i_312_ < anInt954; i_312_++) {
					int i_313_ = i_312_ * anInt957;
					int i_314_ = (i_312_ + i_308_) * i_310_ + i_306_;
					for (int i_315_ = 0; i_315_ < anInt957; i_315_++)
						is[i_314_++] = aByteArray960[i_313_++];
				}
			} else {
				byte[] is_316_ = new byte[i_310_ * i_311_];
				for (int i_317_ = 0; i_317_ < anInt954; i_317_++) {
					int i_318_ = i_317_ * anInt957;
					int i_319_ = (i_317_ + i_308_) * i_310_ + i_306_;
					for (int i_320_ = 0; i_320_ < anInt957; i_320_++) {
						is_316_[i_319_] = aByteArray961[i_318_];
						is[i_319_++] = aByteArray960[i_318_++];
					}
				}
				aByteArray961 = is_316_;
			}
			anInt956 -= i_306_;
			anInt959 -= i_308_;
			anInt958 -= i_307_;
			anInt953 -= i_309_;
			anInt957 = i_310_;
			anInt954 = i_311_;
			aByteArray960 = is;
		}
	}
}
