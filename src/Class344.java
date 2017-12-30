/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class344 {
	int anInt4012;
	static final int anInt4013 = 7;
	static final int anInt4014 = 14;
	int anInt4015;
	static final int anInt4016 = 6;
	int[][] anIntArrayArray4017;

	int method6101(int i) {
		if (null != ((Class344) this).anIntArrayArray4017)
			i = (int) ((long) (-1999417097 * ((Class344) this).anInt4012) * (long) i / (long) (((Class344) this).anInt4015 * 271402445));
		return i;
	}

	byte[] method6102(byte[] is, int i) {
		if (null != ((Class344) this).anIntArrayArray4017) {
			int i_0_ = 14 + (int) ((long) (((Class344) this).anInt4012 * -1999417097) * (long) is.length / (long) (((Class344) this).anInt4015 * 271402445));
			int[] is_1_ = new int[i_0_];
			int i_2_ = 0;
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				int i_5_ = is[i_4_];
				int[] is_6_ = ((Class344) this).anIntArrayArray4017[i_3_];
				for (int i_7_ = 0; i_7_ < 14; i_7_++)
					is_1_[i_2_ + i_7_] += i_5_ * is_6_[i_7_];
				i_3_ += -1999417097 * ((Class344) this).anInt4012;
				int i_8_ = i_3_ / (((Class344) this).anInt4015 * 271402445);
				i_2_ += i_8_;
				i_3_ -= i_8_ * (((Class344) this).anInt4015 * 271402445);
			}
			is = new byte[i_0_];
			for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
				int i_10_ = 32768 + is_1_[i_9_] >> 16;
				if (i_10_ < -128)
					is[i_9_] = (byte) -128;
				else if (i_10_ > 127)
					is[i_9_] = (byte) 127;
				else
					is[i_9_] = (byte) i_10_;
			}
		}
		return is;
	}

	int method6103(int i) {
		if (null != ((Class344) this).anIntArrayArray4017)
			i = (int) ((long) (-1999417097 * ((Class344) this).anInt4012) * (long) i / (long) (((Class344) this).anInt4015 * 271402445));
		return i;
	}

	int method6104(int i) {
		if (null != ((Class344) this).anIntArrayArray4017)
			i = 6 + (int) ((long) (((Class344) this).anInt4012 * -1999417097) * (long) i / (long) (((Class344) this).anInt4015 * 271402445));
		return i;
	}

	public short[] method6105(short[] is) {
		if (((Class344) this).anIntArrayArray4017 != null) {
			int i = ((int) ((long) is.length * (long) (-1999417097 * ((Class344) this).anInt4012) / (long) (((Class344) this).anInt4015 * 271402445)) + 14);
			int[] is_11_ = new int[i];
			int i_12_ = 0;
			int i_13_ = 0;
			for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
				int i_15_ = is[i_14_];
				int[] is_16_ = ((Class344) this).anIntArrayArray4017[i_13_];
				for (int i_17_ = 0; i_17_ < 14; i_17_++)
					is_11_[i_17_ + i_12_] += is_16_[i_17_] * i_15_ >> 2;
				i_13_ += ((Class344) this).anInt4012 * -1999417097;
				int i_18_ = i_13_ / (271402445 * ((Class344) this).anInt4015);
				i_12_ += i_18_;
				i_13_ -= i_18_ * (271402445 * ((Class344) this).anInt4015);
			}
			is = new short[i];
			for (int i_19_ = 0; i_19_ < i; i_19_++) {
				int i_20_ = 8192 + is_11_[i_19_] >> 14;
				if (i_20_ < -32768)
					is[i_19_] = (short) -32768;
				else if (i_20_ > 32767)
					is[i_19_] = (short) 32767;
				else
					is[i_19_] = (short) i_20_;
			}
		}
		return is;
	}

	byte[] method6106(byte[] is) {
		if (null != ((Class344) this).anIntArrayArray4017) {
			int i = 14 + (int) ((long) (((Class344) this).anInt4012 * -1999417097) * (long) is.length / (long) (((Class344) this).anInt4015 * 271402445));
			int[] is_21_ = new int[i];
			int i_22_ = 0;
			int i_23_ = 0;
			for (int i_24_ = 0; i_24_ < is.length; i_24_++) {
				int i_25_ = is[i_24_];
				int[] is_26_ = ((Class344) this).anIntArrayArray4017[i_23_];
				for (int i_27_ = 0; i_27_ < 14; i_27_++)
					is_21_[i_22_ + i_27_] += i_25_ * is_26_[i_27_];
				i_23_ += -1999417097 * ((Class344) this).anInt4012;
				int i_28_ = i_23_ / (((Class344) this).anInt4015 * 271402445);
				i_22_ += i_28_;
				i_23_ -= i_28_ * (((Class344) this).anInt4015 * 271402445);
			}
			is = new byte[i];
			for (int i_29_ = 0; i_29_ < i; i_29_++) {
				int i_30_ = 32768 + is_21_[i_29_] >> 16;
				if (i_30_ < -128)
					is[i_29_] = (byte) -128;
				else if (i_30_ > 127)
					is[i_29_] = (byte) 127;
				else
					is[i_29_] = (byte) i_30_;
			}
		}
		return is;
	}

	public short[] method6107(short[] is) {
		if (((Class344) this).anIntArrayArray4017 != null) {
			int i = ((int) ((long) is.length * (long) (-1999417097 * ((Class344) this).anInt4012) / (long) (((Class344) this).anInt4015 * 271402445)) + 14);
			int[] is_31_ = new int[i];
			int i_32_ = 0;
			int i_33_ = 0;
			for (int i_34_ = 0; i_34_ < is.length; i_34_++) {
				int i_35_ = is[i_34_];
				int[] is_36_ = ((Class344) this).anIntArrayArray4017[i_33_];
				for (int i_37_ = 0; i_37_ < 14; i_37_++)
					is_31_[i_37_ + i_32_] += is_36_[i_37_] * i_35_ >> 2;
				i_33_ += ((Class344) this).anInt4012 * -1999417097;
				int i_38_ = i_33_ / (271402445 * ((Class344) this).anInt4015);
				i_32_ += i_38_;
				i_33_ -= i_38_ * (271402445 * ((Class344) this).anInt4015);
			}
			is = new short[i];
			for (int i_39_ = 0; i_39_ < i; i_39_++) {
				int i_40_ = 8192 + is_31_[i_39_] >> 14;
				if (i_40_ < -32768)
					is[i_39_] = (short) -32768;
				else if (i_40_ > 32767)
					is[i_39_] = (short) 32767;
				else
					is[i_39_] = (short) i_40_;
			}
		}
		return is;
	}

	public short[] method6108(short[] is) {
		if (((Class344) this).anIntArrayArray4017 != null) {
			int i = ((int) ((long) is.length * (long) (-1999417097 * ((Class344) this).anInt4012) / (long) (((Class344) this).anInt4015 * 271402445)) + 14);
			int[] is_41_ = new int[i];
			int i_42_ = 0;
			int i_43_ = 0;
			for (int i_44_ = 0; i_44_ < is.length; i_44_++) {
				int i_45_ = is[i_44_];
				int[] is_46_ = ((Class344) this).anIntArrayArray4017[i_43_];
				for (int i_47_ = 0; i_47_ < 14; i_47_++)
					is_41_[i_47_ + i_42_] += is_46_[i_47_] * i_45_ >> 2;
				i_43_ += ((Class344) this).anInt4012 * -1999417097;
				int i_48_ = i_43_ / (271402445 * ((Class344) this).anInt4015);
				i_42_ += i_48_;
				i_43_ -= i_48_ * (271402445 * ((Class344) this).anInt4015);
			}
			is = new short[i];
			for (int i_49_ = 0; i_49_ < i; i_49_++) {
				int i_50_ = 8192 + is_41_[i_49_] >> 14;
				if (i_50_ < -32768)
					is[i_49_] = (short) -32768;
				else if (i_50_ > 32767)
					is[i_49_] = (short) 32767;
				else
					is[i_49_] = (short) i_50_;
			}
		}
		return is;
	}

	int method6109(int i) {
		if (null != ((Class344) this).anIntArrayArray4017)
			i = (int) ((long) (-1999417097 * ((Class344) this).anInt4012) * (long) i / (long) (((Class344) this).anInt4015 * 271402445));
		return i;
	}

	public short[] method6110(short[] is) {
		if (((Class344) this).anIntArrayArray4017 != null) {
			int i = ((int) ((long) is.length * (long) (-1999417097 * ((Class344) this).anInt4012) / (long) (((Class344) this).anInt4015 * 271402445)) + 14);
			int[] is_51_ = new int[i];
			int i_52_ = 0;
			int i_53_ = 0;
			for (int i_54_ = 0; i_54_ < is.length; i_54_++) {
				int i_55_ = is[i_54_];
				int[] is_56_ = ((Class344) this).anIntArrayArray4017[i_53_];
				for (int i_57_ = 0; i_57_ < 14; i_57_++)
					is_51_[i_57_ + i_52_] += is_56_[i_57_] * i_55_ >> 2;
				i_53_ += ((Class344) this).anInt4012 * -1999417097;
				int i_58_ = i_53_ / (271402445 * ((Class344) this).anInt4015);
				i_52_ += i_58_;
				i_53_ -= i_58_ * (271402445 * ((Class344) this).anInt4015);
			}
			is = new short[i];
			for (int i_59_ = 0; i_59_ < i; i_59_++) {
				int i_60_ = 8192 + is_51_[i_59_] >> 14;
				if (i_60_ < -32768)
					is[i_59_] = (short) -32768;
				else if (i_60_ > 32767)
					is[i_59_] = (short) 32767;
				else
					is[i_59_] = (short) i_60_;
			}
		}
		return is;
	}

	public Class344(int i, int i_61_) {
		if (i != i_61_) {
			int i_62_ = Class96_Sub15.method14645(i, i_61_, 1499248528);
			i /= i_62_;
			i_61_ /= i_62_;
			((Class344) this).anInt4015 = -8311035 * i;
			((Class344) this).anInt4012 = -1909428025 * i_61_;
			((Class344) this).anIntArrayArray4017 = new int[i][14];
			for (int i_63_ = 0; i_63_ < i; i_63_++) {
				int[] is = ((Class344) this).anIntArrayArray4017[i_63_];
				double d = (double) i_63_ / (double) i + 6.0;
				int i_64_ = (int) Math.floor(d - 7.0 + 1.0);
				if (i_64_ < 0)
					i_64_ = 0;
				int i_65_ = (int) Math.ceil(7.0 + d);
				if (i_65_ > 14)
					i_65_ = 14;
				double d_66_ = (double) i_61_ / (double) i;
				for (/**/; i_64_ < i_65_; i_64_++) {
					double d_67_ = ((double) i_64_ - d) * 3.141592653589793;
					double d_68_ = d_66_;
					if (d_67_ < -1.0E-4 || d_67_ > 1.0E-4)
						d_68_ *= Math.sin(d_67_) / d_67_;
					d_68_ *= 0.54 + 0.46 * Math.cos(0.2243994752564138 * ((double) i_64_ - d));
					is[i_64_] = (int) Math.floor(d_68_ * 65536.0 + 0.5);
				}
			}
		}
	}

	public short[] method6111(short[] is, int i) {
		if (((Class344) this).anIntArrayArray4017 != null) {
			int i_69_ = ((int) ((long) is.length * (long) (-1999417097 * ((Class344) this).anInt4012) / (long) (((Class344) this).anInt4015 * 271402445)) + 14);
			int[] is_70_ = new int[i_69_];
			int i_71_ = 0;
			int i_72_ = 0;
			for (int i_73_ = 0; i_73_ < is.length; i_73_++) {
				int i_74_ = is[i_73_];
				int[] is_75_ = ((Class344) this).anIntArrayArray4017[i_72_];
				for (int i_76_ = 0; i_76_ < 14; i_76_++)
					is_70_[i_76_ + i_71_] += is_75_[i_76_] * i_74_ >> 2;
				i_72_ += ((Class344) this).anInt4012 * -1999417097;
				int i_77_ = i_72_ / (271402445 * ((Class344) this).anInt4015);
				i_71_ += i_77_;
				i_72_ -= i_77_ * (271402445 * ((Class344) this).anInt4015);
			}
			is = new short[i_69_];
			for (int i_78_ = 0; i_78_ < i_69_; i_78_++) {
				int i_79_ = 8192 + is_70_[i_78_] >> 14;
				if (i_79_ < -32768)
					is[i_78_] = (short) -32768;
				else if (i_79_ > 32767)
					is[i_78_] = (short) 32767;
				else
					is[i_78_] = (short) i_79_;
			}
		}
		return is;
	}

	int method6112(int i, int i_80_) {
		if (null != ((Class344) this).anIntArrayArray4017)
			i = (int) ((long) (-1999417097 * ((Class344) this).anInt4012) * (long) i / (long) (((Class344) this).anInt4015 * 271402445));
		return i;
	}

	int method6113(int i) {
		if (null != ((Class344) this).anIntArrayArray4017)
			i = (int) ((long) (-1999417097 * ((Class344) this).anInt4012) * (long) i / (long) (((Class344) this).anInt4015 * 271402445));
		return i;
	}

	int method6114(int i, int i_81_) {
		if (null != ((Class344) this).anIntArrayArray4017)
			i = 6 + (int) ((long) (((Class344) this).anInt4012 * -1999417097) * (long) i / (long) (((Class344) this).anInt4015 * 271402445));
		return i;
	}

	public static Class225 method6115(int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_) {
		Class224.aClass225_Sub3_2773.anInt2779 = i * -726719813;
		Class224.aClass225_Sub3_2773.anInt2780 = 1767388707 * i_82_;
		Class224.aClass225_Sub3_2773.anInt2781 = -12808295 * i_83_;
		Class224.aClass225_Sub3_2773.anInt2782 = 1709796035 * i_84_;
		((Class225_Sub3) Class224.aClass225_Sub3_2773).anInt7929 = i_85_ * 1507410871;
		return Class224.aClass225_Sub3_2773;
	}

	static final void method6116(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (((CS2Executor) class527).aBool7022) {
			if (i <= -1)
				throw new IllegalStateException();
			class513 = ((CS2Executor) class527).aClass513_6994;
		} else
			class513 = ((CS2Executor) class527).aClass513_7007;
		UnderlayDefinition class513_87_ = class513;
		Class118 class118 = ((UnderlayDefinition) class513_87_).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513_87_).aClass98_5885;
		Class282_Sub17.method12260(class118, class98, class527, 603809090);
	}

	static final void method6117(CS2Executor class527, byte i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		int i_88_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (i_88_ == -1)
			throw new RuntimeException("");
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append((char) i_88_).toString();
	}

	public static String method6118(byte[] is, int i, int i_89_, byte i_90_) {
		char[] cs = new char[i_89_];
		int i_91_ = 0;
		for (int i_92_ = 0; i_92_ < i_89_; i_92_++) {
			int i_93_ = is[i_92_ + i] & 0xff;
			if (i_93_ != 0) {
				if (i_93_ >= 128 && i_93_ < 160) {
					int i_94_ = Class490.aCharArray5766[i_93_ - 128];
					if (i_94_ == 0)
						i_94_ = 63;
					i_93_ = i_94_;
				}
				cs[i_91_++] = (char) i_93_;
			}
		}
		return new String(cs, 0, i_91_);
	}

	public static final void method6119(String string, int i) {
		if (Class467.aClass173Array5575 != null) {
			Class184 class184 = Class468_Sub20.method12807(978713855);
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4618, class184.aClass432_2283, 808752825);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class108.method1846(string, -1045818215));
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class184.method3049(class282_sub23, 1620839155);
		}
	}

	static final void method6120(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class52.method1083(class118, class98, class527, -1250124563);
	}

	static final void method6121(CS2Executor class527, byte i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 2144330291 * Class20.anInt169;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class20.anInt170 * 292682521;
	}

	static final void method6122(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class118.aString1369 = (String) (((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141)]);
	}
}
