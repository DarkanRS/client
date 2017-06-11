/* ia - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ia extends Class264 implements Interface25 {
	long nativeid;

	native void am(ja var_ja, ba var_ba, byte[][] is, int[] is_0_, int[] is_1_, int[] is_2_, int[] is_3_, int[] is_4_);

	native void e(char c, int i, int i_5_, int i_6_, boolean bool);

	void method2489(char c, int i, int i_7_, int i_8_, boolean bool, Class_ta class_ta, int i_9_, int i_10_) {
		GA(c, i, i_7_, i_8_, bool, class_ta, i_9_, i_10_);
	}

	native void UA(char c, int i, int i_11_, int i_12_, boolean bool);

	void method2486(char c, int i, int i_13_, int i_14_, boolean bool, Class_ta class_ta, int i_15_, int i_16_) {
		GA(c, i, i_13_, i_14_, bool, class_ta, i_15_, i_16_);
	}

	native void GA(char c, int i, int i_17_, int i_18_, boolean bool, Class_ta class_ta, int i_19_, int i_20_);

	native void g(char c, int i, int i_21_, int i_22_, boolean bool);

	ia(ja var_ja, ba var_ba, Class505 class505, Class89[] class89s, Class57[] class57s) {
		super(var_ja, class505);
		byte[][] is = new byte[class89s.length][];
		int[] is_23_ = new int[class89s.length];
		int[] is_24_ = new int[class89s.length];
		int[] is_25_ = new int[class89s.length];
		int[] is_26_ = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].aByteArray818;
			is_23_[i] = class89s[i].anInt812;
			is_24_[i] = class89s[i].anInt816;
			is_25_[i] = class89s[i].anInt815;
			is_26_[i] = class89s[i].anInt811;
		}
		EA(var_ja, var_ba, is, class89s[0].anIntArray817, is_23_, is_24_, is_25_, is_26_);
	}

	native void bm(char c, int i, int i_27_, int i_28_, boolean bool, Class_ta class_ta, int i_29_, int i_30_);

	public native void z(boolean bool);

	native void n(ja var_ja, ba var_ba, byte[][] is, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_);

	public native void ma(boolean bool);

	native void bd(ja var_ja, ba var_ba, byte[][] is, int[] is_36_, int[] is_37_, int[] is_38_, int[] is_39_, int[] is_40_);

	native void bf(char c, int i, int i_41_, int i_42_, boolean bool, Class_ta class_ta, int i_43_, int i_44_);

	native void EA(ja var_ja, ba var_ba, byte[][] is, int[] is_45_, int[] is_46_, int[] is_47_, int[] is_48_, int[] is_49_);

	native void by(char c, int i, int i_50_, int i_51_, boolean bool, Class_ta class_ta, int i_52_, int i_53_);

	native void be(char c, int i, int i_54_, int i_55_, boolean bool, Class_ta class_ta, int i_56_, int i_57_);
}
