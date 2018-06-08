/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class5 {
	static int[] anIntArray36;

	static void method293() {
		/* empty */
	}

	Class5() throws Throwable {
		throw new Error();
	}

	public static int method294(int i, byte i_0_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_1_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_2_ = (double) (i & 0xff) / 256.0;
		double d_3_ = d;
		if (d_1_ < d_3_)
			d_3_ = d_1_;
		if (d_2_ < d_3_)
			d_3_ = d_2_;
		double d_4_ = d;
		if (d_1_ > d_4_)
			d_4_ = d_1_;
		if (d_2_ > d_4_)
			d_4_ = d_2_;
		double d_5_ = 0.0;
		double d_6_ = 0.0;
		double d_7_ = (d_4_ + d_3_) / 2.0;
		if (d_4_ != d_3_) {
			if (d_7_ < 0.5)
				d_6_ = (d_4_ - d_3_) / (d_3_ + d_4_);
			if (d_7_ >= 0.5)
				d_6_ = (d_4_ - d_3_) / (2.0 - d_4_ - d_3_);
			if (d == d_4_)
				d_5_ = (d_1_ - d_2_) / (d_4_ - d_3_);
			else if (d_1_ == d_4_)
				d_5_ = 2.0 + (d_2_ - d) / (d_4_ - d_3_);
			else if (d_4_ == d_2_)
				d_5_ = 4.0 + (d - d_1_) / (d_4_ - d_3_);
		}
		d_5_ /= 6.0;
		int i_8_ = (int) (256.0 * d_5_);
		int i_9_ = (int) (d_6_ * 256.0);
		int i_10_ = (int) (d_7_ * 256.0);
		if (i_9_ < 0)
			i_9_ = 0;
		else if (i_9_ > 255)
			i_9_ = 255;
		if (i_10_ < 0)
			i_10_ = 0;
		else if (i_10_ > 255)
			i_10_ = 255;
		if (i_10_ > 243)
			i_9_ >>= 4;
		else if (i_10_ > 217)
			i_9_ >>= 3;
		else if (i_10_ > 192)
			i_9_ >>= 2;
		else if (i_10_ > 179)
			i_9_ >>= 1;
		return ((i_8_ & 0xff) >> 2 << 10) + (i_9_ >> 5 << 7) + (i_10_ >> 1);
	}

	public static Class104 method295(int i, int i_11_) {
		Class104[] class104s = Class52_Sub2_Sub1.method15631(1580412859);
		for (int i_12_ = 0; i_12_ < class104s.length; i_12_++) {
			Class104 class104 = class104s[i_12_];
			if (-1544200711 * ((Class104) class104).id == i)
				return class104;
		}
		return null;
	}

	static final void method296(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_13_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_14_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (i_13_ >= 0 && i_13_ < 2)
			client.anIntArrayArrayArray7302[i_13_] = new int[i_14_ << 1][4];
	}

	static void method297(int i) {
		client.aClass184_7218.method3051((byte) -37);
		if (Class14.anInt134 * 1539502519 < 2) {
			Class448.aClass450_5424.method7493(876652608);
			Class14.anInt133 = 0;
			Class14.anInt134 += 1763687431;
			Class192.ACCOUNT_CREATION_STAGE = Class1.REQUEST;
		} else {
			Class192.ACCOUNT_CREATION_STAGE = null;
			Class96_Sub9.RECIEVED_RESPONSE = AccountCreationResponseOpcodes.aClass483_5731;
			Class365.setGameState(5, 1700286123);
		}
	}
}
