
/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class71 {
	Class505_Sub2 aClass505_Sub2_708;
	int anInt709;
	boolean aBool710 = true;
	Class74 aClass74_711;
	int anInt712;
	static final int anInt713 = 128;
	Interface6 anInterface6_714;
	int anInt715 = -1;
	int anInt716;
	Interface32 anInterface32_717;
	int anInt718;
	int anInt719;
	static final int anInt720 = 7;
	static int[] anIntArray721;
	static byte[] aByteArray722;

	void method1287() {
		if (((Class71) this).aBool710) {
			((Class71) this).aBool710 = false;
			byte[] is = ((Class74) ((Class71) this).aClass74_711).aByteArray736;
			int i = 0;
			int i_0_ = ((Class74) ((Class71) this).aClass74_711).anInt732;
			int i_1_ = (((Class71) this).anInt712 + (((Class71) this).anInt718 * ((Class74) ((Class71) this).aClass74_711).anInt732));
			for (int i_2_ = -128; i_2_ < 0; i_2_++) {
				i = (i << 8) - i;
				for (int i_3_ = -128; i_3_ < 0; i_3_++) {
					if (is[i_1_++] != 0)
						i++;
				}
				i_1_ += i_0_ - 128;
			}
			if (((Class71) this).anInterface6_714 != null && ((Class71) this).anInt715 == i)
				((Class71) this).aBool710 = false;
			else {
				((Class71) this).anInt715 = i;
				int i_4_ = 0;
				i_1_ = (((Class71) this).anInt712 + ((Class71) this).anInt718 * i_0_);
				if (((Class71) this).aClass505_Sub2_708.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
					if (aByteArray722 == null)
						aByteArray722 = new byte[16384];
					byte[] is_5_ = aByteArray722;
					for (int i_6_ = -128; i_6_ < 0; i_6_++) {
						for (int i_7_ = -128; i_7_ < 0; i_7_++) {
							if (is[i_1_] != 0)
								is_5_[i_4_++] = (byte) 68;
							else {
								int i_8_ = 0;
								if (is[i_1_ - 1] != 0)
									i_8_++;
								if (is[i_1_ + 1] != 0)
									i_8_++;
								if (is[i_1_ - i_0_] != 0)
									i_8_++;
								if (is[i_1_ + i_0_] != 0)
									i_8_++;
								is_5_[i_4_++] = (byte) (17 * i_8_);
							}
							i_1_++;
						}
						i_1_ += (((Class74) ((Class71) this).aClass74_711).anInt732) - 128;
					}
					if (((Class71) this).anInterface6_714 == null) {
						((Class71) this).anInterface6_714 = (((Class71) this).aClass505_Sub2_708.method13957(Class150.aClass150_1951, 128, 128, false, aByteArray722));
						((Class71) this).anInterface6_714.method50(false, false);
					} else
						((Class71) this).anInterface6_714.method52(0, 0, 128, 128, aByteArray722, Class150.aClass150_1951, 0, 128);
				} else {
					if (anIntArray721 == null)
						anIntArray721 = new int[16384];
					int[] is_9_ = anIntArray721;
					for (int i_10_ = -128; i_10_ < 0; i_10_++) {
						for (int i_11_ = -128; i_11_ < 0; i_11_++) {
							if (is[i_1_] != 0)
								is_9_[i_4_++] = 1140850688;
							else {
								int i_12_ = 0;
								if (is[i_1_ - 1] != 0)
									i_12_++;
								if (is[i_1_ + 1] != 0)
									i_12_++;
								if (is[i_1_ - i_0_] != 0)
									i_12_++;
								if (is[i_1_ + i_0_] != 0)
									i_12_++;
								is_9_[i_4_++] = 17 * i_12_ << 24;
							}
							i_1_++;
						}
						i_1_ += (((Class74) ((Class71) this).aClass74_711).anInt732) - 128;
					}
					if (((Class71) this).anInterface6_714 == null) {
						((Class71) this).anInterface6_714 = ((Class71) this).aClass505_Sub2_708.method14024(128, 128, false, anIntArray721);
						((Class71) this).anInterface6_714.method50(false, false);
					} else
						((Class71) this).anInterface6_714.method48(0, 0, 128, 128, anIntArray721, 0, 128);
				}
			}
		}
	}

	void method1288(Class48 class48) {
		method1290(class48, ((Class71) this).anInterface32_717, 0, ((Class71) this).anInt716);
	}

	void method1289() {
		if (((Class71) this).aBool710) {
			((Class71) this).aBool710 = false;
			byte[] is = ((Class74) ((Class71) this).aClass74_711).aByteArray736;
			int i = 0;
			int i_13_ = ((Class74) ((Class71) this).aClass74_711).anInt732;
			int i_14_ = (((Class71) this).anInt712 + (((Class71) this).anInt718 * ((Class74) ((Class71) this).aClass74_711).anInt732));
			for (int i_15_ = -128; i_15_ < 0; i_15_++) {
				i = (i << 8) - i;
				for (int i_16_ = -128; i_16_ < 0; i_16_++) {
					if (is[i_14_++] != 0)
						i++;
				}
				i_14_ += i_13_ - 128;
			}
			if (((Class71) this).anInterface6_714 != null && ((Class71) this).anInt715 == i)
				((Class71) this).aBool710 = false;
			else {
				((Class71) this).anInt715 = i;
				int i_17_ = 0;
				i_14_ = (((Class71) this).anInt712 + ((Class71) this).anInt718 * i_13_);
				if (((Class71) this).aClass505_Sub2_708.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
					if (aByteArray722 == null)
						aByteArray722 = new byte[16384];
					byte[] is_18_ = aByteArray722;
					for (int i_19_ = -128; i_19_ < 0; i_19_++) {
						for (int i_20_ = -128; i_20_ < 0; i_20_++) {
							if (is[i_14_] != 0)
								is_18_[i_17_++] = (byte) 68;
							else {
								int i_21_ = 0;
								if (is[i_14_ - 1] != 0)
									i_21_++;
								if (is[i_14_ + 1] != 0)
									i_21_++;
								if (is[i_14_ - i_13_] != 0)
									i_21_++;
								if (is[i_14_ + i_13_] != 0)
									i_21_++;
								is_18_[i_17_++] = (byte) (17 * i_21_);
							}
							i_14_++;
						}
						i_14_ += (((Class74) ((Class71) this).aClass74_711).anInt732) - 128;
					}
					if (((Class71) this).anInterface6_714 == null) {
						((Class71) this).anInterface6_714 = (((Class71) this).aClass505_Sub2_708.method13957(Class150.aClass150_1951, 128, 128, false, aByteArray722));
						((Class71) this).anInterface6_714.method50(false, false);
					} else
						((Class71) this).anInterface6_714.method52(0, 0, 128, 128, aByteArray722, Class150.aClass150_1951, 0, 128);
				} else {
					if (anIntArray721 == null)
						anIntArray721 = new int[16384];
					int[] is_22_ = anIntArray721;
					for (int i_23_ = -128; i_23_ < 0; i_23_++) {
						for (int i_24_ = -128; i_24_ < 0; i_24_++) {
							if (is[i_14_] != 0)
								is_22_[i_17_++] = 1140850688;
							else {
								int i_25_ = 0;
								if (is[i_14_ - 1] != 0)
									i_25_++;
								if (is[i_14_ + 1] != 0)
									i_25_++;
								if (is[i_14_ - i_13_] != 0)
									i_25_++;
								if (is[i_14_ + i_13_] != 0)
									i_25_++;
								is_22_[i_17_++] = 17 * i_25_ << 24;
							}
							i_14_++;
						}
						i_14_ += (((Class74) ((Class71) this).aClass74_711).anInt732) - 128;
					}
					if (((Class71) this).anInterface6_714 == null) {
						((Class71) this).anInterface6_714 = ((Class71) this).aClass505_Sub2_708.method14024(128, 128, false, anIntArray721);
						((Class71) this).anInterface6_714.method50(false, false);
					} else
						((Class71) this).anInterface6_714.method48(0, 0, 128, 128, anIntArray721, 0, 128);
				}
			}
		}
	}

	void method1290(Class48 class48, Interface32 interface32, int i, int i_26_) {
		if (i_26_ > 0) {
			method1293();
			((Class71) this).aClass505_Sub2_708.method13997(interface32);
			class48.anInterface6_452 = ((Class71) this).anInterface6_714;
			class48.anInt467 = ((Class71) this).anInt719;
			class48.anInt468 = ((Class71) this).anInt709 - ((Class71) this).anInt719 + 1;
			class48.anInt469 = i;
			class48.anInt470 = i_26_;
			class48.method965(0);
		}
	}

	void method1291(Class48 class48, Interface32 interface32, int i, int i_27_) {
		if (i_27_ > 0) {
			method1293();
			((Class71) this).aClass505_Sub2_708.method13997(interface32);
			class48.anInterface6_452 = ((Class71) this).anInterface6_714;
			class48.anInt467 = ((Class71) this).anInt719;
			class48.anInt468 = ((Class71) this).anInt709 - ((Class71) this).anInt719 + 1;
			class48.anInt469 = i;
			class48.anInt470 = i_27_;
			class48.method965(0);
		}
	}

	void method1292(Class48 class48, Interface32 interface32, int i, int i_28_) {
		if (i_28_ > 0) {
			method1293();
			((Class71) this).aClass505_Sub2_708.method13997(interface32);
			class48.anInterface6_452 = ((Class71) this).anInterface6_714;
			class48.anInt467 = ((Class71) this).anInt719;
			class48.anInt468 = ((Class71) this).anInt709 - ((Class71) this).anInt719 + 1;
			class48.anInt469 = i;
			class48.anInt470 = i_28_;
			class48.method965(0);
		}
	}

	void method1293() {
		if (((Class71) this).aBool710) {
			((Class71) this).aBool710 = false;
			byte[] is = ((Class74) ((Class71) this).aClass74_711).aByteArray736;
			int i = 0;
			int i_29_ = ((Class74) ((Class71) this).aClass74_711).anInt732;
			int i_30_ = (((Class71) this).anInt712 + (((Class71) this).anInt718 * ((Class74) ((Class71) this).aClass74_711).anInt732));
			for (int i_31_ = -128; i_31_ < 0; i_31_++) {
				i = (i << 8) - i;
				for (int i_32_ = -128; i_32_ < 0; i_32_++) {
					if (is[i_30_++] != 0)
						i++;
				}
				i_30_ += i_29_ - 128;
			}
			if (((Class71) this).anInterface6_714 != null && ((Class71) this).anInt715 == i)
				((Class71) this).aBool710 = false;
			else {
				((Class71) this).anInt715 = i;
				int i_33_ = 0;
				i_30_ = (((Class71) this).anInt712 + ((Class71) this).anInt718 * i_29_);
				if (((Class71) this).aClass505_Sub2_708.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
					if (aByteArray722 == null)
						aByteArray722 = new byte[16384];
					byte[] is_34_ = aByteArray722;
					for (int i_35_ = -128; i_35_ < 0; i_35_++) {
						for (int i_36_ = -128; i_36_ < 0; i_36_++) {
							if (is[i_30_] != 0)
								is_34_[i_33_++] = (byte) 68;
							else {
								int i_37_ = 0;
								if (is[i_30_ - 1] != 0)
									i_37_++;
								if (is[i_30_ + 1] != 0)
									i_37_++;
								if (is[i_30_ - i_29_] != 0)
									i_37_++;
								if (is[i_30_ + i_29_] != 0)
									i_37_++;
								is_34_[i_33_++] = (byte) (17 * i_37_);
							}
							i_30_++;
						}
						i_30_ += (((Class74) ((Class71) this).aClass74_711).anInt732) - 128;
					}
					if (((Class71) this).anInterface6_714 == null) {
						((Class71) this).anInterface6_714 = (((Class71) this).aClass505_Sub2_708.method13957(Class150.aClass150_1951, 128, 128, false, aByteArray722));
						((Class71) this).anInterface6_714.method50(false, false);
					} else
						((Class71) this).anInterface6_714.method52(0, 0, 128, 128, aByteArray722, Class150.aClass150_1951, 0, 128);
				} else {
					if (anIntArray721 == null)
						anIntArray721 = new int[16384];
					int[] is_38_ = anIntArray721;
					for (int i_39_ = -128; i_39_ < 0; i_39_++) {
						for (int i_40_ = -128; i_40_ < 0; i_40_++) {
							if (is[i_30_] != 0)
								is_38_[i_33_++] = 1140850688;
							else {
								int i_41_ = 0;
								if (is[i_30_ - 1] != 0)
									i_41_++;
								if (is[i_30_ + 1] != 0)
									i_41_++;
								if (is[i_30_ - i_29_] != 0)
									i_41_++;
								if (is[i_30_ + i_29_] != 0)
									i_41_++;
								is_38_[i_33_++] = 17 * i_41_ << 24;
							}
							i_30_++;
						}
						i_30_ += (((Class74) ((Class71) this).aClass74_711).anInt732) - 128;
					}
					if (((Class71) this).anInterface6_714 == null) {
						((Class71) this).anInterface6_714 = ((Class71) this).aClass505_Sub2_708.method14024(128, 128, false, anIntArray721);
						((Class71) this).anInterface6_714.method50(false, false);
					} else
						((Class71) this).anInterface6_714.method48(0, 0, 128, 128, anIntArray721, 0, 128);
				}
			}
		}
	}

	void method1294() {
		if (((Class71) this).aBool710) {
			((Class71) this).aBool710 = false;
			byte[] is = ((Class74) ((Class71) this).aClass74_711).aByteArray736;
			int i = 0;
			int i_42_ = ((Class74) ((Class71) this).aClass74_711).anInt732;
			int i_43_ = (((Class71) this).anInt712 + (((Class71) this).anInt718 * ((Class74) ((Class71) this).aClass74_711).anInt732));
			for (int i_44_ = -128; i_44_ < 0; i_44_++) {
				i = (i << 8) - i;
				for (int i_45_ = -128; i_45_ < 0; i_45_++) {
					if (is[i_43_++] != 0)
						i++;
				}
				i_43_ += i_42_ - 128;
			}
			if (((Class71) this).anInterface6_714 != null && ((Class71) this).anInt715 == i)
				((Class71) this).aBool710 = false;
			else {
				((Class71) this).anInt715 = i;
				int i_46_ = 0;
				i_43_ = (((Class71) this).anInt712 + ((Class71) this).anInt718 * i_42_);
				if (((Class71) this).aClass505_Sub2_708.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
					if (aByteArray722 == null)
						aByteArray722 = new byte[16384];
					byte[] is_47_ = aByteArray722;
					for (int i_48_ = -128; i_48_ < 0; i_48_++) {
						for (int i_49_ = -128; i_49_ < 0; i_49_++) {
							if (is[i_43_] != 0)
								is_47_[i_46_++] = (byte) 68;
							else {
								int i_50_ = 0;
								if (is[i_43_ - 1] != 0)
									i_50_++;
								if (is[i_43_ + 1] != 0)
									i_50_++;
								if (is[i_43_ - i_42_] != 0)
									i_50_++;
								if (is[i_43_ + i_42_] != 0)
									i_50_++;
								is_47_[i_46_++] = (byte) (17 * i_50_);
							}
							i_43_++;
						}
						i_43_ += (((Class74) ((Class71) this).aClass74_711).anInt732) - 128;
					}
					if (((Class71) this).anInterface6_714 == null) {
						((Class71) this).anInterface6_714 = (((Class71) this).aClass505_Sub2_708.method13957(Class150.aClass150_1951, 128, 128, false, aByteArray722));
						((Class71) this).anInterface6_714.method50(false, false);
					} else
						((Class71) this).anInterface6_714.method52(0, 0, 128, 128, aByteArray722, Class150.aClass150_1951, 0, 128);
				} else {
					if (anIntArray721 == null)
						anIntArray721 = new int[16384];
					int[] is_51_ = anIntArray721;
					for (int i_52_ = -128; i_52_ < 0; i_52_++) {
						for (int i_53_ = -128; i_53_ < 0; i_53_++) {
							if (is[i_43_] != 0)
								is_51_[i_46_++] = 1140850688;
							else {
								int i_54_ = 0;
								if (is[i_43_ - 1] != 0)
									i_54_++;
								if (is[i_43_ + 1] != 0)
									i_54_++;
								if (is[i_43_ - i_42_] != 0)
									i_54_++;
								if (is[i_43_ + i_42_] != 0)
									i_54_++;
								is_51_[i_46_++] = 17 * i_54_ << 24;
							}
							i_43_++;
						}
						i_43_ += (((Class74) ((Class71) this).aClass74_711).anInt732) - 128;
					}
					if (((Class71) this).anInterface6_714 == null) {
						((Class71) this).anInterface6_714 = ((Class71) this).aClass505_Sub2_708.method14024(128, 128, false, anIntArray721);
						((Class71) this).anInterface6_714.method50(false, false);
					} else
						((Class71) this).anInterface6_714.method48(0, 0, 128, 128, anIntArray721, 0, 128);
				}
			}
		}
	}

	Class71(Class505_Sub2 class505_sub2, Class74 class74, Class390_Sub1 class390_sub1, int i, int i_55_, int i_56_, int i_57_, int i_58_) {
		((Class71) this).aClass505_Sub2_708 = class505_sub2;
		((Class71) this).aClass74_711 = class74;
		((Class71) this).anInt712 = i_57_;
		((Class71) this).anInt718 = i_58_;
		int i_59_ = 1 << i_56_;
		int i_60_ = 0;
		int i_61_ = i << i_56_;
		int i_62_ = i_55_ << i_56_;
		for (int i_63_ = 0; i_63_ < i_59_; i_63_++) {
			int i_64_ = ((i_62_ + i_63_) * (class390_sub1.anInt4776 * -1843860823) + i_61_);
			for (int i_65_ = 0; i_65_ < i_59_; i_65_++) {
				short[] is = (((Class390_Sub1) class390_sub1).aShortArrayArray8534[i_64_++]);
				if (is != null)
					i_60_ += is.length;
			}
		}
		if (i_60_ > 0) {
			((Class71) this).anInt709 = -2147483648;
			((Class71) this).anInt719 = 2147483647;
			((Class71) this).anInterface32_717 = ((Class71) this).aClass505_Sub2_708.method13993(false);
			((Class71) this).anInterface32_717.method208(i_60_);
			ByteBuffer bytebuffer = ((Class71) this).aClass505_Sub2_708.aByteBuffer8838;
			bytebuffer.clear();
			for (int i_66_ = 0; i_66_ < i_59_; i_66_++) {
				int i_67_ = ((i_62_ + i_66_) * (class390_sub1.anInt4776 * -1843860823) + i_61_);
				for (int i_68_ = 0; i_68_ < i_59_; i_68_++) {
					short[] is = (((Class390_Sub1) class390_sub1).aShortArrayArray8534[i_67_++]);
					if (is != null) {
						for (int i_69_ = 0; i_69_ < is.length; i_69_++) {
							int i_70_ = is[i_69_] & 0xffff;
							if (i_70_ < ((Class71) this).anInt719)
								((Class71) this).anInt719 = i_70_;
							if (i_70_ > ((Class71) this).anInt709)
								((Class71) this).anInt709 = i_70_;
							bytebuffer.putShort((short) i_70_);
						}
					}
				}
			}
			((Class71) this).anInterface32_717.method42(0, bytebuffer.position(), (((Class71) this).aClass505_Sub2_708.aLong8695));
			((Class71) this).anInt716 = i_60_ / 3;
		} else {
			((Class71) this).anInt716 = 0;
			((Class71) this).anInterface6_714 = null;
		}
	}
}
