
/* Class282_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class282_Sub3 extends Node {
	Class90 aClass90_7487;
	Class390_Sub2 aClass390_Sub2_7488;
	Stream aStream7489;
	float aFloat7490;
	Class131_Sub2 aClass131_Sub2_7491;
	Class143 aClass143_7492;
	int anInt7493;
	Class505_Sub1 aClass505_Sub1_7494;
	NativeHeapBuffer aNativeHeapBuffer7495;
	int[] anIntArray7496;

	void method12079(int[] is, int i) {
		int i_0_ = 0;
		Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aClass282_Sub35_Sub1_8499);
		class282_sub35_sub1.index = 0;
		if (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aBool8467) {
			for (int i_1_ = 0; i_1_ < i; i_1_++) {
				int i_2_ = is[i_1_];
				short[] is_3_ = (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aShortArrayArray8653[i_2_]);
				int i_4_ = ((Class282_Sub3) this).anIntArray7496[i_2_];
				if (i_4_ != 0 && is_3_ != null) {
					int i_5_ = 0;
					int i_6_ = 0;
					while (i_6_ < is_3_.length) {
						if ((i_4_ & 1 << i_5_++) != 0) {
							class282_sub35_sub1.writeShort((is_3_[i_6_++] & 0xffff), 1417031095);
							i_0_++;
							class282_sub35_sub1.writeShort((is_3_[i_6_++] & 0xffff), 1417031095);
							i_0_++;
							class282_sub35_sub1.writeShort((is_3_[i_6_++] & 0xffff), 1417031095);
							i_0_++;
						} else
							i_6_ += 3;
					}
				}
			}
		} else {
			for (int i_7_ = 0; i_7_ < i; i_7_++) {
				int i_8_ = is[i_7_];
				short[] is_9_ = (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aShortArrayArray8653[i_8_]);
				int i_10_ = ((Class282_Sub3) this).anIntArray7496[i_8_];
				if (i_10_ != 0 && is_9_ != null) {
					int i_11_ = 0;
					int i_12_ = 0;
					while (i_12_ < is_9_.length) {
						if ((i_10_ & 1 << i_11_++) != 0) {
							class282_sub35_sub1.writeLEShort((is_9_[i_12_++] & 0xffff), (byte) -66);
							i_0_++;
							class282_sub35_sub1.writeLEShort((is_9_[i_12_++] & 0xffff), (byte) -67);
							i_0_++;
							class282_sub35_sub1.writeLEShort((is_9_[i_12_++] & 0xffff), (byte) 31);
							i_0_++;
						} else
							i_12_ += 3;
					}
				}
			}
		}
		if (i_0_ > 0) {
			((Class282_Sub3) this).aClass131_Sub2_7491.method111(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
			((Class282_Sub3) this).aClass505_Sub1_7494.method13647((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8668), (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8670), ((Class282_Sub3) this).aClass143_7492, (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8671));
			((Class282_Sub3) this).aClass505_Sub1_7494.method13609(((Class282_Sub3) this).anInt7493, ((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).anInt8652) & 0x7) != 0, ((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).anInt8652) & 0x8) != 0);
			if (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aBool8448)
				((Class282_Sub3) this).aClass505_Sub1_7494.method8476(2147483647, ((Class282_Sub3) this).aClass90_7487);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / ((Class282_Sub3) this).aFloat7490, 1.0F / ((Class282_Sub3) this).aFloat7490, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class282_Sub3) this).aClass505_Sub1_7494.method13647((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8668), (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8670), ((Class282_Sub3) this).aClass143_7492, (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8671));
			((Class282_Sub3) this).aClass505_Sub1_7494.method13611(((Class282_Sub3) this).aClass131_Sub2_7491, 4, 0, i_0_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method12080(int[] is, int i) {
		int i_13_ = 0;
		Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aClass282_Sub35_Sub1_8499);
		class282_sub35_sub1.index = 0;
		if (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aBool8467) {
			for (int i_14_ = 0; i_14_ < i; i_14_++) {
				int i_15_ = is[i_14_];
				short[] is_16_ = (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aShortArrayArray8653[i_15_]);
				int i_17_ = ((Class282_Sub3) this).anIntArray7496[i_15_];
				if (i_17_ != 0 && is_16_ != null) {
					int i_18_ = 0;
					int i_19_ = 0;
					while (i_19_ < is_16_.length) {
						if ((i_17_ & 1 << i_18_++) != 0) {
							class282_sub35_sub1.writeShort((is_16_[i_19_++] & 0xffff), 1417031095);
							i_13_++;
							class282_sub35_sub1.writeShort((is_16_[i_19_++] & 0xffff), 1417031095);
							i_13_++;
							class282_sub35_sub1.writeShort((is_16_[i_19_++] & 0xffff), 1417031095);
							i_13_++;
						} else
							i_19_ += 3;
					}
				}
			}
		} else {
			for (int i_20_ = 0; i_20_ < i; i_20_++) {
				int i_21_ = is[i_20_];
				short[] is_22_ = (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aShortArrayArray8653[i_21_]);
				int i_23_ = ((Class282_Sub3) this).anIntArray7496[i_21_];
				if (i_23_ != 0 && is_22_ != null) {
					int i_24_ = 0;
					int i_25_ = 0;
					while (i_25_ < is_22_.length) {
						if ((i_23_ & 1 << i_24_++) != 0) {
							class282_sub35_sub1.writeLEShort((is_22_[i_25_++] & 0xffff), (byte) -78);
							i_13_++;
							class282_sub35_sub1.writeLEShort((is_22_[i_25_++] & 0xffff), (byte) 25);
							i_13_++;
							class282_sub35_sub1.writeLEShort((is_22_[i_25_++] & 0xffff), (byte) -45);
							i_13_++;
						} else
							i_25_ += 3;
					}
				}
			}
		}
		if (i_13_ > 0) {
			((Class282_Sub3) this).aClass131_Sub2_7491.method111(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
			((Class282_Sub3) this).aClass505_Sub1_7494.method13647((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8668), (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8670), ((Class282_Sub3) this).aClass143_7492, (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8671));
			((Class282_Sub3) this).aClass505_Sub1_7494.method13609(((Class282_Sub3) this).anInt7493, ((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).anInt8652) & 0x7) != 0, ((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).anInt8652) & 0x8) != 0);
			if (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aBool8448)
				((Class282_Sub3) this).aClass505_Sub1_7494.method8476(2147483647, ((Class282_Sub3) this).aClass90_7487);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / ((Class282_Sub3) this).aFloat7490, 1.0F / ((Class282_Sub3) this).aFloat7490, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class282_Sub3) this).aClass505_Sub1_7494.method13647((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8668), (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8670), ((Class282_Sub3) this).aClass143_7492, (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8671));
			((Class282_Sub3) this).aClass505_Sub1_7494.method13611(((Class282_Sub3) this).aClass131_Sub2_7491, 4, 0, i_13_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method12081(int i) {
		((Class282_Sub3) this).aStream7489.method2919(i * 4 + 3);
		((Class282_Sub3) this).aStream7489.method2920(-1);
	}

	void method12082(int i, int i_26_, int i_27_) {
		((Class282_Sub3) this).anIntArray7496[i_26_ * (((Class282_Sub3) this).aClass390_Sub2_7488.anInt4776 * -1843860823) + i] |= 1 << i_27_;
	}

	void method12083(int i, int i_28_, int i_29_, float f) {
		if (((Class282_Sub3) this).anInt7493 != -1) {
			Class169 class169 = (((Class282_Sub3) this).aClass505_Sub1_7494.anInterface22_5834.method144(((Class282_Sub3) this).anInt7493, -2121726716));
			int i_30_ = class169.aByte2079 & 0xff;
			if (i_30_ != 0 && class169.aByte2064 != 4) {
				int i_31_;
				if (i_29_ < 0)
					i_31_ = 0;
				else if (i_29_ > 127)
					i_31_ = 16777215;
				else
					i_31_ = 131586 * i_29_;
				if (i_30_ == 256)
					i_28_ = i_31_;
				else {
					int i_32_ = i_30_;
					int i_33_ = 256 - i_30_;
					i_28_ = ((((i_31_ & 0xff00ff) * i_32_ + (i_28_ & 0xff00ff) * i_33_) & ~0xff00ff) + (((i_31_ & 0xff00) * i_32_ + (i_28_ & 0xff00) * i_33_) & 0xff0000)) >> 8;
				}
			}
			int i_34_ = class169.aByte2080 & 0xff;
			if (i_34_ != 0) {
				i_34_ += 256;
				int i_35_ = ((i_28_ & 0xff0000) >> 16) * i_34_;
				if (i_35_ > 65535)
					i_35_ = 65535;
				int i_36_ = ((i_28_ & 0xff00) >> 8) * i_34_;
				if (i_36_ > 65535)
					i_36_ = 65535;
				int i_37_ = (i_28_ & 0xff) * i_34_;
				if (i_37_ > 65535)
					i_37_ = 65535;
				i_28_ = (i_35_ << 8 & 0xff0000) + (i_36_ & 0xff00) + (i_37_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_38_ = i_28_ >> 16 & 0xff;
			int i_39_ = i_28_ >> 8 & 0xff;
			int i_40_ = i_28_ & 0xff;
			i_38_ *= f;
			if (i_38_ < 0)
				i_38_ = 0;
			else if (i_38_ > 255)
				i_38_ = 255;
			i_39_ *= f;
			if (i_39_ < 0)
				i_39_ = 0;
			else if (i_39_ > 255)
				i_39_ = 255;
			i_40_ *= f;
			if (i_40_ < 0)
				i_40_ = 0;
			else if (i_40_ > 255)
				i_40_ = 255;
			i_28_ = i_38_ << 16 | i_39_ << 8 | i_40_;
		}
		((Class282_Sub3) this).aStream7489.method2919(i * 4);
		((Class282_Sub3) this).aStream7489.method2920((byte) (i_28_ >> 16));
		((Class282_Sub3) this).aStream7489.method2920((byte) (i_28_ >> 8));
		((Class282_Sub3) this).aStream7489.method2920((byte) i_28_);
	}

	void method12084(int i, int i_41_, int i_42_, float f) {
		if (((Class282_Sub3) this).anInt7493 != -1) {
			Class169 class169 = (((Class282_Sub3) this).aClass505_Sub1_7494.anInterface22_5834.method144(((Class282_Sub3) this).anInt7493, -2077075775));
			int i_43_ = class169.aByte2079 & 0xff;
			if (i_43_ != 0 && class169.aByte2064 != 4) {
				int i_44_;
				if (i_42_ < 0)
					i_44_ = 0;
				else if (i_42_ > 127)
					i_44_ = 16777215;
				else
					i_44_ = 131586 * i_42_;
				if (i_43_ == 256)
					i_41_ = i_44_;
				else {
					int i_45_ = i_43_;
					int i_46_ = 256 - i_43_;
					i_41_ = ((((i_44_ & 0xff00ff) * i_45_ + (i_41_ & 0xff00ff) * i_46_) & ~0xff00ff) + (((i_44_ & 0xff00) * i_45_ + (i_41_ & 0xff00) * i_46_) & 0xff0000)) >> 8;
				}
			}
			int i_47_ = class169.aByte2080 & 0xff;
			if (i_47_ != 0) {
				i_47_ += 256;
				int i_48_ = ((i_41_ & 0xff0000) >> 16) * i_47_;
				if (i_48_ > 65535)
					i_48_ = 65535;
				int i_49_ = ((i_41_ & 0xff00) >> 8) * i_47_;
				if (i_49_ > 65535)
					i_49_ = 65535;
				int i_50_ = (i_41_ & 0xff) * i_47_;
				if (i_50_ > 65535)
					i_50_ = 65535;
				i_41_ = (i_48_ << 8 & 0xff0000) + (i_49_ & 0xff00) + (i_50_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_51_ = i_41_ >> 16 & 0xff;
			int i_52_ = i_41_ >> 8 & 0xff;
			int i_53_ = i_41_ & 0xff;
			i_51_ *= f;
			if (i_51_ < 0)
				i_51_ = 0;
			else if (i_51_ > 255)
				i_51_ = 255;
			i_52_ *= f;
			if (i_52_ < 0)
				i_52_ = 0;
			else if (i_52_ > 255)
				i_52_ = 255;
			i_53_ *= f;
			if (i_53_ < 0)
				i_53_ = 0;
			else if (i_53_ > 255)
				i_53_ = 255;
			i_41_ = i_51_ << 16 | i_52_ << 8 | i_53_;
		}
		((Class282_Sub3) this).aStream7489.method2919(i * 4);
		((Class282_Sub3) this).aStream7489.method2920((byte) (i_41_ >> 16));
		((Class282_Sub3) this).aStream7489.method2920((byte) (i_41_ >> 8));
		((Class282_Sub3) this).aStream7489.method2920((byte) i_41_);
	}

	void method12085(int[] is, int i) {
		int i_54_ = 0;
		Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aClass282_Sub35_Sub1_8499);
		class282_sub35_sub1.index = 0;
		if (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aBool8467) {
			for (int i_55_ = 0; i_55_ < i; i_55_++) {
				int i_56_ = is[i_55_];
				short[] is_57_ = (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aShortArrayArray8653[i_56_]);
				int i_58_ = ((Class282_Sub3) this).anIntArray7496[i_56_];
				if (i_58_ != 0 && is_57_ != null) {
					int i_59_ = 0;
					int i_60_ = 0;
					while (i_60_ < is_57_.length) {
						if ((i_58_ & 1 << i_59_++) != 0) {
							class282_sub35_sub1.writeShort((is_57_[i_60_++] & 0xffff), 1417031095);
							i_54_++;
							class282_sub35_sub1.writeShort((is_57_[i_60_++] & 0xffff), 1417031095);
							i_54_++;
							class282_sub35_sub1.writeShort((is_57_[i_60_++] & 0xffff), 1417031095);
							i_54_++;
						} else
							i_60_ += 3;
					}
				}
			}
		} else {
			for (int i_61_ = 0; i_61_ < i; i_61_++) {
				int i_62_ = is[i_61_];
				short[] is_63_ = (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aShortArrayArray8653[i_62_]);
				int i_64_ = ((Class282_Sub3) this).anIntArray7496[i_62_];
				if (i_64_ != 0 && is_63_ != null) {
					int i_65_ = 0;
					int i_66_ = 0;
					while (i_66_ < is_63_.length) {
						if ((i_64_ & 1 << i_65_++) != 0) {
							class282_sub35_sub1.writeLEShort((is_63_[i_66_++] & 0xffff), (byte) -68);
							i_54_++;
							class282_sub35_sub1.writeLEShort((is_63_[i_66_++] & 0xffff), (byte) -75);
							i_54_++;
							class282_sub35_sub1.writeLEShort((is_63_[i_66_++] & 0xffff), (byte) 31);
							i_54_++;
						} else
							i_66_ += 3;
					}
				}
			}
		}
		if (i_54_ > 0) {
			((Class282_Sub3) this).aClass131_Sub2_7491.method111(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
			((Class282_Sub3) this).aClass505_Sub1_7494.method13647((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8668), (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8670), ((Class282_Sub3) this).aClass143_7492, (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8671));
			((Class282_Sub3) this).aClass505_Sub1_7494.method13609(((Class282_Sub3) this).anInt7493, ((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).anInt8652) & 0x7) != 0, ((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).anInt8652) & 0x8) != 0);
			if (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aBool8448)
				((Class282_Sub3) this).aClass505_Sub1_7494.method8476(2147483647, ((Class282_Sub3) this).aClass90_7487);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / ((Class282_Sub3) this).aFloat7490, 1.0F / ((Class282_Sub3) this).aFloat7490, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class282_Sub3) this).aClass505_Sub1_7494.method13647((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8668), (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8670), ((Class282_Sub3) this).aClass143_7492, (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8671));
			((Class282_Sub3) this).aClass505_Sub1_7494.method13611(((Class282_Sub3) this).aClass131_Sub2_7491, 4, 0, i_54_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method12086(int i) {
		((Class282_Sub3) this).aNativeHeapBuffer7495 = ((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aNativeHeap8445.method759(i * 4, true);
		((Class282_Sub3) this).aStream7489 = new Stream(((Class282_Sub3) this).aNativeHeapBuffer7495);
	}

	void method12087(int i) {
		((Class282_Sub3) this).aStream7489.method2925();
		Interface14 interface14 = (((Class282_Sub3) this).aClass505_Sub1_7494.method13600(4, ((Class282_Sub3) this).aNativeHeapBuffer7495, i * 4, false));
		if (interface14 instanceof Class135_Sub2)
			((Class282_Sub3) this).aNativeHeapBuffer7495.method1178();
		((Class282_Sub3) this).aClass143_7492 = new Class143(interface14, 5121, 4, 0);
		((Class282_Sub3) this).aNativeHeapBuffer7495 = null;
		((Class282_Sub3) this).aStream7489 = null;
	}

	Class282_Sub3(Class390_Sub2 class390_sub2, int i, int i_67_, Class90 class90) {
		((Class282_Sub3) this).aClass390_Sub2_7488 = class390_sub2;
		((Class282_Sub3) this).aClass505_Sub1_7494 = (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass505_Sub1_8648);
		((Class282_Sub3) this).anInt7493 = i;
		((Class282_Sub3) this).aFloat7490 = (float) i_67_;
		((Class282_Sub3) this).aClass90_7487 = class90;
		((Class282_Sub3) this).anIntArray7496 = new int[(((Class282_Sub3) this).aClass390_Sub2_7488.anInt4776 * -1843860823 * (((Class282_Sub3) this).aClass390_Sub2_7488.anInt4773 * 1826078169))];
		((Class282_Sub3) this).aClass131_Sub2_7491 = new Class131_Sub2(((Class282_Sub3) this).aClass505_Sub1_7494, 5123, null, 1);
	}

	void method12088(int i, int i_68_, int i_69_, float f) {
		if (((Class282_Sub3) this).anInt7493 != -1) {
			Class169 class169 = (((Class282_Sub3) this).aClass505_Sub1_7494.anInterface22_5834.method144(((Class282_Sub3) this).anInt7493, -1927713634));
			int i_70_ = class169.aByte2079 & 0xff;
			if (i_70_ != 0 && class169.aByte2064 != 4) {
				int i_71_;
				if (i_69_ < 0)
					i_71_ = 0;
				else if (i_69_ > 127)
					i_71_ = 16777215;
				else
					i_71_ = 131586 * i_69_;
				if (i_70_ == 256)
					i_68_ = i_71_;
				else {
					int i_72_ = i_70_;
					int i_73_ = 256 - i_70_;
					i_68_ = ((((i_71_ & 0xff00ff) * i_72_ + (i_68_ & 0xff00ff) * i_73_) & ~0xff00ff) + (((i_71_ & 0xff00) * i_72_ + (i_68_ & 0xff00) * i_73_) & 0xff0000)) >> 8;
				}
			}
			int i_74_ = class169.aByte2080 & 0xff;
			if (i_74_ != 0) {
				i_74_ += 256;
				int i_75_ = ((i_68_ & 0xff0000) >> 16) * i_74_;
				if (i_75_ > 65535)
					i_75_ = 65535;
				int i_76_ = ((i_68_ & 0xff00) >> 8) * i_74_;
				if (i_76_ > 65535)
					i_76_ = 65535;
				int i_77_ = (i_68_ & 0xff) * i_74_;
				if (i_77_ > 65535)
					i_77_ = 65535;
				i_68_ = (i_75_ << 8 & 0xff0000) + (i_76_ & 0xff00) + (i_77_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_78_ = i_68_ >> 16 & 0xff;
			int i_79_ = i_68_ >> 8 & 0xff;
			int i_80_ = i_68_ & 0xff;
			i_78_ *= f;
			if (i_78_ < 0)
				i_78_ = 0;
			else if (i_78_ > 255)
				i_78_ = 255;
			i_79_ *= f;
			if (i_79_ < 0)
				i_79_ = 0;
			else if (i_79_ > 255)
				i_79_ = 255;
			i_80_ *= f;
			if (i_80_ < 0)
				i_80_ = 0;
			else if (i_80_ > 255)
				i_80_ = 255;
			i_68_ = i_78_ << 16 | i_79_ << 8 | i_80_;
		}
		((Class282_Sub3) this).aStream7489.method2919(i * 4);
		((Class282_Sub3) this).aStream7489.method2920((byte) (i_68_ >> 16));
		((Class282_Sub3) this).aStream7489.method2920((byte) (i_68_ >> 8));
		((Class282_Sub3) this).aStream7489.method2920((byte) i_68_);
	}

	void method12089(int i) {
		((Class282_Sub3) this).aStream7489.method2925();
		Interface14 interface14 = (((Class282_Sub3) this).aClass505_Sub1_7494.method13600(4, ((Class282_Sub3) this).aNativeHeapBuffer7495, i * 4, false));
		if (interface14 instanceof Class135_Sub2)
			((Class282_Sub3) this).aNativeHeapBuffer7495.method1178();
		((Class282_Sub3) this).aClass143_7492 = new Class143(interface14, 5121, 4, 0);
		((Class282_Sub3) this).aNativeHeapBuffer7495 = null;
		((Class282_Sub3) this).aStream7489 = null;
	}

	void method12090(int i) {
		((Class282_Sub3) this).aStream7489.method2925();
		Interface14 interface14 = (((Class282_Sub3) this).aClass505_Sub1_7494.method13600(4, ((Class282_Sub3) this).aNativeHeapBuffer7495, i * 4, false));
		if (interface14 instanceof Class135_Sub2)
			((Class282_Sub3) this).aNativeHeapBuffer7495.method1178();
		((Class282_Sub3) this).aClass143_7492 = new Class143(interface14, 5121, 4, 0);
		((Class282_Sub3) this).aNativeHeapBuffer7495 = null;
		((Class282_Sub3) this).aStream7489 = null;
	}

	void method12091(int[] is, int i) {
		int i_81_ = 0;
		Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aClass282_Sub35_Sub1_8499);
		class282_sub35_sub1.index = 0;
		if (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aBool8467) {
			for (int i_82_ = 0; i_82_ < i; i_82_++) {
				int i_83_ = is[i_82_];
				short[] is_84_ = (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aShortArrayArray8653[i_83_]);
				int i_85_ = ((Class282_Sub3) this).anIntArray7496[i_83_];
				if (i_85_ != 0 && is_84_ != null) {
					int i_86_ = 0;
					int i_87_ = 0;
					while (i_87_ < is_84_.length) {
						if ((i_85_ & 1 << i_86_++) != 0) {
							class282_sub35_sub1.writeShort((is_84_[i_87_++] & 0xffff), 1417031095);
							i_81_++;
							class282_sub35_sub1.writeShort((is_84_[i_87_++] & 0xffff), 1417031095);
							i_81_++;
							class282_sub35_sub1.writeShort((is_84_[i_87_++] & 0xffff), 1417031095);
							i_81_++;
						} else
							i_87_ += 3;
					}
				}
			}
		} else {
			for (int i_88_ = 0; i_88_ < i; i_88_++) {
				int i_89_ = is[i_88_];
				short[] is_90_ = (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aShortArrayArray8653[i_89_]);
				int i_91_ = ((Class282_Sub3) this).anIntArray7496[i_89_];
				if (i_91_ != 0 && is_90_ != null) {
					int i_92_ = 0;
					int i_93_ = 0;
					while (i_93_ < is_90_.length) {
						if ((i_91_ & 1 << i_92_++) != 0) {
							class282_sub35_sub1.writeLEShort((is_90_[i_93_++] & 0xffff), (byte) -26);
							i_81_++;
							class282_sub35_sub1.writeLEShort((is_90_[i_93_++] & 0xffff), (byte) 41);
							i_81_++;
							class282_sub35_sub1.writeLEShort((is_90_[i_93_++] & 0xffff), (byte) 56);
							i_81_++;
						} else
							i_93_ += 3;
					}
				}
			}
		}
		if (i_81_ > 0) {
			((Class282_Sub3) this).aClass131_Sub2_7491.method111(5123, class282_sub35_sub1.buffer, class282_sub35_sub1.index * -1990677291);
			((Class282_Sub3) this).aClass505_Sub1_7494.method13647((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8668), (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8670), ((Class282_Sub3) this).aClass143_7492, (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8671));
			((Class282_Sub3) this).aClass505_Sub1_7494.method13609(((Class282_Sub3) this).anInt7493, ((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).anInt8652) & 0x7) != 0, ((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).anInt8652) & 0x8) != 0);
			if (((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aBool8448)
				((Class282_Sub3) this).aClass505_Sub1_7494.method8476(2147483647, ((Class282_Sub3) this).aClass90_7487);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / ((Class282_Sub3) this).aFloat7490, 1.0F / ((Class282_Sub3) this).aFloat7490, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class282_Sub3) this).aClass505_Sub1_7494.method13647((((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8668), (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8670), ((Class282_Sub3) this).aClass143_7492, (((Class390_Sub2) ((Class282_Sub3) this).aClass390_Sub2_7488).aClass143_8671));
			((Class282_Sub3) this).aClass505_Sub1_7494.method13611(((Class282_Sub3) this).aClass131_Sub2_7491, 4, 0, i_81_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method12092(int i) {
		((Class282_Sub3) this).aNativeHeapBuffer7495 = ((Class505_Sub1) ((Class282_Sub3) this).aClass505_Sub1_7494).aNativeHeap8445.method759(i * 4, true);
		((Class282_Sub3) this).aStream7489 = new Stream(((Class282_Sub3) this).aNativeHeapBuffer7495);
	}

	void method12093(int i) {
		((Class282_Sub3) this).aStream7489.method2919(i * 4 + 3);
		((Class282_Sub3) this).aStream7489.method2920(-1);
	}
}
