/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class399 {
	static Class354 aClass354_5218 = new Class354(128);
	public static Class243 aClass243_5219;
	public static Class243 aClass243_5220;

	Class399() throws Throwable {
		throw new Error();
	}

	public static void method4926(int i, int i_0_) {
		try {
			if (8 == client.anInt8752 * -1233866115) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2021, client.lobbyConnection.aClass449_330, (byte) 103);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(i);
				client.lobbyConnection.method390(class298_sub36, (byte) -112);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qo.k(").append(')').toString());
		}
	}
}
