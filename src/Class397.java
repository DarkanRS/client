/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class397 {
	public static int anInt5197 = 20;
	public static int anInt5198 = -6;
	public static int anInt5199 = -5;
	public static int anInt5200 = -4;
	public static int anInt5201 = -1;

	Class397() throws Throwable {
		throw new Error();
	}

	static final void method4911(ClientScript2 class403, short i) {
		try {
			Class399.method4926((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), -1104898137);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ql.agd(").append(')').toString());
		}
	}

	public static void method4912(short i) {
		try {
			Class389.aClass119Array4165 = new Class119[Class270.aClass243_2894.method2296(949346193)];
			Class441.aBooleanArray5590 = new boolean[Class270.aClass243_2894.method2296(1513726492)];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ql.m(").append(')').toString());
		}
	}

	public static final void method4913(byte i) {
		try {
			if (-1 != -591434031 * client.anInt8768 && client.anInt8769 * -839811113 != -1) {
				int i_0_ = (((client.anInt8857 * 892197957 * (client.anInt8774 * 1714001937 - 1049339515 * client.anInt8852)) >> 16) + 1049339515 * client.anInt8852);
				client.anInt8857 += 283956877 * i_0_;
				if (client.anInt8857 * 892197957 >= 65535) {
					client.anInt8857 = -979359373;
					if (!client.aBoolean8776)
						client.aBoolean8775 = true;
					else
						client.aBoolean8775 = false;
					client.aBoolean8776 = true;
				} else {
					client.aBoolean8775 = false;
					client.aBoolean8776 = false;
				}
				float f = (float) (client.anInt8857 * 892197957) / 65535.0F;
				float[] fs = new float[3];
				int i_1_ = client.anInt8770 * 1872262310;
				for (int i_2_ = 0; i_2_ < 3; i_2_++) {
					int i_3_ = 3 * (client.anIntArrayArrayArray8767[client.anInt8768 * -591434031][i_1_][i_2_]);
					int i_4_ = ((client.anIntArrayArrayArray8767[-591434031 * client.anInt8768][1 + i_1_][i_2_]) * 3);
					int i_5_ = ((client.anIntArrayArrayArray8767[client.anInt8768 * -591434031][2 + i_1_][i_2_]) - ((client.anIntArrayArrayArray8767[client.anInt8768 * -591434031][3 + i_1_][i_2_]) - (client.anIntArrayArrayArray8767[-591434031 * client.anInt8768][i_1_ + 2][i_2_]))) * 3;
					int i_6_ = (client.anIntArrayArrayArray8767[-591434031 * client.anInt8768][i_1_][i_2_]);
					int i_7_ = i_4_ - i_3_;
					int i_8_ = i_3_ - 2 * i_4_ + i_5_;
					int i_9_ = i_4_ + ((client.anIntArrayArrayArray8767[client.anInt8768 * -591434031][i_1_ + 2][i_2_]) - i_6_) - i_5_;
					fs[i_2_] = (f * ((float) i_7_ + ((float) i_8_ + (float) i_9_ * f) * f) + (float) i_6_);
				}
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				Class367.anInt4000 = 547882953 * ((int) fs[0] - 526163456 * class341.gameSceneBaseX);
				Class110.anInt6403 = (int) fs[1] * -1078403147;
				Class146.anInt1575 = 309839105 * ((int) fs[2] - class341.gameSceneBaseY * -869407232);
				float[] fs_10_ = new float[3];
				int i_11_ = client.anInt8771 * 977380166;
				for (int i_12_ = 0; i_12_ < 3; i_12_++) {
					int i_13_ = ((client.anIntArrayArrayArray8767[-839811113 * client.anInt8769][i_11_][i_12_]) * 3);
					int i_14_ = ((client.anIntArrayArrayArray8767[client.anInt8769 * -839811113][1 + i_11_][i_12_]) * 3);
					int i_15_ = 3 * ((client.anIntArrayArrayArray8767[client.anInt8769 * -839811113][2 + i_11_][i_12_]) - ((client.anIntArrayArrayArray8767[-839811113 * client.anInt8769][3 + i_11_][i_12_]) - (client.anIntArrayArrayArray8767[-839811113 * client.anInt8769][2 + i_11_][i_12_])));
					int i_16_ = (client.anIntArrayArrayArray8767[-839811113 * client.anInt8769][i_11_][i_12_]);
					int i_17_ = i_14_ - i_13_;
					int i_18_ = i_15_ + (i_13_ - i_14_ * 2);
					int i_19_ = i_14_ + ((client.anIntArrayArrayArray8767[client.anInt8769 * -839811113][2 + i_11_][i_12_]) - i_16_) - i_15_;
					fs_10_[i_12_] = (((float) i_17_ + (f * (float) i_19_ + (float) i_18_) * f) * f + (float) i_16_);
				}
				float f_20_ = fs_10_[0] - fs[0];
				float f_21_ = (fs_10_[1] - fs[1]) * -1.0F;
				float f_22_ = fs_10_[2] - fs[2];
				double d = Math.sqrt((double) (f_22_ * f_22_ + f_20_ * f_20_));
				client.anInt8756 = ((int) (Math.atan2((double) f_21_, d) * 2607.5945876176133) & 0x3fff) * -648269561;
				Class135.anInt6384 = ((int) (-Math.atan2((double) f_20_, (double) f_22_) * 2607.5945876176133) & 0x3fff) * -1587695039;
				Class229.anInt6458 = ((client.anIntArrayArrayArray8767[-591434031 * client.anInt8768][i_1_][3]) + ((((client.anIntArrayArrayArray8767[-591434031 * client.anInt8768][2 + i_1_][3]) - (client.anIntArrayArrayArray8767[client.anInt8768 * -591434031][i_1_][3])) * (892197957 * client.anInt8857)) >> 16)) * -851711283;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ql.hi(").append(')').toString());
		}
	}

	static void method4914(IComponentDefinition class105, Class117 class117, int i, int i_23_, int i_24_, int i_25_, int i_26_, long l) {
		try {
			int i_27_ = i_25_ * i_25_ + i_24_ * i_24_;
			if ((long) i_27_ <= l) {
				int i_28_;
				if (Class298_Sub1.anInt7164 * -863531439 == 2)
					i_28_ = (int) client.aFloat8949 & 0x3fff;
				else
					i_28_ = (1227356013 * client.anInt8801 + (int) client.aFloat8949) & 0x3fff;
				int i_29_ = Class220.anIntArray2483[i_28_];
				int i_30_ = Class220.anIntArray2474[i_28_];
				if (Class298_Sub1.anInt7164 * -863531439 != 2) {
					i_29_ = 256 * i_29_ / (256 + client.anInt8749 * 356727603);
					i_30_ = i_30_ * 256 / (356727603 * client.anInt8749 + 256);
				}
				int i_31_ = i_30_ * i_24_ + i_25_ * i_29_ >> 14;
				int i_32_ = i_30_ * i_25_ - i_24_ * i_29_ >> 14;
				Class57 class57 = Class74.aClass57Array699[i_26_];
				int i_33_ = class57.method623();
				int i_34_ = class57.method625();
				int i_35_ = i_31_ + -2093041337 * class105.anInt1156 / 2 - i_33_ / 2;
				int i_36_ = i_35_ + i_33_;
				int i_37_ = class105.anInt1162 * 457937409 / 2 + -i_32_ - i_34_;
				int i_38_ = i_34_ + i_37_;
				if (!class117.method1274(i_35_, i_37_, -1933314892) || !class117.method1274(i_36_, i_37_, -1940258831) || !class117.method1274(i_35_, i_38_, -1423315727) || !class117.method1274(i_36_, i_38_, -1131709831)) {
					double d = Math.atan2((double) i_31_, (double) i_32_);
					int i_39_ = Math.min(class105.anInt1156 * -2093041337 / 2, class105.anInt1162 * 457937409 / 2);
					i_39_ -= 6;
					int i_40_ = (int) (Math.sin(d) * (double) i_39_);
					int i_41_ = (int) (Math.cos(d) * (double) i_39_);
					Class250.aClass57Array2766[i_26_].method673(((float) (-2093041337 * class105.anInt1156) / 2.0F + (float) i + (float) i_40_), ((float) i_23_ + (float) (class105.anInt1162 * 457937409) / 2.0F - (float) i_41_), 4096, (int) (-d / 6.283185307179586 * 65535.0));
				} else
					class57.method654(i_35_ + i, i_37_ + i_23_, class117.aClass_ta1397, i, i_23_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ql.y(").append(')').toString());
		}
	}
}
