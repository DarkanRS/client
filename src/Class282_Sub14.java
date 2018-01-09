/* Class282_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub14 extends Node {
	Class282_Sub26_Sub1[] aClass282_Sub26_Sub1Array7589 = new Class282_Sub26_Sub1[128];
	short[] aShortArray7590 = new short[128];
	byte[] aByteArray7591;
	byte[] aByteArray7592 = new byte[128];
	int anInt7593;
	Class110[] aClass110Array7594;
	byte[] aByteArray7595;
	int[] anIntArray7596;
	static int anInt7597;

	boolean method12216(Class250 class250, byte[] is, int[] is_0_, int i) {
		boolean bool = true;
		int i_1_ = 0;
		Class282_Sub26_Sub1 class282_sub26_sub1 = null;
		for (int i_2_ = 0; i_2_ < 128; i_2_++) {
			if (null == is || 0 != is[i_2_]) {
				int i_3_ = ((Class282_Sub14) this).anIntArray7596[i_2_];
				if (i_3_ != 0) {
					if (i_3_ != i_1_) {
						i_1_ = i_3_;
						i_3_--;
						if (0 == (i_3_ & 0x1))
							class282_sub26_sub1 = class250.method4290(i_3_ >> 2, is_0_, (byte) 36);
						else
							class282_sub26_sub1 = class250.method4287(i_3_ >> 2, is_0_, -2001370194);
						if (null == class282_sub26_sub1)
							bool = false;
					}
					if (class282_sub26_sub1 != null) {
						((Class282_Sub14) this).aClass282_Sub26_Sub1Array7589[i_2_] = class282_sub26_sub1;
						((Class282_Sub14) this).anIntArray7596[i_2_] = 0;
					}
				}
			}
		}
		return bool;
	}

	void method12217(short i) {
		((Class282_Sub14) this).anIntArray7596 = null;
	}

	boolean method12218(Class250 class250, byte[] is, int[] is_4_) {
		boolean bool = true;
		int i = 0;
		Class282_Sub26_Sub1 class282_sub26_sub1 = null;
		for (int i_5_ = 0; i_5_ < 128; i_5_++) {
			if (null == is || 0 != is[i_5_]) {
				int i_6_ = ((Class282_Sub14) this).anIntArray7596[i_5_];
				if (i_6_ != 0) {
					if (i_6_ != i) {
						i = i_6_;
						i_6_--;
						if (0 == (i_6_ & 0x1))
							class282_sub26_sub1 = class250.method4290(i_6_ >> 2, is_4_, (byte) 48);
						else
							class282_sub26_sub1 = class250.method4287(i_6_ >> 2, is_4_, -2017856096);
						if (null == class282_sub26_sub1)
							bool = false;
					}
					if (class282_sub26_sub1 != null) {
						((Class282_Sub14) this).aClass282_Sub26_Sub1Array7589[i_5_] = class282_sub26_sub1;
						((Class282_Sub14) this).anIntArray7596[i_5_] = 0;
					}
				}
			}
		}
		return bool;
	}

	Class282_Sub14(byte[] is) {
		((Class282_Sub14) this).aByteArray7591 = new byte[128];
		((Class282_Sub14) this).aClass110Array7594 = new Class110[128];
		((Class282_Sub14) this).aByteArray7595 = new byte[128];
		((Class282_Sub14) this).anIntArray7596 = new int[128];
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i;
		for (i = 0; ((class282_sub35.buffer[-1990677291 * class282_sub35.index + i]) != 0); i++) {
			/* empty */
		}
		byte[] is_7_ = new byte[i];
		for (int i_8_ = 0; i_8_ < i; i_8_++)
			is_7_[i_8_] = class282_sub35.readByte((short) -13939);
		class282_sub35.index += -1115476867;
		i++;
		int i_9_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i * -1115476867;
		int i_10_;
		for (i_10_ = 0; ((class282_sub35.buffer[-1990677291 * class282_sub35.index + i_10_]) != 0); i_10_++) {
			/* empty */
		}
		byte[] is_11_ = new byte[i_10_];
		for (int i_12_ = 0; i_12_ < i_10_; i_12_++)
			is_11_[i_12_] = class282_sub35.readByte((short) -32520);
		class282_sub35.index += -1115476867;
		i_10_++;
		int i_13_ = -1990677291 * class282_sub35.index;
		class282_sub35.index += -1115476867 * i_10_;
		int i_14_;
		for (i_14_ = 0; ((class282_sub35.buffer[i_14_ + class282_sub35.index * -1990677291]) != 0); i_14_++) {
			/* empty */
		}
		byte[] is_15_ = new byte[i_14_];
		for (int i_16_ = 0; i_16_ < i_14_; i_16_++)
			is_15_[i_16_] = class282_sub35.readByte((short) -20480);
		class282_sub35.index += -1115476867;
		byte[] is_17_ = new byte[++i_14_];
		int i_18_;
		if (i_14_ > 1) {
			is_17_[1] = (byte) 1;
			int i_19_ = 1;
			i_18_ = 2;
			for (int i_20_ = 2; i_20_ < i_14_; i_20_++) {
				int i_21_ = class282_sub35.readUnsignedByte();
				if (i_21_ == 0)
					i_19_ = i_18_++;
				else {
					if (i_21_ <= i_19_)
						i_21_--;
					i_19_ = i_21_;
				}
				is_17_[i_20_] = (byte) i_19_;
			}
		} else
			i_18_ = i_14_;
		Class110[] class110s = new Class110[i_18_];
		for (int i_22_ = 0; i_22_ < class110s.length; i_22_++) {
			Class110 class110 = class110s[i_22_] = new Class110();
			int i_23_ = class282_sub35.readUnsignedByte();
			if (i_23_ > 0)
				((Class110) class110).aByteArray1097 = new byte[2 * i_23_];
			i_23_ = class282_sub35.readUnsignedByte();
			if (i_23_ > 0) {
				((Class110) class110).aByteArray1094 = new byte[2 * i_23_ + 2];
				((Class110) class110).aByteArray1094[1] = (byte) 64;
			}
		}
		int i_24_ = class282_sub35.readUnsignedByte();
		byte[] is_25_ = i_24_ > 0 ? new byte[2 * i_24_] : null;
		i_24_ = class282_sub35.readUnsignedByte();
		byte[] is_26_ = i_24_ > 0 ? new byte[i_24_ * 2] : null;
		int i_27_;
		for (i_27_ = 0; 0 != (class282_sub35.buffer[i_27_ + -1990677291 * class282_sub35.index]); i_27_++) {
			/* empty */
		}
		byte[] is_28_ = new byte[i_27_];
		for (int i_29_ = 0; i_29_ < i_27_; i_29_++)
			is_28_[i_29_] = class282_sub35.readByte((short) -2803);
		class282_sub35.index += -1115476867;
		i_27_++;
		int i_30_ = 0;
		for (int i_31_ = 0; i_31_ < 128; i_31_++) {
			i_30_ += class282_sub35.readUnsignedByte();
			((Class282_Sub14) this).aShortArray7590[i_31_] = (short) i_30_;
		}
		i_30_ = 0;
		for (int i_32_ = 0; i_32_ < 128; i_32_++) {
			i_30_ += class282_sub35.readUnsignedByte();
			((Class282_Sub14) this).aShortArray7590[i_32_] += i_30_ << 8;
		}
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		for (int i_36_ = 0; i_36_ < 128; i_36_++) {
			if (i_33_ == 0) {
				if (i_34_ < is_28_.length)
					i_33_ = is_28_[i_34_++];
				else
					i_33_ = -1;
				i_35_ = class282_sub35.method13099(774797043);
			}
			((Class282_Sub14) this).aShortArray7590[i_36_] += (i_35_ - 1 & 0x2) << 14;
			((Class282_Sub14) this).anIntArray7596[i_36_] = i_35_;
			i_33_--;
		}
		i_33_ = 0;
		i_34_ = 0;
		int i_37_ = 0;
		for (int i_38_ = 0; i_38_ < 128; i_38_++) {
			if (0 != ((Class282_Sub14) this).anIntArray7596[i_38_]) {
				if (i_33_ == 0) {
					if (i_34_ < is_7_.length)
						i_33_ = is_7_[i_34_++];
					else
						i_33_ = -1;
					i_37_ = class282_sub35.buffer[i_9_++] - 1;
				}
				((Class282_Sub14) this).aByteArray7595[i_38_] = (byte) i_37_;
				i_33_--;
			}
		}
		i_33_ = 0;
		i_34_ = 0;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < 128; i_40_++) {
			if (0 != ((Class282_Sub14) this).anIntArray7596[i_40_]) {
				if (0 == i_33_) {
					if (i_34_ < is_11_.length)
						i_33_ = is_11_[i_34_++];
					else
						i_33_ = -1;
					i_39_ = class282_sub35.buffer[i_13_++] + 16 << 2;
				}
				((Class282_Sub14) this).aByteArray7591[i_40_] = (byte) i_39_;
				i_33_--;
			}
		}
		i_33_ = 0;
		i_34_ = 0;
		Class110 class110 = null;
		for (int i_41_ = 0; i_41_ < 128; i_41_++) {
			if (((Class282_Sub14) this).anIntArray7596[i_41_] != 0) {
				if (0 == i_33_) {
					class110 = class110s[is_17_[i_34_]];
					if (i_34_ < is_15_.length)
						i_33_ = is_15_[i_34_++];
					else
						i_33_ = -1;
				}
				((Class282_Sub14) this).aClass110Array7594[i_41_] = class110;
				i_33_--;
			}
		}
		i_33_ = 0;
		i_34_ = 0;
		int i_42_ = 0;
		for (int i_43_ = 0; i_43_ < 128; i_43_++) {
			if (i_33_ == 0) {
				if (i_34_ < is_28_.length)
					i_33_ = is_28_[i_34_++];
				else
					i_33_ = -1;
				if (((Class282_Sub14) this).anIntArray7596[i_43_] > 0)
					i_42_ = class282_sub35.readUnsignedByte() + 1;
			}
			((Class282_Sub14) this).aByteArray7592[i_43_] = (byte) i_42_;
			i_33_--;
		}
		((Class282_Sub14) this).anInt7593 = (class282_sub35.readUnsignedByte() + 1) * 1110930319;
		for (int i_44_ = 0; i_44_ < i_18_; i_44_++) {
			Class110 class110_45_ = class110s[i_44_];
			if (null != ((Class110) class110_45_).aByteArray1097) {
				for (int i_46_ = 1; i_46_ < ((Class110) class110_45_).aByteArray1097.length; i_46_ += 2)
					((Class110) class110_45_).aByteArray1097[i_46_] = class282_sub35.readByte((short) -27725);
			}
			if (null != ((Class110) class110_45_).aByteArray1094) {
				for (int i_47_ = 3; (i_47_ < ((Class110) class110_45_).aByteArray1094.length - 2); i_47_ += 2)
					((Class110) class110_45_).aByteArray1094[i_47_] = class282_sub35.readByte((short) -15460);
			}
		}
		if (null != is_25_) {
			for (int i_48_ = 1; i_48_ < is_25_.length; i_48_ += 2)
				is_25_[i_48_] = class282_sub35.readByte((short) -23798);
		}
		if (is_26_ != null) {
			for (int i_49_ = 1; i_49_ < is_26_.length; i_49_ += 2)
				is_26_[i_49_] = class282_sub35.readByte((short) -28504);
		}
		for (int i_50_ = 0; i_50_ < i_18_; i_50_++) {
			Class110 class110_51_ = class110s[i_50_];
			if (null != ((Class110) class110_51_).aByteArray1094) {
				i_30_ = 0;
				for (int i_52_ = 2; i_52_ < ((Class110) class110_51_).aByteArray1094.length; i_52_ += 2) {
					i_30_ = 1 + i_30_ + class282_sub35.readUnsignedByte();
					((Class110) class110_51_).aByteArray1094[i_52_] = (byte) i_30_;
				}
			}
		}
		for (int i_53_ = 0; i_53_ < i_18_; i_53_++) {
			Class110 class110_54_ = class110s[i_53_];
			if (((Class110) class110_54_).aByteArray1097 != null) {
				i_30_ = 0;
				for (int i_55_ = 2; i_55_ < ((Class110) class110_54_).aByteArray1097.length; i_55_ += 2) {
					i_30_ = i_30_ + 1 + class282_sub35.readUnsignedByte();
					((Class110) class110_54_).aByteArray1097[i_55_] = (byte) i_30_;
				}
			}
		}
		if (null != is_25_) {
			i_30_ = class282_sub35.readUnsignedByte();
			is_25_[0] = (byte) i_30_;
			for (int i_56_ = 2; i_56_ < is_25_.length; i_56_ += 2) {
				i_30_ = 1 + i_30_ + class282_sub35.readUnsignedByte();
				is_25_[i_56_] = (byte) i_30_;
			}
			int i_57_ = is_25_[0];
			int i_58_ = is_25_[1];
			for (int i_59_ = 0; i_59_ < i_57_; i_59_++)
				((Class282_Sub14) this).aByteArray7592[i_59_] = (byte) (32 + i_58_ * (((Class282_Sub14) this).aByteArray7592[i_59_]) >> 6);
			for (int i_60_ = 2; i_60_ < is_25_.length; i_60_ += 2) {
				int i_61_ = is_25_[i_60_];
				int i_62_ = is_25_[1 + i_60_];
				int i_63_ = (i_61_ - i_57_) / 2 + i_58_ * (i_61_ - i_57_);
				for (int i_64_ = i_57_; i_64_ < i_61_; i_64_++) {
					int i_65_ = Class371.method6349(i_63_, i_61_ - i_57_, 1314552472);
					((Class282_Sub14) this).aByteArray7592[i_64_] = (byte) ((((Class282_Sub14) this).aByteArray7592[i_64_]) * i_65_ + 32 >> 6);
					i_63_ += i_62_ - i_58_;
				}
				i_57_ = i_61_;
				i_58_ = i_62_;
			}
			for (int i_66_ = i_57_; i_66_ < 128; i_66_++)
				((Class282_Sub14) this).aByteArray7592[i_66_] = (byte) (i_58_ * (((Class282_Sub14) this).aByteArray7592[i_66_]) + 32 >> 6);
			Object object = null;
		}
		if (is_26_ != null) {
			i_30_ = class282_sub35.readUnsignedByte();
			is_26_[0] = (byte) i_30_;
			for (int i_67_ = 2; i_67_ < is_26_.length; i_67_ += 2) {
				i_30_ = 1 + i_30_ + class282_sub35.readUnsignedByte();
				is_26_[i_67_] = (byte) i_30_;
			}
			int i_68_ = is_26_[0];
			int i_69_ = is_26_[1] << 1;
			for (int i_70_ = 0; i_70_ < i_68_; i_70_++) {
				int i_71_ = i_69_ + (((Class282_Sub14) this).aByteArray7591[i_70_] & 0xff);
				if (i_71_ < 0)
					i_71_ = 0;
				if (i_71_ > 128)
					i_71_ = 128;
				((Class282_Sub14) this).aByteArray7591[i_70_] = (byte) i_71_;
			}
			for (int i_72_ = 2; i_72_ < is_26_.length; i_72_ += 2) {
				int i_73_ = is_26_[i_72_];
				int i_74_ = is_26_[i_72_ + 1] << 1;
				int i_75_ = (i_73_ - i_68_) * i_69_ + (i_73_ - i_68_) / 2;
				for (int i_76_ = i_68_; i_76_ < i_73_; i_76_++) {
					int i_77_ = Class371.method6349(i_75_, i_73_ - i_68_, -95801299);
					int i_78_ = ((((Class282_Sub14) this).aByteArray7591[i_76_] & 0xff) + i_77_);
					if (i_78_ < 0)
						i_78_ = 0;
					if (i_78_ > 128)
						i_78_ = 128;
					((Class282_Sub14) this).aByteArray7591[i_76_] = (byte) i_78_;
					i_75_ += i_74_ - i_69_;
				}
				i_68_ = i_73_;
				i_69_ = i_74_;
			}
			for (int i_79_ = i_68_; i_79_ < 128; i_79_++) {
				int i_80_ = ((((Class282_Sub14) this).aByteArray7591[i_79_] & 0xff) + i_69_);
				if (i_80_ < 0)
					i_80_ = 0;
				if (i_80_ > 128)
					i_80_ = 128;
				((Class282_Sub14) this).aByteArray7591[i_79_] = (byte) i_80_;
			}
			Object object = null;
		}
		for (int i_81_ = 0; i_81_ < i_18_; i_81_++)
			((Class110) class110s[i_81_]).anInt1096 = class282_sub35.readUnsignedByte() * 978637447;
		for (int i_82_ = 0; i_82_ < i_18_; i_82_++) {
			Class110 class110_83_ = class110s[i_82_];
			if (null != ((Class110) class110_83_).aByteArray1097)
				((Class110) class110_83_).anInt1095 = class282_sub35.readUnsignedByte() * -1900804713;
			if (((Class110) class110_83_).aByteArray1094 != null)
				((Class110) class110_83_).anInt1098 = class282_sub35.readUnsignedByte() * 1516023243;
			if (((Class110) class110_83_).anInt1096 * 1284723511 > 0)
				((Class110) class110_83_).anInt1099 = class282_sub35.readUnsignedByte() * 109946109;
		}
		for (int i_84_ = 0; i_84_ < i_18_; i_84_++)
			((Class110) class110s[i_84_]).anInt1101 = class282_sub35.readUnsignedByte() * 51414175;
		for (int i_85_ = 0; i_85_ < i_18_; i_85_++) {
			Class110 class110_86_ = class110s[i_85_];
			if (((Class110) class110_86_).anInt1101 * -1304717473 > 0)
				((Class110) class110_86_).anInt1100 = class282_sub35.readUnsignedByte() * 799163375;
		}
		for (int i_87_ = 0; i_87_ < i_18_; i_87_++) {
			Class110 class110_88_ = class110s[i_87_];
			if (((Class110) class110_88_).anInt1100 * 1255754511 > 0)
				((Class110) class110_88_).anInt1102 = class282_sub35.readUnsignedByte() * 1220033429;
		}
	}

	void method12219() {
		((Class282_Sub14) this).anIntArray7596 = null;
	}

	void method12220() {
		((Class282_Sub14) this).anIntArray7596 = null;
	}

	public static final void method12221(Class118 class118, int i, int i_89_, int i_90_) {
		if (null == client.aClass118_7257 && !Class20.aBool161 && (null != class118 && Class96_Sub14.method14643(class118, 735931958))) {
			client.aClass118_7257 = class118;
			client.aClass118_7247 = Class468_Sub22.method12880(class118, (byte) 34);
			client.anInt7361 = i * 1630160131;
			client.anInt7362 = 546105467 * i_89_;
			Class96_Sub1.anInt8308 = 0;
			client.aBool7364 = false;
		}
	}

	static void method12222(int i) {
		/* empty */
	}

	public static void method12223(int i, byte i_91_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(6, (long) i);
		class282_sub50_sub12.method14965((byte) -46);
	}
}
