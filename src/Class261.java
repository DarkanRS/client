/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class261 implements Comparable {
	long aLong2821;
	Object anObject2822;
	long aLong2823;
	Object anObject2824;
	static int anInt2825;

	int method2462(Class261 class261_0_, int i) {
		try {
			if (-547428082756159857L * ((Class261) this).aLong2821 < -547428082756159857L * ((Class261) class261_0_).aLong2821)
				return -1;
			if (-547428082756159857L * ((Class261) this).aLong2821 > -547428082756159857L * ((Class261) class261_0_).aLong2821)
				return 1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kx.a(").append(')').toString());
		}
	}

	public int compareTo(Object object) {
		try {
			return method2462((Class261) object, -1964859807);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kx.compareTo(").append(')').toString());
		}
	}

	Class261(Object object, Object object_1_) {
		((Class261) this).anObject2822 = object;
		((Class261) this).anObject2824 = object_1_;
	}

	public boolean equals(Object object) {
		try {
			if (object instanceof Class261)
				return ((Class261) this).anObject2824.equals(((Class261) (Class261) object).anObject2824);
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kx.equals(").append(')').toString());
		}
	}

	static final void method2463(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -209664788) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1120 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kx.lv(").append(')').toString());
		}
	}

	static final void method2464(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) 52);
			Class119 class119 = Class389.aClass119Array4165[i_2_ >> 16];
			Class118.method1288(class105, class119, class403, -1603621953);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kx.km(").append(')').toString());
		}
	}

	public static boolean method2465(int i, int i_3_) {
		try {
			return i == 1 || i == 3 || i == 5;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kx.b(").append(')').toString());
		}
	}
}
