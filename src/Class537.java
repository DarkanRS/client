/* Class537 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class537 {
	public char aChar7096;
	public int anInt7097;
	public int anInt7098;
	public int anInt7099;

	void method11487(RsByteBuffer class282_sub35, byte i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (0 == i_0_)
				break;
			method11488(class282_sub35, i_0_, 1650259972);
		}
	}

	Class537() {
		/* empty */
	}

	void method11488(RsByteBuffer class282_sub35, int i, int i_1_) {
		if (1 == i)
			aChar7096 = Class11.method470(class282_sub35.readByte((short) -12787), 276039281);
		else if (i == 2) {
			anInt7097 = class282_sub35.readUnsignedShort() * 1698820121;
			anInt7098 = class282_sub35.readUnsignedByte() * -565030971;
			anInt7099 = class282_sub35.readUnsignedByte() * 916682963;
		}
	}

	void method11489(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method11488(class282_sub35, i, 1650259972);
		}
	}

	void method11490(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method11488(class282_sub35, i, 1650259972);
		}
	}

	void method11491(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			aChar7096 = Class11.method470(class282_sub35.readByte((short) -13983), 1713020466);
		else if (i == 2) {
			anInt7097 = class282_sub35.readUnsignedShort() * 1698820121;
			anInt7098 = class282_sub35.readUnsignedByte() * -565030971;
			anInt7099 = class282_sub35.readUnsignedByte() * 916682963;
		}
	}

	static final void method11492(CS2Executor class527, int i) {
		int i_2_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_2_, (byte) 98);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_2_ >> 16];
		IsaacCipher.method7267(class118, class98, class527, 1465963300);
	}
}
