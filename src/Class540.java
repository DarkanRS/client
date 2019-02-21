
/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class540 {
	static int anInt7135;
	public static int[] anIntArray7136;
	static int anInt7137 = 0;

	static {
		anInt7135 = 0;
	}

	Class540() throws Throwable {
		throw new Error();
	}

	static void method11592(CS2Executor class527, byte i) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[class527.intStackPtr * 1942118537 - 2]), -1396181317).aStringArray2975[(class527.intStack[class527.intStackPtr * 1942118537 - 1])]);
		class527.intStackPtr -= 283782002;
	}

	static final void method11593(CS2Executor class527, int i) {
		int i_193_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_193_, (byte) 27);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_193_ >> 16];
		Engine.method4772(class118, class98, class527, (byte) 88);
	}

	static final void method11594(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4579, client.aClass184_7218.isaac, 1692651039);
		class282_sub23.buffer.writeByte(ChatLine.getLength(string));
		class282_sub23.buffer.writeString(string);
		client.aClass184_7218.method3049(class282_sub23, 1662884695);
	}

	public static Class282_Sub36 method11595(int i) {
		if (Class291_Sub1.aClass482_3459 == null || null == Class291_Sub1.aClass460_8030)
			return null;
		for (Class282_Sub36 class282_sub36 = (Class282_Sub36) Class291_Sub1.aClass460_8030.next(); class282_sub36 != null; class282_sub36 = (Class282_Sub36) Class291_Sub1.aClass460_8030.next()) {
			WorldMapAreaDefs class220 = Class291_Sub1.aClass218_3456.getWorldMapDefs(((class282_sub36.anInt7991) * -1798678621), 461119623);
			if (null != class220 && class220.aBool2742 && class220.method3719(Class291_Sub1.anInterface42_3458, 1905436135))
				return class282_sub36;
		}
		return null;
	}

	static final void decodeNPCUpdate(boolean bool, int i) {
		client.anInt7216 = 0;
		client.npcListSize = 0;
		client.anInt7332 += 539499635;
		Exception_Sub2_Sub2.decodeAddRemove(-1738671867);
		Class459.decodeUpdate(bool, 1344849031);
		Class14.decodeMasks();
		boolean bool_194_ = false;
		for (int i_195_ = 0; i_195_ < client.anInt7216 * -423388407; i_195_++) {
			int i_196_ = client.anIntArray7421[i_195_];
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_196_));
			NPC class521_sub1_sub1_sub2_sub2 = (NPC) class282_sub47.anObject8068;
			if (class521_sub1_sub1_sub2_sub2.anInt10353 * 2123576997 != -609621829 * client.anInt7332) {
				if (Class20.aBool161 && Class444.method7426(i_196_, (byte) -86))
					Class316.method5594(-559600711);
				if (class521_sub1_sub1_sub2_sub2.aClass409_10580.method6886(-1089073917))
					Class169.method2876(class521_sub1_sub1_sub2_sub2, 1280406765);
				class521_sub1_sub1_sub2_sub2.method16166(null, -12061587);
				class282_sub47.remove();
				bool_194_ = true;
			}
		}
		if (bool_194_) {
			int i_197_ = 1658163325 * client.anInt7210;
			client.anInt7210 = (client.aClass465_7208.method7748((short) 15812) * -1228117803);
			int i_198_ = 0;
			Iterator iterator = client.aClass465_7208.iterator();
			while (iterator.hasNext()) {
				Class282_Sub47 class282_sub47 = (Class282_Sub47) iterator.next();
				client.aClass282_Sub47Array7209[i_198_++] = class282_sub47;
			}
			for (int i_199_ = client.anInt7210 * 1658163325; i_199_ < i_197_; i_199_++)
				client.aClass282_Sub47Array7209[i_199_] = null;
		}
		if ((((Class184) client.aClass184_7475).recievedBuffer.index) * -1990677291 != ((Class184) client.aClass184_7475).anInt2287 * 715663393)
			throw new RuntimeException(new StringBuilder().append((((Class184) client.aClass184_7475).recievedBuffer.index) * -1990677291).append(" ").append(715663393 * (((Class184) client.aClass184_7475).anInt2287)).toString());
		for (int i_200_ = 0; i_200_ < client.anInt7211 * -685729279; i_200_++) {
			if (client.aClass465_7208.method7754((long) client.anIntArray7212[i_200_]) == null)
				throw new RuntimeException(new StringBuilder().append(i_200_).append(" ").append(-685729279 * client.anInt7211).toString());
		}
		if (0 != 1658163325 * client.anInt7210 - client.anInt7211 * -685729279)
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt7210 * 1658163325 - -685729279 * client.anInt7211).toString());
		for (int i_201_ = 0; i_201_ < client.anInt7210 * 1658163325; i_201_++) {
			if (client.anInt7332 * -609621829 != (((Animable) client.aClass282_Sub47Array7209[i_201_].anObject8068).anInt10353) * 2123576997)
				throw new RuntimeException(new StringBuilder().append("").append(-1691508299 * (((Animable) (client.aClass282_Sub47Array7209[i_201_].anObject8068)).anInt10314)).toString());
		}
	}
}
