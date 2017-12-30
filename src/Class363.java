/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class363 {
	public static final int anInt4201 = 1;
	public static final int anInt4202 = 727;
	public static int anInt4203;

	Class363() throws Throwable {
		throw new Error();
	}

	static final void method6282(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class359.method6244(class118, class98, class527, -1411462408);
	}

	static final void method6283(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class287.method5066(class118, class98, class527, 2045260236);
	}

	static final void method6284(CS2Executor class527, int i) {
		int i_0_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (Class119.aClass426_1463.getItemDefinitions(i_0_, 1383536878).anInt5051 * 15210351);
	}

	static final void method6285(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 456793949 * Class9.anInt72;
	}

	static final void method6286(long l) {
		Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
		int i = (int) class385.aFloat4671 + 1798620263 * client.anInt7248;
		int i_1_ = (int) class385.aFloat4673 + client.anInt7250 * -537269317;
		if (Class11.anInt122 * 1762352089 - i < -2000 || Class11.anInt122 * 1762352089 - i > 2000 || 518160421 * Class266.anInt3289 - i_1_ < -2000 || 518160421 * Class266.anInt3289 - i_1_ > 2000) {
			Class11.anInt122 = i * -2082376599;
			Class266.anInt3289 = 405117869 * i_1_;
		}
		if (i != 1762352089 * Class11.anInt122) {
			int i_2_ = i - 1762352089 * Class11.anInt122;
			int i_3_ = (int) (l * (long) i_2_ / 320L);
			if (i_2_ > 0) {
				if (0 == i_3_)
					i_3_ = 1;
				else if (i_3_ > i_2_)
					i_3_ = i_2_;
			} else if (0 == i_3_)
				i_3_ = -1;
			else if (i_3_ < i_2_)
				i_3_ = i_2_;
			Class11.anInt122 += -2082376599 * i_3_;
		}
		if (518160421 * Class266.anInt3289 != i_1_) {
			int i_4_ = i_1_ - Class266.anInt3289 * 518160421;
			int i_5_ = (int) (l * (long) i_4_ / 320L);
			if (i_4_ > 0) {
				if (i_5_ == 0)
					i_5_ = 1;
				else if (i_5_ > i_4_)
					i_5_ = i_4_;
			} else if (0 == i_5_)
				i_5_ = -1;
			else if (i_5_ < i_4_)
				i_5_ = i_4_;
			Class266.anInt3289 += 405117869 * i_5_;
		}
		client.aFloat7365 += client.aFloat7266 * (float) l / 6.0F;
		client.aFloat7146 += client.aFloat7284 * (float) l / 6.0F;
		IsaacCipher.method7268(1036013303);
	}

	static final void method6287(Animable class521_sub1_sub1_sub2, boolean bool, int i) {
		int i_6_ = Class249.aClass249_3083.aByte3085;
		int i_7_ = 0;
		if (class521_sub1_sub1_sub2.anInt10342 * 403949281 > client.cycles * -1809259861)
			Class249.method4281(class521_sub1_sub1_sub2, -1503548002);
		else if (1277328401 * class521_sub1_sub1_sub2.anInt10345 >= -1809259861 * client.cycles)
			Class463.method7727(class521_sub1_sub1_sub2, -1790074477);
		else {
			Class282_Sub51.method13466(class521_sub1_sub1_sub2, bool, 141891001);
			i_6_ = 1714233093 * Class44.anInt430;
			i_7_ = Class8_Sub1.anInt8515 * -1293360775;
		}
		Class385 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
		if ((int) class385.aFloat4671 < 512 || (int) class385.aFloat4673 < 512 || ((int) class385.aFloat4671 >= (client.aClass257_7353.method4424(735172073) - 1) * 512) || ((int) class385.aFloat4673 >= ((client.aClass257_7353.method4451(-1048165287) - 1) * 512))) {
			class521_sub1_sub1_sub2.aClass456_10338.method7567(-1, (short) 8960);
			for (int i_8_ = 0; i_8_ < class521_sub1_sub1_sub2.aClass161Array10339.length; i_8_++) {
				class521_sub1_sub1_sub2.aClass161Array10339[i_8_].anInt2012 = 1025302087;
				class521_sub1_sub1_sub2.aClass161Array10339[i_8_].aClass456_2014.method7567(-1, (short) 8960);
			}
			class521_sub1_sub1_sub2.anIntArray10350 = null;
			class521_sub1_sub1_sub2.anInt10342 = 0;
			class521_sub1_sub1_sub2.anInt10345 = 0;
			i_6_ = Class249.aClass249_3083.aByte3085;
			i_7_ = 0;
			class521_sub1_sub1_sub2.method11172((float) (512 * class521_sub1_sub1_sub2.regionBaseX[0] + (class521_sub1_sub1_sub2.method15805(828768449) * 256)), class385.aFloat4672, (float) (class521_sub1_sub1_sub2.regionBaseY[0] * 512 + (class521_sub1_sub1_sub2.method15805(828768449) * 256)));
			class521_sub1_sub1_sub2.method15801(-1972620165);
		}
		if ((class521_sub1_sub1_sub2 == Class84.myPlayer) && ((int) class385.aFloat4671 < 6144 || (int) class385.aFloat4673 < 6144 || ((int) class385.aFloat4671 >= ((client.aClass257_7353.method4424(723986373) - 12) * 512)) || ((int) class385.aFloat4673 >= ((client.aClass257_7353.method4451(-806842262) - 12) * 512)))) {
			class521_sub1_sub1_sub2.aClass456_10338.method7567(-1, (short) 8960);
			for (int i_9_ = 0; i_9_ < class521_sub1_sub1_sub2.aClass161Array10339.length; i_9_++) {
				class521_sub1_sub1_sub2.aClass161Array10339[i_9_].anInt2012 = 1025302087;
				class521_sub1_sub1_sub2.aClass161Array10339[i_9_].aClass456_2014.method7567(-1, (short) 8960);
			}
			class521_sub1_sub1_sub2.anIntArray10350 = null;
			class521_sub1_sub1_sub2.anInt10342 = 0;
			class521_sub1_sub1_sub2.anInt10345 = 0;
			i_6_ = Class249.aClass249_3083.aByte3085;
			i_7_ = 0;
			class521_sub1_sub1_sub2.method11172((float) (class521_sub1_sub1_sub2.regionBaseX[0] * 512 + (class521_sub1_sub1_sub2.method15805(828768449) * 256)), class385.aFloat4672, (float) (512 * class521_sub1_sub1_sub2.regionBaseY[0] + (class521_sub1_sub1_sub2.method15805(828768449) * 256)));
			class521_sub1_sub1_sub2.method15801(-1972620165);
		}
		int i_10_ = Class427.method7188(class521_sub1_sub1_sub2, 1919547361);
		Class521_Sub1_Sub4_Sub2.method16087(class521_sub1_sub1_sub2, -702995784);
		Class302.method5361(class521_sub1_sub1_sub2, i_6_, i_7_, i_10_, 1792753982);
		Class236.method3985(class521_sub1_sub1_sub2, i_6_, (byte) -27);
		Class150.method2581(class521_sub1_sub1_sub2, -1454383651);
		Class381 class381 = Class381.method6455();
		class381.method6480(Class382.method6508(class521_sub1_sub1_sub2.aClass19_10359.method578((byte) 2)), Class382.method6508(class521_sub1_sub1_sub2.aClass19_10330.method578((byte) 2)), Class382.method6508(class521_sub1_sub1_sub2.aClass19_10360.method578((byte) 2)));
		class521_sub1_sub1_sub2.method11187(class381);
		class381.method6477();
	}

	static final void method6288(Class118 class118, Class98 class98, CS2Executor class527, short i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		int[] is = Class96_Sub14.method14642(string, class527, -37726580);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1405 = Class351.method6193(string, class527, 1676741238);
		class118.anIntArray1406 = is;
		class118.aBool1384 = true;
	}
}
