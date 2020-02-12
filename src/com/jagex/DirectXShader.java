package com.jagex;

public final class DirectXShader extends Shader {

    boolean aBool9361;
    GraphicalRenderer_Sub2_Sub2 aGraphicalRenderer_Sub2_Sub2_9362;
    Class115_Sub1 aClass115_Sub1_9360;

    public void method1690() {
        this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(0L);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(0L);
        this.aBool9361 = false;
        this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = null;
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14163(1);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14163(0);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
    }

    Class115 method1743(GraphicalRenderer_Sub2 class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub1((GraphicalRenderer_Sub2_Sub2) class505_sub2_1, this, class99_2);
    }

    public void method1713() {
        this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(0L);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(0L);
        this.aBool9361 = false;
        this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = null;
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14163(1);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14163(0);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
    }

    DirectXShader(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, ShaderLoader class114_2) {
        super(class505_sub2_sub2_1, class114_2);
        this.aGraphicalRenderer_Sub2_Sub2_9362 = class505_sub2_sub2_1;
        this.aBool9361 = false;
    }

    public boolean method1655(Class115 class115_1) {
        if (class115_1 == this.aClass115_Sub1_9360) {
            return true;
        } else if (!class115_1.method1899()) {
            return false;
        } else {
            this.aClass115_Sub1_9360 = (Class115_Sub1) class115_1;
            this.anInt1015 = this.method1653(class115_1, (byte) -25);
            if (this.anInt1015 == -1) {
                throw new IllegalArgumentException();
            } else {
                if (this.aBool9361) {
                    this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(this.aClass115_Sub1_9360.aLong9286);
                    this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(this.aClass115_Sub1_9360.aLong9287);
                    this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = this.aClass115_Sub1_9360;
                }

                return true;
            }
        }
    }

    public boolean method1693() {
        return this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == this.aClass115_Sub1_9360;
    }

    public boolean method1648() {
        return this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == this.aClass115_Sub1_9360;
    }

    public void method1647() {
        this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(0L);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(0L);
        this.aBool9361 = false;
        this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = null;
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14163(1);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14163(0);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
    }

    public void method1686() {
        if (this.aClass115_Sub1_9360 == null) {
            throw new RuntimeException_Sub2();
        } else {
            this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(this.aClass115_Sub1_9360.aLong9286);
            this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(this.aClass115_Sub1_9360.aLong9287);
            this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = this.aClass115_Sub1_9360;
            this.aBool9361 = true;
        }
    }

    public void method1687() {
        if (this.aClass115_Sub1_9360 == null) {
            throw new RuntimeException_Sub2();
        } else {
            this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(this.aClass115_Sub1_9360.aLong9286);
            this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(this.aClass115_Sub1_9360.aLong9287);
            this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = this.aClass115_Sub1_9360;
            this.aBool9361 = true;
        }
    }

    Class115 method1683(GraphicalRenderer_Sub2 class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub1((GraphicalRenderer_Sub2_Sub2) class505_sub2_1, this, class99_2);
    }

    public void method1678() {
        this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(0L);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(0L);
        this.aBool9361 = false;
        this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = null;
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14163(1);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14163(0);
        this.aGraphicalRenderer_Sub2_Sub2_9362.method14035(null);
    }

    public void method1685() {
        if (this.aClass115_Sub1_9360 == null) {
            throw new RuntimeException_Sub2();
        } else {
            this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(this.aClass115_Sub1_9360.aLong9286);
            this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(this.aClass115_Sub1_9360.aLong9287);
            this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = this.aClass115_Sub1_9360;
            this.aBool9361 = true;
        }
    }

    public boolean method1664() {
        return this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == this.aClass115_Sub1_9360;
    }

    public boolean method1692() {
        return this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == this.aClass115_Sub1_9360;
    }

    Node_Sub21_Sub1 method1765(Class122 class122_1) {
        return new Node_Sub21_Sub1_Sub1(this, class122_1);
    }

    public boolean method1734() {
        return this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 == this.aClass115_Sub1_9360;
    }

    public void method1646() {
        if (this.aClass115_Sub1_9360 == null) {
            throw new RuntimeException_Sub2();
        } else {
            this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(this.aClass115_Sub1_9360.aLong9286);
            this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(this.aClass115_Sub1_9360.aLong9287);
            this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = this.aClass115_Sub1_9360;
            this.aBool9361 = true;
        }
    }

    Class115 method1665(GraphicalRenderer_Sub2 class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub1((GraphicalRenderer_Sub2_Sub2) class505_sub2_1, this, class99_2);
    }

    Class115 method1697(GraphicalRenderer_Sub2 class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub1((GraphicalRenderer_Sub2_Sub2) class505_sub2_1, this, class99_2);
    }

    public boolean method1706(Class115 class115_1) {
        if (this.aClass115_Sub1_9360 == class115_1) {
            return true;
        } else if (!class115_1.method1899()) {
            return false;
        } else {
            this.aClass115_Sub1_9360 = (Class115_Sub1) class115_1;
            this.anInt1015 = this.method1653(class115_1, (byte) -36) * -1224879653 * -401096109;
            if (this.anInt1015 * -1224879653 * -401096109 == -1) {
                throw new IllegalArgumentException();
            } else {
                if (this.aBool9361) {
                    this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(this.aClass115_Sub1_9360.aLong9286);
                    this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(this.aClass115_Sub1_9360.aLong9287);
                    this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = this.aClass115_Sub1_9360;
                }

                return true;
            }
        }
    }

    public boolean method1707(Class115 class115_1) {
        if (this.aClass115_Sub1_9360 == class115_1) {
            return true;
        } else if (!class115_1.method1899()) {
            return false;
        } else {
            this.aClass115_Sub1_9360 = (Class115_Sub1) class115_1;
            this.anInt1015 = this.method1653(class115_1, (byte) -83) * -1224879653 * -401096109;
            if (this.anInt1015 * -1224879653 * -401096109 == -1) {
                throw new IllegalArgumentException();
            } else {
                if (this.aBool9361) {
                    this.aGraphicalRenderer_Sub2_Sub2_9362.method15666(this.aClass115_Sub1_9360.aLong9286);
                    this.aGraphicalRenderer_Sub2_Sub2_9362.method15645(this.aClass115_Sub1_9360.aLong9287);
                    this.aGraphicalRenderer_Sub2_Sub2_9362.aClass115_Sub1_10251 = this.aClass115_Sub1_9360;
                }

                return true;
            }
        }
    }

    Node_Sub21_Sub1 method1694(Class122 class122_1) {
        return new Node_Sub21_Sub1_Sub1(this, class122_1);
    }

    Node_Sub21_Sub1 method1712(Class122 class122_1) {
        return new Node_Sub21_Sub1_Sub1(this, class122_1);
    }

}
