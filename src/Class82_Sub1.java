/* Class82_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub1 extends Class82 {
	int anInt6816;

	public void method869() {
		Class87.aClass94Array794[812968099 * ((Class82_Sub1) this).anInt6816].method1016((byte) 46);
	}

	public void method866(int i) {
		try {
			Class87.aClass94Array794[812968099 * ((Class82_Sub1) this).anInt6816].method1016((byte) 15);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xb.f(").append(')').toString());
		}
	}

	Class82_Sub1(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub1) this).anInt6816 = class298_sub53.readUnsignedShort() * -1614214389;
	}

	public void method868() {
		Class87.aClass94Array794[812968099 * ((Class82_Sub1) this).anInt6816].method1016((byte) 66);
	}

	public static void method877(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			if (i_1_ == i_2_)
				Class298_Sub2.method2847(i, i_0_, i_1_, i_3_, (byte) 95);
			else if (i - i_1_ >= Class372_Sub1_Sub1.anInt4051 * -1424479739 && i + i_1_ <= Class372_Sub1_Sub1.anInt4048 * 1135094847 && (i_0_ - i_2_ >= Class372_Sub1_Sub1.anInt4049 * 1155384281) && (i_0_ + i_2_ <= -1062447355 * Class372_Sub1_Sub1.anInt4050))
				Class108.method1153(i, i_0_, i_1_, i_2_, i_3_, -735376708);
			else
				Class296.method2834(i, i_0_, i_1_, i_2_, i_3_, 655524402);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xb.ao(").append(')').toString());
		}
	}
}
