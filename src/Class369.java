/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class369 {
	public int anInt4006;
	Class362 aClass362_4007;
	public String aString4008;
	int[] anIntArray4009;
	int[][] anIntArrayArray4010;
	public int anInt4011 = 0;
	public int anInt4012 = 0;
	int[] anIntArray4013;
	public int anInt4014;
	int[] anIntArray4015;
	public int[] anIntArray4016;
	public int[][] anIntArrayArray4017;
	HashTable aClass437_4018;
	public int[] anIntArray4019;
	int[] anIntArray4020;
	int[][] anIntArrayArray4021;
	public String[] aStringArray4022;
	public int[] anIntArray4023;
	int[] anIntArray4024;
	public String aString4025;
	public String[] aStringArray4026;
	public boolean aBoolean4027 = false;
	public int anInt4028 = -301919677;

	void method4558(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i >= -1662302554) {
						/* empty */
					}
					break;
				}
				method4559(class298_sub53, i_0_, -1109459912);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.a(").append(')').toString());
		}
	}

	void method4559(RsByteBuffer stream, int opcode, int i_1_) {
		try {
			if (1 == opcode)
				aString4025 = stream.readJagString(681479919);
			else if (2 == opcode)
				aString4008 = stream.readJagString(681479919);
			else if (opcode == 3) {
				int i_2_ = stream.readUnsignedByte();
				((Class369) this).anIntArrayArray4010 = new int[i_2_][3];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					((Class369) this).anIntArrayArray4010[i_3_][0] = stream.readUnsignedShort();
					((Class369) this).anIntArrayArray4010[i_3_][1] = stream.readInt((byte) 34);
					((Class369) this).anIntArrayArray4010[i_3_][2] = stream.readInt((byte) 72);
				}
			} else if (4 == opcode) {
				int i_4_ = stream.readUnsignedByte();
				((Class369) this).anIntArrayArray4021 = new int[i_4_][3];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					((Class369) this).anIntArrayArray4021[i_5_][0] = stream.readUnsignedShort();
					((Class369) this).anIntArrayArray4021[i_5_][1] = stream.readInt((byte) -80);
					((Class369) this).anIntArrayArray4021[i_5_][2] = stream.readInt((byte) -11);
				}
			} else if (opcode == 5)
				stream.readUnsignedShort();
			else if (6 == opcode)
				anInt4011 = stream.readUnsignedByte() * -1975598225;
			else if (7 == opcode)
				anInt4012 = stream.readUnsignedByte() * 203571345;
			else if (8 == opcode)
				aBoolean4027 = true;
			else if (9 == opcode)
				anInt4014 = stream.readUnsignedByte() * 1044902997;
			else if (10 == opcode) {
				int i_6_ = stream.readUnsignedByte();
				((Class369) this).anIntArray4015 = new int[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
					((Class369) this).anIntArray4015[i_7_] = stream.readInt((byte) 87);
			} else if (12 == opcode)
				stream.readInt((byte) 85);
			else if (opcode == 13) {
				int i_8_ = stream.readUnsignedByte();
				anIntArray4016 = new int[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
					anIntArray4016[i_9_] = stream.readUnsignedShort();
			} else if (opcode == 14) {
				int i_10_ = stream.readUnsignedByte();
				anIntArrayArray4017 = new int[i_10_][2];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					anIntArrayArray4017[i_11_][0] = stream.readUnsignedByte();
					anIntArrayArray4017[i_11_][1] = stream.readUnsignedByte();
				}
			} else if (15 == opcode)
				anInt4006 = stream.readUnsignedShort() * 96808193;
			else if (opcode == 17)
				anInt4028 = stream.readBigSmart(1235052657) * 301919677;
			else if (opcode == 18) {
				int i_12_ = stream.readUnsignedByte();
				anIntArray4019 = new int[i_12_];
				((Class369) this).anIntArray4020 = new int[i_12_];
				((Class369) this).anIntArray4013 = new int[i_12_];
				aStringArray4022 = new String[i_12_];
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
					anIntArray4019[i_13_] = stream.readInt((byte) 8);
					((Class369) this).anIntArray4020[i_13_] = stream.readInt((byte) -38);
					((Class369) this).anIntArray4013[i_13_] = stream.readInt((byte) -23);
					aStringArray4022[i_13_] = stream.readString(-1449039258);
				}
			} else if (opcode == 19) {
				int i_14_ = stream.readUnsignedByte();
				anIntArray4023 = new int[i_14_];
				((Class369) this).anIntArray4024 = new int[i_14_];
				((Class369) this).anIntArray4009 = new int[i_14_];
				aStringArray4026 = new String[i_14_];
				for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
					anIntArray4023[i_15_] = stream.readInt((byte) 111);
					((Class369) this).anIntArray4024[i_15_] = stream.readInt((byte) -1);
					((Class369) this).anIntArray4009[i_15_] = stream.readInt((byte) -36);
					aStringArray4026[i_15_] = stream.readString(166034178);
				}
			} else if (opcode == 249) {
				int i_16_ = stream.readUnsignedByte();
				if (((Class369) this).aClass437_4018 == null) {
					int i_17_ = Class416.method5590(i_16_, (byte) 16);
					((Class369) this).aClass437_4018 = new HashTable(i_17_);
				}
				for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
					boolean bool = stream.readUnsignedByte() == 1;
					int i_19_ = stream.read24BitUnsignedInteger((byte) -5);
					Linkable class298;
					if (bool)
						class298 = new Class298_Sub29(stream.readString(-1573991402));
					else
						class298 = new Class298_Sub35(stream.readInt((byte) -24));
					((Class369) this).aClass437_4018.method5817(class298, (long) i_19_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.f(").append(')').toString());
		}
	}

	void method4560(int i) {
		try {
			if (null == aString4008)
				aString4008 = aString4025;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.b(").append(')').toString());
		}
	}

	public boolean method4561(Interface23 interface23, int i) {
		try {
			if (null != ((Class369) this).anIntArrayArray4010) {
				for (int i_20_ = 0; i_20_ < ((Class369) this).anIntArrayArray4010.length; i_20_++) {
					if (interface23.method252((((Class369) this).anIntArrayArray4010[i_20_][0]), (byte) 19) >= ((Class369) this).anIntArrayArray4010[i_20_][1])
						return true;
				}
			}
			if (null != ((Class369) this).anIntArrayArray4021) {
				for (int i_21_ = 0; i_21_ < ((Class369) this).anIntArrayArray4021.length; i_21_++) {
					if (interface23.method250((((Class369) this).anIntArrayArray4021[i_21_][0]), (byte) 36) >= ((Class369) this).anIntArrayArray4021[i_21_][1])
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.k(").append(')').toString());
		}
	}

	public boolean method4562(Interface23 interface23, int i) {
		try {
			if (null != ((Class369) this).anIntArrayArray4010) {
				for (int i_22_ = 0; i_22_ < ((Class369) this).anIntArrayArray4010.length; i_22_++) {
					if (interface23.method252((((Class369) this).anIntArrayArray4010[i_22_][0]), (byte) 99) >= ((Class369) this).anIntArrayArray4010[i_22_][2])
						return true;
				}
			}
			if (null != ((Class369) this).anIntArrayArray4021) {
				for (int i_23_ = 0; i_23_ < ((Class369) this).anIntArrayArray4021.length; i_23_++) {
					if (interface23.method250((((Class369) this).anIntArrayArray4021[i_23_][0]), (byte) 110) >= ((Class369) this).anIntArrayArray4021[i_23_][2])
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.d(").append(')').toString());
		}
	}

	public boolean method4563(Interface23 interface23, int[] is, byte i) {
		try {
			if (((Class369) this).aClass362_4007.method4308(interface23, -2006575627) < anInt4006 * 1327747841)
				return false;
			if (anIntArrayArray4017 != null) {
				for (int i_24_ = 0; i_24_ < anIntArrayArray4017.length; i_24_++) {
					if (is[anIntArrayArray4017[i_24_][0]] < anIntArrayArray4017[i_24_][1])
						return false;
				}
			}
			if (anIntArray4016 != null) {
				for (int i_25_ = 0; i_25_ < anIntArray4016.length; i_25_++) {
					if (!((Class369) this).aClass362_4007.method4307(anIntArray4016[i_25_], 245040087).method4562(interface23, -1717639697))
						return false;
				}
			}
			if (anIntArray4019 != null) {
				for (int i_26_ = 0; i_26_ < anIntArray4019.length; i_26_++) {
					int i_27_ = interface23.method252(anIntArray4019[i_26_], (byte) 22);
					if (i_27_ < ((Class369) this).anIntArray4020[i_26_] || i_27_ > ((Class369) this).anIntArray4013[i_26_])
						return false;
				}
			}
			if (null != anIntArray4023) {
				for (int i_28_ = 0; i_28_ < anIntArray4023.length; i_28_++) {
					int i_29_ = interface23.method250(anIntArray4023[i_28_], (byte) 25);
					if (i_29_ < ((Class369) this).anIntArray4024[i_28_] || i_29_ > ((Class369) this).anIntArray4009[i_28_])
						return false;
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.u(").append(')').toString());
		}
	}

	public boolean method4564(Interface23 interface23, int i, int i_30_) {
		try {
			if (anIntArray4023 == null || i < 0 || i >= anIntArray4023.length)
				return false;
			int i_31_ = interface23.method250(anIntArray4023[i], (byte) 61);
			if (i_31_ < ((Class369) this).anIntArray4024[i] || i_31_ > ((Class369) this).anIntArray4009[i])
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.s(").append(')').toString());
		}
	}

	public boolean method4565(int[] is, int i, byte i_32_) {
		try {
			if (null == anIntArrayArray4017 || i < 0 || i >= anIntArrayArray4017.length)
				return false;
			if (is[anIntArrayArray4017[i][0]] < anIntArrayArray4017[i][1])
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.r(").append(')').toString());
		}
	}

	public boolean method4566(Interface23 interface23, int i, int i_33_) {
		try {
			if (null == anIntArray4016 || i < 0 || i >= anIntArray4016.length)
				return false;
			if (!((Class369) this).aClass362_4007.method4307(anIntArray4016[i], 245040087).method4562(interface23, -1717639697))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.q(").append(')').toString());
		}
	}

	public boolean method4567(Interface23 interface23, int i, int i_34_) {
		try {
			if (null == anIntArray4019 || i < 0 || i >= anIntArray4019.length)
				return false;
			int i_35_ = interface23.method252(anIntArray4019[i], (byte) 126);
			if (i_35_ < ((Class369) this).anIntArray4020[i] || i_35_ > ((Class369) this).anIntArray4013[i])
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.n(").append(')').toString());
		}
	}

	Class369() {
		/* empty */
	}

	public int method4568(int i, int i_36_, byte i_37_) {
		try {
			if (null == ((Class369) this).aClass437_4018)
				return i_36_;
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((Class369) this).aClass437_4018.get((long) i));
			if (class298_sub35 == null)
				return i_36_;
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.p(").append(')').toString());
		}
	}

	public boolean method4569(Interface23 interface23, int i) {
		try {
			if (((Class369) this).aClass362_4007.method4308(interface23, -1427823636) < anInt4006 * 1327747841)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.x(").append(')').toString());
		}
	}

	public String method4570(int i, String string, int i_38_) {
		try {
			if (null == ((Class369) this).aClass437_4018)
				return string;
			Class298_Sub29 class298_sub29 = ((Class298_Sub29) ((Class369) this).aClass437_4018.get((long) i));
			if (class298_sub29 == null)
				return string;
			return (String) class298_sub29.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.i(").append(')').toString());
		}
	}

	static final void method4571(ClientScript2 class403, byte i) {
		try {
			int i_39_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass162_5252.anIntArray1666[i_39_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.xd(").append(')').toString());
		}
	}

	public static void method4572(int i, int i_40_) {
		try {
			Class21.anInt275 = 925615037 * i;
			IComponentDefinition.aClass348_1138.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pi.v(").append(')').toString());
		}
	}
}
