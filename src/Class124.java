/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class124 {
	boolean aBool1556 = true;
	int anInt1557;
	Class505_Sub1 aClass505_Sub1_1558;
	Class130 aClass130_1559;
	Class137_Sub1 aClass137_Sub1_1560;
	int anInt1561;
	static final int anInt1562 = 7;
	int anInt1563 = -1;
	int anInt1564;
	Interface15 anInterface15_1565;
	static final int anInt1566 = 128;
	Class131_Sub2 aClass131_Sub2_1567;

	void method2154(byte[] is, int i) {
		((Class124) this).aClass131_Sub2_1567.method111(5123, is, i * 2);
		method2165(((Class124) this).aClass131_Sub2_1567, i);
	}

	void method2155() {
		method2165(((Class124) this).anInterface15_1565, ((Class124) this).anInt1564);
	}

	void method2156(byte[] is, int i) {
		((Class124) this).aClass131_Sub2_1567.method111(5123, is, i * 2);
		method2165(((Class124) this).aClass131_Sub2_1567, i);
	}

	Class124(Class505_Sub1 class505_sub1, Class130 class130, Class390_Sub2 class390_sub2, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		((Class124) this).aClass505_Sub1_1558 = class505_sub1;
		((Class124) this).aClass130_1559 = class130;
		((Class124) this).anInt1557 = i_2_;
		((Class124) this).anInt1561 = i_3_;
		int i_4_ = 1 << i_1_;
		int i_5_ = 0;
		int i_6_ = i << i_1_;
		int i_7_ = i_0_ << i_1_;
		for (int i_8_ = 0; i_8_ < i_4_; i_8_++) {
			int i_9_ = ((i_7_ + i_8_) * (class390_sub2.anInt4776 * -1843860823) + i_6_);
			for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
				short[] is = (((Class390_Sub2) class390_sub2).aShortArrayArray8653[i_9_++]);
				if (is != null)
					i_5_ += is.length;
			}
		}
		((Class124) this).anInt1564 = i_5_;
		if (i_5_ > 0) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(i_5_ * 2);
			if (((Class505_Sub1) ((Class124) this).aClass505_Sub1_1558).aBool8467) {
				for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
					int i_12_ = ((i_7_ + i_11_) * (class390_sub2.anInt4776 * -1843860823) + i_6_);
					for (int i_13_ = 0; i_13_ < i_4_; i_13_++) {
						short[] is = (((Class390_Sub2) class390_sub2).aShortArrayArray8653[i_12_++]);
						if (is != null) {
							for (int i_14_ = 0; i_14_ < is.length; i_14_++)
								class282_sub35.writeShort(is[i_14_] & 0xffff, 1417031095);
						}
					}
				}
			} else {
				for (int i_15_ = 0; i_15_ < i_4_; i_15_++) {
					int i_16_ = ((i_7_ + i_15_) * (class390_sub2.anInt4776 * -1843860823) + i_6_);
					for (int i_17_ = 0; i_17_ < i_4_; i_17_++) {
						short[] is = (((Class390_Sub2) class390_sub2).aShortArrayArray8653[i_16_++]);
						if (is != null) {
							for (int i_18_ = 0; i_18_ < is.length; i_18_++)
								class282_sub35.writeLEShort(is[i_18_] & 0xffff, (byte) -58);
						}
					}
				}
			}
			((Class124) this).anInterface15_1565 = (((Class124) this).aClass505_Sub1_1558.method13598(5123, class282_sub35.buffer, class282_sub35.index * -1990677291, false));
			((Class124) this).aClass131_Sub2_1567 = new Class131_Sub2(((Class124) this).aClass505_Sub1_1558, 5123, null, 1);
		} else
			((Class124) this).aClass137_Sub1_1560 = null;
	}

	void method2157() {
		if (((Class124) this).aBool1556) {
			((Class124) this).aBool1556 = false;
			byte[] is = ((Class130) ((Class124) this).aClass130_1559).aByteArray1588;
			byte[] is_19_ = (((Class505_Sub1) ((Class124) this).aClass505_Sub1_1558).aByteArray8503);
			int i = 0;
			int i_20_ = ((Class130) ((Class124) this).aClass130_1559).anInt1586;
			int i_21_ = (((Class124) this).anInt1557 + (((Class124) this).anInt1561 * (((Class130) ((Class124) this).aClass130_1559).anInt1586)));
			for (int i_22_ = -128; i_22_ < 0; i_22_++) {
				i = (i << 8) - i;
				for (int i_23_ = -128; i_23_ < 0; i_23_++) {
					if (is[i_21_++] != 0)
						i++;
				}
				i_21_ += i_20_ - 128;
			}
			if (((Class124) this).aClass137_Sub1_1560 != null && ((Class124) this).anInt1563 == i)
				((Class124) this).aBool1556 = false;
			else {
				((Class124) this).anInt1563 = i;
				int i_24_ = 0;
				i_21_ = (((Class124) this).anInt1557 + ((Class124) this).anInt1561 * i_20_);
				for (int i_25_ = -128; i_25_ < 0; i_25_++) {
					for (int i_26_ = -128; i_26_ < 0; i_26_++) {
						if (is[i_21_] != 0)
							is_19_[i_24_++] = (byte) 68;
						else {
							int i_27_ = 0;
							if (is[i_21_ - 1] != 0)
								i_27_++;
							if (is[i_21_ + 1] != 0)
								i_27_++;
							if (is[i_21_ - i_20_] != 0)
								i_27_++;
							if (is[i_21_ + i_20_] != 0)
								i_27_++;
							is_19_[i_24_++] = (byte) (17 * i_27_);
						}
						i_21_++;
					}
					i_21_ += (((Class130) ((Class124) this).aClass130_1559).anInt1586) - 128;
				}
				if (((Class124) this).aClass137_Sub1_1560 == null) {
					((Class124) this).aClass137_Sub1_1560 = new Class137_Sub1((((Class124) this).aClass505_Sub1_1558), 3553, Class150.aClass150_1951, Class76.aClass76_751, 128, 128, false, (((Class505_Sub1) (((Class124) this).aClass505_Sub1_1558)).aByteArray8503), Class150.aClass150_1951, false);
					((Class124) this).aClass137_Sub1_1560.method14445(false, false);
					((Class124) this).aClass137_Sub1_1560.method2351(true);
				} else
					((Class124) this).aClass137_Sub1_1560.method14455(0, 0, 128, 128, (((Class505_Sub1) ((Class124) this).aClass505_Sub1_1558).aByteArray8503), Class150.aClass150_1951, 0, 0, false);
			}
		}
	}

	void method2158() {
		method2165(((Class124) this).anInterface15_1565, ((Class124) this).anInt1564);
	}

	void method2159() {
		if (((Class124) this).aBool1556) {
			((Class124) this).aBool1556 = false;
			byte[] is = ((Class130) ((Class124) this).aClass130_1559).aByteArray1588;
			byte[] is_28_ = (((Class505_Sub1) ((Class124) this).aClass505_Sub1_1558).aByteArray8503);
			int i = 0;
			int i_29_ = ((Class130) ((Class124) this).aClass130_1559).anInt1586;
			int i_30_ = (((Class124) this).anInt1557 + (((Class124) this).anInt1561 * (((Class130) ((Class124) this).aClass130_1559).anInt1586)));
			for (int i_31_ = -128; i_31_ < 0; i_31_++) {
				i = (i << 8) - i;
				for (int i_32_ = -128; i_32_ < 0; i_32_++) {
					if (is[i_30_++] != 0)
						i++;
				}
				i_30_ += i_29_ - 128;
			}
			if (((Class124) this).aClass137_Sub1_1560 != null && ((Class124) this).anInt1563 == i)
				((Class124) this).aBool1556 = false;
			else {
				((Class124) this).anInt1563 = i;
				int i_33_ = 0;
				i_30_ = (((Class124) this).anInt1557 + ((Class124) this).anInt1561 * i_29_);
				for (int i_34_ = -128; i_34_ < 0; i_34_++) {
					for (int i_35_ = -128; i_35_ < 0; i_35_++) {
						if (is[i_30_] != 0)
							is_28_[i_33_++] = (byte) 68;
						else {
							int i_36_ = 0;
							if (is[i_30_ - 1] != 0)
								i_36_++;
							if (is[i_30_ + 1] != 0)
								i_36_++;
							if (is[i_30_ - i_29_] != 0)
								i_36_++;
							if (is[i_30_ + i_29_] != 0)
								i_36_++;
							is_28_[i_33_++] = (byte) (17 * i_36_);
						}
						i_30_++;
					}
					i_30_ += (((Class130) ((Class124) this).aClass130_1559).anInt1586) - 128;
				}
				if (((Class124) this).aClass137_Sub1_1560 == null) {
					((Class124) this).aClass137_Sub1_1560 = new Class137_Sub1((((Class124) this).aClass505_Sub1_1558), 3553, Class150.aClass150_1951, Class76.aClass76_751, 128, 128, false, (((Class505_Sub1) (((Class124) this).aClass505_Sub1_1558)).aByteArray8503), Class150.aClass150_1951, false);
					((Class124) this).aClass137_Sub1_1560.method14445(false, false);
					((Class124) this).aClass137_Sub1_1560.method2351(true);
				} else
					((Class124) this).aClass137_Sub1_1560.method14455(0, 0, 128, 128, (((Class505_Sub1) ((Class124) this).aClass505_Sub1_1558).aByteArray8503), Class150.aClass150_1951, 0, 0, false);
			}
		}
	}

	void method2160(byte[] is, int i) {
		((Class124) this).aClass131_Sub2_1567.method111(5123, is, i * 2);
		method2165(((Class124) this).aClass131_Sub2_1567, i);
	}

	void method2161(Interface15 interface15, int i) {
		if (i != 0) {
			method2157();
			((Class124) this).aClass505_Sub1_1558.method13654(((Class124) this).aClass137_Sub1_1560);
			((Class124) this).aClass505_Sub1_1558.method13611(interface15, 4, 0, i);
		}
	}

	void method2162(byte[] is, int i) {
		((Class124) this).aClass131_Sub2_1567.method111(5123, is, i * 2);
		method2165(((Class124) this).aClass131_Sub2_1567, i);
	}

	void method2163(Interface15 interface15, int i) {
		if (i != 0) {
			method2157();
			((Class124) this).aClass505_Sub1_1558.method13654(((Class124) this).aClass137_Sub1_1560);
			((Class124) this).aClass505_Sub1_1558.method13611(interface15, 4, 0, i);
		}
	}

	void method2164(byte[] is, int i) {
		((Class124) this).aClass131_Sub2_1567.method111(5123, is, i * 2);
		method2165(((Class124) this).aClass131_Sub2_1567, i);
	}

	void method2165(Interface15 interface15, int i) {
		if (i != 0) {
			method2157();
			((Class124) this).aClass505_Sub1_1558.method13654(((Class124) this).aClass137_Sub1_1560);
			((Class124) this).aClass505_Sub1_1558.method13611(interface15, 4, 0, i);
		}
	}

	void method2166() {
		if (((Class124) this).aBool1556) {
			((Class124) this).aBool1556 = false;
			byte[] is = ((Class130) ((Class124) this).aClass130_1559).aByteArray1588;
			byte[] is_37_ = (((Class505_Sub1) ((Class124) this).aClass505_Sub1_1558).aByteArray8503);
			int i = 0;
			int i_38_ = ((Class130) ((Class124) this).aClass130_1559).anInt1586;
			int i_39_ = (((Class124) this).anInt1557 + (((Class124) this).anInt1561 * (((Class130) ((Class124) this).aClass130_1559).anInt1586)));
			for (int i_40_ = -128; i_40_ < 0; i_40_++) {
				i = (i << 8) - i;
				for (int i_41_ = -128; i_41_ < 0; i_41_++) {
					if (is[i_39_++] != 0)
						i++;
				}
				i_39_ += i_38_ - 128;
			}
			if (((Class124) this).aClass137_Sub1_1560 != null && ((Class124) this).anInt1563 == i)
				((Class124) this).aBool1556 = false;
			else {
				((Class124) this).anInt1563 = i;
				int i_42_ = 0;
				i_39_ = (((Class124) this).anInt1557 + ((Class124) this).anInt1561 * i_38_);
				for (int i_43_ = -128; i_43_ < 0; i_43_++) {
					for (int i_44_ = -128; i_44_ < 0; i_44_++) {
						if (is[i_39_] != 0)
							is_37_[i_42_++] = (byte) 68;
						else {
							int i_45_ = 0;
							if (is[i_39_ - 1] != 0)
								i_45_++;
							if (is[i_39_ + 1] != 0)
								i_45_++;
							if (is[i_39_ - i_38_] != 0)
								i_45_++;
							if (is[i_39_ + i_38_] != 0)
								i_45_++;
							is_37_[i_42_++] = (byte) (17 * i_45_);
						}
						i_39_++;
					}
					i_39_ += (((Class130) ((Class124) this).aClass130_1559).anInt1586) - 128;
				}
				if (((Class124) this).aClass137_Sub1_1560 == null) {
					((Class124) this).aClass137_Sub1_1560 = new Class137_Sub1((((Class124) this).aClass505_Sub1_1558), 3553, Class150.aClass150_1951, Class76.aClass76_751, 128, 128, false, (((Class505_Sub1) (((Class124) this).aClass505_Sub1_1558)).aByteArray8503), Class150.aClass150_1951, false);
					((Class124) this).aClass137_Sub1_1560.method14445(false, false);
					((Class124) this).aClass137_Sub1_1560.method2351(true);
				} else
					((Class124) this).aClass137_Sub1_1560.method14455(0, 0, 128, 128, (((Class505_Sub1) ((Class124) this).aClass505_Sub1_1558).aByteArray8503), Class150.aClass150_1951, 0, 0, false);
			}
		}
	}
}
