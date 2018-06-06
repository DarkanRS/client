/* Class282_Sub50_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub50_Sub14 extends Class282_Sub50 {
	public String aString9744;
	public char[] aCharArray9745;
	public int[] anIntArray9746;
	public int[] anIntArray9747;
	public char[] aCharArray9748;

	void method15209(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_6_ = class282_sub35.readUnsignedByte();
			if (0 == i_6_)
				break;
			method15210(class282_sub35, i_6_, (byte) -71);
		}
	}

	void method15210(RsByteBuffer class282_sub35, int i, byte i_7_) {
		do {
			if (1 == i)
				aString9744 = class282_sub35.readString();
			else if (2 == i) {
				int i_8_ = class282_sub35.readUnsignedByte();
				anIntArray9746 = new int[i_8_];
				aCharArray9745 = new char[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					anIntArray9746[i_9_] = class282_sub35.readUnsignedShort();
					byte i_10_ = class282_sub35.readByte((short) -8016);
					aCharArray9745[i_9_] = i_10_ == 0 ? '\0' : Class11.method470(i_10_, 1677278079);
				}
			} else if (3 == i) {
				int i_11_ = class282_sub35.readUnsignedByte();
				anIntArray9747 = new int[i_11_];
				aCharArray9748 = new char[i_11_];
				for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
					anIntArray9747[i_12_] = class282_sub35.readUnsignedShort();
					byte i_13_ = class282_sub35.readByte((short) -32039);
					aCharArray9748[i_12_] = i_13_ == 0 ? '\0' : Class11.method470(i_13_, -1266805306);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

	public int method15211(char c, int i) {
		if (null == anIntArray9746)
			return -1;
		for (int i_14_ = 0; i_14_ < anIntArray9746.length; i_14_++) {
			if (c == aCharArray9745[i_14_])
				return anIntArray9746[i_14_];
		}
		return -1;
	}

	public int method15212(char c, byte i) {
		if (anIntArray9747 == null)
			return -1;
		for (int i_15_ = 0; i_15_ < anIntArray9747.length; i_15_++) {
			if (c == aCharArray9748[i_15_])
				return anIntArray9747[i_15_];
		}
		return -1;
	}

	void method15213(int i) {
		if (null != anIntArray9747) {
			for (int i_16_ = 0; i_16_ < anIntArray9747.length; i_16_++)
				anIntArray9747[i_16_] |= 0x8000;
		}
		if (null != anIntArray9746) {
			for (int i_17_ = 0; i_17_ < anIntArray9746.length; i_17_++)
				anIntArray9746[i_17_] |= 0x8000;
		}
	}

	Class282_Sub50_Sub14() {
		/* empty */
	}
}
