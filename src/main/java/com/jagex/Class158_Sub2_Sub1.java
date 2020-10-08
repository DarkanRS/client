package com.jagex;

import jaggl.OpenGL;

import java.awt.*;

public class Class158_Sub2_Sub1 extends Class158_Sub2 {

    boolean aBool10122;
    OpenGLRenderer aGraphicalRenderer_Sub1_10118;
    Canvas aCanvas10120;
    OpenGL anOpenGL10119;
    long aLong10117;
    int anInt10121;
    int anInt10116;

    Class158_Sub2_Sub1(OpenGLRenderer class505_sub1_1, Canvas canvas_2, long long_3) {
        aBool10122 = false;
        aGraphicalRenderer_Sub1_10118 = class505_sub1_1;
        aCanvas10120 = canvas_2;
        anOpenGL10119 = class505_sub1_1.anOpenGL8352;
        aLong10117 = long_3;
        method15526();
    }

    Class158_Sub2_Sub1(OpenGLRenderer class505_sub1_1, Canvas canvas_2) {
        this(class505_sub1_1, canvas_2, class505_sub1_1.anOpenGL8352.prepareSurface(canvas_2));
    }

    @Override
    boolean method2723() {
        return true;
    }

    @Override
    public int method2714() {
        return anInt10116;
    }

    @Override
    public int method2716() {
        return anInt10121;
    }

    void method15526() {
        Dimension dimension_1 = aCanvas10120.getSize();
        anInt10121 = dimension_1.height;
        anInt10116 = dimension_1.width;
    }

    @Override
    public int method14344() {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.swapBuffers(aLong10117);
            return 0;
        }
    }

    @Override
    boolean method213() {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.setSurface(aLong10117);
            aGraphicalRenderer_Sub1_10118.method13578();
            return true;
        }
    }

    @Override
    boolean method2718() {
        return true;
    }

    @Override
    public void method212() {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.releaseSurface(aCanvas10120, aLong10117);
            aBool10122 = true;
        }
    }

    @Override
    public int method2719() {
        return anInt10116;
    }

    @Override
    void method14347(int i_1, int i_2) {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.surfaceResized(aLong10117);
            method15526();
            if (this == aGraphicalRenderer_Sub1_10118.method8523()) {
                aGraphicalRenderer_Sub1_10118.method13639();
            }

        }
    }

    @Override
    public int method2721() {
        return anInt10121;
    }

    @Override
    boolean method54() {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.setSurface(aLong10117);
            aGraphicalRenderer_Sub1_10118.method13578();
            return true;
        }
    }

    @Override
    public int method2720() {
        return anInt10116;
    }

    @Override
    boolean method2715() {
        return true;
    }

    @Override
    boolean method2717() {
        return true;
    }

    @Override
    boolean method2724() {
        return true;
    }

    @Override
    public void method186() {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.releaseSurface(aCanvas10120, aLong10117);
            aBool10122 = true;
        }
    }

    @Override
    boolean method2722() {
        return true;
    }

    @Override
    void method14354(int i_1, int i_2) {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.surfaceResized(aLong10117);
            method15526();
            if (this == aGraphicalRenderer_Sub1_10118.method8523()) {
                aGraphicalRenderer_Sub1_10118.method13639();
            }

        }
    }

    @Override
    void method14348(int i_1, int i_2) {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.surfaceResized(aLong10117);
            method15526();
            if (this == aGraphicalRenderer_Sub1_10118.method8523()) {
                aGraphicalRenderer_Sub1_10118.method13639();
            }

        }
    }

    @Override
    public int method14351(int i_1, int i_2) {
        return 0;
    }

    @Override
    public int method2727() {
        return anInt10121;
    }

    @Override
    public int method14349() {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.swapBuffers(aLong10117);
            return 0;
        }
    }

    @Override
    public int method14350() {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.swapBuffers(aLong10117);
            return 0;
        }
    }

    @Override
    public int method14346() {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.swapBuffers(aLong10117);
            return 0;
        }
    }

    @Override
    boolean method211() {
        if (aBool10122) {
            throw new IllegalStateException();
        } else {
            anOpenGL10119.setSurface(aLong10117);
            aGraphicalRenderer_Sub1_10118.method13578();
            return true;
        }
    }

    @Override
    public int method14353(int i_1, int i_2) {
        return 0;
    }

    @Override
    public int method2726() {
        return anInt10116;
    }

    @Override
    public int method14352(int i_1, int i_2) {
        return 0;
    }

    @Override
    boolean method2725() {
        return true;
    }

    @Override
    public int method14345(int i_1, int i_2) {
        return 0;
    }

}
