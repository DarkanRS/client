/* Class282_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub2 extends Class282 {
	public int anInt7478;
	public int anInt7479;
	public int anInt7480;
	public int anInt7481;
	public int anInt7482;
	public int anInt7483;
	public int anInt7484;
	public int anInt7485;
	public int anInt7486;

	Class282_Sub2(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readInt();
		anInt7478 = -1068993995 * (i >>> 28);
		anInt7479 = 1516030821 * (i >>> 14 & 0x3fff);
		anInt7482 = 394524987 * (i & 0x3fff);
		anInt7484 = class282_sub35.readUnsignedByte() * -519617945;
		anInt7485 = class282_sub35.readUnsignedByte() * 1694228269;
		anInt7481 = class282_sub35.readUnsignedByte() * 264214403;
		anInt7480 = class282_sub35.readUnsignedByte() * 1365350773;
		anInt7483 = class282_sub35.readUnsignedByte() * 371935043;
		anInt7486 = class282_sub35.readUnsignedByte() * 435005063;
	}

	static Class282_Sub23 method12078(int i, int i_0_, int i_1_, int i_2_) {
		Class282_Sub23 class282_sub23 = null;
		if (i_1_ == 0)
			class282_sub23 = Class271.method4828(OutgoingPacket.WALK, client.aClass184_7475.aClass432_2283, 1058999201);
		if (i_1_ == 1)
			class282_sub23 = Class271.method4828(OutgoingPacket.MINI_WALK, client.aClass184_7475.aClass432_2283, -505511344);
		Class219 class219 = client.aClass257_7353.method4519(1520760306);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class84.method1465(-2046314159) ? 1 : 0);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i + 1948093437 * class219.anInt2711, 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(i_0_ + -1002240017 * class219.anInt2712, (short) -23988);
		Class187.anInt2361 = -134656021 * i;
		Class187.anInt2359 = i_0_ * -818291313;
		Class187.aBool2360 = false;
		Class282_Sub20_Sub9.method15255((short) -19687);
		return class282_sub23;
	}
}
