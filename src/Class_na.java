/* Class_na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class_na extends Class298_Sub37 {
	public static Class491 aClass491_9686;

	Class_na() {
		/* empty */
	}

	public static Class298_Sub37_Sub15 method3476(int i) {
		try {
			return Class318.aClass298_Sub37_Sub15_3322;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("na.al(").append(')').toString());
		}
	}

	static final void method3477(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -49);
			Class119 class119 = Class389.aClass119Array4165[i_0_ >> 16];
			Class145.method1595(class105, class119, class403, -866344405);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("na.mr(").append(')').toString());
		}
	}

	public static final void method3478(int i) {
		try {
			for (int i_1_ = 0; i_1_ < 5; i_1_++)
				client.aBooleanArray8684[i_1_] = false;
			client.anInt8768 = -1723181617;
			client.anInt8769 = 2694169;
			Class128_Sub1.anInt8556 = 0;
			Class427.anInt5362 = 0;
			Class298_Sub1.anInt7164 = 621176181;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
			client.anInt8921 = 727655629 * client.anInt8884;
			Class301_Sub1.anInt7639 = -1614496487 * Class367.anInt4000;
			Class409.anInt5284 = Class110.anInt6403 * -418338293;
			Class82_Sub2.anInt6822 = Class146.anInt1575 * -459981543;
			Class21.anInt277 = 905514481 * client.anInt8756;
			Class298_Sub9.anInt7228 = Class135.anInt6384 * 1437648991;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("na.hb(").append(')').toString());
		}
	}

	public static final void method3479(boolean bool, int i, byte i_2_) {
		try {
			ClanChannel class298_sub25 = (bool ? Class350.primaryChannel : Class375.visitedChannel);
			if (null != class298_sub25 && i >= 0 && i < 649879491 * class298_sub25.numbersInChat) {
				ClanMember class163 = class298_sub25.members[i];
				if (-1 == class163.rank) {
					String string = class163.username;
					BufferedConnectionContext class25 = Class429.method5760((short) 512);
					Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2035, class25.aClass449_330, (byte) 56);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(3 + Class58.method693(string, -175153344));
					class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(bool ? 1 : 0);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(i, 16711935);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2135659343);
					class25.method390(class298_sub36, (byte) -99);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("na.mw(").append(')').toString());
		}
	}

	static final void method3480(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.anInt8845 * -363202459;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("na.uf(").append(')').toString());
		}
	}
}
