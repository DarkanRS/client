/* Class282_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub25 extends Class282 {
	int anInt7688;
	int anInt7689;

	Class282_Sub25(int i, int i_0_) {
		((Class282_Sub25) this).anInt7688 = -69989527 * i;
		((Class282_Sub25) this).anInt7689 = i_0_ * -1464214979;
	}

	static void method12400(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, Class282_Sub50_Sub7 class282_sub50_sub7, Class8 class8, Class414 class414, int i_7_, int i_8_, int i_9_) {
		if (i > i_2_ && i < i_2_ + i_4_ && i_1_ > i_6_ - 397683159 * class414.anInt4978 - 1 && i_1_ < class414.anInt4979 * -1518951631 + i_6_ && ((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9583)
			i_7_ = i_8_;
		int[] is = Class534_Sub1.method12815(class282_sub50_sub7, -1726186381);
		String string = IncomingPacket.method6380(class282_sub50_sub7, 868923697);
		if (null != is)
			string = new StringBuilder().append(string).append(Class15.method547(is, 1953018919)).toString();
		class8.method386(string, 3 + i_2_, i_6_, i_7_, 0, client.aRandom7260, -242333475 * PacketsDecoder.anInt9079, Class115.aClass160Array1248, Class20.anIntArray177, -1905511896);
		if (((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9577)
			Exception_Sub1.aClass160_10075.method2752(5 + i_2_ + class414.method6946(string, -1967833701), i_6_ - class414.anInt4978 * 397683159);
	}

	static final void method12401(Class118 class118, Class98 class98, Class527 class527, int i) {
		class118.anInt1329 = -1346216911;
		class118.anInt1330 = -1183558903 * client.anInt7315;
		class118.anInt1339 = 0;
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class92.method1565(-1952846363 * class118.anInt1287, -2001727659);
	}

	public static boolean method12402(char c, byte i) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || c == '\u0152' || c == '\u2014' || '\u0153' == c || c == '\u0178')
			return true;
		return false;
	}
}
