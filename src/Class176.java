/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.nio.ByteBuffer;

public class Class176 {
	Interface7_Impl1 anInterface7_Impl1_1771;
	Class302_Sub3_Sub1[][] aClass302_Sub3_Sub1ArrayArray1772;
	Interface7_Impl1 anInterface7_Impl1_1773;
	Class153 aClass153_1774;
	int anInt1775 = 64;
	int anInt1776 = 768;
	int anInt1777;
	Interface7_Impl2 anInterface7_Impl2_1778;
	int anInt1779 = 64;
	int[] anIntArray1780;
	int[] anIntArray1781;
	int[] anIntArray1782;
	int anInt1783;
	Class302_Sub3_Sub1[][] aClass302_Sub3_Sub1ArrayArray1784;
	int anInt1785 = 1600;
	static float aFloat1786;

	void method1827(Class_ra_Sub3 class_ra_sub3) {
		((Class176) this).anInterface7_Impl1_1773.method72(786336, 24);
	}

	void method1828() {
		((Class176) this).anInterface7_Impl1_1773.b();
	}
	
	void method1829_cp(Class_ra_Sub3 class_ra_sub3, Class69 class69, al ccat, int ci, int ca) {
		class_ra_sub3.RA(false);
		aFloat1786 = class_ra_sub3.aFloat8291;
		float f = class_ra_sub3.aClass233_8230.aFloatArray2594[2];
		float f_0_ = class_ra_sub3.aClass233_8230.aFloatArray2594[6];
		float f_1_ = class_ra_sub3.aClass233_8230.aFloatArray2594[10];
		float f_2_ = class_ra_sub3.aClass233_8230.aFloatArray2594[14];
		int i = 0;
		int i_3_ = 2147483647;
		int i_4_ = 0;
		Class302_Sub3 class302_sub3 = class69.aClass448_680.aClass302_Sub3_5621;
		for (Class302_Sub3 class302_sub3_5_ = class302_sub3.aClass302_Sub3_7650; class302_sub3_5_ != class302_sub3; class302_sub3_5_ = class302_sub3_5_.aClass302_Sub3_7650) {
			Class302_Sub3_Sub1 class302_sub3_sub1 = (Class302_Sub3_Sub1) class302_sub3_5_;
			int i_6_ = (int) (f * (float) (class302_sub3_sub1.anInt9785 >> 12)
					+ f_0_ * (float) (class302_sub3_sub1.anInt9789 >> 12)
					+ f_1_ * (float) (class302_sub3_sub1.anInt9790 >> 12) + f_2_);
			if (i_6_ > i_4_)
				i_4_ = i_6_;
			if (i_6_ < i_3_)
				i_3_ = i_6_;
			((Class176) this).anIntArray1780[i++] = i_6_;
		}
		int i_7_ = i_4_ - i_3_;
		int i_8_;
		if (i_7_ + 2 > 1600) {
			i_8_ = (1 + Class87.method970(i_7_, -1647802809) - ((Class176) this).anInt1783);
			i_7_ = (i_7_ >> i_8_) + 2;
		} else {
			i_8_ = 0;
			i_7_ += 2;
		}
		Class302_Sub3 class302_sub3_9_ = class302_sub3.aClass302_Sub3_7650;
		i = 0;
		class_ra_sub3.method5384(((Class176) this).anInterface7_Impl2_1778);
		Class130 class130 = ((Class_ra_Sub3) class_ra_sub3).aClass130_8249;
		class130.method1452(Matrix4f.aClass233_2595);
		class130.aClass233_1494.method2172();
		class130.anInt1493 = -1;
		int i_10_ = -2;
		boolean bool = true;
		boolean bool_11_ = true;
		while (class302_sub3_9_ != class302_sub3) {
			((Class176) this).anInt1777 = 0;
			for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
				((Class176) this).anIntArray1781[i_12_] = 0;
			for (int i_13_ = 0; i_13_ < 64; i_13_++)
				((Class176) this).anIntArray1782[i_13_] = 0;
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
				int i_14_ = ((Class176) this).anIntArray1780[i++] - i_3_ >> i_8_;
				if (i_14_ < 1600) {
					if (((Class176) this).anIntArray1781[i_14_] < 64)
						((Class176) this).aClass302_Sub3_Sub1ArrayArray1772[i_14_][((Class176) this).anIntArray1781[i_14_]++] = class302_sub3_sub1;
					else {
						if (((Class176) this).anIntArray1781[i_14_] == 64) {
							if (((Class176) this).anInt1777 == 64)
								continue;
							((Class176) this).anIntArray1781[i_14_] += 1 + ((Class176) this).anInt1777++;
						}
						((Class176) this).aClass302_Sub3_Sub1ArrayArray1784[((Class176) this).anIntArray1781[i_14_] - 64 - 1][((Class176) this).anIntArray1782[(((Class176) this).anIntArray1781[i_14_] - 64 - 1)]++] = class302_sub3_sub1;
					}
				}
			}
			class130.anInterface9_Impl2_1492 = ((Class_ra_Sub3) class_ra_sub3).aClass157_8351
					.method1698(i_10_ >= 0 ? i_10_ : -1);
			if (bool && class_ra_sub3.aFloat8291 != aFloat1786)
				class_ra_sub3.IA(aFloat1786);
			else if (class_ra_sub3.aFloat8291 != 1.0F)
				class_ra_sub3.IA(1.0F);
			method1830_cp(class_ra_sub3, i_7_, ccat, ci, ca);
		}
		if (class_ra_sub3.aFloat8291 != aFloat1786)
			class_ra_sub3.IA(aFloat1786);
		class_ra_sub3.RA(true);
	}

	void method1830_cp(Class_ra_Sub3 class_ra_sub3, int i, al ccat, int ci, int ca) {
		int i_15_ = 0;
		Matrix4f class233 = class_ra_sub3.aClass233_8230;
		float f = class233.aFloatArray2594[0];
		float f_16_ = class233.aFloatArray2594[4];
		float f_17_ = class233.aFloatArray2594[8];
		float f_18_ = class233.aFloatArray2594[1];
		float f_19_ = class233.aFloatArray2594[5];
		float f_20_ = class233.aFloatArray2594[9];
		float f_21_ = f + f_18_;
		float f_22_ = f_16_ + f_19_;
		float f_23_ = f_17_ + f_20_;
		float f_24_ = f - f_18_;
		float f_25_ = f_16_ - f_19_;
		float f_26_ = f_17_ - f_20_;
		float f_27_ = f_18_ - f;
		float f_28_ = f_19_ - f_16_;
		float f_29_ = f_20_ - f_17_;
		ByteBuffer bytebuffer = class_ra_sub3.aByteBuffer8216;
		bytebuffer.clear();
		for (int i_30_ = i - 1; i_30_ >= 0; i_30_--) {
			int i_31_ = (((Class176) this).anIntArray1781[i_30_] > 64 ? 64
					: ((Class176) this).anIntArray1781[i_30_]);
			if (i_31_ > 0) {
				for (int i_32_ = i_31_ - 1; i_32_ >= 0; i_32_--) {
					Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class176) this).aClass302_Sub3_Sub1ArrayArray1772[i_30_][i_32_]);
					int i_33_ = class302_sub3_sub1.flags;
					byte i_34_ = (byte) (i_33_ >> 16);
					byte i_35_ = (byte) (i_33_ >> 8);
					byte i_36_ = (byte) i_33_;
					if(ccat.m) { 
						Color col = ccat.inc();
						i_34_ = (byte) col.getRed();
						i_35_ = (byte) col.getGreen();
						i_36_ = (byte) col.getBlue();
					} else {
						i_34_ = ccat.cr;
						i_35_ = ccat.cg;
						i_36_ = ccat.cb;
					}
					byte i_37_ = (byte) (i_33_ >>> 24);
					float f_38_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
					float f_39_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
					float f_40_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
					int i_41_ = class302_sub3_sub1.anInt9791 >> 12;
					if(ca > 0)
						i_37_ = (byte) ca;
					if(ci > 0)
						i_41_ = ci;
					// >> Position offsets?
					bytebuffer.putFloat(f_38_ + f_21_ * (float) -i_41_);
					bytebuffer.putFloat(f_39_ + f_22_ * (float) -i_41_);
					bytebuffer.putFloat(f_40_ + f_23_ * (float) -i_41_);
					// << Position offsets?
					if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
						bytebuffer.put(i_36_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_34_);
						bytebuffer.put(i_37_);
					} else {
						bytebuffer.put(i_34_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_36_);
						bytebuffer.put(i_37_);
					}
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(f_38_ + f_27_ * (float) i_41_);
					bytebuffer.putFloat(f_39_ + f_28_ * (float) i_41_);
					bytebuffer.putFloat(f_40_ + f_29_ * (float) i_41_);
					if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
						bytebuffer.put(i_36_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_34_);
						bytebuffer.put(i_37_);
					} else {
						bytebuffer.put(i_34_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_36_);
						bytebuffer.put(i_37_);
					}
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(f_38_ + f_21_ * (float) i_41_);
					bytebuffer.putFloat(f_39_ + f_22_ * (float) i_41_);
					bytebuffer.putFloat(f_40_ + f_23_ * (float) i_41_);
					if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
						bytebuffer.put(i_36_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_34_);
						bytebuffer.put(i_37_);
					} else {
						bytebuffer.put(i_34_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_36_);
						bytebuffer.put(i_37_);
					}
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(f_38_ + f_24_ * (float) i_41_);
					bytebuffer.putFloat(f_39_ + f_25_ * (float) i_41_);
					bytebuffer.putFloat(f_40_ + f_26_ * (float) i_41_);
					if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
						bytebuffer.put(i_36_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_34_);
						bytebuffer.put(i_37_);
					} else {
						bytebuffer.put(i_34_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_36_);
						bytebuffer.put(i_37_);
					}
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(0.0F);
					i_15_++;
				}
				if (((Class176) this).anIntArray1781[i_30_] > 64) {
					int i_42_ = ((Class176) this).anIntArray1781[i_30_] - 64 - 1;
					for (int i_43_ = ((Class176) this).anIntArray1782[i_42_] - 1; i_43_ >= 0; i_43_--) {
						Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class176) this).aClass302_Sub3_Sub1ArrayArray1784[i_42_][i_43_]);
						int i_44_ = class302_sub3_sub1.flags;
						byte i_45_ = (byte) (i_44_ >> 16);
						byte i_46_ = (byte) (i_44_ >> 8);
						byte i_47_ = (byte) i_44_;
						if(ccat.m) { 
							Color col = ccat.inc();
							i_45_ = (byte) col.getRed();
							i_46_ = (byte) col.getGreen();
							i_47_ = (byte) col.getBlue();
						} else {
							i_45_ = ccat.cr;
							i_46_ = ccat.cg;
							i_47_ = ccat.cb;
						}
						byte i_48_ = (byte) (i_44_ >>> 24);
						float f_49_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
						float f_50_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
						float f_51_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
						int i_52_ = class302_sub3_sub1.anInt9791 >> 12;
						if(ci > 0)
							i_52_ = ci;
						if(ca > 0)
							i_48_ = (byte) ca;
						bytebuffer.putFloat(f_49_ + f_21_ * (float) -i_52_);
						bytebuffer.putFloat(f_50_ + f_22_ * (float) -i_52_);
						bytebuffer.putFloat(f_51_ + f_23_ * (float) -i_52_);
						if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
							bytebuffer.put(i_47_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_45_);
							bytebuffer.put(i_48_);
						} else {
							bytebuffer.put(i_45_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_47_);
							bytebuffer.put(i_48_);
						}
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_49_ + f_27_ * (float) i_52_);
						bytebuffer.putFloat(f_50_ + f_28_ * (float) i_52_);
						bytebuffer.putFloat(f_51_ + f_29_ * (float) i_52_);
						if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
							bytebuffer.put(i_47_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_45_);
							bytebuffer.put(i_48_);
						} else {
							bytebuffer.put(i_45_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_47_);
							bytebuffer.put(i_48_);
						}
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_49_ + f_21_ * (float) i_52_);
						bytebuffer.putFloat(f_50_ + f_22_ * (float) i_52_);
						bytebuffer.putFloat(f_51_ + f_23_ * (float) i_52_);
						if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
							bytebuffer.put(i_47_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_45_);
							bytebuffer.put(i_48_);
						} else {
							bytebuffer.put(i_45_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_47_);
							bytebuffer.put(i_48_);
						}
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_49_ + f_24_ * (float) i_52_);
						bytebuffer.putFloat(f_50_ + f_25_ * (float) i_52_);
						bytebuffer.putFloat(f_51_ + f_26_ * (float) i_52_);
						if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
							bytebuffer.put(i_47_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_45_);
							bytebuffer.put(i_48_);
						} else {
							bytebuffer.put(i_45_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_47_);
							bytebuffer.put(i_48_);
						}
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
						i_15_++;
					}
				}
			}
		}
		((Class176) this).anInterface7_Impl1_1773.method63(0, bytebuffer
				.position(), class_ra_sub3.aLong8217);
		class_ra_sub3.method5383(0, ((Class176) this).anInterface7_Impl1_1773);
		class_ra_sub3.method5383(1, ((Class176) this).anInterface7_Impl1_1771);
		class_ra_sub3.method5455(((Class176) this).aClass153_1774);
		Class130 class130 = ((Class_ra_Sub3) class_ra_sub3).aClass130_8249;
		class130.method1450(i_15_);
	}
	
	void method1829(Class_ra_Sub3 class_ra_sub3, Class69 class69) {
		class_ra_sub3.RA(false);
		aFloat1786 = class_ra_sub3.aFloat8291;
		float f = class_ra_sub3.aClass233_8230.aFloatArray2594[2];
		float f_0_ = class_ra_sub3.aClass233_8230.aFloatArray2594[6];
		float f_1_ = class_ra_sub3.aClass233_8230.aFloatArray2594[10];
		float f_2_ = class_ra_sub3.aClass233_8230.aFloatArray2594[14];
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
			((Class176) this).anIntArray1780[i++] = i_6_;
		}
		int i_7_ = i_4_ - i_3_;
		int i_8_;
		if (i_7_ + 2 > 1600) {
			i_8_ = (1 + Class87.method970(i_7_, -1647802809) - ((Class176) this).anInt1783);
			i_7_ = (i_7_ >> i_8_) + 2;
		} else {
			i_8_ = 0;
			i_7_ += 2;
		}
		Class302_Sub3 class302_sub3_9_ = class302_sub3.aClass302_Sub3_7650;
		i = 0;
		class_ra_sub3.method5384(((Class176) this).anInterface7_Impl2_1778);
		Class130 class130 = ((Class_ra_Sub3) class_ra_sub3).aClass130_8249;
		class130.method1452(Matrix4f.aClass233_2595);
		class130.aClass233_1494.method2172();
		class130.anInt1493 = -1;
		int i_10_ = -2;
		boolean bool = true;
		boolean bool_11_ = true;
		while (class302_sub3_9_ != class302_sub3) {
			((Class176) this).anInt1777 = 0;
			for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
				((Class176) this).anIntArray1781[i_12_] = 0;
			for (int i_13_ = 0; i_13_ < 64; i_13_++)
				((Class176) this).anIntArray1782[i_13_] = 0;
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
				int i_14_ = ((Class176) this).anIntArray1780[i++] - i_3_ >> i_8_;
				if (i_14_ < 1600) {
					if (((Class176) this).anIntArray1781[i_14_] < 64)
						((Class176) this).aClass302_Sub3_Sub1ArrayArray1772[i_14_][((Class176) this).anIntArray1781[i_14_]++] = class302_sub3_sub1;
					else {
						if (((Class176) this).anIntArray1781[i_14_] == 64) {
							if (((Class176) this).anInt1777 == 64)
								continue;
							((Class176) this).anIntArray1781[i_14_] += 1 + ((Class176) this).anInt1777++;
						}
						((Class176) this).aClass302_Sub3_Sub1ArrayArray1784[((Class176) this).anIntArray1781[i_14_] - 64 - 1][((Class176) this).anIntArray1782[(((Class176) this).anIntArray1781[i_14_] - 64 - 1)]++] = class302_sub3_sub1;
					}
				}
			}
			class130.anInterface9_Impl2_1492 = ((Class_ra_Sub3) class_ra_sub3).aClass157_8351.method1698(i_10_ >= 0 ? i_10_ : -1);
			if (bool && class_ra_sub3.aFloat8291 != aFloat1786)
				class_ra_sub3.IA(aFloat1786);
			else if (class_ra_sub3.aFloat8291 != 1.0F)
				class_ra_sub3.IA(1.0F);
			method1830(class_ra_sub3, i_7_);
		}
		if (class_ra_sub3.aFloat8291 != aFloat1786)
			class_ra_sub3.IA(aFloat1786);
		class_ra_sub3.RA(true);
	}

	void method1830(Class_ra_Sub3 class_ra_sub3, int i) {
		int i_15_ = 0;
		Matrix4f class233 = class_ra_sub3.aClass233_8230;
		float f = class233.aFloatArray2594[0];
		float f_16_ = class233.aFloatArray2594[4];
		float f_17_ = class233.aFloatArray2594[8];
		float f_18_ = class233.aFloatArray2594[1];
		float f_19_ = class233.aFloatArray2594[5];
		float f_20_ = class233.aFloatArray2594[9];
		float f_21_ = f + f_18_;
		float f_22_ = f_16_ + f_19_;
		float f_23_ = f_17_ + f_20_;
		float f_24_ = f - f_18_;
		float f_25_ = f_16_ - f_19_;
		float f_26_ = f_17_ - f_20_;
		float f_27_ = f_18_ - f;
		float f_28_ = f_19_ - f_16_;
		float f_29_ = f_20_ - f_17_;
		ByteBuffer bytebuffer = class_ra_sub3.aByteBuffer8216;
		bytebuffer.clear();
		for (int i_30_ = i - 1; i_30_ >= 0; i_30_--) {
			int i_31_ = (((Class176) this).anIntArray1781[i_30_] > 64 ? 64 : ((Class176) this).anIntArray1781[i_30_]);
			if (i_31_ > 0) {
				for (int i_32_ = i_31_ - 1; i_32_ >= 0; i_32_--) {
					Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class176) this).aClass302_Sub3_Sub1ArrayArray1772[i_30_][i_32_]);
					int i_33_ = class302_sub3_sub1.flags;
					byte i_34_ = (byte) (i_33_ >> 16);
					byte i_35_ = (byte) (i_33_ >> 8);
					byte i_36_ = (byte) i_33_;
					byte i_37_ = (byte) (i_33_ >>> 24);
					float f_38_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
					float f_39_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
					float f_40_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
					int i_41_ = class302_sub3_sub1.anInt9791 >> 12;
					bytebuffer.putFloat(f_38_ + f_21_ * (float) -i_41_);
					bytebuffer.putFloat(f_39_ + f_22_ * (float) -i_41_);
					bytebuffer.putFloat(f_40_ + f_23_ * (float) -i_41_);
					if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
						bytebuffer.put(i_36_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_34_);
						bytebuffer.put(i_37_);
					} else {
						bytebuffer.put(i_34_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_36_);
						bytebuffer.put(i_37_);
					}
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(f_38_ + f_27_ * (float) i_41_);
					bytebuffer.putFloat(f_39_ + f_28_ * (float) i_41_);
					bytebuffer.putFloat(f_40_ + f_29_ * (float) i_41_);
					if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
						bytebuffer.put(i_36_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_34_);
						bytebuffer.put(i_37_);
					} else {
						bytebuffer.put(i_34_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_36_);
						bytebuffer.put(i_37_);
					}
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(f_38_ + f_21_ * (float) i_41_);
					bytebuffer.putFloat(f_39_ + f_22_ * (float) i_41_);
					bytebuffer.putFloat(f_40_ + f_23_ * (float) i_41_);
					if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
						bytebuffer.put(i_36_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_34_);
						bytebuffer.put(i_37_);
					} else {
						bytebuffer.put(i_34_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_36_);
						bytebuffer.put(i_37_);
					}
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(f_38_ + f_24_ * (float) i_41_);
					bytebuffer.putFloat(f_39_ + f_25_ * (float) i_41_);
					bytebuffer.putFloat(f_40_ + f_26_ * (float) i_41_);
					if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
						bytebuffer.put(i_36_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_34_);
						bytebuffer.put(i_37_);
					} else {
						bytebuffer.put(i_34_);
						bytebuffer.put(i_35_);
						bytebuffer.put(i_36_);
						bytebuffer.put(i_37_);
					}
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(0.0F);
					i_15_++;
				}
				if (((Class176) this).anIntArray1781[i_30_] > 64) {
					int i_42_ = ((Class176) this).anIntArray1781[i_30_] - 64 - 1;
					for (int i_43_ = ((Class176) this).anIntArray1782[i_42_] - 1; i_43_ >= 0; i_43_--) {
						Class302_Sub3_Sub1 class302_sub3_sub1 = (((Class176) this).aClass302_Sub3_Sub1ArrayArray1784[i_42_][i_43_]);
						int i_44_ = class302_sub3_sub1.flags;
						byte i_45_ = (byte) (i_44_ >> 16);
						byte i_46_ = (byte) (i_44_ >> 8);
						byte i_47_ = (byte) i_44_;
						byte i_48_ = (byte) (i_44_ >>> 24);
						float f_49_ = (float) (class302_sub3_sub1.anInt9785 >> 12);
						float f_50_ = (float) (class302_sub3_sub1.anInt9789 >> 12);
						float f_51_ = (float) (class302_sub3_sub1.anInt9790 >> 12);
						int i_52_ = class302_sub3_sub1.anInt9791 >> 12;
						bytebuffer.putFloat(f_49_ + f_21_ * (float) -i_52_);
						bytebuffer.putFloat(f_50_ + f_22_ * (float) -i_52_);
						bytebuffer.putFloat(f_51_ + f_23_ * (float) -i_52_);
						if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
							bytebuffer.put(i_47_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_45_);
							bytebuffer.put(i_48_);
						} else {
							bytebuffer.put(i_45_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_47_);
							bytebuffer.put(i_48_);
						}
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_49_ + f_27_ * (float) i_52_);
						bytebuffer.putFloat(f_50_ + f_28_ * (float) i_52_);
						bytebuffer.putFloat(f_51_ + f_29_ * (float) i_52_);
						if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
							bytebuffer.put(i_47_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_45_);
							bytebuffer.put(i_48_);
						} else {
							bytebuffer.put(i_45_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_47_);
							bytebuffer.put(i_48_);
						}
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_49_ + f_21_ * (float) i_52_);
						bytebuffer.putFloat(f_50_ + f_22_ * (float) i_52_);
						bytebuffer.putFloat(f_51_ + f_23_ * (float) i_52_);
						if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
							bytebuffer.put(i_47_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_45_);
							bytebuffer.put(i_48_);
						} else {
							bytebuffer.put(i_45_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_47_);
							bytebuffer.put(i_48_);
						}
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_49_ + f_24_ * (float) i_52_);
						bytebuffer.putFloat(f_50_ + f_25_ * (float) i_52_);
						bytebuffer.putFloat(f_51_ + f_26_ * (float) i_52_);
						if (((Class_ra_Sub3) class_ra_sub3).anInt8346 == 0) {
							bytebuffer.put(i_47_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_45_);
							bytebuffer.put(i_48_);
						} else {
							bytebuffer.put(i_45_);
							bytebuffer.put(i_46_);
							bytebuffer.put(i_47_);
							bytebuffer.put(i_48_);
						}
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
						i_15_++;
					}
				}
			}
		}
		((Class176) this).anInterface7_Impl1_1773.method63(0, bytebuffer.position(), class_ra_sub3.aLong8217);
		class_ra_sub3.method5383(0, ((Class176) this).anInterface7_Impl1_1773);
		class_ra_sub3.method5383(1, ((Class176) this).anInterface7_Impl1_1771);
		class_ra_sub3.method5455(((Class176) this).aClass153_1774);
		Class130 class130 = ((Class_ra_Sub3) class_ra_sub3).aClass130_8249;
		class130.method1450(i_15_);
	}

	Class176(Class_ra_Sub3 class_ra_sub3) {
		((Class176) this).anInt1783 = Class87.method970(1600, 308928473);
		((Class176) this).anInt1779 = 64;
		((Class176) this).anIntArray1780 = new int[8191];
		((Class176) this).anIntArray1781 = new int[1600];
		((Class176) this).anIntArray1782 = new int[64];
		((Class176) this).aClass302_Sub3_Sub1ArrayArray1772 = new Class302_Sub3_Sub1[1600][64];
		((Class176) this).aClass302_Sub3_Sub1ArrayArray1784 = new Class302_Sub3_Sub1[64][768];
		((Class176) this).anInt1777 = 0;
		((Class176) this).aClass153_1774 = (class_ra_sub3.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1597, Class155.aClass155_1599 }), new Class181(Class155.aClass155_1596) }));
		((Class176) this).anInterface7_Impl1_1773 = class_ra_sub3.method5382(true);
		((Class176) this).anInterface7_Impl1_1771 = class_ra_sub3.method5382(false);
		((Class176) this).anInterface7_Impl1_1771.method72(393168, 12);
		((Class176) this).anInterface7_Impl2_1778 = class_ra_sub3.method5381(false);
		((Class176) this).anInterface7_Impl2_1778.method113(49146);
		ByteBuffer bytebuffer = class_ra_sub3.aByteBuffer8216;
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			int i_53_ = i * 4;
			bytebuffer.putShort((short) i_53_);
			bytebuffer.putShort((short) (i_53_ + 1));
			bytebuffer.putShort((short) (i_53_ + 2));
			bytebuffer.putShort((short) (i_53_ + 2));
			bytebuffer.putShort((short) (i_53_ + 3));
			bytebuffer.putShort((short) i_53_);
		}
		((Class176) this).anInterface7_Impl2_1778.method63(0, bytebuffer.position(), class_ra_sub3.aLong8217);
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
		}
		((Class176) this).anInterface7_Impl1_1771.method63(0, bytebuffer.position(), class_ra_sub3.aLong8217);
	}
}
