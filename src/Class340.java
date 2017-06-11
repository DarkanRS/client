/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class340 {
	int anInt3639;
	Class461 aClass461_3640 = new Class461();
	HashTable aClass437_3641;
	int anInt3642;

	public final void method4127(Object object, Interface18 interface18) {
		method4130(object, interface18, 1);
	}

	final void method4128(Interface18 interface18) {
		long l = interface18.method231();
		for (Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) ((Class340) this).aClass437_3641.get(l)); class298_sub37_sub1 != null; class298_sub37_sub1 = (Class298_Sub37_Sub1) ((Class340) this).aClass437_3641.nextInBucket(-2034265675)) {
			if (((Class298_Sub37_Sub1) class298_sub37_sub1).anInterface18_9575.method232(interface18)) {
				method4129(class298_sub37_sub1);
				break;
			}
		}
	}

	final void method4129(Class298_Sub37_Sub1 class298_sub37_sub1) {
		if (class298_sub37_sub1 != null) {
			class298_sub37_sub1.unlink(-1460969981);
			class298_sub37_sub1.method3402(460842830);
			((Class340) this).anInt3642 += ((Class298_Sub37_Sub1) class298_sub37_sub1).anInt9576;
		}
	}

	final void method4130(Object object, Interface18 interface18, int i) {
		if (i > ((Class340) this).anInt3639)
			throw new IllegalStateException();
		method4128(interface18);
		((Class340) this).anInt3642 -= i;
		while (((Class340) this).anInt3642 < 0) {
			Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) ((Class340) this).aClass461_3640.method5983(-2126444104));
			method4129(class298_sub37_sub1);
		}
		Class298_Sub37_Sub1_Sub1 class298_sub37_sub1_sub1 = new Class298_Sub37_Sub1_Sub1(interface18, object, i);
		((Class340) this).aClass437_3641.method5817(class298_sub37_sub1_sub1, interface18.method231());
		((Class340) this).aClass461_3640.method5982(class298_sub37_sub1_sub1, (byte) -62);
		class298_sub37_sub1_sub1.aLong7406 = 0L;
	}

	public final void method4131(int i) {
		for (Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) ((Class340) this).aClass461_3640.method5984(-1518160714)); class298_sub37_sub1 != null; class298_sub37_sub1 = ((Class298_Sub37_Sub1) ((Class340) this).aClass461_3640.method5985(-216095047))) {
			if (class298_sub37_sub1.method3407()) {
				if (class298_sub37_sub1.method3406() == null) {
					class298_sub37_sub1.unlink(-1460969981);
					class298_sub37_sub1.method3402(-1671221720);
					((Class340) this).anInt3642 += (((Class298_Sub37_Sub1) class298_sub37_sub1).anInt9576);
				}
			} else if (((class298_sub37_sub1.aLong7406 += 1476940603538232441L) * -5533549728640346679L) > (long) i) {
				Class298_Sub37_Sub1_Sub2 class298_sub37_sub1_sub2 = (new Class298_Sub37_Sub1_Sub2((((Class298_Sub37_Sub1) class298_sub37_sub1).anInterface18_9575), class298_sub37_sub1.method3406(), (((Class298_Sub37_Sub1) class298_sub37_sub1).anInt9576)));
				((Class340) this).aClass437_3641.method5817(class298_sub37_sub1_sub2, class298_sub37_sub1.linkedKey * 7051297995265073167L);
				Class458.method5973(class298_sub37_sub1_sub2, class298_sub37_sub1, -1652592361);
				class298_sub37_sub1.unlink(-1460969981);
				class298_sub37_sub1.method3402(-1787171462);
			}
		}
	}

	public final void method4132() {
		((Class340) this).aClass461_3640.method5988(1635607496);
		((Class340) this).aClass437_3641.clear((byte) -95);
		((Class340) this).anInt3642 = ((Class340) this).anInt3639;
	}

	public final int method4133() {
		return ((Class340) this).anInt3639;
	}

	public final Object method4134(Interface18 interface18) {
		long l = interface18.method231();
		for (Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) ((Class340) this).aClass437_3641.get(l)); class298_sub37_sub1 != null; class298_sub37_sub1 = (Class298_Sub37_Sub1) ((Class340) this).aClass437_3641.nextInBucket(-1776975649)) {
			if (((Class298_Sub37_Sub1) class298_sub37_sub1).anInterface18_9575.method232(interface18)) {
				Object object = class298_sub37_sub1.method3406();
				if (object == null) {
					class298_sub37_sub1.unlink(-1460969981);
					class298_sub37_sub1.method3402(307674222);
					((Class340) this).anInt3642 += (((Class298_Sub37_Sub1) class298_sub37_sub1).anInt9576);
				} else {
					if (class298_sub37_sub1.method3407()) {
						Class298_Sub37_Sub1_Sub1 class298_sub37_sub1_sub1 = (new Class298_Sub37_Sub1_Sub1(interface18, object, (((Class298_Sub37_Sub1) class298_sub37_sub1).anInt9576)));
						((Class340) this).aClass437_3641.method5817(class298_sub37_sub1_sub1, (class298_sub37_sub1.linkedKey * 7051297995265073167L));
						((Class340) this).aClass461_3640.method5982(class298_sub37_sub1_sub1, (byte) -106);
						class298_sub37_sub1_sub1.aLong7406 = 0L;
						class298_sub37_sub1.unlink(-1460969981);
						class298_sub37_sub1.method3402(-869627360);
					} else {
						((Class340) this).aClass461_3640.method5982(class298_sub37_sub1, (byte) -38);
						class298_sub37_sub1.aLong7406 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	public Class340(int i) {
		((Class340) this).anInt3639 = i;
		((Class340) this).anInt3642 = i;
		int i_0_;
		for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
			/* empty */
		}
		((Class340) this).aClass437_3641 = new HashTable(i_0_);
	}

	public final int method4135() {
		return ((Class340) this).anInt3642;
	}

	public final void method4136() {
		for (Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) ((Class340) this).aClass461_3640.method5984(707727981)); class298_sub37_sub1 != null; class298_sub37_sub1 = ((Class298_Sub37_Sub1) ((Class340) this).aClass461_3640.method5985(590574136))) {
			if (class298_sub37_sub1.method3407()) {
				class298_sub37_sub1.unlink(-1460969981);
				class298_sub37_sub1.method3402(243040905);
				((Class340) this).anInt3642 += ((Class298_Sub37_Sub1) class298_sub37_sub1).anInt9576;
			}
		}
	}
}
