/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class491 {
	Class243 aClass243_6076;
	Class243 aClass243_6077;
	Class348 aClass348_6078;
	Class348 aClass348_6079 = new Class348(64);
	public static Class243 aClass243_6080;

	public void method6171(byte i) {
		try {
			synchronized (((Class491) this).aClass348_6079) {
				((Class491) this).aClass348_6079.method4187();
			}
			synchronized (((Class491) this).aClass348_6078) {
				((Class491) this).aClass348_6078.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uf.f(").append(')').toString());
		}
	}

	public Class492 method6172(int i, int i_0_) {
		try {
			Class492 class492;
			synchronized (((Class491) this).aClass348_6079) {
				class492 = (Class492) ((Class491) this).aClass348_6079.method4184((long) i);
			}
			if (null != class492)
				return class492;
			byte[] is;
			synchronized (((Class491) this).aClass243_6076) {
				is = (((Class491) this).aClass243_6076.getFile(-1006924897 * Class120.aClass120_1438.anInt1460, i, (byte) -68));
			}
			class492 = new Class492();
			((Class492) class492).aClass491_6082 = this;
			if (is != null)
				class492.method6180(new RsByteBuffer(is), 1638036980);
			synchronized (((Class491) this).aClass348_6079) {
				((Class491) this).aClass348_6079.method4194(class492, (long) i);
			}
			return class492;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uf.a(").append(')').toString());
		}
	}

	public void method6173(short i) {
		try {
			synchronized (((Class491) this).aClass348_6079) {
				((Class491) this).aClass348_6079.method4189();
			}
			synchronized (((Class491) this).aClass348_6078) {
				((Class491) this).aClass348_6078.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uf.p(").append(')').toString());
		}
	}

	public void method6174(int i, byte i_1_) {
		try {
			synchronized (((Class491) this).aClass348_6079) {
				((Class491) this).aClass348_6079.method4186(i, 677676972);
			}
			synchronized (((Class491) this).aClass348_6078) {
				((Class491) this).aClass348_6078.method4186(i, -452140449);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uf.b(").append(')').toString());
		}
	}

	public Class491(Class411 class411, Class429 class429, Class243 class243, Class243 class243_2_) {
		((Class491) this).aClass348_6078 = new Class348(2);
		((Class491) this).aClass243_6076 = class243;
		((Class491) this).aClass243_6077 = class243_2_;
		((Class491) this).aClass243_6076.method2316((Class120.aClass120_1438.anInt1460) * -1006924897, -1015661848);
	}

	static final void method6175(long l) {
		try {
			Class217 class217 = (Class287.myPlayer.method4337().aClass217_2599);
			int i = 1734240325 * client.anInt8817 + (int) class217.aFloat2451;
			int i_3_ = client.anInt8742 * 1874511679 + (int) class217.aFloat2454;
			if (Class75.anInt708 * 1103750049 - i < -2000 || Class75.anInt708 * 1103750049 - i > 2000 || Class106.anInt1309 * 1346160791 - i_3_ < -2000 || Class106.anInt1309 * 1346160791 - i_3_ > 2000) {
				Class75.anInt708 = i * -1832337311;
				Class106.anInt1309 = 1831024423 * i_3_;
			}
			if (Class75.anInt708 * 1103750049 != i) {
				int i_4_ = i - Class75.anInt708 * 1103750049;
				int i_5_ = (int) ((long) i_4_ * l / 320L);
				if (i_4_ > 0) {
					if (0 == i_5_)
						i_5_ = 1;
					else if (i_5_ > i_4_)
						i_5_ = i_4_;
				} else if (i_5_ == 0)
					i_5_ = -1;
				else if (i_5_ < i_4_)
					i_5_ = i_4_;
				Class75.anInt708 += i_5_ * -1832337311;
			}
			if (1346160791 * Class106.anInt1309 != i_3_) {
				int i_6_ = i_3_ - Class106.anInt1309 * 1346160791;
				int i_7_ = (int) (l * (long) i_6_ / 320L);
				if (i_6_ > 0) {
					if (0 == i_7_)
						i_7_ = 1;
					else if (i_7_ > i_6_)
						i_7_ = i_6_;
				} else if (i_7_ == 0)
					i_7_ = -1;
				else if (i_7_ < i_6_)
					i_7_ = i_6_;
				Class106.anInt1309 += 1831024423 * i_7_;
			}
			client.aFloat8949 += (float) l * client.aFloat8759 / 6.0F;
			client.aFloat8757 += client.aFloat8760 * (float) l / 6.0F;
			Class91.method1002((byte) 116);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uf.hx(").append(')').toString());
		}
	}

	public static Class139[] method6176(byte i) {
		try {
			return (new Class139[] { Class139.aClass139_1547, Class139.aClass139_1546, Class139.aClass139_1545 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uf.a(").append(')').toString());
		}
	}

	static final void method6177(IComponentDefinition class105, ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_9_ = ((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) - 1);
			if (6 != 1548853569 * class105.anInt1184 && class105.anInt1184 * 1548853569 != 2)
				throw new RuntimeException("");
			SomethingDefinitions class503 = Class15.aClass507_224.method6269(class105.anInt1151 * 572201537, -834875221);
			if (null == class105.aClass498_1307)
				class105.aClass498_1307 = new Class498(class503, 6 == 1548853569 * class105.anInt1184);
			class105.aClass498_1307.aLong6110 = Class382.method4686(1998848813) * 3177550440302969639L;
			if (class503.aShortArray6154 == null || i_9_ < 0 || i_9_ >= class503.aShortArray6154.length)
				throw new RuntimeException("");
			class105.aClass498_1307.aShortArray6107[i_9_] = (short) i_8_;
			Tradution.method6054(class105, -548507081);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uf.ql(").append(')').toString());
		}
	}

	static void method6178(int i, int i_10_, int i_11_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(7, (long) i);
			class298_sub37_sub12.method3449((byte) 50);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = i_10_ * 1274450087;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uf.ap(").append(')').toString());
		}
	}
}
