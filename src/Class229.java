/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class229 implements Interface12 {
	boolean aBoolean6450;
	Class509 aClass509_6451;
	static Class348 aClass348_6452;
	Interface6[] anInterface6Array6453;
	int anInt6454;
	int anInt6455;
	GraphicsToolkit aClass_ra6456;
	static byte[] aByteArray6457 = { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24,
			25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38,
			-90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98,
			62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29,
			15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
	static int anInt6458;
	static int anInt6459;

	public int method154() {
		int i = 0;
		Interface6[] interface6s = ((Class229) this).anInterface6Array6453;
		for (int i_0_ = 0; i_0_ < interface6s.length; i_0_++) {
			Interface6 interface6 = interface6s[i_0_];
			if (null == interface6 || interface6.method52(-740967678))
				i++;
		}
		return i * 100 / ((Class229) this).anInterface6Array6453.length;
	}

	public void method150(int i) {
		try {
			if (((Class229) this).aClass_ra6456 != Class373.aClass_ra4071) {
				((Class229) this).aClass_ra6456 = Class373.aClass_ra4071;
				((Class229) this).aBoolean6450 = true;
			}
			((Class229) this).aClass_ra6456.ba(3, 0);
			Interface6[] interface6s = ((Class229) this).anInterface6Array6453;
			for (int i_1_ = 0; i_1_ < interface6s.length; i_1_++) {
				Interface6 interface6 = interface6s[i_1_];
				if (null != interface6)
					interface6.method53(-264951465);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jr.d(").append(')').toString());
		}
	}

	public void method160(boolean bool, int i) {
		try {
			bool = true;
			Interface6[] interface6s = ((Class229) this).anInterface6Array6453;
			for (int i_2_ = 0; i_2_ < interface6s.length; i_2_++) {
				Interface6 interface6 = interface6s[i_2_];
				if (interface6 != null)
					interface6.method58(bool || ((Class229) this).aBoolean6450, (byte) -77);
			}
			((Class229) this).aBoolean6450 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jr.b(").append(')').toString());
		}
	}

	public int method159(byte i) {
		try {
			int i_3_ = 0;
			Interface6[] interface6s = ((Class229) this).anInterface6Array6453;
			for (int i_4_ = 0; i_4_ < interface6s.length; i_4_++) {
				Interface6 interface6 = interface6s[i_4_];
				if (null == interface6 || interface6.method52(1744525008))
					i_3_++;
			}
			return i_3_ * 100 / ((Class229) this).anInterface6Array6453.length;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jr.u(").append(')').toString());
		}
	}

	public void method149(short i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jr.k(").append(')').toString());
		}
	}

	public boolean method153(long l) {
		try {
			return (Class122.method1319((byte) 1) >= l + (long) (((Class229) this).anInt6454 * -568263897));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jr.x(").append(')').toString());
		}
	}

	public int method151(int i) {
		try {
			return ((Class229) this).anInt6455 * 947763947;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jr.r(").append(')').toString());
		}
	}

	static {
		aClass348_6452 = new Class348(128, 4);
	}

	public void method155(boolean bool) {
		bool = true;
		Interface6[] interface6s = ((Class229) this).anInterface6Array6453;
		for (int i = 0; i < interface6s.length; i++) {
			Interface6 interface6 = interface6s[i];
			if (interface6 != null)
				interface6.method58(bool || ((Class229) this).aBoolean6450, (byte) -53);
		}
		((Class229) this).aBoolean6450 = false;
	}

	public void method157() {
		/* empty */
	}

	public void method163() {
		if (((Class229) this).aClass_ra6456 != Class373.aClass_ra4071) {
			((Class229) this).aClass_ra6456 = Class373.aClass_ra4071;
			((Class229) this).aBoolean6450 = true;
		}
		((Class229) this).aClass_ra6456.ba(3, 0);
		Interface6[] interface6s = ((Class229) this).anInterface6Array6453;
		for (int i = 0; i < interface6s.length; i++) {
			Interface6 interface6 = interface6s[i];
			if (null != interface6)
				interface6.method53(1847337399);
		}
	}

	public int method158() {
		int i = 0;
		Interface6[] interface6s = ((Class229) this).anInterface6Array6453;
		for (int i_5_ = 0; i_5_ < interface6s.length; i_5_++) {
			Interface6 interface6 = interface6s[i_5_];
			if (null == interface6 || interface6.method52(791640143))
				i++;
		}
		return i * 100 / ((Class229) this).anInterface6Array6453.length;
	}

	public int method161() {
		int i = 0;
		Interface6[] interface6s = ((Class229) this).anInterface6Array6453;
		for (int i_6_ = 0; i_6_ < interface6s.length; i_6_++) {
			Interface6 interface6 = interface6s[i_6_];
			if (null == interface6 || interface6.method52(1203563751))
				i++;
		}
		return i * 100 / ((Class229) this).anInterface6Array6453.length;
	}

	public int method162() {
		return ((Class229) this).anInt6455 * 947763947;
	}

	public void method156(boolean bool) {
		bool = true;
		Interface6[] interface6s = ((Class229) this).anInterface6Array6453;
		for (int i = 0; i < interface6s.length; i++) {
			Interface6 interface6 = interface6s[i];
			if (interface6 != null)
				interface6.method58(bool || ((Class229) this).aBoolean6450, (byte) -27);
		}
		((Class229) this).aBoolean6450 = false;
	}

	Class229(Class509 class509, int i, int i_7_, Class143 class143) {
		((Class229) this).aClass509_6451 = class509;
		((Class229) this).anInt6454 = i * 1693369495;
		((Class229) this).anInt6455 = 1319771587 * i_7_;
		((Class229) this).anInterface6Array6453 = new Interface6[(((Class229) this).aClass509_6451.anInterface5Array6217).length];
		for (int i_8_ = 0; i_8_ < ((Class229) this).anInterface6Array6453.length; i_8_++)
			((Class229) this).anInterface6Array6453[i_8_] = class143.method1572((((Class229) this).aClass509_6451.anInterface5Array6217[i_8_]), (byte) 86);
	}

	public boolean method152(long l) {
		return (Class122.method1319((byte) 1) >= l + (long) (((Class229) this).anInt6454 * -568263897));
	}

	static Class302_Sub5 method2122(byte i) {
		try {
			Class302_Sub5 class302_sub5 = ((Class302_Sub5) Class302_Sub5.aClass442_7661.method5871((byte) 3));
			if (class302_sub5 != null) {
				Class302_Sub5.anInt7662 -= 1704977893;
				return class302_sub5;
			}
			return new Class302_Sub5();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jr.b(").append(')').toString());
		}
	}

	public static int method2123(int i) {
		try {
			if (3.0 == (double) Class301_Sub1.aFloat3234)
				return 37;
			if (4.0 == (double) Class301_Sub1.aFloat3234)
				return 50;
			if (6.0 == (double) Class301_Sub1.aFloat3234)
				return 75;
			if (8.0 == (double) Class301_Sub1.aFloat3234)
				return 100;
			return 200;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jr.cy(").append(')').toString());
		}
	}

	public static void method2124(byte i) {
		try {
			synchronized (Class385.aClient4141) {
				if (null != Class231.aFrame2589) {
					/* empty */
				} else {
					Container container = Class318.method3874((byte) 84);
					if (container == null) {
						/* empty */
					} else {
						Class78.anInt733 = container.getSize().width * 1325868603;
						client.anInt6472 = container.getSize().height * -2115832951;
						if (Class298_Sub36.aFrame7403 == container) {
							Insets insets = Class298_Sub36.aFrame7403.getInsets();
							Class78.anInt733 -= 1325868603 * (insets.left + insets.right);
							client.anInt6472 -= (insets.bottom + insets.top) * -2115832951;
						}
						if (-639974669 * Class78.anInt733 <= 0)
							Class78.anInt733 = 1325868603;
						if (1282634425 * client.anInt6472 <= 0)
							client.anInt6472 = -2115832951;
						if (Class190.method1859((byte) -55) != 1)
							Class242_Sub1.method2283((byte) 3);
						else {
							Class462.anInt5683 = client.anInt8794 * -1494558011;
							client.anInt6473 = ((-639974669 * Class78.anInt733 - 775068819 * client.anInt8794) / 2 * -753018213);
							Class298_Sub40_Sub9.anInt9716 = -909258791 * client.anInt8803;
							client.anInt6474 = 0;
						}
						if (Class242.aClass401_2708 != Class401.aClass401_6557 && -2110394505 * Class462.anInt5683 < 1024 && (Class298_Sub40_Sub9.anInt9716 * -1111710645 >= 768)) {
							/* empty */
						}
						Class52_Sub2_Sub1.aCanvas9079.setSize(-2110394505 * Class462.anInt5683, -1111710645 * Class298_Sub40_Sub9.anInt9716);
						if (null != Class373.aClass_ra4071)
							Class373.aClass_ra4071.method5173(Class52_Sub2_Sub1.aCanvas9079, Class462.anInt5683 * -2110394505, -1111710645 * Class298_Sub40_Sub9.anInt9716, (byte) 20);
						if (container == Class298_Sub36.aFrame7403) {
							Insets insets = Class298_Sub36.aFrame7403.getInsets();
							Class52_Sub2_Sub1.aCanvas9079.setLocation(insets.left + client.anInt6473 * 1898544019, client.anInt6474 * 540368727 + insets.top);
						} else
							Class52_Sub2_Sub1.aCanvas9079.setLocation(client.anInt6473 * 1898544019, client.anInt6474 * 540368727);
						Class502.method6232(-167626743);
						if (client.WINDOW_PANE_ID * -257444687 != -1)
							Class257.method2453(true, (byte) 8);
						Class148.method1614((byte) 45);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jr.gn(").append(')').toString());
		}
	}
}
