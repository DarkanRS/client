package com.jagex;

public abstract class Shader {

    static Interface11 anInterface11_1012 = new Class82();

    protected int anInt1015 = -1;

    String aString1014;

    int anInt1009;

    Class107 aClass107_1013;

    int anInt1016;

    Class107 aClass107_1011;

    Class115[] aClass115Array1010;

    Shader(HardwareRenderer class505_sub2_1, ShaderLoader class114_2) {
        aString1014 = class114_2.name;
        anInt1009 = class114_2.aClass122Array1236.length;
        aClass107_1013 = new Class107(anInt1009, anInterface11_1012);
        int i_3;
        for (i_3 = 0; i_3 < anInt1009; i_3++) {
            aClass107_1013.method1822(i_3, class114_2.aClass122Array1236[i_3].aString1530, method1765(class114_2.aClass122Array1236[i_3]));
        }
        anInt1016 = class114_2.aClass122Array1240.length;
        aClass107_1011 = new Class107(anInt1016, anInterface11_1012);
        for (i_3 = 0; i_3 < anInt1016; i_3++) {
            aClass107_1011.method1822(i_3, class114_2.aClass122Array1240[i_3].aString1530, method1765(class114_2.aClass122Array1240[i_3]));
        }
        aClass115Array1010 = new Class115[class114_2.aClass99Array1241.length];
        for (i_3 = 0; i_3 < class114_2.aClass99Array1241.length; i_3++) {
            aClass115Array1010[i_3] = method1743(class505_sub2_1, class114_2.aClass99Array1241[i_3]);
        }
    }

    static void getSortedStringIndices(String[] strings, int[] ints, int fromIndex, int toIndex) {
        if (fromIndex < toIndex) {
            int middle = (toIndex + fromIndex) / 2;
            int i_6 = fromIndex;
            String string_7 = strings[middle];
            strings[middle] = strings[toIndex];
            strings[toIndex] = string_7;
            int i_8 = ints[middle];
            ints[middle] = ints[toIndex];
            ints[toIndex] = i_8;
            for (int i_9 = fromIndex; i_9 < toIndex; i_9++) {
                if (string_7 == null || strings[i_9] != null && strings[i_9].compareTo(string_7) < (i_9 & 0x1)) {
                    String string_10 = strings[i_9];
                    strings[i_9] = strings[i_6];
                    strings[i_6] = string_10;
                    int i_11 = ints[i_9];
                    ints[i_9] = ints[i_6];
                    ints[i_6++] = i_11;
                }
            }
            strings[toIndex] = strings[i_6];
            strings[i_6] = string_7;
            ints[toIndex] = ints[i_6];
            ints[i_6] = i_8;
            getSortedStringIndices(strings, ints, fromIndex, i_6 - 1);
            getSortedStringIndices(strings, ints, i_6 + 1, toIndex);
        }
    }

    public static void method1774() {
        if (Class9.loginStage == 105) {
            Class9.loginStage = 115;
        }
    }

    public static int getContainerFreeSpace(int i_0) {
        ItemContainer container = ItemContainer.getContainer(i_0, false);
        if (container == null) {
            return IndexLoaders.INVENTORY_LOADER.getInventoryDef(i_0).maxSize;
        } else {
            int i_4 = 0;
            for (int i_5 = 0; i_5 < container.itemIds.length; i_5++) {
                if (container.itemIds[i_5] == -1) {
                    ++i_4;
                }
            }
            i_4 += IndexLoaders.INVENTORY_LOADER.getInventoryDef(i_0).maxSize - container.itemIds.length;
            return i_4;
        }
    }

    public abstract void method1646();

    public abstract void method1647();

    public abstract boolean method1648();

    public int method1650() {
        return aClass115Array1010.length;
    }

    public Class115 method1651(String string_1) throws Exception_Sub2_Sub1 {
        Class115[] arr_3 = aClass115Array1010;
        for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
            Class115 class115_5 = arr_3[i_4];
            String string_6 = class115_5.method1892();
            if (string_6 != null && string_6.equals(string_1)) {
                if (!class115_5.method1899()) {
                    throw new Exception_Sub2_Sub1(string_1);
                }
                return class115_5;
            }
        }
        throw new Exception_Sub2_Sub1(string_1);
    }

    public Class115 method1652(int i_1) {
        return aClass115Array1010[i_1];
    }

    public int method1653(Class115 class115_1) {
        for (int i_3 = 0; i_3 < aClass115Array1010.length; i_3++) {
            if (aClass115Array1010[i_3] == class115_1) {
                return i_3;
            }
        }
        return -1;
    }

    public Class115 method1654() {
        Class115[] arr_2 = aClass115Array1010;
        for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
            Class115 class115_4 = arr_2[i_3];
            if (class115_4.method1899()) {
                return class115_4;
            }
        }
        return null;
    }

    public abstract boolean method1655(Class115 var1);

    public Class115 method1656() {
        return anInt1015 >= 0 ? aClass115Array1010[anInt1015] : null;
    }

    public void method1658(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3) {
        aClass115Array1010[anInt1015].method1923(class282_sub21_sub1_1, f_2, f_3);
    }

    public void method1659(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2) {
        aClass115Array1010[anInt1015].method1894(class282_sub21_sub1_1, f_2);
    }

    public void method1661(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
        aClass115Array1010[anInt1015].method1939(class282_sub21_sub1_1, f_2, f_3, f_4);
    }

    public void method1662(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
        aClass115Array1010[anInt1015].method1897(class282_sub21_sub1_1, f_2, f_3, f_4, f_5);
    }

    public void method1663(Node_Sub21_Sub1 class282_sub21_sub1_1, Vector3 vector3_2) {
        aClass115Array1010[anInt1015].method1939(class282_sub21_sub1_1, vector3_2.x, vector3_2.y, vector3_2.z);
    }

    public abstract boolean method1664();

    abstract Class115 method1665(HardwareRenderer var1, Class99 var2);

    public void method1667(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
        aClass115Array1010[anInt1015].method1936(class282_sub21_sub1_1, matrix44_2);
    }

    public void method1668(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
        aClass115Array1010[anInt1015].method1891(class282_sub21_sub1_1, matrix44_2);
    }

    public void method1670(int i_1, float f_2, float f_3, float f_4) {
        aClass115Array1010[anInt1015].method1893(i_1, f_2, f_3, f_4);
    }

    public void method1671(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3) {
        aClass115Array1010[anInt1015].method1896(class282_sub21_sub1_1, i_2, interface30_3);
    }

    public void method1672(int i_1, Vector3 vector3_2) {
        aClass115Array1010[anInt1015].method1893(i_1, vector3_2.x, vector3_2.y, vector3_2.z);
    }

    public void method1673(int i_1, float[] floats_2, int i_3) {
        aClass115Array1010[anInt1015].method1904(i_1, floats_2, i_3);
    }

    public void method1674(int i_1, Matrix44 matrix44_2) {
        aClass115Array1010[anInt1015].method1905(i_1, matrix44_2);
    }

    public void method1675(int i_1, Matrix44 matrix44_2) {
        aClass115Array1010[anInt1015].method1906(i_1, matrix44_2);
    }

    public void method1676(int i_1, Matrix44 matrix44_2) {
        aClass115Array1010[anInt1015].method1900(i_1, matrix44_2);
    }

    public void method1677(int i_1, int i_2, Interface30 interface30_3) {
        aClass115Array1010[anInt1015].method1908(i_1, i_2, interface30_3);
    }

    public abstract void method1678();

    public int method1679() {
        return anInt1016;
    }

    public Node_Sub21_Sub1 method1681(String string_1) {
        return (Node_Sub21_Sub1) aClass107_1011.method1820(string_1);
    }

    public int method1682() {
        return anInt1009;
    }

    abstract Class115 method1683(HardwareRenderer var1, Class99 var2);

    void method1684() {
    }

    public abstract void method1685();

    public abstract void method1686();

    public abstract void method1687();

    public void method1688(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2) {
        aClass115Array1010[anInt1015].method1903(class282_sub21_sub1_1, floats_2, floats_2.length);
    }

    public void method1689(Node_Sub21_Sub1 class282_sub21_sub1_1, Vector4 vector4_2) {
        aClass115Array1010[anInt1015].method1897(class282_sub21_sub1_1, vector4_2.x, vector4_2.y, vector4_2.z, vector4_2.w);
    }

    public abstract void method1690();

    public Node_Sub21_Sub1 method1691(String string_1) throws Exception_Sub2_Sub2 {
        Node_Sub21_Sub1 class282_sub21_sub1_3 = (Node_Sub21_Sub1) aClass107_1013.method1820(string_1);
        if (class282_sub21_sub1_3 == null) {
            throw new Exception_Sub2_Sub2(string_1);
        } else {
            return class282_sub21_sub1_3;
        }
    }

    public abstract boolean method1692();

    public abstract boolean method1693();

    abstract Node_Sub21_Sub1 method1694(Class122 var1);

    public void method1696(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2) {
        float f_4 = (i_2 >> 16 & 0xff) / 255.0F;
        float f_5 = (i_2 >> 8 & 0xff) / 255.0F;
        float f_6 = (i_2 & 0xff) / 255.0F;
        float f_7 = (i_2 >> 24 & 0xff) / 255.0F;
        method1662(class282_sub21_sub1_1, f_4, f_5, f_6, f_7);
    }

    abstract Class115 method1697(HardwareRenderer var1, Class99 var2);

    public Node_Sub21_Sub1 method1705(int i_1) {
        return (Node_Sub21_Sub1) aClass107_1011.method1823(i_1);
    }

    public abstract boolean method1706(Class115 var1);

    public abstract boolean method1707(Class115 var1);

    abstract Node_Sub21_Sub1 method1712(Class122 var1);

    public abstract void method1713();

    public int method1714() {
        return anInt1015;
    }

    public String method1717() {
        return aString1014;
    }

    public abstract boolean method1734();

    public Node_Sub21_Sub1 method1742(int i_1) {
        return (Node_Sub21_Sub1) aClass107_1013.method1823(i_1);
    }

    abstract Class115 method1743(HardwareRenderer var1, Class99 var2);

    public void method1749(int i_1, float f_2, float f_3, float f_4, float f_5) {
        aClass115Array1010[anInt1015].method1895(i_1, f_2, f_3, f_4, f_5);
    }

    abstract Node_Sub21_Sub1 method1765(Class122 var1);
}
