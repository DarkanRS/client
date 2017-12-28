
/* Class282_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class282_Sub5_Sub1 extends Class282_Sub5 {
	Class128 aClass128_10023;
	static float aFloat10024 = 0.25F;
	static float aFloat10025 = 1.0F;
	static float aFloat10026 = 1.0F;
	static final String aString10027 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	Class137_Sub1[] aClass137_Sub1Array10028;
	static final String aString10029 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
	static final String aString10030 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n";
	Class158_Sub1_Sub4 aClass158_Sub1_Sub4_10031;
	Class158_Sub1_Sub4 aClass158_Sub1_Sub4_10032;
	int anInt10033;
	Class137_Sub1 aClass137_Sub1_10034;
	static final int anInt10035 = 256;
	int anInt10036;
	int anInt10037;
	Class137_Sub1 aClass137_Sub1_10038;
	int anInt10039;
	static final String aString10040 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	Class128 aClass128_10041;
	Class128 aClass128_10042;
	Class128 aClass128_10043;

	void method12119(int i, Class137_Sub1 class137_sub1, Class137_Sub1 class137_sub1_0_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 != null) {
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032, 699078378);
			int i_1_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10036, 814738058);
			int i_2_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10037, 867540401);
			int i_3_ = 0;
			while (i_1_ > 256 || i_2_ > 256) {
				OpenGL.glViewport(0, 0, i_1_, i_2_);
				((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032.method13759(0, ((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_3_].method14441(0));
				if (i_3_ == 0) {
					((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(class137_sub1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (((Class282_Sub5_Sub1) this).anInt10036), 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (((Class282_Sub5_Sub1) this).anInt10036), (float) (((Class282_Sub5_Sub1) this).anInt10037));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class282_Sub5_Sub1) this).anInt10037));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_3_ - 1]);
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
				if (i_1_ > 256)
					i_1_ >>= 1;
				if (i_2_ > 256)
					i_2_ >>= 1;
				i_3_++;
			}
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032, (byte) -99);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_3_ - 1]);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, 1391966255);
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_4_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10042).anInt1583);
			OpenGL.glUseProgram(i_4_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_4_, "params"), aFloat10026, 0.0F, 0.0F);
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
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(class137_sub1);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, -1066859380);
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_5_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10043).anInt1583);
			OpenGL.glUseProgram(i_5_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_5_, "params"), aFloat10026, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) ((Class282_Sub5_Sub1) this).anInt10036, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) ((Class282_Sub5_Sub1) this).anInt10036, (float) (((Class282_Sub5_Sub1) this).anInt10037));
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) (((Class282_Sub5_Sub1) this).anInt10037));
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(1);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1_10038);
		int i_6_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10023).anInt1583);
		OpenGL.glUseProgram(i_6_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_6_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_6_, "step"), 0.00390625F, 0.0F, 0.0F);
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
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1_10034);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_6_, "step"), 0.0F, 0.00390625F, 0.0F);
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
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, (byte) -55);
		int i_7_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10041).anInt1583);
		OpenGL.glUseProgram(i_7_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_7_, "params"), aFloat10024, aFloat10025, 0.0F);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(1);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1_10038);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(0);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(class137_sub1);
	}

	boolean method15445() {
		return (((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8472 && ((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8365 && ((Class505_Sub1) (((Class282_Sub5_Sub1) this).aClass505_Sub1_7507)).aBool8312);
	}

	boolean method12141() {
		return ((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031 != null;
	}

	boolean method12136() {
		if ((((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8472) && ((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8365 && ((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8312) {
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031 = new Class158_Sub1_Sub4(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10038 = new Class137_Sub1((((Class282_Sub5_Sub1) this).aClass505_Sub1_7507), 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10038.method14445(false, false);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10034 = new Class137_Sub1((((Class282_Sub5_Sub1) this).aClass505_Sub1_7507), 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10034.method14445(false, false);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, 184932253);
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method13759(0, ((Class282_Sub5_Sub1) this).aClass137_Sub1_10038.method14441(0));
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method13759(1, ((Class282_Sub5_Sub1) this).aClass137_Sub1_10034.method14441(0));
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
			if (!((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method13764()) {
				((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, (byte) -55);
				return false;
			}
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, (byte) -102);
			((Class282_Sub5_Sub1) this).aClass128_10043 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507,
					(new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class282_Sub5_Sub1) this).aClass128_10042 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, (new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class282_Sub5_Sub1) this).aClass128_10041 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, (new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class282_Sub5_Sub1) this).aClass128_10023 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, (new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632,
					"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class282_Sub5_Sub1) this).aClass128_10042 != null && ((Class282_Sub5_Sub1) this).aClass128_10043 != null && ((Class282_Sub5_Sub1) this).aClass128_10041 != null && ((Class282_Sub5_Sub1) this).aClass128_10023 != null);
		}
		return false;
	}

	void method12122(int i, int i_8_) {
		((Class282_Sub5_Sub1) this).anInt10036 = i;
		((Class282_Sub5_Sub1) this).anInt10037 = i_8_;
		int i_9_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10036, 2101962578);
		int i_10_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10037, 2124513731);
		if (((Class282_Sub5_Sub1) this).anInt10039 != i_9_ || ((Class282_Sub5_Sub1) this).anInt10033 != i_10_) {
			if (((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 != null) {
				for (int i_11_ = 0; i_11_ < (((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028).length; i_11_++)
					((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_11_].method2355();
				((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 = null;
			}
			if (i_9_ > 256 || i_10_ > 256) {
				int i_12_ = i_9_;
				int i_13_ = i_10_;
				int i_14_ = 0;
				while (i_12_ > 256 || i_13_ > 256) {
					if (i_12_ > 256)
						i_12_ >>= 1;
					if (i_13_ > 256)
						i_13_ >>= 1;
					i_14_++;
				}
				if (((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032 == null)
					((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032 = new Class158_Sub1_Sub4(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507);
				((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 = new Class137_Sub1[i_14_];
				i_12_ = i_9_;
				i_13_ = i_10_;
				i_14_ = 0;
				while (i_12_ > 256 || i_13_ > 256) {
					((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_14_++] = new Class137_Sub1((((Class282_Sub5_Sub1) this).aClass505_Sub1_7507), 3553, Class150.aClass150_1949, Class76.aClass76_755, i_12_, i_13_);
					if (i_12_ > 256)
						i_12_ >>= 1;
					if (i_13_ > 256)
						i_13_ >>= 1;
				}
			} else
				((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032 = null;
			((Class282_Sub5_Sub1) this).anInt10039 = i_9_;
			((Class282_Sub5_Sub1) this).anInt10033 = i_10_;
		}
	}

	Class76 method12127() {
		return Class76.aClass76_755;
	}

	Class282_Sub5_Sub1(Class505_Sub1 class505_sub1) {
		super(class505_sub1);
	}

	void method12121(int i) {
		OpenGL.glUseProgram(0);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(1);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(null);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(0);
	}

	void method12134(int i, Class137_Sub1 class137_sub1, Class137_Sub1 class137_sub1_15_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 != null) {
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032, -1687596109);
			int i_16_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10036, 1564999214);
			int i_17_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10037, 1704391811);
			int i_18_ = 0;
			while (i_16_ > 256 || i_17_ > 256) {
				OpenGL.glViewport(0, 0, i_16_, i_17_);
				((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032.method13759(0, ((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_18_].method14441(0));
				if (i_18_ == 0) {
					((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(class137_sub1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (((Class282_Sub5_Sub1) this).anInt10036), 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (((Class282_Sub5_Sub1) this).anInt10036), (float) (((Class282_Sub5_Sub1) this).anInt10037));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class282_Sub5_Sub1) this).anInt10037));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_18_ - 1]);
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
				if (i_16_ > 256)
					i_16_ >>= 1;
				if (i_17_ > 256)
					i_17_ >>= 1;
				i_18_++;
			}
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032, (byte) -56);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_18_ - 1]);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, -1515907534);
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_19_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10042).anInt1583);
			OpenGL.glUseProgram(i_19_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_19_, "params"), aFloat10026, 0.0F, 0.0F);
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
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(class137_sub1);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, 1393887669);
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_20_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10043).anInt1583);
			OpenGL.glUseProgram(i_20_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_20_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_20_, "params"), aFloat10026, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) ((Class282_Sub5_Sub1) this).anInt10036, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) ((Class282_Sub5_Sub1) this).anInt10036, (float) (((Class282_Sub5_Sub1) this).anInt10037));
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) (((Class282_Sub5_Sub1) this).anInt10037));
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(1);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1_10038);
		int i_21_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10023).anInt1583);
		OpenGL.glUseProgram(i_21_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_21_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_21_, "step"), 0.00390625F, 0.0F, 0.0F);
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
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1_10034);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_21_, "step"), 0.0F, 0.00390625F, 0.0F);
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
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, (byte) -2);
		int i_22_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10041).anInt1583);
		OpenGL.glUseProgram(i_22_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_22_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_22_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_22_, "params"), aFloat10024, aFloat10025, 0.0F);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(1);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1_10038);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(0);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(class137_sub1);
	}

	boolean method12128() {
		return ((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031 != null;
	}

	boolean method12130() {
		if ((((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8472) && ((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8365 && ((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8312) {
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031 = new Class158_Sub1_Sub4(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10038 = new Class137_Sub1((((Class282_Sub5_Sub1) this).aClass505_Sub1_7507), 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10038.method14445(false, false);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10034 = new Class137_Sub1((((Class282_Sub5_Sub1) this).aClass505_Sub1_7507), 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10034.method14445(false, false);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, -894627004);
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method13759(0, ((Class282_Sub5_Sub1) this).aClass137_Sub1_10038.method14441(0));
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method13759(1, ((Class282_Sub5_Sub1) this).aClass137_Sub1_10034.method14441(0));
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
			if (!((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method13764()) {
				((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, (byte) -73);
				return false;
			}
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, (byte) -78);
			((Class282_Sub5_Sub1) this).aClass128_10043 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507,
					(new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class282_Sub5_Sub1) this).aClass128_10042 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, (new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class282_Sub5_Sub1) this).aClass128_10041 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, (new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class282_Sub5_Sub1) this).aClass128_10023 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, (new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632,
					"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class282_Sub5_Sub1) this).aClass128_10042 != null && ((Class282_Sub5_Sub1) this).aClass128_10043 != null && ((Class282_Sub5_Sub1) this).aClass128_10041 != null && ((Class282_Sub5_Sub1) this).aClass128_10023 != null);
		}
		return false;
	}

	boolean method12131() {
		if ((((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8472) && ((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8365 && ((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8312) {
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031 = new Class158_Sub1_Sub4(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10038 = new Class137_Sub1((((Class282_Sub5_Sub1) this).aClass505_Sub1_7507), 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10038.method14445(false, false);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10034 = new Class137_Sub1((((Class282_Sub5_Sub1) this).aClass505_Sub1_7507), 3553, Class150.aClass150_1949, Class76.aClass76_755, 256, 256);
			((Class282_Sub5_Sub1) this).aClass137_Sub1_10034.method14445(false, false);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, -1603683082);
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method13759(0, ((Class282_Sub5_Sub1) this).aClass137_Sub1_10038.method14441(0));
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method13759(1, ((Class282_Sub5_Sub1) this).aClass137_Sub1_10034.method14441(0));
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
			if (!((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method13764()) {
				((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, (byte) -117);
				return false;
			}
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, (byte) -112);
			((Class282_Sub5_Sub1) this).aClass128_10043 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507,
					(new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class282_Sub5_Sub1) this).aClass128_10042 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, (new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class282_Sub5_Sub1) this).aClass128_10041 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, (new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632,
					"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") })));
			((Class282_Sub5_Sub1) this).aClass128_10023 = (Class128.method2174(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, (new Class140[] { Class140.method2393(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507, 35632,
					"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class282_Sub5_Sub1) this).aClass128_10042 != null && ((Class282_Sub5_Sub1) this).aClass128_10043 != null && ((Class282_Sub5_Sub1) this).aClass128_10041 != null && ((Class282_Sub5_Sub1) this).aClass128_10023 != null);
		}
		return false;
	}

	void method12132(int i, int i_23_) {
		((Class282_Sub5_Sub1) this).anInt10036 = i;
		((Class282_Sub5_Sub1) this).anInt10037 = i_23_;
		int i_24_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10036, 1717079101);
		int i_25_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10037, 1773583587);
		if (((Class282_Sub5_Sub1) this).anInt10039 != i_24_ || ((Class282_Sub5_Sub1) this).anInt10033 != i_25_) {
			if (((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 != null) {
				for (int i_26_ = 0; i_26_ < (((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028).length; i_26_++)
					((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_26_].method2355();
				((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 = null;
			}
			if (i_24_ > 256 || i_25_ > 256) {
				int i_27_ = i_24_;
				int i_28_ = i_25_;
				int i_29_ = 0;
				while (i_27_ > 256 || i_28_ > 256) {
					if (i_27_ > 256)
						i_27_ >>= 1;
					if (i_28_ > 256)
						i_28_ >>= 1;
					i_29_++;
				}
				if (((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032 == null)
					((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032 = new Class158_Sub1_Sub4(((Class282_Sub5_Sub1) this).aClass505_Sub1_7507);
				((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 = new Class137_Sub1[i_29_];
				i_27_ = i_24_;
				i_28_ = i_25_;
				i_29_ = 0;
				while (i_27_ > 256 || i_28_ > 256) {
					((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_29_++] = new Class137_Sub1((((Class282_Sub5_Sub1) this).aClass505_Sub1_7507), 3553, Class150.aClass150_1949, Class76.aClass76_755, i_27_, i_28_);
					if (i_27_ > 256)
						i_27_ >>= 1;
					if (i_28_ > 256)
						i_28_ >>= 1;
				}
			} else
				((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032 = null;
			((Class282_Sub5_Sub1) this).anInt10039 = i_24_;
			((Class282_Sub5_Sub1) this).anInt10033 = i_25_;
		}
	}

	void method12120() {
		((Class282_Sub5_Sub1) this).anInt10033 = -1;
		((Class282_Sub5_Sub1) this).anInt10039 = -1;
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032 = null;
		((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 = null;
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031 = null;
		((Class282_Sub5_Sub1) this).aClass137_Sub1_10038 = null;
		((Class282_Sub5_Sub1) this).aClass137_Sub1_10034 = null;
		((Class282_Sub5_Sub1) this).aClass128_10043 = null;
		((Class282_Sub5_Sub1) this).aClass128_10042 = null;
		((Class282_Sub5_Sub1) this).aClass128_10041 = null;
		((Class282_Sub5_Sub1) this).aClass128_10023 = null;
	}

	Class76 method12137() {
		return Class76.aClass76_755;
	}

	void method12135(int i) {
		OpenGL.glUseProgram(0);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(1);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(null);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(0);
	}

	void method12124() {
		((Class282_Sub5_Sub1) this).anInt10033 = -1;
		((Class282_Sub5_Sub1) this).anInt10039 = -1;
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032 = null;
		((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 = null;
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031 = null;
		((Class282_Sub5_Sub1) this).aClass137_Sub1_10038 = null;
		((Class282_Sub5_Sub1) this).aClass137_Sub1_10034 = null;
		((Class282_Sub5_Sub1) this).aClass128_10043 = null;
		((Class282_Sub5_Sub1) this).aClass128_10042 = null;
		((Class282_Sub5_Sub1) this).aClass128_10041 = null;
		((Class282_Sub5_Sub1) this).aClass128_10023 = null;
	}

	boolean method15446() {
		return (((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8472 && ((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8365 && ((Class505_Sub1) (((Class282_Sub5_Sub1) this).aClass505_Sub1_7507)).aBool8312);
	}

	boolean method15447() {
		return (((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8472 && ((Class505_Sub1) ((Class282_Sub5_Sub1) this).aClass505_Sub1_7507).aBool8365 && ((Class505_Sub1) (((Class282_Sub5_Sub1) this).aClass505_Sub1_7507)).aBool8312);
	}

	void method12133(int i, Class137_Sub1 class137_sub1, Class137_Sub1 class137_sub1_30_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028 != null) {
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032, 751227201);
			int i_31_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10036, 1146707958);
			int i_32_ = Class51.method1072(((Class282_Sub5_Sub1) this).anInt10037, 1448622378);
			int i_33_ = 0;
			while (i_31_ > 256 || i_32_ > 256) {
				OpenGL.glViewport(0, 0, i_31_, i_32_);
				((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032.method13759(0, ((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_33_].method14441(0));
				if (i_33_ == 0) {
					((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(class137_sub1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (((Class282_Sub5_Sub1) this).anInt10036), 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (((Class282_Sub5_Sub1) this).anInt10036), (float) (((Class282_Sub5_Sub1) this).anInt10037));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class282_Sub5_Sub1) this).anInt10037));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_33_ - 1]);
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
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10032, (byte) -62);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1Array10028[i_33_ - 1]);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, 1797681002);
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_34_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10042).anInt1583);
			OpenGL.glUseProgram(i_34_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_34_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_34_, "params"), aFloat10026, 0.0F, 0.0F);
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
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(class137_sub1);
			((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8637(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, 1101521833);
			((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_35_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10043).anInt1583);
			OpenGL.glUseProgram(i_35_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_35_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_35_, "params"), aFloat10026, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) ((Class282_Sub5_Sub1) this).anInt10036, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) ((Class282_Sub5_Sub1) this).anInt10036, (float) (((Class282_Sub5_Sub1) this).anInt10037));
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) (((Class282_Sub5_Sub1) this).anInt10037));
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(1);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1_10038);
		int i_36_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10023).anInt1583);
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
		((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031.method15628(0);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1_10034);
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
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method8416(((Class282_Sub5_Sub1) this).aClass158_Sub1_Sub4_10031, (byte) -14);
		int i_37_ = (((Class128) ((Class282_Sub5_Sub1) this).aClass128_10041).anInt1583);
		OpenGL.glUseProgram(i_37_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_37_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_37_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_37_, "params"), aFloat10024, aFloat10025, 0.0F);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(1);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(((Class282_Sub5_Sub1) this).aClass137_Sub1_10038);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13610(0);
		((Class282_Sub5_Sub1) this).aClass505_Sub1_7507.method13654(class137_sub1);
	}
}
