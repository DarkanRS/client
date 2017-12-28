
/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class164 {
	Class128 aClass128_2032;
	Class505_Sub1 aClass505_Sub1_2033;
	static final String aString2034 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

	boolean method2846(Class137_Sub4 class137_sub4, Class137_Sub4 class137_sub4_0_, float f) {
		if (!method2847())
			return false;
		Class158_Sub1_Sub4 class158_sub1_sub4 = (((Class505_Sub1) ((Class164) this).aClass505_Sub1_2033).aClass158_Sub1_Sub4_8493);
		Class282_Sub50_Sub19 class282_sub50_sub19 = new Class282_Sub50_Sub19(((Class164) this).aClass505_Sub1_2033, Class150.aClass150_1949, Class76.aClass76_751, (((Class137_Sub4) class137_sub4).anInt9116), (((Class137_Sub4) class137_sub4).anInt9117));
		boolean bool = false;
		((Class164) this).aClass505_Sub1_2033.method8637(class158_sub1_sub4, -967603598);
		class158_sub1_sub4.method13759(0, class282_sub50_sub19);
		if (class158_sub1_sub4.method13764()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, ((Class137_Sub4) class137_sub4).anInt9116, ((Class137_Sub4) class137_sub4).anInt9117);
			OpenGL.glUseProgram(((Class128) ((Class164) this).aClass128_2032).anInt1583);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class128) (((Class164) this).aClass128_2032)).anInt1583), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class128) (((Class164) this).aClass128_2032)).anInt1583), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((((Class128) (((Class164) this).aClass128_2032)).anInt1583), "sampleSize"), 1.0F / (float) ((Class137_Sub4) class137_sub4_0_).anInt9116, 1.0F / (float) ((Class137_Sub4) class137_sub4_0_).anInt9117);
			for (int i = 0; i < ((Class137_Sub4) class137_sub4).anInt9118; i++) {
				float f_1_ = ((float) i / (float) ((Class137_Sub4) class137_sub4).anInt9118);
				((Class164) this).aClass505_Sub1_2033.method13654(class137_sub4_0_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class137_sub4.method14465(0, 0, i, ((Class137_Sub4) class137_sub4).anInt9116, ((Class137_Sub4) class137_sub4).anInt9117, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class158_sub1_sub4.method13759(0, null);
		((Class164) this).aClass505_Sub1_2033.method8416(class158_sub1_sub4, (byte) -42);
		return bool;
	}

	boolean method2847() {
		if (((Class505_Sub1) ((Class164) this).aClass505_Sub1_2033).aBool8472 && (((Class505_Sub1) ((Class164) this).aClass505_Sub1_2033).aBool8365) && ((Class164) this).aClass128_2032 == null) {
			Class140 class140 = (Class140.method2393(((Class164) this).aClass505_Sub1_2033, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class140 != null)
				((Class164) this).aClass128_2032 = Class128.method2174((((Class164) this).aClass505_Sub1_2033), new Class140[] { class140 });
		}
		return ((Class164) this).aClass128_2032 != null;
	}

	boolean method2848(Class137_Sub4 class137_sub4, Class137_Sub4 class137_sub4_2_, float f) {
		if (!method2847())
			return false;
		Class158_Sub1_Sub4 class158_sub1_sub4 = (((Class505_Sub1) ((Class164) this).aClass505_Sub1_2033).aClass158_Sub1_Sub4_8493);
		Class282_Sub50_Sub19 class282_sub50_sub19 = new Class282_Sub50_Sub19(((Class164) this).aClass505_Sub1_2033, Class150.aClass150_1949, Class76.aClass76_751, (((Class137_Sub4) class137_sub4).anInt9116), (((Class137_Sub4) class137_sub4).anInt9117));
		boolean bool = false;
		((Class164) this).aClass505_Sub1_2033.method8637(class158_sub1_sub4, 1347401334);
		class158_sub1_sub4.method13759(0, class282_sub50_sub19);
		if (class158_sub1_sub4.method13764()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, ((Class137_Sub4) class137_sub4).anInt9116, ((Class137_Sub4) class137_sub4).anInt9117);
			OpenGL.glUseProgram(((Class128) ((Class164) this).aClass128_2032).anInt1583);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class128) (((Class164) this).aClass128_2032)).anInt1583), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class128) (((Class164) this).aClass128_2032)).anInt1583), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((((Class128) (((Class164) this).aClass128_2032)).anInt1583), "sampleSize"), 1.0F / (float) ((Class137_Sub4) class137_sub4_2_).anInt9116, 1.0F / (float) ((Class137_Sub4) class137_sub4_2_).anInt9117);
			for (int i = 0; i < ((Class137_Sub4) class137_sub4).anInt9118; i++) {
				float f_3_ = ((float) i / (float) ((Class137_Sub4) class137_sub4).anInt9118);
				((Class164) this).aClass505_Sub1_2033.method13654(class137_sub4_2_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_3_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_3_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_3_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_3_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class137_sub4.method14465(0, 0, i, ((Class137_Sub4) class137_sub4).anInt9116, ((Class137_Sub4) class137_sub4).anInt9117, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class158_sub1_sub4.method13759(0, null);
		((Class164) this).aClass505_Sub1_2033.method8416(class158_sub1_sub4, (byte) -74);
		return bool;
	}

	boolean method2849() {
		if (((Class505_Sub1) ((Class164) this).aClass505_Sub1_2033).aBool8472 && (((Class505_Sub1) ((Class164) this).aClass505_Sub1_2033).aBool8365) && ((Class164) this).aClass128_2032 == null) {
			Class140 class140 = (Class140.method2393(((Class164) this).aClass505_Sub1_2033, 35632,
					"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class140 != null)
				((Class164) this).aClass128_2032 = Class128.method2174((((Class164) this).aClass505_Sub1_2033), new Class140[] { class140 });
		}
		return ((Class164) this).aClass128_2032 != null;
	}

	Class164(Class505_Sub1 class505_sub1) {
		((Class164) this).aClass505_Sub1_2033 = class505_sub1;
	}

	boolean method2850(Class137_Sub4 class137_sub4, Class137_Sub4 class137_sub4_4_, float f) {
		if (!method2847())
			return false;
		Class158_Sub1_Sub4 class158_sub1_sub4 = (((Class505_Sub1) ((Class164) this).aClass505_Sub1_2033).aClass158_Sub1_Sub4_8493);
		Class282_Sub50_Sub19 class282_sub50_sub19 = new Class282_Sub50_Sub19(((Class164) this).aClass505_Sub1_2033, Class150.aClass150_1949, Class76.aClass76_751, (((Class137_Sub4) class137_sub4).anInt9116), (((Class137_Sub4) class137_sub4).anInt9117));
		boolean bool = false;
		((Class164) this).aClass505_Sub1_2033.method8637(class158_sub1_sub4, -1230149683);
		class158_sub1_sub4.method13759(0, class282_sub50_sub19);
		if (class158_sub1_sub4.method13764()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, ((Class137_Sub4) class137_sub4).anInt9116, ((Class137_Sub4) class137_sub4).anInt9117);
			OpenGL.glUseProgram(((Class128) ((Class164) this).aClass128_2032).anInt1583);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class128) (((Class164) this).aClass128_2032)).anInt1583), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class128) (((Class164) this).aClass128_2032)).anInt1583), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((((Class128) (((Class164) this).aClass128_2032)).anInt1583), "sampleSize"), 1.0F / (float) ((Class137_Sub4) class137_sub4_4_).anInt9116, 1.0F / (float) ((Class137_Sub4) class137_sub4_4_).anInt9117);
			for (int i = 0; i < ((Class137_Sub4) class137_sub4).anInt9118; i++) {
				float f_5_ = ((float) i / (float) ((Class137_Sub4) class137_sub4).anInt9118);
				((Class164) this).aClass505_Sub1_2033.method13654(class137_sub4_4_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_5_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_5_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_5_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_5_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class137_sub4.method14465(0, 0, i, ((Class137_Sub4) class137_sub4).anInt9116, ((Class137_Sub4) class137_sub4).anInt9117, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class158_sub1_sub4.method13759(0, null);
		((Class164) this).aClass505_Sub1_2033.method8416(class158_sub1_sub4, (byte) -87);
		return bool;
	}
}
