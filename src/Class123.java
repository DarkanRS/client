/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class123 {
	Class474 aClass474_1536;
	byte aByte1537;
	Class539 aClass539_1538;
	Class521_Sub1 aClass521_Sub1_1539;
	int anInt1540;
	Class476 aClass476_1541;
	int anInt1542;
	boolean aBool1543 = false;
	MeshRasterizer aClass528_1544;
	Class456 aClass456_1545;
	boolean aBool1546;
	int anInt1547 = 709399509;
	int anInt1548;
	byte aByte1549;
	boolean aBool1550;
	Class282_Sub50_Sub17 aClass282_Sub50_Sub17_1551;
	boolean aBool1552;
	boolean[] aBoolArray1553;
	int anInt1554 = 0;
	int anInt1555;

	int method2113() {
		return -method2115(-1367637934);
	}

	public void method2114(int i, int i_0_) {
		((Class123) this).aBool1546 = true;
		method2124(false, i, 1, 1157413618);
	}

	int method2115(int i) {
		return ((Class123) this).anInt1554 * 601889229;
	}

	void method2116(Class476 class476, int i) {
		((Class123) this).aClass476_1541 = class476;
		((Class123) this).aClass528_1544 = null;
	}

	boolean method2117(int i) {
		return ((Class123) this).aBool1550;
	}

	void method2118(GraphicalRenderer class505, int i) {
		if (((Class123) this).aClass282_Sub50_Sub17_1551 != null) {
			Class385 class385 = (((Class123) this).aClass521_Sub1_1539.method11166().aClass385_3595);
			client.aClass257_7353.method4430(-1991984810).method3427(((Class123) this).aClass282_Sub50_Sub17_1551, ((Class123) this).aByte1549, (int) class385.aFloat4671, (int) class385.aFloat4673, ((Class123) this).aBoolArray1553, (byte) -43);
			((Class123) this).aBoolArray1553 = null;
			((Class123) this).aClass282_Sub50_Sub17_1551 = null;
		}
	}

	void method2119(GraphicalRenderer class505, MeshRasterizer class528, Class294 class294, int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
		Class87[] class87s = class528.method11253();
		Class172[] class172s = class528.method11274();
		if ((null == ((Class123) this).aClass539_1538 || ((Class123) this).aClass539_1538.aBool7132) && (null != class87s || class172s != null)) {
			Class478 class478 = (((Class123) this).aClass474_1536.method7891(1535779425 * ((Class123) this).anInt1540, 65280));
			if (class478.anIntArray5650 != null)
				class478 = class478.method8013((4 == client.anInt7341 * -891719545 ? (Interface42) (Class86.anInterface42_832) : Class158_Sub1.aClass3_8507), (byte) -36);
			if (class478 != null)
				((Class123) this).aClass539_1538 = Class539.method11557(-1809259861 * client.cycles, true);
		}
		if (null != ((Class123) this).aClass539_1538) {
			class528.method11273(class294);
			if (bool)
				((Class123) this).aClass539_1538.method11511(class505, (long) (-1809259861 * client.cycles), class87s, class172s, false);
			else
				((Class123) this).aClass539_1538.method11512((long) (client.cycles * -1809259861));
			((Class123) this).aClass539_1538.method11515(((Class123) this).aByte1537, i, i_1_, i_2_, i_3_);
		}
	}

	public void method2120(int i) {
		((Class123) this).aBool1546 = true;
		method2124(false, i, 1, 1157413618);
	}

	int method2121(byte i) {
		return -method2115(-771412764);
	}

	boolean method2122() {
		return ((Class123) this).aBool1550;
	}

	void method2123(Class521_Sub1 class521_sub1) {
		if (((Class123) this).aClass456_1545.method7564(1708173248)) {
			if (((Class123) this).aClass456_1545.method7627((client.cycles * -1809259861 - ((Class123) this).anInt1548 * -692862065), 348397659)) {
				if (Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -33) == 2)
					((Class123) this).aBool1552 = false;
				if (((Class123) this).aClass456_1545.method7580(1474739099)) {
					((Class123) this).aClass456_1545.method7567(-1, (short) 8960);
					((Class123) this).aBool1546 = false;
					method2124(false, -1, 0, 1157413618);
				}
			}
		} else
			method2124(false, -1, 0, 1157413618);
		((Class123) this).anInt1548 = -1012076251 * client.cycles;
	}

	void method2124(boolean bool, int i, int i_5_, int i_6_) {
		int i_7_ = i;
		boolean bool_8_ = false;
		if (-1 == i_7_) {
			Class478 class478 = (((Class123) this).aClass474_1536.method7891(1535779425 * ((Class123) this).anInt1540, 65280));
			Class478 class478_9_ = class478;
			if (null != class478.anIntArray5650)
				class478 = class478.method8013((client.anInt7341 * -891719545 == 4 ? (Interface42) (Class86.anInterface42_832) : Class158_Sub1.aClass3_8507), (byte) 4);
			if (null == class478)
				return;
			if (class478_9_ == class478)
				class478_9_ = null;
			if (class478.method7967((byte) 82)) {
				if (bool && ((Class123) this).aClass456_1545.method7564(-1739979372) && class478.method7979(((Class123) this).aClass456_1545.method7597(-2131313079), -1433895387))
					return;
				if (class478.anInt5633 * -2132690865 != -1003883901 * ((Class123) this).anInt1547)
					bool_8_ = class478.aBool5702;
				i_7_ = class478.method7977((byte) -48);
				if (class478.method7976((short) 8704))
					i_5_ = 0;
				else
					i_5_ = 1;
			} else if (null != class478_9_ && class478_9_.method7967((byte) 72)) {
				if (bool && ((Class123) this).aClass456_1545.method7564(1842147975) && class478_9_.method7979(((Class123) this).aClass456_1545.method7597(-693467586), 512535535))
					return;
				if (-1003883901 * ((Class123) this).anInt1547 != -2132690865 * class478.anInt5633)
					bool_8_ = class478_9_.aBool5702;
				i_7_ = class478_9_.method7977((byte) 33);
				if (class478_9_.method7976((short) 8704))
					i_5_ = 0;
				else
					i_5_ = 1;
			}
		}
		if (i_7_ == -1)
			((Class123) this).aClass456_1545.method7569(-1, false, -2029510144);
		else {
			((Class123) this).aClass456_1545.method7571(i_7_, 0, i_5_, bool_8_, -1486563257);
			((Class123) this).anInt1548 = client.cycles * -1012076251;
			((Class123) this).aBool1552 = false;
			((Class123) this).aClass528_1544 = null;
		}
	}

	void method2125(GraphicalRenderer class505) {
		method2132(class505, 262144, true, true, -1384937123);
	}

	public void method2126(int i) {
		((Class123) this).aBool1546 = true;
		method2124(false, i, 1, 1157413618);
	}

	public void method2127(int i) {
		((Class123) this).aBool1546 = true;
		method2124(false, i, 1, 1157413618);
	}

	int method2128() {
		return ((Class123) this).anInt1554 * 601889229;
	}

	void method2129(GraphicalRenderer class505) {
		method2132(class505, 262144, true, true, -1384937123);
	}

	int method2130() {
		return ((Class123) this).anInt1554 * 601889229;
	}

	Class123(GraphicalRenderer class505, Class474 class474, Class478 class478, int i, int i_10_, int i_11_, int i_12_, Class521_Sub1 class521_sub1, boolean bool, int i_13_) {
		((Class123) this).aBool1546 = false;
		((Class123) this).aBool1552 = false;
		((Class123) this).aClass474_1536 = class474;
		((Class123) this).anInt1540 = 1515141295 * class478.anInt5633;
		((Class123) this).anInt1555 = 2129865927 * i;
		((Class123) this).anInt1542 = -2132267033 * i_10_;
		((Class123) this).aClass521_Sub1_1539 = class521_sub1;
		((Class123) this).aBool1546 = -1 != i_13_;
		((Class123) this).aByte1537 = (byte) i_11_;
		((Class123) this).aByte1549 = (byte) i_12_;
		((Class123) this).aBool1543 = bool;
		((Class123) this).aBool1550 = (class505.method8402() && class478.aBool5703 && !((Class123) this).aBool1543);
		((Class123) this).aClass456_1545 = new Class456_Sub2(class521_sub1, false);
		method2124(false, i_13_, 1, 1157413618);
	}

	void method2131(Class476 class476) {
		((Class123) this).aClass476_1541 = class476;
		((Class123) this).aClass528_1544 = null;
	}

	final MeshRasterizer method2132(GraphicalRenderer class505, int i, boolean bool, boolean bool_14_, int i_15_) {
		Class478 class478 = ((Class123) this).aClass474_1536.method7891(((Class123) this).anInt1540 * 1535779425, 65280);
		if (class478.anIntArray5650 != null)
			class478 = class478.method8013((4 == client.anInt7341 * -891719545 ? (Interface42) (Class86.anInterface42_832) : Class158_Sub1.aClass3_8507), (byte) 31);
		if (null == class478) {
			method2118(class505, 2015419671);
			((Class123) this).anInt1547 = 709399509;
			return null;
		}
		if (!((Class123) this).aBool1546 && (((Class123) this).anInt1547 * -1003883901 != -2132690865 * class478.anInt5633)) {
			method2124(true, -1, 0, 1157413618);
			((Class123) this).aBool1552 = false;
			((Class123) this).aClass528_1544 = null;
		}
		method2133(((Class123) this).aClass521_Sub1_1539, 1031248161);
		if (bool_14_)
			bool_14_ = bool_14_ & (((Class123) this).aBool1550 & !((Class123) this).aBool1552 & Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -25) != 0);
		if (bool && !bool_14_) {
			((Class123) this).anInt1547 = class478.anInt5633 * 1529104709;
			return null;
		}
		Class385 class385 = (((Class123) this).aClass521_Sub1_1539.method11166().aClass385_3595);
		Class206 class206 = client.aClass257_7353.method4430(-2004926636);
		if (bool_14_) {
			class206.method3427(((Class123) this).aClass282_Sub50_Sub17_1551, ((Class123) this).aByte1549, (int) class385.aFloat4671, (int) class385.aFloat4673, ((Class123) this).aBoolArray1553, (byte) -45);
			((Class123) this).aBool1552 = false;
		}
		Class390 class390 = class206.aClass390Array2591[((Class123) this).aByte1549];
		Class390 class390_16_;
		if (((Class123) this).aBool1543)
			class390_16_ = class206.aClass390Array2607[0];
		else
			class390_16_ = (((Class123) this).aByte1549 < 3 ? (class206.aClass390Array2591[1 + ((Class123) this).aByte1549]) : null);
		MeshRasterizer class528 = null;
		if (((Class123) this).aClass456_1545.method7564(204760796)) {
			if (bool_14_)
				i |= 0x40000;
			class528 = (class478.method8012(class505, i, (11 != 845010167 * ((Class123) this).anInt1555 ? 845010167 * ((Class123) this).anInt1555 : 10), (11 == ((Class123) this).anInt1555 * 845010167 ? 4 + ((Class123) this).anInt1542 * -515017769 : -515017769 * ((Class123) this).anInt1542), class390, class390_16_, (int) class385.aFloat4671, class390.method6709((int) class385.aFloat4671, (int) class385.aFloat4673, -2124588555), (int) class385.aFloat4673, ((Class123) this).aClass456_1545,
					((Class123) this).aClass476_1541, 1502121981));
			if (class528 != null) {
				if (bool_14_) {
					if (null == ((Class123) this).aBoolArray1553)
						((Class123) this).aBoolArray1553 = new boolean[4];
					((Class123) this).aClass282_Sub50_Sub17_1551 = class528.ga(((Class123) this).aClass282_Sub50_Sub17_1551);
					class206.method3426((((Class123) this).aClass282_Sub50_Sub17_1551), ((Class123) this).aByte1549, (int) class385.aFloat4671, (int) class385.aFloat4673, ((Class123) this).aBoolArray1553, (byte) -96);
					((Class123) this).aBool1552 = true;
				}
				((Class123) this).anInt1554 = class528.YA() * -14517499;
				class528.n();
			} else {
				((Class123) this).aBoolArray1553 = null;
				((Class123) this).aClass282_Sub50_Sub17_1551 = null;
				((Class123) this).anInt1554 = 0;
			}
			((Class123) this).aClass528_1544 = null;
		} else if (((Class123) this).aClass528_1544 == null || (((Class123) this).aClass528_1544.m() & i) != i || (-1003883901 * ((Class123) this).anInt1547 != class478.anInt5633 * -2132690865)) {
			if (((Class123) this).aClass528_1544 != null)
				i |= ((Class123) this).aClass528_1544.m();
			Class452 class452 = (class478.method8010(class505, i, (11 != ((Class123) this).anInt1555 * 845010167 ? 845010167 * ((Class123) this).anInt1555 : 10), (11 == 845010167 * ((Class123) this).anInt1555 ? 4 + ((Class123) this).anInt1542 * -515017769 : -515017769 * ((Class123) this).anInt1542), class390, class390_16_, (int) class385.aFloat4671, class390.method6709((int) class385.aFloat4671, (int) class385.aFloat4673, -2029689654), (int) class385.aFloat4673, bool_14_,
					((Class123) this).aClass476_1541, 1886483873));
			if (class452 != null) {
				((Class123) this).aClass528_1544 = class528 = (MeshRasterizer) class452.anObject5443;
				if (bool_14_) {
					((Class123) this).aClass282_Sub50_Sub17_1551 = (Class282_Sub50_Sub17) class452.anObject5444;
					((Class123) this).aBoolArray1553 = null;
					class206.method3426((((Class123) this).aClass282_Sub50_Sub17_1551), ((Class123) this).aByte1549, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -31);
					((Class123) this).aBool1552 = true;
				}
				((Class123) this).anInt1554 = class528.YA() * -14517499;
				class528.n();
			} else {
				((Class123) this).aBoolArray1553 = null;
				((Class123) this).aClass282_Sub50_Sub17_1551 = null;
				((Class123) this).aClass528_1544 = null;
				((Class123) this).anInt1554 = 0;
			}
		} else
			class528 = ((Class123) this).aClass528_1544;
		((Class123) this).anInt1547 = 1529104709 * class478.anInt5633;
		return class528;
	}

	void method2133(Class521_Sub1 class521_sub1, int i) {
		if (((Class123) this).aClass456_1545.method7564(1068891376)) {
			if (((Class123) this).aClass456_1545.method7627((client.cycles * -1809259861 - ((Class123) this).anInt1548 * -692862065), -1604815652)) {
				if (Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -127) == 2)
					((Class123) this).aBool1552 = false;
				if (((Class123) this).aClass456_1545.method7580(487845582)) {
					((Class123) this).aClass456_1545.method7567(-1, (short) 8960);
					((Class123) this).aBool1546 = false;
					method2124(false, -1, 0, 1157413618);
				}
			}
		} else
			method2124(false, -1, 0, 1157413618);
		((Class123) this).anInt1548 = -1012076251 * client.cycles;
	}

	final MeshRasterizer method2134(GraphicalRenderer class505, int i, boolean bool, boolean bool_17_) {
		Class478 class478 = ((Class123) this).aClass474_1536.method7891(((Class123) this).anInt1540 * 1535779425, 65280);
		if (class478.anIntArray5650 != null)
			class478 = class478.method8013((4 == client.anInt7341 * -891719545 ? (Interface42) (Class86.anInterface42_832) : Class158_Sub1.aClass3_8507), (byte) 101);
		if (null == class478) {
			method2118(class505, 1922764072);
			((Class123) this).anInt1547 = 709399509;
			return null;
		}
		if (!((Class123) this).aBool1546 && (((Class123) this).anInt1547 * -1003883901 != -2132690865 * class478.anInt5633)) {
			method2124(true, -1, 0, 1157413618);
			((Class123) this).aBool1552 = false;
			((Class123) this).aClass528_1544 = null;
		}
		method2133(((Class123) this).aClass521_Sub1_1539, 1031248161);
		if (bool_17_)
			bool_17_ = bool_17_ & (((Class123) this).aBool1550 & !((Class123) this).aBool1552 & Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -97) != 0);
		if (bool && !bool_17_) {
			((Class123) this).anInt1547 = class478.anInt5633 * 1529104709;
			return null;
		}
		Class385 class385 = (((Class123) this).aClass521_Sub1_1539.method11166().aClass385_3595);
		Class206 class206 = client.aClass257_7353.method4430(-1379561670);
		if (bool_17_) {
			class206.method3427(((Class123) this).aClass282_Sub50_Sub17_1551, ((Class123) this).aByte1549, (int) class385.aFloat4671, (int) class385.aFloat4673, ((Class123) this).aBoolArray1553, (byte) -82);
			((Class123) this).aBool1552 = false;
		}
		Class390 class390 = class206.aClass390Array2591[((Class123) this).aByte1549];
		Class390 class390_18_;
		if (((Class123) this).aBool1543)
			class390_18_ = class206.aClass390Array2607[0];
		else
			class390_18_ = (((Class123) this).aByte1549 < 3 ? (class206.aClass390Array2591[1 + ((Class123) this).aByte1549]) : null);
		MeshRasterizer class528 = null;
		if (((Class123) this).aClass456_1545.method7564(311181349)) {
			if (bool_17_)
				i |= 0x40000;
			class528 = (class478.method8012(class505, i, (11 != 845010167 * ((Class123) this).anInt1555 ? 845010167 * ((Class123) this).anInt1555 : 10), (11 == ((Class123) this).anInt1555 * 845010167 ? 4 + ((Class123) this).anInt1542 * -515017769 : -515017769 * ((Class123) this).anInt1542), class390, class390_18_, (int) class385.aFloat4671, class390.method6709((int) class385.aFloat4671, (int) class385.aFloat4673, -213074968), (int) class385.aFloat4673, ((Class123) this).aClass456_1545,
					((Class123) this).aClass476_1541, 1059680924));
			if (class528 != null) {
				if (bool_17_) {
					if (null == ((Class123) this).aBoolArray1553)
						((Class123) this).aBoolArray1553 = new boolean[4];
					((Class123) this).aClass282_Sub50_Sub17_1551 = class528.ga(((Class123) this).aClass282_Sub50_Sub17_1551);
					class206.method3426((((Class123) this).aClass282_Sub50_Sub17_1551), ((Class123) this).aByte1549, (int) class385.aFloat4671, (int) class385.aFloat4673, ((Class123) this).aBoolArray1553, (byte) -39);
					((Class123) this).aBool1552 = true;
				}
				((Class123) this).anInt1554 = class528.YA() * -14517499;
				class528.n();
			} else {
				((Class123) this).aBoolArray1553 = null;
				((Class123) this).aClass282_Sub50_Sub17_1551 = null;
				((Class123) this).anInt1554 = 0;
			}
			((Class123) this).aClass528_1544 = null;
		} else if (((Class123) this).aClass528_1544 == null || (((Class123) this).aClass528_1544.m() & i) != i || (-1003883901 * ((Class123) this).anInt1547 != class478.anInt5633 * -2132690865)) {
			if (((Class123) this).aClass528_1544 != null)
				i |= ((Class123) this).aClass528_1544.m();
			Class452 class452 = (class478.method8010(class505, i, (11 != ((Class123) this).anInt1555 * 845010167 ? 845010167 * ((Class123) this).anInt1555 : 10), (11 == 845010167 * ((Class123) this).anInt1555 ? 4 + ((Class123) this).anInt1542 * -515017769 : -515017769 * ((Class123) this).anInt1542), class390, class390_18_, (int) class385.aFloat4671, class390.method6709((int) class385.aFloat4671, (int) class385.aFloat4673, 714009934), (int) class385.aFloat4673, bool_17_,
					((Class123) this).aClass476_1541, -1512660371));
			if (class452 != null) {
				((Class123) this).aClass528_1544 = class528 = (MeshRasterizer) class452.anObject5443;
				if (bool_17_) {
					((Class123) this).aClass282_Sub50_Sub17_1551 = (Class282_Sub50_Sub17) class452.anObject5444;
					((Class123) this).aBoolArray1553 = null;
					class206.method3426((((Class123) this).aClass282_Sub50_Sub17_1551), ((Class123) this).aByte1549, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -109);
					((Class123) this).aBool1552 = true;
				}
				((Class123) this).anInt1554 = class528.YA() * -14517499;
				class528.n();
			} else {
				((Class123) this).aBoolArray1553 = null;
				((Class123) this).aClass282_Sub50_Sub17_1551 = null;
				((Class123) this).aClass528_1544 = null;
				((Class123) this).anInt1554 = 0;
			}
		} else
			class528 = ((Class123) this).aClass528_1544;
		((Class123) this).anInt1547 = 1529104709 * class478.anInt5633;
		return class528;
	}

	boolean method2135() {
		return ((Class123) this).aBool1550;
	}

	void method2136(GraphicalRenderer class505, byte i) {
		method2132(class505, 262144, true, true, -1384937123);
	}

	boolean method2137() {
		return ((Class123) this).aBool1550;
	}

	boolean method2138() {
		return ((Class123) this).aBool1550;
	}

	int method2139() {
		return ((Class123) this).anInt1554 * 601889229;
	}

	void method2140(GraphicalRenderer class505) {
		method2132(class505, 262144, true, true, -1384937123);
	}

	void method2141(GraphicalRenderer class505) {
		method2132(class505, 262144, true, true, -1384937123);
	}

	void method2142(GraphicalRenderer class505) {
		method2132(class505, 262144, true, true, -1384937123);
	}

	int method2143() {
		return -method2115(1218413180);
	}

	void method2144(Class521_Sub1 class521_sub1) {
		if (((Class123) this).aClass456_1545.method7564(-1550049127)) {
			if (((Class123) this).aClass456_1545.method7627((client.cycles * -1809259861 - ((Class123) this).anInt1548 * -692862065), -857224704)) {
				if (Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -98) == 2)
					((Class123) this).aBool1552 = false;
				if (((Class123) this).aClass456_1545.method7580(791336171)) {
					((Class123) this).aClass456_1545.method7567(-1, (short) 8960);
					((Class123) this).aBool1546 = false;
					method2124(false, -1, 0, 1157413618);
				}
			}
		} else
			method2124(false, -1, 0, 1157413618);
		((Class123) this).anInt1548 = -1012076251 * client.cycles;
	}

	void method2145(Class521_Sub1 class521_sub1) {
		if (((Class123) this).aClass456_1545.method7564(-235748061)) {
			if (((Class123) this).aClass456_1545.method7627((client.cycles * -1809259861 - ((Class123) this).anInt1548 * -692862065), 797375566)) {
				if (Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -116) == 2)
					((Class123) this).aBool1552 = false;
				if (((Class123) this).aClass456_1545.method7580(1531553331)) {
					((Class123) this).aClass456_1545.method7567(-1, (short) 8960);
					((Class123) this).aBool1546 = false;
					method2124(false, -1, 0, 1157413618);
				}
			}
		} else
			method2124(false, -1, 0, 1157413618);
		((Class123) this).anInt1548 = -1012076251 * client.cycles;
	}

	void method2146(Class476 class476) {
		((Class123) this).aClass476_1541 = class476;
		((Class123) this).aClass528_1544 = null;
	}

	void method2147(boolean bool, int i, int i_19_) {
		int i_20_ = i;
		boolean bool_21_ = false;
		if (-1 == i_20_) {
			Class478 class478 = (((Class123) this).aClass474_1536.method7891(1535779425 * ((Class123) this).anInt1540, 65280));
			Class478 class478_22_ = class478;
			if (null != class478.anIntArray5650)
				class478 = class478.method8013((client.anInt7341 * -891719545 == 4 ? (Interface42) (Class86.anInterface42_832) : Class158_Sub1.aClass3_8507), (byte) -17);
			if (null == class478)
				return;
			if (class478_22_ == class478)
				class478_22_ = null;
			if (class478.method7967((byte) 31)) {
				if (bool && ((Class123) this).aClass456_1545.method7564(2012022989) && class478.method7979(((Class123) this).aClass456_1545.method7597(-701221617), 2128002880))
					return;
				if (class478.anInt5633 * -2132690865 != -1003883901 * ((Class123) this).anInt1547)
					bool_21_ = class478.aBool5702;
				i_20_ = class478.method7977((byte) 27);
				if (class478.method7976((short) 8704))
					i_19_ = 0;
				else
					i_19_ = 1;
			} else if (null != class478_22_ && class478_22_.method7967((byte) 21)) {
				if (bool && ((Class123) this).aClass456_1545.method7564(1863527525) && class478_22_.method7979(((Class123) this).aClass456_1545.method7597(-2143509474), 1385894342))
					return;
				if (-1003883901 * ((Class123) this).anInt1547 != -2132690865 * class478.anInt5633)
					bool_21_ = class478_22_.aBool5702;
				i_20_ = class478_22_.method7977((byte) 0);
				if (class478_22_.method7976((short) 8704))
					i_19_ = 0;
				else
					i_19_ = 1;
			}
		}
		if (i_20_ == -1)
			((Class123) this).aClass456_1545.method7569(-1, false, -526988806);
		else {
			((Class123) this).aClass456_1545.method7571(i_20_, 0, i_19_, bool_21_, -22187627);
			((Class123) this).anInt1548 = client.cycles * -1012076251;
			((Class123) this).aBool1552 = false;
			((Class123) this).aClass528_1544 = null;
		}
	}

	void method2148(boolean bool, int i, int i_23_) {
		int i_24_ = i;
		boolean bool_25_ = false;
		if (-1 == i_24_) {
			Class478 class478 = (((Class123) this).aClass474_1536.method7891(1535779425 * ((Class123) this).anInt1540, 65280));
			Class478 class478_26_ = class478;
			if (null != class478.anIntArray5650)
				class478 = class478.method8013((client.anInt7341 * -891719545 == 4 ? (Interface42) (Class86.anInterface42_832) : Class158_Sub1.aClass3_8507), (byte) 30);
			if (null == class478)
				return;
			if (class478_26_ == class478)
				class478_26_ = null;
			if (class478.method7967((byte) 28)) {
				if (bool && ((Class123) this).aClass456_1545.method7564(199577751) && class478.method7979(((Class123) this).aClass456_1545.method7597(-1593904440), -135069339))
					return;
				if (class478.anInt5633 * -2132690865 != -1003883901 * ((Class123) this).anInt1547)
					bool_25_ = class478.aBool5702;
				i_24_ = class478.method7977((byte) 69);
				if (class478.method7976((short) 8704))
					i_23_ = 0;
				else
					i_23_ = 1;
			} else if (null != class478_26_ && class478_26_.method7967((byte) 86)) {
				if (bool && ((Class123) this).aClass456_1545.method7564(344604134) && class478_26_.method7979(((Class123) this).aClass456_1545.method7597(-2088814679), 1568056205))
					return;
				if (-1003883901 * ((Class123) this).anInt1547 != -2132690865 * class478.anInt5633)
					bool_25_ = class478_26_.aBool5702;
				i_24_ = class478_26_.method7977((byte) -67);
				if (class478_26_.method7976((short) 8704))
					i_23_ = 0;
				else
					i_23_ = 1;
			}
		}
		if (i_24_ == -1)
			((Class123) this).aClass456_1545.method7569(-1, false, -629902810);
		else {
			((Class123) this).aClass456_1545.method7571(i_24_, 0, i_23_, bool_25_, 1461179676);
			((Class123) this).anInt1548 = client.cycles * -1012076251;
			((Class123) this).aBool1552 = false;
			((Class123) this).aClass528_1544 = null;
		}
	}

	public static int method2149(int i) {
		if (1222314215 * Class102.anInt1039 == -1) {
			Class102[] class102s = Class158_Sub1.method13767(-1513831265);
			for (int i_27_ = 0; i_27_ < class102s.length; i_27_++) {
				Class102 class102 = class102s[i_27_];
				if (((Class102) class102).anInt1054 * -2030850743 > 1222314215 * Class102.anInt1039)
					Class102.anInt1039 = -1233067441 * ((Class102) class102).anInt1054;
			}
			Class102.anInt1039 += -437679401;
		}
		return Class102.anInt1039 * 1222314215;
	}

	static final void method2150(CS2Executor class527, byte i) {
		int i_28_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_28_, (byte) 53);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_28_ >> 16];
		NamedFileReference.method869(class118, class98, class527, -1209481120);
	}

	static final void method2151(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_29_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_30_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1]);
		AttributeDefault class437 = Class125.aClass424_1573.method7069(i_30_, (byte) 0);
		if (class437.method7319(1555061388))
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = Class207.aClass421_2658.method7036(i_29_, -1979038944).method14751(i_30_, class437.aString5335, 1092559999);
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = (Class207.aClass421_2658.method7036(i_29_, 1053782715).method14750(i_30_, -1741480635 * class437.anInt5337, (byte) 53));
	}

	public static void method2152(int i, int i_31_) {
		Class282_Sub37 class282_sub37 = (Class282_Sub37) Class492.aClass465_5774.method7754((long) i);
		if (class282_sub37 != null) {
			((Class282_Sub37) class282_sub37).aBool7995 = !((Class282_Sub37) class282_sub37).aBool7995;
			((Class282_Sub37) class282_sub37).aClass278_Sub1_8001.method4924(((Class282_Sub37) class282_sub37).aBool7995, -1401371611);
		}
	}

	static final void method2153(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class9.anInt113 * -935355999;
	}
}
