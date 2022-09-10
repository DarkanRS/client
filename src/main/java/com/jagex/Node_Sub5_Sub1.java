package com.jagex;

import jaggl.OpenGL;

public class Node_Sub5_Sub1 extends Node_Sub5 {

    static float aFloat10024 = 0.25F;
    static float aFloat10025 = 1.0F;
    static float aFloat10026 = 1.0F;
    Class158_Sub1_Sub4 aClass158_Sub1_Sub4_10031;
    Class137_Sub1 aClass137_Sub1_10038;
    Class137_Sub1 aClass137_Sub1_10034;
    Class128 aClass128_10043;
    Class128 aClass128_10042;
    Class128 aClass128_10041;
    Class128 aClass128_10023;
    int anInt10036;
    int anInt10037;
    Class158_Sub1_Sub4 aClass158_Sub1_Sub4_10032;
    Class137_Sub1[] aClass137_Sub1Array10028;
    int anInt10039;
    int anInt10033;

    Node_Sub5_Sub1(OpenGLRenderer class505_sub1_1) {
        super(class505_sub1_1);
    }

    @Override
    void method12119(Class137_Sub1 class137_sub1_2) {
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
        int i_4;
        int i_5;
        if (aClass137_Sub1Array10028 != null) {
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10032);
            i_4 = Class51.method1072(anInt10036);
            i_5 = Class51.method1072(anInt10037);

            int i_6;
            for (i_6 = 0; i_4 > 256 || i_5 > 256; i_6++) {
                OpenGL.glViewport(0, 0, i_4, i_5);
                aClass158_Sub1_Sub4_10032.method13759(0, aClass137_Sub1Array10028[i_6].method14441());
                if (i_6 == 0) {
                    aGraphicalRenderer_Sub1_7507.setTexture(class137_sub1_2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(anInt10036, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(anInt10036, anInt10037);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, anInt10037);
                } else {
                    aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1Array10028[i_6 - 1]);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                }
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();

                if (i_4 > 256) {
                    i_4 >>= 1;
                }

                if (i_5 > 256) {
                    i_5 >>= 1;
                }
            }

            aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10032);
            aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1Array10028[i_6 - 1]);
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10031);
            aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            int i_7 = aClass128_10042.anInt1583;
            OpenGL.glUseProgram(i_7);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7, "sceneTex"), 0);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_7, "params"), aFloat10026, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
        } else {
            aGraphicalRenderer_Sub1_7507.setTexture(class137_sub1_2);
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10031);
            aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            i_4 = aClass128_10043.anInt1583;
            OpenGL.glUseProgram(i_4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "sceneTex"), 0);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "params"), aFloat10026, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(anInt10036, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(anInt10036, anInt10037);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, anInt10037);
        }
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();

        aClass158_Sub1_Sub4_10031.method15628(1);
        aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1_10038);
        i_4 = aClass128_10023.anInt1583;
        OpenGL.glUseProgram(i_4);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "baseTex"), 0);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        aClass158_Sub1_Sub4_10031.method15628(0);
        aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1_10034);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10031);
        i_5 = aClass128_10041.anInt1583;
        OpenGL.glUseProgram(i_5);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "sceneTex"), 0);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "bloomTex"), 1);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_5, "params"), aFloat10024, aFloat10025, 0.0F);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(1);
        aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1_10038);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(0);
        aGraphicalRenderer_Sub1_7507.setTexture(class137_sub1_2);
    }

    boolean method15445() {
        return aGraphicalRenderer_Sub1_7507.supportsFBO && aGraphicalRenderer_Sub1_7507.supportsFragmentShaders && aGraphicalRenderer_Sub1_7507.supportsFloatTextures;
    }

    @Override
    boolean method12141() {
        return aClass158_Sub1_Sub4_10031 != null;
    }

    @Override
    boolean method12136() {
        if (aGraphicalRenderer_Sub1_7507.supportsFBO && aGraphicalRenderer_Sub1_7507.supportsFragmentShaders && aGraphicalRenderer_Sub1_7507.supportsFloatTextures) {
            aClass158_Sub1_Sub4_10031 = new Class158_Sub1_Sub4(aGraphicalRenderer_Sub1_7507);
            aClass137_Sub1_10038 = new Class137_Sub1(aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            aClass137_Sub1_10038.method14445(false, false);
            aClass137_Sub1_10034 = new Class137_Sub1(aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            aClass137_Sub1_10034.method14445(false, false);
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10031);
            aClass158_Sub1_Sub4_10031.method13759(0, aClass137_Sub1_10038.method14441());
            aClass158_Sub1_Sub4_10031.method13759(1, aClass137_Sub1_10034.method14441());
            aClass158_Sub1_Sub4_10031.method15628(0);
            if (!aClass158_Sub1_Sub4_10031.method13764()) {
                aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10031);
                return false;
            } else {
                aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10031);
                aClass128_10043 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                aClass128_10042 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                aClass128_10041 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
                aClass128_10023 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
                return aClass128_10042 != null && aClass128_10043 != null && aClass128_10041 != null && aClass128_10023 != null;
            }
        } else {
            return false;
        }
    }

    @Override
    void method12122(int i_1, int i_2) {
        anInt10036 = i_1;
        anInt10037 = i_2;
        int i_3 = Class51.method1072(anInt10036);
        int i_4 = Class51.method1072(anInt10037);
        if (i_3 != anInt10039 || i_4 != anInt10033) {
            int i_5;
            if (aClass137_Sub1Array10028 != null) {
                for (i_5 = 0; i_5 < aClass137_Sub1Array10028.length; i_5++) {
                    aClass137_Sub1Array10028[i_5].method2355();
                }

                aClass137_Sub1Array10028 = null;
            }

            if (i_3 <= 256 && i_4 <= 256) {
                aClass158_Sub1_Sub4_10032 = null;
            } else {
                i_5 = i_3;
                int i_6 = i_4;
                int i_7 = 0;

                label61:
                while (true) {
                    if (i_5 <= 256 && i_6 <= 256) {
                        if (aClass158_Sub1_Sub4_10032 == null) {
                            aClass158_Sub1_Sub4_10032 = new Class158_Sub1_Sub4(aGraphicalRenderer_Sub1_7507);
                        }

                        aClass137_Sub1Array10028 = new Class137_Sub1[i_7];
                        i_5 = i_3;
                        i_6 = i_4;
                        i_7 = 0;

                        while (true) {
                            if (i_5 <= 256 && i_6 <= 256) {
                                break label61;
                            }

                            aClass137_Sub1Array10028[i_7++] = new Class137_Sub1(aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, i_5, i_6);
                            if (i_5 > 256) {
                                i_5 >>= 1;
                            }

                            if (i_6 > 256) {
                                i_6 >>= 1;
                            }
                        }
                    }

                    if (i_5 > 256) {
                        i_5 >>= 1;
                    }

                    if (i_6 > 256) {
                        i_6 >>= 1;
                    }

                    ++i_7;
                }
            }

            anInt10039 = i_3;
            anInt10033 = i_4;
        }

    }

    @Override
    Class76 method12127() {
        return Class76.aClass76_755;
    }

    @Override
    void method12121() {
        OpenGL.glUseProgram(0);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(1);
        aGraphicalRenderer_Sub1_7507.setTexture(null);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(0);
    }

    @Override
    void method12134(Class137_Sub1 class137_sub1_2) {
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
        int i_4;
        int i_5;
        if (aClass137_Sub1Array10028 != null) {
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10032);
            i_4 = Class51.method1072(anInt10036);
            i_5 = Class51.method1072(anInt10037);

            int i_6;
            for (i_6 = 0; i_4 > 256 || i_5 > 256; i_6++) {
                OpenGL.glViewport(0, 0, i_4, i_5);
                aClass158_Sub1_Sub4_10032.method13759(0, aClass137_Sub1Array10028[i_6].method14441());
                if (i_6 == 0) {
                    aGraphicalRenderer_Sub1_7507.setTexture(class137_sub1_2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(anInt10036, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(anInt10036, anInt10037);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, anInt10037);
                } else {
                    aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1Array10028[i_6 - 1]);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                }
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();

                if (i_4 > 256) {
                    i_4 >>= 1;
                }

                if (i_5 > 256) {
                    i_5 >>= 1;
                }
            }

            aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10032);
            aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1Array10028[i_6 - 1]);
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10031);
            aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            int i_7 = aClass128_10042.anInt1583;
            OpenGL.glUseProgram(i_7);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7, "sceneTex"), 0);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_7, "params"), aFloat10026, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
        } else {
            aGraphicalRenderer_Sub1_7507.setTexture(class137_sub1_2);
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10031);
            aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            i_4 = aClass128_10043.anInt1583;
            OpenGL.glUseProgram(i_4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "sceneTex"), 0);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "params"), aFloat10026, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(anInt10036, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(anInt10036, anInt10037);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, anInt10037);
        }
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();

        aClass158_Sub1_Sub4_10031.method15628(1);
        aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1_10038);
        i_4 = aClass128_10023.anInt1583;
        OpenGL.glUseProgram(i_4);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "baseTex"), 0);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        aClass158_Sub1_Sub4_10031.method15628(0);
        aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1_10034);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10031);
        i_5 = aClass128_10041.anInt1583;
        OpenGL.glUseProgram(i_5);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "sceneTex"), 0);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "bloomTex"), 1);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_5, "params"), aFloat10024, aFloat10025, 0.0F);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(1);
        aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1_10038);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(0);
        aGraphicalRenderer_Sub1_7507.setTexture(class137_sub1_2);
    }

    @Override
    boolean method12128() {
        return aClass158_Sub1_Sub4_10031 != null;
    }

    @Override
    boolean method12130() {
        if (aGraphicalRenderer_Sub1_7507.supportsFBO && aGraphicalRenderer_Sub1_7507.supportsFragmentShaders && aGraphicalRenderer_Sub1_7507.supportsFloatTextures) {
            aClass158_Sub1_Sub4_10031 = new Class158_Sub1_Sub4(aGraphicalRenderer_Sub1_7507);
            aClass137_Sub1_10038 = new Class137_Sub1(aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            aClass137_Sub1_10038.method14445(false, false);
            aClass137_Sub1_10034 = new Class137_Sub1(aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            aClass137_Sub1_10034.method14445(false, false);
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10031);
            aClass158_Sub1_Sub4_10031.method13759(0, aClass137_Sub1_10038.method14441());
            aClass158_Sub1_Sub4_10031.method13759(1, aClass137_Sub1_10034.method14441());
            aClass158_Sub1_Sub4_10031.method15628(0);
            if (!aClass158_Sub1_Sub4_10031.method13764()) {
                aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10031);
                return false;
            } else {
                aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10031);
                aClass128_10043 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                aClass128_10042 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                aClass128_10041 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
                aClass128_10023 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
                return aClass128_10042 != null && aClass128_10043 != null && aClass128_10041 != null && aClass128_10023 != null;
            }
        } else {
            return false;
        }
    }

    @Override
    boolean method12131() {
        if (aGraphicalRenderer_Sub1_7507.supportsFBO && aGraphicalRenderer_Sub1_7507.supportsFragmentShaders && aGraphicalRenderer_Sub1_7507.supportsFloatTextures) {
            aClass158_Sub1_Sub4_10031 = new Class158_Sub1_Sub4(aGraphicalRenderer_Sub1_7507);
            aClass137_Sub1_10038 = new Class137_Sub1(aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            aClass137_Sub1_10038.method14445(false, false);
            aClass137_Sub1_10034 = new Class137_Sub1(aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            aClass137_Sub1_10034.method14445(false, false);
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10031);
            aClass158_Sub1_Sub4_10031.method13759(0, aClass137_Sub1_10038.method14441());
            aClass158_Sub1_Sub4_10031.method13759(1, aClass137_Sub1_10034.method14441());
            aClass158_Sub1_Sub4_10031.method15628(0);
            if (!aClass158_Sub1_Sub4_10031.method13764()) {
                aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10031);
                return false;
            } else {
                aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10031);
                aClass128_10043 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                aClass128_10042 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                aClass128_10041 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
                aClass128_10023 = Class128.method2174(aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
                return aClass128_10042 != null && aClass128_10043 != null && aClass128_10041 != null && aClass128_10023 != null;
            }
        } else {
            return false;
        }
    }

    @Override
    void method12132(int i_1, int i_2) {
        anInt10036 = i_1;
        anInt10037 = i_2;
        int i_3 = Class51.method1072(anInt10036);
        int i_4 = Class51.method1072(anInt10037);
        if (anInt10039 != i_3 || anInt10033 != i_4) {
            int i_5;
            if (aClass137_Sub1Array10028 != null) {
                for (i_5 = 0; i_5 < aClass137_Sub1Array10028.length; i_5++) {
                    aClass137_Sub1Array10028[i_5].method2355();
                }

                aClass137_Sub1Array10028 = null;
            }

            if (i_3 <= 256 && i_4 <= 256) {
                aClass158_Sub1_Sub4_10032 = null;
            } else {
                i_5 = i_3;
                int i_6 = i_4;
                int i_7 = 0;

                label61:
                while (true) {
                    if (i_5 <= 256 && i_6 <= 256) {
                        if (aClass158_Sub1_Sub4_10032 == null) {
                            aClass158_Sub1_Sub4_10032 = new Class158_Sub1_Sub4(aGraphicalRenderer_Sub1_7507);
                        }

                        aClass137_Sub1Array10028 = new Class137_Sub1[i_7];
                        i_5 = i_3;
                        i_6 = i_4;
                        i_7 = 0;

                        while (true) {
                            if (i_5 <= 256 && i_6 <= 256) {
                                break label61;
                            }

                            aClass137_Sub1Array10028[i_7++] = new Class137_Sub1(aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, i_5, i_6);
                            if (i_5 > 256) {
                                i_5 >>= 1;
                            }

                            if (i_6 > 256) {
                                i_6 >>= 1;
                            }
                        }
                    }

                    if (i_5 > 256) {
                        i_5 >>= 1;
                    }

                    if (i_6 > 256) {
                        i_6 >>= 1;
                    }

                    ++i_7;
                }
            }

            anInt10039 = i_3;
            anInt10033 = i_4;
        }

    }

    @Override
    void method12120() {
        anInt10033 = -1;
        anInt10039 = -1;
        aClass158_Sub1_Sub4_10032 = null;
        aClass137_Sub1Array10028 = null;
        aClass158_Sub1_Sub4_10031 = null;
        aClass137_Sub1_10038 = null;
        aClass137_Sub1_10034 = null;
        aClass128_10043 = null;
        aClass128_10042 = null;
        aClass128_10041 = null;
        aClass128_10023 = null;
    }

    @Override
    void method12135() {
        OpenGL.glUseProgram(0);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(1);
        aGraphicalRenderer_Sub1_7507.setTexture(null);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(0);
    }

    @Override
    void method12124() {
        anInt10033 = -1;
        anInt10039 = -1;
        aClass158_Sub1_Sub4_10032 = null;
        aClass137_Sub1Array10028 = null;
        aClass158_Sub1_Sub4_10031 = null;
        aClass137_Sub1_10038 = null;
        aClass137_Sub1_10034 = null;
        aClass128_10043 = null;
        aClass128_10042 = null;
        aClass128_10041 = null;
        aClass128_10023 = null;
    }

    @Override
    void method12133(Class137_Sub1 class137_sub1_2) {
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
        int i_4;
        int i_5;
        if (aClass137_Sub1Array10028 != null) {
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10032);
            i_4 = Class51.method1072(anInt10036);
            i_5 = Class51.method1072(anInt10037);

            int i_6;
            for (i_6 = 0; i_4 > 256 || i_5 > 256; i_6++) {
                OpenGL.glViewport(0, 0, i_4, i_5);
                aClass158_Sub1_Sub4_10032.method13759(0, aClass137_Sub1Array10028[i_6].method14441());
                if (i_6 == 0) {
                    aGraphicalRenderer_Sub1_7507.setTexture(class137_sub1_2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(anInt10036, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(anInt10036, anInt10037);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, anInt10037);
                } else {
                    aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1Array10028[i_6 - 1]);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                }
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();

                if (i_4 > 256) {
                    i_4 >>= 1;
                }

                if (i_5 > 256) {
                    i_5 >>= 1;
                }
            }

            aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10032);
            aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1Array10028[i_6 - 1]);
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10031);
            aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            int i_7 = aClass128_10042.anInt1583;
            OpenGL.glUseProgram(i_7);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7, "sceneTex"), 0);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_7, "params"), aFloat10026, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
        } else {
            aGraphicalRenderer_Sub1_7507.setTexture(class137_sub1_2);
            aGraphicalRenderer_Sub1_7507.method8637(aClass158_Sub1_Sub4_10031);
            aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            i_4 = aClass128_10043.anInt1583;
            OpenGL.glUseProgram(i_4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "sceneTex"), 0);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "params"), aFloat10026, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(anInt10036, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(anInt10036, anInt10037);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, anInt10037);
        }
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();

        aClass158_Sub1_Sub4_10031.method15628(1);
        aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1_10038);
        i_4 = aClass128_10023.anInt1583;
        OpenGL.glUseProgram(i_4);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "baseTex"), 0);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        aClass158_Sub1_Sub4_10031.method15628(0);
        aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1_10034);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        aGraphicalRenderer_Sub1_7507.method8416(aClass158_Sub1_Sub4_10031);
        i_5 = aClass128_10041.anInt1583;
        OpenGL.glUseProgram(i_5);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "sceneTex"), 0);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "bloomTex"), 1);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_5, "params"), aFloat10024, aFloat10025, 0.0F);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(1);
        aGraphicalRenderer_Sub1_7507.setTexture(aClass137_Sub1_10038);
        aGraphicalRenderer_Sub1_7507.setActiveTexture(0);
        aGraphicalRenderer_Sub1_7507.setTexture(class137_sub1_2);
    }

}
