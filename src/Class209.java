/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class209 {
	static Class209 aClass209_2363;
	static Class209 aClass209_2364;
	static Class209 aClass209_2365;
	static Class209 aClass209_2366;
	static Class209 aClass209_2367;
	static Class209 aClass209_2368;
	static Class209 aClass209_2369;
	static Class209 aClass209_2370;
	static Class209 aClass209_2371;
	static Class209 aClass209_2372;
	static Class209 aClass209_2373;
	static Class209 aClass209_2374;
	static Class209 aClass209_2375;
	static Class209 aClass209_2376;
	static Class209 aClass209_2377;
	public static Class209 aClass209_2378;
	static Class209 aClass209_2379;
	static Class209 aClass209_2380;
	static Class209 aClass209_2381;
	public static Class209 aClass209_2382;
	static Class209 aClass209_2383;
	static Class209 aClass209_2384;
	static Class209 aClass209_2385;
	static Class209 aClass209_2386;
	static Class209 aClass209_2387;
	static Class209 aClass209_2388;
	static Class209 aClass209_2389;
	static Class209 aClass209_2390;
	static Class209 aClass209_2391;
	static Class209 aClass209_2392;
	static Class209 aClass209_2393;
	static Class209 aClass209_2394 = new Class209("11", "11");
	public String aString2395;

	Class209(String string, String string_0_) {
		aString2395 = string_0_;
	}

	static {
		aClass209_2364 = new Class209("13", "13");
		aClass209_2365 = new Class209("6", "6");
		aClass209_2381 = new Class209("26", "26");
		aClass209_2367 = new Class209("18", "18");
		aClass209_2368 = new Class209("21", "21");
		aClass209_2376 = new Class209("9", "9");
		aClass209_2370 = new Class209("28", "28");
		aClass209_2371 = new Class209("4", "4");
		aClass209_2372 = new Class209("20", "20");
		aClass209_2373 = new Class209("27", "27");
		aClass209_2374 = new Class209("1", "1");
		aClass209_2392 = new Class209("22", "22");
		aClass209_2387 = new Class209("7", "7");
		aClass209_2380 = new Class209("15", "15");
		aClass209_2375 = new Class209("31", "31");
		aClass209_2379 = new Class209("12", "12");
		aClass209_2363 = new Class209("30", "30");
		aClass209_2378 = new Class209("14", "14");
		aClass209_2382 = new Class209("8", "8");
		aClass209_2383 = new Class209("23", "23");
		aClass209_2384 = new Class209("29", "29");
		aClass209_2385 = new Class209("32", "32");
		aClass209_2386 = new Class209("2", "2");
		aClass209_2369 = new Class209("16", "16");
		aClass209_2366 = new Class209("24", "24");
		aClass209_2389 = new Class209("33", "33");
		aClass209_2390 = new Class209("17", "17");
		aClass209_2391 = new Class209("25", "25");
		aClass209_2377 = new Class209("3", "3");
		aClass209_2393 = new Class209("10", "10");
		aClass209_2388 = new Class209("5", "5");
	}

	public static void method1938(Class391 class391, int i, Class365_Sub1 class365_sub1, int i_1_) {
		try {
			if (-991384187 * Class300.anInt3213 < 50 && (class391 != null && null != class391.anIntArrayArray4187 && i < class391.anIntArrayArray4187.length && class391.anIntArrayArray4187[i] != null)) {
				int i_2_ = class391.anIntArrayArray4187[i][0];
				int i_3_ = i_2_ >> 8;
				int i_4_ = i_2_ >> 5 & 0x7;
				int i_5_ = i_2_ & 0x1f;
				if (class391.anIntArrayArray4187[i].length > 1) {
					int i_6_ = (int) (Math.random() * (double) (class391.anIntArrayArray4187[i]).length);
					if (i_6_ > 0)
						i_3_ = class391.anIntArrayArray4187[i][i_6_];
				}
				int i_7_ = 256;
				if (null != class391.anIntArray4183 && null != class391.anIntArray4190)
					i_7_ = ((int) (Math.random() * (double) (class391.anIntArray4190[i] - class391.anIntArray4183[i])) + class391.anIntArray4183[i]);
				int i_8_ = (class391.anIntArray4188 == null ? 255 : class391.anIntArray4188[i]);
				if (i_5_ == 0) {
					if (Class287.myPlayer == class365_sub1) {
						if (class391.aBoolean4173)
							Class320.method3913(i_3_, i_4_, 0, i_8_, false, i_7_, 1619018556);
						else
							Class239.method2210(i_3_, i_4_, 0, i_8_, i_7_, 1846790975);
					}
				} else if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7582.method5726(-2147180332) != 0) {
					Class217 class217 = class365_sub1.method4337().aClass217_2599;
					int i_9_ = (int) class217.aFloat2451 - 256 >> 9;
					int i_10_ = (int) class217.aFloat2454 - 256 >> 9;
					int i_11_ = ((Class287.myPlayer == class365_sub1) ? 0 : (i_10_ << 8) + ((i_9_ << 16) + (class365_sub1.plane << 24)) + i_5_);
					Class300.aClass297Array3214[(Class300.anInt3213 += -598588595) * -991384187 - 1] = new Class297((class391.aBoolean4173 ? (byte) 2 : (byte) 1), i_3_, i_4_, 0, i_8_, i_11_, i_7_, class365_sub1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("iu.r(").append(')').toString());
		}
	}

	static void method1939(int i) {
		try {
			Class360.password = "";
			Class360.username = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("iu.s(").append(')').toString());
		}
	}

	static final void method1940(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_12_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_13_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_12_ & -1 - (1 << i_13_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("iu.yi(").append(')').toString());
		}
	}

	public static Class336 setExtraRoutefinderData(int toX, int toY, int sizeX, int sizeY, int routeType) {
		try {
			Class315.aClass336_Sub5_3304.toX = toX * -760677635;
			Class315.aClass336_Sub5_3304.toY = toY * 167105303;
			Class315.aClass336_Sub5_3304.sizeX = sizeX * -1544157451;
			Class315.aClass336_Sub5_3304.sizeY = -1468199503 * sizeY;
			((Class336_Sub5) Class315.aClass336_Sub5_3304).routeType = -1073204575 * routeType;
			return Class315.aClass336_Sub5_3304;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("iu.p(").append(')').toString());
		}
	}
}
