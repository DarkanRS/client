/* Class358 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class358 {
	String aString3846;
	public static int anInt3847 = -1;
	public static int anInt3848 = 0;
	public static int anInt3849 = 1;
	static int anInt3850 = 16777215;
	static int anInt3851 = 70;
	public int anInt3852;
	public int anInt3853;
	public int anInt3854;
	int anInt3855;
	Class347 aClass347_3856;
	int anInt3857;
	int anInt3858;
	public int anInt3859;
	int anInt3860;
	public int anInt3861;
	public int anInt3862;
	public int anInt3863;
	public int anInt3864 = 1438416545;
	static int anInt3865;

	void method4277(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i == 33985) {
						/* empty */
					}
					break;
				}
				method4278(class298_sub53, i_0_, 33985);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.a(").append(')').toString());
		}
	}

	void method4278(RsByteBuffer class298_sub53, int i, int i_1_) {
		try {
			if (1 == i)
				anInt3864 = class298_sub53.readBigSmart(1235052657) * -1438416545;
			else if (i == 2)
				anInt3853 = class298_sub53.read24BitUnsignedInteger((byte) -22) * 728095375;
			else if (i == 3)
				((Class358) this).anInt3855 = class298_sub53.readBigSmart(1235052657) * 315680607;
			else if (i == 4)
				((Class358) this).anInt3857 = class298_sub53.readBigSmart(1235052657) * -1871987079;
			else if (i == 5)
				((Class358) this).anInt3860 = class298_sub53.readBigSmart(1235052657) * -1006502127;
			else if (i == 6)
				((Class358) this).anInt3858 = class298_sub53.readBigSmart(1235052657) * -818871601;
			else if (i == 7)
				anInt3859 = class298_sub53.readShort(1738296677) * -1393539651;
			else if (8 == i)
				((Class358) this).aString3846 = class298_sub53.readJagString(681479919);
			else if (9 == i)
				anInt3854 = class298_sub53.readUnsignedShort() * 1198050465;
			else if (10 == i)
				anInt3852 = class298_sub53.readShort(1586825663) * 428297403;
			else if (i == 11)
				anInt3861 = 0;
			else if (12 == i)
				anInt3863 = class298_sub53.readUnsignedByte() * 1936262373;
			else if (i == 13)
				anInt3862 = class298_sub53.readShort(1775587264) * 508440647;
			else if (14 == i)
				anInt3861 = class298_sub53.readUnsignedShort() * 310090321;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.f(").append(')').toString());
		}
	}

	public String method4279(int i, int i_2_) {
		try {
			String string = ((Class358) this).aString3846;
			for (;;) {
				int i_3_ = string.indexOf("%1");
				if (i_3_ < 0) {
					if (i_2_ != -794452403)
						throw new IllegalStateException();
					break;
				}
				string = new StringBuilder().append(string.substring(0, i_3_)).append(Class128_Sub1.method1440(i, false, (byte) 8)).append(string.substring(2 + i_3_)).toString();
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.b(").append(')').toString());
		}
	}

	public Class57 method4280(GraphicsToolkit class_ra, short i) {
		try {
			if (459224223 * ((Class358) this).anInt3855 < 0)
				return null;
			Class57 class57 = ((Class57) (((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (459224223 * ((Class358) this).anInt3855))));
			if (class57 == null) {
				method4283(class_ra, 370410201);
				class57 = (Class57) (((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (459224223 * ((Class358) this).anInt3855)));
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.p(").append(')').toString());
		}
	}

	public Class57 method4281(GraphicsToolkit class_ra, byte i) {
		try {
			if (((Class358) this).anInt3857 * 1894403017 < 0)
				return null;
			Class57 class57 = ((Class57) (((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (((Class358) this).anInt3857 * 1894403017))));
			if (class57 == null) {
				method4283(class_ra, 445358153);
				class57 = (Class57) (((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (1894403017 * ((Class358) this).anInt3857)));
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.k(").append(')').toString());
		}
	}

	public Class57 method4282(GraphicsToolkit class_ra, byte i) {
		try {
			if (1896268847 * ((Class358) this).anInt3858 < 0)
				return null;
			Class57 class57 = ((Class57) (((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (((Class358) this).anInt3858 * 1896268847))));
			if (class57 == null) {
				method4283(class_ra, -388591321);
				class57 = (Class57) (((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (1896268847 * ((Class358) this).anInt3858)));
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.d(").append(')').toString());
		}
	}

	void method4283(GraphicsToolkit class_ra, int i) {
		try {
			Class243 class243 = ((Class347) ((Class358) this).aClass347_3856).aClass243_3699;
			if (459224223 * ((Class358) this).anInt3855 >= 0 && (((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (459224223 * ((Class358) this).anInt3855))) == null && class243.method2310(((Class358) this).anInt3855 * 459224223, -457216440)) {
				Class89 class89 = Class89.method979(class243, (((Class358) this).anInt3855 * 459224223));
				((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4194(class_ra.method5125(class89, true), (long) (((Class358) this).anInt3855 * 459224223));
			}
			if (((Class358) this).anInt3860 * -1362963983 >= 0 && ((((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (((Class358) this).anInt3860 * -1362963983))) == null) && class243.method2310((-1362963983 * ((Class358) this).anInt3860), -457216440)) {
				Class89 class89 = Class89.method979(class243, (-1362963983 * ((Class358) this).anInt3860));
				((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4194(class_ra.method5125(class89, true), (long) (((Class358) this).anInt3860 * -1362963983));
			}
			if (((Class358) this).anInt3857 * 1894403017 >= 0 && ((((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (((Class358) this).anInt3857 * 1894403017))) == null) && class243.method2310((((Class358) this).anInt3857 * 1894403017), -457216440)) {
				Class89 class89 = Class89.method979(class243, (((Class358) this).anInt3857 * 1894403017));
				((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4194(class_ra.method5125(class89, true), (long) (((Class358) this).anInt3857 * 1894403017));
			}
			if (((Class358) this).anInt3858 * 1896268847 >= 0 && ((((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (((Class358) this).anInt3858 * 1896268847))) == null) && class243.method2310((((Class358) this).anInt3858 * 1896268847), -457216440)) {
				Class89 class89 = Class89.method979(class243, (1896268847 * ((Class358) this).anInt3858));
				((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4194(class_ra.method5125(class89, true), (long) (1896268847 * ((Class358) this).anInt3858));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.u(").append(')').toString());
		}
	}

	Class358() {
		anInt3853 = 1671046513;
		anInt3854 = -2035813370;
		((Class358) this).anInt3855 = -315680607;
		((Class358) this).anInt3860 = 1006502127;
		((Class358) this).anInt3857 = 1871987079;
		((Class358) this).anInt3858 = 818871601;
		anInt3859 = 0;
		anInt3852 = 0;
		anInt3861 = -310090321;
		((Class358) this).aString3846 = "";
		anInt3863 = -1936262373;
		anInt3862 = 0;
	}

	public Class57 method4284(GraphicsToolkit class_ra, int i) {
		try {
			if (((Class358) this).anInt3860 * -1362963983 < 0)
				return null;
			Class57 class57 = ((Class57) (((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (-1362963983 * ((Class358) this).anInt3860))));
			if (class57 == null) {
				method4283(class_ra, -843145755);
				class57 = (Class57) (((Class347) ((Class358) this).aClass347_3856).aClass348_3700.method4184((long) (-1362963983 * ((Class358) this).anInt3860)));
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.i(").append(')').toString());
		}
	}

	static final void method4285(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			Class86.method967((((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]), (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 * 681479919 + 1)]), (((ClientScript2) class403).anIntArray5244[2 + (((ClientScript2) class403).anInt5239 * 681479919)]), -507940004);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.tg(").append(')').toString());
		}
	}

	static void method4286(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 2]), 245040087).aStringArray4022[(((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1])]);
			((ClientScript2) class403).anInt5239 -= -783761378;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.h(").append(')').toString());
		}
	}

	static boolean method4287(int i, int i_4_) {
		try {
			return i == 1 || i == 15 || i == 17 || i == 16 || 9 == i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.fa(").append(')').toString());
		}
	}

	public static void method4288(String string, boolean bool, int i, String string_5_, int i_6_) {
		try {
			Class384.method4699(string, bool, i, -1, string_5_, true, (short) -16913);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.nt(").append(')').toString());
		}
	}

	static final void method4289(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_7_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_8_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			if (i_7_ == 0)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			else if (i_8_ == 0)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 2147483647;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (int) Math.pow((double) i_7_, 1.0 / (double) i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.zs(").append(')').toString());
		}
	}

	static void method4290(IComponentDefinition class105, Class_ta class_ta, int i, int i_9_, int i_10_, int i_11_, int i_12_, String string, Class264 class264, Class505 class505, int i_13_, int i_14_) {
		try {
			int i_15_;
			if (2 == -863531439 * Class298_Sub1.anInt7164)
				i_15_ = (int) client.aFloat8949 & 0x3fff;
			else
				i_15_ = (client.anInt8801 * 1227356013 + (int) client.aFloat8949 & 0x3fff);
			int i_16_ = (Math.max(class105.anInt1156 * -2093041337 / 2, 457937409 * class105.anInt1162 / 2) + 10);
			int i_17_ = i_10_ * i_10_ + i_11_ * i_11_;
			if (i_17_ <= i_16_ * i_16_) {
				int i_18_ = Class220.anIntArray2483[i_15_];
				int i_19_ = Class220.anIntArray2474[i_15_];
				if (Class298_Sub1.anInt7164 * -863531439 != 2) {
					i_18_ = 256 * i_18_ / (356727603 * client.anInt8749 + 256);
					i_19_ = 256 * i_19_ / (256 + 356727603 * client.anInt8749);
				}
				int i_20_ = i_19_ * i_10_ + i_18_ * i_11_ >> 14;
				int i_21_ = i_19_ * i_11_ - i_18_ * i_10_ >> 14;
				int i_22_ = class505.method6259(string, 100, null, 1430172726);
				int i_23_ = class505.method6260(string, 100, 0, null, -1739368935);
				i_20_ -= i_22_ / 2;
				if (i_20_ >= -(class105.anInt1156 * -2093041337) && i_20_ <= -2093041337 * class105.anInt1156 && i_21_ >= -(457937409 * class105.anInt1162) && i_21_ <= 457937409 * class105.anInt1162)
					class264.method2475(string, (-2093041337 * class105.anInt1156 / 2 + (i_20_ + i)), (457937409 * class105.anInt1162 / 2 + i_9_ - i_21_ - i_12_ - i_23_), i_22_, 50, i_13_, 0, 1, 0, 0, null, null, class_ta, i, i_9_, -45995166);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oy.h(").append(')').toString());
		}
	}
}
