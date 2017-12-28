/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class40 {
	int[] anIntArray410;
	static Class523 aClass523_411;
	public static Class317 aClass317_412;

	public int method864(int i) {
		int i_0_ = (((Class40) this).anIntArray410.length >> 1) - 1;
		int i_1_ = i & i_0_;
		for (;;) {
			int i_2_ = ((Class40) this).anIntArray410[1 + (i_1_ + i_1_)];
			if (i_2_ == -1)
				return -1;
			if (i == ((Class40) this).anIntArray410[i_1_ + i_1_])
				return i_2_;
			i_1_ = 1 + i_1_ & i_0_;
		}
	}

	public int method865(int i, int i_3_) {
		int i_4_ = (((Class40) this).anIntArray410.length >> 1) - 1;
		int i_5_ = i & i_4_;
		for (;;) {
			int i_6_ = ((Class40) this).anIntArray410[1 + (i_5_ + i_5_)];
			if (i_6_ == -1)
				return -1;
			if (i == ((Class40) this).anIntArray410[i_5_ + i_5_])
				return i_6_;
			i_5_ = 1 + i_5_ & i_4_;
		}
	}

	public int method866(int i) {
		int i_7_ = (((Class40) this).anIntArray410.length >> 1) - 1;
		int i_8_ = i & i_7_;
		for (;;) {
			int i_9_ = ((Class40) this).anIntArray410[1 + (i_8_ + i_8_)];
			if (i_9_ == -1)
				return -1;
			if (i == ((Class40) this).anIntArray410[i_8_ + i_8_])
				return i_9_;
			i_8_ = 1 + i_8_ & i_7_;
		}
	}

	public Class40(int[] is) {
		int i;
		for (i = 1; i <= (is.length >> 1) + is.length; i <<= 1) {
			/* empty */
		}
		((Class40) this).anIntArray410 = new int[i + i];
		for (int i_10_ = 0; i_10_ < i + i; i_10_++)
			((Class40) this).anIntArray410[i_10_] = -1;
		for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
			int i_12_;
			for (i_12_ = is[i_11_] & i - 1; -1 != ((Class40) this).anIntArray410[1 + (i_12_ + i_12_)]; i_12_ = i_12_ + 1 & i - 1) {
				/* empty */
			}
			((Class40) this).anIntArray410[i_12_ + i_12_] = is[i_11_];
			((Class40) this).anIntArray410[1 + (i_12_ + i_12_)] = i_11_;
		}
	}

	public static Class279 method867(int i) {
		return Class263.aClass279_3267;
	}

	static void method868(Class527 class527, byte i) {
		Class240 class240 = Class409.aClass242_4922.method4156((((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 -= 141891001) * 1942118537)]), -1396181317);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = (null == class240.anIntArray2961 ? 0 : class240.anIntArray2961.length);
	}

	static final void method869(Class118 class118, Class98 class98, Class527 class527, int i) {
		int i_13_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		if (-281434611 * Class118.anInt1283 == i_13_ || i_13_ == -85967273 * Class118.anInt1373 || Class118.anInt1265 * -1267941319 == i_13_)
			class118.anInt1382 = i_13_ * -1316583121;
	}

	static final void method870(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 425673003;
		int i_14_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]);
		int i_15_ = (((Class527) class527).anIntArray6999[1 + 1942118537 * ((Class527) class527).anInt7012]);
		int i_16_ = (((Class527) class527).anIntArray6999[2 + ((Class527) class527).anInt7012 * 1942118537]);
		Class118 class118 = Class117.method1981(i_16_, (byte) 9);
		Class282_Sub14.method12221(class118, i_14_, i_15_, 1698123949);
	}

	static final void method871(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_17_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]);
		int i_18_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012 + 1]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_17_ + i_18_;
	}
}
