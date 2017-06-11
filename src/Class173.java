/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class173 {
	public boolean aBoolean1748;
	static Class348 aClass348_1749 = new Class348(64);
	static int anInt1750 = 0;
	public int anInt1751 = -2036085851;
	public int anInt1752;
	public int anInt1753;
	public int anInt1754;
	public int anInt1755 = 1561394240;
	static Class243 aClass243_1756;
	public boolean aBoolean1757;
	public static Class243 aClass243_1758;
	public static byte aByte1759;

	void method1816(RsByteBuffer class298_sub53, int i, int i_0_, int i_1_) {
		try {
			if (1 == i) {
				anInt1751 = class298_sub53.readUnsignedShort() * 2036085851;
				if (39181267 * anInt1751 == 65535)
					anInt1751 = -2036085851;
			} else if (i == 2) {
				anInt1755 = (class298_sub53.readUnsignedShort() + 1) * 1635009521;
				anInt1753 = (class298_sub53.readUnsignedShort() + 1) * 2057726207;
			} else if (3 == i)
				class298_sub53.readByte(-12558881);
			else if (i == 4)
				anInt1754 = class298_sub53.readUnsignedByte() * -301564977;
			else if (i == 5)
				anInt1752 = class298_sub53.readUnsignedByte() * 843301217;
			else if (i == 6)
				aBoolean1748 = true;
			else if (7 == i)
				aBoolean1757 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.p(").append(')').toString());
		}
	}

	void method1817(RsByteBuffer class298_sub53, int i, byte i_2_) {
		try {
			for (;;) {
				int i_3_ = class298_sub53.readUnsignedByte();
				if (0 == i_3_) {
					if (i_2_ != 8)
						break;
					break;
				}
				method1816(class298_sub53, i_3_, i, 1303074058);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.b(").append(')').toString());
		}
	}

	Class173() {
		anInt1753 = -1449508928;
		anInt1754 = -603129954;
		anInt1752 = 843301217;
		aBoolean1748 = false;
		aBoolean1757 = false;
	}

	public static int method1818(int i, int i_4_) {
		try {
			i = (i >>> 1 & 0x55555555) + (i & 0x55555555);
			i = (i & 0x33333333) + (i >>> 2 & 0x33333333);
			i = i + (i >>> 4) & 0xf0f0f0f;
			i += i >>> 8;
			i += i >>> 16;
			return i & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.b(").append(')').toString());
		}
	}

	public static Class298_Sub19_Sub1 method1819(int i) {
		try {
			return Class79.aClass298_Sub19_Sub1_737;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.g(").append(')').toString());
		}
	}

	public static void method1820(int i, int i_5_, int i_6_, int i_7_) {
		try {
			Class341 class341 = client.aClass283_8716.method2628(681479919);
			int i_8_ = i_5_ + -1760580017 * class341.gameSceneBaseX;
			int i_9_ = i_6_ + 283514611 * class341.gameSceneBaseY;
			if (client.aClass283_8716.method2675(-1611682495) != null && (client.aClass283_8716.method2674(-257896295) != Class266.aClass266_2846) && i_5_ >= 0 && i_6_ >= 0 && i_5_ < client.aClass283_8716.method2629(-1890552944) && i_6_ < client.aClass283_8716.method2630(-1685955624)) {
				long l = (long) (i << 28 | i_9_ << 14 | i_8_);
				Class298_Sub2 class298_sub2 = (Class298_Sub2) client.groundItems.get(l);
				if (class298_sub2 == null)
					client.aClass283_8716.method2675(-1611682495).method4059(i, i_5_, i_6_, (byte) 86);
				else {
					Class298_Sub12 class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5939(1766612795);
					if (class298_sub12 == null)
						client.aClass283_8716.method2675(-1611682495).method4059(i, i_5_, i_6_, (byte) 28);
					else {
						Class365_Sub1_Sub4_Sub1 class365_sub1_sub4_sub1 = ((Class365_Sub1_Sub4_Sub1) client.aClass283_8716.method2675(-1611682495).method4059(i, i_5_, i_6_, (byte) 119));
						if (class365_sub1_sub4_sub1 == null)
							class365_sub1_sub4_sub1 = (new Class365_Sub1_Sub4_Sub1(client.aClass283_8716.method2675(-1611682495), i_5_ << 265, client.aClass283_8716.method2675(-1611682495).aClass_xaArray3517[i].method6341(i_5_, i_6_, (byte) -15), i_6_ << 265, i, i));
						else {
							Class365_Sub1_Sub4_Sub1 class365_sub1_sub4_sub1_10_ = class365_sub1_sub4_sub1;
							class365_sub1_sub4_sub1.anInt10146 = 2004197937;
							class365_sub1_sub4_sub1_10_.anInt10150 = -474510257;
							class365_sub1_sub4_sub1.aClass331_7722 = client.aClass283_8716.method2675(-1611682495);
						}
						class365_sub1_sub4_sub1.anInt10152 = 397105967 * class298_sub12.anInt7257;
						class365_sub1_sub4_sub1.anInt10143 = (-2063762687 * ((Class298_Sub12) class298_sub12).anInt7256);
						while_66_: do {
							Class298_Sub12 class298_sub12_11_;
							while_65_: do {
								do {
									class298_sub12_11_ = ((Class298_Sub12) class298_sub2.aClass453_7166.method5944(49146));
									if (class298_sub12_11_ == null) {
										if (i_7_ <= -111188266)
											throw new IllegalStateException();
										break while_66_;
									}
									if ((1768239597 * class298_sub12_11_.anInt7257) != (-441234013 * (class365_sub1_sub4_sub1.anInt10152)))
										break while_65_;
								} while (i_7_ > -111188266);
								return;
							} while (false);
							class365_sub1_sub4_sub1.anInt10150 = 1259142109 * class298_sub12_11_.anInt7257;
							class365_sub1_sub4_sub1.anInt10145 = -1936319903 * ((Class298_Sub12) class298_sub12_11_).anInt7256;
							for (;;) {
								Class298_Sub12 class298_sub12_12_ = ((Class298_Sub12) class298_sub2.aClass453_7166.method5944(49146));
								if (null == class298_sub12_12_) {
									if (i_7_ > -111188266)
										break;
									return;
								}
								if (class298_sub12_12_.anInt7257 * 1768239597 != -441234013 * (class365_sub1_sub4_sub1.anInt10152)) {
									if ((class298_sub12_12_.anInt7257 * 1768239597) == (class365_sub1_sub4_sub1.anInt10150 * -909380271)) {
										if (i_7_ <= -111188266) {
											/* empty */
										}
									} else {
										class365_sub1_sub4_sub1.anInt10146 = (-843548765 * class298_sub12_12_.anInt7257);
										class365_sub1_sub4_sub1.anInt10147 = (((Class298_Sub12) class298_sub12_12_).anInt7256 * -597974721);
									}
								}
							}
						} while (false);
						int i_13_ = Class356.method4271(256 + (i_5_ << 9), 256 + (i_6_ << 9), i, -859881334);
						class365_sub1_sub4_sub1.method4341((float) (i_5_ << 265), (float) i_13_, (float) (i_6_ << 265));
						class365_sub1_sub4_sub1.anInt10142 = 0;
						class365_sub1_sub4_sub1.plane = (byte) i;
						class365_sub1_sub4_sub1.aByte7724 = (byte) i;
						if (client.aClass283_8716.method2654(361928521).method2320(i_5_, i_6_, -1635198415))
							class365_sub1_sub4_sub1.aByte7724++;
						client.aClass283_8716.method2675(-1611682495).method4053(i, i_5_, i_6_, i_13_, class365_sub1_sub4_sub1, 1648403764);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.jy(").append(')').toString());
		}
	}

	public static final void method1821(Interface class298_sub51, boolean bool, boolean bool_14_, int i) {
		try {
			int i_15_ = class298_sub51.interfaceId * -1617025021;
			int i_16_ = (int) (7051297995265073167L * class298_sub51.linkedKey);
			class298_sub51.unlink(-1460969981);
			if (bool)
				Class82_Sub8.method893(i_15_, -2042512871);
			Class242_Sub1.method2280(i_15_, (byte) -97);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_16_, (byte) 18);
			if (null != class105)
				Tradution.method6054(class105, 999173);
			Class247.method2376(-1483926701);
			if (!bool_14_ && client.WINDOW_PANE_ID * -257444687 != -1)
				Class82_Sub10.method903(-257444687 * client.WINDOW_PANE_ID, 1, -80338519);
			Class460 class460 = new Class460(client.aClass437_8841);
			for (Interface class298_sub51_17_ = (Interface) class460.method5979(-2012602178); null != class298_sub51_17_; class298_sub51_17_ = (Interface) class460.next()) {
				if (!class298_sub51_17_.method2840(-629325116)) {
					class298_sub51_17_ = (Interface) class460.method5979(-2012602178);
					if (null == class298_sub51_17_) {
						if (i == -113822480)
							break;
						break;
					}
				}
				if (class298_sub51_17_.clipped * 27137839 == 3) {
					int i_18_ = (int) (7051297995265073167L * class298_sub51_17_.linkedKey);
					if (i_18_ >>> 16 == i_15_)
						method1821(class298_sub51_17_, true, bool_14_, -113822480);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.lw(").append(')').toString());
		}
	}

	public static final void method1822(int viewLocalX, int viewLocalY, int viewZ, int speed1, int speed2, byte i_23_) {
		try {
			Class_xa.anInt6292 = 446226445 * viewLocalX;
			Class464.anInt5959 = viewLocalY * 2019382975;
			Class18.anInt255 = viewZ * 584728181;
			Class128_Sub1.anInt8556 = -759692387 * speed1;
			Class427.anInt5362 = -2064447825 * speed2;
			if (Class427.anInt5362 * 1179258959 >= 100) {
				int i_24_ = -589460992 * Class_xa.anInt6292 + 256;
				int i_25_ = 1647476224 * Class464.anInt5959 + 256;
				int i_26_ = (Class356.method4271(i_24_, i_25_, Class99.anInt952 * 1855729883, -1477224800) - Class18.anInt255 * 771695069);
				int i_27_ = i_24_ - Class367.anInt4000 * -1740717447;
				int i_28_ = i_26_ - Class110.anInt6403 * 1449634147;
				int i_29_ = i_25_ - -299812095 * Class146.anInt1575;
				int i_30_ = (int) Math.sqrt((double) (i_29_ * i_29_ + i_27_ * i_27_));
				client.anInt8756 = ((int) (Math.atan2((double) i_28_, (double) i_30_) * 2607.5945876176133) & 0x3fff) * -648269561;
				Class135.anInt6384 = ((int) (Math.atan2((double) i_27_, (double) i_29_) * -2607.5945876176133) & 0x3fff) * -1587695039;
				Class229.anInt6458 = 0;
				if (-104436553 * client.anInt8756 < 1024)
					client.anInt8756 = 1891900416;
				if (client.anInt8756 * -104436553 > 3072)
					client.anInt8756 = 1380733952;
			}
			Class298_Sub1.anInt7164 = 2090692627;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.hs(").append(')').toString());
		}
	}

	public static short method1823(int i, byte i_31_) {
		try {
			int i_32_ = i >> 10 & 0x3f;
			int i_33_ = i >> 3 & 0x70;
			int i_34_ = i & 0x7f;
			i_33_ = (i_34_ <= 64 ? i_33_ * i_34_ >> 7 : i_33_ * (127 - i_34_) >> 7);
			int i_35_ = i_33_ + i_34_;
			int i_36_;
			if (i_35_ != 0)
				i_36_ = (i_33_ << 8) / i_35_;
			else
				i_36_ = i_33_ << 1;
			int i_37_ = i_35_;
			return (short) (i_32_ << 10 | i_36_ >> 4 << 7 | i_37_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.i(").append(')').toString());
		}
	}

	public static String method1824(CharSequence charsequence, int i) {
		try {
			return Class415.method5588(charsequence, null, (byte) -6);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.p(").append(')').toString());
		}
	}

	static final void method1825(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class52_Sub1_Sub1.method568(class105, class119, class403, (byte) -37);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.dj(").append(')').toString());
		}
	}

	static void method1826(int i) {
		try {
			Class423.method5733(false, 1336561252);
			if (1265667685 * Class301_Sub1.anInt7626 >= 0 && 1265667685 * Class301_Sub1.anInt7626 != 0) {
				Class370.method4578(1265667685 * Class301_Sub1.anInt7626, false, 622850291);
				Class301_Sub1.anInt7626 = -485258093;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("he.cs(").append(')').toString());
		}
	}
}
