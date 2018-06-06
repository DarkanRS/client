/* ia - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ia extends FontRenderer implements Interface40 {
	long nativeid;

	ia(ja var_ja, ba var_ba, FontMetrics class414, Class91[] class91s, NativeSprite[] class160s) {
		super(var_ja, class414);
		byte[][] is = new byte[class91s.length][];
		int[] is_0_ = new int[class91s.length];
		int[] is_1_ = new int[class91s.length];
		int[] is_2_ = new int[class91s.length];
		int[] is_3_ = new int[class91s.length];
		for (int i = 0; i < class91s.length; i++) {
			is[i] = class91s[i].aByteArray960;
			is_0_[i] = class91s[i].anInt957;
			is_1_[i] = class91s[i].anInt954;
			is_2_[i] = class91s[i].anInt956;
			is_3_[i] = class91s[i].anInt959;
		}
		EA(var_ja, var_ba, is, class91s[0].anIntArray955, is_0_, is_1_, is_2_, is_3_);
	}

	native void EA(ja var_ja, ba var_ba, byte[][] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_);

	public void finalize() {
		if (((ia) this).nativeid != 0L)
			Class156.method2642(this, (byte) 126);
	}

	native void c(char c, int i, int i_9_, int i_10_, boolean bool);

	native void UA(char c, int i, int i_11_, int i_12_, boolean bool);

	native void GA(char c, int i, int i_13_, int i_14_, boolean bool, Class455 class455, int i_15_, int i_16_);

	native void n(ja var_ja, ba var_ba, byte[][] is, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_);

	void method362(char c, int i, int i_22_, int i_23_, boolean bool, Class455 class455, int i_24_, int i_25_) {
		GA(c, i, i_22_, i_23_, bool, class455, i_24_, i_25_);
	}

	public native void ma(boolean bool);

	native void t(char c, int i, int i_26_, int i_27_, boolean bool);

	public native void y(boolean bool);

	void method12939() {
		if (((ia) this).nativeid != 0L)
			Class156.method2642(this, (byte) 99);
	}

	void method374(char c, int i, int i_28_, int i_29_, boolean bool, Class455 class455, int i_30_, int i_31_) {
		GA(c, i, i_28_, i_29_, bool, class455, i_30_, i_31_);
	}

	public native void x(boolean bool);

	native void ae(ja var_ja, ba var_ba, byte[][] is, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_, int[] is_36_);

	void method12940() {
		if (((ia) this).nativeid != 0L)
			Class156.method2642(this, (byte) 11);
	}

	native void aq(char c, int i, int i_37_, int i_38_, boolean bool, Class455 class455, int i_39_, int i_40_);

	native void av(char c, int i, int i_41_, int i_42_, boolean bool, Class455 class455, int i_43_, int i_44_);
}
