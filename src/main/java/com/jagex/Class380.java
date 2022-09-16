package com.jagex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class380 implements Iterator {

	static String aString4636;

	public static boolean method6450(char var_0) {
		return var_0 >= 48 && var_0 <= 57 || var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
	}

	static void method6451(int i_0, int i_1) {
		Class20.anInt180 = i_0;
		Class20.anInt181 = i_1;
	}

	int anInt4634;

	int anInt4635;

	AbstractQueue_Sub1 anAbstractQueue_Sub1_4633;

	Class380(AbstractQueue_Sub1 abstractqueue_sub1_1) {
		anInt4635 = anAbstractQueue_Sub1_4633.anInt10073;
		anAbstractQueue_Sub1_4633 = abstractqueue_sub1_1;
	}

	@Override
	public boolean hasNext() {
		return anInt4634 < anAbstractQueue_Sub1_4633.anInt10070;
	}

	@Override
	public Object next() {
		if (anAbstractQueue_Sub1_4633.anInt10073 != anInt4635)
			throw new ConcurrentModificationException();
		if (anInt4634 < anAbstractQueue_Sub1_4633.anInt10070) {
			Object object_1 = anAbstractQueue_Sub1_4633.aClass354Array10072[anInt4634].anObject4109;
			++anInt4634;
			return object_1;
		} else
			throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
