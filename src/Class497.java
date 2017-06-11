/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class497 {
	char aChar6099;
	public int anInt6100;
	public String aString6101;
	public boolean aBoolean6102 = true;
	public static Class243 aClass243_6103;
	public static Class243 aClass243_6104;
	public static Class197 aClass197_6105;
	protected static Class484[] aClass484Array6106;

	void method6204(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i != -1070488617) {
						/* empty */
					}
					break;
				}
				method6205(class298_sub53, i_0_, -1263021902);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("um.a(").append(')').toString());
		}
	}

	void method6205(RsByteBuffer class298_sub53, int i, int i_1_) {
		try {
			if (1 == i)
				((Class497) this).aChar6099 = Class493.method6190(class298_sub53.readByte(-12558881), 1872893689);
			else if (2 == i)
				anInt6100 = class298_sub53.readInt((byte) -43) * -954052725;
			else if (i == 4)
				aBoolean6102 = false;
			else if (i == 5)
				aString6101 = class298_sub53.readString(-1509093879);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("um.f(").append(')').toString());
		}
	}

	Class497() {
		/* empty */
	}

	public boolean method6206(int i) {
		try {
			return ((Class497) this).aChar6099 == 's';
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("um.b(").append(')').toString());
		}
	}

	static final void method6207(ClientScript2 class403, int i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub26_7577, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), -1529967366);
			Class3.method300(656179282);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("um.aiv(").append(')').toString());
		}
	}

	static void method6208(String string, String string_2_, int i) {
		try {
			Class360.anInt3868 = Loader.LOBBY_ENABLED ? -1058684408 : 471358088;
			Class360.aClass25_3905 = Loader.LOBBY_ENABLED ? client.lobbyConnection : client.gameConnection;
			Class460.method5981(false, false, string, string_2_, -1L);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("um.z(").append(')').toString());
		}
	}
}
