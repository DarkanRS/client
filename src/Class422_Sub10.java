/* Class422_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class422_Sub10 extends Class422 {
	static int anInt8391 = 2;
	static int anInt8392 = 0;

	public Class422_Sub10(Class298_Sub48 class298_sub48) {
		super(class298_sub48);
	}

	public void method5659(int i) {
		try {
			if (anInt5350 * -1598873795 < 0 || -1598873795 * anInt5350 > 2)
				anInt5350 = method5611(-857466843) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adl.s(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adl.a(").append(')').toString());
		}
	}

	public boolean method5660(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adl.z(").append(')').toString());
		}
	}

	public int method5661(byte i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adl.y(").append(')').toString());
		}
	}

	public int method5612(int i, int i_0_) {
		try {
			if (i == 2)
				return 2;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adl.f(").append(')').toString());
		}
	}

	public Class422_Sub10(int i, Class298_Sub48 class298_sub48) {
		super(i, class298_sub48);
	}

	int method5615() {
		return 0;
	}

	public int method5616(int i) {
		if (i == 2)
			return 2;
		return 1;
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adl.p(").append(')').toString());
		}
	}

	static void method5662(GraphicsToolkit class_ra, int i, int i_2_, IComponentDefinition class105, Class_ta class_ta, int i_3_, int i_4_, int i_5_) {
		try {
			for (int i_6_ = 0; i_6_ < client.anInt8703 * -1230451913; i_6_++) {
				Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) client.anIntArray8699[i_6_]));
				if (class298_sub29 != null) {
					NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
					if (class365_sub1_sub1_sub2_sub1.method4457(1140952765) && ((Class287.myPlayer.plane) == class365_sub1_sub1_sub2_sub1.plane)) {
						SomethingDefinitions class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
						if (null != class503 && class503.anIntArray6188 != null)
							class503 = class503.method6240(Class128.aClass148_6331, 1665436225);
						if (null != class503 && class503.aBoolean6148 && class503.aBoolean6163) {
							Class217 class217 = (class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599);
							int i_7_ = (int) class217.aFloat2451 / 128 - i / 128;
							int i_8_ = (int) class217.aFloat2454 / 128 - i_2_ / 128;
							if (-1 != -1362115471 * class503.anInt6186)
								Class248.method2389(class_ra, class_ta, class105, i_3_, i_4_, i_7_, i_8_, (-1362115471 * class503.anInt6186), (byte) 0);
							else
								Class443.method5883(class105, class_ta, i_3_, i_4_, i_7_, i_8_, (SubIncommingPacket.aClass57Array2349[1]), (byte) -17);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adl.q(").append(')').toString());
		}
	}

	public static Class57 method5663(Class243 class243, int i, byte i_9_) {
		try {
			Class57 class57 = (Class57) Class229.aClass348_6452.method4184((long) i);
			if (null == class57) {
				if (Class230.aBoolean2567)
					class57 = (Class373.aClass_ra4071.method5125(Class89.method979(class243, i), true));
				else
					class57 = Class223.method2081(class243.method2294(i, (byte) 15), -161656424);
				Class229.aClass348_6452.method4194(class57, (long) i);
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adl.f(").append(')').toString());
		}
	}

	static final void method5664(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -2000354906) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1277 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adl.na(").append(')').toString());
		}
	}
}
