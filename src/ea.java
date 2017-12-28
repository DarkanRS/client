/* ea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ea extends Class8 implements Interface40 {
	long nativeid;

	native void UA(char c, int i, int i_0_, int i_1_, boolean bool);

	native void n(ja var_ja, ba var_ba, byte[][] is, int[] is_2_, int[] is_3_, int[] is_4_, int[] is_5_);

	native void aq(char c, int i, int i_6_, int i_7_, boolean bool, Class455 class455, int i_8_, int i_9_);

	ea(ja var_ja, ba var_ba, Class414 class414, Class91[] class91s, Class160[] class160s) {
		super(var_ja, class414);
		byte[][] is = new byte[class91s.length][];
		int[] is_10_ = new int[class91s.length];
		int[] is_11_ = new int[class91s.length];
		int[] is_12_ = new int[class91s.length];
		int[] is_13_ = new int[class91s.length];
		for (int i = 0; i < class91s.length; i++) {
			Class91 class91 = class91s[i];
			if (class91.aByteArray961 != null)
				is[i] = class91.aByteArray961;
			else {
				byte[] is_14_ = class91.aByteArray960;
				byte[] is_15_ = is[i] = new byte[is_14_.length];
				for (int i_16_ = 0; i_16_ < is_14_.length; i_16_++)
					is_15_[i_16_] = (byte) (is_14_[i_16_] == 0 ? 0 : -1);
			}
			is_10_[i] = class91.anInt957;
			is_11_[i] = class91.anInt954;
			is_12_[i] = class91.anInt956;
			is_13_[i] = class91.anInt959;
		}
		n(var_ja, var_ba, is, is_10_, is_11_, is_12_, is_13_);
	}

	public native void x(boolean bool);

	public void finalize() {
		if (((ea) this).nativeid != 0L)
			Class156.method2642(this, (byte) 37);
	}

	native void P(char c, int i, int i_17_, int i_18_, boolean bool, Class455 class455, int i_19_, int i_20_);

	void method362(char c, int i, int i_21_, int i_22_, boolean bool, Class455 class455, int i_23_, int i_24_) {
		P(c, i, i_21_, i_22_, bool, class455, i_23_, i_24_);
	}

	public native void ma(boolean bool);

	native void t(char c, int i, int i_25_, int i_26_, boolean bool);

	native void c(char c, int i, int i_27_, int i_28_, boolean bool);

	void method12074() {
		if (((ea) this).nativeid != 0L)
			Class156.method2642(this, (byte) 40);
	}

	public native void y(boolean bool);

	void method374(char c, int i, int i_29_, int i_30_, boolean bool, Class455 class455, int i_31_, int i_32_) {
		P(c, i, i_29_, i_30_, bool, class455, i_31_, i_32_);
	}

	native void ae(char c, int i, int i_33_, int i_34_, boolean bool, Class455 class455, int i_35_, int i_36_);

	void method12075() {
		if (((ea) this).nativeid != 0L)
			Class156.method2642(this, (byte) 125);
	}
}
