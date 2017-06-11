/* Class298_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class298_Sub27 extends Linkable {
	int anInt7363;
	int anInt7364;

	Class298_Sub27(int i, int i_0_) {
		((Class298_Sub27) this).anInt7363 = -1100183665 * i;
		((Class298_Sub27) this).anInt7364 = -197779873 * i_0_;
	}

	public static void method3105(short i) {
		try {
			Class344.aClass437_3684 = new HashTable(8);
			Class344.anInt3685 = 0;
			Iterator iterator = Class344.aList3683.iterator();
			while (iterator.hasNext()) {
				Class351 class351 = (Class351) iterator.next();
				class351.method4223();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abl.p(").append(')').toString());
		}
	}

	static final void method3106(ClientScript2 class403, short i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) -1);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1168 * 1867913305;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abl.rj(").append(')').toString());
		}
	}

	static void method3107(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, byte i_8_) {
		try {
			int i_9_ = 0;
			int i_10_ = i_4_;
			int i_11_ = 0;
			int i_12_ = i_3_ - i_7_;
			int i_13_ = i_4_ - i_7_;
			int i_14_ = i_3_ * i_3_;
			int i_15_ = i_4_ * i_4_;
			int i_16_ = i_12_ * i_12_;
			int i_17_ = i_13_ * i_13_;
			int i_18_ = i_15_ << 1;
			int i_19_ = i_14_ << 1;
			int i_20_ = i_17_ << 1;
			int i_21_ = i_16_ << 1;
			int i_22_ = i_4_ << 1;
			int i_23_ = i_13_ << 1;
			int i_24_ = (1 - i_22_) * i_14_ + i_18_;
			int i_25_ = i_15_ - (i_22_ - 1) * i_19_;
			int i_26_ = (1 - i_23_) * i_16_ + i_20_;
			int i_27_ = i_17_ - (i_23_ - 1) * i_21_;
			int i_28_ = i_14_ << 2;
			int i_29_ = i_15_ << 2;
			int i_30_ = i_16_ << 2;
			int i_31_ = i_17_ << 2;
			int i_32_ = i_18_ * 3;
			int i_33_ = (i_22_ - 3) * i_19_;
			int i_34_ = 3 * i_20_;
			int i_35_ = (i_23_ - 3) * i_21_;
			int i_36_ = i_29_;
			int i_37_ = (i_4_ - 1) * i_28_;
			int i_38_ = i_31_;
			int i_39_ = (i_13_ - 1) * i_30_;
			int[] is = Class372_Sub1_Sub1.anIntArrayArray4047[i_2_];
			Class82_Sub22.method940(is, i - i_3_, i - i_12_, i_6_, 1244145704);
			Class82_Sub22.method940(is, i - i_12_, i_12_ + i, i_5_, -1835753044);
			Class82_Sub22.method940(is, i_12_ + i, i_3_ + i, i_6_, 1505074315);
			while (i_10_ > 0) {
				boolean bool = i_10_ <= i_13_;
				if (bool) {
					if (i_26_ < 0) {
						while (i_26_ < 0) {
							i_26_ += i_34_;
							i_27_ += i_38_;
							i_34_ += i_31_;
							i_38_ += i_31_;
							i_11_++;
						}
					}
					if (i_27_ < 0) {
						i_26_ += i_34_;
						i_27_ += i_38_;
						i_34_ += i_31_;
						i_38_ += i_31_;
						i_11_++;
					}
					i_26_ += -i_39_;
					i_27_ += -i_35_;
					i_35_ -= i_30_;
					i_39_ -= i_30_;
				}
				if (i_24_ < 0) {
					while (i_24_ < 0) {
						i_24_ += i_32_;
						i_25_ += i_36_;
						i_32_ += i_29_;
						i_36_ += i_29_;
						i_9_++;
					}
				}
				if (i_25_ < 0) {
					i_24_ += i_32_;
					i_25_ += i_36_;
					i_32_ += i_29_;
					i_36_ += i_29_;
					i_9_++;
				}
				i_24_ += -i_37_;
				i_25_ += -i_33_;
				i_33_ -= i_28_;
				i_37_ -= i_28_;
				i_10_--;
				int i_40_ = i_2_ - i_10_;
				int i_41_ = i_2_ + i_10_;
				int i_42_ = i + i_9_;
				int i_43_ = i - i_9_;
				if (bool) {
					int i_44_ = i_11_ + i;
					int i_45_ = i - i_11_;
					Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_40_]), i_43_, i_45_, i_6_, -1836919463);
					Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_40_]), i_45_, i_44_, i_5_, -2035540755);
					Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_40_]), i_44_, i_42_, i_6_, -981316535);
					Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_41_]), i_43_, i_45_, i_6_, -235264647);
					Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_41_]), i_45_, i_44_, i_5_, -955018458);
					Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_41_]), i_44_, i_42_, i_6_, 614343007);
				} else {
					Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_40_]), i_43_, i_42_, i_6_, 2012650318);
					Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_41_]), i_43_, i_42_, i_6_, -1092242835);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abl.ad(").append(')').toString());
		}
	}
}
