public class Class107 {
	
    protected static int anInt1082;
    IterableNodeMap aClass465_1080;
    Class282_Sub21[] aClass282_Sub21Array1079;
    Interface11 anInterface11_1078;

    public Class107(int i_1, Interface11 interface11_2) {
        int i_3;
        for (i_3 = 1; i_3 < i_1; i_3 += i_3) {
            ;
        }
        this.aClass465_1080 = new IterableNodeMap(i_3);
        this.aClass282_Sub21Array1079 = new Class282_Sub21[i_3];
        this.anInterface11_1078 = interface11_2;
    }

    public Class282_Sub21 method1820(String string_1, int i_2) {
        long long_3 = this.anInterface11_1078.method79(string_1, 166693021);
        for (Class282_Sub21 class282_sub21_5 = (Class282_Sub21) this.aClass465_1080.get(long_3); class282_sub21_5 != null; class282_sub21_5 = (Class282_Sub21) this.aClass465_1080.method7747(-1934040693)) {
            if (class282_sub21_5.aString7674.equals(string_1)) {
                return class282_sub21_5;
            }
        }
        return null;
    }

    void method1821(int i_1) {
        Class282_Sub21 class282_sub21_3 = this.method1823(i_1, 1887501575);
        if (class282_sub21_3 != null) {
            class282_sub21_3.remove();
            this.aClass282_Sub21Array1079[class282_sub21_3.anInt7675] = null;
        }
    }

    public void method1822(int i_1, String string_2, Class282_Sub21 class282_sub21_3) {
        Class282_Sub21 class282_sub21_5 = this.method1820(string_2, -2129504033);
        if (class282_sub21_5 != null && class282_sub21_5.anInt7675 != i_1) {
            throw new IllegalArgumentException(string_2);
        } else {
            this.method1821(i_1);
            if (i_1 >= this.aClass282_Sub21Array1079.length) {
                int i_6;
                for (i_6 = this.aClass282_Sub21Array1079.length; i_1 >= i_6; i_6 += i_6) {
                    ;
                }
                this.aClass465_1080 = new IterableNodeMap(i_6);
                for (int i_7 = 0; i_7 < this.aClass282_Sub21Array1079.length; i_7++) {
                    Class282_Sub21 class282_sub21_10 = this.aClass282_Sub21Array1079[i_7];
                    if (class282_sub21_10 != null) {
                        this.aClass465_1080.put(class282_sub21_10, class282_sub21_10.data);
                    }
                }
                Class282_Sub21[] arr_9 = new Class282_Sub21[i_6];
                for (int i_8 = 0; i_8 < this.aClass282_Sub21Array1079.length; i_8++) {
                    arr_9[i_8] = this.aClass282_Sub21Array1079[i_8];
                }
                this.aClass282_Sub21Array1079 = arr_9;
            }
            class282_sub21_3.anInt7675 = i_1;
            class282_sub21_3.aString7674 = string_2;
            this.aClass465_1080.put(class282_sub21_3, this.anInterface11_1078.method79(string_2, 276122066));
            this.aClass282_Sub21Array1079[i_1] = class282_sub21_3;
        }
    }

    public Class282_Sub21 method1823(int i_1, int i_2) {
        return i_1 >= this.aClass282_Sub21Array1079.length ? null : this.aClass282_Sub21Array1079[i_1];
    }
}
