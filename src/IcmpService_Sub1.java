/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService {
	static volatile IcmpService_Sub1 anIcmpService_Sub1_8551;
	List aList8552 = new ArrayList();

	protected void notify(int i, int i_0_, int i_1_) {
		try {
			Iterator iterator = ((IcmpService_Sub1) this).aList8552.iterator();
			while (iterator.hasNext()) {
				Interface22 interface22 = (Interface22) iterator.next();
				interface22.method245(i, i_0_, i_1_, (short) 1503);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adv.notify(").append(')').toString());
		}
	}

	protected void notify(int i) {
		try {
			Iterator iterator = ((IcmpService_Sub1) this).aList8552.iterator();
			while (iterator.hasNext()) {
				Interface22 interface22 = (Interface22) iterator.next();
				interface22.method247(0 == i, (byte) 5);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adv.notify(").append(')').toString());
		}
	}

	protected void b(int i, int i_2_, int i_3_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8552.iterator();
		while (iterator.hasNext()) {
			Interface22 interface22 = (Interface22) iterator.next();
			interface22.method245(i, i_2_, i_3_, (short) 5654);
		}
	}

	protected void a(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8552.iterator();
		while (iterator.hasNext()) {
			Interface22 interface22 = (Interface22) iterator.next();
			interface22.method247(0 == i, (byte) 5);
		}
	}

	protected void f(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8552.iterator();
		while (iterator.hasNext()) {
			Interface22 interface22 = (Interface22) iterator.next();
			interface22.method247(0 == i, (byte) 5);
		}
	}

	protected void p(int i, int i_4_, int i_5_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8552.iterator();
		while (iterator.hasNext()) {
			Interface22 interface22 = (Interface22) iterator.next();
			interface22.method245(i, i_4_, i_5_, (short) 26137);
		}
	}

	IcmpService_Sub1() {
		/* empty */
	}

	public static byte[][][] method6381(int i, int i_6_) {
		try {
			byte[][][] is = new byte[8][4][];
			int i_7_ = i;
			int i_8_ = i;
			byte[] is_9_ = new byte[i_8_ * i_7_];
			int i_10_ = 0;
			for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
				for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
					if (i_12_ <= i_11_)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[0][0] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_13_ = i_8_ - 1; i_13_ >= 0; i_13_--) {
				for (int i_14_ = 0; i_14_ < i_8_; i_14_++) {
					if (i_14_ <= i_13_)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[0][1] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_15_ = 0; i_15_ < i_8_; i_15_++) {
				for (int i_16_ = 0; i_16_ < i_7_; i_16_++) {
					if (i_16_ >= i_15_)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[0][2] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_17_ = i_8_ - 1; i_17_ >= 0; i_17_--) {
				for (int i_18_ = 0; i_18_ < i_7_; i_18_++) {
					if (i_18_ >= i_17_)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[0][3] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_19_ = i_8_ - 1; i_19_ >= 0; i_19_--) {
				for (int i_20_ = 0; i_20_ < i_7_; i_20_++) {
					if (i_20_ <= i_19_ >> 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[1][0] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_21_ = 0; i_21_ < i_8_; i_21_++) {
				for (int i_22_ = 0; i_22_ < i_7_; i_22_++) {
					if (i_10_ < 0 || i_10_ >= is_9_.length)
						i_10_++;
					else {
						if (i_22_ >= i_21_ << 1)
							is_9_[i_10_] = (byte) -1;
						i_10_++;
					}
				}
			}
			is[1][1] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_23_ = 0; i_23_ < i_8_; i_23_++) {
				for (int i_24_ = i_7_ - 1; i_24_ >= 0; i_24_--) {
					if (i_24_ <= i_23_ >> 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[1][2] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_25_ = i_8_ - 1; i_25_ >= 0; i_25_--) {
				for (int i_26_ = i_7_ - 1; i_26_ >= 0; i_26_--) {
					if (i_26_ >= i_25_ << 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[1][3] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_27_ = i_8_ - 1; i_27_ >= 0; i_27_--) {
				for (int i_28_ = i_7_ - 1; i_28_ >= 0; i_28_--) {
					if (i_28_ <= i_27_ >> 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[2][0] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_29_ = i_8_ - 1; i_29_ >= 0; i_29_--) {
				for (int i_30_ = 0; i_30_ < i_7_; i_30_++) {
					if (i_30_ >= i_29_ << 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[2][1] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_31_ = 0; i_31_ < i_8_; i_31_++) {
				for (int i_32_ = 0; i_32_ < i_7_; i_32_++) {
					if (i_32_ <= i_31_ >> 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[2][2] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_33_ = 0; i_33_ < i_8_; i_33_++) {
				for (int i_34_ = i_7_ - 1; i_34_ >= 0; i_34_--) {
					if (i_34_ >= i_33_ << 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[2][3] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_35_ = i_8_ - 1; i_35_ >= 0; i_35_--) {
				for (int i_36_ = 0; i_36_ < i_7_; i_36_++) {
					if (i_36_ >= i_35_ >> 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[3][0] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_37_ = 0; i_37_ < i_8_; i_37_++) {
				for (int i_38_ = 0; i_38_ < i_7_; i_38_++) {
					if (i_38_ <= i_37_ << 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[3][1] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_39_ = 0; i_39_ < i_8_; i_39_++) {
				for (int i_40_ = i_7_ - 1; i_40_ >= 0; i_40_--) {
					if (i_40_ >= i_39_ >> 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[3][2] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_41_ = i_8_ - 1; i_41_ >= 0; i_41_--) {
				for (int i_42_ = i_7_ - 1; i_42_ >= 0; i_42_--) {
					if (i_42_ <= i_41_ << 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[3][3] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_43_ = i_8_ - 1; i_43_ >= 0; i_43_--) {
				for (int i_44_ = i_7_ - 1; i_44_ >= 0; i_44_--) {
					if (i_44_ >= i_43_ >> 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[4][0] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_45_ = i_8_ - 1; i_45_ >= 0; i_45_--) {
				for (int i_46_ = 0; i_46_ < i_7_; i_46_++) {
					if (i_46_ <= i_45_ << 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[4][1] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_47_ = 0; i_47_ < i_8_; i_47_++) {
				for (int i_48_ = 0; i_48_ < i_7_; i_48_++) {
					if (i_48_ >= i_47_ >> 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[4][2] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_49_ = 0; i_49_ < i_8_; i_49_++) {
				for (int i_50_ = i_7_ - 1; i_50_ >= 0; i_50_--) {
					if (i_50_ <= i_49_ << 1)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[4][3] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_51_ = 0; i_51_ < i_8_; i_51_++) {
				for (int i_52_ = 0; i_52_ < i_7_; i_52_++) {
					if (i_52_ <= i_7_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[5][0] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_53_ = 0; i_53_ < i_8_; i_53_++) {
				for (int i_54_ = 0; i_54_ < i_7_; i_54_++) {
					if (i_53_ <= i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[5][1] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_55_ = 0; i_55_ < i_8_; i_55_++) {
				for (int i_56_ = 0; i_56_ < i_7_; i_56_++) {
					if (i_56_ >= i_7_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[5][2] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_57_ = 0; i_57_ < i_8_; i_57_++) {
				for (int i_58_ = 0; i_58_ < i_7_; i_58_++) {
					if (i_57_ >= i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[5][3] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_59_ = 0; i_59_ < i_8_; i_59_++) {
				for (int i_60_ = 0; i_60_ < i_7_; i_60_++) {
					if (i_60_ <= i_59_ - i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[6][0] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_61_ = i_8_ - 1; i_61_ >= 0; i_61_--) {
				for (int i_62_ = 0; i_62_ < i_7_; i_62_++) {
					if (i_62_ <= i_61_ - i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[6][1] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_63_ = i_8_ - 1; i_63_ >= 0; i_63_--) {
				for (int i_64_ = i_7_ - 1; i_64_ >= 0; i_64_--) {
					if (i_64_ <= i_63_ - i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[6][2] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_65_ = 0; i_65_ < i_8_; i_65_++) {
				for (int i_66_ = i_7_ - 1; i_66_ >= 0; i_66_--) {
					if (i_66_ <= i_65_ - i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[6][3] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_67_ = 0; i_67_ < i_8_; i_67_++) {
				for (int i_68_ = 0; i_68_ < i_7_; i_68_++) {
					if (i_68_ >= i_67_ - i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[7][0] = is_9_;
			is_9_ = new byte[i_7_ * i_8_];
			i_10_ = 0;
			for (int i_69_ = i_8_ - 1; i_69_ >= 0; i_69_--) {
				for (int i_70_ = 0; i_70_ < i_7_; i_70_++) {
					if (i_70_ >= i_69_ - i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[7][1] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_71_ = i_8_ - 1; i_71_ >= 0; i_71_--) {
				for (int i_72_ = i_7_ - 1; i_72_ >= 0; i_72_--) {
					if (i_72_ >= i_71_ - i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[7][2] = is_9_;
			is_9_ = new byte[i_8_ * i_7_];
			i_10_ = 0;
			for (int i_73_ = 0; i_73_ < i_8_; i_73_++) {
				for (int i_74_ = i_7_ - 1; i_74_ >= 0; i_74_--) {
					if (i_74_ >= i_73_ - i_8_ / 2)
						is_9_[i_10_] = (byte) -1;
					i_10_++;
				}
			}
			is[7][3] = is_9_;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adv.f(").append(')').toString());
		}
	}

	static void method6382(boolean bool, int i) {
		try {
			if (bool) {
				if (-1 != -257444687 * client.WINDOW_PANE_ID)
					Class82_Sub8.method893(-257444687 * client.WINDOW_PANE_ID, -2042512871);
				for (Interface class298_sub51 = ((Interface) client.aClass437_8841.method5816(2118062141)); class298_sub51 != null; class298_sub51 = ((Interface) client.aClass437_8841.method5815((byte) 56))) {
					if (!class298_sub51.method2840(-629325116)) {
						class298_sub51 = ((Interface) client.aClass437_8841.method5816(1715939754));
						if (null == class298_sub51) {
							if (i == -743785313) {
								/* empty */
							}
							break;
						}
					}
					Class173.method1821(class298_sub51, true, false, -113822480);
				}
				client.WINDOW_PANE_ID = -1785861201;
				client.aClass437_8841 = new HashTable(8);
				Class397.method4912((short) 255);
				client.WINDOW_PANE_ID = -391544995 * HashTable.aClass371_5520.anInt4031;
				Class257.method2453(false, (byte) 8);
				Class360.method4301(-1204145082);
				Class14.method341(-257444687 * client.WINDOW_PANE_ID, null, 188692666);
			}
			Class360.aBoolean3912 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adv.fr(").append(')').toString());
		}
	}
}
