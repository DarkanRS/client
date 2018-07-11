/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class104 {
	static Class104 aClass104_1060;
	static Class104 aClass104_1061;
	static Class104 aClass104_1062;
	int id;
	public int chunkSize;
	
	static {
		aClass104_1061 = new Class104(0, 4);
		aClass104_1060 = new Class104(1, 5);
		aClass104_1062 = new Class104(2, 6);
	}

	static Class104[] method1793() {
		return (new Class104[] { aClass104_1062, aClass104_1061, aClass104_1060 });
	}

	Class104(int i, int i_0_) {
		((Class104) this).id = i * 2087113801;
		chunkSize = 1100556569 * i_0_;
	}

	static Class104[] method1794() {
		return (new Class104[] { aClass104_1062, aClass104_1061, aClass104_1060 });
	}

	public static Class104 method1795(int i) {
		Class104[] class104s = Class52_Sub2_Sub1.method15631(1580412859);
		for (int i_1_ = 0; i_1_ < class104s.length; i_1_++) {
			Class104 class104 = class104s[i_1_];
			if (-1544200711 * ((Class104) class104).id == i)
				return class104;
		}
		return null;
	}

	public static Class104 method1796(int i) {
		Class104[] class104s = Class52_Sub2_Sub1.method15631(1580412859);
		for (int i_2_ = 0; i_2_ < class104s.length; i_2_++) {
			Class104 class104 = class104s[i_2_];
			if (-1544200711 * ((Class104) class104).id == i)
				return class104;
		}
		return null;
	}

	public static Class104 method1797(int i) {
		Class104[] class104s = Class52_Sub2_Sub1.method15631(1580412859);
		for (int i_3_ = 0; i_3_ < class104s.length; i_3_++) {
			Class104 class104 = class104s[i_3_];
			if (-1544200711 * ((Class104) class104).id == i)
				return class104;
		}
		return null;
	}

	public static Class104 method1798(int i) {
		Class104[] class104s = Class52_Sub2_Sub1.method15631(1580412859);
		for (int i_4_ = 0; i_4_ < class104s.length; i_4_++) {
			Class104 class104 = class104s[i_4_];
			if (-1544200711 * ((Class104) class104).id == i)
				return class104;
		}
		return null;
	}

	static void method1799(CS2Executor class527, byte i) {
		class527.intStack[class527.intStackPtr * 1942118537 - 1] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[1942118537 * class527.intStackPtr - 1]), -1396181317).anInt2963) * 554241429;
	}

	static final void method1800(CS2Executor class527, int i) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.current.stringOpValues[class527.instrPtr * 301123709]);
	}

	static final void method1801(CS2Executor class527, int i) {
		Class520.method11160(GraphicalRenderer.method8697(1614050633), class527, 1060557669);
	}
}
