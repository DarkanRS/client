/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Class301 {
	public static Class298_Sub37_Sub13 aClass298_Sub37_Sub13_3218;
	static Class451 aClass451_3219;
	protected static Class433 aClass433_3220;
	protected static int anInt3221;
	static byte[] aByteArray3222;
	protected static Interface23 anInterface23_3223;
	static byte[] aByteArray3224;
	protected static Class487 aClass487_3225;
	static HashTable aClass437_3226 = new HashTable(16);
	protected static int anInt3227 = (int) (Math.random() * 11.0) - 5;
	protected static int anInt3228 = (int) (Math.random() * 17.0) - 8;
	protected static byte[][][] aByteArrayArrayArray3229;
	protected static int anInt3230;
	static int[] anIntArray3231 = new int[1];
	static byte[] aByteArray3232 = new byte[1];
	public static float aFloat3233;
	public static float aFloat3234;
	protected static Class296 aClass296_3235;
	protected static Class453 aClass453_3236 = new Class453();
	static int[] anIntArray3237;
	public static int anInt3238;
	protected static int anInt3239;
	protected static int anInt3240;
	protected static int anInt3241;
	protected static int anInt3242;
	static byte[] aByteArray3243;
	static short[] aShortArray3244;
	public static int anInt3245;
	static byte[] aByteArray3246;
	static Object[] anObjectArray3247;
	protected static Class243 aClass243_3248;
	static ArrayList[][][] anArrayListArrayArrayArray3249;
	static byte[] aByteArray3250;
	protected static Class339 aClass339_3251;
	protected static int anInt3252;
	static Class375 aClass375_3253;
	protected static int anInt3254;
	protected static int anInt3255;
	protected static int anInt3256;
	protected static int anInt3257;

	static void method3689(GraphicsToolkit class_ra, int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = anInt3252 - anInt3230;
		int i_4_ = anInt3241 - anInt3242;
		if (anInt3252 < anInt3239)
			i_3_++;
		if (anInt3241 < anInt3240)
			i_4_++;
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			int i_6_ = (i_1_ + i * i_5_ >> 16) + anInt3221;
			int i_7_ = (i_1_ + i * (i_5_ + 1) >> 16) + anInt3221;
			int i_8_ = i_7_ - i_6_;
			if (i_8_ > 0) {
				int i_9_ = anInt3230 + i_5_;
				if (i_9_ < 0 || i_9_ >= anInt3239) {
					for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
						int i_11_ = anInt3257 - (i_2_ + i_0_ * (i_10_ + 1) >> 16);
						int i_12_ = anInt3257 - (i_2_ + i_0_ * i_10_ >> 16);
						int i_13_ = i_12_ - i_11_;
						int i_14_;
						if (((Class298_Sub37_Sub13) aClass298_Sub37_Sub13_3218).anInt9639 * -717907215 != -1)
							i_14_ = ~0xffffff | (((Class298_Sub37_Sub13) aClass298_Sub37_Sub13_3218).anInt9639) * -717907215;
						else if ((i_5_ + anInt3230 & 0x4) != (i_10_ + anInt3241 & 0x4))
							i_14_ = -11840664;
						else
							i_14_ = anIntArray3237[(aClass375_3253.anInt4080 * 1086398247) + 1];
						if (i_14_ == 0)
							i_14_ = -16777216;
						class_ra.B(i_6_, i_11_, i_8_, i_13_, i_14_, 0);
					}
				} else {
					for (int i_15_ = 0; i_15_ < i_4_; i_15_++) {
						int i_16_ = anInt3257 - (i_2_ + i_0_ * (i_15_ + 1) >> 16);
						int i_17_ = anInt3257 - (i_2_ + i_0_ * i_15_ >> 16);
						int i_18_ = i_17_ - i_16_;
						if (i_18_ > 0) {
							int i_19_ = i_15_ + anInt3242;
							int i_20_ = i_9_ + i_19_ * anInt3239;
							int i_21_ = 0;
							int i_22_ = 0;
							Object object = null;
							if (i_19_ >= 0 && i_19_ < anInt3240) {
								i_21_ = ((aByteArray3243[i_20_] & 0xff) << 16 | aShortArray3244[i_20_] & 0xffff);
								if (i_21_ != 0)
									i_21_ |= ~0xffffff;
								i_22_ = aByteArray3222[i_20_] & 0xff;
								object = anObjectArray3247[i_20_];
							}
							if (i_21_ == 0 && i_22_ == 0 && object == null) {
								if ((((Class298_Sub37_Sub13) aClass298_Sub37_Sub13_3218).anInt9639 * -717907215) != -1)
									i_21_ = (~0xffffff | (((Class298_Sub37_Sub13) aClass298_Sub37_Sub13_3218).anInt9639) * -717907215);
								else if ((i_5_ + anInt3230 & 0x4) != (i_15_ + anInt3241 & 0x4))
									i_21_ = -11840664;
								else
									i_21_ = (anIntArray3237[(aClass375_3253.anInt4080 * 1086398247) + 1]);
								if (i_21_ == 0)
									i_21_ = -16777216;
								class_ra.B(i_6_, i_16_, i_8_, i_18_, i_21_, 0);
							} else if (object != null) {
								if (object instanceof Class298_Sub54) {
									Class298_Sub54 class298_sub54 = (Class298_Sub54) object;
									if (class298_sub54 != null)
										method3700(class_ra, i_6_, i_16_, i_8_, i_18_, i_21_, i_22_, aByteArray3246[i_20_], (((Class298_Sub54) class298_sub54).anIntArray7621), (((Class298_Sub54) class298_sub54).aByteArray7620), true);
								} else {
									Integer integer = (Integer) object;
									anIntArray3231[0] = integer.intValue();
									aByteArray3232[0] = aByteArray3250[i_20_];
									method3700(class_ra, i_6_, i_16_, i_8_, i_18_, i_21_, i_22_, aByteArray3246[i_20_], anIntArray3231, aByteArray3232, true);
								}
							} else
								method3700(class_ra, i_6_, i_16_, i_8_, i_18_, i_21_, i_22_, aByteArray3246[i_20_], null, null, true);
						}
					}
				}
			}
		}
		for (int i_23_ = -16; i_23_ < i_3_ + 16; i_23_++) {
			int i_24_ = (i_1_ + i * i_23_ >> 16) + anInt3221;
			int i_25_ = (i_1_ + i * (i_23_ + 1) >> 16) + anInt3221;
			int i_26_ = i_25_ - i_24_;
			if (i_26_ > 0) {
				int i_27_ = i_23_ + anInt3230;
				if (i_27_ >= 0 && i_27_ < anInt3239) {
					for (int i_28_ = -16; i_28_ < i_4_ + 16; i_28_++) {
						int i_29_ = anInt3257 - (i_2_ + i_0_ * (i_28_ + 1) >> 16);
						int i_30_ = anInt3257 - (i_2_ + i_0_ * i_28_ >> 16);
						int i_31_ = i_30_ - i_29_;
						if (i_31_ > 0) {
							int i_32_ = i_28_ + anInt3242;
							if (i_32_ >= 0 && i_32_ < anInt3240) {
								Object object = (anObjectArray3247[i_27_ + i_32_ * anInt3239]);
								if (object != null) {
									if (object instanceof Class298_Sub54) {
										Class298_Sub54 class298_sub54 = (Class298_Sub54) object;
										if (class298_sub54 != null)
											method3701(class_ra, i_24_, i_29_, i_26_, i_31_, (((Class298_Sub54) class298_sub54).anIntArray7621), (((Class298_Sub54) class298_sub54).aByteArray7620));
									} else {
										Integer integer = (Integer) object;
										anIntArray3231[0] = integer.intValue();
										aByteArray3232[0] = (aByteArray3250[i_27_ + i_32_ * anInt3239]);
										method3701(class_ra, i_24_, i_29_, i_26_, i_31_, anIntArray3231, aByteArray3232);
									}
								} else
									method3701(class_ra, i_24_, i_29_, i_26_, i_31_, null, null);
							}
						}
					}
				}
			}
		}
		int i_33_ = anInt3230 >> 6;
		int i_34_ = anInt3242 >> 6;
		if (i_33_ < 0)
			i_33_ = 0;
		if (i_34_ < 0)
			i_34_ = 0;
		int i_35_ = anInt3252 >> 6;
		int i_36_ = anInt3241 >> 6;
		if (i_35_ >= anArrayListArrayArrayArray3249[0].length)
			i_35_ = anArrayListArrayArrayArray3249[0].length - 1;
		if (i_36_ >= anArrayListArrayArrayArray3249[0][0].length)
			i_36_ = anArrayListArrayArrayArray3249[0][0].length - 1;
		for (int i_37_ = 0; i_37_ < 3; i_37_++) {
			for (int i_38_ = i_33_; i_38_ <= i_35_; i_38_++) {
				for (int i_39_ = i_34_; i_39_ <= i_36_; i_39_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3249[i_37_][i_38_][i_39_];
					if (arraylist != null) {
						int i_40_ = (i_38_ + (anInt3245 >> 6)) * 64;
						int i_41_ = (i_39_ + (anInt3238 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class312 class312 = (Class312) iterator.next();
							int i_42_ = (i_40_ + ((Class312) class312).aByte3292 - anInt3245 - anInt3230);
							int i_43_ = (i_41_ + ((Class312) class312).aByte3293 - anInt3238 - anInt3242);
							int i_44_ = (i_1_ + i * i_42_ >> 16) + anInt3221;
							int i_45_ = (i_1_ + i * (i_42_ + 1) >> 16) + anInt3221;
							int i_46_ = (anInt3257 - (i_2_ + i_0_ * (i_43_ + 1) >> 16));
							int i_47_ = anInt3257 - (i_2_ + i_0_ * i_43_ >> 16);
							method3700(class_ra, i_44_, i_46_, i_45_ - i_44_, i_47_ - i_46_, ((Class312) class312).anInt3290, ((Class312) class312).aByte3291 & 0xff, ((Class312) class312).aByte3294, ((Class312) class312).anIntArray3288, ((Class312) class312).aByteArray3289, false);
						}
					}
				}
			}
			for (int i_48_ = i_33_; i_48_ <= i_35_; i_48_++) {
				for (int i_49_ = i_34_; i_49_ <= i_36_; i_49_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3249[i_37_][i_48_][i_49_];
					if (arraylist != null) {
						int i_50_ = (i_48_ + (anInt3245 >> 6)) * 64;
						int i_51_ = (i_49_ + (anInt3238 >> 6)) * 64;
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class312 class312 = (Class312) iterator.next();
							int i_52_ = (i_50_ + ((Class312) class312).aByte3292 - anInt3245 - anInt3230);
							int i_53_ = (i_51_ + ((Class312) class312).aByte3293 - anInt3238 - anInt3242);
							int i_54_ = (i_1_ + i * i_52_ >> 16) + anInt3221;
							int i_55_ = (i_1_ + i * (i_52_ + 1) >> 16) + anInt3221;
							int i_56_ = (anInt3257 - (i_2_ + i_0_ * (i_53_ + 1) >> 16));
							int i_57_ = anInt3257 - (i_2_ + i_0_ * i_53_ >> 16);
							method3701(class_ra, i_54_, i_56_, i_55_ - i_54_, i_57_ - i_56_, ((Class312) class312).anIntArray3288, ((Class312) class312).aByteArray3289);
						}
					}
				}
			}
		}
	}

	public static void method3690(Class243 class243, Class375 class375, Class451 class451, Class433 class433, Class339 class339, Class487 class487, Interface23 interface23) {
		aClass243_3248 = class243;
		aClass375_3253 = class375;
		aClass451_3219 = class451;
		aClass433_3220 = class433;
		aClass339_3251 = class339;
		aClass487_3225 = class487;
		anInterface23_3223 = interface23;
		aClass437_3226.clear((byte) -118);
		int i = aClass243_3248.method2311("details", -1750560538);
		int[] is = aClass243_3248.method2307(i, -1923714721);
		if (is != null) {
			for (int i_58_ = 0; i_58_ < is.length; i_58_++) {
				Class298_Sub37_Sub13 class298_sub37_sub13 = Class469.method6048(aClass243_3248, i, is[i_58_], 1783056581);
				aClass437_3226.method5817(class298_sub37_sub13, (long) ((class298_sub37_sub13.anInt9643) * -947282109));
			}
		}
		Class374_Sub1.method4640(true, false, -162450455);
	}

	static void method3691() {
		aByteArray3224 = null;
		aByteArray3243 = null;
		aShortArray3244 = null;
		aByteArray3222 = null;
		aByteArray3246 = null;
		anObjectArray3247 = null;
		aByteArray3250 = null;
		anArrayListArrayArrayArray3249 = null;
		anIntArray3237 = null;
	}

	static void method3692(int i) {
		aClass298_Sub37_Sub13_3218 = (Class298_Sub37_Sub13) aClass437_3226.get((long) i);
	}

	public static Class461 method3693(int i, int i_59_) {
		Class461 class461 = new Class461();
		for (Class298_Sub37_Sub13 class298_sub37_sub13 = ((Class298_Sub37_Sub13) aClass437_3226.method5816(1759050770)); class298_sub37_sub13 != null; class298_sub37_sub13 = ((Class298_Sub37_Sub13) aClass437_3226.method5815((byte) -2))) {
			if (((Class298_Sub37_Sub13) class298_sub37_sub13).aBoolean9648 && class298_sub37_sub13.method3450(i, i_59_, (byte) 1))
				class461.method5982(class298_sub37_sub13, (byte) -123);
		}
		return class461;
	}

	static int method3694(Interface_ma interface_ma, int i, int i_60_, int i_61_) {
		Class373 class373 = aClass375_3253.method4645(i, -165601895);
		if (class373 == null)
			return 0;
		int i_62_ = class373.anInt4057 * 324071475;
		if (i_62_ >= 0 && interface_ma.method174(i_62_, 1570476781).aBoolean524)
			i_62_ = -1;
		int i_63_;
		if (class373.anInt4059 * 1728947183 >= 0) {
			int i_64_ = class373.anInt4059 * 1728947183;
			int i_65_ = (i_64_ & 0x7f) + i_61_;
			if (i_65_ < 0)
				i_65_ = 0;
			else if (i_65_ > 127)
				i_65_ = 127;
			int i_66_ = (i_64_ + i_60_ & 0xfc00) + (i_64_ & 0x380) + i_65_;
			i_63_ = (~0xffffff | (Class379.anIntArray4096[Class173.method1823(Class343.method4161(i_66_, 96, (byte) 86), (byte) 0) & 0xffff]));
		} else if (i_62_ >= 0)
			i_63_ = (~0xffffff | (Class379.anIntArray4096[Class173.method1823(Class343.method4161((interface_ma.method174(i_62_, 201088475).aShort532), 96, (byte) 61), (byte) 0) & 0xffff]));
		else if (class373.anInt4056 * -45966925 == -1)
			i_63_ = 0;
		else {
			int i_67_ = class373.anInt4056 * -45966925;
			int i_68_ = (i_67_ & 0x7f) + i_61_;
			if (i_68_ < 0)
				i_68_ = 0;
			else if (i_68_ > 127)
				i_68_ = 127;
			int i_69_ = (i_67_ + i_60_ & 0xfc00) + (i_67_ & 0x380) + i_68_;
			i_63_ = (~0xffffff | (Class379.anIntArray4096[Class173.method1823(Class343.method4161(i_69_, 96, (byte) 22), (byte) 0) & 0xffff]));
		}
		return i_63_;
	}

	static void method3695(GraphicsToolkit class_ra, RsByteBuffer class298_sub53, int i, int i_70_, int i_71_, int i_72_, int[] is, int[] is_73_) {
		int i_74_ = class298_sub53.readUnsignedByte();
		if ((i_74_ & 0x1) == 0) {
			boolean bool = (i_74_ & 0x2) == 0;
			int i_75_ = i_74_ >> 2 & 0x3f;
			if (i_75_ != 62) {
				if (i_75_ == 63)
					i_75_ = class298_sub53.readUnsignedByte();
				else if (bool)
					i_75_ = is[i_75_];
				else
					i_75_ = is_73_[i_75_];
				if (bool) {
					aByteArray3224[i_71_ + i_72_ * anInt3239] = (byte) i_75_;
					aByteArray3222[i_71_ + i_72_ * anInt3239] = (byte) 0;
				} else {
					aByteArray3222[i_71_ + i_72_ * anInt3239] = (byte) i_75_;
					aByteArray3246[i_71_ + i_72_ * anInt3239] = (byte) 0;
					aByteArray3224[i_71_ + i_72_ * anInt3239] = class298_sub53.readByte(-12558881);
				}
			}
		} else {
			int i_76_ = (i_74_ >> 1 & 0x3) + 1;
			boolean bool = (i_74_ & 0x8) != 0;
			boolean bool_77_ = (i_74_ & 0x10) != 0;
			for (int i_78_ = 0; i_78_ < i_76_; i_78_++) {
				int i_79_ = class298_sub53.readUnsignedByte();
				int i_80_ = 0;
				int i_81_ = 0;
				if (bool) {
					i_80_ = class298_sub53.readUnsignedByte();
					i_81_ = class298_sub53.readUnsignedByte();
				}
				int i_82_ = 0;
				if (bool_77_)
					i_82_ = class298_sub53.readUnsignedByte();
				if (i_78_ == 0) {
					aByteArray3224[i_71_ + i_72_ * anInt3239] = (byte) i_79_;
					aByteArray3222[i_71_ + i_72_ * anInt3239] = (byte) i_80_;
					aByteArray3246[i_71_ + i_72_ * anInt3239] = (byte) i_81_;
					if (i_82_ == 1) {
						anObjectArray3247[i_71_ + i_72_ * anInt3239] = new Integer(class298_sub53.readBigSmart(1235052657));
						aByteArray3250[i_71_ + i_72_ * anInt3239] = class298_sub53.readByte(-12558881);
					} else if (i_82_ > 1) {
						int[] is_83_ = new int[i_82_];
						byte[] is_84_ = new byte[i_82_];
						for (int i_85_ = 0; i_85_ < i_82_; i_85_++) {
							is_83_[i_85_] = class298_sub53.readBigSmart(1235052657);
							is_84_[i_85_] = class298_sub53.readByte(-12558881);
						}
						anObjectArray3247[i_71_ + i_72_ * anInt3239] = new Class298_Sub54(is_83_, is_84_);
					}
				} else {
					int[] is_86_ = null;
					byte[] is_87_ = null;
					if (i_82_ > 0) {
						is_86_ = new int[i_82_];
						is_87_ = new byte[i_82_];
						for (int i_88_ = 0; i_88_ < i_82_; i_88_++) {
							is_86_[i_88_] = class298_sub53.readBigSmart(1235052657);
							is_87_[i_88_] = class298_sub53.readByte(-12558881);
						}
					}
					if ((anArrayListArrayArrayArray3249[i_78_ - 1][i - (anInt3245 >> 6)][i_70_ - (anInt3238 >> 6)]) == null)
						anArrayListArrayArrayArray3249[i_78_ - 1][i - (anInt3245 >> 6)][i_70_ - (anInt3238 >> 6)] = new ArrayList();
					Class312 class312 = new Class312(i_71_ & 0x3f, i_72_ & 0x3f, i_79_, i_80_, i_81_, is_86_, is_87_);
					anArrayListArrayArrayArray3249[i_78_ - 1][i - (anInt3245 >> 6)][i_70_ - (anInt3238 >> 6)].add(class312);
				}
			}
		}
	}

	Class301() throws Throwable {
		throw new Error();
	}

	static void method3696(byte[] is, byte[] is_89_, short[] is_90_, int i, int i_91_) {
		int[] is_92_ = new int[anInt3240];
		int[] is_93_ = new int[anInt3240];
		int[] is_94_ = new int[anInt3240];
		int[] is_95_ = new int[anInt3240];
		int[] is_96_ = new int[anInt3240];
		for (int i_97_ = -5; i_97_ < anInt3239; i_97_++) {
			int i_98_ = i_97_ + 5;
			int i_99_ = i_97_ - 5;
			for (int i_100_ = 0; i_100_ < anInt3240; i_100_++) {
				if (i_98_ < anInt3239) {
					int i_101_ = is[i_98_ + i_100_ * anInt3239] & 0xff;
					if (i_101_ > 0) {
						Class443 class443 = aClass451_3219.method5932(i_101_ - 1, (byte) -1);
						is_92_[i_100_] += class443.anInt5598 * 838046775;
						is_93_[i_100_] += class443.anInt5595 * -620399085;
						is_94_[i_100_] += class443.anInt5600 * 656695887;
						is_95_[i_100_] += class443.anInt5601 * -813159285;
						is_96_[i_100_]++;
					}
				}
				if (i_99_ >= 0) {
					int i_102_ = is[i_99_ + i_100_ * anInt3239] & 0xff;
					if (i_102_ > 0) {
						Class443 class443 = aClass451_3219.method5932(i_102_ - 1, (byte) -1);
						is_92_[i_100_] -= class443.anInt5598 * 838046775;
						is_93_[i_100_] -= class443.anInt5595 * -620399085;
						is_94_[i_100_] -= class443.anInt5600 * 656695887;
						is_95_[i_100_] -= class443.anInt5601 * -813159285;
						is_96_[i_100_]--;
					}
				}
			}
			if (i_97_ >= 0) {
				int i_103_ = 0;
				int i_104_ = 0;
				int i_105_ = 0;
				int i_106_ = 0;
				int i_107_ = 0;
				for (int i_108_ = -5; i_108_ < anInt3240; i_108_++) {
					int i_109_ = i_108_ + 5;
					if (i_109_ < anInt3240) {
						i_103_ += is_92_[i_109_];
						i_104_ += is_93_[i_109_];
						i_105_ += is_94_[i_109_];
						i_106_ += is_95_[i_109_];
						i_107_ += is_96_[i_109_];
					}
					int i_110_ = i_108_ - 5;
					if (i_110_ >= 0) {
						i_103_ -= is_92_[i_110_];
						i_104_ -= is_93_[i_110_];
						i_105_ -= is_94_[i_110_];
						i_106_ -= is_95_[i_110_];
						i_107_ -= is_96_[i_110_];
					}
					if (i_108_ >= 0 && i_107_ > 0) {
						if ((is[i_97_ + i_108_ * anInt3239] & 0xff) == 0) {
							int i_111_ = i_97_ + i_108_ * anInt3239;
							is_89_[i_111_] = (byte) 0;
							is_90_[i_111_] = (short) 0;
						} else {
							int i_112_ = (i_106_ == 0 ? 0 : Class401.method4933(i_103_ * 256 / i_106_, i_104_ / i_107_, i_105_ / i_107_, -235005806));
							int i_113_ = (i_112_ & 0x7f) + i_91_;
							if (i_113_ < 0)
								i_113_ = 0;
							else if (i_113_ > 127)
								i_113_ = 127;
							int i_114_ = ((i_112_ + i & 0xfc00) + (i_112_ & 0x380) + i_113_);
							int i_115_ = i_97_ + i_108_ * anInt3239;
							int i_116_ = (Class379.anIntArray4096[(Class173.method1823(Class290.method2749(i_114_, 96, 1291456097), (byte) 0)) & 0xffff]);
							is_89_[i_115_] = (byte) (i_116_ >> 16 & 0xff);
							is_90_[i_115_] = (short) (i_116_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method3697() {
		int[] is = new int[3];
		for (int i = 0; i < aClass296_3235.anInt3169 * -1407078377; i++) {
			boolean bool = (aClass298_Sub37_Sub13_3218.method3453(aClass296_3235.anIntArray3168[i] >> 28 & 0x3, aClass296_3235.anIntArray3168[i] >> 14 & 0x3fff, aClass296_3235.anIntArray3168[i] & 0x3fff, is, 1112796822));
			if (bool) {
				Class298_Sub52 class298_sub52 = new Class298_Sub52(aClass296_3235.anIntArray3170[i]);
				class298_sub52.anInt7607 = (is[1] - anInt3245) * 898378357;
				class298_sub52.anInt7610 = (is[2] - anInt3238) * -1686044477;
				aClass453_3236.method5935(class298_sub52, 1249081090);
			}
		}
	}

	static void method3698(GraphicsToolkit class_ra) {
		int i = anInt3252 - anInt3230;
		int i_117_ = anInt3241 - anInt3242;
		int i_118_ = (anInt3256 - anInt3221 << 16) / i;
		int i_119_ = (anInt3257 - anInt3255 << 16) / i_117_;
		method3689(class_ra, i_118_, i_119_, 0, 0);
	}

	static void method3699(GraphicsToolkit class_ra, int i, int i_120_) {
		RsByteBuffer class298_sub53 = new RsByteBuffer(aClass243_3248.method2301(aClass298_Sub37_Sub13_3218.aString9640, "area", -1304297711));
		int i_121_ = class298_sub53.readUnsignedByte();
		int[] is = new int[i_121_];
		for (int i_122_ = 0; i_122_ < i_121_; i_122_++)
			is[i_122_] = class298_sub53.readUnsignedByte();
		int i_123_ = class298_sub53.readUnsignedByte();
		int[] is_124_ = new int[i_123_];
		for (int i_125_ = 0; i_125_ < i_123_; i_125_++)
			is_124_[i_125_] = class298_sub53.readUnsignedByte();
		while (class298_sub53.index * 385051775 < class298_sub53.buffer.length) {
			if (class298_sub53.readUnsignedByte() == 0) {
				int i_126_ = class298_sub53.readUnsignedByte();
				int i_127_ = class298_sub53.readUnsignedByte();
				for (int i_128_ = 0; i_128_ < 64; i_128_++) {
					for (int i_129_ = 0; i_129_ < 64; i_129_++) {
						int i_130_ = i_126_ * 64 + i_128_ - anInt3245;
						int i_131_ = i_127_ * 64 + i_129_ - anInt3238;
						method3695(class_ra, class298_sub53, i_126_, i_127_, i_130_, i_131_, is, is_124_);
					}
				}
			} else {
				int i_132_ = class298_sub53.readUnsignedByte();
				int i_133_ = class298_sub53.readUnsignedByte();
				int i_134_ = class298_sub53.readUnsignedByte();
				int i_135_ = class298_sub53.readUnsignedByte();
				for (int i_136_ = 0; i_136_ < 8; i_136_++) {
					for (int i_137_ = 0; i_137_ < 8; i_137_++) {
						int i_138_ = i_132_ * 64 + i_134_ * 8 + i_136_ - anInt3245;
						int i_139_ = i_133_ * 64 + i_135_ * 8 + i_137_ - anInt3238;
						method3695(class_ra, class298_sub53, i_132_, i_133_, i_138_, i_139_, is, is_124_);
					}
				}
			}
		}
		Object object = null;
		aByteArray3243 = new byte[anInt3239 * anInt3240];
		aShortArray3244 = new short[anInt3239 * anInt3240];
		for (int i_140_ = 0; i_140_ < 3; i_140_++) {
			byte[] is_141_ = new byte[anInt3239 * anInt3240];
			for (int i_142_ = 0; i_142_ < anArrayListArrayArrayArray3249[i_140_].length; i_142_++) {
				for (int i_143_ = 0; i_143_ < anArrayListArrayArrayArray3249[i_140_][0].length; i_143_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3249[i_140_][i_142_][i_143_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class312 class312 = (Class312) iterator.next();
							is_141_[(i_142_ * 64 + ((Class312) class312).aByte3292 + ((i_143_ * 64 + ((Class312) class312).aByte3293) * anInt3239))] = (byte) ((Class312) class312).anInt3290;
						}
					}
				}
			}
			method3696(is_141_, aByteArray3243, aShortArray3244, i, i_120_);
			for (int i_144_ = 0; i_144_ < anArrayListArrayArrayArray3249[i_140_].length; i_144_++) {
				for (int i_145_ = 0; i_145_ < anArrayListArrayArrayArray3249[i_140_][0].length; i_145_++) {
					ArrayList arraylist = (anArrayListArrayArrayArray3249[i_140_][i_144_][i_145_]);
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class312 class312 = (Class312) iterator.next();
							int i_146_ = (i_144_ * 64 + ((Class312) class312).aByte3292 + ((i_145_ * 64 + ((Class312) class312).aByte3293) * anInt3239));
							((Class312) class312).anInt3290 = ((aByteArray3243[i_146_] & 0xff) << 16 | aShortArray3244[i_146_] & 0xffff);
							if (((Class312) class312).anInt3290 != 0)
								((Class312) class312).anInt3290 |= ~0xffffff;
						}
					}
				}
			}
		}
		method3696(aByteArray3224, aByteArray3243, aShortArray3244, i, i_120_);
		aByteArray3224 = null;
		method3710();
	}

	static void method3700(GraphicsToolkit class_ra, int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int[] is, byte[] is_153_, boolean bool) {
		if (bool || i_150_ != 0 || i_151_ > 0) {
			if (i_151_ == 0)
				class_ra.B(i, i_147_, i_148_, i_149_, i_150_, 0);
			else {
				int i_154_ = i_152_ & 0x3f;
				if (i_154_ == 0 || i_148_ <= 1 || i_149_ <= 1) {
					int i_155_ = anIntArray3237[i_151_];
					if (bool || i_155_ != 0)
						class_ra.B(i, i_147_, i_148_, i_149_, i_155_, 0);
				} else {
					int i_156_ = bool ? 0 : 1;
					Class252.method2409(class_ra, aByteArrayArrayArray3229, anInt3254, i, i_147_, i_150_, anIntArray3237[i_151_], i_148_, i_149_, i_154_, i_152_ >> 6 & 0x3, i_156_, (byte) 127);
				}
			}
		}
		if (is != null) {
			int i_157_;
			if (i_148_ == 1)
				i_157_ = i;
			else
				i_157_ = i + i_148_ - 1;
			int i_158_;
			if (i_149_ == 1)
				i_158_ = i_147_;
			else
				i_158_ = i_147_ + i_149_ - 1;
			for (int i_159_ = 0; i_159_ < is.length; i_159_++) {
				int i_160_ = is_153_[i_159_] & 0x3f;
				if (i_160_ == Class424.aClass424_6614.anInt6613 * -1976050083 || (i_160_ == Class424.aClass424_6593.anInt6613 * -1976050083) || (i_160_ == Class424.aClass424_6594.anInt6613 * -1976050083) || (i_160_ == Class424.aClass424_6595.anInt6613 * -1976050083)) {
					ObjectDefinitions class432 = aClass433_3220.getObjectDefinitions(is[i_159_]);
					if (class432.anInt5400 * -1204256389 == -1) {
						int i_161_ = -3355444;
						if (class432.anInt5382 * 1532834983 == 1)
							i_161_ = -3407872;
						int i_162_ = is_153_[i_159_] >> 6 & 0x3;
						if (i_160_ == (Class424.aClass424_6614.anInt6613 * -1976050083)) {
							if (i_162_ == 0)
								class_ra.G(i, i_147_, i_149_, i_161_, 0);
							else if (i_162_ == 1)
								class_ra.XA(i, i_147_, i_148_, i_161_, 0);
							else if (i_162_ == 2)
								class_ra.G(i_157_, i_147_, i_149_, i_161_, 0);
							else
								class_ra.XA(i, i_158_, i_148_, i_161_, 0);
						} else if (i_160_ == (Class424.aClass424_6593.anInt6613 * -1976050083)) {
							if (i_162_ == 0) {
								class_ra.G(i, i_147_, i_149_, -1, 0);
								class_ra.XA(i, i_147_, i_148_, i_161_, 0);
							} else if (i_162_ == 1) {
								class_ra.G(i_157_, i_147_, i_149_, -1, 0);
								class_ra.XA(i, i_147_, i_148_, i_161_, 0);
							} else if (i_162_ == 2) {
								class_ra.G(i_157_, i_147_, i_149_, -1, 0);
								class_ra.XA(i, i_158_, i_148_, i_161_, 0);
							} else {
								class_ra.G(i, i_147_, i_149_, -1, 0);
								class_ra.XA(i, i_158_, i_148_, i_161_, 0);
							}
						} else if (i_160_ == (Class424.aClass424_6594.anInt6613 * -1976050083)) {
							if (i_162_ == 0)
								class_ra.XA(i, i_147_, 1, i_161_, 0);
							else if (i_162_ == 1)
								class_ra.XA(i_157_, i_147_, 1, i_161_, 0);
							else if (i_162_ == 2)
								class_ra.XA(i_157_, i_158_, 1, i_161_, 0);
							else
								class_ra.XA(i, i_158_, 1, i_161_, 0);
						} else if (i_160_ == (Class424.aClass424_6595.anInt6613 * -1976050083)) {
							if (i_162_ == 0 || i_162_ == 2) {
								for (int i_163_ = 0; i_163_ < i_149_; i_163_++)
									class_ra.XA(i + i_163_, i_158_ - i_163_, 1, i_161_, 0);
							} else {
								for (int i_164_ = 0; i_164_ < i_149_; i_164_++)
									class_ra.XA(i + i_164_, i_147_ + i_164_, 1, i_161_, 0);
							}
						}
					}
				}
			}
		}
	}

	static void method3701(GraphicsToolkit class_ra, int i, int i_165_, int i_166_, int i_167_, int[] is, byte[] is_168_) {
		if (is != null) {
			for (int i_169_ = 0; i_169_ < is.length; i_169_++) {
				ObjectDefinitions class432 = aClass433_3220.getObjectDefinitions(is[i_169_]);
				int i_170_ = class432.anInt5400 * -1204256389;
				if (i_170_ != -1) {
					Class496 class496 = aClass487_3225.method6159(i_170_, -2130050645);
					Class57 class57 = class496.method6198(class_ra, (class432.aBoolean5401 ? is_168_[i_169_] >> 6 & 0x3 : 0), (class432.aBoolean5440 ? class432.aBoolean5404 : false), (byte) -47);
					if (class57 != null) {
						int i_171_ = i_166_ * class57.method271() >> 2;
						int i_172_ = i_167_ * class57.method626() >> 2;
						if (class496.aBoolean6098) {
							int i_173_ = class432.sizeX * -1125834887;
							int i_174_ = class432.sizeY * -565161399;
							if ((is_168_[i_169_] >> 6 & 0x1) == 1) {
								int i_175_ = i_173_;
								i_173_ = i_174_;
								i_174_ = i_175_;
							}
							i_171_ = i_173_ * i_166_;
							i_172_ = i_174_ * i_167_;
						}
						if (i_171_ != 0 && i_172_ != 0) {
							if (class496.anInt6096 * -2012904123 != 0)
								class57.method634(i, i_165_ - i_172_ + i_167_, i_171_, i_172_, 0, (~0xffffff | (class496.anInt6096 * -2012904123)), 1);
							else
								class57.method633(i, i_165_ - i_172_ + i_167_, i_171_, i_172_);
						}
					}
				}
			}
		}
	}

	static Class453 method3702(GraphicsToolkit class_ra) {
		int i = anInt3252 - anInt3230;
		int i_176_ = anInt3241 - anInt3242;
		int i_177_ = (anInt3256 - anInt3221 << 16) / i;
		int i_178_ = (anInt3257 - anInt3255 << 16) / i_176_;
		return method3703(class_ra, i_177_, i_178_, 0, 0);
	}

	static Class453 method3703(GraphicsToolkit class_ra, int i, int i_179_, int i_180_, int i_181_) {
		for (Class298_Sub52 class298_sub52 = (Class298_Sub52) aClass453_3236.method5939(1766612795); class298_sub52 != null; class298_sub52 = (Class298_Sub52) aClass453_3236.method5944(49146))
			method3704(class_ra, class298_sub52, i, i_179_, i_180_, i_181_);
		return aClass453_3236;
	}

	static void method3704(GraphicsToolkit class_ra, Class298_Sub52 class298_sub52, int i, int i_182_, int i_183_, int i_184_) {
		class298_sub52.anInt7609 = (anInt3221 + (i_183_ + i * (class298_sub52.anInt7607 * 2122110429 - anInt3230) >> 16)) * -1722635483;
		class298_sub52.anInt7606 = (anInt3257 - (i_184_ + i_182_ * (class298_sub52.anInt7610 * -372920341 - anInt3242) >> 16)) * -283355805;
	}

	public static Class298_Sub37_Sub13 method3705(int i) {
		return (Class298_Sub37_Sub13) aClass437_3226.get((long) i);
	}

	static void method3706() {
		aByteArray3224 = new byte[anInt3239 * anInt3240];
		aByteArray3222 = new byte[anInt3239 * anInt3240];
		aByteArray3246 = new byte[anInt3239 * anInt3240];
		anObjectArray3247 = new Object[anInt3239 * anInt3240];
		aByteArray3250 = new byte[anInt3239 * anInt3240];
		anArrayListArrayArrayArray3249 = new ArrayList[3][anInt3239 >> 6][anInt3240 >> 6];
		anIntArray3237 = new int[aClass375_3253.anInt4081 * 138682397 + 1];
	}

	static void method3707(Interface_ma interface_ma, int i, int i_185_) {
		for (int i_186_ = 0; i_186_ < aClass375_3253.anInt4081 * 138682397; i_186_++)
			anIntArray3237[i_186_ + 1] = method3694(interface_ma, i_186_, i, i_185_);
	}

	public static Class298_Sub37_Sub13 method3708(int i, int i_187_) {
		for (Class298_Sub37_Sub13 class298_sub37_sub13 = ((Class298_Sub37_Sub13) aClass437_3226.method5816(1588897265)); class298_sub37_sub13 != null; class298_sub37_sub13 = ((Class298_Sub37_Sub13) aClass437_3226.method5815((byte) -24))) {
			if (((Class298_Sub37_Sub13) class298_sub37_sub13).aBoolean9648 && class298_sub37_sub13.method3450(i, i_187_, (byte) -105))
				return class298_sub37_sub13;
		}
		return null;
	}

	static void method3709(int i, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_) {
		anInt3230 = i - anInt3245;
		anInt3241 = i_188_ - anInt3238;
		anInt3252 = i_189_ - anInt3245;
		anInt3242 = i_190_ - anInt3238;
		anInt3221 = i_191_;
		anInt3255 = i_192_;
		anInt3256 = i_193_;
		anInt3257 = i_194_;
	}

	static void method3710() {
		for (int i = 0; i < anInt3239; i++) {
			for (int i_195_ = 0; i_195_ < anInt3240; i_195_++) {
				Object object = anObjectArray3247[i + i_195_ * anInt3239];
				if (object != null) {
					if (object instanceof Class298_Sub54) {
						Class298_Sub54 class298_sub54 = (Class298_Sub54) object;
						if (class298_sub54 != null) {
							for (int i_196_ = 0; i_196_ < (((Class298_Sub54) class298_sub54).anIntArray7621).length; i_196_++) {
								ObjectDefinitions class432 = (aClass433_3220.getObjectDefinitions((((Class298_Sub54) class298_sub54).anIntArray7621[i_196_])));
								int i_197_ = class432.anInt5399 * -1422593103;
								if (class432.anIntArray5366 != null) {
									class432 = (class432.method5777(anInterface23_3223, 2117091255));
									if (class432 != null)
										i_197_ = class432.anInt5399 * -1422593103;
								}
								if (i_197_ != -1) {
									Class298_Sub52 class298_sub52 = new Class298_Sub52(i_197_);
									class298_sub52.anInt7607 = i * 898378357;
									class298_sub52.anInt7610 = i_195_ * -1686044477;
									aClass453_3236.method5935(class298_sub52, 2035193574);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						ObjectDefinitions class432 = aClass433_3220.getObjectDefinitions(integer.intValue());
						int i_198_ = class432.anInt5399 * -1422593103;
						if (class432.anIntArray5366 != null) {
							class432 = class432.method5777(anInterface23_3223, 1079072044);
							if (class432 != null)
								i_198_ = class432.anInt5399 * -1422593103;
						}
						if (i_198_ != -1) {
							Class298_Sub52 class298_sub52 = new Class298_Sub52(i_198_);
							class298_sub52.anInt7607 = i * 898378357;
							class298_sub52.anInt7610 = i_195_ * -1686044477;
							aClass453_3236.method5935(class298_sub52, 1393789862);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_199_ = 0; i_199_ < anArrayListArrayArrayArray3249[0].length; i_199_++) {
				for (int i_200_ = 0; i_200_ < anArrayListArrayArrayArray3249[0][0].length; i_200_++) {
					ArrayList arraylist = anArrayListArrayArrayArray3249[i][i_199_][i_200_];
					if (arraylist != null) {
						Iterator iterator = arraylist.iterator();
						while (iterator.hasNext()) {
							Class312 class312 = (Class312) iterator.next();
							if (((Class312) class312).anIntArray3288 != null) {
								for (int i_201_ = 0; i_201_ < (((Class312) class312).anIntArray3288).length; i_201_++) {
									ObjectDefinitions class432 = (aClass433_3220.getObjectDefinitions((((Class312) class312).anIntArray3288[i_201_])));
									int i_202_ = class432.anInt5399 * -1422593103;
									if (class432.anIntArray5366 != null) {
										class432 = (class432.method5777(anInterface23_3223, 984911486));
										if (class432 != null)
											i_202_ = (class432.anInt5399 * -1422593103);
									}
									if (i_202_ != -1) {
										Class298_Sub52 class298_sub52 = new Class298_Sub52(i_202_);
										class298_sub52.anInt7607 = ((i_199_ + (anInt3245 >> 6)) * 64 + (((Class312) class312).aByte3292) - anInt3245) * 898378357;
										class298_sub52.anInt7610 = ((i_200_ + (anInt3238 >> 6)) * 64 + (((Class312) class312).aByte3293) - anInt3238) * -1686044477;
										aClass453_3236.method5935(class298_sub52, 1574718042);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method3711(GraphicsToolkit class_ra, Class298_Sub52 class298_sub52, Class352 class352) {
		if (class352.anIntArray3803 != null) {
			int[] is = new int[class352.anIntArray3803.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_203_ = (class352.anIntArray3803[i * 2] + class298_sub52.anInt7607 * 2122110429);
				int i_204_ = (class352.anIntArray3803[i * 2 + 1] + class298_sub52.anInt7610 * -372920341);
				is[i * 2] = anInt3221 + ((anInt3256 - anInt3221) * (i_203_ - anInt3230) / (anInt3252 - anInt3230));
				is[i * 2 + 1] = anInt3257 - ((anInt3257 - anInt3255) * (i_204_ - anInt3242) / (anInt3241 - anInt3242));
			}
			Class81.method857(class_ra, is, class352.anInt3808 * -248291889);
			if (class352.anInt3806 * -972644285 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_205_ = is[i * 2];
					int i_206_ = is[i * 2 + 1];
					int i_207_ = is[(i + 1) * 2];
					int i_208_ = is[(i + 1) * 2 + 1];
					if (i_207_ < i_205_) {
						int i_209_ = i_205_;
						int i_210_ = i_206_;
						i_205_ = i_207_;
						i_206_ = i_208_;
						i_207_ = i_209_;
						i_208_ = i_210_;
					} else if (i_207_ == i_205_ && i_208_ < i_206_) {
						int i_211_ = i_206_;
						i_206_ = i_208_;
						i_208_ = i_211_;
					}
					class_ra.method5039(i_205_, i_206_, i_207_, i_208_, (class352.anIntArray3814[class352.aByteArray3777[i] & 0xff]), 1, class352.anInt3806 * -972644285, class352.anInt3799 * 2123190239, class352.anInt3788 * -176015499);
				}
				int i = is[is.length - 2];
				int i_212_ = is[is.length - 1];
				int i_213_ = is[0];
				int i_214_ = is[1];
				if (i_213_ < i) {
					int i_215_ = i;
					int i_216_ = i_212_;
					i = i_213_;
					i_212_ = i_214_;
					i_213_ = i_215_;
					i_214_ = i_216_;
				} else if (i_213_ == i && i_214_ < i_212_) {
					int i_217_ = i_212_;
					i_212_ = i_214_;
					i_214_ = i_217_;
				}
				class_ra.method5039(i, i_212_, i_213_, i_214_, (class352.anIntArray3814[((class352.aByteArray3777[class352.aByteArray3777.length - 1]) & 0xff)]), 1, class352.anInt3806 * -972644285, class352.anInt3799 * 2123190239, class352.anInt3788 * -176015499);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class_ra.method5018(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class352.anIntArray3814[class352.aByteArray3777[i] & 0xff]), -608729974);
				class_ra.method5018(is[is.length - 2], is[is.length - 1], is[0], is[1], (class352.anIntArray3814[((class352.aByteArray3777[class352.aByteArray3777.length - 1]) & 0xff)]), -1529195318);
			}
		}
	}
}
