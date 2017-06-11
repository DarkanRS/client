/* Class298_Sub32_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub27 extends Class298_Sub32 {
	int anInt9497 = -1723691008;
	static int anInt9498 = 4096;

	public Class298_Sub32_Sub27() {
		this(4096);
	}

	Class298_Sub32_Sub27(int i) {
		super(0, true);
		((Class298_Sub32_Sub27) this).anInt9497 = 1128895529 * i;
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1924979282);
			if (aClass257_7384.aBoolean2810)
				Class425.method5740(is, 0, -1474554145 * Class250.anInt2755, (((Class298_Sub32_Sub27) this).anInt9497 * -945993703));
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahp.i(").append(')').toString());
		}
	}

	int[] method3308(int i) {
		int[] is = aClass257_7384.method2448(i, 124151848);
		if (aClass257_7384.aBoolean2810)
			Class425.method5740(is, 0, -1474554145 * Class250.anInt2755, (((Class298_Sub32_Sub27) this).anInt9497 * -945993703));
		return is;
	}

	int[] method3309(int i) {
		int[] is = aClass257_7384.method2448(i, 1124955877);
		if (aClass257_7384.aBoolean2810)
			Class425.method5740(is, 0, -1474554145 * Class250.anInt2755, (((Class298_Sub32_Sub27) this).anInt9497 * -945993703));
		return is;
	}

	void method3310(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub27) this).anInt9497 = ((class298_sub53.readUnsignedByte() << 12) / 255 * 1128895529);
		}
	}

	void method3311(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub27) this).anInt9497 = ((class298_sub53.readUnsignedByte() << 12) / 255 * 1128895529);
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_1_) {
		try {
			switch (i) {
			case 0:
				((Class298_Sub32_Sub27) this).anInt9497 = ((class298_sub53.readUnsignedByte() << 12) / 255 * 1128895529);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahp.r(").append(')').toString());
		}
	}
}
