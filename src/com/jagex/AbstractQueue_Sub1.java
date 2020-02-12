package com.jagex;

import java.util.*;

public class AbstractQueue_Sub1 extends AbstractQueue {

    public static short[][] SKIN_COLORS;
    Class354[] aClass354Array10072;
    int anInt10073;
    Map aMap10069;
    Comparator aComparator10071;
    int anInt10070;

    void method15479() {
        int i_2 = (this.aClass354Array10072.length << 1) + 1;
        this.aClass354Array10072 = Arrays.copyOf(this.aClass354Array10072, i_2);
    }

    AbstractQueue_Sub1(int i_1, Comparator comparator_2) {
        this.anInt10073 = 0;
        this.aClass354Array10072 = new Class354[i_1];
        this.aMap10069 = new HashMap();
        this.aComparator10071 = comparator_2;
    }

    public int size() {
        return this.anInt10070;
    }

    public Object peek() {
        return this.anInt10070 == 0 ? null : this.aClass354Array10072[0].anObject4109;
    }

    public boolean remove(Object object_1) {
        Class354 class354_2 = (Class354) this.aMap10069.remove(object_1);
        if (class354_2 == null) {
            return false;
        } else {
            ++this.anInt10073;
            --this.anInt10070;
            if (class354_2.anInt4108 == this.anInt10070) {
                this.aClass354Array10072[this.anInt10070] = null;
                return true;
            } else {
                Class354 class354_3 = this.aClass354Array10072[this.anInt10070];
                this.aClass354Array10072[this.anInt10070] = null;
                this.aClass354Array10072[class354_2.anInt4108] = class354_3;
                this.aClass354Array10072[class354_2.anInt4108].anInt4108 = class354_2.anInt4108;
                this.method15484(class354_2.anInt4108, (byte) -48);
                if (class354_3 == this.aClass354Array10072[class354_2.anInt4108]) {
                    this.method15483(class354_2.anInt4108, 1780723121);
                }

                return true;
            }
        }
    }

    void method15483(int i_1, int i_2) {
        Class354 class354_3;
        int i_4;
        for (class354_3 = this.aClass354Array10072[i_1]; i_1 > 0; i_1 = i_4) {
            i_4 = i_1 - 1 >>> 1;
            Class354 class354_5 = this.aClass354Array10072[i_4];
            if (this.aComparator10071 != null) {
                if (this.aComparator10071.compare(class354_3.anObject4109, class354_5.anObject4109) >= 0) {
                    break;
                }
            } else if (((Comparable) class354_3.anObject4109).compareTo(class354_5.anObject4109) >= 0) {
                break;
            }

            this.aClass354Array10072[i_1] = class354_5;
            this.aClass354Array10072[i_1].anInt4108 = i_1;
        }

        this.aClass354Array10072[i_1] = class354_3;
        this.aClass354Array10072[i_1].anInt4108 = i_1;
    }

    void method15484(int i_1, byte b_2) {
        Class354 class354_3 = this.aClass354Array10072[i_1];

        int i_4;
        for (int i_5 = this.anInt10070 >>> 1; i_1 < i_5; i_1 = i_4) {
            int i_6 = (i_1 << 1) + 1;
            Class354 class354_7 = this.aClass354Array10072[i_6];
            int i_8 = (i_1 << 1) + 2;
            Class354 class354_9 = this.aClass354Array10072[i_8];
            if (this.aComparator10071 != null) {
                if (i_8 < this.anInt10070 && this.aComparator10071.compare(class354_7.anObject4109, class354_9.anObject4109) > 0) {
                    i_4 = i_8;
                } else {
                    i_4 = i_6;
                }
            } else if (i_8 < this.anInt10070 && ((Comparable) class354_7.anObject4109).compareTo(class354_9.anObject4109) > 0) {
                i_4 = i_8;
            } else {
                i_4 = i_6;
            }

            if (this.aComparator10071 != null) {
                if (this.aComparator10071.compare(class354_3.anObject4109, this.aClass354Array10072[i_4].anObject4109) <= 0) {
                    break;
                }
            } else if (((Comparable) class354_3.anObject4109).compareTo(this.aClass354Array10072[i_4].anObject4109) <= 0) {
                break;
            }

            this.aClass354Array10072[i_1] = this.aClass354Array10072[i_4];
            this.aClass354Array10072[i_1].anInt4108 = i_1;
        }

        this.aClass354Array10072[i_1] = class354_3;
        this.aClass354Array10072[i_1].anInt4108 = i_1;
    }

    public boolean contains(Object object_1) {
        return this.aMap10069.containsKey(object_1);
    }

    public Object[] toArray() {
        Object[] arr_1 = super.toArray();
        if (this.aComparator10071 != null) {
            Arrays.sort(arr_1, this.aComparator10071);
        } else {
            Arrays.sort(arr_1);
        }

        return arr_1;
    }

    public Iterator iterator() {
        return new Class380(this);
    }

    public AbstractQueue_Sub1(int i_1) {
        this(i_1, null);
    }

    public boolean offer(Object object_1) {
        if (this.aMap10069.containsKey(object_1)) {
            throw new IllegalArgumentException("");
        } else {
            ++this.anInt10073;
            int i_2 = this.anInt10070;
            if (i_2 >= this.aClass354Array10072.length) {
                this.method15479();
            }

            ++this.anInt10070;
            if (i_2 == 0) {
                this.aClass354Array10072[0] = new Class354(object_1, 0);
                this.aMap10069.put(object_1, this.aClass354Array10072[0]);
            } else {
                this.aClass354Array10072[i_2] = new Class354(object_1, i_2);
                this.aMap10069.put(object_1, this.aClass354Array10072[i_2]);
                this.method15483(i_2, 989414609);
            }

            return true;
        }
    }

    public Object poll() {
        if (this.anInt10070 == 0) {
            return null;
        } else {
            ++this.anInt10073;
            Object object_1 = this.aClass354Array10072[0].anObject4109;
            this.aMap10069.remove(object_1);
            --this.anInt10070;
            if (this.anInt10070 == 0) {
                this.aClass354Array10072[this.anInt10070] = null;
            } else {
                this.aClass354Array10072[0] = this.aClass354Array10072[this.anInt10070];
                this.aClass354Array10072[0].anInt4108 = 0;
                this.aClass354Array10072[this.anInt10070] = null;
                this.method15484(0, (byte) -32);
            }

            return object_1;
        }
    }

}
