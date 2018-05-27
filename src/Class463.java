/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class463 {
	static Index aClass317_5549;
	int anInt5550;
	int anInt5551;
	boolean aBool5552;

	public int method7716() {
		return ((Class463) this).anInt5551 * -1655118575;
	}

	public int method7717() {
		return -1634321217 * ((Class463) this).anInt5550;
	}

	public int method7718() {
		return ((Class463) this).anInt5551 * -1655118575;
	}

	public boolean method7719(int i) {
		return ((Class463) this).aBool5552;
	}

	public int method7720(int i) {
		return -1634321217 * ((Class463) this).anInt5550;
	}

	public int method7721(int i) {
		return ((Class463) this).anInt5551 * -1655118575;
	}

	public int method7722() {
		return ((Class463) this).anInt5551 * -1655118575;
	}

	public int method7723() {
		return -1634321217 * ((Class463) this).anInt5550;
	}

	Class463(int i, int i_0_, boolean bool) {
		((Class463) this).anInt5551 = i * 24030193;
		((Class463) this).anInt5550 = -413977793 * i_0_;
		((Class463) this).aBool5552 = bool;
	}

	static void method7724(Animable class521_sub1_sub1_sub2, int i) {
		if (class521_sub1_sub1_sub2 instanceof NPC) {
			NPC class521_sub1_sub1_sub2_sub2 = (NPC) class521_sub1_sub1_sub2;
			if (class521_sub1_sub1_sub2_sub2.aClass409_10580 != null)
				WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2, (class521_sub1_sub1_sub2_sub2.aByte7967 != (Class84.myPlayer.aByte7967)), 2058310476);
		} else if (class521_sub1_sub1_sub2 instanceof Player) {
			Player class521_sub1_sub1_sub2_sub1 = (Player) class521_sub1_sub1_sub2;
			Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, (class521_sub1_sub1_sub2_sub1.aByte7967 != (Class84.myPlayer.aByte7967)), 1557506355);
		}
	}

	static int[] method7725(Class282_Sub23 class282_sub23, byte i) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(518);
		int[] is = new int[4];
		for (int i_1_ = 0; i_1_ < 4; i_1_++)
			is[i_1_] = (int) (Math.random() * 9.9999999E7);
		class282_sub35.writeByte(10);
		class282_sub35.writeInt(is[0]);
		class282_sub35.writeInt(is[1]);
		class282_sub35.writeInt(is[2]);
		class282_sub35.writeInt(is[3]);
		for (int i_2_ = 0; i_2_ < 10; i_2_++)
			class282_sub35.writeInt((int) (Math.random() * 9.9999999E7));
		class282_sub35.writeShort((int) (Math.random() * 9.9999999E7), 1417031095);
		class282_sub35.applyRSA(Class18.LOGIN_EXPONENT, Class18.LOGIN_MODULUS);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeBytes(class282_sub35.buffer, 0, -1990677291 * class282_sub35.index);
		return is;
	}

	static final void method7726(CS2Executor class527, int i) {
		class527.anInt7012 -= 567564004;
		int i_3_ = (class527.intStack[1942118537 * class527.anInt7012]);
		boolean bool = ((class527.intStack[class527.anInt7012 * 1942118537 + 1]) == 1);
		int i_4_ = (class527.intStack[1942118537 * class527.anInt7012 + 2]);
		boolean bool_5_ = ((class527.intStack[3 + class527.anInt7012 * 1942118537]) == 1);
		Class365.method6299(i_3_, bool, i_4_, bool_5_, (byte) 4);
	}

	static final void method7727(Animable class521_sub1_sub1_sub2, int i) {
		Class456 class456 = class521_sub1_sub1_sub2.aClass456_10338;
		if ((1277328401 * class521_sub1_sub1_sub2.anInt10345 == client.cycles * -1809259861) || !class456.method7564(-1584612884) || class456.method7585(1, -2087063879)) {
			int i_6_ = (class521_sub1_sub1_sub2.anInt10345 * 1277328401 - class521_sub1_sub1_sub2.anInt10342 * 403949281);
			int i_7_ = (-1809259861 * client.cycles - 403949281 * class521_sub1_sub1_sub2.anInt10342);
			int i_8_ = (1204164096 * class521_sub1_sub1_sub2.anInt10326 + class521_sub1_sub1_sub2.method15805(828768449) * 256);
			int i_9_ = (-699068928 * class521_sub1_sub1_sub2.anInt10328 + class521_sub1_sub1_sub2.method15805(828768449) * 256);
			int i_10_ = (-1654454784 * class521_sub1_sub1_sub2.anInt10341 + class521_sub1_sub1_sub2.method15805(828768449) * 256);
			int i_11_ = (-737490432 * class521_sub1_sub1_sub2.anInt10343 + class521_sub1_sub1_sub2.method15805(828768449) * 256);
			Class385 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
			class521_sub1_sub1_sub2.method11172((float) (((i_6_ - i_7_) * i_8_ + i_10_ * i_7_) / i_6_), (float) (int) class385.aFloat4672, (float) (((i_6_ - i_7_) * i_9_ + i_7_ * i_11_) / i_6_));
		}
		class521_sub1_sub1_sub2.anInt10366 = 0;
		class521_sub1_sub1_sub2.method15791((class521_sub1_sub1_sub2.anInt10346 * -445026593), false, (byte) 9);
	}

	static void method7728(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		int i_17_ = Class275.method4890(i_13_, 324226563 * Class532_Sub1.anInt7070, -348932735 * Class532_Sub1.anInt7068, 1554015251);
		int i_18_ = Class275.method4890(i_14_, Class532_Sub1.anInt7070 * 324226563, Class532_Sub1.anInt7068 * -348932735, -1560210090);
		int i_19_ = Class275.method4890(i, Class532_Sub1.anInt7071 * -612590951, -1345107225 * Class532_Sub1.anInt7069, -63131658);
		int i_20_ = Class275.method4890(i_12_, Class532_Sub1.anInt7071 * -612590951, Class532_Sub1.anInt7069 * -1345107225, -1596186955);
		for (int i_21_ = i_17_; i_21_ <= i_18_; i_21_++)
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_21_], i_19_, i_20_, i_15_, (byte) 2);
	}

	static final void method7729(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		class118.anInt1430 = (class527.intStack[class527.anInt7012 * 1942118537]) * -1019275441;
		class118.anInt1431 = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) * 1761303305);
		Class109.method1858(class118, (byte) 64);
	}

	public static boolean method7730(int i) {
		do {
			boolean bool;
			try {
				if (-1423242349 * Class148.anInt1730 != 2)
					break;
				if (Class282_Sub44_Sub3.aClass282_Sub7_9563 == null) {
					Class282_Sub44_Sub3.aClass282_Sub7_9563 = Class282_Sub7.method12164(Class75.aClass317_746, (-282122383 * Class6.anInt46), (-230114921 * Class148.anInt1738));
					if (Class282_Sub44_Sub3.aClass282_Sub7_9563 == null)
						return false;
				}
				if (null == Class454.aClass250_5450)
					Class454.aClass250_5450 = new Class250(Class148.aClass317_1732, Class148.aClass317_1731);
				Class282_Sub15_Sub2 class282_sub15_sub2 = Class148.aClass282_Sub15_Sub2_1735;
				if (Class282_Sub33.aClass282_Sub15_Sub2_7836 != null)
					class282_sub15_sub2 = Class282_Sub33.aClass282_Sub15_Sub2_7836;
				if (!class282_sub15_sub2.method15182((Class282_Sub44_Sub3.aClass282_Sub7_9563), Class148.aClass317_1737, Class454.aClass250_5450, 22050, 796081686))
					break;
				Class148.aClass282_Sub15_Sub2_1735 = class282_sub15_sub2;
				Class148.aClass282_Sub15_Sub2_1735.method15096(784901670);
				if (-2027356711 * Class383.anInt4664 > 0) {
					Class148.anInt1730 = -1892655151;
					Class148.aClass282_Sub15_Sub2_1735.method15144(((Class383.anInt4664 * -2027356711 > -609094685 * Class158_Sub2_Sub3.anInt10243) ? -609094685 * Class158_Sub2_Sub3.anInt10243 : Class383.anInt4664 * -2027356711), -21624698);
					for (int i_22_ = 0; i_22_ < Class453.anIntArray5449.length; i_22_++) {
						Class148.aClass282_Sub15_Sub2_1735.method15095(i_22_, Class453.anIntArray5449[i_22_], 2144704341);
						Class453.anIntArray5449[i_22_] = 255;
					}
				} else {
					Class148.anInt1730 = 0;
					Class148.aClass282_Sub15_Sub2_1735.method15144(-609094685 * Class158_Sub2_Sub3.anInt10243, 1350898514);
					for (int i_23_ = 0; i_23_ < Class453.anIntArray5449.length; i_23_++) {
						Class148.aClass282_Sub15_Sub2_1735.method15095(i_23_, Class453.anIntArray5449[i_23_], 1431081574);
						Class453.anIntArray5449[i_23_] = 255;
					}
				}
				if (null == Class282_Sub33.aClass282_Sub15_Sub2_7836) {
					if (-8843131616667674089L * Class148.aLong1740 > 0L)
						Class148.aClass282_Sub15_Sub2_1735.method15100(Class282_Sub44_Sub3.aClass282_Sub7_9563, Class152.aBool1962, true, -8843131616667674089L * Class148.aLong1740);
					else
						Class148.aClass282_Sub15_Sub2_1735.method15098(Class282_Sub44_Sub3.aClass282_Sub7_9563, Class152.aBool1962, 1246043203);
					if (Class11.aClass109_121 != null)
						Class11.aClass109_121.method1849((byte) -123);
				}
				if (Class502.aClass253_5830 != null)
					Class502.aClass253_5830.method4329(Class148.aClass282_Sub15_Sub2_1735);
				Class282_Sub44_Sub3.aClass282_Sub7_9563 = null;
				Class454.aClass250_5450 = null;
				Class75.aClass317_746 = null;
				Class148.aLong1740 = 0L;
				Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
				Class11.aClass109_121 = null;
				bool = true;
			} catch (Exception exception) {
				exception.printStackTrace();
				Class148.aClass282_Sub15_Sub2_1735.method15101((short) 3647);
				Class332.method5929(-1000210951);
				break;
			}
			return bool;
		} while (false);
		return false;
	}
}
