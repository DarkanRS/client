/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class334 {
	int anInt3883;
	static int[] anIntArray3884 = new int[4];
	static final int anInt3885 = 1;
	static final int anInt3886 = 2;
	int anInt3887;
	int anInt3888;
	int anInt3889;
	int anInt3890;
	int anInt3891;
	static final int anInt3892 = 16;
	int anInt3893;
	int anInt3894;
	static NativeSprite aClass160_3895;
	int anInt3896;
	int anInt3897;
	static final int anInt3898 = 24;
	int anInt3899;
	boolean aBool3900;
	int anInt3901;
	int anInt3902;
	int anInt3903;
	static final int anInt3904 = 24;
	static MeshRasterizer aClass528_3905;
	static final int anInt3906 = 192;
	static final int anInt3907 = 128;
	static final int anInt3908 = 13;
	static final int anInt3909 = 0;
	NativeSprite aClass160_3910;
	int anInt3911;
	static NativeSprite aClass160_3912;
	static final int anInt3913 = 512;

	boolean method5937(GraphicalRenderer class505, Class334 class334_0_) {
		return (((Class334) this).aClass160_3910 != null || method5942(class505, class334_0_));
	}

	boolean method5938(int i, int i_1_, int i_2_, int i_3_) {
		int i_4_;
		int i_5_;
		int i_6_;
		if (!((Class334) this).aBool3900) {
			i_4_ = ((Class334) this).anInt3889 - i;
			i_5_ = ((Class334) this).anInt3890 - i_1_;
			i_6_ = ((Class334) this).anInt3891 - i_2_;
			((Class334) this).anInt3897 = (int) Math.sqrt((double) (i_4_ * i_4_ + i_5_ * i_5_ + i_6_ * i_6_));
			if (((Class334) this).anInt3897 == 0)
				((Class334) this).anInt3897 = 1;
			i_4_ = (i_4_ << 8) / ((Class334) this).anInt3897;
			i_5_ = (i_5_ << 8) / ((Class334) this).anInt3897;
			i_6_ = (i_6_ << 8) / ((Class334) this).anInt3897;
		} else {
			((Class334) this).anInt3897 = 1073741823;
			i_4_ = ((Class334) this).anInt3889;
			i_5_ = ((Class334) this).anInt3890;
			i_6_ = ((Class334) this).anInt3891;
		}
		int i_7_ = (int) (Math.sqrt((double) (i_4_ * i_4_ + i_5_ * i_5_ + i_6_ * i_6_)) * 256.0);
		if (i_7_ > 128) {
			i_4_ = (i_4_ << 16) / i_7_;
			i_5_ = (i_5_ << 16) / i_7_;
			i_6_ = (i_6_ << 16) / i_7_;
			((Class334) this).anInt3899 = (((Class334) this).anInt3888 * i_3_ / (((Class334) this).aBool3900 ? 1024 : ((Class334) this).anInt3897));
		} else
			((Class334) this).anInt3899 = 0;
		if (((Class334) this).anInt3899 < 8) {
			((Class334) this).aClass160_3910 = null;
			return false;
		}
		int i_8_ = Class323.nextPowerOfTwo(((Class334) this).anInt3899, -191000314);
		if (i_8_ > i_3_)
			i_8_ = Class51.method1072(i_3_, 1488609644);
		if (i_8_ > 512)
			i_8_ = 512;
		if (i_8_ != ((Class334) this).anInt3902)
			((Class334) this).anInt3902 = i_8_;
		((Class334) this).anInt3911 = (int) (Math.asin((double) ((float) i_5_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		((Class334) this).anInt3896 = (int) (Math.atan2((double) i_4_, (double) -i_6_) * 2607.5945876176133) & 0x3fff;
		((Class334) this).aClass160_3910 = null;
		return true;
	}

	void method5939(GraphicalRenderer class505, Class334 class334_9_) {
		RSMesh class157 = RSMesh.method2689(Class282_Sub50_Sub11_Sub1.aClass317_10379, ((Class334) this).anInt3893, 0);
		if (class157 != null) {
			class505.qa(anIntArray3884);
			class505.r(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902);
			class505.ba(2, 0);
			class505.B(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 0, 0);
			int i = 0;
			int i_10_ = 0;
			int i_11_ = 256;
			if (class334_9_ != null) {
				if (((Class334) class334_9_).aBool3900) {
					i = -((Class334) class334_9_).anInt3889;
					i_10_ = -((Class334) class334_9_).anInt3890;
					i_11_ = -((Class334) class334_9_).anInt3891;
				} else {
					i = (((Class334) this).anInt3889 - ((Class334) class334_9_).anInt3889);
					i_10_ = (((Class334) this).anInt3890 - ((Class334) class334_9_).anInt3890);
					i_11_ = (((Class334) this).anInt3891 - ((Class334) class334_9_).anInt3891);
				}
			}
			if (((Class334) this).anInt3911 != 0) {
				int i_12_ = -((Class334) this).anInt3911 & 0x3fff;
				int i_13_ = Class382.anIntArray4657[i_12_];
				int i_14_ = Class382.anIntArray4661[i_12_];
				int i_15_ = i_10_ * i_14_ - i_11_ * i_13_ >> 14;
				i_11_ = i_10_ * i_13_ + i_11_ * i_14_ >> 14;
				i_10_ = i_15_;
			}
			if (((Class334) this).anInt3896 != 0) {
				int i_16_ = -((Class334) this).anInt3896 & 0x3fff;
				int i_17_ = Class382.anIntArray4657[i_16_];
				int i_18_ = Class382.anIntArray4661[i_16_];
				int i_19_ = i_11_ * i_17_ + i * i_18_ >> 14;
				i_11_ = i_11_ * i_18_ - i * i_17_ >> 14;
				i = i_19_;
			}
			class505.IA(1.0F);
			class505.m(((Class334) this).anInt3894, 1.0F, 1.0F, (float) i, (float) i_10_, (float) i_11_);
			class157.method2671(((Class334) this).anInt3901 & 0x3fff, ((Class334) this).anInt3883 & 0x3fff, ((Class334) this).anInt3903 & 0x3fff);
			MeshRasterizer class528 = class505.createMeshRasterizer(class157, 2048, 0, 64, 768);
			int i_20_ = class528.ya() - class528.RA();
			int i_21_ = class528.o() - class528.YA();
			int i_22_ = i_20_ > i_21_ ? i_20_ : i_21_;
			int i_23_ = 1024 * ((Class334) this).anInt3902 / i_22_;
			Class384 class384 = class505.method8453();
			Class384 class384_24_ = class505.method8449();
			class384_24_.method6532((float) (((Class334) this).anInt3902 / 2), (float) (((Class334) this).anInt3902 / 2), (float) i_23_, (float) i_23_, 50.0F, 50000.0F, (float) class505.method8523((byte) 122).method2714(), (float) class505.method8523((byte) 112).method2716(), 1024.0F);
			class505.method8424(class384_24_);
			Class294 class294 = new Class294();
			class505.method8457(class294);
			Class294 class294_25_ = class505.method8450();
			class294_25_.method5223(0.0F, 0.0F, (float) (50 - class528.AA()));
			class528.method11282(class294_25_, null, 1);
			((Class334) this).aClass160_3910 = class505.method8668(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, true);
			((Class334) this).aClass160_3910.method2751(0, 0, 3);
			class505.method8424(class384);
			class505.r(anIntArray3884[0], anIntArray3884[1], anIntArray3884[2], anIntArray3884[3]);
		}
	}

	static void method5940() {
		aClass528_3905 = null;
		aClass160_3912 = null;
	}

	boolean method5941(GraphicalRenderer class505, Class334 class334_26_) {
		return (((Class334) this).aClass160_3910 != null || method5942(class505, class334_26_));
	}

	boolean method5942(GraphicalRenderer class505, Class334 class334_27_) {
		if (((Class334) this).aClass160_3910 == null) {
			if (((Class334) this).anInt3887 == 0) {
				if (Class247.anInterface22_3046.method139(((Class334) this).anInt3893, -725088114)) {
					int[] is = (Class247.anInterface22_3046.method141(((Class334) this).anInt3893, 0.7F, ((Class334) this).anInt3902, ((Class334) this).anInt3902, false, 1606527906));
					((Class334) this).aClass160_3910 = class505.method8549(is, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, ((Class334) this).anInt3902, -1804968029);
				}
			} else if (((Class334) this).anInt3887 == 2)
				method5939(class505, class334_27_);
			else if (((Class334) this).anInt3887 == 1)
				method5944(class505, class334_27_);
		}
		return ((Class334) this).aClass160_3910 != null;
	}

	static void method5943(GraphicalRenderer class505) {
		if (aClass528_3905 == null) {
			RSMesh class157 = new RSMesh(580, 1104, 1);
			class157.method2664((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class157.method2662(0, 128, 0);
			class157.method2662(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_28_ = i * 8192 / 24;
				int i_29_ = Class382.anIntArray4657[i_28_];
				int i_30_ = Class382.anIntArray4661[i_28_];
				for (int i_31_ = 1; i_31_ < 24; i_31_++) {
					int i_32_ = i_31_ * 8192 / 24;
					int i_33_ = Class382.anIntArray4661[i_32_] >> 7;
					int i_34_ = Class382.anIntArray4657[i_32_] * i_29_ >> 21;
					int i_35_ = Class382.anIntArray4657[i_32_] * i_30_ >> 21;
					class157.method2662(i_35_, i_33_, -i_34_);
				}
				if (i > 0) {
					int i_36_ = i * 23 + 2;
					int i_37_ = i_36_ - 23;
					class157.method2663(0, i_37_, i_36_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_38_ = 1; i_38_ < 23; i_38_++) {
						int i_39_ = i_37_ + 1;
						int i_40_ = i_36_ + 1;
						class157.method2663(i_37_, i_39_, i_36_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class157.method2663(i_39_, i_40_, i_36_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_37_ = i_39_;
						i_36_ = i_40_;
					}
					class157.method2663(i_36_, i_37_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class157.anInt1999 = class157.anInt1974;
			class157.anIntArray1991 = null;
			class157.anIntArray2002 = null;
			class157.aByteArray1977 = null;
			aClass528_3905 = class505.createMeshRasterizer(class157, 51200, 33, 64, 768);
		}
	}

	void method5944(GraphicalRenderer class505, Class334 class334_41_) {
		method5943(class505);
		method5946(class505);
		class505.qa(anIntArray3884);
		class505.r(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902);
		class505.ba(2, 0);
		class505.B(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, ~0xffffff | ((Class334) this).anInt3894, 0);
		int i = 0;
		int i_42_ = 0;
		int i_43_ = 256;
		if (class334_41_ != null) {
			if (((Class334) class334_41_).aBool3900) {
				i = -((Class334) class334_41_).anInt3889;
				i_42_ = -((Class334) class334_41_).anInt3890;
				i_43_ = -((Class334) class334_41_).anInt3891;
			} else {
				i = (((Class334) class334_41_).anInt3889 - ((Class334) this).anInt3889);
				i_42_ = (((Class334) class334_41_).anInt3890 - ((Class334) this).anInt3890);
				i_43_ = (((Class334) class334_41_).anInt3891 - ((Class334) this).anInt3891);
			}
		}
		if (((Class334) this).anInt3911 != 0) {
			int i_44_ = Class382.anIntArray4657[((Class334) this).anInt3911];
			int i_45_ = Class382.anIntArray4661[((Class334) this).anInt3911];
			int i_46_ = i_42_ * i_45_ - i_43_ * i_44_ >> 14;
			i_43_ = i_42_ * i_44_ + i_43_ * i_45_ >> 14;
			i_42_ = i_46_;
		}
		if (((Class334) this).anInt3896 != 0) {
			int i_47_ = Class382.anIntArray4657[((Class334) this).anInt3896];
			int i_48_ = Class382.anIntArray4661[((Class334) this).anInt3896];
			int i_49_ = i_43_ * i_47_ + i * i_48_ >> 14;
			i_43_ = i_43_ * i_48_ - i * i_47_ >> 14;
			i = i_49_;
		}
		MeshRasterizer class528 = aClass528_3905.method11289((byte) 0, 51200, true);
		class528.W((short) 0, (short) ((Class334) this).anInt3893);
		class505.IA(1.0F);
		class505.m(16777215, 1.0F, 1.0F, (float) i, (float) i_42_, (float) i_43_);
		int i_50_ = (1024 * ((Class334) this).anInt3902 / (class528.ya() - class528.RA()));
		if (((Class334) this).anInt3894 != 0)
			i_50_ = i_50_ * 13 / 16;
		Class384 class384 = class505.method8453();
		Class384 class384_51_ = class505.method8449();
		class384_51_.method6532((float) (((Class334) this).anInt3902 / 2), (float) (((Class334) this).anInt3902 / 2), (float) i_50_, (float) i_50_, 50.0F, 50000.0F, (float) class505.method8523((byte) 109).method2714(), (float) class505.method8523((byte) 103).method2716(), 1024.0F);
		class505.method8424(class384_51_);
		class505.method8457(new Class294());
		Class294 class294 = new Class294();
		class294.method5223(0.0F, 0.0F, (float) (50 - class528.AA()));
		class528.method11282(class294, null, 1);
		int i_52_ = ((Class334) this).anInt3902 * 13 / 16;
		int i_53_ = (((Class334) this).anInt3902 - i_52_) / 2;
		aClass160_3895.method2754(i_53_, i_53_, i_52_, i_52_, 0, ~0xffffff | ((Class334) this).anInt3894, 1);
		((Class334) this).aClass160_3910 = class505.method8668(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, true);
		class505.ba(2, 0);
		class505.B(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 0, 0);
		aClass160_3912.method2754(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 1, 0, 0);
		((Class334) this).aClass160_3910.method2751(0, 0, 3);
		class505.method8424(class384);
		class505.r(anIntArray3884[0], anIntArray3884[1], anIntArray3884[2], anIntArray3884[3]);
	}

	void method5945(GraphicalRenderer class505, Class334 class334_54_) {
		method5943(class505);
		method5946(class505);
		class505.qa(anIntArray3884);
		class505.r(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902);
		class505.ba(2, 0);
		class505.B(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, ~0xffffff | ((Class334) this).anInt3894, 0);
		int i = 0;
		int i_55_ = 0;
		int i_56_ = 256;
		if (class334_54_ != null) {
			if (((Class334) class334_54_).aBool3900) {
				i = -((Class334) class334_54_).anInt3889;
				i_55_ = -((Class334) class334_54_).anInt3890;
				i_56_ = -((Class334) class334_54_).anInt3891;
			} else {
				i = (((Class334) class334_54_).anInt3889 - ((Class334) this).anInt3889);
				i_55_ = (((Class334) class334_54_).anInt3890 - ((Class334) this).anInt3890);
				i_56_ = (((Class334) class334_54_).anInt3891 - ((Class334) this).anInt3891);
			}
		}
		if (((Class334) this).anInt3911 != 0) {
			int i_57_ = Class382.anIntArray4657[((Class334) this).anInt3911];
			int i_58_ = Class382.anIntArray4661[((Class334) this).anInt3911];
			int i_59_ = i_55_ * i_58_ - i_56_ * i_57_ >> 14;
			i_56_ = i_55_ * i_57_ + i_56_ * i_58_ >> 14;
			i_55_ = i_59_;
		}
		if (((Class334) this).anInt3896 != 0) {
			int i_60_ = Class382.anIntArray4657[((Class334) this).anInt3896];
			int i_61_ = Class382.anIntArray4661[((Class334) this).anInt3896];
			int i_62_ = i_56_ * i_60_ + i * i_61_ >> 14;
			i_56_ = i_56_ * i_61_ - i * i_60_ >> 14;
			i = i_62_;
		}
		MeshRasterizer class528 = aClass528_3905.method11289((byte) 0, 51200, true);
		class528.W((short) 0, (short) ((Class334) this).anInt3893);
		class505.IA(1.0F);
		class505.m(16777215, 1.0F, 1.0F, (float) i, (float) i_55_, (float) i_56_);
		int i_63_ = (1024 * ((Class334) this).anInt3902 / (class528.ya() - class528.RA()));
		if (((Class334) this).anInt3894 != 0)
			i_63_ = i_63_ * 13 / 16;
		Class384 class384 = class505.method8453();
		Class384 class384_64_ = class505.method8449();
		class384_64_.method6532((float) (((Class334) this).anInt3902 / 2), (float) (((Class334) this).anInt3902 / 2), (float) i_63_, (float) i_63_, 50.0F, 50000.0F, (float) class505.method8523((byte) 105).method2714(), (float) class505.method8523((byte) 112).method2716(), 1024.0F);
		class505.method8424(class384_64_);
		class505.method8457(new Class294());
		Class294 class294 = new Class294();
		class294.method5223(0.0F, 0.0F, (float) (50 - class528.AA()));
		class528.method11282(class294, null, 1);
		int i_65_ = ((Class334) this).anInt3902 * 13 / 16;
		int i_66_ = (((Class334) this).anInt3902 - i_65_) / 2;
		aClass160_3895.method2754(i_66_, i_66_, i_65_, i_65_, 0, ~0xffffff | ((Class334) this).anInt3894, 1);
		((Class334) this).aClass160_3910 = class505.method8668(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, true);
		class505.ba(2, 0);
		class505.B(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 0, 0);
		aClass160_3912.method2754(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 1, 0, 0);
		((Class334) this).aClass160_3910.method2751(0, 0, 3);
		class505.method8424(class384);
		class505.r(anIntArray3884[0], anIntArray3884[1], anIntArray3884[2], anIntArray3884[3]);
	}

	static void method5946(GraphicalRenderer class505) {
		if (aClass160_3912 == null) {
			int[] is = new int[16384];
			int[] is_67_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_68_ = 64 - i;
				i_68_ *= i_68_;
				int i_69_ = 128 - i - 1;
				int i_70_ = i * 128;
				int i_71_ = i_69_ * 128;
				for (int i_72_ = 0; i_72_ < 64; i_72_++) {
					int i_73_ = 64 - i_72_;
					i_73_ *= i_73_;
					int i_74_ = 128 - i_72_ - 1;
					int i_75_ = 256 - (i_73_ + i_68_ << 8) / 4096;
					i_75_ = i_75_ * 3072 / 1536;
					if (i_75_ < 0)
						i_75_ = 0;
					else if (i_75_ > 255)
						i_75_ = 255;
					int i_76_ = i_75_ / 2;
					is_67_[i_70_ + i_72_] = is_67_[i_70_ + i_74_] = is_67_[i_71_ + i_72_] = is_67_[i_71_ + i_74_] = ~0xffffff | i_75_ << 16;
					is[i_70_ + i_72_] = is[i_70_ + i_74_] = is[i_71_ + i_72_] = is[i_71_ + i_74_] = 127 - i_76_ << 24 | 0xffffff;
				}
			}
			aClass160_3912 = class505.method8549(is_67_, 0, 128, 128, 128, -1206625053);
			aClass160_3895 = class505.method8549(is, 0, 128, 128, 128, 501003044);
		}
	}

	static void method5947(GraphicalRenderer class505) {
		if (aClass528_3905 == null) {
			RSMesh class157 = new RSMesh(580, 1104, 1);
			class157.method2664((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class157.method2662(0, 128, 0);
			class157.method2662(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_77_ = i * 8192 / 24;
				int i_78_ = Class382.anIntArray4657[i_77_];
				int i_79_ = Class382.anIntArray4661[i_77_];
				for (int i_80_ = 1; i_80_ < 24; i_80_++) {
					int i_81_ = i_80_ * 8192 / 24;
					int i_82_ = Class382.anIntArray4661[i_81_] >> 7;
					int i_83_ = Class382.anIntArray4657[i_81_] * i_78_ >> 21;
					int i_84_ = Class382.anIntArray4657[i_81_] * i_79_ >> 21;
					class157.method2662(i_84_, i_82_, -i_83_);
				}
				if (i > 0) {
					int i_85_ = i * 23 + 2;
					int i_86_ = i_85_ - 23;
					class157.method2663(0, i_86_, i_85_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_87_ = 1; i_87_ < 23; i_87_++) {
						int i_88_ = i_86_ + 1;
						int i_89_ = i_85_ + 1;
						class157.method2663(i_86_, i_88_, i_85_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class157.method2663(i_88_, i_89_, i_85_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_86_ = i_88_;
						i_85_ = i_89_;
					}
					class157.method2663(i_85_, i_86_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class157.anInt1999 = class157.anInt1974;
			class157.anIntArray1991 = null;
			class157.anIntArray2002 = null;
			class157.aByteArray1977 = null;
			aClass528_3905 = class505.createMeshRasterizer(class157, 51200, 33, 64, 768);
		}
	}

	static void method5948() {
		aClass528_3905 = null;
		aClass160_3912 = null;
	}

	void method5949(GraphicalRenderer class505, int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_) {
		if (((Class334) this).aClass160_3910 != null) {
			float[] fs = new float[3];
			float f = (float) -(((Class334) this).anInt3889 - i_95_ << 16);
			float f_99_ = (float) (((Class334) this).anInt3890 - i_96_ << 15);
			float f_100_ = (float) -(((Class334) this).anInt3891 - i_97_ << 16);
			float[] fs_101_ = new float[3];
			class505.method8458().method5231(fs_101_);
			f += fs_101_[0];
			f_99_ += fs_101_[1];
			f_100_ += fs_101_[2];
			class505.method8479(f, f_99_, f_100_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_102_ = (int) (fs[0] - (float) (((Class334) this).anInt3899 / 2));
				int i_103_ = (int) (fs[1] - (float) (((Class334) this).anInt3899 / 2));
				if (i_103_ < i_92_ && i_103_ + ((Class334) this).anInt3899 > 0 && i_102_ < i_91_ && i_102_ + ((Class334) this).anInt3899 > 0)
					((Class334) this).aClass160_3910.method2754(i_102_, i_103_, ((Class334) this).anInt3899, ((Class334) this).anInt3899, 0, i_98_ << 24 | 0xffffff, 1);
			}
		}
	}

	static void method5950() {
		aClass528_3905 = null;
		aClass160_3912 = null;
	}

	boolean method5951(int i, int i_104_, int i_105_, int i_106_) {
		int i_107_;
		int i_108_;
		int i_109_;
		if (!((Class334) this).aBool3900) {
			i_107_ = ((Class334) this).anInt3889 - i;
			i_108_ = ((Class334) this).anInt3890 - i_104_;
			i_109_ = ((Class334) this).anInt3891 - i_105_;
			((Class334) this).anInt3897 = (int) Math.sqrt((double) (i_107_ * i_107_ + i_108_ * i_108_ + i_109_ * i_109_));
			if (((Class334) this).anInt3897 == 0)
				((Class334) this).anInt3897 = 1;
			i_107_ = (i_107_ << 8) / ((Class334) this).anInt3897;
			i_108_ = (i_108_ << 8) / ((Class334) this).anInt3897;
			i_109_ = (i_109_ << 8) / ((Class334) this).anInt3897;
		} else {
			((Class334) this).anInt3897 = 1073741823;
			i_107_ = ((Class334) this).anInt3889;
			i_108_ = ((Class334) this).anInt3890;
			i_109_ = ((Class334) this).anInt3891;
		}
		int i_110_ = (int) (Math.sqrt((double) (i_107_ * i_107_ + i_108_ * i_108_ + i_109_ * i_109_)) * 256.0);
		if (i_110_ > 128) {
			i_107_ = (i_107_ << 16) / i_110_;
			i_108_ = (i_108_ << 16) / i_110_;
			i_109_ = (i_109_ << 16) / i_110_;
			((Class334) this).anInt3899 = (((Class334) this).anInt3888 * i_106_ / (((Class334) this).aBool3900 ? 1024 : ((Class334) this).anInt3897));
		} else
			((Class334) this).anInt3899 = 0;
		if (((Class334) this).anInt3899 < 8) {
			((Class334) this).aClass160_3910 = null;
			return false;
		}
		int i_111_ = Class323.nextPowerOfTwo(((Class334) this).anInt3899, -865930132);
		if (i_111_ > i_106_)
			i_111_ = Class51.method1072(i_106_, 1618321466);
		if (i_111_ > 512)
			i_111_ = 512;
		if (i_111_ != ((Class334) this).anInt3902)
			((Class334) this).anInt3902 = i_111_;
		((Class334) this).anInt3911 = (int) (Math.asin((double) ((float) i_108_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		((Class334) this).anInt3896 = (int) (Math.atan2((double) i_107_, (double) -i_109_) * 2607.5945876176133) & 0x3fff;
		((Class334) this).aClass160_3910 = null;
		return true;
	}

	boolean method5952(int i, int i_112_, int i_113_, int i_114_) {
		int i_115_;
		int i_116_;
		int i_117_;
		if (!((Class334) this).aBool3900) {
			i_115_ = ((Class334) this).anInt3889 - i;
			i_116_ = ((Class334) this).anInt3890 - i_112_;
			i_117_ = ((Class334) this).anInt3891 - i_113_;
			((Class334) this).anInt3897 = (int) Math.sqrt((double) (i_115_ * i_115_ + i_116_ * i_116_ + i_117_ * i_117_));
			if (((Class334) this).anInt3897 == 0)
				((Class334) this).anInt3897 = 1;
			i_115_ = (i_115_ << 8) / ((Class334) this).anInt3897;
			i_116_ = (i_116_ << 8) / ((Class334) this).anInt3897;
			i_117_ = (i_117_ << 8) / ((Class334) this).anInt3897;
		} else {
			((Class334) this).anInt3897 = 1073741823;
			i_115_ = ((Class334) this).anInt3889;
			i_116_ = ((Class334) this).anInt3890;
			i_117_ = ((Class334) this).anInt3891;
		}
		int i_118_ = (int) (Math.sqrt((double) (i_115_ * i_115_ + i_116_ * i_116_ + i_117_ * i_117_)) * 256.0);
		if (i_118_ > 128) {
			i_115_ = (i_115_ << 16) / i_118_;
			i_116_ = (i_116_ << 16) / i_118_;
			i_117_ = (i_117_ << 16) / i_118_;
			((Class334) this).anInt3899 = (((Class334) this).anInt3888 * i_114_ / (((Class334) this).aBool3900 ? 1024 : ((Class334) this).anInt3897));
		} else
			((Class334) this).anInt3899 = 0;
		if (((Class334) this).anInt3899 < 8) {
			((Class334) this).aClass160_3910 = null;
			return false;
		}
		int i_119_ = Class323.nextPowerOfTwo(((Class334) this).anInt3899, -230673920);
		if (i_119_ > i_114_)
			i_119_ = Class51.method1072(i_114_, 684073149);
		if (i_119_ > 512)
			i_119_ = 512;
		if (i_119_ != ((Class334) this).anInt3902)
			((Class334) this).anInt3902 = i_119_;
		((Class334) this).anInt3911 = (int) (Math.asin((double) ((float) i_116_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		((Class334) this).anInt3896 = (int) (Math.atan2((double) i_115_, (double) -i_117_) * 2607.5945876176133) & 0x3fff;
		((Class334) this).aClass160_3910 = null;
		return true;
	}

	static void method5953() {
		aClass528_3905 = null;
		aClass160_3912 = null;
	}

	void method5954(GraphicalRenderer class505, int i, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_) {
		if (((Class334) this).aClass160_3910 != null) {
			float[] fs = new float[3];
			float f = (float) -(((Class334) this).anInt3889 - i_125_ << 16);
			float f_129_ = (float) (((Class334) this).anInt3890 - i_126_ << 15);
			float f_130_ = (float) -(((Class334) this).anInt3891 - i_127_ << 16);
			float[] fs_131_ = new float[3];
			class505.method8458().method5231(fs_131_);
			f += fs_131_[0];
			f_129_ += fs_131_[1];
			f_130_ += fs_131_[2];
			class505.method8479(f, f_129_, f_130_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_132_ = (int) (fs[0] - (float) (((Class334) this).anInt3899 / 2));
				int i_133_ = (int) (fs[1] - (float) (((Class334) this).anInt3899 / 2));
				if (i_133_ < i_122_ && i_133_ + ((Class334) this).anInt3899 > 0 && i_132_ < i_121_ && i_132_ + ((Class334) this).anInt3899 > 0)
					((Class334) this).aClass160_3910.method2754(i_132_, i_133_, ((Class334) this).anInt3899, ((Class334) this).anInt3899, 0, i_128_ << 24 | 0xffffff, 1);
			}
		}
	}

	void method5955(GraphicalRenderer class505, int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_) {
		if (((Class334) this).aClass160_3910 != null) {
			float[] fs = new float[3];
			float f = (float) -(((Class334) this).anInt3889 - i_139_ << 16);
			float f_143_ = (float) (((Class334) this).anInt3890 - i_140_ << 15);
			float f_144_ = (float) -(((Class334) this).anInt3891 - i_141_ << 16);
			float[] fs_145_ = new float[3];
			class505.method8458().method5231(fs_145_);
			f += fs_145_[0];
			f_143_ += fs_145_[1];
			f_144_ += fs_145_[2];
			class505.method8479(f, f_143_, f_144_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_146_ = (int) (fs[0] - (float) (((Class334) this).anInt3899 / 2));
				int i_147_ = (int) (fs[1] - (float) (((Class334) this).anInt3899 / 2));
				if (i_147_ < i_136_ && i_147_ + ((Class334) this).anInt3899 > 0 && i_146_ < i_135_ && i_146_ + ((Class334) this).anInt3899 > 0)
					((Class334) this).aClass160_3910.method2754(i_146_, i_147_, ((Class334) this).anInt3899, ((Class334) this).anInt3899, 0, i_142_ << 24 | 0xffffff, 1);
			}
		}
	}

	boolean method5956(GraphicalRenderer class505, Class334 class334_148_) {
		if (((Class334) this).aClass160_3910 == null) {
			if (((Class334) this).anInt3887 == 0) {
				if (Class247.anInterface22_3046.method139(((Class334) this).anInt3893, -1283361248)) {
					int[] is = (Class247.anInterface22_3046.method141(((Class334) this).anInt3893, 0.7F, ((Class334) this).anInt3902, ((Class334) this).anInt3902, false, -21767002));
					((Class334) this).aClass160_3910 = class505.method8549(is, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 422108219);
				}
			} else if (((Class334) this).anInt3887 == 2)
				method5939(class505, class334_148_);
			else if (((Class334) this).anInt3887 == 1)
				method5944(class505, class334_148_);
		}
		return ((Class334) this).aClass160_3910 != null;
	}

	void method5957(GraphicalRenderer class505, Class334 class334_149_) {
		method5943(class505);
		method5946(class505);
		class505.qa(anIntArray3884);
		class505.r(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902);
		class505.ba(2, 0);
		class505.B(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, ~0xffffff | ((Class334) this).anInt3894, 0);
		int i = 0;
		int i_150_ = 0;
		int i_151_ = 256;
		if (class334_149_ != null) {
			if (((Class334) class334_149_).aBool3900) {
				i = -((Class334) class334_149_).anInt3889;
				i_150_ = -((Class334) class334_149_).anInt3890;
				i_151_ = -((Class334) class334_149_).anInt3891;
			} else {
				i = (((Class334) class334_149_).anInt3889 - ((Class334) this).anInt3889);
				i_150_ = (((Class334) class334_149_).anInt3890 - ((Class334) this).anInt3890);
				i_151_ = (((Class334) class334_149_).anInt3891 - ((Class334) this).anInt3891);
			}
		}
		if (((Class334) this).anInt3911 != 0) {
			int i_152_ = Class382.anIntArray4657[((Class334) this).anInt3911];
			int i_153_ = Class382.anIntArray4661[((Class334) this).anInt3911];
			int i_154_ = i_150_ * i_153_ - i_151_ * i_152_ >> 14;
			i_151_ = i_150_ * i_152_ + i_151_ * i_153_ >> 14;
			i_150_ = i_154_;
		}
		if (((Class334) this).anInt3896 != 0) {
			int i_155_ = Class382.anIntArray4657[((Class334) this).anInt3896];
			int i_156_ = Class382.anIntArray4661[((Class334) this).anInt3896];
			int i_157_ = i_151_ * i_155_ + i * i_156_ >> 14;
			i_151_ = i_151_ * i_156_ - i * i_155_ >> 14;
			i = i_157_;
		}
		MeshRasterizer class528 = aClass528_3905.method11289((byte) 0, 51200, true);
		class528.W((short) 0, (short) ((Class334) this).anInt3893);
		class505.IA(1.0F);
		class505.m(16777215, 1.0F, 1.0F, (float) i, (float) i_150_, (float) i_151_);
		int i_158_ = (1024 * ((Class334) this).anInt3902 / (class528.ya() - class528.RA()));
		if (((Class334) this).anInt3894 != 0)
			i_158_ = i_158_ * 13 / 16;
		Class384 class384 = class505.method8453();
		Class384 class384_159_ = class505.method8449();
		class384_159_.method6532((float) (((Class334) this).anInt3902 / 2), (float) (((Class334) this).anInt3902 / 2), (float) i_158_, (float) i_158_, 50.0F, 50000.0F, (float) class505.method8523((byte) 118).method2714(), (float) class505.method8523((byte) 113).method2716(), 1024.0F);
		class505.method8424(class384_159_);
		class505.method8457(new Class294());
		Class294 class294 = new Class294();
		class294.method5223(0.0F, 0.0F, (float) (50 - class528.AA()));
		class528.method11282(class294, null, 1);
		int i_160_ = ((Class334) this).anInt3902 * 13 / 16;
		int i_161_ = (((Class334) this).anInt3902 - i_160_) / 2;
		aClass160_3895.method2754(i_161_, i_161_, i_160_, i_160_, 0, ~0xffffff | ((Class334) this).anInt3894, 1);
		((Class334) this).aClass160_3910 = class505.method8668(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, true);
		class505.ba(2, 0);
		class505.B(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 0, 0);
		aClass160_3912.method2754(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 1, 0, 0);
		((Class334) this).aClass160_3910.method2751(0, 0, 3);
		class505.method8424(class384);
		class505.r(anIntArray3884[0], anIntArray3884[1], anIntArray3884[2], anIntArray3884[3]);
	}

	void method5958(GraphicalRenderer class505, Class334 class334_162_) {
		method5943(class505);
		method5946(class505);
		class505.qa(anIntArray3884);
		class505.r(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902);
		class505.ba(2, 0);
		class505.B(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, ~0xffffff | ((Class334) this).anInt3894, 0);
		int i = 0;
		int i_163_ = 0;
		int i_164_ = 256;
		if (class334_162_ != null) {
			if (((Class334) class334_162_).aBool3900) {
				i = -((Class334) class334_162_).anInt3889;
				i_163_ = -((Class334) class334_162_).anInt3890;
				i_164_ = -((Class334) class334_162_).anInt3891;
			} else {
				i = (((Class334) class334_162_).anInt3889 - ((Class334) this).anInt3889);
				i_163_ = (((Class334) class334_162_).anInt3890 - ((Class334) this).anInt3890);
				i_164_ = (((Class334) class334_162_).anInt3891 - ((Class334) this).anInt3891);
			}
		}
		if (((Class334) this).anInt3911 != 0) {
			int i_165_ = Class382.anIntArray4657[((Class334) this).anInt3911];
			int i_166_ = Class382.anIntArray4661[((Class334) this).anInt3911];
			int i_167_ = i_163_ * i_166_ - i_164_ * i_165_ >> 14;
			i_164_ = i_163_ * i_165_ + i_164_ * i_166_ >> 14;
			i_163_ = i_167_;
		}
		if (((Class334) this).anInt3896 != 0) {
			int i_168_ = Class382.anIntArray4657[((Class334) this).anInt3896];
			int i_169_ = Class382.anIntArray4661[((Class334) this).anInt3896];
			int i_170_ = i_164_ * i_168_ + i * i_169_ >> 14;
			i_164_ = i_164_ * i_169_ - i * i_168_ >> 14;
			i = i_170_;
		}
		MeshRasterizer class528 = aClass528_3905.method11289((byte) 0, 51200, true);
		class528.W((short) 0, (short) ((Class334) this).anInt3893);
		class505.IA(1.0F);
		class505.m(16777215, 1.0F, 1.0F, (float) i, (float) i_163_, (float) i_164_);
		int i_171_ = (1024 * ((Class334) this).anInt3902 / (class528.ya() - class528.RA()));
		if (((Class334) this).anInt3894 != 0)
			i_171_ = i_171_ * 13 / 16;
		Class384 class384 = class505.method8453();
		Class384 class384_172_ = class505.method8449();
		class384_172_.method6532((float) (((Class334) this).anInt3902 / 2), (float) (((Class334) this).anInt3902 / 2), (float) i_171_, (float) i_171_, 50.0F, 50000.0F, (float) class505.method8523((byte) 110).method2714(), (float) class505.method8523((byte) 112).method2716(), 1024.0F);
		class505.method8424(class384_172_);
		class505.method8457(new Class294());
		Class294 class294 = new Class294();
		class294.method5223(0.0F, 0.0F, (float) (50 - class528.AA()));
		class528.method11282(class294, null, 1);
		int i_173_ = ((Class334) this).anInt3902 * 13 / 16;
		int i_174_ = (((Class334) this).anInt3902 - i_173_) / 2;
		aClass160_3895.method2754(i_174_, i_174_, i_173_, i_173_, 0, ~0xffffff | ((Class334) this).anInt3894, 1);
		((Class334) this).aClass160_3910 = class505.method8668(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, true);
		class505.ba(2, 0);
		class505.B(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 0, 0);
		aClass160_3912.method2754(0, 0, ((Class334) this).anInt3902, ((Class334) this).anInt3902, 1, 0, 0);
		((Class334) this).aClass160_3910.method2751(0, 0, 3);
		class505.method8424(class384);
		class505.r(anIntArray3884[0], anIntArray3884[1], anIntArray3884[2], anIntArray3884[3]);
	}

	public Class334(int i, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_, boolean bool, int i_181_, int i_182_, int i_183_) {
		((Class334) this).anInt3889 = i_176_;
		((Class334) this).anInt3890 = i_177_;
		((Class334) this).anInt3891 = i_178_;
		((Class334) this).aBool3900 = bool;
		((Class334) this).anInt3893 = i_175_;
		((Class334) this).anInt3894 = i_180_;
		((Class334) this).anInt3888 = i_179_;
		((Class334) this).anInt3887 = i;
		((Class334) this).anInt3901 = i_181_;
		((Class334) this).anInt3883 = i_182_;
		((Class334) this).anInt3903 = i_183_;
	}

	static void method5959(GraphicalRenderer class505) {
		if (aClass160_3912 == null) {
			int[] is = new int[16384];
			int[] is_184_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_185_ = 64 - i;
				i_185_ *= i_185_;
				int i_186_ = 128 - i - 1;
				int i_187_ = i * 128;
				int i_188_ = i_186_ * 128;
				for (int i_189_ = 0; i_189_ < 64; i_189_++) {
					int i_190_ = 64 - i_189_;
					i_190_ *= i_190_;
					int i_191_ = 128 - i_189_ - 1;
					int i_192_ = 256 - (i_190_ + i_185_ << 8) / 4096;
					i_192_ = i_192_ * 3072 / 1536;
					if (i_192_ < 0)
						i_192_ = 0;
					else if (i_192_ > 255)
						i_192_ = 255;
					int i_193_ = i_192_ / 2;
					is_184_[i_187_ + i_189_] = is_184_[i_187_ + i_191_] = is_184_[i_188_ + i_189_] = is_184_[i_188_ + i_191_] = ~0xffffff | i_192_ << 16;
					is[i_187_ + i_189_] = is[i_187_ + i_191_] = is[i_188_ + i_189_] = is[i_188_ + i_191_] = 127 - i_193_ << 24 | 0xffffff;
				}
			}
			aClass160_3912 = class505.method8549(is_184_, 0, 128, 128, 128, -755447497);
			aClass160_3895 = class505.method8549(is, 0, 128, 128, 128, 1431162182);
		}
	}

	static void method5960(GraphicalRenderer class505) {
		if (aClass160_3912 == null) {
			int[] is = new int[16384];
			int[] is_194_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_195_ = 64 - i;
				i_195_ *= i_195_;
				int i_196_ = 128 - i - 1;
				int i_197_ = i * 128;
				int i_198_ = i_196_ * 128;
				for (int i_199_ = 0; i_199_ < 64; i_199_++) {
					int i_200_ = 64 - i_199_;
					i_200_ *= i_200_;
					int i_201_ = 128 - i_199_ - 1;
					int i_202_ = 256 - (i_200_ + i_195_ << 8) / 4096;
					i_202_ = i_202_ * 3072 / 1536;
					if (i_202_ < 0)
						i_202_ = 0;
					else if (i_202_ > 255)
						i_202_ = 255;
					int i_203_ = i_202_ / 2;
					is_194_[i_197_ + i_199_] = is_194_[i_197_ + i_201_] = is_194_[i_198_ + i_199_] = is_194_[i_198_ + i_201_] = ~0xffffff | i_202_ << 16;
					is[i_197_ + i_199_] = is[i_197_ + i_201_] = is[i_198_ + i_199_] = is[i_198_ + i_201_] = 127 - i_203_ << 24 | 0xffffff;
				}
			}
			aClass160_3912 = class505.method8549(is_194_, 0, 128, 128, 128, -2000853646);
			aClass160_3895 = class505.method8549(is, 0, 128, 128, 128, -1474090863);
		}
	}
}
