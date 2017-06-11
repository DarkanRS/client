/* Class302_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class302_Sub1 extends Class302 {
	public int anInt7640;
	public int anInt7641;
	public int anInt7642;
	public int anInt7643;
	public boolean aBoolean7644 = false;
	public int anInt7645;

	public boolean method3719(int i, int i_0_) {
		if (!aBoolean7644)
			return false;
		int i_1_ = anInt7643 - anInt7641;
		int i_2_ = anInt7640 - anInt7642;
		int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = i * i_1_ + i_0_ * i_2_ - (anInt7641 * i_1_ + anInt7642 * i_2_);
		if (i_4_ <= 0) {
			int i_5_ = anInt7641 - i;
			int i_6_ = anInt7642 - i_0_;
			return i_5_ * i_5_ + i_6_ * i_6_ < anInt7645 * anInt7645;
		}
		if (i_4_ > i_3_) {
			int i_7_ = anInt7643 - i;
			int i_8_ = anInt7640 - i_0_;
			return i_7_ * i_7_ + i_8_ * i_8_ < anInt7645 * anInt7645;
		}
		i_4_ = (i_4_ << 10) / i_3_;
		int i_9_ = anInt7641 + (i_1_ * i_4_ >> 10) - i;
		int i_10_ = anInt7642 + (i_2_ * i_4_ >> 10) - i_0_;
		return i_9_ * i_9_ + i_10_ * i_10_ < anInt7645 * anInt7645;
	}
}
