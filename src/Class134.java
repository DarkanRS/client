
/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class134 {
	static float aFloat1600;
	Class282_Sub35_Sub1 aClass282_Sub35_Sub1_1601;
	Interface14 anInterface14_1602;
	Class143 aClass143_1603;
	int[] anIntArray1604;
	Class143 aClass143_1605;
	int anInt1606 = 64;
	Class275_Sub1_Sub1[][] aClass275_Sub1_Sub1ArrayArray1607;
	int anInt1608 = 1600;
	int anInt1609;
	int anInt1610 = 64;
	int[] anIntArray1611;
	int anInt1612 = 768;
	float[] aFloatArray1613 = new float[16];
	Class275_Sub1_Sub1[][] aClass275_Sub1_Sub1ArrayArray1614;
	int[] anIntArray1615;
	int anInt1616;
	Class143 aClass143_1617;

	void method2327(Class505_Sub1 class505_sub1, Class151 class151) {
		if (((Class505_Sub1) class505_sub1).aClass384_8348 != null) {
			method2331(class505_sub1);
			float f = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[2]);
			float f_0_ = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[6]);
			float f_1_ = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[10]);
			float f_2_ = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[14]);
			try {
				int i = 0;
				int i_3_ = 2147483647;
				int i_4_ = 0;
				Class275_Sub1 class275_sub1 = class151.aClass464_1961.aClass275_Sub1_5554;
				for (Class275_Sub1 class275_sub1_5_ = class275_sub1.aClass275_Sub1_7706; class275_sub1_5_ != class275_sub1; class275_sub1_5_ = class275_sub1_5_.aClass275_Sub1_7706) {
					Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_5_;
					int i_6_ = (int) (f * (float) (class275_sub1_sub1.anInt10205 >> 12) + (f_0_ * (float) (class275_sub1_sub1.anInt10208 >> 12)) + (f_1_ * (float) (class275_sub1_sub1.anInt10202 >> 12)) + f_2_);
					if (i_6_ > i_4_)
						i_4_ = i_6_;
					if (i_6_ < i_3_)
						i_3_ = i_6_;
					((Class134) this).anIntArray1611[i++] = i_6_;
				}
				int i_7_ = i_4_ - i_3_;
				int i_8_;
				if (i_7_ + 2 > 1600) {
					i_8_ = (1 + Class159.method2739(i_7_, -1020005198) - ((Class134) this).anInt1609);
					i_7_ = (i_7_ >> i_8_) + 2;
				} else {
					i_8_ = 0;
					i_7_ += 2;
				}
				Class275_Sub1 class275_sub1_9_ = class275_sub1.aClass275_Sub1_7706;
				i = 0;
				int i_10_ = -2;
				boolean bool = true;
				boolean bool_11_ = true;
				while (class275_sub1_9_ != class275_sub1) {
					((Class134) this).anInt1616 = 0;
					for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
						((Class134) this).anIntArray1615[i_12_] = 0;
					for (int i_13_ = 0; i_13_ < 64; i_13_++)
						((Class134) this).anIntArray1604[i_13_] = 0;
					for (/**/; class275_sub1_9_ != class275_sub1; class275_sub1_9_ = class275_sub1_9_.aClass275_Sub1_7706) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_9_;
						if (bool_11_) {
							i_10_ = class275_sub1_sub1.anInt10207;
							bool = class275_sub1_sub1.aBool10210;
							bool_11_ = false;
						}
						if (i > 0 && (i_10_ != class275_sub1_sub1.anInt10207 || bool != class275_sub1_sub1.aBool10210)) {
							bool_11_ = true;
							break;
						}
						int i_14_ = (((Class134) this).anIntArray1611[i++] - i_3_ >> i_8_);
						if (i_14_ < 1600) {
							if (((Class134) this).anIntArray1615[i_14_] < 64)
								((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_14_][((Class134) this).anIntArray1615[i_14_]++] = class275_sub1_sub1;
							else {
								if (((Class134) this).anIntArray1615[i_14_] == 64) {
									if (((Class134) this).anInt1616 == 64)
										continue;
									((Class134) this).anIntArray1615[i_14_] += 1 + ((Class134) this).anInt1616++;
								}
								((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[(((Class134) this).anIntArray1615[i_14_] - 64 - 1)][((Class134) this).anIntArray1604[(((Class134) this).anIntArray1615[i_14_]) - 64 - 1]++] = class275_sub1_sub1;
							}
						}
					}
					if (i_10_ >= 0)
						class505_sub1.method13581(i_10_);
					else
						class505_sub1.method13581(-1);
					if (bool && (((Class505_Sub1) class505_sub1).aFloat8432 != aFloat1600))
						class505_sub1.IA(aFloat1600);
					else if (((Class505_Sub1) class505_sub1).aFloat8432 != 1.0F)
						class505_sub1.IA(1.0F);
					method2330(class505_sub1, i_7_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2332(class505_sub1);
		}
	}

	void method2328(Class505_Sub1 class505_sub1) {
		((Class134) this).anInterface14_1602 = class505_sub1.method13599(24, null, 196584, true);
		((Class134) this).aClass143_1617 = new Class143(((Class134) this).anInterface14_1602, 5126, 2, 0);
		((Class134) this).aClass143_1603 = new Class143(((Class134) this).anInterface14_1602, 5126, 3, 8);
		((Class134) this).aClass143_1605 = new Class143(((Class134) this).anInterface14_1602, 5121, 4, 20);
	}

	void method2329(Class505_Sub1 class505_sub1, Class151 class151) {
		if (((Class505_Sub1) class505_sub1).aClass384_8348 != null) {
			method2331(class505_sub1);
			float f = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[2]);
			float f_15_ = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[6]);
			float f_16_ = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[10]);
			float f_17_ = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[14]);
			try {
				int i = 0;
				int i_18_ = 2147483647;
				int i_19_ = 0;
				Class275_Sub1 class275_sub1 = class151.aClass464_1961.aClass275_Sub1_5554;
				for (Class275_Sub1 class275_sub1_20_ = class275_sub1.aClass275_Sub1_7706; class275_sub1_20_ != class275_sub1; class275_sub1_20_ = class275_sub1_20_.aClass275_Sub1_7706) {
					Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_20_;
					int i_21_ = (int) (f * (float) (class275_sub1_sub1.anInt10205 >> 12) + (f_15_ * (float) (class275_sub1_sub1.anInt10208 >> 12)) + (f_16_ * (float) (class275_sub1_sub1.anInt10202 >> 12)) + f_17_);
					if (i_21_ > i_19_)
						i_19_ = i_21_;
					if (i_21_ < i_18_)
						i_18_ = i_21_;
					((Class134) this).anIntArray1611[i++] = i_21_;
				}
				int i_22_ = i_19_ - i_18_;
				int i_23_;
				if (i_22_ + 2 > 1600) {
					i_23_ = (1 + Class159.method2739(i_22_, 1005279071) - ((Class134) this).anInt1609);
					i_22_ = (i_22_ >> i_23_) + 2;
				} else {
					i_23_ = 0;
					i_22_ += 2;
				}
				Class275_Sub1 class275_sub1_24_ = class275_sub1.aClass275_Sub1_7706;
				i = 0;
				int i_25_ = -2;
				boolean bool = true;
				boolean bool_26_ = true;
				while (class275_sub1_24_ != class275_sub1) {
					((Class134) this).anInt1616 = 0;
					for (int i_27_ = 0; i_27_ < i_22_; i_27_++)
						((Class134) this).anIntArray1615[i_27_] = 0;
					for (int i_28_ = 0; i_28_ < 64; i_28_++)
						((Class134) this).anIntArray1604[i_28_] = 0;
					for (/**/; class275_sub1_24_ != class275_sub1; class275_sub1_24_ = class275_sub1_24_.aClass275_Sub1_7706) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_24_;
						if (bool_26_) {
							i_25_ = class275_sub1_sub1.anInt10207;
							bool = class275_sub1_sub1.aBool10210;
							bool_26_ = false;
						}
						if (i > 0 && (i_25_ != class275_sub1_sub1.anInt10207 || bool != class275_sub1_sub1.aBool10210)) {
							bool_26_ = true;
							break;
						}
						int i_29_ = (((Class134) this).anIntArray1611[i++] - i_18_ >> i_23_);
						if (i_29_ < 1600) {
							if (((Class134) this).anIntArray1615[i_29_] < 64)
								((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_29_][((Class134) this).anIntArray1615[i_29_]++] = class275_sub1_sub1;
							else {
								if (((Class134) this).anIntArray1615[i_29_] == 64) {
									if (((Class134) this).anInt1616 == 64)
										continue;
									((Class134) this).anIntArray1615[i_29_] += 1 + ((Class134) this).anInt1616++;
								}
								((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[(((Class134) this).anIntArray1615[i_29_] - 64 - 1)][((Class134) this).anIntArray1604[(((Class134) this).anIntArray1615[i_29_]) - 64 - 1]++] = class275_sub1_sub1;
							}
						}
					}
					if (i_25_ >= 0)
						class505_sub1.method13581(i_25_);
					else
						class505_sub1.method13581(-1);
					if (bool && (((Class505_Sub1) class505_sub1).aFloat8432 != aFloat1600))
						class505_sub1.IA(aFloat1600);
					else if (((Class505_Sub1) class505_sub1).aFloat8432 != 1.0F)
						class505_sub1.IA(1.0F);
					method2330(class505_sub1, i_22_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2332(class505_sub1);
		}
	}

	void method2330(Class505_Sub1 class505_sub1, int i) {
		OpenGL.glGetFloatv(2982, ((Class134) this).aFloatArray1613, 0);
		float f = ((Class134) this).aFloatArray1613[0];
		float f_30_ = ((Class134) this).aFloatArray1613[4];
		float f_31_ = ((Class134) this).aFloatArray1613[8];
		float f_32_ = ((Class134) this).aFloatArray1613[1];
		float f_33_ = ((Class134) this).aFloatArray1613[5];
		float f_34_ = ((Class134) this).aFloatArray1613[9];
		float f_35_ = f + f_32_;
		float f_36_ = f_30_ + f_33_;
		float f_37_ = f_31_ + f_34_;
		float f_38_ = f - f_32_;
		float f_39_ = f_30_ - f_33_;
		float f_40_ = f_31_ - f_34_;
		float f_41_ = f_32_ - f;
		float f_42_ = f_33_ - f_30_;
		float f_43_ = f_34_ - f_31_;
		((Class134) this).aClass282_Sub35_Sub1_1601.index = 0;
		if (((Class505_Sub1) class505_sub1).aBool8467) {
			for (int i_44_ = i - 1; i_44_ >= 0; i_44_--) {
				int i_45_ = (((Class134) this).anIntArray1615[i_44_] > 64 ? 64 : ((Class134) this).anIntArray1615[i_44_]);
				if (i_45_ > 0) {
					for (int i_46_ = i_45_ - 1; i_46_ >= 0; i_46_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_44_][i_46_]);
						int i_47_ = class275_sub1_sub1.anInt10209;
						byte i_48_ = (byte) (i_47_ >> 16);
						byte i_49_ = (byte) (i_47_ >> 8);
						byte i_50_ = (byte) i_47_;
						byte i_51_ = (byte) (i_47_ >>> 24);
						float f_52_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_53_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_54_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_55_ = class275_sub1_sub1.anInt10206 >> 12;
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_52_ + f_35_ * (float) -i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_53_ + f_36_ * (float) -i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_54_ + f_37_ * (float) -i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_48_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_49_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_50_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_51_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_52_ + f_41_ * (float) i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_53_ + f_42_ * (float) i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_54_ + f_43_ * (float) i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_48_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_49_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_50_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_51_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_52_ + f_35_ * (float) i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_53_ + f_36_ * (float) i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_54_ + f_37_ * (float) i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_48_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_49_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_50_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_51_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_52_ + f_38_ * (float) i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_53_ + f_39_ * (float) i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_54_ + f_40_ * (float) i_55_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_48_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_49_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_50_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_51_);
					}
					if (((Class134) this).anIntArray1615[i_44_] > 64) {
						int i_56_ = ((Class134) this).anIntArray1615[i_44_] - 64 - 1;
						for (int i_57_ = ((Class134) this).anIntArray1604[i_56_] - 1; i_57_ >= 0; i_57_--) {
							Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[i_56_][i_57_]);
							int i_58_ = class275_sub1_sub1.anInt10209;
							byte i_59_ = (byte) (i_58_ >> 16);
							byte i_60_ = (byte) (i_58_ >> 8);
							byte i_61_ = (byte) i_58_;
							byte i_62_ = (byte) (i_58_ >>> 24);
							float f_63_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
							float f_64_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
							float f_65_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
							int i_66_ = class275_sub1_sub1.anInt10206 >> 12;
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_63_ + f_35_ * (float) -i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_64_ + f_36_ * (float) -i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_65_ + f_37_ * (float) -i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_59_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_60_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_61_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_62_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_63_ + f_41_ * (float) i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_64_ + f_42_ * (float) i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_65_ + f_43_ * (float) i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_59_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_60_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_61_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_62_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_63_ + f_35_ * (float) i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_64_ + f_36_ * (float) i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_65_ + f_37_ * (float) i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_59_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_60_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_61_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_62_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_63_ + f_38_ * (float) i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_64_ + f_39_ * (float) i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_65_ + f_40_ * (float) i_66_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_59_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_60_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_61_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_62_);
						}
					}
				}
			}
		} else {
			for (int i_67_ = i - 1; i_67_ >= 0; i_67_--) {
				int i_68_ = (((Class134) this).anIntArray1615[i_67_] > 64 ? 64 : ((Class134) this).anIntArray1615[i_67_]);
				if (i_68_ > 0) {
					for (int i_69_ = i_68_ - 1; i_69_ >= 0; i_69_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_67_][i_69_]);
						int i_70_ = class275_sub1_sub1.anInt10209;
						byte i_71_ = (byte) (i_70_ >> 16);
						byte i_72_ = (byte) (i_70_ >> 8);
						byte i_73_ = (byte) i_70_;
						byte i_74_ = (byte) (i_70_ >>> 24);
						float f_75_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_76_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_77_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_78_ = class275_sub1_sub1.anInt10206 >> 12;
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_75_ + f_35_ * (float) -i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_76_ + f_36_ * (float) -i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_77_ + f_37_ * (float) -i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_71_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_72_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_73_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_74_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_75_ + f_41_ * (float) i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_76_ + f_42_ * (float) i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_77_ + f_43_ * (float) i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_71_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_72_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_73_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_74_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_75_ + f_35_ * (float) i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_76_ + f_36_ * (float) i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_77_ + f_37_ * (float) i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_71_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_72_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_73_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_74_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_75_ + f_38_ * (float) i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_76_ + f_39_ * (float) i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_77_ + f_40_ * (float) i_78_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_71_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_72_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_73_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_74_);
					}
					if (((Class134) this).anIntArray1615[i_67_] > 64) {
						int i_79_ = ((Class134) this).anIntArray1615[i_67_] - 64 - 1;
						for (int i_80_ = ((Class134) this).anIntArray1604[i_79_] - 1; i_80_ >= 0; i_80_--) {
							Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[i_79_][i_80_]);
							int i_81_ = class275_sub1_sub1.anInt10209;
							byte i_82_ = (byte) (i_81_ >> 16);
							byte i_83_ = (byte) (i_81_ >> 8);
							byte i_84_ = (byte) i_81_;
							byte i_85_ = (byte) (i_81_ >>> 24);
							float f_86_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
							float f_87_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
							float f_88_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
							int i_89_ = class275_sub1_sub1.anInt10206 >> 12;
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_86_ + f_35_ * (float) -i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_87_ + f_36_ * (float) -i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_88_ + f_37_ * (float) -i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_82_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_83_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_84_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_85_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_86_ + f_41_ * (float) i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_87_ + f_42_ * (float) i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_88_ + f_43_ * (float) i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_82_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_83_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_84_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_85_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_86_ + f_35_ * (float) i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_87_ + f_36_ * (float) i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_88_ + f_37_ * (float) i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_82_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_83_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_84_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_85_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_86_ + f_38_ * (float) i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_87_ + f_39_ * (float) i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_88_ + f_40_ * (float) i_89_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_82_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_83_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_84_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_85_);
						}
					}
				}
			}
		}
		if (((Class134) this).aClass282_Sub35_Sub1_1601.index * -1990677291 != 0) {
			((Class134) this).anInterface14_1602.method106(24, ((Class134) this).aClass282_Sub35_Sub1_1601.buffer, (((Class134) this).aClass282_Sub35_Sub1_1601.index * -1990677291));
			class505_sub1.method13647(((Class134) this).aClass143_1603, null, ((Class134) this).aClass143_1605, ((Class134) this).aClass143_1617);
			class505_sub1.method13603(7, 0, (((Class134) this).aClass282_Sub35_Sub1_1601.index) * -1990677291 / 24);
		}
	}

	void method2331(Class505_Sub1 class505_sub1) {
		aFloat1600 = ((Class505_Sub1) class505_sub1).aFloat8432;
		class505_sub1.method13607();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class505_sub1.method13623(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2332(Class505_Sub1 class505_sub1) {
		class505_sub1.method13623(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (((Class505_Sub1) class505_sub1).aFloat8432 != aFloat1600)
			class505_sub1.IA(aFloat1600);
	}

	void method2333(Class505_Sub1 class505_sub1) {
		((Class134) this).anInterface14_1602 = class505_sub1.method13599(24, null, 196584, true);
		((Class134) this).aClass143_1617 = new Class143(((Class134) this).anInterface14_1602, 5126, 2, 0);
		((Class134) this).aClass143_1603 = new Class143(((Class134) this).anInterface14_1602, 5126, 3, 8);
		((Class134) this).aClass143_1605 = new Class143(((Class134) this).anInterface14_1602, 5121, 4, 20);
	}

	void method2334(Class505_Sub1 class505_sub1) {
		class505_sub1.method13623(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (((Class505_Sub1) class505_sub1).aFloat8432 != aFloat1600)
			class505_sub1.IA(aFloat1600);
	}

	void method2335(Class505_Sub1 class505_sub1, Class151 class151) {
		if (((Class505_Sub1) class505_sub1).aClass384_8348 != null) {
			method2331(class505_sub1);
			float f = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[2]);
			float f_90_ = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[6]);
			float f_91_ = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[10]);
			float f_92_ = (((Class505_Sub1) class505_sub1).aClass384_8348.aFloatArray4667[14]);
			try {
				int i = 0;
				int i_93_ = 2147483647;
				int i_94_ = 0;
				Class275_Sub1 class275_sub1 = class151.aClass464_1961.aClass275_Sub1_5554;
				for (Class275_Sub1 class275_sub1_95_ = class275_sub1.aClass275_Sub1_7706; class275_sub1_95_ != class275_sub1; class275_sub1_95_ = class275_sub1_95_.aClass275_Sub1_7706) {
					Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_95_;
					int i_96_ = (int) (f * (float) (class275_sub1_sub1.anInt10205 >> 12) + (f_90_ * (float) (class275_sub1_sub1.anInt10208 >> 12)) + (f_91_ * (float) (class275_sub1_sub1.anInt10202 >> 12)) + f_92_);
					if (i_96_ > i_94_)
						i_94_ = i_96_;
					if (i_96_ < i_93_)
						i_93_ = i_96_;
					((Class134) this).anIntArray1611[i++] = i_96_;
				}
				int i_97_ = i_94_ - i_93_;
				int i_98_;
				if (i_97_ + 2 > 1600) {
					i_98_ = (1 + Class159.method2739(i_97_, -433287163) - ((Class134) this).anInt1609);
					i_97_ = (i_97_ >> i_98_) + 2;
				} else {
					i_98_ = 0;
					i_97_ += 2;
				}
				Class275_Sub1 class275_sub1_99_ = class275_sub1.aClass275_Sub1_7706;
				i = 0;
				int i_100_ = -2;
				boolean bool = true;
				boolean bool_101_ = true;
				while (class275_sub1_99_ != class275_sub1) {
					((Class134) this).anInt1616 = 0;
					for (int i_102_ = 0; i_102_ < i_97_; i_102_++)
						((Class134) this).anIntArray1615[i_102_] = 0;
					for (int i_103_ = 0; i_103_ < 64; i_103_++)
						((Class134) this).anIntArray1604[i_103_] = 0;
					for (/**/; class275_sub1_99_ != class275_sub1; class275_sub1_99_ = class275_sub1_99_.aClass275_Sub1_7706) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_99_;
						if (bool_101_) {
							i_100_ = class275_sub1_sub1.anInt10207;
							bool = class275_sub1_sub1.aBool10210;
							bool_101_ = false;
						}
						if (i > 0 && (i_100_ != class275_sub1_sub1.anInt10207 || bool != class275_sub1_sub1.aBool10210)) {
							bool_101_ = true;
							break;
						}
						int i_104_ = (((Class134) this).anIntArray1611[i++] - i_93_ >> i_98_);
						if (i_104_ < 1600) {
							if (((Class134) this).anIntArray1615[i_104_] < 64)
								((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_104_][((Class134) this).anIntArray1615[i_104_]++] = class275_sub1_sub1;
							else {
								if (((Class134) this).anIntArray1615[i_104_] == 64) {
									if (((Class134) this).anInt1616 == 64)
										continue;
									((Class134) this).anIntArray1615[i_104_] += 1 + ((Class134) this).anInt1616++;
								}
								((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[(((Class134) this).anIntArray1615[i_104_] - 64 - 1)][((Class134) this).anIntArray1604[(((Class134) this).anIntArray1615[i_104_]) - 64 - 1]++] = class275_sub1_sub1;
							}
						}
					}
					if (i_100_ >= 0)
						class505_sub1.method13581(i_100_);
					else
						class505_sub1.method13581(-1);
					if (bool && (((Class505_Sub1) class505_sub1).aFloat8432 != aFloat1600))
						class505_sub1.IA(aFloat1600);
					else if (((Class505_Sub1) class505_sub1).aFloat8432 != 1.0F)
						class505_sub1.IA(1.0F);
					method2330(class505_sub1, i_97_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2332(class505_sub1);
		}
	}

	void method2336(Class505_Sub1 class505_sub1) {
		((Class134) this).anInterface14_1602 = class505_sub1.method13599(24, null, 196584, true);
		((Class134) this).aClass143_1617 = new Class143(((Class134) this).anInterface14_1602, 5126, 2, 0);
		((Class134) this).aClass143_1603 = new Class143(((Class134) this).anInterface14_1602, 5126, 3, 8);
		((Class134) this).aClass143_1605 = new Class143(((Class134) this).anInterface14_1602, 5121, 4, 20);
	}

	void method2337(Class505_Sub1 class505_sub1, int i) {
		OpenGL.glGetFloatv(2982, ((Class134) this).aFloatArray1613, 0);
		float f = ((Class134) this).aFloatArray1613[0];
		float f_105_ = ((Class134) this).aFloatArray1613[4];
		float f_106_ = ((Class134) this).aFloatArray1613[8];
		float f_107_ = ((Class134) this).aFloatArray1613[1];
		float f_108_ = ((Class134) this).aFloatArray1613[5];
		float f_109_ = ((Class134) this).aFloatArray1613[9];
		float f_110_ = f + f_107_;
		float f_111_ = f_105_ + f_108_;
		float f_112_ = f_106_ + f_109_;
		float f_113_ = f - f_107_;
		float f_114_ = f_105_ - f_108_;
		float f_115_ = f_106_ - f_109_;
		float f_116_ = f_107_ - f;
		float f_117_ = f_108_ - f_105_;
		float f_118_ = f_109_ - f_106_;
		((Class134) this).aClass282_Sub35_Sub1_1601.index = 0;
		if (((Class505_Sub1) class505_sub1).aBool8467) {
			for (int i_119_ = i - 1; i_119_ >= 0; i_119_--) {
				int i_120_ = (((Class134) this).anIntArray1615[i_119_] > 64 ? 64 : ((Class134) this).anIntArray1615[i_119_]);
				if (i_120_ > 0) {
					for (int i_121_ = i_120_ - 1; i_121_ >= 0; i_121_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_119_][i_121_]);
						int i_122_ = class275_sub1_sub1.anInt10209;
						byte i_123_ = (byte) (i_122_ >> 16);
						byte i_124_ = (byte) (i_122_ >> 8);
						byte i_125_ = (byte) i_122_;
						byte i_126_ = (byte) (i_122_ >>> 24);
						float f_127_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_128_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_129_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_130_ = class275_sub1_sub1.anInt10206 >> 12;
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_127_ + f_110_ * (float) -i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_128_ + f_111_ * (float) -i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_129_ + f_112_ * (float) -i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_123_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_124_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_125_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_126_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_127_ + f_116_ * (float) i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_128_ + f_117_ * (float) i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_129_ + f_118_ * (float) i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_123_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_124_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_125_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_126_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_127_ + f_110_ * (float) i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_128_ + f_111_ * (float) i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_129_ + f_112_ * (float) i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_123_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_124_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_125_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_126_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_127_ + f_113_ * (float) i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_128_ + f_114_ * (float) i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_129_ + f_115_ * (float) i_130_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_123_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_124_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_125_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_126_);
					}
					if (((Class134) this).anIntArray1615[i_119_] > 64) {
						int i_131_ = (((Class134) this).anIntArray1615[i_119_] - 64 - 1);
						for (int i_132_ = (((Class134) this).anIntArray1604[i_131_]) - 1; i_132_ >= 0; i_132_--) {
							Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[i_131_][i_132_]);
							int i_133_ = class275_sub1_sub1.anInt10209;
							byte i_134_ = (byte) (i_133_ >> 16);
							byte i_135_ = (byte) (i_133_ >> 8);
							byte i_136_ = (byte) i_133_;
							byte i_137_ = (byte) (i_133_ >>> 24);
							float f_138_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
							float f_139_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
							float f_140_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
							int i_141_ = class275_sub1_sub1.anInt10206 >> 12;
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_138_ + f_110_ * (float) -i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_139_ + f_111_ * (float) -i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_140_ + f_112_ * (float) -i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_134_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_135_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_136_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_137_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_138_ + f_116_ * (float) i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_139_ + f_117_ * (float) i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_140_ + f_118_ * (float) i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_134_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_135_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_136_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_137_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_138_ + f_110_ * (float) i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_139_ + f_111_ * (float) i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_140_ + f_112_ * (float) i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_134_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_135_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_136_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_137_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_138_ + f_113_ * (float) i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_139_ + f_114_ * (float) i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_140_ + f_115_ * (float) i_141_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_134_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_135_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_136_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_137_);
						}
					}
				}
			}
		} else {
			for (int i_142_ = i - 1; i_142_ >= 0; i_142_--) {
				int i_143_ = (((Class134) this).anIntArray1615[i_142_] > 64 ? 64 : ((Class134) this).anIntArray1615[i_142_]);
				if (i_143_ > 0) {
					for (int i_144_ = i_143_ - 1; i_144_ >= 0; i_144_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_142_][i_144_]);
						int i_145_ = class275_sub1_sub1.anInt10209;
						byte i_146_ = (byte) (i_145_ >> 16);
						byte i_147_ = (byte) (i_145_ >> 8);
						byte i_148_ = (byte) i_145_;
						byte i_149_ = (byte) (i_145_ >>> 24);
						float f_150_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_151_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_152_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_153_ = class275_sub1_sub1.anInt10206 >> 12;
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_150_ + f_110_ * (float) -i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_151_ + f_111_ * (float) -i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_152_ + f_112_ * (float) -i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_146_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_147_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_148_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_149_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_150_ + f_116_ * (float) i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_151_ + f_117_ * (float) i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_152_ + f_118_ * (float) i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_146_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_147_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_148_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_149_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_150_ + f_110_ * (float) i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_151_ + f_111_ * (float) i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_152_ + f_112_ * (float) i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_146_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_147_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_148_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_149_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_150_ + f_113_ * (float) i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_151_ + f_114_ * (float) i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_152_ + f_115_ * (float) i_153_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_146_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_147_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_148_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_149_);
					}
					if (((Class134) this).anIntArray1615[i_142_] > 64) {
						int i_154_ = (((Class134) this).anIntArray1615[i_142_] - 64 - 1);
						for (int i_155_ = (((Class134) this).anIntArray1604[i_154_]) - 1; i_155_ >= 0; i_155_--) {
							Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[i_154_][i_155_]);
							int i_156_ = class275_sub1_sub1.anInt10209;
							byte i_157_ = (byte) (i_156_ >> 16);
							byte i_158_ = (byte) (i_156_ >> 8);
							byte i_159_ = (byte) i_156_;
							byte i_160_ = (byte) (i_156_ >>> 24);
							float f_161_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
							float f_162_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
							float f_163_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
							int i_164_ = class275_sub1_sub1.anInt10206 >> 12;
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_161_ + f_110_ * (float) -i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_162_ + f_111_ * (float) -i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_163_ + f_112_ * (float) -i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_157_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_158_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_159_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_160_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_161_ + f_116_ * (float) i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_162_ + f_117_ * (float) i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_163_ + f_118_ * (float) i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_157_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_158_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_159_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_160_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_161_ + f_110_ * (float) i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_162_ + f_111_ * (float) i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_163_ + f_112_ * (float) i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_157_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_158_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_159_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_160_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_161_ + f_113_ * (float) i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_162_ + f_114_ * (float) i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_163_ + f_115_ * (float) i_164_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_157_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_158_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_159_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_160_);
						}
					}
				}
			}
		}
		if (((Class134) this).aClass282_Sub35_Sub1_1601.index * -1990677291 != 0) {
			((Class134) this).anInterface14_1602.method106(24, ((Class134) this).aClass282_Sub35_Sub1_1601.buffer, (((Class134) this).aClass282_Sub35_Sub1_1601.index * -1990677291));
			class505_sub1.method13647(((Class134) this).aClass143_1603, null, ((Class134) this).aClass143_1605, ((Class134) this).aClass143_1617);
			class505_sub1.method13603(7, 0, (((Class134) this).aClass282_Sub35_Sub1_1601.index) * -1990677291 / 24);
		}
	}

	Class134() {
		((Class134) this).aClass282_Sub35_Sub1_1601 = new Class282_Sub35_Sub1(786336);
		((Class134) this).anInt1606 = 64;
		((Class134) this).anInt1612 = 768;
		((Class134) this).anInt1608 = 1600;
		((Class134) this).anInt1609 = Class159.method2739(1600, 725171944);
		((Class134) this).anInt1610 = 64;
		((Class134) this).anIntArray1611 = new int[8191];
		((Class134) this).anIntArray1615 = new int[1600];
		((Class134) this).anIntArray1604 = new int[64];
		((Class134) this).aClass275_Sub1_Sub1ArrayArray1614 = new Class275_Sub1_Sub1[1600][64];
		((Class134) this).aClass275_Sub1_Sub1ArrayArray1607 = new Class275_Sub1_Sub1[64][768];
		((Class134) this).anInt1616 = 0;
	}

	void method2338(Class505_Sub1 class505_sub1, int i) {
		OpenGL.glGetFloatv(2982, ((Class134) this).aFloatArray1613, 0);
		float f = ((Class134) this).aFloatArray1613[0];
		float f_165_ = ((Class134) this).aFloatArray1613[4];
		float f_166_ = ((Class134) this).aFloatArray1613[8];
		float f_167_ = ((Class134) this).aFloatArray1613[1];
		float f_168_ = ((Class134) this).aFloatArray1613[5];
		float f_169_ = ((Class134) this).aFloatArray1613[9];
		float f_170_ = f + f_167_;
		float f_171_ = f_165_ + f_168_;
		float f_172_ = f_166_ + f_169_;
		float f_173_ = f - f_167_;
		float f_174_ = f_165_ - f_168_;
		float f_175_ = f_166_ - f_169_;
		float f_176_ = f_167_ - f;
		float f_177_ = f_168_ - f_165_;
		float f_178_ = f_169_ - f_166_;
		((Class134) this).aClass282_Sub35_Sub1_1601.index = 0;
		if (((Class505_Sub1) class505_sub1).aBool8467) {
			for (int i_179_ = i - 1; i_179_ >= 0; i_179_--) {
				int i_180_ = (((Class134) this).anIntArray1615[i_179_] > 64 ? 64 : ((Class134) this).anIntArray1615[i_179_]);
				if (i_180_ > 0) {
					for (int i_181_ = i_180_ - 1; i_181_ >= 0; i_181_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_179_][i_181_]);
						int i_182_ = class275_sub1_sub1.anInt10209;
						byte i_183_ = (byte) (i_182_ >> 16);
						byte i_184_ = (byte) (i_182_ >> 8);
						byte i_185_ = (byte) i_182_;
						byte i_186_ = (byte) (i_182_ >>> 24);
						float f_187_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_188_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_189_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_190_ = class275_sub1_sub1.anInt10206 >> 12;
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_187_ + f_170_ * (float) -i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_188_ + f_171_ * (float) -i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_189_ + f_172_ * (float) -i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_183_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_184_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_185_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_186_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_187_ + f_176_ * (float) i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_188_ + f_177_ * (float) i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_189_ + f_178_ * (float) i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_183_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_184_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_185_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_186_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_187_ + f_170_ * (float) i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_188_ + f_171_ * (float) i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_189_ + f_172_ * (float) i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_183_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_184_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_185_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_186_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_187_ + f_173_ * (float) i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_188_ + f_174_ * (float) i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_189_ + f_175_ * (float) i_190_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_183_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_184_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_185_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_186_);
					}
					if (((Class134) this).anIntArray1615[i_179_] > 64) {
						int i_191_ = (((Class134) this).anIntArray1615[i_179_] - 64 - 1);
						for (int i_192_ = (((Class134) this).anIntArray1604[i_191_]) - 1; i_192_ >= 0; i_192_--) {
							Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[i_191_][i_192_]);
							int i_193_ = class275_sub1_sub1.anInt10209;
							byte i_194_ = (byte) (i_193_ >> 16);
							byte i_195_ = (byte) (i_193_ >> 8);
							byte i_196_ = (byte) i_193_;
							byte i_197_ = (byte) (i_193_ >>> 24);
							float f_198_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
							float f_199_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
							float f_200_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
							int i_201_ = class275_sub1_sub1.anInt10206 >> 12;
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_198_ + f_170_ * (float) -i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_199_ + f_171_ * (float) -i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_200_ + f_172_ * (float) -i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_194_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_195_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_196_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_197_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_198_ + f_176_ * (float) i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_199_ + f_177_ * (float) i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_200_ + f_178_ * (float) i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_194_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_195_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_196_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_197_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_198_ + f_170_ * (float) i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_199_ + f_171_ * (float) i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_200_ + f_172_ * (float) i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_194_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_195_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_196_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_197_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_198_ + f_173_ * (float) i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_199_ + f_174_ * (float) i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_200_ + f_175_ * (float) i_201_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_194_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_195_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_196_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_197_);
						}
					}
				}
			}
		} else {
			for (int i_202_ = i - 1; i_202_ >= 0; i_202_--) {
				int i_203_ = (((Class134) this).anIntArray1615[i_202_] > 64 ? 64 : ((Class134) this).anIntArray1615[i_202_]);
				if (i_203_ > 0) {
					for (int i_204_ = i_203_ - 1; i_204_ >= 0; i_204_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_202_][i_204_]);
						int i_205_ = class275_sub1_sub1.anInt10209;
						byte i_206_ = (byte) (i_205_ >> 16);
						byte i_207_ = (byte) (i_205_ >> 8);
						byte i_208_ = (byte) i_205_;
						byte i_209_ = (byte) (i_205_ >>> 24);
						float f_210_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_211_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_212_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_213_ = class275_sub1_sub1.anInt10206 >> 12;
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_210_ + f_170_ * (float) -i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_211_ + f_171_ * (float) -i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_212_ + f_172_ * (float) -i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_206_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_207_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_208_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_209_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_210_ + f_176_ * (float) i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_211_ + f_177_ * (float) i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_212_ + f_178_ * (float) i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_206_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_207_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_208_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_209_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_210_ + f_170_ * (float) i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_211_ + f_171_ * (float) i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_212_ + f_172_ * (float) i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_206_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_207_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_208_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_209_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_210_ + f_173_ * (float) i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_211_ + f_174_ * (float) i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_212_ + f_175_ * (float) i_213_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_206_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_207_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_208_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_209_);
					}
					if (((Class134) this).anIntArray1615[i_202_] > 64) {
						int i_214_ = (((Class134) this).anIntArray1615[i_202_] - 64 - 1);
						for (int i_215_ = (((Class134) this).anIntArray1604[i_214_]) - 1; i_215_ >= 0; i_215_--) {
							Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[i_214_][i_215_]);
							int i_216_ = class275_sub1_sub1.anInt10209;
							byte i_217_ = (byte) (i_216_ >> 16);
							byte i_218_ = (byte) (i_216_ >> 8);
							byte i_219_ = (byte) i_216_;
							byte i_220_ = (byte) (i_216_ >>> 24);
							float f_221_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
							float f_222_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
							float f_223_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
							int i_224_ = class275_sub1_sub1.anInt10206 >> 12;
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_221_ + f_170_ * (float) -i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_222_ + f_171_ * (float) -i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_223_ + f_172_ * (float) -i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_217_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_218_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_219_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_220_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_221_ + f_176_ * (float) i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_222_ + f_177_ * (float) i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_223_ + f_178_ * (float) i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_217_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_218_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_219_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_220_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_221_ + f_170_ * (float) i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_222_ + f_171_ * (float) i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_223_ + f_172_ * (float) i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_217_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_218_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_219_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_220_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_221_ + f_173_ * (float) i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_222_ + f_174_ * (float) i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_223_ + f_175_ * (float) i_224_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_217_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_218_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_219_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_220_);
						}
					}
				}
			}
		}
		if (((Class134) this).aClass282_Sub35_Sub1_1601.index * -1990677291 != 0) {
			((Class134) this).anInterface14_1602.method106(24, ((Class134) this).aClass282_Sub35_Sub1_1601.buffer, (((Class134) this).aClass282_Sub35_Sub1_1601.index * -1990677291));
			class505_sub1.method13647(((Class134) this).aClass143_1603, null, ((Class134) this).aClass143_1605, ((Class134) this).aClass143_1617);
			class505_sub1.method13603(7, 0, (((Class134) this).aClass282_Sub35_Sub1_1601.index) * -1990677291 / 24);
		}
	}

	void method2339(Class505_Sub1 class505_sub1) {
		aFloat1600 = ((Class505_Sub1) class505_sub1).aFloat8432;
		class505_sub1.method13607();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class505_sub1.method13623(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2340(Class505_Sub1 class505_sub1, int i) {
		OpenGL.glGetFloatv(2982, ((Class134) this).aFloatArray1613, 0);
		float f = ((Class134) this).aFloatArray1613[0];
		float f_225_ = ((Class134) this).aFloatArray1613[4];
		float f_226_ = ((Class134) this).aFloatArray1613[8];
		float f_227_ = ((Class134) this).aFloatArray1613[1];
		float f_228_ = ((Class134) this).aFloatArray1613[5];
		float f_229_ = ((Class134) this).aFloatArray1613[9];
		float f_230_ = f + f_227_;
		float f_231_ = f_225_ + f_228_;
		float f_232_ = f_226_ + f_229_;
		float f_233_ = f - f_227_;
		float f_234_ = f_225_ - f_228_;
		float f_235_ = f_226_ - f_229_;
		float f_236_ = f_227_ - f;
		float f_237_ = f_228_ - f_225_;
		float f_238_ = f_229_ - f_226_;
		((Class134) this).aClass282_Sub35_Sub1_1601.index = 0;
		if (((Class505_Sub1) class505_sub1).aBool8467) {
			for (int i_239_ = i - 1; i_239_ >= 0; i_239_--) {
				int i_240_ = (((Class134) this).anIntArray1615[i_239_] > 64 ? 64 : ((Class134) this).anIntArray1615[i_239_]);
				if (i_240_ > 0) {
					for (int i_241_ = i_240_ - 1; i_241_ >= 0; i_241_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_239_][i_241_]);
						int i_242_ = class275_sub1_sub1.anInt10209;
						byte i_243_ = (byte) (i_242_ >> 16);
						byte i_244_ = (byte) (i_242_ >> 8);
						byte i_245_ = (byte) i_242_;
						byte i_246_ = (byte) (i_242_ >>> 24);
						float f_247_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_248_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_249_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_250_ = class275_sub1_sub1.anInt10206 >> 12;
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_247_ + f_230_ * (float) -i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_248_ + f_231_ * (float) -i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_249_ + f_232_ * (float) -i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_243_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_244_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_245_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_246_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_247_ + f_236_ * (float) i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_248_ + f_237_ * (float) i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_249_ + f_238_ * (float) i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_243_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_244_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_245_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_246_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_247_ + f_230_ * (float) i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_248_ + f_231_ * (float) i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_249_ + f_232_ * (float) i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_243_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_244_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_245_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_246_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_247_ + f_233_ * (float) i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_248_ + f_234_ * (float) i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_249_ + f_235_ * (float) i_250_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_243_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_244_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_245_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_246_);
					}
					if (((Class134) this).anIntArray1615[i_239_] > 64) {
						int i_251_ = (((Class134) this).anIntArray1615[i_239_] - 64 - 1);
						for (int i_252_ = (((Class134) this).anIntArray1604[i_251_]) - 1; i_252_ >= 0; i_252_--) {
							Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[i_251_][i_252_]);
							int i_253_ = class275_sub1_sub1.anInt10209;
							byte i_254_ = (byte) (i_253_ >> 16);
							byte i_255_ = (byte) (i_253_ >> 8);
							byte i_256_ = (byte) i_253_;
							byte i_257_ = (byte) (i_253_ >>> 24);
							float f_258_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
							float f_259_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
							float f_260_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
							int i_261_ = class275_sub1_sub1.anInt10206 >> 12;
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_258_ + f_230_ * (float) -i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_259_ + f_231_ * (float) -i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_260_ + f_232_ * (float) -i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_254_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_255_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_256_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_257_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_258_ + f_236_ * (float) i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_259_ + f_237_ * (float) i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_260_ + f_238_ * (float) i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_254_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_255_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_256_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_257_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_258_ + f_230_ * (float) i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_259_ + f_231_ * (float) i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_260_ + f_232_ * (float) i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_254_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_255_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_256_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_257_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_258_ + f_233_ * (float) i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_259_ + f_234_ * (float) i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14688(f_260_ + f_235_ * (float) i_261_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_254_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_255_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_256_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_257_);
						}
					}
				}
			}
		} else {
			for (int i_262_ = i - 1; i_262_ >= 0; i_262_--) {
				int i_263_ = (((Class134) this).anIntArray1615[i_262_] > 64 ? 64 : ((Class134) this).anIntArray1615[i_262_]);
				if (i_263_ > 0) {
					for (int i_264_ = i_263_ - 1; i_264_ >= 0; i_264_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1614[i_262_][i_264_]);
						int i_265_ = class275_sub1_sub1.anInt10209;
						byte i_266_ = (byte) (i_265_ >> 16);
						byte i_267_ = (byte) (i_265_ >> 8);
						byte i_268_ = (byte) i_265_;
						byte i_269_ = (byte) (i_265_ >>> 24);
						float f_270_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_271_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_272_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_273_ = class275_sub1_sub1.anInt10206 >> 12;
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_270_ + f_230_ * (float) -i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_271_ + f_231_ * (float) -i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_272_ + f_232_ * (float) -i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_266_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_267_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_268_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_269_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_270_ + f_236_ * (float) i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_271_ + f_237_ * (float) i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_272_ + f_238_ * (float) i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_266_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_267_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_268_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_269_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_270_ + f_230_ * (float) i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_271_ + f_231_ * (float) i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_272_ + f_232_ * (float) i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_266_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_267_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_268_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_269_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_270_ + f_233_ * (float) i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_271_ + f_234_ * (float) i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_272_ + f_235_ * (float) i_273_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_266_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_267_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_268_);
						((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_269_);
					}
					if (((Class134) this).anIntArray1615[i_262_] > 64) {
						int i_274_ = (((Class134) this).anIntArray1615[i_262_] - 64 - 1);
						for (int i_275_ = (((Class134) this).anIntArray1604[i_274_]) - 1; i_275_ >= 0; i_275_--) {
							Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class134) this).aClass275_Sub1_Sub1ArrayArray1607[i_274_][i_275_]);
							int i_276_ = class275_sub1_sub1.anInt10209;
							byte i_277_ = (byte) (i_276_ >> 16);
							byte i_278_ = (byte) (i_276_ >> 8);
							byte i_279_ = (byte) i_276_;
							byte i_280_ = (byte) (i_276_ >>> 24);
							float f_281_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
							float f_282_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
							float f_283_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
							int i_284_ = class275_sub1_sub1.anInt10206 >> 12;
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_281_ + f_230_ * (float) -i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_282_ + f_231_ * (float) -i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_283_ + f_232_ * (float) -i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_277_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_278_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_279_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_280_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_281_ + f_236_ * (float) i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_282_ + f_237_ * (float) i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_283_ + f_238_ * (float) i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_277_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_278_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_279_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_280_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_281_ + f_230_ * (float) i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_282_ + f_231_ * (float) i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_283_ + f_232_ * (float) i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_277_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_278_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_279_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_280_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(1.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(0.0F);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_281_ + f_233_ * (float) i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_282_ + f_234_ * (float) i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.method14685(f_283_ + f_235_ * (float) i_284_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_277_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_278_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_279_);
							((Class134) this).aClass282_Sub35_Sub1_1601.writeByte(i_280_);
						}
					}
				}
			}
		}
		if (((Class134) this).aClass282_Sub35_Sub1_1601.index * -1990677291 != 0) {
			((Class134) this).anInterface14_1602.method106(24, ((Class134) this).aClass282_Sub35_Sub1_1601.buffer, (((Class134) this).aClass282_Sub35_Sub1_1601.index * -1990677291));
			class505_sub1.method13647(((Class134) this).aClass143_1603, null, ((Class134) this).aClass143_1605, ((Class134) this).aClass143_1617);
			class505_sub1.method13603(7, 0, (((Class134) this).aClass282_Sub35_Sub1_1601.index) * -1990677291 / 24);
		}
	}
}
