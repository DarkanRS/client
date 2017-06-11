/* Class298_Sub51_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub51_Sub2 extends Interface {
	int anInt9777;

	public boolean method3578() {
		Class298_Sub29 class298_sub29 = ((Class298_Sub29) (client.npcs.get((long) (119655585 * ((Class298_Sub51_Sub2) this).anInt9777))));
		if (class298_sub29 != null) {
			Class62.method729(Class502.aClass502_6728, -1617025021 * interfaceId, -1, ((Entity) class298_sub29.anObject7366), (((Class298_Sub51_Sub2) this).anInt9777 * 119655585), (byte) -46);
			return true;
		}
		return false;
	}

	public Class298_Sub51_Sub2(int i, int i_0_, int i_1_) {
		super(i, i_0_);
		((Class298_Sub51_Sub2) this).anInt9777 = i_1_ * -378595487;
	}

	public boolean method3573(int i) {
		try {
			Class298_Sub29 class298_sub29 = ((Class298_Sub29) (client.npcs.get((long) (119655585 * ((Class298_Sub51_Sub2) this).anInt9777))));
			if (class298_sub29 != null) {
				Class62.method729(Class502.aClass502_6728, -1617025021 * interfaceId, -1, ((Entity) class298_sub29.anObject7366), (((Class298_Sub51_Sub2) this).anInt9777 * 119655585), (byte) -1);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajj.a(").append(')').toString());
		}
	}
}
