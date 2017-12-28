/* Class468_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class468_Sub11 extends Class468 {
	public void method12697() {
		/* empty */
	}

	void method7783(int i, int i_0_) {
		anInt5578 = i * -754033619;
	}

	int method7784(int i) {
		return 1;
	}

	int method7781(int i) {
		return 0;
	}

	int method7785(int i, int i_1_) {
		return 1;
	}

	public Class468_Sub11(int i, Class282_Sub54 class282_sub54) {
		super(i, class282_sub54);
	}

	public void method12698(byte i) {
		/* empty */
	}

	public int method12699(byte i) {
		return anInt5578 * -859024475;
	}

	void method7780(int i) {
		anInt5578 = i * -754033619;
	}

	int method7786() {
		return 0;
	}

	int method7787() {
		return 0;
	}

	public Class468_Sub11(Class282_Sub54 class282_sub54) {
		super(class282_sub54);
	}

	public void method12700() {
		/* empty */
	}

	public int method12701() {
		return anInt5578 * -859024475;
	}

	public static int method12702(int i, int i_2_, int i_3_, int i_4_) {
		if (Class291_Sub1.anInt8015 * -8084891 < 100)
			return -2;
		int i_5_ = -2;
		int i_6_ = 2147483647;
		int i_7_ = i_2_ - Class291_Sub1.anInt3472;
		int i_8_ = i_3_ - Class291_Sub1.anInt3473;
		for (Class282_Sub36 class282_sub36 = ((Class282_Sub36) Class291_Sub1.aClass482_3459.method8097((byte) 56)); class282_sub36 != null; class282_sub36 = (Class282_Sub36) Class291_Sub1.aClass482_3459.method8067(317938751)) {
			if (i == class282_sub36.anInt7991 * -1798678621) {
				int i_9_ = class282_sub36.anInt7987 * -1306535747;
				int i_10_ = 1012301095 * class282_sub36.anInt7993;
				int i_11_ = (Class291_Sub1.anInt3472 + i_9_ << 14 | Class291_Sub1.anInt3473 + i_10_);
				int i_12_ = ((i_7_ - i_9_) * (i_7_ - i_9_) + (i_8_ - i_10_) * (i_8_ - i_10_));
				if (i_5_ < 0 || i_12_ < i_6_) {
					i_5_ = i_11_;
					i_6_ = i_12_;
				}
			}
		}
		return i_5_;
	}
}
