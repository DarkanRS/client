package com.jagex;

public class Class212 {

	int anInt2676;
	Queue aClass477_2675 = new Queue();
	int anInt2678;
	IterableNodeMap aClass465_2677;

	public Class212() {
		anInt2678 = 250;
		anInt2676 = 250;

		int i_2;
		for (i_2 = 1; i_2 + i_2 < 250; i_2 += i_2) {
		}

		aClass465_2677 = new IterableNodeMap(i_2);
	}

	public int method3632() {
		return anInt2678;
	}

	void method3634(Interface18 interface18_1) {
		long long_2 = interface18_1.method130();

		for (CacheableNode_Sub8 class282_sub50_sub8_4 = (CacheableNode_Sub8) aClass465_2677.get(long_2); class282_sub50_sub8_4 != null; class282_sub50_sub8_4 = (CacheableNode_Sub8) aClass465_2677.method7747())
			if (class282_sub50_sub8_4.anInterface18_9607.method131(interface18_1)) {
				method3635(class282_sub50_sub8_4);
				break;
			}

	}

	void method3635(CacheableNode_Sub8 class282_sub50_sub8_1) {
		if (class282_sub50_sub8_1 != null) {
			class282_sub50_sub8_1.unlink();
			class282_sub50_sub8_1.method13452();
			anInt2676 += class282_sub50_sub8_1.anInt9606;
		}

	}

	void method3637(NativeSprite object_1, Interface18 interface18_2) {
		if (anInt2678 < 1)
			throw new IllegalStateException();
		method3634(interface18_2);
		anInt2676 -= 1;

		while (anInt2676 < 0) {
			CacheableNode_Sub8 class282_sub50_sub8_4 = (CacheableNode_Sub8) aClass477_2675.method7937();
			method3635(class282_sub50_sub8_4);
		}

		CacheableNode_Sub8_Sub1 class282_sub50_sub8_sub1_5 = new CacheableNode_Sub8_Sub1(interface18_2, object_1, 1);
		aClass465_2677.put(class282_sub50_sub8_sub1_5, interface18_2.method130());
		aClass477_2675.add(class282_sub50_sub8_sub1_5);
		class282_sub50_sub8_sub1_5.key = 0L;
	}

	public void method3638() {
		aClass477_2675.method7935();
		aClass465_2677.method7749();
		anInt2676 = anInt2678;
	}

	public void method3639() {
		for (CacheableNode_Sub8 class282_sub50_sub8_2 = (CacheableNode_Sub8) aClass477_2675.method7941(); class282_sub50_sub8_2 != null; class282_sub50_sub8_2 = (CacheableNode_Sub8) aClass477_2675.method7955())
			if (class282_sub50_sub8_2.method14865()) {
				if (class282_sub50_sub8_2.method14860() == null) {
					class282_sub50_sub8_2.unlink();
					class282_sub50_sub8_2.method13452();
					anInt2676 += class282_sub50_sub8_2.anInt9606;
				}
			} else if (++class282_sub50_sub8_2.key > 5) {
				CacheableNode_Sub8_Sub2 class282_sub50_sub8_sub2_3 = new CacheableNode_Sub8_Sub2(class282_sub50_sub8_2.anInterface18_9607, class282_sub50_sub8_2.method14860(), class282_sub50_sub8_2.anInt9606);
				aClass465_2677.put(class282_sub50_sub8_sub2_3, class282_sub50_sub8_2.pointer);
				RouteStrategies.method3782(class282_sub50_sub8_sub2_3, class282_sub50_sub8_2);
				class282_sub50_sub8_2.unlink();
				class282_sub50_sub8_2.method13452();
			}

	}

	public int method3640() {
		return anInt2676;
	}

	public void method3641() {
		for (CacheableNode_Sub8 class282_sub50_sub8_1 = (CacheableNode_Sub8) aClass477_2675.method7941(); class282_sub50_sub8_1 != null; class282_sub50_sub8_1 = (CacheableNode_Sub8) aClass477_2675.method7955())
			if (class282_sub50_sub8_1.method14865()) {
				class282_sub50_sub8_1.unlink();
				class282_sub50_sub8_1.method13452();
				anInt2676 += class282_sub50_sub8_1.anInt9606;
			}

	}

	public void method3644(NativeSprite object_1, Interface18 interface18_2) {
		method3637(object_1, interface18_2);
	}

	public NativeSprite method3654(Interface18 interface18_1) {
		long long_2 = interface18_1.method130();

		for (CacheableNode_Sub8 class282_sub50_sub8_4 = (CacheableNode_Sub8) aClass465_2677.get(long_2); class282_sub50_sub8_4 != null; class282_sub50_sub8_4 = (CacheableNode_Sub8) aClass465_2677.method7747())
			if (class282_sub50_sub8_4.anInterface18_9607.method131(interface18_1)) {
				NativeSprite object_5 = class282_sub50_sub8_4.method14860();
				if (object_5 != null) {
					if (class282_sub50_sub8_4.method14865()) {
						CacheableNode_Sub8_Sub1 class282_sub50_sub8_sub1_6 = new CacheableNode_Sub8_Sub1(interface18_1, object_5, class282_sub50_sub8_4.anInt9606);
						aClass465_2677.put(class282_sub50_sub8_sub1_6, class282_sub50_sub8_4.pointer);
						aClass477_2675.add(class282_sub50_sub8_sub1_6);
						class282_sub50_sub8_sub1_6.key = 0L;
						class282_sub50_sub8_4.unlink();
						class282_sub50_sub8_4.method13452();
					} else {
						aClass477_2675.add(class282_sub50_sub8_4);
						class282_sub50_sub8_4.key = 0L;
					}

					return object_5;
				}

				class282_sub50_sub8_4.unlink();
				class282_sub50_sub8_4.method13452();
				anInt2676 += class282_sub50_sub8_4.anInt9606;
			}

		return null;
	}

}
