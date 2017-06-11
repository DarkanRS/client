/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class49 {
	Class_ra_Sub2 aClass_ra_Sub2_497;
	Class29 aClass29_498;
	static String aString499 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

	boolean method527(Class30_Sub4 class30_sub4, Class30_Sub4 class30_sub4_0_, float f) {
		if (!method528())
			return false;
		Class52_Sub1_Sub2 class52_sub1_sub2 = (((Class_ra_Sub2) ((Class49) this).aClass_ra_Sub2_497).aClass52_Sub1_Sub2_8148);
		Class298_Sub37_Sub18 class298_sub37_sub18 = new Class298_Sub37_Sub18(((Class49) this).aClass_ra_Sub2_497, Class55.aClass55_557, Class77.aClass77_717, ((Class30_Sub4) class30_sub4).anInt6750, (((Class30_Sub4) class30_sub4).anInt6751));
		boolean bool = false;
		((Class49) this).aClass_ra_Sub2_497.method5143(class52_sub1_sub2, (byte) 27);
		class52_sub1_sub2.method563(0, class298_sub37_sub18);
		if (class52_sub1_sub2.method560()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, ((Class30_Sub4) class30_sub4).anInt6750, ((Class30_Sub4) class30_sub4).anInt6751);
			OpenGL.glUseProgram(((Class29) ((Class49) this).aClass29_498).anInt365);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class29) (((Class49) this).aClass29_498)).anInt365), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class29) (((Class49) this).aClass29_498)).anInt365), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((((Class29) ((Class49) this).aClass29_498).anInt365), "sampleSize"), 1.0F / (float) ((Class30_Sub4) class30_sub4_0_).anInt6750, 1.0F / (float) ((Class30_Sub4) class30_sub4_0_).anInt6751);
			for (int i = 0; i < ((Class30_Sub4) class30_sub4).anInt6749; i++) {
				float f_1_ = ((float) i / (float) ((Class30_Sub4) class30_sub4).anInt6749);
				((Class49) this).aClass_ra_Sub2_497.method5256(class30_sub4_0_);
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
				class30_sub4.method431(0, 0, i, ((Class30_Sub4) class30_sub4).anInt6750, ((Class30_Sub4) class30_sub4).anInt6751, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class52_sub1_sub2.method563(0, null);
		((Class49) this).aClass_ra_Sub2_497.method5005(class52_sub1_sub2, (byte) 7);
		return bool;
	}

	boolean method528() {
		if (((Class_ra_Sub2) ((Class49) this).aClass_ra_Sub2_497).aBoolean8170 && (((Class_ra_Sub2) ((Class49) this).aClass_ra_Sub2_497).aBoolean8093) && ((Class49) this).aClass29_498 == null) {
			Class48 class48 = (Class48
					.method526(
							((Class49) this).aClass_ra_Sub2_497,
							35632,
							"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class48 != null)
				((Class49) this).aClass29_498 = Class29.method406(((Class49) this).aClass_ra_Sub2_497, new Class48[] { class48 });
		}
		return ((Class49) this).aClass29_498 != null;
	}

	Class49(Class_ra_Sub2 class_ra_sub2) {
		((Class49) this).aClass_ra_Sub2_497 = class_ra_sub2;
	}
}
