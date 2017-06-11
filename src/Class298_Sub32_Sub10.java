/* Class298_Sub32_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub10 extends Class298_Sub32 {
	int anInt9390;
	int anInt9391;
	int anInt9392;

	void method3195(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			method3196(class298_sub53.read24BitUnsignedInteger((byte) 100), -184590167);
		}
	}

	Class298_Sub32_Sub10(int i) {
		super(0, false);
		method3196(i, 208799873);
	}

	int[][] method3132(int i, byte i_0_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 58);
			if (aClass239_7380.aBoolean2607) {
				int[] is_1_ = is[0];
				int[] is_2_ = is[1];
				int[] is_3_ = is[2];
				for (int i_4_ = 0; i_4_ < -1474554145 * Class250.anInt2755; i_4_++) {
					is_1_[i_4_] = (((Class298_Sub32_Sub10) this).anInt9392 * -1444969569);
					is_2_[i_4_] = (-1731491595 * ((Class298_Sub32_Sub10) this).anInt9391);
					is_3_[i_4_] = 1572419441 * ((Class298_Sub32_Sub10) this).anInt9390;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agx.k(").append(')').toString());
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_5_) {
		try {
			switch (i) {
			case 0:
				method3196(class298_sub53.read24BitUnsignedInteger((byte) -79), -1376773689);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agx.r(").append(')').toString());
		}
	}

	void method3196(int i, int i_6_) {
		try {
			((Class298_Sub32_Sub10) this).anInt9390 = 1499376017 * ((i & 0xff) << 4);
			((Class298_Sub32_Sub10) this).anInt9391 = ((i & 0xff00) >> 4) * 1785127773;
			((Class298_Sub32_Sub10) this).anInt9392 = 1090574431 * ((i & 0xff0000) >> 12);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agx.ac(").append(')').toString());
		}
	}

	void method3197(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			method3196(class298_sub53.read24BitUnsignedInteger((byte) -45), 593056600);
		}
	}

	public Class298_Sub32_Sub10() {
		this(0);
	}

	int[][] method3198(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 71);
		if (aClass239_7380.aBoolean2607) {
			int[] is_7_ = is[0];
			int[] is_8_ = is[1];
			int[] is_9_ = is[2];
			for (int i_10_ = 0; i_10_ < -1474554145 * Class250.anInt2755; i_10_++) {
				is_7_[i_10_] = ((Class298_Sub32_Sub10) this).anInt9392 * -1444969569;
				is_8_[i_10_] = -1731491595 * ((Class298_Sub32_Sub10) this).anInt9391;
				is_9_[i_10_] = 1572419441 * ((Class298_Sub32_Sub10) this).anInt9390;
			}
		}
		return is;
	}

	int[][] method3199(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 96);
		if (aClass239_7380.aBoolean2607) {
			int[] is_11_ = is[0];
			int[] is_12_ = is[1];
			int[] is_13_ = is[2];
			for (int i_14_ = 0; i_14_ < -1474554145 * Class250.anInt2755; i_14_++) {
				is_11_[i_14_] = ((Class298_Sub32_Sub10) this).anInt9392 * -1444969569;
				is_12_[i_14_] = -1731491595 * ((Class298_Sub32_Sub10) this).anInt9391;
				is_13_[i_14_] = 1572419441 * ((Class298_Sub32_Sub10) this).anInt9390;
			}
		}
		return is;
	}

	public static void method3200(Class95 class95, int i, int i_15_) {
		try {
			Class79.aClass298_Sub19_Sub1_737.method2959((byte) 62);
			Class298_Sub19_Sub1 class298_sub19_sub1 = class95.method1028(47610786);
			if (class298_sub19_sub1 != null) {
				Class79.aClass284_738.method2689(1423546726);
				Class79.aClass298_Sub19_Sub1_737 = class298_sub19_sub1;
				Class79.aClass298_Sub19_Sub1_737.method2958(class95.method1027(-1730334000), false, (byte) 90);
				Class79.aClass298_Sub19_Sub1_737.method2961(i, 1926330524);
				if (Class79.aClass284_738 != null)
					Class79.aClass284_738.method2679(Class79.aClass298_Sub19_Sub1_737, 1556269790);
				Class11.method329(-659623615);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agx.h(").append(')').toString());
		}
	}
}
