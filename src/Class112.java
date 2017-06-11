/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class112 {
	int[] anIntArray1368;
	public static String aString1369;

	public int method1239(int i, int i_0_) {
		try {
			int i_1_ = (((Class112) this).anIntArray1368.length >> 1) - 1;
			int i_2_ = i & i_1_;
			for (;;) {
				int i_3_ = ((Class112) this).anIntArray1368[i_2_ + i_2_ + 1];
				if (i_3_ == -1)
					return -1;
				if (i == ((Class112) this).anIntArray1368[i_2_ + i_2_])
					return i_3_;
				i_2_ = i_2_ + 1 & i_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eo.a(").append(')').toString());
		}
	}

	public Class112(int[] is) {
		int i;
		for (i = 1; i <= (is.length >> 1) + is.length; i <<= 1) {
			/* empty */
		}
		((Class112) this).anIntArray1368 = new int[i + i];
		for (int i_4_ = 0; i_4_ < i + i; i_4_++)
			((Class112) this).anIntArray1368[i_4_] = -1;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			int i_6_;
			for (i_6_ = is[i_5_] & i - 1; ((Class112) this).anIntArray1368[1 + (i_6_ + i_6_)] != -1; i_6_ = i_6_ + 1 & i - 1) {
				/* empty */
			}
			((Class112) this).anIntArray1368[i_6_ + i_6_] = is[i_5_];
			((Class112) this).anIntArray1368[1 + (i_6_ + i_6_)] = i_5_;
		}
	}

	static int method1240(int i, byte i_7_) {
		try {
			if (i == 16711935)
				return -1;
			return Class86.method964(i, (byte) -114);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eo.p(").append(')').toString());
		}
	}

	static final void method1241(ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_8_, (byte) -23);
			Class119 class119 = Class389.aClass119Array4165[i_8_ >> 16];
			Class127.method1419(class105, class119, class403, 970111404);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eo.gf(").append(')').toString());
		}
	}

	static final void method1242(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = Class22.method371(-1872384633).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eo.agn(").append(')').toString());
		}
	}

	public static void method1243(Class243 class243, byte i) {
		try {
			Class182.aClass243_1821 = class243;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eo.a(").append(')').toString());
		}
	}

	static void method1244(int i, int i_9_, byte i_10_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(12, (long) i);
			class298_sub37_sub12.method3449((byte) 78);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = 1274450087 * i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("eo.ay(").append(')').toString());
		}
	}
}
