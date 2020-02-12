package com.jagex;

import jaggl.OpenGL;

public class Class141_Sub8 extends Class141 {

    boolean aBool9095 = false;
    boolean aBool9096 = false;
    Class136 aClass136_9093;
    Class128 aClass128_9092;

    void method2407(boolean bool_1) {
    }

    boolean method2395() {
        return this.aBool9096;
    }

    void method2398() {
        if (this.aBool9095) {
            this.aGraphicalRenderer_Sub1_1664.method13610(1);
            this.aGraphicalRenderer_Sub1_1664.method13654(null);
            this.aGraphicalRenderer_Sub1_1664.method13610(0);
            this.aGraphicalRenderer_Sub1_1664.method13654(null);
            OpenGL.glUseProgram(0);
            this.aBool9095 = false;
        }

    }

    void method2408(boolean bool_1) {
    }

    void method2400(Class137 class137_1, int i_2) {
        if (!this.aBool9095) {
            this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
            this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
        }

    }

    void method2399(int i_1, int i_2) {
        if (this.aBool9095) {
            int i_3 = 1 << (i_1 & 0x3);
            float f_4 = (float) (1 << (i_1 >> 3 & 0x7)) / 32.0F;
            int i_5 = i_2 & 0xffff;
            float f_6 = (float) (i_2 >> 16 & 0x3) / 8.0F;
            float f_7 = (float) (i_2 >> 19 & 0xf) / 16.0F;
            float f_8 = (float) (i_2 >> 23 & 0xf) / 16.0F;
            int i_9 = i_2 >> 27 & 0xf;
            int i_10 = this.aClass128_9092.anInt1583;
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "time"), (float) (this.aGraphicalRenderer_Sub1_1664.anInt8368 * i_3 % 40000) / 40000.0F);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "scale"), f_4);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "breakWaterDepth"), (float) i_5);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "breakWaterOffset"), f_6);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_10, "waveIntensity"), f_8, f_7);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "waveExponent"), (float) i_9);
        }

    }

    void method2405(boolean bool_1) {
    }

    Class141_Sub8(OpenGLGraphicalRenderer class505_sub1_1, Class136 class136_2) {
        super(class505_sub1_1);
        this.aClass136_9093 = class136_2;
        if (this.aClass136_9093.aClass137_Sub4_1638 != null && this.aGraphicalRenderer_Sub1_1664.aBool8485 && this.aGraphicalRenderer_Sub1_1664.aBool8365) {
            Class140 class140_3 = Class140.method2393(this.aGraphicalRenderer_Sub1_1664, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            Class140 class140_4 = Class140.method2393(this.aGraphicalRenderer_Sub1_1664, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.aClass128_9092 = Class128.method2174(this.aGraphicalRenderer_Sub1_1664, new Class140[]{class140_3, class140_4});
            this.aBool9096 = this.aClass128_9092 != null;
        }

    }

    void method2402(boolean bool_1) {
        Class137_Sub2 class137_sub2_2 = this.aGraphicalRenderer_Sub1_1664.method13596();
        if (this.aBool9096 && class137_sub2_2 != null) {
            float f_3 = 1.0F + (1.0F - Math.abs(this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[1])) * 2.0F;
            this.aGraphicalRenderer_Sub1_1664.method13610(1);
            this.aGraphicalRenderer_Sub1_1664.method13654(class137_sub2_2);
            this.aGraphicalRenderer_Sub1_1664.method13610(0);
            this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9093.aClass137_Sub4_1638);
            int i_4 = this.aClass128_9092.anInt1583;
            OpenGL.glUseProgram(i_4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "normalSampler"), 0);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "envMapSampler"), 1);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "sunDir"), -this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[0], -this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[1], -this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[2]);
            OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_4, "sunColour"), this.aGraphicalRenderer_Sub1_1664.aFloat8429 * f_3, this.aGraphicalRenderer_Sub1_1664.aFloat8430 * f_3, this.aGraphicalRenderer_Sub1_1664.aFloat8431 * f_3, 1.0F);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4, "sunExponent"), 64.0F + Math.abs(this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[1]) * 928.0F);
            this.aBool9095 = true;
        }

    }

    void method2403(boolean bool_1) {
        Class137_Sub2 class137_sub2_2 = this.aGraphicalRenderer_Sub1_1664.method13596();
        if (this.aBool9096 && class137_sub2_2 != null) {
            float f_3 = 1.0F + (1.0F - Math.abs(this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[1])) * 2.0F;
            this.aGraphicalRenderer_Sub1_1664.method13610(1);
            this.aGraphicalRenderer_Sub1_1664.method13654(class137_sub2_2);
            this.aGraphicalRenderer_Sub1_1664.method13610(0);
            this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9093.aClass137_Sub4_1638);
            int i_4 = this.aClass128_9092.anInt1583;
            OpenGL.glUseProgram(i_4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "normalSampler"), 0);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "envMapSampler"), 1);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "sunDir"), -this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[0], -this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[1], -this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[2]);
            OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_4, "sunColour"), this.aGraphicalRenderer_Sub1_1664.aFloat8429 * f_3, this.aGraphicalRenderer_Sub1_1664.aFloat8430 * f_3, this.aGraphicalRenderer_Sub1_1664.aFloat8431 * f_3, 1.0F);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4, "sunExponent"), 64.0F + Math.abs(this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[1]) * 928.0F);
            this.aBool9095 = true;
        }

    }

    void method2404(boolean bool_1) {
    }

    void method2413(Class137 class137_1, int i_2) {
        if (!this.aBool9095) {
            this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
            this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
        }

    }

    boolean method2401() {
        return this.aBool9096;
    }

    void method2394(Class137 class137_1, int i_2) {
        if (!this.aBool9095) {
            this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
            this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
        }

    }

    void method2411() {
        if (this.aBool9095) {
            this.aGraphicalRenderer_Sub1_1664.method13610(1);
            this.aGraphicalRenderer_Sub1_1664.method13654(null);
            this.aGraphicalRenderer_Sub1_1664.method13610(0);
            this.aGraphicalRenderer_Sub1_1664.method13654(null);
            OpenGL.glUseProgram(0);
            this.aBool9095 = false;
        }

    }

    void method2397(boolean bool_1) {
        Class137_Sub2 class137_sub2_2 = this.aGraphicalRenderer_Sub1_1664.method13596();
        if (this.aBool9096 && class137_sub2_2 != null) {
            float f_3 = 1.0F + (1.0F - Math.abs(this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[1])) * 2.0F;
            this.aGraphicalRenderer_Sub1_1664.method13610(1);
            this.aGraphicalRenderer_Sub1_1664.method13654(class137_sub2_2);
            this.aGraphicalRenderer_Sub1_1664.method13610(0);
            this.aGraphicalRenderer_Sub1_1664.method13654(this.aClass136_9093.aClass137_Sub4_1638);
            int i_4 = this.aClass128_9092.anInt1583;
            OpenGL.glUseProgram(i_4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "normalSampler"), 0);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4, "envMapSampler"), 1);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4, "sunDir"), -this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[0], -this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[1], -this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[2]);
            OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_4, "sunColour"), this.aGraphicalRenderer_Sub1_1664.aFloat8429 * f_3, this.aGraphicalRenderer_Sub1_1664.aFloat8430 * f_3, this.aGraphicalRenderer_Sub1_1664.aFloat8431 * f_3, 1.0F);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4, "sunExponent"), 64.0F + Math.abs(this.aGraphicalRenderer_Sub1_1664.aFloatArray8426[1]) * 928.0F);
            this.aBool9095 = true;
        }

    }

    void method2396(int i_1, int i_2) {
        if (this.aBool9095) {
            int i_3 = 1 << (i_1 & 0x3);
            float f_4 = (float) (1 << (i_1 >> 3 & 0x7)) / 32.0F;
            int i_5 = i_2 & 0xffff;
            float f_6 = (float) (i_2 >> 16 & 0x3) / 8.0F;
            float f_7 = (float) (i_2 >> 19 & 0xf) / 16.0F;
            float f_8 = (float) (i_2 >> 23 & 0xf) / 16.0F;
            int i_9 = i_2 >> 27 & 0xf;
            int i_10 = this.aClass128_9092.anInt1583;
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "time"), (float) (i_3 * this.aGraphicalRenderer_Sub1_1664.anInt8368 % 40000) / 40000.0F);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "scale"), f_4);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "breakWaterDepth"), (float) i_5);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "breakWaterOffset"), f_6);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_10, "waveIntensity"), f_8, f_7);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "waveExponent"), (float) i_9);
        }

    }

    void method2410(int i_1, int i_2) {
        if (this.aBool9095) {
            int i_3 = 1 << (i_1 & 0x3);
            float f_4 = (float) (1 << (i_1 >> 3 & 0x7)) / 32.0F;
            int i_5 = i_2 & 0xffff;
            float f_6 = (float) (i_2 >> 16 & 0x3) / 8.0F;
            float f_7 = (float) (i_2 >> 19 & 0xf) / 16.0F;
            float f_8 = (float) (i_2 >> 23 & 0xf) / 16.0F;
            int i_9 = i_2 >> 27 & 0xf;
            int i_10 = this.aClass128_9092.anInt1583;
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "time"), (float) (i_3 * this.aGraphicalRenderer_Sub1_1664.anInt8368 % 40000) / 40000.0F);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "scale"), f_4);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "breakWaterDepth"), (float) i_5);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "breakWaterOffset"), f_6);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_10, "waveIntensity"), f_8, f_7);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "waveExponent"), (float) i_9);
        }

    }

    void method2409(int i_1, int i_2) {
        if (this.aBool9095) {
            int i_3 = 1 << (i_1 & 0x3);
            float f_4 = (float) (1 << (i_1 >> 3 & 0x7)) / 32.0F;
            int i_5 = i_2 & 0xffff;
            float f_6 = (float) (i_2 >> 16 & 0x3) / 8.0F;
            float f_7 = (float) (i_2 >> 19 & 0xf) / 16.0F;
            float f_8 = (float) (i_2 >> 23 & 0xf) / 16.0F;
            int i_9 = i_2 >> 27 & 0xf;
            int i_10 = this.aClass128_9092.anInt1583;
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "time"), (float) (i_3 * this.aGraphicalRenderer_Sub1_1664.anInt8368 % 40000) / 40000.0F);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "scale"), f_4);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "breakWaterDepth"), (float) i_5);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "breakWaterOffset"), f_6);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_10, "waveIntensity"), f_8, f_7);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10, "waveExponent"), (float) i_9);
        }

    }

    void method2412(Class137 class137_1, int i_2) {
        if (!this.aBool9095) {
            this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
            this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
        }

    }

    void method2406(boolean bool_1) {
    }

    void method2414(Class137 class137_1, int i_2) {
        if (!this.aBool9095) {
            this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
            this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
        }

    }

}
