/* Class298_Sub32_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub36 extends Class298_Sub32 {
	int anInt9554;
	int anInt9555;
	int anInt9556 = 1367248896;
	static int anInt9557 = 4096;

	int[][] method3369(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 40);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_0_ = method3134(0, i, (byte) 8);
			int[] is_1_ = is_0_[0];
			int[] is_2_ = is_0_[1];
			int[] is_3_ = is_0_[2];
			int[] is_4_ = is[0];
			int[] is_5_ = is[1];
			int[] is_6_ = is[2];
			for (int i_7_ = 0; i_7_ < -1474554145 * Class250.anInt2755; i_7_++) {
				int i_8_ = is_1_[i_7_];
				int i_9_ = is_3_[i_7_];
				int i_10_ = is_2_[i_7_];
				if (i_8_ == i_9_ && i_9_ == i_10_) {
					is_4_[i_7_] = i_8_ * (((Class298_Sub32_Sub36) this).anInt9556 * 2015834201) >> 12;
					is_5_[i_7_] = (1185665605 * ((Class298_Sub32_Sub36) this).anInt9554 * i_9_) >> 12;
					is_6_[i_7_] = (((Class298_Sub32_Sub36) this).anInt9555 * -1640278703 * i_10_) >> 12;
				} else {
					is_4_[i_7_] = 2015834201 * ((Class298_Sub32_Sub36) this).anInt9556;
					is_5_[i_7_] = 1185665605 * ((Class298_Sub32_Sub36) this).anInt9554;
					is_6_[i_7_] = (-1640278703 * ((Class298_Sub32_Sub36) this).anInt9555);
				}
			}
		}
		return is;
	}

	int[][] method3132(int i, byte i_11_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 20);
			if (aClass239_7380.aBoolean2607) {
				int[][] is_12_ = method3134(0, i, (byte) 8);
				int[] is_13_ = is_12_[0];
				int[] is_14_ = is_12_[1];
				int[] is_15_ = is_12_[2];
				int[] is_16_ = is[0];
				int[] is_17_ = is[1];
				int[] is_18_ = is[2];
				for (int i_19_ = 0; i_19_ < -1474554145 * Class250.anInt2755; i_19_++) {
					int i_20_ = is_13_[i_19_];
					int i_21_ = is_15_[i_19_];
					int i_22_ = is_14_[i_19_];
					if (i_20_ == i_21_ && i_21_ == i_22_) {
						is_16_[i_19_] = i_20_ * (((Class298_Sub32_Sub36) this).anInt9556 * 2015834201) >> 12;
						is_17_[i_19_] = (1185665605 * ((Class298_Sub32_Sub36) this).anInt9554 * i_21_) >> 12;
						is_18_[i_19_] = (((Class298_Sub32_Sub36) this).anInt9555 * -1640278703 * i_22_) >> 12;
					} else {
						is_16_[i_19_] = (2015834201 * ((Class298_Sub32_Sub36) this).anInt9556);
						is_17_[i_19_] = (1185665605 * ((Class298_Sub32_Sub36) this).anInt9554);
						is_18_[i_19_] = (-1640278703 * ((Class298_Sub32_Sub36) this).anInt9555);
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahy.k(").append(')').toString());
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_23_) {
		try {
			switch (i) {
			case 0:
				((Class298_Sub32_Sub36) this).anInt9556 = class298_sub53.readUnsignedShort() * -280684567;
				break;
			case 2:
				((Class298_Sub32_Sub36) this).anInt9555 = class298_sub53.readUnsignedShort() * -1844112463;
				break;
			case 1:
				((Class298_Sub32_Sub36) this).anInt9554 = class298_sub53.readUnsignedShort() * -11308915;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahy.r(").append(')').toString());
		}
	}

	void method3370(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub36) this).anInt9556 = class298_sub53.readUnsignedShort() * -280684567;
			break;
		case 2:
			((Class298_Sub32_Sub36) this).anInt9555 = class298_sub53.readUnsignedShort() * -1844112463;
			break;
		case 1:
			((Class298_Sub32_Sub36) this).anInt9554 = class298_sub53.readUnsignedShort() * -11308915;
			break;
		}
	}

	public Class298_Sub32_Sub36() {
		super(1, false);
		((Class298_Sub32_Sub36) this).anInt9554 = 923324416;
		((Class298_Sub32_Sub36) this).anInt9555 = 1362825216;
	}

	void method3371(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub36) this).anInt9556 = class298_sub53.readUnsignedShort() * -280684567;
			break;
		case 2:
			((Class298_Sub32_Sub36) this).anInt9555 = class298_sub53.readUnsignedShort() * -1844112463;
			break;
		case 1:
			((Class298_Sub32_Sub36) this).anInt9554 = class298_sub53.readUnsignedShort() * -11308915;
			break;
		}
	}

	int[][] method3372(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 112);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_24_ = method3134(0, i, (byte) 8);
			int[] is_25_ = is_24_[0];
			int[] is_26_ = is_24_[1];
			int[] is_27_ = is_24_[2];
			int[] is_28_ = is[0];
			int[] is_29_ = is[1];
			int[] is_30_ = is[2];
			for (int i_31_ = 0; i_31_ < -1474554145 * Class250.anInt2755; i_31_++) {
				int i_32_ = is_25_[i_31_];
				int i_33_ = is_27_[i_31_];
				int i_34_ = is_26_[i_31_];
				if (i_32_ == i_33_ && i_33_ == i_34_) {
					is_28_[i_31_] = i_32_ * (((Class298_Sub32_Sub36) this).anInt9556 * 2015834201) >> 12;
					is_29_[i_31_] = (1185665605 * ((Class298_Sub32_Sub36) this).anInt9554 * i_33_) >> 12;
					is_30_[i_31_] = (((Class298_Sub32_Sub36) this).anInt9555 * -1640278703 * i_34_) >> 12;
				} else {
					is_28_[i_31_] = 2015834201 * ((Class298_Sub32_Sub36) this).anInt9556;
					is_29_[i_31_] = 1185665605 * ((Class298_Sub32_Sub36) this).anInt9554;
					is_30_[i_31_] = (-1640278703 * ((Class298_Sub32_Sub36) this).anInt9555);
				}
			}
		}
		return is;
	}

	static void method3373(Entity class365_sub1_sub1_sub2, int i, int i_35_, int i_36_, int i_37_) {
		try {
			Class350 class350 = class365_sub1_sub1_sub2.method4426(-1083725964);
			Class438 class438 = class365_sub1_sub1_sub2.aClass438_10077;
			int i_38_ = ((2145248039 * class365_sub1_sub1_sub2.anInt10068 - 259411823 * (class365_sub1_sub1_sub2.aClass386_10084.anInt4144)) & 0x3fff);
			if (i == Class282.aClass282_6543.aByte6542) {
				if (0 != i_38_ || -1766897795 * class365_sub1_sub1_sub2.anInt10114 > 25) {
					if (i_36_ < 0 && -1 != 844607405 * class350.anInt3715) {
						class438.method5841(class350.anInt3715 * 844607405, false, true, (byte) -57);
						class365_sub1_sub1_sub2.aBoolean10094 = false;
					} else if (i_36_ > 0 && 1061677153 * class350.anInt3733 != -1) {
						class438.method5841(1061677153 * class350.anInt3733, false, true, (byte) 72);
						class365_sub1_sub1_sub2.aBoolean10094 = false;
					} else if (!class365_sub1_sub1_sub2.aBoolean10094 || !(class350.method4209(class438.method5823(1935756712), (byte) -121))) {
						class438.method5841(class350.method4208(-2063556157), false, true, (byte) -2);
						class365_sub1_sub1_sub2.aBoolean10094 = class365_sub1_sub1_sub2.aClass438_10077.method5819((byte) -119);
					}
				} else if (!class365_sub1_sub1_sub2.aBoolean10094 || !class350.method4209(class438.method5823(2113533366), (byte) -97)) {
					class438.method5841(class350.method4208(-2063556157), false, true, (byte) 102);
					class365_sub1_sub1_sub2.aBoolean10094 = class438.method5819((byte) -64);
				}
			} else if (1433412323 * class365_sub1_sub1_sub2.anInt10090 != -1 && (i_38_ >= 10240 || i_38_ <= 2048)) {
				int i_39_ = ((client.anIntArray8918[i_35_] - (class365_sub1_sub1_sub2.aClass386_10084.anInt4144 * 259411823)) & 0x3fff);
				if (i == Class282.aClass282_6541.aByte6542 && -1 != class350.anInt3721 * 230243963) {
					if (i_39_ > 2048 && i_39_ <= 6144 && -783166629 * class350.anInt3724 != -1)
						class438.method5841(-783166629 * class350.anInt3724, false, true, (byte) -2);
					else if (i_39_ >= 10240 && i_39_ < 14336 && class350.anInt3746 * -2054940183 != -1)
						class438.method5841(class350.anInt3746 * -2054940183, false, true, (byte) -60);
					else if (i_39_ > 6144 && i_39_ < 10240 && -1 != 491753731 * class350.anInt3749)
						class438.method5841(491753731 * class350.anInt3749, false, true, (byte) -111);
					else
						class438.method5841(230243963 * class350.anInt3721, false, true, (byte) -65);
				} else if (i == Class282.aClass282_6545.aByte6542 && class350.anInt3755 * 328817727 != -1) {
					if (i_39_ > 2048 && i_39_ <= 6144 && -1 != class350.anInt3728 * 124010991)
						class438.method5841(class350.anInt3728 * 124010991, false, true, (byte) 110);
					else if (i_39_ >= 10240 && i_39_ < 14336 && class350.anInt3727 * -907666203 != -1)
						class438.method5841(class350.anInt3727 * -907666203, false, true, (byte) 16);
					else if (i_39_ > 6144 && i_39_ < 10240 && -1 != -1238642279 * class350.anInt3722)
						class438.method5841(class350.anInt3722 * -1238642279, false, true, (byte) -13);
					else
						class438.method5841(328817727 * class350.anInt3755, false, true, (byte) -50);
				} else if (i_39_ > 2048 && i_39_ <= 6144 && -1 != class350.anInt3723 * -1532631215)
					class438.method5841(class350.anInt3723 * -1532631215, false, true, (byte) -29);
				else if (i_39_ >= 10240 && i_39_ < 14336 && -1 != 315374861 * class350.anInt3719)
					class438.method5841(315374861 * class350.anInt3719, false, true, (byte) -38);
				else if (i_39_ > 6144 && i_39_ < 10240 && class350.anInt3741 * -277799803 != -1)
					class438.method5841(-277799803 * class350.anInt3741, false, true, (byte) -37);
				else
					class438.method5841(class350.anInt3717 * -129111857, false, true, (byte) 9);
				class365_sub1_sub1_sub2.aBoolean10094 = false;
			} else if (i_38_ != 0 || (class365_sub1_sub1_sub2.anInt10114 * -1766897795 > 25)) {
				if (i == Class282.aClass282_6541.aByte6542 && -1 != 230243963 * class350.anInt3721) {
					if (i_36_ < 0 && -1 != 1885772191 * class350.anInt3731)
						class438.method5841(1885772191 * class350.anInt3731, false, true, (byte) 69);
					else if (i_36_ > 0 && class350.anInt3739 * 914130409 != -1)
						class438.method5841(class350.anInt3739 * 914130409, false, true, (byte) 28);
					else
						class438.method5841(230243963 * class350.anInt3721, false, true, (byte) 95);
				} else if (Class282.aClass282_6545.aByte6542 == i && 328817727 * class350.anInt3755 != -1) {
					if (i_36_ < 0 && 371497673 * class350.anInt3729 != -1)
						class438.method5841(class350.anInt3729 * 371497673, false, true, (byte) -21);
					else if (i_36_ > 0 && class350.anInt3743 * -279532195 != -1)
						class438.method5841(-279532195 * class350.anInt3743, false, true, (byte) 114);
					else
						class438.method5841(328817727 * class350.anInt3755, false, true, (byte) -43);
				} else if (i_36_ < 0 && -1 != class350.anInt3737 * 250017959)
					class438.method5841(class350.anInt3737 * 250017959, false, true, (byte) 28);
				else if (i_36_ > 0 && -1 != class350.anInt3730 * -119373935)
					class438.method5841(class350.anInt3730 * -119373935, false, true, (byte) 72);
				else
					class438.method5841(-129111857 * class350.anInt3717, false, true, (byte) -16);
				class365_sub1_sub1_sub2.aBoolean10094 = false;
			} else {
				if (i == Class282.aClass282_6541.aByte6542 && 230243963 * class350.anInt3721 != -1)
					class438.method5841(230243963 * class350.anInt3721, false, true, (byte) 42);
				else if (Class282.aClass282_6545.aByte6542 == i && class350.anInt3755 * 328817727 != -1)
					class438.method5841(class350.anInt3755 * 328817727, false, true, (byte) 5);
				else
					class438.method5841(-129111857 * class350.anInt3717, false, true, (byte) -42);
				class365_sub1_sub1_sub2.aBoolean10094 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahy.ir(").append(')').toString());
		}
	}
}
