/* Class47_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub9 extends Class47 {
	static String aString6808 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	boolean aBoolean6809;
	static String aString6810 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	boolean aBoolean6811 = false;
	Class29 aClass29_6812;
	Class45 aClass45_6813;

	void method509(boolean bool) {
		/* empty */
	}

	void method511() {
		if (((Class47_Sub9) this).aBoolean6811) {
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(null);
			OpenGL.glUseProgram(0);
			((Class47_Sub9) this).aBoolean6811 = false;
		}
	}

	void method505(boolean bool) {
		Class30_Sub1 class30_sub1 = ((Class47_Sub9) this).aClass_ra_Sub2_491.method5280();
		if (((Class47_Sub9) this).aBoolean6809 && class30_sub1 != null) {
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(class30_sub1);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub9) this).aClass45_6813).aClass30_Sub4_485);
			int i = ((Class29) ((Class47_Sub9) this).aClass29_6812).anInt365;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloatArray8124[0]), -(((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloatArray8124[1]), -(((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloatArray8124[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloat8125), (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloat8128), (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloat8191), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(((Class_ra_Sub2) (((Class47_Sub9) this).aClass_ra_Sub2_491)).aFloatArray8124[1]) * 928.0F);
			((Class47_Sub9) this).aBoolean6811 = true;
		}
	}

	void method518(boolean bool) {
		/* empty */
	}

	void method504() {
		if (((Class47_Sub9) this).aBoolean6811) {
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(null);
			OpenGL.glUseProgram(0);
			((Class47_Sub9) this).aBoolean6811 = false;
		}
	}

	void method503(int i, int i_0_) {
		if (((Class47_Sub9) this).aBoolean6811) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			int i_4_ = ((Class29) ((Class47_Sub9) this).aClass29_6812).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"), (float) (i_1_ * ((Class_ra_Sub2) (((Class47_Sub9) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterOffset"), f_3_);
		}
	}

	void method500(Class30 class30, int i) {
		if (!((Class47_Sub9) this).aBoolean6811) {
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(class30);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5243(i);
		}
	}

	void method506(boolean bool) {
		Class30_Sub1 class30_sub1 = ((Class47_Sub9) this).aClass_ra_Sub2_491.method5280();
		if (((Class47_Sub9) this).aBoolean6809 && class30_sub1 != null) {
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(class30_sub1);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub9) this).aClass45_6813).aClass30_Sub4_485);
			int i = ((Class29) ((Class47_Sub9) this).aClass29_6812).anInt365;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloatArray8124[0]), -(((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloatArray8124[1]), -(((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloatArray8124[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloat8125), (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloat8128), (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloat8191), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(((Class_ra_Sub2) (((Class47_Sub9) this).aClass_ra_Sub2_491)).aFloatArray8124[1]) * 928.0F);
			((Class47_Sub9) this).aBoolean6811 = true;
		}
	}

	void method507(boolean bool) {
		Class30_Sub1 class30_sub1 = ((Class47_Sub9) this).aClass_ra_Sub2_491.method5280();
		if (((Class47_Sub9) this).aBoolean6809 && class30_sub1 != null) {
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(class30_sub1);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub9) this).aClass45_6813).aClass30_Sub4_485);
			int i = ((Class29) ((Class47_Sub9) this).aClass29_6812).anInt365;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloatArray8124[0]), -(((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloatArray8124[1]), -(((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloatArray8124[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloat8125), (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloat8128), (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aFloat8191), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + Math.abs(((Class_ra_Sub2) (((Class47_Sub9) this).aClass_ra_Sub2_491)).aFloatArray8124[1]) * 928.0F);
			((Class47_Sub9) this).aBoolean6811 = true;
		}
	}

	void method508(boolean bool) {
		/* empty */
	}

	void method519(Class30 class30, int i) {
		if (!((Class47_Sub9) this).aBoolean6811) {
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(class30);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5243(i);
		}
	}

	void method510(boolean bool) {
		/* empty */
	}

	void method513(int i, int i_5_) {
		if (((Class47_Sub9) this).aBoolean6811) {
			int i_6_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_7_ = i_5_ & 0xffff;
			float f_8_ = (float) (i_5_ >> 16 & 0x3) / 8.0F;
			int i_9_ = ((Class29) ((Class47_Sub9) this).aClass29_6812).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "time"), (float) (i_6_ * ((Class_ra_Sub2) (((Class47_Sub9) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "breakWaterDepth"), (float) i_7_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "breakWaterOffset"), f_8_);
		}
	}

	void method512() {
		if (((Class47_Sub9) this).aBoolean6811) {
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(null);
			OpenGL.glUseProgram(0);
			((Class47_Sub9) this).aBoolean6811 = false;
		}
	}

	boolean method501() {
		return ((Class47_Sub9) this).aBoolean6809;
	}

	void method502(int i, int i_10_) {
		if (((Class47_Sub9) this).aBoolean6811) {
			int i_11_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_12_ = i_10_ & 0xffff;
			float f_13_ = (float) (i_10_ >> 16 & 0x3) / 8.0F;
			int i_14_ = ((Class29) ((Class47_Sub9) this).aClass29_6812).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "time"), (float) (i_11_ * ((Class_ra_Sub2) (((Class47_Sub9) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "breakWaterDepth"), (float) i_12_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "breakWaterOffset"), f_13_);
		}
	}

	void method516(int i, int i_15_) {
		if (((Class47_Sub9) this).aBoolean6811) {
			int i_16_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_17_ = i_15_ & 0xffff;
			float f_18_ = (float) (i_15_ >> 16 & 0x3) / 8.0F;
			int i_19_ = ((Class29) ((Class47_Sub9) this).aClass29_6812).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_19_, "time"), (float) (i_16_ * ((Class_ra_Sub2) (((Class47_Sub9) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_19_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_19_, "breakWaterDepth"), (float) i_17_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_19_, "breakWaterOffset"), f_18_);
		}
	}

	Class47_Sub9(Class_ra_Sub2 class_ra_sub2, Class45 class45) {
		super(class_ra_sub2);
		((Class47_Sub9) this).aBoolean6809 = false;
		((Class47_Sub9) this).aClass45_6813 = class45;
		if ((((Class45) ((Class47_Sub9) this).aClass45_6813).aClass30_Sub4_485 != null) && (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aBoolean8183) && (((Class_ra_Sub2) ((Class47_Sub9) this).aClass_ra_Sub2_491).aBoolean8093)) {
			Class48 class48 = (Class48
					.method526(
							((Class47_Sub9) this).aClass_ra_Sub2_491,
							35633,
							"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class48 class48_20_ = (Class48
					.method526(
							((Class47_Sub9) this).aClass_ra_Sub2_491,
							35632,
							"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			((Class47_Sub9) this).aClass29_6812 = Class29.method406(((Class47_Sub9) this).aClass_ra_Sub2_491, new Class48[] { class48, class48_20_ });
			((Class47_Sub9) this).aBoolean6809 = ((Class47_Sub9) this).aClass29_6812 != null;
		}
	}

	void method517(int i, int i_21_) {
		if (((Class47_Sub9) this).aBoolean6811) {
			int i_22_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_23_ = i_21_ & 0xffff;
			float f_24_ = (float) (i_21_ >> 16 & 0x3) / 8.0F;
			int i_25_ = ((Class29) ((Class47_Sub9) this).aClass29_6812).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "time"), (float) (i_22_ * ((Class_ra_Sub2) (((Class47_Sub9) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "breakWaterDepth"), (float) i_23_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "breakWaterOffset"), f_24_);
		}
	}

	void method514(Class30 class30, int i) {
		if (!((Class47_Sub9) this).aBoolean6811) {
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5256(class30);
			((Class47_Sub9) this).aClass_ra_Sub2_491.method5243(i);
		}
	}

	void method515(int i, int i_26_) {
		if (((Class47_Sub9) this).aBoolean6811) {
			int i_27_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_28_ = i_26_ & 0xffff;
			float f_29_ = (float) (i_26_ >> 16 & 0x3) / 8.0F;
			int i_30_ = ((Class29) ((Class47_Sub9) this).aClass29_6812).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "time"), (float) (i_27_ * ((Class_ra_Sub2) (((Class47_Sub9) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "breakWaterDepth"), (float) i_28_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_30_, "breakWaterOffset"), f_29_);
		}
	}

	boolean method520() {
		return ((Class47_Sub9) this).aBoolean6809;
	}
}
