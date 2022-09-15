package com.jagex;

public class Class156 {

	static int anInt1972;
	static boolean aBool1970;
	static NodeCollection aClass482_1971 = new NodeCollection();

	static synchronized void method2642(Interface40 interface40_0) {
		if (!aBool1970)
			if (anInt1972 > 0) {
				ObjectNode class282_sub47_2 = new ObjectNode(interface40_0);
				aClass482_1971.append(class282_sub47_2);
			} else
				interface40_0.ma(false);

	}

	static synchronized void method2643() {
		++anInt1972;
	}

	static synchronized void method2644() {
		--anInt1972;
		if (anInt1972 == 0)
			method2652();

	}

	public static synchronized void method2645() {
		aBool1970 = true;
	}

	static synchronized void method2652() {
		while (true) {
			ObjectNode class282_sub47_1 = (ObjectNode) aClass482_1971.popHead();

			if (class282_sub47_1 == null)
				return;

			((Interface40) class282_sub47_1.anObject8068).ma(true);
			class282_sub47_1.unlink();
		}
	}

	Class156() throws Throwable {
		throw new Error();
	}

}
