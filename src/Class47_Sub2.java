/* Class47_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub2 extends Class47 {
	static String aString6752 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	boolean aBoolean6753;
	Class29 aClass29_6754;
	boolean aBoolean6755 = false;
	static String aString6756 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	Class45 aClass45_6757;

	void method507(boolean bool) {
		Class30_Sub1 class30_sub1 = ((Class47_Sub2) this).aClass_ra_Sub2_491.method5280();
		if (((Class47_Sub2) this).aBoolean6753 && class30_sub1 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).aFloatArray8124[1])) * 2.0F);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(class30_sub1);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub2) this).aClass45_6757).aClass30_Sub4_485);
			int i = ((Class29) ((Class47_Sub2) this).aClass29_6754).anInt365;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloatArray8124[0]), -(((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloatArray8124[1]), -(((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloatArray8124[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloat8125) * f, (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloat8128) * f, (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloat8191) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).aFloatArray8124[1]) * 928.0F);
			((Class47_Sub2) this).aBoolean6755 = true;
		}
	}

	void method516(int i, int i_0_) {
		if (((Class47_Sub2) this).aBoolean6755) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			float f_4_ = (float) (i_0_ >> 19 & 0xf) / 16.0F;
			float f_5_ = (float) (i_0_ >> 23 & 0xf) / 16.0F;
			int i_6_ = i_0_ >> 27 & 0xf;
			int i_7_ = ((Class29) ((Class47_Sub2) this).aClass29_6754).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "time"), (float) (i_1_ * ((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterOffset"), f_3_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_7_, "waveIntensity"), f_5_, f_4_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "waveExponent"), (float) i_6_);
		}
	}

	void method505(boolean bool) {
		Class30_Sub1 class30_sub1 = ((Class47_Sub2) this).aClass_ra_Sub2_491.method5280();
		if (((Class47_Sub2) this).aBoolean6753 && class30_sub1 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).aFloatArray8124[1])) * 2.0F);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(class30_sub1);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub2) this).aClass45_6757).aClass30_Sub4_485);
			int i = ((Class29) ((Class47_Sub2) this).aClass29_6754).anInt365;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloatArray8124[0]), -(((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloatArray8124[1]), -(((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloatArray8124[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloat8125) * f, (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloat8128) * f, (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloat8191) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).aFloatArray8124[1]) * 928.0F);
			((Class47_Sub2) this).aBoolean6755 = true;
		}
	}

	void method517(int i, int i_8_) {
		if (((Class47_Sub2) this).aBoolean6755) {
			int i_9_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_10_ = i_8_ & 0xffff;
			float f_11_ = (float) (i_8_ >> 16 & 0x3) / 8.0F;
			float f_12_ = (float) (i_8_ >> 19 & 0xf) / 16.0F;
			float f_13_ = (float) (i_8_ >> 23 & 0xf) / 16.0F;
			int i_14_ = i_8_ >> 27 & 0xf;
			int i_15_ = ((Class29) ((Class47_Sub2) this).aClass29_6754).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "time"), (float) (i_9_ * ((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterDepth"), (float) i_10_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterOffset"), f_11_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_15_, "waveIntensity"), f_13_, f_12_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "waveExponent"), (float) i_14_);
		}
	}

	boolean method501() {
		return ((Class47_Sub2) this).aBoolean6753;
	}

	void method503(int i, int i_16_) {
		if (((Class47_Sub2) this).aBoolean6755) {
			int i_17_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_18_ = i_16_ & 0xffff;
			float f_19_ = (float) (i_16_ >> 16 & 0x3) / 8.0F;
			float f_20_ = (float) (i_16_ >> 19 & 0xf) / 16.0F;
			float f_21_ = (float) (i_16_ >> 23 & 0xf) / 16.0F;
			int i_22_ = i_16_ >> 27 & 0xf;
			int i_23_ = ((Class29) ((Class47_Sub2) this).aClass29_6754).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "time"), (float) (i_17_ * ((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "breakWaterDepth"), (float) i_18_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "breakWaterOffset"), f_19_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_23_, "waveIntensity"), f_21_, f_20_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "waveExponent"), (float) i_22_);
		}
	}

	void method500(Class30 class30, int i) {
		if (!((Class47_Sub2) this).aBoolean6755) {
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(class30);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5243(i);
		}
	}

	void method506(boolean bool) {
		Class30_Sub1 class30_sub1 = ((Class47_Sub2) this).aClass_ra_Sub2_491.method5280();
		if (((Class47_Sub2) this).aBoolean6753 && class30_sub1 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).aFloatArray8124[1])) * 2.0F);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(class30_sub1);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub2) this).aClass45_6757).aClass30_Sub4_485);
			int i = ((Class29) ((Class47_Sub2) this).aClass29_6754).anInt365;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloatArray8124[0]), -(((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloatArray8124[1]), -(((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloatArray8124[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloat8125) * f, (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloat8128) * f, (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aFloat8191) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).aFloatArray8124[1]) * 928.0F);
			((Class47_Sub2) this).aBoolean6755 = true;
		}
	}

	void method511() {
		if (((Class47_Sub2) this).aBoolean6755) {
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(null);
			OpenGL.glUseProgram(0);
			((Class47_Sub2) this).aBoolean6755 = false;
		}
	}

	void method508(boolean bool) {
		/* empty */
	}

	void method509(boolean bool) {
		/* empty */
	}

	void method510(boolean bool) {
		/* empty */
	}

	Class47_Sub2(Class_ra_Sub2 class_ra_sub2, Class45 class45) {
		super(class_ra_sub2);
		((Class47_Sub2) this).aBoolean6753 = false;
		((Class47_Sub2) this).aClass45_6757 = class45;
		if ((((Class45) ((Class47_Sub2) this).aClass45_6757).aClass30_Sub4_485 != null) && (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aBoolean8183) && (((Class_ra_Sub2) ((Class47_Sub2) this).aClass_ra_Sub2_491).aBoolean8093)) {
			Class48 class48 = (Class48
					.method526(
							((Class47_Sub2) this).aClass_ra_Sub2_491,
							35633,
							"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class48 class48_24_ = (Class48
					.method526(
							((Class47_Sub2) this).aClass_ra_Sub2_491,
							35632,
							"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			((Class47_Sub2) this).aClass29_6754 = Class29.method406(((Class47_Sub2) this).aClass_ra_Sub2_491, new Class48[] { class48, class48_24_ });
			((Class47_Sub2) this).aBoolean6753 = ((Class47_Sub2) this).aClass29_6754 != null;
		}
	}

	void method512() {
		if (((Class47_Sub2) this).aBoolean6755) {
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(null);
			OpenGL.glUseProgram(0);
			((Class47_Sub2) this).aBoolean6755 = false;
		}
	}

	void method513(int i, int i_25_) {
		if (((Class47_Sub2) this).aBoolean6755) {
			int i_26_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_27_ = i_25_ & 0xffff;
			float f_28_ = (float) (i_25_ >> 16 & 0x3) / 8.0F;
			float f_29_ = (float) (i_25_ >> 19 & 0xf) / 16.0F;
			float f_30_ = (float) (i_25_ >> 23 & 0xf) / 16.0F;
			int i_31_ = i_25_ >> 27 & 0xf;
			int i_32_ = ((Class29) ((Class47_Sub2) this).aClass29_6754).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "time"), (float) (i_26_ * ((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "breakWaterDepth"), (float) i_27_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "breakWaterOffset"), f_28_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_32_, "waveIntensity"), f_30_, f_29_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "waveExponent"), (float) i_31_);
		}
	}

	void method502(int i, int i_33_) {
		if (((Class47_Sub2) this).aBoolean6755) {
			int i_34_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_35_ = i_33_ & 0xffff;
			float f_36_ = (float) (i_33_ >> 16 & 0x3) / 8.0F;
			float f_37_ = (float) (i_33_ >> 19 & 0xf) / 16.0F;
			float f_38_ = (float) (i_33_ >> 23 & 0xf) / 16.0F;
			int i_39_ = i_33_ >> 27 & 0xf;
			int i_40_ = ((Class29) ((Class47_Sub2) this).aClass29_6754).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "time"), (float) (i_34_ * ((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "breakWaterDepth"), (float) i_35_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "breakWaterOffset"), f_36_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_40_, "waveIntensity"), f_38_, f_37_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_40_, "waveExponent"), (float) i_39_);
		}
	}

	void method515(int i, int i_41_) {
		if (((Class47_Sub2) this).aBoolean6755) {
			int i_42_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_43_ = i_41_ & 0xffff;
			float f_44_ = (float) (i_41_ >> 16 & 0x3) / 8.0F;
			float f_45_ = (float) (i_41_ >> 19 & 0xf) / 16.0F;
			float f_46_ = (float) (i_41_ >> 23 & 0xf) / 16.0F;
			int i_47_ = i_41_ >> 27 & 0xf;
			int i_48_ = ((Class29) ((Class47_Sub2) this).aClass29_6754).anInt365;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "time"), (float) (i_42_ * ((Class_ra_Sub2) (((Class47_Sub2) this).aClass_ra_Sub2_491)).anInt8062 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "breakWaterDepth"), (float) i_43_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "breakWaterOffset"), f_44_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_48_, "waveIntensity"), f_46_, f_45_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_48_, "waveExponent"), (float) i_47_);
		}
	}

	void method504() {
		if (((Class47_Sub2) this).aBoolean6755) {
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5255(0);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(null);
			OpenGL.glUseProgram(0);
			((Class47_Sub2) this).aBoolean6755 = false;
		}
	}

	void method518(boolean bool) {
		/* empty */
	}

	void method519(Class30 class30, int i) {
		if (!((Class47_Sub2) this).aBoolean6755) {
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(class30);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5243(i);
		}
	}

	void method514(Class30 class30, int i) {
		if (!((Class47_Sub2) this).aBoolean6755) {
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5256(class30);
			((Class47_Sub2) this).aClass_ra_Sub2_491.method5243(i);
		}
	}

	boolean method520() {
		return ((Class47_Sub2) this).aBoolean6753;
	}
}
