
/* Class282_Sub20_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class282_Sub20_Sub9 extends Class282_Sub20 {
	int anInt9772;
	static final int anInt9773 = 0;
	static final int anInt9774 = 1024;
	static final int anInt9775 = 1024;
	static final int anInt9776 = 0;
	static final int anInt9777 = 409;
	static final int anInt9778 = 819;
	static final int anInt9779 = 1024;
	int anInt9780;
	static final int anInt9781 = 2048;
	int anInt9782 = 0;
	static final int anInt9783 = 0;
	int anInt9784;
	static final int anInt9785 = 1024;
	int anInt9786;
	int anInt9787;
	int anInt9788;
	int anInt9789;
	int anInt9790;
	int anInt9791 = -1567210496;
	public static int anInt9792;

	void method12318() {
		/* empty */
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 4:
			((Class282_Sub20_Sub9) this).anInt9786 = class282_sub35.readUnsignedShort() * 1272246787;
			break;
		case 6:
			((Class282_Sub20_Sub9) this).anInt9788 = class282_sub35.readUnsignedByte() * 143871069;
			break;
		case 2:
			((Class282_Sub20_Sub9) this).anInt9784 = class282_sub35.readUnsignedShort() * -950722253;
			break;
		case 5:
			((Class282_Sub20_Sub9) this).anInt9787 = class282_sub35.readUnsignedShort() * 1783321691;
			break;
		case 1:
			((Class282_Sub20_Sub9) this).anInt9791 = class282_sub35.readUnsignedShort() * -991386223;
			break;
		case 3:
			((Class282_Sub20_Sub9) this).anInt9772 = class282_sub35.readUnsignedShort() * -1931059935;
			break;
		case 7:
			((Class282_Sub20_Sub9) this).anInt9780 = class282_sub35.readUnsignedShort() * -1238985711;
			break;
		case 0:
			((Class282_Sub20_Sub9) this).anInt9782 = class282_sub35.readUnsignedByte() * -1016756295;
			break;
		case 8:
			((Class282_Sub20_Sub9) this).anInt9790 = class282_sub35.readUnsignedShort() * -1446465517;
			break;
		}
	}

	final void method15253(Random random, int[][] is, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = (((Class282_Sub20_Sub9) this).anInt9790 * -1414620645 > 0 ? 4096 - Class476.method7931(random, (-1414620645 * (((Class282_Sub20_Sub9) this).anInt9790)), -664753074) : 4096);
		int i_5_ = ((661708017 * ((Class282_Sub20_Sub9) this).anInt9780 * (517976673 * ((Class282_Sub20_Sub9) this).anInt9789)) >> 12);
		int i_6_ = (517976673 * ((Class282_Sub20_Sub9) this).anInt9789 - (i_5_ > 0 ? Class476.method7931(random, i_5_, 1861509778) : 0));
		if (i >= Class316.anInt3670 * -402153223)
			i -= -402153223 * Class316.anInt3670;
		if (i_6_ > 0) {
			if (i_2_ > 0 && i_1_ > 0) {
				int i_7_ = i_1_ / 2;
				int i_8_ = i_2_ / 2;
				int i_9_ = i_7_ < i_6_ ? i_7_ : i_6_;
				int i_10_ = i_8_ < i_6_ ? i_8_ : i_6_;
				int i_11_ = i_9_ + i;
				int i_12_ = i_1_ - i_9_ * 2;
				for (int i_13_ = 0; i_13_ < i_2_; i_13_++) {
					int[] is_14_ = is[i_13_ + i_0_];
					if (i_13_ < i_10_) {
						int i_15_ = i_4_ * i_13_ / i_10_;
						if (0 == (1403054069 * ((Class282_Sub20_Sub9) this).anInt9788)) {
							for (int i_16_ = 0; i_16_ < i_9_; i_16_++) {
								int i_17_ = i_4_ * i_16_ / i_9_;
								is_14_[(i_16_ + i & 1201532175 * Class316.anInt3669)] = is_14_[(i + i_1_ - i_16_ - 1 & (Class316.anInt3669 * 1201532175))] = i_17_ * i_15_ >> 12;
							}
						} else {
							for (int i_18_ = 0; i_18_ < i_9_; i_18_++) {
								int i_19_ = i_18_ * i_4_ / i_9_;
								is_14_[(i + i_18_ & Class316.anInt3669 * 1201532175)] = is_14_[(i_1_ + i - i_18_ - 1 & (1201532175 * Class316.anInt3669))] = i_19_ < i_15_ ? i_19_ : i_15_;
							}
						}
						if (i_12_ + i_11_ > Class316.anInt3670 * -402153223) {
							int i_20_ = Class316.anInt3670 * -402153223 - i_11_;
							Class503.method8365(is_14_, i_11_, i_20_, i_15_);
							Class503.method8365(is_14_, 0, i_12_ - i_20_, i_15_);
						} else
							Class503.method8365(is_14_, i_11_, i_12_, i_15_);
					} else {
						int i_21_ = i_2_ - i_13_ - 1;
						if (i_21_ < i_10_) {
							int i_22_ = i_4_ * i_21_ / i_10_;
							if (0 == (((Class282_Sub20_Sub9) this).anInt9788 * 1403054069)) {
								for (int i_23_ = 0; i_23_ < i_9_; i_23_++) {
									int i_24_ = i_23_ * i_4_ / i_9_;
									is_14_[(i_23_ + i & Class316.anInt3669 * 1201532175)] = is_14_[(i_1_ + i - i_23_ - 1 & (1201532175 * Class316.anInt3669))] = i_22_ * i_24_ >> 12;
								}
							} else {
								for (int i_25_ = 0; i_25_ < i_9_; i_25_++) {
									int i_26_ = i_25_ * i_4_ / i_9_;
									is_14_[(i + i_25_ & 1201532175 * Class316.anInt3669)] = is_14_[(i + i_1_ - i_25_ - 1 & (Class316.anInt3669 * 1201532175))] = i_26_ < i_22_ ? i_26_ : i_22_;
								}
							}
							if (i_12_ + i_11_ > -402153223 * Class316.anInt3670) {
								int i_27_ = Class316.anInt3670 * -402153223 - i_11_;
								Class503.method8365(is_14_, i_11_, i_27_, i_22_);
								Class503.method8365(is_14_, 0, i_12_ - i_27_, i_22_);
							} else
								Class503.method8365(is_14_, i_11_, i_12_, i_22_);
						} else {
							for (int i_28_ = 0; i_28_ < i_9_; i_28_++)
								is_14_[(i + i_28_ & Class316.anInt3669 * 1201532175)] = is_14_[(i_1_ + i - i_28_ - 1 & (1201532175 * Class316.anInt3669))] = i_28_ * i_4_ / i_9_;
							if (i_11_ + i_12_ > -402153223 * Class316.anInt3670) {
								int i_29_ = Class316.anInt3670 * -402153223 - i_11_;
								Class503.method8365(is_14_, i_11_, i_29_, i_4_);
								Class503.method8365(is_14_, 0, i_12_ - i_29_, i_4_);
							} else
								Class503.method8365(is_14_, i_11_, i_12_, i_4_);
						}
					}
				}
			}
		} else if (i_1_ + i > Class316.anInt3670 * -402153223) {
			int i_30_ = Class316.anInt3670 * -402153223 - i;
			for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
				int[] is_32_ = is[i_0_ + i_31_];
				Class503.method8365(is_32_, i, i_30_, i_4_);
				Class503.method8365(is_32_, 0, i_1_ - i_30_, i_4_);
			}
		} else {
			for (int i_33_ = 0; i_33_ < i_2_; i_33_++)
				Class503.method8365(is[i_0_ + i_33_], i, i_1_, i_4_);
		}
	}

	public Class282_Sub20_Sub9() {
		super(0, true);
		((Class282_Sub20_Sub9) this).anInt9784 = -1458989056;
		((Class282_Sub20_Sub9) this).anInt9772 = 470469049;
		((Class282_Sub20_Sub9) this).anInt9786 = -1706934375;
		((Class282_Sub20_Sub9) this).anInt9787 = 760310784;
		((Class282_Sub20_Sub9) this).anInt9788 = 0;
		((Class282_Sub20_Sub9) this).anInt9780 = -1706015744;
		((Class282_Sub20_Sub9) this).anInt9790 = 583027712;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_34_) {
		switch (i) {
		case 4:
			((Class282_Sub20_Sub9) this).anInt9786 = class282_sub35.readUnsignedShort() * 1272246787;
			break;
		case 6:
			((Class282_Sub20_Sub9) this).anInt9788 = class282_sub35.readUnsignedByte() * 143871069;
			break;
		case 2:
			((Class282_Sub20_Sub9) this).anInt9784 = class282_sub35.readUnsignedShort() * -950722253;
			break;
		case 5:
			((Class282_Sub20_Sub9) this).anInt9787 = class282_sub35.readUnsignedShort() * 1783321691;
			break;
		case 1:
			((Class282_Sub20_Sub9) this).anInt9791 = class282_sub35.readUnsignedShort() * -991386223;
			break;
		case 3:
			((Class282_Sub20_Sub9) this).anInt9772 = class282_sub35.readUnsignedShort() * -1931059935;
			break;
		case 7:
			((Class282_Sub20_Sub9) this).anInt9780 = class282_sub35.readUnsignedShort() * -1238985711;
			break;
		case 0:
			((Class282_Sub20_Sub9) this).anInt9782 = class282_sub35.readUnsignedByte() * -1016756295;
			break;
		case 8:
			((Class282_Sub20_Sub9) this).anInt9790 = class282_sub35.readUnsignedShort() * -1446465517;
			break;
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1716674172);
		if (aClass320_7667.aBool3722) {
			int[][] is_35_ = aClass320_7667.method5722((byte) 1);
			int i_36_ = 0;
			int i_37_ = 0;
			int i_38_ = 0;
			int i_39_ = 0;
			int i_40_ = 0;
			boolean bool = true;
			boolean bool_41_ = true;
			int i_42_ = 0;
			int i_43_ = 0;
			int i_44_ = ((-1216431247 * ((Class282_Sub20_Sub9) this).anInt9791 * (-402153223 * Class316.anInt3670)) >> 12);
			int i_45_ = ((((Class282_Sub20_Sub9) this).anInt9784 * -629423621 * (-402153223 * Class316.anInt3670)) >> 12);
			int i_46_ = ((Class316.anInt3671 * -929726253 * (768435937 * ((Class282_Sub20_Sub9) this).anInt9772)) >> 12);
			int i_47_ = ((-1634678613 * ((Class282_Sub20_Sub9) this).anInt9786 * (-929726253 * Class316.anInt3671)) >> 12);
			if (i_47_ <= 1)
				return is_35_[i];
			((Class282_Sub20_Sub9) this).anInt9789 = ((-1378763821 * ((Class282_Sub20_Sub9) this).anInt9787 * (-402153223 * Class316.anInt3670 / 8)) >> 12) * -401313375;
			int i_48_ = -402153223 * Class316.anInt3670 / i_44_ + 1;
			int[][] is_49_ = new int[i_48_][3];
			int[][] is_50_ = new int[i_48_][3];
			Random random = new Random((long) (-2117054839 * (((Class282_Sub20_Sub9) this).anInt9782)));
			for (;;) {
				int i_51_ = i_44_ + Class476.method7931(random, i_45_ - i_44_, -1869445877);
				int i_52_ = i_46_ + Class476.method7931(random, i_47_ - i_46_, 1774809570);
				int i_53_ = i_51_ + i_39_;
				if (i_53_ > -402153223 * Class316.anInt3670) {
					i_51_ = -402153223 * Class316.anInt3670 - i_39_;
					i_53_ = Class316.anInt3670 * -402153223;
				}
				int i_54_;
				if (!bool_41_) {
					int i_55_ = i_40_;
					int[] is_56_ = is_50_[i_40_];
					int i_57_ = 0;
					int i_58_ = i_53_ + i_36_;
					if (i_58_ < 0)
						i_58_ += -402153223 * Class316.anInt3670;
					if (i_58_ > -402153223 * Class316.anInt3670)
						i_58_ -= -402153223 * Class316.anInt3670;
					for (;;) {
						int[] is_59_ = is_50_[i_55_];
						if (i_58_ >= is_59_[0] && i_58_ <= is_59_[1])
							break;
						if (++i_55_ >= i_42_)
							i_55_ = 0;
						i_57_++;
					}
					i_54_ = is_56_[2];
					if (i_55_ != i_40_) {
						int i_60_ = i_39_ + i_36_;
						if (i_60_ < 0)
							i_60_ += Class316.anInt3670 * -402153223;
						if (i_60_ > -402153223 * Class316.anInt3670)
							i_60_ -= Class316.anInt3670 * -402153223;
						for (int i_61_ = 1; i_61_ <= i_57_; i_61_++) {
							int[] is_62_ = is_50_[(i_61_ + i_40_) % i_42_];
							i_54_ = Math.max(i_54_, is_62_[2]);
						}
						for (int i_63_ = 0; i_63_ <= i_57_; i_63_++) {
							int[] is_64_ = is_50_[(i_63_ + i_40_) % i_42_];
							int i_65_ = is_64_[2];
							if (i_65_ != i_54_) {
								int i_66_ = is_64_[0];
								int i_67_ = is_64_[1];
								int i_68_;
								int i_69_;
								if (i_60_ < i_58_) {
									i_68_ = Math.max(i_60_, i_66_);
									i_69_ = Math.min(i_58_, i_67_);
								} else if (i_66_ == 0) {
									i_68_ = 0;
									i_69_ = Math.min(i_58_, i_67_);
								} else {
									i_68_ = Math.max(i_60_, i_66_);
									i_69_ = Class316.anInt3670 * -402153223;
								}
								method15253(random, is_35_, i_68_ + i_38_, i_65_, i_69_ - i_68_, i_54_ - i_65_, 14847072);
							}
						}
					}
					i_40_ = i_55_;
				} else
					i_54_ = 0;
				if (i_54_ + i_52_ > Class316.anInt3671 * -929726253)
					i_52_ = Class316.anInt3671 * -929726253 - i_54_;
				else
					bool = false;
				if (-402153223 * Class316.anInt3670 == i_53_) {
					method15253(random, is_35_, i_37_ + i_39_, i_54_, i_51_, i_52_, -141155701);
					if (bool)
						break;
					bool = true;
					int[] is_70_ = is_49_[i_43_++];
					is_70_[0] = i_39_;
					is_70_[1] = i_53_;
					is_70_[2] = i_52_ + i_54_;
					int[][] is_71_ = is_50_;
					is_50_ = is_49_;
					is_49_ = is_71_;
					i_42_ = i_43_;
					i_43_ = 0;
					i_38_ = i_37_;
					i_37_ = Class476.method7931(random, -402153223 * Class316.anInt3670, 234823605);
					i_36_ = i_37_ - i_38_;
					i_39_ = 0;
					int i_72_ = i_36_;
					if (i_72_ < 0)
						i_72_ += Class316.anInt3670 * -402153223;
					if (i_72_ > -402153223 * Class316.anInt3670)
						i_72_ -= -402153223 * Class316.anInt3670;
					i_40_ = 0;
					for (;;) {
						int[] is_73_ = is_50_[i_40_];
						if (i_72_ >= is_73_[0] && i_72_ <= is_73_[1])
							break;
						if (++i_40_ >= i_42_)
							i_40_ = 0;
					}
					bool_41_ = false;
				} else {
					int[] is_74_ = is_49_[i_43_++];
					is_74_[0] = i_39_;
					is_74_[1] = i_53_;
					is_74_[2] = i_52_ + i_54_;
					method15253(random, is_35_, i_37_ + i_39_, i_54_, i_51_, i_52_, -1942308500);
					i_39_ = i_53_;
				}
			}
		}
		return is;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -1865838576);
		if (aClass320_7667.aBool3722) {
			int[][] is_75_ = aClass320_7667.method5722((byte) 1);
			int i_76_ = 0;
			int i_77_ = 0;
			int i_78_ = 0;
			int i_79_ = 0;
			int i_80_ = 0;
			boolean bool = true;
			boolean bool_81_ = true;
			int i_82_ = 0;
			int i_83_ = 0;
			int i_84_ = ((-1216431247 * ((Class282_Sub20_Sub9) this).anInt9791 * (-402153223 * Class316.anInt3670)) >> 12);
			int i_85_ = ((((Class282_Sub20_Sub9) this).anInt9784 * -629423621 * (-402153223 * Class316.anInt3670)) >> 12);
			int i_86_ = ((Class316.anInt3671 * -929726253 * (768435937 * ((Class282_Sub20_Sub9) this).anInt9772)) >> 12);
			int i_87_ = ((-1634678613 * ((Class282_Sub20_Sub9) this).anInt9786 * (-929726253 * Class316.anInt3671)) >> 12);
			if (i_87_ <= 1)
				return is_75_[i];
			((Class282_Sub20_Sub9) this).anInt9789 = ((-1378763821 * ((Class282_Sub20_Sub9) this).anInt9787 * (-402153223 * Class316.anInt3670 / 8)) >> 12) * -401313375;
			int i_88_ = -402153223 * Class316.anInt3670 / i_84_ + 1;
			int[][] is_89_ = new int[i_88_][3];
			int[][] is_90_ = new int[i_88_][3];
			Random random = new Random((long) (-2117054839 * (((Class282_Sub20_Sub9) this).anInt9782)));
			for (;;) {
				int i_91_ = i_84_ + Class476.method7931(random, i_85_ - i_84_, -629036496);
				int i_92_ = i_86_ + Class476.method7931(random, i_87_ - i_86_, 1212079301);
				int i_93_ = i_91_ + i_79_;
				if (i_93_ > -402153223 * Class316.anInt3670) {
					i_91_ = -402153223 * Class316.anInt3670 - i_79_;
					i_93_ = Class316.anInt3670 * -402153223;
				}
				int i_94_;
				if (!bool_81_) {
					int i_95_ = i_80_;
					int[] is_96_ = is_90_[i_80_];
					int i_97_ = 0;
					int i_98_ = i_93_ + i_76_;
					if (i_98_ < 0)
						i_98_ += -402153223 * Class316.anInt3670;
					if (i_98_ > -402153223 * Class316.anInt3670)
						i_98_ -= -402153223 * Class316.anInt3670;
					for (;;) {
						int[] is_99_ = is_90_[i_95_];
						if (i_98_ >= is_99_[0] && i_98_ <= is_99_[1])
							break;
						if (++i_95_ >= i_82_)
							i_95_ = 0;
						i_97_++;
					}
					i_94_ = is_96_[2];
					if (i_95_ != i_80_) {
						int i_100_ = i_79_ + i_76_;
						if (i_100_ < 0)
							i_100_ += Class316.anInt3670 * -402153223;
						if (i_100_ > -402153223 * Class316.anInt3670)
							i_100_ -= Class316.anInt3670 * -402153223;
						for (int i_101_ = 1; i_101_ <= i_97_; i_101_++) {
							int[] is_102_ = is_90_[(i_101_ + i_80_) % i_82_];
							i_94_ = Math.max(i_94_, is_102_[2]);
						}
						for (int i_103_ = 0; i_103_ <= i_97_; i_103_++) {
							int[] is_104_ = is_90_[(i_103_ + i_80_) % i_82_];
							int i_105_ = is_104_[2];
							if (i_105_ != i_94_) {
								int i_106_ = is_104_[0];
								int i_107_ = is_104_[1];
								int i_108_;
								int i_109_;
								if (i_100_ < i_98_) {
									i_108_ = Math.max(i_100_, i_106_);
									i_109_ = Math.min(i_98_, i_107_);
								} else if (i_106_ == 0) {
									i_108_ = 0;
									i_109_ = Math.min(i_98_, i_107_);
								} else {
									i_108_ = Math.max(i_100_, i_106_);
									i_109_ = Class316.anInt3670 * -402153223;
								}
								method15253(random, is_75_, i_108_ + i_78_, i_105_, i_109_ - i_108_, i_94_ - i_105_, -596161731);
							}
						}
					}
					i_80_ = i_95_;
				} else
					i_94_ = 0;
				if (i_94_ + i_92_ > Class316.anInt3671 * -929726253)
					i_92_ = Class316.anInt3671 * -929726253 - i_94_;
				else
					bool = false;
				if (-402153223 * Class316.anInt3670 == i_93_) {
					method15253(random, is_75_, i_77_ + i_79_, i_94_, i_91_, i_92_, -1416907440);
					if (bool)
						break;
					bool = true;
					int[] is_110_ = is_89_[i_83_++];
					is_110_[0] = i_79_;
					is_110_[1] = i_93_;
					is_110_[2] = i_92_ + i_94_;
					int[][] is_111_ = is_90_;
					is_90_ = is_89_;
					is_89_ = is_111_;
					i_82_ = i_83_;
					i_83_ = 0;
					i_78_ = i_77_;
					i_77_ = Class476.method7931(random, -402153223 * Class316.anInt3670, 1130848814);
					i_76_ = i_77_ - i_78_;
					i_79_ = 0;
					int i_112_ = i_76_;
					if (i_112_ < 0)
						i_112_ += Class316.anInt3670 * -402153223;
					if (i_112_ > -402153223 * Class316.anInt3670)
						i_112_ -= -402153223 * Class316.anInt3670;
					i_80_ = 0;
					for (;;) {
						int[] is_113_ = is_90_[i_80_];
						if (i_112_ >= is_113_[0] && i_112_ <= is_113_[1])
							break;
						if (++i_80_ >= i_82_)
							i_80_ = 0;
					}
					bool_81_ = false;
				} else {
					int[] is_114_ = is_89_[i_83_++];
					is_114_[0] = i_79_;
					is_114_[1] = i_93_;
					is_114_[2] = i_92_ + i_94_;
					method15253(random, is_75_, i_77_ + i_79_, i_94_, i_91_, i_92_, 1243441694);
					i_79_ = i_93_;
				}
			}
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -1799430567);
		if (aClass320_7667.aBool3722) {
			int[][] is_115_ = aClass320_7667.method5722((byte) 1);
			int i_116_ = 0;
			int i_117_ = 0;
			int i_118_ = 0;
			int i_119_ = 0;
			int i_120_ = 0;
			boolean bool = true;
			boolean bool_121_ = true;
			int i_122_ = 0;
			int i_123_ = 0;
			int i_124_ = ((-1216431247 * ((Class282_Sub20_Sub9) this).anInt9791 * (-402153223 * Class316.anInt3670)) >> 12);
			int i_125_ = ((((Class282_Sub20_Sub9) this).anInt9784 * -629423621 * (-402153223 * Class316.anInt3670)) >> 12);
			int i_126_ = ((Class316.anInt3671 * -929726253 * (768435937 * ((Class282_Sub20_Sub9) this).anInt9772)) >> 12);
			int i_127_ = ((-1634678613 * ((Class282_Sub20_Sub9) this).anInt9786 * (-929726253 * Class316.anInt3671)) >> 12);
			if (i_127_ <= 1)
				return is_115_[i];
			((Class282_Sub20_Sub9) this).anInt9789 = ((-1378763821 * ((Class282_Sub20_Sub9) this).anInt9787 * (-402153223 * Class316.anInt3670 / 8)) >> 12) * -401313375;
			int i_128_ = -402153223 * Class316.anInt3670 / i_124_ + 1;
			int[][] is_129_ = new int[i_128_][3];
			int[][] is_130_ = new int[i_128_][3];
			Random random = new Random((long) (-2117054839 * (((Class282_Sub20_Sub9) this).anInt9782)));
			for (;;) {
				int i_131_ = i_124_ + Class476.method7931(random, i_125_ - i_124_, 1051209800);
				int i_132_ = i_126_ + Class476.method7931(random, i_127_ - i_126_, 182362371);
				int i_133_ = i_131_ + i_119_;
				if (i_133_ > -402153223 * Class316.anInt3670) {
					i_131_ = -402153223 * Class316.anInt3670 - i_119_;
					i_133_ = Class316.anInt3670 * -402153223;
				}
				int i_134_;
				if (!bool_121_) {
					int i_135_ = i_120_;
					int[] is_136_ = is_130_[i_120_];
					int i_137_ = 0;
					int i_138_ = i_133_ + i_116_;
					if (i_138_ < 0)
						i_138_ += -402153223 * Class316.anInt3670;
					if (i_138_ > -402153223 * Class316.anInt3670)
						i_138_ -= -402153223 * Class316.anInt3670;
					for (;;) {
						int[] is_139_ = is_130_[i_135_];
						if (i_138_ >= is_139_[0] && i_138_ <= is_139_[1])
							break;
						if (++i_135_ >= i_122_)
							i_135_ = 0;
						i_137_++;
					}
					i_134_ = is_136_[2];
					if (i_135_ != i_120_) {
						int i_140_ = i_119_ + i_116_;
						if (i_140_ < 0)
							i_140_ += Class316.anInt3670 * -402153223;
						if (i_140_ > -402153223 * Class316.anInt3670)
							i_140_ -= Class316.anInt3670 * -402153223;
						for (int i_141_ = 1; i_141_ <= i_137_; i_141_++) {
							int[] is_142_ = is_130_[(i_141_ + i_120_) % i_122_];
							i_134_ = Math.max(i_134_, is_142_[2]);
						}
						for (int i_143_ = 0; i_143_ <= i_137_; i_143_++) {
							int[] is_144_ = is_130_[(i_143_ + i_120_) % i_122_];
							int i_145_ = is_144_[2];
							if (i_145_ != i_134_) {
								int i_146_ = is_144_[0];
								int i_147_ = is_144_[1];
								int i_148_;
								int i_149_;
								if (i_140_ < i_138_) {
									i_148_ = Math.max(i_140_, i_146_);
									i_149_ = Math.min(i_138_, i_147_);
								} else if (i_146_ == 0) {
									i_148_ = 0;
									i_149_ = Math.min(i_138_, i_147_);
								} else {
									i_148_ = Math.max(i_140_, i_146_);
									i_149_ = Class316.anInt3670 * -402153223;
								}
								method15253(random, is_115_, i_148_ + i_118_, i_145_, i_149_ - i_148_, i_134_ - i_145_, -153143058);
							}
						}
					}
					i_120_ = i_135_;
				} else
					i_134_ = 0;
				if (i_134_ + i_132_ > Class316.anInt3671 * -929726253)
					i_132_ = Class316.anInt3671 * -929726253 - i_134_;
				else
					bool = false;
				if (-402153223 * Class316.anInt3670 == i_133_) {
					method15253(random, is_115_, i_117_ + i_119_, i_134_, i_131_, i_132_, -1014721476);
					if (bool)
						break;
					bool = true;
					int[] is_150_ = is_129_[i_123_++];
					is_150_[0] = i_119_;
					is_150_[1] = i_133_;
					is_150_[2] = i_132_ + i_134_;
					int[][] is_151_ = is_130_;
					is_130_ = is_129_;
					is_129_ = is_151_;
					i_122_ = i_123_;
					i_123_ = 0;
					i_118_ = i_117_;
					i_117_ = Class476.method7931(random, -402153223 * Class316.anInt3670, -1050695192);
					i_116_ = i_117_ - i_118_;
					i_119_ = 0;
					int i_152_ = i_116_;
					if (i_152_ < 0)
						i_152_ += Class316.anInt3670 * -402153223;
					if (i_152_ > -402153223 * Class316.anInt3670)
						i_152_ -= -402153223 * Class316.anInt3670;
					i_120_ = 0;
					for (;;) {
						int[] is_153_ = is_130_[i_120_];
						if (i_152_ >= is_153_[0] && i_152_ <= is_153_[1])
							break;
						if (++i_120_ >= i_122_)
							i_120_ = 0;
					}
					bool_121_ = false;
				} else {
					int[] is_154_ = is_129_[i_123_++];
					is_154_[0] = i_119_;
					is_154_[1] = i_133_;
					is_154_[2] = i_132_ + i_134_;
					method15253(random, is_115_, i_117_ + i_119_, i_134_, i_131_, i_132_, 1321396819);
					i_119_ = i_133_;
				}
			}
		}
		return is;
	}

	void method12328() {
		/* empty */
	}

	void method12350() {
		/* empty */
	}

	void method12321(int i) {
		/* empty */
	}

	int[] method12319(int i, int i_155_) {
		int[] is = aClass320_7667.method5721(i, -1227771715);
		if (aClass320_7667.aBool3722) {
			int[][] is_156_ = aClass320_7667.method5722((byte) 1);
			int i_157_ = 0;
			int i_158_ = 0;
			int i_159_ = 0;
			int i_160_ = 0;
			int i_161_ = 0;
			boolean bool = true;
			boolean bool_162_ = true;
			int i_163_ = 0;
			int i_164_ = 0;
			int i_165_ = ((-1216431247 * ((Class282_Sub20_Sub9) this).anInt9791 * (-402153223 * Class316.anInt3670)) >> 12);
			int i_166_ = ((((Class282_Sub20_Sub9) this).anInt9784 * -629423621 * (-402153223 * Class316.anInt3670)) >> 12);
			int i_167_ = ((Class316.anInt3671 * -929726253 * (768435937 * ((Class282_Sub20_Sub9) this).anInt9772)) >> 12);
			int i_168_ = ((-1634678613 * ((Class282_Sub20_Sub9) this).anInt9786 * (-929726253 * Class316.anInt3671)) >> 12);
			if (i_168_ <= 1)
				return is_156_[i];
			((Class282_Sub20_Sub9) this).anInt9789 = ((-1378763821 * ((Class282_Sub20_Sub9) this).anInt9787 * (-402153223 * Class316.anInt3670 / 8)) >> 12) * -401313375;
			int i_169_ = -402153223 * Class316.anInt3670 / i_165_ + 1;
			int[][] is_170_ = new int[i_169_][3];
			int[][] is_171_ = new int[i_169_][3];
			Random random = new Random((long) (-2117054839 * (((Class282_Sub20_Sub9) this).anInt9782)));
			for (;;) {
				int i_172_ = i_165_ + Class476.method7931(random, i_166_ - i_165_, 43789865);
				int i_173_ = i_167_ + Class476.method7931(random, i_168_ - i_167_, -1448566396);
				int i_174_ = i_172_ + i_160_;
				if (i_174_ > -402153223 * Class316.anInt3670) {
					i_172_ = -402153223 * Class316.anInt3670 - i_160_;
					i_174_ = Class316.anInt3670 * -402153223;
				}
				int i_175_;
				if (!bool_162_) {
					int i_176_ = i_161_;
					int[] is_177_ = is_171_[i_161_];
					int i_178_ = 0;
					int i_179_ = i_174_ + i_157_;
					if (i_179_ < 0)
						i_179_ += -402153223 * Class316.anInt3670;
					if (i_179_ > -402153223 * Class316.anInt3670)
						i_179_ -= -402153223 * Class316.anInt3670;
					for (;;) {
						int[] is_180_ = is_171_[i_176_];
						if (i_179_ >= is_180_[0] && i_179_ <= is_180_[1])
							break;
						if (++i_176_ >= i_163_)
							i_176_ = 0;
						i_178_++;
					}
					i_175_ = is_177_[2];
					if (i_176_ != i_161_) {
						int i_181_ = i_160_ + i_157_;
						if (i_181_ < 0)
							i_181_ += Class316.anInt3670 * -402153223;
						if (i_181_ > -402153223 * Class316.anInt3670)
							i_181_ -= Class316.anInt3670 * -402153223;
						for (int i_182_ = 1; i_182_ <= i_178_; i_182_++) {
							int[] is_183_ = is_171_[(i_182_ + i_161_) % i_163_];
							i_175_ = Math.max(i_175_, is_183_[2]);
						}
						for (int i_184_ = 0; i_184_ <= i_178_; i_184_++) {
							int[] is_185_ = is_171_[(i_184_ + i_161_) % i_163_];
							int i_186_ = is_185_[2];
							if (i_186_ != i_175_) {
								int i_187_ = is_185_[0];
								int i_188_ = is_185_[1];
								int i_189_;
								int i_190_;
								if (i_181_ < i_179_) {
									i_189_ = Math.max(i_181_, i_187_);
									i_190_ = Math.min(i_179_, i_188_);
								} else if (i_187_ == 0) {
									i_189_ = 0;
									i_190_ = Math.min(i_179_, i_188_);
								} else {
									i_189_ = Math.max(i_181_, i_187_);
									i_190_ = Class316.anInt3670 * -402153223;
								}
								method15253(random, is_156_, i_189_ + i_159_, i_186_, i_190_ - i_189_, i_175_ - i_186_, 212976521);
							}
						}
					}
					i_161_ = i_176_;
				} else
					i_175_ = 0;
				if (i_175_ + i_173_ > Class316.anInt3671 * -929726253)
					i_173_ = Class316.anInt3671 * -929726253 - i_175_;
				else
					bool = false;
				if (-402153223 * Class316.anInt3670 == i_174_) {
					method15253(random, is_156_, i_158_ + i_160_, i_175_, i_172_, i_173_, -946908989);
					if (bool)
						break;
					bool = true;
					int[] is_191_ = is_170_[i_164_++];
					is_191_[0] = i_160_;
					is_191_[1] = i_174_;
					is_191_[2] = i_173_ + i_175_;
					int[][] is_192_ = is_171_;
					is_171_ = is_170_;
					is_170_ = is_192_;
					i_163_ = i_164_;
					i_164_ = 0;
					i_159_ = i_158_;
					i_158_ = Class476.method7931(random, -402153223 * Class316.anInt3670, 1102098553);
					i_157_ = i_158_ - i_159_;
					i_160_ = 0;
					int i_193_ = i_157_;
					if (i_193_ < 0)
						i_193_ += Class316.anInt3670 * -402153223;
					if (i_193_ > -402153223 * Class316.anInt3670)
						i_193_ -= -402153223 * Class316.anInt3670;
					i_161_ = 0;
					for (;;) {
						int[] is_194_ = is_171_[i_161_];
						if (i_193_ >= is_194_[0] && i_193_ <= is_194_[1])
							break;
						if (++i_161_ >= i_163_)
							i_161_ = 0;
					}
					bool_162_ = false;
				} else {
					int[] is_195_ = is_170_[i_164_++];
					is_195_[0] = i_160_;
					is_195_[1] = i_174_;
					is_195_[2] = i_173_ + i_175_;
					method15253(random, is_156_, i_158_ + i_160_, i_175_, i_172_, i_173_, -1730721144);
					i_160_ = i_174_;
				}
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 4:
			((Class282_Sub20_Sub9) this).anInt9786 = class282_sub35.readUnsignedShort() * 1272246787;
			break;
		case 6:
			((Class282_Sub20_Sub9) this).anInt9788 = class282_sub35.readUnsignedByte() * 143871069;
			break;
		case 2:
			((Class282_Sub20_Sub9) this).anInt9784 = class282_sub35.readUnsignedShort() * -950722253;
			break;
		case 5:
			((Class282_Sub20_Sub9) this).anInt9787 = class282_sub35.readUnsignedShort() * 1783321691;
			break;
		case 1:
			((Class282_Sub20_Sub9) this).anInt9791 = class282_sub35.readUnsignedShort() * -991386223;
			break;
		case 3:
			((Class282_Sub20_Sub9) this).anInt9772 = class282_sub35.readUnsignedShort() * -1931059935;
			break;
		case 7:
			((Class282_Sub20_Sub9) this).anInt9780 = class282_sub35.readUnsignedShort() * -1238985711;
			break;
		case 0:
			((Class282_Sub20_Sub9) this).anInt9782 = class282_sub35.readUnsignedByte() * -1016756295;
			break;
		case 8:
			((Class282_Sub20_Sub9) this).anInt9790 = class282_sub35.readUnsignedShort() * -1446465517;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 4:
			((Class282_Sub20_Sub9) this).anInt9786 = class282_sub35.readUnsignedShort() * 1272246787;
			break;
		case 6:
			((Class282_Sub20_Sub9) this).anInt9788 = class282_sub35.readUnsignedByte() * 143871069;
			break;
		case 2:
			((Class282_Sub20_Sub9) this).anInt9784 = class282_sub35.readUnsignedShort() * -950722253;
			break;
		case 5:
			((Class282_Sub20_Sub9) this).anInt9787 = class282_sub35.readUnsignedShort() * 1783321691;
			break;
		case 1:
			((Class282_Sub20_Sub9) this).anInt9791 = class282_sub35.readUnsignedShort() * -991386223;
			break;
		case 3:
			((Class282_Sub20_Sub9) this).anInt9772 = class282_sub35.readUnsignedShort() * -1931059935;
			break;
		case 7:
			((Class282_Sub20_Sub9) this).anInt9780 = class282_sub35.readUnsignedShort() * -1238985711;
			break;
		case 0:
			((Class282_Sub20_Sub9) this).anInt9782 = class282_sub35.readUnsignedByte() * -1016756295;
			break;
		case 8:
			((Class282_Sub20_Sub9) this).anInt9790 = class282_sub35.readUnsignedShort() * -1446465517;
			break;
		}
	}

	void method12329() {
		/* empty */
	}

	final void method15254(Random random, int[][] is, int i, int i_196_, int i_197_, int i_198_) {
		int i_199_ = (((Class282_Sub20_Sub9) this).anInt9790 * -1414620645 > 0 ? 4096 - Class476.method7931(random, (-1414620645 * (((Class282_Sub20_Sub9) this).anInt9790)), -649523995) : 4096);
		int i_200_ = ((661708017 * ((Class282_Sub20_Sub9) this).anInt9780 * (517976673 * ((Class282_Sub20_Sub9) this).anInt9789)) >> 12);
		int i_201_ = (517976673 * ((Class282_Sub20_Sub9) this).anInt9789 - (i_200_ > 0 ? Class476.method7931(random, i_200_, -1859752444) : 0));
		if (i >= Class316.anInt3670 * -402153223)
			i -= -402153223 * Class316.anInt3670;
		if (i_201_ > 0) {
			if (i_198_ > 0 && i_197_ > 0) {
				int i_202_ = i_197_ / 2;
				int i_203_ = i_198_ / 2;
				int i_204_ = i_202_ < i_201_ ? i_202_ : i_201_;
				int i_205_ = i_203_ < i_201_ ? i_203_ : i_201_;
				int i_206_ = i_204_ + i;
				int i_207_ = i_197_ - i_204_ * 2;
				for (int i_208_ = 0; i_208_ < i_198_; i_208_++) {
					int[] is_209_ = is[i_208_ + i_196_];
					if (i_208_ < i_205_) {
						int i_210_ = i_199_ * i_208_ / i_205_;
						if (0 == (1403054069 * ((Class282_Sub20_Sub9) this).anInt9788)) {
							for (int i_211_ = 0; i_211_ < i_204_; i_211_++) {
								int i_212_ = i_199_ * i_211_ / i_204_;
								is_209_[(i_211_ + i & 1201532175 * Class316.anInt3669)] = is_209_[(i + i_197_ - i_211_ - 1 & (Class316.anInt3669 * 1201532175))] = i_212_ * i_210_ >> 12;
							}
						} else {
							for (int i_213_ = 0; i_213_ < i_204_; i_213_++) {
								int i_214_ = i_213_ * i_199_ / i_204_;
								is_209_[(i + i_213_ & Class316.anInt3669 * 1201532175)] = is_209_[(i_197_ + i - i_213_ - 1 & (1201532175 * Class316.anInt3669))] = i_214_ < i_210_ ? i_214_ : i_210_;
							}
						}
						if (i_207_ + i_206_ > Class316.anInt3670 * -402153223) {
							int i_215_ = Class316.anInt3670 * -402153223 - i_206_;
							Class503.method8365(is_209_, i_206_, i_215_, i_210_);
							Class503.method8365(is_209_, 0, i_207_ - i_215_, i_210_);
						} else
							Class503.method8365(is_209_, i_206_, i_207_, i_210_);
					} else {
						int i_216_ = i_198_ - i_208_ - 1;
						if (i_216_ < i_205_) {
							int i_217_ = i_199_ * i_216_ / i_205_;
							if (0 == (((Class282_Sub20_Sub9) this).anInt9788 * 1403054069)) {
								for (int i_218_ = 0; i_218_ < i_204_; i_218_++) {
									int i_219_ = i_218_ * i_199_ / i_204_;
									is_209_[i_218_ + i & (Class316.anInt3669 * 1201532175)] = is_209_[(i_197_ + i - i_218_ - 1 & (1201532175 * Class316.anInt3669))] = i_217_ * i_219_ >> 12;
								}
							} else {
								for (int i_220_ = 0; i_220_ < i_204_; i_220_++) {
									int i_221_ = i_220_ * i_199_ / i_204_;
									is_209_[(i + i_220_ & (1201532175 * Class316.anInt3669))] = is_209_[(i + i_197_ - i_220_ - 1 & (Class316.anInt3669 * 1201532175))] = i_221_ < i_217_ ? i_221_ : i_217_;
								}
							}
							if (i_207_ + i_206_ > -402153223 * Class316.anInt3670) {
								int i_222_ = Class316.anInt3670 * -402153223 - i_206_;
								Class503.method8365(is_209_, i_206_, i_222_, i_217_);
								Class503.method8365(is_209_, 0, i_207_ - i_222_, i_217_);
							} else
								Class503.method8365(is_209_, i_206_, i_207_, i_217_);
						} else {
							for (int i_223_ = 0; i_223_ < i_204_; i_223_++)
								is_209_[(i + i_223_ & Class316.anInt3669 * 1201532175)] = is_209_[(i_197_ + i - i_223_ - 1 & (1201532175 * Class316.anInt3669))] = i_223_ * i_199_ / i_204_;
							if (i_206_ + i_207_ > -402153223 * Class316.anInt3670) {
								int i_224_ = Class316.anInt3670 * -402153223 - i_206_;
								Class503.method8365(is_209_, i_206_, i_224_, i_199_);
								Class503.method8365(is_209_, 0, i_207_ - i_224_, i_199_);
							} else
								Class503.method8365(is_209_, i_206_, i_207_, i_199_);
						}
					}
				}
			}
		} else if (i_197_ + i > Class316.anInt3670 * -402153223) {
			int i_225_ = Class316.anInt3670 * -402153223 - i;
			for (int i_226_ = 0; i_226_ < i_198_; i_226_++) {
				int[] is_227_ = is[i_196_ + i_226_];
				Class503.method8365(is_227_, i, i_225_, i_199_);
				Class503.method8365(is_227_, 0, i_197_ - i_225_, i_199_);
			}
		} else {
			for (int i_228_ = 0; i_228_ < i_198_; i_228_++)
				Class503.method8365(is[i_196_ + i_228_], i, i_197_, i_199_);
		}
	}

	static void method15255(short i) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.method4778(15, 0L);
		class282_sub50_sub12.method14965((byte) 18);
	}

	static final void method15256(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class118.anInt1381 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1326599461);
	}
}
