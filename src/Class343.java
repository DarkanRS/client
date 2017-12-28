/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class343 {
	int anInt4008;
	Class248[] aClass248Array4009 = new Class248[10];
	static final int anInt4010 = 22050;
	int anInt4011;

	final byte[] method6088() {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (((Class343) this).aClass248Array4009[i_0_] != null && ((((Class248) ((Class343) this).aClass248Array4009[i_0_]).anInt3055) + (((Class248) ((Class343) this).aClass248Array4009[i_0_]).anInt3076)) > i)
				i = ((((Class248) ((Class343) this).aClass248Array4009[i_0_]).anInt3055) + (((Class248) ((Class343) this).aClass248Array4009[i_0_]).anInt3076));
		}
		if (i == 0)
			return new byte[0];
		int i_1_ = 22050 * i / 1000;
		byte[] is = new byte[i_1_];
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (((Class343) this).aClass248Array4009[i_2_] != null) {
				int i_3_ = ((((Class248) ((Class343) this).aClass248Array4009[i_2_]).anInt3055) * 22050 / 1000);
				int i_4_ = ((((Class248) ((Class343) this).aClass248Array4009[i_2_]).anInt3076) * 22050 / 1000);
				int[] is_5_ = (((Class343) this).aClass248Array4009[i_2_].method4253(i_3_, ((Class248) (((Class343) this).aClass248Array4009[i_2_])).anInt3055));
				for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
					int i_7_ = is[i_6_ + i_4_] + (is_5_[i_6_] >> 8);
					if ((i_7_ + 128 & ~0xff) != 0)
						i_7_ = i_7_ >> 31 ^ 0x7f;
					is[i_6_ + i_4_] = (byte) i_7_;
				}
			}
		}
		return is;
	}

	Class343(RsByteBuffer class282_sub35) {
		for (int i = 0; i < 10; i++) {
			int i_8_ = class282_sub35.readUnsignedByte();
			if (i_8_ != 0) {
				class282_sub35.index -= -1115476867;
				((Class343) this).aClass248Array4009[i] = new Class248();
				((Class343) this).aClass248Array4009[i].method4255(class282_sub35);
			}
		}
		((Class343) this).anInt4011 = class282_sub35.readUnsignedShort();
		((Class343) this).anInt4008 = class282_sub35.readUnsignedShort();
	}

	public Class282_Sub26_Sub1_Sub2 method6089() {
		byte[] is = method6091();
		return (new Class282_Sub26_Sub1_Sub2(22050, is, 22050 * ((Class343) this).anInt4011 / 1000, 22050 * ((Class343) this).anInt4008 / 1000));
	}

	public final int method6090() {
		int i = 9999999;
		for (int i_9_ = 0; i_9_ < 10; i_9_++) {
			if (((Class343) this).aClass248Array4009[i_9_] != null && (((Class248) ((Class343) this).aClass248Array4009[i_9_]).anInt3076) / 20 < i)
				i = (((Class248) ((Class343) this).aClass248Array4009[i_9_]).anInt3076) / 20;
		}
		if (((Class343) this).anInt4011 < ((Class343) this).anInt4008 && ((Class343) this).anInt4011 / 20 < i)
			i = ((Class343) this).anInt4011 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_10_ = 0; i_10_ < 10; i_10_++) {
			if (((Class343) this).aClass248Array4009[i_10_] != null)
				((Class248) ((Class343) this).aClass248Array4009[i_10_]).anInt3076 -= i * 20;
		}
		if (((Class343) this).anInt4011 < ((Class343) this).anInt4008) {
			((Class343) this).anInt4011 -= i * 20;
			((Class343) this).anInt4008 -= i * 20;
		}
		return i;
	}

	final byte[] method6091() {
		int i = 0;
		for (int i_11_ = 0; i_11_ < 10; i_11_++) {
			if (((Class343) this).aClass248Array4009[i_11_] != null && ((((Class248) ((Class343) this).aClass248Array4009[i_11_]).anInt3055) + (((Class248) ((Class343) this).aClass248Array4009[i_11_]).anInt3076)) > i)
				i = ((((Class248) ((Class343) this).aClass248Array4009[i_11_]).anInt3055) + ((Class248) (((Class343) this).aClass248Array4009[i_11_])).anInt3076);
		}
		if (i == 0)
			return new byte[0];
		int i_12_ = 22050 * i / 1000;
		byte[] is = new byte[i_12_];
		for (int i_13_ = 0; i_13_ < 10; i_13_++) {
			if (((Class343) this).aClass248Array4009[i_13_] != null) {
				int i_14_ = (((Class248) ((Class343) this).aClass248Array4009[i_13_]).anInt3055) * 22050 / 1000;
				int i_15_ = (((Class248) ((Class343) this).aClass248Array4009[i_13_]).anInt3076) * 22050 / 1000;
				int[] is_16_ = (((Class343) this).aClass248Array4009[i_13_].method4253(i_14_, ((Class248) (((Class343) this).aClass248Array4009[i_13_])).anInt3055));
				for (int i_17_ = 0; i_17_ < i_14_; i_17_++) {
					int i_18_ = is[i_17_ + i_15_] + (is_16_[i_17_] >> 8);
					if ((i_18_ + 128 & ~0xff) != 0)
						i_18_ = i_18_ >> 31 ^ 0x7f;
					is[i_17_ + i_15_] = (byte) i_18_;
				}
			}
		}
		return is;
	}

	public Class282_Sub26_Sub1_Sub2 method6092() {
		byte[] is = method6091();
		return (new Class282_Sub26_Sub1_Sub2(22050, is, 22050 * ((Class343) this).anInt4011 / 1000, 22050 * ((Class343) this).anInt4008 / 1000));
	}

	public static Class343 method6093(Class317 class317, int i, int i_19_) {
		byte[] is = class317.method5607(i, i_19_, -1279720965);
		if (is == null)
			return null;
		return new Class343(new RsByteBuffer(is));
	}

	public static Class343 method6094(Class317 class317, int i, int i_20_) {
		byte[] is = class317.method5607(i, i_20_, -1576539296);
		if (is == null)
			return null;
		return new Class343(new RsByteBuffer(is));
	}

	public final int method6095() {
		int i = 9999999;
		for (int i_21_ = 0; i_21_ < 10; i_21_++) {
			if (((Class343) this).aClass248Array4009[i_21_] != null && (((Class248) ((Class343) this).aClass248Array4009[i_21_]).anInt3076) / 20 < i)
				i = (((Class248) ((Class343) this).aClass248Array4009[i_21_]).anInt3076) / 20;
		}
		if (((Class343) this).anInt4011 < ((Class343) this).anInt4008 && ((Class343) this).anInt4011 / 20 < i)
			i = ((Class343) this).anInt4011 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_22_ = 0; i_22_ < 10; i_22_++) {
			if (((Class343) this).aClass248Array4009[i_22_] != null)
				((Class248) ((Class343) this).aClass248Array4009[i_22_]).anInt3076 -= i * 20;
		}
		if (((Class343) this).anInt4011 < ((Class343) this).anInt4008) {
			((Class343) this).anInt4011 -= i * 20;
			((Class343) this).anInt4008 -= i * 20;
		}
		return i;
	}

	public static Class343 method6096(Class317 class317, int i, int i_23_) {
		byte[] is = class317.method5607(i, i_23_, -1706681173);
		if (is == null)
			return null;
		return new Class343(new RsByteBuffer(is));
	}

	public static Class343 method6097(Class317 class317, int i, int i_24_) {
		byte[] is = class317.method5607(i, i_24_, -1673020566);
		if (is == null)
			return null;
		return new Class343(new RsByteBuffer(is));
	}

	public final int method6098() {
		int i = 9999999;
		for (int i_25_ = 0; i_25_ < 10; i_25_++) {
			if (((Class343) this).aClass248Array4009[i_25_] != null && (((Class248) ((Class343) this).aClass248Array4009[i_25_]).anInt3076) / 20 < i)
				i = (((Class248) ((Class343) this).aClass248Array4009[i_25_]).anInt3076) / 20;
		}
		if (((Class343) this).anInt4011 < ((Class343) this).anInt4008 && ((Class343) this).anInt4011 / 20 < i)
			i = ((Class343) this).anInt4011 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_26_ = 0; i_26_ < 10; i_26_++) {
			if (((Class343) this).aClass248Array4009[i_26_] != null)
				((Class248) ((Class343) this).aClass248Array4009[i_26_]).anInt3076 -= i * 20;
		}
		if (((Class343) this).anInt4011 < ((Class343) this).anInt4008) {
			((Class343) this).anInt4011 -= i * 20;
			((Class343) this).anInt4008 -= i * 20;
		}
		return i;
	}

	final byte[] method6099() {
		int i = 0;
		for (int i_27_ = 0; i_27_ < 10; i_27_++) {
			if (((Class343) this).aClass248Array4009[i_27_] != null && ((((Class248) ((Class343) this).aClass248Array4009[i_27_]).anInt3055) + (((Class248) ((Class343) this).aClass248Array4009[i_27_]).anInt3076)) > i)
				i = ((((Class248) ((Class343) this).aClass248Array4009[i_27_]).anInt3055) + ((Class248) (((Class343) this).aClass248Array4009[i_27_])).anInt3076);
		}
		if (i == 0)
			return new byte[0];
		int i_28_ = 22050 * i / 1000;
		byte[] is = new byte[i_28_];
		for (int i_29_ = 0; i_29_ < 10; i_29_++) {
			if (((Class343) this).aClass248Array4009[i_29_] != null) {
				int i_30_ = (((Class248) ((Class343) this).aClass248Array4009[i_29_]).anInt3055) * 22050 / 1000;
				int i_31_ = (((Class248) ((Class343) this).aClass248Array4009[i_29_]).anInt3076) * 22050 / 1000;
				int[] is_32_ = (((Class343) this).aClass248Array4009[i_29_].method4253(i_30_, ((Class248) (((Class343) this).aClass248Array4009[i_29_])).anInt3055));
				for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
					int i_34_ = is[i_33_ + i_31_] + (is_32_[i_33_] >> 8);
					if ((i_34_ + 128 & ~0xff) != 0)
						i_34_ = i_34_ >> 31 ^ 0x7f;
					is[i_33_ + i_31_] = (byte) i_34_;
				}
			}
		}
		return is;
	}

	final byte[] method6100() {
		int i = 0;
		for (int i_35_ = 0; i_35_ < 10; i_35_++) {
			if (((Class343) this).aClass248Array4009[i_35_] != null && ((((Class248) ((Class343) this).aClass248Array4009[i_35_]).anInt3055) + (((Class248) ((Class343) this).aClass248Array4009[i_35_]).anInt3076)) > i)
				i = ((((Class248) ((Class343) this).aClass248Array4009[i_35_]).anInt3055) + ((Class248) (((Class343) this).aClass248Array4009[i_35_])).anInt3076);
		}
		if (i == 0)
			return new byte[0];
		int i_36_ = 22050 * i / 1000;
		byte[] is = new byte[i_36_];
		for (int i_37_ = 0; i_37_ < 10; i_37_++) {
			if (((Class343) this).aClass248Array4009[i_37_] != null) {
				int i_38_ = (((Class248) ((Class343) this).aClass248Array4009[i_37_]).anInt3055) * 22050 / 1000;
				int i_39_ = (((Class248) ((Class343) this).aClass248Array4009[i_37_]).anInt3076) * 22050 / 1000;
				int[] is_40_ = (((Class343) this).aClass248Array4009[i_37_].method4253(i_38_, ((Class248) (((Class343) this).aClass248Array4009[i_37_])).anInt3055));
				for (int i_41_ = 0; i_41_ < i_38_; i_41_++) {
					int i_42_ = is[i_41_ + i_39_] + (is_40_[i_41_] >> 8);
					if ((i_42_ + 128 & ~0xff) != 0)
						i_42_ = i_42_ >> 31 ^ 0x7f;
					is[i_41_ + i_39_] = (byte) i_42_;
				}
			}
		}
		return is;
	}
}
