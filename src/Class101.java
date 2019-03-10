public abstract class Class101 {

    static Interface11 anInterface11_1012 = new Class82();

    protected int anInt1015 = -1;

    String aString1014;

    int anInt1009;

    Class107 aClass107_1013;

    int anInt1016;

    Class107 aClass107_1011;

    Class115[] aClass115Array1010;

    public abstract void method1646();

    public abstract void method1647();

    public abstract boolean method1648();

    public final int method1650(int i_1) {
        return this.aClass115Array1010.length;
    }

    public Class115 method1651(String string_1, int i_2) throws Exception_Sub2_Sub1 {
        Class115[] arr_3 = this.aClass115Array1010;
        for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
            Class115 class115_5 = arr_3[i_4];
            String string_6 = class115_5.method1892((byte) -1);
            if (string_6 != null && string_6.equals(string_1)) {
                if (!class115_5.method1899()) {
                    throw new Exception_Sub2_Sub1(string_1);
                }
                return class115_5;
            }
        }
        throw new Exception_Sub2_Sub1(string_1);
    }

    Class101(Class505_Sub2 class505_sub2_1, Class114 class114_2) {
        this.aString1014 = class114_2.aString1237;
        this.anInt1009 = class114_2.aClass122Array1236.length;
        this.aClass107_1013 = new Class107(this.anInt1009, anInterface11_1012);
        int i_3;
        for (i_3 = 0; i_3 < this.anInt1009; i_3++) {
            this.aClass107_1013.method1822(i_3, class114_2.aClass122Array1236[i_3].aString1530, this.method1765(class114_2.aClass122Array1236[i_3]), 2010834409);
        }
        this.anInt1016 = class114_2.aClass122Array1240.length;
        this.aClass107_1011 = new Class107(this.anInt1016, anInterface11_1012);
        for (i_3 = 0; i_3 < this.anInt1016; i_3++) {
            this.aClass107_1011.method1822(i_3, class114_2.aClass122Array1240[i_3].aString1530, this.method1765(class114_2.aClass122Array1240[i_3]), 2010834409);
        }
        this.aClass115Array1010 = new Class115[class114_2.aClass99Array1241.length];
        for (i_3 = 0; i_3 < class114_2.aClass99Array1241.length; i_3++) {
            this.aClass115Array1010[i_3] = this.method1743(class505_sub2_1, class114_2.aClass99Array1241[i_3]);
        }
    }

    public final Class115 method1652(int i_1, byte b_2) {
        return this.aClass115Array1010[i_1];
    }

    public int method1653(Class115 class115_1, byte b_2) {
        for (int i_3 = 0; i_3 < this.aClass115Array1010.length; i_3++) {
            if (this.aClass115Array1010[i_3] == class115_1) {
                return i_3;
            }
        }
        return -1;
    }

    public Class115 method1654(int i_1) {
        Class115[] arr_2 = this.aClass115Array1010;
        for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
            Class115 class115_4 = arr_2[i_3];
            if (class115_4.method1899()) {
                return class115_4;
            }
        }
        return null;
    }

    public abstract boolean method1655(Class115 var1);

    public final Class115 method1656(int i_1) {
        return this.anInt1015 >= 0 ? this.aClass115Array1010[this.anInt1015] : null;
    }

    public final void method1658(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, int i_4) {
        this.aClass115Array1010[this.anInt1015].method1923(class282_sub21_sub1_1, f_2, f_3);
    }

    public final void method1659(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, short s_3) {
        this.aClass115Array1010[this.anInt1015].method1894(class282_sub21_sub1_1, f_2);
    }

    public final void method1661(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, byte b_5) {
        this.aClass115Array1010[this.anInt1015].method1939(class282_sub21_sub1_1, f_2, f_3, f_4);
    }

    public final void method1662(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5, byte b_6) {
        this.aClass115Array1010[this.anInt1015].method1897(class282_sub21_sub1_1, f_2, f_3, f_4, f_5);
    }

    public final void method1663(Class282_Sub21_Sub1 class282_sub21_sub1_1, Vector3 vector3_2, int i_3) {
        this.aClass115Array1010[this.anInt1015].method1939(class282_sub21_sub1_1, vector3_2.x, vector3_2.y, vector3_2.z);
    }

    public abstract boolean method1664();

    abstract Class115 method1665(Class505_Sub2 var1, Class99 var2);

    public final void method1667(Class282_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2, int i_3) {
        this.aClass115Array1010[this.anInt1015].method1936(class282_sub21_sub1_1, matrix44arr_2);
    }

    public final void method1668(Class282_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2, byte b_3) {
        this.aClass115Array1010[this.anInt1015].method1891(class282_sub21_sub1_1, matrix44arr_2);
    }

    public final void method1670(int i_1, float f_2, float f_3, float f_4, int i_5) {
        this.aClass115Array1010[this.anInt1015].method1893(i_1, f_2, f_3, f_4);
    }

    public final void method1671(Class282_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3, byte b_4) {
        this.aClass115Array1010[this.anInt1015].method1896(class282_sub21_sub1_1, i_2, interface30_3);
    }

    public final void method1672(int i_1, Vector3 vector3_2, byte b_3) {
        this.aClass115Array1010[this.anInt1015].method1893(i_1, vector3_2.x, vector3_2.y, vector3_2.z);
    }

    public final void method1673(int i_1, float[] floats_2, int i_3, int i_4) {
        this.aClass115Array1010[this.anInt1015].method1904(i_1, floats_2, i_3);
    }

    public final void method1674(int i_1, Matrix44Arr matrix44arr_2, int i_3) {
        this.aClass115Array1010[this.anInt1015].method1905(i_1, matrix44arr_2);
    }

    public final void method1675(int i_1, Matrix44Arr matrix44arr_2, byte b_3) {
        this.aClass115Array1010[this.anInt1015].method1906(i_1, matrix44arr_2);
    }

    public final void method1676(int i_1, Matrix44Arr matrix44arr_2, int i_3) {
        this.aClass115Array1010[this.anInt1015].method1900(i_1, matrix44arr_2);
    }

    public final void method1677(int i_1, int i_2, Interface30 interface30_3, int i_4) {
        this.aClass115Array1010[this.anInt1015].method1908(i_1, i_2, interface30_3);
    }

    public abstract void method1678();

    public int method1679(int i_1) {
        return this.anInt1016;
    }

    public Class282_Sub21_Sub1 method1681(String string_1, byte b_2) {
        return (Class282_Sub21_Sub1) this.aClass107_1011.method1820(string_1, -2115714822);
    }

    public int method1682(int i_1) {
        return this.anInt1009;
    }

    abstract Class115 method1683(Class505_Sub2 var1, Class99 var2);

    void method1684() {
    }

    public abstract void method1685();

    public abstract void method1686();

    public abstract void method1687();

    public final void method1688(Class282_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
        this.aClass115Array1010[this.anInt1015].method1903(class282_sub21_sub1_1, floats_2, floats_2.length);
    }

    public final void method1689(Class282_Sub21_Sub1 class282_sub21_sub1_1, Vector4 vector4_2, int i_3) {
        this.aClass115Array1010[this.anInt1015].method1897(class282_sub21_sub1_1, vector4_2.x, vector4_2.y, vector4_2.z, vector4_2.w);
    }

    public abstract void method1690();

    public Class282_Sub21_Sub1 method1691(String string_1, short s_2) throws Exception_Sub2_Sub2 {
        Class282_Sub21_Sub1 class282_sub21_sub1_3 = (Class282_Sub21_Sub1) this.aClass107_1013.method1820(string_1, -2068288662);
        if (class282_sub21_sub1_3 == null) {
            throw new Exception_Sub2_Sub2(string_1);
        } else {
            return class282_sub21_sub1_3;
        }
    }

    public abstract boolean method1692();

    public abstract boolean method1693();

    abstract Class282_Sub21_Sub1 method1694(Class122 var1);

    public final void method1696(Class282_Sub21_Sub1 class282_sub21_sub1_1, int i_2, int i_3) {
        float f_4 = (float) (i_2 >> 16 & 0xff) / 255.0F;
        float f_5 = (float) (i_2 >> 8 & 0xff) / 255.0F;
        float f_6 = (float) (i_2 & 0xff) / 255.0F;
        float f_7 = (float) (i_2 >> 24 & 0xff) / 255.0F;
        this.method1662(class282_sub21_sub1_1, f_4, f_5, f_6, f_7, (byte) -41);
    }

    abstract Class115 method1697(Class505_Sub2 var1, Class99 var2);

    public Class282_Sub21_Sub1 method1705(int i_1, int i_2) {
        return (Class282_Sub21_Sub1) this.aClass107_1011.method1823(i_1, 1658223630);
    }

    public abstract boolean method1706(Class115 var1);

    public abstract boolean method1707(Class115 var1);

    abstract Class282_Sub21_Sub1 method1712(Class122 var1);

    public abstract void method1713();

    public final int method1714(int i_1) {
        return this.anInt1015;
    }

    public String method1717(int i_1) {
        return this.aString1014;
    }

    public abstract boolean method1734();

    public Class282_Sub21_Sub1 method1742(int i_1, int i_2) {
        return (Class282_Sub21_Sub1) this.aClass107_1013.method1823(i_1, 1690895511);
    }

    abstract Class115 method1743(Class505_Sub2 var1, Class99 var2);

    public final void method1749(int i_1, float f_2, float f_3, float f_4, float f_5, byte b_6) {
        this.aClass115Array1010[this.anInt1015].method1895(i_1, f_2, f_3, f_4, f_5);
    }

    abstract Class282_Sub21_Sub1 method1765(Class122 var1);

    static void method1773(String[] arr_0, int[] ints_1, int i_2, int i_3, int i_4) {
        if (i_2 < i_3) {
            int i_5 = (i_3 + i_2) / 2;
            int i_6 = i_2;
            String string_7 = arr_0[i_5];
            arr_0[i_5] = arr_0[i_3];
            arr_0[i_3] = string_7;
            int i_8 = ints_1[i_5];
            ints_1[i_5] = ints_1[i_3];
            ints_1[i_3] = i_8;
            for (int i_9 = i_2; i_9 < i_3; i_9++) {
                if (string_7 == null || arr_0[i_9] != null && arr_0[i_9].compareTo(string_7) < (i_9 & 0x1)) {
                    String string_10 = arr_0[i_9];
                    arr_0[i_9] = arr_0[i_6];
                    arr_0[i_6] = string_10;
                    int i_11 = ints_1[i_9];
                    ints_1[i_9] = ints_1[i_6];
                    ints_1[i_6++] = i_11;
                }
            }
            arr_0[i_3] = arr_0[i_6];
            arr_0[i_6] = string_7;
            ints_1[i_3] = ints_1[i_6];
            ints_1[i_6] = i_8;
            method1773(arr_0, ints_1, i_2, i_6 - 1, 698486595);
            method1773(arr_0, ints_1, i_6 + 1, i_3, 698486595);
        }
    }

    public static void method1774(byte b_0) {
        if (Class9.loginStage == 105) {
            Class9.loginStage = 115;
        }
    }

    public static int method1776(int i_0, boolean bool_1, int i_2) {
        if (bool_1) {
            return 0;
        } else {
            ItemContainer class282_sub30_3 = CS2Runner.getItemContainer(i_0, bool_1);
            if (class282_sub30_3 == null) {
                return IndexLoaders.INVENTORY_INDEX_LOADER.getInventoryDef(i_0, (short) 6976).maxSize;
            } else {
                int i_4 = 0;
                for (int i_5 = 0; i_5 < class282_sub30_3.itemIds.length; i_5++) {
                    if (class282_sub30_3.itemIds[i_5] == -1) {
                        ++i_4;
                    }
                }
                i_4 += IndexLoaders.INVENTORY_INDEX_LOADER.getInventoryDef(i_0, (short) 24410).maxSize - class282_sub30_3.itemIds.length;
                return i_4;
            }
        }
    }
}
