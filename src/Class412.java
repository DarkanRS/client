/* Class412 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class412 {
	static final int anInt4958 = 12;
	static final int anInt4959 = 1;
	static char[] aCharArray4960 = { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7',
			'\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
	static char[] aCharArray4961 = { '[', ']', '#' };
	static int[] anIntArray4962;
	public static byte aByte4963;

	Class412() throws Throwable {
		throw new Error();
	}

	static final int method6917(Class413 class413) {
		if (class413 == null)
			return 12;
		switch (-680323683 * ((Class413) class413).anInt4972) {
		case 5:
			return 20;
		default:
			return 12;
		}
	}

	static String method6918(CharSequence charsequence, Class413 class413) {
		if (charsequence == null)
			return null;
		int i = 0;
		int i_0_;
		for (i_0_ = charsequence.length(); (i < i_0_ && Class420.method7035(charsequence.charAt(i), 2125796256)); i++) {
			/* empty */
		}
		for (/**/; i_0_ > i && Class420.method7035(charsequence.charAt(i_0_ - 1), 1675736109); i_0_--) {
			/* empty */
		}
		int i_1_ = i_0_ - i;
		if (i_1_ < 1 || i_1_ > Class78.method1386(class413, -1144409443))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_1_);
		for (int i_2_ = i; i_2_ < i_0_; i_2_++) {
			char c = charsequence.charAt(i_2_);
			if (Class309.method5491(c, 742258231)) {
				char c_3_ = Class424.method7080(c, -216093106);
				if (c_3_ != 0)
					stringbuilder.append(c_3_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static final boolean method6919(char c) {
		if (Character.isISOControl(c))
			return false;
		if (Class380.method6450(c, 1632235019))
			return true;
		char[] cs = aCharArray4960;
		for (int i = 0; i < cs.length; i++) {
			char c_4_ = cs[i];
			if (c_4_ == c)
				return true;
		}
		cs = aCharArray4961;
		for (int i = 0; i < cs.length; i++) {
			char c_5_ = cs[i];
			if (c_5_ == c)
				return true;
		}
		return false;
	}

	static final boolean method6920(char c) {
		return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
	}

	public static String method6921(CharSequence charsequence) {
		return Class222.method3754(charsequence, null, -1655261970);
	}

	static final boolean method6922(char c) {
		return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
	}

	static String method6923(CharSequence charsequence, Class413 class413) {
		if (charsequence == null)
			return null;
		int i = 0;
		int i_6_;
		for (i_6_ = charsequence.length(); (i < i_6_ && Class420.method7035(charsequence.charAt(i), 953760799)); i++) {
			/* empty */
		}
		for (/**/; i_6_ > i && Class420.method7035(charsequence.charAt(i_6_ - 1), 1770523574); i_6_--) {
			/* empty */
		}
		int i_7_ = i_6_ - i;
		if (i_7_ < 1 || i_7_ > Class78.method1386(class413, 878651334))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_7_);
		for (int i_8_ = i; i_8_ < i_6_; i_8_++) {
			char c = charsequence.charAt(i_8_);
			if (Class309.method5491(c, 1611236639)) {
				char c_9_ = Class424.method7080(c, -1254019072);
				if (c_9_ != 0)
					stringbuilder.append(c_9_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static final boolean method6924(char c) {
		return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
	}

	public static String method6925(CharSequence charsequence) {
		return Class222.method3754(charsequence, null, -89990698);
	}

	static final int method6926(Class413 class413) {
		if (class413 == null)
			return 12;
		switch (-680323683 * ((Class413) class413).anInt4972) {
		case 5:
			return 20;
		default:
			return 12;
		}
	}

	static String method6927(CharSequence charsequence, Class413 class413) {
		if (charsequence == null)
			return null;
		int i = 0;
		int i_10_;
		for (i_10_ = charsequence.length(); (i < i_10_ && Class420.method7035(charsequence.charAt(i), 1286322769)); i++) {
			/* empty */
		}
		for (/**/; i_10_ > i && Class420.method7035(charsequence.charAt(i_10_ - 1), 1115430265); i_10_--) {
			/* empty */
		}
		int i_11_ = i_10_ - i;
		if (i_11_ < 1 || i_11_ > Class78.method1386(class413, 137562068))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_11_);
		for (int i_12_ = i; i_12_ < i_10_; i_12_++) {
			char c = charsequence.charAt(i_12_);
			if (Class309.method5491(c, 342258659)) {
				char c_13_ = Class424.method7080(c, 2136545818);
				if (c_13_ != 0)
					stringbuilder.append(c_13_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static String method6928(CharSequence charsequence, Class413 class413) {
		if (charsequence == null)
			return null;
		int i = 0;
		int i_14_;
		for (i_14_ = charsequence.length(); (i < i_14_ && Class420.method7035(charsequence.charAt(i), 832036098)); i++) {
			/* empty */
		}
		for (/**/; i_14_ > i && Class420.method7035(charsequence.charAt(i_14_ - 1), 944981527); i_14_--) {
			/* empty */
		}
		int i_15_ = i_14_ - i;
		if (i_15_ < 1 || i_15_ > Class78.method1386(class413, -1107115741))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_15_);
		for (int i_16_ = i; i_16_ < i_14_; i_16_++) {
			char c = charsequence.charAt(i_16_);
			if (Class309.method5491(c, 74437332)) {
				char c_17_ = Class424.method7080(c, -1874850177);
				if (c_17_ != 0)
					stringbuilder.append(c_17_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static String method6929(CharSequence charsequence, Class413 class413) {
		if (charsequence == null)
			return null;
		int i = 0;
		int i_18_;
		for (i_18_ = charsequence.length(); (i < i_18_ && Class420.method7035(charsequence.charAt(i), 1343164362)); i++) {
			/* empty */
		}
		for (/**/; i_18_ > i && Class420.method7035(charsequence.charAt(i_18_ - 1), 1701833893); i_18_--) {
			/* empty */
		}
		int i_19_ = i_18_ - i;
		if (i_19_ < 1 || i_19_ > Class78.method1386(class413, 540192375))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_19_);
		for (int i_20_ = i; i_20_ < i_18_; i_20_++) {
			char c = charsequence.charAt(i_20_);
			if (Class309.method5491(c, 482809555)) {
				char c_21_ = Class424.method7080(c, 549339472);
				if (c_21_ != 0)
					stringbuilder.append(c_21_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static final boolean method6930(char c) {
		return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
	}

	static String method6931(CharSequence charsequence, Class413 class413) {
		if (charsequence == null)
			return null;
		int i = 0;
		int i_22_;
		for (i_22_ = charsequence.length(); (i < i_22_ && Class420.method7035(charsequence.charAt(i), 1740117663)); i++) {
			/* empty */
		}
		for (/**/; i_22_ > i && Class420.method7035(charsequence.charAt(i_22_ - 1), 1976262165); i_22_--) {
			/* empty */
		}
		int i_23_ = i_22_ - i;
		if (i_23_ < 1 || i_23_ > Class78.method1386(class413, -329481137))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_23_);
		for (int i_24_ = i; i_24_ < i_22_; i_24_++) {
			char c = charsequence.charAt(i_24_);
			if (Class309.method5491(c, 2016397959)) {
				char c_25_ = Class424.method7080(c, 103062302);
				if (c_25_ != 0)
					stringbuilder.append(c_25_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static String method6932(CharSequence charsequence, Class413 class413) {
		if (charsequence == null)
			return null;
		int i = 0;
		int i_26_;
		for (i_26_ = charsequence.length(); (i < i_26_ && Class420.method7035(charsequence.charAt(i), 1624113127)); i++) {
			/* empty */
		}
		for (/**/; i_26_ > i && Class420.method7035(charsequence.charAt(i_26_ - 1), 1308452734); i_26_--) {
			/* empty */
		}
		int i_27_ = i_26_ - i;
		if (i_27_ < 1 || i_27_ > Class78.method1386(class413, -1067590560))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_27_);
		for (int i_28_ = i; i_28_ < i_26_; i_28_++) {
			char c = charsequence.charAt(i_28_);
			if (Class309.method5491(c, 996408883)) {
				char c_29_ = Class424.method7080(c, 533389253);
				if (c_29_ != 0)
					stringbuilder.append(c_29_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static char method6933(char c) {
		switch (c) {
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00df':
			return 'b';
		case '\u00ff':
		case '\u0178':
			return 'y';
		case '#':
		case '[':
		case ']':
			return c;
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		default:
			return Character.toLowerCase(c);
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		}
	}

	static void method6934(Class294 class294, Class384 class384, int i, int i_30_, byte i_31_) {
		if (Class20.aClass384_158 == null)
			Class20.aClass384_158 = new Class384(class384);
		else
			Class20.aClass384_158.method6562(class384);
		Class20.aClass294_155.method5209(class294);
		Class20.anInt176 = i * -877847821;
		Class20.anInt184 = i_30_ * -21606295;
	}

	static final void method6935(Class527 class527, int i) {
		((Class527) class527).anInt7000 -= 1476624725;
	}
}
