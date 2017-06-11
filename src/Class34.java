/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

import jaggl.OpenGL;

public class Class34 {
	Class32 aClass32_399;
	int anInt400 = 1600;
	int anInt401 = 64;
	static float aFloat402;
	Interface1 anInterface1_403;
	Class32 aClass32_404;
	Class32 aClass32_405;
	int anInt406 = 768;
	RsFloatBuffer aClass298_Sub53_Sub1_407;
	int anInt408;
	float[] aFloatArray409 = new float[16];
	int[] anIntArray410;
	int[] anIntArray411;
	int[] anIntArray412;
	Class302_Sub3_Sub1[][] aClass302_Sub3_Sub1ArrayArray413;
	int anInt414 = 64;
	int anInt415;
	Class302_Sub3_Sub1[][] aClass302_Sub3_Sub1ArrayArray416;

	void method436_cp(Class_ra_Sub2 class_ra_sub2, Class69 class69, al ccat, int ci, int ca) {
		if (((Class_ra_Sub2) class_ra_sub2).aClass233_8110 != null) {
			method438(class_ra_sub2);
			float f = (((Class_ra_Sub2) class_ra_sub2).aClass233_8110.aFloatArray2594[2]);
			float f_0_ = (((Class_ra_Sub2) class_ra_sub2).aClass233_8110.aFloatArray2594[6]);
			float f_1_ = (((Class_ra_Sub2) class_ra_sub2).aClass233_8110.aFloatArray2594[10]);
			float f_2_ = (((Class_ra_Sub2) class_ra_sub2).aClass233_8110.aFloatArray2594[14]);
			try {
				int i = 0;
				int i_3_ = 2147483647;
				int i_4_ = 0;
				Class302_Sub3 class302_sub3 = class69.aClass448_680.aClass302_Sub3_5621;
				for (Class302_Sub3 class302_sub3_5_ = class302_sub3.aClass302_Sub3_7650; class302_sub3_5_ != class302_sub3; class302_sub3_5_ = class302_sub3_5_.aClass302_Sub3_7650) {
					Class302_Sub3_Sub1 class302_sub3_sub1 = (Class302_Sub3_Sub1) class302_sub3_5_;
					int i_6_ = (int) (f
							* (float) (class302_sub3_sub1.anInt9785 >> 12)
							+ f_0_
							* (float) (class302_sub3_sub1.anInt9789 >> 12)
							+ f_1_
							* (float) (class302_sub3_sub1.anInt9790 >> 12) + f_2_);
					if (i_6_ > i_4_)
						i_4_ = i_6_;
					if (i_6_ < i_3_)
						i_3_ = i_6_;
					((Class34) this).anIntArray410[i++] = i_6_;
				}
				int i_7_ = i_4_ - i_3_;
				int i_8_;
				if (i_7_ + 2 > 1600) {
					i_8_ = (1 + Class87.method970(i_7_, 1151745545) - ((Class34) this).anInt408);
					i_7_ = (i_7_ >> i_8_) + 2;
				} else {
					i_8_ = 0;
					i_7_ += 2;
				}
				Class302_Sub3 class302_sub3_9_ = class302_sub3.aClass302_Sub3_7650;
				i = 0;
				int i_10_ = -2;
				boolean bool = true;
				boolean bool_11_ = true;
				while (class302_sub3_9_ != class302_sub3) {
					((Class34) this).anInt415 = 0;
					for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
						((Class34) this).anIntArray411[i_12_] = 0;
					for (int i_13_ = 0; i_13_ < 64; i_13_++)
						((Class34) this).anIntArray412[i_13_] = 0;
					for (/**/; class302_sub3_9_ != class302_sub3; class302_sub3_9_ = class302_sub3_9_.aClass302_Sub3_7650) {
						Class302_Sub3_Sub1 class302_sub3_sub1 = (Class302_Sub3_Sub1) class302_sub3_9_;
						if (bool_11_) {
							i_10_ = class302_sub3_sub1.anInt9794;
							bool = class302_sub3_sub1.aBoolean9787;
							bool_11_ = false;
						}
						if (i > 0
								&& (i_10_ != class302_sub3_sub1.anInt9794 || bool != class302_sub3_sub1.aBoolean9787)) {
							bool_11_ = true;
							break;
						}
						int i_14_ = (((Class34) this).anIntArray410[i++] - i_3_ >> i_8_);
						if (i_14_ < 1600) {
							if (((Class34) this).anIntArray411[i_14_] < 64)
								((Class34) this).aClass302_Sub3_Sub1ArrayArray413[i_14_][((Class34) this).anIntArray411[i_14_]++] = class302_sub3_sub1;
							else {
								if (((Class34) this).anIntArray411[i_14_] == 64) {
									if (((Class34) this).anInt415 == 64)
										continue;
									((Class34) this).anIntArray411[i_14_] += 1 + ((Class34) this).anInt415++;
								}
								((Class34) this).aClass302_Sub3_Sub1ArrayArray416[(((Class34) this).anIntArray411[i_14_] - 64 - 1)][((Class34) this).anIntArray412[(((Class34) this).anIntArray411[i_14_]) - 64 - 1]++] = class302_sub3_sub1;
							}
						}
					}
					if (i_10_ >= 0)
						class_ra_sub2.method5275(i_10_);
					else
						class_ra_sub2.method5275(-1);
					if (bool
							&& (((Class_ra_Sub2) class_ra_sub2).aFloat8130 != aFloat402))
						class_ra_sub2.IA(aFloat402);
					else if (((Class_ra_Sub2) class_ra_sub2).aFloat8130 != 1.0F)
						class_ra_sub2.IA(1.0F);
					method437_cp(class_ra_sub2, i_7_, ccat, ci, ca);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method440(class_ra_sub2);
		}
	}

	void method437_cp(Class_ra_Sub2 class_ra_sub2, int i, al ccat, int ci, int ca) {
		OpenGL.glGetFloatv(2982, ((Class34) this).aFloatArray409, 0);
		float f = ((Class34) this).aFloatArray409[0];
		float f_15_ = ((Class34) this).aFloatArray409[4];
		float f_16_ = ((Class34) this).aFloatArray409[8];
		float f_17_ = ((Class34) this).aFloatArray409[1];
		float f_18_ = ((Class34) this).aFloatArray409[5];
		float f_19_ = ((Class34) this).aFloatArray409[9];
		float f_20_ = f + f_17_;
		float f_21_ = f_15_ + f_18_;
		float f_22_ = f_16_ + f_19_;
		float f_23_ = f - f_17_;
		float f_24_ = f_15_ - f_18_;
		float f_25_ = f_16_ - f_19_;
		float f_26_ = f_17_ - f;
		float f_27_ = f_18_ - f_15_;
		float f_28_ = f_19_ - f_16_;
		((Class34) this).aClass298_Sub53_Sub1_407.index = 0;
		if (((Class_ra_Sub2) class_ra_sub2).aBoolean8143) {
			for (int i_29_ = i - 1; i_29_ >= 0; i_29_--) {
				int i_30_ = (((Class34) this).anIntArray411[i_29_] > 64 ? 64
						: ((Class34) this).anIntArray411[i_29_]);
				if (i_30_ > 0) {
					for (int i_31_ = i_30_ - 1; i_31_ >= 0; i_31_--) {
						Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class34) this).aClass302_Sub3_Sub1ArrayArray413[i_29_][i_31_]);
						int i_32_ = class302_sub3_sub1.flags;
						byte i_33_ = (byte) (i_32_ >> 16);
						byte i_34_ = (byte) (i_32_ >> 8);
						byte i_35_ = (byte) i_32_;
						if(ccat.m) { 
							Color col = ccat.inc();
							i_33_ = (byte) col.getRed();
							i_34_ = (byte) col.getGreen();
							i_35_ = (byte) col.getBlue();
						} else {
							i_33_ = ccat.cr;
							i_34_ = ccat.cg;
							i_35_ = ccat.cb;
						}
						byte i_36_ = (byte) (i_32_ >>> 24);
						float f_37_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
						float f_38_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
						float f_39_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
						int i_40_ = class302_sub3_sub1.anInt9791 >> 12;
						if(ca > 0)
							i_36_ = (byte) ca;
						if(ci > 0)
							i_40_ = ci;
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_37_ + f_20_ * (float) -i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_38_ + f_21_ * (float) -i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_39_ + f_22_ * (float) -i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_33_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_34_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_35_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_36_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_37_ + f_26_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_38_ + f_27_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_39_ + f_28_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_33_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_34_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_35_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_36_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_37_ + f_20_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_38_ + f_21_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_39_ + f_22_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_33_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_34_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_35_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_36_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_37_ + f_23_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_38_ + f_24_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3658(f_39_ + f_25_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_33_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_34_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_35_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_36_);
					}
					if (((Class34) this).anIntArray411[i_29_] > 64) {
						int i_41_ = ((Class34) this).anIntArray411[i_29_] - 64 - 1;
						for (int i_42_ = ((Class34) this).anIntArray412[i_41_] - 1; i_42_ >= 0; i_42_--) {
							Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class34) this).aClass302_Sub3_Sub1ArrayArray416[i_41_][i_42_]);
							int i_43_ = class302_sub3_sub1.flags;
							byte i_44_ = (byte) (i_43_ >> 16);
							byte i_45_ = (byte) (i_43_ >> 8);
							byte i_46_ = (byte) i_43_;
							if(ccat.m) { 
								Color col = ccat.inc();
								i_44_ = (byte) col.getRed();
								i_45_ = (byte) col.getGreen();
								i_46_ = (byte) col.getBlue();
							} else {
								i_44_ = ccat.cr;
								i_45_ = ccat.cg;
								i_46_ = ccat.cb;
							}
							byte i_47_ = (byte) (i_43_ >>> 24);
							float f_48_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
							float f_49_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
							float f_50_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
							int i_51_ = class302_sub3_sub1.anInt9791 >> 12;
							if(ca > 0)
								i_47_ = (byte) ca;
							if(ci > 0)
								i_51_ = ci;
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_48_ + f_20_ * (float) -i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_49_ + f_21_ * (float) -i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_50_ + f_22_ * (float) -i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_44_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_45_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_46_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_47_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_48_ + f_26_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_49_ + f_27_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_50_ + f_28_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_44_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_45_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_46_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_47_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_48_ + f_20_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_49_ + f_21_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_50_ + f_22_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_44_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_45_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_46_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_47_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_48_ + f_23_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_49_ + f_24_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3658(f_50_ + f_25_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_44_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_45_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_46_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_47_);
						}
					}
				}
			}
		} else {
			for (int i_52_ = i - 1; i_52_ >= 0; i_52_--) {
				int i_53_ = (((Class34) this).anIntArray411[i_52_] > 64 ? 64
						: ((Class34) this).anIntArray411[i_52_]);
				if (i_53_ > 0) {
					for (int i_54_ = i_53_ - 1; i_54_ >= 0; i_54_--) {
						Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class34) this).aClass302_Sub3_Sub1ArrayArray413[i_52_][i_54_]);
						int i_55_ = class302_sub3_sub1.flags;
						byte i_56_ = (byte) (i_55_ >> 16);
						byte i_57_ = (byte) (i_55_ >> 8);
						byte i_58_ = (byte) i_55_;
						if(ccat.m) { 
							Color col = ccat.inc();
							i_56_ = (byte) col.getRed();
							i_57_ = (byte) col.getGreen();
							i_58_ = (byte) col.getBlue();
						} else {
							i_56_ = ccat.cr;
							i_57_ = ccat.cg;
							i_58_ = ccat.cb;
						}
						byte i_59_ = (byte) (i_55_ >>> 24);
						float f_60_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
						float f_61_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
						float f_62_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
						int i_63_ = class302_sub3_sub1.anInt9791 >> 12;
						if(ca > 0)
							i_59_ = (byte) ca;
						if(ci > 0)
							i_63_ = ci;
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_60_ + f_20_ * (float) -i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_61_ + f_21_ * (float) -i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_62_ + f_22_ * (float) -i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_56_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_57_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_58_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_59_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_60_ + f_26_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_61_ + f_27_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_62_ + f_28_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_56_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_57_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_58_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_59_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_60_ + f_20_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_61_ + f_21_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_62_ + f_22_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_56_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_57_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_58_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_59_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_60_ + f_23_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_61_ + f_24_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407
								.method3659(f_62_ + f_25_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_56_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_57_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_58_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(
								i_59_);
					}
					if (((Class34) this).anIntArray411[i_52_] > 64) {
						int i_64_ = ((Class34) this).anIntArray411[i_52_] - 64 - 1;
						for (int i_65_ = ((Class34) this).anIntArray412[i_64_] - 1; i_65_ >= 0; i_65_--) {
							Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class34) this).aClass302_Sub3_Sub1ArrayArray416[i_64_][i_65_]);
							int i_66_ = class302_sub3_sub1.flags;
							byte i_67_ = (byte) (i_66_ >> 16);
							byte i_68_ = (byte) (i_66_ >> 8);
							byte i_69_ = (byte) i_66_;
							if(ccat.m) { 
								Color col = ccat.inc();
								i_67_ = (byte) col.getRed();
								i_68_ = (byte) col.getGreen();
								i_69_ = (byte) col.getBlue();
							} else {
								i_67_ = ccat.cr;
								i_68_ = ccat.cg;
								i_69_ = ccat.cb;
							}
							byte i_70_ = (byte) (i_66_ >>> 24);
							float f_71_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
							float f_72_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
							float f_73_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
							int i_74_ = class302_sub3_sub1.anInt9791 >> 12;
							if(ca > 0)
								i_70_ = (byte) ca;
							if(ci > 0)
								i_74_ = ci;
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_71_ + f_20_ * (float) -i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_72_ + f_21_ * (float) -i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_73_ + f_22_ * (float) -i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_67_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_68_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_69_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_70_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_71_ + f_26_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_72_ + f_27_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_73_ + f_28_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_67_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_68_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_69_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_70_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_71_ + f_20_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_72_ + f_21_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_73_ + f_22_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_67_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_68_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_69_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_70_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_71_ + f_23_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_72_ + f_24_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.method3659(f_73_ + f_25_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_67_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_68_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_69_);
							((Class34) this).aClass298_Sub53_Sub1_407
									.writeByte(i_70_);
						}
					}
				}
			}
		}
		if (((Class34) this).aClass298_Sub53_Sub1_407.index * 385051775 != 0) {
			((Class34) this).anInterface1_403
					.method8(
							24,
							((Class34) this).aClass298_Sub53_Sub1_407.buffer,
							(((Class34) this).aClass298_Sub53_Sub1_407.index * 385051775));
			class_ra_sub2.method5248(((Class34) this).aClass32_405, null,
					((Class34) this).aClass32_399,
					((Class34) this).aClass32_404);
			class_ra_sub2
					.method5285(
							7,
							0,
							(((Class34) this).aClass298_Sub53_Sub1_407.index) * 385051775 / 24);
		}
	}
	
	void method436(Class_ra_Sub2 class_ra_sub2, Class69 class69) {
		if (((Class_ra_Sub2) class_ra_sub2).aClass233_8110 != null) {
			method438(class_ra_sub2);
			float f = (((Class_ra_Sub2) class_ra_sub2).aClass233_8110.aFloatArray2594[2]);
			float f_0_ = (((Class_ra_Sub2) class_ra_sub2).aClass233_8110.aFloatArray2594[6]);
			float f_1_ = (((Class_ra_Sub2) class_ra_sub2).aClass233_8110.aFloatArray2594[10]);
			float f_2_ = (((Class_ra_Sub2) class_ra_sub2).aClass233_8110.aFloatArray2594[14]);
			try {
				int i = 0;
				int i_3_ = 2147483647;
				int i_4_ = 0;
				Class302_Sub3 class302_sub3 = class69.aClass448_680.aClass302_Sub3_5621;
				for (Class302_Sub3 class302_sub3_5_ = class302_sub3.aClass302_Sub3_7650; class302_sub3_5_ != class302_sub3; class302_sub3_5_ = class302_sub3_5_.aClass302_Sub3_7650) {
					Class302_Sub3_Sub1 class302_sub3_sub1 = (Class302_Sub3_Sub1) class302_sub3_5_;
					int i_6_ = (int) (f * (float) (class302_sub3_sub1.anInt9785 >> 12) + f_0_ * (float) (class302_sub3_sub1.anInt9789 >> 12) + f_1_ * (float) (class302_sub3_sub1.anInt9790 >> 12) + f_2_);
					if (i_6_ > i_4_)
						i_4_ = i_6_;
					if (i_6_ < i_3_)
						i_3_ = i_6_;
					((Class34) this).anIntArray410[i++] = i_6_;
				}
				int i_7_ = i_4_ - i_3_;
				int i_8_;
				if (i_7_ + 2 > 1600) {
					i_8_ = (1 + Class87.method970(i_7_, 1151745545) - ((Class34) this).anInt408);
					i_7_ = (i_7_ >> i_8_) + 2;
				} else {
					i_8_ = 0;
					i_7_ += 2;
				}
				Class302_Sub3 class302_sub3_9_ = class302_sub3.aClass302_Sub3_7650;
				i = 0;
				int i_10_ = -2;
				boolean bool = true;
				boolean bool_11_ = true;
				while (class302_sub3_9_ != class302_sub3) {
					((Class34) this).anInt415 = 0;
					for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
						((Class34) this).anIntArray411[i_12_] = 0;
					for (int i_13_ = 0; i_13_ < 64; i_13_++)
						((Class34) this).anIntArray412[i_13_] = 0;
					for (/**/; class302_sub3_9_ != class302_sub3; class302_sub3_9_ = class302_sub3_9_.aClass302_Sub3_7650) {
						Class302_Sub3_Sub1 class302_sub3_sub1 = (Class302_Sub3_Sub1) class302_sub3_9_;
						if (bool_11_) {
							i_10_ = class302_sub3_sub1.anInt9794;
							bool = class302_sub3_sub1.aBoolean9787;
							bool_11_ = false;
						}
						if (i > 0 && (i_10_ != class302_sub3_sub1.anInt9794 || bool != class302_sub3_sub1.aBoolean9787)) {
							bool_11_ = true;
							break;
						}
						int i_14_ = (((Class34) this).anIntArray410[i++] - i_3_ >> i_8_);
						if (i_14_ < 1600) {
							if (((Class34) this).anIntArray411[i_14_] < 64)
								((Class34) this).aClass302_Sub3_Sub1ArrayArray413[i_14_][((Class34) this).anIntArray411[i_14_]++] = class302_sub3_sub1;
							else {
								if (((Class34) this).anIntArray411[i_14_] == 64) {
									if (((Class34) this).anInt415 == 64)
										continue;
									((Class34) this).anIntArray411[i_14_] += 1 + ((Class34) this).anInt415++;
								}
								((Class34) this).aClass302_Sub3_Sub1ArrayArray416[(((Class34) this).anIntArray411[i_14_] - 64 - 1)][((Class34) this).anIntArray412[(((Class34) this).anIntArray411[i_14_]) - 64 - 1]++] = class302_sub3_sub1;
							}
						}
					}
					if (i_10_ >= 0)
						class_ra_sub2.method5275(i_10_);
					else
						class_ra_sub2.method5275(-1);
					if (bool && (((Class_ra_Sub2) class_ra_sub2).aFloat8130 != aFloat402))
						class_ra_sub2.IA(aFloat402);
					else if (((Class_ra_Sub2) class_ra_sub2).aFloat8130 != 1.0F)
						class_ra_sub2.IA(1.0F);
					method437(class_ra_sub2, i_7_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method440(class_ra_sub2);
		}
	}

	void method437(Class_ra_Sub2 class_ra_sub2, int i) {
		OpenGL.glGetFloatv(2982, ((Class34) this).aFloatArray409, 0);
		float f = ((Class34) this).aFloatArray409[0];
		float f_15_ = ((Class34) this).aFloatArray409[4];
		float f_16_ = ((Class34) this).aFloatArray409[8];
		float f_17_ = ((Class34) this).aFloatArray409[1];
		float f_18_ = ((Class34) this).aFloatArray409[5];
		float f_19_ = ((Class34) this).aFloatArray409[9];
		float f_20_ = f + f_17_;
		float f_21_ = f_15_ + f_18_;
		float f_22_ = f_16_ + f_19_;
		float f_23_ = f - f_17_;
		float f_24_ = f_15_ - f_18_;
		float f_25_ = f_16_ - f_19_;
		float f_26_ = f_17_ - f;
		float f_27_ = f_18_ - f_15_;
		float f_28_ = f_19_ - f_16_;
		((Class34) this).aClass298_Sub53_Sub1_407.index = 0;
		if (((Class_ra_Sub2) class_ra_sub2).aBoolean8143) {
			for (int i_29_ = i - 1; i_29_ >= 0; i_29_--) {
				int i_30_ = (((Class34) this).anIntArray411[i_29_] > 64 ? 64 : ((Class34) this).anIntArray411[i_29_]);
				if (i_30_ > 0) {
					for (int i_31_ = i_30_ - 1; i_31_ >= 0; i_31_--) {
						Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class34) this).aClass302_Sub3_Sub1ArrayArray413[i_29_][i_31_]);
						int i_32_ = class302_sub3_sub1.flags;
						byte i_33_ = (byte) (i_32_ >> 16);
						byte i_34_ = (byte) (i_32_ >> 8);
						byte i_35_ = (byte) i_32_;
						byte i_36_ = (byte) (i_32_ >>> 24);
						float f_37_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
						float f_38_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
						float f_39_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
						int i_40_ = class302_sub3_sub1.anInt9791 >> 12;
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_37_ + f_20_ * (float) -i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_38_ + f_21_ * (float) -i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_39_ + f_22_ * (float) -i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_33_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_34_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_35_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_36_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_37_ + f_26_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_38_ + f_27_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_39_ + f_28_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_33_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_34_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_35_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_36_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_37_ + f_20_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_38_ + f_21_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_39_ + f_22_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_33_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_34_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_35_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_36_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_37_ + f_23_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_38_ + f_24_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_39_ + f_25_ * (float) i_40_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_33_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_34_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_35_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_36_);
					}
					if (((Class34) this).anIntArray411[i_29_] > 64) {
						int i_41_ = ((Class34) this).anIntArray411[i_29_] - 64 - 1;
						for (int i_42_ = ((Class34) this).anIntArray412[i_41_] - 1; i_42_ >= 0; i_42_--) {
							Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class34) this).aClass302_Sub3_Sub1ArrayArray416[i_41_][i_42_]);
							int i_43_ = class302_sub3_sub1.flags;
							byte i_44_ = (byte) (i_43_ >> 16);
							byte i_45_ = (byte) (i_43_ >> 8);
							byte i_46_ = (byte) i_43_;
							byte i_47_ = (byte) (i_43_ >>> 24);
							float f_48_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
							float f_49_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
							float f_50_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
							int i_51_ = class302_sub3_sub1.anInt9791 >> 12;
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_48_ + f_20_ * (float) -i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_49_ + f_21_ * (float) -i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_50_ + f_22_ * (float) -i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_44_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_45_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_46_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_47_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_48_ + f_26_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_49_ + f_27_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_50_ + f_28_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_44_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_45_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_46_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_47_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_48_ + f_20_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_49_ + f_21_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_50_ + f_22_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_44_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_45_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_46_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_47_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_48_ + f_23_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_49_ + f_24_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3658(f_50_ + f_25_ * (float) i_51_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_44_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_45_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_46_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_47_);
						}
					}
				}
			}
		} else {
			for (int i_52_ = i - 1; i_52_ >= 0; i_52_--) {
				int i_53_ = (((Class34) this).anIntArray411[i_52_] > 64 ? 64 : ((Class34) this).anIntArray411[i_52_]);
				if (i_53_ > 0) {
					for (int i_54_ = i_53_ - 1; i_54_ >= 0; i_54_--) {
						Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class34) this).aClass302_Sub3_Sub1ArrayArray413[i_52_][i_54_]);
						int i_55_ = class302_sub3_sub1.flags;
						byte i_56_ = (byte) (i_55_ >> 16);
						byte i_57_ = (byte) (i_55_ >> 8);
						byte i_58_ = (byte) i_55_;
						byte i_59_ = (byte) (i_55_ >>> 24);
						float f_60_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
						float f_61_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
						float f_62_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
						int i_63_ = class302_sub3_sub1.anInt9791 >> 12;
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_60_ + f_20_ * (float) -i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_61_ + f_21_ * (float) -i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_62_ + f_22_ * (float) -i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_56_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_57_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_58_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_59_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_60_ + f_26_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_61_ + f_27_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_62_ + f_28_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_56_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_57_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_58_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_59_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_60_ + f_20_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_61_ + f_21_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_62_ + f_22_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_56_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_57_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_58_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_59_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(1.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(0.0F);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_60_ + f_23_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_61_ + f_24_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_62_ + f_25_ * (float) i_63_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_56_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_57_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_58_);
						((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_59_);
					}
					if (((Class34) this).anIntArray411[i_52_] > 64) {
						int i_64_ = ((Class34) this).anIntArray411[i_52_] - 64 - 1;
						for (int i_65_ = ((Class34) this).anIntArray412[i_64_] - 1; i_65_ >= 0; i_65_--) {
							Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class34) this).aClass302_Sub3_Sub1ArrayArray416[i_64_][i_65_]);
							int i_66_ = class302_sub3_sub1.flags;
							byte i_67_ = (byte) (i_66_ >> 16);
							byte i_68_ = (byte) (i_66_ >> 8);
							byte i_69_ = (byte) i_66_;
							byte i_70_ = (byte) (i_66_ >>> 24);
							float f_71_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
							float f_72_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
							float f_73_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
							int i_74_ = class302_sub3_sub1.anInt9791 >> 12;
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_71_ + f_20_ * (float) -i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_72_ + f_21_ * (float) -i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_73_ + f_22_ * (float) -i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_67_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_68_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_69_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_70_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_71_ + f_26_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_72_ + f_27_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_73_ + f_28_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_67_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_68_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_69_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_70_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_71_ + f_20_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_72_ + f_21_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_73_ + f_22_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_67_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_68_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_69_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_70_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(1.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(0.0F);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_71_ + f_23_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_72_ + f_24_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.method3659(f_73_ + f_25_ * (float) i_74_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_67_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_68_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_69_);
							((Class34) this).aClass298_Sub53_Sub1_407.writeByte(i_70_);
						}
					}
				}
			}
		}
		if (((Class34) this).aClass298_Sub53_Sub1_407.index * 385051775 != 0) {
			((Class34) this).anInterface1_403.method8(24, ((Class34) this).aClass298_Sub53_Sub1_407.buffer, (((Class34) this).aClass298_Sub53_Sub1_407.index * 385051775));
			class_ra_sub2.method5248(((Class34) this).aClass32_405, null, ((Class34) this).aClass32_399, ((Class34) this).aClass32_404);
			class_ra_sub2.method5285(7, 0, (((Class34) this).aClass298_Sub53_Sub1_407.index) * 385051775 / 24);
		}
	}

	void method438(Class_ra_Sub2 class_ra_sub2) {
		aFloat402 = ((Class_ra_Sub2) class_ra_sub2).aFloat8130;
		class_ra_sub2.method5252();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class_ra_sub2.method5281(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	Class34() {
		((Class34) this).aClass298_Sub53_Sub1_407 = new RsFloatBuffer(786336);
		((Class34) this).anInt401 = 64;
		((Class34) this).anInt406 = 768;
		((Class34) this).anInt400 = 1600;
		((Class34) this).anInt408 = Class87.method970(1600, -1704489835);
		((Class34) this).anInt414 = 64;
		((Class34) this).anIntArray410 = new int[8191];
		((Class34) this).anIntArray411 = new int[1600];
		((Class34) this).anIntArray412 = new int[64];
		((Class34) this).aClass302_Sub3_Sub1ArrayArray413 = new Class302_Sub3_Sub1[1600][64];
		((Class34) this).aClass302_Sub3_Sub1ArrayArray416 = new Class302_Sub3_Sub1[64][768];
		((Class34) this).anInt415 = 0;
	}

	void method439(Class_ra_Sub2 class_ra_sub2) {
		((Class34) this).anInterface1_403 = class_ra_sub2.method5244(24, null, 196584, true);
		((Class34) this).aClass32_404 = new Class32(((Class34) this).anInterface1_403, 5126, 2, 0);
		((Class34) this).aClass32_405 = new Class32(((Class34) this).anInterface1_403, 5126, 3, 8);
		((Class34) this).aClass32_399 = new Class32(((Class34) this).anInterface1_403, 5121, 4, 20);
	}

	void method440(Class_ra_Sub2 class_ra_sub2) {
		class_ra_sub2.method5281(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (((Class_ra_Sub2) class_ra_sub2).aFloat8130 != aFloat402)
			class_ra_sub2.IA(aFloat402);
	}
}
