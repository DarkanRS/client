
/* Class282_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

public class Class282_Sub6 extends Class282 {
	int anInt7508 = 0;
	Class390_Sub1 aClass390_Sub1_7509;
	int anInt7510;
	float aFloat7511;
	Class90 aClass90_7512;
	Stream aStream7513;
	int anInt7514 = 0;
	int[] anIntArray7515;
	Interface4 anInterface4_7516;
	int anInt7517;
	Class505_Sub2 aClass505_Sub2_7518;
	int anInt7519 = 0;
	NativeHeapBuffer aNativeHeapBuffer7520;

	void method12142(int i) {
		((Class282_Sub6) this).aStream7513.method2925();
		((Class282_Sub6) this).anInterface4_7516 = ((Class282_Sub6) this).aClass505_Sub2_7518.method13994(false);
		((Class282_Sub6) this).anInterface4_7516.method27(i * 4, 4, ((Class282_Sub6) this).aNativeHeapBuffer7520);
		((Class282_Sub6) this).aNativeHeapBuffer7520 = null;
		((Class282_Sub6) this).aStream7513 = null;
	}

	Class282_Sub6(Class390_Sub1 class390_sub1, int i, int i_0_, Class90 class90) {
		((Class282_Sub6) this).anInt7517 = 0;
		((Class282_Sub6) this).aClass390_Sub1_7509 = class390_sub1;
		((Class282_Sub6) this).aClass505_Sub2_7518 = (((Class390_Sub1) ((Class282_Sub6) this).aClass390_Sub1_7509).aClass505_Sub2_8528);
		((Class282_Sub6) this).anInt7510 = i;
		((Class282_Sub6) this).aFloat7511 = (float) i_0_;
		((Class282_Sub6) this).aClass90_7512 = class90;
		((Class282_Sub6) this).anIntArray7515 = new int[(((Class282_Sub6) this).aClass390_Sub1_7509.anInt4776 * -1843860823 * (((Class282_Sub6) this).aClass390_Sub1_7509.anInt4773 * 1826078169))];
		byte i_1_ = 10;
		if (i >= 0) {
			Class169 class169 = ((Class282_Sub6) this).aClass505_Sub2_7518.anInterface22_5834.method144(i, -1808049505);
			if (class169.aByte2064 > 0)
				i_1_ = class169.aByte2064;
		}
		((Class282_Sub6) this).aClass505_Sub2_7518.method13896(i_1_);
		((Class282_Sub6) this).aClass505_Sub2_7518.method13896(3);
	}

	void method12143(int i) {
		((Class282_Sub6) this).aStream7513.method2919(i * 4 + 3);
		((Class282_Sub6) this).aStream7513.method2920(-1);
	}

	void method12144(int[] is, int i) {
		((Class282_Sub6) this).anInt7514 = 0;
		((Class282_Sub6) this).anInt7519 = 32767;
		((Class282_Sub6) this).anInt7517 = -32768;
		ByteBuffer bytebuffer = ((Class282_Sub6) this).aClass505_Sub2_7518.aByteBuffer8838;
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			int i_3_ = is[i_2_];
			short[] is_4_ = (((Class390_Sub1) ((Class282_Sub6) this).aClass390_Sub1_7509).aShortArrayArray8534[i_3_]);
			int i_5_ = ((Class282_Sub6) this).anIntArray7515[i_3_];
			if (i_5_ != 0 && is_4_ != null) {
				int i_6_ = 0;
				int i_7_ = 0;
				while (i_7_ < is_4_.length) {
					if ((i_5_ & 1 << i_6_++) != 0) {
						for (int i_8_ = 0; i_8_ < 3; i_8_++) {
							int i_9_ = is_4_[i_7_++] & 0xffff;
							if (i_9_ > ((Class282_Sub6) this).anInt7517)
								((Class282_Sub6) this).anInt7517 = i_9_;
							if (i_9_ < ((Class282_Sub6) this).anInt7519)
								((Class282_Sub6) this).anInt7519 = i_9_;
							bytebuffer.putShort((short) i_9_);
						}
						((Class282_Sub6) this).anInt7514 += 3;
					} else
						i_7_ += 3;
				}
			}
		}
	}

	void method12145(int i, int i_10_, int i_11_, float f) {
		if (((Class282_Sub6) this).anInt7510 != -1) {
			Class169 class169 = (((Class282_Sub6) this).aClass505_Sub2_7518.anInterface22_5834.method144(((Class282_Sub6) this).anInt7510, -1820378147));
			int i_12_ = class169.aByte2079 & 0xff;
			if (i_12_ != 0 && class169.aByte2064 != 4) {
				int i_13_;
				if (i_11_ < 0)
					i_13_ = 0;
				else if (i_11_ > 127)
					i_13_ = 16777215;
				else
					i_13_ = 131586 * i_11_;
				if (i_12_ == 256)
					i_10_ = i_13_;
				else {
					int i_14_ = i_12_;
					int i_15_ = 256 - i_12_;
					i_10_ = ((((i_13_ & 0xff00ff) * i_14_ + (i_10_ & 0xff00ff) * i_15_) & ~0xff00ff) + (((i_13_ & 0xff00) * i_14_ + (i_10_ & 0xff00) * i_15_) & 0xff0000)) >> 8;
				}
			}
			int i_16_ = class169.aByte2080 & 0xff;
			if (i_16_ != 0) {
				i_16_ += 256;
				int i_17_ = ((i_10_ & 0xff0000) >> 16) * i_16_;
				if (i_17_ > 65535)
					i_17_ = 65535;
				int i_18_ = ((i_10_ & 0xff00) >> 8) * i_16_;
				if (i_18_ > 65535)
					i_18_ = 65535;
				int i_19_ = (i_10_ & 0xff) * i_16_;
				if (i_19_ > 65535)
					i_19_ = 65535;
				i_10_ = (i_17_ << 8 & 0xff0000) + (i_18_ & 0xff00) + (i_19_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_20_ = i_10_ >> 16 & 0xff;
			int i_21_ = i_10_ >> 8 & 0xff;
			int i_22_ = i_10_ & 0xff;
			i_20_ *= f;
			if (i_20_ < 0)
				i_20_ = 0;
			else if (i_20_ > 255)
				i_20_ = 255;
			i_21_ *= f;
			if (i_21_ < 0)
				i_21_ = 0;
			else if (i_21_ > 255)
				i_21_ = 255;
			i_22_ *= f;
			if (i_22_ < 0)
				i_22_ = 0;
			else if (i_22_ > 255)
				i_22_ = 255;
			i_10_ = i_20_ << 16 | i_21_ << 8 | i_22_;
		}
		((Class282_Sub6) this).aStream7513.method2919(i * 4);
		if ((((Class505_Sub2) ((Class282_Sub6) this).aClass505_Sub2_7518).anInt8824) == 0) {
			((Class282_Sub6) this).aStream7513.method2920((byte) i_10_);
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_10_ >> 8));
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_10_ >> 16));
		} else {
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_10_ >> 16));
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_10_ >> 8));
			((Class282_Sub6) this).aStream7513.method2920((byte) i_10_);
		}
	}

	void method12146(int i) {
		((Class282_Sub6) this).aStream7513.method2925();
		((Class282_Sub6) this).anInterface4_7516 = ((Class282_Sub6) this).aClass505_Sub2_7518.method13994(false);
		((Class282_Sub6) this).anInterface4_7516.method27(i * 4, 4, ((Class282_Sub6) this).aNativeHeapBuffer7520);
		((Class282_Sub6) this).aNativeHeapBuffer7520 = null;
		((Class282_Sub6) this).aStream7513 = null;
	}

	void method12147(int[] is, int i) {
		((Class282_Sub6) this).anInt7514 = 0;
		((Class282_Sub6) this).anInt7519 = 32767;
		((Class282_Sub6) this).anInt7517 = -32768;
		ByteBuffer bytebuffer = ((Class282_Sub6) this).aClass505_Sub2_7518.aByteBuffer8838;
		for (int i_23_ = 0; i_23_ < i; i_23_++) {
			int i_24_ = is[i_23_];
			short[] is_25_ = (((Class390_Sub1) ((Class282_Sub6) this).aClass390_Sub1_7509).aShortArrayArray8534[i_24_]);
			int i_26_ = ((Class282_Sub6) this).anIntArray7515[i_24_];
			if (i_26_ != 0 && is_25_ != null) {
				int i_27_ = 0;
				int i_28_ = 0;
				while (i_28_ < is_25_.length) {
					if ((i_26_ & 1 << i_27_++) != 0) {
						for (int i_29_ = 0; i_29_ < 3; i_29_++) {
							int i_30_ = is_25_[i_28_++] & 0xffff;
							if (i_30_ > ((Class282_Sub6) this).anInt7517)
								((Class282_Sub6) this).anInt7517 = i_30_;
							if (i_30_ < ((Class282_Sub6) this).anInt7519)
								((Class282_Sub6) this).anInt7519 = i_30_;
							bytebuffer.putShort((short) i_30_);
						}
						((Class282_Sub6) this).anInt7514 += 3;
					} else
						i_28_ += 3;
				}
			}
		}
	}

	void method12148(int i) {
		((Class282_Sub6) this).aNativeHeapBuffer7520 = ((Class282_Sub6) this).aClass505_Sub2_7518.method13910(i * 4, true);
		((Class282_Sub6) this).aStream7513 = new Stream(((Class282_Sub6) this).aNativeHeapBuffer7520, 0, i * 4);
	}

	void method12149(int i) {
		((Class282_Sub6) this).aNativeHeapBuffer7520 = ((Class282_Sub6) this).aClass505_Sub2_7518.method13910(i * 4, true);
		((Class282_Sub6) this).aStream7513 = new Stream(((Class282_Sub6) this).aNativeHeapBuffer7520, 0, i * 4);
	}

	void method12150(int i) {
		((Class282_Sub6) this).aNativeHeapBuffer7520 = ((Class282_Sub6) this).aClass505_Sub2_7518.method13910(i * 4, true);
		((Class282_Sub6) this).aStream7513 = new Stream(((Class282_Sub6) this).aNativeHeapBuffer7520, 0, i * 4);
	}

	void method12151(int i) {
		((Class282_Sub6) this).aStream7513.method2925();
		((Class282_Sub6) this).anInterface4_7516 = ((Class282_Sub6) this).aClass505_Sub2_7518.method13994(false);
		((Class282_Sub6) this).anInterface4_7516.method27(i * 4, 4, ((Class282_Sub6) this).aNativeHeapBuffer7520);
		((Class282_Sub6) this).aNativeHeapBuffer7520 = null;
		((Class282_Sub6) this).aStream7513 = null;
	}

	void method12152(int i, int i_31_, int i_32_) {
		((Class282_Sub6) this).anIntArray7515[i_31_ * (((Class282_Sub6) this).aClass390_Sub1_7509.anInt4776 * -1843860823) + i] |= 1 << i_32_;
		((Class282_Sub6) this).anInt7508++;
	}

	void method12153(int i) {
		((Class282_Sub6) this).aStream7513.method2919(i * 4 + 3);
		((Class282_Sub6) this).aStream7513.method2920(-1);
	}

	void method12154(int i) {
		((Class282_Sub6) this).aStream7513.method2919(i * 4 + 3);
		((Class282_Sub6) this).aStream7513.method2920(-1);
	}

	void method12155(int i, int i_33_, int i_34_) {
		((Class282_Sub6) this).anIntArray7515[i_33_ * (((Class282_Sub6) this).aClass390_Sub1_7509.anInt4776 * -1843860823) + i] |= 1 << i_34_;
		((Class282_Sub6) this).anInt7508++;
	}

	void method12156(int i, int i_35_, int i_36_, float f) {
		if (((Class282_Sub6) this).anInt7510 != -1) {
			Class169 class169 = (((Class282_Sub6) this).aClass505_Sub2_7518.anInterface22_5834.method144(((Class282_Sub6) this).anInt7510, -1978960580));
			int i_37_ = class169.aByte2079 & 0xff;
			if (i_37_ != 0 && class169.aByte2064 != 4) {
				int i_38_;
				if (i_36_ < 0)
					i_38_ = 0;
				else if (i_36_ > 127)
					i_38_ = 16777215;
				else
					i_38_ = 131586 * i_36_;
				if (i_37_ == 256)
					i_35_ = i_38_;
				else {
					int i_39_ = i_37_;
					int i_40_ = 256 - i_37_;
					i_35_ = ((((i_38_ & 0xff00ff) * i_39_ + (i_35_ & 0xff00ff) * i_40_) & ~0xff00ff) + (((i_38_ & 0xff00) * i_39_ + (i_35_ & 0xff00) * i_40_) & 0xff0000)) >> 8;
				}
			}
			int i_41_ = class169.aByte2080 & 0xff;
			if (i_41_ != 0) {
				i_41_ += 256;
				int i_42_ = ((i_35_ & 0xff0000) >> 16) * i_41_;
				if (i_42_ > 65535)
					i_42_ = 65535;
				int i_43_ = ((i_35_ & 0xff00) >> 8) * i_41_;
				if (i_43_ > 65535)
					i_43_ = 65535;
				int i_44_ = (i_35_ & 0xff) * i_41_;
				if (i_44_ > 65535)
					i_44_ = 65535;
				i_35_ = (i_42_ << 8 & 0xff0000) + (i_43_ & 0xff00) + (i_44_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_45_ = i_35_ >> 16 & 0xff;
			int i_46_ = i_35_ >> 8 & 0xff;
			int i_47_ = i_35_ & 0xff;
			i_45_ *= f;
			if (i_45_ < 0)
				i_45_ = 0;
			else if (i_45_ > 255)
				i_45_ = 255;
			i_46_ *= f;
			if (i_46_ < 0)
				i_46_ = 0;
			else if (i_46_ > 255)
				i_46_ = 255;
			i_47_ *= f;
			if (i_47_ < 0)
				i_47_ = 0;
			else if (i_47_ > 255)
				i_47_ = 255;
			i_35_ = i_45_ << 16 | i_46_ << 8 | i_47_;
		}
		((Class282_Sub6) this).aStream7513.method2919(i * 4);
		if ((((Class505_Sub2) ((Class282_Sub6) this).aClass505_Sub2_7518).anInt8824) == 0) {
			((Class282_Sub6) this).aStream7513.method2920((byte) i_35_);
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_35_ >> 8));
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_35_ >> 16));
		} else {
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_35_ >> 16));
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_35_ >> 8));
			((Class282_Sub6) this).aStream7513.method2920((byte) i_35_);
		}
	}

	void method12157(int i, int i_48_, int i_49_, float f) {
		if (((Class282_Sub6) this).anInt7510 != -1) {
			Class169 class169 = (((Class282_Sub6) this).aClass505_Sub2_7518.anInterface22_5834.method144(((Class282_Sub6) this).anInt7510, -1795326543));
			int i_50_ = class169.aByte2079 & 0xff;
			if (i_50_ != 0 && class169.aByte2064 != 4) {
				int i_51_;
				if (i_49_ < 0)
					i_51_ = 0;
				else if (i_49_ > 127)
					i_51_ = 16777215;
				else
					i_51_ = 131586 * i_49_;
				if (i_50_ == 256)
					i_48_ = i_51_;
				else {
					int i_52_ = i_50_;
					int i_53_ = 256 - i_50_;
					i_48_ = ((((i_51_ & 0xff00ff) * i_52_ + (i_48_ & 0xff00ff) * i_53_) & ~0xff00ff) + (((i_51_ & 0xff00) * i_52_ + (i_48_ & 0xff00) * i_53_) & 0xff0000)) >> 8;
				}
			}
			int i_54_ = class169.aByte2080 & 0xff;
			if (i_54_ != 0) {
				i_54_ += 256;
				int i_55_ = ((i_48_ & 0xff0000) >> 16) * i_54_;
				if (i_55_ > 65535)
					i_55_ = 65535;
				int i_56_ = ((i_48_ & 0xff00) >> 8) * i_54_;
				if (i_56_ > 65535)
					i_56_ = 65535;
				int i_57_ = (i_48_ & 0xff) * i_54_;
				if (i_57_ > 65535)
					i_57_ = 65535;
				i_48_ = (i_55_ << 8 & 0xff0000) + (i_56_ & 0xff00) + (i_57_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_58_ = i_48_ >> 16 & 0xff;
			int i_59_ = i_48_ >> 8 & 0xff;
			int i_60_ = i_48_ & 0xff;
			i_58_ *= f;
			if (i_58_ < 0)
				i_58_ = 0;
			else if (i_58_ > 255)
				i_58_ = 255;
			i_59_ *= f;
			if (i_59_ < 0)
				i_59_ = 0;
			else if (i_59_ > 255)
				i_59_ = 255;
			i_60_ *= f;
			if (i_60_ < 0)
				i_60_ = 0;
			else if (i_60_ > 255)
				i_60_ = 255;
			i_48_ = i_58_ << 16 | i_59_ << 8 | i_60_;
		}
		((Class282_Sub6) this).aStream7513.method2919(i * 4);
		if ((((Class505_Sub2) ((Class282_Sub6) this).aClass505_Sub2_7518).anInt8824) == 0) {
			((Class282_Sub6) this).aStream7513.method2920((byte) i_48_);
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_48_ >> 8));
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_48_ >> 16));
		} else {
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_48_ >> 16));
			((Class282_Sub6) this).aStream7513.method2920((byte) (i_48_ >> 8));
			((Class282_Sub6) this).aStream7513.method2920((byte) i_48_);
		}
	}

	void method12158(int i) {
		((Class282_Sub6) this).aStream7513.method2925();
		((Class282_Sub6) this).anInterface4_7516 = ((Class282_Sub6) this).aClass505_Sub2_7518.method13994(false);
		((Class282_Sub6) this).anInterface4_7516.method27(i * 4, 4, ((Class282_Sub6) this).aNativeHeapBuffer7520);
		((Class282_Sub6) this).aNativeHeapBuffer7520 = null;
		((Class282_Sub6) this).aStream7513 = null;
	}

	void method12159(int i) {
		((Class282_Sub6) this).aStream7513.method2919(i * 4 + 3);
		((Class282_Sub6) this).aStream7513.method2920(-1);
	}

	void method12160(int i) {
		((Class282_Sub6) this).aStream7513.method2919(i * 4 + 3);
		((Class282_Sub6) this).aStream7513.method2920(-1);
	}

	void method12161(int i, int i_61_, int i_62_) {
		((Class282_Sub6) this).anIntArray7515[i_61_ * (((Class282_Sub6) this).aClass390_Sub1_7509.anInt4776 * -1843860823) + i] |= 1 << i_62_;
		((Class282_Sub6) this).anInt7508++;
	}

	void method12162(int[] is, int i) {
		((Class282_Sub6) this).anInt7514 = 0;
		((Class282_Sub6) this).anInt7519 = 32767;
		((Class282_Sub6) this).anInt7517 = -32768;
		ByteBuffer bytebuffer = ((Class282_Sub6) this).aClass505_Sub2_7518.aByteBuffer8838;
		for (int i_63_ = 0; i_63_ < i; i_63_++) {
			int i_64_ = is[i_63_];
			short[] is_65_ = (((Class390_Sub1) ((Class282_Sub6) this).aClass390_Sub1_7509).aShortArrayArray8534[i_64_]);
			int i_66_ = ((Class282_Sub6) this).anIntArray7515[i_64_];
			if (i_66_ != 0 && is_65_ != null) {
				int i_67_ = 0;
				int i_68_ = 0;
				while (i_68_ < is_65_.length) {
					if ((i_66_ & 1 << i_67_++) != 0) {
						for (int i_69_ = 0; i_69_ < 3; i_69_++) {
							int i_70_ = is_65_[i_68_++] & 0xffff;
							if (i_70_ > ((Class282_Sub6) this).anInt7517)
								((Class282_Sub6) this).anInt7517 = i_70_;
							if (i_70_ < ((Class282_Sub6) this).anInt7519)
								((Class282_Sub6) this).anInt7519 = i_70_;
							bytebuffer.putShort((short) i_70_);
						}
						((Class282_Sub6) this).anInt7514 += 3;
					} else
						i_68_ += 3;
				}
			}
		}
	}

	void method12163(int i) {
		((Class282_Sub6) this).aStream7513.method2925();
		((Class282_Sub6) this).anInterface4_7516 = ((Class282_Sub6) this).aClass505_Sub2_7518.method13994(false);
		((Class282_Sub6) this).anInterface4_7516.method27(i * 4, 4, ((Class282_Sub6) this).aNativeHeapBuffer7520);
		((Class282_Sub6) this).aNativeHeapBuffer7520 = null;
		((Class282_Sub6) this).aStream7513 = null;
	}
}
