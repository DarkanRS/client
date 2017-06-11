/* Class298_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub34 extends Linkable {
	byte[] aByteArray7386;
	Class298_Sub26_Sub1[] aClass298_Sub26_Sub1Array7387 = new Class298_Sub26_Sub1[128];
	byte[] aByteArray7388;
	int anInt7389;
	short[] aShortArray7390 = new short[128];
	Class104[] aClass104Array7391;
	byte[] aByteArray7392;
	int[] anIntArray7393;

	boolean method3397(Class272 class272, byte[] is, int[] is_0_, int i) {
		try {
			boolean bool = true;
			int i_1_ = 0;
			Class298_Sub26_Sub1 class298_sub26_sub1 = null;
			for (int i_2_ = 0; i_2_ < 128; i_2_++) {
				if (null == is || is[i_2_] != 0) {
					int i_3_ = ((Class298_Sub34) this).anIntArray7393[i_2_];
					if (0 == i_3_) {
						if (i <= 1962237353) {
							/* empty */
						}
					} else {
						if (i_3_ != i_1_) {
							i_1_ = i_3_;
							i_3_--;
							if (0 == (i_3_ & 0x1))
								class298_sub26_sub1 = class272.method2551(i_3_ >> 2, is_0_, -1617127101);
							else
								class298_sub26_sub1 = class272.method2552(i_3_ >> 2, is_0_, (byte) 92);
							if (null == class298_sub26_sub1)
								bool = false;
						}
						if (null != class298_sub26_sub1) {
							((Class298_Sub34) this).aClass298_Sub26_Sub1Array7387[i_2_] = class298_sub26_sub1;
							((Class298_Sub34) this).anIntArray7393[i_2_] = 0;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abs.f(").append(')').toString());
		}
	}

	Class298_Sub34(byte[] is) {
		((Class298_Sub34) this).aByteArray7388 = new byte[128];
		((Class298_Sub34) this).aByteArray7392 = new byte[128];
		((Class298_Sub34) this).aClass104Array7391 = new Class104[128];
		((Class298_Sub34) this).aByteArray7386 = new byte[128];
		((Class298_Sub34) this).anIntArray7393 = new int[128];
		RsByteBuffer class298_sub53 = new RsByteBuffer(is);
		int i;
		for (i = 0; 0 != (class298_sub53.buffer[i + 385051775 * class298_sub53.index]); i++) {
			/* empty */
		}
		byte[] is_4_ = new byte[i];
		for (int i_5_ = 0; i_5_ < i; i_5_++)
			is_4_[i_5_] = class298_sub53.readByte(-12558881);
		class298_sub53.index += 116413311;
		i++;
		int i_6_ = 385051775 * class298_sub53.index;
		class298_sub53.index += 116413311 * i;
		int i_7_;
		for (i_7_ = 0; ((class298_sub53.buffer[class298_sub53.index * 385051775 + i_7_]) != 0); i_7_++) {
			/* empty */
		}
		byte[] is_8_ = new byte[i_7_];
		for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
			is_8_[i_9_] = class298_sub53.readByte(-12558881);
		class298_sub53.index += 116413311;
		i_7_++;
		int i_10_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_7_ * 116413311;
		int i_11_;
		for (i_11_ = 0; ((class298_sub53.buffer[385051775 * class298_sub53.index + i_11_]) != 0); i_11_++) {
			/* empty */
		}
		byte[] is_12_ = new byte[i_11_];
		for (int i_13_ = 0; i_13_ < i_11_; i_13_++)
			is_12_[i_13_] = class298_sub53.readByte(-12558881);
		class298_sub53.index += 116413311;
		byte[] is_14_ = new byte[++i_11_];
		int i_15_;
		if (i_11_ > 1) {
			is_14_[1] = (byte) 1;
			int i_16_ = 1;
			i_15_ = 2;
			for (int i_17_ = 2; i_17_ < i_11_; i_17_++) {
				int i_18_ = class298_sub53.readUnsignedByte();
				if (i_18_ == 0)
					i_16_ = i_15_++;
				else {
					if (i_18_ <= i_16_)
						i_18_--;
					i_16_ = i_18_;
				}
				is_14_[i_17_] = (byte) i_16_;
			}
		} else
			i_15_ = i_11_;
		Class104[] class104s = new Class104[i_15_];
		for (int i_19_ = 0; i_19_ < class104s.length; i_19_++) {
			Class104 class104 = class104s[i_19_] = new Class104();
			int i_20_ = class298_sub53.readUnsignedByte();
			if (i_20_ > 0)
				((Class104) class104).aByteArray1114 = new byte[i_20_ * 2];
			i_20_ = class298_sub53.readUnsignedByte();
			if (i_20_ > 0) {
				((Class104) class104).aByteArray1110 = new byte[2 + 2 * i_20_];
				((Class104) class104).aByteArray1110[1] = (byte) 64;
			}
		}
		int i_21_ = class298_sub53.readUnsignedByte();
		byte[] is_22_ = i_21_ > 0 ? new byte[i_21_ * 2] : null;
		i_21_ = class298_sub53.readUnsignedByte();
		byte[] is_23_ = i_21_ > 0 ? new byte[i_21_ * 2] : null;
		int i_24_;
		for (i_24_ = 0; ((class298_sub53.buffer[i_24_ + 385051775 * class298_sub53.index]) != 0); i_24_++) {
			/* empty */
		}
		byte[] is_25_ = new byte[i_24_];
		for (int i_26_ = 0; i_26_ < i_24_; i_26_++)
			is_25_[i_26_] = class298_sub53.readByte(-12558881);
		class298_sub53.index += 116413311;
		i_24_++;
		int i_27_ = 0;
		for (int i_28_ = 0; i_28_ < 128; i_28_++) {
			i_27_ += class298_sub53.readUnsignedByte();
			((Class298_Sub34) this).aShortArray7390[i_28_] = (short) i_27_;
		}
		i_27_ = 0;
		for (int i_29_ = 0; i_29_ < 128; i_29_++) {
			i_27_ += class298_sub53.readUnsignedByte();
			((Class298_Sub34) this).aShortArray7390[i_29_] += i_27_ << 8;
		}
		int i_30_ = 0;
		int i_31_ = 0;
		int i_32_ = 0;
		for (int i_33_ = 0; i_33_ < 128; i_33_++) {
			if (i_30_ == 0) {
				if (i_31_ < is_25_.length)
					i_30_ = is_25_[i_31_++];
				else
					i_30_ = -1;
				i_32_ = class298_sub53.method3609(1692297361);
			}
			((Class298_Sub34) this).aShortArray7390[i_33_] += (i_32_ - 1 & 0x2) << 14;
			((Class298_Sub34) this).anIntArray7393[i_33_] = i_32_;
			i_30_--;
		}
		i_30_ = 0;
		i_31_ = 0;
		int i_34_ = 0;
		for (int i_35_ = 0; i_35_ < 128; i_35_++) {
			if (((Class298_Sub34) this).anIntArray7393[i_35_] != 0) {
				if (0 == i_30_) {
					if (i_31_ < is_4_.length)
						i_30_ = is_4_[i_31_++];
					else
						i_30_ = -1;
					i_34_ = class298_sub53.buffer[i_6_++] - 1;
				}
				((Class298_Sub34) this).aByteArray7386[i_35_] = (byte) i_34_;
				i_30_--;
			}
		}
		i_30_ = 0;
		i_31_ = 0;
		int i_36_ = 0;
		for (int i_37_ = 0; i_37_ < 128; i_37_++) {
			if (((Class298_Sub34) this).anIntArray7393[i_37_] != 0) {
				if (0 == i_30_) {
					if (i_31_ < is_8_.length)
						i_30_ = is_8_[i_31_++];
					else
						i_30_ = -1;
					i_36_ = class298_sub53.buffer[i_10_++] + 16 << 2;
				}
				((Class298_Sub34) this).aByteArray7392[i_37_] = (byte) i_36_;
				i_30_--;
			}
		}
		i_30_ = 0;
		i_31_ = 0;
		Class104 class104 = null;
		for (int i_38_ = 0; i_38_ < 128; i_38_++) {
			if (((Class298_Sub34) this).anIntArray7393[i_38_] != 0) {
				if (i_30_ == 0) {
					class104 = class104s[is_14_[i_31_]];
					if (i_31_ < is_12_.length)
						i_30_ = is_12_[i_31_++];
					else
						i_30_ = -1;
				}
				((Class298_Sub34) this).aClass104Array7391[i_38_] = class104;
				i_30_--;
			}
		}
		i_30_ = 0;
		i_31_ = 0;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < 128; i_40_++) {
			if (i_30_ == 0) {
				if (i_31_ < is_25_.length)
					i_30_ = is_25_[i_31_++];
				else
					i_30_ = -1;
				if (((Class298_Sub34) this).anIntArray7393[i_40_] > 0)
					i_39_ = class298_sub53.readUnsignedByte() + 1;
			}
			((Class298_Sub34) this).aByteArray7388[i_40_] = (byte) i_39_;
			i_30_--;
		}
		((Class298_Sub34) this).anInt7389 = (class298_sub53.readUnsignedByte() + 1) * 306353405;
		for (int i_41_ = 0; i_41_ < i_15_; i_41_++) {
			Class104 class104_42_ = class104s[i_41_];
			if (null != ((Class104) class104_42_).aByteArray1114) {
				for (int i_43_ = 1; i_43_ < ((Class104) class104_42_).aByteArray1114.length; i_43_ += 2)
					((Class104) class104_42_).aByteArray1114[i_43_] = class298_sub53.readByte(-12558881);
			}
			if (null != ((Class104) class104_42_).aByteArray1110) {
				for (int i_44_ = 3; (i_44_ < ((Class104) class104_42_).aByteArray1110.length - 2); i_44_ += 2)
					((Class104) class104_42_).aByteArray1110[i_44_] = class298_sub53.readByte(-12558881);
			}
		}
		if (is_22_ != null) {
			for (int i_45_ = 1; i_45_ < is_22_.length; i_45_ += 2)
				is_22_[i_45_] = class298_sub53.readByte(-12558881);
		}
		if (null != is_23_) {
			for (int i_46_ = 1; i_46_ < is_23_.length; i_46_ += 2)
				is_23_[i_46_] = class298_sub53.readByte(-12558881);
		}
		for (int i_47_ = 0; i_47_ < i_15_; i_47_++) {
			Class104 class104_48_ = class104s[i_47_];
			if (((Class104) class104_48_).aByteArray1110 != null) {
				i_27_ = 0;
				for (int i_49_ = 2; i_49_ < ((Class104) class104_48_).aByteArray1110.length; i_49_ += 2) {
					i_27_ = 1 + i_27_ + class298_sub53.readUnsignedByte();
					((Class104) class104_48_).aByteArray1110[i_49_] = (byte) i_27_;
				}
			}
		}
		for (int i_50_ = 0; i_50_ < i_15_; i_50_++) {
			Class104 class104_51_ = class104s[i_50_];
			if (((Class104) class104_51_).aByteArray1114 != null) {
				i_27_ = 0;
				for (int i_52_ = 2; i_52_ < ((Class104) class104_51_).aByteArray1114.length; i_52_ += 2) {
					i_27_ = i_27_ + 1 + class298_sub53.readUnsignedByte();
					((Class104) class104_51_).aByteArray1114[i_52_] = (byte) i_27_;
				}
			}
		}
		if (null != is_22_) {
			i_27_ = class298_sub53.readUnsignedByte();
			is_22_[0] = (byte) i_27_;
			for (int i_53_ = 2; i_53_ < is_22_.length; i_53_ += 2) {
				i_27_ = i_27_ + 1 + class298_sub53.readUnsignedByte();
				is_22_[i_53_] = (byte) i_27_;
			}
			int i_54_ = is_22_[0];
			int i_55_ = is_22_[1];
			for (int i_56_ = 0; i_56_ < i_54_; i_56_++)
				((Class298_Sub34) this).aByteArray7388[i_56_] = (byte) (i_55_ * (((Class298_Sub34) this).aByteArray7388[i_56_]) + 32 >> 6);
			for (int i_57_ = 2; i_57_ < is_22_.length; i_57_ += 2) {
				int i_58_ = is_22_[i_57_];
				int i_59_ = is_22_[i_57_ + 1];
				int i_60_ = (i_58_ - i_54_) * i_55_ + (i_58_ - i_54_) / 2;
				for (int i_61_ = i_54_; i_61_ < i_58_; i_61_++) {
					int i_62_ = Class304.method3740(i_60_, i_58_ - i_54_, -498753873);
					((Class298_Sub34) this).aByteArray7388[i_61_] = (byte) ((((Class298_Sub34) this).aByteArray7388[i_61_]) * i_62_ + 32 >> 6);
					i_60_ += i_59_ - i_55_;
				}
				i_54_ = i_58_;
				i_55_ = i_59_;
			}
			for (int i_63_ = i_54_; i_63_ < 128; i_63_++)
				((Class298_Sub34) this).aByteArray7388[i_63_] = (byte) ((((Class298_Sub34) this).aByteArray7388[i_63_] * i_55_) + 32 >> 6);
			Object object = null;
		}
		if (null != is_23_) {
			i_27_ = class298_sub53.readUnsignedByte();
			is_23_[0] = (byte) i_27_;
			for (int i_64_ = 2; i_64_ < is_23_.length; i_64_ += 2) {
				i_27_ = 1 + i_27_ + class298_sub53.readUnsignedByte();
				is_23_[i_64_] = (byte) i_27_;
			}
			int i_65_ = is_23_[0];
			int i_66_ = is_23_[1] << 1;
			for (int i_67_ = 0; i_67_ < i_65_; i_67_++) {
				int i_68_ = ((((Class298_Sub34) this).aByteArray7392[i_67_] & 0xff) + i_66_);
				if (i_68_ < 0)
					i_68_ = 0;
				if (i_68_ > 128)
					i_68_ = 128;
				((Class298_Sub34) this).aByteArray7392[i_67_] = (byte) i_68_;
			}
			for (int i_69_ = 2; i_69_ < is_23_.length; i_69_ += 2) {
				int i_70_ = is_23_[i_69_];
				int i_71_ = is_23_[i_69_ + 1] << 1;
				int i_72_ = (i_70_ - i_65_) / 2 + (i_70_ - i_65_) * i_66_;
				for (int i_73_ = i_65_; i_73_ < i_70_; i_73_++) {
					int i_74_ = Class304.method3740(i_72_, i_70_ - i_65_, -1209989239);
					int i_75_ = (i_74_ + (((Class298_Sub34) this).aByteArray7392[i_73_] & 0xff));
					if (i_75_ < 0)
						i_75_ = 0;
					if (i_75_ > 128)
						i_75_ = 128;
					((Class298_Sub34) this).aByteArray7392[i_73_] = (byte) i_75_;
					i_72_ += i_71_ - i_66_;
				}
				i_65_ = i_70_;
				i_66_ = i_71_;
			}
			for (int i_76_ = i_65_; i_76_ < 128; i_76_++) {
				int i_77_ = i_66_ + (((Class298_Sub34) this).aByteArray7392[i_76_] & 0xff);
				if (i_77_ < 0)
					i_77_ = 0;
				if (i_77_ > 128)
					i_77_ = 128;
				((Class298_Sub34) this).aByteArray7392[i_76_] = (byte) i_77_;
			}
			Object object = null;
		}
		for (int i_78_ = 0; i_78_ < i_15_; i_78_++)
			((Class104) class104s[i_78_]).anInt1111 = class298_sub53.readUnsignedByte() * 890917585;
		for (int i_79_ = 0; i_79_ < i_15_; i_79_++) {
			Class104 class104_80_ = class104s[i_79_];
			if (((Class104) class104_80_).aByteArray1114 != null)
				((Class104) class104_80_).anInt1112 = class298_sub53.readUnsignedByte() * 1553889121;
			if (((Class104) class104_80_).aByteArray1110 != null)
				((Class104) class104_80_).anInt1113 = class298_sub53.readUnsignedByte() * -1467946285;
			if (1753302577 * ((Class104) class104_80_).anInt1111 > 0)
				((Class104) class104_80_).anInt1109 = class298_sub53.readUnsignedByte() * 189354207;
		}
		for (int i_81_ = 0; i_81_ < i_15_; i_81_++)
			((Class104) class104s[i_81_]).anInt1116 = class298_sub53.readUnsignedByte() * 419117413;
		for (int i_82_ = 0; i_82_ < i_15_; i_82_++) {
			Class104 class104_83_ = class104s[i_82_];
			if (430264429 * ((Class104) class104_83_).anInt1116 > 0)
				((Class104) class104_83_).anInt1115 = class298_sub53.readUnsignedByte() * -1131925083;
		}
		for (int i_84_ = 0; i_84_ < i_15_; i_84_++) {
			Class104 class104_85_ = class104s[i_84_];
			if (((Class104) class104_85_).anInt1115 * 671305261 > 0)
				((Class104) class104_85_).anInt1117 = class298_sub53.readUnsignedByte() * 1175770411;
		}
	}

	void method3398(byte i) {
		try {
			((Class298_Sub34) this).anIntArray7393 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abs.b(").append(')').toString());
		}
	}
}
