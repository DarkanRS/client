package com.rs.jagex;

import java.util.*;

public class AbstractQueue_Sub1 extends AbstractQueue {

	public static short[][] SKIN_COLORS;
	Class354[] aClass354Array10072;
	int anInt10073;
	Map<Object, Class354> aMap10069;
	Comparator aComparator10071;
	int anInt10070;

	public AbstractQueue_Sub1(int i_1) {
		this(i_1, null);
	}

	AbstractQueue_Sub1(int i_1, Comparator comparator_2) {
		anInt10073 = 0;
		aClass354Array10072 = new Class354[i_1];
		aMap10069 = new HashMap<>();
		aComparator10071 = comparator_2;
	}

	@Override
	public boolean contains(Object object_1) {
		return aMap10069.containsKey(object_1);
	}

	@Override
	public Iterator iterator() {
		return new Class380(this);
	}

	void method15479() {
		int i_2 = (aClass354Array10072.length << 1) + 1;
		aClass354Array10072 = Arrays.copyOf(aClass354Array10072, i_2);
	}

	void method15483(int i_1) {
		int i_11 = i_1;
		Class354 class354_3;
		int i_4;
		for (class354_3 = aClass354Array10072[i_11]; i_11 > 0; i_11 = i_4) {
			i_4 = i_11 - 1 >>> 1;
			Class354 class354_5 = aClass354Array10072[i_4];
			if (aComparator10071 != null) {
				if (aComparator10071.compare(class354_3.anObject4109, class354_5.anObject4109) >= 0)
					break;
			} else if (((Comparable) class354_3.anObject4109).compareTo(class354_5.anObject4109) >= 0)
				break;

			aClass354Array10072[i_11] = class354_5;
			aClass354Array10072[i_11].anInt4108 = i_11;
		}

		aClass354Array10072[i_11] = class354_3;
		aClass354Array10072[i_11].anInt4108 = i_11;
	}

	void method15484(int i_1) {
		int i_11 = i_1;
		Class354 class354_3 = aClass354Array10072[i_11];

		int i_4;
		for (int i_5 = anInt10070 >>> 1; i_11 < i_5; i_11 = i_4) {
			int i_6 = (i_11 << 1) + 1;
			Class354 class354_7 = aClass354Array10072[i_6];
			int i_8 = (i_11 << 1) + 2;
			Class354 class354_9 = aClass354Array10072[i_8];
			if (aComparator10071 != null) {
				if (i_8 < anInt10070 && aComparator10071.compare(class354_7.anObject4109, class354_9.anObject4109) > 0)
					i_4 = i_8;
				else
					i_4 = i_6;
			} else if (i_8 < anInt10070 && ((Comparable) class354_7.anObject4109).compareTo(class354_9.anObject4109) > 0)
				i_4 = i_8;
			else
				i_4 = i_6;

			if (aComparator10071 != null) {
				if (aComparator10071.compare(class354_3.anObject4109, aClass354Array10072[i_4].anObject4109) <= 0)
					break;
			} else if (((Comparable) class354_3.anObject4109).compareTo(aClass354Array10072[i_4].anObject4109) <= 0)
				break;

			aClass354Array10072[i_11] = aClass354Array10072[i_4];
			aClass354Array10072[i_11].anInt4108 = i_11;
		}

		aClass354Array10072[i_11] = class354_3;
		aClass354Array10072[i_11].anInt4108 = i_11;
	}

	@Override
	public boolean offer(Object object_1) {
		if (aMap10069.containsKey(object_1))
			throw new IllegalArgumentException("");
		++anInt10073;
		int i_2 = anInt10070;
		if (i_2 >= aClass354Array10072.length)
			method15479();

		++anInt10070;
		if (i_2 == 0) {
			aClass354Array10072[0] = new Class354(object_1, 0);
			aMap10069.put(object_1, aClass354Array10072[0]);
		} else {
			aClass354Array10072[i_2] = new Class354(object_1, i_2);
			aMap10069.put(object_1, aClass354Array10072[i_2]);
			method15483(i_2);
		}

		return true;
	}

	@Override
	public Object peek() {
		return anInt10070 == 0 ? null : aClass354Array10072[0].anObject4109;
	}

	@Override
	public Object poll() {
		if (anInt10070 == 0)
			return null;
		++anInt10073;
		Object object_1 = aClass354Array10072[0].anObject4109;
		aMap10069.remove(object_1);
		--anInt10070;
		if (anInt10070 == 0)
			aClass354Array10072[anInt10070] = null;
		else {
			aClass354Array10072[0] = aClass354Array10072[anInt10070];
			aClass354Array10072[0].anInt4108 = 0;
			aClass354Array10072[anInt10070] = null;
			method15484(0);
		}

		return object_1;
	}

	@Override
	public boolean remove(Object object_1) {
		Class354 class354_2 = aMap10069.remove(object_1);
		if (class354_2 == null)
			return false;
		++anInt10073;
		--anInt10070;
		if (class354_2.anInt4108 == anInt10070)
			aClass354Array10072[anInt10070] = null;
		else {
			Class354 class354_3 = aClass354Array10072[anInt10070];
			aClass354Array10072[anInt10070] = null;
			aClass354Array10072[class354_2.anInt4108] = class354_3;
			aClass354Array10072[class354_2.anInt4108].anInt4108 = class354_2.anInt4108;
			method15484(class354_2.anInt4108);
			if (class354_3 == aClass354Array10072[class354_2.anInt4108])
				method15483(class354_2.anInt4108);

		}
		return true;
	}

	@Override
	public int size() {
		return anInt10070;
	}

	@Override
	public Object[] toArray() {
		Object[] arr_1 = super.toArray();
		if (aComparator10071 != null)
			Arrays.sort(arr_1, aComparator10071);
		else
			Arrays.sort(arr_1);

		return arr_1;
	}

}
