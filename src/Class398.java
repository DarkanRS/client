/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class398 {
	public static String method6777(CharSequence charsequence) {
		int i = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i);
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			char c = charsequence.charAt(i_0_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '.' || '-' == c || '*' == c || c == '_')
				stringbuilder.append(c);
			else if (' ' == c)
				stringbuilder.append('+');
			else {
				int i_1_ = Class242.getByteForChar(c);
				stringbuilder.append('%');
				int i_2_ = i_1_ >> 4 & 0xf;
				if (i_2_ >= 10)
					stringbuilder.append((char) (i_2_ + 55));
				else
					stringbuilder.append((char) (48 + i_2_));
				i_2_ = i_1_ & 0xf;
				if (i_2_ >= 10)
					stringbuilder.append((char) (55 + i_2_));
				else
					stringbuilder.append((char) (i_2_ + 48));
			}
		}
		return stringbuilder.toString();
	}

	public static String method6778(String string) {
		StringBuilder stringbuilder = new StringBuilder();
		int i = string.length();
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			char c = string.charAt(i_3_);
			if (c == 37 && i > i_3_ + 2) {
				c = string.charAt(i_3_ + 1);
				boolean bool = false;
				int i_4_;
				if (c >= 48 && c <= 57)
					i_4_ = c - 48;
				else if (c >= 97 && c <= 102)
					i_4_ = 10 + c - 97;
				else if (c >= 65 && c <= 70)
					i_4_ = 10 + c - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				i_4_ *= 16;
				int i_5_ = string.charAt(2 + i_3_);
				if (i_5_ >= 48 && i_5_ <= 57)
					i_4_ += i_5_ - 48;
				else if (i_5_ >= 97 && i_5_ <= 102)
					i_4_ += i_5_ + 10 - 97;
				else if (i_5_ >= 65 && i_5_ <= 70)
					i_4_ += 10 + i_5_ - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				if (0 != i_4_ && Class209.method3600((byte) i_4_, 1053306035))
					stringbuilder.append(Class11.method470((byte) i_4_, -1555208923));
				i_3_ += 2;
			} else if (43 == c)
				stringbuilder.append(' ');
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static String method6779(String string) {
		StringBuilder stringbuilder = new StringBuilder();
		int i = string.length();
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			char c = string.charAt(i_6_);
			if (c == 37 && i > i_6_ + 2) {
				c = string.charAt(i_6_ + 1);
				boolean bool = false;
				int i_7_;
				if (c >= 48 && c <= 57)
					i_7_ = c - 48;
				else if (c >= 97 && c <= 102)
					i_7_ = 10 + c - 97;
				else if (c >= 65 && c <= 70)
					i_7_ = 10 + c - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				i_7_ *= 16;
				int i_8_ = string.charAt(2 + i_6_);
				if (i_8_ >= 48 && i_8_ <= 57)
					i_7_ += i_8_ - 48;
				else if (i_8_ >= 97 && i_8_ <= 102)
					i_7_ += i_8_ + 10 - 97;
				else if (i_8_ >= 65 && i_8_ <= 70)
					i_7_ += 10 + i_8_ - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				if (0 != i_7_ && Class209.method3600((byte) i_7_, 1053306035))
					stringbuilder.append(Class11.method470((byte) i_7_, -617824357));
				i_6_ += 2;
			} else if (43 == c)
				stringbuilder.append(' ');
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static String method6780(String string) {
		StringBuilder stringbuilder = new StringBuilder();
		int i = string.length();
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			char c = string.charAt(i_9_);
			if (c == 37 && i > i_9_ + 2) {
				c = string.charAt(i_9_ + 1);
				boolean bool = false;
				int i_10_;
				if (c >= 48 && c <= 57)
					i_10_ = c - 48;
				else if (c >= 97 && c <= 102)
					i_10_ = 10 + c - 97;
				else if (c >= 65 && c <= 70)
					i_10_ = 10 + c - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				i_10_ *= 16;
				int i_11_ = string.charAt(2 + i_9_);
				if (i_11_ >= 48 && i_11_ <= 57)
					i_10_ += i_11_ - 48;
				else if (i_11_ >= 97 && i_11_ <= 102)
					i_10_ += i_11_ + 10 - 97;
				else if (i_11_ >= 65 && i_11_ <= 70)
					i_10_ += 10 + i_11_ - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				if (0 != i_10_ && Class209.method3600((byte) i_10_, 1053306035))
					stringbuilder.append(Class11.method470((byte) i_10_, 318777631));
				i_9_ += 2;
			} else if (43 == c)
				stringbuilder.append(' ');
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	Class398() throws Throwable {
		throw new Error();
	}

	static final void method6781(CS2Executor class527, int i) {
		int i_12_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_12_, 1029312854).anInt5065 * 1247220121);
	}
}
