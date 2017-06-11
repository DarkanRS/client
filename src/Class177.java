/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class177 {
	public int anInt1787;
	public Class298_Sub37_Sub14 aClass298_Sub37_Sub14_1788;
	public int[] anIntArray1789;

	static final void method1831(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) 90);
			Class119 class119 = Class389.aClass119Array4165[i_0_ >> 16];
			Class441.method5865(class105, class119, class403, 1938124725);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hj.kg(").append(')').toString());
		}
	}

	static final void method1832(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560.method5684(-1807205533) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hj.ajs(").append(')').toString());
		}
	}

	static final void method1833(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (Class389.aClass119Array4165[i_1_] == null)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (Class389.aClass119Array4165[i_1_].aClass105Array1405).length;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hj.alg(").append(')').toString());
		}
	}
}
