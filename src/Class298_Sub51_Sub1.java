/* Class298_Sub51_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub51_Sub1 extends Interface {
	int anInt9776;

	public boolean method3577() {
		Player class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[-517743867 * ((Class298_Sub51_Sub1) this).anInt9776]);
		if (class365_sub1_sub1_sub2_sub2 != null) {
			Class62.method729(Class502.aClass502_6719, -1617025021 * interfaceId, -1, class365_sub1_sub1_sub2_sub2, (-517743867 * ((Class298_Sub51_Sub1) this).anInt9776), (byte) -119);
			return true;
		}
		return false;
	}

	public boolean method3573(int i) {
		try {
			Player class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[-517743867 * ((Class298_Sub51_Sub1) this).anInt9776]);
			if (class365_sub1_sub1_sub2_sub2 != null) {
				Class62.method729(Class502.aClass502_6719, -1617025021 * interfaceId, -1, class365_sub1_sub1_sub2_sub2, (-517743867 * ((Class298_Sub51_Sub1) this).anInt9776), (byte) -83);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aje.a(").append(')').toString());
		}
	}

	public Class298_Sub51_Sub1(int i, int i_0_, int i_1_) {
		super(i, i_0_);
		((Class298_Sub51_Sub1) this).anInt9776 = 1449638349 * i_1_;
	}
}
