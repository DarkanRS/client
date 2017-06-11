/* Class_ta - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class_ta {
	Class_ta() {
		/* empty */
	}

	static final void method5994(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7549.method5675(-26344378);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ta.ajy(").append(')').toString());
		}
	}

	static final void method5995(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (-407713023 * (((NPC) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242).aClass503_10190.anInt6126));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ta.apx(").append(')').toString());
		}
	}

	public static String method5996(Object[] objects, int i, int i_0_, byte i_1_) {
		try {
			if (i_0_ == 0)
				return "";
			if (1 == i_0_) {
				CharSequence charsequence = (CharSequence) objects[i];
				if (null == charsequence)
					return "null";
				return charsequence.toString();
			}
			int i_2_ = i_0_ + i;
			int i_3_ = 0;
			for (int i_4_ = i; i_4_ < i_2_; i_4_++) {
				CharSequence charsequence = (CharSequence) objects[i_4_];
				if (null == charsequence)
					i_3_ += 4;
				else
					i_3_ += charsequence.length();
			}
			StringBuilder stringbuilder = new StringBuilder(i_3_);
			for (int i_5_ = i; i_5_ < i_2_; i_5_++) {
				CharSequence charsequence = (CharSequence) objects[i_5_];
				if (charsequence == null)
					stringbuilder.append("null");
				else
					stringbuilder.append(charsequence);
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ta.f(").append(')').toString());
		}
	}

	public static void method5997(Class243 class243, byte i) {
		try {
			Class173.aClass243_1756 = class243;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ta.a(").append(')').toString());
		}
	}

	public static void method5998(int i) {
		try {
			for (int i_6_ = 0; i_6_ < 100; i_6_++)
				Class107.aClass102Array1312[i_6_] = null;
			Class107.anInt1310 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ta.u(").append(')').toString());
		}
	}
}
