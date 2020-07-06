package com.jagex;

public abstract class Class115 implements Interface7 {

    public static int RECOVERYQUESTIONSSETDATE;
    static NativeSprite[] aNativeSpriteArray1248;
    static int CAM_MOVE_VAR_SPEED;
    protected String shaderName;
    protected String aString1246;
    protected String aString1245;

    public static boolean method1950(CharSequence charsequence_0) {
        return Class272.method4841(charsequence_0);
    }

    public static boolean setBloom(boolean bloom) {
        boolean bloom1 = bloom;
        boolean bool_2 = Renderers.CURRENT_RENDERER.method8471();
        if (bloom1 != bool_2) {
            if (bloom1) {
                if (!Renderers.CURRENT_RENDERER.method8469()) {
                    bloom1 = false;
                }
            } else {
                Renderers.CURRENT_RENDERER.method8490();
            }
            if (bloom1 != bool_2) {
                Class393.preferences.setValue(Class393.preferences.bloom, bloom1 ? 1 : 0);
                Class190.savePreferences();
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    abstract void method1891(Node_Sub21_Sub1 var1, Matrix44 var2);

    String method1892() {
        return aString1245;
    }

    abstract void method1893(int var1, float var2, float var3, float var4);

    abstract void method1894(Node_Sub21_Sub1 var1, float var2);

    abstract void method1895(int var1, float var2, float var3, float var4, float var5);

    abstract void method1896(Node_Sub21_Sub1 var1, int var2, Interface30 var3);

    abstract void method1897(Node_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

    public abstract boolean method1898();

    public abstract boolean method1899();

    abstract void method1900(int var1, Matrix44 var2);

    abstract void method1901(Node_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

    abstract void method1902(int var1, Matrix44 var2);

    abstract void method1903(Node_Sub21_Sub1 var1, float[] var2, int var3);

    abstract void method1904(int var1, float[] var2, int var3);

    abstract void method1905(int var1, Matrix44 var2);

    abstract void method1906(int var1, Matrix44 var2);

    abstract void method1907(int var1, float var2, float var3, float var4, float var5);

    abstract void method1908(int var1, int var2, Interface30 var3);

    abstract void method1910(int var1, Matrix44 var2);

    public abstract boolean method1911();

    abstract void method1912(Node_Sub21_Sub1 var1, float var2);

    abstract void method1913(Node_Sub21_Sub1 var1, float var2, float var3);

    abstract void method1914(Node_Sub21_Sub1 var1, float var2, float var3, float var4);

    abstract void method1915(Node_Sub21_Sub1 var1, float var2, float var3, float var4);

    abstract void method1916(Node_Sub21_Sub1 var1, float var2, float var3, float var4);

    abstract void method1917(Node_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

    abstract void method1918(Node_Sub21_Sub1 var1, float[] var2, int var3);

    abstract void method1919(Node_Sub21_Sub1 var1, float[] var2, int var3);

    abstract void method1920(Node_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

    abstract void method1921(Node_Sub21_Sub1 var1, float[] var2, int var3);

    abstract void method1922(int var1, Matrix44 var2);

    abstract void method1923(Node_Sub21_Sub1 var1, float var2, float var3);

    abstract void method1924(Node_Sub21_Sub1 var1, Matrix44 var2);

    abstract void method1925(Node_Sub21_Sub1 var1, Matrix44 var2);

    abstract void method1926(Node_Sub21_Sub1 var1, Matrix44 var2);

    abstract void method1927(Node_Sub21_Sub1 var1, Matrix44 var2);

    abstract void method1928(Node_Sub21_Sub1 var1, int var2, Interface30 var3);

    abstract void method1929(Node_Sub21_Sub1 var1, int var2, Interface30 var3);

    abstract void method1930(Node_Sub21_Sub1 var1, int var2, Interface30 var3);

    abstract void method1931(int var1, float var2, float var3, float var4);

    abstract void method1932(int var1, float var2, float var3, float var4, float var5);

    abstract void method1933(int var1, float var2, float var3, float var4, float var5);

    abstract void method1934(int var1, float var2, float var3, float var4, float var5);

    abstract void method1935(int var1, float var2, float var3, float var4, float var5);

    abstract void method1936(Node_Sub21_Sub1 var1, Matrix44 var2);

    abstract void method1937(int var1, float[] var2, int var3);

    abstract void method1938(int var1, float[] var2, int var3);

    abstract void method1939(Node_Sub21_Sub1 var1, float var2, float var3, float var4);

    abstract void method1940(int var1, Matrix44 var2);

    abstract void method1941(Node_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

    abstract void method1942(int var1, Matrix44 var2);

    abstract void method1943(int var1, Matrix44 var2);

    abstract void method1944(Node_Sub21_Sub1 var1, float[] var2, int var3);

    abstract void method1945(int var1, int var2, Interface30 var3);

    abstract void method1946(int var1, int var2, Interface30 var3);

    abstract void method1947(int var1, int var2, Interface30 var3);

    abstract void method1948(int var1, int var2, Interface30 var3);
}
