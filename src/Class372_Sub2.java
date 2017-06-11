/* Class372_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class372_Sub2 extends Class372 {
	static int anInt7728 = 4096;
	static int anInt7729 = 12;

	Class372_Sub2() throws Throwable {
		throw new Error();
	}

	static final void method4598(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			client.aShort8839 = (short) (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			if (client.aShort8839 <= 0)
				client.aShort8839 = (short) 1;
			client.aShort8743 = (short) (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			if (client.aShort8743 <= 0)
				client.aShort8743 = (short) 32767;
			else if (client.aShort8743 < client.aShort8839)
				client.aShort8743 = client.aShort8839;
			client.aShort8934 = (short) (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]);
			if (client.aShort8934 <= 0)
				client.aShort8934 = (short) 1;
			client.aShort8935 = (short) (((ClientScript2) class403).anIntArray5244[3 + 681479919 * ((ClientScript2) class403).anInt5239]);
			if (client.aShort8935 <= 0)
				client.aShort8935 = (short) 32767;
			else if (client.aShort8935 < client.aShort8934)
				client.aShort8935 = client.aShort8934;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adr.aki(").append(')').toString());
		}
	}
}
