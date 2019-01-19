
/* Class282_Sub50_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.FileOutputStream;

public class TextureDefinition extends Class282_Sub50 {
	int[] anIntArray9473;
	static int[] anIntArray9474;
	int[] anIntArray9475;
	Class282_Sub20 aClass282_Sub20_9476;
	Class282_Sub20 aClass282_Sub20_9477;
	Class282_Sub20[] aClass282_Sub20Array9478;
	static double aDouble9479 = -1.0;
	Class282_Sub20 aClass282_Sub20_9480;
	static FileOutputStream aFileOutputStream9481;

	boolean method14717(Index class317, Interface22 interface22, int i) {
		if (-890139849 * Class282_Sub20_Sub29.anInt9913 >= 0) {
			for (int i_0_ = 0; i_0_ < ((TextureDefinition) this).anIntArray9475.length; i_0_++) {
				if (!class317.load((Class282_Sub20_Sub29.anInt9913 * -890139849), (((TextureDefinition) this).anIntArray9475[i_0_]), 16711935))
					return false;
			}
		} else {
			for (int i_1_ = 0; i_1_ < ((TextureDefinition) this).anIntArray9475.length; i_1_++) {
				if (!class317.method5661((((TextureDefinition) this).anIntArray9475[i_1_]), 1546931007))
					return false;
			}
		}
		for (int i_2_ = 0; i_2_ < ((TextureDefinition) this).anIntArray9473.length; i_2_++) {
			if (!interface22.method139((((TextureDefinition) this).anIntArray9473[i_2_]), -324994004))
				return false;
		}
		return true;
	}

	int[] method14718(Index class317, Interface22 interface22, double d, int i, int i_3_, boolean bool, boolean bool_4_, int i_5_) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_6_ = 0; (i_6_ < ((TextureDefinition) this).aClass282_Sub20Array9478.length); i_6_++)
			((TextureDefinition) this).aClass282_Sub20Array9478[i_6_].method12315(i, i_3_, (byte) 60);
		SoftCache.method3895(d);
		Class316.method5593(i, i_3_, 1422267205);
		int[] is = new int[i_3_ * i];
		int i_7_;
		int i_8_;
		int i_9_;
		if (bool) {
			i_7_ = i - 1;
			i_8_ = -1;
			i_9_ = -1;
		} else {
			i_7_ = 0;
			i_8_ = i;
			i_9_ = 1;
		}
		int i_10_ = 0;
		for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
			int[] is_12_;
			int[] is_13_;
			int[] is_14_;
			if (((TextureDefinition) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_15_ = ((TextureDefinition) this).aClass282_Sub20_9476.method12319(i_11_, 752457538);
				is_12_ = is_15_;
				is_13_ = is_15_;
				is_14_ = is_15_;
			} else {
				int[][] is_16_ = ((TextureDefinition) this).aClass282_Sub20_9476.method12320(i_11_, 1981543466);
				is_12_ = is_16_[0];
				is_13_ = is_16_[1];
				is_14_ = is_16_[2];
			}
			if (bool_4_)
				i_10_ = i_11_;
			for (int i_17_ = i_7_; i_17_ != i_8_; i_17_ += i_9_) {
				int i_18_ = is_12_[i_17_] >> 4;
				if (i_18_ > 255)
					i_18_ = 255;
				if (i_18_ < 0)
					i_18_ = 0;
				int i_19_ = is_13_[i_17_] >> 4;
				if (i_19_ > 255)
					i_19_ = 255;
				if (i_19_ < 0)
					i_19_ = 0;
				int i_20_ = is_14_[i_17_] >> 4;
				if (i_20_ > 255)
					i_20_ = 255;
				if (i_20_ < 0)
					i_20_ = 0;
				i_18_ = anIntArray9474[i_18_];
				i_19_ = anIntArray9474[i_19_];
				i_20_ = anIntArray9474[i_20_];
				int i_21_ = (i_18_ << 16) + (i_19_ << 8) + i_20_;
				if (i_21_ != 0)
					i_21_ |= ~0xffffff;
				is[i_10_++] = i_21_;
				if (bool_4_)
					i_10_ += i - 1;
			}
		}
		for (int i_22_ = 0; (i_22_ < ((TextureDefinition) this).aClass282_Sub20Array9478.length); i_22_++)
			((TextureDefinition) this).aClass282_Sub20Array9478[i_22_].method12326(984017845);
		return is;
	}

	int[] method14719(Index class317, Interface22 interface22, double d, int i, int i_23_, boolean bool, byte i_24_) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_25_ = 0; (i_25_ < ((TextureDefinition) this).aClass282_Sub20Array9478.length); i_25_++)
			((TextureDefinition) this).aClass282_Sub20Array9478[i_25_].method12315(i, i_23_, (byte) 116);
		SoftCache.method3895(d);
		Class316.method5593(i, i_23_, 1384434405);
		int[] is = new int[i * i_23_];
		int i_26_ = 0;
		for (int i_27_ = 0; i_27_ < i_23_; i_27_++) {
			int[] is_28_;
			int[] is_29_;
			int[] is_30_;
			if (((TextureDefinition) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_31_ = ((TextureDefinition) this).aClass282_Sub20_9476.method12319(i_27_, 752457538);
				is_28_ = is_31_;
				is_29_ = is_31_;
				is_30_ = is_31_;
			} else {
				int[][] is_32_ = ((TextureDefinition) this).aClass282_Sub20_9476.method12320(i_27_, -1291616356);
				is_28_ = is_32_[0];
				is_29_ = is_32_[1];
				is_30_ = is_32_[2];
			}
			int[] is_33_;
			if (((TextureDefinition) this).aClass282_Sub20_9477.aBool7669)
				is_33_ = ((TextureDefinition) this).aClass282_Sub20_9477.method12319(i_27_, 752457538);
			else
				is_33_ = ((TextureDefinition) this).aClass282_Sub20_9477.method12320(i_27_, 1766478944)[0];
			if (bool)
				i_26_ = i_27_;
			for (int i_34_ = i - 1; i_34_ >= 0; i_34_--) {
				int i_35_ = is_28_[i_34_] >> 4;
				if (i_35_ > 255)
					i_35_ = 255;
				if (i_35_ < 0)
					i_35_ = 0;
				int i_36_ = is_29_[i_34_] >> 4;
				if (i_36_ > 255)
					i_36_ = 255;
				if (i_36_ < 0)
					i_36_ = 0;
				int i_37_ = is_30_[i_34_] >> 4;
				if (i_37_ > 255)
					i_37_ = 255;
				if (i_37_ < 0)
					i_37_ = 0;
				i_35_ = anIntArray9474[i_35_];
				i_36_ = anIntArray9474[i_36_];
				i_37_ = anIntArray9474[i_37_];
				int i_38_;
				if (i_35_ != 0 || 0 != i_36_ || i_37_ != 0) {
					i_38_ = is_33_[i_34_] >> 4;
					if (i_38_ > 255)
						i_38_ = 255;
					if (i_38_ < 0)
						i_38_ = 0;
				} else
					i_38_ = 0;
				is[i_26_++] = (i_36_ << 8) + ((i_35_ << 16) + (i_38_ << 24)) + i_37_;
				if (bool)
					i_26_ += i - 1;
			}
		}
		for (int i_39_ = 0; (i_39_ < ((TextureDefinition) this).aClass282_Sub20Array9478.length); i_39_++)
			((TextureDefinition) this).aClass282_Sub20Array9478[i_39_].method12326(984017845);
		return is;
	}

	static {
		anIntArray9474 = new int[256];
	}

	TextureDefinition(RsByteBuffer stream) {
		int size1 = stream.readUnsignedByte();
		int i_40_ = 0;
		int i_41_ = 0;
		int[][] is = new int[size1][];
		((TextureDefinition) this).aClass282_Sub20Array9478 = new Class282_Sub20[size1];
		for (int i_42_ = 0; i_42_ < size1; i_42_++) {
			Class282_Sub20 class282_sub20 = Class278.method4963(stream, (byte) -7);
			if (class282_sub20.method12323(1338991452) >= 0)
				i_40_++;
			if (class282_sub20.method12324((byte) 44) >= 0)
				i_41_++;
			int i_43_ = (((Class282_Sub20) class282_sub20).aClass282_Sub20Array7671).length;
			is[i_42_] = new int[i_43_];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
				is[i_42_][i_44_] = stream.readUnsignedByte();
			((TextureDefinition) this).aClass282_Sub20Array9478[i_42_] = class282_sub20;
		}
		((TextureDefinition) this).anIntArray9475 = new int[i_40_];
		i_40_ = 0;
		((TextureDefinition) this).anIntArray9473 = new int[i_41_];
		i_41_ = 0;
		for (int i_45_ = 0; i_45_ < size1; i_45_++) {
			Class282_Sub20 class282_sub20 = ((TextureDefinition) this).aClass282_Sub20Array9478[i_45_];
			int i_46_ = (((Class282_Sub20) class282_sub20).aClass282_Sub20Array7671).length;
			for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
				((Class282_Sub20) class282_sub20).aClass282_Sub20Array7671[i_47_] = (((TextureDefinition) this).aClass282_Sub20Array9478[is[i_45_][i_47_]]);
			int i_48_ = class282_sub20.method12323(1338991452);
			int i_49_ = class282_sub20.method12324((byte) 117);
			if (i_48_ > 0)
				((TextureDefinition) this).anIntArray9475[i_40_++] = i_48_;
			if (i_49_ > 0)
				((TextureDefinition) this).anIntArray9473[i_41_++] = i_49_;
			is[i_45_] = null;
		}
		((TextureDefinition) this).aClass282_Sub20_9476 = (((TextureDefinition) this).aClass282_Sub20Array9478[stream.readUnsignedByte()]);
		((TextureDefinition) this).aClass282_Sub20_9477 = (((TextureDefinition) this).aClass282_Sub20Array9478[stream.readUnsignedByte()]);
		((TextureDefinition) this).aClass282_Sub20_9480 = (((TextureDefinition) this).aClass282_Sub20Array9478[stream.readUnsignedByte()]);
		is = null;
	}

	float[] method14723(Index class317, Interface22 interface22, int i, int i_50_, boolean bool, int i_51_) {
		Class532_Sub2.aClass317_7925 = class317;
		Class532_Sub1.anInterface22_7922 = interface22;
		for (int i_52_ = 0; (i_52_ < ((TextureDefinition) this).aClass282_Sub20Array9478.length); i_52_++)
			((TextureDefinition) this).aClass282_Sub20Array9478[i_52_].method12315(i, i_50_, (byte) 59);
		Class316.method5593(i, i_50_, -315322197);
		float[] fs = new float[i_50_ * i * 4];
		int i_53_ = 0;
		for (int i_54_ = 0; i_54_ < i_50_; i_54_++) {
			int[] is;
			int[] is_55_;
			int[] is_56_;
			if (((TextureDefinition) this).aClass282_Sub20_9476.aBool7669) {
				int[] is_57_ = ((TextureDefinition) this).aClass282_Sub20_9476.method12319(i_54_, 752457538);
				is = is_57_;
				is_55_ = is_57_;
				is_56_ = is_57_;
			} else {
				int[][] is_58_ = ((TextureDefinition) this).aClass282_Sub20_9476.method12320(i_54_, 1271694305);
				is = is_58_[0];
				is_55_ = is_58_[1];
				is_56_ = is_58_[2];
			}
			int[] is_59_;
			if (((TextureDefinition) this).aClass282_Sub20_9477.aBool7669)
				is_59_ = ((TextureDefinition) this).aClass282_Sub20_9477.method12319(i_54_, 752457538);
			else
				is_59_ = ((TextureDefinition) this).aClass282_Sub20_9477.method12320(i_54_, -1071831227)[0];
			int[] is_60_;
			if (((TextureDefinition) this).aClass282_Sub20_9480.aBool7669)
				is_60_ = ((TextureDefinition) this).aClass282_Sub20_9480.method12319(i_54_, 752457538);
			else
				is_60_ = ((TextureDefinition) this).aClass282_Sub20_9480.method12320(i_54_, -1302016809)[0];
			if (bool)
				i_53_ = i_54_ << 2;
			for (int i_61_ = i - 1; i_61_ >= 0; i_61_--) {
				float f = (float) is_59_[i_61_] / 4096.0F;
				float f_62_ = ((1.0F + (float) is_60_[i_61_] * 31.0F / 4096.0F) / 4096.0F);
				if (f < 0.0F)
					f = 0.0F;
				else if (f > 1.0F)
					f = 1.0F;
				fs[i_53_++] = (float) is[i_61_] * f_62_;
				fs[i_53_++] = f_62_ * (float) is_55_[i_61_];
				fs[i_53_++] = (float) is_56_[i_61_] * f_62_;
				fs[i_53_++] = f;
				if (bool)
					i_53_ += (i << 2) - 4;
			}
		}
		for (int i_63_ = 0; (i_63_ < ((TextureDefinition) this).aClass282_Sub20Array9478.length); i_63_++)
			((TextureDefinition) this).aClass282_Sub20Array9478[i_63_].method12326(984017845);
		return fs;
	}
}
