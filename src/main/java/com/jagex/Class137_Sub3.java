package com.jagex;

import jaggl.OpenGL;

public class Class137_Sub3 extends GLTexture {

    int anInt9105;

    Class137_Sub3(OpenGLRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3, byte[] bytes_5, Class150 class150_6) {
        super(class505_sub1_1, 3552, class150_2, class76_3, 2, false);
        anInt9105 = 2;
        openGLHardwareRenderer.setTexture(this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(bindId, 0, OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), anInt9105, 0, OpenGLRenderer.method13629(class150_6), 5121, bytes_5, 0);
        OpenGL.glPixelStorei(3317, 4);
        method2351(true);
    }

    void method14460() {
        openGLHardwareRenderer.setTexture(this);
        OpenGL.glTexParameteri(bindId, 10242, 33071);
    }

}
