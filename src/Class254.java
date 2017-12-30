/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class254 implements Runnable {
	volatile Class253[] aClass253Array3142 = new Class253[2];
	volatile boolean aBool3143 = false;
	volatile boolean aBool3144 = false;
	public static int anInt3145;

	Class254() {
		/* empty */
	}

	public static long method4379(CharSequence charsequence, int i) {
		int i_0_ = charsequence.length();
		long l = 0L;
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_1_);
		return l;
	}

	static int method4380(byte[][] is, byte[][] is_2_, int[] is_3_, byte[] is_4_, int[] is_5_, int i, int i_6_, int i_7_) {
		int i_8_ = is_3_[i];
		int i_9_ = is_5_[i] + i_8_;
		int i_10_ = is_3_[i_6_];
		int i_11_ = is_5_[i_6_] + i_10_;
		int i_12_ = i_8_;
		if (i_10_ > i_8_)
			i_12_ = i_10_;
		int i_13_ = i_9_;
		if (i_11_ < i_9_)
			i_13_ = i_11_;
		int i_14_ = is_4_[i] & 0xff;
		if ((is_4_[i_6_] & 0xff) < i_14_)
			i_14_ = is_4_[i_6_] & 0xff;
		byte[] is_15_ = is_2_[i];
		byte[] is_16_ = is[i_6_];
		int i_17_ = i_12_ - i_8_;
		int i_18_ = i_12_ - i_10_;
		for (int i_19_ = i_12_; i_19_ < i_13_; i_19_++) {
			int i_20_ = is_15_[i_17_++] + is_16_[i_18_++];
			if (i_20_ < i_14_)
				i_14_ = i_20_;
		}
		return -i_14_;
	}

	static final void method4381(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (((CS2Executor) class527).aBool7022) {
			if (i >= 8)
				return;
			class513 = ((CS2Executor) class527).aClass513_6994;
		} else
			class513 = ((CS2Executor) class527).aClass513_7007;
		UnderlayDefinition class513_21_ = class513;
		Class118 class118 = ((UnderlayDefinition) class513_21_).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513_21_).aClass98_5885;
		Class282_Sub25.method12401(class118, class98, class527, 1213503004);
	}
}
