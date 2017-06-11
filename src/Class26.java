/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class26 {
	static String aString349;
	public static String aString350;
	static String aString351;
	static String aString352;
	static String aString353;
	static String aString354;
	static String aString355 = "true";
	static String aString356;

	Class26() throws Throwable {
		throw new Error();
	}

	static {
		aString353 = ",";
		aString349 = " (";
		aString352 = ")";
		aString351 = "->";
		aString354 = Class518.urp;// "127.0.0.1";
		aString350 = "<br>";
		aString356 = "</col>";
	}

	static final void method396(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242.method4363((byte) 51);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("b.apg(").append(')').toString());
		}
	}

	public static int method397(CharSequence charsequence, CharSequence charsequence_0_, Class429 class429, int i) {
		try {
			int i_1_ = charsequence.length();
			int i_2_ = charsequence_0_.length();
			int i_3_ = 0;
			int i_4_ = 0;
			char c = '\0';
			char c_5_ = '\0';
			while_59_: do {
				char c_6_;
				char c_7_;
				for (;;) {
					if (i_3_ - c >= i_1_ && i_4_ - c_5_ >= i_2_) {
						if (i >= 79380938) {
							/* empty */
						}
						break while_59_;
					}
					if (i_3_ - c >= i_1_)
						return -1;
					if (i_4_ - c_5_ >= i_2_)
						return 1;
					if (0 != c) {
						c_6_ = c;
						boolean bool = false;
					} else
						c_6_ = charsequence.charAt(i_3_++);
					if (c_5_ != 0) {
						c_7_ = c_5_;
						boolean bool = false;
					} else
						c_7_ = charsequence_0_.charAt(i_4_++);
					c = Class251.method2403(c_6_, (byte) 59);
					c_5_ = Class251.method2403(c_7_, (byte) 39);
					c_6_ = Class66.method767(c_6_, class429, (byte) 93);
					c_7_ = Class66.method767(c_7_, class429, (byte) 61);
					if (c_7_ != c_6_ && (Character.toUpperCase(c_6_) != Character.toUpperCase(c_7_))) {
						c_6_ = Character.toLowerCase(c_6_);
						c_7_ = Character.toLowerCase(c_7_);
						if (c_7_ != c_6_)
							break;
					}
				}
				return (Class367.method4550(c_6_, class429, 82862076) - Class367.method4550(c_7_, class429, -2040847947));
			} while (false);
			int i_8_ = Math.min(i_1_, i_2_);
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				if (Class429.aClass429_6626 == class429) {
					i_3_ = i_1_ - 1 - i_9_;
					i_4_ = i_2_ - 1 - i_9_;
				} else
					i_3_ = i_4_ = i_9_;
				char c_10_ = charsequence.charAt(i_3_);
				char c_11_ = charsequence_0_.charAt(i_4_);
				if (c_10_ != c_11_ && (Character.toUpperCase(c_10_) != Character.toUpperCase(c_11_))) {
					c_10_ = Character.toLowerCase(c_10_);
					c_11_ = Character.toLowerCase(c_11_);
					if (c_11_ != c_10_)
						return (Class367.method4550(c_10_, class429, -1920723606) - Class367.method4550(c_11_, class429, -495715201));
				}
			}
			int i_12_ = i_1_ - i_2_;
			if (0 != i_12_)
				return i_12_;
			for (int i_13_ = 0; i_13_ < i_8_; i_13_++) {
				char c_14_ = charsequence.charAt(i_13_);
				char c_15_ = charsequence_0_.charAt(i_13_);
				if (c_15_ != c_14_)
					return (Class367.method4550(c_14_, class429, -129620717) - Class367.method4550(c_15_, class429, -153765629));
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("b.a(").append(')').toString());
		}
	}

	public static Class367 method398(int i, int i_16_) {
		try {
			Class367[] class367s = Class69.method790(1246199085);
			for (int i_17_ = 0; i_17_ < class367s.length; i_17_++) {
				if (i == class367s[i_17_].anInt3996 * -1682932563)
					return class367s[i_17_];
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("b.f(").append(')').toString());
		}
	}

	static final void method399(ClientScript2 class403, int i) {
		try {
			int i_18_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_18_).aBoolean5731) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("b.aak(").append(')').toString());
		}
	}
}
