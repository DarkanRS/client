/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue {
	Map aMap6312;
	Class170[] aClass170Array6313;
	int anInt6314;
	Comparator aComparator6315;
	int anInt6316 = 0;

	static void method50123(int x) {
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			method.invoke(field, new Object[] { Boolean.TRUE });
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	void method6383(int i, int i_0_) {
		try {
			Class170 class170 = ((AbstractQueue_Sub1) this).aClass170Array6313[i];
			int i_1_;
			for (int i_2_ = (((AbstractQueue_Sub1) this).anInt6314 * -400292665 >>> 1); i < i_2_; i = i_1_) {
				int i_3_ = 1 + (i << 1);
				Class170 class170_4_ = ((AbstractQueue_Sub1) this).aClass170Array6313[i_3_];
				int i_5_ = 2 + (i << 1);
				Class170 class170_6_ = ((AbstractQueue_Sub1) this).aClass170Array6313[i_5_];
				if (((AbstractQueue_Sub1) this).aComparator6315 != null) {
					if ((i_5_ < ((AbstractQueue_Sub1) this).anInt6314 * -400292665) && (((AbstractQueue_Sub1) this).aComparator6315.compare(((Class170) class170_4_).anObject1738, ((Class170) class170_6_).anObject1738)) > 0)
						i_1_ = i_5_;
					else
						i_1_ = i_3_;
				} else if (i_5_ < (((AbstractQueue_Sub1) this).anInt6314 * -400292665) && (((Comparable) ((Class170) class170_4_).anObject1738).compareTo(((Class170) class170_6_).anObject1738)) > 0)
					i_1_ = i_5_;
				else
					i_1_ = i_3_;
				if (((AbstractQueue_Sub1) this).aComparator6315 != null) {
					if ((((AbstractQueue_Sub1) this).aComparator6315.compare(((Class170) class170).anObject1738, (((Class170) (((AbstractQueue_Sub1) this).aClass170Array6313[i_1_])).anObject1738))) <= 0) {
						if (i_0_ <= -2010017327)
							throw new IllegalStateException();
						break;
					}
				} else if ((((Comparable) ((Class170) class170).anObject1738).compareTo(((Class170) (((AbstractQueue_Sub1) this).aClass170Array6313[i_1_])).anObject1738)) <= 0) {
					if (i_0_ <= -2010017327)
						throw new IllegalStateException();
					break;
				}
				((AbstractQueue_Sub1) this).aClass170Array6313[i] = ((AbstractQueue_Sub1) this).aClass170Array6313[i_1_];
				((Class170) ((AbstractQueue_Sub1) this).aClass170Array6313[i]).anInt1737 = i * 533229453;
			}
			((AbstractQueue_Sub1) this).aClass170Array6313[i] = class170;
			((Class170) ((AbstractQueue_Sub1) this).aClass170Array6313[i]).anInt1737 = i * 533229453;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.b(").append(')').toString());
		}
	}

	AbstractQueue_Sub1(int i, Comparator comparator) {
		((AbstractQueue_Sub1) this).aClass170Array6313 = new Class170[i];
		((AbstractQueue_Sub1) this).aMap6312 = new HashMap();
		((AbstractQueue_Sub1) this).aComparator6315 = comparator;
	}

	void method6384(int i) {
		try {
			int i_7_ = 1 + (((AbstractQueue_Sub1) this).aClass170Array6313.length << 1);
			((AbstractQueue_Sub1) this).aClass170Array6313 = (Class170[]) Arrays.copyOf((((AbstractQueue_Sub1) this).aClass170Array6313), i_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.a(").append(')').toString());
		}
	}

	public int size() {
		try {
			return -400292665 * ((AbstractQueue_Sub1) this).anInt6314;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.size(").append(')').toString());
		}
	}

	public boolean contains(Object object) {
		try {
			return ((AbstractQueue_Sub1) this).aMap6312.containsKey(object);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.contains(").append(')').toString());
		}
	}

	public Object poll() {
		try {
			if (0 == -400292665 * ((AbstractQueue_Sub1) this).anInt6314)
				return null;
			((AbstractQueue_Sub1) this).anInt6316 += 1445240763;
			Object object = (((Class170) (((AbstractQueue_Sub1) this).aClass170Array6313[0])).anObject1738);
			((AbstractQueue_Sub1) this).aMap6312.remove(object);
			((AbstractQueue_Sub1) this).anInt6314 -= -2003206921;
			if (0 == -400292665 * ((AbstractQueue_Sub1) this).anInt6314)
				((AbstractQueue_Sub1) this).aClass170Array6313[-400292665 * ((AbstractQueue_Sub1) this).anInt6314] = null;
			else {
				((AbstractQueue_Sub1) this).aClass170Array6313[0] = (((AbstractQueue_Sub1) this).aClass170Array6313[((AbstractQueue_Sub1) this).anInt6314 * -400292665]);
				((Class170) ((AbstractQueue_Sub1) this).aClass170Array6313[0]).anInt1737 = 0;
				((AbstractQueue_Sub1) this).aClass170Array6313[((AbstractQueue_Sub1) this).anInt6314 * -400292665] = null;
				method6383(0, 280830604);
			}
			return object;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.poll(").append(')').toString());
		}
	}

	void method6385(int i, int i_8_) {
		try {
			Class170 class170 = ((AbstractQueue_Sub1) this).aClass170Array6313[i];
			int i_9_;
			for (/**/; i > 0; i = i_9_) {
				i_9_ = i - 1 >>> 1;
				Class170 class170_10_ = ((AbstractQueue_Sub1) this).aClass170Array6313[i_9_];
				if (((AbstractQueue_Sub1) this).aComparator6315 != null) {
					if ((((AbstractQueue_Sub1) this).aComparator6315.compare(((Class170) class170).anObject1738, ((Class170) class170_10_).anObject1738)) >= 0) {
						if (i_8_ < 802255489)
							break;
						return;
					}
				} else if ((((Comparable) ((Class170) class170).anObject1738).compareTo(((Class170) class170_10_).anObject1738)) >= 0) {
					if (i_8_ >= 802255489)
						throw new IllegalStateException();
					break;
				}
				((AbstractQueue_Sub1) this).aClass170Array6313[i] = class170_10_;
				((Class170) ((AbstractQueue_Sub1) this).aClass170Array6313[i]).anInt1737 = 533229453 * i;
			}
			((AbstractQueue_Sub1) this).aClass170Array6313[i] = class170;
			((Class170) ((AbstractQueue_Sub1) this).aClass170Array6313[i]).anInt1737 = 533229453 * i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.f(").append(')').toString());
		}
	}

	public Object[] toArray() {
		try {
			Object[] objects = super.toArray();
			if (((AbstractQueue_Sub1) this).aComparator6315 != null)
				Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator6315);
			else
				Arrays.sort(objects);
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.toArray(").append(')').toString());
		}
	}

	public Iterator iterator() {
		try {
			return new Class188(this);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.iterator(").append(')').toString());
		}
	}

	public Object peek() {
		try {
			if (0 == ((AbstractQueue_Sub1) this).anInt6314 * -400292665)
				return null;
			return (((Class170) ((AbstractQueue_Sub1) this).aClass170Array6313[0]).anObject1738);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.peek(").append(')').toString());
		}
	}

	public AbstractQueue_Sub1(int i) {
		this(i, null);
	}

	public boolean offer(Object object) {
		try {
			if (((AbstractQueue_Sub1) this).aMap6312.containsKey(object))
				throw new IllegalArgumentException("");
			((AbstractQueue_Sub1) this).anInt6316 += 1445240763;
			int i = -400292665 * ((AbstractQueue_Sub1) this).anInt6314;
			if (i >= ((AbstractQueue_Sub1) this).aClass170Array6313.length)
				method6384(-1001796105);
			((AbstractQueue_Sub1) this).anInt6314 += -2003206921;
			if (i == 0) {
				((AbstractQueue_Sub1) this).aClass170Array6313[0] = new Class170(object, 0);
				((AbstractQueue_Sub1) this).aMap6312.put(object, (((AbstractQueue_Sub1) this).aClass170Array6313[0]));
			} else {
				((AbstractQueue_Sub1) this).aClass170Array6313[i] = new Class170(object, i);
				((AbstractQueue_Sub1) this).aMap6312.put(object, (((AbstractQueue_Sub1) this).aClass170Array6313[i]));
				method6385(i, -2059212806);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.offer(").append(')').toString());
		}
	}

	public boolean remove(Object object) {
		try {
			Class170 class170 = ((Class170) ((AbstractQueue_Sub1) this).aMap6312.remove(object));
			if (null == class170)
				return false;
			((AbstractQueue_Sub1) this).anInt6316 += 1445240763;
			((AbstractQueue_Sub1) this).anInt6314 -= -2003206921;
			if (-29201595 * ((Class170) class170).anInt1737 == -400292665 * ((AbstractQueue_Sub1) this).anInt6314) {
				((AbstractQueue_Sub1) this).aClass170Array6313[((AbstractQueue_Sub1) this).anInt6314 * -400292665] = null;
				return true;
			}
			Class170 class170_11_ = (((AbstractQueue_Sub1) this).aClass170Array6313[((AbstractQueue_Sub1) this).anInt6314 * -400292665]);
			((AbstractQueue_Sub1) this).aClass170Array6313[-400292665 * ((AbstractQueue_Sub1) this).anInt6314] = null;
			((AbstractQueue_Sub1) this).aClass170Array6313[((Class170) class170).anInt1737 * -29201595] = class170_11_;
			((Class170) (((AbstractQueue_Sub1) this).aClass170Array6313[-29201595 * ((Class170) class170).anInt1737])).anInt1737 = ((Class170) class170).anInt1737 * 1;
			method6383(-29201595 * ((Class170) class170).anInt1737, 1851130853);
			if ((((AbstractQueue_Sub1) this).aClass170Array6313[-29201595 * ((Class170) class170).anInt1737]) == class170_11_)
				method6385(-29201595 * ((Class170) class170).anInt1737, -1459206324);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.remove(").append(')').toString());
		}
	}

	static final void method6386(ClientScript2 class403, byte i) {
		try {
			Class419.method5605((String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]), false, false, 945299991);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajy.afx(").append(')').toString());
		}
	}
}
