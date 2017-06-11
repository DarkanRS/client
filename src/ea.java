/* ea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ea extends Class264 implements Interface25 {
	long nativeid;

	native void bf(ja var_ja, ba var_ba, byte[][] is, int[] is_0_, int[] is_1_, int[] is_2_, int[] is_3_);

	native void n(ja var_ja, ba var_ba, byte[][] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_);

	public native void ma(boolean bool);

	native void UA(char c, int i, int i_8_, int i_9_, boolean bool);

	void method2486(char c, int i, int i_10_, int i_11_, boolean bool, Class_ta class_ta, int i_12_, int i_13_) {
		P(c, i, i_10_, i_11_, bool, class_ta, i_12_, i_13_);
	}

	native void P(char c, int i, int i_14_, int i_15_, boolean bool, Class_ta class_ta, int i_16_, int i_17_);

	native void g(char c, int i, int i_18_, int i_19_, boolean bool);

	native void e(char c, int i, int i_20_, int i_21_, boolean bool);

	void method2489(char c, int i, int i_22_, int i_23_, boolean bool, Class_ta class_ta, int i_24_, int i_25_) {
		P(c, i, i_22_, i_23_, bool, class_ta, i_24_, i_25_);
	}

	public native void z(boolean bool);

	native void am(ja var_ja, ba var_ba, byte[][] is, int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_);

	ea(ja var_ja, ba var_ba, Class505 class505, Class89[] class89s, Class57[] class57s) {
		super(var_ja, class505);
		byte[][] is = new byte[class89s.length][];
		int[] is_30_ = new int[class89s.length];
		int[] is_31_ = new int[class89s.length];
		int[] is_32_ = new int[class89s.length];
		int[] is_33_ = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			Class89 class89 = class89s[i];
			if (class89.aByteArray819 != null)
				is[i] = class89.aByteArray819;
			else {
				byte[] is_34_ = class89.aByteArray818;
				byte[] is_35_ = is[i] = new byte[is_34_.length];
				for (int i_36_ = 0; i_36_ < is_34_.length; i_36_++)
					is_35_[i_36_] = (byte) (is_34_[i_36_] == 0 ? 0 : -1);
			}
			is_30_[i] = class89.anInt812;
			is_31_[i] = class89.anInt816;
			is_32_[i] = class89.anInt815;
			is_33_[i] = class89.anInt811;
		}
		n(var_ja, var_ba, is, is_30_, is_31_, is_32_, is_33_);
	}

	native void bd(ja var_ja, ba var_ba, byte[][] is, int[] is_37_, int[] is_38_, int[] is_39_, int[] is_40_);

	native void be(ja var_ja, ba var_ba, byte[][] is, int[] is_41_, int[] is_42_, int[] is_43_, int[] is_44_);

	native void by(char c, int i, int i_45_, int i_46_, boolean bool, Class_ta class_ta, int i_47_, int i_48_);
}
