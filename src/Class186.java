
/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.net.URL;

public class Class186 {
	static Index aClass317_2347;
	static FontRenderer aClass8_2348;
	static int anInt2349;

	public static GraphicalRenderer method3081(Canvas canvas, Interface22 interface22, int i, int i_0_) {
		return new HardwareRenderer(canvas, interface22, i, i_0_);
	}

	Class186() throws Throwable {
		throw new Error();
	}

	public static boolean method3082(String string, int i, String string_1_, int i_2_) {
		if (0 == i) {
			boolean bool;
			try {
				if (!Class225_Sub6.aString8069.startsWith("win"))
					throw new Exception();
				if (!string.startsWith("http://") && !string.startsWith("https://"))
					throw new Exception();
				String string_3_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (int i_4_ = 0; i_4_ < string.length(); i_4_++) {
					if (string_3_.indexOf(string.charAt(i_4_)) == -1)
						throw new Exception();
				}
				Runtime.getRuntime().exec(new StringBuilder().append("cmd /c start \"j\" \"").append(string).append("\"").toString());
				bool = true;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 1) {
			boolean bool;
			try {
				Object object = Class441.method7375(Class282_Sub44.anApplet8065, string_1_, (new Object[] { new URL(Class282_Sub44.anApplet8065.getCodeBase(), string).toString() }), 161008971);
				bool = object != null;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		}
		if (i == 2) {
			boolean bool;
			try {
				Class282_Sub44.anApplet8065.getAppletContext().showDocument(new URL(Class282_Sub44.anApplet8065.getCodeBase(), string), "_blank");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		if (i == 3) {
			try {
				Class441.method7377(Class282_Sub44.anApplet8065, "loggedout", 1762272883);
			} catch (Throwable throwable) {
				/* empty */
			}
			boolean bool;
			try {
				Class282_Sub44.anApplet8065.getAppletContext().showDocument(new URL(Class282_Sub44.anApplet8065.getCodeBase(), string), "_top");
				bool = true;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		throw new IllegalArgumentException();
	}

	static void method3083(int i) {
		Class9.aClass184_73.method3054((short) 18699);
		((Class184) Class9.aClass184_73).aClass282_Sub35_Sub2_2284.index = 0;
		((Class184) Class9.aClass184_73).aClass375_2278 = null;
		((Class184) Class9.aClass184_73).aClass375_2296 = null;
		((Class184) Class9.aClass184_73).aClass375_2291 = null;
		((Class184) Class9.aClass184_73).anInt2289 = 0;
		client.anInt7178 = 0;
		Class209_Sub1.method12916((byte) 16);
		client.anInt7434 = 0;
		client.anInt7449 = 0;
		client.aString7426 = null;
		Class459.anInt5534 = 0;
		Class467.aClass173Array5575 = null;
		Class282_Sub13.aClass61_7587 = null;
		Class58.aClass61_528 = null;
		Class237.method3990(1060559975);
		for (int i_5_ = 0; i_5_ < 25; i_5_++) {
			client.anIntArray7336[i_5_] = 0;
			client.anIntArray7337[i_5_] = 0;
			client.anIntArray7338[i_5_] = 0;
		}
	}

	static void method3084(short i) {
		Class197.NUM_PLAYER_INDICES = 0;
		for (int i_6_ = 0; i_6_ < 2048; i_6_++) {
			if (i == 229)
				break;
			Class197.aClass282_Sub35Array2428[i_6_] = null;
			Class197.playerMovementTypes[i_6_] = Class249.aClass249_3084.aByte3085;
			Class197.aClass4Array2430[i_6_] = null;
		}
	}

	public static Class434 method3085(String string, int i, int i_7_) {
		Class434_Sub1 class434_sub1 = new Class434_Sub1();
		((Class434) class434_sub1).aString5330 = string;
		((Class434) class434_sub1).anInt5331 = i * -432862573;
		return class434_sub1;
	}
}
