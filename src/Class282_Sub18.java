
/* Class282_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class282_Sub18 extends Node {
	int anInt7604;
	int anInt7605;
	byte[][] aByteArrayArray7606;
	static byte[] aByteArray7607;
	float[] aFloatArray7608;
	boolean aBool7609;
	static Class338[] aClass338Array7610;
	static boolean aBool7611 = false;
	static float[] aFloatArray7612;
	static int anInt7613;
	static int anInt7614;
	static Class255[] aClass255Array7615;
	int anInt7616;
	static Class265[] aClass265Array7617;
	static Class259[] aClass259Array7618;
	static boolean[] aBoolArray7619;
	int anInt7620;
	static int[] anIntArray7621;
	float[] aFloatArray7622;
	int anInt7623;
	int anInt7624;
	boolean aBool7625;
	int anInt7626;
	static float[] aFloatArray7627;
	static float[] aFloatArray7628;
	static float[] aFloatArray7629;
	static float[] aFloatArray7630;
	static float[] aFloatArray7631;
	static float[] aFloatArray7632;
	static int[] anIntArray7633;
	static int[] anIntArray7634;
	static int anInt7635;
	int anInt7636 = 0;
	static int anInt7637;
	int anInt7638 = 0;

	static void method12261(byte[] is) {
		method12262(is, 0);
		anInt7635 = 1 << method12264(4);
		anInt7637 = 1 << method12264(4);
		aFloatArray7612 = new float[anInt7637];
		for (int i = 0; i < 2; i++) {
			int i_0_ = i != 0 ? anInt7637 : anInt7635;
			int i_1_ = i_0_ >> 1;
			int i_2_ = i_0_ >> 2;
			int i_3_ = i_0_ >> 3;
			float[] fs = new float[i_1_];
			for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
				fs[2 * i_4_] = (float) Math.cos((double) (4 * i_4_) * 3.141592653589793 / (double) i_0_);
				fs[2 * i_4_ + 1] = -(float) Math.sin((double) (4 * i_4_) * 3.141592653589793 / (double) i_0_);
			}
			float[] fs_5_ = new float[i_1_];
			for (int i_6_ = 0; i_6_ < i_2_; i_6_++) {
				fs_5_[2 * i_6_] = (float) Math.cos((double) (2 * i_6_ + 1) * 3.141592653589793 / (double) (2 * i_0_));
				fs_5_[2 * i_6_ + 1] = (float) Math.sin((double) (2 * i_6_ + 1) * 3.141592653589793 / (double) (2 * i_0_));
			}
			float[] fs_7_ = new float[i_2_];
			for (int i_8_ = 0; i_8_ < i_3_; i_8_++) {
				fs_7_[2 * i_8_] = (float) Math.cos((double) (4 * i_8_ + 2) * 3.141592653589793 / (double) i_0_);
				fs_7_[2 * i_8_ + 1] = -(float) Math.sin((double) (4 * i_8_ + 2) * 3.141592653589793 / (double) i_0_);
			}
			int[] is_9_ = new int[i_3_];
			int i_10_ = Class159.method2739(i_3_ - 1, 548668392);
			for (int i_11_ = 0; i_11_ < i_3_; i_11_++)
				is_9_[i_11_] = Class3.method285(i_11_, i_10_, 1788302958);
			if (i != 0) {
				aFloatArray7630 = fs;
				aFloatArray7631 = fs_5_;
				aFloatArray7632 = fs_7_;
				anIntArray7634 = is_9_;
			} else {
				aFloatArray7627 = fs;
				aFloatArray7628 = fs_5_;
				aFloatArray7629 = fs_7_;
				anIntArray7633 = is_9_;
			}
		}
		int i = method12264(8) + 1;
		aClass255Array7615 = new Class255[i];
		for (int i_12_ = 0; i_12_ < i; i_12_++)
			aClass255Array7615[i_12_] = new Class255();
		int i_13_ = method12264(6) + 1;
		for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
			method12264(16);
		i_13_ = method12264(6) + 1;
		aClass338Array7610 = new Class338[i_13_];
		for (int i_15_ = 0; i_15_ < i_13_; i_15_++)
			aClass338Array7610[i_15_] = new Class338();
		int i_16_ = method12264(6) + 1;
		aClass265Array7617 = new Class265[i_16_];
		for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
			aClass265Array7617[i_17_] = new Class265();
		int i_18_ = method12264(6) + 1;
		aClass259Array7618 = new Class259[i_18_];
		for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
			aClass259Array7618[i_19_] = new Class259();
		int i_20_ = method12264(6) + 1;
		aBoolArray7619 = new boolean[i_20_];
		anIntArray7621 = new int[i_20_];
		for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
			aBoolArray7619[i_21_] = method12263() != 0;
			method12264(16);
			method12264(16);
			anIntArray7621[i_21_] = method12264(8);
		}
		aBool7611 = true;
	}

	static void method12262(byte[] is, int i) {
		aByteArray7607 = is;
		anInt7614 = i;
		anInt7613 = 0;
	}

	static int method12263() {
		int i = aByteArray7607[anInt7614] >> anInt7613 & 0x1;
		anInt7613++;
		anInt7614 += anInt7613 >> 3;
		anInt7613 &= 0x7;
		return i;
	}

	static int method12264(int i) {
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_;
		for (/**/; i >= 8 - anInt7613; i -= i_24_) {
			i_24_ = 8 - anInt7613;
			int i_25_ = (1 << i_24_) - 1;
			i_22_ += (aByteArray7607[anInt7614] >> anInt7613 & i_25_) << i_23_;
			anInt7613 = 0;
			anInt7614++;
			i_23_ += i_24_;
		}
		if (i > 0) {
			i_24_ = (1 << i) - 1;
			i_22_ += (aByteArray7607[anInt7614] >> anInt7613 & i_24_) << i_23_;
			anInt7613 += i;
		}
		return i_22_;
	}

	void method12265(byte[] is) throws IOException {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		((Class282_Sub18) this).anInt7605 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7620 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7616 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7604 = class282_sub35.readInt();
		if (((Class282_Sub18) this).anInt7604 < 0) {
			((Class282_Sub18) this).anInt7604 = ((Class282_Sub18) this).anInt7604 ^ 0xffffffff;
			((Class282_Sub18) this).aBool7609 = true;
		}
		int i = class282_sub35.readInt();
		if (i < 0)
			throw new IOException();
		((Class282_Sub18) this).aByteArrayArray7606 = new byte[i][];
		for (int i_26_ = 0; i_26_ < i; i_26_++) {
			int i_27_ = 0;
			int i_28_;
			do {
				i_28_ = class282_sub35.readUnsignedByte();
				i_27_ += i_28_;
			} while (i_28_ >= 255);
			byte[] is_29_ = new byte[i_27_];
			class282_sub35.readBytes(is_29_, 0, i_27_, 1760605162);
			((Class282_Sub18) this).aByteArrayArray7606[i_26_] = is_29_;
		}
	}

	void method12266(int i) {
		if (i > ((Class282_Sub18) this).anInt7620 - 1)
			i = ((Class282_Sub18) this).anInt7620 - 1;
		if (i > ((Class282_Sub18) this).anInt7636)
			((Class282_Sub18) this).anInt7638 = method12273(i);
		else
			((Class282_Sub18) this).anInt7638 = 0;
		if (!method12276())
			((Class282_Sub18) this).aFloatArray7622 = null;
	}

	float[] method12267(int i) {
		method12262(((Class282_Sub18) this).aByteArrayArray7606[i], 0);
		method12263();
		int i_30_ = method12264(Class159.method2739(anIntArray7621.length - 1, -908362072));
		boolean bool = aBoolArray7619[i_30_];
		int i_31_ = bool ? anInt7637 : anInt7635;
		boolean bool_32_ = false;
		boolean bool_33_ = false;
		if (bool) {
			bool_32_ = method12263() != 0;
			bool_33_ = method12263() != 0;
		}
		int i_34_ = i_31_ >> 1;
		int i_35_;
		int i_36_;
		int i_37_;
		if (bool && !bool_32_) {
			i_35_ = (i_31_ >> 2) - (anInt7635 >> 2);
			i_36_ = (i_31_ >> 2) + (anInt7635 >> 2);
			i_37_ = anInt7635 >> 1;
		} else {
			i_35_ = 0;
			i_36_ = i_34_;
			i_37_ = i_31_ >> 1;
		}
		int i_38_;
		int i_39_;
		int i_40_;
		if (bool && !bool_33_) {
			i_38_ = i_31_ - (i_31_ >> 2) - (anInt7635 >> 2);
			i_39_ = i_31_ - (i_31_ >> 2) + (anInt7635 >> 2);
			i_40_ = anInt7635 >> 1;
		} else {
			i_38_ = i_34_;
			i_39_ = i_31_;
			i_40_ = i_31_ >> 1;
		}
		Class259 class259 = aClass259Array7618[anIntArray7621[i_30_]];
		int i_41_ = ((Class259) class259).anInt3214;
		int i_42_ = ((Class259) class259).anIntArray3215[i_41_];
		boolean bool_43_ = !aClass338Array7610[i_42_].method6024();
		boolean bool_44_ = bool_43_;
		for (i_42_ = 0; i_42_ < ((Class259) class259).anInt3213; i_42_++) {
			Class265 class265 = (aClass265Array7617[((Class259) class259).anIntArray3216[i_42_]]);
			float[] fs = aFloatArray7612;
			class265.method4790(fs, i_31_ >> 1, bool_44_);
		}
		if (!bool_43_) {
			i_42_ = ((Class259) class259).anInt3214;
			int i_45_ = ((Class259) class259).anIntArray3215[i_42_];
			aClass338Array7610[i_45_].method6025(aFloatArray7612, i_31_ >> 1);
		}
		if (bool_43_) {
			for (i_42_ = i_31_ >> 1; i_42_ < i_31_; i_42_++)
				aFloatArray7612[i_42_] = 0.0F;
		} else {
			i_42_ = i_31_ >> 1;
			int i_46_ = i_31_ >> 2;
			int i_47_ = i_31_ >> 3;
			float[] fs = aFloatArray7612;
			for (int i_48_ = 0; i_48_ < i_42_; i_48_++)
				fs[i_48_] *= 0.5F;
			for (int i_49_ = i_42_; i_49_ < i_31_; i_49_++)
				fs[i_49_] = -fs[i_31_ - i_49_ - 1];
			float[] fs_50_ = bool ? aFloatArray7630 : aFloatArray7627;
			float[] fs_51_ = bool ? aFloatArray7631 : aFloatArray7628;
			float[] fs_52_ = bool ? aFloatArray7632 : aFloatArray7629;
			int[] is = bool ? anIntArray7634 : anIntArray7633;
			for (int i_53_ = 0; i_53_ < i_46_; i_53_++) {
				float f = fs[4 * i_53_] - fs[i_31_ - 4 * i_53_ - 1];
				float f_54_ = fs[4 * i_53_ + 2] - fs[i_31_ - 4 * i_53_ - 3];
				float f_55_ = fs_50_[2 * i_53_];
				float f_56_ = fs_50_[2 * i_53_ + 1];
				fs[i_31_ - 4 * i_53_ - 1] = f * f_55_ - f_54_ * f_56_;
				fs[i_31_ - 4 * i_53_ - 3] = f * f_56_ + f_54_ * f_55_;
			}
			for (int i_57_ = 0; i_57_ < i_47_; i_57_++) {
				float f = fs[i_42_ + 3 + 4 * i_57_];
				float f_58_ = fs[i_42_ + 1 + 4 * i_57_];
				float f_59_ = fs[4 * i_57_ + 3];
				float f_60_ = fs[4 * i_57_ + 1];
				fs[i_42_ + 3 + 4 * i_57_] = f + f_59_;
				fs[i_42_ + 1 + 4 * i_57_] = f_58_ + f_60_;
				float f_61_ = fs_50_[i_42_ - 4 - 4 * i_57_];
				float f_62_ = fs_50_[i_42_ - 3 - 4 * i_57_];
				fs[4 * i_57_ + 3] = (f - f_59_) * f_61_ - (f_58_ - f_60_) * f_62_;
				fs[4 * i_57_ + 1] = (f_58_ - f_60_) * f_61_ + (f - f_59_) * f_62_;
			}
			int i_63_ = Class159.method2739(i_31_ - 1, -537302823);
			for (int i_64_ = 0; i_64_ < i_63_ - 3; i_64_++) {
				int i_65_ = i_31_ >> i_64_ + 2;
				int i_66_ = 8 << i_64_;
				for (int i_67_ = 0; i_67_ < 2 << i_64_; i_67_++) {
					int i_68_ = i_31_ - i_65_ * 2 * i_67_;
					int i_69_ = i_31_ - i_65_ * (2 * i_67_ + 1);
					for (int i_70_ = 0; i_70_ < i_31_ >> i_64_ + 4; i_70_++) {
						int i_71_ = 4 * i_70_;
						float f = fs[i_68_ - 1 - i_71_];
						float f_72_ = fs[i_68_ - 3 - i_71_];
						float f_73_ = fs[i_69_ - 1 - i_71_];
						float f_74_ = fs[i_69_ - 3 - i_71_];
						fs[i_68_ - 1 - i_71_] = f + f_73_;
						fs[i_68_ - 3 - i_71_] = f_72_ + f_74_;
						float f_75_ = fs_50_[i_70_ * i_66_];
						float f_76_ = fs_50_[i_70_ * i_66_ + 1];
						fs[i_69_ - 1 - i_71_] = (f - f_73_) * f_75_ - (f_72_ - f_74_) * f_76_;
						fs[i_69_ - 3 - i_71_] = (f_72_ - f_74_) * f_75_ + (f - f_73_) * f_76_;
					}
				}
			}
			for (int i_77_ = 1; i_77_ < i_47_ - 1; i_77_++) {
				int i_78_ = is[i_77_];
				if (i_77_ < i_78_) {
					int i_79_ = 8 * i_77_;
					int i_80_ = 8 * i_78_;
					float f = fs[i_79_ + 1];
					fs[i_79_ + 1] = fs[i_80_ + 1];
					fs[i_80_ + 1] = f;
					f = fs[i_79_ + 3];
					fs[i_79_ + 3] = fs[i_80_ + 3];
					fs[i_80_ + 3] = f;
					f = fs[i_79_ + 5];
					fs[i_79_ + 5] = fs[i_80_ + 5];
					fs[i_80_ + 5] = f;
					f = fs[i_79_ + 7];
					fs[i_79_ + 7] = fs[i_80_ + 7];
					fs[i_80_ + 7] = f;
				}
			}
			for (int i_81_ = 0; i_81_ < i_42_; i_81_++)
				fs[i_81_] = fs[2 * i_81_ + 1];
			for (int i_82_ = 0; i_82_ < i_47_; i_82_++) {
				fs[i_31_ - 1 - 2 * i_82_] = fs[4 * i_82_];
				fs[i_31_ - 2 - 2 * i_82_] = fs[4 * i_82_ + 1];
				fs[i_31_ - i_46_ - 1 - 2 * i_82_] = fs[4 * i_82_ + 2];
				fs[i_31_ - i_46_ - 2 - 2 * i_82_] = fs[4 * i_82_ + 3];
			}
			for (int i_83_ = 0; i_83_ < i_47_; i_83_++) {
				float f = fs_52_[2 * i_83_];
				float f_84_ = fs_52_[2 * i_83_ + 1];
				float f_85_ = fs[i_42_ + 2 * i_83_];
				float f_86_ = fs[i_42_ + 2 * i_83_ + 1];
				float f_87_ = fs[i_31_ - 2 - 2 * i_83_];
				float f_88_ = fs[i_31_ - 1 - 2 * i_83_];
				float f_89_ = f_84_ * (f_85_ - f_87_) + f * (f_86_ + f_88_);
				fs[i_42_ + 2 * i_83_] = (f_85_ + f_87_ + f_89_) * 0.5F;
				fs[i_31_ - 2 - 2 * i_83_] = (f_85_ + f_87_ - f_89_) * 0.5F;
				f_89_ = f_84_ * (f_86_ + f_88_) - f * (f_85_ - f_87_);
				fs[i_42_ + 2 * i_83_ + 1] = (f_86_ - f_88_ + f_89_) * 0.5F;
				fs[i_31_ - 1 - 2 * i_83_] = (-f_86_ + f_88_ + f_89_) * 0.5F;
			}
			for (int i_90_ = 0; i_90_ < i_46_; i_90_++) {
				fs[i_90_] = (fs[2 * i_90_ + i_42_] * fs_51_[2 * i_90_] + fs[2 * i_90_ + 1 + i_42_] * fs_51_[2 * i_90_ + 1]);
				fs[i_42_ - 1 - i_90_] = (fs[2 * i_90_ + i_42_] * fs_51_[2 * i_90_ + 1] - fs[2 * i_90_ + 1 + i_42_] * fs_51_[2 * i_90_]);
			}
			for (int i_91_ = 0; i_91_ < i_46_; i_91_++)
				fs[i_31_ - i_46_ + i_91_] = -fs[i_91_];
			for (int i_92_ = 0; i_92_ < i_46_; i_92_++)
				fs[i_92_] = fs[i_46_ + i_92_];
			for (int i_93_ = 0; i_93_ < i_46_; i_93_++)
				fs[i_46_ + i_93_] = -fs[i_46_ - i_93_ - 1];
			for (int i_94_ = 0; i_94_ < i_46_; i_94_++)
				fs[i_42_ + i_94_] = fs[i_31_ - i_94_ - 1];
			for (int i_95_ = i_35_; i_95_ < i_36_; i_95_++) {
				float f = (float) Math.sin(((double) (i_95_ - i_35_) + 0.5) / (double) i_37_ * 0.5 * 3.141592653589793);
				aFloatArray7612[i_95_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
			for (int i_96_ = i_38_; i_96_ < i_39_; i_96_++) {
				float f = (float) Math.sin((((double) (i_96_ - i_38_) + 0.5) / (double) i_40_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
				aFloatArray7612[i_96_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
		}
		float[] fs = null;
		if (((Class282_Sub18) this).anInt7623 > 0) {
			int i_97_ = ((Class282_Sub18) this).anInt7623 + i_31_ >> 2;
			fs = new float[i_97_];
			if (!((Class282_Sub18) this).aBool7625) {
				for (int i_98_ = 0; i_98_ < ((Class282_Sub18) this).anInt7624; i_98_++) {
					int i_99_ = (((Class282_Sub18) this).anInt7623 >> 1) + i_98_;
					fs[i_98_] += ((Class282_Sub18) this).aFloatArray7622[i_99_];
				}
			}
			if (!bool_43_) {
				for (int i_100_ = i_35_; i_100_ < i_31_ >> 1; i_100_++) {
					int i_101_ = fs.length - (i_31_ >> 1) + i_100_;
					fs[i_101_] += aFloatArray7612[i_100_];
				}
			}
		}
		float[] fs_102_ = ((Class282_Sub18) this).aFloatArray7622;
		((Class282_Sub18) this).aFloatArray7622 = aFloatArray7612;
		aFloatArray7612 = fs_102_;
		((Class282_Sub18) this).anInt7623 = i_31_;
		((Class282_Sub18) this).anInt7624 = i_39_ - (i_31_ >> 1);
		((Class282_Sub18) this).aBool7625 = bool_43_;
		return fs;
	}

	static boolean method12268(Index class317) {
		if (!aBool7611) {
			byte[] is = class317.getFile(0, 0);
			if (is == null)
				return false;
			method12261(is);
		}
		return true;
	}

	int method12269(int i) {
		int i_103_ = 0;
		if (((Class282_Sub18) this).aFloatArray7608 == null) {
			((Class282_Sub18) this).anInt7623 = 0;
			((Class282_Sub18) this).aFloatArray7622 = new float[anInt7637];
			((Class282_Sub18) this).aFloatArray7608 = new float[((Class282_Sub18) this).anInt7620];
			((Class282_Sub18) this).anInt7636 = 0;
			((Class282_Sub18) this).anInt7626 = 0;
		}
		for (/**/; (i > ((Class282_Sub18) this).anInt7636 && (((Class282_Sub18) this).anInt7626 < ((Class282_Sub18) this).aByteArrayArray7606.length)); ((Class282_Sub18) this).anInt7626++) {
			float[] fs = method12267(((Class282_Sub18) this).anInt7626);
			if (fs != null) {
				int i_104_ = ((Class282_Sub18) this).anInt7636;
				int i_105_ = fs.length;
				if (i_105_ > ((Class282_Sub18) this).anInt7620 - i_104_)
					i_105_ = ((Class282_Sub18) this).anInt7620 - i_104_;
				for (int i_106_ = 0; i_106_ < i_105_; i_106_++)
					((Class282_Sub18) this).aFloatArray7608[i_104_++] = fs[i_106_];
				i_103_ += i_104_ - ((Class282_Sub18) this).anInt7636;
				((Class282_Sub18) this).anInt7636 = i_104_;
			}
		}
		return i_103_;
	}

	public static Class282_Sub18 method12270(Index class317, int i) {
		if (!method12268(class317)) {
			class317.method5661(i, -1193230374);
			return null;
		}
		byte[] is = class317.getFile(i);
		if (is == null)
			return null;
		Class282_Sub18 class282_sub18 = null;
		try {
			class282_sub18 = new Class282_Sub18(is);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
		return class282_sub18;
	}

	static Class282_Sub18 method12271(Index class317, int i, int i_107_) {
		if (!method12268(class317)) {
			class317.load(i, i_107_);
			return null;
		}
		byte[] is = class317.getFile(i, i_107_);
		if (is == null)
			return null;
		Class282_Sub18 class282_sub18 = null;
		try {
			class282_sub18 = new Class282_Sub18(is);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
		return class282_sub18;
	}

	public Class282_Sub26_Sub1_Sub1 method12272() {
		Class2.method263(this, (byte) 24);
		if (!method12276() || ((((Class282_Sub18) this).anInt7636 > ((Class282_Sub18) this).anInt7605) && (((Class282_Sub18) this).anInt7638 > (((Class282_Sub18) this).anInt7605 / Class204.method3363(1396511710)))))
			return (new Class282_Sub26_Sub1_Sub1(((Class282_Sub18) this).anInt7605, this, ((Class282_Sub18) this).aFloatArray7608, ((Class282_Sub18) this).anInt7616, ((Class282_Sub18) this).anInt7604, ((Class282_Sub18) this).aBool7609));
		return null;
	}

	int method12273(int i) {
		int i_108_ = 0;
		if (((Class282_Sub18) this).aFloatArray7608 == null) {
			((Class282_Sub18) this).anInt7623 = 0;
			((Class282_Sub18) this).aFloatArray7622 = new float[anInt7637];
			((Class282_Sub18) this).aFloatArray7608 = new float[((Class282_Sub18) this).anInt7620];
			((Class282_Sub18) this).anInt7636 = 0;
			((Class282_Sub18) this).anInt7626 = 0;
		}
		for (/**/; (i > ((Class282_Sub18) this).anInt7636 && (((Class282_Sub18) this).anInt7626 < ((Class282_Sub18) this).aByteArrayArray7606.length)); ((Class282_Sub18) this).anInt7626++) {
			float[] fs = method12267(((Class282_Sub18) this).anInt7626);
			if (fs != null) {
				int i_109_ = ((Class282_Sub18) this).anInt7636;
				int i_110_ = fs.length;
				if (i_110_ > ((Class282_Sub18) this).anInt7620 - i_109_)
					i_110_ = ((Class282_Sub18) this).anInt7620 - i_109_;
				for (int i_111_ = 0; i_111_ < i_110_; i_111_++)
					((Class282_Sub18) this).aFloatArray7608[i_109_++] = fs[i_111_];
				i_108_ += i_109_ - ((Class282_Sub18) this).anInt7636;
				((Class282_Sub18) this).anInt7636 = i_109_;
			}
		}
		return i_108_;
	}

	public static Class282_Sub18 method12274(Index class317, int i) {
		if (!method12268(class317)) {
			class317.method5661(i, 1504778998);
			return null;
		}
		byte[] is = class317.getFile(i);
		if (is == null)
			return null;
		Class282_Sub18 class282_sub18 = null;
		try {
			class282_sub18 = new Class282_Sub18(is);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
		return class282_sub18;
	}

	int method12275() {
		return ((Class282_Sub18) this).anInt7636;
	}

	boolean method12276() {
		return (((Class282_Sub18) this).anInt7636 < ((Class282_Sub18) this).anInt7620 - 1);
	}

	int method12277() {
		return ((Class282_Sub18) this).anInt7605;
	}

	static float method12278(int i) {
		int i_112_ = i & 0x1fffff;
		int i_113_ = i & ~0x7fffffff;
		int i_114_ = (i & 0x7fe00000) >> 21;
		if (i_113_ != 0)
			i_112_ = -i_112_;
		return (float) ((double) i_112_ * Math.pow(2.0, (double) (i_114_ - 788)));
	}

	int method12279() {
		return ((Class282_Sub18) this).anInt7636;
	}

	static void method12280(byte[] is, int i) {
		aByteArray7607 = is;
		anInt7614 = i;
		anInt7613 = 0;
	}

	static int method12281() {
		int i = aByteArray7607[anInt7614] >> anInt7613 & 0x1;
		anInt7613++;
		anInt7614 += anInt7613 >> 3;
		anInt7613 &= 0x7;
		return i;
	}

	static boolean method12282(Index class317) {
		if (!aBool7611) {
			byte[] is = class317.getFile(0, 0);
			if (is == null)
				return false;
			method12261(is);
		}
		return true;
	}

	void method12283(byte[] is) throws IOException {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		((Class282_Sub18) this).anInt7605 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7620 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7616 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7604 = class282_sub35.readInt();
		if (((Class282_Sub18) this).anInt7604 < 0) {
			((Class282_Sub18) this).anInt7604 = ((Class282_Sub18) this).anInt7604 ^ 0xffffffff;
			((Class282_Sub18) this).aBool7609 = true;
		}
		int i = class282_sub35.readInt();
		if (i < 0)
			throw new IOException();
		((Class282_Sub18) this).aByteArrayArray7606 = new byte[i][];
		for (int i_115_ = 0; i_115_ < i; i_115_++) {
			int i_116_ = 0;
			int i_117_;
			do {
				i_117_ = class282_sub35.readUnsignedByte();
				i_116_ += i_117_;
			} while (i_117_ >= 255);
			byte[] is_118_ = new byte[i_116_];
			class282_sub35.readBytes(is_118_, 0, i_116_, 1426748296);
			((Class282_Sub18) this).aByteArrayArray7606[i_115_] = is_118_;
		}
	}

	void method12284(byte[] is) throws IOException {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		((Class282_Sub18) this).anInt7605 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7620 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7616 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7604 = class282_sub35.readInt();
		if (((Class282_Sub18) this).anInt7604 < 0) {
			((Class282_Sub18) this).anInt7604 = ((Class282_Sub18) this).anInt7604 ^ 0xffffffff;
			((Class282_Sub18) this).aBool7609 = true;
		}
		int i = class282_sub35.readInt();
		if (i < 0)
			throw new IOException();
		((Class282_Sub18) this).aByteArrayArray7606 = new byte[i][];
		for (int i_119_ = 0; i_119_ < i; i_119_++) {
			int i_120_ = 0;
			int i_121_;
			do {
				i_121_ = class282_sub35.readUnsignedByte();
				i_120_ += i_121_;
			} while (i_121_ >= 255);
			byte[] is_122_ = new byte[i_120_];
			class282_sub35.readBytes(is_122_, 0, i_120_, 836261343);
			((Class282_Sub18) this).aByteArrayArray7606[i_119_] = is_122_;
		}
	}

	void method12285(int i) {
		if (i > ((Class282_Sub18) this).anInt7620 - 1)
			i = ((Class282_Sub18) this).anInt7620 - 1;
		if (i > ((Class282_Sub18) this).anInt7636)
			((Class282_Sub18) this).anInt7638 = method12273(i);
		else
			((Class282_Sub18) this).anInt7638 = 0;
		if (!method12276())
			((Class282_Sub18) this).aFloatArray7622 = null;
	}

	static void method12286(byte[] is) {
		method12262(is, 0);
		anInt7635 = 1 << method12264(4);
		anInt7637 = 1 << method12264(4);
		aFloatArray7612 = new float[anInt7637];
		for (int i = 0; i < 2; i++) {
			int i_123_ = i != 0 ? anInt7637 : anInt7635;
			int i_124_ = i_123_ >> 1;
			int i_125_ = i_123_ >> 2;
			int i_126_ = i_123_ >> 3;
			float[] fs = new float[i_124_];
			for (int i_127_ = 0; i_127_ < i_125_; i_127_++) {
				fs[2 * i_127_] = (float) Math.cos((double) (4 * i_127_) * 3.141592653589793 / (double) i_123_);
				fs[2 * i_127_ + 1] = -(float) Math.sin((double) (4 * i_127_) * 3.141592653589793 / (double) i_123_);
			}
			float[] fs_128_ = new float[i_124_];
			for (int i_129_ = 0; i_129_ < i_125_; i_129_++) {
				fs_128_[2 * i_129_] = (float) Math.cos((double) (2 * i_129_ + 1) * 3.141592653589793 / (double) (2 * i_123_));
				fs_128_[2 * i_129_ + 1] = (float) Math.sin((double) (2 * i_129_ + 1) * 3.141592653589793 / (double) (2 * i_123_));
			}
			float[] fs_130_ = new float[i_125_];
			for (int i_131_ = 0; i_131_ < i_126_; i_131_++) {
				fs_130_[2 * i_131_] = (float) Math.cos((double) (4 * i_131_ + 2) * 3.141592653589793 / (double) i_123_);
				fs_130_[2 * i_131_ + 1] = -(float) Math.sin((double) (4 * i_131_ + 2) * 3.141592653589793 / (double) i_123_);
			}
			int[] is_132_ = new int[i_126_];
			int i_133_ = Class159.method2739(i_126_ - 1, -461114209);
			for (int i_134_ = 0; i_134_ < i_126_; i_134_++)
				is_132_[i_134_] = Class3.method285(i_134_, i_133_, 1200872127);
			if (i != 0) {
				aFloatArray7630 = fs;
				aFloatArray7631 = fs_128_;
				aFloatArray7632 = fs_130_;
				anIntArray7634 = is_132_;
			} else {
				aFloatArray7627 = fs;
				aFloatArray7628 = fs_128_;
				aFloatArray7629 = fs_130_;
				anIntArray7633 = is_132_;
			}
		}
		int i = method12264(8) + 1;
		aClass255Array7615 = new Class255[i];
		for (int i_135_ = 0; i_135_ < i; i_135_++)
			aClass255Array7615[i_135_] = new Class255();
		int i_136_ = method12264(6) + 1;
		for (int i_137_ = 0; i_137_ < i_136_; i_137_++)
			method12264(16);
		i_136_ = method12264(6) + 1;
		aClass338Array7610 = new Class338[i_136_];
		for (int i_138_ = 0; i_138_ < i_136_; i_138_++)
			aClass338Array7610[i_138_] = new Class338();
		int i_139_ = method12264(6) + 1;
		aClass265Array7617 = new Class265[i_139_];
		for (int i_140_ = 0; i_140_ < i_139_; i_140_++)
			aClass265Array7617[i_140_] = new Class265();
		int i_141_ = method12264(6) + 1;
		aClass259Array7618 = new Class259[i_141_];
		for (int i_142_ = 0; i_142_ < i_141_; i_142_++)
			aClass259Array7618[i_142_] = new Class259();
		int i_143_ = method12264(6) + 1;
		aBoolArray7619 = new boolean[i_143_];
		anIntArray7621 = new int[i_143_];
		for (int i_144_ = 0; i_144_ < i_143_; i_144_++) {
			aBoolArray7619[i_144_] = method12263() != 0;
			method12264(16);
			method12264(16);
			anIntArray7621[i_144_] = method12264(8);
		}
		aBool7611 = true;
	}

	float[] method12287(int i) {
		method12262(((Class282_Sub18) this).aByteArrayArray7606[i], 0);
		method12263();
		int i_145_ = method12264(Class159.method2739(anIntArray7621.length - 1, 1839030898));
		boolean bool = aBoolArray7619[i_145_];
		int i_146_ = bool ? anInt7637 : anInt7635;
		boolean bool_147_ = false;
		boolean bool_148_ = false;
		if (bool) {
			bool_147_ = method12263() != 0;
			bool_148_ = method12263() != 0;
		}
		int i_149_ = i_146_ >> 1;
		int i_150_;
		int i_151_;
		int i_152_;
		if (bool && !bool_147_) {
			i_150_ = (i_146_ >> 2) - (anInt7635 >> 2);
			i_151_ = (i_146_ >> 2) + (anInt7635 >> 2);
			i_152_ = anInt7635 >> 1;
		} else {
			i_150_ = 0;
			i_151_ = i_149_;
			i_152_ = i_146_ >> 1;
		}
		int i_153_;
		int i_154_;
		int i_155_;
		if (bool && !bool_148_) {
			i_153_ = i_146_ - (i_146_ >> 2) - (anInt7635 >> 2);
			i_154_ = i_146_ - (i_146_ >> 2) + (anInt7635 >> 2);
			i_155_ = anInt7635 >> 1;
		} else {
			i_153_ = i_149_;
			i_154_ = i_146_;
			i_155_ = i_146_ >> 1;
		}
		Class259 class259 = aClass259Array7618[anIntArray7621[i_145_]];
		int i_156_ = ((Class259) class259).anInt3214;
		int i_157_ = ((Class259) class259).anIntArray3215[i_156_];
		boolean bool_158_ = !aClass338Array7610[i_157_].method6024();
		boolean bool_159_ = bool_158_;
		for (i_157_ = 0; i_157_ < ((Class259) class259).anInt3213; i_157_++) {
			Class265 class265 = (aClass265Array7617[((Class259) class259).anIntArray3216[i_157_]]);
			float[] fs = aFloatArray7612;
			class265.method4790(fs, i_146_ >> 1, bool_159_);
		}
		if (!bool_158_) {
			i_157_ = ((Class259) class259).anInt3214;
			int i_160_ = ((Class259) class259).anIntArray3215[i_157_];
			aClass338Array7610[i_160_].method6025(aFloatArray7612, i_146_ >> 1);
		}
		if (bool_158_) {
			for (i_157_ = i_146_ >> 1; i_157_ < i_146_; i_157_++)
				aFloatArray7612[i_157_] = 0.0F;
		} else {
			i_157_ = i_146_ >> 1;
			int i_161_ = i_146_ >> 2;
			int i_162_ = i_146_ >> 3;
			float[] fs = aFloatArray7612;
			for (int i_163_ = 0; i_163_ < i_157_; i_163_++)
				fs[i_163_] *= 0.5F;
			for (int i_164_ = i_157_; i_164_ < i_146_; i_164_++)
				fs[i_164_] = -fs[i_146_ - i_164_ - 1];
			float[] fs_165_ = bool ? aFloatArray7630 : aFloatArray7627;
			float[] fs_166_ = bool ? aFloatArray7631 : aFloatArray7628;
			float[] fs_167_ = bool ? aFloatArray7632 : aFloatArray7629;
			int[] is = bool ? anIntArray7634 : anIntArray7633;
			for (int i_168_ = 0; i_168_ < i_161_; i_168_++) {
				float f = fs[4 * i_168_] - fs[i_146_ - 4 * i_168_ - 1];
				float f_169_ = fs[4 * i_168_ + 2] - fs[i_146_ - 4 * i_168_ - 3];
				float f_170_ = fs_165_[2 * i_168_];
				float f_171_ = fs_165_[2 * i_168_ + 1];
				fs[i_146_ - 4 * i_168_ - 1] = f * f_170_ - f_169_ * f_171_;
				fs[i_146_ - 4 * i_168_ - 3] = f * f_171_ + f_169_ * f_170_;
			}
			for (int i_172_ = 0; i_172_ < i_162_; i_172_++) {
				float f = fs[i_157_ + 3 + 4 * i_172_];
				float f_173_ = fs[i_157_ + 1 + 4 * i_172_];
				float f_174_ = fs[4 * i_172_ + 3];
				float f_175_ = fs[4 * i_172_ + 1];
				fs[i_157_ + 3 + 4 * i_172_] = f + f_174_;
				fs[i_157_ + 1 + 4 * i_172_] = f_173_ + f_175_;
				float f_176_ = fs_165_[i_157_ - 4 - 4 * i_172_];
				float f_177_ = fs_165_[i_157_ - 3 - 4 * i_172_];
				fs[4 * i_172_ + 3] = (f - f_174_) * f_176_ - (f_173_ - f_175_) * f_177_;
				fs[4 * i_172_ + 1] = (f_173_ - f_175_) * f_176_ + (f - f_174_) * f_177_;
			}
			int i_178_ = Class159.method2739(i_146_ - 1, 584822497);
			for (int i_179_ = 0; i_179_ < i_178_ - 3; i_179_++) {
				int i_180_ = i_146_ >> i_179_ + 2;
				int i_181_ = 8 << i_179_;
				for (int i_182_ = 0; i_182_ < 2 << i_179_; i_182_++) {
					int i_183_ = i_146_ - i_180_ * 2 * i_182_;
					int i_184_ = i_146_ - i_180_ * (2 * i_182_ + 1);
					for (int i_185_ = 0; i_185_ < i_146_ >> i_179_ + 4; i_185_++) {
						int i_186_ = 4 * i_185_;
						float f = fs[i_183_ - 1 - i_186_];
						float f_187_ = fs[i_183_ - 3 - i_186_];
						float f_188_ = fs[i_184_ - 1 - i_186_];
						float f_189_ = fs[i_184_ - 3 - i_186_];
						fs[i_183_ - 1 - i_186_] = f + f_188_;
						fs[i_183_ - 3 - i_186_] = f_187_ + f_189_;
						float f_190_ = fs_165_[i_185_ * i_181_];
						float f_191_ = fs_165_[i_185_ * i_181_ + 1];
						fs[i_184_ - 1 - i_186_] = ((f - f_188_) * f_190_ - (f_187_ - f_189_) * f_191_);
						fs[i_184_ - 3 - i_186_] = ((f_187_ - f_189_) * f_190_ + (f - f_188_) * f_191_);
					}
				}
			}
			for (int i_192_ = 1; i_192_ < i_162_ - 1; i_192_++) {
				int i_193_ = is[i_192_];
				if (i_192_ < i_193_) {
					int i_194_ = 8 * i_192_;
					int i_195_ = 8 * i_193_;
					float f = fs[i_194_ + 1];
					fs[i_194_ + 1] = fs[i_195_ + 1];
					fs[i_195_ + 1] = f;
					f = fs[i_194_ + 3];
					fs[i_194_ + 3] = fs[i_195_ + 3];
					fs[i_195_ + 3] = f;
					f = fs[i_194_ + 5];
					fs[i_194_ + 5] = fs[i_195_ + 5];
					fs[i_195_ + 5] = f;
					f = fs[i_194_ + 7];
					fs[i_194_ + 7] = fs[i_195_ + 7];
					fs[i_195_ + 7] = f;
				}
			}
			for (int i_196_ = 0; i_196_ < i_157_; i_196_++)
				fs[i_196_] = fs[2 * i_196_ + 1];
			for (int i_197_ = 0; i_197_ < i_162_; i_197_++) {
				fs[i_146_ - 1 - 2 * i_197_] = fs[4 * i_197_];
				fs[i_146_ - 2 - 2 * i_197_] = fs[4 * i_197_ + 1];
				fs[i_146_ - i_161_ - 1 - 2 * i_197_] = fs[4 * i_197_ + 2];
				fs[i_146_ - i_161_ - 2 - 2 * i_197_] = fs[4 * i_197_ + 3];
			}
			for (int i_198_ = 0; i_198_ < i_162_; i_198_++) {
				float f = fs_167_[2 * i_198_];
				float f_199_ = fs_167_[2 * i_198_ + 1];
				float f_200_ = fs[i_157_ + 2 * i_198_];
				float f_201_ = fs[i_157_ + 2 * i_198_ + 1];
				float f_202_ = fs[i_146_ - 2 - 2 * i_198_];
				float f_203_ = fs[i_146_ - 1 - 2 * i_198_];
				float f_204_ = f_199_ * (f_200_ - f_202_) + f * (f_201_ + f_203_);
				fs[i_157_ + 2 * i_198_] = (f_200_ + f_202_ + f_204_) * 0.5F;
				fs[i_146_ - 2 - 2 * i_198_] = (f_200_ + f_202_ - f_204_) * 0.5F;
				f_204_ = f_199_ * (f_201_ + f_203_) - f * (f_200_ - f_202_);
				fs[i_157_ + 2 * i_198_ + 1] = (f_201_ - f_203_ + f_204_) * 0.5F;
				fs[i_146_ - 1 - 2 * i_198_] = (-f_201_ + f_203_ + f_204_) * 0.5F;
			}
			for (int i_205_ = 0; i_205_ < i_161_; i_205_++) {
				fs[i_205_] = (fs[2 * i_205_ + i_157_] * fs_166_[2 * i_205_] + (fs[2 * i_205_ + 1 + i_157_] * fs_166_[2 * i_205_ + 1]));
				fs[i_157_ - 1 - i_205_] = (fs[2 * i_205_ + i_157_] * fs_166_[2 * i_205_ + 1] - fs[2 * i_205_ + 1 + i_157_] * fs_166_[2 * i_205_]);
			}
			for (int i_206_ = 0; i_206_ < i_161_; i_206_++)
				fs[i_146_ - i_161_ + i_206_] = -fs[i_206_];
			for (int i_207_ = 0; i_207_ < i_161_; i_207_++)
				fs[i_207_] = fs[i_161_ + i_207_];
			for (int i_208_ = 0; i_208_ < i_161_; i_208_++)
				fs[i_161_ + i_208_] = -fs[i_161_ - i_208_ - 1];
			for (int i_209_ = 0; i_209_ < i_161_; i_209_++)
				fs[i_157_ + i_209_] = fs[i_146_ - i_209_ - 1];
			for (int i_210_ = i_150_; i_210_ < i_151_; i_210_++) {
				float f = (float) Math.sin(((double) (i_210_ - i_150_) + 0.5) / (double) i_152_ * 0.5 * 3.141592653589793);
				aFloatArray7612[i_210_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
			for (int i_211_ = i_153_; i_211_ < i_154_; i_211_++) {
				float f = (float) Math.sin((((double) (i_211_ - i_153_) + 0.5) / (double) i_155_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
				aFloatArray7612[i_211_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
		}
		float[] fs = null;
		if (((Class282_Sub18) this).anInt7623 > 0) {
			int i_212_ = ((Class282_Sub18) this).anInt7623 + i_146_ >> 2;
			fs = new float[i_212_];
			if (!((Class282_Sub18) this).aBool7625) {
				for (int i_213_ = 0; i_213_ < ((Class282_Sub18) this).anInt7624; i_213_++) {
					int i_214_ = (((Class282_Sub18) this).anInt7623 >> 1) + i_213_;
					fs[i_213_] += ((Class282_Sub18) this).aFloatArray7622[i_214_];
				}
			}
			if (!bool_158_) {
				for (int i_215_ = i_150_; i_215_ < i_146_ >> 1; i_215_++) {
					int i_216_ = fs.length - (i_146_ >> 1) + i_215_;
					fs[i_216_] += aFloatArray7612[i_215_];
				}
			}
		}
		float[] fs_217_ = ((Class282_Sub18) this).aFloatArray7622;
		((Class282_Sub18) this).aFloatArray7622 = aFloatArray7612;
		aFloatArray7612 = fs_217_;
		((Class282_Sub18) this).anInt7623 = i_146_;
		((Class282_Sub18) this).anInt7624 = i_154_ - (i_146_ >> 1);
		((Class282_Sub18) this).aBool7625 = bool_158_;
		return fs;
	}

	int method12288() {
		return ((Class282_Sub18) this).anInt7605;
	}

	static boolean method12289(Index class317) {
		if (!aBool7611) {
			byte[] is = class317.getFile(0, 0);
			if (is == null)
				return false;
			method12261(is);
		}
		return true;
	}

	static boolean method12290(Index class317) {
		if (!aBool7611) {
			byte[] is = class317.getFile(0, 0);
			if (is == null)
				return false;
			method12261(is);
		}
		return true;
	}

	static boolean method12291(Index class317) {
		if (!aBool7611) {
			byte[] is = class317.getFile(0, 0);
			if (is == null)
				return false;
			method12261(is);
		}
		return true;
	}

	int method12292(int i) {
		int i_218_ = 0;
		if (((Class282_Sub18) this).aFloatArray7608 == null) {
			((Class282_Sub18) this).anInt7623 = 0;
			((Class282_Sub18) this).aFloatArray7622 = new float[anInt7637];
			((Class282_Sub18) this).aFloatArray7608 = new float[((Class282_Sub18) this).anInt7620];
			((Class282_Sub18) this).anInt7636 = 0;
			((Class282_Sub18) this).anInt7626 = 0;
		}
		for (/**/; (i > ((Class282_Sub18) this).anInt7636 && (((Class282_Sub18) this).anInt7626 < ((Class282_Sub18) this).aByteArrayArray7606.length)); ((Class282_Sub18) this).anInt7626++) {
			float[] fs = method12267(((Class282_Sub18) this).anInt7626);
			if (fs != null) {
				int i_219_ = ((Class282_Sub18) this).anInt7636;
				int i_220_ = fs.length;
				if (i_220_ > ((Class282_Sub18) this).anInt7620 - i_219_)
					i_220_ = ((Class282_Sub18) this).anInt7620 - i_219_;
				for (int i_221_ = 0; i_221_ < i_220_; i_221_++)
					((Class282_Sub18) this).aFloatArray7608[i_219_++] = fs[i_221_];
				i_218_ += i_219_ - ((Class282_Sub18) this).anInt7636;
				((Class282_Sub18) this).anInt7636 = i_219_;
			}
		}
		return i_218_;
	}

	static boolean method12293(Index class317) {
		if (!aBool7611) {
			byte[] is = class317.getFile(0, 0);
			if (is == null)
				return false;
			method12261(is);
		}
		return true;
	}

	Class282_Sub18(byte[] is) throws IOException {
		method12265(is);
	}

	void method12294(byte[] is) throws IOException {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		((Class282_Sub18) this).anInt7605 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7620 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7616 = class282_sub35.readInt();
		((Class282_Sub18) this).anInt7604 = class282_sub35.readInt();
		if (((Class282_Sub18) this).anInt7604 < 0) {
			((Class282_Sub18) this).anInt7604 = ((Class282_Sub18) this).anInt7604 ^ 0xffffffff;
			((Class282_Sub18) this).aBool7609 = true;
		}
		int i = class282_sub35.readInt();
		if (i < 0)
			throw new IOException();
		((Class282_Sub18) this).aByteArrayArray7606 = new byte[i][];
		for (int i_222_ = 0; i_222_ < i; i_222_++) {
			int i_223_ = 0;
			int i_224_;
			do {
				i_224_ = class282_sub35.readUnsignedByte();
				i_223_ += i_224_;
			} while (i_224_ >= 255);
			byte[] is_225_ = new byte[i_223_];
			class282_sub35.readBytes(is_225_, 0, i_223_, 1998582548);
			((Class282_Sub18) this).aByteArrayArray7606[i_222_] = is_225_;
		}
	}

	float[] method12295(int i) {
		method12262(((Class282_Sub18) this).aByteArrayArray7606[i], 0);
		method12263();
		int i_226_ = method12264(Class159.method2739(anIntArray7621.length - 1, 1850798922));
		boolean bool = aBoolArray7619[i_226_];
		int i_227_ = bool ? anInt7637 : anInt7635;
		boolean bool_228_ = false;
		boolean bool_229_ = false;
		if (bool) {
			bool_228_ = method12263() != 0;
			bool_229_ = method12263() != 0;
		}
		int i_230_ = i_227_ >> 1;
		int i_231_;
		int i_232_;
		int i_233_;
		if (bool && !bool_228_) {
			i_231_ = (i_227_ >> 2) - (anInt7635 >> 2);
			i_232_ = (i_227_ >> 2) + (anInt7635 >> 2);
			i_233_ = anInt7635 >> 1;
		} else {
			i_231_ = 0;
			i_232_ = i_230_;
			i_233_ = i_227_ >> 1;
		}
		int i_234_;
		int i_235_;
		int i_236_;
		if (bool && !bool_229_) {
			i_234_ = i_227_ - (i_227_ >> 2) - (anInt7635 >> 2);
			i_235_ = i_227_ - (i_227_ >> 2) + (anInt7635 >> 2);
			i_236_ = anInt7635 >> 1;
		} else {
			i_234_ = i_230_;
			i_235_ = i_227_;
			i_236_ = i_227_ >> 1;
		}
		Class259 class259 = aClass259Array7618[anIntArray7621[i_226_]];
		int i_237_ = ((Class259) class259).anInt3214;
		int i_238_ = ((Class259) class259).anIntArray3215[i_237_];
		boolean bool_239_ = !aClass338Array7610[i_238_].method6024();
		boolean bool_240_ = bool_239_;
		for (i_238_ = 0; i_238_ < ((Class259) class259).anInt3213; i_238_++) {
			Class265 class265 = (aClass265Array7617[((Class259) class259).anIntArray3216[i_238_]]);
			float[] fs = aFloatArray7612;
			class265.method4790(fs, i_227_ >> 1, bool_240_);
		}
		if (!bool_239_) {
			i_238_ = ((Class259) class259).anInt3214;
			int i_241_ = ((Class259) class259).anIntArray3215[i_238_];
			aClass338Array7610[i_241_].method6025(aFloatArray7612, i_227_ >> 1);
		}
		if (bool_239_) {
			for (i_238_ = i_227_ >> 1; i_238_ < i_227_; i_238_++)
				aFloatArray7612[i_238_] = 0.0F;
		} else {
			i_238_ = i_227_ >> 1;
			int i_242_ = i_227_ >> 2;
			int i_243_ = i_227_ >> 3;
			float[] fs = aFloatArray7612;
			for (int i_244_ = 0; i_244_ < i_238_; i_244_++)
				fs[i_244_] *= 0.5F;
			for (int i_245_ = i_238_; i_245_ < i_227_; i_245_++)
				fs[i_245_] = -fs[i_227_ - i_245_ - 1];
			float[] fs_246_ = bool ? aFloatArray7630 : aFloatArray7627;
			float[] fs_247_ = bool ? aFloatArray7631 : aFloatArray7628;
			float[] fs_248_ = bool ? aFloatArray7632 : aFloatArray7629;
			int[] is = bool ? anIntArray7634 : anIntArray7633;
			for (int i_249_ = 0; i_249_ < i_242_; i_249_++) {
				float f = fs[4 * i_249_] - fs[i_227_ - 4 * i_249_ - 1];
				float f_250_ = fs[4 * i_249_ + 2] - fs[i_227_ - 4 * i_249_ - 3];
				float f_251_ = fs_246_[2 * i_249_];
				float f_252_ = fs_246_[2 * i_249_ + 1];
				fs[i_227_ - 4 * i_249_ - 1] = f * f_251_ - f_250_ * f_252_;
				fs[i_227_ - 4 * i_249_ - 3] = f * f_252_ + f_250_ * f_251_;
			}
			for (int i_253_ = 0; i_253_ < i_243_; i_253_++) {
				float f = fs[i_238_ + 3 + 4 * i_253_];
				float f_254_ = fs[i_238_ + 1 + 4 * i_253_];
				float f_255_ = fs[4 * i_253_ + 3];
				float f_256_ = fs[4 * i_253_ + 1];
				fs[i_238_ + 3 + 4 * i_253_] = f + f_255_;
				fs[i_238_ + 1 + 4 * i_253_] = f_254_ + f_256_;
				float f_257_ = fs_246_[i_238_ - 4 - 4 * i_253_];
				float f_258_ = fs_246_[i_238_ - 3 - 4 * i_253_];
				fs[4 * i_253_ + 3] = (f - f_255_) * f_257_ - (f_254_ - f_256_) * f_258_;
				fs[4 * i_253_ + 1] = (f_254_ - f_256_) * f_257_ + (f - f_255_) * f_258_;
			}
			int i_259_ = Class159.method2739(i_227_ - 1, -1214445520);
			for (int i_260_ = 0; i_260_ < i_259_ - 3; i_260_++) {
				int i_261_ = i_227_ >> i_260_ + 2;
				int i_262_ = 8 << i_260_;
				for (int i_263_ = 0; i_263_ < 2 << i_260_; i_263_++) {
					int i_264_ = i_227_ - i_261_ * 2 * i_263_;
					int i_265_ = i_227_ - i_261_ * (2 * i_263_ + 1);
					for (int i_266_ = 0; i_266_ < i_227_ >> i_260_ + 4; i_266_++) {
						int i_267_ = 4 * i_266_;
						float f = fs[i_264_ - 1 - i_267_];
						float f_268_ = fs[i_264_ - 3 - i_267_];
						float f_269_ = fs[i_265_ - 1 - i_267_];
						float f_270_ = fs[i_265_ - 3 - i_267_];
						fs[i_264_ - 1 - i_267_] = f + f_269_;
						fs[i_264_ - 3 - i_267_] = f_268_ + f_270_;
						float f_271_ = fs_246_[i_266_ * i_262_];
						float f_272_ = fs_246_[i_266_ * i_262_ + 1];
						fs[i_265_ - 1 - i_267_] = ((f - f_269_) * f_271_ - (f_268_ - f_270_) * f_272_);
						fs[i_265_ - 3 - i_267_] = ((f_268_ - f_270_) * f_271_ + (f - f_269_) * f_272_);
					}
				}
			}
			for (int i_273_ = 1; i_273_ < i_243_ - 1; i_273_++) {
				int i_274_ = is[i_273_];
				if (i_273_ < i_274_) {
					int i_275_ = 8 * i_273_;
					int i_276_ = 8 * i_274_;
					float f = fs[i_275_ + 1];
					fs[i_275_ + 1] = fs[i_276_ + 1];
					fs[i_276_ + 1] = f;
					f = fs[i_275_ + 3];
					fs[i_275_ + 3] = fs[i_276_ + 3];
					fs[i_276_ + 3] = f;
					f = fs[i_275_ + 5];
					fs[i_275_ + 5] = fs[i_276_ + 5];
					fs[i_276_ + 5] = f;
					f = fs[i_275_ + 7];
					fs[i_275_ + 7] = fs[i_276_ + 7];
					fs[i_276_ + 7] = f;
				}
			}
			for (int i_277_ = 0; i_277_ < i_238_; i_277_++)
				fs[i_277_] = fs[2 * i_277_ + 1];
			for (int i_278_ = 0; i_278_ < i_243_; i_278_++) {
				fs[i_227_ - 1 - 2 * i_278_] = fs[4 * i_278_];
				fs[i_227_ - 2 - 2 * i_278_] = fs[4 * i_278_ + 1];
				fs[i_227_ - i_242_ - 1 - 2 * i_278_] = fs[4 * i_278_ + 2];
				fs[i_227_ - i_242_ - 2 - 2 * i_278_] = fs[4 * i_278_ + 3];
			}
			for (int i_279_ = 0; i_279_ < i_243_; i_279_++) {
				float f = fs_248_[2 * i_279_];
				float f_280_ = fs_248_[2 * i_279_ + 1];
				float f_281_ = fs[i_238_ + 2 * i_279_];
				float f_282_ = fs[i_238_ + 2 * i_279_ + 1];
				float f_283_ = fs[i_227_ - 2 - 2 * i_279_];
				float f_284_ = fs[i_227_ - 1 - 2 * i_279_];
				float f_285_ = f_280_ * (f_281_ - f_283_) + f * (f_282_ + f_284_);
				fs[i_238_ + 2 * i_279_] = (f_281_ + f_283_ + f_285_) * 0.5F;
				fs[i_227_ - 2 - 2 * i_279_] = (f_281_ + f_283_ - f_285_) * 0.5F;
				f_285_ = f_280_ * (f_282_ + f_284_) - f * (f_281_ - f_283_);
				fs[i_238_ + 2 * i_279_ + 1] = (f_282_ - f_284_ + f_285_) * 0.5F;
				fs[i_227_ - 1 - 2 * i_279_] = (-f_282_ + f_284_ + f_285_) * 0.5F;
			}
			for (int i_286_ = 0; i_286_ < i_242_; i_286_++) {
				fs[i_286_] = (fs[2 * i_286_ + i_238_] * fs_247_[2 * i_286_] + (fs[2 * i_286_ + 1 + i_238_] * fs_247_[2 * i_286_ + 1]));
				fs[i_238_ - 1 - i_286_] = (fs[2 * i_286_ + i_238_] * fs_247_[2 * i_286_ + 1] - fs[2 * i_286_ + 1 + i_238_] * fs_247_[2 * i_286_]);
			}
			for (int i_287_ = 0; i_287_ < i_242_; i_287_++)
				fs[i_227_ - i_242_ + i_287_] = -fs[i_287_];
			for (int i_288_ = 0; i_288_ < i_242_; i_288_++)
				fs[i_288_] = fs[i_242_ + i_288_];
			for (int i_289_ = 0; i_289_ < i_242_; i_289_++)
				fs[i_242_ + i_289_] = -fs[i_242_ - i_289_ - 1];
			for (int i_290_ = 0; i_290_ < i_242_; i_290_++)
				fs[i_238_ + i_290_] = fs[i_227_ - i_290_ - 1];
			for (int i_291_ = i_231_; i_291_ < i_232_; i_291_++) {
				float f = (float) Math.sin(((double) (i_291_ - i_231_) + 0.5) / (double) i_233_ * 0.5 * 3.141592653589793);
				aFloatArray7612[i_291_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
			for (int i_292_ = i_234_; i_292_ < i_235_; i_292_++) {
				float f = (float) Math.sin((((double) (i_292_ - i_234_) + 0.5) / (double) i_236_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
				aFloatArray7612[i_292_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
		}
		float[] fs = null;
		if (((Class282_Sub18) this).anInt7623 > 0) {
			int i_293_ = ((Class282_Sub18) this).anInt7623 + i_227_ >> 2;
			fs = new float[i_293_];
			if (!((Class282_Sub18) this).aBool7625) {
				for (int i_294_ = 0; i_294_ < ((Class282_Sub18) this).anInt7624; i_294_++) {
					int i_295_ = (((Class282_Sub18) this).anInt7623 >> 1) + i_294_;
					fs[i_294_] += ((Class282_Sub18) this).aFloatArray7622[i_295_];
				}
			}
			if (!bool_239_) {
				for (int i_296_ = i_231_; i_296_ < i_227_ >> 1; i_296_++) {
					int i_297_ = fs.length - (i_227_ >> 1) + i_296_;
					fs[i_297_] += aFloatArray7612[i_296_];
				}
			}
		}
		float[] fs_298_ = ((Class282_Sub18) this).aFloatArray7622;
		((Class282_Sub18) this).aFloatArray7622 = aFloatArray7612;
		aFloatArray7612 = fs_298_;
		((Class282_Sub18) this).anInt7623 = i_227_;
		((Class282_Sub18) this).anInt7624 = i_235_ - (i_227_ >> 1);
		((Class282_Sub18) this).aBool7625 = bool_239_;
		return fs;
	}

	void method12296(int i) {
		if (i > ((Class282_Sub18) this).anInt7620 - 1)
			i = ((Class282_Sub18) this).anInt7620 - 1;
		if (i > ((Class282_Sub18) this).anInt7636)
			((Class282_Sub18) this).anInt7638 = method12273(i);
		else
			((Class282_Sub18) this).anInt7638 = 0;
		if (!method12276())
			((Class282_Sub18) this).aFloatArray7622 = null;
	}

	static void method12297(byte[] is, int i) {
		aByteArray7607 = is;
		anInt7614 = i;
		anInt7613 = 0;
	}

	int method12298() {
		return ((Class282_Sub18) this).anInt7636;
	}

	int method12299() {
		return ((Class282_Sub18) this).anInt7636;
	}

	static float method12300(int i) {
		int i_299_ = i & 0x1fffff;
		int i_300_ = i & ~0x7fffffff;
		int i_301_ = (i & 0x7fe00000) >> 21;
		if (i_300_ != 0)
			i_299_ = -i_299_;
		return (float) ((double) i_299_ * Math.pow(2.0, (double) (i_301_ - 788)));
	}

	boolean method12301() {
		return (((Class282_Sub18) this).anInt7636 < ((Class282_Sub18) this).anInt7620 - 1);
	}

	static void method12302(byte[] is) {
		method12262(is, 0);
		anInt7635 = 1 << method12264(4);
		anInt7637 = 1 << method12264(4);
		aFloatArray7612 = new float[anInt7637];
		for (int i = 0; i < 2; i++) {
			int i_302_ = i != 0 ? anInt7637 : anInt7635;
			int i_303_ = i_302_ >> 1;
			int i_304_ = i_302_ >> 2;
			int i_305_ = i_302_ >> 3;
			float[] fs = new float[i_303_];
			for (int i_306_ = 0; i_306_ < i_304_; i_306_++) {
				fs[2 * i_306_] = (float) Math.cos((double) (4 * i_306_) * 3.141592653589793 / (double) i_302_);
				fs[2 * i_306_ + 1] = -(float) Math.sin((double) (4 * i_306_) * 3.141592653589793 / (double) i_302_);
			}
			float[] fs_307_ = new float[i_303_];
			for (int i_308_ = 0; i_308_ < i_304_; i_308_++) {
				fs_307_[2 * i_308_] = (float) Math.cos((double) (2 * i_308_ + 1) * 3.141592653589793 / (double) (2 * i_302_));
				fs_307_[2 * i_308_ + 1] = (float) Math.sin((double) (2 * i_308_ + 1) * 3.141592653589793 / (double) (2 * i_302_));
			}
			float[] fs_309_ = new float[i_304_];
			for (int i_310_ = 0; i_310_ < i_305_; i_310_++) {
				fs_309_[2 * i_310_] = (float) Math.cos((double) (4 * i_310_ + 2) * 3.141592653589793 / (double) i_302_);
				fs_309_[2 * i_310_ + 1] = -(float) Math.sin((double) (4 * i_310_ + 2) * 3.141592653589793 / (double) i_302_);
			}
			int[] is_311_ = new int[i_305_];
			int i_312_ = Class159.method2739(i_305_ - 1, 1345331376);
			for (int i_313_ = 0; i_313_ < i_305_; i_313_++)
				is_311_[i_313_] = Class3.method285(i_313_, i_312_, 1047790868);
			if (i != 0) {
				aFloatArray7630 = fs;
				aFloatArray7631 = fs_307_;
				aFloatArray7632 = fs_309_;
				anIntArray7634 = is_311_;
			} else {
				aFloatArray7627 = fs;
				aFloatArray7628 = fs_307_;
				aFloatArray7629 = fs_309_;
				anIntArray7633 = is_311_;
			}
		}
		int i = method12264(8) + 1;
		aClass255Array7615 = new Class255[i];
		for (int i_314_ = 0; i_314_ < i; i_314_++)
			aClass255Array7615[i_314_] = new Class255();
		int i_315_ = method12264(6) + 1;
		for (int i_316_ = 0; i_316_ < i_315_; i_316_++)
			method12264(16);
		i_315_ = method12264(6) + 1;
		aClass338Array7610 = new Class338[i_315_];
		for (int i_317_ = 0; i_317_ < i_315_; i_317_++)
			aClass338Array7610[i_317_] = new Class338();
		int i_318_ = method12264(6) + 1;
		aClass265Array7617 = new Class265[i_318_];
		for (int i_319_ = 0; i_319_ < i_318_; i_319_++)
			aClass265Array7617[i_319_] = new Class265();
		int i_320_ = method12264(6) + 1;
		aClass259Array7618 = new Class259[i_320_];
		for (int i_321_ = 0; i_321_ < i_320_; i_321_++)
			aClass259Array7618[i_321_] = new Class259();
		int i_322_ = method12264(6) + 1;
		aBoolArray7619 = new boolean[i_322_];
		anIntArray7621 = new int[i_322_];
		for (int i_323_ = 0; i_323_ < i_322_; i_323_++) {
			aBoolArray7619[i_323_] = method12263() != 0;
			method12264(16);
			method12264(16);
			anIntArray7621[i_323_] = method12264(8);
		}
		aBool7611 = true;
	}

	int method12303() {
		return ((Class282_Sub18) this).anInt7605;
	}
}
