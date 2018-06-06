
/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class74 {
	Class505_Sub2 aClass505_Sub2_730;
	Class390_Sub1 aClass390_Sub1_731;
	int anInt732;
	int anInt733;
	int anInt734;
	int anInt735;
	byte[] aByteArray736;
	int anInt737;
	Class71[][] aClass71ArrayArray738;

	void method1311(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_0_) {
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453) + 1;
		i_0_ += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455) + 1;
		int i_1_ = i + i_0_ * ((Class74) this).anInt732;
		int i_2_ = 0;
		int i_3_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10451);
		int i_4_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10452);
		int i_5_ = ((Class74) this).anInt732 - i_4_;
		int i_6_ = 0;
		if (i_0_ <= 0) {
			int i_7_ = 1 - i_0_;
			i_3_ -= i_7_;
			i_2_ += i_7_ * i_4_;
			i_1_ += i_7_ * ((Class74) this).anInt732;
			i_0_ = 1;
		}
		if (i_0_ + i_3_ >= ((Class74) this).anInt734) {
			int i_8_ = i_0_ + i_3_ + 1 - ((Class74) this).anInt734;
			i_3_ -= i_8_;
		}
		if (i <= 0) {
			int i_9_ = 1 - i;
			i_4_ -= i_9_;
			i_2_ += i_9_;
			i_1_ += i_9_;
			i_6_ += i_9_;
			i_5_ += i_9_;
			i = 1;
		}
		if (i + i_4_ >= ((Class74) this).anInt732) {
			int i_10_ = i + i_4_ + 1 - ((Class74) this).anInt732;
			i_4_ -= i_10_;
			i_6_ += i_10_;
			i_5_ += i_10_;
		}
		if (i_4_ > 0 && i_3_ > 0) {
			method1318(((Class74) this).aByteArray736, (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).aByteArray10454), i_2_, i_1_, i_4_, i_3_, i_5_, i_6_);
			method1326(i, i_0_, i_4_, i_3_);
		}
	}

	void method1312() {
		((Class74) this).aClass71ArrayArray738 = (new Class71[((Class74) this).anInt735][((Class74) this).anInt733]);
		for (int i = 0; i < ((Class74) this).anInt733; i++) {
			for (int i_11_ = 0; i_11_ < ((Class74) this).anInt735; i_11_++) {
				((Class74) this).aClass71ArrayArray738[i_11_][i] = new Class71(((Class74) this).aClass505_Sub2_730, this, ((Class74) this).aClass390_Sub1_731, i_11_, i, ((Class74) this).anInt737, i_11_ * 128 + 1, i * 128 + 1);
				if (((Class71) ((Class74) this).aClass71ArrayArray738[i_11_][i]).anInt716 == 0)
					((Class74) this).aClass71ArrayArray738[i_11_][i] = null;
			}
		}
	}

	void method1313(int i, int i_12_, int i_13_, int i_14_) {
		if (((Class74) this).aClass71ArrayArray738 != null) {
			int i_15_ = i - 1 >> 7;
			int i_16_ = i - 1 + i_13_ - 1 >> 7;
			int i_17_ = i_12_ - 1 >> 7;
			int i_18_ = i_12_ - 1 + i_14_ - 1 >> 7;
			for (int i_19_ = i_15_; i_19_ <= i_16_; i_19_++) {
				Class71[] class71s = ((Class74) this).aClass71ArrayArray738[i_19_];
				for (int i_20_ = i_17_; i_20_ <= i_18_; i_20_++) {
					if (class71s[i_20_] != null)
						((Class71) class71s[i_20_]).aBool710 = true;
				}
			}
		}
	}

	void method1314(Class48 class48, int i, int i_21_, int i_22_, boolean[][] bools, boolean bool) {
		float f = 1.0F / (float) (((Class505_Sub2) ((Class74) this).aClass505_Sub2_730).anInt8775 * 128);
		if (bool) {
			for (int i_23_ = 0; i_23_ < ((Class74) this).anInt733; i_23_++) {
				int i_24_ = i_23_ << ((Class74) this).anInt737;
				int i_25_ = i_23_ + 1 << ((Class74) this).anInt737;
				for (int i_26_ = 0; i_26_ < ((Class74) this).anInt735; i_26_++) {
					if (((Class74) this).aClass71ArrayArray738[i_26_][i_23_] != null) {
						int i_27_ = i_26_ << ((Class74) this).anInt737;
						int i_28_ = i_26_ + 1 << ((Class74) this).anInt737;
						while_48_: for (int i_29_ = i_27_; i_29_ < i_28_; i_29_++) {
							if (i_29_ - i >= -i_22_ && i_29_ - i <= i_22_) {
								for (int i_30_ = i_24_; i_30_ < i_25_; i_30_++) {
									if (i_30_ - i_21_ >= -i_22_ && i_30_ - i_21_ <= i_22_ && (bools[i_29_ - i + i_22_][i_30_ - i_21_ + i_22_])) {
										class48.aClass384_454.method6525(f, f, 1.0F, 1.0F);
										class48.aClass384_454.buf[12] = (float) -i_26_;
										class48.aClass384_454.buf[13] = (float) -i_23_;
										((Class74) this).aClass71ArrayArray738[i_26_][i_23_].method1288(class48);
										break while_48_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = (new int[((Class74) this).anInt733 * ((Class74) this).anInt735]);
			ByteBuffer bytebuffer = ((Class74) this).aClass505_Sub2_730.aByteBuffer8838;
			bytebuffer.clear();
			int i_31_ = 0;
			for (int i_32_ = 0; i_32_ < ((Class74) this).anInt733; i_32_++) {
				int i_33_ = i_32_ << ((Class74) this).anInt737;
				int i_34_ = i_32_ + 1 << ((Class74) this).anInt737;
				for (int i_35_ = 0; i_35_ < ((Class74) this).anInt735; i_35_++) {
					Class71 class71 = ((Class74) this).aClass71ArrayArray738[i_35_][i_32_];
					int i_36_ = 0;
					if (class71 != null) {
						int i_37_ = i_35_ << ((Class74) this).anInt737;
						int i_38_ = i_35_ + 1 << ((Class74) this).anInt737;
						for (int i_39_ = i_33_; i_39_ < i_34_; i_39_++) {
							if (i_39_ - i_21_ >= -i_22_ && i_39_ - i_21_ <= i_22_) {
								int i_40_ = (i_39_ * ((((Class74) this).aClass390_Sub1_731.anInt4776) * -1843860823) + i_37_);
								for (int i_41_ = i_37_; i_41_ < i_38_; i_41_++) {
									if (i_41_ - i >= -i_22_ && i_41_ - i <= i_22_ && (bools[i_41_ - i + i_22_][i_39_ - i_21_ + i_22_])) {
										short[] is_42_ = (((Class390_Sub1) (((Class74) this).aClass390_Sub1_731)).aShortArrayArray8534[i_40_]);
										if (is_42_ != null) {
											for (int i_43_ = 0; i_43_ < is_42_.length; i_43_++) {
												bytebuffer.putShort(is_42_[i_43_]);
												i_36_++;
											}
										}
									}
									i_40_++;
								}
							}
						}
					}
					is[i_31_] = i_36_;
					i_31_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_44_ = bytebuffer.position();
				Interface32 interface32 = ((Class74) this).aClass505_Sub2_730.method13911(i_44_ / 2);
				interface32.method42(0, i_44_, (((Class74) this).aClass505_Sub2_730.aLong8695));
				int i_45_ = 0;
				i_31_ = 0;
				for (int i_46_ = 0; i_46_ < ((Class74) this).anInt733; i_46_++) {
					for (int i_47_ = 0; i_47_ < ((Class74) this).anInt735; i_47_++) {
						if (is[i_31_] != 0) {
							class48.aClass384_454.method6525(f, f, 1.0F, 1.0F);
							class48.aClass384_454.buf[12] = (float) -i_47_;
							class48.aClass384_454.buf[13] = (float) -i_46_;
							((Class74) this).aClass71ArrayArray738[i_47_][i_46_].method1290(class48, interface32, i_45_, is[i_31_] / 3);
							i_45_ += is[i_31_];
						}
						i_31_++;
					}
				}
			}
		}
	}

	void method1315(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_48_) {
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453) + 1;
		i_48_ += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455) + 1;
		int i_49_ = i + i_48_ * ((Class74) this).anInt732;
		int i_50_ = 0;
		int i_51_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10451);
		int i_52_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10452);
		int i_53_ = ((Class74) this).anInt732 - i_52_;
		int i_54_ = 0;
		if (i_48_ <= 0) {
			int i_55_ = 1 - i_48_;
			i_51_ -= i_55_;
			i_50_ += i_55_ * i_52_;
			i_49_ += i_55_ * ((Class74) this).anInt732;
			i_48_ = 1;
		}
		if (i_48_ + i_51_ >= ((Class74) this).anInt734) {
			int i_56_ = i_48_ + i_51_ + 1 - ((Class74) this).anInt734;
			i_51_ -= i_56_;
		}
		if (i <= 0) {
			int i_57_ = 1 - i;
			i_52_ -= i_57_;
			i_50_ += i_57_;
			i_49_ += i_57_;
			i_54_ += i_57_;
			i_53_ += i_57_;
			i = 1;
		}
		if (i + i_52_ >= ((Class74) this).anInt732) {
			int i_58_ = i + i_52_ + 1 - ((Class74) this).anInt732;
			i_52_ -= i_58_;
			i_54_ += i_58_;
			i_53_ += i_58_;
		}
		if (i_52_ > 0 && i_51_ > 0) {
			method1330(((Class74) this).aByteArray736, (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).aByteArray10454), i_50_, i_49_, i_52_, i_51_, i_53_, i_54_);
			method1326(i, i_48_, i_52_, i_51_);
		}
	}

	boolean method1316(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_59_) {
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453) + 1;
		i_59_ += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455) + 1;
		int i_60_ = i + i_59_ * ((Class74) this).anInt732;
		int i_61_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10451);
		int i_62_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10452);
		int i_63_ = ((Class74) this).anInt732 - i_62_;
		if (i_59_ <= 0) {
			int i_64_ = 1 - i_59_;
			i_61_ -= i_64_;
			i_60_ += i_64_ * ((Class74) this).anInt732;
			i_59_ = 1;
		}
		if (i_59_ + i_61_ >= ((Class74) this).anInt734) {
			int i_65_ = i_59_ + i_61_ + 1 - ((Class74) this).anInt734;
			i_61_ -= i_65_;
		}
		if (i <= 0) {
			int i_66_ = 1 - i;
			i_62_ -= i_66_;
			i_60_ += i_66_;
			i_63_ += i_66_;
			i = 1;
		}
		if (i + i_62_ >= ((Class74) this).anInt732) {
			int i_67_ = i + i_62_ + 1 - ((Class74) this).anInt732;
			i_62_ -= i_67_;
			i_63_ += i_67_;
		}
		if (i_62_ <= 0 || i_61_ <= 0)
			return false;
		int i_68_ = 8;
		i_63_ += (i_68_ - 1) * ((Class74) this).anInt732;
		return method1328(((Class74) this).aByteArray736, i_60_, i_62_, i_61_, i_63_, i_68_);
	}

	void method1317(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_69_) {
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453) + 1;
		i_69_ += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455) + 1;
		int i_70_ = i + i_69_ * ((Class74) this).anInt732;
		int i_71_ = 0;
		int i_72_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10451);
		int i_73_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10452);
		int i_74_ = ((Class74) this).anInt732 - i_73_;
		int i_75_ = 0;
		if (i_69_ <= 0) {
			int i_76_ = 1 - i_69_;
			i_72_ -= i_76_;
			i_71_ += i_76_ * i_73_;
			i_70_ += i_76_ * ((Class74) this).anInt732;
			i_69_ = 1;
		}
		if (i_69_ + i_72_ >= ((Class74) this).anInt734) {
			int i_77_ = i_69_ + i_72_ + 1 - ((Class74) this).anInt734;
			i_72_ -= i_77_;
		}
		if (i <= 0) {
			int i_78_ = 1 - i;
			i_73_ -= i_78_;
			i_71_ += i_78_;
			i_70_ += i_78_;
			i_75_ += i_78_;
			i_74_ += i_78_;
			i = 1;
		}
		if (i + i_73_ >= ((Class74) this).anInt732) {
			int i_79_ = i + i_73_ + 1 - ((Class74) this).anInt732;
			i_73_ -= i_79_;
			i_75_ += i_79_;
			i_74_ += i_79_;
		}
		if (i_73_ > 0 && i_72_ > 0) {
			method1318(((Class74) this).aByteArray736, (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).aByteArray10454), i_71_, i_70_, i_73_, i_72_, i_74_, i_75_);
			method1326(i, i_69_, i_73_, i_72_);
		}
	}

	static final void method1318(byte[] is, byte[] is_80_, int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_) {
		int i_86_ = -(i_82_ >> 2);
		i_82_ = -(i_82_ & 0x3);
		for (int i_87_ = -i_83_; i_87_ < 0; i_87_++) {
			for (int i_88_ = i_86_; i_88_ < 0; i_88_++) {
				is[i_81_++] += is_80_[i++];
				is[i_81_++] += is_80_[i++];
				is[i_81_++] += is_80_[i++];
				is[i_81_++] += is_80_[i++];
			}
			for (int i_89_ = i_82_; i_89_ < 0; i_89_++)
				is[i_81_++] += is_80_[i++];
			i_81_ += i_84_;
			i += i_85_;
		}
	}

	void method1319(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_90_) {
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453) + 1;
		i_90_ += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455) + 1;
		int i_91_ = i + i_90_ * ((Class74) this).anInt732;
		int i_92_ = 0;
		int i_93_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10451);
		int i_94_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10452);
		int i_95_ = ((Class74) this).anInt732 - i_94_;
		int i_96_ = 0;
		if (i_90_ <= 0) {
			int i_97_ = 1 - i_90_;
			i_93_ -= i_97_;
			i_92_ += i_97_ * i_94_;
			i_91_ += i_97_ * ((Class74) this).anInt732;
			i_90_ = 1;
		}
		if (i_90_ + i_93_ >= ((Class74) this).anInt734) {
			int i_98_ = i_90_ + i_93_ + 1 - ((Class74) this).anInt734;
			i_93_ -= i_98_;
		}
		if (i <= 0) {
			int i_99_ = 1 - i;
			i_94_ -= i_99_;
			i_92_ += i_99_;
			i_91_ += i_99_;
			i_96_ += i_99_;
			i_95_ += i_99_;
			i = 1;
		}
		if (i + i_94_ >= ((Class74) this).anInt732) {
			int i_100_ = i + i_94_ + 1 - ((Class74) this).anInt732;
			i_94_ -= i_100_;
			i_96_ += i_100_;
			i_95_ += i_100_;
		}
		if (i_94_ > 0 && i_93_ > 0) {
			method1330(((Class74) this).aByteArray736, (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).aByteArray10454), i_92_, i_91_, i_94_, i_93_, i_95_, i_96_);
			method1326(i, i_90_, i_94_, i_93_);
		}
	}

	void method1320(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_101_) {
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453) + 1;
		i_101_ += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455) + 1;
		int i_102_ = i + i_101_ * ((Class74) this).anInt732;
		int i_103_ = 0;
		int i_104_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10451);
		int i_105_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10452);
		int i_106_ = ((Class74) this).anInt732 - i_105_;
		int i_107_ = 0;
		if (i_101_ <= 0) {
			int i_108_ = 1 - i_101_;
			i_104_ -= i_108_;
			i_103_ += i_108_ * i_105_;
			i_102_ += i_108_ * ((Class74) this).anInt732;
			i_101_ = 1;
		}
		if (i_101_ + i_104_ >= ((Class74) this).anInt734) {
			int i_109_ = i_101_ + i_104_ + 1 - ((Class74) this).anInt734;
			i_104_ -= i_109_;
		}
		if (i <= 0) {
			int i_110_ = 1 - i;
			i_105_ -= i_110_;
			i_103_ += i_110_;
			i_102_ += i_110_;
			i_107_ += i_110_;
			i_106_ += i_110_;
			i = 1;
		}
		if (i + i_105_ >= ((Class74) this).anInt732) {
			int i_111_ = i + i_105_ + 1 - ((Class74) this).anInt732;
			i_105_ -= i_111_;
			i_107_ += i_111_;
			i_106_ += i_111_;
		}
		if (i_105_ > 0 && i_104_ > 0) {
			method1330(((Class74) this).aByteArray736, (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).aByteArray10454), i_103_, i_102_, i_105_, i_104_, i_106_, i_107_);
			method1326(i, i_101_, i_105_, i_104_);
		}
	}

	void method1321() {
		((Class74) this).aClass71ArrayArray738 = (new Class71[((Class74) this).anInt735][((Class74) this).anInt733]);
		for (int i = 0; i < ((Class74) this).anInt733; i++) {
			for (int i_112_ = 0; i_112_ < ((Class74) this).anInt735; i_112_++) {
				((Class74) this).aClass71ArrayArray738[i_112_][i] = new Class71(((Class74) this).aClass505_Sub2_730, this, ((Class74) this).aClass390_Sub1_731, i_112_, i, ((Class74) this).anInt737, i_112_ * 128 + 1, i * 128 + 1);
				if (((Class71) (((Class74) this).aClass71ArrayArray738[i_112_][i])).anInt716 == 0)
					((Class74) this).aClass71ArrayArray738[i_112_][i] = null;
			}
		}
	}

	void method1322() {
		((Class74) this).aClass71ArrayArray738 = (new Class71[((Class74) this).anInt735][((Class74) this).anInt733]);
		for (int i = 0; i < ((Class74) this).anInt733; i++) {
			for (int i_113_ = 0; i_113_ < ((Class74) this).anInt735; i_113_++) {
				((Class74) this).aClass71ArrayArray738[i_113_][i] = new Class71(((Class74) this).aClass505_Sub2_730, this, ((Class74) this).aClass390_Sub1_731, i_113_, i, ((Class74) this).anInt737, i_113_ * 128 + 1, i * 128 + 1);
				if (((Class71) (((Class74) this).aClass71ArrayArray738[i_113_][i])).anInt716 == 0)
					((Class74) this).aClass71ArrayArray738[i_113_][i] = null;
			}
		}
	}

	void method1323(Class48 class48, int i, int i_114_, int i_115_, boolean[][] bools, boolean bool) {
		float f = 1.0F / (float) (((Class505_Sub2) ((Class74) this).aClass505_Sub2_730).anInt8775 * 128);
		if (bool) {
			for (int i_116_ = 0; i_116_ < ((Class74) this).anInt733; i_116_++) {
				int i_117_ = i_116_ << ((Class74) this).anInt737;
				int i_118_ = i_116_ + 1 << ((Class74) this).anInt737;
				for (int i_119_ = 0; i_119_ < ((Class74) this).anInt735; i_119_++) {
					if (((Class74) this).aClass71ArrayArray738[i_119_][i_116_] != null) {
						int i_120_ = i_119_ << ((Class74) this).anInt737;
						int i_121_ = i_119_ + 1 << ((Class74) this).anInt737;
						while_49_: for (int i_122_ = i_120_; i_122_ < i_121_; i_122_++) {
							if (i_122_ - i >= -i_115_ && i_122_ - i <= i_115_) {
								for (int i_123_ = i_117_; i_123_ < i_118_; i_123_++) {
									if (i_123_ - i_114_ >= -i_115_ && i_123_ - i_114_ <= i_115_ && (bools[i_122_ - i + i_115_][i_123_ - i_114_ + i_115_])) {
										class48.aClass384_454.method6525(f, f, 1.0F, 1.0F);
										class48.aClass384_454.buf[12] = (float) -i_119_;
										class48.aClass384_454.buf[13] = (float) -i_116_;
										((Class74) this).aClass71ArrayArray738[i_119_][i_116_].method1288(class48);
										break while_49_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = (new int[((Class74) this).anInt733 * ((Class74) this).anInt735]);
			ByteBuffer bytebuffer = ((Class74) this).aClass505_Sub2_730.aByteBuffer8838;
			bytebuffer.clear();
			int i_124_ = 0;
			for (int i_125_ = 0; i_125_ < ((Class74) this).anInt733; i_125_++) {
				int i_126_ = i_125_ << ((Class74) this).anInt737;
				int i_127_ = i_125_ + 1 << ((Class74) this).anInt737;
				for (int i_128_ = 0; i_128_ < ((Class74) this).anInt735; i_128_++) {
					Class71 class71 = (((Class74) this).aClass71ArrayArray738[i_128_][i_125_]);
					int i_129_ = 0;
					if (class71 != null) {
						int i_130_ = i_128_ << ((Class74) this).anInt737;
						int i_131_ = i_128_ + 1 << ((Class74) this).anInt737;
						for (int i_132_ = i_126_; i_132_ < i_127_; i_132_++) {
							if (i_132_ - i_114_ >= -i_115_ && i_132_ - i_114_ <= i_115_) {
								int i_133_ = i_132_ * ((((Class74) this).aClass390_Sub1_731.anInt4776) * -1843860823) + i_130_;
								for (int i_134_ = i_130_; i_134_ < i_131_; i_134_++) {
									if (i_134_ - i >= -i_115_ && i_134_ - i <= i_115_ && (bools[i_134_ - i + i_115_][i_132_ - i_114_ + i_115_])) {
										short[] is_135_ = (((Class390_Sub1) (((Class74) this).aClass390_Sub1_731)).aShortArrayArray8534[i_133_]);
										if (is_135_ != null) {
											for (int i_136_ = 0; i_136_ < is_135_.length; i_136_++) {
												bytebuffer.putShort(is_135_[i_136_]);
												i_129_++;
											}
										}
									}
									i_133_++;
								}
							}
						}
					}
					is[i_124_] = i_129_;
					i_124_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_137_ = bytebuffer.position();
				Interface32 interface32 = ((Class74) this).aClass505_Sub2_730.method13911(i_137_ / 2);
				interface32.method42(0, i_137_, (((Class74) this).aClass505_Sub2_730.aLong8695));
				int i_138_ = 0;
				i_124_ = 0;
				for (int i_139_ = 0; i_139_ < ((Class74) this).anInt733; i_139_++) {
					for (int i_140_ = 0; i_140_ < ((Class74) this).anInt735; i_140_++) {
						if (is[i_124_] != 0) {
							class48.aClass384_454.method6525(f, f, 1.0F, 1.0F);
							class48.aClass384_454.buf[12] = (float) -i_140_;
							class48.aClass384_454.buf[13] = (float) -i_139_;
							((Class74) this).aClass71ArrayArray738[i_140_][i_139_].method1290(class48, interface32, i_138_, is[i_124_] / 3);
							i_138_ += is[i_124_];
						}
						i_124_++;
					}
				}
			}
		}
	}

	void method1324(Class48 class48, int i, int i_141_, int i_142_, boolean[][] bools, boolean bool) {
		float f = 1.0F / (float) (((Class505_Sub2) ((Class74) this).aClass505_Sub2_730).anInt8775 * 128);
		if (bool) {
			for (int i_143_ = 0; i_143_ < ((Class74) this).anInt733; i_143_++) {
				int i_144_ = i_143_ << ((Class74) this).anInt737;
				int i_145_ = i_143_ + 1 << ((Class74) this).anInt737;
				for (int i_146_ = 0; i_146_ < ((Class74) this).anInt735; i_146_++) {
					if (((Class74) this).aClass71ArrayArray738[i_146_][i_143_] != null) {
						int i_147_ = i_146_ << ((Class74) this).anInt737;
						int i_148_ = i_146_ + 1 << ((Class74) this).anInt737;
						while_50_: for (int i_149_ = i_147_; i_149_ < i_148_; i_149_++) {
							if (i_149_ - i >= -i_142_ && i_149_ - i <= i_142_) {
								for (int i_150_ = i_144_; i_150_ < i_145_; i_150_++) {
									if (i_150_ - i_141_ >= -i_142_ && i_150_ - i_141_ <= i_142_ && (bools[i_149_ - i + i_142_][i_150_ - i_141_ + i_142_])) {
										class48.aClass384_454.method6525(f, f, 1.0F, 1.0F);
										class48.aClass384_454.buf[12] = (float) -i_146_;
										class48.aClass384_454.buf[13] = (float) -i_143_;
										((Class74) this).aClass71ArrayArray738[i_146_][i_143_].method1288(class48);
										break while_50_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = (new int[((Class74) this).anInt733 * ((Class74) this).anInt735]);
			ByteBuffer bytebuffer = ((Class74) this).aClass505_Sub2_730.aByteBuffer8838;
			bytebuffer.clear();
			int i_151_ = 0;
			for (int i_152_ = 0; i_152_ < ((Class74) this).anInt733; i_152_++) {
				int i_153_ = i_152_ << ((Class74) this).anInt737;
				int i_154_ = i_152_ + 1 << ((Class74) this).anInt737;
				for (int i_155_ = 0; i_155_ < ((Class74) this).anInt735; i_155_++) {
					Class71 class71 = (((Class74) this).aClass71ArrayArray738[i_155_][i_152_]);
					int i_156_ = 0;
					if (class71 != null) {
						int i_157_ = i_155_ << ((Class74) this).anInt737;
						int i_158_ = i_155_ + 1 << ((Class74) this).anInt737;
						for (int i_159_ = i_153_; i_159_ < i_154_; i_159_++) {
							if (i_159_ - i_141_ >= -i_142_ && i_159_ - i_141_ <= i_142_) {
								int i_160_ = i_159_ * ((((Class74) this).aClass390_Sub1_731.anInt4776) * -1843860823) + i_157_;
								for (int i_161_ = i_157_; i_161_ < i_158_; i_161_++) {
									if (i_161_ - i >= -i_142_ && i_161_ - i <= i_142_ && (bools[i_161_ - i + i_142_][i_159_ - i_141_ + i_142_])) {
										short[] is_162_ = (((Class390_Sub1) (((Class74) this).aClass390_Sub1_731)).aShortArrayArray8534[i_160_]);
										if (is_162_ != null) {
											for (int i_163_ = 0; i_163_ < is_162_.length; i_163_++) {
												bytebuffer.putShort(is_162_[i_163_]);
												i_156_++;
											}
										}
									}
									i_160_++;
								}
							}
						}
					}
					is[i_151_] = i_156_;
					i_151_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_164_ = bytebuffer.position();
				Interface32 interface32 = ((Class74) this).aClass505_Sub2_730.method13911(i_164_ / 2);
				interface32.method42(0, i_164_, (((Class74) this).aClass505_Sub2_730.aLong8695));
				int i_165_ = 0;
				i_151_ = 0;
				for (int i_166_ = 0; i_166_ < ((Class74) this).anInt733; i_166_++) {
					for (int i_167_ = 0; i_167_ < ((Class74) this).anInt735; i_167_++) {
						if (is[i_151_] != 0) {
							class48.aClass384_454.method6525(f, f, 1.0F, 1.0F);
							class48.aClass384_454.buf[12] = (float) -i_167_;
							class48.aClass384_454.buf[13] = (float) -i_166_;
							((Class74) this).aClass71ArrayArray738[i_167_][i_166_].method1290(class48, interface32, i_165_, is[i_151_] / 3);
							i_165_ += is[i_151_];
						}
						i_151_++;
					}
				}
			}
		}
	}

	void method1325(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_168_) {
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453) + 1;
		i_168_ += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455) + 1;
		int i_169_ = i + i_168_ * ((Class74) this).anInt732;
		int i_170_ = 0;
		int i_171_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10451);
		int i_172_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10452);
		int i_173_ = ((Class74) this).anInt732 - i_172_;
		int i_174_ = 0;
		if (i_168_ <= 0) {
			int i_175_ = 1 - i_168_;
			i_171_ -= i_175_;
			i_170_ += i_175_ * i_172_;
			i_169_ += i_175_ * ((Class74) this).anInt732;
			i_168_ = 1;
		}
		if (i_168_ + i_171_ >= ((Class74) this).anInt734) {
			int i_176_ = i_168_ + i_171_ + 1 - ((Class74) this).anInt734;
			i_171_ -= i_176_;
		}
		if (i <= 0) {
			int i_177_ = 1 - i;
			i_172_ -= i_177_;
			i_170_ += i_177_;
			i_169_ += i_177_;
			i_174_ += i_177_;
			i_173_ += i_177_;
			i = 1;
		}
		if (i + i_172_ >= ((Class74) this).anInt732) {
			int i_178_ = i + i_172_ + 1 - ((Class74) this).anInt732;
			i_172_ -= i_178_;
			i_174_ += i_178_;
			i_173_ += i_178_;
		}
		if (i_172_ > 0 && i_171_ > 0) {
			method1318(((Class74) this).aByteArray736, (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).aByteArray10454), i_170_, i_169_, i_172_, i_171_, i_173_, i_174_);
			method1326(i, i_168_, i_172_, i_171_);
		}
	}

	void method1326(int i, int i_179_, int i_180_, int i_181_) {
		if (((Class74) this).aClass71ArrayArray738 != null) {
			int i_182_ = i - 1 >> 7;
			int i_183_ = i - 1 + i_180_ - 1 >> 7;
			int i_184_ = i_179_ - 1 >> 7;
			int i_185_ = i_179_ - 1 + i_181_ - 1 >> 7;
			for (int i_186_ = i_182_; i_186_ <= i_183_; i_186_++) {
				Class71[] class71s = ((Class74) this).aClass71ArrayArray738[i_186_];
				for (int i_187_ = i_184_; i_187_ <= i_185_; i_187_++) {
					if (class71s[i_187_] != null)
						((Class71) class71s[i_187_]).aBool710 = true;
				}
			}
		}
	}

	void method1327(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_188_) {
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453) + 1;
		i_188_ += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455) + 1;
		int i_189_ = i + i_188_ * ((Class74) this).anInt732;
		int i_190_ = 0;
		int i_191_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10451);
		int i_192_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10452);
		int i_193_ = ((Class74) this).anInt732 - i_192_;
		int i_194_ = 0;
		if (i_188_ <= 0) {
			int i_195_ = 1 - i_188_;
			i_191_ -= i_195_;
			i_190_ += i_195_ * i_192_;
			i_189_ += i_195_ * ((Class74) this).anInt732;
			i_188_ = 1;
		}
		if (i_188_ + i_191_ >= ((Class74) this).anInt734) {
			int i_196_ = i_188_ + i_191_ + 1 - ((Class74) this).anInt734;
			i_191_ -= i_196_;
		}
		if (i <= 0) {
			int i_197_ = 1 - i;
			i_192_ -= i_197_;
			i_190_ += i_197_;
			i_189_ += i_197_;
			i_194_ += i_197_;
			i_193_ += i_197_;
			i = 1;
		}
		if (i + i_192_ >= ((Class74) this).anInt732) {
			int i_198_ = i + i_192_ + 1 - ((Class74) this).anInt732;
			i_192_ -= i_198_;
			i_194_ += i_198_;
			i_193_ += i_198_;
		}
		if (i_192_ > 0 && i_191_ > 0) {
			method1318(((Class74) this).aByteArray736, (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).aByteArray10454), i_190_, i_189_, i_192_, i_191_, i_193_, i_194_);
			method1326(i, i_188_, i_192_, i_191_);
		}
	}

	static final boolean method1328(byte[] is, int i, int i_199_, int i_200_, int i_201_, int i_202_) {
		int i_203_ = i_199_ % i_202_;
		int i_204_;
		if (i_203_ != 0)
			i_204_ = i_202_ - i_203_;
		else
			i_204_ = 0;
		int i_205_ = -((i_200_ + i_202_ - 1) / i_202_);
		int i_206_ = -((i_199_ + i_202_ - 1) / i_202_);
		for (int i_207_ = i_205_; i_207_ < 0; i_207_++) {
			for (int i_208_ = i_206_; i_208_ < 0; i_208_++) {
				if (is[i] == 0)
					return true;
				i += i_202_;
			}
			i -= i_204_;
			if (is[i - 1] == 0)
				return true;
			i += i_201_;
		}
		return false;
	}

	Class74(Class505_Sub2 class505_sub2, Class390_Sub1 class390_sub1) {
		((Class74) this).aClass505_Sub2_730 = class505_sub2;
		((Class74) this).aClass390_Sub1_731 = class390_sub1;
		((Class74) this).anInt732 = 2 + ((((Class74) this).aClass390_Sub1_731.anInt4776 * -1843860823 * (((Class74) this).aClass390_Sub1_731.anInt4774 * 750971439)) >> (((Class505_Sub2) ((Class74) this).aClass505_Sub2_730).anInt8806));
		((Class74) this).anInt734 = 2 + ((((Class74) this).aClass390_Sub1_731.anInt4773 * 1826078169 * (((Class74) this).aClass390_Sub1_731.anInt4774 * 750971439)) >> (((Class505_Sub2) ((Class74) this).aClass505_Sub2_730).anInt8806));
		((Class74) this).aByteArray736 = new byte[((Class74) this).anInt732 * ((Class74) this).anInt734];
		((Class74) this).anInt737 = (7 + (((Class505_Sub2) ((Class74) this).aClass505_Sub2_730).anInt8806) - ((Class74) this).aClass390_Sub1_731.anInt4775 * 1856651955);
		((Class74) this).anInt735 = (((Class74) this).aClass390_Sub1_731.anInt4776 * -1843860823 >> ((Class74) this).anInt737);
		((Class74) this).anInt733 = (((Class74) this).aClass390_Sub1_731.anInt4773 * 1826078169 >> ((Class74) this).anInt737);
	}

	boolean method1329(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_209_) {
		Class282_Sub50_Sub17_Sub2 class282_sub50_sub17_sub2 = (Class282_Sub50_Sub17_Sub2) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10453) + 1;
		i_209_ += (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10455) + 1;
		int i_210_ = i + i_209_ * ((Class74) this).anInt732;
		int i_211_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10451);
		int i_212_ = (((Class282_Sub50_Sub17_Sub2) class282_sub50_sub17_sub2).anInt10452);
		int i_213_ = ((Class74) this).anInt732 - i_212_;
		if (i_209_ <= 0) {
			int i_214_ = 1 - i_209_;
			i_211_ -= i_214_;
			i_210_ += i_214_ * ((Class74) this).anInt732;
			i_209_ = 1;
		}
		if (i_209_ + i_211_ >= ((Class74) this).anInt734) {
			int i_215_ = i_209_ + i_211_ + 1 - ((Class74) this).anInt734;
			i_211_ -= i_215_;
		}
		if (i <= 0) {
			int i_216_ = 1 - i;
			i_212_ -= i_216_;
			i_210_ += i_216_;
			i_213_ += i_216_;
			i = 1;
		}
		if (i + i_212_ >= ((Class74) this).anInt732) {
			int i_217_ = i + i_212_ + 1 - ((Class74) this).anInt732;
			i_212_ -= i_217_;
			i_213_ += i_217_;
		}
		if (i_212_ <= 0 || i_211_ <= 0)
			return false;
		int i_218_ = 8;
		i_213_ += (i_218_ - 1) * ((Class74) this).anInt732;
		return method1328(((Class74) this).aByteArray736, i_210_, i_212_, i_211_, i_213_, i_218_);
	}

	static final void method1330(byte[] is, byte[] is_219_, int i, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_) {
		int i_225_ = -(i_221_ >> 2);
		i_221_ = -(i_221_ & 0x3);
		for (int i_226_ = -i_222_; i_226_ < 0; i_226_++) {
			for (int i_227_ = i_225_; i_227_ < 0; i_227_++) {
				is[i_220_++] -= is_219_[i++];
				is[i_220_++] -= is_219_[i++];
				is[i_220_++] -= is_219_[i++];
				is[i_220_++] -= is_219_[i++];
			}
			for (int i_228_ = i_221_; i_228_ < 0; i_228_++)
				is[i_220_++] -= is_219_[i++];
			i_220_ += i_223_;
			i += i_224_;
		}
	}

	static final void method1331(byte[] is, byte[] is_229_, int i, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_) {
		int i_235_ = -(i_231_ >> 2);
		i_231_ = -(i_231_ & 0x3);
		for (int i_236_ = -i_232_; i_236_ < 0; i_236_++) {
			for (int i_237_ = i_235_; i_237_ < 0; i_237_++) {
				is[i_230_++] += is_229_[i++];
				is[i_230_++] += is_229_[i++];
				is[i_230_++] += is_229_[i++];
				is[i_230_++] += is_229_[i++];
			}
			for (int i_238_ = i_231_; i_238_ < 0; i_238_++)
				is[i_230_++] += is_229_[i++];
			i_230_ += i_233_;
			i += i_234_;
		}
	}

	static final void method1332(byte[] is, byte[] is_239_, int i, int i_240_, int i_241_, int i_242_, int i_243_, int i_244_) {
		int i_245_ = -(i_241_ >> 2);
		i_241_ = -(i_241_ & 0x3);
		for (int i_246_ = -i_242_; i_246_ < 0; i_246_++) {
			for (int i_247_ = i_245_; i_247_ < 0; i_247_++) {
				is[i_240_++] += is_239_[i++];
				is[i_240_++] += is_239_[i++];
				is[i_240_++] += is_239_[i++];
				is[i_240_++] += is_239_[i++];
			}
			for (int i_248_ = i_241_; i_248_ < 0; i_248_++)
				is[i_240_++] += is_239_[i++];
			i_240_ += i_243_;
			i += i_244_;
		}
	}

	static final void method1333(byte[] is, byte[] is_249_, int i, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_) {
		int i_255_ = -(i_251_ >> 2);
		i_251_ = -(i_251_ & 0x3);
		for (int i_256_ = -i_252_; i_256_ < 0; i_256_++) {
			for (int i_257_ = i_255_; i_257_ < 0; i_257_++) {
				is[i_250_++] += is_249_[i++];
				is[i_250_++] += is_249_[i++];
				is[i_250_++] += is_249_[i++];
				is[i_250_++] += is_249_[i++];
			}
			for (int i_258_ = i_251_; i_258_ < 0; i_258_++)
				is[i_250_++] += is_249_[i++];
			i_250_ += i_253_;
			i += i_254_;
		}
	}

	static final void method1334(byte[] is, byte[] is_259_, int i, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_) {
		int i_265_ = -(i_261_ >> 2);
		i_261_ = -(i_261_ & 0x3);
		for (int i_266_ = -i_262_; i_266_ < 0; i_266_++) {
			for (int i_267_ = i_265_; i_267_ < 0; i_267_++) {
				is[i_260_++] -= is_259_[i++];
				is[i_260_++] -= is_259_[i++];
				is[i_260_++] -= is_259_[i++];
				is[i_260_++] -= is_259_[i++];
			}
			for (int i_268_ = i_261_; i_268_ < 0; i_268_++)
				is[i_260_++] -= is_259_[i++];
			i_260_ += i_263_;
			i += i_264_;
		}
	}
}
