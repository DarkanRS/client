
/* Class329_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class329_Sub1 extends Class329 {
	static int[] anIntArray7713;
	static boolean aBool7714;
	static final int anInt7715 = 0;
	static final int anInt7716 = 1;
	static boolean aBool7717 = false;
	static final int anInt7718 = 3;
	Class239 aClass239_7719;
	static int[] anIntArray7720;
	static int[] anIntArray7721;
	static final int anInt7722 = 2;
	int anInt7723 = 1485026017;
	static int[] anIntArray7724;
	Class474 aClass474_7725;
	public static int anInt7726;

	public final void method12458(Class505 class505, byte[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, Class336[] class336s) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i_6_ = -1;
		for (;;) {
			int i_7_ = class282_sub35.readSmart2(-36495457);
			if (i_7_ == 0)
				break;
			i_6_ += i_7_;
			int i_8_ = 0;
			for (;;) {
				int i_9_ = class282_sub35.readUnsignedSmart(1657068637);
				if (0 == i_9_)
					break;
				i_8_ += i_9_ - 1;
				int i_10_ = i_8_ & 0x3f;
				int i_11_ = i_8_ >> 6 & 0x3f;
				int i_12_ = i_8_ >> 12;
				int i_13_ = class282_sub35.readUnsignedByte();
				int i_14_ = i_13_ >> 2;
				int i_15_ = i_13_ & 0x3;
				if (i_2_ == i_12_ && i_11_ >= i_3_ && i_11_ < 8 + i_3_ && i_10_ >= i_4_ && i_10_ < i_4_ + 8) {
					Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(i_6_, 65280);
					int i_16_ = i_0_ + Class222.method3756(i_11_ & 0x7, i_10_ & 0x7, i_5_, (class478.anInt5648 * -752356381), (class478.anInt5649 * -1610844647), i_15_, (byte) -82);
					int i_17_ = (i_1_ + Class3.method282(i_11_ & 0x7, i_10_ & 0x7, i_5_, -752356381 * class478.anInt5648, class478.anInt5649 * -1610844647, i_15_, 2019809398));
					if (i_16_ > 0 && i_17_ > 0 && i_16_ < -1230013231 * anInt3784 - 1 && i_17_ < 2024737111 * anInt3785 - 1) {
						Class336 class336 = null;
						if (!aBool3786) {
							int i_18_ = i;
							if (((aClass311_3787.aByteArrayArrayArray3638[1][i_16_][i_17_]) & 0x2) == 2)
								i_18_--;
							if (i_18_ >= 0)
								class336 = class336s[i_18_];
						}
						method12459(class505, i, i, i_16_, i_17_, i_6_, i_5_ + i_15_ & 0x3, i_14_, class336, -1, 1803094851);
					}
				}
			}
		}
	}

	final void method12459(Class505 class505, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, Class336 class336, int i_25_, int i_26_) {
		if (i_19_ < -1623875645 * ((Class329_Sub1) this).anInt7723)
			((Class329_Sub1) this).anInt7723 = 231917803 * i_19_;
		Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(i_22_, 65280);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(590379458) != 0 || !class478.aBool5701) {
			int i_27_;
			int i_28_;
			if (i_23_ == 1 || 3 == i_23_) {
				i_27_ = -1610844647 * class478.anInt5649;
				i_28_ = class478.anInt5648 * -752356381;
			} else {
				i_27_ = class478.anInt5648 * -752356381;
				i_28_ = class478.anInt5649 * -1610844647;
			}
			int i_29_;
			int i_30_;
			if (i_27_ + i_20_ <= -1230013231 * anInt3784) {
				i_29_ = (i_27_ >> 1) + i_20_;
				i_30_ = (1 + i_27_ >> 1) + i_20_;
			} else {
				i_29_ = i_20_;
				i_30_ = 1 + i_20_;
			}
			int i_31_;
			int i_32_;
			if (i_28_ + i_21_ <= anInt3785 * 2024737111) {
				i_31_ = (i_28_ >> 1) + i_21_;
				i_32_ = (1 + i_28_ >> 1) + i_21_;
			} else {
				i_31_ = i_21_;
				i_32_ = 1 + i_21_;
			}
			Class390 class390 = aClass206_3776.aClass390Array2591[i];
			int i_33_ = ((class390.method6722(i_29_, i_31_, 65280) + class390.method6722(i_30_, i_31_, 65280) + class390.method6722(i_29_, i_32_, 65280) + class390.method6722(i_30_, i_32_, 65280)) >> 2);
			int i_34_ = (i_27_ << 8) + (i_20_ << 9);
			int i_35_ = (i_21_ << 9) + (i_28_ << 8);
			boolean bool = aBool3773 && !aBool3786 && class478.aBool5655;
			if (class478.method7974(317865608))
				Class397.method6775(i_19_, i_20_, i_21_, i_23_, class478, null, null, 2109240355);
			boolean bool_36_ = (i_25_ == -1 && !class478.method7967((byte) 85) && class478.anIntArray5650 == null && !class478.aBool5706 && !class478.aBool5699);
			if (!aBool7717 || ((!Class308.method5473(i_24_, -2097799445) || 1 == -1316444551 * class478.anInt5656) && (!Class240.method4138(i_24_, -1938518575) || class478.anInt5656 * -1316444551 != 0))) {
				if (Class458.aClass458_5480.anInt5481 * 1109376893 == i_24_) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 84) != 0 || class478.anInt5652 * -348507379 != 0 || 1 == class478.anInt5677 * 647396503 || class478.aBool5685) {
						Class521_Sub1_Sub3 class521_sub1_sub3;
						if (bool_36_) {
							Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1 = (new Class521_Sub1_Sub3_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_19_, i, i_34_, i_33_, i_35_, aBool3786, i_23_, bool));
							if (class521_sub1_sub3_sub1.method86(1102115730))
								class521_sub1_sub3_sub1.method87(class505, -101230669);
							class521_sub1_sub3 = class521_sub1_sub3_sub1;
						} else
							class521_sub1_sub3 = (new Class521_Sub1_Sub3_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_19_, i, i_34_, i_33_, i_35_, aBool3786, i_23_, i_25_));
						aClass206_3776.method3393(i_19_, i_20_, i_21_, class521_sub1_sub3, -1479943692);
						if (647396503 * class478.anInt5677 == 1 && null != class336)
							class336.method5968(i_20_, i_21_, 952601873);
					}
				} else if ((i_24_ == 1109376893 * Class458.aClass458_5490.anInt5481) || (Class458.aClass458_5492.anInt5481 * 1109376893 == i_24_)) {
					Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = null;
					Class521_Sub1_Sub1 class521_sub1_sub1;
					int i_37_;
					if (bool_36_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_38_ = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_19_, i, i_34_, i_33_, i_35_, aBool3786, i_20_, i_27_ + i_20_ - 1, i_21_, i_28_ + i_21_ - 1, i_24_, i_23_, bool));
						i_37_ = class521_sub1_sub1_sub6_38_.method16115(1669328941);
						class521_sub1_sub1 = class521_sub1_sub1_sub6_38_;
						class521_sub1_sub1_sub6 = class521_sub1_sub1_sub6_38_;
					} else {
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_19_, i, i_34_, i_33_, i_35_, aBool3786, i_20_, i_27_ + i_20_ - 1, i_21_, i_21_ + i_28_ - 1, i_24_, i_23_, i_25_));
						i_37_ = 15;
					}
					if (aClass206_3776.method3397(class521_sub1_sub1, false, 1685535245)) {
						if (class521_sub1_sub1_sub6 != null && class521_sub1_sub1_sub6.method86(1742426135))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						if (class478.aBool5657 && aBool3773) {
							if (i_37_ > 30)
								i_37_ = 30;
							for (int i_39_ = 0; i_39_ <= i_27_; i_39_++) {
								for (int i_40_ = 0; i_40_ <= i_28_; i_40_++)
									class390.LA(i_20_ + i_39_, i_21_ + i_40_, i_37_);
							}
						}
					}
					if (0 != 647396503 * class478.anInt5677 && class336 != null)
						class336.method5967(i_20_, i_21_, i_27_, i_28_, class478.aBool5664, !class478.aBool5686, (byte) -99);
				} else if (Class240.method4138(i_24_, -2013524019) || Class228.method3849(i_24_, 1006843265)) {
					Class521_Sub1_Sub1 class521_sub1_sub1;
					if (bool_36_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_19_, i, i_34_, i_33_, i_35_, aBool3786, i_20_, i_27_ + i_20_ - 1, i_21_, i_28_ + i_21_ - 1, i_24_, i_23_, bool));
						if (class521_sub1_sub1_sub6.method86(2126103199))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						class521_sub1_sub1 = class521_sub1_sub1_sub6;
					} else
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_19_, i, i_34_, i_33_, i_35_, aBool3786, i_20_, i_20_ + i_27_ - 1, i_21_, i_28_ + i_21_ - 1, i_24_, i_23_, i_25_));
					aClass206_3776.method3397(class521_sub1_sub1, false, -83080800);
					if (aBool3773 && !aBool3786 && Class240.method4138(i_24_, -1226229167) && (1109376893 * Class458.aClass458_5491.anInt5481 != i_24_) && i_19_ > 0 && 0 != class478.anInt5656 * -1316444551)
						aByteArrayArrayArray3794[i_19_][i_20_][i_21_] |= 0x4;
					if (647396503 * class478.anInt5677 != 0 && null != class336)
						class336.method5967(i_20_, i_21_, i_27_, i_28_, class478.aBool5664, !class478.aBool5686, (byte) -122);
				} else if (method12464(class505, i_24_, i_23_, bool_36_, class478, i_25_, i_19_, i, i_34_, i_33_, i_35_, i_20_, i_21_, bool, class390, class336, i_27_, i_28_, -266687158) || method12465(class505, i_24_, i_23_, bool_36_, class478, i_25_, i_19_, i, i_34_, i_33_, i_35_, i_20_, i_21_, 1825194331)) {
					/* empty */
				}
			}
		}
	}

	public final void method12460(Class505 class505, RsByteBuffer class282_sub35, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		if (!aBool3786) {
			boolean bool = false;
			Class535 class535 = null;
			int i_48_ = (i_44_ & 0x7) * 8;
			int i_49_ = 8 * (i_45_ & 0x7);
			while (class282_sub35.index * -1990677291 < class282_sub35.buffer.length) {
				int i_50_ = class282_sub35.readUnsignedByte();
				if (i_50_ == 0) {
					if (class535 == null)
						class535 = new Class535(class282_sub35, (((Class329_Sub1) this).aClass239_7719));
					else
						class535.method11468(class282_sub35, (((Class329_Sub1) this).aClass239_7719), -1126147349);
				} else if (1 == i_50_) {
					int i_51_ = class282_sub35.readUnsignedByte();
					if (i_51_ > 0) {
						for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
							Class287 class287 = new Class287(class505, (-1928575293 * aClass206_3776.anInt2592), class282_sub35, 2);
							if (1711091569 * class287.anInt3430 == 31) {
								Class416 class416 = (Class282_Sub23.aClass436_7683.method7304(class282_sub35.readUnsignedShort(), (byte) -123));
								class287.method5061(class416.anInt4986 * 633357, -1719615659 * class416.anInt4989, 976456007 * class416.anInt4988, class416.anInt4987 * 475908455, (byte) -1);
							}
							if (class505.method8463() > 0) {
								Class282_Sub24 class282_sub24 = class287.aClass282_Sub24_3425;
								int i_53_ = (class282_sub24.method12368((byte) 87) >> 9);
								int i_54_ = (class282_sub24.method12394(1893246471) >> 9);
								if (i_43_ == class287.anInt3419 * -2046020753 && i_53_ >= i_48_ && i_53_ < i_48_ + 8 && i_54_ >= i_49_ && i_54_ < 8 + i_49_) {
									int i_55_ = ((i_41_ << 9) + (Class282_Sub20_Sub39.method15436((class282_sub24.method12368((byte) 59) & 0xfff), (class282_sub24.method12394(1407877313) & 0xfff), i_46_, -1874924682)));
									int i_56_ = ((i_42_ << 9) + (Class354.method6214((class282_sub24.method12368((byte) 59) & 0xfff), (class282_sub24.method12394(1257447923) & 0xfff), i_46_, 1208348200)));
									i_53_ = i_55_ >> 9;
									i_54_ = i_56_ >> 9;
									if (i_53_ >= 0 && i_54_ >= 0 && i_53_ < -1230013231 * anInt3784 && i_54_ < 2024737111 * anInt3785) {
										class282_sub24.method12374(i_55_, ((anIntArrayArrayArray3818[i_43_][i_53_][i_54_]) - class282_sub24.method12369(1534020223)), i_56_, 1982941604);
										aClass206_3776.method3430(class287, (byte) 1);
									}
								}
							}
						}
					}
				} else if (i_50_ == 2) {
					if (null == class535)
						class535 = new Class535();
					class535.method11471(class282_sub35, (byte) -104);
				} else if (i_50_ == 128) {
					if (null == class535)
						class535 = new Class535();
					class535.method11472(class282_sub35, ((Class329_Sub1) this).aClass239_7719, -1865936153);
				} else if (i_50_ == 129) {
					if (null == aByteArrayArrayArray3788)
						aByteArrayArrayArray3788 = new byte[4][][];
					for (int i_57_ = 0; i_57_ < 4; i_57_++) {
						byte i_58_ = class282_sub35.readByte((short) -23505);
						if (i_58_ == 0 && aByteArrayArrayArray3788[i] != null) {
							if (i_57_ <= i_43_) {
								int i_59_ = i_41_;
								int i_60_ = i_41_ + 7;
								int i_61_ = i_42_;
								int i_62_ = 7 + i_42_;
								if (i_59_ < 0)
									i_59_ = 0;
								else if (i_59_ >= -1230013231 * anInt3784)
									i_59_ = anInt3784 * -1230013231;
								if (i_60_ < 0)
									i_60_ = 0;
								else if (i_60_ >= anInt3784 * -1230013231)
									i_60_ = anInt3784 * -1230013231;
								if (i_61_ < 0)
									i_61_ = 0;
								else if (i_61_ >= anInt3785 * 2024737111)
									i_61_ = 2024737111 * anInt3785;
								if (i_62_ < 0)
									i_62_ = 0;
								else if (i_62_ >= 2024737111 * anInt3785)
									i_62_ = anInt3785 * 2024737111;
								for (/**/; i_59_ < i_60_; i_59_++) {
									for (/**/; i_61_ < i_62_; i_61_++)
										aByteArrayArrayArray3788[i][i_59_][i_61_] = (byte) 0;
								}
							}
						} else if (i_58_ == 1) {
							if (aByteArrayArrayArray3788[i] == null)
								aByteArrayArrayArray3788[i] = (new byte[1 + anInt3784 * -1230013231][1 + 2024737111 * anInt3785]);
							for (int i_63_ = 0; i_63_ < 64; i_63_ += 4) {
								for (int i_64_ = 0; i_64_ < 64; i_64_ += 4) {
									byte i_65_ = class282_sub35.readByte((short) -19282);
									if (i_57_ <= i_43_) {
										for (int i_66_ = i_63_; i_66_ < i_63_ + 4; i_66_++) {
											for (int i_67_ = i_64_; i_67_ < i_64_ + 4; i_67_++) {
												if (i_66_ >= i_48_ && i_66_ < i_48_ + 8 && i_67_ >= i_49_ && i_67_ < 8 + i_49_) {
													int i_68_ = (i_41_ + (Class112.method1871(i_66_ & 0x7, i_67_ & 0x7, i_46_, 1449989045)));
													int i_69_ = (i_42_ + (Class2.method259(i_66_ & 0x7, i_67_ & 0x7, i_46_, 959009236)));
													if (i_68_ >= 0 && (i_68_ < (anInt3784 * -1230013231)) && i_69_ >= 0 && (i_69_ < (2024737111 * anInt3785))) {
														aByteArrayArrayArray3788[i][i_68_][i_69_] = i_65_;
														bool = true;
													}
												}
											}
										}
									}
								}
							}
						} else if (2 == i_58_)
							continue;
					}
				} else
					throw new IllegalStateException("");
			}
			if (null != class535)
				((Class329_Sub1) this).aClass239_7719.method4056(i_41_ >> 3, i_42_ >> 3, class535, (byte) 95);
			if (!bool && null != aByteArrayArrayArray3788 && aByteArrayArrayArray3788[i] != null) {
				int i_70_ = 7 + i_41_;
				int i_71_ = i_42_ + 7;
				for (int i_72_ = i_41_; i_72_ < i_70_; i_72_++) {
					for (int i_73_ = i_42_; i_73_ < i_71_; i_73_++)
						aByteArrayArrayArray3788[i][i_72_][i_73_] = (byte) 0;
				}
			}
		}
	}

	public final void method12461(Class505 class505, byte[] is, int i, int i_74_, Class336[] class336s, int i_75_) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i_76_ = -1;
		for (;;) {
			int i_77_ = class282_sub35.readSmart2(75082230);
			if (0 == i_77_)
				break;
			i_76_ += i_77_;
			int i_78_ = 0;
			for (;;) {
				int i_79_ = class282_sub35.readUnsignedSmart(2017450653);
				if (0 == i_79_)
					break;
				i_78_ += i_79_ - 1;
				int i_80_ = i_78_ & 0x3f;
				int i_81_ = i_78_ >> 6 & 0x3f;
				int i_82_ = i_78_ >> 12;
				int i_83_ = class282_sub35.readUnsignedByte();
				int i_84_ = i_83_ >> 2;
				int i_85_ = i_83_ & 0x3;
				int i_86_ = i + i_81_;
				int i_87_ = i_80_ + i_74_;
				if (i_86_ > 0 && i_87_ > 0 && i_86_ < anInt3784 * -1230013231 - 1 && i_87_ < 2024737111 * anInt3785 - 1) {
					Class336 class336 = null;
					if (!aBool3786) {
						int i_88_ = i_82_;
						if (((aClass311_3787.aByteArrayArrayArray3638[1][i_86_][i_87_]) & 0x2) == 2)
							i_88_--;
						if (i_88_ >= 0)
							class336 = class336s[i_88_];
					}
					method12459(class505, i_82_, i_82_, i_86_, i_87_, i_76_, i_85_, i_84_, class336, -1, 2114561381);
				}
			}
		}
	}

	public final void method12462(Class505 class505, byte[] is, int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, Class336[] class336s, int i_95_) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i_96_ = -1;
		for (;;) {
			int i_97_ = class282_sub35.readSmart2(-378735322);
			if (i_97_ == 0)
				break;
			i_96_ += i_97_;
			int i_98_ = 0;
			for (;;) {
				int i_99_ = class282_sub35.readUnsignedSmart(2010932473);
				if (0 == i_99_)
					break;
				i_98_ += i_99_ - 1;
				int i_100_ = i_98_ & 0x3f;
				int i_101_ = i_98_ >> 6 & 0x3f;
				int i_102_ = i_98_ >> 12;
				int i_103_ = class282_sub35.readUnsignedByte();
				int i_104_ = i_103_ >> 2;
				int i_105_ = i_103_ & 0x3;
				if (i_91_ == i_102_ && i_101_ >= i_92_ && i_101_ < 8 + i_92_ && i_100_ >= i_93_ && i_100_ < i_93_ + 8) {
					Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(i_96_, 65280);
					int i_106_ = i_89_ + Class222.method3756(i_101_ & 0x7, i_100_ & 0x7, i_94_, (class478.anInt5648 * -752356381), (class478.anInt5649 * -1610844647), i_105_, (byte) 44);
					int i_107_ = (i_90_ + Class3.method282(i_101_ & 0x7, i_100_ & 0x7, i_94_, -752356381 * class478.anInt5648, class478.anInt5649 * -1610844647, i_105_, 1441497902));
					if (i_106_ > 0 && i_107_ > 0 && i_106_ < -1230013231 * anInt3784 - 1 && i_107_ < 2024737111 * anInt3785 - 1) {
						Class336 class336 = null;
						if (!aBool3786) {
							int i_108_ = i;
							if (((aClass311_3787.aByteArrayArrayArray3638[1][i_106_][i_107_]) & 0x2) == 2)
								i_108_--;
							if (i_108_ >= 0)
								class336 = class336s[i_108_];
						}
						method12459(class505, i, i, i_106_, i_107_, i_96_, i_94_ + i_105_ & 0x3, i_104_, class336, -1, 1428988045);
					}
				}
			}
		}
	}

	public final void method12463(Class505 class505, boolean bool, int i) {
		aClass206_3776.method3400();
		if (!bool) {
			if (1599084401 * anInt3845 > 1) {
				for (int i_109_ = 0; i_109_ < anInt3784 * -1230013231; i_109_++) {
					for (int i_110_ = 0; i_110_ < anInt3785 * 2024737111; i_110_++) {
						if (2 == ((aClass311_3787.aByteArrayArrayArray3638[1][i_109_][i_110_]) & 0x2))
							aClass206_3776.method3382(i_109_, i_110_, -2046779501);
					}
				}
			}
			for (int i_111_ = 0; i_111_ < 1599084401 * anInt3845; i_111_++) {
				for (int i_112_ = 0; i_112_ <= anInt3785 * 2024737111; i_112_++) {
					for (int i_113_ = 0; i_113_ <= anInt3784 * -1230013231; i_113_++) {
						if ((aByteArrayArrayArray3794[i_111_][i_113_][i_112_] & 0x4) != 0) {
							int i_114_ = i_113_;
							int i_115_ = i_113_;
							int i_116_ = i_112_;
							int i_117_;
							for (i_117_ = i_112_; (i_116_ > 0 && 0 != ((aByteArrayArrayArray3794[i_111_][i_113_][i_116_ - 1]) & 0x4) && i_117_ - i_116_ < 10); i_116_--) {
								/* empty */
							}
							for (/**/; (i_117_ < anInt3785 * 2024737111 && 0 != ((aByteArrayArrayArray3794[i_111_][i_113_][i_117_ + 1]) & 0x4) && i_117_ - i_116_ < 10); i_117_++) {
								/* empty */
							}
							while_180_: for (/**/; i_114_ > 0 && i_115_ - i_114_ < 10; i_114_--) {
								for (int i_118_ = i_116_; i_118_ <= i_117_; i_118_++) {
									if (((aByteArrayArrayArray3794[i_111_][i_114_ - 1][i_118_]) & 0x4) == 0)
										break while_180_;
								}
							}
							while_181_: for (/**/; (i_115_ < anInt3784 * -1230013231 && i_115_ - i_114_ < 10); i_115_++) {
								for (int i_119_ = i_116_; i_119_ <= i_117_; i_119_++) {
									if (0 == ((aByteArrayArrayArray3794[i_111_][i_115_ + 1][i_119_]) & 0x4))
										break while_181_;
								}
							}
							if ((i_115_ - i_114_ + 1) * (i_117_ - i_116_ + 1) >= 4) {
								int i_120_ = (anIntArrayArrayArray3818[i_111_][i_114_][i_116_]);
								aClass206_3776.aClass201_2600.method3266(4, i_111_, i_114_ << 9, 512 + (i_115_ << 9), i_116_ << 9, 512 + (i_117_ << 9), i_120_, i_120_);
								for (int i_121_ = i_114_; i_121_ <= i_115_; i_121_++) {
									for (int i_122_ = i_116_; i_122_ <= i_117_; i_122_++)
										aByteArrayArrayArray3794[i_111_][i_121_][i_122_] &= ~0x4;
								}
							}
						}
					}
				}
			}
			aClass206_3776.aClass201_2600.method3264();
		}
		aByteArrayArrayArray3794 = null;
	}

	boolean method12464(Class505 class505, int i, int i_123_, boolean bool, Class478 class478, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, boolean bool_132_, Class390 class390, Class336 class336, int i_133_, int i_134_, int i_135_) {
		if (Class458.aClass458_5470.anInt5481 * 1109376893 == i) {
			int i_136_ = class478.anInt5656 * -1316444551;
			if (aBool7714 && -1 == class478.anInt5656 * -1316444551)
				i_136_ = 1;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, bool_132_);
				if (class521_sub1_sub5_sub1.method86(2031686650))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, i_124_);
			aClass206_3776.method3395(i_125_, i_130_, i_131_, class521_sub1_sub5, null, -759421433);
			if (i_123_ == 0) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_130_, i_131_, 50);
					class390.LA(i_130_, i_131_ + 1, 50);
				}
				if (1 == i_136_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(1, i_125_, i_130_, i_131_, 523762221 * class478.anInt5684, -619884509 * class478.anInt5658);
			} else if (i_123_ == 1) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_130_, 1 + i_131_, 50);
					class390.LA(i_130_ + 1, 1 + i_131_, 50);
				}
				if (1 == i_136_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(2, i_125_, i_130_, i_131_ + 1, 523762221 * class478.anInt5684, -(-619884509 * class478.anInt5658));
			} else if (2 == i_123_) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(1 + i_130_, i_131_, 50);
					class390.LA(i_130_ + 1, 1 + i_131_, 50);
				}
				if (i_136_ == 1 && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(1, i_125_, i_130_ + 1, i_131_, 523762221 * class478.anInt5684, -(-619884509 * class478.anInt5658));
			} else if (3 == i_123_) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_130_, i_131_, 50);
					class390.LA(i_130_ + 1, i_131_, 50);
				}
				if (1 == i_136_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(2, i_125_, i_130_, i_131_, 523762221 * class478.anInt5684, class478.anInt5658 * -619884509);
			}
			if (class478.anInt5677 * 647396503 != 0 && null != class336)
				class336.method5971(i_130_, i_131_, i, i_123_, class478.aBool5664, !class478.aBool5686, 2114995928);
			if (class478.anInt5661 * -1085975425 != 64)
				aClass206_3776.method3398(i_125_, i_130_, i_131_, class478.anInt5661 * -1085975425, (byte) 45);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5493.anInt5481) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, bool_132_);
				if (class521_sub1_sub5_sub1.method86(186811932))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, i_124_);
			aClass206_3776.method3395(i_125_, i_130_, i_131_, class521_sub1_sub5, null, -68723515);
			if (class478.aBool5657 && aBool3773) {
				if (0 == i_123_)
					class390.LA(i_130_, i_131_ + 1, 50);
				else if (1 == i_123_)
					class390.LA(i_130_ + 1, 1 + i_131_, 50);
				else if (i_123_ == 2)
					class390.LA(1 + i_130_, i_131_, 50);
				else if (3 == i_123_)
					class390.LA(i_130_, i_131_, 50);
			}
			if (0 != 647396503 * class478.anInt5677 && class336 != null)
				class336.method5971(i_130_, i_131_, i, i_123_, class478.aBool5664, !class478.aBool5686, 2114995928);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5472.anInt5481) {
			int i_137_ = i_123_ + 1 & 0x3;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			Class521_Sub1_Sub5 class521_sub1_sub5_138_;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, 4 + i_123_, bool_132_);
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_139_ = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_137_, bool_132_);
				if (class521_sub1_sub5_sub1.method86(1640390953))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				if (class521_sub1_sub5_sub1_139_.method86(119698496))
					class521_sub1_sub5_sub1_139_.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
				class521_sub1_sub5_138_ = class521_sub1_sub5_sub1_139_;
			} else {
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, 4 + i_123_, i_124_);
				class521_sub1_sub5_138_ = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_137_, i_124_);
			}
			aClass206_3776.method3395(i_125_, i_130_, i_131_, class521_sub1_sub5, class521_sub1_sub5_138_, -1866295330);
			if ((1 == -1316444551 * class478.anInt5656 || aBool7714 && -1316444551 * class478.anInt5656 == -1) && !aBool3786) {
				if (i_123_ == 0) {
					aClass206_3776.aClass201_2600.method3262(1, i_125_, i_130_, i_131_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
					aClass206_3776.aClass201_2600.method3262(2, i_125_, i_130_, 1 + i_131_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
				} else if (1 == i_123_) {
					aClass206_3776.aClass201_2600.method3262(1, i_125_, i_130_ + 1, i_131_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
					aClass206_3776.aClass201_2600.method3262(2, i_125_, i_130_, 1 + i_131_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
				} else if (2 == i_123_) {
					aClass206_3776.aClass201_2600.method3262(1, i_125_, i_130_ + 1, i_131_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
					aClass206_3776.aClass201_2600.method3262(2, i_125_, i_130_, i_131_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
				} else if (3 == i_123_) {
					aClass206_3776.aClass201_2600.method3262(1, i_125_, i_130_, i_131_, 523762221 * class478.anInt5684, class478.anInt5658 * -619884509);
					aClass206_3776.aClass201_2600.method3262(2, i_125_, i_130_, i_131_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
				}
			}
			if (class478.anInt5677 * 647396503 != 0 && class336 != null)
				class336.method5971(i_130_, i_131_, i, i_123_, class478.aBool5664, !class478.aBool5686, 2114995928);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_125_, i_130_, i_131_, class478.anInt5661 * -1085975425, (byte) 58);
			return true;
		}
		if (Class458.aClass458_5473.anInt5481 * 1109376893 == i) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, bool_132_);
				if (class521_sub1_sub5_sub1.method86(88380172))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, i_124_);
			aClass206_3776.method3395(i_125_, i_130_, i_131_, class521_sub1_sub5, null, -340500627);
			if (class478.aBool5657 && aBool3773) {
				if (i_123_ == 0)
					class390.LA(i_130_, 1 + i_131_, 50);
				else if (i_123_ == 1)
					class390.LA(i_130_ + 1, i_131_ + 1, 50);
				else if (i_123_ == 2)
					class390.LA(1 + i_130_, i_131_, 50);
				else if (i_123_ == 3)
					class390.LA(i_130_, i_131_, 50);
			}
			if (0 != class478.anInt5677 * 647396503 && class336 != null)
				class336.method5971(i_130_, i_131_, i, i_123_, class478.aBool5664, !class478.aBool5686, 2114995928);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5474.anInt5481) {
			Class521_Sub1_Sub1 class521_sub1_sub1;
			if (bool) {
				Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i_130_, i_130_, i_131_, i_131_, i, i_123_, bool_132_);
				if (class521_sub1_sub1_sub6.method86(336072278))
					class521_sub1_sub1_sub6.method87(class505, -101230669);
				class521_sub1_sub1 = class521_sub1_sub1_sub6;
			} else
				class521_sub1_sub1 = new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i_130_, i_130_ + i_133_ - 1, i_131_, i_131_ + i_134_ - 1, i, i_123_, i_124_);
			aClass206_3776.method3397(class521_sub1_sub1, false, 1635515614);
			if (1 == -1316444551 * class478.anInt5656 && !aBool3786) {
				int i_140_;
				if (0 == (i_123_ & 0x1))
					i_140_ = 8;
				else
					i_140_ = 16;
				aClass206_3776.aClass201_2600.method3262(i_140_, i_125_, i_130_, i_131_, 523762221 * class478.anInt5684, 0);
			}
			if (647396503 * class478.anInt5677 != 0 && class336 != null)
				class336.method5967(i_130_, i_131_, i_133_, i_134_, class478.aBool5664, !class478.aBool5686, (byte) -60);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_125_, i_130_, i_131_, -1085975425 * class478.anInt5661, (byte) 81);
			return true;
		}
		return false;
	}

	boolean method12465(Class505 class505, int i, int i_141_, boolean bool, Class478 class478, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_) {
		if (1109376893 * Class458.aClass458_5475.anInt5481 == i) {
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, i_141_);
				if (class521_sub1_sub4_sub1.method86(240231077))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, i_141_, i_142_);
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (Class458.aClass458_5476.anInt5481 * 1109376893 == i) {
			int i_151_ = 65;
			Interface12 interface12 = (Interface12) aClass206_3776.method3381(i_143_, i_148_, i_149_, (byte) -117);
			if (null != interface12)
				i_151_ = ((((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(897339826), 65280).anInt5661) * -1085975425) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, anIntArray7724[i_141_] * i_151_, anIntArray7720[i_141_] * i_151_, i, i_141_));
				if (class521_sub1_sub4_sub1.method86(-1255760625))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = (new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, i_151_ * anIntArray7724[i_141_], i_151_ * anIntArray7720[i_141_], i, i_141_, i_142_));
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (1109376893 * Class458.aClass458_5477.anInt5481 == i) {
			int i_152_ = 33;
			Interface12 interface12 = (Interface12) aClass206_3776.method3381(i_143_, i_148_, i_149_, (byte) -91);
			if (null != interface12)
				i_152_ = ((((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-33334546), 65280).anInt5661) * -1085975425 / 2) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, i_152_ * anIntArray7724[i_141_], anIntArray7720[i_141_] * i_152_, i, 4 + i_141_));
				if (class521_sub1_sub4_sub1.method86(-716487834))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = (new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, anIntArray7721[i_141_] * i_152_, anIntArray7713[i_141_] * i_152_, i, 4 + i_141_, i_142_));
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (1109376893 * Class458.aClass458_5478.anInt5481 == i) {
			int i_153_ = i_141_ + 2 & 0x3;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, 4 + i_153_);
				if (class521_sub1_sub4_sub1.method86(1853694415))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, 4 + i_153_, i_142_);
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (Class458.aClass458_5479.anInt5481 * 1109376893 == i) {
			int i_154_ = i_141_ + 2 & 0x3;
			int i_155_ = 33;
			Interface12 interface12 = (Interface12) aClass206_3776.method3381(i_143_, i_148_, i_149_, (byte) -3);
			if (null != interface12)
				i_155_ = ((((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-824380403), 65280).anInt5661) * -1085975425 / 2) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			Class521_Sub1_Sub4 class521_sub1_sub4_156_;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, i_155_ * anIntArray7721[i_141_], i_155_ * anIntArray7713[i_141_], i, i_141_ + 4));
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_157_ = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, 4 + i_154_);
				if (class521_sub1_sub4_sub1.method86(907345148))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				if (class521_sub1_sub4_sub1_157_.method86(1796803842))
					class521_sub1_sub4_sub1_157_.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
				class521_sub1_sub4_156_ = class521_sub1_sub4_sub1_157_;
			} else {
				Class521_Sub1_Sub4_Sub2 class521_sub1_sub4_sub2 = (new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, i_155_ * anIntArray7721[i_141_], i_155_ * anIntArray7713[i_141_], i, i_141_ + 4, i_142_));
				Class521_Sub1_Sub4_Sub2 class521_sub1_sub4_sub2_158_ = new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, 4 + i_154_, i_142_);
				class521_sub1_sub4 = class521_sub1_sub4_sub2;
				class521_sub1_sub4_156_ = class521_sub1_sub4_sub2_158_;
			}
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, class521_sub1_sub4_156_, (byte) 13);
			return true;
		}
		return false;
	}

	boolean method12466(Class505 class505, int i, int i_159_, boolean bool, Class478 class478, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, boolean bool_168_, Class390 class390, Class336 class336, int i_169_, int i_170_) {
		if (Class458.aClass458_5470.anInt5481 * 1109376893 == i) {
			int i_171_ = class478.anInt5656 * -1316444551;
			if (aBool7714 && -1 == class478.anInt5656 * -1316444551)
				i_171_ = 1;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, i_159_, bool_168_);
				if (class521_sub1_sub5_sub1.method86(-485508747))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, i_159_, i_160_);
			aClass206_3776.method3395(i_161_, i_166_, i_167_, class521_sub1_sub5, null, -1301918272);
			if (i_159_ == 0) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_166_, i_167_, 50);
					class390.LA(i_166_, i_167_ + 1, 50);
				}
				if (1 == i_171_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(1, i_161_, i_166_, i_167_, 523762221 * class478.anInt5684, -619884509 * class478.anInt5658);
			} else if (i_159_ == 1) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_166_, 1 + i_167_, 50);
					class390.LA(i_166_ + 1, 1 + i_167_, 50);
				}
				if (1 == i_171_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(2, i_161_, i_166_, i_167_ + 1, 523762221 * class478.anInt5684, -(-619884509 * class478.anInt5658));
			} else if (2 == i_159_) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(1 + i_166_, i_167_, 50);
					class390.LA(i_166_ + 1, 1 + i_167_, 50);
				}
				if (i_171_ == 1 && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(1, i_161_, i_166_ + 1, i_167_, 523762221 * class478.anInt5684, -(-619884509 * class478.anInt5658));
			} else if (3 == i_159_) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_166_, i_167_, 50);
					class390.LA(i_166_ + 1, i_167_, 50);
				}
				if (1 == i_171_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(2, i_161_, i_166_, i_167_, 523762221 * class478.anInt5684, class478.anInt5658 * -619884509);
			}
			if (class478.anInt5677 * 647396503 != 0 && null != class336)
				class336.method5971(i_166_, i_167_, i, i_159_, class478.aBool5664, !class478.aBool5686, 2114995928);
			if (class478.anInt5661 * -1085975425 != 64)
				aClass206_3776.method3398(i_161_, i_166_, i_167_, class478.anInt5661 * -1085975425, (byte) 16);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5493.anInt5481) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, i_159_, bool_168_);
				if (class521_sub1_sub5_sub1.method86(-1013262779))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, i_159_, i_160_);
			aClass206_3776.method3395(i_161_, i_166_, i_167_, class521_sub1_sub5, null, -471027517);
			if (class478.aBool5657 && aBool3773) {
				if (0 == i_159_)
					class390.LA(i_166_, i_167_ + 1, 50);
				else if (1 == i_159_)
					class390.LA(i_166_ + 1, 1 + i_167_, 50);
				else if (i_159_ == 2)
					class390.LA(1 + i_166_, i_167_, 50);
				else if (3 == i_159_)
					class390.LA(i_166_, i_167_, 50);
			}
			if (0 != 647396503 * class478.anInt5677 && class336 != null)
				class336.method5971(i_166_, i_167_, i, i_159_, class478.aBool5664, !class478.aBool5686, 2114995928);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5472.anInt5481) {
			int i_172_ = i_159_ + 1 & 0x3;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			Class521_Sub1_Sub5 class521_sub1_sub5_173_;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, 4 + i_159_, bool_168_);
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_174_ = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, i_172_, bool_168_);
				if (class521_sub1_sub5_sub1.method86(974858262))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				if (class521_sub1_sub5_sub1_174_.method86(-455398270))
					class521_sub1_sub5_sub1_174_.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
				class521_sub1_sub5_173_ = class521_sub1_sub5_sub1_174_;
			} else {
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, 4 + i_159_, i_160_);
				class521_sub1_sub5_173_ = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, i_172_, i_160_);
			}
			aClass206_3776.method3395(i_161_, i_166_, i_167_, class521_sub1_sub5, class521_sub1_sub5_173_, -1845541665);
			if ((1 == -1316444551 * class478.anInt5656 || aBool7714 && -1316444551 * class478.anInt5656 == -1) && !aBool3786) {
				if (i_159_ == 0) {
					aClass206_3776.aClass201_2600.method3262(1, i_161_, i_166_, i_167_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
					aClass206_3776.aClass201_2600.method3262(2, i_161_, i_166_, 1 + i_167_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
				} else if (1 == i_159_) {
					aClass206_3776.aClass201_2600.method3262(1, i_161_, i_166_ + 1, i_167_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
					aClass206_3776.aClass201_2600.method3262(2, i_161_, i_166_, 1 + i_167_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
				} else if (2 == i_159_) {
					aClass206_3776.aClass201_2600.method3262(1, i_161_, i_166_ + 1, i_167_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
					aClass206_3776.aClass201_2600.method3262(2, i_161_, i_166_, i_167_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
				} else if (3 == i_159_) {
					aClass206_3776.aClass201_2600.method3262(1, i_161_, i_166_, i_167_, 523762221 * class478.anInt5684, class478.anInt5658 * -619884509);
					aClass206_3776.aClass201_2600.method3262(2, i_161_, i_166_, i_167_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
				}
			}
			if (class478.anInt5677 * 647396503 != 0 && class336 != null)
				class336.method5971(i_166_, i_167_, i, i_159_, class478.aBool5664, !class478.aBool5686, 2114995928);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_161_, i_166_, i_167_, class478.anInt5661 * -1085975425, (byte) 16);
			return true;
		}
		if (Class458.aClass458_5473.anInt5481 * 1109376893 == i) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, i_159_, bool_168_);
				if (class521_sub1_sub5_sub1.method86(368396063))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i, i_159_, i_160_);
			aClass206_3776.method3395(i_161_, i_166_, i_167_, class521_sub1_sub5, null, -27200040);
			if (class478.aBool5657 && aBool3773) {
				if (i_159_ == 0)
					class390.LA(i_166_, 1 + i_167_, 50);
				else if (i_159_ == 1)
					class390.LA(i_166_ + 1, i_167_ + 1, 50);
				else if (i_159_ == 2)
					class390.LA(1 + i_166_, i_167_, 50);
				else if (i_159_ == 3)
					class390.LA(i_166_, i_167_, 50);
			}
			if (0 != class478.anInt5677 * 647396503 && class336 != null)
				class336.method5971(i_166_, i_167_, i, i_159_, class478.aBool5664, !class478.aBool5686, 2114995928);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5474.anInt5481) {
			Class521_Sub1_Sub1 class521_sub1_sub1;
			if (bool) {
				Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i_166_, i_166_, i_167_, i_167_, i, i_159_, bool_168_);
				if (class521_sub1_sub1_sub6.method86(288540525))
					class521_sub1_sub1_sub6.method87(class505, -101230669);
				class521_sub1_sub1 = class521_sub1_sub1_sub6;
			} else
				class521_sub1_sub1 = new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_161_, i_162_, i_163_, i_164_, i_165_, aBool3786, i_166_, i_166_ + i_169_ - 1, i_167_, i_167_ + i_170_ - 1, i, i_159_, i_160_);
			aClass206_3776.method3397(class521_sub1_sub1, false, 361119186);
			if (1 == -1316444551 * class478.anInt5656 && !aBool3786) {
				int i_175_;
				if (0 == (i_159_ & 0x1))
					i_175_ = 8;
				else
					i_175_ = 16;
				aClass206_3776.aClass201_2600.method3262(i_175_, i_161_, i_166_, i_167_, 523762221 * class478.anInt5684, 0);
			}
			if (647396503 * class478.anInt5677 != 0 && class336 != null)
				class336.method5967(i_166_, i_167_, i_169_, i_170_, class478.aBool5664, !class478.aBool5686, (byte) -94);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_161_, i_166_, i_167_, -1085975425 * class478.anInt5661, (byte) 84);
			return true;
		}
		return false;
	}

	Interface12 method12467(int i, int i_176_, int i_177_, int i_178_, int i_179_) {
		Interface12 interface12 = null;
		if (i_176_ == 0)
			interface12 = (Interface12) aClass206_3776.method3381(i, i_177_, i_178_, (byte) -111);
		if (1 == i_176_)
			interface12 = (Interface12) aClass206_3776.method3511(i, i_177_, i_178_, (byte) -56);
		if (2 == i_176_)
			interface12 = ((Interface12) aClass206_3776.method3413(i, i_177_, i_178_, client.anInterface25_7446, -233664382));
		if (3 == i_176_)
			interface12 = (Interface12) aClass206_3776.method3415(i, i_177_, i_178_, -387297653);
		return interface12;
	}

	public final void method12468(Class505 class505, RsByteBuffer class282_sub35, int i, int i_180_) {
		if (!aBool3786) {
			boolean bool = false;
			Class535 class535 = null;
			while (-1990677291 * class282_sub35.index < class282_sub35.buffer.length) {
				int i_181_ = class282_sub35.readUnsignedByte();
				if (i_181_ == 0) {
					if (class535 == null)
						class535 = new Class535(class282_sub35, (((Class329_Sub1) this).aClass239_7719));
					else
						class535.method11468(class282_sub35, (((Class329_Sub1) this).aClass239_7719), -1622761000);
				} else if (i_181_ == 1) {
					int i_182_ = class282_sub35.readUnsignedByte();
					if (i_182_ > 0) {
						for (int i_183_ = 0; i_183_ < i_182_; i_183_++) {
							Class287 class287 = new Class287(class505, (aClass206_3776.anInt2592 * -1928575293), class282_sub35, 2);
							if (class287.anInt3430 * 1711091569 == 31) {
								Class416 class416 = (Class282_Sub23.aClass436_7683.method7304(class282_sub35.readUnsignedShort(), (byte) -89));
								class287.method5061(633357 * class416.anInt4986, class416.anInt4989 * -1719615659, 976456007 * class416.anInt4988, 475908455 * class416.anInt4987, (byte) -1);
							}
							if (class505.method8463() > 0) {
								Class282_Sub24 class282_sub24 = class287.aClass282_Sub24_3425;
								int i_184_ = (class282_sub24.method12368((byte) -120) + (i << 9));
								int i_185_ = (class282_sub24.method12394(1999301795) + (i_180_ << 9));
								int i_186_ = i_184_ >> 9;
								int i_187_ = i_185_ >> 9;
								if (i_186_ >= 0 && i_187_ >= 0 && i_186_ < -1230013231 * anInt3784 && i_187_ < 2024737111 * anInt3785) {
									class282_sub24.method12374(i_184_, ((anIntArrayArrayArray3818[class287.anInt3419 * -2046020753][i_186_][i_187_]) - class282_sub24.method12369(1534020223)), i_185_, 1544557759);
									aClass206_3776.method3430(class287, (byte) 1);
								}
							}
						}
					}
				} else if (2 == i_181_) {
					if (class535 == null)
						class535 = new Class535();
					class535.method11471(class282_sub35, (byte) -44);
				} else if (128 == i_181_) {
					if (null == class535)
						class535 = new Class535();
					class535.method11472(class282_sub35, ((Class329_Sub1) this).aClass239_7719, -1865936153);
				} else if (i_181_ == 129) {
					if (aByteArrayArrayArray3788 == null)
						aByteArrayArrayArray3788 = new byte[4][][];
					for (int i_188_ = 0; i_188_ < 4; i_188_++) {
						byte i_189_ = class282_sub35.readByte((short) -5725);
						if (0 == i_189_ && null != aByteArrayArrayArray3788[i_188_]) {
							int i_190_ = i;
							int i_191_ = i + 64;
							int i_192_ = i_180_;
							int i_193_ = i_180_ + 64;
							if (i_190_ < 0)
								i_190_ = 0;
							else if (i_190_ >= anInt3784 * -1230013231)
								i_190_ = anInt3784 * -1230013231;
							if (i_191_ < 0)
								i_191_ = 0;
							else if (i_191_ >= anInt3784 * -1230013231)
								i_191_ = -1230013231 * anInt3784;
							if (i_192_ < 0)
								i_192_ = 0;
							else if (i_192_ >= 2024737111 * anInt3785)
								i_192_ = 2024737111 * anInt3785;
							if (i_193_ < 0)
								i_193_ = 0;
							else if (i_193_ >= anInt3785 * 2024737111)
								i_193_ = 2024737111 * anInt3785;
							for (/**/; i_190_ < i_191_; i_190_++) {
								for (/**/; i_192_ < i_193_; i_192_++)
									aByteArrayArrayArray3788[i_188_][i_190_][i_192_] = (byte) 0;
							}
						} else if (i_189_ == 1) {
							if (null == aByteArrayArrayArray3788[i_188_])
								aByteArrayArrayArray3788[i_188_] = (new byte[-1230013231 * anInt3784 + 1][2024737111 * anInt3785 + 1]);
							for (int i_194_ = 0; i_194_ < 64; i_194_ += 4) {
								for (int i_195_ = 0; i_195_ < 64; i_195_ += 4) {
									byte i_196_ = class282_sub35.readByte((short) -24994);
									for (int i_197_ = i_194_ + i; i_197_ < 4 + (i + i_194_); i_197_++) {
										for (int i_198_ = i_180_ + i_195_; i_198_ < 4 + (i_180_ + i_195_); i_198_++) {
											if (i_197_ >= 0 && (i_197_ < anInt3784 * -1230013231) && i_198_ >= 0 && (i_198_ < anInt3785 * 2024737111))
												aByteArrayArrayArray3788[i_188_][i_197_][i_198_] = i_196_;
										}
									}
								}
							}
						} else if (2 == i_189_) {
							if (aByteArrayArrayArray3788[i_188_] == null)
								aByteArrayArrayArray3788[i_188_] = (new byte[1 + anInt3784 * -1230013231][2024737111 * anInt3785 + 1]);
							if (i_188_ > 0) {
								int i_199_ = i;
								int i_200_ = 64 + i;
								int i_201_ = i_180_;
								int i_202_ = i_180_ + 64;
								if (i_199_ < 0)
									i_199_ = 0;
								else if (i_199_ >= anInt3784 * -1230013231)
									i_199_ = -1230013231 * anInt3784;
								if (i_200_ < 0)
									i_200_ = 0;
								else if (i_200_ >= anInt3784 * -1230013231)
									i_200_ = -1230013231 * anInt3784;
								if (i_201_ < 0)
									i_201_ = 0;
								else if (i_201_ >= anInt3785 * 2024737111)
									i_201_ = 2024737111 * anInt3785;
								if (i_202_ < 0)
									i_202_ = 0;
								else if (i_202_ >= 2024737111 * anInt3785)
									i_202_ = 2024737111 * anInt3785;
								for (/**/; i_199_ < i_200_; i_199_++) {
									for (/**/; i_201_ < i_202_; i_201_++)
										aByteArrayArrayArray3788[i_188_][i_199_][i_201_] = (aByteArrayArrayArray3788[i_188_ - 1][i_199_][i_201_]);
								}
							}
						}
					}
					bool = true;
				} else
					throw new IllegalStateException("");
			}
			if (class535 != null) {
				for (int i_203_ = 0; i_203_ < 8; i_203_++) {
					for (int i_204_ = 0; i_204_ < 8; i_204_++) {
						int i_205_ = i_203_ + (i >> 3);
						int i_206_ = i_204_ + (i_180_ >> 3);
						if (i_205_ >= 0 && i_205_ < -1230013231 * anInt3784 >> 3 && i_206_ >= 0 && i_206_ < 2024737111 * anInt3785 >> 3)
							((Class329_Sub1) this).aClass239_7719.method4056(i_205_, i_206_, class535, (byte) 20);
					}
				}
			}
			if (!bool && aByteArrayArrayArray3788 != null) {
				for (int i_207_ = 0; i_207_ < 4; i_207_++) {
					if (aByteArrayArrayArray3788[i_207_] != null) {
						for (int i_208_ = 0; i_208_ < 16; i_208_++) {
							for (int i_209_ = 0; i_209_ < 16; i_209_++) {
								int i_210_ = i_208_ + (i >> 2);
								int i_211_ = i_209_ + (i_180_ >> 2);
								if (i_210_ >= 0 && i_210_ < 26 && i_211_ >= 0 && i_211_ < 26)
									aByteArrayArrayArray3788[i_207_][i_210_][i_211_] = (byte) 0;
							}
						}
					}
				}
			}
		}
	}

	static {
		aBool7714 = false;
		anIntArray7724 = new int[] { 1, 0, -1, 0 };
		anIntArray7720 = new int[] { 0, -1, 0, 1 };
		anIntArray7721 = new int[] { 1, -1, -1, 1 };
		anIntArray7713 = new int[] { -1, -1, 1, 1 };
	}

	void method12469(Class505 class505, int i, int i_212_, int i_213_, int i_214_, Class336 class336) {
		Interface12 interface12 = method12467(i, i_212_, i_213_, i_214_, 1070777471);
		if (interface12 != null) {
			Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-1456391368), 65280);
			int i_215_ = interface12.method89(1195097723);
			int i_216_ = interface12.method92(-908993374);
			if (class478.method7974(36059504))
				Class256.method4415(i, i_213_, i_214_, class478, 866747575);
			if (interface12.method86(-616939040))
				interface12.method88(class505, 781805284);
			if (0 == i_212_) {
				aClass206_3776.method3422(i, i_213_, i_214_, (short) 255);
				aClass206_3776.method3460(i, i_213_, i_214_, (byte) 121);
				if (647396503 * class478.anInt5677 != 0)
					class336.method5992(i_213_, i_214_, i_215_, i_216_, class478.aBool5664, !class478.aBool5686, (byte) 28);
				if (class478.anInt5656 * -1316444551 == 1) {
					if (0 == i_216_)
						aClass206_3776.aClass201_2600.method3297(1, i, i_213_, i_214_);
					else if (1 == i_216_)
						aClass206_3776.aClass201_2600.method3297(2, i, i_213_, 1 + i_214_);
					else if (i_216_ == 2)
						aClass206_3776.aClass201_2600.method3297(1, i, 1 + i_213_, i_214_);
					else if (3 == i_216_)
						aClass206_3776.aClass201_2600.method3297(2, i, i_213_, i_214_);
				}
			} else if (1 == i_212_) {
				aClass206_3776.method3402(i, i_213_, i_214_, (byte) 22);
				aClass206_3776.method3439(i, i_213_, i_214_, -197234043);
			} else if (2 == i_212_) {
				aClass206_3776.method3530(i, i_213_, i_214_, client.anInterface25_7446, 709671625);
				if (0 != 647396503 * class478.anInt5677 && (-752356381 * class478.anInt5648 + i_213_ < -1230013231 * anInt3784) && (i_214_ + class478.anInt5648 * -752356381 < 2024737111 * anInt3785) && (i_213_ + -1610844647 * class478.anInt5649 < anInt3784 * -1230013231) && (i_214_ + class478.anInt5649 * -1610844647 < anInt3785 * 2024737111))
					class336.method5970(i_213_, i_214_, -752356381 * class478.anInt5648, -1610844647 * class478.anInt5649, i_216_, class478.aBool5664, !class478.aBool5686, 196187629);
				if (i_215_ == Class458.aClass458_5474.anInt5481 * 1109376893) {
					if (0 == (i_216_ & 0x1))
						aClass206_3776.aClass201_2600.method3297(8, i, i_213_, i_214_);
					else
						aClass206_3776.aClass201_2600.method3297(16, i, i_213_, i_214_);
				}
			} else if (i_212_ == 3) {
				aClass206_3776.method3404(i, i_213_, i_214_, -1289153889);
				if (647396503 * class478.anInt5677 == 1)
					class336.method5991(i_213_, i_214_, (byte) 0);
			}
		}
	}

	final void method12470(Class505 class505, int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_, Class336 class336, int i_223_) {
		if (i_217_ < -1623875645 * ((Class329_Sub1) this).anInt7723)
			((Class329_Sub1) this).anInt7723 = 231917803 * i_217_;
		Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(i_220_, 65280);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1742731311) != 0 || !class478.aBool5701) {
			int i_224_;
			int i_225_;
			if (i_221_ == 1 || 3 == i_221_) {
				i_224_ = -1610844647 * class478.anInt5649;
				i_225_ = class478.anInt5648 * -752356381;
			} else {
				i_224_ = class478.anInt5648 * -752356381;
				i_225_ = class478.anInt5649 * -1610844647;
			}
			int i_226_;
			int i_227_;
			if (i_224_ + i_218_ <= -1230013231 * anInt3784) {
				i_226_ = (i_224_ >> 1) + i_218_;
				i_227_ = (1 + i_224_ >> 1) + i_218_;
			} else {
				i_226_ = i_218_;
				i_227_ = 1 + i_218_;
			}
			int i_228_;
			int i_229_;
			if (i_225_ + i_219_ <= anInt3785 * 2024737111) {
				i_228_ = (i_225_ >> 1) + i_219_;
				i_229_ = (1 + i_225_ >> 1) + i_219_;
			} else {
				i_228_ = i_219_;
				i_229_ = 1 + i_219_;
			}
			Class390 class390 = aClass206_3776.aClass390Array2591[i];
			int i_230_ = ((class390.method6722(i_226_, i_228_, 65280) + class390.method6722(i_227_, i_228_, 65280) + class390.method6722(i_226_, i_229_, 65280) + class390.method6722(i_227_, i_229_, 65280)) >> 2);
			int i_231_ = (i_224_ << 8) + (i_218_ << 9);
			int i_232_ = (i_219_ << 9) + (i_225_ << 8);
			boolean bool = aBool3773 && !aBool3786 && class478.aBool5655;
			if (class478.method7974(1461372602))
				Class397.method6775(i_217_, i_218_, i_219_, i_221_, class478, null, null, 112145290);
			boolean bool_233_ = (i_223_ == -1 && !class478.method7967((byte) 4) && class478.anIntArray5650 == null && !class478.aBool5706 && !class478.aBool5699);
			if (!aBool7717 || ((!Class308.method5473(i_222_, 1698101879) || 1 == -1316444551 * class478.anInt5656) && (!Class240.method4138(i_222_, -2072551876) || class478.anInt5656 * -1316444551 != 0))) {
				if (Class458.aClass458_5480.anInt5481 * 1109376893 == i_222_) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 52) != 0 || class478.anInt5652 * -348507379 != 0 || 1 == class478.anInt5677 * 647396503 || class478.aBool5685) {
						Class521_Sub1_Sub3 class521_sub1_sub3;
						if (bool_233_) {
							Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1 = (new Class521_Sub1_Sub3_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_217_, i, i_231_, i_230_, i_232_, aBool3786, i_221_, bool));
							if (class521_sub1_sub3_sub1.method86(50836932))
								class521_sub1_sub3_sub1.method87(class505, -101230669);
							class521_sub1_sub3 = class521_sub1_sub3_sub1;
						} else
							class521_sub1_sub3 = (new Class521_Sub1_Sub3_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_217_, i, i_231_, i_230_, i_232_, aBool3786, i_221_, i_223_));
						aClass206_3776.method3393(i_217_, i_218_, i_219_, class521_sub1_sub3, -1190124781);
						if (647396503 * class478.anInt5677 == 1 && null != class336)
							class336.method5968(i_218_, i_219_, -1263652605);
					}
				} else if ((i_222_ == 1109376893 * Class458.aClass458_5490.anInt5481) || (Class458.aClass458_5492.anInt5481 * 1109376893 == i_222_)) {
					Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = null;
					Class521_Sub1_Sub1 class521_sub1_sub1;
					int i_234_;
					if (bool_233_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_235_ = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_217_, i, i_231_, i_230_, i_232_, aBool3786, i_218_, i_224_ + i_218_ - 1, i_219_, i_225_ + i_219_ - 1, i_222_, i_221_, bool));
						i_234_ = class521_sub1_sub1_sub6_235_.method16115(623439723);
						class521_sub1_sub1 = class521_sub1_sub1_sub6_235_;
						class521_sub1_sub1_sub6 = class521_sub1_sub1_sub6_235_;
					} else {
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_217_, i, i_231_, i_230_, i_232_, aBool3786, i_218_, i_224_ + i_218_ - 1, i_219_, i_219_ + i_225_ - 1, i_222_, i_221_, i_223_));
						i_234_ = 15;
					}
					if (aClass206_3776.method3397(class521_sub1_sub1, false, 2008688782)) {
						if (class521_sub1_sub1_sub6 != null && class521_sub1_sub1_sub6.method86(-1497365185))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						if (class478.aBool5657 && aBool3773) {
							if (i_234_ > 30)
								i_234_ = 30;
							for (int i_236_ = 0; i_236_ <= i_224_; i_236_++) {
								for (int i_237_ = 0; i_237_ <= i_225_; i_237_++)
									class390.LA(i_218_ + i_236_, i_219_ + i_237_, i_234_);
							}
						}
					}
					if (0 != 647396503 * class478.anInt5677 && class336 != null)
						class336.method5967(i_218_, i_219_, i_224_, i_225_, class478.aBool5664, !class478.aBool5686, (byte) -30);
				} else if (Class240.method4138(i_222_, -435117365) || Class228.method3849(i_222_, -161473702)) {
					Class521_Sub1_Sub1 class521_sub1_sub1;
					if (bool_233_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_217_, i, i_231_, i_230_, i_232_, aBool3786, i_218_, i_224_ + i_218_ - 1, i_219_, i_225_ + i_219_ - 1, i_222_, i_221_, bool));
						if (class521_sub1_sub1_sub6.method86(-1087253252))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						class521_sub1_sub1 = class521_sub1_sub1_sub6;
					} else
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_217_, i, i_231_, i_230_, i_232_, aBool3786, i_218_, i_218_ + i_224_ - 1, i_219_, i_225_ + i_219_ - 1, i_222_, i_221_, i_223_));
					aClass206_3776.method3397(class521_sub1_sub1, false, 1948828326);
					if (aBool3773 && !aBool3786 && Class240.method4138(i_222_, -710046631) && (1109376893 * Class458.aClass458_5491.anInt5481 != i_222_) && i_217_ > 0 && 0 != class478.anInt5656 * -1316444551)
						aByteArrayArrayArray3794[i_217_][i_218_][i_219_] |= 0x4;
					if (647396503 * class478.anInt5677 != 0 && null != class336)
						class336.method5967(i_218_, i_219_, i_224_, i_225_, class478.aBool5664, !class478.aBool5686, (byte) -47);
				} else if (method12464(class505, i_222_, i_221_, bool_233_, class478, i_223_, i_217_, i, i_231_, i_230_, i_232_, i_218_, i_219_, bool, class390, class336, i_224_, i_225_, -1787686494) || method12465(class505, i_222_, i_221_, bool_233_, class478, i_223_, i_217_, i, i_231_, i_230_, i_232_, i_218_, i_219_, 1825194331)) {
					/* empty */
				}
			}
		}
	}

	public final void method12471(Class505 class505, RsByteBuffer class282_sub35, int i, int i_238_, int i_239_) {
		if (!aBool3786) {
			boolean bool = false;
			Class535 class535 = null;
			while (-1990677291 * class282_sub35.index < class282_sub35.buffer.length) {
				int i_240_ = class282_sub35.readUnsignedByte();
				if (i_240_ == 0) {
					if (class535 == null)
						class535 = new Class535(class282_sub35, (((Class329_Sub1) this).aClass239_7719));
					else
						class535.method11468(class282_sub35, (((Class329_Sub1) this).aClass239_7719), 375597297);
				} else if (i_240_ == 1) {
					int i_241_ = class282_sub35.readUnsignedByte();
					if (i_241_ > 0) {
						for (int i_242_ = 0; i_242_ < i_241_; i_242_++) {
							Class287 class287 = new Class287(class505, (aClass206_3776.anInt2592 * -1928575293), class282_sub35, 2);
							if (class287.anInt3430 * 1711091569 == 31) {
								Class416 class416 = (Class282_Sub23.aClass436_7683.method7304(class282_sub35.readUnsignedShort(), (byte) 56));
								class287.method5061(633357 * class416.anInt4986, class416.anInt4989 * -1719615659, 976456007 * class416.anInt4988, 475908455 * class416.anInt4987, (byte) -1);
							}
							if (class505.method8463() > 0) {
								Class282_Sub24 class282_sub24 = class287.aClass282_Sub24_3425;
								int i_243_ = (class282_sub24.method12368((byte) 18) + (i << 9));
								int i_244_ = (class282_sub24.method12394(1333252250) + (i_238_ << 9));
								int i_245_ = i_243_ >> 9;
								int i_246_ = i_244_ >> 9;
								if (i_245_ >= 0 && i_246_ >= 0 && i_245_ < -1230013231 * anInt3784 && i_246_ < 2024737111 * anInt3785) {
									class282_sub24.method12374(i_243_, ((anIntArrayArrayArray3818[class287.anInt3419 * -2046020753][i_245_][i_246_]) - class282_sub24.method12369(1534020223)), i_244_, 2078101485);
									aClass206_3776.method3430(class287, (byte) 1);
								}
							}
						}
					}
				} else if (2 == i_240_) {
					if (class535 == null)
						class535 = new Class535();
					class535.method11471(class282_sub35, (byte) -6);
				} else if (128 == i_240_) {
					if (null == class535)
						class535 = new Class535();
					class535.method11472(class282_sub35, ((Class329_Sub1) this).aClass239_7719, -1865936153);
				} else if (i_240_ == 129) {
					if (aByteArrayArrayArray3788 == null)
						aByteArrayArrayArray3788 = new byte[4][][];
					for (int i_247_ = 0; i_247_ < 4; i_247_++) {
						byte i_248_ = class282_sub35.readByte((short) -14292);
						if (0 == i_248_ && null != aByteArrayArrayArray3788[i_247_]) {
							int i_249_ = i;
							int i_250_ = i + 64;
							int i_251_ = i_238_;
							int i_252_ = i_238_ + 64;
							if (i_249_ < 0)
								i_249_ = 0;
							else if (i_249_ >= anInt3784 * -1230013231)
								i_249_ = anInt3784 * -1230013231;
							if (i_250_ < 0)
								i_250_ = 0;
							else if (i_250_ >= anInt3784 * -1230013231)
								i_250_ = -1230013231 * anInt3784;
							if (i_251_ < 0)
								i_251_ = 0;
							else if (i_251_ >= 2024737111 * anInt3785)
								i_251_ = 2024737111 * anInt3785;
							if (i_252_ < 0)
								i_252_ = 0;
							else if (i_252_ >= anInt3785 * 2024737111)
								i_252_ = 2024737111 * anInt3785;
							for (/**/; i_249_ < i_250_; i_249_++) {
								for (/**/; i_251_ < i_252_; i_251_++)
									aByteArrayArrayArray3788[i_247_][i_249_][i_251_] = (byte) 0;
							}
						} else if (i_248_ == 1) {
							if (null == aByteArrayArrayArray3788[i_247_])
								aByteArrayArrayArray3788[i_247_] = (new byte[-1230013231 * anInt3784 + 1][2024737111 * anInt3785 + 1]);
							for (int i_253_ = 0; i_253_ < 64; i_253_ += 4) {
								for (int i_254_ = 0; i_254_ < 64; i_254_ += 4) {
									byte i_255_ = class282_sub35.readByte((short) -14483);
									for (int i_256_ = i_253_ + i; i_256_ < 4 + (i + i_253_); i_256_++) {
										for (int i_257_ = i_238_ + i_254_; i_257_ < 4 + (i_238_ + i_254_); i_257_++) {
											if (i_256_ >= 0 && (i_256_ < anInt3784 * -1230013231) && i_257_ >= 0 && (i_257_ < anInt3785 * 2024737111))
												aByteArrayArrayArray3788[i_247_][i_256_][i_257_] = i_255_;
										}
									}
								}
							}
						} else if (2 == i_248_) {
							if (aByteArrayArrayArray3788[i_247_] == null)
								aByteArrayArrayArray3788[i_247_] = (new byte[1 + anInt3784 * -1230013231][2024737111 * anInt3785 + 1]);
							if (i_247_ > 0) {
								int i_258_ = i;
								int i_259_ = 64 + i;
								int i_260_ = i_238_;
								int i_261_ = i_238_ + 64;
								if (i_258_ < 0)
									i_258_ = 0;
								else if (i_258_ >= anInt3784 * -1230013231)
									i_258_ = -1230013231 * anInt3784;
								if (i_259_ < 0)
									i_259_ = 0;
								else if (i_259_ >= anInt3784 * -1230013231)
									i_259_ = -1230013231 * anInt3784;
								if (i_260_ < 0)
									i_260_ = 0;
								else if (i_260_ >= anInt3785 * 2024737111)
									i_260_ = 2024737111 * anInt3785;
								if (i_261_ < 0)
									i_261_ = 0;
								else if (i_261_ >= 2024737111 * anInt3785)
									i_261_ = 2024737111 * anInt3785;
								for (/**/; i_258_ < i_259_; i_258_++) {
									for (/**/; i_260_ < i_261_; i_260_++)
										aByteArrayArrayArray3788[i_247_][i_258_][i_260_] = (aByteArrayArrayArray3788[i_247_ - 1][i_258_][i_260_]);
								}
							}
						}
					}
					bool = true;
				} else
					throw new IllegalStateException("");
			}
			if (class535 != null) {
				for (int i_262_ = 0; i_262_ < 8; i_262_++) {
					for (int i_263_ = 0; i_263_ < 8; i_263_++) {
						int i_264_ = i_262_ + (i >> 3);
						int i_265_ = i_263_ + (i_238_ >> 3);
						if (i_264_ >= 0 && i_264_ < -1230013231 * anInt3784 >> 3 && i_265_ >= 0 && i_265_ < 2024737111 * anInt3785 >> 3)
							((Class329_Sub1) this).aClass239_7719.method4056(i_264_, i_265_, class535, (byte) 27);
					}
				}
			}
			if (!bool && aByteArrayArrayArray3788 != null) {
				for (int i_266_ = 0; i_266_ < 4; i_266_++) {
					if (aByteArrayArrayArray3788[i_266_] != null) {
						for (int i_267_ = 0; i_267_ < 16; i_267_++) {
							for (int i_268_ = 0; i_268_ < 16; i_268_++) {
								int i_269_ = i_267_ + (i >> 2);
								int i_270_ = i_268_ + (i_238_ >> 2);
								if (i_269_ >= 0 && i_269_ < 26 && i_270_ >= 0 && i_270_ < 26)
									aByteArrayArrayArray3788[i_266_][i_269_][i_270_] = (byte) 0;
							}
						}
					}
				}
			}
		}
	}

	static final boolean method12472(Class474 class474, int i, int i_271_) {
		Class478 class478 = class474.method7891(i, 65280);
		if (i_271_ == 11)
			i_271_ = 10;
		if (i_271_ >= 5 && i_271_ <= 8)
			i_271_ = 4;
		return class478.method7987(i_271_, -216007432);
	}

	static final boolean method12473(Class474 class474, int i, int i_272_) {
		Class478 class478 = class474.method7891(i, 65280);
		if (i_272_ == 11)
			i_272_ = 10;
		if (i_272_ >= 5 && i_272_ <= 8)
			i_272_ = 4;
		return class478.method7987(i_272_, 1130932863);
	}

	public final void method12474(Class505 class505, byte[] is, int i, int i_273_, Class336[] class336s) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i_274_ = -1;
		for (;;) {
			int i_275_ = class282_sub35.readSmart2(1544100964);
			if (0 == i_275_)
				break;
			i_274_ += i_275_;
			int i_276_ = 0;
			for (;;) {
				int i_277_ = class282_sub35.readUnsignedSmart(1787027127);
				if (0 == i_277_)
					break;
				i_276_ += i_277_ - 1;
				int i_278_ = i_276_ & 0x3f;
				int i_279_ = i_276_ >> 6 & 0x3f;
				int i_280_ = i_276_ >> 12;
				int i_281_ = class282_sub35.readUnsignedByte();
				int i_282_ = i_281_ >> 2;
				int i_283_ = i_281_ & 0x3;
				int i_284_ = i + i_279_;
				int i_285_ = i_278_ + i_273_;
				if (i_284_ > 0 && i_285_ > 0 && i_284_ < anInt3784 * -1230013231 - 1 && i_285_ < 2024737111 * anInt3785 - 1) {
					Class336 class336 = null;
					if (!aBool3786) {
						int i_286_ = i_280_;
						if (((aClass311_3787.aByteArrayArrayArray3638[1][i_284_][i_285_]) & 0x2) == 2)
							i_286_--;
						if (i_286_ >= 0)
							class336 = class336s[i_286_];
					}
					method12459(class505, i_280_, i_280_, i_284_, i_285_, i_274_, i_283_, i_282_, class336, -1, 233876057);
				}
			}
		}
	}

	void method12475(Class505 class505, int i, int i_287_, int i_288_, int i_289_, Class336 class336, int i_290_) {
		Interface12 interface12 = method12467(i, i_287_, i_288_, i_289_, 1923565825);
		if (interface12 != null) {
			Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-289246828), 65280);
			int i_291_ = interface12.method89(1128699312);
			int i_292_ = interface12.method92(-2000294676);
			if (class478.method7974(1930590252))
				Class256.method4415(i, i_288_, i_289_, class478, 522913859);
			if (interface12.method86(1202983458))
				interface12.method88(class505, -1655574800);
			if (0 == i_287_) {
				aClass206_3776.method3422(i, i_288_, i_289_, (short) 255);
				aClass206_3776.method3460(i, i_288_, i_289_, (byte) 8);
				if (647396503 * class478.anInt5677 != 0)
					class336.method5992(i_288_, i_289_, i_291_, i_292_, class478.aBool5664, !class478.aBool5686, (byte) -22);
				if (class478.anInt5656 * -1316444551 == 1) {
					if (0 == i_292_)
						aClass206_3776.aClass201_2600.method3297(1, i, i_288_, i_289_);
					else if (1 == i_292_)
						aClass206_3776.aClass201_2600.method3297(2, i, i_288_, 1 + i_289_);
					else if (i_292_ == 2)
						aClass206_3776.aClass201_2600.method3297(1, i, 1 + i_288_, i_289_);
					else if (3 == i_292_)
						aClass206_3776.aClass201_2600.method3297(2, i, i_288_, i_289_);
				}
			} else if (1 == i_287_) {
				aClass206_3776.method3402(i, i_288_, i_289_, (byte) -37);
				aClass206_3776.method3439(i, i_288_, i_289_, -1584361294);
			} else if (2 == i_287_) {
				aClass206_3776.method3530(i, i_288_, i_289_, client.anInterface25_7446, -510350290);
				if (0 != 647396503 * class478.anInt5677 && (-752356381 * class478.anInt5648 + i_288_ < -1230013231 * anInt3784) && (i_289_ + class478.anInt5648 * -752356381 < 2024737111 * anInt3785) && (i_288_ + -1610844647 * class478.anInt5649 < anInt3784 * -1230013231) && (i_289_ + class478.anInt5649 * -1610844647 < anInt3785 * 2024737111))
					class336.method5970(i_288_, i_289_, -752356381 * class478.anInt5648, -1610844647 * class478.anInt5649, i_292_, class478.aBool5664, !class478.aBool5686, -1842935337);
				if (i_291_ == Class458.aClass458_5474.anInt5481 * 1109376893) {
					if (0 == (i_292_ & 0x1))
						aClass206_3776.aClass201_2600.method3297(8, i, i_288_, i_289_);
					else
						aClass206_3776.aClass201_2600.method3297(16, i, i_288_, i_289_);
				}
			} else if (i_287_ == 3) {
				aClass206_3776.method3404(i, i_288_, i_289_, 249816167);
				if (647396503 * class478.anInt5677 == 1)
					class336.method5991(i_288_, i_289_, (byte) 0);
			}
		}
	}

	public final void method12476(Class505 class505, byte[] is, int i, int i_293_, int i_294_, int i_295_, int i_296_, int i_297_, int i_298_, Class336[] class336s) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i_299_ = -1;
		for (;;) {
			int i_300_ = class282_sub35.readSmart2(17376192);
			if (i_300_ == 0)
				break;
			i_299_ += i_300_;
			int i_301_ = 0;
			for (;;) {
				int i_302_ = class282_sub35.readUnsignedSmart(1655351158);
				if (0 == i_302_)
					break;
				i_301_ += i_302_ - 1;
				int i_303_ = i_301_ & 0x3f;
				int i_304_ = i_301_ >> 6 & 0x3f;
				int i_305_ = i_301_ >> 12;
				int i_306_ = class282_sub35.readUnsignedByte();
				int i_307_ = i_306_ >> 2;
				int i_308_ = i_306_ & 0x3;
				if (i_295_ == i_305_ && i_304_ >= i_296_ && i_304_ < 8 + i_296_ && i_303_ >= i_297_ && i_303_ < i_297_ + 8) {
					Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(i_299_, 65280);
					int i_309_ = i_293_ + Class222.method3756(i_304_ & 0x7, i_303_ & 0x7, i_298_, (class478.anInt5648 * -752356381), (class478.anInt5649 * -1610844647), i_308_, (byte) -51);
					int i_310_ = (i_294_ + Class3.method282(i_304_ & 0x7, i_303_ & 0x7, i_298_, -752356381 * class478.anInt5648, class478.anInt5649 * -1610844647, i_308_, 1256655426));
					if (i_309_ > 0 && i_310_ > 0 && i_309_ < -1230013231 * anInt3784 - 1 && i_310_ < 2024737111 * anInt3785 - 1) {
						Class336 class336 = null;
						if (!aBool3786) {
							int i_311_ = i;
							if (((aClass311_3787.aByteArrayArrayArray3638[1][i_309_][i_310_]) & 0x2) == 2)
								i_311_--;
							if (i_311_ >= 0)
								class336 = class336s[i_311_];
						}
						method12459(class505, i, i, i_309_, i_310_, i_299_, i_298_ + i_308_ & 0x3, i_307_, class336, -1, -759157537);
					}
				}
			}
		}
	}

	final void method12477(Class505 class505, int i, int i_312_, int i_313_, int i_314_, int i_315_, int i_316_, int i_317_, Class336 class336, int i_318_) {
		if (i_312_ < -1623875645 * ((Class329_Sub1) this).anInt7723)
			((Class329_Sub1) this).anInt7723 = 231917803 * i_312_;
		Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(i_315_, 65280);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1693321357) != 0 || !class478.aBool5701) {
			int i_319_;
			int i_320_;
			if (i_316_ == 1 || 3 == i_316_) {
				i_319_ = -1610844647 * class478.anInt5649;
				i_320_ = class478.anInt5648 * -752356381;
			} else {
				i_319_ = class478.anInt5648 * -752356381;
				i_320_ = class478.anInt5649 * -1610844647;
			}
			int i_321_;
			int i_322_;
			if (i_319_ + i_313_ <= -1230013231 * anInt3784) {
				i_321_ = (i_319_ >> 1) + i_313_;
				i_322_ = (1 + i_319_ >> 1) + i_313_;
			} else {
				i_321_ = i_313_;
				i_322_ = 1 + i_313_;
			}
			int i_323_;
			int i_324_;
			if (i_320_ + i_314_ <= anInt3785 * 2024737111) {
				i_323_ = (i_320_ >> 1) + i_314_;
				i_324_ = (1 + i_320_ >> 1) + i_314_;
			} else {
				i_323_ = i_314_;
				i_324_ = 1 + i_314_;
			}
			Class390 class390 = aClass206_3776.aClass390Array2591[i];
			int i_325_ = ((class390.method6722(i_321_, i_323_, 65280) + class390.method6722(i_322_, i_323_, 65280) + class390.method6722(i_321_, i_324_, 65280) + class390.method6722(i_322_, i_324_, 65280)) >> 2);
			int i_326_ = (i_319_ << 8) + (i_313_ << 9);
			int i_327_ = (i_314_ << 9) + (i_320_ << 8);
			boolean bool = aBool3773 && !aBool3786 && class478.aBool5655;
			if (class478.method7974(2095291907))
				Class397.method6775(i_312_, i_313_, i_314_, i_316_, class478, null, null, 1870028621);
			boolean bool_328_ = (i_318_ == -1 && !class478.method7967((byte) 31) && class478.anIntArray5650 == null && !class478.aBool5706 && !class478.aBool5699);
			if (!aBool7717 || ((!Class308.method5473(i_317_, 614028060) || 1 == -1316444551 * class478.anInt5656) && (!Class240.method4138(i_317_, -1634630780) || class478.anInt5656 * -1316444551 != 0))) {
				if (Class458.aClass458_5480.anInt5481 * 1109376893 == i_317_) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 62) != 0 || class478.anInt5652 * -348507379 != 0 || 1 == class478.anInt5677 * 647396503 || class478.aBool5685) {
						Class521_Sub1_Sub3 class521_sub1_sub3;
						if (bool_328_) {
							Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1 = (new Class521_Sub1_Sub3_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_312_, i, i_326_, i_325_, i_327_, aBool3786, i_316_, bool));
							if (class521_sub1_sub3_sub1.method86(-1324611225))
								class521_sub1_sub3_sub1.method87(class505, -101230669);
							class521_sub1_sub3 = class521_sub1_sub3_sub1;
						} else
							class521_sub1_sub3 = (new Class521_Sub1_Sub3_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_312_, i, i_326_, i_325_, i_327_, aBool3786, i_316_, i_318_));
						aClass206_3776.method3393(i_312_, i_313_, i_314_, class521_sub1_sub3, -1665704660);
						if (647396503 * class478.anInt5677 == 1 && null != class336)
							class336.method5968(i_313_, i_314_, 1482826222);
					}
				} else if ((i_317_ == 1109376893 * Class458.aClass458_5490.anInt5481) || (Class458.aClass458_5492.anInt5481 * 1109376893 == i_317_)) {
					Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = null;
					Class521_Sub1_Sub1 class521_sub1_sub1;
					int i_329_;
					if (bool_328_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_330_ = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_312_, i, i_326_, i_325_, i_327_, aBool3786, i_313_, i_319_ + i_313_ - 1, i_314_, i_320_ + i_314_ - 1, i_317_, i_316_, bool));
						i_329_ = class521_sub1_sub1_sub6_330_.method16115(-1423224346);
						class521_sub1_sub1 = class521_sub1_sub1_sub6_330_;
						class521_sub1_sub1_sub6 = class521_sub1_sub1_sub6_330_;
					} else {
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_312_, i, i_326_, i_325_, i_327_, aBool3786, i_313_, i_319_ + i_313_ - 1, i_314_, i_314_ + i_320_ - 1, i_317_, i_316_, i_318_));
						i_329_ = 15;
					}
					if (aClass206_3776.method3397(class521_sub1_sub1, false, -526325651)) {
						if (class521_sub1_sub1_sub6 != null && class521_sub1_sub1_sub6.method86(-1005517711))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						if (class478.aBool5657 && aBool3773) {
							if (i_329_ > 30)
								i_329_ = 30;
							for (int i_331_ = 0; i_331_ <= i_319_; i_331_++) {
								for (int i_332_ = 0; i_332_ <= i_320_; i_332_++)
									class390.LA(i_313_ + i_331_, i_314_ + i_332_, i_329_);
							}
						}
					}
					if (0 != 647396503 * class478.anInt5677 && class336 != null)
						class336.method5967(i_313_, i_314_, i_319_, i_320_, class478.aBool5664, !class478.aBool5686, (byte) -10);
				} else if (Class240.method4138(i_317_, -454147710) || Class228.method3849(i_317_, -691465723)) {
					Class521_Sub1_Sub1 class521_sub1_sub1;
					if (bool_328_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_312_, i, i_326_, i_325_, i_327_, aBool3786, i_313_, i_319_ + i_313_ - 1, i_314_, i_320_ + i_314_ - 1, i_317_, i_316_, bool));
						if (class521_sub1_sub1_sub6.method86(-319738782))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						class521_sub1_sub1 = class521_sub1_sub1_sub6;
					} else
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_312_, i, i_326_, i_325_, i_327_, aBool3786, i_313_, i_313_ + i_319_ - 1, i_314_, i_320_ + i_314_ - 1, i_317_, i_316_, i_318_));
					aClass206_3776.method3397(class521_sub1_sub1, false, -809756893);
					if (aBool3773 && !aBool3786 && Class240.method4138(i_317_, -472488054) && (1109376893 * Class458.aClass458_5491.anInt5481 != i_317_) && i_312_ > 0 && 0 != class478.anInt5656 * -1316444551)
						aByteArrayArrayArray3794[i_312_][i_313_][i_314_] |= 0x4;
					if (647396503 * class478.anInt5677 != 0 && null != class336)
						class336.method5967(i_313_, i_314_, i_319_, i_320_, class478.aBool5664, !class478.aBool5686, (byte) -59);
				} else if (method12464(class505, i_317_, i_316_, bool_328_, class478, i_318_, i_312_, i, i_326_, i_325_, i_327_, i_313_, i_314_, bool, class390, class336, i_319_, i_320_, -911490614) || method12465(class505, i_317_, i_316_, bool_328_, class478, i_318_, i_312_, i, i_326_, i_325_, i_327_, i_313_, i_314_, 1825194331)) {
					/* empty */
				}
			}
		}
	}

	final void method12478(Class505 class505, int i, int i_333_, int i_334_, int i_335_, int i_336_, int i_337_, int i_338_, Class336 class336, int i_339_) {
		if (i_333_ < -1623875645 * ((Class329_Sub1) this).anInt7723)
			((Class329_Sub1) this).anInt7723 = 231917803 * i_333_;
		Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(i_336_, 65280);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-452486879) != 0 || !class478.aBool5701) {
			int i_340_;
			int i_341_;
			if (i_337_ == 1 || 3 == i_337_) {
				i_340_ = -1610844647 * class478.anInt5649;
				i_341_ = class478.anInt5648 * -752356381;
			} else {
				i_340_ = class478.anInt5648 * -752356381;
				i_341_ = class478.anInt5649 * -1610844647;
			}
			int i_342_;
			int i_343_;
			if (i_340_ + i_334_ <= -1230013231 * anInt3784) {
				i_342_ = (i_340_ >> 1) + i_334_;
				i_343_ = (1 + i_340_ >> 1) + i_334_;
			} else {
				i_342_ = i_334_;
				i_343_ = 1 + i_334_;
			}
			int i_344_;
			int i_345_;
			if (i_341_ + i_335_ <= anInt3785 * 2024737111) {
				i_344_ = (i_341_ >> 1) + i_335_;
				i_345_ = (1 + i_341_ >> 1) + i_335_;
			} else {
				i_344_ = i_335_;
				i_345_ = 1 + i_335_;
			}
			Class390 class390 = aClass206_3776.aClass390Array2591[i];
			int i_346_ = ((class390.method6722(i_342_, i_344_, 65280) + class390.method6722(i_343_, i_344_, 65280) + class390.method6722(i_342_, i_345_, 65280) + class390.method6722(i_343_, i_345_, 65280)) >> 2);
			int i_347_ = (i_340_ << 8) + (i_334_ << 9);
			int i_348_ = (i_335_ << 9) + (i_341_ << 8);
			boolean bool = aBool3773 && !aBool3786 && class478.aBool5655;
			if (class478.method7974(-132642224))
				Class397.method6775(i_333_, i_334_, i_335_, i_337_, class478, null, null, 1130772872);
			boolean bool_349_ = (i_339_ == -1 && !class478.method7967((byte) 110) && class478.anIntArray5650 == null && !class478.aBool5706 && !class478.aBool5699);
			if (!aBool7717 || ((!Class308.method5473(i_338_, 1627904069) || 1 == -1316444551 * class478.anInt5656) && (!Class240.method4138(i_338_, -959924503) || class478.anInt5656 * -1316444551 != 0))) {
				if (Class458.aClass458_5480.anInt5481 * 1109376893 == i_338_) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 46) != 0 || class478.anInt5652 * -348507379 != 0 || 1 == class478.anInt5677 * 647396503 || class478.aBool5685) {
						Class521_Sub1_Sub3 class521_sub1_sub3;
						if (bool_349_) {
							Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1 = (new Class521_Sub1_Sub3_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_333_, i, i_347_, i_346_, i_348_, aBool3786, i_337_, bool));
							if (class521_sub1_sub3_sub1.method86(326862124))
								class521_sub1_sub3_sub1.method87(class505, -101230669);
							class521_sub1_sub3 = class521_sub1_sub3_sub1;
						} else
							class521_sub1_sub3 = (new Class521_Sub1_Sub3_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_333_, i, i_347_, i_346_, i_348_, aBool3786, i_337_, i_339_));
						aClass206_3776.method3393(i_333_, i_334_, i_335_, class521_sub1_sub3, -2044164766);
						if (647396503 * class478.anInt5677 == 1 && null != class336)
							class336.method5968(i_334_, i_335_, 961567118);
					}
				} else if ((i_338_ == 1109376893 * Class458.aClass458_5490.anInt5481) || (Class458.aClass458_5492.anInt5481 * 1109376893 == i_338_)) {
					Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = null;
					Class521_Sub1_Sub1 class521_sub1_sub1;
					int i_350_;
					if (bool_349_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_351_ = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_333_, i, i_347_, i_346_, i_348_, aBool3786, i_334_, i_340_ + i_334_ - 1, i_335_, i_341_ + i_335_ - 1, i_338_, i_337_, bool));
						i_350_ = class521_sub1_sub1_sub6_351_.method16115(1458565884);
						class521_sub1_sub1 = class521_sub1_sub1_sub6_351_;
						class521_sub1_sub1_sub6 = class521_sub1_sub1_sub6_351_;
					} else {
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_333_, i, i_347_, i_346_, i_348_, aBool3786, i_334_, i_340_ + i_334_ - 1, i_335_, i_335_ + i_341_ - 1, i_338_, i_337_, i_339_));
						i_350_ = 15;
					}
					if (aClass206_3776.method3397(class521_sub1_sub1, false, 788087164)) {
						if (class521_sub1_sub1_sub6 != null && class521_sub1_sub1_sub6.method86(-529343668))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						if (class478.aBool5657 && aBool3773) {
							if (i_350_ > 30)
								i_350_ = 30;
							for (int i_352_ = 0; i_352_ <= i_340_; i_352_++) {
								for (int i_353_ = 0; i_353_ <= i_341_; i_353_++)
									class390.LA(i_334_ + i_352_, i_335_ + i_353_, i_350_);
							}
						}
					}
					if (0 != 647396503 * class478.anInt5677 && class336 != null)
						class336.method5967(i_334_, i_335_, i_340_, i_341_, class478.aBool5664, !class478.aBool5686, (byte) -61);
				} else if (Class240.method4138(i_338_, -796531344) || Class228.method3849(i_338_, 1521462424)) {
					Class521_Sub1_Sub1 class521_sub1_sub1;
					if (bool_349_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_333_, i, i_347_, i_346_, i_348_, aBool3786, i_334_, i_340_ + i_334_ - 1, i_335_, i_341_ + i_335_ - 1, i_338_, i_337_, bool));
						if (class521_sub1_sub1_sub6.method86(445293334))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						class521_sub1_sub1 = class521_sub1_sub1_sub6;
					} else
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_333_, i, i_347_, i_346_, i_348_, aBool3786, i_334_, i_334_ + i_340_ - 1, i_335_, i_341_ + i_335_ - 1, i_338_, i_337_, i_339_));
					aClass206_3776.method3397(class521_sub1_sub1, false, 172197782);
					if (aBool3773 && !aBool3786 && Class240.method4138(i_338_, -1351386806) && (1109376893 * Class458.aClass458_5491.anInt5481 != i_338_) && i_333_ > 0 && 0 != class478.anInt5656 * -1316444551)
						aByteArrayArrayArray3794[i_333_][i_334_][i_335_] |= 0x4;
					if (647396503 * class478.anInt5677 != 0 && null != class336)
						class336.method5967(i_334_, i_335_, i_340_, i_341_, class478.aBool5664, !class478.aBool5686, (byte) -58);
				} else if (method12464(class505, i_338_, i_337_, bool_349_, class478, i_339_, i_333_, i, i_347_, i_346_, i_348_, i_334_, i_335_, bool, class390, class336, i_340_, i_341_, -675177776) || method12465(class505, i_338_, i_337_, bool_349_, class478, i_339_, i_333_, i, i_347_, i_346_, i_348_, i_334_, i_335_, 1825194331)) {
					/* empty */
				}
			}
		}
	}

	public final void method12479(Class505 class505, RsByteBuffer class282_sub35, int i, int i_354_) {
		if (!aBool3786) {
			boolean bool = false;
			Class535 class535 = null;
			while (-1990677291 * class282_sub35.index < class282_sub35.buffer.length) {
				int i_355_ = class282_sub35.readUnsignedByte();
				if (i_355_ == 0) {
					if (class535 == null)
						class535 = new Class535(class282_sub35, (((Class329_Sub1) this).aClass239_7719));
					else
						class535.method11468(class282_sub35, (((Class329_Sub1) this).aClass239_7719), 745285054);
				} else if (i_355_ == 1) {
					int i_356_ = class282_sub35.readUnsignedByte();
					if (i_356_ > 0) {
						for (int i_357_ = 0; i_357_ < i_356_; i_357_++) {
							Class287 class287 = new Class287(class505, (aClass206_3776.anInt2592 * -1928575293), class282_sub35, 2);
							if (class287.anInt3430 * 1711091569 == 31) {
								Class416 class416 = (Class282_Sub23.aClass436_7683.method7304(class282_sub35.readUnsignedShort(), (byte) 16));
								class287.method5061(633357 * class416.anInt4986, class416.anInt4989 * -1719615659, 976456007 * class416.anInt4988, 475908455 * class416.anInt4987, (byte) -1);
							}
							if (class505.method8463() > 0) {
								Class282_Sub24 class282_sub24 = class287.aClass282_Sub24_3425;
								int i_358_ = (class282_sub24.method12368((byte) 95) + (i << 9));
								int i_359_ = (class282_sub24.method12394(1083455632) + (i_354_ << 9));
								int i_360_ = i_358_ >> 9;
								int i_361_ = i_359_ >> 9;
								if (i_360_ >= 0 && i_361_ >= 0 && i_360_ < -1230013231 * anInt3784 && i_361_ < 2024737111 * anInt3785) {
									class282_sub24.method12374(i_358_, ((anIntArrayArrayArray3818[class287.anInt3419 * -2046020753][i_360_][i_361_]) - class282_sub24.method12369(1534020223)), i_359_, 1541575437);
									aClass206_3776.method3430(class287, (byte) 1);
								}
							}
						}
					}
				} else if (2 == i_355_) {
					if (class535 == null)
						class535 = new Class535();
					class535.method11471(class282_sub35, (byte) -42);
				} else if (128 == i_355_) {
					if (null == class535)
						class535 = new Class535();
					class535.method11472(class282_sub35, ((Class329_Sub1) this).aClass239_7719, -1865936153);
				} else if (i_355_ == 129) {
					if (aByteArrayArrayArray3788 == null)
						aByteArrayArrayArray3788 = new byte[4][][];
					for (int i_362_ = 0; i_362_ < 4; i_362_++) {
						byte i_363_ = class282_sub35.readByte((short) -11578);
						if (0 == i_363_ && null != aByteArrayArrayArray3788[i_362_]) {
							int i_364_ = i;
							int i_365_ = i + 64;
							int i_366_ = i_354_;
							int i_367_ = i_354_ + 64;
							if (i_364_ < 0)
								i_364_ = 0;
							else if (i_364_ >= anInt3784 * -1230013231)
								i_364_ = anInt3784 * -1230013231;
							if (i_365_ < 0)
								i_365_ = 0;
							else if (i_365_ >= anInt3784 * -1230013231)
								i_365_ = -1230013231 * anInt3784;
							if (i_366_ < 0)
								i_366_ = 0;
							else if (i_366_ >= 2024737111 * anInt3785)
								i_366_ = 2024737111 * anInt3785;
							if (i_367_ < 0)
								i_367_ = 0;
							else if (i_367_ >= anInt3785 * 2024737111)
								i_367_ = 2024737111 * anInt3785;
							for (/**/; i_364_ < i_365_; i_364_++) {
								for (/**/; i_366_ < i_367_; i_366_++)
									aByteArrayArrayArray3788[i_362_][i_364_][i_366_] = (byte) 0;
							}
						} else if (i_363_ == 1) {
							if (null == aByteArrayArrayArray3788[i_362_])
								aByteArrayArrayArray3788[i_362_] = (new byte[-1230013231 * anInt3784 + 1][2024737111 * anInt3785 + 1]);
							for (int i_368_ = 0; i_368_ < 64; i_368_ += 4) {
								for (int i_369_ = 0; i_369_ < 64; i_369_ += 4) {
									byte i_370_ = class282_sub35.readByte((short) -7799);
									for (int i_371_ = i_368_ + i; i_371_ < 4 + (i + i_368_); i_371_++) {
										for (int i_372_ = i_354_ + i_369_; i_372_ < 4 + (i_354_ + i_369_); i_372_++) {
											if (i_371_ >= 0 && (i_371_ < anInt3784 * -1230013231) && i_372_ >= 0 && (i_372_ < anInt3785 * 2024737111))
												aByteArrayArrayArray3788[i_362_][i_371_][i_372_] = i_370_;
										}
									}
								}
							}
						} else if (2 == i_363_) {
							if (aByteArrayArrayArray3788[i_362_] == null)
								aByteArrayArrayArray3788[i_362_] = (new byte[1 + anInt3784 * -1230013231][2024737111 * anInt3785 + 1]);
							if (i_362_ > 0) {
								int i_373_ = i;
								int i_374_ = 64 + i;
								int i_375_ = i_354_;
								int i_376_ = i_354_ + 64;
								if (i_373_ < 0)
									i_373_ = 0;
								else if (i_373_ >= anInt3784 * -1230013231)
									i_373_ = -1230013231 * anInt3784;
								if (i_374_ < 0)
									i_374_ = 0;
								else if (i_374_ >= anInt3784 * -1230013231)
									i_374_ = -1230013231 * anInt3784;
								if (i_375_ < 0)
									i_375_ = 0;
								else if (i_375_ >= anInt3785 * 2024737111)
									i_375_ = 2024737111 * anInt3785;
								if (i_376_ < 0)
									i_376_ = 0;
								else if (i_376_ >= 2024737111 * anInt3785)
									i_376_ = 2024737111 * anInt3785;
								for (/**/; i_373_ < i_374_; i_373_++) {
									for (/**/; i_375_ < i_376_; i_375_++)
										aByteArrayArrayArray3788[i_362_][i_373_][i_375_] = (aByteArrayArrayArray3788[i_362_ - 1][i_373_][i_375_]);
								}
							}
						}
					}
					bool = true;
				} else
					throw new IllegalStateException("");
			}
			if (class535 != null) {
				for (int i_377_ = 0; i_377_ < 8; i_377_++) {
					for (int i_378_ = 0; i_378_ < 8; i_378_++) {
						int i_379_ = i_377_ + (i >> 3);
						int i_380_ = i_378_ + (i_354_ >> 3);
						if (i_379_ >= 0 && i_379_ < -1230013231 * anInt3784 >> 3 && i_380_ >= 0 && i_380_ < 2024737111 * anInt3785 >> 3)
							((Class329_Sub1) this).aClass239_7719.method4056(i_379_, i_380_, class535, (byte) 61);
					}
				}
			}
			if (!bool && aByteArrayArrayArray3788 != null) {
				for (int i_381_ = 0; i_381_ < 4; i_381_++) {
					if (aByteArrayArrayArray3788[i_381_] != null) {
						for (int i_382_ = 0; i_382_ < 16; i_382_++) {
							for (int i_383_ = 0; i_383_ < 16; i_383_++) {
								int i_384_ = i_382_ + (i >> 2);
								int i_385_ = i_383_ + (i_354_ >> 2);
								if (i_384_ >= 0 && i_384_ < 26 && i_385_ >= 0 && i_385_ < 26)
									aByteArrayArrayArray3788[i_381_][i_384_][i_385_] = (byte) 0;
							}
						}
					}
				}
			}
		}
	}

	final void method12480(Class505 class505, int i, int i_386_, int i_387_, int i_388_, int i_389_, int i_390_, int i_391_, Class336 class336, int i_392_) {
		if (i_386_ < -1623875645 * ((Class329_Sub1) this).anInt7723)
			((Class329_Sub1) this).anInt7723 = 231917803 * i_386_;
		Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(i_389_, 65280);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-410083930) != 0 || !class478.aBool5701) {
			int i_393_;
			int i_394_;
			if (i_390_ == 1 || 3 == i_390_) {
				i_393_ = -1610844647 * class478.anInt5649;
				i_394_ = class478.anInt5648 * -752356381;
			} else {
				i_393_ = class478.anInt5648 * -752356381;
				i_394_ = class478.anInt5649 * -1610844647;
			}
			int i_395_;
			int i_396_;
			if (i_393_ + i_387_ <= -1230013231 * anInt3784) {
				i_395_ = (i_393_ >> 1) + i_387_;
				i_396_ = (1 + i_393_ >> 1) + i_387_;
			} else {
				i_395_ = i_387_;
				i_396_ = 1 + i_387_;
			}
			int i_397_;
			int i_398_;
			if (i_394_ + i_388_ <= anInt3785 * 2024737111) {
				i_397_ = (i_394_ >> 1) + i_388_;
				i_398_ = (1 + i_394_ >> 1) + i_388_;
			} else {
				i_397_ = i_388_;
				i_398_ = 1 + i_388_;
			}
			Class390 class390 = aClass206_3776.aClass390Array2591[i];
			int i_399_ = ((class390.method6722(i_395_, i_397_, 65280) + class390.method6722(i_396_, i_397_, 65280) + class390.method6722(i_395_, i_398_, 65280) + class390.method6722(i_396_, i_398_, 65280)) >> 2);
			int i_400_ = (i_393_ << 8) + (i_387_ << 9);
			int i_401_ = (i_388_ << 9) + (i_394_ << 8);
			boolean bool = aBool3773 && !aBool3786 && class478.aBool5655;
			if (class478.method7974(1812571224))
				Class397.method6775(i_386_, i_387_, i_388_, i_390_, class478, null, null, 1247873625);
			boolean bool_402_ = (i_392_ == -1 && !class478.method7967((byte) 126) && class478.anIntArray5650 == null && !class478.aBool5706 && !class478.aBool5699);
			if (!aBool7717 || ((!Class308.method5473(i_391_, 1854299626) || 1 == -1316444551 * class478.anInt5656) && (!Class240.method4138(i_391_, -1937202911) || class478.anInt5656 * -1316444551 != 0))) {
				if (Class458.aClass458_5480.anInt5481 * 1109376893 == i_391_) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 79) != 0 || class478.anInt5652 * -348507379 != 0 || 1 == class478.anInt5677 * 647396503 || class478.aBool5685) {
						Class521_Sub1_Sub3 class521_sub1_sub3;
						if (bool_402_) {
							Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1 = (new Class521_Sub1_Sub3_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_386_, i, i_400_, i_399_, i_401_, aBool3786, i_390_, bool));
							if (class521_sub1_sub3_sub1.method86(66192080))
								class521_sub1_sub3_sub1.method87(class505, -101230669);
							class521_sub1_sub3 = class521_sub1_sub3_sub1;
						} else
							class521_sub1_sub3 = (new Class521_Sub1_Sub3_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_386_, i, i_400_, i_399_, i_401_, aBool3786, i_390_, i_392_));
						aClass206_3776.method3393(i_386_, i_387_, i_388_, class521_sub1_sub3, -1107670273);
						if (647396503 * class478.anInt5677 == 1 && null != class336)
							class336.method5968(i_387_, i_388_, 249367277);
					}
				} else if ((i_391_ == 1109376893 * Class458.aClass458_5490.anInt5481) || (Class458.aClass458_5492.anInt5481 * 1109376893 == i_391_)) {
					Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = null;
					Class521_Sub1_Sub1 class521_sub1_sub1;
					int i_403_;
					if (bool_402_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_404_ = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_386_, i, i_400_, i_399_, i_401_, aBool3786, i_387_, i_393_ + i_387_ - 1, i_388_, i_394_ + i_388_ - 1, i_391_, i_390_, bool));
						i_403_ = class521_sub1_sub1_sub6_404_.method16115(-1906357923);
						class521_sub1_sub1 = class521_sub1_sub1_sub6_404_;
						class521_sub1_sub1_sub6 = class521_sub1_sub1_sub6_404_;
					} else {
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_386_, i, i_400_, i_399_, i_401_, aBool3786, i_387_, i_393_ + i_387_ - 1, i_388_, i_388_ + i_394_ - 1, i_391_, i_390_, i_392_));
						i_403_ = 15;
					}
					if (aClass206_3776.method3397(class521_sub1_sub1, false, -1748262655)) {
						if (class521_sub1_sub1_sub6 != null && class521_sub1_sub1_sub6.method86(233877517))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						if (class478.aBool5657 && aBool3773) {
							if (i_403_ > 30)
								i_403_ = 30;
							for (int i_405_ = 0; i_405_ <= i_393_; i_405_++) {
								for (int i_406_ = 0; i_406_ <= i_394_; i_406_++)
									class390.LA(i_387_ + i_405_, i_388_ + i_406_, i_403_);
							}
						}
					}
					if (0 != 647396503 * class478.anInt5677 && class336 != null)
						class336.method5967(i_387_, i_388_, i_393_, i_394_, class478.aBool5664, !class478.aBool5686, (byte) -3);
				} else if (Class240.method4138(i_391_, -1735872381) || Class228.method3849(i_391_, 158354869)) {
					Class521_Sub1_Sub1 class521_sub1_sub1;
					if (bool_402_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_386_, i, i_400_, i_399_, i_401_, aBool3786, i_387_, i_393_ + i_387_ - 1, i_388_, i_394_ + i_388_ - 1, i_391_, i_390_, bool));
						if (class521_sub1_sub1_sub6.method86(250439651))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						class521_sub1_sub1 = class521_sub1_sub1_sub6;
					} else
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_386_, i, i_400_, i_399_, i_401_, aBool3786, i_387_, i_387_ + i_393_ - 1, i_388_, i_394_ + i_388_ - 1, i_391_, i_390_, i_392_));
					aClass206_3776.method3397(class521_sub1_sub1, false, 1548532863);
					if (aBool3773 && !aBool3786 && Class240.method4138(i_391_, -1191903530) && (1109376893 * Class458.aClass458_5491.anInt5481 != i_391_) && i_386_ > 0 && 0 != class478.anInt5656 * -1316444551)
						aByteArrayArrayArray3794[i_386_][i_387_][i_388_] |= 0x4;
					if (647396503 * class478.anInt5677 != 0 && null != class336)
						class336.method5967(i_387_, i_388_, i_393_, i_394_, class478.aBool5664, !class478.aBool5686, (byte) -17);
				} else if (method12464(class505, i_391_, i_390_, bool_402_, class478, i_392_, i_386_, i, i_400_, i_399_, i_401_, i_387_, i_388_, bool, class390, class336, i_393_, i_394_, -48039204) || method12465(class505, i_391_, i_390_, bool_402_, class478, i_392_, i_386_, i, i_400_, i_399_, i_401_, i_387_, i_388_, 1825194331)) {
					/* empty */
				}
			}
		}
	}

	final void method12481(Class505 class505, int i, int i_407_, int i_408_, int i_409_, int i_410_, int i_411_, int i_412_, Class336 class336, int i_413_) {
		if (i_407_ < -1623875645 * ((Class329_Sub1) this).anInt7723)
			((Class329_Sub1) this).anInt7723 = 231917803 * i_407_;
		Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(i_410_, 65280);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(803501035) != 0 || !class478.aBool5701) {
			int i_414_;
			int i_415_;
			if (i_411_ == 1 || 3 == i_411_) {
				i_414_ = -1610844647 * class478.anInt5649;
				i_415_ = class478.anInt5648 * -752356381;
			} else {
				i_414_ = class478.anInt5648 * -752356381;
				i_415_ = class478.anInt5649 * -1610844647;
			}
			int i_416_;
			int i_417_;
			if (i_414_ + i_408_ <= -1230013231 * anInt3784) {
				i_416_ = (i_414_ >> 1) + i_408_;
				i_417_ = (1 + i_414_ >> 1) + i_408_;
			} else {
				i_416_ = i_408_;
				i_417_ = 1 + i_408_;
			}
			int i_418_;
			int i_419_;
			if (i_415_ + i_409_ <= anInt3785 * 2024737111) {
				i_418_ = (i_415_ >> 1) + i_409_;
				i_419_ = (1 + i_415_ >> 1) + i_409_;
			} else {
				i_418_ = i_409_;
				i_419_ = 1 + i_409_;
			}
			Class390 class390 = aClass206_3776.aClass390Array2591[i];
			int i_420_ = ((class390.method6722(i_416_, i_418_, 65280) + class390.method6722(i_417_, i_418_, 65280) + class390.method6722(i_416_, i_419_, 65280) + class390.method6722(i_417_, i_419_, 65280)) >> 2);
			int i_421_ = (i_414_ << 8) + (i_408_ << 9);
			int i_422_ = (i_409_ << 9) + (i_415_ << 8);
			boolean bool = aBool3773 && !aBool3786 && class478.aBool5655;
			if (class478.method7974(262885894))
				Class397.method6775(i_407_, i_408_, i_409_, i_411_, class478, null, null, 535188930);
			boolean bool_423_ = (i_413_ == -1 && !class478.method7967((byte) 59) && class478.anIntArray5650 == null && !class478.aBool5706 && !class478.aBool5699);
			if (!aBool7717 || ((!Class308.method5473(i_412_, 860043478) || 1 == -1316444551 * class478.anInt5656) && (!Class240.method4138(i_412_, -993207324) || class478.anInt5656 * -1316444551 != 0))) {
				if (Class458.aClass458_5480.anInt5481 * 1109376893 == i_412_) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 31) != 0 || class478.anInt5652 * -348507379 != 0 || 1 == class478.anInt5677 * 647396503 || class478.aBool5685) {
						Class521_Sub1_Sub3 class521_sub1_sub3;
						if (bool_423_) {
							Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1 = (new Class521_Sub1_Sub3_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_407_, i, i_421_, i_420_, i_422_, aBool3786, i_411_, bool));
							if (class521_sub1_sub3_sub1.method86(2060121412))
								class521_sub1_sub3_sub1.method87(class505, -101230669);
							class521_sub1_sub3 = class521_sub1_sub3_sub1;
						} else
							class521_sub1_sub3 = (new Class521_Sub1_Sub3_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_407_, i, i_421_, i_420_, i_422_, aBool3786, i_411_, i_413_));
						aClass206_3776.method3393(i_407_, i_408_, i_409_, class521_sub1_sub3, -706684496);
						if (647396503 * class478.anInt5677 == 1 && null != class336)
							class336.method5968(i_408_, i_409_, 1756517421);
					}
				} else if ((i_412_ == 1109376893 * Class458.aClass458_5490.anInt5481) || (Class458.aClass458_5492.anInt5481 * 1109376893 == i_412_)) {
					Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = null;
					Class521_Sub1_Sub1 class521_sub1_sub1;
					int i_424_;
					if (bool_423_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_425_ = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_407_, i, i_421_, i_420_, i_422_, aBool3786, i_408_, i_414_ + i_408_ - 1, i_409_, i_415_ + i_409_ - 1, i_412_, i_411_, bool));
						i_424_ = class521_sub1_sub1_sub6_425_.method16115(-435460924);
						class521_sub1_sub1 = class521_sub1_sub1_sub6_425_;
						class521_sub1_sub1_sub6 = class521_sub1_sub1_sub6_425_;
					} else {
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_407_, i, i_421_, i_420_, i_422_, aBool3786, i_408_, i_414_ + i_408_ - 1, i_409_, i_409_ + i_415_ - 1, i_412_, i_411_, i_413_));
						i_424_ = 15;
					}
					if (aClass206_3776.method3397(class521_sub1_sub1, false, -1484677543)) {
						if (class521_sub1_sub1_sub6 != null && class521_sub1_sub1_sub6.method86(-33769649))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						if (class478.aBool5657 && aBool3773) {
							if (i_424_ > 30)
								i_424_ = 30;
							for (int i_426_ = 0; i_426_ <= i_414_; i_426_++) {
								for (int i_427_ = 0; i_427_ <= i_415_; i_427_++)
									class390.LA(i_408_ + i_426_, i_409_ + i_427_, i_424_);
							}
						}
					}
					if (0 != 647396503 * class478.anInt5677 && class336 != null)
						class336.method5967(i_408_, i_409_, i_414_, i_415_, class478.aBool5664, !class478.aBool5686, (byte) -48);
				} else if (Class240.method4138(i_412_, -1906584221) || Class228.method3849(i_412_, -2028573250)) {
					Class521_Sub1_Sub1 class521_sub1_sub1;
					if (bool_423_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_407_, i, i_421_, i_420_, i_422_, aBool3786, i_408_, i_414_ + i_408_ - 1, i_409_, i_415_ + i_409_ - 1, i_412_, i_411_, bool));
						if (class521_sub1_sub1_sub6.method86(-1713723275))
							class521_sub1_sub1_sub6.method87(class505, -101230669);
						class521_sub1_sub1 = class521_sub1_sub1_sub6;
					} else
						class521_sub1_sub1 = (new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_407_, i, i_421_, i_420_, i_422_, aBool3786, i_408_, i_408_ + i_414_ - 1, i_409_, i_415_ + i_409_ - 1, i_412_, i_411_, i_413_));
					aClass206_3776.method3397(class521_sub1_sub1, false, -1953004510);
					if (aBool3773 && !aBool3786 && Class240.method4138(i_412_, -1949345534) && (1109376893 * Class458.aClass458_5491.anInt5481 != i_412_) && i_407_ > 0 && 0 != class478.anInt5656 * -1316444551)
						aByteArrayArrayArray3794[i_407_][i_408_][i_409_] |= 0x4;
					if (647396503 * class478.anInt5677 != 0 && null != class336)
						class336.method5967(i_408_, i_409_, i_414_, i_415_, class478.aBool5664, !class478.aBool5686, (byte) -3);
				} else if (method12464(class505, i_412_, i_411_, bool_423_, class478, i_413_, i_407_, i, i_421_, i_420_, i_422_, i_408_, i_409_, bool, class390, class336, i_414_, i_415_, -614500072) || method12465(class505, i_412_, i_411_, bool_423_, class478, i_413_, i_407_, i, i_421_, i_420_, i_422_, i_408_, i_409_, 1825194331)) {
					/* empty */
				}
			}
		}
	}

	boolean method12482(Class505 class505, int i, int i_428_, boolean bool, Class478 class478, int i_429_, int i_430_, int i_431_, int i_432_, int i_433_, int i_434_, int i_435_, int i_436_) {
		if (1109376893 * Class458.aClass458_5475.anInt5481 == i) {
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, 0, 0, i, i_428_);
				if (class521_sub1_sub4_sub1.method86(763839099))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, 0, 0, i, i_428_, i_429_);
			aClass206_3776.method3396(i_430_, i_435_, i_436_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (Class458.aClass458_5476.anInt5481 * 1109376893 == i) {
			int i_437_ = 65;
			Interface12 interface12 = (Interface12) aClass206_3776.method3381(i_430_, i_435_, i_436_, (byte) -44);
			if (null != interface12)
				i_437_ = ((((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-226081178), 65280).anInt5661) * -1085975425) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, anIntArray7724[i_428_] * i_437_, anIntArray7720[i_428_] * i_437_, i, i_428_));
				if (class521_sub1_sub4_sub1.method86(-1533400206))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = (new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, i_437_ * anIntArray7724[i_428_], i_437_ * anIntArray7720[i_428_], i, i_428_, i_429_));
			aClass206_3776.method3396(i_430_, i_435_, i_436_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (1109376893 * Class458.aClass458_5477.anInt5481 == i) {
			int i_438_ = 33;
			Interface12 interface12 = (Interface12) aClass206_3776.method3381(i_430_, i_435_, i_436_, (byte) -68);
			if (null != interface12)
				i_438_ = (((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-2096581805), 65280).anInt5661) * -1085975425 / 2 + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, i_438_ * anIntArray7724[i_428_], anIntArray7720[i_428_] * i_438_, i, 4 + i_428_));
				if (class521_sub1_sub4_sub1.method86(-1577256039))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = (new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, anIntArray7721[i_428_] * i_438_, anIntArray7713[i_428_] * i_438_, i, 4 + i_428_, i_429_));
			aClass206_3776.method3396(i_430_, i_435_, i_436_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (1109376893 * Class458.aClass458_5478.anInt5481 == i) {
			int i_439_ = i_428_ + 2 & 0x3;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, 0, 0, i, 4 + i_439_);
				if (class521_sub1_sub4_sub1.method86(542273072))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, 0, 0, i, 4 + i_439_, i_429_);
			aClass206_3776.method3396(i_430_, i_435_, i_436_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (Class458.aClass458_5479.anInt5481 * 1109376893 == i) {
			int i_440_ = i_428_ + 2 & 0x3;
			int i_441_ = 33;
			Interface12 interface12 = (Interface12) aClass206_3776.method3381(i_430_, i_435_, i_436_, (byte) -87);
			if (null != interface12)
				i_441_ = (((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-1126651026), 65280).anInt5661) * -1085975425 / 2 + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			Class521_Sub1_Sub4 class521_sub1_sub4_442_;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, i_441_ * anIntArray7721[i_428_], i_441_ * anIntArray7713[i_428_], i, i_428_ + 4));
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_443_ = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, 0, 0, i, 4 + i_440_);
				if (class521_sub1_sub4_sub1.method86(1079944877))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				if (class521_sub1_sub4_sub1_443_.method86(765032210))
					class521_sub1_sub4_sub1_443_.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
				class521_sub1_sub4_442_ = class521_sub1_sub4_sub1_443_;
			} else {
				Class521_Sub1_Sub4_Sub2 class521_sub1_sub4_sub2 = (new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, i_441_ * anIntArray7721[i_428_], i_441_ * anIntArray7713[i_428_], i, i_428_ + 4, i_429_));
				Class521_Sub1_Sub4_Sub2 class521_sub1_sub4_sub2_444_ = new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_430_, i_431_, i_432_, i_433_, i_434_, aBool3786, 0, 0, i, 4 + i_440_, i_429_);
				class521_sub1_sub4 = class521_sub1_sub4_sub2;
				class521_sub1_sub4_442_ = class521_sub1_sub4_sub2_444_;
			}
			aClass206_3776.method3396(i_430_, i_435_, i_436_, class521_sub1_sub4, class521_sub1_sub4_442_, (byte) 13);
			return true;
		}
		return false;
	}

	boolean method12483(Class505 class505, int i, int i_445_, boolean bool, Class478 class478, int i_446_, int i_447_, int i_448_, int i_449_, int i_450_, int i_451_, int i_452_, int i_453_, boolean bool_454_, Class390 class390, Class336 class336, int i_455_, int i_456_) {
		if (Class458.aClass458_5470.anInt5481 * 1109376893 == i) {
			int i_457_ = class478.anInt5656 * -1316444551;
			if (aBool7714 && -1 == class478.anInt5656 * -1316444551)
				i_457_ = 1;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, i_445_, bool_454_);
				if (class521_sub1_sub5_sub1.method86(-344901000))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, i_445_, i_446_);
			aClass206_3776.method3395(i_447_, i_452_, i_453_, class521_sub1_sub5, null, -1174865687);
			if (i_445_ == 0) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_452_, i_453_, 50);
					class390.LA(i_452_, i_453_ + 1, 50);
				}
				if (1 == i_457_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(1, i_447_, i_452_, i_453_, 523762221 * class478.anInt5684, -619884509 * class478.anInt5658);
			} else if (i_445_ == 1) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_452_, 1 + i_453_, 50);
					class390.LA(i_452_ + 1, 1 + i_453_, 50);
				}
				if (1 == i_457_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(2, i_447_, i_452_, i_453_ + 1, 523762221 * class478.anInt5684, -(-619884509 * class478.anInt5658));
			} else if (2 == i_445_) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(1 + i_452_, i_453_, 50);
					class390.LA(i_452_ + 1, 1 + i_453_, 50);
				}
				if (i_457_ == 1 && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(1, i_447_, i_452_ + 1, i_453_, 523762221 * class478.anInt5684, -(-619884509 * class478.anInt5658));
			} else if (3 == i_445_) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_452_, i_453_, 50);
					class390.LA(i_452_ + 1, i_453_, 50);
				}
				if (1 == i_457_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(2, i_447_, i_452_, i_453_, 523762221 * class478.anInt5684, class478.anInt5658 * -619884509);
			}
			if (class478.anInt5677 * 647396503 != 0 && null != class336)
				class336.method5971(i_452_, i_453_, i, i_445_, class478.aBool5664, !class478.aBool5686, 2114995928);
			if (class478.anInt5661 * -1085975425 != 64)
				aClass206_3776.method3398(i_447_, i_452_, i_453_, class478.anInt5661 * -1085975425, (byte) 67);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5493.anInt5481) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, i_445_, bool_454_);
				if (class521_sub1_sub5_sub1.method86(1351648268))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, i_445_, i_446_);
			aClass206_3776.method3395(i_447_, i_452_, i_453_, class521_sub1_sub5, null, -1608952643);
			if (class478.aBool5657 && aBool3773) {
				if (0 == i_445_)
					class390.LA(i_452_, i_453_ + 1, 50);
				else if (1 == i_445_)
					class390.LA(i_452_ + 1, 1 + i_453_, 50);
				else if (i_445_ == 2)
					class390.LA(1 + i_452_, i_453_, 50);
				else if (3 == i_445_)
					class390.LA(i_452_, i_453_, 50);
			}
			if (0 != 647396503 * class478.anInt5677 && class336 != null)
				class336.method5971(i_452_, i_453_, i, i_445_, class478.aBool5664, !class478.aBool5686, 2114995928);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5472.anInt5481) {
			int i_458_ = i_445_ + 1 & 0x3;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			Class521_Sub1_Sub5 class521_sub1_sub5_459_;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, 4 + i_445_, bool_454_);
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_460_ = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, i_458_, bool_454_);
				if (class521_sub1_sub5_sub1.method86(-1563957031))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				if (class521_sub1_sub5_sub1_460_.method86(706488186))
					class521_sub1_sub5_sub1_460_.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
				class521_sub1_sub5_459_ = class521_sub1_sub5_sub1_460_;
			} else {
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, 4 + i_445_, i_446_);
				class521_sub1_sub5_459_ = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, i_458_, i_446_);
			}
			aClass206_3776.method3395(i_447_, i_452_, i_453_, class521_sub1_sub5, class521_sub1_sub5_459_, -1139878363);
			if ((1 == -1316444551 * class478.anInt5656 || aBool7714 && -1316444551 * class478.anInt5656 == -1) && !aBool3786) {
				if (i_445_ == 0) {
					aClass206_3776.aClass201_2600.method3262(1, i_447_, i_452_, i_453_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
					aClass206_3776.aClass201_2600.method3262(2, i_447_, i_452_, 1 + i_453_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
				} else if (1 == i_445_) {
					aClass206_3776.aClass201_2600.method3262(1, i_447_, i_452_ + 1, i_453_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
					aClass206_3776.aClass201_2600.method3262(2, i_447_, i_452_, 1 + i_453_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
				} else if (2 == i_445_) {
					aClass206_3776.aClass201_2600.method3262(1, i_447_, i_452_ + 1, i_453_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
					aClass206_3776.aClass201_2600.method3262(2, i_447_, i_452_, i_453_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
				} else if (3 == i_445_) {
					aClass206_3776.aClass201_2600.method3262(1, i_447_, i_452_, i_453_, 523762221 * class478.anInt5684, class478.anInt5658 * -619884509);
					aClass206_3776.aClass201_2600.method3262(2, i_447_, i_452_, i_453_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
				}
			}
			if (class478.anInt5677 * 647396503 != 0 && class336 != null)
				class336.method5971(i_452_, i_453_, i, i_445_, class478.aBool5664, !class478.aBool5686, 2114995928);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_447_, i_452_, i_453_, class478.anInt5661 * -1085975425, (byte) 21);
			return true;
		}
		if (Class458.aClass458_5473.anInt5481 * 1109376893 == i) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, i_445_, bool_454_);
				if (class521_sub1_sub5_sub1.method86(1467628439))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i, i_445_, i_446_);
			aClass206_3776.method3395(i_447_, i_452_, i_453_, class521_sub1_sub5, null, -1300951933);
			if (class478.aBool5657 && aBool3773) {
				if (i_445_ == 0)
					class390.LA(i_452_, 1 + i_453_, 50);
				else if (i_445_ == 1)
					class390.LA(i_452_ + 1, i_453_ + 1, 50);
				else if (i_445_ == 2)
					class390.LA(1 + i_452_, i_453_, 50);
				else if (i_445_ == 3)
					class390.LA(i_452_, i_453_, 50);
			}
			if (0 != class478.anInt5677 * 647396503 && class336 != null)
				class336.method5971(i_452_, i_453_, i, i_445_, class478.aBool5664, !class478.aBool5686, 2114995928);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5474.anInt5481) {
			Class521_Sub1_Sub1 class521_sub1_sub1;
			if (bool) {
				Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i_452_, i_452_, i_453_, i_453_, i, i_445_, bool_454_);
				if (class521_sub1_sub1_sub6.method86(1551936312))
					class521_sub1_sub1_sub6.method87(class505, -101230669);
				class521_sub1_sub1 = class521_sub1_sub1_sub6;
			} else
				class521_sub1_sub1 = new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_447_, i_448_, i_449_, i_450_, i_451_, aBool3786, i_452_, i_452_ + i_455_ - 1, i_453_, i_453_ + i_456_ - 1, i, i_445_, i_446_);
			aClass206_3776.method3397(class521_sub1_sub1, false, 1263107949);
			if (1 == -1316444551 * class478.anInt5656 && !aBool3786) {
				int i_461_;
				if (0 == (i_445_ & 0x1))
					i_461_ = 8;
				else
					i_461_ = 16;
				aClass206_3776.aClass201_2600.method3262(i_461_, i_447_, i_452_, i_453_, 523762221 * class478.anInt5684, 0);
			}
			if (647396503 * class478.anInt5677 != 0 && class336 != null)
				class336.method5967(i_452_, i_453_, i_455_, i_456_, class478.aBool5664, !class478.aBool5686, (byte) -122);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_447_, i_452_, i_453_, -1085975425 * class478.anInt5661, (byte) 26);
			return true;
		}
		return false;
	}

	boolean method12484(Class505 class505, int i, int i_462_, boolean bool, Class478 class478, int i_463_, int i_464_, int i_465_, int i_466_, int i_467_, int i_468_, int i_469_, int i_470_, boolean bool_471_, Class390 class390, Class336 class336, int i_472_, int i_473_) {
		if (Class458.aClass458_5470.anInt5481 * 1109376893 == i) {
			int i_474_ = class478.anInt5656 * -1316444551;
			if (aBool7714 && -1 == class478.anInt5656 * -1316444551)
				i_474_ = 1;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, i_462_, bool_471_);
				if (class521_sub1_sub5_sub1.method86(-1278899343))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, i_462_, i_463_);
			aClass206_3776.method3395(i_464_, i_469_, i_470_, class521_sub1_sub5, null, -499132262);
			if (i_462_ == 0) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_469_, i_470_, 50);
					class390.LA(i_469_, i_470_ + 1, 50);
				}
				if (1 == i_474_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(1, i_464_, i_469_, i_470_, 523762221 * class478.anInt5684, -619884509 * class478.anInt5658);
			} else if (i_462_ == 1) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_469_, 1 + i_470_, 50);
					class390.LA(i_469_ + 1, 1 + i_470_, 50);
				}
				if (1 == i_474_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(2, i_464_, i_469_, i_470_ + 1, 523762221 * class478.anInt5684, -(-619884509 * class478.anInt5658));
			} else if (2 == i_462_) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(1 + i_469_, i_470_, 50);
					class390.LA(i_469_ + 1, 1 + i_470_, 50);
				}
				if (i_474_ == 1 && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(1, i_464_, i_469_ + 1, i_470_, 523762221 * class478.anInt5684, -(-619884509 * class478.anInt5658));
			} else if (3 == i_462_) {
				if (aBool3773 && class478.aBool5657) {
					class390.LA(i_469_, i_470_, 50);
					class390.LA(i_469_ + 1, i_470_, 50);
				}
				if (1 == i_474_ && !aBool3786)
					aClass206_3776.aClass201_2600.method3262(2, i_464_, i_469_, i_470_, 523762221 * class478.anInt5684, class478.anInt5658 * -619884509);
			}
			if (class478.anInt5677 * 647396503 != 0 && null != class336)
				class336.method5971(i_469_, i_470_, i, i_462_, class478.aBool5664, !class478.aBool5686, 2114995928);
			if (class478.anInt5661 * -1085975425 != 64)
				aClass206_3776.method3398(i_464_, i_469_, i_470_, class478.anInt5661 * -1085975425, (byte) 114);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5493.anInt5481) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, i_462_, bool_471_);
				if (class521_sub1_sub5_sub1.method86(-85131653))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, i_462_, i_463_);
			aClass206_3776.method3395(i_464_, i_469_, i_470_, class521_sub1_sub5, null, -115122776);
			if (class478.aBool5657 && aBool3773) {
				if (0 == i_462_)
					class390.LA(i_469_, i_470_ + 1, 50);
				else if (1 == i_462_)
					class390.LA(i_469_ + 1, 1 + i_470_, 50);
				else if (i_462_ == 2)
					class390.LA(1 + i_469_, i_470_, 50);
				else if (3 == i_462_)
					class390.LA(i_469_, i_470_, 50);
			}
			if (0 != 647396503 * class478.anInt5677 && class336 != null)
				class336.method5971(i_469_, i_470_, i, i_462_, class478.aBool5664, !class478.aBool5686, 2114995928);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5472.anInt5481) {
			int i_475_ = i_462_ + 1 & 0x3;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			Class521_Sub1_Sub5 class521_sub1_sub5_476_;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, 4 + i_462_, bool_471_);
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_477_ = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, i_475_, bool_471_);
				if (class521_sub1_sub5_sub1.method86(-1686107547))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				if (class521_sub1_sub5_sub1_477_.method86(194874492))
					class521_sub1_sub5_sub1_477_.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
				class521_sub1_sub5_476_ = class521_sub1_sub5_sub1_477_;
			} else {
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, 4 + i_462_, i_463_);
				class521_sub1_sub5_476_ = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, i_475_, i_463_);
			}
			aClass206_3776.method3395(i_464_, i_469_, i_470_, class521_sub1_sub5, class521_sub1_sub5_476_, -1543690512);
			if ((1 == -1316444551 * class478.anInt5656 || aBool7714 && -1316444551 * class478.anInt5656 == -1) && !aBool3786) {
				if (i_462_ == 0) {
					aClass206_3776.aClass201_2600.method3262(1, i_464_, i_469_, i_470_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
					aClass206_3776.aClass201_2600.method3262(2, i_464_, i_469_, 1 + i_470_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
				} else if (1 == i_462_) {
					aClass206_3776.aClass201_2600.method3262(1, i_464_, i_469_ + 1, i_470_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
					aClass206_3776.aClass201_2600.method3262(2, i_464_, i_469_, 1 + i_470_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
				} else if (2 == i_462_) {
					aClass206_3776.aClass201_2600.method3262(1, i_464_, i_469_ + 1, i_470_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
					aClass206_3776.aClass201_2600.method3262(2, i_464_, i_469_, i_470_, class478.anInt5684 * 523762221, -619884509 * class478.anInt5658);
				} else if (3 == i_462_) {
					aClass206_3776.aClass201_2600.method3262(1, i_464_, i_469_, i_470_, 523762221 * class478.anInt5684, class478.anInt5658 * -619884509);
					aClass206_3776.aClass201_2600.method3262(2, i_464_, i_469_, i_470_, class478.anInt5684 * 523762221, class478.anInt5658 * -619884509);
				}
			}
			if (class478.anInt5677 * 647396503 != 0 && class336 != null)
				class336.method5971(i_469_, i_470_, i, i_462_, class478.aBool5664, !class478.aBool5686, 2114995928);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_464_, i_469_, i_470_, class478.anInt5661 * -1085975425, (byte) 36);
			return true;
		}
		if (Class458.aClass458_5473.anInt5481 * 1109376893 == i) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, i_462_, bool_471_);
				if (class521_sub1_sub5_sub1.method86(801110655))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Class521_Sub1_Sub5_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i, i_462_, i_463_);
			aClass206_3776.method3395(i_464_, i_469_, i_470_, class521_sub1_sub5, null, -1327528030);
			if (class478.aBool5657 && aBool3773) {
				if (i_462_ == 0)
					class390.LA(i_469_, 1 + i_470_, 50);
				else if (i_462_ == 1)
					class390.LA(i_469_ + 1, i_470_ + 1, 50);
				else if (i_462_ == 2)
					class390.LA(1 + i_469_, i_470_, 50);
				else if (i_462_ == 3)
					class390.LA(i_469_, i_470_, 50);
			}
			if (0 != class478.anInt5677 * 647396503 && class336 != null)
				class336.method5971(i_469_, i_470_, i, i_462_, class478.aBool5664, !class478.aBool5686, 2114995928);
			return true;
		}
		if (i == 1109376893 * Class458.aClass458_5474.anInt5481) {
			Class521_Sub1_Sub1 class521_sub1_sub1;
			if (bool) {
				Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i_469_, i_469_, i_470_, i_470_, i, i_462_, bool_471_);
				if (class521_sub1_sub1_sub6.method86(1570101197))
					class521_sub1_sub1_sub6.method87(class505, -101230669);
				class521_sub1_sub1 = class521_sub1_sub1_sub6;
			} else
				class521_sub1_sub1 = new Class521_Sub1_Sub1_Sub5(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_464_, i_465_, i_466_, i_467_, i_468_, aBool3786, i_469_, i_469_ + i_472_ - 1, i_470_, i_470_ + i_473_ - 1, i, i_462_, i_463_);
			aClass206_3776.method3397(class521_sub1_sub1, false, 813959411);
			if (1 == -1316444551 * class478.anInt5656 && !aBool3786) {
				int i_478_;
				if (0 == (i_462_ & 0x1))
					i_478_ = 8;
				else
					i_478_ = 16;
				aClass206_3776.aClass201_2600.method3262(i_478_, i_464_, i_469_, i_470_, 523762221 * class478.anInt5684, 0);
			}
			if (647396503 * class478.anInt5677 != 0 && class336 != null)
				class336.method5967(i_469_, i_470_, i_472_, i_473_, class478.aBool5664, !class478.aBool5686, (byte) -92);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_464_, i_469_, i_470_, -1085975425 * class478.anInt5661, (byte) 12);
			return true;
		}
		return false;
	}

	public Class329_Sub1(Class206 class206, Class474 class474, int i, int i_479_, int i_480_, boolean bool, Class311 class311, Class239 class239) {
		super(class206, i, i_479_, i_480_, bool, Class122.aClass536_1535, Class493.aClass479_5778, class311);
		((Class329_Sub1) this).aClass474_7725 = class474;
		((Class329_Sub1) this).aClass239_7719 = class239;
	}

	boolean method12485(Class505 class505, int i, int i_481_, boolean bool, Class478 class478, int i_482_, int i_483_, int i_484_, int i_485_, int i_486_, int i_487_, int i_488_, int i_489_) {
		if (1109376893 * Class458.aClass458_5475.anInt5481 == i) {
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, 0, 0, i, i_481_);
				if (class521_sub1_sub4_sub1.method86(906854822))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, 0, 0, i, i_481_, i_482_);
			aClass206_3776.method3396(i_483_, i_488_, i_489_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (Class458.aClass458_5476.anInt5481 * 1109376893 == i) {
			int i_490_ = 65;
			Interface12 interface12 = (Interface12) aClass206_3776.method3381(i_483_, i_488_, i_489_, (byte) -67);
			if (null != interface12)
				i_490_ = ((((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-281977030), 65280).anInt5661) * -1085975425) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, anIntArray7724[i_481_] * i_490_, anIntArray7720[i_481_] * i_490_, i, i_481_));
				if (class521_sub1_sub4_sub1.method86(2086042273))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = (new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, i_490_ * anIntArray7724[i_481_], i_490_ * anIntArray7720[i_481_], i, i_481_, i_482_));
			aClass206_3776.method3396(i_483_, i_488_, i_489_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (1109376893 * Class458.aClass458_5477.anInt5481 == i) {
			int i_491_ = 33;
			Interface12 interface12 = (Interface12) aClass206_3776.method3381(i_483_, i_488_, i_489_, (byte) -85);
			if (null != interface12)
				i_491_ = ((((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-671616235), 65280).anInt5661) * -1085975425 / 2) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, i_491_ * anIntArray7724[i_481_], anIntArray7720[i_481_] * i_491_, i, 4 + i_481_));
				if (class521_sub1_sub4_sub1.method86(-2012485009))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = (new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, anIntArray7721[i_481_] * i_491_, anIntArray7713[i_481_] * i_491_, i, 4 + i_481_, i_482_));
			aClass206_3776.method3396(i_483_, i_488_, i_489_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (1109376893 * Class458.aClass458_5478.anInt5481 == i) {
			int i_492_ = i_481_ + 2 & 0x3;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, 0, 0, i, 4 + i_492_);
				if (class521_sub1_sub4_sub1.method86(-1496261601))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, 0, 0, i, 4 + i_492_, i_482_);
			aClass206_3776.method3396(i_483_, i_488_, i_489_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (Class458.aClass458_5479.anInt5481 * 1109376893 == i) {
			int i_493_ = i_481_ + 2 & 0x3;
			int i_494_ = 33;
			Interface12 interface12 = (Interface12) aClass206_3776.method3381(i_483_, i_488_, i_489_, (byte) -39);
			if (null != interface12)
				i_494_ = ((((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-83884064), 65280).anInt5661) * -1085975425 / 2) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			Class521_Sub1_Sub4 class521_sub1_sub4_495_;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, i_494_ * anIntArray7721[i_481_], i_494_ * anIntArray7713[i_481_], i, i_481_ + 4));
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_496_ = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, 0, 0, i, 4 + i_493_);
				if (class521_sub1_sub4_sub1.method86(545530348))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				if (class521_sub1_sub4_sub1_496_.method86(-6362438))
					class521_sub1_sub4_sub1_496_.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
				class521_sub1_sub4_495_ = class521_sub1_sub4_sub1_496_;
			} else {
				Class521_Sub1_Sub4_Sub2 class521_sub1_sub4_sub2 = (new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, ((Class329_Sub1) this).aClass474_7725, class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, i_494_ * anIntArray7721[i_481_], i_494_ * anIntArray7713[i_481_], i, i_481_ + 4, i_482_));
				Class521_Sub1_Sub4_Sub2 class521_sub1_sub4_sub2_497_ = new Class521_Sub1_Sub4_Sub2(aClass206_3776, class505, (((Class329_Sub1) this).aClass474_7725), class478, i_483_, i_484_, i_485_, i_486_, i_487_, aBool3786, 0, 0, i, 4 + i_493_, i_482_);
				class521_sub1_sub4 = class521_sub1_sub4_sub2;
				class521_sub1_sub4_495_ = class521_sub1_sub4_sub2_497_;
			}
			aClass206_3776.method3396(i_483_, i_488_, i_489_, class521_sub1_sub4, class521_sub1_sub4_495_, (byte) 13);
			return true;
		}
		return false;
	}

	void method12486(Class505 class505, int i, int i_498_, int i_499_, int i_500_, Class336 class336) {
		Interface12 interface12 = method12467(i, i_498_, i_499_, i_500_, 1742443241);
		if (interface12 != null) {
			Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(-1786399385), 65280);
			int i_501_ = interface12.method89(711079008);
			int i_502_ = interface12.method92(1196494531);
			if (class478.method7974(-380613495))
				Class256.method4415(i, i_499_, i_500_, class478, -1023982314);
			if (interface12.method86(27056350))
				interface12.method88(class505, 864814064);
			if (0 == i_498_) {
				aClass206_3776.method3422(i, i_499_, i_500_, (short) 255);
				aClass206_3776.method3460(i, i_499_, i_500_, (byte) 95);
				if (647396503 * class478.anInt5677 != 0)
					class336.method5992(i_499_, i_500_, i_501_, i_502_, class478.aBool5664, !class478.aBool5686, (byte) -49);
				if (class478.anInt5656 * -1316444551 == 1) {
					if (0 == i_502_)
						aClass206_3776.aClass201_2600.method3297(1, i, i_499_, i_500_);
					else if (1 == i_502_)
						aClass206_3776.aClass201_2600.method3297(2, i, i_499_, 1 + i_500_);
					else if (i_502_ == 2)
						aClass206_3776.aClass201_2600.method3297(1, i, 1 + i_499_, i_500_);
					else if (3 == i_502_)
						aClass206_3776.aClass201_2600.method3297(2, i, i_499_, i_500_);
				}
			} else if (1 == i_498_) {
				aClass206_3776.method3402(i, i_499_, i_500_, (byte) -86);
				aClass206_3776.method3439(i, i_499_, i_500_, -1851738701);
			} else if (2 == i_498_) {
				aClass206_3776.method3530(i, i_499_, i_500_, client.anInterface25_7446, -1111213928);
				if (0 != 647396503 * class478.anInt5677 && (-752356381 * class478.anInt5648 + i_499_ < -1230013231 * anInt3784) && (i_500_ + class478.anInt5648 * -752356381 < 2024737111 * anInt3785) && (i_499_ + -1610844647 * class478.anInt5649 < anInt3784 * -1230013231) && (i_500_ + class478.anInt5649 * -1610844647 < anInt3785 * 2024737111))
					class336.method5970(i_499_, i_500_, -752356381 * class478.anInt5648, -1610844647 * class478.anInt5649, i_502_, class478.aBool5664, !class478.aBool5686, -1372917068);
				if (i_501_ == Class458.aClass458_5474.anInt5481 * 1109376893) {
					if (0 == (i_502_ & 0x1))
						aClass206_3776.aClass201_2600.method3297(8, i, i_499_, i_500_);
					else
						aClass206_3776.aClass201_2600.method3297(16, i, i_499_, i_500_);
				}
			} else if (i_498_ == 3) {
				aClass206_3776.method3404(i, i_499_, i_500_, -1150411615);
				if (647396503 * class478.anInt5677 == 1)
					class336.method5991(i_499_, i_500_, (byte) 0);
			}
		}
	}

	void method12487(Class505 class505, int i, int i_503_, int i_504_, int i_505_, Class336 class336) {
		Interface12 interface12 = method12467(i, i_503_, i_504_, i_505_, 1980964506);
		if (interface12 != null) {
			Class478 class478 = ((Class329_Sub1) this).aClass474_7725.method7891(interface12.method84(1225766237), 65280);
			int i_506_ = interface12.method89(1663361379);
			int i_507_ = interface12.method92(499153391);
			if (class478.method7974(1267716582))
				Class256.method4415(i, i_504_, i_505_, class478, 1902421107);
			if (interface12.method86(-782373703))
				interface12.method88(class505, 1428569416);
			if (0 == i_503_) {
				aClass206_3776.method3422(i, i_504_, i_505_, (short) 255);
				aClass206_3776.method3460(i, i_504_, i_505_, (byte) 112);
				if (647396503 * class478.anInt5677 != 0)
					class336.method5992(i_504_, i_505_, i_506_, i_507_, class478.aBool5664, !class478.aBool5686, (byte) -90);
				if (class478.anInt5656 * -1316444551 == 1) {
					if (0 == i_507_)
						aClass206_3776.aClass201_2600.method3297(1, i, i_504_, i_505_);
					else if (1 == i_507_)
						aClass206_3776.aClass201_2600.method3297(2, i, i_504_, 1 + i_505_);
					else if (i_507_ == 2)
						aClass206_3776.aClass201_2600.method3297(1, i, 1 + i_504_, i_505_);
					else if (3 == i_507_)
						aClass206_3776.aClass201_2600.method3297(2, i, i_504_, i_505_);
				}
			} else if (1 == i_503_) {
				aClass206_3776.method3402(i, i_504_, i_505_, (byte) -63);
				aClass206_3776.method3439(i, i_504_, i_505_, -266249362);
			} else if (2 == i_503_) {
				aClass206_3776.method3530(i, i_504_, i_505_, client.anInterface25_7446, 1484861363);
				if (0 != 647396503 * class478.anInt5677 && (-752356381 * class478.anInt5648 + i_504_ < -1230013231 * anInt3784) && (i_505_ + class478.anInt5648 * -752356381 < 2024737111 * anInt3785) && (i_504_ + -1610844647 * class478.anInt5649 < anInt3784 * -1230013231) && (i_505_ + class478.anInt5649 * -1610844647 < anInt3785 * 2024737111))
					class336.method5970(i_504_, i_505_, -752356381 * class478.anInt5648, -1610844647 * class478.anInt5649, i_507_, class478.aBool5664, !class478.aBool5686, -326589936);
				if (i_506_ == Class458.aClass458_5474.anInt5481 * 1109376893) {
					if (0 == (i_507_ & 0x1))
						aClass206_3776.aClass201_2600.method3297(8, i, i_504_, i_505_);
					else
						aClass206_3776.aClass201_2600.method3297(16, i, i_504_, i_505_);
				}
			} else if (i_503_ == 3) {
				aClass206_3776.method3404(i, i_504_, i_505_, 397545289);
				if (647396503 * class478.anInt5677 == 1)
					class336.method5991(i_504_, i_505_, (byte) 0);
			}
		}
	}

	public final void method12488(Class505 class505, RsByteBuffer class282_sub35, int i, int i_508_, int i_509_, int i_510_, int i_511_, int i_512_, int i_513_) {
		if (!aBool3786) {
			boolean bool = false;
			Class535 class535 = null;
			int i_514_ = (i_511_ & 0x7) * 8;
			int i_515_ = 8 * (i_512_ & 0x7);
			while (class282_sub35.index * -1990677291 < class282_sub35.buffer.length) {
				int i_516_ = class282_sub35.readUnsignedByte();
				if (i_516_ == 0) {
					if (class535 == null)
						class535 = new Class535(class282_sub35, (((Class329_Sub1) this).aClass239_7719));
					else
						class535.method11468(class282_sub35, (((Class329_Sub1) this).aClass239_7719), -1358691189);
				} else if (1 == i_516_) {
					int i_517_ = class282_sub35.readUnsignedByte();
					if (i_517_ > 0) {
						for (int i_518_ = 0; i_518_ < i_517_; i_518_++) {
							Class287 class287 = new Class287(class505, (-1928575293 * aClass206_3776.anInt2592), class282_sub35, 2);
							if (1711091569 * class287.anInt3430 == 31) {
								Class416 class416 = (Class282_Sub23.aClass436_7683.method7304(class282_sub35.readUnsignedShort(), (byte) 65));
								class287.method5061(class416.anInt4986 * 633357, -1719615659 * class416.anInt4989, 976456007 * class416.anInt4988, class416.anInt4987 * 475908455, (byte) -1);
							}
							if (class505.method8463() > 0) {
								Class282_Sub24 class282_sub24 = class287.aClass282_Sub24_3425;
								int i_519_ = (class282_sub24.method12368((byte) 61) >> 9);
								int i_520_ = (class282_sub24.method12394(2002031090) >> 9);
								if (i_510_ == class287.anInt3419 * -2046020753 && i_519_ >= i_514_ && i_519_ < i_514_ + 8 && i_520_ >= i_515_ && i_520_ < 8 + i_515_) {
									int i_521_ = ((i_508_ << 9) + (Class282_Sub20_Sub39.method15436((class282_sub24.method12368((byte) -67) & 0xfff), (class282_sub24.method12394(2098708961) & 0xfff), i_513_, -1000804595)));
									int i_522_ = ((i_509_ << 9) + (Class354.method6214((class282_sub24.method12368((byte) -18) & 0xfff), (class282_sub24.method12394(2054297111) & 0xfff), i_513_, -529491235)));
									i_519_ = i_521_ >> 9;
									i_520_ = i_522_ >> 9;
									if (i_519_ >= 0 && i_520_ >= 0 && i_519_ < -1230013231 * anInt3784 && i_520_ < 2024737111 * anInt3785) {
										class282_sub24.method12374(i_521_, ((anIntArrayArrayArray3818[i_510_][i_519_][i_520_]) - class282_sub24.method12369(1534020223)), i_522_, 1563627783);
										aClass206_3776.method3430(class287, (byte) 1);
									}
								}
							}
						}
					}
				} else if (i_516_ == 2) {
					if (null == class535)
						class535 = new Class535();
					class535.method11471(class282_sub35, (byte) -3);
				} else if (i_516_ == 128) {
					if (null == class535)
						class535 = new Class535();
					class535.method11472(class282_sub35, ((Class329_Sub1) this).aClass239_7719, -1865936153);
				} else if (i_516_ == 129) {
					if (null == aByteArrayArrayArray3788)
						aByteArrayArrayArray3788 = new byte[4][][];
					for (int i_523_ = 0; i_523_ < 4; i_523_++) {
						byte i_524_ = class282_sub35.readByte((short) -5976);
						if (i_524_ == 0 && aByteArrayArrayArray3788[i] != null) {
							if (i_523_ <= i_510_) {
								int i_525_ = i_508_;
								int i_526_ = i_508_ + 7;
								int i_527_ = i_509_;
								int i_528_ = 7 + i_509_;
								if (i_525_ < 0)
									i_525_ = 0;
								else if (i_525_ >= -1230013231 * anInt3784)
									i_525_ = anInt3784 * -1230013231;
								if (i_526_ < 0)
									i_526_ = 0;
								else if (i_526_ >= anInt3784 * -1230013231)
									i_526_ = anInt3784 * -1230013231;
								if (i_527_ < 0)
									i_527_ = 0;
								else if (i_527_ >= anInt3785 * 2024737111)
									i_527_ = 2024737111 * anInt3785;
								if (i_528_ < 0)
									i_528_ = 0;
								else if (i_528_ >= 2024737111 * anInt3785)
									i_528_ = anInt3785 * 2024737111;
								for (/**/; i_525_ < i_526_; i_525_++) {
									for (/**/; i_527_ < i_528_; i_527_++)
										aByteArrayArrayArray3788[i][i_525_][i_527_] = (byte) 0;
								}
							}
						} else if (i_524_ == 1) {
							if (aByteArrayArrayArray3788[i] == null)
								aByteArrayArrayArray3788[i] = (new byte[1 + anInt3784 * -1230013231][1 + 2024737111 * anInt3785]);
							for (int i_529_ = 0; i_529_ < 64; i_529_ += 4) {
								for (int i_530_ = 0; i_530_ < 64; i_530_ += 4) {
									byte i_531_ = class282_sub35.readByte((short) -2034);
									if (i_523_ <= i_510_) {
										for (int i_532_ = i_529_; i_532_ < i_529_ + 4; i_532_++) {
											for (int i_533_ = i_530_; i_533_ < i_530_ + 4; i_533_++) {
												if (i_532_ >= i_514_ && i_532_ < i_514_ + 8 && i_533_ >= i_515_ && i_533_ < 8 + i_515_) {
													int i_534_ = (i_508_ + (Class112.method1871(i_532_ & 0x7, i_533_ & 0x7, i_513_, 1449989045)));
													int i_535_ = (i_509_ + (Class2.method259(i_532_ & 0x7, i_533_ & 0x7, i_513_, -1644218358)));
													if (i_534_ >= 0 && (i_534_ < (anInt3784 * -1230013231)) && i_535_ >= 0 && (i_535_ < (2024737111 * anInt3785))) {
														aByteArrayArrayArray3788[i][i_534_][i_535_] = i_531_;
														bool = true;
													}
												}
											}
										}
									}
								}
							}
						} else if (2 == i_524_)
							continue;
					}
				} else
					throw new IllegalStateException("");
			}
			if (null != class535)
				((Class329_Sub1) this).aClass239_7719.method4056(i_508_ >> 3, i_509_ >> 3, class535, (byte) 60);
			if (!bool && null != aByteArrayArrayArray3788 && aByteArrayArrayArray3788[i] != null) {
				int i_536_ = 7 + i_508_;
				int i_537_ = i_509_ + 7;
				for (int i_538_ = i_508_; i_538_ < i_536_; i_538_++) {
					for (int i_539_ = i_509_; i_539_ < i_537_; i_539_++)
						aByteArrayArrayArray3788[i][i_538_][i_539_] = (byte) 0;
				}
			}
		}
	}

	Interface12 method12489(int i, int i_540_, int i_541_, int i_542_) {
		Interface12 interface12 = null;
		if (i_540_ == 0)
			interface12 = (Interface12) aClass206_3776.method3381(i, i_541_, i_542_, (byte) -124);
		if (1 == i_540_)
			interface12 = (Interface12) aClass206_3776.method3511(i, i_541_, i_542_, (byte) 66);
		if (2 == i_540_)
			interface12 = ((Interface12) aClass206_3776.method3413(i, i_541_, i_542_, client.anInterface25_7446, -233664382));
		if (3 == i_540_)
			interface12 = (Interface12) aClass206_3776.method3415(i, i_541_, i_542_, -387297653);
		return interface12;
	}

	public final void method12490(Class505 class505, boolean bool) {
		aClass206_3776.method3400();
		if (!bool) {
			if (1599084401 * anInt3845 > 1) {
				for (int i = 0; i < anInt3784 * -1230013231; i++) {
					for (int i_543_ = 0; i_543_ < anInt3785 * 2024737111; i_543_++) {
						if (2 == ((aClass311_3787.aByteArrayArrayArray3638[1][i][i_543_]) & 0x2))
							aClass206_3776.method3382(i, i_543_, -1718378310);
					}
				}
			}
			for (int i = 0; i < 1599084401 * anInt3845; i++) {
				for (int i_544_ = 0; i_544_ <= anInt3785 * 2024737111; i_544_++) {
					for (int i_545_ = 0; i_545_ <= anInt3784 * -1230013231; i_545_++) {
						if ((aByteArrayArrayArray3794[i][i_545_][i_544_] & 0x4) != 0) {
							int i_546_ = i_545_;
							int i_547_ = i_545_;
							int i_548_ = i_544_;
							int i_549_;
							for (i_549_ = i_544_; (i_548_ > 0 && 0 != ((aByteArrayArrayArray3794[i][i_545_][i_548_ - 1]) & 0x4) && i_549_ - i_548_ < 10); i_548_--) {
								/* empty */
							}
							for (/**/; (i_549_ < anInt3785 * 2024737111 && 0 != ((aByteArrayArrayArray3794[i][i_545_][i_549_ + 1]) & 0x4) && i_549_ - i_548_ < 10); i_549_++) {
								/* empty */
							}
							while_182_: for (/**/; i_546_ > 0 && i_547_ - i_546_ < 10; i_546_--) {
								for (int i_550_ = i_548_; i_550_ <= i_549_; i_550_++) {
									if (((aByteArrayArrayArray3794[i][i_546_ - 1][i_550_]) & 0x4) == 0)
										break while_182_;
								}
							}
							while_183_: for (/**/; (i_547_ < anInt3784 * -1230013231 && i_547_ - i_546_ < 10); i_547_++) {
								for (int i_551_ = i_548_; i_551_ <= i_549_; i_551_++) {
									if (0 == ((aByteArrayArrayArray3794[i][i_547_ + 1][i_551_]) & 0x4))
										break while_183_;
								}
							}
							if ((i_547_ - i_546_ + 1) * (i_549_ - i_548_ + 1) >= 4) {
								int i_552_ = (anIntArrayArrayArray3818[i][i_546_][i_548_]);
								aClass206_3776.aClass201_2600.method3266(4, i, i_546_ << 9, 512 + (i_547_ << 9), i_548_ << 9, 512 + (i_549_ << 9), i_552_, i_552_);
								for (int i_553_ = i_546_; i_553_ <= i_547_; i_553_++) {
									for (int i_554_ = i_548_; i_554_ <= i_549_; i_554_++)
										aByteArrayArrayArray3794[i][i_553_][i_554_] &= ~0x4;
								}
							}
						}
					}
				}
			}
			aClass206_3776.aClass201_2600.method3264();
		}
		aByteArrayArrayArray3794 = null;
	}

	public static void method12491(Player class521_sub1_sub1_sub2_sub1, int i, int i_555_, byte i_556_) {
		int[] is = new int[Class8_Sub3.method14339(439477133).length];
		Arrays.fill(is, 0, is.length, i);
		Class20.animate(class521_sub1_sub1_sub2_sub1, is, i_555_, false, (byte) -11);
	}

	static final void method12492(Class527 class527, byte i) {
		int i_557_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_557_, (byte) 117);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_557_ >> 16];
		Class463.method7729(class118, class98, class527, 1544396395);
	}
}
