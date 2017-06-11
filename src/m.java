/* m - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class m extends Class264 implements Interface25 {
	long nativeid;

	native void am(ja var_ja, ba var_ba, byte[][] is, int[] is_0_, int[] is_1_, int[] is_2_, int[] is_3_);

	void method2486(char c, int i, int i_4_, int i_5_, boolean bool, Class_ta class_ta, int i_6_, int i_7_) {
		MA(c, i, i_4_, i_5_, bool, class_ta, i_6_, i_7_);
	}

	public native void ma(boolean bool);

	native void e(char c, int i, int i_8_, int i_9_, boolean bool);

	native void n(ja var_ja, ba var_ba, byte[][] is, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_);

	native void MA(char c, int i, int i_14_, int i_15_, boolean bool, Class_ta class_ta, int i_16_, int i_17_);

	native void g(char c, int i, int i_18_, int i_19_, boolean bool);

	native void UA(char c, int i, int i_20_, int i_21_, boolean bool);

	void method2489(char c, int i, int i_22_, int i_23_, boolean bool, Class_ta class_ta, int i_24_, int i_25_) {
		MA(c, i, i_22_, i_23_, bool, class_ta, i_24_, i_25_);
	}

	public native void z(boolean bool);

	m(ja var_ja, ba var_ba, Class505 class505, Class89[] class89s, Class57[] class57s) {
		super(var_ja, class505);
		byte[][] is = new byte[class89s.length][];
		int[] is_26_ = new int[class89s.length];
		int[] is_27_ = new int[class89s.length];
		int[] is_28_ = new int[class89s.length];
		int[] is_29_ = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].aByteArray818;
			is_26_[i] = class89s[i].anInt812;
			is_27_[i] = class89s[i].anInt816;
			is_28_[i] = class89s[i].anInt815;
			is_29_[i] = class89s[i].anInt811;
		}
		n(var_ja, var_ba, is, is_26_, is_27_, is_28_, is_29_);
	}

	native void bd(ja var_ja, ba var_ba, byte[][] is, int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_);

	native void bf(char c, int i, int i_34_, int i_35_, boolean bool, Class_ta class_ta, int i_36_, int i_37_);

	native void be(char c, int i, int i_38_, int i_39_, boolean bool, Class_ta class_ta, int i_40_, int i_41_);
}
