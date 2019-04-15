public class Class156 {

	static int anInt1972 = 0;
	static boolean aBool1970 = false;
	static NodeCollection aClass482_1971 = new NodeCollection();

	static synchronized void method2642(Interface40 interface40_0, byte b_1) {
		if (!aBool1970) {
			if (anInt1972 > 0) {
				StringNode class282_sub47_2 = new StringNode(interface40_0);
				aClass482_1971.append(class282_sub47_2);
			} else {
				interface40_0.ma(false);
			}
		}

	}

	static synchronized void method2643() {
		++anInt1972;
	}

	static synchronized void method2644(int i_0) {
		--anInt1972;
		if (anInt1972 == 0) {
			method2652((byte) -6);
		}

	}

	public static synchronized void method2645() {
		aBool1970 = true;
	}

	static synchronized void method2652(byte b_0) {
		while (true) {
			StringNode class282_sub47_1 = (StringNode) aClass482_1971.popHead((byte) -94);
			if (class282_sub47_1 == null) {
				return;
			}

			((Interface40) class282_sub47_1.anObject8068).ma(true);
			class282_sub47_1.remove();
		}
	}

	Class156() throws Throwable {
		throw new Error();
	}

}
