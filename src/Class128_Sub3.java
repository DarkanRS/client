/* Class128_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class128_Sub3 extends Class128 {
	public int anInt8561;
	public int anInt8562;
	public int anInt8563;
	public int anInt8564;
	public int anInt8565;
	public int anInt8566;

	public Class146 method49(int i) {
		try {
			return Class146.aClass146_1567;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("zx.f(").append(')').toString());
		}
	}

	public Class146 method50() {
		return Class146.aClass146_1567;
	}

	public Class146 method51() {
		return Class146.aClass146_1567;
	}

	Class128_Sub3(Class139 class139, Class133 class133, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		super(class139, class133, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt8563 = 89435289 * i_6_;
		anInt8562 = -1260843603 * i_7_;
		anInt8566 = -799581693 * i_8_;
		anInt8564 = i_9_ * -2019305103;
		anInt8565 = 1077315483 * i_10_;
		anInt8561 = i_11_ * 1415948423;
	}

	static final void method1442(ClientScript2 class403, int i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]);
			Integer integer = (Integer) Class313.anObjectArray3298[i_12_];
			if (null == integer) {
				Class520 class520 = Class99.aClass517_951.method6307(i_12_, 65536);
				if (class520.aChar6277 == 'i' || class520.aChar6277 == '1')
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
				else
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			} else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = integer.intValue();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("zx.bq(").append(')').toString());
		}
	}
}
