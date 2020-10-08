package com.jagex;

public class DirectXShader extends Shader {

    boolean aBool9361;
    DirectXRenderer aGraphicalRenderer_Sub2_Sub2_9362;
    Class115_Sub1 aClass115_Sub1_9360;

    DirectXShader(DirectXRenderer class505_sub2_sub2_1, ShaderLoader class114_2) {
        super(class505_sub2_sub2_1, class114_2);
        aGraphicalRenderer_Sub2_Sub2_9362 = class505_sub2_sub2_1;
        aBool9361 = false;
    }

    @Override
    public void method1690() {
        aGraphicalRenderer_Sub2_Sub2_9362.method15666(0L);
        aGraphicalRenderer_Sub2_Sub2_9362.method15645(0L);
        aBool9361 = false;
        aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = null;
        aGraphicalRenderer_Sub2_Sub2_9362.method14163(1);
        aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
        aGraphicalRenderer_Sub2_Sub2_9362.method14163(0);
        aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
    }

    @Override
    Class115 method1743(HardwareRenderer class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub1((DirectXRenderer) class505_sub2_1, this, class99_2);
    }

    @Override
    public void method1713() {
        aGraphicalRenderer_Sub2_Sub2_9362.method15666(0L);
        aGraphicalRenderer_Sub2_Sub2_9362.method15645(0L);
        aBool9361 = false;
        aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = null;
        aGraphicalRenderer_Sub2_Sub2_9362.method14163(1);
        aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
        aGraphicalRenderer_Sub2_Sub2_9362.method14163(0);
        aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
    }

    @Override
    public boolean method1655(Class115 class115_1) {
        if (class115_1 == aClass115_Sub1_9360) {
            return true;
        } else if (!class115_1.method1899()) {
            return false;
        } else {
            aClass115_Sub1_9360 = (Class115_Sub1) class115_1;
            anInt1015 = method1653(class115_1);
            if (anInt1015 == -1) {
                throw new IllegalArgumentException();
            } else {
                if (aBool9361) {
                    aGraphicalRenderer_Sub2_Sub2_9362.method15666(aClass115_Sub1_9360.aLong9286);
                    aGraphicalRenderer_Sub2_Sub2_9362.method15645(aClass115_Sub1_9360.aLong9287);
                    aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = aClass115_Sub1_9360;
                }

                return true;
            }
        }
    }

    @Override
    public boolean method1693() {
        return aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == aClass115_Sub1_9360;
    }

    @Override
    public boolean method1648() {
        return aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == aClass115_Sub1_9360;
    }

    @Override
    public void method1647() {
        aGraphicalRenderer_Sub2_Sub2_9362.method15666(0L);
        aGraphicalRenderer_Sub2_Sub2_9362.method15645(0L);
        aBool9361 = false;
        aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = null;
        aGraphicalRenderer_Sub2_Sub2_9362.method14163(1);
        aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
        aGraphicalRenderer_Sub2_Sub2_9362.method14163(0);
        aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
    }

    @Override
    public void method1686() {
        if (aClass115_Sub1_9360 == null) {
            throw new RuntimeException_Sub2();
        } else {
            aGraphicalRenderer_Sub2_Sub2_9362.method15666(aClass115_Sub1_9360.aLong9286);
            aGraphicalRenderer_Sub2_Sub2_9362.method15645(aClass115_Sub1_9360.aLong9287);
            aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = aClass115_Sub1_9360;
            aBool9361 = true;
        }
    }

    @Override
    public void method1687() {
        if (aClass115_Sub1_9360 == null) {
            throw new RuntimeException_Sub2();
        } else {
            aGraphicalRenderer_Sub2_Sub2_9362.method15666(aClass115_Sub1_9360.aLong9286);
            aGraphicalRenderer_Sub2_Sub2_9362.method15645(aClass115_Sub1_9360.aLong9287);
            aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = aClass115_Sub1_9360;
            aBool9361 = true;
        }
    }

    @Override
    Class115 method1683(HardwareRenderer class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub1((DirectXRenderer) class505_sub2_1, this, class99_2);
    }

    @Override
    public void method1678() {
        aGraphicalRenderer_Sub2_Sub2_9362.method15666(0L);
        aGraphicalRenderer_Sub2_Sub2_9362.method15645(0L);
        aBool9361 = false;
        aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = null;
        aGraphicalRenderer_Sub2_Sub2_9362.method14163(1);
        aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
        aGraphicalRenderer_Sub2_Sub2_9362.method14163(0);
        aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
    }

    @Override
    public void method1685() {
        if (aClass115_Sub1_9360 == null) {
            throw new RuntimeException_Sub2();
        } else {
            aGraphicalRenderer_Sub2_Sub2_9362.method15666(aClass115_Sub1_9360.aLong9286);
            aGraphicalRenderer_Sub2_Sub2_9362.method15645(aClass115_Sub1_9360.aLong9287);
            aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = aClass115_Sub1_9360;
            aBool9361 = true;
        }
    }

    @Override
    public boolean method1664() {
        return aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == aClass115_Sub1_9360;
    }

    @Override
    public boolean method1692() {
        return aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == aClass115_Sub1_9360;
    }

    @Override
    Node_Sub21_Sub1 method1765(Class122 class122_1) {
        return new Node_Sub21_Sub1_Sub1(this, class122_1);
    }

    @Override
    public boolean method1734() {
        return aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == aClass115_Sub1_9360;
    }

    @Override
    public void method1646() {
        if (aClass115_Sub1_9360 == null) {
            throw new RuntimeException_Sub2();
        } else {
            aGraphicalRenderer_Sub2_Sub2_9362.method15666(aClass115_Sub1_9360.aLong9286);
            aGraphicalRenderer_Sub2_Sub2_9362.method15645(aClass115_Sub1_9360.aLong9287);
            aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = aClass115_Sub1_9360;
            aBool9361 = true;
        }
    }

    @Override
    Class115 method1665(HardwareRenderer class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub1((DirectXRenderer) class505_sub2_1, this, class99_2);
    }

    @Override
    Class115 method1697(HardwareRenderer class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub1((DirectXRenderer) class505_sub2_1, this, class99_2);
    }

    @Override
    public boolean method1706(Class115 class115_1) {
        if (aClass115_Sub1_9360 == class115_1) {
            return true;
        } else if (!class115_1.method1899()) {
            return false;
        } else {
            aClass115_Sub1_9360 = (Class115_Sub1) class115_1;
            anInt1015 = method1653(class115_1) * -1224879653 * -401096109;
            if (anInt1015 * -1224879653 * -401096109 == -1) {
                throw new IllegalArgumentException();
            } else {
                if (aBool9361) {
                    aGraphicalRenderer_Sub2_Sub2_9362.method15666(aClass115_Sub1_9360.aLong9286);
                    aGraphicalRenderer_Sub2_Sub2_9362.method15645(aClass115_Sub1_9360.aLong9287);
                    aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = aClass115_Sub1_9360;
                }

                return true;
            }
        }
    }

    @Override
    public boolean method1707(Class115 class115_1) {
        if (aClass115_Sub1_9360 == class115_1) {
            return true;
        } else if (!class115_1.method1899()) {
            return false;
        } else {
            aClass115_Sub1_9360 = (Class115_Sub1) class115_1;
            anInt1015 = method1653(class115_1) * -1224879653 * -401096109;
            if (anInt1015 * -1224879653 * -401096109 == -1) {
                throw new IllegalArgumentException();
            } else {
                if (aBool9361) {
                    aGraphicalRenderer_Sub2_Sub2_9362.method15666(aClass115_Sub1_9360.aLong9286);
                    aGraphicalRenderer_Sub2_Sub2_9362.method15645(aClass115_Sub1_9360.aLong9287);
                    aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = aClass115_Sub1_9360;
                }

                return true;
            }
        }
    }

    @Override
    Node_Sub21_Sub1 method1694(Class122 class122_1) {
        return new Node_Sub21_Sub1_Sub1(this, class122_1);
    }

    @Override
    Node_Sub21_Sub1 method1712(Class122 class122_1) {
        return new Node_Sub21_Sub1_Sub1(this, class122_1);
    }

}
