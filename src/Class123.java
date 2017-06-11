/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class123 {
	Class116 aClass116_1468;
	Class110[] aClass110Array1469;
	String aString1470;
	Class116 aClass116_1471;
	int anInt1472;
	int anInt1473;
	static Interface4 anInterface4_1474 = new Class121();
	protected int anInt1475 = 1776466383;

	public int method1323(int i) {
		try {
			return -140989799 * ((Class123) this).anInt1472;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.az(").append(')').toString());
		}
	}

	public final void method1324(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_0_, int i) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1161(class298_sub31_sub1, f, f_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.t(").append(')').toString());
		}
	}

	public String method1325(int i) {
		try {
			return ((Class123) this).aString1470;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.p(").append(')').toString());
		}
	}

	Class123(Class_ra_Sub3 class_ra_sub3, Class109 class109) {
		((Class123) this).aString1470 = ((Class109) class109).aString1325;
		((Class123) this).anInt1472 = 2063075753 * ((Class109) class109).aClass114Array1323.length;
		((Class123) this).aClass116_1468 = new Class116(-140989799 * ((Class123) this).anInt1472, anInterface4_1474);
		for (int i = 0; i < ((Class123) this).anInt1472 * -140989799; i++)
			((Class123) this).aClass116_1468.method1265(i, (((Class114) ((Class109) class109).aClass114Array1323[i]).aString1377), method1367(((Class109) class109).aClass114Array1323[i]), -1301495890);
		((Class123) this).anInt1473 = -1642721829 * ((Class109) class109).aClass114Array1326.length;
		((Class123) this).aClass116_1471 = new Class116(((Class123) this).anInt1473 * 1271998035, anInterface4_1474);
		for (int i = 0; i < ((Class123) this).anInt1473 * 1271998035; i++)
			((Class123) this).aClass116_1471.method1265(i, (((Class114) ((Class109) class109).aClass114Array1326[i]).aString1377), method1367(((Class109) class109).aClass114Array1326[i]), -498373902);
		((Class123) this).aClass110Array1469 = new Class110[((Class109) class109).aClass108Array1327.length];
		for (int i = 0; i < ((Class109) class109).aClass108Array1327.length; i++)
			((Class123) this).aClass110Array1469[i] = method1326(class_ra_sub3, ((Class109) class109).aClass108Array1327[i]);
	}

	abstract Class110 method1326(Class_ra_Sub3 class_ra_sub3, Class108 class108);

	public Class110 method1327(String string, byte i) throws Exception_Sub2_Sub2 {
		try {
			Class110[] class110s = ((Class123) this).aClass110Array1469;
			for (int i_1_ = 0; i_1_ < class110s.length; i_1_++) {
				Class110 class110 = class110s[i_1_];
				String string_2_ = class110.method1160(-1921195754);
				if (null != string_2_ && string_2_.equals(string)) {
					if (!class110.method1221())
						throw new Exception_Sub2_Sub2(string);
					return class110;
				}
			}
			throw new Exception_Sub2_Sub2(string);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.k(").append(')').toString());
		}
	}

	public final int method1328(int i) {
		try {
			return ((Class123) this).aClass110Array1469.length;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.d(").append(')').toString());
		}
	}

	public int method1329(Class110 class110, int i) {
		try {
			for (int i_3_ = 0; i_3_ < ((Class123) this).aClass110Array1469.length; i_3_++) {
				if (((Class123) this).aClass110Array1469[i_3_] == class110)
					return i_3_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.x(").append(')').toString());
		}
	}

	public Class110 method1330(int i) {
		try {
			Class110[] class110s = ((Class123) this).aClass110Array1469;
			for (int i_4_ = 0; i_4_ < class110s.length; i_4_++) {
				Class110 class110 = class110s[i_4_];
				if (class110.method1221())
					return class110;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.r(").append(')').toString());
		}
	}

	public abstract boolean method1331(Class110 class110);

	public final Class110 method1332(int i) {
		try {
			return (-33664303 * anInt1475 >= 0 ? (((Class123) this).aClass110Array1469[anInt1475 * -33664303]) : null);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.n(").append(')').toString());
		}
	}

	public final int method1333(int i) {
		try {
			return -33664303 * anInt1475;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.s(").append(')').toString());
		}
	}

	public final void method1334(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_5_, float f_6_, int i) {
		try {
			((Class123) this).aClass110Array1469[anInt1475 * -33664303].method1162(class298_sub31_sub1, f, f_5_, f_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.h(").append(')').toString());
		}
	}

	public final void method1335(Class298_Sub31_Sub1 class298_sub31_sub1, float f, int i) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1176(class298_sub31_sub1, f);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.y(").append(')').toString());
		}
	}

	public final void method1336(int i, Matrix4f class233, byte i_7_) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1173(i, class233);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.ad(").append(')').toString());
		}
	}

	public final void method1337(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233, byte i) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1192(class298_sub31_sub1, class233);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.w(").append(')').toString());
		}
	}

	public final void method1338(Class298_Sub31_Sub1 class298_sub31_sub1, Class217 class217, int i) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1162(class298_sub31_sub1, class217.aFloat2451, class217.aFloat2455, class217.aFloat2454);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.g(").append(')').toString());
		}
	}

	public final void method1339(Class298_Sub31_Sub1 class298_sub31_sub1, Class232 class232, int i) {
		try {
			((Class123) this).aClass110Array1469[anInt1475 * -33664303].method1163(class298_sub31_sub1, class232.aFloat2593, class232.aFloat2592, class232.aFloat2590, class232.aFloat2591);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.e(").append(')').toString());
		}
	}

	public abstract void method1340();

	public final void method1341(Class298_Sub31_Sub1 class298_sub31_sub1, int i, Interface9 interface9, int i_8_) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1167(class298_sub31_sub1, i, interface9);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.o(").append(')').toString());
		}
	}

	public final void method1342(int i, float f, float f_9_, float f_10_, float f_11_, byte i_12_) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1169(i, f, f_9_, f_10_, f_11_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.ax(").append(')').toString());
		}
	}

	public final void method1343(int i, Class217 class217, int i_13_) {
		try {
			((Class123) this).aClass110Array1469[anInt1475 * -33664303].method1168(i, class217.aFloat2451, class217.aFloat2455, class217.aFloat2454);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.aa(").append(')').toString());
		}
	}

	public final void method1344(int i, float[] fs, int i_14_, int i_15_) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1170(i, fs, i_14_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.ak(").append(')').toString());
		}
	}

	public final void method1345(int i, Matrix4f class233, byte i_16_) {
		try {
			((Class123) this).aClass110Array1469[anInt1475 * -33664303].method1171(i, class233);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.ae(").append(')').toString());
		}
	}

	public final void method1346(int i, Matrix4f class233, int i_17_) {
		try {
			((Class123) this).aClass110Array1469[anInt1475 * -33664303].method1159(i, class233);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.ao(").append(')').toString());
		}
	}

	public final void method1347(Class298_Sub31_Sub1 class298_sub31_sub1, float[] fs, byte i) {
		try {
			((Class123) this).aClass110Array1469[anInt1475 * -33664303].method1164(class298_sub31_sub1, fs, fs.length);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.c(").append(')').toString());
		}
	}

	public final void method1348(int i, int i_18_, Interface9 interface9, int i_19_) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1174(i, i_18_, interface9);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.av(").append(')').toString());
		}
	}

	public abstract boolean method1349(Class110 class110);

	public int method1350(byte i) {
		try {
			return ((Class123) this).anInt1473 * 1271998035;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.ah(").append(')').toString());
		}
	}

	public Class298_Sub31_Sub1 method1351(String string, byte i) {
		try {
			return ((Class298_Sub31_Sub1) ((Class123) this).aClass116_1471.method1263(string, -1795999546));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.al(").append(')').toString());
		}
	}

	public Class298_Sub31_Sub1 method1352(int i, int i_20_) {
		try {
			return ((Class298_Sub31_Sub1) ((Class123) this).aClass116_1468.method1266(i, (byte) -22));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.as(").append(')').toString());
		}
	}

	void method1353() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.ap(").append(')').toString());
		}
	}

	public abstract void method1354();

	public abstract void method1355();

	public abstract void method1356();

	public abstract void method1357();

	public abstract void method1358();

	public abstract boolean method1359();

	public Class298_Sub31_Sub1 method1360(String string, int i) throws Exception_Sub2_Sub1 {
		try {
			Class298_Sub31_Sub1 class298_sub31_sub1 = ((Class298_Sub31_Sub1) ((Class123) this).aClass116_1468.method1263(string, 542987786));
			if (null == class298_sub31_sub1)
				throw new Exception_Sub2_Sub1(string);
			return class298_sub31_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.at(").append(')').toString());
		}
	}

	abstract Class110 method1361(Class_ra_Sub3 class_ra_sub3, Class108 class108);

	abstract Class110 method1362(Class_ra_Sub3 class_ra_sub3, Class108 class108);

	public final void method1363(Class298_Sub31_Sub1 class298_sub31_sub1, int i, int i_21_) {
		try {
			float f = (float) (i >> 16 & 0xff) / 255.0F;
			float f_22_ = (float) (i >> 8 & 0xff) / 255.0F;
			float f_23_ = (float) (i & 0xff) / 255.0F;
			float f_24_ = (float) (i >> 24 & 0xff) / 255.0F;
			method1366(class298_sub31_sub1, f, f_22_, f_23_, f_24_, 205525128);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.m(").append(')').toString());
		}
	}

	abstract Class298_Sub31_Sub1 method1364(Class114 class114);

	public final void method1365(int i, float f, float f_25_, float f_26_, int i_27_) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1168(i, f, f_25_, f_26_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.l(").append(')').toString());
		}
	}

	public final void method1366(Class298_Sub31_Sub1 class298_sub31_sub1, float f, float f_28_, float f_29_, float f_30_, int i) {
		try {
			((Class123) this).aClass110Array1469[anInt1475 * -33664303].method1163(class298_sub31_sub1, f, f_28_, f_29_, f_30_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.v(").append(')').toString());
		}
	}

	abstract Class298_Sub31_Sub1 method1367(Class114 class114);

	public final void method1368(Class298_Sub31_Sub1 class298_sub31_sub1, Matrix4f class233, int i) {
		try {
			((Class123) this).aClass110Array1469[-33664303 * anInt1475].method1166(class298_sub31_sub1, class233);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.j(").append(')').toString());
		}
	}

	public final Class110 method1369(int i, int i_31_) {
		try {
			return ((Class123) this).aClass110Array1469[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.u(").append(')').toString());
		}
	}

	public Class298_Sub31_Sub1 method1370(int i, int i_32_) {
		try {
			return ((Class298_Sub31_Sub1) ((Class123) this).aClass116_1471.method1266(i, (byte) -95));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.ai(").append(')').toString());
		}
	}

	public abstract boolean method1371();

	public abstract void method1372();

	public abstract void method1373();

	public abstract boolean method1374();

	public abstract boolean method1375(Class110 class110);

	public abstract boolean method1376(Class110 class110);

	static final void method1377(ClientScript2 class403, byte i) {
		try {
			int i_33_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_33_, (byte) 75);
			Class119 class119 = Class389.aClass119Array4165[i_33_ >> 16];
			Class309.method3802(class105, class119, class403, (byte) 12);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.fu(").append(')').toString());
		}
	}

	public static String method1378(String string, char c, String string_34_, short i) {
		try {
			int i_35_ = string.length();
			int i_36_ = string_34_.length();
			int i_37_ = i_35_;
			int i_38_ = i_36_ - 1;
			if (i_38_ != 0) {
				int i_39_ = 0;
				for (;;) {
					i_39_ = string.indexOf(c, i_39_);
					if (i_39_ < 0) {
						if (i != 316) {
							/* empty */
						}
						break;
					}
					i_39_++;
					i_37_ += i_38_;
				}
			}
			StringBuilder stringbuilder = new StringBuilder(i_37_);
			int i_40_ = 0;
			for (;;) {
				int i_41_ = string.indexOf(c, i_40_);
				if (i_41_ < 0) {
					if (i != 316)
						throw new IllegalStateException();
					break;
				}
				stringbuilder.append(string.substring(i_40_, i_41_));
				stringbuilder.append(string_34_);
				i_40_ = i_41_ + 1;
			}
			stringbuilder.append(string.substring(i_40_));
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.t(").append(')').toString());
		}
	}

	static final void method1379(ClientScript2 class403, byte i) {
		try {
			int i_42_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_42_).anInt5704) * 789409129 == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ez.aah(").append(')').toString());
		}
	}
}
