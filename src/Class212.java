/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class212 {
	Class477 aClass477_2675 = new Class477();
	int anInt2676;
	Class465 aClass465_2677;
	int anInt2678;

	public final int method3632() {
		return ((Class212) this).anInt2678;
	}

	public final void method3633(Object object, Interface18 interface18) {
		method3637(object, interface18, 1);
	}

	final void method3634(Interface18 interface18) {
		long l = interface18.method130();
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7754(l)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7747(-2008700188)) {
			if (((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607.method131(interface18)) {
				method3635(class282_sub50_sub8);
				break;
			}
		}
	}

	final void method3635(Class282_Sub50_Sub8 class282_sub50_sub8) {
		if (class282_sub50_sub8 != null) {
			class282_sub50_sub8.method4991(-371378792);
			class282_sub50_sub8.method13452((byte) -5);
			((Class212) this).anInt2676 += ((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606;
		}
	}

	final void method3636(Class282_Sub50_Sub8 class282_sub50_sub8) {
		if (class282_sub50_sub8 != null) {
			class282_sub50_sub8.method4991(-371378792);
			class282_sub50_sub8.method13452((byte) -5);
			((Class212) this).anInt2676 += ((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606;
		}
	}

	final void method3637(Object object, Interface18 interface18, int i) {
		if (i > ((Class212) this).anInt2678)
			throw new IllegalStateException();
		method3634(interface18);
		((Class212) this).anInt2676 -= i;
		while (((Class212) this).anInt2676 < 0) {
			Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7937(712410989));
			method3635(class282_sub50_sub8);
		}
		Class282_Sub50_Sub8_Sub1 class282_sub50_sub8_sub1 = new Class282_Sub50_Sub8_Sub1(interface18, object, i);
		((Class212) this).aClass465_2677.method7765(class282_sub50_sub8_sub1, interface18.method130());
		((Class212) this).aClass477_2675.method7936(class282_sub50_sub8_sub1, -1738910950);
		class282_sub50_sub8_sub1.aLong8120 = 0L;
	}

	public Class212(int i) {
		((Class212) this).anInt2678 = i;
		((Class212) this).anInt2676 = i;
		int i_0_;
		for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
			/* empty */
		}
		((Class212) this).aClass465_2677 = new Class465(i_0_);
	}

	public final void method3638() {
		((Class212) this).aClass477_2675.method7935((byte) -18);
		((Class212) this).aClass465_2677.method7749(-882413888);
		((Class212) this).anInt2676 = ((Class212) this).anInt2678;
	}

	public final void method3639(int i) {
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7941((byte) 4)); class282_sub50_sub8 != null; class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7955(450272970))) {
			if (class282_sub50_sub8.method14865()) {
				if (class282_sub50_sub8.method14860() == null) {
					class282_sub50_sub8.method4991(-371378792);
					class282_sub50_sub8.method13452((byte) -5);
					((Class212) this).anInt2676 += (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606);
				}
			} else if (((class282_sub50_sub8.aLong8120 += 5418180015864004923L) * -7883876913471066125L) > (long) i) {
				Class282_Sub50_Sub8_Sub2 class282_sub50_sub8_sub2 = (new Class282_Sub50_Sub8_Sub2((((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607), class282_sub50_sub8.method14860(), (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606)));
				((Class212) this).aClass465_2677.method7765(class282_sub50_sub8_sub2, class282_sub50_sub8.aLong3379 * -3442165056282524525L);
				Class224.method3782(class282_sub50_sub8_sub2, class282_sub50_sub8, -1476316652);
				class282_sub50_sub8.method4991(-371378792);
				class282_sub50_sub8.method13452((byte) -5);
			}
		}
	}

	public final int method3640() {
		return ((Class212) this).anInt2676;
	}

	public final void method3641() {
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7941((byte) 4)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7955(-1434558615)) {
			if (class282_sub50_sub8.method14865()) {
				class282_sub50_sub8.method4991(-371378792);
				class282_sub50_sub8.method13452((byte) -5);
				((Class212) this).anInt2676 += ((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606;
			}
		}
	}

	public final Object method3642(Interface18 interface18) {
		long l = interface18.method130();
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7754(l)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7747(-1328354286)) {
			if (((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607.method131(interface18)) {
				Object object = class282_sub50_sub8.method14860();
				if (object == null) {
					class282_sub50_sub8.method4991(-371378792);
					class282_sub50_sub8.method13452((byte) -5);
					((Class212) this).anInt2676 += (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606);
				} else {
					if (class282_sub50_sub8.method14865()) {
						Class282_Sub50_Sub8_Sub1 class282_sub50_sub8_sub1 = (new Class282_Sub50_Sub8_Sub1(interface18, object, (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606)));
						((Class212) this).aClass465_2677.method7765(class282_sub50_sub8_sub1, (class282_sub50_sub8.aLong3379 * -3442165056282524525L));
						((Class212) this).aClass477_2675.method7936(class282_sub50_sub8_sub1, -1738910950);
						class282_sub50_sub8_sub1.aLong8120 = 0L;
						class282_sub50_sub8.method4991(-371378792);
						class282_sub50_sub8.method13452((byte) -5);
					} else {
						((Class212) this).aClass477_2675.method7936(class282_sub50_sub8, -1738910950);
						class282_sub50_sub8.aLong8120 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	final void method3643(Interface18 interface18) {
		long l = interface18.method130();
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7754(l)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7747(-1256939589)) {
			if (((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607.method131(interface18)) {
				method3635(class282_sub50_sub8);
				break;
			}
		}
	}

	public final void method3644(Object object, Interface18 interface18) {
		method3637(object, interface18, 1);
	}

	final void method3645(Interface18 interface18) {
		long l = interface18.method130();
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7754(l)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7747(-1982835376)) {
			if (((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607.method131(interface18)) {
				method3635(class282_sub50_sub8);
				break;
			}
		}
	}

	public final void method3646(int i) {
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7941((byte) 4)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7955(-1236462346)) {
			if (class282_sub50_sub8.method14865()) {
				if (class282_sub50_sub8.method14860() == null) {
					class282_sub50_sub8.method4991(-371378792);
					class282_sub50_sub8.method13452((byte) -5);
					((Class212) this).anInt2676 += (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606);
				}
			} else if (((class282_sub50_sub8.aLong8120 += 5418180015864004923L) * -7883876913471066125L) > (long) i) {
				Class282_Sub50_Sub8_Sub2 class282_sub50_sub8_sub2 = (new Class282_Sub50_Sub8_Sub2((((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607), class282_sub50_sub8.method14860(), (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606)));
				((Class212) this).aClass465_2677.method7765(class282_sub50_sub8_sub2, class282_sub50_sub8.aLong3379 * -3442165056282524525L);
				Class224.method3782(class282_sub50_sub8_sub2, class282_sub50_sub8, -1365898899);
				class282_sub50_sub8.method4991(-371378792);
				class282_sub50_sub8.method13452((byte) -5);
			}
		}
	}

	final void method3647(Class282_Sub50_Sub8 class282_sub50_sub8) {
		if (class282_sub50_sub8 != null) {
			class282_sub50_sub8.method4991(-371378792);
			class282_sub50_sub8.method13452((byte) -5);
			((Class212) this).anInt2676 += ((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606;
		}
	}

	final void method3648(Class282_Sub50_Sub8 class282_sub50_sub8) {
		if (class282_sub50_sub8 != null) {
			class282_sub50_sub8.method4991(-371378792);
			class282_sub50_sub8.method13452((byte) -5);
			((Class212) this).anInt2676 += ((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606;
		}
	}

	public final void method3649(Object object, Interface18 interface18) {
		method3637(object, interface18, 1);
	}

	public final void method3650(Object object, Interface18 interface18) {
		method3637(object, interface18, 1);
	}

	public final void method3651() {
		((Class212) this).aClass477_2675.method7935((byte) 51);
		((Class212) this).aClass465_2677.method7749(1347410687);
		((Class212) this).anInt2676 = ((Class212) this).anInt2678;
	}

	public final void method3652(Object object, Interface18 interface18) {
		method3637(object, interface18, 1);
	}

	public final void method3653(int i) {
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7941((byte) 4)); class282_sub50_sub8 != null; class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7955(253507392))) {
			if (class282_sub50_sub8.method14865()) {
				if (class282_sub50_sub8.method14860() == null) {
					class282_sub50_sub8.method4991(-371378792);
					class282_sub50_sub8.method13452((byte) -5);
					((Class212) this).anInt2676 += (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606);
				}
			} else if (((class282_sub50_sub8.aLong8120 += 5418180015864004923L) * -7883876913471066125L) > (long) i) {
				Class282_Sub50_Sub8_Sub2 class282_sub50_sub8_sub2 = (new Class282_Sub50_Sub8_Sub2((((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607), class282_sub50_sub8.method14860(), (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606)));
				((Class212) this).aClass465_2677.method7765(class282_sub50_sub8_sub2, class282_sub50_sub8.aLong3379 * -3442165056282524525L);
				Class224.method3782(class282_sub50_sub8_sub2, class282_sub50_sub8, -1302861130);
				class282_sub50_sub8.method4991(-371378792);
				class282_sub50_sub8.method13452((byte) -5);
			}
		}
	}

	public final Object method3654(Interface18 interface18) {
		long l = interface18.method130();
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7754(l)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7747(-1822367147)) {
			if (((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607.method131(interface18)) {
				Object object = class282_sub50_sub8.method14860();
				if (object == null) {
					class282_sub50_sub8.method4991(-371378792);
					class282_sub50_sub8.method13452((byte) -5);
					((Class212) this).anInt2676 += (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606);
				} else {
					if (class282_sub50_sub8.method14865()) {
						Class282_Sub50_Sub8_Sub1 class282_sub50_sub8_sub1 = (new Class282_Sub50_Sub8_Sub1(interface18, object, (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606)));
						((Class212) this).aClass465_2677.method7765(class282_sub50_sub8_sub1, (class282_sub50_sub8.aLong3379 * -3442165056282524525L));
						((Class212) this).aClass477_2675.method7936(class282_sub50_sub8_sub1, -1738910950);
						class282_sub50_sub8_sub1.aLong8120 = 0L;
						class282_sub50_sub8.method4991(-371378792);
						class282_sub50_sub8.method13452((byte) -5);
					} else {
						((Class212) this).aClass477_2675.method7936(class282_sub50_sub8, -1738910950);
						class282_sub50_sub8.aLong8120 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	public final void method3655(int i) {
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7941((byte) 4)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7955(-1677052240)) {
			if (class282_sub50_sub8.method14865()) {
				if (class282_sub50_sub8.method14860() == null) {
					class282_sub50_sub8.method4991(-371378792);
					class282_sub50_sub8.method13452((byte) -5);
					((Class212) this).anInt2676 += (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606);
				}
			} else if (((class282_sub50_sub8.aLong8120 += 5418180015864004923L) * -7883876913471066125L) > (long) i) {
				Class282_Sub50_Sub8_Sub2 class282_sub50_sub8_sub2 = (new Class282_Sub50_Sub8_Sub2((((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607), class282_sub50_sub8.method14860(), (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606)));
				((Class212) this).aClass465_2677.method7765(class282_sub50_sub8_sub2, class282_sub50_sub8.aLong3379 * -3442165056282524525L);
				Class224.method3782(class282_sub50_sub8_sub2, class282_sub50_sub8, -1685695951);
				class282_sub50_sub8.method4991(-371378792);
				class282_sub50_sub8.method13452((byte) -5);
			}
		}
	}

	public final void method3656(int i) {
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7941((byte) 4)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7955(-2018861671)) {
			if (class282_sub50_sub8.method14865()) {
				if (class282_sub50_sub8.method14860() == null) {
					class282_sub50_sub8.method4991(-371378792);
					class282_sub50_sub8.method13452((byte) -5);
					((Class212) this).anInt2676 += (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606);
				}
			} else if (((class282_sub50_sub8.aLong8120 += 5418180015864004923L) * -7883876913471066125L) > (long) i) {
				Class282_Sub50_Sub8_Sub2 class282_sub50_sub8_sub2 = (new Class282_Sub50_Sub8_Sub2((((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607), class282_sub50_sub8.method14860(), (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606)));
				((Class212) this).aClass465_2677.method7765(class282_sub50_sub8_sub2, class282_sub50_sub8.aLong3379 * -3442165056282524525L);
				Class224.method3782(class282_sub50_sub8_sub2, class282_sub50_sub8, -1505196005);
				class282_sub50_sub8.method4991(-371378792);
				class282_sub50_sub8.method13452((byte) -5);
			}
		}
	}

	public final void method3657(int i) {
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7941((byte) 4)); class282_sub50_sub8 != null; class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass477_2675.method7955(-587645061))) {
			if (class282_sub50_sub8.method14865()) {
				if (class282_sub50_sub8.method14860() == null) {
					class282_sub50_sub8.method4991(-371378792);
					class282_sub50_sub8.method13452((byte) -5);
					((Class212) this).anInt2676 += (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606);
				}
			} else if (((class282_sub50_sub8.aLong8120 += 5418180015864004923L) * -7883876913471066125L) > (long) i) {
				Class282_Sub50_Sub8_Sub2 class282_sub50_sub8_sub2 = (new Class282_Sub50_Sub8_Sub2((((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607), class282_sub50_sub8.method14860(), (((Class282_Sub50_Sub8) class282_sub50_sub8).anInt9606)));
				((Class212) this).aClass465_2677.method7765(class282_sub50_sub8_sub2, class282_sub50_sub8.aLong3379 * -3442165056282524525L);
				Class224.method3782(class282_sub50_sub8_sub2, class282_sub50_sub8, -1773320520);
				class282_sub50_sub8.method4991(-371378792);
				class282_sub50_sub8.method13452((byte) -5);
			}
		}
	}

	public final void method3658() {
		((Class212) this).aClass477_2675.method7935((byte) 59);
		((Class212) this).aClass465_2677.method7749(-906298268);
		((Class212) this).anInt2676 = ((Class212) this).anInt2678;
	}

	public final void method3659() {
		((Class212) this).aClass477_2675.method7935((byte) -30);
		((Class212) this).aClass465_2677.method7749(-502005796);
		((Class212) this).anInt2676 = ((Class212) this).anInt2678;
	}

	final void method3660(Interface18 interface18) {
		long l = interface18.method130();
		for (Class282_Sub50_Sub8 class282_sub50_sub8 = ((Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7754(l)); class282_sub50_sub8 != null; class282_sub50_sub8 = (Class282_Sub50_Sub8) ((Class212) this).aClass465_2677.method7747(-1375098309)) {
			if (((Class282_Sub50_Sub8) class282_sub50_sub8).anInterface18_9607.method131(interface18)) {
				method3635(class282_sub50_sub8);
				break;
			}
		}
	}
}
