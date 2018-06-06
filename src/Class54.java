
/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class54 {
	int anInt497 = 64;
	Class275_Sub1_Sub1[][] aClass275_Sub1_Sub1ArrayArray498;
	Class70 aClass70_499;
	Interface4 anInterface4_500;
	int anInt501 = 64;
	int anInt502 = 768;
	int anInt503 = 1600;
	int anInt504 = Class159.method2739(1600, 1631895269);
	Class275_Sub1_Sub1[][] aClass275_Sub1_Sub1ArrayArray505;
	int[] anIntArray506;
	int[] anIntArray507;
	int[] anIntArray508;
	int anInt509;
	Interface4 anInterface4_510;
	Interface32 anInterface32_511;
	static float aFloat512;

	void method1088() {
		((Class54) this).anInterface4_500.method26();
	}

	void method1089(Class505_Sub2 class505_sub2) {
		((Class54) this).anInterface4_500.method31(786336, 24);
	}

	void method1090() {
		((Class54) this).anInterface4_500.method26();
	}

	void method1091(Class505_Sub2 class505_sub2, Class151 class151) {
		class505_sub2.RA(false);
		aFloat512 = class505_sub2.aFloat8769;
		float f = class505_sub2.aClass384_8740.buf[2];
		float f_0_ = class505_sub2.aClass384_8740.buf[6];
		float f_1_ = class505_sub2.aClass384_8740.buf[10];
		float f_2_ = class505_sub2.aClass384_8740.buf[14];
		int i = 0;
		int i_3_ = 2147483647;
		int i_4_ = 0;
		Class275_Sub1 class275_sub1 = class151.aClass464_1961.aClass275_Sub1_5554;
		for (Class275_Sub1 class275_sub1_5_ = class275_sub1.aClass275_Sub1_7706; class275_sub1_5_ != class275_sub1; class275_sub1_5_ = class275_sub1_5_.aClass275_Sub1_7706) {
			Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_5_;
			int i_6_ = (int) (f * (float) (class275_sub1_sub1.anInt10205 >> 12) + f_0_ * (float) (class275_sub1_sub1.anInt10208 >> 12) + f_1_ * (float) (class275_sub1_sub1.anInt10202 >> 12) + f_2_);
			if (i_6_ > i_4_)
				i_4_ = i_6_;
			if (i_6_ < i_3_)
				i_3_ = i_6_;
			((Class54) this).anIntArray506[i++] = i_6_;
		}
		int i_7_ = i_4_ - i_3_;
		int i_8_;
		if (i_7_ + 2 > 1600) {
			i_8_ = (1 + Class159.method2739(i_7_, -1568280644) - ((Class54) this).anInt504);
			i_7_ = (i_7_ >> i_8_) + 2;
		} else {
			i_8_ = 0;
			i_7_ += 2;
		}
		Class275_Sub1 class275_sub1_9_ = class275_sub1.aClass275_Sub1_7706;
		i = 0;
		class505_sub2.method13997(((Class54) this).anInterface32_511);
		Class103 class103 = ((Class505_Sub2) class505_sub2).aClass103_8796;
		class103.method1788(Matrix44Arr.aClass384_4666);
		class103.aClass384_1058.method6518();
		class103.anInt1056 = -1;
		int i_10_ = -2;
		boolean bool = true;
		boolean bool_11_ = true;
		while (class275_sub1_9_ != class275_sub1) {
			((Class54) this).anInt509 = 0;
			for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
				((Class54) this).anIntArray507[i_12_] = 0;
			for (int i_13_ = 0; i_13_ < 64; i_13_++)
				((Class54) this).anIntArray508[i_13_] = 0;
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
				int i_14_ = ((Class54) this).anIntArray506[i++] - i_3_ >> i_8_;
				if (i_14_ < 1600) {
					if (((Class54) this).anIntArray507[i_14_] < 64)
						((Class54) this).aClass275_Sub1_Sub1ArrayArray498[i_14_][((Class54) this).anIntArray507[i_14_]++] = class275_sub1_sub1;
					else {
						if (((Class54) this).anIntArray507[i_14_] == 64) {
							if (((Class54) this).anInt509 == 64)
								continue;
							((Class54) this).anIntArray507[i_14_] += 1 + ((Class54) this).anInt509++;
						}
						((Class54) this).aClass275_Sub1_Sub1ArrayArray505[((Class54) this).anIntArray507[i_14_] - 64 - 1][((Class54) this).anIntArray508[(((Class54) this).anIntArray507[i_14_] - 64 - 1)]++] = class275_sub1_sub1;
					}
				}
			}
			class103.anInterface6_1059 = ((Class505_Sub2) class505_sub2).aClass66_8787.method1283(i_10_ >= 0 ? i_10_ : -1);
			if (bool && class505_sub2.aFloat8769 != aFloat512)
				class505_sub2.IA(aFloat512);
			else if (class505_sub2.aFloat8769 != 1.0F)
				class505_sub2.IA(1.0F);
			method1096(class505_sub2, i_7_);
		}
		if (class505_sub2.aFloat8769 != aFloat512)
			class505_sub2.IA(aFloat512);
		class505_sub2.RA(true);
	}

	void method1092(Class505_Sub2 class505_sub2, int i) {
		int i_15_ = 0;
		Matrix44Arr class384 = class505_sub2.aClass384_8740;
		float f = class384.buf[0];
		float f_16_ = class384.buf[4];
		float f_17_ = class384.buf[8];
		float f_18_ = class384.buf[1];
		float f_19_ = class384.buf[5];
		float f_20_ = class384.buf[9];
		float f_21_ = f + f_18_;
		float f_22_ = f_16_ + f_19_;
		float f_23_ = f_17_ + f_20_;
		float f_24_ = f - f_18_;
		float f_25_ = f_16_ - f_19_;
		float f_26_ = f_17_ - f_20_;
		float f_27_ = f_18_ - f;
		float f_28_ = f_19_ - f_16_;
		float f_29_ = f_20_ - f_17_;
		ByteBuffer bytebuffer = class505_sub2.aByteBuffer8838;
		bytebuffer.clear();
		for (int i_30_ = i - 1; i_30_ >= 0; i_30_--) {
			int i_31_ = (((Class54) this).anIntArray507[i_30_] > 64 ? 64 : ((Class54) this).anIntArray507[i_30_]);
			if (i_31_ > 0) {
				for (int i_32_ = i_31_ - 1; i_32_ >= 0; i_32_--) {
					Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class54) this).aClass275_Sub1_Sub1ArrayArray498[i_30_][i_32_]);
					int i_33_ = class275_sub1_sub1.anInt10209;
					byte i_34_ = (byte) (i_33_ >> 16);
					byte i_35_ = (byte) (i_33_ >> 8);
					byte i_36_ = (byte) i_33_;
					byte i_37_ = (byte) (i_33_ >>> 24);
					float f_38_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
					float f_39_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
					float f_40_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
					int i_41_ = class275_sub1_sub1.anInt10206 >> 12;
					bytebuffer.putFloat(f_38_ + f_21_ * (float) -i_41_);
					bytebuffer.putFloat(f_39_ + f_22_ * (float) -i_41_);
					bytebuffer.putFloat(f_40_ + f_23_ * (float) -i_41_);
					if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
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
					if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
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
					if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
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
					if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
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
				if (((Class54) this).anIntArray507[i_30_] > 64) {
					int i_42_ = ((Class54) this).anIntArray507[i_30_] - 64 - 1;
					for (int i_43_ = ((Class54) this).anIntArray508[i_42_] - 1; i_43_ >= 0; i_43_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class54) this).aClass275_Sub1_Sub1ArrayArray505[i_42_][i_43_]);
						int i_44_ = class275_sub1_sub1.anInt10209;
						byte i_45_ = (byte) (i_44_ >> 16);
						byte i_46_ = (byte) (i_44_ >> 8);
						byte i_47_ = (byte) i_44_;
						byte i_48_ = (byte) (i_44_ >>> 24);
						float f_49_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_50_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_51_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_52_ = class275_sub1_sub1.anInt10206 >> 12;
						bytebuffer.putFloat(f_49_ + f_21_ * (float) -i_52_);
						bytebuffer.putFloat(f_50_ + f_22_ * (float) -i_52_);
						bytebuffer.putFloat(f_51_ + f_23_ * (float) -i_52_);
						if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
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
						if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
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
						if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
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
						if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
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
		((Class54) this).anInterface4_500.method42(0, bytebuffer.position(), class505_sub2.aLong8695);
		class505_sub2.method14161(0, ((Class54) this).anInterface4_500);
		class505_sub2.method14161(1, ((Class54) this).anInterface4_510);
		class505_sub2.method13996(((Class54) this).aClass70_499);
		Class103 class103 = ((Class505_Sub2) class505_sub2).aClass103_8796;
		class103.method1787(i_15_);
	}

	void method1093() {
		((Class54) this).anInterface4_500.method26();
	}

	Class54(Class505_Sub2 class505_sub2) {
		((Class54) this).anInt497 = 64;
		((Class54) this).anIntArray506 = new int[8191];
		((Class54) this).anIntArray507 = new int[1600];
		((Class54) this).anIntArray508 = new int[64];
		((Class54) this).aClass275_Sub1_Sub1ArrayArray498 = new Class275_Sub1_Sub1[1600][64];
		((Class54) this).aClass275_Sub1_Sub1ArrayArray505 = new Class275_Sub1_Sub1[64][768];
		((Class54) this).anInt509 = 0;
		((Class54) this).aClass70_499 = class505_sub2.method13995(new Class72[] { new Class72(new Class69[] { Class69.aClass69_695, Class69.aClass69_690, (Class69.aClass69_692) }), new Class72(Class69.aClass69_689) });
		((Class54) this).anInterface4_500 = class505_sub2.method13994(true);
		((Class54) this).anInterface4_510 = class505_sub2.method13994(false);
		((Class54) this).anInterface4_510.method31(393168, 12);
		((Class54) this).anInterface32_511 = class505_sub2.method13993(false);
		((Class54) this).anInterface32_511.method208(49146);
		ByteBuffer bytebuffer = class505_sub2.aByteBuffer8838;
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
		((Class54) this).anInterface32_511.method42(0, bytebuffer.position(), class505_sub2.aLong8695);
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
		((Class54) this).anInterface4_510.method42(0, bytebuffer.position(), class505_sub2.aLong8695);
	}

	void method1094(Class505_Sub2 class505_sub2, Class151 class151) {
		class505_sub2.RA(false);
		aFloat512 = class505_sub2.aFloat8769;
		float f = class505_sub2.aClass384_8740.buf[2];
		float f_54_ = class505_sub2.aClass384_8740.buf[6];
		float f_55_ = class505_sub2.aClass384_8740.buf[10];
		float f_56_ = class505_sub2.aClass384_8740.buf[14];
		int i = 0;
		int i_57_ = 2147483647;
		int i_58_ = 0;
		Class275_Sub1 class275_sub1 = class151.aClass464_1961.aClass275_Sub1_5554;
		for (Class275_Sub1 class275_sub1_59_ = class275_sub1.aClass275_Sub1_7706; class275_sub1_59_ != class275_sub1; class275_sub1_59_ = class275_sub1_59_.aClass275_Sub1_7706) {
			Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_59_;
			int i_60_ = (int) (f * (float) (class275_sub1_sub1.anInt10205 >> 12) + f_54_ * (float) (class275_sub1_sub1.anInt10208 >> 12) + f_55_ * (float) (class275_sub1_sub1.anInt10202 >> 12) + f_56_);
			if (i_60_ > i_58_)
				i_58_ = i_60_;
			if (i_60_ < i_57_)
				i_57_ = i_60_;
			((Class54) this).anIntArray506[i++] = i_60_;
		}
		int i_61_ = i_58_ - i_57_;
		int i_62_;
		if (i_61_ + 2 > 1600) {
			i_62_ = (1 + Class159.method2739(i_61_, 1795811356) - ((Class54) this).anInt504);
			i_61_ = (i_61_ >> i_62_) + 2;
		} else {
			i_62_ = 0;
			i_61_ += 2;
		}
		Class275_Sub1 class275_sub1_63_ = class275_sub1.aClass275_Sub1_7706;
		i = 0;
		class505_sub2.method13997(((Class54) this).anInterface32_511);
		Class103 class103 = ((Class505_Sub2) class505_sub2).aClass103_8796;
		class103.method1788(Matrix44Arr.aClass384_4666);
		class103.aClass384_1058.method6518();
		class103.anInt1056 = -1;
		int i_64_ = -2;
		boolean bool = true;
		boolean bool_65_ = true;
		while (class275_sub1_63_ != class275_sub1) {
			((Class54) this).anInt509 = 0;
			for (int i_66_ = 0; i_66_ < i_61_; i_66_++)
				((Class54) this).anIntArray507[i_66_] = 0;
			for (int i_67_ = 0; i_67_ < 64; i_67_++)
				((Class54) this).anIntArray508[i_67_] = 0;
			for (/**/; class275_sub1_63_ != class275_sub1; class275_sub1_63_ = class275_sub1_63_.aClass275_Sub1_7706) {
				Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_63_;
				if (bool_65_) {
					i_64_ = class275_sub1_sub1.anInt10207;
					bool = class275_sub1_sub1.aBool10210;
					bool_65_ = false;
				}
				if (i > 0 && (i_64_ != class275_sub1_sub1.anInt10207 || bool != class275_sub1_sub1.aBool10210)) {
					bool_65_ = true;
					break;
				}
				int i_68_ = ((Class54) this).anIntArray506[i++] - i_57_ >> i_62_;
				if (i_68_ < 1600) {
					if (((Class54) this).anIntArray507[i_68_] < 64)
						((Class54) this).aClass275_Sub1_Sub1ArrayArray498[i_68_][((Class54) this).anIntArray507[i_68_]++] = class275_sub1_sub1;
					else {
						if (((Class54) this).anIntArray507[i_68_] == 64) {
							if (((Class54) this).anInt509 == 64)
								continue;
							((Class54) this).anIntArray507[i_68_] += 1 + ((Class54) this).anInt509++;
						}
						((Class54) this).aClass275_Sub1_Sub1ArrayArray505[((Class54) this).anIntArray507[i_68_] - 64 - 1][((Class54) this).anIntArray508[(((Class54) this).anIntArray507[i_68_] - 64 - 1)]++] = class275_sub1_sub1;
					}
				}
			}
			class103.anInterface6_1059 = ((Class505_Sub2) class505_sub2).aClass66_8787.method1283(i_64_ >= 0 ? i_64_ : -1);
			if (bool && class505_sub2.aFloat8769 != aFloat512)
				class505_sub2.IA(aFloat512);
			else if (class505_sub2.aFloat8769 != 1.0F)
				class505_sub2.IA(1.0F);
			method1096(class505_sub2, i_61_);
		}
		if (class505_sub2.aFloat8769 != aFloat512)
			class505_sub2.IA(aFloat512);
		class505_sub2.RA(true);
	}

	void method1095(Class505_Sub2 class505_sub2, Class151 class151) {
		class505_sub2.RA(false);
		aFloat512 = class505_sub2.aFloat8769;
		float f = class505_sub2.aClass384_8740.buf[2];
		float f_69_ = class505_sub2.aClass384_8740.buf[6];
		float f_70_ = class505_sub2.aClass384_8740.buf[10];
		float f_71_ = class505_sub2.aClass384_8740.buf[14];
		int i = 0;
		int i_72_ = 2147483647;
		int i_73_ = 0;
		Class275_Sub1 class275_sub1 = class151.aClass464_1961.aClass275_Sub1_5554;
		for (Class275_Sub1 class275_sub1_74_ = class275_sub1.aClass275_Sub1_7706; class275_sub1_74_ != class275_sub1; class275_sub1_74_ = class275_sub1_74_.aClass275_Sub1_7706) {
			Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_74_;
			int i_75_ = (int) (f * (float) (class275_sub1_sub1.anInt10205 >> 12) + f_69_ * (float) (class275_sub1_sub1.anInt10208 >> 12) + f_70_ * (float) (class275_sub1_sub1.anInt10202 >> 12) + f_71_);
			if (i_75_ > i_73_)
				i_73_ = i_75_;
			if (i_75_ < i_72_)
				i_72_ = i_75_;
			((Class54) this).anIntArray506[i++] = i_75_;
		}
		int i_76_ = i_73_ - i_72_;
		int i_77_;
		if (i_76_ + 2 > 1600) {
			i_77_ = (1 + Class159.method2739(i_76_, -1251352991) - ((Class54) this).anInt504);
			i_76_ = (i_76_ >> i_77_) + 2;
		} else {
			i_77_ = 0;
			i_76_ += 2;
		}
		Class275_Sub1 class275_sub1_78_ = class275_sub1.aClass275_Sub1_7706;
		i = 0;
		class505_sub2.method13997(((Class54) this).anInterface32_511);
		Class103 class103 = ((Class505_Sub2) class505_sub2).aClass103_8796;
		class103.method1788(Matrix44Arr.aClass384_4666);
		class103.aClass384_1058.method6518();
		class103.anInt1056 = -1;
		int i_79_ = -2;
		boolean bool = true;
		boolean bool_80_ = true;
		while (class275_sub1_78_ != class275_sub1) {
			((Class54) this).anInt509 = 0;
			for (int i_81_ = 0; i_81_ < i_76_; i_81_++)
				((Class54) this).anIntArray507[i_81_] = 0;
			for (int i_82_ = 0; i_82_ < 64; i_82_++)
				((Class54) this).anIntArray508[i_82_] = 0;
			for (/**/; class275_sub1_78_ != class275_sub1; class275_sub1_78_ = class275_sub1_78_.aClass275_Sub1_7706) {
				Class275_Sub1_Sub1 class275_sub1_sub1 = (Class275_Sub1_Sub1) class275_sub1_78_;
				if (bool_80_) {
					i_79_ = class275_sub1_sub1.anInt10207;
					bool = class275_sub1_sub1.aBool10210;
					bool_80_ = false;
				}
				if (i > 0 && (i_79_ != class275_sub1_sub1.anInt10207 || bool != class275_sub1_sub1.aBool10210)) {
					bool_80_ = true;
					break;
				}
				int i_83_ = ((Class54) this).anIntArray506[i++] - i_72_ >> i_77_;
				if (i_83_ < 1600) {
					if (((Class54) this).anIntArray507[i_83_] < 64)
						((Class54) this).aClass275_Sub1_Sub1ArrayArray498[i_83_][((Class54) this).anIntArray507[i_83_]++] = class275_sub1_sub1;
					else {
						if (((Class54) this).anIntArray507[i_83_] == 64) {
							if (((Class54) this).anInt509 == 64)
								continue;
							((Class54) this).anIntArray507[i_83_] += 1 + ((Class54) this).anInt509++;
						}
						((Class54) this).aClass275_Sub1_Sub1ArrayArray505[((Class54) this).anIntArray507[i_83_] - 64 - 1][((Class54) this).anIntArray508[(((Class54) this).anIntArray507[i_83_] - 64 - 1)]++] = class275_sub1_sub1;
					}
				}
			}
			class103.anInterface6_1059 = ((Class505_Sub2) class505_sub2).aClass66_8787.method1283(i_79_ >= 0 ? i_79_ : -1);
			if (bool && class505_sub2.aFloat8769 != aFloat512)
				class505_sub2.IA(aFloat512);
			else if (class505_sub2.aFloat8769 != 1.0F)
				class505_sub2.IA(1.0F);
			method1096(class505_sub2, i_76_);
		}
		if (class505_sub2.aFloat8769 != aFloat512)
			class505_sub2.IA(aFloat512);
		class505_sub2.RA(true);
	}

	void method1096(Class505_Sub2 class505_sub2, int i) {
		int i_84_ = 0;
		Matrix44Arr class384 = class505_sub2.aClass384_8740;
		float f = class384.buf[0];
		float f_85_ = class384.buf[4];
		float f_86_ = class384.buf[8];
		float f_87_ = class384.buf[1];
		float f_88_ = class384.buf[5];
		float f_89_ = class384.buf[9];
		float f_90_ = f + f_87_;
		float f_91_ = f_85_ + f_88_;
		float f_92_ = f_86_ + f_89_;
		float f_93_ = f - f_87_;
		float f_94_ = f_85_ - f_88_;
		float f_95_ = f_86_ - f_89_;
		float f_96_ = f_87_ - f;
		float f_97_ = f_88_ - f_85_;
		float f_98_ = f_89_ - f_86_;
		ByteBuffer bytebuffer = class505_sub2.aByteBuffer8838;
		bytebuffer.clear();
		for (int i_99_ = i - 1; i_99_ >= 0; i_99_--) {
			int i_100_ = (((Class54) this).anIntArray507[i_99_] > 64 ? 64 : ((Class54) this).anIntArray507[i_99_]);
			if (i_100_ > 0) {
				for (int i_101_ = i_100_ - 1; i_101_ >= 0; i_101_--) {
					Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class54) this).aClass275_Sub1_Sub1ArrayArray498[i_99_][i_101_]);
					int i_102_ = class275_sub1_sub1.anInt10209;
					byte i_103_ = (byte) (i_102_ >> 16);
					byte i_104_ = (byte) (i_102_ >> 8);
					byte i_105_ = (byte) i_102_;
					byte i_106_ = (byte) (i_102_ >>> 24);
					float f_107_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
					float f_108_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
					float f_109_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
					int i_110_ = class275_sub1_sub1.anInt10206 >> 12;
					bytebuffer.putFloat(f_107_ + f_90_ * (float) -i_110_);
					bytebuffer.putFloat(f_108_ + f_91_ * (float) -i_110_);
					bytebuffer.putFloat(f_109_ + f_92_ * (float) -i_110_);
					if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
						bytebuffer.put(i_105_);
						bytebuffer.put(i_104_);
						bytebuffer.put(i_103_);
						bytebuffer.put(i_106_);
					} else {
						bytebuffer.put(i_103_);
						bytebuffer.put(i_104_);
						bytebuffer.put(i_105_);
						bytebuffer.put(i_106_);
					}
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(f_107_ + f_96_ * (float) i_110_);
					bytebuffer.putFloat(f_108_ + f_97_ * (float) i_110_);
					bytebuffer.putFloat(f_109_ + f_98_ * (float) i_110_);
					if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
						bytebuffer.put(i_105_);
						bytebuffer.put(i_104_);
						bytebuffer.put(i_103_);
						bytebuffer.put(i_106_);
					} else {
						bytebuffer.put(i_103_);
						bytebuffer.put(i_104_);
						bytebuffer.put(i_105_);
						bytebuffer.put(i_106_);
					}
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(f_107_ + f_90_ * (float) i_110_);
					bytebuffer.putFloat(f_108_ + f_91_ * (float) i_110_);
					bytebuffer.putFloat(f_109_ + f_92_ * (float) i_110_);
					if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
						bytebuffer.put(i_105_);
						bytebuffer.put(i_104_);
						bytebuffer.put(i_103_);
						bytebuffer.put(i_106_);
					} else {
						bytebuffer.put(i_103_);
						bytebuffer.put(i_104_);
						bytebuffer.put(i_105_);
						bytebuffer.put(i_106_);
					}
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(f_107_ + f_93_ * (float) i_110_);
					bytebuffer.putFloat(f_108_ + f_94_ * (float) i_110_);
					bytebuffer.putFloat(f_109_ + f_95_ * (float) i_110_);
					if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
						bytebuffer.put(i_105_);
						bytebuffer.put(i_104_);
						bytebuffer.put(i_103_);
						bytebuffer.put(i_106_);
					} else {
						bytebuffer.put(i_103_);
						bytebuffer.put(i_104_);
						bytebuffer.put(i_105_);
						bytebuffer.put(i_106_);
					}
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(0.0F);
					i_84_++;
				}
				if (((Class54) this).anIntArray507[i_99_] > 64) {
					int i_111_ = ((Class54) this).anIntArray507[i_99_] - 64 - 1;
					for (int i_112_ = ((Class54) this).anIntArray508[i_111_] - 1; i_112_ >= 0; i_112_--) {
						Class275_Sub1_Sub1 class275_sub1_sub1 = (((Class54) this).aClass275_Sub1_Sub1ArrayArray505[i_111_][i_112_]);
						int i_113_ = class275_sub1_sub1.anInt10209;
						byte i_114_ = (byte) (i_113_ >> 16);
						byte i_115_ = (byte) (i_113_ >> 8);
						byte i_116_ = (byte) i_113_;
						byte i_117_ = (byte) (i_113_ >>> 24);
						float f_118_ = (float) (class275_sub1_sub1.anInt10205 >> 12);
						float f_119_ = (float) (class275_sub1_sub1.anInt10208 >> 12);
						float f_120_ = (float) (class275_sub1_sub1.anInt10202 >> 12);
						int i_121_ = class275_sub1_sub1.anInt10206 >> 12;
						bytebuffer.putFloat(f_118_ + f_90_ * (float) -i_121_);
						bytebuffer.putFloat(f_119_ + f_91_ * (float) -i_121_);
						bytebuffer.putFloat(f_120_ + f_92_ * (float) -i_121_);
						if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
							bytebuffer.put(i_116_);
							bytebuffer.put(i_115_);
							bytebuffer.put(i_114_);
							bytebuffer.put(i_117_);
						} else {
							bytebuffer.put(i_114_);
							bytebuffer.put(i_115_);
							bytebuffer.put(i_116_);
							bytebuffer.put(i_117_);
						}
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_118_ + f_96_ * (float) i_121_);
						bytebuffer.putFloat(f_119_ + f_97_ * (float) i_121_);
						bytebuffer.putFloat(f_120_ + f_98_ * (float) i_121_);
						if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
							bytebuffer.put(i_116_);
							bytebuffer.put(i_115_);
							bytebuffer.put(i_114_);
							bytebuffer.put(i_117_);
						} else {
							bytebuffer.put(i_114_);
							bytebuffer.put(i_115_);
							bytebuffer.put(i_116_);
							bytebuffer.put(i_117_);
						}
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_118_ + f_90_ * (float) i_121_);
						bytebuffer.putFloat(f_119_ + f_91_ * (float) i_121_);
						bytebuffer.putFloat(f_120_ + f_92_ * (float) i_121_);
						if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
							bytebuffer.put(i_116_);
							bytebuffer.put(i_115_);
							bytebuffer.put(i_114_);
							bytebuffer.put(i_117_);
						} else {
							bytebuffer.put(i_114_);
							bytebuffer.put(i_115_);
							bytebuffer.put(i_116_);
							bytebuffer.put(i_117_);
						}
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_118_ + f_93_ * (float) i_121_);
						bytebuffer.putFloat(f_119_ + f_94_ * (float) i_121_);
						bytebuffer.putFloat(f_120_ + f_95_ * (float) i_121_);
						if (((Class505_Sub2) class505_sub2).anInt8824 == 0) {
							bytebuffer.put(i_116_);
							bytebuffer.put(i_115_);
							bytebuffer.put(i_114_);
							bytebuffer.put(i_117_);
						} else {
							bytebuffer.put(i_114_);
							bytebuffer.put(i_115_);
							bytebuffer.put(i_116_);
							bytebuffer.put(i_117_);
						}
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
						i_84_++;
					}
				}
			}
		}
		((Class54) this).anInterface4_500.method42(0, bytebuffer.position(), class505_sub2.aLong8695);
		class505_sub2.method14161(0, ((Class54) this).anInterface4_500);
		class505_sub2.method14161(1, ((Class54) this).anInterface4_510);
		class505_sub2.method13996(((Class54) this).aClass70_499);
		Class103 class103 = ((Class505_Sub2) class505_sub2).aClass103_8796;
		class103.method1787(i_84_);
	}
}
