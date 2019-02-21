/* Class282_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub7 extends Node {
	IterableNodeMap aClass465_7521;
	byte[] aByteArray7522;

	static Class282_Sub7 method12164(Index class317, int i, int i_0_) {
		byte[] is = class317.getFile(i, i_0_);
		if (is == null)
			return null;
		return new Class282_Sub7(new RsByteBuffer(is));
	}

	Class282_Sub7(RsByteBuffer class282_sub35) {
		class282_sub35.index = (class282_sub35.buffer.length - 3) * -1115476867;
		int i = class282_sub35.readUnsignedByte();
		int i_1_ = class282_sub35.readUnsignedShort();
		int i_2_ = 14 + i * 10;
		class282_sub35.index = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		int i_9_ = 0;
		int i_10_ = 0;
		while_159_: for (int i_11_ = 0; i_11_ < i; i_11_++) {
			int i_12_ = -1;
			for (;;) {
				int i_13_ = class282_sub35.readUnsignedByte();
				if (i_13_ != i_12_)
					i_2_++;
				i_12_ = i_13_ & 0xf;
				if (i_13_ == 7)
					continue while_159_;
				if (i_13_ == 23)
					i_3_++;
				else if (i_12_ == 0)
					i_5_++;
				else if (i_12_ == 1)
					i_6_++;
				else if (i_12_ == 2)
					i_4_++;
				else if (i_12_ == 3)
					i_7_++;
				else if (i_12_ == 4)
					i_8_++;
				else if (i_12_ == 5)
					i_9_++;
				else {
					if (i_12_ != 6)
						break;
					i_10_++;
				}
			}
			throw new RuntimeException();
		}
		i_2_ += 5 * i_3_;
		i_2_ += 2 * (i_5_ + i_6_ + i_4_ + i_7_ + i_9_);
		i_2_ += i_8_ + i_10_;
		int i_14_ = class282_sub35.index * -1990677291;
		int i_15_ = i + i_3_ + i_4_ + i_5_ + i_6_ + i_7_ + i_8_ + i_9_ + i_10_;
		for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
			class282_sub35.method13099(-488336599);
		i_2_ += class282_sub35.index * -1990677291 - i_14_;
		int i_17_ = class282_sub35.index * -1990677291;
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
		int i_30_ = 0;
		for (int i_31_ = 0; i_31_ < i_4_; i_31_++) {
			i_30_ = i_30_ + class282_sub35.readUnsignedByte() & 0x7f;
			if (i_30_ == 0 || i_30_ == 32)
				i_10_++;
			else if (i_30_ == 1)
				i_18_++;
			else if (i_30_ == 33)
				i_19_++;
			else if (i_30_ == 7)
				i_20_++;
			else if (i_30_ == 39)
				i_21_++;
			else if (i_30_ == 10)
				i_22_++;
			else if (i_30_ == 42)
				i_23_++;
			else if (i_30_ == 99)
				i_24_++;
			else if (i_30_ == 98)
				i_25_++;
			else if (i_30_ == 101)
				i_26_++;
			else if (i_30_ == 100)
				i_27_++;
			else if (i_30_ == 64 || i_30_ == 65 || i_30_ == 120 || i_30_ == 121 || i_30_ == 123)
				i_28_++;
			else
				i_29_++;
		}
		int i_32_ = 0;
		int i_33_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_28_ * -1115476867;
		int i_34_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_9_ * -1115476867;
		int i_35_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_8_ * -1115476867;
		int i_36_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_7_ * -1115476867;
		int i_37_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_18_ * -1115476867;
		int i_38_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_20_ * -1115476867;
		int i_39_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_22_ * -1115476867;
		int i_40_ = class282_sub35.index * -1990677291;
		class282_sub35.index += (i_5_ + i_6_ + i_9_) * -1115476867;
		int i_41_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_5_ * -1115476867;
		int i_42_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_29_ * -1115476867;
		int i_43_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_6_ * -1115476867;
		int i_44_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_19_ * -1115476867;
		int i_45_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_21_ * -1115476867;
		int i_46_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_23_ * -1115476867;
		int i_47_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_10_ * -1115476867;
		int i_48_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_7_ * -1115476867;
		int i_49_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_24_ * -1115476867;
		int i_50_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_25_ * -1115476867;
		int i_51_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_26_ * -1115476867;
		int i_52_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_27_ * -1115476867;
		int i_53_ = class282_sub35.index * -1990677291;
		class282_sub35.index += i_3_ * 948536695;
		((Class282_Sub7) this).aByteArray7522 = new byte[i_2_];
		RsByteBuffer class282_sub35_54_ = new RsByteBuffer(((Class282_Sub7) this).aByteArray7522);
		class282_sub35_54_.writeInt(1297377380);
		class282_sub35_54_.writeInt(6);
		class282_sub35_54_.writeShort(i > 1 ? 1 : 0, 1417031095);
		class282_sub35_54_.writeShort(i, 1417031095);
		class282_sub35_54_.writeShort(i_1_, 1417031095);
		class282_sub35.index = i_14_ * -1115476867;
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = 0;
		int i_58_ = 0;
		int i_59_ = 0;
		int i_60_ = 0;
		int i_61_ = 0;
		int[] is = new int[128];
		i_30_ = 0;
		for (int i_62_ = 0; i_62_ < i; i_62_++) {
			class282_sub35_54_.writeInt(1297379947);
			class282_sub35_54_.index += -166940172;
			int i_63_ = class282_sub35_54_.index * -1990677291;
			int i_64_ = -1;
			while_160_: do {
				for (;;) {
					int i_65_ = class282_sub35.method13099(715822037);
					class282_sub35_54_.method13077(i_65_, 1439203286);
					int i_66_ = class282_sub35.buffer[i_32_++] & 0xff;
					boolean bool = i_66_ != i_64_;
					i_64_ = i_66_ & 0xf;
					if (i_66_ == 7) {
						if (bool)
							class282_sub35_54_.writeByte(255);
						class282_sub35_54_.writeByte(47);
						class282_sub35_54_.writeByte(0);
						break while_160_;
					}
					if (i_66_ == 23) {
						if (bool)
							class282_sub35_54_.writeByte(255);
						class282_sub35_54_.writeByte(81);
						class282_sub35_54_.writeByte(3);
						class282_sub35_54_.writeByte((class282_sub35.buffer[i_53_++]));
						class282_sub35_54_.writeByte((class282_sub35.buffer[i_53_++]));
						class282_sub35_54_.writeByte((class282_sub35.buffer[i_53_++]));
					} else {
						i_55_ ^= i_66_ >> 4;
						if (i_64_ == 0) {
							if (bool)
								class282_sub35_54_.writeByte(144 + i_55_);
							i_56_ += class282_sub35.buffer[i_40_++];
							i_57_ += class282_sub35.buffer[i_41_++];
							class282_sub35_54_.writeByte(i_56_ & 0x7f);
							class282_sub35_54_.writeByte(i_57_ & 0x7f);
						} else if (i_64_ == 1) {
							if (bool)
								class282_sub35_54_.writeByte(128 + i_55_);
							i_56_ += class282_sub35.buffer[i_40_++];
							i_58_ += class282_sub35.buffer[i_43_++];
							class282_sub35_54_.writeByte(i_56_ & 0x7f);
							class282_sub35_54_.writeByte(i_58_ & 0x7f);
						} else if (i_64_ == 2) {
							if (bool)
								class282_sub35_54_.writeByte(176 + i_55_);
							i_30_ = i_30_ + (class282_sub35.buffer[i_17_++]) & 0x7f;
							class282_sub35_54_.writeByte(i_30_);
							int i_67_;
							if (i_30_ == 0 || i_30_ == 32)
								i_67_ = class282_sub35.buffer[i_47_++];
							else if (i_30_ == 1)
								i_67_ = class282_sub35.buffer[i_37_++];
							else if (i_30_ == 33)
								i_67_ = class282_sub35.buffer[i_44_++];
							else if (i_30_ == 7)
								i_67_ = class282_sub35.buffer[i_38_++];
							else if (i_30_ == 39)
								i_67_ = class282_sub35.buffer[i_45_++];
							else if (i_30_ == 10)
								i_67_ = class282_sub35.buffer[i_39_++];
							else if (i_30_ == 42)
								i_67_ = class282_sub35.buffer[i_46_++];
							else if (i_30_ == 99)
								i_67_ = class282_sub35.buffer[i_49_++];
							else if (i_30_ == 98)
								i_67_ = class282_sub35.buffer[i_50_++];
							else if (i_30_ == 101)
								i_67_ = class282_sub35.buffer[i_51_++];
							else if (i_30_ == 100)
								i_67_ = class282_sub35.buffer[i_52_++];
							else if (i_30_ == 64 || i_30_ == 65 || i_30_ == 120 || i_30_ == 121 || i_30_ == 123)
								i_67_ = class282_sub35.buffer[i_33_++];
							else
								i_67_ = class282_sub35.buffer[i_42_++];
							i_67_ += is[i_30_];
							is[i_30_] = i_67_;
							class282_sub35_54_.writeByte(i_67_ & 0x7f);
						} else if (i_64_ == 3) {
							if (bool)
								class282_sub35_54_.writeByte(224 + i_55_);
							i_59_ += class282_sub35.buffer[i_48_++];
							i_59_ += class282_sub35.buffer[i_36_++] << 7;
							class282_sub35_54_.writeByte(i_59_ & 0x7f);
							class282_sub35_54_.writeByte(i_59_ >> 7 & 0x7f);
						} else if (i_64_ == 4) {
							if (bool)
								class282_sub35_54_.writeByte(208 + i_55_);
							i_60_ += class282_sub35.buffer[i_35_++];
							class282_sub35_54_.writeByte(i_60_ & 0x7f);
						} else if (i_64_ == 5) {
							if (bool)
								class282_sub35_54_.writeByte(160 + i_55_);
							i_56_ += class282_sub35.buffer[i_40_++];
							i_61_ += class282_sub35.buffer[i_34_++];
							class282_sub35_54_.writeByte(i_56_ & 0x7f);
							class282_sub35_54_.writeByte(i_61_ & 0x7f);
						} else {
							if (i_64_ != 6)
								break;
							if (bool)
								class282_sub35_54_.writeByte(192 + i_55_);
							class282_sub35_54_.writeByte((class282_sub35.buffer[i_47_++]));
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			class282_sub35_54_.method13073((class282_sub35_54_.index * -1990677291) - i_63_, -1648709449);
		}
	}

	void method12165() {
		if (((Class282_Sub7) this).aClass465_7521 == null) {
			((Class282_Sub7) this).aClass465_7521 = new IterableNodeMap(16);
			int[] is = new int[16];
			int[] is_68_ = new int[16];
			int[] is_69_ = is;
			is_68_[9] = 128;
			is_69_[9] = 128;
			Class80 class80 = new Class80(((Class282_Sub7) this).aByteArray7522);
			int i = class80.method1397();
			for (int i_70_ = 0; i_70_ < i; i_70_++) {
				class80.method1398(i_70_);
				class80.method1392(i_70_);
				class80.method1404(i_70_);
			}
			while_161_: for (;;) {
				int i_71_ = class80.method1393();
				int i_72_ = ((Class80) class80).anIntArray788[i_71_];
				while (((Class80) class80).anIntArray788[i_71_] == i_72_) {
					class80.method1398(i_71_);
					int i_73_ = class80.method1401(i_71_);
					if (i_73_ == 1) {
						class80.method1400();
						class80.method1404(i_71_);
						if (!class80.method1405())
							break;
						break while_161_;
					}
					int i_74_ = i_73_ & 0xf0;
					if (i_74_ == 176) {
						int i_75_ = i_73_ & 0xf;
						int i_76_ = i_73_ >> 8 & 0x7f;
						int i_77_ = i_73_ >> 16 & 0x7f;
						if (i_76_ == 0)
							is[i_75_] = (is[i_75_] & ~0x1fc000) + (i_77_ << 14);
						if (i_76_ == 32)
							is[i_75_] = (is[i_75_] & ~0x3f80) + (i_77_ << 7);
					}
					if (i_74_ == 192) {
						int i_78_ = i_73_ & 0xf;
						int i_79_ = i_73_ >> 8 & 0x7f;
						is_68_[i_78_] = is[i_78_] + i_79_;
					}
					if (i_74_ == 144) {
						int i_80_ = i_73_ & 0xf;
						int i_81_ = i_73_ >> 8 & 0x7f;
						int i_82_ = i_73_ >> 16 & 0x7f;
						if (i_82_ > 0) {
							int i_83_ = is_68_[i_80_];
							Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class282_Sub7) this).aClass465_7521.method7754((long) i_83_));
							if (class282_sub47 == null) {
								class282_sub47 = new Class282_Sub47(new byte[128]);
								((Class282_Sub7) this).aClass465_7521.method7765(class282_sub47, (long) i_83_);
							}
							((byte[]) class282_sub47.anObject8068)[i_81_] = (byte) 1;
						}
					}
					class80.method1392(i_71_);
					class80.method1404(i_71_);
				}
			}
		}
	}

	static Class282_Sub7 method12166(Index class317, int i, int i_84_) {
		byte[] is = class317.getFile(i, i_84_);
		if (is == null)
			return null;
		return new Class282_Sub7(new RsByteBuffer(is));
	}

	void method12167() {
		((Class282_Sub7) this).aClass465_7521 = null;
	}

	void method12168() {
		((Class282_Sub7) this).aClass465_7521 = null;
	}

	void method12169() {
		if (((Class282_Sub7) this).aClass465_7521 == null) {
			((Class282_Sub7) this).aClass465_7521 = new IterableNodeMap(16);
			int[] is = new int[16];
			int[] is_85_ = new int[16];
			int[] is_86_ = is;
			is_85_[9] = 128;
			is_86_[9] = 128;
			Class80 class80 = new Class80(((Class282_Sub7) this).aByteArray7522);
			int i = class80.method1397();
			for (int i_87_ = 0; i_87_ < i; i_87_++) {
				class80.method1398(i_87_);
				class80.method1392(i_87_);
				class80.method1404(i_87_);
			}
			while_162_: for (;;) {
				int i_88_ = class80.method1393();
				int i_89_ = ((Class80) class80).anIntArray788[i_88_];
				while (((Class80) class80).anIntArray788[i_88_] == i_89_) {
					class80.method1398(i_88_);
					int i_90_ = class80.method1401(i_88_);
					if (i_90_ == 1) {
						class80.method1400();
						class80.method1404(i_88_);
						if (!class80.method1405())
							break;
						break while_162_;
					}
					int i_91_ = i_90_ & 0xf0;
					if (i_91_ == 176) {
						int i_92_ = i_90_ & 0xf;
						int i_93_ = i_90_ >> 8 & 0x7f;
						int i_94_ = i_90_ >> 16 & 0x7f;
						if (i_93_ == 0)
							is[i_92_] = (is[i_92_] & ~0x1fc000) + (i_94_ << 14);
						if (i_93_ == 32)
							is[i_92_] = (is[i_92_] & ~0x3f80) + (i_94_ << 7);
					}
					if (i_91_ == 192) {
						int i_95_ = i_90_ & 0xf;
						int i_96_ = i_90_ >> 8 & 0x7f;
						is_85_[i_95_] = is[i_95_] + i_96_;
					}
					if (i_91_ == 144) {
						int i_97_ = i_90_ & 0xf;
						int i_98_ = i_90_ >> 8 & 0x7f;
						int i_99_ = i_90_ >> 16 & 0x7f;
						if (i_99_ > 0) {
							int i_100_ = is_85_[i_97_];
							Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class282_Sub7) this).aClass465_7521.method7754((long) i_100_));
							if (class282_sub47 == null) {
								class282_sub47 = new Class282_Sub47(new byte[128]);
								((Class282_Sub7) this).aClass465_7521.method7765(class282_sub47, (long) i_100_);
							}
							((byte[]) class282_sub47.anObject8068)[i_98_] = (byte) 1;
						}
					}
					class80.method1392(i_88_);
					class80.method1404(i_88_);
				}
			}
		}
	}

	void method12170() {
		if (((Class282_Sub7) this).aClass465_7521 == null) {
			((Class282_Sub7) this).aClass465_7521 = new IterableNodeMap(16);
			int[] is = new int[16];
			int[] is_101_ = new int[16];
			int[] is_102_ = is;
			is_101_[9] = 128;
			is_102_[9] = 128;
			Class80 class80 = new Class80(((Class282_Sub7) this).aByteArray7522);
			int i = class80.method1397();
			for (int i_103_ = 0; i_103_ < i; i_103_++) {
				class80.method1398(i_103_);
				class80.method1392(i_103_);
				class80.method1404(i_103_);
			}
			while_163_: for (;;) {
				int i_104_ = class80.method1393();
				int i_105_ = ((Class80) class80).anIntArray788[i_104_];
				while (((Class80) class80).anIntArray788[i_104_] == i_105_) {
					class80.method1398(i_104_);
					int i_106_ = class80.method1401(i_104_);
					if (i_106_ == 1) {
						class80.method1400();
						class80.method1404(i_104_);
						if (!class80.method1405())
							break;
						break while_163_;
					}
					int i_107_ = i_106_ & 0xf0;
					if (i_107_ == 176) {
						int i_108_ = i_106_ & 0xf;
						int i_109_ = i_106_ >> 8 & 0x7f;
						int i_110_ = i_106_ >> 16 & 0x7f;
						if (i_109_ == 0)
							is[i_108_] = (is[i_108_] & ~0x1fc000) + (i_110_ << 14);
						if (i_109_ == 32)
							is[i_108_] = (is[i_108_] & ~0x3f80) + (i_110_ << 7);
					}
					if (i_107_ == 192) {
						int i_111_ = i_106_ & 0xf;
						int i_112_ = i_106_ >> 8 & 0x7f;
						is_101_[i_111_] = is[i_111_] + i_112_;
					}
					if (i_107_ == 144) {
						int i_113_ = i_106_ & 0xf;
						int i_114_ = i_106_ >> 8 & 0x7f;
						int i_115_ = i_106_ >> 16 & 0x7f;
						if (i_115_ > 0) {
							int i_116_ = is_101_[i_113_];
							Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class282_Sub7) this).aClass465_7521.method7754((long) i_116_));
							if (class282_sub47 == null) {
								class282_sub47 = new Class282_Sub47(new byte[128]);
								((Class282_Sub7) this).aClass465_7521.method7765(class282_sub47, (long) i_116_);
							}
							((byte[]) class282_sub47.anObject8068)[i_114_] = (byte) 1;
						}
					}
					class80.method1392(i_104_);
					class80.method1404(i_104_);
				}
			}
		}
	}

	void method12171() {
		if (((Class282_Sub7) this).aClass465_7521 == null) {
			((Class282_Sub7) this).aClass465_7521 = new IterableNodeMap(16);
			int[] is = new int[16];
			int[] is_117_ = new int[16];
			int[] is_118_ = is;
			is_117_[9] = 128;
			is_118_[9] = 128;
			Class80 class80 = new Class80(((Class282_Sub7) this).aByteArray7522);
			int i = class80.method1397();
			for (int i_119_ = 0; i_119_ < i; i_119_++) {
				class80.method1398(i_119_);
				class80.method1392(i_119_);
				class80.method1404(i_119_);
			}
			while_164_: for (;;) {
				int i_120_ = class80.method1393();
				int i_121_ = ((Class80) class80).anIntArray788[i_120_];
				while (((Class80) class80).anIntArray788[i_120_] == i_121_) {
					class80.method1398(i_120_);
					int i_122_ = class80.method1401(i_120_);
					if (i_122_ == 1) {
						class80.method1400();
						class80.method1404(i_120_);
						if (!class80.method1405())
							break;
						break while_164_;
					}
					int i_123_ = i_122_ & 0xf0;
					if (i_123_ == 176) {
						int i_124_ = i_122_ & 0xf;
						int i_125_ = i_122_ >> 8 & 0x7f;
						int i_126_ = i_122_ >> 16 & 0x7f;
						if (i_125_ == 0)
							is[i_124_] = (is[i_124_] & ~0x1fc000) + (i_126_ << 14);
						if (i_125_ == 32)
							is[i_124_] = (is[i_124_] & ~0x3f80) + (i_126_ << 7);
					}
					if (i_123_ == 192) {
						int i_127_ = i_122_ & 0xf;
						int i_128_ = i_122_ >> 8 & 0x7f;
						is_117_[i_127_] = is[i_127_] + i_128_;
					}
					if (i_123_ == 144) {
						int i_129_ = i_122_ & 0xf;
						int i_130_ = i_122_ >> 8 & 0x7f;
						int i_131_ = i_122_ >> 16 & 0x7f;
						if (i_131_ > 0) {
							int i_132_ = is_117_[i_129_];
							Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class282_Sub7) this).aClass465_7521.method7754((long) i_132_));
							if (class282_sub47 == null) {
								class282_sub47 = new Class282_Sub47(new byte[128]);
								((Class282_Sub7) this).aClass465_7521.method7765(class282_sub47, (long) i_132_);
							}
							((byte[]) class282_sub47.anObject8068)[i_130_] = (byte) 1;
						}
					}
					class80.method1392(i_120_);
					class80.method1404(i_120_);
				}
			}
		}
	}

	void method12172() {
		((Class282_Sub7) this).aClass465_7521 = null;
	}

	static Class282_Sub7 method12173(Index class317, int i, int i_133_) {
		byte[] is = class317.getFile(i, i_133_);
		if (is == null)
			return null;
		return new Class282_Sub7(new RsByteBuffer(is));
	}

	void method12174() {
		((Class282_Sub7) this).aClass465_7521 = null;
	}
}
