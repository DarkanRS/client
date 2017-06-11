/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class132 {
	public static int[] anIntArray1499;
	Class144 aClass144_1500;
	short[] aShortArray1501;
	short[] aShortArray1502;
	short[] aShortArray1503;
	short[] aShortArray1504;
	int[] anIntArray1505 = { -1, -1, -1, -1, -1 };
	public static int[] anIntArray1506 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	int[] anIntArray1507;
	static int anInt1508;

	void method1472(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i == 1393802809) {
						/* empty */
					}
					break;
				}
				method1473(class298_sub53, i_0_, (byte) 2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.a(").append(')').toString());
		}
	}

	void method1473(RsByteBuffer class298_sub53, int i, byte i_1_) {
		try {
			if (i == 1)
				class298_sub53.readUnsignedByte();
			else if (i == 2) {
				int i_2_ = class298_sub53.readUnsignedByte();
				((Class132) this).anIntArray1507 = new int[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
					((Class132) this).anIntArray1507[i_3_] = class298_sub53.readBigSmart(1235052657);
			} else if (3 == i) {
				if (i_1_ != 2)
					return;
			} else if (40 == i) {
				int i_4_ = class298_sub53.readUnsignedByte();
				((Class132) this).aShortArray1501 = new short[i_4_];
				((Class132) this).aShortArray1502 = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					((Class132) this).aShortArray1501[i_5_] = (short) class298_sub53.readUnsignedShort();
					((Class132) this).aShortArray1502[i_5_] = (short) class298_sub53.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_6_ = class298_sub53.readUnsignedByte();
				((Class132) this).aShortArray1503 = new short[i_6_];
				((Class132) this).aShortArray1504 = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					((Class132) this).aShortArray1503[i_7_] = (short) class298_sub53.readUnsignedShort();
					((Class132) this).aShortArray1504[i_7_] = (short) class298_sub53.readUnsignedShort();
				}
			} else if (i >= 60 && i < 70)
				((Class132) this).anIntArray1505[i - 60] = class298_sub53.readBigSmart(1235052657);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.f(").append(')').toString());
		}
	}

	public Model method1474(byte i) {
		try {
			if (((Class132) this).anIntArray1507 == null)
				return null;
			Model[] class64s = new Model[((Class132) this).anIntArray1507.length];
			synchronized (((Class144) ((Class132) this).aClass144_1500).aClass243_1560) {
				for (int i_8_ = 0; i_8_ < ((Class132) this).anIntArray1507.length; i_8_++)
					class64s[i_8_] = Model.method751((((Class144) ((Class132) this).aClass144_1500).aClass243_1560), (((Class132) this).anIntArray1507[i_8_]), 0);
			}
			for (int i_9_ = 0; i_9_ < ((Class132) this).anIntArray1507.length; i_9_++) {
				if (class64s[i_9_].size < 13)
					class64s[i_9_].method755(2);
			}
			Model model;
			if (1 == class64s.length)
				model = class64s[0];
			else
				model = new Model(class64s, class64s.length);
			if (null == model)
				return null;
			if (((Class132) this).aShortArray1501 != null) {
				for (int i_10_ = 0; i_10_ < ((Class132) this).aShortArray1501.length; i_10_++)
					model.method756(((Class132) this).aShortArray1501[i_10_], (((Class132) this).aShortArray1502[i_10_]));
			}
			if (((Class132) this).aShortArray1503 != null) {
				for (int i_11_ = 0; i_11_ < ((Class132) this).aShortArray1503.length; i_11_++)
					model.method752(((Class132) this).aShortArray1503[i_11_], (((Class132) this).aShortArray1504[i_11_]));
			}
			return model;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.p(").append(')').toString());
		}
	}

	public boolean method1475(int i) {
		try {
			boolean bool = true;
			synchronized (((Class144) ((Class132) this).aClass144_1500).aClass243_1560) {
				for (int i_12_ = 0; i_12_ < 5; i_12_++) {
					if (-1 != ((Class132) this).anIntArray1505[i_12_] && !(((Class144) ((Class132) this).aClass144_1500).aClass243_1560.method2290(((Class132) this).anIntArray1505[i_12_], 0, -1795823627)))
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.i(").append(')').toString());
		}
	}

	static {
		anIntArray1499 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
	}

	public Model method1476(int i) {
		try {
			Model[] class64s = new Model[5];
			int i_13_ = 0;
			synchronized (((Class144) ((Class132) this).aClass144_1500).aClass243_1560) {
				for (int i_14_ = 0; i_14_ < 5; i_14_++) {
					if (((Class132) this).anIntArray1505[i_14_] != -1)
						class64s[i_13_++] = Model.method751((((Class144) (((Class132) this).aClass144_1500)).aClass243_1560), (((Class132) this).anIntArray1505[i_14_]), 0);
				}
			}
			for (int i_15_ = 0; i_15_ < 5; i_15_++) {
				if (null != class64s[i_15_] && class64s[i_15_].size < 13)
					class64s[i_15_].method755(2);
			}
			Model model = new Model(class64s, i_13_);
			if (null != ((Class132) this).aShortArray1501) {
				for (int i_16_ = 0; i_16_ < ((Class132) this).aShortArray1501.length; i_16_++)
					model.method756(((Class132) this).aShortArray1501[i_16_], (((Class132) this).aShortArray1502[i_16_]));
			}
			if (null != ((Class132) this).aShortArray1503) {
				for (int i_17_ = 0; i_17_ < ((Class132) this).aShortArray1503.length; i_17_++)
					model.method752(((Class132) this).aShortArray1503[i_17_], (((Class132) this).aShortArray1504[i_17_]));
			}
			return model;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.k(").append(')').toString());
		}
	}

	Class132() {
		/* empty */
	}

	public boolean method1477(int i) {
		try {
			if (null == ((Class132) this).anIntArray1507)
				return true;
			boolean bool = true;
			synchronized (((Class144) ((Class132) this).aClass144_1500).aClass243_1560) {
				for (int i_18_ = 0; i_18_ < ((Class132) this).anIntArray1507.length; i_18_++) {
					if (!((Class144) ((Class132) this).aClass144_1500).aClass243_1560.method2290(((Class132) this).anIntArray1507[i_18_], 0, -1755601406))
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.b(").append(')').toString());
		}
	}

	static final void method1478(ClientScript2 class403, int i) {
		try {
			int i_19_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_19_, (byte) 36);
			Class119 class119 = Class389.aClass119Array4165[i_19_ >> 16];
			Class359.method4292(class105, class119, class403, (byte) -37);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.nc(").append(')').toString());
		}
	}

	static final void method1479(ClientScript2 class403, byte i) {
		try {
			int i_20_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (Class389.aClass119Array4165[i_20_] == null)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			else {
				String string = (Class389.aClass119Array4165[i_20_].aClass105Array1405[0].aString1259);
				if (null == string)
					((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
				else
					((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = string.substring(0, string.indexOf(':'));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.aly(").append(')').toString());
		}
	}

	static void method1480(byte i) {
		try {
			synchronized (Class462.aClass348_5682) {
				Class462.aClass348_5682.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.i(").append(')').toString());
		}
	}

	public static void method1481(int i) {
		try {
			ClientScriptsExecutor.aClass374_Sub1_4125.method4614(-1793011066);
			ClientScriptsExecutor.aClass374_Sub2_4121.method4614(-437755640);
			ClientScriptsExecutor.aLong4123 = 7881601697932874601L;
			ClientScriptsExecutor.aBoolean4122 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fi.b(").append(')').toString());
		}
	}
}
