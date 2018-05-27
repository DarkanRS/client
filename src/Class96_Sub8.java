/* Class96_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub8 extends Class96 {
	int anInt9268;
	int anInt9269;
	int anInt9270;
	Class268 aClass268_9271;
	int anInt9272;

	public void method1592(int i) {
		((Class96_Sub8) this).aClass268_9271 = Class435.method7300(983294899 * ((Class96_Sub8) this).anInt9270, ((Class96_Sub8) this).anInt9268 * -573413783, 0, ((Class96_Sub8) this).anInt9269 * -840420627, false, 177588843 * ((Class96_Sub8) this).anInt9272, 1449989045);
	}

	Class96_Sub8(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub8) this).anInt9270 = class282_sub35.readUnsignedShort() * -1315470469;
		((Class96_Sub8) this).anInt9269 = class282_sub35.readUnsignedByte() * -957613339;
		((Class96_Sub8) this).anInt9272 = class282_sub35.readUnsignedByte() * -1529769405;
		((Class96_Sub8) this).anInt9268 = class282_sub35.readUnsignedByte() * 1609664985;
	}

	void method1593(byte i) {
		if (((Class96_Sub8) this).aClass268_9271 != null) {
			Class58.method1142(((Class96_Sub8) this).aClass268_9271, 1303678782);
			((Class96_Sub8) this).aClass268_9271 = null;
		}
	}

	public void method1601() {
		((Class96_Sub8) this).aClass268_9271 = Class435.method7300(983294899 * ((Class96_Sub8) this).anInt9270, ((Class96_Sub8) this).anInt9268 * -573413783, 0, ((Class96_Sub8) this).anInt9269 * -840420627, false, 177588843 * ((Class96_Sub8) this).anInt9272, 1449989045);
	}

	void method1597() {
		if (((Class96_Sub8) this).aClass268_9271 != null) {
			Class58.method1142(((Class96_Sub8) this).aClass268_9271, 1686729102);
			((Class96_Sub8) this).aClass268_9271 = null;
		}
	}

	void method1598() {
		if (((Class96_Sub8) this).aClass268_9271 != null) {
			Class58.method1142(((Class96_Sub8) this).aClass268_9271, 1831290394);
			((Class96_Sub8) this).aClass268_9271 = null;
		}
	}

	void method1595() {
		if (((Class96_Sub8) this).aClass268_9271 != null) {
			Class58.method1142(((Class96_Sub8) this).aClass268_9271, 1569729414);
			((Class96_Sub8) this).aClass268_9271 = null;
		}
	}

	static boolean method14577(int i) {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5879, (byte) -63);
	}

	static final void method14578(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1314 * -37350919;
	}

	static final void method14579(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_0_, (byte) 55);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class236.method3983(class118, class98, class527, -1297016434);
	}
}
