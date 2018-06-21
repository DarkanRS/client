/* Class282_Sub20_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub21 extends Class282_Sub20 {
	int anInt9869;
	int anInt9870;
	int anInt9871;

	void method15377(int i) {
		((Class282_Sub20_Sub21) this).anInt9869 = -1329663611 * ((i & 0xff) << 4);
		((Class282_Sub20_Sub21) this).anInt9870 = ((i & 0xff00) >> 4) * 619818677;
		((Class282_Sub20_Sub21) this).anInt9871 = -382674549 * ((i & 0xff0000) >> 12);
	}

	Class282_Sub20_Sub21(int i) {
		super(0, false);
		method15378(i, -175309299);
	}

	public Class282_Sub20_Sub21() {
		this(0);
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			method15378(class282_sub35.read24BitUnsignedInteger(), -175309299);
		}
	}

	void method15378(int i, int i_0_) {
		((Class282_Sub20_Sub21) this).anInt9869 = -1329663611 * ((i & 0xff) << 4);
		((Class282_Sub20_Sub21) this).anInt9870 = ((i & 0xff00) >> 4) * 619818677;
		((Class282_Sub20_Sub21) this).anInt9871 = -382674549 * ((i & 0xff0000) >> 12);
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			method15378(class282_sub35.read24BitUnsignedInteger(), -175309299);
		}
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_1_) {
		switch (i) {
		case 0:
			method15378(class282_sub35.read24BitUnsignedInteger(), -175309299);
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			method15378(class282_sub35.read24BitUnsignedInteger(), -175309299);
		}
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1730957457);
		if (aClass308_7670.aBool3619) {
			int[] is_2_ = is[0];
			int[] is_3_ = is[1];
			int[] is_4_ = is[2];
			for (int i_5_ = 0; i_5_ < -402153223 * Class316.anInt3670; i_5_++) {
				is_2_[i_5_] = ((Class282_Sub20_Sub21) this).anInt9871 * 1758135843;
				is_3_[i_5_] = ((Class282_Sub20_Sub21) this).anInt9870 * 69619613;
				is_4_[i_5_] = ((Class282_Sub20_Sub21) this).anInt9869 * -377659571;
			}
		}
		return is;
	}

	void method15379(int i) {
		((Class282_Sub20_Sub21) this).anInt9869 = -1329663611 * ((i & 0xff) << 4);
		((Class282_Sub20_Sub21) this).anInt9870 = ((i & 0xff00) >> 4) * 619818677;
		((Class282_Sub20_Sub21) this).anInt9871 = -382674549 * ((i & 0xff0000) >> 12);
	}

	int[][] method12320(int i, int i_6_) {
		int[][] is = aClass308_7670.method5463(i, 1977566548);
		if (aClass308_7670.aBool3619) {
			int[] is_7_ = is[0];
			int[] is_8_ = is[1];
			int[] is_9_ = is[2];
			for (int i_10_ = 0; i_10_ < -402153223 * Class316.anInt3670; i_10_++) {
				is_7_[i_10_] = ((Class282_Sub20_Sub21) this).anInt9871 * 1758135843;
				is_8_[i_10_] = ((Class282_Sub20_Sub21) this).anInt9870 * 69619613;
				is_9_[i_10_] = ((Class282_Sub20_Sub21) this).anInt9869 * -377659571;
			}
		}
		return is;
	}

	void method15380(int i) {
		((Class282_Sub20_Sub21) this).anInt9869 = -1329663611 * ((i & 0xff) << 4);
		((Class282_Sub20_Sub21) this).anInt9870 = ((i & 0xff00) >> 4) * 619818677;
		((Class282_Sub20_Sub21) this).anInt9871 = -382674549 * ((i & 0xff0000) >> 12);
	}

	static void method15381(int i, int i_11_, int i_12_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(17, (long) i);
		class282_sub50_sub12.method14995(1421038918);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = i_11_ * -1773141545;
	}
}
