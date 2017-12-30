
/* Class482 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collection;
import java.util.Iterator;

public class Class482 implements Iterable, Collection {
	Class282 aClass282_5727;
	public Class282 aClass282_5728 = new Class282();

	public Class282 method8057() {
		Class282 class282 = ((Class482) this).aClass282_5727;
		if (class282 == aClass282_5728) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282.aClass282_3378;
		return class282;
	}

	public boolean method8058(Object object) {
		throw new RuntimeException();
	}

	public void method8059(Class282 class282, int i) {
		if (null != class282.aClass282_3380)
			class282.method4991(-371378792);
		class282.aClass282_3380 = aClass282_5728.aClass282_3380;
		class282.aClass282_3378 = aClass282_5728;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
	}

	public boolean method8060(Object object) {
		return method8072((Class282) object, -4100975);
	}

	public Class282 method8061(byte i) {
		Class282 class282 = aClass282_5728.aClass282_3378;
		if (aClass282_5728 == class282)
			return null;
		class282.method4991(-371378792);
		return class282;
	}

	void method8062(Class482 class482_0_, Class282 class282, int i) {
		Class282 class282_1_ = aClass282_5728.aClass282_3380;
		aClass282_5728.aClass282_3380 = class282.aClass282_3380;
		class282.aClass282_3380.aClass282_3378 = aClass282_5728;
		if (class282 != aClass282_5728) {
			class282.aClass282_3380 = class482_0_.aClass282_5728.aClass282_3380;
			class282.aClass282_3380.aClass282_3378 = class282;
			class282_1_.aClass282_3378 = class482_0_.aClass282_5728;
			class482_0_.aClass282_5728.aClass282_3380 = class282_1_;
		}
	}

	public void method8063(Class482 class482_2_, int i) {
		if (aClass282_5728.aClass282_3378 != aClass282_5728)
			method8062(class482_2_, aClass282_5728.aClass282_3378, -1691020971);
	}

	public Iterator iterator() {
		return new Class460(this);
	}

	Class282 method8064(Class282 class282) {
		Class282 class282_3_;
		if (class282 == null)
			class282_3_ = aClass282_5728.aClass282_3380;
		else
			class282_3_ = class282;
		if (aClass282_5728 == class282_3_) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282_3_.aClass282_3380;
		return class282_3_;
	}

	public Class282 method8065(int i) {
		return method8066(null, (byte) -32);
	}

	Class282 method8066(Class282 class282, byte i) {
		Class282 class282_4_;
		if (class282 == null)
			class282_4_ = aClass282_5728.aClass282_3380;
		else
			class282_4_ = class282;
		if (aClass282_5728 == class282_4_) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282_4_.aClass282_3380;
		return class282_4_;
	}

	public Class282 method8067(int i) {
		Class282 class282 = ((Class482) this).aClass282_5727;
		if (class282 == aClass282_5728) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282.aClass282_3378;
		return class282;
	}

	public Class282 method8068(byte i) {
		Class282 class282 = ((Class482) this).aClass282_5727;
		if (aClass282_5728 == class282) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282.aClass282_3380;
		return class282;
	}

	public int method8069(int i) {
		int i_5_ = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; aClass282_5728 != class282; class282 = class282.aClass282_3378)
			i_5_++;
		return i_5_;
	}

	public boolean add(Object object) {
		return method8072((Class282) object, -4100975);
	}

	Class282[] method8070(int i) {
		Class282[] class282s = new Class282[method8069(-1374254477)];
		int i_6_ = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; class282 != aClass282_5728; class282 = class282.aClass282_3378)
			class282s[i_6_++] = class282;
		return class282s;
	}

	Class282[] method8071() {
		Class282[] class282s = new Class282[method8069(-1374254477)];
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; class282 != aClass282_5728; class282 = class282.aClass282_3378)
			class282s[i++] = class282;
		return class282s;
	}

	public void clear() {
		method8118(913774407);
	}

	public boolean isEmpty() {
		return method8096(2128482398);
	}

	public boolean contains(Object object) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return method8070(2108497561);
	}

	public Object[] toArray(Object[] objects) {
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; class282 != aClass282_5728; class282 = class282.aClass282_3378)
			objects[i++] = class282;
		return objects;
	}

	boolean method8072(Class282 class282, int i) {
		method8059(class282, 1651650132);
		return true;
	}

	public Class282 method8073() {
		return method8066(null, (byte) -57);
	}

	public boolean containsAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection collection) {
		throw new RuntimeException();
	}

	public int method8074() {
		return method8069(-1374254477);
	}

	public void method8075(Class282 class282) {
		if (null != class282.aClass282_3380)
			class282.method4991(-371378792);
		class282.aClass282_3380 = aClass282_5728.aClass282_3380;
		class282.aClass282_3378 = aClass282_5728;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int hashCode() {
		return super.hashCode();
	}

	Class282 method8076(Class282 class282, int i) {
		Class282 class282_7_;
		if (null == class282)
			class282_7_ = aClass282_5728.aClass282_3378;
		else
			class282_7_ = class282;
		if (aClass282_5728 == class282_7_) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282_7_.aClass282_3378;
		return class282_7_;
	}

	public Class282 method8077() {
		return method8076(null, -1471072918);
	}

	public int method8078() {
		return method8069(-1374254477);
	}

	Class282[] method8079() {
		Class282[] class282s = new Class282[method8069(-1374254477)];
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; class282 != aClass282_5728; class282 = class282.aClass282_3378)
			class282s[i++] = class282;
		return class282s;
	}

	public int method8080() {
		return method8069(-1374254477);
	}

	public boolean method8081(Object object) {
		throw new RuntimeException();
	}

	public Object[] method8082() {
		return method8070(790472093);
	}

	public Object[] method8083() {
		return method8070(-75915236);
	}

	public Object[] method8084() {
		return method8070(-300034995);
	}

	public boolean method8085(Object object) {
		throw new RuntimeException();
	}

	public Iterator method8086() {
		return new Class460(this);
	}

	public Iterator method8087() {
		return new Class460(this);
	}

	public void method8088(Class282 class282) {
		if (null != class282.aClass282_3380)
			class282.method4991(-371378792);
		class282.aClass282_3380 = aClass282_5728.aClass282_3380;
		class282.aClass282_3378 = aClass282_5728;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
	}

	public boolean method8089(Object object) {
		return super.equals(object);
	}

	Class282 method8090(Class282 class282) {
		Class282 class282_8_;
		if (null == class282)
			class282_8_ = aClass282_5728.aClass282_3378;
		else
			class282_8_ = class282;
		if (aClass282_5728 == class282_8_) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282_8_.aClass282_3378;
		return class282_8_;
	}

	public boolean method8091(Object object) {
		return super.equals(object);
	}

	boolean method8092(Class282 class282) {
		method8059(class282, 1448456597);
		return true;
	}

	public void method8093() {
		while (aClass282_5728.aClass282_3378 != aClass282_5728)
			aClass282_5728.aClass282_3378.method4991(-371378792);
	}

	public void method8094() {
		while (aClass282_5728.aClass282_3378 != aClass282_5728)
			aClass282_5728.aClass282_3378.method4991(-371378792);
	}

	public void method8095() {
		while (aClass282_5728.aClass282_3378 != aClass282_5728)
			aClass282_5728.aClass282_3378.method4991(-371378792);
	}

	public boolean method8096(int i) {
		return aClass282_5728.aClass282_3378 == aClass282_5728;
	}

	public Class282 method8097(byte i) {
		return method8076(null, -1858764882);
	}

	public void method8098(Class282 class282, byte i) {
		if (class282.aClass282_3380 != null)
			class282.method4991(-371378792);
		class282.aClass282_3380 = aClass282_5728;
		class282.aClass282_3378 = aClass282_5728.aClass282_3378;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
	}

	public static void method8099(Class282 class282, Class282 class282_9_) {
		if (class282.aClass282_3380 != null)
			class282.method4991(-371378792);
		class282.aClass282_3380 = class282_9_.aClass282_3380;
		class282.aClass282_3378 = class282_9_;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
	}

	public Class282 method8100() {
		Class282 class282 = aClass282_5728.aClass282_3378;
		if (aClass282_5728 == class282)
			return null;
		class282.method4991(-371378792);
		return class282;
	}

	public Class282 method8101() {
		Class282 class282 = ((Class482) this).aClass282_5727;
		if (aClass282_5728 == class282) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282.aClass282_3380;
		return class282;
	}

	void method8102(Class482 class482_10_, Class282 class282) {
		Class282 class282_11_ = aClass282_5728.aClass282_3380;
		aClass282_5728.aClass282_3380 = class282.aClass282_3380;
		class282.aClass282_3380.aClass282_3378 = aClass282_5728;
		if (class282 != aClass282_5728) {
			class282.aClass282_3380 = class482_10_.aClass282_5728.aClass282_3380;
			class282.aClass282_3380.aClass282_3378 = class282;
			class282_11_.aClass282_3378 = class482_10_.aClass282_5728;
			class482_10_.aClass282_5728.aClass282_3380 = class282_11_;
		}
	}

	void method8103(Class482 class482_12_, Class282 class282) {
		Class282 class282_13_ = aClass282_5728.aClass282_3380;
		aClass282_5728.aClass282_3380 = class282.aClass282_3380;
		class282.aClass282_3380.aClass282_3378 = aClass282_5728;
		if (class282 != aClass282_5728) {
			class282.aClass282_3380 = class482_12_.aClass282_5728.aClass282_3380;
			class282.aClass282_3380.aClass282_3378 = class282;
			class282_13_.aClass282_3378 = class482_12_.aClass282_5728;
			class482_12_.aClass282_5728.aClass282_3380 = class282_13_;
		}
	}

	void method8104(Class482 class482_14_, Class282 class282) {
		Class282 class282_15_ = aClass282_5728.aClass282_3380;
		aClass282_5728.aClass282_3380 = class282.aClass282_3380;
		class282.aClass282_3380.aClass282_3378 = aClass282_5728;
		if (class282 != aClass282_5728) {
			class282.aClass282_3380 = class482_14_.aClass282_5728.aClass282_3380;
			class282.aClass282_3380.aClass282_3378 = class282;
			class282_15_.aClass282_3378 = class482_14_.aClass282_5728;
			class482_14_.aClass282_5728.aClass282_3380 = class282_15_;
		}
	}

	public Class282 method8105() {
		Class282 class282 = aClass282_5728.aClass282_3378;
		if (aClass282_5728 == class282)
			return null;
		class282.method4991(-371378792);
		return class282;
	}

	void method8106(Class482 class482_16_, Class282 class282) {
		Class282 class282_17_ = aClass282_5728.aClass282_3380;
		aClass282_5728.aClass282_3380 = class282.aClass282_3380;
		class282.aClass282_3380.aClass282_3378 = aClass282_5728;
		if (class282 != aClass282_5728) {
			class282.aClass282_3380 = class482_16_.aClass282_5728.aClass282_3380;
			class282.aClass282_3380.aClass282_3378 = class282;
			class282_17_.aClass282_3378 = class482_16_.aClass282_5728;
			class482_16_.aClass282_5728.aClass282_3380 = class282_17_;
		}
	}

	public void method8107(Class482 class482_18_) {
		if (aClass282_5728.aClass282_3378 != aClass282_5728)
			method8062(class482_18_, aClass282_5728.aClass282_3378, -859952897);
	}

	public void method8108(Class482 class482_19_) {
		if (aClass282_5728.aClass282_3378 != aClass282_5728)
			method8062(class482_19_, aClass282_5728.aClass282_3378, -586173771);
	}

	public Class282 method8109() {
		Class282 class282 = ((Class482) this).aClass282_5727;
		if (aClass282_5728 == class282) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282.aClass282_3380;
		return class282;
	}

	public Class282 method8110() {
		return method8076(null, -1547975264);
	}

	public void method8111(Class282 class282) {
		if (class282.aClass282_3380 != null)
			class282.method4991(-371378792);
		class282.aClass282_3380 = aClass282_5728;
		class282.aClass282_3378 = aClass282_5728.aClass282_3378;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
	}

	public Class282 method8112() {
		return method8066(null, (byte) 22);
	}

	public boolean method8113(Object object) {
		return super.equals(object);
	}

	public Class482() {
		aClass282_5728.aClass282_3378 = aClass282_5728;
		aClass282_5728.aClass282_3380 = aClass282_5728;
	}

	public Class282 method8114() {
		Class282 class282 = ((Class482) this).aClass282_5727;
		if (class282 == aClass282_5728) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282.aClass282_3378;
		return class282;
	}

	public Class282 method8115() {
		Class282 class282 = ((Class482) this).aClass282_5727;
		if (class282 == aClass282_5728) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282.aClass282_3378;
		return class282;
	}

	public void method8116() {
		while (aClass282_5728.aClass282_3378 != aClass282_5728)
			aClass282_5728.aClass282_3378.method4991(-371378792);
	}

	public int method8117() {
		return super.hashCode();
	}

	public void method8118(int i) {
		while (aClass282_5728.aClass282_3378 != aClass282_5728)
			aClass282_5728.aClass282_3378.method4991(-371378792);
	}

	public Class282 method8119() {
		Class282 class282 = ((Class482) this).aClass282_5727;
		if (class282 == aClass282_5728) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282.aClass282_3378;
		return class282;
	}

	public Class282 method8120() {
		Class282 class282 = ((Class482) this).aClass282_5727;
		if (aClass282_5728 == class282) {
			((Class482) this).aClass282_5727 = null;
			return null;
		}
		((Class482) this).aClass282_5727 = class282.aClass282_3380;
		return class282;
	}

	public int method8121() {
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; aClass282_5728 != class282; class282 = class282.aClass282_3378)
			i++;
		return i;
	}

	public int size() {
		return method8069(-1374254477);
	}

	public int method8122() {
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; aClass282_5728 != class282; class282 = class282.aClass282_3378)
			i++;
		return i;
	}

	public int method8123() {
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; aClass282_5728 != class282; class282 = class282.aClass282_3378)
			i++;
		return i;
	}

	public boolean method8124(Collection collection) {
		throw new RuntimeException();
	}

	Class282[] method8125() {
		Class282[] class282s = new Class282[method8069(-1374254477)];
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; class282 != aClass282_5728; class282 = class282.aClass282_3378)
			class282s[i++] = class282;
		return class282s;
	}

	public Object[] method8126() {
		return method8070(193432226);
	}

	public boolean method8127() {
		return method8096(1937667878);
	}

	public boolean method8128() {
		return method8096(1567518009);
	}

	public boolean method8129() {
		return method8096(2145417971);
	}

	public boolean method8130() {
		return method8096(1372227102);
	}

	public Object[] method8131(Object[] objects) {
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; class282 != aClass282_5728; class282 = class282.aClass282_3378)
			objects[i++] = class282;
		return objects;
	}

	public Object[] method8132(Object[] objects) {
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; class282 != aClass282_5728; class282 = class282.aClass282_3378)
			objects[i++] = class282;
		return objects;
	}

	public Object[] method8133(Object[] objects) {
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; class282 != aClass282_5728; class282 = class282.aClass282_3378)
			objects[i++] = class282;
		return objects;
	}

	public boolean remove(Object object) {
		throw new RuntimeException();
	}

	boolean method8134(Class282 class282) {
		method8059(class282, 863000642);
		return true;
	}

	public boolean method8135(Collection collection) {
		throw new RuntimeException();
	}

	public int method8136() {
		int i = 0;
		for (Class282 class282 = aClass282_5728.aClass282_3378; aClass282_5728 != class282; class282 = class282.aClass282_3378)
			i++;
		return i;
	}

	public boolean method8137(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method8138(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method8139(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method8140(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method8141(Object object) {
		return method8072((Class282) object, -4100975);
	}

	void method8142(Class482 class482_20_, Class282 class282) {
		Class282 class282_21_ = aClass282_5728.aClass282_3380;
		aClass282_5728.aClass282_3380 = class282.aClass282_3380;
		class282.aClass282_3380.aClass282_3378 = aClass282_5728;
		if (class282 != aClass282_5728) {
			class282.aClass282_3380 = class482_20_.aClass282_5728.aClass282_3380;
			class282.aClass282_3380.aClass282_3378 = class282;
			class282_21_.aClass282_3378 = class482_20_.aClass282_5728;
			class482_20_.aClass282_5728.aClass282_3380 = class282_21_;
		}
	}

	public boolean method8143(Object object) {
		return method8072((Class282) object, -4100975);
	}

	public static void method8144(boolean bool, int i) {
		if (Class328.aClass306_3771 == null)
			Class165.method2852(-1959846530);
		if (bool)
			Class328.aClass306_3771.method5419((byte) 44);
	}

	static boolean method8145(int i) {
		boolean bool;
		try {
			Class395 class395 = new Class395();
			byte[] is = class395.method6764(Class299.aByteArray3543, (byte) -76);
			Class103_Sub1.method14490(is, (byte) -104);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}

	public static final void method8146(int i) {
		if (!client.aBool7269) {
			client.aFloat7266 += (-24.0F - client.aFloat7266) / 2.0F;
			client.aBool7371 = true;
			client.aBool7269 = true;
		}
	}

	static final void method8147(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 1560801011;
		Class356[] class356s = Class350_Sub3_Sub1.method15558(418447133);
		Class353[] class353s = Class483.method8155(152314627);
		Class282_Sub15_Sub3.method15239(class356s[(((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537])], class353s[(((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1])], (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 2]), (((CS2Executor) class527).intStack[3 + ((CS2Executor) class527).anInt7012 * 1942118537]),
				(((CS2Executor) class527).intStack[4 + ((CS2Executor) class527).anInt7012 * 1942118537]), (((CS2Executor) class527).intStack[5 + ((CS2Executor) class527).anInt7012 * 1942118537]), (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 6]), (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 7]), (((CS2Executor) class527).intStack[8 + 1942118537 * ((CS2Executor) class527).anInt7012]),
				(((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 9]), (((CS2Executor) class527).intStack[10 + ((CS2Executor) class527).anInt7012 * 1942118537]), (byte) -64);
	}

	public static void method8148(byte i) {
		Class253.method4330(22050, Class393.aClass282_Sub54_4783.aClass468_Sub10_8215.method12691(722134232) == 1, 2);
		Class320.aClass253_3723 = Class253.method4331(Class351.aCanvas4096, 0, 22050);
		Class42_Sub1.method14563(true, Class282_Sub20_Sub10.method15262(null, 191335579), (short) 27702);
		Class100.aClass253_1008 = Class253.method4331(Class351.aCanvas4096, 1, 2048);
		Class79.aClass282_Sub15_Sub4_783 = new Class282_Sub15_Sub4();
		Class100.aClass253_1008.method4329(Class79.aClass282_Sub15_Sub4_783);
		Class119.aClass344_1460 = new Class344(22050, Class253.anInt3129);
		Class468_Sub6.method12658(552328415);
	}
}
