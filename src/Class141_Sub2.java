import jaggl.OpenGL;

public class Class141_Sub2 extends Class141 {

	boolean aBool9040 = false;
	boolean aBool9037 = false;
	Class136 aClass136_9042;
	Class128 aClass128_9041;

	void method2397(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = this.aClass505_Sub1_1664.method13596();
		if (this.aBool9037 && class137_sub2_2 != null) {
			this.aClass505_Sub1_1664.method13610(1);
			this.aClass505_Sub1_1664.method13654(class137_sub2_2);
			this.aClass505_Sub1_1664.method13610(0);
			this.aClass505_Sub1_1664.method13654(this.aClass136_9042.aClass137_Sub4_1638);
			int i_3 = this.aClass128_9041.anInt1583;
			OpenGL.glUseProgram(i_3);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_3, "sunDir"), -this.aClass505_Sub1_1664.aFloatArray8426[0], -this.aClass505_Sub1_1664.aFloatArray8426[1], -this.aClass505_Sub1_1664.aFloatArray8426[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3, "sunColour"), this.aClass505_Sub1_1664.aFloat8429, this.aClass505_Sub1_1664.aFloat8430, this.aClass505_Sub1_1664.aFloat8431, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3, "sunExponent"), 96.0F + Math.abs(this.aClass505_Sub1_1664.aFloatArray8426[1]) * 928.0F);
			this.aBool9040 = true;
		}

	}

	boolean method2395() {
		return this.aBool9037;
	}

	void method2398() {
		if (this.aBool9040) {
			this.aClass505_Sub1_1664.method13610(1);
			this.aClass505_Sub1_1664.method13654((Class137) null);
			this.aClass505_Sub1_1664.method13610(0);
			this.aClass505_Sub1_1664.method13654((Class137) null);
			OpenGL.glUseProgram(0);
			this.aBool9040 = false;
		}

	}

	void method2408(boolean bool_1) {
	}

	void method2404(boolean bool_1) {
	}

	void method2405(boolean bool_1) {
	}

	void method2400(Class137 class137_1, int i_2) {
		if (!this.aBool9040) {
			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

	boolean method2401() {
		return this.aBool9037;
	}

	void method2402(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = this.aClass505_Sub1_1664.method13596();
		if (this.aBool9037 && class137_sub2_2 != null) {
			this.aClass505_Sub1_1664.method13610(1);
			this.aClass505_Sub1_1664.method13654(class137_sub2_2);
			this.aClass505_Sub1_1664.method13610(0);
			this.aClass505_Sub1_1664.method13654(this.aClass136_9042.aClass137_Sub4_1638);
			int i_3 = this.aClass128_9041.anInt1583;
			OpenGL.glUseProgram(i_3);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_3, "sunDir"), -this.aClass505_Sub1_1664.aFloatArray8426[0], -this.aClass505_Sub1_1664.aFloatArray8426[1], -this.aClass505_Sub1_1664.aFloatArray8426[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3, "sunColour"), this.aClass505_Sub1_1664.aFloat8429, this.aClass505_Sub1_1664.aFloat8430, this.aClass505_Sub1_1664.aFloat8431, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3, "sunExponent"), 96.0F + Math.abs(this.aClass505_Sub1_1664.aFloatArray8426[1]) * 928.0F);
			this.aBool9040 = true;
		}

	}

	Class141_Sub2(OpenGLGraphicalRenderer class505_sub1_1, Class136 class136_2) {
		super(class505_sub1_1);
		this.aClass136_9042 = class136_2;
		if (this.aClass136_9042.aClass137_Sub4_1638 != null && this.aClass505_Sub1_1664.aBool8485 && this.aClass505_Sub1_1664.aBool8365) {
			Class140 class140_3 = Class140.method2393(this.aClass505_Sub1_1664, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			Class140 class140_4 = Class140.method2393(this.aClass505_Sub1_1664, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass128_9041 = Class128.method2174(this.aClass505_Sub1_1664, new Class140[] { class140_3, class140_4 });
			this.aBool9037 = this.aClass128_9041 != null;
		}

	}

	void method2403(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = this.aClass505_Sub1_1664.method13596();
		if (this.aBool9037 && class137_sub2_2 != null) {
			this.aClass505_Sub1_1664.method13610(1);
			this.aClass505_Sub1_1664.method13654(class137_sub2_2);
			this.aClass505_Sub1_1664.method13610(0);
			this.aClass505_Sub1_1664.method13654(this.aClass136_9042.aClass137_Sub4_1638);
			int i_3 = this.aClass128_9041.anInt1583;
			OpenGL.glUseProgram(i_3);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_3, "sunDir"), -this.aClass505_Sub1_1664.aFloatArray8426[0], -this.aClass505_Sub1_1664.aFloatArray8426[1], -this.aClass505_Sub1_1664.aFloatArray8426[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3, "sunColour"), this.aClass505_Sub1_1664.aFloat8429, this.aClass505_Sub1_1664.aFloat8430, this.aClass505_Sub1_1664.aFloat8431, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3, "sunExponent"), 96.0F + Math.abs(this.aClass505_Sub1_1664.aFloatArray8426[1]) * 928.0F);
			this.aBool9040 = true;
		}

	}

	void method2399(int i_1, int i_2) {
		if (this.aBool9040) {
			int i_3 = 1 << (i_1 & 0x3);
			float f_4 = (float) (1 << (i_1 >> 3 & 0x7)) / 32.0F;
			int i_5 = i_2 & 0xffff;
			float f_6 = (float) (i_2 >> 16 & 0x3) / 8.0F;
			int i_7 = this.aClass128_9041.anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "time"), (float) (this.aClass505_Sub1_1664.anInt8368 * i_3 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "scale"), f_4);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterDepth"), (float) i_5);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterOffset"), f_6);
		}

	}

	void method2406(boolean bool_1) {
	}

	void method2407(boolean bool_1) {
	}

	void method2411() {
		if (this.aBool9040) {
			this.aClass505_Sub1_1664.method13610(1);
			this.aClass505_Sub1_1664.method13654((Class137) null);
			this.aClass505_Sub1_1664.method13610(0);
			this.aClass505_Sub1_1664.method13654((Class137) null);
			OpenGL.glUseProgram(0);
			this.aBool9040 = false;
		}

	}

	void method2409(int i_1, int i_2) {
		if (this.aBool9040) {
			int i_3 = 1 << (i_1 & 0x3);
			float f_4 = (float) (1 << (i_1 >> 3 & 0x7)) / 32.0F;
			int i_5 = i_2 & 0xffff;
			float f_6 = (float) (i_2 >> 16 & 0x3) / 8.0F;
			int i_7 = this.aClass128_9041.anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "time"), (float) (i_3 * this.aClass505_Sub1_1664.anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "scale"), f_4);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterDepth"), (float) i_5);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterOffset"), f_6);
		}

	}

	void method2396(int i_1, int i_2) {
		if (this.aBool9040) {
			int i_3 = 1 << (i_1 & 0x3);
			float f_4 = (float) (1 << (i_1 >> 3 & 0x7)) / 32.0F;
			int i_5 = i_2 & 0xffff;
			float f_6 = (float) (i_2 >> 16 & 0x3) / 8.0F;
			int i_7 = this.aClass128_9041.anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "time"), (float) (i_3 * this.aClass505_Sub1_1664.anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "scale"), f_4);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterDepth"), (float) i_5);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterOffset"), f_6);
		}

	}

	void method2410(int i_1, int i_2) {
		if (this.aBool9040) {
			int i_3 = 1 << (i_1 & 0x3);
			float f_4 = (float) (1 << (i_1 >> 3 & 0x7)) / 32.0F;
			int i_5 = i_2 & 0xffff;
			float f_6 = (float) (i_2 >> 16 & 0x3) / 8.0F;
			int i_7 = this.aClass128_9041.anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "time"), (float) (i_3 * this.aClass505_Sub1_1664.anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "scale"), f_4);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterDepth"), (float) i_5);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterOffset"), f_6);
		}

	}

	void method2394(Class137 class137_1, int i_2) {
		if (!this.aBool9040) {
			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

	void method2412(Class137 class137_1, int i_2) {
		if (!this.aBool9040) {
			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

	void method2413(Class137 class137_1, int i_2) {
		if (!this.aBool9040) {
			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

	void method2414(Class137 class137_1, int i_2) {
		if (!this.aBool9040) {
			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

}
