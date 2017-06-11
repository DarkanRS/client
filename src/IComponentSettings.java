/* Class298_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class IComponentSettings extends Linkable {
	public static int anInt7408 = 16;
	public static int anInt7409 = 2;
	public int anInt7410;
	public static int anInt7411 = 64;
	public static int anInt7412 = 4;
	public static int anInt7413 = 32;
	public static int anInt7414 = 8;
	static IComponentSettings aClass298_Sub38_7415 = new IComponentSettings(0, -1);
	public int settingsHash;
	public static int anInt7417 = 1;

	public final boolean method3492(byte i) {
		try {
			return 0 != (-1266165749 * settingsHash & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.a(").append(')').toString());
		}
	}

	public final int method3493(byte i) {
		try {
			return settingsHash * -1266165749 >> 18 & 0x7;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.i(").append(')').toString());
		}
	}

	public final boolean method3494(int i) {
		try {
			return 0 != (-1266165749 * settingsHash >> 21 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.k(").append(')').toString());
		}
	}

	public final boolean method3495(int i) {
		try {
			return 0 != (-1266165749 * settingsHash >> 22 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.d(").append(')').toString());
		}
	}

	public final boolean method3496(int i) {
		try {
			return 0 != (-1266165749 * settingsHash >> 23 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.u(").append(')').toString());
		}
	}

	public final int method3497(byte i) {
		try {
			return Class68.method784(settingsHash * -1266165749, (byte) 105);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.b(").append(')').toString());
		}
	}

	public final boolean method3498(int i, byte i_0_) {
		try {
			return 0 != (-1266165749 * settingsHash >> i + 1 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.f(").append(')').toString());
		}
	}

	public IComponentSettings(int settingsHash, int i_1_) {
		this.settingsHash = settingsHash * -726797405;
		anInt7410 = -751469547 * i_1_;
	}

	static final void method3499(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1289394455 * Class301_Sub1.anInt7624 == 100 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.aei(").append(')').toString());
		}
	}

	public static void method3500(int i, int i_2_) {
		try {
			Class298_Sub50_Sub2.method3572(i, (byte) -33);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.f(").append(')').toString());
		}
	}

	static void method3501(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 2] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 2]), 245040087).method4566(Class128.aClass148_6331, (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1]), 910416159)) ? 1 : 0;
			((ClientScript2) class403).anInt5239 -= -391880689;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.x(").append(')').toString());
		}
	}

	public static final void method3502(String string, int i, int i_3_) {
		try {
			BufferedConnectionContext class25 = Class429.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.CHANGE_FRIEND_CHAT_PACKET, class25.aClass449_330, (byte) 82);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(1 + Class58.method693(string, 986937694));
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2107789256);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte128(i, 1999137832);
			class25.method390(class298_sub36, (byte) -112);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.mg(").append(')').toString());
		}
	}

	public static final void method3503(int i) {
		try {
			Class360.anInt3896 = -395862839;
			Class360.anInt3871 = -988354658;
			Class360.anInt3892 = -946395782;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abw.b(").append(')').toString());
		}
	}
}
