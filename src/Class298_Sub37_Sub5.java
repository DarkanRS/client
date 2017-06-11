/* Class298_Sub37_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub5 extends Class298_Sub37 {
	int anInt9583;
	Class461 aClass461_9584;
	String aString9585;

	boolean method3416(Class298_Sub37_Sub15 class298_sub37_sub15, int i) {
		try {
			boolean bool = true;
			class298_sub37_sub15.method3402(1827791950);
			Class298_Sub37_Sub15 class298_sub37_sub15_0_ = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) this).aClass461_9584.method5984(-1933327286));
			while (class298_sub37_sub15_0_ != null) {
				if (Class473.method6069((((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 * 946432351), (((Class298_Sub37_Sub15) class298_sub37_sub15_0_).anInt9662 * 946432351), -537262415)) {
					Class63.method742(class298_sub37_sub15, class298_sub37_sub15_0_, (byte) -70);
					((Class298_Sub37_Sub5) this).anInt9583 += -130647835;
					return !bool;
				}
				class298_sub37_sub15_0_ = (Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) this).aClass461_9584.method5985(729407080);
				bool = false;
			}
			((Class298_Sub37_Sub5) this).aClass461_9584.method5982(class298_sub37_sub15, (byte) -34);
			((Class298_Sub37_Sub5) this).anInt9583 += -130647835;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aij.f(").append(')').toString());
		}
	}

	Class298_Sub37_Sub5(String string) {
		((Class298_Sub37_Sub5) this).aString9585 = string;
		((Class298_Sub37_Sub5) this).aClass461_9584 = new Class461();
	}

	int method3417(int i) {
		try {
			if ((((Class298_Sub37_Sub5) this).aClass461_9584.aClass298_Sub37_5679) != (((Class298_Sub37_Sub5) this).aClass461_9584.aClass298_Sub37_5679.aClass298_Sub37_7405))
				return ((((Class298_Sub37_Sub15) (Class298_Sub37_Sub15) (((Class298_Sub37_Sub5) this).aClass461_9584.aClass298_Sub37_5679.aClass298_Sub37_7405)).anInt9662) * 946432351);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aij.a(").append(')').toString());
		}
	}

	boolean method3418(Class298_Sub37_Sub15 class298_sub37_sub15, int i) {
		try {
			int i_1_ = method3417(-738020906);
			class298_sub37_sub15.method3402(-1148037047);
			((Class298_Sub37_Sub5) this).anInt9583 -= -130647835;
			if (-628325139 * ((Class298_Sub37_Sub5) this).anInt9583 == 0) {
				unlink(-1460969981);
				method3402(-1345021644);
				Class436.anInt5479 -= -1658575779;
				Class436.aClass348_5464.method4194(this, ((((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9666) * 6619564980435866523L));
				return false;
			}
			return i_1_ != method3417(-912976938);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aij.b(").append(')').toString());
		}
	}

	static final void method3419(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			if (-1 != -1232467723 * class105.anInt1280)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -66163287 * class105.anInt1281;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aij.ps(").append(')').toString());
		}
	}
}
