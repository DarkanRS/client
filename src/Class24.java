/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class24 implements Interface8_Impl1_Impl1 {
	int anInt9947;
	int anInt9948;
	int[] anIntArray9949;
	public static int anInt9950;

	public void x() {
		/* empty */
	}

	public int a() {
		try {
			return ((Class24) this).anInt9947 * 215983317;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ay.a(").append(')').toString());
		}
	}

	public int f() {
		try {
			return 467687639 * ((Class24) this).anInt9948;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ay.f(").append(')').toString());
		}
	}

	public void b() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ay.b(").append(')').toString());
		}
	}

	public int p() {
		return ((Class24) this).anInt9947 * 215983317;
	}

	public int i() {
		return ((Class24) this).anInt9947 * 215983317;
	}

	public int k() {
		return 467687639 * ((Class24) this).anInt9948;
	}

	public void d() {
		/* empty */
	}

	Class24(int i, int i_0_, int[] is) {
		((Class24) this).anInt9947 = -1649642371 * i;
		((Class24) this).anInt9948 = i_0_ * 159783655;
		((Class24) this).anIntArray9949 = is;
	}

	public void u() {
		/* empty */
	}

	static final void method380(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class422_Sub23.method5711(string, (short) -2610);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ay.sk(").append(')').toString());
		}
	}

	public static String method381(CharSequence charsequence, int i) {
		try {
			int i_1_ = charsequence.length();
			StringBuilder stringbuilder = new StringBuilder(i_1_);
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				char c = charsequence.charAt(i_2_);
				if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '.' || '-' == c || c == '*' || c == '_')
					stringbuilder.append(c);
				else if (' ' == c)
					stringbuilder.append('+');
				else {
					int i_3_ = Class124.method1387(c, 1088430238);
					stringbuilder.append('%');
					int i_4_ = i_3_ >> 4 & 0xf;
					if (i_4_ >= 10)
						stringbuilder.append((char) (55 + i_4_));
					else
						stringbuilder.append((char) (48 + i_4_));
					i_4_ = i_3_ & 0xf;
					if (i_4_ >= 10)
						stringbuilder.append((char) (55 + i_4_));
					else
						stringbuilder.append((char) (48 + i_4_));
				}
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ay.f(").append(')').toString());
		}
	}

	public static Class128 method382(RsByteBuffer class298_sub53, int i) {
		try {
			Class128_Sub3 class128_sub3 = ((Class128_Sub3) Class266.method2524(class298_sub53, (byte) -97));
			int i_5_ = class298_sub53.readShort(1551160069);
			return new Class128_Sub3_Sub1(class128_sub3.aClass139_6322, class128_sub3.aClass133_6323, class128_sub3.anInt6327 * -39975161, 1886882435 * class128_sub3.anInt6325, class128_sub3.anInt6326 * -944287579, (class128_sub3.anInt6330 * -1387457793), -684094775 * class128_sub3.anInt6328, 955568089 * class128_sub3.anInt6329, 782326281 * class128_sub3.anInt6324, -876812375 * class128_sub3.anInt8563, 1551490597 * class128_sub3.anInt8562, 578265259 * class128_sub3.anInt8566,
					861652881 * class128_sub3.anInt8564, (-1259370861 * class128_sub3.anInt8565), 356687159 * class128_sub3.anInt8561, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ay.q(").append(')').toString());
		}
	}
}
