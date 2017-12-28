/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class310 {
	static final int anInt3629 = 7;
	static final int anInt3630 = 1;
	static final int anInt3631 = 2;
	static final int anInt3632 = 3;
	static final int anInt3633 = 4;
	static final int anInt3634 = 6;
	static final int anInt3635 = 0;

	Class310() throws Throwable {
		throw new Error();
	}

	static final void method5494(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_0_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]);
		int i_1_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012 + 1]);
		if (i_0_ == 0)
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else if (0 == i_1_)
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 2147483647;
		else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = (int) Math.pow((double) i_0_, 1.0 / (double) i_1_);
	}
}
