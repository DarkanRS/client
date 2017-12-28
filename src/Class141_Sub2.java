
/* Class141_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141_Sub2 extends Class141 {
	boolean aBool9037;
	static final String aString9038 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	static final String aString9039 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	boolean aBool9040 = false;
	Class128 aClass128_9041;
	Class136 aClass136_9042;

	void method2397(boolean bool) {
		Class137_Sub2 class137_sub2 = ((Class141_Sub2) this).aClass505_Sub1_1664.method13596();
		if (((Class141_Sub2) this).aBool9037 && class137_sub2 != null) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(class137_sub2);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub2) this).aClass136_9042).aClass137_Sub4_1638);
			int i = ((Class128) ((Class141_Sub2) this).aClass128_9041).anInt1583;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloatArray8426[0]), -(((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloatArray8426[1]), -(((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloatArray8426[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloat8429), (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloat8430), (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloat8431), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(((Class505_Sub1) (((Class141_Sub2) this).aClass505_Sub1_1664)).aFloatArray8426[1]) * 928.0F);
			((Class141_Sub2) this).aBool9040 = true;
		}
	}

	boolean method2395() {
		return ((Class141_Sub2) this).aBool9037;
	}

	void method2398() {
		if (((Class141_Sub2) this).aBool9040) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(null);
			OpenGL.glUseProgram(0);
			((Class141_Sub2) this).aBool9040 = false;
		}
	}

	void method2408(boolean bool) {
		/* empty */
	}

	void method2404(boolean bool) {
		/* empty */
	}

	void method2405(boolean bool) {
		/* empty */
	}

	void method2400(Class137 class137, int i) {
		if (!((Class141_Sub2) this).aBool9040) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	boolean method2401() {
		return ((Class141_Sub2) this).aBool9037;
	}

	void method2402(boolean bool) {
		Class137_Sub2 class137_sub2 = ((Class141_Sub2) this).aClass505_Sub1_1664.method13596();
		if (((Class141_Sub2) this).aBool9037 && class137_sub2 != null) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(class137_sub2);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub2) this).aClass136_9042).aClass137_Sub4_1638);
			int i = ((Class128) ((Class141_Sub2) this).aClass128_9041).anInt1583;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloatArray8426[0]), -(((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloatArray8426[1]), -(((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloatArray8426[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloat8429), (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloat8430), (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloat8431), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(((Class505_Sub1) (((Class141_Sub2) this).aClass505_Sub1_1664)).aFloatArray8426[1]) * 928.0F);
			((Class141_Sub2) this).aBool9040 = true;
		}
	}

	Class141_Sub2(Class505_Sub1 class505_sub1, Class136 class136) {
		super(class505_sub1);
		((Class141_Sub2) this).aBool9037 = false;
		((Class141_Sub2) this).aClass136_9042 = class136;
		if ((((Class136) ((Class141_Sub2) this).aClass136_9042).aClass137_Sub4_1638) != null && (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aBool8485) && (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aBool8365)) {
			Class140 class140 = (Class140.method2393(((Class141_Sub2) this).aClass505_Sub1_1664, 35633,
					"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class140 class140_0_ = (Class140.method2393(((Class141_Sub2) this).aClass505_Sub1_1664, 35632,
					"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			((Class141_Sub2) this).aClass128_9041 = Class128.method2174((((Class141_Sub2) this).aClass505_Sub1_1664), new Class140[] { class140, class140_0_ });
			((Class141_Sub2) this).aBool9037 = ((Class141_Sub2) this).aClass128_9041 != null;
		}
	}

	void method2403(boolean bool) {
		Class137_Sub2 class137_sub2 = ((Class141_Sub2) this).aClass505_Sub1_1664.method13596();
		if (((Class141_Sub2) this).aBool9037 && class137_sub2 != null) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(class137_sub2);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub2) this).aClass136_9042).aClass137_Sub4_1638);
			int i = ((Class128) ((Class141_Sub2) this).aClass128_9041).anInt1583;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloatArray8426[0]), -(((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloatArray8426[1]), -(((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloatArray8426[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloat8429), (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloat8430), (((Class505_Sub1) ((Class141_Sub2) this).aClass505_Sub1_1664).aFloat8431), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(((Class505_Sub1) (((Class141_Sub2) this).aClass505_Sub1_1664)).aFloatArray8426[1]) * 928.0F);
			((Class141_Sub2) this).aBool9040 = true;
		}
	}

	void method2399(int i, int i_1_) {
		if (((Class141_Sub2) this).aBool9040) {
			int i_2_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_3_ = i_1_ & 0xffff;
			float f_4_ = (float) (i_1_ >> 16 & 0x3) / 8.0F;
			int i_5_ = ((Class128) ((Class141_Sub2) this).aClass128_9041).anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_5_, "time"), (float) (i_2_ * ((Class505_Sub1) (((Class141_Sub2) this).aClass505_Sub1_1664)).anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_5_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_5_, "breakWaterDepth"), (float) i_3_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_5_, "breakWaterOffset"), f_4_);
		}
	}

	void method2406(boolean bool) {
		/* empty */
	}

	void method2407(boolean bool) {
		/* empty */
	}

	void method2411() {
		if (((Class141_Sub2) this).aBool9040) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(null);
			OpenGL.glUseProgram(0);
			((Class141_Sub2) this).aBool9040 = false;
		}
	}

	void method2409(int i, int i_6_) {
		if (((Class141_Sub2) this).aBool9040) {
			int i_7_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_8_ = i_6_ & 0xffff;
			float f_9_ = (float) (i_6_ >> 16 & 0x3) / 8.0F;
			int i_10_ = ((Class128) ((Class141_Sub2) this).aClass128_9041).anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "time"), (float) (i_7_ * ((Class505_Sub1) (((Class141_Sub2) this).aClass505_Sub1_1664)).anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "breakWaterDepth"), (float) i_8_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "breakWaterOffset"), f_9_);
		}
	}

	void method2396(int i, int i_11_) {
		if (((Class141_Sub2) this).aBool9040) {
			int i_12_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_13_ = i_11_ & 0xffff;
			float f_14_ = (float) (i_11_ >> 16 & 0x3) / 8.0F;
			int i_15_ = ((Class128) ((Class141_Sub2) this).aClass128_9041).anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "time"), (float) (i_12_ * ((Class505_Sub1) (((Class141_Sub2) this).aClass505_Sub1_1664)).anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterDepth"), (float) i_13_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterOffset"), f_14_);
		}
	}

	void method2410(int i, int i_16_) {
		if (((Class141_Sub2) this).aBool9040) {
			int i_17_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_18_ = i_16_ & 0xffff;
			float f_19_ = (float) (i_16_ >> 16 & 0x3) / 8.0F;
			int i_20_ = ((Class128) ((Class141_Sub2) this).aClass128_9041).anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "time"), (float) (i_17_ * ((Class505_Sub1) (((Class141_Sub2) this).aClass505_Sub1_1664)).anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "breakWaterDepth"), (float) i_18_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "breakWaterOffset"), f_19_);
		}
	}

	void method2394(Class137 class137, int i) {
		if (!((Class141_Sub2) this).aBool9040) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2412(Class137 class137, int i) {
		if (!((Class141_Sub2) this).aBool9040) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2413(Class137 class137, int i) {
		if (!((Class141_Sub2) this).aBool9040) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2414(Class137 class137, int i) {
		if (!((Class141_Sub2) this).aBool9040) {
			((Class141_Sub2) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub2) this).aClass505_Sub1_1664.method13612(i);
		}
	}
}
