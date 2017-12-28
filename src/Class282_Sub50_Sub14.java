/* Class282_Sub50_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub50_Sub14 extends Class282_Sub50 {
	public String aString9744;
	public char[] aCharArray9745;
	public int[] anIntArray9746;
	public int[] anIntArray9747;
	public char[] aCharArray9748;

	void method15208(RsByteBuffer class282_sub35, int i) {
		do {
			if (1 == i)
				aString9744 = class282_sub35.readString(1154735957);
			else if (2 == i) {
				int i_0_ = class282_sub35.readUnsignedByte();
				anIntArray9746 = new int[i_0_];
				aCharArray9745 = new char[i_0_];
				for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
					anIntArray9746[i_1_] = class282_sub35.readUnsignedShort();
					byte i_2_ = class282_sub35.readByte((short) -8215);
					aCharArray9745[i_1_] = i_2_ == 0 ? '\0' : Class11.method470(i_2_, -1252281541);
				}
			} else if (3 == i) {
				int i_3_ = class282_sub35.readUnsignedByte();
				anIntArray9747 = new int[i_3_];
				aCharArray9748 = new char[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					anIntArray9747[i_4_] = class282_sub35.readUnsignedShort();
					byte i_5_ = class282_sub35.readByte((short) -21534);
					aCharArray9748[i_4_] = i_5_ == 0 ? '\0' : Class11.method470(i_5_, 443974989);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

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
				aString9744 = class282_sub35.readString(27490882);
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

	void method15214(RsByteBuffer class282_sub35, int i) {
		do {
			if (1 == i)
				aString9744 = class282_sub35.readString(2064889729);
			else if (2 == i) {
				int i_18_ = class282_sub35.readUnsignedByte();
				anIntArray9746 = new int[i_18_];
				aCharArray9745 = new char[i_18_];
				for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
					anIntArray9746[i_19_] = class282_sub35.readUnsignedShort();
					byte i_20_ = class282_sub35.readByte((short) -13126);
					aCharArray9745[i_19_] = i_20_ == 0 ? '\0' : Class11.method470(i_20_, 121683722);
				}
			} else if (3 == i) {
				int i_21_ = class282_sub35.readUnsignedByte();
				anIntArray9747 = new int[i_21_];
				aCharArray9748 = new char[i_21_];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
					anIntArray9747[i_22_] = class282_sub35.readUnsignedShort();
					byte i_23_ = class282_sub35.readByte((short) -8664);
					aCharArray9748[i_22_] = i_23_ == 0 ? '\0' : Class11.method470(i_23_, 1314054974);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

	public int method15215(char c) {
		if (null == anIntArray9746)
			return -1;
		for (int i = 0; i < anIntArray9746.length; i++) {
			if (c == aCharArray9745[i])
				return anIntArray9746[i];
		}
		return -1;
	}

	void method15216(RsByteBuffer class282_sub35, int i) {
		do {
			if (1 == i)
				aString9744 = class282_sub35.readString(-170455764);
			else if (2 == i) {
				int i_24_ = class282_sub35.readUnsignedByte();
				anIntArray9746 = new int[i_24_];
				aCharArray9745 = new char[i_24_];
				for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
					anIntArray9746[i_25_] = class282_sub35.readUnsignedShort();
					byte i_26_ = class282_sub35.readByte((short) -4489);
					aCharArray9745[i_25_] = i_26_ == 0 ? '\0' : Class11.method470(i_26_, 324304241);
				}
			} else if (3 == i) {
				int i_27_ = class282_sub35.readUnsignedByte();
				anIntArray9747 = new int[i_27_];
				aCharArray9748 = new char[i_27_];
				for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
					anIntArray9747[i_28_] = class282_sub35.readUnsignedShort();
					byte i_29_ = class282_sub35.readByte((short) -18269);
					aCharArray9748[i_28_] = i_29_ == 0 ? '\0' : Class11.method470(i_29_, 321554113);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

	void method15217(RsByteBuffer class282_sub35, int i) {
		do {
			if (1 == i)
				aString9744 = class282_sub35.readString(-611863189);
			else if (2 == i) {
				int i_30_ = class282_sub35.readUnsignedByte();
				anIntArray9746 = new int[i_30_];
				aCharArray9745 = new char[i_30_];
				for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
					anIntArray9746[i_31_] = class282_sub35.readUnsignedShort();
					byte i_32_ = class282_sub35.readByte((short) -4409);
					aCharArray9745[i_31_] = i_32_ == 0 ? '\0' : Class11.method470(i_32_, -1963128537);
				}
			} else if (3 == i) {
				int i_33_ = class282_sub35.readUnsignedByte();
				anIntArray9747 = new int[i_33_];
				aCharArray9748 = new char[i_33_];
				for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
					anIntArray9747[i_34_] = class282_sub35.readUnsignedShort();
					byte i_35_ = class282_sub35.readByte((short) -19057);
					aCharArray9748[i_34_] = i_35_ == 0 ? '\0' : Class11.method470(i_35_, -1679712046);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

	public int method15218(char c) {
		if (null == anIntArray9746)
			return -1;
		for (int i = 0; i < anIntArray9746.length; i++) {
			if (c == aCharArray9745[i])
				return anIntArray9746[i];
		}
		return -1;
	}

	Class282_Sub50_Sub14() {
		/* empty */
	}

	public int method15219(char c) {
		if (anIntArray9747 == null)
			return -1;
		for (int i = 0; i < anIntArray9747.length; i++) {
			if (c == aCharArray9748[i])
				return anIntArray9747[i];
		}
		return -1;
	}

	void method15220() {
		if (null != anIntArray9747) {
			for (int i = 0; i < anIntArray9747.length; i++)
				anIntArray9747[i] |= 0x8000;
		}
		if (null != anIntArray9746) {
			for (int i = 0; i < anIntArray9746.length; i++)
				anIntArray9746[i] |= 0x8000;
		}
	}

	void method15221() {
		if (null != anIntArray9747) {
			for (int i = 0; i < anIntArray9747.length; i++)
				anIntArray9747[i] |= 0x8000;
		}
		if (null != anIntArray9746) {
			for (int i = 0; i < anIntArray9746.length; i++)
				anIntArray9746[i] |= 0x8000;
		}
	}

	void method15222() {
		if (null != anIntArray9747) {
			for (int i = 0; i < anIntArray9747.length; i++)
				anIntArray9747[i] |= 0x8000;
		}
		if (null != anIntArray9746) {
			for (int i = 0; i < anIntArray9746.length; i++)
				anIntArray9746[i] |= 0x8000;
		}
	}
}
