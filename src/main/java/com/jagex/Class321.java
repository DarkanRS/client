package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class321 {

	public static void method5757() {
		ParticleArchive1Def.aClass229_4031.method3859();
	}

	long aLong3726;

	int anInt3730;

	Class332 aClass332_3729;

	Map<Long, Comparable_Sub1> aMap3728;

	AbstractQueue_Sub1 anAbstractQueue_Sub1_3725;

	AbstractQueue_Sub1 anAbstractQueue_Sub1_3727;

	Class321(Class332 class332_4) {
		aLong3726 = -1;
		anInt3730 = 64;
		aClass332_3729 = class332_4;
		if (anInt3730 == -1) {
			aMap3728 = new HashMap<>(64);
			anAbstractQueue_Sub1_3725 = new AbstractQueue_Sub1(64);
			anAbstractQueue_Sub1_3727 = null;
		} else {
			if (aClass332_3729 == null)
				throw new IllegalArgumentException("");
			aMap3728 = new HashMap<>(anInt3730);
			anAbstractQueue_Sub1_3725 = new AbstractQueue_Sub1(anInt3730);
			anAbstractQueue_Sub1_3727 = new AbstractQueue_Sub1(anInt3730);
		}
	}

	public Node_Sub39 method5737(Long object_1) {
		synchronized (this) {
			if (aLong3726 != -1L)
				method5745();
			Comparable_Sub1 class328_4 = aMap3728.remove(object_1);
			Node_Sub39 object_5;
			if (class328_4 != null) {
				anAbstractQueue_Sub1_3725.remove(class328_4);
				if (method5738())
					anAbstractQueue_Sub1_3727.remove(class328_4);
				object_5 = class328_4.anObject3768;
			} else
				object_5 = null;
			return object_5;
		}
	}

	boolean method5738() {
		return anInt3730 != -1;
	}

	public Node_Sub39 method5739(Long object_1) {
		synchronized (this) {
			if (aLong3726 != -1L)
				method5745();
			Comparable_Sub1 class328_4 = aMap3728.get(object_1);
			Node_Sub39 object_5;
			if (class328_4 == null)
				object_5 = null;
			else {
				method5742(class328_4, false);
				object_5 = class328_4.anObject3768;
			}
			return object_5;
		}
	}

	public Node_Sub39 method5740(Long object_1, Node_Sub39 object_2) {
		synchronized (this) {
			if (aLong3726 != -1L)
				method5745();
			Comparable_Sub1 class328_5 = aMap3728.get(object_1);
			if (class328_5 != null) {
				Node_Sub39 object_9 = class328_5.anObject3768;
				class328_5.anObject3768 = object_2;
				method5742(class328_5, false);
				return object_9;
			}
			Comparable_Sub1 class328_6;
			if (method5738() && aMap3728.size() == anInt3730) {
				class328_6 = (Comparable_Sub1) anAbstractQueue_Sub1_3727.remove();
				aMap3728.remove(class328_6.anObject3770);
				anAbstractQueue_Sub1_3725.remove(class328_6);
			}
			class328_6 = new Comparable_Sub1(object_2, object_1);
			aMap3728.put(object_1, class328_6);
			method5742(class328_6, true);
			Node_Sub39 obj_7 = null;
			return obj_7;
		}
	}

	void method5742(Comparable_Sub1 class328_1, boolean bool_2) {
		if (!bool_2) {
			anAbstractQueue_Sub1_3725.remove(class328_1);
			if (method5738() && !anAbstractQueue_Sub1_3727.remove(class328_1))
				throw new IllegalStateException("");
		}
		class328_1.aLong3767 = System.currentTimeMillis();
		if (method5738()) {
			switch (aClass332_3729.anInt3876) {
			case 0:
				++class328_1.aLong3769;
				break;
			case 1:
				class328_1.aLong3769 = class328_1.aLong3767;
			}
			anAbstractQueue_Sub1_3727.add(class328_1);
		}
		anAbstractQueue_Sub1_3725.add(class328_1);
	}

	public void method5744() {
		synchronized (this) {
			aMap3728.clear();
			anAbstractQueue_Sub1_3725.clear();
			if (method5738())
				anAbstractQueue_Sub1_3727.clear();
		}
	}

	void method5745() {
		if (aLong3726 == -1L)
			throw new IllegalStateException("");
		long long_2 = System.currentTimeMillis() - aLong3726;
		while (!anAbstractQueue_Sub1_3725.isEmpty()) {
			Comparable_Sub1 class328_4 = (Comparable_Sub1) anAbstractQueue_Sub1_3725.peek();
			if (class328_4.aLong3767 >= long_2)
				break;
			aMap3728.remove(class328_4.anObject3770);
			anAbstractQueue_Sub1_3725.remove(class328_4);
			if (method5738())
				anAbstractQueue_Sub1_3727.remove(class328_4);
		}
	}
}
