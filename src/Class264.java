/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class264 {
	public static byte[] method4780(int i, int i_0_, int i_1_, int i_2_, Class261 class261, float f, float f_3_, float f_4_, float f_5_, float f_6_) {
		byte[] is = new byte[i * i_0_ * i_1_];
		method4783(i, i_0_, i_1_, i_2_, class261, f, f_3_, f_4_, f_5_, f_6_, is, 0);
		return is;
	}

	static void method4781(int i, int i_7_, int i_8_, int i_9_, int i_10_, Class261 class261, float f, float f_11_, float f_12_, float f_13_, float f_14_, byte[] is, int i_15_) {
		int i_16_ = i_7_ * i_8_;
		float[] fs = new float[i_16_];
		for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
			int i_18_ = i_15_;
			class261.method4634(i, i_7_, i_8_, i_9_, f / (float) i_7_, f_11_ / (float) i_8_, f_12_ / (float) i_9_, f_13_ * 127.0F, fs, 0);
			for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
				is[i_18_] += fs[i_19_];
				i_18_++;
			}
			f *= 2.0F;
			f_11_ *= 2.0F;
			f_12_ *= 2.0F;
			f_13_ *= f_14_;
		}
		int i_20_ = i_15_;
		for (int i_21_ = 0; i_21_ < i_16_; i_21_++) {
			is[i_20_] = (byte) (is[i_20_] + 127);
			i_20_++;
		}
	}

	public static byte[] method4782(int i, int i_22_, int i_23_, int i_24_, Class261 class261, float f, float f_25_, float f_26_, float f_27_, float f_28_) {
		byte[] is = new byte[i * i_22_ * i_23_];
		method4783(i, i_22_, i_23_, i_24_, class261, f, f_25_, f_26_, f_27_, f_28_, is, 0);
		return is;
	}

	static void method4783(int i, int i_29_, int i_30_, int i_31_, Class261 class261, float f, float f_32_, float f_33_, float f_34_, float f_35_, byte[] is, int i_36_) {
		for (int i_37_ = 0; i_37_ < i_30_; i_37_++) {
			method4781(i_37_, i, i_29_, i_30_, i_31_, class261, f, f_32_, f_33_, f_34_, f_35_, is, i_36_);
			i_36_ += i * i_29_;
		}
	}

	Class264() throws Throwable {
		throw new Error();
	}

	static void method4784(int i, int i_38_, int i_39_, int i_40_, Class261 class261, float f, float f_41_, float f_42_, float f_43_, float f_44_, byte[] is, int i_45_) {
		for (int i_46_ = 0; i_46_ < i_39_; i_46_++) {
			method4781(i_46_, i, i_38_, i_39_, i_40_, class261, f, f_41_, f_42_, f_43_, f_44_, is, i_45_);
			i_45_ += i * i_38_;
		}
	}

	public static byte[] method4785(int i, int i_47_, int i_48_, int i_49_, Class261 class261, float f, float f_50_, float f_51_, float f_52_, float f_53_) {
		byte[] is = new byte[i * i_47_ * i_48_];
		method4783(i, i_47_, i_48_, i_49_, class261, f, f_50_, f_51_, f_52_, f_53_, is, 0);
		return is;
	}

	public static byte[] method4786(int i, int i_54_, int i_55_, int i_56_, Class261 class261, float f, float f_57_, float f_58_, float f_59_, float f_60_) {
		byte[] is = new byte[i * i_54_ * i_55_];
		method4783(i, i_54_, i_55_, i_56_, class261, f, f_57_, f_58_, f_59_, f_60_, is, 0);
		return is;
	}

	static void method4787(int i, int i_61_, int i_62_, int i_63_, Class261 class261, float f, float f_64_, float f_65_, float f_66_, float f_67_, byte[] is, int i_68_) {
		for (int i_69_ = 0; i_69_ < i_62_; i_69_++) {
			method4781(i_69_, i, i_61_, i_62_, i_63_, class261, f, f_64_, f_65_, f_66_, f_67_, is, i_68_);
			i_68_ += i * i_61_;
		}
	}

	static void method4788(int i, int i_70_, int i_71_, int i_72_, int i_73_, Class261 class261, float f, float f_74_, float f_75_, float f_76_, float f_77_, byte[] is, int i_78_) {
		int i_79_ = i_70_ * i_71_;
		float[] fs = new float[i_79_];
		for (int i_80_ = 0; i_80_ < i_73_; i_80_++) {
			int i_81_ = i_78_;
			class261.method4634(i, i_70_, i_71_, i_72_, f / (float) i_70_, f_74_ / (float) i_71_, f_75_ / (float) i_72_, f_76_ * 127.0F, fs, 0);
			for (int i_82_ = 0; i_82_ < i_79_; i_82_++) {
				is[i_81_] += fs[i_82_];
				i_81_++;
			}
			f *= 2.0F;
			f_74_ *= 2.0F;
			f_75_ *= 2.0F;
			f_76_ *= f_77_;
		}
		int i_83_ = i_78_;
		for (int i_84_ = 0; i_84_ < i_79_; i_84_++) {
			is[i_83_] = (byte) (is[i_83_] + 127);
			i_83_++;
		}
	}
}
