/* Class275_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class275_Sub2 extends Class275 {
	Animable aClass521_Sub1_Sub1_Sub2_7739;
	int anInt7740;
	static int anInt7741;
	int anInt7742;
	int anInt7743;
	int anInt7744;
	static Class457 aClass457_7745 = new Class457();

	static void method12500(Class275_Sub2 class275_sub2) {
		((Class275_Sub2) class275_sub2).aClass521_Sub1_Sub1_Sub2_7739 = null;
		if (anInt7741 * 278158593 < 20) {
			aClass457_7745.method7649(class275_sub2, 2125854534);
			anInt7741 += -1808489727;
		}
	}

	static {
		anInt7741 = 0;
	}

	static Class275_Sub2 method12501() {
		Class275_Sub2 class275_sub2 = (Class275_Sub2) aClass457_7745.method7648(345279367);
		if (class275_sub2 != null) {
			anInt7741 -= -1808489727;
			return class275_sub2;
		}
		return new Class275_Sub2();
	}

	Class275_Sub2() {
		/* empty */
	}

	static void method12502(Class275_Sub2 class275_sub2) {
		((Class275_Sub2) class275_sub2).aClass521_Sub1_Sub1_Sub2_7739 = null;
		if (anInt7741 * 278158593 < 20) {
			aClass457_7745.method7649(class275_sub2, 1294265353);
			anInt7741 += -1808489727;
		}
	}

	static Class275_Sub2 method12503() {
		Class275_Sub2 class275_sub2 = (Class275_Sub2) aClass457_7745.method7648(2068657999);
		if (class275_sub2 != null) {
			anInt7741 -= -1808489727;
			return class275_sub2;
		}
		return new Class275_Sub2();
	}

	static final void method12504(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.intLocals[(class527.unknown[class527.instrPtr * 301123709])]);
	}

	static Class200 method12505(int i, int i_0_, int i_1_, MeshRasterizer class528, byte i_2_) {
		if (null == class528)
			return null;
		Class200 class200 = new Class200(i, i_0_, i_1_, class528.N(), class528.RA(), class528.ya(), class528.YA(), class528.o(), class528.AA(), class528.ha());
		return class200;
	}

	static final void method12506(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_3_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		boolean bool = ((class527.intStack[1 + 1942118537 * class527.anInt7012]) == 1);
		if (Class291_Sub1.aClass465_8029 != null) {
			Node class282 = Class291_Sub1.aClass465_8029.method7754((long) i_3_);
			if (null != class282 && !bool)
				class282.unlink(-371378792);
			else if (null == class282 && bool) {
				class282 = new Node();
				Class291_Sub1.aClass465_8029.method7765(class282, (long) i_3_);
			}
		}
	}
}
