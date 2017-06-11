/* Class302_Sub3_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class302_Sub3_Sub1_Sub1 extends Class302_Sub3_Sub1 {
	int anInt10032;
	short aShort10033;
	short aShort10034;
	short aShort10035;
	short aShort10036;
	Class342 aClass342_10037;
	short aShort10038;
	short aShort10039;
	int colorFlag;

	Class302_Sub3_Sub1_Sub1(Class342 class342, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, boolean bool_10_) {
		aClass342_10037 = class342;
		anInt9785 = i << 12;
		anInt9789 = i_0_ << 12;
		anInt9790 = i_1_ << 12;
		flags = i_7_;
		aShort10034 = aShort10035 = (short) i_6_;
		anInt9791 = i_8_;
		anInt9794 = i_9_;
		aBoolean9787 = bool_10_;
		aShort10036 = (short) i_2_;
		aShort10039 = (short) i_3_;
		aShort10038 = (short) i_4_;
		anInt10032 = i_5_;
		aByte9793 = (((Class342) aClass342_10037).aClass85_3662.aByte780);
		method3725();
	}

	void method3724(Class342 class342, int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool, boolean bool_21_) {
		aClass342_10037 = class342;
		anInt9785 = i << 12;
		anInt9789 = i_11_ << 12;
		anInt9790 = i_12_ << 12;
		flags = i_18_;
		aShort10034 = aShort10035 = (short) i_17_;
		anInt9791 = i_19_;
		anInt9794 = i_20_;
		aBoolean9787 = bool_21_;
		aShort10036 = (short) i_13_;
		aShort10039 = (short) i_14_;
		aShort10038 = (short) i_15_;
		anInt10032 = i_16_;
		aByte9793 = (((Class342) aClass342_10037).aClass85_3662.aByte780);
		method3725();
	}

	void method3725() {
		int i = (((Class351) ((Class342) (aClass342_10037)).aClass351_3649).anInt3763);
		if ((((Class351) ((Class342) (aClass342_10037)).aClass351_3649).aClass302_Sub3_Sub1_Sub1Array3762[i]) != null)
			((Class351) ((Class342) (aClass342_10037)).aClass351_3649).aClass302_Sub3_Sub1_Sub1Array3762[i].method3726();
		((Class351) (((Class342) aClass342_10037).aClass351_3649)).aClass302_Sub3_Sub1_Sub1Array3762[i] = this;
		aShort10033 = (short) ((Class351) (((Class342) aClass342_10037).aClass351_3649)).anInt3763;
		((Class351) ((Class342) (aClass342_10037)).aClass351_3649).anInt3763 = i + 1 & 0x1fff;
		((Class342) aClass342_10037).aClass442_3648.method5870(this, -1945856763);
	}

	void method3726() {
		((Class351) ((Class342) (aClass342_10037)).aClass351_3649).aClass302_Sub3_Sub1_Sub1Array3762[aShort10033] = null;
		Class344.aClass302_Sub3_Sub1_Sub1Array3676[(Class344.anInt3686 * 146335501)] = this;
		Class344.anInt3686 = (Class344.anInt3686 * 146335501 + 1 & 0x3ff) * 901922757;
		method3714(225174472);
		method3721(-850214067);
	}

	void method3727(Class331 class331, GraphicsToolkit class_ra, long l) {
		int i = anInt9785 >> 12 + class331.anInt3504 * -1688804109;
		int i_22_ = anInt9790 >> 12 + class331.anInt3504 * -1688804109;
		int i_23_ = anInt9789 >> 12;
		if (i_23_ > 0 || i_23_ < -262144 || i < 0 || i >= class331.anInt3514 * 1988988347 || i_22_ < 0 || i_22_ >= class331.anInt3549 * 1340714547)
			method3726();
		else {
			Class351 class351 = (((Class342) (aClass342_10037)).aClass351_3649);
			Class182 class182 = (((Class342) (aClass342_10037)).aClass182_3656);
			Class_xa[] class_xas = class331.aClass_xaArray3517;
			int i_24_ = ((Class351) class351).anInt3767;
			Class326 class326 = (class331.aClass326ArrayArrayArray3516[((Class351) class351).anInt3767][i][i_22_]);
			if (class326 != null)
				i_24_ = class326.aByte3466;
			int i_25_ = class_xas[i_24_].method6341(i, i_22_, (byte) -12);
			int i_26_;
			if (i_24_ < class331.anInt3548 * 1678382205 - 1)
				i_26_ = class_xas[i_24_ + 1].method6341(i, i_22_, (byte) -120);
			else
				i_26_ = i_25_ - (8 << class331.anInt3504 * -1688804109);
			if (class182.aBoolean1864) {
				if (class182.anInt1850 * -275612851 == -1 && i_23_ > i_25_) {
					method3726();
					return;
				}
				if (class182.anInt1850 * -275612851 >= 0 && i_23_ > class_xas[class182.anInt1850 * -275612851].method6341(i, i_22_, (byte) -9)) {
					method3726();
					return;
				}
				if (class182.anInt1851 * -1831524931 == -1 && i_23_ < i_26_) {
					method3726();
					return;
				}
				if (class182.anInt1851 * -1831524931 >= 0 && i_23_ < class_xas[class182.anInt1851 * -1831524931 + 1].method6341(i, i_22_, (byte) -1)) {
					method3726();
					return;
				}
			}
			int i_27_;
			for (i_27_ = class331.anInt3548 * 1678382205 - 1; i_27_ > 0 && i_23_ > class_xas[i_27_].method6341(i, i_22_, (byte) -107); i_27_--) {
				/* empty */
			}
			if (class182.aBoolean1863 && i_27_ == 0 && i_23_ > class_xas[0].method6341(i, i_22_, (byte) -119))
				method3726();
			else if (i_27_ == class331.anInt3548 * 1678382205 - 1 && (class_xas[i_27_].method6341(i, i_22_, (byte) -125) - i_23_) > 8 << class331.anInt3504 * -1688804109)
				method3726();
			else {
				class326 = class331.aClass326ArrayArrayArray3516[i_27_][i][i_22_];
				if (class326 == null) {
					if (i_27_ == 0 || (class331.aClass326ArrayArrayArray3516[0][i][i_22_] == null))
						class326 = class331.aClass326ArrayArrayArray3516[0][i][i_22_] = new Class326(0);
					boolean bool = ((class331.aClass326ArrayArrayArray3516[0][i][i_22_].aClass326_3455) != null);
					if (i_27_ == 3 && bool) {
						method3726();
						return;
					}
					for (int i_28_ = 1; i_28_ <= i_27_; i_28_++) {
						if ((class331.aClass326ArrayArrayArray3516[i_28_][i][i_22_]) == null) {
							class326 = class331.aClass326ArrayArrayArray3516[i_28_][i][i_22_] = new Class326(i_28_);
							if (bool)
								class326.aByte3466++;
						}
					}
				}
				if (class182.aBoolean1862) {
					int i_29_ = anInt9785 >> 12;
					int i_30_ = anInt9790 >> 12;
					if (class326.aClass365_Sub1_Sub5_3457 != null) {
						Class334 class334 = class326.aClass365_Sub1_Sub5_3457.method4358(class_ra, (byte) -82);
						if (class334 != null && class334.method4082(i_29_, i_23_, i_30_)) {
							method3726();
							return;
						}
					}
					if (class326.aClass365_Sub1_Sub5_3458 != null) {
						Class334 class334 = class326.aClass365_Sub1_Sub5_3458.method4358(class_ra, (byte) -77);
						if (class334 != null && class334.method4082(i_29_, i_23_, i_30_)) {
							method3726();
							return;
						}
					}
					if (class326.aClass365_Sub1_Sub2_3461 != null) {
						Class334 class334 = class326.aClass365_Sub1_Sub2_3461.method4358(class_ra, (byte) 0);
						if (class334 != null && class334.method4082(i_29_, i_23_, i_30_)) {
							method3726();
							return;
						}
					}
					for (Class322 class322 = class326.aClass322_3456; class322 != null; class322 = class322.aClass322_3360) {
						Class334 class334 = class322.aClass365_Sub1_Sub1_3359.method4358(class_ra, (byte) -58);
						if (class334 != null && class334.method4082(i_29_, i_23_, i_30_)) {
							method3726();
							return;
						}
					}
				}
				((Class351) class351).aClass69_3765.aClass448_680.method5908(this, (byte) -3);
			}
		}
	}

	void method3728(long l, int i) {
		aShort10035 -= i;
		if (aShort10035 <= 0)
			method3726();
		else {
			int i_31_ = anInt9785 >> 12;
			int i_32_ = anInt9789 >> 12;
			int i_33_ = anInt9790 >> 12;
			Class351 class351 = (((Class342) (aClass342_10037)).aClass351_3649);
			Class182 class182 = (((Class342) (aClass342_10037)).aClass182_3656);
			if (class182.anInt1837 * 1558182711 != 0) {
				if ((aShort10034 - aShort10035) <= class182.anInt1886 * -1703669099) {
					int r = ((flags >> 8 & 0xff00) + (colorFlag >> 16 & 0xff) + class182.anInt1879 * -1778169623 * i);
					int g = ((flags & 0xff00) + (colorFlag >> 8 & 0xff) + class182.anInt1880 * 936719777 * i);
					int b = ((flags << 8 & 0xff00) + (colorFlag & 0xff) + class182.anInt1881 * 1137945971 * i);
					if (r < 0)
						r = 0;
					else if (r > 65535)
						r = 65535;
					if (g < 0)
						g = 0;
					else if (g > 65535)
						g = 65535;
					if (b < 0)
						b = 0;
					else if (b > 65535)
						b = 65535;
					flags &= ~0xffffff;
					flags |= (((r & 0xff00) << 8) + (g & 0xff00) + ((b & 0xff00) >> 8));
					colorFlag &= ~0xffffff;
					colorFlag |= (((r & 0xff) << 16) + ((g & 0xff) << 8) + (b & 0xff));
				}
				if ((aShort10034 - aShort10035) <= class182.anInt1845 * -966201447) {
					int i_37_ = ((flags >> 16 & 0xff00) + (colorFlag >> 24 & 0xff) + class182.anInt1882 * 825667009 * i);
					if (i_37_ < 0)
						i_37_ = 0;
					else if (i_37_ > 65535)
						i_37_ = 65535;
					flags &= 0xffffff;
					flags |= (i_37_ & 0xff00) << 16;
					colorFlag &= 0xffffff;
					colorFlag |= (i_37_ & 0xff) << 24;
				}
			}
			if (class182.anInt1828 * 799607235 != -1 && ((aShort10034 - aShort10035) <= class182.anInt1883 * -1035489121))
				anInt10032 += class182.anInt1884 * 1185897849 * i;
			if (class182.anInt1832 * -1628433875 != -1 && ((aShort10034 - aShort10035) <= class182.anInt1885 * -1648307777))
				anInt9791 += class182.anInt1878 * 308094979 * i;
			double d = (double) aShort10036;
			double d_38_ = (double) aShort10039;
			double d_39_ = (double) aShort10038;
			boolean bool = false;
			if (class182.anInt1819 * 166927215 == 1) {
				int i_40_ = (i_31_ - ((Class363) (((Class342) aClass342_10037).aClass363_3655)).anInt3926 * 60582813);
				int i_41_ = (i_32_ - ((Class363) (((Class342) aClass342_10037).aClass363_3655)).anInt3929 * 915630045);
				int i_42_ = i_33_ - (((Class363) ((Class342) (aClass342_10037)).aClass363_3655).anInt3919) * -1989166667;
				int i_43_ = ((int) Math.sqrt((double) (i_40_ * i_40_ + i_41_ * i_41_ + i_42_ * i_42_)) >> 2);
				long l_44_ = (long) (class182.anInt1847 * 1305957559 * i_43_ * i);
				anInt10032 -= ((long) anInt10032 * l_44_) >> 18;
			} else if (class182.anInt1819 * 166927215 == 2) {
				int i_45_ = (i_31_ - ((Class363) (((Class342) aClass342_10037).aClass363_3655)).anInt3926 * 60582813);
				int i_46_ = (i_32_ - ((Class363) (((Class342) aClass342_10037).aClass363_3655)).anInt3929 * 915630045);
				int i_47_ = i_33_ - (((Class363) ((Class342) (aClass342_10037)).aClass363_3655).anInt3919) * -1989166667;
				int i_48_ = i_45_ * i_45_ + i_46_ * i_46_ + i_47_ * i_47_;
				long l_49_ = (long) (class182.anInt1847 * 1305957559 * i_48_ * i);
				anInt10032 -= ((long) anInt10032 * l_49_) >> 28;
			}
			if (class182.anIntArray1823 != null) {
				Iterator iterator = ((Class351) class351).aList3768.iterator();
				while (iterator.hasNext()) {
					Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
					Class190 class190 = ((Class298_Sub45) class298_sub45).aClass190_7514;
					if (class190.anInt1940 * -1955592777 != 1) {
						boolean bool_50_ = false;
						for (int i_51_ = 0; i_51_ < class182.anIntArray1823.length; i_51_++) {
							if (class182.anIntArray1823[i_51_] == class190.anInt1930 * 618361365) {
								bool_50_ = true;
								break;
							}
						}
						if (bool_50_) {
							double d_52_ = (double) (i_31_ - (((Class298_Sub45) class298_sub45).anInt7516 * -1108687965));
							double d_53_ = (double) (i_32_ - (((Class298_Sub45) class298_sub45).anInt7517 * 80933881));
							double d_54_ = (double) (i_33_ - (((Class298_Sub45) class298_sub45).anInt7519 * -78566587));
							double d_55_ = (d_52_ * d_52_ + d_53_ * d_53_ + d_54_ * d_54_);
							if (!(d_55_ > (double) (class190.aLong1931 * 6688605316592129449L))) {
								double d_56_ = Math.sqrt(d_55_);
								if (d_56_ == 0.0)
									d_56_ = 1.0;
								double d_57_ = ((d_52_ * (double) (((Class298_Sub45) class298_sub45).aFloat7515) + d_53_ * (double) (class190.anInt1934 * -739294135) + d_54_ * (double) (((Class298_Sub45) class298_sub45).aFloat7520)) * 65535.0 / ((double) (class190.anInt1941 * 1414342983) * d_56_));
								if (!(d_57_ < (double) (class190.anInt1943 * -1188833415))) {
									double d_58_ = 0.0;
									if (class190.anInt1936 * -1660029223 == 1)
										d_58_ = (d_56_ / 16.0 * (double) (class190.anInt1920 * -1595714959));
									else if (class190.anInt1936 * -1660029223 == 2)
										d_58_ = (d_56_ / 16.0 * (d_56_ / 16.0) * (double) (class190.anInt1920 * -1595714959));
									if (class190.anInt1939 * 91019621 == 0) {
										if (class190.anInt1942 * 162409547 == 0) {
											d += ((double) (((Class298_Sub45) class298_sub45).aFloat7515) - d_58_) * (double) i;
											d_38_ += ((double) ((class190.anInt1934) * -739294135) - d_58_) * (double) i;
											d_39_ += ((double) (((Class298_Sub45) class298_sub45).aFloat7520) - d_58_) * (double) i;
											bool = true;
										} else {
											anInt9785 += ((double) (((Class298_Sub45) class298_sub45).aFloat7515) - d_58_) * (double) i;
											anInt9789 += ((double) ((class190.anInt1934) * -739294135) - d_58_) * (double) i;
											anInt9790 += ((double) (((Class298_Sub45) class298_sub45).aFloat7520) - d_58_) * (double) i;
										}
									} else {
										double d_59_ = (d_52_ / d_56_ * (double) (class190.anInt1941 * 1414342983));
										double d_60_ = (d_53_ / d_56_ * (double) (class190.anInt1941 * 1414342983));
										double d_61_ = (d_54_ / d_56_ * (double) (class190.anInt1941 * 1414342983));
										if (class190.anInt1942 * 162409547 == 0) {
											d += d_59_ * (double) i;
											d_38_ += d_60_ * (double) i;
											d_39_ += d_61_ * (double) i;
											bool = true;
										} else {
											anInt9785 += d_59_ * (double) i;
											anInt9789 += d_60_ * (double) i;
											anInt9790 += d_61_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class182.anIntArray1846 != null) {
				for (int i_62_ = 0; i_62_ < class182.anIntArray1846.length; i_62_++) {
					Class298_Sub45 class298_sub45 = ((Class298_Sub45) (Class344.aClass437_3684.get((long) class182.anIntArray1846[i_62_])));
					while (class298_sub45 != null) {
						Class190 class190 = ((Class298_Sub45) class298_sub45).aClass190_7514;
						double d_63_ = (double) (i_31_ - (((Class298_Sub45) class298_sub45).anInt7516) * -1108687965);
						double d_64_ = (double) (i_32_ - (((Class298_Sub45) class298_sub45).anInt7517) * 80933881);
						double d_65_ = (double) (i_33_ - (((Class298_Sub45) class298_sub45).anInt7519) * -78566587);
						double d_66_ = d_63_ * d_63_ + d_64_ * d_64_ + d_65_ * d_65_;
						if (d_66_ > (double) (class190.aLong1931 * 6688605316592129449L))
							class298_sub45 = ((Class298_Sub45) Class344.aClass437_3684.nextInBucket(-2145025597));
						else {
							double d_67_ = Math.sqrt(d_66_);
							if (d_67_ == 0.0)
								d_67_ = 1.0;
							double d_68_ = ((d_63_ * (double) (((Class298_Sub45) class298_sub45).aFloat7515) + d_64_ * (double) (class190.anInt1934 * -739294135) + d_65_ * (double) (((Class298_Sub45) class298_sub45).aFloat7520)) * 65535.0 / ((double) (class190.anInt1941 * 1414342983) * d_67_));
							if (d_68_ < (double) (class190.anInt1943 * -1188833415))
								class298_sub45 = ((Class298_Sub45) Class344.aClass437_3684.nextInBucket(-1619963382));
							else {
								double d_69_ = 0.0;
								if (class190.anInt1936 * -1660029223 == 1)
									d_69_ = (d_67_ / 16.0 * (double) (class190.anInt1920 * -1595714959));
								else if (class190.anInt1936 * -1660029223 == 2)
									d_69_ = (d_67_ / 16.0 * (d_67_ / 16.0) * (double) (class190.anInt1920 * -1595714959));
								if (class190.anInt1939 * 91019621 == 0) {
									if (class190.anInt1942 * 162409547 == 0) {
										d += ((double) (((Class298_Sub45) class298_sub45).aFloat7515) - d_69_) * (double) i;
										d_38_ += ((double) (class190.anInt1934 * -739294135) - d_69_) * (double) i;
										d_39_ += ((double) (((Class298_Sub45) class298_sub45).aFloat7520) - d_69_) * (double) i;
										bool = true;
									} else {
										anInt9785 += ((double) (((Class298_Sub45) class298_sub45).aFloat7515) - d_69_) * (double) i;
										anInt9789 += ((double) (class190.anInt1934 * -739294135) - d_69_) * (double) i;
										anInt9790 += ((double) (((Class298_Sub45) class298_sub45).aFloat7520) - d_69_) * (double) i;
									}
								} else {
									double d_70_ = (d_63_ / d_67_ * (double) (class190.anInt1941 * 1414342983));
									double d_71_ = (d_64_ / d_67_ * (double) (class190.anInt1941 * 1414342983));
									double d_72_ = (d_65_ / d_67_ * (double) (class190.anInt1941 * 1414342983));
									if (class190.anInt1942 * 162409547 == 0) {
										d += d_70_ * (double) i;
										d_38_ += d_71_ * (double) i;
										d_39_ += d_72_ * (double) i;
										bool = true;
									} else {
										anInt9785 += d_70_ * (double) i;
										anInt9789 += d_71_ * (double) i;
										anInt9790 += d_72_ * (double) i;
									}
								}
								class298_sub45 = ((Class298_Sub45) Class344.aClass437_3684.nextInBucket(-1920939025));
							}
						}
					}
				}
			}
			if (class182.anIntArray1829 != null) {
				if (class182.anIntArray1848 == null) {
					class182.anIntArray1848 = new int[class182.anIntArray1829.length];
					for (int i_73_ = 0; i_73_ < class182.anIntArray1829.length; i_73_++) {
						Class140.method1554(class182.anIntArray1829[i_73_], 1300932054);
						class182.anIntArray1848[i_73_] = (((Class298_Sub35) (Class190.aClass437_1928.get((long) class182.anIntArray1829[i_73_]))).anInt7394) * -774922497;
					}
				}
				for (int i_74_ = 0; i_74_ < class182.anIntArray1848.length; i_74_++) {
					Class190 class190 = (Class190.aClass190Array1926[class182.anIntArray1848[i_74_]]);
					if (class190.anInt1942 * 162409547 == 0) {
						d += (double) (class190.anInt1933 * 1776313545 * i);
						d_38_ += (double) (class190.anInt1934 * -739294135 * i);
						d_39_ += (double) (class190.anInt1935 * -1849369705 * i);
						bool = true;
					} else {
						anInt9785 += class190.anInt1933 * 1776313545 * i;
						anInt9789 += class190.anInt1934 * -739294135 * i;
						anInt9790 += class190.anInt1935 * -1849369705 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_38_ > 32767.0 || d_39_ > 32767.0 || d < -32767.0 || d_38_ < -32767.0 || d_39_ < -32767.0) {
					d /= 2.0;
					d_38_ /= 2.0;
					d_39_ /= 2.0;
					anInt10032 <<= 1;
				}
				aShort10036 = (short) (int) d;
				aShort10039 = (short) (int) d_38_;
				aShort10038 = (short) (int) d_39_;
			}
			anInt9785 += (((long) aShort10036 * (long) (anInt10032 << 2)) >> 23) * (long) i;
			anInt9789 += (((long) aShort10039 * (long) (anInt10032 << 2)) >> 23) * (long) i;
			anInt9790 += (((long) aShort10038 * (long) (anInt10032 << 2)) >> 23) * (long) i;
		}
	}
}
