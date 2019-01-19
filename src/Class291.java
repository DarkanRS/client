
/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Class291 {
	static byte[] aByteArray3453;
	protected static int anInt3454;
	protected static ObjectIndexLoader aClass474_3455;
	protected static WorldMapIndexLoader aClass218_3456;
	protected static Class427 aClass427_3457;
	protected static Interface42 anInterface42_3458;
	protected static NodeCollection aClass482_3459;
	protected static Index aClass317_3460;
	static IterableNodeMap aClass465_3461 = new IterableNodeMap(16);
	public static float aFloat3462;
	protected static int anInt3463;
	protected static byte[][][] aByteArrayArrayArray3464;
	protected static int anInt3465;
	static int[] anIntArray3466;
	static byte[] aByteArray3467;
	public static float aFloat3468;
	protected static int anInt3469;
	protected static Class283 aClass283_3470;
	static UnderlayIndexLoader UNDERLAY_DEF_LOADER;
	public static int anInt3472;
	public static int anInt3473;
	protected static int xLength;
	static byte[] aByteArray3475;
	protected static int anInt3476;
	static byte[] underlayData;
	static byte[] rgbColors;
	static short[] aShortArray3479;
	protected static int anInt3480;
	static int[] anIntArray3481;
	static Class536 aClass536_3482;
	protected static int yLength;
	static ArrayList[][][] anArrayListArrayArrayArray3484;
	protected static int anInt3485;
	protected static int anInt3486;
	static byte[] aByteArray3487;
	static Object[] anObjectArray3488;
	protected static int anInt3489;
	protected static int anInt3490;
	public static Class282_Sub50_Sub6 aClass282_Sub50_Sub6_3491;
	protected static int anInt3492;

	public static void method5125(Index class317, Class536 class536, UnderlayIndexLoader class479, ObjectIndexLoader class474, WorldMapIndexLoader class218, Class427 class427, Interface42 interface42) {
		aClass317_3460 = class317;
		aClass536_3482 = class536;
		UNDERLAY_DEF_LOADER = class479;
		aClass474_3455 = class474;
		aClass218_3456 = class218;
		aClass427_3457 = class427;
		anInterface42_3458 = interface42;
		aClass465_3461.method7749(1876923510);
		int i = aClass317_3460.getArchiveId("details", -1007791865);
		int[] is = aClass317_3460.method5616(i, -1005488286);
		if (is != null) {
			for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
				Class282_Sub50_Sub6 class282_sub50_sub6 = Class52.method1087(aClass317_3460, i, is[i_3_], 1237767362);
				aClass465_3461.method7765(class282_sub50_sub6, (long) (class282_sub50_sub6.anInt9536 * 1864297169));
			}
		}
		Class38.method854(true, false, -1938566313);
	}

	static void method5126() {
		underlayData = new byte[xLength * yLength];
		aByteArray3453 = new byte[xLength * yLength];
		aByteArray3487 = new byte[xLength * yLength];
		anObjectArray3488 = new Object[xLength * yLength];
		aByteArray3475 = new byte[xLength * yLength];
		anArrayListArrayArrayArray3484 = new ArrayList[3][xLength >> 6][yLength >> 6];
		anIntArray3481 = new int[aClass536_3482.anInt7094 * -389534115 + 1];
	}

	public static Class477 method5127(int i, int i_4_) {
		Class477 class477 = new Class477();
		for (Class282_Sub50_Sub6 class282_sub50_sub6 = (Class282_Sub50_Sub6) aClass465_3461.method7750(1631315315); class282_sub50_sub6 != null; class282_sub50_sub6 = ((Class282_Sub50_Sub6) aClass465_3461.method7751((byte) 13))) {
			if (((Class282_Sub50_Sub6) class282_sub50_sub6).aBool9543 && class282_sub50_sub6.method14784(i, i_4_, 2036854357))
				class477.method7936(class282_sub50_sub6, -1738910950);
		}
		return class477;
	}

	static void method5128(int i) {
		aClass282_Sub50_Sub6_3491 = (Class282_Sub50_Sub6) aClass465_3461.method7754((long) i);
	}

	public static Class282_Sub50_Sub6 method5130(int i) {
		return (Class282_Sub50_Sub6) aClass465_3461.method7754((long) i);
	}

	static void renderMap(GraphicalRenderer renderer, int i, int i_6_, int i_7_, int i_8_) {
		int i_9_ = anInt3480 - anInt3485;
		int i_10_ = anInt3486 - anInt3465;
		if (anInt3480 < xLength)
			i_9_++;
		if (anInt3486 < yLength)
			i_10_++;
		for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
			int i_12_ = (i_7_ + i * i_11_ >> 16) + anInt3489;
			int i_13_ = (i_7_ + i * (i_11_ + 1) >> 16) + anInt3489;
			int i_14_ = i_13_ - i_12_;
			if (i_14_ > 0) {
				int i_15_ = anInt3485 + i_11_;
				if (i_15_ < 0 || i_15_ >= xLength) {
					for (int i_16_ = 0; i_16_ < i_10_; i_16_++) {
						int i_17_ = anInt3492 - (i_8_ + i_6_ * (i_16_ + 1) >> 16);
						int i_18_ = anInt3492 - (i_8_ + i_6_ * i_16_ >> 16);
						int i_19_ = i_18_ - i_17_;
						int i_20_;
						if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661 != -1)
							i_20_ = ~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661;
						else if ((i_11_ + anInt3485 & 0x4) != (i_16_ + anInt3486 & 0x4))
							i_20_ = -11840664;
						else
							i_20_ = anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1];
						if (i_20_ == 0)
							i_20_ = -16777216;
						renderer.B(i_12_, i_17_, i_14_, i_19_, i_20_, 0);
					}
				} else {
					for (int i_21_ = 0; i_21_ < i_10_; i_21_++) {
						int i_22_ = anInt3492 - (i_8_ + i_6_ * (i_21_ + 1) >> 16);
						int i_23_ = anInt3492 - (i_8_ + i_6_ * i_21_ >> 16);
						int i_24_ = i_23_ - i_22_;
						if (i_24_ > 0) {
							int i_25_ = i_21_ + anInt3465;
							int i_26_ = i_15_ + i_25_ * xLength;
							int i_27_ = 0;
							int i_28_ = 0;
							Object object = null;
							if (i_25_ >= 0 && i_25_ < yLength) {
								i_27_ = ((rgbColors[i_26_] & 0xff) << 16 | aShortArray3479[i_26_] & 0xffff);
								if (i_27_ != 0)
									i_27_ |= ~0xffffff;
								i_28_ = aByteArray3453[i_26_] & 0xff;
								object = anObjectArray3488[i_26_];
							}
							if (i_27_ == 0 && i_28_ == 0 && object == null) {
								if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538 * 1561906661) != -1)
									i_27_ = (~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661);
								else if ((i_11_ + anInt3485 & 0x4) != (i_21_ + anInt3486 & 0x4))
									i_27_ = -11840664;
								else
									i_27_ = (anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1]);
								if (i_27_ == 0)
									i_27_ = -16777216;
								renderer.B(i_12_, i_22_, i_14_, i_24_, i_27_, 0);
							} else if (object != null) {
								if (object instanceof Class282_Sub49) {
									Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
									if (class282_sub49 != null)
										renderUnderlay(renderer, i_12_, i_22_, i_14_, i_24_, i_27_, i_28_, aByteArray3487[i_26_], (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108), true);
								} else {
									Integer integer = (Integer) object;
									anIntArray3466[0] = integer.intValue();
									aByteArray3467[0] = aByteArray3475[i_26_];
									//render walls of objects
									renderUnderlay(renderer, i_12_, i_22_, i_14_, i_24_, i_27_, i_28_, aByteArray3487[i_26_], anIntArray3466, aByteArray3467, true);
								}
							} else {
								//render floor
								renderUnderlay(renderer, i_12_, i_22_, i_14_, i_24_, i_27_, i_28_, aByteArray3487[i_26_], null, null, true);
							}
						}
					}
				}
			}
		}
		//Render objects sprites
		for (int i_29_ = -16; i_29_ < i_9_ + 16; i_29_++) {
			int i_30_ = (i_7_ + i * i_29_ >> 16) + anInt3489;
			int i_31_ = (i_7_ + i * (i_29_ + 1) >> 16) + anInt3489;
			int i_32_ = i_31_ - i_30_;
			if (i_32_ > 0) {
				int i_33_ = i_29_ + anInt3485;
				if (i_33_ >= 0 && i_33_ < xLength) {
					for (int i_34_ = -16; i_34_ < i_10_ + 16; i_34_++) {
						int i_35_ = anInt3492 - (i_8_ + i_6_ * (i_34_ + 1) >> 16);
						int i_36_ = anInt3492 - (i_8_ + i_6_ * i_34_ >> 16);
						int i_37_ = i_36_ - i_35_;
						if (i_37_ > 0) {
							int i_38_ = i_34_ + anInt3465;
							if (i_38_ >= 0 && i_38_ < yLength) {
								Object object = (anObjectArray3488[i_33_ + i_38_ * xLength]);
								if (object != null) {
									if (object instanceof Class282_Sub49) {
										Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
										if (class282_sub49 != null)
											renderObjectSprites(renderer, i_30_, i_35_, i_32_, i_37_, (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108));
									} else {
										Integer integer = (Integer) object;
										anIntArray3466[0] = integer.intValue();
										aByteArray3467[0] = (aByteArray3475[i_33_ + i_38_ * xLength]);
										renderObjectSprites(renderer, i_30_, i_35_, i_32_, i_37_, anIntArray3466, aByteArray3467);
									}
								} else {
									renderObjectSprites(renderer, i_30_, i_35_, i_32_, i_37_, null, null);
								}
							}
						}
					}
				}
			}
		}
		int i_39_ = anInt3485 >> 6;
		int i_40_ = anInt3465 >> 6;
		if (i_39_ < 0)
			i_39_ = 0;
		if (i_40_ < 0)
			i_40_ = 0;
		int i_41_ = anInt3480 >> 6;
		int i_42_ = anInt3486 >> 6;
		if (i_41_ >= anArrayListArrayArrayArray3484[0].length)
			i_41_ = anArrayListArrayArrayArray3484[0].length - 1;
		if (i_42_ >= anArrayListArrayArrayArray3484[0][0].length)
			i_42_ = anArrayListArrayArrayArray3484[0][0].length - 1;
		for (int i_43_ = 0; i_43_ < 3; i_43_++) {
			for (int i_44_ = i_39_; i_44_ <= i_41_; i_44_++) {
				for (int i_45_ = i_40_; i_45_ <= i_42_; i_45_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3484[i_43_][i_44_][i_45_];
					if (arraylist != null) {
						int i_46_ = (i_44_ + (anInt3472 >> 6)) * 64;
						int i_47_ = (i_45_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_48_ = (i_46_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_49_ = (i_47_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_50_ = (i_7_ + i * i_48_ >> 16) + anInt3489;
							int i_51_ = (i_7_ + i * (i_48_ + 1) >> 16) + anInt3489;
							int i_52_ = (anInt3492 - (i_8_ + i_6_ * (i_49_ + 1) >> 16));
							int i_53_ = anInt3492 - (i_8_ + i_6_ * i_49_ >> 16);
							renderUnderlay(renderer, i_50_, i_52_, i_51_ - i_50_, i_53_ - i_52_, ((Class269) class269).anInt3310, ((Class269) class269).aByte3308 & 0xff, ((Class269) class269).aByte3312, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314, false);
						}
					}
				}
			}
			for (int i_54_ = i_39_; i_54_ <= i_41_; i_54_++) {
				for (int i_55_ = i_40_; i_55_ <= i_42_; i_55_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3484[i_43_][i_54_][i_55_];
					if (arraylist != null) {
						int i_56_ = (i_54_ + (anInt3472 >> 6)) * 64;
						int i_57_ = (i_55_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_58_ = (i_56_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_59_ = (i_57_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_60_ = (i_7_ + i * i_58_ >> 16) + anInt3489;
							int i_61_ = (i_7_ + i * (i_58_ + 1) >> 16) + anInt3489;
							int i_62_ = (anInt3492 - (i_8_ + i_6_ * (i_59_ + 1) >> 16));
							int i_63_ = anInt3492 - (i_8_ + i_6_ * i_59_ >> 16);
							renderObjectSprites(renderer, i_60_, i_62_, i_61_ - i_60_, i_63_ - i_62_, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314);
						}
					}
				}
			}
		}
	}

	static void method5132(Interface22 interface22, int i, int i_64_) {
		for (int i_65_ = 0; i_65_ < aClass536_3482.anInt7094 * -389534115; i_65_++)
			anIntArray3481[i_65_ + 1] = method5164(interface22, i_65_, i, i_64_);
	}

	static NodeCollection method5135(GraphicalRenderer class505) {
		int i = anInt3480 - anInt3485;
		int i_70_ = anInt3486 - anInt3465;
		int i_71_ = (anInt3476 - anInt3489 << 16) / i;
		int i_72_ = (anInt3492 - anInt3490 << 16) / i_70_;
		return method5179(class505, i_71_, i_72_, 0, 0);
	}

	static void method5136() {
		for (int i = 0; i < xLength; i++) {
			for (int i_73_ = 0; i_73_ < yLength; i_73_++) {
				Object object = anObjectArray3488[i + i_73_ * xLength];
				if (object != null) {
					if (object instanceof Class282_Sub49) {
						Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
						if (class282_sub49 != null) {
							for (int i_74_ = 0; i_74_ < (((Class282_Sub49) class282_sub49).anIntArray8109).length; i_74_++) {
								ObjectDefinitions class478 = (aClass474_3455.getObjectDefinitions((((Class282_Sub49) class282_sub49).anIntArray8109[i_74_]), 65280));
								int i_75_ = class478.anInt5669 * -1796959211;
								if (class478.anIntArray5650 != null) {
									class478 = (class478.method8013(anInterface42_3458, (byte) -58));
									if (class478 != null)
										i_75_ = class478.anInt5669 * -1796959211;
								}
								if (i_75_ != -1) {
									Class282_Sub36 class282_sub36 = new Class282_Sub36(i_75_);
									class282_sub36.anInt7987 = i * -1063198059;
									class282_sub36.anInt7993 = i_73_ * -992271721;
									aClass482_3459.append(class282_sub36, 1134203078);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						ObjectDefinitions class478 = aClass474_3455.getObjectDefinitions(integer.intValue(), 65280);
						int i_76_ = class478.anInt5669 * -1796959211;
						if (class478.anIntArray5650 != null) {
							class478 = class478.method8013(anInterface42_3458, (byte) 19);
							if (class478 != null)
								i_76_ = class478.anInt5669 * -1796959211;
						}
						if (i_76_ != -1) {
							Class282_Sub36 class282_sub36 = new Class282_Sub36(i_76_);
							class282_sub36.anInt7987 = i * -1063198059;
							class282_sub36.anInt7993 = i_73_ * -992271721;
							aClass482_3459.append(class282_sub36, 1465536592);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_77_ = 0; i_77_ < anArrayListArrayArrayArray3484[0].length; i_77_++) {
				for (int i_78_ = 0; i_78_ < anArrayListArrayArrayArray3484[0][0].length; i_78_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3484[i][i_77_][i_78_];
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							if (((Class269) class269).anIntArray3313 != null) {
								for (int i_79_ = 0; i_79_ < (((Class269) class269).anIntArray3313).length; i_79_++) {
									ObjectDefinitions class478 = (aClass474_3455.getObjectDefinitions((((Class269) class269).anIntArray3313[i_79_]), 65280));
									int i_80_ = class478.anInt5669 * -1796959211;
									if (class478.anIntArray5650 != null) {
										class478 = (class478.method8013(anInterface42_3458, (byte) -18));
										if (class478 != null)
											i_80_ = (class478.anInt5669 * -1796959211);
									}
									if (i_80_ != -1) {
										Class282_Sub36 class282_sub36 = new Class282_Sub36(i_80_);
										class282_sub36.anInt7987 = ((i_77_ + (anInt3472 >> 6)) * 64 + (((Class269) class269).aByte3311) - anInt3472) * -1063198059;
										class282_sub36.anInt7993 = ((i_78_ + (anInt3473 >> 6)) * 64 + (((Class269) class269).aByte3309) - anInt3473) * -992271721;
										aClass482_3459.append(class282_sub36, 1835494095);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method5137() {
		underlayData = null;
		rgbColors = null;
		aShortArray3479 = null;
		aByteArray3453 = null;
		aByteArray3487 = null;
		anObjectArray3488 = null;
		aByteArray3475 = null;
		anArrayListArrayArrayArray3484 = null;
		anIntArray3481 = null;
	}

	static void method5139(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_) {
		anInt3485 = i - anInt3472;
		anInt3486 = i_84_ - anInt3473;
		anInt3480 = i_85_ - anInt3472;
		anInt3465 = i_86_ - anInt3473;
		anInt3489 = i_87_;
		anInt3490 = i_88_;
		anInt3476 = i_89_;
		anInt3492 = i_90_;
	}

	static void renderUnderlay(GraphicalRenderer class505, int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int[] is, byte[] is_102_, boolean bool) {
		if (bool || i_99_ != 0 || i_100_ > 0) {
			if (i_100_ == 0)
				class505.B(i, i_96_, i_97_, i_98_, i_99_, 0);
			else {
				int i_103_ = i_101_ & 0x3f;
				if (i_103_ == 0 || i_97_ <= 1 || i_98_ <= 1) {
					int i_104_ = anIntArray3481[i_100_];
					if (bool || i_104_ != 0)
						class505.B(i, i_96_, i_97_, i_98_, i_104_, 0);
				} else {
					int i_105_ = bool ? 0 : 1;
					LoadingStage.method6686(class505, aByteArrayArrayArray3464, anInt3469, i, i_96_, i_99_, anIntArray3481[i_100_], i_97_, i_98_, i_103_, i_101_ >> 6 & 0x3, i_105_, -778426083);
				}
			}
		}
		if (is != null) {
			int i_106_;
			if (i_97_ == 1)
				i_106_ = i;
			else
				i_106_ = i + i_97_ - 1;
			int i_107_;
			if (i_98_ == 1)
				i_107_ = i_96_;
			else
				i_107_ = i_96_ + i_98_ - 1;
			for (int i_108_ = 0; i_108_ < is.length; i_108_++) {
				int i_109_ = is_102_[i_108_] & 0x3f;
				if (i_109_ == SceneObjectType.WALL_STRAIGHT.type * 1109376893 || i_109_ == SceneObjectType.WALL_WHOLE_CORNER.type * 1109376893 || i_109_ == SceneObjectType.WALL_STRAIGHT_CORNER.type * 1109376893 || (i_109_ == SceneObjectType.WALL_INTERACT.type * 1109376893)) {
					ObjectDefinitions class478 = aClass474_3455.getObjectDefinitions(is[i_108_], 65280);
					if (class478.anInt5689 * -272332433 == -1) {
						int i_110_ = -3355444;
						if (class478.anInt5652 * -348507379 == 1)
							i_110_ = -3407872;
						int i_111_ = is_102_[i_108_] >> 6 & 0x3;
						if (i_109_ == (SceneObjectType.WALL_STRAIGHT.type * 1109376893)) {
							if (i_111_ == 0)
								class505.G(i, i_96_, i_98_, i_110_, 0);
							else if (i_111_ == 1)
								class505.XA(i, i_96_, i_97_, i_110_, 0);
							else if (i_111_ == 2)
								class505.G(i_106_, i_96_, i_98_, i_110_, 0);
							else
								class505.XA(i, i_107_, i_97_, i_110_, 0);
						} else if (i_109_ == (SceneObjectType.WALL_WHOLE_CORNER.type * 1109376893)) {
							if (i_111_ == 0) {
								class505.G(i, i_96_, i_98_, -1, 0);
								class505.XA(i, i_96_, i_97_, i_110_, 0);
							} else if (i_111_ == 1) {
								class505.G(i_106_, i_96_, i_98_, -1, 0);
								class505.XA(i, i_96_, i_97_, i_110_, 0);
							} else if (i_111_ == 2) {
								class505.G(i_106_, i_96_, i_98_, -1, 0);
								class505.XA(i, i_107_, i_97_, i_110_, 0);
							} else {
								class505.G(i, i_96_, i_98_, -1, 0);
								class505.XA(i, i_107_, i_97_, i_110_, 0);
							}
						} else if (i_109_ == (SceneObjectType.WALL_STRAIGHT_CORNER.type * 1109376893)) {
							if (i_111_ == 0)
								class505.XA(i, i_96_, 1, i_110_, 0);
							else if (i_111_ == 1)
								class505.XA(i_106_, i_96_, 1, i_110_, 0);
							else if (i_111_ == 2)
								class505.XA(i_106_, i_107_, 1, i_110_, 0);
							else
								class505.XA(i, i_107_, 1, i_110_, 0);
						} else if (i_109_ == (SceneObjectType.WALL_INTERACT.type * 1109376893)) {
							if (i_111_ == 0 || i_111_ == 2) {
								for (int i_112_ = 0; i_112_ < i_98_; i_112_++)
									class505.XA(i + i_112_, i_107_ - i_112_, 1, i_110_, 0);
							} else {
								for (int i_113_ = 0; i_113_ < i_98_; i_113_++)
									class505.XA(i + i_113_, i_96_ + i_113_, 1, i_110_, 0);
							}
						}
					}
				}
			}
		}
	}

	static void method5145() {
		int[] is = new int[3];
		for (int i = 0; i < aClass283_3470.anInt3382 * -361490119; i++) {
			boolean bool = (aClass282_Sub50_Sub6_3491.method14778(aClass283_3470.anIntArray3381[i] >> 28 & 0x3, aClass283_3470.anIntArray3381[i] >> 14 & 0x3fff, aClass283_3470.anIntArray3381[i] & 0x3fff, is, -1151155270));
			if (bool) {
				Class282_Sub36 class282_sub36 = new Class282_Sub36(aClass283_3470.anIntArray3383[i]);
				class282_sub36.anInt7987 = (is[1] - anInt3472) * -1063198059;
				class282_sub36.anInt7993 = (is[2] - anInt3473) * -992271721;
				aClass482_3459.append(class282_sub36, -466469405);
			}
		}
	}

	static void method5146(GraphicalRenderer class505, Class282_Sub36 class282_sub36, int i, int i_133_, int i_134_, int i_135_) {
		class282_sub36.anInt7990 = (anInt3489 + (i_134_ + i * (class282_sub36.anInt7987 * -1306535747 - anInt3485) >> 16)) * -1316454393;
		class282_sub36.anInt7992 = (anInt3492 - (i_135_ + i_133_ * (class282_sub36.anInt7993 * 1012301095 - anInt3465) >> 16)) * -1541159585;
	}

	static void method5147(GraphicalRenderer class505, Class282_Sub36 class282_sub36, WorldMapAreaDefs class220) {
		if (class220.anIntArray2717 != null) {
			int[] is = new int[class220.anIntArray2717.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_136_ = (class220.anIntArray2717[i * 2] + class282_sub36.anInt7987 * -1306535747);
				int i_137_ = (class220.anIntArray2717[i * 2 + 1] + class282_sub36.anInt7993 * 1012301095);
				is[i * 2] = anInt3489 + ((anInt3476 - anInt3489) * (i_136_ - anInt3485) / (anInt3480 - anInt3485));
				is[i * 2 + 1] = anInt3492 - ((anInt3492 - anInt3490) * (i_137_ - anInt3465) / (anInt3486 - anInt3465));
			}
			Class147.method2471(class505, is, class220.anInt2715 * 152819427);
			if (class220.anInt2748 * -1216326857 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_138_ = is[i * 2];
					int i_139_ = is[i * 2 + 1];
					int i_140_ = is[(i + 1) * 2];
					int i_141_ = is[(i + 1) * 2 + 1];
					if (i_140_ < i_138_) {
						int i_142_ = i_138_;
						int i_143_ = i_139_;
						i_138_ = i_140_;
						i_139_ = i_141_;
						i_140_ = i_142_;
						i_141_ = i_143_;
					} else if (i_140_ == i_138_ && i_141_ < i_139_) {
						int i_144_ = i_139_;
						i_139_ = i_141_;
						i_141_ = i_144_;
					}
					class505.method8435(i_138_, i_139_, i_140_, i_141_, (class220.anIntArray2738[class220.aByteArray2754[i] & 0xff]), 1, class220.anInt2748 * -1216326857, class220.anInt2749 * 1940337227, class220.anInt2756 * -155138445);
				}
				int i = is[is.length - 2];
				int i_145_ = is[is.length - 1];
				int i_146_ = is[0];
				int i_147_ = is[1];
				if (i_146_ < i) {
					int i_148_ = i;
					int i_149_ = i_145_;
					i = i_146_;
					i_145_ = i_147_;
					i_146_ = i_148_;
					i_147_ = i_149_;
				} else if (i_146_ == i && i_147_ < i_145_) {
					int i_150_ = i_145_;
					i_145_ = i_147_;
					i_147_ = i_150_;
				}
				class505.method8435(i, i_145_, i_146_, i_147_, (class220.anIntArray2738[((class220.aByteArray2754[class220.aByteArray2754.length - 1]) & 0xff)]), 1, class220.anInt2748 * -1216326857, class220.anInt2749 * 1940337227, class220.anInt2756 * -155138445);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class505.method8429(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class220.anIntArray2738[class220.aByteArray2754[i] & 0xff]), (byte) 46);
				class505.method8429(is[is.length - 2], is[is.length - 1], is[0], is[1], (class220.anIntArray2738[((class220.aByteArray2754[class220.aByteArray2754.length - 1]) & 0xff)]), (byte) 3);
			}
		}
	}

	static {
		anInt3454 = (int) (Math.random() * 11.0) - 5;
		anInt3463 = (int) (Math.random() * 17.0) - 8;
		anIntArray3466 = new int[1];
		aByteArray3467 = new byte[1];
		aClass482_3459 = new NodeCollection();
	}

	Class291() throws Throwable {
		throw new Error();
	}

	static void method5162(GraphicalRenderer class505, RsByteBuffer class282_sub35, int i, int i_206_, int i_207_, int i_208_, int[] is, int[] is_209_) {
		int i_210_ = class282_sub35.readUnsignedByte();
		if ((i_210_ & 0x1) == 0) {
			boolean bool = (i_210_ & 0x2) == 0;
			int i_211_ = i_210_ >> 2 & 0x3f;
			if (i_211_ != 62) {
				if (i_211_ == 63)
					i_211_ = class282_sub35.readUnsignedByte();
				else if (bool)
					i_211_ = is[i_211_];
				else
					i_211_ = is_209_[i_211_];
				if (bool) {
					underlayData[i_207_ + i_208_ * xLength] = (byte) i_211_;
					aByteArray3453[i_207_ + i_208_ * xLength] = (byte) 0;
				} else {
					aByteArray3453[i_207_ + i_208_ * xLength] = (byte) i_211_;
					aByteArray3487[i_207_ + i_208_ * xLength] = (byte) 0;
					underlayData[i_207_ + i_208_ * xLength] = class282_sub35.readByte();
				}
			}
		} else {
			int i_212_ = (i_210_ >> 1 & 0x3) + 1;
			boolean bool = (i_210_ & 0x8) != 0;
			boolean bool_213_ = (i_210_ & 0x10) != 0;
			for (int i_214_ = 0; i_214_ < i_212_; i_214_++) {
				int i_215_ = class282_sub35.readUnsignedByte();
				int i_216_ = 0;
				int i_217_ = 0;
				if (bool) {
					i_216_ = class282_sub35.readUnsignedByte();
					i_217_ = class282_sub35.readUnsignedByte();
				}
				int i_218_ = 0;
				if (bool_213_)
					i_218_ = class282_sub35.readUnsignedByte();
				if (i_214_ == 0) {
					underlayData[i_207_ + i_208_ * xLength] = (byte) i_215_;
					aByteArray3453[i_207_ + i_208_ * xLength] = (byte) i_216_;
					aByteArray3487[i_207_ + i_208_ * xLength] = (byte) i_217_;
					if (i_218_ == 1) {
						anObjectArray3488[i_207_ + i_208_ * xLength] = new Integer(class282_sub35.readBigSmart());
						aByteArray3475[i_207_ + i_208_ * xLength] = class282_sub35.readByte();
					} else if (i_218_ > 1) {
						int[] is_219_ = new int[i_218_];
						byte[] is_220_ = new byte[i_218_];
						for (int i_221_ = 0; i_221_ < i_218_; i_221_++) {
							is_219_[i_221_] = class282_sub35.readBigSmart();
							is_220_[i_221_] = class282_sub35.readByte();
						}
						anObjectArray3488[i_207_ + i_208_ * xLength] = new Class282_Sub49(is_219_, is_220_);
					}
				} else {
					int[] is_222_ = null;
					byte[] is_223_ = null;
					if (i_218_ > 0) {
						is_222_ = new int[i_218_];
						is_223_ = new byte[i_218_];
						for (int i_224_ = 0; i_224_ < i_218_; i_224_++) {
							is_222_[i_224_] = class282_sub35.readBigSmart();
							is_223_[i_224_] = class282_sub35.readByte();
						}
					}
					if ((anArrayListArrayArrayArray3484[i_214_ - 1][i - (anInt3472 >> 6)][i_206_ - (anInt3473 >> 6)]) == null)
						anArrayListArrayArrayArray3484[i_214_ - 1][i - (anInt3472 >> 6)][i_206_ - (anInt3473 >> 6)] = new ArrayList();
					Class269 class269 = new Class269(i_207_ & 0x3f, i_208_ & 0x3f, i_215_, i_216_, i_217_, is_222_, is_223_);
					anArrayListArrayArrayArray3484[i_214_ - 1][i - (anInt3472 >> 6)][i_206_ - (anInt3473 >> 6)].add(class269);
				}
			}
		}
	}
	
	static int method5164(Interface22 interface22, int i, int i_252_, int i_253_) {
		OverlayDef class531 = aClass536_3482.method11475(i, (byte) 0);
		if (class531 == null)
			return 0;
		int i_254_ = class531.texture * 1717409107;
		if (i_254_ >= 0 && interface22.method144(i_254_, -1948706533).aBool2056)
			i_254_ = -1;
		int i_255_;
		if (class531.col1 * -848345857 >= 0) {
			int i_256_ = class531.col1 * -848345857;
			int i_257_ = (i_256_ & 0x7f) + i_253_;
			if (i_257_ < 0)
				i_257_ = 0;
			else if (i_257_ > 127)
				i_257_ = 127;
			int i_258_ = (i_256_ + i_252_ & 0xfc00) + (i_256_ & 0x380) + i_257_;
			i_255_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162(i_258_, 96, (byte) -73), 475535484) & 0xffff]));
		} else if (i_254_ >= 0)
			i_255_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162((interface22.method144(i_254_, -1979012450).aShort2073), 96, (byte) -53), 390293203) & 0xffff]));
		else if (class531.col0 * 1419498143 == -1)
			i_255_ = 0;
		else {
			int i_259_ = class531.col0 * 1419498143;
			int i_260_ = (i_259_ & 0x7f) + i_253_;
			if (i_260_ < 0)
				i_260_ = 0;
			else if (i_260_ > 127)
				i_260_ = 127;
			int i_261_ = (i_259_ + i_252_ & 0xfc00) + (i_259_ & 0x380) + i_260_;
			i_255_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162(i_261_, 96, (byte) -9), 941984440) & 0xffff]));
		}
		return i_255_;
	}

	static void renderObjectSprites(GraphicalRenderer class505, int i, int i_262_, int i_263_, int i_264_, int[] is, byte[] is_265_) {
		if (is != null) {
			for (int i_266_ = 0; i_266_ < is.length; i_266_++) {
				ObjectDefinitions class478 = aClass474_3455.getObjectDefinitions(is[i_266_], 65280);
				int i_267_ = class478.anInt5689 * -272332433;
				if (i_267_ != -1) {
					Class418 class418 = aClass427_3457.method7172(i_267_, -1014703371);
					NativeSprite class160 = class418.method7010(class505, (class478.aBool5671 ? is_265_[i_266_] >> 6 & 0x3 : 0), (class478.aBool5673 ? class478.aBool5674 : false), (byte) 70);
					if (class160 != null) {
						int i_268_ = i_263_ * class160.method228() >> 2;
						int i_269_ = i_264_ * class160.method2748() >> 2;
						if (class418.aBool4996) {
							int i_270_ = class478.anInt5648 * -752356381;
							int i_271_ = class478.anInt5649 * -1610844647;
							if ((is_265_[i_266_] >> 6 & 0x1) == 1) {
								int i_272_ = i_270_;
								i_270_ = i_271_;
								i_271_ = i_272_;
							}
							i_268_ = i_270_ * i_263_;
							i_269_ = i_271_ * i_264_;
						}
						if (i_268_ != 0 && i_269_ != 0) {
							if (class418.anInt4997 * -104422635 != 0)
								class160.method2754(i, i_262_ - i_269_ + i_264_, i_268_, i_269_, 0, (~0xffffff | (class418.anInt4997 * -104422635)), 1);
							else
								class160.method2789(i, i_262_ - i_269_ + i_264_, i_268_, i_269_);
						}
					}
				}
			}
		}
	}

	public static Class282_Sub50_Sub6 method5175(int i, int i_366_) {
		for (Class282_Sub50_Sub6 class282_sub50_sub6 = (Class282_Sub50_Sub6) aClass465_3461.method7750(1754886727); class282_sub50_sub6 != null; class282_sub50_sub6 = ((Class282_Sub50_Sub6) aClass465_3461.method7751((byte) 66))) {
			if (((Class282_Sub50_Sub6) class282_sub50_sub6).aBool9543 && class282_sub50_sub6.method14784(i, i_366_, 2036854357))
				return class282_sub50_sub6;
		}
		return null;
	}

	static NodeCollection method5179(GraphicalRenderer class505, int i, int i_405_, int i_406_, int i_407_) {
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass482_3459.head((byte) 82); class282_sub36 != null; class282_sub36 = (Class282_Sub36) aClass482_3459.next(-413792246))
			method5146(class505, class282_sub36, i, i_405_, i_406_, i_407_);
		return aClass482_3459;
	}

	static void renderMap(GraphicalRenderer renderer) {
		int i = anInt3480 - anInt3485;
		int i_408_ = anInt3486 - anInt3465;
		int width = (anInt3476 - anInt3489 << 16) / i;
		int height = (anInt3492 - anInt3490 << 16) / i_408_;
		renderMap(renderer, width, height, 0, 0);
	}

	static void method5183(GraphicalRenderer class505, int i, int i_527_) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(aClass317_3460.method5626(aClass282_Sub50_Sub6_3491.aString9533, "area", (byte) 1));
		int i_528_ = class282_sub35.readUnsignedByte();
		int[] is = new int[i_528_];
		for (int i_529_ = 0; i_529_ < i_528_; i_529_++)
			is[i_529_] = class282_sub35.readUnsignedByte();
		int i_530_ = class282_sub35.readUnsignedByte();
		int[] is_531_ = new int[i_530_];
		for (int i_532_ = 0; i_532_ < i_530_; i_532_++)
			is_531_[i_532_] = class282_sub35.readUnsignedByte();
		while (class282_sub35.index * -1990677291 < class282_sub35.buffer.length) {
			if (class282_sub35.readUnsignedByte() == 0) {
				int i_533_ = class282_sub35.readUnsignedByte();
				int i_534_ = class282_sub35.readUnsignedByte();
				for (int i_535_ = 0; i_535_ < 64; i_535_++) {
					for (int i_536_ = 0; i_536_ < 64; i_536_++) {
						int i_537_ = i_533_ * 64 + i_535_ - anInt3472;
						int i_538_ = i_534_ * 64 + i_536_ - anInt3473;
						method5162(class505, class282_sub35, i_533_, i_534_, i_537_, i_538_, is, is_531_);
					}
				}
			} else {
				int i_539_ = class282_sub35.readUnsignedByte();
				int i_540_ = class282_sub35.readUnsignedByte();
				int i_541_ = class282_sub35.readUnsignedByte();
				int i_542_ = class282_sub35.readUnsignedByte();
				for (int i_543_ = 0; i_543_ < 8; i_543_++) {
					for (int i_544_ = 0; i_544_ < 8; i_544_++) {
						int i_545_ = i_539_ * 64 + i_541_ * 8 + i_543_ - anInt3472;
						int i_546_ = i_540_ * 64 + i_542_ * 8 + i_544_ - anInt3473;
						method5162(class505, class282_sub35, i_539_, i_540_, i_545_, i_546_, is, is_531_);
					}
				}
			}
		}
		Object object = null;
		rgbColors = new byte[xLength * yLength];
		aShortArray3479 = new short[xLength * yLength];
		for (int i_547_ = 0; i_547_ < 3; i_547_++) {
			byte[] underlayData = new byte[xLength * yLength];
			for (int i_549_ = 0; i_549_ < anArrayListArrayArrayArray3484[i_547_].length; i_549_++) {
				for (int i_550_ = 0; i_550_ < anArrayListArrayArrayArray3484[i_547_][0].length; i_550_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_547_][i_549_][i_550_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							underlayData[(i_549_ * 64 + ((Class269) class269).aByte3311 + ((i_550_ * 64 + ((Class269) class269).aByte3309) * xLength))] = (byte) ((Class269) class269).anInt3310;
						}
					}
				}
			}
			decodeUnderlayColors(underlayData, rgbColors, aShortArray3479, i, i_527_);
			for (int i_551_ = 0; i_551_ < anArrayListArrayArrayArray3484[i_547_].length; i_551_++) {
				for (int i_552_ = 0; i_552_ < anArrayListArrayArrayArray3484[i_547_][0].length; i_552_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_547_][i_551_][i_552_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_553_ = (i_551_ * 64 + ((Class269) class269).aByte3311 + ((i_552_ * 64 + ((Class269) class269).aByte3309) * xLength));
							((Class269) class269).anInt3310 = ((rgbColors[i_553_] & 0xff) << 16 | aShortArray3479[i_553_] & 0xffff);
							if (((Class269) class269).anInt3310 != 0)
								((Class269) class269).anInt3310 |= ~0xffffff;
						}
					}
				}
			}
		}
		decodeUnderlayColors(underlayData, rgbColors, aShortArray3479, i, i_527_);
		underlayData = null;
		method5136();
	}

	static void decodeUnderlayColors(byte[] underlayData, byte[] finalColors, short[] is_678_, int i, int i_679_) {
		int[] a1 = new int[yLength];
		int[] a2 = new int[yLength];
		int[] a3 = new int[yLength];
		int[] a4 = new int[yLength];
		int[] a5 = new int[yLength];
		for (int x = -5; x < xLength; x++) {
			int x2 = x + 5;
			int x3 = x - 5;
			for (int y = 0; y < yLength; y++) {
				if (x2 < xLength) {
					// = ((underlayData[(int) (x2 / scale)][(int) (y / scale)]) & 0x7fff);
					int uId = underlayData[x2 + y * xLength] & 0xff;
					if (uId > 0) {
						UnderlayDef def = UNDERLAY_DEF_LOADER.getUnderlayDef(uId - 1, (byte) -54);
						a1[y] += def.r * -520008741;
						a2[y] += def.g * -771727201;
						a3[y] += def.b * 1389910939;
						a4[y] += def.a * -45673991;
						a5[y]++;
					}
				}
				if (x3 >= 0) {
					// = ((underlayData[(int) (x3 / scale)][(int) (y / scale)]) & 0x7fff);
					int uId = underlayData[x3 + y * xLength] & 0xff;
					if (uId > 0) {
						UnderlayDef def = UNDERLAY_DEF_LOADER.getUnderlayDef(uId - 1, (byte) -86);
						a1[y] -= def.r * -520008741;
						a2[y] -= def.g * -771727201;
						a3[y] -= def.b * 1389910939;
						a4[y] -= def.a * -45673991;
						a5[y]--;
					}
				}
			}
			if (x >= 0) {
				int c1 = 0;
				int c2 = 0;
				int c3 = 0;
				int r2 = 0;
				int r3 = 0;
				for (int y = -5; y < yLength; y++) {
					int y2 = y + 5;
					if (y2 < yLength) {
						c1 += a1[y2];
						c2 += a2[y2];
						c3 += a3[y2];
						r2 += a4[y2];
						r3 += a5[y2];
					}
					int y3 = y - 5;
					if (y3 >= 0) {
						c1 -= a1[y3];
						c2 -= a2[y3];
						c3 -= a3[y3];
						r2 -= a4[y3];
						r3 -= a5[y3];
					}
					if (y >= 0 && r3 > 0) {
						if ((underlayData[x + y * xLength] & 0xff) == 0) {
							int i_699_ = x + y * xLength;
							finalColors[i_699_] = (byte) 0;
							is_678_[i_699_] = (short) 0;
						} else {
							int i_700_ = (r2 == 0 ? 0 : Class371.method6348(c1 * 256 / r2, c2 / r3, c3 / r3, -517505406));
							int i_701_ = (i_700_ & 0x7f) + i_679_;
							if (i_701_ < 0)
								i_701_ = 0;
							else if (i_701_ > 127)
								i_701_ = 127;
							int i_702_ = ((i_700_ + i & 0xfc00) + (i_700_ & 0x380) + i_701_);
							int tile = x + y * xLength;
							int i_704_ = (Class335.anIntArray3916[(Class372.method6362(Class96_Sub21.method14677(i_702_, 96, -74258659), 880885246)) & 0xffff]);
							finalColors[tile] = (byte) (i_704_ >> 16 & 0xff);
							is_678_[tile] = (short) (i_704_ & 0xffff);
						}
					}
				}
			}
		}
	}
}
