/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class420 {
	static char[] aCharArray5342 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	static long[] aLongArray5343 = new long[12];
	static Class515 aClass515_5344;
	static int anInt5345;

	Class420() throws Throwable {
		throw new Error();
	}

	static {
		for (int i = 0; i < aLongArray5343.length; i++)
			aLongArray5343[i] = (long) Math.pow(37.0, (double) i);
	}

	public static void method5606(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			Class298_Sub1 class298_sub1 = null;
			for (Class298_Sub1 class298_sub1_7_ = ((Class298_Sub1) Class298_Sub1.aClass453_7152.method5939(1766612795)); class298_sub1_7_ != null; class298_sub1_7_ = ((Class298_Sub1) Class298_Sub1.aClass453_7152.method5944(49146))) {
				if ((2108312995 * ((Class298_Sub1) class298_sub1_7_).anInt7151 == i) && 634196087 * class298_sub1_7_.anInt7150 == i_0_ && -2146829167 * class298_sub1_7_.anInt7155 == i_1_ && i_2_ == -431456739 * (((Class298_Sub1) class298_sub1_7_).anInt7157)) {
					class298_sub1 = class298_sub1_7_;
					break;
				}
			}
			if (class298_sub1 == null) {
				class298_sub1 = new Class298_Sub1();
				((Class298_Sub1) class298_sub1).anInt7151 = i * -196260341;
				((Class298_Sub1) class298_sub1).anInt7157 = i_2_ * 1088435253;
				class298_sub1.anInt7150 = 656787783 * i_0_;
				class298_sub1.anInt7155 = i_1_ * 284247153;
				if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < client.aClass283_8716.method2629(-1908372692) && i_1_ < client.aClass283_8716.method2630(629047644))
					Class117.method1285(class298_sub1, -162957807);
				Class298_Sub1.aClass453_7152.method5935(class298_sub1, 1633204361);
			}
			((Class298_Sub1) class298_sub1).anInt7156 = 240885009 * i_3_;
			((Class298_Sub1) class298_sub1).anInt7153 = i_4_ * 998055383;
			((Class298_Sub1) class298_sub1).anInt7149 = 1034640391 * i_5_;
			((Class298_Sub1) class298_sub1).aBoolean7159 = true;
			((Class298_Sub1) class298_sub1).aBoolean7160 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rk.a(").append(')').toString());
		}
	}

	static final void method5607(ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aClass251Array8920[i_8_].anInt2769 * 1383593425;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rk.yf(").append(')').toString());
		}
	}

	public static final void method5608(int i) {
		try {
			for (Class298_Sub1 class298_sub1 = ((Class298_Sub1) Class298_Sub1.aClass453_7152.method5939(1766612795)); class298_sub1 != null; class298_sub1 = (Class298_Sub1) Class298_Sub1.aClass453_7152.method5944(49146)) {
				if (!((Class298_Sub1) class298_sub1).aBoolean7160) {
					((Class298_Sub1) class298_sub1).aBoolean7159 = true;
					if (634196087 * class298_sub1.anInt7150 >= 0 && class298_sub1.anInt7155 * -2146829167 >= 0 && (634196087 * class298_sub1.anInt7150 < client.aClass283_8716.method2629(-1871526843)) && (class298_sub1.anInt7155 * -2146829167 < client.aClass283_8716.method2630(-1895886966)))
						Class117.method1285(class298_sub1, 147943234);
				} else
					class298_sub1.unlink(-1460969981);
			}
			for (Class298_Sub1 class298_sub1 = ((Class298_Sub1) Class298_Sub1.aClass453_7162.method5939(1766612795)); null != class298_sub1; class298_sub1 = (Class298_Sub1) Class298_Sub1.aClass453_7162.method5944(49146)) {
				if (!((Class298_Sub1) class298_sub1).aBoolean7160)
					((Class298_Sub1) class298_sub1).aBoolean7159 = true;
				else
					class298_sub1.unlink(-1460969981);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rk.b(").append(')').toString());
		}
	}
}
