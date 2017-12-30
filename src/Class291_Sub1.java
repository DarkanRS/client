
/* Class291_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class291_Sub1 extends Class291 {
	static int anInt8014;
	public static int anInt8015;
	static int anInt8016;
	static Class194 aClass194_8017;
	static int anInt8018;
	static int anInt8019;
	static int anInt8020;
	static int anInt8021 = -923733999;
	static boolean aBool8022;
	static Class194 aClass194_8023;
	static String[] aStringArray8024;
	public static Class465 aClass465_8025;
	static int anInt8026;
	public static boolean aBool8027;
	static boolean aBool8028;
	public static Class465 aClass465_8029;
	static Class460 aClass460_8030;

	static void method13302(int i, int i_0_, int i_1_, int i_2_) {
		float f = (float) anInt3483 / (float) anInt3474;
		int i_3_ = i_1_;
		int i_4_ = i_2_;
		if (f < 1.0F)
			i_4_ = (int) ((float) i_1_ * f);
		else
			i_3_ = (int) ((float) i_2_ / f);
		i -= (i_1_ - i_3_) / 2;
		i_0_ -= (i_2_ - i_4_) / 2;
		Class427.anInt5123 = anInt3474 * i / i_3_ * 1714827959;
		Class475.anInt5624 = 1710901657 * (anInt3483 - anInt3483 * i_0_ / i_4_);
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class89.method1502(244233794);
	}

	public static Class282_Sub50_Sub6 method13303() {
		return aClass282_Sub50_Sub6_3491;
	}

	static final void method13304(Class505 class505, Interface22 interface22) {
		if (null != aClass282_Sub50_Sub6_3491) {
			Class169.method2869(1640128547);
			Class169.method2869(1890409797);
			if (-8084891 * anInt8015 < 10) {
				if (!aClass317_3460.method5629((aClass282_Sub50_Sub6_3491.aString9533), 71472045)) {
					anInt8015 = (Class192.worldMap.method5631(aClass282_Sub50_Sub6_3491.aString9533, (byte) 8)) / 10 * -45072531;
					return;
				}
				Class409.method6907(-1486207153);
				anInt8015 = -450725310;
			}
			if (anInt8015 * -8084891 == 10) {
				anInt3472 = (-742910705 * aClass282_Sub50_Sub6_3491.anInt9539 >> 6 << 6);
				anInt3473 = (aClass282_Sub50_Sub6_3491.anInt9541 * 458255425 >> 6 << 6);
				anInt3474 = (235539227 * aClass282_Sub50_Sub6_3491.anInt9540 >> 6 << 6) - anInt3472 + 64;
				anInt3483 = (1097246003 * aClass282_Sub50_Sub6_3491.anInt9535 >> 6 << 6) - anInt3473 + 64;
				int[] is = new int[3];
				int i = -1;
				int i_5_ = -1;
				Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
				Class219 class219 = client.aClass257_7353.method4519(423877680);
				if (aClass282_Sub50_Sub6_3491.method14778(Class84.myPlayer.aByte7967, (class219.anInt2711 * 1948093437 + ((int) class385.aFloat4671 >> 9)), (((int) class385.aFloat4673 >> 9) + class219.anInt2712 * -1002240017), is, -1168562597)) {
					i = is[1] - anInt3472;
					i_5_ = is[2] - anInt3473;
				}
				if (!aBool8028 && i >= 0 && i < anInt3474 && i_5_ >= 0 && i_5_ < anInt3483) {
					i += (int) (Math.random() * 10.0) - 5;
					i_5_ += (int) (Math.random() * 10.0) - 5;
					Class427.anInt5123 = i * 1714827959;
					Class475.anInt5624 = 1710901657 * i_5_;
				} else if (-1 != anInt8019 * 634461411 && -812481713 * anInt8020 != -1) {
					aClass282_Sub50_Sub6_3491.method14777((634461411 * anInt8019), (anInt8020 * -812481713), is, -1848809972);
					if (is != null) {
						Class427.anInt5123 = 1714827959 * (is[1] - anInt3472);
						Class475.anInt5624 = 1710901657 * (is[2] - anInt3473);
					}
					anInt8020 = -611890095;
					anInt8019 = -776800459;
					aBool8028 = false;
				} else {
					aClass282_Sub50_Sub6_3491.method14777((556833041 * aClass282_Sub50_Sub6_3491.anInt9532 >> 14 & 0x3fff), (aClass282_Sub50_Sub6_3491.anInt9532 * 556833041 & 0x3fff), is, -1462786344);
					Class427.anInt5123 = 1714827959 * (is[1] - anInt3472);
					Class475.anInt5624 = (is[2] - anInt3473) * 1710901657;
				}
				if (37 == aClass282_Sub50_Sub6_3491.anInt9542 * -1337359695) {
					aFloat3468 = 3.0F;
					aFloat3462 = 3.0F;
				} else if (-1337359695 * aClass282_Sub50_Sub6_3491.anInt9542 == 50) {
					aFloat3468 = 4.0F;
					aFloat3462 = 4.0F;
				} else if (-1337359695 * aClass282_Sub50_Sub6_3491.anInt9542 == 75) {
					aFloat3468 = 6.0F;
					aFloat3462 = 6.0F;
				} else if (aClass282_Sub50_Sub6_3491.anInt9542 * -1337359695 == 100) {
					aFloat3468 = 8.0F;
					aFloat3462 = 8.0F;
				} else if (aClass282_Sub50_Sub6_3491.anInt9542 * -1337359695 == 200) {
					aFloat3468 = 16.0F;
					aFloat3462 = 16.0F;
				} else {
					aFloat3468 = 8.0F;
					aFloat3462 = 8.0F;
				}
				anInt3469 = (int) aFloat3468 >> 1;
				aByteArrayArrayArray3464 = Class491.method8246(anInt3469, (short) 8192);
				Class89.method1502(-1549691920);
				method5126();
				Class346.aClass482_4049 = new Class482();
				anInt3454 += (int) (Math.random() * 5.0) - 2;
				if (anInt3454 < -8)
					anInt3454 = -8;
				if (anInt3454 > 8)
					anInt3454 = 8;
				anInt3463 += (int) (Math.random() * 5.0) - 2;
				if (anInt3463 < -16)
					anInt3463 = -16;
				if (anInt3463 > 16)
					anInt3463 = 16;
				method5132(interface22, anInt3454 >> 2 << 10, anInt3463 >> 1);
				aClass218_3456.method3697(1024, 256, -808342623);
				aClass427_3457.method7175(256, 256, 2000278092);
				aClass474_3455.method7899(4096, -2034610586);
				Class16.aClass230_147.method3906(256, (short) 727);
				anInt8015 = -901450620;
			} else if (20 == anInt8015 * -8084891) {
				Exception_Sub3.method15619(true, -2043513993);
				method5183(class505, anInt3454, anInt3463);
				anInt8015 = 1590615436;
				Exception_Sub3.method15619(true, 1253103241);
				Class282_Sub15_Sub1.method14840((byte) 78);
			} else if (60 == anInt8015 * -8084891) {
				if (aClass317_3460.validFile(new StringBuilder().append(aClass282_Sub50_Sub6_3491.aString9533).append("_staticelements").toString(), 1867732849)) {
					if (!aClass317_3460.method5629(new StringBuilder().append(aClass282_Sub50_Sub6_3491.aString9533).append("_staticelements").toString(), 71472045))
						return;
					aClass283_3470 = Class301.method5331(aClass317_3460, new StringBuilder().append(aClass282_Sub50_Sub6_3491.aString9533).append("_staticelements").toString(), client.membersWorld, 874508557);
				} else
					aClass283_3470 = new Class283(0);
				method5145();
				anInt8015 = 1139890126;
				Exception_Sub3.method15619(true, -1057638302);
				Class282_Sub15_Sub1.method14840((byte) 9);
			} else if (-8084891 * anInt8015 == 70) {
				Class494.aClass194_5794 = new Class194(class505, 11, true, Class351.aCanvas4096);
				anInt8015 = 1004672533;
				Exception_Sub3.method15619(true, 142640436);
				Class282_Sub15_Sub1.method14840((byte) -54);
			} else if (-8084891 * anInt8015 == 73) {
				aClass194_8017 = new Class194(class505, 12, true, Class351.aCanvas4096);
				anInt8015 = 869454940;
				Exception_Sub3.method15619(true, 2114468643);
				Class282_Sub15_Sub1.method14840((byte) -16);
			} else if (-8084891 * anInt8015 == 76) {
				aClass194_8023 = new Class194(class505, 14, true, Class351.aCanvas4096);
				anInt8015 = 734237347;
				Exception_Sub3.method15619(true, 1991787330);
				Class282_Sub15_Sub1.method14840((byte) 28);
			} else if (79 == -8084891 * anInt8015) {
				Class446.aClass194_5416 = new Class194(class505, 17, true, Class351.aCanvas4096);
				anInt8015 = 599019754;
				Exception_Sub3.method15619(true, -326157998);
				Class282_Sub15_Sub1.method14840((byte) 37);
			} else if (-8084891 * anInt8015 == 82) {
				Class114.aClass194_1243 = new Class194(class505, 19, true, Class351.aCanvas4096);
				anInt8015 = 463802161;
				Exception_Sub3.method15619(true, -1099150876);
				Class282_Sub15_Sub1.method14840((byte) 4);
			} else if (-8084891 * anInt8015 == 85) {
				Class524.aClass194_6967 = new Class194(class505, 22, true, Class351.aCanvas4096);
				anInt8015 = 328584568;
				Exception_Sub3.method15619(true, -1324865665);
				Class282_Sub15_Sub1.method14840((byte) -81);
			} else if (-8084891 * anInt8015 == 88) {
				Class251.aClass194_3103 = new Class194(class505, 26, true, Class351.aCanvas4096);
				anInt8015 = 193366975;
				Exception_Sub3.method15619(true, 1302665326);
				Class282_Sub15_Sub1.method14840((byte) -19);
			} else {
				Class521_Sub1_Sub5_Sub1.aClass194_10527 = new Class194(class505, 30, true, Class351.aCanvas4096);
				anInt8015 = -212285804;
				Exception_Sub3.method15619(true, 687769543);
				Class282_Sub15_Sub1.method14840((byte) 70);
				System.gc();
			}
		}
	}

	static final void method13305(Class505 class505, Interface22 interface22) {
		if (null != aClass282_Sub50_Sub6_3491) {
			Class169.method2869(1545882230);
			Class169.method2869(1552859203);
			if (-8084891 * anInt8015 < 10) {
				if (!aClass317_3460.method5629((aClass282_Sub50_Sub6_3491.aString9533), 71472045)) {
					anInt8015 = (Class192.worldMap.method5631(aClass282_Sub50_Sub6_3491.aString9533, (byte) 88)) / 10 * -45072531;
					return;
				}
				Class409.method6907(-1423465630);
				anInt8015 = -450725310;
			}
			if (anInt8015 * -8084891 == 10) {
				anInt3472 = (-742910705 * aClass282_Sub50_Sub6_3491.anInt9539 >> 6 << 6);
				anInt3473 = (aClass282_Sub50_Sub6_3491.anInt9541 * 458255425 >> 6 << 6);
				anInt3474 = (235539227 * aClass282_Sub50_Sub6_3491.anInt9540 >> 6 << 6) - anInt3472 + 64;
				anInt3483 = (1097246003 * aClass282_Sub50_Sub6_3491.anInt9535 >> 6 << 6) - anInt3473 + 64;
				int[] is = new int[3];
				int i = -1;
				int i_6_ = -1;
				Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
				Class219 class219 = client.aClass257_7353.method4519(1316209203);
				if (aClass282_Sub50_Sub6_3491.method14778(Class84.myPlayer.aByte7967, (class219.anInt2711 * 1948093437 + ((int) class385.aFloat4671 >> 9)), (((int) class385.aFloat4673 >> 9) + class219.anInt2712 * -1002240017), is, -2111405792)) {
					i = is[1] - anInt3472;
					i_6_ = is[2] - anInt3473;
				}
				if (!aBool8028 && i >= 0 && i < anInt3474 && i_6_ >= 0 && i_6_ < anInt3483) {
					i += (int) (Math.random() * 10.0) - 5;
					i_6_ += (int) (Math.random() * 10.0) - 5;
					Class427.anInt5123 = i * 1714827959;
					Class475.anInt5624 = 1710901657 * i_6_;
				} else if (-1 != anInt8019 * 634461411 && -812481713 * anInt8020 != -1) {
					aClass282_Sub50_Sub6_3491.method14777((634461411 * anInt8019), (anInt8020 * -812481713), is, -1646652948);
					if (is != null) {
						Class427.anInt5123 = 1714827959 * (is[1] - anInt3472);
						Class475.anInt5624 = 1710901657 * (is[2] - anInt3473);
					}
					anInt8020 = -611890095;
					anInt8019 = -776800459;
					aBool8028 = false;
				} else {
					aClass282_Sub50_Sub6_3491.method14777((556833041 * aClass282_Sub50_Sub6_3491.anInt9532 >> 14 & 0x3fff), (aClass282_Sub50_Sub6_3491.anInt9532 * 556833041 & 0x3fff), is, -1742226222);
					Class427.anInt5123 = 1714827959 * (is[1] - anInt3472);
					Class475.anInt5624 = (is[2] - anInt3473) * 1710901657;
				}
				if (37 == aClass282_Sub50_Sub6_3491.anInt9542 * -1337359695) {
					aFloat3468 = 3.0F;
					aFloat3462 = 3.0F;
				} else if (-1337359695 * aClass282_Sub50_Sub6_3491.anInt9542 == 50) {
					aFloat3468 = 4.0F;
					aFloat3462 = 4.0F;
				} else if (-1337359695 * aClass282_Sub50_Sub6_3491.anInt9542 == 75) {
					aFloat3468 = 6.0F;
					aFloat3462 = 6.0F;
				} else if (aClass282_Sub50_Sub6_3491.anInt9542 * -1337359695 == 100) {
					aFloat3468 = 8.0F;
					aFloat3462 = 8.0F;
				} else if (aClass282_Sub50_Sub6_3491.anInt9542 * -1337359695 == 200) {
					aFloat3468 = 16.0F;
					aFloat3462 = 16.0F;
				} else {
					aFloat3468 = 8.0F;
					aFloat3462 = 8.0F;
				}
				anInt3469 = (int) aFloat3468 >> 1;
				aByteArrayArrayArray3464 = Class491.method8246(anInt3469, (short) 8192);
				Class89.method1502(-422761463);
				method5126();
				Class346.aClass482_4049 = new Class482();
				anInt3454 += (int) (Math.random() * 5.0) - 2;
				if (anInt3454 < -8)
					anInt3454 = -8;
				if (anInt3454 > 8)
					anInt3454 = 8;
				anInt3463 += (int) (Math.random() * 5.0) - 2;
				if (anInt3463 < -16)
					anInt3463 = -16;
				if (anInt3463 > 16)
					anInt3463 = 16;
				method5132(interface22, anInt3454 >> 2 << 10, anInt3463 >> 1);
				aClass218_3456.method3697(1024, 256, -671534650);
				aClass427_3457.method7175(256, 256, 1478724066);
				aClass474_3455.method7899(4096, -2034610586);
				Class16.aClass230_147.method3906(256, (short) 727);
				anInt8015 = -901450620;
			} else if (20 == anInt8015 * -8084891) {
				Exception_Sub3.method15619(true, 1823872357);
				method5183(class505, anInt3454, anInt3463);
				anInt8015 = 1590615436;
				Exception_Sub3.method15619(true, 897489244);
				Class282_Sub15_Sub1.method14840((byte) -11);
			} else if (60 == anInt8015 * -8084891) {
				if (aClass317_3460.validFile(new StringBuilder().append(aClass282_Sub50_Sub6_3491.aString9533).append("_staticelements").toString(), 1622758758)) {
					if (!aClass317_3460.method5629(new StringBuilder().append(aClass282_Sub50_Sub6_3491.aString9533).append("_staticelements").toString(), 71472045))
						return;
					aClass283_3470 = Class301.method5331(aClass317_3460, new StringBuilder().append(aClass282_Sub50_Sub6_3491.aString9533).append("_staticelements").toString(), client.membersWorld, 874508557);
				} else
					aClass283_3470 = new Class283(0);
				method5145();
				anInt8015 = 1139890126;
				Exception_Sub3.method15619(true, -658296688);
				Class282_Sub15_Sub1.method14840((byte) -10);
			} else if (-8084891 * anInt8015 == 70) {
				Class494.aClass194_5794 = new Class194(class505, 11, true, Class351.aCanvas4096);
				anInt8015 = 1004672533;
				Exception_Sub3.method15619(true, 1486450971);
				Class282_Sub15_Sub1.method14840((byte) 61);
			} else if (-8084891 * anInt8015 == 73) {
				aClass194_8017 = new Class194(class505, 12, true, Class351.aCanvas4096);
				anInt8015 = 869454940;
				Exception_Sub3.method15619(true, 2106889734);
				Class282_Sub15_Sub1.method14840((byte) -25);
			} else if (-8084891 * anInt8015 == 76) {
				aClass194_8023 = new Class194(class505, 14, true, Class351.aCanvas4096);
				anInt8015 = 734237347;
				Exception_Sub3.method15619(true, -653784296);
				Class282_Sub15_Sub1.method14840((byte) 0);
			} else if (79 == -8084891 * anInt8015) {
				Class446.aClass194_5416 = new Class194(class505, 17, true, Class351.aCanvas4096);
				anInt8015 = 599019754;
				Exception_Sub3.method15619(true, 1211662909);
				Class282_Sub15_Sub1.method14840((byte) -100);
			} else if (-8084891 * anInt8015 == 82) {
				Class114.aClass194_1243 = new Class194(class505, 19, true, Class351.aCanvas4096);
				anInt8015 = 463802161;
				Exception_Sub3.method15619(true, -1740380876);
				Class282_Sub15_Sub1.method14840((byte) 41);
			} else if (-8084891 * anInt8015 == 85) {
				Class524.aClass194_6967 = new Class194(class505, 22, true, Class351.aCanvas4096);
				anInt8015 = 328584568;
				Exception_Sub3.method15619(true, 589580066);
				Class282_Sub15_Sub1.method14840((byte) 109);
			} else if (-8084891 * anInt8015 == 88) {
				Class251.aClass194_3103 = new Class194(class505, 26, true, Class351.aCanvas4096);
				anInt8015 = 193366975;
				Exception_Sub3.method15619(true, -331042138);
				Class282_Sub15_Sub1.method14840((byte) -16);
			} else {
				Class521_Sub1_Sub5_Sub1.aClass194_10527 = new Class194(class505, 30, true, Class351.aCanvas4096);
				anInt8015 = -212285804;
				Exception_Sub3.method15619(true, 1141281307);
				Class282_Sub15_Sub1.method14840((byte) 92);
				System.gc();
			}
		}
	}

	public static Class282_Sub36 method13306() {
		if (aClass482_3459 == null || null == aClass460_8030)
			return null;
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass460_8030.next(); class282_sub36 != null; class282_sub36 = (Class282_Sub36) aClass460_8030.next()) {
			Class220 class220 = aClass218_3456.method3700((class282_sub36.anInt7991 * -1798678621), 545877263);
			if (null != class220 && class220.aBool2742 && class220.method3719(anInterface42_3458, 1188698782))
				return class282_sub36;
		}
		return null;
	}

	public static void method13307(boolean bool) {
		if (bool && null != aClass282_Sub50_Sub6_3491)
			Class51.anInt488 = aClass282_Sub50_Sub6_3491.anInt9536 * -105285481;
		else
			Class51.anInt488 = 562841881;
		aClass282_Sub50_Sub6_3491 = null;
		Class346.aClass482_4049 = null;
		anInt8015 = 0;
		Class282_Sub20_Sub24.aClass118_9884 = null;
		method5137();
		aClass482_3459.method8118(-1362477784);
		aClass283_3470 = null;
		Class511.aClass160_5883 = null;
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class494.aClass194_5794 = null;
		aClass194_8017 = null;
		aClass194_8023 = null;
		Class446.aClass194_5416 = null;
		Class114.aClass194_1243 = null;
		Class524.aClass194_6967 = null;
		Class251.aClass194_3103 = null;
		Class521_Sub1_Sub5_Sub1.aClass194_10527 = null;
		if (aClass218_3456 != null) {
			aClass218_3456.method3699((byte) 1);
			aClass218_3456.method3697(128, 64, 307501063);
		}
		if (null != aClass427_3457)
			aClass427_3457.method7175(64, 64, 1757528355);
		if (aClass474_3455 != null)
			aClass474_3455.method7899(256, -2034610586);
		Class16.aClass230_147.method3906(64, (short) 727);
	}

	public static void method13308(boolean bool) {
		if (bool && null != aClass282_Sub50_Sub6_3491)
			Class51.anInt488 = aClass282_Sub50_Sub6_3491.anInt9536 * -105285481;
		else
			Class51.anInt488 = 562841881;
		aClass282_Sub50_Sub6_3491 = null;
		Class346.aClass482_4049 = null;
		anInt8015 = 0;
		Class282_Sub20_Sub24.aClass118_9884 = null;
		method5137();
		aClass482_3459.method8118(-249876834);
		aClass283_3470 = null;
		Class511.aClass160_5883 = null;
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class494.aClass194_5794 = null;
		aClass194_8017 = null;
		aClass194_8023 = null;
		Class446.aClass194_5416 = null;
		Class114.aClass194_1243 = null;
		Class524.aClass194_6967 = null;
		Class251.aClass194_3103 = null;
		Class521_Sub1_Sub5_Sub1.aClass194_10527 = null;
		if (aClass218_3456 != null) {
			aClass218_3456.method3699((byte) 1);
			aClass218_3456.method3697(128, 64, 1577532169);
		}
		if (null != aClass427_3457)
			aClass427_3457.method7175(64, 64, 1941089434);
		if (aClass474_3455 != null)
			aClass474_3455.method7899(256, -2034610586);
		Class16.aClass230_147.method3906(64, (short) 727);
	}

	public static void method13309(boolean bool) {
		if (bool && null != aClass282_Sub50_Sub6_3491)
			Class51.anInt488 = aClass282_Sub50_Sub6_3491.anInt9536 * -105285481;
		else
			Class51.anInt488 = 562841881;
		aClass282_Sub50_Sub6_3491 = null;
		Class346.aClass482_4049 = null;
		anInt8015 = 0;
		Class282_Sub20_Sub24.aClass118_9884 = null;
		method5137();
		aClass482_3459.method8118(-1129013792);
		aClass283_3470 = null;
		Class511.aClass160_5883 = null;
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class494.aClass194_5794 = null;
		aClass194_8017 = null;
		aClass194_8023 = null;
		Class446.aClass194_5416 = null;
		Class114.aClass194_1243 = null;
		Class524.aClass194_6967 = null;
		Class251.aClass194_3103 = null;
		Class521_Sub1_Sub5_Sub1.aClass194_10527 = null;
		if (aClass218_3456 != null) {
			aClass218_3456.method3699((byte) 1);
			aClass218_3456.method3697(128, 64, -689287550);
		}
		if (null != aClass427_3457)
			aClass427_3457.method7175(64, 64, 2069296411);
		if (aClass474_3455 != null)
			aClass474_3455.method7899(256, -2034610586);
		Class16.aClass230_147.method3906(64, (short) 727);
	}

	static void method13310() {
		aClass465_8025.method7749(298358964);
		aClass465_8029.method7749(-1295129537);
	}

	static void method13311() {
		aClass465_8025.method7749(-1955992223);
		aClass465_8029.method7749(82742424);
	}

	static void method13312(Class505 class505, Interface22 interface22, int i, int i_7_, int i_8_, int i_9_) {
		if (-8084891 * anInt8015 < 100)
			Class435.method7302(class505, interface22, (byte) 5);
		class505.r(i, i_7_, i_8_ + i, i_9_ + i_7_);
		if (-8084891 * anInt8015 < 100) {
			int i_10_ = 20;
			int i_11_ = i + i_8_ / 2;
			int i_12_ = i_7_ + i_9_ / 2 - 18 - i_10_;
			class505.B(i, i_7_, i_8_, i_9_, -16777216, 0);
			class505.method8430(i_11_ - 152, i_12_, 304, 34, client.aColorArray7199[client.anInt7447 * 1920182969].getRGB(), 0);
			class505.B(i_11_ - 150, 2 + i_12_, -24254673 * anInt8015, 30, client.aColorArray7186[1920182969 * client.anInt7447].getRGB(), 0);
			Class285.aClass8_3394.method360(Class433.aClass433_5274.method7273(Class223.aClass495_2772, -1330018611), i_11_, i_10_ + i_12_, client.aColorArray7200[1920182969 * client.anInt7447].getRGB(), -1, 768492991);
		} else {
			int i_13_ = (-861975801 * Class427.anInt5123 - (int) ((float) i_8_ / aFloat3468));
			int i_14_ = ((int) ((float) i_9_ / aFloat3468) + Class475.anInt5624 * 483850921);
			int i_15_ = ((int) ((float) i_8_ / aFloat3468) + Class427.anInt5123 * -861975801);
			int i_16_ = (Class475.anInt5624 * 483850921 - (int) ((float) i_9_ / aFloat3468));
			Class340.anInt3991 = -848800339 * (-861975801 * Class427.anInt5123 - (int) ((float) i_8_ / aFloat3468));
			Class489.anInt5765 = 1732935055 * (483850921 * Class475.anInt5624 - (int) ((float) i_9_ / aFloat3468));
			Class488.anInt5760 = -791388679 * (int) ((float) (2 * i_8_) / aFloat3468);
			Class351.anInt4097 = (int) ((float) (2 * i_9_) / aFloat3468) * 429290245;
			method5139(i_13_ + anInt3472, anInt3473 + i_14_, anInt3472 + i_15_, anInt3473 + i_16_, i, i_7_, i + i_8_, 1 + (i_7_ + i_9_));
			method5180(class505);
			Class482 class482 = method5135(class505);
			Class18.method573(class505, class482, 0, 0, (byte) 2);
			if (Class361.anInt4185 * 750747217 > 0) {
				Class96_Sub9.anInt9282 -= 759227215;
				if (Class96_Sub9.anInt9282 * 896422831 == 0) {
					Class361.anInt4185 -= -1293776207;
					Class96_Sub9.anInt9282 = -1995324884;
				}
			}
			if (client.aBool7176) {
				int i_17_ = i + i_8_ - 5;
				int i_18_ = i_9_ + i_7_ - 8;
				Class16.aClass8_144.method359(new StringBuilder().append("Fps:").append(Class263.anInt3253 * 457052913).toString(), i_17_, i_18_, 16776960, -1, 1878721557);
				i_18_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_19_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_20_ = 16776960;
				if (i_19_ > 65536)
					i_20_ = 16711680;
				Class16.aClass8_144.method359(new StringBuilder().append("Mem:").append(i_19_).append("k").toString(), i_17_, i_18_, i_20_, -1, 1878721557);
				i_18_ -= 15;
			}
		}
	}

	static void method13313(Class505 class505, Interface22 interface22, int i, int i_21_, int i_22_, int i_23_) {
		if (-8084891 * anInt8015 < 100)
			Class435.method7302(class505, interface22, (byte) -18);
		class505.r(i, i_21_, i_22_ + i, i_23_ + i_21_);
		if (-8084891 * anInt8015 < 100) {
			int i_24_ = 20;
			int i_25_ = i + i_22_ / 2;
			int i_26_ = i_21_ + i_23_ / 2 - 18 - i_24_;
			class505.B(i, i_21_, i_22_, i_23_, -16777216, 0);
			class505.method8430(i_25_ - 152, i_26_, 304, 34, client.aColorArray7199[client.anInt7447 * 1920182969].getRGB(), 0);
			class505.B(i_25_ - 150, 2 + i_26_, -24254673 * anInt8015, 30, client.aColorArray7186[1920182969 * client.anInt7447].getRGB(), 0);
			Class285.aClass8_3394.method360(Class433.aClass433_5274.method7273(Class223.aClass495_2772, -360961683), i_25_, i_24_ + i_26_, client.aColorArray7200[1920182969 * client.anInt7447].getRGB(), -1, 768492991);
		} else {
			int i_27_ = (-861975801 * Class427.anInt5123 - (int) ((float) i_22_ / aFloat3468));
			int i_28_ = ((int) ((float) i_23_ / aFloat3468) + Class475.anInt5624 * 483850921);
			int i_29_ = ((int) ((float) i_22_ / aFloat3468) + Class427.anInt5123 * -861975801);
			int i_30_ = (Class475.anInt5624 * 483850921 - (int) ((float) i_23_ / aFloat3468));
			Class340.anInt3991 = -848800339 * (-861975801 * Class427.anInt5123 - (int) ((float) i_22_ / aFloat3468));
			Class489.anInt5765 = 1732935055 * (483850921 * Class475.anInt5624 - (int) ((float) i_23_ / aFloat3468));
			Class488.anInt5760 = -791388679 * (int) ((float) (2 * i_22_) / aFloat3468);
			Class351.anInt4097 = (int) ((float) (2 * i_23_) / aFloat3468) * 429290245;
			method5139(i_27_ + anInt3472, anInt3473 + i_28_, anInt3472 + i_29_, anInt3473 + i_30_, i, i_21_, i + i_22_, 1 + (i_21_ + i_23_));
			method5180(class505);
			Class482 class482 = method5135(class505);
			Class18.method573(class505, class482, 0, 0, (byte) 2);
			if (Class361.anInt4185 * 750747217 > 0) {
				Class96_Sub9.anInt9282 -= 759227215;
				if (Class96_Sub9.anInt9282 * 896422831 == 0) {
					Class361.anInt4185 -= -1293776207;
					Class96_Sub9.anInt9282 = -1995324884;
				}
			}
			if (client.aBool7176) {
				int i_31_ = i + i_22_ - 5;
				int i_32_ = i_23_ + i_21_ - 8;
				Class16.aClass8_144.method359(new StringBuilder().append("Fps:").append(Class263.anInt3253 * 457052913).toString(), i_31_, i_32_, 16776960, -1, 1878721557);
				i_32_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_33_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_34_ = 16776960;
				if (i_33_ > 65536)
					i_34_ = 16711680;
				Class16.aClass8_144.method359(new StringBuilder().append("Mem:").append(i_33_).append("k").toString(), i_31_, i_32_, i_34_, -1, 1878721557);
				i_32_ -= 15;
			}
		}
	}

	static void method13314(Class505 class505, Class482 class482, int i, int i_35_) {
		Class346.aClass482_4049.method8118(-606784300);
		if (!aBool8027) {
			for (Class282_Sub36 class282_sub36 = (Class282_Sub36) class482.method8097((byte) 109); null != class282_sub36; class282_sub36 = (Class282_Sub36) class482.method8067(1402716259)) {
				Class220 class220 = aClass218_3456.method3700((-1798678621 * class282_sub36.anInt7991), 420567277);
				if (Class282_Sub16.method12248(class220, -1465164738)) {
					boolean bool = Class220.method3742(class505, class282_sub36, class220, i, i_35_, 1902235904);
					if (bool)
						Class282_Sub39.method13297(class505, class282_sub36, class220, -1013841074);
				}
			}
		}
	}

	static void method13315(Class505 class505, Class482 class482, int i, int i_36_) {
		Class346.aClass482_4049.method8118(-1062164394);
		if (!aBool8027) {
			for (Class282_Sub36 class282_sub36 = (Class282_Sub36) class482.method8097((byte) 53); null != class282_sub36; class282_sub36 = (Class282_Sub36) class482.method8067(850263082)) {
				Class220 class220 = aClass218_3456.method3700((-1798678621 * class282_sub36.anInt7991), -21831457);
				if (Class282_Sub16.method12248(class220, -1789127291)) {
					boolean bool = Class220.method3742(class505, class282_sub36, class220, i, i_36_, -376840102);
					if (bool)
						Class282_Sub39.method13297(class505, class282_sub36, class220, -380397936);
				}
			}
		}
	}

	static boolean method13316(Class220 class220) {
		if (null == class220)
			return false;
		if (!class220.aBool2728)
			return false;
		if (!class220.method3719(anInterface42_3458, -926841124))
			return false;
		if (aClass465_8025.method7754((long) (class220.anInt2753 * -813142717)) != null)
			return false;
		if (aClass465_8029.method7754((long) (781329827 * class220.anInt2718)) != null)
			return false;
		return true;
	}

	static void method13317(int i) {
		Class427.anInt5123 = 1714827959 * i;
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class89.method1502(-226220670);
	}

	static boolean method13318(Class505 class505, Class282_Sub36 class282_sub36, Class220 class220, int i, int i_37_) {
		int i_38_ = 2147483647;
		int i_39_ = -2147483648;
		int i_40_ = 2147483647;
		int i_41_ = -2147483648;
		if (null != class220.anIntArray2717) {
			i_38_ = ((anInt3476 - anInt3489) * (-1306535747 * class282_sub36.anInt7987 + -195227125 * class220.anInt2747 - anInt3485) / (anInt3480 - anInt3485)) + anInt3489;
			i_39_ = (anInt3489 + ((class220.anInt2731 * -1051190363 + class282_sub36.anInt7987 * -1306535747 - anInt3485) * (anInt3476 - anInt3489) / (anInt3480 - anInt3485)));
			i_41_ = anInt3492 - ((anInt3492 - anInt3490) * (1012301095 * class282_sub36.anInt7993 + class220.anInt2744 * 1104382109 - anInt3465) / (anInt3486 - anInt3465));
			i_40_ = anInt3492 - ((anInt3492 - anInt3490) * (class220.anInt2746 * 1123286327 + class282_sub36.anInt7993 * 1012301095 - anInt3465) / (anInt3486 - anInt3465));
		}
		Class160 class160 = null;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = 0;
		if (class220.anInt2719 * -1248709255 != -1) {
			if (class282_sub36.aBool7989 && class220.anInt2757 * -992610861 != -1)
				class160 = class220.method3735(class505, true, (byte) 8);
			else
				class160 = class220.method3735(class505, false, (byte) 8);
			if (null != class160) {
				i_42_ = (443215287 * class282_sub36.anInt7990 - (class160.method228() + 1 >> 1));
				if (i_42_ < i_38_)
					i_38_ = i_42_;
				i_43_ = (443215287 * class282_sub36.anInt7990 + (class160.method228() + 1 >> 1));
				if (i_43_ > i_39_)
					i_39_ = i_43_;
				i_44_ = (-904538465 * class282_sub36.anInt7992 - (class160.method2748() + 1 >> 1));
				if (i_44_ < i_40_)
					i_40_ = i_44_;
				i_45_ = (class282_sub36.anInt7992 * -904538465 + (class160.method2748() + 1 >> 1));
				if (i_45_ > i_41_)
					i_41_ = i_45_;
			}
		}
		Class194 class194 = null;
		int i_46_ = 0;
		int i_47_ = 0;
		int i_48_ = 0;
		int i_49_ = 0;
		int i_50_ = 0;
		int i_51_ = 0;
		int i_52_ = 0;
		int i_53_ = 0;
		if (class220.aString2751 != null) {
			class194 = Class286.method5048(class220.anInt2722 * 1172439539, (byte) -87);
			if (null != class194) {
				i_46_ = (Class282_Sub17_Sub2.aClass414_9933.method6987(class220.aString2751, null, aStringArray8024, null, (byte) 0));
				i_47_ = (443215287 * class282_sub36.anInt7990 + (-1153726009 * class220.anInt2750 * (anInt3476 - anInt3489) / (anInt3480 - anInt3485)));
				i_48_ = (class282_sub36.anInt7992 * -904538465 - ((anInt3492 - anInt3490) * (class220.anInt2752 * -1409297307) / (anInt3486 - anInt3465)));
				if (class160 == null)
					i_48_ -= class194.method3186() * i_46_ / 2;
				else
					i_48_ -= ((class160.method2748() >> 1) + class194.method3173() * i_46_);
				for (int i_54_ = 0; i_54_ < i_46_; i_54_++) {
					String string = aStringArray8024[i_54_];
					if (i_54_ < i_46_ - 1)
						string = string.substring(0, string.length() - 4);
					int i_55_ = class194.method3177(string);
					if (i_55_ > i_49_)
						i_49_ = i_55_;
				}
				i_50_ = i_47_ - i_49_ / 2 + i;
				if (i_50_ < i_38_)
					i_38_ = i_50_;
				i_51_ = i_49_ / 2 + i_47_ + i;
				if (i_51_ > i_39_)
					i_39_ = i_51_;
				i_52_ = i_48_ + i_37_;
				if (i_52_ < i_40_)
					i_40_ = i_52_;
				i_53_ = i_48_ + i_46_ * class194.method3173() + i_37_;
				if (i_53_ > i_41_)
					i_41_ = i_53_;
			}
		}
		if (i_39_ < anInt3489 || i_38_ > anInt3476 || i_41_ < anInt3490 || i_40_ > anInt3492)
			return true;
		method5147(class505, class282_sub36, class220);
		if (class160 != null) {
			if (Class361.anInt4185 * 750747217 > 0 && ((-1 != anInt8018 * 2089227969 && (anInt8018 * 2089227969 == class282_sub36.anInt7991 * -1798678621)) || (614736923 * anInt8026 != -1 && (anInt8026 * 614736923 == class220.anInt2718 * 781329827)))) {
				int i_56_;
				if (896422831 * Class96_Sub9.anInt9282 > 50)
					i_56_ = 200 - Class96_Sub9.anInt9282 * 1792845662;
				else
					i_56_ = Class96_Sub9.anInt9282 * 1792845662;
				int i_57_ = i_56_ << 24 | 0xffff00;
				class505.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, class160.method2747() / 2 + 7, i_57_, -157227986);
				class505.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, class160.method2747() / 2 + 5, i_57_, 754300252);
				class505.method8468(443215287 * class282_sub36.anInt7990, class282_sub36.anInt7992 * -904538465, class160.method2747() / 2 + 3, i_57_, -1483370167);
				class505.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, class160.method2747() / 2 + 1, i_57_, -248122635);
				class505.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, class160.method2747() / 2, i_57_, 1449588403);
			}
			class160.method2752((443215287 * class282_sub36.anInt7990 - (class160.method228() >> 1)), (-904538465 * class282_sub36.anInt7992 - (class160.method2748() >> 1)));
		}
		if (class220.aString2751 != null && class194 != null)
			Class392.method6739(class505, class282_sub36, class220, i_46_, i_47_, i_48_, i_49_, class194, (byte) 37);
		if (-1248709255 * class220.anInt2719 != -1 || class220.aString2751 != null) {
			Class282_Sub33 class282_sub33 = new Class282_Sub33(class282_sub36);
			((Class282_Sub33) class282_sub33).anInt7830 = i_42_ * -925812333;
			((Class282_Sub33) class282_sub33).anInt7828 = i_43_ * 1303174651;
			((Class282_Sub33) class282_sub33).anInt7834 = i_44_ * -1854557465;
			((Class282_Sub33) class282_sub33).anInt7833 = -724182681 * i_45_;
			((Class282_Sub33) class282_sub33).anInt7829 = i_50_ * -1447464913;
			((Class282_Sub33) class282_sub33).anInt7832 = -705732785 * i_51_;
			((Class282_Sub33) class282_sub33).anInt7831 = -2064740419 * i_52_;
			((Class282_Sub33) class282_sub33).anInt7827 = -719287379 * i_53_;
			Class346.aClass482_4049.method8059(class282_sub33, -1381668856);
		}
		return false;
	}

	Class291_Sub1() throws Throwable {
		throw new Error();
	}

	static void method13319(Class505 class505, Class282_Sub36 class282_sub36, Class220 class220, int i, int i_58_, int i_59_, int i_60_, Class194 class194) {
		int i_61_ = i_58_ - i_60_ / 2 - 5;
		int i_62_ = 2 + i_59_;
		if (0 != class220.anInt2726 * 1903100449)
			class505.method8425(i_61_, i_62_, i_60_ + 10, i_59_ + i * class194.method3173() - i_62_ + 1, class220.anInt2726 * 1903100449, (byte) -86);
		if (0 != class220.anInt2727 * 1542243419)
			class505.method8562(i_61_, i_62_, 10 + i_60_, i_59_ + i * class194.method3173() - i_62_ + 1, 1542243419 * class220.anInt2727, (byte) 4);
		int i_63_ = -2116785903 * class220.anInt2720;
		if (class282_sub36.aBool7989 && -1 != -1748609101 * class220.anInt2721)
			i_63_ = -1748609101 * class220.anInt2721;
		for (int i_64_ = 0; i_64_ < i; i_64_++) {
			String string = aStringArray8024[i_64_];
			if (i_64_ < i - 1)
				string = string.substring(0, string.length() - 4);
			class194.method3178(class505, string, i_58_, i_59_, i_63_, true);
			i_59_ += class194.method3173();
		}
	}

	public static int method13320() {
		if ((double) aFloat3462 == 3.0)
			return 37;
		if ((double) aFloat3462 == 4.0)
			return 50;
		if (6.0 == (double) aFloat3462)
			return 75;
		if ((double) aFloat3462 == 8.0)
			return 100;
		return 200;
	}

	static final void method13321(Class505 class505, int i, int i_65_, int i_66_, int i_67_) {
		class505.r(i, i_65_, i_66_ + i, i_65_ + i_67_);
		class505.method8425(i, i_65_, i_66_, i_67_, -16777216, (byte) -15);
		if (-8084891 * anInt8015 >= 100) {
			float f = (float) anInt3483 / (float) anInt3474;
			int i_68_ = i_66_;
			int i_69_ = i_67_;
			if (f < 1.0F)
				i_69_ = (int) (f * (float) i_66_);
			else
				i_68_ = (int) ((float) i_67_ / f);
			i += (i_66_ - i_68_) / 2;
			i_65_ += (i_67_ - i_69_) / 2;
			if (null == Class511.aClass160_5883 || Class511.aClass160_5883.method2747() != i_66_ || Class511.aClass160_5883.method2793() != i_67_) {
				method5139(anInt3472, anInt3473 + anInt3483, anInt3474 + anInt3472, anInt3473, i, i_65_, i_68_ + i, i_65_ + i_69_);
				method5180(class505);
				Class511.aClass160_5883 = class505.method8668(i, i_65_, i_68_, i_69_, false);
			}
			Class511.aClass160_5883.method2752(i, i_65_);
			int i_70_ = i_68_ * (Class488.anInt5760 * 1448596553) / anInt3474;
			int i_71_ = i_69_ * (Class351.anInt4097 * -1845665331) / anInt3483;
			int i_72_ = i + i_68_ * (Class340.anInt3991 * -517876187) / anInt3474;
			int i_73_ = (i_69_ + i_65_ - i_69_ * (Class489.anInt5765 * -1586888337) / anInt3483 - i_71_);
			int i_74_ = -1996554240;
			if (Class486.aClass486_5750 == client.aClass486_7450)
				i_74_ = -1996488705;
			class505.B(i_72_, i_73_, i_70_, i_71_, i_74_, 1);
			class505.method8430(i_72_, i_73_, i_70_, i_71_, i_74_, 0);
			if (Class361.anInt4185 * 750747217 > 0) {
				int i_75_;
				if (Class96_Sub9.anInt9282 * 896422831 > 50)
					i_75_ = 500 - Class96_Sub9.anInt9282 * 187146859;
				else
					i_75_ = 187146859 * Class96_Sub9.anInt9282;
				for (Class282_Sub36 class282_sub36 = ((Class282_Sub36) aClass482_3459.method8097((byte) 126)); class282_sub36 != null; class282_sub36 = ((Class282_Sub36) aClass482_3459.method8067(1591189371))) {
					Class220 class220 = aClass218_3456.method3700((class282_sub36.anInt7991 * -1798678621), 1016638283);
					if (Class282_Sub16.method12248(class220, -749750727)) {
						if (-1798678621 * class282_sub36.anInt7991 == 2089227969 * anInt8018) {
							int i_76_ = ((i_68_ * (-1306535747 * class282_sub36.anInt7987) / anInt3474) + i);
							int i_77_ = i_65_ + (i_69_ * (anInt3483 - (1012301095 * class282_sub36.anInt7993)) / anInt3483);
							class505.method8425(i_76_ - 2, i_77_ - 2, 4, 4, i_75_ << 24 | 0xffff00, (byte) -59);
						} else if (-1 != anInt8026 * 614736923 && (anInt8026 * 614736923 == 781329827 * class220.anInt2718)) {
							int i_78_ = ((i_68_ * (-1306535747 * class282_sub36.anInt7987) / anInt3474) + i);
							int i_79_ = (i_65_ + ((anInt3483 - class282_sub36.anInt7993 * 1012301095) * i_69_ / anInt3483));
							class505.method8425(i_78_ - 2, i_79_ - 2, 4, 4, i_75_ << 24 | 0xffff00, (byte) -106);
						}
					}
				}
			}
		}
	}

	static final void method13322(Class505 class505, int i, int i_80_, int i_81_, int i_82_) {
		class505.r(i, i_80_, i_81_ + i, i_80_ + i_82_);
		class505.method8425(i, i_80_, i_81_, i_82_, -16777216, (byte) -79);
		if (-8084891 * anInt8015 >= 100) {
			float f = (float) anInt3483 / (float) anInt3474;
			int i_83_ = i_81_;
			int i_84_ = i_82_;
			if (f < 1.0F)
				i_84_ = (int) (f * (float) i_81_);
			else
				i_83_ = (int) ((float) i_82_ / f);
			i += (i_81_ - i_83_) / 2;
			i_80_ += (i_82_ - i_84_) / 2;
			if (null == Class511.aClass160_5883 || Class511.aClass160_5883.method2747() != i_81_ || Class511.aClass160_5883.method2793() != i_82_) {
				method5139(anInt3472, anInt3473 + anInt3483, anInt3474 + anInt3472, anInt3473, i, i_80_, i_83_ + i, i_80_ + i_84_);
				method5180(class505);
				Class511.aClass160_5883 = class505.method8668(i, i_80_, i_83_, i_84_, false);
			}
			Class511.aClass160_5883.method2752(i, i_80_);
			int i_85_ = i_83_ * (Class488.anInt5760 * 1448596553) / anInt3474;
			int i_86_ = i_84_ * (Class351.anInt4097 * -1845665331) / anInt3483;
			int i_87_ = i + i_83_ * (Class340.anInt3991 * -517876187) / anInt3474;
			int i_88_ = (i_84_ + i_80_ - i_84_ * (Class489.anInt5765 * -1586888337) / anInt3483 - i_86_);
			int i_89_ = -1996554240;
			if (Class486.aClass486_5750 == client.aClass486_7450)
				i_89_ = -1996488705;
			class505.B(i_87_, i_88_, i_85_, i_86_, i_89_, 1);
			class505.method8430(i_87_, i_88_, i_85_, i_86_, i_89_, 0);
			if (Class361.anInt4185 * 750747217 > 0) {
				int i_90_;
				if (Class96_Sub9.anInt9282 * 896422831 > 50)
					i_90_ = 500 - Class96_Sub9.anInt9282 * 187146859;
				else
					i_90_ = 187146859 * Class96_Sub9.anInt9282;
				for (Class282_Sub36 class282_sub36 = ((Class282_Sub36) aClass482_3459.method8097((byte) 116)); class282_sub36 != null; class282_sub36 = ((Class282_Sub36) aClass482_3459.method8067(902171842))) {
					Class220 class220 = aClass218_3456.method3700((class282_sub36.anInt7991 * -1798678621), 943980209);
					if (Class282_Sub16.method12248(class220, -1507631654)) {
						if (-1798678621 * class282_sub36.anInt7991 == 2089227969 * anInt8018) {
							int i_91_ = ((i_83_ * (-1306535747 * class282_sub36.anInt7987) / anInt3474) + i);
							int i_92_ = i_80_ + (i_84_ * (anInt3483 - (1012301095 * class282_sub36.anInt7993)) / anInt3483);
							class505.method8425(i_91_ - 2, i_92_ - 2, 4, 4, i_90_ << 24 | 0xffff00, (byte) -55);
						} else if (-1 != anInt8026 * 614736923 && (anInt8026 * 614736923 == 781329827 * class220.anInt2718)) {
							int i_93_ = ((i_83_ * (-1306535747 * class282_sub36.anInt7987) / anInt3474) + i);
							int i_94_ = (i_80_ + ((anInt3483 - class282_sub36.anInt7993 * 1012301095) * i_84_ / anInt3483));
							class505.method8425(i_93_ - 2, i_94_ - 2, 4, 4, i_90_ << 24 | 0xffff00, (byte) -16);
						}
					}
				}
			}
		}
	}

	static final void method13323(Class505 class505, int i, int i_95_, int i_96_, int i_97_) {
		class505.r(i, i_95_, i_96_ + i, i_95_ + i_97_);
		class505.method8425(i, i_95_, i_96_, i_97_, -16777216, (byte) -79);
		if (-8084891 * anInt8015 >= 100) {
			float f = (float) anInt3483 / (float) anInt3474;
			int i_98_ = i_96_;
			int i_99_ = i_97_;
			if (f < 1.0F)
				i_99_ = (int) (f * (float) i_96_);
			else
				i_98_ = (int) ((float) i_97_ / f);
			i += (i_96_ - i_98_) / 2;
			i_95_ += (i_97_ - i_99_) / 2;
			if (null == Class511.aClass160_5883 || Class511.aClass160_5883.method2747() != i_96_ || Class511.aClass160_5883.method2793() != i_97_) {
				method5139(anInt3472, anInt3473 + anInt3483, anInt3474 + anInt3472, anInt3473, i, i_95_, i_98_ + i, i_95_ + i_99_);
				method5180(class505);
				Class511.aClass160_5883 = class505.method8668(i, i_95_, i_98_, i_99_, false);
			}
			Class511.aClass160_5883.method2752(i, i_95_);
			int i_100_ = i_98_ * (Class488.anInt5760 * 1448596553) / anInt3474;
			int i_101_ = i_99_ * (Class351.anInt4097 * -1845665331) / anInt3483;
			int i_102_ = i + i_98_ * (Class340.anInt3991 * -517876187) / anInt3474;
			int i_103_ = (i_99_ + i_95_ - i_99_ * (Class489.anInt5765 * -1586888337) / anInt3483 - i_101_);
			int i_104_ = -1996554240;
			if (Class486.aClass486_5750 == client.aClass486_7450)
				i_104_ = -1996488705;
			class505.B(i_102_, i_103_, i_100_, i_101_, i_104_, 1);
			class505.method8430(i_102_, i_103_, i_100_, i_101_, i_104_, 0);
			if (Class361.anInt4185 * 750747217 > 0) {
				int i_105_;
				if (Class96_Sub9.anInt9282 * 896422831 > 50)
					i_105_ = 500 - Class96_Sub9.anInt9282 * 187146859;
				else
					i_105_ = 187146859 * Class96_Sub9.anInt9282;
				for (Class282_Sub36 class282_sub36 = ((Class282_Sub36) aClass482_3459.method8097((byte) 95)); class282_sub36 != null; class282_sub36 = ((Class282_Sub36) aClass482_3459.method8067(-457165648))) {
					Class220 class220 = aClass218_3456.method3700((class282_sub36.anInt7991 * -1798678621), 539589592);
					if (Class282_Sub16.method12248(class220, -975887656)) {
						if (-1798678621 * class282_sub36.anInt7991 == 2089227969 * anInt8018) {
							int i_106_ = ((i_98_ * (-1306535747 * class282_sub36.anInt7987) / anInt3474) + i);
							int i_107_ = i_95_ + (i_99_ * (anInt3483 - (1012301095 * class282_sub36.anInt7993)) / anInt3483);
							class505.method8425(i_106_ - 2, i_107_ - 2, 4, 4, i_105_ << 24 | 0xffff00, (byte) -43);
						} else if (-1 != anInt8026 * 614736923 && (anInt8026 * 614736923 == 781329827 * class220.anInt2718)) {
							int i_108_ = ((i_98_ * (-1306535747 * class282_sub36.anInt7987) / anInt3474) + i);
							int i_109_ = (i_95_ + ((anInt3483 - class282_sub36.anInt7993 * 1012301095) * i_99_ / anInt3483));
							class505.method8425(i_108_ - 2, i_109_ - 2, 4, 4, i_105_ << 24 | 0xffff00, (byte) -81);
						}
					}
				}
			}
		}
	}

	static {
		anInt8015 = 0;
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		aBool8022 = false;
		anInt8019 = -776800459;
		anInt8020 = -611890095;
		aBool8028 = false;
		aStringArray8024 = new String[5];
		anInt8018 = 428705471;
		anInt8026 = -194319891;
		aBool8027 = false;
		aClass465_8025 = new Class465(8);
		aClass465_8029 = new Class465(8);
		aClass460_8030 = new Class460(new Class482());
	}

	static void method13324(int i, int i_110_, int i_111_) {
		if (i == 1008)
			Class210.method3614(Class397.aClass397_4801, i_110_, i_111_, (byte) 76);
		else if (i == 1009)
			Class210.method3614(Class397.aClass397_4793, i_110_, i_111_, (byte) 80);
		else if (1010 == i)
			Class210.method3614(Class397.aClass397_4794, i_110_, i_111_, (byte) 70);
		else if (i == 1011)
			Class210.method3614(Class397.aClass397_4795, i_110_, i_111_, (byte) 105);
		else if (i == 1012)
			Class210.method3614(Class397.aClass397_4796, i_110_, i_111_, (byte) 121);
	}

	public static void method13325(int i, int i_112_) {
		anInt8014 = (i - anInt3472) * 1089992553;
		anInt8016 = (i_112_ - anInt3473) * -638834387;
	}

	static void method13326() {
		Class122.method2111(false, 662490589);
		if (anInt8021 * 1337065231 >= 0 && 0 != 1337065231 * anInt8021) {
			Class538.method11500(anInt8021 * 1337065231, false, (byte) 24);
			anInt8021 = -923733999;
		}
	}

	static void method13327() {
		Class122.method2111(false, 662490589);
		if (anInt8021 * 1337065231 >= 0 && 0 != 1337065231 * anInt8021) {
			Class538.method11500(anInt8021 * 1337065231, false, (byte) 24);
			anInt8021 = -923733999;
		}
	}

	static void method13328() {
		Class122.method2111(false, 662490589);
		if (anInt8021 * 1337065231 >= 0 && 0 != 1337065231 * anInt8021) {
			Class538.method11500(anInt8021 * 1337065231, false, (byte) 24);
			anInt8021 = -923733999;
		}
	}

	static void method13329() {
		Class122.method2111(false, 662490589);
		if (anInt8021 * 1337065231 >= 0 && 0 != 1337065231 * anInt8021) {
			Class538.method11500(anInt8021 * 1337065231, false, (byte) 24);
			anInt8021 = -923733999;
		}
	}

	public static void method13330() {
		if (-1 != Class51.anInt488 * -1437926185) {
			Class515.method8862(Class51.anInt488 * -1437926185, -1, -1, false, -1732540658);
			Class51.anInt488 = 562841881;
		}
	}

	static void method13331(int i, int i_113_, int i_114_, int i_115_) {
		float f = (float) anInt3483 / (float) anInt3474;
		int i_116_ = i_114_;
		int i_117_ = i_115_;
		if (f < 1.0F)
			i_117_ = (int) ((float) i_114_ * f);
		else
			i_116_ = (int) ((float) i_115_ / f);
		i -= (i_114_ - i_116_) / 2;
		i_113_ -= (i_115_ - i_117_) / 2;
		Class427.anInt5123 = anInt3474 * i / i_116_ * 1714827959;
		Class475.anInt5624 = 1710901657 * (anInt3483 - anInt3483 * i_113_ / i_117_);
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class89.method1502(1047487147);
	}

	static final void method13332(int i, int i_118_) {
		if (aFloat3468 < aFloat3462) {
			aFloat3468 += (double) aFloat3468 / 30.0;
			if (aFloat3468 > aFloat3462)
				aFloat3468 = aFloat3462;
			Class89.method1502(890258328);
			anInt3469 = (int) aFloat3468 >> 1;
			aByteArrayArrayArray3464 = Class491.method8246(anInt3469, (short) 8192);
		} else if (aFloat3468 > aFloat3462) {
			aFloat3468 -= (double) aFloat3468 / 30.0;
			if (aFloat3468 < aFloat3462)
				aFloat3468 = aFloat3462;
			Class89.method1502(7643956);
			anInt3469 = (int) aFloat3468 >> 1;
			aByteArrayArrayArray3464 = Class491.method8246(anInt3469, (short) 8192);
		}
		if (anInt8014 * -1359738663 != -1 && -1 != -162722139 * anInt8016) {
			int i_119_ = anInt8014 * -1359738663 - -861975801 * Class427.anInt5123;
			if (i_119_ < 2 || i_119_ > 2)
				i_119_ /= 8;
			int i_120_ = -162722139 * anInt8016 - 483850921 * Class475.anInt5624;
			if (i_120_ < 2 || i_120_ > 2)
				i_120_ /= 8;
			Class427.anInt5123 = (i_119_ + Class427.anInt5123 * -861975801) * 1714827959;
			Class475.anInt5624 = 1710901657 * (i_120_ + 483850921 * Class475.anInt5624);
			if (0 == i_119_ && 0 == i_120_) {
				anInt8014 = -1089992553;
				anInt8016 = 638834387;
			}
			Class89.method1502(-71750203);
		}
		if (Class361.anInt4185 * 750747217 > 0) {
			Class96_Sub9.anInt9282 -= 759227215;
			if (896422831 * Class96_Sub9.anInt9282 == 0) {
				Class361.anInt4185 -= -1293776207;
				Class96_Sub9.anInt9282 = -1386689828;
			}
		} else {
			anInt8018 = 428705471;
			anInt8026 = -194319891;
		}
		if (aBool8022 && null != Class346.aClass482_4049) {
			for (Class282_Sub33 class282_sub33 = ((Class282_Sub33) Class346.aClass482_4049.method8097((byte) 22)); class282_sub33 != null; class282_sub33 = ((Class282_Sub33) Class346.aClass482_4049.method8067(-1012066153))) {
				Class220 class220 = aClass218_3456.method3700((-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991)), 706604067);
				if (class282_sub33.method12577(i, i_118_, -1474454985)) {
					if (null != class220.aStringArray2740) {
						if (null != class220.aStringArray2740[4])
							Class238.method4032(class220.aStringArray2740[4], class220.aString2732, -1, 1012, -1, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), class220.anInt2718 * 781329827, 0, true, false, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), false, -1374528724);
						if (null != class220.aStringArray2740[3])
							Class238.method4032(class220.aStringArray2740[3], class220.aString2732, -1, 1011, -1, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), 781329827 * class220.anInt2718, 0, true, false, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), false, -1781541175);
						if (null != class220.aStringArray2740[2])
							Class238.method4032(class220.aStringArray2740[2], class220.aString2732, -1, 1010, -1, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), 781329827 * class220.anInt2718, 0, true, false, (long) (-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991)), false, -1488507077);
						if (class220.aStringArray2740[1] != null)
							Class238.method4032(class220.aStringArray2740[1], class220.aString2732, -1, 1009, -1, (long) (-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991)), class220.anInt2718 * 781329827, 0, true, false, (long) (-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991)), false, -1447373587);
						if (class220.aStringArray2740[0] != null)
							Class238.method4032(class220.aStringArray2740[0], class220.aString2732, -1, 1008, -1, (long) (-1798678621 * (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991)), 781329827 * class220.anInt2718, 0, true, false, (long) ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), false, -1616099671);
					}
					if (!((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989) {
						((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989 = true;
						Class210.method3614(Class397.aClass397_4797, ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), class220.anInt2718 * 781329827, (byte) 72);
					}
					if (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989)
						Class210.method3614(Class397.aClass397_4805, ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), 781329827 * class220.anInt2718, (byte) 6);
				} else if (((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989) {
					((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.aBool7989 = false;
					Class210.method3614(Class397.aClass397_4798, ((((Class282_Sub33) class282_sub33).aClass282_Sub36_7835.anInt7991) * -1798678621), 781329827 * class220.anInt2718, (byte) 86);
				}
			}
		}
	}

	public static Class282_Sub50_Sub6 method13333() {
		return aClass282_Sub50_Sub6_3491;
	}

	public static Class282_Sub50_Sub6 method13334() {
		return aClass282_Sub50_Sub6_3491;
	}

	public static void method13335(int i) {
		anInt8018 = i * -428705471;
		anInt8026 = -194319891;
		Class361.anInt4185 = 413638675;
		Class96_Sub9.anInt9282 = -1386689828;
	}

	static void method13336(int i) {
		Class427.anInt5123 = 1714827959 * i;
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class89.method1502(1005247069);
	}

	static void method13337(int i) {
		Class475.anInt5624 = 1710901657 * i;
		anInt8016 = 638834387;
		anInt8016 = 638834387;
		Class89.method1502(1092880618);
	}

	static boolean method13338(Class505 class505, Class282_Sub36 class282_sub36, Class220 class220, int i, int i_121_) {
		int i_122_ = 2147483647;
		int i_123_ = -2147483648;
		int i_124_ = 2147483647;
		int i_125_ = -2147483648;
		if (null != class220.anIntArray2717) {
			i_122_ = ((anInt3476 - anInt3489) * (-1306535747 * class282_sub36.anInt7987 + -195227125 * class220.anInt2747 - anInt3485) / (anInt3480 - anInt3485)) + anInt3489;
			i_123_ = (anInt3489 + ((class220.anInt2731 * -1051190363 + class282_sub36.anInt7987 * -1306535747 - anInt3485) * (anInt3476 - anInt3489) / (anInt3480 - anInt3485)));
			i_125_ = anInt3492 - ((anInt3492 - anInt3490) * (1012301095 * class282_sub36.anInt7993 + class220.anInt2744 * 1104382109 - anInt3465) / (anInt3486 - anInt3465));
			i_124_ = anInt3492 - ((anInt3492 - anInt3490) * (class220.anInt2746 * 1123286327 + class282_sub36.anInt7993 * 1012301095 - anInt3465) / (anInt3486 - anInt3465));
		}
		Class160 class160 = null;
		int i_126_ = 0;
		int i_127_ = 0;
		int i_128_ = 0;
		int i_129_ = 0;
		if (class220.anInt2719 * -1248709255 != -1) {
			if (class282_sub36.aBool7989 && class220.anInt2757 * -992610861 != -1)
				class160 = class220.method3735(class505, true, (byte) 8);
			else
				class160 = class220.method3735(class505, false, (byte) 8);
			if (null != class160) {
				i_126_ = (443215287 * class282_sub36.anInt7990 - (class160.method228() + 1 >> 1));
				if (i_126_ < i_122_)
					i_122_ = i_126_;
				i_127_ = (443215287 * class282_sub36.anInt7990 + (class160.method228() + 1 >> 1));
				if (i_127_ > i_123_)
					i_123_ = i_127_;
				i_128_ = (-904538465 * class282_sub36.anInt7992 - (class160.method2748() + 1 >> 1));
				if (i_128_ < i_124_)
					i_124_ = i_128_;
				i_129_ = (class282_sub36.anInt7992 * -904538465 + (class160.method2748() + 1 >> 1));
				if (i_129_ > i_125_)
					i_125_ = i_129_;
			}
		}
		Class194 class194 = null;
		int i_130_ = 0;
		int i_131_ = 0;
		int i_132_ = 0;
		int i_133_ = 0;
		int i_134_ = 0;
		int i_135_ = 0;
		int i_136_ = 0;
		int i_137_ = 0;
		if (class220.aString2751 != null) {
			class194 = Class286.method5048(class220.anInt2722 * 1172439539, (byte) -40);
			if (null != class194) {
				i_130_ = (Class282_Sub17_Sub2.aClass414_9933.method6987(class220.aString2751, null, aStringArray8024, null, (byte) 0));
				i_131_ = (443215287 * class282_sub36.anInt7990 + (-1153726009 * class220.anInt2750 * (anInt3476 - anInt3489) / (anInt3480 - anInt3485)));
				i_132_ = (class282_sub36.anInt7992 * -904538465 - ((anInt3492 - anInt3490) * (class220.anInt2752 * -1409297307) / (anInt3486 - anInt3465)));
				if (class160 == null)
					i_132_ -= class194.method3186() * i_130_ / 2;
				else
					i_132_ -= ((class160.method2748() >> 1) + class194.method3173() * i_130_);
				for (int i_138_ = 0; i_138_ < i_130_; i_138_++) {
					String string = aStringArray8024[i_138_];
					if (i_138_ < i_130_ - 1)
						string = string.substring(0, string.length() - 4);
					int i_139_ = class194.method3177(string);
					if (i_139_ > i_133_)
						i_133_ = i_139_;
				}
				i_134_ = i_131_ - i_133_ / 2 + i;
				if (i_134_ < i_122_)
					i_122_ = i_134_;
				i_135_ = i_133_ / 2 + i_131_ + i;
				if (i_135_ > i_123_)
					i_123_ = i_135_;
				i_136_ = i_132_ + i_121_;
				if (i_136_ < i_124_)
					i_124_ = i_136_;
				i_137_ = i_132_ + i_130_ * class194.method3173() + i_121_;
				if (i_137_ > i_125_)
					i_125_ = i_137_;
			}
		}
		if (i_123_ < anInt3489 || i_122_ > anInt3476 || i_125_ < anInt3490 || i_124_ > anInt3492)
			return true;
		method5147(class505, class282_sub36, class220);
		if (class160 != null) {
			if (Class361.anInt4185 * 750747217 > 0 && ((-1 != anInt8018 * 2089227969 && (anInt8018 * 2089227969 == class282_sub36.anInt7991 * -1798678621)) || (614736923 * anInt8026 != -1 && (anInt8026 * 614736923 == class220.anInt2718 * 781329827)))) {
				int i_140_;
				if (896422831 * Class96_Sub9.anInt9282 > 50)
					i_140_ = 200 - Class96_Sub9.anInt9282 * 1792845662;
				else
					i_140_ = Class96_Sub9.anInt9282 * 1792845662;
				int i_141_ = i_140_ << 24 | 0xffff00;
				class505.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, class160.method2747() / 2 + 7, i_141_, -1366981179);
				class505.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, class160.method2747() / 2 + 5, i_141_, -670369966);
				class505.method8468(443215287 * class282_sub36.anInt7990, class282_sub36.anInt7992 * -904538465, class160.method2747() / 2 + 3, i_141_, -611919376);
				class505.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, class160.method2747() / 2 + 1, i_141_, 1475840415);
				class505.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, class160.method2747() / 2, i_141_, 557580778);
			}
			class160.method2752((443215287 * class282_sub36.anInt7990 - (class160.method228() >> 1)), (-904538465 * class282_sub36.anInt7992 - (class160.method2748() >> 1)));
		}
		if (class220.aString2751 != null && class194 != null)
			Class392.method6739(class505, class282_sub36, class220, i_130_, i_131_, i_132_, i_133_, class194, (byte) -39);
		if (-1248709255 * class220.anInt2719 != -1 || class220.aString2751 != null) {
			Class282_Sub33 class282_sub33 = new Class282_Sub33(class282_sub36);
			((Class282_Sub33) class282_sub33).anInt7830 = i_126_ * -925812333;
			((Class282_Sub33) class282_sub33).anInt7828 = i_127_ * 1303174651;
			((Class282_Sub33) class282_sub33).anInt7834 = i_128_ * -1854557465;
			((Class282_Sub33) class282_sub33).anInt7833 = -724182681 * i_129_;
			((Class282_Sub33) class282_sub33).anInt7829 = i_134_ * -1447464913;
			((Class282_Sub33) class282_sub33).anInt7832 = -705732785 * i_135_;
			((Class282_Sub33) class282_sub33).anInt7831 = -2064740419 * i_136_;
			((Class282_Sub33) class282_sub33).anInt7827 = -719287379 * i_137_;
			Class346.aClass482_4049.method8059(class282_sub33, 936128341);
		}
		return false;
	}

	public static void method13339(int i) {
		if (37 == i)
			aFloat3462 = 3.0F;
		else if (50 == i)
			aFloat3462 = 4.0F;
		else if (i == 75)
			aFloat3462 = 6.0F;
		else if (i == 100)
			aFloat3462 = 8.0F;
		else if (i == 200)
			aFloat3462 = 16.0F;
		anInt8016 = 638834387;
		anInt8016 = 638834387;
	}

	public static void method13340(int i) {
		if (37 == i)
			aFloat3462 = 3.0F;
		else if (50 == i)
			aFloat3462 = 4.0F;
		else if (i == 75)
			aFloat3462 = 6.0F;
		else if (i == 100)
			aFloat3462 = 8.0F;
		else if (i == 200)
			aFloat3462 = 16.0F;
		anInt8016 = 638834387;
		anInt8016 = 638834387;
	}

	public static void method13341(int i) {
		if (37 == i)
			aFloat3462 = 3.0F;
		else if (50 == i)
			aFloat3462 = 4.0F;
		else if (i == 75)
			aFloat3462 = 6.0F;
		else if (i == 100)
			aFloat3462 = 8.0F;
		else if (i == 200)
			aFloat3462 = 16.0F;
		anInt8016 = 638834387;
		anInt8016 = 638834387;
	}

	static void method13342() {
		if (Class427.anInt5123 * -861975801 < 0) {
			Class427.anInt5123 = 0;
			anInt8014 = -1089992553;
			anInt8016 = 638834387;
		}
		if (Class427.anInt5123 * -861975801 > anInt3474) {
			Class427.anInt5123 = 1714827959 * anInt3474;
			anInt8014 = -1089992553;
			anInt8016 = 638834387;
		}
		if (483850921 * Class475.anInt5624 < 0) {
			Class475.anInt5624 = 0;
			anInt8014 = -1089992553;
			anInt8016 = 638834387;
		}
		if (Class475.anInt5624 * 483850921 > anInt3483) {
			Class475.anInt5624 = anInt3483 * 1710901657;
			anInt8014 = -1089992553;
			anInt8016 = 638834387;
		}
	}

	public static void method13343(int i, int i_142_, int i_143_, boolean bool) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-694270175) != 0) {
			anInt8021 = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1925232665) * 923733999;
			Class538.method11500(0, true, (byte) 24);
		} else
			Class122.method2111(false, 662490589);
		anInt8019 = 776800459 * i_142_;
		anInt8020 = i_143_ * 611890095;
		aBool8028 = bool;
		method5128(i);
	}

	public static void method13344(int i) {
		anInt8018 = 428705471;
		anInt8026 = i * 194319891;
		Class361.anInt4185 = 413638675;
		Class96_Sub9.anInt9282 = -1386689828;
	}

	static void method13345(int i, int i_144_, int i_145_, int i_146_) {
		float f = (float) anInt3483 / (float) anInt3474;
		int i_147_ = i_145_;
		int i_148_ = i_146_;
		if (f < 1.0F)
			i_148_ = (int) ((float) i_145_ * f);
		else
			i_147_ = (int) ((float) i_146_ / f);
		i -= (i_145_ - i_147_) / 2;
		i_144_ -= (i_146_ - i_148_) / 2;
		Class427.anInt5123 = anInt3474 * i / i_147_ * 1714827959;
		Class475.anInt5624 = 1710901657 * (anInt3483 - anInt3483 * i_144_ / i_148_);
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class89.method1502(-247570689);
	}

	static void method13346(int i, int i_149_, int i_150_, int i_151_) {
		float f = (float) anInt3483 / (float) anInt3474;
		int i_152_ = i_150_;
		int i_153_ = i_151_;
		if (f < 1.0F)
			i_153_ = (int) ((float) i_150_ * f);
		else
			i_152_ = (int) ((float) i_151_ / f);
		i -= (i_150_ - i_152_) / 2;
		i_149_ -= (i_151_ - i_153_) / 2;
		Class427.anInt5123 = anInt3474 * i / i_152_ * 1714827959;
		Class475.anInt5624 = 1710901657 * (anInt3483 - anInt3483 * i_149_ / i_153_);
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class89.method1502(-517918369);
	}

	public static Class282_Sub36 method13347() {
		if (null == aClass482_3459 || aClass460_8030 == null)
			return null;
		aClass460_8030.method7684(aClass482_3459, (byte) 50);
		Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass460_8030.method7683(1784386249);
		if (null == class282_sub36)
			return null;
		Class220 class220 = aClass218_3456.method3700(class282_sub36.anInt7991 * -1798678621, 532257404);
		if (null == class220 || !class220.aBool2742 || !class220.method3719(anInterface42_3458, 1090280173))
			return Class540.method11595(-767348599);
		return class282_sub36;
	}

	public static int method13348() {
		if ((double) aFloat3462 == 3.0)
			return 37;
		if ((double) aFloat3462 == 4.0)
			return 50;
		if (6.0 == (double) aFloat3462)
			return 75;
		if ((double) aFloat3462 == 8.0)
			return 100;
		return 200;
	}

	public static Class282_Sub36 method13349() {
		if (aClass482_3459 == null || null == aClass460_8030)
			return null;
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass460_8030.next(); class282_sub36 != null; class282_sub36 = (Class282_Sub36) aClass460_8030.next()) {
			Class220 class220 = aClass218_3456.method3700((class282_sub36.anInt7991 * -1798678621), 1303883312);
			if (null != class220 && class220.aBool2742 && class220.method3719(anInterface42_3458, -218046035))
				return class282_sub36;
		}
		return null;
	}

	static void method13350(int i, int i_154_, int i_155_, int i_156_) {
		float f = (float) anInt3483 / (float) anInt3474;
		int i_157_ = i_155_;
		int i_158_ = i_156_;
		if (f < 1.0F)
			i_158_ = (int) ((float) i_155_ * f);
		else
			i_157_ = (int) ((float) i_156_ / f);
		i -= (i_155_ - i_157_) / 2;
		i_154_ -= (i_156_ - i_158_) / 2;
		Class427.anInt5123 = anInt3474 * i / i_157_ * 1714827959;
		Class475.anInt5624 = 1710901657 * (anInt3483 - anInt3483 * i_154_ / i_158_);
		anInt8014 = -1089992553;
		anInt8016 = 638834387;
		Class89.method1502(985610154);
	}

	public static void method13351(int i) {
		anInt8018 = 428705471;
		anInt8026 = i * 194319891;
		Class361.anInt4185 = 413638675;
		Class96_Sub9.anInt9282 = -1386689828;
	}

	public static int method13352(int i, int i_159_, int i_160_) {
		if (anInt8015 * -8084891 < 100)
			return -2;
		int i_161_ = -2;
		int i_162_ = 2147483647;
		int i_163_ = i_159_ - anInt3472;
		int i_164_ = i_160_ - anInt3473;
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass482_3459.method8097((byte) 119); class282_sub36 != null; class282_sub36 = (Class282_Sub36) aClass482_3459.method8067(1936309936)) {
			if (i == class282_sub36.anInt7991 * -1798678621) {
				int i_165_ = class282_sub36.anInt7987 * -1306535747;
				int i_166_ = 1012301095 * class282_sub36.anInt7993;
				int i_167_ = anInt3472 + i_165_ << 14 | anInt3473 + i_166_;
				int i_168_ = ((i_163_ - i_165_) * (i_163_ - i_165_) + (i_164_ - i_166_) * (i_164_ - i_166_));
				if (i_161_ < 0 || i_168_ < i_162_) {
					i_161_ = i_167_;
					i_162_ = i_168_;
				}
			}
		}
		return i_161_;
	}

	public static int method13353(int i, int i_169_, int i_170_) {
		if (anInt8015 * -8084891 < 100)
			return -2;
		int i_171_ = -2;
		int i_172_ = 2147483647;
		int i_173_ = i_169_ - anInt3472;
		int i_174_ = i_170_ - anInt3473;
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) aClass482_3459.method8097((byte) 40); class282_sub36 != null; class282_sub36 = (Class282_Sub36) aClass482_3459.method8067(1331296194)) {
			if (i == class282_sub36.anInt7991 * -1798678621) {
				int i_175_ = class282_sub36.anInt7987 * -1306535747;
				int i_176_ = 1012301095 * class282_sub36.anInt7993;
				int i_177_ = anInt3472 + i_175_ << 14 | anInt3473 + i_176_;
				int i_178_ = ((i_173_ - i_175_) * (i_173_ - i_175_) + (i_174_ - i_176_) * (i_174_ - i_176_));
				if (i_171_ < 0 || i_178_ < i_172_) {
					i_171_ = i_177_;
					i_172_ = i_178_;
				}
			}
		}
		return i_171_;
	}

	public static void method13354() {
		if (-1 != Class51.anInt488 * -1437926185) {
			Class515.method8862(Class51.anInt488 * -1437926185, -1, -1, false, -1732540658);
			Class51.anInt488 = 562841881;
		}
	}

	static void method13355(Class505 class505, Class282_Sub36 class282_sub36, Class220 class220, int i, int i_179_, int i_180_, int i_181_, Class194 class194) {
		int i_182_ = i_179_ - i_181_ / 2 - 5;
		int i_183_ = 2 + i_180_;
		if (0 != class220.anInt2726 * 1903100449)
			class505.method8425(i_182_, i_183_, i_181_ + 10, (i_180_ + i * class194.method3173() - i_183_ + 1), class220.anInt2726 * 1903100449, (byte) -88);
		if (0 != class220.anInt2727 * 1542243419)
			class505.method8562(i_182_, i_183_, 10 + i_181_, (i_180_ + i * class194.method3173() - i_183_ + 1), 1542243419 * class220.anInt2727, (byte) 4);
		int i_184_ = -2116785903 * class220.anInt2720;
		if (class282_sub36.aBool7989 && -1 != -1748609101 * class220.anInt2721)
			i_184_ = -1748609101 * class220.anInt2721;
		for (int i_185_ = 0; i_185_ < i; i_185_++) {
			String string = aStringArray8024[i_185_];
			if (i_185_ < i - 1)
				string = string.substring(0, string.length() - 4);
			class194.method3178(class505, string, i_179_, i_180_, i_184_, true);
			i_180_ += class194.method3173();
		}
	}

	static void method13356(Class505 class505, Class282_Sub36 class282_sub36, Class220 class220) {
		Class160 class160 = class220.method3729(class505, 55776280);
		if (class160 != null) {
			int i = class160.method2747();
			if (class160.method2793() > i)
				i = class160.method2793();
			int i_186_ = 10;
			int i_187_ = class282_sub36.anInt7990 * 443215287;
			int i_188_ = -904538465 * class282_sub36.anInt7992;
			int i_189_ = 0;
			int i_190_ = 0;
			int i_191_ = 0;
			if (null != class220.aString2751) {
				i_189_ = (Class282_Sub17_Sub2.aClass414_9933.method6987(class220.aString2751, null, aStringArray8024, null, (byte) 0));
				for (int i_192_ = 0; i_192_ < i_189_; i_192_++) {
					String string = aStringArray8024[i_192_];
					if (i_192_ < i_189_ - 1)
						string = string.substring(0, string.length() - 4);
					int i_193_ = aClass194_8023.method3177(string);
					if (i_193_ > i_190_)
						i_190_ = i_193_;
				}
				i_191_ = (aClass194_8023.method3173() * i_189_ + aClass194_8023.method3186() / 2);
			}
			int i_194_ = i / 2 + class282_sub36.anInt7990 * 443215287;
			int i_195_ = -904538465 * class282_sub36.anInt7992;
			if (i_187_ < i + anInt3489) {
				i_187_ = anInt3489;
				i_194_ = i / 2 + anInt3489 + i_186_ + i_190_ / 2 + 5;
			} else if (i_187_ > anInt3476 - i) {
				i_187_ = anInt3476 - i;
				i_194_ = anInt3476 - i / 2 - i_186_ - i_190_ / 2 - 5;
			}
			if (i_188_ < i + anInt3490) {
				i_188_ = anInt3490;
				i_195_ = i / 2 + (anInt3490 + i_186_);
			} else if (i_188_ > anInt3492 - i) {
				i_188_ = anInt3492 - i;
				i_195_ = anInt3492 - i / 2 - i_186_ - i_191_;
			}
			int i_196_ = ((int) (Math.atan2((double) (i_187_ - (class282_sub36.anInt7990 * 443215287)), (double) (i_188_ - (class282_sub36.anInt7992 * -904538465))) / 3.141592653589793 * 32767.0) & 0xffff);
			class160.method2758((float) i_187_ + (float) i / 2.0F, (float) i / 2.0F + (float) i_188_, 4096, i_196_);
			int i_197_ = -2;
			int i_198_ = -2;
			int i_199_ = -2;
			int i_200_ = -2;
			if (class220.aString2751 != null) {
				i_197_ = i_194_ - i_190_ / 2 - 5;
				i_198_ = i_195_;
				i_199_ = i_197_ + i_190_ + 10;
				i_200_ = i_198_ + aClass194_8023.method3173() * i_189_ + 3;
				if (class220.anInt2726 * 1903100449 != 0)
					class505.method8425(i_197_, i_198_, i_199_ - i_197_, i_200_ - i_198_, class220.anInt2726 * 1903100449, (byte) -72);
				if (class220.anInt2727 * 1542243419 != 0)
					class505.method8562(i_197_, i_198_, i_199_ - i_197_, i_200_ - i_198_, class220.anInt2727 * 1542243419, (byte) 4);
				for (int i_201_ = 0; i_201_ < i_189_; i_201_++) {
					String string = aStringArray8024[i_201_];
					if (i_201_ < i_189_ - 1)
						string = string.substring(0, string.length() - 4);
					aClass194_8023.method3178(class505, string, i_194_, i_195_, class220.anInt2720 * -2116785903, true);
					i_195_ += aClass194_8023.method3173();
				}
			}
			if (-1 != -1248709255 * class220.anInt2719 || class220.aString2751 != null) {
				Class282_Sub33 class282_sub33 = new Class282_Sub33(class282_sub36);
				i >>= 1;
				((Class282_Sub33) class282_sub33).anInt7830 = -925812333 * (i_187_ - i);
				((Class282_Sub33) class282_sub33).anInt7828 = (i_187_ + i) * 1303174651;
				((Class282_Sub33) class282_sub33).anInt7834 = (i_188_ - i) * -1854557465;
				((Class282_Sub33) class282_sub33).anInt7833 = -724182681 * (i + i_188_);
				((Class282_Sub33) class282_sub33).anInt7829 = -1447464913 * i_197_;
				((Class282_Sub33) class282_sub33).anInt7832 = -705732785 * i_199_;
				((Class282_Sub33) class282_sub33).anInt7831 = i_198_ * -2064740419;
				((Class282_Sub33) class282_sub33).anInt7827 = -719287379 * i_200_;
				Class346.aClass482_4049.method8059(class282_sub33, -278662650);
			}
		}
	}

	public static void method13357(int i, int i_202_) {
		anInt8014 = (i - anInt3472) * 1089992553;
		anInt8016 = (i_202_ - anInt3473) * -638834387;
	}

	static void method13358(int i) {
		Class475.anInt5624 = 1710901657 * i;
		anInt8016 = 638834387;
		anInt8016 = 638834387;
		Class89.method1502(-331615435);
	}

	static final void method13359(CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		boolean bool = Class308.aclient3620.method4658(new File(string), -576964244);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}
}
