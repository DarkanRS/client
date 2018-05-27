/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class94 {
	public static final void method1579(long l) {
		if (l > 0L) {
			if (0L == l % 10L) {
				Class350_Sub3_Sub1.method15560(l - 1L);
				Class350_Sub3_Sub1.method15560(1L);
			} else
				Class350_Sub3_Sub1.method15560(l);
		}
	}

	public static final void method1580(long l) {
		if (l > 0L) {
			if (0L == l % 10L) {
				Class350_Sub3_Sub1.method15560(l - 1L);
				Class350_Sub3_Sub1.method15560(1L);
			} else
				Class350_Sub3_Sub1.method15560(l);
		}
	}

	static final void method1581(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	Class94() throws Throwable {
		throw new Error();
	}

	static final void method1582(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static final void method1583(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static final void method1584(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static String method1585(String string, byte i) {
		if (Class396.aString4790.startsWith("win"))
			return new StringBuilder().append(string).append(".dll").toString();
		if (Class396.aString4790.startsWith("linux"))
			return new StringBuilder().append("lib").append(string).append(".so").toString();
		if (Class396.aString4790.startsWith("mac"))
			return new StringBuilder().append("lib").append(string).append(".dylib").toString();
		return null;
	}

	static final void method1586(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (i_0_ > 255 || i_0_ < 0)
			i_0_ = 0;
		if (i_0_ != Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -18)) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub11_8217), i_0_, -1291296502);
			Class190.method3148((byte) 116);
			client.aBool7175 = false;
		}
	}

	static RsByteBuffer method1587(byte i) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(518);
		Class500.anIntArray5827 = new int[4];
		Class500.anIntArray5827[0] = (int) (Math.random() * 9.9999999E7);
		Class500.anIntArray5827[1] = (int) (Math.random() * 9.9999999E7);
		Class500.anIntArray5827[2] = (int) (Math.random() * 9.9999999E7);
		Class500.anIntArray5827[3] = (int) (Math.random() * 9.9999999E7);
		class282_sub35.writeByte(10);
		class282_sub35.writeInt(Class500.anIntArray5827[0]);
		class282_sub35.writeInt(Class500.anIntArray5827[1]);
		class282_sub35.writeInt(Class500.anIntArray5827[2]);
		class282_sub35.writeInt(Class500.anIntArray5827[3]);
		return class282_sub35;
	}

	public static Class414 method1588(Index class317, int i, int i_1_, int i_2_) {
		byte[] is = class317.getFile(i, i_1_, -1787886103);
		if (is == null)
			return null;
		return new Class414(is);
	}

	public static void method1589(short i) {
		int i_3_ = 0;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1) {
			i_3_ |= 0x1;
			i_3_ |= 0x10;
			i_3_ |= 0x20;
			i_3_ |= 0x2;
			i_3_ |= 0x4;
		}
		if (Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(477680375) == 0)
			i_3_ |= 0x40;
		Class468_Sub12.method12710(i_3_, (byte) -85);
		IndexLoaders.MAP_REGION_DECODER.method4436(-2047295764).method7893(i_3_, 2082493334);
		IndexLoaders.MAP_REGION_LOADER_THREAD.method6052((short) -5779).method4436(-1603453217).method7893(i_3_, -79480655);
		IndexLoaders.ITEM_INDEX_LOADER.method7153(i_3_, -933999728);
		IndexLoaders.NPC_INDEX_LOADER.method6829(i_3_, 989063479);
		IndexLoaders.aClass515_9416.method8846(i_3_, (byte) -61);
		Class38.method851(i_3_, 1008680186);
		Game.method8204(i_3_, -2137670841);
		Class117.method1982(i_3_, -1202059650);
		Class275_Sub1.method12424(i_3_, -23443857);
		Class345.method6143(i_3_, -440467985);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -126);
	}

	static final void method1590(CS2Executor class527, int i) {
		int i_4_ = Class96_Sub14.method14641(399363690);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class233.anInt2880 = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1802099431) * -1499268811) * -638562019;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_4_;
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -112);
		Class190.method3148((byte) 117);
		client.aBool7175 = false;
	}
}
