import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class12 implements Runnable {

	volatile String aString126;
	InetAddress anInetAddress125;

	public String method473(int i_1) {
		return this.aString126;
	}

	public void run() {
		this.aString126 = this.anInetAddress125.getHostName();
	}

	Class12(int i_1) throws UnknownHostException {
		this.anInetAddress125 = InetAddress.getByAddress(new byte[] { (byte) (i_1 >> 24 & 0xff), (byte) (i_1 >> 16 & 0xff), (byte) (i_1 >> 8 & 0xff), (byte) (i_1 & 0xff) });
	}

	public static void clearComponents(int i_0, int i_1) {
		if (i_0 != -1 && !WorldMapIndexLoader.aBoolArray2709[i_0]) {
			Class388.INTERFACE_INDEX.clearFiles(i_0);
			Class468_Sub8.aClass98Array7889[i_0] = null;
		}

	}

	static final void method481(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub6_8192.method12654(-239553097);
	}

	static void method482(byte b_0) {
		if (Class182.HARDWARE_RENDERER != null) {
			Class182.HARDWARE_RENDERER.method8396(-517038);
			Class182.HARDWARE_RENDERER = null;
			Class182.aClass8_2259 = null;
		}

	}

	public static void method483(Interface interface_0, IComponentDefinitions icomponentdefinitions_1, boolean bool_2, int i_3) {
		Class480.method8044(interface_0.components, icomponentdefinitions_1, bool_2, (byte) 4);
	}

	static final void method484(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 9);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class242.method4160(icomponentdefinitions_3, interface_4, cs2executor_0, (short) 8078);
	}

	static final void method485(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		Class100.method1642(icomponentdefinitions_4, interface_5, cs2executor_0, -107525091);
	}

	public static void method486(int i_0, int i_1, int i_2, int i_3) {
		i_0 <<= 3;
		i_1 <<= 3;
		i_2 <<= 3;
		client.aFloat7146 = (float) i_0;
		client.aFloat7365 = (float) i_1;
		if (NativeLibraryLoader.anInt3240 == 5) {
			Class293.anInt3512 = i_0;
			AnimationDefinitions.anInt5930 = i_1;
			Class121.anInt1525 = i_2;
		}

		IsaacCipher.method7268(1504588088);
		client.aBool7371 = true;
	}

	public static void method487(Class116 class116_0, int i_1, int i_2) {
		Class148.aClass282_Sub15_Sub2_1735.method15101((short) 21815);
		Class282_Sub15_Sub2 class282_sub15_sub2_3 = class116_0.method1954(-1993733847);
		if (class282_sub15_sub2_3 != null) {
			Class502.aClass253_5830.method4334();
			Class148.aClass282_Sub15_Sub2_1735 = class282_sub15_sub2_3;
			Class148.aClass282_Sub15_Sub2_1735.method15098(class116_0.method1955(1251820980), false, 355198113);
			Class148.aClass282_Sub15_Sub2_1735.method15144(i_1, -216399579);
			if (Class502.aClass253_5830 != null) {
				Class502.aClass253_5830.method4329(Class148.aClass282_Sub15_Sub2_1735);
			}

			Class332.method5929(692998744);
		}

	}

	static final int method488(int i_0, int i_1, int i_2) {
		return i_1 < 0 ? i_0 : (int) ((double) i_0 * Math.sqrt(1.220703125E-4D * (double) (16384 - i_1)) + 0.5D);
	}

}
