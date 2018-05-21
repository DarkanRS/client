/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class356 {
	static Class356 aClass356_4117 = new Class356();
	static Class356 aClass356_4118 = new Class356();
	static Class356 aClass356_4119 = new Class356();

	public static Class356[] method6217() {
		return (new Class356[] { aClass356_4117, aClass356_4118, aClass356_4119 });
	}

	public static Class356[] method6218() {
		return (new Class356[] { aClass356_4117, aClass356_4118, aClass356_4119 });
	}

	public static Class356[] method6219() {
		return (new Class356[] { aClass356_4117, aClass356_4118, aClass356_4119 });
	}

	public static Class356[] method6220() {
		return (new Class356[] { aClass356_4117, aClass356_4118, aClass356_4119 });
	}

	public int method6221(int i, int i_0_, int i_1_) {
		int i_2_ = (-418109423 * Class349.anInt4083 > i_0_ ? Class349.anInt4083 * -418109423 : i_0_);
		if (aClass356_4117 == this)
			return 0;
		if (aClass356_4119 == this)
			return i_2_ - i;
		if (this == aClass356_4118)
			return (i_2_ - i) / 2;
		return 0;
	}

	Class356() {
		/* empty */
	}

	public int method6222(int i, int i_3_) {
		int i_4_ = (-418109423 * Class349.anInt4083 > i_3_ ? Class349.anInt4083 * -418109423 : i_3_);
		if (aClass356_4117 == this)
			return 0;
		if (aClass356_4119 == this)
			return i_4_ - i;
		if (this == aClass356_4118)
			return (i_4_ - i) / 2;
		return 0;
	}

	public int method6223(int i, int i_5_) {
		int i_6_ = (-418109423 * Class349.anInt4083 > i_5_ ? Class349.anInt4083 * -418109423 : i_5_);
		if (aClass356_4117 == this)
			return 0;
		if (aClass356_4119 == this)
			return i_6_ - i;
		if (this == aClass356_4118)
			return (i_6_ - i) / 2;
		return 0;
	}

	static final void method6224(CS2Executor class527, int i) {
		int i_7_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_7_, (byte) 8);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_7_ >> 16];
		Class158.method2732(class118, class98, class527, 2144367938);
	}

	static int method6225(CharSequence charsequence, int i, boolean bool, int i_8_) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_9_ = false;
		boolean bool_10_ = false;
		int i_11_ = 0;
		int i_12_ = charsequence.length();
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			int i_14_ = charsequence.charAt(i_13_);
			if (i_13_ == 0) {
				if (i_14_ == 45) {
					bool_9_ = true;
					continue;
				}
				if (43 == i_14_ && bool)
					continue;
			}
			if (i_14_ >= 48 && i_14_ <= 57)
				i_14_ -= 48;
			else if (i_14_ >= 65 && i_14_ <= 90)
				i_14_ -= 55;
			else if (i_14_ >= 97 && i_14_ <= 122)
				i_14_ -= 87;
			else
				throw new NumberFormatException();
			if (i_14_ >= i)
				throw new NumberFormatException();
			if (bool_9_)
				i_14_ = -i_14_;
			int i_15_ = i * i_11_ + i_14_;
			if (i_15_ / i != i_11_)
				throw new NumberFormatException();
			i_11_ = i_15_;
			bool_10_ = true;
		}
		if (!bool_10_)
			throw new NumberFormatException();
		return i_11_;
	}

	static final void method6226(CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_16_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_17_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 1]);
		if (i_16_ > 700 || i_17_ > 700)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 256;
		double d = ((Math.random() * (double) (i_17_ + i_16_) - (double) i_16_ + 800.0) / 100.0);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) (Math.pow(2.0, d) + 0.5);
	}

	public static final void method6227(boolean bool, byte i) {
		if (!bool) {
			Class122.aClass536_1535.method11476((byte) -55);
			Class493.aClass479_5778.method8026(113468323);
			Class20.aClass31_204.method801(-1911445195);
			client.aClass257_7353.method4436(-1471749977).method7895((byte) 113);
			Class350_Sub1.aClass406_7757.method6836((byte) -66);
			IndexLoaders.ITEM_INDEX_LOADER.method7150(-1855693683);
			Class330.aClass523_3868.method11204(-2125784469);
			Class96_Sub20.aClass515_9416.method8848(-1321298853);
			Class16.aClass230_147.method3903((byte) -72);
			Class104.aClass377_1065.method6388((byte) -38);
			Class45.aClass447_435.method7458(1914523860);
			Class243.aClass498_3001.method8319(-835963973);
			Class502.aClass394_5831.method6754(-1473374430);
			Class497.aClass233_5822.method3924(-1007220233);
			Class96_Sub16.aClass211_9383.method3617(-1794100621);
			Class97.aClass427_995.method7174(-504359816);
			Class397.aClass218_4813.method3699((byte) 1);
			Class125.aClass424_1573.method7070(1503444365);
			Class149.aClass288_1746.method5070(1894841222);
			Class488.aClass45_5759.method916((byte) 60);
			Class282_Sub23.aClass436_7683.method7306(362287177);
			Class468_Sub23.aClass438_7932.method7324(1300086915);
			Login.aClass210_3389.method3604((short) 256);
			Class286.aClass290_3402.method5103(-901972718);
			Class468_Sub8.method12679(2008833833);
			Class520.method11161((byte) 1);
			Class487.aClass378_5752.method6410((short) 25980);
			Class413.method6939((byte) -12);
			if (Class90.aClass496_952 != Class496.aClass496_5813) {
				for (int i_18_ = 0; i_18_ < Class339.aByteArrayArray3986.length; i_18_++)
					Class339.aByteArrayArray3986[i_18_] = null;
				client.anInt7173 = 0;
			}
			client.aClass257_7353.method4435((byte) 1).method4040(-297960469);
			Class468_Sub27.method12958(-449406429);
			Class188.method3140((byte) -62);
			Class191.method3166(-96454499);
			Class321.method5757(1880031383);
			Class517.aClass229_5901.method3859(876370296);
			client.aClass229_7204.method3859(-1910455391);
			Class20.aClass229_191.method3859(-1112414148);
		}
		Class430.method7217(953478712);
		Class12.method482((byte) 38);
	}
}
