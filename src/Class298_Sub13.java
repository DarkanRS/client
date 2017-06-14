/* Class298_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub13 extends Linkable {
	byte[] aByteArray7258;
	Class440 aClass440_7259;

	Class298_Sub13(RsByteBuffer class298_sub53) {
		class298_sub53.index = (class298_sub53.buffer.length - 3) * 116413311;
		int i = class298_sub53.readUnsignedByte();
		int i_0_ = class298_sub53.readUnsignedShort();
		int i_1_ = 14 + i * 10;
		class298_sub53.index = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		int i_9_ = 0;
		while_5_: for (int i_10_ = 0; i_10_ < i; i_10_++) {
			int i_11_ = -1;
			for (;;) {
				int i_12_ = class298_sub53.readUnsignedByte();
				if (i_12_ != i_11_)
					i_1_++;
				i_11_ = i_12_ & 0xf;
				if (i_12_ == 7)
					continue while_5_;
				if (i_12_ == 23)
					i_2_++;
				else if (i_11_ == 0)
					i_4_++;
				else if (i_11_ == 1)
					i_5_++;
				else if (i_11_ == 2)
					i_3_++;
				else if (i_11_ == 3)
					i_6_++;
				else if (i_11_ == 4)
					i_7_++;
				else if (i_11_ == 5)
					i_8_++;
				else {
					if (i_11_ != 6)
						break;
					i_9_++;
				}
			}
			throw new RuntimeException();
		}
		i_1_ += 5 * i_2_;
		i_1_ += 2 * (i_4_ + i_5_ + i_3_ + i_6_ + i_8_);
		i_1_ += i_7_ + i_9_;
		int i_13_ = class298_sub53.index * 385051775;
		int i_14_ = i + i_2_ + i_3_ + i_4_ + i_5_ + i_6_ + i_7_ + i_8_ + i_9_;
		for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
			class298_sub53.method3609(1692297361);
		i_1_ += class298_sub53.index * 385051775 - i_13_;
		int i_16_ = class298_sub53.index * 385051775;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		int i_26_ = 0;
		int i_27_ = 0;
		int i_28_ = 0;
		int i_29_ = 0;
		for (int i_30_ = 0; i_30_ < i_3_; i_30_++) {
			i_29_ = i_29_ + class298_sub53.readUnsignedByte() & 0x7f;
			if (i_29_ == 0 || i_29_ == 32)
				i_9_++;
			else if (i_29_ == 1)
				i_17_++;
			else if (i_29_ == 33)
				i_18_++;
			else if (i_29_ == 7)
				i_19_++;
			else if (i_29_ == 39)
				i_20_++;
			else if (i_29_ == 10)
				i_21_++;
			else if (i_29_ == 42)
				i_22_++;
			else if (i_29_ == 99)
				i_23_++;
			else if (i_29_ == 98)
				i_24_++;
			else if (i_29_ == 101)
				i_25_++;
			else if (i_29_ == 100)
				i_26_++;
			else if (i_29_ == 64 || i_29_ == 65 || i_29_ == 120 || i_29_ == 121 || i_29_ == 123)
				i_27_++;
			else
				i_28_++;
		}
		int i_31_ = 0;
		int i_32_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_27_ * 116413311;
		int i_33_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_8_ * 116413311;
		int i_34_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_7_ * 116413311;
		int i_35_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_6_ * 116413311;
		int i_36_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_17_ * 116413311;
		int i_37_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_19_ * 116413311;
		int i_38_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_21_ * 116413311;
		int i_39_ = class298_sub53.index * 385051775;
		class298_sub53.index += (i_4_ + i_5_ + i_8_) * 116413311;
		int i_40_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_4_ * 116413311;
		int i_41_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_28_ * 116413311;
		int i_42_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_5_ * 116413311;
		int i_43_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_18_ * 116413311;
		int i_44_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_20_ * 116413311;
		int i_45_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_22_ * 116413311;
		int i_46_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_9_ * 116413311;
		int i_47_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_6_ * 116413311;
		int i_48_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_23_ * 116413311;
		int i_49_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_24_ * 116413311;
		int i_50_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_25_ * 116413311;
		int i_51_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_26_ * 116413311;
		int i_52_ = class298_sub53.index * 385051775;
		class298_sub53.index += i_2_ * 349239933;
		((Class298_Sub13) this).aByteArray7258 = new byte[i_1_];
		RsByteBuffer class298_sub53_53_ = new RsByteBuffer(((Class298_Sub13) this).aByteArray7258);
		class298_sub53_53_.writeInt(1297377380, -316974152);
		class298_sub53_53_.writeInt(6, -588529934);
		class298_sub53_53_.writeShort(i > 1 ? 1 : 0, 16711935);
		class298_sub53_53_.writeShort(i, 16711935);
		class298_sub53_53_.writeShort(i_0_, 16711935);
		class298_sub53.index = i_13_ * 116413311;
		int i_54_ = 0;
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = 0;
		int i_58_ = 0;
		int i_59_ = 0;
		int i_60_ = 0;
		int[] is = new int[128];
		i_29_ = 0;
		for (int i_61_ = 0; i_61_ < i; i_61_++) {
			class298_sub53_53_.writeInt(1297379947, -1929295606);
			class298_sub53_53_.index += 465653244;
			int i_62_ = class298_sub53_53_.index * 385051775;
			int i_63_ = -1;
			while_6_: do {
				for (;;) {
					int i_64_ = class298_sub53.method3609(1692297361);
					class298_sub53_53_.method3639(i_64_, -1081187550);
					int i_65_ = class298_sub53.buffer[i_31_++] & 0xff;
					boolean bool = i_65_ != i_63_;
					i_63_ = i_65_ & 0xf;
					if (i_65_ == 7) {
						if (bool)
							class298_sub53_53_.writeByte(255);
						class298_sub53_53_.writeByte(47);
						class298_sub53_53_.writeByte(0);
						break while_6_;
					}
					if (i_65_ == 23) {
						if (bool)
							class298_sub53_53_.writeByte(255);
						class298_sub53_53_.writeByte(81);
						class298_sub53_53_.writeByte(3);
						class298_sub53_53_.writeByte((class298_sub53.buffer[i_52_++]));
						class298_sub53_53_.writeByte((class298_sub53.buffer[i_52_++]));
						class298_sub53_53_.writeByte((class298_sub53.buffer[i_52_++]));
					} else {
						i_54_ ^= i_65_ >> 4;
						if (i_63_ == 0) {
							if (bool)
								class298_sub53_53_.writeByte(144 + i_54_);
							i_55_ += class298_sub53.buffer[i_39_++];
							i_56_ += class298_sub53.buffer[i_40_++];
							class298_sub53_53_.writeByte(i_55_ & 0x7f);
							class298_sub53_53_.writeByte(i_56_ & 0x7f);
						} else if (i_63_ == 1) {
							if (bool)
								class298_sub53_53_.writeByte(128 + i_54_);
							i_55_ += class298_sub53.buffer[i_39_++];
							i_57_ += class298_sub53.buffer[i_42_++];
							class298_sub53_53_.writeByte(i_55_ & 0x7f);
							class298_sub53_53_.writeByte(i_57_ & 0x7f);
						} else if (i_63_ == 2) {
							if (bool)
								class298_sub53_53_.writeByte(176 + i_54_);
							i_29_ = i_29_ + (class298_sub53.buffer[i_16_++]) & 0x7f;
							class298_sub53_53_.writeByte(i_29_);
							int i_66_;
							if (i_29_ == 0 || i_29_ == 32)
								i_66_ = class298_sub53.buffer[i_46_++];
							else if (i_29_ == 1)
								i_66_ = class298_sub53.buffer[i_36_++];
							else if (i_29_ == 33)
								i_66_ = class298_sub53.buffer[i_43_++];
							else if (i_29_ == 7)
								i_66_ = class298_sub53.buffer[i_37_++];
							else if (i_29_ == 39)
								i_66_ = class298_sub53.buffer[i_44_++];
							else if (i_29_ == 10)
								i_66_ = class298_sub53.buffer[i_38_++];
							else if (i_29_ == 42)
								i_66_ = class298_sub53.buffer[i_45_++];
							else if (i_29_ == 99)
								i_66_ = class298_sub53.buffer[i_48_++];
							else if (i_29_ == 98)
								i_66_ = class298_sub53.buffer[i_49_++];
							else if (i_29_ == 101)
								i_66_ = class298_sub53.buffer[i_50_++];
							else if (i_29_ == 100)
								i_66_ = class298_sub53.buffer[i_51_++];
							else if (i_29_ == 64 || i_29_ == 65 || i_29_ == 120 || i_29_ == 121 || i_29_ == 123)
								i_66_ = class298_sub53.buffer[i_32_++];
							else
								i_66_ = class298_sub53.buffer[i_41_++];
							i_66_ += is[i_29_];
							is[i_29_] = i_66_;
							class298_sub53_53_.writeByte(i_66_ & 0x7f);
						} else if (i_63_ == 3) {
							if (bool)
								class298_sub53_53_.writeByte(224 + i_54_);
							i_58_ += class298_sub53.buffer[i_47_++];
							i_58_ += class298_sub53.buffer[i_35_++] << 7;
							class298_sub53_53_.writeByte(i_58_ & 0x7f);
							class298_sub53_53_.writeByte(i_58_ >> 7 & 0x7f);
						} else if (i_63_ == 4) {
							if (bool)
								class298_sub53_53_.writeByte(208 + i_54_);
							i_59_ += class298_sub53.buffer[i_34_++];
							class298_sub53_53_.writeByte(i_59_ & 0x7f);
						} else if (i_63_ == 5) {
							if (bool)
								class298_sub53_53_.writeByte(160 + i_54_);
							i_55_ += class298_sub53.buffer[i_39_++];
							i_60_ += class298_sub53.buffer[i_33_++];
							class298_sub53_53_.writeByte(i_55_ & 0x7f);
							class298_sub53_53_.writeByte(i_60_ & 0x7f);
						} else {
							if (i_63_ != 6)
								break;
							if (bool)
								class298_sub53_53_.writeByte(192 + i_54_);
							class298_sub53_53_.writeByte((class298_sub53.buffer[i_46_++]));
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			class298_sub53_53_.method3599((class298_sub53_53_.index * 385051775) - i_62_, 1397495562);
		}
	}

	void method2904() {
		if (((Class298_Sub13) this).aClass440_7259 == null) {
			((Class298_Sub13) this).aClass440_7259 = new Class440(16);
			int[] is = new int[16];
			int[] is_67_ = new int[16];
			int[] is_68_ = is;
			is_67_[9] = 128;
			is_68_[9] = 128;
			Class103 class103 = new Class103(((Class298_Sub13) this).aByteArray7258);
			int i = class103.method1088();
			for (int i_69_ = 0; i_69_ < i; i_69_++) {
				class103.method1089(i_69_);
				class103.method1091(i_69_);
				class103.method1098(i_69_);
			}
			while_7_: for (;;) {
				int i_70_ = class103.method1096();
				int i_71_ = ((Class103) class103).anIntArray1105[i_70_];
				while (((Class103) class103).anIntArray1105[i_70_] == i_71_) {
					class103.method1089(i_70_);
					int i_72_ = class103.method1092(i_70_);
					if (i_72_ == 1) {
						class103.method1090();
						class103.method1098(i_70_);
						if (!class103.method1097())
							break;
						break while_7_;
					}
					int i_73_ = i_72_ & 0xf0;
					if (i_73_ == 176) {
						int i_74_ = i_72_ & 0xf;
						int i_75_ = i_72_ >> 8 & 0x7f;
						int i_76_ = i_72_ >> 16 & 0x7f;
						if (i_75_ == 0)
							is[i_74_] = (is[i_74_] & ~0x1fc000) + (i_76_ << 14);
						if (i_75_ == 32)
							is[i_74_] = (is[i_74_] & ~0x3f80) + (i_76_ << 7);
					}
					if (i_73_ == 192) {
						int i_77_ = i_72_ & 0xf;
						int i_78_ = i_72_ >> 8 & 0x7f;
						is_67_[i_77_] = is[i_77_] + i_78_;
					}
					if (i_73_ == 144) {
						int i_79_ = i_72_ & 0xf;
						int i_80_ = i_72_ >> 8 & 0x7f;
						int i_81_ = i_72_ >> 16 & 0x7f;
						if (i_81_ > 0) {
							int i_82_ = is_67_[i_79_];
							Class298_Sub28 class298_sub28 = ((Class298_Sub28) ((Class298_Sub13) this).aClass440_7259.method5852((long) i_82_));
							if (class298_sub28 == null) {
								class298_sub28 = new Class298_Sub28(new byte[128]);
								((Class298_Sub13) this).aClass440_7259.method5858(class298_sub28, (long) i_82_);
							}
							class298_sub28.aByteArray7365[i_80_] = (byte) 1;
						}
					}
					class103.method1091(i_70_);
					class103.method1098(i_70_);
				}
			}
		}
	}

	static Class298_Sub13 method2905(Class243 class243, int i, int i_83_) {
		byte[] is = class243.getFile(i, i_83_, (byte) -117);
		if (is == null)
			return null;
		return new Class298_Sub13(new RsByteBuffer(is));
	}

	void method2906() {
		((Class298_Sub13) this).aClass440_7259 = null;
	}
}
