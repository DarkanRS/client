/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class500 {
	static char[] aCharArray5825 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	static long[] aLongArray5826 = new long[12];
	static int[] anIntArray5827;

	public static String method8335(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (0L == l % 37L)
			return null;
		int i = 0;
		for (long l_0_ = l; l_0_ != 0L; l_0_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (l != 0L) {
			long l_1_ = l;
			l /= 37L;
			char c = aCharArray5825[(int) (l_1_ - 37L * l)];
			if ('_' == c) {
				int i_2_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_2_, Character.toUpperCase(stringbuilder.charAt(i_2_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	Class500() throws Throwable {
		throw new Error();
	}

	static long method8336(CharSequence charsequence) {
		long l = 0L;
		int i = charsequence.length();
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			l *= 37L;
			char c = charsequence.charAt(i_3_);
			if (c >= 'A' && c <= 'Z')
				l += (long) ('\001' + c - 'A');
			else if (c >= 'a' && c <= 'z')
				l += (long) (c + '\001' - 'a');
			else if (c >= '0' && c <= '9')
				l += (long) ('\033' + c - '0');
			if (l >= 177917621779460413L)
				break;
		}
		for (/**/; l % 37L == 0L && 0L != l; l /= 37L) {
			/* empty */
		}
		return l;
	}

	public static String method8337(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_4_ = l; 0L != l_4_; l_4_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (0L != l) {
			long l_5_ = l;
			l /= 37L;
			stringbuilder.append(aCharArray5825[(int) (l_5_ - 37L * l)]);
		}
		return stringbuilder.reverse().toString();
	}

	public static String method8338(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (0L == l % 37L)
			return null;
		int i = 0;
		for (long l_6_ = l; l_6_ != 0L; l_6_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (l != 0L) {
			long l_7_ = l;
			l /= 37L;
			char c = aCharArray5825[(int) (l_7_ - 37L * l)];
			if ('_' == c) {
				int i_8_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_8_, Character.toUpperCase(stringbuilder.charAt(i_8_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	static {
		for (int i = 0; i < aLongArray5826.length; i++)
			aLongArray5826[i] = (long) Math.pow(37.0, (double) i);
	}

	public static String method8339(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (0L == l % 37L)
			return null;
		int i = 0;
		for (long l_9_ = l; l_9_ != 0L; l_9_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (l != 0L) {
			long l_10_ = l;
			l /= 37L;
			char c = aCharArray5825[(int) (l_10_ - 37L * l)];
			if ('_' == c) {
				int i_11_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_11_, Character.toUpperCase(stringbuilder.charAt(i_11_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	public static String method8340(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (0L == l % 37L)
			return null;
		int i = 0;
		for (long l_12_ = l; l_12_ != 0L; l_12_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (l != 0L) {
			long l_13_ = l;
			l /= 37L;
			char c = aCharArray5825[(int) (l_13_ - 37L * l)];
			if ('_' == c) {
				int i_14_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_14_, Character.toUpperCase(stringbuilder.charAt(i_14_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	public static String method8341(CharSequence charsequence) {
		String string = Class179.method3018(Class366.method6302(charsequence, (byte) -83));
		if (string == null)
			string = "";
		return string;
	}

	public static String method8342(CharSequence charsequence) {
		String string = Class179.method3018(Class366.method6302(charsequence, (byte) -64));
		if (string == null)
			string = "";
		return string;
	}

	static final void method8343(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class393.aClass282_Sub54_4783.aClass468_Sub4_8187.method12646(930194106) && Renderers.SOFTWARE_RENDERER.method8405()) ? 1 : 0;
	}

	static final void method8344(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class349.method6186(class118, class98, class527, -94301647);
	}
}
