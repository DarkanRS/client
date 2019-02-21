
/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class477 implements Iterable {
	public CacheableNode aClass282_Sub50_5629 = new CacheableNode();
	static int anInt5630;
	CacheableNode aClass282_Sub50_5631;
	static Class539[] aClass539Array5632;

	public Iterator method7934() {
		return new Class469(this);
	}

	public void method7935(byte i) {
		while (aClass282_Sub50_5629.aClass282_Sub50_8119 != aClass282_Sub50_5629)
			aClass282_Sub50_5629.aClass282_Sub50_8119.method13452();
	}

	public void method7936(CacheableNode class282_sub50, int i) {
		if (class282_sub50.current != null)
			class282_sub50.method13452();
		class282_sub50.current = aClass282_Sub50_5629.current;
		class282_sub50.aClass282_Sub50_8119 = aClass282_Sub50_5629;
		class282_sub50.current.aClass282_Sub50_8119 = class282_sub50;
		class282_sub50.aClass282_Sub50_8119.current = class282_sub50;
	}

	public CacheableNode method7937(int i) {
		CacheableNode class282_sub50 = aClass282_Sub50_5629.aClass282_Sub50_8119;
		if (class282_sub50 == aClass282_Sub50_5629)
			return null;
		class282_sub50.method13452();
		return class282_sub50;
	}

	public CacheableNode method7938() {
		return method7946(null, -508721714);
	}

	public int method7939(int i) {
		int i_0_ = 0;
		for (CacheableNode class282_sub50 = aClass282_Sub50_5629.aClass282_Sub50_8119; aClass282_Sub50_5629 != class282_sub50; class282_sub50 = class282_sub50.aClass282_Sub50_8119)
			i_0_++;
		return i_0_;
	}

	public CacheableNode method7940() {
		CacheableNode class282_sub50 = aClass282_Sub50_5629.aClass282_Sub50_8119;
		if (class282_sub50 == aClass282_Sub50_5629)
			return null;
		class282_sub50.method13452();
		return class282_sub50;
	}

	public Class477() {
		aClass282_Sub50_5629.aClass282_Sub50_8119 = aClass282_Sub50_5629;
		aClass282_Sub50_5629.current = aClass282_Sub50_5629;
	}

	public CacheableNode method7941(byte i) {
		return method7946(null, -2037217557);
	}

	public Iterator method7942() {
		return new Class469(this);
	}

	public static void method7943(CacheableNode class282_sub50, CacheableNode class282_sub50_1_) {
		if (null != class282_sub50.current)
			class282_sub50.method13452();
		class282_sub50.current = class282_sub50_1_.current;
		class282_sub50.aClass282_Sub50_8119 = class282_sub50_1_;
		class282_sub50.current.aClass282_Sub50_8119 = class282_sub50;
		class282_sub50.aClass282_Sub50_8119.current = class282_sub50;
	}

	public static void method7944(CacheableNode class282_sub50, CacheableNode class282_sub50_2_) {
		if (null != class282_sub50.current)
			class282_sub50.method13452();
		class282_sub50.current = class282_sub50_2_.current;
		class282_sub50.aClass282_Sub50_8119 = class282_sub50_2_;
		class282_sub50.current.aClass282_Sub50_8119 = class282_sub50;
		class282_sub50.aClass282_Sub50_8119.current = class282_sub50;
	}

	public static void method7945(CacheableNode class282_sub50, CacheableNode class282_sub50_3_) {
		if (null != class282_sub50.current)
			class282_sub50.method13452();
		class282_sub50.current = class282_sub50_3_.current;
		class282_sub50.aClass282_Sub50_8119 = class282_sub50_3_;
		class282_sub50.current.aClass282_Sub50_8119 = class282_sub50;
		class282_sub50.aClass282_Sub50_8119.current = class282_sub50;
	}

	CacheableNode method7946(CacheableNode class282_sub50, int i) {
		CacheableNode class282_sub50_4_;
		if (class282_sub50 == null)
			class282_sub50_4_ = aClass282_Sub50_5629.aClass282_Sub50_8119;
		else
			class282_sub50_4_ = class282_sub50;
		if (aClass282_Sub50_5629 == class282_sub50_4_) {
			((Class477) this).aClass282_Sub50_5631 = null;
			return null;
		}
		((Class477) this).aClass282_Sub50_5631 = class282_sub50_4_.aClass282_Sub50_8119;
		return class282_sub50_4_;
	}

	public static void method7947(CacheableNode class282_sub50, CacheableNode class282_sub50_5_) {
		if (null != class282_sub50.current)
			class282_sub50.method13452();
		class282_sub50.current = class282_sub50_5_;
		class282_sub50.aClass282_Sub50_8119 = class282_sub50_5_.aClass282_Sub50_8119;
		class282_sub50.current.aClass282_Sub50_8119 = class282_sub50;
		class282_sub50.aClass282_Sub50_8119.current = class282_sub50;
	}

	public static void method7948(CacheableNode class282_sub50, CacheableNode class282_sub50_6_) {
		if (null != class282_sub50.current)
			class282_sub50.method13452();
		class282_sub50.current = class282_sub50_6_;
		class282_sub50.aClass282_Sub50_8119 = class282_sub50_6_.aClass282_Sub50_8119;
		class282_sub50.current.aClass282_Sub50_8119 = class282_sub50;
		class282_sub50.aClass282_Sub50_8119.current = class282_sub50;
	}

	public CacheableNode method7949() {
		CacheableNode class282_sub50 = ((Class477) this).aClass282_Sub50_5631;
		if (aClass282_Sub50_5629 == class282_sub50) {
			((Class477) this).aClass282_Sub50_5631 = null;
			return null;
		}
		((Class477) this).aClass282_Sub50_5631 = class282_sub50.aClass282_Sub50_8119;
		return class282_sub50;
	}

	public CacheableNode method7950() {
		CacheableNode class282_sub50 = aClass282_Sub50_5629.aClass282_Sub50_8119;
		if (class282_sub50 == aClass282_Sub50_5629)
			return null;
		class282_sub50.method13452();
		return class282_sub50;
	}

	public int method7951() {
		int i = 0;
		for (CacheableNode class282_sub50 = aClass282_Sub50_5629.aClass282_Sub50_8119; aClass282_Sub50_5629 != class282_sub50; class282_sub50 = class282_sub50.aClass282_Sub50_8119)
			i++;
		return i;
	}

	CacheableNode method7952(CacheableNode class282_sub50) {
		CacheableNode class282_sub50_7_;
		if (class282_sub50 == null)
			class282_sub50_7_ = aClass282_Sub50_5629.aClass282_Sub50_8119;
		else
			class282_sub50_7_ = class282_sub50;
		if (aClass282_Sub50_5629 == class282_sub50_7_) {
			((Class477) this).aClass282_Sub50_5631 = null;
			return null;
		}
		((Class477) this).aClass282_Sub50_5631 = class282_sub50_7_.aClass282_Sub50_8119;
		return class282_sub50_7_;
	}

	public CacheableNode method7953() {
		CacheableNode class282_sub50 = ((Class477) this).aClass282_Sub50_5631;
		if (aClass282_Sub50_5629 == class282_sub50) {
			((Class477) this).aClass282_Sub50_5631 = null;
			return null;
		}
		((Class477) this).aClass282_Sub50_5631 = class282_sub50.aClass282_Sub50_8119;
		return class282_sub50;
	}

	public CacheableNode method7954() {
		CacheableNode class282_sub50 = ((Class477) this).aClass282_Sub50_5631;
		if (aClass282_Sub50_5629 == class282_sub50) {
			((Class477) this).aClass282_Sub50_5631 = null;
			return null;
		}
		((Class477) this).aClass282_Sub50_5631 = class282_sub50.aClass282_Sub50_8119;
		return class282_sub50;
	}

	public CacheableNode method7955(int i) {
		CacheableNode class282_sub50 = ((Class477) this).aClass282_Sub50_5631;
		if (aClass282_Sub50_5629 == class282_sub50) {
			((Class477) this).aClass282_Sub50_5631 = null;
			return null;
		}
		((Class477) this).aClass282_Sub50_5631 = class282_sub50.aClass282_Sub50_8119;
		return class282_sub50;
	}

	public CacheableNode method7956() {
		CacheableNode class282_sub50 = ((Class477) this).aClass282_Sub50_5631;
		if (aClass282_Sub50_5629 == class282_sub50) {
			((Class477) this).aClass282_Sub50_5631 = null;
			return null;
		}
		((Class477) this).aClass282_Sub50_5631 = class282_sub50.aClass282_Sub50_8119;
		return class282_sub50;
	}

	public int method7957() {
		int i = 0;
		for (CacheableNode class282_sub50 = aClass282_Sub50_5629.aClass282_Sub50_8119; aClass282_Sub50_5629 != class282_sub50; class282_sub50 = class282_sub50.aClass282_Sub50_8119)
			i++;
		return i;
	}

	public int method7958() {
		int i = 0;
		for (CacheableNode class282_sub50 = aClass282_Sub50_5629.aClass282_Sub50_8119; aClass282_Sub50_5629 != class282_sub50; class282_sub50 = class282_sub50.aClass282_Sub50_8119)
			i++;
		return i;
	}

	public int method7959() {
		int i = 0;
		for (CacheableNode class282_sub50 = aClass282_Sub50_5629.aClass282_Sub50_8119; aClass282_Sub50_5629 != class282_sub50; class282_sub50 = class282_sub50.aClass282_Sub50_8119)
			i++;
		return i;
	}

	public Iterator iterator() {
		return new Class469(this);
	}

	public static void method7960(Index class317, byte i) {
		Class16.anInt140 = class317.getArchiveId("p11_full", -1671336895) * 1669464149;
		Class16.anInt136 = class317.getArchiveId("p12_full", 568750453) * 1957167017;
		Class395.anInt4788 = class317.getArchiveId("b12_full", 776026920) * 2033224767;
	}

	static final void method7961(CS2Executor class527, int i) {
		int i_8_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_8_, (byte) 26);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_8_ >> 16];
		Class204.method3366(class118, class98, class527, (byte) -87);
	}

	static final void method7962(CS2Executor class527, byte i) {
		if (client.aBool7310) {
			if (i != -1) {
				for (;;) {
					/* empty */
				}
			}
			Class361.aClass361_4175.method6257(187369662);
		}
	}
}
