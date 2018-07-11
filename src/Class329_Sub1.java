
/* Class329_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class329_Sub1 extends Class329 {
	static int[] anIntArray7713;
	static boolean aBool7714;
	static boolean aBool7717 = false;
	Class239 aClass239_7719;
	static int[] anIntArray7720;
	static int[] anIntArray7721;
	int anInt7723 = 1485026017;
	static int[] anIntArray7724;
	ObjectIndexLoader objectDefLoader;
	public static int anInt7726;

	final void method12459(GraphicalRenderer renderer, int i, int plane, int localX, int localY, int objectId, int orientation, int type, ClipMap clipMap, int animation, int i_26_) {
		if (plane < -1623875645 * ((Class329_Sub1) this).anInt7723)
			((Class329_Sub1) this).anInt7723 = 231917803 * plane;
		ObjectDefinitions defs = ((Class329_Sub1) this).objectDefLoader.getObjectDefinitions(objectId, 65280);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(590379458) != 0 || !defs.aBool5701) {
			int i_27_;
			int i_28_;
			if (orientation == 1 || 3 == orientation) {
				i_27_ = -1610844647 * defs.anInt5649;
				i_28_ = defs.anInt5648 * -752356381;
			} else {
				i_27_ = defs.anInt5648 * -752356381;
				i_28_ = defs.anInt5649 * -1610844647;
			}
			int i_29_;
			int i_30_;
			if (i_27_ + localX <= -1230013231 * anInt3784) {
				i_29_ = (i_27_ >> 1) + localX;
				i_30_ = (1 + i_27_ >> 1) + localX;
			} else {
				i_29_ = localX;
				i_30_ = 1 + localX;
			}
			int i_31_;
			int i_32_;
			if (i_28_ + localY <= anInt3785 * 2024737111) {
				i_31_ = (i_28_ >> 1) + localY;
				i_32_ = (1 + i_28_ >> 1) + localY;
			} else {
				i_31_ = localY;
				i_32_ = 1 + localY;
			}
			Class390 class390 = aClass206_3776.aClass390Array2591[i];
			int i_33_ = ((class390.method6722(i_29_, i_31_, 65280) + class390.method6722(i_30_, i_31_, 65280) + class390.method6722(i_29_, i_32_, 65280) + class390.method6722(i_30_, i_32_, 65280)) >> 2);
			int i_34_ = (i_27_ << 8) + (localX << 9);
			int i_35_ = (localY << 9) + (i_28_ << 8);
			boolean bool = aBool3773 && !aBool3786 && defs.aBool5655;
			if (defs.method7974(317865608))
				Class397.method6775(plane, localX, localY, orientation, defs, null, null, 2109240355);
			boolean bool_36_ = (animation == -1 && !defs.method7967((byte) 85) && defs.anIntArray5650 == null && !defs.aBool5706 && !defs.aBool5699);
			if (!aBool7717 || ((!Class308.isWall(type, -2097799445) || 1 == -1316444551 * defs.anInt5656) && (!Class240.isRoof(type, -1938518575) || defs.anInt5656 * -1316444551 != 0))) {
				if (SceneObjectType.GROUND_DECORATION.type * 1109376893 == type) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 84) != 0 || defs.anInt5652 * -348507379 != 0 || 1 == defs.clipType * 647396503 || defs.aBool5685) {
						SceneObjectNode obj;
						if (bool_36_) {
							Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1 = (new Class521_Sub1_Sub3_Sub1(aClass206_3776, renderer, ((Class329_Sub1) this).objectDefLoader, defs, plane, i, i_34_, i_33_, i_35_, aBool3786, orientation, bool));
							if (class521_sub1_sub3_sub1.method86(1102115730))
								class521_sub1_sub3_sub1.method87(renderer, -101230669);
							obj = class521_sub1_sub3_sub1;
						} else
							obj = (new GroundDecoration(aClass206_3776, renderer, ((Class329_Sub1) this).objectDefLoader, defs, plane, i, i_34_, i_33_, i_35_, aBool3786, orientation, animation));
						aClass206_3776.method3393(plane, localX, localY, obj, -1479943692);
						if (647396503 * defs.clipType == 1 && null != clipMap)
							clipMap.addBlockFloorDeco(localX, localY, 952601873);
					}
				} else if ((type == 1109376893 * SceneObjectType.SCENERY_INTERACT.type) || (SceneObjectType.GROUND_INTERACT.type * 1109376893 == type)) {
					Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = null;
					Class521_Sub1_Sub1 class521_sub1_sub1;
					int i_37_;
					if (bool_36_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_38_ = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, renderer, ((Class329_Sub1) this).objectDefLoader, defs, plane, i, i_34_, i_33_, i_35_, aBool3786, localX, i_27_ + localX - 1, localY, i_28_ + localY - 1, type, orientation, bool));
						i_37_ = class521_sub1_sub1_sub6_38_.method16115(1669328941);
						class521_sub1_sub1 = class521_sub1_sub1_sub6_38_;
						class521_sub1_sub1_sub6 = class521_sub1_sub1_sub6_38_;
					} else {
						class521_sub1_sub1 = (new InteractableObject(aClass206_3776, renderer, ((Class329_Sub1) this).objectDefLoader, defs, plane, i, i_34_, i_33_, i_35_, aBool3786, localX, i_27_ + localX - 1, localY, localY + i_28_ - 1, type, orientation, animation));
						i_37_ = 15;
					}
					if (aClass206_3776.method3397(class521_sub1_sub1, false, 1685535245)) {
						if (class521_sub1_sub1_sub6 != null && class521_sub1_sub1_sub6.method86(1742426135))
							class521_sub1_sub1_sub6.method87(renderer, -101230669);
						if (defs.aBool5657 && aBool3773) {
							if (i_37_ > 30)
								i_37_ = 30;
							for (int i_39_ = 0; i_39_ <= i_27_; i_39_++) {
								for (int i_40_ = 0; i_40_ <= i_28_; i_40_++)
									class390.LA(localX + i_39_, localY + i_40_, i_37_);
							}
						}
					}
					if (0 != 647396503 * defs.clipType && clipMap != null) {
						clipMap.addObject(localX, localY, i_27_, i_28_, defs.projectileClipped, !defs.ignoreClipOnAlternativeRoute, (byte) -99);
					}
				} else if (Class240.isRoof(type, -2013524019) || HitsplatDefinitions.method3849(type, 1006843265)) {
					Class521_Sub1_Sub1 class521_sub1_sub1;
					if (bool_36_) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = (new Class521_Sub1_Sub1_Sub6(aClass206_3776, renderer, ((Class329_Sub1) this).objectDefLoader, defs, plane, i, i_34_, i_33_, i_35_, aBool3786, localX, i_27_ + localX - 1, localY, i_28_ + localY - 1, type, orientation, bool));
						if (class521_sub1_sub1_sub6.method86(2126103199))
							class521_sub1_sub1_sub6.method87(renderer, -101230669);
						class521_sub1_sub1 = class521_sub1_sub1_sub6;
					} else
						class521_sub1_sub1 = (new InteractableObject(aClass206_3776, renderer, ((Class329_Sub1) this).objectDefLoader, defs, plane, i, i_34_, i_33_, i_35_, aBool3786, localX, localX + i_27_ - 1, localY, i_28_ + localY - 1, type, orientation, animation));
					aClass206_3776.method3397(class521_sub1_sub1, false, -83080800);
					if (aBool3773 && !aBool3786 && Class240.isRoof(type, -1226229167) && (1109376893 * SceneObjectType.DIAGONAL_SLOPE_ROOF.type != type) && plane > 0 && 0 != defs.anInt5656 * -1316444551)
						aByteArrayArrayArray3794[plane][localX][localY] |= 0x4;
					if (647396503 * defs.clipType != 0 && null != clipMap)
						clipMap.addObject(localX, localY, i_27_, i_28_, defs.projectileClipped, !defs.ignoreClipOnAlternativeRoute, (byte) -122);
				} else if (method12464(renderer, type, orientation, bool_36_, defs, animation, plane, i, i_34_, i_33_, i_35_, localX, localY, bool, class390, clipMap, i_27_, i_28_, -266687158) || method12465(renderer, type, orientation, bool_36_, defs, animation, plane, i, i_34_, i_33_, i_35_, localX, localY, 1825194331)) {
					/* empty */
				}
			}
		}
	}

	public final void method12460(GraphicalRenderer class505, RsByteBuffer class282_sub35, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
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
								Class416 class416 = (IndexLoaders.aClass436_7683.method7304(class282_sub35.readUnsignedShort(), (byte) -123));
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

	public final void method12461(GraphicalRenderer class505, byte[] is, int i, int i_74_, ClipMap[] class336s, int i_75_) {
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
					ClipMap class336 = null;
					if (!aBool3786) {
						int i_88_ = i_82_;
						if (((regionMap.tileMasks[1][i_86_][i_87_]) & 0x2) == 2)
							i_88_--;
						if (i_88_ >= 0)
							class336 = class336s[i_88_];
					}
					method12459(class505, i_82_, i_82_, i_86_, i_87_, i_76_, i_85_, i_84_, class336, -1, 2114561381);
				}
			}
		}
	}

	public final void method12462(GraphicalRenderer class505, byte[] is, int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, ClipMap[] class336s, int i_95_) {
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
					ObjectDefinitions class478 = ((Class329_Sub1) this).objectDefLoader.getObjectDefinitions(i_96_, 65280);
					int i_106_ = i_89_ + Class222.method3756(i_101_ & 0x7, i_100_ & 0x7, i_94_, (class478.anInt5648 * -752356381), (class478.anInt5649 * -1610844647), i_105_, (byte) 44);
					int i_107_ = (i_90_ + Class3.method282(i_101_ & 0x7, i_100_ & 0x7, i_94_, -752356381 * class478.anInt5648, class478.anInt5649 * -1610844647, i_105_, 1441497902));
					if (i_106_ > 0 && i_107_ > 0 && i_106_ < -1230013231 * anInt3784 - 1 && i_107_ < 2024737111 * anInt3785 - 1) {
						ClipMap class336 = null;
						if (!aBool3786) {
							int i_108_ = i;
							if (((regionMap.tileMasks[1][i_106_][i_107_]) & 0x2) == 2)
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

	public final void method12463(GraphicalRenderer class505, boolean bool, int i) {
		aClass206_3776.method3400();
		if (!bool) {
			if (1599084401 * anInt3845 > 1) {
				for (int i_109_ = 0; i_109_ < anInt3784 * -1230013231; i_109_++) {
					for (int i_110_ = 0; i_110_ < anInt3785 * 2024737111; i_110_++) {
						if (2 == ((regionMap.tileMasks[1][i_109_][i_110_]) & 0x2))
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

	boolean method12464(GraphicalRenderer class505, int i, int i_123_, boolean bool, ObjectDefinitions class478, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, boolean bool_132_, Class390 class390, ClipMap class336, int i_133_, int i_134_, int i_135_) {
		if (SceneObjectType.WALL_STRAIGHT.type * 1109376893 == i) {
			int i_136_ = class478.anInt5656 * -1316444551;
			if (aBool7714 && -1 == class478.anInt5656 * -1316444551)
				i_136_ = 1;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, bool_132_);
				if (class521_sub1_sub5_sub1.method86(2031686650))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Wall(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, i_124_);
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
			if (class478.clipType * 647396503 != 0 && null != class336)
				class336.method5971(i_130_, i_131_, i, i_123_, class478.projectileClipped, !class478.ignoreClipOnAlternativeRoute, 2114995928);
			if (class478.anInt5661 * -1085975425 != 64)
				aClass206_3776.method3398(i_125_, i_130_, i_131_, class478.anInt5661 * -1085975425, (byte) 45);
			return true;
		}
		if (i == 1109376893 * SceneObjectType.WALL_DIAGONAL_CORNER.type) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, bool_132_);
				if (class521_sub1_sub5_sub1.method86(186811932))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Wall(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, i_124_);
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
			if (0 != 647396503 * class478.clipType && class336 != null)
				class336.method5971(i_130_, i_131_, i, i_123_, class478.projectileClipped, !class478.ignoreClipOnAlternativeRoute, 2114995928);
			return true;
		}
		if (i == 1109376893 * SceneObjectType.WALL_WHOLE_CORNER.type) {
			int i_137_ = i_123_ + 1 & 0x3;
			Class521_Sub1_Sub5 class521_sub1_sub5;
			Class521_Sub1_Sub5 class521_sub1_sub5_138_;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, 4 + i_123_, bool_132_);
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_139_ = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_137_, bool_132_);
				if (class521_sub1_sub5_sub1.method86(1640390953))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				if (class521_sub1_sub5_sub1_139_.method86(119698496))
					class521_sub1_sub5_sub1_139_.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
				class521_sub1_sub5_138_ = class521_sub1_sub5_sub1_139_;
			} else {
				class521_sub1_sub5 = new Wall(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, 4 + i_123_, i_124_);
				class521_sub1_sub5_138_ = new Wall(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_137_, i_124_);
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
			if (class478.clipType * 647396503 != 0 && class336 != null)
				class336.method5971(i_130_, i_131_, i, i_123_, class478.projectileClipped, !class478.ignoreClipOnAlternativeRoute, 2114995928);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_125_, i_130_, i_131_, class478.anInt5661 * -1085975425, (byte) 58);
			return true;
		}
		if (SceneObjectType.WALL_STRAIGHT_CORNER.type * 1109376893 == i) {
			Class521_Sub1_Sub5 class521_sub1_sub5;
			if (bool) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = new Class521_Sub1_Sub5_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, bool_132_);
				if (class521_sub1_sub5_sub1.method86(88380172))
					class521_sub1_sub5_sub1.method87(class505, -101230669);
				class521_sub1_sub5 = class521_sub1_sub5_sub1;
			} else
				class521_sub1_sub5 = new Wall(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i, i_123_, i_124_);
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
			if (0 != class478.clipType * 647396503 && class336 != null)
				class336.method5971(i_130_, i_131_, i, i_123_, class478.projectileClipped, !class478.ignoreClipOnAlternativeRoute, 2114995928);
			return true;
		}
		if (i == 1109376893 * SceneObjectType.WALL_INTERACT.type) {
			Class521_Sub1_Sub1 class521_sub1_sub1;
			if (bool) {
				Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = new Class521_Sub1_Sub1_Sub6(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i_130_, i_130_, i_131_, i_131_, i, i_123_, bool_132_);
				if (class521_sub1_sub1_sub6.method86(336072278))
					class521_sub1_sub1_sub6.method87(class505, -101230669);
				class521_sub1_sub1 = class521_sub1_sub1_sub6;
			} else
				class521_sub1_sub1 = new InteractableObject(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_125_, i_126_, i_127_, i_128_, i_129_, aBool3786, i_130_, i_130_ + i_133_ - 1, i_131_, i_131_ + i_134_ - 1, i, i_123_, i_124_);
			aClass206_3776.method3397(class521_sub1_sub1, false, 1635515614);
			if (1 == -1316444551 * class478.anInt5656 && !aBool3786) {
				int i_140_;
				if (0 == (i_123_ & 0x1))
					i_140_ = 8;
				else
					i_140_ = 16;
				aClass206_3776.aClass201_2600.method3262(i_140_, i_125_, i_130_, i_131_, 523762221 * class478.anInt5684, 0);
			}
			if (647396503 * class478.clipType != 0 && class336 != null)
				class336.addObject(i_130_, i_131_, i_133_, i_134_, class478.projectileClipped, !class478.ignoreClipOnAlternativeRoute, (byte) -60);
			if (64 != -1085975425 * class478.anInt5661)
				aClass206_3776.method3398(i_125_, i_130_, i_131_, -1085975425 * class478.anInt5661, (byte) 81);
			return true;
		}
		return false;
	}

	boolean method12465(GraphicalRenderer class505, int i, int i_141_, boolean bool, ObjectDefinitions class478, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_) {
		if (1109376893 * SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type == i) {
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, i_141_);
				if (class521_sub1_sub4_sub1.method86(240231077))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = new WallDecoration(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, i_141_, i_142_);
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (SceneObjectType.STRAIGHT_OUSIDE_WALL_DEC.type * 1109376893 == i) {
			int i_151_ = 65;
			SceneObject interface12 = (SceneObject) aClass206_3776.getWall(i_143_, i_148_, i_149_, (byte) -117);
			if (null != interface12)
				i_151_ = ((((Class329_Sub1) this).objectDefLoader.getObjectDefinitions(interface12.getId(897339826), 65280).anInt5661) * -1085975425) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).objectDefLoader, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, anIntArray7724[i_141_] * i_151_, anIntArray7720[i_141_] * i_151_, i, i_141_));
				if (class521_sub1_sub4_sub1.method86(-1255760625))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = (new WallDecoration(aClass206_3776, class505, ((Class329_Sub1) this).objectDefLoader, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, i_151_ * anIntArray7724[i_141_], i_151_ * anIntArray7720[i_141_], i, i_141_, i_142_));
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (1109376893 * SceneObjectType.DIAGONAL_OUTSIDE_WALL_DEC.type == i) {
			int i_152_ = 33;
			SceneObject interface12 = (SceneObject) aClass206_3776.getWall(i_143_, i_148_, i_149_, (byte) -91);
			if (null != interface12)
				i_152_ = ((((Class329_Sub1) this).objectDefLoader.getObjectDefinitions(interface12.getId(-33334546), 65280).anInt5661) * -1085975425 / 2) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).objectDefLoader, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, i_152_ * anIntArray7724[i_141_], anIntArray7720[i_141_] * i_152_, i, 4 + i_141_));
				if (class521_sub1_sub4_sub1.method86(-716487834))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = (new WallDecoration(aClass206_3776, class505, ((Class329_Sub1) this).objectDefLoader, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, anIntArray7721[i_141_] * i_152_, anIntArray7713[i_141_] * i_152_, i, 4 + i_141_, i_142_));
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (1109376893 * SceneObjectType.DIAGONAL_INSIDE_WALL_DEC.type == i) {
			int i_153_ = i_141_ + 2 & 0x3;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, 4 + i_153_);
				if (class521_sub1_sub4_sub1.method86(1853694415))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
			} else
				class521_sub1_sub4 = new WallDecoration(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, 4 + i_153_, i_142_);
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, null, (byte) 13);
			return true;
		}
		if (SceneObjectType.DIAGONAL_INWALL_DEC.type * 1109376893 == i) {
			int i_154_ = i_141_ + 2 & 0x3;
			int i_155_ = 33;
			SceneObject interface12 = (SceneObject) aClass206_3776.getWall(i_143_, i_148_, i_149_, (byte) -3);
			if (null != interface12)
				i_155_ = ((((Class329_Sub1) this).objectDefLoader.getObjectDefinitions(interface12.getId(-824380403), 65280).anInt5661) * -1085975425 / 2) + 1;
			Class521_Sub1_Sub4 class521_sub1_sub4;
			Class521_Sub1_Sub4 class521_sub1_sub4_156_;
			if (bool) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1 = (new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, ((Class329_Sub1) this).objectDefLoader, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, i_155_ * anIntArray7721[i_141_], i_155_ * anIntArray7713[i_141_], i, i_141_ + 4));
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_157_ = new Class521_Sub1_Sub4_Sub1(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, 4 + i_154_);
				if (class521_sub1_sub4_sub1.method86(907345148))
					class521_sub1_sub4_sub1.method87(class505, -101230669);
				if (class521_sub1_sub4_sub1_157_.method86(1796803842))
					class521_sub1_sub4_sub1_157_.method87(class505, -101230669);
				class521_sub1_sub4 = class521_sub1_sub4_sub1;
				class521_sub1_sub4_156_ = class521_sub1_sub4_sub1_157_;
			} else {
				WallDecoration class521_sub1_sub4_sub2 = (new WallDecoration(aClass206_3776, class505, ((Class329_Sub1) this).objectDefLoader, class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, i_155_ * anIntArray7721[i_141_], i_155_ * anIntArray7713[i_141_], i, i_141_ + 4, i_142_));
				WallDecoration class521_sub1_sub4_sub2_158_ = new WallDecoration(aClass206_3776, class505, (((Class329_Sub1) this).objectDefLoader), class478, i_143_, i_144_, i_145_, i_146_, i_147_, aBool3786, 0, 0, i, 4 + i_154_, i_142_);
				class521_sub1_sub4 = class521_sub1_sub4_sub2;
				class521_sub1_sub4_156_ = class521_sub1_sub4_sub2_158_;
			}
			aClass206_3776.method3396(i_143_, i_148_, i_149_, class521_sub1_sub4, class521_sub1_sub4_156_, (byte) 13);
			return true;
		}
		return false;
	}

	SceneObject method12467(int i, int i_176_, int i_177_, int i_178_, int i_179_) {
		SceneObject interface12 = null;
		if (i_176_ == 0)
			interface12 = (SceneObject) aClass206_3776.getWall(i, i_177_, i_178_, (byte) -111);
		if (1 == i_176_)
			interface12 = (SceneObject) aClass206_3776.getWallDecoration(i, i_177_, i_178_, (byte) -56);
		if (2 == i_176_)
			interface12 = ((SceneObject) aClass206_3776.getInteractableObject(i, i_177_, i_178_, client.anInterface25_7446, -233664382));
		if (3 == i_176_)
			interface12 = (SceneObject) aClass206_3776.getGroundDecoration(i, i_177_, i_178_, -387297653);
		return interface12;
	}

	static {
		aBool7714 = false;
		anIntArray7724 = new int[] { 1, 0, -1, 0 };
		anIntArray7720 = new int[] { 0, -1, 0, 1 };
		anIntArray7721 = new int[] { 1, -1, -1, 1 };
		anIntArray7713 = new int[] { -1, -1, 1, 1 };
	}

	public final void method12471(GraphicalRenderer class505, RsByteBuffer class282_sub35, int i, int i_238_, int i_239_) {
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
								Class416 class416 = (IndexLoaders.aClass436_7683.method7304(class282_sub35.readUnsignedShort(), (byte) 56));
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

	void method12475(GraphicalRenderer class505, int i, int i_287_, int i_288_, int i_289_, ClipMap class336, int i_290_) {
		SceneObject interface12 = method12467(i, i_287_, i_288_, i_289_, 1923565825);
		if (interface12 != null) {
			ObjectDefinitions class478 = ((Class329_Sub1) this).objectDefLoader.getObjectDefinitions(interface12.getId(-289246828), 65280);
			int i_291_ = interface12.method89(1128699312);
			int i_292_ = interface12.method92(-2000294676);
			if (class478.method7974(1930590252))
				Class256.method4415(i, i_288_, i_289_, class478, 522913859);
			if (interface12.method86(1202983458))
				interface12.method88(class505, -1655574800);
			if (0 == i_287_) {
				aClass206_3776.method3422(i, i_288_, i_289_, (short) 255);
				aClass206_3776.method3460(i, i_288_, i_289_, (byte) 8);
				if (647396503 * class478.clipType != 0)
					class336.method5992(i_288_, i_289_, i_291_, i_292_, class478.projectileClipped, !class478.ignoreClipOnAlternativeRoute, (byte) -22);
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
				if (0 != 647396503 * class478.clipType && (-752356381 * class478.anInt5648 + i_288_ < -1230013231 * anInt3784) && (i_289_ + class478.anInt5648 * -752356381 < 2024737111 * anInt3785) && (i_288_ + -1610844647 * class478.anInt5649 < anInt3784 * -1230013231) && (i_289_ + class478.anInt5649 * -1610844647 < anInt3785 * 2024737111))
					class336.method5970(i_288_, i_289_, -752356381 * class478.anInt5648, -1610844647 * class478.anInt5649, i_292_, class478.projectileClipped, !class478.ignoreClipOnAlternativeRoute, -1842935337);
				if (i_291_ == SceneObjectType.WALL_INTERACT.type * 1109376893) {
					if (0 == (i_292_ & 0x1))
						aClass206_3776.aClass201_2600.method3297(8, i, i_288_, i_289_);
					else
						aClass206_3776.aClass201_2600.method3297(16, i, i_288_, i_289_);
				}
			} else if (i_287_ == 3) {
				aClass206_3776.method3404(i, i_288_, i_289_, 249816167);
				if (647396503 * class478.clipType == 1)
					class336.method5991(i_288_, i_289_, (byte) 0);
			}
		}
	}

	public Class329_Sub1(SceneObjectManager class206, ObjectIndexLoader class474, int i, int i_479_, int i_480_, boolean bool, RegionMap class311, Class239 class239) {
		super(class206, i, i_479_, i_480_, bool, IndexLoaders.aClass536_1535, IndexLoaders.UNDERLAY_INDEX_LOADER, class311);
		((Class329_Sub1) this).objectDefLoader = class474;
		((Class329_Sub1) this).aClass239_7719 = class239;
	}

	public static void method12491(Player class521_sub1_sub1_sub2_sub1, int i, int i_555_, byte i_556_) {
		int[] is = new int[Class8_Sub3.method14339(439477133).length];
		Arrays.fill(is, 0, is.length, i);
		Class20.animate(class521_sub1_sub1_sub2_sub1, is, i_555_, false, (byte) -11);
	}

	static final void method12492(CS2Executor class527, byte i) {
		int i_557_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_557_, (byte) 117);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_557_ >> 16];
		Class463.method7729(class118, class98, class527, 1544396395);
	}
}
