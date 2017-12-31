
/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Class291 {
	static byte[] aByteArray3453;
	protected static int anInt3454;
	protected static Class474 aClass474_3455;
	protected static Class218 aClass218_3456;
	protected static Class427 aClass427_3457;
	protected static Interface42 anInterface42_3458;
	protected static Class482 aClass482_3459;
	protected static Class317 aClass317_3460;
	static SwitchMap aClass465_3461 = new SwitchMap(16);
	public static float aFloat3462;
	protected static int anInt3463;
	protected static byte[][][] aByteArrayArrayArray3464;
	protected static int anInt3465;
	static int[] anIntArray3466;
	static byte[] aByteArray3467;
	public static float aFloat3468;
	protected static int anInt3469;
	protected static Class283 aClass283_3470;
	static Class479 aClass479_3471;
	public static int anInt3472;
	public static int anInt3473;
	protected static int anInt3474;
	static byte[] aByteArray3475;
	protected static int anInt3476;
	static byte[] aByteArray3477;
	static byte[] aByteArray3478;
	static short[] aShortArray3479;
	protected static int anInt3480;
	static int[] anIntArray3481;
	static Class536 aClass536_3482;
	protected static int anInt3483;
	static ArrayList[][][] anArrayListArrayArrayArray3484;
	protected static int anInt3485;
	protected static int anInt3486;
	static byte[] aByteArray3487;
	static Object[] anObjectArray3488;
	protected static int anInt3489;
	protected static int anInt3490;
	public static Class282_Sub50_Sub6 aClass282_Sub50_Sub6_3491;
	protected static int anInt3492;

	static Class482 method5124(Class505 class505, int i, int i_0_, int i_1_, int i_2_) {
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass482_3459.method8097((byte) 11); class282_sub36 != null; class282_sub36 = (Class282_Sub36) aClass482_3459.method8067(314951603))
			method5146(class505, class282_sub36, i, i_0_, i_1_, i_2_);
		return aClass482_3459;
	}

	public static void method5125(Class317 class317, Class536 class536, Class479 class479, Class474 class474, Class218 class218, Class427 class427, Interface42 interface42) {
		aClass317_3460 = class317;
		aClass536_3482 = class536;
		aClass479_3471 = class479;
		aClass474_3455 = class474;
		aClass218_3456 = class218;
		aClass427_3457 = class427;
		anInterface42_3458 = interface42;
		aClass465_3461.method7749(1876923510);
		int i = aClass317_3460.method5610("details", -1007791865);
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
		aByteArray3477 = new byte[anInt3474 * anInt3483];
		aByteArray3453 = new byte[anInt3474 * anInt3483];
		aByteArray3487 = new byte[anInt3474 * anInt3483];
		anObjectArray3488 = new Object[anInt3474 * anInt3483];
		aByteArray3475 = new byte[anInt3474 * anInt3483];
		anArrayListArrayArrayArray3484 = new ArrayList[3][anInt3474 >> 6][anInt3483 >> 6];
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

	public static Class282_Sub50_Sub6 method5129(int i, int i_5_) {
		for (Class282_Sub50_Sub6 class282_sub50_sub6 = (Class282_Sub50_Sub6) aClass465_3461.method7750(-112971129); class282_sub50_sub6 != null; class282_sub50_sub6 = ((Class282_Sub50_Sub6) aClass465_3461.method7751((byte) 59))) {
			if (((Class282_Sub50_Sub6) class282_sub50_sub6).aBool9543 && class282_sub50_sub6.method14784(i, i_5_, 2036854357))
				return class282_sub50_sub6;
		}
		return null;
	}

	public static Class282_Sub50_Sub6 method5130(int i) {
		return (Class282_Sub50_Sub6) aClass465_3461.method7754((long) i);
	}

	static void method5131(Class505 class505, int i, int i_6_, int i_7_, int i_8_) {
		int i_9_ = anInt3480 - anInt3485;
		int i_10_ = anInt3486 - anInt3465;
		if (anInt3480 < anInt3474)
			i_9_++;
		if (anInt3486 < anInt3483)
			i_10_++;
		for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
			int i_12_ = (i_7_ + i * i_11_ >> 16) + anInt3489;
			int i_13_ = (i_7_ + i * (i_11_ + 1) >> 16) + anInt3489;
			int i_14_ = i_13_ - i_12_;
			if (i_14_ > 0) {
				int i_15_ = anInt3485 + i_11_;
				if (i_15_ < 0 || i_15_ >= anInt3474) {
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
						class505.B(i_12_, i_17_, i_14_, i_19_, i_20_, 0);
					}
				} else {
					for (int i_21_ = 0; i_21_ < i_10_; i_21_++) {
						int i_22_ = anInt3492 - (i_8_ + i_6_ * (i_21_ + 1) >> 16);
						int i_23_ = anInt3492 - (i_8_ + i_6_ * i_21_ >> 16);
						int i_24_ = i_23_ - i_22_;
						if (i_24_ > 0) {
							int i_25_ = i_21_ + anInt3465;
							int i_26_ = i_15_ + i_25_ * anInt3474;
							int i_27_ = 0;
							int i_28_ = 0;
							Object object = null;
							if (i_25_ >= 0 && i_25_ < anInt3483) {
								i_27_ = ((aByteArray3478[i_26_] & 0xff) << 16 | aShortArray3479[i_26_] & 0xffff);
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
								class505.B(i_12_, i_22_, i_14_, i_24_, i_27_, 0);
							} else if (object != null) {
								if (object instanceof Class282_Sub49) {
									Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
									if (class282_sub49 != null)
										method5142(class505, i_12_, i_22_, i_14_, i_24_, i_27_, i_28_, aByteArray3487[i_26_], (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108), true);
								} else {
									Integer integer = (Integer) object;
									anIntArray3466[0] = integer.intValue();
									aByteArray3467[0] = aByteArray3475[i_26_];
									method5142(class505, i_12_, i_22_, i_14_, i_24_, i_27_, i_28_, aByteArray3487[i_26_], anIntArray3466, aByteArray3467, true);
								}
							} else
								method5142(class505, i_12_, i_22_, i_14_, i_24_, i_27_, i_28_, aByteArray3487[i_26_], null, null, true);
						}
					}
				}
			}
		}
		for (int i_29_ = -16; i_29_ < i_9_ + 16; i_29_++) {
			int i_30_ = (i_7_ + i * i_29_ >> 16) + anInt3489;
			int i_31_ = (i_7_ + i * (i_29_ + 1) >> 16) + anInt3489;
			int i_32_ = i_31_ - i_30_;
			if (i_32_ > 0) {
				int i_33_ = i_29_ + anInt3485;
				if (i_33_ >= 0 && i_33_ < anInt3474) {
					for (int i_34_ = -16; i_34_ < i_10_ + 16; i_34_++) {
						int i_35_ = anInt3492 - (i_8_ + i_6_ * (i_34_ + 1) >> 16);
						int i_36_ = anInt3492 - (i_8_ + i_6_ * i_34_ >> 16);
						int i_37_ = i_36_ - i_35_;
						if (i_37_ > 0) {
							int i_38_ = i_34_ + anInt3465;
							if (i_38_ >= 0 && i_38_ < anInt3483) {
								Object object = (anObjectArray3488[i_33_ + i_38_ * anInt3474]);
								if (object != null) {
									if (object instanceof Class282_Sub49) {
										Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
										if (class282_sub49 != null)
											method5165(class505, i_30_, i_35_, i_32_, i_37_, (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108));
									} else {
										Integer integer = (Integer) object;
										anIntArray3466[0] = integer.intValue();
										aByteArray3467[0] = (aByteArray3475[i_33_ + i_38_ * anInt3474]);
										method5165(class505, i_30_, i_35_, i_32_, i_37_, anIntArray3466, aByteArray3467);
									}
								} else
									method5165(class505, i_30_, i_35_, i_32_, i_37_, null, null);
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
							method5142(class505, i_50_, i_52_, i_51_ - i_50_, i_53_ - i_52_, ((Class269) class269).anInt3310, ((Class269) class269).aByte3308 & 0xff, ((Class269) class269).aByte3312, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314, false);
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
							method5165(class505, i_60_, i_62_, i_61_ - i_60_, i_63_ - i_62_, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314);
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

	public static void method5133(Class317 class317, Class536 class536, Class479 class479, Class474 class474, Class218 class218, Class427 class427, Interface42 interface42) {
		aClass317_3460 = class317;
		aClass536_3482 = class536;
		aClass479_3471 = class479;
		aClass474_3455 = class474;
		aClass218_3456 = class218;
		aClass427_3457 = class427;
		anInterface42_3458 = interface42;
		aClass465_3461.method7749(2056156045);
		int i = aClass317_3460.method5610("details", 31940149);
		int[] is = aClass317_3460.method5616(i, -882523797);
		if (is != null) {
			for (int i_66_ = 0; i_66_ < is.length; i_66_++) {
				Class282_Sub50_Sub6 class282_sub50_sub6 = Class52.method1087(aClass317_3460, i, is[i_66_], 2103879160);
				aClass465_3461.method7765(class282_sub50_sub6, (long) (class282_sub50_sub6.anInt9536 * 1864297169));
			}
		}
		Class38.method854(true, false, -1469100449);
	}

	static void method5134(Class505 class505, Class282_Sub36 class282_sub36, int i, int i_67_, int i_68_, int i_69_) {
		class282_sub36.anInt7990 = (anInt3489 + (i_68_ + i * (class282_sub36.anInt7987 * -1306535747 - anInt3485) >> 16)) * -1316454393;
		class282_sub36.anInt7992 = (anInt3492 - (i_69_ + i_67_ * (class282_sub36.anInt7993 * 1012301095 - anInt3465) >> 16)) * -1541159585;
	}

	static Class482 method5135(Class505 class505) {
		int i = anInt3480 - anInt3485;
		int i_70_ = anInt3486 - anInt3465;
		int i_71_ = (anInt3476 - anInt3489 << 16) / i;
		int i_72_ = (anInt3492 - anInt3490 << 16) / i_70_;
		return method5179(class505, i_71_, i_72_, 0, 0);
	}

	static void method5136() {
		for (int i = 0; i < anInt3474; i++) {
			for (int i_73_ = 0; i_73_ < anInt3483; i_73_++) {
				Object object = anObjectArray3488[i + i_73_ * anInt3474];
				if (object != null) {
					if (object instanceof Class282_Sub49) {
						Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
						if (class282_sub49 != null) {
							for (int i_74_ = 0; i_74_ < (((Class282_Sub49) class282_sub49).anIntArray8109).length; i_74_++) {
								Class478 class478 = (aClass474_3455.method7891((((Class282_Sub49) class282_sub49).anIntArray8109[i_74_]), 65280));
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
									aClass482_3459.method8059(class282_sub36, 1134203078);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class478 class478 = aClass474_3455.method7891(integer.intValue(), 65280);
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
							aClass482_3459.method8059(class282_sub36, 1465536592);
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
									Class478 class478 = (aClass474_3455.method7891((((Class269) class269).anIntArray3313[i_79_]), 65280));
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
										aClass482_3459.method8059(class282_sub36, 1835494095);
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
		aByteArray3477 = null;
		aByteArray3478 = null;
		aShortArray3479 = null;
		aByteArray3453 = null;
		aByteArray3487 = null;
		anObjectArray3488 = null;
		aByteArray3475 = null;
		anArrayListArrayArrayArray3484 = null;
		anIntArray3481 = null;
	}

	static void method5138(Class505 class505) {
		int i = anInt3480 - anInt3485;
		int i_81_ = anInt3486 - anInt3465;
		int i_82_ = (anInt3476 - anInt3489 << 16) / i;
		int i_83_ = (anInt3492 - anInt3490 << 16) / i_81_;
		method5131(class505, i_82_, i_83_, 0, 0);
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

	static void method5140(Interface22 interface22, int i, int i_91_) {
		for (int i_92_ = 0; i_92_ < aClass536_3482.anInt7094 * -389534115; i_92_++)
			anIntArray3481[i_92_ + 1] = method5164(interface22, i_92_, i, i_91_);
	}

	static void method5141(Class505 class505) {
		int i = anInt3480 - anInt3485;
		int i_93_ = anInt3486 - anInt3465;
		int i_94_ = (anInt3476 - anInt3489 << 16) / i;
		int i_95_ = (anInt3492 - anInt3490 << 16) / i_93_;
		method5131(class505, i_94_, i_95_, 0, 0);
	}

	static void method5142(Class505 class505, int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int[] is, byte[] is_102_, boolean bool) {
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
					Class387.method6686(class505, aByteArrayArrayArray3464, anInt3469, i, i_96_, i_99_, anIntArray3481[i_100_], i_97_, i_98_, i_103_, i_101_ >> 6 & 0x3, i_105_, -778426083);
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
				if (i_109_ == Class458.aClass458_5470.anInt5481 * 1109376893 || i_109_ == Class458.aClass458_5472.anInt5481 * 1109376893 || i_109_ == Class458.aClass458_5473.anInt5481 * 1109376893 || (i_109_ == Class458.aClass458_5474.anInt5481 * 1109376893)) {
					Class478 class478 = aClass474_3455.method7891(is[i_108_], 65280);
					if (class478.anInt5689 * -272332433 == -1) {
						int i_110_ = -3355444;
						if (class478.anInt5652 * -348507379 == 1)
							i_110_ = -3407872;
						int i_111_ = is_102_[i_108_] >> 6 & 0x3;
						if (i_109_ == (Class458.aClass458_5470.anInt5481 * 1109376893)) {
							if (i_111_ == 0)
								class505.G(i, i_96_, i_98_, i_110_, 0);
							else if (i_111_ == 1)
								class505.XA(i, i_96_, i_97_, i_110_, 0);
							else if (i_111_ == 2)
								class505.G(i_106_, i_96_, i_98_, i_110_, 0);
							else
								class505.XA(i, i_107_, i_97_, i_110_, 0);
						} else if (i_109_ == (Class458.aClass458_5472.anInt5481 * 1109376893)) {
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
						} else if (i_109_ == (Class458.aClass458_5473.anInt5481 * 1109376893)) {
							if (i_111_ == 0)
								class505.XA(i, i_96_, 1, i_110_, 0);
							else if (i_111_ == 1)
								class505.XA(i_106_, i_96_, 1, i_110_, 0);
							else if (i_111_ == 2)
								class505.XA(i_106_, i_107_, 1, i_110_, 0);
							else
								class505.XA(i, i_107_, 1, i_110_, 0);
						} else if (i_109_ == (Class458.aClass458_5474.anInt5481 * 1109376893)) {
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

	static void method5143() {
		int[] is = new int[3];
		for (int i = 0; i < aClass283_3470.anInt3382 * -361490119; i++) {
			boolean bool = (aClass282_Sub50_Sub6_3491.method14778(aClass283_3470.anIntArray3381[i] >> 28 & 0x3, aClass283_3470.anIntArray3381[i] >> 14 & 0x3fff, aClass283_3470.anIntArray3381[i] & 0x3fff, is, -1151632811));
			if (bool) {
				Class282_Sub36 class282_sub36 = new Class282_Sub36(aClass283_3470.anIntArray3383[i]);
				class282_sub36.anInt7987 = (is[1] - anInt3472) * -1063198059;
				class282_sub36.anInt7993 = (is[2] - anInt3473) * -992271721;
				aClass482_3459.method8059(class282_sub36, 1750454353);
			}
		}
	}

	static void method5144(Class505 class505, RsByteBuffer class282_sub35, int i, int i_114_, int i_115_, int i_116_, int[] is, int[] is_117_) {
		int i_118_ = class282_sub35.readUnsignedByte();
		if ((i_118_ & 0x1) == 0) {
			boolean bool = (i_118_ & 0x2) == 0;
			int i_119_ = i_118_ >> 2 & 0x3f;
			if (i_119_ != 62) {
				if (i_119_ == 63)
					i_119_ = class282_sub35.readUnsignedByte();
				else if (bool)
					i_119_ = is[i_119_];
				else
					i_119_ = is_117_[i_119_];
				if (bool) {
					aByteArray3477[i_115_ + i_116_ * anInt3474] = (byte) i_119_;
					aByteArray3453[i_115_ + i_116_ * anInt3474] = (byte) 0;
				} else {
					aByteArray3453[i_115_ + i_116_ * anInt3474] = (byte) i_119_;
					aByteArray3487[i_115_ + i_116_ * anInt3474] = (byte) 0;
					aByteArray3477[i_115_ + i_116_ * anInt3474] = class282_sub35.readByte((short) -469);
				}
			}
		} else {
			int i_120_ = (i_118_ >> 1 & 0x3) + 1;
			boolean bool = (i_118_ & 0x8) != 0;
			boolean bool_121_ = (i_118_ & 0x10) != 0;
			for (int i_122_ = 0; i_122_ < i_120_; i_122_++) {
				int i_123_ = class282_sub35.readUnsignedByte();
				int i_124_ = 0;
				int i_125_ = 0;
				if (bool) {
					i_124_ = class282_sub35.readUnsignedByte();
					i_125_ = class282_sub35.readUnsignedByte();
				}
				int i_126_ = 0;
				if (bool_121_)
					i_126_ = class282_sub35.readUnsignedByte();
				if (i_122_ == 0) {
					aByteArray3477[i_115_ + i_116_ * anInt3474] = (byte) i_123_;
					aByteArray3453[i_115_ + i_116_ * anInt3474] = (byte) i_124_;
					aByteArray3487[i_115_ + i_116_ * anInt3474] = (byte) i_125_;
					if (i_126_ == 1) {
						anObjectArray3488[i_115_ + i_116_ * anInt3474] = new Integer(class282_sub35.readBigSmart(2046969972));
						aByteArray3475[i_115_ + i_116_ * anInt3474] = class282_sub35.readByte((short) -28370);
					} else if (i_126_ > 1) {
						int[] is_127_ = new int[i_126_];
						byte[] is_128_ = new byte[i_126_];
						for (int i_129_ = 0; i_129_ < i_126_; i_129_++) {
							is_127_[i_129_] = class282_sub35.readBigSmart(1980368553);
							is_128_[i_129_] = class282_sub35.readByte((short) -29826);
						}
						anObjectArray3488[i_115_ + i_116_ * anInt3474] = new Class282_Sub49(is_127_, is_128_);
					}
				} else {
					int[] is_130_ = null;
					byte[] is_131_ = null;
					if (i_126_ > 0) {
						is_130_ = new int[i_126_];
						is_131_ = new byte[i_126_];
						for (int i_132_ = 0; i_132_ < i_126_; i_132_++) {
							is_130_[i_132_] = class282_sub35.readBigSmart(2115072579);
							is_131_[i_132_] = class282_sub35.readByte((short) -11495);
						}
					}
					if ((anArrayListArrayArrayArray3484[i_122_ - 1][i - (anInt3472 >> 6)][i_114_ - (anInt3473 >> 6)]) == null)
						anArrayListArrayArrayArray3484[i_122_ - 1][i - (anInt3472 >> 6)][i_114_ - (anInt3473 >> 6)] = new ArrayList();
					Class269 class269 = new Class269(i_115_ & 0x3f, i_116_ & 0x3f, i_123_, i_124_, i_125_, is_130_, is_131_);
					anArrayListArrayArrayArray3484[i_122_ - 1][i - (anInt3472 >> 6)][i_114_ - (anInt3473 >> 6)].add(class269);
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
				aClass482_3459.method8059(class282_sub36, -466469405);
			}
		}
	}

	static void method5146(Class505 class505, Class282_Sub36 class282_sub36, int i, int i_133_, int i_134_, int i_135_) {
		class282_sub36.anInt7990 = (anInt3489 + (i_134_ + i * (class282_sub36.anInt7987 * -1306535747 - anInt3485) >> 16)) * -1316454393;
		class282_sub36.anInt7992 = (anInt3492 - (i_135_ + i_133_ * (class282_sub36.anInt7993 * 1012301095 - anInt3465) >> 16)) * -1541159585;
	}

	static void method5147(Class505 class505, Class282_Sub36 class282_sub36, Class220 class220) {
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
		aClass482_3459 = new Class482();
	}

	Class291() throws Throwable {
		throw new Error();
	}

	static void method5148() {
		aByteArray3477 = new byte[anInt3474 * anInt3483];
		aByteArray3453 = new byte[anInt3474 * anInt3483];
		aByteArray3487 = new byte[anInt3474 * anInt3483];
		anObjectArray3488 = new Object[anInt3474 * anInt3483];
		aByteArray3475 = new byte[anInt3474 * anInt3483];
		anArrayListArrayArrayArray3484 = new ArrayList[3][anInt3474 >> 6][anInt3483 >> 6];
		anIntArray3481 = new int[aClass536_3482.anInt7094 * -389534115 + 1];
	}

	static void method5149() {
		aByteArray3477 = null;
		aByteArray3478 = null;
		aShortArray3479 = null;
		aByteArray3453 = null;
		aByteArray3487 = null;
		anObjectArray3488 = null;
		aByteArray3475 = null;
		anArrayListArrayArrayArray3484 = null;
		anIntArray3481 = null;
	}

	static void method5150() {
		aByteArray3477 = null;
		aByteArray3478 = null;
		aShortArray3479 = null;
		aByteArray3453 = null;
		aByteArray3487 = null;
		anObjectArray3488 = null;
		aByteArray3475 = null;
		anArrayListArrayArrayArray3484 = null;
		anIntArray3481 = null;
	}

	static void method5151() {
		aByteArray3477 = null;
		aByteArray3478 = null;
		aShortArray3479 = null;
		aByteArray3453 = null;
		aByteArray3487 = null;
		anObjectArray3488 = null;
		aByteArray3475 = null;
		anArrayListArrayArrayArray3484 = null;
		anIntArray3481 = null;
	}

	public static Class282_Sub50_Sub6 method5152(int i, int i_151_) {
		for (Class282_Sub50_Sub6 class282_sub50_sub6 = (Class282_Sub50_Sub6) aClass465_3461.method7750(-347500789); class282_sub50_sub6 != null; class282_sub50_sub6 = (Class282_Sub50_Sub6) aClass465_3461.method7751((byte) 8)) {
			if (((Class282_Sub50_Sub6) class282_sub50_sub6).aBool9543 && class282_sub50_sub6.method14784(i, i_151_, 2036854357))
				return class282_sub50_sub6;
		}
		return null;
	}

	static void method5153(Class505 class505, Class282_Sub36 class282_sub36, int i, int i_152_, int i_153_, int i_154_) {
		class282_sub36.anInt7990 = (anInt3489 + (i_153_ + i * (class282_sub36.anInt7987 * -1306535747 - anInt3485) >> 16)) * -1316454393;
		class282_sub36.anInt7992 = (anInt3492 - (i_154_ + i_152_ * (class282_sub36.anInt7993 * 1012301095 - anInt3465) >> 16)) * -1541159585;
	}

	public static Class282_Sub50_Sub6 method5154(int i, int i_155_) {
		for (Class282_Sub50_Sub6 class282_sub50_sub6 = (Class282_Sub50_Sub6) aClass465_3461.method7750(1554018664); class282_sub50_sub6 != null; class282_sub50_sub6 = ((Class282_Sub50_Sub6) aClass465_3461.method7751((byte) 36))) {
			if (((Class282_Sub50_Sub6) class282_sub50_sub6).aBool9543 && class282_sub50_sub6.method14784(i, i_155_, 2036854357))
				return class282_sub50_sub6;
		}
		return null;
	}

	public static Class282_Sub50_Sub6 method5155(int i) {
		return (Class282_Sub50_Sub6) aClass465_3461.method7754((long) i);
	}

	static void method5156(int i, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_) {
		anInt3485 = i - anInt3472;
		anInt3486 = i_156_ - anInt3473;
		anInt3480 = i_157_ - anInt3472;
		anInt3465 = i_158_ - anInt3473;
		anInt3489 = i_159_;
		anInt3490 = i_160_;
		anInt3476 = i_161_;
		anInt3492 = i_162_;
	}

	static void method5157(Interface22 interface22, int i, int i_163_) {
		for (int i_164_ = 0; i_164_ < aClass536_3482.anInt7094 * -389534115; i_164_++)
			anIntArray3481[i_164_ + 1] = method5164(interface22, i_164_, i, i_163_);
	}

	static void method5158(Interface22 interface22, int i, int i_165_) {
		for (int i_166_ = 0; i_166_ < aClass536_3482.anInt7094 * -389534115; i_166_++)
			anIntArray3481[i_166_ + 1] = method5164(interface22, i_166_, i, i_165_);
	}

	static void method5159(Class505 class505, RsByteBuffer class282_sub35, int i, int i_167_, int i_168_, int i_169_, int[] is, int[] is_170_) {
		int i_171_ = class282_sub35.readUnsignedByte();
		if ((i_171_ & 0x1) == 0) {
			boolean bool = (i_171_ & 0x2) == 0;
			int i_172_ = i_171_ >> 2 & 0x3f;
			if (i_172_ != 62) {
				if (i_172_ == 63)
					i_172_ = class282_sub35.readUnsignedByte();
				else if (bool)
					i_172_ = is[i_172_];
				else
					i_172_ = is_170_[i_172_];
				if (bool) {
					aByteArray3477[i_168_ + i_169_ * anInt3474] = (byte) i_172_;
					aByteArray3453[i_168_ + i_169_ * anInt3474] = (byte) 0;
				} else {
					aByteArray3453[i_168_ + i_169_ * anInt3474] = (byte) i_172_;
					aByteArray3487[i_168_ + i_169_ * anInt3474] = (byte) 0;
					aByteArray3477[i_168_ + i_169_ * anInt3474] = class282_sub35.readByte((short) -25224);
				}
			}
		} else {
			int i_173_ = (i_171_ >> 1 & 0x3) + 1;
			boolean bool = (i_171_ & 0x8) != 0;
			boolean bool_174_ = (i_171_ & 0x10) != 0;
			for (int i_175_ = 0; i_175_ < i_173_; i_175_++) {
				int i_176_ = class282_sub35.readUnsignedByte();
				int i_177_ = 0;
				int i_178_ = 0;
				if (bool) {
					i_177_ = class282_sub35.readUnsignedByte();
					i_178_ = class282_sub35.readUnsignedByte();
				}
				int i_179_ = 0;
				if (bool_174_)
					i_179_ = class282_sub35.readUnsignedByte();
				if (i_175_ == 0) {
					aByteArray3477[i_168_ + i_169_ * anInt3474] = (byte) i_176_;
					aByteArray3453[i_168_ + i_169_ * anInt3474] = (byte) i_177_;
					aByteArray3487[i_168_ + i_169_ * anInt3474] = (byte) i_178_;
					if (i_179_ == 1) {
						anObjectArray3488[i_168_ + i_169_ * anInt3474] = new Integer(class282_sub35.readBigSmart(2065221747));
						aByteArray3475[i_168_ + i_169_ * anInt3474] = class282_sub35.readByte((short) -29730);
					} else if (i_179_ > 1) {
						int[] is_180_ = new int[i_179_];
						byte[] is_181_ = new byte[i_179_];
						for (int i_182_ = 0; i_182_ < i_179_; i_182_++) {
							is_180_[i_182_] = class282_sub35.readBigSmart(2112875389);
							is_181_[i_182_] = class282_sub35.readByte((short) -19175);
						}
						anObjectArray3488[i_168_ + i_169_ * anInt3474] = new Class282_Sub49(is_180_, is_181_);
					}
				} else {
					int[] is_183_ = null;
					byte[] is_184_ = null;
					if (i_179_ > 0) {
						is_183_ = new int[i_179_];
						is_184_ = new byte[i_179_];
						for (int i_185_ = 0; i_185_ < i_179_; i_185_++) {
							is_183_[i_185_] = class282_sub35.readBigSmart(2045985917);
							is_184_[i_185_] = class282_sub35.readByte((short) -29113);
						}
					}
					if ((anArrayListArrayArrayArray3484[i_175_ - 1][i - (anInt3472 >> 6)][i_167_ - (anInt3473 >> 6)]) == null)
						anArrayListArrayArrayArray3484[i_175_ - 1][i - (anInt3472 >> 6)][i_167_ - (anInt3473 >> 6)] = new ArrayList();
					Class269 class269 = new Class269(i_168_ & 0x3f, i_169_ & 0x3f, i_176_, i_177_, i_178_, is_183_, is_184_);
					anArrayListArrayArrayArray3484[i_175_ - 1][i - (anInt3472 >> 6)][i_167_ - (anInt3473 >> 6)].add(class269);
				}
			}
		}
	}

	static int method5160(Interface22 interface22, int i, int i_186_, int i_187_) {
		Class531 class531 = aClass536_3482.method11475(i, (byte) 0);
		if (class531 == null)
			return 0;
		int i_188_ = class531.anInt7066 * 1717409107;
		if (i_188_ >= 0 && interface22.method144(i_188_, -1927571163).aBool2056)
			i_188_ = -1;
		int i_189_;
		if (class531.anInt7058 * -848345857 >= 0) {
			int i_190_ = class531.anInt7058 * -848345857;
			int i_191_ = (i_190_ & 0x7f) + i_187_;
			if (i_191_ < 0)
				i_191_ = 0;
			else if (i_191_ > 127)
				i_191_ = 127;
			int i_192_ = (i_190_ + i_186_ & 0xfc00) + (i_190_ & 0x380) + i_191_;
			i_189_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162(i_192_, 96, (byte) -44), 618491220) & 0xffff]));
		} else if (i_188_ >= 0)
			i_189_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162((interface22.method144(i_188_, -2015796984).aShort2073), 96, (byte) -18), 1102143580) & 0xffff]));
		else if (class531.anInt7054 * 1419498143 == -1)
			i_189_ = 0;
		else {
			int i_193_ = class531.anInt7054 * 1419498143;
			int i_194_ = (i_193_ & 0x7f) + i_187_;
			if (i_194_ < 0)
				i_194_ = 0;
			else if (i_194_ > 127)
				i_194_ = 127;
			int i_195_ = (i_193_ + i_186_ & 0xfc00) + (i_193_ & 0x380) + i_194_;
			i_189_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162(i_195_, 96, (byte) -75), 1715917188) & 0xffff]));
		}
		return i_189_;
	}

	static int method5161(Interface22 interface22, int i, int i_196_, int i_197_) {
		Class531 class531 = aClass536_3482.method11475(i, (byte) 0);
		if (class531 == null)
			return 0;
		int i_198_ = class531.anInt7066 * 1717409107;
		if (i_198_ >= 0 && interface22.method144(i_198_, -1834157533).aBool2056)
			i_198_ = -1;
		int i_199_;
		if (class531.anInt7058 * -848345857 >= 0) {
			int i_200_ = class531.anInt7058 * -848345857;
			int i_201_ = (i_200_ & 0x7f) + i_197_;
			if (i_201_ < 0)
				i_201_ = 0;
			else if (i_201_ > 127)
				i_201_ = 127;
			int i_202_ = (i_200_ + i_196_ & 0xfc00) + (i_200_ & 0x380) + i_201_;
			i_199_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162(i_202_, 96, (byte) 6), 558169134) & 0xffff]));
		} else if (i_198_ >= 0)
			i_199_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162((interface22.method144(i_198_, -2018383478).aShort2073), 96, (byte) -116), 1690524721) & 0xffff]));
		else if (class531.anInt7054 * 1419498143 == -1)
			i_199_ = 0;
		else {
			int i_203_ = class531.anInt7054 * 1419498143;
			int i_204_ = (i_203_ & 0x7f) + i_197_;
			if (i_204_ < 0)
				i_204_ = 0;
			else if (i_204_ > 127)
				i_204_ = 127;
			int i_205_ = (i_203_ + i_196_ & 0xfc00) + (i_203_ & 0x380) + i_204_;
			i_199_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162(i_205_, 96, (byte) -32), 2131826189) & 0xffff]));
		}
		return i_199_;
	}

	static void method5162(Class505 class505, RsByteBuffer class282_sub35, int i, int i_206_, int i_207_, int i_208_, int[] is, int[] is_209_) {
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
					aByteArray3477[i_207_ + i_208_ * anInt3474] = (byte) i_211_;
					aByteArray3453[i_207_ + i_208_ * anInt3474] = (byte) 0;
				} else {
					aByteArray3453[i_207_ + i_208_ * anInt3474] = (byte) i_211_;
					aByteArray3487[i_207_ + i_208_ * anInt3474] = (byte) 0;
					aByteArray3477[i_207_ + i_208_ * anInt3474] = class282_sub35.readByte((short) -21653);
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
					aByteArray3477[i_207_ + i_208_ * anInt3474] = (byte) i_215_;
					aByteArray3453[i_207_ + i_208_ * anInt3474] = (byte) i_216_;
					aByteArray3487[i_207_ + i_208_ * anInt3474] = (byte) i_217_;
					if (i_218_ == 1) {
						anObjectArray3488[i_207_ + i_208_ * anInt3474] = new Integer(class282_sub35.readBigSmart(2066949833));
						aByteArray3475[i_207_ + i_208_ * anInt3474] = class282_sub35.readByte((short) -132);
					} else if (i_218_ > 1) {
						int[] is_219_ = new int[i_218_];
						byte[] is_220_ = new byte[i_218_];
						for (int i_221_ = 0; i_221_ < i_218_; i_221_++) {
							is_219_[i_221_] = class282_sub35.readBigSmart(1990472601);
							is_220_[i_221_] = class282_sub35.readByte((short) -2494);
						}
						anObjectArray3488[i_207_ + i_208_ * anInt3474] = new Class282_Sub49(is_219_, is_220_);
					}
				} else {
					int[] is_222_ = null;
					byte[] is_223_ = null;
					if (i_218_ > 0) {
						is_222_ = new int[i_218_];
						is_223_ = new byte[i_218_];
						for (int i_224_ = 0; i_224_ < i_218_; i_224_++) {
							is_222_[i_224_] = class282_sub35.readBigSmart(2050954616);
							is_223_[i_224_] = class282_sub35.readByte((short) -2920);
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

	static void method5163(Class505 class505, int i, int i_225_) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(aClass317_3460.method5626(aClass282_Sub50_Sub6_3491.aString9533, "area", (byte) 1));
		int i_226_ = class282_sub35.readUnsignedByte();
		int[] is = new int[i_226_];
		for (int i_227_ = 0; i_227_ < i_226_; i_227_++)
			is[i_227_] = class282_sub35.readUnsignedByte();
		int i_228_ = class282_sub35.readUnsignedByte();
		int[] is_229_ = new int[i_228_];
		for (int i_230_ = 0; i_230_ < i_228_; i_230_++)
			is_229_[i_230_] = class282_sub35.readUnsignedByte();
		while (class282_sub35.index * -1990677291 < class282_sub35.buffer.length) {
			if (class282_sub35.readUnsignedByte() == 0) {
				int i_231_ = class282_sub35.readUnsignedByte();
				int i_232_ = class282_sub35.readUnsignedByte();
				for (int i_233_ = 0; i_233_ < 64; i_233_++) {
					for (int i_234_ = 0; i_234_ < 64; i_234_++) {
						int i_235_ = i_231_ * 64 + i_233_ - anInt3472;
						int i_236_ = i_232_ * 64 + i_234_ - anInt3473;
						method5162(class505, class282_sub35, i_231_, i_232_, i_235_, i_236_, is, is_229_);
					}
				}
			} else {
				int i_237_ = class282_sub35.readUnsignedByte();
				int i_238_ = class282_sub35.readUnsignedByte();
				int i_239_ = class282_sub35.readUnsignedByte();
				int i_240_ = class282_sub35.readUnsignedByte();
				for (int i_241_ = 0; i_241_ < 8; i_241_++) {
					for (int i_242_ = 0; i_242_ < 8; i_242_++) {
						int i_243_ = i_237_ * 64 + i_239_ * 8 + i_241_ - anInt3472;
						int i_244_ = i_238_ * 64 + i_240_ * 8 + i_242_ - anInt3473;
						method5162(class505, class282_sub35, i_237_, i_238_, i_243_, i_244_, is, is_229_);
					}
				}
			}
		}
		Object object = null;
		aByteArray3478 = new byte[anInt3474 * anInt3483];
		aShortArray3479 = new short[anInt3474 * anInt3483];
		for (int i_245_ = 0; i_245_ < 3; i_245_++) {
			byte[] is_246_ = new byte[anInt3474 * anInt3483];
			for (int i_247_ = 0; i_247_ < anArrayListArrayArrayArray3484[i_245_].length; i_247_++) {
				for (int i_248_ = 0; i_248_ < anArrayListArrayArrayArray3484[i_245_][0].length; i_248_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_245_][i_247_][i_248_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							is_246_[(i_247_ * 64 + ((Class269) class269).aByte3311 + ((i_248_ * 64 + ((Class269) class269).aByte3309) * anInt3474))] = (byte) ((Class269) class269).anInt3310;
						}
					}
				}
			}
			method5194(is_246_, aByteArray3478, aShortArray3479, i, i_225_);
			for (int i_249_ = 0; i_249_ < anArrayListArrayArrayArray3484[i_245_].length; i_249_++) {
				for (int i_250_ = 0; i_250_ < anArrayListArrayArrayArray3484[i_245_][0].length; i_250_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_245_][i_249_][i_250_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_251_ = (i_249_ * 64 + ((Class269) class269).aByte3311 + ((i_250_ * 64 + ((Class269) class269).aByte3309) * anInt3474));
							((Class269) class269).anInt3310 = ((aByteArray3478[i_251_] & 0xff) << 16 | aShortArray3479[i_251_] & 0xffff);
							if (((Class269) class269).anInt3310 != 0)
								((Class269) class269).anInt3310 |= ~0xffffff;
						}
					}
				}
			}
		}
		method5194(aByteArray3477, aByteArray3478, aShortArray3479, i, i_225_);
		aByteArray3477 = null;
		method5136();
	}

	static int method5164(Interface22 interface22, int i, int i_252_, int i_253_) {
		Class531 class531 = aClass536_3482.method11475(i, (byte) 0);
		if (class531 == null)
			return 0;
		int i_254_ = class531.anInt7066 * 1717409107;
		if (i_254_ >= 0 && interface22.method144(i_254_, -1948706533).aBool2056)
			i_254_ = -1;
		int i_255_;
		if (class531.anInt7058 * -848345857 >= 0) {
			int i_256_ = class531.anInt7058 * -848345857;
			int i_257_ = (i_256_ & 0x7f) + i_253_;
			if (i_257_ < 0)
				i_257_ = 0;
			else if (i_257_ > 127)
				i_257_ = 127;
			int i_258_ = (i_256_ + i_252_ & 0xfc00) + (i_256_ & 0x380) + i_257_;
			i_255_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162(i_258_, 96, (byte) -73), 475535484) & 0xffff]));
		} else if (i_254_ >= 0)
			i_255_ = (~0xffffff | (Class335.anIntArray3916[Class372.method6362(Class242.method4162((interface22.method144(i_254_, -1979012450).aShort2073), 96, (byte) -53), 390293203) & 0xffff]));
		else if (class531.anInt7054 * 1419498143 == -1)
			i_255_ = 0;
		else {
			int i_259_ = class531.anInt7054 * 1419498143;
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

	static void method5165(Class505 class505, int i, int i_262_, int i_263_, int i_264_, int[] is, byte[] is_265_) {
		if (is != null) {
			for (int i_266_ = 0; i_266_ < is.length; i_266_++) {
				Class478 class478 = aClass474_3455.method7891(is[i_266_], 65280);
				int i_267_ = class478.anInt5689 * -272332433;
				if (i_267_ != -1) {
					Class418 class418 = aClass427_3457.method7172(i_267_, -1014703371);
					Class160 class160 = class418.method7010(class505, (class478.aBool5671 ? is_265_[i_266_] >> 6 & 0x3 : 0), (class478.aBool5673 ? class478.aBool5674 : false), (byte) 70);
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

	static void method5166() {
		for (int i = 0; i < anInt3474; i++) {
			for (int i_273_ = 0; i_273_ < anInt3483; i_273_++) {
				Object object = anObjectArray3488[i + i_273_ * anInt3474];
				if (object != null) {
					if (object instanceof Class282_Sub49) {
						Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
						if (class282_sub49 != null) {
							for (int i_274_ = 0; i_274_ < (((Class282_Sub49) class282_sub49).anIntArray8109).length; i_274_++) {
								Class478 class478 = (aClass474_3455.method7891((((Class282_Sub49) class282_sub49).anIntArray8109[i_274_]), 65280));
								int i_275_ = class478.anInt5669 * -1796959211;
								if (class478.anIntArray5650 != null) {
									class478 = (class478.method8013(anInterface42_3458, (byte) -86));
									if (class478 != null)
										i_275_ = class478.anInt5669 * -1796959211;
								}
								if (i_275_ != -1) {
									Class282_Sub36 class282_sub36 = new Class282_Sub36(i_275_);
									class282_sub36.anInt7987 = i * -1063198059;
									class282_sub36.anInt7993 = i_273_ * -992271721;
									aClass482_3459.method8059(class282_sub36, 1305029137);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class478 class478 = aClass474_3455.method7891(integer.intValue(), 65280);
						int i_276_ = class478.anInt5669 * -1796959211;
						if (class478.anIntArray5650 != null) {
							class478 = class478.method8013(anInterface42_3458, (byte) 57);
							if (class478 != null)
								i_276_ = class478.anInt5669 * -1796959211;
						}
						if (i_276_ != -1) {
							Class282_Sub36 class282_sub36 = new Class282_Sub36(i_276_);
							class282_sub36.anInt7987 = i * -1063198059;
							class282_sub36.anInt7993 = i_273_ * -992271721;
							aClass482_3459.method8059(class282_sub36, 571262791);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_277_ = 0; i_277_ < anArrayListArrayArrayArray3484[0].length; i_277_++) {
				for (int i_278_ = 0; i_278_ < anArrayListArrayArrayArray3484[0][0].length; i_278_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3484[i][i_277_][i_278_];
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							if (((Class269) class269).anIntArray3313 != null) {
								for (int i_279_ = 0; i_279_ < (((Class269) class269).anIntArray3313).length; i_279_++) {
									Class478 class478 = (aClass474_3455.method7891((((Class269) class269).anIntArray3313[i_279_]), 65280));
									int i_280_ = class478.anInt5669 * -1796959211;
									if (class478.anIntArray5650 != null) {
										class478 = (class478.method8013(anInterface42_3458, (byte) -32));
										if (class478 != null)
											i_280_ = (class478.anInt5669 * -1796959211);
									}
									if (i_280_ != -1) {
										Class282_Sub36 class282_sub36 = new Class282_Sub36(i_280_);
										class282_sub36.anInt7987 = ((i_277_ + (anInt3472 >> 6)) * 64 + (((Class269) class269).aByte3311) - anInt3472) * -1063198059;
										class282_sub36.anInt7993 = ((i_278_ + (anInt3473 >> 6)) * 64 + (((Class269) class269).aByte3309) - anInt3473) * -992271721;
										aClass482_3459.method8059(class282_sub36, -2120852042);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method5167() {
		for (int i = 0; i < anInt3474; i++) {
			for (int i_281_ = 0; i_281_ < anInt3483; i_281_++) {
				Object object = anObjectArray3488[i + i_281_ * anInt3474];
				if (object != null) {
					if (object instanceof Class282_Sub49) {
						Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
						if (class282_sub49 != null) {
							for (int i_282_ = 0; i_282_ < (((Class282_Sub49) class282_sub49).anIntArray8109).length; i_282_++) {
								Class478 class478 = (aClass474_3455.method7891((((Class282_Sub49) class282_sub49).anIntArray8109[i_282_]), 65280));
								int i_283_ = class478.anInt5669 * -1796959211;
								if (class478.anIntArray5650 != null) {
									class478 = (class478.method8013(anInterface42_3458, (byte) -36));
									if (class478 != null)
										i_283_ = class478.anInt5669 * -1796959211;
								}
								if (i_283_ != -1) {
									Class282_Sub36 class282_sub36 = new Class282_Sub36(i_283_);
									class282_sub36.anInt7987 = i * -1063198059;
									class282_sub36.anInt7993 = i_281_ * -992271721;
									aClass482_3459.method8059(class282_sub36, -1108847676);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class478 class478 = aClass474_3455.method7891(integer.intValue(), 65280);
						int i_284_ = class478.anInt5669 * -1796959211;
						if (class478.anIntArray5650 != null) {
							class478 = class478.method8013(anInterface42_3458, (byte) -63);
							if (class478 != null)
								i_284_ = class478.anInt5669 * -1796959211;
						}
						if (i_284_ != -1) {
							Class282_Sub36 class282_sub36 = new Class282_Sub36(i_284_);
							class282_sub36.anInt7987 = i * -1063198059;
							class282_sub36.anInt7993 = i_281_ * -992271721;
							aClass482_3459.method8059(class282_sub36, 1644577420);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_285_ = 0; i_285_ < anArrayListArrayArrayArray3484[0].length; i_285_++) {
				for (int i_286_ = 0; i_286_ < anArrayListArrayArrayArray3484[0][0].length; i_286_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3484[i][i_285_][i_286_];
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							if (((Class269) class269).anIntArray3313 != null) {
								for (int i_287_ = 0; i_287_ < (((Class269) class269).anIntArray3313).length; i_287_++) {
									Class478 class478 = (aClass474_3455.method7891((((Class269) class269).anIntArray3313[i_287_]), 65280));
									int i_288_ = class478.anInt5669 * -1796959211;
									if (class478.anIntArray5650 != null) {
										class478 = (class478.method8013(anInterface42_3458, (byte) -16));
										if (class478 != null)
											i_288_ = (class478.anInt5669 * -1796959211);
									}
									if (i_288_ != -1) {
										Class282_Sub36 class282_sub36 = new Class282_Sub36(i_288_);
										class282_sub36.anInt7987 = ((i_285_ + (anInt3472 >> 6)) * 64 + (((Class269) class269).aByte3311) - anInt3472) * -1063198059;
										class282_sub36.anInt7993 = ((i_286_ + (anInt3473 >> 6)) * 64 + (((Class269) class269).aByte3309) - anInt3473) * -992271721;
										aClass482_3459.method8059(class282_sub36, -1080898640);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method5168() {
		for (int i = 0; i < anInt3474; i++) {
			for (int i_289_ = 0; i_289_ < anInt3483; i_289_++) {
				Object object = anObjectArray3488[i + i_289_ * anInt3474];
				if (object != null) {
					if (object instanceof Class282_Sub49) {
						Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
						if (class282_sub49 != null) {
							for (int i_290_ = 0; i_290_ < (((Class282_Sub49) class282_sub49).anIntArray8109).length; i_290_++) {
								Class478 class478 = (aClass474_3455.method7891((((Class282_Sub49) class282_sub49).anIntArray8109[i_290_]), 65280));
								int i_291_ = class478.anInt5669 * -1796959211;
								if (class478.anIntArray5650 != null) {
									class478 = (class478.method8013(anInterface42_3458, (byte) 86));
									if (class478 != null)
										i_291_ = class478.anInt5669 * -1796959211;
								}
								if (i_291_ != -1) {
									Class282_Sub36 class282_sub36 = new Class282_Sub36(i_291_);
									class282_sub36.anInt7987 = i * -1063198059;
									class282_sub36.anInt7993 = i_289_ * -992271721;
									aClass482_3459.method8059(class282_sub36, 1507220494);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class478 class478 = aClass474_3455.method7891(integer.intValue(), 65280);
						int i_292_ = class478.anInt5669 * -1796959211;
						if (class478.anIntArray5650 != null) {
							class478 = class478.method8013(anInterface42_3458, (byte) 33);
							if (class478 != null)
								i_292_ = class478.anInt5669 * -1796959211;
						}
						if (i_292_ != -1) {
							Class282_Sub36 class282_sub36 = new Class282_Sub36(i_292_);
							class282_sub36.anInt7987 = i * -1063198059;
							class282_sub36.anInt7993 = i_289_ * -992271721;
							aClass482_3459.method8059(class282_sub36, -1810890764);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_293_ = 0; i_293_ < anArrayListArrayArrayArray3484[0].length; i_293_++) {
				for (int i_294_ = 0; i_294_ < anArrayListArrayArrayArray3484[0][0].length; i_294_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3484[i][i_293_][i_294_];
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							if (((Class269) class269).anIntArray3313 != null) {
								for (int i_295_ = 0; i_295_ < (((Class269) class269).anIntArray3313).length; i_295_++) {
									Class478 class478 = (aClass474_3455.method7891((((Class269) class269).anIntArray3313[i_295_]), 65280));
									int i_296_ = class478.anInt5669 * -1796959211;
									if (class478.anIntArray5650 != null) {
										class478 = (class478.method8013(anInterface42_3458, (byte) -60));
										if (class478 != null)
											i_296_ = (class478.anInt5669 * -1796959211);
									}
									if (i_296_ != -1) {
										Class282_Sub36 class282_sub36 = new Class282_Sub36(i_296_);
										class282_sub36.anInt7987 = ((i_293_ + (anInt3472 >> 6)) * 64 + (((Class269) class269).aByte3311) - anInt3472) * -1063198059;
										class282_sub36.anInt7993 = ((i_294_ + (anInt3473 >> 6)) * 64 + (((Class269) class269).aByte3309) - anInt3473) * -992271721;
										aClass482_3459.method8059(class282_sub36, 1062637180);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method5169() {
		for (int i = 0; i < anInt3474; i++) {
			for (int i_297_ = 0; i_297_ < anInt3483; i_297_++) {
				Object object = anObjectArray3488[i + i_297_ * anInt3474];
				if (object != null) {
					if (object instanceof Class282_Sub49) {
						Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
						if (class282_sub49 != null) {
							for (int i_298_ = 0; i_298_ < (((Class282_Sub49) class282_sub49).anIntArray8109).length; i_298_++) {
								Class478 class478 = (aClass474_3455.method7891((((Class282_Sub49) class282_sub49).anIntArray8109[i_298_]), 65280));
								int i_299_ = class478.anInt5669 * -1796959211;
								if (class478.anIntArray5650 != null) {
									class478 = (class478.method8013(anInterface42_3458, (byte) 0));
									if (class478 != null)
										i_299_ = class478.anInt5669 * -1796959211;
								}
								if (i_299_ != -1) {
									Class282_Sub36 class282_sub36 = new Class282_Sub36(i_299_);
									class282_sub36.anInt7987 = i * -1063198059;
									class282_sub36.anInt7993 = i_297_ * -992271721;
									aClass482_3459.method8059(class282_sub36, 2073361062);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class478 class478 = aClass474_3455.method7891(integer.intValue(), 65280);
						int i_300_ = class478.anInt5669 * -1796959211;
						if (class478.anIntArray5650 != null) {
							class478 = class478.method8013(anInterface42_3458, (byte) 117);
							if (class478 != null)
								i_300_ = class478.anInt5669 * -1796959211;
						}
						if (i_300_ != -1) {
							Class282_Sub36 class282_sub36 = new Class282_Sub36(i_300_);
							class282_sub36.anInt7987 = i * -1063198059;
							class282_sub36.anInt7993 = i_297_ * -992271721;
							aClass482_3459.method8059(class282_sub36, -1214068253);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_301_ = 0; i_301_ < anArrayListArrayArrayArray3484[0].length; i_301_++) {
				for (int i_302_ = 0; i_302_ < anArrayListArrayArrayArray3484[0][0].length; i_302_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3484[i][i_301_][i_302_];
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							if (((Class269) class269).anIntArray3313 != null) {
								for (int i_303_ = 0; i_303_ < (((Class269) class269).anIntArray3313).length; i_303_++) {
									Class478 class478 = (aClass474_3455.method7891((((Class269) class269).anIntArray3313[i_303_]), 65280));
									int i_304_ = class478.anInt5669 * -1796959211;
									if (class478.anIntArray5650 != null) {
										class478 = (class478.method8013(anInterface42_3458, (byte) 95));
										if (class478 != null)
											i_304_ = (class478.anInt5669 * -1796959211);
									}
									if (i_304_ != -1) {
										Class282_Sub36 class282_sub36 = new Class282_Sub36(i_304_);
										class282_sub36.anInt7987 = ((i_301_ + (anInt3472 >> 6)) * 64 + (((Class269) class269).aByte3311) - anInt3472) * -1063198059;
										class282_sub36.anInt7993 = ((i_302_ + (anInt3473 >> 6)) * 64 + (((Class269) class269).aByte3309) - anInt3473) * -992271721;
										aClass482_3459.method8059(class282_sub36, -488781677);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method5170(Class505 class505, Class282_Sub36 class282_sub36, int i, int i_305_, int i_306_, int i_307_) {
		class282_sub36.anInt7990 = (anInt3489 + (i_306_ + i * (class282_sub36.anInt7987 * -1306535747 - anInt3485) >> 16)) * -1316454393;
		class282_sub36.anInt7992 = (anInt3492 - (i_307_ + i_305_ * (class282_sub36.anInt7993 * 1012301095 - anInt3465) >> 16)) * -1541159585;
	}

	static void method5171() {
		int[] is = new int[3];
		for (int i = 0; i < aClass283_3470.anInt3382 * -361490119; i++) {
			boolean bool = (aClass282_Sub50_Sub6_3491.method14778(aClass283_3470.anIntArray3381[i] >> 28 & 0x3, aClass283_3470.anIntArray3381[i] >> 14 & 0x3fff, aClass283_3470.anIntArray3381[i] & 0x3fff, is, -1879430261));
			if (bool) {
				Class282_Sub36 class282_sub36 = new Class282_Sub36(aClass283_3470.anIntArray3383[i]);
				class282_sub36.anInt7987 = (is[1] - anInt3472) * -1063198059;
				class282_sub36.anInt7993 = (is[2] - anInt3473) * -992271721;
				aClass482_3459.method8059(class282_sub36, 179459637);
			}
		}
	}

	static void method5172() {
		int[] is = new int[3];
		for (int i = 0; i < aClass283_3470.anInt3382 * -361490119; i++) {
			boolean bool = (aClass282_Sub50_Sub6_3491.method14778(aClass283_3470.anIntArray3381[i] >> 28 & 0x3, aClass283_3470.anIntArray3381[i] >> 14 & 0x3fff, aClass283_3470.anIntArray3381[i] & 0x3fff, is, -1187826998));
			if (bool) {
				Class282_Sub36 class282_sub36 = new Class282_Sub36(aClass283_3470.anIntArray3383[i]);
				class282_sub36.anInt7987 = (is[1] - anInt3472) * -1063198059;
				class282_sub36.anInt7993 = (is[2] - anInt3473) * -992271721;
				aClass482_3459.method8059(class282_sub36, -1133753391);
			}
		}
	}

	static void method5173(Class505 class505, int i, int i_308_, int i_309_, int i_310_) {
		int i_311_ = anInt3480 - anInt3485;
		int i_312_ = anInt3486 - anInt3465;
		if (anInt3480 < anInt3474)
			i_311_++;
		if (anInt3486 < anInt3483)
			i_312_++;
		for (int i_313_ = 0; i_313_ < i_311_; i_313_++) {
			int i_314_ = (i_309_ + i * i_313_ >> 16) + anInt3489;
			int i_315_ = (i_309_ + i * (i_313_ + 1) >> 16) + anInt3489;
			int i_316_ = i_315_ - i_314_;
			if (i_316_ > 0) {
				int i_317_ = anInt3485 + i_313_;
				if (i_317_ < 0 || i_317_ >= anInt3474) {
					for (int i_318_ = 0; i_318_ < i_312_; i_318_++) {
						int i_319_ = (anInt3492 - (i_310_ + i_308_ * (i_318_ + 1) >> 16));
						int i_320_ = anInt3492 - (i_310_ + i_308_ * i_318_ >> 16);
						int i_321_ = i_320_ - i_319_;
						int i_322_;
						if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661 != -1)
							i_322_ = ~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661;
						else if ((i_313_ + anInt3485 & 0x4) != (i_318_ + anInt3486 & 0x4))
							i_322_ = -11840664;
						else
							i_322_ = anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1];
						if (i_322_ == 0)
							i_322_ = -16777216;
						class505.B(i_314_, i_319_, i_316_, i_321_, i_322_, 0);
					}
				} else {
					for (int i_323_ = 0; i_323_ < i_312_; i_323_++) {
						int i_324_ = (anInt3492 - (i_310_ + i_308_ * (i_323_ + 1) >> 16));
						int i_325_ = anInt3492 - (i_310_ + i_308_ * i_323_ >> 16);
						int i_326_ = i_325_ - i_324_;
						if (i_326_ > 0) {
							int i_327_ = i_323_ + anInt3465;
							int i_328_ = i_317_ + i_327_ * anInt3474;
							int i_329_ = 0;
							int i_330_ = 0;
							Object object = null;
							if (i_327_ >= 0 && i_327_ < anInt3483) {
								i_329_ = ((aByteArray3478[i_328_] & 0xff) << 16 | aShortArray3479[i_328_] & 0xffff);
								if (i_329_ != 0)
									i_329_ |= ~0xffffff;
								i_330_ = aByteArray3453[i_328_] & 0xff;
								object = anObjectArray3488[i_328_];
							}
							if (i_329_ == 0 && i_330_ == 0 && object == null) {
								if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538 * 1561906661) != -1)
									i_329_ = (~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661);
								else if ((i_313_ + anInt3485 & 0x4) != (i_323_ + anInt3486 & 0x4))
									i_329_ = -11840664;
								else
									i_329_ = (anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1]);
								if (i_329_ == 0)
									i_329_ = -16777216;
								class505.B(i_314_, i_324_, i_316_, i_326_, i_329_, 0);
							} else if (object != null) {
								if (object instanceof Class282_Sub49) {
									Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
									if (class282_sub49 != null)
										method5142(class505, i_314_, i_324_, i_316_, i_326_, i_329_, i_330_, aByteArray3487[i_328_], (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108), true);
								} else {
									Integer integer = (Integer) object;
									anIntArray3466[0] = integer.intValue();
									aByteArray3467[0] = aByteArray3475[i_328_];
									method5142(class505, i_314_, i_324_, i_316_, i_326_, i_329_, i_330_, aByteArray3487[i_328_], anIntArray3466, aByteArray3467, true);
								}
							} else
								method5142(class505, i_314_, i_324_, i_316_, i_326_, i_329_, i_330_, aByteArray3487[i_328_], null, null, true);
						}
					}
				}
			}
		}
		for (int i_331_ = -16; i_331_ < i_311_ + 16; i_331_++) {
			int i_332_ = (i_309_ + i * i_331_ >> 16) + anInt3489;
			int i_333_ = (i_309_ + i * (i_331_ + 1) >> 16) + anInt3489;
			int i_334_ = i_333_ - i_332_;
			if (i_334_ > 0) {
				int i_335_ = i_331_ + anInt3485;
				if (i_335_ >= 0 && i_335_ < anInt3474) {
					for (int i_336_ = -16; i_336_ < i_312_ + 16; i_336_++) {
						int i_337_ = (anInt3492 - (i_310_ + i_308_ * (i_336_ + 1) >> 16));
						int i_338_ = anInt3492 - (i_310_ + i_308_ * i_336_ >> 16);
						int i_339_ = i_338_ - i_337_;
						if (i_339_ > 0) {
							int i_340_ = i_336_ + anInt3465;
							if (i_340_ >= 0 && i_340_ < anInt3483) {
								Object object = (anObjectArray3488[i_335_ + i_340_ * anInt3474]);
								if (object != null) {
									if (object instanceof Class282_Sub49) {
										Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
										if (class282_sub49 != null)
											method5165(class505, i_332_, i_337_, i_334_, i_339_, (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108));
									} else {
										Integer integer = (Integer) object;
										anIntArray3466[0] = integer.intValue();
										aByteArray3467[0] = (aByteArray3475[i_335_ + i_340_ * anInt3474]);
										method5165(class505, i_332_, i_337_, i_334_, i_339_, anIntArray3466, aByteArray3467);
									}
								} else
									method5165(class505, i_332_, i_337_, i_334_, i_339_, null, null);
							}
						}
					}
				}
			}
		}
		int i_341_ = anInt3485 >> 6;
		int i_342_ = anInt3465 >> 6;
		if (i_341_ < 0)
			i_341_ = 0;
		if (i_342_ < 0)
			i_342_ = 0;
		int i_343_ = anInt3480 >> 6;
		int i_344_ = anInt3486 >> 6;
		if (i_343_ >= anArrayListArrayArrayArray3484[0].length)
			i_343_ = anArrayListArrayArrayArray3484[0].length - 1;
		if (i_344_ >= anArrayListArrayArrayArray3484[0][0].length)
			i_344_ = anArrayListArrayArrayArray3484[0][0].length - 1;
		for (int i_345_ = 0; i_345_ < 3; i_345_++) {
			for (int i_346_ = i_341_; i_346_ <= i_343_; i_346_++) {
				for (int i_347_ = i_342_; i_347_ <= i_344_; i_347_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_345_][i_346_][i_347_]);
					if (arraylist != null) {
						int i_348_ = (i_346_ + (anInt3472 >> 6)) * 64;
						int i_349_ = (i_347_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_350_ = (i_348_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_351_ = (i_349_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_352_ = (i_309_ + i * i_350_ >> 16) + anInt3489;
							int i_353_ = ((i_309_ + i * (i_350_ + 1) >> 16) + anInt3489);
							int i_354_ = (anInt3492 - (i_310_ + i_308_ * (i_351_ + 1) >> 16));
							int i_355_ = anInt3492 - (i_310_ + i_308_ * i_351_ >> 16);
							method5142(class505, i_352_, i_354_, i_353_ - i_352_, i_355_ - i_354_, ((Class269) class269).anInt3310, ((Class269) class269).aByte3308 & 0xff, ((Class269) class269).aByte3312, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314, false);
						}
					}
				}
			}
			for (int i_356_ = i_341_; i_356_ <= i_343_; i_356_++) {
				for (int i_357_ = i_342_; i_357_ <= i_344_; i_357_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_345_][i_356_][i_357_]);
					if (arraylist != null) {
						int i_358_ = (i_356_ + (anInt3472 >> 6)) * 64;
						int i_359_ = (i_357_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_360_ = (i_358_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_361_ = (i_359_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_362_ = (i_309_ + i * i_360_ >> 16) + anInt3489;
							int i_363_ = ((i_309_ + i * (i_360_ + 1) >> 16) + anInt3489);
							int i_364_ = (anInt3492 - (i_310_ + i_308_ * (i_361_ + 1) >> 16));
							int i_365_ = anInt3492 - (i_310_ + i_308_ * i_361_ >> 16);
							method5165(class505, i_362_, i_364_, i_363_ - i_362_, i_365_ - i_364_, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314);
						}
					}
				}
			}
		}
	}

	static void method5174() {
		int[] is = new int[3];
		for (int i = 0; i < aClass283_3470.anInt3382 * -361490119; i++) {
			boolean bool = (aClass282_Sub50_Sub6_3491.method14778(aClass283_3470.anIntArray3381[i] >> 28 & 0x3, aClass283_3470.anIntArray3381[i] >> 14 & 0x3fff, aClass283_3470.anIntArray3381[i] & 0x3fff, is, -1731634913));
			if (bool) {
				Class282_Sub36 class282_sub36 = new Class282_Sub36(aClass283_3470.anIntArray3383[i]);
				class282_sub36.anInt7987 = (is[1] - anInt3472) * -1063198059;
				class282_sub36.anInt7993 = (is[2] - anInt3473) * -992271721;
				aClass482_3459.method8059(class282_sub36, -560486575);
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

	static void method5176(int i, int i_367_, int i_368_, int i_369_, int i_370_, int i_371_, int i_372_, int i_373_) {
		anInt3485 = i - anInt3472;
		anInt3486 = i_367_ - anInt3473;
		anInt3480 = i_368_ - anInt3472;
		anInt3465 = i_369_ - anInt3473;
		anInt3489 = i_370_;
		anInt3490 = i_371_;
		anInt3476 = i_372_;
		anInt3492 = i_373_;
	}

	static void method5177(byte[] is, byte[] is_374_, short[] is_375_, int i, int i_376_) {
		int[] is_377_ = new int[anInt3483];
		int[] is_378_ = new int[anInt3483];
		int[] is_379_ = new int[anInt3483];
		int[] is_380_ = new int[anInt3483];
		int[] is_381_ = new int[anInt3483];
		for (int i_382_ = -5; i_382_ < anInt3474; i_382_++) {
			int i_383_ = i_382_ + 5;
			int i_384_ = i_382_ - 5;
			for (int i_385_ = 0; i_385_ < anInt3483; i_385_++) {
				if (i_383_ < anInt3474) {
					int i_386_ = is[i_383_ + i_385_ * anInt3474] & 0xff;
					if (i_386_ > 0) {
						Class481 class481 = aClass479_3471.method8025(i_386_ - 1, (byte) -18);
						is_377_[i_385_] += class481.anInt5724 * -520008741;
						is_378_[i_385_] += class481.anInt5726 * -771727201;
						is_379_[i_385_] += class481.anInt5725 * 1389910939;
						is_380_[i_385_] += class481.anInt5718 * -45673991;
						is_381_[i_385_]++;
					}
				}
				if (i_384_ >= 0) {
					int i_387_ = is[i_384_ + i_385_ * anInt3474] & 0xff;
					if (i_387_ > 0) {
						Class481 class481 = aClass479_3471.method8025(i_387_ - 1, (byte) -31);
						is_377_[i_385_] -= class481.anInt5724 * -520008741;
						is_378_[i_385_] -= class481.anInt5726 * -771727201;
						is_379_[i_385_] -= class481.anInt5725 * 1389910939;
						is_380_[i_385_] -= class481.anInt5718 * -45673991;
						is_381_[i_385_]--;
					}
				}
			}
			if (i_382_ >= 0) {
				int i_388_ = 0;
				int i_389_ = 0;
				int i_390_ = 0;
				int i_391_ = 0;
				int i_392_ = 0;
				for (int i_393_ = -5; i_393_ < anInt3483; i_393_++) {
					int i_394_ = i_393_ + 5;
					if (i_394_ < anInt3483) {
						i_388_ += is_377_[i_394_];
						i_389_ += is_378_[i_394_];
						i_390_ += is_379_[i_394_];
						i_391_ += is_380_[i_394_];
						i_392_ += is_381_[i_394_];
					}
					int i_395_ = i_393_ - 5;
					if (i_395_ >= 0) {
						i_388_ -= is_377_[i_395_];
						i_389_ -= is_378_[i_395_];
						i_390_ -= is_379_[i_395_];
						i_391_ -= is_380_[i_395_];
						i_392_ -= is_381_[i_395_];
					}
					if (i_393_ >= 0 && i_392_ > 0) {
						if ((is[i_382_ + i_393_ * anInt3474] & 0xff) == 0) {
							int i_396_ = i_382_ + i_393_ * anInt3474;
							is_374_[i_396_] = (byte) 0;
							is_375_[i_396_] = (short) 0;
						} else {
							int i_397_ = (i_391_ == 0 ? 0 : Class371.method6348(i_388_ * 256 / i_391_, i_389_ / i_392_, i_390_ / i_392_, 805946453));
							int i_398_ = (i_397_ & 0x7f) + i_376_;
							if (i_398_ < 0)
								i_398_ = 0;
							else if (i_398_ > 127)
								i_398_ = 127;
							int i_399_ = ((i_397_ + i & 0xfc00) + (i_397_ & 0x380) + i_398_);
							int i_400_ = i_382_ + i_393_ * anInt3474;
							int i_401_ = (Class335.anIntArray3916[(Class372.method6362(Class96_Sub21.method14677(i_399_, 96, -74258659), 667882444)) & 0xffff]);
							is_374_[i_400_] = (byte) (i_401_ >> 16 & 0xff);
							is_375_[i_400_] = (short) (i_401_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method5178(Class505 class505) {
		int i = anInt3480 - anInt3485;
		int i_402_ = anInt3486 - anInt3465;
		int i_403_ = (anInt3476 - anInt3489 << 16) / i;
		int i_404_ = (anInt3492 - anInt3490 << 16) / i_402_;
		method5131(class505, i_403_, i_404_, 0, 0);
	}

	static Class482 method5179(Class505 class505, int i, int i_405_, int i_406_, int i_407_) {
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass482_3459.method8097((byte) 82); class282_sub36 != null; class282_sub36 = (Class282_Sub36) aClass482_3459.method8067(-413792246))
			method5146(class505, class282_sub36, i, i_405_, i_406_, i_407_);
		return aClass482_3459;
	}

	static void method5180(Class505 class505) {
		int i = anInt3480 - anInt3485;
		int i_408_ = anInt3486 - anInt3465;
		int i_409_ = (anInt3476 - anInt3489 << 16) / i;
		int i_410_ = (anInt3492 - anInt3490 << 16) / i_408_;
		method5131(class505, i_409_, i_410_, 0, 0);
	}

	static void method5181(Class505 class505, int i, int i_411_, int i_412_, int i_413_) {
		int i_414_ = anInt3480 - anInt3485;
		int i_415_ = anInt3486 - anInt3465;
		if (anInt3480 < anInt3474)
			i_414_++;
		if (anInt3486 < anInt3483)
			i_415_++;
		for (int i_416_ = 0; i_416_ < i_414_; i_416_++) {
			int i_417_ = (i_412_ + i * i_416_ >> 16) + anInt3489;
			int i_418_ = (i_412_ + i * (i_416_ + 1) >> 16) + anInt3489;
			int i_419_ = i_418_ - i_417_;
			if (i_419_ > 0) {
				int i_420_ = anInt3485 + i_416_;
				if (i_420_ < 0 || i_420_ >= anInt3474) {
					for (int i_421_ = 0; i_421_ < i_415_; i_421_++) {
						int i_422_ = (anInt3492 - (i_413_ + i_411_ * (i_421_ + 1) >> 16));
						int i_423_ = anInt3492 - (i_413_ + i_411_ * i_421_ >> 16);
						int i_424_ = i_423_ - i_422_;
						int i_425_;
						if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661 != -1)
							i_425_ = ~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661;
						else if ((i_416_ + anInt3485 & 0x4) != (i_421_ + anInt3486 & 0x4))
							i_425_ = -11840664;
						else
							i_425_ = anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1];
						if (i_425_ == 0)
							i_425_ = -16777216;
						class505.B(i_417_, i_422_, i_419_, i_424_, i_425_, 0);
					}
				} else {
					for (int i_426_ = 0; i_426_ < i_415_; i_426_++) {
						int i_427_ = (anInt3492 - (i_413_ + i_411_ * (i_426_ + 1) >> 16));
						int i_428_ = anInt3492 - (i_413_ + i_411_ * i_426_ >> 16);
						int i_429_ = i_428_ - i_427_;
						if (i_429_ > 0) {
							int i_430_ = i_426_ + anInt3465;
							int i_431_ = i_420_ + i_430_ * anInt3474;
							int i_432_ = 0;
							int i_433_ = 0;
							Object object = null;
							if (i_430_ >= 0 && i_430_ < anInt3483) {
								i_432_ = ((aByteArray3478[i_431_] & 0xff) << 16 | aShortArray3479[i_431_] & 0xffff);
								if (i_432_ != 0)
									i_432_ |= ~0xffffff;
								i_433_ = aByteArray3453[i_431_] & 0xff;
								object = anObjectArray3488[i_431_];
							}
							if (i_432_ == 0 && i_433_ == 0 && object == null) {
								if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538 * 1561906661) != -1)
									i_432_ = (~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661);
								else if ((i_416_ + anInt3485 & 0x4) != (i_426_ + anInt3486 & 0x4))
									i_432_ = -11840664;
								else
									i_432_ = (anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1]);
								if (i_432_ == 0)
									i_432_ = -16777216;
								class505.B(i_417_, i_427_, i_419_, i_429_, i_432_, 0);
							} else if (object != null) {
								if (object instanceof Class282_Sub49) {
									Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
									if (class282_sub49 != null)
										method5142(class505, i_417_, i_427_, i_419_, i_429_, i_432_, i_433_, aByteArray3487[i_431_], (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108), true);
								} else {
									Integer integer = (Integer) object;
									anIntArray3466[0] = integer.intValue();
									aByteArray3467[0] = aByteArray3475[i_431_];
									method5142(class505, i_417_, i_427_, i_419_, i_429_, i_432_, i_433_, aByteArray3487[i_431_], anIntArray3466, aByteArray3467, true);
								}
							} else
								method5142(class505, i_417_, i_427_, i_419_, i_429_, i_432_, i_433_, aByteArray3487[i_431_], null, null, true);
						}
					}
				}
			}
		}
		for (int i_434_ = -16; i_434_ < i_414_ + 16; i_434_++) {
			int i_435_ = (i_412_ + i * i_434_ >> 16) + anInt3489;
			int i_436_ = (i_412_ + i * (i_434_ + 1) >> 16) + anInt3489;
			int i_437_ = i_436_ - i_435_;
			if (i_437_ > 0) {
				int i_438_ = i_434_ + anInt3485;
				if (i_438_ >= 0 && i_438_ < anInt3474) {
					for (int i_439_ = -16; i_439_ < i_415_ + 16; i_439_++) {
						int i_440_ = (anInt3492 - (i_413_ + i_411_ * (i_439_ + 1) >> 16));
						int i_441_ = anInt3492 - (i_413_ + i_411_ * i_439_ >> 16);
						int i_442_ = i_441_ - i_440_;
						if (i_442_ > 0) {
							int i_443_ = i_439_ + anInt3465;
							if (i_443_ >= 0 && i_443_ < anInt3483) {
								Object object = (anObjectArray3488[i_438_ + i_443_ * anInt3474]);
								if (object != null) {
									if (object instanceof Class282_Sub49) {
										Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
										if (class282_sub49 != null)
											method5165(class505, i_435_, i_440_, i_437_, i_442_, (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108));
									} else {
										Integer integer = (Integer) object;
										anIntArray3466[0] = integer.intValue();
										aByteArray3467[0] = (aByteArray3475[i_438_ + i_443_ * anInt3474]);
										method5165(class505, i_435_, i_440_, i_437_, i_442_, anIntArray3466, aByteArray3467);
									}
								} else
									method5165(class505, i_435_, i_440_, i_437_, i_442_, null, null);
							}
						}
					}
				}
			}
		}
		int i_444_ = anInt3485 >> 6;
		int i_445_ = anInt3465 >> 6;
		if (i_444_ < 0)
			i_444_ = 0;
		if (i_445_ < 0)
			i_445_ = 0;
		int i_446_ = anInt3480 >> 6;
		int i_447_ = anInt3486 >> 6;
		if (i_446_ >= anArrayListArrayArrayArray3484[0].length)
			i_446_ = anArrayListArrayArrayArray3484[0].length - 1;
		if (i_447_ >= anArrayListArrayArrayArray3484[0][0].length)
			i_447_ = anArrayListArrayArrayArray3484[0][0].length - 1;
		for (int i_448_ = 0; i_448_ < 3; i_448_++) {
			for (int i_449_ = i_444_; i_449_ <= i_446_; i_449_++) {
				for (int i_450_ = i_445_; i_450_ <= i_447_; i_450_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_448_][i_449_][i_450_]);
					if (arraylist != null) {
						int i_451_ = (i_449_ + (anInt3472 >> 6)) * 64;
						int i_452_ = (i_450_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_453_ = (i_451_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_454_ = (i_452_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_455_ = (i_412_ + i * i_453_ >> 16) + anInt3489;
							int i_456_ = ((i_412_ + i * (i_453_ + 1) >> 16) + anInt3489);
							int i_457_ = (anInt3492 - (i_413_ + i_411_ * (i_454_ + 1) >> 16));
							int i_458_ = anInt3492 - (i_413_ + i_411_ * i_454_ >> 16);
							method5142(class505, i_455_, i_457_, i_456_ - i_455_, i_458_ - i_457_, ((Class269) class269).anInt3310, ((Class269) class269).aByte3308 & 0xff, ((Class269) class269).aByte3312, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314, false);
						}
					}
				}
			}
			for (int i_459_ = i_444_; i_459_ <= i_446_; i_459_++) {
				for (int i_460_ = i_445_; i_460_ <= i_447_; i_460_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_448_][i_459_][i_460_]);
					if (arraylist != null) {
						int i_461_ = (i_459_ + (anInt3472 >> 6)) * 64;
						int i_462_ = (i_460_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_463_ = (i_461_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_464_ = (i_462_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_465_ = (i_412_ + i * i_463_ >> 16) + anInt3489;
							int i_466_ = ((i_412_ + i * (i_463_ + 1) >> 16) + anInt3489);
							int i_467_ = (anInt3492 - (i_413_ + i_411_ * (i_464_ + 1) >> 16));
							int i_468_ = anInt3492 - (i_413_ + i_411_ * i_464_ >> 16);
							method5165(class505, i_465_, i_467_, i_466_ - i_465_, i_468_ - i_467_, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314);
						}
					}
				}
			}
		}
	}

	static void method5182(Class505 class505, int i, int i_469_, int i_470_, int i_471_) {
		int i_472_ = anInt3480 - anInt3485;
		int i_473_ = anInt3486 - anInt3465;
		if (anInt3480 < anInt3474)
			i_472_++;
		if (anInt3486 < anInt3483)
			i_473_++;
		for (int i_474_ = 0; i_474_ < i_472_; i_474_++) {
			int i_475_ = (i_470_ + i * i_474_ >> 16) + anInt3489;
			int i_476_ = (i_470_ + i * (i_474_ + 1) >> 16) + anInt3489;
			int i_477_ = i_476_ - i_475_;
			if (i_477_ > 0) {
				int i_478_ = anInt3485 + i_474_;
				if (i_478_ < 0 || i_478_ >= anInt3474) {
					for (int i_479_ = 0; i_479_ < i_473_; i_479_++) {
						int i_480_ = (anInt3492 - (i_471_ + i_469_ * (i_479_ + 1) >> 16));
						int i_481_ = anInt3492 - (i_471_ + i_469_ * i_479_ >> 16);
						int i_482_ = i_481_ - i_480_;
						int i_483_;
						if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661 != -1)
							i_483_ = ~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661;
						else if ((i_474_ + anInt3485 & 0x4) != (i_479_ + anInt3486 & 0x4))
							i_483_ = -11840664;
						else
							i_483_ = anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1];
						if (i_483_ == 0)
							i_483_ = -16777216;
						class505.B(i_475_, i_480_, i_477_, i_482_, i_483_, 0);
					}
				} else {
					for (int i_484_ = 0; i_484_ < i_473_; i_484_++) {
						int i_485_ = (anInt3492 - (i_471_ + i_469_ * (i_484_ + 1) >> 16));
						int i_486_ = anInt3492 - (i_471_ + i_469_ * i_484_ >> 16);
						int i_487_ = i_486_ - i_485_;
						if (i_487_ > 0) {
							int i_488_ = i_484_ + anInt3465;
							int i_489_ = i_478_ + i_488_ * anInt3474;
							int i_490_ = 0;
							int i_491_ = 0;
							Object object = null;
							if (i_488_ >= 0 && i_488_ < anInt3483) {
								i_490_ = ((aByteArray3478[i_489_] & 0xff) << 16 | aShortArray3479[i_489_] & 0xffff);
								if (i_490_ != 0)
									i_490_ |= ~0xffffff;
								i_491_ = aByteArray3453[i_489_] & 0xff;
								object = anObjectArray3488[i_489_];
							}
							if (i_490_ == 0 && i_491_ == 0 && object == null) {
								if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538 * 1561906661) != -1)
									i_490_ = (~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661);
								else if ((i_474_ + anInt3485 & 0x4) != (i_484_ + anInt3486 & 0x4))
									i_490_ = -11840664;
								else
									i_490_ = (anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1]);
								if (i_490_ == 0)
									i_490_ = -16777216;
								class505.B(i_475_, i_485_, i_477_, i_487_, i_490_, 0);
							} else if (object != null) {
								if (object instanceof Class282_Sub49) {
									Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
									if (class282_sub49 != null)
										method5142(class505, i_475_, i_485_, i_477_, i_487_, i_490_, i_491_, aByteArray3487[i_489_], (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108), true);
								} else {
									Integer integer = (Integer) object;
									anIntArray3466[0] = integer.intValue();
									aByteArray3467[0] = aByteArray3475[i_489_];
									method5142(class505, i_475_, i_485_, i_477_, i_487_, i_490_, i_491_, aByteArray3487[i_489_], anIntArray3466, aByteArray3467, true);
								}
							} else
								method5142(class505, i_475_, i_485_, i_477_, i_487_, i_490_, i_491_, aByteArray3487[i_489_], null, null, true);
						}
					}
				}
			}
		}
		for (int i_492_ = -16; i_492_ < i_472_ + 16; i_492_++) {
			int i_493_ = (i_470_ + i * i_492_ >> 16) + anInt3489;
			int i_494_ = (i_470_ + i * (i_492_ + 1) >> 16) + anInt3489;
			int i_495_ = i_494_ - i_493_;
			if (i_495_ > 0) {
				int i_496_ = i_492_ + anInt3485;
				if (i_496_ >= 0 && i_496_ < anInt3474) {
					for (int i_497_ = -16; i_497_ < i_473_ + 16; i_497_++) {
						int i_498_ = (anInt3492 - (i_471_ + i_469_ * (i_497_ + 1) >> 16));
						int i_499_ = anInt3492 - (i_471_ + i_469_ * i_497_ >> 16);
						int i_500_ = i_499_ - i_498_;
						if (i_500_ > 0) {
							int i_501_ = i_497_ + anInt3465;
							if (i_501_ >= 0 && i_501_ < anInt3483) {
								Object object = (anObjectArray3488[i_496_ + i_501_ * anInt3474]);
								if (object != null) {
									if (object instanceof Class282_Sub49) {
										Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
										if (class282_sub49 != null)
											method5165(class505, i_493_, i_498_, i_495_, i_500_, (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108));
									} else {
										Integer integer = (Integer) object;
										anIntArray3466[0] = integer.intValue();
										aByteArray3467[0] = (aByteArray3475[i_496_ + i_501_ * anInt3474]);
										method5165(class505, i_493_, i_498_, i_495_, i_500_, anIntArray3466, aByteArray3467);
									}
								} else
									method5165(class505, i_493_, i_498_, i_495_, i_500_, null, null);
							}
						}
					}
				}
			}
		}
		int i_502_ = anInt3485 >> 6;
		int i_503_ = anInt3465 >> 6;
		if (i_502_ < 0)
			i_502_ = 0;
		if (i_503_ < 0)
			i_503_ = 0;
		int i_504_ = anInt3480 >> 6;
		int i_505_ = anInt3486 >> 6;
		if (i_504_ >= anArrayListArrayArrayArray3484[0].length)
			i_504_ = anArrayListArrayArrayArray3484[0].length - 1;
		if (i_505_ >= anArrayListArrayArrayArray3484[0][0].length)
			i_505_ = anArrayListArrayArrayArray3484[0][0].length - 1;
		for (int i_506_ = 0; i_506_ < 3; i_506_++) {
			for (int i_507_ = i_502_; i_507_ <= i_504_; i_507_++) {
				for (int i_508_ = i_503_; i_508_ <= i_505_; i_508_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_506_][i_507_][i_508_]);
					if (arraylist != null) {
						int i_509_ = (i_507_ + (anInt3472 >> 6)) * 64;
						int i_510_ = (i_508_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_511_ = (i_509_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_512_ = (i_510_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_513_ = (i_470_ + i * i_511_ >> 16) + anInt3489;
							int i_514_ = ((i_470_ + i * (i_511_ + 1) >> 16) + anInt3489);
							int i_515_ = (anInt3492 - (i_471_ + i_469_ * (i_512_ + 1) >> 16));
							int i_516_ = anInt3492 - (i_471_ + i_469_ * i_512_ >> 16);
							method5142(class505, i_513_, i_515_, i_514_ - i_513_, i_516_ - i_515_, ((Class269) class269).anInt3310, ((Class269) class269).aByte3308 & 0xff, ((Class269) class269).aByte3312, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314, false);
						}
					}
				}
			}
			for (int i_517_ = i_502_; i_517_ <= i_504_; i_517_++) {
				for (int i_518_ = i_503_; i_518_ <= i_505_; i_518_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_506_][i_517_][i_518_]);
					if (arraylist != null) {
						int i_519_ = (i_517_ + (anInt3472 >> 6)) * 64;
						int i_520_ = (i_518_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_521_ = (i_519_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_522_ = (i_520_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_523_ = (i_470_ + i * i_521_ >> 16) + anInt3489;
							int i_524_ = ((i_470_ + i * (i_521_ + 1) >> 16) + anInt3489);
							int i_525_ = (anInt3492 - (i_471_ + i_469_ * (i_522_ + 1) >> 16));
							int i_526_ = anInt3492 - (i_471_ + i_469_ * i_522_ >> 16);
							method5165(class505, i_523_, i_525_, i_524_ - i_523_, i_526_ - i_525_, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314);
						}
					}
				}
			}
		}
	}

	static void method5183(Class505 class505, int i, int i_527_) {
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
		aByteArray3478 = new byte[anInt3474 * anInt3483];
		aShortArray3479 = new short[anInt3474 * anInt3483];
		for (int i_547_ = 0; i_547_ < 3; i_547_++) {
			byte[] is_548_ = new byte[anInt3474 * anInt3483];
			for (int i_549_ = 0; i_549_ < anArrayListArrayArrayArray3484[i_547_].length; i_549_++) {
				for (int i_550_ = 0; i_550_ < anArrayListArrayArrayArray3484[i_547_][0].length; i_550_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_547_][i_549_][i_550_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							is_548_[(i_549_ * 64 + ((Class269) class269).aByte3311 + ((i_550_ * 64 + ((Class269) class269).aByte3309) * anInt3474))] = (byte) ((Class269) class269).anInt3310;
						}
					}
				}
			}
			method5194(is_548_, aByteArray3478, aShortArray3479, i, i_527_);
			for (int i_551_ = 0; i_551_ < anArrayListArrayArrayArray3484[i_547_].length; i_551_++) {
				for (int i_552_ = 0; i_552_ < anArrayListArrayArrayArray3484[i_547_][0].length; i_552_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_547_][i_551_][i_552_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_553_ = (i_551_ * 64 + ((Class269) class269).aByte3311 + ((i_552_ * 64 + ((Class269) class269).aByte3309) * anInt3474));
							((Class269) class269).anInt3310 = ((aByteArray3478[i_553_] & 0xff) << 16 | aShortArray3479[i_553_] & 0xffff);
							if (((Class269) class269).anInt3310 != 0)
								((Class269) class269).anInt3310 |= ~0xffffff;
						}
					}
				}
			}
		}
		method5194(aByteArray3477, aByteArray3478, aShortArray3479, i, i_527_);
		aByteArray3477 = null;
		method5136();
	}

	static void method5184(Class505 class505, int i, int i_554_, int i_555_, int i_556_) {
		int i_557_ = anInt3480 - anInt3485;
		int i_558_ = anInt3486 - anInt3465;
		if (anInt3480 < anInt3474)
			i_557_++;
		if (anInt3486 < anInt3483)
			i_558_++;
		for (int i_559_ = 0; i_559_ < i_557_; i_559_++) {
			int i_560_ = (i_555_ + i * i_559_ >> 16) + anInt3489;
			int i_561_ = (i_555_ + i * (i_559_ + 1) >> 16) + anInt3489;
			int i_562_ = i_561_ - i_560_;
			if (i_562_ > 0) {
				int i_563_ = anInt3485 + i_559_;
				if (i_563_ < 0 || i_563_ >= anInt3474) {
					for (int i_564_ = 0; i_564_ < i_558_; i_564_++) {
						int i_565_ = (anInt3492 - (i_556_ + i_554_ * (i_564_ + 1) >> 16));
						int i_566_ = anInt3492 - (i_556_ + i_554_ * i_564_ >> 16);
						int i_567_ = i_566_ - i_565_;
						int i_568_;
						if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661 != -1)
							i_568_ = ~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661;
						else if ((i_559_ + anInt3485 & 0x4) != (i_564_ + anInt3486 & 0x4))
							i_568_ = -11840664;
						else
							i_568_ = anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1];
						if (i_568_ == 0)
							i_568_ = -16777216;
						class505.B(i_560_, i_565_, i_562_, i_567_, i_568_, 0);
					}
				} else {
					for (int i_569_ = 0; i_569_ < i_558_; i_569_++) {
						int i_570_ = (anInt3492 - (i_556_ + i_554_ * (i_569_ + 1) >> 16));
						int i_571_ = anInt3492 - (i_556_ + i_554_ * i_569_ >> 16);
						int i_572_ = i_571_ - i_570_;
						if (i_572_ > 0) {
							int i_573_ = i_569_ + anInt3465;
							int i_574_ = i_563_ + i_573_ * anInt3474;
							int i_575_ = 0;
							int i_576_ = 0;
							Object object = null;
							if (i_573_ >= 0 && i_573_ < anInt3483) {
								i_575_ = ((aByteArray3478[i_574_] & 0xff) << 16 | aShortArray3479[i_574_] & 0xffff);
								if (i_575_ != 0)
									i_575_ |= ~0xffffff;
								i_576_ = aByteArray3453[i_574_] & 0xff;
								object = anObjectArray3488[i_574_];
							}
							if (i_575_ == 0 && i_576_ == 0 && object == null) {
								if ((((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538 * 1561906661) != -1)
									i_575_ = (~0xffffff | (((Class282_Sub50_Sub6) aClass282_Sub50_Sub6_3491).anInt9538) * 1561906661);
								else if ((i_559_ + anInt3485 & 0x4) != (i_569_ + anInt3486 & 0x4))
									i_575_ = -11840664;
								else
									i_575_ = (anIntArray3481[(aClass536_3482.anInt7093 * -1657184237) + 1]);
								if (i_575_ == 0)
									i_575_ = -16777216;
								class505.B(i_560_, i_570_, i_562_, i_572_, i_575_, 0);
							} else if (object != null) {
								if (object instanceof Class282_Sub49) {
									Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
									if (class282_sub49 != null)
										method5142(class505, i_560_, i_570_, i_562_, i_572_, i_575_, i_576_, aByteArray3487[i_574_], (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108), true);
								} else {
									Integer integer = (Integer) object;
									anIntArray3466[0] = integer.intValue();
									aByteArray3467[0] = aByteArray3475[i_574_];
									method5142(class505, i_560_, i_570_, i_562_, i_572_, i_575_, i_576_, aByteArray3487[i_574_], anIntArray3466, aByteArray3467, true);
								}
							} else
								method5142(class505, i_560_, i_570_, i_562_, i_572_, i_575_, i_576_, aByteArray3487[i_574_], null, null, true);
						}
					}
				}
			}
		}
		for (int i_577_ = -16; i_577_ < i_557_ + 16; i_577_++) {
			int i_578_ = (i_555_ + i * i_577_ >> 16) + anInt3489;
			int i_579_ = (i_555_ + i * (i_577_ + 1) >> 16) + anInt3489;
			int i_580_ = i_579_ - i_578_;
			if (i_580_ > 0) {
				int i_581_ = i_577_ + anInt3485;
				if (i_581_ >= 0 && i_581_ < anInt3474) {
					for (int i_582_ = -16; i_582_ < i_558_ + 16; i_582_++) {
						int i_583_ = (anInt3492 - (i_556_ + i_554_ * (i_582_ + 1) >> 16));
						int i_584_ = anInt3492 - (i_556_ + i_554_ * i_582_ >> 16);
						int i_585_ = i_584_ - i_583_;
						if (i_585_ > 0) {
							int i_586_ = i_582_ + anInt3465;
							if (i_586_ >= 0 && i_586_ < anInt3483) {
								Object object = (anObjectArray3488[i_581_ + i_586_ * anInt3474]);
								if (object != null) {
									if (object instanceof Class282_Sub49) {
										Class282_Sub49 class282_sub49 = (Class282_Sub49) object;
										if (class282_sub49 != null)
											method5165(class505, i_578_, i_583_, i_580_, i_585_, (((Class282_Sub49) class282_sub49).anIntArray8109), (((Class282_Sub49) class282_sub49).aByteArray8108));
									} else {
										Integer integer = (Integer) object;
										anIntArray3466[0] = integer.intValue();
										aByteArray3467[0] = (aByteArray3475[i_581_ + i_586_ * anInt3474]);
										method5165(class505, i_578_, i_583_, i_580_, i_585_, anIntArray3466, aByteArray3467);
									}
								} else
									method5165(class505, i_578_, i_583_, i_580_, i_585_, null, null);
							}
						}
					}
				}
			}
		}
		int i_587_ = anInt3485 >> 6;
		int i_588_ = anInt3465 >> 6;
		if (i_587_ < 0)
			i_587_ = 0;
		if (i_588_ < 0)
			i_588_ = 0;
		int i_589_ = anInt3480 >> 6;
		int i_590_ = anInt3486 >> 6;
		if (i_589_ >= anArrayListArrayArrayArray3484[0].length)
			i_589_ = anArrayListArrayArrayArray3484[0].length - 1;
		if (i_590_ >= anArrayListArrayArrayArray3484[0][0].length)
			i_590_ = anArrayListArrayArrayArray3484[0][0].length - 1;
		for (int i_591_ = 0; i_591_ < 3; i_591_++) {
			for (int i_592_ = i_587_; i_592_ <= i_589_; i_592_++) {
				for (int i_593_ = i_588_; i_593_ <= i_590_; i_593_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_591_][i_592_][i_593_]);
					if (arraylist != null) {
						int i_594_ = (i_592_ + (anInt3472 >> 6)) * 64;
						int i_595_ = (i_593_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_596_ = (i_594_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_597_ = (i_595_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_598_ = (i_555_ + i * i_596_ >> 16) + anInt3489;
							int i_599_ = ((i_555_ + i * (i_596_ + 1) >> 16) + anInt3489);
							int i_600_ = (anInt3492 - (i_556_ + i_554_ * (i_597_ + 1) >> 16));
							int i_601_ = anInt3492 - (i_556_ + i_554_ * i_597_ >> 16);
							method5142(class505, i_598_, i_600_, i_599_ - i_598_, i_601_ - i_600_, ((Class269) class269).anInt3310, ((Class269) class269).aByte3308 & 0xff, ((Class269) class269).aByte3312, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314, false);
						}
					}
				}
			}
			for (int i_602_ = i_587_; i_602_ <= i_589_; i_602_++) {
				for (int i_603_ = i_588_; i_603_ <= i_590_; i_603_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_591_][i_602_][i_603_]);
					if (arraylist != null) {
						int i_604_ = (i_602_ + (anInt3472 >> 6)) * 64;
						int i_605_ = (i_603_ + (anInt3473 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_606_ = (i_604_ + ((Class269) class269).aByte3311 - anInt3472 - anInt3485);
							int i_607_ = (i_605_ + ((Class269) class269).aByte3309 - anInt3473 - anInt3465);
							int i_608_ = (i_555_ + i * i_606_ >> 16) + anInt3489;
							int i_609_ = ((i_555_ + i * (i_606_ + 1) >> 16) + anInt3489);
							int i_610_ = (anInt3492 - (i_556_ + i_554_ * (i_607_ + 1) >> 16));
							int i_611_ = anInt3492 - (i_556_ + i_554_ * i_607_ >> 16);
							method5165(class505, i_608_, i_610_, i_609_ - i_608_, i_611_ - i_610_, ((Class269) class269).anIntArray3313, ((Class269) class269).aByteArray3314);
						}
					}
				}
			}
		}
	}

	static void method5185(Class505 class505, int i, int i_612_, int i_613_, int i_614_, int[] is, byte[] is_615_) {
		if (is != null) {
			for (int i_616_ = 0; i_616_ < is.length; i_616_++) {
				Class478 class478 = aClass474_3455.method7891(is[i_616_], 65280);
				int i_617_ = class478.anInt5689 * -272332433;
				if (i_617_ != -1) {
					Class418 class418 = aClass427_3457.method7172(i_617_, -1014703371);
					Class160 class160 = class418.method7010(class505, (class478.aBool5671 ? is_615_[i_616_] >> 6 & 0x3 : 0), (class478.aBool5673 ? class478.aBool5674 : false), (byte) 29);
					if (class160 != null) {
						int i_618_ = i_613_ * class160.method228() >> 2;
						int i_619_ = i_614_ * class160.method2748() >> 2;
						if (class418.aBool4996) {
							int i_620_ = class478.anInt5648 * -752356381;
							int i_621_ = class478.anInt5649 * -1610844647;
							if ((is_615_[i_616_] >> 6 & 0x1) == 1) {
								int i_622_ = i_620_;
								i_620_ = i_621_;
								i_621_ = i_622_;
							}
							i_618_ = i_620_ * i_613_;
							i_619_ = i_621_ * i_614_;
						}
						if (i_618_ != 0 && i_619_ != 0) {
							if (class418.anInt4997 * -104422635 != 0)
								class160.method2754(i, i_612_ - i_619_ + i_614_, i_618_, i_619_, 0, (~0xffffff | (class418.anInt4997 * -104422635)), 1);
							else
								class160.method2789(i, i_612_ - i_619_ + i_614_, i_618_, i_619_);
						}
					}
				}
			}
		}
	}

	static void method5186(Class505 class505, int i, int i_623_, int i_624_, int i_625_, int[] is, byte[] is_626_) {
		if (is != null) {
			for (int i_627_ = 0; i_627_ < is.length; i_627_++) {
				Class478 class478 = aClass474_3455.method7891(is[i_627_], 65280);
				int i_628_ = class478.anInt5689 * -272332433;
				if (i_628_ != -1) {
					Class418 class418 = aClass427_3457.method7172(i_628_, -1014703371);
					Class160 class160 = class418.method7010(class505, (class478.aBool5671 ? is_626_[i_627_] >> 6 & 0x3 : 0), (class478.aBool5673 ? class478.aBool5674 : false), (byte) 87);
					if (class160 != null) {
						int i_629_ = i_624_ * class160.method228() >> 2;
						int i_630_ = i_625_ * class160.method2748() >> 2;
						if (class418.aBool4996) {
							int i_631_ = class478.anInt5648 * -752356381;
							int i_632_ = class478.anInt5649 * -1610844647;
							if ((is_626_[i_627_] >> 6 & 0x1) == 1) {
								int i_633_ = i_631_;
								i_631_ = i_632_;
								i_632_ = i_633_;
							}
							i_629_ = i_631_ * i_624_;
							i_630_ = i_632_ * i_625_;
						}
						if (i_629_ != 0 && i_630_ != 0) {
							if (class418.anInt4997 * -104422635 != 0)
								class160.method2754(i, i_623_ - i_630_ + i_625_, i_629_, i_630_, 0, (~0xffffff | (class418.anInt4997 * -104422635)), 1);
							else
								class160.method2789(i, i_623_ - i_630_ + i_625_, i_629_, i_630_);
						}
					}
				}
			}
		}
	}

	static Class482 method5187(Class505 class505) {
		int i = anInt3480 - anInt3485;
		int i_634_ = anInt3486 - anInt3465;
		int i_635_ = (anInt3476 - anInt3489 << 16) / i;
		int i_636_ = (anInt3492 - anInt3490 << 16) / i_634_;
		return method5179(class505, i_635_, i_636_, 0, 0);
	}

	static Class482 method5188(Class505 class505) {
		int i = anInt3480 - anInt3485;
		int i_637_ = anInt3486 - anInt3465;
		int i_638_ = (anInt3476 - anInt3489 << 16) / i;
		int i_639_ = (anInt3492 - anInt3490 << 16) / i_637_;
		return method5179(class505, i_638_, i_639_, 0, 0);
	}

	public static Class477 method5189(int i, int i_640_) {
		Class477 class477 = new Class477();
		for (Class282_Sub50_Sub6 class282_sub50_sub6 = (Class282_Sub50_Sub6) aClass465_3461.method7750(1252677356); class282_sub50_sub6 != null; class282_sub50_sub6 = ((Class282_Sub50_Sub6) aClass465_3461.method7751((byte) 121))) {
			if (((Class282_Sub50_Sub6) class282_sub50_sub6).aBool9543 && class282_sub50_sub6.method14784(i, i_640_, 2036854357))
				class477.method7936(class282_sub50_sub6, -1738910950);
		}
		return class477;
	}

	static Class482 method5190(Class505 class505, int i, int i_641_, int i_642_, int i_643_) {
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass482_3459.method8097((byte) 93); class282_sub36 != null; class282_sub36 = (Class282_Sub36) aClass482_3459.method8067(2011735598))
			method5146(class505, class282_sub36, i, i_641_, i_642_, i_643_);
		return aClass482_3459;
	}

	static Class482 method5191(Class505 class505, int i, int i_644_, int i_645_, int i_646_) {
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass482_3459.method8097((byte) 117); class282_sub36 != null; class282_sub36 = (Class282_Sub36) aClass482_3459.method8067(656471956))
			method5146(class505, class282_sub36, i, i_644_, i_645_, i_646_);
		return aClass482_3459;
	}

	static void method5192(Class505 class505, int i, int i_647_) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(aClass317_3460.method5626(aClass282_Sub50_Sub6_3491.aString9533, "area", (byte) 1));
		int i_648_ = class282_sub35.readUnsignedByte();
		int[] is = new int[i_648_];
		for (int i_649_ = 0; i_649_ < i_648_; i_649_++)
			is[i_649_] = class282_sub35.readUnsignedByte();
		int i_650_ = class282_sub35.readUnsignedByte();
		int[] is_651_ = new int[i_650_];
		for (int i_652_ = 0; i_652_ < i_650_; i_652_++)
			is_651_[i_652_] = class282_sub35.readUnsignedByte();
		while (class282_sub35.index * -1990677291 < class282_sub35.buffer.length) {
			if (class282_sub35.readUnsignedByte() == 0) {
				int i_653_ = class282_sub35.readUnsignedByte();
				int i_654_ = class282_sub35.readUnsignedByte();
				for (int i_655_ = 0; i_655_ < 64; i_655_++) {
					for (int i_656_ = 0; i_656_ < 64; i_656_++) {
						int i_657_ = i_653_ * 64 + i_655_ - anInt3472;
						int i_658_ = i_654_ * 64 + i_656_ - anInt3473;
						method5162(class505, class282_sub35, i_653_, i_654_, i_657_, i_658_, is, is_651_);
					}
				}
			} else {
				int i_659_ = class282_sub35.readUnsignedByte();
				int i_660_ = class282_sub35.readUnsignedByte();
				int i_661_ = class282_sub35.readUnsignedByte();
				int i_662_ = class282_sub35.readUnsignedByte();
				for (int i_663_ = 0; i_663_ < 8; i_663_++) {
					for (int i_664_ = 0; i_664_ < 8; i_664_++) {
						int i_665_ = i_659_ * 64 + i_661_ * 8 + i_663_ - anInt3472;
						int i_666_ = i_660_ * 64 + i_662_ * 8 + i_664_ - anInt3473;
						method5162(class505, class282_sub35, i_659_, i_660_, i_665_, i_666_, is, is_651_);
					}
				}
			}
		}
		Object object = null;
		aByteArray3478 = new byte[anInt3474 * anInt3483];
		aShortArray3479 = new short[anInt3474 * anInt3483];
		for (int i_667_ = 0; i_667_ < 3; i_667_++) {
			byte[] is_668_ = new byte[anInt3474 * anInt3483];
			for (int i_669_ = 0; i_669_ < anArrayListArrayArrayArray3484[i_667_].length; i_669_++) {
				for (int i_670_ = 0; i_670_ < anArrayListArrayArrayArray3484[i_667_][0].length; i_670_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_667_][i_669_][i_670_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							is_668_[(i_669_ * 64 + ((Class269) class269).aByte3311 + ((i_670_ * 64 + ((Class269) class269).aByte3309) * anInt3474))] = (byte) ((Class269) class269).anInt3310;
						}
					}
				}
			}
			method5194(is_668_, aByteArray3478, aShortArray3479, i, i_647_);
			for (int i_671_ = 0; i_671_ < anArrayListArrayArrayArray3484[i_667_].length; i_671_++) {
				for (int i_672_ = 0; i_672_ < anArrayListArrayArrayArray3484[i_667_][0].length; i_672_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3484[i_667_][i_671_][i_672_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class269 class269 = (Class269) iterator.next();
							int i_673_ = (i_671_ * 64 + ((Class269) class269).aByte3311 + ((i_672_ * 64 + ((Class269) class269).aByte3309) * anInt3474));
							((Class269) class269).anInt3310 = ((aByteArray3478[i_673_] & 0xff) << 16 | aShortArray3479[i_673_] & 0xffff);
							if (((Class269) class269).anInt3310 != 0)
								((Class269) class269).anInt3310 |= ~0xffffff;
						}
					}
				}
			}
		}
		method5194(aByteArray3477, aByteArray3478, aShortArray3479, i, i_647_);
		aByteArray3477 = null;
		method5136();
	}

	static void method5193(Class505 class505) {
		int i = anInt3480 - anInt3485;
		int i_674_ = anInt3486 - anInt3465;
		int i_675_ = (anInt3476 - anInt3489 << 16) / i;
		int i_676_ = (anInt3492 - anInt3490 << 16) / i_674_;
		method5131(class505, i_675_, i_676_, 0, 0);
	}

	static void method5194(byte[] is, byte[] is_677_, short[] is_678_, int i, int i_679_) {
		int[] is_680_ = new int[anInt3483];
		int[] is_681_ = new int[anInt3483];
		int[] is_682_ = new int[anInt3483];
		int[] is_683_ = new int[anInt3483];
		int[] is_684_ = new int[anInt3483];
		for (int i_685_ = -5; i_685_ < anInt3474; i_685_++) {
			int i_686_ = i_685_ + 5;
			int i_687_ = i_685_ - 5;
			for (int i_688_ = 0; i_688_ < anInt3483; i_688_++) {
				if (i_686_ < anInt3474) {
					int i_689_ = is[i_686_ + i_688_ * anInt3474] & 0xff;
					if (i_689_ > 0) {
						Class481 class481 = aClass479_3471.method8025(i_689_ - 1, (byte) -54);
						is_680_[i_688_] += class481.anInt5724 * -520008741;
						is_681_[i_688_] += class481.anInt5726 * -771727201;
						is_682_[i_688_] += class481.anInt5725 * 1389910939;
						is_683_[i_688_] += class481.anInt5718 * -45673991;
						is_684_[i_688_]++;
					}
				}
				if (i_687_ >= 0) {
					int i_690_ = is[i_687_ + i_688_ * anInt3474] & 0xff;
					if (i_690_ > 0) {
						Class481 class481 = aClass479_3471.method8025(i_690_ - 1, (byte) -86);
						is_680_[i_688_] -= class481.anInt5724 * -520008741;
						is_681_[i_688_] -= class481.anInt5726 * -771727201;
						is_682_[i_688_] -= class481.anInt5725 * 1389910939;
						is_683_[i_688_] -= class481.anInt5718 * -45673991;
						is_684_[i_688_]--;
					}
				}
			}
			if (i_685_ >= 0) {
				int i_691_ = 0;
				int i_692_ = 0;
				int i_693_ = 0;
				int i_694_ = 0;
				int i_695_ = 0;
				for (int i_696_ = -5; i_696_ < anInt3483; i_696_++) {
					int i_697_ = i_696_ + 5;
					if (i_697_ < anInt3483) {
						i_691_ += is_680_[i_697_];
						i_692_ += is_681_[i_697_];
						i_693_ += is_682_[i_697_];
						i_694_ += is_683_[i_697_];
						i_695_ += is_684_[i_697_];
					}
					int i_698_ = i_696_ - 5;
					if (i_698_ >= 0) {
						i_691_ -= is_680_[i_698_];
						i_692_ -= is_681_[i_698_];
						i_693_ -= is_682_[i_698_];
						i_694_ -= is_683_[i_698_];
						i_695_ -= is_684_[i_698_];
					}
					if (i_696_ >= 0 && i_695_ > 0) {
						if ((is[i_685_ + i_696_ * anInt3474] & 0xff) == 0) {
							int i_699_ = i_685_ + i_696_ * anInt3474;
							is_677_[i_699_] = (byte) 0;
							is_678_[i_699_] = (short) 0;
						} else {
							int i_700_ = (i_694_ == 0 ? 0 : Class371.method6348(i_691_ * 256 / i_694_, i_692_ / i_695_, i_693_ / i_695_, -517505406));
							int i_701_ = (i_700_ & 0x7f) + i_679_;
							if (i_701_ < 0)
								i_701_ = 0;
							else if (i_701_ > 127)
								i_701_ = 127;
							int i_702_ = ((i_700_ + i & 0xfc00) + (i_700_ & 0x380) + i_701_);
							int i_703_ = i_685_ + i_696_ * anInt3474;
							int i_704_ = (Class335.anIntArray3916[(Class372.method6362(Class96_Sub21.method14677(i_702_, 96, -74258659), 880885246)) & 0xffff]);
							is_677_[i_703_] = (byte) (i_704_ >> 16 & 0xff);
							is_678_[i_703_] = (short) (i_704_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method5195(Class505 class505, Class282_Sub36 class282_sub36, int i, int i_705_, int i_706_, int i_707_) {
		class282_sub36.anInt7990 = (anInt3489 + (i_706_ + i * (class282_sub36.anInt7987 * -1306535747 - anInt3485) >> 16)) * -1316454393;
		class282_sub36.anInt7992 = (anInt3492 - (i_707_ + i_705_ * (class282_sub36.anInt7993 * 1012301095 - anInt3465) >> 16)) * -1541159585;
	}

	static void method5196(Class505 class505, Class282_Sub36 class282_sub36, Class220 class220) {
		if (class220.anIntArray2717 != null) {
			int[] is = new int[class220.anIntArray2717.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_708_ = (class220.anIntArray2717[i * 2] + class282_sub36.anInt7987 * -1306535747);
				int i_709_ = (class220.anIntArray2717[i * 2 + 1] + class282_sub36.anInt7993 * 1012301095);
				is[i * 2] = anInt3489 + ((anInt3476 - anInt3489) * (i_708_ - anInt3485) / (anInt3480 - anInt3485));
				is[i * 2 + 1] = anInt3492 - ((anInt3492 - anInt3490) * (i_709_ - anInt3465) / (anInt3486 - anInt3465));
			}
			Class147.method2471(class505, is, class220.anInt2715 * 152819427);
			if (class220.anInt2748 * -1216326857 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_710_ = is[i * 2];
					int i_711_ = is[i * 2 + 1];
					int i_712_ = is[(i + 1) * 2];
					int i_713_ = is[(i + 1) * 2 + 1];
					if (i_712_ < i_710_) {
						int i_714_ = i_710_;
						int i_715_ = i_711_;
						i_710_ = i_712_;
						i_711_ = i_713_;
						i_712_ = i_714_;
						i_713_ = i_715_;
					} else if (i_712_ == i_710_ && i_713_ < i_711_) {
						int i_716_ = i_711_;
						i_711_ = i_713_;
						i_713_ = i_716_;
					}
					class505.method8435(i_710_, i_711_, i_712_, i_713_, (class220.anIntArray2738[class220.aByteArray2754[i] & 0xff]), 1, class220.anInt2748 * -1216326857, class220.anInt2749 * 1940337227, class220.anInt2756 * -155138445);
				}
				int i = is[is.length - 2];
				int i_717_ = is[is.length - 1];
				int i_718_ = is[0];
				int i_719_ = is[1];
				if (i_718_ < i) {
					int i_720_ = i;
					int i_721_ = i_717_;
					i = i_718_;
					i_717_ = i_719_;
					i_718_ = i_720_;
					i_719_ = i_721_;
				} else if (i_718_ == i && i_719_ < i_717_) {
					int i_722_ = i_717_;
					i_717_ = i_719_;
					i_719_ = i_722_;
				}
				class505.method8435(i, i_717_, i_718_, i_719_, (class220.anIntArray2738[((class220.aByteArray2754[class220.aByteArray2754.length - 1]) & 0xff)]), 1, class220.anInt2748 * -1216326857, class220.anInt2749 * 1940337227, class220.anInt2756 * -155138445);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class505.method8429(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class220.anIntArray2738[class220.aByteArray2754[i] & 0xff]), (byte) -100);
				class505.method8429(is[is.length - 2], is[is.length - 1], is[0], is[1], (class220.anIntArray2738[((class220.aByteArray2754[class220.aByteArray2754.length - 1]) & 0xff)]), (byte) -26);
			}
		}
	}
}
