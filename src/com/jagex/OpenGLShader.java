package com.jagex;

import jaggl.OpenGL;

public class OpenGLShader extends Shader {

    GraphicalRenderer_Sub2_Sub1 aGraphicalRenderer_Sub2_Sub1_9264;
    Class115_Sub2 aClass115_Sub2_9265;
    int handle;

    OpenGLShader(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, ShaderLoader class114_2) {
        super(class505_sub2_sub1_1, class114_2);
        this.aGraphicalRenderer_Sub2_Sub1_9264 = class505_sub2_sub1_1;
    }

    Class115 method1743(GraphicalRenderer_Sub2 class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub2((GraphicalRenderer_Sub2_Sub1) class505_sub2_1, this, class99_2);
    }

    public boolean method1655(Class115 class115_1) {
        if (class115_1 == this.aClass115_Sub2_9265) {
            return true;
        } else if (!class115_1.method1899()) {
            return false;
        } else {
            boolean bool_2 = this.method1648();
            this.aClass115_Sub2_9265 = (Class115_Sub2) class115_1;
            this.anInt1015 = this.method1653(class115_1, (byte) -8);
            if (this.anInt1015 == -1) {
                throw new IllegalArgumentException();
            } else {
                this.handle = this.aClass115_Sub2_9265.anInt9423;
                if (bool_2) {
                    OpenGL.glUseProgram(this.handle);
                    this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = this.aClass115_Sub2_9265;
                }

                return true;
            }
        }
    }

    Node_Sub21_Sub1 method1765(Class122 class122_1) {
        return new Node_Sub21_Sub1_Sub2(this, class122_1);
    }

    public void method1647() {
    }

    public boolean method1648() {
        return this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == this.aClass115_Sub2_9265;
    }

    public void finalize() throws Throwable {
        this.method1684();
        super.finalize();
    }

    void method1684() {
        for (int i_1 = 0; i_1 < this.method1650(2014466092); i_1++) {
            this.method1652(i_1, (byte) 117).method26();
        }

        super.method1684();
    }

    public void method1685() {
        if (this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 != this.aClass115_Sub2_9265) {
            if (this.aClass115_Sub2_9265 == null) {
                throw new RuntimeException_Sub2();
            }

            OpenGL.glUseProgram(this.handle);
            this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = this.aClass115_Sub2_9265;
        }

    }

    public void method1686() {
        if (this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 != this.aClass115_Sub2_9265) {
            if (this.aClass115_Sub2_9265 == null) {
                throw new RuntimeException_Sub2();
            }

            OpenGL.glUseProgram(this.handle);
            this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = this.aClass115_Sub2_9265;
        }

    }

    public void method1687() {
        if (this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 != this.aClass115_Sub2_9265) {
            if (this.aClass115_Sub2_9265 == null) {
                throw new RuntimeException_Sub2();
            }

            OpenGL.glUseProgram(this.handle);
            this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = this.aClass115_Sub2_9265;
        }

    }

    public void method1713() {
    }

    Class115 method1697(GraphicalRenderer_Sub2 class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub2((GraphicalRenderer_Sub2_Sub1) class505_sub2_1, this, class99_2);
    }

    public void method1678() {
    }

    public void method1646() {
        if (this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 != this.aClass115_Sub2_9265) {
            if (this.aClass115_Sub2_9265 == null) {
                throw new RuntimeException_Sub2();
            }

            OpenGL.glUseProgram(this.handle);
            this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = this.aClass115_Sub2_9265;
        }

    }

    public boolean method1692() {
        return this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == this.aClass115_Sub2_9265;
    }

    public boolean method1693() {
        return this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == this.aClass115_Sub2_9265;
    }

    public boolean method1734() {
        return this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == this.aClass115_Sub2_9265;
    }

    Class115 method1683(GraphicalRenderer_Sub2 class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub2((GraphicalRenderer_Sub2_Sub1) class505_sub2_1, this, class99_2);
    }

    public boolean method1664() {
        return this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 == this.aClass115_Sub2_9265;
    }

    public void method1690() {
    }

    public boolean method1706(Class115 class115_1) {
        if (this.aClass115_Sub2_9265 == class115_1) {
            return true;
        } else if (!class115_1.method1899()) {
            return false;
        } else {
            boolean bool_2 = this.method1648();
            this.aClass115_Sub2_9265 = (Class115_Sub2) class115_1;
            this.anInt1015 = this.method1653(class115_1, (byte) -104) * -1224879653 * -401096109;
            if (this.anInt1015 * -1224879653 * -401096109 == -1) {
                throw new IllegalArgumentException();
            } else {
                this.handle = this.aClass115_Sub2_9265.anInt9423;
                if (bool_2) {
                    OpenGL.glUseProgram(this.handle);
                    this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = this.aClass115_Sub2_9265;
                }

                return true;
            }
        }
    }

    public boolean method1707(Class115 class115_1) {
        if (this.aClass115_Sub2_9265 == class115_1) {
            return true;
        } else if (!class115_1.method1899()) {
            return false;
        } else {
            boolean bool_2 = this.method1648();
            this.aClass115_Sub2_9265 = (Class115_Sub2) class115_1;
            this.anInt1015 = this.method1653(class115_1, (byte) -108) * -1224879653 * -401096109;
            if (this.anInt1015 * -1224879653 * -401096109 == -1) {
                throw new IllegalArgumentException();
            } else {
                this.handle = this.aClass115_Sub2_9265.anInt9423;
                if (bool_2) {
                    OpenGL.glUseProgram(this.handle);
                    this.aGraphicalRenderer_Sub2_Sub1_9264.aClass115_Sub2_10189 = this.aClass115_Sub2_9265;
                }

                return true;
            }
        }
    }

    Node_Sub21_Sub1 method1694(Class122 class122_1) {
        return new Node_Sub21_Sub1_Sub2(this, class122_1);
    }

    Node_Sub21_Sub1 method1712(Class122 class122_1) {
        return new Node_Sub21_Sub1_Sub2(this, class122_1);
    }

    Class115 method1665(GraphicalRenderer_Sub2 class505_sub2_1, Class99 class99_2) {
        return new Class115_Sub2((GraphicalRenderer_Sub2_Sub1) class505_sub2_1, this, class99_2);
    }

}
