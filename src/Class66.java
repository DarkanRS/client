/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public abstract class Class66 {
	public static int anInt666;

	Class66() {
		/* empty */
	}

	static void method763(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, Class298_Sub37_Sub5 class298_sub37_sub5, Class264 class264, Class505 class505, int i_6_, int i_7_, byte i_8_) {
		try {
			if (i > i_1_ && i < i_3_ + i_1_ && i_0_ > i_5_ - 1110385787 * class505.anInt6202 - 1 && i_0_ < -1883958527 * class505.anInt6197 + i_5_)
				i_6_ = i_7_;
			String string = Class346.method4174(class298_sub37_sub5, (byte) -2);
			class264.method2480(string, 3 + i_1_, i_5_, i_6_, 0, client.aRandom8702, 1401020893 * Class368.anInt4005, Class436.aClass57Array5501, Class422_Sub3.anIntArray8372, 65280);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cr.au(").append(')').toString());
		}
	}

	public static void method764(byte i) {
		try {
			synchronized (Class335.aStack3619) {
				Class335.aStack3619 = new Stack();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cr.b(").append(')').toString());
		}
	}

	static final void method765(ClientScript2 class403, int i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_9_, (byte) -42);
			Class119 class119 = Class389.aClass119Array4165[i_9_ >> 16];
			Class62.method730(class105, class119, class403, 1585899223);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cr.go(").append(')').toString());
		}
	}

	static final void method766(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.aBoolean1161 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cr.og(").append(')').toString());
		}
	}

	static char method767(char c, Class429 class429, byte i) {
		try {
			if (c >= '\u00c0' && c <= '\u00ff') {
				if (c >= '\u00c0' && c <= '\u00c6')
					return 'A';
				if (c == '\u00c7')
					return 'C';
				if (c >= '\u00c8' && c <= '\u00cb')
					return 'E';
				if (c >= '\u00cc' && c <= '\u00cf')
					return 'I';
				if ('\u00d1' == c && class429 != Class429.aClass429_6632)
					return 'N';
				if (c >= '\u00d2' && c <= '\u00d6')
					return 'O';
				if (c >= '\u00d9' && c <= '\u00dc')
					return 'U';
				if ('\u00dd' == c)
					return 'Y';
				if (c == '\u00df')
					return 's';
				if (c >= '\u00e0' && c <= '\u00e6')
					return 'a';
				if (c == '\u00e7')
					return 'c';
				if (c >= '\u00e8' && c <= '\u00eb')
					return 'e';
				if (c >= '\u00ec' && c <= '\u00ef')
					return 'i';
				if (c == '\u00f1' && class429 != Class429.aClass429_6632)
					return 'n';
				if (c >= '\u00f2' && c <= '\u00f6')
					return 'o';
				if (c >= '\u00f9' && c <= '\u00fc')
					return 'u';
				if (c == '\u00fd' || '\u00ff' == c)
					return 'y';
			}
			if ('\u0152' == c)
				return 'O';
			if (c == '\u0153')
				return 'o';
			if ('\u0178' == c)
				return 'Y';
			return c;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cr.f(").append(')').toString());
		}
	}

	static final void method768(ClientScript2 class403, int i) {
		try {
			IComponentDefinition.method1135((((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242), class403, -908974507);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cr.apr(").append(')').toString());
		}
	}
}
