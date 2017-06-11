/* Class298_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class298_Sub8_Sub1 extends Class298_Sub8 {
	Class52_Sub1_Sub2 aClass52_Sub1_Sub2_9170;
	static float aFloat9171 = 0.25F;
	static float aFloat9172 = 1.0F;
	static float aFloat9173 = 1.0F;
	static String aString9174 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	Class29 aClass29_9175;
	static String aString9176 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
	static int anInt9177 = 256;
	static String aString9178 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n";
	Class52_Sub1_Sub2 aClass52_Sub1_Sub2_9179;
	Class30_Sub2 aClass30_Sub2_9180;
	Class30_Sub2 aClass30_Sub2_9181;
	static String aString9182 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	Class29 aClass29_9183;
	int anInt9184;
	int anInt9185;
	int anInt9186;
	Class29 aClass29_9187;
	int anInt9188;
	Class29 aClass29_9189;
	Class30_Sub2[] aClass30_Sub2Array9190;

	boolean method2869() {
		if ((((Class_ra_Sub2) ((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222).aBoolean8170) && ((Class_ra_Sub2) ((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222).aBoolean8093 && ((Class_ra_Sub2) (((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222)).aBoolean8133) {
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179 = new Class52_Sub1_Sub2(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9180 = new Class30_Sub2((((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222), 3553, Class55.aClass55_557, Class77.aClass77_714, 256, 256);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9180.method420(false, false);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9181 = new Class30_Sub2((((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222), 3553, Class55.aClass55_557, Class77.aClass77_714, 256, 256);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9181.method420(false, false);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) 112);
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method563(0, ((Class298_Sub8_Sub1) this).aClass30_Sub2_9180.method423(0));
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method563(1, ((Class298_Sub8_Sub1) this).aClass30_Sub2_9181.method423(0));
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
			if (!((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method560()) {
				((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -107);
				return false;
			}
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -15);
			((Class298_Sub8_Sub1) this).aClass29_9175 = (Class29.method406(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
					(new Class48[] { Class48.method526(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class298_Sub8_Sub1) this).aClass29_9189 = (Class29.method406(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222, (new Class48[] { Class48.method526(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class298_Sub8_Sub1) this).aClass29_9183 = (Class29
					.method406(
							((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
							(new Class48[] { Class48
									.method526(
											((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
											35632,
											"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class298_Sub8_Sub1) this).aClass29_9187 = (Class29
					.method406(
							((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
							(new Class48[] { Class48
									.method526(
											((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
											35632,
											"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class298_Sub8_Sub1) this).aClass29_9189 != null && ((Class298_Sub8_Sub1) this).aClass29_9175 != null && ((Class298_Sub8_Sub1) this).aClass29_9183 != null && ((Class298_Sub8_Sub1) this).aClass29_9187 != null);
		}
		return false;
	}

	Class77 method2887() {
		return Class77.aClass77_714;
	}

	boolean method2868() {
		return ((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179 != null;
	}

	boolean method2884() {
		return ((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179 != null;
	}

	Class77 method2888() {
		return Class77.aClass77_714;
	}

	void method2870() {
		((Class298_Sub8_Sub1) this).anInt9186 = -1;
		((Class298_Sub8_Sub1) this).anInt9188 = -1;
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 = null;
		((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 = null;
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179 = null;
		((Class298_Sub8_Sub1) this).aClass30_Sub2_9180 = null;
		((Class298_Sub8_Sub1) this).aClass30_Sub2_9181 = null;
		((Class298_Sub8_Sub1) this).aClass29_9175 = null;
		((Class298_Sub8_Sub1) this).aClass29_9189 = null;
		((Class298_Sub8_Sub1) this).aClass29_9183 = null;
		((Class298_Sub8_Sub1) this).aClass29_9187 = null;
	}

	void method2871(int i, int i_0_) {
		((Class298_Sub8_Sub1) this).anInt9185 = i;
		((Class298_Sub8_Sub1) this).anInt9184 = i_0_;
		int i_1_ = Class422_Sub4.method5639(((Class298_Sub8_Sub1) this).anInt9185, 1918937807);
		int i_2_ = Class422_Sub4.method5639(((Class298_Sub8_Sub1) this).anInt9184, 1314388027);
		if (((Class298_Sub8_Sub1) this).anInt9188 != i_1_ || ((Class298_Sub8_Sub1) this).anInt9186 != i_2_) {
			if (((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 != null) {
				for (int i_3_ = 0; i_3_ < (((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190).length; i_3_++)
					((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_3_].method408();
				((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 = null;
			}
			if (i_1_ > 256 || i_2_ > 256) {
				int i_4_ = i_1_;
				int i_5_ = i_2_;
				int i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
					i_6_++;
				}
				if (((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 == null)
					((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 = new Class52_Sub1_Sub2(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222);
				((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 = new Class30_Sub2[i_6_];
				i_4_ = i_1_;
				i_5_ = i_2_;
				i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_6_++] = new Class30_Sub2((((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222), 3553, Class55.aClass55_557, Class77.aClass77_714, i_4_, i_5_);
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
				}
			} else
				((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 = null;
			((Class298_Sub8_Sub1) this).anInt9188 = i_1_;
			((Class298_Sub8_Sub1) this).anInt9186 = i_2_;
		}
	}

	void method2873(int i) {
		OpenGL.glUseProgram(0);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(1);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(null);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(0);
	}

	Class77 method2875() {
		return Class77.aClass77_714;
	}

	void method2883(int i, int i_7_) {
		((Class298_Sub8_Sub1) this).anInt9185 = i;
		((Class298_Sub8_Sub1) this).anInt9184 = i_7_;
		int i_8_ = Class422_Sub4.method5639(((Class298_Sub8_Sub1) this).anInt9185, 1360936610);
		int i_9_ = Class422_Sub4.method5639(((Class298_Sub8_Sub1) this).anInt9184, 1074782076);
		if (((Class298_Sub8_Sub1) this).anInt9188 != i_8_ || ((Class298_Sub8_Sub1) this).anInt9186 != i_9_) {
			if (((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 != null) {
				for (int i_10_ = 0; i_10_ < (((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190).length; i_10_++)
					((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_10_].method408();
				((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 = null;
			}
			if (i_8_ > 256 || i_9_ > 256) {
				int i_11_ = i_8_;
				int i_12_ = i_9_;
				int i_13_ = 0;
				while (i_11_ > 256 || i_12_ > 256) {
					if (i_11_ > 256)
						i_11_ >>= 1;
					if (i_12_ > 256)
						i_12_ >>= 1;
					i_13_++;
				}
				if (((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 == null)
					((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 = new Class52_Sub1_Sub2(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222);
				((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 = new Class30_Sub2[i_13_];
				i_11_ = i_8_;
				i_12_ = i_9_;
				i_13_ = 0;
				while (i_11_ > 256 || i_12_ > 256) {
					((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_13_++] = new Class30_Sub2((((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222), 3553, Class55.aClass55_557, Class77.aClass77_714, i_11_, i_12_);
					if (i_11_ > 256)
						i_11_ >>= 1;
					if (i_12_ > 256)
						i_12_ >>= 1;
				}
			} else
				((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 = null;
			((Class298_Sub8_Sub1) this).anInt9188 = i_8_;
			((Class298_Sub8_Sub1) this).anInt9186 = i_9_;
		}
	}

	void method2878(int i, Class30_Sub2 class30_sub2, Class30_Sub2 class30_sub2_14_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 != null) {
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170, (byte) 9);
			int i_15_ = Class422_Sub4.method5639((((Class298_Sub8_Sub1) this).anInt9185), 2071757561);
			int i_16_ = Class422_Sub4.method5639((((Class298_Sub8_Sub1) this).anInt9184), 1398420241);
			int i_17_ = 0;
			while (i_15_ > 256 || i_16_ > 256) {
				OpenGL.glViewport(0, 0, i_15_, i_16_);
				((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170.method563(0, ((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_17_].method423(0));
				if (i_17_ == 0) {
					((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(class30_sub2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (((Class298_Sub8_Sub1) this).anInt9185), 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (((Class298_Sub8_Sub1) this).anInt9185), (float) (((Class298_Sub8_Sub1) this).anInt9184));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class298_Sub8_Sub1) this).anInt9184));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_17_ - 1]);
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
				if (i_15_ > 256)
					i_15_ >>= 1;
				if (i_16_ > 256)
					i_16_ >>= 1;
				i_17_++;
			}
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170, (byte) -59);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_17_ - 1]);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -3);
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_18_ = (((Class29) ((Class298_Sub8_Sub1) this).aClass29_9189).anInt365);
			OpenGL.glUseProgram(i_18_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_18_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_18_, "params"), aFloat9173, 0.0F, 0.0F);
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
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(class30_sub2);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -8);
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_19_ = (((Class29) ((Class298_Sub8_Sub1) this).aClass29_9175).anInt365);
			OpenGL.glUseProgram(i_19_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_19_, "params"), aFloat9173, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) ((Class298_Sub8_Sub1) this).anInt9185, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) ((Class298_Sub8_Sub1) this).anInt9185, (float) ((Class298_Sub8_Sub1) this).anInt9184);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) ((Class298_Sub8_Sub1) this).anInt9184);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(1);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2_9180);
		int i_20_ = ((Class29) ((Class298_Sub8_Sub1) this).aClass29_9187).anInt365;
		OpenGL.glUseProgram(i_20_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_20_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_20_, "step"), 0.00390625F, 0.0F, 0.0F);
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
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2_9181);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_20_, "step"), 0.0F, 0.00390625F, 0.0F);
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
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) 2);
		int i_21_ = ((Class29) ((Class298_Sub8_Sub1) this).aClass29_9183).anInt365;
		OpenGL.glUseProgram(i_21_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_21_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_21_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_21_, "params"), aFloat9171, aFloat9172, 0.0F);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(1);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2_9180);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(0);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(class30_sub2);
	}

	boolean method2882() {
		if ((((Class_ra_Sub2) ((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222).aBoolean8170) && ((Class_ra_Sub2) ((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222).aBoolean8093 && ((Class_ra_Sub2) (((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222)).aBoolean8133) {
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179 = new Class52_Sub1_Sub2(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9180 = new Class30_Sub2((((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222), 3553, Class55.aClass55_557, Class77.aClass77_714, 256, 256);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9180.method420(false, false);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9181 = new Class30_Sub2((((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222), 3553, Class55.aClass55_557, Class77.aClass77_714, 256, 256);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9181.method420(false, false);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -80);
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method563(0, ((Class298_Sub8_Sub1) this).aClass30_Sub2_9180.method423(0));
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method563(1, ((Class298_Sub8_Sub1) this).aClass30_Sub2_9181.method423(0));
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
			if (!((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method560()) {
				((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) 15);
				return false;
			}
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -37);
			((Class298_Sub8_Sub1) this).aClass29_9175 = (Class29.method406(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
					(new Class48[] { Class48.method526(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class298_Sub8_Sub1) this).aClass29_9189 = (Class29.method406(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222, (new Class48[] { Class48.method526(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class298_Sub8_Sub1) this).aClass29_9183 = (Class29
					.method406(
							((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
							(new Class48[] { Class48
									.method526(
											((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
											35632,
											"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class298_Sub8_Sub1) this).aClass29_9187 = (Class29
					.method406(
							((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
							(new Class48[] { Class48
									.method526(
											((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
											35632,
											"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class298_Sub8_Sub1) this).aClass29_9189 != null && ((Class298_Sub8_Sub1) this).aClass29_9175 != null && ((Class298_Sub8_Sub1) this).aClass29_9183 != null && ((Class298_Sub8_Sub1) this).aClass29_9187 != null);
		}
		return false;
	}

	void method2867() {
		((Class298_Sub8_Sub1) this).anInt9186 = -1;
		((Class298_Sub8_Sub1) this).anInt9188 = -1;
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 = null;
		((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 = null;
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179 = null;
		((Class298_Sub8_Sub1) this).aClass30_Sub2_9180 = null;
		((Class298_Sub8_Sub1) this).aClass30_Sub2_9181 = null;
		((Class298_Sub8_Sub1) this).aClass29_9175 = null;
		((Class298_Sub8_Sub1) this).aClass29_9189 = null;
		((Class298_Sub8_Sub1) this).aClass29_9183 = null;
		((Class298_Sub8_Sub1) this).aClass29_9187 = null;
	}

	void method2877(int i, Class30_Sub2 class30_sub2, Class30_Sub2 class30_sub2_22_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 != null) {
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170, (byte) -3);
			int i_23_ = Class422_Sub4.method5639((((Class298_Sub8_Sub1) this).anInt9185), 1462499323);
			int i_24_ = Class422_Sub4.method5639((((Class298_Sub8_Sub1) this).anInt9184), 1465383629);
			int i_25_ = 0;
			while (i_23_ > 256 || i_24_ > 256) {
				OpenGL.glViewport(0, 0, i_23_, i_24_);
				((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170.method563(0, ((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_25_].method423(0));
				if (i_25_ == 0) {
					((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(class30_sub2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (((Class298_Sub8_Sub1) this).anInt9185), 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (((Class298_Sub8_Sub1) this).anInt9185), (float) (((Class298_Sub8_Sub1) this).anInt9184));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class298_Sub8_Sub1) this).anInt9184));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_25_ - 1]);
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
				if (i_23_ > 256)
					i_23_ >>= 1;
				if (i_24_ > 256)
					i_24_ >>= 1;
				i_25_++;
			}
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170, (byte) -15);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_25_ - 1]);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -7);
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_26_ = (((Class29) ((Class298_Sub8_Sub1) this).aClass29_9189).anInt365);
			OpenGL.glUseProgram(i_26_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_26_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_26_, "params"), aFloat9173, 0.0F, 0.0F);
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
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(class30_sub2);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -16);
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_27_ = (((Class29) ((Class298_Sub8_Sub1) this).aClass29_9175).anInt365);
			OpenGL.glUseProgram(i_27_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_27_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_27_, "params"), aFloat9173, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) ((Class298_Sub8_Sub1) this).anInt9185, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) ((Class298_Sub8_Sub1) this).anInt9185, (float) ((Class298_Sub8_Sub1) this).anInt9184);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) ((Class298_Sub8_Sub1) this).anInt9184);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(1);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2_9180);
		int i_28_ = ((Class29) ((Class298_Sub8_Sub1) this).aClass29_9187).anInt365;
		OpenGL.glUseProgram(i_28_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_28_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_28_, "step"), 0.00390625F, 0.0F, 0.0F);
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
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2_9181);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_28_, "step"), 0.0F, 0.00390625F, 0.0F);
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
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -14);
		int i_29_ = ((Class29) ((Class298_Sub8_Sub1) this).aClass29_9183).anInt365;
		OpenGL.glUseProgram(i_29_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_29_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_29_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_29_, "params"), aFloat9171, aFloat9172, 0.0F);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(1);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2_9180);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(0);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(class30_sub2);
	}

	void method2872(int i, Class30_Sub2 class30_sub2, Class30_Sub2 class30_sub2_30_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 != null) {
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170, (byte) 61);
			int i_31_ = Class422_Sub4.method5639((((Class298_Sub8_Sub1) this).anInt9185), 1385804775);
			int i_32_ = Class422_Sub4.method5639((((Class298_Sub8_Sub1) this).anInt9184), 1199238042);
			int i_33_ = 0;
			while (i_31_ > 256 || i_32_ > 256) {
				OpenGL.glViewport(0, 0, i_31_, i_32_);
				((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170.method563(0, ((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_33_].method423(0));
				if (i_33_ == 0) {
					((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(class30_sub2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (((Class298_Sub8_Sub1) this).anInt9185), 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (((Class298_Sub8_Sub1) this).anInt9185), (float) (((Class298_Sub8_Sub1) this).anInt9184));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class298_Sub8_Sub1) this).anInt9184));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_33_ - 1]);
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
				if (i_31_ > 256)
					i_31_ >>= 1;
				if (i_32_ > 256)
					i_32_ >>= 1;
				i_33_++;
			}
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170, (byte) 83);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_33_ - 1]);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) 17);
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_34_ = (((Class29) ((Class298_Sub8_Sub1) this).aClass29_9189).anInt365);
			OpenGL.glUseProgram(i_34_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_34_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_34_, "params"), aFloat9173, 0.0F, 0.0F);
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
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(class30_sub2);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -6);
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_35_ = (((Class29) ((Class298_Sub8_Sub1) this).aClass29_9175).anInt365);
			OpenGL.glUseProgram(i_35_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_35_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_35_, "params"), aFloat9173, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) ((Class298_Sub8_Sub1) this).anInt9185, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) ((Class298_Sub8_Sub1) this).anInt9185, (float) ((Class298_Sub8_Sub1) this).anInt9184);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) ((Class298_Sub8_Sub1) this).anInt9184);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(1);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2_9180);
		int i_36_ = ((Class29) ((Class298_Sub8_Sub1) this).aClass29_9187).anInt365;
		OpenGL.glUseProgram(i_36_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_36_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_36_, "step"), 0.00390625F, 0.0F, 0.0F);
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
		((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2_9181);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_36_, "step"), 0.0F, 0.00390625F, 0.0F);
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
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -116);
		int i_37_ = ((Class29) ((Class298_Sub8_Sub1) this).aClass29_9183).anInt365;
		OpenGL.glUseProgram(i_37_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_37_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_37_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_37_, "params"), aFloat9171, aFloat9172, 0.0F);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(1);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(((Class298_Sub8_Sub1) this).aClass30_Sub2_9180);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(0);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(class30_sub2);
	}

	void method2879(int i) {
		OpenGL.glUseProgram(0);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(1);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(null);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(0);
	}

	void method2880(int i) {
		OpenGL.glUseProgram(0);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(1);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5256(null);
		((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5255(0);
	}

	boolean method2876() {
		if ((((Class_ra_Sub2) ((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222).aBoolean8170) && ((Class_ra_Sub2) ((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222).aBoolean8093 && ((Class_ra_Sub2) (((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222)).aBoolean8133) {
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179 = new Class52_Sub1_Sub2(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9180 = new Class30_Sub2((((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222), 3553, Class55.aClass55_557, Class77.aClass77_714, 256, 256);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9180.method420(false, false);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9181 = new Class30_Sub2((((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222), 3553, Class55.aClass55_557, Class77.aClass77_714, 256, 256);
			((Class298_Sub8_Sub1) this).aClass30_Sub2_9181.method420(false, false);
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5143(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) 8);
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method563(0, ((Class298_Sub8_Sub1) this).aClass30_Sub2_9180.method423(0));
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method563(1, ((Class298_Sub8_Sub1) this).aClass30_Sub2_9181.method423(0));
			((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method572(0);
			if (!((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179.method560()) {
				((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) -42);
				return false;
			}
			((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222.method5005(((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9179, (byte) 12);
			((Class298_Sub8_Sub1) this).aClass29_9175 = (Class29.method406(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
					(new Class48[] { Class48.method526(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class298_Sub8_Sub1) this).aClass29_9189 = (Class29.method406(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222, (new Class48[] { Class48.method526(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class298_Sub8_Sub1) this).aClass29_9183 = (Class29
					.method406(
							((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
							(new Class48[] { Class48
									.method526(
											((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
											35632,
											"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class298_Sub8_Sub1) this).aClass29_9187 = (Class29
					.method406(
							((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
							(new Class48[] { Class48
									.method526(
											((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222,
											35632,
											"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class298_Sub8_Sub1) this).aClass29_9189 != null && ((Class298_Sub8_Sub1) this).aClass29_9175 != null && ((Class298_Sub8_Sub1) this).aClass29_9183 != null && ((Class298_Sub8_Sub1) this).aClass29_9187 != null);
		}
		return false;
	}

	Class77 method2889() {
		return Class77.aClass77_714;
	}

	Class298_Sub8_Sub1(Class_ra_Sub2 class_ra_sub2) {
		super(class_ra_sub2);
	}

	void method2885(int i, int i_38_) {
		((Class298_Sub8_Sub1) this).anInt9185 = i;
		((Class298_Sub8_Sub1) this).anInt9184 = i_38_;
		int i_39_ = Class422_Sub4.method5639(((Class298_Sub8_Sub1) this).anInt9185, 1657798261);
		int i_40_ = Class422_Sub4.method5639(((Class298_Sub8_Sub1) this).anInt9184, 1091426304);
		if (((Class298_Sub8_Sub1) this).anInt9188 != i_39_ || ((Class298_Sub8_Sub1) this).anInt9186 != i_40_) {
			if (((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 != null) {
				for (int i_41_ = 0; i_41_ < (((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190).length; i_41_++)
					((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_41_].method408();
				((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 = null;
			}
			if (i_39_ > 256 || i_40_ > 256) {
				int i_42_ = i_39_;
				int i_43_ = i_40_;
				int i_44_ = 0;
				while (i_42_ > 256 || i_43_ > 256) {
					if (i_42_ > 256)
						i_42_ >>= 1;
					if (i_43_ > 256)
						i_43_ >>= 1;
					i_44_++;
				}
				if (((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 == null)
					((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 = new Class52_Sub1_Sub2(((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222);
				((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190 = new Class30_Sub2[i_44_];
				i_42_ = i_39_;
				i_43_ = i_40_;
				i_44_ = 0;
				while (i_42_ > 256 || i_43_ > 256) {
					((Class298_Sub8_Sub1) this).aClass30_Sub2Array9190[i_44_++] = new Class30_Sub2((((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222), 3553, Class55.aClass55_557, Class77.aClass77_714, i_42_, i_43_);
					if (i_42_ > 256)
						i_42_ >>= 1;
					if (i_43_ > 256)
						i_43_ >>= 1;
				}
			} else
				((Class298_Sub8_Sub1) this).aClass52_Sub1_Sub2_9170 = null;
			((Class298_Sub8_Sub1) this).anInt9188 = i_39_;
			((Class298_Sub8_Sub1) this).anInt9186 = i_40_;
		}
	}

	boolean method2890() {
		return (((Class_ra_Sub2) ((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222).aBoolean8170 && ((Class_ra_Sub2) (((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222)).aBoolean8093 && ((Class_ra_Sub2) (((Class298_Sub8_Sub1) this).aClass_ra_Sub2_7222)).aBoolean8133);
	}
}
