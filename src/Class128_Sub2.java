/* Class128_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class128_Sub2 extends Class128 {
	public int anInt8558;
	public int anInt8559;
	static Class57[] aClass57Array8560;

	public Class146 method49(int i) {
		try {
			return Class146.aClass146_1565;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("zw.f(").append(')').toString());
		}
	}

	public Class146 method50() {
		return Class146.aClass146_1565;
	}

	Class128_Sub2(Class139 class139, Class133 class133, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		super(class139, class133, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt8558 = i_6_ * 175032877;
		anInt8559 = i_7_ * 43687401;
	}

	public Class146 method51() {
		return Class146.aClass146_1565;
	}

	static final Object[] method1441(String string, ClientScript2 class403, int i) {
		try {
			Object[] objects = new Object[string.length() + 1];
			for (int i_8_ = objects.length - 1; i_8_ >= 1; i_8_--) {
				if (string.charAt(i_8_ - 1) == 's')
					objects[i_8_] = (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
				else if (string.charAt(i_8_ - 1) == '\u00a7')
					objects[i_8_] = new Long(((ClientScript2) class403).aLongArray5251[(((ClientScript2) class403).anInt5245 -= -682569305) * 1685767703]);
				else
					objects[i_8_] = new Integer(((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]);
			}
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (-1 != i_9_)
				objects[0] = new Integer(i_9_);
			else
				objects = null;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("zw.kt(").append(')').toString());
		}
	}
}
