/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class273 {
	public static Class317 aClass317_3332;

	Class273() {
		/* empty */
	}

	final int method4842(long l) {
		long l_0_ = method4844(-1314444349);
		if (l_0_ > 0L)
			Class89.method1504(l_0_);
		return method4845(l);
	}

	final int method4843(long l) {
		long l_1_ = method4844(-1646039614);
		if (l_1_ > 0L)
			Class89.method1504(l_1_);
		return method4845(l);
	}

	abstract long method4844(int i);

	abstract int method4845(long l);

	abstract long method4846();

	abstract void method4847();

	abstract void method4848();

	abstract void method4849();

	final int method4850(long l) {
		long l_2_ = method4844(-1587927843);
		if (l_2_ > 0L)
			Class89.method1504(l_2_);
		return method4845(l);
	}

	abstract long method4851();

	abstract long method4852(int i);

	abstract void method4853(int i);

	abstract int method4854(long l);

	abstract void method4855();

	abstract long method4856();

	abstract long method4857();

	public static Class273 method4858() {
		Class273_Sub1 class273_sub1;
		try {
			class273_sub1 = new Class273_Sub1();
		} catch (Throwable throwable) {
			return new Class273_Sub2();
		}
		return class273_sub1;
	}

	public static Class273 method4859() {
		Class273_Sub1 class273_sub1;
		try {
			class273_sub1 = new Class273_Sub1();
		} catch (Throwable throwable) {
			return new Class273_Sub2();
		}
		return class273_sub1;
	}

	public static Class273 method4860() {
		Class273_Sub1 class273_sub1;
		try {
			class273_sub1 = new Class273_Sub1();
		} catch (Throwable throwable) {
			return new Class273_Sub2();
		}
		return class273_sub1;
	}

	abstract long method4861();

	abstract int method4862(long l);

	static final void method4863(CS2Executor class527, int i) {
		int i_3_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_3_, (byte) 84);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_3_ >> 16];
		Class322.method5763(class118, class98, class527, 258036500);
	}

	static final void method4864(CS2Executor class527, int i) {
		int i_4_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_4_, (byte) 65);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_4_ >> 16];
		Class282_Sub21_Sub1.method15474(class118, class98, class527, (byte) 126);
	}

	static final void method4865(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class88.method1494(class118, class527, (byte) -2);
	}

	static final void method4866(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		int i_9_ = 0;
		int i_10_ = i_6_;
		int i_11_ = -i_6_;
		int i_12_ = -1;
		int i_13_ = Class275.method4890(i_6_ + i, Class532_Sub3.anInt7071 * -612590951, -1345107225 * Class532_Sub3.anInt7069, 1924648188);
		int i_14_ = Class275.method4890(i - i_6_, Class532_Sub3.anInt7071 * -612590951, Class532_Sub3.anInt7069 * -1345107225, -788658237);
		Class232.method3922(Class532_Sub3.anIntArrayArray7072[i_5_], i_14_, i_13_, i_7_, (byte) 93);
		while (i_10_ > i_9_) {
			i_12_ += 2;
			i_11_ += i_12_;
			if (i_11_ > 0) {
				i_10_--;
				i_11_ -= i_10_ << 1;
				int i_15_ = i_5_ - i_10_;
				int i_16_ = i_5_ + i_10_;
				if (i_16_ >= Class532_Sub3.anInt7070 * 324226563 && i_15_ <= -348932735 * Class532_Sub3.anInt7068) {
					int i_17_ = Class275.method4890(i + i_9_, (Class532_Sub3.anInt7071 * -612590951), (-1345107225 * Class532_Sub3.anInt7069), 1327047739);
					int i_18_ = Class275.method4890(i - i_9_, (Class532_Sub3.anInt7071 * -612590951), (Class532_Sub3.anInt7069 * -1345107225), -517752975);
					if (i_16_ <= -348932735 * Class532_Sub3.anInt7068)
						Class232.method3922((Class532_Sub3.anIntArrayArray7072[i_16_]), i_18_, i_17_, i_7_, (byte) 2);
					if (i_15_ >= Class532_Sub3.anInt7070 * 324226563)
						Class232.method3922((Class532_Sub3.anIntArrayArray7072[i_15_]), i_18_, i_17_, i_7_, (byte) 33);
				}
			}
			i_9_++;
			int i_19_ = i_5_ - i_9_;
			int i_20_ = i_9_ + i_5_;
			if (i_20_ >= Class532_Sub3.anInt7070 * 324226563 && i_19_ <= -348932735 * Class532_Sub3.anInt7068) {
				int i_21_ = Class275.method4890(i + i_10_, -612590951 * Class532_Sub3.anInt7071, (-1345107225 * Class532_Sub3.anInt7069), 791943703);
				int i_22_ = Class275.method4890(i - i_10_, Class532_Sub3.anInt7071 * -612590951, (Class532_Sub3.anInt7069 * -1345107225), -428444970);
				if (i_20_ <= Class532_Sub3.anInt7068 * -348932735)
					Class232.method3922((Class532_Sub3.anIntArrayArray7072[i_20_]), i_22_, i_21_, i_7_, (byte) 8);
				if (i_19_ >= 324226563 * Class532_Sub3.anInt7070)
					Class232.method3922((Class532_Sub3.anIntArrayArray7072[i_19_]), i_22_, i_21_, i_7_, (byte) 60);
			}
		}
	}

	static final void method4867(CS2Executor class527, int i) {
		int i_23_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method7785(i_23_, -1905006369);
	}
}
