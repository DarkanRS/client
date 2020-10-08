package com.jagex;

public class Class107 {

    protected static int anInt1082;
    IterableNodeMap aClass465_1080;
    Node_Sub21[] aNode_Sub21Array1079;
    Interface11 anInterface11_1078;

    public Class107(int i_1, Interface11 interface11_2) {
        int i_3;
        for (i_3 = 1; i_3 < i_1; i_3 += i_3) {
        }
        aClass465_1080 = new IterableNodeMap(i_3);
        aNode_Sub21Array1079 = new Node_Sub21[i_3];
        anInterface11_1078 = interface11_2;
    }

    public Node_Sub21 method1820(String string_1) {
        long long_3 = anInterface11_1078.method79(string_1);
        for (Node_Sub21 class282_sub21_5 = (Node_Sub21) aClass465_1080.get(long_3); class282_sub21_5 != null; class282_sub21_5 = (Node_Sub21) aClass465_1080.method7747()) {
            if (class282_sub21_5.aString7674.equals(string_1)) {
                return class282_sub21_5;
            }
        }
        return null;
    }

    void method1821(int i_1) {
        Node_Sub21 class282_sub21_3 = method1823(i_1);
        if (class282_sub21_3 != null) {
            class282_sub21_3.unlink();
            aNode_Sub21Array1079[class282_sub21_3.anInt7675] = null;
        }
    }

    public void method1822(int i_1, String string_2, Node_Sub21 class282_sub21_3) {
        Node_Sub21 class282_sub21_5 = method1820(string_2);
        if (class282_sub21_5 != null && class282_sub21_5.anInt7675 != i_1) {
            throw new IllegalArgumentException(string_2);
        } else {
            method1821(i_1);
            if (i_1 >= aNode_Sub21Array1079.length) {
                int i_6;
                for (i_6 = aNode_Sub21Array1079.length; i_1 >= i_6; i_6 += i_6) {
                }
                aClass465_1080 = new IterableNodeMap(i_6);
                for (int i_7 = 0; i_7 < aNode_Sub21Array1079.length; i_7++) {
                    Node_Sub21 class282_sub21_10 = aNode_Sub21Array1079[i_7];
                    if (class282_sub21_10 != null) {
                        aClass465_1080.put(class282_sub21_10, class282_sub21_10.pointer);
                    }
                }
                Node_Sub21[] arr_9 = new Node_Sub21[i_6];
                System.arraycopy(aNode_Sub21Array1079, 0, arr_9, 0, aNode_Sub21Array1079.length);
                aNode_Sub21Array1079 = arr_9;
            }
            class282_sub21_3.anInt7675 = i_1;
            class282_sub21_3.aString7674 = string_2;
            aClass465_1080.put(class282_sub21_3, anInterface11_1078.method79(string_2));
            aNode_Sub21Array1079[i_1] = class282_sub21_3;
        }
    }

    public Node_Sub21 method1823(int i_1) {
        return i_1 >= aNode_Sub21Array1079.length ? null : aNode_Sub21Array1079[i_1];
    }
}
