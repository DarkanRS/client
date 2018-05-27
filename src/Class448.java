/* Class448 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class448 {
	public static boolean aBool5419;
	public static Class450 aClass450_5420;
	public static Class450 aClass450_5421;
	public static boolean aBool5422 = false;
	static Class510 aClass510_5423;
	public static Class450 aClass450_5424;
	public static long aLong5425;
	static Class217_Sub1[] aClass217_Sub1Array5426 = new Class217_Sub1[0];
	static int anInt5427 = 1100886800;
	public static boolean aBool5428;
	public static Class450 aClass450_5429;
	static int anInt5430 = 0;

	public static void method7464(boolean bool, byte[] is) {
		if (null == Class96_Sub20.aClass282_Sub35_9415)
			Class96_Sub20.aClass282_Sub35_9415 = new RsByteBuffer(20000);
		Class96_Sub20.aClass282_Sub35_9415.writeBytes(is, 0, is.length);
		if (bool) {
			Class468_Sub10.method12695((Class96_Sub20.aClass282_Sub35_9415.buffer), (byte) 1);
			aClass217_Sub1Array5426 = new Class217_Sub1[Class4.anInt34 * -2043473211];
			int i = 0;
			for (int i_0_ = -377428565 * Class485.anInt5740; i_0_ <= Class244.anInt3003 * -860748679; i_0_++) {
				Class217_Sub1 class217_sub1 = ObjectIndexLoader.method7916(i_0_, 2029685957);
				if (null != class217_sub1)
					aClass217_Sub1Array5426[i++] = class217_sub1;
			}
			aBool5422 = false;
			aLong5425 = Class169.method2869(1747177113) * -3240548399766708365L;
			Class96_Sub20.aClass282_Sub35_9415 = null;
		}
	}

	static int method7465(Class217_Sub1 class217_sub1, Class217_Sub1 class217_sub1_1_, int i, boolean bool) {
		if (i == 1) {
			int i_2_ = 652811625 * class217_sub1.anInt2701;
			int i_3_ = 652811625 * class217_sub1_1_.anInt2701;
			if (!bool) {
				if (i_2_ == -1)
					i_2_ = 2001;
				if (-1 == i_3_)
					i_3_ = 2001;
			}
			return i_2_ - i_3_;
		}
		if (2 == i)
			return Class455.method7557((class217_sub1.method13055((short) -10299).aString2679), (class217_sub1_1_.method13055((short) -4460).aString2679), Class223.CURRENT_LANGUAGE, 1341608337);
		if (3 == i) {
			if (class217_sub1.aString7977.equals("-")) {
				if (class217_sub1_1_.aString7977.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class217_sub1_1_.aString7977.equals("-"))
				return bool ? 1 : -1;
			return Class455.method7557(class217_sub1.aString7977, class217_sub1_1_.aString7977, Class223.CURRENT_LANGUAGE, 1341608337);
		}
		if (i == 4)
			return (class217_sub1.method3683(-1211254734) ? class217_sub1_1_.method3683(-1211254734) ? 0 : 1 : class217_sub1_1_.method3683(-1211254734) ? -1 : 0);
		if (5 == i)
			return (class217_sub1.method3681(-26170956) ? class217_sub1_1_.method3681(-591623949) ? 0 : 1 : class217_sub1_1_.method3681(-157990578) ? -1 : 0);
		if (6 == i)
			return (class217_sub1.method3682((short) -235) ? class217_sub1_1_.method3682((short) -18101) ? 0 : 1 : class217_sub1_1_.method3682((short) -25533) ? -1 : 0);
		if (7 == i)
			return (class217_sub1.method3680((byte) 1) ? class217_sub1_1_.method3680((byte) 1) ? 0 : 1 : class217_sub1_1_.method3680((byte) 1) ? -1 : 0);
		if (i == 8) {
			int i_4_ = class217_sub1.anInt7978 * -129507359;
			int i_5_ = -129507359 * class217_sub1_1_.anInt7978;
			if (bool) {
				if (1000 == i_4_)
					i_4_ = -1;
				if (i_5_ == 1000)
					i_5_ = -1;
			} else {
				if (i_4_ == -1)
					i_4_ = 1000;
				if (i_5_ == -1)
					i_5_ = 1000;
			}
			return i_4_ - i_5_;
		}
		return (157132839 * class217_sub1.anInt7975 - class217_sub1_1_.anInt7975 * 157132839);
	}

	public static void method7466(String string, int i) {
		if (aClass450_5424 == null)
			aClass450_5424 = new Class450();
		aClass450_5424.aString5433 = string;
		aClass450_5424.worldId = (1099 + i) * -1933199413;
		aClass450_5424.anInt5434 = -58916693 * aClass450_5424.worldId + 1140744768;
		aClass450_5424.anInt5437 = 1250363344 + aClass450_5424.worldId * -1441381029;
	}

	Class448() throws Throwable {
		throw new Error();
	}

	public static void method7467() {
		if (-1 != -87869981 * aClass450_5421.worldId)
			Class62.method1262(-87869981 * aClass450_5421.worldId, aClass450_5421.aString5433, (byte) 8);
	}

	public static void method7468() {
		if (-1 != -87869981 * aClass450_5421.worldId)
			Class62.method1262(-87869981 * aClass450_5421.worldId, aClass450_5421.aString5433, (byte) 15);
	}

	static int method7469(Class217_Sub1 class217_sub1, Class217_Sub1 class217_sub1_6_, int i, boolean bool, int i_7_, boolean bool_8_) {
		int i_9_ = Class468_Sub1.method12620(class217_sub1, class217_sub1_6_, i, bool, -1673101697);
		if (i_9_ != 0) {
			if (bool)
				return -i_9_;
			return i_9_;
		}
		if (-1 == i_7_)
			return 0;
		int i_10_ = Class468_Sub1.method12620(class217_sub1, class217_sub1_6_, i_7_, bool_8_, -427222374);
		if (bool_8_)
			return -i_10_;
		return i_10_;
	}

	static {
		aClass510_5423 = null;
		aBool5419 = false;
	}

	public static void method7470(boolean bool, byte[] is) {
		if (null == Class96_Sub20.aClass282_Sub35_9415)
			Class96_Sub20.aClass282_Sub35_9415 = new RsByteBuffer(20000);
		Class96_Sub20.aClass282_Sub35_9415.writeBytes(is, 0, is.length);
		if (bool) {
			Class468_Sub10.method12695((Class96_Sub20.aClass282_Sub35_9415.buffer), (byte) 1);
			aClass217_Sub1Array5426 = new Class217_Sub1[Class4.anInt34 * -2043473211];
			int i = 0;
			for (int i_11_ = -377428565 * Class485.anInt5740; i_11_ <= Class244.anInt3003 * -860748679; i_11_++) {
				Class217_Sub1 class217_sub1 = ObjectIndexLoader.method7916(i_11_, 1922989686);
				if (null != class217_sub1)
					aClass217_Sub1Array5426[i++] = class217_sub1;
			}
			aBool5422 = false;
			aLong5425 = Class169.method2869(2015625783) * -3240548399766708365L;
			Class96_Sub20.aClass282_Sub35_9415 = null;
		}
	}

	public static Class217_Sub1 method7471() {
		if (anInt5427 * -1600221303 < aClass217_Sub1Array5426.length)
			return (aClass217_Sub1Array5426[(anInt5427 += -1227843911) * -1600221303 - 1]);
		return null;
	}

	public static void method7472() {
		if (-1 != -87869981 * aClass450_5421.worldId)
			Class62.method1262(-87869981 * aClass450_5421.worldId, aClass450_5421.aString5433, (byte) 40);
	}

	public static Class217_Sub1 method7473() {
		return ObjectIndexLoader.method7916((-87869981 * Class159.aClass450_2010.worldId), -753922057);
	}

	public static Class217_Sub1 method7474() {
		return ObjectIndexLoader.method7916((-87869981 * Class159.aClass450_2010.worldId), 279031547);
	}

	public static Class217_Sub1 method7475() {
		return ObjectIndexLoader.method7916((-87869981 * Class159.aClass450_2010.worldId), 604552783);
	}

	public static void method7476(int i, boolean bool, int i_12_, boolean bool_13_) {
		Class52.method1086(0, aClass217_Sub1Array5426.length - 1, i, bool, i_12_, bool_13_, (byte) -74);
		anInt5430 = 0;
		aClass510_5423 = null;
	}

	public static void method7477(boolean bool, byte[] is) {
		if (null == Class96_Sub20.aClass282_Sub35_9415)
			Class96_Sub20.aClass282_Sub35_9415 = new RsByteBuffer(20000);
		Class96_Sub20.aClass282_Sub35_9415.writeBytes(is, 0, is.length);
		if (bool) {
			Class468_Sub10.method12695((Class96_Sub20.aClass282_Sub35_9415.buffer), (byte) 1);
			aClass217_Sub1Array5426 = new Class217_Sub1[Class4.anInt34 * -2043473211];
			int i = 0;
			for (int i_14_ = -377428565 * Class485.anInt5740; i_14_ <= Class244.anInt3003 * -860748679; i_14_++) {
				Class217_Sub1 class217_sub1 = ObjectIndexLoader.method7916(i_14_, -1148564437);
				if (null != class217_sub1)
					aClass217_Sub1Array5426[i++] = class217_sub1;
			}
			aBool5422 = false;
			aLong5425 = Class169.method2869(2007635525) * -3240548399766708365L;
			Class96_Sub20.aClass282_Sub35_9415 = null;
		}
	}

	static void method7478(int i, int i_15_, int i_16_, boolean bool, int i_17_, boolean bool_18_) {
		if (i < i_15_) {
			int i_19_ = (i_15_ + i) / 2;
			int i_20_ = i;
			Class217_Sub1 class217_sub1 = aClass217_Sub1Array5426[i_19_];
			aClass217_Sub1Array5426[i_19_] = aClass217_Sub1Array5426[i_15_];
			aClass217_Sub1Array5426[i_15_] = class217_sub1;
			for (int i_21_ = i; i_21_ < i_15_; i_21_++) {
				if (Class252.method4325(aClass217_Sub1Array5426[i_21_], class217_sub1, i_16_, bool, i_17_, bool_18_, -907382177) <= 0) {
					Class217_Sub1 class217_sub1_22_ = aClass217_Sub1Array5426[i_21_];
					aClass217_Sub1Array5426[i_21_] = aClass217_Sub1Array5426[i_20_];
					aClass217_Sub1Array5426[i_20_++] = class217_sub1_22_;
				}
			}
			aClass217_Sub1Array5426[i_15_] = aClass217_Sub1Array5426[i_20_];
			aClass217_Sub1Array5426[i_20_] = class217_sub1;
			Class52.method1086(i, i_20_ - 1, i_16_, bool, i_17_, bool_18_, (byte) -42);
			Class52.method1086(i_20_ + 1, i_15_, i_16_, bool, i_17_, bool_18_, (byte) -98);
		}
	}

	static void method7479(int i, int i_23_, int i_24_, boolean bool, int i_25_, boolean bool_26_) {
		if (i < i_23_) {
			int i_27_ = (i_23_ + i) / 2;
			int i_28_ = i;
			Class217_Sub1 class217_sub1 = aClass217_Sub1Array5426[i_27_];
			aClass217_Sub1Array5426[i_27_] = aClass217_Sub1Array5426[i_23_];
			aClass217_Sub1Array5426[i_23_] = class217_sub1;
			for (int i_29_ = i; i_29_ < i_23_; i_29_++) {
				if (Class252.method4325(aClass217_Sub1Array5426[i_29_], class217_sub1, i_24_, bool, i_25_, bool_26_, -1500326392) <= 0) {
					Class217_Sub1 class217_sub1_30_ = aClass217_Sub1Array5426[i_29_];
					aClass217_Sub1Array5426[i_29_] = aClass217_Sub1Array5426[i_28_];
					aClass217_Sub1Array5426[i_28_++] = class217_sub1_30_;
				}
			}
			aClass217_Sub1Array5426[i_23_] = aClass217_Sub1Array5426[i_28_];
			aClass217_Sub1Array5426[i_28_] = class217_sub1;
			Class52.method1086(i, i_28_ - 1, i_24_, bool, i_25_, bool_26_, (byte) -57);
			Class52.method1086(i_28_ + 1, i_23_, i_24_, bool, i_25_, bool_26_, (byte) -56);
		}
	}

	public static Class217_Sub1 method7480() {
		anInt5427 = 0;
		return Class77.method1368(-922106938);
	}

	static int method7481(Class217_Sub1 class217_sub1, Class217_Sub1 class217_sub1_31_, int i, boolean bool, int i_32_, boolean bool_33_) {
		int i_34_ = Class468_Sub1.method12620(class217_sub1, class217_sub1_31_, i, bool, -504888690);
		if (i_34_ != 0) {
			if (bool)
				return -i_34_;
			return i_34_;
		}
		if (-1 == i_32_)
			return 0;
		int i_35_ = Class468_Sub1.method12620(class217_sub1, class217_sub1_31_, i_32_, bool_33_, -351700985);
		if (bool_33_)
			return -i_35_;
		return i_35_;
	}

	static int method7482(Class217_Sub1 class217_sub1, Class217_Sub1 class217_sub1_36_, int i, boolean bool) {
		if (i == 1) {
			int i_37_ = 652811625 * class217_sub1.anInt2701;
			int i_38_ = 652811625 * class217_sub1_36_.anInt2701;
			if (!bool) {
				if (i_37_ == -1)
					i_37_ = 2001;
				if (-1 == i_38_)
					i_38_ = 2001;
			}
			return i_37_ - i_38_;
		}
		if (2 == i)
			return Class455.method7557((class217_sub1.method13055((short) -27937).aString2679), (class217_sub1_36_.method13055((short) -20577).aString2679), Class223.CURRENT_LANGUAGE, 1341608337);
		if (3 == i) {
			if (class217_sub1.aString7977.equals("-")) {
				if (class217_sub1_36_.aString7977.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class217_sub1_36_.aString7977.equals("-"))
				return bool ? 1 : -1;
			return Class455.method7557(class217_sub1.aString7977, class217_sub1_36_.aString7977, Class223.CURRENT_LANGUAGE, 1341608337);
		}
		if (i == 4)
			return (class217_sub1.method3683(-1211254734) ? class217_sub1_36_.method3683(-1211254734) ? 0 : 1 : class217_sub1_36_.method3683(-1211254734) ? -1 : 0);
		if (5 == i)
			return (class217_sub1.method3681(-1262865189) ? class217_sub1_36_.method3681(-1568006401) ? 0 : 1 : class217_sub1_36_.method3681(-62340339) ? -1 : 0);
		if (6 == i)
			return (class217_sub1.method3682((short) -6602) ? class217_sub1_36_.method3682((short) -16256) ? 0 : 1 : class217_sub1_36_.method3682((short) -15796) ? -1 : 0);
		if (7 == i)
			return (class217_sub1.method3680((byte) 1) ? class217_sub1_36_.method3680((byte) 1) ? 0 : 1 : class217_sub1_36_.method3680((byte) 1) ? -1 : 0);
		if (i == 8) {
			int i_39_ = class217_sub1.anInt7978 * -129507359;
			int i_40_ = -129507359 * class217_sub1_36_.anInt7978;
			if (bool) {
				if (1000 == i_39_)
					i_39_ = -1;
				if (i_40_ == 1000)
					i_40_ = -1;
			} else {
				if (i_39_ == -1)
					i_39_ = 1000;
				if (i_40_ == -1)
					i_40_ = 1000;
			}
			return i_39_ - i_40_;
		}
		return (157132839 * class217_sub1.anInt7975 - class217_sub1_36_.anInt7975 * 157132839);
	}

	public static void method7483(int i, boolean bool, int i_41_, boolean bool_42_) {
		Class52.method1086(0, aClass217_Sub1Array5426.length - 1, i, bool, i_41_, bool_42_, (byte) -45);
		anInt5430 = 0;
		aClass510_5423 = null;
	}

	static int method7484(Class217_Sub1 class217_sub1, Class217_Sub1 class217_sub1_43_, int i, boolean bool) {
		if (i == 1) {
			int i_44_ = 652811625 * class217_sub1.anInt2701;
			int i_45_ = 652811625 * class217_sub1_43_.anInt2701;
			if (!bool) {
				if (i_44_ == -1)
					i_44_ = 2001;
				if (-1 == i_45_)
					i_45_ = 2001;
			}
			return i_44_ - i_45_;
		}
		if (2 == i)
			return Class455.method7557((class217_sub1.method13055((short) -9516).aString2679), (class217_sub1_43_.method13055((short) -13769).aString2679), Class223.CURRENT_LANGUAGE, 1341608337);
		if (3 == i) {
			if (class217_sub1.aString7977.equals("-")) {
				if (class217_sub1_43_.aString7977.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class217_sub1_43_.aString7977.equals("-"))
				return bool ? 1 : -1;
			return Class455.method7557(class217_sub1.aString7977, class217_sub1_43_.aString7977, Class223.CURRENT_LANGUAGE, 1341608337);
		}
		if (i == 4)
			return (class217_sub1.method3683(-1211254734) ? class217_sub1_43_.method3683(-1211254734) ? 0 : 1 : class217_sub1_43_.method3683(-1211254734) ? -1 : 0);
		if (5 == i)
			return (class217_sub1.method3681(-487157807) ? class217_sub1_43_.method3681(-2129908178) ? 0 : 1 : class217_sub1_43_.method3681(-1064173776) ? -1 : 0);
		if (6 == i)
			return (class217_sub1.method3682((short) -6512) ? class217_sub1_43_.method3682((short) -16265) ? 0 : 1 : class217_sub1_43_.method3682((short) -29837) ? -1 : 0);
		if (7 == i)
			return (class217_sub1.method3680((byte) 1) ? class217_sub1_43_.method3680((byte) 1) ? 0 : 1 : class217_sub1_43_.method3680((byte) 1) ? -1 : 0);
		if (i == 8) {
			int i_46_ = class217_sub1.anInt7978 * -129507359;
			int i_47_ = -129507359 * class217_sub1_43_.anInt7978;
			if (bool) {
				if (1000 == i_46_)
					i_46_ = -1;
				if (i_47_ == 1000)
					i_47_ = -1;
			} else {
				if (i_46_ == -1)
					i_46_ = 1000;
				if (i_47_ == -1)
					i_47_ = 1000;
			}
			return i_46_ - i_47_;
		}
		return (157132839 * class217_sub1.anInt7975 - class217_sub1_43_.anInt7975 * 157132839);
	}
}
