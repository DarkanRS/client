/* Class298_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub14 extends Linkable {
	int anInt7260;
	int anInt7261;
	int anInt7262;
	int anInt7263;
	int anInt7264;
	boolean aBoolean7265;

	Class298_Sub14(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		((Class298_Sub14) this).anInt7264 = i * -998689589;
		((Class298_Sub14) this).anInt7261 = -131267575 * i_0_;
		((Class298_Sub14) this).anInt7263 = 1972175283 * i_1_;
		((Class298_Sub14) this).anInt7260 = -1090405737 * i_2_;
		((Class298_Sub14) this).anInt7262 = i_3_ * -250335207;
		((Class298_Sub14) this).aBoolean7265 = bool;
	}

	static final void method2907(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -1331366076) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1261 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaw.ol(").append(')').toString());
		}
	}

	static void method2908(ClientScript2 class403, byte i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 3]);
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 2]);
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1]);
			((ClientScript2) class403).anInt5239 -= -1175642067;
			if (i_4_ > ((ClientScript2) class403).anIntArray5236[i_5_])
				throw new RuntimeException();
			if (i_4_ > ((ClientScript2) class403).anIntArray5236[i_6_])
				throw new RuntimeException();
			if (i_5_ == i_6_)
				throw new RuntimeException();
			Class82_Sub17.method920((((ClientScript2) class403).anIntArrayArray5238[i_5_]), (((ClientScript2) class403).anIntArrayArray5238[i_6_]), 0, i_4_ - 1, -8746626);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aaw.apb(").append(')').toString());
		}
	}
}
