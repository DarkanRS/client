/* Class449 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class449 {
	public char aChar5431;

	void method7485(RsByteBuffer class282_sub35, int i, byte i_0_) {
		if (1 == i) {
			if (i_0_ > 1)
				aChar5431 = Class11.method470(class282_sub35.readByte((short) -574), -232268203);
		}
	}

	void method7486(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7485(class282_sub35, i, (byte) 76);
		}
	}

	void method7487(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (0 == i_1_)
				break;
			method7485(class282_sub35, i_1_, (byte) 18);
		}
	}

	void method7488(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7485(class282_sub35, i, (byte) 59);
		}
	}

	Class449() {
		/* empty */
	}

	void method7489(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			aChar5431 = Class11.method470(class282_sub35.readByte((short) -18443), -1692769021);
	}

	public static void method7490(byte i) {
		if (Class448.aBool5419) {
			if (Class448.anInt5430 * -135650151 < Class485.anInt5740 * -377428565)
				Class448.anInt5430 = Class485.anInt5740 * 2011906787;
			while (-135650151 * Class448.anInt5430 < Class244.anInt3003 * -860748679) {
				Class217_Sub1 class217_sub1 = Class474.method7916(-135650151 * Class448.anInt5430, 1398054526);
				if (null == class217_sub1 || -1 != -129507359 * class217_sub1.anInt7978)
					Class448.anInt5430 += 658239401;
				else {
					if (Class448.aClass510_5423 == null)
						Class448.aClass510_5423 = client.aClass508_7223.method8729((class217_sub1.aString7976), (short) -905);
					int i_2_ = -117494151 * Class448.aClass510_5423.anInt5872;
					if (i_2_ == -1)
						break;
					class217_sub1.anInt7978 = i_2_ * -1655659487;
					Class448.anInt5430 += 658239401;
					Class448.aClass510_5423 = null;
				}
			}
		}
	}
}
