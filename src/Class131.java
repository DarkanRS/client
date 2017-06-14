/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131 {
	Class348 aClass348_1496 = new Class348(16);
	Class243 aClass243_1497;
	static Class343_Sub1[] aClass343_Sub1Array1498;

	public void method1466(short i) {
		try {
			synchronized (((Class131) this).aClass348_1496) {
				((Class131) this).aClass348_1496.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fh.f(").append(')').toString());
		}
	}

	public Class125 method1467(int i, int i_0_) {
		try {
			Class125 class125;
			synchronized (((Class131) this).aClass348_1496) {
				class125 = (Class125) ((Class131) this).aClass348_1496.method4184((long) i);
			}
			if (class125 != null)
				return class125;
			byte[] is;
			synchronized (((Class131) this).aClass243_1497) {
				is = (((Class131) this).aClass243_1497.getFile(Class120.aClass120_1417.anInt1460 * -1006924897, i, (byte) -82));
			}
			class125 = new Class125();
			if (is != null)
				class125.method1390(new RsByteBuffer(is), (byte) -59);
			synchronized (((Class131) this).aClass348_1496) {
				((Class131) this).aClass348_1496.method4194(class125, (long) i);
			}
			return class125;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fh.a(").append(')').toString());
		}
	}

	public void method1468(int i) {
		try {
			synchronized (((Class131) this).aClass348_1496) {
				((Class131) this).aClass348_1496.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fh.p(").append(')').toString());
		}
	}

	public Class131(Class411 class411, Class429 class429, Class243 class243) {
		((Class131) this).aClass243_1497 = class243;
		((Class131) this).aClass243_1497.method2316((Class120.aClass120_1417.anInt1460) * -1006924897, -1961959383);
	}

	public void method1469(int i, short i_1_) {
		try {
			synchronized (((Class131) this).aClass348_1496) {
				((Class131) this).aClass348_1496.method4186(i, -985699563);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fh.b(").append(')').toString());
		}
	}

	static void method1470(Class119 class119, IComponentDefinition class105, int i) {
		try {
			if (class105 != null) {
				if (class105.anInt1154 * -1309843523 != -1) {
					IComponentDefinition class105_2_ = class119.method1297(1573706803 * class105.anInt1160, (short) 26063);
					if (class105_2_ != null) {
						if (class105_2_.aClass105Array1293 == class105_2_.aClass105Array1292) {
							class105_2_.aClass105Array1293 = (new IComponentDefinition[class105_2_.aClass105Array1292.length]);
							class105_2_.aClass105Array1293[class105_2_.aClass105Array1293.length - 1] = class105;
							Class425.method5737(class105_2_.aClass105Array1292, 0, class105_2_.aClass105Array1293, 0, (-1309843523 * class105.anInt1154));
							Class425.method5737(class105_2_.aClass105Array1292, 1 + class105.anInt1154 * -1309843523, class105_2_.aClass105Array1293, -1309843523 * class105.anInt1154, (class105_2_.aClass105Array1292.length - class105.anInt1154 * -1309843523 - 1));
						} else {
							int i_3_ = 0;
							IComponentDefinition[] class105s;
							for (class105s = class105_2_.aClass105Array1293; i_3_ < class105s.length; i_3_++) {
								if (class105s[i_3_] == class105) {
									if (i == -1270501871)
										break;
									return;
								}
							}
							if (i_3_ < class105s.length) {
								Class425.method5737(class105s, 1 + i_3_, class105s, i_3_, (class105s.length - i_3_ - 1));
								class105s[class105_2_.aClass105Array1293.length - 1] = class105;
							}
						}
					}
				} else {
					IComponentDefinition[] class105s = class119.method1296((byte) 61);
					int i_4_;
					for (i_4_ = 0; i_4_ < class105s.length; i_4_++) {
						if (class105 == class105s[i_4_]) {
							if (i != -1270501871) {
								/* empty */
							}
							break;
						}
					}
					if (i_4_ < class105s.length) {
						Class425.method5737(class105s, i_4_ + 1, class105s, i_4_, class105s.length - i_4_ - 1);
						class105s[class105s.length - 1] = class105;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fh.y(").append(')').toString());
		}
	}

	static final void method1471(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			int i_5_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_6_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			int i_7_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 3]);
			Class341 class341 = client.aClass283_8716.method2628(681479919);
			Class173.method1822(((i_5_ >> 14 & 0x3fff) - class341.gameSceneBaseX * -1760580017), ((i_5_ & 0x3fff) - 283514611 * class341.gameSceneBaseY), i_6_ << 2, i_7_, i_8_, (byte) 72);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fh.agc(").append(')').toString());
		}
	}
}
