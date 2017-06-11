/* Class387_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class387_Sub1 extends Class387 {
	boolean aBoolean7733;
	int[] anIntArray7734;
	Class15 aClass15_7735;
	Class15 aClass15_7736;
	Class2 aClass2_7737;
	float[][] aFloatArrayArray7738;
	short aShort7739;
	Class5[] aClass5Array7740;
	static int anInt7741 = 7;
	int anInt7742;
	short aShort7743;
	static int anInt7744 = 618520;
	float[] aFloatArray7745;
	int anInt7746;
	int anInt7747;
	int anInt7748;
	static int anInt7749 = 4;
	Class85[] aClass85Array7750;
	int[] anIntArray7751;
	int[] anIntArray7752;
	int[] anIntArray7753;
	Class68[] aClass68Array7754;
	Class1[] aClass1Array7755;
	boolean aBoolean7756;
	int anInt7757;
	short[] aShortArray7758;
	short[] aShortArray7759;
	short[] aShortArray7760;
	int[] anIntArray7761;
	float[][] aFloatArrayArray7762;
	int[] anIntArray7763;
	int[] anIntArray7764;
	static int anInt7765 = 618648;
	static int anInt7766 = 0;
	static int anInt7767 = 1;
	static int anInt7768 = 2;
	Class_ra_Sub1 aClass_ra_Sub1_7769;
	short aShort7770;
	byte[] aByteArray7771;
	byte[] aByteArray7772;
	byte[] aByteArray7773;
	short[] aShortArray7774;
	short[] aShortArray7775;
	short[] aShortArray7776;
	boolean aBoolean7777;
	int[][] anIntArrayArray7778;
	int[][] anIntArrayArray7779;
	boolean aBoolean7780;
	int anInt7781;
	int anInt7782;
	int anInt7783;
	float[] aFloatArray7784;
	boolean aBoolean7785;
	Class1[] aClass1Array7786;
	static int anInt7787;
	int anInt7788;
	Class16[] aClass16Array7789;
	Class18[] aClass18Array7790;
	int[][] anIntArrayArray7791;
	boolean aBoolean7792;
	int[] anIntArray7793;
	short aShort7794;
	short aShort7795;
	short aShort7796;
	short aShort7797;
	static int anInt7798 = -2;
	int anInt7799;
	short aShort7800;
	int[] anIntArray7801;
	static int anInt7802 = -1;
	short[] aShortArray7803;
	Class387_Sub1[] aClass387_Sub1Array7804;
	static int anInt7805;
	float[] aFloatArray7806;
	float[] aFloatArray7807;
	boolean aBoolean7808 = false;
	int[] anIntArray7809;
	static int anInt7810 = 4096;
	int[] anIntArray7811;
	int anInt7812;
	int[] anIntArray7813;
	int[] anIntArray7814;
	Class387_Sub1[] aClass387_Sub1Array7815;
	short[] aShortArray7816;

	public Class_na ct(Class_na class_na) {
		return null;
	}

	Class387_Sub1(Class_ra_Sub1 class_ra_sub1, Model model, int i, int i_0_, int i_1_, int i_2_) {
		((Class387_Sub1) this).anInt7799 = 0;
		((Class387_Sub1) this).anInt7742 = 0;
		((Class387_Sub1) this).anInt7757 = 0;
		((Class387_Sub1) this).anInt7812 = 0;
		((Class387_Sub1) this).aBoolean7780 = false;
		((Class387_Sub1) this).aBoolean7785 = false;
		((Class387_Sub1) this).aBoolean7792 = false;
		((Class387_Sub1) this).aBoolean7756 = false;
		((Class387_Sub1) this).aBoolean7777 = false;
		((Class387_Sub1) this).aClass_ra_Sub1_7769 = class_ra_sub1;
		((Class387_Sub1) this).anInt7746 = i;
		((Class387_Sub1) this).anInt7747 = i_0_;
		((Class387_Sub1) this).anInt7748 = i_1_;
		Interface_ma interface_ma = ((Class387_Sub1) this).aClass_ra_Sub1_7769.anInterface_ma5299;
		((Class387_Sub1) this).anInt7799 = model.vertices;
		((Class387_Sub1) this).anInt7742 = model.anInt626;
		((Class387_Sub1) this).anIntArray7751 = model.anIntArray616;
		((Class387_Sub1) this).anIntArray7752 = model.anIntArray642;
		((Class387_Sub1) this).anIntArray7753 = model.anIntArray618;
		((Class387_Sub1) this).anInt7757 = model.triangles;
		((Class387_Sub1) this).aShortArray7758 = model.aShortArray644;
		((Class387_Sub1) this).aShortArray7759 = model.aShortArray646;
		((Class387_Sub1) this).aShortArray7760 = model.aShortArray624;
		((Class387_Sub1) this).aByteArray7772 = model.priorities;
		((Class387_Sub1) this).aShortArray7775 = model.aShortArray629;
		((Class387_Sub1) this).aByteArray7773 = model.aByteArray627;
		((Class387_Sub1) this).aShortArray7776 = model.aShortArray615;
		((Class387_Sub1) this).aByteArray7771 = model.face_fill_attributes;
		((Class387_Sub1) this).aClass85Array7750 = model.aClass85Array647;
		((Class387_Sub1) this).aClass68Array7754 = model.aClass68Array613;
		((Class387_Sub1) this).aShortArray7816 = model.aShortArray620;
		int[] is = new int[((Class387_Sub1) this).anInt7757];
		for (int i_3_ = 0; i_3_ < ((Class387_Sub1) this).anInt7757; i_3_++)
			is[i_3_] = i_3_;
		long[] ls = new long[((Class387_Sub1) this).anInt7757];
		boolean bool = (((Class387_Sub1) this).anInt7746 & 0x100) != 0;
		for (int i_4_ = 0; i_4_ < ((Class387_Sub1) this).anInt7757; i_4_++) {
			int i_5_ = is[i_4_];
			Class53 class53 = null;
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = 0;
			int i_9_ = 0;
			if (model.aClass84Array649 != null) {
				boolean bool_10_ = false;
				for (int i_11_ = 0; i_11_ < model.aClass84Array649.length; i_11_++) {
					Class84 class84 = model.aClass84Array649[i_11_];
					if (i_5_ == class84.anInt767 * 1512514121) {
						Class173 class173 = Linkable.method2844((class84.anInt768 * 1834782277), 222052700);
						if (class173.aBoolean1757)
							bool_10_ = true;
						if (class173.anInt1751 * 39181267 != -1) {
							Class53 class53_12_ = interface_ma.method174((class173.anInt1751 * 39181267), 133087577);
							if (class53_12_.anInt528 * -2138060883 == 2)
								((Class387_Sub1) this).aBoolean7756 = true;
						}
					}
				}
				if (bool_10_)
					ls[i_4_] = 9223372036854775807L;
			}
			int i_13_ = -1;
			if (model.aShortArray617 != null) {
				i_13_ = model.aShortArray617[i_5_];
				if (i_13_ != -1) {
					class53 = interface_ma.method174(i_13_ & 0xffff, 2033118818);
					if ((i_2_ & 0x40) == 0 || !class53.aBoolean524) {
						i_8_ = class53.aByte529;
						i_9_ = class53.aByte536;
					} else
						i_13_ = -1;
				}
			}
			boolean bool_14_ = ((((Class387_Sub1) this).aByteArray7773 != null && ((Class387_Sub1) this).aByteArray7773[i_5_] != 0) || class53 != null && class53.anInt528 * -2138060883 == 2);
			if ((bool || bool_14_) && ((Class387_Sub1) this).aByteArray7772 != null)
				i_6_ += ((Class387_Sub1) this).aByteArray7772[i_5_] << 17;
			if (bool_14_)
				i_6_ += 65536;
			i_6_ += (i_8_ & 0xff) << 8;
			i_6_ += i_9_ & 0xff;
			i_7_ += (i_13_ & 0xffff) << 16;
			i_7_ += i_4_ & 0xffff;
			ls[i_4_] = ((long) i_6_ << 32) + (long) i_7_;
			((Class387_Sub1) this).aBoolean7756 |= bool_14_;
		}
		Class277.method2598(ls, is, (byte) -26);
		if (model.aClass84Array649 != null) {
			((Class387_Sub1) this).anInt7788 = model.aClass84Array649.length;
			((Class387_Sub1) this).aClass16Array7789 = new Class16[((Class387_Sub1) this).anInt7788];
			((Class387_Sub1) this).aClass18Array7790 = new Class18[((Class387_Sub1) this).anInt7788];
			for (int i_15_ = 0; i_15_ < model.aClass84Array649.length; i_15_++) {
				Class84 class84 = model.aClass84Array649[i_15_];
				Class173 class173 = Linkable.method2844(class84.anInt768 * 1834782277, -919855044);
				int i_16_ = ((Class379.anIntArray4096[(model.aShortArray629[class84.anInt767 * 1512514121] & 0xffff)]) & 0xffffff);
				i_16_ = i_16_ | 255 - (model.aByteArray627 != null ? (model.aByteArray627[class84.anInt767 * 1512514121]) & 0xff : 0) << 24;
				((Class387_Sub1) this).aClass16Array7789[i_15_] = (new Class16(class84.anInt767 * 1512514121, model.aShortArray644[class84.anInt767 * 1512514121], model.aShortArray646[class84.anInt767 * 1512514121], model.aShortArray624[class84.anInt767 * 1512514121], class173.anInt1755 * 1951943953, class173.anInt1753 * 893949695, class173.anInt1751 * 39181267, class173.anInt1752 * -310074719, class173.anInt1754 * 1092922159, class173.aBoolean1757, class84.anInt769 * 2010148771));
				((Class387_Sub1) this).aClass18Array7790[i_15_] = new Class18(i_16_);
			}
		}
		((Class387_Sub1) this).aFloatArrayArray7738 = new float[((Class387_Sub1) this).anInt7757][];
		((Class387_Sub1) this).aFloatArrayArray7762 = new float[((Class387_Sub1) this).anInt7757][];
		Class76 class76 = method4785(model, is, ((Class387_Sub1) this).anInt7757);
		Class15 class15 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread());
		float[] fs = ((Class15) class15).aFloatArray210;
		boolean bool_17_ = false;
		for (int i_18_ = 0; i_18_ < ((Class387_Sub1) this).anInt7757; i_18_++) {
			int i_19_ = is[i_18_];
			int i_20_;
			if (model.aByteArray635 == null)
				i_20_ = -1;
			else
				i_20_ = model.aByteArray635[i_19_];
			int i_21_ = (model.aShortArray617 == null ? (int) -1 : model.aShortArray617[i_19_]);
			if (i_21_ != -1 && (i_2_ & 0x40) != 0) {
				Class53 class53 = interface_ma.method174(i_21_ & 0xffff, 112924147);
				if (class53.aBoolean524)
					i_21_ = -1;
			}
			if (i_21_ != -1) {
				bool_17_ = true;
				float[] fs_22_ = (((Class387_Sub1) this).aFloatArrayArray7738[i_19_] = new float[3]);
				float[] fs_23_ = (((Class387_Sub1) this).aFloatArrayArray7762[i_19_] = new float[3]);
				boolean bool_24_ = false;
				if (i_20_ == -1) {
					fs_22_[0] = 0.0F;
					fs_23_[0] = 1.0F;
					fs_22_[1] = 1.0F;
					fs_23_[1] = 1.0F;
					fs_22_[2] = 0.0F;
					fs_23_[2] = 0.0F;
				} else {
					i_20_ &= 0xff;
					byte i_25_ = model.tex_fill_attr[i_20_];
					if (i_25_ == 0) {
						short i_26_ = ((Class387_Sub1) this).aShortArray7758[i_19_];
						short i_27_ = ((Class387_Sub1) this).aShortArray7759[i_19_];
						short i_28_ = ((Class387_Sub1) this).aShortArray7760[i_19_];
						short i_29_ = model.tex_point_mapx[i_20_];
						short i_30_ = model.tex_point_mapy[i_20_];
						short i_31_ = model.tex_point_mapz[i_20_];
						float f = (float) (((Class387_Sub1) this).anIntArray7751[i_29_]);
						float f_32_ = (float) (((Class387_Sub1) this).anIntArray7752[i_29_]);
						float f_33_ = (float) (((Class387_Sub1) this).anIntArray7753[i_29_]);
						float f_34_ = ((float) (((Class387_Sub1) this).anIntArray7751[i_30_]) - f);
						float f_35_ = ((float) (((Class387_Sub1) this).anIntArray7752[i_30_]) - f_32_);
						float f_36_ = ((float) (((Class387_Sub1) this).anIntArray7753[i_30_]) - f_33_);
						float f_37_ = ((float) (((Class387_Sub1) this).anIntArray7751[i_31_]) - f);
						float f_38_ = ((float) (((Class387_Sub1) this).anIntArray7752[i_31_]) - f_32_);
						float f_39_ = ((float) (((Class387_Sub1) this).anIntArray7753[i_31_]) - f_33_);
						float f_40_ = ((float) (((Class387_Sub1) this).anIntArray7751[i_26_]) - f);
						float f_41_ = ((float) (((Class387_Sub1) this).anIntArray7752[i_26_]) - f_32_);
						float f_42_ = ((float) (((Class387_Sub1) this).anIntArray7753[i_26_]) - f_33_);
						float f_43_ = ((float) (((Class387_Sub1) this).anIntArray7751[i_27_]) - f);
						float f_44_ = ((float) (((Class387_Sub1) this).anIntArray7752[i_27_]) - f_32_);
						float f_45_ = ((float) (((Class387_Sub1) this).anIntArray7753[i_27_]) - f_33_);
						float f_46_ = ((float) (((Class387_Sub1) this).anIntArray7751[i_28_]) - f);
						float f_47_ = ((float) (((Class387_Sub1) this).anIntArray7752[i_28_]) - f_32_);
						float f_48_ = ((float) (((Class387_Sub1) this).anIntArray7753[i_28_]) - f_33_);
						float f_49_ = f_35_ * f_39_ - f_36_ * f_38_;
						float f_50_ = f_36_ * f_37_ - f_34_ * f_39_;
						float f_51_ = f_34_ * f_38_ - f_35_ * f_37_;
						float f_52_ = f_38_ * f_51_ - f_39_ * f_50_;
						float f_53_ = f_39_ * f_49_ - f_37_ * f_51_;
						float f_54_ = f_37_ * f_50_ - f_38_ * f_49_;
						float f_55_ = 1.0F / (f_52_ * f_34_ + f_53_ * f_35_ + f_54_ * f_36_);
						fs_22_[0] = (f_52_ * f_40_ + f_53_ * f_41_ + f_54_ * f_42_) * f_55_;
						fs_22_[1] = (f_52_ * f_43_ + f_53_ * f_44_ + f_54_ * f_45_) * f_55_;
						fs_22_[2] = (f_52_ * f_46_ + f_53_ * f_47_ + f_54_ * f_48_) * f_55_;
						f_52_ = f_35_ * f_51_ - f_36_ * f_50_;
						f_53_ = f_36_ * f_49_ - f_34_ * f_51_;
						f_54_ = f_34_ * f_50_ - f_35_ * f_49_;
						f_55_ = 1.0F / (f_52_ * f_37_ + f_53_ * f_38_ + f_54_ * f_39_);
						fs_23_[0] = (f_52_ * f_40_ + f_53_ * f_41_ + f_54_ * f_42_) * f_55_;
						fs_23_[1] = (f_52_ * f_43_ + f_53_ * f_44_ + f_54_ * f_45_) * f_55_;
						fs_23_[2] = (f_52_ * f_46_ + f_53_ * f_47_ + f_54_ * f_48_) * f_55_;
					} else {
						short i_56_ = ((Class387_Sub1) this).aShortArray7758[i_19_];
						short i_57_ = ((Class387_Sub1) this).aShortArray7759[i_19_];
						short i_58_ = ((Class387_Sub1) this).aShortArray7760[i_19_];
						int i_59_ = class76.anIntArray713[i_20_];
						int i_60_ = class76.anIntArray710[i_20_];
						int i_61_ = class76.anIntArray709[i_20_];
						float[] fs_62_ = class76.aFloatArrayArray711[i_20_];
						byte i_63_ = model.aByteArray628[i_20_];
						float f = (float) model.anIntArray637[i_20_] / 256.0F;
						if (i_25_ == 1) {
							float f_64_ = ((float) model.particles_xdir[i_20_] / 1024.0F);
							method4744(((Class387_Sub1) this).anIntArray7751[i_56_], ((Class387_Sub1) this).anIntArray7752[i_56_], ((Class387_Sub1) this).anIntArray7753[i_56_], i_59_, i_60_, i_61_, fs_62_, f_64_, i_63_, f, fs);
							fs_22_[0] = fs[0];
							fs_23_[0] = fs[1];
							method4744(((Class387_Sub1) this).anIntArray7751[i_57_], ((Class387_Sub1) this).anIntArray7752[i_57_], ((Class387_Sub1) this).anIntArray7753[i_57_], i_59_, i_60_, i_61_, fs_62_, f_64_, i_63_, f, fs);
							fs_22_[1] = fs[0];
							fs_23_[1] = fs[1];
							method4744(((Class387_Sub1) this).anIntArray7751[i_58_], ((Class387_Sub1) this).anIntArray7752[i_58_], ((Class387_Sub1) this).anIntArray7753[i_58_], i_59_, i_60_, i_61_, fs_62_, f_64_, i_63_, f, fs);
							fs_22_[2] = fs[0];
							fs_23_[2] = fs[1];
							float f_65_ = f_64_ / 2.0F;
							if ((i_63_ & 0x1) == 0) {
								if (fs_22_[1] - fs_22_[0] > f_65_)
									fs_22_[1] -= f_64_;
								else if (fs_22_[0] - fs_22_[1] > f_65_)
									fs_22_[1] += f_64_;
								if (fs_22_[2] - fs_22_[0] > f_65_)
									fs_22_[2] -= f_64_;
								else if (fs_22_[0] - fs_22_[2] > f_65_)
									fs_22_[2] += f_64_;
							} else {
								if (fs_23_[1] - fs_23_[0] > f_65_)
									fs_23_[1] -= f_64_;
								else if (fs_23_[0] - fs_23_[1] > f_65_)
									fs_23_[1] += f_64_;
								if (fs_23_[2] - fs_23_[0] > f_65_)
									fs_23_[2] -= f_64_;
								else if (fs_23_[0] - fs_23_[2] > f_65_)
									fs_23_[2] += f_64_;
							}
						} else if (i_25_ == 2) {
							float f_66_ = ((float) model.tex_primary_clr[i_20_] / 256.0F);
							float f_67_ = ((float) model.tex_secondary_clr[i_20_] / 256.0F);
							int i_68_ = (((Class387_Sub1) this).anIntArray7751[i_57_] - (((Class387_Sub1) this).anIntArray7751[i_56_]));
							int i_69_ = (((Class387_Sub1) this).anIntArray7752[i_57_] - (((Class387_Sub1) this).anIntArray7752[i_56_]));
							int i_70_ = (((Class387_Sub1) this).anIntArray7753[i_57_] - (((Class387_Sub1) this).anIntArray7753[i_56_]));
							int i_71_ = (((Class387_Sub1) this).anIntArray7751[i_58_] - (((Class387_Sub1) this).anIntArray7751[i_56_]));
							int i_72_ = (((Class387_Sub1) this).anIntArray7752[i_58_] - (((Class387_Sub1) this).anIntArray7752[i_56_]));
							int i_73_ = (((Class387_Sub1) this).anIntArray7753[i_58_] - (((Class387_Sub1) this).anIntArray7753[i_56_]));
							int i_74_ = i_69_ * i_73_ - i_72_ * i_70_;
							int i_75_ = i_70_ * i_71_ - i_73_ * i_68_;
							int i_76_ = i_68_ * i_72_ - i_71_ * i_69_;
							float f_77_ = 64.0F / (float) model.particles_zlifepsan[i_20_];
							float f_78_ = 64.0F / (float) model.particles_zdir[i_20_];
							float f_79_ = 64.0F / (float) model.particles_xdir[i_20_];
							float f_80_ = (((float) i_74_ * fs_62_[0] + (float) i_75_ * fs_62_[1] + (float) i_76_ * fs_62_[2]) / f_77_);
							float f_81_ = (((float) i_74_ * fs_62_[3] + (float) i_75_ * fs_62_[4] + (float) i_76_ * fs_62_[5]) / f_78_);
							float f_82_ = (((float) i_74_ * fs_62_[6] + (float) i_75_ * fs_62_[7] + (float) i_76_ * fs_62_[8]) / f_79_);
							int i_83_ = method4729(f_80_, f_81_, f_82_);
							method4730(((Class387_Sub1) this).anIntArray7751[i_56_], ((Class387_Sub1) this).anIntArray7752[i_56_], ((Class387_Sub1) this).anIntArray7753[i_56_], i_59_, i_60_, i_61_, i_83_, fs_62_, i_63_, f, f_66_, f_67_, fs);
							fs_22_[0] = fs[0];
							fs_23_[0] = fs[1];
							method4730(((Class387_Sub1) this).anIntArray7751[i_57_], ((Class387_Sub1) this).anIntArray7752[i_57_], ((Class387_Sub1) this).anIntArray7753[i_57_], i_59_, i_60_, i_61_, i_83_, fs_62_, i_63_, f, f_66_, f_67_, fs);
							fs_22_[1] = fs[0];
							fs_23_[1] = fs[1];
							method4730(((Class387_Sub1) this).anIntArray7751[i_58_], ((Class387_Sub1) this).anIntArray7752[i_58_], ((Class387_Sub1) this).anIntArray7753[i_58_], i_59_, i_60_, i_61_, i_83_, fs_62_, i_63_, f, f_66_, f_67_, fs);
							fs_22_[2] = fs[0];
							fs_23_[2] = fs[1];
						} else if (i_25_ == 3) {
							method4780(((Class387_Sub1) this).anIntArray7751[i_56_], ((Class387_Sub1) this).anIntArray7752[i_56_], ((Class387_Sub1) this).anIntArray7753[i_56_], i_59_, i_60_, i_61_, fs_62_, i_63_, f, fs);
							fs_22_[0] = fs[0];
							fs_23_[0] = fs[1];
							method4780(((Class387_Sub1) this).anIntArray7751[i_57_], ((Class387_Sub1) this).anIntArray7752[i_57_], ((Class387_Sub1) this).anIntArray7753[i_57_], i_59_, i_60_, i_61_, fs_62_, i_63_, f, fs);
							fs_22_[1] = fs[0];
							fs_23_[1] = fs[1];
							method4780(((Class387_Sub1) this).anIntArray7751[i_58_], ((Class387_Sub1) this).anIntArray7752[i_58_], ((Class387_Sub1) this).anIntArray7753[i_58_], i_59_, i_60_, i_61_, fs_62_, i_63_, f, fs);
							fs_22_[2] = fs[0];
							fs_23_[2] = fs[1];
							if ((i_63_ & 0x1) == 0) {
								if (fs_22_[1] - fs_22_[0] > 0.5F)
									fs_22_[1]--;
								else if (fs_22_[0] - fs_22_[1] > 0.5F)
									fs_22_[1]++;
								if (fs_22_[2] - fs_22_[0] > 0.5F)
									fs_22_[2]--;
								else if (fs_22_[0] - fs_22_[2] > 0.5F)
									fs_22_[2]++;
							} else {
								if (fs_23_[1] - fs_23_[0] > 0.5F)
									fs_23_[1]--;
								else if (fs_23_[0] - fs_23_[1] > 0.5F)
									fs_23_[1]++;
								if (fs_23_[2] - fs_23_[0] > 0.5F)
									fs_23_[2]--;
								else if (fs_23_[0] - fs_23_[2] > 0.5F)
									fs_23_[2]++;
							}
						}
					}
				}
			}
		}
		if (!bool_17_) {
			((Class387_Sub1) this).aFloatArrayArray7762 = null;
			((Class387_Sub1) this).aFloatArrayArray7738 = null;
		}
		if (model.vertexSkinTypes != null && (((Class387_Sub1) this).anInt7746 & 0x20) != 0)
			((Class387_Sub1) this).anIntArrayArray7778 = model.method749(true);
		if (model.alpha_channel != null && (((Class387_Sub1) this).anInt7746 & 0x180) != 0)
			((Class387_Sub1) this).anIntArrayArray7779 = model.method750();
		if (model.aClass84Array649 != null && (((Class387_Sub1) this).anInt7746 & 0x400) != 0)
			((Class387_Sub1) this).anIntArrayArray7791 = model.method759();
		if (model.aShortArray617 != null) {
			((Class387_Sub1) this).aShortArray7774 = new short[((Class387_Sub1) this).anInt7757];
			boolean bool_84_ = false;
			for (int i_85_ = 0; i_85_ < ((Class387_Sub1) this).anInt7757; i_85_++) {
				short i_86_ = model.aShortArray617[i_85_];
				if (i_86_ != -1) {
					Class53 class53 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.anInterface_ma5299.method174(i_86_, 1737067393);
					if ((i_2_ & 0x40) == 0 || !class53.aBoolean524) {
						((Class387_Sub1) this).aShortArray7774[i_85_] = i_86_;
						bool_84_ = true;
						if (class53.anInt528 * -2138060883 == 2)
							((Class387_Sub1) this).aBoolean7756 = true;
						if (class53.aByte535 != 0 || class53.aByte509 != 0)
							((Class387_Sub1) this).aBoolean7777 = true;
					} else
						((Class387_Sub1) this).aShortArray7774[i_85_] = (short) -1;
				} else
					((Class387_Sub1) this).aShortArray7774[i_85_] = (short) -1;
			}
			if (!bool_84_)
				((Class387_Sub1) this).aShortArray7774 = null;
		} else
			((Class387_Sub1) this).aShortArray7774 = null;
		if (((Class387_Sub1) this).aBoolean7756 || ((Class387_Sub1) this).aClass16Array7789 != null) {
			((Class387_Sub1) this).aShortArray7803 = new short[((Class387_Sub1) this).anInt7757];
			for (int i_87_ = 0; i_87_ < ((Class387_Sub1) this).anInt7757; i_87_++)
				((Class387_Sub1) this).aShortArray7803[i_87_] = (short) is[i_87_];
		}
	}

	void method4789(Class15 class15) {
		((Class387_Sub1) this).aClass2_7737 = ((Class15) class15).aClass2_192;
		if (class15 != ((Class387_Sub1) this).aClass15_7735) {
			((Class387_Sub1) this).aClass15_7735 = class15;
			((Class387_Sub1) this).anIntArray7734 = (((Class15) ((Class387_Sub1) this).aClass15_7735).anIntArray213);
			((Class387_Sub1) this).aFloatArray7784 = (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloatArray197);
			((Class387_Sub1) this).aFloatArray7806 = (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloatArray188);
			((Class387_Sub1) this).aFloatArray7807 = (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloatArray199);
			((Class387_Sub1) this).aFloatArray7745 = (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloatArray200);
			((Class387_Sub1) this).anIntArray7809 = (((Class15) ((Class387_Sub1) this).aClass15_7735).anIntArray201);
			((Class387_Sub1) this).anIntArray7761 = (((Class15) ((Class387_Sub1) this).aClass15_7735).anIntArray202);
			((Class387_Sub1) this).anIntArray7811 = (((Class15) ((Class387_Sub1) this).aClass15_7735).anIntArray203);
			((Class387_Sub1) this).anIntArray7793 = (((Class15) ((Class387_Sub1) this).aClass15_7735).anIntArray204);
			((Class387_Sub1) this).anIntArray7813 = (((Class15) ((Class387_Sub1) this).aClass15_7735).anIntArray178);
			((Class387_Sub1) this).anIntArray7814 = (((Class15) ((Class387_Sub1) this).aClass15_7735).anIntArray206);
		}
	}

	public void eb(short i, short i_88_) {
		for (int i_89_ = 0; i_89_ < ((Class387_Sub1) this).anInt7757; i_89_++) {
			if (((Class387_Sub1) this).aShortArray7775[i_89_] == i)
				((Class387_Sub1) this).aShortArray7775[i_89_] = i_88_;
		}
		if (((Class387_Sub1) this).aClass16Array7789 != null) {
			for (int i_90_ = 0; i_90_ < ((Class387_Sub1) this).anInt7788; i_90_++) {
				Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_90_];
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_90_];
				((Class18) class18).anInt254 = (((Class18) class18).anInt254 * -1509687305 & ~0xffffff | ((Class379.anIntArray4096[Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]), (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	public void method4759(Matrix3f class222, Class302_Sub1 class302_sub1, int i) {
		method4811(class222, class302_sub1, i);
	}

	public boolean i() {
		return ((Class387_Sub1) this).aBoolean7756;
	}

	void method4790(boolean bool) {
		if (((Class387_Sub1) this).anInt7812 == 1)
			method4792();
		else if (((Class387_Sub1) this).anInt7812 == 2) {
			if ((((Class387_Sub1) this).anInt7746 & 0x97098) == 0 && ((Class387_Sub1) this).aFloatArrayArray7738 == null)
				((Class387_Sub1) this).aShortArray7775 = null;
			if (bool)
				((Class387_Sub1) this).aByteArray7771 = null;
		} else {
			method4814();
			int i = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7978) * 760881147;
			int i_91_ = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7979) * -181413563;
			int i_92_ = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7981) * -1601750017;
			int i_93_ = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7983) * -697249431 >> 8;
			int i_94_ = 0;
			int i_95_ = 0;
			if (((Class387_Sub1) this).anInt7748 != 0) {
				i_94_ = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7998 * -801738496 / ((Class387_Sub1) this).anInt7748);
				i_95_ = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7982 * -990251776 / ((Class387_Sub1) this).anInt7748);
			}
			if (((Class387_Sub1) this).anIntArray7763 == null) {
				((Class387_Sub1) this).anIntArray7763 = new int[((Class387_Sub1) this).anInt7757];
				((Class387_Sub1) this).anIntArray7764 = new int[((Class387_Sub1) this).anInt7757];
				((Class387_Sub1) this).anIntArray7801 = new int[((Class387_Sub1) this).anInt7757];
			}
			for (int i_96_ = 0; i_96_ < ((Class387_Sub1) this).anInt7757; i_96_++) {
				byte i_97_;
				if (((Class387_Sub1) this).aByteArray7771 == null)
					i_97_ = (byte) 0;
				else
					i_97_ = ((Class387_Sub1) this).aByteArray7771[i_96_];
				byte i_98_;
				if (((Class387_Sub1) this).aByteArray7773 == null)
					i_98_ = (byte) 0;
				else
					i_98_ = ((Class387_Sub1) this).aByteArray7773[i_96_];
				short i_99_;
				if (((Class387_Sub1) this).aShortArray7774 == null)
					i_99_ = (short) -1;
				else
					i_99_ = ((Class387_Sub1) this).aShortArray7774[i_96_];
				if (i_98_ == -2)
					i_97_ = (byte) 3;
				if (i_98_ == -1)
					i_97_ = (byte) 2;
				if (i_99_ == -1) {
					if (i_97_ == 0) {
						int i_100_ = (((Class387_Sub1) this).aShortArray7775[i_96_] & 0xffff);
						int i_101_ = (((i_100_ & 0x7f) * ((Class387_Sub1) this).anInt7747) >> 7);
						short i_102_ = Class173.method1823(i_100_ & ~0x7f | i_101_, (byte) 0);
						Class1 class1;
						if (((Class387_Sub1) this).aClass1Array7786 != null && (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7758[i_96_])]) != null)
							class1 = (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7758[i_96_])]);
						else
							class1 = (((Class387_Sub1) this).aClass1Array7755[(((Class387_Sub1) this).aShortArray7758[i_96_])]);
						int i_103_ = (((i * ((Class1) class1).anInt13 + i_91_ * ((Class1) class1).anInt12 + i_92_ * ((Class1) class1).anInt14) / ((Class1) class1).anInt15) >> 16);
						int i_104_ = i_103_ > 256 ? i_94_ : i_95_;
						int i_105_ = (i_93_ >> 1) + (i_104_ * i_103_ >> 17);
						((Class387_Sub1) this).anIntArray7763[i_96_] = i_105_ << 17 | Class195.method1873(i_102_, i_105_, -952106382);
						if (((Class387_Sub1) this).aClass1Array7786 != null && (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7759[i_96_])]) != null)
							class1 = (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7759[i_96_])]);
						else
							class1 = (((Class387_Sub1) this).aClass1Array7755[(((Class387_Sub1) this).aShortArray7759[i_96_])]);
						i_103_ = ((i * ((Class1) class1).anInt13 + i_91_ * ((Class1) class1).anInt12 + i_92_ * ((Class1) class1).anInt14) / ((Class1) class1).anInt15) >> 16;
						i_104_ = i_103_ > 256 ? i_94_ : i_95_;
						i_105_ = (i_93_ >> 1) + (i_104_ * i_103_ >> 17);
						((Class387_Sub1) this).anIntArray7764[i_96_] = i_105_ << 17 | Class195.method1873(i_102_, i_105_, -952106382);
						if (((Class387_Sub1) this).aClass1Array7786 != null && (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7760[i_96_])]) != null)
							class1 = (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7760[i_96_])]);
						else
							class1 = (((Class387_Sub1) this).aClass1Array7755[(((Class387_Sub1) this).aShortArray7760[i_96_])]);
						i_103_ = ((i * ((Class1) class1).anInt13 + i_91_ * ((Class1) class1).anInt12 + i_92_ * ((Class1) class1).anInt14) / ((Class1) class1).anInt15) >> 16;
						i_104_ = i_103_ > 256 ? i_94_ : i_95_;
						i_105_ = (i_93_ >> 1) + (i_104_ * i_103_ >> 17);
						((Class387_Sub1) this).anIntArray7801[i_96_] = i_105_ << 17 | Class195.method1873(i_102_, i_105_, -952106382);
					} else if (i_97_ == 1) {
						int i_106_ = (((Class387_Sub1) this).aShortArray7775[i_96_] & 0xffff);
						int i_107_ = (((i_106_ & 0x7f) * ((Class387_Sub1) this).anInt7747) >> 7);
						short i_108_ = Class173.method1823(i_106_ & ~0x7f | i_107_, (byte) 0);
						Class5 class5 = ((Class387_Sub1) this).aClass5Array7740[i_96_];
						int i_109_ = ((i * ((Class5) class5).anInt78 + i_91_ * ((Class5) class5).anInt79 + i_92_ * ((Class5) class5).anInt80) >> 16);
						int i_110_ = i_109_ > 256 ? i_94_ : i_95_;
						int i_111_ = (i_93_ >> 1) + (i_110_ * i_109_ >> 17);
						((Class387_Sub1) this).anIntArray7763[i_96_] = i_111_ << 17 | Class195.method1873(i_108_, i_111_, -952106382);
						((Class387_Sub1) this).anIntArray7801[i_96_] = -1;
					} else if (i_97_ == 3) {
						((Class387_Sub1) this).anIntArray7763[i_96_] = 128;
						((Class387_Sub1) this).anIntArray7801[i_96_] = -1;
					} else
						((Class387_Sub1) this).anIntArray7801[i_96_] = -2;
				} else {
					int i_112_ = (((Class387_Sub1) this).aShortArray7775[i_96_] & 0xffff);
					if (i_97_ == 0) {
						Class1 class1;
						if (((Class387_Sub1) this).aClass1Array7786 != null && (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7758[i_96_])]) != null)
							class1 = (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7758[i_96_])]);
						else
							class1 = (((Class387_Sub1) this).aClass1Array7755[(((Class387_Sub1) this).aShortArray7758[i_96_])]);
						int i_113_ = (((i * ((Class1) class1).anInt13 + i_91_ * ((Class1) class1).anInt12 + i_92_ * ((Class1) class1).anInt14) / ((Class1) class1).anInt15) >> 16);
						int i_114_ = i_113_ > 256 ? i_94_ : i_95_;
						int i_115_ = method4794((i_93_ >> 2) + (i_114_ * i_113_ >> 18));
						((Class387_Sub1) this).anIntArray7763[i_96_] = i_115_ << 24 | method4791(i_112_, i_99_, i_115_);
						if (((Class387_Sub1) this).aClass1Array7786 != null && (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7759[i_96_])]) != null)
							class1 = (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7759[i_96_])]);
						else
							class1 = (((Class387_Sub1) this).aClass1Array7755[(((Class387_Sub1) this).aShortArray7759[i_96_])]);
						i_113_ = ((i * ((Class1) class1).anInt13 + i_91_ * ((Class1) class1).anInt12 + i_92_ * ((Class1) class1).anInt14) / ((Class1) class1).anInt15) >> 16;
						i_114_ = i_113_ > 256 ? i_94_ : i_95_;
						i_115_ = method4794((i_93_ >> 2) + (i_114_ * i_113_ >> 18));
						((Class387_Sub1) this).anIntArray7764[i_96_] = i_115_ << 24 | method4791(i_112_, i_99_, i_115_);
						if (((Class387_Sub1) this).aClass1Array7786 != null && (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7760[i_96_])]) != null)
							class1 = (((Class387_Sub1) this).aClass1Array7786[(((Class387_Sub1) this).aShortArray7760[i_96_])]);
						else
							class1 = (((Class387_Sub1) this).aClass1Array7755[(((Class387_Sub1) this).aShortArray7760[i_96_])]);
						i_113_ = ((i * ((Class1) class1).anInt13 + i_91_ * ((Class1) class1).anInt12 + i_92_ * ((Class1) class1).anInt14) / ((Class1) class1).anInt15) >> 16;
						i_114_ = i_113_ > 256 ? i_94_ : i_95_;
						i_115_ = method4794((i_93_ >> 2) + (i_114_ * i_113_ >> 18));
						((Class387_Sub1) this).anIntArray7801[i_96_] = i_115_ << 24 | method4791(i_112_, i_99_, i_115_);
					} else if (i_97_ == 1) {
						Class5 class5 = ((Class387_Sub1) this).aClass5Array7740[i_96_];
						int i_116_ = ((i * ((Class5) class5).anInt78 + i_91_ * ((Class5) class5).anInt79 + i_92_ * ((Class5) class5).anInt80) >> 16);
						int i_117_ = i_116_ > 256 ? i_94_ : i_95_;
						int i_118_ = method4794((i_93_ >> 2) + (i_117_ * i_116_ >> 18));
						((Class387_Sub1) this).anIntArray7763[i_96_] = i_118_ << 24 | method4791(i_112_, i_99_, i_118_);
						((Class387_Sub1) this).anIntArray7801[i_96_] = -1;
					} else
						((Class387_Sub1) this).anIntArray7801[i_96_] = -2;
				}
			}
			((Class387_Sub1) this).aClass1Array7755 = null;
			((Class387_Sub1) this).aClass1Array7786 = null;
			((Class387_Sub1) this).aClass5Array7740 = null;
			if ((((Class387_Sub1) this).anInt7746 & 0x97098) == 0 && ((Class387_Sub1) this).aFloatArrayArray7738 == null)
				((Class387_Sub1) this).aShortArray7775 = null;
			if (bool)
				((Class387_Sub1) this).aByteArray7771 = null;
			((Class387_Sub1) this).anInt7812 = 2;
		}
	}

	int method4791(int i, short i_119_, int i_120_) {
		int i_121_ = Class294.anIntArray3165[method4795(i, i_120_)];
		Class53 class53 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.anInterface_ma5299.method174(i_119_ & 0xffff, 978917350);
		int i_122_ = class53.aByte533 & 0xff;
		if (i_122_ != 0) {
			int i_123_ = 131586 * i_120_;
			if (i_122_ == 256)
				i_121_ = i_123_;
			else {
				int i_124_ = i_122_;
				int i_125_ = 256 - i_122_;
				i_121_ = ((((i_123_ & 0xff00ff) * i_124_ + (i_121_ & 0xff00ff) * i_125_) & ~0xff00ff) + (((i_123_ & 0xff00) * i_124_ + (i_121_ & 0xff00) * i_125_) & 0xff0000)) >> 8;
			}
		}
		int i_126_ = class53.aByte534 & 0xff;
		if (i_126_ != 0) {
			i_126_ += 256;
			int i_127_ = ((i_121_ & 0xff0000) >> 16) * i_126_;
			if (i_127_ > 65535)
				i_127_ = 65535;
			int i_128_ = ((i_121_ & 0xff00) >> 8) * i_126_;
			if (i_128_ > 65535)
				i_128_ = 65535;
			int i_129_ = (i_121_ & 0xff) * i_126_;
			if (i_129_ > 65535)
				i_129_ = 65535;
			i_121_ = (i_127_ << 8 & 0xff0000) + (i_128_ & 0xff00) + (i_129_ >> 8);
		}
		return i_121_;
	}

	public Class85[] method4772() {
		return ((Class387_Sub1) this).aClass85Array7750;
	}

	public Class68[] method4773() {
		return ((Class387_Sub1) this).aClass68Array7754;
	}

	void method4792() {
		if (((Class387_Sub1) this).anInt7812 == 0)
			method4810(false);
		else {
			do {
				if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999 * -922307687) > 1) {
					synchronized (this) {
						method4804();
						break;
					}
				}
				method4804();
			} while (false);
		}
	}

	public void method4745(Class387 class387, int i, int i_130_, int i_131_, boolean bool) {
		Class387_Sub1 class387_sub1_132_ = (Class387_Sub1) class387;
		if ((((Class387_Sub1) this).anInt7746 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((((Class387_Sub1) class387_sub1_132_).anInt7746 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		method4807();
		method4814();
		class387_sub1_132_.method4807();
		class387_sub1_132_.method4814();
		anInt7805++;
		int i_133_ = 0;
		int[] is = ((Class387_Sub1) class387_sub1_132_).anIntArray7751;
		int i_134_ = ((Class387_Sub1) class387_sub1_132_).anInt7742;
		for (int i_135_ = 0; i_135_ < ((Class387_Sub1) this).anInt7742; i_135_++) {
			Class1 class1 = ((Class387_Sub1) this).aClass1Array7755[i_135_];
			if (((Class1) class1).anInt15 != 0) {
				int i_136_ = ((Class387_Sub1) this).anIntArray7752[i_135_] - i_130_;
				if (i_136_ >= ((Class387_Sub1) class387_sub1_132_).aShort7770 && (i_136_ <= ((Class387_Sub1) class387_sub1_132_).aShort7796)) {
					int i_137_ = ((Class387_Sub1) this).anIntArray7751[i_135_] - i;
					if ((i_137_ >= ((Class387_Sub1) class387_sub1_132_).aShort7797) && i_137_ <= (((Class387_Sub1) class387_sub1_132_).aShort7743)) {
						int i_138_ = (((Class387_Sub1) this).anIntArray7753[i_135_] - i_131_);
						if (i_138_ >= (((Class387_Sub1) class387_sub1_132_).aShort7795) && i_138_ <= (((Class387_Sub1) class387_sub1_132_).aShort7800)) {
							for (int i_139_ = 0; i_139_ < i_134_; i_139_++) {
								Class1 class1_140_ = (((Class387_Sub1) class387_sub1_132_).aClass1Array7755[i_139_]);
								if (i_137_ == is[i_139_] && i_138_ == (((Class387_Sub1) class387_sub1_132_).anIntArray7753[i_139_]) && i_136_ == (((Class387_Sub1) class387_sub1_132_).anIntArray7752[i_139_]) && ((Class1) class1_140_).anInt15 != 0) {
									if (((Class387_Sub1) this).aClass1Array7786 == null)
										((Class387_Sub1) this).aClass1Array7786 = new Class1[((Class387_Sub1) this).anInt7742];
									if ((((Class387_Sub1) class387_sub1_132_).aClass1Array7786) == null)
										((Class387_Sub1) class387_sub1_132_).aClass1Array7786 = new Class1[i_134_];
									Class1 class1_141_ = (((Class387_Sub1) this).aClass1Array7786[i_135_]);
									if (class1_141_ == null)
										class1_141_ = ((Class387_Sub1) this).aClass1Array7786[i_135_] = new Class1(class1);
									Class1 class1_142_ = (((Class387_Sub1) class387_sub1_132_).aClass1Array7786[i_139_]);
									if (class1_142_ == null)
										class1_142_ = ((Class387_Sub1) class387_sub1_132_).aClass1Array7786[i_139_] = new Class1(class1_140_);
									((Class1) class1_141_).anInt13 += ((Class1) class1_140_).anInt13;
									((Class1) class1_141_).anInt12 += ((Class1) class1_140_).anInt12;
									((Class1) class1_141_).anInt14 += ((Class1) class1_140_).anInt14;
									((Class1) class1_141_).anInt15 += ((Class1) class1_140_).anInt15;
									((Class1) class1_142_).anInt13 += ((Class1) class1).anInt13;
									((Class1) class1_142_).anInt12 += ((Class1) class1).anInt12;
									((Class1) class1_142_).anInt14 += ((Class1) class1).anInt14;
									((Class1) class1_142_).anInt15 += ((Class1) class1).anInt15;
									i_133_++;
									((Class387_Sub1) this).anIntArray7793[i_135_] = anInt7805;
									((Class387_Sub1) this).anIntArray7813[i_139_] = anInt7805;
								}
							}
						}
					}
				}
			}
		}
		if (i_133_ >= 3 && bool) {
			for (int i_143_ = 0; i_143_ < ((Class387_Sub1) this).anInt7757; i_143_++) {
				if (((((Class387_Sub1) this).anIntArray7793[((Class387_Sub1) this).aShortArray7758[i_143_]]) == anInt7805) && ((((Class387_Sub1) this).anIntArray7793[((Class387_Sub1) this).aShortArray7759[i_143_]]) == anInt7805) && ((((Class387_Sub1) this).anIntArray7793[((Class387_Sub1) this).aShortArray7760[i_143_]]) == anInt7805)) {
					if (((Class387_Sub1) this).aByteArray7771 == null)
						((Class387_Sub1) this).aByteArray7771 = new byte[((Class387_Sub1) this).anInt7757];
					((Class387_Sub1) this).aByteArray7771[i_143_] = (byte) 2;
				}
			}
			for (int i_144_ = 0; i_144_ < ((Class387_Sub1) class387_sub1_132_).anInt7757; i_144_++) {
				if ((((Class387_Sub1) this).anIntArray7813[(((Class387_Sub1) class387_sub1_132_).aShortArray7758[i_144_])]) == anInt7805 && (((Class387_Sub1) this).anIntArray7813[(((Class387_Sub1) class387_sub1_132_).aShortArray7759[i_144_])]) == anInt7805 && (((Class387_Sub1) this).anIntArray7813[(((Class387_Sub1) class387_sub1_132_).aShortArray7760[i_144_])]) == anInt7805) {
					if (((Class387_Sub1) class387_sub1_132_).aByteArray7771 == null)
						((Class387_Sub1) class387_sub1_132_).aByteArray7771 = new byte[(((Class387_Sub1) class387_sub1_132_).anInt7757)];
					((Class387_Sub1) class387_sub1_132_).aByteArray7771[i_144_] = (byte) 2;
				}
			}
		}
	}

	public Class387 method4755(byte i, int i_145_, boolean bool) {
		method4815(Thread.currentThread());
		boolean bool_146_ = false;
		Class387_Sub1 class387_sub1_147_;
		Class387_Sub1 class387_sub1_148_;
		if (i > 0 && i <= 7) {
			class387_sub1_148_ = ((Class387_Sub1) this).aClass387_Sub1Array7804[i - 1];
			class387_sub1_147_ = ((Class387_Sub1) this).aClass387_Sub1Array7815[i - 1];
			bool_146_ = true;
		} else
			class387_sub1_147_ = class387_sub1_148_ = new Class387_Sub1(((Class387_Sub1) this).aClass_ra_Sub1_7769);
		return method4793(class387_sub1_147_, class387_sub1_148_, i_145_, bool_146_, bool);
	}

	Class387 method4793(Class387_Sub1 class387_sub1_149_, Class387_Sub1 class387_sub1_150_, int i, boolean bool, boolean bool_151_) {
		((Class387_Sub1) class387_sub1_149_).aBoolean7792 = ((Class387_Sub1) this).aBoolean7792;
		if (((Class387_Sub1) this).aBoolean7792) {
			((Class387_Sub1) class387_sub1_149_).aShort7743 = ((Class387_Sub1) this).aShort7743;
			((Class387_Sub1) class387_sub1_149_).aShort7796 = ((Class387_Sub1) this).aShort7796;
			((Class387_Sub1) class387_sub1_149_).aShort7800 = ((Class387_Sub1) this).aShort7800;
			((Class387_Sub1) class387_sub1_149_).aShort7797 = ((Class387_Sub1) this).aShort7797;
			((Class387_Sub1) class387_sub1_149_).aShort7770 = ((Class387_Sub1) this).aShort7770;
			((Class387_Sub1) class387_sub1_149_).aShort7795 = ((Class387_Sub1) this).aShort7795;
			((Class387_Sub1) class387_sub1_149_).aShort7739 = ((Class387_Sub1) this).aShort7739;
			((Class387_Sub1) class387_sub1_149_).aShort7794 = ((Class387_Sub1) this).aShort7794;
		}
		((Class387_Sub1) class387_sub1_149_).anInt7747 = ((Class387_Sub1) this).anInt7747;
		((Class387_Sub1) class387_sub1_149_).anInt7748 = ((Class387_Sub1) this).anInt7748;
		((Class387_Sub1) class387_sub1_149_).anInt7799 = ((Class387_Sub1) this).anInt7799;
		((Class387_Sub1) class387_sub1_149_).anInt7742 = ((Class387_Sub1) this).anInt7742;
		((Class387_Sub1) class387_sub1_149_).anInt7757 = ((Class387_Sub1) this).anInt7757;
		((Class387_Sub1) class387_sub1_149_).anInt7788 = ((Class387_Sub1) this).anInt7788;
		if ((i & 0x100) != 0)
			((Class387_Sub1) class387_sub1_149_).aBoolean7756 = true;
		else
			((Class387_Sub1) class387_sub1_149_).aBoolean7756 = ((Class387_Sub1) this).aBoolean7756;
		((Class387_Sub1) class387_sub1_149_).aBoolean7777 = ((Class387_Sub1) this).aBoolean7777;
		boolean bool_152_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_153_ = bool_152_ || (i & 0x1) != 0;
		boolean bool_154_ = bool_152_ || (i & 0x2) != 0;
		boolean bool_155_ = bool_152_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_153_ || bool_154_ || bool_155_) {
			if (bool_153_) {
				if (((Class387_Sub1) class387_sub1_150_).anIntArray7751 == null || ((((Class387_Sub1) class387_sub1_150_).anIntArray7751).length < ((Class387_Sub1) this).anInt7799))
					((Class387_Sub1) class387_sub1_149_).anIntArray7751 = ((Class387_Sub1) class387_sub1_150_).anIntArray7751 = new int[((Class387_Sub1) this).anInt7799];
				else
					((Class387_Sub1) class387_sub1_149_).anIntArray7751 = ((Class387_Sub1) class387_sub1_150_).anIntArray7751;
				for (int i_156_ = 0; i_156_ < ((Class387_Sub1) this).anInt7799; i_156_++)
					((Class387_Sub1) class387_sub1_149_).anIntArray7751[i_156_] = ((Class387_Sub1) this).anIntArray7751[i_156_];
			} else
				((Class387_Sub1) class387_sub1_149_).anIntArray7751 = ((Class387_Sub1) this).anIntArray7751;
			if (bool_154_) {
				if (((Class387_Sub1) class387_sub1_150_).anIntArray7752 == null || ((((Class387_Sub1) class387_sub1_150_).anIntArray7752).length < ((Class387_Sub1) this).anInt7799))
					((Class387_Sub1) class387_sub1_149_).anIntArray7752 = ((Class387_Sub1) class387_sub1_150_).anIntArray7752 = new int[((Class387_Sub1) this).anInt7799];
				else
					((Class387_Sub1) class387_sub1_149_).anIntArray7752 = ((Class387_Sub1) class387_sub1_150_).anIntArray7752;
				for (int i_157_ = 0; i_157_ < ((Class387_Sub1) this).anInt7799; i_157_++)
					((Class387_Sub1) class387_sub1_149_).anIntArray7752[i_157_] = ((Class387_Sub1) this).anIntArray7752[i_157_];
			} else
				((Class387_Sub1) class387_sub1_149_).anIntArray7752 = ((Class387_Sub1) this).anIntArray7752;
			if (bool_155_) {
				if (((Class387_Sub1) class387_sub1_150_).anIntArray7753 == null || ((((Class387_Sub1) class387_sub1_150_).anIntArray7753).length < ((Class387_Sub1) this).anInt7799))
					((Class387_Sub1) class387_sub1_149_).anIntArray7753 = ((Class387_Sub1) class387_sub1_150_).anIntArray7753 = new int[((Class387_Sub1) this).anInt7799];
				else
					((Class387_Sub1) class387_sub1_149_).anIntArray7753 = ((Class387_Sub1) class387_sub1_150_).anIntArray7753;
				for (int i_158_ = 0; i_158_ < ((Class387_Sub1) this).anInt7799; i_158_++)
					((Class387_Sub1) class387_sub1_149_).anIntArray7753[i_158_] = ((Class387_Sub1) this).anIntArray7753[i_158_];
			} else
				((Class387_Sub1) class387_sub1_149_).anIntArray7753 = ((Class387_Sub1) this).anIntArray7753;
		} else {
			((Class387_Sub1) class387_sub1_149_).anIntArray7751 = ((Class387_Sub1) this).anIntArray7751;
			((Class387_Sub1) class387_sub1_149_).anIntArray7752 = ((Class387_Sub1) this).anIntArray7752;
			((Class387_Sub1) class387_sub1_149_).anIntArray7753 = ((Class387_Sub1) this).anIntArray7753;
		}
		if ((i & 0x84080) != 0) {
			if (((Class387_Sub1) class387_sub1_150_).aShortArray7775 == null || (((Class387_Sub1) class387_sub1_150_).aShortArray7775.length < ((Class387_Sub1) this).anInt7757)) {
				int i_159_ = ((Class387_Sub1) this).anInt7757;
				((Class387_Sub1) class387_sub1_149_).aShortArray7775 = ((Class387_Sub1) class387_sub1_150_).aShortArray7775 = new short[i_159_];
			} else
				((Class387_Sub1) class387_sub1_149_).aShortArray7775 = ((Class387_Sub1) class387_sub1_150_).aShortArray7775;
			for (int i_160_ = 0; i_160_ < ((Class387_Sub1) this).anInt7757; i_160_++)
				((Class387_Sub1) class387_sub1_149_).aShortArray7775[i_160_] = ((Class387_Sub1) this).aShortArray7775[i_160_];
		} else
			((Class387_Sub1) class387_sub1_149_).aShortArray7775 = ((Class387_Sub1) this).aShortArray7775;
		if ((i & 0x97018) != 0) {
			((Class387_Sub1) class387_sub1_149_).anInt7812 = 0;
			Class387_Sub1 class387_sub1_161_ = class387_sub1_149_;
			Class387_Sub1 class387_sub1_162_ = class387_sub1_149_;
			((Class387_Sub1) class387_sub1_149_).anIntArray7801 = null;
			((Class387_Sub1) class387_sub1_162_).anIntArray7764 = null;
			((Class387_Sub1) class387_sub1_161_).anIntArray7763 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_151_)
				method4810(false);
			if (((Class387_Sub1) this).anIntArray7763 != null) {
				if (((Class387_Sub1) class387_sub1_150_).anIntArray7763 == null || ((((Class387_Sub1) class387_sub1_150_).anIntArray7763).length < ((Class387_Sub1) this).anInt7757)) {
					int i_163_ = ((Class387_Sub1) this).anInt7757;
					((Class387_Sub1) class387_sub1_149_).anIntArray7763 = ((Class387_Sub1) class387_sub1_150_).anIntArray7763 = new int[i_163_];
					((Class387_Sub1) class387_sub1_149_).anIntArray7764 = ((Class387_Sub1) class387_sub1_150_).anIntArray7764 = new int[i_163_];
					((Class387_Sub1) class387_sub1_149_).anIntArray7801 = ((Class387_Sub1) class387_sub1_150_).anIntArray7801 = new int[i_163_];
				} else {
					((Class387_Sub1) class387_sub1_149_).anIntArray7763 = ((Class387_Sub1) class387_sub1_150_).anIntArray7763;
					((Class387_Sub1) class387_sub1_149_).anIntArray7764 = ((Class387_Sub1) class387_sub1_150_).anIntArray7764;
					((Class387_Sub1) class387_sub1_149_).anIntArray7801 = ((Class387_Sub1) class387_sub1_150_).anIntArray7801;
				}
				for (int i_164_ = 0; i_164_ < ((Class387_Sub1) this).anInt7757; i_164_++) {
					((Class387_Sub1) class387_sub1_149_).anIntArray7763[i_164_] = ((Class387_Sub1) this).anIntArray7763[i_164_];
					((Class387_Sub1) class387_sub1_149_).anIntArray7764[i_164_] = ((Class387_Sub1) this).anIntArray7764[i_164_];
					((Class387_Sub1) class387_sub1_149_).anIntArray7801[i_164_] = ((Class387_Sub1) this).anIntArray7801[i_164_];
				}
			}
			((Class387_Sub1) class387_sub1_149_).anInt7812 = ((Class387_Sub1) this).anInt7812;
		} else {
			if (bool_151_)
				method4810(false);
			((Class387_Sub1) class387_sub1_149_).anIntArray7763 = ((Class387_Sub1) this).anIntArray7763;
			((Class387_Sub1) class387_sub1_149_).anIntArray7764 = ((Class387_Sub1) this).anIntArray7764;
			((Class387_Sub1) class387_sub1_149_).anIntArray7801 = ((Class387_Sub1) this).anIntArray7801;
			((Class387_Sub1) class387_sub1_149_).anInt7812 = ((Class387_Sub1) this).anInt7812;
		}
		if ((i & 0x100) != 0) {
			if (((Class387_Sub1) class387_sub1_150_).aByteArray7773 == null || (((Class387_Sub1) class387_sub1_150_).aByteArray7773.length < ((Class387_Sub1) this).anInt7757)) {
				int i_165_ = ((Class387_Sub1) this).anInt7757;
				((Class387_Sub1) class387_sub1_149_).aByteArray7773 = ((Class387_Sub1) class387_sub1_150_).aByteArray7773 = new byte[i_165_];
			} else
				((Class387_Sub1) class387_sub1_149_).aByteArray7773 = ((Class387_Sub1) class387_sub1_150_).aByteArray7773;
			if (((Class387_Sub1) this).aByteArray7773 != null) {
				for (int i_166_ = 0; i_166_ < ((Class387_Sub1) this).anInt7757; i_166_++)
					((Class387_Sub1) class387_sub1_149_).aByteArray7773[i_166_] = ((Class387_Sub1) this).aByteArray7773[i_166_];
			} else {
				for (int i_167_ = 0; i_167_ < ((Class387_Sub1) this).anInt7757; i_167_++)
					((Class387_Sub1) class387_sub1_149_).aByteArray7773[i_167_] = (byte) 0;
			}
		} else
			((Class387_Sub1) class387_sub1_149_).aByteArray7773 = ((Class387_Sub1) this).aByteArray7773;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (((Class387_Sub1) class387_sub1_150_).aClass1Array7755 == null || ((((Class387_Sub1) class387_sub1_150_).aClass1Array7755).length < ((Class387_Sub1) this).anInt7742)) {
				int i_168_ = ((Class387_Sub1) this).anInt7742;
				((Class387_Sub1) class387_sub1_149_).aClass1Array7755 = ((Class387_Sub1) class387_sub1_150_).aClass1Array7755 = new Class1[i_168_];
			} else
				((Class387_Sub1) class387_sub1_149_).aClass1Array7755 = ((Class387_Sub1) class387_sub1_150_).aClass1Array7755;
			if (((Class387_Sub1) this).aClass1Array7755 != null) {
				for (int i_169_ = 0; i_169_ < ((Class387_Sub1) this).anInt7742; i_169_++)
					((Class387_Sub1) class387_sub1_149_).aClass1Array7755[i_169_] = new Class1(((Class387_Sub1) this).aClass1Array7755[i_169_]);
			} else
				((Class387_Sub1) class387_sub1_149_).aClass1Array7755 = null;
			if (((Class387_Sub1) this).aClass5Array7740 != null) {
				if ((((Class387_Sub1) class387_sub1_150_).aClass5Array7740 == null) || ((((Class387_Sub1) class387_sub1_150_).aClass5Array7740).length < ((Class387_Sub1) this).anInt7757)) {
					int i_170_ = ((Class387_Sub1) this).anInt7757;
					((Class387_Sub1) class387_sub1_149_).aClass5Array7740 = ((Class387_Sub1) class387_sub1_150_).aClass5Array7740 = new Class5[i_170_];
				} else
					((Class387_Sub1) class387_sub1_149_).aClass5Array7740 = (((Class387_Sub1) class387_sub1_150_).aClass5Array7740);
				for (int i_171_ = 0; i_171_ < ((Class387_Sub1) this).anInt7757; i_171_++)
					((Class387_Sub1) class387_sub1_149_).aClass5Array7740[i_171_] = ((((Class387_Sub1) this).aClass5Array7740[i_171_] != null) ? new Class5(((Class387_Sub1) this).aClass5Array7740[i_171_]) : null);
			} else
				((Class387_Sub1) class387_sub1_149_).aClass5Array7740 = null;
		} else {
			if (bool_151_)
				method4814();
			((Class387_Sub1) class387_sub1_149_).aClass1Array7755 = ((Class387_Sub1) this).aClass1Array7755;
			((Class387_Sub1) class387_sub1_149_).aClass5Array7740 = ((Class387_Sub1) this).aClass5Array7740;
		}
		if ((i & 0x8000) != 0) {
			if (((Class387_Sub1) this).aShortArray7774 == null)
				((Class387_Sub1) class387_sub1_149_).aShortArray7774 = null;
			else {
				if ((((Class387_Sub1) class387_sub1_150_).aShortArray7774 == null) || ((((Class387_Sub1) class387_sub1_150_).aShortArray7774).length < ((Class387_Sub1) this).anInt7757)) {
					int i_172_ = ((Class387_Sub1) this).anInt7757;
					((Class387_Sub1) class387_sub1_149_).aShortArray7774 = ((Class387_Sub1) class387_sub1_150_).aShortArray7774 = new short[i_172_];
				} else
					((Class387_Sub1) class387_sub1_149_).aShortArray7774 = ((Class387_Sub1) class387_sub1_150_).aShortArray7774;
				for (int i_173_ = 0; i_173_ < ((Class387_Sub1) this).anInt7757; i_173_++)
					((Class387_Sub1) class387_sub1_149_).aShortArray7774[i_173_] = ((Class387_Sub1) this).aShortArray7774[i_173_];
			}
		} else
			((Class387_Sub1) class387_sub1_149_).aShortArray7774 = ((Class387_Sub1) this).aShortArray7774;
		if ((i & 0x10000) != 0) {
			if (((Class387_Sub1) this).aByteArray7771 == null)
				((Class387_Sub1) class387_sub1_149_).aByteArray7771 = null;
			else {
				if (((Class387_Sub1) class387_sub1_150_).aByteArray7771 == null || ((((Class387_Sub1) class387_sub1_150_).aByteArray7771).length < ((Class387_Sub1) this).anInt7757)) {
					int i_174_ = (bool ? ((Class387_Sub1) this).anInt7757 + 100 : ((Class387_Sub1) this).anInt7757);
					((Class387_Sub1) class387_sub1_149_).aByteArray7771 = ((Class387_Sub1) class387_sub1_150_).aByteArray7771 = new byte[i_174_];
				} else
					((Class387_Sub1) class387_sub1_149_).aByteArray7771 = ((Class387_Sub1) class387_sub1_150_).aByteArray7771;
				for (int i_175_ = 0; i_175_ < ((Class387_Sub1) this).anInt7757; i_175_++)
					((Class387_Sub1) class387_sub1_149_).aByteArray7771[i_175_] = ((Class387_Sub1) this).aByteArray7771[i_175_];
			}
		} else
			((Class387_Sub1) class387_sub1_149_).aByteArray7771 = ((Class387_Sub1) this).aByteArray7771;
		if ((i & 0xc580) != 0) {
			if (((Class387_Sub1) class387_sub1_150_).aClass18Array7790 == null || ((((Class387_Sub1) class387_sub1_150_).aClass18Array7790).length < ((Class387_Sub1) this).anInt7788)) {
				int i_176_ = ((Class387_Sub1) this).anInt7788;
				((Class387_Sub1) class387_sub1_149_).aClass18Array7790 = ((Class387_Sub1) class387_sub1_150_).aClass18Array7790 = new Class18[i_176_];
				for (int i_177_ = 0; i_177_ < ((Class387_Sub1) this).anInt7788; i_177_++)
					((Class387_Sub1) class387_sub1_149_).aClass18Array7790[i_177_] = ((Class387_Sub1) this).aClass18Array7790[i_177_].method355(-1999450159);
			} else {
				((Class387_Sub1) class387_sub1_149_).aClass18Array7790 = ((Class387_Sub1) class387_sub1_150_).aClass18Array7790;
				for (int i_178_ = 0; i_178_ < ((Class387_Sub1) this).anInt7788; i_178_++)
					((Class387_Sub1) class387_sub1_149_).aClass18Array7790[i_178_].method356(((Class387_Sub1) this).aClass18Array7790[i_178_], 1628993725);
			}
		} else
			((Class387_Sub1) class387_sub1_149_).aClass18Array7790 = ((Class387_Sub1) this).aClass18Array7790;
		if (((Class387_Sub1) this).aFloatArrayArray7738 != null && (i & 0x10) != 0) {
			if ((((Class387_Sub1) class387_sub1_150_).aFloatArrayArray7738 == null) || ((((Class387_Sub1) class387_sub1_150_).aFloatArrayArray7738).length < ((Class387_Sub1) this).anInt7757)) {
				int i_179_ = (bool ? ((Class387_Sub1) this).anInt7757 + 100 : ((Class387_Sub1) this).anInt7757);
				((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7738 = ((Class387_Sub1) class387_sub1_150_).aFloatArrayArray7738 = new float[i_179_][3];
			} else
				((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7738 = (((Class387_Sub1) class387_sub1_150_).aFloatArrayArray7738);
			for (int i_180_ = 0; i_180_ < ((Class387_Sub1) this).anInt7757; i_180_++) {
				if (((Class387_Sub1) this).aFloatArrayArray7738[i_180_] != null) {
					((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7738[i_180_][0] = (((Class387_Sub1) this).aFloatArrayArray7738[i_180_][0]);
					((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7738[i_180_][1] = (((Class387_Sub1) this).aFloatArrayArray7738[i_180_][1]);
					((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7738[i_180_][2] = (((Class387_Sub1) this).aFloatArrayArray7738[i_180_][2]);
				}
			}
			if ((((Class387_Sub1) class387_sub1_150_).aFloatArrayArray7762 == null) || ((((Class387_Sub1) class387_sub1_150_).aFloatArrayArray7762).length < ((Class387_Sub1) this).anInt7757)) {
				int i_181_ = (bool ? ((Class387_Sub1) this).anInt7757 + 100 : ((Class387_Sub1) this).anInt7757);
				((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7762 = ((Class387_Sub1) class387_sub1_150_).aFloatArrayArray7762 = new float[i_181_][3];
			} else
				((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7762 = (((Class387_Sub1) class387_sub1_150_).aFloatArrayArray7762);
			for (int i_182_ = 0; i_182_ < ((Class387_Sub1) this).anInt7757; i_182_++) {
				if (((Class387_Sub1) this).aFloatArrayArray7762[i_182_] != null) {
					((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7762[i_182_][0] = (((Class387_Sub1) this).aFloatArrayArray7762[i_182_][0]);
					((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7762[i_182_][1] = (((Class387_Sub1) this).aFloatArrayArray7762[i_182_][1]);
					((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7762[i_182_][2] = (((Class387_Sub1) this).aFloatArrayArray7762[i_182_][2]);
				}
			}
		} else {
			((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7738 = ((Class387_Sub1) this).aFloatArrayArray7738;
			((Class387_Sub1) class387_sub1_149_).aFloatArrayArray7762 = ((Class387_Sub1) this).aFloatArrayArray7762;
		}
		((Class387_Sub1) class387_sub1_149_).anIntArrayArray7778 = ((Class387_Sub1) this).anIntArrayArray7778;
		((Class387_Sub1) class387_sub1_149_).anIntArrayArray7779 = ((Class387_Sub1) this).anIntArrayArray7779;
		((Class387_Sub1) class387_sub1_149_).anIntArrayArray7791 = ((Class387_Sub1) this).anIntArrayArray7791;
		((Class387_Sub1) class387_sub1_149_).aShortArray7816 = ((Class387_Sub1) this).aShortArray7816;
		((Class387_Sub1) class387_sub1_149_).aShortArray7776 = ((Class387_Sub1) this).aShortArray7776;
		((Class387_Sub1) class387_sub1_149_).aByteArray7772 = ((Class387_Sub1) this).aByteArray7772;
		((Class387_Sub1) class387_sub1_149_).aShortArray7758 = ((Class387_Sub1) this).aShortArray7758;
		((Class387_Sub1) class387_sub1_149_).aShortArray7759 = ((Class387_Sub1) this).aShortArray7759;
		((Class387_Sub1) class387_sub1_149_).aShortArray7760 = ((Class387_Sub1) this).aShortArray7760;
		((Class387_Sub1) class387_sub1_149_).aClass85Array7750 = ((Class387_Sub1) this).aClass85Array7750;
		((Class387_Sub1) class387_sub1_149_).aClass68Array7754 = ((Class387_Sub1) this).aClass68Array7754;
		((Class387_Sub1) class387_sub1_149_).aClass16Array7789 = ((Class387_Sub1) this).aClass16Array7789;
		((Class387_Sub1) class387_sub1_149_).aShortArray7803 = ((Class387_Sub1) this).aShortArray7803;
		((Class387_Sub1) class387_sub1_149_).anInt7746 = i;
		return class387_sub1_149_;
	}

	public void bp(int i, int i_183_, Class_xa class_xa, Class_xa class_xa_184_, int i_185_, int i_186_, int i_187_) {
		if (i == 3) {
			if ((((Class387_Sub1) this).anInt7746 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		int i_188_ = i_185_ + ((Class387_Sub1) this).aShort7797;
		int i_189_ = i_185_ + ((Class387_Sub1) this).aShort7743;
		int i_190_ = i_187_ + ((Class387_Sub1) this).aShort7795;
		int i_191_ = i_187_ + ((Class387_Sub1) this).aShort7800;
		if (i == 4 || (i_188_ >= 0 && ((i_189_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_190_ >= 0 && ((i_191_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			int[][] is = class_xa.anIntArrayArray6290;
			int[][] is_192_ = null;
			if (class_xa_184_ != null)
				is_192_ = class_xa_184_.anIntArrayArray6290;
			if (i == 4 || i == 5) {
				if (class_xa_184_ == null || (i_188_ < 0 || ((i_189_ + class_xa_184_.anInt6288 * -1212653763 >> class_xa_184_.anInt6289 * -2137349879) >= class_xa_184_.anInt6287 * -506105871) || i_190_ < 0 || ((i_191_ + class_xa_184_.anInt6288 * -1212653763 >> class_xa_184_.anInt6289 * -2137349879) >= class_xa_184_.anInt6286 * -1148794921)))
					return;
			} else {
				i_188_ >>= class_xa.anInt6289 * -2137349879;
				i_189_ = (i_189_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_190_ >>= class_xa.anInt6289 * -2137349879;
				i_191_ = (i_191_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (is[i_188_][i_190_] == i_186_ && is[i_189_][i_190_] == i_186_ && is[i_188_][i_191_] == i_186_ && is[i_189_][i_191_] == i_186_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_193_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_194_ = 0; i_194_ < ((Class387_Sub1) this).anInt7742; i_194_++) {
						int i_195_ = (((Class387_Sub1) this).anIntArray7751[i_194_] + i_185_);
						int i_196_ = (((Class387_Sub1) this).anIntArray7753[i_194_] + i_187_);
						int i_197_ = i_195_ & i_193_;
						int i_198_ = i_196_ & i_193_;
						int i_199_ = i_195_ >> class_xa.anInt6289 * -2137349879;
						int i_200_ = i_196_ >> class_xa.anInt6289 * -2137349879;
						int i_201_ = (((is[i_199_][i_200_] * (class_xa.anInt6288 * -1212653763 - i_197_)) + is[i_199_ + 1][i_200_] * i_197_) >> class_xa.anInt6289 * -2137349879);
						int i_202_ = (((is[i_199_][i_200_ + 1] * (class_xa.anInt6288 * -1212653763 - i_197_)) + is[i_199_ + 1][i_200_ + 1] * i_197_) >> class_xa.anInt6289 * -2137349879);
						int i_203_ = (i_201_ * (class_xa.anInt6288 * -1212653763 - i_198_) + i_202_ * i_198_ >> class_xa.anInt6289 * -2137349879);
						((Class387_Sub1) this).anIntArray7752[i_194_] = (((Class387_Sub1) this).anIntArray7752[i_194_] + i_203_ - i_186_);
					}
					for (int i_204_ = ((Class387_Sub1) this).anInt7742; i_204_ < ((Class387_Sub1) this).anInt7799; i_204_++) {
						int i_205_ = (((Class387_Sub1) this).anIntArray7751[i_204_] + i_185_);
						int i_206_ = (((Class387_Sub1) this).anIntArray7753[i_204_] + i_187_);
						int i_207_ = i_205_ & i_193_;
						int i_208_ = i_206_ & i_193_;
						int i_209_ = i_205_ >> class_xa.anInt6289 * -2137349879;
						int i_210_ = i_206_ >> class_xa.anInt6289 * -2137349879;
						if (i_209_ >= 0 && i_209_ < is.length - 1 && i_210_ >= 0 && i_210_ < is[0].length - 1) {
							int i_211_ = (((is[i_209_][i_210_] * (class_xa.anInt6288 * -1212653763 - i_207_)) + is[i_209_ + 1][i_210_] * i_207_) >> class_xa.anInt6289 * -2137349879);
							int i_212_ = (((is[i_209_][i_210_ + 1] * (class_xa.anInt6288 * -1212653763 - i_207_)) + is[i_209_ + 1][i_210_ + 1] * i_207_) >> class_xa.anInt6289 * -2137349879);
							int i_213_ = (i_211_ * (class_xa.anInt6288 * -1212653763 - i_208_) + i_212_ * i_208_ >> class_xa.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_204_] = (((Class387_Sub1) this).anIntArray7752[i_204_]) + i_213_ - i_186_;
						}
					}
				} else if (i == 2) {
					int i_214_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_215_ = 0; i_215_ < ((Class387_Sub1) this).anInt7742; i_215_++) {
						int i_216_ = ((((Class387_Sub1) this).anIntArray7752[i_215_] << 16) / ((Class387_Sub1) this).aShort7770);
						if (i_216_ < i_183_) {
							int i_217_ = ((((Class387_Sub1) this).anIntArray7751[i_215_]) + i_185_);
							int i_218_ = ((((Class387_Sub1) this).anIntArray7753[i_215_]) + i_187_);
							int i_219_ = i_217_ & i_214_;
							int i_220_ = i_218_ & i_214_;
							int i_221_ = i_217_ >> class_xa.anInt6289 * -2137349879;
							int i_222_ = i_218_ >> class_xa.anInt6289 * -2137349879;
							int i_223_ = (((is[i_221_][i_222_] * (class_xa.anInt6288 * -1212653763 - i_219_)) + is[i_221_ + 1][i_222_] * i_219_) >> class_xa.anInt6289 * -2137349879);
							int i_224_ = (((is[i_221_][i_222_ + 1] * (class_xa.anInt6288 * -1212653763 - i_219_)) + is[i_221_ + 1][i_222_ + 1] * i_219_) >> class_xa.anInt6289 * -2137349879);
							int i_225_ = (i_223_ * (class_xa.anInt6288 * -1212653763 - i_220_) + i_224_ * i_220_ >> class_xa.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_215_] = ((((Class387_Sub1) this).anIntArray7752[i_215_]) + ((i_225_ - i_186_) * (i_183_ - i_216_) / i_183_));
						} else
							((Class387_Sub1) this).anIntArray7752[i_215_] = (((Class387_Sub1) this).anIntArray7752[i_215_]);
					}
					for (int i_226_ = ((Class387_Sub1) this).anInt7742; i_226_ < ((Class387_Sub1) this).anInt7799; i_226_++) {
						int i_227_ = ((((Class387_Sub1) this).anIntArray7752[i_226_] << 16) / ((Class387_Sub1) this).aShort7770);
						if (i_227_ < i_183_) {
							int i_228_ = ((((Class387_Sub1) this).anIntArray7751[i_226_]) + i_185_);
							int i_229_ = ((((Class387_Sub1) this).anIntArray7753[i_226_]) + i_187_);
							int i_230_ = i_228_ & i_214_;
							int i_231_ = i_229_ & i_214_;
							int i_232_ = i_228_ >> class_xa.anInt6289 * -2137349879;
							int i_233_ = i_229_ >> class_xa.anInt6289 * -2137349879;
							if (i_232_ >= 0 && i_232_ < class_xa.anInt6287 * -506105871 - 1 && i_233_ >= 0 && (i_233_ < class_xa.anInt6286 * -1148794921 - 1)) {
								int i_234_ = (((is[i_232_][i_233_] * (class_xa.anInt6288 * -1212653763 - i_230_)) + is[i_232_ + 1][i_233_] * i_230_) >> class_xa.anInt6289 * -2137349879);
								int i_235_ = (((is[i_232_][i_233_ + 1] * (class_xa.anInt6288 * -1212653763 - i_230_)) + is[i_232_ + 1][i_233_ + 1] * i_230_) >> class_xa.anInt6289 * -2137349879);
								int i_236_ = ((i_234_ * (class_xa.anInt6288 * -1212653763 - i_231_)) + i_235_ * i_231_ >> class_xa.anInt6289 * -2137349879);
								((Class387_Sub1) this).anIntArray7752[i_226_] = ((((Class387_Sub1) this).anIntArray7752[i_226_]) + ((i_236_ - i_186_) * (i_183_ - i_227_) / i_183_));
							}
						} else
							((Class387_Sub1) this).anIntArray7752[i_226_] = (((Class387_Sub1) this).anIntArray7752[i_226_]);
					}
				} else if (i == 3) {
					int i_237_ = (i_183_ & 0xff) * 4;
					int i_238_ = (i_183_ >> 8 & 0xff) * 4;
					int i_239_ = (i_183_ >> 16 & 0xff) << 6;
					int i_240_ = (i_183_ >> 24 & 0xff) << 6;
					if (i_185_ - (i_237_ >> 1) < 0 || ((i_185_ + (i_237_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_187_ - (i_238_ >> 1) < 0 || ((i_187_ + (i_238_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
						return;
					method4732(class_xa, i_185_, i_186_, i_187_, i_237_, i_238_, i_239_, i_240_);
				} else if (i == 4) {
					int i_241_ = class_xa_184_.anInt6288 * -1212653763 - 1;
					int i_242_ = (((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770);
					for (int i_243_ = 0; i_243_ < ((Class387_Sub1) this).anInt7742; i_243_++) {
						int i_244_ = (((Class387_Sub1) this).anIntArray7751[i_243_] + i_185_);
						int i_245_ = (((Class387_Sub1) this).anIntArray7753[i_243_] + i_187_);
						int i_246_ = i_244_ & i_241_;
						int i_247_ = i_245_ & i_241_;
						int i_248_ = i_244_ >> class_xa_184_.anInt6289 * -2137349879;
						int i_249_ = i_245_ >> class_xa_184_.anInt6289 * -2137349879;
						int i_250_ = (((is_192_[i_248_][i_249_] * (class_xa_184_.anInt6288 * -1212653763 - i_246_)) + is_192_[i_248_ + 1][i_249_] * i_246_) >> class_xa_184_.anInt6289 * -2137349879);
						int i_251_ = (((is_192_[i_248_][i_249_ + 1] * (class_xa_184_.anInt6288 * -1212653763 - i_246_)) + is_192_[i_248_ + 1][i_249_ + 1] * i_246_) >> class_xa_184_.anInt6289 * -2137349879);
						int i_252_ = (i_250_ * (class_xa_184_.anInt6288 * -1212653763 - i_247_) + i_251_ * i_247_ >> class_xa_184_.anInt6289 * -2137349879);
						((Class387_Sub1) this).anIntArray7752[i_243_] = (((Class387_Sub1) this).anIntArray7752[i_243_] + (i_252_ - i_186_) + i_242_);
					}
					for (int i_253_ = ((Class387_Sub1) this).anInt7742; i_253_ < ((Class387_Sub1) this).anInt7799; i_253_++) {
						int i_254_ = (((Class387_Sub1) this).anIntArray7751[i_253_] + i_185_);
						int i_255_ = (((Class387_Sub1) this).anIntArray7753[i_253_] + i_187_);
						int i_256_ = i_254_ & i_241_;
						int i_257_ = i_255_ & i_241_;
						int i_258_ = i_254_ >> class_xa_184_.anInt6289 * -2137349879;
						int i_259_ = i_255_ >> class_xa_184_.anInt6289 * -2137349879;
						if (i_258_ >= 0 && (i_258_ < class_xa_184_.anInt6287 * -506105871 - 1) && i_259_ >= 0 && (i_259_ < class_xa_184_.anInt6286 * -1148794921 - 1)) {
							int i_260_ = (((is_192_[i_258_][i_259_] * (class_xa_184_.anInt6288 * -1212653763 - i_256_)) + is_192_[i_258_ + 1][i_259_] * i_256_) >> class_xa_184_.anInt6289 * -2137349879);
							int i_261_ = (((is_192_[i_258_][i_259_ + 1] * (class_xa_184_.anInt6288 * -1212653763 - i_256_)) + is_192_[i_258_ + 1][i_259_ + 1] * i_256_) >> class_xa_184_.anInt6289 * -2137349879);
							int i_262_ = ((i_260_ * (class_xa_184_.anInt6288 * -1212653763 - i_257_)) + i_261_ * i_257_ >> class_xa_184_.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_253_] = (((Class387_Sub1) this).anIntArray7752[i_253_]) + (i_262_ - i_186_) + i_242_;
						}
					}
				} else if (i == 5) {
					int i_263_ = class_xa_184_.anInt6288 * -1212653763 - 1;
					int i_264_ = (((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770);
					for (int i_265_ = 0; i_265_ < ((Class387_Sub1) this).anInt7742; i_265_++) {
						int i_266_ = (((Class387_Sub1) this).anIntArray7751[i_265_] + i_185_);
						int i_267_ = (((Class387_Sub1) this).anIntArray7753[i_265_] + i_187_);
						int i_268_ = i_266_ & i_263_;
						int i_269_ = i_267_ & i_263_;
						int i_270_ = i_266_ >> class_xa.anInt6289 * -2137349879;
						int i_271_ = i_267_ >> class_xa.anInt6289 * -2137349879;
						int i_272_ = (((is[i_270_][i_271_] * (class_xa.anInt6288 * -1212653763 - i_268_)) + is[i_270_ + 1][i_271_] * i_268_) >> class_xa.anInt6289 * -2137349879);
						int i_273_ = (((is[i_270_][i_271_ + 1] * (class_xa.anInt6288 * -1212653763 - i_268_)) + is[i_270_ + 1][i_271_ + 1] * i_268_) >> class_xa.anInt6289 * -2137349879);
						int i_274_ = (i_272_ * (class_xa.anInt6288 * -1212653763 - i_269_) + i_273_ * i_269_ >> class_xa.anInt6289 * -2137349879);
						i_272_ = (((is_192_[i_270_][i_271_] * (class_xa_184_.anInt6288 * -1212653763 - i_268_)) + is_192_[i_270_ + 1][i_271_] * i_268_) >> class_xa_184_.anInt6289 * -2137349879);
						i_273_ = (((is_192_[i_270_][i_271_ + 1] * (class_xa_184_.anInt6288 * -1212653763 - i_268_)) + is_192_[i_270_ + 1][i_271_ + 1] * i_268_) >> class_xa_184_.anInt6289 * -2137349879);
						int i_275_ = (i_272_ * (class_xa_184_.anInt6288 * -1212653763 - i_269_) + i_273_ * i_269_ >> class_xa_184_.anInt6289 * -2137349879);
						int i_276_ = i_274_ - i_275_ - i_183_;
						((Class387_Sub1) this).anIntArray7752[i_265_] = ((((Class387_Sub1) this).anIntArray7752[i_265_] << 8) / i_264_ * i_276_ >> 8) - (i_186_ - i_274_);
					}
					for (int i_277_ = ((Class387_Sub1) this).anInt7742; i_277_ < ((Class387_Sub1) this).anInt7799; i_277_++) {
						int i_278_ = (((Class387_Sub1) this).anIntArray7751[i_277_] + i_185_);
						int i_279_ = (((Class387_Sub1) this).anIntArray7753[i_277_] + i_187_);
						int i_280_ = i_278_ & i_263_;
						int i_281_ = i_279_ & i_263_;
						int i_282_ = i_278_ >> class_xa.anInt6289 * -2137349879;
						int i_283_ = i_279_ >> class_xa.anInt6289 * -2137349879;
						if (i_282_ >= 0 && i_282_ < class_xa.anInt6287 * -506105871 - 1 && (i_282_ < class_xa_184_.anInt6287 * -506105871 - 1) && i_283_ >= 0 && i_283_ < class_xa.anInt6286 * -1148794921 - 1 && (i_283_ < class_xa_184_.anInt6286 * -1148794921 - 1)) {
							int i_284_ = (((is[i_282_][i_283_] * (class_xa.anInt6288 * -1212653763 - i_280_)) + is[i_282_ + 1][i_283_] * i_280_) >> class_xa.anInt6289 * -2137349879);
							int i_285_ = (((is[i_282_][i_283_ + 1] * (class_xa.anInt6288 * -1212653763 - i_280_)) + is[i_282_ + 1][i_283_ + 1] * i_280_) >> class_xa.anInt6289 * -2137349879);
							int i_286_ = (i_284_ * (class_xa.anInt6288 * -1212653763 - i_281_) + i_285_ * i_281_ >> class_xa.anInt6289 * -2137349879);
							i_284_ = (((is_192_[i_282_][i_283_] * (class_xa_184_.anInt6288 * -1212653763 - i_280_)) + is_192_[i_282_ + 1][i_283_] * i_280_) >> class_xa_184_.anInt6289 * -2137349879);
							i_285_ = (((is_192_[i_282_][i_283_ + 1] * (class_xa_184_.anInt6288 * -1212653763 - i_280_)) + is_192_[i_282_ + 1][i_283_ + 1] * i_280_) >> class_xa_184_.anInt6289 * -2137349879);
							int i_287_ = ((i_284_ * (class_xa_184_.anInt6288 * -1212653763 - i_281_)) + i_285_ * i_281_ >> class_xa_184_.anInt6289 * -2137349879);
							int i_288_ = i_286_ - i_287_ - i_183_;
							((Class387_Sub1) this).anIntArray7752[i_277_] = (((((Class387_Sub1) this).anIntArray7752[i_277_]) << 8) / i_264_ * i_288_ >> 8) - (i_186_ - i_286_);
						}
					}
				}
				((Class387_Sub1) this).aBoolean7792 = false;
			}
		}
	}

	int method4794(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	public void method4784() {
		/* empty */
	}

	int method4795(int i, int i_289_) {
		i_289_ = i_289_ * (i & 0x7f) >> 7;
		if (i_289_ < 2)
			i_289_ = 2;
		else if (i_289_ > 126)
			i_289_ = 126;
		return (i & 0xff80) + i_289_;
	}

	public void S(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub1) this).aClass1Array7755 != null) {
				if (i == 4096) {
					method4797();
					break;
				}
				if (i == 8192) {
					method4798();
					break;
				}
				if (i == 12288) {
					method4799();
					break;
				}
				int i_290_ = Class220.anIntArray2483[i];
				int i_291_ = Class220.anIntArray2474[i];
				synchronized (this) {
					for (int i_292_ = 0; i_292_ < ((Class387_Sub1) this).anInt7742; i_292_++) {
						int i_293_ = ((((Class387_Sub1) this).anIntArray7753[i_292_] * i_290_) + (((Class387_Sub1) this).anIntArray7751[i_292_] * i_291_)) >> 14;
						((Class387_Sub1) this).anIntArray7753[i_292_] = ((((Class387_Sub1) this).anIntArray7753[i_292_] * i_291_) - (((Class387_Sub1) this).anIntArray7751[i_292_] * i_290_)) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_292_] = i_293_;
						if (((Class387_Sub1) this).aClass1Array7755[i_292_] != null) {
							i_293_ = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_292_])).anInt14) * i_290_ + (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_292_])).anInt13) * i_291_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_292_])).anInt14 = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_292_])).anInt14) * i_291_ - (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_292_])).anInt13) * i_290_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_292_])).anInt13 = i_293_;
						}
					}
					if (((Class387_Sub1) this).aClass5Array7740 != null) {
						for (int i_294_ = 0; i_294_ < ((Class387_Sub1) this).anInt7757; i_294_++) {
							if (((Class387_Sub1) this).aClass5Array7740[i_294_] != null) {
								int i_295_ = (((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_294_])).anInt80) * i_290_ + (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_294_])).anInt78 * i_291_)) >> 14);
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_294_])).anInt80 = ((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_294_])).anInt80) * i_291_ - (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_294_])).anInt78 * i_290_)) >> 14;
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_294_])).anInt78 = i_295_;
							}
						}
					}
					for (int i_296_ = ((Class387_Sub1) this).anInt7742; i_296_ < ((Class387_Sub1) this).anInt7799; i_296_++) {
						int i_297_ = ((((Class387_Sub1) this).anIntArray7753[i_296_] * i_290_) + (((Class387_Sub1) this).anIntArray7751[i_296_] * i_291_)) >> 14;
						((Class387_Sub1) this).anIntArray7753[i_296_] = ((((Class387_Sub1) this).anIntArray7753[i_296_] * i_291_) - (((Class387_Sub1) this).anIntArray7751[i_296_] * i_290_)) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_296_] = i_297_;
					}
					((Class387_Sub1) this).anInt7812 = 0;
					((Class387_Sub1) this).aBoolean7792 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public void method4764() {
		/* empty */
	}

	void method4796() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++) {
				((Class387_Sub1) this).anIntArray7751[i] = -((Class387_Sub1) this).anIntArray7751[i];
				((Class387_Sub1) this).anIntArray7753[i] = -((Class387_Sub1) this).anIntArray7753[i];
			}
			method4800();
		}
	}

	void method4797() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7742; i++) {
				int i_298_ = ((Class387_Sub1) this).anIntArray7751[i];
				((Class387_Sub1) this).anIntArray7751[i] = ((Class387_Sub1) this).anIntArray7753[i];
				((Class387_Sub1) this).anIntArray7753[i] = -i_298_;
				if (((Class387_Sub1) this).aClass1Array7755[i] != null) {
					i_298_ = ((Class1) (((Class387_Sub1) this).aClass1Array7755[i])).anInt13;
					((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt13 = ((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt14;
					((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt14 = -i_298_;
				}
			}
			if (((Class387_Sub1) this).aClass5Array7740 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
					if (((Class387_Sub1) this).aClass5Array7740[i] != null) {
						int i_299_ = (((Class5) (((Class387_Sub1) this).aClass5Array7740[i])).anInt78);
						((Class5) ((Class387_Sub1) this).aClass5Array7740[i]).anInt78 = ((Class5) (((Class387_Sub1) this).aClass5Array7740[i])).anInt80;
						((Class5) ((Class387_Sub1) this).aClass5Array7740[i]).anInt80 = -i_299_;
					}
				}
			}
			for (int i = ((Class387_Sub1) this).anInt7742; i < ((Class387_Sub1) this).anInt7799; i++) {
				int i_300_ = ((Class387_Sub1) this).anIntArray7751[i];
				((Class387_Sub1) this).anIntArray7751[i] = ((Class387_Sub1) this).anIntArray7753[i];
				((Class387_Sub1) this).anIntArray7753[i] = -i_300_;
			}
			((Class387_Sub1) this).anInt7812 = 0;
			((Class387_Sub1) this).aBoolean7792 = false;
		}
	}

	void method4798() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7742; i++) {
				((Class387_Sub1) this).anIntArray7751[i] = -((Class387_Sub1) this).anIntArray7751[i];
				((Class387_Sub1) this).anIntArray7753[i] = -((Class387_Sub1) this).anIntArray7753[i];
				if (((Class387_Sub1) this).aClass1Array7755[i] != null) {
					((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt13 = -((Class1) (((Class387_Sub1) this).aClass1Array7755[i])).anInt13;
					((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt14 = -((Class1) (((Class387_Sub1) this).aClass1Array7755[i])).anInt14;
				}
			}
			if (((Class387_Sub1) this).aClass5Array7740 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
					if (((Class387_Sub1) this).aClass5Array7740[i] != null) {
						((Class5) ((Class387_Sub1) this).aClass5Array7740[i]).anInt78 = -((Class5) (((Class387_Sub1) this).aClass5Array7740[i])).anInt78;
						((Class5) ((Class387_Sub1) this).aClass5Array7740[i]).anInt80 = -((Class5) (((Class387_Sub1) this).aClass5Array7740[i])).anInt80;
					}
				}
			}
			for (int i = ((Class387_Sub1) this).anInt7742; i < ((Class387_Sub1) this).anInt7799; i++) {
				((Class387_Sub1) this).anIntArray7751[i] = -((Class387_Sub1) this).anIntArray7751[i];
				((Class387_Sub1) this).anIntArray7753[i] = -((Class387_Sub1) this).anIntArray7753[i];
			}
			((Class387_Sub1) this).anInt7812 = 0;
			((Class387_Sub1) this).aBoolean7792 = false;
		}
	}

	void method4799() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7742; i++) {
				int i_301_ = ((Class387_Sub1) this).anIntArray7753[i];
				((Class387_Sub1) this).anIntArray7753[i] = ((Class387_Sub1) this).anIntArray7751[i];
				((Class387_Sub1) this).anIntArray7751[i] = -i_301_;
				if (((Class387_Sub1) this).aClass1Array7755[i] != null) {
					i_301_ = ((Class1) (((Class387_Sub1) this).aClass1Array7755[i])).anInt14;
					((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt14 = ((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt13;
					((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt13 = -i_301_;
				}
			}
			if (((Class387_Sub1) this).aClass5Array7740 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
					if (((Class387_Sub1) this).aClass5Array7740[i] != null) {
						int i_302_ = (((Class5) (((Class387_Sub1) this).aClass5Array7740[i])).anInt80);
						((Class5) ((Class387_Sub1) this).aClass5Array7740[i]).anInt80 = ((Class5) (((Class387_Sub1) this).aClass5Array7740[i])).anInt78;
						((Class5) ((Class387_Sub1) this).aClass5Array7740[i]).anInt78 = -i_302_;
					}
				}
			}
			for (int i = ((Class387_Sub1) this).anInt7742; i < ((Class387_Sub1) this).anInt7799; i++) {
				int i_303_ = ((Class387_Sub1) this).anIntArray7753[i];
				((Class387_Sub1) this).anIntArray7753[i] = ((Class387_Sub1) this).anIntArray7751[i];
				((Class387_Sub1) this).anIntArray7751[i] = -i_303_;
			}
			((Class387_Sub1) this).anInt7812 = 0;
			((Class387_Sub1) this).aBoolean7792 = false;
		}
	}

	public void t(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x6) != 6)
			throw new IllegalStateException();
		int i_304_ = Class220.anIntArray2483[i];
		int i_305_ = Class220.anIntArray2474[i];
		synchronized (this) {
			for (int i_306_ = 0; i_306_ < ((Class387_Sub1) this).anInt7799; i_306_++) {
				int i_307_ = ((((Class387_Sub1) this).anIntArray7752[i_306_] * i_305_ - (((Class387_Sub1) this).anIntArray7753[i_306_] * i_304_)) >> 14);
				((Class387_Sub1) this).anIntArray7753[i_306_] = (((Class387_Sub1) this).anIntArray7752[i_306_] * i_304_ + (((Class387_Sub1) this).anIntArray7753[i_306_] * i_305_)) >> 14;
				((Class387_Sub1) this).anIntArray7752[i_306_] = i_307_;
			}
			method4800();
		}
	}

	public void EA(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x3) != 3)
			throw new IllegalStateException();
		int i_308_ = Class220.anIntArray2483[i];
		int i_309_ = Class220.anIntArray2474[i];
		synchronized (this) {
			for (int i_310_ = 0; i_310_ < ((Class387_Sub1) this).anInt7799; i_310_++) {
				int i_311_ = ((((Class387_Sub1) this).anIntArray7752[i_310_] * i_308_ + (((Class387_Sub1) this).anIntArray7751[i_310_] * i_309_)) >> 14);
				((Class387_Sub1) this).anIntArray7752[i_310_] = (((Class387_Sub1) this).anIntArray7752[i_310_] * i_309_ - (((Class387_Sub1) this).anIntArray7751[i_310_] * i_308_)) >> 14;
				((Class387_Sub1) this).anIntArray7751[i_310_] = i_311_;
			}
			method4800();
		}
	}

	public int dl() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7795;
	}

	public void oa(int i, int i_312_, int i_313_) {
		if (i != 128 && (((Class387_Sub1) this).anInt7746 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_312_ != 128 && (((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_313_ != 128 && (((Class387_Sub1) this).anInt7746 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_314_ = 0; i_314_ < ((Class387_Sub1) this).anInt7799; i_314_++) {
				((Class387_Sub1) this).anIntArray7751[i_314_] = ((Class387_Sub1) this).anIntArray7751[i_314_] * i >> 7;
				((Class387_Sub1) this).anIntArray7752[i_314_] = (((Class387_Sub1) this).anIntArray7752[i_314_] * i_312_ >> 7);
				((Class387_Sub1) this).anIntArray7753[i_314_] = (((Class387_Sub1) this).anIntArray7753[i_314_] * i_313_ >> 7);
			}
			((Class387_Sub1) this).aBoolean7792 = false;
		}
	}

	public void pa(int i, int i_315_, Class_xa class_xa, Class_xa class_xa_316_, int i_317_, int i_318_, int i_319_) {
		if (i == 3) {
			if ((((Class387_Sub1) this).anInt7746 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		int i_320_ = i_317_ + ((Class387_Sub1) this).aShort7797;
		int i_321_ = i_317_ + ((Class387_Sub1) this).aShort7743;
		int i_322_ = i_319_ + ((Class387_Sub1) this).aShort7795;
		int i_323_ = i_319_ + ((Class387_Sub1) this).aShort7800;
		if (i == 4 || (i_320_ >= 0 && ((i_321_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_322_ >= 0 && ((i_323_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			int[][] is = class_xa.anIntArrayArray6290;
			int[][] is_324_ = null;
			if (class_xa_316_ != null)
				is_324_ = class_xa_316_.anIntArrayArray6290;
			if (i == 4 || i == 5) {
				if (class_xa_316_ == null || (i_320_ < 0 || ((i_321_ + class_xa_316_.anInt6288 * -1212653763 >> class_xa_316_.anInt6289 * -2137349879) >= class_xa_316_.anInt6287 * -506105871) || i_322_ < 0 || ((i_323_ + class_xa_316_.anInt6288 * -1212653763 >> class_xa_316_.anInt6289 * -2137349879) >= class_xa_316_.anInt6286 * -1148794921)))
					return;
			} else {
				i_320_ >>= class_xa.anInt6289 * -2137349879;
				i_321_ = (i_321_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_322_ >>= class_xa.anInt6289 * -2137349879;
				i_323_ = (i_323_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (is[i_320_][i_322_] == i_318_ && is[i_321_][i_322_] == i_318_ && is[i_320_][i_323_] == i_318_ && is[i_321_][i_323_] == i_318_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_325_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_326_ = 0; i_326_ < ((Class387_Sub1) this).anInt7742; i_326_++) {
						int i_327_ = (((Class387_Sub1) this).anIntArray7751[i_326_] + i_317_);
						int i_328_ = (((Class387_Sub1) this).anIntArray7753[i_326_] + i_319_);
						int i_329_ = i_327_ & i_325_;
						int i_330_ = i_328_ & i_325_;
						int i_331_ = i_327_ >> class_xa.anInt6289 * -2137349879;
						int i_332_ = i_328_ >> class_xa.anInt6289 * -2137349879;
						int i_333_ = (((is[i_331_][i_332_] * (class_xa.anInt6288 * -1212653763 - i_329_)) + is[i_331_ + 1][i_332_] * i_329_) >> class_xa.anInt6289 * -2137349879);
						int i_334_ = (((is[i_331_][i_332_ + 1] * (class_xa.anInt6288 * -1212653763 - i_329_)) + is[i_331_ + 1][i_332_ + 1] * i_329_) >> class_xa.anInt6289 * -2137349879);
						int i_335_ = (i_333_ * (class_xa.anInt6288 * -1212653763 - i_330_) + i_334_ * i_330_ >> class_xa.anInt6289 * -2137349879);
						((Class387_Sub1) this).anIntArray7752[i_326_] = (((Class387_Sub1) this).anIntArray7752[i_326_] + i_335_ - i_318_);
					}
					for (int i_336_ = ((Class387_Sub1) this).anInt7742; i_336_ < ((Class387_Sub1) this).anInt7799; i_336_++) {
						int i_337_ = (((Class387_Sub1) this).anIntArray7751[i_336_] + i_317_);
						int i_338_ = (((Class387_Sub1) this).anIntArray7753[i_336_] + i_319_);
						int i_339_ = i_337_ & i_325_;
						int i_340_ = i_338_ & i_325_;
						int i_341_ = i_337_ >> class_xa.anInt6289 * -2137349879;
						int i_342_ = i_338_ >> class_xa.anInt6289 * -2137349879;
						if (i_341_ >= 0 && i_341_ < is.length - 1 && i_342_ >= 0 && i_342_ < is[0].length - 1) {
							int i_343_ = (((is[i_341_][i_342_] * (class_xa.anInt6288 * -1212653763 - i_339_)) + is[i_341_ + 1][i_342_] * i_339_) >> class_xa.anInt6289 * -2137349879);
							int i_344_ = (((is[i_341_][i_342_ + 1] * (class_xa.anInt6288 * -1212653763 - i_339_)) + is[i_341_ + 1][i_342_ + 1] * i_339_) >> class_xa.anInt6289 * -2137349879);
							int i_345_ = (i_343_ * (class_xa.anInt6288 * -1212653763 - i_340_) + i_344_ * i_340_ >> class_xa.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_336_] = (((Class387_Sub1) this).anIntArray7752[i_336_]) + i_345_ - i_318_;
						}
					}
				} else if (i == 2) {
					int i_346_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_347_ = 0; i_347_ < ((Class387_Sub1) this).anInt7742; i_347_++) {
						int i_348_ = ((((Class387_Sub1) this).anIntArray7752[i_347_] << 16) / ((Class387_Sub1) this).aShort7770);
						if (i_348_ < i_315_) {
							int i_349_ = ((((Class387_Sub1) this).anIntArray7751[i_347_]) + i_317_);
							int i_350_ = ((((Class387_Sub1) this).anIntArray7753[i_347_]) + i_319_);
							int i_351_ = i_349_ & i_346_;
							int i_352_ = i_350_ & i_346_;
							int i_353_ = i_349_ >> class_xa.anInt6289 * -2137349879;
							int i_354_ = i_350_ >> class_xa.anInt6289 * -2137349879;
							int i_355_ = (((is[i_353_][i_354_] * (class_xa.anInt6288 * -1212653763 - i_351_)) + is[i_353_ + 1][i_354_] * i_351_) >> class_xa.anInt6289 * -2137349879);
							int i_356_ = (((is[i_353_][i_354_ + 1] * (class_xa.anInt6288 * -1212653763 - i_351_)) + is[i_353_ + 1][i_354_ + 1] * i_351_) >> class_xa.anInt6289 * -2137349879);
							int i_357_ = (i_355_ * (class_xa.anInt6288 * -1212653763 - i_352_) + i_356_ * i_352_ >> class_xa.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_347_] = ((((Class387_Sub1) this).anIntArray7752[i_347_]) + ((i_357_ - i_318_) * (i_315_ - i_348_) / i_315_));
						} else
							((Class387_Sub1) this).anIntArray7752[i_347_] = (((Class387_Sub1) this).anIntArray7752[i_347_]);
					}
					for (int i_358_ = ((Class387_Sub1) this).anInt7742; i_358_ < ((Class387_Sub1) this).anInt7799; i_358_++) {
						int i_359_ = ((((Class387_Sub1) this).anIntArray7752[i_358_] << 16) / ((Class387_Sub1) this).aShort7770);
						if (i_359_ < i_315_) {
							int i_360_ = ((((Class387_Sub1) this).anIntArray7751[i_358_]) + i_317_);
							int i_361_ = ((((Class387_Sub1) this).anIntArray7753[i_358_]) + i_319_);
							int i_362_ = i_360_ & i_346_;
							int i_363_ = i_361_ & i_346_;
							int i_364_ = i_360_ >> class_xa.anInt6289 * -2137349879;
							int i_365_ = i_361_ >> class_xa.anInt6289 * -2137349879;
							if (i_364_ >= 0 && i_364_ < class_xa.anInt6287 * -506105871 - 1 && i_365_ >= 0 && (i_365_ < class_xa.anInt6286 * -1148794921 - 1)) {
								int i_366_ = (((is[i_364_][i_365_] * (class_xa.anInt6288 * -1212653763 - i_362_)) + is[i_364_ + 1][i_365_] * i_362_) >> class_xa.anInt6289 * -2137349879);
								int i_367_ = (((is[i_364_][i_365_ + 1] * (class_xa.anInt6288 * -1212653763 - i_362_)) + is[i_364_ + 1][i_365_ + 1] * i_362_) >> class_xa.anInt6289 * -2137349879);
								int i_368_ = ((i_366_ * (class_xa.anInt6288 * -1212653763 - i_363_)) + i_367_ * i_363_ >> class_xa.anInt6289 * -2137349879);
								((Class387_Sub1) this).anIntArray7752[i_358_] = ((((Class387_Sub1) this).anIntArray7752[i_358_]) + ((i_368_ - i_318_) * (i_315_ - i_359_) / i_315_));
							}
						} else
							((Class387_Sub1) this).anIntArray7752[i_358_] = (((Class387_Sub1) this).anIntArray7752[i_358_]);
					}
				} else if (i == 3) {
					int i_369_ = (i_315_ & 0xff) * 4;
					int i_370_ = (i_315_ >> 8 & 0xff) * 4;
					int i_371_ = (i_315_ >> 16 & 0xff) << 6;
					int i_372_ = (i_315_ >> 24 & 0xff) << 6;
					if (i_317_ - (i_369_ >> 1) < 0 || ((i_317_ + (i_369_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_319_ - (i_370_ >> 1) < 0 || ((i_319_ + (i_370_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
						return;
					method4732(class_xa, i_317_, i_318_, i_319_, i_369_, i_370_, i_371_, i_372_);
				} else if (i == 4) {
					int i_373_ = class_xa_316_.anInt6288 * -1212653763 - 1;
					int i_374_ = (((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770);
					for (int i_375_ = 0; i_375_ < ((Class387_Sub1) this).anInt7742; i_375_++) {
						int i_376_ = (((Class387_Sub1) this).anIntArray7751[i_375_] + i_317_);
						int i_377_ = (((Class387_Sub1) this).anIntArray7753[i_375_] + i_319_);
						int i_378_ = i_376_ & i_373_;
						int i_379_ = i_377_ & i_373_;
						int i_380_ = i_376_ >> class_xa_316_.anInt6289 * -2137349879;
						int i_381_ = i_377_ >> class_xa_316_.anInt6289 * -2137349879;
						int i_382_ = (((is_324_[i_380_][i_381_] * (class_xa_316_.anInt6288 * -1212653763 - i_378_)) + is_324_[i_380_ + 1][i_381_] * i_378_) >> class_xa_316_.anInt6289 * -2137349879);
						int i_383_ = (((is_324_[i_380_][i_381_ + 1] * (class_xa_316_.anInt6288 * -1212653763 - i_378_)) + is_324_[i_380_ + 1][i_381_ + 1] * i_378_) >> class_xa_316_.anInt6289 * -2137349879);
						int i_384_ = (i_382_ * (class_xa_316_.anInt6288 * -1212653763 - i_379_) + i_383_ * i_379_ >> class_xa_316_.anInt6289 * -2137349879);
						((Class387_Sub1) this).anIntArray7752[i_375_] = (((Class387_Sub1) this).anIntArray7752[i_375_] + (i_384_ - i_318_) + i_374_);
					}
					for (int i_385_ = ((Class387_Sub1) this).anInt7742; i_385_ < ((Class387_Sub1) this).anInt7799; i_385_++) {
						int i_386_ = (((Class387_Sub1) this).anIntArray7751[i_385_] + i_317_);
						int i_387_ = (((Class387_Sub1) this).anIntArray7753[i_385_] + i_319_);
						int i_388_ = i_386_ & i_373_;
						int i_389_ = i_387_ & i_373_;
						int i_390_ = i_386_ >> class_xa_316_.anInt6289 * -2137349879;
						int i_391_ = i_387_ >> class_xa_316_.anInt6289 * -2137349879;
						if (i_390_ >= 0 && (i_390_ < class_xa_316_.anInt6287 * -506105871 - 1) && i_391_ >= 0 && (i_391_ < class_xa_316_.anInt6286 * -1148794921 - 1)) {
							int i_392_ = (((is_324_[i_390_][i_391_] * (class_xa_316_.anInt6288 * -1212653763 - i_388_)) + is_324_[i_390_ + 1][i_391_] * i_388_) >> class_xa_316_.anInt6289 * -2137349879);
							int i_393_ = (((is_324_[i_390_][i_391_ + 1] * (class_xa_316_.anInt6288 * -1212653763 - i_388_)) + is_324_[i_390_ + 1][i_391_ + 1] * i_388_) >> class_xa_316_.anInt6289 * -2137349879);
							int i_394_ = ((i_392_ * (class_xa_316_.anInt6288 * -1212653763 - i_389_)) + i_393_ * i_389_ >> class_xa_316_.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_385_] = (((Class387_Sub1) this).anIntArray7752[i_385_]) + (i_394_ - i_318_) + i_374_;
						}
					}
				} else if (i == 5) {
					int i_395_ = class_xa_316_.anInt6288 * -1212653763 - 1;
					int i_396_ = (((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770);
					for (int i_397_ = 0; i_397_ < ((Class387_Sub1) this).anInt7742; i_397_++) {
						int i_398_ = (((Class387_Sub1) this).anIntArray7751[i_397_] + i_317_);
						int i_399_ = (((Class387_Sub1) this).anIntArray7753[i_397_] + i_319_);
						int i_400_ = i_398_ & i_395_;
						int i_401_ = i_399_ & i_395_;
						int i_402_ = i_398_ >> class_xa.anInt6289 * -2137349879;
						int i_403_ = i_399_ >> class_xa.anInt6289 * -2137349879;
						int i_404_ = (((is[i_402_][i_403_] * (class_xa.anInt6288 * -1212653763 - i_400_)) + is[i_402_ + 1][i_403_] * i_400_) >> class_xa.anInt6289 * -2137349879);
						int i_405_ = (((is[i_402_][i_403_ + 1] * (class_xa.anInt6288 * -1212653763 - i_400_)) + is[i_402_ + 1][i_403_ + 1] * i_400_) >> class_xa.anInt6289 * -2137349879);
						int i_406_ = (i_404_ * (class_xa.anInt6288 * -1212653763 - i_401_) + i_405_ * i_401_ >> class_xa.anInt6289 * -2137349879);
						i_404_ = (((is_324_[i_402_][i_403_] * (class_xa_316_.anInt6288 * -1212653763 - i_400_)) + is_324_[i_402_ + 1][i_403_] * i_400_) >> class_xa_316_.anInt6289 * -2137349879);
						i_405_ = (((is_324_[i_402_][i_403_ + 1] * (class_xa_316_.anInt6288 * -1212653763 - i_400_)) + is_324_[i_402_ + 1][i_403_ + 1] * i_400_) >> class_xa_316_.anInt6289 * -2137349879);
						int i_407_ = (i_404_ * (class_xa_316_.anInt6288 * -1212653763 - i_401_) + i_405_ * i_401_ >> class_xa_316_.anInt6289 * -2137349879);
						int i_408_ = i_406_ - i_407_ - i_315_;
						((Class387_Sub1) this).anIntArray7752[i_397_] = ((((Class387_Sub1) this).anIntArray7752[i_397_] << 8) / i_396_ * i_408_ >> 8) - (i_318_ - i_406_);
					}
					for (int i_409_ = ((Class387_Sub1) this).anInt7742; i_409_ < ((Class387_Sub1) this).anInt7799; i_409_++) {
						int i_410_ = (((Class387_Sub1) this).anIntArray7751[i_409_] + i_317_);
						int i_411_ = (((Class387_Sub1) this).anIntArray7753[i_409_] + i_319_);
						int i_412_ = i_410_ & i_395_;
						int i_413_ = i_411_ & i_395_;
						int i_414_ = i_410_ >> class_xa.anInt6289 * -2137349879;
						int i_415_ = i_411_ >> class_xa.anInt6289 * -2137349879;
						if (i_414_ >= 0 && i_414_ < class_xa.anInt6287 * -506105871 - 1 && (i_414_ < class_xa_316_.anInt6287 * -506105871 - 1) && i_415_ >= 0 && i_415_ < class_xa.anInt6286 * -1148794921 - 1 && (i_415_ < class_xa_316_.anInt6286 * -1148794921 - 1)) {
							int i_416_ = (((is[i_414_][i_415_] * (class_xa.anInt6288 * -1212653763 - i_412_)) + is[i_414_ + 1][i_415_] * i_412_) >> class_xa.anInt6289 * -2137349879);
							int i_417_ = (((is[i_414_][i_415_ + 1] * (class_xa.anInt6288 * -1212653763 - i_412_)) + is[i_414_ + 1][i_415_ + 1] * i_412_) >> class_xa.anInt6289 * -2137349879);
							int i_418_ = (i_416_ * (class_xa.anInt6288 * -1212653763 - i_413_) + i_417_ * i_413_ >> class_xa.anInt6289 * -2137349879);
							i_416_ = (((is_324_[i_414_][i_415_] * (class_xa_316_.anInt6288 * -1212653763 - i_412_)) + is_324_[i_414_ + 1][i_415_] * i_412_) >> class_xa_316_.anInt6289 * -2137349879);
							i_417_ = (((is_324_[i_414_][i_415_ + 1] * (class_xa_316_.anInt6288 * -1212653763 - i_412_)) + is_324_[i_414_ + 1][i_415_ + 1] * i_412_) >> class_xa_316_.anInt6289 * -2137349879);
							int i_419_ = ((i_416_ * (class_xa_316_.anInt6288 * -1212653763 - i_413_)) + i_417_ * i_413_ >> class_xa_316_.anInt6289 * -2137349879);
							int i_420_ = i_418_ - i_419_ - i_315_;
							((Class387_Sub1) this).anIntArray7752[i_409_] = (((((Class387_Sub1) this).anIntArray7752[i_409_]) << 8) / i_396_ * i_420_ >> 8) - (i_318_ - i_418_);
						}
					}
				}
				((Class387_Sub1) this).aBoolean7792 = false;
			}
		}
	}

	void method4800() {
		((Class387_Sub1) this).aClass1Array7755 = null;
		((Class387_Sub1) this).aClass1Array7786 = null;
		((Class387_Sub1) this).aClass5Array7740 = null;
		((Class387_Sub1) this).aBoolean7792 = false;
	}

	void method4734() {
		if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
			synchronized (this) {
				aBoolean4148 = false;
				this.notifyAll();
			}
		}
	}

	public int o() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7796;
	}

	boolean method4801(int i, int i_421_, float f, float f_422_, float f_423_, float f_424_, float f_425_, float f_426_) {
		if ((float) i_421_ < f && (float) i_421_ < f_422_ && (float) i_421_ < f_423_)
			return false;
		if ((float) i_421_ > f && (float) i_421_ > f_422_ && (float) i_421_ > f_423_)
			return false;
		if ((float) i < f_424_ && (float) i < f_425_ && (float) i < f_426_)
			return false;
		if ((float) i > f_424_ && (float) i > f_425_ && (float) i > f_426_)
			return false;
		return true;
	}

	public int dg() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7795;
	}

	void e(int i, int[] is, int i_427_, int i_428_, int i_429_, boolean bool, int i_430_, int[] is_431_) {
		int i_432_ = is.length;
		if (i == 0) {
			i_427_ <<= 4;
			i_428_ <<= 4;
			i_429_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_433_ = 0; i_433_ < ((Class387_Sub1) this).anInt7799; i_433_++) {
					((Class387_Sub1) this).anIntArray7751[i_433_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_433_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_433_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			int i_434_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_435_ = 0; i_435_ < i_432_; i_435_++) {
				int i_436_ = is[i_435_];
				if (i_436_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_437_ = ((Class387_Sub1) this).anIntArrayArray7778[i_436_];
					for (int i_438_ = 0; i_438_ < is_437_.length; i_438_++) {
						int i_439_ = is_437_[i_438_];
						if (((Class387_Sub1) this).aShortArray7816 == null || (i_430_ & (((Class387_Sub1) this).aShortArray7816[i_439_])) != 0) {
							((Class387_Sub1) this).anInt7782 += (((Class387_Sub1) this).anIntArray7751[i_439_]);
							((Class387_Sub1) this).anInt7783 += (((Class387_Sub1) this).anIntArray7752[i_439_]);
							((Class387_Sub1) this).anInt7781 += (((Class387_Sub1) this).anIntArray7753[i_439_]);
							i_434_++;
						}
					}
				}
			}
			if (i_434_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_434_ + i_427_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_434_ + i_428_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_434_ + i_429_;
				((Class387_Sub1) this).aBoolean7785 = true;
			} else {
				((Class387_Sub1) this).anInt7782 = i_427_;
				((Class387_Sub1) this).anInt7783 = i_428_;
				((Class387_Sub1) this).anInt7781 = i_429_;
			}
		} else if (i == 1) {
			if (is_431_ != null) {
				int i_440_ = ((is_431_[0] * i_427_ + is_431_[1] * i_428_ + is_431_[2] * i_429_ + 8192) >> 14);
				int i_441_ = ((is_431_[3] * i_427_ + is_431_[4] * i_428_ + is_431_[5] * i_429_ + 8192) >> 14);
				int i_442_ = ((is_431_[6] * i_427_ + is_431_[7] * i_428_ + is_431_[8] * i_429_ + 8192) >> 14);
				i_427_ = i_440_;
				i_428_ = i_441_;
				i_429_ = i_442_;
			}
			i_427_ <<= 4;
			i_428_ <<= 4;
			i_429_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_443_ = 0; i_443_ < ((Class387_Sub1) this).anInt7799; i_443_++) {
					((Class387_Sub1) this).anIntArray7751[i_443_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_443_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_443_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			for (int i_444_ = 0; i_444_ < i_432_; i_444_++) {
				int i_445_ = is[i_444_];
				if (i_445_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_446_ = ((Class387_Sub1) this).anIntArrayArray7778[i_445_];
					for (int i_447_ = 0; i_447_ < is_446_.length; i_447_++) {
						int i_448_ = is_446_[i_447_];
						if (((Class387_Sub1) this).aShortArray7816 == null || (i_430_ & (((Class387_Sub1) this).aShortArray7816[i_448_])) != 0) {
							((Class387_Sub1) this).anIntArray7751[i_448_] += i_427_;
							((Class387_Sub1) this).anIntArray7752[i_448_] += i_428_;
							((Class387_Sub1) this).anIntArray7753[i_448_] += i_429_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_431_ != null) {
				if (!((Class387_Sub1) this).aBoolean7780) {
					for (int i_449_ = 0; i_449_ < ((Class387_Sub1) this).anInt7799; i_449_++) {
						((Class387_Sub1) this).anIntArray7751[i_449_] <<= 4;
						((Class387_Sub1) this).anIntArray7752[i_449_] <<= 4;
						((Class387_Sub1) this).anIntArray7753[i_449_] <<= 4;
					}
					((Class387_Sub1) this).aBoolean7780 = true;
				}
				int i_450_ = is_431_[9] << 4;
				int i_451_ = is_431_[10] << 4;
				int i_452_ = is_431_[11] << 4;
				int i_453_ = is_431_[12] << 4;
				int i_454_ = is_431_[13] << 4;
				int i_455_ = is_431_[14] << 4;
				if (((Class387_Sub1) this).aBoolean7785) {
					int i_456_ = ((is_431_[0] * ((Class387_Sub1) this).anInt7782 + is_431_[3] * ((Class387_Sub1) this).anInt7783 + is_431_[6] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_457_ = ((is_431_[1] * ((Class387_Sub1) this).anInt7782 + is_431_[4] * ((Class387_Sub1) this).anInt7783 + is_431_[7] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_458_ = ((is_431_[2] * ((Class387_Sub1) this).anInt7782 + is_431_[5] * ((Class387_Sub1) this).anInt7783 + is_431_[8] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					i_456_ += i_453_;
					i_457_ += i_454_;
					i_458_ += i_455_;
					((Class387_Sub1) this).anInt7782 = i_456_;
					((Class387_Sub1) this).anInt7783 = i_457_;
					((Class387_Sub1) this).anInt7781 = i_458_;
					((Class387_Sub1) this).aBoolean7785 = false;
				}
				int[] is_459_ = new int[9];
				int i_460_ = Class220.anIntArray2474[i_427_];
				int i_461_ = Class220.anIntArray2483[i_427_];
				int i_462_ = Class220.anIntArray2474[i_428_];
				int i_463_ = Class220.anIntArray2483[i_428_];
				int i_464_ = Class220.anIntArray2474[i_429_];
				int i_465_ = Class220.anIntArray2483[i_429_];
				int i_466_ = i_461_ * i_464_ + 8192 >> 14;
				int i_467_ = i_461_ * i_465_ + 8192 >> 14;
				is_459_[0] = i_462_ * i_464_ + i_463_ * i_467_ + 8192 >> 14;
				is_459_[1] = -i_462_ * i_465_ + i_463_ * i_466_ + 8192 >> 14;
				is_459_[2] = i_463_ * i_460_ + 8192 >> 14;
				is_459_[3] = i_460_ * i_465_ + 8192 >> 14;
				is_459_[4] = i_460_ * i_464_ + 8192 >> 14;
				is_459_[5] = -i_461_;
				is_459_[6] = -i_463_ * i_464_ + i_462_ * i_467_ + 8192 >> 14;
				is_459_[7] = i_463_ * i_465_ + i_462_ * i_466_ + 8192 >> 14;
				is_459_[8] = i_462_ * i_460_ + 8192 >> 14;
				int i_468_ = ((is_459_[0] * -((Class387_Sub1) this).anInt7782 + is_459_[1] * -((Class387_Sub1) this).anInt7783 + is_459_[2] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_469_ = ((is_459_[3] * -((Class387_Sub1) this).anInt7782 + is_459_[4] * -((Class387_Sub1) this).anInt7783 + is_459_[5] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_470_ = ((is_459_[6] * -((Class387_Sub1) this).anInt7782 + is_459_[7] * -((Class387_Sub1) this).anInt7783 + is_459_[8] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_471_ = i_468_ + ((Class387_Sub1) this).anInt7782;
				int i_472_ = i_469_ + ((Class387_Sub1) this).anInt7783;
				int i_473_ = i_470_ + ((Class387_Sub1) this).anInt7781;
				int[] is_474_ = new int[9];
				for (int i_475_ = 0; i_475_ < 3; i_475_++) {
					for (int i_476_ = 0; i_476_ < 3; i_476_++) {
						int i_477_ = 0;
						for (int i_478_ = 0; i_478_ < 3; i_478_++)
							i_477_ += (is_459_[i_475_ * 3 + i_478_] * is_431_[i_476_ * 3 + i_478_]);
						is_474_[i_475_ * 3 + i_476_] = i_477_ + 8192 >> 14;
					}
				}
				int i_479_ = ((is_459_[0] * i_453_ + is_459_[1] * i_454_ + is_459_[2] * i_455_ + 8192) >> 14);
				int i_480_ = ((is_459_[3] * i_453_ + is_459_[4] * i_454_ + is_459_[5] * i_455_ + 8192) >> 14);
				int i_481_ = ((is_459_[6] * i_453_ + is_459_[7] * i_454_ + is_459_[8] * i_455_ + 8192) >> 14);
				i_479_ += i_471_;
				i_480_ += i_472_;
				i_481_ += i_473_;
				int[] is_482_ = new int[9];
				for (int i_483_ = 0; i_483_ < 3; i_483_++) {
					for (int i_484_ = 0; i_484_ < 3; i_484_++) {
						int i_485_ = 0;
						for (int i_486_ = 0; i_486_ < 3; i_486_++)
							i_485_ += (is_431_[i_483_ * 3 + i_486_] * is_474_[i_484_ + i_486_ * 3]);
						is_482_[i_483_ * 3 + i_484_] = i_485_ + 8192 >> 14;
					}
				}
				int i_487_ = ((is_431_[0] * i_479_ + is_431_[1] * i_480_ + is_431_[2] * i_481_ + 8192) >> 14);
				int i_488_ = ((is_431_[3] * i_479_ + is_431_[4] * i_480_ + is_431_[5] * i_481_ + 8192) >> 14);
				int i_489_ = ((is_431_[6] * i_479_ + is_431_[7] * i_480_ + is_431_[8] * i_481_ + 8192) >> 14);
				i_487_ += i_450_;
				i_488_ += i_451_;
				i_489_ += i_452_;
				for (int i_490_ = 0; i_490_ < i_432_; i_490_++) {
					int i_491_ = is[i_490_];
					if (i_491_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_492_ = (((Class387_Sub1) this).anIntArrayArray7778[i_491_]);
						for (int i_493_ = 0; i_493_ < is_492_.length; i_493_++) {
							int i_494_ = is_492_[i_493_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_430_ & (((Class387_Sub1) this).aShortArray7816[i_494_])) != 0)) {
								int i_495_ = (is_482_[0] * (((Class387_Sub1) this).anIntArray7751[i_494_]) + is_482_[1] * (((Class387_Sub1) this).anIntArray7752[i_494_]) + is_482_[2] * (((Class387_Sub1) this).anIntArray7753[i_494_]) + 8192) >> 14;
								int i_496_ = (is_482_[3] * (((Class387_Sub1) this).anIntArray7751[i_494_]) + is_482_[4] * (((Class387_Sub1) this).anIntArray7752[i_494_]) + is_482_[5] * (((Class387_Sub1) this).anIntArray7753[i_494_]) + 8192) >> 14;
								int i_497_ = (is_482_[6] * (((Class387_Sub1) this).anIntArray7751[i_494_]) + is_482_[7] * (((Class387_Sub1) this).anIntArray7752[i_494_]) + is_482_[8] * (((Class387_Sub1) this).anIntArray7753[i_494_]) + 8192) >> 14;
								i_495_ += i_487_;
								i_496_ += i_488_;
								i_497_ += i_489_;
								((Class387_Sub1) this).anIntArray7751[i_494_] = i_495_;
								((Class387_Sub1) this).anIntArray7752[i_494_] = i_496_;
								((Class387_Sub1) this).anIntArray7753[i_494_] = i_497_;
							}
						}
					}
				}
			} else {
				for (int i_498_ = 0; i_498_ < i_432_; i_498_++) {
					int i_499_ = is[i_498_];
					if (i_499_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_500_ = (((Class387_Sub1) this).anIntArrayArray7778[i_499_]);
						for (int i_501_ = 0; i_501_ < is_500_.length; i_501_++) {
							int i_502_ = is_500_[i_501_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_430_ & (((Class387_Sub1) this).aShortArray7816[i_502_])) != 0)) {
								((Class387_Sub1) this).anIntArray7751[i_502_] -= ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_502_] -= ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_502_] -= ((Class387_Sub1) this).anInt7781;
								if (i_429_ != 0) {
									int i_503_ = Class220.anIntArray2483[i_429_];
									int i_504_ = Class220.anIntArray2474[i_429_];
									int i_505_ = ((((Class387_Sub1) this).anIntArray7752[i_502_]) * i_503_ + (((Class387_Sub1) this).anIntArray7751[i_502_]) * i_504_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7752[i_502_] = ((((Class387_Sub1) this).anIntArray7752[i_502_]) * i_504_ - (((Class387_Sub1) this).anIntArray7751[i_502_]) * i_503_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7751[i_502_] = i_505_;
								}
								if (i_427_ != 0) {
									int i_506_ = Class220.anIntArray2483[i_427_];
									int i_507_ = Class220.anIntArray2474[i_427_];
									int i_508_ = ((((Class387_Sub1) this).anIntArray7752[i_502_]) * i_507_ - (((Class387_Sub1) this).anIntArray7753[i_502_]) * i_506_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7753[i_502_] = ((((Class387_Sub1) this).anIntArray7752[i_502_]) * i_506_ + (((Class387_Sub1) this).anIntArray7753[i_502_]) * i_507_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7752[i_502_] = i_508_;
								}
								if (i_428_ != 0) {
									int i_509_ = Class220.anIntArray2483[i_428_];
									int i_510_ = Class220.anIntArray2474[i_428_];
									int i_511_ = ((((Class387_Sub1) this).anIntArray7753[i_502_]) * i_509_ + (((Class387_Sub1) this).anIntArray7751[i_502_]) * i_510_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7753[i_502_] = ((((Class387_Sub1) this).anIntArray7753[i_502_]) * i_510_ - (((Class387_Sub1) this).anIntArray7751[i_502_]) * i_509_ + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7751[i_502_] = i_511_;
								}
								((Class387_Sub1) this).anIntArray7751[i_502_] += ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_502_] += ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_502_] += ((Class387_Sub1) this).anInt7781;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_431_ != null) {
				if (!((Class387_Sub1) this).aBoolean7780) {
					for (int i_512_ = 0; i_512_ < ((Class387_Sub1) this).anInt7799; i_512_++) {
						((Class387_Sub1) this).anIntArray7751[i_512_] <<= 4;
						((Class387_Sub1) this).anIntArray7752[i_512_] <<= 4;
						((Class387_Sub1) this).anIntArray7753[i_512_] <<= 4;
					}
					((Class387_Sub1) this).aBoolean7780 = true;
				}
				int i_513_ = is_431_[9] << 4;
				int i_514_ = is_431_[10] << 4;
				int i_515_ = is_431_[11] << 4;
				int i_516_ = is_431_[12] << 4;
				int i_517_ = is_431_[13] << 4;
				int i_518_ = is_431_[14] << 4;
				if (((Class387_Sub1) this).aBoolean7785) {
					int i_519_ = ((is_431_[0] * ((Class387_Sub1) this).anInt7782 + is_431_[3] * ((Class387_Sub1) this).anInt7783 + is_431_[6] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_520_ = ((is_431_[1] * ((Class387_Sub1) this).anInt7782 + is_431_[4] * ((Class387_Sub1) this).anInt7783 + is_431_[7] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_521_ = ((is_431_[2] * ((Class387_Sub1) this).anInt7782 + is_431_[5] * ((Class387_Sub1) this).anInt7783 + is_431_[8] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					i_519_ += i_516_;
					i_520_ += i_517_;
					i_521_ += i_518_;
					((Class387_Sub1) this).anInt7782 = i_519_;
					((Class387_Sub1) this).anInt7783 = i_520_;
					((Class387_Sub1) this).anInt7781 = i_521_;
					((Class387_Sub1) this).aBoolean7785 = false;
				}
				int i_522_ = i_427_ << 15 >> 7;
				int i_523_ = i_428_ << 15 >> 7;
				int i_524_ = i_429_ << 15 >> 7;
				int i_525_ = i_522_ * -((Class387_Sub1) this).anInt7782 + 8192 >> 14;
				int i_526_ = i_523_ * -((Class387_Sub1) this).anInt7783 + 8192 >> 14;
				int i_527_ = i_524_ * -((Class387_Sub1) this).anInt7781 + 8192 >> 14;
				int i_528_ = i_525_ + ((Class387_Sub1) this).anInt7782;
				int i_529_ = i_526_ + ((Class387_Sub1) this).anInt7783;
				int i_530_ = i_527_ + ((Class387_Sub1) this).anInt7781;
				int[] is_531_ = new int[9];
				is_531_[0] = i_522_ * is_431_[0] + 8192 >> 14;
				is_531_[1] = i_522_ * is_431_[3] + 8192 >> 14;
				is_531_[2] = i_522_ * is_431_[6] + 8192 >> 14;
				is_531_[3] = i_523_ * is_431_[1] + 8192 >> 14;
				is_531_[4] = i_523_ * is_431_[4] + 8192 >> 14;
				is_531_[5] = i_523_ * is_431_[7] + 8192 >> 14;
				is_531_[6] = i_524_ * is_431_[2] + 8192 >> 14;
				is_531_[7] = i_524_ * is_431_[5] + 8192 >> 14;
				is_531_[8] = i_524_ * is_431_[8] + 8192 >> 14;
				int i_532_ = i_522_ * i_516_ + 8192 >> 14;
				int i_533_ = i_523_ * i_517_ + 8192 >> 14;
				int i_534_ = i_524_ * i_518_ + 8192 >> 14;
				i_532_ += i_528_;
				i_533_ += i_529_;
				i_534_ += i_530_;
				int[] is_535_ = new int[9];
				for (int i_536_ = 0; i_536_ < 3; i_536_++) {
					for (int i_537_ = 0; i_537_ < 3; i_537_++) {
						int i_538_ = 0;
						for (int i_539_ = 0; i_539_ < 3; i_539_++)
							i_538_ += (is_431_[i_536_ * 3 + i_539_] * is_531_[i_537_ + i_539_ * 3]);
						is_535_[i_536_ * 3 + i_537_] = i_538_ + 8192 >> 14;
					}
				}
				int i_540_ = ((is_431_[0] * i_532_ + is_431_[1] * i_533_ + is_431_[2] * i_534_ + 8192) >> 14);
				int i_541_ = ((is_431_[3] * i_532_ + is_431_[4] * i_533_ + is_431_[5] * i_534_ + 8192) >> 14);
				int i_542_ = ((is_431_[6] * i_532_ + is_431_[7] * i_533_ + is_431_[8] * i_534_ + 8192) >> 14);
				i_540_ += i_513_;
				i_541_ += i_514_;
				i_542_ += i_515_;
				for (int i_543_ = 0; i_543_ < i_432_; i_543_++) {
					int i_544_ = is[i_543_];
					if (i_544_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_545_ = (((Class387_Sub1) this).anIntArrayArray7778[i_544_]);
						for (int i_546_ = 0; i_546_ < is_545_.length; i_546_++) {
							int i_547_ = is_545_[i_546_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_430_ & (((Class387_Sub1) this).aShortArray7816[i_547_])) != 0)) {
								int i_548_ = (is_535_[0] * (((Class387_Sub1) this).anIntArray7751[i_547_]) + is_535_[1] * (((Class387_Sub1) this).anIntArray7752[i_547_]) + is_535_[2] * (((Class387_Sub1) this).anIntArray7753[i_547_]) + 8192) >> 14;
								int i_549_ = (is_535_[3] * (((Class387_Sub1) this).anIntArray7751[i_547_]) + is_535_[4] * (((Class387_Sub1) this).anIntArray7752[i_547_]) + is_535_[5] * (((Class387_Sub1) this).anIntArray7753[i_547_]) + 8192) >> 14;
								int i_550_ = (is_535_[6] * (((Class387_Sub1) this).anIntArray7751[i_547_]) + is_535_[7] * (((Class387_Sub1) this).anIntArray7752[i_547_]) + is_535_[8] * (((Class387_Sub1) this).anIntArray7753[i_547_]) + 8192) >> 14;
								i_548_ += i_540_;
								i_549_ += i_541_;
								i_550_ += i_542_;
								((Class387_Sub1) this).anIntArray7751[i_547_] = i_548_;
								((Class387_Sub1) this).anIntArray7752[i_547_] = i_549_;
								((Class387_Sub1) this).anIntArray7753[i_547_] = i_550_;
							}
						}
					}
				}
			} else {
				for (int i_551_ = 0; i_551_ < i_432_; i_551_++) {
					int i_552_ = is[i_551_];
					if (i_552_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_553_ = (((Class387_Sub1) this).anIntArrayArray7778[i_552_]);
						for (int i_554_ = 0; i_554_ < is_553_.length; i_554_++) {
							int i_555_ = is_553_[i_554_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_430_ & (((Class387_Sub1) this).aShortArray7816[i_555_])) != 0)) {
								((Class387_Sub1) this).anIntArray7751[i_555_] -= ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_555_] -= ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_555_] -= ((Class387_Sub1) this).anInt7781;
								((Class387_Sub1) this).anIntArray7751[i_555_] = (((Class387_Sub1) this).anIntArray7751[i_555_]) * i_427_ / 128;
								((Class387_Sub1) this).anIntArray7752[i_555_] = (((Class387_Sub1) this).anIntArray7752[i_555_]) * i_428_ / 128;
								((Class387_Sub1) this).anIntArray7753[i_555_] = (((Class387_Sub1) this).anIntArray7753[i_555_]) * i_429_ / 128;
								((Class387_Sub1) this).anIntArray7751[i_555_] += ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_555_] += ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_555_] += ((Class387_Sub1) this).anInt7781;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null && ((Class387_Sub1) this).aByteArray7773 != null) {
				for (int i_556_ = 0; i_556_ < i_432_; i_556_++) {
					int i_557_ = is[i_556_];
					if (i_557_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_558_ = (((Class387_Sub1) this).anIntArrayArray7779[i_557_]);
						for (int i_559_ = 0; i_559_ < is_558_.length; i_559_++) {
							int i_560_ = is_558_[i_559_];
							if (((Class387_Sub1) this).aShortArray7776 == null || ((i_430_ & (((Class387_Sub1) this).aShortArray7776[i_560_])) != 0)) {
								int i_561_ = (((((Class387_Sub1) this).aByteArray7773[i_560_]) & 0xff) + i_427_ * 8);
								if (i_561_ < 0)
									i_561_ = 0;
								else if (i_561_ > 255)
									i_561_ = 255;
								((Class387_Sub1) this).aByteArray7773[i_560_] = (byte) i_561_;
							}
						}
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_562_ = 0; i_562_ < ((Class387_Sub1) this).anInt7788; i_562_++) {
						Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_562_];
						Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_562_];
						((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | 255 - ((((Class387_Sub1) this).aByteArray7773[(((Class16) class16).anInt226 * -1295149283)]) & 0xff) << 24) * -564629049;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null) {
				for (int i_563_ = 0; i_563_ < i_432_; i_563_++) {
					int i_564_ = is[i_563_];
					if (i_564_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_565_ = (((Class387_Sub1) this).anIntArrayArray7779[i_564_]);
						for (int i_566_ = 0; i_566_ < is_565_.length; i_566_++) {
							int i_567_ = is_565_[i_566_];
							if (((Class387_Sub1) this).aShortArray7776 == null || ((i_430_ & (((Class387_Sub1) this).aShortArray7776[i_567_])) != 0)) {
								int i_568_ = ((((Class387_Sub1) this).aShortArray7775[i_567_]) & 0xffff);
								int i_569_ = i_568_ >> 10 & 0x3f;
								int i_570_ = i_568_ >> 7 & 0x7;
								int i_571_ = i_568_ & 0x7f;
								i_569_ = i_569_ + i_427_ & 0x3f;
								i_570_ += i_428_;
								if (i_570_ < 0)
									i_570_ = 0;
								else if (i_570_ > 7)
									i_570_ = 7;
								i_571_ += i_429_;
								if (i_571_ < 0)
									i_571_ = 0;
								else if (i_571_ > 127)
									i_571_ = 127;
								((Class387_Sub1) this).aShortArray7775[i_567_] = (short) (i_569_ << 10 | i_570_ << 7 | i_571_);
							}
						}
						((Class387_Sub1) this).aBoolean7733 = true;
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_572_ = 0; i_572_ < ((Class387_Sub1) this).anInt7788; i_572_++) {
						Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_572_];
						Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_572_];
						((Class18) class18).anInt254 = (((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | (Class379.anIntArray4096[(Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0)) & 0xffff]) & 0xffffff) * -564629049);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_573_ = 0; i_573_ < i_432_; i_573_++) {
					int i_574_ = is[i_573_];
					if (i_574_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_575_ = (((Class387_Sub1) this).anIntArrayArray7791[i_574_]);
						for (int i_576_ = 0; i_576_ < is_575_.length; i_576_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_575_[i_576_]]);
							((Class18) class18).anInt247 += i_427_ * 1747422061;
							((Class18) class18).anInt244 += i_428_ * 1370325433;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_577_ = 0; i_577_ < i_432_; i_577_++) {
					int i_578_ = is[i_577_];
					if (i_578_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_579_ = (((Class387_Sub1) this).anIntArrayArray7791[i_578_]);
						for (int i_580_ = 0; i_580_ < is_579_.length; i_580_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_579_[i_580_]]);
							((Class18) class18).aFloat245 = (((Class18) class18).aFloat245 * (float) i_427_ / 128.0F);
							((Class18) class18).aFloat248 = (((Class18) class18).aFloat248 * (float) i_428_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_581_ = 0; i_581_ < i_432_; i_581_++) {
					int i_582_ = is[i_581_];
					if (i_582_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_583_ = (((Class387_Sub1) this).anIntArrayArray7791[i_582_]);
						for (int i_584_ = 0; i_584_ < is_583_.length; i_584_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_583_[i_584_]]);
							((Class18) class18).anInt249 = ((((Class18) class18).anInt249 * -988477815 + i_427_) & 0x3fff) * -839233607;
						}
					}
				}
			}
		}
	}

	void w(int i, int i_585_, int i_586_, int i_587_) {
		if (i == 0) {
			int i_588_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_589_ = 0; i_589_ < ((Class387_Sub1) this).anInt7799; i_589_++) {
				((Class387_Sub1) this).anInt7782 += ((Class387_Sub1) this).anIntArray7751[i_589_];
				((Class387_Sub1) this).anInt7783 += ((Class387_Sub1) this).anIntArray7752[i_589_];
				((Class387_Sub1) this).anInt7781 += ((Class387_Sub1) this).anIntArray7753[i_589_];
				i_588_++;
			}
			if (i_588_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_588_ + i_585_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_588_ + i_586_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_588_ + i_587_;
			} else {
				((Class387_Sub1) this).anInt7782 = i_585_;
				((Class387_Sub1) this).anInt7783 = i_586_;
				((Class387_Sub1) this).anInt7781 = i_587_;
			}
		} else if (i == 1) {
			for (int i_590_ = 0; i_590_ < ((Class387_Sub1) this).anInt7799; i_590_++) {
				((Class387_Sub1) this).anIntArray7751[i_590_] += i_585_;
				((Class387_Sub1) this).anIntArray7752[i_590_] += i_586_;
				((Class387_Sub1) this).anIntArray7753[i_590_] += i_587_;
			}
		} else if (i == 2) {
			for (int i_591_ = 0; i_591_ < ((Class387_Sub1) this).anInt7799; i_591_++) {
				((Class387_Sub1) this).anIntArray7751[i_591_] -= ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_591_] -= ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_591_] -= ((Class387_Sub1) this).anInt7781;
				if (i_587_ != 0) {
					int i_592_ = Class220.anIntArray2483[i_587_];
					int i_593_ = Class220.anIntArray2474[i_587_];
					int i_594_ = (((((Class387_Sub1) this).anIntArray7752[i_591_] * i_592_) + (((Class387_Sub1) this).anIntArray7751[i_591_] * i_593_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray7752[i_591_] = ((((Class387_Sub1) this).anIntArray7752[i_591_] * i_593_) - (((Class387_Sub1) this).anIntArray7751[i_591_] * i_592_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray7751[i_591_] = i_594_;
				}
				if (i_585_ != 0) {
					int i_595_ = Class220.anIntArray2483[i_585_];
					int i_596_ = Class220.anIntArray2474[i_585_];
					int i_597_ = (((((Class387_Sub1) this).anIntArray7752[i_591_] * i_596_) - (((Class387_Sub1) this).anIntArray7753[i_591_] * i_595_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray7753[i_591_] = ((((Class387_Sub1) this).anIntArray7752[i_591_] * i_595_) + (((Class387_Sub1) this).anIntArray7753[i_591_] * i_596_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray7752[i_591_] = i_597_;
				}
				if (i_586_ != 0) {
					int i_598_ = Class220.anIntArray2483[i_586_];
					int i_599_ = Class220.anIntArray2474[i_586_];
					int i_600_ = (((((Class387_Sub1) this).anIntArray7753[i_591_] * i_598_) + (((Class387_Sub1) this).anIntArray7751[i_591_] * i_599_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray7753[i_591_] = ((((Class387_Sub1) this).anIntArray7753[i_591_] * i_599_) - (((Class387_Sub1) this).anIntArray7751[i_591_] * i_598_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray7751[i_591_] = i_600_;
				}
				((Class387_Sub1) this).anIntArray7751[i_591_] += ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_591_] += ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_591_] += ((Class387_Sub1) this).anInt7781;
			}
		} else if (i == 3) {
			for (int i_601_ = 0; i_601_ < ((Class387_Sub1) this).anInt7799; i_601_++) {
				((Class387_Sub1) this).anIntArray7751[i_601_] -= ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_601_] -= ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_601_] -= ((Class387_Sub1) this).anInt7781;
				((Class387_Sub1) this).anIntArray7751[i_601_] = (((Class387_Sub1) this).anIntArray7751[i_601_] * i_585_ / 128);
				((Class387_Sub1) this).anIntArray7752[i_601_] = (((Class387_Sub1) this).anIntArray7752[i_601_] * i_586_ / 128);
				((Class387_Sub1) this).anIntArray7753[i_601_] = (((Class387_Sub1) this).anIntArray7753[i_601_] * i_587_ / 128);
				((Class387_Sub1) this).anIntArray7751[i_601_] += ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_601_] += ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_601_] += ((Class387_Sub1) this).anInt7781;
			}
		} else if (i == 5) {
			for (int i_602_ = 0; i_602_ < ((Class387_Sub1) this).anInt7757; i_602_++) {
				int i_603_ = ((((Class387_Sub1) this).aByteArray7773[i_602_] & 0xff) + i_585_ * 8);
				if (i_603_ < 0)
					i_603_ = 0;
				else if (i_603_ > 255)
					i_603_ = 255;
				((Class387_Sub1) this).aByteArray7773[i_602_] = (byte) i_603_;
			}
			if (((Class387_Sub1) this).aClass16Array7789 != null) {
				for (int i_604_ = 0; i_604_ < ((Class387_Sub1) this).anInt7788; i_604_++) {
					Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_604_];
					Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_604_];
					((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | (255 - ((((Class387_Sub1) this).aByteArray7773[((Class16) class16).anInt226 * -1295149283]) & 0xff)) << 24) * -564629049;
				}
			}
		} else if (i == 7) {
			for (int i_605_ = 0; i_605_ < ((Class387_Sub1) this).anInt7757; i_605_++) {
				int i_606_ = ((Class387_Sub1) this).aShortArray7775[i_605_] & 0xffff;
				int i_607_ = i_606_ >> 10 & 0x3f;
				int i_608_ = i_606_ >> 7 & 0x7;
				int i_609_ = i_606_ & 0x7f;
				i_607_ = i_607_ + i_585_ & 0x3f;
				i_608_ += i_586_;
				if (i_608_ < 0)
					i_608_ = 0;
				else if (i_608_ > 7)
					i_608_ = 7;
				i_609_ += i_587_;
				if (i_609_ < 0)
					i_609_ = 0;
				else if (i_609_ > 127)
					i_609_ = 127;
				((Class387_Sub1) this).aShortArray7775[i_605_] = (short) (i_607_ << 10 | i_608_ << 7 | i_609_);
			}
			((Class387_Sub1) this).aBoolean7733 = true;
			if (((Class387_Sub1) this).aClass16Array7789 != null) {
				for (int i_610_ = 0; i_610_ < ((Class387_Sub1) this).anInt7788; i_610_++) {
					Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_610_];
					Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_610_];
					((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | ((Class379.anIntArray4096[Class173.method1823(((((Class387_Sub1) this).aShortArray7775[((((Class16) class16).anInt226) * -1295149283)]) & 0xffff), (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
				}
			}
		} else if (i == 8) {
			for (int i_611_ = 0; i_611_ < ((Class387_Sub1) this).anInt7788; i_611_++) {
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_611_];
				((Class18) class18).anInt247 += i_585_ * 1747422061;
				((Class18) class18).anInt244 += i_586_ * 1370325433;
			}
		} else if (i == 10) {
			for (int i_612_ = 0; i_612_ < ((Class387_Sub1) this).anInt7788; i_612_++) {
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_612_];
				((Class18) class18).aFloat245 = ((Class18) class18).aFloat245 * (float) i_585_ / 128.0F;
				((Class18) class18).aFloat248 = ((Class18) class18).aFloat248 * (float) i_586_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_613_ = 0; i_613_ < ((Class387_Sub1) this).anInt7788; i_613_++) {
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_613_];
				((Class18) class18).anInt249 = (((Class18) class18).anInt249 * -988477815 + i_585_ & 0x3fff) * -839233607;
			}
		}
	}

	public void method4739(Matrix3f class222, Class302_Sub1 class302_sub1, int i) {
		method4811(class222, class302_sub1, i);
	}

	void method4738(int i, int[] is, int i_614_, int i_615_, int i_616_, int i_617_, boolean bool) {
		int i_618_ = is.length;
		if (i == 0) {
			i_614_ <<= 4;
			i_615_ <<= 4;
			i_616_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_619_ = 0; i_619_ < ((Class387_Sub1) this).anInt7799; i_619_++) {
					((Class387_Sub1) this).anIntArray7751[i_619_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_619_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_619_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			int i_620_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_621_ = 0; i_621_ < i_618_; i_621_++) {
				int i_622_ = is[i_621_];
				if (i_622_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_623_ = ((Class387_Sub1) this).anIntArrayArray7778[i_622_];
					for (int i_624_ = 0; i_624_ < is_623_.length; i_624_++) {
						int i_625_ = is_623_[i_624_];
						((Class387_Sub1) this).anInt7782 += ((Class387_Sub1) this).anIntArray7751[i_625_];
						((Class387_Sub1) this).anInt7783 += ((Class387_Sub1) this).anIntArray7752[i_625_];
						((Class387_Sub1) this).anInt7781 += ((Class387_Sub1) this).anIntArray7753[i_625_];
						i_620_++;
					}
				}
			}
			if (i_620_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_620_ + i_614_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_620_ + i_615_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_620_ + i_616_;
			} else {
				((Class387_Sub1) this).anInt7782 = i_614_;
				((Class387_Sub1) this).anInt7783 = i_615_;
				((Class387_Sub1) this).anInt7781 = i_616_;
			}
		} else if (i == 1) {
			i_614_ <<= 4;
			i_615_ <<= 4;
			i_616_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_626_ = 0; i_626_ < ((Class387_Sub1) this).anInt7799; i_626_++) {
					((Class387_Sub1) this).anIntArray7751[i_626_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_626_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_626_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			for (int i_627_ = 0; i_627_ < i_618_; i_627_++) {
				int i_628_ = is[i_627_];
				if (i_628_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_629_ = ((Class387_Sub1) this).anIntArrayArray7778[i_628_];
					for (int i_630_ = 0; i_630_ < is_629_.length; i_630_++) {
						int i_631_ = is_629_[i_630_];
						((Class387_Sub1) this).anIntArray7751[i_631_] += i_614_;
						((Class387_Sub1) this).anIntArray7752[i_631_] += i_615_;
						((Class387_Sub1) this).anIntArray7753[i_631_] += i_616_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_632_ = 0; i_632_ < i_618_; i_632_++) {
				int i_633_ = is[i_632_];
				if (i_633_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_634_ = ((Class387_Sub1) this).anIntArrayArray7778[i_633_];
					if ((i_617_ & 0x1) == 0) {
						for (int i_635_ = 0; i_635_ < is_634_.length; i_635_++) {
							int i_636_ = is_634_[i_635_];
							((Class387_Sub1) this).anIntArray7751[i_636_] -= ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_636_] -= ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_636_] -= ((Class387_Sub1) this).anInt7781;
							if (i_616_ != 0) {
								int i_637_ = Class220.anIntArray2483[i_616_];
								int i_638_ = Class220.anIntArray2474[i_616_];
								int i_639_ = (((((Class387_Sub1) this).anIntArray7752[i_636_]) * i_637_ + (((Class387_Sub1) this).anIntArray7751[i_636_]) * i_638_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7752[i_636_] = ((((Class387_Sub1) this).anIntArray7752[i_636_]) * i_638_ - (((Class387_Sub1) this).anIntArray7751[i_636_]) * i_637_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_636_] = i_639_;
							}
							if (i_614_ != 0) {
								int i_640_ = Class220.anIntArray2483[i_614_];
								int i_641_ = Class220.anIntArray2474[i_614_];
								int i_642_ = (((((Class387_Sub1) this).anIntArray7752[i_636_]) * i_641_ - (((Class387_Sub1) this).anIntArray7753[i_636_]) * i_640_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_636_] = ((((Class387_Sub1) this).anIntArray7752[i_636_]) * i_640_ + (((Class387_Sub1) this).anIntArray7753[i_636_]) * i_641_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7752[i_636_] = i_642_;
							}
							if (i_615_ != 0) {
								int i_643_ = Class220.anIntArray2483[i_615_];
								int i_644_ = Class220.anIntArray2474[i_615_];
								int i_645_ = (((((Class387_Sub1) this).anIntArray7753[i_636_]) * i_643_ + (((Class387_Sub1) this).anIntArray7751[i_636_]) * i_644_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_636_] = ((((Class387_Sub1) this).anIntArray7753[i_636_]) * i_644_ - (((Class387_Sub1) this).anIntArray7751[i_636_]) * i_643_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_636_] = i_645_;
							}
							((Class387_Sub1) this).anIntArray7751[i_636_] += ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_636_] += ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_636_] += ((Class387_Sub1) this).anInt7781;
						}
					} else {
						for (int i_646_ = 0; i_646_ < is_634_.length; i_646_++) {
							int i_647_ = is_634_[i_646_];
							((Class387_Sub1) this).anIntArray7751[i_647_] -= ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_647_] -= ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_647_] -= ((Class387_Sub1) this).anInt7781;
							if (i_614_ != 0) {
								int i_648_ = Class220.anIntArray2483[i_614_];
								int i_649_ = Class220.anIntArray2474[i_614_];
								int i_650_ = (((((Class387_Sub1) this).anIntArray7752[i_647_]) * i_649_ - (((Class387_Sub1) this).anIntArray7753[i_647_]) * i_648_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_647_] = ((((Class387_Sub1) this).anIntArray7752[i_647_]) * i_648_ + (((Class387_Sub1) this).anIntArray7753[i_647_]) * i_649_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7752[i_647_] = i_650_;
							}
							if (i_616_ != 0) {
								int i_651_ = Class220.anIntArray2483[i_616_];
								int i_652_ = Class220.anIntArray2474[i_616_];
								int i_653_ = (((((Class387_Sub1) this).anIntArray7752[i_647_]) * i_651_ + (((Class387_Sub1) this).anIntArray7751[i_647_]) * i_652_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7752[i_647_] = ((((Class387_Sub1) this).anIntArray7752[i_647_]) * i_652_ - (((Class387_Sub1) this).anIntArray7751[i_647_]) * i_651_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_647_] = i_653_;
							}
							if (i_615_ != 0) {
								int i_654_ = Class220.anIntArray2483[i_615_];
								int i_655_ = Class220.anIntArray2474[i_615_];
								int i_656_ = (((((Class387_Sub1) this).anIntArray7753[i_647_]) * i_654_ + (((Class387_Sub1) this).anIntArray7751[i_647_]) * i_655_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_647_] = ((((Class387_Sub1) this).anIntArray7753[i_647_]) * i_655_ - (((Class387_Sub1) this).anIntArray7751[i_647_]) * i_654_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_647_] = i_656_;
							}
							((Class387_Sub1) this).anIntArray7751[i_647_] += ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_647_] += ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_647_] += ((Class387_Sub1) this).anInt7781;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_657_ = 0; i_657_ < i_618_; i_657_++) {
				int i_658_ = is[i_657_];
				if (i_658_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_659_ = ((Class387_Sub1) this).anIntArrayArray7778[i_658_];
					for (int i_660_ = 0; i_660_ < is_659_.length; i_660_++) {
						int i_661_ = is_659_[i_660_];
						((Class387_Sub1) this).anIntArray7751[i_661_] -= ((Class387_Sub1) this).anInt7782;
						((Class387_Sub1) this).anIntArray7752[i_661_] -= ((Class387_Sub1) this).anInt7783;
						((Class387_Sub1) this).anIntArray7753[i_661_] -= ((Class387_Sub1) this).anInt7781;
						((Class387_Sub1) this).anIntArray7751[i_661_] = (((Class387_Sub1) this).anIntArray7751[i_661_] * i_614_ / 128);
						((Class387_Sub1) this).anIntArray7752[i_661_] = (((Class387_Sub1) this).anIntArray7752[i_661_] * i_615_ / 128);
						((Class387_Sub1) this).anIntArray7753[i_661_] = (((Class387_Sub1) this).anIntArray7753[i_661_] * i_616_ / 128);
						((Class387_Sub1) this).anIntArray7751[i_661_] += ((Class387_Sub1) this).anInt7782;
						((Class387_Sub1) this).anIntArray7752[i_661_] += ((Class387_Sub1) this).anInt7783;
						((Class387_Sub1) this).anIntArray7753[i_661_] += ((Class387_Sub1) this).anInt7781;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null && ((Class387_Sub1) this).aByteArray7773 != null) {
				for (int i_662_ = 0; i_662_ < i_618_; i_662_++) {
					int i_663_ = is[i_662_];
					if (i_663_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_664_ = (((Class387_Sub1) this).anIntArrayArray7779[i_663_]);
						for (int i_665_ = 0; i_665_ < is_664_.length; i_665_++) {
							int i_666_ = is_664_[i_665_];
							int i_667_ = (((((Class387_Sub1) this).aByteArray7773[i_666_]) & 0xff) + i_614_ * 8);
							if (i_667_ < 0)
								i_667_ = 0;
							else if (i_667_ > 255)
								i_667_ = 255;
							((Class387_Sub1) this).aByteArray7773[i_666_] = (byte) i_667_;
						}
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_668_ = 0; i_668_ < ((Class387_Sub1) this).anInt7788; i_668_++) {
						Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_668_];
						Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_668_];
						((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | 255 - ((((Class387_Sub1) this).aByteArray7773[(((Class16) class16).anInt226 * -1295149283)]) & 0xff) << 24) * -564629049;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null) {
				for (int i_669_ = 0; i_669_ < i_618_; i_669_++) {
					int i_670_ = is[i_669_];
					if (i_670_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_671_ = (((Class387_Sub1) this).anIntArrayArray7779[i_670_]);
						for (int i_672_ = 0; i_672_ < is_671_.length; i_672_++) {
							int i_673_ = is_671_[i_672_];
							int i_674_ = ((((Class387_Sub1) this).aShortArray7775[i_673_]) & 0xffff);
							int i_675_ = i_674_ >> 10 & 0x3f;
							int i_676_ = i_674_ >> 7 & 0x7;
							int i_677_ = i_674_ & 0x7f;
							i_675_ = i_675_ + i_614_ & 0x3f;
							i_676_ += i_615_;
							if (i_676_ < 0)
								i_676_ = 0;
							else if (i_676_ > 7)
								i_676_ = 7;
							i_677_ += i_616_;
							if (i_677_ < 0)
								i_677_ = 0;
							else if (i_677_ > 127)
								i_677_ = 127;
							((Class387_Sub1) this).aShortArray7775[i_673_] = (short) (i_675_ << 10 | i_676_ << 7 | i_677_);
						}
						((Class387_Sub1) this).aBoolean7733 = true;
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_678_ = 0; i_678_ < ((Class387_Sub1) this).anInt7788; i_678_++) {
						Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_678_];
						Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_678_];
						((Class18) class18).anInt254 = (((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | (Class379.anIntArray4096[(Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0)) & 0xffff]) & 0xffffff) * -564629049);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_679_ = 0; i_679_ < i_618_; i_679_++) {
					int i_680_ = is[i_679_];
					if (i_680_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_681_ = (((Class387_Sub1) this).anIntArrayArray7791[i_680_]);
						for (int i_682_ = 0; i_682_ < is_681_.length; i_682_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_681_[i_682_]]);
							((Class18) class18).anInt247 += i_614_ * 1747422061;
							((Class18) class18).anInt244 += i_615_ * 1370325433;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_683_ = 0; i_683_ < i_618_; i_683_++) {
					int i_684_ = is[i_683_];
					if (i_684_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_685_ = (((Class387_Sub1) this).anIntArrayArray7791[i_684_]);
						for (int i_686_ = 0; i_686_ < is_685_.length; i_686_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_685_[i_686_]]);
							((Class18) class18).aFloat245 = (((Class18) class18).aFloat245 * (float) i_614_ / 128.0F);
							((Class18) class18).aFloat248 = (((Class18) class18).aFloat248 * (float) i_615_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_687_ = 0; i_687_ < i_618_; i_687_++) {
					int i_688_ = is[i_687_];
					if (i_688_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_689_ = (((Class387_Sub1) this).anIntArrayArray7791[i_688_]);
						for (int i_690_ = 0; i_690_ < is_689_.length; i_690_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_689_[i_690_]]);
							((Class18) class18).anInt249 = ((((Class18) class18).anInt249 * -988477815 + i_614_) & 0x3fff) * -839233607;
						}
					}
				}
			}
		}
	}

	void cv(int i, int i_691_, int i_692_, int i_693_) {
		if (i == 0) {
			int i_694_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_695_ = 0; i_695_ < ((Class387_Sub1) this).anInt7799; i_695_++) {
				((Class387_Sub1) this).anInt7782 += ((Class387_Sub1) this).anIntArray7751[i_695_];
				((Class387_Sub1) this).anInt7783 += ((Class387_Sub1) this).anIntArray7752[i_695_];
				((Class387_Sub1) this).anInt7781 += ((Class387_Sub1) this).anIntArray7753[i_695_];
				i_694_++;
			}
			if (i_694_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_694_ + i_691_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_694_ + i_692_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_694_ + i_693_;
			} else {
				((Class387_Sub1) this).anInt7782 = i_691_;
				((Class387_Sub1) this).anInt7783 = i_692_;
				((Class387_Sub1) this).anInt7781 = i_693_;
			}
		} else if (i == 1) {
			for (int i_696_ = 0; i_696_ < ((Class387_Sub1) this).anInt7799; i_696_++) {
				((Class387_Sub1) this).anIntArray7751[i_696_] += i_691_;
				((Class387_Sub1) this).anIntArray7752[i_696_] += i_692_;
				((Class387_Sub1) this).anIntArray7753[i_696_] += i_693_;
			}
		} else if (i == 2) {
			for (int i_697_ = 0; i_697_ < ((Class387_Sub1) this).anInt7799; i_697_++) {
				((Class387_Sub1) this).anIntArray7751[i_697_] -= ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_697_] -= ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_697_] -= ((Class387_Sub1) this).anInt7781;
				if (i_693_ != 0) {
					int i_698_ = Class220.anIntArray2483[i_693_];
					int i_699_ = Class220.anIntArray2474[i_693_];
					int i_700_ = (((((Class387_Sub1) this).anIntArray7752[i_697_] * i_698_) + (((Class387_Sub1) this).anIntArray7751[i_697_] * i_699_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray7752[i_697_] = ((((Class387_Sub1) this).anIntArray7752[i_697_] * i_699_) - (((Class387_Sub1) this).anIntArray7751[i_697_] * i_698_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray7751[i_697_] = i_700_;
				}
				if (i_691_ != 0) {
					int i_701_ = Class220.anIntArray2483[i_691_];
					int i_702_ = Class220.anIntArray2474[i_691_];
					int i_703_ = (((((Class387_Sub1) this).anIntArray7752[i_697_] * i_702_) - (((Class387_Sub1) this).anIntArray7753[i_697_] * i_701_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray7753[i_697_] = ((((Class387_Sub1) this).anIntArray7752[i_697_] * i_701_) + (((Class387_Sub1) this).anIntArray7753[i_697_] * i_702_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray7752[i_697_] = i_703_;
				}
				if (i_692_ != 0) {
					int i_704_ = Class220.anIntArray2483[i_692_];
					int i_705_ = Class220.anIntArray2474[i_692_];
					int i_706_ = (((((Class387_Sub1) this).anIntArray7753[i_697_] * i_704_) + (((Class387_Sub1) this).anIntArray7751[i_697_] * i_705_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray7753[i_697_] = ((((Class387_Sub1) this).anIntArray7753[i_697_] * i_705_) - (((Class387_Sub1) this).anIntArray7751[i_697_] * i_704_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray7751[i_697_] = i_706_;
				}
				((Class387_Sub1) this).anIntArray7751[i_697_] += ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_697_] += ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_697_] += ((Class387_Sub1) this).anInt7781;
			}
		} else if (i == 3) {
			for (int i_707_ = 0; i_707_ < ((Class387_Sub1) this).anInt7799; i_707_++) {
				((Class387_Sub1) this).anIntArray7751[i_707_] -= ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_707_] -= ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_707_] -= ((Class387_Sub1) this).anInt7781;
				((Class387_Sub1) this).anIntArray7751[i_707_] = (((Class387_Sub1) this).anIntArray7751[i_707_] * i_691_ / 128);
				((Class387_Sub1) this).anIntArray7752[i_707_] = (((Class387_Sub1) this).anIntArray7752[i_707_] * i_692_ / 128);
				((Class387_Sub1) this).anIntArray7753[i_707_] = (((Class387_Sub1) this).anIntArray7753[i_707_] * i_693_ / 128);
				((Class387_Sub1) this).anIntArray7751[i_707_] += ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_707_] += ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_707_] += ((Class387_Sub1) this).anInt7781;
			}
		} else if (i == 5) {
			for (int i_708_ = 0; i_708_ < ((Class387_Sub1) this).anInt7757; i_708_++) {
				int i_709_ = ((((Class387_Sub1) this).aByteArray7773[i_708_] & 0xff) + i_691_ * 8);
				if (i_709_ < 0)
					i_709_ = 0;
				else if (i_709_ > 255)
					i_709_ = 255;
				((Class387_Sub1) this).aByteArray7773[i_708_] = (byte) i_709_;
			}
			if (((Class387_Sub1) this).aClass16Array7789 != null) {
				for (int i_710_ = 0; i_710_ < ((Class387_Sub1) this).anInt7788; i_710_++) {
					Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_710_];
					Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_710_];
					((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | (255 - ((((Class387_Sub1) this).aByteArray7773[((Class16) class16).anInt226 * -1295149283]) & 0xff)) << 24) * -564629049;
				}
			}
		} else if (i == 7) {
			for (int i_711_ = 0; i_711_ < ((Class387_Sub1) this).anInt7757; i_711_++) {
				int i_712_ = ((Class387_Sub1) this).aShortArray7775[i_711_] & 0xffff;
				int i_713_ = i_712_ >> 10 & 0x3f;
				int i_714_ = i_712_ >> 7 & 0x7;
				int i_715_ = i_712_ & 0x7f;
				i_713_ = i_713_ + i_691_ & 0x3f;
				i_714_ += i_692_;
				if (i_714_ < 0)
					i_714_ = 0;
				else if (i_714_ > 7)
					i_714_ = 7;
				i_715_ += i_693_;
				if (i_715_ < 0)
					i_715_ = 0;
				else if (i_715_ > 127)
					i_715_ = 127;
				((Class387_Sub1) this).aShortArray7775[i_711_] = (short) (i_713_ << 10 | i_714_ << 7 | i_715_);
			}
			((Class387_Sub1) this).aBoolean7733 = true;
			if (((Class387_Sub1) this).aClass16Array7789 != null) {
				for (int i_716_ = 0; i_716_ < ((Class387_Sub1) this).anInt7788; i_716_++) {
					Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_716_];
					Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_716_];
					((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | ((Class379.anIntArray4096[Class173.method1823(((((Class387_Sub1) this).aShortArray7775[((((Class16) class16).anInt226) * -1295149283)]) & 0xffff), (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
				}
			}
		} else if (i == 8) {
			for (int i_717_ = 0; i_717_ < ((Class387_Sub1) this).anInt7788; i_717_++) {
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_717_];
				((Class18) class18).anInt247 += i_691_ * 1747422061;
				((Class18) class18).anInt244 += i_692_ * 1370325433;
			}
		} else if (i == 10) {
			for (int i_718_ = 0; i_718_ < ((Class387_Sub1) this).anInt7788; i_718_++) {
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_718_];
				((Class18) class18).aFloat245 = ((Class18) class18).aFloat245 * (float) i_691_ / 128.0F;
				((Class18) class18).aFloat248 = ((Class18) class18).aFloat248 * (float) i_692_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_719_ = 0; i_719_ < ((Class387_Sub1) this).anInt7788; i_719_++) {
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_719_];
				((Class18) class18).anInt249 = (((Class18) class18).anInt249 * -988477815 + i_691_ & 0x3fff) * -839233607;
			}
		}
	}

	final boolean method4802(int i) {
		if (((Class387_Sub1) this).aByteArray7773 == null)
			return false;
		if (((Class387_Sub1) this).aByteArray7773[i] == 0)
			return false;
		return true;
	}

	public void f(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method4809();
		else if (i == 8192)
			method4796();
		else if (i == 12288)
			method4806();
		else {
			int i_720_ = Class220.anIntArray2483[i];
			int i_721_ = Class220.anIntArray2474[i];
			synchronized (this) {
				for (int i_722_ = 0; i_722_ < ((Class387_Sub1) this).anInt7799; i_722_++) {
					int i_723_ = (((((Class387_Sub1) this).anIntArray7753[i_722_] * i_720_) + (((Class387_Sub1) this).anIntArray7751[i_722_] * i_721_)) >> 14);
					((Class387_Sub1) this).anIntArray7753[i_722_] = ((((Class387_Sub1) this).anIntArray7753[i_722_] * i_721_) - (((Class387_Sub1) this).anIntArray7751[i_722_] * i_720_)) >> 14;
					((Class387_Sub1) this).anIntArray7751[i_722_] = i_723_;
				}
				method4800();
			}
		}
	}

	final void method4803(boolean bool, boolean bool_724_, boolean bool_725_, int i, boolean bool_726_, boolean bool_727_) {
		if (((Class387_Sub1) this).anIntArray7801[i] != -2) {
			short i_728_ = ((Class387_Sub1) this).aShortArray7758[i];
			short i_729_ = ((Class387_Sub1) this).aShortArray7759[i];
			short i_730_ = ((Class387_Sub1) this).aShortArray7760[i];
			float f = ((Class387_Sub1) this).aFloatArray7784[i_728_];
			float f_731_ = ((Class387_Sub1) this).aFloatArray7784[i_729_];
			float f_732_ = ((Class387_Sub1) this).aFloatArray7784[i_730_];
			if (!bool_726_ || f != -5000.0F && f_731_ != -5000.0F && f_732_ != -5000.0F) {
				float f_733_ = ((Class387_Sub1) this).aFloatArray7806[i_728_];
				float f_734_ = ((Class387_Sub1) this).aFloatArray7806[i_729_];
				float f_735_ = ((Class387_Sub1) this).aFloatArray7806[i_730_];
				if (((Class387_Sub1) this).anIntArray7814[i] != -1 || ((f - f_731_) * (f_735_ - f_734_) - (f_733_ - f_734_) * (f_732_ - f_731_)) > 0.0F) {
					if (f < 0.0F || f_731_ < 0.0F || f_732_ < 0.0F || f > (float) (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt214 * -638801903) || (f_731_ > (float) (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt214 * -638801903)) || (f_732_ > (float) (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt214 * -638801903)))
						((Class2) ((Class387_Sub1) this).aClass2_7737).aBoolean20 = true;
					else
						((Class2) ((Class387_Sub1) this).aClass2_7737).aBoolean20 = false;
					if (bool_727_) {
						int i_736_ = ((Class387_Sub1) this).anIntArray7814[i];
						if (i_736_ == -1 || !(((Class16) (((Class387_Sub1) this).aClass16Array7789[i_736_])).aBoolean225))
							method4805(bool, bool_724_, bool_725_, i);
					} else {
						int i_737_ = ((Class387_Sub1) this).anIntArray7814[i];
						if (i_737_ != -1) {
							Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_737_]);
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_737_]);
							if (!((Class16) class16).aBoolean225)
								method4812(bool, bool_724_, bool_725_, i);
							((Class387_Sub1) this).aClass_ra_Sub1_7769.method5205(bool, bool_724_, bool_725_, ((Class18) class18).anInt252 * 1623109979, ((Class18) class18).anInt251 * 981534539, ((Class18) class18).aFloat250, ((Class18) class18).anInt246 * 1931942073, ((Class18) class18).anInt253 * 1894750037, ((Class16) class16).aShort228 & 0xffff, ((Class18) class18).anInt254 * -1509687305, ((Class16) class16).aByte230, ((Class16) class16).aByte227);
						} else
							method4812(bool, bool_724_, bool_725_, i);
					}
				}
			}
		}
	}

	void method4804() {
		for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
			short i_738_ = (((Class387_Sub1) this).aShortArray7774 != null ? ((Class387_Sub1) this).aShortArray7774[i] : (short) -1);
			if (i_738_ == -1) {
				int i_739_ = ((Class387_Sub1) this).aShortArray7775[i] & 0xffff;
				int i_740_ = (i_739_ & 0x7f) * ((Class387_Sub1) this).anInt7747 >> 7;
				short i_741_ = Class173.method1823(i_739_ & ~0x7f | i_740_, (byte) 0);
				if (((Class387_Sub1) this).anIntArray7801[i] == -1) {
					int i_742_ = ((Class387_Sub1) this).anIntArray7763[i] & ~0x1ffff;
					((Class387_Sub1) this).anIntArray7763[i] = i_742_ | Class195.method1873(i_741_, i_742_ >> 17, -952106382);
				} else if (((Class387_Sub1) this).anIntArray7801[i] != -2) {
					int i_743_ = ((Class387_Sub1) this).anIntArray7763[i] & ~0x1ffff;
					((Class387_Sub1) this).anIntArray7763[i] = i_743_ | Class195.method1873(i_741_, i_743_ >> 17, -952106382);
					i_743_ = ((Class387_Sub1) this).anIntArray7764[i] & ~0x1ffff;
					((Class387_Sub1) this).anIntArray7764[i] = i_743_ | Class195.method1873(i_741_, i_743_ >> 17, -952106382);
					i_743_ = ((Class387_Sub1) this).anIntArray7801[i] & ~0x1ffff;
					((Class387_Sub1) this).anIntArray7801[i] = i_743_ | Class195.method1873(i_741_, i_743_ >> 17, -952106382);
				}
			}
		}
		((Class387_Sub1) this).anInt7812 = 2;
	}

	final void method4805(boolean bool, boolean bool_744_, boolean bool_745_, int i) {
		if (!((Class15) ((Class387_Sub1) this).aClass15_7735).aBoolean186) {
			short i_746_ = ((Class387_Sub1) this).aShortArray7758[i];
			short i_747_ = ((Class387_Sub1) this).aShortArray7759[i];
			short i_748_ = ((Class387_Sub1) this).aShortArray7760[i];
			Matrix4f class233 = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aClass233_7986);
			float f = class233.aFloatArray2594[10];
			float f_749_ = class233.aFloatArray2594[14];
			float f_750_ = class233.aFloatArray2594[11];
			float f_751_ = class233.aFloatArray2594[15];
			float f_752_ = f_749_ * f_750_ - f * f_751_;
			float f_753_ = ((((Class387_Sub1) this).aFloatArray7807[i_746_] - (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat212)) * (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat191));
			float f_754_ = ((((Class387_Sub1) this).aFloatArray7807[i_747_] - (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat212)) * (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat191));
			float f_755_ = ((((Class387_Sub1) this).aFloatArray7807[i_748_] - (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat212)) * (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat191));
			float f_756_ = f_753_ * f_752_ / (f_753_ * f_750_ - f);
			float f_757_ = f_754_ * f_752_ / (f_754_ * f_750_ - f);
			float f_758_ = f_755_ * f_752_ / (f_755_ * f_750_ - f);
			float f_759_ = ((f_756_ - (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat205)) / (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat183));
			if (f_759_ > 1.0F)
				f_759_ = 1.0F;
			else if (f_759_ < 0.0F)
				f_759_ = 0.0F;
			float f_760_ = ((f_757_ - (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat205)) / (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat183));
			if (f_760_ > 1.0F)
				f_760_ = 1.0F;
			else if (f_760_ < 0.0F)
				f_760_ = 0.0F;
			float f_761_ = ((f_758_ - (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat205)) / (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat183));
			if (f_761_ > 1.0F)
				f_761_ = 1.0F;
			else if (f_761_ < 0.0F)
				f_761_ = 0.0F;
			float f_762_ = f_759_ + f_760_ + f_761_;
			if (!(f_762_ >= 3.0F)) {
				if (f_762_ <= 0.0F)
					method4812(bool, bool_744_, bool_745_, i);
				else {
					if (((Class387_Sub1) this).aByteArray7773 == null)
						((Class2) ((Class387_Sub1) this).aClass2_7737).anInt19 = 0;
					else
						((Class2) ((Class387_Sub1) this).aClass2_7737).anInt19 = ((Class387_Sub1) this).aByteArray7773[i] & 0xff;
					if (((Class387_Sub1) this).aShortArray7774 == null || ((Class387_Sub1) this).aShortArray7774[i] == -1) {
						if (((Class387_Sub1) this).anIntArray7801[i] == -1)
							((Class387_Sub1) this).aClass2_7737.method292(bool, bool_744_, bool_745_, (((Class387_Sub1) this).aFloatArray7806[i_746_]), (((Class387_Sub1) this).aFloatArray7806[i_747_]), (((Class387_Sub1) this).aFloatArray7806[i_748_]), (((Class387_Sub1) this).aFloatArray7784[i_746_]), (((Class387_Sub1) this).aFloatArray7784[i_747_]), (((Class387_Sub1) this).aFloatArray7784[i_748_]), (((Class387_Sub1) this).aFloatArray7807[i_746_]),
									(((Class387_Sub1) this).aFloatArray7807[i_747_]), (((Class387_Sub1) this).aFloatArray7807[i_748_]), Class350.method4215((Class379.anIntArray4096[((((Class387_Sub1) this).anIntArray7763[i]) & 0xffff)]), (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt184) * 688695183, f_759_ * 255.0F, -528080657),
									Class350.method4215((Class379.anIntArray4096[((((Class387_Sub1) this).anIntArray7763[i]) & 0xffff)]), (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt184) * 688695183, f_760_ * 255.0F, -794747300), Class350.method4215((Class379.anIntArray4096[((((Class387_Sub1) this).anIntArray7763[i]) & 0xffff)]), (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt184) * 688695183, f_761_ * 255.0F, 1603189595));
						else
							((Class387_Sub1) this).aClass2_7737.method292(bool, bool_744_, bool_745_, (((Class387_Sub1) this).aFloatArray7806[i_746_]), (((Class387_Sub1) this).aFloatArray7806[i_747_]), (((Class387_Sub1) this).aFloatArray7806[i_748_]), (((Class387_Sub1) this).aFloatArray7784[i_746_]), (((Class387_Sub1) this).aFloatArray7784[i_747_]), (((Class387_Sub1) this).aFloatArray7784[i_748_]), (((Class387_Sub1) this).aFloatArray7807[i_746_]),
									(((Class387_Sub1) this).aFloatArray7807[i_747_]), (((Class387_Sub1) this).aFloatArray7807[i_748_]), Class350.method4215((Class379.anIntArray4096[((((Class387_Sub1) this).anIntArray7763[i]) & 0xffff)]), (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt184) * 688695183, f_759_ * 255.0F, 2033179026),
									Class350.method4215((Class379.anIntArray4096[((((Class387_Sub1) this).anIntArray7764[i]) & 0xffff)]), (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt184) * 688695183, f_760_ * 255.0F, -851580975), Class350.method4215((Class379.anIntArray4096[((((Class387_Sub1) this).anIntArray7801[i]) & 0xffff)]), (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt184) * 688695183, f_761_ * 255.0F, -1739107001));
					} else {
						int i_763_ = -16777216;
						if (((Class387_Sub1) this).aByteArray7773 != null)
							i_763_ = 255 - ((((Class387_Sub1) this).aByteArray7773[i]) & 0xff) << 24;
						if (((Class387_Sub1) this).anIntArray7801[i] == -1) {
							int i_764_ = (i_763_ | (((Class387_Sub1) this).anIntArray7763[i] & 0xffffff));
							((Class387_Sub1) this).aClass2_7737.method290(bool, bool_744_, bool_745_, (((Class387_Sub1) this).aFloatArray7806[i_746_]), (((Class387_Sub1) this).aFloatArray7806[i_747_]), (((Class387_Sub1) this).aFloatArray7806[i_748_]), (((Class387_Sub1) this).aFloatArray7784[i_746_]), (((Class387_Sub1) this).aFloatArray7784[i_747_]), (((Class387_Sub1) this).aFloatArray7784[i_748_]), (((Class387_Sub1) this).aFloatArray7807[i_746_]),
									(((Class387_Sub1) this).aFloatArray7807[i_747_]), (((Class387_Sub1) this).aFloatArray7807[i_748_]), (((Class387_Sub1) this).aFloatArray7745[i_746_]), (((Class387_Sub1) this).aFloatArray7745[i_747_]), (((Class387_Sub1) this).aFloatArray7745[i_748_]), (((Class387_Sub1) this).aFloatArrayArray7738[i][0]), (((Class387_Sub1) this).aFloatArrayArray7738[i][1]), (((Class387_Sub1) this).aFloatArrayArray7738[i][2]), (((Class387_Sub1) this).aFloatArrayArray7762[i][0]),
									(((Class387_Sub1) this).aFloatArrayArray7762[i][1]), (((Class387_Sub1) this).aFloatArrayArray7762[i][2]), i_764_, i_764_, i_764_, (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt184 * 688695183), f_759_ * 255.0F, f_760_ * 255.0F, f_761_ * 255.0F, ((Class387_Sub1) this).aShortArray7774[i]);
						} else
							((Class387_Sub1) this).aClass2_7737.method290(bool, bool_744_, bool_745_, (((Class387_Sub1) this).aFloatArray7806[i_746_]), (((Class387_Sub1) this).aFloatArray7806[i_747_]), (((Class387_Sub1) this).aFloatArray7806[i_748_]), (((Class387_Sub1) this).aFloatArray7784[i_746_]), (((Class387_Sub1) this).aFloatArray7784[i_747_]), (((Class387_Sub1) this).aFloatArray7784[i_748_]), (((Class387_Sub1) this).aFloatArray7807[i_746_]),
									(((Class387_Sub1) this).aFloatArray7807[i_747_]), (((Class387_Sub1) this).aFloatArray7807[i_748_]), (((Class387_Sub1) this).aFloatArray7745[i_746_]), (((Class387_Sub1) this).aFloatArray7745[i_747_]), (((Class387_Sub1) this).aFloatArray7745[i_748_]), (((Class387_Sub1) this).aFloatArrayArray7738[i][0]), (((Class387_Sub1) this).aFloatArrayArray7738[i][1]), (((Class387_Sub1) this).aFloatArrayArray7738[i][2]), (((Class387_Sub1) this).aFloatArrayArray7762[i][0]),
									(((Class387_Sub1) this).aFloatArrayArray7762[i][1]), (((Class387_Sub1) this).aFloatArrayArray7762[i][2]), i_763_ | (((Class387_Sub1) this).anIntArray7763[i]) & 0xffffff, i_763_ | (((Class387_Sub1) this).anIntArray7764[i]) & 0xffffff, i_763_ | (((Class387_Sub1) this).anIntArray7801[i]) & 0xffffff, (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt184 * 688695183), f_759_ * 255.0F, f_760_ * 255.0F, f_761_ * 255.0F,
									((Class387_Sub1) this).aShortArray7774[i]);
					}
				}
			}
		} else {
			short i_765_ = ((Class387_Sub1) this).aShortArray7758[i];
			short i_766_ = ((Class387_Sub1) this).aShortArray7759[i];
			short i_767_ = ((Class387_Sub1) this).aShortArray7760[i];
			float f = 0.0F;
			float f_768_ = 0.0F;
			float f_769_ = 0.0F;
			if (((Class387_Sub1) this).anIntArray7734[i_765_] > (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt215 * 1084810731))
				f = 1.0F;
			else if (((Class387_Sub1) this).anIntArray7734[i_765_] > (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt196) * -1395782407)
				f = ((float) ((((Class15) ((Class387_Sub1) this).aClass15_7735).anInt196) * -1395782407 - ((Class387_Sub1) this).anIntArray7734[i_765_]) * 1.0F / (float) ((((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt196 * -1395782407) - (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt215 * 1084810731)));
			if (((Class387_Sub1) this).anIntArray7734[i_766_] > (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt215 * 1084810731))
				f_768_ = 1.0F;
			else if (((Class387_Sub1) this).anIntArray7734[i_766_] > (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt196) * -1395782407)
				f_768_ = ((float) ((((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt196 * -1395782407) - (((Class387_Sub1) this).anIntArray7734[i_766_])) * 1.0F / (float) ((((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt196 * -1395782407) - (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt215 * 1084810731)));
			if (((Class387_Sub1) this).anIntArray7734[i_767_] > (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt215 * 1084810731))
				f_769_ = 1.0F;
			else if (((Class387_Sub1) this).anIntArray7734[i_767_] > (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt196) * -1395782407)
				f_769_ = ((float) ((((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt196 * -1395782407) - (((Class387_Sub1) this).anIntArray7734[i_767_])) * 1.0F / (float) ((((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt196 * -1395782407) - (((Class15) (((Class387_Sub1) this).aClass15_7735)).anInt215 * 1084810731)));
			if (((Class387_Sub1) this).aByteArray7773 == null)
				((Class2) ((Class387_Sub1) this).aClass2_7737).anInt19 = 0;
			else
				((Class2) ((Class387_Sub1) this).aClass2_7737).anInt19 = ((Class387_Sub1) this).aByteArray7773[i] & 0xff;
			if (((Class387_Sub1) this).aShortArray7774 == null || ((Class387_Sub1) this).aShortArray7774[i] == -1) {
				if (((Class387_Sub1) this).anIntArray7801[i] == -1)
					((Class387_Sub1) this).aClass2_7737.method292(bool, bool_744_, bool_745_, ((Class387_Sub1) this).aFloatArray7806[i_765_], ((Class387_Sub1) this).aFloatArray7806[i_766_], ((Class387_Sub1) this).aFloatArray7806[i_767_], ((Class387_Sub1) this).aFloatArray7784[i_765_], ((Class387_Sub1) this).aFloatArray7784[i_766_], ((Class387_Sub1) this).aFloatArray7784[i_767_], ((Class387_Sub1) this).aFloatArray7807[i_765_], ((Class387_Sub1) this).aFloatArray7807[i_766_],
							((Class387_Sub1) this).aFloatArray7807[i_767_], Class350.method4215((Class379.anIntArray4096[(((Class387_Sub1) this).anIntArray7763[i]) & 0xffff]), (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184) * 688695183, f * 255.0F, 886179764), Class350.method4215((Class379.anIntArray4096[(((Class387_Sub1) this).anIntArray7763[i]) & 0xffff]), (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184) * 688695183, f_768_ * 255.0F, 246996122),
							Class350.method4215((Class379.anIntArray4096[(((Class387_Sub1) this).anIntArray7763[i]) & 0xffff]), (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184) * 688695183, f_769_ * 255.0F, -99900090));
				else
					((Class387_Sub1) this).aClass2_7737.method292(bool, bool_744_, bool_745_, ((Class387_Sub1) this).aFloatArray7806[i_765_], ((Class387_Sub1) this).aFloatArray7806[i_766_], ((Class387_Sub1) this).aFloatArray7806[i_767_], ((Class387_Sub1) this).aFloatArray7784[i_765_], ((Class387_Sub1) this).aFloatArray7784[i_766_], ((Class387_Sub1) this).aFloatArray7784[i_767_], ((Class387_Sub1) this).aFloatArray7807[i_765_], ((Class387_Sub1) this).aFloatArray7807[i_766_],
							((Class387_Sub1) this).aFloatArray7807[i_767_], Class350.method4215((Class379.anIntArray4096[(((Class387_Sub1) this).anIntArray7763[i]) & 0xffff]), (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184) * 688695183, f * 255.0F, 1366677082), Class350.method4215((Class379.anIntArray4096[(((Class387_Sub1) this).anIntArray7764[i]) & 0xffff]), (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184) * 688695183, f_768_ * 255.0F, 1481945329),
							Class350.method4215((Class379.anIntArray4096[(((Class387_Sub1) this).anIntArray7801[i]) & 0xffff]), (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184) * 688695183, f_769_ * 255.0F, 153021321));
			} else {
				int i_770_ = -16777216;
				if (((Class387_Sub1) this).aByteArray7773 != null)
					i_770_ = 255 - (((Class387_Sub1) this).aByteArray7773[i] & 0xff) << 24;
				if (((Class387_Sub1) this).anIntArray7801[i] == -1) {
					int i_771_ = i_770_ | (((Class387_Sub1) this).anIntArray7763[i] & 0xffffff);
					((Class387_Sub1) this).aClass2_7737.method290(bool, bool_744_, bool_745_, ((Class387_Sub1) this).aFloatArray7806[i_765_], ((Class387_Sub1) this).aFloatArray7806[i_766_], ((Class387_Sub1) this).aFloatArray7806[i_767_], ((Class387_Sub1) this).aFloatArray7784[i_765_], ((Class387_Sub1) this).aFloatArray7784[i_766_], ((Class387_Sub1) this).aFloatArray7784[i_767_], ((Class387_Sub1) this).aFloatArray7807[i_765_], ((Class387_Sub1) this).aFloatArray7807[i_766_],
							((Class387_Sub1) this).aFloatArray7807[i_767_], ((Class387_Sub1) this).aFloatArray7745[i_765_], ((Class387_Sub1) this).aFloatArray7745[i_766_], ((Class387_Sub1) this).aFloatArray7745[i_767_], ((Class387_Sub1) this).aFloatArrayArray7738[i][0], ((Class387_Sub1) this).aFloatArrayArray7738[i][1], ((Class387_Sub1) this).aFloatArrayArray7738[i][2], ((Class387_Sub1) this).aFloatArrayArray7762[i][0], ((Class387_Sub1) this).aFloatArrayArray7762[i][1],
							((Class387_Sub1) this).aFloatArrayArray7762[i][2], i_771_, i_771_, i_771_, (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184) * 688695183, f * 255.0F, f_768_ * 255.0F, f_769_ * 255.0F, ((Class387_Sub1) this).aShortArray7774[i]);
				} else
					((Class387_Sub1) this).aClass2_7737.method290(bool, bool_744_, bool_745_, ((Class387_Sub1) this).aFloatArray7806[i_765_], ((Class387_Sub1) this).aFloatArray7806[i_766_], ((Class387_Sub1) this).aFloatArray7806[i_767_], ((Class387_Sub1) this).aFloatArray7784[i_765_], ((Class387_Sub1) this).aFloatArray7784[i_766_], ((Class387_Sub1) this).aFloatArray7784[i_767_], ((Class387_Sub1) this).aFloatArray7807[i_765_], ((Class387_Sub1) this).aFloatArray7807[i_766_],
							((Class387_Sub1) this).aFloatArray7807[i_767_], ((Class387_Sub1) this).aFloatArray7745[i_765_], ((Class387_Sub1) this).aFloatArray7745[i_766_], ((Class387_Sub1) this).aFloatArray7745[i_767_], ((Class387_Sub1) this).aFloatArrayArray7738[i][0], ((Class387_Sub1) this).aFloatArrayArray7738[i][1], ((Class387_Sub1) this).aFloatArrayArray7738[i][2], ((Class387_Sub1) this).aFloatArrayArray7762[i][0], ((Class387_Sub1) this).aFloatArrayArray7762[i][1],
							((Class387_Sub1) this).aFloatArrayArray7762[i][2], i_770_ | (((Class387_Sub1) this).anIntArray7763[i] & 0xffffff), i_770_ | (((Class387_Sub1) this).anIntArray7764[i] & 0xffffff), i_770_ | (((Class387_Sub1) this).anIntArray7801[i] & 0xffffff), (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184) * 688695183, f * 255.0F, f_768_ * 255.0F, f_769_ * 255.0F, ((Class387_Sub1) this).aShortArray7774[i]);
			}
		}
	}

	boolean ea() {
		if (((Class387_Sub1) this).anIntArrayArray7778 == null)
			return false;
		((Class387_Sub1) this).anInt7782 = 0;
		((Class387_Sub1) this).anInt7783 = 0;
		((Class387_Sub1) this).anInt7781 = 0;
		return true;
	}

	void method4806() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++) {
				int i_772_ = ((Class387_Sub1) this).anIntArray7753[i];
				((Class387_Sub1) this).anIntArray7753[i] = ((Class387_Sub1) this).anIntArray7751[i];
				((Class387_Sub1) this).anIntArray7751[i] = -i_772_;
			}
			method4800();
		}
	}

	public void method4786(Matrix3f class222) {
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		Matrix4f class233 = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_194;
		class233.method2145(class222);
		if (((Class387_Sub1) this).aClass85Array7750 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass85Array7750.length; i++) {
				Class85 class85 = ((Class387_Sub1) this).aClass85Array7750[i];
				Class85 class85_773_ = class85;
				if (class85.aClass85_776 != null)
					class85_773_ = class85.aClass85_776;
				class85_773_.anInt777 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -1879868075);
				class85_773_.anInt783 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -2041556771);
				class85_773_.anInt779 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -1434499227);
				class85_773_.anInt772 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 1070341177);
				class85_773_.anInt781 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 1802851857);
				class85_773_.anInt782 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 103846281;
				class85_773_.anInt771 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * -2103324039);
				class85_773_.anInt784 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * -526039059);
				class85_773_.anInt785 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (((Class387_Sub1) this).aClass68Array7754 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass68Array7754.length; i++) {
				Class68 class68 = ((Class387_Sub1) this).aClass68Array7754[i];
				Class68 class68_774_ = class68;
				if (class68.aClass68_672 != null)
					class68_774_ = class68.aClass68_672;
				if (class68.aClass233_677 != null)
					class68.aClass233_677.method2142(class233);
				else
					class68.aClass233_677 = new Matrix4f(class233);
				class68_774_.anInt671 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * -1436341053);
				class68_774_.anInt675 = (int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * 449866009;
				class68_774_.anInt676 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	public Class_na ga(Class_na class_na) {
		return null;
	}

	void method4807() {
		if (!((Class387_Sub1) this).aBoolean7792) {
			int i = 0;
			int i_775_ = 0;
			int i_776_ = 32767;
			int i_777_ = 32767;
			int i_778_ = 32767;
			int i_779_ = -32768;
			int i_780_ = -32768;
			int i_781_ = -32768;
			for (int i_782_ = 0; i_782_ < ((Class387_Sub1) this).anInt7742; i_782_++) {
				int i_783_ = ((Class387_Sub1) this).anIntArray7751[i_782_];
				int i_784_ = ((Class387_Sub1) this).anIntArray7752[i_782_];
				int i_785_ = ((Class387_Sub1) this).anIntArray7753[i_782_];
				if (i_783_ < i_776_)
					i_776_ = i_783_;
				if (i_783_ > i_779_)
					i_779_ = i_783_;
				if (i_784_ < i_777_)
					i_777_ = i_784_;
				if (i_784_ > i_780_)
					i_780_ = i_784_;
				if (i_785_ < i_778_)
					i_778_ = i_785_;
				if (i_785_ > i_781_)
					i_781_ = i_785_;
				int i_786_ = i_783_ * i_783_ + i_785_ * i_785_;
				if (i_786_ > i)
					i = i_786_;
				i_786_ += i_784_ * i_784_;
				if (i_786_ > i_775_)
					i_775_ = i_786_;
			}
			((Class387_Sub1) this).aShort7797 = (short) i_776_;
			((Class387_Sub1) this).aShort7743 = (short) i_779_;
			((Class387_Sub1) this).aShort7770 = (short) i_777_;
			((Class387_Sub1) this).aShort7796 = (short) i_780_;
			((Class387_Sub1) this).aShort7795 = (short) i_778_;
			((Class387_Sub1) this).aShort7800 = (short) i_781_;
			((Class387_Sub1) this).aShort7739 = (short) (int) (Math.sqrt((double) i) + 0.99);
			((Class387_Sub1) this).aShort7794 = (short) (int) (Math.sqrt((double) i_775_) + 0.99);
			((Class387_Sub1) this).aBoolean7792 = true;
		}
	}

	public int N() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7739;
	}

	public int n() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7794;
	}

	public int RA() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7797;
	}

	public int ya() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7743;
	}

	public int YA() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7770;
	}

	void method4808() {
		((Class387_Sub1) this).aClass1Array7755 = new Class1[((Class387_Sub1) this).anInt7742];
		for (int i = 0; i < ((Class387_Sub1) this).anInt7742; i++)
			((Class387_Sub1) this).aClass1Array7755[i] = new Class1();
		for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
			short i_787_ = ((Class387_Sub1) this).aShortArray7758[i];
			short i_788_ = ((Class387_Sub1) this).aShortArray7759[i];
			short i_789_ = ((Class387_Sub1) this).aShortArray7760[i];
			int i_790_ = (((Class387_Sub1) this).anIntArray7751[i_788_] - ((Class387_Sub1) this).anIntArray7751[i_787_]);
			int i_791_ = (((Class387_Sub1) this).anIntArray7752[i_788_] - ((Class387_Sub1) this).anIntArray7752[i_787_]);
			int i_792_ = (((Class387_Sub1) this).anIntArray7753[i_788_] - ((Class387_Sub1) this).anIntArray7753[i_787_]);
			int i_793_ = (((Class387_Sub1) this).anIntArray7751[i_789_] - ((Class387_Sub1) this).anIntArray7751[i_787_]);
			int i_794_ = (((Class387_Sub1) this).anIntArray7752[i_789_] - ((Class387_Sub1) this).anIntArray7752[i_787_]);
			int i_795_ = (((Class387_Sub1) this).anIntArray7753[i_789_] - ((Class387_Sub1) this).anIntArray7753[i_787_]);
			int i_796_ = i_791_ * i_795_ - i_794_ * i_792_;
			int i_797_ = i_792_ * i_793_ - i_795_ * i_790_;
			int i_798_;
			for (i_798_ = i_790_ * i_794_ - i_793_ * i_791_; (i_796_ > 8192 || i_797_ > 8192 || i_798_ > 8192 || i_796_ < -8192 || i_797_ < -8192 || i_798_ < -8192); i_798_ >>= 1) {
				i_796_ >>= 1;
				i_797_ >>= 1;
			}
			int i_799_ = (int) Math.sqrt((double) (i_796_ * i_796_ + i_797_ * i_797_ + i_798_ * i_798_));
			if (i_799_ <= 0)
				i_799_ = 1;
			i_796_ = i_796_ * 256 / i_799_;
			i_797_ = i_797_ * 256 / i_799_;
			i_798_ = i_798_ * 256 / i_799_;
			byte i_800_;
			if (((Class387_Sub1) this).aByteArray7771 == null)
				i_800_ = (byte) 0;
			else
				i_800_ = ((Class387_Sub1) this).aByteArray7771[i];
			if (i_800_ == 0) {
				Class1 class1 = ((Class387_Sub1) this).aClass1Array7755[i_787_];
				((Class1) class1).anInt13 += i_796_;
				((Class1) class1).anInt12 += i_797_;
				((Class1) class1).anInt14 += i_798_;
				((Class1) class1).anInt15++;
				class1 = ((Class387_Sub1) this).aClass1Array7755[i_788_];
				((Class1) class1).anInt13 += i_796_;
				((Class1) class1).anInt12 += i_797_;
				((Class1) class1).anInt14 += i_798_;
				((Class1) class1).anInt15++;
				class1 = ((Class387_Sub1) this).aClass1Array7755[i_789_];
				((Class1) class1).anInt13 += i_796_;
				((Class1) class1).anInt12 += i_797_;
				((Class1) class1).anInt14 += i_798_;
				((Class1) class1).anInt15++;
			} else if (i_800_ == 1) {
				if (((Class387_Sub1) this).aClass5Array7740 == null)
					((Class387_Sub1) this).aClass5Array7740 = new Class5[((Class387_Sub1) this).anInt7757];
				Class5 class5 = (((Class387_Sub1) this).aClass5Array7740[i] = new Class5());
				((Class5) class5).anInt78 = i_796_;
				((Class5) class5).anInt79 = i_797_;
				((Class5) class5).anInt80 = i_798_;
			}
		}
	}

	public int AA() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7795;
	}

	public void bf(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method4809();
		else if (i == 8192)
			method4796();
		else if (i == 12288)
			method4806();
		else {
			int i_801_ = Class220.anIntArray2483[i];
			int i_802_ = Class220.anIntArray2474[i];
			synchronized (this) {
				for (int i_803_ = 0; i_803_ < ((Class387_Sub1) this).anInt7799; i_803_++) {
					int i_804_ = (((((Class387_Sub1) this).anIntArray7753[i_803_] * i_801_) + (((Class387_Sub1) this).anIntArray7751[i_803_] * i_802_)) >> 14);
					((Class387_Sub1) this).anIntArray7753[i_803_] = ((((Class387_Sub1) this).anIntArray7753[i_803_] * i_802_) - (((Class387_Sub1) this).anIntArray7751[i_803_] * i_801_)) >> 14;
					((Class387_Sub1) this).anIntArray7751[i_803_] = i_804_;
				}
				method4800();
			}
		}
	}

	public void p(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x1000) != 4096)
			throw new IllegalStateException();
		((Class387_Sub1) this).anInt7747 = i;
		((Class387_Sub1) this).anInt7812 = 0;
	}

	public boolean method4787(int i, int i_805_, Matrix3f class222, boolean bool, int i_806_) {
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		Matrix4f class233 = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_194;
		class233.method2145(class222);
		Matrix4f class233_807_ = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_195;
		class233_807_.method2142(class233);
		class233_807_.method2144(((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aClass233_7987);
		boolean bool_808_ = false;
		int i_809_ = 2147483647;
		int i_810_ = -2147483648;
		int i_811_ = 2147483647;
		int i_812_ = -2147483648;
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		int i_813_ = ((((Class387_Sub1) this).aShort7743 - ((Class387_Sub1) this).aShort7797) >> 1);
		int i_814_ = ((((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770) >> 1);
		int i_815_ = ((((Class387_Sub1) this).aShort7800 - ((Class387_Sub1) this).aShort7795) >> 1);
		int i_816_ = ((Class387_Sub1) this).aShort7797 + i_813_;
		int i_817_ = ((Class387_Sub1) this).aShort7770 + i_814_;
		int i_818_ = ((Class387_Sub1) this).aShort7795 + i_815_;
		int i_819_ = i_816_ - (i_813_ << i_806_);
		int i_820_ = i_817_ - (i_814_ << i_806_);
		int i_821_ = i_818_ - (i_815_ << i_806_);
		int i_822_ = i_816_ + (i_813_ << i_806_);
		int i_823_ = i_817_ + (i_814_ << i_806_);
		int i_824_ = i_818_ + (i_815_ << i_806_);
		((Class387_Sub1) this).anIntArray7809[0] = i_819_;
		((Class387_Sub1) this).anIntArray7761[0] = i_820_;
		((Class387_Sub1) this).anIntArray7811[0] = i_821_;
		((Class387_Sub1) this).anIntArray7809[1] = i_822_;
		((Class387_Sub1) this).anIntArray7761[1] = i_820_;
		((Class387_Sub1) this).anIntArray7811[1] = i_821_;
		((Class387_Sub1) this).anIntArray7809[2] = i_819_;
		((Class387_Sub1) this).anIntArray7761[2] = i_823_;
		((Class387_Sub1) this).anIntArray7811[2] = i_821_;
		((Class387_Sub1) this).anIntArray7809[3] = i_822_;
		((Class387_Sub1) this).anIntArray7761[3] = i_823_;
		((Class387_Sub1) this).anIntArray7811[3] = i_821_;
		((Class387_Sub1) this).anIntArray7809[4] = i_819_;
		((Class387_Sub1) this).anIntArray7761[4] = i_820_;
		((Class387_Sub1) this).anIntArray7811[4] = i_824_;
		((Class387_Sub1) this).anIntArray7809[5] = i_822_;
		((Class387_Sub1) this).anIntArray7761[5] = i_820_;
		((Class387_Sub1) this).anIntArray7811[5] = i_824_;
		((Class387_Sub1) this).anIntArray7809[6] = i_819_;
		((Class387_Sub1) this).anIntArray7761[6] = i_823_;
		((Class387_Sub1) this).anIntArray7811[6] = i_824_;
		((Class387_Sub1) this).anIntArray7809[7] = i_822_;
		((Class387_Sub1) this).anIntArray7761[7] = i_823_;
		((Class387_Sub1) this).anIntArray7811[7] = i_824_;
		for (int i_825_ = 0; i_825_ < 8; i_825_++) {
			int i_826_ = ((Class387_Sub1) this).anIntArray7809[i_825_];
			int i_827_ = ((Class387_Sub1) this).anIntArray7761[i_825_];
			int i_828_ = ((Class387_Sub1) this).anIntArray7811[i_825_];
			float f = (class233_807_.aFloatArray2594[2] * (float) i_826_ + class233_807_.aFloatArray2594[6] * (float) i_827_ + class233_807_.aFloatArray2594[10] * (float) i_828_ + class233_807_.aFloatArray2594[14]);
			float f_829_ = (class233_807_.aFloatArray2594[3] * (float) i_826_ + class233_807_.aFloatArray2594[7] * (float) i_827_ + class233_807_.aFloatArray2594[11] * (float) i_828_ + class233_807_.aFloatArray2594[15]);
			if (f >= -f_829_) {
				float f_830_ = (class233_807_.aFloatArray2594[0] * (float) i_826_ + class233_807_.aFloatArray2594[4] * (float) i_827_ + class233_807_.aFloatArray2594[8] * (float) i_828_ + class233_807_.aFloatArray2594[12]);
				float f_831_ = (class233_807_.aFloatArray2594[1] * (float) i_826_ + class233_807_.aFloatArray2594[5] * (float) i_827_ + class233_807_.aFloatArray2594[9] * (float) i_828_ + class233_807_.aFloatArray2594[13]);
				int i_832_ = (int) ((((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat8005) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993) * f_830_ / f_829_);
				int i_833_ = (int) ((((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7996) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7995) * f_831_ / f_829_);
				if (i_832_ < i_809_)
					i_809_ = i_832_;
				if (i_832_ > i_810_)
					i_810_ = i_832_;
				if (i_833_ < i_811_)
					i_811_ = i_833_;
				if (i_833_ > i_812_)
					i_812_ = i_833_;
				bool_808_ = true;
			}
		}
		if (bool_808_ && i > i_809_ && i < i_810_ && i_805_ > i_811_ && i_805_ < i_812_) {
			if (bool)
				return true;
			for (int i_834_ = 0; i_834_ < ((Class387_Sub1) this).anInt7799; i_834_++) {
				int i_835_ = ((Class387_Sub1) this).anIntArray7751[i_834_];
				int i_836_ = ((Class387_Sub1) this).anIntArray7752[i_834_];
				int i_837_ = ((Class387_Sub1) this).anIntArray7753[i_834_];
				float f = (class233_807_.aFloatArray2594[2] * (float) i_835_ + class233_807_.aFloatArray2594[6] * (float) i_836_ + class233_807_.aFloatArray2594[10] * (float) i_837_ + class233_807_.aFloatArray2594[14]);
				float f_838_ = (class233_807_.aFloatArray2594[3] * (float) i_835_ + class233_807_.aFloatArray2594[7] * (float) i_836_ + class233_807_.aFloatArray2594[11] * (float) i_837_ + class233_807_.aFloatArray2594[15]);
				if (f >= -f_838_) {
					float f_839_ = (class233_807_.aFloatArray2594[0] * (float) i_835_ + class233_807_.aFloatArray2594[4] * (float) i_836_ + class233_807_.aFloatArray2594[8] * (float) i_837_ + class233_807_.aFloatArray2594[12]);
					float f_840_ = (class233_807_.aFloatArray2594[1] * (float) i_835_ + class233_807_.aFloatArray2594[5] * (float) i_836_ + class233_807_.aFloatArray2594[9] * (float) i_837_ + class233_807_.aFloatArray2594[13]);
					((Class387_Sub1) this).aFloatArray7784[i_834_] = (float) (int) (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat8005 + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993 * f_839_ / f_838_));
					((Class387_Sub1) this).aFloatArray7806[i_834_] = (float) (int) (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7996 + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7995 * f_840_ / f_838_));
				} else
					((Class387_Sub1) this).aFloatArray7784[i_834_] = -999999.0F;
			}
			for (int i_841_ = 0; i_841_ < ((Class387_Sub1) this).anInt7757; i_841_++) {
				if (((((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7758[i_841_]]) != -999999.0F)
						&& ((((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7759[i_841_]]) != -999999.0F)
						&& ((((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7760[i_841_]]) != -999999.0F)
						&& (method4801(i, i_805_, (((Class387_Sub1) this).aFloatArray7806[((Class387_Sub1) this).aShortArray7758[i_841_]]), (((Class387_Sub1) this).aFloatArray7806[((Class387_Sub1) this).aShortArray7759[i_841_]]), (((Class387_Sub1) this).aFloatArray7806[((Class387_Sub1) this).aShortArray7760[i_841_]]), (((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7758[i_841_]]), (((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7759[i_841_]]),
								(((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7760[i_841_]]))))
					return true;
			}
		}
		return false;
	}

	public void be(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method4809();
		else if (i == 8192)
			method4796();
		else if (i == 12288)
			method4806();
		else {
			int i_842_ = Class220.anIntArray2483[i];
			int i_843_ = Class220.anIntArray2474[i];
			synchronized (this) {
				for (int i_844_ = 0; i_844_ < ((Class387_Sub1) this).anInt7799; i_844_++) {
					int i_845_ = (((((Class387_Sub1) this).anIntArray7753[i_844_] * i_842_) + (((Class387_Sub1) this).anIntArray7751[i_844_] * i_843_)) >> 14);
					((Class387_Sub1) this).anIntArray7753[i_844_] = ((((Class387_Sub1) this).anIntArray7753[i_844_] * i_843_) - (((Class387_Sub1) this).anIntArray7751[i_844_] * i_842_)) >> 14;
					((Class387_Sub1) this).anIntArray7751[i_844_] = i_845_;
				}
				method4800();
			}
		}
	}

	void cw(int i, int i_846_, int i_847_, int i_848_) {
		if (i == 0) {
			int i_849_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_850_ = 0; i_850_ < ((Class387_Sub1) this).anInt7799; i_850_++) {
				((Class387_Sub1) this).anInt7782 += ((Class387_Sub1) this).anIntArray7751[i_850_];
				((Class387_Sub1) this).anInt7783 += ((Class387_Sub1) this).anIntArray7752[i_850_];
				((Class387_Sub1) this).anInt7781 += ((Class387_Sub1) this).anIntArray7753[i_850_];
				i_849_++;
			}
			if (i_849_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_849_ + i_846_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_849_ + i_847_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_849_ + i_848_;
			} else {
				((Class387_Sub1) this).anInt7782 = i_846_;
				((Class387_Sub1) this).anInt7783 = i_847_;
				((Class387_Sub1) this).anInt7781 = i_848_;
			}
		} else if (i == 1) {
			for (int i_851_ = 0; i_851_ < ((Class387_Sub1) this).anInt7799; i_851_++) {
				((Class387_Sub1) this).anIntArray7751[i_851_] += i_846_;
				((Class387_Sub1) this).anIntArray7752[i_851_] += i_847_;
				((Class387_Sub1) this).anIntArray7753[i_851_] += i_848_;
			}
		} else if (i == 2) {
			for (int i_852_ = 0; i_852_ < ((Class387_Sub1) this).anInt7799; i_852_++) {
				((Class387_Sub1) this).anIntArray7751[i_852_] -= ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_852_] -= ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_852_] -= ((Class387_Sub1) this).anInt7781;
				if (i_848_ != 0) {
					int i_853_ = Class220.anIntArray2483[i_848_];
					int i_854_ = Class220.anIntArray2474[i_848_];
					int i_855_ = (((((Class387_Sub1) this).anIntArray7752[i_852_] * i_853_) + (((Class387_Sub1) this).anIntArray7751[i_852_] * i_854_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray7752[i_852_] = ((((Class387_Sub1) this).anIntArray7752[i_852_] * i_854_) - (((Class387_Sub1) this).anIntArray7751[i_852_] * i_853_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray7751[i_852_] = i_855_;
				}
				if (i_846_ != 0) {
					int i_856_ = Class220.anIntArray2483[i_846_];
					int i_857_ = Class220.anIntArray2474[i_846_];
					int i_858_ = (((((Class387_Sub1) this).anIntArray7752[i_852_] * i_857_) - (((Class387_Sub1) this).anIntArray7753[i_852_] * i_856_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray7753[i_852_] = ((((Class387_Sub1) this).anIntArray7752[i_852_] * i_856_) + (((Class387_Sub1) this).anIntArray7753[i_852_] * i_857_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray7752[i_852_] = i_858_;
				}
				if (i_847_ != 0) {
					int i_859_ = Class220.anIntArray2483[i_847_];
					int i_860_ = Class220.anIntArray2474[i_847_];
					int i_861_ = (((((Class387_Sub1) this).anIntArray7753[i_852_] * i_859_) + (((Class387_Sub1) this).anIntArray7751[i_852_] * i_860_) + 16383) >> 14);
					((Class387_Sub1) this).anIntArray7753[i_852_] = ((((Class387_Sub1) this).anIntArray7753[i_852_] * i_860_) - (((Class387_Sub1) this).anIntArray7751[i_852_] * i_859_) + 16383) >> 14;
					((Class387_Sub1) this).anIntArray7751[i_852_] = i_861_;
				}
				((Class387_Sub1) this).anIntArray7751[i_852_] += ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_852_] += ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_852_] += ((Class387_Sub1) this).anInt7781;
			}
		} else if (i == 3) {
			for (int i_862_ = 0; i_862_ < ((Class387_Sub1) this).anInt7799; i_862_++) {
				((Class387_Sub1) this).anIntArray7751[i_862_] -= ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_862_] -= ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_862_] -= ((Class387_Sub1) this).anInt7781;
				((Class387_Sub1) this).anIntArray7751[i_862_] = (((Class387_Sub1) this).anIntArray7751[i_862_] * i_846_ / 128);
				((Class387_Sub1) this).anIntArray7752[i_862_] = (((Class387_Sub1) this).anIntArray7752[i_862_] * i_847_ / 128);
				((Class387_Sub1) this).anIntArray7753[i_862_] = (((Class387_Sub1) this).anIntArray7753[i_862_] * i_848_ / 128);
				((Class387_Sub1) this).anIntArray7751[i_862_] += ((Class387_Sub1) this).anInt7782;
				((Class387_Sub1) this).anIntArray7752[i_862_] += ((Class387_Sub1) this).anInt7783;
				((Class387_Sub1) this).anIntArray7753[i_862_] += ((Class387_Sub1) this).anInt7781;
			}
		} else if (i == 5) {
			for (int i_863_ = 0; i_863_ < ((Class387_Sub1) this).anInt7757; i_863_++) {
				int i_864_ = ((((Class387_Sub1) this).aByteArray7773[i_863_] & 0xff) + i_846_ * 8);
				if (i_864_ < 0)
					i_864_ = 0;
				else if (i_864_ > 255)
					i_864_ = 255;
				((Class387_Sub1) this).aByteArray7773[i_863_] = (byte) i_864_;
			}
			if (((Class387_Sub1) this).aClass16Array7789 != null) {
				for (int i_865_ = 0; i_865_ < ((Class387_Sub1) this).anInt7788; i_865_++) {
					Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_865_];
					Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_865_];
					((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | (255 - ((((Class387_Sub1) this).aByteArray7773[((Class16) class16).anInt226 * -1295149283]) & 0xff)) << 24) * -564629049;
				}
			}
		} else if (i == 7) {
			for (int i_866_ = 0; i_866_ < ((Class387_Sub1) this).anInt7757; i_866_++) {
				int i_867_ = ((Class387_Sub1) this).aShortArray7775[i_866_] & 0xffff;
				int i_868_ = i_867_ >> 10 & 0x3f;
				int i_869_ = i_867_ >> 7 & 0x7;
				int i_870_ = i_867_ & 0x7f;
				i_868_ = i_868_ + i_846_ & 0x3f;
				i_869_ += i_847_;
				if (i_869_ < 0)
					i_869_ = 0;
				else if (i_869_ > 7)
					i_869_ = 7;
				i_870_ += i_848_;
				if (i_870_ < 0)
					i_870_ = 0;
				else if (i_870_ > 127)
					i_870_ = 127;
				((Class387_Sub1) this).aShortArray7775[i_866_] = (short) (i_868_ << 10 | i_869_ << 7 | i_870_);
			}
			((Class387_Sub1) this).aBoolean7733 = true;
			if (((Class387_Sub1) this).aClass16Array7789 != null) {
				for (int i_871_ = 0; i_871_ < ((Class387_Sub1) this).anInt7788; i_871_++) {
					Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_871_];
					Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_871_];
					((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | ((Class379.anIntArray4096[Class173.method1823(((((Class387_Sub1) this).aShortArray7775[((((Class16) class16).anInt226) * -1295149283)]) & 0xffff), (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
				}
			}
		} else if (i == 8) {
			for (int i_872_ = 0; i_872_ < ((Class387_Sub1) this).anInt7788; i_872_++) {
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_872_];
				((Class18) class18).anInt247 += i_846_ * 1747422061;
				((Class18) class18).anInt244 += i_847_ * 1370325433;
			}
		} else if (i == 10) {
			for (int i_873_ = 0; i_873_ < ((Class387_Sub1) this).anInt7788; i_873_++) {
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_873_];
				((Class18) class18).aFloat245 = ((Class18) class18).aFloat245 * (float) i_846_ / 128.0F;
				((Class18) class18).aFloat248 = ((Class18) class18).aFloat248 * (float) i_847_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_874_ = 0; i_874_ < ((Class387_Sub1) this).anInt7788; i_874_++) {
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_874_];
				((Class18) class18).anInt249 = (((Class18) class18).anInt249 * -988477815 + i_846_ & 0x3fff) * -839233607;
			}
		}
	}

	public byte[] ah() {
		return ((Class387_Sub1) this).aByteArray7773;
	}

	public void X(short i, short i_875_) {
		for (int i_876_ = 0; i_876_ < ((Class387_Sub1) this).anInt7757; i_876_++) {
			if (((Class387_Sub1) this).aShortArray7775[i_876_] == i)
				((Class387_Sub1) this).aShortArray7775[i_876_] = i_875_;
		}
		if (((Class387_Sub1) this).aClass16Array7789 != null) {
			for (int i_877_ = 0; i_877_ < ((Class387_Sub1) this).anInt7788; i_877_++) {
				Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_877_];
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_877_];
				((Class18) class18).anInt254 = (((Class18) class18).anInt254 * -1509687305 & ~0xffffff | ((Class379.anIntArray4096[Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]), (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	void method4754() {
		if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
			synchronized (this) {
				while (aBoolean4148) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean4148 = true;
			}
		}
	}

	public void method4742(byte i, byte[] is) {
		if ((((Class387_Sub1) this).anInt7746 & 0x100000) == 0)
			throw new RuntimeException();
		if (((Class387_Sub1) this).aByteArray7773 == null)
			((Class387_Sub1) this).aByteArray7773 = new byte[((Class387_Sub1) this).anInt7757];
		if (is == null) {
			for (int i_878_ = 0; i_878_ < ((Class387_Sub1) this).anInt7757; i_878_++)
				((Class387_Sub1) this).aByteArray7773[i_878_] = i;
		} else {
			for (int i_879_ = 0; i_879_ < ((Class387_Sub1) this).anInt7757; i_879_++) {
				int i_880_ = 255 - ((255 - (is[i_879_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub1) this).aByteArray7773[i_879_] = (byte) i_880_;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	public Class387 method4748(byte i, int i_881_, boolean bool) {
		method4815(Thread.currentThread());
		boolean bool_882_ = false;
		Class387_Sub1 class387_sub1_883_;
		Class387_Sub1 class387_sub1_884_;
		if (i > 0 && i <= 7) {
			class387_sub1_884_ = ((Class387_Sub1) this).aClass387_Sub1Array7804[i - 1];
			class387_sub1_883_ = ((Class387_Sub1) this).aClass387_Sub1Array7815[i - 1];
			bool_882_ = true;
		} else
			class387_sub1_883_ = class387_sub1_884_ = new Class387_Sub1(((Class387_Sub1) this).aClass_ra_Sub1_7769);
		return method4793(class387_sub1_883_, class387_sub1_884_, i_881_, bool_882_, bool);
	}

	void ka() {
		if (((Class387_Sub1) this).aBoolean7780) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++) {
				((Class387_Sub1) this).anIntArray7751[i] = ((Class387_Sub1) this).anIntArray7751[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7752[i] = ((Class387_Sub1) this).anIntArray7752[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7753[i] = ((Class387_Sub1) this).anIntArray7753[i] + 7 >> 4;
			}
			((Class387_Sub1) this).aBoolean7780 = false;
		}
		if (((Class387_Sub1) this).aBoolean7733) {
			method4792();
			((Class387_Sub1) this).aBoolean7733 = false;
		}
		((Class387_Sub1) this).aBoolean7792 = false;
	}

	public Class68[] method4728() {
		return ((Class387_Sub1) this).aClass68Array7754;
	}

	public boolean method4743() {
		if (((Class387_Sub1) this).aShortArray7774 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub1) this).aShortArray7774.length; i++) {
			if (((Class387_Sub1) this).aShortArray7774[i] != -1 && !((Class387_Sub1) this).aClass_ra_Sub1_7769.method5200(((Class387_Sub1) this).aShortArray7774[i]))
				return false;
		}
		return true;
	}

	public void dd(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x1000) != 4096)
			throw new IllegalStateException();
		((Class387_Sub1) this).anInt7747 = i;
		((Class387_Sub1) this).anInt7812 = 0;
	}

	public boolean u() {
		return ((Class387_Sub1) this).aBoolean7777;
	}

	public void wa() {
		if ((((Class387_Sub1) this).anInt7746 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++)
				((Class387_Sub1) this).anIntArray7753[i] = -((Class387_Sub1) this).anIntArray7753[i];
			if (((Class387_Sub1) this).aClass1Array7755 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7742; i++) {
					if (((Class387_Sub1) this).aClass1Array7755[i] != null)
						((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt14 = -((Class1) (((Class387_Sub1) this).aClass1Array7755[i])).anInt14;
				}
			}
			if (((Class387_Sub1) this).aClass1Array7786 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7742; i++) {
					if (((Class387_Sub1) this).aClass1Array7786[i] != null)
						((Class1) ((Class387_Sub1) this).aClass1Array7786[i]).anInt14 = -((Class1) (((Class387_Sub1) this).aClass1Array7786[i])).anInt14;
				}
			}
			if (((Class387_Sub1) this).aClass5Array7740 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
					if (((Class387_Sub1) this).aClass5Array7740[i] != null)
						((Class5) ((Class387_Sub1) this).aClass5Array7740[i]).anInt80 = -((Class5) (((Class387_Sub1) this).aClass5Array7740[i])).anInt80;
				}
			}
			short[] is = ((Class387_Sub1) this).aShortArray7758;
			((Class387_Sub1) this).aShortArray7758 = ((Class387_Sub1) this).aShortArray7760;
			((Class387_Sub1) this).aShortArray7760 = is;
			if (((Class387_Sub1) this).aFloatArrayArray7738 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
					if (((Class387_Sub1) this).aFloatArrayArray7738[i] != null) {
						float f = (((Class387_Sub1) this).aFloatArrayArray7738[i][0]);
						((Class387_Sub1) this).aFloatArrayArray7738[i][0] = (((Class387_Sub1) this).aFloatArrayArray7738[i][2]);
						((Class387_Sub1) this).aFloatArrayArray7738[i][2] = f;
					}
					if (((Class387_Sub1) this).aFloatArrayArray7762[i] != null) {
						float f = (((Class387_Sub1) this).aFloatArrayArray7762[i][0]);
						((Class387_Sub1) this).aFloatArrayArray7762[i][0] = (((Class387_Sub1) this).aFloatArrayArray7762[i][2]);
						((Class387_Sub1) this).aFloatArrayArray7762[i][2] = f;
					}
				}
			}
			((Class387_Sub1) this).aBoolean7792 = false;
			((Class387_Sub1) this).anInt7812 = 0;
		}
	}

	public void ac(int i) {
		do {
			if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
				synchronized (this) {
					if ((((Class387_Sub1) this).anInt7746 & 0x10000) == 65536 && (i & 0x10000) == 0)
						method4810(true);
					((Class387_Sub1) this).anInt7746 = i;
					break;
				}
			}
			if ((((Class387_Sub1) this).anInt7746 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method4810(true);
			((Class387_Sub1) this).anInt7746 = i;
		} while (false);
	}

	public int dp() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7800;
	}

	public void PA(int i, int i_885_, int i_886_, int i_887_) {
		if ((((Class387_Sub1) this).anInt7746 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_888_ = 0; i_888_ < ((Class387_Sub1) this).anInt7757; i_888_++) {
			int i_889_ = ((Class387_Sub1) this).aShortArray7775[i_888_] & 0xffff;
			int i_890_ = i_889_ >> 10 & 0x3f;
			int i_891_ = i_889_ >> 7 & 0x7;
			int i_892_ = i_889_ & 0x7f;
			if (i != -1)
				i_890_ += (i - i_890_) * i_887_ >> 7;
			if (i_885_ != -1)
				i_891_ += (i_885_ - i_891_) * i_887_ >> 7;
			if (i_886_ != -1)
				i_892_ += (i_886_ - i_892_) * i_887_ >> 7;
			((Class387_Sub1) this).aShortArray7775[i_888_] = (short) (i_890_ << 10 | i_891_ << 7 | i_892_);
		}
		if (((Class387_Sub1) this).aClass16Array7789 != null) {
			for (int i_893_ = 0; i_893_ < ((Class387_Sub1) this).anInt7788; i_893_++) {
				Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_893_];
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_893_];
				((Class18) class18).anInt254 = (((Class18) class18).anInt254 * -1509687305 & ~0xffffff | ((Class379.anIntArray4096[Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	public int cu() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7797;
	}

	void method4809() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++) {
				int i_894_ = ((Class387_Sub1) this).anIntArray7751[i];
				((Class387_Sub1) this).anIntArray7751[i] = ((Class387_Sub1) this).anIntArray7753[i];
				((Class387_Sub1) this).anIntArray7753[i] = -i_894_;
			}
			method4800();
		}
	}

	void method4810(boolean bool) {
		do {
			if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
				synchronized (this) {
					method4790(bool);
					break;
				}
			}
			method4790(bool);
		} while (false);
	}

	public void method4741(Matrix3f class222, int i, boolean bool) {
		if (((Class387_Sub1) this).aShortArray7816 != null) {
			Class15 class15 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread());
			Matrix3f class222_895_ = ((Class15) class15).aClass222_189;
			class222_895_.method2070(class222);
			if (bool)
				class222_895_.method2058();
			Matrix4f class233 = ((Class15) class15).aClass233_194;
			class233.method2145(class222_895_);
			float[] fs = new float[3];
			for (int i_896_ = 0; i_896_ < ((Class387_Sub1) this).anInt7742; i_896_++) {
				if ((i & ((Class387_Sub1) this).aShortArray7816[i_896_]) != 0) {
					class233.method2149((float) ((Class387_Sub1) this).anIntArray7751[i_896_], (float) ((Class387_Sub1) this).anIntArray7752[i_896_], (float) ((Class387_Sub1) this).anIntArray7753[i_896_], fs);
					((Class387_Sub1) this).anIntArray7751[i_896_] = (int) fs[0];
					((Class387_Sub1) this).anIntArray7752[i_896_] = (int) fs[1];
					((Class387_Sub1) this).anIntArray7753[i_896_] = (int) fs[2];
				}
			}
		}
	}

	public void ia(int i, int i_897_, int i_898_) {
		if (i != 0 && (((Class387_Sub1) this).anInt7746 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_897_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_898_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_899_ = 0; i_899_ < ((Class387_Sub1) this).anInt7799; i_899_++) {
				((Class387_Sub1) this).anIntArray7751[i_899_] += i;
				((Class387_Sub1) this).anIntArray7752[i_899_] += i_897_;
				((Class387_Sub1) this).anIntArray7753[i_899_] += i_898_;
			}
		}
	}

	public void bu(int i, int i_900_, int i_901_) {
		if (i != 0 && (((Class387_Sub1) this).anInt7746 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_900_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_901_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_902_ = 0; i_902_ < ((Class387_Sub1) this).anInt7799; i_902_++) {
				((Class387_Sub1) this).anIntArray7751[i_902_] += i;
				((Class387_Sub1) this).anIntArray7752[i_902_] += i_900_;
				((Class387_Sub1) this).anIntArray7753[i_902_] += i_901_;
			}
		}
	}

	public void method4779(Class387 class387, int i, int i_903_, int i_904_, boolean bool) {
		Class387_Sub1 class387_sub1_905_ = (Class387_Sub1) class387;
		if ((((Class387_Sub1) this).anInt7746 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((((Class387_Sub1) class387_sub1_905_).anInt7746 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		method4807();
		method4814();
		class387_sub1_905_.method4807();
		class387_sub1_905_.method4814();
		anInt7805++;
		int i_906_ = 0;
		int[] is = ((Class387_Sub1) class387_sub1_905_).anIntArray7751;
		int i_907_ = ((Class387_Sub1) class387_sub1_905_).anInt7742;
		for (int i_908_ = 0; i_908_ < ((Class387_Sub1) this).anInt7742; i_908_++) {
			Class1 class1 = ((Class387_Sub1) this).aClass1Array7755[i_908_];
			if (((Class1) class1).anInt15 != 0) {
				int i_909_ = ((Class387_Sub1) this).anIntArray7752[i_908_] - i_903_;
				if (i_909_ >= ((Class387_Sub1) class387_sub1_905_).aShort7770 && (i_909_ <= ((Class387_Sub1) class387_sub1_905_).aShort7796)) {
					int i_910_ = ((Class387_Sub1) this).anIntArray7751[i_908_] - i;
					if ((i_910_ >= ((Class387_Sub1) class387_sub1_905_).aShort7797) && i_910_ <= (((Class387_Sub1) class387_sub1_905_).aShort7743)) {
						int i_911_ = (((Class387_Sub1) this).anIntArray7753[i_908_] - i_904_);
						if (i_911_ >= (((Class387_Sub1) class387_sub1_905_).aShort7795) && i_911_ <= (((Class387_Sub1) class387_sub1_905_).aShort7800)) {
							for (int i_912_ = 0; i_912_ < i_907_; i_912_++) {
								Class1 class1_913_ = (((Class387_Sub1) class387_sub1_905_).aClass1Array7755[i_912_]);
								if (i_910_ == is[i_912_] && i_911_ == (((Class387_Sub1) class387_sub1_905_).anIntArray7753[i_912_]) && i_909_ == (((Class387_Sub1) class387_sub1_905_).anIntArray7752[i_912_]) && ((Class1) class1_913_).anInt15 != 0) {
									if (((Class387_Sub1) this).aClass1Array7786 == null)
										((Class387_Sub1) this).aClass1Array7786 = new Class1[((Class387_Sub1) this).anInt7742];
									if ((((Class387_Sub1) class387_sub1_905_).aClass1Array7786) == null)
										((Class387_Sub1) class387_sub1_905_).aClass1Array7786 = new Class1[i_907_];
									Class1 class1_914_ = (((Class387_Sub1) this).aClass1Array7786[i_908_]);
									if (class1_914_ == null)
										class1_914_ = ((Class387_Sub1) this).aClass1Array7786[i_908_] = new Class1(class1);
									Class1 class1_915_ = (((Class387_Sub1) class387_sub1_905_).aClass1Array7786[i_912_]);
									if (class1_915_ == null)
										class1_915_ = ((Class387_Sub1) class387_sub1_905_).aClass1Array7786[i_912_] = new Class1(class1_913_);
									((Class1) class1_914_).anInt13 += ((Class1) class1_913_).anInt13;
									((Class1) class1_914_).anInt12 += ((Class1) class1_913_).anInt12;
									((Class1) class1_914_).anInt14 += ((Class1) class1_913_).anInt14;
									((Class1) class1_914_).anInt15 += ((Class1) class1_913_).anInt15;
									((Class1) class1_915_).anInt13 += ((Class1) class1).anInt13;
									((Class1) class1_915_).anInt12 += ((Class1) class1).anInt12;
									((Class1) class1_915_).anInt14 += ((Class1) class1).anInt14;
									((Class1) class1_915_).anInt15 += ((Class1) class1).anInt15;
									i_906_++;
									((Class387_Sub1) this).anIntArray7793[i_908_] = anInt7805;
									((Class387_Sub1) this).anIntArray7813[i_912_] = anInt7805;
								}
							}
						}
					}
				}
			}
		}
		if (i_906_ >= 3 && bool) {
			for (int i_916_ = 0; i_916_ < ((Class387_Sub1) this).anInt7757; i_916_++) {
				if (((((Class387_Sub1) this).anIntArray7793[((Class387_Sub1) this).aShortArray7758[i_916_]]) == anInt7805) && ((((Class387_Sub1) this).anIntArray7793[((Class387_Sub1) this).aShortArray7759[i_916_]]) == anInt7805) && ((((Class387_Sub1) this).anIntArray7793[((Class387_Sub1) this).aShortArray7760[i_916_]]) == anInt7805)) {
					if (((Class387_Sub1) this).aByteArray7771 == null)
						((Class387_Sub1) this).aByteArray7771 = new byte[((Class387_Sub1) this).anInt7757];
					((Class387_Sub1) this).aByteArray7771[i_916_] = (byte) 2;
				}
			}
			for (int i_917_ = 0; i_917_ < ((Class387_Sub1) class387_sub1_905_).anInt7757; i_917_++) {
				if ((((Class387_Sub1) this).anIntArray7813[(((Class387_Sub1) class387_sub1_905_).aShortArray7758[i_917_])]) == anInt7805 && (((Class387_Sub1) this).anIntArray7813[(((Class387_Sub1) class387_sub1_905_).aShortArray7759[i_917_])]) == anInt7805 && (((Class387_Sub1) this).anIntArray7813[(((Class387_Sub1) class387_sub1_905_).aShortArray7760[i_917_])]) == anInt7805) {
					if (((Class387_Sub1) class387_sub1_905_).aByteArray7771 == null)
						((Class387_Sub1) class387_sub1_905_).aByteArray7771 = new byte[(((Class387_Sub1) class387_sub1_905_).anInt7757)];
					((Class387_Sub1) class387_sub1_905_).aByteArray7771[i_917_] = (byte) 2;
				}
			}
		}
	}

	public void method4747(Class387 class387, int i, int i_918_, int i_919_, boolean bool) {
		Class387_Sub1 class387_sub1_920_ = (Class387_Sub1) class387;
		if ((((Class387_Sub1) this).anInt7746 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((((Class387_Sub1) class387_sub1_920_).anInt7746 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		method4807();
		method4814();
		class387_sub1_920_.method4807();
		class387_sub1_920_.method4814();
		anInt7805++;
		int i_921_ = 0;
		int[] is = ((Class387_Sub1) class387_sub1_920_).anIntArray7751;
		int i_922_ = ((Class387_Sub1) class387_sub1_920_).anInt7742;
		for (int i_923_ = 0; i_923_ < ((Class387_Sub1) this).anInt7742; i_923_++) {
			Class1 class1 = ((Class387_Sub1) this).aClass1Array7755[i_923_];
			if (((Class1) class1).anInt15 != 0) {
				int i_924_ = ((Class387_Sub1) this).anIntArray7752[i_923_] - i_918_;
				if (i_924_ >= ((Class387_Sub1) class387_sub1_920_).aShort7770 && (i_924_ <= ((Class387_Sub1) class387_sub1_920_).aShort7796)) {
					int i_925_ = ((Class387_Sub1) this).anIntArray7751[i_923_] - i;
					if ((i_925_ >= ((Class387_Sub1) class387_sub1_920_).aShort7797) && i_925_ <= (((Class387_Sub1) class387_sub1_920_).aShort7743)) {
						int i_926_ = (((Class387_Sub1) this).anIntArray7753[i_923_] - i_919_);
						if (i_926_ >= (((Class387_Sub1) class387_sub1_920_).aShort7795) && i_926_ <= (((Class387_Sub1) class387_sub1_920_).aShort7800)) {
							for (int i_927_ = 0; i_927_ < i_922_; i_927_++) {
								Class1 class1_928_ = (((Class387_Sub1) class387_sub1_920_).aClass1Array7755[i_927_]);
								if (i_925_ == is[i_927_] && i_926_ == (((Class387_Sub1) class387_sub1_920_).anIntArray7753[i_927_]) && i_924_ == (((Class387_Sub1) class387_sub1_920_).anIntArray7752[i_927_]) && ((Class1) class1_928_).anInt15 != 0) {
									if (((Class387_Sub1) this).aClass1Array7786 == null)
										((Class387_Sub1) this).aClass1Array7786 = new Class1[((Class387_Sub1) this).anInt7742];
									if ((((Class387_Sub1) class387_sub1_920_).aClass1Array7786) == null)
										((Class387_Sub1) class387_sub1_920_).aClass1Array7786 = new Class1[i_922_];
									Class1 class1_929_ = (((Class387_Sub1) this).aClass1Array7786[i_923_]);
									if (class1_929_ == null)
										class1_929_ = ((Class387_Sub1) this).aClass1Array7786[i_923_] = new Class1(class1);
									Class1 class1_930_ = (((Class387_Sub1) class387_sub1_920_).aClass1Array7786[i_927_]);
									if (class1_930_ == null)
										class1_930_ = ((Class387_Sub1) class387_sub1_920_).aClass1Array7786[i_927_] = new Class1(class1_928_);
									((Class1) class1_929_).anInt13 += ((Class1) class1_928_).anInt13;
									((Class1) class1_929_).anInt12 += ((Class1) class1_928_).anInt12;
									((Class1) class1_929_).anInt14 += ((Class1) class1_928_).anInt14;
									((Class1) class1_929_).anInt15 += ((Class1) class1_928_).anInt15;
									((Class1) class1_930_).anInt13 += ((Class1) class1).anInt13;
									((Class1) class1_930_).anInt12 += ((Class1) class1).anInt12;
									((Class1) class1_930_).anInt14 += ((Class1) class1).anInt14;
									((Class1) class1_930_).anInt15 += ((Class1) class1).anInt15;
									i_921_++;
									((Class387_Sub1) this).anIntArray7793[i_923_] = anInt7805;
									((Class387_Sub1) this).anIntArray7813[i_927_] = anInt7805;
								}
							}
						}
					}
				}
			}
		}
		if (i_921_ >= 3 && bool) {
			for (int i_931_ = 0; i_931_ < ((Class387_Sub1) this).anInt7757; i_931_++) {
				if (((((Class387_Sub1) this).anIntArray7793[((Class387_Sub1) this).aShortArray7758[i_931_]]) == anInt7805) && ((((Class387_Sub1) this).anIntArray7793[((Class387_Sub1) this).aShortArray7759[i_931_]]) == anInt7805) && ((((Class387_Sub1) this).anIntArray7793[((Class387_Sub1) this).aShortArray7760[i_931_]]) == anInt7805)) {
					if (((Class387_Sub1) this).aByteArray7771 == null)
						((Class387_Sub1) this).aByteArray7771 = new byte[((Class387_Sub1) this).anInt7757];
					((Class387_Sub1) this).aByteArray7771[i_931_] = (byte) 2;
				}
			}
			for (int i_932_ = 0; i_932_ < ((Class387_Sub1) class387_sub1_920_).anInt7757; i_932_++) {
				if ((((Class387_Sub1) this).anIntArray7813[(((Class387_Sub1) class387_sub1_920_).aShortArray7758[i_932_])]) == anInt7805 && (((Class387_Sub1) this).anIntArray7813[(((Class387_Sub1) class387_sub1_920_).aShortArray7759[i_932_])]) == anInt7805 && (((Class387_Sub1) this).anIntArray7813[(((Class387_Sub1) class387_sub1_920_).aShortArray7760[i_932_])]) == anInt7805) {
					if (((Class387_Sub1) class387_sub1_920_).aByteArray7771 == null)
						((Class387_Sub1) class387_sub1_920_).aByteArray7771 = new byte[(((Class387_Sub1) class387_sub1_920_).anInt7757)];
					((Class387_Sub1) class387_sub1_920_).aByteArray7771[i_932_] = (byte) 2;
				}
			}
		}
	}

	void method4811(Matrix3f class222, Class302_Sub1 class302_sub1, int i) {
		if (((Class387_Sub1) this).anInt7742 >= 1) {
			Class15 class15 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread());
			Matrix4f class233 = ((Class15) class15).aClass233_194;
			class233.method2145(class222);
			Matrix4f class233_933_ = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aClass233_8000);
			Matrix4f class233_934_ = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aClass233_7986);
			if (!((Class387_Sub1) this).aBoolean7792)
				method4807();
			boolean bool = class233.method2148();
			float[] fs = ((Class15) class15).aFloatArray198;
			class233.method2149(0.0F, (float) ((Class387_Sub1) this).aShort7770, 0.0F, fs);
			float f = fs[0];
			float f_935_ = fs[1];
			float f_936_ = fs[2];
			class233.method2149(0.0F, (float) ((Class387_Sub1) this).aShort7796, 0.0F, fs);
			float f_937_ = fs[0];
			float f_938_ = fs[1];
			float f_939_ = fs[2];
			for (int i_940_ = 0; i_940_ < 6; i_940_++) {
				float[] fs_941_ = (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloatArrayArray7988[i_940_]);
				float f_942_ = (fs_941_[0] * f + fs_941_[1] * f_935_ + fs_941_[2] * f_936_ + fs_941_[3] + (float) ((Class387_Sub1) this).aShort7739);
				float f_943_ = (fs_941_[0] * f_937_ + fs_941_[1] * f_938_ + fs_941_[2] * f_939_ + fs_941_[3] + (float) ((Class387_Sub1) this).aShort7739);
				if (f_942_ < 0.0F && f_943_ < 0.0F)
					return;
			}
			float f_944_;
			float f_945_;
			if (bool) {
				f_944_ = class233_933_.aFloatArray2594[14];
				f_945_ = class233_933_.aFloatArray2594[6];
			} else {
				f_944_ = ((class233.aFloatArray2594[12] * class233_933_.aFloatArray2594[2]) + (class233.aFloatArray2594[13] * class233_933_.aFloatArray2594[6]) + (class233.aFloatArray2594[14] * class233_933_.aFloatArray2594[10]) + class233_933_.aFloatArray2594[14]);
				f_945_ = ((class233.aFloatArray2594[4] * class233_933_.aFloatArray2594[2]) + (class233.aFloatArray2594[5] * class233_933_.aFloatArray2594[6]) + (class233.aFloatArray2594[6] * class233_933_.aFloatArray2594[10]));
			}
			float f_946_ = f_944_ + (float) ((Class387_Sub1) this).aShort7770 * f_945_;
			float f_947_ = f_944_ + (float) ((Class387_Sub1) this).aShort7796 * f_945_;
			float f_948_ = (f_946_ > f_947_ ? f_946_ + (float) ((Class387_Sub1) this).aShort7739 : f_947_ + (float) ((Class387_Sub1) this).aShort7739);
			float f_949_ = (class233_934_.aFloatArray2594[10] * f_948_ + class233_934_.aFloatArray2594[14]);
			if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
				synchronized (this) {
					while (((Class387_Sub1) this).aBoolean7808) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					((Class387_Sub1) this).aBoolean7808 = true;
				}
			}
			method4789(class15);
			Matrix4f class233_950_ = (((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_195);
			class233_950_.method2142(class233);
			class233_950_.method2144(((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aClass233_7987);
			if ((i & 0x2) != 0)
				((Class387_Sub1) this).aClass2_7737.method289(true);
			else
				((Class387_Sub1) this).aClass2_7737.method289(false);
			boolean bool_951_ = false;
			((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat220 = ((Class2) ((Class387_Sub1) this).aClass2_7737).aFloat17;
			((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat209 = ((Class2) ((Class387_Sub1) this).aClass2_7737).aFloat26;
			((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat211 = ((Class2) ((Class387_Sub1) this).aClass2_7737).aFloat46;
			((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat191 = (1.0F / ((Class2) ((Class387_Sub1) this).aClass2_7737).aFloat46);
			((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat208 = ((Class2) ((Class387_Sub1) this).aClass2_7737).aFloat23;
			((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat193 = ((Class2) ((Class387_Sub1) this).aClass2_7737).aFloat25;
			((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat212 = ((Class2) ((Class387_Sub1) this).aClass2_7737).aFloat27;
			((Class15) ((Class387_Sub1) this).aClass15_7735).anInt214 = (((Class2) ((Class387_Sub1) this).aClass2_7737).anInt22 * 1927366897);
			for (int i_952_ = 0; i_952_ < ((Class387_Sub1) this).anInt7799; i_952_++) {
				int i_953_ = ((Class387_Sub1) this).anIntArray7751[i_952_];
				int i_954_ = ((Class387_Sub1) this).anIntArray7752[i_952_];
				int i_955_ = ((Class387_Sub1) this).anIntArray7753[i_952_];
				float f_956_ = (class233_950_.aFloatArray2594[0] * (float) i_953_ + class233_950_.aFloatArray2594[4] * (float) i_954_ + class233_950_.aFloatArray2594[8] * (float) i_955_ + class233_950_.aFloatArray2594[12]);
				float f_957_ = (class233_950_.aFloatArray2594[1] * (float) i_953_ + class233_950_.aFloatArray2594[5] * (float) i_954_ + class233_950_.aFloatArray2594[9] * (float) i_955_ + class233_950_.aFloatArray2594[13]);
				float f_958_ = (class233_950_.aFloatArray2594[2] * (float) i_953_ + class233_950_.aFloatArray2594[6] * (float) i_954_ + class233_950_.aFloatArray2594[10] * (float) i_955_ + class233_950_.aFloatArray2594[14]);
				float f_959_ = (class233_950_.aFloatArray2594[3] * (float) i_953_ + class233_950_.aFloatArray2594[7] * (float) i_954_ + class233_950_.aFloatArray2594[11] * (float) i_955_ + class233_950_.aFloatArray2594[15]);
				((Class387_Sub1) this).aFloatArray7807[i_952_] = ((((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat212) + (((Class15) ((Class387_Sub1) this).aClass15_7735).aFloat211) * f_958_ / f_959_);
				((Class387_Sub1) this).aFloatArray7745[i_952_] = f_959_;
				if (f_958_ >= -f_959_) {
					((Class387_Sub1) this).aFloatArray7784[i_952_] = (float) (int) (((Class15) (((Class387_Sub1) this).aClass15_7735)).aFloat208 + (((Class15) (((Class387_Sub1) this).aClass15_7735)).aFloat220) * f_956_ / f_959_);
					((Class387_Sub1) this).aFloatArray7806[i_952_] = (float) (int) (((Class15) (((Class387_Sub1) this).aClass15_7735)).aFloat193 + (((Class15) (((Class387_Sub1) this).aClass15_7735)).aFloat209) * f_957_ / f_959_);
				} else {
					((Class387_Sub1) this).aFloatArray7784[i_952_] = -5000.0F;
					bool_951_ = true;
				}
				if (((Class15) ((Class387_Sub1) this).aClass15_7735).aBoolean186)
					((Class387_Sub1) this).anIntArray7734[i_952_] = (int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) i_953_) + (class233.aFloatArray2594[5] * (float) i_954_) + (class233.aFloatArray2594[9] * (float) i_955_)));
			}
			if (((Class387_Sub1) this).aClass16Array7789 != null) {
				for (int i_960_ = 0; i_960_ < ((Class387_Sub1) this).anInt7788; i_960_++) {
					Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_960_];
					Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_960_];
					short i_961_ = (((Class387_Sub1) this).aShortArray7758[((Class16) class16).anInt226 * -1295149283]);
					short i_962_ = (((Class387_Sub1) this).aShortArray7759[((Class16) class16).anInt226 * -1295149283]);
					short i_963_ = (((Class387_Sub1) this).aShortArray7760[((Class16) class16).anInt226 * -1295149283]);
					int i_964_ = ((((Class387_Sub1) this).anIntArray7751[i_961_] + ((Class387_Sub1) this).anIntArray7751[i_962_] + ((Class387_Sub1) this).anIntArray7751[i_963_]) / 3);
					int i_965_ = ((((Class387_Sub1) this).anIntArray7752[i_961_] + ((Class387_Sub1) this).anIntArray7752[i_962_] + ((Class387_Sub1) this).anIntArray7752[i_963_]) / 3);
					int i_966_ = ((((Class387_Sub1) this).anIntArray7753[i_961_] + ((Class387_Sub1) this).anIntArray7753[i_962_] + ((Class387_Sub1) this).anIntArray7753[i_963_]) / 3);
					float f_967_ = (class233_950_.aFloatArray2594[0] * (float) i_964_ + class233_950_.aFloatArray2594[4] * (float) i_965_ + class233_950_.aFloatArray2594[8] * (float) i_966_ + class233_950_.aFloatArray2594[12]);
					float f_968_ = (class233_950_.aFloatArray2594[1] * (float) i_964_ + class233_950_.aFloatArray2594[5] * (float) i_965_ + class233_950_.aFloatArray2594[9] * (float) i_966_ + class233_950_.aFloatArray2594[13]);
					float f_969_ = (class233_950_.aFloatArray2594[2] * (float) i_964_ + class233_950_.aFloatArray2594[6] * (float) i_965_ + class233_950_.aFloatArray2594[10] * (float) i_966_ + class233_950_.aFloatArray2594[14]);
					float f_970_ = (class233_950_.aFloatArray2594[3] * (float) i_964_ + class233_950_.aFloatArray2594[7] * (float) i_965_ + class233_950_.aFloatArray2594[11] * (float) i_966_ + class233_950_.aFloatArray2594[15]);
					f_969_ += ((class233_934_.aFloatArray2594[2] * (float) (((Class18) class18).anInt247 * -1848560027)) + (class233_934_.aFloatArray2594[6] * (float) (((Class18) class18).anInt244 * -1070844791)));
					f_970_ += ((class233_934_.aFloatArray2594[3] * (float) (((Class18) class18).anInt247 * -1848560027)) + (class233_934_.aFloatArray2594[7] * (float) (((Class18) class18).anInt244 * -1070844791)));
					if (f_969_ > -f_970_) {
						f_967_ += ((class233_934_.aFloatArray2594[0] * (float) (((Class18) class18).anInt247 * -1848560027)) + (class233_934_.aFloatArray2594[4] * (float) (((Class18) class18).anInt244 * -1070844791)));
						f_968_ += ((class233_934_.aFloatArray2594[1] * (float) (((Class18) class18).anInt247 * -1848560027)) + (class233_934_.aFloatArray2594[5] * (float) (((Class18) class18).anInt244 * -1070844791)));
						float f_971_ = ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat8005) + (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7993) * f_967_ / f_970_);
						float f_972_ = ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7996) + (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7995) * f_968_ / f_970_);
						float f_973_ = (((Class18) class18).aFloat245 * (float) ((Class16) class16).aShort229);
						float f_974_ = (((Class18) class18).aFloat248 * (float) ((Class16) class16).aShort231);
						float f_975_ = (f_967_ + class233_934_.aFloatArray2594[0] * f_973_ + class233_934_.aFloatArray2594[4] * f_974_);
						float f_976_ = (f_968_ + class233_934_.aFloatArray2594[1] * f_973_ + class233_934_.aFloatArray2594[5] * f_974_);
						float f_977_ = (f_970_ + class233_934_.aFloatArray2594[3] * f_973_ + class233_934_.aFloatArray2594[7] * f_974_);
						float f_978_ = ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat8005) + (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7993) * f_975_ / f_977_);
						float f_979_ = ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7996) + (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7995) * f_976_ / f_977_);
						((Class18) class18).anInt252 = (int) f_971_ * 748820179;
						((Class18) class18).anInt251 = (int) f_972_ * 208390755;
						((Class18) class18).aFloat250 = ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat8004) + ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7997) * (f_969_ - (class233_934_.aFloatArray2594[10] * (float) (((Class16) class16).anInt232 * 1540031241))) / f_970_));
						((Class18) class18).anInt246 = (int) (f_978_ < f_971_ ? f_971_ - f_978_ : f_978_ - f_971_) * -562729591;
						((Class18) class18).anInt253 = (int) (f_979_ < f_972_ ? f_972_ - f_979_ : f_979_ - f_972_) * -1138250243;
					} else {
						Class18 class18_980_ = class18;
						((Class18) class18).anInt253 = 0;
						((Class18) class18_980_).anInt246 = 0;
					}
				}
			}
			if (class302_sub1 != null) {
				boolean bool_981_ = false;
				boolean bool_982_ = true;
				int i_983_ = ((((Class387_Sub1) this).aShort7797 + ((Class387_Sub1) this).aShort7743) >> 1);
				int i_984_ = ((((Class387_Sub1) this).aShort7795 + ((Class387_Sub1) this).aShort7800) >> 1);
				int i_985_ = i_983_;
				short i_986_ = ((Class387_Sub1) this).aShort7770;
				int i_987_ = i_984_;
				float f_988_ = (class233_950_.aFloatArray2594[0] * (float) i_985_ + class233_950_.aFloatArray2594[4] * (float) i_986_ + class233_950_.aFloatArray2594[8] * (float) i_987_ + class233_950_.aFloatArray2594[12]);
				float f_989_ = (class233_950_.aFloatArray2594[1] * (float) i_985_ + class233_950_.aFloatArray2594[5] * (float) i_986_ + class233_950_.aFloatArray2594[9] * (float) i_987_ + class233_950_.aFloatArray2594[13]);
				float f_990_ = (class233_950_.aFloatArray2594[2] * (float) i_985_ + class233_950_.aFloatArray2594[6] * (float) i_986_ + class233_950_.aFloatArray2594[10] * (float) i_987_ + class233_950_.aFloatArray2594[14]);
				float f_991_ = (class233_950_.aFloatArray2594[3] * (float) i_985_ + class233_950_.aFloatArray2594[7] * (float) i_986_ + class233_950_.aFloatArray2594[11] * (float) i_987_ + class233_950_.aFloatArray2594[15]);
				if (f_990_ >= -f_991_) {
					class302_sub1.anInt7641 = (int) ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat8005) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993) * f_988_ / f_991_);
					class302_sub1.anInt7642 = (int) ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7996) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7995) * f_989_ / f_991_);
				} else
					bool_981_ = true;
				i_985_ = i_983_;
				i_986_ = ((Class387_Sub1) this).aShort7796;
				i_987_ = i_984_;
				float f_992_ = (class233_950_.aFloatArray2594[0] * (float) i_985_ + class233_950_.aFloatArray2594[4] * (float) i_986_ + class233_950_.aFloatArray2594[8] * (float) i_987_ + class233_950_.aFloatArray2594[12]);
				float f_993_ = (class233_950_.aFloatArray2594[1] * (float) i_985_ + class233_950_.aFloatArray2594[5] * (float) i_986_ + class233_950_.aFloatArray2594[9] * (float) i_987_ + class233_950_.aFloatArray2594[13]);
				float f_994_ = (class233_950_.aFloatArray2594[2] * (float) i_985_ + class233_950_.aFloatArray2594[6] * (float) i_986_ + class233_950_.aFloatArray2594[10] * (float) i_987_ + class233_950_.aFloatArray2594[14]);
				float f_995_ = (class233_950_.aFloatArray2594[3] * (float) i_985_ + class233_950_.aFloatArray2594[7] * (float) i_986_ + class233_950_.aFloatArray2594[11] * (float) i_987_ + class233_950_.aFloatArray2594[15]);
				if (f_994_ >= -f_995_) {
					class302_sub1.anInt7643 = (int) ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat8005) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993) * f_992_ / f_995_);
					class302_sub1.anInt7640 = (int) ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7996) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7995) * f_993_ / f_995_);
				} else
					bool_981_ = true;
				if (bool_981_) {
					if (f_990_ < -f_991_ && f_994_ < -f_995_)
						bool_982_ = false;
					else if (f_990_ < -f_991_) {
						float f_996_ = (f_990_ + f_991_) / (f_994_ + f_995_) - 1.0F;
						float f_997_ = f_988_ + f_996_ * (f_992_ - f_988_);
						float f_998_ = f_989_ + f_996_ * (f_993_ - f_989_);
						float f_999_ = f_991_ + f_996_ * (f_995_ - f_991_);
						class302_sub1.anInt7641 = (int) ((((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat8005) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993 * f_997_ / f_999_));
						class302_sub1.anInt7642 = (int) ((((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7996) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7995 * f_998_ / f_999_));
					} else if (f_994_ < -f_995_) {
						float f_1000_ = (f_994_ + f_995_) / (f_990_ + f_991_) - 1.0F;
						float f_1001_ = f_992_ + f_1000_ * (f_988_ - f_992_);
						float f_1002_ = f_993_ + f_1000_ * (f_989_ - f_993_);
						float f_1003_ = f_995_ + f_1000_ * (f_991_ - f_995_);
						class302_sub1.anInt7643 = (int) ((((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat8005) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993 * f_1001_ / f_1003_));
						class302_sub1.anInt7640 = (int) ((((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7996) + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7995 * f_1002_ / f_1003_));
					}
				}
				if (bool_982_) {
					if (f_990_ / f_991_ > f_994_ / f_995_) {
						float f_1004_ = (f_988_ + (class233_934_.aFloatArray2594[0] * (float) ((Class387_Sub1) this).aShort7739) + class233_934_.aFloatArray2594[12]);
						float f_1005_ = (f_991_ + (class233_934_.aFloatArray2594[3] * (float) ((Class387_Sub1) this).aShort7739) + class233_934_.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat8005) - (float) class302_sub1.anInt7641 + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993 * f_1004_ / f_1005_));
					} else {
						float f_1006_ = (f_992_ + (class233_934_.aFloatArray2594[0] * (float) ((Class387_Sub1) this).aShort7739) + class233_934_.aFloatArray2594[12]);
						float f_1007_ = (f_995_ + (class233_934_.aFloatArray2594[3] * (float) ((Class387_Sub1) this).aShort7739) + class233_934_.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat8005) - (float) class302_sub1.anInt7643 + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993 * f_1006_ / f_1007_));
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			method4810(true);
			((Class2) ((Class387_Sub1) this).aClass2_7737).aBoolean16 = (i & 0x1) == 0;
			((Class2) ((Class387_Sub1) this).aClass2_7737).aBoolean48 = false;
			try {
				method4813((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anIntArray7967) != null, (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloatArray7973) != null, (i & 0x4) != 0, bool_951_, (((((Class15) ((Class387_Sub1) this).aClass15_7735).aBoolean216) && f_949_ > (((Class15) (((Class387_Sub1) this).aClass15_7735)).aFloat205)) || ((Class15) (((Class387_Sub1) this).aClass15_7735)).aBoolean186));
			} catch (Exception exception) {
				/* empty */
			}
			if (((Class387_Sub1) this).aClass16Array7789 != null) {
				for (int i_1008_ = 0; i_1008_ < ((Class387_Sub1) this).anInt7757; i_1008_++)
					((Class387_Sub1) this).anIntArray7814[i_1008_] = -1;
			}
			((Class387_Sub1) this).aClass2_7737 = null;
			if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
				synchronized (this) {
					((Class387_Sub1) this).aBoolean7808 = false;
					this.notifyAll();
				}
			}
		}
	}

	public Class85[] method4781() {
		return ((Class387_Sub1) this).aClass85Array7750;
	}

	public Class387 method4749(byte i, int i_1009_, boolean bool) {
		method4815(Thread.currentThread());
		boolean bool_1010_ = false;
		Class387_Sub1 class387_sub1_1011_;
		Class387_Sub1 class387_sub1_1012_;
		if (i > 0 && i <= 7) {
			class387_sub1_1012_ = ((Class387_Sub1) this).aClass387_Sub1Array7804[i - 1];
			class387_sub1_1011_ = ((Class387_Sub1) this).aClass387_Sub1Array7815[i - 1];
			bool_1010_ = true;
		} else
			class387_sub1_1011_ = class387_sub1_1012_ = new Class387_Sub1(((Class387_Sub1) this).aClass_ra_Sub1_7769);
		return method4793(class387_sub1_1011_, class387_sub1_1012_, i_1009_, bool_1010_, bool);
	}

	public Class387 method4750(byte i, int i_1013_, boolean bool) {
		method4815(Thread.currentThread());
		boolean bool_1014_ = false;
		Class387_Sub1 class387_sub1_1015_;
		Class387_Sub1 class387_sub1_1016_;
		if (i > 0 && i <= 7) {
			class387_sub1_1016_ = ((Class387_Sub1) this).aClass387_Sub1Array7804[i - 1];
			class387_sub1_1015_ = ((Class387_Sub1) this).aClass387_Sub1Array7815[i - 1];
			bool_1014_ = true;
		} else
			class387_sub1_1015_ = class387_sub1_1016_ = new Class387_Sub1(((Class387_Sub1) this).aClass_ra_Sub1_7769);
		return method4793(class387_sub1_1015_, class387_sub1_1016_, i_1013_, bool_1014_, bool);
	}

	public int an() {
		return ((Class387_Sub1) this).anInt7746;
	}

	public void au(int i) {
		do {
			if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
				synchronized (this) {
					if ((((Class387_Sub1) this).anInt7746 & 0x10000) == 65536 && (i & 0x10000) == 0)
						method4810(true);
					((Class387_Sub1) this).anInt7746 = i;
					break;
				}
			}
			if ((((Class387_Sub1) this).anInt7746 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method4810(true);
			((Class387_Sub1) this).anInt7746 = i;
		} while (false);
	}

	public void ar(int i) {
		do {
			if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
				synchronized (this) {
					if ((((Class387_Sub1) this).anInt7746 & 0x10000) == 65536 && (i & 0x10000) == 0)
						method4810(true);
					((Class387_Sub1) this).anInt7746 = i;
					break;
				}
			}
			if ((((Class387_Sub1) this).anInt7746 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method4810(true);
			((Class387_Sub1) this).anInt7746 = i;
		} while (false);
	}

	public void bo(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x6) != 6)
			throw new IllegalStateException();
		int i_1017_ = Class220.anIntArray2483[i];
		int i_1018_ = Class220.anIntArray2474[i];
		synchronized (this) {
			for (int i_1019_ = 0; i_1019_ < ((Class387_Sub1) this).anInt7799; i_1019_++) {
				int i_1020_ = (((Class387_Sub1) this).anIntArray7752[i_1019_] * i_1018_ - (((Class387_Sub1) this).anIntArray7753[i_1019_] * i_1017_)) >> 14;
				((Class387_Sub1) this).anIntArray7753[i_1019_] = (((Class387_Sub1) this).anIntArray7752[i_1019_] * i_1017_ + (((Class387_Sub1) this).anIntArray7753[i_1019_] * i_1018_)) >> 14;
				((Class387_Sub1) this).anIntArray7752[i_1019_] = i_1020_;
			}
			method4800();
		}
	}

	public void method4752() {
		/* empty */
	}

	Class387_Sub1(Class_ra_Sub1 class_ra_sub1) {
		((Class387_Sub1) this).anInt7799 = 0;
		((Class387_Sub1) this).anInt7742 = 0;
		((Class387_Sub1) this).anInt7757 = 0;
		((Class387_Sub1) this).anInt7812 = 0;
		((Class387_Sub1) this).aBoolean7780 = false;
		((Class387_Sub1) this).aBoolean7785 = false;
		((Class387_Sub1) this).aBoolean7792 = false;
		((Class387_Sub1) this).aBoolean7756 = false;
		((Class387_Sub1) this).aBoolean7777 = false;
		((Class387_Sub1) this).aClass_ra_Sub1_7769 = class_ra_sub1;
	}

	final void method4812(boolean bool, boolean bool_1021_, boolean bool_1022_, int i) {
		short i_1023_ = ((Class387_Sub1) this).aShortArray7758[i];
		short i_1024_ = ((Class387_Sub1) this).aShortArray7759[i];
		short i_1025_ = ((Class387_Sub1) this).aShortArray7760[i];
		if (((Class387_Sub1) this).aShortArray7774 == null || ((Class387_Sub1) this).aShortArray7774[i] == -1) {
			if (((Class387_Sub1) this).aByteArray7773 == null)
				((Class2) ((Class387_Sub1) this).aClass2_7737).anInt19 = 0;
			else
				((Class2) ((Class387_Sub1) this).aClass2_7737).anInt19 = ((Class387_Sub1) this).aByteArray7773[i] & 0xff;
			if (((Class387_Sub1) this).anIntArray7801[i] == -1)
				((Class387_Sub1) this).aClass2_7737.method293(bool, bool_1021_, bool_1022_, ((Class387_Sub1) this).aFloatArray7806[i_1023_], ((Class387_Sub1) this).aFloatArray7806[i_1024_], ((Class387_Sub1) this).aFloatArray7806[i_1025_], ((Class387_Sub1) this).aFloatArray7784[i_1023_], ((Class387_Sub1) this).aFloatArray7784[i_1024_], ((Class387_Sub1) this).aFloatArray7784[i_1025_], ((Class387_Sub1) this).aFloatArray7807[i_1023_], ((Class387_Sub1) this).aFloatArray7807[i_1024_],
						((Class387_Sub1) this).aFloatArray7807[i_1025_], (Class379.anIntArray4096[((Class387_Sub1) this).anIntArray7763[i] & 0xffff]));
			else
				((Class387_Sub1) this).aClass2_7737.method299(bool, bool_1021_, bool_1022_, ((Class387_Sub1) this).aFloatArray7806[i_1023_], ((Class387_Sub1) this).aFloatArray7806[i_1024_], ((Class387_Sub1) this).aFloatArray7806[i_1025_], ((Class387_Sub1) this).aFloatArray7784[i_1023_], ((Class387_Sub1) this).aFloatArray7784[i_1024_], ((Class387_Sub1) this).aFloatArray7784[i_1025_], ((Class387_Sub1) this).aFloatArray7807[i_1023_], ((Class387_Sub1) this).aFloatArray7807[i_1024_],
						((Class387_Sub1) this).aFloatArray7807[i_1025_], (float) (((Class387_Sub1) this).anIntArray7763[i] & 0xffff), (float) (((Class387_Sub1) this).anIntArray7764[i] & 0xffff), (float) (((Class387_Sub1) this).anIntArray7801[i] & 0xffff));
		} else {
			int i_1026_ = -16777216;
			if (((Class387_Sub1) this).aByteArray7773 != null)
				i_1026_ = 255 - (((Class387_Sub1) this).aByteArray7773[i] & 0xff) << 24;
			if (((Class387_Sub1) this).anIntArray7801[i] == -1) {
				int i_1027_ = (i_1026_ | ((Class387_Sub1) this).anIntArray7763[i] & 0xffffff);
				((Class387_Sub1) this).aClass2_7737.method290(bool, bool_1021_, bool_1022_, ((Class387_Sub1) this).aFloatArray7806[i_1023_], ((Class387_Sub1) this).aFloatArray7806[i_1024_], ((Class387_Sub1) this).aFloatArray7806[i_1025_], ((Class387_Sub1) this).aFloatArray7784[i_1023_], ((Class387_Sub1) this).aFloatArray7784[i_1024_], ((Class387_Sub1) this).aFloatArray7784[i_1025_], ((Class387_Sub1) this).aFloatArray7807[i_1023_], ((Class387_Sub1) this).aFloatArray7807[i_1024_],
						((Class387_Sub1) this).aFloatArray7807[i_1025_], ((Class387_Sub1) this).aFloatArray7745[i_1023_], ((Class387_Sub1) this).aFloatArray7745[i_1024_], ((Class387_Sub1) this).aFloatArray7745[i_1025_], ((Class387_Sub1) this).aFloatArrayArray7738[i][0], ((Class387_Sub1) this).aFloatArrayArray7738[i][1], ((Class387_Sub1) this).aFloatArrayArray7738[i][2], ((Class387_Sub1) this).aFloatArrayArray7762[i][0], ((Class387_Sub1) this).aFloatArrayArray7762[i][1],
						((Class387_Sub1) this).aFloatArrayArray7762[i][2], i_1027_, i_1027_, i_1027_, (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184 * 688695183), 0.0F, 0.0F, 0.0F, ((Class387_Sub1) this).aShortArray7774[i]);
			} else
				((Class387_Sub1) this).aClass2_7737.method290(bool, bool_1021_, bool_1022_, ((Class387_Sub1) this).aFloatArray7806[i_1023_], ((Class387_Sub1) this).aFloatArray7806[i_1024_], ((Class387_Sub1) this).aFloatArray7806[i_1025_], ((Class387_Sub1) this).aFloatArray7784[i_1023_], ((Class387_Sub1) this).aFloatArray7784[i_1024_], ((Class387_Sub1) this).aFloatArray7784[i_1025_], ((Class387_Sub1) this).aFloatArray7807[i_1023_], ((Class387_Sub1) this).aFloatArray7807[i_1024_],
						((Class387_Sub1) this).aFloatArray7807[i_1025_], ((Class387_Sub1) this).aFloatArray7745[i_1023_], ((Class387_Sub1) this).aFloatArray7745[i_1024_], ((Class387_Sub1) this).aFloatArray7745[i_1025_], ((Class387_Sub1) this).aFloatArrayArray7738[i][0], ((Class387_Sub1) this).aFloatArrayArray7738[i][1], ((Class387_Sub1) this).aFloatArrayArray7738[i][2], ((Class387_Sub1) this).aFloatArrayArray7762[i][0], ((Class387_Sub1) this).aFloatArrayArray7762[i][1],
						((Class387_Sub1) this).aFloatArrayArray7762[i][2], (i_1026_ | ((Class387_Sub1) this).anIntArray7763[i] & 0xffffff), (i_1026_ | ((Class387_Sub1) this).anIntArray7764[i] & 0xffffff), (i_1026_ | ((Class387_Sub1) this).anIntArray7801[i] & 0xffffff), (((Class15) ((Class387_Sub1) this).aClass15_7735).anInt184 * 688695183), 0.0F, 0.0F, 0.0F, ((Class387_Sub1) this).aShortArray7774[i]);
		}
	}

	public Class387 method4770(byte i, int i_1028_, boolean bool) {
		method4815(Thread.currentThread());
		boolean bool_1029_ = false;
		Class387_Sub1 class387_sub1_1030_;
		Class387_Sub1 class387_sub1_1031_;
		if (i > 0 && i <= 7) {
			class387_sub1_1031_ = ((Class387_Sub1) this).aClass387_Sub1Array7804[i - 1];
			class387_sub1_1030_ = ((Class387_Sub1) this).aClass387_Sub1Array7815[i - 1];
			bool_1029_ = true;
		} else
			class387_sub1_1030_ = class387_sub1_1031_ = new Class387_Sub1(((Class387_Sub1) this).aClass_ra_Sub1_7769);
		return method4793(class387_sub1_1030_, class387_sub1_1031_, i_1028_, bool_1029_, bool);
	}

	public void by(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub1) this).aClass1Array7755 != null) {
				if (i == 4096) {
					method4797();
					break;
				}
				if (i == 8192) {
					method4798();
					break;
				}
				if (i == 12288) {
					method4799();
					break;
				}
				int i_1032_ = Class220.anIntArray2483[i];
				int i_1033_ = Class220.anIntArray2474[i];
				synchronized (this) {
					for (int i_1034_ = 0; i_1034_ < ((Class387_Sub1) this).anInt7742; i_1034_++) {
						int i_1035_ = (((((Class387_Sub1) this).anIntArray7753[i_1034_] * i_1032_) + (((Class387_Sub1) this).anIntArray7751[i_1034_]) * i_1033_) >> 14);
						((Class387_Sub1) this).anIntArray7753[i_1034_] = ((((Class387_Sub1) this).anIntArray7753[i_1034_] * i_1033_) - (((Class387_Sub1) this).anIntArray7751[i_1034_]) * i_1032_) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_1034_] = i_1035_;
						if (((Class387_Sub1) this).aClass1Array7755[i_1034_] != null) {
							i_1035_ = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1034_])).anInt14) * i_1032_ + (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1034_])).anInt13) * i_1033_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1034_])).anInt14 = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1034_])).anInt14) * i_1033_ - (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1034_])).anInt13) * i_1032_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1034_])).anInt13 = i_1035_;
						}
					}
					if (((Class387_Sub1) this).aClass5Array7740 != null) {
						for (int i_1036_ = 0; i_1036_ < ((Class387_Sub1) this).anInt7757; i_1036_++) {
							if ((((Class387_Sub1) this).aClass5Array7740[i_1036_]) != null) {
								int i_1037_ = ((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1036_])).anInt80) * i_1032_ + (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1036_])).anInt78 * i_1033_)) >> 14;
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1036_])).anInt80 = ((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1036_])).anInt80) * i_1033_ - (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1036_])).anInt78 * i_1032_)) >> 14;
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1036_])).anInt78 = i_1037_;
							}
						}
					}
					for (int i_1038_ = ((Class387_Sub1) this).anInt7742; i_1038_ < ((Class387_Sub1) this).anInt7799; i_1038_++) {
						int i_1039_ = (((((Class387_Sub1) this).anIntArray7753[i_1038_] * i_1032_) + (((Class387_Sub1) this).anIntArray7751[i_1038_]) * i_1033_) >> 14);
						((Class387_Sub1) this).anIntArray7753[i_1038_] = ((((Class387_Sub1) this).anIntArray7753[i_1038_] * i_1033_) - (((Class387_Sub1) this).anIntArray7751[i_1038_]) * i_1032_) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_1038_] = i_1039_;
					}
					((Class387_Sub1) this).anInt7812 = 0;
					((Class387_Sub1) this).aBoolean7792 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public void bm(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub1) this).aClass1Array7755 != null) {
				if (i == 4096) {
					method4797();
					break;
				}
				if (i == 8192) {
					method4798();
					break;
				}
				if (i == 12288) {
					method4799();
					break;
				}
				int i_1040_ = Class220.anIntArray2483[i];
				int i_1041_ = Class220.anIntArray2474[i];
				synchronized (this) {
					for (int i_1042_ = 0; i_1042_ < ((Class387_Sub1) this).anInt7742; i_1042_++) {
						int i_1043_ = (((((Class387_Sub1) this).anIntArray7753[i_1042_] * i_1040_) + (((Class387_Sub1) this).anIntArray7751[i_1042_]) * i_1041_) >> 14);
						((Class387_Sub1) this).anIntArray7753[i_1042_] = ((((Class387_Sub1) this).anIntArray7753[i_1042_] * i_1041_) - (((Class387_Sub1) this).anIntArray7751[i_1042_]) * i_1040_) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_1042_] = i_1043_;
						if (((Class387_Sub1) this).aClass1Array7755[i_1042_] != null) {
							i_1043_ = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1042_])).anInt14) * i_1040_ + (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1042_])).anInt13) * i_1041_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1042_])).anInt14 = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1042_])).anInt14) * i_1041_ - (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1042_])).anInt13) * i_1040_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1042_])).anInt13 = i_1043_;
						}
					}
					if (((Class387_Sub1) this).aClass5Array7740 != null) {
						for (int i_1044_ = 0; i_1044_ < ((Class387_Sub1) this).anInt7757; i_1044_++) {
							if ((((Class387_Sub1) this).aClass5Array7740[i_1044_]) != null) {
								int i_1045_ = ((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1044_])).anInt80) * i_1040_ + (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1044_])).anInt78 * i_1041_)) >> 14;
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1044_])).anInt80 = ((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1044_])).anInt80) * i_1041_ - (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1044_])).anInt78 * i_1040_)) >> 14;
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1044_])).anInt78 = i_1045_;
							}
						}
					}
					for (int i_1046_ = ((Class387_Sub1) this).anInt7742; i_1046_ < ((Class387_Sub1) this).anInt7799; i_1046_++) {
						int i_1047_ = (((((Class387_Sub1) this).anIntArray7753[i_1046_] * i_1040_) + (((Class387_Sub1) this).anIntArray7751[i_1046_]) * i_1041_) >> 14);
						((Class387_Sub1) this).anIntArray7753[i_1046_] = ((((Class387_Sub1) this).anIntArray7753[i_1046_] * i_1041_) - (((Class387_Sub1) this).anIntArray7751[i_1046_]) * i_1040_) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_1046_] = i_1047_;
					}
					((Class387_Sub1) this).anInt7812 = 0;
					((Class387_Sub1) this).aBoolean7792 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public void bc(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub1) this).aClass1Array7755 != null) {
				if (i == 4096) {
					method4797();
					break;
				}
				if (i == 8192) {
					method4798();
					break;
				}
				if (i == 12288) {
					method4799();
					break;
				}
				int i_1048_ = Class220.anIntArray2483[i];
				int i_1049_ = Class220.anIntArray2474[i];
				synchronized (this) {
					for (int i_1050_ = 0; i_1050_ < ((Class387_Sub1) this).anInt7742; i_1050_++) {
						int i_1051_ = (((((Class387_Sub1) this).anIntArray7753[i_1050_] * i_1048_) + (((Class387_Sub1) this).anIntArray7751[i_1050_]) * i_1049_) >> 14);
						((Class387_Sub1) this).anIntArray7753[i_1050_] = ((((Class387_Sub1) this).anIntArray7753[i_1050_] * i_1049_) - (((Class387_Sub1) this).anIntArray7751[i_1050_]) * i_1048_) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_1050_] = i_1051_;
						if (((Class387_Sub1) this).aClass1Array7755[i_1050_] != null) {
							i_1051_ = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1050_])).anInt14) * i_1048_ + (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1050_])).anInt13) * i_1049_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1050_])).anInt14 = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1050_])).anInt14) * i_1049_ - (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1050_])).anInt13) * i_1048_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_1050_])).anInt13 = i_1051_;
						}
					}
					if (((Class387_Sub1) this).aClass5Array7740 != null) {
						for (int i_1052_ = 0; i_1052_ < ((Class387_Sub1) this).anInt7757; i_1052_++) {
							if ((((Class387_Sub1) this).aClass5Array7740[i_1052_]) != null) {
								int i_1053_ = ((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1052_])).anInt80) * i_1048_ + (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1052_])).anInt78 * i_1049_)) >> 14;
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1052_])).anInt80 = ((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1052_])).anInt80) * i_1049_ - (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1052_])).anInt78 * i_1048_)) >> 14;
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_1052_])).anInt78 = i_1053_;
							}
						}
					}
					for (int i_1054_ = ((Class387_Sub1) this).anInt7742; i_1054_ < ((Class387_Sub1) this).anInt7799; i_1054_++) {
						int i_1055_ = (((((Class387_Sub1) this).anIntArray7753[i_1054_] * i_1048_) + (((Class387_Sub1) this).anIntArray7751[i_1054_]) * i_1049_) >> 14);
						((Class387_Sub1) this).anIntArray7753[i_1054_] = ((((Class387_Sub1) this).anIntArray7753[i_1054_] * i_1049_) - (((Class387_Sub1) this).anIntArray7751[i_1054_]) * i_1048_) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_1054_] = i_1055_;
					}
					((Class387_Sub1) this).anInt7812 = 0;
					((Class387_Sub1) this).aBoolean7792 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public void method4751(Matrix3f class222) {
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		Matrix4f class233 = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_194;
		class233.method2145(class222);
		if (((Class387_Sub1) this).aClass85Array7750 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass85Array7750.length; i++) {
				Class85 class85 = ((Class387_Sub1) this).aClass85Array7750[i];
				Class85 class85_1056_ = class85;
				if (class85.aClass85_776 != null)
					class85_1056_ = class85.aClass85_776;
				class85_1056_.anInt777 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -1879868075);
				class85_1056_.anInt783 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -2041556771);
				class85_1056_.anInt779 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -1434499227);
				class85_1056_.anInt772 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 1070341177);
				class85_1056_.anInt781 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 1802851857);
				class85_1056_.anInt782 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 103846281;
				class85_1056_.anInt771 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * -2103324039);
				class85_1056_.anInt784 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * -526039059);
				class85_1056_.anInt785 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (((Class387_Sub1) this).aClass68Array7754 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass68Array7754.length; i++) {
				Class68 class68 = ((Class387_Sub1) this).aClass68Array7754[i];
				Class68 class68_1057_ = class68;
				if (class68.aClass68_672 != null)
					class68_1057_ = class68.aClass68_672;
				if (class68.aClass233_677 != null)
					class68.aClass233_677.method2142(class233);
				else
					class68.aClass233_677 = new Matrix4f(class233);
				class68_1057_.anInt671 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * -1436341053);
				class68_1057_.anInt675 = (int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * 449866009;
				class68_1057_.anInt676 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	public boolean ek() {
		return ((Class387_Sub1) this).aBoolean7777;
	}

	public void W(short i, short i_1058_) {
		if (((Class387_Sub1) this).aShortArray7774 != null) {
			if (!((Class387_Sub1) this).aBoolean7777 && i_1058_ >= 0) {
				Class53 class53 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.anInterface_ma5299.method174(i_1058_ & 0xffff, 1755234581);
				if (class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class387_Sub1) this).aBoolean7777 = true;
			}
			for (int i_1059_ = 0; i_1059_ < ((Class387_Sub1) this).anInt7757; i_1059_++) {
				if (((Class387_Sub1) this).aShortArray7774[i_1059_] == i)
					((Class387_Sub1) this).aShortArray7774[i_1059_] = i_1058_;
			}
		}
	}

	void cl(int i, int[] is, int i_1060_, int i_1061_, int i_1062_, boolean bool, int i_1063_, int[] is_1064_) {
		int i_1065_ = is.length;
		if (i == 0) {
			i_1060_ <<= 4;
			i_1061_ <<= 4;
			i_1062_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1066_ = 0; i_1066_ < ((Class387_Sub1) this).anInt7799; i_1066_++) {
					((Class387_Sub1) this).anIntArray7751[i_1066_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1066_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1066_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			int i_1067_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_1068_ = 0; i_1068_ < i_1065_; i_1068_++) {
				int i_1069_ = is[i_1068_];
				if (i_1069_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1070_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1069_];
					for (int i_1071_ = 0; i_1071_ < is_1070_.length; i_1071_++) {
						int i_1072_ = is_1070_[i_1071_];
						if (((Class387_Sub1) this).aShortArray7816 == null || (i_1063_ & (((Class387_Sub1) this).aShortArray7816[i_1072_])) != 0) {
							((Class387_Sub1) this).anInt7782 += (((Class387_Sub1) this).anIntArray7751[i_1072_]);
							((Class387_Sub1) this).anInt7783 += (((Class387_Sub1) this).anIntArray7752[i_1072_]);
							((Class387_Sub1) this).anInt7781 += (((Class387_Sub1) this).anIntArray7753[i_1072_]);
							i_1067_++;
						}
					}
				}
			}
			if (i_1067_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_1067_ + i_1060_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_1067_ + i_1061_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_1067_ + i_1062_;
				((Class387_Sub1) this).aBoolean7785 = true;
			} else {
				((Class387_Sub1) this).anInt7782 = i_1060_;
				((Class387_Sub1) this).anInt7783 = i_1061_;
				((Class387_Sub1) this).anInt7781 = i_1062_;
			}
		} else if (i == 1) {
			if (is_1064_ != null) {
				int i_1073_ = ((is_1064_[0] * i_1060_ + is_1064_[1] * i_1061_ + is_1064_[2] * i_1062_ + 8192) >> 14);
				int i_1074_ = ((is_1064_[3] * i_1060_ + is_1064_[4] * i_1061_ + is_1064_[5] * i_1062_ + 8192) >> 14);
				int i_1075_ = ((is_1064_[6] * i_1060_ + is_1064_[7] * i_1061_ + is_1064_[8] * i_1062_ + 8192) >> 14);
				i_1060_ = i_1073_;
				i_1061_ = i_1074_;
				i_1062_ = i_1075_;
			}
			i_1060_ <<= 4;
			i_1061_ <<= 4;
			i_1062_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1076_ = 0; i_1076_ < ((Class387_Sub1) this).anInt7799; i_1076_++) {
					((Class387_Sub1) this).anIntArray7751[i_1076_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1076_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1076_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			for (int i_1077_ = 0; i_1077_ < i_1065_; i_1077_++) {
				int i_1078_ = is[i_1077_];
				if (i_1078_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1079_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1078_];
					for (int i_1080_ = 0; i_1080_ < is_1079_.length; i_1080_++) {
						int i_1081_ = is_1079_[i_1080_];
						if (((Class387_Sub1) this).aShortArray7816 == null || (i_1063_ & (((Class387_Sub1) this).aShortArray7816[i_1081_])) != 0) {
							((Class387_Sub1) this).anIntArray7751[i_1081_] += i_1060_;
							((Class387_Sub1) this).anIntArray7752[i_1081_] += i_1061_;
							((Class387_Sub1) this).anIntArray7753[i_1081_] += i_1062_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1064_ != null) {
				if (!((Class387_Sub1) this).aBoolean7780) {
					for (int i_1082_ = 0; i_1082_ < ((Class387_Sub1) this).anInt7799; i_1082_++) {
						((Class387_Sub1) this).anIntArray7751[i_1082_] <<= 4;
						((Class387_Sub1) this).anIntArray7752[i_1082_] <<= 4;
						((Class387_Sub1) this).anIntArray7753[i_1082_] <<= 4;
					}
					((Class387_Sub1) this).aBoolean7780 = true;
				}
				int i_1083_ = is_1064_[9] << 4;
				int i_1084_ = is_1064_[10] << 4;
				int i_1085_ = is_1064_[11] << 4;
				int i_1086_ = is_1064_[12] << 4;
				int i_1087_ = is_1064_[13] << 4;
				int i_1088_ = is_1064_[14] << 4;
				if (((Class387_Sub1) this).aBoolean7785) {
					int i_1089_ = ((is_1064_[0] * ((Class387_Sub1) this).anInt7782 + is_1064_[3] * ((Class387_Sub1) this).anInt7783 + is_1064_[6] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1090_ = ((is_1064_[1] * ((Class387_Sub1) this).anInt7782 + is_1064_[4] * ((Class387_Sub1) this).anInt7783 + is_1064_[7] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1091_ = ((is_1064_[2] * ((Class387_Sub1) this).anInt7782 + is_1064_[5] * ((Class387_Sub1) this).anInt7783 + is_1064_[8] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					i_1089_ += i_1086_;
					i_1090_ += i_1087_;
					i_1091_ += i_1088_;
					((Class387_Sub1) this).anInt7782 = i_1089_;
					((Class387_Sub1) this).anInt7783 = i_1090_;
					((Class387_Sub1) this).anInt7781 = i_1091_;
					((Class387_Sub1) this).aBoolean7785 = false;
				}
				int[] is_1092_ = new int[9];
				int i_1093_ = Class220.anIntArray2474[i_1060_];
				int i_1094_ = Class220.anIntArray2483[i_1060_];
				int i_1095_ = Class220.anIntArray2474[i_1061_];
				int i_1096_ = Class220.anIntArray2483[i_1061_];
				int i_1097_ = Class220.anIntArray2474[i_1062_];
				int i_1098_ = Class220.anIntArray2483[i_1062_];
				int i_1099_ = i_1094_ * i_1097_ + 8192 >> 14;
				int i_1100_ = i_1094_ * i_1098_ + 8192 >> 14;
				is_1092_[0] = i_1095_ * i_1097_ + i_1096_ * i_1100_ + 8192 >> 14;
				is_1092_[1] = -i_1095_ * i_1098_ + i_1096_ * i_1099_ + 8192 >> 14;
				is_1092_[2] = i_1096_ * i_1093_ + 8192 >> 14;
				is_1092_[3] = i_1093_ * i_1098_ + 8192 >> 14;
				is_1092_[4] = i_1093_ * i_1097_ + 8192 >> 14;
				is_1092_[5] = -i_1094_;
				is_1092_[6] = -i_1096_ * i_1097_ + i_1095_ * i_1100_ + 8192 >> 14;
				is_1092_[7] = i_1096_ * i_1098_ + i_1095_ * i_1099_ + 8192 >> 14;
				is_1092_[8] = i_1095_ * i_1093_ + 8192 >> 14;
				int i_1101_ = ((is_1092_[0] * -((Class387_Sub1) this).anInt7782 + is_1092_[1] * -((Class387_Sub1) this).anInt7783 + is_1092_[2] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_1102_ = ((is_1092_[3] * -((Class387_Sub1) this).anInt7782 + is_1092_[4] * -((Class387_Sub1) this).anInt7783 + is_1092_[5] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_1103_ = ((is_1092_[6] * -((Class387_Sub1) this).anInt7782 + is_1092_[7] * -((Class387_Sub1) this).anInt7783 + is_1092_[8] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_1104_ = i_1101_ + ((Class387_Sub1) this).anInt7782;
				int i_1105_ = i_1102_ + ((Class387_Sub1) this).anInt7783;
				int i_1106_ = i_1103_ + ((Class387_Sub1) this).anInt7781;
				int[] is_1107_ = new int[9];
				for (int i_1108_ = 0; i_1108_ < 3; i_1108_++) {
					for (int i_1109_ = 0; i_1109_ < 3; i_1109_++) {
						int i_1110_ = 0;
						for (int i_1111_ = 0; i_1111_ < 3; i_1111_++)
							i_1110_ += (is_1092_[i_1108_ * 3 + i_1111_] * is_1064_[i_1109_ * 3 + i_1111_]);
						is_1107_[i_1108_ * 3 + i_1109_] = i_1110_ + 8192 >> 14;
					}
				}
				int i_1112_ = ((is_1092_[0] * i_1086_ + is_1092_[1] * i_1087_ + is_1092_[2] * i_1088_ + 8192) >> 14);
				int i_1113_ = ((is_1092_[3] * i_1086_ + is_1092_[4] * i_1087_ + is_1092_[5] * i_1088_ + 8192) >> 14);
				int i_1114_ = ((is_1092_[6] * i_1086_ + is_1092_[7] * i_1087_ + is_1092_[8] * i_1088_ + 8192) >> 14);
				i_1112_ += i_1104_;
				i_1113_ += i_1105_;
				i_1114_ += i_1106_;
				int[] is_1115_ = new int[9];
				for (int i_1116_ = 0; i_1116_ < 3; i_1116_++) {
					for (int i_1117_ = 0; i_1117_ < 3; i_1117_++) {
						int i_1118_ = 0;
						for (int i_1119_ = 0; i_1119_ < 3; i_1119_++)
							i_1118_ += (is_1064_[i_1116_ * 3 + i_1119_] * is_1107_[i_1117_ + i_1119_ * 3]);
						is_1115_[i_1116_ * 3 + i_1117_] = i_1118_ + 8192 >> 14;
					}
				}
				int i_1120_ = ((is_1064_[0] * i_1112_ + is_1064_[1] * i_1113_ + is_1064_[2] * i_1114_ + 8192) >> 14);
				int i_1121_ = ((is_1064_[3] * i_1112_ + is_1064_[4] * i_1113_ + is_1064_[5] * i_1114_ + 8192) >> 14);
				int i_1122_ = ((is_1064_[6] * i_1112_ + is_1064_[7] * i_1113_ + is_1064_[8] * i_1114_ + 8192) >> 14);
				i_1120_ += i_1083_;
				i_1121_ += i_1084_;
				i_1122_ += i_1085_;
				for (int i_1123_ = 0; i_1123_ < i_1065_; i_1123_++) {
					int i_1124_ = is[i_1123_];
					if (i_1124_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1125_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1124_]);
						for (int i_1126_ = 0; i_1126_ < is_1125_.length; i_1126_++) {
							int i_1127_ = is_1125_[i_1126_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1063_ & (((Class387_Sub1) this).aShortArray7816[i_1127_])) != 0)) {
								int i_1128_ = (is_1115_[0] * (((Class387_Sub1) this).anIntArray7751[i_1127_]) + is_1115_[1] * (((Class387_Sub1) this).anIntArray7752[i_1127_]) + is_1115_[2] * (((Class387_Sub1) this).anIntArray7753[i_1127_]) + 8192) >> 14;
								int i_1129_ = (is_1115_[3] * (((Class387_Sub1) this).anIntArray7751[i_1127_]) + is_1115_[4] * (((Class387_Sub1) this).anIntArray7752[i_1127_]) + is_1115_[5] * (((Class387_Sub1) this).anIntArray7753[i_1127_]) + 8192) >> 14;
								int i_1130_ = (is_1115_[6] * (((Class387_Sub1) this).anIntArray7751[i_1127_]) + is_1115_[7] * (((Class387_Sub1) this).anIntArray7752[i_1127_]) + is_1115_[8] * (((Class387_Sub1) this).anIntArray7753[i_1127_]) + 8192) >> 14;
								i_1128_ += i_1120_;
								i_1129_ += i_1121_;
								i_1130_ += i_1122_;
								((Class387_Sub1) this).anIntArray7751[i_1127_] = i_1128_;
								((Class387_Sub1) this).anIntArray7752[i_1127_] = i_1129_;
								((Class387_Sub1) this).anIntArray7753[i_1127_] = i_1130_;
							}
						}
					}
				}
			} else {
				for (int i_1131_ = 0; i_1131_ < i_1065_; i_1131_++) {
					int i_1132_ = is[i_1131_];
					if (i_1132_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1133_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1132_]);
						for (int i_1134_ = 0; i_1134_ < is_1133_.length; i_1134_++) {
							int i_1135_ = is_1133_[i_1134_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1063_ & (((Class387_Sub1) this).aShortArray7816[i_1135_])) != 0)) {
								((Class387_Sub1) this).anIntArray7751[i_1135_] -= ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1135_] -= ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1135_] -= ((Class387_Sub1) this).anInt7781;
								if (i_1062_ != 0) {
									int i_1136_ = Class220.anIntArray2483[i_1062_];
									int i_1137_ = Class220.anIntArray2474[i_1062_];
									int i_1138_ = ((((Class387_Sub1) this).anIntArray7752[i_1135_]) * i_1136_ + ((((Class387_Sub1) this).anIntArray7751[i_1135_]) * i_1137_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7752[i_1135_] = ((((Class387_Sub1) this).anIntArray7752[i_1135_]) * i_1137_ - ((((Class387_Sub1) this).anIntArray7751[i_1135_]) * i_1136_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7751[i_1135_] = i_1138_;
								}
								if (i_1060_ != 0) {
									int i_1139_ = Class220.anIntArray2483[i_1060_];
									int i_1140_ = Class220.anIntArray2474[i_1060_];
									int i_1141_ = ((((Class387_Sub1) this).anIntArray7752[i_1135_]) * i_1140_ - ((((Class387_Sub1) this).anIntArray7753[i_1135_]) * i_1139_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7753[i_1135_] = ((((Class387_Sub1) this).anIntArray7752[i_1135_]) * i_1139_ + ((((Class387_Sub1) this).anIntArray7753[i_1135_]) * i_1140_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7752[i_1135_] = i_1141_;
								}
								if (i_1061_ != 0) {
									int i_1142_ = Class220.anIntArray2483[i_1061_];
									int i_1143_ = Class220.anIntArray2474[i_1061_];
									int i_1144_ = ((((Class387_Sub1) this).anIntArray7753[i_1135_]) * i_1142_ + ((((Class387_Sub1) this).anIntArray7751[i_1135_]) * i_1143_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7753[i_1135_] = ((((Class387_Sub1) this).anIntArray7753[i_1135_]) * i_1143_ - ((((Class387_Sub1) this).anIntArray7751[i_1135_]) * i_1142_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7751[i_1135_] = i_1144_;
								}
								((Class387_Sub1) this).anIntArray7751[i_1135_] += ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1135_] += ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1135_] += ((Class387_Sub1) this).anInt7781;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_1064_ != null) {
				if (!((Class387_Sub1) this).aBoolean7780) {
					for (int i_1145_ = 0; i_1145_ < ((Class387_Sub1) this).anInt7799; i_1145_++) {
						((Class387_Sub1) this).anIntArray7751[i_1145_] <<= 4;
						((Class387_Sub1) this).anIntArray7752[i_1145_] <<= 4;
						((Class387_Sub1) this).anIntArray7753[i_1145_] <<= 4;
					}
					((Class387_Sub1) this).aBoolean7780 = true;
				}
				int i_1146_ = is_1064_[9] << 4;
				int i_1147_ = is_1064_[10] << 4;
				int i_1148_ = is_1064_[11] << 4;
				int i_1149_ = is_1064_[12] << 4;
				int i_1150_ = is_1064_[13] << 4;
				int i_1151_ = is_1064_[14] << 4;
				if (((Class387_Sub1) this).aBoolean7785) {
					int i_1152_ = ((is_1064_[0] * ((Class387_Sub1) this).anInt7782 + is_1064_[3] * ((Class387_Sub1) this).anInt7783 + is_1064_[6] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1153_ = ((is_1064_[1] * ((Class387_Sub1) this).anInt7782 + is_1064_[4] * ((Class387_Sub1) this).anInt7783 + is_1064_[7] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1154_ = ((is_1064_[2] * ((Class387_Sub1) this).anInt7782 + is_1064_[5] * ((Class387_Sub1) this).anInt7783 + is_1064_[8] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					i_1152_ += i_1149_;
					i_1153_ += i_1150_;
					i_1154_ += i_1151_;
					((Class387_Sub1) this).anInt7782 = i_1152_;
					((Class387_Sub1) this).anInt7783 = i_1153_;
					((Class387_Sub1) this).anInt7781 = i_1154_;
					((Class387_Sub1) this).aBoolean7785 = false;
				}
				int i_1155_ = i_1060_ << 15 >> 7;
				int i_1156_ = i_1061_ << 15 >> 7;
				int i_1157_ = i_1062_ << 15 >> 7;
				int i_1158_ = i_1155_ * -((Class387_Sub1) this).anInt7782 + 8192 >> 14;
				int i_1159_ = i_1156_ * -((Class387_Sub1) this).anInt7783 + 8192 >> 14;
				int i_1160_ = i_1157_ * -((Class387_Sub1) this).anInt7781 + 8192 >> 14;
				int i_1161_ = i_1158_ + ((Class387_Sub1) this).anInt7782;
				int i_1162_ = i_1159_ + ((Class387_Sub1) this).anInt7783;
				int i_1163_ = i_1160_ + ((Class387_Sub1) this).anInt7781;
				int[] is_1164_ = new int[9];
				is_1164_[0] = i_1155_ * is_1064_[0] + 8192 >> 14;
				is_1164_[1] = i_1155_ * is_1064_[3] + 8192 >> 14;
				is_1164_[2] = i_1155_ * is_1064_[6] + 8192 >> 14;
				is_1164_[3] = i_1156_ * is_1064_[1] + 8192 >> 14;
				is_1164_[4] = i_1156_ * is_1064_[4] + 8192 >> 14;
				is_1164_[5] = i_1156_ * is_1064_[7] + 8192 >> 14;
				is_1164_[6] = i_1157_ * is_1064_[2] + 8192 >> 14;
				is_1164_[7] = i_1157_ * is_1064_[5] + 8192 >> 14;
				is_1164_[8] = i_1157_ * is_1064_[8] + 8192 >> 14;
				int i_1165_ = i_1155_ * i_1149_ + 8192 >> 14;
				int i_1166_ = i_1156_ * i_1150_ + 8192 >> 14;
				int i_1167_ = i_1157_ * i_1151_ + 8192 >> 14;
				i_1165_ += i_1161_;
				i_1166_ += i_1162_;
				i_1167_ += i_1163_;
				int[] is_1168_ = new int[9];
				for (int i_1169_ = 0; i_1169_ < 3; i_1169_++) {
					for (int i_1170_ = 0; i_1170_ < 3; i_1170_++) {
						int i_1171_ = 0;
						for (int i_1172_ = 0; i_1172_ < 3; i_1172_++)
							i_1171_ += (is_1064_[i_1169_ * 3 + i_1172_] * is_1164_[i_1170_ + i_1172_ * 3]);
						is_1168_[i_1169_ * 3 + i_1170_] = i_1171_ + 8192 >> 14;
					}
				}
				int i_1173_ = ((is_1064_[0] * i_1165_ + is_1064_[1] * i_1166_ + is_1064_[2] * i_1167_ + 8192) >> 14);
				int i_1174_ = ((is_1064_[3] * i_1165_ + is_1064_[4] * i_1166_ + is_1064_[5] * i_1167_ + 8192) >> 14);
				int i_1175_ = ((is_1064_[6] * i_1165_ + is_1064_[7] * i_1166_ + is_1064_[8] * i_1167_ + 8192) >> 14);
				i_1173_ += i_1146_;
				i_1174_ += i_1147_;
				i_1175_ += i_1148_;
				for (int i_1176_ = 0; i_1176_ < i_1065_; i_1176_++) {
					int i_1177_ = is[i_1176_];
					if (i_1177_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1178_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1177_]);
						for (int i_1179_ = 0; i_1179_ < is_1178_.length; i_1179_++) {
							int i_1180_ = is_1178_[i_1179_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1063_ & (((Class387_Sub1) this).aShortArray7816[i_1180_])) != 0)) {
								int i_1181_ = (is_1168_[0] * (((Class387_Sub1) this).anIntArray7751[i_1180_]) + is_1168_[1] * (((Class387_Sub1) this).anIntArray7752[i_1180_]) + is_1168_[2] * (((Class387_Sub1) this).anIntArray7753[i_1180_]) + 8192) >> 14;
								int i_1182_ = (is_1168_[3] * (((Class387_Sub1) this).anIntArray7751[i_1180_]) + is_1168_[4] * (((Class387_Sub1) this).anIntArray7752[i_1180_]) + is_1168_[5] * (((Class387_Sub1) this).anIntArray7753[i_1180_]) + 8192) >> 14;
								int i_1183_ = (is_1168_[6] * (((Class387_Sub1) this).anIntArray7751[i_1180_]) + is_1168_[7] * (((Class387_Sub1) this).anIntArray7752[i_1180_]) + is_1168_[8] * (((Class387_Sub1) this).anIntArray7753[i_1180_]) + 8192) >> 14;
								i_1181_ += i_1173_;
								i_1182_ += i_1174_;
								i_1183_ += i_1175_;
								((Class387_Sub1) this).anIntArray7751[i_1180_] = i_1181_;
								((Class387_Sub1) this).anIntArray7752[i_1180_] = i_1182_;
								((Class387_Sub1) this).anIntArray7753[i_1180_] = i_1183_;
							}
						}
					}
				}
			} else {
				for (int i_1184_ = 0; i_1184_ < i_1065_; i_1184_++) {
					int i_1185_ = is[i_1184_];
					if (i_1185_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1186_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1185_]);
						for (int i_1187_ = 0; i_1187_ < is_1186_.length; i_1187_++) {
							int i_1188_ = is_1186_[i_1187_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1063_ & (((Class387_Sub1) this).aShortArray7816[i_1188_])) != 0)) {
								((Class387_Sub1) this).anIntArray7751[i_1188_] -= ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1188_] -= ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1188_] -= ((Class387_Sub1) this).anInt7781;
								((Class387_Sub1) this).anIntArray7751[i_1188_] = (((Class387_Sub1) this).anIntArray7751[i_1188_]) * i_1060_ / 128;
								((Class387_Sub1) this).anIntArray7752[i_1188_] = (((Class387_Sub1) this).anIntArray7752[i_1188_]) * i_1061_ / 128;
								((Class387_Sub1) this).anIntArray7753[i_1188_] = (((Class387_Sub1) this).anIntArray7753[i_1188_]) * i_1062_ / 128;
								((Class387_Sub1) this).anIntArray7751[i_1188_] += ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1188_] += ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1188_] += ((Class387_Sub1) this).anInt7781;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null && ((Class387_Sub1) this).aByteArray7773 != null) {
				for (int i_1189_ = 0; i_1189_ < i_1065_; i_1189_++) {
					int i_1190_ = is[i_1189_];
					if (i_1190_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1191_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1190_]);
						for (int i_1192_ = 0; i_1192_ < is_1191_.length; i_1192_++) {
							int i_1193_ = is_1191_[i_1192_];
							if (((Class387_Sub1) this).aShortArray7776 == null || ((i_1063_ & (((Class387_Sub1) this).aShortArray7776[i_1193_])) != 0)) {
								int i_1194_ = (((((Class387_Sub1) this).aByteArray7773[i_1193_]) & 0xff) + i_1060_ * 8);
								if (i_1194_ < 0)
									i_1194_ = 0;
								else if (i_1194_ > 255)
									i_1194_ = 255;
								((Class387_Sub1) this).aByteArray7773[i_1193_] = (byte) i_1194_;
							}
						}
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1195_ = 0; i_1195_ < ((Class387_Sub1) this).anInt7788; i_1195_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1195_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1195_]);
						((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | 255 - ((((Class387_Sub1) this).aByteArray7773[(((Class16) class16).anInt226 * -1295149283)]) & 0xff) << 24) * -564629049;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null) {
				for (int i_1196_ = 0; i_1196_ < i_1065_; i_1196_++) {
					int i_1197_ = is[i_1196_];
					if (i_1197_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1198_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1197_]);
						for (int i_1199_ = 0; i_1199_ < is_1198_.length; i_1199_++) {
							int i_1200_ = is_1198_[i_1199_];
							if (((Class387_Sub1) this).aShortArray7776 == null || ((i_1063_ & (((Class387_Sub1) this).aShortArray7776[i_1200_])) != 0)) {
								int i_1201_ = ((((Class387_Sub1) this).aShortArray7775[i_1200_]) & 0xffff);
								int i_1202_ = i_1201_ >> 10 & 0x3f;
								int i_1203_ = i_1201_ >> 7 & 0x7;
								int i_1204_ = i_1201_ & 0x7f;
								i_1202_ = i_1202_ + i_1060_ & 0x3f;
								i_1203_ += i_1061_;
								if (i_1203_ < 0)
									i_1203_ = 0;
								else if (i_1203_ > 7)
									i_1203_ = 7;
								i_1204_ += i_1062_;
								if (i_1204_ < 0)
									i_1204_ = 0;
								else if (i_1204_ > 127)
									i_1204_ = 127;
								((Class387_Sub1) this).aShortArray7775[i_1200_] = (short) (i_1202_ << 10 | i_1203_ << 7 | i_1204_);
							}
						}
						((Class387_Sub1) this).aBoolean7733 = true;
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1205_ = 0; i_1205_ < ((Class387_Sub1) this).anInt7788; i_1205_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1205_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1205_]);
						((Class18) class18).anInt254 = (((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | (Class379.anIntArray4096[(Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0)) & 0xffff]) & 0xffffff) * -564629049);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1206_ = 0; i_1206_ < i_1065_; i_1206_++) {
					int i_1207_ = is[i_1206_];
					if (i_1207_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1208_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1207_]);
						for (int i_1209_ = 0; i_1209_ < is_1208_.length; i_1209_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1208_[i_1209_]]);
							((Class18) class18).anInt247 += i_1060_ * 1747422061;
							((Class18) class18).anInt244 += i_1061_ * 1370325433;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1210_ = 0; i_1210_ < i_1065_; i_1210_++) {
					int i_1211_ = is[i_1210_];
					if (i_1211_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1212_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1211_]);
						for (int i_1213_ = 0; i_1213_ < is_1212_.length; i_1213_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1212_[i_1213_]]);
							((Class18) class18).aFloat245 = (((Class18) class18).aFloat245 * (float) i_1060_ / 128.0F);
							((Class18) class18).aFloat248 = (((Class18) class18).aFloat248 * (float) i_1061_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1214_ = 0; i_1214_ < i_1065_; i_1214_++) {
					int i_1215_ = is[i_1214_];
					if (i_1215_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1216_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1215_]);
						for (int i_1217_ = 0; i_1217_ < is_1216_.length; i_1217_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1216_[i_1217_]]);
							((Class18) class18).anInt249 = ((((Class18) class18).anInt249 * -988477815 + i_1060_) & 0x3fff) * -839233607;
						}
					}
				}
			}
		}
	}

	public boolean ev() {
		return ((Class387_Sub1) this).aBoolean7756;
	}

	void method4757() {
		if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
			synchronized (this) {
				while (aBoolean4148) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean4148 = true;
			}
		}
	}

	public int m() {
		return ((Class387_Sub1) this).anInt7746;
	}

	public void bb(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x3) != 3)
			throw new IllegalStateException();
		int i_1218_ = Class220.anIntArray2483[i];
		int i_1219_ = Class220.anIntArray2474[i];
		synchronized (this) {
			for (int i_1220_ = 0; i_1220_ < ((Class387_Sub1) this).anInt7799; i_1220_++) {
				int i_1221_ = (((Class387_Sub1) this).anIntArray7752[i_1220_] * i_1218_ + (((Class387_Sub1) this).anIntArray7751[i_1220_] * i_1219_)) >> 14;
				((Class387_Sub1) this).anIntArray7752[i_1220_] = (((Class387_Sub1) this).anIntArray7752[i_1220_] * i_1219_ - (((Class387_Sub1) this).anIntArray7751[i_1220_] * i_1218_)) >> 14;
				((Class387_Sub1) this).anIntArray7751[i_1220_] = i_1221_;
			}
			method4800();
		}
	}

	public void bl(int i, int i_1222_, int i_1223_) {
		if (i != 0 && (((Class387_Sub1) this).anInt7746 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1222_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1223_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1224_ = 0; i_1224_ < ((Class387_Sub1) this).anInt7799; i_1224_++) {
				((Class387_Sub1) this).anIntArray7751[i_1224_] += i;
				((Class387_Sub1) this).anIntArray7752[i_1224_] += i_1222_;
				((Class387_Sub1) this).anIntArray7753[i_1224_] += i_1223_;
			}
		}
	}

	static {
		anInt7787 = 4096;
		anInt7805 = 0;
	}

	public void bw(int i, int i_1225_, int i_1226_) {
		if (i != 0 && (((Class387_Sub1) this).anInt7746 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1225_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1226_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1227_ = 0; i_1227_ < ((Class387_Sub1) this).anInt7799; i_1227_++) {
				((Class387_Sub1) this).anIntArray7751[i_1227_] += i;
				((Class387_Sub1) this).anIntArray7752[i_1227_] += i_1225_;
				((Class387_Sub1) this).anIntArray7753[i_1227_] += i_1226_;
			}
		}
	}

	public void bk(int i, int i_1228_, int i_1229_) {
		if (i != 0 && (((Class387_Sub1) this).anInt7746 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1228_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1229_ != 0 && (((Class387_Sub1) this).anInt7746 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1230_ = 0; i_1230_ < ((Class387_Sub1) this).anInt7799; i_1230_++) {
				((Class387_Sub1) this).anIntArray7751[i_1230_] += i;
				((Class387_Sub1) this).anIntArray7752[i_1230_] += i_1228_;
				((Class387_Sub1) this).anIntArray7753[i_1230_] += i_1229_;
			}
		}
	}

	public void bq(int i, int i_1231_, int i_1232_) {
		if (i != 128 && (((Class387_Sub1) this).anInt7746 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1231_ != 128 && (((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1232_ != 128 && (((Class387_Sub1) this).anInt7746 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1233_ = 0; i_1233_ < ((Class387_Sub1) this).anInt7799; i_1233_++) {
				((Class387_Sub1) this).anIntArray7751[i_1233_] = ((Class387_Sub1) this).anIntArray7751[i_1233_] * i >> 7;
				((Class387_Sub1) this).anIntArray7752[i_1233_] = (((Class387_Sub1) this).anIntArray7752[i_1233_] * i_1231_ >> 7);
				((Class387_Sub1) this).anIntArray7753[i_1233_] = (((Class387_Sub1) this).anIntArray7753[i_1233_] * i_1232_ >> 7);
			}
			((Class387_Sub1) this).aBoolean7792 = false;
		}
	}

	public void bs(int i, int i_1234_, Class_xa class_xa, Class_xa class_xa_1235_, int i_1236_, int i_1237_, int i_1238_) {
		if (i == 3) {
			if ((((Class387_Sub1) this).anInt7746 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		int i_1239_ = i_1236_ + ((Class387_Sub1) this).aShort7797;
		int i_1240_ = i_1236_ + ((Class387_Sub1) this).aShort7743;
		int i_1241_ = i_1238_ + ((Class387_Sub1) this).aShort7795;
		int i_1242_ = i_1238_ + ((Class387_Sub1) this).aShort7800;
		if (i == 4 || (i_1239_ >= 0 && ((i_1240_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_1241_ >= 0 && ((i_1242_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			int[][] is = class_xa.anIntArrayArray6290;
			int[][] is_1243_ = null;
			if (class_xa_1235_ != null)
				is_1243_ = class_xa_1235_.anIntArrayArray6290;
			if (i == 4 || i == 5) {
				if (class_xa_1235_ == null || (i_1239_ < 0 || ((i_1240_ + class_xa_1235_.anInt6288 * -1212653763 >> class_xa_1235_.anInt6289 * -2137349879) >= class_xa_1235_.anInt6287 * -506105871) || i_1241_ < 0 || ((i_1242_ + class_xa_1235_.anInt6288 * -1212653763 >> class_xa_1235_.anInt6289 * -2137349879) >= class_xa_1235_.anInt6286 * -1148794921)))
					return;
			} else {
				i_1239_ >>= class_xa.anInt6289 * -2137349879;
				i_1240_ = (i_1240_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_1241_ >>= class_xa.anInt6289 * -2137349879;
				i_1242_ = (i_1242_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (is[i_1239_][i_1241_] == i_1237_ && is[i_1240_][i_1241_] == i_1237_ && is[i_1239_][i_1242_] == i_1237_ && is[i_1240_][i_1242_] == i_1237_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1244_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_1245_ = 0; i_1245_ < ((Class387_Sub1) this).anInt7742; i_1245_++) {
						int i_1246_ = (((Class387_Sub1) this).anIntArray7751[i_1245_] + i_1236_);
						int i_1247_ = (((Class387_Sub1) this).anIntArray7753[i_1245_] + i_1238_);
						int i_1248_ = i_1246_ & i_1244_;
						int i_1249_ = i_1247_ & i_1244_;
						int i_1250_ = i_1246_ >> class_xa.anInt6289 * -2137349879;
						int i_1251_ = i_1247_ >> class_xa.anInt6289 * -2137349879;
						int i_1252_ = (((is[i_1250_][i_1251_] * (class_xa.anInt6288 * -1212653763 - i_1248_)) + is[i_1250_ + 1][i_1251_] * i_1248_) >> class_xa.anInt6289 * -2137349879);
						int i_1253_ = (((is[i_1250_][i_1251_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1248_)) + is[i_1250_ + 1][i_1251_ + 1] * i_1248_) >> class_xa.anInt6289 * -2137349879);
						int i_1254_ = (i_1252_ * (class_xa.anInt6288 * -1212653763 - i_1249_) + i_1253_ * i_1249_ >> class_xa.anInt6289 * -2137349879);
						((Class387_Sub1) this).anIntArray7752[i_1245_] = (((Class387_Sub1) this).anIntArray7752[i_1245_] + i_1254_ - i_1237_);
					}
					for (int i_1255_ = ((Class387_Sub1) this).anInt7742; i_1255_ < ((Class387_Sub1) this).anInt7799; i_1255_++) {
						int i_1256_ = (((Class387_Sub1) this).anIntArray7751[i_1255_] + i_1236_);
						int i_1257_ = (((Class387_Sub1) this).anIntArray7753[i_1255_] + i_1238_);
						int i_1258_ = i_1256_ & i_1244_;
						int i_1259_ = i_1257_ & i_1244_;
						int i_1260_ = i_1256_ >> class_xa.anInt6289 * -2137349879;
						int i_1261_ = i_1257_ >> class_xa.anInt6289 * -2137349879;
						if (i_1260_ >= 0 && i_1260_ < is.length - 1 && i_1261_ >= 0 && i_1261_ < is[0].length - 1) {
							int i_1262_ = (((is[i_1260_][i_1261_] * (class_xa.anInt6288 * -1212653763 - i_1258_)) + is[i_1260_ + 1][i_1261_] * i_1258_) >> class_xa.anInt6289 * -2137349879);
							int i_1263_ = (((is[i_1260_][i_1261_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1258_)) + is[i_1260_ + 1][i_1261_ + 1] * i_1258_) >> class_xa.anInt6289 * -2137349879);
							int i_1264_ = (i_1262_ * (class_xa.anInt6288 * -1212653763 - i_1259_) + i_1263_ * i_1259_ >> class_xa.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_1255_] = (((Class387_Sub1) this).anIntArray7752[i_1255_]) + i_1264_ - i_1237_;
						}
					}
				} else if (i == 2) {
					int i_1265_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_1266_ = 0; i_1266_ < ((Class387_Sub1) this).anInt7742; i_1266_++) {
						int i_1267_ = ((((Class387_Sub1) this).anIntArray7752[i_1266_] << 16) / ((Class387_Sub1) this).aShort7770);
						if (i_1267_ < i_1234_) {
							int i_1268_ = ((((Class387_Sub1) this).anIntArray7751[i_1266_]) + i_1236_);
							int i_1269_ = ((((Class387_Sub1) this).anIntArray7753[i_1266_]) + i_1238_);
							int i_1270_ = i_1268_ & i_1265_;
							int i_1271_ = i_1269_ & i_1265_;
							int i_1272_ = i_1268_ >> class_xa.anInt6289 * -2137349879;
							int i_1273_ = i_1269_ >> class_xa.anInt6289 * -2137349879;
							int i_1274_ = (((is[i_1272_][i_1273_] * (class_xa.anInt6288 * -1212653763 - i_1270_)) + is[i_1272_ + 1][i_1273_] * i_1270_) >> class_xa.anInt6289 * -2137349879);
							int i_1275_ = (((is[i_1272_][i_1273_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1270_)) + is[i_1272_ + 1][i_1273_ + 1] * i_1270_) >> class_xa.anInt6289 * -2137349879);
							int i_1276_ = (i_1274_ * (class_xa.anInt6288 * -1212653763 - i_1271_) + i_1275_ * i_1271_ >> class_xa.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_1266_] = ((((Class387_Sub1) this).anIntArray7752[i_1266_]) + ((i_1276_ - i_1237_) * (i_1234_ - i_1267_) / i_1234_));
						} else
							((Class387_Sub1) this).anIntArray7752[i_1266_] = (((Class387_Sub1) this).anIntArray7752[i_1266_]);
					}
					for (int i_1277_ = ((Class387_Sub1) this).anInt7742; i_1277_ < ((Class387_Sub1) this).anInt7799; i_1277_++) {
						int i_1278_ = ((((Class387_Sub1) this).anIntArray7752[i_1277_] << 16) / ((Class387_Sub1) this).aShort7770);
						if (i_1278_ < i_1234_) {
							int i_1279_ = ((((Class387_Sub1) this).anIntArray7751[i_1277_]) + i_1236_);
							int i_1280_ = ((((Class387_Sub1) this).anIntArray7753[i_1277_]) + i_1238_);
							int i_1281_ = i_1279_ & i_1265_;
							int i_1282_ = i_1280_ & i_1265_;
							int i_1283_ = i_1279_ >> class_xa.anInt6289 * -2137349879;
							int i_1284_ = i_1280_ >> class_xa.anInt6289 * -2137349879;
							if (i_1283_ >= 0 && (i_1283_ < class_xa.anInt6287 * -506105871 - 1) && i_1284_ >= 0 && (i_1284_ < class_xa.anInt6286 * -1148794921 - 1)) {
								int i_1285_ = (((is[i_1283_][i_1284_] * (class_xa.anInt6288 * -1212653763 - i_1281_)) + is[i_1283_ + 1][i_1284_] * i_1281_) >> class_xa.anInt6289 * -2137349879);
								int i_1286_ = (((is[i_1283_][i_1284_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1281_)) + (is[i_1283_ + 1][i_1284_ + 1] * i_1281_)) >> class_xa.anInt6289 * -2137349879);
								int i_1287_ = ((i_1285_ * (class_xa.anInt6288 * -1212653763 - i_1282_)) + i_1286_ * i_1282_ >> class_xa.anInt6289 * -2137349879);
								((Class387_Sub1) this).anIntArray7752[i_1277_] = ((((Class387_Sub1) this).anIntArray7752[i_1277_]) + ((i_1287_ - i_1237_) * (i_1234_ - i_1278_) / i_1234_));
							}
						} else
							((Class387_Sub1) this).anIntArray7752[i_1277_] = (((Class387_Sub1) this).anIntArray7752[i_1277_]);
					}
				} else if (i == 3) {
					int i_1288_ = (i_1234_ & 0xff) * 4;
					int i_1289_ = (i_1234_ >> 8 & 0xff) * 4;
					int i_1290_ = (i_1234_ >> 16 & 0xff) << 6;
					int i_1291_ = (i_1234_ >> 24 & 0xff) << 6;
					if (i_1236_ - (i_1288_ >> 1) < 0 || ((i_1236_ + (i_1288_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_1238_ - (i_1289_ >> 1) < 0 || ((i_1238_ + (i_1289_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
						return;
					method4732(class_xa, i_1236_, i_1237_, i_1238_, i_1288_, i_1289_, i_1290_, i_1291_);
				} else if (i == 4) {
					int i_1292_ = class_xa_1235_.anInt6288 * -1212653763 - 1;
					int i_1293_ = (((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770);
					for (int i_1294_ = 0; i_1294_ < ((Class387_Sub1) this).anInt7742; i_1294_++) {
						int i_1295_ = (((Class387_Sub1) this).anIntArray7751[i_1294_] + i_1236_);
						int i_1296_ = (((Class387_Sub1) this).anIntArray7753[i_1294_] + i_1238_);
						int i_1297_ = i_1295_ & i_1292_;
						int i_1298_ = i_1296_ & i_1292_;
						int i_1299_ = (i_1295_ >> class_xa_1235_.anInt6289 * -2137349879);
						int i_1300_ = (i_1296_ >> class_xa_1235_.anInt6289 * -2137349879);
						int i_1301_ = (((is_1243_[i_1299_][i_1300_] * (class_xa_1235_.anInt6288 * -1212653763 - i_1297_)) + is_1243_[i_1299_ + 1][i_1300_] * i_1297_) >> class_xa_1235_.anInt6289 * -2137349879);
						int i_1302_ = (((is_1243_[i_1299_][i_1300_ + 1] * (class_xa_1235_.anInt6288 * -1212653763 - i_1297_)) + is_1243_[i_1299_ + 1][i_1300_ + 1] * i_1297_) >> class_xa_1235_.anInt6289 * -2137349879);
						int i_1303_ = ((i_1301_ * (class_xa_1235_.anInt6288 * -1212653763 - i_1298_)) + i_1302_ * i_1298_ >> class_xa_1235_.anInt6289 * -2137349879);
						((Class387_Sub1) this).anIntArray7752[i_1294_] = (((Class387_Sub1) this).anIntArray7752[i_1294_] + (i_1303_ - i_1237_) + i_1293_);
					}
					for (int i_1304_ = ((Class387_Sub1) this).anInt7742; i_1304_ < ((Class387_Sub1) this).anInt7799; i_1304_++) {
						int i_1305_ = (((Class387_Sub1) this).anIntArray7751[i_1304_] + i_1236_);
						int i_1306_ = (((Class387_Sub1) this).anIntArray7753[i_1304_] + i_1238_);
						int i_1307_ = i_1305_ & i_1292_;
						int i_1308_ = i_1306_ & i_1292_;
						int i_1309_ = (i_1305_ >> class_xa_1235_.anInt6289 * -2137349879);
						int i_1310_ = (i_1306_ >> class_xa_1235_.anInt6289 * -2137349879);
						if (i_1309_ >= 0 && (i_1309_ < class_xa_1235_.anInt6287 * -506105871 - 1) && i_1310_ >= 0 && i_1310_ < (class_xa_1235_.anInt6286 * -1148794921) - 1) {
							int i_1311_ = (((is_1243_[i_1309_][i_1310_] * (class_xa_1235_.anInt6288 * -1212653763 - i_1307_)) + is_1243_[i_1309_ + 1][i_1310_] * i_1307_) >> class_xa_1235_.anInt6289 * -2137349879);
							int i_1312_ = (((is_1243_[i_1309_][i_1310_ + 1] * (class_xa_1235_.anInt6288 * -1212653763 - i_1307_)) + (is_1243_[i_1309_ + 1][i_1310_ + 1] * i_1307_)) >> class_xa_1235_.anInt6289 * -2137349879);
							int i_1313_ = ((i_1311_ * (class_xa_1235_.anInt6288 * -1212653763 - i_1308_)) + i_1312_ * i_1308_ >> class_xa_1235_.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_1304_] = (((Class387_Sub1) this).anIntArray7752[i_1304_]) + (i_1313_ - i_1237_) + i_1293_;
						}
					}
				} else if (i == 5) {
					int i_1314_ = class_xa_1235_.anInt6288 * -1212653763 - 1;
					int i_1315_ = (((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770);
					for (int i_1316_ = 0; i_1316_ < ((Class387_Sub1) this).anInt7742; i_1316_++) {
						int i_1317_ = (((Class387_Sub1) this).anIntArray7751[i_1316_] + i_1236_);
						int i_1318_ = (((Class387_Sub1) this).anIntArray7753[i_1316_] + i_1238_);
						int i_1319_ = i_1317_ & i_1314_;
						int i_1320_ = i_1318_ & i_1314_;
						int i_1321_ = i_1317_ >> class_xa.anInt6289 * -2137349879;
						int i_1322_ = i_1318_ >> class_xa.anInt6289 * -2137349879;
						int i_1323_ = (((is[i_1321_][i_1322_] * (class_xa.anInt6288 * -1212653763 - i_1319_)) + is[i_1321_ + 1][i_1322_] * i_1319_) >> class_xa.anInt6289 * -2137349879);
						int i_1324_ = (((is[i_1321_][i_1322_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1319_)) + is[i_1321_ + 1][i_1322_ + 1] * i_1319_) >> class_xa.anInt6289 * -2137349879);
						int i_1325_ = (i_1323_ * (class_xa.anInt6288 * -1212653763 - i_1320_) + i_1324_ * i_1320_ >> class_xa.anInt6289 * -2137349879);
						i_1323_ = (((is_1243_[i_1321_][i_1322_] * (class_xa_1235_.anInt6288 * -1212653763 - i_1319_)) + is_1243_[i_1321_ + 1][i_1322_] * i_1319_) >> class_xa_1235_.anInt6289 * -2137349879);
						i_1324_ = (((is_1243_[i_1321_][i_1322_ + 1] * (class_xa_1235_.anInt6288 * -1212653763 - i_1319_)) + is_1243_[i_1321_ + 1][i_1322_ + 1] * i_1319_) >> class_xa_1235_.anInt6289 * -2137349879);
						int i_1326_ = ((i_1323_ * (class_xa_1235_.anInt6288 * -1212653763 - i_1320_)) + i_1324_ * i_1320_ >> class_xa_1235_.anInt6289 * -2137349879);
						int i_1327_ = i_1325_ - i_1326_ - i_1234_;
						((Class387_Sub1) this).anIntArray7752[i_1316_] = ((((Class387_Sub1) this).anIntArray7752[i_1316_] << 8) / i_1315_ * i_1327_ >> 8) - (i_1237_ - i_1325_);
					}
					for (int i_1328_ = ((Class387_Sub1) this).anInt7742; i_1328_ < ((Class387_Sub1) this).anInt7799; i_1328_++) {
						int i_1329_ = (((Class387_Sub1) this).anIntArray7751[i_1328_] + i_1236_);
						int i_1330_ = (((Class387_Sub1) this).anIntArray7753[i_1328_] + i_1238_);
						int i_1331_ = i_1329_ & i_1314_;
						int i_1332_ = i_1330_ & i_1314_;
						int i_1333_ = i_1329_ >> class_xa.anInt6289 * -2137349879;
						int i_1334_ = i_1330_ >> class_xa.anInt6289 * -2137349879;
						if (i_1333_ >= 0 && i_1333_ < class_xa.anInt6287 * -506105871 - 1 && (i_1333_ < class_xa_1235_.anInt6287 * -506105871 - 1) && i_1334_ >= 0 && i_1334_ < class_xa.anInt6286 * -1148794921 - 1 && i_1334_ < (class_xa_1235_.anInt6286 * -1148794921) - 1) {
							int i_1335_ = (((is[i_1333_][i_1334_] * (class_xa.anInt6288 * -1212653763 - i_1331_)) + is[i_1333_ + 1][i_1334_] * i_1331_) >> class_xa.anInt6289 * -2137349879);
							int i_1336_ = (((is[i_1333_][i_1334_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1331_)) + is[i_1333_ + 1][i_1334_ + 1] * i_1331_) >> class_xa.anInt6289 * -2137349879);
							int i_1337_ = (i_1335_ * (class_xa.anInt6288 * -1212653763 - i_1332_) + i_1336_ * i_1332_ >> class_xa.anInt6289 * -2137349879);
							i_1335_ = (((is_1243_[i_1333_][i_1334_] * (class_xa_1235_.anInt6288 * -1212653763 - i_1331_)) + is_1243_[i_1333_ + 1][i_1334_] * i_1331_) >> class_xa_1235_.anInt6289 * -2137349879);
							i_1336_ = (((is_1243_[i_1333_][i_1334_ + 1] * (class_xa_1235_.anInt6288 * -1212653763 - i_1331_)) + (is_1243_[i_1333_ + 1][i_1334_ + 1] * i_1331_)) >> class_xa_1235_.anInt6289 * -2137349879);
							int i_1338_ = ((i_1335_ * (class_xa_1235_.anInt6288 * -1212653763 - i_1332_)) + i_1336_ * i_1332_ >> class_xa_1235_.anInt6289 * -2137349879);
							int i_1339_ = i_1337_ - i_1338_ - i_1234_;
							((Class387_Sub1) this).anIntArray7752[i_1328_] = (((((Class387_Sub1) this).anIntArray7752[i_1328_]) << 8) / i_1315_ * i_1339_ >> 8) - (i_1237_ - i_1337_);
						}
					}
				}
				((Class387_Sub1) this).aBoolean7792 = false;
			}
		}
	}

	public int cp() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7743;
	}

	void method4756() {
		if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
			synchronized (this) {
				while (aBoolean4148) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean4148 = true;
			}
		}
	}

	void method4758() {
		if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
			synchronized (this) {
				aBoolean4148 = false;
				this.notifyAll();
			}
		}
	}

	boolean bt() {
		if (((Class387_Sub1) this).anIntArrayArray7778 == null)
			return false;
		((Class387_Sub1) this).anInt7782 = 0;
		((Class387_Sub1) this).anInt7783 = 0;
		((Class387_Sub1) this).anInt7781 = 0;
		return true;
	}

	boolean bj() {
		if (((Class387_Sub1) this).anIntArrayArray7778 == null)
			return false;
		((Class387_Sub1) this).anInt7782 = 0;
		((Class387_Sub1) this).anInt7783 = 0;
		((Class387_Sub1) this).anInt7781 = 0;
		return true;
	}

	void br() {
		if (((Class387_Sub1) this).aBoolean7780) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++) {
				((Class387_Sub1) this).anIntArray7751[i] = ((Class387_Sub1) this).anIntArray7751[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7752[i] = ((Class387_Sub1) this).anIntArray7752[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7753[i] = ((Class387_Sub1) this).anIntArray7753[i] + 7 >> 4;
			}
			((Class387_Sub1) this).aBoolean7780 = false;
		}
		if (((Class387_Sub1) this).aBoolean7733) {
			method4792();
			((Class387_Sub1) this).aBoolean7733 = false;
		}
		((Class387_Sub1) this).aBoolean7792 = false;
	}

	void bz() {
		if (((Class387_Sub1) this).aBoolean7780) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++) {
				((Class387_Sub1) this).anIntArray7751[i] = ((Class387_Sub1) this).anIntArray7751[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7752[i] = ((Class387_Sub1) this).anIntArray7752[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7753[i] = ((Class387_Sub1) this).anIntArray7753[i] + 7 >> 4;
			}
			((Class387_Sub1) this).aBoolean7780 = false;
		}
		if (((Class387_Sub1) this).aBoolean7733) {
			method4792();
			((Class387_Sub1) this).aBoolean7733 = false;
		}
		((Class387_Sub1) this).aBoolean7792 = false;
	}

	void cm() {
		if (((Class387_Sub1) this).aBoolean7780) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++) {
				((Class387_Sub1) this).anIntArray7751[i] = ((Class387_Sub1) this).anIntArray7751[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7752[i] = ((Class387_Sub1) this).anIntArray7752[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7753[i] = ((Class387_Sub1) this).anIntArray7753[i] + 7 >> 4;
			}
			((Class387_Sub1) this).aBoolean7780 = false;
		}
		if (((Class387_Sub1) this).aBoolean7733) {
			method4792();
			((Class387_Sub1) this).aBoolean7733 = false;
		}
		((Class387_Sub1) this).aBoolean7792 = false;
	}

	void cd() {
		if (((Class387_Sub1) this).aBoolean7780) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++) {
				((Class387_Sub1) this).anIntArray7751[i] = ((Class387_Sub1) this).anIntArray7751[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7752[i] = ((Class387_Sub1) this).anIntArray7752[i] + 7 >> 4;
				((Class387_Sub1) this).anIntArray7753[i] = ((Class387_Sub1) this).anIntArray7753[i] + 7 >> 4;
			}
			((Class387_Sub1) this).aBoolean7780 = false;
		}
		if (((Class387_Sub1) this).aBoolean7733) {
			method4792();
			((Class387_Sub1) this).aBoolean7733 = false;
		}
		((Class387_Sub1) this).aBoolean7792 = false;
	}

	public void Q(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x2000) != 8192)
			throw new IllegalStateException();
		((Class387_Sub1) this).anInt7748 = i;
		((Class387_Sub1) this).anInt7812 = 0;
	}

	void method4761(int i, int[] is, int i_1340_, int i_1341_, int i_1342_, int i_1343_, boolean bool) {
		int i_1344_ = is.length;
		if (i == 0) {
			i_1340_ <<= 4;
			i_1341_ <<= 4;
			i_1342_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1345_ = 0; i_1345_ < ((Class387_Sub1) this).anInt7799; i_1345_++) {
					((Class387_Sub1) this).anIntArray7751[i_1345_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1345_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1345_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			int i_1346_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_1347_ = 0; i_1347_ < i_1344_; i_1347_++) {
				int i_1348_ = is[i_1347_];
				if (i_1348_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1349_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1348_];
					for (int i_1350_ = 0; i_1350_ < is_1349_.length; i_1350_++) {
						int i_1351_ = is_1349_[i_1350_];
						((Class387_Sub1) this).anInt7782 += ((Class387_Sub1) this).anIntArray7751[i_1351_];
						((Class387_Sub1) this).anInt7783 += ((Class387_Sub1) this).anIntArray7752[i_1351_];
						((Class387_Sub1) this).anInt7781 += ((Class387_Sub1) this).anIntArray7753[i_1351_];
						i_1346_++;
					}
				}
			}
			if (i_1346_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_1346_ + i_1340_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_1346_ + i_1341_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_1346_ + i_1342_;
			} else {
				((Class387_Sub1) this).anInt7782 = i_1340_;
				((Class387_Sub1) this).anInt7783 = i_1341_;
				((Class387_Sub1) this).anInt7781 = i_1342_;
			}
		} else if (i == 1) {
			i_1340_ <<= 4;
			i_1341_ <<= 4;
			i_1342_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1352_ = 0; i_1352_ < ((Class387_Sub1) this).anInt7799; i_1352_++) {
					((Class387_Sub1) this).anIntArray7751[i_1352_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1352_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1352_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			for (int i_1353_ = 0; i_1353_ < i_1344_; i_1353_++) {
				int i_1354_ = is[i_1353_];
				if (i_1354_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1355_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1354_];
					for (int i_1356_ = 0; i_1356_ < is_1355_.length; i_1356_++) {
						int i_1357_ = is_1355_[i_1356_];
						((Class387_Sub1) this).anIntArray7751[i_1357_] += i_1340_;
						((Class387_Sub1) this).anIntArray7752[i_1357_] += i_1341_;
						((Class387_Sub1) this).anIntArray7753[i_1357_] += i_1342_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1358_ = 0; i_1358_ < i_1344_; i_1358_++) {
				int i_1359_ = is[i_1358_];
				if (i_1359_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1360_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1359_];
					if ((i_1343_ & 0x1) == 0) {
						for (int i_1361_ = 0; i_1361_ < is_1360_.length; i_1361_++) {
							int i_1362_ = is_1360_[i_1361_];
							((Class387_Sub1) this).anIntArray7751[i_1362_] -= ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_1362_] -= ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_1362_] -= ((Class387_Sub1) this).anInt7781;
							if (i_1342_ != 0) {
								int i_1363_ = Class220.anIntArray2483[i_1342_];
								int i_1364_ = Class220.anIntArray2474[i_1342_];
								int i_1365_ = (((((Class387_Sub1) this).anIntArray7752[i_1362_]) * i_1363_ + (((Class387_Sub1) this).anIntArray7751[i_1362_]) * i_1364_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7752[i_1362_] = ((((Class387_Sub1) this).anIntArray7752[i_1362_]) * i_1364_ - (((Class387_Sub1) this).anIntArray7751[i_1362_]) * i_1363_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_1362_] = i_1365_;
							}
							if (i_1340_ != 0) {
								int i_1366_ = Class220.anIntArray2483[i_1340_];
								int i_1367_ = Class220.anIntArray2474[i_1340_];
								int i_1368_ = (((((Class387_Sub1) this).anIntArray7752[i_1362_]) * i_1367_ - (((Class387_Sub1) this).anIntArray7753[i_1362_]) * i_1366_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_1362_] = ((((Class387_Sub1) this).anIntArray7752[i_1362_]) * i_1366_ + (((Class387_Sub1) this).anIntArray7753[i_1362_]) * i_1367_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7752[i_1362_] = i_1368_;
							}
							if (i_1341_ != 0) {
								int i_1369_ = Class220.anIntArray2483[i_1341_];
								int i_1370_ = Class220.anIntArray2474[i_1341_];
								int i_1371_ = (((((Class387_Sub1) this).anIntArray7753[i_1362_]) * i_1369_ + (((Class387_Sub1) this).anIntArray7751[i_1362_]) * i_1370_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_1362_] = ((((Class387_Sub1) this).anIntArray7753[i_1362_]) * i_1370_ - (((Class387_Sub1) this).anIntArray7751[i_1362_]) * i_1369_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_1362_] = i_1371_;
							}
							((Class387_Sub1) this).anIntArray7751[i_1362_] += ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_1362_] += ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_1362_] += ((Class387_Sub1) this).anInt7781;
						}
					} else {
						for (int i_1372_ = 0; i_1372_ < is_1360_.length; i_1372_++) {
							int i_1373_ = is_1360_[i_1372_];
							((Class387_Sub1) this).anIntArray7751[i_1373_] -= ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_1373_] -= ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_1373_] -= ((Class387_Sub1) this).anInt7781;
							if (i_1340_ != 0) {
								int i_1374_ = Class220.anIntArray2483[i_1340_];
								int i_1375_ = Class220.anIntArray2474[i_1340_];
								int i_1376_ = (((((Class387_Sub1) this).anIntArray7752[i_1373_]) * i_1375_ - (((Class387_Sub1) this).anIntArray7753[i_1373_]) * i_1374_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_1373_] = ((((Class387_Sub1) this).anIntArray7752[i_1373_]) * i_1374_ + (((Class387_Sub1) this).anIntArray7753[i_1373_]) * i_1375_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7752[i_1373_] = i_1376_;
							}
							if (i_1342_ != 0) {
								int i_1377_ = Class220.anIntArray2483[i_1342_];
								int i_1378_ = Class220.anIntArray2474[i_1342_];
								int i_1379_ = (((((Class387_Sub1) this).anIntArray7752[i_1373_]) * i_1377_ + (((Class387_Sub1) this).anIntArray7751[i_1373_]) * i_1378_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7752[i_1373_] = ((((Class387_Sub1) this).anIntArray7752[i_1373_]) * i_1378_ - (((Class387_Sub1) this).anIntArray7751[i_1373_]) * i_1377_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_1373_] = i_1379_;
							}
							if (i_1341_ != 0) {
								int i_1380_ = Class220.anIntArray2483[i_1341_];
								int i_1381_ = Class220.anIntArray2474[i_1341_];
								int i_1382_ = (((((Class387_Sub1) this).anIntArray7753[i_1373_]) * i_1380_ + (((Class387_Sub1) this).anIntArray7751[i_1373_]) * i_1381_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_1373_] = ((((Class387_Sub1) this).anIntArray7753[i_1373_]) * i_1381_ - (((Class387_Sub1) this).anIntArray7751[i_1373_]) * i_1380_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_1373_] = i_1382_;
							}
							((Class387_Sub1) this).anIntArray7751[i_1373_] += ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_1373_] += ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_1373_] += ((Class387_Sub1) this).anInt7781;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1383_ = 0; i_1383_ < i_1344_; i_1383_++) {
				int i_1384_ = is[i_1383_];
				if (i_1384_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1385_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1384_];
					for (int i_1386_ = 0; i_1386_ < is_1385_.length; i_1386_++) {
						int i_1387_ = is_1385_[i_1386_];
						((Class387_Sub1) this).anIntArray7751[i_1387_] -= ((Class387_Sub1) this).anInt7782;
						((Class387_Sub1) this).anIntArray7752[i_1387_] -= ((Class387_Sub1) this).anInt7783;
						((Class387_Sub1) this).anIntArray7753[i_1387_] -= ((Class387_Sub1) this).anInt7781;
						((Class387_Sub1) this).anIntArray7751[i_1387_] = (((Class387_Sub1) this).anIntArray7751[i_1387_] * i_1340_ / 128);
						((Class387_Sub1) this).anIntArray7752[i_1387_] = (((Class387_Sub1) this).anIntArray7752[i_1387_] * i_1341_ / 128);
						((Class387_Sub1) this).anIntArray7753[i_1387_] = (((Class387_Sub1) this).anIntArray7753[i_1387_] * i_1342_ / 128);
						((Class387_Sub1) this).anIntArray7751[i_1387_] += ((Class387_Sub1) this).anInt7782;
						((Class387_Sub1) this).anIntArray7752[i_1387_] += ((Class387_Sub1) this).anInt7783;
						((Class387_Sub1) this).anIntArray7753[i_1387_] += ((Class387_Sub1) this).anInt7781;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null && ((Class387_Sub1) this).aByteArray7773 != null) {
				for (int i_1388_ = 0; i_1388_ < i_1344_; i_1388_++) {
					int i_1389_ = is[i_1388_];
					if (i_1389_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1390_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1389_]);
						for (int i_1391_ = 0; i_1391_ < is_1390_.length; i_1391_++) {
							int i_1392_ = is_1390_[i_1391_];
							int i_1393_ = (((((Class387_Sub1) this).aByteArray7773[i_1392_]) & 0xff) + i_1340_ * 8);
							if (i_1393_ < 0)
								i_1393_ = 0;
							else if (i_1393_ > 255)
								i_1393_ = 255;
							((Class387_Sub1) this).aByteArray7773[i_1392_] = (byte) i_1393_;
						}
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1394_ = 0; i_1394_ < ((Class387_Sub1) this).anInt7788; i_1394_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1394_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1394_]);
						((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | 255 - ((((Class387_Sub1) this).aByteArray7773[(((Class16) class16).anInt226 * -1295149283)]) & 0xff) << 24) * -564629049;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null) {
				for (int i_1395_ = 0; i_1395_ < i_1344_; i_1395_++) {
					int i_1396_ = is[i_1395_];
					if (i_1396_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1397_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1396_]);
						for (int i_1398_ = 0; i_1398_ < is_1397_.length; i_1398_++) {
							int i_1399_ = is_1397_[i_1398_];
							int i_1400_ = ((((Class387_Sub1) this).aShortArray7775[i_1399_]) & 0xffff);
							int i_1401_ = i_1400_ >> 10 & 0x3f;
							int i_1402_ = i_1400_ >> 7 & 0x7;
							int i_1403_ = i_1400_ & 0x7f;
							i_1401_ = i_1401_ + i_1340_ & 0x3f;
							i_1402_ += i_1341_;
							if (i_1402_ < 0)
								i_1402_ = 0;
							else if (i_1402_ > 7)
								i_1402_ = 7;
							i_1403_ += i_1342_;
							if (i_1403_ < 0)
								i_1403_ = 0;
							else if (i_1403_ > 127)
								i_1403_ = 127;
							((Class387_Sub1) this).aShortArray7775[i_1399_] = (short) (i_1401_ << 10 | i_1402_ << 7 | i_1403_);
						}
						((Class387_Sub1) this).aBoolean7733 = true;
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1404_ = 0; i_1404_ < ((Class387_Sub1) this).anInt7788; i_1404_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1404_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1404_]);
						((Class18) class18).anInt254 = (((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | (Class379.anIntArray4096[(Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0)) & 0xffff]) & 0xffffff) * -564629049);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1405_ = 0; i_1405_ < i_1344_; i_1405_++) {
					int i_1406_ = is[i_1405_];
					if (i_1406_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1407_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1406_]);
						for (int i_1408_ = 0; i_1408_ < is_1407_.length; i_1408_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1407_[i_1408_]]);
							((Class18) class18).anInt247 += i_1340_ * 1747422061;
							((Class18) class18).anInt244 += i_1341_ * 1370325433;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1409_ = 0; i_1409_ < i_1344_; i_1409_++) {
					int i_1410_ = is[i_1409_];
					if (i_1410_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1411_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1410_]);
						for (int i_1412_ = 0; i_1412_ < is_1411_.length; i_1412_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1411_[i_1412_]]);
							((Class18) class18).aFloat245 = (((Class18) class18).aFloat245 * (float) i_1340_ / 128.0F);
							((Class18) class18).aFloat248 = (((Class18) class18).aFloat248 * (float) i_1341_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1413_ = 0; i_1413_ < i_1344_; i_1413_++) {
					int i_1414_ = is[i_1413_];
					if (i_1414_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1415_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1414_]);
						for (int i_1416_ = 0; i_1416_ < is_1415_.length; i_1416_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1415_[i_1416_]]);
							((Class18) class18).anInt249 = ((((Class18) class18).anInt249 * -988477815 + i_1340_) & 0x3fff) * -839233607;
						}
					}
				}
			}
		}
	}

	void cj(int i, int[] is, int i_1417_, int i_1418_, int i_1419_, boolean bool, int i_1420_, int[] is_1421_) {
		int i_1422_ = is.length;
		if (i == 0) {
			i_1417_ <<= 4;
			i_1418_ <<= 4;
			i_1419_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1423_ = 0; i_1423_ < ((Class387_Sub1) this).anInt7799; i_1423_++) {
					((Class387_Sub1) this).anIntArray7751[i_1423_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1423_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1423_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			int i_1424_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_1425_ = 0; i_1425_ < i_1422_; i_1425_++) {
				int i_1426_ = is[i_1425_];
				if (i_1426_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1427_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1426_];
					for (int i_1428_ = 0; i_1428_ < is_1427_.length; i_1428_++) {
						int i_1429_ = is_1427_[i_1428_];
						if (((Class387_Sub1) this).aShortArray7816 == null || (i_1420_ & (((Class387_Sub1) this).aShortArray7816[i_1429_])) != 0) {
							((Class387_Sub1) this).anInt7782 += (((Class387_Sub1) this).anIntArray7751[i_1429_]);
							((Class387_Sub1) this).anInt7783 += (((Class387_Sub1) this).anIntArray7752[i_1429_]);
							((Class387_Sub1) this).anInt7781 += (((Class387_Sub1) this).anIntArray7753[i_1429_]);
							i_1424_++;
						}
					}
				}
			}
			if (i_1424_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_1424_ + i_1417_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_1424_ + i_1418_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_1424_ + i_1419_;
				((Class387_Sub1) this).aBoolean7785 = true;
			} else {
				((Class387_Sub1) this).anInt7782 = i_1417_;
				((Class387_Sub1) this).anInt7783 = i_1418_;
				((Class387_Sub1) this).anInt7781 = i_1419_;
			}
		} else if (i == 1) {
			if (is_1421_ != null) {
				int i_1430_ = ((is_1421_[0] * i_1417_ + is_1421_[1] * i_1418_ + is_1421_[2] * i_1419_ + 8192) >> 14);
				int i_1431_ = ((is_1421_[3] * i_1417_ + is_1421_[4] * i_1418_ + is_1421_[5] * i_1419_ + 8192) >> 14);
				int i_1432_ = ((is_1421_[6] * i_1417_ + is_1421_[7] * i_1418_ + is_1421_[8] * i_1419_ + 8192) >> 14);
				i_1417_ = i_1430_;
				i_1418_ = i_1431_;
				i_1419_ = i_1432_;
			}
			i_1417_ <<= 4;
			i_1418_ <<= 4;
			i_1419_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1433_ = 0; i_1433_ < ((Class387_Sub1) this).anInt7799; i_1433_++) {
					((Class387_Sub1) this).anIntArray7751[i_1433_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1433_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1433_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			for (int i_1434_ = 0; i_1434_ < i_1422_; i_1434_++) {
				int i_1435_ = is[i_1434_];
				if (i_1435_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1436_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1435_];
					for (int i_1437_ = 0; i_1437_ < is_1436_.length; i_1437_++) {
						int i_1438_ = is_1436_[i_1437_];
						if (((Class387_Sub1) this).aShortArray7816 == null || (i_1420_ & (((Class387_Sub1) this).aShortArray7816[i_1438_])) != 0) {
							((Class387_Sub1) this).anIntArray7751[i_1438_] += i_1417_;
							((Class387_Sub1) this).anIntArray7752[i_1438_] += i_1418_;
							((Class387_Sub1) this).anIntArray7753[i_1438_] += i_1419_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1421_ != null) {
				if (!((Class387_Sub1) this).aBoolean7780) {
					for (int i_1439_ = 0; i_1439_ < ((Class387_Sub1) this).anInt7799; i_1439_++) {
						((Class387_Sub1) this).anIntArray7751[i_1439_] <<= 4;
						((Class387_Sub1) this).anIntArray7752[i_1439_] <<= 4;
						((Class387_Sub1) this).anIntArray7753[i_1439_] <<= 4;
					}
					((Class387_Sub1) this).aBoolean7780 = true;
				}
				int i_1440_ = is_1421_[9] << 4;
				int i_1441_ = is_1421_[10] << 4;
				int i_1442_ = is_1421_[11] << 4;
				int i_1443_ = is_1421_[12] << 4;
				int i_1444_ = is_1421_[13] << 4;
				int i_1445_ = is_1421_[14] << 4;
				if (((Class387_Sub1) this).aBoolean7785) {
					int i_1446_ = ((is_1421_[0] * ((Class387_Sub1) this).anInt7782 + is_1421_[3] * ((Class387_Sub1) this).anInt7783 + is_1421_[6] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1447_ = ((is_1421_[1] * ((Class387_Sub1) this).anInt7782 + is_1421_[4] * ((Class387_Sub1) this).anInt7783 + is_1421_[7] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1448_ = ((is_1421_[2] * ((Class387_Sub1) this).anInt7782 + is_1421_[5] * ((Class387_Sub1) this).anInt7783 + is_1421_[8] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					i_1446_ += i_1443_;
					i_1447_ += i_1444_;
					i_1448_ += i_1445_;
					((Class387_Sub1) this).anInt7782 = i_1446_;
					((Class387_Sub1) this).anInt7783 = i_1447_;
					((Class387_Sub1) this).anInt7781 = i_1448_;
					((Class387_Sub1) this).aBoolean7785 = false;
				}
				int[] is_1449_ = new int[9];
				int i_1450_ = Class220.anIntArray2474[i_1417_];
				int i_1451_ = Class220.anIntArray2483[i_1417_];
				int i_1452_ = Class220.anIntArray2474[i_1418_];
				int i_1453_ = Class220.anIntArray2483[i_1418_];
				int i_1454_ = Class220.anIntArray2474[i_1419_];
				int i_1455_ = Class220.anIntArray2483[i_1419_];
				int i_1456_ = i_1451_ * i_1454_ + 8192 >> 14;
				int i_1457_ = i_1451_ * i_1455_ + 8192 >> 14;
				is_1449_[0] = i_1452_ * i_1454_ + i_1453_ * i_1457_ + 8192 >> 14;
				is_1449_[1] = -i_1452_ * i_1455_ + i_1453_ * i_1456_ + 8192 >> 14;
				is_1449_[2] = i_1453_ * i_1450_ + 8192 >> 14;
				is_1449_[3] = i_1450_ * i_1455_ + 8192 >> 14;
				is_1449_[4] = i_1450_ * i_1454_ + 8192 >> 14;
				is_1449_[5] = -i_1451_;
				is_1449_[6] = -i_1453_ * i_1454_ + i_1452_ * i_1457_ + 8192 >> 14;
				is_1449_[7] = i_1453_ * i_1455_ + i_1452_ * i_1456_ + 8192 >> 14;
				is_1449_[8] = i_1452_ * i_1450_ + 8192 >> 14;
				int i_1458_ = ((is_1449_[0] * -((Class387_Sub1) this).anInt7782 + is_1449_[1] * -((Class387_Sub1) this).anInt7783 + is_1449_[2] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_1459_ = ((is_1449_[3] * -((Class387_Sub1) this).anInt7782 + is_1449_[4] * -((Class387_Sub1) this).anInt7783 + is_1449_[5] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_1460_ = ((is_1449_[6] * -((Class387_Sub1) this).anInt7782 + is_1449_[7] * -((Class387_Sub1) this).anInt7783 + is_1449_[8] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_1461_ = i_1458_ + ((Class387_Sub1) this).anInt7782;
				int i_1462_ = i_1459_ + ((Class387_Sub1) this).anInt7783;
				int i_1463_ = i_1460_ + ((Class387_Sub1) this).anInt7781;
				int[] is_1464_ = new int[9];
				for (int i_1465_ = 0; i_1465_ < 3; i_1465_++) {
					for (int i_1466_ = 0; i_1466_ < 3; i_1466_++) {
						int i_1467_ = 0;
						for (int i_1468_ = 0; i_1468_ < 3; i_1468_++)
							i_1467_ += (is_1449_[i_1465_ * 3 + i_1468_] * is_1421_[i_1466_ * 3 + i_1468_]);
						is_1464_[i_1465_ * 3 + i_1466_] = i_1467_ + 8192 >> 14;
					}
				}
				int i_1469_ = ((is_1449_[0] * i_1443_ + is_1449_[1] * i_1444_ + is_1449_[2] * i_1445_ + 8192) >> 14);
				int i_1470_ = ((is_1449_[3] * i_1443_ + is_1449_[4] * i_1444_ + is_1449_[5] * i_1445_ + 8192) >> 14);
				int i_1471_ = ((is_1449_[6] * i_1443_ + is_1449_[7] * i_1444_ + is_1449_[8] * i_1445_ + 8192) >> 14);
				i_1469_ += i_1461_;
				i_1470_ += i_1462_;
				i_1471_ += i_1463_;
				int[] is_1472_ = new int[9];
				for (int i_1473_ = 0; i_1473_ < 3; i_1473_++) {
					for (int i_1474_ = 0; i_1474_ < 3; i_1474_++) {
						int i_1475_ = 0;
						for (int i_1476_ = 0; i_1476_ < 3; i_1476_++)
							i_1475_ += (is_1421_[i_1473_ * 3 + i_1476_] * is_1464_[i_1474_ + i_1476_ * 3]);
						is_1472_[i_1473_ * 3 + i_1474_] = i_1475_ + 8192 >> 14;
					}
				}
				int i_1477_ = ((is_1421_[0] * i_1469_ + is_1421_[1] * i_1470_ + is_1421_[2] * i_1471_ + 8192) >> 14);
				int i_1478_ = ((is_1421_[3] * i_1469_ + is_1421_[4] * i_1470_ + is_1421_[5] * i_1471_ + 8192) >> 14);
				int i_1479_ = ((is_1421_[6] * i_1469_ + is_1421_[7] * i_1470_ + is_1421_[8] * i_1471_ + 8192) >> 14);
				i_1477_ += i_1440_;
				i_1478_ += i_1441_;
				i_1479_ += i_1442_;
				for (int i_1480_ = 0; i_1480_ < i_1422_; i_1480_++) {
					int i_1481_ = is[i_1480_];
					if (i_1481_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1482_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1481_]);
						for (int i_1483_ = 0; i_1483_ < is_1482_.length; i_1483_++) {
							int i_1484_ = is_1482_[i_1483_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1420_ & (((Class387_Sub1) this).aShortArray7816[i_1484_])) != 0)) {
								int i_1485_ = (is_1472_[0] * (((Class387_Sub1) this).anIntArray7751[i_1484_]) + is_1472_[1] * (((Class387_Sub1) this).anIntArray7752[i_1484_]) + is_1472_[2] * (((Class387_Sub1) this).anIntArray7753[i_1484_]) + 8192) >> 14;
								int i_1486_ = (is_1472_[3] * (((Class387_Sub1) this).anIntArray7751[i_1484_]) + is_1472_[4] * (((Class387_Sub1) this).anIntArray7752[i_1484_]) + is_1472_[5] * (((Class387_Sub1) this).anIntArray7753[i_1484_]) + 8192) >> 14;
								int i_1487_ = (is_1472_[6] * (((Class387_Sub1) this).anIntArray7751[i_1484_]) + is_1472_[7] * (((Class387_Sub1) this).anIntArray7752[i_1484_]) + is_1472_[8] * (((Class387_Sub1) this).anIntArray7753[i_1484_]) + 8192) >> 14;
								i_1485_ += i_1477_;
								i_1486_ += i_1478_;
								i_1487_ += i_1479_;
								((Class387_Sub1) this).anIntArray7751[i_1484_] = i_1485_;
								((Class387_Sub1) this).anIntArray7752[i_1484_] = i_1486_;
								((Class387_Sub1) this).anIntArray7753[i_1484_] = i_1487_;
							}
						}
					}
				}
			} else {
				for (int i_1488_ = 0; i_1488_ < i_1422_; i_1488_++) {
					int i_1489_ = is[i_1488_];
					if (i_1489_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1490_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1489_]);
						for (int i_1491_ = 0; i_1491_ < is_1490_.length; i_1491_++) {
							int i_1492_ = is_1490_[i_1491_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1420_ & (((Class387_Sub1) this).aShortArray7816[i_1492_])) != 0)) {
								((Class387_Sub1) this).anIntArray7751[i_1492_] -= ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1492_] -= ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1492_] -= ((Class387_Sub1) this).anInt7781;
								if (i_1419_ != 0) {
									int i_1493_ = Class220.anIntArray2483[i_1419_];
									int i_1494_ = Class220.anIntArray2474[i_1419_];
									int i_1495_ = ((((Class387_Sub1) this).anIntArray7752[i_1492_]) * i_1493_ + ((((Class387_Sub1) this).anIntArray7751[i_1492_]) * i_1494_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7752[i_1492_] = ((((Class387_Sub1) this).anIntArray7752[i_1492_]) * i_1494_ - ((((Class387_Sub1) this).anIntArray7751[i_1492_]) * i_1493_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7751[i_1492_] = i_1495_;
								}
								if (i_1417_ != 0) {
									int i_1496_ = Class220.anIntArray2483[i_1417_];
									int i_1497_ = Class220.anIntArray2474[i_1417_];
									int i_1498_ = ((((Class387_Sub1) this).anIntArray7752[i_1492_]) * i_1497_ - ((((Class387_Sub1) this).anIntArray7753[i_1492_]) * i_1496_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7753[i_1492_] = ((((Class387_Sub1) this).anIntArray7752[i_1492_]) * i_1496_ + ((((Class387_Sub1) this).anIntArray7753[i_1492_]) * i_1497_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7752[i_1492_] = i_1498_;
								}
								if (i_1418_ != 0) {
									int i_1499_ = Class220.anIntArray2483[i_1418_];
									int i_1500_ = Class220.anIntArray2474[i_1418_];
									int i_1501_ = ((((Class387_Sub1) this).anIntArray7753[i_1492_]) * i_1499_ + ((((Class387_Sub1) this).anIntArray7751[i_1492_]) * i_1500_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7753[i_1492_] = ((((Class387_Sub1) this).anIntArray7753[i_1492_]) * i_1500_ - ((((Class387_Sub1) this).anIntArray7751[i_1492_]) * i_1499_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7751[i_1492_] = i_1501_;
								}
								((Class387_Sub1) this).anIntArray7751[i_1492_] += ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1492_] += ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1492_] += ((Class387_Sub1) this).anInt7781;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_1421_ != null) {
				if (!((Class387_Sub1) this).aBoolean7780) {
					for (int i_1502_ = 0; i_1502_ < ((Class387_Sub1) this).anInt7799; i_1502_++) {
						((Class387_Sub1) this).anIntArray7751[i_1502_] <<= 4;
						((Class387_Sub1) this).anIntArray7752[i_1502_] <<= 4;
						((Class387_Sub1) this).anIntArray7753[i_1502_] <<= 4;
					}
					((Class387_Sub1) this).aBoolean7780 = true;
				}
				int i_1503_ = is_1421_[9] << 4;
				int i_1504_ = is_1421_[10] << 4;
				int i_1505_ = is_1421_[11] << 4;
				int i_1506_ = is_1421_[12] << 4;
				int i_1507_ = is_1421_[13] << 4;
				int i_1508_ = is_1421_[14] << 4;
				if (((Class387_Sub1) this).aBoolean7785) {
					int i_1509_ = ((is_1421_[0] * ((Class387_Sub1) this).anInt7782 + is_1421_[3] * ((Class387_Sub1) this).anInt7783 + is_1421_[6] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1510_ = ((is_1421_[1] * ((Class387_Sub1) this).anInt7782 + is_1421_[4] * ((Class387_Sub1) this).anInt7783 + is_1421_[7] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1511_ = ((is_1421_[2] * ((Class387_Sub1) this).anInt7782 + is_1421_[5] * ((Class387_Sub1) this).anInt7783 + is_1421_[8] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					i_1509_ += i_1506_;
					i_1510_ += i_1507_;
					i_1511_ += i_1508_;
					((Class387_Sub1) this).anInt7782 = i_1509_;
					((Class387_Sub1) this).anInt7783 = i_1510_;
					((Class387_Sub1) this).anInt7781 = i_1511_;
					((Class387_Sub1) this).aBoolean7785 = false;
				}
				int i_1512_ = i_1417_ << 15 >> 7;
				int i_1513_ = i_1418_ << 15 >> 7;
				int i_1514_ = i_1419_ << 15 >> 7;
				int i_1515_ = i_1512_ * -((Class387_Sub1) this).anInt7782 + 8192 >> 14;
				int i_1516_ = i_1513_ * -((Class387_Sub1) this).anInt7783 + 8192 >> 14;
				int i_1517_ = i_1514_ * -((Class387_Sub1) this).anInt7781 + 8192 >> 14;
				int i_1518_ = i_1515_ + ((Class387_Sub1) this).anInt7782;
				int i_1519_ = i_1516_ + ((Class387_Sub1) this).anInt7783;
				int i_1520_ = i_1517_ + ((Class387_Sub1) this).anInt7781;
				int[] is_1521_ = new int[9];
				is_1521_[0] = i_1512_ * is_1421_[0] + 8192 >> 14;
				is_1521_[1] = i_1512_ * is_1421_[3] + 8192 >> 14;
				is_1521_[2] = i_1512_ * is_1421_[6] + 8192 >> 14;
				is_1521_[3] = i_1513_ * is_1421_[1] + 8192 >> 14;
				is_1521_[4] = i_1513_ * is_1421_[4] + 8192 >> 14;
				is_1521_[5] = i_1513_ * is_1421_[7] + 8192 >> 14;
				is_1521_[6] = i_1514_ * is_1421_[2] + 8192 >> 14;
				is_1521_[7] = i_1514_ * is_1421_[5] + 8192 >> 14;
				is_1521_[8] = i_1514_ * is_1421_[8] + 8192 >> 14;
				int i_1522_ = i_1512_ * i_1506_ + 8192 >> 14;
				int i_1523_ = i_1513_ * i_1507_ + 8192 >> 14;
				int i_1524_ = i_1514_ * i_1508_ + 8192 >> 14;
				i_1522_ += i_1518_;
				i_1523_ += i_1519_;
				i_1524_ += i_1520_;
				int[] is_1525_ = new int[9];
				for (int i_1526_ = 0; i_1526_ < 3; i_1526_++) {
					for (int i_1527_ = 0; i_1527_ < 3; i_1527_++) {
						int i_1528_ = 0;
						for (int i_1529_ = 0; i_1529_ < 3; i_1529_++)
							i_1528_ += (is_1421_[i_1526_ * 3 + i_1529_] * is_1521_[i_1527_ + i_1529_ * 3]);
						is_1525_[i_1526_ * 3 + i_1527_] = i_1528_ + 8192 >> 14;
					}
				}
				int i_1530_ = ((is_1421_[0] * i_1522_ + is_1421_[1] * i_1523_ + is_1421_[2] * i_1524_ + 8192) >> 14);
				int i_1531_ = ((is_1421_[3] * i_1522_ + is_1421_[4] * i_1523_ + is_1421_[5] * i_1524_ + 8192) >> 14);
				int i_1532_ = ((is_1421_[6] * i_1522_ + is_1421_[7] * i_1523_ + is_1421_[8] * i_1524_ + 8192) >> 14);
				i_1530_ += i_1503_;
				i_1531_ += i_1504_;
				i_1532_ += i_1505_;
				for (int i_1533_ = 0; i_1533_ < i_1422_; i_1533_++) {
					int i_1534_ = is[i_1533_];
					if (i_1534_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1535_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1534_]);
						for (int i_1536_ = 0; i_1536_ < is_1535_.length; i_1536_++) {
							int i_1537_ = is_1535_[i_1536_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1420_ & (((Class387_Sub1) this).aShortArray7816[i_1537_])) != 0)) {
								int i_1538_ = (is_1525_[0] * (((Class387_Sub1) this).anIntArray7751[i_1537_]) + is_1525_[1] * (((Class387_Sub1) this).anIntArray7752[i_1537_]) + is_1525_[2] * (((Class387_Sub1) this).anIntArray7753[i_1537_]) + 8192) >> 14;
								int i_1539_ = (is_1525_[3] * (((Class387_Sub1) this).anIntArray7751[i_1537_]) + is_1525_[4] * (((Class387_Sub1) this).anIntArray7752[i_1537_]) + is_1525_[5] * (((Class387_Sub1) this).anIntArray7753[i_1537_]) + 8192) >> 14;
								int i_1540_ = (is_1525_[6] * (((Class387_Sub1) this).anIntArray7751[i_1537_]) + is_1525_[7] * (((Class387_Sub1) this).anIntArray7752[i_1537_]) + is_1525_[8] * (((Class387_Sub1) this).anIntArray7753[i_1537_]) + 8192) >> 14;
								i_1538_ += i_1530_;
								i_1539_ += i_1531_;
								i_1540_ += i_1532_;
								((Class387_Sub1) this).anIntArray7751[i_1537_] = i_1538_;
								((Class387_Sub1) this).anIntArray7752[i_1537_] = i_1539_;
								((Class387_Sub1) this).anIntArray7753[i_1537_] = i_1540_;
							}
						}
					}
				}
			} else {
				for (int i_1541_ = 0; i_1541_ < i_1422_; i_1541_++) {
					int i_1542_ = is[i_1541_];
					if (i_1542_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1543_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1542_]);
						for (int i_1544_ = 0; i_1544_ < is_1543_.length; i_1544_++) {
							int i_1545_ = is_1543_[i_1544_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1420_ & (((Class387_Sub1) this).aShortArray7816[i_1545_])) != 0)) {
								((Class387_Sub1) this).anIntArray7751[i_1545_] -= ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1545_] -= ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1545_] -= ((Class387_Sub1) this).anInt7781;
								((Class387_Sub1) this).anIntArray7751[i_1545_] = (((Class387_Sub1) this).anIntArray7751[i_1545_]) * i_1417_ / 128;
								((Class387_Sub1) this).anIntArray7752[i_1545_] = (((Class387_Sub1) this).anIntArray7752[i_1545_]) * i_1418_ / 128;
								((Class387_Sub1) this).anIntArray7753[i_1545_] = (((Class387_Sub1) this).anIntArray7753[i_1545_]) * i_1419_ / 128;
								((Class387_Sub1) this).anIntArray7751[i_1545_] += ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1545_] += ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1545_] += ((Class387_Sub1) this).anInt7781;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null && ((Class387_Sub1) this).aByteArray7773 != null) {
				for (int i_1546_ = 0; i_1546_ < i_1422_; i_1546_++) {
					int i_1547_ = is[i_1546_];
					if (i_1547_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1548_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1547_]);
						for (int i_1549_ = 0; i_1549_ < is_1548_.length; i_1549_++) {
							int i_1550_ = is_1548_[i_1549_];
							if (((Class387_Sub1) this).aShortArray7776 == null || ((i_1420_ & (((Class387_Sub1) this).aShortArray7776[i_1550_])) != 0)) {
								int i_1551_ = (((((Class387_Sub1) this).aByteArray7773[i_1550_]) & 0xff) + i_1417_ * 8);
								if (i_1551_ < 0)
									i_1551_ = 0;
								else if (i_1551_ > 255)
									i_1551_ = 255;
								((Class387_Sub1) this).aByteArray7773[i_1550_] = (byte) i_1551_;
							}
						}
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1552_ = 0; i_1552_ < ((Class387_Sub1) this).anInt7788; i_1552_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1552_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1552_]);
						((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | 255 - ((((Class387_Sub1) this).aByteArray7773[(((Class16) class16).anInt226 * -1295149283)]) & 0xff) << 24) * -564629049;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null) {
				for (int i_1553_ = 0; i_1553_ < i_1422_; i_1553_++) {
					int i_1554_ = is[i_1553_];
					if (i_1554_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1555_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1554_]);
						for (int i_1556_ = 0; i_1556_ < is_1555_.length; i_1556_++) {
							int i_1557_ = is_1555_[i_1556_];
							if (((Class387_Sub1) this).aShortArray7776 == null || ((i_1420_ & (((Class387_Sub1) this).aShortArray7776[i_1557_])) != 0)) {
								int i_1558_ = ((((Class387_Sub1) this).aShortArray7775[i_1557_]) & 0xffff);
								int i_1559_ = i_1558_ >> 10 & 0x3f;
								int i_1560_ = i_1558_ >> 7 & 0x7;
								int i_1561_ = i_1558_ & 0x7f;
								i_1559_ = i_1559_ + i_1417_ & 0x3f;
								i_1560_ += i_1418_;
								if (i_1560_ < 0)
									i_1560_ = 0;
								else if (i_1560_ > 7)
									i_1560_ = 7;
								i_1561_ += i_1419_;
								if (i_1561_ < 0)
									i_1561_ = 0;
								else if (i_1561_ > 127)
									i_1561_ = 127;
								((Class387_Sub1) this).aShortArray7775[i_1557_] = (short) (i_1559_ << 10 | i_1560_ << 7 | i_1561_);
							}
						}
						((Class387_Sub1) this).aBoolean7733 = true;
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1562_ = 0; i_1562_ < ((Class387_Sub1) this).anInt7788; i_1562_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1562_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1562_]);
						((Class18) class18).anInt254 = (((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | (Class379.anIntArray4096[(Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0)) & 0xffff]) & 0xffffff) * -564629049);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1563_ = 0; i_1563_ < i_1422_; i_1563_++) {
					int i_1564_ = is[i_1563_];
					if (i_1564_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1565_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1564_]);
						for (int i_1566_ = 0; i_1566_ < is_1565_.length; i_1566_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1565_[i_1566_]]);
							((Class18) class18).anInt247 += i_1417_ * 1747422061;
							((Class18) class18).anInt244 += i_1418_ * 1370325433;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1567_ = 0; i_1567_ < i_1422_; i_1567_++) {
					int i_1568_ = is[i_1567_];
					if (i_1568_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1569_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1568_]);
						for (int i_1570_ = 0; i_1570_ < is_1569_.length; i_1570_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1569_[i_1570_]]);
							((Class18) class18).aFloat245 = (((Class18) class18).aFloat245 * (float) i_1417_ / 128.0F);
							((Class18) class18).aFloat248 = (((Class18) class18).aFloat248 * (float) i_1418_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1571_ = 0; i_1571_ < i_1422_; i_1571_++) {
					int i_1572_ = is[i_1571_];
					if (i_1572_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1573_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1572_]);
						for (int i_1574_ = 0; i_1574_ < is_1573_.length; i_1574_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1573_[i_1574_]]);
							((Class18) class18).anInt249 = ((((Class18) class18).anInt249 * -988477815 + i_1417_) & 0x3fff) * -839233607;
						}
					}
				}
			}
		}
	}

	void co(int i, int[] is, int i_1575_, int i_1576_, int i_1577_, boolean bool, int i_1578_, int[] is_1579_) {
		int i_1580_ = is.length;
		if (i == 0) {
			i_1575_ <<= 4;
			i_1576_ <<= 4;
			i_1577_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1581_ = 0; i_1581_ < ((Class387_Sub1) this).anInt7799; i_1581_++) {
					((Class387_Sub1) this).anIntArray7751[i_1581_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1581_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1581_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			int i_1582_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_1583_ = 0; i_1583_ < i_1580_; i_1583_++) {
				int i_1584_ = is[i_1583_];
				if (i_1584_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1585_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1584_];
					for (int i_1586_ = 0; i_1586_ < is_1585_.length; i_1586_++) {
						int i_1587_ = is_1585_[i_1586_];
						if (((Class387_Sub1) this).aShortArray7816 == null || (i_1578_ & (((Class387_Sub1) this).aShortArray7816[i_1587_])) != 0) {
							((Class387_Sub1) this).anInt7782 += (((Class387_Sub1) this).anIntArray7751[i_1587_]);
							((Class387_Sub1) this).anInt7783 += (((Class387_Sub1) this).anIntArray7752[i_1587_]);
							((Class387_Sub1) this).anInt7781 += (((Class387_Sub1) this).anIntArray7753[i_1587_]);
							i_1582_++;
						}
					}
				}
			}
			if (i_1582_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_1582_ + i_1575_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_1582_ + i_1576_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_1582_ + i_1577_;
				((Class387_Sub1) this).aBoolean7785 = true;
			} else {
				((Class387_Sub1) this).anInt7782 = i_1575_;
				((Class387_Sub1) this).anInt7783 = i_1576_;
				((Class387_Sub1) this).anInt7781 = i_1577_;
			}
		} else if (i == 1) {
			if (is_1579_ != null) {
				int i_1588_ = ((is_1579_[0] * i_1575_ + is_1579_[1] * i_1576_ + is_1579_[2] * i_1577_ + 8192) >> 14);
				int i_1589_ = ((is_1579_[3] * i_1575_ + is_1579_[4] * i_1576_ + is_1579_[5] * i_1577_ + 8192) >> 14);
				int i_1590_ = ((is_1579_[6] * i_1575_ + is_1579_[7] * i_1576_ + is_1579_[8] * i_1577_ + 8192) >> 14);
				i_1575_ = i_1588_;
				i_1576_ = i_1589_;
				i_1577_ = i_1590_;
			}
			i_1575_ <<= 4;
			i_1576_ <<= 4;
			i_1577_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1591_ = 0; i_1591_ < ((Class387_Sub1) this).anInt7799; i_1591_++) {
					((Class387_Sub1) this).anIntArray7751[i_1591_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1591_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1591_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			for (int i_1592_ = 0; i_1592_ < i_1580_; i_1592_++) {
				int i_1593_ = is[i_1592_];
				if (i_1593_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1594_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1593_];
					for (int i_1595_ = 0; i_1595_ < is_1594_.length; i_1595_++) {
						int i_1596_ = is_1594_[i_1595_];
						if (((Class387_Sub1) this).aShortArray7816 == null || (i_1578_ & (((Class387_Sub1) this).aShortArray7816[i_1596_])) != 0) {
							((Class387_Sub1) this).anIntArray7751[i_1596_] += i_1575_;
							((Class387_Sub1) this).anIntArray7752[i_1596_] += i_1576_;
							((Class387_Sub1) this).anIntArray7753[i_1596_] += i_1577_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1579_ != null) {
				if (!((Class387_Sub1) this).aBoolean7780) {
					for (int i_1597_ = 0; i_1597_ < ((Class387_Sub1) this).anInt7799; i_1597_++) {
						((Class387_Sub1) this).anIntArray7751[i_1597_] <<= 4;
						((Class387_Sub1) this).anIntArray7752[i_1597_] <<= 4;
						((Class387_Sub1) this).anIntArray7753[i_1597_] <<= 4;
					}
					((Class387_Sub1) this).aBoolean7780 = true;
				}
				int i_1598_ = is_1579_[9] << 4;
				int i_1599_ = is_1579_[10] << 4;
				int i_1600_ = is_1579_[11] << 4;
				int i_1601_ = is_1579_[12] << 4;
				int i_1602_ = is_1579_[13] << 4;
				int i_1603_ = is_1579_[14] << 4;
				if (((Class387_Sub1) this).aBoolean7785) {
					int i_1604_ = ((is_1579_[0] * ((Class387_Sub1) this).anInt7782 + is_1579_[3] * ((Class387_Sub1) this).anInt7783 + is_1579_[6] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1605_ = ((is_1579_[1] * ((Class387_Sub1) this).anInt7782 + is_1579_[4] * ((Class387_Sub1) this).anInt7783 + is_1579_[7] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1606_ = ((is_1579_[2] * ((Class387_Sub1) this).anInt7782 + is_1579_[5] * ((Class387_Sub1) this).anInt7783 + is_1579_[8] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					i_1604_ += i_1601_;
					i_1605_ += i_1602_;
					i_1606_ += i_1603_;
					((Class387_Sub1) this).anInt7782 = i_1604_;
					((Class387_Sub1) this).anInt7783 = i_1605_;
					((Class387_Sub1) this).anInt7781 = i_1606_;
					((Class387_Sub1) this).aBoolean7785 = false;
				}
				int[] is_1607_ = new int[9];
				int i_1608_ = Class220.anIntArray2474[i_1575_];
				int i_1609_ = Class220.anIntArray2483[i_1575_];
				int i_1610_ = Class220.anIntArray2474[i_1576_];
				int i_1611_ = Class220.anIntArray2483[i_1576_];
				int i_1612_ = Class220.anIntArray2474[i_1577_];
				int i_1613_ = Class220.anIntArray2483[i_1577_];
				int i_1614_ = i_1609_ * i_1612_ + 8192 >> 14;
				int i_1615_ = i_1609_ * i_1613_ + 8192 >> 14;
				is_1607_[0] = i_1610_ * i_1612_ + i_1611_ * i_1615_ + 8192 >> 14;
				is_1607_[1] = -i_1610_ * i_1613_ + i_1611_ * i_1614_ + 8192 >> 14;
				is_1607_[2] = i_1611_ * i_1608_ + 8192 >> 14;
				is_1607_[3] = i_1608_ * i_1613_ + 8192 >> 14;
				is_1607_[4] = i_1608_ * i_1612_ + 8192 >> 14;
				is_1607_[5] = -i_1609_;
				is_1607_[6] = -i_1611_ * i_1612_ + i_1610_ * i_1615_ + 8192 >> 14;
				is_1607_[7] = i_1611_ * i_1613_ + i_1610_ * i_1614_ + 8192 >> 14;
				is_1607_[8] = i_1610_ * i_1608_ + 8192 >> 14;
				int i_1616_ = ((is_1607_[0] * -((Class387_Sub1) this).anInt7782 + is_1607_[1] * -((Class387_Sub1) this).anInt7783 + is_1607_[2] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_1617_ = ((is_1607_[3] * -((Class387_Sub1) this).anInt7782 + is_1607_[4] * -((Class387_Sub1) this).anInt7783 + is_1607_[5] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_1618_ = ((is_1607_[6] * -((Class387_Sub1) this).anInt7782 + is_1607_[7] * -((Class387_Sub1) this).anInt7783 + is_1607_[8] * -((Class387_Sub1) this).anInt7781 + 8192) >> 14);
				int i_1619_ = i_1616_ + ((Class387_Sub1) this).anInt7782;
				int i_1620_ = i_1617_ + ((Class387_Sub1) this).anInt7783;
				int i_1621_ = i_1618_ + ((Class387_Sub1) this).anInt7781;
				int[] is_1622_ = new int[9];
				for (int i_1623_ = 0; i_1623_ < 3; i_1623_++) {
					for (int i_1624_ = 0; i_1624_ < 3; i_1624_++) {
						int i_1625_ = 0;
						for (int i_1626_ = 0; i_1626_ < 3; i_1626_++)
							i_1625_ += (is_1607_[i_1623_ * 3 + i_1626_] * is_1579_[i_1624_ * 3 + i_1626_]);
						is_1622_[i_1623_ * 3 + i_1624_] = i_1625_ + 8192 >> 14;
					}
				}
				int i_1627_ = ((is_1607_[0] * i_1601_ + is_1607_[1] * i_1602_ + is_1607_[2] * i_1603_ + 8192) >> 14);
				int i_1628_ = ((is_1607_[3] * i_1601_ + is_1607_[4] * i_1602_ + is_1607_[5] * i_1603_ + 8192) >> 14);
				int i_1629_ = ((is_1607_[6] * i_1601_ + is_1607_[7] * i_1602_ + is_1607_[8] * i_1603_ + 8192) >> 14);
				i_1627_ += i_1619_;
				i_1628_ += i_1620_;
				i_1629_ += i_1621_;
				int[] is_1630_ = new int[9];
				for (int i_1631_ = 0; i_1631_ < 3; i_1631_++) {
					for (int i_1632_ = 0; i_1632_ < 3; i_1632_++) {
						int i_1633_ = 0;
						for (int i_1634_ = 0; i_1634_ < 3; i_1634_++)
							i_1633_ += (is_1579_[i_1631_ * 3 + i_1634_] * is_1622_[i_1632_ + i_1634_ * 3]);
						is_1630_[i_1631_ * 3 + i_1632_] = i_1633_ + 8192 >> 14;
					}
				}
				int i_1635_ = ((is_1579_[0] * i_1627_ + is_1579_[1] * i_1628_ + is_1579_[2] * i_1629_ + 8192) >> 14);
				int i_1636_ = ((is_1579_[3] * i_1627_ + is_1579_[4] * i_1628_ + is_1579_[5] * i_1629_ + 8192) >> 14);
				int i_1637_ = ((is_1579_[6] * i_1627_ + is_1579_[7] * i_1628_ + is_1579_[8] * i_1629_ + 8192) >> 14);
				i_1635_ += i_1598_;
				i_1636_ += i_1599_;
				i_1637_ += i_1600_;
				for (int i_1638_ = 0; i_1638_ < i_1580_; i_1638_++) {
					int i_1639_ = is[i_1638_];
					if (i_1639_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1640_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1639_]);
						for (int i_1641_ = 0; i_1641_ < is_1640_.length; i_1641_++) {
							int i_1642_ = is_1640_[i_1641_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1578_ & (((Class387_Sub1) this).aShortArray7816[i_1642_])) != 0)) {
								int i_1643_ = (is_1630_[0] * (((Class387_Sub1) this).anIntArray7751[i_1642_]) + is_1630_[1] * (((Class387_Sub1) this).anIntArray7752[i_1642_]) + is_1630_[2] * (((Class387_Sub1) this).anIntArray7753[i_1642_]) + 8192) >> 14;
								int i_1644_ = (is_1630_[3] * (((Class387_Sub1) this).anIntArray7751[i_1642_]) + is_1630_[4] * (((Class387_Sub1) this).anIntArray7752[i_1642_]) + is_1630_[5] * (((Class387_Sub1) this).anIntArray7753[i_1642_]) + 8192) >> 14;
								int i_1645_ = (is_1630_[6] * (((Class387_Sub1) this).anIntArray7751[i_1642_]) + is_1630_[7] * (((Class387_Sub1) this).anIntArray7752[i_1642_]) + is_1630_[8] * (((Class387_Sub1) this).anIntArray7753[i_1642_]) + 8192) >> 14;
								i_1643_ += i_1635_;
								i_1644_ += i_1636_;
								i_1645_ += i_1637_;
								((Class387_Sub1) this).anIntArray7751[i_1642_] = i_1643_;
								((Class387_Sub1) this).anIntArray7752[i_1642_] = i_1644_;
								((Class387_Sub1) this).anIntArray7753[i_1642_] = i_1645_;
							}
						}
					}
				}
			} else {
				for (int i_1646_ = 0; i_1646_ < i_1580_; i_1646_++) {
					int i_1647_ = is[i_1646_];
					if (i_1647_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1648_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1647_]);
						for (int i_1649_ = 0; i_1649_ < is_1648_.length; i_1649_++) {
							int i_1650_ = is_1648_[i_1649_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1578_ & (((Class387_Sub1) this).aShortArray7816[i_1650_])) != 0)) {
								((Class387_Sub1) this).anIntArray7751[i_1650_] -= ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1650_] -= ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1650_] -= ((Class387_Sub1) this).anInt7781;
								if (i_1577_ != 0) {
									int i_1651_ = Class220.anIntArray2483[i_1577_];
									int i_1652_ = Class220.anIntArray2474[i_1577_];
									int i_1653_ = ((((Class387_Sub1) this).anIntArray7752[i_1650_]) * i_1651_ + ((((Class387_Sub1) this).anIntArray7751[i_1650_]) * i_1652_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7752[i_1650_] = ((((Class387_Sub1) this).anIntArray7752[i_1650_]) * i_1652_ - ((((Class387_Sub1) this).anIntArray7751[i_1650_]) * i_1651_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7751[i_1650_] = i_1653_;
								}
								if (i_1575_ != 0) {
									int i_1654_ = Class220.anIntArray2483[i_1575_];
									int i_1655_ = Class220.anIntArray2474[i_1575_];
									int i_1656_ = ((((Class387_Sub1) this).anIntArray7752[i_1650_]) * i_1655_ - ((((Class387_Sub1) this).anIntArray7753[i_1650_]) * i_1654_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7753[i_1650_] = ((((Class387_Sub1) this).anIntArray7752[i_1650_]) * i_1654_ + ((((Class387_Sub1) this).anIntArray7753[i_1650_]) * i_1655_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7752[i_1650_] = i_1656_;
								}
								if (i_1576_ != 0) {
									int i_1657_ = Class220.anIntArray2483[i_1576_];
									int i_1658_ = Class220.anIntArray2474[i_1576_];
									int i_1659_ = ((((Class387_Sub1) this).anIntArray7753[i_1650_]) * i_1657_ + ((((Class387_Sub1) this).anIntArray7751[i_1650_]) * i_1658_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7753[i_1650_] = ((((Class387_Sub1) this).anIntArray7753[i_1650_]) * i_1658_ - ((((Class387_Sub1) this).anIntArray7751[i_1650_]) * i_1657_) + 16383) >> 14;
									((Class387_Sub1) this).anIntArray7751[i_1650_] = i_1659_;
								}
								((Class387_Sub1) this).anIntArray7751[i_1650_] += ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1650_] += ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1650_] += ((Class387_Sub1) this).anInt7781;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_1579_ != null) {
				if (!((Class387_Sub1) this).aBoolean7780) {
					for (int i_1660_ = 0; i_1660_ < ((Class387_Sub1) this).anInt7799; i_1660_++) {
						((Class387_Sub1) this).anIntArray7751[i_1660_] <<= 4;
						((Class387_Sub1) this).anIntArray7752[i_1660_] <<= 4;
						((Class387_Sub1) this).anIntArray7753[i_1660_] <<= 4;
					}
					((Class387_Sub1) this).aBoolean7780 = true;
				}
				int i_1661_ = is_1579_[9] << 4;
				int i_1662_ = is_1579_[10] << 4;
				int i_1663_ = is_1579_[11] << 4;
				int i_1664_ = is_1579_[12] << 4;
				int i_1665_ = is_1579_[13] << 4;
				int i_1666_ = is_1579_[14] << 4;
				if (((Class387_Sub1) this).aBoolean7785) {
					int i_1667_ = ((is_1579_[0] * ((Class387_Sub1) this).anInt7782 + is_1579_[3] * ((Class387_Sub1) this).anInt7783 + is_1579_[6] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1668_ = ((is_1579_[1] * ((Class387_Sub1) this).anInt7782 + is_1579_[4] * ((Class387_Sub1) this).anInt7783 + is_1579_[7] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					int i_1669_ = ((is_1579_[2] * ((Class387_Sub1) this).anInt7782 + is_1579_[5] * ((Class387_Sub1) this).anInt7783 + is_1579_[8] * ((Class387_Sub1) this).anInt7781 + 8192) >> 14);
					i_1667_ += i_1664_;
					i_1668_ += i_1665_;
					i_1669_ += i_1666_;
					((Class387_Sub1) this).anInt7782 = i_1667_;
					((Class387_Sub1) this).anInt7783 = i_1668_;
					((Class387_Sub1) this).anInt7781 = i_1669_;
					((Class387_Sub1) this).aBoolean7785 = false;
				}
				int i_1670_ = i_1575_ << 15 >> 7;
				int i_1671_ = i_1576_ << 15 >> 7;
				int i_1672_ = i_1577_ << 15 >> 7;
				int i_1673_ = i_1670_ * -((Class387_Sub1) this).anInt7782 + 8192 >> 14;
				int i_1674_ = i_1671_ * -((Class387_Sub1) this).anInt7783 + 8192 >> 14;
				int i_1675_ = i_1672_ * -((Class387_Sub1) this).anInt7781 + 8192 >> 14;
				int i_1676_ = i_1673_ + ((Class387_Sub1) this).anInt7782;
				int i_1677_ = i_1674_ + ((Class387_Sub1) this).anInt7783;
				int i_1678_ = i_1675_ + ((Class387_Sub1) this).anInt7781;
				int[] is_1679_ = new int[9];
				is_1679_[0] = i_1670_ * is_1579_[0] + 8192 >> 14;
				is_1679_[1] = i_1670_ * is_1579_[3] + 8192 >> 14;
				is_1679_[2] = i_1670_ * is_1579_[6] + 8192 >> 14;
				is_1679_[3] = i_1671_ * is_1579_[1] + 8192 >> 14;
				is_1679_[4] = i_1671_ * is_1579_[4] + 8192 >> 14;
				is_1679_[5] = i_1671_ * is_1579_[7] + 8192 >> 14;
				is_1679_[6] = i_1672_ * is_1579_[2] + 8192 >> 14;
				is_1679_[7] = i_1672_ * is_1579_[5] + 8192 >> 14;
				is_1679_[8] = i_1672_ * is_1579_[8] + 8192 >> 14;
				int i_1680_ = i_1670_ * i_1664_ + 8192 >> 14;
				int i_1681_ = i_1671_ * i_1665_ + 8192 >> 14;
				int i_1682_ = i_1672_ * i_1666_ + 8192 >> 14;
				i_1680_ += i_1676_;
				i_1681_ += i_1677_;
				i_1682_ += i_1678_;
				int[] is_1683_ = new int[9];
				for (int i_1684_ = 0; i_1684_ < 3; i_1684_++) {
					for (int i_1685_ = 0; i_1685_ < 3; i_1685_++) {
						int i_1686_ = 0;
						for (int i_1687_ = 0; i_1687_ < 3; i_1687_++)
							i_1686_ += (is_1579_[i_1684_ * 3 + i_1687_] * is_1679_[i_1685_ + i_1687_ * 3]);
						is_1683_[i_1684_ * 3 + i_1685_] = i_1686_ + 8192 >> 14;
					}
				}
				int i_1688_ = ((is_1579_[0] * i_1680_ + is_1579_[1] * i_1681_ + is_1579_[2] * i_1682_ + 8192) >> 14);
				int i_1689_ = ((is_1579_[3] * i_1680_ + is_1579_[4] * i_1681_ + is_1579_[5] * i_1682_ + 8192) >> 14);
				int i_1690_ = ((is_1579_[6] * i_1680_ + is_1579_[7] * i_1681_ + is_1579_[8] * i_1682_ + 8192) >> 14);
				i_1688_ += i_1661_;
				i_1689_ += i_1662_;
				i_1690_ += i_1663_;
				for (int i_1691_ = 0; i_1691_ < i_1580_; i_1691_++) {
					int i_1692_ = is[i_1691_];
					if (i_1692_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1693_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1692_]);
						for (int i_1694_ = 0; i_1694_ < is_1693_.length; i_1694_++) {
							int i_1695_ = is_1693_[i_1694_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1578_ & (((Class387_Sub1) this).aShortArray7816[i_1695_])) != 0)) {
								int i_1696_ = (is_1683_[0] * (((Class387_Sub1) this).anIntArray7751[i_1695_]) + is_1683_[1] * (((Class387_Sub1) this).anIntArray7752[i_1695_]) + is_1683_[2] * (((Class387_Sub1) this).anIntArray7753[i_1695_]) + 8192) >> 14;
								int i_1697_ = (is_1683_[3] * (((Class387_Sub1) this).anIntArray7751[i_1695_]) + is_1683_[4] * (((Class387_Sub1) this).anIntArray7752[i_1695_]) + is_1683_[5] * (((Class387_Sub1) this).anIntArray7753[i_1695_]) + 8192) >> 14;
								int i_1698_ = (is_1683_[6] * (((Class387_Sub1) this).anIntArray7751[i_1695_]) + is_1683_[7] * (((Class387_Sub1) this).anIntArray7752[i_1695_]) + is_1683_[8] * (((Class387_Sub1) this).anIntArray7753[i_1695_]) + 8192) >> 14;
								i_1696_ += i_1688_;
								i_1697_ += i_1689_;
								i_1698_ += i_1690_;
								((Class387_Sub1) this).anIntArray7751[i_1695_] = i_1696_;
								((Class387_Sub1) this).anIntArray7752[i_1695_] = i_1697_;
								((Class387_Sub1) this).anIntArray7753[i_1695_] = i_1698_;
							}
						}
					}
				}
			} else {
				for (int i_1699_ = 0; i_1699_ < i_1580_; i_1699_++) {
					int i_1700_ = is[i_1699_];
					if (i_1700_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
						int[] is_1701_ = (((Class387_Sub1) this).anIntArrayArray7778[i_1700_]);
						for (int i_1702_ = 0; i_1702_ < is_1701_.length; i_1702_++) {
							int i_1703_ = is_1701_[i_1702_];
							if (((Class387_Sub1) this).aShortArray7816 == null || ((i_1578_ & (((Class387_Sub1) this).aShortArray7816[i_1703_])) != 0)) {
								((Class387_Sub1) this).anIntArray7751[i_1703_] -= ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1703_] -= ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1703_] -= ((Class387_Sub1) this).anInt7781;
								((Class387_Sub1) this).anIntArray7751[i_1703_] = (((Class387_Sub1) this).anIntArray7751[i_1703_]) * i_1575_ / 128;
								((Class387_Sub1) this).anIntArray7752[i_1703_] = (((Class387_Sub1) this).anIntArray7752[i_1703_]) * i_1576_ / 128;
								((Class387_Sub1) this).anIntArray7753[i_1703_] = (((Class387_Sub1) this).anIntArray7753[i_1703_]) * i_1577_ / 128;
								((Class387_Sub1) this).anIntArray7751[i_1703_] += ((Class387_Sub1) this).anInt7782;
								((Class387_Sub1) this).anIntArray7752[i_1703_] += ((Class387_Sub1) this).anInt7783;
								((Class387_Sub1) this).anIntArray7753[i_1703_] += ((Class387_Sub1) this).anInt7781;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null && ((Class387_Sub1) this).aByteArray7773 != null) {
				for (int i_1704_ = 0; i_1704_ < i_1580_; i_1704_++) {
					int i_1705_ = is[i_1704_];
					if (i_1705_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1706_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1705_]);
						for (int i_1707_ = 0; i_1707_ < is_1706_.length; i_1707_++) {
							int i_1708_ = is_1706_[i_1707_];
							if (((Class387_Sub1) this).aShortArray7776 == null || ((i_1578_ & (((Class387_Sub1) this).aShortArray7776[i_1708_])) != 0)) {
								int i_1709_ = (((((Class387_Sub1) this).aByteArray7773[i_1708_]) & 0xff) + i_1575_ * 8);
								if (i_1709_ < 0)
									i_1709_ = 0;
								else if (i_1709_ > 255)
									i_1709_ = 255;
								((Class387_Sub1) this).aByteArray7773[i_1708_] = (byte) i_1709_;
							}
						}
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1710_ = 0; i_1710_ < ((Class387_Sub1) this).anInt7788; i_1710_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1710_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1710_]);
						((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | 255 - ((((Class387_Sub1) this).aByteArray7773[(((Class16) class16).anInt226 * -1295149283)]) & 0xff) << 24) * -564629049;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null) {
				for (int i_1711_ = 0; i_1711_ < i_1580_; i_1711_++) {
					int i_1712_ = is[i_1711_];
					if (i_1712_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1713_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1712_]);
						for (int i_1714_ = 0; i_1714_ < is_1713_.length; i_1714_++) {
							int i_1715_ = is_1713_[i_1714_];
							if (((Class387_Sub1) this).aShortArray7776 == null || ((i_1578_ & (((Class387_Sub1) this).aShortArray7776[i_1715_])) != 0)) {
								int i_1716_ = ((((Class387_Sub1) this).aShortArray7775[i_1715_]) & 0xffff);
								int i_1717_ = i_1716_ >> 10 & 0x3f;
								int i_1718_ = i_1716_ >> 7 & 0x7;
								int i_1719_ = i_1716_ & 0x7f;
								i_1717_ = i_1717_ + i_1575_ & 0x3f;
								i_1718_ += i_1576_;
								if (i_1718_ < 0)
									i_1718_ = 0;
								else if (i_1718_ > 7)
									i_1718_ = 7;
								i_1719_ += i_1577_;
								if (i_1719_ < 0)
									i_1719_ = 0;
								else if (i_1719_ > 127)
									i_1719_ = 127;
								((Class387_Sub1) this).aShortArray7775[i_1715_] = (short) (i_1717_ << 10 | i_1718_ << 7 | i_1719_);
							}
						}
						((Class387_Sub1) this).aBoolean7733 = true;
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1720_ = 0; i_1720_ < ((Class387_Sub1) this).anInt7788; i_1720_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1720_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1720_]);
						((Class18) class18).anInt254 = (((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | (Class379.anIntArray4096[(Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0)) & 0xffff]) & 0xffffff) * -564629049);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1721_ = 0; i_1721_ < i_1580_; i_1721_++) {
					int i_1722_ = is[i_1721_];
					if (i_1722_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1723_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1722_]);
						for (int i_1724_ = 0; i_1724_ < is_1723_.length; i_1724_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1723_[i_1724_]]);
							((Class18) class18).anInt247 += i_1575_ * 1747422061;
							((Class18) class18).anInt244 += i_1576_ * 1370325433;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1725_ = 0; i_1725_ < i_1580_; i_1725_++) {
					int i_1726_ = is[i_1725_];
					if (i_1726_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1727_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1726_]);
						for (int i_1728_ = 0; i_1728_ < is_1727_.length; i_1728_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1727_[i_1728_]]);
							((Class18) class18).aFloat245 = (((Class18) class18).aFloat245 * (float) i_1575_ / 128.0F);
							((Class18) class18).aFloat248 = (((Class18) class18).aFloat248 * (float) i_1576_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1729_ = 0; i_1729_ < i_1580_; i_1729_++) {
					int i_1730_ = is[i_1729_];
					if (i_1730_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1731_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1730_]);
						for (int i_1732_ = 0; i_1732_ < is_1731_.length; i_1732_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1731_[i_1732_]]);
							((Class18) class18).anInt249 = ((((Class18) class18).anInt249 * -988477815 + i_1575_) & 0x3fff) * -839233607;
						}
					}
				}
			}
		}
	}

	public void method4776(Matrix3f class222, int i, boolean bool) {
		if (((Class387_Sub1) this).aShortArray7816 != null) {
			Class15 class15 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread());
			Matrix3f class222_1733_ = ((Class15) class15).aClass222_189;
			class222_1733_.method2070(class222);
			if (bool)
				class222_1733_.method2058();
			Matrix4f class233 = ((Class15) class15).aClass233_194;
			class233.method2145(class222_1733_);
			float[] fs = new float[3];
			for (int i_1734_ = 0; i_1734_ < ((Class387_Sub1) this).anInt7742; i_1734_++) {
				if ((i & ((Class387_Sub1) this).aShortArray7816[i_1734_]) != 0) {
					class233.method2149((float) (((Class387_Sub1) this).anIntArray7751[i_1734_]), (float) (((Class387_Sub1) this).anIntArray7752[i_1734_]), (float) (((Class387_Sub1) this).anIntArray7753[i_1734_]), fs);
					((Class387_Sub1) this).anIntArray7751[i_1734_] = (int) fs[0];
					((Class387_Sub1) this).anIntArray7752[i_1734_] = (int) fs[1];
					((Class387_Sub1) this).anIntArray7753[i_1734_] = (int) fs[2];
				}
			}
		}
	}

	public boolean method4763(int i, int i_1735_, Matrix3f class222, boolean bool, int i_1736_) {
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		Matrix4f class233 = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_194;
		class233.method2145(class222);
		Matrix4f class233_1737_ = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_195;
		class233_1737_.method2142(class233);
		class233_1737_.method2144(((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aClass233_7987);
		boolean bool_1738_ = false;
		int i_1739_ = 2147483647;
		int i_1740_ = -2147483648;
		int i_1741_ = 2147483647;
		int i_1742_ = -2147483648;
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		int i_1743_ = ((((Class387_Sub1) this).aShort7743 - ((Class387_Sub1) this).aShort7797) >> 1);
		int i_1744_ = ((((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770) >> 1);
		int i_1745_ = ((((Class387_Sub1) this).aShort7800 - ((Class387_Sub1) this).aShort7795) >> 1);
		int i_1746_ = ((Class387_Sub1) this).aShort7797 + i_1743_;
		int i_1747_ = ((Class387_Sub1) this).aShort7770 + i_1744_;
		int i_1748_ = ((Class387_Sub1) this).aShort7795 + i_1745_;
		int i_1749_ = i_1746_ - (i_1743_ << i_1736_);
		int i_1750_ = i_1747_ - (i_1744_ << i_1736_);
		int i_1751_ = i_1748_ - (i_1745_ << i_1736_);
		int i_1752_ = i_1746_ + (i_1743_ << i_1736_);
		int i_1753_ = i_1747_ + (i_1744_ << i_1736_);
		int i_1754_ = i_1748_ + (i_1745_ << i_1736_);
		((Class387_Sub1) this).anIntArray7809[0] = i_1749_;
		((Class387_Sub1) this).anIntArray7761[0] = i_1750_;
		((Class387_Sub1) this).anIntArray7811[0] = i_1751_;
		((Class387_Sub1) this).anIntArray7809[1] = i_1752_;
		((Class387_Sub1) this).anIntArray7761[1] = i_1750_;
		((Class387_Sub1) this).anIntArray7811[1] = i_1751_;
		((Class387_Sub1) this).anIntArray7809[2] = i_1749_;
		((Class387_Sub1) this).anIntArray7761[2] = i_1753_;
		((Class387_Sub1) this).anIntArray7811[2] = i_1751_;
		((Class387_Sub1) this).anIntArray7809[3] = i_1752_;
		((Class387_Sub1) this).anIntArray7761[3] = i_1753_;
		((Class387_Sub1) this).anIntArray7811[3] = i_1751_;
		((Class387_Sub1) this).anIntArray7809[4] = i_1749_;
		((Class387_Sub1) this).anIntArray7761[4] = i_1750_;
		((Class387_Sub1) this).anIntArray7811[4] = i_1754_;
		((Class387_Sub1) this).anIntArray7809[5] = i_1752_;
		((Class387_Sub1) this).anIntArray7761[5] = i_1750_;
		((Class387_Sub1) this).anIntArray7811[5] = i_1754_;
		((Class387_Sub1) this).anIntArray7809[6] = i_1749_;
		((Class387_Sub1) this).anIntArray7761[6] = i_1753_;
		((Class387_Sub1) this).anIntArray7811[6] = i_1754_;
		((Class387_Sub1) this).anIntArray7809[7] = i_1752_;
		((Class387_Sub1) this).anIntArray7761[7] = i_1753_;
		((Class387_Sub1) this).anIntArray7811[7] = i_1754_;
		for (int i_1755_ = 0; i_1755_ < 8; i_1755_++) {
			int i_1756_ = ((Class387_Sub1) this).anIntArray7809[i_1755_];
			int i_1757_ = ((Class387_Sub1) this).anIntArray7761[i_1755_];
			int i_1758_ = ((Class387_Sub1) this).anIntArray7811[i_1755_];
			float f = (class233_1737_.aFloatArray2594[2] * (float) i_1756_ + class233_1737_.aFloatArray2594[6] * (float) i_1757_ + class233_1737_.aFloatArray2594[10] * (float) i_1758_ + class233_1737_.aFloatArray2594[14]);
			float f_1759_ = (class233_1737_.aFloatArray2594[3] * (float) i_1756_ + class233_1737_.aFloatArray2594[7] * (float) i_1757_ + class233_1737_.aFloatArray2594[11] * (float) i_1758_ + class233_1737_.aFloatArray2594[15]);
			if (f >= -f_1759_) {
				float f_1760_ = (class233_1737_.aFloatArray2594[0] * (float) i_1756_ + class233_1737_.aFloatArray2594[4] * (float) i_1757_ + class233_1737_.aFloatArray2594[8] * (float) i_1758_ + class233_1737_.aFloatArray2594[12]);
				float f_1761_ = (class233_1737_.aFloatArray2594[1] * (float) i_1756_ + class233_1737_.aFloatArray2594[5] * (float) i_1757_ + class233_1737_.aFloatArray2594[9] * (float) i_1758_ + class233_1737_.aFloatArray2594[13]);
				int i_1762_ = (int) ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat8005) + (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7993) * f_1760_ / f_1759_);
				int i_1763_ = (int) ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7996) + (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7995) * f_1761_ / f_1759_);
				if (i_1762_ < i_1739_)
					i_1739_ = i_1762_;
				if (i_1762_ > i_1740_)
					i_1740_ = i_1762_;
				if (i_1763_ < i_1741_)
					i_1741_ = i_1763_;
				if (i_1763_ > i_1742_)
					i_1742_ = i_1763_;
				bool_1738_ = true;
			}
		}
		if (bool_1738_ && i > i_1739_ && i < i_1740_ && i_1735_ > i_1741_ && i_1735_ < i_1742_) {
			if (bool)
				return true;
			for (int i_1764_ = 0; i_1764_ < ((Class387_Sub1) this).anInt7799; i_1764_++) {
				int i_1765_ = ((Class387_Sub1) this).anIntArray7751[i_1764_];
				int i_1766_ = ((Class387_Sub1) this).anIntArray7752[i_1764_];
				int i_1767_ = ((Class387_Sub1) this).anIntArray7753[i_1764_];
				float f = (class233_1737_.aFloatArray2594[2] * (float) i_1765_ + class233_1737_.aFloatArray2594[6] * (float) i_1766_ + class233_1737_.aFloatArray2594[10] * (float) i_1767_ + class233_1737_.aFloatArray2594[14]);
				float f_1768_ = (class233_1737_.aFloatArray2594[3] * (float) i_1765_ + class233_1737_.aFloatArray2594[7] * (float) i_1766_ + class233_1737_.aFloatArray2594[11] * (float) i_1767_ + class233_1737_.aFloatArray2594[15]);
				if (f >= -f_1768_) {
					float f_1769_ = (class233_1737_.aFloatArray2594[0] * (float) i_1765_ + (class233_1737_.aFloatArray2594[4] * (float) i_1766_) + (class233_1737_.aFloatArray2594[8] * (float) i_1767_) + class233_1737_.aFloatArray2594[12]);
					float f_1770_ = (class233_1737_.aFloatArray2594[1] * (float) i_1765_ + (class233_1737_.aFloatArray2594[5] * (float) i_1766_) + (class233_1737_.aFloatArray2594[9] * (float) i_1767_) + class233_1737_.aFloatArray2594[13]);
					((Class387_Sub1) this).aFloatArray7784[i_1764_] = (float) (int) (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat8005 + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993 * f_1769_ / f_1768_));
					((Class387_Sub1) this).aFloatArray7806[i_1764_] = (float) (int) (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7996 + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7995 * f_1770_ / f_1768_));
				} else
					((Class387_Sub1) this).aFloatArray7784[i_1764_] = -999999.0F;
			}
			for (int i_1771_ = 0; i_1771_ < ((Class387_Sub1) this).anInt7757; i_1771_++) {
				if (((((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7758[i_1771_]]) != -999999.0F)
						&& ((((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7759[i_1771_]]) != -999999.0F)
						&& ((((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7760[i_1771_]]) != -999999.0F)
						&& (method4801(i, i_1735_, (((Class387_Sub1) this).aFloatArray7806[((Class387_Sub1) this).aShortArray7758[i_1771_]]), (((Class387_Sub1) this).aFloatArray7806[((Class387_Sub1) this).aShortArray7759[i_1771_]]), (((Class387_Sub1) this).aFloatArray7806[((Class387_Sub1) this).aShortArray7760[i_1771_]]), (((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7758[i_1771_]]),
								(((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7759[i_1771_]]), (((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7760[i_1771_]]))))
					return true;
			}
		}
		return false;
	}

	public void method4740(Matrix3f class222, Class302_Sub1 class302_sub1, int i) {
		method4811(class222, class302_sub1, i);
	}

	final void method4813(boolean bool, boolean bool_1772_, boolean bool_1773_, boolean bool_1774_, boolean bool_1775_) {
		if (((Class387_Sub1) this).aClass16Array7789 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7788; i++) {
				Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i];
				((Class387_Sub1) this).anIntArray7814[((Class16) class16).anInt226 * -1295149283] = i;
			}
		}
		if (((Class387_Sub1) this).aBoolean7756 || ((Class387_Sub1) this).aClass16Array7789 != null) {
			if ((((Class387_Sub1) this).anInt7746 & 0x100) == 0 && ((Class387_Sub1) this).aShortArray7803 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
					short i_1776_ = ((Class387_Sub1) this).aShortArray7803[i];
					method4803(bool, bool_1772_, bool_1773_, i_1776_, bool_1774_, bool_1775_);
				}
			} else {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
					if (!method4802(i) && !method4816(i))
						method4803(bool, bool_1772_, bool_1773_, i, bool_1774_, bool_1775_);
				}
				if (((Class387_Sub1) this).aByteArray7772 == null) {
					for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
						if (method4802(i) || method4816(i))
							method4803(bool, bool_1772_, bool_1773_, i, bool_1774_, bool_1775_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_1777_ = 0; i_1777_ < ((Class387_Sub1) this).anInt7757; i_1777_++) {
							if ((((Class387_Sub1) this).aByteArray7772[i_1777_] == i) && (method4802(i_1777_) || method4816(i_1777_)))
								method4803(bool, bool_1772_, bool_1773_, i_1777_, bool_1774_, bool_1775_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++)
				method4803(bool, bool_1772_, bool_1773_, i, bool_1774_, bool_1775_);
		}
	}

	void method4814() {
		if (((Class387_Sub1) this).anInt7812 == 0 && ((Class387_Sub1) this).aClass1Array7755 == null) {
			do {
				if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999 * -922307687) > 1) {
					synchronized (this) {
						method4808();
						break;
					}
				}
				method4808();
			} while (false);
		}
	}

	public boolean method4746(int i, int i_1778_, Matrix3f class222, boolean bool, int i_1779_) {
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		Matrix4f class233 = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_194;
		class233.method2145(class222);
		Matrix4f class233_1780_ = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_195;
		class233_1780_.method2142(class233);
		class233_1780_.method2144(((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aClass233_7987);
		boolean bool_1781_ = false;
		int i_1782_ = 2147483647;
		int i_1783_ = -2147483648;
		int i_1784_ = 2147483647;
		int i_1785_ = -2147483648;
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		int i_1786_ = ((((Class387_Sub1) this).aShort7743 - ((Class387_Sub1) this).aShort7797) >> 1);
		int i_1787_ = ((((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770) >> 1);
		int i_1788_ = ((((Class387_Sub1) this).aShort7800 - ((Class387_Sub1) this).aShort7795) >> 1);
		int i_1789_ = ((Class387_Sub1) this).aShort7797 + i_1786_;
		int i_1790_ = ((Class387_Sub1) this).aShort7770 + i_1787_;
		int i_1791_ = ((Class387_Sub1) this).aShort7795 + i_1788_;
		int i_1792_ = i_1789_ - (i_1786_ << i_1779_);
		int i_1793_ = i_1790_ - (i_1787_ << i_1779_);
		int i_1794_ = i_1791_ - (i_1788_ << i_1779_);
		int i_1795_ = i_1789_ + (i_1786_ << i_1779_);
		int i_1796_ = i_1790_ + (i_1787_ << i_1779_);
		int i_1797_ = i_1791_ + (i_1788_ << i_1779_);
		((Class387_Sub1) this).anIntArray7809[0] = i_1792_;
		((Class387_Sub1) this).anIntArray7761[0] = i_1793_;
		((Class387_Sub1) this).anIntArray7811[0] = i_1794_;
		((Class387_Sub1) this).anIntArray7809[1] = i_1795_;
		((Class387_Sub1) this).anIntArray7761[1] = i_1793_;
		((Class387_Sub1) this).anIntArray7811[1] = i_1794_;
		((Class387_Sub1) this).anIntArray7809[2] = i_1792_;
		((Class387_Sub1) this).anIntArray7761[2] = i_1796_;
		((Class387_Sub1) this).anIntArray7811[2] = i_1794_;
		((Class387_Sub1) this).anIntArray7809[3] = i_1795_;
		((Class387_Sub1) this).anIntArray7761[3] = i_1796_;
		((Class387_Sub1) this).anIntArray7811[3] = i_1794_;
		((Class387_Sub1) this).anIntArray7809[4] = i_1792_;
		((Class387_Sub1) this).anIntArray7761[4] = i_1793_;
		((Class387_Sub1) this).anIntArray7811[4] = i_1797_;
		((Class387_Sub1) this).anIntArray7809[5] = i_1795_;
		((Class387_Sub1) this).anIntArray7761[5] = i_1793_;
		((Class387_Sub1) this).anIntArray7811[5] = i_1797_;
		((Class387_Sub1) this).anIntArray7809[6] = i_1792_;
		((Class387_Sub1) this).anIntArray7761[6] = i_1796_;
		((Class387_Sub1) this).anIntArray7811[6] = i_1797_;
		((Class387_Sub1) this).anIntArray7809[7] = i_1795_;
		((Class387_Sub1) this).anIntArray7761[7] = i_1796_;
		((Class387_Sub1) this).anIntArray7811[7] = i_1797_;
		for (int i_1798_ = 0; i_1798_ < 8; i_1798_++) {
			int i_1799_ = ((Class387_Sub1) this).anIntArray7809[i_1798_];
			int i_1800_ = ((Class387_Sub1) this).anIntArray7761[i_1798_];
			int i_1801_ = ((Class387_Sub1) this).anIntArray7811[i_1798_];
			float f = (class233_1780_.aFloatArray2594[2] * (float) i_1799_ + class233_1780_.aFloatArray2594[6] * (float) i_1800_ + class233_1780_.aFloatArray2594[10] * (float) i_1801_ + class233_1780_.aFloatArray2594[14]);
			float f_1802_ = (class233_1780_.aFloatArray2594[3] * (float) i_1799_ + class233_1780_.aFloatArray2594[7] * (float) i_1800_ + class233_1780_.aFloatArray2594[11] * (float) i_1801_ + class233_1780_.aFloatArray2594[15]);
			if (f >= -f_1802_) {
				float f_1803_ = (class233_1780_.aFloatArray2594[0] * (float) i_1799_ + class233_1780_.aFloatArray2594[4] * (float) i_1800_ + class233_1780_.aFloatArray2594[8] * (float) i_1801_ + class233_1780_.aFloatArray2594[12]);
				float f_1804_ = (class233_1780_.aFloatArray2594[1] * (float) i_1799_ + class233_1780_.aFloatArray2594[5] * (float) i_1800_ + class233_1780_.aFloatArray2594[9] * (float) i_1801_ + class233_1780_.aFloatArray2594[13]);
				int i_1805_ = (int) ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat8005) + (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7993) * f_1803_ / f_1802_);
				int i_1806_ = (int) ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7996) + (((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).aFloat7995) * f_1804_ / f_1802_);
				if (i_1805_ < i_1782_)
					i_1782_ = i_1805_;
				if (i_1805_ > i_1783_)
					i_1783_ = i_1805_;
				if (i_1806_ < i_1784_)
					i_1784_ = i_1806_;
				if (i_1806_ > i_1785_)
					i_1785_ = i_1806_;
				bool_1781_ = true;
			}
		}
		if (bool_1781_ && i > i_1782_ && i < i_1783_ && i_1778_ > i_1784_ && i_1778_ < i_1785_) {
			if (bool)
				return true;
			for (int i_1807_ = 0; i_1807_ < ((Class387_Sub1) this).anInt7799; i_1807_++) {
				int i_1808_ = ((Class387_Sub1) this).anIntArray7751[i_1807_];
				int i_1809_ = ((Class387_Sub1) this).anIntArray7752[i_1807_];
				int i_1810_ = ((Class387_Sub1) this).anIntArray7753[i_1807_];
				float f = (class233_1780_.aFloatArray2594[2] * (float) i_1808_ + class233_1780_.aFloatArray2594[6] * (float) i_1809_ + class233_1780_.aFloatArray2594[10] * (float) i_1810_ + class233_1780_.aFloatArray2594[14]);
				float f_1811_ = (class233_1780_.aFloatArray2594[3] * (float) i_1808_ + class233_1780_.aFloatArray2594[7] * (float) i_1809_ + class233_1780_.aFloatArray2594[11] * (float) i_1810_ + class233_1780_.aFloatArray2594[15]);
				if (f >= -f_1811_) {
					float f_1812_ = (class233_1780_.aFloatArray2594[0] * (float) i_1808_ + (class233_1780_.aFloatArray2594[4] * (float) i_1809_) + (class233_1780_.aFloatArray2594[8] * (float) i_1810_) + class233_1780_.aFloatArray2594[12]);
					float f_1813_ = (class233_1780_.aFloatArray2594[1] * (float) i_1808_ + (class233_1780_.aFloatArray2594[5] * (float) i_1809_) + (class233_1780_.aFloatArray2594[9] * (float) i_1810_) + class233_1780_.aFloatArray2594[13]);
					((Class387_Sub1) this).aFloatArray7784[i_1807_] = (float) (int) (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat8005 + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7993 * f_1812_ / f_1811_));
					((Class387_Sub1) this).aFloatArray7806[i_1807_] = (float) (int) (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7996 + (((Class_ra_Sub1) (((Class387_Sub1) this).aClass_ra_Sub1_7769)).aFloat7995 * f_1813_ / f_1811_));
				} else
					((Class387_Sub1) this).aFloatArray7784[i_1807_] = -999999.0F;
			}
			for (int i_1814_ = 0; i_1814_ < ((Class387_Sub1) this).anInt7757; i_1814_++) {
				if (((((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7758[i_1814_]]) != -999999.0F)
						&& ((((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7759[i_1814_]]) != -999999.0F)
						&& ((((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7760[i_1814_]]) != -999999.0F)
						&& (method4801(i, i_1778_, (((Class387_Sub1) this).aFloatArray7806[((Class387_Sub1) this).aShortArray7758[i_1814_]]), (((Class387_Sub1) this).aFloatArray7806[((Class387_Sub1) this).aShortArray7759[i_1814_]]), (((Class387_Sub1) this).aFloatArray7806[((Class387_Sub1) this).aShortArray7760[i_1814_]]), (((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7758[i_1814_]]),
								(((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7759[i_1814_]]), (((Class387_Sub1) this).aFloatArray7784[((Class387_Sub1) this).aShortArray7760[i_1814_]]))))
					return true;
			}
		}
		return false;
	}

	public boolean method4777() {
		if (((Class387_Sub1) this).aShortArray7774 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub1) this).aShortArray7774.length; i++) {
			if (((Class387_Sub1) this).aShortArray7774[i] != -1 && !((Class387_Sub1) this).aClass_ra_Sub1_7769.method5200(((Class387_Sub1) this).aShortArray7774[i]))
				return false;
		}
		return true;
	}

	public Class_na cc(Class_na class_na) {
		return null;
	}

	public int c() {
		return ((Class387_Sub1) this).anInt7747;
	}

	void method4760(int i, int[] is, int i_1815_, int i_1816_, int i_1817_, int i_1818_, boolean bool) {
		int i_1819_ = is.length;
		if (i == 0) {
			i_1815_ <<= 4;
			i_1816_ <<= 4;
			i_1817_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1820_ = 0; i_1820_ < ((Class387_Sub1) this).anInt7799; i_1820_++) {
					((Class387_Sub1) this).anIntArray7751[i_1820_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1820_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1820_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			int i_1821_ = 0;
			((Class387_Sub1) this).anInt7782 = 0;
			((Class387_Sub1) this).anInt7783 = 0;
			((Class387_Sub1) this).anInt7781 = 0;
			for (int i_1822_ = 0; i_1822_ < i_1819_; i_1822_++) {
				int i_1823_ = is[i_1822_];
				if (i_1823_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1824_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1823_];
					for (int i_1825_ = 0; i_1825_ < is_1824_.length; i_1825_++) {
						int i_1826_ = is_1824_[i_1825_];
						((Class387_Sub1) this).anInt7782 += ((Class387_Sub1) this).anIntArray7751[i_1826_];
						((Class387_Sub1) this).anInt7783 += ((Class387_Sub1) this).anIntArray7752[i_1826_];
						((Class387_Sub1) this).anInt7781 += ((Class387_Sub1) this).anIntArray7753[i_1826_];
						i_1821_++;
					}
				}
			}
			if (i_1821_ > 0) {
				((Class387_Sub1) this).anInt7782 = ((Class387_Sub1) this).anInt7782 / i_1821_ + i_1815_;
				((Class387_Sub1) this).anInt7783 = ((Class387_Sub1) this).anInt7783 / i_1821_ + i_1816_;
				((Class387_Sub1) this).anInt7781 = ((Class387_Sub1) this).anInt7781 / i_1821_ + i_1817_;
			} else {
				((Class387_Sub1) this).anInt7782 = i_1815_;
				((Class387_Sub1) this).anInt7783 = i_1816_;
				((Class387_Sub1) this).anInt7781 = i_1817_;
			}
		} else if (i == 1) {
			i_1815_ <<= 4;
			i_1816_ <<= 4;
			i_1817_ <<= 4;
			if (!((Class387_Sub1) this).aBoolean7780) {
				for (int i_1827_ = 0; i_1827_ < ((Class387_Sub1) this).anInt7799; i_1827_++) {
					((Class387_Sub1) this).anIntArray7751[i_1827_] <<= 4;
					((Class387_Sub1) this).anIntArray7752[i_1827_] <<= 4;
					((Class387_Sub1) this).anIntArray7753[i_1827_] <<= 4;
				}
				((Class387_Sub1) this).aBoolean7780 = true;
			}
			for (int i_1828_ = 0; i_1828_ < i_1819_; i_1828_++) {
				int i_1829_ = is[i_1828_];
				if (i_1829_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1830_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1829_];
					for (int i_1831_ = 0; i_1831_ < is_1830_.length; i_1831_++) {
						int i_1832_ = is_1830_[i_1831_];
						((Class387_Sub1) this).anIntArray7751[i_1832_] += i_1815_;
						((Class387_Sub1) this).anIntArray7752[i_1832_] += i_1816_;
						((Class387_Sub1) this).anIntArray7753[i_1832_] += i_1817_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1833_ = 0; i_1833_ < i_1819_; i_1833_++) {
				int i_1834_ = is[i_1833_];
				if (i_1834_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1835_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1834_];
					if ((i_1818_ & 0x1) == 0) {
						for (int i_1836_ = 0; i_1836_ < is_1835_.length; i_1836_++) {
							int i_1837_ = is_1835_[i_1836_];
							((Class387_Sub1) this).anIntArray7751[i_1837_] -= ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_1837_] -= ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_1837_] -= ((Class387_Sub1) this).anInt7781;
							if (i_1817_ != 0) {
								int i_1838_ = Class220.anIntArray2483[i_1817_];
								int i_1839_ = Class220.anIntArray2474[i_1817_];
								int i_1840_ = (((((Class387_Sub1) this).anIntArray7752[i_1837_]) * i_1838_ + (((Class387_Sub1) this).anIntArray7751[i_1837_]) * i_1839_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7752[i_1837_] = ((((Class387_Sub1) this).anIntArray7752[i_1837_]) * i_1839_ - (((Class387_Sub1) this).anIntArray7751[i_1837_]) * i_1838_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_1837_] = i_1840_;
							}
							if (i_1815_ != 0) {
								int i_1841_ = Class220.anIntArray2483[i_1815_];
								int i_1842_ = Class220.anIntArray2474[i_1815_];
								int i_1843_ = (((((Class387_Sub1) this).anIntArray7752[i_1837_]) * i_1842_ - (((Class387_Sub1) this).anIntArray7753[i_1837_]) * i_1841_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_1837_] = ((((Class387_Sub1) this).anIntArray7752[i_1837_]) * i_1841_ + (((Class387_Sub1) this).anIntArray7753[i_1837_]) * i_1842_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7752[i_1837_] = i_1843_;
							}
							if (i_1816_ != 0) {
								int i_1844_ = Class220.anIntArray2483[i_1816_];
								int i_1845_ = Class220.anIntArray2474[i_1816_];
								int i_1846_ = (((((Class387_Sub1) this).anIntArray7753[i_1837_]) * i_1844_ + (((Class387_Sub1) this).anIntArray7751[i_1837_]) * i_1845_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_1837_] = ((((Class387_Sub1) this).anIntArray7753[i_1837_]) * i_1845_ - (((Class387_Sub1) this).anIntArray7751[i_1837_]) * i_1844_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_1837_] = i_1846_;
							}
							((Class387_Sub1) this).anIntArray7751[i_1837_] += ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_1837_] += ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_1837_] += ((Class387_Sub1) this).anInt7781;
						}
					} else {
						for (int i_1847_ = 0; i_1847_ < is_1835_.length; i_1847_++) {
							int i_1848_ = is_1835_[i_1847_];
							((Class387_Sub1) this).anIntArray7751[i_1848_] -= ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_1848_] -= ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_1848_] -= ((Class387_Sub1) this).anInt7781;
							if (i_1815_ != 0) {
								int i_1849_ = Class220.anIntArray2483[i_1815_];
								int i_1850_ = Class220.anIntArray2474[i_1815_];
								int i_1851_ = (((((Class387_Sub1) this).anIntArray7752[i_1848_]) * i_1850_ - (((Class387_Sub1) this).anIntArray7753[i_1848_]) * i_1849_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_1848_] = ((((Class387_Sub1) this).anIntArray7752[i_1848_]) * i_1849_ + (((Class387_Sub1) this).anIntArray7753[i_1848_]) * i_1850_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7752[i_1848_] = i_1851_;
							}
							if (i_1817_ != 0) {
								int i_1852_ = Class220.anIntArray2483[i_1817_];
								int i_1853_ = Class220.anIntArray2474[i_1817_];
								int i_1854_ = (((((Class387_Sub1) this).anIntArray7752[i_1848_]) * i_1852_ + (((Class387_Sub1) this).anIntArray7751[i_1848_]) * i_1853_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7752[i_1848_] = ((((Class387_Sub1) this).anIntArray7752[i_1848_]) * i_1853_ - (((Class387_Sub1) this).anIntArray7751[i_1848_]) * i_1852_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_1848_] = i_1854_;
							}
							if (i_1816_ != 0) {
								int i_1855_ = Class220.anIntArray2483[i_1816_];
								int i_1856_ = Class220.anIntArray2474[i_1816_];
								int i_1857_ = (((((Class387_Sub1) this).anIntArray7753[i_1848_]) * i_1855_ + (((Class387_Sub1) this).anIntArray7751[i_1848_]) * i_1856_ + 16383) >> 14);
								((Class387_Sub1) this).anIntArray7753[i_1848_] = ((((Class387_Sub1) this).anIntArray7753[i_1848_]) * i_1856_ - (((Class387_Sub1) this).anIntArray7751[i_1848_]) * i_1855_ + 16383) >> 14;
								((Class387_Sub1) this).anIntArray7751[i_1848_] = i_1857_;
							}
							((Class387_Sub1) this).anIntArray7751[i_1848_] += ((Class387_Sub1) this).anInt7782;
							((Class387_Sub1) this).anIntArray7752[i_1848_] += ((Class387_Sub1) this).anInt7783;
							((Class387_Sub1) this).anIntArray7753[i_1848_] += ((Class387_Sub1) this).anInt7781;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1858_ = 0; i_1858_ < i_1819_; i_1858_++) {
				int i_1859_ = is[i_1858_];
				if (i_1859_ < ((Class387_Sub1) this).anIntArrayArray7778.length) {
					int[] is_1860_ = ((Class387_Sub1) this).anIntArrayArray7778[i_1859_];
					for (int i_1861_ = 0; i_1861_ < is_1860_.length; i_1861_++) {
						int i_1862_ = is_1860_[i_1861_];
						((Class387_Sub1) this).anIntArray7751[i_1862_] -= ((Class387_Sub1) this).anInt7782;
						((Class387_Sub1) this).anIntArray7752[i_1862_] -= ((Class387_Sub1) this).anInt7783;
						((Class387_Sub1) this).anIntArray7753[i_1862_] -= ((Class387_Sub1) this).anInt7781;
						((Class387_Sub1) this).anIntArray7751[i_1862_] = (((Class387_Sub1) this).anIntArray7751[i_1862_] * i_1815_ / 128);
						((Class387_Sub1) this).anIntArray7752[i_1862_] = (((Class387_Sub1) this).anIntArray7752[i_1862_] * i_1816_ / 128);
						((Class387_Sub1) this).anIntArray7753[i_1862_] = (((Class387_Sub1) this).anIntArray7753[i_1862_] * i_1817_ / 128);
						((Class387_Sub1) this).anIntArray7751[i_1862_] += ((Class387_Sub1) this).anInt7782;
						((Class387_Sub1) this).anIntArray7752[i_1862_] += ((Class387_Sub1) this).anInt7783;
						((Class387_Sub1) this).anIntArray7753[i_1862_] += ((Class387_Sub1) this).anInt7781;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null && ((Class387_Sub1) this).aByteArray7773 != null) {
				for (int i_1863_ = 0; i_1863_ < i_1819_; i_1863_++) {
					int i_1864_ = is[i_1863_];
					if (i_1864_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1865_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1864_]);
						for (int i_1866_ = 0; i_1866_ < is_1865_.length; i_1866_++) {
							int i_1867_ = is_1865_[i_1866_];
							int i_1868_ = (((((Class387_Sub1) this).aByteArray7773[i_1867_]) & 0xff) + i_1815_ * 8);
							if (i_1868_ < 0)
								i_1868_ = 0;
							else if (i_1868_ > 255)
								i_1868_ = 255;
							((Class387_Sub1) this).aByteArray7773[i_1867_] = (byte) i_1868_;
						}
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1869_ = 0; i_1869_ < ((Class387_Sub1) this).anInt7788; i_1869_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1869_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1869_]);
						((Class18) class18).anInt254 = ((((Class18) class18).anInt254 * -1509687305 & 0xffffff) | 255 - ((((Class387_Sub1) this).aByteArray7773[(((Class16) class16).anInt226 * -1295149283)]) & 0xff) << 24) * -564629049;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub1) this).anIntArrayArray7779 != null) {
				for (int i_1870_ = 0; i_1870_ < i_1819_; i_1870_++) {
					int i_1871_ = is[i_1870_];
					if (i_1871_ < ((Class387_Sub1) this).anIntArrayArray7779.length) {
						int[] is_1872_ = (((Class387_Sub1) this).anIntArrayArray7779[i_1871_]);
						for (int i_1873_ = 0; i_1873_ < is_1872_.length; i_1873_++) {
							int i_1874_ = is_1872_[i_1873_];
							int i_1875_ = ((((Class387_Sub1) this).aShortArray7775[i_1874_]) & 0xffff);
							int i_1876_ = i_1875_ >> 10 & 0x3f;
							int i_1877_ = i_1875_ >> 7 & 0x7;
							int i_1878_ = i_1875_ & 0x7f;
							i_1876_ = i_1876_ + i_1815_ & 0x3f;
							i_1877_ += i_1816_;
							if (i_1877_ < 0)
								i_1877_ = 0;
							else if (i_1877_ > 7)
								i_1877_ = 7;
							i_1878_ += i_1817_;
							if (i_1878_ < 0)
								i_1878_ = 0;
							else if (i_1878_ > 127)
								i_1878_ = 127;
							((Class387_Sub1) this).aShortArray7775[i_1874_] = (short) (i_1876_ << 10 | i_1877_ << 7 | i_1878_);
						}
						((Class387_Sub1) this).aBoolean7733 = true;
					}
				}
				if (((Class387_Sub1) this).aClass16Array7789 != null) {
					for (int i_1879_ = 0; i_1879_ < ((Class387_Sub1) this).anInt7788; i_1879_++) {
						Class16 class16 = (((Class387_Sub1) this).aClass16Array7789[i_1879_]);
						Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[i_1879_]);
						((Class18) class18).anInt254 = (((((Class18) class18).anInt254 * -1509687305 & ~0xffffff) | (Class379.anIntArray4096[(Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0)) & 0xffff]) & 0xffffff) * -564629049);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1880_ = 0; i_1880_ < i_1819_; i_1880_++) {
					int i_1881_ = is[i_1880_];
					if (i_1881_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1882_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1881_]);
						for (int i_1883_ = 0; i_1883_ < is_1882_.length; i_1883_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1882_[i_1883_]]);
							((Class18) class18).anInt247 += i_1815_ * 1747422061;
							((Class18) class18).anInt244 += i_1816_ * 1370325433;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1884_ = 0; i_1884_ < i_1819_; i_1884_++) {
					int i_1885_ = is[i_1884_];
					if (i_1885_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1886_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1885_]);
						for (int i_1887_ = 0; i_1887_ < is_1886_.length; i_1887_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1886_[i_1887_]]);
							((Class18) class18).aFloat245 = (((Class18) class18).aFloat245 * (float) i_1815_ / 128.0F);
							((Class18) class18).aFloat248 = (((Class18) class18).aFloat248 * (float) i_1816_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub1) this).anIntArrayArray7791 != null) {
				for (int i_1888_ = 0; i_1888_ < i_1819_; i_1888_++) {
					int i_1889_ = is[i_1888_];
					if (i_1889_ < ((Class387_Sub1) this).anIntArrayArray7791.length) {
						int[] is_1890_ = (((Class387_Sub1) this).anIntArrayArray7791[i_1889_]);
						for (int i_1891_ = 0; i_1891_ < is_1890_.length; i_1891_++) {
							Class18 class18 = (((Class387_Sub1) this).aClass18Array7790[is_1890_[i_1891_]]);
							((Class18) class18).anInt249 = ((((Class18) class18).anInt249 * -988477815 + i_1815_) & 0x3fff) * -839233607;
						}
					}
				}
			}
		}
	}

	public int ci() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7794;
	}

	public int ce() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7794;
	}

	public int cb() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7794;
	}

	public int cr() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7797;
	}

	public void dc(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x2000) != 8192)
			throw new IllegalStateException();
		((Class387_Sub1) this).anInt7748 = i;
		((Class387_Sub1) this).anInt7812 = 0;
	}

	public void bg(int i, int i_1892_, Class_xa class_xa, Class_xa class_xa_1893_, int i_1894_, int i_1895_, int i_1896_) {
		if (i == 3) {
			if ((((Class387_Sub1) this).anInt7746 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((((Class387_Sub1) this).anInt7746 & 0x2) != 2)
			throw new IllegalStateException();
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		int i_1897_ = i_1894_ + ((Class387_Sub1) this).aShort7797;
		int i_1898_ = i_1894_ + ((Class387_Sub1) this).aShort7743;
		int i_1899_ = i_1896_ + ((Class387_Sub1) this).aShort7795;
		int i_1900_ = i_1896_ + ((Class387_Sub1) this).aShort7800;
		if (i == 4 || (i_1897_ >= 0 && ((i_1898_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_1899_ >= 0 && ((i_1900_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			int[][] is = class_xa.anIntArrayArray6290;
			int[][] is_1901_ = null;
			if (class_xa_1893_ != null)
				is_1901_ = class_xa_1893_.anIntArrayArray6290;
			if (i == 4 || i == 5) {
				if (class_xa_1893_ == null || (i_1897_ < 0 || ((i_1898_ + class_xa_1893_.anInt6288 * -1212653763 >> class_xa_1893_.anInt6289 * -2137349879) >= class_xa_1893_.anInt6287 * -506105871) || i_1899_ < 0 || ((i_1900_ + class_xa_1893_.anInt6288 * -1212653763 >> class_xa_1893_.anInt6289 * -2137349879) >= class_xa_1893_.anInt6286 * -1148794921)))
					return;
			} else {
				i_1897_ >>= class_xa.anInt6289 * -2137349879;
				i_1898_ = (i_1898_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_1899_ >>= class_xa.anInt6289 * -2137349879;
				i_1900_ = (i_1900_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (is[i_1897_][i_1899_] == i_1895_ && is[i_1898_][i_1899_] == i_1895_ && is[i_1897_][i_1900_] == i_1895_ && is[i_1898_][i_1900_] == i_1895_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1902_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_1903_ = 0; i_1903_ < ((Class387_Sub1) this).anInt7742; i_1903_++) {
						int i_1904_ = (((Class387_Sub1) this).anIntArray7751[i_1903_] + i_1894_);
						int i_1905_ = (((Class387_Sub1) this).anIntArray7753[i_1903_] + i_1896_);
						int i_1906_ = i_1904_ & i_1902_;
						int i_1907_ = i_1905_ & i_1902_;
						int i_1908_ = i_1904_ >> class_xa.anInt6289 * -2137349879;
						int i_1909_ = i_1905_ >> class_xa.anInt6289 * -2137349879;
						int i_1910_ = (((is[i_1908_][i_1909_] * (class_xa.anInt6288 * -1212653763 - i_1906_)) + is[i_1908_ + 1][i_1909_] * i_1906_) >> class_xa.anInt6289 * -2137349879);
						int i_1911_ = (((is[i_1908_][i_1909_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1906_)) + is[i_1908_ + 1][i_1909_ + 1] * i_1906_) >> class_xa.anInt6289 * -2137349879);
						int i_1912_ = (i_1910_ * (class_xa.anInt6288 * -1212653763 - i_1907_) + i_1911_ * i_1907_ >> class_xa.anInt6289 * -2137349879);
						((Class387_Sub1) this).anIntArray7752[i_1903_] = (((Class387_Sub1) this).anIntArray7752[i_1903_] + i_1912_ - i_1895_);
					}
					for (int i_1913_ = ((Class387_Sub1) this).anInt7742; i_1913_ < ((Class387_Sub1) this).anInt7799; i_1913_++) {
						int i_1914_ = (((Class387_Sub1) this).anIntArray7751[i_1913_] + i_1894_);
						int i_1915_ = (((Class387_Sub1) this).anIntArray7753[i_1913_] + i_1896_);
						int i_1916_ = i_1914_ & i_1902_;
						int i_1917_ = i_1915_ & i_1902_;
						int i_1918_ = i_1914_ >> class_xa.anInt6289 * -2137349879;
						int i_1919_ = i_1915_ >> class_xa.anInt6289 * -2137349879;
						if (i_1918_ >= 0 && i_1918_ < is.length - 1 && i_1919_ >= 0 && i_1919_ < is[0].length - 1) {
							int i_1920_ = (((is[i_1918_][i_1919_] * (class_xa.anInt6288 * -1212653763 - i_1916_)) + is[i_1918_ + 1][i_1919_] * i_1916_) >> class_xa.anInt6289 * -2137349879);
							int i_1921_ = (((is[i_1918_][i_1919_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1916_)) + is[i_1918_ + 1][i_1919_ + 1] * i_1916_) >> class_xa.anInt6289 * -2137349879);
							int i_1922_ = (i_1920_ * (class_xa.anInt6288 * -1212653763 - i_1917_) + i_1921_ * i_1917_ >> class_xa.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_1913_] = (((Class387_Sub1) this).anIntArray7752[i_1913_]) + i_1922_ - i_1895_;
						}
					}
				} else if (i == 2) {
					int i_1923_ = class_xa.anInt6288 * -1212653763 - 1;
					for (int i_1924_ = 0; i_1924_ < ((Class387_Sub1) this).anInt7742; i_1924_++) {
						int i_1925_ = ((((Class387_Sub1) this).anIntArray7752[i_1924_] << 16) / ((Class387_Sub1) this).aShort7770);
						if (i_1925_ < i_1892_) {
							int i_1926_ = ((((Class387_Sub1) this).anIntArray7751[i_1924_]) + i_1894_);
							int i_1927_ = ((((Class387_Sub1) this).anIntArray7753[i_1924_]) + i_1896_);
							int i_1928_ = i_1926_ & i_1923_;
							int i_1929_ = i_1927_ & i_1923_;
							int i_1930_ = i_1926_ >> class_xa.anInt6289 * -2137349879;
							int i_1931_ = i_1927_ >> class_xa.anInt6289 * -2137349879;
							int i_1932_ = (((is[i_1930_][i_1931_] * (class_xa.anInt6288 * -1212653763 - i_1928_)) + is[i_1930_ + 1][i_1931_] * i_1928_) >> class_xa.anInt6289 * -2137349879);
							int i_1933_ = (((is[i_1930_][i_1931_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1928_)) + is[i_1930_ + 1][i_1931_ + 1] * i_1928_) >> class_xa.anInt6289 * -2137349879);
							int i_1934_ = (i_1932_ * (class_xa.anInt6288 * -1212653763 - i_1929_) + i_1933_ * i_1929_ >> class_xa.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_1924_] = ((((Class387_Sub1) this).anIntArray7752[i_1924_]) + ((i_1934_ - i_1895_) * (i_1892_ - i_1925_) / i_1892_));
						} else
							((Class387_Sub1) this).anIntArray7752[i_1924_] = (((Class387_Sub1) this).anIntArray7752[i_1924_]);
					}
					for (int i_1935_ = ((Class387_Sub1) this).anInt7742; i_1935_ < ((Class387_Sub1) this).anInt7799; i_1935_++) {
						int i_1936_ = ((((Class387_Sub1) this).anIntArray7752[i_1935_] << 16) / ((Class387_Sub1) this).aShort7770);
						if (i_1936_ < i_1892_) {
							int i_1937_ = ((((Class387_Sub1) this).anIntArray7751[i_1935_]) + i_1894_);
							int i_1938_ = ((((Class387_Sub1) this).anIntArray7753[i_1935_]) + i_1896_);
							int i_1939_ = i_1937_ & i_1923_;
							int i_1940_ = i_1938_ & i_1923_;
							int i_1941_ = i_1937_ >> class_xa.anInt6289 * -2137349879;
							int i_1942_ = i_1938_ >> class_xa.anInt6289 * -2137349879;
							if (i_1941_ >= 0 && (i_1941_ < class_xa.anInt6287 * -506105871 - 1) && i_1942_ >= 0 && (i_1942_ < class_xa.anInt6286 * -1148794921 - 1)) {
								int i_1943_ = (((is[i_1941_][i_1942_] * (class_xa.anInt6288 * -1212653763 - i_1939_)) + is[i_1941_ + 1][i_1942_] * i_1939_) >> class_xa.anInt6289 * -2137349879);
								int i_1944_ = (((is[i_1941_][i_1942_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1939_)) + (is[i_1941_ + 1][i_1942_ + 1] * i_1939_)) >> class_xa.anInt6289 * -2137349879);
								int i_1945_ = ((i_1943_ * (class_xa.anInt6288 * -1212653763 - i_1940_)) + i_1944_ * i_1940_ >> class_xa.anInt6289 * -2137349879);
								((Class387_Sub1) this).anIntArray7752[i_1935_] = ((((Class387_Sub1) this).anIntArray7752[i_1935_]) + ((i_1945_ - i_1895_) * (i_1892_ - i_1936_) / i_1892_));
							}
						} else
							((Class387_Sub1) this).anIntArray7752[i_1935_] = (((Class387_Sub1) this).anIntArray7752[i_1935_]);
					}
				} else if (i == 3) {
					int i_1946_ = (i_1892_ & 0xff) * 4;
					int i_1947_ = (i_1892_ >> 8 & 0xff) * 4;
					int i_1948_ = (i_1892_ >> 16 & 0xff) << 6;
					int i_1949_ = (i_1892_ >> 24 & 0xff) << 6;
					if (i_1894_ - (i_1946_ >> 1) < 0 || ((i_1894_ + (i_1946_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_1896_ - (i_1947_ >> 1) < 0 || ((i_1896_ + (i_1947_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
						return;
					method4732(class_xa, i_1894_, i_1895_, i_1896_, i_1946_, i_1947_, i_1948_, i_1949_);
				} else if (i == 4) {
					int i_1950_ = class_xa_1893_.anInt6288 * -1212653763 - 1;
					int i_1951_ = (((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770);
					for (int i_1952_ = 0; i_1952_ < ((Class387_Sub1) this).anInt7742; i_1952_++) {
						int i_1953_ = (((Class387_Sub1) this).anIntArray7751[i_1952_] + i_1894_);
						int i_1954_ = (((Class387_Sub1) this).anIntArray7753[i_1952_] + i_1896_);
						int i_1955_ = i_1953_ & i_1950_;
						int i_1956_ = i_1954_ & i_1950_;
						int i_1957_ = (i_1953_ >> class_xa_1893_.anInt6289 * -2137349879);
						int i_1958_ = (i_1954_ >> class_xa_1893_.anInt6289 * -2137349879);
						int i_1959_ = (((is_1901_[i_1957_][i_1958_] * (class_xa_1893_.anInt6288 * -1212653763 - i_1955_)) + is_1901_[i_1957_ + 1][i_1958_] * i_1955_) >> class_xa_1893_.anInt6289 * -2137349879);
						int i_1960_ = (((is_1901_[i_1957_][i_1958_ + 1] * (class_xa_1893_.anInt6288 * -1212653763 - i_1955_)) + is_1901_[i_1957_ + 1][i_1958_ + 1] * i_1955_) >> class_xa_1893_.anInt6289 * -2137349879);
						int i_1961_ = ((i_1959_ * (class_xa_1893_.anInt6288 * -1212653763 - i_1956_)) + i_1960_ * i_1956_ >> class_xa_1893_.anInt6289 * -2137349879);
						((Class387_Sub1) this).anIntArray7752[i_1952_] = (((Class387_Sub1) this).anIntArray7752[i_1952_] + (i_1961_ - i_1895_) + i_1951_);
					}
					for (int i_1962_ = ((Class387_Sub1) this).anInt7742; i_1962_ < ((Class387_Sub1) this).anInt7799; i_1962_++) {
						int i_1963_ = (((Class387_Sub1) this).anIntArray7751[i_1962_] + i_1894_);
						int i_1964_ = (((Class387_Sub1) this).anIntArray7753[i_1962_] + i_1896_);
						int i_1965_ = i_1963_ & i_1950_;
						int i_1966_ = i_1964_ & i_1950_;
						int i_1967_ = (i_1963_ >> class_xa_1893_.anInt6289 * -2137349879);
						int i_1968_ = (i_1964_ >> class_xa_1893_.anInt6289 * -2137349879);
						if (i_1967_ >= 0 && (i_1967_ < class_xa_1893_.anInt6287 * -506105871 - 1) && i_1968_ >= 0 && i_1968_ < (class_xa_1893_.anInt6286 * -1148794921) - 1) {
							int i_1969_ = (((is_1901_[i_1967_][i_1968_] * (class_xa_1893_.anInt6288 * -1212653763 - i_1965_)) + is_1901_[i_1967_ + 1][i_1968_] * i_1965_) >> class_xa_1893_.anInt6289 * -2137349879);
							int i_1970_ = (((is_1901_[i_1967_][i_1968_ + 1] * (class_xa_1893_.anInt6288 * -1212653763 - i_1965_)) + (is_1901_[i_1967_ + 1][i_1968_ + 1] * i_1965_)) >> class_xa_1893_.anInt6289 * -2137349879);
							int i_1971_ = ((i_1969_ * (class_xa_1893_.anInt6288 * -1212653763 - i_1966_)) + i_1970_ * i_1966_ >> class_xa_1893_.anInt6289 * -2137349879);
							((Class387_Sub1) this).anIntArray7752[i_1962_] = (((Class387_Sub1) this).anIntArray7752[i_1962_]) + (i_1971_ - i_1895_) + i_1951_;
						}
					}
				} else if (i == 5) {
					int i_1972_ = class_xa_1893_.anInt6288 * -1212653763 - 1;
					int i_1973_ = (((Class387_Sub1) this).aShort7796 - ((Class387_Sub1) this).aShort7770);
					for (int i_1974_ = 0; i_1974_ < ((Class387_Sub1) this).anInt7742; i_1974_++) {
						int i_1975_ = (((Class387_Sub1) this).anIntArray7751[i_1974_] + i_1894_);
						int i_1976_ = (((Class387_Sub1) this).anIntArray7753[i_1974_] + i_1896_);
						int i_1977_ = i_1975_ & i_1972_;
						int i_1978_ = i_1976_ & i_1972_;
						int i_1979_ = i_1975_ >> class_xa.anInt6289 * -2137349879;
						int i_1980_ = i_1976_ >> class_xa.anInt6289 * -2137349879;
						int i_1981_ = (((is[i_1979_][i_1980_] * (class_xa.anInt6288 * -1212653763 - i_1977_)) + is[i_1979_ + 1][i_1980_] * i_1977_) >> class_xa.anInt6289 * -2137349879);
						int i_1982_ = (((is[i_1979_][i_1980_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1977_)) + is[i_1979_ + 1][i_1980_ + 1] * i_1977_) >> class_xa.anInt6289 * -2137349879);
						int i_1983_ = (i_1981_ * (class_xa.anInt6288 * -1212653763 - i_1978_) + i_1982_ * i_1978_ >> class_xa.anInt6289 * -2137349879);
						i_1981_ = (((is_1901_[i_1979_][i_1980_] * (class_xa_1893_.anInt6288 * -1212653763 - i_1977_)) + is_1901_[i_1979_ + 1][i_1980_] * i_1977_) >> class_xa_1893_.anInt6289 * -2137349879);
						i_1982_ = (((is_1901_[i_1979_][i_1980_ + 1] * (class_xa_1893_.anInt6288 * -1212653763 - i_1977_)) + is_1901_[i_1979_ + 1][i_1980_ + 1] * i_1977_) >> class_xa_1893_.anInt6289 * -2137349879);
						int i_1984_ = ((i_1981_ * (class_xa_1893_.anInt6288 * -1212653763 - i_1978_)) + i_1982_ * i_1978_ >> class_xa_1893_.anInt6289 * -2137349879);
						int i_1985_ = i_1983_ - i_1984_ - i_1892_;
						((Class387_Sub1) this).anIntArray7752[i_1974_] = ((((Class387_Sub1) this).anIntArray7752[i_1974_] << 8) / i_1973_ * i_1985_ >> 8) - (i_1895_ - i_1983_);
					}
					for (int i_1986_ = ((Class387_Sub1) this).anInt7742; i_1986_ < ((Class387_Sub1) this).anInt7799; i_1986_++) {
						int i_1987_ = (((Class387_Sub1) this).anIntArray7751[i_1986_] + i_1894_);
						int i_1988_ = (((Class387_Sub1) this).anIntArray7753[i_1986_] + i_1896_);
						int i_1989_ = i_1987_ & i_1972_;
						int i_1990_ = i_1988_ & i_1972_;
						int i_1991_ = i_1987_ >> class_xa.anInt6289 * -2137349879;
						int i_1992_ = i_1988_ >> class_xa.anInt6289 * -2137349879;
						if (i_1991_ >= 0 && i_1991_ < class_xa.anInt6287 * -506105871 - 1 && (i_1991_ < class_xa_1893_.anInt6287 * -506105871 - 1) && i_1992_ >= 0 && i_1992_ < class_xa.anInt6286 * -1148794921 - 1 && i_1992_ < (class_xa_1893_.anInt6286 * -1148794921) - 1) {
							int i_1993_ = (((is[i_1991_][i_1992_] * (class_xa.anInt6288 * -1212653763 - i_1989_)) + is[i_1991_ + 1][i_1992_] * i_1989_) >> class_xa.anInt6289 * -2137349879);
							int i_1994_ = (((is[i_1991_][i_1992_ + 1] * (class_xa.anInt6288 * -1212653763 - i_1989_)) + is[i_1991_ + 1][i_1992_ + 1] * i_1989_) >> class_xa.anInt6289 * -2137349879);
							int i_1995_ = (i_1993_ * (class_xa.anInt6288 * -1212653763 - i_1990_) + i_1994_ * i_1990_ >> class_xa.anInt6289 * -2137349879);
							i_1993_ = (((is_1901_[i_1991_][i_1992_] * (class_xa_1893_.anInt6288 * -1212653763 - i_1989_)) + is_1901_[i_1991_ + 1][i_1992_] * i_1989_) >> class_xa_1893_.anInt6289 * -2137349879);
							i_1994_ = (((is_1901_[i_1991_][i_1992_ + 1] * (class_xa_1893_.anInt6288 * -1212653763 - i_1989_)) + (is_1901_[i_1991_ + 1][i_1992_ + 1] * i_1989_)) >> class_xa_1893_.anInt6289 * -2137349879);
							int i_1996_ = ((i_1993_ * (class_xa_1893_.anInt6288 * -1212653763 - i_1990_)) + i_1994_ * i_1990_ >> class_xa_1893_.anInt6289 * -2137349879);
							int i_1997_ = i_1995_ - i_1996_ - i_1892_;
							((Class387_Sub1) this).anIntArray7752[i_1986_] = (((((Class387_Sub1) this).anIntArray7752[i_1986_]) << 8) / i_1973_ * i_1997_ >> 8) - (i_1895_ - i_1995_);
						}
					}
				}
				((Class387_Sub1) this).aBoolean7792 = false;
			}
		}
	}

	public int cq() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7743;
	}

	public int cf() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7743;
	}

	public int dh() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7770;
	}

	public int ha() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7800;
	}

	public void bx(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub1) this).aClass1Array7755 != null) {
				if (i == 4096) {
					method4797();
					break;
				}
				if (i == 8192) {
					method4798();
					break;
				}
				if (i == 12288) {
					method4799();
					break;
				}
				int i_1998_ = Class220.anIntArray2483[i];
				int i_1999_ = Class220.anIntArray2474[i];
				synchronized (this) {
					for (int i_2000_ = 0; i_2000_ < ((Class387_Sub1) this).anInt7742; i_2000_++) {
						int i_2001_ = (((((Class387_Sub1) this).anIntArray7753[i_2000_] * i_1998_) + (((Class387_Sub1) this).anIntArray7751[i_2000_]) * i_1999_) >> 14);
						((Class387_Sub1) this).anIntArray7753[i_2000_] = ((((Class387_Sub1) this).anIntArray7753[i_2000_] * i_1999_) - (((Class387_Sub1) this).anIntArray7751[i_2000_]) * i_1998_) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_2000_] = i_2001_;
						if (((Class387_Sub1) this).aClass1Array7755[i_2000_] != null) {
							i_2001_ = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_2000_])).anInt14) * i_1998_ + (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_2000_])).anInt13) * i_1999_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_2000_])).anInt14 = ((((Class1) (((Class387_Sub1) this).aClass1Array7755[i_2000_])).anInt14) * i_1999_ - (((Class1) (((Class387_Sub1) this).aClass1Array7755[i_2000_])).anInt13) * i_1998_) >> 14;
							((Class1) (((Class387_Sub1) this).aClass1Array7755[i_2000_])).anInt13 = i_2001_;
						}
					}
					if (((Class387_Sub1) this).aClass5Array7740 != null) {
						for (int i_2002_ = 0; i_2002_ < ((Class387_Sub1) this).anInt7757; i_2002_++) {
							if ((((Class387_Sub1) this).aClass5Array7740[i_2002_]) != null) {
								int i_2003_ = ((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_2002_])).anInt80) * i_1998_ + (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_2002_])).anInt78 * i_1999_)) >> 14;
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_2002_])).anInt80 = ((((Class5) (((Class387_Sub1) this).aClass5Array7740[i_2002_])).anInt80) * i_1999_ - (((Class5) (((Class387_Sub1) this).aClass5Array7740[i_2002_])).anInt78 * i_1998_)) >> 14;
								((Class5) (((Class387_Sub1) this).aClass5Array7740[i_2002_])).anInt78 = i_2003_;
							}
						}
					}
					for (int i_2004_ = ((Class387_Sub1) this).anInt7742; i_2004_ < ((Class387_Sub1) this).anInt7799; i_2004_++) {
						int i_2005_ = (((((Class387_Sub1) this).anIntArray7753[i_2004_] * i_1998_) + (((Class387_Sub1) this).anIntArray7751[i_2004_]) * i_1999_) >> 14);
						((Class387_Sub1) this).anIntArray7753[i_2004_] = ((((Class387_Sub1) this).anIntArray7753[i_2004_] * i_1999_) - (((Class387_Sub1) this).anIntArray7751[i_2004_]) * i_1998_) >> 14;
						((Class387_Sub1) this).anIntArray7751[i_2004_] = i_2005_;
					}
					((Class387_Sub1) this).anInt7812 = 0;
					((Class387_Sub1) this).aBoolean7792 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public int dq() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7800;
	}

	public int ds() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7800;
	}

	public void dv(short i, short i_2006_) {
		if (((Class387_Sub1) this).aShortArray7774 != null) {
			if (!((Class387_Sub1) this).aBoolean7777 && i_2006_ >= 0) {
				Class53 class53 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.anInterface_ma5299.method174(i_2006_ & 0xffff, 2079617446);
				if (class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class387_Sub1) this).aBoolean7777 = true;
			}
			for (int i_2007_ = 0; i_2007_ < ((Class387_Sub1) this).anInt7757; i_2007_++) {
				if (((Class387_Sub1) this).aShortArray7774[i_2007_] == i)
					((Class387_Sub1) this).aShortArray7774[i_2007_] = i_2006_;
			}
		}
	}

	public void dx(int i) {
		if ((((Class387_Sub1) this).anInt7746 & 0x2000) != 8192)
			throw new IllegalStateException();
		((Class387_Sub1) this).anInt7748 = i;
		((Class387_Sub1) this).anInt7812 = 0;
	}

	void method4815(Thread thread) {
		Class15 class15 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(thread);
		if (class15 != ((Class387_Sub1) this).aClass15_7736) {
			((Class387_Sub1) this).aClass15_7736 = class15;
			((Class387_Sub1) this).aClass387_Sub1Array7815 = (((Class15) ((Class387_Sub1) this).aClass15_7736).aClass387_Sub1Array187);
			((Class387_Sub1) this).aClass387_Sub1Array7804 = (((Class15) ((Class387_Sub1) this).aClass15_7736).aClass387_Sub1Array217);
		}
	}

	public int dk() {
		return ((Class387_Sub1) this).anInt7747;
	}

	public int db() {
		return ((Class387_Sub1) this).anInt7747;
	}

	public int dn() {
		return ((Class387_Sub1) this).anInt7748;
	}

	public byte[] method_do() {
		return ((Class387_Sub1) this).aByteArray7773;
	}

	public void method4768(byte i, byte[] is) {
		if ((((Class387_Sub1) this).anInt7746 & 0x100000) == 0)
			throw new RuntimeException();
		if (((Class387_Sub1) this).aByteArray7773 == null)
			((Class387_Sub1) this).aByteArray7773 = new byte[((Class387_Sub1) this).anInt7757];
		if (is == null) {
			for (int i_2008_ = 0; i_2008_ < ((Class387_Sub1) this).anInt7757; i_2008_++)
				((Class387_Sub1) this).aByteArray7773[i_2008_] = i;
		} else {
			for (int i_2009_ = 0; i_2009_ < ((Class387_Sub1) this).anInt7757; i_2009_++) {
				int i_2010_ = 255 - ((255 - (is[i_2009_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub1) this).aByteArray7773[i_2009_] = (byte) i_2010_;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	public void method4769(byte i, byte[] is) {
		if ((((Class387_Sub1) this).anInt7746 & 0x100000) == 0)
			throw new RuntimeException();
		if (((Class387_Sub1) this).aByteArray7773 == null)
			((Class387_Sub1) this).aByteArray7773 = new byte[((Class387_Sub1) this).anInt7757];
		if (is == null) {
			for (int i_2011_ = 0; i_2011_ < ((Class387_Sub1) this).anInt7757; i_2011_++)
				((Class387_Sub1) this).aByteArray7773[i_2011_] = i;
		} else {
			for (int i_2012_ = 0; i_2012_ < ((Class387_Sub1) this).anInt7757; i_2012_++) {
				int i_2013_ = 255 - ((255 - (is[i_2012_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub1) this).aByteArray7773[i_2012_] = (byte) i_2013_;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	public void du(short i, short i_2014_) {
		if (((Class387_Sub1) this).aShortArray7774 != null) {
			if (!((Class387_Sub1) this).aBoolean7777 && i_2014_ >= 0) {
				Class53 class53 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.anInterface_ma5299.method174(i_2014_ & 0xffff, 1323236979);
				if (class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class387_Sub1) this).aBoolean7777 = true;
			}
			for (int i_2015_ = 0; i_2015_ < ((Class387_Sub1) this).anInt7757; i_2015_++) {
				if (((Class387_Sub1) this).aShortArray7774[i_2015_] == i)
					((Class387_Sub1) this).aShortArray7774[i_2015_] = i_2014_;
			}
		}
	}

	public void method4762(Matrix3f class222, int i, boolean bool) {
		if (((Class387_Sub1) this).aShortArray7816 != null) {
			Class15 class15 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread());
			Matrix3f class222_2016_ = ((Class15) class15).aClass222_189;
			class222_2016_.method2070(class222);
			if (bool)
				class222_2016_.method2058();
			Matrix4f class233 = ((Class15) class15).aClass233_194;
			class233.method2145(class222_2016_);
			float[] fs = new float[3];
			for (int i_2017_ = 0; i_2017_ < ((Class387_Sub1) this).anInt7742; i_2017_++) {
				if ((i & ((Class387_Sub1) this).aShortArray7816[i_2017_]) != 0) {
					class233.method2149((float) (((Class387_Sub1) this).anIntArray7751[i_2017_]), (float) (((Class387_Sub1) this).anIntArray7752[i_2017_]), (float) (((Class387_Sub1) this).anIntArray7753[i_2017_]), fs);
					((Class387_Sub1) this).anIntArray7751[i_2017_] = (int) fs[0];
					((Class387_Sub1) this).anIntArray7752[i_2017_] = (int) fs[1];
					((Class387_Sub1) this).anIntArray7753[i_2017_] = (int) fs[2];
				}
			}
		}
	}

	public void di(short i, short i_2018_) {
		if (((Class387_Sub1) this).aShortArray7774 != null) {
			if (!((Class387_Sub1) this).aBoolean7777 && i_2018_ >= 0) {
				Class53 class53 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.anInterface_ma5299.method174(i_2018_ & 0xffff, 520606939);
				if (class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class387_Sub1) this).aBoolean7777 = true;
			}
			for (int i_2019_ = 0; i_2019_ < ((Class387_Sub1) this).anInt7757; i_2019_++) {
				if (((Class387_Sub1) this).aShortArray7774[i_2019_] == i)
					((Class387_Sub1) this).aShortArray7774[i_2019_] = i_2018_;
			}
		}
	}

	public int Z() {
		return ((Class387_Sub1) this).anInt7748;
	}

	public void dz(short i, short i_2020_) {
		if (((Class387_Sub1) this).aShortArray7774 != null) {
			if (!((Class387_Sub1) this).aBoolean7777 && i_2020_ >= 0) {
				Class53 class53 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.anInterface_ma5299.method174(i_2020_ & 0xffff, 2036101546);
				if (class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class387_Sub1) this).aBoolean7777 = true;
			}
			for (int i_2021_ = 0; i_2021_ < ((Class387_Sub1) this).anInt7757; i_2021_++) {
				if (((Class387_Sub1) this).aShortArray7774[i_2021_] == i)
					((Class387_Sub1) this).aShortArray7774[i_2021_] = i_2020_;
			}
		}
	}

	public void dt(int i, int i_2022_, int i_2023_, int i_2024_) {
		if ((((Class387_Sub1) this).anInt7746 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_2025_ = 0; i_2025_ < ((Class387_Sub1) this).anInt7757; i_2025_++) {
			int i_2026_ = ((Class387_Sub1) this).aShortArray7775[i_2025_] & 0xffff;
			int i_2027_ = i_2026_ >> 10 & 0x3f;
			int i_2028_ = i_2026_ >> 7 & 0x7;
			int i_2029_ = i_2026_ & 0x7f;
			if (i != -1)
				i_2027_ += (i - i_2027_) * i_2024_ >> 7;
			if (i_2022_ != -1)
				i_2028_ += (i_2022_ - i_2028_) * i_2024_ >> 7;
			if (i_2023_ != -1)
				i_2029_ += (i_2023_ - i_2029_) * i_2024_ >> 7;
			((Class387_Sub1) this).aShortArray7775[i_2025_] = (short) (i_2027_ << 10 | i_2028_ << 7 | i_2029_);
		}
		if (((Class387_Sub1) this).aClass16Array7789 != null) {
			for (int i_2030_ = 0; i_2030_ < ((Class387_Sub1) this).anInt7788; i_2030_++) {
				Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_2030_];
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_2030_];
				((Class18) class18).anInt254 = (((Class18) class18).anInt254 * -1509687305 & ~0xffffff | ((Class379.anIntArray4096[Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	public void dj(int i, int i_2031_, int i_2032_, int i_2033_) {
		if ((((Class387_Sub1) this).anInt7746 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_2034_ = 0; i_2034_ < ((Class387_Sub1) this).anInt7757; i_2034_++) {
			int i_2035_ = ((Class387_Sub1) this).aShortArray7775[i_2034_] & 0xffff;
			int i_2036_ = i_2035_ >> 10 & 0x3f;
			int i_2037_ = i_2035_ >> 7 & 0x7;
			int i_2038_ = i_2035_ & 0x7f;
			if (i != -1)
				i_2036_ += (i - i_2036_) * i_2033_ >> 7;
			if (i_2031_ != -1)
				i_2037_ += (i_2031_ - i_2037_) * i_2033_ >> 7;
			if (i_2032_ != -1)
				i_2038_ += (i_2032_ - i_2038_) * i_2033_ >> 7;
			((Class387_Sub1) this).aShortArray7775[i_2034_] = (short) (i_2036_ << 10 | i_2037_ << 7 | i_2038_);
		}
		if (((Class387_Sub1) this).aClass16Array7789 != null) {
			for (int i_2039_ = 0; i_2039_ < ((Class387_Sub1) this).anInt7788; i_2039_++) {
				Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_2039_];
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_2039_];
				((Class18) class18).anInt254 = (((Class18) class18).anInt254 * -1509687305 & ~0xffffff | ((Class379.anIntArray4096[Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	public void dr(int i, int i_2040_, int i_2041_, int i_2042_) {
		if ((((Class387_Sub1) this).anInt7746 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_2043_ = 0; i_2043_ < ((Class387_Sub1) this).anInt7757; i_2043_++) {
			int i_2044_ = ((Class387_Sub1) this).aShortArray7775[i_2043_] & 0xffff;
			int i_2045_ = i_2044_ >> 10 & 0x3f;
			int i_2046_ = i_2044_ >> 7 & 0x7;
			int i_2047_ = i_2044_ & 0x7f;
			if (i != -1)
				i_2045_ += (i - i_2045_) * i_2042_ >> 7;
			if (i_2040_ != -1)
				i_2046_ += (i_2040_ - i_2046_) * i_2042_ >> 7;
			if (i_2041_ != -1)
				i_2047_ += (i_2041_ - i_2047_) * i_2042_ >> 7;
			((Class387_Sub1) this).aShortArray7775[i_2043_] = (short) (i_2045_ << 10 | i_2046_ << 7 | i_2047_);
		}
		if (((Class387_Sub1) this).aClass16Array7789 != null) {
			for (int i_2048_ = 0; i_2048_ < ((Class387_Sub1) this).anInt7788; i_2048_++) {
				Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_2048_];
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_2048_];
				((Class18) class18).anInt254 = (((Class18) class18).anInt254 * -1509687305 & ~0xffffff | ((Class379.anIntArray4096[Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]) & 0xffff, (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	public Class85[] method4771() {
		return ((Class387_Sub1) this).aClass85Array7750;
	}

	void method4733() {
		if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
			synchronized (this) {
				while (aBoolean4148) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean4148 = true;
			}
		}
	}

	public void df(short i, short i_2049_) {
		if (((Class387_Sub1) this).aShortArray7774 != null) {
			if (!((Class387_Sub1) this).aBoolean7777 && i_2049_ >= 0) {
				Class53 class53 = ((Class387_Sub1) this).aClass_ra_Sub1_7769.anInterface_ma5299.method174(i_2049_ & 0xffff, 1021833960);
				if (class53.aByte535 != 0 || class53.aByte509 != 0)
					((Class387_Sub1) this).aBoolean7777 = true;
			}
			for (int i_2050_ = 0; i_2050_ < ((Class387_Sub1) this).anInt7757; i_2050_++) {
				if (((Class387_Sub1) this).aShortArray7774[i_2050_] == i)
					((Class387_Sub1) this).aShortArray7774[i_2050_] = i_2049_;
			}
		}
	}

	public Class68[] method4753() {
		return ((Class387_Sub1) this).aClass68Array7754;
	}

	public Class68[] method4775() {
		return ((Class387_Sub1) this).aClass68Array7754;
	}

	public boolean method4788() {
		if (((Class387_Sub1) this).aShortArray7774 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub1) this).aShortArray7774.length; i++) {
			if (((Class387_Sub1) this).aShortArray7774[i] != -1 && !((Class387_Sub1) this).aClass_ra_Sub1_7769.method5200(((Class387_Sub1) this).aShortArray7774[i]))
				return false;
		}
		return true;
	}

	public int ca() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7739;
	}

	public boolean method4778() {
		if (((Class387_Sub1) this).aShortArray7774 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub1) this).aShortArray7774.length; i++) {
			if (((Class387_Sub1) this).aShortArray7774[i] != -1 && !((Class387_Sub1) this).aClass_ra_Sub1_7769.method5200(((Class387_Sub1) this).aShortArray7774[i]))
				return false;
		}
		return true;
	}

	public Class68[] method4774() {
		return ((Class387_Sub1) this).aClass68Array7754;
	}

	public boolean eg() {
		return ((Class387_Sub1) this).aBoolean7777;
	}

	public boolean ex() {
		return ((Class387_Sub1) this).aBoolean7777;
	}

	final boolean method4816(int i) {
		if (((Class387_Sub1) this).anIntArray7814 == null)
			return false;
		if (((Class387_Sub1) this).anIntArray7814[i] == -1)
			return false;
		return true;
	}

	public void em() {
		if ((((Class387_Sub1) this).anInt7746 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub1) this).anInt7799; i++)
				((Class387_Sub1) this).anIntArray7753[i] = -((Class387_Sub1) this).anIntArray7753[i];
			if (((Class387_Sub1) this).aClass1Array7755 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7742; i++) {
					if (((Class387_Sub1) this).aClass1Array7755[i] != null)
						((Class1) ((Class387_Sub1) this).aClass1Array7755[i]).anInt14 = -((Class1) (((Class387_Sub1) this).aClass1Array7755[i])).anInt14;
				}
			}
			if (((Class387_Sub1) this).aClass1Array7786 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7742; i++) {
					if (((Class387_Sub1) this).aClass1Array7786[i] != null)
						((Class1) ((Class387_Sub1) this).aClass1Array7786[i]).anInt14 = -((Class1) (((Class387_Sub1) this).aClass1Array7786[i])).anInt14;
				}
			}
			if (((Class387_Sub1) this).aClass5Array7740 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
					if (((Class387_Sub1) this).aClass5Array7740[i] != null)
						((Class5) ((Class387_Sub1) this).aClass5Array7740[i]).anInt80 = -((Class5) (((Class387_Sub1) this).aClass5Array7740[i])).anInt80;
				}
			}
			short[] is = ((Class387_Sub1) this).aShortArray7758;
			((Class387_Sub1) this).aShortArray7758 = ((Class387_Sub1) this).aShortArray7760;
			((Class387_Sub1) this).aShortArray7760 = is;
			if (((Class387_Sub1) this).aFloatArrayArray7738 != null) {
				for (int i = 0; i < ((Class387_Sub1) this).anInt7757; i++) {
					if (((Class387_Sub1) this).aFloatArrayArray7738[i] != null) {
						float f = (((Class387_Sub1) this).aFloatArrayArray7738[i][0]);
						((Class387_Sub1) this).aFloatArrayArray7738[i][0] = (((Class387_Sub1) this).aFloatArrayArray7738[i][2]);
						((Class387_Sub1) this).aFloatArrayArray7738[i][2] = f;
					}
					if (((Class387_Sub1) this).aFloatArrayArray7762[i] != null) {
						float f = (((Class387_Sub1) this).aFloatArrayArray7762[i][0]);
						((Class387_Sub1) this).aFloatArrayArray7762[i][0] = (((Class387_Sub1) this).aFloatArrayArray7762[i][2]);
						((Class387_Sub1) this).aFloatArrayArray7762[i][2] = f;
					}
				}
			}
			((Class387_Sub1) this).aBoolean7792 = false;
			((Class387_Sub1) this).anInt7812 = 0;
		}
	}

	public int ec() {
		if (!((Class387_Sub1) this).aBoolean7792)
			method4807();
		return ((Class387_Sub1) this).aShort7796;
	}

	public void KA(int i) {
		do {
			if ((((Class_ra_Sub1) ((Class387_Sub1) this).aClass_ra_Sub1_7769).anInt7999) * -922307687 > 1) {
				synchronized (this) {
					if ((((Class387_Sub1) this).anInt7746 & 0x10000) == 65536 && (i & 0x10000) == 0)
						method4810(true);
					((Class387_Sub1) this).anInt7746 = i;
					break;
				}
			}
			if ((((Class387_Sub1) this).anInt7746 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method4810(true);
			((Class387_Sub1) this).anInt7746 = i;
		} while (false);
	}

	public void ey(short i, short i_2051_) {
		for (int i_2052_ = 0; i_2052_ < ((Class387_Sub1) this).anInt7757; i_2052_++) {
			if (((Class387_Sub1) this).aShortArray7775[i_2052_] == i)
				((Class387_Sub1) this).aShortArray7775[i_2052_] = i_2051_;
		}
		if (((Class387_Sub1) this).aClass16Array7789 != null) {
			for (int i_2053_ = 0; i_2053_ < ((Class387_Sub1) this).anInt7788; i_2053_++) {
				Class16 class16 = ((Class387_Sub1) this).aClass16Array7789[i_2053_];
				Class18 class18 = ((Class387_Sub1) this).aClass18Array7790[i_2053_];
				((Class18) class18).anInt254 = (((Class18) class18).anInt254 * -1509687305 & ~0xffffff | ((Class379.anIntArray4096[Class173.method1823((((Class387_Sub1) this).aShortArray7775[(((Class16) class16).anInt226 * -1295149283)]), (byte) 0) & 0xffff]) & 0xffffff)) * -564629049;
			}
		}
		if (((Class387_Sub1) this).anInt7812 == 2)
			((Class387_Sub1) this).anInt7812 = 1;
	}

	public void method4782(Matrix3f class222) {
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		Matrix4f class233 = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_194;
		class233.method2145(class222);
		if (((Class387_Sub1) this).aClass85Array7750 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass85Array7750.length; i++) {
				Class85 class85 = ((Class387_Sub1) this).aClass85Array7750[i];
				Class85 class85_2054_ = class85;
				if (class85.aClass85_776 != null)
					class85_2054_ = class85.aClass85_776;
				class85_2054_.anInt777 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -1879868075);
				class85_2054_.anInt783 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -2041556771);
				class85_2054_.anInt779 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -1434499227);
				class85_2054_.anInt772 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 1070341177);
				class85_2054_.anInt781 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 1802851857);
				class85_2054_.anInt782 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 103846281;
				class85_2054_.anInt771 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * -2103324039);
				class85_2054_.anInt784 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * -526039059);
				class85_2054_.anInt785 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (((Class387_Sub1) this).aClass68Array7754 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass68Array7754.length; i++) {
				Class68 class68 = ((Class387_Sub1) this).aClass68Array7754[i];
				Class68 class68_2055_ = class68;
				if (class68.aClass68_672 != null)
					class68_2055_ = class68.aClass68_672;
				if (class68.aClass233_677 != null)
					class68.aClass233_677.method2142(class233);
				else
					class68.aClass233_677 = new Matrix4f(class233);
				class68_2055_.anInt671 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * -1436341053);
				class68_2055_.anInt675 = (int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * 449866009;
				class68_2055_.anInt676 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	public void method4783(Matrix3f class222) {
		method4789(((Class387_Sub1) this).aClass_ra_Sub1_7769.method5202(Thread.currentThread()));
		Matrix4f class233 = ((Class15) ((Class387_Sub1) this).aClass15_7735).aClass233_194;
		class233.method2145(class222);
		if (((Class387_Sub1) this).aClass85Array7750 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass85Array7750.length; i++) {
				Class85 class85 = ((Class387_Sub1) this).aClass85Array7750[i];
				Class85 class85_2056_ = class85;
				if (class85.aClass85_776 != null)
					class85_2056_ = class85.aClass85_776;
				class85_2056_.anInt777 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -1879868075);
				class85_2056_.anInt783 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -2041556771);
				class85_2056_.anInt779 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt773 * -710317103)])))) * -1434499227);
				class85_2056_.anInt772 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 1070341177);
				class85_2056_.anInt781 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 1802851857);
				class85_2056_.anInt782 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt774 * 1705862021)])))) * 103846281;
				class85_2056_.anInt771 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * -2103324039);
				class85_2056_.anInt784 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * -526039059);
				class85_2056_.anInt785 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class85.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (((Class387_Sub1) this).aClass68Array7754 != null) {
			for (int i = 0; i < ((Class387_Sub1) this).aClass68Array7754.length; i++) {
				Class68 class68 = ((Class387_Sub1) this).aClass68Array7754[i];
				Class68 class68_2057_ = class68;
				if (class68.aClass68_672 != null)
					class68_2057_ = class68.aClass68_672;
				if (class68.aClass233_677 != null)
					class68.aClass233_677.method2142(class233);
				else
					class68.aClass233_677 = new Matrix4f(class233);
				class68_2057_.anInt671 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub1) this).anIntArray7752[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * -1436341053);
				class68_2057_.anInt675 = (int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub1) this).anIntArray7752[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * 449866009;
				class68_2057_.anInt676 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub1) this).anIntArray7751[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub1) this).anIntArray7752[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub1) this).anIntArray7753[(class68.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}
}
