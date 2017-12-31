
/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class235 {
	static List aList2896;
	static Class275_Sub1_Sub1_Sub1[] aClass275_Sub1_Sub1_Sub1Array2897;
	static int anInt2898;
	static int anInt2899;
	static int anInt2900;
	static int anInt2901;
	static int anInt2902 = 0;
	static int anInt2903;
	static SwitchMap aClass465_2904;
	static int anInt2905 = 0;
	static int anInt2906;
	public static Class317 aClass317_2907;
	public static Class317 aClass317_2908;

	static {
		anInt2899 = 0;
		anInt2901 = 0;
		anInt2900 = 0;
		anInt2903 = 0;
		aClass465_2904 = new SwitchMap(8);
		anInt2898 = 0;
		anInt2906 = -1724422502;
	}

	public static void method3954(Class505 class505, long l) {
		anInt2903 = 417412323 * anInt2900;
		anInt2900 = 0;
		Class169.method2869(1983904938);
		Iterator iterator = aList2896.iterator();
		while (iterator.hasNext()) {
			Class539 class539 = (Class539) iterator.next();
			boolean bool = class539.method11509(class505, l);
			if (!bool) {
				iterator.remove();
				Class477.aClass539Array5632[1765973211 * anInt2901] = class539;
				anInt2901 = 55312211 * (1 + anInt2901 * 1765973211 & (Class89.anIntArray931[-391332475 * anInt2906]));
			}
		}
	}

	public static void method3955(Class317 class317) {
		anInt2902 = 0;
		anInt2905 = 0;
		aList2896 = new LinkedList();
		aClass275_Sub1_Sub1_Sub1Array2897 = new Class275_Sub1_Sub1_Sub1[1024];
		Class477.aClass539Array5632 = new Class539[Class89.anIntArray931[anInt2906 * -391332475] + 1];
		anInt2899 = 0;
		anInt2901 = 0;
		Class282_Sub20_Sub22.method15388(class317, (byte) -112);
		Class111.method1866(class317, -1606791164);
	}

	public static void method3956(int i) {
		if (i < 0 || i > 2)
			i = 0;
		anInt2906 = 1285272397 * i;
		Class477.aClass539Array5632 = new Class539[1 + Class89.anIntArray931[-391332475 * anInt2906]];
		anInt2899 = 0;
		anInt2901 = 0;
	}

	public static void method3957(Class505 class505, long l) {
		anInt2903 = 417412323 * anInt2900;
		anInt2900 = 0;
		Class169.method2869(1997386328);
		Iterator iterator = aList2896.iterator();
		while (iterator.hasNext()) {
			Class539 class539 = (Class539) iterator.next();
			boolean bool = class539.method11509(class505, l);
			if (!bool) {
				iterator.remove();
				Class477.aClass539Array5632[1765973211 * anInt2901] = class539;
				anInt2901 = 55312211 * (1 + anInt2901 * 1765973211 & (Class89.anIntArray931[-391332475 * anInt2906]));
			}
		}
	}

	public static void method3958(Class505 class505, long l) {
		anInt2903 = 417412323 * anInt2900;
		anInt2900 = 0;
		Class169.method2869(1635830678);
		Iterator iterator = aList2896.iterator();
		while (iterator.hasNext()) {
			Class539 class539 = (Class539) iterator.next();
			boolean bool = class539.method11509(class505, l);
			if (!bool) {
				iterator.remove();
				Class477.aClass539Array5632[1765973211 * anInt2901] = class539;
				anInt2901 = 55312211 * (1 + anInt2901 * 1765973211 & (Class89.anIntArray931[-391332475 * anInt2906]));
			}
		}
	}

	public static void method3959(Class206 class206, Class505 class505) {
		Iterator iterator = aList2896.iterator();
		while (iterator.hasNext()) {
			Class539 class539 = (Class539) iterator.next();
			if (((Class539) class539).aBool7130)
				class539.method11516(class206, class505);
		}
	}

	public static void method3960() {
		aClass465_2904 = new SwitchMap(8);
		anInt2898 = 0;
		Iterator iterator = aList2896.iterator();
		while (iterator.hasNext()) {
			Class539 class539 = (Class539) iterator.next();
			class539.method11506();
		}
	}

	public static void method3961(int i) {
		if (i < 0 || i > 2)
			i = 0;
		anInt2906 = 1285272397 * i;
		Class477.aClass539Array5632 = new Class539[1 + Class89.anIntArray931[-391332475 * anInt2906]];
		anInt2899 = 0;
		anInt2901 = 0;
	}

	Class235() throws Throwable {
		throw new Error();
	}

	public static int method3962() {
		return -391332475 * anInt2906;
	}

	public static int method3963() {
		return -391332475 * anInt2906;
	}

	public static int method3964() {
		return -391332475 * anInt2906;
	}

	static final void method3965(Class118 class118, CS2Executor class527, int i) {
		Class414 class414 = class118.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i_0_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		int i_1_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		int i_2_ = class414.method6956(class118.aString1391, 1506818197 * class118.anInt1301, -753644021 * class118.anInt1358, i_1_, i_0_, Class182.aClass160Array2261, 1449374266);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_2_;
	}

	static final void method3966(CS2Executor class527, int i) {
		if (client.aString7426 != null)
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = Class285.method5025(client.aString7426, 2091594482);
		else
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	static int method3967(int i, int i_3_, int i_4_) {
		if (1109376893 * Class458.aClass458_5493.anInt5481 == i || Class458.aClass458_5473.anInt5481 * 1109376893 == i)
			return Class521_Sub1_Sub5_Sub1.anIntArray10518[i_3_ & 0x3];
		return Class521_Sub1_Sub5_Sub1.anIntArray10522[i_3_ & 0x3];
	}
}
