/* Class96_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub6 extends Class96 {
	int anInt9168;
	int anInt9169;
	int anInt9170;
	int anInt9171;
	int anInt9172;
	static boolean aBool9173;

	Class96_Sub6(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub6) this).anInt9170 = class282_sub35.readUnsignedShort() * 1418149641;
		int i = class282_sub35.readInt();
		((Class96_Sub6) this).anInt9169 = (i >>> 16) * 1332038795;
		((Class96_Sub6) this).anInt9168 = -2105065755 * (i & 0xffff);
		((Class96_Sub6) this).anInt9171 = class282_sub35.readUnsignedByte() * 10301909;
		((Class96_Sub6) this).anInt9172 = class282_sub35.readUnsignedByte() * -781329023;
	}

	public void method1592(int i) {
		Class86.aClass92Array820[848428857 * ((Class96_Sub6) this).anInt9170].method1559(((Class96_Sub6) this).anInt9171 * 376340349, -916997341 * ((Class96_Sub6) this).anInt9169, -1710403859 * ((Class96_Sub6) this).anInt9168, ((Class96_Sub6) this).anInt9172 * -2066193791, (byte) 60);
	}

	public void method1601() {
		Class86.aClass92Array820[848428857 * ((Class96_Sub6) this).anInt9170].method1559(((Class96_Sub6) this).anInt9171 * 376340349, -916997341 * ((Class96_Sub6) this).anInt9169, -1710403859 * ((Class96_Sub6) this).anInt9168, ((Class96_Sub6) this).anInt9172 * -2066193791, (byte) 30);
	}

	static final int method14502(int i, int i_0_) {
		return i >> 11 & 0x7f;
	}

	static final void method14503(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 425673003;
		int i_1_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_2_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 1]);
		int i_3_ = (((CS2Executor) class527).intStack[2 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		if (i_2_ == -1)
			throw new RuntimeException();
		Class431 class431 = Class466.aClass444_5570.method7424(i_2_, (byte) 8);
		if (i_1_ != class431.aChar5140)
			throw new RuntimeException();
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = class431.method7228(Integer.valueOf(i_3_), (byte) -68) ? 1 : 0;
	}
}
