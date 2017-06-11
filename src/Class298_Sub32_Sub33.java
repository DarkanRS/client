/* Class298_Sub32_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class298_Sub32_Sub33 extends Class298_Sub32 {
	static int anInt9515 = 2048;
	static int anInt9516 = 0;
	static int anInt9517 = 1024;
	static int anInt9518 = 1024;
	int anInt9519;
	static int anInt9520 = 409;
	static int anInt9521 = 819;
	static int anInt9522 = 1024;
	int anInt9523;
	static int anInt9524 = 0;
	int anInt9525 = 0;
	int anInt9526 = 395516928;
	static int anInt9527 = 0;
	int anInt9528;
	static int anInt9529 = 1024;
	int anInt9530;
	int anInt9531;
	int anInt9532;
	int anInt9533;
	int anInt9534;

	void method3346(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 6:
			((Class298_Sub32_Sub33) this).anInt9531 = class298_sub53.readUnsignedByte() * 1663137711;
			break;
		case 7:
			((Class298_Sub32_Sub33) this).anInt9532 = class298_sub53.readUnsignedShort() * 741927281;
			break;
		case 1:
			((Class298_Sub32_Sub33) this).anInt9526 = class298_sub53.readUnsignedShort() * -8002361;
			break;
		case 0:
			((Class298_Sub32_Sub33) this).anInt9525 = class298_sub53.readUnsignedByte() * -653192821;
			break;
		case 4:
			((Class298_Sub32_Sub33) this).anInt9519 = class298_sub53.readUnsignedShort() * 1340421019;
			break;
		case 3:
			((Class298_Sub32_Sub33) this).anInt9528 = class298_sub53.readUnsignedShort() * -2128158391;
			break;
		case 5:
			((Class298_Sub32_Sub33) this).anInt9530 = class298_sub53.readUnsignedShort() * -420846851;
			break;
		case 2:
			((Class298_Sub32_Sub33) this).anInt9523 = class298_sub53.readUnsignedShort() * 334398233;
			break;
		case 8:
			((Class298_Sub32_Sub33) this).anInt9533 = class298_sub53.readUnsignedShort() * 1393727635;
			break;
		}
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1803226244);
			if (aClass257_7384.aBoolean2810) {
				int[][] is_1_ = aClass257_7384.method2449(-772888514);
				int i_2_ = 0;
				int i_3_ = 0;
				int i_4_ = 0;
				int i_5_ = 0;
				int i_6_ = 0;
				boolean bool = true;
				boolean bool_7_ = true;
				int i_8_ = 0;
				int i_9_ = 0;
				int i_10_ = ((1499569399 * ((Class298_Sub32_Sub33) this).anInt9526 * (-1474554145 * Class250.anInt2755)) >> 12);
				int i_11_ = ((Class250.anInt2755 * -1474554145 * (-235001559 * ((Class298_Sub32_Sub33) this).anInt9523)) >> 12);
				int i_12_ = ((Class250.anInt2756 * 461985445 * (-1432887047 * ((Class298_Sub32_Sub33) this).anInt9528)) >> 12);
				int i_13_ = ((Class250.anInt2756 * 461985445 * (((Class298_Sub32_Sub33) this).anInt9519 * 467335827)) >> 12);
				if (i_13_ <= 1)
					return is_1_[i];
				((Class298_Sub32_Sub33) this).anInt9534 = ((-1474554145 * Class250.anInt2755 / 8 * (((Class298_Sub32_Sub33) this).anInt9530 * -1630516651)) >> 12) * 800544861;
				int i_14_ = 1 + -1474554145 * Class250.anInt2755 / i_10_;
				int[][] is_15_ = new int[i_14_][3];
				int[][] is_16_ = new int[i_14_][3];
				Random random = new Random((long) ((((Class298_Sub32_Sub33) this).anInt9525) * -2017522141));
				for (;;) {
					int i_17_ = i_10_ + Class298_Sub19_Sub3.method3039(random, i_11_ - i_10_, (byte) 36);
					int i_18_ = i_12_ + Class298_Sub19_Sub3.method3039(random, i_13_ - i_12_, (byte) -88);
					int i_19_ = i_17_ + i_5_;
					if (i_19_ > Class250.anInt2755 * -1474554145) {
						i_17_ = -1474554145 * Class250.anInt2755 - i_5_;
						i_19_ = -1474554145 * Class250.anInt2755;
					}
					int i_20_;
					if (!bool_7_) {
						int i_21_ = i_6_;
						int[] is_22_ = is_16_[i_6_];
						int i_23_ = 0;
						int i_24_ = i_19_ + i_2_;
						if (i_24_ < 0)
							i_24_ += -1474554145 * Class250.anInt2755;
						if (i_24_ > Class250.anInt2755 * -1474554145)
							i_24_ -= Class250.anInt2755 * -1474554145;
						for (;;) {
							int[] is_25_ = is_16_[i_21_];
							if (i_24_ >= is_25_[0] && i_24_ <= is_25_[1]) {
								if (i_0_ == -484575331) {
									/* empty */
								}
								break;
							}
							if (++i_21_ >= i_8_)
								i_21_ = 0;
							i_23_++;
						}
						i_20_ = is_22_[2];
						if (i_21_ != i_6_) {
							int i_26_ = i_2_ + i_5_;
							if (i_26_ < 0)
								i_26_ += -1474554145 * Class250.anInt2755;
							if (i_26_ > Class250.anInt2755 * -1474554145)
								i_26_ -= -1474554145 * Class250.anInt2755;
							for (int i_27_ = 1; i_27_ <= i_23_; i_27_++) {
								int[] is_28_ = is_16_[(i_27_ + i_6_) % i_8_];
								i_20_ = Math.max(i_20_, is_28_[2]);
							}
							for (int i_29_ = 0; i_29_ <= i_23_; i_29_++) {
								int[] is_30_ = is_16_[(i_6_ + i_29_) % i_8_];
								int i_31_ = is_30_[2];
								if (i_31_ != i_20_) {
									int i_32_ = is_30_[0];
									int i_33_ = is_30_[1];
									int i_34_;
									int i_35_;
									if (i_26_ < i_24_) {
										i_34_ = Math.max(i_26_, i_32_);
										i_35_ = Math.min(i_24_, i_33_);
									} else if (0 == i_32_) {
										i_34_ = 0;
										i_35_ = Math.min(i_24_, i_33_);
									} else {
										i_34_ = Math.max(i_26_, i_32_);
										i_35_ = Class250.anInt2755 * -1474554145;
									}
									method3349(random, is_1_, i_34_ + i_4_, i_31_, i_35_ - i_34_, i_20_ - i_31_, -1120469720);
								}
							}
						}
						i_6_ = i_21_;
					} else
						i_20_ = 0;
					if (i_20_ + i_18_ > Class250.anInt2756 * 461985445)
						i_18_ = 461985445 * Class250.anInt2756 - i_20_;
					else
						bool = false;
					if (Class250.anInt2755 * -1474554145 == i_19_) {
						method3349(random, is_1_, i_3_ + i_5_, i_20_, i_17_, i_18_, -22985350);
						if (bool) {
							if (i_0_ == -484575331)
								throw new IllegalStateException();
							break;
						}
						bool = true;
						int[] is_36_ = is_15_[i_9_++];
						is_36_[0] = i_5_;
						is_36_[1] = i_19_;
						is_36_[2] = i_20_ + i_18_;
						int[][] is_37_ = is_16_;
						is_16_ = is_15_;
						is_15_ = is_37_;
						i_8_ = i_9_;
						i_9_ = 0;
						i_4_ = i_3_;
						i_3_ = Class298_Sub19_Sub3.method3039(random, (-1474554145 * (Class250.anInt2755)), (byte) -66);
						i_2_ = i_3_ - i_4_;
						i_5_ = 0;
						int i_38_ = i_2_;
						if (i_38_ < 0)
							i_38_ += Class250.anInt2755 * -1474554145;
						if (i_38_ > -1474554145 * Class250.anInt2755)
							i_38_ -= Class250.anInt2755 * -1474554145;
						i_6_ = 0;
						for (;;) {
							int[] is_39_ = is_16_[i_6_];
							if (i_38_ >= is_39_[0] && i_38_ <= is_39_[1]) {
								if (i_0_ == -484575331) {
									/* empty */
								}
								break;
							}
							if (++i_6_ >= i_8_)
								i_6_ = 0;
						}
						bool_7_ = false;
					} else {
						int[] is_40_ = is_15_[i_9_++];
						is_40_[0] = i_5_;
						is_40_[1] = i_19_;
						is_40_[2] = i_20_ + i_18_;
						method3349(random, is_1_, i_3_ + i_5_, i_20_, i_17_, i_18_, -1208339553);
						i_5_ = i_19_;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahv.i(").append(')').toString());
		}
	}

	int[] method3347(int i) {
		int[] is = aClass257_7384.method2448(i, 525237222);
		if (aClass257_7384.aBoolean2810) {
			int[][] is_41_ = aClass257_7384.method2449(1732475144);
			int i_42_ = 0;
			int i_43_ = 0;
			int i_44_ = 0;
			int i_45_ = 0;
			int i_46_ = 0;
			boolean bool = true;
			boolean bool_47_ = true;
			int i_48_ = 0;
			int i_49_ = 0;
			int i_50_ = ((1499569399 * ((Class298_Sub32_Sub33) this).anInt9526 * (-1474554145 * Class250.anInt2755)) >> 12);
			int i_51_ = ((Class250.anInt2755 * -1474554145 * (-235001559 * ((Class298_Sub32_Sub33) this).anInt9523)) >> 12);
			int i_52_ = ((Class250.anInt2756 * 461985445 * (-1432887047 * ((Class298_Sub32_Sub33) this).anInt9528)) >> 12);
			int i_53_ = ((Class250.anInt2756 * 461985445 * (((Class298_Sub32_Sub33) this).anInt9519 * 467335827)) >> 12);
			if (i_53_ <= 1)
				return is_41_[i];
			((Class298_Sub32_Sub33) this).anInt9534 = ((-1474554145 * Class250.anInt2755 / 8 * (((Class298_Sub32_Sub33) this).anInt9530 * -1630516651)) >> 12) * 800544861;
			int i_54_ = 1 + -1474554145 * Class250.anInt2755 / i_50_;
			int[][] is_55_ = new int[i_54_][3];
			int[][] is_56_ = new int[i_54_][3];
			Random random = new Random((long) (((Class298_Sub32_Sub33) this).anInt9525 * -2017522141));
			for (;;) {
				int i_57_ = (i_50_ + Class298_Sub19_Sub3.method3039(random, i_51_ - i_50_, (byte) -66));
				int i_58_ = (i_52_ + Class298_Sub19_Sub3.method3039(random, i_53_ - i_52_, (byte) -28));
				int i_59_ = i_57_ + i_45_;
				if (i_59_ > Class250.anInt2755 * -1474554145) {
					i_57_ = -1474554145 * Class250.anInt2755 - i_45_;
					i_59_ = -1474554145 * Class250.anInt2755;
				}
				int i_60_;
				if (!bool_47_) {
					int i_61_ = i_46_;
					int[] is_62_ = is_56_[i_46_];
					int i_63_ = 0;
					int i_64_ = i_59_ + i_42_;
					if (i_64_ < 0)
						i_64_ += -1474554145 * Class250.anInt2755;
					if (i_64_ > Class250.anInt2755 * -1474554145)
						i_64_ -= Class250.anInt2755 * -1474554145;
					for (;;) {
						int[] is_65_ = is_56_[i_61_];
						if (i_64_ >= is_65_[0] && i_64_ <= is_65_[1])
							break;
						if (++i_61_ >= i_48_)
							i_61_ = 0;
						i_63_++;
					}
					i_60_ = is_62_[2];
					if (i_61_ != i_46_) {
						int i_66_ = i_42_ + i_45_;
						if (i_66_ < 0)
							i_66_ += -1474554145 * Class250.anInt2755;
						if (i_66_ > Class250.anInt2755 * -1474554145)
							i_66_ -= -1474554145 * Class250.anInt2755;
						for (int i_67_ = 1; i_67_ <= i_63_; i_67_++) {
							int[] is_68_ = is_56_[(i_67_ + i_46_) % i_48_];
							i_60_ = Math.max(i_60_, is_68_[2]);
						}
						for (int i_69_ = 0; i_69_ <= i_63_; i_69_++) {
							int[] is_70_ = is_56_[(i_46_ + i_69_) % i_48_];
							int i_71_ = is_70_[2];
							if (i_71_ != i_60_) {
								int i_72_ = is_70_[0];
								int i_73_ = is_70_[1];
								int i_74_;
								int i_75_;
								if (i_66_ < i_64_) {
									i_74_ = Math.max(i_66_, i_72_);
									i_75_ = Math.min(i_64_, i_73_);
								} else if (0 == i_72_) {
									i_74_ = 0;
									i_75_ = Math.min(i_64_, i_73_);
								} else {
									i_74_ = Math.max(i_66_, i_72_);
									i_75_ = Class250.anInt2755 * -1474554145;
								}
								method3349(random, is_41_, i_74_ + i_44_, i_71_, i_75_ - i_74_, i_60_ - i_71_, -1679820011);
							}
						}
					}
					i_46_ = i_61_;
				} else
					i_60_ = 0;
				if (i_60_ + i_58_ > Class250.anInt2756 * 461985445)
					i_58_ = 461985445 * Class250.anInt2756 - i_60_;
				else
					bool = false;
				if (Class250.anInt2755 * -1474554145 == i_59_) {
					method3349(random, is_41_, i_43_ + i_45_, i_60_, i_57_, i_58_, -764186178);
					if (bool)
						break;
					bool = true;
					int[] is_76_ = is_55_[i_49_++];
					is_76_[0] = i_45_;
					is_76_[1] = i_59_;
					is_76_[2] = i_60_ + i_58_;
					int[][] is_77_ = is_56_;
					is_56_ = is_55_;
					is_55_ = is_77_;
					i_48_ = i_49_;
					i_49_ = 0;
					i_44_ = i_43_;
					i_43_ = Class298_Sub19_Sub3.method3039(random, (-1474554145 * (Class250.anInt2755)), (byte) -49);
					i_42_ = i_43_ - i_44_;
					i_45_ = 0;
					int i_78_ = i_42_;
					if (i_78_ < 0)
						i_78_ += Class250.anInt2755 * -1474554145;
					if (i_78_ > -1474554145 * Class250.anInt2755)
						i_78_ -= Class250.anInt2755 * -1474554145;
					i_46_ = 0;
					for (;;) {
						int[] is_79_ = is_56_[i_46_];
						if (i_78_ >= is_79_[0] && i_78_ <= is_79_[1])
							break;
						if (++i_46_ >= i_48_)
							i_46_ = 0;
					}
					bool_47_ = false;
				} else {
					int[] is_80_ = is_55_[i_49_++];
					is_80_[0] = i_45_;
					is_80_[1] = i_59_;
					is_80_[2] = i_60_ + i_58_;
					method3349(random, is_41_, i_43_ + i_45_, i_60_, i_57_, i_58_, 106077294);
					i_45_ = i_59_;
				}
			}
		}
		return is;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_81_) {
		try {
			switch (i) {
			case 6:
				((Class298_Sub32_Sub33) this).anInt9531 = class298_sub53.readUnsignedByte() * 1663137711;
				break;
			case 7:
				((Class298_Sub32_Sub33) this).anInt9532 = class298_sub53.readUnsignedShort() * 741927281;
				break;
			case 1:
				((Class298_Sub32_Sub33) this).anInt9526 = class298_sub53.readUnsignedShort() * -8002361;
				break;
			case 0:
				((Class298_Sub32_Sub33) this).anInt9525 = class298_sub53.readUnsignedByte() * -653192821;
				break;
			case 4:
				((Class298_Sub32_Sub33) this).anInt9519 = class298_sub53.readUnsignedShort() * 1340421019;
				break;
			case 3:
				((Class298_Sub32_Sub33) this).anInt9528 = class298_sub53.readUnsignedShort() * -2128158391;
				break;
			case 5:
				((Class298_Sub32_Sub33) this).anInt9530 = class298_sub53.readUnsignedShort() * -420846851;
				break;
			case 2:
				((Class298_Sub32_Sub33) this).anInt9523 = class298_sub53.readUnsignedShort() * 334398233;
				break;
			case 8:
				((Class298_Sub32_Sub33) this).anInt9533 = class298_sub53.readUnsignedShort() * 1393727635;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahv.r(").append(')').toString());
		}
	}

	int[] method3348(int i) {
		int[] is = aClass257_7384.method2448(i, 2093617595);
		if (aClass257_7384.aBoolean2810) {
			int[][] is_82_ = aClass257_7384.method2449(-2130665076);
			int i_83_ = 0;
			int i_84_ = 0;
			int i_85_ = 0;
			int i_86_ = 0;
			int i_87_ = 0;
			boolean bool = true;
			boolean bool_88_ = true;
			int i_89_ = 0;
			int i_90_ = 0;
			int i_91_ = ((1499569399 * ((Class298_Sub32_Sub33) this).anInt9526 * (-1474554145 * Class250.anInt2755)) >> 12);
			int i_92_ = ((Class250.anInt2755 * -1474554145 * (-235001559 * ((Class298_Sub32_Sub33) this).anInt9523)) >> 12);
			int i_93_ = ((Class250.anInt2756 * 461985445 * (-1432887047 * ((Class298_Sub32_Sub33) this).anInt9528)) >> 12);
			int i_94_ = ((Class250.anInt2756 * 461985445 * (((Class298_Sub32_Sub33) this).anInt9519 * 467335827)) >> 12);
			if (i_94_ <= 1)
				return is_82_[i];
			((Class298_Sub32_Sub33) this).anInt9534 = ((-1474554145 * Class250.anInt2755 / 8 * (((Class298_Sub32_Sub33) this).anInt9530 * -1630516651)) >> 12) * 800544861;
			int i_95_ = 1 + -1474554145 * Class250.anInt2755 / i_91_;
			int[][] is_96_ = new int[i_95_][3];
			int[][] is_97_ = new int[i_95_][3];
			Random random = new Random((long) (((Class298_Sub32_Sub33) this).anInt9525 * -2017522141));
			for (;;) {
				int i_98_ = (i_91_ + Class298_Sub19_Sub3.method3039(random, i_92_ - i_91_, (byte) 96));
				int i_99_ = (i_93_ + Class298_Sub19_Sub3.method3039(random, i_94_ - i_93_, (byte) 8));
				int i_100_ = i_98_ + i_86_;
				if (i_100_ > Class250.anInt2755 * -1474554145) {
					i_98_ = -1474554145 * Class250.anInt2755 - i_86_;
					i_100_ = -1474554145 * Class250.anInt2755;
				}
				int i_101_;
				if (!bool_88_) {
					int i_102_ = i_87_;
					int[] is_103_ = is_97_[i_87_];
					int i_104_ = 0;
					int i_105_ = i_100_ + i_83_;
					if (i_105_ < 0)
						i_105_ += -1474554145 * Class250.anInt2755;
					if (i_105_ > Class250.anInt2755 * -1474554145)
						i_105_ -= Class250.anInt2755 * -1474554145;
					for (;;) {
						int[] is_106_ = is_97_[i_102_];
						if (i_105_ >= is_106_[0] && i_105_ <= is_106_[1])
							break;
						if (++i_102_ >= i_89_)
							i_102_ = 0;
						i_104_++;
					}
					i_101_ = is_103_[2];
					if (i_102_ != i_87_) {
						int i_107_ = i_83_ + i_86_;
						if (i_107_ < 0)
							i_107_ += -1474554145 * Class250.anInt2755;
						if (i_107_ > Class250.anInt2755 * -1474554145)
							i_107_ -= -1474554145 * Class250.anInt2755;
						for (int i_108_ = 1; i_108_ <= i_104_; i_108_++) {
							int[] is_109_ = is_97_[(i_108_ + i_87_) % i_89_];
							i_101_ = Math.max(i_101_, is_109_[2]);
						}
						for (int i_110_ = 0; i_110_ <= i_104_; i_110_++) {
							int[] is_111_ = is_97_[(i_87_ + i_110_) % i_89_];
							int i_112_ = is_111_[2];
							if (i_112_ != i_101_) {
								int i_113_ = is_111_[0];
								int i_114_ = is_111_[1];
								int i_115_;
								int i_116_;
								if (i_107_ < i_105_) {
									i_115_ = Math.max(i_107_, i_113_);
									i_116_ = Math.min(i_105_, i_114_);
								} else if (0 == i_113_) {
									i_115_ = 0;
									i_116_ = Math.min(i_105_, i_114_);
								} else {
									i_115_ = Math.max(i_107_, i_113_);
									i_116_ = Class250.anInt2755 * -1474554145;
								}
								method3349(random, is_82_, i_115_ + i_85_, i_112_, i_116_ - i_115_, i_101_ - i_112_, 167475133);
							}
						}
					}
					i_87_ = i_102_;
				} else
					i_101_ = 0;
				if (i_101_ + i_99_ > Class250.anInt2756 * 461985445)
					i_99_ = 461985445 * Class250.anInt2756 - i_101_;
				else
					bool = false;
				if (Class250.anInt2755 * -1474554145 == i_100_) {
					method3349(random, is_82_, i_84_ + i_86_, i_101_, i_98_, i_99_, 1099535944);
					if (bool)
						break;
					bool = true;
					int[] is_117_ = is_96_[i_90_++];
					is_117_[0] = i_86_;
					is_117_[1] = i_100_;
					is_117_[2] = i_101_ + i_99_;
					int[][] is_118_ = is_97_;
					is_97_ = is_96_;
					is_96_ = is_118_;
					i_89_ = i_90_;
					i_90_ = 0;
					i_85_ = i_84_;
					i_84_ = Class298_Sub19_Sub3.method3039(random, (-1474554145 * (Class250.anInt2755)), (byte) -56);
					i_83_ = i_84_ - i_85_;
					i_86_ = 0;
					int i_119_ = i_83_;
					if (i_119_ < 0)
						i_119_ += Class250.anInt2755 * -1474554145;
					if (i_119_ > -1474554145 * Class250.anInt2755)
						i_119_ -= Class250.anInt2755 * -1474554145;
					i_87_ = 0;
					for (;;) {
						int[] is_120_ = is_97_[i_87_];
						if (i_119_ >= is_120_[0] && i_119_ <= is_120_[1])
							break;
						if (++i_87_ >= i_89_)
							i_87_ = 0;
					}
					bool_88_ = false;
				} else {
					int[] is_121_ = is_96_[i_90_++];
					is_121_[0] = i_86_;
					is_121_[1] = i_100_;
					is_121_[2] = i_101_ + i_99_;
					method3349(random, is_82_, i_84_ + i_86_, i_101_, i_98_, i_99_, -413457222);
					i_86_ = i_100_;
				}
			}
		}
		return is;
	}

	final void method3349(Random random, int[][] is, int i, int i_122_, int i_123_, int i_124_, int i_125_) {
		try {
			int i_126_ = (((Class298_Sub32_Sub33) this).anInt9533 * -2052438629 > 0 ? (4096 - Class298_Sub19_Sub3.method3039(random, (((Class298_Sub32_Sub33) this).anInt9533 * -2052438629), (byte) 90)) : 4096);
			int i_127_ = ((908540917 * ((Class298_Sub32_Sub33) this).anInt9534 * (((Class298_Sub32_Sub33) this).anInt9532 * 19183505)) >> 12);
			int i_128_ = (((Class298_Sub32_Sub33) this).anInt9534 * 908540917 - (i_127_ > 0 ? Class298_Sub19_Sub3.method3039(random, i_127_, (byte) -95) : 0));
			if (i >= Class250.anInt2755 * -1474554145)
				i -= Class250.anInt2755 * -1474554145;
			if (i_128_ > 0) {
				if (i_124_ > 0 && i_123_ > 0) {
					int i_129_ = i_123_ / 2;
					int i_130_ = i_124_ / 2;
					int i_131_ = i_129_ < i_128_ ? i_129_ : i_128_;
					int i_132_ = i_130_ < i_128_ ? i_130_ : i_128_;
					int i_133_ = i_131_ + i;
					int i_134_ = i_123_ - 2 * i_131_;
					for (int i_135_ = 0; i_135_ < i_124_; i_135_++) {
						int[] is_136_ = is[i_122_ + i_135_];
						if (i_135_ < i_132_) {
							int i_137_ = i_126_ * i_135_ / i_132_;
							if ((((Class298_Sub32_Sub33) this).anInt9531 * 1833451343) == 0) {
								for (int i_138_ = 0; i_138_ < i_131_; i_138_++) {
									int i_139_ = i_138_ * i_126_ / i_131_;
									is_136_[(i + i_138_ & (-901777799 * Class250.anInt2753))] = is_136_[(i_123_ + i - i_138_ - 1 & (Class250.anInt2753 * -901777799))] = i_139_ * i_137_ >> 12;
								}
							} else {
								for (int i_140_ = 0; i_140_ < i_131_; i_140_++) {
									int i_141_ = i_126_ * i_140_ / i_131_;
									is_136_[i_140_ + i & (Class250.anInt2753 * -901777799)] = is_136_[(i_123_ + i - i_140_ - 1 & (Class250.anInt2753 * -901777799))] = i_141_ < i_137_ ? i_141_ : i_137_;
								}
							}
							if (i_133_ + i_134_ > -1474554145 * Class250.anInt2755) {
								int i_142_ = (Class250.anInt2755 * -1474554145 - i_133_);
								Class425.method5740(is_136_, i_133_, i_142_, i_137_);
								Class425.method5740(is_136_, 0, i_134_ - i_142_, i_137_);
							} else
								Class425.method5740(is_136_, i_133_, i_134_, i_137_);
						} else {
							int i_143_ = i_124_ - i_135_ - 1;
							if (i_143_ < i_132_) {
								int i_144_ = i_143_ * i_126_ / i_132_;
								if ((((Class298_Sub32_Sub33) this).anInt9531 * 1833451343) == 0) {
									for (int i_145_ = 0; i_145_ < i_131_; i_145_++) {
										int i_146_ = i_145_ * i_126_ / i_131_;
										is_136_[(i_145_ + i & (Class250.anInt2753 * -901777799))] = is_136_[(i + i_123_ - i_145_ - 1 & (Class250.anInt2753 * -901777799))] = i_146_ * i_144_ >> 12;
									}
								} else {
									for (int i_147_ = 0; i_147_ < i_131_; i_147_++) {
										int i_148_ = i_126_ * i_147_ / i_131_;
										is_136_[(i_147_ + i & (-901777799 * Class250.anInt2753))] = is_136_[(i + i_123_ - i_147_ - 1 & (Class250.anInt2753 * -901777799))] = (i_148_ < i_144_ ? i_148_ : i_144_);
									}
								}
								if (i_133_ + i_134_ > -1474554145 * Class250.anInt2755) {
									int i_149_ = (-1474554145 * Class250.anInt2755 - i_133_);
									Class425.method5740(is_136_, i_133_, i_149_, i_144_);
									Class425.method5740(is_136_, 0, i_134_ - i_149_, i_144_);
								} else
									Class425.method5740(is_136_, i_133_, i_134_, i_144_);
							} else {
								for (int i_150_ = 0; i_150_ < i_131_; i_150_++)
									is_136_[(i_150_ + i & (-901777799 * Class250.anInt2753))] = is_136_[(i + i_123_ - i_150_ - 1 & (Class250.anInt2753 * -901777799))] = i_126_ * i_150_ / i_131_;
								if (i_133_ + i_134_ > Class250.anInt2755 * -1474554145) {
									int i_151_ = (Class250.anInt2755 * -1474554145 - i_133_);
									Class425.method5740(is_136_, i_133_, i_151_, i_126_);
									Class425.method5740(is_136_, 0, i_134_ - i_151_, i_126_);
								} else
									Class425.method5740(is_136_, i_133_, i_134_, i_126_);
							}
						}
					}
				}
			} else if (i_123_ + i > -1474554145 * Class250.anInt2755) {
				int i_152_ = -1474554145 * Class250.anInt2755 - i;
				for (int i_153_ = 0; i_153_ < i_124_; i_153_++) {
					int[] is_154_ = is[i_122_ + i_153_];
					Class425.method5740(is_154_, i, i_152_, i_126_);
					Class425.method5740(is_154_, 0, i_123_ - i_152_, i_126_);
				}
			} else {
				for (int i_155_ = 0; i_155_ < i_124_; i_155_++)
					Class425.method5740(is[i_122_ + i_155_], i, i_123_, i_126_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahv.ac(").append(')').toString());
		}
	}

	void method3350() {
		/* empty */
	}

	void method3351() {
		/* empty */
	}

	void method3352(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 6:
			((Class298_Sub32_Sub33) this).anInt9531 = class298_sub53.readUnsignedByte() * 1663137711;
			break;
		case 7:
			((Class298_Sub32_Sub33) this).anInt9532 = class298_sub53.readUnsignedShort() * 741927281;
			break;
		case 1:
			((Class298_Sub32_Sub33) this).anInt9526 = class298_sub53.readUnsignedShort() * -8002361;
			break;
		case 0:
			((Class298_Sub32_Sub33) this).anInt9525 = class298_sub53.readUnsignedByte() * -653192821;
			break;
		case 4:
			((Class298_Sub32_Sub33) this).anInt9519 = class298_sub53.readUnsignedShort() * 1340421019;
			break;
		case 3:
			((Class298_Sub32_Sub33) this).anInt9528 = class298_sub53.readUnsignedShort() * -2128158391;
			break;
		case 5:
			((Class298_Sub32_Sub33) this).anInt9530 = class298_sub53.readUnsignedShort() * -420846851;
			break;
		case 2:
			((Class298_Sub32_Sub33) this).anInt9523 = class298_sub53.readUnsignedShort() * 334398233;
			break;
		case 8:
			((Class298_Sub32_Sub33) this).anInt9533 = class298_sub53.readUnsignedShort() * 1393727635;
			break;
		}
	}

	void method3353() {
		/* empty */
	}

	public Class298_Sub32_Sub33() {
		super(0, true);
		((Class298_Sub32_Sub33) this).anInt9523 = 1947781120;
		((Class298_Sub32_Sub33) this).anInt9528 = 1461579169;
		((Class298_Sub32_Sub33) this).anInt9519 = -1706813215;
		((Class298_Sub32_Sub33) this).anInt9530 = -1450445824;
		((Class298_Sub32_Sub33) this).anInt9531 = 0;
		((Class298_Sub32_Sub33) this).anInt9532 = -475675648;
		((Class298_Sub32_Sub33) this).anInt9533 = 1247955968;
	}

	void method3133(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahv.x(").append(')').toString());
		}
	}
}
