/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class440 {
	Linkable[] aClass298Array5576;
	int anInt5577;
	long aLong5578;
	Linkable aClass298_5579;
	Linkable aClass298_5580;
	int anInt5581 = 0;
	public static Class205 aClass205_5582;

	public Linkable method5852(long l) {
		try {
			((Class440) this).aLong5578 = l * 236245195989619781L;
			Linkable class298 = (((Class440) this).aClass298Array5576[(int) (l & (long) (1721892305 * ((Class440) this).anInt5577 - 1))]);
			for (((Class440) this).aClass298_5580 = class298.next; class298 != ((Class440) this).aClass298_5580; ((Class440) this).aClass298_5580 = ((Class440) this).aClass298_5580.next) {
				if ((((Class440) this).aClass298_5580.linkedKey * 7051297995265073167L) == l) {
					Linkable class298_0_ = ((Class440) this).aClass298_5580;
					((Class440) this).aClass298_5580 = ((Class440) this).aClass298_5580.next;
					return class298_0_;
				}
			}
			((Class440) this).aClass298_5580 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.a(").append(')').toString());
		}
	}

	public Linkable method5853(int i) {
		try {
			if (((Class440) this).aClass298_5580 == null)
				return null;
			for (Linkable class298 = (((Class440) this).aClass298Array5576[(int) ((((Class440) this).aLong5578 * 4770221757987511949L) & (long) ((1721892305 * ((Class440) this).anInt5577) - 1))]); class298 != ((Class440) this).aClass298_5580; ((Class440) this).aClass298_5580 = ((Class440) this).aClass298_5580.next) {
				if ((((Class440) this).aClass298_5580.linkedKey * 7051297995265073167L) == 4770221757987511949L * ((Class440) this).aLong5578) {
					Linkable class298_1_ = ((Class440) this).aClass298_5580;
					((Class440) this).aClass298_5580 = ((Class440) this).aClass298_5580.next;
					return class298_1_;
				}
			}
			((Class440) this).aClass298_5580 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.f(").append(')').toString());
		}
	}

	public int method5854(Linkable[] class298s, int i) {
		try {
			int i_2_ = 0;
			for (int i_3_ = 0; i_3_ < 1721892305 * ((Class440) this).anInt5577; i_3_++) {
				Linkable class298 = ((Class440) this).aClass298Array5576[i_3_];
				for (Linkable class298_4_ = class298.next; class298_4_ != class298; class298_4_ = class298_4_.next)
					class298s[i_2_++] = class298_4_;
			}
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.b(").append(')').toString());
		}
	}

	public int method5855(int i) {
		try {
			int i_5_ = 0;
			for (int i_6_ = 0; i_6_ < 1721892305 * ((Class440) this).anInt5577; i_6_++) {
				Linkable class298 = ((Class440) this).aClass298Array5576[i_6_];
				for (Linkable class298_7_ = class298.next; class298_7_ != class298; class298_7_ = class298_7_.next)
					i_5_++;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.p(").append(')').toString());
		}
	}

	public Linkable method5856(int i) {
		try {
			((Class440) this).anInt5581 = 0;
			return method5857((byte) -79);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.k(").append(')').toString());
		}
	}

	public Linkable method5857(byte i) {
		try {
			if (1311298783 * ((Class440) this).anInt5581 > 0 && (((Class440) this).aClass298_5579 != (((Class440) this).aClass298Array5576[((Class440) this).anInt5581 * 1311298783 - 1]))) {
				Linkable class298 = ((Class440) this).aClass298_5579;
				((Class440) this).aClass298_5579 = class298.next;
				return class298;
			}
			while_103_: do {
				Linkable class298;
				do {
					if (1311298783 * ((Class440) this).anInt5581 >= 1721892305 * ((Class440) this).anInt5577)
						break while_103_;
					class298 = (((Class440) this).aClass298Array5576[((((Class440) this).anInt5581 += 489154335) * 1311298783) - 1].next);
				} while ((((Class440) this).aClass298Array5576[((Class440) this).anInt5581 * 1311298783 - 1]) == class298);
				((Class440) this).aClass298_5579 = class298.next;
				return class298;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.d(").append(')').toString());
		}
	}

	public Class440(int i) {
		((Class440) this).anInt5577 = -249857231 * i;
		((Class440) this).aClass298Array5576 = new Linkable[i];
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			Linkable class298 = ((Class440) this).aClass298Array5576[i_8_] = new Linkable();
			class298.next = class298;
			class298.previous = class298;
		}
	}

	public void method5858(Linkable class298, long l) {
		try {
			if (null != class298.previous)
				class298.unlink(-1460969981);
			Linkable class298_9_ = (((Class440) this).aClass298Array5576[(int) (l & (long) (((Class440) this).anInt5577 * 1721892305 - 1))]);
			class298.previous = class298_9_.previous;
			class298.next = class298_9_;
			class298.previous.next = class298;
			class298.next.previous = class298;
			class298.linkedKey = l * 4191220306876042991L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.i(").append(')').toString());
		}
	}

	static final void method5859(ClientScript2 class403, byte i) {
		try {
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_10_, 689328854);
			String string = "";
			if (null != class102 && null != class102.aString1090)
				string = class102.aString1090;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.ach(").append(')').toString());
		}
	}

	public static void method5860(Interface22 interface22, byte i) {
		try {
			if (IcmpService_Sub1.anIcmpService_Sub1_8551 == null)
				throw new IllegalStateException("");
			((IcmpService_Sub1) IcmpService_Sub1.anIcmpService_Sub1_8551).aList8552.add(interface22);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.i(").append(')').toString());
		}
	}

	public static Class428[] method5861(int i) {
		try {
			return (new Class428[] { Class428.aClass428_6618, Class428.aClass428_6619, Class428.aClass428_6620, Class428.aClass428_6617, Class428.aClass428_6616, Class428.aClass428_6621 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.a(").append(')').toString());
		}
	}

	public static void method5862(int i, int i_11_, int i_12_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(18, (long) i_11_ << 32 | (long) i);
			class298_sub37_sub12.method3445(-777100649);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("se.ao(").append(')').toString());
		}
	}
}
