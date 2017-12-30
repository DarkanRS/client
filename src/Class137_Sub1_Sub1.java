/* Class137_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class137_Sub1_Sub1 extends Class137_Sub1 {
	float aFloat10132;
	int anInt10133;
	float aFloat10134;
	boolean aBool10135;
	int anInt10136;
	boolean aBool10137;

	Class137_Sub1_Sub1(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_0_, int i_1_, int i_2_) {
		super(class505_sub1, 3553, class150, class76, i_1_, i_2_);
		((Class137_Sub1_Sub1) this).anInt10136 = i;
		((Class137_Sub1_Sub1) this).anInt10133 = i_0_;
		((Class137_Sub1_Sub1) this).aFloat10134 = (float) i_0_ / (float) i_2_;
		((Class137_Sub1_Sub1) this).aFloat10132 = (float) i / (float) i_1_;
		((Class137_Sub1_Sub1) this).aBool10135 = false;
		((Class137_Sub1_Sub1) this).aBool10137 = true;
		method14445(false, false);
	}

	Class137_Sub1_Sub1(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_3_, int i_4_, int i_5_, byte[] is, Class150 class150_6_) {
		super(class505_sub1, 3553, class150, class76, i_4_, i_5_);
		((Class137_Sub1_Sub1) this).anInt10136 = i;
		((Class137_Sub1_Sub1) this).anInt10133 = i_3_;
		method14455(0, i_5_ - i_3_, i, i_3_, is, class150_6_, 0, 0, true);
		((Class137_Sub1_Sub1) this).aFloat10134 = (float) i_3_ / (float) i_5_;
		((Class137_Sub1_Sub1) this).aFloat10132 = (float) i / (float) i_4_;
		((Class137_Sub1_Sub1) this).aBool10135 = false;
		((Class137_Sub1_Sub1) this).aBool10137 = true;
		method14445(false, false);
	}

	static Class137_Sub1_Sub1 method15537(Class505_Sub1 class505_sub1, int i, int i_7_, boolean bool, int[] is, int i_8_, int i_9_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_7_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, i, i_7_, bool, is, i_8_, i_9_);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, i, i_7_, bool, is, i_8_, i_9_);
		return new Class137_Sub1_Sub1(class505_sub1, i, i_7_, Class323.nextPowerOfTwo(i, 253386604), Class323.nextPowerOfTwo(i_7_, 1037655353), is);
	}

	static Class137_Sub1_Sub1 method15538(Class505_Sub1 class505_sub1, int i, int i_10_, int i_11_, int i_12_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i_11_, 1942118537) && Class96_Sub9.method14585(i_12_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, i, i_10_, i_11_, i_12_, true);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, i, i_10_, i_11_, i_12_, true);
		return new Class137_Sub1_Sub1(class505_sub1, i, i_10_, i_11_, i_12_, Class323.nextPowerOfTwo(i_11_, -1948475331), Class323.nextPowerOfTwo(i_12_, -366919304), true);
	}

	Class137_Sub1_Sub1(Class505_Sub1 class505_sub1, int i, Class150 class150, Class76 class76, int i_13_, int i_14_) {
		super(class505_sub1, i, class150, class76, i_13_, i_14_);
		((Class137_Sub1_Sub1) this).anInt10136 = i_13_;
		((Class137_Sub1_Sub1) this).anInt10133 = i_14_;
		if (((Class137_Sub1_Sub1) this).anInt1648 == 34037) {
			((Class137_Sub1_Sub1) this).aFloat10134 = (float) i_14_;
			((Class137_Sub1_Sub1) this).aFloat10132 = (float) i_13_;
			((Class137_Sub1_Sub1) this).aBool10135 = false;
		} else {
			((Class137_Sub1_Sub1) this).aFloat10134 = 1.0F;
			((Class137_Sub1_Sub1) this).aFloat10132 = 1.0F;
			((Class137_Sub1_Sub1) this).aBool10135 = true;
		}
		((Class137_Sub1_Sub1) this).aBool10137 = false;
	}

	static Class137_Sub1_Sub1 method15539(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_15_, boolean bool, byte[] is, Class150 class150_16_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_15_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, class150, class76, i, i_15_, bool, is, class150_16_);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, class150, class76, i, i_15_, bool, is, class150_16_);
		return new Class137_Sub1_Sub1(class505_sub1, class150, class76, i, i_15_, Class323.nextPowerOfTwo(i, -413856404), Class323.nextPowerOfTwo(i_15_, 750480667), is, class150_16_);
	}

	void method2373(boolean bool) {
		super.method2351(bool && !((Class137_Sub1_Sub1) this).aBool10137);
	}

	Class137_Sub1_Sub1(Class505_Sub1 class505_sub1, int i, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool) {
		super(class505_sub1, i, i_17_, i_18_, i_19_, i_20_);
		((Class137_Sub1_Sub1) this).anInt10136 = i_19_;
		((Class137_Sub1_Sub1) this).anInt10133 = i_20_;
		if (((Class137_Sub1_Sub1) this).anInt1648 == 34037) {
			((Class137_Sub1_Sub1) this).aFloat10134 = (float) i_20_;
			((Class137_Sub1_Sub1) this).aFloat10132 = (float) i_19_;
			((Class137_Sub1_Sub1) this).aBool10135 = false;
		} else {
			((Class137_Sub1_Sub1) this).aFloat10134 = 1.0F;
			((Class137_Sub1_Sub1) this).aFloat10132 = 1.0F;
			((Class137_Sub1_Sub1) this).aBool10135 = true;
		}
		((Class137_Sub1_Sub1) this).aBool10137 = false;
	}

	static Class137_Sub1_Sub1 method15540(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_21_, boolean bool, byte[] is, Class150 class150_22_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_21_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, class150, class76, i, i_21_, bool, is, class150_22_);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, class150, class76, i, i_21_, bool, is, class150_22_);
		return new Class137_Sub1_Sub1(class505_sub1, class150, class76, i, i_21_, Class323.nextPowerOfTwo(i, 527754772), Class323.nextPowerOfTwo(i_21_, 1788397404), is, class150_22_);
	}

	Class137_Sub1_Sub1(Class505_Sub1 class505_sub1, int i, int i_23_, int i_24_, int i_25_, int[] is) {
		super(class505_sub1, 3553, Class150.aClass150_1949, Class76.aClass76_751, i_24_, i_25_);
		((Class137_Sub1_Sub1) this).anInt10136 = i;
		((Class137_Sub1_Sub1) this).anInt10133 = i_23_;
		method14452(0, i_25_ - i_23_, i, i_23_, is, 0, 0, true);
		((Class137_Sub1_Sub1) this).aFloat10134 = (float) i_23_ / (float) i_25_;
		((Class137_Sub1_Sub1) this).aFloat10132 = (float) i / (float) i_24_;
		((Class137_Sub1_Sub1) this).aBool10135 = false;
		((Class137_Sub1_Sub1) this).aBool10137 = true;
		method14445(false, false);
	}

	Class137_Sub1_Sub1(Class505_Sub1 class505_sub1, int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, boolean bool) {
		super(class505_sub1, 3553, i, i_26_, i_29_, i_30_);
		((Class137_Sub1_Sub1) this).anInt10136 = i_27_;
		((Class137_Sub1_Sub1) this).anInt10133 = i_28_;
		((Class137_Sub1_Sub1) this).aFloat10134 = (float) i_28_ / (float) i_30_;
		((Class137_Sub1_Sub1) this).aFloat10132 = (float) i_27_ / (float) i_29_;
		((Class137_Sub1_Sub1) this).aBool10135 = false;
		((Class137_Sub1_Sub1) this).aBool10137 = true;
		method14445(false, false);
	}

	Class137_Sub1_Sub1(Class505_Sub1 class505_sub1, int i, int i_31_, int i_32_, boolean bool, int[] is, int i_33_, int i_34_) {
		super(class505_sub1, i, i_31_, i_32_, bool, is, i_33_, i_34_, true);
		((Class137_Sub1_Sub1) this).anInt10136 = i_31_;
		((Class137_Sub1_Sub1) this).anInt10133 = i_32_;
		if (((Class137_Sub1_Sub1) this).anInt1648 == 34037) {
			((Class137_Sub1_Sub1) this).aFloat10134 = (float) i_32_;
			((Class137_Sub1_Sub1) this).aFloat10132 = (float) i_31_;
			((Class137_Sub1_Sub1) this).aBool10135 = false;
		} else {
			((Class137_Sub1_Sub1) this).aFloat10134 = 1.0F;
			((Class137_Sub1_Sub1) this).aFloat10132 = 1.0F;
			((Class137_Sub1_Sub1) this).aBool10135 = true;
		}
		((Class137_Sub1_Sub1) this).aBool10137 = false;
	}

	void method2351(boolean bool) {
		super.method2351(bool && !((Class137_Sub1_Sub1) this).aBool10137);
	}

	static Class137_Sub1_Sub1 method15541(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_35_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_35_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, class150, class76, i, i_35_);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, class150, class76, i, i_35_);
		return new Class137_Sub1_Sub1(class505_sub1, class150, class76, i, i_35_, Class323.nextPowerOfTwo(i, -657819570), Class323.nextPowerOfTwo(i_35_, 957405648));
	}

	static Class137_Sub1_Sub1 method15542(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_36_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_36_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, class150, class76, i, i_36_);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, class150, class76, i, i_36_);
		return new Class137_Sub1_Sub1(class505_sub1, class150, class76, i, i_36_, Class323.nextPowerOfTwo(i, 196016285), Class323.nextPowerOfTwo(i_36_, -1514812377));
	}

	static Class137_Sub1_Sub1 method15543(Class505_Sub1 class505_sub1, int i, int i_37_, boolean bool, int[] is, int i_38_, int i_39_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_37_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, i, i_37_, bool, is, i_38_, i_39_);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, i, i_37_, bool, is, i_38_, i_39_);
		return new Class137_Sub1_Sub1(class505_sub1, i, i_37_, Class323.nextPowerOfTwo(i, -1821240), Class323.nextPowerOfTwo(i_37_, -1200702324), is);
	}

	static Class137_Sub1_Sub1 method15544(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_40_, boolean bool, byte[] is, Class150 class150_41_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_40_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, class150, class76, i, i_40_, bool, is, class150_41_);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, class150, class76, i, i_40_, bool, is, class150_41_);
		return new Class137_Sub1_Sub1(class505_sub1, class150, class76, i, i_40_, Class323.nextPowerOfTwo(i, 1181879814), Class323.nextPowerOfTwo(i_40_, -1549676757), is, class150_41_);
	}

	Class137_Sub1_Sub1(Class505_Sub1 class505_sub1, int i, Class150 class150, Class76 class76, int i_42_, int i_43_, boolean bool, byte[] is, Class150 class150_44_) {
		super(class505_sub1, i, class150, class76, i_42_, i_43_, bool, is, class150_44_, true);
		((Class137_Sub1_Sub1) this).anInt10136 = i_42_;
		((Class137_Sub1_Sub1) this).anInt10133 = i_43_;
		if (((Class137_Sub1_Sub1) this).anInt1648 == 34037) {
			((Class137_Sub1_Sub1) this).aFloat10134 = (float) i_43_;
			((Class137_Sub1_Sub1) this).aFloat10132 = (float) i_42_;
			((Class137_Sub1_Sub1) this).aBool10135 = false;
		} else {
			((Class137_Sub1_Sub1) this).aFloat10134 = 1.0F;
			((Class137_Sub1_Sub1) this).aFloat10132 = 1.0F;
			((Class137_Sub1_Sub1) this).aBool10135 = true;
		}
		((Class137_Sub1_Sub1) this).aBool10137 = false;
	}

	static Class137_Sub1_Sub1 method15545(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_45_, boolean bool, byte[] is, Class150 class150_46_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_45_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, class150, class76, i, i_45_, bool, is, class150_46_);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, class150, class76, i, i_45_, bool, is, class150_46_);
		return new Class137_Sub1_Sub1(class505_sub1, class150, class76, i, i_45_, Class323.nextPowerOfTwo(i, -206747831), Class323.nextPowerOfTwo(i_45_, 870483507), is, class150_46_);
	}

	static Class137_Sub1_Sub1 method15546(Class505_Sub1 class505_sub1, int i, int i_47_, int i_48_, int i_49_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i_48_, 1942118537) && Class96_Sub9.method14585(i_49_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, i, i_47_, i_48_, i_49_, true);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, i, i_47_, i_48_, i_49_, true);
		return new Class137_Sub1_Sub1(class505_sub1, i, i_47_, i_48_, i_49_, Class323.nextPowerOfTwo(i_48_, 658469999), Class323.nextPowerOfTwo(i_49_, -1692590121), true);
	}

	static Class137_Sub1_Sub1 method15547(Class505_Sub1 class505_sub1, Class150 class150, Class76 class76, int i, int i_50_) {
		if (((Class505_Sub1) class505_sub1).aBool8498 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_50_, 1942118537)))
			return new Class137_Sub1_Sub1(class505_sub1, 3553, class150, class76, i, i_50_);
		if (((Class505_Sub1) class505_sub1).aBool8401)
			return new Class137_Sub1_Sub1(class505_sub1, 34037, class150, class76, i, i_50_);
		return new Class137_Sub1_Sub1(class505_sub1, class150, class76, i, i_50_, Class323.nextPowerOfTwo(i, -572466042), Class323.nextPowerOfTwo(i_50_, -2128087947));
	}
}
