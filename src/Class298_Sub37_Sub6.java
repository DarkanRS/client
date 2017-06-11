/* Class298_Sub37_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub6 extends Class298_Sub37 {
	static int[] anIntArray9586;
	static double aDouble9587 = -1.0;
	Class298_Sub32 aClass298_Sub32_9588;
	Class298_Sub32 aClass298_Sub32_9589;
	Class298_Sub32 aClass298_Sub32_9590;
	int[] anIntArray9591;
	Class298_Sub32[] aClass298_Sub32Array9592;
	int[] anIntArray9593;

	boolean method3420(Class243 class243, Interface_ma interface_ma, byte i) {
		try {
			if (-1132597157 * Class298_Sub32_Sub11.anInt9394 >= 0) {
				for (int i_0_ = 0; i_0_ < ((Class298_Sub37_Sub6) this).anIntArray9593.length; i_0_++) {
					if (!class243.method2290((-1132597157 * (Class298_Sub32_Sub11.anInt9394)), (((Class298_Sub37_Sub6) this).anIntArray9593[i_0_]), -416567288))
						return false;
				}
			} else {
				for (int i_1_ = 0; i_1_ < ((Class298_Sub37_Sub6) this).anIntArray9593.length; i_1_++) {
					if (!class243.method2310((((Class298_Sub37_Sub6) this).anIntArray9593[i_1_]), -457216440))
						return false;
				}
			}
			for (int i_2_ = 0; i_2_ < ((Class298_Sub37_Sub6) this).anIntArray9591.length; i_2_++) {
				if (!interface_ma.method170((((Class298_Sub37_Sub6) this).anIntArray9591[i_2_]), (short) 5558))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ail.a(").append(')').toString());
		}
	}

	int[] method3421(Class243 class243, Interface_ma interface_ma, double d, int i, int i_3_, boolean bool, int i_4_) {
		try {
			Class298_Sub32_Sub11.aClass243_9393 = class243;
			Class294.anInterface_ma3166 = interface_ma;
			for (int i_5_ = 0; i_5_ < (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592).length; i_5_++)
				((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[i_5_].method3130(i, i_3_, -1661668864);
			Class496.method6202(d);
			Class250.method2397(i, i_3_, (byte) 24);
			int[] is = new int[i * i_3_];
			int i_6_ = 0;
			for (int i_7_ = 0; i_7_ < i_3_; i_7_++) {
				int[] is_8_;
				int[] is_9_;
				int[] is_10_;
				if (((Class298_Sub37_Sub6) this).aClass298_Sub32_9589.aBoolean7382) {
					int[] is_11_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9589.method3131(i_7_, -1060810232);
					is_8_ = is_11_;
					is_9_ = is_11_;
					is_10_ = is_11_;
				} else {
					int[][] is_12_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9589.method3132(i_7_, (byte) -23);
					is_8_ = is_12_[0];
					is_9_ = is_12_[1];
					is_10_ = is_12_[2];
				}
				int[] is_13_;
				if (((Class298_Sub37_Sub6) this).aClass298_Sub32_9588.aBoolean7382)
					is_13_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9588.method3131(i_7_, 991664315);
				else
					is_13_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9588.method3132(i_7_, (byte) -109)[0];
				if (bool)
					i_6_ = i_7_;
				for (int i_14_ = i - 1; i_14_ >= 0; i_14_--) {
					int i_15_ = is_8_[i_14_] >> 4;
					if (i_15_ > 255)
						i_15_ = 255;
					if (i_15_ < 0)
						i_15_ = 0;
					int i_16_ = is_9_[i_14_] >> 4;
					if (i_16_ > 255)
						i_16_ = 255;
					if (i_16_ < 0)
						i_16_ = 0;
					int i_17_ = is_10_[i_14_] >> 4;
					if (i_17_ > 255)
						i_17_ = 255;
					if (i_17_ < 0)
						i_17_ = 0;
					i_15_ = anIntArray9586[i_15_];
					i_16_ = anIntArray9586[i_16_];
					i_17_ = anIntArray9586[i_17_];
					int i_18_;
					if (i_15_ != 0 || 0 != i_16_ || 0 != i_17_) {
						i_18_ = is_13_[i_14_] >> 4;
						if (i_18_ > 255)
							i_18_ = 255;
						if (i_18_ < 0)
							i_18_ = 0;
					} else
						i_18_ = 0;
					is[i_6_++] = (i_18_ << 24) + (i_15_ << 16) + (i_16_ << 8) + i_17_;
					if (bool)
						i_6_ += i - 1;
				}
			}
			for (int i_19_ = 0; i_19_ < (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592).length; i_19_++)
				((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[i_19_].method3128(1881168514);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ail.b(").append(')').toString());
		}
	}

	float[] method3422(Class243 class243, Interface_ma interface_ma, int i, int i_20_, boolean bool, int i_21_) {
		try {
			Class298_Sub32_Sub11.aClass243_9393 = class243;
			Class294.anInterface_ma3166 = interface_ma;
			for (int i_22_ = 0; i_22_ < (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592).length; i_22_++)
				((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[i_22_].method3130(i, i_20_, -1661668864);
			Class250.method2397(i, i_20_, (byte) 24);
			float[] fs = new float[i * i_20_ * 4];
			int i_23_ = 0;
			for (int i_24_ = 0; i_24_ < i_20_; i_24_++) {
				int[] is;
				int[] is_25_;
				int[] is_26_;
				if (((Class298_Sub37_Sub6) this).aClass298_Sub32_9589.aBoolean7382) {
					int[] is_27_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9589.method3131(i_24_, 376891989);
					is = is_27_;
					is_25_ = is_27_;
					is_26_ = is_27_;
				} else {
					int[][] is_28_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9589.method3132(i_24_, (byte) -81);
					is = is_28_[0];
					is_25_ = is_28_[1];
					is_26_ = is_28_[2];
				}
				int[] is_29_;
				if (((Class298_Sub37_Sub6) this).aClass298_Sub32_9588.aBoolean7382)
					is_29_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9588.method3131(i_24_, 1373971312);
				else
					is_29_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9588.method3132(i_24_, (byte) -16)[0];
				int[] is_30_;
				if (((Class298_Sub37_Sub6) this).aClass298_Sub32_9590.aBoolean7382)
					is_30_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9590.method3131(i_24_, -306931016);
				else
					is_30_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9590.method3132(i_24_, (byte) -17)[0];
				if (bool)
					i_23_ = i_24_ << 2;
				for (int i_31_ = i - 1; i_31_ >= 0; i_31_--) {
					float f = (float) is_29_[i_31_] / 4096.0F;
					float f_32_ = (((float) is_30_[i_31_] * 31.0F / 4096.0F + 1.0F) / 4096.0F);
					if (f < 0.0F)
						f = 0.0F;
					else if (f > 1.0F)
						f = 1.0F;
					fs[i_23_++] = f_32_ * (float) is[i_31_];
					fs[i_23_++] = (float) is_25_[i_31_] * f_32_;
					fs[i_23_++] = f_32_ * (float) is_26_[i_31_];
					fs[i_23_++] = f;
					if (bool)
						i_23_ += (i << 2) - 4;
				}
			}
			for (int i_33_ = 0; i_33_ < (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592).length; i_33_++)
				((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[i_33_].method3128(1881168514);
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ail.p(").append(')').toString());
		}
	}

	static {
		anIntArray9586 = new int[256];
	}

	Class298_Sub37_Sub6(RsByteBuffer class298_sub53) {
		int i = class298_sub53.readUnsignedByte();
		int i_34_ = 0;
		int i_35_ = 0;
		int[][] is = new int[i][];
		((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592 = new Class298_Sub32[i];
		for (int i_36_ = 0; i_36_ < i; i_36_++) {
			Class298_Sub32 class298_sub32 = ConfigDefinitions.method3981(class298_sub53, -1133567452);
			if (class298_sub32.method3135((short) -979) >= 0)
				i_34_++;
			if (class298_sub32.method3136((byte) 13) >= 0)
				i_35_++;
			int i_37_ = (((Class298_Sub32) class298_sub32).aClass298_Sub32Array7371).length;
			is[i_36_] = new int[i_37_];
			for (int i_38_ = 0; i_38_ < i_37_; i_38_++)
				is[i_36_][i_38_] = class298_sub53.readUnsignedByte();
			((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[i_36_] = class298_sub32;
		}
		((Class298_Sub37_Sub6) this).anIntArray9593 = new int[i_34_];
		i_34_ = 0;
		((Class298_Sub37_Sub6) this).anIntArray9591 = new int[i_35_];
		i_35_ = 0;
		for (int i_39_ = 0; i_39_ < i; i_39_++) {
			Class298_Sub32 class298_sub32 = ((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[i_39_];
			int i_40_ = (((Class298_Sub32) class298_sub32).aClass298_Sub32Array7371).length;
			for (int i_41_ = 0; i_41_ < i_40_; i_41_++)
				((Class298_Sub32) class298_sub32).aClass298_Sub32Array7371[i_41_] = (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[is[i_39_][i_41_]]);
			int i_42_ = class298_sub32.method3135((short) -3617);
			int i_43_ = class298_sub32.method3136((byte) 1);
			if (i_42_ > 0)
				((Class298_Sub37_Sub6) this).anIntArray9593[i_34_++] = i_42_;
			if (i_43_ > 0)
				((Class298_Sub37_Sub6) this).anIntArray9591[i_35_++] = i_43_;
			is[i_39_] = null;
		}
		((Class298_Sub37_Sub6) this).aClass298_Sub32_9589 = (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[class298_sub53.readUnsignedByte()]);
		((Class298_Sub37_Sub6) this).aClass298_Sub32_9588 = (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[class298_sub53.readUnsignedByte()]);
		((Class298_Sub37_Sub6) this).aClass298_Sub32_9590 = (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[class298_sub53.readUnsignedByte()]);
		is = null;
	}

	int[] method3423(Class243 class243, Interface_ma interface_ma, double d, int i, int i_44_, boolean bool, boolean bool_45_, int i_46_) {
		try {
			Class298_Sub32_Sub11.aClass243_9393 = class243;
			Class294.anInterface_ma3166 = interface_ma;
			for (int i_47_ = 0; i_47_ < (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592).length; i_47_++)
				((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[i_47_].method3130(i, i_44_, -1661668864);
			Class496.method6202(d);
			Class250.method2397(i, i_44_, (byte) 24);
			int[] is = new int[i * i_44_];
			int i_48_;
			int i_49_;
			int i_50_;
			if (bool) {
				i_48_ = i - 1;
				i_49_ = -1;
				i_50_ = -1;
			} else {
				i_48_ = 0;
				i_49_ = i;
				i_50_ = 1;
			}
			int i_51_ = 0;
			for (int i_52_ = 0; i_52_ < i_44_; i_52_++) {
				int[] is_53_;
				int[] is_54_;
				int[] is_55_;
				if (((Class298_Sub37_Sub6) this).aClass298_Sub32_9589.aBoolean7382) {
					int[] is_56_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9589.method3131(i_52_, 1662825531);
					is_53_ = is_56_;
					is_54_ = is_56_;
					is_55_ = is_56_;
				} else {
					int[][] is_57_ = ((Class298_Sub37_Sub6) this).aClass298_Sub32_9589.method3132(i_52_, (byte) -95);
					is_53_ = is_57_[0];
					is_54_ = is_57_[1];
					is_55_ = is_57_[2];
				}
				if (bool_45_)
					i_51_ = i_52_;
				for (int i_58_ = i_48_; i_49_ != i_58_; i_58_ += i_50_) {
					int i_59_ = is_53_[i_58_] >> 4;
					if (i_59_ > 255)
						i_59_ = 255;
					if (i_59_ < 0)
						i_59_ = 0;
					int i_60_ = is_54_[i_58_] >> 4;
					if (i_60_ > 255)
						i_60_ = 255;
					if (i_60_ < 0)
						i_60_ = 0;
					int i_61_ = is_55_[i_58_] >> 4;
					if (i_61_ > 255)
						i_61_ = 255;
					if (i_61_ < 0)
						i_61_ = 0;
					i_59_ = anIntArray9586[i_59_];
					i_60_ = anIntArray9586[i_60_];
					i_61_ = anIntArray9586[i_61_];
					int i_62_ = i_61_ + ((i_59_ << 16) + (i_60_ << 8));
					if (i_62_ != 0)
						i_62_ |= ~0xffffff;
					is[i_51_++] = i_62_;
					if (bool_45_)
						i_51_ += i - 1;
				}
			}
			for (int i_63_ = 0; i_63_ < (((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592).length; i_63_++)
				((Class298_Sub37_Sub6) this).aClass298_Sub32Array9592[i_63_].method3128(1881168514);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ail.f(").append(')').toString());
		}
	}
}
