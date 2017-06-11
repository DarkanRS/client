/* Class138_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class138_Sub1 extends Class138 {
	Class110[] aClass110Array6992 = new Class110[3];
	static int anInt6993 = 0;
	static int anInt6994 = 0;
	static int anInt6995 = 2;
	static int anInt6996 = 3;
	static int anInt6997 = 4;
	static int anInt6998 = 5;
	static int anInt6999 = 6;
	static int anInt7000 = 7;
	Class123 aClass123_7001;
	static int anInt7002 = 1;
	Class232 aClass232_7003;
	static int anInt7004 = 3;
	static int anInt7005 = 2;
	int[][] anIntArrayArray7006 = new int[3][7];
	int[] anIntArray7007;
	Class232 aClass232_7008 = new Class232(1.0F, 1.0F, 1.0F, 1.0F);
	static int anInt7009 = 1;
	public static Class131 aClass131_7010;

	public void method1537() {
		((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[1]);
		((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(1490567798)]);
		((Class138_Sub1) this).aClass123_7001.method1348(((Class138_Sub1) this).anIntArray7007[2], 1, anInterface9_Impl2_1536, 1647913438);
		((Class138_Sub1) this).aClass123_7001.method1346((((Class138_Sub1) this).anIntArray7007[4]), aClass233_1542, -1599730439);
		method1540(-512231280);
	}

	boolean method1539(int i) throws Exception_Sub2 {
		try {
			((Class138_Sub1) this).aClass123_7001 = aClass_ra_Sub3_1539.method5297("Sprite");
			Class298_Sub31_Sub1 class298_sub31_sub1 = ((Class138_Sub1) this).aClass123_7001.method1360("WVPMatrix", -1337554714);
			Class298_Sub31_Sub1 class298_sub31_sub1_0_ = ((Class138_Sub1) this).aClass123_7001.method1360("SpriteSampler", -347092125);
			Class298_Sub31_Sub1 class298_sub31_sub1_1_ = ((Class138_Sub1) this).aClass123_7001.method1360("MaskSampler", -1001377482);
			Class298_Sub31_Sub1 class298_sub31_sub1_2_ = ((Class138_Sub1) this).aClass123_7001.method1360("MulColour", 116022092);
			Class298_Sub31_Sub1 class298_sub31_sub1_3_ = ((Class138_Sub1) this).aClass123_7001.method1360("AddColour", -797757613);
			Class298_Sub31_Sub1 class298_sub31_sub1_4_ = ((Class138_Sub1) this).aClass123_7001.method1360("SpriteTexCoordMatrix", 271809133);
			Class298_Sub31_Sub1 class298_sub31_sub1_5_ = ((Class138_Sub1) this).aClass123_7001.method1360("MaskTexCoordMatrix", 1713273798);
			((Class138_Sub1) this).aClass110Array6992[0] = ((Class138_Sub1) this).aClass123_7001.method1327("Normal", (byte) -30);
			((Class138_Sub1) this).aClass110Array6992[1] = ((Class138_Sub1) this).aClass123_7001.method1327("Masked", (byte) -23);
			((Class138_Sub1) this).aClass110Array6992[2] = ((Class138_Sub1) this).aClass123_7001.method1327("AlphaTex", (byte) -96);
			for (int i_6_ = 0; i_6_ < 3; i_6_++) {
				int i_7_ = (((Class138_Sub1) this).aClass123_7001.method1329(((Class138_Sub1) this).aClass110Array6992[i_6_], -180449856));
				((Class138_Sub1) this).anIntArrayArray7006[i_6_][0] = class298_sub31_sub1.method3119(i_7_);
				((Class138_Sub1) this).anIntArrayArray7006[i_6_][1] = class298_sub31_sub1_0_.method3119(i_7_);
				((Class138_Sub1) this).anIntArrayArray7006[i_6_][2] = class298_sub31_sub1_1_.method3119(i_7_);
				((Class138_Sub1) this).anIntArrayArray7006[i_6_][5] = class298_sub31_sub1_2_.method3119(i_7_);
				((Class138_Sub1) this).anIntArrayArray7006[i_6_][6] = class298_sub31_sub1_3_.method3119(i_7_);
				((Class138_Sub1) this).anIntArrayArray7006[i_6_][3] = class298_sub31_sub1_4_.method3119(i_7_);
				((Class138_Sub1) this).anIntArrayArray7006[i_6_][4] = class298_sub31_sub1_5_.method3119(i_7_);
			}
			((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[0]);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yi.y(").append(')').toString());
		}
	}

	public void method1531() {
		((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[0]);
		((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(1620928863)]);
		method1540(-512231280);
	}

	public void method1534() {
		((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[1]);
		((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(1799614751)]);
		((Class138_Sub1) this).aClass123_7001.method1348(((Class138_Sub1) this).anIntArray7007[2], 1, anInterface9_Impl2_1536, -291659161);
		((Class138_Sub1) this).aClass123_7001.method1346((((Class138_Sub1) this).anIntArray7007[4]), aClass233_1542, -1599730439);
		method1540(-512231280);
	}

	void method1540(int i) {
		try {
			((Class138_Sub1) this).aClass123_7001.method1340();
			((Class138_Sub1) this).aClass123_7001.method1348(((Class138_Sub1) this).anIntArray7007[1], 0, anInterface9_Impl2_1537, -1250819692);
			aClass_ra_Sub3_1539.method5335(aClass233_1540);
			((Class138_Sub1) this).aClass123_7001.method1336(((Class138_Sub1) this).anIntArray7007[0], aClass233_1540, (byte) -62);
			((Class138_Sub1) this).aClass123_7001.method1346(((Class138_Sub1) this).anIntArray7007[3], aClass233_1541, -1599730439);
			((Class138_Sub1) this).aClass123_7001.method1342(((Class138_Sub1) this).anIntArray7007[5], ((Class138_Sub1) this).aClass232_7008.aFloat2593, ((Class138_Sub1) this).aClass232_7008.aFloat2592, ((Class138_Sub1) this).aClass232_7008.aFloat2590, ((Class138_Sub1) this).aClass232_7008.aFloat2591, (byte) 6);
			((Class138_Sub1) this).aClass123_7001.method1342(((Class138_Sub1) this).anIntArray7007[6], ((Class138_Sub1) this).aClass232_7003.aFloat2593, ((Class138_Sub1) this).aClass232_7003.aFloat2592, ((Class138_Sub1) this).aClass232_7003.aFloat2590, ((Class138_Sub1) this).aClass232_7003.aFloat2591, (byte) 29);
			aClass_ra_Sub3_1539.method5383(0, anInterface7_Impl1_1538);
			aClass_ra_Sub3_1539.method5455(aClass153_1544);
			aClass_ra_Sub3_1539.method5398(Class187.aClass187_1906, anInt1543, 2);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yi.t(").append(')').toString());
		}
	}

	public void method1528() {
		try {
			((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[1]);
			((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(983668425)]);
			((Class138_Sub1) this).aClass123_7001.method1348(((Class138_Sub1) this).anIntArray7007[2], 1, anInterface9_Impl2_1536, 1449956625);
			((Class138_Sub1) this).aClass123_7001.method1346(((Class138_Sub1) this).anIntArray7007[4], aClass233_1542, -1599730439);
			method1540(-512231280);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yi.b(").append(')').toString());
		}
	}

	public void method1529(int i, int i_8_) {
		switch (i) {
		case 0:
			((Class138_Sub1) this).aClass232_7008.method2136(i_8_);
			((Class138_Sub1) this).aClass232_7003.method2136(0);
			break;
		case 2:
			((Class138_Sub1) this).aClass232_7008.method2136(i_8_);
			((Class138_Sub1) this).aClass232_7003.method2136(0);
			break;
		case 1:
			((Class138_Sub1) this).aClass232_7008.method2136(-1);
			((Class138_Sub1) this).aClass232_7003.method2136(0);
			break;
		case 4:
			((Class138_Sub1) this).aClass232_7008.method2136(-1);
			((Class138_Sub1) this).aClass232_7003.method2136(i_8_);
			((Class138_Sub1) this).aClass232_7003.method2137();
			break;
		case 3:
			((Class138_Sub1) this).aClass232_7008.method2136(0xffffff | i_8_ & ~0xffffff);
			((Class138_Sub1) this).aClass232_7003.method2136(i_8_ & 0xffffff);
			break;
		}
	}

	public void method1530(int i, int i_9_) {
		switch (i) {
		case 0:
			((Class138_Sub1) this).aClass232_7008.method2136(i_9_);
			((Class138_Sub1) this).aClass232_7003.method2136(0);
			break;
		case 2:
			((Class138_Sub1) this).aClass232_7008.method2136(i_9_);
			((Class138_Sub1) this).aClass232_7003.method2136(0);
			break;
		case 1:
			((Class138_Sub1) this).aClass232_7008.method2136(-1);
			((Class138_Sub1) this).aClass232_7003.method2136(0);
			break;
		case 4:
			((Class138_Sub1) this).aClass232_7008.method2136(-1);
			((Class138_Sub1) this).aClass232_7003.method2136(i_9_);
			((Class138_Sub1) this).aClass232_7003.method2137();
			break;
		case 3:
			((Class138_Sub1) this).aClass232_7008.method2136(0xffffff | i_9_ & ~0xffffff);
			((Class138_Sub1) this).aClass232_7003.method2136(i_9_ & 0xffffff);
			break;
		}
	}

	public void method1536() {
		((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[1]);
		((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(1377516236)]);
		((Class138_Sub1) this).aClass123_7001.method1348(((Class138_Sub1) this).anIntArray7007[2], 1, anInterface9_Impl2_1536, -709585424);
		((Class138_Sub1) this).aClass123_7001.method1346((((Class138_Sub1) this).anIntArray7007[4]), aClass233_1542, -1599730439);
		method1540(-512231280);
	}

	public void method1532() {
		((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[0]);
		((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(1548061224)]);
		method1540(-512231280);
	}

	public void method1535() {
		((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[0]);
		((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(1025602377)]);
		method1540(-512231280);
	}

	public void method1525() {
		((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[0]);
		((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(1272253028)]);
		method1540(-512231280);
	}

	public Class138_Sub1(Class_ra_Sub3 class_ra_sub3) throws Exception_Sub2 {
		super(class_ra_sub3);
		((Class138_Sub1) this).aClass232_7003 = new Class232(0.0F, 0.0F, 0.0F, 0.0F);
		method1539(-964242582);
	}

	public void method1533() {
		((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[1]);
		((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(2074431922)]);
		((Class138_Sub1) this).aClass123_7001.method1348(((Class138_Sub1) this).anIntArray7007[2], 1, anInterface9_Impl2_1536, -2013036939);
		((Class138_Sub1) this).aClass123_7001.method1346((((Class138_Sub1) this).anIntArray7007[4]), aClass233_1542, -1599730439);
		method1540(-512231280);
	}

	public void method1527() {
		try {
			((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[0]);
			((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(1291749440)]);
			method1540(-512231280);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yi.f(").append(')').toString());
		}
	}

	public void method1538() {
		((Class138_Sub1) this).aClass123_7001.method1331(((Class138_Sub1) this).aClass110Array6992[1]);
		((Class138_Sub1) this).anIntArray7007 = (((Class138_Sub1) this).anIntArrayArray7006[((Class138_Sub1) this).aClass123_7001.method1333(1159640978)]);
		((Class138_Sub1) this).aClass123_7001.method1348(((Class138_Sub1) this).anIntArray7007[2], 1, anInterface9_Impl2_1536, -2044717945);
		((Class138_Sub1) this).aClass123_7001.method1346((((Class138_Sub1) this).anIntArray7007[4]), aClass233_1542, -1599730439);
		method1540(-512231280);
	}

	public void method1526(int i, int i_10_) {
		try {
			switch (i) {
			case 0:
				((Class138_Sub1) this).aClass232_7008.method2136(i_10_);
				((Class138_Sub1) this).aClass232_7003.method2136(0);
				break;
			case 2:
				((Class138_Sub1) this).aClass232_7008.method2136(i_10_);
				((Class138_Sub1) this).aClass232_7003.method2136(0);
				break;
			case 1:
				((Class138_Sub1) this).aClass232_7008.method2136(-1);
				((Class138_Sub1) this).aClass232_7003.method2136(0);
				break;
			case 4:
				((Class138_Sub1) this).aClass232_7008.method2136(-1);
				((Class138_Sub1) this).aClass232_7003.method2136(i_10_);
				((Class138_Sub1) this).aClass232_7003.method2137();
				break;
			case 3:
				((Class138_Sub1) this).aClass232_7008.method2136(0xffffff | i_10_ & ~0xffffff);
				((Class138_Sub1) this).aClass232_7003.method2136(i_10_ & 0xffffff);
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yi.a(").append(')').toString());
		}
	}

	static final void method1541(ClientScript2 class403, int i) {
		try {
			int i_11_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub28_7573.method5612(i_11_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yi.aoz(").append(')').toString());
		}
	}

	static final void method1542(ClientScript2 class403, int i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_12_, (byte) -15);
			Class119 class119 = Class389.aClass119Array4165[i_12_ >> 16];
			ConfigDefinitions.method3978(class105, class119, class403, 1912101040);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yi.lb(").append(')').toString());
		}
	}

	static final void method1543(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1959403445;
			Class239.method2210((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]), (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]), (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]), (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 3]), (((ClientScript2) class403).anIntArray5244[4 + 681479919 * ((ClientScript2) class403).anInt5239]), 1835382767);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yi.tn(").append(')').toString());
		}
	}
}
