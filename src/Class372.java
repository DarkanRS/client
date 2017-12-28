/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class372 implements Interface46 {
	public int anInt4327 = 0;
	public char aChar4328;

	void method6355(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method6357(class282_sub35, i, (byte) 7);
		}
	}

	void method6356(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (0 == i_0_)
				break;
			method6357(class282_sub35, i_0_, (byte) 7);
		}
	}

	void method6357(RsByteBuffer class282_sub35, int i, byte i_1_) {
		if (1 == i)
			aChar4328 = Class11.method470(class282_sub35.readByte((short) -23224), -385178071);
		else if (i == 5)
			anInt4327 = class282_sub35.readUnsignedShort() * 116823705;
	}

	void method6358(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			aChar4328 = Class11.method470(class282_sub35.readByte((short) -13238), 387102529);
		else if (i == 5)
			anInt4327 = class282_sub35.readUnsignedShort() * 116823705;
	}

	void method6359(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method6357(class282_sub35, i, (byte) 7);
		}
	}

	void method6360(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method6357(class282_sub35, i, (byte) 7);
		}
	}

	void method6361(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			aChar4328 = Class11.method470(class282_sub35.readByte((short) -13306), -1931599914);
		else if (i == 5)
			anInt4327 = class282_sub35.readUnsignedShort() * 116823705;
	}

	Class372() {
		/* empty */
	}

	public static short method6362(int i, int i_2_) {
		int i_3_ = i >> 10 & 0x3f;
		int i_4_ = i >> 3 & 0x70;
		int i_5_ = i & 0x7f;
		i_4_ = i_5_ <= 64 ? i_5_ * i_4_ >> 7 : (127 - i_5_) * i_4_ >> 7;
		int i_6_ = i_4_ + i_5_;
		int i_7_;
		if (0 != i_6_)
			i_7_ = (i_4_ << 8) / i_6_;
		else
			i_7_ = i_4_ << 1;
		int i_8_ = i_6_;
		return (short) (i_3_ << 10 | i_7_ >> 4 << 7 | i_8_);
	}
}
