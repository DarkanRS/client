
/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue {
	public static short[][] aShortArrayArray10068;
	Map aMap10069;
	int anInt10070;
	Comparator aComparator10071;
	Class354[] aClass354Array10072;
	int anInt10073 = 0;

	void method15479(int i) {
		int i_0_ = 1 + (((AbstractQueue_Sub1) this).aClass354Array10072.length << 1);
		((AbstractQueue_Sub1) this).aClass354Array10072 = ((Class354[]) Arrays.copyOf(((AbstractQueue_Sub1) this).aClass354Array10072, i_0_));
	}

	void method15480(int i) {
		Class354 class354 = ((AbstractQueue_Sub1) this).aClass354Array10072[i];
		int i_1_;
		for (/**/; i > 0; i = i_1_) {
			i_1_ = i - 1 >>> 1;
			Class354 class354_2_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_1_];
			if (((AbstractQueue_Sub1) this).aComparator10071 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354).anObject4109, ((Class354) class354_2_).anObject4109)) >= 0)
					break;
			} else if (((Comparable) ((Class354) class354).anObject4109).compareTo(((Class354) class354_2_).anObject4109) >= 0)
				break;
			((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354_2_;
			((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
		}
		((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354;
		((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
	}

	AbstractQueue_Sub1(int i, Comparator comparator) {
		((AbstractQueue_Sub1) this).aClass354Array10072 = new Class354[i];
		((AbstractQueue_Sub1) this).aMap10069 = new HashMap();
		((AbstractQueue_Sub1) this).aComparator10071 = comparator;
	}

	public int size() {
		return 1767048053 * ((AbstractQueue_Sub1) this).anInt10070;
	}

	void method15481(int i) {
		Class354 class354 = ((AbstractQueue_Sub1) this).aClass354Array10072[i];
		int i_3_;
		for (int i_4_ = ((AbstractQueue_Sub1) this).anInt10070 * 1767048053 >>> 1; i < i_4_; i = i_3_) {
			int i_5_ = 1 + (i << 1);
			Class354 class354_6_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_5_];
			int i_7_ = 2 + (i << 1);
			Class354 class354_8_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_7_];
			if (null != ((AbstractQueue_Sub1) this).aComparator10071) {
				if (i_7_ < 1767048053 * ((AbstractQueue_Sub1) this).anInt10070 && (((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354_6_).anObject4109, ((Class354) class354_8_).anObject4109)) > 0)
					i_3_ = i_7_;
				else
					i_3_ = i_5_;
			} else if ((i_7_ < ((AbstractQueue_Sub1) this).anInt10070 * 1767048053) && (((Comparable) ((Class354) class354_6_).anObject4109).compareTo(((Class354) class354_8_).anObject4109)) > 0)
				i_3_ = i_7_;
			else
				i_3_ = i_5_;
			if (null != ((AbstractQueue_Sub1) this).aComparator10071) {
				if ((((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354).anObject4109, ((Class354) (((AbstractQueue_Sub1) this).aClass354Array10072[i_3_])).anObject4109)) <= 0)
					break;
			} else if ((((Comparable) ((Class354) class354).anObject4109).compareTo(((Class354) (((AbstractQueue_Sub1) this).aClass354Array10072[i_3_])).anObject4109)) <= 0)
				break;
			((AbstractQueue_Sub1) this).aClass354Array10072[i] = ((AbstractQueue_Sub1) this).aClass354Array10072[i_3_];
			((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = i * -449891505;
		}
		((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354;
		((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
	}

	public Object peek() {
		if (1767048053 * ((AbstractQueue_Sub1) this).anInt10070 == 0)
			return null;
		return (((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[0]).anObject4109);
	}

	public boolean remove(Object object) {
		Class354 class354 = (Class354) ((AbstractQueue_Sub1) this).aMap10069.remove(object);
		if (null == class354)
			return false;
		((AbstractQueue_Sub1) this).anInt10073 += -967098159;
		((AbstractQueue_Sub1) this).anInt10070 -= -284068643;
		if (((Class354) class354).anInt4108 * -2042756177 == ((AbstractQueue_Sub1) this).anInt10070 * 1767048053) {
			((AbstractQueue_Sub1) this).aClass354Array10072[((AbstractQueue_Sub1) this).anInt10070 * 1767048053] = null;
			return true;
		}
		Class354 class354_9_ = (((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070]);
		((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070] = null;
		((AbstractQueue_Sub1) this).aClass354Array10072[-2042756177 * ((Class354) class354).anInt4108] = class354_9_;
		((Class354) (((AbstractQueue_Sub1) this).aClass354Array10072[-2042756177 * ((Class354) class354).anInt4108])).anInt4108 = ((Class354) class354).anInt4108 * 1;
		method15484(-2042756177 * ((Class354) class354).anInt4108, (byte) -48);
		if (class354_9_ == (((AbstractQueue_Sub1) this).aClass354Array10072[((Class354) class354).anInt4108 * -2042756177]))
			method15483(((Class354) class354).anInt4108 * -2042756177, 1780723121);
		return true;
	}

	public Iterator method15482() {
		return new Class380(this);
	}

	void method15483(int i, int i_10_) {
		Class354 class354 = ((AbstractQueue_Sub1) this).aClass354Array10072[i];
		int i_11_;
		for (/**/; i > 0; i = i_11_) {
			i_11_ = i - 1 >>> 1;
			Class354 class354_12_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_11_];
			if (((AbstractQueue_Sub1) this).aComparator10071 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354).anObject4109, ((Class354) class354_12_).anObject4109)) >= 0)
					break;
			} else if (((Comparable) ((Class354) class354).anObject4109).compareTo(((Class354) class354_12_).anObject4109) >= 0)
				break;
			((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354_12_;
			((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
		}
		((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354;
		((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
	}

	void method15484(int i, byte i_13_) {
		Class354 class354 = ((AbstractQueue_Sub1) this).aClass354Array10072[i];
		int i_14_;
		for (int i_15_ = ((AbstractQueue_Sub1) this).anInt10070 * 1767048053 >>> 1; i < i_15_; i = i_14_) {
			int i_16_ = 1 + (i << 1);
			Class354 class354_17_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_16_];
			int i_18_ = 2 + (i << 1);
			Class354 class354_19_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_18_];
			if (null != ((AbstractQueue_Sub1) this).aComparator10071) {
				if (i_18_ < 1767048053 * ((AbstractQueue_Sub1) this).anInt10070 && (((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354_17_).anObject4109, ((Class354) class354_19_).anObject4109)) > 0)
					i_14_ = i_18_;
				else
					i_14_ = i_16_;
			} else if ((i_18_ < ((AbstractQueue_Sub1) this).anInt10070 * 1767048053) && (((Comparable) ((Class354) class354_17_).anObject4109).compareTo(((Class354) class354_19_).anObject4109)) > 0)
				i_14_ = i_18_;
			else
				i_14_ = i_16_;
			if (null != ((AbstractQueue_Sub1) this).aComparator10071) {
				if ((((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354).anObject4109, ((Class354) (((AbstractQueue_Sub1) this).aClass354Array10072[i_14_])).anObject4109)) <= 0)
					break;
			} else if ((((Comparable) ((Class354) class354).anObject4109).compareTo(((Class354) (((AbstractQueue_Sub1) this).aClass354Array10072[i_14_])).anObject4109)) <= 0)
				break;
			((AbstractQueue_Sub1) this).aClass354Array10072[i] = ((AbstractQueue_Sub1) this).aClass354Array10072[i_14_];
			((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = i * -449891505;
		}
		((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354;
		((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
	}

	public boolean contains(Object object) {
		return ((AbstractQueue_Sub1) this).aMap10069.containsKey(object);
	}

	public Object[] toArray() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator10071 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator10071);
		else
			Arrays.sort(objects);
		return objects;
	}

	public Iterator iterator() {
		return new Class380(this);
	}

	void method15485() {
		int i = 1 + (((AbstractQueue_Sub1) this).aClass354Array10072.length << 1);
		((AbstractQueue_Sub1) this).aClass354Array10072 = ((Class354[]) Arrays.copyOf(((AbstractQueue_Sub1) this).aClass354Array10072, i));
	}

	void method15486() {
		int i = 1 + (((AbstractQueue_Sub1) this).aClass354Array10072.length << 1);
		((AbstractQueue_Sub1) this).aClass354Array10072 = ((Class354[]) Arrays.copyOf(((AbstractQueue_Sub1) this).aClass354Array10072, i));
	}

	void method15487() {
		int i = 1 + (((AbstractQueue_Sub1) this).aClass354Array10072.length << 1);
		((AbstractQueue_Sub1) this).aClass354Array10072 = ((Class354[]) Arrays.copyOf(((AbstractQueue_Sub1) this).aClass354Array10072, i));
	}

	public int method15488() {
		return 1767048053 * ((AbstractQueue_Sub1) this).anInt10070;
	}

	public Object method15489() {
		if (1767048053 * ((AbstractQueue_Sub1) this).anInt10070 == 0)
			return null;
		return (((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[0]).anObject4109);
	}

	public Object method15490() {
		if (1767048053 * ((AbstractQueue_Sub1) this).anInt10070 == 0)
			return null;
		return (((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[0]).anObject4109);
	}

	public boolean method15491(Object object) {
		if (((AbstractQueue_Sub1) this).aMap10069.containsKey(object))
			throw new IllegalArgumentException("");
		((AbstractQueue_Sub1) this).anInt10073 += -967098159;
		int i = 1767048053 * ((AbstractQueue_Sub1) this).anInt10070;
		if (i >= ((AbstractQueue_Sub1) this).aClass354Array10072.length)
			method15479(766737653);
		((AbstractQueue_Sub1) this).anInt10070 += -284068643;
		if (0 == i) {
			((AbstractQueue_Sub1) this).aClass354Array10072[0] = new Class354(object, 0);
			((AbstractQueue_Sub1) this).aMap10069.put(object, ((AbstractQueue_Sub1) this).aClass354Array10072[0]);
		} else {
			((AbstractQueue_Sub1) this).aClass354Array10072[i] = new Class354(object, i);
			((AbstractQueue_Sub1) this).aMap10069.put(object, ((AbstractQueue_Sub1) this).aClass354Array10072[i]);
			method15483(i, 1415385407);
		}
		return true;
	}

	public AbstractQueue_Sub1(int i) {
		this(i, null);
	}

	public boolean offer(Object object) {
		if (((AbstractQueue_Sub1) this).aMap10069.containsKey(object))
			throw new IllegalArgumentException("");
		((AbstractQueue_Sub1) this).anInt10073 += -967098159;
		int i = 1767048053 * ((AbstractQueue_Sub1) this).anInt10070;
		if (i >= ((AbstractQueue_Sub1) this).aClass354Array10072.length)
			method15479(766737653);
		((AbstractQueue_Sub1) this).anInt10070 += -284068643;
		if (0 == i) {
			((AbstractQueue_Sub1) this).aClass354Array10072[0] = new Class354(object, 0);
			((AbstractQueue_Sub1) this).aMap10069.put(object, ((AbstractQueue_Sub1) this).aClass354Array10072[0]);
		} else {
			((AbstractQueue_Sub1) this).aClass354Array10072[i] = new Class354(object, i);
			((AbstractQueue_Sub1) this).aMap10069.put(object, ((AbstractQueue_Sub1) this).aClass354Array10072[i]);
			method15483(i, 989414609);
		}
		return true;
	}

	public int method15492() {
		return 1767048053 * ((AbstractQueue_Sub1) this).anInt10070;
	}

	public Object poll() {
		if (1767048053 * ((AbstractQueue_Sub1) this).anInt10070 == 0)
			return null;
		((AbstractQueue_Sub1) this).anInt10073 += -967098159;
		Object object = (((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[0]).anObject4109);
		((AbstractQueue_Sub1) this).aMap10069.remove(object);
		((AbstractQueue_Sub1) this).anInt10070 -= -284068643;
		if (((AbstractQueue_Sub1) this).anInt10070 * 1767048053 == 0)
			((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070] = null;
		else {
			((AbstractQueue_Sub1) this).aClass354Array10072[0] = (((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070]);
			((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[0]).anInt4108 = 0;
			((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070] = null;
			method15484(0, (byte) -32);
		}
		return object;
	}

	public int method15493() {
		return 1767048053 * ((AbstractQueue_Sub1) this).anInt10070;
	}

	public boolean method15494(Object object) {
		Class354 class354 = (Class354) ((AbstractQueue_Sub1) this).aMap10069.remove(object);
		if (null == class354)
			return false;
		((AbstractQueue_Sub1) this).anInt10073 += -967098159;
		((AbstractQueue_Sub1) this).anInt10070 -= -284068643;
		if (((Class354) class354).anInt4108 * -2042756177 == ((AbstractQueue_Sub1) this).anInt10070 * 1767048053) {
			((AbstractQueue_Sub1) this).aClass354Array10072[((AbstractQueue_Sub1) this).anInt10070 * 1767048053] = null;
			return true;
		}
		Class354 class354_20_ = (((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070]);
		((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070] = null;
		((AbstractQueue_Sub1) this).aClass354Array10072[-2042756177 * ((Class354) class354).anInt4108] = class354_20_;
		((Class354) (((AbstractQueue_Sub1) this).aClass354Array10072[-2042756177 * ((Class354) class354).anInt4108])).anInt4108 = ((Class354) class354).anInt4108 * 1;
		method15484(-2042756177 * ((Class354) class354).anInt4108, (byte) -74);
		if (class354_20_ == (((AbstractQueue_Sub1) this).aClass354Array10072[((Class354) class354).anInt4108 * -2042756177]))
			method15483(((Class354) class354).anInt4108 * -2042756177, 973790145);
		return true;
	}

	void method15495(int i) {
		Class354 class354 = ((AbstractQueue_Sub1) this).aClass354Array10072[i];
		int i_21_;
		for (/**/; i > 0; i = i_21_) {
			i_21_ = i - 1 >>> 1;
			Class354 class354_22_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_21_];
			if (((AbstractQueue_Sub1) this).aComparator10071 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354).anObject4109, ((Class354) class354_22_).anObject4109)) >= 0)
					break;
			} else if (((Comparable) ((Class354) class354).anObject4109).compareTo(((Class354) class354_22_).anObject4109) >= 0)
				break;
			((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354_22_;
			((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
		}
		((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354;
		((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
	}

	void method15496(int i) {
		Class354 class354 = ((AbstractQueue_Sub1) this).aClass354Array10072[i];
		int i_23_;
		for (int i_24_ = ((AbstractQueue_Sub1) this).anInt10070 * 1767048053 >>> 1; i < i_24_; i = i_23_) {
			int i_25_ = 1 + (i << 1);
			Class354 class354_26_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_25_];
			int i_27_ = 2 + (i << 1);
			Class354 class354_28_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_27_];
			if (null != ((AbstractQueue_Sub1) this).aComparator10071) {
				if (i_27_ < 1767048053 * ((AbstractQueue_Sub1) this).anInt10070 && (((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354_26_).anObject4109, ((Class354) class354_28_).anObject4109)) > 0)
					i_23_ = i_27_;
				else
					i_23_ = i_25_;
			} else if ((i_27_ < ((AbstractQueue_Sub1) this).anInt10070 * 1767048053) && (((Comparable) ((Class354) class354_26_).anObject4109).compareTo(((Class354) class354_28_).anObject4109)) > 0)
				i_23_ = i_27_;
			else
				i_23_ = i_25_;
			if (null != ((AbstractQueue_Sub1) this).aComparator10071) {
				if ((((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354).anObject4109, ((Class354) (((AbstractQueue_Sub1) this).aClass354Array10072[i_23_])).anObject4109)) <= 0)
					break;
			} else if ((((Comparable) ((Class354) class354).anObject4109).compareTo(((Class354) (((AbstractQueue_Sub1) this).aClass354Array10072[i_23_])).anObject4109)) <= 0)
				break;
			((AbstractQueue_Sub1) this).aClass354Array10072[i] = ((AbstractQueue_Sub1) this).aClass354Array10072[i_23_];
			((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = i * -449891505;
		}
		((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354;
		((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
	}

	public Object method15497() {
		if (1767048053 * ((AbstractQueue_Sub1) this).anInt10070 == 0)
			return null;
		((AbstractQueue_Sub1) this).anInt10073 += -967098159;
		Object object = (((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[0]).anObject4109);
		((AbstractQueue_Sub1) this).aMap10069.remove(object);
		((AbstractQueue_Sub1) this).anInt10070 -= -284068643;
		if (((AbstractQueue_Sub1) this).anInt10070 * 1767048053 == 0)
			((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070] = null;
		else {
			((AbstractQueue_Sub1) this).aClass354Array10072[0] = (((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070]);
			((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[0]).anInt4108 = 0;
			((AbstractQueue_Sub1) this).aClass354Array10072[1767048053 * ((AbstractQueue_Sub1) this).anInt10070] = null;
			method15484(0, (byte) 74);
		}
		return object;
	}

	public boolean method15498(Object object) {
		return ((AbstractQueue_Sub1) this).aMap10069.containsKey(object);
	}

	public boolean method15499(Object object) {
		return ((AbstractQueue_Sub1) this).aMap10069.containsKey(object);
	}

	public Object[] method15500() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator10071 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator10071);
		else
			Arrays.sort(objects);
		return objects;
	}

	public Object[] method15501() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator10071 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator10071);
		else
			Arrays.sort(objects);
		return objects;
	}

	public Object[] method15502() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator10071 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator10071);
		else
			Arrays.sort(objects);
		return objects;
	}

	public Object[] method15503() {
		Object[] objects = super.toArray();
		if (((AbstractQueue_Sub1) this).aComparator10071 != null)
			Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator10071);
		else
			Arrays.sort(objects);
		return objects;
	}

	void method15504(int i) {
		Class354 class354 = ((AbstractQueue_Sub1) this).aClass354Array10072[i];
		int i_29_;
		for (/**/; i > 0; i = i_29_) {
			i_29_ = i - 1 >>> 1;
			Class354 class354_30_ = ((AbstractQueue_Sub1) this).aClass354Array10072[i_29_];
			if (((AbstractQueue_Sub1) this).aComparator10071 != null) {
				if ((((AbstractQueue_Sub1) this).aComparator10071.compare(((Class354) class354).anObject4109, ((Class354) class354_30_).anObject4109)) >= 0)
					break;
			} else if (((Comparable) ((Class354) class354).anObject4109).compareTo(((Class354) class354_30_).anObject4109) >= 0)
				break;
			((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354_30_;
			((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
		}
		((AbstractQueue_Sub1) this).aClass354Array10072[i] = class354;
		((Class354) ((AbstractQueue_Sub1) this).aClass354Array10072[i]).anInt4108 = -449891505 * i;
	}

	public Iterator method15505() {
		return new Class380(this);
	}
}
