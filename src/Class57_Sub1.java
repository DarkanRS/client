/* Class57_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class57_Sub1 extends Class57 {
	static int anInt8987;
	static int anInt8988;
	int anInt8989;
	int anInt8990;
	static int anInt8991;
	static int anInt8992;
	int anInt8993;
	static int anInt8994;
	static int anInt8995 = 4;
	static int anInt8996 = 8;
	int anInt8997;
	static int anInt8998;
	static int anInt8999;
	int anInt9000;
	static int anInt9001;
	static int anInt9002 = 12;
	static int anInt9003;
	static int anInt9004;
	static int anInt9005;
	Class_ra_Sub1 aClass_ra_Sub1_9006;
	static int anInt9007;
	static int anInt9008;
	static int anInt9009;
	int anInt9010;
	static int anInt9011;
	static int anInt9012;
	static int anInt9013;
	static int anInt9014;
	static int anInt9015 = 0;
	static int anInt9016 = 0;
	int[] anIntArray9017;
	static int anInt9018;
	static int anInt9019;
	static int anInt9020;
	static int anInt9021;
	static int anInt9022;

	Class57_Sub1(Class_ra_Sub1 class_ra_sub1, int i, int i_0_) {
		((Class57_Sub1) this).aClass_ra_Sub1_9006 = class_ra_sub1;
		((Class57_Sub1) this).anInt9010 = i;
		((Class57_Sub1) this).anInt8989 = i_0_;
	}

	public void method656(int[] is) {
		is[0] = ((Class57_Sub1) this).anInt8990;
		is[1] = ((Class57_Sub1) this).anInt9000;
		is[2] = ((Class57_Sub1) this).anInt8997;
		is[3] = ((Class57_Sub1) this).anInt8993;
	}

	public abstract void method674(int i, int i_1_, int i_2_, int i_3_, int i_4_);

	public int method623() {
		return ((Class57_Sub1) this).anInt9010;
	}

	public int method625() {
		return ((Class57_Sub1) this).anInt8989;
	}

	public int method626() {
		return (((Class57_Sub1) this).anInt9000 + ((Class57_Sub1) this).anInt8989 + ((Class57_Sub1) this).anInt8993);
	}

	public abstract void method631(int i, int i_5_, int i_6_, int i_7_, int i_8_);

	void method657(float f, float f_9_, float f_10_, float f_11_, float f_12_, float f_13_, int i, int i_14_, int i_15_, int i_16_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_9_, f_10_, f_11_, f_12_, f_13_)) {
			anInt9014 = i_14_;
			if (i != 1) {
				anInt9015 = i_14_ >>> 24;
				anInt9016 = 256 - anInt9015;
				if (i == 0) {
					anInt9009 = (i_14_ & 0xff0000) >> 16;
					anInt9018 = (i_14_ & 0xff00) >> 8;
					anInt9019 = i_14_ & 0xff;
				} else if (i == 2) {
					anInt8992 = i_14_ >>> 24;
					anInt9021 = 256 - anInt8992;
					int i_17_ = (i_14_ & 0xff00ff) * anInt9021 & ~0xff00ff;
					int i_18_ = (i_14_ & 0xff00) * anInt9021 & 0xff0000;
					anInt9022 = (i_17_ | i_18_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_15_ == 0)
					method680(1, 0);
				else if (i_15_ == 1)
					method680(1, 1);
				else if (i_15_ == 2)
					method680(1, 2);
			} else if (i == 0) {
				if (i_15_ == 0)
					method680(0, 0);
				else if (i_15_ == 1)
					method680(0, 1);
				else if (i_15_ == 2)
					method680(0, 2);
			} else if (i == 3) {
				if (i_15_ == 0)
					method680(3, 0);
				else if (i_15_ == 1)
					method680(3, 1);
				else if (i_15_ == 2)
					method680(3, 2);
			} else if (i == 2) {
				if (i_15_ == 0)
					method680(2, 0);
				else if (i_15_ == 1)
					method680(2, 1);
				else if (i_15_ == 2)
					method680(2, 2);
			}
		}
	}

	abstract void method635(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_);

	void method671(float f, float f_26_, float f_27_, float f_28_, float f_29_, float f_30_, int i, Class_ta class_ta, int i_31_, int i_32_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_26_, f_27_, f_28_, f_29_, f_30_)) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			method681(((Class_ta_Sub2) class_ta_sub2).anIntArray8443, ((Class_ta_Sub2) class_ta_sub2).anIntArray8442, anInt8998 - i_31_, -i_32_ - (anInt9001 - anInt8994));
		}
	}

	abstract void method678(boolean bool, boolean bool_33_, boolean bool_34_, int i, int i_35_, float f, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, boolean bool_42_);

	boolean method679(float f, float f_43_, float f_44_, float f_45_, float f_46_, float f_47_) {
		int i = (((Class57_Sub1) this).anInt8990 + ((Class57_Sub1) this).anInt9010 + ((Class57_Sub1) this).anInt8997);
		int i_48_ = (((Class57_Sub1) this).anInt9000 + ((Class57_Sub1) this).anInt8989 + ((Class57_Sub1) this).anInt8993);
		if (i != ((Class57_Sub1) this).anInt9010 || i_48_ != ((Class57_Sub1) this).anInt8989) {
			float f_49_ = (f_44_ - f) / (float) i;
			float f_50_ = (f_45_ - f_43_) / (float) i;
			float f_51_ = (f_46_ - f) / (float) i_48_;
			float f_52_ = (f_47_ - f_43_) / (float) i_48_;
			float f_53_ = f_51_ * (float) ((Class57_Sub1) this).anInt9000;
			float f_54_ = f_52_ * (float) ((Class57_Sub1) this).anInt9000;
			float f_55_ = f_49_ * (float) ((Class57_Sub1) this).anInt8990;
			float f_56_ = f_50_ * (float) ((Class57_Sub1) this).anInt8990;
			float f_57_ = -f_49_ * (float) ((Class57_Sub1) this).anInt8997;
			float f_58_ = -f_50_ * (float) ((Class57_Sub1) this).anInt8997;
			float f_59_ = -f_51_ * (float) ((Class57_Sub1) this).anInt8993;
			float f_60_ = -f_52_ * (float) ((Class57_Sub1) this).anInt8993;
			f += f_55_ + f_53_;
			f_43_ += f_56_ + f_54_;
			f_44_ += f_57_ + f_53_;
			f_45_ += f_58_ + f_54_;
			f_46_ += f_55_ + f_59_;
			f_47_ += f_56_ + f_60_;
		}
		float f_61_ = f_46_ + (f_44_ - f);
		float f_62_ = f_45_ + (f_47_ - f_43_);
		float f_63_;
		float f_64_;
		if (f < f_44_) {
			f_63_ = f;
			f_64_ = f_44_;
		} else {
			f_63_ = f_44_;
			f_64_ = f;
		}
		if (f_46_ < f_63_)
			f_63_ = f_46_;
		if (f_61_ < f_63_)
			f_63_ = f_61_;
		if (f_46_ > f_64_)
			f_64_ = f_46_;
		if (f_61_ > f_64_)
			f_64_ = f_61_;
		float f_65_;
		float f_66_;
		if (f_43_ < f_45_) {
			f_65_ = f_43_;
			f_66_ = f_45_;
		} else {
			f_65_ = f_45_;
			f_66_ = f_43_;
		}
		if (f_47_ < f_65_)
			f_65_ = f_47_;
		if (f_62_ < f_65_)
			f_65_ = f_62_;
		if (f_47_ > f_66_)
			f_66_ = f_47_;
		if (f_62_ > f_66_)
			f_66_ = f_62_;
		if (f_63_ < (float) (((Class_ra_Sub1) (((Class57_Sub1) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679))
			f_63_ = (float) (((Class_ra_Sub1) (((Class57_Sub1) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679);
		if (f_64_ > (float) (((Class_ra_Sub1) (((Class57_Sub1) this).aClass_ra_Sub1_9006)).anInt7991 * -1416794725))
			f_64_ = (float) (((Class_ra_Sub1) (((Class57_Sub1) this).aClass_ra_Sub1_9006)).anInt7991 * -1416794725);
		if (f_65_ < (float) (((Class_ra_Sub1) (((Class57_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805))
			f_65_ = (float) (((Class_ra_Sub1) (((Class57_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
		if (f_66_ > (float) (((Class_ra_Sub1) (((Class57_Sub1) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
			f_66_ = (float) (((Class_ra_Sub1) (((Class57_Sub1) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679);
		f_64_ = f_63_ - f_64_;
		if (f_64_ >= 0.0F)
			return false;
		f_66_ = f_65_ - f_66_;
		if (f_66_ >= 0.0F)
			return false;
		anInt9020 = (((Class_ra_Sub1) ((Class57_Sub1) this).aClass_ra_Sub1_9006).anInt7971) * 692106883;
		anInt9003 = (int) ((float) ((int) f_65_ * anInt9020) + f_63_);
		float f_67_ = (f_44_ - f) * (f_47_ - f_43_) - (f_45_ - f_43_) * (f_46_ - f);
		float f_68_ = (f_46_ - f) * (f_45_ - f_43_) - (f_47_ - f_43_) * (f_44_ - f);
		anInt9004 = (int) ((f_47_ - f_43_) * 4096.0F * (float) ((Class57_Sub1) this).anInt9010 / f_67_);
		anInt8991 = (int) ((f_45_ - f_43_) * 4096.0F * (float) ((Class57_Sub1) this).anInt8989 / f_68_);
		anInt9005 = (int) ((f_46_ - f) * 4096.0F * (float) ((Class57_Sub1) this).anInt9010 / f_68_);
		anInt9007 = (int) ((f_44_ - f) * 4096.0F * (float) ((Class57_Sub1) this).anInt8989 / f_67_);
		anInt9008 = (int) (f_63_ * 16.0F + 8.0F - (f + f_44_ + f_46_ + f_61_) / 4.0F * 16.0F);
		anInt8987 = (int) (f_65_ * 16.0F + 8.0F - (f_43_ + f_45_ + f_47_ + f_62_) / 4.0F * 16.0F);
		anInt8988 = ((((Class57_Sub1) this).anInt9010 >> 1 << 12) + (anInt8987 * anInt9005 >> 4));
		anInt9011 = ((((Class57_Sub1) this).anInt8989 >> 1 << 12) + (anInt8987 * anInt9007 >> 4));
		anInt9012 = anInt9008 * anInt9004 >> 4;
		anInt9013 = anInt9008 * anInt8991 >> 4;
		anInt8998 = (int) f_63_;
		anInt8999 = (int) f_64_;
		anInt8994 = (int) f_65_;
		anInt9001 = (int) f_66_;
		return true;
	}

	void method642(float f, float f_69_, float f_70_, float f_71_, float f_72_, float f_73_, int i, int i_74_, int i_75_, int i_76_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_69_, f_70_, f_71_, f_72_, f_73_)) {
			anInt9014 = i_74_;
			if (i != 1) {
				anInt9015 = i_74_ >>> 24;
				anInt9016 = 256 - anInt9015;
				if (i == 0) {
					anInt9009 = (i_74_ & 0xff0000) >> 16;
					anInt9018 = (i_74_ & 0xff00) >> 8;
					anInt9019 = i_74_ & 0xff;
				} else if (i == 2) {
					anInt8992 = i_74_ >>> 24;
					anInt9021 = 256 - anInt8992;
					int i_77_ = (i_74_ & 0xff00ff) * anInt9021 & ~0xff00ff;
					int i_78_ = (i_74_ & 0xff00) * anInt9021 & 0xff0000;
					anInt9022 = (i_77_ | i_78_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_75_ == 0)
					method680(1, 0);
				else if (i_75_ == 1)
					method680(1, 1);
				else if (i_75_ == 2)
					method680(1, 2);
			} else if (i == 0) {
				if (i_75_ == 0)
					method680(0, 0);
				else if (i_75_ == 1)
					method680(0, 1);
				else if (i_75_ == 2)
					method680(0, 2);
			} else if (i == 3) {
				if (i_75_ == 0)
					method680(3, 0);
				else if (i_75_ == 1)
					method680(3, 1);
				else if (i_75_ == 2)
					method680(3, 2);
			} else if (i == 2) {
				if (i_75_ == 0)
					method680(2, 0);
				else if (i_75_ == 1)
					method680(2, 1);
				else if (i_75_ == 2)
					method680(2, 2);
			}
		}
	}

	abstract void method680(int i, int i_79_);

	public int method668() {
		return ((Class57_Sub1) this).anInt8989;
	}

	abstract void method681(int[] is, int[] is_80_, int i, int i_81_);

	static {
		anInt9009 = 0;
		anInt9018 = 0;
		anInt9019 = 0;
		anInt8992 = 0;
		anInt9021 = 0;
		anInt9022 = 0;
	}

	public abstract void method643(int i, int i_82_, int i_83_, int i_84_, int i_85_);

	public abstract void method649(int i, int i_86_, int i_87_, int i_88_, int i_89_);

	void method666(float f, float f_90_, float f_91_, float f_92_, float f_93_, float f_94_, int i, int i_95_, int i_96_, int i_97_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_90_, f_91_, f_92_, f_93_, f_94_)) {
			anInt9014 = i_95_;
			if (i != 1) {
				anInt9015 = i_95_ >>> 24;
				anInt9016 = 256 - anInt9015;
				if (i == 0) {
					anInt9009 = (i_95_ & 0xff0000) >> 16;
					anInt9018 = (i_95_ & 0xff00) >> 8;
					anInt9019 = i_95_ & 0xff;
				} else if (i == 2) {
					anInt8992 = i_95_ >>> 24;
					anInt9021 = 256 - anInt8992;
					int i_98_ = (i_95_ & 0xff00ff) * anInt9021 & ~0xff00ff;
					int i_99_ = (i_95_ & 0xff00) * anInt9021 & 0xff0000;
					anInt9022 = (i_98_ | i_99_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_96_ == 0)
					method680(1, 0);
				else if (i_96_ == 1)
					method680(1, 1);
				else if (i_96_ == 2)
					method680(1, 2);
			} else if (i == 0) {
				if (i_96_ == 0)
					method680(0, 0);
				else if (i_96_ == 1)
					method680(0, 1);
				else if (i_96_ == 2)
					method680(0, 2);
			} else if (i == 3) {
				if (i_96_ == 0)
					method680(3, 0);
				else if (i_96_ == 1)
					method680(3, 1);
				else if (i_96_ == 2)
					method680(3, 2);
			} else if (i == 2) {
				if (i_96_ == 0)
					method680(2, 0);
				else if (i_96_ == 1)
					method680(2, 1);
				else if (i_96_ == 2)
					method680(2, 2);
			}
		}
	}

	public abstract void method648(int i, int i_100_, int i_101_, int i_102_, int i_103_);

	public abstract void method650(int i, int i_104_, Class_ta class_ta, int i_105_, int i_106_);

	abstract void method651(int i, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_);

	void method670(float f, float f_114_, float f_115_, float f_116_, float f_117_, float f_118_, int i, Class_ta class_ta, int i_119_, int i_120_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_114_, f_115_, f_116_, f_117_, f_118_)) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			method681(((Class_ta_Sub2) class_ta_sub2).anIntArray8443, ((Class_ta_Sub2) class_ta_sub2).anIntArray8442, anInt8998 - i_119_, -i_120_ - (anInt9001 - anInt8994));
		}
	}

	abstract void method682(boolean bool, boolean bool_121_, boolean bool_122_, int i, int i_123_, float f, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, boolean bool_130_);

	public void method621(int i, int i_131_, int i_132_, int i_133_) {
		((Class57_Sub1) this).anInt8990 = i;
		((Class57_Sub1) this).anInt9000 = i_131_;
		((Class57_Sub1) this).anInt8997 = i_132_;
		((Class57_Sub1) this).anInt8993 = i_133_;
	}

	public void method677(int[] is) {
		is[0] = ((Class57_Sub1) this).anInt8990;
		is[1] = ((Class57_Sub1) this).anInt9000;
		is[2] = ((Class57_Sub1) this).anInt8997;
		is[3] = ((Class57_Sub1) this).anInt8993;
	}

	abstract void method683(int[] is, int[] is_134_, int i, int i_135_);

	abstract void method684(int[] is, int[] is_136_, int i, int i_137_);

	abstract void method685(int[] is, int[] is_138_, int i, int i_139_);

	public void method655(int i, int i_140_, int i_141_, int i_142_) {
		((Class57_Sub1) this).anInt8990 = i;
		((Class57_Sub1) this).anInt9000 = i_140_;
		((Class57_Sub1) this).anInt8997 = i_141_;
		((Class57_Sub1) this).anInt8993 = i_142_;
	}

	public void method640(int[] is) {
		is[0] = ((Class57_Sub1) this).anInt8990;
		is[1] = ((Class57_Sub1) this).anInt9000;
		is[2] = ((Class57_Sub1) this).anInt8997;
		is[3] = ((Class57_Sub1) this).anInt8993;
	}

	public void method622(int[] is) {
		is[0] = ((Class57_Sub1) this).anInt8990;
		is[1] = ((Class57_Sub1) this).anInt9000;
		is[2] = ((Class57_Sub1) this).anInt8997;
		is[3] = ((Class57_Sub1) this).anInt8993;
	}

	abstract void method652(int i, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_);

	public int method630() {
		return ((Class57_Sub1) this).anInt9010;
	}

	public int method658() {
		return ((Class57_Sub1) this).anInt9010;
	}

	public int method272() {
		return (((Class57_Sub1) this).anInt8990 + ((Class57_Sub1) this).anInt9010 + ((Class57_Sub1) this).anInt8997);
	}

	public int method653() {
		return (((Class57_Sub1) this).anInt9000 + ((Class57_Sub1) this).anInt8989 + ((Class57_Sub1) this).anInt8993);
	}

	public void method660(int i, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (((Class57_Sub1) this).anIntArray9017 == null)
			((Class57_Sub1) this).anIntArray9017 = new int[4];
		((Class57_Sub1) this).aClass_ra_Sub1_9006.qa(((Class57_Sub1) this).anIntArray9017);
		((Class57_Sub1) this).aClass_ra_Sub1_9006.o((((Class_ra_Sub1) ((Class57_Sub1) this).aClass_ra_Sub1_9006).anInt7974) * -912871679, (((Class_ra_Sub1) ((Class57_Sub1) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805, i + i_151_, i_150_ + i_152_);
		int i_156_ = method271();
		int i_157_ = method626();
		int i_158_ = (i_151_ + i_156_ - 1) / i_156_;
		int i_159_ = (i_152_ + i_157_ - 1) / i_157_;
		for (int i_160_ = 0; i_160_ < i_159_; i_160_++) {
			int i_161_ = i_160_ * i_157_;
			for (int i_162_ = 0; i_162_ < i_158_; i_162_++)
				method631(i + i_162_ * i_156_, i_150_ + i_161_, i_153_, i_154_, i_155_);
		}
		((Class57_Sub1) this).aClass_ra_Sub1_9006.r(((Class57_Sub1) this).anIntArray9017[0], ((Class57_Sub1) this).anIntArray9017[1], ((Class57_Sub1) this).anIntArray9017[2], ((Class57_Sub1) this).anIntArray9017[3]);
	}

	public void method661(int i, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (((Class57_Sub1) this).anIntArray9017 == null)
			((Class57_Sub1) this).anIntArray9017 = new int[4];
		((Class57_Sub1) this).aClass_ra_Sub1_9006.qa(((Class57_Sub1) this).anIntArray9017);
		((Class57_Sub1) this).aClass_ra_Sub1_9006.o((((Class_ra_Sub1) ((Class57_Sub1) this).aClass_ra_Sub1_9006).anInt7974) * -912871679, (((Class_ra_Sub1) ((Class57_Sub1) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805, i + i_164_, i_163_ + i_165_);
		int i_169_ = method271();
		int i_170_ = method626();
		int i_171_ = (i_164_ + i_169_ - 1) / i_169_;
		int i_172_ = (i_165_ + i_170_ - 1) / i_170_;
		for (int i_173_ = 0; i_173_ < i_172_; i_173_++) {
			int i_174_ = i_173_ * i_170_;
			for (int i_175_ = 0; i_175_ < i_171_; i_175_++)
				method631(i + i_175_ * i_169_, i_163_ + i_174_, i_166_, i_167_, i_168_);
		}
		((Class57_Sub1) this).aClass_ra_Sub1_9006.r(((Class57_Sub1) this).anIntArray9017[0], ((Class57_Sub1) this).anIntArray9017[1], ((Class57_Sub1) this).anIntArray9017[2], ((Class57_Sub1) this).anIntArray9017[3]);
	}

	void method676(float f, float f_176_, float f_177_, float f_178_, float f_179_, float f_180_, int i, int i_181_, int i_182_, int i_183_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_176_, f_177_, f_178_, f_179_, f_180_)) {
			anInt9014 = i_181_;
			if (i != 1) {
				anInt9015 = i_181_ >>> 24;
				anInt9016 = 256 - anInt9015;
				if (i == 0) {
					anInt9009 = (i_181_ & 0xff0000) >> 16;
					anInt9018 = (i_181_ & 0xff00) >> 8;
					anInt9019 = i_181_ & 0xff;
				} else if (i == 2) {
					anInt8992 = i_181_ >>> 24;
					anInt9021 = 256 - anInt8992;
					int i_184_ = (i_181_ & 0xff00ff) * anInt9021 & ~0xff00ff;
					int i_185_ = (i_181_ & 0xff00) * anInt9021 & 0xff0000;
					anInt9022 = (i_184_ | i_185_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_182_ == 0)
					method680(1, 0);
				else if (i_182_ == 1)
					method680(1, 1);
				else if (i_182_ == 2)
					method680(1, 2);
			} else if (i == 0) {
				if (i_182_ == 0)
					method680(0, 0);
				else if (i_182_ == 1)
					method680(0, 1);
				else if (i_182_ == 2)
					method680(0, 2);
			} else if (i == 3) {
				if (i_182_ == 0)
					method680(3, 0);
				else if (i_182_ == 1)
					method680(3, 1);
				else if (i_182_ == 2)
					method680(3, 2);
			} else if (i == 2) {
				if (i_182_ == 0)
					method680(2, 0);
				else if (i_182_ == 1)
					method680(2, 1);
				else if (i_182_ == 2)
					method680(2, 2);
			}
		}
	}

	void method629(float f, float f_186_, float f_187_, float f_188_, float f_189_, float f_190_, int i, int i_191_, int i_192_, int i_193_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_186_, f_187_, f_188_, f_189_, f_190_)) {
			anInt9014 = i_191_;
			if (i != 1) {
				anInt9015 = i_191_ >>> 24;
				anInt9016 = 256 - anInt9015;
				if (i == 0) {
					anInt9009 = (i_191_ & 0xff0000) >> 16;
					anInt9018 = (i_191_ & 0xff00) >> 8;
					anInt9019 = i_191_ & 0xff;
				} else if (i == 2) {
					anInt8992 = i_191_ >>> 24;
					anInt9021 = 256 - anInt8992;
					int i_194_ = (i_191_ & 0xff00ff) * anInt9021 & ~0xff00ff;
					int i_195_ = (i_191_ & 0xff00) * anInt9021 & 0xff0000;
					anInt9022 = (i_194_ | i_195_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_192_ == 0)
					method680(1, 0);
				else if (i_192_ == 1)
					method680(1, 1);
				else if (i_192_ == 2)
					method680(1, 2);
			} else if (i == 0) {
				if (i_192_ == 0)
					method680(0, 0);
				else if (i_192_ == 1)
					method680(0, 1);
				else if (i_192_ == 2)
					method680(0, 2);
			} else if (i == 3) {
				if (i_192_ == 0)
					method680(3, 0);
				else if (i_192_ == 1)
					method680(3, 1);
				else if (i_192_ == 2)
					method680(3, 2);
			} else if (i == 2) {
				if (i_192_ == 0)
					method680(2, 0);
				else if (i_192_ == 1)
					method680(2, 1);
				else if (i_192_ == 2)
					method680(2, 2);
			}
		}
	}

	void method663(float f, float f_196_, float f_197_, float f_198_, float f_199_, float f_200_, int i, int i_201_, int i_202_, int i_203_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_196_, f_197_, f_198_, f_199_, f_200_)) {
			anInt9014 = i_201_;
			if (i != 1) {
				anInt9015 = i_201_ >>> 24;
				anInt9016 = 256 - anInt9015;
				if (i == 0) {
					anInt9009 = (i_201_ & 0xff0000) >> 16;
					anInt9018 = (i_201_ & 0xff00) >> 8;
					anInt9019 = i_201_ & 0xff;
				} else if (i == 2) {
					anInt8992 = i_201_ >>> 24;
					anInt9021 = 256 - anInt8992;
					int i_204_ = (i_201_ & 0xff00ff) * anInt9021 & ~0xff00ff;
					int i_205_ = (i_201_ & 0xff00) * anInt9021 & 0xff0000;
					anInt9022 = (i_204_ | i_205_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_202_ == 0)
					method680(1, 0);
				else if (i_202_ == 1)
					method680(1, 1);
				else if (i_202_ == 2)
					method680(1, 2);
			} else if (i == 0) {
				if (i_202_ == 0)
					method680(0, 0);
				else if (i_202_ == 1)
					method680(0, 1);
				else if (i_202_ == 2)
					method680(0, 2);
			} else if (i == 3) {
				if (i_202_ == 0)
					method680(3, 0);
				else if (i_202_ == 1)
					method680(3, 1);
				else if (i_202_ == 2)
					method680(3, 2);
			} else if (i == 2) {
				if (i_202_ == 0)
					method680(2, 0);
				else if (i_202_ == 1)
					method680(2, 1);
				else if (i_202_ == 2)
					method680(2, 2);
			}
		}
	}

	abstract void method686(int i, int i_206_);

	abstract void method687(int i, int i_207_);

	void method644(float f, float f_208_, float f_209_, float f_210_, float f_211_, float f_212_, int i, Class_ta class_ta, int i_213_, int i_214_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_208_, f_209_, f_210_, f_211_, f_212_)) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			method681(((Class_ta_Sub2) class_ta_sub2).anIntArray8443, ((Class_ta_Sub2) class_ta_sub2).anIntArray8442, anInt8998 - i_213_, -i_214_ - (anInt9001 - anInt8994));
		}
	}

	void method664(float f, float f_215_, float f_216_, float f_217_, float f_218_, float f_219_, int i, int i_220_, int i_221_, int i_222_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_215_, f_216_, f_217_, f_218_, f_219_)) {
			anInt9014 = i_220_;
			if (i != 1) {
				anInt9015 = i_220_ >>> 24;
				anInt9016 = 256 - anInt9015;
				if (i == 0) {
					anInt9009 = (i_220_ & 0xff0000) >> 16;
					anInt9018 = (i_220_ & 0xff00) >> 8;
					anInt9019 = i_220_ & 0xff;
				} else if (i == 2) {
					anInt8992 = i_220_ >>> 24;
					anInt9021 = 256 - anInt8992;
					int i_223_ = (i_220_ & 0xff00ff) * anInt9021 & ~0xff00ff;
					int i_224_ = (i_220_ & 0xff00) * anInt9021 & 0xff0000;
					anInt9022 = (i_223_ | i_224_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_221_ == 0)
					method680(1, 0);
				else if (i_221_ == 1)
					method680(1, 1);
				else if (i_221_ == 2)
					method680(1, 2);
			} else if (i == 0) {
				if (i_221_ == 0)
					method680(0, 0);
				else if (i_221_ == 1)
					method680(0, 1);
				else if (i_221_ == 2)
					method680(0, 2);
			} else if (i == 3) {
				if (i_221_ == 0)
					method680(3, 0);
				else if (i_221_ == 1)
					method680(3, 1);
				else if (i_221_ == 2)
					method680(3, 2);
			} else if (i == 2) {
				if (i_221_ == 0)
					method680(2, 0);
				else if (i_221_ == 1)
					method680(2, 1);
				else if (i_221_ == 2)
					method680(2, 2);
			}
		}
	}

	public int method667() {
		return ((Class57_Sub1) this).anInt8989;
	}

	public abstract void method654(int i, int i_225_, Class_ta class_ta, int i_226_, int i_227_);

	public int method669() {
		return ((Class57_Sub1) this).anInt8989;
	}

	public void method662(int i, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (((Class57_Sub1) this).anIntArray9017 == null)
			((Class57_Sub1) this).anIntArray9017 = new int[4];
		((Class57_Sub1) this).aClass_ra_Sub1_9006.qa(((Class57_Sub1) this).anIntArray9017);
		((Class57_Sub1) this).aClass_ra_Sub1_9006.o((((Class_ra_Sub1) ((Class57_Sub1) this).aClass_ra_Sub1_9006).anInt7974) * -912871679, (((Class_ra_Sub1) ((Class57_Sub1) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805, i + i_229_, i_228_ + i_230_);
		int i_234_ = method271();
		int i_235_ = method626();
		int i_236_ = (i_229_ + i_234_ - 1) / i_234_;
		int i_237_ = (i_230_ + i_235_ - 1) / i_235_;
		for (int i_238_ = 0; i_238_ < i_237_; i_238_++) {
			int i_239_ = i_238_ * i_235_;
			for (int i_240_ = 0; i_240_ < i_236_; i_240_++)
				method631(i + i_240_ * i_234_, i_228_ + i_239_, i_231_, i_232_, i_233_);
		}
		((Class57_Sub1) this).aClass_ra_Sub1_9006.r(((Class57_Sub1) this).anIntArray9017[0], ((Class57_Sub1) this).anIntArray9017[1], ((Class57_Sub1) this).anIntArray9017[2], ((Class57_Sub1) this).anIntArray9017[3]);
	}

	public int method271() {
		return (((Class57_Sub1) this).anInt8990 + ((Class57_Sub1) this).anInt9010 + ((Class57_Sub1) this).anInt8997);
	}

	void method672(float f, float f_241_, float f_242_, float f_243_, float f_244_, float f_245_, int i, Class_ta class_ta, int i_246_, int i_247_) {
		if (((Class57_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (method679(f, f_241_, f_242_, f_243_, f_244_, f_245_)) {
			Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
			method681(((Class_ta_Sub2) class_ta_sub2).anIntArray8443, ((Class_ta_Sub2) class_ta_sub2).anIntArray8442, anInt8998 - i_246_, -i_247_ - (anInt9001 - anInt8994));
		}
	}
}
