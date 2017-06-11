/* Class298_Sub37_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub8 extends Class298_Sub37 {
	public char[] aCharArray9595;
	public String aString9596;
	public char[] aCharArray9597;
	public int[] anIntArray9598;
	public int[] anIntArray9599;

	Class298_Sub37_Sub8() {
		/* empty */
	}

	void method3430(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i == -1650604707)
						throw new IllegalStateException();
					break;
				}
				method3434(class298_sub53, i_0_, -2004307261);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ain.a(").append(')').toString());
		}
	}

	public int method3431(char c, int i) {
		try {
			if (null == anIntArray9599)
				return -1;
			for (int i_1_ = 0; i_1_ < anIntArray9599.length; i_1_++) {
				if (aCharArray9595[i_1_] == c)
					return anIntArray9599[i_1_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ain.b(").append(')').toString());
		}
	}

	void method3432(int i) {
		try {
			if (anIntArray9598 != null) {
				for (int i_2_ = 0; i_2_ < anIntArray9598.length; i_2_++)
					anIntArray9598[i_2_] |= 0x8000;
			}
			if (null != anIntArray9599) {
				for (int i_3_ = 0; i_3_ < anIntArray9599.length; i_3_++)
					anIntArray9599[i_3_] |= 0x8000;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ain.i(").append(')').toString());
		}
	}

	public int method3433(char c, int i) {
		try {
			if (null == anIntArray9598)
				return -1;
			for (int i_4_ = 0; i_4_ < anIntArray9598.length; i_4_++) {
				if (c == aCharArray9597[i_4_])
					return anIntArray9598[i_4_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ain.p(").append(')').toString());
		}
	}

	void method3434(RsByteBuffer class298_sub53, int i, int i_5_) {
		try {
			do {
				if (1 == i)
					aString9596 = class298_sub53.readString(-1462506580);
				else if (2 == i) {
					int i_6_ = class298_sub53.readUnsignedByte();
					anIntArray9599 = new int[i_6_];
					aCharArray9595 = new char[i_6_];
					for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
						anIntArray9599[i_7_] = class298_sub53.readUnsignedShort();
						byte i_8_ = class298_sub53.readByte(-12558881);
						aCharArray9595[i_7_] = (0 == i_8_ ? '\0' : Class493.method6190(i_8_, 1882768383));
					}
				} else if (i == 3) {
					int i_9_ = class298_sub53.readUnsignedByte();
					anIntArray9598 = new int[i_9_];
					aCharArray9597 = new char[i_9_];
					for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
						anIntArray9598[i_10_] = class298_sub53.readUnsignedShort();
						byte i_11_ = class298_sub53.readByte(-12558881);
						aCharArray9597[i_10_] = (0 == i_11_ ? '\0' : Class493.method6190(i_11_, 2133004777));
					}
				} else if (i == 4)
					break;
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ain.f(").append(')').toString());
		}
	}

	static final void method3435(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_13_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			if (i_13_ == -1)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = GraphicsToolkit.aClass256_5315.method2441(i_12_, -1823486068).method3433((char) i_13_, -446763636);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ain.adt(").append(')').toString());
		}
	}
}
