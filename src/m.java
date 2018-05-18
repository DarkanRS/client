/* m - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class m extends FontRenderer implements Interface40 {
	long nativeid;

	native void aq(ja var_ja, ba var_ba, byte[][] is, int[] is_0_, int[] is_1_, int[] is_2_, int[] is_3_);

	m(ja var_ja, ba var_ba, Class414 class414, Class91[] class91s, NativeSprite[] class160s) {
		super(var_ja, class414);
		byte[][] is = new byte[class91s.length][];
		int[] is_4_ = new int[class91s.length];
		int[] is_5_ = new int[class91s.length];
		int[] is_6_ = new int[class91s.length];
		int[] is_7_ = new int[class91s.length];
		for (int i = 0; i < class91s.length; i++) {
			is[i] = class91s[i].aByteArray960;
			is_4_[i] = class91s[i].anInt957;
			is_5_[i] = class91s[i].anInt954;
			is_6_[i] = class91s[i].anInt956;
			is_7_[i] = class91s[i].anInt959;
		}
		n(var_ja, var_ba, is, is_4_, is_5_, is_6_, is_7_);
	}

	public native void x(boolean bool);

	public native void ma(boolean bool);

	native void UA(char c, int i, int i_8_, int i_9_, boolean bool);

	void method374(char c, int i, int i_10_, int i_11_, boolean bool, Class455 class455, int i_12_, int i_13_) {
		MA(c, i, i_10_, i_11_, bool, class455, i_12_, i_13_);
	}

	native void MA(char c, int i, int i_14_, int i_15_, boolean bool, Class455 class455, int i_16_, int i_17_);

	void method362(char c, int i, int i_18_, int i_19_, boolean bool, Class455 class455, int i_20_, int i_21_) {
		MA(c, i, i_18_, i_19_, bool, class455, i_20_, i_21_);
	}

	native void aa(char c, int i, int i_22_, int i_23_, boolean bool, Class455 class455, int i_24_, int i_25_);

	public void finalize() {
		if (((m) this).nativeid != 0L)
			Class156.method2642(this, (byte) 116);
	}

	void method11601() {
		if (((m) this).nativeid != 0L)
			Class156.method2642(this, (byte) 105);
	}

	void method11602() {
		if (((m) this).nativeid != 0L)
			Class156.method2642(this, (byte) 26);
	}

	public native void y(boolean bool);

	native void n(ja var_ja, ba var_ba, byte[][] is, int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_);

	native void ae(ja var_ja, ba var_ba, byte[][] is, int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_);

	native void t(char c, int i, int i_34_, int i_35_, boolean bool);

	native void c(char c, int i, int i_36_, int i_37_, boolean bool);

	native void av(char c, int i, int i_38_, int i_39_, boolean bool, Class455 class455, int i_40_, int i_41_);
}
