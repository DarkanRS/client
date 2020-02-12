package com.jagex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class380 implements Iterator {

    static String aString4636;

    int anInt4634 = 0;

    int anInt4635;

    AbstractQueue_Sub1 anAbstractQueue_Sub1_4633;

    public Object next() {
        if (this.anAbstractQueue_Sub1_4633.anInt10073 != this.anInt4635) {
            throw new ConcurrentModificationException();
        } else if (this.anInt4634 < this.anAbstractQueue_Sub1_4633.anInt10070) {
            Object object_1 = this.anAbstractQueue_Sub1_4633.aClass354Array10072[this.anInt4634].anObject4109;
            ++this.anInt4634;
            return object_1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.anInt4634 < this.anAbstractQueue_Sub1_4633.anInt10070;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    Class380(AbstractQueue_Sub1 abstractqueue_sub1_1) {
        this.anInt4635 = this.anAbstractQueue_Sub1_4633.anInt10073;
        this.anAbstractQueue_Sub1_4633 = abstractqueue_sub1_1;
    }

    public static boolean method6450(char var_0, int i_1) {
        return var_0 >= 48 && var_0 <= 57 || var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
    }

    static void method6451(int i_0, int i_1, int i_2) {
        Class20.anInt180 = i_0;
        Class20.anInt181 = i_1;
    }
}
