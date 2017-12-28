
/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class373 {
	public static final int anInt4329 = 2;
	public static final int anInt4330 = 1;
	public static final int anInt4331 = 45;
	public static final int anInt4332 = 3;
	public static final int anInt4333 = 4;
	public static final int anInt4334 = 6;
	public static final int anInt4335 = 5;
	public static final int anInt4336 = 7;
	public static final int anInt4337 = 42;
	public static final int anInt4338 = 17;
	public static final int anInt4339 = 18;
	public static final int anInt4340 = 19;
	public static final int anInt4341 = 20;
	public static final int anInt4342 = 24;
	public static final int anInt4343 = 25;
	public static final int anInt4344 = 41;
	public static final int anInt4345 = 44;
	public static final int anInt4346 = 9;
	public static final int anInt4347 = 0;
	public static final int anInt4348 = 98;
	public static final int anInt4349 = 99;
	public static int anInt4350;

	Class373() throws Throwable {
		throw new Error();
	}

	static final void method6363(Class527 class527, int i) {
		int i_0_ = (((Class527) class527).anIntArray7018[301123709 * ((Class527) class527).anInt7020]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class158_Sub1.aClass3_8507.anIntArray26[i_0_];
	}

	static final void method6364(Class527 class527, int i) {
		Class513 class513 = (((Class527) class527).aBool7022 ? ((Class527) class527).aClass513_6994 : ((Class527) class527).aClass513_7007);
		Class118 class118 = ((Class513) class513).aClass118_5886;
		Class98 class98 = ((Class513) class513).aClass98_5885;
		Class249.method4276(class118, class98, class527, 175430076);
	}

	static void method6365(int i) {
		synchronized (Class236.aQueue2914) {
			Point point;
			if (Class351.aCanvas4096.isShowing())
				point = Class351.aCanvas4096.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class282_Sub53_Sub1 class282_sub53_sub1 = (Class282_Sub53_Sub1) Class236.aQueue2914.poll();
				if (null == class282_sub53_sub1)
					break;
				if (point == null || !Class351.aCanvas4096.isShowing() || !Class530.aBool7050)
					class282_sub53_sub1.method13475(665742059);
				else {
					class282_sub53_sub1.method14732(point, -1545161336);
					if (!class282_sub53_sub1.method14731(-1966919184) && (class282_sub53_sub1.method13481(1700591909) < -418109423 * Class349.anInt4083) && (class282_sub53_sub1.method13469(1495235000) < Class263.anInt3243 * -969250379) && class282_sub53_sub1.method13481(1815146840) >= 0 && class282_sub53_sub1.method13469(-1984385021) >= 0) {
						int i_1_ = class282_sub53_sub1.method13470(1166516765);
						if (class282_sub53_sub1.method13470(1107239769) == -1)
							Class236.aClass534_Sub1_2913.method11410(class282_sub53_sub1, (byte) 24);
						else if (Class298.method5304(i_1_, -1867456508))
							Class236.aClass534_Sub1_2913.method12809(class282_sub53_sub1, 16711935);
					}
				}
			}
		}
	}
}
