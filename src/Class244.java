/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class244 {
	public static int anInt2725 = 8;
	public static int anInt2726 = 4;
	static int anInt2727 = 2;
	public static int anInt2728 = 2;
	static int anInt2729 = 1;
	static int anInt2730 = 16;
	public byte[][][] aByteArrayArrayArray2731;

	public void method2319(int i) {
		try {
			for (int i_0_ = 0; i_0_ < aByteArrayArrayArray2731.length; i_0_++) {
				for (int i_1_ = 0; i_1_ < aByteArrayArrayArray2731[0].length; i_1_++) {
					for (int i_2_ = 0; i_2_ < aByteArrayArrayArray2731[0][0].length; i_2_++)
						aByteArrayArrayArray2731[i_0_][i_1_][i_2_] = (byte) 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.a(").append(')').toString());
		}
	}

	public boolean method2320(int i, int i_3_, int i_4_) {
		try {
			if (i < 0 || i_3_ < 0 || i >= aByteArrayArrayArray2731[1].length || i_3_ >= aByteArrayArrayArray2731[1][i].length)
				return false;
			if ((aByteArrayArrayArray2731[1][i][i_3_] & 0x2) != 0)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.f(").append(')').toString());
		}
	}

	public boolean method2321(int i, int i_5_, int i_6_, int i_7_, byte i_8_) {
		try {
			if (0 != (aByteArrayArrayArray2731[0][i_6_][i_7_] & 0x2))
				return true;
			if (0 != (aByteArrayArrayArray2731[i_5_][i_6_][i_7_] & 0x10))
				return false;
			if (method2322(i_5_, i_6_, i_7_, 739061165) == i)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.b(").append(')').toString());
		}
	}

	public Class244(int i, int i_9_, int i_10_) {
		aByteArrayArrayArray2731 = new byte[i][i_9_][i_10_];
	}

	int method2322(int i, int i_11_, int i_12_, int i_13_) {
		try {
			if ((aByteArrayArrayArray2731[i][i_11_][i_12_] & 0x8) != 0)
				return 0;
			if (i > 0 && (aByteArrayArrayArray2731[1][i_11_][i_12_] & 0x2) != 0)
				return i - 1;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.p(").append(')').toString());
		}
	}

	static final void method2323(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			class105.anInt1193 = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) * 437213185;
			class105.anInt1194 = (1266800241 * (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]));
			Tradution.method6054(class105, -147880968);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.fq(").append(')').toString());
		}
	}

	static final void method2324(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -391880689;
			int i_14_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			Interface class298_sub51 = ((Interface) client.aClass437_8841.get((long) i_14_));
			if (null != class298_sub51 && 3 == 27137839 * class298_sub51.clipped)
				Class173.method1821(class298_sub51, true, true, -113822480);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.sh(").append(')').toString());
		}
	}

	static final void method2325(ClientScript2 class403, byte i) {
		try {
			int i_15_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class118.method1293(i_15_ >> 14 & 0x3fff, i_15_ & 0x3fff, -548972447);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.aeb(").append(')').toString());
		}
	}

	public static void method2326(int i) {
		try {
			Class385.method4714(1590487126);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.f(").append(')').toString());
		}
	}

	static void method2327(byte[] is, int i) {
		try {
			RsByteBuffer class298_sub53 = new RsByteBuffer(is);
			for (;;) {
				int i_16_ = class298_sub53.readUnsignedByte();
				if (i_16_ == 0) {
					if (i == -475561782)
						throw new IllegalStateException();
					break;
				}
				if (1 == i_16_) {
					int i_17_ = class298_sub53.readUnsignedShort();
					if (Class300.anInt3210 * 782166935 == -1)
						Class300.anInt3210 = i_17_ * 154813479;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.x(").append(')').toString());
		}
	}

	public static int method2328(CharSequence charsequence, int i) {
		try {
			int i_18_ = charsequence.length();
			int i_19_ = 0;
			for (int i_20_ = 0; i_20_ < i_18_; i_20_++)
				i_19_ = ((i_19_ << 5) - i_19_ + Class124.method1387(charsequence.charAt(i_20_), 1088430238));
			return i_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.r(").append(')').toString());
		}
	}

	static final void method2329(ClientScript2 class403, int i) {
		try {
			if ((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1)
				((ClientScript2) class403).anInt5259 += ((((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259]) * 286750741);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.bw(").append(')').toString());
		}
	}

	public static void method2330(NPC class365_sub1_sub1_sub2_sub1, byte i) {
		try {
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7455.method5939(1766612795)); null != class298_sub41; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7455.method5944(49146))) {
				if (class365_sub1_sub1_sub2_sub1 == (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433)) {
					if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447) != null) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
					}
					class298_sub41.unlink(-1460969981);
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kf.k(").append(')').toString());
		}
	}
}
