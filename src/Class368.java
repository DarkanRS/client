/* Class368 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class368 {
	public static int[] anIntArray4002 = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
	public static int[] anIntArray4003 = new int[120];
	public static int anInt4004 = 25;
	public static int anInt4005;

	Class368() throws Throwable {
		throw new Error();
	}

	static {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 120; i_0_++) {
			int i_1_ = i_0_ + 1;
			int i_2_ = (int) ((double) i_1_ + 300.0 * Math.pow(2.0, (double) i_1_ / 7.0));
			i += i_2_;
			anIntArray4003[i_0_] = i / 4;
		}
	}

	static final void method4553(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class380.method4681(class105, class119, class403, 1808304001);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ph.lr(").append(')').toString());
		}
	}

	public static long method4554(CharSequence charsequence, byte i) {
		try {
			int i_3_ = charsequence.length();
			long l = 0L;
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				l = (l << 5) - l + (long) charsequence.charAt(i_4_);
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ph.n(").append(')').toString());
		}
	}

	static void method4555(short i) {
		try {
			if (Class300.aClass303_3202 != null) {
				Class300.aClass303_3202 = null;
				IComponentDefinition.method1136(256, 497351807);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ph.v(").append(')').toString());
		}
	}

	static void method4556(GraphicsToolkit class_ra, Class298_Sub52 class298_sub52, Class352 class352, int i) {
		try {
			Class57 class57 = class352.method4240(class_ra, 774929674);
			if (class57 != null) {
				int i_5_ = class57.method623();
				if (class57.method625() > i_5_)
					i_5_ = class57.method625();
				int i_6_ = 10;
				int i_7_ = 1333098669 * class298_sub52.anInt7609;
				int i_8_ = class298_sub52.anInt7606 * -685779893;
				int i_9_ = 0;
				int i_10_ = 0;
				int i_11_ = 0;
				if (null != class352.aString3792) {
					i_9_ = Class74.aClass505_695.method6257((class352.aString3792), null, (Class301_Sub1.aStringArray7638), null, (byte) 37);
					for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
						String string = Class301_Sub1.aStringArray7638[i_12_];
						if (i_12_ < i_9_ - 1)
							string = string.substring(0, string.length() - 4);
						int i_13_ = Class52.aClass4_508.method307(string);
						if (i_13_ > i_10_)
							i_10_ = i_13_;
					}
					i_11_ = (Class52.aClass4_508.method309() * i_9_ + Class52.aClass4_508.method306() / 2);
				}
				int i_14_ = class298_sub52.anInt7609 * 1333098669 + i_5_ / 2;
				int i_15_ = -685779893 * class298_sub52.anInt7606;
				if (i_7_ < i_5_ + Class301_Sub1.anInt3221) {
					i_7_ = Class301_Sub1.anInt3221;
					i_14_ = i_10_ / 2 + (i_5_ / 2 + Class301_Sub1.anInt3221 + i_6_) + 5;
				} else if (i_7_ > Class301_Sub1.anInt3256 - i_5_) {
					i_7_ = Class301_Sub1.anInt3256 - i_5_;
					i_14_ = (Class301_Sub1.anInt3256 - i_5_ / 2 - i_6_ - i_10_ / 2 - 5);
				}
				if (i_8_ < i_5_ + Class301_Sub1.anInt3255) {
					i_8_ = Class301_Sub1.anInt3255;
					i_15_ = i_5_ / 2 + (Class301_Sub1.anInt3255 + i_6_);
				} else if (i_8_ > Class301_Sub1.anInt3257 - i_5_) {
					i_8_ = Class301_Sub1.anInt3257 - i_5_;
					i_15_ = Class301_Sub1.anInt3257 - i_5_ / 2 - i_6_ - i_11_;
				}
				int i_16_ = ((int) (Math.atan2((double) (i_7_ - (1333098669 * (class298_sub52.anInt7609))), (double) (i_8_ - (class298_sub52.anInt7606 * -685779893))) / 3.141592653589793 * 32767.0) & 0xffff);
				class57.method673((float) i_7_ + (float) i_5_ / 2.0F, (float) i_5_ / 2.0F + (float) i_8_, 4096, i_16_);
				int i_17_ = -2;
				int i_18_ = -2;
				int i_19_ = -2;
				int i_20_ = -2;
				if (class352.aString3792 != null) {
					i_17_ = i_14_ - i_10_ / 2 - 5;
					i_18_ = i_15_;
					i_19_ = i_17_ + i_10_ + 10;
					i_20_ = i_18_ + Class52.aClass4_508.method309() * i_9_ + 3;
					if (class352.anInt3787 * 594838161 != 0)
						class_ra.method5015(i_17_, i_18_, i_19_ - i_17_, i_20_ - i_18_, class352.anInt3787 * 594838161, (byte) 7);
					if (0 != class352.anInt3802 * -828737913)
						class_ra.method5014(i_17_, i_18_, i_19_ - i_17_, i_20_ - i_18_, class352.anInt3802 * -828737913, 98431177);
					for (int i_21_ = 0; i_21_ < i_9_; i_21_++) {
						String string = Class301_Sub1.aStringArray7638[i_21_];
						if (i_21_ < i_9_ - 1)
							string = string.substring(0, string.length() - 4);
						Class52.aClass4_508.method308(class_ra, string, i_14_, i_15_, (class352.anInt3781 * -1836991893), true);
						i_15_ += Class52.aClass4_508.method309();
					}
				}
				if (-1 != class352.anInt3785 * 715019623 || class352.aString3792 != null) {
					Class298_Sub6 class298_sub6 = new Class298_Sub6(class298_sub52);
					i_5_ >>= 1;
					((Class298_Sub6) class298_sub6).anInt7209 = (i_7_ - i_5_) * -526214221;
					((Class298_Sub6) class298_sub6).anInt7204 = 262353353 * (i_5_ + i_7_);
					((Class298_Sub6) class298_sub6).anInt7205 = -1699538327 * (i_8_ - i_5_);
					((Class298_Sub6) class298_sub6).anInt7210 = (i_8_ + i_5_) * 1271571593;
					((Class298_Sub6) class298_sub6).anInt7211 = 1756490303 * i_17_;
					((Class298_Sub6) class298_sub6).anInt7208 = i_19_ * -203535375;
					((Class298_Sub6) class298_sub6).anInt7207 = i_18_ * 914712007;
					((Class298_Sub6) class298_sub6).anInt7203 = i_20_ * 205947907;
					Class476.aClass453_5986.method5935(class298_sub6, 2005332883);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ph.ba(").append(')').toString());
		}
	}

	static final void method4557(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class409.method4973(class105, class119, class403, (byte) 74);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ph.cb(").append(')').toString());
		}
	}
}
