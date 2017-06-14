/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class507 {
	Class348 aClass348_6204;
	Class411 aClass411_6205;
	Class348 aClass348_6206 = new Class348(64);
	Class243 aClass243_6207;
	Class243 aClass243_6208;
	boolean aBoolean6209;
	int anInt6210;
	Class348 aClass348_6211;
	Class429 aClass429_6212;
	String[] aStringArray6213;

	public SomethingDefinitions method6269(int i, int i_0_) {
		try {
			SomethingDefinitions class503;
			synchronized (((Class507) this).aClass348_6206) {
				class503 = (SomethingDefinitions) ((Class507) this).aClass348_6206.method4184((long) i);
			}
			if (null != class503)
				return class503;
			byte[] is;
			synchronized (((Class507) this).aClass243_6207) {
				is = (((Class507) this).aClass243_6207.getFile(Class120.aClass120_1410.getArchiveId(i, -790155853), Class120.aClass120_1410.getFileId(i, -576275965), (byte) -76));
			}
			class503 = new SomethingDefinitions();
			class503.anInt6126 = -1840892671 * i;
			((SomethingDefinitions) class503).aClass507_6125 = this;
			class503.aStringArray6142 = (String[]) ((Class507) this).aStringArray6213.clone();
			if (is != null)
				class503.method6235(new RsByteBuffer(is), -975728899);
			class503.method6243(1323410423);
			synchronized (((Class507) this).aClass348_6206) {
				((Class507) this).aClass348_6206.method4194(class503, (long) i);
			}
			return class503;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uy.a(").append(')').toString());
		}
	}

	public void method6270(boolean bool, byte i) {
		try {
			if (((Class507) this).aBoolean6209 != bool) {
				((Class507) this).aBoolean6209 = bool;
				method6272(-1071306617);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uy.f(").append(')').toString());
		}
	}

	public void method6271(int i, int i_1_) {
		try {
			((Class507) this).anInt6210 = i * -1576689997;
			synchronized (((Class507) this).aClass348_6204) {
				((Class507) this).aClass348_6204.method4187();
			}
			synchronized (((Class507) this).aClass348_6211) {
				((Class507) this).aClass348_6211.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uy.b(").append(')').toString());
		}
	}

	public void method6272(int i) {
		try {
			synchronized (((Class507) this).aClass348_6206) {
				((Class507) this).aClass348_6206.method4187();
			}
			synchronized (((Class507) this).aClass348_6204) {
				((Class507) this).aClass348_6204.method4187();
			}
			synchronized (((Class507) this).aClass348_6211) {
				((Class507) this).aClass348_6211.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uy.p(").append(')').toString());
		}
	}

	public void method6273(byte i) {
		try {
			synchronized (((Class507) this).aClass348_6204) {
				((Class507) this).aClass348_6204.method4187();
			}
			synchronized (((Class507) this).aClass348_6211) {
				((Class507) this).aClass348_6211.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uy.i(").append(')').toString());
		}
	}

	public void method6274(int i) {
		try {
			synchronized (((Class507) this).aClass348_6206) {
				((Class507) this).aClass348_6206.method4189();
			}
			synchronized (((Class507) this).aClass348_6204) {
				((Class507) this).aClass348_6204.method4189();
			}
			synchronized (((Class507) this).aClass348_6211) {
				((Class507) this).aClass348_6211.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uy.d(").append(')').toString());
		}
	}

	public void method6275(int i, int i_2_) {
		try {
			synchronized (((Class507) this).aClass348_6206) {
				((Class507) this).aClass348_6206.method4186(i, 612752798);
			}
			synchronized (((Class507) this).aClass348_6204) {
				((Class507) this).aClass348_6204.method4186(i, -709168280);
			}
			synchronized (((Class507) this).aClass348_6211) {
				((Class507) this).aClass348_6211.method4186(i, -1808092959);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uy.k(").append(')').toString());
		}
	}

	public Class507(Class411 class411, Class429 class429, boolean bool, Class243 class243, Class243 class243_3_) {
		((Class507) this).aClass348_6204 = new Class348(50);
		((Class507) this).aClass348_6211 = new Class348(5);
		((Class507) this).aClass411_6205 = class411;
		((Class507) this).aClass429_6212 = class429;
		((Class507) this).aBoolean6209 = bool;
		((Class507) this).aClass243_6207 = class243;
		((Class507) this).aClass243_6208 = class243_3_;
		if (((Class507) this).aClass243_6207 != null) {
			int i = ((Class507) this).aClass243_6207.method2296(2037724352) - 1;
			Class120.aClass120_1410.method1306((short) 12429);
			((Class507) this).aClass243_6207.method2316(i, 678420951);
		}
		if (Class411.aClass411_5320 == ((Class507) this).aClass411_6205)
			((Class507) this).aStringArray6213 = (new String[] { null, null, null, null, null, Tradution.aClass470_5905.method6049((((Class507) this).aClass429_6212), -875414210) });
		else
			((Class507) this).aStringArray6213 = new String[] { null, null, null, null, null, null };
	}

	static void method6276(int i) {
		try {
			Class229.aClass348_6452.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uy.a(").append(')').toString());
		}
	}

	static final void method6277(ClientScript2 class403, int i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_4_, (byte) -51);
			Class119 class119 = Class389.aClass119Array4165[i_4_ >> 16];
			Class79.method849(class105, class119, class403, 1226850164);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uy.jp(").append(')').toString());
		}
	}
}
