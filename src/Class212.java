public class Class212 {

	int anInt2676;
	Queue aClass477_2675 = new Queue();
	int anInt2678;
	IterableNodeMap aClass465_2677;

	public final int method3632() {
		return this.anInt2678;
	}

	final void method3634(Interface18 interface18_1) {
		long long_2 = interface18_1.method130();

		for (Class282_Sub50_Sub8 class282_sub50_sub8_4 = (Class282_Sub50_Sub8) this.aClass465_2677.get(long_2); class282_sub50_sub8_4 != null; class282_sub50_sub8_4 = (Class282_Sub50_Sub8) this.aClass465_2677.method7747(-2008700188)) {
			if (class282_sub50_sub8_4.anInterface18_9607.method131(interface18_1)) {
				this.method3635(class282_sub50_sub8_4);
				break;
			}
		}

	}

	final void method3635(Class282_Sub50_Sub8 class282_sub50_sub8_1) {
		if (class282_sub50_sub8_1 != null) {
			class282_sub50_sub8_1.remove();
			class282_sub50_sub8_1.method13452();
			this.anInt2676 += class282_sub50_sub8_1.anInt9606;
		}

	}

	final void method3637(Object object_1, Interface18 interface18_2) {
		if (1 > this.anInt2678) {
			throw new IllegalStateException();
		} else {
			this.method3634(interface18_2);
			this.anInt2676 -= 1;

			while (this.anInt2676 < 0) {
				Class282_Sub50_Sub8 class282_sub50_sub8_4 = (Class282_Sub50_Sub8) this.aClass477_2675.method7937(712410989);
				this.method3635(class282_sub50_sub8_4);
			}

			Class282_Sub50_Sub8_Sub1 class282_sub50_sub8_sub1_5 = new Class282_Sub50_Sub8_Sub1(interface18_2, object_1, 1);
			this.aClass465_2677.put(class282_sub50_sub8_sub1_5, interface18_2.method130());
			this.aClass477_2675.method7936(class282_sub50_sub8_sub1_5);
			class282_sub50_sub8_sub1_5.key = 0L;
		}
	}

	public Class212() {
		this.anInt2678 = 250;
		this.anInt2676 = 250;

		int i_2;
		for (i_2 = 1; i_2 + i_2 < 250; i_2 += i_2) {
			;
		}

		this.aClass465_2677 = new IterableNodeMap(i_2);
	}

	public final void method3638() {
		this.aClass477_2675.method7935((byte) -18);
		this.aClass465_2677.method7749(-882413888);
		this.anInt2676 = this.anInt2678;
	}

	public final void method3639() {
		for (Class282_Sub50_Sub8 class282_sub50_sub8_2 = (Class282_Sub50_Sub8) this.aClass477_2675.method7941(); class282_sub50_sub8_2 != null; class282_sub50_sub8_2 = (Class282_Sub50_Sub8) this.aClass477_2675.method7955(450272970)) {
			if (class282_sub50_sub8_2.method14865()) {
				if (class282_sub50_sub8_2.method14860() == null) {
					class282_sub50_sub8_2.remove();
					class282_sub50_sub8_2.method13452();
					this.anInt2676 += class282_sub50_sub8_2.anInt9606;
				}
			} else if (++class282_sub50_sub8_2.key > (long) 5) {
				Class282_Sub50_Sub8_Sub2 class282_sub50_sub8_sub2_3 = new Class282_Sub50_Sub8_Sub2(class282_sub50_sub8_2.anInterface18_9607, class282_sub50_sub8_2.method14860(), class282_sub50_sub8_2.anInt9606);
				this.aClass465_2677.put(class282_sub50_sub8_sub2_3, class282_sub50_sub8_2.data);
				Class224.method3782(class282_sub50_sub8_sub2_3, class282_sub50_sub8_2, -1476316652);
				class282_sub50_sub8_2.remove();
				class282_sub50_sub8_2.method13452();
			}
		}

	}

	public final int method3640() {
		return this.anInt2676;
	}

	public final void method3641() {
		for (Class282_Sub50_Sub8 class282_sub50_sub8_1 = (Class282_Sub50_Sub8) this.aClass477_2675.method7941(); class282_sub50_sub8_1 != null; class282_sub50_sub8_1 = (Class282_Sub50_Sub8) this.aClass477_2675.method7955(-1434558615)) {
			if (class282_sub50_sub8_1.method14865()) {
				class282_sub50_sub8_1.remove();
				class282_sub50_sub8_1.method13452();
				this.anInt2676 += class282_sub50_sub8_1.anInt9606;
			}
		}

	}

	public final void method3644(Object object_1, Interface18 interface18_2) {
		this.method3637(object_1, interface18_2);
	}

	public final Object method3654(Interface18 interface18_1) {
		long long_2 = interface18_1.method130();

		for (Class282_Sub50_Sub8 class282_sub50_sub8_4 = (Class282_Sub50_Sub8) this.aClass465_2677.get(long_2); class282_sub50_sub8_4 != null; class282_sub50_sub8_4 = (Class282_Sub50_Sub8) this.aClass465_2677.method7747(-1822367147)) {
			if (class282_sub50_sub8_4.anInterface18_9607.method131(interface18_1)) {
				Object object_5 = class282_sub50_sub8_4.method14860();
				if (object_5 != null) {
					if (class282_sub50_sub8_4.method14865()) {
						Class282_Sub50_Sub8_Sub1 class282_sub50_sub8_sub1_6 = new Class282_Sub50_Sub8_Sub1(interface18_1, object_5, class282_sub50_sub8_4.anInt9606);
						this.aClass465_2677.put(class282_sub50_sub8_sub1_6, class282_sub50_sub8_4.data);
						this.aClass477_2675.method7936(class282_sub50_sub8_sub1_6);
						class282_sub50_sub8_sub1_6.key = 0L;
						class282_sub50_sub8_4.remove();
						class282_sub50_sub8_4.method13452();
					} else {
						this.aClass477_2675.method7936(class282_sub50_sub8_4);
						class282_sub50_sub8_4.key = 0L;
					}

					return object_5;
				}

				class282_sub50_sub8_4.remove();
				class282_sub50_sub8_4.method13452();
				this.anInt2676 += class282_sub50_sub8_4.anInt9606;
			}
		}

		return null;
	}

}
