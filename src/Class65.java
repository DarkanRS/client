/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class65 {
	public static int anInt650 = 0;
	public static int anInt651 = 8;
	public static int anInt652 = 16;
	public static int anInt653 = 2;
	public static int anInt654 = 1023;
	public static int anInt655 = 8191;
	public static int anInt656 = 32;
	public static int anInt657 = 8;
	public static int[] anIntArray658 = { 3, 7, 15 };
	public static int anInt659 = 1;
	public static int anInt660 = 0;
	public static int anInt661 = 2;
	public static int anInt662 = 32;
	public static int[] anIntArray663 = { 2047, 16383, 65535 };
	static Class264 aClass264_664;
	public static Class243 aClass243_665;

	Class65() throws Throwable {
		throw new Error();
	}

	static final void method760(ClientScript2 class403, short i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class410.method4984(class105, class119, class403, (byte) 7);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cq.oz(").append(')').toString());
		}
	}

	public static void method761(Class119 class119, IComponentDefinition class105, boolean bool, int i) {
		try {
			Class117.method1282(class119.aClass105Array1405, class105, bool, (short) -2046);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cq.kh(").append(')').toString());
		}
	}

	public static boolean method762(String string, int i, String string_0_, int i_1_) {
		try {
			if (i == 0) {
				boolean bool;
				try {
					if (!Class82_Sub8.aString6856.startsWith("win"))
						throw new Exception();
					if (!string.startsWith("http://") && !string.startsWith("https://"))
						throw new Exception();
					String string_2_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (int i_3_ = 0; i_3_ < string.length(); i_3_++) {
						if (string_2_.indexOf(string.charAt(i_3_)) == -1)
							throw new Exception();
					}
					Runtime.getRuntime().exec(new StringBuilder().append("cmd /c start \"j\" \"").append(string).append("\"").toString());
					bool = true;
				} catch (Throwable throwable) {
					return false;
				}
				return bool;
			}
			if (1 == i) {
				boolean bool;
				try {
					Object object = Class466.method6022(ClientScriptMap.anApplet6044, string_0_, (new Object[] { new URL(ClientScriptMap.anApplet6044.getCodeBase(), string).toString() }), (byte) 44);
					bool = null != object;
				} catch (Throwable throwable) {
					return false;
				}
				return bool;
			}
			if (2 == i) {
				boolean bool;
				try {
					ClientScriptMap.anApplet6044.getAppletContext().showDocument(new URL(ClientScriptMap.anApplet6044.getCodeBase(), string), "_blank");
					bool = true;
				} catch (Exception exception) {
					return false;
				}
				return bool;
			}
			if (i == 3) {
				try {
					Class466.method6021(ClientScriptMap.anApplet6044, "loggedout", (short) 1853);
				} catch (Throwable throwable) {
					/* empty */
				}
				boolean bool;
				try {
					ClientScriptMap.anApplet6044.getAppletContext().showDocument(new URL(ClientScriptMap.anApplet6044.getCodeBase(), string), "_top");
					bool = true;
				} catch (Exception exception) {
					return false;
				}
				return bool;
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cq.p(").append(')').toString());
		}
	}
}
