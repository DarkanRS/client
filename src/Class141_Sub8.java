
/* Class141_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141_Sub8 extends Class141 {
	Class128 aClass128_9092;
	Class136 aClass136_9093;
	static final String aString9094 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	boolean aBool9095 = false;
	boolean aBool9096 = false;
	static final String aString9097 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";

	void method2407(boolean bool) {
		/* empty */
	}

	boolean method2395() {
		return ((Class141_Sub8) this).aBool9096;
	}

	void method2398() {
		if (((Class141_Sub8) this).aBool9095) {
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(null);
			OpenGL.glUseProgram(0);
			((Class141_Sub8) this).aBool9095 = false;
		}
	}

	void method2408(boolean bool) {
		/* empty */
	}

	void method2400(Class137 class137, int i) {
		if (!((Class141_Sub8) this).aBool9095) {
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2399(int i, int i_0_) {
		if (((Class141_Sub8) this).aBool9095) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			float f_4_ = (float) (i_0_ >> 19 & 0xf) / 16.0F;
			float f_5_ = (float) (i_0_ >> 23 & 0xf) / 16.0F;
			int i_6_ = i_0_ >> 27 & 0xf;
			int i_7_ = ((Class128) ((Class141_Sub8) this).aClass128_9092).anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "time"), (float) (i_1_ * ((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterOffset"), f_3_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_7_, "waveIntensity"), f_5_, f_4_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "waveExponent"), (float) i_6_);
		}
	}

	void method2405(boolean bool) {
		/* empty */
	}

	Class141_Sub8(Class505_Sub1 class505_sub1, Class136 class136) {
		super(class505_sub1);
		((Class141_Sub8) this).aClass136_9093 = class136;
		if ((((Class136) ((Class141_Sub8) this).aClass136_9093).aClass137_Sub4_1638) != null && (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aBool8485) && (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aBool8365)) {
			Class140 class140 = (Class140.method2393(((Class141_Sub8) this).aClass505_Sub1_1664, 35633,
					"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class140 class140_8_ = (Class140.method2393(((Class141_Sub8) this).aClass505_Sub1_1664, 35632,
					"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			((Class141_Sub8) this).aClass128_9092 = Class128.method2174((((Class141_Sub8) this).aClass505_Sub1_1664), new Class140[] { class140, class140_8_ });
			((Class141_Sub8) this).aBool9096 = ((Class141_Sub8) this).aClass128_9092 != null;
		}
	}

	void method2402(boolean bool) {
		Class137_Sub2 class137_sub2 = ((Class141_Sub8) this).aClass505_Sub1_1664.method13596();
		if (((Class141_Sub8) this).aBool9096 && class137_sub2 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).aFloatArray8426[1])) * 2.0F);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(class137_sub2);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub8) this).aClass136_9093).aClass137_Sub4_1638);
			int i = ((Class128) ((Class141_Sub8) this).aClass128_9092).anInt1583;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloatArray8426[0]), -(((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloatArray8426[1]), -(((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloatArray8426[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloat8429) * f, (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloat8430) * f, (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloat8431) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).aFloatArray8426[1]) * 928.0F);
			((Class141_Sub8) this).aBool9095 = true;
		}
	}

	void method2403(boolean bool) {
		Class137_Sub2 class137_sub2 = ((Class141_Sub8) this).aClass505_Sub1_1664.method13596();
		if (((Class141_Sub8) this).aBool9096 && class137_sub2 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).aFloatArray8426[1])) * 2.0F);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(class137_sub2);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub8) this).aClass136_9093).aClass137_Sub4_1638);
			int i = ((Class128) ((Class141_Sub8) this).aClass128_9092).anInt1583;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloatArray8426[0]), -(((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloatArray8426[1]), -(((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloatArray8426[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloat8429) * f, (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloat8430) * f, (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloat8431) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).aFloatArray8426[1]) * 928.0F);
			((Class141_Sub8) this).aBool9095 = true;
		}
	}

	void method2404(boolean bool) {
		/* empty */
	}

	void method2413(Class137 class137, int i) {
		if (!((Class141_Sub8) this).aBool9095) {
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	boolean method2401() {
		return ((Class141_Sub8) this).aBool9096;
	}

	void method2394(Class137 class137, int i) {
		if (!((Class141_Sub8) this).aBool9095) {
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2411() {
		if (((Class141_Sub8) this).aBool9095) {
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(null);
			OpenGL.glUseProgram(0);
			((Class141_Sub8) this).aBool9095 = false;
		}
	}

	void method2397(boolean bool) {
		Class137_Sub2 class137_sub2 = ((Class141_Sub8) this).aClass505_Sub1_1664.method13596();
		if (((Class141_Sub8) this).aBool9096 && class137_sub2 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).aFloatArray8426[1])) * 2.0F);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(class137_sub2);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub8) this).aClass136_9093).aClass137_Sub4_1638);
			int i = ((Class128) ((Class141_Sub8) this).aClass128_9092).anInt1583;
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloatArray8426[0]), -(((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloatArray8426[1]), -(((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloatArray8426[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloat8429) * f, (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloat8430) * f, (((Class505_Sub1) ((Class141_Sub8) this).aClass505_Sub1_1664).aFloat8431) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + Math.abs(((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).aFloatArray8426[1]) * 928.0F);
			((Class141_Sub8) this).aBool9095 = true;
		}
	}

	void method2396(int i, int i_9_) {
		if (((Class141_Sub8) this).aBool9095) {
			int i_10_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_11_ = i_9_ & 0xffff;
			float f_12_ = (float) (i_9_ >> 16 & 0x3) / 8.0F;
			float f_13_ = (float) (i_9_ >> 19 & 0xf) / 16.0F;
			float f_14_ = (float) (i_9_ >> 23 & 0xf) / 16.0F;
			int i_15_ = i_9_ >> 27 & 0xf;
			int i_16_ = ((Class128) ((Class141_Sub8) this).aClass128_9092).anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "time"), (float) (i_10_ * ((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterDepth"), (float) i_11_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterOffset"), f_12_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_16_, "waveIntensity"), f_14_, f_13_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "waveExponent"), (float) i_15_);
		}
	}

	void method2410(int i, int i_17_) {
		if (((Class141_Sub8) this).aBool9095) {
			int i_18_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_19_ = i_17_ & 0xffff;
			float f_20_ = (float) (i_17_ >> 16 & 0x3) / 8.0F;
			float f_21_ = (float) (i_17_ >> 19 & 0xf) / 16.0F;
			float f_22_ = (float) (i_17_ >> 23 & 0xf) / 16.0F;
			int i_23_ = i_17_ >> 27 & 0xf;
			int i_24_ = ((Class128) ((Class141_Sub8) this).aClass128_9092).anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "time"), (float) (i_18_ * ((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "breakWaterDepth"), (float) i_19_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "breakWaterOffset"), f_20_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_24_, "waveIntensity"), f_22_, f_21_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "waveExponent"), (float) i_23_);
		}
	}

	void method2409(int i, int i_25_) {
		if (((Class141_Sub8) this).aBool9095) {
			int i_26_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_27_ = i_25_ & 0xffff;
			float f_28_ = (float) (i_25_ >> 16 & 0x3) / 8.0F;
			float f_29_ = (float) (i_25_ >> 19 & 0xf) / 16.0F;
			float f_30_ = (float) (i_25_ >> 23 & 0xf) / 16.0F;
			int i_31_ = i_25_ >> 27 & 0xf;
			int i_32_ = ((Class128) ((Class141_Sub8) this).aClass128_9092).anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "time"), (float) (i_26_ * ((Class505_Sub1) (((Class141_Sub8) this).aClass505_Sub1_1664)).anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "breakWaterDepth"), (float) i_27_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "breakWaterOffset"), f_28_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_32_, "waveIntensity"), f_30_, f_29_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_32_, "waveExponent"), (float) i_31_);
		}
	}

	void method2412(Class137 class137, int i) {
		if (!((Class141_Sub8) this).aBool9095) {
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2406(boolean bool) {
		/* empty */
	}

	void method2414(Class137 class137, int i) {
		if (!((Class141_Sub8) this).aBool9095) {
			((Class141_Sub8) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub8) this).aClass505_Sub1_1664.method13612(i);
		}
	}
}
