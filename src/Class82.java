/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class82 implements Interface11 {
	public static Class75[] aClass75Array804;

	public long method78(String string) {
		return Class254.method4379(string, 1048776146);
	}

	public long method79(String string, int i) {
		return Class254.method4379(string, 1048776146);
	}

	public long method81(String string) {
		return Class254.method4379(string, 1048776146);
	}

	public long method80(String string) {
		return Class254.method4379(string, 1048776146);
	}

	public long method82(String string) {
		return Class254.method4379(string, 1048776146);
	}

	static final void method1454(Class118 class118, Class98 class98, Class527 class527, byte i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_0_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		int i_1_ = (((Class527) class527).anIntArray6999[1 + ((Class527) class527).anInt7012 * 1942118537]);
		Class437 class437 = Class125.aClass424_1573.method7069(i_0_, (byte) 0);
		if (i_1_ != -1741480635 * class437.anInt5337)
			class118.method1999(i_0_, i_1_, 146446242);
		else
			class118.method1995(i_0_, -1265527536);
	}

	static final void method1455(Class118 class118, Class98 class98, Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 567564004;
		class118.anInt1330 = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]) * -636815827;
		class118.anInt1339 = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537 + 1]) * 207030057;
		if ((((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537 + 2]) == 1)
			class118.anInt1329 = 1012783397;
		else
			class118.anInt1329 = 423033320;
		if ((((Class527) class527).anIntArray6999[3 + ((Class527) class527).anInt7012 * 1942118537]) == 1)
			class118.aBool1388 = true;
		else
			class118.aBool1388 = false;
		if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
			Class92.method1565(-1952846363 * class118.anInt1287, -940537484);
	}

	static final void method1456(Class527 class527, int i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloat7146 >> 3;
	}

	static void method1457(int i, int i_2_, Class118 class118, Class455 class455, int i_3_, int i_4_, int i_5_) {
		int i_6_ = -963499271 * Class197.NUM_PLAYER_INDICES;
		int[] is = Class197.PLAYER_INDICES;
		for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
			Player class521_sub1_sub1_sub2_sub1 = client.players[is[i_7_]];
			if (null != class521_sub1_sub1_sub2_sub1 && class521_sub1_sub1_sub2_sub1.method16126((byte) 69) && !class521_sub1_sub1_sub2_sub1.hidden && (Class84.myPlayer != class521_sub1_sub1_sub2_sub1) && (class521_sub1_sub1_sub2_sub1.aByte7967 == Class84.myPlayer.aByte7967)) {
				Class385 class385 = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
				int i_8_ = (int) class385.aFloat4671 / 128 - i / 128;
				int i_9_ = (int) class385.aFloat4673 / 128 - i_2_ / 128;
				boolean bool = false;
				for (int i_10_ = 0; i_10_ < client.anInt7449 * 493536965; i_10_++) {
					Class6 class6 = client.aClass6Array7452[i_10_];
					if (class521_sub1_sub1_sub2_sub1.displayName.equals(class6.aString37) && 0 != 1017482937 * class6.anInt39) {
						bool = true;
						break;
					}
				}
				boolean bool_11_ = false;
				for (int i_12_ = 0; i_12_ < -1772444859 * Class459.anInt5534; i_12_++) {
					if (class521_sub1_sub1_sub2_sub1.displayName.equals(Class467.aClass173Array5575[i_12_].aString2127)) {
						bool_11_ = true;
						break;
					}
				}
				boolean bool_13_ = false;
				if (0 != (Class84.myPlayer.anInt10559 * -1623446397) && 0 != (-1623446397 * class521_sub1_sub1_sub2_sub1.anInt10559) && (class521_sub1_sub1_sub2_sub1.anInt10559 * -1623446397 == (Class84.myPlayer.anInt10559) * -1623446397))
					bool_13_ = true;
				if (class521_sub1_sub1_sub2_sub1.aBool10571)
					Class190.method3149(class118, class455, i_3_, i_4_, i_8_, i_9_, Class250.aClass160Array3092[6], -632004672);
				else if (bool_13_)
					Class190.method3149(class118, class455, i_3_, i_4_, i_8_, i_9_, Class250.aClass160Array3092[4], -274315333);
				else if (class521_sub1_sub1_sub2_sub1.aBool10550)
					Class190.method3149(class118, class455, i_3_, i_4_, i_8_, i_9_, Class250.aClass160Array3092[7], 1669680426);
				else if (bool)
					Class190.method3149(class118, class455, i_3_, i_4_, i_8_, i_9_, Class250.aClass160Array3092[3], -815789205);
				else if (bool_11_)
					Class190.method3149(class118, class455, i_3_, i_4_, i_8_, i_9_, Class250.aClass160Array3092[5], 1069521943);
				else
					Class190.method3149(class118, class455, i_3_, i_4_, i_8_, i_9_, Class250.aClass160Array3092[2], -336642754);
			}
		}
	}
}
