package com.jagex;

public class Class452 {

    public Object anObject5443;
    public Object anObject5444;

    public Class452(Object object_1, Object object_2) {
        anObject5443 = object_1;
        anObject5444 = object_2;
    }

    public String toString() {
        return anObject5443 + ", " + anObject5444;
    }

    public boolean equals(Object object_1) {
        if (object_1 instanceof Class452) {
            Class452 class452_2 = (Class452) object_1;
            if (anObject5443 == null) {
                if (class452_2.anObject5443 != null) {
                    return false;
                }
            } else if (!anObject5443.equals(class452_2.anObject5443)) {
                return false;
            }

            if (anObject5444 == null) {
                return class452_2.anObject5444 == null;
            } else return anObject5444.equals(class452_2.anObject5444);
        } else {
            return false;
        }
    }

    public int hashCode() {
        int i_1 = 0;
        if (anObject5443 != null) {
            i_1 += anObject5443.hashCode();
        }

        if (anObject5444 != null) {
            i_1 += 31 * anObject5444.hashCode();
        }

        return i_1;
    }

}
