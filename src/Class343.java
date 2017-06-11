/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class343 {
	public int anInt3666;
	static int anInt3667 = 2;
	static int anInt3668 = 4;
	static int anInt3669 = 8;
	public int anInt3670;
	static int anInt3671 = 1;
	int anInt3672;
	public static Class264 aClass264_3673;
	public static int anInt3674;

	Class343() {
		/* empty */
	}

	public boolean method4155(byte i) {
		try {
			return 0 != (-877023375 * anInt3670 & 0x2);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oh.f(").append(')').toString());
		}
	}

	public boolean method4156(int i) {
		try {
			return 0 != (anInt3670 * -877023375 & 0x4);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oh.b(").append(')').toString());
		}
	}

	public boolean method4157(int i) {
		try {
			return (-877023375 * anInt3670 & 0x8) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oh.p(").append(')').toString());
		}
	}

	public boolean method4158(int i) {
		try {
			return 0 != (-877023375 * anInt3670 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oh.a(").append(')').toString());
		}
	}

	static final void method4159(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class128.aClass148_6331.method250(i_0_, (byte) 38);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oh.at(").append(')').toString());
		}
	}

	static final void method4160(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7582.method5726(-2143352335);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oh.ajf(").append(')').toString());
		}
	}

	public static final int method4161(int i, int i_1_, byte i_2_) {
		try {
			if (i == -2)
				return 12345678;
			if (i == -1) {
				if (i_1_ < 2)
					i_1_ = 2;
				else if (i_1_ > 126)
					i_1_ = 126;
				return i_1_;
			}
			i_1_ = (i & 0x7f) * i_1_ >> 7;
			if (i_1_ < 2)
				i_1_ = 2;
			else if (i_1_ > 126)
				i_1_ = 126;
			return (i & 0xff80) + i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oh.n(").append(')').toString());
		}
	}

	static boolean method4162(int i) {
		try {
			client.anInt8713 += -75983735;
			client.aBoolean8714 = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oh.ne(").append(')').toString());
		}
	}
}
