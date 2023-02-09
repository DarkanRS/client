package com.rs.jagex;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public class Class428 {

	int anInt5125;

	WeakReference_Sub1[] aWeakReference_Sub1Array5124 = new WeakReference_Sub1[16];

	ReferenceQueue aReferenceQueue5126 = new ReferenceQueue();

	void method7190() {
		while (true) {
			WeakReference_Sub1 weakreference_sub1_2 = (WeakReference_Sub1) aReferenceQueue5126.poll();
			if (weakreference_sub1_2 == null)
				return;
			int i_3 = weakreference_sub1_2.anInt10067 & aWeakReference_Sub1Array5124.length - 1;
			WeakReference_Sub1 weakreference_sub1_4 = aWeakReference_Sub1Array5124[i_3];
			if (weakreference_sub1_2 == weakreference_sub1_4) {
				aWeakReference_Sub1Array5124[i_3] = weakreference_sub1_2.aWeakReference_Sub1_10066;
				--anInt5125;
			} else {
				while (weakreference_sub1_4 != null && weakreference_sub1_2 != weakreference_sub1_4.aWeakReference_Sub1_10066)
					weakreference_sub1_4 = weakreference_sub1_4.aWeakReference_Sub1_10066;
				if (weakreference_sub1_4 != null) {
					weakreference_sub1_4.aWeakReference_Sub1_10066 = weakreference_sub1_2.aWeakReference_Sub1_10066;
					--anInt5125;
				}
			}
		}
	}

	public void method7191(Interface7 object_1) {
		if (object_1 == null)
			throw new NullPointerException();
		method7190();
		int i_3 = System.identityHashCode(object_1);
		int i_4 = i_3 & aWeakReference_Sub1Array5124.length - 1;
		WeakReference_Sub1 weakreference_sub1_5 = aWeakReference_Sub1Array5124[i_4];
		if (weakreference_sub1_5 != null)
			if (weakreference_sub1_5.get() == object_1) {
				aWeakReference_Sub1Array5124[i_4] = weakreference_sub1_5.aWeakReference_Sub1_10066;
				--anInt5125;
			} else
				while (true) {
					WeakReference_Sub1 weakreference_sub1_6 = weakreference_sub1_5.aWeakReference_Sub1_10066;
					if (weakreference_sub1_6 == null)
						break;
					if (weakreference_sub1_6.get() == object_1) {
						weakreference_sub1_5.aWeakReference_Sub1_10066 = weakreference_sub1_6.aWeakReference_Sub1_10066;
						--anInt5125;
						break;
					}
					weakreference_sub1_5 = weakreference_sub1_6;
				}
	}

	public ArrayList method7193() {
		method7190();
		ArrayList arraylist_2 = new ArrayList(anInt5125);
		WeakReference_Sub1[] arr_3 = aWeakReference_Sub1Array5124;
		for (WeakReference_Sub1 element : arr_3)
			for (WeakReference_Sub1 weakreference_sub1_5 = element; weakreference_sub1_5 != null; weakreference_sub1_5 = weakreference_sub1_5.aWeakReference_Sub1_10066) {
				Object object_6 = weakreference_sub1_5.get();
				if (object_6 != null)
					arraylist_2.add(object_6);
			}
		return arraylist_2;
	}

	void method7194() {
		WeakReference_Sub1[] arr_2 = aWeakReference_Sub1Array5124;
		aWeakReference_Sub1Array5124 = new WeakReference_Sub1[arr_2.length * 2];
		WeakReference_Sub1[] arr_3 = arr_2;
		WeakReference_Sub1 weakreference_sub1_5;
		for (WeakReference_Sub1 element : arr_3)
			for (WeakReference_Sub1 weakreference_sub1_6 = element; weakreference_sub1_6 != null; weakreference_sub1_6 = weakreference_sub1_5) {
				weakreference_sub1_5 = weakreference_sub1_6.aWeakReference_Sub1_10066;
				int i_7 = weakreference_sub1_6.anInt10067 & aWeakReference_Sub1Array5124.length - 1;
				weakreference_sub1_6.aWeakReference_Sub1_10066 = aWeakReference_Sub1Array5124[i_7];
				aWeakReference_Sub1Array5124[i_7] = weakreference_sub1_6;
			}
	}

	public void method7201(Interface7 object_1) {
		if (object_1 == null)
			throw new NullPointerException();
		method7190();
		int i_4 = System.identityHashCode(object_1);
		int i_5 = i_4 & aWeakReference_Sub1Array5124.length - 1;
		WeakReference_Sub1 weakreference_sub1_6 = aWeakReference_Sub1Array5124[i_5];
		if (weakreference_sub1_6 == null) {
			aWeakReference_Sub1Array5124[i_5] = new WeakReference_Sub1(object_1, aReferenceQueue5126, i_4);
			++anInt5125;
			if (anInt5125 >= aWeakReference_Sub1Array5124.length)
				method7194();
		} else
			while (weakreference_sub1_6.get() != object_1) {
				if (weakreference_sub1_6.aWeakReference_Sub1_10066 == null) {
					weakreference_sub1_6.aWeakReference_Sub1_10066 = new WeakReference_Sub1(object_1, aReferenceQueue5126, i_4);
					++anInt5125;
					if (anInt5125 >= aWeakReference_Sub1Array5124.length)
						method7194();
					break;
				}
				weakreference_sub1_6 = weakreference_sub1_6.aWeakReference_Sub1_10066;
			}
	}
}
