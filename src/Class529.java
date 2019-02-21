/* Class529 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class529 {
	static final int anInt7025 = 4;
	public int anInt7026 = -148745212;
	public int anInt7027;
	public int anInt7028;
	public int[] anIntArray7029;
	public int anInt7030;
	static final int anInt7031 = 4;
	public int anInt7032;
	static final int anInt7033 = 7;
	public int anInt7034;
	public boolean aBool7035;
	public int anInt7036;
	static final int anInt7037 = 4;
	public int anInt7038;
	public short[][] aShortArrayArray7039;
	public short[][][] aShortArrayArrayArray7040;
	public boolean aBool7041;
	public int[] anIntArray7042 = null;
	public int anInt7043;
	public boolean aBool7044;
	public int anInt7045;
	public int anInt7046;

	void method11333(RsByteBuffer class282_sub35) {
		boolean bool = false;
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			if (1 == i) {
				if (anIntArray7042 == null) {
					anInt7026 = -148745212;
					anIntArray7042 = new int[4];
					anIntArray7029 = new int[4];
				}
				for (int i_0_ = 0; i_0_ < anIntArray7042.length; i_0_++) {
					anIntArray7042[i_0_] = class282_sub35.readShort(1700784809);
					anIntArray7029[i_0_] = class282_sub35.readShort(2047163809);
				}
				bool = true;
			} else if (i == 2)
				anInt7034 = class282_sub35.readBigSmart() * 274633635;
			else if (i == 3) {
				anInt7026 = class282_sub35.readUnsignedByte() * -1110928127;
				anIntArray7042 = new int[anInt7026 * -1141871871];
				anIntArray7029 = new int[-1141871871 * anInt7026];
			} else if (i == 4)
				aBool7044 = false;
			else if (i == 5)
				anInt7036 = class282_sub35.read24BitUnsignedInteger() * -724690589;
			else if (i == 6)
				anInt7027 = class282_sub35.read24BitUnsignedInteger() * 1334209789;
			else if (i == 7) {
				aShortArrayArray7039 = new short[10][4];
				aShortArrayArrayArray7040 = new short[10][4][];
				for (int i_1_ = 0; i_1_ < 10; i_1_++) {
					for (int i_2_ = 0; i_2_ < 4; i_2_++) {
						int i_3_ = class282_sub35.readUnsignedShort();
						if (i_3_ == 65535)
							i_3_ = -1;
						aShortArrayArray7039[i_1_][i_2_] = (short) i_3_;
						int i_4_ = class282_sub35.readUnsignedShort();
						aShortArrayArrayArray7040[i_1_][i_2_] = new short[i_4_];
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
							int i_6_ = class282_sub35.readUnsignedShort();
							if (65535 == i_6_)
								i_6_ = -1;
							aShortArrayArrayArray7040[i_1_][i_2_][i_5_] = (short) i_6_;
						}
					}
				}
			} else if (i == 8)
				aBool7041 = false;
			else if (i == 9)
				anInt7038 = class282_sub35.readUnsignedByte() * 782234835;
			else if (i == 10)
				aBool7035 = false;
			else if (11 == i)
				anInt7043 = class282_sub35.readUnsignedByte() * 1172200135;
			else if (12 == i) {
				anInt7045 = class282_sub35.readUnsignedShort() * -955205249;
				anInt7046 = class282_sub35.readUnsignedShort() * 1663314619;
			} else if (13 == i)
				anInt7032 = class282_sub35.readUnsignedByte() * -1776734159;
			else if (14 == i)
				anInt7030 = class282_sub35.readUnsignedByte() * -620876981;
			else if (15 == i)
				anInt7028 = class282_sub35.readUnsignedByte() * -1667091965;
		}
		if (!bool) {
			if (null == anIntArray7042) {
				anInt7026 = -148745212;
				anIntArray7042 = new int[4];
				anIntArray7029 = new int[4];
			}
			for (int i = 0; i < anIntArray7042.length; i++) {
				anIntArray7042[i] = 0;
				anIntArray7029[i] = i * 20;
			}
		}
	}

	void method11334(RsByteBuffer class282_sub35) {
		boolean bool = false;
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			if (1 == i) {
				if (anIntArray7042 == null) {
					anInt7026 = -148745212;
					anIntArray7042 = new int[4];
					anIntArray7029 = new int[4];
				}
				for (int i_7_ = 0; i_7_ < anIntArray7042.length; i_7_++) {
					anIntArray7042[i_7_] = class282_sub35.readShort(1652861727);
					anIntArray7029[i_7_] = class282_sub35.readShort(1790549883);
				}
				bool = true;
			} else if (i == 2)
				anInt7034 = class282_sub35.readBigSmart() * 274633635;
			else if (i == 3) {
				anInt7026 = class282_sub35.readUnsignedByte() * -1110928127;
				anIntArray7042 = new int[anInt7026 * -1141871871];
				anIntArray7029 = new int[-1141871871 * anInt7026];
			} else if (i == 4)
				aBool7044 = false;
			else if (i == 5)
				anInt7036 = class282_sub35.read24BitUnsignedInteger() * -724690589;
			else if (i == 6)
				anInt7027 = class282_sub35.read24BitUnsignedInteger() * 1334209789;
			else if (i == 7) {
				aShortArrayArray7039 = new short[10][4];
				aShortArrayArrayArray7040 = new short[10][4][];
				for (int i_8_ = 0; i_8_ < 10; i_8_++) {
					for (int i_9_ = 0; i_9_ < 4; i_9_++) {
						int i_10_ = class282_sub35.readUnsignedShort();
						if (i_10_ == 65535)
							i_10_ = -1;
						aShortArrayArray7039[i_8_][i_9_] = (short) i_10_;
						int i_11_ = class282_sub35.readUnsignedShort();
						aShortArrayArrayArray7040[i_8_][i_9_] = new short[i_11_];
						for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
							int i_13_ = class282_sub35.readUnsignedShort();
							if (65535 == i_13_)
								i_13_ = -1;
							aShortArrayArrayArray7040[i_8_][i_9_][i_12_] = (short) i_13_;
						}
					}
				}
			} else if (i == 8)
				aBool7041 = false;
			else if (i == 9)
				anInt7038 = class282_sub35.readUnsignedByte() * 782234835;
			else if (i == 10)
				aBool7035 = false;
			else if (11 == i)
				anInt7043 = class282_sub35.readUnsignedByte() * 1172200135;
			else if (12 == i) {
				anInt7045 = class282_sub35.readUnsignedShort() * -955205249;
				anInt7046 = class282_sub35.readUnsignedShort() * 1663314619;
			} else if (13 == i)
				anInt7032 = class282_sub35.readUnsignedByte() * -1776734159;
			else if (14 == i)
				anInt7030 = class282_sub35.readUnsignedByte() * -620876981;
			else if (15 == i)
				anInt7028 = class282_sub35.readUnsignedByte() * -1667091965;
		}
		if (!bool) {
			if (null == anIntArray7042) {
				anInt7026 = -148745212;
				anIntArray7042 = new int[4];
				anIntArray7029 = new int[4];
			}
			for (int i = 0; i < anIntArray7042.length; i++) {
				anIntArray7042[i] = 0;
				anIntArray7029[i] = i * 20;
			}
		}
	}

	public Class529(Index class317) {
		anIntArray7029 = null;
		anInt7030 = 1811459372;
		anInt7032 = 1482997956;
		anInt7028 = 1215258133;
		anInt7034 = -274633635;
		aBool7044 = true;
		aBool7041 = true;
		anInt7038 = 1564469670;
		aBool7035 = true;
		anInt7043 = -778366891;
		anInt7045 = 955205249;
		anInt7046 = -1663314619;
		byte[] is = class317.getFile((DefaultsFile.FILE_3.fileId * -1719912253));
		method11335(new RsByteBuffer(is), (byte) 63);
	}

	void method11335(RsByteBuffer class282_sub35, byte i) {
		boolean bool = false;
		for (;;) {
			int i_14_ = class282_sub35.readUnsignedByte();
			if (i_14_ == 0)
				break;
			if (1 == i_14_) {
				if (anIntArray7042 == null) {
					anInt7026 = -148745212;
					anIntArray7042 = new int[4];
					anIntArray7029 = new int[4];
				}
				for (int i_15_ = 0; i_15_ < anIntArray7042.length; i_15_++) {
					anIntArray7042[i_15_] = class282_sub35.readShort(1800477422);
					anIntArray7029[i_15_] = class282_sub35.readShort(1645691065);
				}
				bool = true;
			} else if (i_14_ == 2)
				anInt7034 = class282_sub35.readBigSmart() * 274633635;
			else if (i_14_ == 3) {
				anInt7026 = class282_sub35.readUnsignedByte() * -1110928127;
				anIntArray7042 = new int[anInt7026 * -1141871871];
				anIntArray7029 = new int[-1141871871 * anInt7026];
			} else if (i_14_ == 4)
				aBool7044 = false;
			else if (i_14_ == 5)
				anInt7036 = class282_sub35.read24BitUnsignedInteger() * -724690589;
			else if (i_14_ == 6)
				anInt7027 = class282_sub35.read24BitUnsignedInteger() * 1334209789;
			else if (i_14_ == 7) {
				aShortArrayArray7039 = new short[10][4];
				aShortArrayArrayArray7040 = new short[10][4][];
				for (int i_16_ = 0; i_16_ < 10; i_16_++) {
					for (int i_17_ = 0; i_17_ < 4; i_17_++) {
						int i_18_ = class282_sub35.readUnsignedShort();
						if (i_18_ == 65535)
							i_18_ = -1;
						aShortArrayArray7039[i_16_][i_17_] = (short) i_18_;
						int i_19_ = class282_sub35.readUnsignedShort();
						aShortArrayArrayArray7040[i_16_][i_17_] = new short[i_19_];
						for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
							int i_21_ = class282_sub35.readUnsignedShort();
							if (65535 == i_21_)
								i_21_ = -1;
							aShortArrayArrayArray7040[i_16_][i_17_][i_20_] = (short) i_21_;
						}
					}
				}
			} else if (i_14_ == 8)
				aBool7041 = false;
			else if (i_14_ == 9)
				anInt7038 = class282_sub35.readUnsignedByte() * 782234835;
			else if (i_14_ == 10)
				aBool7035 = false;
			else if (11 == i_14_)
				anInt7043 = class282_sub35.readUnsignedByte() * 1172200135;
			else if (12 == i_14_) {
				anInt7045 = class282_sub35.readUnsignedShort() * -955205249;
				anInt7046 = class282_sub35.readUnsignedShort() * 1663314619;
			} else if (13 == i_14_)
				anInt7032 = class282_sub35.readUnsignedByte() * -1776734159;
			else if (14 == i_14_)
				anInt7030 = class282_sub35.readUnsignedByte() * -620876981;
			else if (15 == i_14_)
				anInt7028 = class282_sub35.readUnsignedByte() * -1667091965;
		}
		if (!bool) {
			if (null == anIntArray7042) {
				anInt7026 = -148745212;
				anIntArray7042 = new int[4];
				anIntArray7029 = new int[4];
			}
			for (int i_22_ = 0; i_22_ < anIntArray7042.length; i_22_++) {
				anIntArray7042[i_22_] = 0;
				anIntArray7029[i_22_] = i_22_ * 20;
			}
		}
	}

	void method11336(RsByteBuffer class282_sub35) {
		boolean bool = false;
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			if (1 == i) {
				if (anIntArray7042 == null) {
					anInt7026 = -148745212;
					anIntArray7042 = new int[4];
					anIntArray7029 = new int[4];
				}
				for (int i_23_ = 0; i_23_ < anIntArray7042.length; i_23_++) {
					anIntArray7042[i_23_] = class282_sub35.readShort(2034709687);
					anIntArray7029[i_23_] = class282_sub35.readShort(1779420189);
				}
				bool = true;
			} else if (i == 2)
				anInt7034 = class282_sub35.readBigSmart() * 274633635;
			else if (i == 3) {
				anInt7026 = class282_sub35.readUnsignedByte() * -1110928127;
				anIntArray7042 = new int[anInt7026 * -1141871871];
				anIntArray7029 = new int[-1141871871 * anInt7026];
			} else if (i == 4)
				aBool7044 = false;
			else if (i == 5)
				anInt7036 = class282_sub35.read24BitUnsignedInteger() * -724690589;
			else if (i == 6)
				anInt7027 = class282_sub35.read24BitUnsignedInteger() * 1334209789;
			else if (i == 7) {
				aShortArrayArray7039 = new short[10][4];
				aShortArrayArrayArray7040 = new short[10][4][];
				for (int i_24_ = 0; i_24_ < 10; i_24_++) {
					for (int i_25_ = 0; i_25_ < 4; i_25_++) {
						int i_26_ = class282_sub35.readUnsignedShort();
						if (i_26_ == 65535)
							i_26_ = -1;
						aShortArrayArray7039[i_24_][i_25_] = (short) i_26_;
						int i_27_ = class282_sub35.readUnsignedShort();
						aShortArrayArrayArray7040[i_24_][i_25_] = new short[i_27_];
						for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
							int i_29_ = class282_sub35.readUnsignedShort();
							if (65535 == i_29_)
								i_29_ = -1;
							aShortArrayArrayArray7040[i_24_][i_25_][i_28_] = (short) i_29_;
						}
					}
				}
			} else if (i == 8)
				aBool7041 = false;
			else if (i == 9)
				anInt7038 = class282_sub35.readUnsignedByte() * 782234835;
			else if (i == 10)
				aBool7035 = false;
			else if (11 == i)
				anInt7043 = class282_sub35.readUnsignedByte() * 1172200135;
			else if (12 == i) {
				anInt7045 = class282_sub35.readUnsignedShort() * -955205249;
				anInt7046 = class282_sub35.readUnsignedShort() * 1663314619;
			} else if (13 == i)
				anInt7032 = class282_sub35.readUnsignedByte() * -1776734159;
			else if (14 == i)
				anInt7030 = class282_sub35.readUnsignedByte() * -620876981;
			else if (15 == i)
				anInt7028 = class282_sub35.readUnsignedByte() * -1667091965;
		}
		if (!bool) {
			if (null == anIntArray7042) {
				anInt7026 = -148745212;
				anIntArray7042 = new int[4];
				anIntArray7029 = new int[4];
			}
			for (int i = 0; i < anIntArray7042.length; i++) {
				anIntArray7042[i] = 0;
				anIntArray7029[i] = i * 20;
			}
		}
	}

	static final void method11337(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		class118.anInt1329 = -756466834;
		class118.aClass417_1308 = null;
		class118.anInt1330 = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.idHash * -1952846363, -515297121);
	}

	static final void method11338(CS2Executor class527, int i) {
		int i_30_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_30_, (byte) 115);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_30_ >> 16];
		Class346.method6158(class118, class98, class527, -1706086119);
	}

	static final void method11339(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class291_Sub1.aBool8027 ? 1 : 0;
	}

	static final void method11340(CS2Executor class527, int i) {
		class527.intStackPtr -= 425673003;
		int i_31_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_32_ = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
		int i_33_ = (class527.intStack[1942118537 * class527.intStackPtr + 2]);
		Class96_Sub10.method14603(7, i_31_ << 16 | i_32_, i_33_, "", (byte) 94);
	}

	static final void method11341(CS2Executor class527, int i) {
		int i_34_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method7785(i_34_, -2039814723);
	}
}
