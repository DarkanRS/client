/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class97 {
	public static Class243 aClass243_945;

	abstract void method1036();

	abstract void method1037(int i);

	abstract void method1038();

	abstract void method1039();

	Class97() {
		/* empty */
	}

	static final void method1040(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[2 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class301_Sub1.method3713(5, i_0_ << 16 | i_1_, i_2_, "", 761274889);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dy.aln(").append(')').toString());
		}
	}

	static void method1041(int i, int i_3_) {
		try {
			if (Class372_Sub1.anIntArray7727 == null || Class372_Sub1.anIntArray7727.length < i)
				Class372_Sub1.anIntArray7727 = new int[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dy.z(").append(')').toString());
		}
	}

	public static void method1042(String string, int i) {
		try {
			if (8 == -1233866115 * client.anInt8752) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2037, client.lobbyConnection.aClass449_330, (byte) 6);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(0, 16711935);
				int i_4_ = (385051775 * class298_sub36.aClass298_Sub53_Sub2_7396.index);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2135681130);
				class298_sub36.aClass298_Sub53_Sub2_7396.index += 814893177;
				class298_sub36.aClass298_Sub53_Sub2_7396.method3611(Class361.anIntArray3913, i_4_, (385051775 * class298_sub36.aClass298_Sub53_Sub2_7396.index), -1237713398);
				class298_sub36.aClass298_Sub53_Sub2_7396.method3593(385051775 * (class298_sub36.aClass298_Sub53_Sub2_7396.index) - i_4_, 1585504133);
				client.lobbyConnection.method390(class298_sub36, (byte) -126);
				Class378.aClass428_4094 = Class428.aClass428_6620;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dy.p(").append(')').toString());
		}
	}
}
