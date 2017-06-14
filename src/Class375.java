/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class375 {
	Class348 aClass348_4079 = new Class348(64);
	public int anInt4080 = 0;
	public int anInt4081;
	Class243 aClass243_4082;
	static int basePlane;
	public static ClanChannel visitedChannel;

	public Class373 method4645(int i, int i_0_) {
		try {
			Class373 class373;
			synchronized (((Class375) this).aClass348_4079) {
				class373 = (Class373) ((Class375) this).aClass348_4079.method4184((long) i);
			}
			if (null != class373)
				return class373;
			byte[] is;
			synchronized (((Class375) this).aClass243_4082) {
				is = (((Class375) this).aClass243_4082.getFile(Class120.aClass120_1439.anInt1460 * -1006924897, i, (byte) -18));
			}
			class373 = new Class373();
			((Class373) class373).aClass375_4065 = this;
			((Class373) class373).anInt4053 = 1723715693 * i;
			if (is != null)
				class373.method4605(new RsByteBuffer(is), 690302848);
			class373.method4603((byte) 75);
			synchronized (((Class375) this).aClass348_4079) {
				((Class375) this).aClass348_4079.method4194(class373, (long) i);
			}
			return class373;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.a(").append(')').toString());
		}
	}

	public Class375(Class411 class411, Class429 class429, Class243 class243) {
		((Class375) this).aClass243_4082 = class243;
		anInt4081 = (((Class375) this).aClass243_4082.method2316((-1006924897 * (Class120.aClass120_1439.anInt1460)), 774356441) * 1970250293);
	}

	public void method4646(byte i) {
		try {
			synchronized (((Class375) this).aClass348_4079) {
				((Class375) this).aClass348_4079.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.p(").append(')').toString());
		}
	}

	public void method4647(int i, byte i_1_) {
		try {
			synchronized (((Class375) this).aClass348_4079) {
				((Class375) this).aClass348_4079.method4186(i, -1937713048);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.b(").append(')').toString());
		}
	}

	public void method4648(byte i) {
		try {
			synchronized (((Class375) this).aClass348_4079) {
				((Class375) this).aClass348_4079.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.f(").append(')').toString());
		}
	}

	static final void method4649(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			int i_4_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]);
			if (i_3_ == -1)
				throw new RuntimeException();
			ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(i_3_, 1528209569);
			if (class483.aChar6037 != i_2_)
				throw new RuntimeException();
			int[] is = class483.method6128(Integer.valueOf(i_4_), (short) 19520);
			int i_5_ = 0;
			if (is != null)
				i_5_ = is.length;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.vs(").append(')').toString());
		}
	}

	static final void method4650(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class342.method4152(string, (byte) 62);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.vl(").append(')').toString());
		}
	}

	static final void method4651(ClientScript2 class403, int i) {
		try {
			if (Class452.aBoolean5642 && Class231.aFrame2589 != null)
				Class357.method4276(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub12_7543.method5669((byte) 70), -1, -1, false, -489329335);
			if (Class389.method4865((byte) 35) == Class292.aClass292_3162) {
				Class52_Sub2.method589(1556288352);
				System.exit(0);
			} else
				Class117.method1279(-849889720);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.afq(").append(')').toString());
		}
	}

	static int method4652(Player class365_sub1_sub1_sub2_sub2, int i) {
		try {
			int i_6_ = 1899133595 * class365_sub1_sub1_sub2_sub2.anInt10211;
			Class350 class350 = class365_sub1_sub1_sub2_sub2.method4426(657972326);
			int i_7_ = class365_sub1_sub1_sub2_sub2.aClass438_10077.method5823(1741170329);
			if (-1 == i_7_ || class365_sub1_sub1_sub2_sub2.aBoolean10094)
				i_6_ = 1728220219 * class365_sub1_sub1_sub2_sub2.anInt10194;
			else if (class350.anInt3721 * 230243963 == i_7_ || i_7_ == class350.anInt3749 * 491753731 || class350.anInt3724 * -783166629 == i_7_ || i_7_ == class350.anInt3746 * -2054940183)
				i_6_ = class365_sub1_sub1_sub2_sub2.anInt10212 * -978842273;
			else if (i_7_ == class350.anInt3755 * 328817727 || -1238642279 * class350.anInt3722 == i_7_ || 124010991 * class350.anInt3728 == i_7_ || -907666203 * class350.anInt3727 == i_7_)
				i_6_ = class365_sub1_sub1_sub2_sub2.anInt10210 * -1304250511;
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.r(").append(')').toString());
		}
	}

	static void method4653(int i) {
		try {
			if (Class394.method4897(-185972710)) {
				if (null == Class8.aStringArray107)
					Class372_Sub3.method4599(-219758847);
				Class8.aBoolean108 = true;
				Class8.anInt98 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.f(").append(')').toString());
		}
	}

	static final void method4654(int i, int i_8_, byte i_9_) {
		try {
			if (client.aClass411_8944 != Class411.aClass411_5316) {
				if (!Class82_Sub21.method938(i, i_8_, false, Class282.method2619(i, i_8_, 1, 1, 1978833308), -1273389367))
					Class82_Sub21.method938(i, i_8_, false, Class325.method3963(i, i_8_, 1, 1, 0, (byte) -5), 1260408128);
			} else if (!Class82_Sub21.method938(i, i_8_, false, Class325.method3963(i, i_8_, 1, 1, 0, (byte) -71), 301836586))
				Class82_Sub21.method938(i, i_8_, false, Class282.method2619(i, i_8_, 1, 1, 1349485510), 605242163);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pp.jv(").append(')').toString());
		}
	}
}
