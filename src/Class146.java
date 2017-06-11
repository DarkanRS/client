/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class146 {
	public static Class146 aClass146_1564;
	public static Class146 aClass146_1565;
	public static Class146 aClass146_1566;
	public static Class146 aClass146_1567;
	public static Class146 aClass146_1568;
	public static Class146 aClass146_1569 = new Class146(1);
	public static Class146 aClass146_1570;
	public static Class146 aClass146_1571;
	public static Class146 aClass146_1572;
	public static Class146 aClass146_1573;
	public int anInt1574;
	public static int anInt1575;
	static long aLong1576;

	static {
		aClass146_1565 = new Class146(2);
		aClass146_1566 = new Class146(2);
		aClass146_1567 = new Class146(2);
		aClass146_1568 = new Class146(1);
		aClass146_1572 = new Class146(1);
		aClass146_1573 = new Class146(1);
		aClass146_1564 = new Class146(2);
		aClass146_1570 = new Class146(1);
		aClass146_1571 = new Class146(2);
	}

	Class146(int i) {
		anInt1574 = 17615701 * i;
	}

	public static String method1598(byte[] is, int i) {
		try {
			return Class52.method556(is, 0, is.length, 323436921);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fx.d(").append(')').toString());
		}
	}

	static final boolean method1599(int[][] is, int[][] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			for (int i_6_ = i_1_; i_6_ <= i_3_; i_6_++) {
				for (int i_7_ = i_2_; i_7_ <= i_4_; i_7_++) {
					if (is[i_6_][i_7_] == i && is_0_[i_6_][i_7_] <= 1)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fx.ip(").append(')').toString());
		}
	}
}
