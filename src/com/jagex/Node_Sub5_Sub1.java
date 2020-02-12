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

    void method12119(int i_1, Class137_Sub1 class137_sub1_2, Class137_Sub1 class137_sub1_3) {
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        int i_4;
        int i_5;
        if (this.aClass137_Sub1Array10028 != null) {
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10032, 699078378);
            i_4 = Class51.method1072(this.anInt10036, 814738058);
            i_5 = Class51.method1072(this.anInt10037, 867540401);

            int i_6;
            for (i_6 = 0; i_4 > 256 || i_5 > 256; i_6++) {
                OpenGL.glViewport(0, 0, i_4, i_5);
                this.aClass158_Sub1_Sub4_10032.method13759(0, this.aClass137_Sub1Array10028[i_6].method14441());
                if (i_6 == 0) {
                    this.aGraphicalRenderer_Sub1_7507.method13654(class137_sub1_2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.anInt10036, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.anInt10036, (float) this.anInt10037);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.anInt10037);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1Array10028[i_6 - 1]);
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
                }

                if (i_4 > 256) {
                    i_4 >>= 1;
                }

                if (i_5 > 256) {
                    i_5 >>= 1;
                }
            }

            this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10032, (byte) -99);
            this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1Array10028[i_6 - 1]);
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10031, 1391966255);
            this.aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            int i_7 = this.aClass128_10042.anInt1583;
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
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            this.aGraphicalRenderer_Sub1_7507.method13654(class137_sub1_2);
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10031, -1066859380);
            this.aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            i_4 = this.aClass128_10043.anInt1583;
            OpenGL.glUseProgram(i_4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "sceneTex"), 0);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "params"), aFloat10026, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.anInt10036, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.anInt10036, (float) this.anInt10037);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.anInt10037);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }

        this.aClass158_Sub1_Sub4_10031.method15628(1);
        this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1_10038);
        i_4 = this.aClass128_10023.anInt1583;
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
        this.aClass158_Sub1_Sub4_10031.method15628(0);
        this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1_10034);
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
        this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10031, (byte) -55);
        i_5 = this.aClass128_10041.anInt1583;
        OpenGL.glUseProgram(i_5);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "sceneTex"), 0);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "bloomTex"), 1);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_5, "params"), aFloat10024, aFloat10025, 0.0F);
        this.aGraphicalRenderer_Sub1_7507.method13610(1);
        this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1_10038);
        this.aGraphicalRenderer_Sub1_7507.method13610(0);
        this.aGraphicalRenderer_Sub1_7507.method13654(class137_sub1_2);
    }

    boolean method15445() {
        return this.aGraphicalRenderer_Sub1_7507.aBool8472 && this.aGraphicalRenderer_Sub1_7507.aBool8365 && this.aGraphicalRenderer_Sub1_7507.aBool8312;
    }

    boolean method12141() {
        return this.aClass158_Sub1_Sub4_10031 != null;
    }

    boolean method12136() {
        if (this.aGraphicalRenderer_Sub1_7507.aBool8472 && this.aGraphicalRenderer_Sub1_7507.aBool8365 && this.aGraphicalRenderer_Sub1_7507.aBool8312) {
            this.aClass158_Sub1_Sub4_10031 = new Class158_Sub1_Sub4(this.aGraphicalRenderer_Sub1_7507);
            this.aClass137_Sub1_10038 = new Class137_Sub1(this.aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            this.aClass137_Sub1_10038.method14445(false, false);
            this.aClass137_Sub1_10034 = new Class137_Sub1(this.aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            this.aClass137_Sub1_10034.method14445(false, false);
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10031, 184932253);
            this.aClass158_Sub1_Sub4_10031.method13759(0, this.aClass137_Sub1_10038.method14441());
            this.aClass158_Sub1_Sub4_10031.method13759(1, this.aClass137_Sub1_10034.method14441());
            this.aClass158_Sub1_Sub4_10031.method15628(0);
            if (!this.aClass158_Sub1_Sub4_10031.method13764()) {
                this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10031, (byte) -55);
                return false;
            } else {
                this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10031, (byte) -102);
                this.aClass128_10043 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                this.aClass128_10042 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                this.aClass128_10041 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
                this.aClass128_10023 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
                return this.aClass128_10042 != null && this.aClass128_10043 != null && this.aClass128_10041 != null && this.aClass128_10023 != null;
            }
        } else {
            return false;
        }
    }

    void method12122(int i_1, int i_2) {
        this.anInt10036 = i_1;
        this.anInt10037 = i_2;
        int i_3 = Class51.method1072(this.anInt10036, 2101962578);
        int i_4 = Class51.method1072(this.anInt10037, 2124513731);
        if (i_3 != this.anInt10039 || i_4 != this.anInt10033) {
            int i_5;
            if (this.aClass137_Sub1Array10028 != null) {
                for (i_5 = 0; i_5 < this.aClass137_Sub1Array10028.length; i_5++) {
                    this.aClass137_Sub1Array10028[i_5].method2355();
                }

                this.aClass137_Sub1Array10028 = null;
            }

            if (i_3 <= 256 && i_4 <= 256) {
                this.aClass158_Sub1_Sub4_10032 = null;
            } else {
                i_5 = i_3;
                int i_6 = i_4;
                int i_7 = 0;

                label61:
                while (true) {
                    if (i_5 <= 256 && i_6 <= 256) {
                        if (this.aClass158_Sub1_Sub4_10032 == null) {
                            this.aClass158_Sub1_Sub4_10032 = new Class158_Sub1_Sub4(this.aGraphicalRenderer_Sub1_7507);
                        }

                        this.aClass137_Sub1Array10028 = new Class137_Sub1[i_7];
                        i_5 = i_3;
                        i_6 = i_4;
                        i_7 = 0;

                        while (true) {
                            if (i_5 <= 256 && i_6 <= 256) {
                                break label61;
                            }

                            this.aClass137_Sub1Array10028[i_7++] = new Class137_Sub1(this.aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, i_5, i_6);
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

            this.anInt10039 = i_3;
            this.anInt10033 = i_4;
        }

    }

    Class76 method12127() {
        return Class76.aClass76_755;
    }

    Node_Sub5_Sub1(OpenGLGraphicalRenderer class505_sub1_1) {
        super(class505_sub1_1);
    }

    void method12121(int i_1) {
        OpenGL.glUseProgram(0);
        this.aGraphicalRenderer_Sub1_7507.method13610(1);
        this.aGraphicalRenderer_Sub1_7507.method13654(null);
        this.aGraphicalRenderer_Sub1_7507.method13610(0);
    }

    void method12134(int i_1, Class137_Sub1 class137_sub1_2, Class137_Sub1 class137_sub1_3) {
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        int i_4;
        int i_5;
        if (this.aClass137_Sub1Array10028 != null) {
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10032, -1687596109);
            i_4 = Class51.method1072(this.anInt10036, 1564999214);
            i_5 = Class51.method1072(this.anInt10037, 1704391811);

            int i_6;
            for (i_6 = 0; i_4 > 256 || i_5 > 256; i_6++) {
                OpenGL.glViewport(0, 0, i_4, i_5);
                this.aClass158_Sub1_Sub4_10032.method13759(0, this.aClass137_Sub1Array10028[i_6].method14441());
                if (i_6 == 0) {
                    this.aGraphicalRenderer_Sub1_7507.method13654(class137_sub1_2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.anInt10036, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.anInt10036, (float) this.anInt10037);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.anInt10037);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1Array10028[i_6 - 1]);
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
                }

                if (i_4 > 256) {
                    i_4 >>= 1;
                }

                if (i_5 > 256) {
                    i_5 >>= 1;
                }
            }

            this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10032, (byte) -56);
            this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1Array10028[i_6 - 1]);
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10031, -1515907534);
            this.aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            int i_7 = this.aClass128_10042.anInt1583;
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
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            this.aGraphicalRenderer_Sub1_7507.method13654(class137_sub1_2);
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10031, 1393887669);
            this.aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            i_4 = this.aClass128_10043.anInt1583;
            OpenGL.glUseProgram(i_4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "sceneTex"), 0);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "params"), aFloat10026, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.anInt10036, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.anInt10036, (float) this.anInt10037);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.anInt10037);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }

        this.aClass158_Sub1_Sub4_10031.method15628(1);
        this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1_10038);
        i_4 = this.aClass128_10023.anInt1583;
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
        this.aClass158_Sub1_Sub4_10031.method15628(0);
        this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1_10034);
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
        this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10031, (byte) -2);
        i_5 = this.aClass128_10041.anInt1583;
        OpenGL.glUseProgram(i_5);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "sceneTex"), 0);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "bloomTex"), 1);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_5, "params"), aFloat10024, aFloat10025, 0.0F);
        this.aGraphicalRenderer_Sub1_7507.method13610(1);
        this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1_10038);
        this.aGraphicalRenderer_Sub1_7507.method13610(0);
        this.aGraphicalRenderer_Sub1_7507.method13654(class137_sub1_2);
    }

    boolean method12128() {
        return this.aClass158_Sub1_Sub4_10031 != null;
    }

    boolean method12130() {
        if (this.aGraphicalRenderer_Sub1_7507.aBool8472 && this.aGraphicalRenderer_Sub1_7507.aBool8365 && this.aGraphicalRenderer_Sub1_7507.aBool8312) {
            this.aClass158_Sub1_Sub4_10031 = new Class158_Sub1_Sub4(this.aGraphicalRenderer_Sub1_7507);
            this.aClass137_Sub1_10038 = new Class137_Sub1(this.aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            this.aClass137_Sub1_10038.method14445(false, false);
            this.aClass137_Sub1_10034 = new Class137_Sub1(this.aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            this.aClass137_Sub1_10034.method14445(false, false);
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10031, -894627004);
            this.aClass158_Sub1_Sub4_10031.method13759(0, this.aClass137_Sub1_10038.method14441());
            this.aClass158_Sub1_Sub4_10031.method13759(1, this.aClass137_Sub1_10034.method14441());
            this.aClass158_Sub1_Sub4_10031.method15628(0);
            if (!this.aClass158_Sub1_Sub4_10031.method13764()) {
                this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10031, (byte) -73);
                return false;
            } else {
                this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10031, (byte) -78);
                this.aClass128_10043 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                this.aClass128_10042 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                this.aClass128_10041 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
                this.aClass128_10023 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
                return this.aClass128_10042 != null && this.aClass128_10043 != null && this.aClass128_10041 != null && this.aClass128_10023 != null;
            }
        } else {
            return false;
        }
    }

    boolean method12131() {
        if (this.aGraphicalRenderer_Sub1_7507.aBool8472 && this.aGraphicalRenderer_Sub1_7507.aBool8365 && this.aGraphicalRenderer_Sub1_7507.aBool8312) {
            this.aClass158_Sub1_Sub4_10031 = new Class158_Sub1_Sub4(this.aGraphicalRenderer_Sub1_7507);
            this.aClass137_Sub1_10038 = new Class137_Sub1(this.aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            this.aClass137_Sub1_10038.method14445(false, false);
            this.aClass137_Sub1_10034 = new Class137_Sub1(this.aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
            this.aClass137_Sub1_10034.method14445(false, false);
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10031, -1603683082);
            this.aClass158_Sub1_Sub4_10031.method13759(0, this.aClass137_Sub1_10038.method14441());
            this.aClass158_Sub1_Sub4_10031.method13759(1, this.aClass137_Sub1_10034.method14441());
            this.aClass158_Sub1_Sub4_10031.method15628(0);
            if (!this.aClass158_Sub1_Sub4_10031.method13764()) {
                this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10031, (byte) -117);
                return false;
            } else {
                this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10031, (byte) -112);
                this.aClass128_10043 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                this.aClass128_10042 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
                this.aClass128_10041 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
                this.aClass128_10023 = Class128.method2174(this.aGraphicalRenderer_Sub1_7507, new Class140[]{Class140.method2393(this.aGraphicalRenderer_Sub1_7507, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
                return this.aClass128_10042 != null && this.aClass128_10043 != null && this.aClass128_10041 != null && this.aClass128_10023 != null;
            }
        } else {
            return false;
        }
    }

    void method12132(int i_1, int i_2) {
        this.anInt10036 = i_1;
        this.anInt10037 = i_2;
        int i_3 = Class51.method1072(this.anInt10036, 1717079101);
        int i_4 = Class51.method1072(this.anInt10037, 1773583587);
        if (this.anInt10039 != i_3 || this.anInt10033 != i_4) {
            int i_5;
            if (this.aClass137_Sub1Array10028 != null) {
                for (i_5 = 0; i_5 < this.aClass137_Sub1Array10028.length; i_5++) {
                    this.aClass137_Sub1Array10028[i_5].method2355();
                }

                this.aClass137_Sub1Array10028 = null;
            }

            if (i_3 <= 256 && i_4 <= 256) {
                this.aClass158_Sub1_Sub4_10032 = null;
            } else {
                i_5 = i_3;
                int i_6 = i_4;
                int i_7 = 0;

                label61:
                while (true) {
                    if (i_5 <= 256 && i_6 <= 256) {
                        if (this.aClass158_Sub1_Sub4_10032 == null) {
                            this.aClass158_Sub1_Sub4_10032 = new Class158_Sub1_Sub4(this.aGraphicalRenderer_Sub1_7507);
                        }

                        this.aClass137_Sub1Array10028 = new Class137_Sub1[i_7];
                        i_5 = i_3;
                        i_6 = i_4;
                        i_7 = 0;

                        while (true) {
                            if (i_5 <= 256 && i_6 <= 256) {
                                break label61;
                            }

                            this.aClass137_Sub1Array10028[i_7++] = new Class137_Sub1(this.aGraphicalRenderer_Sub1_7507, 3553, Class150.aClass150_1949, Class76.aClass76_755, i_5, i_6);
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

            this.anInt10039 = i_3;
            this.anInt10033 = i_4;
        }

    }

    void method12120() {
        this.anInt10033 = -1;
        this.anInt10039 = -1;
        this.aClass158_Sub1_Sub4_10032 = null;
        this.aClass137_Sub1Array10028 = null;
        this.aClass158_Sub1_Sub4_10031 = null;
        this.aClass137_Sub1_10038 = null;
        this.aClass137_Sub1_10034 = null;
        this.aClass128_10043 = null;
        this.aClass128_10042 = null;
        this.aClass128_10041 = null;
        this.aClass128_10023 = null;
    }

    void method12135(int i_1) {
        OpenGL.glUseProgram(0);
        this.aGraphicalRenderer_Sub1_7507.method13610(1);
        this.aGraphicalRenderer_Sub1_7507.method13654(null);
        this.aGraphicalRenderer_Sub1_7507.method13610(0);
    }

    void method12124() {
        this.anInt10033 = -1;
        this.anInt10039 = -1;
        this.aClass158_Sub1_Sub4_10032 = null;
        this.aClass137_Sub1Array10028 = null;
        this.aClass158_Sub1_Sub4_10031 = null;
        this.aClass137_Sub1_10038 = null;
        this.aClass137_Sub1_10034 = null;
        this.aClass128_10043 = null;
        this.aClass128_10042 = null;
        this.aClass128_10041 = null;
        this.aClass128_10023 = null;
    }

    void method12133(int i_1, Class137_Sub1 class137_sub1_2, Class137_Sub1 class137_sub1_3) {
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        int i_4;
        int i_5;
        if (this.aClass137_Sub1Array10028 != null) {
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10032, 751227201);
            i_4 = Class51.method1072(this.anInt10036, 1146707958);
            i_5 = Class51.method1072(this.anInt10037, 1448622378);

            int i_6;
            for (i_6 = 0; i_4 > 256 || i_5 > 256; i_6++) {
                OpenGL.glViewport(0, 0, i_4, i_5);
                this.aClass158_Sub1_Sub4_10032.method13759(0, this.aClass137_Sub1Array10028[i_6].method14441());
                if (i_6 == 0) {
                    this.aGraphicalRenderer_Sub1_7507.method13654(class137_sub1_2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.anInt10036, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.anInt10036, (float) this.anInt10037);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.anInt10037);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1Array10028[i_6 - 1]);
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
                }

                if (i_4 > 256) {
                    i_4 >>= 1;
                }

                if (i_5 > 256) {
                    i_5 >>= 1;
                }
            }

            this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10032, (byte) -62);
            this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1Array10028[i_6 - 1]);
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10031, 1797681002);
            this.aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            int i_7 = this.aClass128_10042.anInt1583;
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
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            this.aGraphicalRenderer_Sub1_7507.method13654(class137_sub1_2);
            this.aGraphicalRenderer_Sub1_7507.method8637(this.aClass158_Sub1_Sub4_10031, 1101521833);
            this.aClass158_Sub1_Sub4_10031.method15628(0);
            OpenGL.glViewport(0, 0, 256, 256);
            i_4 = this.aClass128_10043.anInt1583;
            OpenGL.glUseProgram(i_4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "sceneTex"), 0);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "params"), aFloat10026, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.anInt10036, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.anInt10036, (float) this.anInt10037);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.anInt10037);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }

        this.aClass158_Sub1_Sub4_10031.method15628(1);
        this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1_10038);
        i_4 = this.aClass128_10023.anInt1583;
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
        this.aClass158_Sub1_Sub4_10031.method15628(0);
        this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1_10034);
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
        this.aGraphicalRenderer_Sub1_7507.method8416(this.aClass158_Sub1_Sub4_10031, (byte) -14);
        i_5 = this.aClass128_10041.anInt1583;
        OpenGL.glUseProgram(i_5);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "sceneTex"), 0);
        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5, "bloomTex"), 1);
        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_5, "params"), aFloat10024, aFloat10025, 0.0F);
        this.aGraphicalRenderer_Sub1_7507.method13610(1);
        this.aGraphicalRenderer_Sub1_7507.method13654(this.aClass137_Sub1_10038);
        this.aGraphicalRenderer_Sub1_7507.method13610(0);
        this.aGraphicalRenderer_Sub1_7507.method13654(class137_sub1_2);
    }

}
