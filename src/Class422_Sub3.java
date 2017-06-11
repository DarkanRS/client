/* Class422_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class422_Sub3 extends Class422 {
	public static int anInt8370 = 0;
	public static int anInt8371 = 1;
	static int[] anIntArray8372;

	public Class422_Sub3(int i, Class298_Sub48 class298_sub48) {
		super(i, class298_sub48);
	}

	public int method5616(int i) {
		if (0 != i && aClass298_Sub48_5346.aClass422_Sub10_7548.method5661((byte) 108) == 2)
			return 3;
		if (i == 0 || aClass298_Sub48_5346.aClass422_Sub28_7573.method5724(1875039574) == 1)
			return 1;
		return 2;
	}

	public boolean method5632(byte i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("add.z(").append(')').toString());
		}
	}

	public int method5612(int i, int i_0_) {
		try {
			if (0 != i && aClass298_Sub48_5346.aClass422_Sub10_7548.method5661((byte) 10) == 2)
				return 3;
			if (i == 0 || aClass298_Sub48_5346.aClass422_Sub28_7573.method5724(948081550) == 1)
				return 1;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("add.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("add.p(").append(')').toString());
		}
	}

	public int method5633(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("add.y(").append(')').toString());
		}
	}

	int method5615() {
		return 1;
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("add.a(").append(')').toString());
		}
	}

	public void method5634(byte i) {
		try {
			if (0 != anInt5350 * -1598873795 && aClass298_Sub48_5346.aClass422_Sub28_7573.method5724(1435565446) != 1)
				anInt5350 = 0;
			if (0 != anInt5350 * -1598873795 && aClass298_Sub48_5346.aClass422_Sub10_7548.method5661((byte) 20) == 2)
				anInt5350 = 0;
			if (-1598873795 * anInt5350 < 0 || -1598873795 * anInt5350 > 1)
				anInt5350 = method5611(-1720172189) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("add.s(").append(')').toString());
		}
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	public Class422_Sub3(Class298_Sub48 class298_sub48) {
		super(class298_sub48);
	}

	static final void method5635(int i) {
		try {
			int[] is = Class10.anIntArray135;
			for (int i_2_ = 0; i_2_ < Class10.anInt129 * 1168366243; i_2_++) {
				Player class365_sub1_sub1_sub2_sub2 = client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_2_]];
				if (class365_sub1_sub1_sub2_sub2 != null)
					class365_sub1_sub1_sub2_sub2.method4428(-586581534);
			}
			for (int i_3_ = 0; i_3_ < -1230451913 * client.anInt8703; i_3_++) {
				long l = (long) client.anIntArray8699[i_3_];
				Class298_Sub29 class298_sub29 = (Class298_Sub29) client.npcs.get(l);
				if (null == class298_sub29) {
					if (i == -1062447355)
						throw new IllegalStateException();
				} else
					((Entity) class298_sub29.anObject7366).method4428(1089221669);
			}
			if (0 == 1596783995 * client.anInt8724) {
				for (int i_4_ = 0; i_4_ < Class87.aClass94Array794.length; i_4_++) {
					Class94 class94 = Class87.aClass94Array794[i_4_];
					if (!class94.aBoolean912) {
						if (i == -1062447355) {
							/* empty */
						}
					} else
						class94.method1015(1581721425).method4428(390417691);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("add.gz(").append(')').toString());
		}
	}
}
