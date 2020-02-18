package com.jagex;

public abstract class Node_Sub21_Sub1 extends Node_Sub21 {

    Class111 aClass111_10058;
    String aString10057;
    String aString10056;
    int anInt10059;
    Class111 aClass111_10060;

    Node_Sub21_Sub1(Class122 class122_1) {
        aClass111_10058 = class122_1.aClass111_1529;
        aString10057 = class122_1.aString1530;
        aString10056 = class122_1.aString1532;
        anInt10059 = class122_1.anInt1528;
        aClass111_10060 = class122_1.aClass111_1533;
    }

    public abstract int method15453(int var1);

    String method15454() {
        return aString10057;
    }

    public abstract int method15455(int var1);

    public Class111 method15457() {
        return aClass111_10058;
    }

    public Class111 method15458() {
        return aClass111_10060;
    }

    public int method15459() {
        if (aClass111_10058 != Class111.aClass111_1109) {
            throw new IllegalArgumentException_Sub1();
        } else {
            return anInt10059;
        }
    }

    public String toString() {
        String string_1 = aClass111_10058 + " " + aString10057;
        if (aString10056 != null && !aString10056.isEmpty()) {
            string_1 = string_1 + " : " + aString10056;
        }
        return string_1;
    }

    public abstract int method15460(int var1);

    public abstract boolean method15461(int var1);

    public abstract boolean method15462(int var1);

    public abstract boolean method15463(int var1);

    public abstract boolean method15470(int var1);

    public abstract boolean method15471(int var1);

    public abstract int method15472(int var1);

    public abstract int method15473(int var1);
}
