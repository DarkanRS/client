/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collection;
import java.util.Iterator;

public class Class453 implements Iterable, Collection {
	public Linkable aClass298_5643 = new Linkable();
	Linkable aClass298_5644;

	public void method5935(Linkable class298, int i) {
		try {
			if (null != class298.previous)
				class298.unlink(-1460969981);
			class298.previous = aClass298_5643.previous;
			class298.next = aClass298_5643;
			class298.previous.next = class298;
			class298.next.previous = class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.f(").append(')').toString());
		}
	}

	public Linkable method5936(int i) {
		try {
			Linkable class298 = aClass298_5643.next;
			if (class298 == aClass298_5643)
				return null;
			class298.unlink(-1460969981);
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.p(").append(')').toString());
		}
	}

	void method5937(Class453 class453_0_, Linkable class298, byte i) {
		try {
			Linkable class298_1_ = aClass298_5643.previous;
			aClass298_5643.previous = class298.previous;
			class298.previous.next = aClass298_5643;
			if (aClass298_5643 != class298) {
				class298.previous = class453_0_.aClass298_5643.previous;
				class298.previous.next = class298;
				class298_1_.next = class453_0_.aClass298_5643;
				class453_0_.aClass298_5643.previous = class298_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.i(").append(')').toString());
		}
	}

	public void method5938(Class453 class453_2_, int i) {
		try {
			if (aClass298_5643 != aClass298_5643.next)
				method5937(class453_2_, aClass298_5643.next, (byte) -5);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.k(").append(')').toString());
		}
	}

	public Linkable method5939(int i) {
		try {
			return method5945(null, 65280);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.d(").append(')').toString());
		}
	}

	Linkable method5940(Linkable class298, byte i) {
		try {
			Linkable class298_3_;
			if (null == class298)
				class298_3_ = aClass298_5643.previous;
			else
				class298_3_ = class298;
			if (aClass298_5643 == class298_3_) {
				((Class453) this).aClass298_5644 = null;
				return null;
			}
			((Class453) this).aClass298_5644 = class298_3_.previous;
			return class298_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.r(").append(')').toString());
		}
	}

	Linkable[] method5941(byte i) {
		try {
			Linkable[] class298s = new Linkable[method5948(1828905535)];
			int i_4_ = 0;
			for (Linkable class298 = aClass298_5643.next; class298 != aClass298_5643; class298 = class298.next)
				class298s[i_4_++] = class298;
			return class298s;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.y(").append(')').toString());
		}
	}

	public Iterator iterator() {
		try {
			return new Class446(this);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.iterator(").append(')').toString());
		}
	}

	public boolean isEmpty() {
		try {
			return method5946(1085448128);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.isEmpty(").append(')').toString());
		}
	}

	public boolean contains(Object object) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.contains(").append(')').toString());
		}
	}

	public Object[] toArray() {
		try {
			return method5941((byte) 7);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.toArray(").append(')').toString());
		}
	}

	public Linkable method5942(int i) {
		try {
			return method5940(null, (byte) 4);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.x(").append(')').toString());
		}
	}

	public boolean remove(Object object) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.remove(").append(')').toString());
		}
	}

	public boolean containsAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.containsAll(").append(')').toString());
		}
	}

	public boolean addAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.addAll(").append(')').toString());
		}
	}

	public boolean removeAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.removeAll(").append(')').toString());
		}
	}

	public boolean retainAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.retainAll(").append(')').toString());
		}
	}

	public void clear() {
		try {
			method5943((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.clear(").append(')').toString());
		}
	}

	public boolean add(Object object) {
		try {
			return method5949((Linkable) object, (byte) -121);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.add(").append(')').toString());
		}
	}

	public boolean equals(Object object) {
		try {
			return super.equals(object);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.equals(").append(')').toString());
		}
	}

	public int hashCode() {
		try {
			return super.hashCode();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.hashCode(").append(')').toString());
		}
	}

	public void method5943(byte i) {
		try {
			while (aClass298_5643.next != aClass298_5643)
				aClass298_5643.next.unlink(-1460969981);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.a(").append(')').toString());
		}
	}

	public Object[] toArray(Object[] objects) {
		try {
			int i = 0;
			for (Linkable class298 = aClass298_5643.next; aClass298_5643 != class298; class298 = class298.next)
				objects[i++] = class298;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.toArray(").append(')').toString());
		}
	}

	public Linkable method5944(int i) {
		try {
			Linkable class298 = ((Class453) this).aClass298_5644;
			if (aClass298_5643 == class298) {
				((Class453) this).aClass298_5644 = null;
				return null;
			}
			((Class453) this).aClass298_5644 = class298.next;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.q(").append(')').toString());
		}
	}

	Linkable method5945(Linkable class298, int i) {
		try {
			Linkable class298_5_;
			if (class298 == null)
				class298_5_ = aClass298_5643.next;
			else
				class298_5_ = class298;
			if (aClass298_5643 == class298_5_) {
				((Class453) this).aClass298_5644 = null;
				return null;
			}
			((Class453) this).aClass298_5644 = class298_5_.next;
			return class298_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.u(").append(')').toString());
		}
	}

	public Class453() {
		aClass298_5643.next = aClass298_5643;
		aClass298_5643.previous = aClass298_5643;
	}

	public int size() {
		try {
			return method5948(1828905535);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.size(").append(')').toString());
		}
	}

	public boolean method5946(int i) {
		try {
			return aClass298_5643 == aClass298_5643.next;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.z(").append(')').toString());
		}
	}

	public Linkable method5947(int i) {
		try {
			Linkable class298 = ((Class453) this).aClass298_5644;
			if (class298 == aClass298_5643) {
				((Class453) this).aClass298_5644 = null;
				return null;
			}
			((Class453) this).aClass298_5644 = class298.previous;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.n(").append(')').toString());
		}
	}

	public int method5948(int i) {
		try {
			int i_6_ = 0;
			for (Linkable class298 = aClass298_5643.next; aClass298_5643 != class298; class298 = class298.next)
				i_6_++;
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.s(").append(')').toString());
		}
	}

	boolean method5949(Linkable class298, byte i) {
		try {
			method5935(class298, 289942482);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.t(").append(')').toString());
		}
	}

	static final void method5950(ClientScript2 class403, byte i) {
		try {
			if (client.anInt8932 * -1333485389 >= 5 && -1333485389 * client.anInt8932 <= 9)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.ur(").append(')').toString());
		}
	}

	public static void method5951(int i, int i_7_, int i_8_, ObjectDefinitions class432, int i_9_) {
		try {
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7421.method5939(1766612795)); null != class298_sub41; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7421.method5944(49146))) {
				if (i == (-1926928785 * ((Class298_Sub41) class298_sub41).anInt7424) && (((Class298_Sub41) class298_sub41).anInt7425 * -1808325887) == i_7_ << 9 && (((Class298_Sub41) class298_sub41).anInt7423 * 757346071 == i_8_ << 9) && (class432.anInt5365 * 1181652947 == (((Class298_Sub41) class298_sub41).aClass432_7435.anInt5365) * 1181652947)) {
					if (null != (((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447)) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
					}
					if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426) != null) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426 = null;
					}
					class298_sub41.unlink(-1460969981);
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.i(").append(')').toString());
		}
	}

	static final void method5952(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class371.method4582(class105, class119, class403, -638652080);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sr.lc(").append(')').toString());
		}
	}
}
