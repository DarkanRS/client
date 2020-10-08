package com.jagex;

import jaggl.OpenGL;

public class Class164 {

    Class128 aClass128_2032;
    OpenGLRenderer aGraphicalRenderer_Sub1_2033;

    Class164(OpenGLRenderer class505_sub1_1) {
        aGraphicalRenderer_Sub1_2033 = class505_sub1_1;
    }

    boolean method2847() {
        if (aGraphicalRenderer_Sub1_2033.aBool8472 && aGraphicalRenderer_Sub1_2033.aBool8365 && aClass128_2032 == null) {
            Class140 class140_1 = Class140.method2393(aGraphicalRenderer_Sub1_2033, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            if (class140_1 != null) {
                aClass128_2032 = Class128.method2174(aGraphicalRenderer_Sub1_2033, new Class140[]{class140_1});
            }
        }

        return aClass128_2032 != null;
    }

    boolean method2848(Class137_Sub4 class137_sub4_1, Class137_Sub4 class137_sub4_2) {
        if (!method2847()) {
            return false;
        } else {
            Class158_Sub1_Sub4 class158_sub1_sub4_4 = aGraphicalRenderer_Sub1_2033.aClass158_Sub1_Sub4_8493;
            CacheableNode_Sub19 class282_sub50_sub19_5 = new CacheableNode_Sub19(aGraphicalRenderer_Sub1_2033, Class150.aClass150_1949, Class76.aClass76_751, class137_sub4_1.anInt9116, class137_sub4_1.anInt9117);
            boolean bool_6 = false;
            aGraphicalRenderer_Sub1_2033.method8637(class158_sub1_sub4_4);
            class158_sub1_sub4_4.method13759(0, class282_sub50_sub19_5);
            if (class158_sub1_sub4_4.method13764()) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, class137_sub4_1.anInt9116, class137_sub4_1.anInt9117);
                OpenGL.glUseProgram(aClass128_2032.anInt1583);
                OpenGL.glUniform1i(OpenGL.glGetUniformLocation(aClass128_2032.anInt1583, "heightMap"), 0);
                OpenGL.glUniform1f(OpenGL.glGetUniformLocation(aClass128_2032.anInt1583, "rcpRelief"), 0.5f);
                OpenGL.glUniform2f(OpenGL.glGetUniformLocation(aClass128_2032.anInt1583, "sampleSize"), 1.0F / class137_sub4_2.anInt9116, 1.0F / class137_sub4_2.anInt9117);

                for (int i_7 = 0; i_7 < class137_sub4_1.anInt9118; i_7++) {
                    float f_8 = (float) i_7 / class137_sub4_1.anInt9118;
                    aGraphicalRenderer_Sub1_2033.method13654(class137_sub4_2);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord3f(0.0F, 0.0F, f_8);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3f(1.0F, 0.0F, f_8);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3f(1.0F, 1.0F, f_8);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3f(0.0F, 1.0F, f_8);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                    OpenGL.glEnd();
                    class137_sub4_1.method14465(i_7, class137_sub4_1.anInt9116, class137_sub4_1.anInt9117);
                }

                OpenGL.glUseProgram(0);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                OpenGL.glPopMatrix();
                bool_6 = true;
            }

            class158_sub1_sub4_4.method13759(0, null);
            aGraphicalRenderer_Sub1_2033.method8416(class158_sub1_sub4_4);
            return bool_6;
        }
    }

}
