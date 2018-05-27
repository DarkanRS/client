
/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class12 implements Runnable {
	InetAddress anInetAddress125;
	volatile String aString126;

	public String method472() {
		return ((Class12) this).aString126;
	}

	public String method473(int i) {
		return ((Class12) this).aString126;
	}

	public String method474() {
		return ((Class12) this).aString126;
	}

	public void method475() {
		((Class12) this).aString126 = ((Class12) this).anInetAddress125.getHostName();
	}

	public void method476() {
		((Class12) this).aString126 = ((Class12) this).anInetAddress125.getHostName();
	}

	public String method477() {
		return ((Class12) this).aString126;
	}

	public void run() {
		((Class12) this).aString126 = ((Class12) this).anInetAddress125.getHostName();
	}

	Class12(int i) throws UnknownHostException {
		((Class12) this).anInetAddress125 = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff), (byte) (i >> 16 & 0xff), (byte) (i >> 8 & 0xff), (byte) (i & 0xff) });
	}

	public String method478() {
		return ((Class12) this).aString126;
	}

	public String method479() {
		return ((Class12) this).aString126;
	}

	public static void method480(int i, int i_0_) {
		if (i != -1 && !WorldMapIndexLoader.aBoolArray2709[i]) {
			Class388.aClass317_4721.method5619(i, -566159763);
			Class468_Sub8.aClass98Array7889[i] = null;
		}
	}

	static final void method481(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub6_8192.method12654(-239553097);
	}

	static void method482(byte i) {
		if (null != Class182.HARDWARE_RENDERER) {
			if (i > 32) {
				Class182.HARDWARE_RENDERER.method8396(-517038);
				Class182.HARDWARE_RENDERER = null;
				Class182.aClass8_2259 = null;
			}
		}
	}

	public static void method483(Class98 class98, Class118 class118, boolean bool, int i) {
		Class480.method8044(class98.aClass118Array998, class118, bool, (byte) 4);
	}

	static final void method484(CS2Executor class527, int i) {
		int i_1_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_1_, (byte) 9);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_1_ >> 16];
		Class242.method4160(class118, class98, class527, (short) 8078);
	}

	static final void method485(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i <= 18)
				return;
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_2_ = class513;
		Class118 class118 = ((UnderlayDefinition) class513_2_).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513_2_).aClass98_5885;
		Class100.method1642(class118, class98, class527, -107525091);
	}

	public static void method486(int i, int i_3_, int i_4_, int i_5_) {
		i <<= 3;
		i_3_ <<= 3;
		i_4_ <<= 3;
		client.aFloat7146 = (float) i;
		client.aFloat7365 = (float) i_3_;
		if (5 == -672443707 * Class262.anInt3240) {
			Class293.anInt3512 = i * -647467135;
			AnimationDefinitions.anInt5930 = 1898253385 * i_3_;
			Class121.anInt1525 = i_4_ * -833027875;
		}
		IsaacCipher.method7268(1504588088);
		client.aBool7371 = true;
	}

	public static void method487(Class116 class116, int i, int i_6_) {
		Class148.aClass282_Sub15_Sub2_1735.method15101((short) 21815);
		Class282_Sub15_Sub2 class282_sub15_sub2 = class116.method1954(-1993733847);
		if (null != class282_sub15_sub2) {
			Class502.aClass253_5830.method4334();
			Class148.aClass282_Sub15_Sub2_1735 = class282_sub15_sub2;
			Class148.aClass282_Sub15_Sub2_1735.method15098(class116.method1955(1251820980), false, 355198113);
			Class148.aClass282_Sub15_Sub2_1735.method15144(i, -216399579);
			if (Class502.aClass253_5830 != null)
				Class502.aClass253_5830.method4329(Class148.aClass282_Sub15_Sub2_1735);
			Class332.method5929(692998744);
		}
	}

	static final int method488(int i, int i_7_, int i_8_) {
		return (i_7_ < 0 ? i : (int) ((double) i * Math.sqrt(1.220703125E-4 * (double) (16384 - i_7_)) + 0.5));
	}
}
