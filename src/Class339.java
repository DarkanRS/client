/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class339 {
	Class348 aClass348_3633 = new Class348(128);
	Class243 aClass243_3634;
	Class348 aClass348_3635 = new Class348(64);
	public static int anInt3636 = 64;
	public static int anInt3637 = 128;
	Class243 aClass243_3638;

	public Class352 method4116(int i, int i_0_) {
		try {
			Class352 class352;
			synchronized (((Class339) this).aClass348_3633) {
				class352 = (Class352) ((Class339) this).aClass348_3633.method4184((long) i);
			}
			if (null != class352)
				return class352;
			byte[] is;
			synchronized (((Class339) this).aClass243_3634) {
				is = (((Class339) this).aClass243_3634.method2315(-1006924897 * Class120.aClass120_1441.anInt1460, i, (byte) -50));
			}
			class352 = new Class352();
			class352.anInt3784 = i * -1314224517;
			((Class352) class352).aClass339_3776 = this;
			if (null != is)
				class352.method4234(new RsByteBuffer(is), 677294156);
			class352.method4236(-2028802869);
			synchronized (((Class339) this).aClass348_3633) {
				((Class339) this).aClass348_3633.method4194(class352, (long) i);
			}
			return class352;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.a(").append(')').toString());
		}
	}

	public void method4117(int i, byte i_1_) {
		try {
			synchronized (((Class339) this).aClass348_3633) {
				((Class339) this).aClass348_3633.method4186(i, -346772344);
			}
			synchronized (((Class339) this).aClass348_3635) {
				((Class339) this).aClass348_3635.method4186(i, -549143520);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.p(").append(')').toString());
		}
	}

	public void method4118(int i) {
		try {
			synchronized (((Class339) this).aClass348_3633) {
				((Class339) this).aClass348_3633.method4187();
			}
			synchronized (((Class339) this).aClass348_3635) {
				((Class339) this).aClass348_3635.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.b(").append(')').toString());
		}
	}

	public void method4119(int i, int i_2_, int i_3_) {
		try {
			((Class339) this).aClass348_3633 = new Class348(i);
			((Class339) this).aClass348_3635 = new Class348(i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.f(").append(')').toString());
		}
	}

	public void method4120(int i) {
		try {
			synchronized (((Class339) this).aClass348_3633) {
				((Class339) this).aClass348_3633.method4189();
			}
			synchronized (((Class339) this).aClass348_3635) {
				((Class339) this).aClass348_3635.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.i(").append(')').toString());
		}
	}

	public Class339(Class411 class411, Class429 class429, Class243 class243, Class243 class243_4_) {
		((Class339) this).aClass243_3634 = class243;
		((Class339) this).aClass243_3638 = class243_4_;
		((Class339) this).aClass243_3634.method2316((-1006924897 * (Class120.aClass120_1441.anInt1460)), -1187243048);
	}

	static final void method4121(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_5_, (byte) 40);
			Class119 class119 = Class389.aClass119Array4165[i_5_ >> 16];
			Class225.method2102(class105, class119, class403, (short) -26204);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.jb(").append(')').toString());
		}
	}

	static final void method4122(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class261.method2463(class105, class119, class403, (byte) -60);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.ls(").append(')').toString());
		}
	}

	static final void method4123(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class165.recorder.getMouseY((byte) -67);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.ux(").append(')').toString());
		}
	}

	static final void method4124(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class82_Sub14.anInt6875 * 1196508279 + Class301.anInt3245;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1882038855 * Class376.anInt4090 + Class301.anInt3238;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.adq(").append(')').toString());
		}
	}

	static void method4125(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_6_ = class298_sub53.readUnsignedByte();
				switch (i_6_) {
				case 255:
					return;
				case 0:
					Class87.anInt800 = class298_sub53.readUnsignedShort() * 1746642957;
					Class87.anInt801 = class298_sub53.readUnsignedShort() * -196096943;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.f(").append(')').toString());
		}
	}

	static final void method4126(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).aClass177_5243 = new Class177();
			((ClientScript2) class403).aClass177_5243.anInt1787 = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) * -1496580327;
			((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788 = Class447.aClass469_5618.method6045((-2034569943 * (((ClientScript2) class403).aClass177_5243.anInt1787)), (short) -31803);
			((ClientScript2) class403).aClass177_5243.anIntArray1789 = new int[((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788.method3461((short) -407)];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("od.ace(").append(')').toString());
		}
	}
}
