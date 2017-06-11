/* Class418 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class418 {
	public static int anInt5339;

	Class418() throws Throwable {
		throw new Error();
	}

	static final void method5596(ClientScript2 class403, byte i) {
		try {
			IComponentDefinition class105 = Class50.getIComponentDefinitions((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), (byte) -64);
			if (null == class105.aClass105Array1292)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			else {
				int i_0_ = class105.aClass105Array1292.length;
				for (int i_1_ = 0; i_1_ < class105.aClass105Array1292.length; i_1_++) {
					if (class105.aClass105Array1292[i_1_] == null) {
						i_0_ = i_1_;
						break;
					}
				}
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = i_0_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ri.ro(").append(')').toString());
		}
	}

	static void method5597(ClientScript2 class403, byte i) {
		try {
			Class369 class369 = Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), 245040087);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (class369.anIntArrayArray4017 == null ? 0 : class369.anIntArrayArray4017.length);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ri.n(").append(')').toString());
		}
	}

	static void method5598(byte i) {
		try {
			Class360.anInt3868 = 471358088;
			Class360.aClass25_3905 = client.gameConnection;
			if (null != client.aByteArray8843) {
				RsByteBuffer class298_sub53 = new RsByteBuffer(client.aByteArray8843);
				Class360.aLong3874 = (class298_sub53.readLong((short) 16837) * -2742373017286080113L);
				Class360.aLong3911 = (class298_sub53.readLong((short) 3310) * 3207425516430892907L);
			}
			if (Class360.aLong3874 * 122690138525332847L < 0L)
				Class78.method845(35, 1368689895);
			else
				Class460.method5981(false, true, "", "", Class360.aLong3874 * 122690138525332847L);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ri.h(").append(')').toString());
		}
	}

	static final void method5599(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) 84);
			Class119 class119 = Class389.aClass119Array4165[i_2_ >> 16];
			Class372_Sub1.method4597(class105, class119, class403, -750827082);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ri.ne(").append(')').toString());
		}
	}

	static void method5600(int i, int i_3_, int i_4_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(17, (long) i);
			class298_sub37_sub12.method3449((byte) 28);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = i_3_ * 1274450087;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ri.ar(").append(')').toString());
		}
	}

	static void method5601(byte i) {
		try {
			Class298_Sub9.aClass437_7224.clear((byte) -68);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ri.r(").append(')').toString());
		}
	}
}
