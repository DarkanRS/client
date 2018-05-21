
/* Class109_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class109_Sub1 extends Class109 {
	static int anInt9384;

	void method1851() {
		Class260.aClass277_3221 = Class260.aClass277_3234;
		Class260.aClass277_3234 = null;
	}

	void method1849(byte i) {
		Class260.aClass277_3221 = Class260.aClass277_3234;
		Class260.aClass277_3234 = null;
	}

	void method1850() {
		Class260.aClass277_3221 = Class260.aClass277_3234;
		Class260.aClass277_3234 = null;
	}

	static void method14650(int i, int i_0_) {
		for (Node class282 = client.aClass465_7405.method7750(1412707931); class282 != null; class282 = client.aClass465_7405.method7751((byte) 92)) {
			if ((long) i == (-3442165056282524525L * class282.data >> 48 & 0xffffL))
				class282.unlink(-371378792);
		}
	}

	public static int method14651(int i) {
		return 12;
	}

	public static GraphicalRenderer method14652(Canvas canvas, Interface22 interface22, int i, int i_1_, byte i_2_) {
		return new HardwareRenderer(canvas, interface22, i, i_1_);
	}
}
