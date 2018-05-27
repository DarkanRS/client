
/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public abstract class Class468 {
	protected static final int anInt5577 = 2;
	protected int anInt5578;
	public static final int anInt5579 = 3;
	protected static final int anInt5580 = 1;
	protected Class282_Sub54 aClass282_Sub54_5581;

	Class468(int i, Class282_Sub54 class282_sub54) {
		anInt5578 = -754033619 * i;
		aClass282_Sub54_5581 = class282_sub54;
	}

	abstract void method7780(int i);

	Class468(Class282_Sub54 class282_sub54) {
		aClass282_Sub54_5581 = class282_sub54;
		anInt5578 = method7781(1882816731) * -754033619;
	}

	abstract int method7781(int i);

	void method7782(int i, byte i_0_) {
		if (method7785(i, 594235257) != 3) {
			if (i_0_ > 13)
				method7783(i, -663969344);
		}
	}

	abstract void method7783(int i, int i_1_);

	abstract int method7784(int i);

	abstract int method7785(int i, int i_2_);

	abstract int method7786();

	abstract int method7787();

	public static String method7788(long l, int i, boolean bool, int i_3_) {
		Calendar calendar;
		if (bool) {
			Class288.method5083(l);
			calendar = Class407.aCalendar4846;
		} else {
			Class155.method2634(l);
			calendar = Class407.aCalendar4848;
		}
		int i_4_ = calendar.get(5);
		int i_5_ = calendar.get(2);
		int i_6_ = calendar.get(1);
		int i_7_ = calendar.get(11);
		int i_8_ = calendar.get(12);
		if (i == 3)
			return Class450.method7499(l, i, bool, 1558223183);
		return new StringBuilder().append(Integer.toString(i_4_ / 10)).append(i_4_ % 10).append("-").append(Class407.aStringArrayArray4849[i][i_5_]).append("-").append(i_6_).append(" ").append(i_7_ / 10).append(i_7_ % 10).append(":").append(i_8_ / 10).append(i_8_ % 10).toString();
	}

	static void method7789(int i) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub3_8199.method12632(84527156) == 1)
			IndexLoaders.MAP_REGION_LOADER_THREAD.method6049(new Class335((Class256.aClass256_3152), null), 301123709);
		else {
			IndexLoaders.MAP_REGION_DECODER.method4547((byte) -107);
			Class58.method1139(-1771275616);
		}
	}
}
