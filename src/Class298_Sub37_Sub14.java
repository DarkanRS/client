/* Class298_Sub37_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub14 extends Class298_Sub37 {
	Class469 aClass469_9651;
	String[] aStringArray9652;
	public int[] anIntArray9653;
	int[][] anIntArrayArray9654;
	public boolean aBoolean9655 = true;
	int[] anIntArray9656;

	void method3456(int i) {
		try {
			if (null != anIntArray9653) {
				for (int i_0_ = 0; i_0_ < anIntArray9653.length; i_0_++)
					anIntArray9653[i_0_] |= 0x8000;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiv.x(").append(')').toString());
		}
	}

	void method3457(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUnsignedByte();
				if (0 == i_1_) {
					if (i <= -353781620) {
						/* empty */
					}
					break;
				}
				method3463(class298_sub53, i_1_, 1762846725);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiv.a(").append(')').toString());
		}
	}

	public int method3458(int i, int i_2_, int i_3_) {
		try {
			if (null == ((Class298_Sub37_Sub14) this).anIntArray9656 || i < 0 || i > ((Class298_Sub37_Sub14) this).anIntArray9656.length)
				return -1;
			if (null == ((Class298_Sub37_Sub14) this).anIntArrayArray9654[i] || i_2_ < 0 || i_2_ > (((Class298_Sub37_Sub14) this).anIntArrayArray9654[i]).length)
				return -1;
			return ((Class298_Sub37_Sub14) this).anIntArrayArray9654[i][i_2_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiv.u(").append(')').toString());
		}
	}

	public String method3459(RsByteBuffer class298_sub53, int i) {
		try {
			StringBuilder stringbuilder = new StringBuilder(80);
			if (null != ((Class298_Sub37_Sub14) this).anIntArray9656) {
				for (int i_4_ = 0; (i_4_ < ((Class298_Sub37_Sub14) this).anIntArray9656.length); i_4_++) {
					stringbuilder.append(((Class298_Sub37_Sub14) this).aStringArray9652[i_4_]);
					stringbuilder.append(((Class298_Sub37_Sub14) this).aClass469_9651.method6044(method3460(i_4_, -237770641), (((Class298_Sub37_Sub14) this).anIntArrayArray9654[i_4_]), (class298_sub53.method3647((Class26.method398((((Class298_Sub37_Sub14) this).anIntArray9656[i_4_]), -818645984).anInt3998) * 153532243, (byte) 67))));
				}
			}
			stringbuilder.append(((Class298_Sub37_Sub14) this).aStringArray9652[(((Class298_Sub37_Sub14) this).aStringArray9652).length - 1]);
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiv.p(").append(')').toString());
		}
	}

	public Class367 method3460(int i, int i_5_) {
		try {
			if (((Class298_Sub37_Sub14) this).anIntArray9656 == null || i < 0 || i > ((Class298_Sub37_Sub14) this).anIntArray9656.length)
				return null;
			return Class26.method398((((Class298_Sub37_Sub14) this).anIntArray9656[i]), -1627067354);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiv.d(").append(')').toString());
		}
	}

	public int method3461(short i) {
		try {
			if (null == ((Class298_Sub37_Sub14) this).anIntArray9656)
				return 0;
			return ((Class298_Sub37_Sub14) this).anIntArray9656.length;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiv.k(").append(')').toString());
		}
	}

	public String method3462(byte i) {
		try {
			StringBuilder stringbuilder = new StringBuilder(80);
			if (((Class298_Sub37_Sub14) this).aStringArray9652 == null)
				return "";
			stringbuilder.append(((Class298_Sub37_Sub14) this).aStringArray9652[0]);
			for (int i_6_ = 1; i_6_ < ((Class298_Sub37_Sub14) this).aStringArray9652.length; i_6_++) {
				for (int i_7_ = 0; i_7_ < 3; i_7_++)
					stringbuilder.append('.');
				stringbuilder.append(((Class298_Sub37_Sub14) this).aStringArray9652[i_6_]);
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiv.i(").append(')').toString());
		}
	}

	void method3463(RsByteBuffer class298_sub53, int i, int i_8_) {
		try {
			if (1 == i)
				((Class298_Sub37_Sub14) this).aStringArray9652 = (Class365_Sub1_Sub3_Sub1.method4508(class298_sub53.readString(1602597054), '<', 1942688210));
			else if (i == 2) {
				int i_9_ = class298_sub53.readUnsignedByte();
				anIntArray9653 = new int[i_9_];
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
					anIntArray9653[i_10_] = class298_sub53.readUnsignedShort();
			} else if (3 == i) {
				int i_11_ = class298_sub53.readUnsignedByte();
				((Class298_Sub37_Sub14) this).anIntArray9656 = new int[i_11_];
				((Class298_Sub37_Sub14) this).anIntArrayArray9654 = new int[i_11_][];
				for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
					int i_13_ = class298_sub53.readUnsignedShort();
					Class367 class367 = Class26.method398(i_13_, -1170894592);
					if (null != class367) {
						((Class298_Sub37_Sub14) this).anIntArray9656[i_12_] = i_13_;
						((Class298_Sub37_Sub14) this).anIntArrayArray9654[i_12_] = new int[-213410761 * class367.anInt3985];
						for (int i_14_ = 0; i_14_ < -213410761 * class367.anInt3985; i_14_++)
							((Class298_Sub37_Sub14) this).anIntArrayArray9654[i_12_][i_14_] = class298_sub53.readUnsignedShort();
					}
				}
			} else if (4 == i)
				aBoolean9655 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiv.f(").append(')').toString());
		}
	}

	Class298_Sub37_Sub14() {
		/* empty */
	}

	public void method3464(RsByteBuffer class298_sub53, int[] is, int i) {
		try {
			if (null != ((Class298_Sub37_Sub14) this).anIntArray9656) {
				for (int i_15_ = 0; (i_15_ < (((Class298_Sub37_Sub14) this).anIntArray9656).length && i_15_ < is.length); i_15_++) {
					int i_16_ = method3460(i_15_, -1152183855).anInt3986 * 128255187;
					if (i_16_ > 0)
						class298_sub53.method3603((long) is[i_15_], i_16_, -211202833);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aiv.b(").append(')').toString());
		}
	}
}
