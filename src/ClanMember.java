/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClanMember {
	public String username;
	public int world;
	public byte rank;
	static int anInt1684;
	public static int anInt1685;

	ClanMember() {
		/* empty */
	}

	static int method1773(char c, int i) {
		try {
			if (c >= 0 && c < Class426.anIntArray5359.length)
				return Class426.anIntArray5359[c];
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gq.a(").append(')').toString());
		}
	}

	static final void method1774(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 443738891 * client.anInt8884;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gq.tx(").append(')').toString());
		}
	}

	static ClientScript method1775(byte[] is, byte i) {
		try {
			return new ClientScript(new RsByteBuffer(is));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gq.p(").append(')').toString());
		}
	}

	static final void method1776(boolean bool, ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			if (bool)
				Class131.method1470(class119, class105, -1270501871);
			else
				Class53.method599(class119, class105, (byte) -3);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gq.cd(").append(')').toString());
		}
	}

	static final void method1777(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class390.method4871((byte) 30);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gq.um(").append(')').toString());
		}
	}
}
