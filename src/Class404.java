/* Class404 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class404 {
	static Interface36 LIBRARY_LOADER;
	static Class466 aClass466_4831;

	Class404() throws Throwable {
		throw new Error();
	}

	public static final void method6809(String string, int i, int i_0_) {
		Class184 class184 = Class468_Sub20.method12807(-19463532);
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4534, class184.isaac, -295409729);
		class282_sub23.buffer.writeByte(1 + ChatLine.getLength(string));
		class282_sub23.buffer.write128Byte(i, 2009148363);
		class282_sub23.buffer.writeString(string);
		class184.method3049(class282_sub23, -116955034);
	}

	static void method6810(int i) {
		if (null != Class20.aClass282_Sub50_Sub15_163) {
			Class20.aClass282_Sub50_Sub15_163 = null;
			Class292.method5201(Class341.anInt3996 * 143093737, Class282_Sub50_Sub2.anInt9471 * 2107083711, Class96_Sub3.anInt8518 * 572079435, (-1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526), (byte) 12);
		}
	}

	public static final void method6811(int i, int i_1_) {
		if (Class113.aClass282_Sub4_1235 != null && (i >= 0 && i < Class113.aClass282_Sub4_1235.anInt7503 * 1014406051)) {
			Class57 class57 = Class113.aClass282_Sub4_1235.aClass57Array7499[i];
			if (class57.aByte525 == -1) {
				Class184 class184 = Class468_Sub20.method12807(2122526956);
				TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4630, class184.isaac, -301971618);
				class282_sub23.buffer.writeByte(2 + ChatLine.getLength(class57.aString524));
				class282_sub23.buffer.writeShort(i, 1417031095);
				class282_sub23.buffer.writeString(class57.aString524);
				class184.method3049(class282_sub23, 1522960717);
			}
		}
	}
}
